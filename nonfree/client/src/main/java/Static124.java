import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!vd", name = "fd", descriptor = "I")
	public static int anInt2736;

	@OriginalMember(owner = "client!vd", name = "sd", descriptor = "Lclient!g;")
	public static Class26 aClass26_31;

	@OriginalMember(owner = "client!vd", name = "Sc", descriptor = "Lclient!u;")
	public static Class74 aClass74_1660 = Static72.method1077("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!vd", name = "Xc", descriptor = "I")
	public static int anInt2729 = 0;

	@OriginalMember(owner = "client!vd", name = "ad", descriptor = "Lclient!u;")
	public static Class74 aClass74_1662 = Static72.method1077(" )2> @lre@");

	@OriginalMember(owner = "client!vd", name = "jd", descriptor = "I")
	public static int anInt2739 = 0;

	@OriginalMember(owner = "client!vd", name = "md", descriptor = "Lclient!u;")
	private static Class74 aClass74_1663 = Static72.method1077("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!vd", name = "pd", descriptor = "Lclient!u;")
	public static Class74 aClass74_1664 = Static72.method1077(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!vd", name = "ud", descriptor = "Z")
	public static volatile boolean aBoolean118 = false;

	@OriginalMember(owner = "client!vd", name = "xd", descriptor = "Lclient!u;")
	public static Class74 aClass74_1665 = aClass74_1663;

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "(I)V")
	public static void method1869() {
		if (Static40.anInt960 == 0 && !Static6.aBoolean7) {
			Static79.method1250(Static62.anInt1414, Static46.anInt1062, Static97.aClass74_1736, Static83.aClass74_1237, 0, 35);
		}
		@Pc(31) int local31 = -1;
		for (@Pc(33) int local33 = 0; local33 < Static76.anInt1635; local33++) {
			@Pc(39) int local39 = Static76.anIntArray235[local33];
			@Pc(43) int local43 = local39 & 0x7F;
			@Pc(49) int local49 = local39 >> 14 & 0x7FFF;
			@Pc(55) int local55 = local39 >> 7 & 0x7F;
			@Pc(61) int local61 = local39 >> 29 & 0x3;
			if (local31 != local39) {
				local31 = local39;
				@Pc(122) int local122;
				if (local61 == 2 && Static84.aClass69_1.method1617(Static117.anInt2529, local43, local55, local39) >= 0) {
					@Pc(87) Class2_Sub2_Sub14 local87 = Static2.method19(local49);
					if (local87.anIntArray318 != null) {
						local87 = local87.method1558();
					}
					if (local87 == null) {
						continue;
					}
					if (Static40.anInt960 == 1) {
						Static79.method1250(local55, local43, Static91.method1340(new Class74[] { Static121.aClass74_1619, Static77.aClass74_1150, local87.aClass74_1461 }), Static92.aClass74_1315, local39, 10);
					} else if (!Static6.aBoolean7) {
						@Pc(108) Class74[] local108 = local87.aClass74Array16;
						if (Static1.aBoolean85) {
							local108 = Static12.method276(local108);
						}
						if (local108 != null) {
							for (local122 = 4; local122 >= 0; local122--) {
								if (local108[local122] != null) {
									@Pc(134) short local134 = 0;
									if (local122 == 0) {
										local134 = 54;
									}
									if (local122 == 1) {
										local134 = 42;
									}
									if (local122 == 2) {
										local134 = 28;
									}
									if (local122 == 3) {
										local134 = 24;
									}
									if (local122 == 4) {
										local134 = 1005;
									}
									Static79.method1250(local55, local43, Static91.method1340(new Class74[] { Static110.aClass74_1532, local87.aClass74_1461 }), local108[local122], local39, local134);
								}
							}
						}
						Static79.method1250(local55, local43, Static91.method1340(new Class74[] { Static110.aClass74_1532, local87.aClass74_1461 }), Static2.aClass74_27, local87.anInt2267 << 14, 1001);
					} else if ((Static65.anInt1451 & 0x4) == 4) {
						Static79.method1250(local55, local43, Static91.method1340(new Class74[] { Static4.aClass74_41, Static77.aClass74_1150, local87.aClass74_1461 }), Static25.aClass74_526, local39, 33);
					}
				}
				@Pc(321) int local321;
				@Pc(329) Class2_Sub2_Sub2_Sub1_Sub1 local329;
				@Pc(378) Class2_Sub2_Sub2_Sub1_Sub2 local378;
				if (local61 == 1) {
					@Pc(296) Class2_Sub2_Sub2_Sub1_Sub1 local296 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[local49];
					if (local296.aClass2_Sub2_Sub9_1.anInt1103 == 1 && (local296.anInt2673 & 0x7F) == 64 && (local296.anInt2672 & 0x7F) == 64) {
						for (local321 = 0; local321 < Static29.anInt686; local321++) {
							local329 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[Static40.anIntArray110[local321]];
							if (local329 != null && local329 != local296 && local329.aClass2_Sub2_Sub9_1.anInt1103 == 1 && local329.anInt2673 == local296.anInt2673 && local296.anInt2672 == local329.anInt2672) {
								Static50.method808(local329.aClass2_Sub2_Sub9_1, local55, Static40.anIntArray110[local321], local43);
							}
						}
						for (local122 = 0; local122 < Static10.anInt320; local122++) {
							local378 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[Static92.anIntArray267[local122]];
							if (local378 != null && local296.anInt2673 == local378.anInt2673 && local378.anInt2672 == local296.anInt2672) {
								Static95.method1443(local378, local55, local43, Static92.anIntArray267[local122]);
							}
						}
					}
					Static50.method808(local296.aClass2_Sub2_Sub9_1, local55, local49, local43);
				}
				if (local61 == 0) {
					@Pc(428) Class2_Sub2_Sub2_Sub1_Sub2 local428 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local49];
					if ((local428.anInt2673 & 0x7F) == 64 && (local428.anInt2672 & 0x7F) == 64) {
						for (local321 = 0; local321 < Static29.anInt686; local321++) {
							local329 = Static80.aClass2_Sub2_Sub2_Sub1_Sub1Array1[Static40.anIntArray110[local321]];
							if (local329 != null && local329.aClass2_Sub2_Sub9_1.anInt1103 == 1 && local428.anInt2673 == local329.anInt2673 && local428.anInt2672 == local329.anInt2672) {
								Static50.method808(local329.aClass2_Sub2_Sub9_1, local55, Static40.anIntArray110[local321], local43);
							}
						}
						for (local122 = 0; local122 < Static10.anInt320; local122++) {
							local378 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[Static92.anIntArray267[local122]];
							if (local378 != null && local428 != local378 && local378.anInt2673 == local428.anInt2673 && local378.anInt2672 == local428.anInt2672) {
								Static95.method1443(local378, local55, local43, Static92.anIntArray267[local122]);
							}
						}
					}
					Static95.method1443(local428, local55, local43, local49);
				}
				if (local61 == 3) {
					@Pc(556) Class13 local556 = Static41.aClass13ArrayArrayArray1[Static117.anInt2529][local43][local55];
					if (local556 != null) {
						for (@Pc(563) Class2_Sub2_Sub2_Sub6 local563 = (Class2_Sub2_Sub2_Sub6) local556.method424(); local563 != null; local563 = (Class2_Sub2_Sub2_Sub6) local556.method425()) {
							@Pc(572) Class2_Sub2_Sub12 local572 = Static35.method1934(local563.anInt1889);
							if (Static40.anInt960 == 1) {
								Static79.method1250(local55, local43, Static91.method1340(new Class74[] { Static121.aClass74_1619, aClass74_1662, local572.aClass74_1184 }), Static92.aClass74_1315, local563.anInt1889, 6);
							} else if (!Static6.aBoolean7) {
								@Pc(584) Class74[] local584 = local572.aClass74Array11;
								if (Static1.aBoolean85) {
									local584 = Static12.method276(local584);
								}
								for (@Pc(592) int local592 = 4; local592 >= 0; local592--) {
									if (local584 != null && local584[local592] != null) {
										@Pc(634) byte local634 = 0;
										if (local592 == 0) {
											local634 = 11;
										}
										if (local592 == 1) {
											local634 = 37;
										}
										if (local592 == 2) {
											local634 = 15;
										}
										if (local592 == 3) {
											local634 = 27;
										}
										if (local592 == 4) {
											local634 = 40;
										}
										Static79.method1250(local55, local43, Static91.method1340(new Class74[] { Static55.aClass74_432, local572.aClass74_1184 }), local584[local592], local563.anInt1889, local634);
									} else if (local592 == 2) {
										Static79.method1250(local55, local43, Static91.method1340(new Class74[] { Static55.aClass74_432, local572.aClass74_1184 }), Static105.aClass74_1489, local563.anInt1889, 15);
									}
								}
								Static79.method1250(local55, local43, Static91.method1340(new Class74[] { Static55.aClass74_432, local572.aClass74_1184 }), Static2.aClass74_27, local563.anInt1889, 1003);
							} else if ((Static65.anInt1451 & 0x1) == 1) {
								Static79.method1250(local55, local43, Static91.method1340(new Class74[] { Static4.aClass74_41, aClass74_1662, local572.aClass74_1184 }), Static25.aClass74_526, local563.anInt1889, 48);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "(I)V")
	public static void method1870() {
		@Pc(10) int local10 = Static19.aClass2_Sub10_Sub1_1.method1538(8);
		@Pc(19) int local19;
		if (local10 < Static10.anInt320) {
			for (local19 = local10; local19 < Static10.anInt320; local19++) {
				Static85.anIntArray257[Static17.anInt548++] = Static92.anIntArray267[local19];
			}
		}
		if (Static10.anInt320 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static10.anInt320 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(61) int local61 = Static92.anIntArray267[local19];
			@Pc(65) Class2_Sub2_Sub2_Sub1_Sub2 local65 = Static112.aClass2_Sub2_Sub2_Sub1_Sub2Array1[local61];
			@Pc(70) int local70 = Static19.aClass2_Sub10_Sub1_1.method1538(1);
			if (local70 == 0) {
				Static92.anIntArray267[Static10.anInt320++] = local61;
				local65.anInt2681 = Static107.anInt2338;
			} else {
				@Pc(90) int local90 = Static19.aClass2_Sub10_Sub1_1.method1538(2);
				if (local90 == 0) {
					Static92.anIntArray267[Static10.anInt320++] = local61;
					local65.anInt2681 = Static107.anInt2338;
					Static81.anIntArray255[Static107.anInt2342++] = local61;
				} else {
					@Pc(132) int local132;
					@Pc(142) int local142;
					if (local90 == 1) {
						Static92.anIntArray267[Static10.anInt320++] = local61;
						local65.anInt2681 = Static107.anInt2338;
						local132 = Static19.aClass2_Sub10_Sub1_1.method1538(3);
						local65.method1863(local132, false);
						local142 = Static19.aClass2_Sub10_Sub1_1.method1538(1);
						if (local142 == 1) {
							Static81.anIntArray255[Static107.anInt2342++] = local61;
						}
					} else if (local90 == 2) {
						Static92.anIntArray267[Static10.anInt320++] = local61;
						local65.anInt2681 = Static107.anInt2338;
						local132 = Static19.aClass2_Sub10_Sub1_1.method1538(3);
						local65.method1863(local132, true);
						local142 = Static19.aClass2_Sub10_Sub1_1.method1538(3);
						local65.method1863(local142, true);
						@Pc(196) int local196 = Static19.aClass2_Sub10_Sub1_1.method1538(1);
						if (local196 == 1) {
							Static81.anIntArray255[Static107.anInt2342++] = local61;
						}
					} else if (local90 == 3) {
						Static85.anIntArray257[Static17.anInt548++] = local61;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)I")
	public static int method1871(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local10 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local10 += 8;
		}
		if (arg0 >= 16) {
			local10 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local10 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local10++;
		}
		return arg0 + local10;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V")
	public static void method1872() {
		aClass74_1663 = null;
		aClass74_1660 = null;
		aClass26_31 = null;
		aClass74_1664 = null;
		aClass74_1665 = null;
		aClass74_1662 = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IILclient!g;I)Lclient!bc;")
	public static Class2_Sub2_Sub1_Sub2 method1873(@OriginalArg(0) int arg0, @OriginalArg(2) Class26 arg1, @OriginalArg(3) int arg2) {
		return Static65.method1010(arg1, arg0, arg2) ? Static5.method32() : null;
	}

	@OriginalMember(owner = "client!vd", name = "k", descriptor = "(I)V")
	public static void method1874() {
		if (Static88.aClass62_4 != null) {
			Static88.aClass62_4.method1347();
			Static88.aClass62_4 = null;
		}
		Static71.method1076();
		Static84.aClass69_1.method1636();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static50.aClass55Array1[local18].method1282();
		}
		System.gc();
		Static16.method358();
		Static64.anInt1437 = -1;
		Static57.aBoolean52 = false;
		Static65.method1009();
		Static106.method1597(10);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)I")
	public static int method1875(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) / 128;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBILclient!pe;ZII)V")
	public static void method1876(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class26_Sub1 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5) {
		@Pc(15) long local15 = (long) (arg2 + (arg5 << 16));
		@Pc(23) Class2_Sub2_Sub15 local23 = (Class2_Sub2_Sub15) Static35.aClass58_69.method1307(local15);
		if (local23 != null) {
			return;
		}
		local23 = (Class2_Sub2_Sub15) Static33.aClass58_24.method1307(local15);
		if (local23 != null) {
			return;
		}
		local23 = (Class2_Sub2_Sub15) Static109.aClass58_60.method1307(local15);
		if (local23 == null) {
			if (!arg4) {
				local23 = (Class2_Sub2_Sub15) Static25.aClass58_21.method1307(local15);
				if (local23 != null) {
					return;
				}
			}
			local23 = new Class2_Sub2_Sub15();
			local23.aByte4 = arg1;
			local23.aClass26_Sub1_65 = arg3;
			local23.anInt2396 = arg0;
			if (arg4) {
				Static35.aClass58_69.method1301(local15, local23);
				Static68.anInt1493++;
			} else {
				Static84.aClass56_2.method1287(local23);
				Static109.aClass58_60.method1301(local15, local23);
				Static67.anInt1476++;
			}
		} else if (arg4) {
			local23.method1935();
			Static35.aClass58_69.method1301(local15, local23);
			Static68.anInt1493++;
			Static67.anInt1476--;
		}
	}
}
