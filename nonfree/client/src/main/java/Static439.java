import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!pn", name = "q", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_114 = new Class200(106, -1);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIII)V")
	public static void method6843(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg1 - arg4;
		@Pc(15) int local15 = arg2 - arg0;
		if (local10 == 0) {
			if (local15 != 0) {
				Static276.method4486(arg0, arg4, arg3, arg2);
			}
		} else if (local15 == 0) {
			Static470.method7098(arg3, arg4, arg1, arg0);
		} else {
			@Pc(41) int local41 = (local15 << 12) / local10;
			@Pc(50) int local50 = arg0 - (arg4 * local41 >> 12);
			@Pc(68) int local68;
			@Pc(66) int local66;
			if (arg4 < Static630.anInt10099) {
				local68 = Static630.anInt10099;
				local66 = local50 + (Static630.anInt10099 * local41 >> 12);
			} else if (arg4 <= Static16.anInt4339) {
				local66 = arg0;
				local68 = arg4;
			} else {
				local68 = Static16.anInt4339;
				local66 = (local41 * Static16.anInt4339 >> 12) + local50;
			}
			@Pc(112) int local112;
			@Pc(110) int local110;
			if (Static630.anInt10099 > arg1) {
				local112 = Static630.anInt10099;
				local110 = (local41 * Static630.anInt10099 >> 12) + local50;
			} else if (Static16.anInt4339 < arg1) {
				local110 = (local41 * Static16.anInt4339 >> 12) + local50;
				local112 = Static16.anInt4339;
			} else {
				local110 = arg2;
				local112 = arg1;
			}
			if (local110 < Static11.anInt9803) {
				local112 = (Static11.anInt9803 - local50 << 12) / local41;
				local110 = Static11.anInt9803;
			} else if (local110 > Static149.anInt2949) {
				local110 = Static149.anInt2949;
				local112 = (Static149.anInt2949 - local50 << 12) / local41;
			}
			if (local66 < Static11.anInt9803) {
				local68 = (Static11.anInt9803 - local50 << 12) / local41;
				local66 = Static11.anInt9803;
			} else if (Static149.anInt2949 < local66) {
				local68 = (Static149.anInt2949 - local50 << 12) / local41;
				local66 = Static149.anInt2949;
			}
			Static174.method3048(local68, arg3, local112, local66, local110);
		}
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIBIIII)V")
	public static void method6844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg4 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(31) int local31 = Static213.aShort58 + (Static524.aShort114 - Static213.aShort58) * local7 / 100;
		@Pc(37) int local37 = local31 * arg2 >> 8;
		Static401.anInt7417 = Static401.anInt7424 * local31 >> 8;
		@Pc(59) int local59 = 16384 - arg5 & 0x3FFF;
		@Pc(65) int local65 = 16384 - arg1 & 0x3FFF;
		@Pc(67) int local67 = 0;
		@Pc(69) int local69 = 0;
		@Pc(71) int local71 = local37;
		if (local59 != 0) {
			local69 = Class21.anIntArray656[local59] * -local37 >> 14;
			local71 = local37 * Class21.anIntArray655[local59] >> 14;
		}
		if (local65 != 0) {
			local67 = local71 * Class21.anIntArray656[local65] >> 14;
			local71 = Class21.anIntArray655[local65] * local71 >> 14;
		}
		Static557.anInt9304 = arg3 - local69;
		Static185.anInt5215 = arg1;
		Static611.anInt9892 = arg6 - local67;
		Static72.anInt1723 = 0;
		Static393.anInt7268 = arg5;
		Static20.anInt824 = arg0 - local71;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(ZI)V")
	public static void method6845(@OriginalArg(0) boolean arg0) {
		if (Static413.aClass230_1 != null) {
			Static413.aClass230_1.method6028();
			Static413.aClass230_1 = null;
		}
		Static251.anInt4607 = 0;
		Static518.method7722();
		Static53.method8687();
		for (@Pc(21) int local21 = 0; local21 < 4; local21++) {
			Static271.aClass105Array1[local21].method2737();
		}
		Static582.method8233(false);
		System.gc();
		Static7.method2301();
		Static472.anInt8274 = -1;
		Static120.aBoolean173 = false;
		Static464.method7046();
		Static61.method1646(true);
		Static299.anInt5307 = 0;
		Static482.anInt8390 = 0;
		Static402.anInt7435 = 0;
		Static345.anInt6725 = 0;
		Static133.anInt2704 = 0;
		Static171.anInt3340 = 0;
		for (@Pc(62) int local62 = 0; local62 < Static82.aClass251Array1.length; local62++) {
			Static82.aClass251Array1[local62] = null;
		}
		Static11.method8400();
		for (@Pc(77) int local77 = 0; local77 < 2048; local77++) {
			Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local77] = null;
		}
		Static94.anInt2209 = 0;
		Static551.aClass280_43.method7100();
		Static294.anInt5193 = 0;
		Static356.aClass280_28.method7100();
		Static329.method5384();
		Static591.anInt9687 = 0;
		Static373.aClass150_1.method3826();
		Static420.method6587();
		Static581.method4383();
		Static593.aClass3_Sub42_2 = null;
		Static235.aLong130 = 0L;
		if (arg0) {
			Static256.method4279(12);
			return;
		}
		Static256.method4279(3);
		try {
			Static646.method3052(Static504.anApplet2, "loggedout");
		} catch (@Pc(124) Throwable local124) {
		}
	}
}
