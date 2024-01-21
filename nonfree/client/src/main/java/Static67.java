import java.awt.event.KeyEvent;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
	public static int anInt1667;

	@OriginalMember(owner = "client!gh", name = "u", descriptor = "Lclient!gb;")
	public static Class1_Sub2_Sub8_Sub1_Sub1 aClass1_Sub2_Sub8_Sub1_Sub1_2;

	@OriginalMember(owner = "client!gh", name = "x", descriptor = "Lclient!ve;")
	public static Class69 aClass69_20;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_480 = Static81.method1507("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_481 = Static81.method1507(":tradereq:");

	@OriginalMember(owner = "client!gh", name = "m", descriptor = "Lclient!ri;")
	public static final Class86 aClass86_22 = new Class86(64);

	@OriginalMember(owner = "client!gh", name = "C", descriptor = "Lclient!ri;")
	public static final Class86 aClass86_24 = new Class86(100);

	@OriginalMember(owner = "client!gh", name = "D", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_482 = Static81.method1507("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!gh", name = "E", descriptor = "Z")
	public static boolean aBoolean85 = false;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
	public static void method1324() {
		System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
		System.exit(1);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
	public static int method1325(@OriginalArg(1) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 == 8364) {
			return 128;
		} else {
			if (local6 <= 0 || local6 >= 256) {
				local6 = -1;
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V")
	public static void method1326() {
		for (@Pc(3) int local3 = -1; local3 < Static82.anInt1956; local3++) {
			@Pc(12) int local12;
			if (local3 == -1) {
				local12 = 2047;
			} else {
				local12 = Static41.anIntArray115[local3];
			}
			@Pc(20) Class5_Sub2_Sub1 local20 = Static110.aClass5_Sub2_Sub1Array1[local12];
			if (local20 != null) {
				Static93.method1682(1, local20);
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
	public static void method1327(@OriginalArg(0) int arg0) {
		Static57.anInt1420 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static60.anInt3602; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static18.anInt3874; local6++) {
				if (Static29.aClass1_Sub8ArrayArrayArray1[arg0][local3][local6] == null) {
					Static29.aClass1_Sub8ArrayArrayArray1[arg0][local3][local6] = new Class1_Sub8(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IJ)V")
	public static void method1329(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < Static105.anInt2367; local16++) {
			if (arg0 == Static145.aLongArray28[local16]) {
				Static105.anInt2367--;
				for (@Pc(29) int local29 = local16; local29 < Static105.anInt2367; local29++) {
					Static152.aClass24Array22[local29] = Static152.aClass24Array22[local29 + 1];
					Static34.anIntArray80[local29] = Static34.anIntArray80[local29 + 1];
					Static110.aClass24Array17[local29] = Static110.aClass24Array17[local29 + 1];
					Static145.aLongArray28[local29] = Static145.aLongArray28[local29 + 1];
					Static55.anIntArray119[local29] = Static55.anIntArray119[local29 + 1];
				}
				Static127.anInt2781 = Static60.anInt3643;
				Static176.aClass1_Sub7_Sub1_34.method2808(126);
				Static176.aClass1_Sub7_Sub1_34.method2801(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "(I)Z")
	public static boolean method1332() throws IOException {
		if (Static91.aClass53_2 == null) {
			return false;
		}
		@Pc(13) int local13 = Static91.aClass53_2.method1718();
		if (local13 == 0) {
			return false;
		}
		if (Static39.anInt1027 == -1) {
			Static91.aClass53_2.method1719(Static192.aClass1_Sub7_Sub1_31.aByteArray38, 0, 1);
			Static192.aClass1_Sub7_Sub1_31.anInt3592 = 0;
			local13--;
			Static39.anInt1027 = Static192.aClass1_Sub7_Sub1_31.method2802();
			Static80.anInt1916 = Static194.anIntArray379[Static39.anInt1027];
		}
		if (Static80.anInt1916 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static91.aClass53_2.method1719(Static192.aClass1_Sub7_Sub1_31.aByteArray38, 0, 1);
			Static80.anInt1916 = Static192.aClass1_Sub7_Sub1_31.aByteArray38[0] & 0xFF;
			local13--;
		}
		if (Static80.anInt1916 == -2) {
			if (local13 <= 1) {
				return false;
			}
			local13 -= 2;
			Static91.aClass53_2.method1719(Static192.aClass1_Sub7_Sub1_31.aByteArray38, 0, 2);
			Static192.aClass1_Sub7_Sub1_31.anInt3592 = 0;
			Static80.anInt1916 = Static192.aClass1_Sub7_Sub1_31.method2765();
		}
		if (local13 < Static80.anInt1916) {
			return false;
		}
		Static192.aClass1_Sub7_Sub1_31.anInt3592 = 0;
		Static91.aClass53_2.method1719(Static192.aClass1_Sub7_Sub1_31.aByteArray38, 0, Static80.anInt1916);
		Static178.anInt3968 = Static8.anInt202;
		Static192.anInt4303 = 0;
		Static8.anInt202 = Static143.anInt3204;
		Static143.anInt3204 = Static39.anInt1027;
		@Pc(123) int local123;
		@Pc(127) int local127;
		@Pc(131) int local131;
		@Pc(138) Class1_Sub11 local138;
		if (Static39.anInt1027 == 22) {
			local123 = Static192.aClass1_Sub7_Sub1_31.method2796();
			local127 = Static192.aClass1_Sub7_Sub1_31.method2799();
			local131 = Static192.aClass1_Sub7_Sub1_31.method2764();
			local138 = (Class1_Sub11) Static115.aClass57_25.method1872((long) local131);
			if (local138 != null) {
				Static66.method1316(local138, local123 != local138.anInt2169);
			}
			Static30.method580(local131, local127, local123);
			Static39.anInt1027 = -1;
			return true;
		} else if (Static39.anInt1027 == 123) {
			Static98.anInt2224 = Static192.aClass1_Sub7_Sub1_31.method2771();
			Static86.anInt2054 = Static192.aClass1_Sub7_Sub1_31.method2771();
			Static204.anInt4558 = Static192.aClass1_Sub7_Sub1_31.method2771();
			Static39.anInt1027 = -1;
			return true;
		} else {
			@Pc(190) Class24 local190;
			if (Static39.anInt1027 == 207) {
				local190 = Static192.aClass1_Sub7_Sub1_31.method2761();
				@Pc(197) Object[] local197 = new Object[local190.method781() + 1];
				for (local131 = local190.method781() - 1; local131 >= 0; local131--) {
					if (local190.method743(local131) == 115) {
						local197[local131 + 1] = Static192.aClass1_Sub7_Sub1_31.method2761();
					} else {
						local197[local131 + 1] = Integer.valueOf(Static192.aClass1_Sub7_Sub1_31.method2793());
					}
				}
				local197[0] = Integer.valueOf(Static192.aClass1_Sub7_Sub1_31.method2793());
				@Pc(255) Class1_Sub16 local255 = new Class1_Sub16();
				local255.anObjectArray1 = local197;
				Static131.method2258(local255);
				Static39.anInt1027 = -1;
				return true;
			} else if (Static39.anInt1027 == 223) {
				for (local123 = 0; local123 < Static122.anIntArray213.length; local123++) {
					if (Static122.anIntArray213[local123] != Static10.anIntArray129[local123]) {
						Static122.anIntArray213[local123] = Static10.anIntArray129[local123];
						Static148.method2538(local123);
						Static183.anIntArray357[Static72.anInt1722++ & 0x1F] = local123;
					}
				}
				Static39.anInt1027 = -1;
				return true;
			} else if (Static39.anInt1027 == 64) {
				Static212.method3583(true);
				Static39.anInt1027 = -1;
				return true;
			} else if (Static39.anInt1027 == 255) {
				Static39.anInt1027 = -1;
				Static174.anInt3879 = 0;
				return true;
			} else {
				@Pc(351) int local351;
				@Pc(355) int local355;
				if (Static39.anInt1027 == 201) {
					local123 = Static192.aClass1_Sub7_Sub1_31.method2771();
					local127 = Static192.aClass1_Sub7_Sub1_31.method2771();
					local131 = Static192.aClass1_Sub7_Sub1_31.method2771();
					local351 = Static192.aClass1_Sub7_Sub1_31.method2771();
					local355 = Static192.aClass1_Sub7_Sub1_31.method2765();
					Static27.aBooleanArray6[local123] = true;
					Static130.anIntArray238[local123] = local127;
					Static35.anIntArray361[local123] = local131;
					Static87.anIntArray178[local123] = local351;
					Static40.anIntArray92[local123] = local355;
					Static39.anInt1027 = -1;
					return true;
				} else if (Static39.anInt1027 == 56) {
					local123 = Static192.aClass1_Sub7_Sub1_31.method2778();
					Static194.aClass82_6 = Static76.aClass99_1.method3424(local123);
					Static39.anInt1027 = -1;
					return true;
				} else if (Static39.anInt1027 == 110) {
					for (local123 = 0; local123 < Static84.anInt2011; local123++) {
						@Pc(406) Class1_Sub2_Sub2 local406 = Static50.method908(local123);
						if (local406 != null && local406.anInt237 == 0) {
							Static10.anIntArray129[local123] = 0;
							Static122.anIntArray213[local123] = 0;
						}
					}
					Static163.method2736();
					Static72.anInt1722 += 32;
					Static39.anInt1027 = -1;
					return true;
				} else {
					@Pc(455) Class98 local455;
					if (Static39.anInt1027 == 235) {
						local123 = Static192.aClass1_Sub7_Sub1_31.method2796();
						local127 = Static192.aClass1_Sub7_Sub1_31.method2793();
						local131 = Static192.aClass1_Sub7_Sub1_31.method2752();
						local455 = Static188.method3229(local127);
						Static39.anInt1027 = -1;
						local455.anInt4394 = local131 + (local123 << 16);
						return true;
					} else if (Static39.anInt1027 == 215) {
						local190 = Static192.aClass1_Sub7_Sub1_31.method2761();
						local127 = Static192.aClass1_Sub7_Sub1_31.method2777();
						local131 = Static192.aClass1_Sub7_Sub1_31.method2771();
						if (local131 >= 1 && local131 <= 8) {
							if (local190.method771(Static145.aClass24_965)) {
								local190 = null;
							}
							Static13.aClass24Array3[local131 - 1] = local190;
							Static82.aBooleanArray8[local131 - 1] = local127 == 0;
						}
						Static39.anInt1027 = -1;
						return true;
					} else if (Static39.anInt1027 == 34) {
						anInt1667 = Static192.aClass1_Sub7_Sub1_31.method2771();
						Static145.anInt3266 = Static192.aClass1_Sub7_Sub1_31.method2771();
						while (Static192.aClass1_Sub7_Sub1_31.anInt3592 < Static80.anInt1916) {
							Static39.anInt1027 = Static192.aClass1_Sub7_Sub1_31.method2771();
							Static173.method2986();
						}
						Static39.anInt1027 = -1;
						return true;
					} else if (Static39.anInt1027 == 101 || Static39.anInt1027 == 176 || Static39.anInt1027 == 148 || Static39.anInt1027 == 85 || Static39.anInt1027 == 90 || Static39.anInt1027 == 243 || Static39.anInt1027 == 171 || Static39.anInt1027 == 19 || Static39.anInt1027 == 114 || Static39.anInt1027 == 72 || Static39.anInt1027 == 16) {
						Static173.method2986();
						Static39.anInt1027 = -1;
						return true;
					} else if (Static39.anInt1027 == 96) {
						Static93.aClass24_639 = Static192.aClass1_Sub7_Sub1_31.method2761();
						Static63.method1275(Static93.aClass24_639);
						Static39.anInt1027 = -1;
						return true;
					} else {
						@Pc(680) Class98 local680;
						if (Static39.anInt1027 == 229) {
							local123 = Static192.aClass1_Sub7_Sub1_31.method2793();
							local127 = Static192.aClass1_Sub7_Sub1_31.method2793();
							@Pc(641) Class1_Sub11 local641 = (Class1_Sub11) Static115.aClass57_25.method1872((long) local123);
							local138 = (Class1_Sub11) Static115.aClass57_25.method1872((long) local127);
							if (local138 != null) {
								Static66.method1316(local138, local138.anInt2169 != local641.anInt2169);
							}
							if (local641 != null) {
								local641.method3563();
								Static115.aClass57_25.method1874(local641, (long) local127);
							}
							local680 = Static188.method3229(local123);
							if (local680 != null) {
								Static199.method2199(local680);
							}
							local680 = Static188.method3229(local127);
							if (local680 != null) {
								Static199.method2199(local680);
							}
							Static39.anInt1027 = -1;
							return true;
						}
						@Pc(805) Class24 local805;
						@Pc(709) long local709;
						@Pc(721) long local721;
						@Pc(716) long local716;
						@Pc(727) int local727;
						@Pc(737) int local737;
						@Pc(760) int local760;
						if (Static39.anInt1027 == 204) {
							local709 = Static192.aClass1_Sub7_Sub1_31.method2756();
							local716 = Static192.aClass1_Sub7_Sub1_31.method2765();
							local721 = Static192.aClass1_Sub7_Sub1_31.method2745();
							local727 = Static192.aClass1_Sub7_Sub1_31.method2771();
							@Pc(733) long local733 = (local716 << 32) + local721;
							@Pc(735) boolean local735 = false;
							for (local737 = 0; local737 < 100; local737++) {
								if (local733 == Static147.aLongArray29[local737]) {
									local735 = true;
									break;
								}
							}
							if (local727 <= 1) {
								for (local760 = 0; local760 < Static34.anInt921; local760++) {
									if (Static135.aLongArray25[local760] == local709) {
										local735 = true;
										break;
									}
								}
							}
							if (!local735 && Static204.anInt4555 == 0) {
								Static147.aLongArray29[Static149.anInt3340] = local733;
								Static149.anInt3340 = (Static149.anInt3340 + 1) % 100;
								local805 = Static51.method1264(Static12.method296(Static192.aClass1_Sub7_Sub1_31).method763());
								if (local727 == 2 || local727 == 3) {
									Static200.method3377(local805, 7, Static63.method1281(new Class24[] { Static72.aClass24_531, Static35.method3219(local709).method761() }));
								} else if (local727 == 1) {
									Static200.method3377(local805, 7, Static63.method1281(new Class24[] { Static150.aClass24_989, Static35.method3219(local709).method761() }));
								} else {
									Static200.method3377(local805, 3, Static35.method3219(local709).method761());
								}
							}
							Static39.anInt1027 = -1;
							return true;
						}
						@Pc(892) Class98 local892;
						@Pc(888) Class24 local888;
						if (Static39.anInt1027 == 75) {
							local123 = Static192.aClass1_Sub7_Sub1_31.method2784();
							local888 = Static192.aClass1_Sub7_Sub1_31.method2761();
							local892 = Static188.method3229(local123);
							if (!local888.method755(local892.aClass24_1260)) {
								local892.aClass24_1260 = local888;
								Static199.method2199(local892);
							}
							Static39.anInt1027 = -1;
							return true;
						} else if (Static39.anInt1027 == 130) {
							local123 = Static192.aClass1_Sub7_Sub1_31.method2796();
							if (local123 == 65535) {
								local123 = -1;
							}
							Static79.method1467(local123);
							Static39.anInt1027 = -1;
							return true;
						} else if (Static39.anInt1027 == 133) {
							local123 = Static192.aClass1_Sub7_Sub1_31.method2747();
							local127 = Static192.aClass1_Sub7_Sub1_31.method2796();
							if (local127 == 65535) {
								local127 = -1;
							}
							Static155.method2241(local123, local127);
							Static39.anInt1027 = -1;
							return true;
						} else {
							@Pc(972) Class98 local972;
							if (Static39.anInt1027 == 107) {
								local123 = Static192.aClass1_Sub7_Sub1_31.method2793();
								local972 = Static188.method3229(local123);
								for (local131 = 0; local131 < local972.anIntArray393.length; local131++) {
									local972.anIntArray393[local131] = -1;
									local972.anIntArray393[local131] = 0;
								}
								Static199.method2199(local972);
								Static39.anInt1027 = -1;
								return true;
							} else if (Static39.anInt1027 == 124) {
								Static161.method2729(Static80.anInt1916, Static76.aClass99_1, Static192.aClass1_Sub7_Sub1_31);
								Static39.anInt1027 = -1;
								return true;
							} else if (Static39.anInt1027 == 247) {
								@Pc(1021) byte[] local1021 = new byte[Static80.anInt1916];
								Static192.aClass1_Sub7_Sub1_31.method2803(local1021, Static80.anInt1916);
								Static78.method1465(Static84.method1555(Static80.anInt1916, local1021, 0));
								Static39.anInt1027 = -1;
								return true;
							} else {
								@Pc(1171) boolean local1171;
								@Pc(1167) int local1167;
								if (Static39.anInt1027 == 2) {
									Static54.anInt3867 = Static60.anInt3643;
									local709 = Static192.aClass1_Sub7_Sub1_31.method2756();
									if (local709 == 0L) {
										Static16.aClass24_115 = null;
										Static132.anInt2948 = 0;
										Static183.aClass24_1183 = null;
										Static39.anInt1027 = -1;
										Static25.aClass1_Sub27Array1 = null;
										return true;
									}
									local716 = Static192.aClass1_Sub7_Sub1_31.method2756();
									Static16.aClass24_115 = Static35.method3219(local716);
									Static183.aClass24_1183 = Static35.method3219(local709);
									Static1.aByte1 = Static192.aClass1_Sub7_Sub1_31.method2770();
									local355 = Static192.aClass1_Sub7_Sub1_31.method2771();
									if (local355 == 255) {
										Static39.anInt1027 = -1;
										return true;
									}
									Static132.anInt2948 = local355;
									@Pc(1099) Class1_Sub27[] local1099 = new Class1_Sub27[100];
									for (local727 = 0; local727 < Static132.anInt2948; local727++) {
										local1099[local727] = new Class1_Sub27();
										local1099[local727].aLong149 = Static192.aClass1_Sub7_Sub1_31.method2756();
										local1099[local727].aClass24_1296 = Static35.method3219(local1099[local727].aLong149);
										local1099[local727].anInt4574 = Static192.aClass1_Sub7_Sub1_31.method2765();
										local1099[local727].aByte12 = Static192.aClass1_Sub7_Sub1_31.method2770();
										local1099[local727].aClass24_1295 = Static192.aClass1_Sub7_Sub1_31.method2761();
										if (local1099[local727].aLong149 == Static91.aLong64) {
											Static156.aByte5 = local1099[local727].aByte12;
										}
									}
									local1167 = Static132.anInt2948;
									while (local1167 > 0) {
										local1171 = true;
										local1167--;
										for (local737 = 0; local737 < local1167; local737++) {
											if (local1099[local737].aClass24_1296.method756(local1099[local737 + 1].aClass24_1296) > 0) {
												local1171 = false;
												@Pc(1195) Class1_Sub27 local1195 = local1099[local737];
												local1099[local737] = local1099[local737 + 1];
												local1099[local737 + 1] = local1195;
											}
										}
										if (local1171) {
											break;
										}
									}
									Static39.anInt1027 = -1;
									Static25.aClass1_Sub27Array1 = local1099;
									return true;
								}
								@Pc(1267) int local1267;
								@Pc(1261) boolean local1261;
								if (Static39.anInt1027 == 0) {
									local190 = Static192.aClass1_Sub7_Sub1_31.method2761();
									if (local190.method751(aClass24_481)) {
										local888 = local190.method759(local190.method738(Static115.aClass24_769), 0);
										local716 = local888.method747();
										local1261 = false;
										for (local1267 = 0; local1267 < Static34.anInt921; local1267++) {
											if (Static135.aLongArray25[local1267] == local716) {
												local1261 = true;
												break;
											}
										}
										if (!local1261 && Static204.anInt4555 == 0) {
											Static200.method3377(Static121.aClass24_794, 4, local888);
										}
									} else if (local190.method751(Static99.aClass24_663)) {
										local888 = local190.method759(local190.method738(Static115.aClass24_769), 0);
										local1261 = false;
										local716 = local888.method747();
										for (local1267 = 0; local1267 < Static34.anInt921; local1267++) {
											if (Static135.aLongArray25[local1267] == local716) {
												local1261 = true;
												break;
											}
										}
										if (!local1261 && Static204.anInt4555 == 0) {
											@Pc(1308) Class24 local1308 = local190.method759(local190.method781() - 9, local190.method738(Static115.aClass24_769) - -1);
											Static200.method3377(local1308, 8, local888);
										}
									} else if (local190.method751(Static52.aClass24_358)) {
										local888 = local190.method759(local190.method738(Static115.aClass24_769), 0);
										local716 = local888.method747();
										local1261 = false;
										for (local1267 = 0; local1267 < Static34.anInt921; local1267++) {
											if (local716 == Static135.aLongArray25[local1267]) {
												local1261 = true;
												break;
											}
										}
										if (!local1261 && Static204.anInt4555 == 0) {
											Static200.method3377(Static85.aClass24_1000, 10, local888);
										}
									} else if (local190.method751(Static57.aClass24_385)) {
										local888 = local190.method759(local190.method738(Static57.aClass24_385), 0);
										Static200.method3377(local888, 11, Static85.aClass24_1000);
									} else if (local190.method751(Static198.aClass24_1271)) {
										local888 = local190.method759(local190.method738(Static198.aClass24_1271), 0);
										if (Static204.anInt4555 == 0) {
											Static200.method3377(local888, 12, Static85.aClass24_1000);
										}
									} else if (local190.method751(Static9.aClass24_72)) {
										local888 = local190.method759(local190.method738(Static9.aClass24_72), 0);
										if (Static204.anInt4555 == 0) {
											Static200.method3377(local888, 13, Static85.aClass24_1000);
										}
									} else if (local190.method751(Static17.aClass24_134)) {
										local888 = local190.method759(local190.method738(Static115.aClass24_769), 0);
										local1261 = false;
										local716 = local888.method747();
										for (local1267 = 0; local1267 < Static34.anInt921; local1267++) {
											if (Static135.aLongArray25[local1267] == local716) {
												local1261 = true;
												break;
											}
										}
										if (!local1261 && Static204.anInt4555 == 0) {
											Static200.method3377(Static85.aClass24_1000, 14, local888);
										}
									} else if (local190.method751(Static148.aClass24_972)) {
										local888 = local190.method759(local190.method738(Static115.aClass24_769), 0);
										local716 = local888.method747();
										local1261 = false;
										for (local1267 = 0; local1267 < Static34.anInt921; local1267++) {
											if (local716 == Static135.aLongArray25[local1267]) {
												local1261 = true;
												break;
											}
										}
										if (!local1261 && Static204.anInt4555 == 0) {
											Static200.method3377(Static85.aClass24_1000, 15, local888);
										}
									} else if (local190.method751(Static136.aClass24_913)) {
										local888 = local190.method759(local190.method738(Static115.aClass24_769), 0);
										local716 = local888.method747();
										local1261 = false;
										for (local1267 = 0; local1267 < Static34.anInt921; local1267++) {
											if (Static135.aLongArray25[local1267] == local716) {
												local1261 = true;
												break;
											}
										}
										if (!local1261 && Static204.anInt4555 == 0) {
											Static200.method3377(Static85.aClass24_1000, 16, local888);
										}
									} else {
										Static200.method3377(local190, 0, Static85.aClass24_1000);
									}
									Static39.anInt1027 = -1;
									return true;
								} else if (Static39.anInt1027 == 170) {
									Static78.aBoolean92 = false;
									for (local123 = 0; local123 < 5; local123++) {
										Static27.aBooleanArray6[local123] = false;
									}
									Static39.anInt1027 = -1;
									return true;
								} else if (Static39.anInt1027 == 66) {
									for (local123 = 0; local123 < Static110.aClass5_Sub2_Sub1Array1.length; local123++) {
										if (Static110.aClass5_Sub2_Sub1Array1[local123] != null) {
											Static110.aClass5_Sub2_Sub1Array1[local123].anInt2485 = -1;
										}
									}
									for (local127 = 0; local127 < Static148.aClass5_Sub2_Sub2Array1.length; local127++) {
										if (Static148.aClass5_Sub2_Sub2Array1[local127] != null) {
											Static148.aClass5_Sub2_Sub2Array1[local127].anInt2485 = -1;
										}
									}
									Static39.anInt1027 = -1;
									return true;
								} else if (Static39.anInt1027 == 177) {
									local123 = Static192.aClass1_Sub7_Sub1_31.method2765();
									local127 = Static192.aClass1_Sub7_Sub1_31.method2764();
									local892 = Static188.method3229(local127);
									if (local892 != null && local892.anInt4373 == 0) {
										if (local892.anInt4347 - local892.anInt4403 < local123) {
											local123 = local892.anInt4347 - local892.anInt4403;
										}
										if (local123 < 0) {
											local123 = 0;
										}
										if (local123 != local892.anInt4348) {
											local892.anInt4348 = local123;
											Static199.method2199(local892);
										}
									}
									Static39.anInt1027 = -1;
									return true;
								} else if (Static39.anInt1027 == 51) {
									local123 = Static192.aClass1_Sub7_Sub1_31.method2799();
									local127 = Static192.aClass1_Sub7_Sub1_31.method2794();
									if (local123 == 1) {
										Static172.method2978();
										for (local131 = 0; local131 < 4; local131++) {
											Static66.aClass93Array1[local131].method3269();
										}
										System.gc();
									} else if (local123 == 2) {
										Static56.method1089();
										System.gc();
										Static57.method1099(25);
									}
									Static177.anInt3924 = local127;
									Static25.method509(local127);
									Static15.method345();
									Static144.method2514(Static177.anInt3924);
									for (local131 = 0; local131 < 100; local131++) {
										Static62.aBooleanArray7[local131] = true;
									}
									Static39.anInt1027 = -1;
									return true;
								} else if (Static39.anInt1027 == 180) {
									local123 = Static192.aClass1_Sub7_Sub1_31.method2771();
									@Pc(1907) Class48 local1907 = new Class48();
									local1907.anInt2070 = local123 & 0x3F;
									local1907.anInt2062 = Static192.aClass1_Sub7_Sub1_31.method2771();
									local127 = local123 >> 6;
									if (local1907.anInt2062 >= 0 && local1907.anInt2062 < Static135.aClass1_Sub2_Sub8_Sub3Array16.length) {
										if (local1907.anInt2070 == 1 || local1907.anInt2070 == 10) {
											local1907.anInt2072 = Static192.aClass1_Sub7_Sub1_31.method2765();
											Static192.aClass1_Sub7_Sub1_31.anInt3592 += 3;
										} else if (local1907.anInt2070 >= 2 && local1907.anInt2070 <= 6) {
											if (local1907.anInt2070 == 2) {
												local1907.anInt2071 = 64;
												local1907.anInt2061 = 64;
											}
											if (local1907.anInt2070 == 3) {
												local1907.anInt2061 = 64;
												local1907.anInt2071 = 0;
											}
											if (local1907.anInt2070 == 4) {
												local1907.anInt2061 = 64;
												local1907.anInt2071 = 128;
											}
											if (local1907.anInt2070 == 5) {
												local1907.anInt2061 = 0;
												local1907.anInt2071 = 64;
											}
											if (local1907.anInt2070 == 6) {
												local1907.anInt2061 = 128;
												local1907.anInt2071 = 64;
											}
											local1907.anInt2070 = 2;
											local1907.anInt2073 = Static192.aClass1_Sub7_Sub1_31.method2765();
											local1907.anInt2065 = Static192.aClass1_Sub7_Sub1_31.method2765();
											local1907.anInt2066 = Static192.aClass1_Sub7_Sub1_31.method2771();
										}
										local1907.anInt2064 = Static192.aClass1_Sub7_Sub1_31.method2765();
										if (local1907.anInt2064 == 65535) {
											local1907.anInt2064 = -1;
										}
										Static56.aClass48Array1[local127] = local1907;
									}
									Static39.anInt1027 = -1;
									return true;
								} else if (Static39.anInt1027 == 50) {
									Static192.anInt4307 = Static192.aClass1_Sub7_Sub1_31.method2771();
									Static39.anInt1027 = -1;
									Static127.anInt2781 = Static60.anInt3643;
									return true;
								} else {
									@Pc(2114) int local2114;
									@Pc(2106) long local2106;
									@Pc(2137) int local2137;
									@Pc(2100) long local2100;
									@Pc(2116) int local2116;
									if (Static39.anInt1027 == 162) {
										local709 = Static192.aClass1_Sub7_Sub1_31.method2756();
										Static192.aClass1_Sub7_Sub1_31.method2770();
										local716 = Static192.aClass1_Sub7_Sub1_31.method2756();
										local721 = Static192.aClass1_Sub7_Sub1_31.method2765();
										local2100 = Static192.aClass1_Sub7_Sub1_31.method2745();
										local2106 = local2100 + (local721 << 32);
										@Pc(2108) boolean local2108 = false;
										local2114 = Static192.aClass1_Sub7_Sub1_31.method2771();
										for (local2116 = 0; local2116 < 100; local2116++) {
											if (local2106 == Static147.aLongArray29[local2116]) {
												local2108 = true;
												break;
											}
										}
										if (local2114 <= 1) {
											for (local2137 = 0; local2137 < Static34.anInt921; local2137++) {
												if (Static135.aLongArray25[local2137] == local709) {
													local2108 = true;
													break;
												}
											}
										}
										if (!local2108 && Static204.anInt4555 == 0) {
											Static147.aLongArray29[Static149.anInt3340] = local2106;
											Static149.anInt3340 = (Static149.anInt3340 + 1) % 100;
											@Pc(2178) Class24 local2178 = Static51.method1264(Static12.method296(Static192.aClass1_Sub7_Sub1_31).method763());
											if (local2114 == 2 || local2114 == 3) {
												Static83.method1545(Static35.method3219(local716).method761(), local2178, Static63.method1281(new Class24[] { Static72.aClass24_531, Static35.method3219(local709).method761() }));
											} else if (local2114 == 1) {
												Static83.method1545(Static35.method3219(local716).method761(), local2178, Static63.method1281(new Class24[] { Static150.aClass24_989, Static35.method3219(local709).method761() }));
											} else {
												Static83.method1545(Static35.method3219(local716).method761(), local2178, Static35.method3219(local709).method761());
											}
										}
										Static39.anInt1027 = -1;
										return true;
									} else if (Static39.anInt1027 == 143) {
										Static187.method3224();
										Static39.anInt1027 = -1;
										return true;
									} else if (Static39.anInt1027 == 105) {
										local123 = Static192.aClass1_Sub7_Sub1_31.method2778();
										local127 = Static192.aClass1_Sub7_Sub1_31.method2752();
										if (local127 == 65535) {
											local127 = -1;
										}
										local131 = Static192.aClass1_Sub7_Sub1_31.method2752();
										local351 = Static192.aClass1_Sub7_Sub1_31.method2764();
										if (local131 == 65535) {
											local131 = -1;
										}
										for (local355 = local131; local355 <= local127; local355++) {
											@Pc(2323) long local2323 = ((long) local351 << 32) + (long) local355;
											@Pc(2328) Class1 local2328 = Static143.aClass57_32.method1872(local2323);
											if (local2328 != null) {
												local2328.method3563();
											}
											Static143.aClass57_32.method1874(new Class1_Sub24(local123), local2323);
										}
										Static39.anInt1027 = -1;
										return true;
									} else if (Static39.anInt1027 == 225) {
										@Pc(2365) boolean local2365 = Static192.aClass1_Sub7_Sub1_31.method2799() == 1;
										local127 = Static192.aClass1_Sub7_Sub1_31.method2793();
										local892 = Static188.method3229(local127);
										if (local892.aBoolean218 != local2365) {
											local892.aBoolean218 = local2365;
											Static199.method2199(local892);
										}
										Static39.anInt1027 = -1;
										return true;
									} else {
										@Pc(2424) int local2424;
										@Pc(2493) Class24 local2493;
										if (Static39.anInt1027 == 140) {
											local709 = Static192.aClass1_Sub7_Sub1_31.method2756();
											local716 = Static192.aClass1_Sub7_Sub1_31.method2765();
											local721 = Static192.aClass1_Sub7_Sub1_31.method2745();
											@Pc(2416) long local2416 = local721 + (local716 << 32);
											local727 = Static192.aClass1_Sub7_Sub1_31.method2771();
											local2424 = Static192.aClass1_Sub7_Sub1_31.method2765();
											@Pc(2426) boolean local2426 = false;
											for (local760 = 0; local760 < 100; local760++) {
												if (Static147.aLongArray29[local760] == local2416) {
													local2426 = true;
													break;
												}
											}
											if (local727 <= 1) {
												for (local2116 = 0; local2116 < Static34.anInt921; local2116++) {
													if (Static135.aLongArray25[local2116] == local709) {
														local2426 = true;
														break;
													}
												}
											}
											if (!local2426 && Static204.anInt4555 == 0) {
												Static147.aLongArray29[Static149.anInt3340] = local2416;
												Static149.anInt3340 = (Static149.anInt3340 + 1) % 100;
												local2493 = Static58.method1105(local2424).method1039(Static192.aClass1_Sub7_Sub1_31);
												if (local727 == 2) {
													Static166.method2829(null, Static63.method1281(new Class24[] { Static72.aClass24_531, Static35.method3219(local709).method761() }), 18, local2493, local2424);
												} else if (local727 == 1) {
													Static166.method2829(null, Static63.method1281(new Class24[] { Static150.aClass24_989, Static35.method3219(local709).method761() }), 18, local2493, local2424);
												} else {
													Static166.method2829(null, Static35.method3219(local709).method761(), 18, local2493, local2424);
												}
											}
											Static39.anInt1027 = -1;
											return true;
										} else if (Static39.anInt1027 == 178) {
											local123 = Static192.aClass1_Sub7_Sub1_31.method2765();
											if (local123 == 65535) {
												local123 = -1;
											}
											local127 = Static192.aClass1_Sub7_Sub1_31.method2771();
											local131 = Static192.aClass1_Sub7_Sub1_31.method2765();
											Static60.method2786(local131, local123, local127);
											Static39.anInt1027 = -1;
											return true;
										} else if (Static39.anInt1027 == 181) {
											local123 = Static192.aClass1_Sub7_Sub1_31.method2793();
											@Pc(2609) Class1_Sub11 local2609 = (Class1_Sub11) Static115.aClass57_25.method1872((long) local123);
											if (local2609 != null) {
												Static66.method1316(local2609, true);
											}
											if (Static10.aClass98_10 != null) {
												Static199.method2199(Static10.aClass98_10);
												Static10.aClass98_10 = null;
											}
											Static39.anInt1027 = -1;
											return true;
										} else if (Static39.anInt1027 == 3) {
											local123 = Static192.aClass1_Sub7_Sub1_31.method2794();
											Static47.method857(local123);
											Static56.anIntArray121[Static12.anInt304++ & 0x1F] = local123 & 0x7FFF;
											Static39.anInt1027 = -1;
											return true;
										} else if (Static39.anInt1027 == 244) {
											local123 = Static192.aClass1_Sub7_Sub1_31.method2778();
											local127 = Static192.aClass1_Sub7_Sub1_31.method2752();
											if (local127 == 65535) {
												local127 = -1;
											}
											local131 = Static192.aClass1_Sub7_Sub1_31.method2764();
											local455 = Static188.method3229(local123);
											@Pc(2697) Class1_Sub2_Sub23 local2697;
											if (local455.aBoolean211) {
												local455.anInt4346 = local131;
												local455.anInt4375 = local127;
												local2697 = Static168.method2886(local127);
												local455.anInt4404 = local2697.anInt4244;
												local455.anInt4378 = local2697.anInt4207;
												if (local455.anInt4354 > 0) {
													local455.anInt4404 = local455.anInt4404 * 32 / local455.anInt4354;
												} else if (local455.anInt4405 > 0) {
													local455.anInt4404 = local455.anInt4404 * 32 / local455.anInt4405;
												}
												local455.anInt4402 = local2697.anInt4243;
												local455.anInt4383 = local2697.anInt4216;
												local455.anInt4374 = local2697.anInt4211;
												local455.anInt4353 = local2697.anInt4231;
												Static199.method2199(local455);
											} else if (local127 == -1) {
												local455.anInt4363 = 0;
												Static39.anInt1027 = -1;
												return true;
											} else {
												local2697 = Static168.method2886(local127);
												local455.anInt4378 = local2697.anInt4207;
												local455.anInt4363 = 4;
												local455.anInt4353 = local2697.anInt4231;
												local455.anInt4362 = local127;
												local455.anInt4404 = local2697.anInt4244 * 100 / local131;
												Static199.method2199(local455);
											}
											Static39.anInt1027 = -1;
											return true;
										} else if (Static39.anInt1027 == 226) {
											local123 = Static192.aClass1_Sub7_Sub1_31.method2796();
											if (local123 == 65535) {
												local123 = -1;
											}
											local127 = Static192.aClass1_Sub7_Sub1_31.method2778();
											local892 = Static188.method3229(local127);
											if (local892.anInt4363 != 1 || local123 != local892.anInt4362) {
												local892.anInt4362 = local123;
												local892.anInt4363 = 1;
												Static199.method2199(local892);
											}
											Static39.anInt1027 = -1;
											return true;
										} else if (Static39.anInt1027 == 227) {
											Static78.aBoolean92 = true;
											Static181.anInt4043 = Static192.aClass1_Sub7_Sub1_31.method2771();
											Static197.anInt4423 = Static192.aClass1_Sub7_Sub1_31.method2771();
											Static134.anInt2973 = Static192.aClass1_Sub7_Sub1_31.method2765();
											Static55.anInt1377 = Static192.aClass1_Sub7_Sub1_31.method2771();
											Static186.anInt823 = Static192.aClass1_Sub7_Sub1_31.method2771();
											if (Static186.anInt823 >= 100) {
												Static92.anInt2140 = Static197.anInt4423 * 128 + 64;
												Static146.anInt3111 = Static181.anInt4043 * 128 + 64;
												Static32.anInt875 = Static37.method699(Static92.anInt2140, Static170.anInt3799, Static146.anInt3111) - Static134.anInt2973;
											}
											Static39.anInt1027 = -1;
											return true;
										} else {
											@Pc(2936) Class24 local2936;
											if (Static39.anInt1027 == 155) {
												local709 = Static192.aClass1_Sub7_Sub1_31.method2756();
												local131 = Static192.aClass1_Sub7_Sub1_31.method2765();
												local351 = Static192.aClass1_Sub7_Sub1_31.method2771();
												@Pc(2924) Class24 local2924 = Static85.aClass24_1000;
												if (local131 > 0) {
													local2924 = Static192.aClass1_Sub7_Sub1_31.method2761();
												}
												local2936 = Static35.method3219(local709).method761();
												for (local727 = 0; local727 < Static105.anInt2367; local727++) {
													if (local709 == Static145.aLongArray28[local727]) {
														if (Static34.anIntArray80[local727] != local131) {
															Static34.anIntArray80[local727] = local131;
															if (local131 > 0) {
																Static200.method3377(Static63.method1281(new Class24[] { local2936, Static81.aClass24_584 }), 5, Static85.aClass24_1000);
															}
															if (local131 == 0) {
																Static200.method3377(Static63.method1281(new Class24[] { local2936, Static106.aClass24_714 }), 5, Static85.aClass24_1000);
															}
														}
														local2936 = null;
														Static110.aClass24Array17[local727] = local2924;
														Static55.anIntArray119[local727] = local351;
														break;
													}
												}
												if (local2936 != null && Static105.anInt2367 < 200) {
													Static145.aLongArray28[Static105.anInt2367] = local709;
													Static152.aClass24Array22[Static105.anInt2367] = local2936;
													Static34.anIntArray80[Static105.anInt2367] = local131;
													Static110.aClass24Array17[Static105.anInt2367] = local2924;
													Static55.anIntArray119[Static105.anInt2367] = local351;
													Static105.anInt2367++;
												}
												Static127.anInt2781 = Static60.anInt3643;
												local2114 = Static105.anInt2367;
												while (local2114 > 0) {
													local2114--;
													local1171 = true;
													for (local1167 = 0; local1167 < local2114; local1167++) {
														if (Static162.anInt3573 != Static34.anIntArray80[local1167] && Static34.anIntArray80[local1167 + 1] == Static162.anInt3573 || Static34.anIntArray80[local1167] == 0 && Static34.anIntArray80[local1167 + 1] != 0) {
															local737 = Static34.anIntArray80[local1167];
															Static34.anIntArray80[local1167] = Static34.anIntArray80[local1167 + 1];
															local1171 = false;
															Static34.anIntArray80[local1167 + 1] = local737;
															local805 = Static110.aClass24Array17[local1167];
															Static110.aClass24Array17[local1167] = Static110.aClass24Array17[local1167 + 1];
															Static110.aClass24Array17[local1167 + 1] = local805;
															local2493 = Static152.aClass24Array22[local1167];
															Static152.aClass24Array22[local1167] = Static152.aClass24Array22[local1167 + 1];
															Static152.aClass24Array22[local1167 + 1] = local2493;
															@Pc(3156) long local3156 = Static145.aLongArray28[local1167];
															Static145.aLongArray28[local1167] = Static145.aLongArray28[local1167 + 1];
															Static145.aLongArray28[local1167 + 1] = local3156;
															@Pc(3174) int local3174 = Static55.anIntArray119[local1167];
															Static55.anIntArray119[local1167] = Static55.anIntArray119[local1167 + 1];
															Static55.anIntArray119[local1167 + 1] = local3174;
														}
													}
													if (local1171) {
														break;
													}
												}
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 219) {
												Static34.method663();
												Static39.anInt1027 = -1;
												return false;
											} else if (Static39.anInt1027 == 186) {
												local123 = Static192.aClass1_Sub7_Sub1_31.method2793();
												local127 = Static192.aClass1_Sub7_Sub1_31.method2765();
												if (local123 < -70000) {
													local127 += 32768;
												}
												if (local123 < 0) {
													local892 = null;
												} else {
													local892 = Static188.method3229(local123);
												}
												if (local892 != null) {
													for (local351 = 0; local351 < local892.anIntArray393.length; local351++) {
														local892.anIntArray393[local351] = 0;
														local892.anIntArray386[local351] = 0;
													}
												}
												Static9.method235(local127);
												local351 = Static192.aClass1_Sub7_Sub1_31.method2765();
												for (local355 = 0; local355 < local351; local355++) {
													local1267 = Static192.aClass1_Sub7_Sub1_31.method2765();
													local727 = Static192.aClass1_Sub7_Sub1_31.method2769();
													if (local727 == 255) {
														local727 = Static192.aClass1_Sub7_Sub1_31.method2784();
													}
													if (local892 != null && local355 < local892.anIntArray393.length) {
														local892.anIntArray393[local355] = local1267;
														local892.anIntArray386[local355] = local727;
													}
													Static1.method48(local355, local1267 - 1, local727, local127);
												}
												if (local892 != null) {
													Static199.method2199(local892);
												}
												Static163.method2736();
												Static56.anIntArray121[Static12.anInt304++ & 0x1F] = local127 & 0x7FFF;
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 43) {
												Static78.aBoolean92 = true;
												Static167.anInt3702 = Static192.aClass1_Sub7_Sub1_31.method2771();
												Static108.anInt2431 = Static192.aClass1_Sub7_Sub1_31.method2771();
												Static58.anInt1431 = Static192.aClass1_Sub7_Sub1_31.method2765();
												Static120.anInt2669 = Static192.aClass1_Sub7_Sub1_31.method2771();
												Static128.anInt2831 = Static192.aClass1_Sub7_Sub1_31.method2771();
												if (Static128.anInt2831 >= 100) {
													local123 = Static167.anInt3702 * 128 + 64;
													local127 = Static108.anInt2431 * 128 + 64;
													local131 = Static37.method699(local127, Static170.anInt3799, local123) - Static58.anInt1431;
													local1267 = local127 - Static92.anInt2140;
													local355 = local131 - Static32.anInt875;
													local351 = local123 - Static146.anInt3111;
													local727 = (int) Math.sqrt((double) (local1267 * local1267 + local351 * local351));
													Static175.anInt3914 = (int) (Math.atan2((double) local355, (double) local727) * 325.949D) & 0x7FF;
													Static35.anInt4158 = (int) (-325.949D * Math.atan2((double) local351, (double) local1267)) & 0x7FF;
													if (Static175.anInt3914 < 128) {
														Static175.anInt3914 = 128;
													}
													if (Static175.anInt3914 > 383) {
														Static175.anInt3914 = 383;
													}
												}
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 248) {
												local123 = Static192.aClass1_Sub7_Sub1_31.method2771();
												if (Static192.aClass1_Sub7_Sub1_31.method2771() == 0) {
													Static77.aClass88Array1[local123] = new Class88();
												} else {
													Static192.aClass1_Sub7_Sub1_31.anInt3592--;
													Static77.aClass88Array1[local123] = new Class88(Static192.aClass1_Sub7_Sub1_31);
												}
												Static39.anInt1027 = -1;
												Static137.anInt3101 = Static60.anInt3643;
												return true;
											} else if (Static39.anInt1027 == 151) {
												local709 = Static192.aClass1_Sub7_Sub1_31.method2756();
												Static192.aClass1_Sub7_Sub1_31.method2770();
												local716 = Static192.aClass1_Sub7_Sub1_31.method2756();
												local721 = Static192.aClass1_Sub7_Sub1_31.method2765();
												local2100 = Static192.aClass1_Sub7_Sub1_31.method2745();
												@Pc(3550) long local3550 = local2100 + (local721 << 32);
												local2114 = Static192.aClass1_Sub7_Sub1_31.method2771();
												local1167 = Static192.aClass1_Sub7_Sub1_31.method2765();
												@Pc(3562) boolean local3562 = false;
												for (local2137 = 0; local2137 < 100; local2137++) {
													if (Static147.aLongArray29[local2137] == local3550) {
														local3562 = true;
														break;
													}
												}
												if (local2114 <= 1) {
													for (@Pc(3589) int local3589 = 0; local3589 < Static34.anInt921; local3589++) {
														if (local709 == Static135.aLongArray25[local3589]) {
															local3562 = true;
															break;
														}
													}
												}
												if (!local3562 && Static204.anInt4555 == 0) {
													Static147.aLongArray29[Static149.anInt3340] = local3550;
													Static149.anInt3340 = (Static149.anInt3340 + 1) % 100;
													@Pc(3630) Class24 local3630 = Static58.method1105(local1167).method1039(Static192.aClass1_Sub7_Sub1_31);
													if (local2114 == 2 || local2114 == 3) {
														Static166.method2829(Static35.method3219(local716).method761(), Static63.method1281(new Class24[] { Static72.aClass24_531, Static35.method3219(local709).method761() }), 20, local3630, local1167);
													} else if (local2114 == 1) {
														Static166.method2829(Static35.method3219(local716).method761(), Static63.method1281(new Class24[] { Static150.aClass24_989, Static35.method3219(local709).method761() }), 20, local3630, local1167);
													} else {
														Static166.method2829(Static35.method3219(local716).method761(), Static35.method3219(local709).method761(), 20, local3630, local1167);
													}
												}
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 222) {
												Static34.anInt921 = Static80.anInt1916 / 8;
												for (local123 = 0; local123 < Static34.anInt921; local123++) {
													Static135.aLongArray25[local123] = Static192.aClass1_Sub7_Sub1_31.method2756();
													Static137.aClass24Array19[local123] = Static35.method3219(Static135.aLongArray25[local123]);
												}
												Static127.anInt2781 = Static60.anInt3643;
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 121) {
												anInt1667 = Static192.aClass1_Sub7_Sub1_31.method2769();
												Static145.anInt3266 = Static192.aClass1_Sub7_Sub1_31.method2769();
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 246) {
												local123 = Static192.aClass1_Sub7_Sub1_31.anInt3592 + Static80.anInt1916;
												local127 = Static192.aClass1_Sub7_Sub1_31.method2765();
												local131 = Static192.aClass1_Sub7_Sub1_31.method2765();
												if (local127 != Static177.anInt3924) {
													Static177.anInt3924 = local127;
													Static25.method509(Static177.anInt3924);
													Static15.method345();
													Static144.method2514(Static177.anInt3924);
													for (local351 = 0; local351 < 100; local351++) {
														Static62.aBooleanArray7[local351] = true;
													}
												}
												while (local131-- > 0) {
													local351 = Static192.aClass1_Sub7_Sub1_31.method2793();
													local355 = Static192.aClass1_Sub7_Sub1_31.method2765();
													local1267 = Static192.aClass1_Sub7_Sub1_31.method2771();
													@Pc(3835) Class1_Sub11 local3835 = (Class1_Sub11) Static115.aClass57_25.method1872((long) local351);
													if (local3835 != null && local355 != local3835.anInt2169) {
														Static66.method1316(local3835, true);
														local3835 = null;
													}
													if (local3835 == null) {
														local3835 = Static30.method580(local351, local1267, local355);
													}
													local3835.aBoolean105 = true;
												}
												for (local138 = (Class1_Sub11) Static115.aClass57_25.method1876(); local138 != null; local138 = (Class1_Sub11) Static115.aClass57_25.method1873()) {
													if (local138.aBoolean105) {
														local138.aBoolean105 = false;
													} else {
														Static66.method1316(local138, true);
													}
												}
												Static143.aClass57_32 = new Class57(512);
												while (local123 > Static192.aClass1_Sub7_Sub1_31.anInt3592) {
													local355 = Static192.aClass1_Sub7_Sub1_31.method2793();
													local1267 = Static192.aClass1_Sub7_Sub1_31.method2765();
													local727 = Static192.aClass1_Sub7_Sub1_31.method2765();
													local2424 = Static192.aClass1_Sub7_Sub1_31.method2793();
													for (local2114 = local1267; local2114 <= local727; local2114++) {
														local2106 = ((long) local355 << 32) + ((long) local2114);
														Static143.aClass57_32.method1874(new Class1_Sub24(local2424), local2106);
													}
												}
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 138) {
												local123 = Static192.aClass1_Sub7_Sub1_31.method2765();
												local127 = Static192.aClass1_Sub7_Sub1_31.method2765();
												Static66.anInt1655 = local127;
												Static57.anInt1425 = local123;
												Static61.method1192();
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 109) {
												Static163.method2736();
												local123 = Static192.aClass1_Sub7_Sub1_31.method2799();
												local127 = Static192.aClass1_Sub7_Sub1_31.method2793();
												local131 = Static192.aClass1_Sub7_Sub1_31.method2771();
												Static136.anIntArray251[local123] = local127;
												Static122.anIntArray212[local123] = local131;
												Static30.anIntArray75[local123] = 1;
												for (local351 = 0; local351 < 98; local351++) {
													if (Class1_Sub24.anIntArray382[local351] <= local127) {
														Static30.anIntArray75[local123] = local351 + 2;
													}
												}
												Static143.anIntArray269[Static210.anInt4650++ & 0x1F] = local123;
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 163) {
												local123 = Static192.aClass1_Sub7_Sub1_31.method2793();
												local127 = Static192.aClass1_Sub7_Sub1_31.method2796();
												Static10.anIntArray129[local127] = local123;
												if (Static122.anIntArray213[local127] != local123) {
													Static122.anIntArray213[local127] = local123;
													Static148.method2538(local127);
												}
												Static183.anIntArray357[Static72.anInt1722++ & 0x1F] = local127;
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 182) {
												local709 = Static192.aClass1_Sub7_Sub1_31.method2756();
												@Pc(4114) Class24 local4114 = Static51.method1264(Static12.method296(Static192.aClass1_Sub7_Sub1_31).method763());
												Static200.method3377(local4114, 6, Static35.method3219(local709).method761());
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 81) {
												local123 = Static192.aClass1_Sub7_Sub1_31.method2765();
												if (local123 == 65535) {
													local123 = -1;
												}
												local127 = Static192.aClass1_Sub7_Sub1_31.method2793();
												local892 = Static188.method3229(local127);
												if (local892.anInt4363 != 2 || local892.anInt4362 != local123) {
													local892.anInt4363 = 2;
													local892.anInt4362 = local123;
													Static199.method2199(local892);
												}
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 245) {
												Static150.anInt3361 = Static192.aClass1_Sub7_Sub1_31.method2794() * 30;
												Static165.anInt3678 = Static60.anInt3643;
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 23) {
												Static92.method1676(Static192.aClass1_Sub7_Sub1_31);
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 217) {
												local709 = Static192.aClass1_Sub7_Sub1_31.method2756();
												local1261 = false;
												if ((local709 & Long.MIN_VALUE) != 0L) {
													local1261 = true;
												}
												local131 = Static192.aClass1_Sub7_Sub1_31.method2765();
												@Pc(4226) byte local4226 = Static192.aClass1_Sub7_Sub1_31.method2770();
												if (local1261) {
													if (Static132.anInt2948 == 0) {
														Static39.anInt1027 = -1;
														return true;
													}
													local709 &= Long.MAX_VALUE;
													for (local1267 = 0; local1267 < Static132.anInt2948 && (Static25.aClass1_Sub27Array1[local1267].aLong149 != local709 || Static25.aClass1_Sub27Array1[local1267].anInt4574 != local131); local1267++) {
													}
													if (local1267 < Static132.anInt2948) {
														while (Static132.anInt2948 - 1 > local1267) {
															Static25.aClass1_Sub27Array1[local1267] = Static25.aClass1_Sub27Array1[local1267 + 1];
															local1267++;
														}
														Static132.anInt2948--;
														Static25.aClass1_Sub27Array1[Static132.anInt2948] = null;
													}
												} else {
													local2936 = Static192.aClass1_Sub7_Sub1_31.method2761();
													@Pc(4316) Class1_Sub27 local4316 = new Class1_Sub27();
													local4316.aLong149 = local709;
													local4316.aClass24_1296 = Static35.method3219(local4316.aLong149);
													local4316.anInt4574 = local131;
													local4316.aByte12 = local4226;
													local4316.aClass24_1295 = local2936;
													for (local2424 = Static132.anInt2948 - 1; local2424 >= 0; local2424--) {
														local2114 = Static25.aClass1_Sub27Array1[local2424].aClass24_1296.method756(local4316.aClass24_1296);
														if (local2114 == 0) {
															Static25.aClass1_Sub27Array1[local2424].anInt4574 = local131;
															Static25.aClass1_Sub27Array1[local2424].aByte12 = local4226;
															Static25.aClass1_Sub27Array1[local2424].aClass24_1295 = local2936;
															Static54.anInt3867 = Static60.anInt3643;
															if (local709 == Static91.aLong64) {
																Static156.aByte5 = local4226;
															}
															Static39.anInt1027 = -1;
															return true;
														}
														if (local2114 < 0) {
															break;
														}
													}
													if (Static25.aClass1_Sub27Array1.length <= Static132.anInt2948) {
														Static39.anInt1027 = -1;
														return true;
													}
													for (local2114 = Static132.anInt2948 - 1; local2114 > local2424; local2114--) {
														Static25.aClass1_Sub27Array1[local2114 + 1] = Static25.aClass1_Sub27Array1[local2114];
													}
													if (Static132.anInt2948 == 0) {
														Static25.aClass1_Sub27Array1 = new Class1_Sub27[100];
													}
													Static25.aClass1_Sub27Array1[local2424 + 1] = local4316;
													if (Static91.aLong64 == local709) {
														Static156.aByte5 = local4226;
													}
													Static132.anInt2948++;
												}
												Static54.anInt3867 = Static60.anInt3643;
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 63) {
												local123 = Static192.aClass1_Sub7_Sub1_31.method2778();
												local127 = Static192.aClass1_Sub7_Sub1_31.method2788();
												local131 = Static192.aClass1_Sub7_Sub1_31.method2798();
												local455 = Static188.method3229(local123);
												local455.anInt4358 = local455.anInt4421 = local131;
												local455.anInt4356 = local455.anInt4364 = local127;
												local455.aByte11 = 0;
												local455.aByte9 = 0;
												Static199.method2199(local455);
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 103) {
												local123 = Static192.aClass1_Sub7_Sub1_31.method2793();
												local127 = Static192.aClass1_Sub7_Sub1_31.method2765();
												if (local123 >= 0) {
													local892 = Static188.method3229(local123);
												} else {
													local892 = null;
												}
												if (local123 < -70000) {
													local127 += 32768;
												}
												while (Static80.anInt1916 > Static192.aClass1_Sub7_Sub1_31.anInt3592) {
													local351 = Static192.aClass1_Sub7_Sub1_31.method2795();
													local1267 = 0;
													local355 = Static192.aClass1_Sub7_Sub1_31.method2765();
													if (local355 != 0) {
														local1267 = Static192.aClass1_Sub7_Sub1_31.method2771();
														if (local1267 == 255) {
															local1267 = Static192.aClass1_Sub7_Sub1_31.method2793();
														}
													}
													if (local892 != null && local351 >= 0 && local892.anIntArray393.length > local351) {
														local892.anIntArray393[local351] = local355;
														local892.anIntArray386[local351] = local1267;
													}
													Static1.method48(local351, local355 - 1, local1267, local127);
												}
												if (local892 != null) {
													Static199.method2199(local892);
												}
												Static163.method2736();
												Static56.anIntArray121[Static12.anInt304++ & 0x1F] = local127 & 0x7FFF;
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 166) {
												Static212.method3583(false);
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 203) {
												if (Static177.anInt3924 != -1) {
													Static5.method108(Static177.anInt3924, 0);
												}
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 126) {
												@Pc(4655) byte local4655 = Static192.aClass1_Sub7_Sub1_31.method2800();
												local127 = Static192.aClass1_Sub7_Sub1_31.method2794();
												Static10.anIntArray129[local127] = local4655;
												if (local4655 != Static122.anIntArray213[local127]) {
													Static122.anIntArray213[local127] = local4655;
													Static148.method2538(local127);
												}
												Static183.anIntArray357[Static72.anInt1722++ & 0x1F] = local127;
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 41) {
												anInt1667 = Static192.aClass1_Sub7_Sub1_31.method2769();
												Static145.anInt3266 = Static192.aClass1_Sub7_Sub1_31.method2771();
												for (local123 = Static145.anInt3266; local123 < Static145.anInt3266 + 8; local123++) {
													for (local127 = anInt1667; local127 < anInt1667 + 8; local127++) {
														if (Static31.aClass87ArrayArrayArray1[Static170.anInt3799][local123][local127] != null) {
															Static31.aClass87ArrayArrayArray1[Static170.anInt3799][local123][local127] = null;
															Static37.method700(local123, local127);
														}
													}
												}
												for (@Pc(4755) Class1_Sub15 local4755 = (Class1_Sub15) Static185.aClass87_28.method2827(); local4755 != null; local4755 = (Class1_Sub15) Static185.aClass87_28.method2830()) {
													if (Static145.anInt3266 <= local4755.anInt2645 && Static145.anInt3266 + 8 > local4755.anInt2645 && local4755.anInt2653 >= anInt1667 && local4755.anInt2653 < anInt1667 + 8 && local4755.anInt2649 == Static170.anInt3799) {
														local4755.anInt2643 = 0;
													}
												}
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 216) {
												Static163.method2736();
												Static158.anInt3516 = Static192.aClass1_Sub7_Sub1_31.method2771();
												Static165.anInt3678 = Static60.anInt3643;
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 172) {
												local123 = Static192.aClass1_Sub7_Sub1_31.method2764();
												local972 = Static188.method3229(local123);
												local972.anInt4363 = 3;
												local972.anInt4362 = Static87.aClass5_Sub2_Sub1_1.aClass21_1.method636();
												Static199.method2199(local972);
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 136) {
												local123 = Static192.aClass1_Sub7_Sub1_31.method2777();
												local127 = Static192.aClass1_Sub7_Sub1_31.method2769();
												local131 = Static192.aClass1_Sub7_Sub1_31.method2777();
												Static170.anInt3799 = local123 >> 1;
												Static87.aClass5_Sub2_Sub1_1.method1889(local131, local127, (local123 & 0x1) == 1);
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 213) {
												local123 = Static192.aClass1_Sub7_Sub1_31.method2784();
												local127 = Static192.aClass1_Sub7_Sub1_31.method2794();
												local351 = local127 >> 5 & 0x1F;
												local131 = local127 >> 10 & 0x1F;
												local355 = local127 & 0x1F;
												local1267 = (local131 << 19) + (local351 << 11) + (local355 << 3);
												@Pc(4926) Class98 local4926 = Static188.method3229(local123);
												if (local4926.anInt4377 != local1267) {
													local4926.anInt4377 = local1267;
													Static199.method2199(local4926);
												}
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 30) {
												if (Static80.anInt1916 == 0) {
													Static107.aClass24_725 = Static86.aClass24_614;
												} else {
													Static107.aClass24_725 = Static192.aClass1_Sub7_Sub1_31.method2761();
												}
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 42) {
												local709 = Static192.aClass1_Sub7_Sub1_31.method2756();
												local131 = Static192.aClass1_Sub7_Sub1_31.method2765();
												@Pc(4982) Class24 local4982 = Static58.method1105(local131).method1039(Static192.aClass1_Sub7_Sub1_31);
												Static166.method2829(null, Static35.method3219(local709).method761(), 19, local4982, local131);
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 252) {
												local123 = Static192.aClass1_Sub7_Sub1_31.method2794();
												local127 = Static192.aClass1_Sub7_Sub1_31.method2793();
												local131 = Static192.aClass1_Sub7_Sub1_31.method2765();
												local351 = Static192.aClass1_Sub7_Sub1_31.method2794();
												local680 = Static188.method3229(local127);
												if (local680.anInt4353 != local131 || local351 != local680.anInt4378 || local680.anInt4404 != local123) {
													local680.anInt4378 = local351;
													local680.anInt4353 = local131;
													local680.anInt4404 = local123;
													Static199.method2199(local680);
												}
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 209) {
												Static103.anInt2308 = Static192.aClass1_Sub7_Sub1_31.method2771();
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 188) {
												Static163.method2736();
												Static65.anInt1650 = Static192.aClass1_Sub7_Sub1_31.method2779();
												Static165.anInt3678 = Static60.anInt3643;
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 187) {
												local123 = Static192.aClass1_Sub7_Sub1_31.method2778();
												local127 = Static192.aClass1_Sub7_Sub1_31.method2755();
												local892 = Static188.method3229(local123);
												if (local127 != local892.anInt4390 || local127 == -1) {
													local892.anInt4384 = 0;
													local892.anInt4390 = local127;
													local892.anInt4359 = 0;
													Static199.method2199(local892);
												}
												Static39.anInt1027 = -1;
												return true;
											} else if (Static39.anInt1027 == 49) {
												Static148.method2541();
												Static39.anInt1027 = -1;
												return true;
											} else {
												Static151.method2591("T1 - " + Static39.anInt1027 + "," + Static8.anInt202 + "," + Static178.anInt3968 + " - " + Static80.anInt1916, null);
												Static34.method663();
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

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "(B)V")
	public static void method1334() {
		if (Static42.aClass42_2 != null) {
			Static42.aClass42_2.method2413();
		}
		if (Static36.aClass42_1 != null) {
			Static36.aClass42_1.method2413();
		}
	}
}
