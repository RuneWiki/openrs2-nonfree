import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
	public static int anInt1800;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "[I")
	public static int[] anIntArray179 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1047 = Static107.method1838("mod_icons");

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1048 = Static107.method1838("::noclip");

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "Lclient!qd;")
	public static Class65 aClass65_4 = new Class65();

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1049 = Static107.method1838("shake:");

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1050 = aClass28_1049;

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1051 = aClass28_1049;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
	public static int anInt1799 = 0;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "[I")
	public static int[] anIntArray180 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([BZB)Ljava/lang/Object;")
	public static Object method1219(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static8.aBoolean12) {
			try {
				@Pc(23) Class89 local23 = (Class89) Class.forName("Class89_Sub1").getDeclaredConstructor().newInstance();
				local23.method2877(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static8.aBoolean12 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
	public static void method1220() {
		aClass28_1048 = null;
		anIntArray180 = null;
		aClass28_1050 = null;
		anIntArray179 = null;
		aClass28_1051 = null;
		aClass65_4 = null;
		aClass28_1049 = null;
		aClass28_1047 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!ff;IB)V")
	public static void method1221(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) int arg2) {
		if (arg1.anInt1428 == 1) {
			Static75.method1358((short) 21, arg1.anInt1367, arg1.aClass28_817, 0, 0L, Static136.aClass28_1828);
		}
		if (arg1.anInt1428 == 2 && !Static163.aBoolean157) {
			@Pc(37) Class28 local37 = Static76.method1367(arg1);
			if (local37 != null) {
				Static75.method1358((short) 33, arg1.anInt1367, local37, -1, 0L, Static83.method1481(new Class28[] { Static100.aClass28_1459, arg1.aClass28_811 }));
			}
		}
		if (arg1.anInt1428 == 3) {
			Static75.method1358((short) 6, arg1.anInt1367, Static44.aClass28_718, 0, 0L, Static136.aClass28_1828);
		}
		if (arg1.anInt1428 == 4) {
			Static75.method1358((short) 38, arg1.anInt1367, arg1.aClass28_817, 0, 0L, Static136.aClass28_1828);
		}
		if (arg1.anInt1428 == 5) {
			Static75.method1358((short) 40, arg1.anInt1367, arg1.aClass28_817, 0, 0L, Static136.aClass28_1828);
		}
		if (arg1.anInt1428 == 6 && Static177.aClass24_14 == null) {
			Static75.method1358((short) 16, arg1.anInt1367, arg1.aClass28_817, -1, 0L, Static136.aClass28_1828);
		}
		@Pc(169) int local169;
		@Pc(163) int local163;
		if (arg1.anInt1425 == 2) {
			local163 = 0;
			for (@Pc(165) int local165 = 0; local165 < arg1.anInt1427; local165++) {
				for (local169 = 0; local169 < arg1.anInt1357; local169++) {
					@Pc(179) int local179 = local169 * (arg1.anInt1368 + 32);
					@Pc(186) int local186 = (arg1.anInt1371 + 32) * local165;
					if (local163 < 20) {
						local186 += arg1.anIntArray128[local163];
						local179 += arg1.anIntArray121[local163];
					}
					if (local179 <= arg0 && arg2 >= local186 && local179 + 32 > arg0 && local186 + 32 > arg2) {
						Static13.aClass24_2 = arg1;
						Static14.anInt609 = local163;
						if (arg1.anIntArray120[local163] > 0) {
							@Pc(256) Class2_Sub4_Sub12 local256 = Static58.method1034(arg1.anIntArray120[local163] - 1);
							if (Static166.anInt3704 == 1 && Static74.method1351(Static10.method323(arg1))) {
								if (arg1.anInt1367 != Static112.anInt2709 || Static84.anInt2127 != local163) {
									Static75.method1358((short) 25, arg1.anInt1367, Static28.aClass28_538, local163, (long) local256.anInt2201, Static83.method1481(new Class28[] { Static61.aClass28_954, Static31.aClass28_2398, local256.aClass28_1344 }));
								}
							} else if (!Static163.aBoolean157 || !Static74.method1351(Static10.method323(arg1))) {
								@Pc(328) Class28[] local328 = local256.aClass28Array31;
								if (Static119.aBoolean129) {
									local328 = Static107.method1840(local328);
								}
								@Pc(346) int local346;
								@Pc(391) byte local391;
								if (Static74.method1351(Static10.method323(arg1))) {
									for (local346 = 4; local346 >= 3; local346--) {
										if (local328 != null && local328[local346] != null) {
											if (local346 == 3) {
												local391 = 30;
											} else {
												local391 = 9;
											}
											Static75.method1358(local391, arg1.anInt1367, local328[local346], local163, (long) local256.anInt2201, Static83.method1481(new Class28[] { Static95.aClass28_1407, local256.aClass28_1344 }));
										} else if (local346 == 4) {
											Static75.method1358((short) 9, arg1.anInt1367, Static128.aClass28_1771, local163, (long) local256.anInt2201, Static83.method1481(new Class28[] { Static95.aClass28_1407, local256.aClass28_1344 }));
										}
									}
								}
								if (Static122.method2006(Static10.method323(arg1))) {
									Static75.method1358((short) 18, arg1.anInt1367, Static28.aClass28_538, local163, (long) local256.anInt2201, Static83.method1481(new Class28[] { Static95.aClass28_1407, local256.aClass28_1344 }));
								}
								if (Static74.method1351(Static10.method323(arg1)) && local328 != null) {
									for (local346 = 2; local346 >= 0; local346--) {
										if (local328[local346] != null) {
											local391 = 0;
											if (local346 == 0) {
												local391 = 41;
											}
											if (local346 == 1) {
												local391 = 37;
											}
											if (local346 == 2) {
												local391 = 47;
											}
											Static75.method1358(local391, arg1.anInt1367, local328[local346], local163, (long) local256.anInt2201, Static83.method1481(new Class28[] { Static95.aClass28_1407, local256.aClass28_1344 }));
										}
									}
								}
								local328 = arg1.aClass28Array16;
								if (Static119.aBoolean129) {
									local328 = Static107.method1840(local328);
								}
								if (local328 != null) {
									for (local346 = 4; local346 >= 0; local346--) {
										if (local328[local346] != null) {
											local391 = 0;
											if (local346 == 0) {
												local391 = 23;
											}
											if (local346 == 1) {
												local391 = 46;
											}
											if (local346 == 2) {
												local391 = 31;
											}
											if (local346 == 3) {
												local391 = 20;
											}
											if (local346 == 4) {
												local391 = 1;
											}
											Static75.method1358(local391, arg1.anInt1367, local328[local346], local163, (long) local256.anInt2201, Static83.method1481(new Class28[] { Static95.aClass28_1407, local256.aClass28_1344 }));
										}
									}
								}
								Static75.method1358((short) 1002, arg1.anInt1367, Static82.aClass28_1233, local163, (long) local256.anInt2201, Static83.method1481(new Class28[] { Static95.aClass28_1407, local256.aClass28_1344 }));
							} else if ((Static151.anInt3386 & 0x10) == 16) {
								Static75.method1358((short) 35, arg1.anInt1367, Static98.aClass28_1425, local163, (long) local256.anInt2201, Static83.method1481(new Class28[] { Static24.aClass28_499, Static31.aClass28_2398, local256.aClass28_1344 }));
							}
						}
					}
					local163++;
				}
			}
		}
		if (!arg1.aBoolean63) {
			return;
		}
		if (!Static163.aBoolean157) {
			@Pc(704) Class28 local704;
			for (local163 = 9; local163 >= 5; local163--) {
				local704 = Static89.method1595(local163, arg1);
				if (local704 != null) {
					Static75.method1358((short) 1003, arg1.anInt1367, local704, arg1.anInt1409, (long) (local163 + 1), arg1.aClass28_816);
				}
			}
			local704 = Static76.method1367(arg1);
			if (local704 != null) {
				Static75.method1358((short) 33, arg1.anInt1367, local704, arg1.anInt1409, 0L, arg1.aClass28_816);
			}
			for (local169 = 4; local169 >= 0; local169--) {
				@Pc(762) Class28 local762 = Static89.method1595(local169, arg1);
				if (local762 != null) {
					Static75.method1358((short) 49, arg1.anInt1367, local762, arg1.anInt1409, (long) (local169 + 1), arg1.aClass28_816);
				}
			}
			if (Static73.method1332(Static10.method323(arg1))) {
				Static75.method1358((short) 16, arg1.anInt1367, Static73.aClass28_1143, arg1.anInt1409, 0L, Static136.aClass28_1828);
				return;
			}
			return;
		}
		if (Static5.method157(Static10.method323(arg1)) && (Static151.anInt3386 & 0x20) == 32) {
			Static75.method1358((short) 11, arg1.anInt1367, Static98.aClass28_1425, arg1.anInt1409, 0L, Static83.method1481(new Class28[] { Static24.aClass28_499, Static35.aClass28_573, arg1.aClass28_816 }));
			return;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(III[[[I)V")
	public static void method1222(@OriginalArg(3) int[][][] arg0) {
		Static152.anInt3423 = 4;
		Static178.anInt3959 = 104;
		Static13.anInt587 = 104;
		Static133.aClass2_Sub14ArrayArrayArray1 = new Class2_Sub14[4][104][104];
		Static39.anIntArrayArrayArray5 = new int[4][105][105];
		Static90.anIntArrayArrayArray7 = arg0;
		Static153.method2370();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Lclient!wb;")
	public static Class2_Sub4_Sub3_Sub4 method1223() {
		@Pc(14) Class2_Sub4_Sub3_Sub4 local14 = new Class2_Sub4_Sub3_Sub4();
		local14.anInt3982 = Static138.anInt3159;
		local14.anInt3986 = Static59.anIntArray135[0];
		local14.anInt3985 = Static171.anIntArray358[0];
		local14.anInt3981 = Static171.anIntArray359[0];
		local14.anInt3983 = Static147.anIntArray314[0];
		local14.anInt3984 = Static28.anInt862;
		@Pc(46) int local46 = local14.anInt3985 * local14.anInt3981;
		@Pc(50) byte[] local50 = Static81.aByteArrayArray5[0];
		local14.anIntArray366 = new int[local46];
		for (@Pc(56) int local56 = 0; local56 < local46; local56++) {
			local14.anIntArray366[local56] = Static101.anIntArray31[local50[local56] & 0xFF];
		}
		Static12.method362();
		return local14;
	}
}
