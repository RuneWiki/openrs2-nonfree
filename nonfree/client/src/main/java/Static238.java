import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!sd", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray21;

	@OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
	public static int anInt3833;

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
	public static int anInt3834;

	@OriginalMember(owner = "client!sd", name = "k", descriptor = "F")
	public static float aFloat37;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
	public static int anInt3830 = 0;

	@OriginalMember(owner = "client!sd", name = "h", descriptor = "Z")
	public static boolean aBoolean292 = false;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
	public static void method3082() {
		if (Static20.aClass1_Sub2_Sub21_1 == null) {
			return;
		}
		if (Static192.anInt3954 < 10) {
			if (!Static249.aClass91_179.method2491(Static20.aClass1_Sub2_Sub21_1.aString319)) {
				Static192.anInt3954 = Static106.aClass91_88.method2508(Static20.aClass1_Sub2_Sub21_1.aString319) / 10;
				return;
			}
			Static25.method524();
			Static192.anInt3954 = 10;
		}
		if (Static192.anInt3954 == 10) {
			Static264.anInt5177 = Static20.aClass1_Sub2_Sub21_1.anInt5444 >> 6 << 6;
			Static254.anInt4979 = Static20.aClass1_Sub2_Sub21_1.anInt5435 >> 6 << 6;
			Static95.anInt2218 = (Static20.aClass1_Sub2_Sub21_1.anInt5437 >> 6 << 6) + 64 - Static254.anInt4979;
			@Pc(66) int local66 = -1;
			Static164.anInt3508 = (Static20.aClass1_Sub2_Sub21_1.anInt5442 >> 6 << 6) + 64 - Static264.anInt5177;
			@Pc(80) int local80 = -1;
			@Pc(97) int[] local97 = Static20.aClass1_Sub2_Sub21_1.method4288(Static53.anInt5288 + (Static197.aClass14_Sub2_Sub1_2.anInt4680 >> 7), Static83.anInt1875 + (Static197.aClass14_Sub2_Sub1_2.anInt4630 >> 7), Static140.anInt3034);
			if (local97 != null) {
				local66 = local97[1] - Static264.anInt5177;
				local80 = Static254.anInt4979 + Static95.anInt2218 - local97[2] - 1;
			}
			if (local66 >= 0 && Static164.anInt3508 > local66 && local80 >= 0 && local80 < Static95.anInt2218) {
				local66 += (int) (Math.random() * 10.0D) - 5;
				local80 += (int) (Math.random() * 10.0D) - 5;
				Static207.anInt4867 = local80;
				Static88.anInt1962 = local66;
			} else {
				@Pc(160) int[] local160;
				if (Static154.anInt3334 == -1 || Static219.anInt4354 == -1) {
					local160 = Static20.aClass1_Sub2_Sub21_1.method4287(Static20.aClass1_Sub2_Sub21_1.anInt5432 & 0x3FFF, Static20.aClass1_Sub2_Sub21_1.anInt5432 >> 14 & 0x3FFF);
					Static207.anInt4867 = Static254.anInt4979 + Static95.anInt2218 - local160[2] - 1;
					Static88.anInt1962 = local160[1] - Static264.anInt5177;
				} else {
					local160 = Static20.aClass1_Sub2_Sub21_1.method4287(Static219.anInt4354, Static154.anInt3334);
					if (local160 != null) {
						Static207.anInt4867 = Static254.anInt4979 + Static95.anInt2218 - local160[2] - 1;
						Static88.anInt1962 = local160[1] - Static264.anInt5177;
					}
					Static219.anInt4354 = -1;
					Static154.anInt3334 = -1;
				}
			}
			if (Static20.aClass1_Sub2_Sub21_1.anInt5443 == 37) {
				Static13.aFloat3 = 3.0F;
				Static220.aFloat43 = 3.0F;
			} else if (Static20.aClass1_Sub2_Sub21_1.anInt5443 == 50) {
				Static13.aFloat3 = 4.0F;
				Static220.aFloat43 = 4.0F;
			} else if (Static20.aClass1_Sub2_Sub21_1.anInt5443 == 75) {
				Static13.aFloat3 = 6.0F;
				Static220.aFloat43 = 6.0F;
			} else if (Static20.aClass1_Sub2_Sub21_1.anInt5443 == 100) {
				Static13.aFloat3 = 8.0F;
				Static220.aFloat43 = 8.0F;
			} else if (Static20.aClass1_Sub2_Sub21_1.anInt5443 == 200) {
				Static13.aFloat3 = 16.0F;
				Static220.aFloat43 = 16.0F;
			} else {
				Static13.aFloat3 = 8.0F;
				Static220.aFloat43 = 8.0F;
			}
			Static196.method1928();
			Static21.anIntArray48 = new int[Static227.anInt4509 + 1];
			@Pc(306) int local306 = Static205.anInt4156 >> 2 << 10;
			@Pc(310) int local310 = Static67.anInt1419 >> 1;
			@Pc(314) int local314 = Static164.anInt3508 >> 6;
			@Pc(318) int local318 = Static95.anInt2218 >> 6;
			Static100.anIntArrayArrayArray6 = new int[local314][local318][];
			Static100.anIntArrayArrayArray5 = new int[local314][local318][];
			Static10.anIntArrayArrayArray1 = new int[local314][local318][];
			Static198.aByteArrayArrayArray2 = new byte[local314][local318][];
			Static24.aByteArrayArrayArray22 = new byte[local314][local318][];
			Static267.aByteArrayArrayArray24 = new byte[local314][local318][];
			Static104.aByteArrayArrayArray16 = new byte[local314][local318][];
			Static230.aByteArrayArrayArray15 = new byte[local314][local318][];
			Static36.method770(local310, local306);
			Static192.anInt3954 = 20;
		} else if (Static192.anInt3954 == 20) {
			Static18.method338(new Class1_Sub11(Static249.aClass91_179.method2511("underlay", Static20.aClass1_Sub2_Sub21_1.aString319)));
			Static192.anInt3954 = 30;
			Static220.method3469(true);
			Static115.method2092();
		} else if (Static192.anInt3954 == 30) {
			Static114.method2076(new Class1_Sub11(Static249.aClass91_179.method2511("overlay", Static20.aClass1_Sub2_Sub21_1.aString319)));
			Static192.anInt3954 = 40;
			Static115.method2092();
		} else if (Static192.anInt3954 == 40) {
			Static265.method4055(new Class1_Sub11(Static249.aClass91_179.method2511("overlay2", Static20.aClass1_Sub2_Sub21_1.aString319)));
			Static192.anInt3954 = 50;
			Static115.method2092();
		} else if (Static192.anInt3954 == 50) {
			Static256.method3917(new Class1_Sub11(Static249.aClass91_179.method2511("loc", Static20.aClass1_Sub2_Sub21_1.aString319)));
			Static192.anInt3954 = 60;
			Static220.method3469(true);
			Static115.method2092();
		} else if (Static192.anInt3954 == 60) {
			if (Static249.aClass91_179.method2505(Static20.aClass1_Sub2_Sub21_1.aString319 + "_labels")) {
				if (!Static249.aClass91_179.method2491(Static20.aClass1_Sub2_Sub21_1.aString319 + "_labels")) {
					return;
				}
				Static53.aClass82_13 = Static227.method3559(Static20.aClass1_Sub2_Sub21_1.aString319 + "_labels", Static249.aClass91_179);
			} else {
				Static53.aClass82_13 = new Class82(0);
			}
			Static192.anInt3954 = 70;
			Static115.method2092();
		} else if (Static192.anInt3954 == 70) {
			Static218.aClass156_8 = new Class156(11, true, Static156.aCanvas2);
			Static192.anInt3954 = 73;
			Static220.method3469(true);
			Static115.method2092();
		} else if (Static192.anInt3954 == 73) {
			Static19.aClass156_1 = new Class156(12, true, Static156.aCanvas2);
			Static192.anInt3954 = 76;
			Static220.method3469(true);
			Static115.method2092();
		} else if (Static192.anInt3954 == 76) {
			Static69.aClass156_3 = new Class156(14, true, Static156.aCanvas2);
			Static192.anInt3954 = 79;
			Static220.method3469(true);
			Static115.method2092();
		} else if (Static192.anInt3954 == 79) {
			Static133.aClass156_6 = new Class156(17, true, Static156.aCanvas2);
			Static192.anInt3954 = 82;
			Static220.method3469(true);
			Static115.method2092();
		} else if (Static192.anInt3954 == 82) {
			Static133.aClass156_7 = new Class156(19, true, Static156.aCanvas2);
			Static192.anInt3954 = 85;
			Static220.method3469(true);
			Static115.method2092();
		} else if (Static192.anInt3954 == 85) {
			Static109.aClass156_5 = new Class156(22, true, Static156.aCanvas2);
			Static192.anInt3954 = 88;
			Static220.method3469(true);
			Static115.method2092();
		} else if (Static192.anInt3954 == 88) {
			Static31.aClass156_2 = new Class156(26, true, Static156.aCanvas2);
			Static192.anInt3954 = 91;
			Static220.method3469(true);
			Static115.method2092();
		} else {
			Static92.aClass156_4 = new Class156(30, true, Static156.aCanvas2);
			Static192.anInt3954 = 100;
			Static220.method3469(true);
			Static115.method2092();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method3083(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 < 128 || arg3 < 128 || arg4 > 13056 || arg3 > 13056) {
			Static171.anInt3648 = -1;
			Static176.anInt3730 = -1;
			return;
		}
		@Pc(35) int local35 = Static20.method383(arg3, Static140.anInt3034, arg4) - arg1;
		@Pc(39) int local39 = arg3 - Static239.anInt4738;
		@Pc(43) int local43 = arg4 - Static69.anInt1504;
		@Pc(47) int local47 = local35 - Static297.anInt5618;
		@Pc(51) int local51 = Class68.anIntArray229[Static134.anInt2950];
		@Pc(55) int local55 = Class68.anIntArray229[Static91.anInt2040];
		@Pc(59) int local59 = Class68.anIntArray226[Static134.anInt2950];
		@Pc(63) int local63 = Class68.anIntArray226[Static91.anInt2040];
		@Pc(74) int local74 = local39 * local55 + local43 * local63 >> 16;
		@Pc(85) int local85 = local63 * local39 - local43 * local55 >> 16;
		@Pc(92) int local92 = local74;
		@Pc(102) int local102 = local59 * local47 - local85 * local51 >> 16;
		@Pc(112) int local112 = local85 * local59 + local47 * local51 >> 16;
		if (local112 < 50) {
			Static176.anInt3730 = -1;
			Static171.anInt3648 = -1;
		} else if (Static277.aBoolean412) {
			@Pc(131) int local131 = arg6 * 512 >> 8;
			Static176.anInt3730 = local102 * local131 / local112 + arg5;
			@Pc(145) int local145 = arg0 * 512 >> 8;
			Static171.anInt3648 = arg2 + local145 * local92 / local112;
		} else {
			Static171.anInt3648 = arg2 + (local92 << 9) / local112;
			Static176.anInt3730 = (local102 << 9) / local112 + arg5;
		}
	}
}
