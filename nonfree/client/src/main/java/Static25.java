import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "Lclient!cq;")
	public static Class53 aClass53_6;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "Lclient!ff;")
	public static Class88 aClass88_1;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "Lclient!qda;")
	public static final Class243 aClass243_5 = new Class243();

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "Lclient!sd;")
	public static final Class267 aClass267_1 = new Class267(16);

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
	public static final int anInt757 = 1338;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
	public static int anInt758 = 0;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIII)V")
	public static void method783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14 = Static7.aClass3_Sub15_Sub1_1.anInt8382 * arg0 >> 8;
		if (arg2 == -1 && !Static432.aBoolean563) {
			Static324.method5203();
		} else if (arg2 != -1 && (Static506.anInt8842 != arg2 || !Static142.method2467()) && local14 != 0 && !Static432.aBoolean563) {
			Static409.method6185(local14, arg2, Static460.aClass161_42, arg1);
		}
		Static506.anInt8842 = arg2;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
	public static void method784() {
		@Pc(9) int local9 = Static90.aClass3_Sub27_Sub1_1.method7561();
		@Pc(13) int local13 = Static90.aClass3_Sub27_Sub1_1.method7591();
		@Pc(26) boolean local26 = Static90.aClass3_Sub27_Sub1_1.method7548() == 1;
		@Pc(30) int local30 = Static90.aClass3_Sub27_Sub1_1.method7568();
		Static318.anInt5230 = Static90.aClass3_Sub27_Sub1_1.method7580();
		Static347.method5529();
		Static520.method7395(local9);
		Static90.aClass3_Sub27_Sub1_1.method4533();
		@Pc(50) int local50;
		@Pc(54) int local54;
		@Pc(61) int local61;
		for (@Pc(46) int local46 = 0; local46 < 4; local46++) {
			for (local50 = 0; local50 < Static118.anInt2527 >> 3; local50++) {
				for (local54 = 0; local54 < Static549.anInt9482 >> 3; local54++) {
					local61 = Static90.aClass3_Sub27_Sub1_1.method4536(1);
					if (local61 == 1) {
						Static109.anIntArrayArrayArray4[local46][local50][local54] = Static90.aClass3_Sub27_Sub1_1.method4536(26);
					} else {
						Static109.anIntArrayArrayArray4[local46][local50][local54] = -1;
					}
				}
			}
		}
		Static90.aClass3_Sub27_Sub1_1.method4535();
		local50 = (Static35.anInt921 - Static90.aClass3_Sub27_Sub1_1.anInt9191) / 16;
		Static523.anIntArrayArray87 = new int[local50][4];
		for (local54 = 0; local54 < local50; local54++) {
			for (local61 = 0; local61 < 4; local61++) {
				Static523.anIntArrayArray87[local54][local61] = Static90.aClass3_Sub27_Sub1_1.method7549();
			}
		}
		Static467.anIntArray715 = new int[local50];
		Static521.aByteArrayArray29 = null;
		Static328.aByteArrayArray17 = new byte[local50][];
		Static112.anIntArray658 = new int[local50];
		Static165.anIntArray376 = null;
		Static330.anIntArray546 = new int[local50];
		Static343.aByteArrayArray18 = new byte[local50][];
		Static326.aByteArrayArray16 = new byte[local50][];
		Static75.anIntArray738 = new int[local50];
		Static28.anIntArray129 = new int[local50];
		Static457.aByteArrayArray25 = new byte[local50][];
		local50 = 0;
		for (local61 = 0; local61 < 4; local61++) {
			for (@Pc(189) int local189 = 0; local189 < Static118.anInt2527 >> 3; local189++) {
				for (@Pc(193) int local193 = 0; local193 < Static549.anInt9482 >> 3; local193++) {
					@Pc(203) int local203 = Static109.anIntArrayArrayArray4[local61][local189][local193];
					if (local203 != -1) {
						@Pc(212) int local212 = local203 >> 14 & 0x3FF;
						@Pc(218) int local218 = local203 >> 3 & 0x7FF;
						@Pc(228) int local228 = local218 / 8 + (local212 / 8 << 8);
						for (@Pc(230) int local230 = 0; local230 < local50; local230++) {
							if (local228 == Static467.anIntArray715[local230]) {
								local228 = -1;
								break;
							}
						}
						if (local228 != -1) {
							Static467.anIntArray715[local50] = local228;
							@Pc(262) int local262 = local228 >> 8 & 0xFF;
							@Pc(266) int local266 = local228 & 0xFF;
							Static112.anIntArray658[local50] = Static307.aClass161_51.method4240("m" + local262 + "_" + local266);
							Static330.anIntArray546[local50] = Static307.aClass161_51.method4240("l" + local262 + "_" + local266);
							Static28.anIntArray129[local50] = Static307.aClass161_51.method4240("um" + local262 + "_" + local266);
							Static75.anIntArray738[local50] = Static307.aClass161_51.method4240("ul" + local262 + "_" + local266);
							local50++;
						}
					}
				}
			}
		}
		Static49.method1038(local13, local30, 10, local26);
	}
}
