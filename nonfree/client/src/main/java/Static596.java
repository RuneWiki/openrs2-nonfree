import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!uv", name = "w", descriptor = "Lclient!fh;")
	public static final Class114 aClass114_59 = new Class114();

	@OriginalMember(owner = "client!uv", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString105 = null;

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)V")
	public static void method8399() {
		@Pc(9) int local9 = Static327.aClass2_Sub17_Sub1_1.method2854();
		@Pc(18) boolean local18 = Static327.aClass2_Sub17_Sub1_1.method2888() == 1;
		@Pc(22) int local22 = Static327.aClass2_Sub17_Sub1_1.method2865();
		@Pc(26) int local26 = Static327.aClass2_Sub17_Sub1_1.method2863();
		Static376.anInt6481 = Static327.aClass2_Sub17_Sub1_1.method2842();
		Static150.method2653();
		Static33.method733(local22);
		Static327.aClass2_Sub17_Sub1_1.method2461();
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(55) int local55;
		for (@Pc(40) int local40 = 0; local40 < 4; local40++) {
			for (local44 = 0; local44 < Static456.anInt7428 >> 3; local44++) {
				for (local48 = 0; local48 < Static5.anInt112 >> 3; local48++) {
					local55 = Static327.aClass2_Sub17_Sub1_1.method2456(1);
					if (local55 == 1) {
						Static584.anIntArrayArrayArray18[local40][local44][local48] = Static327.aClass2_Sub17_Sub1_1.method2456(26);
					} else {
						Static584.anIntArrayArrayArray18[local40][local44][local48] = -1;
					}
				}
			}
		}
		Static327.aClass2_Sub17_Sub1_1.method2455();
		local44 = (Static245.anInt4755 - Static327.aClass2_Sub17_Sub1_1.anInt3378) / 16;
		Static28.anIntArrayArray115 = new int[local44][4];
		for (local48 = 0; local48 < local44; local48++) {
			for (local55 = 0; local55 < 4; local55++) {
				Static28.anIntArrayArray115[local48][local55] = Static327.aClass2_Sub17_Sub1_1.method2881();
			}
		}
		Static461.anIntArray517 = null;
		Static87.anIntArray158 = new int[local44];
		Static291.aByteArrayArray14 = new byte[local44][];
		Static635.anIntArray728 = new int[local44];
		Static555.anIntArray663 = new int[local44];
		Static80.anIntArray148 = new int[local44];
		Static326.anIntArray366 = new int[local44];
		Static187.aByteArrayArray8 = new byte[local44][];
		Static641.aByteArrayArray27 = new byte[local44][];
		Static94.aByteArrayArray5 = new byte[local44][];
		Static502.aByteArrayArray26 = null;
		local44 = 0;
		for (local55 = 0; local55 < 4; local55++) {
			for (@Pc(186) int local186 = 0; local186 < Static456.anInt7428 >> 3; local186++) {
				for (@Pc(190) int local190 = 0; local190 < Static5.anInt112 >> 3; local190++) {
					@Pc(200) int local200 = Static584.anIntArrayArrayArray18[local55][local186][local190];
					if (local200 != -1) {
						@Pc(209) int local209 = local200 >> 14 & 0x3FF;
						@Pc(215) int local215 = local200 >> 3 & 0x7FF;
						@Pc(226) int local226 = (local209 / 8 << 8) + (local215 / 8);
						for (@Pc(228) int local228 = 0; local228 < local44; local228++) {
							if (local226 == Static635.anIntArray728[local228]) {
								local226 = -1;
								break;
							}
						}
						if (local226 != -1) {
							Static635.anIntArray728[local44] = local226;
							@Pc(261) int local261 = local226 >> 8 & 0xFF;
							@Pc(265) int local265 = local226 & 0xFF;
							Static87.anIntArray158[local44] = Static122.aClass238_58.method5575("m" + local261 + "_" + local265);
							Static326.anIntArray366[local44] = Static122.aClass238_58.method5575("l" + local261 + "_" + local265);
							Static80.anIntArray148[local44] = Static122.aClass238_58.method5575("um" + local261 + "_" + local265);
							Static555.anIntArray663[local44] = Static122.aClass238_58.method5575("ul" + local261 + "_" + local265);
							local44++;
						}
					}
				}
			}
		}
		Static183.method3129(local18, local9, 11, local26);
	}

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(III)Z")
	public static boolean method8400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(25) boolean local25 = (arg1 & 0x37) == 0 ? Static591.method8346(arg0, arg1) : Static508.method7063(arg1, arg0);
		return Static457.method7542(arg1, arg0) | (arg0 & 0x10000) != 0 | local25;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I[BILclient!bi;IIIZ)Lclient!baa;")
	public static Class10_Sub2_Sub1 method8401(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13_Sub2 arg2, @OriginalArg(6) int arg3) {
		if (arg2.aBoolean93 || Static608.method8539(arg3) && Static608.method8539(arg1)) {
			return new Class10_Sub2_Sub1(arg2, 3553, 6406, arg3, arg1, false, arg0, 6406);
		} else if (arg2.aBoolean95) {
			return new Class10_Sub2_Sub1(arg2, 34037, 6406, arg3, arg1, false, arg0, 6406);
		} else {
			return new Class10_Sub2_Sub1(arg2, 6406, arg3, arg1, Static613.method8565(arg3), Static613.method8565(arg1), arg0, 6406);
		}
	}
}
