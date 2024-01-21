import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "[I")
	public static int[] anIntArray12;

	@OriginalMember(owner = "client!ac", name = "K", descriptor = "Lclient!ff;")
	public static Class11 aClass11_3;

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "Lclient!ce;")
	public static Class11_Sub1 aClass11_Sub1_1;

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "Lclient!wd;")
	public static Class80 aClass80_49 = Static2.method59("@cr2@");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZII)I")
	public static int method90(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(13) int local13 = arg0 & arg2 - 1;
		@Pc(17) int local17 = arg1 / arg2;
		@Pc(22) int local22 = Static119.method1003(local17, local7);
		@Pc(28) int local28 = arg1 & arg2 - 1;
		@Pc(35) int local35 = Static119.method1003(local17, local7 + 1);
		@Pc(42) int local42 = Static119.method1003(local17 + 1, local7);
		@Pc(51) int local51 = Static119.method1003(local17 + 1, local7 + 1);
		@Pc(58) int local58 = Static8.method133(local13, local22, arg2, local35);
		@Pc(65) int local65 = Static8.method133(local13, local42, arg2, local51);
		return Static8.method133(local28, local58, arg2, local65);
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
	public static void method92() {
		if (Static51.aClass10_3 != null) {
			Static51.aClass10_3.method255();
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	public static void method93() {
		anIntArray12 = null;
		aClass80_49 = null;
		aClass11_3 = null;
		aClass11_Sub1_1 = null;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V")
	public static void method94() {
		Static14.aClass32_11.method878();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)Lclient!cf;")
	public static Class2_Sub1_Sub5 method95(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub1_Sub5 local15 = (Class2_Sub1_Sub5) Static59.aClass32_34.method887((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static23.aClass11_15.method383(arg0, 10);
		local15 = new Class2_Sub1_Sub5();
		local15.anInt815 = arg0;
		if (local25 != null) {
			local15.method430(new Class2_Sub17(local25));
		}
		local15.method432();
		if (local15.anInt797 != -1) {
			local15.method422(method95(local15.anInt783), method95(local15.anInt797));
		}
		if (!Static84.aBoolean154 && local15.aBoolean55) {
			local15.aClass80_271 = Static97.aClass80_977;
			local15.anInt804 = 0;
			local15.aClass80Array4 = null;
			local15.aClass80Array3 = null;
		}
		Static59.aClass32_34.method880(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IBIIII)V")
	public static void method96(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = Static93.aClass64_1.method1656(arg0, arg2, arg3);
		@Pc(24) int local24;
		@Pc(36) int local36;
		@Pc(28) int local28;
		@Pc(30) int local30;
		@Pc(55) int local55;
		@Pc(65) int local65;
		if (local7 != 0) {
			local24 = Static93.aClass64_1.method1622(arg0, arg2, arg3, local7);
			local28 = local24 & 0x1F;
			local30 = arg4;
			local36 = local24 >> 6 & 0x3;
			@Pc(39) int[] local39 = Static85.aClass2_Sub1_Sub9_Sub1_7.anIntArray185;
			local55 = (52736 - arg3 * 512) * 4 + arg2 * 4 + 24624;
			if (local7 > 0) {
				local30 = arg1;
			}
			local65 = local7 >> 14 & 0x7FFF;
			@Pc(69) Class2_Sub1_Sub10 local69 = Static18.method404(local65);
			if (local69.anInt1642 == -1) {
				if (local28 == 0 || local28 == 2) {
					if (local36 == 0) {
						local39[local55] = local30;
						local39[local55 + 512] = local30;
						local39[local55 + 1024] = local30;
						local39[local55 + 1536] = local30;
					} else if (local36 == 1) {
						local39[local55] = local30;
						local39[local55 + 1] = local30;
						local39[local55 + 2] = local30;
						local39[local55 + 3] = local30;
					} else if (local36 == 2) {
						local39[local55 + 3] = local30;
						local39[local55 + 515] = local30;
						local39[local55 + 3 + 1024] = local30;
						local39[local55 + 1536 + 3] = local30;
					} else if (local36 == 3) {
						local39[local55 + 1536] = local30;
						local39[local55 + 1536 + 1] = local30;
						local39[local55 + 1536 + 2] = local30;
						local39[local55 + 1536 + 3] = local30;
					}
				}
				if (local28 == 3) {
					if (local36 == 0) {
						local39[local55] = local30;
					} else if (local36 == 1) {
						local39[local55 + 3] = local30;
					} else if (local36 == 2) {
						local39[local55 + 1539] = local30;
					} else if (local36 == 3) {
						local39[local55 + 1536] = local30;
					}
				}
				if (local28 == 2) {
					if (local36 == 3) {
						local39[local55] = local30;
						local39[local55 + 512] = local30;
						local39[local55 + 1024] = local30;
						local39[local55 + 1536] = local30;
					} else if (local36 == 0) {
						local39[local55] = local30;
						local39[local55 + 1] = local30;
						local39[local55 + 2] = local30;
						local39[local55 + 3] = local30;
					} else if (local36 == 1) {
						local39[local55 + 3] = local30;
						local39[local55 + 3 + 512] = local30;
						local39[local55 + 1024 + 3] = local30;
						local39[local55 + 3 + 1536] = local30;
					} else if (local36 == 2) {
						local39[local55 + 1536] = local30;
						local39[local55 + 1 + 1536] = local30;
						local39[local55 + 2 + 1536] = local30;
						local39[local55 + 1536 + 3] = local30;
					}
				}
			} else {
				@Pc(391) Class2_Sub1_Sub9_Sub3 local391 = Static119.aClass2_Sub1_Sub9_Sub3Array6[local69.anInt1642];
				if (local391 != null) {
					@Pc(404) int local404 = (local69.anInt1630 * 4 - local391.anInt2482) / 2;
					@Pc(415) int local415 = (local69.anInt1634 * 4 - local391.anInt2487) / 2;
					local391.method1494(local415 + arg2 * 4 + 48, local404 + 48 + (-local69.anInt1630 + -arg3 + 104) * 4);
				}
			}
		}
		local7 = Static93.aClass64_1.method1653(arg0, arg2, arg3);
		if (local7 != 0) {
			local24 = Static93.aClass64_1.method1622(arg0, arg2, arg3, local7);
			local36 = local24 >> 6 & 0x3;
			local28 = local24 & 0x1F;
			local30 = local7 >> 14 & 0x7FFF;
			@Pc(476) Class2_Sub1_Sub10 local476 = Static18.method404(local30);
			@Pc(505) int local505;
			if (local476.anInt1642 != -1) {
				@Pc(582) Class2_Sub1_Sub9_Sub3 local582 = Static119.aClass2_Sub1_Sub9_Sub3Array6[local476.anInt1642];
				if (local582 != null) {
					local505 = (local476.anInt1630 * 4 - local582.anInt2482) / 2;
					local65 = (local476.anInt1634 * 4 - local582.anInt2487) / 2;
					local582.method1494(arg2 * 4 + local65 + 48, local505 + (-arg3 + 104 + -local476.anInt1630) * 4 + 48);
				}
			} else if (local28 == 9) {
				@Pc(489) int[] local489 = Static85.aClass2_Sub1_Sub9_Sub1_7.anIntArray185;
				local505 = arg2 * 4 + (103 - arg3) * 512 * 4 + 24624;
				local55 = 15658734;
				if (local7 > 0) {
					local55 = 15597568;
				}
				if (local36 == 0 || local36 == 2) {
					local489[local505 + 1536] = local55;
					local489[local505 + 1 + 1024] = local55;
					local489[local505 + 514] = local55;
					local489[local505 + 3] = local55;
				} else {
					local489[local505] = local55;
					local489[local505 + 512 + 1] = local55;
					local489[local505 + 1024 + 2] = local55;
					local489[local505 + 1536 + 3] = local55;
				}
			}
		}
		local7 = Static93.aClass64_1.method1620(arg0, arg2, arg3);
		if (local7 == 0) {
			return;
		}
		local24 = local7 >> 14 & 0x7FFF;
		@Pc(651) Class2_Sub1_Sub10 local651 = Static18.method404(local24);
		if (local651.anInt1642 == -1) {
			return;
		}
		@Pc(660) Class2_Sub1_Sub9_Sub3 local660 = Static119.aClass2_Sub1_Sub9_Sub3Array6[local651.anInt1642];
		if (local660 != null) {
			local30 = (local651.anInt1634 * 4 - local660.anInt2487) / 2;
			@Pc(683) int local683 = (local651.anInt1630 * 4 - local660.anInt2482) / 2;
			local660.method1494(local30 + arg2 * 4 + 48, (-local651.anInt1630 + 104 - arg3) * 4 + (48 - -local683));
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)V")
	public static void method97() {
		@Pc(5) Class45 local5 = Static71.aClass45_1;
		synchronized (Static71.aClass45_1) {
			Static120.anInt3078 = Static114.anInt2933;
			Static93.anInt2398 = Static21.anInt918;
			Static95.anInt2430 = Static73.anInt1934;
			Static20.anInt906 = Static62.anInt1800;
			Static13.anInt365 = Static74.anInt1938;
			Static108.anInt2880 = Static80.anInt2031;
			Static89.aLong68 = Static9.aLong18;
			Static62.anInt1800 = 0;
		}
	}
}
