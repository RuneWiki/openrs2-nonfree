import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!vl", name = "o", descriptor = "I")
	public static int anInt5636;

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
	public static int anInt5626 = 0;

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "I")
	public static int anInt5627 = 0;

	@OriginalMember(owner = "client!vl", name = "l", descriptor = "J")
	public static volatile long aLong198 = 0L;

	@OriginalMember(owner = "client!vl", name = "n", descriptor = "Z")
	public static boolean aBoolean390 = false;

	@OriginalMember(owner = "client!vl", name = "q", descriptor = "Z")
	public static boolean aBoolean391 = false;

	@OriginalMember(owner = "client!vl", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString344 = "scroll:";

	@OriginalMember(owner = "client!vl", name = "u", descriptor = "I")
	public static int anInt5638 = 0;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	public static void method4559() {
		Static250.anInt4761 = 0;
		Static213.anInt4195 = 0;
		Static193.method3069();
		Static47.method734();
		Static278.method4335();
		@Pc(17) int local17;
		for (local17 = 0; local17 < Static213.anInt4195; local17++) {
			@Pc(28) int local28 = Static68.anIntArray99[local17];
			if (Static50.anInt954 != Static110.aClass53_Sub1_Sub2Array1[local28].anInt3990) {
				if (Static110.aClass53_Sub1_Sub2Array1[local28].aClass171_1.method4297()) {
					Static181.method2944(Static110.aClass53_Sub1_Sub2Array1[local28]);
				}
				Static110.aClass53_Sub1_Sub2Array1[local28].method3330(null);
				Static110.aClass53_Sub1_Sub2Array1[local28] = null;
			}
		}
		if (Static189.aClass4_Sub10_Sub1_2.anInt5713 != Static21.anInt1052) {
			throw new RuntimeException("gnp1 pos:" + Static189.aClass4_Sub10_Sub1_2.anInt5713 + " psize:" + Static21.anInt1052);
		}
		for (local17 = 0; local17 < Static236.anInt4452; local17++) {
			if (Static110.aClass53_Sub1_Sub2Array1[Static278.anIntArray595[local17]] == null) {
				throw new RuntimeException("gnp2 pos:" + local17 + " size:" + Static236.anInt4452);
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!fh;Lclient!fh;)V")
	public static void method4560(@OriginalArg(1) Class58 arg0, @OriginalArg(2) Class58 arg1) {
		Static105.aClass58_48 = arg0;
		Static235.aClass58_85 = arg1;
		Static7.anInt119 = Static235.aClass58_85.method1371(3);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIII)V")
	public static void method4561(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static94.aBoolean138) {
			Static104.method1694(arg2, arg3, arg1 + arg2, arg0 + arg3);
			Static104.method1702(arg2, arg3, arg1, arg0, 0);
		} else {
			Static270.method4246(arg2, arg3, arg2 + arg1, arg3 + arg0);
			Static270.method4242(arg2, arg3, arg1, arg0, 0);
		}
		if (Static138.anInt2644 < 100) {
			return;
		}
		@Pc(51) float local51 = (float) Static121.anInt2960 / (float) Static121.anInt2965;
		@Pc(57) int local57 = arg1;
		@Pc(59) int local59 = arg0;
		if (local51 < 1.0F) {
			local59 = (int) (local51 * (float) arg1);
		} else {
			local57 = (int) ((float) arg0 / local51);
		}
		@Pc(86) int local86 = arg2 + (arg1 - local57) / 2;
		@Pc(95) int local95 = arg3 + (arg0 - local59) / 2;
		if (Static177.aClass4_Sub3_Sub14_3 == null || arg1 != Static177.aClass4_Sub3_Sub14_3.anInt5610 || arg0 != Static177.aClass4_Sub3_Sub14_3.anInt5609) {
			@Pc(117) Class4_Sub3_Sub14_Sub1 local117 = new Class4_Sub3_Sub14_Sub1(arg1, arg0);
			Static270.method4261(local117.anIntArray241, arg1, arg0);
			if (Static121.aClass4_Sub3_Sub22_3.anInt5999 != -1) {
				Static270.method4242(0, 0, arg1, arg0, Static121.aClass4_Sub3_Sub22_3.anInt5999);
			}
			Static121.method2408(0, 0, Static121.anInt2965, Static121.anInt2960, 0, 0, local57, local59);
			Static121.method2410();
			if (Static94.aBoolean138) {
				Static177.aClass4_Sub3_Sub14_3 = new Class4_Sub3_Sub14_Sub2(local117);
			} else {
				Static177.aClass4_Sub3_Sub14_3 = local117;
			}
			if (Static94.aBoolean138) {
				Static270.anIntArray561 = null;
			} else {
				Static152.aClass59_1.method4281();
			}
		}
		@Pc(166) int local166 = 16711680;
		Static177.aClass4_Sub3_Sub14_3.method4547(local86, local95);
		@Pc(176) int local176 = Static281.anInt5332 * local57 / Static121.anInt2965;
		@Pc(184) int local184 = local95 + local59 * Static187.anInt3546 / Static121.anInt2960;
		@Pc(190) int local190 = Static302.anInt5684 * local59 / Static121.anInt2960;
		if (Static76.anInt5724 == 1) {
			local166 = 16777215;
		}
		@Pc(207) int local207 = local86 + Static131.anInt2542 * local57 / Static121.anInt2965;
		if (Static94.aBoolean138) {
			Static104.method1692(local207, local184, local176, local190, local166, 128);
			Static104.method1691(local207, local184, local176, local190, local166);
		} else {
			Static270.method4250(local207, local184, local176, local190, local166, 128);
			Static270.method4259(local207, local184, local176, local190, local166);
		}
		if (Static145.anInt2853 <= 0) {
			return;
		}
		@Pc(255) int local255;
		if (Static216.anInt4216 > 50) {
			local255 = 500 - Static216.anInt4216 * 5;
		} else {
			local255 = Static216.anInt4216 * 5;
		}
		for (@Pc(266) Class4_Sub3_Sub7 local266 = (Class4_Sub3_Sub7) Static121.aClass178_12.method4369(); local266 != null; local266 = (Class4_Sub3_Sub7) Static121.aClass178_12.method4377()) {
			@Pc(273) Class83 local273 = Static142.method2192(local266.anInt1760);
			if (Static9.method120(local273)) {
				@Pc(290) int local290;
				@Pc(299) int local299;
				if (local266.anInt1760 == Static204.anInt3920) {
					local290 = local57 * local266.anInt1768 / Static121.anInt2965 + local86;
					local299 = local95 + local59 * local266.anInt1769 / Static121.anInt2960;
					if (Static94.aBoolean138) {
						Static104.method1692(local290 - 2, local299 - 2, 4, 4, 16776960, local255);
					} else {
						Static270.method4250(local290 - 2, local299 + -2, 4, 4, 16776960, local255);
					}
				} else if (Static81.anInt1874 != -1 && local273.anInt2284 == Static81.anInt1874) {
					local290 = local86 + local266.anInt1768 * local57 / Static121.anInt2965;
					local299 = local95 + local59 * local266.anInt1769 / Static121.anInt2960;
					if (Static94.aBoolean138) {
						Static104.method1692(local290 - 2, local299 + -2, 4, 4, 16776960, local255);
					} else {
						Static270.method4250(local290 - 2, local299 + -2, 4, 4, 16776960, local255);
					}
				}
			}
		}
	}
}
