import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "[I")
	public static int[] anIntArray276;

	@OriginalMember(owner = "client!ub", name = "M", descriptor = "Lclient!db;")
	public static Class31 aClass31_20 = new Class31(4);

	@OriginalMember(owner = "client!ub", name = "P", descriptor = "Lclient!fl;")
	public static Class56 aClass56_2 = new Class56();

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)V")
	public static void method1809() {
		Static165.method2526();
		Static37.method2469();
		Static214.method3385();
		Static65.method1075();
		Static216.method3453();
		Static190.method2847();
		Static232.method3821();
		Static82.method1399();
		Static122.method1911();
		Static250.method3900();
		Static206.method3223();
		Static260.method4025();
		Static95.method1568();
		Static98.method1611();
		Static136.method2152();
		Static171.method2602();
		Static145.method2274();
		Static183.method4455();
		Static236.method3750();
		Static140.method2203();
		Static198.aClass31_29.method850();
		Static250.aClass31_37.method850();
	}

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)V")
	public static void method1811() {
		Static224.anInt4701 = 1;
		Static84.aBoolean122 = false;
		Static221.anInt4610 = -1;
		Static170.anInt3132 = -3;
		Static276.anInt5535 = 0;
		Static65.anInt1318 = 0;
		Static251.anInt5125 = 0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1813(@OriginalArg(0) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			local18 = Static273.method4184(arg0.charAt(local20)) + (local18 << 5) - local18;
		}
		return local18;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZIIIII)V")
	public static void method1814(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static245.anInt1237 <= arg5 - arg2 && arg5 + arg2 <= Static28.anInt606 && Static24.anInt556 <= arg3 - arg2 && Static284.anInt5643 >= arg3 + arg2) {
			Static74.method1275(arg0, arg2, arg3, arg5, arg4, arg1);
		} else {
			Static16.method310(arg5, arg0, arg2, arg3, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(DB)V")
	public static void method1815(@OriginalArg(0) double arg0) {
		if (Static283.aDouble9 == arg0) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 256; local16++) {
			@Pc(29) int local29 = (int) (Math.pow((double) local16 / 255.0D, arg0) * 255.0D);
			Static173.anIntArray382[local16] = local29 > 255 ? 255 : local29;
		}
		Static283.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)Z")
	public static boolean method1816() throws IOException {
		if (Static155.aClass73_3 == null) {
			return false;
		}
		@Pc(15) int local15 = Static155.aClass73_3.method1687();
		if (local15 == 0) {
			return false;
		}
		if (Static221.anInt4611 == -1) {
			Static155.aClass73_3.method1689(1, Static63.aClass1_Sub18_Sub1_1.aByteArray71, 0);
			Static63.aClass1_Sub18_Sub1_1.anInt3911 = 0;
			local15--;
			Static221.anInt4611 = Static63.aClass1_Sub18_Sub1_1.method3128();
			Static292.anInt5802 = Static17.anIntArray36[Static221.anInt4611];
		}
		if (Static292.anInt5802 == -1) {
			if (local15 <= 0) {
				return false;
			}
			local15--;
			Static155.aClass73_3.method1689(1, Static63.aClass1_Sub18_Sub1_1.aByteArray71, 0);
			Static292.anInt5802 = Static63.aClass1_Sub18_Sub1_1.aByteArray71[0] & 0xFF;
		}
		if (Static292.anInt5802 == -2) {
			if (local15 <= 1) {
				return false;
			}
			Static155.aClass73_3.method1689(2, Static63.aClass1_Sub18_Sub1_1.aByteArray71, 0);
			Static63.aClass1_Sub18_Sub1_1.anInt3911 = 0;
			Static292.anInt5802 = Static63.aClass1_Sub18_Sub1_1.method3107();
			local15 -= 2;
		}
		if (local15 < Static292.anInt5802) {
			return false;
		}
		Static63.aClass1_Sub18_Sub1_1.anInt3911 = 0;
		Static155.aClass73_3.method1689(Static292.anInt5802, Static63.aClass1_Sub18_Sub1_1.aByteArray71, 0);
		Static209.anInt4188 = 0;
		Static297.anInt5891 = Static258.anInt5207;
		Static258.anInt5207 = Static218.anInt1198;
		Static218.anInt1198 = Static221.anInt4611;
		if (Static221.anInt4611 == 113) {
			Static126.method1946();
			Static221.anInt4611 = -1;
			return true;
		}
		@Pc(141) int local141;
		@Pc(145) int local145;
		@Pc(149) int local149;
		if (Static221.anInt4611 == 4) {
			local141 = Static63.aClass1_Sub18_Sub1_1.method3107();
			local145 = Static63.aClass1_Sub18_Sub1_1.method3118();
			local149 = Static63.aClass1_Sub18_Sub1_1.method3107();
			if (Static16.method309(local149)) {
				Static122.method1912(local141, local145);
			}
			Static221.anInt4611 = -1;
			return true;
		} else if (Static221.anInt4611 == 127) {
			Static129.anInt3910 = Static63.aClass1_Sub18_Sub1_1.method3103() * 30;
			Static221.anInt4611 = -1;
			Static70.anInt1408 = Static56.anInt1175;
			return true;
		} else if (Static221.anInt4611 == 145 || Static221.anInt4611 == 254 || Static221.anInt4611 == 225 || Static221.anInt4611 == 222 || Static221.anInt4611 == 8 || Static221.anInt4611 == 14 || Static221.anInt4611 == 229 || Static221.anInt4611 == 82 || Static221.anInt4611 == 44 || Static221.anInt4611 == 133 || Static221.anInt4611 == 101 || Static221.anInt4611 == 218 || Static221.anInt4611 == 88 || Static221.anInt4611 == 250) {
			Static105.method1657();
			Static221.anInt4611 = -1;
			return true;
		} else if (Static221.anInt4611 == 226) {
			Static138.anInt2607 = Static63.aClass1_Sub18_Sub1_1.method3122();
			Static221.anInt4611 = -1;
			Static145.anInt2688 = Static56.anInt1175;
			return true;
		} else {
			@Pc(287) int local287;
			@Pc(297) int local297;
			@Pc(291) int local291;
			@Pc(308) long local308;
			@Pc(314) Class1_Sub31 local314;
			@Pc(323) Class1_Sub31 local323;
			if (Static221.anInt4611 == 232) {
				local141 = Static63.aClass1_Sub18_Sub1_1.method3103();
				local145 = Static63.aClass1_Sub18_Sub1_1.method3107();
				local149 = Static63.aClass1_Sub18_Sub1_1.method3107();
				if (local145 == 65535) {
					local145 = -1;
				}
				if (local149 == 65535) {
					local149 = -1;
				}
				local287 = Static63.aClass1_Sub18_Sub1_1.method3116();
				local291 = Static63.aClass1_Sub18_Sub1_1.method3073();
				if (Static16.method309(local141)) {
					for (local297 = local145; local297 <= local149; local297++) {
						local308 = ((long) local291 << 32) + (long) local297;
						local314 = (Class1_Sub31) Static244.aClass22_18.method633(local308);
						if (local314 != null) {
							local323 = new Class1_Sub31(local287, local314.anInt5641);
							local314.method4534();
						} else if (local297 == -1) {
							local323 = new Class1_Sub31(local287, Static75.method1287(local291).aClass1_Sub31_1.anInt5641);
						} else {
							local323 = new Class1_Sub31(local287, -1);
						}
						Static244.aClass22_18.method643(local308, local323);
					}
				}
				Static221.anInt4611 = -1;
				return true;
			} else if (Static221.anInt4611 == 79) {
				for (local141 = 0; local141 < Static224.anIntArray535.length; local141++) {
					if (Static224.anIntArray535[local141] != Static236.anIntArray578[local141]) {
						Static224.anIntArray535[local141] = Static236.anIntArray578[local141];
						Static293.method4499(local141);
						Static16.anIntArray35[Static151.anInt2791++ & 0x1F] = local141;
					}
				}
				Static221.anInt4611 = -1;
				return true;
			} else {
				@Pc(437) Class1_Sub32 local437;
				if (Static221.anInt4611 == 160) {
					local141 = Static63.aClass1_Sub18_Sub1_1.method3103();
					local145 = Static63.aClass1_Sub18_Sub1_1.method3084();
					local149 = Static63.aClass1_Sub18_Sub1_1.method3063();
					local287 = Static63.aClass1_Sub18_Sub1_1.method3103();
					if (Static16.method309(local287)) {
						local437 = (Class1_Sub32) Static67.aClass22_7.method633((long) local149);
						if (local437 != null) {
							Static22.method3920(local437, local141 != local437.anInt5665);
						}
						Static43.method798(local149, local145, local141);
					}
					Static221.anInt4611 = -1;
					return true;
				} else if (Static221.anInt4611 == 220) {
					Static30.anInt663 = 0;
					Static221.anInt4611 = -1;
					return true;
				} else {
					@Pc(635) int local635;
					@Pc(691) int local691;
					@Pc(479) long local479;
					@Pc(489) boolean local489;
					@Pc(520) int local520;
					@Pc(491) String local491;
					@Pc(647) int local647;
					@Pc(729) String local729;
					@Pc(711) String local711;
					if (Static221.anInt4611 == 129) {
						local479 = Static63.aClass1_Sub18_Sub1_1.method3112();
						local149 = Static63.aClass1_Sub18_Sub1_1.method3107();
						local287 = Static63.aClass1_Sub18_Sub1_1.method3122();
						local489 = true;
						local491 = "";
						if (local479 < 0L) {
							local479 &= Long.MAX_VALUE;
							local489 = false;
						}
						if (local149 > 0) {
							local491 = Static63.aClass1_Sub18_Sub1_1.method3101();
						}
						@Pc(518) String local518 = Static266.method4096(local479);
						for (local520 = 0; local520 < Static147.anInt2712; local520++) {
							if (Static207.aLongArray9[local520] == local479) {
								if (local149 != Static22.anIntArray597[local520]) {
									Static22.anIntArray597[local520] = local149;
									if (local149 > 0) {
										Static48.method843(local518 + Static103.aString62, 5, "");
									}
									if (local149 == 0) {
										Static48.method843(local518 + Static163.aString151, 5, "");
									}
								}
								Static275.aStringArray34[local520] = local491;
								Static26.anIntArray59[local520] = local287;
								Static28.aBooleanArray2[local520] = local489;
								local518 = null;
								break;
							}
						}
						if (local518 != null && Static147.anInt2712 < 200) {
							Static207.aLongArray9[Static147.anInt2712] = local479;
							Static147.aStringArray12[Static147.anInt2712] = local518;
							Static22.anIntArray597[Static147.anInt2712] = local149;
							Static275.aStringArray34[Static147.anInt2712] = local491;
							Static26.anIntArray59[Static147.anInt2712] = local287;
							Static28.aBooleanArray2[Static147.anInt2712] = local489;
							Static147.anInt2712++;
						}
						local635 = Static147.anInt2712;
						Static145.anInt2688 = Static56.anInt1175;
						while (local635 > 0) {
							@Pc(644) boolean local644 = true;
							local635--;
							for (local647 = 0; local647 < local635; local647++) {
								if (Static102.anInt1933 != Static22.anIntArray597[local647] && Static102.anInt1933 == Static22.anIntArray597[local647 + 1] || Static22.anIntArray597[local647] == 0 && Static22.anIntArray597[local647 + 1] != 0) {
									local691 = Static22.anIntArray597[local647];
									Static22.anIntArray597[local647] = Static22.anIntArray597[local647 + 1];
									local644 = false;
									Static22.anIntArray597[local647 + 1] = local691;
									local711 = Static275.aStringArray34[local647];
									Static275.aStringArray34[local647] = Static275.aStringArray34[local647 + 1];
									Static275.aStringArray34[local647 + 1] = local711;
									local729 = Static147.aStringArray12[local647];
									Static147.aStringArray12[local647] = Static147.aStringArray12[local647 + 1];
									Static147.aStringArray12[local647 + 1] = local729;
									@Pc(747) long local747 = Static207.aLongArray9[local647];
									Static207.aLongArray9[local647] = Static207.aLongArray9[local647 + 1];
									Static207.aLongArray9[local647 + 1] = local747;
									@Pc(765) int local765 = Static26.anIntArray59[local647];
									Static26.anIntArray59[local647] = Static26.anIntArray59[local647 + 1];
									Static26.anIntArray59[local647 + 1] = local765;
									@Pc(783) boolean local783 = Static28.aBooleanArray2[local647];
									Static28.aBooleanArray2[local647] = Static28.aBooleanArray2[local647 + 1];
									Static28.aBooleanArray2[local647 + 1] = local783;
								}
							}
							if (local644) {
								break;
							}
						}
						Static221.anInt4611 = -1;
						return true;
					}
					@Pc(822) long local822;
					@Pc(829) long local829;
					if (Static221.anInt4611 == 214) {
						local479 = Static63.aClass1_Sub18_Sub1_1.method3112();
						Static63.aClass1_Sub18_Sub1_1.method3082();
						local822 = Static63.aClass1_Sub18_Sub1_1.method3112();
						local829 = Static63.aClass1_Sub18_Sub1_1.method3107();
						local308 = Static63.aClass1_Sub18_Sub1_1.method3109();
						local635 = Static63.aClass1_Sub18_Sub1_1.method3122();
						local647 = Static63.aClass1_Sub18_Sub1_1.method3107();
						@Pc(844) boolean local844 = false;
						@Pc(850) long local850 = local308 + (local829 << 32);
						@Pc(852) int local852 = 0;
						label1356: while (true) {
							if (local852 < 100) {
								if (Static218.aLongArray4[local852] != local850) {
									local852++;
									continue;
								}
								local844 = true;
								break;
							}
							if (local635 <= 1) {
								for (local852 = 0; local852 < Static150.anInt2784; local852++) {
									if (local479 == Static65.aLongArray5[local852]) {
										local844 = true;
										break label1356;
									}
								}
							}
							break;
						}
						if (!local844 && Static56.anInt1180 == 0) {
							Static218.aLongArray4[Static258.anInt5201] = local850;
							Static258.anInt5201 = (Static258.anInt5201 + 1) % 100;
							@Pc(928) String local928 = Static263.method4060(local647).method3997(Static63.aClass1_Sub18_Sub1_1);
							if (local635 == 2 || local635 == 3) {
								Static92.method1524(local928, 20, "<img=1>" + Static266.method4096(local479), Static266.method4096(local822), local647);
							} else if (local635 == 1) {
								Static92.method1524(local928, 20, "<img=0>" + Static266.method4096(local479), Static266.method4096(local822), local647);
							} else {
								Static92.method1524(local928, 20, Static266.method4096(local479), Static266.method4096(local822), local647);
							}
						}
						Static221.anInt4611 = -1;
						return true;
					} else if (Static221.anInt4611 == 90) {
						local141 = Static63.aClass1_Sub18_Sub1_1.method3107();
						local145 = Static63.aClass1_Sub18_Sub1_1.method3122();
						local149 = Static63.aClass1_Sub18_Sub1_1.method3122();
						local287 = Static63.aClass1_Sub18_Sub1_1.method3107();
						local291 = Static63.aClass1_Sub18_Sub1_1.method3122();
						local297 = Static63.aClass1_Sub18_Sub1_1.method3122();
						if (Static16.method309(local141)) {
							Static128.method1974(local291, local287, local149, local297, local145);
						}
						Static221.anInt4611 = -1;
						return true;
					} else {
						@Pc(1068) String local1068;
						@Pc(1049) String local1049;
						if (Static221.anInt4611 == 201) {
							local1049 = Static63.aClass1_Sub18_Sub1_1.method3101();
							if (local1049.endsWith(":tradereq:")) {
								local1068 = local1049.substring(0, local1049.indexOf(":"));
								local822 = Static136.method2158(local1068);
								local489 = false;
								for (local297 = 0; local297 < Static150.anInt2784; local297++) {
									if (local822 == Static65.aLongArray5[local297]) {
										local489 = true;
										break;
									}
								}
								if (!local489 && Static56.anInt1180 == 0) {
									Static48.method843(Static73.aString41, 4, local1068);
								}
							} else if (local1049.endsWith(":chalreq:")) {
								local1068 = local1049.substring(0, local1049.indexOf(":"));
								local822 = Static136.method2158(local1068);
								local489 = false;
								for (local297 = 0; local297 < Static150.anInt2784; local297++) {
									if (Static65.aLongArray5[local297] == local822) {
										local489 = true;
										break;
									}
								}
								if (!local489 && Static56.anInt1180 == 0) {
									local491 = local1049.substring(local1049.indexOf(":") + 1, local1049.length() + -9);
									Static48.method843(local491, 8, local1068);
								}
							} else if (local1049.endsWith(":assistreq:")) {
								local1068 = local1049.substring(0, local1049.indexOf(":"));
								local822 = Static136.method2158(local1068);
								local489 = false;
								for (local297 = 0; local297 < Static150.anInt2784; local297++) {
									if (Static65.aLongArray5[local297] == local822) {
										local489 = true;
										break;
									}
								}
								if (!local489 && Static56.anInt1180 == 0) {
									Static48.method843("", 10, local1068);
								}
							} else if (local1049.endsWith(":clan:")) {
								local1068 = local1049.substring(0, local1049.indexOf(":clan:"));
								Static48.method843(local1068, 11, "");
							} else if (local1049.endsWith(":trade:")) {
								local1068 = local1049.substring(0, local1049.indexOf(":trade:"));
								if (Static56.anInt1180 == 0) {
									Static48.method843(local1068, 12, "");
								}
							} else if (local1049.endsWith(":assist:")) {
								local1068 = local1049.substring(0, local1049.indexOf(":assist:"));
								if (Static56.anInt1180 == 0) {
									Static48.method843(local1068, 13, "");
								}
							} else if (local1049.endsWith(":duelstake:")) {
								local1068 = local1049.substring(0, local1049.indexOf(":"));
								local822 = Static136.method2158(local1068);
								local489 = false;
								for (local297 = 0; local297 < Static150.anInt2784; local297++) {
									if (local822 == Static65.aLongArray5[local297]) {
										local489 = true;
										break;
									}
								}
								if (!local489 && Static56.anInt1180 == 0) {
									Static48.method843("", 14, local1068);
								}
							} else if (local1049.endsWith(":duelfriend:")) {
								local489 = false;
								local1068 = local1049.substring(0, local1049.indexOf(":"));
								local822 = Static136.method2158(local1068);
								for (local297 = 0; local297 < Static150.anInt2784; local297++) {
									if (local822 == Static65.aLongArray5[local297]) {
										local489 = true;
										break;
									}
								}
								if (!local489 && Static56.anInt1180 == 0) {
									Static48.method843("", 15, local1068);
								}
							} else if (local1049.endsWith(":clanreq:")) {
								local1068 = local1049.substring(0, local1049.indexOf(":"));
								local822 = Static136.method2158(local1068);
								local489 = false;
								for (local297 = 0; local297 < Static150.anInt2784; local297++) {
									if (Static65.aLongArray5[local297] == local822) {
										local489 = true;
										break;
									}
								}
								if (!local489 && Static56.anInt1180 == 0) {
									Static48.method843("", 16, local1068);
								}
							} else if (local1049.endsWith(":allyreq:")) {
								local1068 = local1049.substring(0, local1049.indexOf(":"));
								local489 = false;
								local822 = Static136.method2158(local1068);
								for (local297 = 0; local297 < Static150.anInt2784; local297++) {
									if (Static65.aLongArray5[local297] == local822) {
										local489 = true;
										break;
									}
								}
								if (!local489 && Static56.anInt1180 == 0) {
									local491 = local1049.substring(local1049.indexOf(":") + 1, local1049.length() - 9);
									Static48.method843(local491, 21, local1068);
								}
							} else {
								Static48.method843(local1049, 0, "");
							}
							Static221.anInt4611 = -1;
							return true;
						} else if (Static221.anInt4611 == 146) {
							if (Static136.aFrame1 != null) {
								Static282.method4510(Static8.anInt239, false, -1, -1);
							}
							@Pc(1541) byte[] local1541 = new byte[Static292.anInt5802];
							Static63.aClass1_Sub18_Sub1_1.method3124(local1541, Static292.anInt5802);
							local1068 = Static296.method4532(Static292.anInt5802, 0, local1541);
							if (Static299.aFrame2 == null && (Static127.anInt2419 == 3 || !Static127.aString79.startsWith("win") || Static219.aBoolean337)) {
								Static163.method3583(local1068, true);
							} else {
								Static112.aString65 = local1068;
								Static173.aBoolean239 = true;
								Static19.aClass118_3 = Static13.aClass84_3.method1950(local1068);
							}
							Static221.anInt4611 = -1;
							return true;
						} else if (Static221.anInt4611 == 99) {
							local141 = Static63.aClass1_Sub18_Sub1_1.method3062();
							local145 = Static63.aClass1_Sub18_Sub1_1.method3107();
							local149 = Static63.aClass1_Sub18_Sub1_1.method3103();
							local287 = Static63.aClass1_Sub18_Sub1_1.method3118();
							local291 = Static63.aClass1_Sub18_Sub1_1.method3116();
							if (Static16.method309(local141)) {
								Static187.method2827(local287, local145, local291, local149);
							}
							Static221.anInt4611 = -1;
							return true;
						} else if (Static221.anInt4611 == 209) {
							local479 = Static63.aClass1_Sub18_Sub1_1.method3112();
							local149 = Static63.aClass1_Sub18_Sub1_1.method3107();
							@Pc(1648) String local1648 = Static263.method4060(local149).method3997(Static63.aClass1_Sub18_Sub1_1);
							Static92.method1524(local1648, 19, Static266.method4096(local479), null, local149);
							Static221.anInt4611 = -1;
							return true;
						} else {
							@Pc(1757) int local1757;
							@Pc(1694) Class127 local1694;
							if (Static221.anInt4611 == 159) {
								local141 = Static63.aClass1_Sub18_Sub1_1.method3074();
								local145 = Static63.aClass1_Sub18_Sub1_1.method3107();
								if (local141 < -70000) {
									local145 += 32768;
								}
								if (local141 >= 0) {
									local1694 = Static75.method1287(local141);
								} else {
									local1694 = null;
								}
								if (local1694 != null) {
									for (local287 = 0; local287 < local1694.anIntArray415.length; local287++) {
										local1694.anIntArray415[local287] = 0;
										local1694.anIntArray422[local287] = 0;
									}
								}
								Static155.method2388(local145);
								local287 = Static63.aClass1_Sub18_Sub1_1.method3107();
								for (local291 = 0; local291 < local287; local291++) {
									local297 = Static63.aClass1_Sub18_Sub1_1.method3122();
									if (local297 == 255) {
										local297 = Static63.aClass1_Sub18_Sub1_1.method3073();
									}
									local1757 = Static63.aClass1_Sub18_Sub1_1.method3107();
									if (local1694 != null && local291 < local1694.anIntArray415.length) {
										local1694.anIntArray415[local291] = local1757;
										local1694.anIntArray422[local291] = local297;
									}
									Static195.method2961(local297, local291, local145, local1757 - 1);
								}
								if (local1694 != null) {
									Static155.method2392(local1694);
								}
								Static118.method1858();
								Static67.anIntArray167[Static130.anInt2506++ & 0x1F] = local145 & 0x7FFF;
								Static221.anInt4611 = -1;
								return true;
							} else if (Static221.anInt4611 == 156) {
								local141 = Static63.aClass1_Sub18_Sub1_1.method3062();
								local145 = Static63.aClass1_Sub18_Sub1_1.method3063();
								if (Static16.method309(local141)) {
									local149 = 0;
									if (Static28.aClass6_Sub6_Sub2_1.aClass149_2 != null) {
										local149 = Static28.aClass6_Sub6_Sub2_1.aClass149_2.method3864();
									}
									Static153.method2364(3, -1, local149, local145);
								}
								Static221.anInt4611 = -1;
								return true;
							} else if (Static221.anInt4611 == 38) {
								Static105.anInt1945 = Static63.aClass1_Sub18_Sub1_1.method3122();
								Static282.anInt5855 = Static63.aClass1_Sub18_Sub1_1.method3122();
								Static140.anInt2624 = Static63.aClass1_Sub18_Sub1_1.method3122();
								Static221.anInt4611 = -1;
								return true;
							} else if (Static221.anInt4611 == 189) {
								Static44.method816(false);
								Static221.anInt4611 = -1;
								return true;
							} else if (Static221.anInt4611 == 165) {
								local141 = Static63.aClass1_Sub18_Sub1_1.method3062();
								local145 = Static63.aClass1_Sub18_Sub1_1.method3073();
								local149 = Static63.aClass1_Sub18_Sub1_1.method3107();
								if (local149 == 65535) {
									local149 = -1;
								}
								local287 = Static63.aClass1_Sub18_Sub1_1.method3103();
								local291 = Static63.aClass1_Sub18_Sub1_1.method3118();
								if (local291 == 65535) {
									local291 = -1;
								}
								if (Static16.method309(local287)) {
									for (local297 = local291; local297 <= local149; local297++) {
										local308 = (long) local297 + ((long) local145 << 32);
										local314 = (Class1_Sub31) Static244.aClass22_18.method633(local308);
										if (local314 != null) {
											local323 = new Class1_Sub31(local314.anInt5647, local141);
											local314.method4534();
										} else if (local297 == -1) {
											local323 = new Class1_Sub31(Static75.method1287(local145).aClass1_Sub31_1.anInt5647, local141);
										} else {
											local323 = new Class1_Sub31(0, local141);
										}
										Static244.aClass22_18.method643(local308, local323);
									}
								}
								Static221.anInt4611 = -1;
								return true;
							} else if (Static221.anInt4611 == 43) {
								Static159.anInt2976 = Static63.aClass1_Sub18_Sub1_1.method3057();
								Static58.anInt1227 = Static63.aClass1_Sub18_Sub1_1.method3057();
								Static221.anInt4611 = -1;
								return true;
							} else if (Static221.anInt4611 == 135) {
								local141 = Static63.aClass1_Sub18_Sub1_1.method3062();
								Static216.method3454(local141);
								Static67.anIntArray167[Static130.anInt2506++ & 0x1F] = local141 & 0x7FFF;
								Static221.anInt4611 = -1;
								return true;
							} else if (Static221.anInt4611 == 138) {
								Static43.anInt967 = Static63.aClass1_Sub18_Sub1_1.method3122();
								Static221.anInt4611 = -1;
								return true;
							} else if (Static221.anInt4611 == 114) {
								local141 = Static63.aClass1_Sub18_Sub1_1.method3107();
								local145 = Static63.aClass1_Sub18_Sub1_1.method3074();
								local149 = Static63.aClass1_Sub18_Sub1_1.method3116();
								if (Static16.method309(local141)) {
									@Pc(2088) Class1_Sub32 local2088 = (Class1_Sub32) Static67.aClass22_7.method633((long) local145);
									local437 = (Class1_Sub32) Static67.aClass22_7.method633((long) local149);
									if (local437 != null) {
										Static22.method3920(local437, local2088 == null || local2088.anInt5665 != local437.anInt5665);
									}
									if (local2088 != null) {
										local2088.method4534();
										Static67.aClass22_7.method643((long) local149, local2088);
									}
									@Pc(2133) Class127 local2133 = Static75.method1287(local145);
									if (local2133 != null) {
										Static155.method2392(local2133);
									}
									local2133 = Static75.method1287(local149);
									if (local2133 != null) {
										Static155.method2392(local2133);
										Static89.method1474(true, local2133);
									}
									if (Static121.anInt2350 != -1) {
										Static244.method3859(1, Static121.anInt2350);
									}
								}
								Static221.anInt4611 = -1;
								return true;
							} else if (Static221.anInt4611 == 178) {
								local141 = Static63.aClass1_Sub18_Sub1_1.method3063();
								local149 = local141 >> 14 & 0x3FFF;
								local287 = local141 & 0x3FFF;
								local145 = local141 >> 28 & 0x3;
								local291 = Static63.aClass1_Sub18_Sub1_1.method3057();
								local1757 = local291 & 0x3;
								local297 = local291 >> 2;
								local520 = Static271.anIntArray631[local297];
								local635 = Static63.aClass1_Sub18_Sub1_1.method3107();
								local287 -= Static158.anInt2961;
								if (local635 == 65535) {
									local635 = -1;
								}
								local149 -= Static224.anInt4695;
								Static178.method2687(local149, local297, local287, local635, local1757, local145, local520);
								Static221.anInt4611 = -1;
								return true;
							} else if (Static221.anInt4611 == 233) {
								local141 = Static63.aClass1_Sub18_Sub1_1.method3062();
								local145 = Static63.aClass1_Sub18_Sub1_1.method3073();
								local149 = Static63.aClass1_Sub18_Sub1_1.method3118();
								if (Static16.method309(local141)) {
									Static170.method2571(local145, local149);
								}
								Static221.anInt4611 = -1;
								return true;
							} else if (Static221.anInt4611 == 55) {
								if (Static121.anInt2350 != -1) {
									Static244.method3859(0, Static121.anInt2350);
								}
								Static221.anInt4611 = -1;
								return true;
							} else if (Static221.anInt4611 == 18) {
								Static63.aClass1_Sub18_Sub1_1.anInt3911 += 28;
								if (Static63.aClass1_Sub18_Sub1_1.method3085()) {
									Static279.method4290(Static63.aClass1_Sub18_Sub1_1.anInt3911 - 28, Static63.aClass1_Sub18_Sub1_1);
								}
								Static221.anInt4611 = -1;
								return true;
							} else if (Static221.anInt4611 == 67) {
								Static150.anInt2784 = Static292.anInt5802 / 8;
								for (local141 = 0; local141 < Static150.anInt2784; local141++) {
									Static65.aLongArray5[local141] = Static63.aClass1_Sub18_Sub1_1.method3112();
									Static259.aStringArray29[local141] = Static128.method1971(Static65.aLongArray5[local141]);
									Static74.aBooleanArray7[local141] = false;
								}
								Static221.anInt4611 = -1;
								Static145.anInt2688 = Static56.anInt1175;
								return true;
							} else if (Static221.anInt4611 == 70) {
								local141 = Static63.aClass1_Sub18_Sub1_1.method3116();
								local145 = Static63.aClass1_Sub18_Sub1_1.method3062();
								local149 = Static63.aClass1_Sub18_Sub1_1.method3107();
								if (Static16.method309(local145)) {
									Static102.method1648(local141, local149);
								}
								Static221.anInt4611 = -1;
								return true;
							} else if (Static221.anInt4611 == 142) {
								local141 = Static63.aClass1_Sub18_Sub1_1.method3062();
								local145 = Static63.aClass1_Sub18_Sub1_1.method3062();
								local149 = Static63.aClass1_Sub18_Sub1_1.method3116();
								if (Static16.method309(local141)) {
									Static278.method4269(local145, local149);
								}
								Static221.anInt4611 = -1;
								return true;
							} else if (Static221.anInt4611 == 242) {
								Static118.method1858();
								Static236.anInt4922 = Static63.aClass1_Sub18_Sub1_1.method3064();
								Static221.anInt4611 = -1;
								Static70.anInt1408 = Static56.anInt1175;
								return true;
							} else if (Static221.anInt4611 == 187) {
								local141 = Static63.aClass1_Sub18_Sub1_1.method3122();
								local145 = local141 >> 5;
								local149 = local141 & 0x1F;
								if (local149 == 0) {
									Static187.aClass36Array1[local145] = null;
									Static221.anInt4611 = -1;
									return true;
								}
								@Pc(2467) Class36 local2467 = new Class36();
								local2467.anInt1168 = local149;
								local2467.anInt1168 = local141 & 0x3F;
								local2467.anInt1166 = Static63.aClass1_Sub18_Sub1_1.method3122();
								if (local2467.anInt1166 >= 0 && local2467.anInt1166 < Static121.aClass1_Sub2_Sub2Array6.length) {
									if (local2467.anInt1168 == 1 || local2467.anInt1168 == 10) {
										local2467.anInt1172 = Static63.aClass1_Sub18_Sub1_1.method3107();
										Static63.aClass1_Sub18_Sub1_1.anInt3911 += 5;
									} else if (local2467.anInt1168 >= 2 && local2467.anInt1168 <= 6) {
										if (local2467.anInt1168 == 2) {
											local2467.anInt1158 = 64;
											local2467.anInt1163 = 64;
										}
										if (local2467.anInt1168 == 3) {
											local2467.anInt1163 = 0;
											local2467.anInt1158 = 64;
										}
										if (local2467.anInt1168 == 4) {
											local2467.anInt1158 = 64;
											local2467.anInt1163 = 128;
										}
										if (local2467.anInt1168 == 5) {
											local2467.anInt1163 = 64;
											local2467.anInt1158 = 0;
										}
										if (local2467.anInt1168 == 6) {
											local2467.anInt1163 = 64;
											local2467.anInt1158 = 128;
										}
										local2467.anInt1168 = 2;
										local2467.anInt1171 = Static63.aClass1_Sub18_Sub1_1.method3107();
										local2467.anInt1159 = Static63.aClass1_Sub18_Sub1_1.method3107();
										local2467.anInt1165 = Static63.aClass1_Sub18_Sub1_1.method3122();
										local2467.anInt1174 = Static63.aClass1_Sub18_Sub1_1.method3107();
									}
									local2467.anInt1170 = Static63.aClass1_Sub18_Sub1_1.method3107();
									if (local2467.anInt1170 == 65535) {
										local2467.anInt1170 = -1;
									}
									Static187.aClass36Array1[local145] = local2467;
								}
								Static221.anInt4611 = -1;
								return true;
							} else {
								@Pc(2643) byte local2643;
								if (Static221.anInt4611 == 213) {
									local2643 = Static63.aClass1_Sub18_Sub1_1.method3108();
									local145 = Static63.aClass1_Sub18_Sub1_1.method3103();
									local149 = Static63.aClass1_Sub18_Sub1_1.method3062();
									if (Static16.method309(local149)) {
										Static102.method1648(local2643, local145);
									}
									Static221.anInt4611 = -1;
									return true;
								} else if (Static221.anInt4611 == 102) {
									local141 = Static63.aClass1_Sub18_Sub1_1.method3107();
									if (Static16.method309(local141)) {
										Static139.method2191();
									}
									Static221.anInt4611 = -1;
									return true;
								} else if (Static221.anInt4611 == 190) {
									local141 = Static63.aClass1_Sub18_Sub1_1.method3107();
									local145 = Static63.aClass1_Sub18_Sub1_1.method3122();
									local149 = Static63.aClass1_Sub18_Sub1_1.method3122();
									local287 = Static63.aClass1_Sub18_Sub1_1.method3107();
									local291 = Static63.aClass1_Sub18_Sub1_1.method3122();
									local297 = Static63.aClass1_Sub18_Sub1_1.method3122();
									if (Static16.method309(local141)) {
										Static297.method4543(true, local297, local287, local145, local149, local291);
									}
									Static221.anInt4611 = -1;
									return true;
								} else if (Static221.anInt4611 == 48) {
									local141 = Static63.aClass1_Sub18_Sub1_1.method3107();
									if (local141 == 65535) {
										local141 = -1;
									}
									local145 = Static63.aClass1_Sub18_Sub1_1.method3122();
									local149 = Static63.aClass1_Sub18_Sub1_1.method3107();
									local287 = Static63.aClass1_Sub18_Sub1_1.method3122();
									Static274.method4193(local145, local149, local141, local287);
									Static221.anInt4611 = -1;
									return true;
								} else if (Static221.anInt4611 == 0) {
									local141 = Static63.aClass1_Sub18_Sub1_1.method3074();
									@Pc(2779) Class127 local2779 = Static75.method1287(local141);
									for (local149 = 0; local149 < local2779.anIntArray415.length; local149++) {
										local2779.anIntArray415[local149] = -1;
										local2779.anIntArray415[local149] = 0;
									}
									Static155.method2392(local2779);
									Static221.anInt4611 = -1;
									return true;
								} else if (Static221.anInt4611 == 158) {
									local479 = Static63.aClass1_Sub18_Sub1_1.method3112();
									local822 = Static63.aClass1_Sub18_Sub1_1.method3107();
									local829 = Static63.aClass1_Sub18_Sub1_1.method3109();
									local1757 = Static63.aClass1_Sub18_Sub1_1.method3122();
									@Pc(2841) long local2841 = local829 + (local822 << 32);
									local520 = Static63.aClass1_Sub18_Sub1_1.method3107();
									@Pc(2847) boolean local2847 = false;
									@Pc(2849) int local2849 = 0;
									label1489: while (true) {
										if (local2849 < 100) {
											if (local2841 != Static218.aLongArray4[local2849]) {
												local2849++;
												continue;
											}
											local2847 = true;
											break;
										}
										if (local1757 <= 1) {
											for (local2849 = 0; local2849 < Static150.anInt2784; local2849++) {
												if (Static65.aLongArray5[local2849] == local479) {
													local2847 = true;
													break label1489;
												}
											}
										}
										break;
									}
									if (!local2847 && Static56.anInt1180 == 0) {
										Static218.aLongArray4[Static258.anInt5201] = local2841;
										Static258.anInt5201 = (Static258.anInt5201 + 1) % 100;
										local711 = Static263.method4060(local520).method3997(Static63.aClass1_Sub18_Sub1_1);
										if (local1757 == 2) {
											Static92.method1524(local711, 18, "<img=1>" + Static266.method4096(local479), null, local520);
										} else if (local1757 == 1) {
											Static92.method1524(local711, 18, "<img=0>" + Static266.method4096(local479), null, local520);
										} else {
											Static92.method1524(local711, 18, Static266.method4096(local479), null, local520);
										}
									}
									Static221.anInt4611 = -1;
									return true;
								} else if (Static221.anInt4611 == 237) {
									local141 = Static63.aClass1_Sub18_Sub1_1.method3118();
									local145 = Static63.aClass1_Sub18_Sub1_1.method3122();
									if (Static16.method309(local141)) {
										Static247.anInt5042 = local145;
									}
									Static221.anInt4611 = -1;
									return true;
								} else if (Static221.anInt4611 == 235) {
									if (Static292.anInt5802 == 0) {
										Static118.aString71 = Static145.aString93;
									} else {
										Static118.aString71 = Static63.aClass1_Sub18_Sub1_1.method3101();
									}
									Static221.anInt4611 = -1;
									return true;
								} else if (Static221.anInt4611 == 94) {
									local141 = Static63.aClass1_Sub18_Sub1_1.method3057();
									local145 = Static63.aClass1_Sub18_Sub1_1.method3057();
									local149 = Static63.aClass1_Sub18_Sub1_1.method3099();
									Static159.anInt2978 = local145 >> 1;
									Static28.aClass6_Sub6_Sub2_1.method3519(local141, local149, (local145 & 0x1) == 1);
									Static221.anInt4611 = -1;
									return true;
								} else if (Static221.anInt4611 == 193) {
									local141 = Static63.aClass1_Sub18_Sub1_1.method3107();
									local1068 = Static63.aClass1_Sub18_Sub1_1.method3101();
									@Pc(3082) Object[] local3082 = new Object[local1068.length() + 1];
									for (local287 = local1068.length() - 1; local287 >= 0; local287--) {
										if (local1068.charAt(local287) == 's') {
											local3082[local287 + 1] = Static63.aClass1_Sub18_Sub1_1.method3101();
										} else {
											local3082[local287 + 1] = Integer.valueOf(Static63.aClass1_Sub18_Sub1_1.method3074());
										}
									}
									local3082[0] = Integer.valueOf(Static63.aClass1_Sub18_Sub1_1.method3074());
									if (Static16.method309(local141)) {
										@Pc(3136) Class1_Sub20 local3136 = new Class1_Sub20();
										local3136.anObjectArray2 = local3082;
										Static283.method4321(local3136);
									}
									Static221.anInt4611 = -1;
									return true;
								} else if (Static221.anInt4611 == 134) {
									local141 = Static63.aClass1_Sub18_Sub1_1.method3118();
									local145 = Static63.aClass1_Sub18_Sub1_1.method3118();
									if (local145 == 65535) {
										local145 = -1;
									}
									local149 = Static63.aClass1_Sub18_Sub1_1.method3074();
									local287 = Static63.aClass1_Sub18_Sub1_1.method3073();
									if (Static16.method309(local141)) {
										@Pc(3183) Class127 local3183 = Static75.method1287(local149);
										@Pc(3195) Class120 local3195;
										if (local3183.aBoolean261) {
											Static79.method2431(local149, local145, local287);
											local3195 = Static183.method4458(local145);
											Static187.method2827(local3195.anInt3298, local3195.anInt3297, local149, local3195.anInt3260);
											Static270.method4148(local3195.anInt3295, local3195.anInt3289, local3195.anInt3272, local149);
										} else if (local145 == -1) {
											Static221.anInt4611 = -1;
											local3183.anInt3592 = 0;
											return true;
										} else {
											local3195 = Static183.method4458(local145);
											local3183.anInt3577 = local3195.anInt3260;
											local3183.anInt3592 = 4;
											local3183.anInt3620 = local3195.anInt3298;
											local3183.anInt3560 = local145;
											local3183.anInt3556 = local3195.anInt3297 * 100 / local287;
											Static155.method2392(local3183);
										}
									}
									Static221.anInt4611 = -1;
									return true;
								} else {
									@Pc(3406) boolean local3406;
									if (Static221.anInt4611 == 106) {
										Static9.anInt246 = Static56.anInt1175;
										local479 = Static63.aClass1_Sub18_Sub1_1.method3112();
										if (local479 == 0L) {
											Static221.anInt4611 = -1;
											Static265.anInt5302 = 0;
											Static32.aClass1_Sub16Array1 = null;
											Static232.aString165 = null;
											Static191.aString130 = null;
											return true;
										}
										local822 = Static63.aClass1_Sub18_Sub1_1.method3112();
										Static191.aString130 = Static45.method819(local822);
										Static232.aString165 = Static45.method819(local479);
										Static108.aByte9 = Static63.aClass1_Sub18_Sub1_1.method3082();
										local291 = Static63.aClass1_Sub18_Sub1_1.method3122();
										if (local291 == 255) {
											Static221.anInt4611 = -1;
											return true;
										}
										@Pc(3322) Class1_Sub16[] local3322 = new Class1_Sub16[100];
										Static265.anInt5302 = local291;
										for (local1757 = 0; local1757 < Static265.anInt5302; local1757++) {
											local3322[local1757] = new Class1_Sub16();
											local3322[local1757].aLong202 = Static63.aClass1_Sub18_Sub1_1.method3112();
											local3322[local1757].aString66 = Static45.method819(local3322[local1757].aLong202);
											local3322[local1757].anInt2086 = Static63.aClass1_Sub18_Sub1_1.method3107();
											local3322[local1757].aByte10 = Static63.aClass1_Sub18_Sub1_1.method3082();
											local3322[local1757].aString64 = Static63.aClass1_Sub18_Sub1_1.method3101();
											if (local3322[local1757].aLong202 == Static211.aLong36) {
												Static48.aByte7 = local3322[local1757].aByte10;
											}
										}
										local635 = Static265.anInt5302;
										while (local635 > 0) {
											local635--;
											local3406 = true;
											for (local647 = 0; local647 < local635; local647++) {
												if (local3322[local647].aString66.compareTo(local3322[local647 + 1].aString66) > 0) {
													@Pc(3434) Class1_Sub16 local3434 = local3322[local647];
													local3406 = false;
													local3322[local647] = local3322[local647 + 1];
													local3322[local647 + 1] = local3434;
												}
											}
											if (local3406) {
												break;
											}
										}
										Static32.aClass1_Sub16Array1 = local3322;
										Static221.anInt4611 = -1;
										return true;
									} else if (Static221.anInt4611 == 115) {
										local1049 = Static63.aClass1_Sub18_Sub1_1.method3101();
										local145 = Static63.aClass1_Sub18_Sub1_1.method3103();
										local149 = Static63.aClass1_Sub18_Sub1_1.method3118();
										if (Static16.method309(local149)) {
											Static93.method1531(local145, local1049);
										}
										Static221.anInt4611 = -1;
										return true;
									} else if (Static221.anInt4611 == 202) {
										local141 = Static63.aClass1_Sub18_Sub1_1.method3122();
										if (Static63.aClass1_Sub18_Sub1_1.method3122() == 0) {
											Static62.aClass109Array1[local141] = new Class109();
										} else {
											Static63.aClass1_Sub18_Sub1_1.anInt3911--;
											Static62.aClass109Array1[local141] = new Class109(Static63.aClass1_Sub18_Sub1_1);
										}
										Static163.anInt4690 = Static56.anInt1175;
										Static221.anInt4611 = -1;
										return true;
									} else if (Static221.anInt4611 == 112) {
										local2643 = Static63.aClass1_Sub18_Sub1_1.method3082();
										local145 = Static63.aClass1_Sub18_Sub1_1.method3062();
										Static109.method1719(local145, local2643);
										Static221.anInt4611 = -1;
										return true;
									} else if (Static221.anInt4611 == 6) {
										local141 = Static63.aClass1_Sub18_Sub1_1.method3062();
										local145 = Static63.aClass1_Sub18_Sub1_1.method3073();
										Static139.method2192(local141, local145);
										Static221.anInt4611 = -1;
										return true;
									} else if (Static221.anInt4611 == 20) {
										local479 = Static63.aClass1_Sub18_Sub1_1.method3112();
										local149 = Static63.aClass1_Sub18_Sub1_1.method3107();
										local489 = false;
										@Pc(3594) byte local3594 = Static63.aClass1_Sub18_Sub1_1.method3082();
										if ((local479 & Long.MIN_VALUE) != 0L) {
											local489 = true;
										}
										if (local489) {
											if (Static265.anInt5302 == 0) {
												Static221.anInt4611 = -1;
												return true;
											}
											local479 &= Long.MAX_VALUE;
											for (local297 = 0; Static265.anInt5302 > local297 && (local479 != Static32.aClass1_Sub16Array1[local297].aLong202 || local149 != Static32.aClass1_Sub16Array1[local297].anInt2086); local297++) {
											}
											if (Static265.anInt5302 > local297) {
												while (local297 < Static265.anInt5302 - 1) {
													Static32.aClass1_Sub16Array1[local297] = Static32.aClass1_Sub16Array1[local297 + 1];
													local297++;
												}
												Static265.anInt5302--;
												Static32.aClass1_Sub16Array1[Static265.anInt5302] = null;
											}
										} else {
											local491 = Static63.aClass1_Sub18_Sub1_1.method3101();
											@Pc(3615) Class1_Sub16 local3615 = new Class1_Sub16();
											local3615.aLong202 = local479;
											local3615.aString66 = Static45.method819(local3615.aLong202);
											local3615.aString64 = local491;
											local3615.anInt2086 = local149;
											local3615.aByte10 = local3594;
											for (local520 = Static265.anInt5302 - 1; local520 >= 0; local520--) {
												local635 = Static32.aClass1_Sub16Array1[local520].aString66.compareTo(local3615.aString66);
												if (local635 == 0) {
													Static32.aClass1_Sub16Array1[local520].anInt2086 = local149;
													Static32.aClass1_Sub16Array1[local520].aByte10 = local3594;
													Static32.aClass1_Sub16Array1[local520].aString64 = local491;
													Static9.anInt246 = Static56.anInt1175;
													Static221.anInt4611 = -1;
													if (local479 == Static211.aLong36) {
														Static48.aByte7 = local3594;
													}
													return true;
												}
												if (local635 < 0) {
													break;
												}
											}
											if (Static265.anInt5302 >= Static32.aClass1_Sub16Array1.length) {
												Static221.anInt4611 = -1;
												return true;
											}
											for (local635 = Static265.anInt5302 - 1; local635 > local520; local635--) {
												Static32.aClass1_Sub16Array1[local635 + 1] = Static32.aClass1_Sub16Array1[local635];
											}
											if (Static265.anInt5302 == 0) {
												Static32.aClass1_Sub16Array1 = new Class1_Sub16[100];
											}
											Static32.aClass1_Sub16Array1[local520 + 1] = local3615;
											if (Static211.aLong36 == local479) {
												Static48.aByte7 = local3594;
											}
											Static265.anInt5302++;
										}
										Static9.anInt246 = Static56.anInt1175;
										Static221.anInt4611 = -1;
										return true;
									} else if (Static221.anInt4611 == 188) {
										local141 = Static63.aClass1_Sub18_Sub1_1.method3118();
										local145 = Static63.aClass1_Sub18_Sub1_1.method3099();
										Static139.method2192(local141, local145);
										Static221.anInt4611 = -1;
										return true;
									} else if (Static221.anInt4611 == 1) {
										local141 = Static63.aClass1_Sub18_Sub1_1.method3118();
										local145 = Static63.aClass1_Sub18_Sub1_1.method3099();
										if (local141 == 65535) {
											local141 = -1;
										}
										Static3.method103(local145, local141);
										Static221.anInt4611 = -1;
										return true;
									} else if (Static221.anInt4611 == 98) {
										local141 = Static63.aClass1_Sub18_Sub1_1.method3118();
										if (local141 == 65535) {
											local141 = -1;
										}
										local145 = Static63.aClass1_Sub18_Sub1_1.method3084();
										local149 = Static63.aClass1_Sub18_Sub1_1.method3092();
										Static247.method3862(local141, local145, local149);
										Static221.anInt4611 = -1;
										return true;
									} else if (Static221.anInt4611 == 192) {
										local141 = Static63.aClass1_Sub18_Sub1_1.method3103();
										local145 = Static63.aClass1_Sub18_Sub1_1.method3116();
										local149 = Static63.aClass1_Sub18_Sub1_1.method3105();
										local287 = Static63.aClass1_Sub18_Sub1_1.method3104();
										if (Static16.method309(local141)) {
											Static166.method2530(local145, local149, local287);
										}
										Static221.anInt4611 = -1;
										return true;
									} else if (Static221.anInt4611 == 180) {
										local141 = Static63.aClass1_Sub18_Sub1_1.method3107();
										local145 = Static63.aClass1_Sub18_Sub1_1.method3116();
										local149 = Static63.aClass1_Sub18_Sub1_1.method3118();
										if (local149 == 65535) {
											local149 = -1;
										}
										if (Static16.method309(local141)) {
											Static153.method2364(1, -1, local149, local145);
										}
										Static221.anInt4611 = -1;
										return true;
									} else if (Static221.anInt4611 == 126) {
										Static51.method877();
										Static221.anInt4611 = -1;
										return false;
									} else if (Static221.anInt4611 == 119) {
										local141 = Static63.aClass1_Sub18_Sub1_1.method3103();
										local1068 = Static63.aClass1_Sub18_Sub1_1.method3101();
										local149 = Static63.aClass1_Sub18_Sub1_1.method3063();
										if (Static16.method309(local141)) {
											Static232.method3817(local149, local1068);
										}
										Static221.anInt4611 = -1;
										return true;
									} else if (Static221.anInt4611 == 47) {
										Static171.method2595(Static63.aClass1_Sub18_Sub1_1, Static292.anInt5802, Static13.aClass84_3);
										Static221.anInt4611 = -1;
										return true;
									} else if (Static221.anInt4611 == 177) {
										local141 = Static63.aClass1_Sub18_Sub1_1.method3103();
										local145 = Static63.aClass1_Sub18_Sub1_1.method3062();
										local149 = Static63.aClass1_Sub18_Sub1_1.method3084();
										if (Static16.method309(local141)) {
											if (local149 == 2) {
												Static113.method1770();
											}
											Static121.anInt2350 = local145;
											Static265.method4071(local145);
											Static156.method1490(false);
											Static17.method320(Static121.anInt2350);
											for (local287 = 0; local287 < 100; local287++) {
												Static267.aBooleanArray25[local287] = true;
											}
										}
										Static221.anInt4611 = -1;
										return true;
									} else {
										@Pc(4104) String local4104;
										if (Static221.anInt4611 == 92) {
											local479 = Static63.aClass1_Sub18_Sub1_1.method3112();
											local4104 = Static142.method4376(Static199.method3038(Static134.method2138(Static63.aClass1_Sub18_Sub1_1)));
											Static48.method843(local4104, 6, Static266.method4096(local479));
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 163) {
											local141 = Static63.aClass1_Sub18_Sub1_1.method3074();
											local145 = Static63.aClass1_Sub18_Sub1_1.method3062();
											local149 = Static63.aClass1_Sub18_Sub1_1.method3057();
											if (Static16.method309(local145)) {
												Static188.method2833(local149, local141);
											}
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 147) {
											local141 = Static63.aClass1_Sub18_Sub1_1.method3062();
											local1068 = Static63.aClass1_Sub18_Sub1_1.method3101();
											local149 = Static63.aClass1_Sub18_Sub1_1.method3062();
											if (Static16.method309(local141)) {
												Static93.method1531(local149, local1068);
											}
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 49) {
											local141 = Static63.aClass1_Sub18_Sub1_1.method3062();
											local145 = Static63.aClass1_Sub18_Sub1_1.method3074();
											local149 = Static63.aClass1_Sub18_Sub1_1.method3065();
											if (Static16.method309(local141)) {
												Static131.method2058(local145, local149);
											}
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 81) {
											Static118.method1858();
											local141 = Static63.aClass1_Sub18_Sub1_1.method3122();
											local145 = Static63.aClass1_Sub18_Sub1_1.method3099();
											local149 = Static63.aClass1_Sub18_Sub1_1.method3073();
											Static278.anIntArray657[local145] = local149;
											Static211.anIntArray127[local145] = local141;
											Static90.anIntArray533[local145] = 1;
											for (local287 = 0; local287 < 98; local287++) {
												if (Class1_Sub1.anIntArray682[local287] <= local149) {
													Static90.anIntArray533[local145] = local287 + 2;
												}
											}
											Static81.anIntArray188[Static18.anInt416++ & 0x1F] = local145;
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 230) {
											Static118.method1858();
											Static228.anInt4543 = Static63.aClass1_Sub18_Sub1_1.method3122();
											Static70.anInt1408 = Static56.anInt1175;
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 21) {
											Static206.method3226();
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 241) {
											Static283.method4323(Static63.aClass1_Sub18_Sub1_1.method3101());
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 62) {
											local141 = Static63.aClass1_Sub18_Sub1_1.method3116();
											local145 = Static63.aClass1_Sub18_Sub1_1.method3107();
											local149 = Static63.aClass1_Sub18_Sub1_1.method3062();
											local287 = Static63.aClass1_Sub18_Sub1_1.method3062();
											if (Static16.method309(local149)) {
												Static58.method1001(local141, local145 + (local287 << 16));
											}
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 75) {
											local141 = Static63.aClass1_Sub18_Sub1_1.method3073();
											Static294.aClass118_8 = Static13.aClass84_3.method1953(local141);
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 117) {
											Static44.method816(true);
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 84) {
											Static205.method3209();
											Static118.method1858();
											Static221.anInt4611 = -1;
											Static151.anInt2791 += 32;
											return true;
										} else if (Static221.anInt4611 == 162) {
											local141 = Static63.aClass1_Sub18_Sub1_1.method3063();
											local145 = Static63.aClass1_Sub18_Sub1_1.method3118();
											Static109.method1719(local145, local141);
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 66) {
											for (local141 = 0; local141 < Static77.aClass6_Sub6_Sub2Array1.length; local141++) {
												if (Static77.aClass6_Sub6_Sub2Array1[local141] != null) {
													Static77.aClass6_Sub6_Sub2Array1[local141].anInt4572 = -1;
												}
											}
											for (local141 = 0; local141 < Static211.aClass6_Sub6_Sub1Array2.length; local141++) {
												if (Static211.aClass6_Sub6_Sub1Array2[local141] != null) {
													Static211.aClass6_Sub6_Sub1Array2[local141].anInt4572 = -1;
												}
											}
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 52) {
											local141 = Static63.aClass1_Sub18_Sub1_1.method3107();
											local145 = Static63.aClass1_Sub18_Sub1_1.method3074();
											if (Static16.method309(local141)) {
												@Pc(4499) Class1_Sub32 local4499 = (Class1_Sub32) Static67.aClass22_7.method633((long) local145);
												if (local4499 != null) {
													Static22.method3920(local4499, true);
												}
												if (Static91.aClass127_4 != null) {
													Static155.method2392(Static91.aClass127_4);
													Static91.aClass127_4 = null;
												}
											}
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 35) {
											local141 = Static63.aClass1_Sub18_Sub1_1.method3062();
											local145 = Static63.aClass1_Sub18_Sub1_1.method3118();
											local149 = Static63.aClass1_Sub18_Sub1_1.method3062();
											local287 = Static63.aClass1_Sub18_Sub1_1.method3116();
											if (local287 >> 30 == 0) {
												@Pc(4592) Class25 local4592;
												@Pc(4597) Class25 local4597;
												@Pc(4652) Class133 local4652;
												@Pc(4612) Class133 local4612;
												@Pc(4619) Class133 local4619;
												if (local287 >> 29 != 0) {
													local291 = local287 & 0xFFFF;
													@Pc(4557) Class6_Sub6_Sub1 local4557 = Static211.aClass6_Sub6_Sub1Array2[local291];
													if (local4557 != null) {
														if (local141 == 65535) {
															local141 = -1;
														}
														local3406 = true;
														if (local141 != -1 && local4557.anInt4580 != -1) {
															if (local141 == local4557.anInt4580) {
																local4592 = Static280.method4295(local141);
																if (local4592.aBoolean78 && local4592.anInt838 != -1) {
																	local4652 = Static262.method4031(local4592.anInt838);
																	local647 = local4652.anInt4021;
																	if (local647 == 1) {
																		local4557.anInt4571 = 1;
																		local4557.anInt4539 = 0;
																		local3406 = false;
																		local4557.anInt4548 = local149 + Static261.anInt5259;
																		local4557.anInt4578 = 0;
																		local4557.anInt4525 = 0;
																		Static128.method1976(false, local4652, local4557.anInt4569, local4557.anInt4578, local4557.anInt4562);
																	} else if (local647 == 2) {
																		local4557.anInt4557 = 0;
																		local3406 = false;
																	}
																}
															} else {
																local4592 = Static280.method4295(local141);
																local4597 = Static280.method4295(local4557.anInt4580);
																if (local4592.anInt838 != -1 && local4597.anInt838 != -1) {
																	local4612 = Static262.method4031(local4592.anInt838);
																	local4619 = Static262.method4031(local4597.anInt838);
																	if (local4612.anInt4013 < local4619.anInt4013) {
																		local3406 = false;
																	}
																}
															}
														}
														if (local3406) {
															local4557.anInt4580 = local141;
															local4557.anInt4548 = local149 + Static261.anInt5259;
															local4557.anInt4520 = local145;
															local4557.anInt4525 = 0;
															local4557.anInt4578 = 0;
															local4557.anInt4571 = 1;
															if (Static261.anInt5259 < local4557.anInt4548) {
																local4557.anInt4578 = -1;
															}
															if (local4557.anInt4580 != -1 && local4557.anInt4548 == Static261.anInt5259) {
																local520 = Static280.method4295(local4557.anInt4580).anInt838;
																if (local520 != -1) {
																	local4652 = Static262.method4031(local520);
																	if (local4652 != null && local4652.anIntArray461 != null) {
																		Static128.method1976(false, local4652, local4557.anInt4569, 0, local4557.anInt4562);
																	}
																}
															}
														}
													}
												} else if (local287 >> 28 != 0) {
													local291 = local287 & 0xFFFF;
													@Pc(4792) Class6_Sub6_Sub2 local4792;
													if (Static216.anInt4446 == local291) {
														local4792 = Static28.aClass6_Sub6_Sub2_1;
													} else {
														local4792 = Static77.aClass6_Sub6_Sub2Array1[local291];
													}
													if (local4792 != null) {
														if (local141 == 65535) {
															local141 = -1;
														}
														local3406 = true;
														if (local141 != -1 && local4792.anInt4580 != -1) {
															if (local4792.anInt4580 == local141) {
																local4592 = Static280.method4295(local141);
																if (local4592.aBoolean78 && local4592.anInt838 != -1) {
																	local4652 = Static262.method4031(local4592.anInt838);
																	local647 = local4652.anInt4021;
																	if (local647 == 1) {
																		local4792.anInt4571 = 1;
																		local3406 = false;
																		local4792.anInt4548 = local149 + Static261.anInt5259;
																		local4792.anInt4539 = 0;
																		local4792.anInt4525 = 0;
																		local4792.anInt4578 = 0;
																		Static128.method1976(false, local4652, local4792.anInt4569, local4792.anInt4578, local4792.anInt4562);
																	} else if (local647 == 2) {
																		local4792.anInt4557 = 0;
																		local3406 = false;
																	}
																}
															} else {
																local4592 = Static280.method4295(local141);
																local4597 = Static280.method4295(local4792.anInt4580);
																if (local4592.anInt838 != -1 && local4597.anInt838 != -1) {
																	local4612 = Static262.method4031(local4592.anInt838);
																	local4619 = Static262.method4031(local4597.anInt838);
																	if (local4612.anInt4013 < local4619.anInt4013) {
																		local3406 = false;
																	}
																}
															}
														}
														if (local3406) {
															local4792.anInt4580 = local141;
															local4792.anInt4525 = 0;
															if (local4792.anInt4580 == 65535) {
																local4792.anInt4580 = -1;
															}
															local4792.anInt4520 = local145;
															local4792.anInt4578 = 0;
															local4792.anInt4571 = 1;
															local4792.anInt4548 = local149 + Static261.anInt5259;
															if (local4792.anInt4548 > Static261.anInt5259) {
																local4792.anInt4578 = -1;
															}
															if (local4792.anInt4580 != -1 && local4792.anInt4548 == Static261.anInt5259) {
																local520 = Static280.method4295(local4792.anInt4580).anInt838;
																if (local520 != -1) {
																	local4652 = Static262.method4031(local520);
																	if (local4652 != null && local4652.anIntArray461 != null) {
																		Static128.method1976(Static28.aClass6_Sub6_Sub2_1 == local4792, local4652, local4792.anInt4569, 0, local4792.anInt4562);
																	}
																}
															}
														}
													}
												}
											} else {
												local291 = local287 >> 28 & 0x3;
												local297 = (local287 >> 14 & 0x3FFF) - Static224.anInt4695;
												local1757 = (local287 & 0x3FFF) - Static158.anInt2961;
												if (local297 >= 0 && local1757 >= 0 && local297 < 104 && local1757 < 104) {
													local1757 = local1757 * 128 + 64;
													local297 = local297 * 128 + 64;
													@Pc(5087) Class6_Sub4 local5087 = new Class6_Sub4(local141, local291, local297, local1757, Static124.method1919(local291, local297, local1757) - local145, local149, Static261.anInt5259);
													Static44.aClass69_5.method1628(new Class1_Sub2_Sub7(local5087));
												}
											}
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 24) {
											local479 = Static63.aClass1_Sub18_Sub1_1.method3112();
											Static63.aClass1_Sub18_Sub1_1.method3082();
											local822 = Static63.aClass1_Sub18_Sub1_1.method3112();
											local829 = Static63.aClass1_Sub18_Sub1_1.method3107();
											local308 = Static63.aClass1_Sub18_Sub1_1.method3109();
											local635 = Static63.aClass1_Sub18_Sub1_1.method3122();
											@Pc(5139) long local5139 = (local829 << 32) + local308;
											@Pc(5141) boolean local5141 = false;
											@Pc(5143) int local5143 = 0;
											label1689: while (true) {
												if (local5143 >= 100) {
													if (local635 <= 1) {
														if (Static146.aBoolean190 && !Static155.aBoolean216 || Static49.aBoolean89) {
															local5141 = true;
														} else {
															for (local5143 = 0; local5143 < Static150.anInt2784; local5143++) {
																if (Static65.aLongArray5[local5143] == local479) {
																	local5141 = true;
																	break label1689;
																}
															}
														}
													}
													break;
												}
												if (local5139 == Static218.aLongArray4[local5143]) {
													local5141 = true;
													break;
												}
												local5143++;
											}
											if (!local5141 && Static56.anInt1180 == 0) {
												Static218.aLongArray4[Static258.anInt5201] = local5139;
												Static258.anInt5201 = (Static258.anInt5201 + 1) % 100;
												local729 = Static142.method4376(Static199.method3038(Static134.method2138(Static63.aClass1_Sub18_Sub1_1)));
												if (local635 == 2 || local635 == 3) {
													Static195.method2960(Static266.method4096(local822), "<img=1>" + Static266.method4096(local479), local729);
												} else if (local635 == 1) {
													Static195.method2960(Static266.method4096(local822), "<img=0>" + Static266.method4096(local479), local729);
												} else {
													Static195.method2960(Static266.method4096(local822), Static266.method4096(local479), local729);
												}
											}
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 240) {
											local141 = Static63.aClass1_Sub18_Sub1_1.method3057();
											local145 = Static63.aClass1_Sub18_Sub1_1.method3062();
											local149 = Static63.aClass1_Sub18_Sub1_1.method3103();
											@Pc(5318) Class6_Sub6_Sub1 local5318 = Static211.aClass6_Sub6_Sub1Array2[local145];
											if (local5318 != null) {
												Static224.method3590(local141, local149, local5318);
											}
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 31) {
											local479 = Static63.aClass1_Sub18_Sub1_1.method3112();
											local822 = Static63.aClass1_Sub18_Sub1_1.method3107();
											local829 = Static63.aClass1_Sub18_Sub1_1.method3109();
											@Pc(5359) long local5359 = (local822 << 32) + local829;
											local1757 = Static63.aClass1_Sub18_Sub1_1.method3122();
											@Pc(5365) boolean local5365 = false;
											local691 = 0;
											label1606: while (true) {
												if (local691 < 100) {
													if (local5359 != Static218.aLongArray4[local691]) {
														local691++;
														continue;
													}
													local5365 = true;
													break;
												}
												if (local1757 <= 1) {
													if (Static146.aBoolean190 && !Static155.aBoolean216 || Static49.aBoolean89) {
														local5365 = true;
													} else {
														for (local691 = 0; local691 < Static150.anInt2784; local691++) {
															if (Static65.aLongArray5[local691] == local479) {
																local5365 = true;
																break label1606;
															}
														}
													}
												}
												break;
											}
											if (!local5365 && Static56.anInt1180 == 0) {
												Static218.aLongArray4[Static258.anInt5201] = local5359;
												Static258.anInt5201 = (Static258.anInt5201 + 1) % 100;
												@Pc(5455) String local5455 = Static142.method4376(Static199.method3038(Static134.method2138(Static63.aClass1_Sub18_Sub1_1)));
												if (local1757 == 2 || local1757 == 3) {
													Static48.method843(local5455, 7, "<img=1>" + Static266.method4096(local479));
												} else if (local1757 == 1) {
													Static48.method843(local5455, 7, "<img=0>" + Static266.method4096(local479));
												} else {
													Static48.method843(local5455, 3, Static266.method4096(local479));
												}
											}
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 204) {
											local141 = Static63.aClass1_Sub18_Sub1_1.method3057();
											local145 = Static63.aClass1_Sub18_Sub1_1.method3062();
											local4104 = Static63.aClass1_Sub18_Sub1_1.method3101();
											local287 = Static63.aClass1_Sub18_Sub1_1.method3084();
											if (local145 == 65535) {
												local145 = -1;
											}
											if (local141 >= 1 && local141 <= 8) {
												if (local4104.equalsIgnoreCase("null")) {
													local4104 = null;
												}
												Static90.aStringArray23[local141 - 1] = local4104;
												Static203.anIntArray458[local141 - 1] = local145;
												Static121.aBooleanArray8[local141 - 1] = local287 == 0;
											}
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 166) {
											Static58.anInt1227 = Static63.aClass1_Sub18_Sub1_1.method3084();
											Static159.anInt2976 = Static63.aClass1_Sub18_Sub1_1.method3122();
											for (local141 = Static58.anInt1227; local141 < Static58.anInt1227 + 8; local141++) {
												for (local145 = Static159.anInt2976; local145 < Static159.anInt2976 + 8; local145++) {
													if (Static4.aClass69ArrayArrayArray1[Static159.anInt2978][local141][local145] != null) {
														Static4.aClass69ArrayArrayArray1[Static159.anInt2978][local141][local145] = null;
														Static261.method4030(local145, local141);
													}
												}
											}
											for (@Pc(5655) Class1_Sub24 local5655 = (Class1_Sub24) Static16.aClass69_2.method1636(); local5655 != null; local5655 = (Class1_Sub24) Static16.aClass69_2.method1631()) {
												if (Static58.anInt1227 <= local5655.anInt4112 && local5655.anInt4112 < Static58.anInt1227 + 8 && local5655.anInt4100 >= Static159.anInt2976 && local5655.anInt4100 < Static159.anInt2976 + 8 && local5655.anInt4104 == Static159.anInt2978) {
													local5655.anInt4114 = 0;
												}
											}
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 255) {
											local141 = Static63.aClass1_Sub18_Sub1_1.method3107();
											local145 = Static63.aClass1_Sub18_Sub1_1.method3122();
											local149 = Static63.aClass1_Sub18_Sub1_1.method3122();
											local287 = Static63.aClass1_Sub18_Sub1_1.method3122();
											local291 = Static63.aClass1_Sub18_Sub1_1.method3122();
											local297 = Static63.aClass1_Sub18_Sub1_1.method3107();
											if (Static16.method309(local141)) {
												Static136.aBooleanArray10[local145] = true;
												Static138.anIntArray314[local145] = local149;
												Static206.anIntArray470[local145] = local287;
												Static260.anIntArray613[local145] = local291;
												Static227.anIntArray556[local145] = local297;
											}
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 85) {
											local141 = Static63.aClass1_Sub18_Sub1_1.method3107();
											if (Static16.method309(local141)) {
												Static110.method1725();
											}
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 228) {
											local141 = Static63.aClass1_Sub18_Sub1_1.method3074();
											local145 = Static63.aClass1_Sub18_Sub1_1.method3107();
											if (local141 < -70000) {
												local145 += 32768;
											}
											if (local141 >= 0) {
												local1694 = Static75.method1287(local141);
											} else {
												local1694 = null;
											}
											while (Static63.aClass1_Sub18_Sub1_1.anInt3911 < Static292.anInt5802) {
												local297 = 0;
												local287 = Static63.aClass1_Sub18_Sub1_1.method3117();
												local291 = Static63.aClass1_Sub18_Sub1_1.method3107();
												if (local291 != 0) {
													local297 = Static63.aClass1_Sub18_Sub1_1.method3122();
													if (local297 == 255) {
														local297 = Static63.aClass1_Sub18_Sub1_1.method3074();
													}
												}
												if (local1694 != null && local287 >= 0 && local1694.anIntArray415.length > local287) {
													local1694.anIntArray415[local287] = local291;
													local1694.anIntArray422[local287] = local297;
												}
												Static195.method2961(local297, local287, local145, local291 - 1);
											}
											if (local1694 != null) {
												Static155.method2392(local1694);
											}
											Static118.method1858();
											Static67.anIntArray167[Static130.anInt2506++ & 0x1F] = local145 & 0x7FFF;
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 9) {
											Static58.anInt1227 = Static63.aClass1_Sub18_Sub1_1.method3057();
											Static159.anInt2976 = Static63.aClass1_Sub18_Sub1_1.method3122();
											while (Static292.anInt5802 > Static63.aClass1_Sub18_Sub1_1.anInt3911) {
												Static221.anInt4611 = Static63.aClass1_Sub18_Sub1_1.method3122();
												Static105.method1657();
											}
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 248) {
											local141 = Static63.aClass1_Sub18_Sub1_1.method3103();
											local145 = Static63.aClass1_Sub18_Sub1_1.method3103();
											local149 = Static63.aClass1_Sub18_Sub1_1.method3103();
											local287 = Static63.aClass1_Sub18_Sub1_1.method3107();
											local291 = Static63.aClass1_Sub18_Sub1_1.method3116();
											if (Static16.method309(local141)) {
												Static153.method2364(7, local149, local145 | local287 << 16, local291);
											}
											Static221.anInt4611 = -1;
											return true;
										} else if (Static221.anInt4611 == 245) {
											local141 = Static63.aClass1_Sub18_Sub1_1.method3118();
											local145 = Static63.aClass1_Sub18_Sub1_1.method3073();
											if (local141 == 65535) {
												local141 = -1;
											}
											local149 = Static63.aClass1_Sub18_Sub1_1.method3118();
											if (Static16.method309(local149)) {
												Static153.method2364(2, -1, local141, local145);
											}
											Static221.anInt4611 = -1;
											return true;
										} else {
											Static6.method149(null, "T1 - " + Static221.anInt4611 + "," + Static258.anInt5207 + "," + Static297.anInt5891 + " - " + Static292.anInt5802);
											Static51.method877();
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
