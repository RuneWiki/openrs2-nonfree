import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!se", name = "Qb", descriptor = "Lclient!ff;")
	public static Class11 aClass11_39;

	@OriginalMember(owner = "client!se", name = "Yb", descriptor = "[Lclient!hb;")
	public static Class2_Sub1_Sub9_Sub1[] aClass2_Sub1_Sub9_Sub1Array11;

	@OriginalMember(owner = "client!se", name = "rc", descriptor = "Lclient!ce;")
	public static Class11_Sub1 aClass11_Sub1_14;

	@OriginalMember(owner = "client!se", name = "kc", descriptor = "Lclient!wd;")
	private static Class80 aClass80_915 = Static2.method59("level)2");

	@OriginalMember(owner = "client!se", name = "ib", descriptor = "Lclient!wd;")
	public static Class80 aClass80_909 = aClass80_915;

	@OriginalMember(owner = "client!se", name = "ec", descriptor = "Lclient!wd;")
	private static Class80 aClass80_914 = Static2.method59("Welcome to RuneScape");

	@OriginalMember(owner = "client!se", name = "lb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_910 = aClass80_914;

	@OriginalMember(owner = "client!se", name = "mb", descriptor = "I")
	public static int anInt2322 = -1;

	@OriginalMember(owner = "client!se", name = "Nb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_913 = Static2.method59("OFF");

	@OriginalMember(owner = "client!se", name = "pb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_911 = aClass80_913;

	@OriginalMember(owner = "client!se", name = "Ab", descriptor = "Lclient!wd;")
	public static Class80 aClass80_912 = Static2.method59(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!se", name = "Nc", descriptor = "Lclient!wd;")
	private static Class80 aClass80_919 = Static2.method59("Connecting to update server");

	@OriginalMember(owner = "client!se", name = "mc", descriptor = "Lclient!wd;")
	public static Class80 aClass80_916 = aClass80_919;

	@OriginalMember(owner = "client!se", name = "uc", descriptor = "I")
	public static int anInt2367 = 0;

	@OriginalMember(owner = "client!se", name = "Bc", descriptor = "Lclient!wd;")
	public static Class80 aClass80_917 = Static2.method59("gelb:");

	@OriginalMember(owner = "client!se", name = "Oc", descriptor = "Lclient!wd;")
	public static Class80 aClass80_920 = Static2.method59("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BLclient!wd;)V")
	public static void method1428(@OriginalArg(1) Class80 arg0) {
		if (arg0 == null || arg0.method1999() == 0) {
			Static19.anInt800 = 0;
			return;
		}
		@Pc(27) Class80 local27 = arg0;
		@Pc(30) Class80[] local30 = new Class80[100];
		@Pc(32) int local32 = 0;
		while (true) {
			@Pc(37) int local37 = local27.method2015();
			if (local37 == -1) {
				local27 = local27.method2026();
				if (local27.method1999() > 0) {
					local30[local32++] = local27.method2011();
				}
				Static19.anInt800 = 0;
				label46: for (local37 = 0; local37 < Static86.anInt2120; local37++) {
					@Pc(94) Class2_Sub1_Sub5 local94 = Static4.method95(local37);
					if (local94.anInt797 == -1 && local94.aClass80_271 != null) {
						@Pc(107) Class80 local107 = local94.aClass80_271.method2011();
						for (@Pc(109) int local109 = 0; local109 < local32; local109++) {
							if (local107.method2025(local30[local109]) == -1) {
								continue label46;
							}
						}
						Static88.aClass80Array14[Static19.anInt800] = local107;
						Static92.anIntArray305[Static19.anInt800] = local37;
						Static19.anInt800++;
						if (Static88.aClass80Array14.length <= Static19.anInt800) {
							return;
						}
					}
				}
				return;
			}
			@Pc(48) Class80 local48 = local27.method2027(0, local37).method2026();
			if (local48.method1999() > 0) {
				local30[local32++] = local48.method2011();
			}
			local27 = local27.method2021(local37 + 1);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)Lclient!wd;")
	public static Class80 method1429(@OriginalArg(1) int arg0) {
		@Pc(9) Class80 local9 = Static28.method1422(arg0);
		for (@Pc(23) int local23 = local9.method1999() - 3; local23 > 0; local23 -= 3) {
			local9 = Static93.method1444(new Class80[] { local9.method2027(0, local23), Static82.aClass80_1175, local9.method2021(local23) });
		}
		if (local9.method1999() > 8) {
			local9 = Static93.method1444(new Class80[] { Static84.aClass80_824, local9.method2027(0, local9.method1999() - 8), Static55.aClass80_492, Static36.aClass80_399, local9, Static43.aClass80_486 });
		} else if (local9.method1999() > 4) {
			local9 = Static93.method1444(new Class80[] { Static93.aClass80_927, local9.method2027(0, local9.method1999() - 4), Static103.aClass80_1016, Static36.aClass80_399, local9, Static43.aClass80_486 });
		}
		return Static93.method1444(new Class80[] { Static7.aClass80_95, local9 });
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BIIII)V")
	public static void method1432(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class2_Sub18 local16 = (Class2_Sub18) Static104.aClass41_12.method1056((long) arg3);
		if (local16 == null) {
			local16 = new Class2_Sub18();
			Static104.aClass41_12.method1063(local16, (long) arg3);
		}
		if (local16.anIntArray365.length <= arg0) {
			@Pc(38) int[] local38 = new int[arg0 + 1];
			@Pc(43) int[] local43 = new int[arg0 + 1];
			for (@Pc(45) int local45 = 0; local45 < local16.anIntArray365.length; local45++) {
				local43[local45] = local16.anIntArray365[local45];
				local38[local45] = local16.anIntArray364[local45];
			}
			for (@Pc(71) int local71 = local16.anIntArray365.length; local71 < arg0; local71++) {
				local43[local71] = -1;
				local38[local71] = 0;
			}
			local16.anIntArray364 = local38;
			local16.anIntArray365 = local43;
		}
		local16.anIntArray365[arg0] = arg2;
		local16.anIntArray364[arg0] = arg1;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(Z)Z")
	public static boolean method1433() {
		@Pc(8) long local8 = Static49.method877();
		@Pc(14) int local14 = (int) (local8 - Static95.aLong75);
		Static95.aLong75 = local8;
		if (local14 > 200) {
			local14 = 200;
		}
		Static104.anInt2705 += local14;
		if (Static81.anInt2041 == 0 && Static31.anInt1083 == 0 && Static57.anInt1735 == 0 && Static55.anInt1309 == 0) {
			return true;
		} else if (Static51.aClass10_3 == null) {
			return false;
		} else {
			try {
				if (Static104.anInt2705 > 30000) {
					throw new IOException();
				}
				@Pc(61) Class2_Sub1_Sub15 local61;
				@Pc(66) Class2_Sub17 local66;
				while (Static31.anInt1083 < 20 && Static55.anInt1309 > 0) {
					local61 = (Class2_Sub1_Sub15) Static40.aClass41_4.method1061();
					local66 = new Class2_Sub17(4);
					local66.method1769(1);
					local66.method1771((int) local61.aLong91);
					Static51.aClass10_3.method256(local66.aByteArray38, 4);
					Static108.aClass41_13.method1063(local61, local61.aLong91);
					Static31.anInt1083++;
					Static55.anInt1309--;
				}
				while (Static81.anInt2041 < 20 && Static57.anInt1735 > 0) {
					local61 = (Class2_Sub1_Sub15) Static111.aClass70_32.method1851();
					local66 = new Class2_Sub17(4);
					local66.method1769(0);
					local66.method1771((int) local61.aLong91);
					Static51.aClass10_3.method256(local66.aByteArray38, 4);
					local61.method1934();
					Static21.aClass41_2.method1063(local61, local61.aLong91);
					Static81.anInt2041++;
					Static57.anInt1735--;
				}
				for (@Pc(160) int local160 = 0; local160 < 100; local160++) {
					@Pc(166) int local166 = Static51.aClass10_3.method259();
					if (local166 < 0) {
						throw new IOException();
					}
					if (local166 == 0) {
						break;
					}
					Static104.anInt2705 = 0;
					@Pc(181) byte local181 = 0;
					if (Static71.aClass2_Sub1_Sub15_1 == null) {
						local181 = 8;
					} else if (Static20.anInt908 == 0) {
						local181 = 1;
					}
					@Pc(201) int local201;
					@Pc(206) int local206;
					@Pc(235) int local235;
					@Pc(308) int local308;
					if (local181 <= 0) {
						local201 = Static83.aClass2_Sub17_5.aByteArray38.length - Static71.aClass2_Sub1_Sub15_1.aByte5;
						local206 = 512 - Static20.anInt908;
						if (local201 - Static83.aClass2_Sub17_5.anInt2799 < local206) {
							local206 = local201 - Static83.aClass2_Sub17_5.anInt2799;
						}
						if (local206 > local166) {
							local206 = local166;
						}
						Static51.aClass10_3.method257(Static83.aClass2_Sub17_5.aByteArray38, local206, Static83.aClass2_Sub17_5.anInt2799);
						if (Static92.aByte4 != 0) {
							for (local235 = 0; local235 < local206; local235++) {
								Static83.aClass2_Sub17_5.aByteArray38[local235 + Static83.aClass2_Sub17_5.anInt2799] ^= Static92.aByte4;
							}
						}
						Static20.anInt908 += local206;
						Static83.aClass2_Sub17_5.anInt2799 += local206;
						if (local201 == Static83.aClass2_Sub17_5.anInt2799) {
							if (Static71.aClass2_Sub1_Sub15_1.aLong91 == 16711935L) {
								Static124.aClass2_Sub17_6 = Static83.aClass2_Sub17_5;
								for (local235 = 0; local235 < 256; local235++) {
									@Pc(295) Class11_Sub1 local295 = Static18.aClass11_Sub1Array1[local235];
									if (local295 != null) {
										Static124.aClass2_Sub17_6.anInt2799 = local235 * 4 + 5;
										local308 = Static124.aClass2_Sub17_6.method1747();
										local295.method405(local308);
									}
								}
							} else {
								Static76.aCRC32_2.reset();
								Static76.aCRC32_2.update(Static83.aClass2_Sub17_5.aByteArray38, 0, local201);
								local235 = (int) Static76.aCRC32_2.getValue();
								if (local235 != Static71.aClass2_Sub1_Sub15_1.anInt2701) {
									try {
										Static51.aClass10_3.method255();
									} catch (@Pc(341) Exception local341) {
									}
									Static92.aByte4 = (byte) (Math.random() * 255.0D + 1.0D);
									Static51.aClass10_3 = null;
									Static123.anInt3112++;
									return false;
								}
								Static123.anInt3112 = 0;
								Static111.anInt2999 = 0;
								Static71.aClass2_Sub1_Sub15_1.aClass11_Sub1_17.method403(Static83.aBoolean153, (Static71.aClass2_Sub1_Sub15_1.aLong91 & 0xFF0000L) == 16711680L, (int) (Static71.aClass2_Sub1_Sub15_1.aLong91 & 0xFFFFL), Static83.aClass2_Sub17_5.aByteArray38);
							}
							Static71.aClass2_Sub1_Sub15_1.method1961();
							if (Static83.aBoolean153) {
								Static31.anInt1083--;
							} else {
								Static81.anInt2041--;
							}
							Static83.aClass2_Sub17_5 = null;
							Static71.aClass2_Sub1_Sub15_1 = null;
							Static20.anInt908 = 0;
						} else {
							if (Static20.anInt908 != 512) {
								break;
							}
							Static20.anInt908 = 0;
						}
					} else {
						local201 = local181 - Static119.aClass2_Sub17_3.anInt2799;
						if (local166 < local201) {
							local201 = local166;
						}
						Static51.aClass10_3.method257(Static119.aClass2_Sub17_3.aByteArray38, local201, Static119.aClass2_Sub17_3.anInt2799);
						if (Static92.aByte4 != 0) {
							for (local206 = 0; local206 < local201; local206++) {
								Static119.aClass2_Sub17_3.aByteArray38[local206 + Static119.aClass2_Sub17_3.anInt2799] ^= Static92.aByte4;
							}
						}
						Static119.aClass2_Sub17_3.anInt2799 += local201;
						if (local181 > Static119.aClass2_Sub17_3.anInt2799) {
							break;
						}
						if (Static71.aClass2_Sub1_Sub15_1 == null) {
							Static119.aClass2_Sub17_3.anInt2799 = 0;
							local206 = Static119.aClass2_Sub17_3.method1780();
							local235 = Static119.aClass2_Sub17_3.method1783();
							@Pc(494) int local494 = Static119.aClass2_Sub17_3.method1780();
							@Pc(501) long local501 = (long) (local235 + (local206 << 16));
							local308 = Static119.aClass2_Sub17_3.method1747();
							@Pc(511) Class2_Sub1_Sub15 local511 = (Class2_Sub1_Sub15) Static108.aClass41_13.method1056(local501);
							Static83.aBoolean153 = true;
							if (local511 == null) {
								local511 = (Class2_Sub1_Sub15) Static21.aClass41_2.method1056(local501);
								Static83.aBoolean153 = false;
							}
							if (local511 == null) {
								throw new IOException();
							}
							Static71.aClass2_Sub1_Sub15_1 = local511;
							@Pc(540) int local540 = local494 == 0 ? 5 : 9;
							Static83.aClass2_Sub17_5 = new Class2_Sub17(local540 + local308 + Static71.aClass2_Sub1_Sub15_1.aByte5);
							Static83.aClass2_Sub17_5.method1769(local494);
							Static83.aClass2_Sub17_5.method1765(local308);
							Static20.anInt908 = 8;
							Static119.aClass2_Sub17_3.anInt2799 = 0;
						} else if (Static20.anInt908 == 0) {
							if (Static119.aClass2_Sub17_3.aByteArray38[0] == -1) {
								Static20.anInt908 = 1;
								Static119.aClass2_Sub17_3.anInt2799 = 0;
							} else {
								Static71.aClass2_Sub1_Sub15_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(596) IOException local596) {
				try {
					Static51.aClass10_3.method255();
				} catch (@Pc(601) Exception local601) {
				}
				Static111.anInt2999++;
				Static51.aClass10_3 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII)V")
	public static void method1435(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			Static120.aClass2_Sub17_Sub1_3.method1799(198);
			Static120.aClass2_Sub17_Sub1_3.method1765(arg1);
			Static120.aClass2_Sub17_Sub1_3.method1757(arg2);
		}
		if (arg0 == 2) {
			Static120.aClass2_Sub17_Sub1_3.method1799(244);
			Static120.aClass2_Sub17_Sub1_3.method1765(arg1);
			Static120.aClass2_Sub17_Sub1_3.method1757(arg2);
		}
		if (arg0 == 3) {
			Static120.aClass2_Sub17_Sub1_3.method1799(145);
			Static120.aClass2_Sub17_Sub1_3.method1765(arg1);
			Static120.aClass2_Sub17_Sub1_3.method1757(arg2);
		}
		if (arg0 == 4) {
			Static120.aClass2_Sub17_Sub1_3.method1799(48);
			Static120.aClass2_Sub17_Sub1_3.method1765(arg1);
			Static120.aClass2_Sub17_Sub1_3.method1757(arg2);
		}
		if (arg0 == 5) {
			Static120.aClass2_Sub17_Sub1_3.method1799(180);
			Static120.aClass2_Sub17_Sub1_3.method1765(arg1);
			Static120.aClass2_Sub17_Sub1_3.method1757(arg2);
		}
		if (arg0 == 6) {
			Static120.aClass2_Sub17_Sub1_3.method1799(79);
			Static120.aClass2_Sub17_Sub1_3.method1765(arg1);
			Static120.aClass2_Sub17_Sub1_3.method1757(arg2);
		}
		if (arg0 == 7) {
			Static120.aClass2_Sub17_Sub1_3.method1799(113);
			Static120.aClass2_Sub17_Sub1_3.method1765(arg1);
			Static120.aClass2_Sub17_Sub1_3.method1757(arg2);
		}
		if (arg0 == 8) {
			Static120.aClass2_Sub17_Sub1_3.method1799(53);
			Static120.aClass2_Sub17_Sub1_3.method1765(arg1);
			Static120.aClass2_Sub17_Sub1_3.method1757(arg2);
		}
		if (arg0 == 9) {
			Static120.aClass2_Sub17_Sub1_3.method1799(170);
			Static120.aClass2_Sub17_Sub1_3.method1765(arg1);
			Static120.aClass2_Sub17_Sub1_3.method1757(arg2);
		}
		if (arg0 == 10) {
			Static120.aClass2_Sub17_Sub1_3.method1799(118);
			Static120.aClass2_Sub17_Sub1_3.method1765(arg1);
			Static120.aClass2_Sub17_Sub1_3.method1757(arg2);
		}
		@Pc(212) Class2_Sub1_Sub17 local212 = Static61.method1057(arg2, arg1);
		if (local212 != null && local212.anObjectArray9 != null) {
			Static40.method667(local212.anObjectArray9, null, arg0, 0, 0, local212);
		}
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(I)Lclient!ja;")
	public static Class28 method1438() {
		try {
			return (Class28) Class.forName("Class28_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class28_Sub1();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)Lclient!wd;")
	public static Class80 method1439(@OriginalArg(0) int arg0) {
		return Static93.method1444(new Class80[] { Static28.method1422(arg0 >> 24 & 0xFF), Static63.aClass80_670, Static28.method1422(arg0 >> 16 & 0xFF), Static63.aClass80_670, Static28.method1422(arg0 >> 8 & 0xFF), Static63.aClass80_670, Static28.method1422(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIZ[BII[Lclient!me;)V")
	public static void method1440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class49[] arg5) {
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 64; local11++) {
				for (local15 = 0; local15 < 64; local15++) {
					if (local11 + arg0 > 0 && local11 + arg0 < 103 && arg3 + local15 > 0 && arg3 + local15 < 103) {
						arg5[local7].anIntArrayArray24[local11 + arg0][arg3 + local15] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(94) Class2_Sub17 local94 = new Class2_Sub17(arg2);
		for (local15 = 0; local15 < 4; local15++) {
			for (@Pc(100) int local100 = 0; local100 < 64; local100++) {
				for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
					Static83.method1249(0, local15, arg1, local94, arg0 + local100, arg4, arg3 + local104);
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "h", descriptor = "(B)V")
	public static void method1441() {
		aClass80_913 = null;
		aClass80_919 = null;
		aClass80_916 = null;
		aClass11_39 = null;
		aClass80_917 = null;
		aClass80_920 = null;
		aClass2_Sub1_Sub9_Sub1Array11 = null;
		aClass80_909 = null;
		aClass80_910 = null;
		aClass80_911 = null;
		aClass11_Sub1_14 = null;
		aClass80_914 = null;
		aClass80_915 = null;
		aClass80_912 = null;
	}
}
