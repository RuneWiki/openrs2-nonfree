import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!je", name = "rb", descriptor = "I")
	public static int anInt1311;

	@OriginalMember(owner = "client!je", name = "ub", descriptor = "J")
	public static long aLong43;

	@OriginalMember(owner = "client!je", name = "lb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_652 = Static14.method2017("Loading title screen )2 ");

	@OriginalMember(owner = "client!je", name = "gb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_650 = aClass36_652;

	@OriginalMember(owner = "client!je", name = "tb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_653 = Static14.method2017("Remove");

	@OriginalMember(owner = "client!je", name = "hb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_651 = aClass36_653;

	@OriginalMember(owner = "client!je", name = "sb", descriptor = "[[I")
	public static int[][] anIntArrayArray18 = new int[104][104];

	@OriginalMember(owner = "client!je", name = "xb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_654 = Static14.method2017("title)3jpg");

	@OriginalMember(owner = "client!je", name = "yb", descriptor = "I")
	public static int anInt1312 = -1;

	@OriginalMember(owner = "client!je", name = "Gb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_656 = Static14.method2017("Ok");

	@OriginalMember(owner = "client!je", name = "zb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_655 = aClass36_656;

	@OriginalMember(owner = "client!je", name = "Ib", descriptor = "Lclient!kc;")
	public static Class36 aClass36_657 = Static14.method2017("Fps:");

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([Lclient!kc;I)Lclient!kc;")
	public static Class36 method949(@OriginalArg(0) Class36[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static32.method708(0, arg0.length, arg0);
	}

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V")
	public static void method951() {
		aClass36_654 = null;
		aClass36_656 = null;
		aClass36_657 = null;
		aClass36_652 = null;
		aClass36_653 = null;
		anIntArrayArray18 = null;
		aClass36_650 = null;
		aClass36_651 = null;
		aClass36_655 = null;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZ)Lclient!lc;")
	public static Class2_Sub1_Sub9 method953(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub9 local10 = (Class2_Sub1_Sub9) Static9.aClass22_2.method711((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static52.aClass3_14.method928(arg0, 9);
		local10 = new Class2_Sub1_Sub9();
		local10.anInt1546 = arg0;
		if (local20 != null) {
			local10.method1075(new Class2_Sub12(local20));
		}
		local10.method1076();
		Static9.aClass22_2.method712(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)Lclient!ab;")
	public static Class2_Sub1_Sub1_Sub1 method959() {
		@Pc(14) Class2_Sub1_Sub1_Sub1 local14 = new Class2_Sub1_Sub1_Sub1();
		local14.aByteArray1 = Static42.aByteArrayArray19[0];
		local14.anInt92 = Static27.anIntArray60[0];
		local14.anInt95 = Static64.anIntArray204[0];
		local14.anInt91 = Static10.anInt247;
		local14.anInt93 = Static36.anIntArray132[0];
		local14.anIntArray8 = Static43.anIntArray161;
		local14.anInt90 = Static96.anInt2558;
		local14.anInt94 = Static92.anIntArray293[0];
		Static40.method1545();
		return local14;
	}

	@OriginalMember(owner = "client!je", name = "g", descriptor = "(I)Z")
	public static boolean method961() {
		if (Static57.aClass51_3 == null) {
			return false;
		}
		@Pc(158) int local158;
		try {
			@Pc(13) int local13 = Static57.aClass51_3.method1484();
			if (local13 == 0) {
				return false;
			}
			if (Static10.anInt253 == -1) {
				local13--;
				Static57.aClass51_3.method1481(0, 1, Static92.aClass2_Sub12_Sub1_3.aByteArray20);
				Static92.aClass2_Sub12_Sub1_3.anInt1939 = 0;
				Static10.anInt253 = Static92.aClass2_Sub12_Sub1_3.method1417();
				Static111.anInt2876 = Static6.anIntArray17[Static10.anInt253];
			}
			if (Static111.anInt2876 == -1) {
				if (local13 <= 0) {
					return false;
				}
				Static57.aClass51_3.method1481(0, 1, Static92.aClass2_Sub12_Sub1_3.aByteArray20);
				Static111.anInt2876 = Static92.aClass2_Sub12_Sub1_3.aByteArray20[0] & 0xFF;
				local13--;
			}
			if (Static111.anInt2876 == -2) {
				if (local13 <= 1) {
					return false;
				}
				local13 -= 2;
				Static57.aClass51_3.method1481(0, 2, Static92.aClass2_Sub12_Sub1_3.aByteArray20);
				Static92.aClass2_Sub12_Sub1_3.anInt1939 = 0;
				Static111.anInt2876 = Static92.aClass2_Sub12_Sub1_3.method1366();
			}
			if (Static111.anInt2876 > local13) {
				return false;
			}
			Static92.aClass2_Sub12_Sub1_3.anInt1939 = 0;
			Static57.aClass51_3.method1481(0, Static111.anInt2876, Static92.aClass2_Sub12_Sub1_3.aByteArray20);
			Static1.anInt2 = 0;
			Static112.anInt2926 = Static15.anInt318;
			Static15.anInt318 = Static33.anInt426;
			Static33.anInt426 = Static10.anInt253;
			@Pc(131) int local131;
			if (Static10.anInt253 == 95) {
				Static88.aBoolean100 = false;
				for (local131 = 0; local131 < 5; local131++) {
					Static99.aBooleanArray12[local131] = false;
				}
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 188) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1366();
				local158 = Static92.aClass2_Sub12_Sub1_3.method1401();
				Static41.method800(local131);
				if (local158 != -1) {
					Static41.method800(local158);
				}
				if (Static78.anInt2037 != -1) {
					Static71.method1275(Static78.anInt2037);
					Static78.anInt2037 = -1;
				}
				if (Static94.anInt2471 != -1) {
					Static71.method1275(Static94.anInt2471);
					Static94.anInt2471 = -1;
				}
				if (anInt1312 != -1) {
					Static71.method1275(anInt1312);
					anInt1312 = -1;
				}
				if (Static46.anInt1229 == local131) {
					Static90.method1647(Static46.anInt1229);
				} else {
					Static71.method1275(Static46.anInt1229);
					Static46.anInt1229 = local131;
					Static104.method1914(35);
				}
				if (local131 == Static9.anInt237) {
					Static90.method1647(Static9.anInt237);
				} else {
					Static71.method1275(Static9.anInt237);
					Static9.anInt237 = local158;
				}
				Static32.anInt910 = 0;
				Static80.anInt2060 = -1;
				Static6.method145(Static46.anInt1229);
				Static6.method145(Static9.anInt237);
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 84) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1401();
				local158 = Static92.aClass2_Sub12_Sub1_3.method1413();
				if (anInt1312 != -1) {
					Static71.method1275(anInt1312);
					Static115.aBoolean77 = true;
					anInt1312 = -1;
				}
				if (Static46.anInt1229 != -1) {
					Static71.method1275(Static46.anInt1229);
					Static46.anInt1229 = -1;
					Static104.method1914(30);
				}
				if (Static9.anInt237 != -1) {
					Static71.method1275(Static9.anInt237);
					Static9.anInt237 = -1;
				}
				if (local131 == Static78.anInt2037) {
					Static90.method1647(Static78.anInt2037);
				} else {
					Static71.method1275(Static78.anInt2037);
					Static78.anInt2037 = local131;
				}
				if (Static94.anInt2471 == local158) {
					Static90.method1647(Static94.anInt2471);
				} else {
					Static71.method1275(Static94.anInt2471);
					Static94.anInt2471 = local158;
				}
				Static78.aBoolean85 = true;
				Static80.anInt2060 = -1;
				if (Static32.anInt910 != 0) {
					Static115.aBoolean77 = true;
					Static32.anInt910 = 0;
				}
				Static100.aBoolean118 = true;
				Static6.method145(Static78.anInt2037);
				Static6.method145(Static94.anInt2471);
				Static10.anInt253 = -1;
				return true;
			}
			@Pc(347) Class2_Sub1_Sub6 local347;
			if (Static10.anInt253 == 145) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1372();
				local347 = Static71.method1274(local131);
				local347.anInt700 = 3;
				local347.anInt655 = Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.aClass67_2.method2008();
				Static10.anInt253 = -1;
				return true;
			}
			@Pc(377) int local377;
			@Pc(371) Class36 local371;
			if (Static10.anInt253 == 240) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1391();
				local371 = Static92.aClass2_Sub12_Sub1_3.method1404();
				local377 = Static92.aClass2_Sub12_Sub1_3.method1399();
				if (local377 >= 1 && local377 <= 5) {
					if (local371.method1024(Static118.aClass36_1465)) {
						local371 = null;
					}
					Static45.aClass36Array22[local377 - 1] = local371;
					Static66.aBooleanArray11[local377 - 1] = local131 == 0;
				}
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 21) {
				Static109.anInt2825 = Static92.aClass2_Sub12_Sub1_3.method1388();
				Static78.aBoolean85 = true;
				Static10.anInt253 = -1;
				Static100.aBoolean118 = true;
				return true;
			}
			if (Static10.anInt253 == 200) {
				Static117.method1386();
				Static10.anInt253 = -1;
				return false;
			}
			if (Static10.anInt253 == 98 || Static10.anInt253 == 78 || Static10.anInt253 == 13 || Static10.anInt253 == 234 || Static10.anInt253 == 36 || Static10.anInt253 == 27 || Static10.anInt253 == 19 || Static10.anInt253 == 3 || Static10.anInt253 == 114 || Static10.anInt253 == 88 || Static10.anInt253 == 29) {
				Static17.method340();
				Static10.anInt253 = -1;
				return true;
			}
			@Pc(516) Class2_Sub1_Sub6 local516;
			if (Static10.anInt253 == 213) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1413();
				if (local131 == 65535) {
					local131 = -1;
				}
				local158 = Static92.aClass2_Sub12_Sub1_3.method1367();
				local377 = Static92.aClass2_Sub12_Sub1_3.method1367();
				local516 = Static71.method1274(local377);
				@Pc(533) Class2_Sub1_Sub18 local533;
				if (local516.aBoolean27) {
					local516.anInt692 = local158;
					local516.anInt703 = local131;
					local533 = Static43.method832(local131);
					local516.anInt679 = local533.anInt2831;
					local516.anInt681 = local533.anInt2826;
					local516.anInt672 = local533.anInt2813;
					local516.anInt691 = local533.anInt2838;
					local516.anInt721 = local533.anInt2844;
					if (local516.anInt677 > 0) {
						local516.anInt691 = local516.anInt691 * 32 / local516.anInt677;
					}
					local516.anInt696 = local533.anInt2842;
				} else if (local131 == -1) {
					Static10.anInt253 = -1;
					local516.anInt700 = 0;
					return true;
				} else {
					local533 = Static43.method832(local131);
					local516.anInt672 = local533.anInt2813;
					local516.anInt681 = local533.anInt2826;
					local516.anInt700 = 4;
					local516.anInt655 = local131;
					local516.anInt691 = local533.anInt2838 * 100 / local158;
				}
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 189) {
				Static10.anInt243 = Static92.aClass2_Sub12_Sub1_3.method1413() * 30;
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 160) {
				Static42.anInt1111 = Static92.aClass2_Sub12_Sub1_3.method1399();
				if (Static42.anInt1111 == 1) {
					Static114.anInt2982 = Static92.aClass2_Sub12_Sub1_3.method1366();
				}
				if (Static42.anInt1111 >= 2 && Static42.anInt1111 <= 6) {
					if (Static42.anInt1111 == 2) {
						Static2.anInt2976 = 64;
						Static24.anInt626 = 64;
					}
					if (Static42.anInt1111 == 3) {
						Static24.anInt626 = 0;
						Static2.anInt2976 = 64;
					}
					if (Static42.anInt1111 == 4) {
						Static24.anInt626 = 128;
						Static2.anInt2976 = 64;
					}
					if (Static42.anInt1111 == 5) {
						Static2.anInt2976 = 0;
						Static24.anInt626 = 64;
					}
					if (Static42.anInt1111 == 6) {
						Static24.anInt626 = 64;
						Static2.anInt2976 = 128;
					}
					Static42.anInt1111 = 2;
					Static65.anInt1669 = Static92.aClass2_Sub12_Sub1_3.method1366();
					Static11.anInt264 = Static92.aClass2_Sub12_Sub1_3.method1366();
					Static39.anInt981 = Static92.aClass2_Sub12_Sub1_3.method1399();
				}
				if (Static42.anInt1111 == 10) {
					Static104.anInt2706 = Static92.aClass2_Sub12_Sub1_3.method1366();
				}
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 72) {
				Static39.method758();
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 135) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1401();
				Static23.method489(local131);
				Static71.anInt1803 = Static113.anInt2952;
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 81) {
				Static15.anInt316 = Static92.aClass2_Sub12_Sub1_3.method1399();
				Static3.anInt1302 = Static92.aClass2_Sub12_Sub1_3.method1399();
				Static45.anInt1225 = Static92.aClass2_Sub12_Sub1_3.method1399();
				Static46.aBoolean63 = true;
				Static115.aBoolean77 = true;
				Static10.anInt253 = -1;
				return true;
			}
			@Pc(791) int local791;
			@Pc(783) int local783;
			@Pc(773) long local773;
			if (Static10.anInt253 == 229) {
				local773 = Static92.aClass2_Sub12_Sub1_3.method1389();
				local377 = Static92.aClass2_Sub12_Sub1_3.method1366();
				local783 = Static92.aClass2_Sub12_Sub1_3.method1399();
				@Pc(789) Class36 local789 = Static114.method2077(local773).method1017();
				for (local791 = 0; local791 < Static7.anInt189; local791++) {
					if (Static24.aLongArray2[local791] == local773) {
						if (Static36.anIntArray130[local791] != local377) {
							Static36.anIntArray130[local791] = local377;
							Static100.aBoolean118 = true;
							if (local377 > 0) {
								Static40.method1546(method949(new Class36[] { local789, Static69.aClass36_855 }), 5, Static105.aClass36_1352);
							}
							if (local377 == 0) {
								Static40.method1546(method949(new Class36[] { local789, Static22.aClass36_312 }), 5, Static105.aClass36_1352);
							}
						}
						Static106.anIntArray330[local791] = local783;
						local789 = null;
						break;
					}
				}
				@Pc(863) boolean local863 = false;
				if (local789 != null && Static7.anInt189 < 200) {
					Static24.aLongArray2[Static7.anInt189] = local773;
					Static43.aClass36Array21[Static7.anInt189] = local789;
					Static36.anIntArray130[Static7.anInt189] = local377;
					Static106.anIntArray330[Static7.anInt189] = local783;
					Static100.aBoolean118 = true;
					Static7.anInt189++;
				}
				while (!local863) {
					local863 = true;
					for (@Pc(898) int local898 = 0; local898 < Static7.anInt189 - 1; local898++) {
						if (Static36.anIntArray130[local898] != Static62.anInt1620 && Static62.anInt1620 == Static36.anIntArray130[local898 + 1] || Static36.anIntArray130[local898] == 0 && Static36.anIntArray130[local898 + 1] != 0) {
							local863 = false;
							@Pc(932) int local932 = Static36.anIntArray130[local898];
							Static36.anIntArray130[local898] = Static36.anIntArray130[local898 + 1];
							Static36.anIntArray130[local898 + 1] = local932;
							@Pc(950) Class36 local950 = Static43.aClass36Array21[local898];
							Static43.aClass36Array21[local898] = Static43.aClass36Array21[local898 + 1];
							Static43.aClass36Array21[local898 + 1] = local950;
							@Pc(968) long local968 = Static24.aLongArray2[local898];
							Static24.aLongArray2[local898] = Static24.aLongArray2[local898 + 1];
							Static24.aLongArray2[local898 + 1] = local968;
							@Pc(986) int local986 = Static106.anIntArray330[local898];
							Static106.anIntArray330[local898] = Static106.anIntArray330[local898 + 1];
							Static106.anIntArray330[local898 + 1] = local986;
							Static100.aBoolean118 = true;
						}
					}
				}
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 228) {
				Static113.method2049(Static111.anInt2876, Static92.aClass2_Sub12_Sub1_3, Static67.aClass11_1);
				Static10.anInt253 = -1;
				return true;
			}
			@Pc(1033) Class36 local1033;
			@Pc(1055) long local1055;
			if (Static10.anInt253 == 123) {
				local1033 = Static92.aClass2_Sub12_Sub1_3.method1404();
				@Pc(1057) boolean local1057;
				if (local1033.method1006(Static8.aClass36_116)) {
					local371 = local1033.method1018(0, local1033.method1009(Static63.aClass36_785));
					local1055 = local371.method1021();
					local1057 = false;
					for (local791 = 0; local791 < Static106.anInt2724; local791++) {
						if (Static4.aLongArray1[local791] == local1055) {
							local1057 = true;
							break;
						}
					}
					if (!local1057 && Static25.anInt631 == 0) {
						Static40.method1546(Static17.aClass36_228, 4, local371);
					}
				} else if (local1033.method1006(Static103.aClass36_1307)) {
					local1057 = false;
					local371 = local1033.method1018(0, local1033.method1009(Static63.aClass36_785));
					local1055 = local371.method1021();
					for (local791 = 0; local791 < Static106.anInt2724; local791++) {
						if (Static4.aLongArray1[local791] == local1055) {
							local1057 = true;
							break;
						}
					}
					if (!local1057 && Static25.anInt631 == 0) {
						Static40.method1546(Static56.aClass36_704, 8, local371);
					}
				} else if (local1033.method1006(Static105.aClass36_1351)) {
					local371 = local1033.method1018(0, local1033.method1009(Static63.aClass36_785));
					local1055 = local371.method1021();
					local1057 = false;
					for (local791 = 0; local791 < Static106.anInt2724; local791++) {
						if (local1055 == Static4.aLongArray1[local791]) {
							local1057 = true;
							break;
						}
					}
					if (!local1057 && Static25.anInt631 == 0) {
						@Pc(1173) Class36 local1173 = local1033.method1018(local1033.method1009(Static63.aClass36_785) + 1, local1033.method1028() - 9);
						Static40.method1546(local1173, 8, local371);
					}
				} else {
					Static40.method1546(local1033, 0, Static105.aClass36_1352);
				}
				Static10.anInt253 = -1;
				return true;
			}
			@Pc(1249) Class2_Sub1_Sub6 local1249;
			if (Static10.anInt253 == 150) {
				local1033 = Static92.aClass2_Sub12_Sub1_3.method1404();
				local158 = Static92.aClass2_Sub12_Sub1_3.method1412();
				local1249 = Static71.method1274(local158);
				local1249.aClass36_369 = local1033;
				if (local158 >> 16 == Static101.anIntArray323[Static109.anInt2825]) {
					Static100.aBoolean118 = true;
				}
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 103) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1367();
				Static58.aClass34_4 = Static67.aClass11_1.method230(local131);
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 93) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1413();
				local158 = Static92.aClass2_Sub12_Sub1_3.method1378();
				local377 = Static92.aClass2_Sub12_Sub1_3.method1378();
				local783 = Static92.aClass2_Sub12_Sub1_3.method1412();
				@Pc(1312) Class2_Sub1_Sub6 local1312 = Static71.method1274(local783);
				local1312.anInt691 = local158;
				local1312.anInt672 = local131;
				local1312.anInt681 = local377;
				Static10.anInt253 = -1;
				return true;
			}
			@Pc(1360) int local1360;
			if (Static10.anInt253 == 214) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1367();
				local158 = Static92.aClass2_Sub12_Sub1_3.method1378();
				local377 = local158 >> 10 & 0x1F;
				local783 = local158 >> 5 & 0x1F;
				@Pc(1354) Class2_Sub1_Sub6 local1354 = Static71.method1274(local131);
				Static10.anInt253 = -1;
				local1360 = local158 & 0x1F;
				local1354.anInt687 = (local783 << 11) + (local377 << 19) + (local1360 << 3);
				return true;
			}
			if (Static10.anInt253 == 85) {
				Static100.aBoolean118 = true;
				local131 = Static92.aClass2_Sub12_Sub1_3.method1391();
				local158 = Static92.aClass2_Sub12_Sub1_3.method1395();
				local377 = Static92.aClass2_Sub12_Sub1_3.method1388();
				Static107.anIntArray333[local131] = local158;
				Static74.anIntArray236[local131] = local377;
				Static25.anIntArray49[local131] = 1;
				for (local783 = 0; local783 < 98; local783++) {
					if (RuntimeException_Sub1.anIntArray47[local783] <= local158) {
						Static25.anIntArray49[local131] = local783 + 2;
					}
				}
				Static10.anInt253 = -1;
				Static92.anInt2396 = Static113.anInt2952;
				return true;
			}
			if (Static10.anInt253 == 232) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1412();
				local158 = Static92.aClass2_Sub12_Sub1_3.method1366();
				local1249 = Static71.method1274(local131);
				local1249.anInt655 = local158;
				local1249.anInt700 = 2;
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 109) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1378();
				if (local131 == 65535) {
					local131 = -1;
				}
				local158 = Static92.aClass2_Sub12_Sub1_3.method1391();
				if (Static101.anIntArray323[local158] == local131) {
					Static90.method1647(Static101.anIntArray323[local158]);
				} else {
					Static71.method1275(Static101.anIntArray323[local158]);
					Static101.anIntArray323[local158] = local131;
				}
				Static100.aBoolean118 = true;
				Static78.aBoolean85 = true;
				Static6.method145(Static101.anIntArray323[local158]);
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 250) {
				if (Static109.anInt2825 == 12) {
					Static100.aBoolean118 = true;
				}
				Static1.anInt10 = Static92.aClass2_Sub12_Sub1_3.method1385();
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 247) {
				Static45.anInt1227 = Static92.aClass2_Sub12_Sub1_3.method1399();
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 143) {
				if (anInt1312 != -1) {
					Static71.method1275(anInt1312);
					anInt1312 = -1;
				}
				Static32.anInt910 = 2;
				Static105.aClass36_1346 = Static105.aClass36_1352;
				Static10.anInt253 = -1;
				Static115.aBoolean77 = true;
				Static16.aBoolean8 = false;
				return true;
			}
			@Pc(1652) int local1652;
			if (Static10.anInt253 == 162) {
				Static100.aBoolean118 = true;
				local131 = Static92.aClass2_Sub12_Sub1_3.method1412();
				local158 = Static92.aClass2_Sub12_Sub1_3.method1366();
				if (local131 >= 0) {
					local1249 = Static71.method1274(local131);
				} else {
					local1249 = null;
				}
				if (local1249 != null) {
					for (local783 = 0; local783 < local1249.anIntArray57.length; local783++) {
						local1249.anIntArray57[local783] = 0;
						local1249.anIntArray54[local783] = 0;
					}
				}
				Static63.method1127(local158);
				local783 = Static92.aClass2_Sub12_Sub1_3.method1366();
				for (local1360 = 0; local1360 < local783; local1360++) {
					local791 = Static92.aClass2_Sub12_Sub1_3.method1413();
					local1652 = Static92.aClass2_Sub12_Sub1_3.method1388();
					if (local1652 == 255) {
						local1652 = Static92.aClass2_Sub12_Sub1_3.method1367();
					}
					if (local1249 != null && local1249.anIntArray57.length > local1360) {
						local1249.anIntArray57[local1360] = local791;
						local1249.anIntArray54[local1360] = local1652;
					}
					Static82.method1503(local158, local791 - 1, local1652, local1360);
				}
				Static10.anInt253 = -1;
				Static71.anInt1803 = Static113.anInt2952;
				return true;
			}
			if (Static10.anInt253 == 56) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1395();
				local158 = Static92.aClass2_Sub12_Sub1_3.method1378();
				Static107.anIntArray331[local158] = local131;
				if (Static4.anIntArray14[local158] != local131) {
					Static4.anIntArray14[local158] = local131;
					Static73.method1299(local158);
					if (Static39.anInt980 != -1) {
						Static115.aBoolean77 = true;
					}
					Static100.aBoolean118 = true;
				}
				Static73.anInt1839 = Static113.anInt2952;
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 1) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1388();
				local158 = Static92.aClass2_Sub12_Sub1_3.method1399();
				local377 = Static92.aClass2_Sub12_Sub1_3.method1388();
				Static92.anInt2412 = local131 >> 1;
				Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.method1549(local377, local158, (local131 & 0x1) == 1);
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 140) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1399();
				local158 = Static92.aClass2_Sub12_Sub1_3.method1399();
				local377 = Static92.aClass2_Sub12_Sub1_3.method1399();
				local783 = Static92.aClass2_Sub12_Sub1_3.method1399();
				Static99.aBooleanArray12[local131] = true;
				Static24.anIntArray43[local131] = local158;
				Static68.anIntArray218[local131] = local377;
				Static16.anIntArray26[local131] = local783;
				Static66.anIntArray215[local131] = 0;
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 50) {
				Static106.anInt2724 = Static111.anInt2876 / 8;
				for (local131 = 0; local131 < Static106.anInt2724; local131++) {
					Static4.aLongArray1[local131] = Static92.aClass2_Sub12_Sub1_3.method1389();
				}
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 239) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1395();
				local158 = Static92.aClass2_Sub12_Sub1_3.method1401();
				local1249 = Static71.method1274(local131);
				Static10.anInt253 = -1;
				if (local1249 != null && local1249.anInt676 == 0) {
					if (local158 > local1249.anInt686 - local1249.anInt660) {
						local158 = local1249.anInt686 - local1249.anInt660;
					}
					if (local158 < 0) {
						local158 = 0;
					}
					local1249.anInt716 = local158;
				}
				return true;
			}
			if (Static10.anInt253 == 127) {
				Static47.method917(false);
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 4) {
				Static88.aBoolean100 = true;
				Static110.anInt2857 = Static92.aClass2_Sub12_Sub1_3.method1399();
				Static80.anInt2059 = Static92.aClass2_Sub12_Sub1_3.method1399();
				Static52.anInt1434 = Static92.aClass2_Sub12_Sub1_3.method1366();
				Static9.anInt238 = Static92.aClass2_Sub12_Sub1_3.method1399();
				Static26.anInt723 = Static92.aClass2_Sub12_Sub1_3.method1399();
				if (Static26.anInt723 >= 100) {
					local131 = Static110.anInt2857 * 128 + 64;
					local158 = Static80.anInt2059 * 128 + 64;
					local377 = Static56.method1044(local158, local131, Static92.anInt2412) - Static52.anInt1434;
					local783 = local131 - Static105.anInt2735;
					local1360 = local377 - Static111.anInt2875;
					local791 = local158 - Static59.anInt1588;
					local1652 = (int) Math.sqrt((double) (local783 * local783 + local791 * local791));
					Static96.anInt2559 = (int) (Math.atan2((double) local1360, (double) local1652) * 325.949D) & 0x7FF;
					Static51.anInt2603 = (int) (-325.949D * Math.atan2((double) local783, (double) local791)) & 0x7FF;
					if (Static96.anInt2559 < 128) {
						Static96.anInt2559 = 128;
					}
					if (Static96.anInt2559 > 383) {
						Static96.anInt2559 = 383;
					}
				}
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 205) {
				local773 = Static92.aClass2_Sub12_Sub1_3.method1389();
				@Pc(2056) Class36 local2056 = Static20.method376(Static92.aClass2_Sub12_Sub1_3).method1032();
				Static40.method1546(local2056, 6, Static114.method2077(local773).method1017());
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 20) {
				for (local131 = 0; local131 < Static4.anIntArray14.length; local131++) {
					if (Static4.anIntArray14[local131] != Static107.anIntArray331[local131]) {
						Static4.anIntArray14[local131] = Static107.anIntArray331[local131];
						Static73.method1299(local131);
						Static100.aBoolean118 = true;
					}
				}
				Static73.anInt1839 = Static113.anInt2952;
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 104) {
				Static88.aBoolean100 = true;
				Static68.anInt1709 = Static92.aClass2_Sub12_Sub1_3.method1399();
				Static29.anInt823 = Static92.aClass2_Sub12_Sub1_3.method1399();
				Static25.anInt634 = Static92.aClass2_Sub12_Sub1_3.method1366();
				Static65.anInt1679 = Static92.aClass2_Sub12_Sub1_3.method1399();
				Static105.anInt2734 = Static92.aClass2_Sub12_Sub1_3.method1399();
				if (Static105.anInt2734 >= 100) {
					Static59.anInt1588 = Static29.anInt823 * 128 + 64;
					Static105.anInt2735 = Static68.anInt1709 * 128 + 64;
					Static111.anInt2875 = Static56.method1044(Static59.anInt1588, Static105.anInt2735, Static92.anInt2412) - Static25.anInt634;
				}
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 174) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1378();
				Static41.method800(local131);
				if (anInt1312 != -1) {
					Static71.method1275(anInt1312);
					Static115.aBoolean77 = true;
					anInt1312 = -1;
				}
				if (Static46.anInt1229 != -1) {
					Static71.method1275(Static46.anInt1229);
					Static46.anInt1229 = -1;
					Static104.method1914(30);
				}
				if (Static9.anInt237 != -1) {
					Static71.method1275(Static9.anInt237);
					Static9.anInt237 = -1;
				}
				if (Static78.anInt2037 != -1) {
					Static71.method1275(Static78.anInt2037);
					Static78.anInt2037 = -1;
				}
				if (local131 == Static94.anInt2471) {
					Static90.method1647(Static94.anInt2471);
				} else {
					Static71.method1275(Static94.anInt2471);
					Static94.anInt2471 = local131;
				}
				Static78.aBoolean85 = true;
				Static100.aBoolean118 = true;
				Static80.anInt2060 = -1;
				if (Static32.anInt910 != 0) {
					Static32.anInt910 = 0;
					Static115.aBoolean77 = true;
				}
				Static6.method145(Static94.anInt2471);
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 167) {
				if (anInt1312 != -1) {
					Static71.method1275(anInt1312);
					anInt1312 = -1;
				}
				Static10.anInt253 = -1;
				Static16.aBoolean8 = false;
				Static115.aBoolean77 = true;
				Static105.aClass36_1346 = Static105.aClass36_1352;
				Static32.anInt910 = 1;
				return true;
			}
			if (Static10.anInt253 == 99) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1367();
				local158 = Static92.aClass2_Sub12_Sub1_3.method1395();
				local377 = Static92.aClass2_Sub12_Sub1_3.method1378();
				if (local377 == 65535) {
					local377 = -1;
				}
				@Pc(2306) long local2306 = (long) local377 + ((long) local131 << 32);
				@Pc(2311) Class2 local2311 = Static113.aClass31_8.method905(local2306);
				if (local2311 != null) {
					local2311.method2073();
				}
				Static113.aClass31_8.method912(local2306, new Class2_Sub7(local158));
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 61) {
				if (Static94.anInt2471 != -1) {
					Static71.method1275(Static94.anInt2471);
					Static94.anInt2471 = -1;
					Static100.aBoolean118 = true;
					Static78.aBoolean85 = true;
				}
				if (anInt1312 != -1) {
					Static71.method1275(anInt1312);
					Static115.aBoolean77 = true;
					anInt1312 = -1;
				}
				if (Static46.anInt1229 != -1) {
					Static71.method1275(Static46.anInt1229);
					Static46.anInt1229 = -1;
					Static104.method1914(30);
				}
				if (Static9.anInt237 != -1) {
					Static71.method1275(Static9.anInt237);
					Static9.anInt237 = -1;
				}
				if (Static78.anInt2037 != -1) {
					Static71.method1275(Static78.anInt2037);
					Static78.anInt2037 = -1;
				}
				if (Static32.anInt910 != 0) {
					Static32.anInt910 = 0;
					Static115.aBoolean77 = true;
				}
				Static10.anInt253 = -1;
				Static80.anInt2060 = -1;
				return true;
			}
			if (Static10.anInt253 == 182) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1410();
				local158 = Static92.aClass2_Sub12_Sub1_3.method1395();
				local1249 = Static71.method1274(local158);
				if (local1249.anInt667 != local131 || local131 == -1) {
					local1249.anInt667 = local131;
					local1249.anInt684 = 0;
					local1249.anInt664 = 0;
				}
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 111) {
				Static100.aBoolean118 = true;
				local131 = Static92.aClass2_Sub12_Sub1_3.method1412();
				local158 = Static92.aClass2_Sub12_Sub1_3.method1366();
				if (local131 >= 0) {
					local1249 = Static71.method1274(local131);
				} else {
					local1249 = null;
				}
				while (Static111.anInt2876 > Static92.aClass2_Sub12_Sub1_3.anInt1939) {
					local791 = 0;
					local783 = Static92.aClass2_Sub12_Sub1_3.method1397();
					local1360 = Static92.aClass2_Sub12_Sub1_3.method1366();
					if (local1360 != 0) {
						local791 = Static92.aClass2_Sub12_Sub1_3.method1399();
						if (local791 == 255) {
							local791 = Static92.aClass2_Sub12_Sub1_3.method1412();
						}
					}
					if (local1249 != null && local783 >= 0 && local1249.anIntArray57.length > local783) {
						local1249.anIntArray57[local783] = local1360;
						local1249.anIntArray54[local783] = local791;
					}
					Static82.method1503(local158, local1360 - 1, local791, local783);
				}
				Static10.anInt253 = -1;
				Static71.anInt1803 = Static113.anInt2952;
				return true;
			}
			if (Static10.anInt253 == 58) {
				for (local131 = 0; local131 < Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1.length; local131++) {
					if (Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local131] != null) {
						Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local131].anInt2168 = -1;
					}
				}
				for (local158 = 0; local158 < Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1.length; local158++) {
					if (Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local158] != null) {
						Static7.aClass2_Sub1_Sub4_Sub2_Sub1Array1[local158].anInt2168 = -1;
					}
				}
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 156) {
				Static6.method148();
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 222) {
				Static103.anInt2694 = Static92.aClass2_Sub12_Sub1_3.method1388();
				Static4.anInt134 = Static92.aClass2_Sub12_Sub1_3.method1399();
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 66) {
				Static106.anInt2726 = Static92.aClass2_Sub12_Sub1_3.method1399();
				Static10.anInt253 = -1;
				Static100.aBoolean118 = true;
				return true;
			}
			if (Static10.anInt253 == 55) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1372();
				@Pc(2635) boolean local2635 = Static92.aClass2_Sub12_Sub1_3.method1391() == 1;
				local1249 = Static71.method1274(local131);
				local1249.aBoolean29 = local2635;
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 52) {
				local773 = Static92.aClass2_Sub12_Sub1_3.method1389();
				local1055 = Static92.aClass2_Sub12_Sub1_3.method1366();
				@Pc(2663) long local2663 = (long) Static92.aClass2_Sub12_Sub1_3.method1408();
				local1652 = Static92.aClass2_Sub12_Sub1_3.method1399();
				@Pc(2673) long local2673 = local2663 + (local1055 << 32);
				@Pc(2675) boolean local2675 = false;
				for (@Pc(2677) int local2677 = 0; local2677 < 100; local2677++) {
					if (Static35.aLongArray4[local2677] == local2673) {
						local2675 = true;
						break;
					}
				}
				if (local1652 <= 1) {
					for (@Pc(2704) int local2704 = 0; local2704 < Static106.anInt2724; local2704++) {
						if (Static4.aLongArray1[local2704] == local773) {
							local2675 = true;
							break;
						}
					}
				}
				if (!local2675 && Static25.anInt631 == 0) {
					Static35.aLongArray4[Static94.anInt2479] = local2673;
					Static94.anInt2479 = (Static94.anInt2479 + 1) % 100;
					@Pc(2747) Class36 local2747 = Static20.method376(Static92.aClass2_Sub12_Sub1_3).method1032();
					if (local1652 == 2 || local1652 == 3) {
						Static40.method1546(local2747, 7, method949(new Class36[] { Static29.aClass36_421, Static114.method2077(local773).method1017() }));
					} else if (local1652 == 1) {
						Static40.method1546(local2747, 7, method949(new Class36[] { Static95.aClass36_1209, Static114.method2077(local773).method1017() }));
					} else {
						Static40.method1546(local2747, 3, Static114.method2077(local773).method1017());
					}
				}
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 8) {
				if (Static109.anInt2825 == 12) {
					Static100.aBoolean118 = true;
				}
				Static57.anInt1502 = Static92.aClass2_Sub12_Sub1_3.method1399();
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 237) {
				Static47.method917(true);
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 40) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1401();
				Static41.method800(local131);
				if (Static94.anInt2471 != -1) {
					Static71.method1275(Static94.anInt2471);
					Static78.aBoolean85 = true;
					Static94.anInt2471 = -1;
					Static100.aBoolean118 = true;
				}
				if (Static46.anInt1229 != -1) {
					Static71.method1275(Static46.anInt1229);
					Static46.anInt1229 = -1;
					Static104.method1914(30);
				}
				if (Static9.anInt237 != -1) {
					Static71.method1275(Static9.anInt237);
					Static9.anInt237 = -1;
				}
				if (Static78.anInt2037 != -1) {
					Static71.method1275(Static78.anInt2037);
					Static78.anInt2037 = -1;
				}
				if (anInt1312 == local131) {
					Static90.method1647(anInt1312);
				} else {
					Static71.method1275(anInt1312);
					anInt1312 = local131;
				}
				Static80.anInt2060 = -1;
				Static6.method145(anInt1312);
				Static10.anInt253 = -1;
				Static115.aBoolean77 = true;
				return true;
			}
			if (Static10.anInt253 == 125) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1395();
				local347 = Static71.method1274(local131);
				for (local377 = 0; local377 < local347.anIntArray57.length; local377++) {
					local347.anIntArray57[local377] = -1;
					local347.anIntArray57[local377] = 0;
				}
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 107) {
				Static15.anInt314 = Static92.aClass2_Sub12_Sub1_3.method1399();
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 76) {
				Static103.anInt2694 = Static92.aClass2_Sub12_Sub1_3.method1382();
				Static4.anInt134 = Static92.aClass2_Sub12_Sub1_3.method1391();
				while (Static92.aClass2_Sub12_Sub1_3.anInt1939 < Static111.anInt2876) {
					Static10.anInt253 = Static92.aClass2_Sub12_Sub1_3.method1399();
					Static17.method340();
				}
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 86) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1376();
				if (local131 >= 0) {
					Static41.method800(local131);
				}
				if (local131 != Static32.anInt900) {
					Static71.method1275(Static32.anInt900);
					Static32.anInt900 = local131;
				}
				Static6.method145(Static32.anInt900);
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 23) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1401();
				local158 = Static92.aClass2_Sub12_Sub1_3.method1412();
				local1249 = Static71.method1274(local158);
				local1249.anInt700 = 1;
				Static10.anInt253 = -1;
				local1249.anInt655 = local131;
				return true;
			}
			if (Static10.anInt253 == 46) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1401();
				Static41.method800(local131);
				if (Static94.anInt2471 != -1) {
					Static71.method1275(Static94.anInt2471);
					Static94.anInt2471 = -1;
					Static100.aBoolean118 = true;
					Static78.aBoolean85 = true;
				}
				if (anInt1312 != -1) {
					Static71.method1275(anInt1312);
					Static115.aBoolean77 = true;
					anInt1312 = -1;
				}
				if (Static46.anInt1229 != -1) {
					Static71.method1275(Static46.anInt1229);
					Static46.anInt1229 = -1;
					Static104.method1914(30);
				}
				if (Static9.anInt237 != -1) {
					Static71.method1275(Static9.anInt237);
					Static9.anInt237 = -1;
				}
				if (Static78.anInt2037 == local131) {
					Static90.method1647(Static78.anInt2037);
				} else {
					Static71.method1275(Static78.anInt2037);
					Static78.anInt2037 = local131;
				}
				Static80.anInt2060 = -1;
				if (Static32.anInt910 != 0) {
					Static115.aBoolean77 = true;
					Static32.anInt910 = 0;
				}
				Static6.method145(Static78.anInt2037);
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 87) {
				for (local131 = 0; local131 < Static97.anInt2572; local131++) {
					@Pc(3175) Class2_Sub1_Sub16 local3175 = Static36.method733(local131);
					if (local3175 != null && local3175.anInt2564 == 0) {
						Static107.anIntArray331[local131] = 0;
						Static4.anIntArray14[local131] = 0;
					}
				}
				Static73.anInt1839 = Static113.anInt2952;
				Static100.aBoolean118 = true;
				Static10.anInt253 = -1;
				if (Static39.anInt980 != -1) {
					Static115.aBoolean77 = true;
				}
				return true;
			}
			if (Static10.anInt253 == 163) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1376();
				if (Static39.anInt980 != local131) {
					Static71.method1275(Static39.anInt980);
					Static39.anInt980 = local131;
				}
				Static115.aBoolean77 = true;
				Static6.method145(Static39.anInt980);
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 57) {
				Static41.anInt1077 = Static92.aClass2_Sub12_Sub1_3.method1401();
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 5) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1378();
				@Pc(3263) byte local3263 = Static92.aClass2_Sub12_Sub1_3.method1406();
				Static107.anIntArray331[local131] = local3263;
				if (Static4.anIntArray14[local131] != local3263) {
					Static4.anIntArray14[local131] = local3263;
					Static73.method1299(local131);
					if (Static39.anInt980 != -1) {
						Static115.aBoolean77 = true;
					}
					Static100.aBoolean118 = true;
				}
				Static10.anInt253 = -1;
				Static73.anInt1839 = Static113.anInt2952;
				return true;
			}
			if (Static10.anInt253 == 38) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1366();
				local158 = Static92.aClass2_Sub12_Sub1_3.method1401();
				local377 = Static92.aClass2_Sub12_Sub1_3.method1372();
				local516 = Static71.method1274(local377);
				Static10.anInt253 = -1;
				local516.anInt674 = local158 + (local131 << 16);
				return true;
			}
			if (Static10.anInt253 == 2) {
				local1033 = Static92.aClass2_Sub12_Sub1_3.method1404();
				@Pc(3343) Object[] local3343 = new Object[local1033.method1028() + 1];
				for (local377 = local1033.method1028() - 1; local377 >= 0; local377--) {
					if (local1033.method1004(local377) == 115) {
						local3343[local377 + 1] = Static92.aClass2_Sub12_Sub1_3.method1404();
					} else {
						local3343[local377 + 1] = Integer.valueOf(Static92.aClass2_Sub12_Sub1_3.method1412());
					}
				}
				local3343[0] = Integer.valueOf(Static92.aClass2_Sub12_Sub1_3.method1412());
				Static92.method1684(null, local3343, 0, 0, 0, null);
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 191) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1367();
				local158 = Static92.aClass2_Sub12_Sub1_3.method1376();
				local377 = Static92.aClass2_Sub12_Sub1_3.method1410();
				local516 = Static71.method1274(local131);
				local516.anInt685 = local158 + local516.anInt673;
				local516.anInt722 = local516.anInt711 + local377;
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 172) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1366();
				local158 = Static92.aClass2_Sub12_Sub1_3.method1399();
				local377 = Static92.aClass2_Sub12_Sub1_3.method1366();
				Static32.method702(local158, local377, local131);
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 180) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1378();
				if (local131 == 65535) {
					local131 = -1;
				}
				Static63.method1123(local131);
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 45) {
				local131 = Static92.aClass2_Sub12_Sub1_3.method1378();
				if (local131 == 65535) {
					local131 = -1;
				}
				local158 = Static92.aClass2_Sub12_Sub1_3.method1374();
				Static50.method967(local158, local131);
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 42) {
				Static4.anInt134 = Static92.aClass2_Sub12_Sub1_3.method1388();
				Static103.anInt2694 = Static92.aClass2_Sub12_Sub1_3.method1391();
				for (local131 = Static103.anInt2694; local131 < Static103.anInt2694 + 8; local131++) {
					for (local158 = Static4.anInt134; local158 < Static4.anInt134 + 8; local158++) {
						if (Static3.aClass8ArrayArrayArray2[Static92.anInt2412][local131][local158] != null) {
							Static3.aClass8ArrayArrayArray2[Static92.anInt2412][local131][local158] = null;
							Static66.method1156(local158, local131);
						}
					}
				}
				for (@Pc(3572) Class2_Sub8 local3572 = (Class2_Sub8) Static39.aClass8_2.method175(); local3572 != null; local3572 = (Class2_Sub8) Static39.aClass8_2.method173()) {
					if (Static103.anInt2694 <= local3572.anInt1109 && local3572.anInt1109 < Static103.anInt2694 + 8 && local3572.anInt1114 >= Static4.anInt134 && local3572.anInt1114 < Static4.anInt134 + 8 && local3572.anInt1124 == Static92.anInt2412) {
						local3572.anInt1108 = 0;
					}
				}
				Static10.anInt253 = -1;
				return true;
			}
			if (Static10.anInt253 == 208) {
				Static10.anInt253 = -1;
				Static22.anInt576 = 0;
				return true;
			}
			if (Static10.anInt253 == 215) {
				Static38.anInt968 = Static92.aClass2_Sub12_Sub1_3.method1388();
				if (Static38.anInt968 == Static109.anInt2825) {
					Static100.aBoolean118 = true;
					if (Static38.anInt968 == 3) {
						Static109.anInt2825 = 1;
					} else {
						Static109.anInt2825 = 3;
					}
				}
				Static10.anInt253 = -1;
				return true;
			}
			Static90.method1648(null, "T1 - " + Static10.anInt253 + "," + Static15.anInt318 + "," + Static112.anInt2926 + " - " + Static111.anInt2876);
			Static117.method1386();
		} catch (@Pc(3688) IOException local3688) {
			Static76.method1457();
		} catch (@Pc(3692) Exception local3692) {
			@Pc(3733) String local3733 = "T2 - " + Static10.anInt253 + "," + Static15.anInt318 + "," + Static112.anInt2926 + " - " + Static111.anInt2876 + "," + (Static25.anInt632 + Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]) + "," + (Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0] + Static23.anInt592) + " - ";
			for (local158 = 0; Static111.anInt2876 > local158 && local158 < 50; local158++) {
				local3733 = local3733 + Static92.aClass2_Sub12_Sub1_3.aByteArray20[local158] + ",";
			}
			Static90.method1648(local3692, local3733);
			Static117.method1386();
		}
		return true;
	}
}
