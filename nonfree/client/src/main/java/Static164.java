import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!v", name = "zb", descriptor = "Lclient!ob;")
	public static Class16_Sub1 aClass16_Sub1_50;

	@OriginalMember(owner = "client!v", name = "Ab", descriptor = "J")
	public static long aLong130;

	@OriginalMember(owner = "client!v", name = "hb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1163 = Static8.method128("(U3");

	@OriginalMember(owner = "client!v", name = "qb", descriptor = "Lclient!rc;")
	public static Class66 aClass66_22 = new Class66(50);

	@OriginalMember(owner = "client!v", name = "yb", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1164 = Static8.method128("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!v", name = "Bb", descriptor = "Lclient!pg;")
	public static Class59 aClass59_58 = new Class59();

	@OriginalMember(owner = "client!v", name = "Cb", descriptor = "I")
	public static int anInt4505 = 0;

	@OriginalMember(owner = "client!v", name = "Db", descriptor = "Lclient!ea;")
	public static Class18 aClass18_1165 = Static8.method128("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!v", name = "i", descriptor = "(I)V")
	public static void method3042() {
		Static167.aClass1_Sub6_Sub1_3.method559();
		@Pc(18) int local18 = Static167.aClass1_Sub6_Sub1_3.method562(1);
		if (local18 == 0) {
			return;
		}
		@Pc(26) int local26 = Static167.aClass1_Sub6_Sub1_3.method562(2);
		if (local26 == 0) {
			Static82.anIntArray220[Static76.anInt2355++] = 2047;
			return;
		}
		@Pc(45) int local45;
		@Pc(55) int local55;
		if (local26 == 1) {
			local45 = Static167.aClass1_Sub6_Sub1_3.method562(3);
			Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.method2477(false, local45);
			local55 = Static167.aClass1_Sub6_Sub1_3.method562(1);
			if (local55 == 1) {
				Static82.anIntArray220[Static76.anInt2355++] = 2047;
			}
			return;
		}
		@Pc(95) int local95;
		if (local26 == 2) {
			local45 = Static167.aClass1_Sub6_Sub1_3.method562(3);
			Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.method2477(true, local45);
			local55 = Static167.aClass1_Sub6_Sub1_3.method562(3);
			Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.method2477(true, local55);
			local95 = Static167.aClass1_Sub6_Sub1_3.method562(1);
			if (local95 == 1) {
				Static82.anIntArray220[Static76.anInt2355++] = 2047;
			}
		} else if (local26 == 3) {
			local45 = Static167.aClass1_Sub6_Sub1_3.method562(1);
			if (local45 == 1) {
				Static82.anIntArray220[Static76.anInt2355++] = 2047;
			}
			local55 = Static167.aClass1_Sub6_Sub1_3.method562(1);
			local95 = Static167.aClass1_Sub6_Sub1_3.method562(7);
			Static9.anInt295 = Static167.aClass1_Sub6_Sub1_3.method562(2);
			@Pc(148) int local148 = Static167.aClass1_Sub6_Sub1_3.method562(7);
			Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.method2481(local148, local95, local55 == 1);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIILclient!lh;II)V")
	public static void method3043(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub11 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) Class1_Sub9 local11 = new Class1_Sub9();
		@Pc(14) int local14 = arg2.anInt2815;
		local11.anInt1325 = arg0;
		local11.anInt1330 = arg2.anInt2788;
		local11.anIntArray89 = arg2.anIntArray252;
		local11.anInt1319 = arg3 * 128;
		local11.anInt1329 = arg2.anInt2812;
		local11.anInt1334 = arg4 * 128;
		local11.anInt1327 = arg2.anInt2796 * 128;
		local11.anInt1331 = arg2.anInt2800;
		@Pc(52) int local52 = arg2.anInt2822;
		if (arg1 == 1 || arg1 == 3) {
			local14 = arg2.anInt2822;
			local52 = arg2.anInt2815;
		}
		local11.anInt1328 = (arg4 + local52) * 128;
		local11.anInt1333 = (arg3 + local14) * 128;
		if (arg2.anIntArray250 != null) {
			local11.aClass1_Sub1_Sub11_1 = arg2;
			local11.method821();
		}
		Static12.aClass59_59.method2411(local11);
		if (local11.anIntArray89 != null) {
			local11.anInt1337 = local11.anInt1329 + (int) ((double) (local11.anInt1330 - local11.anInt1329) * Math.random());
		}
	}

	@OriginalMember(owner = "client!v", name = "j", descriptor = "(I)V")
	public static void method3044() {
		for (@Pc(7) int local7 = 0; local7 < Static76.anInt2355; local7++) {
			@Pc(13) int local13 = Static82.anIntArray220[local7];
			@Pc(17) Class1_Sub1_Sub5_Sub1_Sub2 local17 = Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[local13];
			@Pc(21) int local21 = Static167.aClass1_Sub6_Sub1_3.method544();
			if ((local21 & 0x20) != 0) {
				local21 += Static167.aClass1_Sub6_Sub1_3.method544() << 8;
			}
			Static54.method1138(local17, local21, local13);
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
	public static void method3046() {
		aClass18_1163 = null;
		aClass16_Sub1_50 = null;
		aClass18_1164 = null;
		aClass66_22 = null;
		aClass59_58 = null;
		aClass18_1165 = null;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(II)Lclient!r;")
	public static Class1_Sub1_Sub15 method3047(@OriginalArg(1) int arg0) {
		@Pc(14) Class1_Sub1_Sub15 local14 = (Class1_Sub1_Sub15) Static60.aClass66_8.method2599((long) arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(28) byte[] local28 = Static34.aClass16_5.method2254(arg0, 9);
		local14 = new Class1_Sub1_Sub15();
		local14.anInt3799 = arg0;
		if (local28 != null) {
			local14.method2587(new Class1_Sub6(local28));
		}
		local14.method2588();
		Static60.aClass66_8.method2597((long) arg0, local14);
		return local14;
	}
}
