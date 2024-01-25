import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
	public static int anInt7625;

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
	public static int anInt7623 = 0;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)Z")
	public static boolean method6089(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "([BB)V")
	public static void method6090(@OriginalArg(0) byte[] arg0) {
		new Class6_Sub12(arg0);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZILclient!ln;)V")
	public static void method6091(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub26 arg2) {
		if (arg2 == null || Static408.aClass298_154.aClass6_246 == arg2) {
			return;
		}
		@Pc(15) int local15 = arg2.anInt5468;
		@Pc(18) int local18 = arg2.anInt5473;
		@Pc(21) int local21 = arg2.anInt5472;
		@Pc(25) int local25 = (int) arg2.aLong126;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(34) long local34 = arg2.aLong126;
		@Pc(43) Class15_Sub2_Sub4_Sub2 local43;
		if (local21 == 22) {
			local43 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local25];
			if (local43 != null) {
				Static82.anInt1373 = 2;
				Static496.anInt9106 = 0;
				Static277.anInt4913 = arg0;
				Static274.anInt4851 = arg1;
				Static534.method7063(Static26.aClass316_6);
				Static340.aClass6_Sub12_Sub2_1.method6001(Static184.aClass262_1.method6381(82) ? 1 : 0);
				Static340.aClass6_Sub12_Sub2_1.method6053(local25);
				Static227.method3563(local43.method7135(), local43.method7135(), true, -2, local43.anIntArray638[0], 0, 0, local43.anIntArray637[0]);
			}
		}
		if (local21 == 1003 || local21 == 1001 || local21 == 1010 || local21 == 1006 || local21 == 1011) {
			Static90.method4172(local15, local21, local25);
		}
		if (local21 == 16) {
			local43 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local25];
			if (local43 != null) {
				Static277.anInt4913 = arg0;
				Static496.anInt9106 = 0;
				Static274.anInt4851 = arg1;
				Static82.anInt1373 = 2;
				Static534.method7063(Static27.aClass316_7);
				Static340.aClass6_Sub12_Sub2_1.method6041(local25);
				Static340.aClass6_Sub12_Sub2_1.method6043(Static184.aClass262_1.method6381(82) ? 1 : 0);
				Static227.method3563(local43.method7135(), local43.method7135(), true, -2, local43.anIntArray638[0], 0, 0, local43.anIntArray637[0]);
			}
		}
		if (local21 == 48) {
			local43 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local25];
			if (local43 != null) {
				Static274.anInt4851 = arg1;
				Static496.anInt9106 = 0;
				Static277.anInt4913 = arg0;
				Static82.anInt1373 = 2;
				Static534.method7063(Static488.aClass316_122);
				Static340.aClass6_Sub12_Sub2_1.method6043(Static184.aClass262_1.method6381(82) ? 1 : 0);
				Static340.aClass6_Sub12_Sub2_1.method6053(local25);
				Static227.method3563(local43.method7135(), local43.method7135(), true, -2, local43.anIntArray638[0], 0, 0, local43.anIntArray637[0]);
			}
		}
		if (local21 == 15) {
			local43 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local25];
			if (local43 != null) {
				Static277.anInt4913 = arg0;
				Static496.anInt9106 = 0;
				Static274.anInt4851 = arg1;
				Static82.anInt1373 = 2;
				Static534.method7063(Static308.aClass316_70);
				Static340.aClass6_Sub12_Sub2_1.method6047(Static184.aClass262_1.method6381(82) ? 1 : 0);
				Static340.aClass6_Sub12_Sub2_1.method6058(local25);
				Static227.method3563(local43.method7135(), local43.method7135(), true, -2, local43.anIntArray638[0], 0, 0, local43.anIntArray637[0]);
			}
		}
		if (local21 == 4) {
			Static274.anInt4851 = arg1;
			Static496.anInt9106 = 0;
			Static82.anInt1373 = 2;
			Static277.anInt4913 = arg0;
			Static534.method7063(Static155.aClass316_35);
			Static340.aClass6_Sub12_Sub2_1.method6058(Static150.anInt2792 + local15);
			Static340.aClass6_Sub12_Sub2_1.method6058(local25);
			Static340.aClass6_Sub12_Sub2_1.method6001(Static184.aClass262_1.method6381(82) ? 1 : 0);
			Static340.aClass6_Sub12_Sub2_1.method6053(Static154.anInt2878 + local18);
			Static209.method3412(local15, local18);
		}
		if (local21 == 1008) {
			Static274.anInt4851 = arg1;
			Static277.anInt4913 = arg0;
			Static496.anInt9106 = 0;
			Static82.anInt1373 = 2;
			Static534.method7063(Static528.aClass316_113);
			Static340.aClass6_Sub12_Sub2_1.method6001(Static184.aClass262_1.method6381(82) ? 1 : 0);
			Static340.aClass6_Sub12_Sub2_1.method6032(Static154.anInt2878 + local18);
			Static340.aClass6_Sub12_Sub2_1.method6053(local15 + Static150.anInt2792);
			Static340.aClass6_Sub12_Sub2_1.method6058(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static318.method4962(local15, local18, local34);
		}
		if (local21 == 8) {
			Static274.anInt4851 = arg1;
			Static82.anInt1373 = 2;
			Static277.anInt4913 = arg0;
			Static496.anInt9106 = 0;
			Static534.method7063(Static510.aClass316_112);
			Static340.aClass6_Sub12_Sub2_1.method6032(local18 + Static154.anInt2878);
			Static340.aClass6_Sub12_Sub2_1.method6041(local15 + Static150.anInt2792);
			Static340.aClass6_Sub12_Sub2_1.method6045(Static184.aClass262_1.method6381(82) ? 1 : 0);
			Static340.aClass6_Sub12_Sub2_1.method6041(local25);
			Static209.method3412(local15, local18);
		}
		if (local21 == 9) {
			Static496.anInt9106 = 0;
			Static82.anInt1373 = 2;
			Static274.anInt4851 = arg1;
			Static277.anInt4913 = arg0;
			Static534.method7063(Static571.aClass316_119);
			Static340.aClass6_Sub12_Sub2_1.method6041(Static150.anInt2792 + local15);
			Static340.aClass6_Sub12_Sub2_1.method6058(local25);
			Static340.aClass6_Sub12_Sub2_1.method6058(local18 + Static154.anInt2878);
			Static340.aClass6_Sub12_Sub2_1.method6043(Static184.aClass262_1.method6381(82) ? 1 : 0);
			Static209.method3412(local15, local18);
		}
		if (local21 == 1009) {
			Static496.anInt9106 = 0;
			Static277.anInt4913 = arg0;
			Static274.anInt4851 = arg1;
			Static82.anInt1373 = 2;
			Static534.method7063(Static270.aClass316_59);
			Static340.aClass6_Sub12_Sub2_1.method6032(local25);
		}
		if (local21 == 13) {
			Static274.anInt4851 = arg1;
			Static82.anInt1373 = 2;
			Static496.anInt9106 = 0;
			Static277.anInt4913 = arg0;
			Static534.method7063(Static462.aClass316_105);
			Static340.aClass6_Sub12_Sub2_1.method6058(local15 + Static150.anInt2792);
			Static340.aClass6_Sub12_Sub2_1.method6041(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static340.aClass6_Sub12_Sub2_1.method6001(Static184.aClass262_1.method6381(82) ? 1 : 0);
			Static340.aClass6_Sub12_Sub2_1.method6032(local18 + Static154.anInt2878);
			Static318.method4962(local15, local18, local34);
		}
		if (local21 == 45) {
			Static82.anInt1373 = 2;
			Static496.anInt9106 = 0;
			Static277.anInt4913 = arg0;
			Static274.anInt4851 = arg1;
			Static534.method7063(Static77.aClass316_17);
			Static340.aClass6_Sub12_Sub2_1.method6041((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static340.aClass6_Sub12_Sub2_1.method6041(Static150.anInt2792 + local15);
			Static340.aClass6_Sub12_Sub2_1.method6045(Static184.aClass262_1.method6381(82) ? 1 : 0);
			Static340.aClass6_Sub12_Sub2_1.method6053(local18 + Static154.anInt2878);
			Static318.method4962(local15, local18, local34);
		}
		if (local21 == 3) {
			Static274.anInt4851 = arg1;
			Static277.anInt4913 = arg0;
			Static496.anInt9106 = 0;
			Static82.anInt1373 = 2;
			Static534.method7063(Static373.aClass316_84);
			Static340.aClass6_Sub12_Sub2_1.method6041(local25);
			Static340.aClass6_Sub12_Sub2_1.method6053(Static208.anInt3948);
			Static340.aClass6_Sub12_Sub2_1.method6032(local18 + Static154.anInt2878);
			Static340.aClass6_Sub12_Sub2_1.method6032(Static96.anInt7891);
			Static340.aClass6_Sub12_Sub2_1.method6047(Static184.aClass262_1.method6381(82) ? 1 : 0);
			Static340.aClass6_Sub12_Sub2_1.method6042(Static152.anInt1934);
			Static340.aClass6_Sub12_Sub2_1.method6032(local15 + Static150.anInt2792);
			Static209.method3412(local15, local18);
		}
		if (local21 == 1007) {
			Static82.anInt1373 = 2;
			Static274.anInt4851 = arg1;
			Static277.anInt4913 = arg0;
			Static496.anInt9106 = 0;
			Static534.method7063(Static545.aClass316_117);
			Static340.aClass6_Sub12_Sub2_1.method6032(local25);
		}
		if (local21 == 50 && Static200.aClass97_11 == null) {
			Static534.method7062(local18, local15);
			Static200.aClass97_11 = Static76.method1088(local18, local15);
			Static479.method6666(Static200.aClass97_11);
		}
		@Pc(772) Class15_Sub2_Sub4_Sub1 local772;
		@Pc(767) Class6_Sub49 local767;
		if (local21 == 59) {
			local767 = (Class6_Sub49) Static251.aClass234_29.method5464((long) local25);
			if (local767 != null) {
				local772 = local767.aClass15_Sub2_Sub4_Sub1_2;
				Static274.anInt4851 = arg1;
				Static496.anInt9106 = 0;
				Static82.anInt1373 = 2;
				Static277.anInt4913 = arg0;
				Static534.method7063(Static304.aClass316_69);
				Static340.aClass6_Sub12_Sub2_1.method6053(local25);
				Static340.aClass6_Sub12_Sub2_1.method6045(Static184.aClass262_1.method6381(82) ? 1 : 0);
				Static227.method3563(local772.method7135(), local772.method7135(), true, -2, local772.anIntArray638[0], 0, 0, local772.anIntArray637[0]);
			}
		}
		@Pc(833) Class97 local833;
		if (local21 == 23) {
			local833 = Static76.method1088(local18, local15);
			if (local833 != null) {
				Static269.method4026();
				@Pc(840) Class6_Sub39 local840 = Static74.method1044(local833);
				Static249.method3893(local840.anInt7309, local840.method5834(), local833);
				Static195.aString36 = Static484.method6806(local833);
				Static185.aString34 = local833.aString20 + "<col=ffffff>";
				if (Static195.aString36 == null) {
					Static195.aString36 = "Null";
				}
			}
			return;
		}
		if (local21 == 21) {
			if (Static113.anInt1927 > 0 && Static184.aClass262_1.method6381(82) && Static184.aClass262_1.method6381(81)) {
				Static103.method1603(Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98, local18 + Static154.anInt2878, local15 + Static150.anInt2792);
			} else {
				Static395.method5729(local18, local15, local25);
				if (local25 == 1) {
					Static340.aClass6_Sub12_Sub2_1.method6047(-1);
					Static340.aClass6_Sub12_Sub2_1.method6047(-1);
					Static340.aClass6_Sub12_Sub2_1.method6032((int) Static562.aFloat14);
					Static340.aClass6_Sub12_Sub2_1.method6047(57);
					Static340.aClass6_Sub12_Sub2_1.method6047(Static63.anInt1086);
					Static340.aClass6_Sub12_Sub2_1.method6047(Static213.anInt4015);
					Static340.aClass6_Sub12_Sub2_1.method6047(89);
					Static340.aClass6_Sub12_Sub2_1.method6032(Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911);
					Static340.aClass6_Sub12_Sub2_1.method6032(Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913);
					Static340.aClass6_Sub12_Sub2_1.method6047(63);
				} else {
					Static274.anInt4851 = arg1;
					Static496.anInt9106 = 0;
					Static82.anInt1373 = 1;
					Static277.anInt4913 = arg0;
				}
				Static227.method3563(1, 1, true, -4, local15, 0, 0, local18);
			}
		}
		if (local21 == 46) {
			local43 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local25];
			if (local43 != null) {
				Static274.anInt4851 = arg1;
				Static496.anInt9106 = 0;
				Static277.anInt4913 = arg0;
				Static82.anInt1373 = 2;
				Static534.method7063(Static301.aClass316_68);
				Static340.aClass6_Sub12_Sub2_1.method6041(local25);
				Static340.aClass6_Sub12_Sub2_1.method6047(Static184.aClass262_1.method6381(82) ? 1 : 0);
				Static227.method3563(local43.method7135(), local43.method7135(), true, -2, local43.anIntArray638[0], 0, 0, local43.anIntArray637[0]);
			}
		}
		if (local21 == 49) {
			local43 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local25];
			if (local43 != null) {
				Static82.anInt1373 = 2;
				Static274.anInt4851 = arg1;
				Static277.anInt4913 = arg0;
				Static496.anInt9106 = 0;
				Static534.method7063(Static570.aClass316_118);
				Static340.aClass6_Sub12_Sub2_1.method6058(local25);
				Static340.aClass6_Sub12_Sub2_1.method6045(Static184.aClass262_1.method6381(82) ? 1 : 0);
				Static227.method3563(local43.method7135(), local43.method7135(), true, -2, local43.anIntArray638[0], 0, 0, local43.anIntArray637[0]);
			}
		}
		if (local21 == 5) {
			local833 = Static76.method1088(local18, local15);
			if (local833 != null) {
				Static188.method48(local833);
			}
		}
		if (local21 == 1004) {
			Static82.anInt1373 = 2;
			Static274.anInt4851 = arg1;
			Static277.anInt4913 = arg0;
			Static496.anInt9106 = 0;
			local767 = (Class6_Sub49) Static251.aClass234_29.method5464((long) local25);
			if (local767 != null) {
				local772 = local767.aClass15_Sub2_Sub4_Sub1_2;
				@Pc(1140) Class88 local1140 = local772.aClass88_1;
				if (local1140.anIntArray182 != null) {
					local1140 = local1140.method1940(Static65.aClass51_1);
				}
				if (local1140 != null) {
					Static534.method7063(Static270.aClass316_60);
					Static340.aClass6_Sub12_Sub2_1.method6032(local1140.anInt2167);
				}
			}
		}
		if (local21 == 17) {
			Static496.anInt9106 = 0;
			Static277.anInt4913 = arg0;
			Static274.anInt4851 = arg1;
			Static82.anInt1373 = 2;
			Static534.method7063(Static107.aClass316_21);
			Static340.aClass6_Sub12_Sub2_1.method6053(local15 + Static150.anInt2792);
			Static340.aClass6_Sub12_Sub2_1.method6053(local25);
			Static340.aClass6_Sub12_Sub2_1.method6043(Static184.aClass262_1.method6381(82) ? 1 : 0);
			Static340.aClass6_Sub12_Sub2_1.method6053(Static154.anInt2878 + local18);
			Static209.method3412(local15, local18);
		}
		if (local21 == 11) {
			local767 = (Class6_Sub49) Static251.aClass234_29.method5464((long) local25);
			if (local767 != null) {
				Static82.anInt1373 = 2;
				local772 = local767.aClass15_Sub2_Sub4_Sub1_2;
				Static496.anInt9106 = 0;
				Static277.anInt4913 = arg0;
				Static274.anInt4851 = arg1;
				Static534.method7063(Static186.aClass316_43);
				Static340.aClass6_Sub12_Sub2_1.method6032(local25);
				Static340.aClass6_Sub12_Sub2_1.method6043(Static184.aClass262_1.method6381(82) ? 1 : 0);
				Static227.method3563(local772.method7135(), local772.method7135(), true, -2, local772.anIntArray638[0], 0, 0, local772.anIntArray637[0]);
			}
		}
		if (local21 == 18) {
			Static277.anInt4913 = arg0;
			Static274.anInt4851 = arg1;
			Static82.anInt1373 = 2;
			Static496.anInt9106 = 0;
			Static534.method7063(Static364.aClass316_83);
			Static340.aClass6_Sub12_Sub2_1.method6053(Static208.anInt3948);
			Static340.aClass6_Sub12_Sub2_1.method6043(Static184.aClass262_1.method6381(82) ? 1 : 0);
			Static340.aClass6_Sub12_Sub2_1.method6033(Static152.anInt1934);
			Static340.aClass6_Sub12_Sub2_1.method6053(Static150.anInt2792 + local15);
			Static340.aClass6_Sub12_Sub2_1.method6058(Static96.anInt7891);
			Static340.aClass6_Sub12_Sub2_1.method6058((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static340.aClass6_Sub12_Sub2_1.method6032(local18 + Static154.anInt2878);
			Static318.method4962(local15, local18, local34);
		}
		if (local21 == 20) {
			Static496.anInt9106 = 0;
			Static274.anInt4851 = arg1;
			Static82.anInt1373 = 2;
			Static277.anInt4913 = arg0;
			Static534.method7063(Static11.aClass316_4);
			Static340.aClass6_Sub12_Sub2_1.method6058(local15 + Static150.anInt2792);
			Static340.aClass6_Sub12_Sub2_1.method6058(local18 + Static154.anInt2878);
			Static340.aClass6_Sub12_Sub2_1.method6001(Static184.aClass262_1.method6381(82) ? 1 : 0);
			Static340.aClass6_Sub12_Sub2_1.method6053(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static318.method4962(local15, local18, local34);
		}
		if (local21 == 47) {
			Static82.anInt1373 = 2;
			Static496.anInt9106 = 0;
			Static277.anInt4913 = arg0;
			Static274.anInt4851 = arg1;
			Static534.method7063(Static461.aClass316_104);
			Static340.aClass6_Sub12_Sub2_1.method6058(local15 + Static150.anInt2792);
			Static340.aClass6_Sub12_Sub2_1.method6032((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static340.aClass6_Sub12_Sub2_1.method6043(Static184.aClass262_1.method6381(82) ? 1 : 0);
			Static340.aClass6_Sub12_Sub2_1.method6032(Static154.anInt2878 + local18);
			Static318.method4962(local15, local18, local34);
		}
		if (local21 == 51) {
			Static277.anInt4913 = arg0;
			Static82.anInt1373 = 2;
			Static496.anInt9106 = 0;
			Static274.anInt4851 = arg1;
			Static534.method7063(Static458.aClass316_102);
			Static340.aClass6_Sub12_Sub2_1.method6032(Static96.anInt7891);
			Static340.aClass6_Sub12_Sub2_1.method6002(Static152.anInt1934);
			Static340.aClass6_Sub12_Sub2_1.method6032(Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8924);
			Static340.aClass6_Sub12_Sub2_1.method6045(Static184.aClass262_1.method6381(82) ? 1 : 0);
			Static340.aClass6_Sub12_Sub2_1.method6032(Static208.anInt3948);
		}
		if (local21 == 30) {
			local43 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local25];
			if (local43 != null) {
				Static82.anInt1373 = 2;
				Static277.anInt4913 = arg0;
				Static274.anInt4851 = arg1;
				Static496.anInt9106 = 0;
				Static534.method7063(Static413.aClass316_92);
				Static340.aClass6_Sub12_Sub2_1.method6043(Static184.aClass262_1.method6381(82) ? 1 : 0);
				Static340.aClass6_Sub12_Sub2_1.method6032(local25);
				Static227.method3563(local43.method7135(), local43.method7135(), true, -2, local43.anIntArray638[0], 0, 0, local43.anIntArray637[0]);
			}
		}
		if (local21 == 58) {
			Static496.anInt9106 = 0;
			Static82.anInt1373 = 1;
			Static277.anInt4913 = arg0;
			Static274.anInt4851 = arg1;
			Static534.method7063(Static82.aClass316_18);
			Static340.aClass6_Sub12_Sub2_1.method6032(Static96.anInt7891);
			Static340.aClass6_Sub12_Sub2_1.method6042(Static152.anInt1934);
			Static340.aClass6_Sub12_Sub2_1.method6041(Static208.anInt3948);
			Static340.aClass6_Sub12_Sub2_1.method6053(Static150.anInt2792 + local15);
			Static340.aClass6_Sub12_Sub2_1.method6053(local18 + Static154.anInt2878);
			Static227.method3563(1, 1, true, -4, local15, 0, 0, local18);
		}
		if (local21 == 44) {
			local767 = (Class6_Sub49) Static251.aClass234_29.method5464((long) local25);
			if (local767 != null) {
				local772 = local767.aClass15_Sub2_Sub4_Sub1_2;
				Static82.anInt1373 = 2;
				Static496.anInt9106 = 0;
				Static274.anInt4851 = arg1;
				Static277.anInt4913 = arg0;
				Static534.method7063(Static318.aClass316_73);
				Static340.aClass6_Sub12_Sub2_1.method6053(Static96.anInt7891);
				Static340.aClass6_Sub12_Sub2_1.method6058(Static208.anInt3948);
				Static340.aClass6_Sub12_Sub2_1.method6006(Static152.anInt1934);
				Static340.aClass6_Sub12_Sub2_1.method6043(Static184.aClass262_1.method6381(82) ? 1 : 0);
				Static340.aClass6_Sub12_Sub2_1.method6032(local25);
				Static227.method3563(local772.method7135(), local772.method7135(), true, -2, local772.anIntArray638[0], 0, 0, local772.anIntArray637[0]);
			}
		}
		if (local21 == 57) {
			Static82.anInt1373 = 2;
			Static274.anInt4851 = arg1;
			Static277.anInt4913 = arg0;
			Static496.anInt9106 = 0;
			Static534.method7063(Static128.aClass316_32);
			Static340.aClass6_Sub12_Sub2_1.method6047(Static184.aClass262_1.method6381(82) ? 1 : 0);
			Static340.aClass6_Sub12_Sub2_1.method6032(local18 + Static154.anInt2878);
			Static340.aClass6_Sub12_Sub2_1.method6032(local25);
			Static340.aClass6_Sub12_Sub2_1.method6041(local15 + Static150.anInt2792);
			Static209.method3412(local15, local18);
		}
		if (local21 == 60 || local21 == 1012) {
			Static268.method4015(arg2.aString43, local25, local15, local18);
		}
		if (local21 == 2) {
			local767 = (Class6_Sub49) Static251.aClass234_29.method5464((long) local25);
			if (local767 != null) {
				Static496.anInt9106 = 0;
				Static277.anInt4913 = arg0;
				local772 = local767.aClass15_Sub2_Sub4_Sub1_2;
				Static82.anInt1373 = 2;
				Static274.anInt4851 = arg1;
				Static534.method7063(Static191.aClass316_46);
				Static340.aClass6_Sub12_Sub2_1.method6041(local25);
				Static340.aClass6_Sub12_Sub2_1.method6043(Static184.aClass262_1.method6381(82) ? 1 : 0);
				Static227.method3563(local772.method7135(), local772.method7135(), true, -2, local772.anIntArray638[0], 0, 0, local772.anIntArray637[0]);
			}
		}
		if (local21 == 19) {
			local767 = (Class6_Sub49) Static251.aClass234_29.method5464((long) local25);
			if (local767 != null) {
				Static277.anInt4913 = arg0;
				Static496.anInt9106 = 0;
				Static82.anInt1373 = 2;
				Static274.anInt4851 = arg1;
				local772 = local767.aClass15_Sub2_Sub4_Sub1_2;
				Static534.method7063(Static116.aClass316_25);
				Static340.aClass6_Sub12_Sub2_1.method6001(Static184.aClass262_1.method6381(82) ? 1 : 0);
				Static340.aClass6_Sub12_Sub2_1.method6058(local25);
				Static227.method3563(local772.method7135(), local772.method7135(), true, -2, local772.anIntArray638[0], 0, 0, local772.anIntArray637[0]);
			}
		}
		if (local21 == 25) {
			local767 = (Class6_Sub49) Static251.aClass234_29.method5464((long) local25);
			if (local767 != null) {
				local772 = local767.aClass15_Sub2_Sub4_Sub1_2;
				Static277.anInt4913 = arg0;
				Static82.anInt1373 = 2;
				Static274.anInt4851 = arg1;
				Static496.anInt9106 = 0;
				Static534.method7063(Static580.aClass316_123);
				Static340.aClass6_Sub12_Sub2_1.method6001(Static184.aClass262_1.method6381(82) ? 1 : 0);
				Static340.aClass6_Sub12_Sub2_1.method6032(local25);
				Static227.method3563(local772.method7135(), local772.method7135(), true, -2, local772.anIntArray638[0], 0, 0, local772.anIntArray637[0]);
			}
		}
		if (local21 == 10) {
			local43 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local25];
			if (local43 != null) {
				Static496.anInt9106 = 0;
				Static274.anInt4851 = arg1;
				Static82.anInt1373 = 2;
				Static277.anInt4913 = arg0;
				Static534.method7063(Static458.aClass316_102);
				Static340.aClass6_Sub12_Sub2_1.method6032(Static96.anInt7891);
				Static340.aClass6_Sub12_Sub2_1.method6002(Static152.anInt1934);
				Static340.aClass6_Sub12_Sub2_1.method6032(local25);
				Static340.aClass6_Sub12_Sub2_1.method6045(Static184.aClass262_1.method6381(82) ? 1 : 0);
				Static340.aClass6_Sub12_Sub2_1.method6032(Static208.anInt3948);
				Static227.method3563(local43.method7135(), local43.method7135(), true, -2, local43.anIntArray638[0], 0, 0, local43.anIntArray637[0]);
			}
		}
		if (local21 == 12) {
			local43 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local25];
			if (local43 != null) {
				Static82.anInt1373 = 2;
				Static274.anInt4851 = arg1;
				Static277.anInt4913 = arg0;
				Static496.anInt9106 = 0;
				Static534.method7063(Static436.aClass316_98);
				Static340.aClass6_Sub12_Sub2_1.method6043(Static184.aClass262_1.method6381(82) ? 1 : 0);
				Static340.aClass6_Sub12_Sub2_1.method6041(local25);
				Static227.method3563(local43.method7135(), local43.method7135(), true, -2, local43.anIntArray638[0], 0, 0, local43.anIntArray637[0]);
			}
		}
		if (local21 == 6) {
			if (Static113.anInt1927 > 0 && Static184.aClass262_1.method6381(82) && Static184.aClass262_1.method6381(81)) {
				Static103.method1603(Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98, Static154.anInt2878 + local18, Static150.anInt2792 - -local15);
			} else {
				Static82.anInt1373 = 1;
				Static274.anInt4851 = arg1;
				Static277.anInt4913 = arg0;
				Static496.anInt9106 = 0;
				Static534.method7063(Static94.aClass316_79);
				Static340.aClass6_Sub12_Sub2_1.method6041(Static150.anInt2792 + local15);
				Static340.aClass6_Sub12_Sub2_1.method6041(local18 + Static154.anInt2878);
			}
		}
		if (Static540.aBoolean580) {
			Static269.method4026();
		}
		if (Static69.aClass97_6 != null && Static141.anInt2741 == 0) {
			Static479.method6666(Static69.aClass97_6);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6092(@OriginalArg(1) String arg0) {
		if (Static175.aClass264Array1 != null) {
			Static534.method7063(Static263.aClass316_55);
			Static340.aClass6_Sub12_Sub2_1.method6047(Static314.method4913(arg0));
			Static340.aClass6_Sub12_Sub2_1.method6009(arg0);
		}
	}
}
