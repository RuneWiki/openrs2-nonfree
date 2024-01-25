import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!qh", name = "L", descriptor = "[I")
	public static int[] anIntArray431;

	@OriginalMember(owner = "client!qh", name = "K", descriptor = "Z")
	public static volatile boolean aBoolean487 = true;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZZI)V")
	public static void method4676(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (!arg2 && arg3 == Static208.anInt4568 && Static190.anInt6232 == arg0 && (Static30.anInt483 == Static291.anInt5263 || Static230.method4872())) {
			return;
		}
		Static190.anInt6232 = arg0;
		Static30.anInt483 = Static291.anInt5263;
		Static208.anInt4568 = arg3;
		if (Static230.method4872()) {
			Static30.anInt483 = 0;
		}
		if (arg1) {
			Static224.method5495(28);
		} else {
			Static224.method5495(25);
		}
		Static105.method2078(Static272.aClass71_4, Static281.aClass140_135.method4155(Static239.anInt2803), true);
		@Pc(57) int local57 = Static150.anInt3453;
		Static150.anInt3453 = (Static208.anInt4568 - (Static66.anInt1177 >> 4)) * 8;
		@Pc(67) int local67 = Static287.anInt5776;
		Static287.anInt5776 = (Static190.anInt6232 - (Static12.anInt213 >> 4)) * 8;
		Static350.aClass2_Sub9_Sub17_3 = Static202.method4233(Static208.anInt4568 * 8, Static190.anInt6232 * 8);
		Static283.aClass194_3 = null;
		@Pc(90) int local90 = Static150.anInt3453 - local57;
		@Pc(95) int local95 = Static287.anInt5776 - local67;
		@Pc(105) int local105;
		@Pc(113) int local113;
		if (arg1) {
			Static186.anInt4092 = 0;
			local105 = Static66.anInt1177 * 128 - 128;
			@Pc(111) int local111 = Static12.anInt213 * 128 - 128;
			for (local113 = 0; local113 < 32768; local113++) {
				@Pc(119) Class1_Sub2_Sub3_Sub2 local119 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local113];
				if (local119 != null) {
					local119.anInt6893 -= local90 * 128;
					local119.anInt6888 -= local95 * 128;
					if (local119.anInt6893 >= 0 && local119.anInt6893 <= local105 && local119.anInt6888 >= 0 && local119.anInt6888 <= local111) {
						@Pc(175) boolean local175 = true;
						for (@Pc(177) int local177 = 0; local177 < 10; local177++) {
							local119.anIntArray535[local177] -= local90;
							local119.anIntArray534[local177] -= local95;
							if (local119.anIntArray535[local177] < 0 || Static66.anInt1177 <= local119.anIntArray535[local177] || local119.anIntArray534[local177] < 0 || Static12.anInt213 <= local119.anIntArray534[local177]) {
								local175 = false;
							}
						}
						if (local175) {
							Static171.anIntArray292[Static186.anInt4092++] = local113;
						} else {
							Static95.aClass1_Sub2_Sub3_Sub2Array1[local113].method5790(null);
							Static95.aClass1_Sub2_Sub3_Sub2Array1[local113] = null;
						}
					} else {
						Static95.aClass1_Sub2_Sub3_Sub2Array1[local113].method5790(null);
						Static95.aClass1_Sub2_Sub3_Sub2Array1[local113] = null;
					}
				}
			}
		} else {
			for (local105 = 0; local105 < 32768; local105++) {
				@Pc(267) Class1_Sub2_Sub3_Sub2 local267 = Static95.aClass1_Sub2_Sub3_Sub2Array1[local105];
				if (local267 != null) {
					for (local113 = 0; local113 < 10; local113++) {
						local267.anIntArray535[local113] -= local90;
						local267.anIntArray534[local113] -= local95;
					}
					local267.anInt6888 -= local95 * 128;
					local267.anInt6893 -= local90 * 128;
				}
			}
		}
		for (local105 = 0; local105 < 2048; local105++) {
			@Pc(323) Class1_Sub2_Sub3_Sub1 local323 = Static164.aClass1_Sub2_Sub3_Sub1Array1[local105];
			if (local323 != null) {
				for (local113 = 0; local113 < 10; local113++) {
					local323.anIntArray535[local113] -= local90;
					local323.anIntArray534[local113] -= local95;
				}
				local323.anInt6893 -= local90 * 128;
				local323.anInt6888 -= local95 * 128;
			}
		}
		Static248.method4400(local90, local95);
		for (@Pc(380) Class2_Sub33 local380 = (Class2_Sub33) Static108.aClass180_15.method4919(); local380 != null; local380 = (Class2_Sub33) Static108.aClass180_15.method4916()) {
			local380.anInt5558 -= local95;
			local380.anInt5552 -= local90;
			if (local380.anInt5552 < 0 || local380.anInt5558 < 0 || Static66.anInt1177 <= local380.anInt5552 || local380.anInt5558 >= Static12.anInt213) {
				local380.method5723();
			}
		}
		if (Static57.anInt1013 != 0) {
			Static360.anInt6858 -= local95;
			Static57.anInt1013 -= local90;
		}
		Static191.anInt4213 = 0;
		if (arg1) {
			Static87.anInt1642 -= local95;
			Static243.anInt5174 -= local95;
			Static166.anInt3804 -= local90 * 128;
			Static132.anInt2841 -= local90;
			Static236.anInt929 -= local90;
			Static51.anInt879 -= local95 * 128;
			if (Math.abs(local90) > Static66.anInt1177 || Math.abs(local95) > Static12.anInt213) {
				Static225.method4189();
			}
		} else if (Static135.anInt2910 == 4) {
			Static54.anInt975 -= local95 * 128;
			Static118.anInt2492 -= local90 * 128;
			Static362.anInt6967 -= local95 * 128;
			Static98.anInt2002 -= local90 * 128;
		} else {
			Static135.anInt2910 = 1;
		}
		Static237.method4311();
		Static81.method1661();
		Static30.aClass180_3.method4917();
		Static129.aClass180_22.method4917();
		Static8.aClass193_1.method5218();
		Static233.method4281();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "([I[JI)V")
	public static void method4678(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1) {
		Static16.method249(arg1.length - 1, arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lclient!fh;ZI)V")
	public static void method4679(@OriginalArg(0) Class68 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(15) int local15 = arg0.anInt1881 == 0 ? arg0.anInt1874 : arg0.anInt1881;
		@Pc(28) int local28 = arg0.anInt1894 == 0 ? arg0.anInt1845 : arg0.anInt1894;
		Static12.method179(local28, local15, Static264.aClass68ArrayArray1[arg0.anInt1857 >> 16], arg0.anInt1857, arg1);
		if (arg0.aClass68Array1 != null) {
			Static12.method179(local28, local15, arg0.aClass68Array1, arg0.anInt1857, arg1);
		}
		@Pc(61) Class2_Sub40 local61 = (Class2_Sub40) Static303.aClass41_32.method902((long) arg0.anInt1857);
		if (local61 != null) {
			Static148.method2888(local28, arg1, local61.anInt6092, local15);
		}
	}
}
