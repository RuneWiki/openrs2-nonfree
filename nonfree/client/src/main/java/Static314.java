import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!mba", name = "N", descriptor = "I")
	public static int anInt8006;

	@OriginalMember(owner = "client!mba", name = "F", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_143 = new Class254(0, 5);

	@OriginalMember(owner = "client!mba", name = "P", descriptor = "I")
	public static final int anInt8007 = 1405;

	@OriginalMember(owner = "client!mba", name = "S", descriptor = "[I")
	public static final int[] anIntArray573 = new int[5];

	@OriginalMember(owner = "client!mba", name = "T", descriptor = "I")
	public static int anInt8010 = 0;

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "(B)V")
	public static void method6696() {
		@Pc(14) int local14 = Static345.aClass6_Sub26_Sub2_1.method4957();
		@Pc(18) int local18 = Static345.aClass6_Sub26_Sub2_1.method4988();
		anInt8010 = Static345.aClass6_Sub26_Sub2_1.method4978();
		@Pc(26) int local26 = Static345.aClass6_Sub26_Sub2_1.method4957();
		@Pc(35) boolean local35 = Static345.aClass6_Sub26_Sub2_1.method4988() == 1;
		Static145.method2678();
		Static86.method1939(local18);
		Static345.aClass6_Sub26_Sub2_1.method5002();
		@Pc(49) int local49;
		@Pc(53) int local53;
		@Pc(60) int local60;
		for (@Pc(45) int local45 = 0; local45 < 4; local45++) {
			for (local49 = 0; local49 < Static228.anInt4746 >> 3; local49++) {
				for (local53 = 0; local53 < Static44.anInt1275 >> 3; local53++) {
					local60 = Static345.aClass6_Sub26_Sub2_1.method5008(1);
					if (local60 == 1) {
						Static154.anIntArrayArrayArray3[local45][local49][local53] = Static345.aClass6_Sub26_Sub2_1.method5008(26);
					} else {
						Static154.anIntArrayArrayArray3[local45][local49][local53] = -1;
					}
				}
			}
		}
		Static345.aClass6_Sub26_Sub2_1.method5006();
		local49 = (Static462.anInt8534 - Static345.aClass6_Sub26_Sub2_1.anInt5769) / 16;
		Static388.anIntArrayArray49 = new int[local49][4];
		for (local53 = 0; local53 < local49; local53++) {
			for (local60 = 0; local60 < 4; local60++) {
				Static388.anIntArrayArray49[local53][local60] = Static345.aClass6_Sub26_Sub2_1.method5000();
			}
		}
		Static341.anIntArray470 = new int[local49];
		Static69.aByteArrayArray5 = null;
		Static22.aByteArrayArray1 = new byte[local49][];
		Static224.anIntArray302 = new int[local49];
		Static325.aByteArrayArray21 = new byte[local49][];
		Static61.aByteArrayArray4 = new byte[local49][];
		Static204.anIntArray282 = new int[local49];
		Static422.anIntArray560 = new int[local49];
		Static150.anIntArray523 = null;
		Static74.aByteArrayArray30 = new byte[local49][];
		Static106.anIntArray185 = new int[local49];
		local49 = 0;
		for (local60 = 0; local60 < 4; local60++) {
			for (@Pc(187) int local187 = 0; local187 < Static228.anInt4746 >> 3; local187++) {
				for (@Pc(191) int local191 = 0; local191 < Static44.anInt1275 >> 3; local191++) {
					@Pc(201) int local201 = Static154.anIntArrayArrayArray3[local60][local187][local191];
					if (local201 != -1) {
						@Pc(210) int local210 = local201 >> 14 & 0x3FF;
						@Pc(216) int local216 = local201 >> 3 & 0x7FF;
						@Pc(226) int local226 = local216 / 8 + (local210 / 8 << 8);
						for (@Pc(228) int local228 = 0; local228 < local49; local228++) {
							if (local226 == Static341.anIntArray470[local228]) {
								local226 = -1;
								break;
							}
						}
						if (local226 != -1) {
							Static341.anIntArray470[local49] = local226;
							@Pc(261) int local261 = local226 >> 8 & 0xFF;
							@Pc(265) int local265 = local226 & 0xFF;
							Static106.anIntArray185[local49] = Static257.aClass168_64.method4432("m" + local261 + "_" + local265);
							Static204.anIntArray282[local49] = Static257.aClass168_64.method4432("l" + local261 + "_" + local265);
							Static224.anIntArray302[local49] = Static257.aClass168_64.method4432("um" + local261 + "_" + local265);
							Static422.anIntArray560[local49] = Static257.aClass168_64.method4432("ul" + local261 + "_" + local265);
							local49++;
						}
					}
				}
			}
		}
		Static120.method2369(local26, local35, local14, 11);
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILjava/awt/Component;)Lclient!ws;")
	public static Class273 method6697(@OriginalArg(1) Component arg0) {
		return new Class273_Sub1(arg0);
	}
}
