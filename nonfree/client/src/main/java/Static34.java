import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "Z")
	public static boolean aBoolean61;

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "Lclient!lc;")
	public static Class34 aClass34_4;

	@OriginalMember(owner = "client!gb", name = "B", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_10;

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
	public static int anInt1276;

	@OriginalMember(owner = "client!gb", name = "F", descriptor = "[I")
	public static int[] anIntArray128;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Z")
	public static boolean aBoolean60 = false;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "Lclient!a;")
	public static Class1 aClass1_1235 = Static94.method1596("titlebutton");

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
	public static int anInt1271 = 0;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Lclient!cb;")
	public static Class11 aClass11_11 = new Class11(64);

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "Lclient!a;")
	public static Class1 aClass1_1236 = Static94.method1596(": ");

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "Lclient!cb;")
	public static Class11 aClass11_12 = new Class11(64);

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "Lclient!a;")
	public static Class1 aClass1_1237 = Static94.method1596("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "Lclient!a;")
	private static Class1 aClass1_1238 = Static94.method1596("Invalid username or password)3");

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "Z")
	public static boolean aBoolean62 = true;

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
	public static int anInt1275 = -1;

	@OriginalMember(owner = "client!gb", name = "A", descriptor = "Lclient!a;")
	public static Class1 aClass1_1239 = Static94.method1596("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!gb", name = "D", descriptor = "Lclient!a;")
	public static Class1 aClass1_1240 = aClass1_1238;

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "Lclient!a;")
	public static Class1 aClass1_1241 = Static94.method1596("blinken3:");

	@OriginalMember(owner = "client!gb", name = "G", descriptor = "Lclient!a;")
	public static Class1 aClass1_1242 = Static94.method1596("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!ab;I[Lclient!ad;)V")
	public static void method863(@OriginalArg(0) Class3 arg0, @OriginalArg(2) Class5[] arg1) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(26) int local26;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					if ((Static29.aByteArrayArrayArray2[local3][local7][local11] & 0x1) == 1) {
						local26 = local3;
						if ((Static29.aByteArrayArrayArray2[1][local7][local11] & 0x2) == 2) {
							local26 = local3 - 1;
						}
						if (local26 >= 0) {
							arg1[local26].method203(local11, local7);
						}
					}
				}
			}
		}
		Static95.anInt2401 += (int) (Math.random() * 5.0D) - 2;
		Static67.anInt2766 += (int) (Math.random() * 5.0D) - 2;
		if (Static95.anInt2401 < -8) {
			Static95.anInt2401 = -8;
		}
		if (Static95.anInt2401 > 8) {
			Static95.anInt2401 = 8;
		}
		if (Static67.anInt2766 < -16) {
			Static67.anInt2766 = -16;
		}
		if (Static67.anInt2766 > 16) {
			Static67.anInt2766 = 16;
		}
		@Pc(134) int local134;
		@Pc(136) int local136;
		@Pc(140) int local140;
		@Pc(163) int local163;
		@Pc(184) int local184;
		@Pc(197) int local197;
		@Pc(255) int local255;
		@Pc(201) int local201;
		@Pc(261) int local261;
		@Pc(278) int local278;
		@Pc(249) int local249;
		@Pc(511) int local511;
		@Pc(515) int local515;
		@Pc(654) int local654;
		@Pc(664) int local664;
		@Pc(679) int local679;
		for (local7 = 0; local7 < 4; local7++) {
			@Pc(124) byte[][] local124 = Static32.aByteArrayArrayArray4[local7];
			local26 = (int) Math.sqrt(5100.0D);
			local134 = local26 * 768 >> 8;
			for (local136 = 1; local136 < 103; local136++) {
				for (local140 = 1; local140 < 103; local140++) {
					local163 = Static50.anIntArrayArrayArray7[local7][local140 + 1][local136] - Static50.anIntArrayArrayArray7[local7][local140 - 1][local136];
					local184 = Static50.anIntArrayArrayArray7[local7][local140][local136 + 1] - Static50.anIntArrayArrayArray7[local7][local140][local136 - 1];
					local197 = (int) Math.sqrt((double) (local184 * local184 + local163 * local163 + 65536));
					local201 = 65536 / local197;
					local249 = (local124[local140][local136] >> 1) + (local124[local140][local136 - 1] >> 2) + (local124[local140 + 1][local136] >> 3) + (local124[local140 - 1][local136] >> 2) + (local124[local140][local136 + 1] >> 3);
					local255 = (local163 << 8) / local197;
					local261 = (local184 << 8) / local197;
					local278 = (local255 * -50 + local201 * -10 + local261 * -50) / local134 + 96;
					Static42.anIntArrayArray9[local140][local136] = local278 - local249;
				}
			}
			for (local140 = 0; local140 < 104; local140++) {
				Static97.anIntArray308[local140] = 0;
				Static98.anIntArray312[local140] = 0;
				Static28.anIntArray115[local140] = 0;
				Static112.anIntArray352[local140] = 0;
				Static46.anIntArray162[local140] = 0;
			}
			for (local163 = -5; local163 < 109; local163++) {
				for (local184 = 0; local184 < 104; local184++) {
					local197 = local163 + 5;
					@Pc(404) int local404;
					if (local197 >= 0 && local197 < 104) {
						local255 = Static71.aByteArrayArrayArray6[local7][local197][local184] & 0xFF;
						if (local255 > 0) {
							@Pc(368) Class2_Sub1_Sub11 local368 = Static20.method599(local255 - 1);
							Static97.anIntArray308[local184] += local368.anInt1916;
							Static98.anIntArray312[local184] += local368.anInt1921;
							Static28.anIntArray115[local184] += local368.anInt1915;
							Static112.anIntArray352[local184] += local368.anInt1917;
							local404 = Static46.anIntArray162[local184]++;
						}
					}
					local255 = local163 - 5;
					if (local255 >= 0 && local255 < 104) {
						local201 = Static71.aByteArrayArrayArray6[local7][local255][local184] & 0xFF;
						if (local201 > 0) {
							@Pc(442) Class2_Sub1_Sub11 local442 = Static20.method599(local201 - 1);
							Static97.anIntArray308[local184] -= local442.anInt1916;
							Static98.anIntArray312[local184] -= local442.anInt1921;
							Static28.anIntArray115[local184] -= local442.anInt1915;
							Static112.anIntArray352[local184] -= local442.anInt1917;
							local404 = Static46.anIntArray162[local184]--;
						}
					}
				}
				if (local163 >= 1 && local163 < 103) {
					local197 = 0;
					local255 = 0;
					local201 = 0;
					local278 = 0;
					local261 = 0;
					for (local249 = -5; local249 < 109; local249++) {
						local511 = local249 + 5;
						local515 = local249 - 5;
						if (local511 >= 0 && local511 < 104) {
							local261 += Static112.anIntArray352[local511];
							local255 += Static98.anIntArray312[local511];
							local278 += Static46.anIntArray162[local511];
							local201 += Static28.anIntArray115[local511];
							local197 += Static97.anIntArray308[local511];
						}
						if (local515 >= 0 && local515 < 104) {
							local255 -= Static98.anIntArray312[local515];
							local278 -= Static46.anIntArray162[local515];
							local201 -= Static28.anIntArray115[local515];
							local261 -= Static112.anIntArray352[local515];
							local197 -= Static97.anIntArray308[local515];
						}
						if (local249 >= 1 && local249 < 103 && (!Static77.aBoolean113 || (Static29.aByteArrayArrayArray2[0][local163][local249] & 0x2) != 0 || (Static29.aByteArrayArrayArray2[local7][local163][local249] & 0x10) == 0 && Static98.method1663(local7, local249, local163) == Static50.anInt1644)) {
							if (local7 < Static108.anInt2678) {
								Static108.anInt2678 = local7;
							}
							local654 = Static71.aByteArrayArrayArray6[local7][local163][local249] & 0xFF;
							local664 = Static103.aByteArrayArrayArray9[local7][local163][local249] & 0xFF;
							if (local654 > 0 || local664 > 0) {
								local679 = Static50.anIntArrayArrayArray7[local7][local163][local249];
								@Pc(689) int local689 = Static50.anIntArrayArrayArray7[local7][local163 + 1][local249];
								@Pc(701) int local701 = Static50.anIntArrayArrayArray7[local7][local163 + 1][local249 + 1];
								@Pc(711) int local711 = Static50.anIntArrayArrayArray7[local7][local163][local249 + 1];
								@Pc(717) int local717 = Static42.anIntArrayArray9[local163][local249];
								@Pc(725) int local725 = Static42.anIntArrayArray9[local163 + 1][local249];
								@Pc(735) int local735 = Static42.anIntArrayArray9[local163 + 1][local249 + 1];
								@Pc(737) int local737 = -1;
								@Pc(745) int local745 = Static42.anIntArrayArray9[local163][local249 + 1];
								@Pc(747) int local747 = -1;
								@Pc(758) int local758;
								@Pc(762) int local762;
								if (local654 > 0) {
									local758 = local197 * 256 / local261;
									local762 = local255 / local278;
									@Pc(766) int local766 = local201 / local278;
									local737 = Static22.method604(local762, local766, local758);
									local766 += Static67.anInt2766;
									@Pc(785) int local785 = local758 + Static95.anInt2401 & 0xFF;
									if (local766 < 0) {
										local766 = 0;
									} else if (local766 > 255) {
										local766 = 255;
									}
									local747 = Static22.method604(local762, local766, local785);
								}
								if (local7 > 0) {
									@Pc(809) boolean local809 = true;
									if (local654 == 0 && Static29.aByteArrayArrayArray3[local7][local163][local249] != 0) {
										local809 = false;
									}
									if (local664 > 0 && !Static109.method1793(local664 - 1).aBoolean50) {
										local809 = false;
									}
									if (local809 && local689 == local679 && local701 == local679 && local711 == local679) {
										Static10.anIntArrayArrayArray8[local7][local163][local249] |= 0x924;
									}
								}
								local758 = 0;
								if (local747 != -1) {
									local758 = Static24.anIntArray103[Static97.method1654(local747, 96)];
								}
								if (local664 == 0) {
									arg0.method131(local7, local163, local249, 0, 0, -1, local679, local689, local701, local711, Static97.method1654(local737, local717), Static97.method1654(local737, local725), Static97.method1654(local737, local735), Static97.method1654(local737, local745), 0, 0, 0, 0, local758, 0);
								} else {
									local762 = Static29.aByteArrayArrayArray3[local7][local163][local249] + 1;
									@Pc(904) byte local904 = Static63.aByteArrayArrayArray5[local7][local163][local249];
									@Pc(910) Class2_Sub1_Sub5 local910 = Static109.method1793(local664 - 1);
									@Pc(913) int local913 = local910.anInt1089;
									@Pc(917) int local917;
									@Pc(922) int local922;
									@Pc(944) int local944;
									@Pc(949) int local949;
									if (local913 >= 0) {
										local917 = -1;
										local922 = Static24.anInterface4_1.method1308(local913);
									} else if (local910.anInt1104 == 16711935) {
										local917 = -2;
										local913 = -1;
										local922 = -2;
									} else {
										local917 = Static22.method604(local910.anInt1098, local910.anInt1087, local910.anInt1095);
										local944 = Static95.anInt2401 + local910.anInt1095 & 0xFF;
										local949 = Static67.anInt2766 + local910.anInt1087;
										if (local949 < 0) {
											local949 = 0;
										} else if (local949 > 255) {
											local949 = 255;
										}
										local922 = Static22.method604(local910.anInt1098, local949, local944);
									}
									local944 = 0;
									if (local922 != -2) {
										local944 = Static24.anIntArray103[Static62.method1301(local922, 96)];
									}
									if (local910.anInt1097 != -1) {
										local949 = Static95.anInt2401 + local910.anInt1096 & 0xFF;
										@Pc(1010) int local1010 = local910.anInt1093 + Static67.anInt2766;
										if (local1010 < 0) {
											local1010 = 0;
										} else if (local1010 > 255) {
											local1010 = 255;
										}
										local922 = Static22.method604(local910.anInt1105, local1010, local949);
										local944 = Static24.anIntArray103[Static62.method1301(local922, 96)];
									}
									arg0.method131(local7, local163, local249, local762, local904, local913, local679, local689, local701, local711, Static97.method1654(local737, local717), Static97.method1654(local737, local725), Static97.method1654(local737, local735), Static97.method1654(local737, local745), Static62.method1301(local917, local717), Static62.method1301(local917, local725), Static62.method1301(local917, local735), Static62.method1301(local917, local745), local758, local944);
								}
							}
						}
					}
				}
			}
			for (local184 = 1; local184 < 103; local184++) {
				for (local197 = 1; local197 < 103; local197++) {
					arg0.method162(local7, local197, local184, Static98.method1663(local7, local184, local197));
				}
			}
			Static71.aByteArrayArrayArray6[local7] = null;
			Static103.aByteArrayArrayArray9[local7] = null;
			Static29.aByteArrayArrayArray3[local7] = null;
			Static63.aByteArrayArrayArray5[local7] = null;
			Static32.aByteArrayArrayArray4[local7] = null;
		}
		arg0.method150();
		for (local11 = 0; local11 < 104; local11++) {
			for (local26 = 0; local26 < 104; local26++) {
				if ((Static29.aByteArrayArrayArray2[1][local11][local26] & 0x2) == 2) {
					arg0.method124(local11, local26);
				}
			}
		}
		local26 = 1;
		local134 = 2;
		local136 = 4;
		for (local140 = 0; local140 < 4; local140++) {
			if (local140 > 0) {
				local26 <<= 0x3;
				local136 <<= 0x3;
				local134 <<= 0x3;
			}
			for (local163 = 0; local163 <= local140; local163++) {
				for (local184 = 0; local184 <= 104; local184++) {
					for (local197 = 0; local197 <= 104; local197++) {
						if ((Static10.anIntArrayArrayArray8[local163][local197][local184] & local26) != 0) {
							for (local255 = local184; local255 > 0 && (local26 & Static10.anIntArrayArrayArray8[local163][local197][local255 - 1]) != 0; local255--) {
							}
							for (local201 = local184; local201 < 104 && (Static10.anIntArrayArrayArray8[local163][local197][local201 + 1] & local26) != 0; local201++) {
							}
							local261 = local163;
							local278 = local163;
							label347: while (local261 > 0) {
								for (local249 = local255; local249 <= local201; local249++) {
									if ((Static10.anIntArrayArrayArray8[local261 - 1][local197][local249] & local26) == 0) {
										break label347;
									}
								}
								local261--;
							}
							label336: while (local278 < local140) {
								for (local249 = local255; local249 <= local201; local249++) {
									if ((local26 & Static10.anIntArrayArrayArray8[local278 + 1][local197][local249]) == 0) {
										break label336;
									}
								}
								local278++;
							}
							local249 = (local201 + 1 - local255) * (local278 + 1 - local261);
							if (local249 >= 8) {
								local515 = Static50.anIntArrayArrayArray7[local278][local197][local255] - 240;
								local654 = Static50.anIntArrayArrayArray7[local261][local197][local255];
								Static3.method148(local140, 1, local197 * 128, local197 * 128, local255 * 128, local201 * 128 + 128, local515, local654);
								for (local664 = local261; local664 <= local278; local664++) {
									for (local679 = local255; local679 <= local201; local679++) {
										Static10.anIntArrayArrayArray8[local664][local197][local679] &= ~local26;
									}
								}
							}
						}
						if ((local134 & Static10.anIntArrayArrayArray8[local163][local197][local184]) != 0) {
							for (local255 = local197; local255 > 0 && (local134 & Static10.anIntArrayArrayArray8[local163][local255 - 1][local184]) != 0; local255--) {
							}
							local278 = local163;
							local201 = local197;
							local261 = local163;
							while (local201 < 104 && (local134 & Static10.anIntArrayArrayArray8[local163][local201 + 1][local184]) != 0) {
								local201++;
							}
							label402: while (local261 > 0) {
								for (local249 = local255; local249 <= local201; local249++) {
									if ((Static10.anIntArrayArrayArray8[local261 - 1][local249][local184] & local134) == 0) {
										break label402;
									}
								}
								local261--;
							}
							label391: while (local278 < local140) {
								for (local249 = local255; local249 <= local201; local249++) {
									if ((local134 & Static10.anIntArrayArrayArray8[local278 + 1][local249][local184]) == 0) {
										break label391;
									}
								}
								local278++;
							}
							local249 = (local201 + 1 - local255) * (local278 + 1 - local261);
							if (local249 >= 8) {
								local654 = Static50.anIntArrayArrayArray7[local261][local255][local184];
								local515 = Static50.anIntArrayArrayArray7[local278][local255][local184] - 240;
								Static3.method148(local140, 2, local255 * 128, local201 * 128 + 128, local184 * 128, local184 * 128, local515, local654);
								for (local664 = local261; local664 <= local278; local664++) {
									for (local679 = local255; local679 <= local201; local679++) {
										Static10.anIntArrayArrayArray8[local664][local679][local184] &= ~local134;
									}
								}
							}
						}
						if ((Static10.anIntArrayArrayArray8[local163][local197][local184] & local136) != 0) {
							local255 = local197;
							local201 = local197;
							local261 = local184;
							local278 = local184;
							while (local261 > 0 && (Static10.anIntArrayArrayArray8[local163][local197][local261 - 1] & local136) != 0) {
								local261--;
							}
							while (local278 < 104 && (local136 & Static10.anIntArrayArrayArray8[local163][local197][local278 + 1]) != 0) {
								local278++;
							}
							label456: while (local255 > 0) {
								for (local249 = local261; local249 <= local278; local249++) {
									if ((local136 & Static10.anIntArrayArrayArray8[local163][local255 - 1][local249]) == 0) {
										break label456;
									}
								}
								local255--;
							}
							label445: while (local201 < 104) {
								for (local249 = local261; local249 <= local278; local249++) {
									if ((local136 & Static10.anIntArrayArrayArray8[local163][local201 + 1][local249]) == 0) {
										break label445;
									}
								}
								local201++;
							}
							if ((local201 + 1 - local255) * (local278 + 1 - local261) >= 4) {
								local249 = Static50.anIntArrayArrayArray7[local163][local255][local261];
								Static3.method148(local140, 4, local255 * 128, local201 * 128 + 128, local261 * 128, local278 * 128 + 128, local249, local249);
								for (local511 = local255; local511 <= local201; local511++) {
									for (local515 = local261; local515 <= local278; local515++) {
										Static10.anIntArrayArrayArray8[local163][local511][local515] &= ~local136;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
	public static void method864() {
		aClass1_1242 = null;
		aClass1_1236 = null;
		aClass1_1238 = null;
		aClass1_1240 = null;
		aClass2_Sub1_Sub2_Sub2_10 = null;
		aClass1_1235 = null;
		aClass11_11 = null;
		aClass1_1241 = null;
		aClass11_12 = null;
		aClass1_1239 = null;
		aClass34_4 = null;
		anIntArray128 = null;
		aClass1_1237 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(JI)V")
	public static void method865(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(11) InterruptedException local11) {
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
	public static void method867() {
		for (@Pc(15) Class2_Sub5 local15 = (Class2_Sub5) Static76.aClass46_7.method1435(); local15 != null; local15 = (Class2_Sub5) Static76.aClass46_7.method1442()) {
			if (local15.anInt907 == -1) {
				local15.anInt909 = 0;
				Static68.method1347(local15);
			} else {
				local15.method1820();
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)I")
	public static int method870() {
		return 5;
	}
}
