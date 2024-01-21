import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!ea", name = "i", descriptor = "[Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1[] aClass5_Sub1_Sub10_Sub1Array5;

	@OriginalMember(owner = "client!ea", name = "n", descriptor = "Lclient!oa;")
	public static Class7 aClass7_27;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "Lclient!vc;")
	private static Class71 aClass71_426 = Static38.method736("scroll:");

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Lclient!vc;")
	public static Class71 aClass71_427 = Static38.method736("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "Lclient!vc;")
	private static Class71 aClass71_428 = Static38.method736("Connection lost");

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "Lclient!vc;")
	public static Class71 aClass71_429 = Static38.method736("Untersuchen");

	@OriginalMember(owner = "client!ea", name = "j", descriptor = "[Lclient!fc;")
	public static Class24_Sub1[] aClass24_Sub1Array1 = new Class24_Sub1[256];

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "Lclient!vc;")
	public static Class71 aClass71_430 = aClass71_426;

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "Lclient!vc;")
	private static Class71 aClass71_433 = Static38.method736("glow1:");

	@OriginalMember(owner = "client!ea", name = "m", descriptor = "Lclient!vc;")
	public static Class71 aClass71_431 = aClass71_433;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "Lclient!vc;")
	public static Class71 aClass71_432 = Static38.method736("gelb:");

	@OriginalMember(owner = "client!ea", name = "t", descriptor = "Lclient!vc;")
	public static Class71 aClass71_434 = aClass71_428;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!me;)V")
	public static void method555(@OriginalArg(1) Class5_Sub1_Sub11 arg0) {
		@Pc(8) int local8 = arg0.anInt1764;
		@Pc(83) int local83;
		if (local8 >= 1 && local8 <= 100 || !(local8 < 701 || local8 > 800)) {
			if (Static39.anInt1031 == 0) {
				if (local8 == 1) {
					arg0.aClass71_879 = Static41.aClass71_601;
					arg0.anInt1772 = 0;
					return;
				}
				if (local8 == 2) {
					arg0.anInt1772 = 0;
					arg0.aClass71_879 = Static64.aClass71_1228;
					return;
				}
			}
			if (Static39.anInt1031 == 1) {
				if (local8 == 1) {
					arg0.anInt1772 = 0;
					arg0.aClass71_879 = Static49.aClass71_710;
					return;
				}
				if (local8 == 2) {
					arg0.anInt1772 = 0;
					arg0.aClass71_879 = Static64.aClass71_1231;
					return;
				}
				if (local8 == 3) {
					arg0.anInt1772 = 0;
					arg0.aClass71_879 = Static3.aClass71_60;
					return;
				}
			}
			local83 = Static68.anInt1685;
			if (Static39.anInt1031 != 2) {
				local83 = 0;
			}
			if (local8 <= 700) {
				local8--;
			} else {
				local8 -= 601;
			}
			if (local83 <= local8) {
				arg0.anInt1772 = 0;
				arg0.aClass71_879 = Static38.aClass71_568;
			} else {
				arg0.aClass71_879 = Static81.aClass71Array13[local8];
				arg0.anInt1772 = 1;
			}
		} else if (local8 >= 101 && local8 <= 200 || local8 >= 801 && local8 <= 900) {
			if (local8 > 800) {
				local8 -= 701;
			} else {
				local8 -= 101;
			}
			local83 = Static68.anInt1685;
			if (Static39.anInt1031 != 2) {
				local83 = 0;
			}
			if (local8 >= local83) {
				arg0.anInt1772 = 0;
				arg0.aClass71_879 = Static38.aClass71_568;
			} else {
				if (Static70.anIntArray216[local8] == 0) {
					arg0.aClass71_879 = Static74.method677(new Class71[] { Static24.aClass71_423, Static78.aClass71_520 });
				} else if (Static70.anIntArray216[local8] >= 5000) {
					if (Static70.anIntArray216[local8] == Static69.anInt1704) {
						arg0.aClass71_879 = Static74.method677(new Class71[] { Static28.aClass71_448, Static95.aClass71_1110, Static51.method962(Static70.anIntArray216[local8] - 5000) });
					} else {
						arg0.aClass71_879 = Static74.method677(new Class71[] { Static104.aClass71_1426, Static95.aClass71_1110, Static51.method962(Static70.anIntArray216[local8] - 5000) });
					}
				} else if (Static70.anIntArray216[local8] == Static69.anInt1704) {
					arg0.aClass71_879 = Static74.method677(new Class71[] { Static28.aClass71_448, Static77.aClass71_940, Static51.method962(Static70.anIntArray216[local8]) });
				} else {
					arg0.aClass71_879 = Static74.method677(new Class71[] { Static104.aClass71_1426, Static77.aClass71_940, Static51.method962(Static70.anIntArray216[local8]) });
				}
				arg0.anInt1772 = 1;
			}
		} else if (local8 == 203) {
			local83 = Static68.anInt1685;
			if (Static39.anInt1031 != 2) {
				local83 = 0;
			}
			arg0.anInt1809 = local83 * 15 + 20;
			if (arg0.anInt1801 >= arg0.anInt1809) {
				arg0.anInt1809 = arg0.anInt1801 + 1;
			}
		} else if (local8 >= 401 && local8 <= 500) {
			local8 -= 401;
			if (local8 == 0 && Static39.anInt1031 == 0) {
				arg0.aClass71_879 = Static50.aClass71_717;
				arg0.anInt1772 = 0;
			} else if (local8 == 1 && Static39.anInt1031 == 0) {
				arg0.anInt1772 = 0;
				arg0.aClass71_879 = Static64.aClass71_1228;
			} else {
				local83 = Static33.anInt935;
				if (Static39.anInt1031 == 0) {
					local83 = 0;
				}
				if (local8 >= local83) {
					arg0.anInt1772 = 0;
					arg0.aClass71_879 = Static38.aClass71_568;
				} else {
					arg0.aClass71_879 = Static88.method1396(Static78.aLongArray4[local8]).method1803();
					arg0.anInt1772 = 1;
				}
			}
		} else if (local8 == 503) {
			arg0.anInt1809 = Static33.anInt935 * 15 + 20;
			if (arg0.anInt1809 <= arg0.anInt1801) {
				arg0.anInt1809 = arg0.anInt1801 + 1;
			}
		} else if (local8 == 324) {
			if (Static99.anInt2340 == -1) {
				Static111.anInt973 = arg0.anInt1812;
				Static99.anInt2340 = arg0.anInt1815;
			}
			if (Static30.aClass32_1.aBoolean51) {
				arg0.anInt1815 = Static99.anInt2340;
			} else {
				arg0.anInt1815 = Static111.anInt973;
			}
		} else if (local8 == 325) {
			if (Static99.anInt2340 == -1) {
				Static99.anInt2340 = arg0.anInt1815;
				Static111.anInt973 = arg0.anInt1812;
			}
			if (Static30.aClass32_1.aBoolean51) {
				arg0.anInt1815 = Static111.anInt973;
			} else {
				arg0.anInt1815 = Static99.anInt2340;
			}
		} else if (local8 == 327) {
			arg0.anInt1829 = 150;
			arg0.anInt1808 = (int) (Math.sin((double) Static95.anInt2285 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1766 = 5;
			arg0.anInt1819 = 0;
		} else if (local8 == 328) {
			arg0.anInt1829 = 150;
			arg0.anInt1808 = (int) (Math.sin((double) Static95.anInt2285 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1766 = 5;
			arg0.anInt1819 = 1;
		} else if (local8 == 600) {
			arg0.aClass71_879 = Static74.method677(new Class71[] { Static38.aClass71_571, Static111.aClass71_542 });
		} else if (local8 == 620) {
			if (Static9.anInt302 < 1) {
				arg0.aClass71_879 = Static38.aClass71_568;
			} else if (Static38.aBoolean44) {
				arg0.aClass71_879 = Static19.aClass71_362;
				arg0.anInt1777 = 16711680;
			} else {
				arg0.aClass71_879 = Static5.aClass71_153;
				arg0.anInt1777 = 16777215;
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	public static void method556() {
		@Pc(16) int local16;
		for (@Pc(9) int local9 = 10; local9 < 117; local9++) {
			local16 = (int) (Math.random() * 100.0D);
			if (local16 < 50) {
				Static5.anIntArray9[local9 + 32512] = 255;
			}
		}
		@Pc(46) int local46;
		@Pc(53) int local53;
		@Pc(59) int local59;
		for (local16 = 0; local16 < 100; local16++) {
			local46 = (int) (Math.random() * 124.0D) + 2;
			local53 = (int) (Math.random() * 128.0D) + 128;
			local59 = (local53 << 7) + local46;
			Static5.anIntArray9[local59] = 192;
		}
		for (local46 = 1; local46 < 255; local46++) {
			for (local53 = 1; local53 < 127; local53++) {
				local59 = (local46 << 7) + local53;
				Static18.anIntArray77[local59] = (Static5.anIntArray9[local59 + 1] + Static5.anIntArray9[local59 - 1] + Static5.anIntArray9[local59 + -128] + Static5.anIntArray9[local59 + 128]) / 4;
			}
		}
		Static48.anInt1377 += 128;
		if (Static46.anIntArray138.length < Static48.anInt1377) {
			Static48.anInt1377 -= Static46.anIntArray138.length;
			local53 = (int) (Math.random() * 12.0D);
			Static30.method585(Static38.aClass5_Sub1_Sub10_Sub1Array6[local53]);
		}
		@Pc(173) int local173;
		for (local53 = 1; local53 < 255; local53++) {
			for (local59 = 1; local59 < 127; local59++) {
				local173 = local59 + (local53 << 7);
				@Pc(194) int local194 = Static18.anIntArray77[local173 + 128] - Static46.anIntArray138[local173 + Static48.anInt1377 & Static46.anIntArray138.length - 1] / 5;
				if (local194 < 0) {
					local194 = 0;
				}
				Static5.anIntArray9[local173] = local194;
			}
		}
		for (local59 = 0; local59 < 255; local59++) {
			Static39.anIntArray121[local59] = Static39.anIntArray121[local59 + 1];
		}
		Static39.anIntArray121[255] = (int) (Math.sin((double) Static95.anInt2285 / 14.0D) * 16.0D + Math.sin((double) Static95.anInt2285 / 15.0D) * 14.0D + Math.sin((double) Static95.anInt2285 / 16.0D) * 12.0D);
		if (Static23.anInt729 > 0) {
			Static23.anInt729 -= 4;
		}
		if (Static91.anInt2116 > 0) {
			Static91.anInt2116 -= 4;
		}
		if (Static23.anInt729 != 0 || Static91.anInt2116 != 0) {
			return;
		}
		local173 = (int) (Math.random() * 2000.0D);
		if (local173 == 1) {
			Static91.anInt2116 = 1024;
		}
		if (local173 == 0) {
			Static23.anInt729 = 1024;
			return;
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V")
	public static void method557() {
		Static61.method1045(false);
		Static10.anInt304 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static111.aByteArrayArray4.length; local14++) {
			if (Static2.anIntArray230[local14] != -1 && Static111.aByteArrayArray4[local14] == null) {
				Static111.aByteArrayArray4[local14] = Static18.aClass24_Sub1_5.method679(Static2.anIntArray230[local14], 0);
				if (Static111.aByteArrayArray4[local14] == null) {
					Static10.anInt304++;
					local12 = false;
				}
			}
			if (Static30.anIntArray98[local14] != -1 && Static83.aByteArrayArray8[local14] == null) {
				Static83.aByteArrayArray8[local14] = Static18.aClass24_Sub1_5.method659(Static17.anIntArrayArray7[local14], 0, Static30.anIntArray98[local14]);
				if (Static83.aByteArrayArray8[local14] == null) {
					Static10.anInt304++;
					local12 = false;
				}
			}
		}
		if (!local12) {
			Static85.anInt2048 = 1;
			return;
		}
		Static97.anInt2317 = 0;
		local12 = true;
		@Pc(121) int local121;
		@Pc(132) int local132;
		for (@Pc(103) int local103 = 0; local103 < Static111.aByteArrayArray4.length; local103++) {
			@Pc(109) byte[] local109 = Static83.aByteArrayArray8[local103];
			if (local109 != null) {
				local121 = (Static114.anIntArray278[local103] >> 8) * 64 - Static48.anInt1367;
				local132 = (Static114.anIntArray278[local103] & 0xFF) * 64 - Static76.anInt1884;
				if (Static33.aBoolean41) {
					local121 = 10;
					local132 = 10;
				}
				local12 &= Static68.method1146(local132, local121, local109);
			}
		}
		if (!local12) {
			Static85.anInt2048 = 2;
			return;
		}
		if (Static85.anInt2048 != 0) {
			Static5.method143(Static97.aClass71_1149, Static104.aClass71_1428, true);
		}
		Static56.method995();
		Static7.aClass43_1.method1083();
		System.gc();
		for (@Pc(174) int local174 = 0; local174 < 4; local174++) {
			Static111.aClass33Array3[local174].method955();
		}
		@Pc(197) int local197;
		for (local121 = 0; local121 < 4; local121++) {
			for (local132 = 0; local132 < 104; local132++) {
				for (local197 = 0; local197 < 104; local197++) {
					Static59.aByteArrayArrayArray2[local121][local132][local197] = 0;
				}
			}
		}
		Static81.method1341();
		local132 = Static111.aByteArrayArray4.length;
		Static32.method616();
		Static61.method1045(true);
		@Pc(260) int local260;
		@Pc(249) int local249;
		@Pc(366) int local366;
		@Pc(300) int local300;
		@Pc(355) int local355;
		if (!Static33.aBoolean41) {
			@Pc(264) byte[] local264;
			for (local197 = 0; local197 < local132; local197++) {
				local249 = (Static114.anIntArray278[local197] & 0xFF) * 64 - Static76.anInt1884;
				local260 = (Static114.anIntArray278[local197] >> 8) * 64 - Static48.anInt1367;
				local264 = Static111.aByteArrayArray4[local197];
				if (local264 != null) {
					Static93.method1560(local249, (Static8.anInt286 - 6) * 8, Static111.aClass33Array3, local260, local264, (Static112.anInt2660 - 6) * 8);
				}
			}
			for (local260 = 0; local260 < local132; local260++) {
				local300 = (Static114.anIntArray278[local260] & 0xFF) * 64 - Static76.anInt1884;
				@Pc(304) byte[] local304 = Static111.aByteArrayArray4[local260];
				local249 = (Static114.anIntArray278[local260] >> 8) * 64 - Static48.anInt1367;
				if (local304 == null && Static8.anInt286 < 800) {
					Static27.method573(local300, 64, 64, local249);
				}
			}
			Static61.method1045(true);
			for (local249 = 0; local249 < local132; local249++) {
				local264 = Static83.aByteArrayArray8[local249];
				if (local264 != null) {
					local355 = (Static114.anIntArray278[local249] >> 8) * 64 - Static48.anInt1367;
					local366 = (Static114.anIntArray278[local249] & 0xFF) * 64 - Static76.anInt1884;
					Static53.method975(local264, Static111.aClass33Array3, local355, local366, Static7.aClass43_1);
				}
			}
		}
		@Pc(410) int local410;
		@Pc(416) int local416;
		if (Static33.aBoolean41) {
			@Pc(428) int local428;
			@Pc(438) int local438;
			@Pc(440) int local440;
			for (local197 = 0; local197 < 4; local197++) {
				for (local260 = 0; local260 < 13; local260++) {
					for (local249 = 0; local249 < 13; local249++) {
						local355 = Static77.anIntArrayArrayArray6[local197][local260][local249];
						@Pc(401) boolean local401 = false;
						if (local355 != -1) {
							local410 = local355 >> 1 & 0x3;
							local416 = local355 >> 14 & 0x3FF;
							local366 = local355 >> 24 & 0x3;
							local428 = local355 >> 3 & 0x7FF;
							local438 = local428 / 8 + (local416 / 8 << 8);
							for (local440 = 0; local440 < Static114.anIntArray278.length; local440++) {
								if (Static114.anIntArray278[local440] == local438 && Static111.aByteArrayArray4[local440] != null) {
									local401 = true;
									Static91.method1433(Static111.aClass33Array3, local366, local249 * 8, local260 * 8, (local428 & 0x7) * 8, local197, Static111.aByteArrayArray4[local440], (local416 & 0x7) * 8, local410);
									break;
								}
							}
						}
						if (!local401) {
							Static5.method148(local249 * 8, local197, local260 * 8);
						}
					}
				}
			}
			for (local260 = 0; local260 < 13; local260++) {
				for (local249 = 0; local249 < 13; local249++) {
					local300 = Static77.anIntArrayArrayArray6[0][local260][local249];
					if (local300 == -1) {
						Static27.method573(local249 * 8, 8, 8, local260 * 8);
					}
				}
			}
			Static61.method1045(true);
			for (local249 = 0; local249 < 4; local249++) {
				for (local300 = 0; local300 < 13; local300++) {
					for (local355 = 0; local355 < 13; local355++) {
						local366 = Static77.anIntArrayArrayArray6[local249][local300][local355];
						if (local366 != -1) {
							local410 = local366 >> 24 & 0x3;
							local416 = local366 >> 1 & 0x3;
							local438 = local366 >> 3 & 0x7FF;
							local428 = local366 >> 14 & 0x3FF;
							local440 = local438 / 8 + (local428 / 8 << 8);
							for (@Pc(621) int local621 = 0; local621 < Static114.anIntArray278.length; local621++) {
								if (local440 == Static114.anIntArray278[local621] && Static83.aByteArrayArray8[local621] != null) {
									Static34.method704(Static111.aClass33Array3, (local428 & 0x7) * 8, local416, (local438 & 0x7) * 8, local410, Static7.aClass43_1, local249, Static83.aByteArrayArray8[local621], local300 * 8, local355 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static61.method1045(true);
		Static56.method995();
		Static17.method474(Static111.aClass33Array3, Static7.aClass43_1);
		Static61.method1045(true);
		local197 = Static77.anInt1920;
		if (local197 > Static23.anInt728) {
			local197 = Static23.anInt728;
		}
		if (Static23.anInt728 - 1 > local197) {
		}
		if (Static21.aBoolean28) {
			Static7.aClass43_1.method1104(Static77.anInt1920);
		} else {
			Static7.aClass43_1.method1104(0);
		}
		for (local260 = 0; local260 < 104; local260++) {
			for (local249 = 0; local249 < 104; local249++) {
				Static112.method1748(local249, local260);
			}
		}
		Static37.method468();
		Static48.aClass54_23.method1402();
		if (Static37.aFrame2 != null) {
			Static61.aClass5_Sub11_Sub1_8.method1553(11);
			Static61.aClass5_Sub11_Sub1_8.method1525(1057001181);
		}
		if (!Static33.aBoolean41) {
			local355 = (Static8.anInt286 - 6) / 8;
			local300 = (Static112.anInt2660 + 6) / 8;
			local249 = (Static112.anInt2660 - 6) / 8;
			local366 = (Static8.anInt286 + 6) / 8;
			for (local410 = local249 - 1; local410 <= local300 + 1; local410++) {
				for (local416 = local355 - 1; local416 <= local366 + 1; local416++) {
					if (local410 < local249 || local410 > local300 || local416 < local355 || local366 < local416) {
						Static18.aClass24_Sub1_5.method651(Static74.method677(new Class71[] { Static107.aClass71_1252, Static51.method962(local410), Static8.aClass71_208, Static51.method962(local416) }));
						Static18.aClass24_Sub1_5.method651(Static74.method677(new Class71[] { Static59.aClass71_774, Static51.method962(local410), Static8.aClass71_208, Static51.method962(local416) }));
					}
				}
			}
		}
		if (Static68.anInt1659 == -1) {
			Static27.method571(30);
		} else {
			Static27.method571(35);
		}
		Static54.method980();
		Static61.aClass5_Sub11_Sub1_8.method1553(74);
		Static42.method770();
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)V")
	public static void method558() {
		aClass5_Sub1_Sub10_Sub1Array5 = null;
		aClass24_Sub1Array1 = null;
		aClass71_431 = null;
		aClass71_433 = null;
		aClass71_434 = null;
		aClass71_430 = null;
		aClass71_427 = null;
		aClass71_428 = null;
		aClass71_432 = null;
		aClass71_429 = null;
		aClass7_27 = null;
		aClass71_426 = null;
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)V")
	public static void method559() {
		if (Static119.aClass11_1 == null) {
			return;
		}
		Static103.method1653();
		if (Static40.anInt717 > 0) {
			Static119.aClass11_1.method1271(256);
			Static40.anInt717 = 0;
		}
		Static119.aClass11_1.method1280();
		Static119.aClass11_1 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)Z")
	public static boolean method560() {
		@Pc(5) Class40 local5 = Static66.aClass40_1;
		synchronized (Static66.aClass40_1) {
			if (Static2.anInt1866 == Static20.anInt677) {
				return false;
			} else {
				Static10.anInt312 = Static75.anIntArray229[Static2.anInt1866];
				Static90.anInt3004 = Static19.anIntArray78[Static2.anInt1866];
				Static2.anInt1866 = Static2.anInt1866 + 1 & 0x7F;
				return true;
			}
		}
	}
}
