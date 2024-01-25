import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!hj", name = "N", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray3;

	@OriginalMember(owner = "client!hj", name = "U", descriptor = "[Lclient!rg;")
	public static Class27[] aClass27Array24;

	@OriginalMember(owner = "client!hj", name = "P", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_78 = new Class208(41, 8);

	@OriginalMember(owner = "client!hj", name = "V", descriptor = "Lclient!sd;")
	public static final Class208 aClass208_79 = new Class208(100, 6);

	@OriginalMember(owner = "client!hj", name = "W", descriptor = "[I")
	public static final int[] anIntArray222 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/String;ZB)V")
	public static void method2325(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == null) {
			return;
		}
		if (Static158.anInt3256 >= 100) {
			Static79.method1369(Static32.aClass62_17.method1389(Static200.anInt4144));
			return;
		}
		@Pc(22) String local22 = Static287.method4731(arg0);
		if (local22 == null) {
			return;
		}
		@Pc(65) String local65;
		for (@Pc(27) int local27 = 0; local27 < Static158.anInt3256; local27++) {
			@Pc(35) String local35 = Static287.method4731(Static45.aStringArray37[local27]);
			if (local35 != null && local35.equals(local22)) {
				Static79.method1369(arg0 + Static59.aClass62_39.method1389(Static200.anInt4144));
				return;
			}
			if (Static134.aStringArray14[local27] != null) {
				local65 = Static287.method4731(Static134.aStringArray14[local27]);
				if (local65 != null && local65.equals(local22)) {
					Static79.method1369(arg0 + Static59.aClass62_39.method1389(Static200.anInt4144));
					return;
				}
			}
		}
		for (@Pc(91) int local91 = 0; local91 < Static139.anInt2976; local91++) {
			local65 = Static287.method4731(Static30.aStringArray6[local91]);
			if (local65 != null && local65.equals(local22)) {
				Static79.method1369(Static231.aClass62_164.method1389(Static200.anInt4144) + arg0 + Static307.aClass62_204.method1389(Static200.anInt4144));
				return;
			}
			if (Static288.aStringArray29[local91] != null) {
				@Pc(134) String local134 = Static287.method4731(Static288.aStringArray29[local91]);
				if (local134 != null && local134.equals(local22)) {
					Static79.method1369(Static231.aClass62_164.method1389(Static200.anInt4144) + arg0 + Static307.aClass62_204.method1389(Static200.anInt4144));
					return;
				}
			}
		}
		if (Static287.method4731(Static182.aClass1_Sub2_Sub1_Sub1_1.aString12).equals(local22)) {
			Static79.method1369(Static379.aClass62_242.method1389(Static200.anInt4144));
		} else {
			Static77.method1332(Static319.aClass183_92);
			Static76.aClass2_Sub24_Sub2_7.method5746(Static305.method6026(arg0) + 1);
			Static76.aClass2_Sub24_Sub2_7.method5772(arg0);
			Static76.aClass2_Sub24_Sub2_7.method5746(arg1 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI)V")
	public static void method2326(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static54.anInt1178 = arg0;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IILclient!ws;I)V")
	public static void method2328(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub43 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null || Static262.aClass238_29.aClass2_225 == arg1) {
			return;
		}
		@Pc(15) int local15 = arg1.anInt7122;
		@Pc(18) int local18 = arg1.anInt7120;
		@Pc(29) int local29 = arg1.anInt7126;
		@Pc(33) int local33 = (int) arg1.aLong212;
		@Pc(36) long local36 = arg1.aLong212;
		if (local29 >= 2000) {
			local29 -= 2000;
		}
		@Pc(51) Class1_Sub2_Sub1_Sub1 local51;
		if (local29 == 47) {
			local51 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local33];
			if (local51 != null) {
				Static386.anInt7023 = 2;
				Static262.anInt5009 = arg0;
				Static370.anInt4786 = 0;
				Static77.anInt1694 = arg2;
				Static77.method1332(Static172.aClass183_50);
				Static76.aClass2_Sub24_Sub2_7.method5726(local33);
				Static76.aClass2_Sub24_Sub2_7.method5746(Static68.aClass98_1.method4517(82) ? 1 : 0);
				Static312.method5048(local51.method4792(), true, 0, local51.anIntArray466[0], 0, -2, local51.anIntArray465[0], local51.method4792());
			}
		}
		if (local29 == 4) {
			local51 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local33];
			if (local51 != null) {
				Static262.anInt5009 = arg0;
				Static77.anInt1694 = arg2;
				Static370.anInt4786 = 0;
				Static386.anInt7023 = 2;
				Static77.method1332(Static67.aClass183_19);
				Static76.aClass2_Sub24_Sub2_7.method5721(Static67.anInt1508);
				Static76.aClass2_Sub24_Sub2_7.method5734(Static306.anInt5658);
				Static76.aClass2_Sub24_Sub2_7.method5775(Static68.aClass98_1.method4517(82) ? 1 : 0);
				Static76.aClass2_Sub24_Sub2_7.method5715(Static92.anInt1971);
				Static76.aClass2_Sub24_Sub2_7.method5715(local33);
				Static312.method5048(local51.method4792(), true, 0, local51.anIntArray466[0], 0, -2, local51.anIntArray465[0], local51.method4792());
			}
		}
		if (local29 == 2) {
			Static77.anInt1694 = arg2;
			Static386.anInt7023 = 2;
			Static262.anInt5009 = arg0;
			Static370.anInt4786 = 0;
			Static77.method1332(Static376.aClass183_103);
			Static76.aClass2_Sub24_Sub2_7.method5735(local18 + Static350.anInt6470);
			Static76.aClass2_Sub24_Sub2_7.method5731(Static68.aClass98_1.method4517(82) ? 1 : 0);
			Static76.aClass2_Sub24_Sub2_7.method5721(local15 + Static279.anInt5198);
			Static76.aClass2_Sub24_Sub2_7.method5715(Integer.MAX_VALUE & (int) (local36 >>> 32));
			Static34.method465(local36, local15, local18);
		}
		if (local29 == 17) {
			Static262.anInt5009 = arg0;
			Static77.anInt1694 = arg2;
			Static386.anInt7023 = 2;
			Static370.anInt4786 = 0;
			Static77.method1332(Static215.aClass183_64);
			Static76.aClass2_Sub24_Sub2_7.method5726(local18 + Static350.anInt6470);
			Static76.aClass2_Sub24_Sub2_7.method5726(local33);
			Static76.aClass2_Sub24_Sub2_7.method5775(Static68.aClass98_1.method4517(82) ? 1 : 0);
			Static76.aClass2_Sub24_Sub2_7.method5721(local15 + Static279.anInt5198);
			Static379.method5974(local18, local15);
		}
		if (local29 == 45) {
			Static77.anInt1694 = arg2;
			Static262.anInt5009 = arg0;
			Static370.anInt4786 = 0;
			Static386.anInt7023 = 2;
			Static77.method1332(Static311.aClass183_42);
			Static76.aClass2_Sub24_Sub2_7.method5715(Static350.anInt6470 + local18);
			Static76.aClass2_Sub24_Sub2_7.method5773(Static68.aClass98_1.method4517(82) ? 1 : 0);
			Static76.aClass2_Sub24_Sub2_7.method5715(Integer.MAX_VALUE & (int) (local36 >>> 32));
			Static76.aClass2_Sub24_Sub2_7.method5726(local15 + Static279.anInt5198);
			Static34.method465(local36, local15, local18);
		}
		if (local29 == 23) {
			if (Static273.anInt5130 > 0 && Static68.aClass98_1.method4517(82) && Static68.aClass98_1.method4517(81)) {
				Static206.method3764(local18 + Static350.anInt6470, Static279.anInt5198 + local15, Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73);
			} else {
				Static262.anInt5009 = arg0;
				Static386.anInt7023 = 1;
				Static370.anInt4786 = 0;
				Static77.anInt1694 = arg2;
				Static77.method1332(Static207.aClass183_59);
				Static76.aClass2_Sub24_Sub2_7.method5715(Static279.anInt5198 + local15);
				Static76.aClass2_Sub24_Sub2_7.method5735(local18 + Static350.anInt6470);
			}
		}
		if (local29 == 21) {
			Static77.anInt1694 = arg2;
			Static370.anInt4786 = 0;
			Static386.anInt7023 = 1;
			Static262.anInt5009 = arg0;
			Static77.method1332(Static196.aClass183_30);
			Static76.aClass2_Sub24_Sub2_7.method5721(Static92.anInt1971);
			Static76.aClass2_Sub24_Sub2_7.method5726(local18 + Static350.anInt6470);
			Static76.aClass2_Sub24_Sub2_7.method5765(Static306.anInt5658);
			Static76.aClass2_Sub24_Sub2_7.method5715(Static279.anInt5198 + local15);
			Static76.aClass2_Sub24_Sub2_7.method5721(Static67.anInt1508);
			Static312.method5048(1, true, 0, local15, 0, -4, local18, 1);
		}
		@Pc(458) Class1_Sub2_Sub1_Sub2 local458;
		if (local29 == 25) {
			local458 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local33];
			if (local458 != null) {
				Static370.anInt4786 = 0;
				Static386.anInt7023 = 2;
				Static262.anInt5009 = arg0;
				Static77.anInt1694 = arg2;
				Static77.method1332(Static7.aClass183_2);
				Static76.aClass2_Sub24_Sub2_7.method5775(Static68.aClass98_1.method4517(82) ? 1 : 0);
				Static76.aClass2_Sub24_Sub2_7.method5721(local33);
				Static312.method5048(local458.method4792(), true, 0, local458.anIntArray466[0], 0, -2, local458.anIntArray465[0], local458.method4792());
			}
		}
		if (local29 == 13) {
			local51 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local33];
			if (local51 != null) {
				Static386.anInt7023 = 2;
				Static370.anInt4786 = 0;
				Static262.anInt5009 = arg0;
				Static77.anInt1694 = arg2;
				Static77.method1332(Static287.aClass183_79);
				Static76.aClass2_Sub24_Sub2_7.method5746(Static68.aClass98_1.method4517(82) ? 1 : 0);
				Static76.aClass2_Sub24_Sub2_7.method5726(local33);
				Static312.method5048(local51.method4792(), true, 0, local51.anIntArray466[0], 0, -2, local51.anIntArray465[0], local51.method4792());
			}
		}
		if (local29 == 1002) {
			Static77.anInt1694 = arg2;
			Static386.anInt7023 = 2;
			Static262.anInt5009 = arg0;
			Static370.anInt4786 = 0;
			Static77.method1332(Static128.aClass183_35);
			Static76.aClass2_Sub24_Sub2_7.method5731(Static68.aClass98_1.method4517(82) ? 1 : 0);
			Static76.aClass2_Sub24_Sub2_7.method5715(Integer.MAX_VALUE & (int) (local36 >>> 32));
			Static76.aClass2_Sub24_Sub2_7.method5726(Static350.anInt6470 + local18);
			Static76.aClass2_Sub24_Sub2_7.method5735(Static279.anInt5198 + local15);
			Static34.method465(local36, local15, local18);
		}
		if (local29 == 9) {
			if (Static273.anInt5130 > 0 && Static68.aClass98_1.method4517(82) && Static68.aClass98_1.method4517(81)) {
				Static206.method3764(Static350.anInt6470 + local18, local15 + Static279.anInt5198, Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73);
			} else {
				Static85.method1457(local15, local18, local33);
				if (local33 == 1) {
					Static76.aClass2_Sub24_Sub2_7.method5746(-1);
					Static76.aClass2_Sub24_Sub2_7.method5746(-1);
					Static76.aClass2_Sub24_Sub2_7.method5721((int) Static350.aFloat74);
					Static76.aClass2_Sub24_Sub2_7.method5746(57);
					Static76.aClass2_Sub24_Sub2_7.method5746(Static319.anInt5841);
					Static76.aClass2_Sub24_Sub2_7.method5746(Static59.anInt1283);
					Static76.aClass2_Sub24_Sub2_7.method5746(89);
					Static76.aClass2_Sub24_Sub2_7.method5721(Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800);
					Static76.aClass2_Sub24_Sub2_7.method5721(Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798);
					Static76.aClass2_Sub24_Sub2_7.method5746(63);
				} else {
					Static386.anInt7023 = 1;
					Static370.anInt4786 = 0;
					Static77.anInt1694 = arg2;
					Static262.anInt5009 = arg0;
				}
				Static312.method5048(1, true, 0, local15, 0, -4, local18, 1);
			}
		}
		if (local29 == 49 && Static392.aClass3_19 == null) {
			Static110.method2012(local18, local15);
			Static392.aClass3_19 = Static134.method2355(local15, local18);
			Static128.method2229(Static392.aClass3_19);
		}
		if (local29 == 1003 || local29 == 1011 || local29 == 1006 || local29 == 1007 || local29 == 1001) {
			Static139.method2407(local33, local15, local29);
		}
		if (local29 == 3) {
			Static262.anInt5009 = arg0;
			Static370.anInt4786 = 0;
			Static77.anInt1694 = arg2;
			Static386.anInt7023 = 2;
			Static77.method1332(Static299.aClass183_84);
			Static76.aClass2_Sub24_Sub2_7.method5735(Static279.anInt5198 + local15);
			Static76.aClass2_Sub24_Sub2_7.method5746(Static68.aClass98_1.method4517(82) ? 1 : 0);
			Static76.aClass2_Sub24_Sub2_7.method5726(local18 + Static350.anInt6470);
			Static76.aClass2_Sub24_Sub2_7.method5754(Static306.anInt5658);
			Static76.aClass2_Sub24_Sub2_7.method5735(Static67.anInt1508);
			Static76.aClass2_Sub24_Sub2_7.method5721(local33);
			Static76.aClass2_Sub24_Sub2_7.method5715(Static92.anInt1971);
			Static379.method5974(local18, local15);
		}
		if (local29 == 44) {
			local51 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local33];
			if (local51 != null) {
				Static77.anInt1694 = arg2;
				Static262.anInt5009 = arg0;
				Static386.anInt7023 = 2;
				Static370.anInt4786 = 0;
				Static77.method1332(Static222.aClass183_65);
				Static76.aClass2_Sub24_Sub2_7.method5746(Static68.aClass98_1.method4517(82) ? 1 : 0);
				Static76.aClass2_Sub24_Sub2_7.method5735(local33);
				Static312.method5048(local51.method4792(), true, 0, local51.anIntArray466[0], 0, -2, local51.anIntArray465[0], local51.method4792());
			}
		}
		@Pc(904) Class3 local904;
		if (local29 == 22) {
			local904 = Static134.method2355(local15, local18);
			if (local904 != null) {
				Static87.method1484(local904);
			}
		}
		if (local29 == 8) {
			local51 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local33];
			if (local51 != null) {
				Static386.anInt7023 = 2;
				Static77.anInt1694 = arg2;
				Static370.anInt4786 = 0;
				Static262.anInt5009 = arg0;
				Static77.method1332(Static291.aClass183_82);
				Static76.aClass2_Sub24_Sub2_7.method5775(Static68.aClass98_1.method4517(82) ? 1 : 0);
				Static76.aClass2_Sub24_Sub2_7.method5726(local33);
				Static312.method5048(local51.method4792(), true, 0, local51.anIntArray466[0], 0, -2, local51.anIntArray465[0], local51.method4792());
			}
		}
		if (local29 == 30) {
			local458 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local33];
			if (local458 != null) {
				Static370.anInt4786 = 0;
				Static77.anInt1694 = arg2;
				Static386.anInt7023 = 2;
				Static262.anInt5009 = arg0;
				Static77.method1332(Static317.aClass183_91);
				Static76.aClass2_Sub24_Sub2_7.method5773(Static68.aClass98_1.method4517(82) ? 1 : 0);
				Static76.aClass2_Sub24_Sub2_7.method5735(local33);
				Static312.method5048(local458.method4792(), true, 0, local458.anIntArray466[0], 0, -2, local458.anIntArray465[0], local458.method4792());
			}
		}
		if (local29 == 1008) {
			Static262.anInt5009 = arg0;
			Static370.anInt4786 = 0;
			Static386.anInt7023 = 2;
			Static77.anInt1694 = arg2;
			local458 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local33];
			if (local458 != null) {
				@Pc(1049) Class197 local1049 = local458.aClass197_1;
				if (local1049.anIntArray468 != null) {
					local1049 = local1049.method4832(Static179.aClass115_1);
				}
				if (local1049 != null) {
					Static77.method1332(Static245.aClass183_71);
					Static76.aClass2_Sub24_Sub2_7.method5721(local1049.anInt5489);
				}
			}
		}
		if (local29 == 5) {
			local458 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local33];
			if (local458 != null) {
				Static386.anInt7023 = 2;
				Static262.anInt5009 = arg0;
				Static370.anInt4786 = 0;
				Static77.anInt1694 = arg2;
				Static77.method1332(Static382.aClass183_111);
				Static76.aClass2_Sub24_Sub2_7.method5731(Static68.aClass98_1.method4517(82) ? 1 : 0);
				Static76.aClass2_Sub24_Sub2_7.method5726(local33);
				Static312.method5048(local458.method4792(), true, 0, local458.anIntArray466[0], 0, -2, local458.anIntArray465[0], local458.method4792());
			}
		}
		if (local29 == 18) {
			local904 = Static134.method2355(local15, local18);
			if (local904 != null) {
				Static49.method729();
				@Pc(1150) Class2_Sub27 local1150 = Static51.method778(local904);
				Static102.method1835(local904.anInt72, local904.anInt38, local1150.method3759(), local15, local18, local1150.anInt4225);
				Static207.aString34 = Static257.method4425(local904);
				if (Static207.aString34 == null) {
					Static207.aString34 = "Null";
				}
				Static343.aString60 = local904.aString5 + "<col=ffffff>";
			}
			return;
		}
		if (local29 == 1012) {
			Static77.anInt1694 = arg2;
			Static370.anInt4786 = 0;
			Static386.anInt7023 = 2;
			Static262.anInt5009 = arg0;
			Static77.method1332(Static165.aClass183_46);
			Static76.aClass2_Sub24_Sub2_7.method5721(local33);
		}
		if (local29 == 57) {
			Static370.anInt4786 = 0;
			Static262.anInt5009 = arg0;
			Static77.anInt1694 = arg2;
			Static386.anInt7023 = 2;
			Static77.method1332(Static343.aClass183_101);
			Static76.aClass2_Sub24_Sub2_7.method5726(local15 + Static279.anInt5198);
			Static76.aClass2_Sub24_Sub2_7.method5715(Static350.anInt6470 + local18);
			Static76.aClass2_Sub24_Sub2_7.method5775(Static68.aClass98_1.method4517(82) ? 1 : 0);
			Static76.aClass2_Sub24_Sub2_7.method5726(Integer.MAX_VALUE & (int) (local36 >>> 32));
			Static34.method465(local36, local15, local18);
		}
		if (local29 == 19) {
			Static77.anInt1694 = arg2;
			Static262.anInt5009 = arg0;
			Static386.anInt7023 = 2;
			Static370.anInt4786 = 0;
			Static77.method1332(Static102.aClass183_26);
			Static76.aClass2_Sub24_Sub2_7.method5746(Static68.aClass98_1.method4517(82) ? 1 : 0);
			Static76.aClass2_Sub24_Sub2_7.method5721(local33);
			Static76.aClass2_Sub24_Sub2_7.method5715(local15 + Static279.anInt5198);
			Static76.aClass2_Sub24_Sub2_7.method5735(Static350.anInt6470 + local18);
			Static379.method5974(local18, local15);
		}
		if (local29 == 48) {
			local458 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local33];
			if (local458 != null) {
				Static386.anInt7023 = 2;
				Static262.anInt5009 = arg0;
				Static77.anInt1694 = arg2;
				Static370.anInt4786 = 0;
				Static77.method1332(Static373.aClass183_109);
				Static76.aClass2_Sub24_Sub2_7.method5773(Static68.aClass98_1.method4517(82) ? 1 : 0);
				Static76.aClass2_Sub24_Sub2_7.method5715(local33);
				Static312.method5048(local458.method4792(), true, 0, local458.anIntArray466[0], 0, -2, local458.anIntArray465[0], local458.method4792());
			}
		}
		if (local29 == 51) {
			Static77.anInt1694 = arg2;
			Static262.anInt5009 = arg0;
			Static386.anInt7023 = 2;
			Static370.anInt4786 = 0;
			Static77.method1332(Static334.aClass183_97);
			Static76.aClass2_Sub24_Sub2_7.method5726(local18 + Static350.anInt6470);
			Static76.aClass2_Sub24_Sub2_7.method5715(Static92.anInt1971);
			Static76.aClass2_Sub24_Sub2_7.method5726(Static279.anInt5198 + local15);
			Static76.aClass2_Sub24_Sub2_7.method5726(Static67.anInt1508);
			Static76.aClass2_Sub24_Sub2_7.method5726(Integer.MAX_VALUE & (int) (local36 >>> 32));
			Static76.aClass2_Sub24_Sub2_7.method5765(Static306.anInt5658);
			Static76.aClass2_Sub24_Sub2_7.method5773(Static68.aClass98_1.method4517(82) ? 1 : 0);
			Static34.method465(local36, local15, local18);
		}
		if (local29 == 11) {
			local51 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local33];
			if (local51 != null) {
				Static370.anInt4786 = 0;
				Static386.anInt7023 = 2;
				Static77.anInt1694 = arg2;
				Static262.anInt5009 = arg0;
				Static77.method1332(Static32.aClass183_8);
				Static76.aClass2_Sub24_Sub2_7.method5726(local33);
				Static76.aClass2_Sub24_Sub2_7.method5773(Static68.aClass98_1.method4517(82) ? 1 : 0);
				Static312.method5048(local51.method4792(), true, 0, local51.anIntArray466[0], 0, -2, local51.anIntArray465[0], local51.method4792());
			}
		}
		if (local29 == 12) {
			Static262.anInt5009 = arg0;
			Static386.anInt7023 = 2;
			Static370.anInt4786 = 0;
			Static77.anInt1694 = arg2;
			Static77.method1332(Static242.aClass183_70);
			Static76.aClass2_Sub24_Sub2_7.method5721(Static279.anInt5198 + local15);
			Static76.aClass2_Sub24_Sub2_7.method5735(Static350.anInt6470 + local18);
			Static76.aClass2_Sub24_Sub2_7.method5715(local33);
			Static76.aClass2_Sub24_Sub2_7.method5746(Static68.aClass98_1.method4517(82) ? 1 : 0);
			Static379.method5974(local18, local15);
		}
		if (local29 == 46) {
			local458 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local33];
			if (local458 != null) {
				Static262.anInt5009 = arg0;
				Static77.anInt1694 = arg2;
				Static386.anInt7023 = 2;
				Static370.anInt4786 = 0;
				Static77.method1332(Static321.aClass183_93);
				Static76.aClass2_Sub24_Sub2_7.method5715(local33);
				Static76.aClass2_Sub24_Sub2_7.method5746(Static68.aClass98_1.method4517(82) ? 1 : 0);
				Static312.method5048(local458.method4792(), true, 0, local458.anIntArray466[0], 0, -2, local458.anIntArray465[0], local458.method4792());
			}
		}
		if (local29 == 50) {
			local51 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local33];
			if (local51 != null) {
				Static370.anInt4786 = 0;
				Static262.anInt5009 = arg0;
				Static77.anInt1694 = arg2;
				Static386.anInt7023 = 2;
				Static77.method1332(Static315.aClass183_89);
				Static76.aClass2_Sub24_Sub2_7.method5735(local33);
				Static76.aClass2_Sub24_Sub2_7.method5746(Static68.aClass98_1.method4517(82) ? 1 : 0);
				Static312.method5048(local51.method4792(), true, 0, local51.anIntArray466[0], 0, -2, local51.anIntArray465[0], local51.method4792());
			}
		}
		if (local29 == 59) {
			local51 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local33];
			if (local51 != null) {
				Static262.anInt5009 = arg0;
				Static77.anInt1694 = arg2;
				Static386.anInt7023 = 2;
				Static370.anInt4786 = 0;
				Static77.method1332(Static115.aClass183_33);
				Static76.aClass2_Sub24_Sub2_7.method5746(Static68.aClass98_1.method4517(82) ? 1 : 0);
				Static76.aClass2_Sub24_Sub2_7.method5715(local33);
				Static312.method5048(local51.method4792(), true, 0, local51.anIntArray466[0], 0, -2, local51.anIntArray465[0], local51.method4792());
			}
		}
		if (local29 == 10) {
			Static77.anInt1694 = arg2;
			Static262.anInt5009 = arg0;
			Static386.anInt7023 = 2;
			Static370.anInt4786 = 0;
			Static77.method1332(Static73.aClass183_22);
			Static76.aClass2_Sub24_Sub2_7.method5721(Static350.anInt6470 + local18);
			Static76.aClass2_Sub24_Sub2_7.method5775(Static68.aClass98_1.method4517(82) ? 1 : 0);
			Static76.aClass2_Sub24_Sub2_7.method5715(Integer.MAX_VALUE & (int) (local36 >>> 32));
			Static76.aClass2_Sub24_Sub2_7.method5726(local15 + Static279.anInt5198);
			Static34.method465(local36, local15, local18);
		}
		if (local29 == 15 || local29 == 1010) {
			Static389.method6109(local33, local18, arg1.aString63, local15);
		}
		if (local29 == 1004) {
			Static370.anInt4786 = 0;
			Static262.anInt5009 = arg0;
			Static77.anInt1694 = arg2;
			Static386.anInt7023 = 2;
			Static77.method1332(Static108.aClass183_29);
			Static76.aClass2_Sub24_Sub2_7.method5721(local33);
		}
		if (local29 == 6) {
			local458 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local33];
			if (local458 != null) {
				Static77.anInt1694 = arg2;
				Static386.anInt7023 = 2;
				Static370.anInt4786 = 0;
				Static262.anInt5009 = arg0;
				Static77.method1332(Static136.aClass183_74);
				Static76.aClass2_Sub24_Sub2_7.method5726(local33);
				Static76.aClass2_Sub24_Sub2_7.method5726(Static67.anInt1508);
				Static76.aClass2_Sub24_Sub2_7.method5715(Static92.anInt1971);
				Static76.aClass2_Sub24_Sub2_7.method5770(Static306.anInt5658);
				Static76.aClass2_Sub24_Sub2_7.method5775(Static68.aClass98_1.method4517(82) ? 1 : 0);
				Static312.method5048(local458.method4792(), true, 0, local458.anIntArray466[0], 0, -2, local458.anIntArray465[0], local458.method4792());
			}
		}
		if (local29 == 60) {
			local51 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local33];
			if (local51 != null) {
				Static386.anInt7023 = 2;
				Static370.anInt4786 = 0;
				Static77.anInt1694 = arg2;
				Static262.anInt5009 = arg0;
				Static77.method1332(Static189.aClass183_10);
				Static76.aClass2_Sub24_Sub2_7.method5721(local33);
				Static76.aClass2_Sub24_Sub2_7.method5746(Static68.aClass98_1.method4517(82) ? 1 : 0);
				Static312.method5048(local51.method4792(), true, 0, local51.anIntArray466[0], 0, -2, local51.anIntArray465[0], local51.method4792());
			}
		}
		if (local29 == 20) {
			Static77.anInt1694 = arg2;
			Static262.anInt5009 = arg0;
			Static370.anInt4786 = 0;
			Static386.anInt7023 = 2;
			Static77.method1332(Static134.aClass183_38);
			Static76.aClass2_Sub24_Sub2_7.method5775(Static68.aClass98_1.method4517(82) ? 1 : 0);
			Static76.aClass2_Sub24_Sub2_7.method5721(local33);
			Static76.aClass2_Sub24_Sub2_7.method5721(Static279.anInt5198 + local15);
			Static76.aClass2_Sub24_Sub2_7.method5735(Static350.anInt6470 + local18);
			Static379.method5974(local18, local15);
		}
		if (local29 == 58) {
			Static262.anInt5009 = arg0;
			Static370.anInt4786 = 0;
			Static77.anInt1694 = arg2;
			Static386.anInt7023 = 2;
			Static77.method1332(Static113.aClass183_87);
			Static76.aClass2_Sub24_Sub2_7.method5726(Static350.anInt6470 + local18);
			Static76.aClass2_Sub24_Sub2_7.method5775(Static68.aClass98_1.method4517(82) ? 1 : 0);
			Static76.aClass2_Sub24_Sub2_7.method5726(local15 + Static279.anInt5198);
			Static76.aClass2_Sub24_Sub2_7.method5735(local33);
			Static379.method5974(local18, local15);
		}
		if (Static45.aBoolean446) {
			Static49.method729();
		}
		if (Static72.aClass3_7 != null && Static311.anInt3022 == 0) {
			Static128.method2229(Static72.aClass3_7);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIZII)V")
	public static void method2330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg3 + 1;
		Static307.method5019(Static152.anIntArrayArray30[arg3], arg4, arg2, arg1);
		@Pc(17) int local17 = arg0 - 1;
		Static307.method5019(Static152.anIntArrayArray30[arg0], arg4, arg2, arg1);
		for (@Pc(29) int local29 = local4; local29 <= local17; local29++) {
			@Pc(35) int[] local35 = Static152.anIntArrayArray30[local29];
			local35[arg1] = local35[arg4] = arg2;
		}
	}
}
