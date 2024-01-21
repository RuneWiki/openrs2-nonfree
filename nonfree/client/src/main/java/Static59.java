import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!he", name = "I", descriptor = "[[B")
	public static byte[][] aByteArrayArray41;

	@OriginalMember(owner = "client!he", name = "O", descriptor = "[I")
	public static int[] anIntArray293;

	@OriginalMember(owner = "client!he", name = "T", descriptor = "[Lclient!qe;")
	public static Class67[] aClass67Array1;

	@OriginalMember(owner = "client!he", name = "L", descriptor = "[I")
	public static int[] anIntArray292 = new int[100];

	@OriginalMember(owner = "client!he", name = "X", descriptor = "Lclient!eh;")
	private static Class28 aClass28_497 = Static170.method3101("as it was used to break our rules)3");

	@OriginalMember(owner = "client!he", name = "ab", descriptor = "Lclient!eh;")
	private static Class28 aClass28_499 = Static170.method3101("Loaded update list");

	@OriginalMember(owner = "client!he", name = "Y", descriptor = "Lclient!eh;")
	public static Class28 aClass28_498 = aClass28_499;

	@OriginalMember(owner = "client!he", name = "db", descriptor = "Lclient!eh;")
	public static Class28 aClass28_500 = aClass28_497;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!ah;IB)Lclient!tg;")
	public static Class3_Sub21 method1333(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte[] local13 = arg0.method1026(arg1);
		return local13 == null ? null : new Class3_Sub21(local13);
	}

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(Z)V")
	public static void method1336() {
		for (@Pc(8) Class3_Sub18 local8 = (Class3_Sub18) Static108.aClass23_11.method858(); local8 != null; local8 = (Class3_Sub18) Static108.aClass23_11.method861()) {
			if (local8.aClass3_Sub3_Sub1_3 != null) {
				Static157.aClass3_Sub3_Sub4_2.method2851(local8.aClass3_Sub3_Sub1_3);
				local8.aClass3_Sub3_Sub1_3 = null;
			}
			if (local8.aClass3_Sub3_Sub1_2 != null) {
				Static157.aClass3_Sub3_Sub4_2.method2851(local8.aClass3_Sub3_Sub1_2);
				local8.aClass3_Sub3_Sub1_2 = null;
			}
		}
		Static108.aClass23_11.method863();
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
	public static void method1337() {
		@Pc(1) int local1 = Static91.anInt4119;
		@Pc(3) int local3 = Static65.anInt2018;
		@Pc(9) int local9 = Static132.anInt3333;
		@Pc(11) int local11 = Static68.anInt2102;
		Static147.method1775(local1, local3, local9, local11, 6116423);
		Static147.method1775(local1 + 1, local3 + 1, local9 - 2, 16, 0);
		Static147.method1777(local1 + 1, local3 - -18, local9 - 2, local11 + -19, 0);
		Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2.method1811(Static171.aClass28_1435, local1 + 3, local3 + 14, 6116423, -1);
		@Pc(58) int local58 = Static73.anInt2181;
		@Pc(60) int local60 = Static35.anInt1049;
		for (@Pc(67) int local67 = 0; local67 < Static82.anInt2400; local67++) {
			@Pc(81) int local81 = local3 + (Static82.anInt2400 + (-1 - local67)) * 15 + 31;
			@Pc(83) int local83 = 16777215;
			if (local1 < local58 && local9 + local1 > local58 && local81 - 13 < local60 && local81 + 3 > local60) {
				local83 = 16776960;
			}
			Static43.aClass3_Sub2_Sub2_Sub1_Sub1_2.method1811(Static87.method1995(local67), local1 + 3, local81, local83, 0);
		}
		Static122.method2455(Static132.anInt3333, Static68.anInt2102, Static65.anInt2018, Static91.anInt4119);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIZ)Lclient!eh;")
	public static Class28 method1339(@OriginalArg(0) int arg0) {
		return Static77.method1751(arg0, true);
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(Z)V")
	public static void method1340() {
		anIntArray293 = null;
		aByteArrayArray41 = null;
		aClass28_499 = null;
		aClass28_498 = null;
		aClass67Array1 = null;
		aClass28_500 = null;
		anIntArray292 = null;
		aClass28_497 = null;
	}

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(I)Z")
	public static boolean method1341() {
		@Pc(6) long local6 = Static176.method3161();
		@Pc(12) int local12 = (int) (local6 - Static50.aLong48);
		if (local12 > 200) {
			local12 = 200;
		}
		Static163.anInt3953 += local12;
		Static50.aLong48 = local6;
		if (Static131.anInt3324 == 0 && Static61.anInt1844 == 0 && Static75.anInt2242 == 0 && Static74.anInt2213 == 0) {
			return true;
		} else if (Static121.aClass38_2 == null) {
			return false;
		} else {
			try {
				if (Static163.anInt3953 > 30000) {
					throw new IOException();
				}
				@Pc(59) Class3_Sub2_Sub6 local59;
				@Pc(64) Class3_Sub8 local64;
				while (Static61.anInt1844 < 20 && Static74.anInt2213 > 0) {
					local59 = (Class3_Sub2_Sub6) Static42.aClass87_5.method3203();
					local64 = new Class3_Sub8(4);
					local64.method1550(1);
					local64.method1526((int) local59.aLong144);
					Static121.aClass38_2.method1633(4, local64.aByteArray19);
					Static34.aClass87_4.method3200(local59.aLong144, local59);
					Static61.anInt1844++;
					Static74.anInt2213--;
				}
				while (Static131.anInt3324 < 20 && Static75.anInt2242 > 0) {
					local59 = (Class3_Sub2_Sub6) Static131.aClass88_2.method3211();
					local64 = new Class3_Sub8(4);
					local64.method1550(0);
					local64.method1526((int) local59.aLong144);
					Static121.aClass38_2.method1633(4, local64.aByteArray19);
					local59.method3174();
					Static47.aClass87_6.method3200(local59.aLong144, local59);
					Static75.anInt2242--;
					Static131.anInt3324++;
				}
				for (@Pc(156) int local156 = 0; local156 < 100; local156++) {
					@Pc(161) int local161 = Static121.aClass38_2.method1634();
					if (local161 < 0) {
						throw new IOException();
					}
					if (local161 == 0) {
						break;
					}
					Static163.anInt3953 = 0;
					@Pc(173) byte local173 = 0;
					if (Static26.aClass3_Sub2_Sub6_1 == null) {
						local173 = 8;
					} else if (Static23.anInt605 == 0) {
						local173 = 1;
					}
					@Pc(196) int local196;
					@Pc(213) int local213;
					@Pc(264) int local264;
					@Pc(279) int local279;
					if (local173 > 0) {
						local196 = local173 - Static172.aClass3_Sub8_4.anInt1948;
						if (local196 > local161) {
							local196 = local161;
						}
						Static121.aClass38_2.method1636(Static172.aClass3_Sub8_4.anInt1948, Static172.aClass3_Sub8_4.aByteArray19, local196);
						if (Static117.aByte7 != 0) {
							for (local213 = 0; local213 < local196; local213++) {
								Static172.aClass3_Sub8_4.aByteArray19[Static172.aClass3_Sub8_4.anInt1948 + local213] ^= Static117.aByte7;
							}
						}
						Static172.aClass3_Sub8_4.anInt1948 += local196;
						if (local173 > Static172.aClass3_Sub8_4.anInt1948) {
							break;
						}
						if (Static26.aClass3_Sub2_Sub6_1 == null) {
							Static172.aClass3_Sub8_4.anInt1948 = 0;
							local213 = Static172.aClass3_Sub8_4.method1545();
							local264 = Static172.aClass3_Sub8_4.method1510();
							@Pc(268) int local268 = Static172.aClass3_Sub8_4.method1545();
							@Pc(275) long local275 = (long) ((local213 << 16) + local264);
							local279 = Static172.aClass3_Sub8_4.method1540();
							@Pc(285) Class3_Sub2_Sub6 local285 = (Class3_Sub2_Sub6) Static34.aClass87_4.method3201(local275);
							Static121.aBoolean151 = true;
							if (local285 == null) {
								local285 = (Class3_Sub2_Sub6) Static47.aClass87_6.method3201(local275);
								Static121.aBoolean151 = false;
							}
							if (local285 == null) {
								throw new IOException();
							}
							Static26.aClass3_Sub2_Sub6_1 = local285;
							@Pc(311) int local311 = local268 == 0 ? 5 : 9;
							Static43.aClass3_Sub8_2 = new Class3_Sub8(local311 + local279 + Static26.aClass3_Sub2_Sub6_1.aByte2);
							Static43.aClass3_Sub8_2.method1550(local268);
							Static43.aClass3_Sub8_2.method1547(local279);
							Static23.anInt605 = 8;
							Static172.aClass3_Sub8_4.anInt1948 = 0;
						} else if (Static23.anInt605 == 0) {
							if (Static172.aClass3_Sub8_4.aByteArray19[0] == -1) {
								Static172.aClass3_Sub8_4.anInt1948 = 0;
								Static23.anInt605 = 1;
							} else {
								Static26.aClass3_Sub2_Sub6_1 = null;
							}
						}
					} else {
						local196 = Static43.aClass3_Sub8_2.aByteArray19.length - Static26.aClass3_Sub2_Sub6_1.aByte2;
						local213 = 512 - Static23.anInt605;
						if (local213 > local196 - Static43.aClass3_Sub8_2.anInt1948) {
							local213 = local196 - Static43.aClass3_Sub8_2.anInt1948;
						}
						if (local213 > local161) {
							local213 = local161;
						}
						Static121.aClass38_2.method1636(Static43.aClass3_Sub8_2.anInt1948, Static43.aClass3_Sub8_2.aByteArray19, local213);
						if (Static117.aByte7 != 0) {
							for (local264 = 0; local264 < local213; local264++) {
								Static43.aClass3_Sub8_2.aByteArray19[local264 + Static43.aClass3_Sub8_2.anInt1948] ^= Static117.aByte7;
							}
						}
						Static23.anInt605 += local213;
						Static43.aClass3_Sub8_2.anInt1948 += local213;
						if (Static43.aClass3_Sub8_2.anInt1948 == local196) {
							if (Static26.aClass3_Sub2_Sub6_1.aLong144 == 16711935L) {
								Static179.aClass3_Sub8_5 = Static43.aClass3_Sub8_2;
								for (local264 = 0; local264 < 256; local264++) {
									@Pc(451) Class7_Sub1 local451 = Static159.aClass7_Sub1Array1[local264];
									if (local451 != null) {
										Static179.aClass3_Sub8_5.anInt1948 = local264 * 8 + 5;
										local279 = Static179.aClass3_Sub8_5.method1540();
										@Pc(468) int local468 = Static179.aClass3_Sub8_5.method1540();
										local451.method1036(local279, local468);
									}
								}
							} else {
								Static103.aCRC32_2.reset();
								Static103.aCRC32_2.update(Static43.aClass3_Sub8_2.aByteArray19, 0, local196);
								local264 = (int) Static103.aCRC32_2.getValue();
								if (local264 != Static26.aClass3_Sub2_Sub6_1.anInt714) {
									try {
										Static121.aClass38_2.method1632();
									} catch (@Pc(505) Exception local505) {
									}
									Static121.aClass38_2 = null;
									Static107.anInt2762++;
									Static117.aByte7 = (byte) (Math.random() * 255.0D + 1.0D);
									return false;
								}
								Static107.anInt2762 = 0;
								Static44.anInt3938 = 0;
								Static26.aClass3_Sub2_Sub6_1.aClass7_Sub1_4.method1035((int) (Static26.aClass3_Sub2_Sub6_1.aLong144 & 0xFFFFL), Static43.aClass3_Sub8_2.aByteArray19, (Static26.aClass3_Sub2_Sub6_1.aLong144 & 0xFF0000L) == 16711680L, Static121.aBoolean151);
							}
							Static26.aClass3_Sub2_Sub6_1.method3167();
							Static43.aClass3_Sub8_2 = null;
							if (Static121.aBoolean151) {
								Static61.anInt1844--;
							} else {
								Static131.anInt3324--;
							}
							Static26.aClass3_Sub2_Sub6_1 = null;
							Static23.anInt605 = 0;
						} else {
							if (Static23.anInt605 != 512) {
								break;
							}
							Static23.anInt605 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(587) IOException local587) {
				try {
					Static121.aClass38_2.method1632();
				} catch (@Pc(592) Exception local592) {
				}
				Static121.aClass38_2 = null;
				Static44.anInt3938++;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!fd;II)V")
	public static void method1342(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (Static179.aClass3_Sub8_5 == null) {
			Static62.method1459(true, 255, 0, null, 255, (byte) 0);
			Static159.aClass7_Sub1Array1[arg1] = arg0;
		} else {
			Static179.aClass3_Sub8_5.anInt1948 = arg1 * 8 + 5;
			@Pc(16) int local16 = Static179.aClass3_Sub8_5.method1540();
			@Pc(20) int local20 = Static179.aClass3_Sub8_5.method1540();
			arg0.method1036(local16, local20);
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(III)Lclient!wb;")
	public static Class84 method1343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub20 local7 = Static149.aClass3_Sub20ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass84_1 == null ? null : local7.aClass84_1;
	}
}
