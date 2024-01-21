import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!v", name = "Md", descriptor = "Lclient!ja;")
	public static Class33 aClass33_30;

	@OriginalMember(owner = "client!v", name = "pd", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1395 = Static23.method501("Take");

	@OriginalMember(owner = "client!v", name = "Tc", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1391 = aClass42_1395;

	@OriginalMember(owner = "client!v", name = "id", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1392 = Static23.method501("green:");

	@OriginalMember(owner = "client!v", name = "md", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1393 = Static23.method501("overlay_multiway");

	@OriginalMember(owner = "client!v", name = "od", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1394 = aClass42_1392;

	@OriginalMember(owner = "client!v", name = "Fd", descriptor = "Lclient!mb;")
	public static Class41 aClass41_6 = new Class41(4096);

	@OriginalMember(owner = "client!v", name = "Hd", descriptor = "Z")
	public static boolean aBoolean143 = false;

	@OriginalMember(owner = "client!v", name = "Ld", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1399 = Static23.method501(" is already on your friend list");

	@OriginalMember(owner = "client!v", name = "Id", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1397 = aClass42_1399;

	@OriginalMember(owner = "client!v", name = "Jd", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1398 = Static23.method501("Abbrechen");

	@OriginalMember(owner = "client!v", name = "Kd", descriptor = "I")
	public static int anInt2641 = -1;

	@OriginalMember(owner = "client!v", name = "k", descriptor = "(I)V")
	public static void method1765() {
		Static80.aClass1_Sub8_Sub1_2.method1240();
		@Pc(18) int local18 = Static80.aClass1_Sub8_Sub1_2.method1238(1);
		if (local18 == 0) {
			return;
		}
		@Pc(29) int local29 = Static80.aClass1_Sub8_Sub1_2.method1238(2);
		if (local29 == 0) {
			Static77.anIntArray313[Static63.anInt1520++] = 2047;
			return;
		}
		@Pc(52) int local52;
		@Pc(64) int local64;
		if (local29 == 1) {
			local52 = Static80.aClass1_Sub8_Sub1_2.method1238(3);
			Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.method1758(local52, false);
			local64 = Static80.aClass1_Sub8_Sub1_2.method1238(1);
			if (local64 == 1) {
				Static77.anIntArray313[Static63.anInt1520++] = 2047;
			}
			return;
		}
		@Pc(106) int local106;
		if (local29 == 2) {
			local52 = Static80.aClass1_Sub8_Sub1_2.method1238(3);
			Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.method1758(local52, true);
			local64 = Static80.aClass1_Sub8_Sub1_2.method1238(3);
			Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.method1758(local64, true);
			local106 = Static80.aClass1_Sub8_Sub1_2.method1238(1);
			if (local106 == 1) {
				Static77.anIntArray313[Static63.anInt1520++] = 2047;
			}
		} else if (local29 == 3) {
			local52 = Static80.aClass1_Sub8_Sub1_2.method1238(1);
			if (local52 == 1) {
				Static77.anIntArray313[Static63.anInt1520++] = 2047;
			}
			local64 = Static80.aClass1_Sub8_Sub1_2.method1238(1);
			local106 = Static80.aClass1_Sub8_Sub1_2.method1238(7);
			Static82.anInt2165 = Static80.aClass1_Sub8_Sub1_2.method1238(2);
			@Pc(159) int local159 = Static80.aClass1_Sub8_Sub1_2.method1238(7);
			Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.method1762(local159, local64 == 1, local106);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI)Lclient!ea;")
	public static Class1_Sub1_Sub5 method1766(@OriginalArg(1) int arg0) {
		@Pc(17) Class1_Sub1_Sub5 local17 = (Class1_Sub1_Sub5) Static18.aClass37_9.method982((long) arg0);
		if (local17 != null) {
			return local17;
		}
		local17 = Static75.method999(Static54.aClass33_15, Static97.aClass33_27, arg0);
		if (local17 != null) {
			Static18.aClass37_9.method981((long) arg0, local17);
		}
		return local17;
	}

	@OriginalMember(owner = "client!v", name = "l", descriptor = "(I)V")
	public static void method1767() {
		Static48.aClass22_9 = new Class22();
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
	public static void method1768() {
		Static47.aClass37_25.method976();
	}

	@OriginalMember(owner = "client!v", name = "m", descriptor = "(I)V")
	public static void method1769() {
		aClass42_1394 = null;
		aClass42_1398 = null;
		aClass41_6 = null;
		aClass42_1399 = null;
		aClass42_1395 = null;
		aClass42_1397 = null;
		aClass42_1391 = null;
		aClass33_30 = null;
		aClass42_1393 = null;
		aClass42_1392 = null;
	}

	@OriginalMember(owner = "client!v", name = "n", descriptor = "(I)V")
	public static void method1770() {
		@Pc(10) int local10 = Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2576 + Static105.anInt2732;
		@Pc(15) int local15 = Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anInt2583 + Static31.anInt2252;
		if (Static104.anInt2684 - local10 < -500 || Static104.anInt2684 - local10 > 500 || Static107.anInt2711 - local15 < -500 || Static107.anInt2711 - local15 > 500) {
			Static107.anInt2711 = local15;
			Static104.anInt2684 = local10;
		}
		if (local10 != Static104.anInt2684) {
			Static104.anInt2684 += (local10 - Static104.anInt2684) / 16;
		}
		@Pc(60) int local60 = Static104.anInt2684 >> 7;
		if (Static107.anInt2711 != local15) {
			Static107.anInt2711 += (local15 - Static107.anInt2711) / 16;
		}
		@Pc(80) int local80 = Static107.anInt2711 >> 7;
		if (Static59.aBooleanArray14[96]) {
			Static68.anInt1652 += (-Static68.anInt1652 - 24) / 2;
		} else if (Static59.aBooleanArray14[97]) {
			Static68.anInt1652 += (24 - Static68.anInt1652) / 2;
		} else {
			Static68.anInt1652 /= 2;
		}
		if (Static59.aBooleanArray14[98]) {
			Static72.anInt2010 += (12 - Static72.anInt2010) / 2;
		} else if (Static59.aBooleanArray14[99]) {
			Static72.anInt2010 += (-Static72.anInt2010 - 12) / 2;
		} else {
			Static72.anInt2010 /= 2;
		}
		Static62.anInt1467 += Static72.anInt2010 / 2;
		Static36.anInt897 = Static36.anInt897 + Static68.anInt1652 / 2 & 0x7FF;
		@Pc(164) int local164 = 0;
		if (Static62.anInt1467 < 128) {
			Static62.anInt1467 = 128;
		}
		if (Static62.anInt1467 > 383) {
			Static62.anInt1467 = 383;
		}
		@Pc(185) int local185 = Static104.method1821(Static107.anInt2711, Static82.anInt2165, Static104.anInt2684);
		@Pc(205) int local205;
		if (local60 > 3 && local80 > 3 && local60 < 100 && local80 < 100) {
			for (local205 = local60 - 4; local205 <= local60 + 4; local205++) {
				for (@Pc(211) int local211 = local80 - 4; local211 <= local80 + 4; local211++) {
					@Pc(215) int local215 = Static82.anInt2165;
					if (local215 < 3 && (Static61.aByteArrayArrayArray7[1][local205][local211] & 0x2) == 2) {
						local215++;
					}
					@Pc(243) int local243 = local185 - Static10.anIntArrayArrayArray1[local215][local205][local211];
					if (local164 < local243) {
						local164 = local243;
					}
				}
			}
		}
		local205 = local164 * 192;
		if (local205 > 98048) {
			local205 = 98048;
		}
		if (local205 < 32768) {
			local205 = 32768;
		}
		if (local205 > Static45.anInt1864) {
			Static45.anInt1864 += (local205 - Static45.anInt1864) / 24;
		} else if (local205 < Static45.anInt1864) {
			Static45.anInt1864 += (local205 - Static45.anInt1864) / 80;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!qc;I)V")
	public static void method1772(@OriginalArg(0) Class1_Sub1_Sub12 arg0) {
		@Pc(8) int local8 = arg0.anInt2160;
		@Pc(78) int local78;
		if ((local8 < 1 || local8 > 100) && (local8 < 701 || local8 > 800)) {
			if (local8 >= 101 && local8 <= 200 || local8 >= 801 && local8 <= 900) {
				if (local8 > 800) {
					local8 -= 701;
				} else {
					local8 -= 101;
				}
				local78 = Static8.anInt239;
				if (Static99.anInt2518 != 2) {
					local78 = 0;
				}
				if (local8 >= local78) {
					arg0.anInt2156 = 0;
					arg0.aClass42_1166 = Static11.aClass42_195;
				} else {
					if (Static109.anIntArray408[local8] == 0) {
						arg0.aClass42_1166 = Static57.method1822(new Class42[] { Static21.aClass42_374, Static72.aClass42_1053 });
					} else if (Static109.anIntArray408[local8] < 5000) {
						if (Static48.anInt1226 == Static109.anIntArray408[local8]) {
							arg0.aClass42_1166 = Static57.method1822(new Class42[] { Static45.aClass42_961, Static67.aClass42_867, Static38.method642(Static109.anIntArray408[local8]) });
						} else {
							arg0.aClass42_1166 = Static57.method1822(new Class42[] { Static99.aClass42_1353, Static67.aClass42_867, Static38.method642(Static109.anIntArray408[local8]) });
						}
					} else if (Static109.anIntArray408[local8] == Static48.anInt1226) {
						arg0.aClass42_1166 = Static57.method1822(new Class42[] { Static45.aClass42_961, Static21.aClass42_371, Static38.method642(Static109.anIntArray408[local8] - 5000) });
					} else {
						arg0.aClass42_1166 = Static57.method1822(new Class42[] { Static99.aClass42_1353, Static21.aClass42_371, Static38.method642(Static109.anIntArray408[local8] - 5000) });
					}
					arg0.anInt2156 = 1;
				}
			} else if (local8 == 203) {
				local78 = Static8.anInt239;
				if (Static99.anInt2518 != 2) {
					local78 = 0;
				}
				arg0.anInt2192 = local78 * 15 + 20;
				if (arg0.anInt2183 >= arg0.anInt2192) {
					arg0.anInt2192 = arg0.anInt2183 + 1;
				}
			} else if (local8 >= 401 && local8 <= 500) {
				local8 -= 401;
				if (local8 == 0 && Static99.anInt2518 == 0) {
					arg0.anInt2156 = 0;
					arg0.aClass42_1166 = Static56.aClass42_773;
				} else if (local8 == 1 && Static99.anInt2518 == 0) {
					arg0.anInt2156 = 0;
					arg0.aClass42_1166 = Static77.aClass42_1039;
				} else {
					local78 = Static1.anInt1;
					if (Static99.anInt2518 == 0) {
						local78 = 0;
					}
					if (local8 >= local78) {
						arg0.anInt2156 = 0;
						arg0.aClass42_1166 = Static11.aClass42_195;
					} else {
						arg0.aClass42_1166 = Static64.method1096(Static37.aLongArray2[local8]).method1058();
						arg0.anInt2156 = 1;
					}
				}
			} else if (local8 == 503) {
				arg0.anInt2192 = Static1.anInt1 * 15 + 20;
				if (arg0.anInt2183 >= arg0.anInt2192) {
					arg0.anInt2192 = arg0.anInt2183 + 1;
				}
			} else if (local8 == 327) {
				arg0.anInt2162 = 150;
				arg0.anInt2186 = (int) (Math.sin((double) Static27.anInt768 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt2163 = 5;
				arg0.anInt2169 = 0;
			} else if (local8 == 324) {
				if (Static35.anInt873 == -1) {
					Static35.anInt873 = arg0.anInt2188;
					Static63.anInt1528 = arg0.anInt2170;
				}
				if (Static98.aClass29_1.aBoolean46) {
					arg0.anInt2188 = Static35.anInt873;
				} else {
					arg0.anInt2188 = Static63.anInt1528;
				}
			} else if (local8 == 325) {
				if (Static35.anInt873 == -1) {
					Static63.anInt1528 = arg0.anInt2170;
					Static35.anInt873 = arg0.anInt2188;
				}
				if (Static98.aClass29_1.aBoolean46) {
					arg0.anInt2188 = Static63.anInt1528;
				} else {
					arg0.anInt2188 = Static35.anInt873;
				}
			} else if (local8 == 600) {
				arg0.aClass42_1166 = Static57.method1822(new Class42[] { Static11.aClass42_190, Static72.aClass42_1062 });
			} else if (local8 == 620) {
				if (Static25.anInt736 < 1) {
					arg0.aClass42_1166 = Static11.aClass42_195;
				} else if (Static48.aBoolean67) {
					arg0.anInt2148 = 16711680;
					arg0.aClass42_1166 = Static51.aClass42_734;
				} else {
					arg0.aClass42_1166 = Static21.aClass42_375;
					arg0.anInt2148 = 16777215;
				}
			}
		} else if (local8 == 1 && Static99.anInt2518 == 0) {
			arg0.anInt2156 = 0;
			arg0.aClass42_1166 = Static10.aClass42_187;
		} else if (local8 == 1 && Static99.anInt2518 == 1) {
			arg0.aClass42_1166 = Static53.aClass42_1433;
			arg0.anInt2156 = 0;
		} else if (local8 == 2 && Static99.anInt2518 != 2) {
			arg0.anInt2156 = 0;
			arg0.aClass42_1166 = Static77.aClass42_1039;
		} else {
			if (local8 <= 700) {
				local8--;
			} else {
				local8 -= 601;
			}
			local78 = Static8.anInt239;
			if (Static99.anInt2518 != 2) {
				local78 = 0;
			}
			if (local8 >= local78) {
				arg0.anInt2156 = 0;
				arg0.aClass42_1166 = Static11.aClass42_195;
			} else {
				arg0.aClass42_1166 = Static8.aClass42Array3[local8];
				arg0.anInt2156 = 1;
			}
		}
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
	public static void method1773() {
		if (Static30.aClass14_1 == null) {
			return;
		}
		if (Static74.anInt1895 >= 0) {
			if (Static61.anInt1457 > 0) {
				Static24.anInt718 += Static56.anInt1421;
				Static30.aClass14_1.method1423(Static24.anInt718, Static74.anInt1895);
				Static61.anInt1457--;
				if (Static61.anInt1457 == 0) {
					Static30.aClass14_1.method1426();
					Static74.anInt1895 = -1;
					Static61.anInt1457 = 20;
				}
			}
		} else if (Static61.anInt1457 > 0) {
			Static61.anInt1457--;
			if (Static61.anInt1457 == 0) {
				if (Static45.aByteArray25 == null) {
					Static30.aClass14_1.method1425(256);
				} else {
					Static30.aClass14_1.method1425(Static36.anInt904);
					Static74.anInt1895 = Static36.anInt904;
					Static30.aClass14_1.method1421(Static45.aByteArray25, Static36.anInt904, Static49.aBoolean78);
					Static45.aByteArray25 = null;
				}
				Static24.anInt718 = 0;
			}
		}
		Static30.aClass14_1.method1424();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(III)Z")
	public static boolean method1774(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0 && arg1 == Static11.anInt356) {
			return true;
		} else if (arg0 == 1 && anInt2641 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && Static64.anInt1563 == arg1;
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Lclient!qc;I)Z")
	public static boolean method1775(@OriginalArg(0) Class1_Sub1_Sub12 arg0) {
		@Pc(14) int local14 = arg0.anInt2160;
		if (local14 >= 1 && local14 <= 200 || !(local14 < 701 || local14 > 900)) {
			if (local14 >= 801) {
				local14 -= 701;
			} else if (local14 >= 701) {
				local14 -= 601;
			} else if (local14 < 101) {
				local14--;
			} else {
				local14 -= 101;
			}
			Static69.method1232(0, Static57.method1822(new Class42[] { Static19.aClass42_350, Static8.aClass42Array3[local14] }), Static1.aClass42_10, 0, 33, 0);
			Static69.method1232(0, Static57.method1822(new Class42[] { Static19.aClass42_350, Static8.aClass42Array3[local14] }), Static47.aClass42_1287, 0, 23, 0);
			return true;
		} else if (local14 >= 401 && local14 <= 500) {
			Static69.method1232(0, Static57.method1822(new Class42[] { Static19.aClass42_350, arg0.aClass42_1166 }), Static1.aClass42_10, 0, 25, 0);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(II)Z")
	public static boolean method1776(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V")
	public static void method1777() {
		if (Static97.anInt2477 > 0) {
			Static69.method1241();
		} else {
			Static12.method278(40);
			Static107.aClass47_32 = Static58.aClass47_17;
		}
	}

	@OriginalMember(owner = "client!v", name = "f", descriptor = "(II)V")
	public static void method1778() {
		Static69.method1239(false, 10, 0, null);
	}
}
