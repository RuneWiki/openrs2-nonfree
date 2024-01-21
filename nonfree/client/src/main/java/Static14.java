import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!cc", name = "Gb", descriptor = "Lclient!wc;")
	public static Class4 aClass4_13;

	@OriginalMember(owner = "client!cc", name = "zb", descriptor = "Lclient!pb;")
	public static Class46 aClass46_3 = new Class46();

	@OriginalMember(owner = "client!cc", name = "Eb", descriptor = "Lclient!a;")
	private static Class1 aClass1_649 = Static94.method1596("To");

	@OriginalMember(owner = "client!cc", name = "Fb", descriptor = "Lclient!a;")
	public static Class1 aClass1_650 = aClass1_649;

	@OriginalMember(owner = "client!cc", name = "Hb", descriptor = "I")
	public static int anInt680 = 0;

	@OriginalMember(owner = "client!cc", name = "Ib", descriptor = "Lclient!a;")
	public static Class1 aClass1_651 = Static94.method1596(" )2> @cya@");

	@OriginalMember(owner = "client!cc", name = "Jb", descriptor = "I")
	public static int anInt681 = 0;

	@OriginalMember(owner = "client!cc", name = "Kb", descriptor = "Lclient!a;")
	public static Class1 aClass1_652 = Static94.method1596("Lade Ignorieren)2Liste)3)3)3");

	@OriginalMember(owner = "client!cc", name = "Lb", descriptor = "I")
	public static int anInt682 = 0;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)V")
	public static void method447() {
		aClass1_652 = null;
		aClass1_651 = null;
		aClass1_649 = null;
		aClass1_650 = null;
		aClass4_13 = null;
		aClass46_3 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ad;IIIILclient!ab;IIII)V")
	public static void method448(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class3 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(13) int local13 = Static50.anIntArrayArrayArray7[arg2][arg8][arg7];
		@Pc(23) int local23 = Static50.anIntArrayArrayArray7[arg2][arg8 + 1][arg7];
		@Pc(33) int local33 = Static50.anIntArrayArrayArray7[arg2][arg8][arg7 + 1];
		@Pc(45) int local45 = Static50.anIntArrayArrayArray7[arg2][arg8 + 1][arg7 + 1];
		@Pc(49) Class2_Sub1_Sub10 local49 = Static28.method739(arg1);
		@Pc(59) int local59 = local45 + local23 + local13 + local33 >> 2;
		@Pc(65) int local65 = (arg6 << 6) + arg4;
		@Pc(78) int local78 = arg8 + (arg7 << 7) + (arg1 << 14) + 1073741824;
		if (local49.anInt1508 == 0) {
			local78 += Integer.MIN_VALUE;
		}
		if (local49.anInt1498 == 1) {
			local65 += 256;
		}
		@Pc(119) Class2_Sub1_Sub1 local119;
		if (arg4 == 22) {
			if (local49.anInt1484 == -1 && local49.anIntArray154 == null) {
				local119 = local49.method1007(local45, local33, arg6, local13, 22, local23);
			} else {
				local119 = new Class2_Sub1_Sub1_Sub3(arg1, 22, arg6, local13, local23, local45, local33, local49.anInt1484, true);
			}
			arg5.method164(arg3, arg8, arg7, local59, local119, local78, local65);
			if (local49.aBoolean75 && local49.anInt1508 == 1) {
				arg0.method203(arg7, arg8);
			}
			return;
		}
		@Pc(208) int local208;
		if (arg4 == 10 || arg4 == 11) {
			if (local49.anInt1484 == -1 && local49.anIntArray154 == null) {
				local119 = local49.method1007(local45, local33, arg6, local13, 10, local23);
			} else {
				local119 = new Class2_Sub1_Sub1_Sub3(arg1, 10, arg6, local13, local23, local45, local33, local49.anInt1484, true);
			}
			if (local119 != null) {
				@Pc(211) int local211;
				if (arg6 == 1 || arg6 == 3) {
					local211 = local49.anInt1481;
					local208 = local49.anInt1491;
				} else {
					local208 = local49.anInt1481;
					local211 = local49.anInt1491;
				}
				@Pc(221) int local221 = 0;
				if (arg4 == 11) {
					local221 += 256;
				}
				arg5.method169(arg3, arg8, arg7, local59, local208, local211, local119, local221, local78, local65);
			}
			if (local49.aBoolean75) {
				arg0.method206(arg8, local49.aBoolean79, local49.anInt1491, arg6, arg7, local49.anInt1481);
			}
		} else if (arg4 >= 12) {
			if (local49.anInt1484 == -1 && local49.anIntArray154 == null) {
				local119 = local49.method1007(local45, local33, arg6, local13, arg4, local23);
			} else {
				local119 = new Class2_Sub1_Sub1_Sub3(arg1, arg4, arg6, local13, local23, local45, local33, local49.anInt1484, true);
			}
			arg5.method169(arg3, arg8, arg7, local59, 1, 1, local119, 0, local78, local65);
			if (local49.aBoolean75) {
				arg0.method206(arg8, local49.aBoolean79, local49.anInt1491, arg6, arg7, local49.anInt1481);
			}
		} else if (arg4 == 0) {
			if (local49.anInt1484 == -1 && local49.anIntArray154 == null) {
				local119 = local49.method1007(local45, local33, arg6, local13, 0, local23);
			} else {
				local119 = new Class2_Sub1_Sub1_Sub3(arg1, 0, arg6, local13, local23, local45, local33, local49.anInt1484, true);
			}
			arg5.method126(arg3, arg8, arg7, local59, local119, null, Static59.anIntArray194[arg6], 0, local78, local65);
			if (local49.aBoolean75) {
				arg0.method202(arg7, arg4, arg6, arg8, local49.aBoolean79);
			}
		} else if (arg4 == 1) {
			if (local49.anInt1484 == -1 && local49.anIntArray154 == null) {
				local119 = local49.method1007(local45, local33, arg6, local13, 1, local23);
			} else {
				local119 = new Class2_Sub1_Sub1_Sub3(arg1, 1, arg6, local13, local23, local45, local33, local49.anInt1484, true);
			}
			arg5.method126(arg3, arg8, arg7, local59, local119, null, Static95.anIntArray298[arg6], 0, local78, local65);
			if (local49.aBoolean75) {
				arg0.method202(arg7, arg4, arg6, arg8, local49.aBoolean79);
			}
		} else {
			@Pc(464) int local464;
			@Pc(502) Class2_Sub1_Sub1 local502;
			if (arg4 == 2) {
				local464 = arg6 + 1 & 0x3;
				@Pc(488) Class2_Sub1_Sub1 local488;
				if (local49.anInt1484 == -1 && local49.anIntArray154 == null) {
					local488 = local49.method1007(local45, local33, arg6 + 4, local13, 2, local23);
					local502 = local49.method1007(local45, local33, local464, local13, 2, local23);
				} else {
					local488 = new Class2_Sub1_Sub1_Sub3(arg1, 2, arg6 + 4, local13, local23, local45, local33, local49.anInt1484, true);
					local502 = new Class2_Sub1_Sub1_Sub3(arg1, 2, local464, local13, local23, local45, local33, local49.anInt1484, true);
				}
				arg5.method126(arg3, arg8, arg7, local59, local488, local502, Static59.anIntArray194[arg6], Static59.anIntArray194[local464], local78, local65);
				if (local49.aBoolean75) {
					arg0.method202(arg7, arg4, arg6, arg8, local49.aBoolean79);
				}
			} else if (arg4 == 3) {
				if (local49.anInt1484 == -1 && local49.anIntArray154 == null) {
					local119 = local49.method1007(local45, local33, arg6, local13, 3, local23);
				} else {
					local119 = new Class2_Sub1_Sub1_Sub3(arg1, 3, arg6, local13, local23, local45, local33, local49.anInt1484, true);
				}
				arg5.method126(arg3, arg8, arg7, local59, local119, null, Static95.anIntArray298[arg6], 0, local78, local65);
				if (local49.aBoolean75) {
					arg0.method202(arg7, arg4, arg6, arg8, local49.aBoolean79);
				}
			} else if (arg4 == 9) {
				if (local49.anInt1484 == -1 && local49.anIntArray154 == null) {
					local119 = local49.method1007(local45, local33, arg6, local13, arg4, local23);
				} else {
					local119 = new Class2_Sub1_Sub1_Sub3(arg1, arg4, arg6, local13, local23, local45, local33, local49.anInt1484, true);
				}
				arg5.method169(arg3, arg8, arg7, local59, 1, 1, local119, 0, local78, local65);
				if (local49.aBoolean75) {
					arg0.method206(arg8, local49.aBoolean79, local49.anInt1491, arg6, arg7, local49.anInt1481);
				}
			} else {
				if (local49.aBoolean80) {
					if (arg6 == 1) {
						local464 = local33;
						local33 = local45;
						local45 = local23;
						local23 = local13;
						local13 = local464;
					} else if (arg6 == 2) {
						local464 = local33;
						local33 = local23;
						local23 = local464;
						local464 = local45;
						local45 = local13;
						local13 = local464;
					} else if (arg6 == 3) {
						local464 = local33;
						local33 = local13;
						local13 = local23;
						local23 = local45;
						local45 = local464;
					}
				}
				if (arg4 == 4) {
					if (local49.anInt1484 == -1 && local49.anIntArray154 == null) {
						local119 = local49.method1007(local45, local33, 0, local13, 4, local23);
					} else {
						local119 = new Class2_Sub1_Sub1_Sub3(arg1, 4, 0, local13, local23, local45, local33, local49.anInt1484, true);
					}
					arg5.method141(arg3, arg8, arg7, local59, local119, Static59.anIntArray194[arg6], arg6 * 512, 0, 0, local78, local65);
				} else if (arg4 == 5) {
					local464 = 16;
					local208 = arg5.method154(arg3, arg8, arg7);
					if (local208 > 0) {
						local464 = Static28.method739(local208 >> 14 & 0x7FFF).anInt1483;
					}
					if (local49.anInt1484 == -1 && local49.anIntArray154 == null) {
						local502 = local49.method1007(local45, local33, 0, local13, 4, local23);
					} else {
						local502 = new Class2_Sub1_Sub1_Sub3(arg1, 4, 0, local13, local23, local45, local33, local49.anInt1484, true);
					}
					arg5.method141(arg3, arg8, arg7, local59, local502, Static59.anIntArray194[arg6], arg6 * 512, Static54.anIntArray182[arg6] * local464, Static4.anIntArray41[arg6] * local464, local78, local65);
				} else if (arg4 == 6) {
					if (local49.anInt1484 == -1 && local49.anIntArray154 == null) {
						local119 = local49.method1007(local45, local33, 0, local13, 4, local23);
					} else {
						local119 = new Class2_Sub1_Sub1_Sub3(arg1, 4, 0, local13, local23, local45, local33, local49.anInt1484, true);
					}
					arg5.method141(arg3, arg8, arg7, local59, local119, 256, arg6, 0, 0, local78, local65);
				} else if (arg4 == 7) {
					if (local49.anInt1484 == -1 && local49.anIntArray154 == null) {
						local119 = local49.method1007(local45, local33, 0, local13, 4, local23);
					} else {
						local119 = new Class2_Sub1_Sub1_Sub3(arg1, 4, 0, local13, local23, local45, local33, local49.anInt1484, true);
					}
					arg5.method141(arg3, arg8, arg7, local59, local119, 512, arg6, 0, 0, local78, local65);
				} else if (arg4 == 8) {
					if (local49.anInt1484 == -1 && local49.anIntArray154 == null) {
						local119 = local49.method1007(local45, local33, 0, local13, 4, local23);
					} else {
						local119 = new Class2_Sub1_Sub1_Sub3(arg1, 4, 0, local13, local23, local45, local33, local49.anInt1484, true);
					}
					arg5.method141(arg3, arg8, arg7, local59, local119, 768, arg6, 0, 0, local78, local65);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
	public static void method449() {
		if (Static103.anInt2617 != 1) {
			return;
		}
		if (Static93.anInt2360 >= 6 && Static93.anInt2360 <= 106 && Static1.anInt13 >= 467 && Static1.anInt13 <= 499) {
			Static13.aBoolean20 = true;
			Static63.anInt1889 = (Static63.anInt1889 + 1) % 4;
			Static87.aBoolean137 = true;
			Static59.aClass2_Sub3_Sub1_2.method841(32);
			Static59.aClass2_Sub3_Sub1_2.method788(Static63.anInt1889);
			Static59.aClass2_Sub3_Sub1_2.method788(Static6.anInt409);
			Static59.aClass2_Sub3_Sub1_2.method788(Static96.anInt2420);
		}
		if (Static93.anInt2360 >= 135 && Static93.anInt2360 <= 235 && Static1.anInt13 >= 467 && Static1.anInt13 <= 499) {
			Static87.aBoolean137 = true;
			Static6.anInt409 = (Static6.anInt409 + 1) % 3;
			Static13.aBoolean20 = true;
			Static59.aClass2_Sub3_Sub1_2.method841(32);
			Static59.aClass2_Sub3_Sub1_2.method788(Static63.anInt1889);
			Static59.aClass2_Sub3_Sub1_2.method788(Static6.anInt409);
			Static59.aClass2_Sub3_Sub1_2.method788(Static96.anInt2420);
		}
		if (Static93.anInt2360 >= 273 && Static93.anInt2360 <= 373 && Static1.anInt13 >= 467 && Static1.anInt13 <= 499) {
			Static96.anInt2420 = (Static96.anInt2420 + 1) % 3;
			Static13.aBoolean20 = true;
			Static87.aBoolean137 = true;
			Static59.aClass2_Sub3_Sub1_2.method841(32);
			Static59.aClass2_Sub3_Sub1_2.method788(Static63.anInt1889);
			Static59.aClass2_Sub3_Sub1_2.method788(Static6.anInt409);
			Static59.aClass2_Sub3_Sub1_2.method788(Static96.anInt2420);
		}
		if (Static93.anInt2360 < 412 || Static93.anInt2360 > 512 || Static1.anInt13 < 467 || Static1.anInt13 > 499) {
			return;
		}
		if (Static111.anInt2784 == -1) {
			Static31.method839();
			if (Static62.anInt1879 != -1) {
				Static112.aBoolean161 = false;
				Static111.anInt2781 = Static111.anInt2784 = Static62.anInt1879;
				Static111.aClass1_2890 = Static111.aClass1_2898;
				return;
			}
		} else {
			Static73.method1372(0, Static65.aClass1_1973, Static111.aClass1_2898);
		}
		return;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZILclient!aa;I)V")
	public static void method450(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub1_Sub1_Sub1 arg2, @OriginalArg(4) int arg3) {
		if (Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1 == arg2 || Static37.anInt1346 >= 400) {
			return;
		}
		@Pc(54) Class1 local54;
		if (arg2.anInt279 == 0) {
			local54 = Static97.method1655(new Class1[] { arg2.aClass1_264, Static28.method740(Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt281, arg2.anInt281), Static43.aClass1_1439, Static25.aClass1_994, Static43.method994(arg2.anInt281), Static85.aClass1_2368 });
		} else {
			local54 = Static97.method1655(new Class1[] { arg2.aClass1_264, Static43.aClass1_1439, Static47.aClass1_1510, Static43.method994(arg2.anInt279), Static85.aClass1_2368 });
		}
		@Pc(158) int local158;
		if (Static12.anInt2645 == 1) {
			Static29.method758(arg3, Static17.aClass1_675, arg0, arg1, 22, Static97.method1655(new Class1[] { Static109.aClass1_2872, Static51.aClass1_1748, local54 }));
		} else if (Static17.anInt783 != 1) {
			for (local158 = 4; local158 >= 0; local158--) {
				if (Static17.aClass1Array8[local158] != null) {
					@Pc(170) int local170 = 0;
					@Pc(172) short local172 = 0;
					if (Static17.aClass1Array8[local158].method14(Static52.aClass1_1773)) {
						if (Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt281 < arg2.anInt281) {
							local172 = 2000;
						}
						if (Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt286 != 0 && arg2.anInt286 != 0) {
							if (Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt286 == arg2.anInt286) {
								local172 = 2000;
							} else {
								local172 = 0;
							}
						}
					} else if (Static22.aBooleanArray9[local158]) {
						local172 = 2000;
					}
					if (local158 == 0) {
						local170 = local172 + 10;
					}
					if (local158 == 1) {
						local170 = local172 + 39;
					}
					if (local158 == 2) {
						local170 = local172 + 44;
					}
					if (local158 == 3) {
						local170 = local172 + 14;
					}
					if (local158 == 4) {
						local170 = local172 + 41;
					}
					Static29.method758(arg3, Static17.aClass1Array8[local158], arg0, arg1, local170, Static97.method1655(new Class1[] { Static47.aClass1_1511, local54 }));
				}
			}
		} else if ((Static96.anInt2434 & 0x8) == 8) {
			Static29.method758(arg3, Static52.aClass1_1774, arg0, arg1, 1, Static97.method1655(new Class1[] { Static46.aClass1_1507, Static51.aClass1_1748, local54 }));
		}
		for (local158 = 0; local158 < Static37.anInt1346; local158++) {
			if (Static66.anIntArray290[local158] == 7) {
				Static84.aClass1Array20[local158] = Static97.method1655(new Class1[] { Static104.aClass1_1584, Static77.aClass1_2166, Static47.aClass1_1511, local54 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "(I)I")
	public static int method451() {
		@Pc(14) int local14 = Static65.method1338(Static2.anInt287, Static21.anInt916, Static41.anInt1396);
		return local14 - Static59.anInt1824 >= 800 || (Static29.aByteArrayArrayArray2[Static2.anInt287][Static21.anInt916 >> 7][Static41.anInt1396 >> 7] & 0x4) == 0 ? 3 : Static2.anInt287;
	}
}
