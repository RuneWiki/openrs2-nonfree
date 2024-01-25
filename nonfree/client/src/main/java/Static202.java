import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!jv", name = "n", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray7;

	@OriginalMember(owner = "client!jv", name = "c", descriptor = "[I")
	public static final int[] anIntArray271 = new int[500];

	@OriginalMember(owner = "client!jv", name = "q", descriptor = "I")
	public static int anInt3800 = 0;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILclient!tb;ZI)V")
	public static void method3123(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub40 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null || arg1 == Static292.aClass244_25.aClass6_220) {
			return;
		}
		@Pc(15) int local15 = arg1.anInt6719;
		@Pc(18) int local18 = arg1.anInt6720;
		@Pc(21) int local21 = arg1.anInt6722;
		@Pc(25) int local25 = (int) arg1.aLong192;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(32) long local32 = arg1.aLong192;
		if (local21 == 6) {
			Static312.anInt5455 = 2;
			Static391.anInt6975 = arg2;
			Static49.anInt1319 = 0;
			Static248.anInt7514 = arg0;
			Static403.method5961(Static233.aClass92_86);
			Static109.aClass6_Sub1_Sub1_5.method6479(local15 + Static2.anInt6396);
			Static109.aClass6_Sub1_Sub1_5.method6439(Static54.aClass187_1.method4602(82) ? 1 : 0);
			Static109.aClass6_Sub1_Sub1_5.method6479(local25);
			Static109.aClass6_Sub1_Sub1_5.method6453(local18 + Static348.anInt6273);
			Static242.method3798(local15, local18);
		}
		@Pc(92) Class3_Sub2_Sub1_Sub2 local92;
		if (local21 == 8) {
			local92 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local25];
			if (local92 != null) {
				Static49.anInt1319 = 0;
				Static312.anInt5455 = 2;
				Static391.anInt6975 = arg2;
				Static248.anInt7514 = arg0;
				Static403.method5961(Static180.aClass92_61);
				Static109.aClass6_Sub1_Sub1_5.method6464(local25);
				Static109.aClass6_Sub1_Sub1_5.method6456(Static54.aClass187_1.method4602(82) ? 1 : 0);
				Static292.method4382(true, local92.anIntArray458[0], 0, local92.anIntArray459[0], local92.method5521(), 0, local92.method5521(), -2);
			}
		}
		@Pc(152) Class3_Sub2_Sub1_Sub1 local152;
		if (local21 == 4) {
			local152 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local25];
			if (local152 != null) {
				Static312.anInt5455 = 2;
				Static49.anInt1319 = 0;
				Static248.anInt7514 = arg0;
				Static391.anInt6975 = arg2;
				Static403.method5961(Static36.aClass92_15);
				Static109.aClass6_Sub1_Sub1_5.method6481(Static54.aClass187_1.method4602(82) ? 1 : 0);
				Static109.aClass6_Sub1_Sub1_5.method6436(local25);
				Static292.method4382(true, local152.anIntArray458[0], 0, local152.anIntArray459[0], local152.method5521(), 0, local152.method5521(), -2);
			}
		}
		if (local21 == 1009) {
			Static391.anInt6975 = arg2;
			Static49.anInt1319 = 0;
			Static312.anInt5455 = 2;
			Static248.anInt7514 = arg0;
			local152 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local25];
			if (local152 != null) {
				@Pc(227) Class48 local227 = local152.aClass48_1;
				if (local227.anIntArray103 != null) {
					local227 = local227.method1378(Static393.aClass207_1);
				}
				if (local227 != null) {
					Static403.method5961(Static223.aClass92_78);
					Static109.aClass6_Sub1_Sub1_5.method6453(local227.anInt1777);
				}
			}
		}
		if (local21 == 1002) {
			Static248.anInt7514 = arg0;
			Static49.anInt1319 = 0;
			Static312.anInt5455 = 2;
			Static391.anInt6975 = arg2;
			Static403.method5961(Static65.aClass92_38);
			Static109.aClass6_Sub1_Sub1_5.method6453(local25);
		}
		if (local21 == 30) {
			local152 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local25];
			if (local152 != null) {
				Static391.anInt6975 = arg2;
				Static49.anInt1319 = 0;
				Static248.anInt7514 = arg0;
				Static312.anInt5455 = 2;
				Static403.method5961(Static328.aClass92_114);
				Static109.aClass6_Sub1_Sub1_5.method6464(local25);
				Static109.aClass6_Sub1_Sub1_5.method6439(Static54.aClass187_1.method4602(82) ? 1 : 0);
				Static292.method4382(true, local152.anIntArray458[0], 0, local152.anIntArray459[0], local152.method5521(), 0, local152.method5521(), -2);
			}
		}
		if (local21 == 58) {
			if (Static291.anInt5199 > 0 && Static54.aClass187_1.method4602(82) && Static54.aClass187_1.method4602(81)) {
				Static235.method3638(Static348.anInt6273 + local18, local15 + Static2.anInt6396, Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103);
			} else {
				Static293.method301(local25, local18, local15);
				if (local25 == 1) {
					Static109.aClass6_Sub1_Sub1_5.method6439(-1);
					Static109.aClass6_Sub1_Sub1_5.method6439(-1);
					Static109.aClass6_Sub1_Sub1_5.method6453((int) Static265.aFloat51);
					Static109.aClass6_Sub1_Sub1_5.method6439(57);
					Static109.aClass6_Sub1_Sub1_5.method6439(Static439.anInt418);
					Static109.aClass6_Sub1_Sub1_5.method6439(Static280.anInt5012);
					Static109.aClass6_Sub1_Sub1_5.method6439(89);
					Static109.aClass6_Sub1_Sub1_5.method6453(Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7202);
					Static109.aClass6_Sub1_Sub1_5.method6453(Static302.aClass3_Sub2_Sub1_Sub2_2.anInt7207);
					Static109.aClass6_Sub1_Sub1_5.method6439(63);
				} else {
					Static248.anInt7514 = arg0;
					Static391.anInt6975 = arg2;
					Static312.anInt5455 = 1;
					Static49.anInt1319 = 0;
				}
				Static292.method4382(true, local15, 0, local18, 1, 0, 1, -4);
			}
		}
		if (local21 == 51) {
			local152 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local25];
			if (local152 != null) {
				Static312.anInt5455 = 2;
				Static391.anInt6975 = arg2;
				Static49.anInt1319 = 0;
				Static248.anInt7514 = arg0;
				Static403.method5961(Static102.aClass92_37);
				Static109.aClass6_Sub1_Sub1_5.method6464(local25);
				Static109.aClass6_Sub1_Sub1_5.method6439(Static54.aClass187_1.method4602(82) ? 1 : 0);
				Static292.method4382(true, local152.anIntArray458[0], 0, local152.anIntArray459[0], local152.method5521(), 0, local152.method5521(), -2);
			}
		}
		if (local21 == 1004) {
			Static312.anInt5455 = 2;
			Static49.anInt1319 = 0;
			Static248.anInt7514 = arg0;
			Static391.anInt6975 = arg2;
			Static403.method5961(Static99.aClass92_120);
			Static109.aClass6_Sub1_Sub1_5.method6453(local25);
		}
		if (local21 == 49) {
			Static391.anInt6975 = arg2;
			Static49.anInt1319 = 0;
			Static248.anInt7514 = arg0;
			Static312.anInt5455 = 2;
			Static403.method5961(Static43.aClass92_16);
			Static109.aClass6_Sub1_Sub1_5.method6453((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static109.aClass6_Sub1_Sub1_5.method6453(Static2.anInt6396 + local15);
			Static109.aClass6_Sub1_Sub1_5.method6439(Static54.aClass187_1.method4602(82) ? 1 : 0);
			Static109.aClass6_Sub1_Sub1_5.method6464(local18 + Static348.anInt6273);
			Static206.method3174(local32, local18, local15);
		}
		if (local21 == 2) {
			local92 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local25];
			if (local92 != null) {
				Static49.anInt1319 = 0;
				Static248.anInt7514 = arg0;
				Static391.anInt6975 = arg2;
				Static312.anInt5455 = 2;
				Static403.method5961(Static159.aClass92_115);
				Static109.aClass6_Sub1_Sub1_5.method6481(Static54.aClass187_1.method4602(82) ? 1 : 0);
				Static109.aClass6_Sub1_Sub1_5.method6479(local25);
				Static292.method4382(true, local92.anIntArray458[0], 0, local92.anIntArray459[0], local92.method5521(), 0, local92.method5521(), -2);
			}
		}
		if (local21 == 1010) {
			Static312.anInt5455 = 2;
			Static248.anInt7514 = arg0;
			Static391.anInt6975 = arg2;
			Static49.anInt1319 = 0;
			Static403.method5961(Static193.aClass92_64);
			Static109.aClass6_Sub1_Sub1_5.method6464(Static2.anInt6396 + local15);
			Static109.aClass6_Sub1_Sub1_5.method6436(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static109.aClass6_Sub1_Sub1_5.method6436(Static348.anInt6273 + local18);
			Static109.aClass6_Sub1_Sub1_5.method6456(Static54.aClass187_1.method4602(82) ? 1 : 0);
			Static206.method3174(local32, local18, local15);
		}
		@Pc(699) Class239 local699;
		if (local21 == 18) {
			local699 = Static251.method5357(local15, local18);
			if (local699 != null) {
				Static54.method1224();
				@Pc(706) Class6_Sub8 local706 = Static50.method1150(local699);
				Static412.method6083(local699, local706.anInt1488, local706.method1216());
				Static104.aString16 = Static39.method947(local699);
				if (Static104.aString16 == null) {
					Static104.aString16 = "Null";
				}
				Static289.aString36 = local699.aString60 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 23) {
			Static248.anInt7514 = arg0;
			Static312.anInt5455 = 2;
			Static49.anInt1319 = 0;
			Static391.anInt6975 = arg2;
			Static403.method5961(Static305.aClass92_105);
			Static109.aClass6_Sub1_Sub1_5.method6453(Static348.anInt6273 + local18);
			Static109.aClass6_Sub1_Sub1_5.method6436(Static190.anInt653);
			Static109.aClass6_Sub1_Sub1_5.method6479(Static76.anInt7824);
			Static109.aClass6_Sub1_Sub1_5.method6479(local15 + Static2.anInt6396);
			Static109.aClass6_Sub1_Sub1_5.method6453((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static109.aClass6_Sub1_Sub1_5.method6461(Static363.anInt6463);
			Static109.aClass6_Sub1_Sub1_5.method6481(Static54.aClass187_1.method4602(82) ? 1 : 0);
			Static206.method3174(local32, local18, local15);
		}
		if (local21 == 12) {
			Static391.anInt6975 = arg2;
			Static248.anInt7514 = arg0;
			Static49.anInt1319 = 0;
			Static312.anInt5455 = 2;
			Static403.method5961(Static311.aClass92_108);
			Static109.aClass6_Sub1_Sub1_5.method6436(local15 + Static2.anInt6396);
			Static109.aClass6_Sub1_Sub1_5.method6453(local18 + Static348.anInt6273);
			Static109.aClass6_Sub1_Sub1_5.method6456(Static54.aClass187_1.method4602(82) ? 1 : 0);
			Static109.aClass6_Sub1_Sub1_5.method6453(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static206.method3174(local32, local18, local15);
		}
		if (local21 == 47) {
			local92 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local25];
			if (local92 != null) {
				Static391.anInt6975 = arg2;
				Static312.anInt5455 = 2;
				Static49.anInt1319 = 0;
				Static248.anInt7514 = arg0;
				Static403.method5961(Static206.aClass92_72);
				Static109.aClass6_Sub1_Sub1_5.method6479(local25);
				Static109.aClass6_Sub1_Sub1_5.method6456(Static54.aClass187_1.method4602(82) ? 1 : 0);
				Static292.method4382(true, local92.anIntArray458[0], 0, local92.anIntArray459[0], local92.method5521(), 0, local92.method5521(), -2);
			}
		}
		if (local21 == 46 && Static100.aClass239_4 == null) {
			Static273.method4132(local18, local15);
			Static100.aClass239_4 = Static251.method5357(local15, local18);
			Static437.method6328(Static100.aClass239_4);
		}
		if (local21 == 57) {
			local699 = Static251.method5357(local15, local18);
			if (local699 != null) {
				Static61.method1335(local699);
			}
		}
		if (local21 == 50) {
			Static312.anInt5455 = 1;
			Static49.anInt1319 = 0;
			Static248.anInt7514 = arg0;
			Static391.anInt6975 = arg2;
			Static403.method5961(Static302.aClass92_104);
			Static109.aClass6_Sub1_Sub1_5.method6436(Static76.anInt7824);
			Static109.aClass6_Sub1_Sub1_5.method6479(Static348.anInt6273 + local18);
			Static109.aClass6_Sub1_Sub1_5.method6453(Static190.anInt653);
			Static109.aClass6_Sub1_Sub1_5.method6464(Static2.anInt6396 + local15);
			Static109.aClass6_Sub1_Sub1_5.method6461(Static363.anInt6463);
			Static292.method4382(true, local15, 0, local18, 1, 0, 1, -4);
		}
		if (local21 == 10) {
			local92 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local25];
			if (local92 != null) {
				Static312.anInt5455 = 2;
				Static391.anInt6975 = arg2;
				Static49.anInt1319 = 0;
				Static248.anInt7514 = arg0;
				Static403.method5961(Static374.aClass92_136);
				Static109.aClass6_Sub1_Sub1_5.method6464(local25);
				Static109.aClass6_Sub1_Sub1_5.method6456(Static54.aClass187_1.method4602(82) ? 1 : 0);
				Static292.method4382(true, local92.anIntArray458[0], 0, local92.anIntArray459[0], local92.method5521(), 0, local92.method5521(), -2);
			}
		}
		if (local21 == 22) {
			Static391.anInt6975 = arg2;
			Static312.anInt5455 = 2;
			Static248.anInt7514 = arg0;
			Static49.anInt1319 = 0;
			Static403.method5961(Static355.aClass92_126);
			Static109.aClass6_Sub1_Sub1_5.method6479(Static190.anInt653);
			Static109.aClass6_Sub1_Sub1_5.method6479(Static76.anInt7824);
			Static109.aClass6_Sub1_Sub1_5.method6439(Static54.aClass187_1.method4602(82) ? 1 : 0);
			Static109.aClass6_Sub1_Sub1_5.method6436(Static302.aClass3_Sub2_Sub1_Sub2_2.anInt6602);
			Static109.aClass6_Sub1_Sub1_5.method6484(Static363.anInt6463);
		}
		if (local21 == 5) {
			local92 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local25];
			if (local92 != null) {
				Static391.anInt6975 = arg2;
				Static248.anInt7514 = arg0;
				Static49.anInt1319 = 0;
				Static312.anInt5455 = 2;
				Static403.method5961(Static355.aClass92_126);
				Static109.aClass6_Sub1_Sub1_5.method6479(Static190.anInt653);
				Static109.aClass6_Sub1_Sub1_5.method6479(Static76.anInt7824);
				Static109.aClass6_Sub1_Sub1_5.method6439(Static54.aClass187_1.method4602(82) ? 1 : 0);
				Static109.aClass6_Sub1_Sub1_5.method6436(local25);
				Static109.aClass6_Sub1_Sub1_5.method6484(Static363.anInt6463);
				Static292.method4382(true, local92.anIntArray458[0], 0, local92.anIntArray459[0], local92.method5521(), 0, local92.method5521(), -2);
			}
		}
		if (local21 == 15) {
			Static312.anInt5455 = 2;
			Static49.anInt1319 = 0;
			Static248.anInt7514 = arg0;
			Static391.anInt6975 = arg2;
			Static403.method5961(Static214.aClass92_74);
			Static109.aClass6_Sub1_Sub1_5.method6453(local15 + Static2.anInt6396);
			Static109.aClass6_Sub1_Sub1_5.method6439(Static54.aClass187_1.method4602(82) ? 1 : 0);
			Static109.aClass6_Sub1_Sub1_5.method6436(Static348.anInt6273 + local18);
			Static109.aClass6_Sub1_Sub1_5.method6479(local25);
			Static242.method3798(local15, local18);
		}
		if (local21 == 44) {
			local92 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local25];
			if (local92 != null) {
				Static391.anInt6975 = arg2;
				Static248.anInt7514 = arg0;
				Static49.anInt1319 = 0;
				Static312.anInt5455 = 2;
				Static403.method5961(Static99.aClass92_121);
				Static109.aClass6_Sub1_Sub1_5.method6464(local25);
				Static109.aClass6_Sub1_Sub1_5.method6437(Static54.aClass187_1.method4602(82) ? 1 : 0);
				Static292.method4382(true, local92.anIntArray458[0], 0, local92.anIntArray459[0], local92.method5521(), 0, local92.method5521(), -2);
			}
		}
		if (local21 == 1012 || local21 == 1008 || local21 == 1001 || local21 == 1003 || local21 == 1006) {
			Static40.method957(local15, local21, local25);
		}
		if (local21 == 59) {
			local152 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local25];
			if (local152 != null) {
				Static49.anInt1319 = 0;
				Static248.anInt7514 = arg0;
				Static312.anInt5455 = 2;
				Static391.anInt6975 = arg2;
				Static403.method5961(Static31.aClass92_10);
				Static109.aClass6_Sub1_Sub1_5.method6439(Static54.aClass187_1.method4602(82) ? 1 : 0);
				Static109.aClass6_Sub1_Sub1_5.method6436(local25);
				Static292.method4382(true, local152.anIntArray458[0], 0, local152.anIntArray459[0], local152.method5521(), 0, local152.method5521(), -2);
			}
		}
		if (local21 == 16) {
			Static391.anInt6975 = arg2;
			Static312.anInt5455 = 2;
			Static49.anInt1319 = 0;
			Static248.anInt7514 = arg0;
			Static403.method5961(Static312.aClass92_109);
			Static109.aClass6_Sub1_Sub1_5.method6479(local15 + Static2.anInt6396);
			Static109.aClass6_Sub1_Sub1_5.method6437(Static54.aClass187_1.method4602(82) ? 1 : 0);
			Static109.aClass6_Sub1_Sub1_5.method6436(local18 + Static348.anInt6273);
			Static109.aClass6_Sub1_Sub1_5.method6453(local25);
			Static242.method3798(local15, local18);
		}
		if (local21 == 25) {
			Static391.anInt6975 = arg2;
			Static248.anInt7514 = arg0;
			Static49.anInt1319 = 0;
			Static312.anInt5455 = 2;
			Static403.method5961(Static306.aClass92_107);
			Static109.aClass6_Sub1_Sub1_5.method6456(Static54.aClass187_1.method4602(82) ? 1 : 0);
			Static109.aClass6_Sub1_Sub1_5.method6453(local25);
			Static109.aClass6_Sub1_Sub1_5.method6464(Static2.anInt6396 + local15);
			Static109.aClass6_Sub1_Sub1_5.method6436(Static348.anInt6273 + local18);
			Static242.method3798(local15, local18);
		}
		if (local21 == 19) {
			if (Static291.anInt5199 > 0 && Static54.aClass187_1.method4602(82) && Static54.aClass187_1.method4602(81)) {
				Static235.method3638(local18 + Static348.anInt6273, Static2.anInt6396 - -local15, Static302.aClass3_Sub2_Sub1_Sub2_2.aByte103);
			} else {
				Static391.anInt6975 = arg2;
				Static248.anInt7514 = arg0;
				Static312.anInt5455 = 1;
				Static49.anInt1319 = 0;
				Static403.method5961(Static22.aClass92_9);
				Static109.aClass6_Sub1_Sub1_5.method6453(local18 + Static348.anInt6273);
				Static109.aClass6_Sub1_Sub1_5.method6464(Static2.anInt6396 + local15);
			}
		}
		if (local21 == 48) {
			local92 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local25];
			if (local92 != null) {
				Static391.anInt6975 = arg2;
				Static248.anInt7514 = arg0;
				Static312.anInt5455 = 2;
				Static49.anInt1319 = 0;
				Static403.method5961(Static34.aClass92_143);
				Static109.aClass6_Sub1_Sub1_5.method6437(Static54.aClass187_1.method4602(82) ? 1 : 0);
				Static109.aClass6_Sub1_Sub1_5.method6436(local25);
				Static292.method4382(true, local92.anIntArray458[0], 0, local92.anIntArray459[0], local92.method5521(), 0, local92.method5521(), -2);
			}
		}
		if (local21 == 9) {
			local92 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local25];
			if (local92 != null) {
				Static312.anInt5455 = 2;
				Static49.anInt1319 = 0;
				Static391.anInt6975 = arg2;
				Static248.anInt7514 = arg0;
				Static403.method5961(Static425.aClass92_117);
				Static109.aClass6_Sub1_Sub1_5.method6481(Static54.aClass187_1.method4602(82) ? 1 : 0);
				Static109.aClass6_Sub1_Sub1_5.method6453(local25);
				Static292.method4382(true, local92.anIntArray458[0], 0, local92.anIntArray459[0], local92.method5521(), 0, local92.method5521(), -2);
			}
		}
		if (local21 == 11) {
			Static312.anInt5455 = 2;
			Static391.anInt6975 = arg2;
			Static49.anInt1319 = 0;
			Static248.anInt7514 = arg0;
			Static403.method5961(Static253.aClass92_100);
			Static109.aClass6_Sub1_Sub1_5.method6453(Static2.anInt6396 + local15);
			Static109.aClass6_Sub1_Sub1_5.method6479(local25);
			Static109.aClass6_Sub1_Sub1_5.method6436(Static348.anInt6273 + local18);
			Static109.aClass6_Sub1_Sub1_5.method6437(Static54.aClass187_1.method4602(82) ? 1 : 0);
			Static242.method3798(local15, local18);
		}
		if (local21 == 17) {
			Static391.anInt6975 = arg2;
			Static248.anInt7514 = arg0;
			Static312.anInt5455 = 2;
			Static49.anInt1319 = 0;
			Static403.method5961(Static373.aClass92_135);
			Static109.aClass6_Sub1_Sub1_5.method6436((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static109.aClass6_Sub1_Sub1_5.method6439(Static54.aClass187_1.method4602(82) ? 1 : 0);
			Static109.aClass6_Sub1_Sub1_5.method6453(Static348.anInt6273 + local18);
			Static109.aClass6_Sub1_Sub1_5.method6479(Static2.anInt6396 + local15);
			Static206.method3174(local32, local18, local15);
		}
		if (local21 == 45) {
			Static391.anInt6975 = arg2;
			Static49.anInt1319 = 0;
			Static312.anInt5455 = 2;
			Static248.anInt7514 = arg0;
			Static403.method5961(Static314.aClass92_110);
			Static109.aClass6_Sub1_Sub1_5.method6464(Static348.anInt6273 + local18);
			Static109.aClass6_Sub1_Sub1_5.method6479(local25);
			Static109.aClass6_Sub1_Sub1_5.method6479(Static76.anInt7824);
			Static109.aClass6_Sub1_Sub1_5.method6453(Static190.anInt653);
			Static109.aClass6_Sub1_Sub1_5.method6456(Static54.aClass187_1.method4602(82) ? 1 : 0);
			Static109.aClass6_Sub1_Sub1_5.method6436(Static2.anInt6396 + local15);
			Static109.aClass6_Sub1_Sub1_5.method6484(Static363.anInt6463);
			Static242.method3798(local15, local18);
		}
		if (local21 == 21) {
			local92 = Static374.aClass3_Sub2_Sub1_Sub2Array1[local25];
			if (local92 != null) {
				Static49.anInt1319 = 0;
				Static312.anInt5455 = 2;
				Static248.anInt7514 = arg0;
				Static391.anInt6975 = arg2;
				Static403.method5961(Static324.aClass92_112);
				Static109.aClass6_Sub1_Sub1_5.method6436(local25);
				Static109.aClass6_Sub1_Sub1_5.method6439(Static54.aClass187_1.method4602(82) ? 1 : 0);
				Static292.method4382(true, local92.anIntArray458[0], 0, local92.anIntArray459[0], local92.method5521(), 0, local92.method5521(), -2);
			}
		}
		if (local21 == 13) {
			local152 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local25];
			if (local152 != null) {
				Static391.anInt6975 = arg2;
				Static248.anInt7514 = arg0;
				Static49.anInt1319 = 0;
				Static312.anInt5455 = 2;
				Static403.method5961(Static271.aClass92_96);
				Static109.aClass6_Sub1_Sub1_5.method6436(local25);
				Static109.aClass6_Sub1_Sub1_5.method6481(Static54.aClass187_1.method4602(82) ? 1 : 0);
				Static292.method4382(true, local152.anIntArray458[0], 0, local152.anIntArray459[0], local152.method5521(), 0, local152.method5521(), -2);
			}
		}
		if (local21 == 60 || local21 == 1011) {
			Static115.method2011(local15, local18, arg1.aString55, local25);
		}
		if (local21 == 20) {
			local152 = Static308.aClass3_Sub2_Sub1_Sub1Array1[local25];
			if (local152 != null) {
				Static49.anInt1319 = 0;
				Static248.anInt7514 = arg0;
				Static312.anInt5455 = 2;
				Static391.anInt6975 = arg2;
				Static403.method5961(Static63.aClass92_29);
				Static109.aClass6_Sub1_Sub1_5.method6461(Static363.anInt6463);
				Static109.aClass6_Sub1_Sub1_5.method6464(local25);
				Static109.aClass6_Sub1_Sub1_5.method6479(Static76.anInt7824);
				Static109.aClass6_Sub1_Sub1_5.method6464(Static190.anInt653);
				Static109.aClass6_Sub1_Sub1_5.method6481(Static54.aClass187_1.method4602(82) ? 1 : 0);
				Static292.method4382(true, local152.anIntArray458[0], 0, local152.anIntArray459[0], local152.method5521(), 0, local152.method5521(), -2);
			}
		}
		if (local21 == 3) {
			Static312.anInt5455 = 2;
			Static391.anInt6975 = arg2;
			Static248.anInt7514 = arg0;
			Static49.anInt1319 = 0;
			Static403.method5961(Static200.aClass92_69);
			Static109.aClass6_Sub1_Sub1_5.method6436(local15 + Static2.anInt6396);
			Static109.aClass6_Sub1_Sub1_5.method6436(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static109.aClass6_Sub1_Sub1_5.method6464(local18 + Static348.anInt6273);
			Static109.aClass6_Sub1_Sub1_5.method6456(Static54.aClass187_1.method4602(82) ? 1 : 0);
			Static206.method3174(local32, local18, local15);
		}
		if (Static174.aBoolean224) {
			Static54.method1224();
		}
		if (Static73.aClass239_1 != null && Static376.anInt6758 == 0) {
			Static437.method6328(Static73.aClass239_1);
		}
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILclient!cg;Lclient!cg;)V")
	public static void method3124(@OriginalArg(1) Class6 arg0, @OriginalArg(2) Class6 arg1) {
		if (arg0.aClass6_251 != null) {
			arg0.method6525();
		}
		arg0.aClass6_252 = arg1;
		arg0.aClass6_251 = arg1.aClass6_251;
		arg0.aClass6_251.aClass6_252 = arg0;
		arg0.aClass6_252.aClass6_251 = arg0;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!so;I)I")
	public static int method3126(@OriginalArg(0) Class3_Sub2_Sub1_Sub2 arg0) {
		@Pc(13) int local13 = arg0.anInt6619;
		@Pc(19) Class246 local19 = arg0.method5513();
		if (arg0.aBoolean418) {
			local13 = arg0.anInt6621;
		} else if (local19.anInt7296 == arg0.anInt6597 || arg0.anInt6597 == local19.anInt7311 || local19.anInt7293 == arg0.anInt6597 || local19.anInt7315 == arg0.anInt6597) {
			local13 = arg0.anInt6637;
		} else if (local19.anInt7325 == arg0.anInt6597 || local19.anInt7322 == arg0.anInt6597 || local19.anInt7327 == arg0.anInt6597 || arg0.anInt6597 == local19.anInt7308) {
			local13 = arg0.anInt6615;
		}
		return local13;
	}

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(IILclient!ih;Lclient!eq;Lclient!qs;ILclient!wd;I)V")
	public static void method3128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class116 arg2, @OriginalArg(3) Class66 arg3, @OriginalArg(4) Class6_Sub32 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class260 arg6) {
		@Pc(20) int local20 = arg4.anInt5702 - arg1 / 2 - 5;
		@Pc(24) int local24 = arg5 + 2;
		if (arg6.anInt7750 != 0) {
			arg3.method5035(arg1 + 10, local24, arg6.anInt7750, local20, arg5 + arg0 * arg2.method2799() + 1 - local24);
		}
		if (arg6.anInt7759 != 0) {
			arg3.method5040(arg6.anInt7759, arg1 + 10, local24, local20, arg2.method2799() * arg0 + arg5 + 1 - local24);
		}
		@Pc(81) int local81 = arg6.anInt7729;
		if (arg4.aBoolean354 && arg6.anInt7742 != -1) {
			local81 = arg6.anInt7742;
		}
		for (@Pc(94) int local94 = 0; local94 < arg0; local94++) {
			@Pc(100) String local100 = Static301.aStringArray31[local94];
			if (arg0 - 1 > local94) {
				local100 = local100.substring(0, local100.length() - 4);
			}
			arg2.method2802(arg3, local100, arg4.anInt5702, arg5, local81);
			arg5 += arg2.method2799();
		}
	}
}
