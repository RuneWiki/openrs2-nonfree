import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
	public static int anInt728;

	@OriginalMember(owner = "client!bp", name = "b", descriptor = "[I")
	public static final int[] anIntArray34 = new int[4096];

	@OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
	public static int anInt727 = 0;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
	public static void method618() {
		@Pc(9) int local9 = Static76.aClass5_Sub15_Sub2_1.method5591();
		Static148.anInt2668 = Static76.aClass5_Sub15_Sub2_1.method5539();
		@Pc(17) int local17 = Static76.aClass5_Sub15_Sub2_1.method5578();
		@Pc(21) int local21 = Static76.aClass5_Sub15_Sub2_1.method5593();
		@Pc(32) boolean local32 = Static76.aClass5_Sub15_Sub2_1.method5594() == 1;
		Static267.method3706();
		Static82.method1222(local17);
		Static76.aClass5_Sub15_Sub2_1.method5605();
		@Pc(56) int local56;
		@Pc(60) int local60;
		@Pc(67) int local67;
		for (@Pc(44) int local44 = 0; local44 < 4; local44++) {
			for (local56 = 0; local56 < Static433.anInt7210 >> 3; local56++) {
				for (local60 = 0; local60 < Static418.anInt6969 >> 3; local60++) {
					local67 = Static76.aClass5_Sub15_Sub2_1.method5610(1);
					if (local67 == 1) {
						Static403.anIntArrayArrayArray16[local44][local56][local60] = Static76.aClass5_Sub15_Sub2_1.method5610(26);
					} else {
						Static403.anIntArrayArrayArray16[local44][local56][local60] = -1;
					}
				}
			}
		}
		Static76.aClass5_Sub15_Sub2_1.method5612();
		local56 = (Static128.anInt2223 - Static76.aClass5_Sub15_Sub2_1.anInt7013) / 16;
		Static113.anIntArrayArray11 = new int[local56][4];
		for (local60 = 0; local60 < local56; local60++) {
			for (local67 = 0; local67 < 4; local67++) {
				Static113.anIntArrayArray11[local60][local67] = Static76.aClass5_Sub15_Sub2_1.method5603();
			}
		}
		Static149.anIntArray139 = new int[local56];
		Static48.aByteArrayArray3 = new byte[local56][];
		Static393.anIntArray330 = new int[local56];
		Static319.anIntArray372 = null;
		Static398.anIntArray459 = new int[local56];
		Static160.aByteArrayArray7 = new byte[local56][];
		Static415.aByteArrayArray19 = new byte[local56][];
		Static362.anIntArray418 = new int[local56];
		Static415.aByteArrayArray18 = null;
		Static404.anIntArray465 = new int[local56];
		Static191.aByteArrayArray9 = new byte[local56][];
		local56 = 0;
		for (local67 = 0; local67 < 4; local67++) {
			for (@Pc(187) int local187 = 0; local187 < Static433.anInt7210 >> 3; local187++) {
				for (@Pc(191) int local191 = 0; local191 < Static418.anInt6969 >> 3; local191++) {
					@Pc(201) int local201 = Static403.anIntArrayArrayArray16[local67][local187][local191];
					if (local201 != -1) {
						@Pc(211) int local211 = local201 >> 14 & 0x3FF;
						@Pc(217) int local217 = local201 >> 3 & 0x7FF;
						@Pc(227) int local227 = local217 / 8 + (local211 / 8 << 8);
						for (@Pc(229) int local229 = 0; local229 < local56; local229++) {
							if (local227 == Static362.anIntArray418[local229]) {
								local227 = -1;
								break;
							}
						}
						if (local227 != -1) {
							Static362.anIntArray418[local56] = local227;
							@Pc(261) int local261 = local227 >> 8 & 0xFF;
							@Pc(265) int local265 = local227 & 0xFF;
							Static149.anIntArray139[local56] = Static71.aClass243_255.method5461("m" + local261 + "_" + local265);
							Static393.anIntArray330[local56] = Static71.aClass243_255.method5461("l" + local261 + "_" + local265);
							Static398.anIntArray459[local56] = Static71.aClass243_255.method5461("um" + local261 + "_" + local265);
							Static404.anIntArray465[local56] = Static71.aClass243_255.method5461("ul" + local261 + "_" + local265);
							local56++;
						}
					}
				}
			}
		}
		Static36.method615(local32, 10, local21, local9);
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)V")
	public static void method619() {
		@Pc(5) Class44 local5 = Static74.aClass44_9;
		synchronized (Static74.aClass44_9) {
			Static74.aClass44_9.method1025(5);
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(BLclient!um;I)Lclient!uj;")
	public static Class5_Sub42 method621(@OriginalArg(1) Class243 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) byte[] local8 = arg0.method5459(arg1);
		return local8 == null ? null : new Class5_Sub42(local8);
	}
}
