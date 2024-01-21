import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "J")
	public static long aLong133;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
	public static int anInt3281 = 0;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "[I")
	public static int[] anIntArray293 = new int[] { 7, 0, 0, -1, 0, 2, 0, 0, 0, 0, 6, 3, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 3, 1, 0, -2, 0, -1, -2, 0, 0, -2, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 24, 0, 7, 6, 4, 0, -2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 11, 6, 0, 0, 0, 0, 3, 0, 0, 0, -1, 6, 6, 10, 0, 6, 0, 0, 5, 0, 0, 7, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 6, 0, 6, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 4, 2, 0, 0, 0, 0, 0, 6, 0, 5, 10, 0, 0, 0, 0, 6, 0, 15, 0, 0, 0, 0, -2, 5, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, -2, 2, 0, 0, 0, 12, 2, 0, 0, 0, 0, 4, 0, -2, -1, 1, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0, 0, 0, 3, -2, 0, 0, 2, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, -2, 0, 0, 6, 0, 0, 0, 0, 8, 0, 0, 0, 5, 11, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 1, 0, 0, 0, 0, 0, 4, 0, -1, 0, 0, 0 };

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean140 = false;

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "[I")
	public static int[] anIntArray294 = new int[2000];

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public static void method2525() {
		anIntArray293 = null;
		anIntArray294 = null;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
	public static void method2526() {
		Static88.anInt1850 = 0;
		Static162.anInt3603 = 0;
		Static143.method2362();
		Static54.method940();
		Static127.method2156();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static162.anInt3603; local17++) {
			local23 = Static111.anIntArray224[local17];
			if (Static127.anInt2757 != Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local23].anInt3582) {
				Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local23].aClass2_Sub2_Sub15_1 = null;
				Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[local23] = null;
			}
		}
		if (Static180.anInt3988 != Static86.aClass2_Sub13_Sub1_13.anInt3940) {
			throw new RuntimeException("gnp1 pos:" + Static86.aClass2_Sub13_Sub1_13.anInt3940 + " psize:" + Static180.anInt3988);
		}
		for (local23 = 0; local23 < Static1.anInt2; local23++) {
			if (Static161.aClass2_Sub2_Sub3_Sub7_Sub1Array1[Static1.anIntArray1[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static1.anInt2);
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
	public static void method2527() {
		while (true) {
			@Pc(9) Class81 local9 = Static47.aClass81_4;
			@Pc(16) Class2_Sub22 local16;
			synchronized (Static47.aClass81_4) {
				local16 = (Class2_Sub22) Static66.aClass81_5.method2681();
			}
			if (local16 == null) {
				return;
			}
			local16.aClass11_Sub1_28.method2083(local16.aByteArray45, local16.aClass88_2, false, (int) local16.aLong157);
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIB)I")
	public static int method2528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) int local14 = 256 - arg1;
		return ((arg0 & 0xFF00) * local14 + (arg2 & 0xFF00) * arg1 & 0xFF0000) + (arg1 * (arg2 & 0xFF00FF) + local14 * (arg0 & 0xFF00FF) & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)Lclient!sc;")
	public static Class2_Sub2_Sub14 method2529() {
		if (Static27.aClass2_Sub2_Sub14_1 == null) {
			Static27.aClass2_Sub2_Sub14_1 = new Class2_Sub2_Sub14();
		}
		return Static27.aClass2_Sub2_Sub14_1;
	}

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)Z")
	public static boolean method2530() {
		@Pc(4) long local4 = Static108.method1828();
		@Pc(14) int local14 = (int) (local4 - aLong133);
		aLong133 = local4;
		if (local14 > 200) {
			local14 = 200;
		}
		Static29.anInt714 += local14;
		if (Static4.anInt69 == 0 && Static145.anInt3076 == 0 && Static24.anInt540 == 0 && Static134.anInt2914 == 0) {
			return true;
		} else if (Static175.aClass57_4 == null) {
			return false;
		} else {
			try {
				if (Static29.anInt714 > 30000) {
					throw new IOException();
				}
				@Pc(60) Class2_Sub2_Sub17 local60;
				@Pc(65) Class2_Sub13 local65;
				while (Static145.anInt3076 < 20 && Static134.anInt2914 > 0) {
					local60 = (Class2_Sub2_Sub17) Static133.aClass25_13.method837();
					local65 = new Class2_Sub13(4);
					local65.method2932(1);
					local65.method2913((int) local60.aLong157);
					Static175.aClass57_4.method1885(4, local65.aByteArray49);
					Static118.aClass25_8.method838(local60.aLong157, local60);
					Static134.anInt2914--;
					Static145.anInt3076++;
				}
				while (Static4.anInt69 < 20 && Static24.anInt540 > 0) {
					local60 = (Class2_Sub2_Sub17) Static4.aClass46_1.method1581();
					local65 = new Class2_Sub13(4);
					local65.method2932(0);
					local65.method2913((int) local60.aLong157);
					Static175.aClass57_4.method1885(4, local65.aByteArray49);
					local60.method2843();
					Static12.aClass25_2.method838(local60.aLong157, local60);
					Static4.anInt69++;
					Static24.anInt540--;
				}
				for (@Pc(156) int local156 = 0; local156 < 100; local156++) {
					@Pc(162) int local162 = Static175.aClass57_4.method1884();
					if (local162 < 0) {
						throw new IOException();
					}
					if (local162 == 0) {
						break;
					}
					Static29.anInt714 = 0;
					@Pc(174) byte local174 = 0;
					if (Static91.aClass2_Sub2_Sub17_1 == null) {
						local174 = 8;
					} else if (Static73.anInt1527 == 0) {
						local174 = 1;
					}
					@Pc(200) int local200;
					@Pc(205) int local205;
					@Pc(240) int local240;
					@Pc(384) int local384;
					if (local174 <= 0) {
						local200 = Static134.aClass2_Sub13_4.aByteArray49.length - Static91.aClass2_Sub2_Sub17_1.aByte9;
						local205 = 512 - Static73.anInt1527;
						if (local200 - Static134.aClass2_Sub13_4.anInt3940 < local205) {
							local205 = local200 - Static134.aClass2_Sub13_4.anInt3940;
						}
						if (local205 > local162) {
							local205 = local162;
						}
						Static175.aClass57_4.method1883(local205, Static134.aClass2_Sub13_4.aByteArray49, Static134.aClass2_Sub13_4.anInt3940);
						if (Static69.aByte4 != 0) {
							for (local240 = 0; local240 < local205; local240++) {
								Static134.aClass2_Sub13_4.aByteArray49[local240 + Static134.aClass2_Sub13_4.anInt3940] ^= Static69.aByte4;
							}
						}
						Static134.aClass2_Sub13_4.anInt3940 += local205;
						Static73.anInt1527 += local205;
						if (Static134.aClass2_Sub13_4.anInt3940 == local200) {
							if (Static91.aClass2_Sub2_Sub17_1.aLong157 == 16711935L) {
								Static105.aClass2_Sub13_3 = Static134.aClass2_Sub13_4;
								for (local240 = 0; local240 < 256; local240++) {
									@Pc(371) Class11_Sub1 local371 = Static47.aClass11_Sub1Array1[local240];
									if (local371 != null) {
										Static105.aClass2_Sub13_3.anInt3940 = local240 * 8 + 5;
										local384 = Static105.aClass2_Sub13_3.method2946();
										@Pc(388) int local388 = Static105.aClass2_Sub13_3.method2946();
										local371.method2080(local384, local388);
									}
								}
							} else {
								Static133.aCRC32_3.reset();
								Static133.aCRC32_3.update(Static134.aClass2_Sub13_4.aByteArray49, 0, local200);
								local240 = (int) Static133.aCRC32_3.getValue();
								if (local240 != Static91.aClass2_Sub2_Sub17_1.anInt3456) {
									try {
										Static175.aClass57_4.method1892();
									} catch (@Pc(317) Exception local317) {
									}
									Static69.aByte4 = (byte) (Math.random() * 255.0D + 1.0D);
									Static169.anInt3681++;
									Static175.aClass57_4 = null;
									return false;
								}
								Static69.anInt1423 = 0;
								Static169.anInt3681 = 0;
								Static91.aClass2_Sub2_Sub17_1.aClass11_Sub1_36.method2082(Static134.aClass2_Sub13_4.aByteArray49, (Static91.aClass2_Sub2_Sub17_1.aLong157 & 0xFF0000L) == 16711680L, Static114.aBoolean104, (int) (Static91.aClass2_Sub2_Sub17_1.aLong157 & 0xFFFFL));
							}
							Static91.aClass2_Sub2_Sub17_1.method3007();
							Static73.anInt1527 = 0;
							Static134.aClass2_Sub13_4 = null;
							Static91.aClass2_Sub2_Sub17_1 = null;
							if (Static114.aBoolean104) {
								Static145.anInt3076--;
							} else {
								Static4.anInt69--;
							}
						} else {
							if (Static73.anInt1527 != 512) {
								break;
							}
							Static73.anInt1527 = 0;
						}
					} else {
						local200 = local174 - Static93.aClass2_Sub13_2.anInt3940;
						if (local162 < local200) {
							local200 = local162;
						}
						Static175.aClass57_4.method1883(local200, Static93.aClass2_Sub13_2.aByteArray49, Static93.aClass2_Sub13_2.anInt3940);
						if (Static69.aByte4 != 0) {
							for (local205 = 0; local205 < local200; local205++) {
								Static93.aClass2_Sub13_2.aByteArray49[local205 + Static93.aClass2_Sub13_2.anInt3940] ^= Static69.aByte4;
							}
						}
						Static93.aClass2_Sub13_2.anInt3940 += local200;
						if (Static93.aClass2_Sub13_2.anInt3940 < local174) {
							break;
						}
						if (Static91.aClass2_Sub2_Sub17_1 == null) {
							Static93.aClass2_Sub13_2.anInt3940 = 0;
							local205 = Static93.aClass2_Sub13_2.method2962();
							local240 = Static93.aClass2_Sub13_2.method2933();
							@Pc(522) long local522 = (long) (local240 + (local205 << 16));
							@Pc(526) int local526 = Static93.aClass2_Sub13_2.method2962();
							local384 = Static93.aClass2_Sub13_2.method2946();
							@Pc(538) Class2_Sub2_Sub17 local538 = (Class2_Sub2_Sub17) Static118.aClass25_8.method836(local522);
							Static114.aBoolean104 = true;
							if (local538 == null) {
								local538 = (Class2_Sub2_Sub17) Static12.aClass25_2.method836(local522);
								Static114.aBoolean104 = false;
							}
							if (local538 == null) {
								throw new IOException();
							}
							Static91.aClass2_Sub2_Sub17_1 = local538;
							@Pc(564) int local564 = local526 == 0 ? 5 : 9;
							Static134.aClass2_Sub13_4 = new Class2_Sub13(Static91.aClass2_Sub2_Sub17_1.aByte9 + local564 + local384);
							Static134.aClass2_Sub13_4.method2932(local526);
							Static134.aClass2_Sub13_4.method2952(local384);
							Static73.anInt1527 = 8;
							Static93.aClass2_Sub13_2.anInt3940 = 0;
						} else if (Static73.anInt1527 == 0) {
							if (Static93.aClass2_Sub13_2.aByteArray49[0] == -1) {
								Static73.anInt1527 = 1;
								Static93.aClass2_Sub13_2.anInt3940 = 0;
							} else {
								Static91.aClass2_Sub2_Sub17_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(627) IOException local627) {
				try {
					Static175.aClass57_4.method1892();
				} catch (@Pc(632) Exception local632) {
				}
				Static175.aClass57_4 = null;
				Static69.anInt1423++;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "(I)V")
	public static void method2531() {
		Static88.anInt1850 = 0;
		Static162.anInt3603 = 0;
		Static81.method1393();
		Static104.method1767();
		Static94.method1608();
		Static67.method1133();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static162.anInt3603; local19++) {
			local25 = Static111.anIntArray224[local19];
			if (Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local25].anInt3582 != Static127.anInt2757) {
				Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[local25] = null;
			}
		}
		if (Static86.aClass2_Sub13_Sub1_13.anInt3940 != Static180.anInt3988) {
			throw new RuntimeException("gpp1 pos:" + Static86.aClass2_Sub13_Sub1_13.anInt3940 + " psize:" + Static180.anInt3988);
		}
		for (local25 = 0; local25 < Static139.anInt2969; local25++) {
			if (Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[Static110.anIntArray221[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static139.anInt2969);
			}
		}
	}
}
