import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
	public static int anInt108;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IB)I")
	public static int method170(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(CII)C")
	public static char method173(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 'À' && arg0 <= 'ÿ') {
			if (arg0 >= 'À' && arg0 <= 'Æ') {
				return 'A';
			}
			if (arg0 == 'Ç') {
				return 'C';
			}
			if (arg0 >= 'È' && arg0 <= 'Ë') {
				return 'E';
			}
			if (arg0 >= 'Ì' && arg0 <= 'Ï') {
				return 'I';
			}
			if (arg0 == 'Ñ' && arg1 != 0) {
				return 'N';
			}
			if (arg0 >= 'Ò' && arg0 <= 'Ö') {
				return 'O';
			}
			if (arg0 >= 'Ù' && arg0 <= 'Ü') {
				return 'U';
			}
			if (arg0 == 'Ý') {
				return 'Y';
			}
			if (arg0 == 'ß') {
				return 's';
			}
			if (arg0 >= 'à' && arg0 <= 'æ') {
				return 'a';
			}
			if (arg0 == 'ç') {
				return 'c';
			}
			if (arg0 >= 'è' && arg0 <= 'ë') {
				return 'e';
			}
			if (arg0 >= 'ì' && arg0 <= 'ï') {
				return 'i';
			}
			if (arg0 == 'ñ' && arg1 != 0) {
				return 'n';
			}
			if (arg0 >= 'ò' && arg0 <= 'ö') {
				return 'o';
			}
			if (arg0 >= 'ù' && arg0 <= 'ü') {
				return 'u';
			}
			if (arg0 == 'ý' || arg0 == 'ÿ') {
				return 'y';
			}
		}
		if (arg0 == 'Œ') {
			return 'O';
		} else if (arg0 == 'œ') {
			return 'o';
		} else if (arg0 == 'Ÿ') {
			return 'Y';
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIBLclient!cm;)V")
	public static void method174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3_Sub11 arg2) {
		if (arg2 == null || Static255.aClass71_43.aClass3_73 == arg2) {
			return;
		}
		@Pc(15) int local15 = arg2.anInt1421;
		@Pc(18) int local18 = arg2.anInt1417;
		@Pc(25) int local25 = arg2.anInt1419;
		@Pc(29) int local29 = (int) arg2.aLong48;
		if (local25 >= 2000) {
			local25 -= 2000;
		}
		@Pc(38) long local38 = arg2.aLong48;
		@Pc(47) Class6_Sub1_Sub2_Sub1 local47;
		if (local25 == 3) {
			local47 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local29];
			if (local47 != null) {
				Static104.anInt2329 = 0;
				Static474.anInt8512 = arg1;
				Static549.anInt9481 = 2;
				Static70.anInt567 = arg0;
				Static278.method4791(Static527.aClass158_123);
				Static515.aClass3_Sub27_Sub1_2.method7576(Static364.aClass101_1.method2589(82) ? 1 : 0);
				Static515.aClass3_Sub27_Sub1_2.method7606(local29);
				Static501.method7220(local47.anIntArray733[0], local47.method7083(), true, 0, -2, local47.method7083(), 0, local47.anIntArray734[0]);
			}
		}
		if (local25 == 9) {
			Static549.anInt9481 = 2;
			Static474.anInt8512 = arg1;
			Static104.anInt2329 = 0;
			Static70.anInt567 = arg0;
			Static278.method4791(Static358.aClass158_86);
			Static515.aClass3_Sub27_Sub1_2.method7602(Static364.aClass101_1.method2589(82) ? 1 : 0);
			Static515.aClass3_Sub27_Sub1_2.method7606(local15 + Static223.anInt4827);
			Static515.aClass3_Sub27_Sub1_2.method7574(Static448.anInt8198);
			Static515.aClass3_Sub27_Sub1_2.method7600(Static508.anInt8865, 30364);
			Static515.aClass3_Sub27_Sub1_2.method7606(local18 + Static150.anInt3027);
			Static515.aClass3_Sub27_Sub1_2.method7606(Static113.anInt2478);
			Static515.aClass3_Sub27_Sub1_2.method7606(Integer.MAX_VALUE & (int) (local38 >>> 32));
			Static287.method4860(local18, local15, local38);
		}
		@Pc(188) Class6_Sub1_Sub2_Sub2 local188;
		@Pc(181) Class3_Sub3 local181;
		if (local25 == 2) {
			local181 = (Class3_Sub3) Static240.aClass267_20.method6644((long) local29);
			if (local181 != null) {
				Static474.anInt8512 = arg1;
				local188 = local181.aClass6_Sub1_Sub2_Sub2_1;
				Static549.anInt9481 = 2;
				Static70.anInt567 = arg0;
				Static104.anInt2329 = 0;
				Static278.method4791(Static323.aClass158_79);
				Static515.aClass3_Sub27_Sub1_2.method7600(Static113.anInt2478, 30364);
				Static515.aClass3_Sub27_Sub1_2.method7574(Static448.anInt8198);
				Static515.aClass3_Sub27_Sub1_2.method7576(Static364.aClass101_1.method2589(82) ? 1 : 0);
				Static515.aClass3_Sub27_Sub1_2.method7567(local29);
				Static515.aClass3_Sub27_Sub1_2.method7606(Static508.anInt8865);
				Static501.method7220(local188.anIntArray733[0], local188.method7083(), true, 0, -2, local188.method7083(), 0, local188.anIntArray734[0]);
			}
		}
		if (local25 == 47) {
			local181 = (Class3_Sub3) Static240.aClass267_20.method6644((long) local29);
			if (local181 != null) {
				Static474.anInt8512 = arg1;
				Static104.anInt2329 = 0;
				Static549.anInt9481 = 2;
				local188 = local181.aClass6_Sub1_Sub2_Sub2_1;
				Static70.anInt567 = arg0;
				Static278.method4791(Static195.aClass158_53);
				Static515.aClass3_Sub27_Sub1_2.method7576(Static364.aClass101_1.method2589(82) ? 1 : 0);
				Static515.aClass3_Sub27_Sub1_2.method7606(local29);
				Static501.method7220(local188.anIntArray733[0], local188.method7083(), true, 0, -2, local188.method7083(), 0, local188.anIntArray734[0]);
			}
		}
		if (local25 == 6) {
			Static549.anInt9481 = 2;
			Static70.anInt567 = arg0;
			Static104.anInt2329 = 0;
			Static474.anInt8512 = arg1;
			Static278.method4791(Static107.aClass158_25);
			Static515.aClass3_Sub27_Sub1_2.method7587(local15 + Static223.anInt4827);
			Static515.aClass3_Sub27_Sub1_2.method7593(Static364.aClass101_1.method2589(82) ? 1 : 0);
			Static515.aClass3_Sub27_Sub1_2.method7587(Static150.anInt3027 + local18);
			Static515.aClass3_Sub27_Sub1_2.method7587(Integer.MAX_VALUE & (int) (local38 >>> 32));
			Static287.method4860(local18, local15, local38);
		}
		if (local25 == 19) {
			local181 = (Class3_Sub3) Static240.aClass267_20.method6644((long) local29);
			if (local181 != null) {
				Static104.anInt2329 = 0;
				Static70.anInt567 = arg0;
				Static474.anInt8512 = arg1;
				Static549.anInt9481 = 2;
				local188 = local181.aClass6_Sub1_Sub2_Sub2_1;
				Static278.method4791(Static481.aClass158_115);
				Static515.aClass3_Sub27_Sub1_2.method7600(local29, 30364);
				Static515.aClass3_Sub27_Sub1_2.method7573(Static364.aClass101_1.method2589(82) ? 1 : 0);
				Static501.method7220(local188.anIntArray733[0], local188.method7083(), true, 0, -2, local188.method7083(), 0, local188.anIntArray734[0]);
			}
		}
		if (local25 == 59) {
			Static549.anInt9481 = 2;
			Static104.anInt2329 = 0;
			Static70.anInt567 = arg0;
			Static474.anInt8512 = arg1;
			Static278.method4791(Static443.aClass158_103);
			Static515.aClass3_Sub27_Sub1_2.method7567(local15 + Static223.anInt4827);
			Static515.aClass3_Sub27_Sub1_2.method7602(Static364.aClass101_1.method2589(82) ? 1 : 0);
			Static515.aClass3_Sub27_Sub1_2.method7600(local29, 30364);
			Static515.aClass3_Sub27_Sub1_2.method7606(local18 + Static150.anInt3027);
			Static273.method4737(local18, local15);
		}
		@Pc(498) Class245 local498;
		if (local25 == 13) {
			local498 = Static80.method1631(local15, local18);
			if (local498 != null) {
				Static258.method4549(local498);
			}
		}
		if (local25 == 48) {
			local47 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local29];
			if (local47 != null) {
				Static474.anInt8512 = arg1;
				Static70.anInt567 = arg0;
				Static549.anInt9481 = 2;
				Static104.anInt2329 = 0;
				Static278.method4791(Static17.aClass158_52);
				Static515.aClass3_Sub27_Sub1_2.method7606(local29);
				Static515.aClass3_Sub27_Sub1_2.method7593(Static364.aClass101_1.method2589(82) ? 1 : 0);
				Static501.method7220(local47.anIntArray733[0], local47.method7083(), true, 0, -2, local47.method7083(), 0, local47.anIntArray734[0]);
			}
		}
		if (local25 == 49) {
			local47 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local29];
			if (local47 != null) {
				Static104.anInt2329 = 0;
				Static549.anInt9481 = 2;
				Static70.anInt567 = arg0;
				Static474.anInt8512 = arg1;
				Static278.method4791(Static364.aClass158_89);
				Static515.aClass3_Sub27_Sub1_2.method7600(local29, 30364);
				Static515.aClass3_Sub27_Sub1_2.method7602(Static364.aClass101_1.method2589(82) ? 1 : 0);
				Static501.method7220(local47.anIntArray733[0], local47.method7083(), true, 0, -2, local47.method7083(), 0, local47.anIntArray734[0]);
			}
		}
		if (local25 == 22) {
			Static70.anInt567 = arg0;
			Static549.anInt9481 = 2;
			Static104.anInt2329 = 0;
			Static474.anInt8512 = arg1;
			Static278.method4791(Static482.aClass158_116);
			Static515.aClass3_Sub27_Sub1_2.method7567(Static223.anInt4827 + local15);
			Static515.aClass3_Sub27_Sub1_2.method7602(Static364.aClass101_1.method2589(82) ? 1 : 0);
			Static515.aClass3_Sub27_Sub1_2.method7606(Static150.anInt3027 + local18);
			Static515.aClass3_Sub27_Sub1_2.method7600(Integer.MAX_VALUE & (int) (local38 >>> 32), 30364);
			Static287.method4860(local18, local15, local38);
		}
		if (local25 == 11) {
			Static474.anInt8512 = arg1;
			Static70.anInt567 = arg0;
			Static549.anInt9481 = 2;
			Static104.anInt2329 = 0;
			Static278.method4791(Static82.aClass158_13);
			Static515.aClass3_Sub27_Sub1_2.method7606(local18 + Static150.anInt3027);
			Static515.aClass3_Sub27_Sub1_2.method7573(Static364.aClass101_1.method2589(82) ? 1 : 0);
			Static515.aClass3_Sub27_Sub1_2.method7567(local15 + Static223.anInt4827);
			Static515.aClass3_Sub27_Sub1_2.method7600(local29, 30364);
			Static273.method4737(local18, local15);
		}
		if (local25 == 1002 || local25 == 1001 || local25 == 1007 || local25 == 1009 || local25 == 1011) {
			Static458.method6864(local29, local25, local15);
		}
		if (local25 == 46) {
			local47 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local29];
			if (local47 != null) {
				Static474.anInt8512 = arg1;
				Static70.anInt567 = arg0;
				Static104.anInt2329 = 0;
				Static549.anInt9481 = 2;
				Static278.method4791(Static464.aClass158_112);
				Static515.aClass3_Sub27_Sub1_2.method7606(Static113.anInt2478);
				Static515.aClass3_Sub27_Sub1_2.method7594(Static448.anInt8198);
				Static515.aClass3_Sub27_Sub1_2.method7576(Static364.aClass101_1.method2589(82) ? 1 : 0);
				Static515.aClass3_Sub27_Sub1_2.method7600(local29, 30364);
				Static515.aClass3_Sub27_Sub1_2.method7587(Static508.anInt8865);
				Static501.method7220(local47.anIntArray733[0], local47.method7083(), true, 0, -2, local47.method7083(), 0, local47.anIntArray734[0]);
			}
		}
		if (local25 == 12) {
			Static70.anInt567 = arg0;
			Static474.anInt8512 = arg1;
			Static104.anInt2329 = 0;
			Static549.anInt9481 = 2;
			Static278.method4791(Static270.aClass158_70);
			Static515.aClass3_Sub27_Sub1_2.method7593(Static364.aClass101_1.method2589(82) ? 1 : 0);
			Static515.aClass3_Sub27_Sub1_2.method7587(Static150.anInt3027 + local18);
			Static515.aClass3_Sub27_Sub1_2.method7587(local29);
			Static515.aClass3_Sub27_Sub1_2.method7606(local15 + Static223.anInt4827);
			Static273.method4737(local18, local15);
		}
		if (local25 == 20) {
			local498 = Static80.method1631(local15, local18);
			if (local498 != null) {
				Static320.method5152();
				@Pc(901) Class3_Sub13 local901 = Static63.method1295(local498);
				Static432.method6571(local901.method1751(), local901.anInt1864, local498);
				Static88.aString19 = Static27.method796(local498);
				if (Static88.aString19 == null) {
					Static88.aString19 = "Null";
				}
				Static117.aString29 = local498.aString56 + "<col=ffffff>";
			}
			return;
		}
		if (local25 == 1012) {
			Static474.anInt8512 = arg1;
			Static70.anInt567 = arg0;
			Static104.anInt2329 = 0;
			Static549.anInt9481 = 2;
			Static278.method4791(Static322.aClass158_77);
			Static515.aClass3_Sub27_Sub1_2.method7576(Static364.aClass101_1.method2589(82) ? 1 : 0);
			Static515.aClass3_Sub27_Sub1_2.method7606(local15 + Static223.anInt4827);
			Static515.aClass3_Sub27_Sub1_2.method7600(local18 + Static150.anInt3027, 30364);
			Static515.aClass3_Sub27_Sub1_2.method7567((int) (local38 >>> 32) & Integer.MAX_VALUE);
			Static287.method4860(local18, local15, local38);
		}
		if (local25 == 60) {
			local47 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local29];
			if (local47 != null) {
				Static549.anInt9481 = 2;
				Static70.anInt567 = arg0;
				Static104.anInt2329 = 0;
				Static474.anInt8512 = arg1;
				Static278.method4791(Static473.aClass158_107);
				Static515.aClass3_Sub27_Sub1_2.method7600(local29, 30364);
				Static515.aClass3_Sub27_Sub1_2.method7576(Static364.aClass101_1.method2589(82) ? 1 : 0);
				Static501.method7220(local47.anIntArray733[0], local47.method7083(), true, 0, -2, local47.method7083(), 0, local47.anIntArray734[0]);
			}
		}
		if (local25 == 16) {
			local47 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local29];
			if (local47 != null) {
				Static70.anInt567 = arg0;
				Static474.anInt8512 = arg1;
				Static104.anInt2329 = 0;
				Static549.anInt9481 = 2;
				Static278.method4791(Static164.aClass158_46);
				Static515.aClass3_Sub27_Sub1_2.method7600(local29, 30364);
				Static515.aClass3_Sub27_Sub1_2.method7602(Static364.aClass101_1.method2589(82) ? 1 : 0);
				Static501.method7220(local47.anIntArray733[0], local47.method7083(), true, 0, -2, local47.method7083(), 0, local47.anIntArray734[0]);
			}
		}
		if (local25 == 1010) {
			Static549.anInt9481 = 2;
			Static104.anInt2329 = 0;
			Static70.anInt567 = arg0;
			Static474.anInt8512 = arg1;
			Static278.method4791(Static82.aClass158_14);
			Static515.aClass3_Sub27_Sub1_2.method7600(local29, 30364);
		}
		if (local25 == 4) {
			local181 = (Class3_Sub3) Static240.aClass267_20.method6644((long) local29);
			if (local181 != null) {
				Static549.anInt9481 = 2;
				local188 = local181.aClass6_Sub1_Sub2_Sub2_1;
				Static474.anInt8512 = arg1;
				Static70.anInt567 = arg0;
				Static104.anInt2329 = 0;
				Static278.method4791(Static10.aClass158_8);
				Static515.aClass3_Sub27_Sub1_2.method7587(local29);
				Static515.aClass3_Sub27_Sub1_2.method7573(Static364.aClass101_1.method2589(82) ? 1 : 0);
				Static501.method7220(local188.anIntArray733[0], local188.method7083(), true, 0, -2, local188.method7083(), 0, local188.anIntArray734[0]);
			}
		}
		if (local25 == 21) {
			if (Static353.anInt6659 > 0 && Static364.aClass101_1.method2589(82) && Static364.aClass101_1.method2589(81)) {
				Static152.method2631(Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100, local15 + Static223.anInt4827, Static150.anInt3027 - -local18);
			} else {
				Static288.method4873(local15, local18, local29);
				if (local29 == 1) {
					Static515.aClass3_Sub27_Sub1_2.method7576(-1);
					Static515.aClass3_Sub27_Sub1_2.method7576(-1);
					Static515.aClass3_Sub27_Sub1_2.method7600((int) Static487.aFloat258, 30364);
					Static515.aClass3_Sub27_Sub1_2.method7576(57);
					Static515.aClass3_Sub27_Sub1_2.method7576(Static262.anInt5488);
					Static515.aClass3_Sub27_Sub1_2.method7576(Static509.anInt8869);
					Static515.aClass3_Sub27_Sub1_2.method7576(89);
					Static515.aClass3_Sub27_Sub1_2.method7600(Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811, 30364);
					Static515.aClass3_Sub27_Sub1_2.method7600(Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813, 30364);
					Static515.aClass3_Sub27_Sub1_2.method7576(63);
				} else {
					Static70.anInt567 = arg0;
					Static104.anInt2329 = 0;
					Static549.anInt9481 = 1;
					Static474.anInt8512 = arg1;
				}
				Static501.method7220(local15, 1, true, 0, -4, 1, 0, local18);
			}
		}
		if (local25 == 1006) {
			Static549.anInt9481 = 2;
			Static474.anInt8512 = arg1;
			Static104.anInt2329 = 0;
			Static70.anInt567 = arg0;
			local181 = (Class3_Sub3) Static240.aClass267_20.method6644((long) local29);
			if (local181 != null) {
				local188 = local181.aClass6_Sub1_Sub2_Sub2_1;
				@Pc(1338) Class230 local1338 = local188.aClass230_1;
				if (local1338.anIntArray627 != null) {
					local1338 = local1338.method5898(Static127.aClass215_1);
				}
				if (local1338 != null) {
					Static278.method4791(Static338.aClass158_83);
					Static515.aClass3_Sub27_Sub1_2.method7600(local1338.anInt7036, 30364);
				}
			}
		}
		if (local25 == 5) {
			Static474.anInt8512 = arg1;
			Static70.anInt567 = arg0;
			Static104.anInt2329 = 0;
			Static549.anInt9481 = 2;
			Static278.method4791(Static231.aClass158_62);
			Static515.aClass3_Sub27_Sub1_2.method7606(local18 + Static150.anInt3027);
			Static515.aClass3_Sub27_Sub1_2.method7602(Static364.aClass101_1.method2589(82) ? 1 : 0);
			Static515.aClass3_Sub27_Sub1_2.method7606(local15 + Static223.anInt4827);
			Static515.aClass3_Sub27_Sub1_2.method7567(Integer.MAX_VALUE & (int) (local38 >>> 32));
			Static287.method4860(local18, local15, local38);
		}
		if (local25 == 44) {
			Static104.anInt2329 = 0;
			Static549.anInt9481 = 1;
			Static70.anInt567 = arg0;
			Static474.anInt8512 = arg1;
			Static278.method4791(Static276.aClass158_73);
			Static515.aClass3_Sub27_Sub1_2.method7606(Static113.anInt2478);
			Static515.aClass3_Sub27_Sub1_2.method7606(local15 + Static223.anInt4827);
			Static515.aClass3_Sub27_Sub1_2.method7594(Static448.anInt8198);
			Static515.aClass3_Sub27_Sub1_2.method7606(Static150.anInt3027 + local18);
			Static515.aClass3_Sub27_Sub1_2.method7587(Static508.anInt8865);
			Static501.method7220(local15, 1, true, 0, -4, 1, 0, local18);
		}
		if (local25 == 51) {
			Static474.anInt8512 = arg1;
			Static70.anInt567 = arg0;
			Static549.anInt9481 = 2;
			Static104.anInt2329 = 0;
			Static278.method4791(Static339.aClass158_72);
			Static515.aClass3_Sub27_Sub1_2.method7587(Static223.anInt4827 + local15);
			Static515.aClass3_Sub27_Sub1_2.method7573(Static364.aClass101_1.method2589(82) ? 1 : 0);
			Static515.aClass3_Sub27_Sub1_2.method7587(Static150.anInt3027 + local18);
			Static515.aClass3_Sub27_Sub1_2.method7600(local29, 30364);
			Static273.method4737(local18, local15);
		}
		if (local25 == 15) {
			Static104.anInt2329 = 0;
			Static70.anInt567 = arg0;
			Static474.anInt8512 = arg1;
			Static549.anInt9481 = 2;
			Static278.method4791(Static131.aClass158_34);
			Static515.aClass3_Sub27_Sub1_2.method7567(Static113.anInt2478);
			Static515.aClass3_Sub27_Sub1_2.method7567(local18 + Static150.anInt3027);
			Static515.aClass3_Sub27_Sub1_2.method7606(local15 + Static223.anInt4827);
			Static515.aClass3_Sub27_Sub1_2.method7574(Static448.anInt8198);
			Static515.aClass3_Sub27_Sub1_2.method7593(Static364.aClass101_1.method2589(82) ? 1 : 0);
			Static515.aClass3_Sub27_Sub1_2.method7606(Static508.anInt8865);
			Static515.aClass3_Sub27_Sub1_2.method7587(local29);
			Static273.method4737(local18, local15);
		}
		if (local25 == 17) {
			local47 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local29];
			if (local47 != null) {
				Static104.anInt2329 = 0;
				Static549.anInt9481 = 2;
				Static474.anInt8512 = arg1;
				Static70.anInt567 = arg0;
				Static278.method4791(Static407.aClass158_99);
				Static515.aClass3_Sub27_Sub1_2.method7573(Static364.aClass101_1.method2589(82) ? 1 : 0);
				Static515.aClass3_Sub27_Sub1_2.method7606(local29);
				Static501.method7220(local47.anIntArray733[0], local47.method7083(), true, 0, -2, local47.method7083(), 0, local47.anIntArray734[0]);
			}
		}
		if (local25 == 30) {
			Static70.anInt567 = arg0;
			Static104.anInt2329 = 0;
			Static549.anInt9481 = 2;
			Static474.anInt8512 = arg1;
			Static278.method4791(Static349.aClass158_85);
			Static515.aClass3_Sub27_Sub1_2.method7606(local18 + Static150.anInt3027);
			Static515.aClass3_Sub27_Sub1_2.method7600(Static223.anInt4827 + local15, 30364);
			Static515.aClass3_Sub27_Sub1_2.method7593(Static364.aClass101_1.method2589(82) ? 1 : 0);
			Static515.aClass3_Sub27_Sub1_2.method7606(local29);
			Static273.method4737(local18, local15);
		}
		if (local25 == 50 || local25 == 1003) {
			Static264.method4646(local18, arg2.aString16, local29, local15);
		}
		if (local25 == 57) {
			local181 = (Class3_Sub3) Static240.aClass267_20.method6644((long) local29);
			if (local181 != null) {
				Static549.anInt9481 = 2;
				Static104.anInt2329 = 0;
				Static70.anInt567 = arg0;
				Static474.anInt8512 = arg1;
				local188 = local181.aClass6_Sub1_Sub2_Sub2_1;
				Static278.method4791(Static325.aClass158_80);
				Static515.aClass3_Sub27_Sub1_2.method7587(local29);
				Static515.aClass3_Sub27_Sub1_2.method7602(Static364.aClass101_1.method2589(82) ? 1 : 0);
				Static501.method7220(local188.anIntArray733[0], local188.method7083(), true, 0, -2, local188.method7083(), 0, local188.anIntArray734[0]);
			}
		}
		if (local25 == 45) {
			Static104.anInt2329 = 0;
			Static474.anInt8512 = arg1;
			Static549.anInt9481 = 2;
			Static70.anInt567 = arg0;
			Static278.method4791(Static464.aClass158_112);
			Static515.aClass3_Sub27_Sub1_2.method7606(Static113.anInt2478);
			Static515.aClass3_Sub27_Sub1_2.method7594(Static448.anInt8198);
			Static515.aClass3_Sub27_Sub1_2.method7576(Static364.aClass101_1.method2589(82) ? 1 : 0);
			Static515.aClass3_Sub27_Sub1_2.method7600(Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8587, 30364);
			Static515.aClass3_Sub27_Sub1_2.method7587(Static508.anInt8865);
		}
		if (local25 == 23) {
			if (Static353.anInt6659 > 0 && Static364.aClass101_1.method2589(82) && Static364.aClass101_1.method2589(81)) {
				Static152.method2631(Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100, Static223.anInt4827 + local15, local18 + Static150.anInt3027);
			} else {
				Static549.anInt9481 = 1;
				Static70.anInt567 = arg0;
				Static104.anInt2329 = 0;
				Static474.anInt8512 = arg1;
				Static278.method4791(Static182.aClass158_49);
				Static515.aClass3_Sub27_Sub1_2.method7600(local15 + Static223.anInt4827, 30364);
				Static515.aClass3_Sub27_Sub1_2.method7567(local18 + Static150.anInt3027);
			}
		}
		if (local25 == 10) {
			Static104.anInt2329 = 0;
			Static549.anInt9481 = 2;
			Static70.anInt567 = arg0;
			Static474.anInt8512 = arg1;
			Static278.method4791(Static228.aClass158_61);
			Static515.aClass3_Sub27_Sub1_2.method7602(Static364.aClass101_1.method2589(82) ? 1 : 0);
			Static515.aClass3_Sub27_Sub1_2.method7587(local18 + Static150.anInt3027);
			Static515.aClass3_Sub27_Sub1_2.method7587(local15 + Static223.anInt4827);
			Static515.aClass3_Sub27_Sub1_2.method7600(Integer.MAX_VALUE & (int) (local38 >>> 32), 30364);
			Static287.method4860(local18, local15, local38);
		}
		if (local25 == 8) {
			local47 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local29];
			if (local47 != null) {
				Static474.anInt8512 = arg1;
				Static549.anInt9481 = 2;
				Static104.anInt2329 = 0;
				Static70.anInt567 = arg0;
				Static278.method4791(Static215.aClass158_59);
				Static515.aClass3_Sub27_Sub1_2.method7606(local29);
				Static515.aClass3_Sub27_Sub1_2.method7593(Static364.aClass101_1.method2589(82) ? 1 : 0);
				Static501.method7220(local47.anIntArray733[0], local47.method7083(), true, 0, -2, local47.method7083(), 0, local47.anIntArray734[0]);
			}
		}
		if (local25 == 58 && Static140.aClass245_4 == null) {
			Static24.method777(local18, local15);
			Static140.aClass245_4 = Static80.method1631(local15, local18);
			Static31.method809(Static140.aClass245_4);
		}
		if (local25 == 25) {
			local47 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local29];
			if (local47 != null) {
				Static70.anInt567 = arg0;
				Static549.anInt9481 = 2;
				Static104.anInt2329 = 0;
				Static474.anInt8512 = arg1;
				Static278.method4791(Static237.aClass158_64);
				Static515.aClass3_Sub27_Sub1_2.method7587(local29);
				Static515.aClass3_Sub27_Sub1_2.method7573(Static364.aClass101_1.method2589(82) ? 1 : 0);
				Static501.method7220(local47.anIntArray733[0], local47.method7083(), true, 0, -2, local47.method7083(), 0, local47.anIntArray734[0]);
			}
		}
		if (local25 == 1008) {
			Static104.anInt2329 = 0;
			Static70.anInt567 = arg0;
			Static474.anInt8512 = arg1;
			Static549.anInt9481 = 2;
			Static278.method4791(Static531.aClass158_124);
			Static515.aClass3_Sub27_Sub1_2.method7600(local29, 30364);
		}
		if (local25 == 18) {
			local181 = (Class3_Sub3) Static240.aClass267_20.method6644((long) local29);
			if (local181 != null) {
				Static70.anInt567 = arg0;
				local188 = local181.aClass6_Sub1_Sub2_Sub2_1;
				Static104.anInt2329 = 0;
				Static474.anInt8512 = arg1;
				Static549.anInt9481 = 2;
				Static278.method4791(Static371.aClass158_90);
				Static515.aClass3_Sub27_Sub1_2.method7602(Static364.aClass101_1.method2589(82) ? 1 : 0);
				Static515.aClass3_Sub27_Sub1_2.method7606(local29);
				Static501.method7220(local188.anIntArray733[0], local188.method7083(), true, 0, -2, local188.method7083(), 0, local188.anIntArray734[0]);
			}
		}
		if (Static506.aBoolean659) {
			Static320.method5152();
		}
		if (Static267.aClass245_10 != null && Static307.anInt4847 == 0) {
			Static31.method809(Static267.aClass245_10);
		}
	}
}
