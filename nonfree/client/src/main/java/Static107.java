import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "Lclient!mb;")
	public static Class62 aClass62_818 = null;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_819 = Static151.method2243("gelb:");

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_820 = Static151.method2243("<col=ffffff>");

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray19 = new int[104][104];

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_821 = Static151.method2243("blaugr-Un:");

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
	public static void method1676() {
		if (Static184.anInt2028 > 0) {
			Static184.anInt2028--;
		}
		if (Static124.anInt2732 > 1) {
			Static44.anInt1005 = Static11.anInt305;
			Static124.anInt2732--;
		}
		if (Static43.aBoolean41) {
			Static43.aBoolean41 = false;
			Static156.method2312();
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < 100 && Static192.method2746(); local31++) {
		}
		if (Static87.anInt1821 != 30) {
			return;
		}
		Static164.method2407(Static58.aClass2_Sub11_Sub1_2);
		@Pc(53) Object local53 = Static28.aClass91_1.anObject4;
		@Pc(85) int local85;
		@Pc(82) int local82;
		@Pc(87) int local87;
		@Pc(104) int local104;
		@Pc(123) int local123;
		synchronized (Static28.aClass91_1.anObject4) {
			if (!Static85.aBoolean86) {
				Static28.aClass91_1.anInt3780 = 0;
			} else if (Static44.anInt998 != 0 || Static28.aClass91_1.anInt3780 >= 40) {
				Static58.aClass2_Sub11_Sub1_2.method1595(179);
				Static58.aClass2_Sub11_Sub1_2.method1565(0);
				local82 = 0;
				local85 = Static58.aClass2_Sub11_Sub1_2.anInt2235;
				for (local87 = 0; local87 < Static28.aClass91_1.anInt3780 && Static58.aClass2_Sub11_Sub1_2.anInt2235 - local85 < 240; local87++) {
					local82++;
					local104 = Static28.aClass91_1.anIntArray330[local87];
					if (local104 < 0) {
						local104 = 0;
					} else if (local104 > 502) {
						local104 = 502;
					}
					local123 = Static28.aClass91_1.anIntArray331[local87];
					if (local123 < 0) {
						local123 = 0;
					} else if (local123 > 764) {
						local123 = 764;
					}
					@Pc(143) int local143 = local123 + local104 * 765;
					if (Static28.aClass91_1.anIntArray330[local87] == -1 && Static28.aClass91_1.anIntArray331[local87] == -1) {
						local143 = 524287;
						local123 = -1;
						local104 = -1;
					}
					if (Static39.anInt4457 != local123 || Static40.anInt968 != local104) {
						@Pc(191) int local191 = local123 - Static39.anInt4457;
						@Pc(196) int local196 = local104 - Static40.anInt968;
						Static40.anInt968 = local104;
						Static39.anInt4457 = local123;
						if (Static126.anInt2801 < 8 && local191 >= -32 && local191 <= 31 && local196 >= -32 && local196 <= 31) {
							local191 += 32;
							local196 += 32;
							Static58.aClass2_Sub11_Sub1_2.method1533((local191 << 6) + (Static126.anInt2801 << 12) + local196);
							Static126.anInt2801 = 0;
						} else if (Static126.anInt2801 < 8) {
							Static58.aClass2_Sub11_Sub1_2.method1554(local143 + (Static126.anInt2801 << 19) + 8388608);
							Static126.anInt2801 = 0;
						} else {
							Static58.aClass2_Sub11_Sub1_2.method1544((Static126.anInt2801 << 19) + local143 - 1073741824);
							Static126.anInt2801 = 0;
						}
					} else if (Static126.anInt2801 < 2047) {
						Static126.anInt2801++;
					}
				}
				Static58.aClass2_Sub11_Sub1_2.method1549(Static58.aClass2_Sub11_Sub1_2.anInt2235 - local85);
				if (Static28.aClass91_1.anInt3780 <= local82) {
					Static28.aClass91_1.anInt3780 = 0;
				} else {
					Static28.aClass91_1.anInt3780 -= local82;
					for (local104 = 0; local104 < Static28.aClass91_1.anInt3780; local104++) {
						Static28.aClass91_1.anIntArray331[local104] = Static28.aClass91_1.anIntArray331[local104 + local82];
						Static28.aClass91_1.anIntArray330[local104] = Static28.aClass91_1.anIntArray330[local82 + local104];
					}
				}
			}
		}
		if (Static44.anInt998 != 0) {
			@Pc(363) long local363 = (Static92.aLong70 - Static28.aLong35) / 50L;
			local85 = Static170.anInt3634;
			if (local363 > 4095L) {
				local363 = 4095L;
			}
			if (local85 < 0) {
				local85 = 0;
			} else if (local85 > 502) {
				local85 = 502;
			}
			Static28.aLong35 = Static92.aLong70;
			local82 = Static43.anInt985;
			if (local82 < 0) {
				local82 = 0;
			} else if (local82 > 764) {
				local82 = 764;
			}
			local87 = local85 * 765 + local82;
			@Pc(416) byte local416 = 0;
			if (Static44.anInt998 == 2) {
				local416 = 1;
			}
			Static58.aClass2_Sub11_Sub1_2.method1595(40);
			local123 = (int) local363;
			Static58.aClass2_Sub11_Sub1_2.method1544((local416 << 19) + (local123 << 20) + local87);
		}
		if (Static171.anInt3663 > 0) {
			Static171.anInt3663--;
		}
		if (Static7.aBooleanArray15[96] || Static7.aBooleanArray15[97] || Static7.aBooleanArray15[98] || Static7.aBooleanArray15[99]) {
			Static124.aBoolean120 = true;
		}
		if (Static124.aBoolean120 && Static171.anInt3663 <= 0) {
			Static171.anInt3663 = 20;
			Static124.aBoolean120 = false;
			Static58.aClass2_Sub11_Sub1_2.method1595(144);
			Static58.aClass2_Sub11_Sub1_2.method1578(Static202.anInt4179);
			Static58.aClass2_Sub11_Sub1_2.method1559(Static203.anInt4219);
		}
		if (Static46.aBoolean47 && !Static25.aBoolean21) {
			Static25.aBoolean21 = true;
			Static58.aClass2_Sub11_Sub1_2.method1595(53);
			Static58.aClass2_Sub11_Sub1_2.method1565(1);
		}
		if (!Static46.aBoolean47 && Static25.aBoolean21) {
			Static25.aBoolean21 = false;
			Static58.aClass2_Sub11_Sub1_2.method1595(53);
			Static58.aClass2_Sub11_Sub1_2.method1565(0);
		}
		Static111.method1711();
		if (Static87.anInt1821 != 30) {
			return;
		}
		Static191.method2743();
		Static46.method722();
		Static58.anInt1152++;
		if (Static58.anInt1152 > 750) {
			Static156.method2312();
			return;
		}
		Static115.method1776();
		Static120.method1883();
		Static39.method3126();
		if (Static194.aClass47_15 != null) {
			Static116.method1787();
		}
		Static103.anInt2221++;
		if (Static134.anInt2872 != 0) {
			Static174.anInt3693 += 20;
			if (Static174.anInt3693 >= 400) {
				Static134.anInt2872 = 0;
			}
		}
		if (Static83.aClass47_7 != null) {
			Static197.anInt4088++;
			if (Static197.anInt4088 >= 15) {
				Static165.method2410(Static83.aClass47_7);
				Static83.aClass47_7 = null;
			}
		}
		@Pc(695) Class47 local695;
		if (Static13.aClass47_3 != null) {
			Static165.method2410(Static13.aClass47_3);
			Static157.anInt3330++;
			if (Static163.anInt3446 > Static112.anInt2449 + 5 || Static163.anInt3446 < Static112.anInt2449 - 5 || Static32.anInt773 > Static3.anInt136 + 5 || Static32.anInt773 < Static3.anInt136 - 5) {
				Static63.aBoolean56 = true;
			}
			if (Static55.anInt1137 == 0) {
				if (Static63.aBoolean56 && Static157.anInt3330 >= 5) {
					if (Static13.aClass47_3 == Static102.aClass47_10 && Static43.anInt983 != Static139.anInt2941) {
						local695 = Static13.aClass47_3;
						@Pc(697) byte local697 = 0;
						if (Static127.anInt2814 == 1 && local695.anInt1893 == 206) {
							local697 = 1;
						}
						if (local695.anIntArray169[Static43.anInt983] <= 0) {
							local697 = 0;
						}
						if (Static7.method1723(Static155.method2304(local695))) {
							local85 = Static139.anInt2941;
							local82 = Static43.anInt983;
							local695.anIntArray169[local82] = local695.anIntArray169[local85];
							local695.anIntArray166[local82] = local695.anIntArray166[local85];
							local695.anIntArray169[local85] = -1;
							local695.anIntArray166[local85] = 0;
						} else if (local697 == 1) {
							local82 = Static43.anInt983;
							local85 = Static139.anInt2941;
							while (local82 != local85) {
								if (local82 < local85) {
									local695.method1241(local85 - 1, local85);
									local85--;
								} else if (local82 > local85) {
									local695.method1241(local85 + 1, local85);
									local85++;
								}
							}
						} else {
							local695.method1241(Static43.anInt983, Static139.anInt2941);
						}
						Static58.aClass2_Sub11_Sub1_2.method1595(78);
						Static58.aClass2_Sub11_Sub1_2.method1559(Static43.anInt983);
						Static58.aClass2_Sub11_Sub1_2.method1570(Static13.aClass47_3.anInt1886);
						Static58.aClass2_Sub11_Sub1_2.method1533(Static139.anInt2941);
						Static58.aClass2_Sub11_Sub1_2.method1531(local697);
					}
				} else if ((Static13.anInt329 == 1 || Static92.method1393(Static51.anInt1111 - 1)) && Static51.anInt1111 > 2) {
					Static104.method1631();
				} else if (Static51.anInt1111 > 0) {
					Static22.method398(Static51.anInt1111 - 1);
				}
				Static197.anInt4088 = 10;
				Static13.aClass47_3 = null;
				Static44.anInt998 = 0;
			}
		}
		Static68.aClass47_5 = null;
		Static90.aBoolean5 = false;
		Static148.anInt3161 = 0;
		Static83.aBoolean81 = false;
		local695 = Static6.aClass47_1;
		@Pc(840) Class47 local840 = Static151.aClass47_13;
		Static151.aClass47_13 = null;
		Static6.aClass47_1 = null;
		while (Static77.method2464() && Static148.anInt3161 < 128) {
			Static27.anIntArray58[Static148.anInt3161] = Static172.anInt678;
			Static73.anIntArray126[Static148.anInt3161] = Static185.anInt3853;
			Static148.anInt3161++;
		}
		Static194.aClass47_15 = null;
		if (Static40.anInt969 != -1) {
			Static211.method3083(Static40.anInt969, 0, Static169.anInt3579, 0, Static42.anInt4285, 0, 0);
		}
		Static11.anInt305++;
		while (true) {
			@Pc(888) Class2_Sub13 local888;
			@Pc(904) Class47 local904;
			@Pc(893) Class47 local893;
			do {
				local888 = (Class2_Sub13) Static207.aClass13_20.method301();
				if (local888 == null) {
					while (true) {
						do {
							local888 = (Class2_Sub13) Static165.aClass13_12.method301();
							if (local888 == null) {
								while (true) {
									do {
										local888 = (Class2_Sub13) Static18.aClass13_1.method301();
										if (local888 == null) {
											if (Static133.aBoolean125 && Static194.aClass47_15 == null) {
												Static133.aBoolean125 = false;
											}
											if (Static13.aClass47_2 != null) {
												Static122.method1921();
											}
											if (Static127.anInt2807 != -1) {
												local82 = Static5.anInt170;
												local85 = Static127.anInt2807;
												@Pc(1070) boolean local1070 = Static33.method571(0, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], true, 0, 0, local85, 0, local82, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
												Static127.anInt2807 = -1;
												if (local1070) {
													Static113.anInt2471 = Static170.anInt3634;
													Static81.anInt4472 = Static43.anInt985;
													Static174.anInt3693 = 0;
													Static134.anInt2872 = 1;
												}
											}
											Static169.method2458();
											if (Static6.aClass47_1 != local695) {
												if (local695 != null) {
													Static165.method2410(local695);
												}
												if (Static6.aClass47_1 != null) {
													Static165.method2410(Static6.aClass47_1);
												}
											}
											if (Static151.aClass47_13 != local840 && Static186.anInt3867 == Static58.anInt1149) {
												if (local840 != null) {
													Static165.method2410(local840);
												}
												if (Static151.aClass47_13 != null) {
													Static165.method2410(Static151.aClass47_13);
												}
											}
											if (Static151.aClass47_13 == null) {
												if (Static58.anInt1149 > 0) {
													Static58.anInt1149--;
												}
											} else if (Static186.anInt3867 > Static58.anInt1149) {
												Static58.anInt1149++;
												if (Static186.anInt3867 == Static58.anInt1149) {
													Static165.method2410(Static151.aClass47_13);
												}
											}
											Static164.method2405();
											if (Static162.aBoolean147) {
												Static77.method2467();
											}
											for (local85 = 0; local85 < 5; local85++) {
												@Pc(1162) int local1162 = Static173.anIntArray317[local85]++;
											}
											local82 = Static170.method2502();
											local87 = Static145.method2187();
											if (local82 > 4500 && local87 > 4500) {
												Static184.anInt2028 = 250;
												Static80.method1133(4000);
												Static58.aClass2_Sub11_Sub1_2.method1595(130);
											}
											Static207.anInt4306++;
											Static209.anInt4379++;
											Static203.anInt4209++;
											if (Static207.anInt4306 > 500) {
												Static207.anInt4306 = 0;
												local104 = (int) (Math.random() * 8.0D);
												if ((local104 & 0x4) == 4) {
													Static39.anInt4448 += Static12.anInt314;
												}
												if ((local104 & 0x2) == 2) {
													Static128.anInt149 += Static193.anInt3996;
												}
												if ((local104 & 0x1) == 1) {
													Static196.anInt4044 += Static206.anInt404;
												}
											}
											if (Static203.anInt4209 > 500) {
												Static203.anInt4209 = 0;
												local104 = (int) (Math.random() * 8.0D);
												if ((local104 & 0x1) == 1) {
													Static151.anInt3204 += Static82.anInt1733;
												}
												if ((local104 & 0x2) == 2) {
													Static206.anInt397 += Static195.anInt4031;
												}
											}
											if (Static39.anInt4448 < -40) {
												Static12.anInt314 = 1;
											}
											if (Static151.anInt3204 < -60) {
												Static82.anInt1733 = 2;
											}
											if (Static128.anInt149 < -55) {
												Static193.anInt3996 = 2;
											}
											if (Static128.anInt149 > 55) {
												Static193.anInt3996 = -2;
											}
											if (Static151.anInt3204 > 60) {
												Static82.anInt1733 = -2;
											}
											if (Static206.anInt397 < -20) {
												Static195.anInt4031 = 1;
											}
											if (Static39.anInt4448 > 40) {
												Static12.anInt314 = -1;
											}
											if (Static196.anInt4044 < -50) {
												Static206.anInt404 = 2;
											}
											if (Static196.anInt4044 > 50) {
												Static206.anInt404 = -2;
											}
											if (Static206.anInt397 > 10) {
												Static195.anInt4031 = -1;
											}
											if (Static209.anInt4379 > 50) {
												Static58.aClass2_Sub11_Sub1_2.method1595(34);
											}
											try {
												if (Static151.aClass36_3 != null && Static58.aClass2_Sub11_Sub1_2.anInt2235 > 0) {
													Static151.aClass36_3.method858(Static58.aClass2_Sub11_Sub1_2.aByteArray26, Static58.aClass2_Sub11_Sub1_2.anInt2235);
													Static209.anInt4379 = 0;
													Static58.aClass2_Sub11_Sub1_2.anInt2235 = 0;
													return;
												}
												return;
											} catch (@Pc(1369) IOException local1369) {
												Static156.method2312();
												return;
											}
										}
										local893 = local888.aClass47_12;
										if (local893.anInt1860 < 0) {
											break;
										}
										local904 = Static143.method2159(local893.anInt1877);
									} while (local904 == null || local904.aClass47Array1 == null || local904.aClass47Array1.length <= local893.anInt1860 || local904.aClass47Array1[local893.anInt1860] != local893);
									Static140.method2145(local888);
								}
							}
							local893 = local888.aClass47_12;
							if (local893.anInt1860 < 0) {
								break;
							}
							local904 = Static143.method2159(local893.anInt1877);
						} while (local904 == null || local904.aClass47Array1 == null || local904.aClass47Array1.length <= local893.anInt1860 || local904.aClass47Array1[local893.anInt1860] != local893);
						Static140.method2145(local888);
					}
				}
				local893 = local888.aClass47_12;
				if (local893.anInt1860 < 0) {
					break;
				}
				local904 = Static143.method2159(local893.anInt1877);
			} while (local904 == null || local904.aClass47Array1 == null || local893.anInt1860 >= local904.aClass47Array1.length || local893 != local904.aClass47Array1[local893.anInt1860]);
			Static140.method2145(local888);
		}
	}
}
