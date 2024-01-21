import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "Lclient!ii;")
	public static Class47 aClass47_15;

	@OriginalMember(owner = "client!ud", name = "F", descriptor = "Lclient!hh;")
	public static Class42 aClass42_5;

	@OriginalMember(owner = "client!ud", name = "I", descriptor = "Lclient!vi;")
	public static Class2_Sub1_Sub2 aClass2_Sub1_Sub2_4;

	@OriginalMember(owner = "client!ud", name = "C", descriptor = "Lclient!wd;")
	public static final Class2_Sub27 aClass2_Sub27_1 = new Class2_Sub27(0, 0);

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIII)V")
	public static void method2773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static122.anInt2718 <= arg5 && arg4 <= Static153.anInt3279 && Static154.anInt3307 <= arg1 && Static15.anInt353 >= arg3) {
			if (arg0 == 1) {
				Static147.method2195(arg2, arg5, arg1, arg4, arg3);
			} else {
				Static48.method732(arg4, arg3, arg2, arg1, arg5, arg0);
			}
		} else if (arg0 == 1) {
			Static88.method1237(arg4, arg2, arg3, arg5, arg1);
		} else {
			Static126.method1978(arg0, arg2, arg5, arg1, arg4, arg3);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIILclient!vi;BILclient!ii;)V")
	public static void method2774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub1_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class47 arg5) {
		if (arg3 == null) {
			return;
		}
		@Pc(17) int local17 = Static151.anInt3204 + Static203.anInt4219 & 0x7FF;
		@Pc(29) int local29 = Math.max(arg5.anInt1910 / 2, arg5.anInt1858 / 2) + 10;
		@Pc(38) int local38 = arg2 * arg2 + arg0 * arg0;
		if (local38 > local29 * local29) {
			return;
		}
		@Pc(48) int local48 = Class26.anIntArray77[local17];
		@Pc(56) int local56 = local48 * 256 / (Static206.anInt397 + 256);
		@Pc(60) int local60 = Class26.anIntArray76[local17];
		@Pc(68) int local68 = local60 * 256 / (Static206.anInt397 + 256);
		@Pc(78) int local78 = arg0 * local56 + arg2 * local68 >> 16;
		@Pc(88) int local88 = local68 * arg0 - local56 * arg2 >> 16;
		((Class2_Sub1_Sub2_Sub1) arg3).method281(local78 + arg5.anInt1910 / 2 + arg4 - arg3.anInt405 / 2, -local88 + arg5.anInt1858 / 2 + arg1 + -(arg3.anInt402 / 2), arg5.anIntArray171, arg5.anIntArray168);
	}

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "(B)V")
	public static void method2776() {
		@Pc(11) boolean local11 = false;
		while (!local11) {
			local11 = true;
			for (@Pc(17) int local17 = 0; local17 < Static51.anInt1111 - 1; local17++) {
				if (Static26.aShortArray134[local17] < 1000 && Static26.aShortArray134[local17 + 1] > 1000) {
					local11 = false;
					@Pc(37) Class62 local37 = Static87.aClass62Array53[local17];
					Static87.aClass62Array53[local17] = Static87.aClass62Array53[local17 + 1];
					Static87.aClass62Array53[local17 + 1] = local37;
					@Pc(55) Class62 local55 = Static6.aClass62Array5[local17];
					Static6.aClass62Array5[local17] = Static6.aClass62Array5[local17 + 1];
					Static6.aClass62Array5[local17 + 1] = local55;
					@Pc(73) int local73 = Static147.anIntArray281[local17];
					Static147.anIntArray281[local17] = Static147.anIntArray281[local17 + 1];
					Static147.anIntArray281[local17 + 1] = local73;
					@Pc(91) int local91 = Static102.anIntArray215[local17];
					Static102.anIntArray215[local17] = Static102.anIntArray215[local17 + 1];
					Static102.anIntArray215[local17 + 1] = local91;
					@Pc(109) short local109 = Static26.aShortArray134[local17];
					Static26.aShortArray134[local17] = Static26.aShortArray134[local17 + 1];
					Static26.aShortArray134[local17 + 1] = local109;
					@Pc(127) long local127 = Static150.aLongArray9[local17];
					Static150.aLongArray9[local17] = Static150.aLongArray9[local17 + 1];
					Static150.aLongArray9[local17 + 1] = local127;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IBIIII)V")
	public static void method2778(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg1 - arg2;
		@Pc(10) int local10 = arg3 - arg4;
		if (local10 == 0) {
			if (local6 != 0) {
				Static161.method2376(arg0, arg2, arg1, arg4);
			}
		} else if (local6 == 0) {
			Static162.method2388(arg3, arg2, arg0, arg4);
		} else {
			if (local6 < 0) {
				local6 = -local6;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(65) boolean local65 = local6 > local10;
			@Pc(69) int local69;
			@Pc(71) int local71;
			if (local65) {
				local69 = arg4;
				local71 = arg3;
				arg4 = arg2;
				arg2 = local69;
				arg3 = arg1;
				arg1 = local71;
			}
			if (arg4 > arg3) {
				local71 = arg2;
				arg2 = arg1;
				arg1 = local71;
				local69 = arg4;
				arg4 = arg3;
				arg3 = local69;
			}
			local69 = arg2;
			local71 = arg3 - arg4;
			@Pc(106) int local106 = arg1 - arg2;
			if (local106 < 0) {
				local106 = -local106;
			}
			@Pc(121) int local121 = arg2 >= arg1 ? -1 : 1;
			@Pc(126) int local126 = -(local71 >> 1);
			@Pc(130) int local130;
			if (local65) {
				for (local130 = arg4; local130 <= arg3; local130++) {
					Static55.anIntArrayArray8[local130][local69] = arg0;
					local126 += local106;
					if (local126 > 0) {
						local126 -= local71;
						local69 += local121;
					}
				}
			} else {
				for (local130 = arg4; local130 <= arg3; local130++) {
					Static55.anIntArrayArray8[local69][local130] = arg0;
					local126 += local106;
					if (local126 > 0) {
						local126 -= local71;
						local69 += local121;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
	public static void method2779() {
		Static58.aClass2_Sub11_Sub1_2.method1595(162);
		Static58.aClass2_Sub11_Sub1_2.method1527(0L);
	}
}
