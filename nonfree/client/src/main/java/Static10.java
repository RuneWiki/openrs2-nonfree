import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!c", name = "b", descriptor = "J")
	public static long aLong14;

	@OriginalMember(owner = "client!c", name = "h", descriptor = "Lclient!he;")
	public static Class11 aClass11_10;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "I")
	public static int anInt311;

	@OriginalMember(owner = "client!c", name = "l", descriptor = "Lclient!w;")
	public static Class15 aClass15_8;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "I")
	public static int anInt305 = 0;

	@OriginalMember(owner = "client!c", name = "g", descriptor = "[I")
	public static int[] anIntArray45 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!c", name = "i", descriptor = "I")
	public static int anInt310 = 0;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "Lclient!va;")
	public static Class61 aClass61_82 = Static88.method1421("@or3@");

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	public static void method243() {
		if (Static21.aClass16_1 != null) {
			@Pc(3) Class16 local3 = Static21.aClass16_1;
			synchronized (Static21.aClass16_1) {
				Static21.aClass16_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(B)V")
	public static void method245() {
		for (@Pc(3) int local3 = 0; local3 < Static76.anInt2030; local3++) {
			@Pc(9) int local9 = Static12.anIntArray46[local3];
			@Pc(13) Class10_Sub1_Sub5_Sub2_Sub2 local13 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[local9];
			@Pc(17) int local17 = Static55.aClass10_Sub10_Sub1_4.method1111();
			if ((local17 & 0x40) != 0) {
				local17 += Static55.aClass10_Sub10_Sub1_4.method1111() << 8;
			}
			Static35.method605(local9, local17, local13);
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
	public static void method246() {
		aClass11_10 = null;
		anIntArray45 = null;
		aClass15_8 = null;
		aClass61_82 = null;
	}

	@OriginalMember(owner = "client!c", name = "c", descriptor = "(B)V")
	public static void method247() {
		if (Static34.anInt1007 > 0) {
			Static34.anInt1007--;
		}
		if (Static19.anInt628 > 1) {
			Static19.anInt628--;
		}
		if (Static60.aBoolean79) {
			Static60.aBoolean79 = false;
			Static19.method413();
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static4.method28(); local27++) {
		}
		if (Static11.anInt319 != 30 && Static11.anInt319 != 35) {
			return;
		}
		@Pc(64) int local64;
		if (Static49.aBoolean64 && Static11.anInt319 == 30) {
			Static19.anInt630 = 0;
			Static88.anInt2315 = 0;
			while (Static79.method1246()) {
			}
			for (local64 = 0; local64 < Static19.aBooleanArray2.length; local64++) {
				Static19.aBooleanArray2[local64] = false;
			}
		}
		Static88.method1418(Static50.aClass10_Sub10_Sub1_3);
		@Pc(86) Object local86 = Static1.aClass22_1.anObject3;
		@Pc(121) int local121;
		@Pc(114) int local114;
		@Pc(123) int local123;
		@Pc(145) int local145;
		synchronized (Static1.aClass22_1.anObject3) {
			if (!Static49.aBoolean65) {
				Static1.aClass22_1.anInt898 = 0;
			} else if (Static19.anInt630 != 0 || Static1.aClass22_1.anInt898 >= 40) {
				Static50.aClass10_Sub10_Sub1_3.method1167(56);
				local114 = 0;
				Static50.aClass10_Sub10_Sub1_3.method1126(0);
				local121 = Static50.aClass10_Sub10_Sub1_3.anInt1957;
				@Pc(140) int local140;
				for (local123 = 0; local123 < Static1.aClass22_1.anInt898 && Static50.aClass10_Sub10_Sub1_3.anInt1957 - local121 < 240; local123++) {
					local114++;
					local140 = Static1.aClass22_1.anIntArray97[local123];
					local145 = Static1.aClass22_1.anIntArray98[local123];
					if (local145 < 0) {
						local145 = 0;
					} else if (local145 > 764) {
						local145 = 764;
					}
					if (local140 < 0) {
						local140 = 0;
					} else if (local140 > 502) {
						local140 = 502;
					}
					@Pc(179) int local179 = local140 * 765 + local145;
					if (Static1.aClass22_1.anIntArray97[local123] == -1 && Static1.aClass22_1.anIntArray98[local123] == -1) {
						local140 = -1;
						local145 = -1;
						local179 = 524287;
					}
					if (local145 != Static46.anInt1276 || Static8.anInt209 != local140) {
						@Pc(217) int local217 = local140 - Static8.anInt209;
						Static8.anInt209 = local140;
						@Pc(224) int local224 = local145 - Static46.anInt1276;
						Static46.anInt1276 = local145;
						if (Static26.anInt1685 < 8 && local224 >= -32 && local224 <= 31 && local217 >= -32 && local217 <= 31) {
							local224 += 32;
							local217 += 32;
							Static50.aClass10_Sub10_Sub1_3.method1152(local217 + (local224 << 6) + (Static26.anInt1685 << 12));
							Static26.anInt1685 = 0;
						} else if (Static26.anInt1685 < 8) {
							Static50.aClass10_Sub10_Sub1_3.method1159(local179 + (Static26.anInt1685 << 19) + 8388608);
							Static26.anInt1685 = 0;
						} else {
							Static50.aClass10_Sub10_Sub1_3.method1157(local179 + (Static26.anInt1685 << 19) - 1073741824);
							Static26.anInt1685 = 0;
						}
					} else if (Static26.anInt1685 < 2047) {
						Static26.anInt1685++;
					}
				}
				Static50.aClass10_Sub10_Sub1_3.method1147(Static50.aClass10_Sub10_Sub1_3.anInt1957 - local121);
				if (local114 < Static1.aClass22_1.anInt898) {
					Static1.aClass22_1.anInt898 -= local114;
					for (local140 = 0; local140 < Static1.aClass22_1.anInt898; local140++) {
						Static1.aClass22_1.anIntArray98[local140] = Static1.aClass22_1.anIntArray98[local114 + local140];
						Static1.aClass22_1.anIntArray97[local140] = Static1.aClass22_1.anIntArray97[local140 + local114];
					}
				} else {
					Static1.aClass22_1.anInt898 = 0;
				}
			}
		}
		if (Static19.anInt630 != 0) {
			@Pc(378) long local378 = (Static9.aLong13 - Static17.aLong18) / 50L;
			local114 = Static12.anInt333;
			if (local114 < 0) {
				local114 = 0;
			} else if (local114 > 764) {
				local114 = 764;
			}
			local121 = Static67.anInt1776;
			if (local121 < 0) {
				local121 = 0;
			} else if (local121 > 502) {
				local121 = 502;
			}
			if (local378 > 4095L) {
				local378 = 4095L;
			}
			Static17.aLong18 = Static9.aLong13;
			local123 = local114 + local121 * 765;
			@Pc(428) byte local428 = 0;
			if (Static19.anInt630 == 2) {
				local428 = 1;
			}
			Static50.aClass10_Sub10_Sub1_3.method1167(76);
			local145 = (int) local378;
			Static50.aClass10_Sub10_Sub1_3.method1114((local145 << 20) + (local428 << 19) + local123);
		}
		if (Static17.anInt568 > 0) {
			Static17.anInt568--;
		}
		if (Static19.aBooleanArray2[96] || Static19.aBooleanArray2[97] || Static19.aBooleanArray2[98] || Static19.aBooleanArray2[99]) {
			Static99.aBoolean117 = true;
		}
		if (Static99.aBoolean117 && Static17.anInt568 <= 0) {
			Static17.anInt568 = 20;
			Static99.aBoolean117 = false;
			Static50.aClass10_Sub10_Sub1_3.method1167(0);
			Static50.aClass10_Sub10_Sub1_3.method1146(Static78.anInt2131);
			Static50.aClass10_Sub10_Sub1_3.method1140(Static79.anInt2144);
		}
		if (Static58.aBoolean74 && !Static54.aBoolean71) {
			Static54.aBoolean71 = true;
			Static50.aClass10_Sub10_Sub1_3.method1167(150);
			Static50.aClass10_Sub10_Sub1_3.method1126(1);
		}
		if (!Static58.aBoolean74 && Static54.aBoolean71) {
			Static54.aBoolean71 = false;
			Static50.aClass10_Sub10_Sub1_3.method1167(150);
			Static50.aClass10_Sub10_Sub1_3.method1126(0);
		}
		Static40.method648();
		if (Static11.anInt319 != 30 && Static11.anInt319 != 35) {
			return;
		}
		Static69.method1012();
		Static12.method260();
		Static33.anInt988++;
		if (Static33.anInt988 > 750) {
			Static19.method413();
			return;
		}
		Static102.method1631();
		Static70.method1661();
		Static64.method946();
		Static106.anInt2692++;
		if (Static104.anInt2625 != 0) {
			Static20.anInt2657++;
			if (Static20.anInt2657 >= 15) {
				if (Static104.anInt2625 == 2) {
					Static80.aBoolean94 = true;
				}
				if (Static104.anInt2625 == 3) {
					Static7.aBoolean1 = true;
				}
				Static104.anInt2625 = 0;
			}
		}
		if (Static9.anInt303 != 0) {
			Static33.anInt987 += 20;
			if (Static33.anInt987 >= 400) {
				Static9.anInt303 = 0;
			}
		}
		if (Static74.anInt1876 != 0) {
			Static64.anInt1734++;
			if (Static28.anInt889 > Static37.anInt1052 + 5 || Static28.anInt889 < Static37.anInt1052 - 5 || Static105.anInt2626 + 5 < Static17.anInt597 || Static17.anInt597 < Static105.anInt2626 - 5) {
				Static39.aBoolean8 = true;
			}
			if (Static88.anInt2315 == 0) {
				if (Static74.anInt1876 == 2) {
					Static80.aBoolean94 = true;
				}
				if (Static74.anInt1876 == 3) {
					Static7.aBoolean1 = true;
				}
				Static74.anInt1876 = 0;
				if (Static39.aBoolean8 && Static64.anInt1734 >= 5) {
					Static7.anInt81 = -1;
					Static22.method472();
					if (Static103.anInt993 == Static7.anInt81 && Static48.anInt1330 != Static9.anInt304) {
						@Pc(753) Class10_Sub1_Sub4 local753 = Static103.method591(Static103.anInt993);
						@Pc(755) byte local755 = 0;
						if (Static61.anInt1600 == 1 && local753.anInt600 == 206) {
							local755 = 1;
						}
						if (local753.anIntArray63[Static9.anInt304] <= 0) {
							local755 = 0;
						}
						if (local753.aBoolean27) {
							local121 = Static48.anInt1330;
							local114 = Static9.anInt304;
							local753.anIntArray63[local114] = local753.anIntArray63[local121];
							local753.anIntArray65[local114] = local753.anIntArray65[local121];
							local753.anIntArray63[local121] = -1;
							local753.anIntArray65[local121] = 0;
						} else if (local755 == 1) {
							local114 = Static9.anInt304;
							local121 = Static48.anInt1330;
							while (local114 != local121) {
								if (local114 < local121) {
									local753.method402(local121, local121 - 1);
									local121--;
								} else if (local121 < local114) {
									local753.method402(local121, local121 + 1);
									local121++;
								}
							}
						} else {
							local753.method402(Static48.anInt1330, Static9.anInt304);
						}
						Static50.aClass10_Sub10_Sub1_3.method1167(40);
						Static50.aClass10_Sub10_Sub1_3.method1140(Static48.anInt1330);
						Static50.aClass10_Sub10_Sub1_3.method1113(local755);
						Static50.aClass10_Sub10_Sub1_3.method1150(Static103.anInt993);
						Static50.aClass10_Sub10_Sub1_3.method1140(Static9.anInt304);
					}
				} else if ((Static69.anInt1817 == 1 || Static38.method635(Static23.anInt747 - 1)) && Static23.anInt747 > 2) {
					Static55.method814();
				} else if (Static23.anInt747 > 0) {
					Static58.method839(Static23.anInt747 - 1);
				}
				Static19.anInt630 = 0;
				Static20.anInt2657 = 10;
			}
		}
		@Pc(890) int local890;
		if (Static85.anInt2284 != -1) {
			local890 = Static85.anInt2290;
			local64 = Static85.anInt2284;
			@Pc(912) boolean local912 = Static95.method1509(true, local890, 0, 0, 0, 0, 0, local64, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray189[0], 0, Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1.anIntArray186[0]);
			if (local912) {
				Static80.anInt2157 = Static67.anInt1776;
				Static33.anInt987 = 0;
				Static9.anInt303 = 1;
				Static55.anInt1487 = Static12.anInt333;
			}
			Static85.anInt2284 = -1;
		}
		if (Static19.anInt630 == 1 && Static54.aClass61_611 != null) {
			Static19.anInt630 = 0;
			Static7.aBoolean1 = true;
			Static54.aClass61_611 = null;
		}
		Static67.method959();
		if (Static53.anInt1448 == -1) {
			Static41.method686();
			Static23.method474();
			Static35.method607();
		}
		if (Static88.anInt2315 == 1 || Static19.anInt630 == 1) {
			Static6.anInt68++;
		}
		if (Static19.anInt631 == -1 && Static96.anInt2448 == -1 && Static105.anInt2641 == -1) {
			if (Static51.anInt1421 > 0) {
				Static51.anInt1421--;
			}
		} else if (Static66.anInt1755 > Static51.anInt1421) {
			Static51.anInt1421++;
			if (Static51.anInt1421 == Static66.anInt1755) {
				if (Static19.anInt631 != -1) {
					Static7.aBoolean1 = true;
				}
				if (Static96.anInt2448 != -1) {
					Static80.aBoolean94 = true;
				}
			}
		}
		Static13.method280();
		if (Static96.aBoolean112) {
			Static106.method1667();
		}
		for (local64 = 0; local64 < 5; local64++) {
			@Pc(1024) int local1024 = Static67.anIntArray195[local64]++;
		}
		Static54.method804();
		local890 = Static94.method1497();
		local121 = Static50.method783();
		if (local890 > 4500 && local121 > 4500) {
			Static34.anInt1007 = 250;
			Static22.method473(4000);
			Static50.aClass10_Sub10_Sub1_3.method1167(62);
		}
		Static46.anInt1284++;
		Static78.anInt2127++;
		Static33.anInt978++;
		if (Static33.anInt978 > 500) {
			Static33.anInt978 = 0;
			local114 = (int) (Math.random() * 8.0D);
			if ((local114 & 0x2) == 2) {
				Static51.anInt1412 += Static100.anInt2659;
			}
			if ((local114 & 0x1) == 1) {
				Static34.anInt1014 += Static69.anInt1818;
			}
			if ((local114 & 0x4) == 4) {
				Static15.anInt453 += Static9.anInt293;
			}
		}
		if (Static34.anInt1014 < -50) {
			Static69.anInt1818 = 2;
		}
		if (Static51.anInt1412 < -55) {
			Static100.anInt2659 = 2;
		}
		if (Static78.anInt2127 > 500) {
			Static78.anInt2127 = 0;
			local114 = (int) (Math.random() * 8.0D);
			if ((local114 & 0x1) == 1) {
				Static57.anInt1509 += Static50.anInt1397;
			}
			if ((local114 & 0x2) == 2) {
				Static25.anInt776 += Static61.anInt1598;
			}
		}
		if (Static57.anInt1509 < -60) {
			Static50.anInt1397 = 2;
		}
		if (Static51.anInt1412 > 55) {
			Static100.anInt2659 = -2;
		}
		if (Static15.anInt453 < -40) {
			Static9.anInt293 = 1;
		}
		if (Static34.anInt1014 > 50) {
			Static69.anInt1818 = -2;
		}
		if (Static25.anInt776 < -20) {
			Static61.anInt1598 = 1;
		}
		if (Static25.anInt776 > 10) {
			Static61.anInt1598 = -1;
		}
		if (Static15.anInt453 > 40) {
			Static9.anInt293 = -1;
		}
		if (Static57.anInt1509 > 60) {
			Static50.anInt1397 = -2;
		}
		if (Static46.anInt1284 > 50) {
			Static50.aClass10_Sub10_Sub1_3.method1167(139);
		}
		try {
			if (Static99.aClass27_4 != null && Static50.aClass10_Sub10_Sub1_3.anInt1957 > 0) {
				Static99.aClass27_4.method613(Static50.aClass10_Sub10_Sub1_3.aByteArray9, Static50.aClass10_Sub10_Sub1_3.anInt1957);
				Static50.aClass10_Sub10_Sub1_3.anInt1957 = 0;
				Static46.anInt1284 = 0;
			}
		} catch (@Pc(1236) IOException local1236) {
			Static19.method413();
		}
	}
}
