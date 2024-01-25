import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!dl", name = "E", descriptor = "I")
	public static int anInt1973;

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "(B)V")
	public static void method1439() {
		Static351.anInt6519 = Static215.aClass209_7.anInt6116 + Static215.aClass209_7.anInt6104 + 2;
		Static38.aStringArray6 = new String[500];
		Static176.anInt3856 = Static394.aClass209_10.anInt6116 + Static394.aClass209_10.anInt6104 + 2;
		for (@Pc(33) int local33 = 0; local33 < Static38.aStringArray6.length; local33++) {
			Static38.aStringArray6[local33] = "";
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZI)V")
	public static void method1441(@OriginalArg(1) int arg0) {
		if (!Static12.aClass34_Sub1_1.aBoolean450) {
			arg0 = -1;
		}
		if (Static235.anInt4651 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(30) Class104 local30 = Static60.aClass133_1.method3160(arg0);
			@Pc(34) Class266 local34 = local30.method2375();
			if (local34 == null) {
				arg0 = -1;
			} else {
				Static150.aClass183_3.method4152(Static443.aCanvas33, local34.method6060(), local34.method6057(), local34.method6048(), new Point(local30.anInt3207, local30.anInt3205));
				Static235.anInt4651 = arg0;
			}
		}
		if (arg0 == -1 && Static235.anInt4651 != -1) {
			Static150.aClass183_3.method4152(Static443.aCanvas33, -1, null, -1, new Point());
			Static235.anInt4651 = -1;
		}
	}

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "(B)Lclient!ij;")
	public static Class1_Sub1_Sub11 method1443() {
		@Pc(13) Class1_Sub1_Sub11 local13 = (Class1_Sub1_Sub11) Static445.aClass262_12.method5882();
		if (local13 != null) {
			local13.method6178();
			local13.method6125();
			return local13;
		}
		do {
			local13 = (Class1_Sub1_Sub11) Static223.aClass262_3.method5882();
			if (local13 == null) {
				return null;
			}
			if (local13.method2956() > Static250.method3737()) {
				return null;
			}
			local13.method6178();
			local13.method6125();
		} while ((local13.aLong227 & Long.MIN_VALUE) == 0L);
		return local13;
	}

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V")
	public static void method1444() {
		Static57.anInt1519 = -1;
		Static270.anInt5251 = -1;
		Static336.anInt6157 = 0;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)Z")
	public static boolean method1445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static1.method37(arg1, arg0) || Static408.method5554(arg1, arg0);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IILclient!pl;I)V")
	public static void method1447(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub35 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null || arg1 == Static401.aClass203_47.aClass1_195) {
			return;
		}
		@Pc(15) int local15 = arg1.anInt5842;
		@Pc(18) int local18 = arg1.anInt5841;
		@Pc(21) int local21 = arg1.anInt5839;
		@Pc(25) int local25 = (int) arg1.aLong166;
		@Pc(28) long local28 = arg1.aLong166;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(54) Class1_Sub27 local54;
		@Pc(59) Class30_Sub1_Sub1_Sub1 local59;
		if (local21 == 1010) {
			Static233.anInt4625 = 0;
			Static311.anInt5837 = arg2;
			Static411.anInt7339 = arg0;
			Static349.anInt6472 = 2;
			local54 = (Class1_Sub27) Static24.aClass38_3.method765((long) local25);
			if (local54 != null) {
				local59 = local54.aClass30_Sub1_Sub1_Sub1_2;
				@Pc(62) Class11 local62 = local59.aClass11_1;
				if (local62.anIntArray12 != null) {
					local62 = local62.method136(Static366.aClass190_1);
				}
				if (local62 != null) {
					Static32.method677(Static406.aClass177_63);
					Static433.aClass1_Sub3_Sub1_11.method1227(local62.anInt187);
				}
			}
		}
		@Pc(92) Class68 local92;
		if (local21 == 51) {
			local92 = Static115.method1866(local18, local15);
			if (local92 != null) {
				Static301.method4358(local92);
			}
		}
		if (local21 == 4) {
			Static411.anInt7339 = arg0;
			Static233.anInt4625 = 0;
			Static349.anInt6472 = 2;
			Static311.anInt5837 = arg2;
			Static32.method677(Static150.aClass177_46);
			Static433.aClass1_Sub3_Sub1_11.method1184(Static380.anInt6896 + local18);
			Static433.aClass1_Sub3_Sub1_11.method1223(local25);
			Static433.aClass1_Sub3_Sub1_11.method1227(Static278.anInt5374 + local15);
			Static433.aClass1_Sub3_Sub1_11.method1227(Static189.anInt3984);
			Static433.aClass1_Sub3_Sub1_11.method1208(Static414.aClass48_1.method1119(82) ? 1 : 0);
			Static433.aClass1_Sub3_Sub1_11.method1223(Static118.anInt2743);
			Static433.aClass1_Sub3_Sub1_11.method1163(Static132.anInt2941);
			Static325.method4628(local15, local18);
		}
		if (local21 == 5) {
			local54 = (Class1_Sub27) Static24.aClass38_3.method765((long) local25);
			if (local54 != null) {
				Static311.anInt5837 = arg2;
				Static411.anInt7339 = arg0;
				local59 = local54.aClass30_Sub1_Sub1_Sub1_2;
				Static349.anInt6472 = 2;
				Static233.anInt4625 = 0;
				Static32.method677(Static109.aClass177_35);
				Static433.aClass1_Sub3_Sub1_11.method1208(Static414.aClass48_1.method1119(82) ? 1 : 0);
				Static433.aClass1_Sub3_Sub1_11.method1204(Static132.anInt2941);
				Static433.aClass1_Sub3_Sub1_11.method1184(local25);
				Static433.aClass1_Sub3_Sub1_11.method1223(Static189.anInt3984);
				Static433.aClass1_Sub3_Sub1_11.method1184(Static118.anInt2743);
				Static56.method1067(0, -2, local59.anIntArray130[0], local59.anIntArray129[0], 0, true, local59.method944(), local59.method944());
			}
		}
		if (local21 == 16) {
			Static311.anInt5837 = arg2;
			Static349.anInt6472 = 2;
			Static233.anInt4625 = 0;
			Static411.anInt7339 = arg0;
			Static32.method677(Static223.aClass177_60);
			Static433.aClass1_Sub3_Sub1_11.method1167(Static132.anInt2941);
			Static433.aClass1_Sub3_Sub1_11.method1223(Static429.aClass30_Sub1_Sub1_Sub2_2.anInt1299);
			Static433.aClass1_Sub3_Sub1_11.method1223(Static118.anInt2743);
			Static433.aClass1_Sub3_Sub1_11.method1223(Static189.anInt3984);
			Static433.aClass1_Sub3_Sub1_11.method1175(Static414.aClass48_1.method1119(82) ? 1 : 0);
		}
		@Pc(299) Class30_Sub1_Sub1_Sub2 local299;
		if (local21 == 58) {
			local299 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local25];
			if (local299 != null) {
				Static411.anInt7339 = arg0;
				Static349.anInt6472 = 2;
				Static233.anInt4625 = 0;
				Static311.anInt5837 = arg2;
				Static32.method677(Static266.aClass177_73);
				Static433.aClass1_Sub3_Sub1_11.method1223(local25);
				Static433.aClass1_Sub3_Sub1_11.method1164(Static414.aClass48_1.method1119(82) ? 1 : 0);
				Static56.method1067(0, -2, local299.anIntArray130[0], local299.anIntArray129[0], 0, true, local299.method944(), local299.method944());
			}
		}
		if (local21 == 59) {
			local54 = (Class1_Sub27) Static24.aClass38_3.method765((long) local25);
			if (local54 != null) {
				Static311.anInt5837 = arg2;
				Static349.anInt6472 = 2;
				Static233.anInt4625 = 0;
				local59 = local54.aClass30_Sub1_Sub1_Sub1_2;
				Static411.anInt7339 = arg0;
				Static32.method677(Static118.aClass177_39);
				Static433.aClass1_Sub3_Sub1_11.method1223(local25);
				Static433.aClass1_Sub3_Sub1_11.method1208(Static414.aClass48_1.method1119(82) ? 1 : 0);
				Static56.method1067(0, -2, local59.anIntArray130[0], local59.anIntArray129[0], 0, true, local59.method944(), local59.method944());
			}
		}
		if (local21 == 12) {
			local54 = (Class1_Sub27) Static24.aClass38_3.method765((long) local25);
			if (local54 != null) {
				Static349.anInt6472 = 2;
				Static311.anInt5837 = arg2;
				Static411.anInt7339 = arg0;
				Static233.anInt4625 = 0;
				local59 = local54.aClass30_Sub1_Sub1_Sub1_2;
				Static32.method677(Static352.aClass177_91);
				Static433.aClass1_Sub3_Sub1_11.method1227(local25);
				Static433.aClass1_Sub3_Sub1_11.method1208(Static414.aClass48_1.method1119(82) ? 1 : 0);
				Static56.method1067(0, -2, local59.anIntArray130[0], local59.anIntArray129[0], 0, true, local59.method944(), local59.method944());
			}
		}
		if (local21 == 23) {
			if (Static41.anInt1052 > 0 && Static414.aClass48_1.method1119(82) && Static414.aClass48_1.method1119(81)) {
				Static147.method2349(local18 + Static380.anInt6896, Static278.anInt5374 - -local15, Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102);
			} else {
				Static285.method4175(local25, local18, local15);
				if (local25 == 1) {
					Static433.aClass1_Sub3_Sub1_11.method1208(-1);
					Static433.aClass1_Sub3_Sub1_11.method1208(-1);
					Static433.aClass1_Sub3_Sub1_11.method1227((int) Static267.aFloat83);
					Static433.aClass1_Sub3_Sub1_11.method1208(57);
					Static433.aClass1_Sub3_Sub1_11.method1208(Static217.anInt4366);
					Static433.aClass1_Sub3_Sub1_11.method1208(Static135.anInt3022);
					Static433.aClass1_Sub3_Sub1_11.method1208(89);
					Static433.aClass1_Sub3_Sub1_11.method1227(Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490);
					Static433.aClass1_Sub3_Sub1_11.method1227(Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488);
					Static433.aClass1_Sub3_Sub1_11.method1208(63);
				} else {
					Static311.anInt5837 = arg2;
					Static349.anInt6472 = 1;
					Static411.anInt7339 = arg0;
					Static233.anInt4625 = 0;
				}
				Static56.method1067(0, -4, local15, local18, 0, true, 1, 1);
			}
		}
		if (local21 == 47 && Static18.aClass68_1 == null) {
			Static251.method3744(local15, local18);
			Static18.aClass68_1 = Static115.method1866(local18, local15);
			Static446.method6042(Static18.aClass68_1);
		}
		if (local21 == 19) {
			Static311.anInt5837 = arg2;
			Static349.anInt6472 = 2;
			Static233.anInt4625 = 0;
			Static411.anInt7339 = arg0;
			Static32.method677(Static332.aClass177_89);
			Static433.aClass1_Sub3_Sub1_11.method1184(Static380.anInt6896 + local18);
			Static433.aClass1_Sub3_Sub1_11.method1184(Static278.anInt5374 + local15);
			Static433.aClass1_Sub3_Sub1_11.method1175(Static414.aClass48_1.method1119(82) ? 1 : 0);
			Static433.aClass1_Sub3_Sub1_11.method1227(local25);
			Static325.method4628(local15, local18);
		}
		if (local21 == 30) {
			Static233.anInt4625 = 0;
			Static349.anInt6472 = 2;
			Static311.anInt5837 = arg2;
			Static411.anInt7339 = arg0;
			Static32.method677(Static447.aClass177_110);
			Static433.aClass1_Sub3_Sub1_11.method1205(Static278.anInt5374 + local15);
			Static433.aClass1_Sub3_Sub1_11.method1227(local25);
			Static433.aClass1_Sub3_Sub1_11.method1223(Static380.anInt6896 + local18);
			Static433.aClass1_Sub3_Sub1_11.method1208(Static414.aClass48_1.method1119(82) ? 1 : 0);
			Static325.method4628(local15, local18);
		}
		if (local21 == 2) {
			local92 = Static115.method1866(local18, local15);
			if (local92 != null) {
				Static192.method3103();
				@Pc(732) Class1_Sub29 local732 = Static55.method1059(local92);
				Static61.method1144(local732.method4026(), local732.anInt5254, local92);
				Static1.aString1 = Static153.method3991(local92);
				Static90.aString17 = local92.aString18 + "<col=ffffff>";
				if (Static1.aString1 == null) {
					Static1.aString1 = "Null";
				}
			}
			return;
		}
		if (local21 == 22) {
			Static411.anInt7339 = arg0;
			Static233.anInt4625 = 0;
			Static311.anInt5837 = arg2;
			Static349.anInt6472 = 2;
			Static32.method677(Static326.aClass177_84);
			Static433.aClass1_Sub3_Sub1_11.method1184(Static118.anInt2743);
			Static433.aClass1_Sub3_Sub1_11.method1223(Static189.anInt3984);
			Static433.aClass1_Sub3_Sub1_11.method1164(Static414.aClass48_1.method1119(82) ? 1 : 0);
			Static433.aClass1_Sub3_Sub1_11.method1197(Static132.anInt2941);
			Static433.aClass1_Sub3_Sub1_11.method1184(local15 + Static278.anInt5374);
			Static433.aClass1_Sub3_Sub1_11.method1223(local18 + Static380.anInt6896);
			Static433.aClass1_Sub3_Sub1_11.method1184((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static268.method3980(local15, local28, local18);
		}
		if (local21 == 57) {
			local54 = (Class1_Sub27) Static24.aClass38_3.method765((long) local25);
			if (local54 != null) {
				Static311.anInt5837 = arg2;
				Static233.anInt4625 = 0;
				Static411.anInt7339 = arg0;
				Static349.anInt6472 = 2;
				local59 = local54.aClass30_Sub1_Sub1_Sub1_2;
				Static32.method677(Static43.aClass177_18);
				Static433.aClass1_Sub3_Sub1_11.method1223(local25);
				Static433.aClass1_Sub3_Sub1_11.method1209(Static414.aClass48_1.method1119(82) ? 1 : 0);
				Static56.method1067(0, -2, local59.anIntArray130[0], local59.anIntArray129[0], 0, true, local59.method944(), local59.method944());
			}
		}
		if (local21 == 49) {
			Static311.anInt5837 = arg2;
			Static233.anInt4625 = 0;
			Static411.anInt7339 = arg0;
			Static349.anInt6472 = 2;
			Static32.method677(Static268.aClass177_74);
			Static433.aClass1_Sub3_Sub1_11.method1184(Static380.anInt6896 + local18);
			Static433.aClass1_Sub3_Sub1_11.method1184(local15 + Static278.anInt5374);
			Static433.aClass1_Sub3_Sub1_11.method1227(local25);
			Static433.aClass1_Sub3_Sub1_11.method1208(Static414.aClass48_1.method1119(82) ? 1 : 0);
			Static325.method4628(local15, local18);
		}
		if (local21 == 46) {
			local299 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local25];
			if (local299 != null) {
				Static411.anInt7339 = arg0;
				Static233.anInt4625 = 0;
				Static349.anInt6472 = 2;
				Static311.anInt5837 = arg2;
				Static32.method677(Static223.aClass177_60);
				Static433.aClass1_Sub3_Sub1_11.method1167(Static132.anInt2941);
				Static433.aClass1_Sub3_Sub1_11.method1223(local25);
				Static433.aClass1_Sub3_Sub1_11.method1223(Static118.anInt2743);
				Static433.aClass1_Sub3_Sub1_11.method1223(Static189.anInt3984);
				Static433.aClass1_Sub3_Sub1_11.method1175(Static414.aClass48_1.method1119(82) ? 1 : 0);
				Static56.method1067(0, -2, local299.anIntArray130[0], local299.anIntArray129[0], 0, true, local299.method944(), local299.method944());
			}
		}
		if (local21 == 15) {
			Static349.anInt6472 = 2;
			Static233.anInt4625 = 0;
			Static311.anInt5837 = arg2;
			Static411.anInt7339 = arg0;
			Static32.method677(Static221.aClass177_59);
			Static433.aClass1_Sub3_Sub1_11.method1227(local25);
			Static433.aClass1_Sub3_Sub1_11.method1209(Static414.aClass48_1.method1119(82) ? 1 : 0);
			Static433.aClass1_Sub3_Sub1_11.method1227(Static380.anInt6896 + local18);
			Static433.aClass1_Sub3_Sub1_11.method1205(Static278.anInt5374 + local15);
			Static325.method4628(local15, local18);
		}
		if (local21 == 45) {
			Static411.anInt7339 = arg0;
			Static233.anInt4625 = 0;
			Static349.anInt6472 = 2;
			Static311.anInt5837 = arg2;
			Static32.method677(Static237.aClass177_64);
			Static433.aClass1_Sub3_Sub1_11.method1184(local15 + Static278.anInt5374);
			Static433.aClass1_Sub3_Sub1_11.method1184(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static433.aClass1_Sub3_Sub1_11.method1227(Static380.anInt6896 + local18);
			Static433.aClass1_Sub3_Sub1_11.method1208(Static414.aClass48_1.method1119(82) ? 1 : 0);
			Static268.method3980(local15, local28, local18);
		}
		if (local21 == 11) {
			Static349.anInt6472 = 2;
			Static311.anInt5837 = arg2;
			Static411.anInt7339 = arg0;
			Static233.anInt4625 = 0;
			Static32.method677(Static231.aClass177_62);
			Static433.aClass1_Sub3_Sub1_11.method1227(Static278.anInt5374 + local15);
			Static433.aClass1_Sub3_Sub1_11.method1205(local25);
			Static433.aClass1_Sub3_Sub1_11.method1205(local18 + Static380.anInt6896);
			Static433.aClass1_Sub3_Sub1_11.method1208(Static414.aClass48_1.method1119(82) ? 1 : 0);
			Static325.method4628(local15, local18);
		}
		if (local21 == 60) {
			Static349.anInt6472 = 1;
			Static411.anInt7339 = arg0;
			Static233.anInt4625 = 0;
			Static311.anInt5837 = arg2;
			Static32.method677(Static422.aClass177_105);
			Static433.aClass1_Sub3_Sub1_11.method1205(Static278.anInt5374 + local15);
			Static433.aClass1_Sub3_Sub1_11.method1184(Static380.anInt6896 + local18);
			Static433.aClass1_Sub3_Sub1_11.method1223(Static118.anInt2743);
			Static433.aClass1_Sub3_Sub1_11.method1227(Static189.anInt3984);
			Static433.aClass1_Sub3_Sub1_11.method1197(Static132.anInt2941);
			Static56.method1067(0, -4, local15, local18, 0, true, 1, 1);
		}
		if (local21 == 25) {
			if (Static41.anInt1052 > 0 && Static414.aClass48_1.method1119(82) && Static414.aClass48_1.method1119(81)) {
				Static147.method2349(local18 + Static380.anInt6896, local15 + Static278.anInt5374, Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102);
			} else {
				Static411.anInt7339 = arg0;
				Static311.anInt5837 = arg2;
				Static233.anInt4625 = 0;
				Static349.anInt6472 = 1;
				Static32.method677(Static414.aClass177_103);
				Static433.aClass1_Sub3_Sub1_11.method1184(local18 + Static380.anInt6896);
				Static433.aClass1_Sub3_Sub1_11.method1205(Static278.anInt5374 + local15);
			}
		}
		if (local21 == 1011) {
			Static233.anInt4625 = 0;
			Static349.anInt6472 = 2;
			Static411.anInt7339 = arg0;
			Static311.anInt5837 = arg2;
			Static32.method677(Static21.aClass177_97);
			Static433.aClass1_Sub3_Sub1_11.method1227(local25);
		}
		if (local21 == 44) {
			local299 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local25];
			if (local299 != null) {
				Static311.anInt5837 = arg2;
				Static411.anInt7339 = arg0;
				Static349.anInt6472 = 2;
				Static233.anInt4625 = 0;
				Static32.method677(Static83.aClass177_29);
				Static433.aClass1_Sub3_Sub1_11.method1209(Static414.aClass48_1.method1119(82) ? 1 : 0);
				Static433.aClass1_Sub3_Sub1_11.method1227(local25);
				Static56.method1067(0, -2, local299.anIntArray130[0], local299.anIntArray129[0], 0, true, local299.method944(), local299.method944());
			}
		}
		if (local21 == 20) {
			Static349.anInt6472 = 2;
			Static311.anInt5837 = arg2;
			Static411.anInt7339 = arg0;
			Static233.anInt4625 = 0;
			Static32.method677(Static342.aClass177_88);
			Static433.aClass1_Sub3_Sub1_11.method1205(local18 + Static380.anInt6896);
			Static433.aClass1_Sub3_Sub1_11.method1208(Static414.aClass48_1.method1119(82) ? 1 : 0);
			Static433.aClass1_Sub3_Sub1_11.method1184(local15 + Static278.anInt5374);
			Static433.aClass1_Sub3_Sub1_11.method1205(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static268.method3980(local15, local28, local18);
		}
		if (local21 == 10) {
			local299 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local25];
			if (local299 != null) {
				Static311.anInt5837 = arg2;
				Static233.anInt4625 = 0;
				Static411.anInt7339 = arg0;
				Static349.anInt6472 = 2;
				Static32.method677(Static31.aClass177_31);
				Static433.aClass1_Sub3_Sub1_11.method1164(Static414.aClass48_1.method1119(82) ? 1 : 0);
				Static433.aClass1_Sub3_Sub1_11.method1184(local25);
				Static56.method1067(0, -2, local299.anIntArray130[0], local299.anIntArray129[0], 0, true, local299.method944(), local299.method944());
			}
		}
		if (local21 == 17) {
			Static411.anInt7339 = arg0;
			Static311.anInt5837 = arg2;
			Static233.anInt4625 = 0;
			Static349.anInt6472 = 2;
			Static32.method677(Static144.aClass177_44);
			Static433.aClass1_Sub3_Sub1_11.method1209(Static414.aClass48_1.method1119(82) ? 1 : 0);
			Static433.aClass1_Sub3_Sub1_11.method1184(Static278.anInt5374 + local15);
			Static433.aClass1_Sub3_Sub1_11.method1227((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static433.aClass1_Sub3_Sub1_11.method1205(Static380.anInt6896 + local18);
			Static268.method3980(local15, local28, local18);
		}
		if (local21 == 3) {
			local54 = (Class1_Sub27) Static24.aClass38_3.method765((long) local25);
			if (local54 != null) {
				local59 = local54.aClass30_Sub1_Sub1_Sub1_2;
				Static411.anInt7339 = arg0;
				Static311.anInt5837 = arg2;
				Static233.anInt4625 = 0;
				Static349.anInt6472 = 2;
				Static32.method677(Static100.aClass177_32);
				Static433.aClass1_Sub3_Sub1_11.method1205(local25);
				Static433.aClass1_Sub3_Sub1_11.method1164(Static414.aClass48_1.method1119(82) ? 1 : 0);
				Static56.method1067(0, -2, local59.anIntArray130[0], local59.anIntArray129[0], 0, true, local59.method944(), local59.method944());
			}
		}
		if (local21 == 13) {
			local299 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local25];
			if (local299 != null) {
				Static311.anInt5837 = arg2;
				Static349.anInt6472 = 2;
				Static411.anInt7339 = arg0;
				Static233.anInt4625 = 0;
				Static32.method677(Static363.aClass177_95);
				Static433.aClass1_Sub3_Sub1_11.method1223(local25);
				Static433.aClass1_Sub3_Sub1_11.method1209(Static414.aClass48_1.method1119(82) ? 1 : 0);
				Static56.method1067(0, -2, local299.anIntArray130[0], local299.anIntArray129[0], 0, true, local299.method944(), local299.method944());
			}
		}
		if (local21 == 21) {
			local54 = (Class1_Sub27) Static24.aClass38_3.method765((long) local25);
			if (local54 != null) {
				Static311.anInt5837 = arg2;
				Static233.anInt4625 = 0;
				Static349.anInt6472 = 2;
				local59 = local54.aClass30_Sub1_Sub1_Sub1_2;
				Static411.anInt7339 = arg0;
				Static32.method677(Static279.aClass177_80);
				Static433.aClass1_Sub3_Sub1_11.method1184(local25);
				Static433.aClass1_Sub3_Sub1_11.method1164(Static414.aClass48_1.method1119(82) ? 1 : 0);
				Static56.method1067(0, -2, local59.anIntArray130[0], local59.anIntArray129[0], 0, true, local59.method944(), local59.method944());
			}
		}
		if (local21 == 50) {
			local299 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local25];
			if (local299 != null) {
				Static233.anInt4625 = 0;
				Static349.anInt6472 = 2;
				Static411.anInt7339 = arg0;
				Static311.anInt5837 = arg2;
				Static32.method677(Static219.aClass177_58);
				Static433.aClass1_Sub3_Sub1_11.method1223(local25);
				Static433.aClass1_Sub3_Sub1_11.method1208(Static414.aClass48_1.method1119(82) ? 1 : 0);
				Static56.method1067(0, -2, local299.anIntArray130[0], local299.anIntArray129[0], 0, true, local299.method944(), local299.method944());
			}
		}
		if (local21 == 1007) {
			Static233.anInt4625 = 0;
			Static311.anInt5837 = arg2;
			Static349.anInt6472 = 2;
			Static411.anInt7339 = arg0;
			Static32.method677(Static439.aClass177_108);
			Static433.aClass1_Sub3_Sub1_11.method1227(local25);
		}
		if (local21 == 1004 || local21 == 1001 || local21 == 1003 || local21 == 1008 || local21 == 1012) {
			Static92.method1569(local21, local25, local15);
		}
		if (local21 == 1002) {
			Static233.anInt4625 = 0;
			Static349.anInt6472 = 2;
			Static411.anInt7339 = arg0;
			Static311.anInt5837 = arg2;
			Static32.method677(Static168.aClass177_26);
			Static433.aClass1_Sub3_Sub1_11.method1223(Static278.anInt5374 + local15);
			Static433.aClass1_Sub3_Sub1_11.method1227(Static380.anInt6896 + local18);
			Static433.aClass1_Sub3_Sub1_11.method1164(Static414.aClass48_1.method1119(82) ? 1 : 0);
			Static433.aClass1_Sub3_Sub1_11.method1205((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static268.method3980(local15, local28, local18);
		}
		if (local21 == 48) {
			Static311.anInt5837 = arg2;
			Static411.anInt7339 = arg0;
			Static349.anInt6472 = 2;
			Static233.anInt4625 = 0;
			Static32.method677(Static45.aClass177_19);
			Static433.aClass1_Sub3_Sub1_11.method1164(Static414.aClass48_1.method1119(82) ? 1 : 0);
			Static433.aClass1_Sub3_Sub1_11.method1184(local15 + Static278.anInt5374);
			Static433.aClass1_Sub3_Sub1_11.method1184(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static433.aClass1_Sub3_Sub1_11.method1227(local18 + Static380.anInt6896);
			Static268.method3980(local15, local28, local18);
		}
		if (local21 == 6) {
			local299 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local25];
			if (local299 != null) {
				Static311.anInt5837 = arg2;
				Static411.anInt7339 = arg0;
				Static233.anInt4625 = 0;
				Static349.anInt6472 = 2;
				Static32.method677(Static63.aClass177_27);
				Static433.aClass1_Sub3_Sub1_11.method1208(Static414.aClass48_1.method1119(82) ? 1 : 0);
				Static433.aClass1_Sub3_Sub1_11.method1184(local25);
				Static56.method1067(0, -2, local299.anIntArray130[0], local299.anIntArray129[0], 0, true, local299.method944(), local299.method944());
			}
		}
		if (local21 == 18 || local21 == 1009) {
			Static358.method5056(local15, arg1.aString54, local18, local25);
		}
		if (local21 == 9) {
			local299 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local25];
			if (local299 != null) {
				Static311.anInt5837 = arg2;
				Static233.anInt4625 = 0;
				Static411.anInt7339 = arg0;
				Static349.anInt6472 = 2;
				Static32.method677(Static13.aClass177_48);
				Static433.aClass1_Sub3_Sub1_11.method1205(local25);
				Static433.aClass1_Sub3_Sub1_11.method1175(Static414.aClass48_1.method1119(82) ? 1 : 0);
				Static56.method1067(0, -2, local299.anIntArray130[0], local299.anIntArray129[0], 0, true, local299.method944(), local299.method944());
			}
		}
		if (local21 == 8) {
			local299 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local25];
			if (local299 != null) {
				Static233.anInt4625 = 0;
				Static349.anInt6472 = 2;
				Static311.anInt5837 = arg2;
				Static411.anInt7339 = arg0;
				Static32.method677(Static347.aClass177_90);
				Static433.aClass1_Sub3_Sub1_11.method1208(Static414.aClass48_1.method1119(82) ? 1 : 0);
				Static433.aClass1_Sub3_Sub1_11.method1205(local25);
				Static56.method1067(0, -2, local299.anIntArray130[0], local299.anIntArray129[0], 0, true, local299.method944(), local299.method944());
			}
		}
		if (Static293.aBoolean300) {
			Static192.method3103();
		}
		if (Static423.aClass68_16 != null && Static353.anInt7449 == 0) {
			Static446.method6042(Static423.aClass68_16);
		}
	}
}
