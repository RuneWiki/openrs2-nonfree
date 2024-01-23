import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "Lclient!ek;")
	public static Class42 aClass42_57;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "Lclient!ek;")
	public static Class42 aClass42_58;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray27 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
	public static int anInt3994 = 0;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString133 = "RuneScape is loading - please wait...";

	@OriginalMember(owner = "client!nh", name = "j", descriptor = "Z")
	public static boolean aBoolean274 = false;

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(BZ[B)Ljava/lang/Object;")
	public static Object method3285(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static155.aBoolean239) {
			try {
				@Pc(19) Class14 local19 = (Class14) Class.forName("Class14_Sub1").getDeclaredConstructor().newInstance();
				local19.method347(arg0);
				return local19;
			} catch (@Pc(26) Throwable local26) {
				Static155.aBoolean239 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)Z")
	public static boolean method3287() throws IOException {
		if (Static253.aClass34_3 == null) {
			return false;
		}
		@Pc(14) int local14 = Static253.aClass34_3.method1073();
		if (local14 == 0) {
			return false;
		}
		if (Static259.anInt5137 == -1) {
			local14--;
			Static253.aClass34_3.method1074(0, 1, Static91.aClass2_Sub16_Sub1_1.aByteArray17);
			Static91.aClass2_Sub16_Sub1_1.anInt2789 = 0;
			Static259.anInt5137 = Static91.aClass2_Sub16_Sub1_1.method2200();
			Static218.anInt4451 = Static110.anIntArray220[Static259.anInt5137];
		}
		if (Static218.anInt4451 == -1) {
			if (local14 <= 0) {
				return false;
			}
			local14--;
			Static253.aClass34_3.method1074(0, 1, Static91.aClass2_Sub16_Sub1_1.aByteArray17);
			Static218.anInt4451 = Static91.aClass2_Sub16_Sub1_1.aByteArray17[0] & 0xFF;
		}
		if (Static218.anInt4451 == -2) {
			if (local14 <= 1) {
				return false;
			}
			Static253.aClass34_3.method1074(0, 2, Static91.aClass2_Sub16_Sub1_1.aByteArray17);
			Static91.aClass2_Sub16_Sub1_1.anInt2789 = 0;
			Static218.anInt4451 = Static91.aClass2_Sub16_Sub1_1.method2130();
			local14 -= 2;
		}
		if (Static218.anInt4451 > local14) {
			return false;
		}
		Static91.aClass2_Sub16_Sub1_1.anInt2789 = 0;
		Static253.aClass34_3.method1074(0, Static218.anInt4451, Static91.aClass2_Sub16_Sub1_1.aByteArray17);
		Static21.anInt454 = 0;
		Static244.anInt4865 = Static154.anInt3462;
		Static154.anInt3462 = Static34.anInt892;
		Static34.anInt892 = Static259.anInt5137;
		if (Static259.anInt5137 == 9) {
			Static252.method3956(Static91.aClass2_Sub16_Sub1_1.method2158());
			Static259.anInt5137 = -1;
			return true;
		}
		@Pc(139) int local139;
		@Pc(143) int local143;
		@Pc(147) int local147;
		@Pc(157) String local157;
		if (Static259.anInt5137 == 104) {
			local139 = Static91.aClass2_Sub16_Sub1_1.method2137();
			local143 = Static91.aClass2_Sub16_Sub1_1.method2148();
			local147 = Static91.aClass2_Sub16_Sub1_1.method2146();
			if (local139 == 65535) {
				local139 = -1;
			}
			local157 = Static91.aClass2_Sub16_Sub1_1.method2158();
			if (local147 >= 1 && local147 <= 8) {
				if (local157.equalsIgnoreCase("null")) {
					local157 = null;
				}
				Static113.aStringArray20[local147 - 1] = local157;
				Static80.anIntArray165[local147 - 1] = local139;
				Static60.aBooleanArray3[local147 - 1] = local143 == 0;
			}
			Static259.anInt5137 = -1;
			return true;
		}
		@Pc(219) int local219;
		@Pc(223) int local223;
		@Pc(227) int local227;
		if (Static259.anInt5137 == 158) {
			local139 = Static91.aClass2_Sub16_Sub1_1.method2130();
			local143 = Static91.aClass2_Sub16_Sub1_1.method2146();
			local147 = Static91.aClass2_Sub16_Sub1_1.method2146();
			local219 = Static91.aClass2_Sub16_Sub1_1.method2146();
			local223 = Static91.aClass2_Sub16_Sub1_1.method2146();
			local227 = Static91.aClass2_Sub16_Sub1_1.method2130();
			if (Static73.method1394(local139)) {
				Static103.aBooleanArray8[local143] = true;
				Static64.anIntArray133[local143] = local147;
				Static197.anIntArray409[local143] = local219;
				Static280.anIntArray527[local143] = local223;
				Static66.anIntArray135[local143] = local227;
			}
			Static259.anInt5137 = -1;
			return true;
		}
		@Pc(270) String local270;
		if (Static259.anInt5137 == 170) {
			local139 = Static91.aClass2_Sub16_Sub1_1.method2130();
			local270 = Static91.aClass2_Sub16_Sub1_1.method2158();
			@Pc(276) Object[] local276 = new Object[local270.length() + 1];
			for (local219 = local270.length() - 1; local219 >= 0; local219--) {
				if (local270.charAt(local219) == 's') {
					local276[local219 + 1] = Static91.aClass2_Sub16_Sub1_1.method2158();
				} else {
					local276[local219 + 1] = Integer.valueOf(Static91.aClass2_Sub16_Sub1_1.method2145());
				}
			}
			local276[0] = Integer.valueOf(Static91.aClass2_Sub16_Sub1_1.method2145());
			if (Static73.method1394(local139)) {
				@Pc(330) Class2_Sub12 local330 = new Class2_Sub12();
				local330.anObjectArray1 = local276;
				Static204.method3467(local330);
			}
			Static259.anInt5137 = -1;
			return true;
		} else if (Static259.anInt5137 == 245) {
			local139 = Static91.aClass2_Sub16_Sub1_1.method2152();
			local143 = Static91.aClass2_Sub16_Sub1_1.method2137();
			local147 = Static91.aClass2_Sub16_Sub1_1.method2165();
			if (Static73.method1394(local139)) {
				Static265.method4163(local147, local143);
			}
			Static259.anInt5137 = -1;
			return true;
		} else if (Static259.anInt5137 == 103) {
			local139 = Static91.aClass2_Sub16_Sub1_1.method2155();
			local143 = Static91.aClass2_Sub16_Sub1_1.method2152();
			if (Static73.method1394(local143)) {
				Static37.method712(0, 2047, 5, local139);
			}
			Static259.anInt5137 = -1;
			return true;
		} else if (Static259.anInt5137 == 34) {
			local139 = Static91.aClass2_Sub16_Sub1_1.method2155();
			local143 = Static91.aClass2_Sub16_Sub1_1.method2152();
			local147 = Static91.aClass2_Sub16_Sub1_1.method2195();
			local219 = Static91.aClass2_Sub16_Sub1_1.method2152();
			local223 = Static91.aClass2_Sub16_Sub1_1.method2195();
			if (Static73.method1394(local223)) {
				Static37.method712(local143, local219 | local147 << 16, 7, local139);
			}
			Static259.anInt5137 = -1;
			return true;
		} else if (Static259.anInt5137 == 133) {
			Static131.method2424();
			Static33.anInt878 = Static91.aClass2_Sub16_Sub1_1.method2191();
			Static259.anInt5137 = -1;
			Static44.anInt1147 = Static291.anInt5632;
			return true;
		} else if (Static259.anInt5137 == 149) {
			local139 = Static91.aClass2_Sub16_Sub1_1.method2130();
			local143 = Static91.aClass2_Sub16_Sub1_1.method2146();
			if (local139 == 65535) {
				local139 = -1;
			}
			local147 = Static91.aClass2_Sub16_Sub1_1.method2130();
			local219 = Static91.aClass2_Sub16_Sub1_1.method2146();
			Static89.method1572(local139, local143, local219, local147);
			Static259.anInt5137 = -1;
			return true;
		} else {
			@Pc(506) boolean local506;
			@Pc(514) String local514;
			@Pc(520) String local520;
			@Pc(522) boolean local522;
			@Pc(549) int local549;
			@Pc(685) int local685;
			@Pc(693) int local693;
			@Pc(733) int local733;
			@Pc(751) String local751;
			@Pc(769) String local769;
			@Pc(787) String local787;
			@Pc(805) int local805;
			if (Static259.anInt5137 == 150) {
				local506 = Static91.aClass2_Sub16_Sub1_1.method2146() == 1;
				local270 = Static91.aClass2_Sub16_Sub1_1.method2158();
				local514 = Static91.aClass2_Sub16_Sub1_1.method2158();
				local219 = Static91.aClass2_Sub16_Sub1_1.method2130();
				local520 = "";
				local522 = false;
				local223 = Static91.aClass2_Sub16_Sub1_1.method2146();
				if (local219 > 0) {
					local520 = Static91.aClass2_Sub16_Sub1_1.method2158();
					local522 = Static91.aClass2_Sub16_Sub1_1.method2146() == 1;
				}
				for (local549 = 0; local549 < Static41.anInt999; local549++) {
					if (local506) {
						if (local514.equals(Static222.aStringArray34[local549])) {
							Static222.aStringArray34[local549] = local270;
							local270 = null;
							Static151.aStringArray25[local549] = local514;
							break;
						}
					} else if (local270.equals(Static222.aStringArray34[local549])) {
						if (local219 != Static102.anIntArray207[local549]) {
							Static102.anIntArray207[local549] = local219;
							if (local219 > 0) {
								Static155.method2848(local270 + Static277.aString189, "", 0, "", 5);
							}
							if (local219 == 0) {
								Static155.method2848(local270 + Static130.aString100, "", 0, "", 5);
							}
						}
						Static151.aStringArray25[local549] = local514;
						Static38.aStringArray4[local549] = local520;
						local270 = null;
						Static48.anIntArray97[local549] = local223;
						Static284.aBooleanArray22[local549] = local522;
						break;
					}
				}
				if (local270 != null && Static41.anInt999 < 200) {
					Static222.aStringArray34[Static41.anInt999] = local270;
					Static151.aStringArray25[Static41.anInt999] = local514;
					Static102.anIntArray207[Static41.anInt999] = local219;
					Static38.aStringArray4[Static41.anInt999] = local520;
					Static48.anIntArray97[Static41.anInt999] = local223;
					Static284.aBooleanArray22[Static41.anInt999] = local522;
					Static41.anInt999++;
				}
				Static233.anInt6039 = Static291.anInt5632;
				local685 = Static41.anInt999;
				while (local685 > 0) {
					@Pc(690) boolean local690 = true;
					local685--;
					for (local693 = 0; local693 < local685; local693++) {
						if (Static74.anInt1836 != Static102.anIntArray207[local693] && Static102.anIntArray207[local693 + 1] == Static74.anInt1836 || Static102.anIntArray207[local693] == 0 && Static102.anIntArray207[local693 + 1] != 0) {
							local690 = false;
							local733 = Static102.anIntArray207[local693];
							Static102.anIntArray207[local693] = Static102.anIntArray207[local693 + 1];
							Static102.anIntArray207[local693 + 1] = local733;
							local751 = Static38.aStringArray4[local693];
							Static38.aStringArray4[local693] = Static38.aStringArray4[local693 + 1];
							Static38.aStringArray4[local693 + 1] = local751;
							local769 = Static222.aStringArray34[local693];
							Static222.aStringArray34[local693] = Static222.aStringArray34[local693 + 1];
							Static222.aStringArray34[local693 + 1] = local769;
							local787 = Static151.aStringArray25[local693];
							Static151.aStringArray25[local693] = Static151.aStringArray25[local693 + 1];
							Static151.aStringArray25[local693 + 1] = local787;
							local805 = Static48.anIntArray97[local693];
							Static48.anIntArray97[local693] = Static48.anIntArray97[local693 + 1];
							Static48.anIntArray97[local693 + 1] = local805;
							@Pc(823) boolean local823 = Static284.aBooleanArray22[local693];
							Static284.aBooleanArray22[local693] = Static284.aBooleanArray22[local693 + 1];
							Static284.aBooleanArray22[local693 + 1] = local823;
						}
					}
					if (local690) {
						break;
					}
				}
				Static259.anInt5137 = -1;
				return true;
			} else if (Static259.anInt5137 == 4) {
				local139 = Static91.aClass2_Sub16_Sub1_1.method2130();
				Static170.method3081(local139);
				Static188.anIntArray568[Static155.anInt3472++ & 0x1F] = local139 & 0x7FFF;
				Static259.anInt5137 = -1;
				return true;
			} else if (Static259.anInt5137 == 125) {
				local139 = Static91.aClass2_Sub16_Sub1_1.method2152();
				local143 = Static91.aClass2_Sub16_Sub1_1.method2175();
				Static99.method1711(local143, local139);
				Static259.anInt5137 = -1;
				return true;
			} else if (Static259.anInt5137 == 251) {
				Static131.method2424();
				local139 = Static91.aClass2_Sub16_Sub1_1.method2146();
				local143 = Static91.aClass2_Sub16_Sub1_1.method2155();
				local147 = Static91.aClass2_Sub16_Sub1_1.method2146();
				Static194.anIntArray406[local139] = local143;
				Static264.anIntArray496[local139] = local147;
				Static27.anIntArray526[local139] = 1;
				for (local219 = 0; local219 < 98; local219++) {
					if (local143 >= Class13_Sub4.anIntArray529[local219]) {
						Static27.anIntArray526[local139] = local219 + 2;
					}
				}
				Static245.anIntArray477[Static128.anInt2953++ & 0x1F] = local139;
				Static259.anInt5137 = -1;
				return true;
			} else if (Static259.anInt5137 == 166) {
				local139 = Static91.aClass2_Sub16_Sub1_1.method2155();
				@Pc(974) Class56 local974 = Static38.method715(local139);
				for (local147 = 0; local147 < local974.anIntArray178.length; local147++) {
					local974.anIntArray178[local147] = -1;
					local974.anIntArray178[local147] = 0;
				}
				Static287.method4466(local974);
				Static259.anInt5137 = -1;
				return true;
			} else if (Static259.anInt5137 == 202) {
				local139 = Static91.aClass2_Sub16_Sub1_1.method2155();
				local143 = Static91.aClass2_Sub16_Sub1_1.method2152();
				Static99.method1711(local139, local143);
				Static259.anInt5137 = -1;
				return true;
			} else if (Static259.anInt5137 == 219) {
				local139 = Static91.aClass2_Sub16_Sub1_1.method2130();
				local143 = Static91.aClass2_Sub16_Sub1_1.method2152();
				local514 = Static91.aClass2_Sub16_Sub1_1.method2158();
				if (Static73.method1394(local139)) {
					Static156.method2850(local143, local514);
				}
				Static259.anInt5137 = -1;
				return true;
			} else if (Static259.anInt5137 == 25) {
				Static13.method236();
				Static131.method2424();
				Static259.anInt5137 = -1;
				Static274.anInt5434 += 32;
				return true;
			} else if (Static259.anInt5137 == 80) {
				local139 = Static91.aClass2_Sub16_Sub1_1.method2130();
				local143 = Static91.aClass2_Sub16_Sub1_1.method2145();
				if (Static73.method1394(local139)) {
					@Pc(1088) Class2_Sub4 local1088 = (Class2_Sub4) Static132.aClass101_8.method2867((long) local143);
					if (local1088 != null) {
						Static225.method4281(local1088, true);
					}
					if (Static159.aClass56_17 != null) {
						Static287.method4466(Static159.aClass56_17);
						Static159.aClass56_17 = null;
					}
				}
				Static259.anInt5137 = -1;
				return true;
			} else {
				@Pc(1132) Class56 local1132;
				@Pc(1189) int local1189;
				if (Static259.anInt5137 == 66) {
					local139 = Static91.aClass2_Sub16_Sub1_1.method2145();
					local143 = Static91.aClass2_Sub16_Sub1_1.method2130();
					if (local139 < -70000) {
						local143 += 32768;
					}
					if (local139 < 0) {
						local1132 = null;
					} else {
						local1132 = Static38.method715(local139);
					}
					if (local1132 != null) {
						for (local219 = 0; local219 < local1132.anIntArray178.length; local219++) {
							local1132.anIntArray178[local219] = 0;
							local1132.anIntArray180[local219] = 0;
						}
					}
					Static141.method2498(local143);
					local219 = Static91.aClass2_Sub16_Sub1_1.method2130();
					for (local223 = 0; local223 < local219; local223++) {
						local227 = Static91.aClass2_Sub16_Sub1_1.method2175();
						if (local227 == 255) {
							local227 = Static91.aClass2_Sub16_Sub1_1.method2159();
						}
						local1189 = Static91.aClass2_Sub16_Sub1_1.method2152();
						if (local1132 != null && local223 < local1132.anIntArray178.length) {
							local1132.anIntArray178[local223] = local1189;
							local1132.anIntArray180[local223] = local227;
						}
						Static4.method100(local223, local1189 - 1, local143, local227);
					}
					if (local1132 != null) {
						Static287.method4466(local1132);
					}
					Static131.method2424();
					Static188.anIntArray568[Static155.anInt3472++ & 0x1F] = local143 & 0x7FFF;
					Static259.anInt5137 = -1;
					return true;
				} else if (Static259.anInt5137 == 206) {
					local139 = Static91.aClass2_Sub16_Sub1_1.method2146();
					if (Static91.aClass2_Sub16_Sub1_1.method2146() == 0) {
						Static45.aClass70Array2[local139] = new Class70();
					} else {
						Static91.aClass2_Sub16_Sub1_1.anInt2789--;
						Static45.aClass70Array2[local139] = new Class70(Static91.aClass2_Sub16_Sub1_1);
					}
					Static52.anInt1307 = Static291.anInt5632;
					Static259.anInt5137 = -1;
					return true;
				} else {
					@Pc(1297) byte local1297;
					if (Static259.anInt5137 == 6) {
						local139 = Static91.aClass2_Sub16_Sub1_1.method2195();
						local1297 = Static91.aClass2_Sub16_Sub1_1.method2170();
						Static47.method881(local139, local1297);
						Static259.anInt5137 = -1;
						return true;
					} else if (Static259.anInt5137 == 110) {
						local139 = Static91.aClass2_Sub16_Sub1_1.method2165();
						Static268.aClass111_8 = Static164.aClass102_2.method2882(local139);
						Static259.anInt5137 = -1;
						return true;
					} else {
						@Pc(1353) String local1353;
						if (Static259.anInt5137 == 63) {
							local139 = Static91.aClass2_Sub16_Sub1_1.method2146();
							local514 = Static91.aClass2_Sub16_Sub1_1.method2158();
							local157 = Static91.aClass2_Sub16_Sub1_1.method2158();
							@Pc(1349) boolean local1349 = (local139 & 0x1) == 1;
							local1353 = Static91.aClass2_Sub16_Sub1_1.method2158();
							local520 = Static91.aClass2_Sub16_Sub1_1.method2158();
							if (local1349) {
								for (local1189 = 0; local1189 < Static56.anInt1437; local1189++) {
									if (Static20.aStringArray2[local1189].equals(local520)) {
										Static242.aStringArray38[local1189] = local514;
										if (local157.equals("")) {
											Static20.aStringArray2[local1189] = local514;
										} else {
											Static20.aStringArray2[local1189] = local157;
										}
										Static262.aStringArray43[local1189] = local1353;
										if (local520.equals("")) {
											Static115.aStringArray46[local1189] = local1353;
										} else {
											Static115.aStringArray46[local1189] = local520;
										}
										break;
									}
								}
							} else {
								Static242.aStringArray38[Static56.anInt1437] = local514;
								if (local157.equals("")) {
									Static20.aStringArray2[Static56.anInt1437] = local514;
								} else {
									Static20.aStringArray2[Static56.anInt1437] = local157;
								}
								Static262.aStringArray43[Static56.anInt1437] = local1353;
								if (local520.equals("")) {
									Static115.aStringArray46[Static56.anInt1437] = local1353;
								} else {
									Static115.aStringArray46[Static56.anInt1437] = local520;
								}
								Static187.aBooleanArray16[Static56.anInt1437] = (local139 & 0x2) == 2;
								Static56.anInt1437++;
							}
							Static233.anInt6039 = Static291.anInt5632;
							Static259.anInt5137 = -1;
							return true;
						}
						@Pc(1482) String local1482;
						if (Static259.anInt5137 == 144) {
							local1482 = Static91.aClass2_Sub16_Sub1_1.method2158();
							local143 = Static91.aClass2_Sub16_Sub1_1.method2137();
							local147 = Static91.aClass2_Sub16_Sub1_1.method2165();
							if (Static73.method1394(local143)) {
								Static34.method658(local147, local1482);
							}
							Static259.anInt5137 = -1;
							return true;
						} else if (Static259.anInt5137 == 244) {
							local139 = Static91.aClass2_Sub16_Sub1_1.method2137();
							local143 = Static91.aClass2_Sub16_Sub1_1.method2148();
							if (Static73.method1394(local139)) {
								Static211.anInt4324 = local143;
							}
							Static259.anInt5137 = -1;
							return true;
						} else if (Static259.anInt5137 == 193) {
							Static5.anInt4796 = Static91.aClass2_Sub16_Sub1_1.method2175();
							Static215.anInt4395 = Static91.aClass2_Sub16_Sub1_1.method2146();
							for (local139 = Static5.anInt4796; local139 < Static5.anInt4796 + 8; local139++) {
								for (local143 = Static215.anInt4395; local143 < Static215.anInt4395 + 8; local143++) {
									if (Static121.aClass44ArrayArrayArray1[Static32.anInt876][local139][local143] != null) {
										Static121.aClass44ArrayArrayArray1[Static32.anInt876][local139][local143] = null;
										Static99.method1706(local139, local143);
									}
								}
							}
							for (@Pc(1590) Class2_Sub29 local1590 = (Class2_Sub29) Static300.aClass44_26.method1352(); local1590 != null; local1590 = (Class2_Sub29) Static300.aClass44_26.method1360()) {
								if (local1590.anInt5687 >= Static5.anInt4796 && local1590.anInt5687 < Static5.anInt4796 + 8 && Static215.anInt4395 <= local1590.anInt5681 && local1590.anInt5681 < Static215.anInt4395 + 8 && local1590.anInt5692 == Static32.anInt876) {
									local1590.anInt5683 = 0;
								}
							}
							Static259.anInt5137 = -1;
							return true;
						} else if (Static259.anInt5137 == 31) {
							local1482 = Static91.aClass2_Sub16_Sub1_1.method2158();
							local143 = Static91.aClass2_Sub16_Sub1_1.method2130();
							local514 = Static231.method3762(local143).method1865(Static91.aClass2_Sub16_Sub1_1);
							Static120.method2007(null, local514, local1482, local143, local1482, 19, 0);
							Static259.anInt5137 = -1;
							return true;
						} else if (Static259.anInt5137 == 137) {
							local139 = Static91.aClass2_Sub16_Sub1_1.method2146();
							local143 = Static91.aClass2_Sub16_Sub1_1.method2133();
							local147 = Static91.aClass2_Sub16_Sub1_1.method2146();
							Static32.anInt876 = local139 >> 1;
							Static22.aClass15_Sub2_Sub2_1.method4305((local139 & 0x1) == 1, local147, local143);
							Static259.anInt5137 = -1;
							return true;
						} else if (Static259.anInt5137 == 39) {
							local139 = Static91.aClass2_Sub16_Sub1_1.method2152();
							local143 = Static91.aClass2_Sub16_Sub1_1.method2175();
							local147 = Static91.aClass2_Sub16_Sub1_1.method2145();
							if (Static73.method1394(local139)) {
								Static128.method2316(local143, local147);
							}
							Static259.anInt5137 = -1;
							return true;
						} else if (Static259.anInt5137 == 167) {
							local139 = Static91.aClass2_Sub16_Sub1_1.method2152();
							local143 = Static91.aClass2_Sub16_Sub1_1.method2152();
							local147 = Static91.aClass2_Sub16_Sub1_1.method2145();
							local219 = Static91.aClass2_Sub16_Sub1_1.method2165();
							if (Static73.method1394(local143)) {
								Static37.method712(local147, local139, 5, local219);
							}
							Static259.anInt5137 = -1;
							return true;
						} else if (Static259.anInt5137 == 161) {
							Static215.anInt4395 = Static91.aClass2_Sub16_Sub1_1.method2146();
							Static5.anInt4796 = Static91.aClass2_Sub16_Sub1_1.method2175();
							while (Static218.anInt4451 > Static91.aClass2_Sub16_Sub1_1.anInt2789) {
								Static259.anInt5137 = Static91.aClass2_Sub16_Sub1_1.method2146();
								Static89.method1578();
							}
							Static259.anInt5137 = -1;
							return true;
						} else if (Static259.anInt5137 == 93) {
							local139 = Static91.aClass2_Sub16_Sub1_1.method2146();
							local143 = local139 >> 5;
							local147 = local139 & 0x1F;
							if (local147 == 0) {
								Static308.aClass47Array1[local143] = null;
								Static259.anInt5137 = -1;
								return true;
							}
							@Pc(1844) Class47 local1844 = new Class47();
							local1844.anInt1830 = local147;
							local1844.anInt1845 = Static91.aClass2_Sub16_Sub1_1.method2146();
							if (local1844.anInt1845 >= 0 && Static46.aClass2_Sub8_Sub1Array1.length > local1844.anInt1845) {
								if (local1844.anInt1830 == 1 || local1844.anInt1830 == 10) {
									local1844.anInt1838 = Static91.aClass2_Sub16_Sub1_1.method2130();
									Static91.aClass2_Sub16_Sub1_1.anInt2789 += 5;
								} else if (local1844.anInt1830 >= 2 && local1844.anInt1830 <= 6) {
									if (local1844.anInt1830 == 2) {
										local1844.anInt1843 = 64;
										local1844.anInt1844 = 64;
									}
									if (local1844.anInt1830 == 3) {
										local1844.anInt1843 = 0;
										local1844.anInt1844 = 64;
									}
									if (local1844.anInt1830 == 4) {
										local1844.anInt1843 = 128;
										local1844.anInt1844 = 64;
									}
									if (local1844.anInt1830 == 5) {
										local1844.anInt1844 = 0;
										local1844.anInt1843 = 64;
									}
									if (local1844.anInt1830 == 6) {
										local1844.anInt1844 = 128;
										local1844.anInt1843 = 64;
									}
									local1844.anInt1830 = 2;
									local1844.anInt1846 = Static91.aClass2_Sub16_Sub1_1.method2130();
									local1844.anInt1832 = Static91.aClass2_Sub16_Sub1_1.method2130();
									local1844.anInt1839 = Static91.aClass2_Sub16_Sub1_1.method2146();
									local1844.anInt1834 = Static91.aClass2_Sub16_Sub1_1.method2130();
								}
								local1844.anInt1840 = Static91.aClass2_Sub16_Sub1_1.method2130();
								if (local1844.anInt1840 == 65535) {
									local1844.anInt1840 = -1;
								}
								Static308.aClass47Array1[local143] = local1844;
							}
							Static259.anInt5137 = -1;
							return true;
						} else if (Static259.anInt5137 == 190) {
							if (Static303.anInt5868 != -1) {
								Static73.method1398(0, Static303.anInt5868);
							}
							Static259.anInt5137 = -1;
							return true;
						} else if (Static259.anInt5137 == 172) {
							Static269.method4268();
							Static259.anInt5137 = -1;
							return true;
						} else {
							@Pc(2053) long local2053;
							@Pc(2058) long local2058;
							if (Static259.anInt5137 == 106) {
								local506 = Static91.aClass2_Sub16_Sub1_1.method2146() == 1;
								local270 = Static91.aClass2_Sub16_Sub1_1.method2158();
								local514 = local270;
								if (local506) {
									local514 = Static91.aClass2_Sub16_Sub1_1.method2158();
								}
								local2053 = Static91.aClass2_Sub16_Sub1_1.method2130();
								local2058 = Static91.aClass2_Sub16_Sub1_1.method2166();
								local549 = Static91.aClass2_Sub16_Sub1_1.method2146();
								local685 = Static91.aClass2_Sub16_Sub1_1.method2130();
								@Pc(2068) boolean local2068 = false;
								@Pc(2075) long local2075 = (local2053 << 32) + local2058;
								@Pc(2077) int local2077 = 0;
								while (true) {
									if (local2077 >= 100) {
										if (local549 <= 1 && Static44.method842(local514)) {
											local2068 = true;
										}
										break;
									}
									if (local2075 == Static236.aLongArray8[local2077]) {
										local2068 = true;
										break;
									}
									local2077++;
								}
								if (!local2068 && Static151.anInt3324 == 0) {
									Static236.aLongArray8[Static226.anInt6056] = local2075;
									Static226.anInt6056 = (Static226.anInt6056 + 1) % 100;
									local769 = Static231.method3762(local685).method1865(Static91.aClass2_Sub16_Sub1_1);
									if (local549 == 2) {
										Static120.method2007(null, local769, "<img=1>" + local514, local685, "<img=1>" + local270, 18, 0);
									} else if (local549 == 1) {
										Static120.method2007(null, local769, "<img=0>" + local514, local685, "<img=0>" + local270, 18, 0);
									} else {
										Static120.method2007(null, local769, local514, local685, local270, 18, 0);
									}
								}
								Static259.anInt5137 = -1;
								return true;
							} else if (Static259.anInt5137 == 119) {
								Static91.aClass2_Sub16_Sub1_1.anInt2789 += 28;
								if (Static91.aClass2_Sub16_Sub1_1.method2176()) {
									Static115.method4711(Static91.aClass2_Sub16_Sub1_1.anInt2789 - 28, Static91.aClass2_Sub16_Sub1_1);
								}
								Static259.anInt5137 = -1;
								return true;
							} else if (Static259.anInt5137 == 177) {
								local139 = Static91.aClass2_Sub16_Sub1_1.method2152();
								local143 = Static91.aClass2_Sub16_Sub1_1.method2191();
								local147 = Static91.aClass2_Sub16_Sub1_1.method2191();
								local219 = Static91.aClass2_Sub16_Sub1_1.method2145();
								if (Static73.method1394(local139)) {
									Static294.method4516(local143, local147, local219);
								}
								Static259.anInt5137 = -1;
								return true;
							} else {
								@Pc(2313) long local2313;
								@Pc(2328) Class2_Sub7 local2328;
								@Pc(2319) Class2_Sub7 local2319;
								if (Static259.anInt5137 == 252) {
									local139 = Static91.aClass2_Sub16_Sub1_1.method2137();
									if (local139 == 65535) {
										local139 = -1;
									}
									local143 = Static91.aClass2_Sub16_Sub1_1.method2137();
									if (local143 == 65535) {
										local143 = -1;
									}
									local147 = Static91.aClass2_Sub16_Sub1_1.method2137();
									local219 = Static91.aClass2_Sub16_Sub1_1.method2165();
									local223 = Static91.aClass2_Sub16_Sub1_1.method2159();
									if (Static73.method1394(local147)) {
										for (local227 = local143; local227 <= local139; local227++) {
											local2313 = (long) local227 + ((long) local223 << 32);
											local2319 = (Class2_Sub7) Static80.aClass101_4.method2867(local2313);
											if (local2319 != null) {
												local2328 = new Class2_Sub7(local219, local2319.anInt428);
												local2319.method4743();
											} else if (local227 == -1) {
												local2328 = new Class2_Sub7(local219, Static38.method715(local223).aClass2_Sub7_1.anInt428);
											} else {
												local2328 = new Class2_Sub7(local219, -1);
											}
											Static80.aClass101_4.method2860(local2328, local2313);
										}
									}
									Static259.anInt5137 = -1;
									return true;
								}
								@Pc(2407) boolean local2407;
								if (Static259.anInt5137 == 127) {
									local1482 = Static91.aClass2_Sub16_Sub1_1.method2158();
									@Pc(2387) boolean local2387 = Static91.aClass2_Sub16_Sub1_1.method2146() == 1;
									if (local2387) {
										local270 = Static91.aClass2_Sub16_Sub1_1.method2158();
									} else {
										local270 = local1482;
									}
									local219 = Static91.aClass2_Sub16_Sub1_1.method2130();
									@Pc(2405) byte local2405 = Static91.aClass2_Sub16_Sub1_1.method2170();
									local2407 = false;
									if (local2405 == -128) {
										local2407 = true;
									}
									if (local2407) {
										if (Static284.anInt5619 == 0) {
											Static259.anInt5137 = -1;
											return true;
										}
										for (local1189 = 0; local1189 < Static284.anInt5619 && (!Static150.aClass165Array1[local1189].aString176.equals(local270) || Static150.aClass165Array1[local1189].anInt5203 != local219); local1189++) {
										}
										if (local1189 < Static284.anInt5619) {
											while (local1189 < Static284.anInt5619 - 1) {
												Static150.aClass165Array1[local1189] = Static150.aClass165Array1[local1189 + 1];
												local1189++;
											}
											Static284.anInt5619--;
											Static150.aClass165Array1[Static284.anInt5619] = null;
										}
									} else {
										@Pc(2419) String local2419 = Static91.aClass2_Sub16_Sub1_1.method2158();
										@Pc(2423) Class165 local2423 = new Class165();
										local2423.aByte22 = local2405;
										local2423.aString174 = local2419;
										local2423.aString175 = local1482;
										local2423.anInt5203 = local219;
										local2423.aString176 = local270;
										for (local685 = Static284.anInt5619 - 1; local685 >= 0; local685--) {
											local693 = Static150.aClass165Array1[local685].aString176.compareTo(local2423.aString176);
											if (local693 == 0) {
												Static150.aClass165Array1[local685].anInt5203 = local219;
												Static150.aClass165Array1[local685].aByte22 = local2405;
												Static150.aClass165Array1[local685].aString174 = local2419;
												if (local270.equals(Static22.aClass15_Sub2_Sub2_1.aString184)) {
													Static253.aByte20 = local2405;
												}
												Static79.anInt1900 = Static291.anInt5632;
												Static259.anInt5137 = -1;
												return true;
											}
											if (local693 < 0) {
												break;
											}
										}
										if (Static284.anInt5619 >= Static150.aClass165Array1.length) {
											Static259.anInt5137 = -1;
											return true;
										}
										for (local693 = Static284.anInt5619 - 1; local693 > local685; local693--) {
											Static150.aClass165Array1[local693 + 1] = Static150.aClass165Array1[local693];
										}
										if (Static284.anInt5619 == 0) {
											Static150.aClass165Array1 = new Class165[100];
										}
										Static150.aClass165Array1[local685 + 1] = local2423;
										Static284.anInt5619++;
										if (local270.equals(Static22.aClass15_Sub2_Sub2_1.aString184)) {
											Static253.aByte20 = local2405;
										}
									}
									Static79.anInt1900 = Static291.anInt5632;
									Static259.anInt5137 = -1;
									return true;
								} else if (Static259.anInt5137 == 118) {
									local139 = Static91.aClass2_Sub16_Sub1_1.method2152();
									local143 = Static91.aClass2_Sub16_Sub1_1.method2195();
									local147 = Static91.aClass2_Sub16_Sub1_1.method2159();
									if (local143 == 65535) {
										local143 = -1;
									}
									local219 = Static91.aClass2_Sub16_Sub1_1.method2152();
									local223 = Static91.aClass2_Sub16_Sub1_1.method2195();
									if (local223 == 65535) {
										local223 = -1;
									}
									if (Static73.method1394(local219)) {
										for (local227 = local143; local227 <= local223; local227++) {
											local2313 = (long) local227 + ((long) local147 << 32);
											local2319 = (Class2_Sub7) Static80.aClass101_4.method2867(local2313);
											if (local2319 != null) {
												local2328 = new Class2_Sub7(local2319.anInt419, local139);
												local2319.method4743();
											} else if (local227 == -1) {
												local2328 = new Class2_Sub7(Static38.method715(local147).aClass2_Sub7_1.anInt419, local139);
											} else {
												local2328 = new Class2_Sub7(0, local139);
											}
											Static80.aClass101_4.method2860(local2328, local2313);
										}
									}
									Static259.anInt5137 = -1;
									return true;
								} else if (Static259.anInt5137 == 199) {
									Static131.method2424();
									Static69.anInt3038 = Static91.aClass2_Sub16_Sub1_1.method2146();
									Static44.anInt1147 = Static291.anInt5632;
									Static259.anInt5137 = -1;
									return true;
								} else if (Static259.anInt5137 == 198) {
									local139 = Static91.aClass2_Sub16_Sub1_1.method2137();
									local143 = Static91.aClass2_Sub16_Sub1_1.method2195();
									local147 = Static91.aClass2_Sub16_Sub1_1.method2145();
									if (Static73.method1394(local143)) {
										Static202.method2169(local139, local147);
									}
									Static259.anInt5137 = -1;
									return true;
								} else if (Static259.anInt5137 == 229) {
									local139 = Static91.aClass2_Sub16_Sub1_1.method2130();
									local143 = Static91.aClass2_Sub16_Sub1_1.method2146();
									local147 = Static91.aClass2_Sub16_Sub1_1.method2146();
									local219 = Static91.aClass2_Sub16_Sub1_1.method2130();
									local223 = Static91.aClass2_Sub16_Sub1_1.method2146();
									local227 = Static91.aClass2_Sub16_Sub1_1.method2146();
									if (Static73.method1394(local139)) {
										Static12.method231(local147, local143, local227, local219, local223);
									}
									Static259.anInt5137 = -1;
									return true;
								} else if (Static259.anInt5137 == 148) {
									local139 = Static91.aClass2_Sub16_Sub1_1.method2152();
									local143 = Static91.aClass2_Sub16_Sub1_1.method2159();
									local147 = Static91.aClass2_Sub16_Sub1_1.method2137();
									if (Static73.method1394(local139)) {
										Static188.method4592(local147, local143);
									}
									Static259.anInt5137 = -1;
									return true;
								} else if (Static259.anInt5137 == 147) {
									for (local139 = 0; local139 < Static64.anIntArray134.length; local139++) {
										if (Static20.anIntArray55[local139] != Static64.anIntArray134[local139]) {
											Static64.anIntArray134[local139] = Static20.anIntArray55[local139];
											Static143.method2545(local139);
											Static74.anIntArray156[Static274.anInt5434++ & 0x1F] = local139;
										}
									}
									Static259.anInt5137 = -1;
									return true;
								} else if (Static259.anInt5137 == 243) {
									local506 = Static91.aClass2_Sub16_Sub1_1.method2146() == 1;
									local270 = Static91.aClass2_Sub16_Sub1_1.method2158();
									local514 = local270;
									if (local506) {
										local514 = Static91.aClass2_Sub16_Sub1_1.method2158();
									}
									local2053 = Static91.aClass2_Sub16_Sub1_1.method2130();
									local2058 = Static91.aClass2_Sub16_Sub1_1.method2166();
									local549 = Static91.aClass2_Sub16_Sub1_1.method2146();
									@Pc(2951) long local2951 = local2058 + (local2053 << 32);
									@Pc(2953) boolean local2953 = false;
									@Pc(2955) int local2955 = 0;
									while (true) {
										if (local2955 < 100) {
											if (local2951 != Static236.aLongArray8[local2955]) {
												local2955++;
												continue;
											}
											local2953 = true;
											break;
										}
										if (local549 <= 1) {
											if (Static294.aBoolean381 && !Static11.aBoolean21 || Static63.aBoolean103) {
												local2953 = true;
											} else if (Static44.method842(local514)) {
												local2953 = true;
											}
										}
										break;
									}
									if (!local2953 && Static151.anInt3324 == 0) {
										Static236.aLongArray8[Static226.anInt6056] = local2951;
										Static226.anInt6056 = (Static226.anInt6056 + 1) % 100;
										local751 = Static135.method1223(Static295.method4527(Static219.method3638(Static91.aClass2_Sub16_Sub1_1)));
										if (local549 == 2) {
											Static120.method2007(null, local751, "<img=1>" + local514, -1, "<img=1>" + local270, 7, 0);
										} else if (local549 == 1) {
											Static120.method2007(null, local751, "<img=0>" + local514, -1, "<img=0>" + local270, 7, 0);
										} else {
											Static120.method2007(null, local751, local514, -1, local270, 3, 0);
										}
									}
									Static259.anInt5137 = -1;
									return true;
								} else if (Static259.anInt5137 == 182) {
									local139 = Static91.aClass2_Sub16_Sub1_1.method2146();
									local143 = Static91.aClass2_Sub16_Sub1_1.method2146();
									@Pc(3108) byte local3108 = Static91.aClass2_Sub16_Sub1_1.method2170();
									if (Static160.aByte21 != local3108) {
										Static259.anInt5137 = -1;
										return true;
									}
									if (local139 == 255) {
										Static302.anInt5847 = 0;
										Static34.aBoolean52 = false;
										Static269.anInt5272 = 0;
									} else {
										Static269.anInt5272 = local143;
										Static302.anInt5847 = local139;
										Static34.aBoolean52 = true;
									}
									Static259.anInt5137 = -1;
									return true;
								} else if (Static259.anInt5137 == 136) {
									local139 = Static91.aClass2_Sub16_Sub1_1.method2137();
									if (local139 == 65535) {
										local139 = -1;
									}
									local143 = Static91.aClass2_Sub16_Sub1_1.method2133();
									local219 = local143 & 0x3;
									local147 = local143 >> 2;
									local223 = Static61.anIntArray129[local147];
									local227 = Static91.aClass2_Sub16_Sub1_1.method2145();
									local549 = local227 >> 14 & 0x3FFF;
									local549 -= Static160.anInt5159;
									local1189 = local227 >> 28 & 0x3;
									local685 = local227 & 0x3FFF;
									local685 -= Static234.anInt4705;
									Static180.method3213(local223, local139, local1189, local219, local549, local685, local147);
									Static259.anInt5137 = -1;
									return true;
								} else {
									@Pc(3238) Class2_Sub4 local3238;
									if (Static259.anInt5137 == 76) {
										local139 = Static91.aClass2_Sub16_Sub1_1.method2137();
										local143 = Static91.aClass2_Sub16_Sub1_1.method2165();
										local147 = Static91.aClass2_Sub16_Sub1_1.method2148();
										local219 = Static91.aClass2_Sub16_Sub1_1.method2137();
										if (Static73.method1394(local219)) {
											local3238 = (Class2_Sub4) Static132.aClass101_8.method2867((long) local143);
											if (local3238 != null) {
												Static225.method4281(local3238, local139 != local3238.anInt274);
											}
											Static220.method3663(local147, local143, local139);
										}
										Static259.anInt5137 = -1;
										return true;
									} else if (Static259.anInt5137 == 77 || Static259.anInt5137 == 109 || Static259.anInt5137 == 32 || Static259.anInt5137 == 124 || Static259.anInt5137 == 145 || Static259.anInt5137 == 171 || Static259.anInt5137 == 107 || Static259.anInt5137 == 59 || Static259.anInt5137 == 228 || Static259.anInt5137 == 12 || Static259.anInt5137 == 19 || Static259.anInt5137 == 22 || Static259.anInt5137 == 115 || Static259.anInt5137 == 179) {
										Static89.method1578();
										Static259.anInt5137 = -1;
										return true;
									} else if (Static259.anInt5137 == 75) {
										Static132.anInt3030 = Static91.aClass2_Sub16_Sub1_1.method2146();
										Static233.anInt6039 = Static291.anInt5632;
										Static259.anInt5137 = -1;
										return true;
									} else if (Static259.anInt5137 == 230) {
										Static284.method4439(false);
										Static259.anInt5137 = -1;
										return true;
									} else if (Static259.anInt5137 == 146) {
										local139 = Static91.aClass2_Sub16_Sub1_1.method2145();
										local143 = Static91.aClass2_Sub16_Sub1_1.method2130();
										local147 = Static91.aClass2_Sub16_Sub1_1.method2162();
										if (Static73.method1394(local143)) {
											Static242.method3866(local147, local139);
										}
										Static259.anInt5137 = -1;
										return true;
									} else if (Static259.anInt5137 == 214) {
										local139 = Static91.aClass2_Sub16_Sub1_1.method2137();
										local143 = Static91.aClass2_Sub16_Sub1_1.method2130();
										local147 = Static91.aClass2_Sub16_Sub1_1.method2130();
										local219 = Static91.aClass2_Sub16_Sub1_1.method2159();
										if (Static73.method1394(local139)) {
											Static252.method3961(local219, (local143 << 16) + local147);
										}
										Static259.anInt5137 = -1;
										return true;
									} else if (Static259.anInt5137 == 42) {
										Static180.anInt3906 = Static91.aClass2_Sub16_Sub1_1.method2146();
										Static259.anInt5137 = -1;
										return true;
									} else if (Static259.anInt5137 == 29) {
										local139 = Static91.aClass2_Sub16_Sub1_1.method2152();
										local143 = Static91.aClass2_Sub16_Sub1_1.method2130();
										local147 = Static91.aClass2_Sub16_Sub1_1.method2165();
										local219 = Static91.aClass2_Sub16_Sub1_1.method2137();
										local223 = Static91.aClass2_Sub16_Sub1_1.method2152();
										if (Static73.method1394(local139)) {
											Static303.method4609(local143, local223, local219, local147);
										}
										Static259.anInt5137 = -1;
										return true;
									} else if (Static259.anInt5137 == 11) {
										local139 = Static91.aClass2_Sub16_Sub1_1.method2159();
										local143 = Static91.aClass2_Sub16_Sub1_1.method2145();
										local147 = Static91.aClass2_Sub16_Sub1_1.method2137();
										if (Static73.method1394(local147)) {
											@Pc(3493) Class2_Sub4 local3493 = (Class2_Sub4) Static132.aClass101_8.method2867((long) local143);
											local3238 = (Class2_Sub4) Static132.aClass101_8.method2867((long) local139);
											if (local3238 != null) {
												Static225.method4281(local3238, local3493 == null || local3238.anInt274 != local3493.anInt274);
											}
											if (local3493 != null) {
												local3493.method4743();
												Static132.aClass101_8.method2860(local3493, (long) local139);
											}
											@Pc(3532) Class56 local3532 = Static38.method715(local143);
											if (local3532 != null) {
												Static287.method4466(local3532);
											}
											local3532 = Static38.method715(local139);
											if (local3532 != null) {
												Static287.method4466(local3532);
												Static52.method967(true, local3532);
											}
											if (Static303.anInt5868 != -1) {
												Static73.method1398(1, Static303.anInt5868);
											}
										}
										Static259.anInt5137 = -1;
										return true;
									} else if (Static259.anInt5137 == 163) {
										local139 = Static91.aClass2_Sub16_Sub1_1.method2145();
										local143 = Static91.aClass2_Sub16_Sub1_1.method2130();
										if (local139 < -70000) {
											local143 += 32768;
										}
										if (local139 < 0) {
											local1132 = null;
										} else {
											local1132 = Static38.method715(local139);
										}
										while (Static91.aClass2_Sub16_Sub1_1.anInt2789 < Static218.anInt4451) {
											local219 = Static91.aClass2_Sub16_Sub1_1.method2161();
											local227 = 0;
											local223 = Static91.aClass2_Sub16_Sub1_1.method2130();
											if (local223 != 0) {
												local227 = Static91.aClass2_Sub16_Sub1_1.method2146();
												if (local227 == 255) {
													local227 = Static91.aClass2_Sub16_Sub1_1.method2145();
												}
											}
											if (local1132 != null && local219 >= 0 && local219 < local1132.anIntArray178.length) {
												local1132.anIntArray178[local219] = local223;
												local1132.anIntArray180[local219] = local227;
											}
											Static4.method100(local219, local223 - 1, local143, local227);
										}
										if (local1132 != null) {
											Static287.method4466(local1132);
										}
										Static131.method2424();
										Static188.anIntArray568[Static155.anInt3472++ & 0x1F] = local143 & 0x7FFF;
										Static259.anInt5137 = -1;
										return true;
									} else if (Static259.anInt5137 == 131) {
										local139 = Static91.aClass2_Sub16_Sub1_1.method2137();
										local143 = Static91.aClass2_Sub16_Sub1_1.method2195();
										local147 = Static91.aClass2_Sub16_Sub1_1.method2146();
										if (Static73.method1394(local143)) {
											if (local147 == 2) {
												Static117.method1986();
											}
											Static303.anInt5868 = local139;
											Static66.method1201(local139);
											Static130.method2397(false);
											Static302.method4602(Static303.anInt5868);
											for (local219 = 0; local219 < 100; local219++) {
												Static293.aBooleanArray23[local219] = true;
											}
										}
										Static259.anInt5137 = -1;
										return true;
									} else if (Static259.anInt5137 == 73) {
										if (Static218.anInt4451 == 0) {
											Static219.aString153 = Static82.aString67;
										} else {
											Static219.aString153 = Static91.aClass2_Sub16_Sub1_1.method2158();
										}
										Static259.anInt5137 = -1;
										return true;
									} else if (Static259.anInt5137 == 218) {
										Static5.anInt4796 = Static91.aClass2_Sub16_Sub1_1.method2175();
										Static215.anInt4395 = Static91.aClass2_Sub16_Sub1_1.method2148();
										Static259.anInt5137 = -1;
										return true;
									} else if (Static259.anInt5137 == 231) {
										local139 = Static91.aClass2_Sub16_Sub1_1.method2137();
										local143 = Static91.aClass2_Sub16_Sub1_1.method2130();
										local514 = Static91.aClass2_Sub16_Sub1_1.method2158();
										if (Static73.method1394(local139)) {
											Static156.method2850(local143, local514);
										}
										Static259.anInt5137 = -1;
										return true;
									} else if (Static259.anInt5137 == 140) {
										local139 = Static91.aClass2_Sub16_Sub1_1.method2130();
										local143 = Static91.aClass2_Sub16_Sub1_1.method2152();
										local147 = Static91.aClass2_Sub16_Sub1_1.method2145();
										if (Static73.method1394(local143)) {
											Static297.method4546(local147, local139);
										}
										Static259.anInt5137 = -1;
										return true;
									} else if (Static259.anInt5137 == 61) {
										local139 = Static91.aClass2_Sub16_Sub1_1.method2130();
										if (Static73.method1394(local139)) {
											Static229.method3734();
										}
										Static259.anInt5137 = -1;
										return true;
									} else {
										@Pc(3897) long local3897;
										if (Static259.anInt5137 == 226) {
											local506 = Static91.aClass2_Sub16_Sub1_1.method2146() == 1;
											local270 = Static91.aClass2_Sub16_Sub1_1.method2158();
											local514 = local270;
											if (local506) {
												local514 = Static91.aClass2_Sub16_Sub1_1.method2158();
											}
											@Pc(3883) boolean local3883 = false;
											local2053 = Static91.aClass2_Sub16_Sub1_1.method2132();
											local2058 = Static91.aClass2_Sub16_Sub1_1.method2130();
											local3897 = Static91.aClass2_Sub16_Sub1_1.method2166();
											@Pc(3903) long local3903 = local3897 + (local2058 << 32);
											local693 = Static91.aClass2_Sub16_Sub1_1.method2146();
											@Pc(3909) int local3909 = 0;
											while (true) {
												if (local3909 >= 100) {
													if (local693 <= 1) {
														if (Static294.aBoolean381 && !Static11.aBoolean21 || Static63.aBoolean103) {
															local3883 = true;
														} else if (Static44.method842(local514)) {
															local3883 = true;
														}
													}
													break;
												}
												if (local3903 == Static236.aLongArray8[local3909]) {
													local3883 = true;
													break;
												}
												local3909++;
											}
											if (!local3883 && Static151.anInt3324 == 0) {
												Static236.aLongArray8[Static226.anInt6056] = local3903;
												Static226.anInt6056 = (Static226.anInt6056 + 1) % 100;
												local787 = Static135.method1223(Static295.method4527(Static219.method3638(Static91.aClass2_Sub16_Sub1_1)));
												if (local693 == 2 || local693 == 3) {
													Static120.method2007(Static94.method1662(local2053), local787, "<img=1>" + local514, -1, "<img=1>" + local270, 9, 0);
												} else if (local693 == 1) {
													Static120.method2007(Static94.method1662(local2053), local787, "<img=0>" + local514, -1, "<img=0>" + local270, 9, 0);
												} else {
													Static120.method2007(Static94.method1662(local2053), local787, local514, -1, local270, 9, 0);
												}
											}
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 69) {
											local139 = Static91.aClass2_Sub16_Sub1_1.method2130();
											local143 = Static91.aClass2_Sub16_Sub1_1.method2146();
											local147 = Static91.aClass2_Sub16_Sub1_1.method2146();
											local219 = Static91.aClass2_Sub16_Sub1_1.method2130();
											local223 = Static91.aClass2_Sub16_Sub1_1.method2146();
											local227 = Static91.aClass2_Sub16_Sub1_1.method2146();
											if (Static73.method1394(local139)) {
												Static120.method1996(local227, local147, local219, local143, true, local223);
											}
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 216) {
											local139 = Static91.aClass2_Sub16_Sub1_1.method2159();
											local143 = Static91.aClass2_Sub16_Sub1_1.method2130();
											local147 = Static91.aClass2_Sub16_Sub1_1.method2152();
											if (local147 == 65535) {
												local147 = -1;
											}
											if (Static73.method1394(local143)) {
												Static37.method712(-1, local147, 1, local139);
											}
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 74) {
											local139 = Static91.aClass2_Sub16_Sub1_1.method2130();
											if (Static73.method1394(local139)) {
												Static65.method1195();
											}
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 82) {
											local139 = Static91.aClass2_Sub16_Sub1_1.method2152();
											local143 = Static91.aClass2_Sub16_Sub1_1.method2155();
											if (Static73.method1394(local139)) {
												local147 = 0;
												if (Static22.aClass15_Sub2_Sub2_1.aClass97_2 != null) {
													local147 = Static22.aClass15_Sub2_Sub2_1.aClass97_2.method2811();
												}
												Static37.method712(-1, local147, 3, local143);
											}
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 72) {
											local139 = Static91.aClass2_Sub16_Sub1_1.method2137();
											local1297 = Static91.aClass2_Sub16_Sub1_1.method2187();
											local147 = Static91.aClass2_Sub16_Sub1_1.method2137();
											if (Static73.method1394(local139)) {
												Static202.method2169(local147, local1297);
											}
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 58) {
											local139 = Static91.aClass2_Sub16_Sub1_1.method2137();
											local143 = Static91.aClass2_Sub16_Sub1_1.method2130();
											local147 = Static91.aClass2_Sub16_Sub1_1.method2175();
											@Pc(4246) Class15_Sub2_Sub1 local4246 = Static35.aClass15_Sub2_Sub1Array2[local139];
											if (local4246 != null) {
												Static148.method2636(local143, local147, local4246);
											}
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 209) {
											Static48.anInt1204 = Static91.aClass2_Sub16_Sub1_1.method2130() * 30;
											Static259.anInt5137 = -1;
											Static44.anInt1147 = Static291.anInt5632;
											return true;
										} else if (Static259.anInt5137 == 83) {
											Static11.method197();
											Static259.anInt5137 = -1;
											return false;
										} else if (Static259.anInt5137 == 105) {
											Static284.method4439(true);
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 253) {
											local139 = Static91.aClass2_Sub16_Sub1_1.method2159();
											local143 = Static91.aClass2_Sub16_Sub1_1.method2152();
											Static47.method881(local143, local139);
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 100) {
											Static209.method3506(Static164.aClass102_2, Static218.anInt4451, Static91.aClass2_Sub16_Sub1_1);
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 141) {
											for (local139 = 0; local139 < Static188.aClass15_Sub2_Sub2Array41.length; local139++) {
												if (Static188.aClass15_Sub2_Sub2Array41[local139] != null) {
													Static188.aClass15_Sub2_Sub2Array41[local139].anInt5332 = -1;
												}
											}
											for (local139 = 0; local139 < Static35.aClass15_Sub2_Sub1Array2.length; local139++) {
												if (Static35.aClass15_Sub2_Sub1Array2[local139] != null) {
													Static35.aClass15_Sub2_Sub1Array2[local139].anInt5332 = -1;
												}
											}
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 8) {
											local506 = Static91.aClass2_Sub16_Sub1_1.method2146() == 1;
											local270 = Static91.aClass2_Sub16_Sub1_1.method2158();
											local514 = local270;
											if (local506) {
												local514 = Static91.aClass2_Sub16_Sub1_1.method2158();
											}
											local2053 = Static91.aClass2_Sub16_Sub1_1.method2132();
											local2058 = Static91.aClass2_Sub16_Sub1_1.method2130();
											@Pc(4413) boolean local4413 = false;
											local3897 = Static91.aClass2_Sub16_Sub1_1.method2166();
											@Pc(4424) long local4424 = local3897 + (local2058 << 32);
											local693 = Static91.aClass2_Sub16_Sub1_1.method2146();
											local733 = Static91.aClass2_Sub16_Sub1_1.method2130();
											local805 = 0;
											while (true) {
												if (local805 < 100) {
													if (Static236.aLongArray8[local805] != local4424) {
														local805++;
														continue;
													}
													local4413 = true;
													break;
												}
												if (local693 <= 1 && Static44.method842(local514)) {
													local4413 = true;
												}
												break;
											}
											if (!local4413 && Static151.anInt3324 == 0) {
												Static236.aLongArray8[Static226.anInt6056] = local4424;
												Static226.anInt6056 = (Static226.anInt6056 + 1) % 100;
												@Pc(4485) String local4485 = Static231.method3762(local733).method1865(Static91.aClass2_Sub16_Sub1_1);
												if (local693 == 2) {
													Static120.method2007(Static94.method1662(local2053), local4485, "<img=1>" + local514, local733, "<img=1>" + local270, 20, 0);
												} else if (local693 == 1) {
													Static120.method2007(Static94.method1662(local2053), local4485, "<img=0>" + local514, local733, "<img=0>" + local270, 20, 0);
												} else {
													Static120.method2007(Static94.method1662(local2053), local4485, local514, local733, local270, 20, 0);
												}
											}
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 20) {
											Static74.anInt1841 = Static91.aClass2_Sub16_Sub1_1.method2146();
											Static19.anInt410 = Static91.aClass2_Sub16_Sub1_1.method2146();
											Static98.anInt2339 = Static91.aClass2_Sub16_Sub1_1.method2146();
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 255) {
											Static65.method1199();
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 126) {
											local139 = Static91.aClass2_Sub16_Sub1_1.method2137();
											local143 = Static91.aClass2_Sub16_Sub1_1.method2152();
											local147 = Static91.aClass2_Sub16_Sub1_1.method2165();
											if (local143 == 65535) {
												local143 = -1;
											}
											if (Static73.method1394(local139)) {
												Static37.method712(-1, local143, 2, local147);
											}
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 78) {
											local139 = Static91.aClass2_Sub16_Sub1_1.method2161();
											local157 = "";
											local143 = Static91.aClass2_Sub16_Sub1_1.method2145();
											local1353 = local157;
											local147 = Static91.aClass2_Sub16_Sub1_1.method2146();
											if ((local147 & 0x1) != 0) {
												local157 = Static91.aClass2_Sub16_Sub1_1.method2158();
												if ((local147 & 0x2) == 0) {
													local1353 = local157;
												} else {
													local1353 = Static91.aClass2_Sub16_Sub1_1.method2158();
												}
											}
											local520 = Static91.aClass2_Sub16_Sub1_1.method2158();
											if (!local1353.equals("") && Static44.method842(local1353)) {
												Static259.anInt5137 = -1;
												return true;
											} else {
												Static155.method2848(local520, local1353, local143, local157, local139);
												Static259.anInt5137 = -1;
												return true;
											}
										} else if (Static259.anInt5137 == 142) {
											Static56.anInt1437 = Static91.aClass2_Sub16_Sub1_1.method2146();
											for (local139 = 0; local139 < Static56.anInt1437; local139++) {
												Static242.aStringArray38[local139] = Static91.aClass2_Sub16_Sub1_1.method2158();
												Static20.aStringArray2[local139] = Static91.aClass2_Sub16_Sub1_1.method2158();
												if (Static20.aStringArray2[local139].equals("")) {
													Static20.aStringArray2[local139] = Static242.aStringArray38[local139];
												}
												Static262.aStringArray43[local139] = Static91.aClass2_Sub16_Sub1_1.method2158();
												Static115.aStringArray46[local139] = Static91.aClass2_Sub16_Sub1_1.method2158();
												if (Static115.aStringArray46[local139].equals("")) {
													Static115.aStringArray46[local139] = Static262.aStringArray43[local139];
												}
												Static187.aBooleanArray16[local139] = false;
											}
											Static259.anInt5137 = -1;
											Static233.anInt6039 = Static291.anInt5632;
											return true;
										} else if (Static259.anInt5137 == 47) {
											local1482 = Static91.aClass2_Sub16_Sub1_1.method2158();
											local270 = Static135.method1223(Static295.method4527(Static219.method3638(Static91.aClass2_Sub16_Sub1_1)));
											Static155.method2848(local270, local1482, 0, local1482, 6);
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 41) {
											local139 = Static91.aClass2_Sub16_Sub1_1.method2130();
											local143 = Static91.aClass2_Sub16_Sub1_1.method2195();
											local147 = Static91.aClass2_Sub16_Sub1_1.method2159();
											local219 = Static91.aClass2_Sub16_Sub1_1.method2137();
											if (local147 >> 30 == 0) {
												@Pc(4875) Class96 local4875;
												@Pc(4897) Class112 local4897;
												@Pc(4902) Class112 local4902;
												@Pc(4880) Class96 local4880;
												@Pc(4931) Class112 local4931;
												if (local147 >> 29 != 0) {
													local223 = local147 & 0xFFFF;
													@Pc(4845) Class15_Sub2_Sub1 local4845 = Static35.aClass15_Sub2_Sub1Array2[local223];
													if (local4845 != null) {
														local522 = true;
														if (local139 == 65535) {
															local139 = -1;
														}
														if (local139 != -1 && local4845.anInt5301 != -1) {
															if (local4845.anInt5301 == local139) {
																local4875 = Static156.method2852(local139);
																if (local4875.aBoolean232 && local4875.anInt3389 != -1) {
																	local4931 = Static208.method3496(local4875.anInt3389);
																	local693 = local4931.anInt3857;
																	if (local693 == 1) {
																		local522 = false;
																		local4845.anInt5321 = 0;
																		local4845.anInt5316 = 0;
																		local4845.anInt5305 = 0;
																		local4845.anInt5367 = local143 + Static268.anInt5236;
																		local4845.anInt5363 = 1;
																		Static28.method558(false, local4931, local4845.anInt5316, local4845.anInt5358, local4845.anInt5371);
																	} else if (local693 == 2) {
																		local522 = false;
																		local4845.anInt5353 = 0;
																	}
																}
															} else {
																local4875 = Static156.method2852(local139);
																local4880 = Static156.method2852(local4845.anInt5301);
																if (local4875.anInt3389 != -1 && local4880.anInt3389 != -1) {
																	local4897 = Static208.method3496(local4875.anInt3389);
																	local4902 = Static208.method3496(local4880.anInt3389);
																	if (local4897.anInt3870 < local4902.anInt3870) {
																		local522 = false;
																	}
																}
															}
														}
														if (local522) {
															local4845.anInt5316 = 0;
															local4845.anInt5301 = local139;
															local4845.anInt5363 = 1;
															local4845.anInt5367 = Static268.anInt5236 + local143;
															local4845.anInt5326 = local219;
															local4845.anInt5321 = 0;
															if (Static268.anInt5236 < local4845.anInt5367) {
																local4845.anInt5316 = -1;
															}
															if (local4845.anInt5301 != -1 && local4845.anInt5367 == Static268.anInt5236) {
																local549 = Static156.method2852(local4845.anInt5301).anInt3389;
																if (local549 != -1) {
																	local4931 = Static208.method3496(local549);
																	if (local4931 != null && local4931.anIntArray378 != null) {
																		Static28.method558(false, local4931, 0, local4845.anInt5358, local4845.anInt5371);
																	}
																}
															}
														}
													}
												} else if (local147 >> 28 != 0) {
													local223 = local147 & 0xFFFF;
													@Pc(5071) Class15_Sub2_Sub2 local5071;
													if (local223 == Static22.anInt504) {
														local5071 = Static22.aClass15_Sub2_Sub2_1;
													} else {
														local5071 = Static188.aClass15_Sub2_Sub2Array41[local223];
													}
													if (local5071 != null) {
														if (local139 == 65535) {
															local139 = -1;
														}
														local522 = true;
														if (local139 != -1 && local5071.anInt5301 != -1) {
															if (local5071.anInt5301 == local139) {
																local4875 = Static156.method2852(local139);
																if (local4875.aBoolean232 && local4875.anInt3389 != -1) {
																	local4931 = Static208.method3496(local4875.anInt3389);
																	local693 = local4931.anInt3857;
																	if (local693 == 1) {
																		local5071.anInt5321 = 0;
																		local522 = false;
																		local5071.anInt5367 = Static268.anInt5236 + local143;
																		local5071.anInt5316 = 0;
																		local5071.anInt5363 = 1;
																		local5071.anInt5305 = 0;
																		Static28.method558(false, local4931, local5071.anInt5316, local5071.anInt5358, local5071.anInt5371);
																	} else if (local693 == 2) {
																		local5071.anInt5353 = 0;
																		local522 = false;
																	}
																}
															} else {
																local4875 = Static156.method2852(local139);
																local4880 = Static156.method2852(local5071.anInt5301);
																if (local4875.anInt3389 != -1 && local4880.anInt3389 != -1) {
																	local4897 = Static208.method3496(local4875.anInt3389);
																	local4902 = Static208.method3496(local4880.anInt3389);
																	if (local4902.anInt3870 > local4897.anInt3870) {
																		local522 = false;
																	}
																}
															}
														}
														if (local522) {
															local5071.anInt5326 = local219;
															local5071.anInt5321 = 0;
															local5071.anInt5316 = 0;
															local5071.anInt5363 = 1;
															local5071.anInt5301 = local139;
															local5071.anInt5367 = local143 + Static268.anInt5236;
															if (local5071.anInt5301 == 65535) {
																local5071.anInt5301 = -1;
															}
															if (Static268.anInt5236 < local5071.anInt5367) {
																local5071.anInt5316 = -1;
															}
															if (local5071.anInt5301 != -1 && Static268.anInt5236 == local5071.anInt5367) {
																local549 = Static156.method2852(local5071.anInt5301).anInt3389;
																if (local549 != -1) {
																	local4931 = Static208.method3496(local549);
																	if (local4931 != null && local4931.anIntArray378 != null) {
																		Static28.method558(local5071 == Static22.aClass15_Sub2_Sub2_1, local4931, 0, local5071.anInt5358, local5071.anInt5371);
																	}
																}
															}
														}
													}
												}
											} else {
												local227 = (local147 >> 14 & 0x3FFF) - Static160.anInt5159;
												local1189 = (local147 & 0x3FFF) - Static234.anInt4705;
												local223 = local147 >> 28 & 0x3;
												if (local227 >= 0 && local1189 >= 0 && local227 < 104 && local1189 < 104) {
													local227 = local227 * 128 + 64;
													local1189 = local1189 * 128 + 64;
													@Pc(5359) Class15_Sub6 local5359 = new Class15_Sub6(local139, local223, local227, local1189, Static234.method3798(local1189, local227, local223) - local219, local143, Static268.anInt5236);
													Static88.aClass44_8.method1358(new Class2_Sub8_Sub17(local5359));
												}
											}
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 38) {
											local139 = Static91.aClass2_Sub16_Sub1_1.method2130();
											local143 = Static91.aClass2_Sub16_Sub1_1.method2175();
											if (local139 == 65535) {
												local139 = -1;
											}
											Static110.method1873(local143, local139);
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 241) {
											local139 = Static91.aClass2_Sub16_Sub1_1.method2148();
											local143 = Static91.aClass2_Sub16_Sub1_1.method2196();
											local147 = Static91.aClass2_Sub16_Sub1_1.method2195();
											if (local147 == 65535) {
												local147 = -1;
											}
											Static285.method4448(local143, local139, local147);
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 15) {
											Static79.anInt1900 = Static291.anInt5632;
											if (Static218.anInt4451 == 0) {
												Static150.aClass165Array1 = null;
												Static284.anInt5619 = 0;
												Static132.aString107 = null;
												Static86.aString69 = null;
												Static259.anInt5137 = -1;
												return true;
											}
											Static132.aString107 = Static91.aClass2_Sub16_Sub1_1.method2158();
											local506 = Static91.aClass2_Sub16_Sub1_1.method2146() == 1;
											if (local506) {
												Static91.aClass2_Sub16_Sub1_1.method2158();
											}
											@Pc(5474) long local5474 = Static91.aClass2_Sub16_Sub1_1.method2132();
											Static86.aString69 = Static146.method2595(local5474);
											Static101.aByte8 = Static91.aClass2_Sub16_Sub1_1.method2170();
											local219 = Static91.aClass2_Sub16_Sub1_1.method2146();
											if (local219 == 255) {
												Static259.anInt5137 = -1;
												return true;
											}
											Static284.anInt5619 = local219;
											@Pc(5499) Class165[] local5499 = new Class165[100];
											for (local227 = 0; local227 < Static284.anInt5619; local227++) {
												local5499[local227] = new Class165();
												local5499[local227].aString175 = Static91.aClass2_Sub16_Sub1_1.method2158();
												local506 = Static91.aClass2_Sub16_Sub1_1.method2146() == 1;
												if (local506) {
													local5499[local227].aString176 = Static91.aClass2_Sub16_Sub1_1.method2158();
												} else {
													local5499[local227].aString176 = local5499[local227].aString175;
												}
												local5499[local227].anInt5203 = Static91.aClass2_Sub16_Sub1_1.method2130();
												local5499[local227].aByte22 = Static91.aClass2_Sub16_Sub1_1.method2170();
												local5499[local227].aString174 = Static91.aClass2_Sub16_Sub1_1.method2158();
												if (local5499[local227].aString176.equals(Static22.aClass15_Sub2_Sub2_1.aString184)) {
													Static253.aByte20 = local5499[local227].aByte22;
												}
											}
											local549 = Static284.anInt5619;
											while (local549 > 0) {
												local549--;
												local2407 = true;
												for (local685 = 0; local685 < local549; local685++) {
													if (local5499[local685].aString175.compareTo(local5499[local685 + 1].aString175) > 0) {
														@Pc(5622) Class165 local5622 = local5499[local685];
														local2407 = false;
														local5499[local685] = local5499[local685 + 1];
														local5499[local685 + 1] = local5622;
													}
												}
												if (local2407) {
													break;
												}
											}
											Static150.aClass165Array1 = local5499;
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 129) {
											if (Static127.aFrame2 != null) {
												Static260.method4091(Static119.anInt5242, -1, -1, false);
											}
											@Pc(5668) byte[] local5668 = new byte[Static218.anInt4451];
											Static91.aClass2_Sub16_Sub1_1.method2199(local5668, Static218.anInt4451);
											local270 = Static122.method2047(0, Static218.anInt4451, local5668);
											if (Static72.aFrame1 == null && (Static158.anInt3501 == 3 || !Static158.aString122.startsWith("win") || Static270.aBoolean287)) {
												Static205.method3473(local270, true);
											} else {
												Static291.aBoolean371 = true;
												Static230.aString160 = local270;
												Static117.aClass111_2 = Static164.aClass102_2.method2890(local270);
											}
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 33) {
											local139 = Static91.aClass2_Sub16_Sub1_1.method2130();
											local143 = Static91.aClass2_Sub16_Sub1_1.method2130();
											local147 = Static91.aClass2_Sub16_Sub1_1.method2195();
											if (Static73.method1394(local143)) {
												Static75.method1416(local139, local147);
											}
											Static259.anInt5137 = -1;
											return true;
										} else if (Static259.anInt5137 == 194) {
											local139 = Static91.aClass2_Sub16_Sub1_1.method2145();
											local143 = Static91.aClass2_Sub16_Sub1_1.method2195();
											local147 = Static91.aClass2_Sub16_Sub1_1.method2152();
											if (local147 == 65535) {
												local147 = -1;
											}
											local219 = Static91.aClass2_Sub16_Sub1_1.method2145();
											if (Static73.method1394(local143)) {
												@Pc(5775) Class56 local5775 = Static38.method715(local219);
												@Pc(5792) Class60 local5792;
												if (local5775.aBoolean132) {
													Static30.method570(local147, local219, local139);
													local5792 = Static87.method1546(local147);
													Static303.method4609(local5792.anInt2260, local5792.anInt2218, local5792.anInt2239, local219);
													Static68.method1333(local5792.anInt2246, local5792.anInt2250, local219, local5792.anInt2237);
												} else if (local147 == -1) {
													local5775.anInt2103 = 0;
													Static259.anInt5137 = -1;
													return true;
												} else {
													local5792 = Static87.method1546(local147);
													local5775.anInt2101 = local5792.anInt2260 * 100 / local139;
													local5775.anInt2042 = local5792.anInt2239;
													local5775.anInt2043 = local147;
													local5775.anInt2103 = 4;
													local5775.anInt2109 = local5792.anInt2218;
													Static287.method4466(local5775);
												}
											}
											Static259.anInt5137 = -1;
											return true;
										} else {
											Static183.method3240(null, "T1 - " + Static259.anInt5137 + "," + Static154.anInt3462 + "," + Static244.anInt4865 + " - " + Static218.anInt4451);
											Static11.method197();
											return true;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
