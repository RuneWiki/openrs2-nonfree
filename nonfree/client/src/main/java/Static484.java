import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "Lclient!wc;")
	private static Class394 aClass394_6;

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "Lclient!nw;")
	private static Class2_Sub43 aClass2_Sub43_3;

	@OriginalMember(owner = "client!pg", name = "r", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray34;

	@OriginalMember(owner = "client!pg", name = "C", descriptor = "Lclient!oh;")
	private static Class273 aClass273_14;

	@OriginalMember(owner = "client!pg", name = "y", descriptor = "[I")
	private static int[] anIntArray551;

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "Lclient!oh;")
	private static Class273 aClass273_15;

	@OriginalMember(owner = "client!pg", name = "p", descriptor = "Lclient!nda;")
	private static Class255 aClass255_1;

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "[J")
	private static long[] aLongArray17;

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray33 = new String[1000];

	@OriginalMember(owner = "client!pg", name = "H", descriptor = "[Lclient!gk;")
	private static final Class140[] aClass140Array1 = new Class140[50];

	@OriginalMember(owner = "client!pg", name = "z", descriptor = "Lclient!dka;")
	public static final Class85 aClass85_51 = new Class85(4);

	@OriginalMember(owner = "client!pg", name = "A", descriptor = "[[I")
	private static final int[][] anIntArrayArray49 = new int[5][5000];

	@OriginalMember(owner = "client!pg", name = "G", descriptor = "[J")
	private static final long[] aLongArray16 = new long[1000];

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
	private static int anInt7744 = 0;

	@OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
	private static int anInt7746 = 0;

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "[I")
	private static final int[] anIntArray552 = new int[5];

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "[I")
	private static final int[] anIntArray553 = new int[1000];

	@OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
	private static int anInt7750 = 0;

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
	private static int anInt7751 = 0;

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "[I")
	private static final int[] anIntArray554 = new int[3];

	@OriginalMember(owner = "client!pg", name = "v", descriptor = "Z")
	public static boolean aBoolean677 = false;

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
	private static int anInt7754 = 0;

	@OriginalMember(owner = "client!pg", name = "D", descriptor = "Ljava/lang/String;")
	public static String aString90 = null;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method6911(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub6_Sub19 local5 = Static506.method7163(-1, arg0, Static456.aClass286_9);
		if (local5 == null) {
			return;
		}
		anIntArray551 = new int[local5.anInt8766];
		aStringArray34 = new String[local5.anInt8767];
		aStringArray34[0] = arg1;
		anIntArray551[0] = arg2;
		method6915(local5, 200000);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "()V")
	public static void method6912() {
	}

	@OriginalMember(owner = "client!pg", name = "e", descriptor = "(I)J")
	private static long method6913(@OriginalArg(0) int arg0) {
		@Pc(9) Long local9 = aClass394_6.method9404(Static249.aClass150_6.anInt3649 << 16 | arg0);
		return local9 == null ? -1L : local9;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!oh;)V")
	private static void method6914(@OriginalArg(0) Class273 arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(71) Class273[] local71;
		if (arg0.anInt7410 == -1) {
			@Pc(119) int local119 = arg0.anInt7350 >>> 16;
			@Pc(123) Class273[] local123 = Static39.aClass273ArrayArray1[local119];
			if (local123 == null) {
				local71 = Static581.aClass273ArrayArray2[local119];
				@Pc(132) int local132 = local71.length;
				local123 = Static39.aClass273ArrayArray1[local119] = new Class273[local132];
				Static728.method269(local71, 0, local123, 0, local71.length);
			}
			@Pc(148) int local148;
			for (local148 = 0; local148 < local123.length && local123[local148] != arg0; local148++) {
			}
			if (local148 >= local123.length) {
				return;
			}
			Static728.method269(local123, local148 + 1, local123, local148, local123.length - local148 - 1);
			local123[local123.length - 1] = arg0;
			return;
		}
		@Pc(12) Class273 local12 = Static417.method6111(arg0.anInt7392);
		if (local12 == null) {
			return;
		}
		if (local12.aClass273Array3 == local12.aClass273Array4) {
			local12.aClass273Array3 = new Class273[local12.aClass273Array4.length];
			local12.aClass273Array3[local12.aClass273Array3.length - 1] = arg0;
			Static728.method269(local12.aClass273Array4, 0, local12.aClass273Array3, 0, arg0.anInt7410);
			Static728.method269(local12.aClass273Array4, arg0.anInt7410 + 1, local12.aClass273Array3, arg0.anInt7410, local12.aClass273Array4.length - arg0.anInt7410 - 1);
			return;
		}
		@Pc(68) int local68 = 0;
		local71 = local12.aClass273Array3;
		while (local68 < local71.length && local71[local68] != arg0) {
			local68++;
		}
		if (local68 >= local71.length) {
			return;
		}
		Static728.method269(local71, local68 + 1, local71, local68, local71.length - local68 - 1);
		local71[local12.aClass273Array3.length - 1] = arg0;
		return;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!rka;I)V")
	private static void method6915(@OriginalArg(0) Class2_Sub6_Sub19 arg0, @OriginalArg(1) int arg1) {
		anInt7746 = 0;
		anInt7744 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray635;
		@Pc(11) int[] local11 = arg0.anIntArray636;
		@Pc(13) byte local13 = -1;
		anInt7750 = 0;
		@Pc(706) int local706;
		try {
			@Pc(17) int local17 = 0;
			label381: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(34) int local34 = local8[local5];
				if (aBoolean677 && (aString90 == null || arg0.aString98 != null && arg0.aString98.indexOf(aString90) != -1)) {
					System.out.println(arg0.aString98 + ": " + local34);
				}
				if (local34 >= 150) {
					@Pc(1436) boolean local1436;
					if (local11[local5] == 1) {
						local1436 = true;
					} else {
						local1436 = false;
					}
					if (local34 >= 150 && local34 < 5000) {
						method6923(local34, local1436);
					} else if (local34 >= 5000 && local34 < 10000) {
						method6922(local34, local1436);
					} else {
						throw new IllegalStateException("Command: " + local34);
					}
				} else if (local34 == 0) {
					anIntArray553[anInt7746++] = local11[local5];
				} else {
					@Pc(96) int local96;
					if (local34 == 1) {
						local96 = local11[local5];
						anIntArray553[anInt7746++] = Static396.aClass107_1.anIntArray197[local96];
					} else if (local34 == 2) {
						local96 = local11[local5];
						Static396.aClass107_1.method2264(anIntArray553[--anInt7746], local96);
					} else if (local34 == 3) {
						aStringArray33[anInt7744++] = arg0.aStringArray39[local5];
					} else if (local34 == 6) {
						local5 += local11[local5];
					} else if (local34 == 7) {
						anInt7746 -= 2;
						if (anIntArray553[anInt7746] != anIntArray553[anInt7746 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 8) {
						anInt7746 -= 2;
						if (anIntArray553[anInt7746] == anIntArray553[anInt7746 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 9) {
						anInt7746 -= 2;
						if (anIntArray553[anInt7746] < anIntArray553[anInt7746 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 10) {
						anInt7746 -= 2;
						if (anIntArray553[anInt7746] > anIntArray553[anInt7746 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 21) {
						if (anInt7750 == 0) {
							return;
						}
						@Pc(270) Class140 local270 = aClass140Array1[--anInt7750];
						arg0 = local270.aClass2_Sub6_Sub19_1;
						local8 = arg0.anIntArray635;
						local11 = arg0.anIntArray636;
						local5 = local270.anInt3382;
						anIntArray551 = local270.anIntArray267;
						aStringArray34 = local270.aStringArray16;
						aLongArray17 = local270.aLongArray4;
					} else if (local34 == 25) {
						local96 = local11[local5];
						anIntArray553[anInt7746++] = Static396.aClass107_1.method5146(local96);
					} else if (local34 == 27) {
						local96 = local11[local5];
						Static396.aClass107_1.method2266(local96, anIntArray553[--anInt7746]);
					} else if (local34 == 31) {
						anInt7746 -= 2;
						if (anIntArray553[anInt7746] <= anIntArray553[anInt7746 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 32) {
						anInt7746 -= 2;
						if (anIntArray553[anInt7746] >= anIntArray553[anInt7746 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 33) {
						anIntArray553[anInt7746++] = anIntArray551[local11[local5]];
					} else if (local34 == 34) {
						anIntArray551[local11[local5]] = anIntArray553[--anInt7746];
					} else if (local34 == 35) {
						aStringArray33[anInt7744++] = aStringArray34[local11[local5]];
					} else if (local34 == 36) {
						aStringArray34[local11[local5]] = aStringArray33[--anInt7744];
					} else {
						@Pc(465) String local465;
						if (local34 == 37) {
							local96 = local11[local5];
							anInt7744 -= local96;
							local465 = Static655.method8994(local96, aStringArray33, anInt7744);
							aStringArray33[anInt7744++] = local465;
						} else if (local34 == 38) {
							anInt7746--;
						} else if (local34 == 39) {
							anInt7744--;
						} else if (local34 == 40) {
							local96 = local11[local5];
							@Pc(503) Class2_Sub6_Sub19 local503 = Static380.method5500(local96);
							if (local503 == null) {
								throw new RuntimeException();
							}
							@Pc(514) int[] local514 = new int[local503.anInt8766];
							@Pc(518) String[] local518 = new String[local503.anInt8767];
							@Pc(522) long[] local522 = new long[local503.anInt8769];
							for (@Pc(524) int local524 = 0; local524 < local503.anInt8765; local524++) {
								local514[local524] = anIntArray553[anInt7746 + local524 - local503.anInt8765];
							}
							for (@Pc(543) int local543 = 0; local543 < local503.anInt8771; local543++) {
								local518[local543] = aStringArray33[anInt7744 + local543 - local503.anInt8771];
							}
							for (@Pc(562) int local562 = 0; local562 < local503.anInt8768; local562++) {
								local522[local562] = aLongArray16[anInt7751 + local562 - local503.anInt8768];
							}
							anInt7746 -= local503.anInt8765;
							anInt7744 -= local503.anInt8771;
							anInt7751 -= local503.anInt8768;
							@Pc(598) Class140 local598 = new Class140();
							local598.aClass2_Sub6_Sub19_1 = arg0;
							local598.anInt3382 = local5;
							local598.anIntArray267 = anIntArray551;
							local598.aStringArray16 = aStringArray34;
							local598.aLongArray4 = aLongArray17;
							if (anInt7750 >= aClass140Array1.length) {
								throw new RuntimeException();
							}
							aClass140Array1[anInt7750++] = local598;
							arg0 = local503;
							local8 = local503.anIntArray635;
							local11 = local503.anIntArray636;
							local5 = -1;
							anIntArray551 = local514;
							aStringArray34 = local518;
							aLongArray17 = local522;
						} else if (local34 == 42) {
							anIntArray553[anInt7746++] = Static41.anIntArray266[local11[local5]];
						} else if (local34 == 43) {
							local96 = local11[local5];
							Static41.anIntArray266[local96] = anIntArray553[--anInt7746];
							Static133.method1958(local96);
							Static330.aBoolean430 |= Static317.aBooleanArray27[local96];
						} else if (local34 == 44) {
							local96 = local11[local5] >> 16;
							local706 = local11[local5] & 0xFFFF;
							@Pc(714) int local714 = anIntArray553[--anInt7746];
							if (local714 >= 0 && local714 <= 5000) {
								anIntArray552[local96] = local714;
								@Pc(732) byte local732 = -1;
								if (local706 == 105) {
									local732 = 0;
								}
								@Pc(739) int local739 = 0;
								while (true) {
									if (local739 >= local714) {
										continue label381;
									}
									anIntArrayArray49[local96][local739] = local732;
									local739++;
								}
							}
							throw new RuntimeException();
						} else if (local34 == 45) {
							local96 = local11[local5];
							local706 = anIntArray553[--anInt7746];
							if (local706 < 0 || local706 >= anIntArray552[local96]) {
								throw new RuntimeException();
							}
							anIntArray553[anInt7746++] = anIntArrayArray49[local96][local706];
						} else if (local34 == 46) {
							local96 = local11[local5];
							anInt7746 -= 2;
							local706 = anIntArray553[anInt7746];
							if (local706 < 0 || local706 >= anIntArray552[local96]) {
								throw new RuntimeException();
							}
							anIntArrayArray49[local96][local706] = anIntArray553[anInt7746 + 1];
						} else if (local34 == 47) {
							@Pc(843) String local843 = Static581.aStringArray41[local11[local5]];
							if (local843 == null) {
								local843 = "null";
							}
							aStringArray33[anInt7744++] = local843;
						} else if (local34 == 48) {
							local96 = local11[local5];
							Static581.aStringArray41[local96] = aStringArray33[--anInt7744];
							Static588.method8133(local96);
						} else if (local34 == 51) {
							@Pc(889) Class218 local889 = arg0.aClass218Array1[local11[local5]];
							@Pc(902) Class2_Sub2 local902 = (Class2_Sub2) local889.method5095((long) anIntArray553[--anInt7746], 0);
							if (local902 != null) {
								local5 += local902.anInt41;
							}
						} else if (local34 == 54) {
							aLongArray16[anInt7751++] = arg0.aLongArray18[local5];
						} else if (local34 == 55) {
							anInt7751--;
						} else if (local34 == 66) {
							aLongArray16[anInt7751++] = aLongArray17[local11[local5]];
						} else if (local34 == 67) {
							aLongArray17[local11[local5]] = aLongArray16[--anInt7751];
						} else if (local34 == 68) {
							anInt7751 -= 2;
							if (aLongArray16[anInt7751] != aLongArray16[anInt7751 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 69) {
							anInt7751 -= 2;
							if (aLongArray16[anInt7751] == aLongArray16[anInt7751 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 70) {
							anInt7751 -= 2;
							if (aLongArray16[anInt7751] < aLongArray16[anInt7751 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 71) {
							anInt7751 -= 2;
							if (aLongArray16[anInt7751] > aLongArray16[anInt7751 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 72) {
							anInt7751 -= 2;
							if (aLongArray16[anInt7751] <= aLongArray16[anInt7751 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 73) {
							anInt7751 -= 2;
							if (aLongArray16[anInt7751] >= aLongArray16[anInt7751 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 86) {
							if (anIntArray553[--anInt7746] == 1) {
								local5 += local11[local5];
							}
						} else if (local34 == 87) {
							if (anIntArray553[--anInt7746] == 0) {
								local5 += local11[local5];
							}
						} else if (local34 == 106) {
							local96 = local11[local5];
							@Pc(1178) Integer local1178 = (Integer) Static234.anObjectArray1[local96];
							if (local1178 == null) {
								@Pc(1185) Class343 local1185 = Static80.aClass90_1.method1861(local96);
								if (local1185.aChar6 == 'i' || local1185.aChar6 == '1') {
									anIntArray553[anInt7746++] = 0;
								} else {
									anIntArray553[anInt7746++] = -1;
								}
							} else {
								anIntArray553[anInt7746++] = local1178;
							}
						} else if (local34 == 107) {
							local96 = local11[local5];
							@Pc(1236) Class343 local1236 = Static80.aClass90_1.method1861(local96);
							if (local1236.aChar6 != '\u0001') {
								anIntArray553[anInt7746++] = 0;
							}
							@Pc(1256) Integer local1256 = (Integer) Static234.anObjectArray1[local1236.anInt9282];
							if (local1256 == null) {
								anIntArray553[anInt7746++] = 0;
							} else {
								@Pc(1284) int local1284 = local1236.anInt9283 == 31 ? -1 : (0x1 << local1236.anInt9283 + 1) - 1;
								anIntArray553[anInt7746++] = (local1256 & local1284) >>> local1236.anInt9278;
							}
						} else if (local34 == 108) {
							local96 = local11[local5];
							@Pc(1311) Long local1311 = (Long) Static234.anObjectArray1[local96];
							if (local1311 == null) {
								aLongArray16[anInt7751++] = -1L;
							} else {
								aLongArray16[anInt7751++] = local1311;
							}
						} else if (local34 == 109) {
							local96 = local11[local5];
							local465 = (String) Static234.anObjectArray1[local96];
							if (local465 == null) {
								aStringArray33[anInt7744++] = "";
							} else {
								aStringArray33[anInt7744++] = local465;
							}
						} else if (local34 == 112) {
							anIntArray553[anInt7746++] = method6928(local11[local5]);
						} else if (local34 == 113) {
							anIntArray553[anInt7746++] = method6925(local11[local5]);
						} else if (local34 == 114) {
							aLongArray16[anInt7751++] = method6913(local11[local5]);
						} else if (local34 == 115) {
							aStringArray33[anInt7744++] = method6917(local11[local5]);
						}
					}
				}
			}
		} catch (@Pc(1479) Exception local1479) {
			@Pc(1484) StringBuffer local1484 = new StringBuffer(30);
			local1484.append("CS2: ").append(arg0.aLong352).append(" ");
			for (local706 = anInt7750 - 1; local706 >= 0; local706--) {
				local1484.append("v: ").append(aClass140Array1[local706].aClass2_Sub6_Sub19_1.aLong352).append(" ");
			}
			local1484.append("op: ").append(local13);
			Static329.method4572(local1484.toString(), local1479);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!kia;I)V")
	private static void method6916(@OriginalArg(0) Class2_Sub36 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray2;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub6_Sub19 local12 = Static380.method5500(local8);
		if (local12 == null) {
			return;
		}
		anIntArray551 = new int[local12.anInt8766];
		@Pc(22) int local22 = 0;
		aStringArray34 = new String[local12.anInt8767];
		@Pc(28) int local28 = 0;
		aLongArray17 = new long[local12.anInt8769];
		@Pc(34) int local34 = 0;
		for (@Pc(36) int local36 = 1; local36 < local2.length; local36++) {
			if (local2[local36] instanceof Integer) {
				@Pc(48) int local48 = (Integer) local2[local36];
				if (local48 == -2147483647) {
					local48 = arg0.anInt5077;
				}
				if (local48 == -2147483646) {
					local48 = arg0.anInt5073;
				}
				if (local48 == -2147483645) {
					local48 = arg0.aClass273_6 == null ? -1 : arg0.aClass273_6.anInt7350;
				}
				if (local48 == -2147483644) {
					local48 = arg0.anInt5078;
				}
				if (local48 == -2147483643) {
					local48 = arg0.aClass273_6 == null ? -1 : arg0.aClass273_6.anInt7410;
				}
				if (local48 == -2147483642) {
					local48 = arg0.aClass273_7 == null ? -1 : arg0.aClass273_7.anInt7350;
				}
				if (local48 == -2147483641) {
					local48 = arg0.aClass273_7 == null ? -1 : arg0.aClass273_7.anInt7410;
				}
				if (local48 == -2147483640) {
					local48 = arg0.anInt5075;
				}
				if (local48 == -2147483639) {
					local48 = arg0.anInt5076;
				}
				anIntArray551[local22++] = local48;
			} else if (local2[local36] instanceof String) {
				@Pc(154) String local154 = (String) local2[local36];
				if (local154.equals("event_opbase")) {
					local154 = arg0.aString58;
				}
				aStringArray34[local28++] = local154;
			} else if (local2[local36] instanceof Long) {
				@Pc(180) long local180 = (Long) local2[local36];
				aLongArray17[local34++] = local180;
			}
		}
		anInt7754 = arg0.anInt5072;
		method6915(local12, arg1);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)Ljava/lang/String;")
	private static String method6917(@OriginalArg(0) int arg0) {
		@Pc(9) String local9 = aClass394_6.method9405(Static249.aClass150_6.anInt3649 << 16 | arg0);
		return local9 == null ? "" : local9;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!pf;II)V")
	public static void method6918(@OriginalArg(0) Class286 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub6_Sub19 local5 = Static506.method7163(arg2, arg1, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray551 = new int[local5.anInt8766];
		aStringArray34 = new String[local5.anInt8767];
		if (local5.aClass286_13 == Static30.aClass286_2 || local5.aClass286_13 == Static21.aClass286_1 || local5.aClass286_13 == Static328.aClass286_7) {
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = 0;
			if (Static388.aClass273_10 != null) {
				local35 = Static388.aClass273_10.anInt7373;
				local37 = Static388.aClass273_10.anInt7346;
			}
			anIntArray551[0] = Static402.aClass138_1.method4767() - local35;
			anIntArray551[1] = Static402.aClass138_1.method4771() - local37;
		}
		method6915(local5, 200000);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!kia;)V")
	public static void method6919(@OriginalArg(0) Class2_Sub36 arg0) {
		method6916(arg0, 200000);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(C)I")
	private static int method6920(@OriginalArg(0) char arg0) {
		return Static501.method5236(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
	public static void method6921(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static268.method3778(arg0)) {
			return;
		}
		@Pc(14) Class273[] local14 = Static581.aClass273ArrayArray2[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(21) Class273 local21 = local14[local16];
			if (local21.anObjectArray10 != null) {
				@Pc(28) Class2_Sub36 local28 = new Class2_Sub36();
				local28.aClass273_6 = local21;
				local28.anObjectArray2 = local21.anObjectArray10;
				method6916(local28, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(IZ)V")
	private static void method6922(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(109) int local109;
		@Pc(375) int local375;
		@Pc(95) String local95;
		@Pc(192) int local192;
		@Pc(1578) boolean local1578;
		@Pc(834) int local834;
		@Pc(115) int local115;
		@Pc(198) String local198;
		@Pc(101) String local101;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray553[anInt7746++] = Static103.anInt10706;
				return;
			}
			@Pc(57) Class221 local57;
			@Pc(63) Class2_Sub33 local63;
			if (arg0 == 5001) {
				anInt7746 -= 3;
				Static103.anInt10706 = anIntArray553[anInt7746];
				Static536.aClass139_3 = Static714.method9500(anIntArray553[anInt7746 + 1]);
				if (Static536.aClass139_3 == null) {
					Static536.aClass139_3 = Static426.aClass139_2;
				}
				Static690.anInt10624 = anIntArray553[anInt7746 + 2];
				local57 = Static87.method1292();
				local63 = Static592.method8154(Static209.aClass349_54, local57.aClass48_1);
				local63.aClass2_Sub20_Sub2_1.method8584(Static103.anInt10706);
				local63.aClass2_Sub20_Sub2_1.method8584(Static536.aClass139_3.anInt3378);
				local63.aClass2_Sub20_Sub2_1.method8584(Static690.anInt10624);
				local57.method5173(local63);
				return;
			}
			if (arg0 == 5002) {
				anInt7744 -= 2;
				local95 = aStringArray33[anInt7744];
				local101 = aStringArray33[anInt7744 + 1];
				anInt7746 -= 2;
				local109 = anIntArray553[anInt7746];
				local115 = anIntArray553[anInt7746 + 1];
				if (local101 == null) {
					local101 = "";
				}
				if (local101.length() > 80) {
					local101 = local101.substring(0, 80);
				}
				@Pc(135) Class221 local135 = Static87.method1292();
				@Pc(141) Class2_Sub33 local141 = Static592.method8154(Static262.aClass349_66, local135.aClass48_1);
				local141.aClass2_Sub20_Sub2_1.method8584(Static125.method1890(local95) + Static125.method1890(local101) + 2);
				local141.aClass2_Sub20_Sub2_1.method8541(local95);
				local141.aClass2_Sub20_Sub2_1.method8584(local109 - 1);
				local141.aClass2_Sub20_Sub2_1.method8584(local115);
				local141.aClass2_Sub20_Sub2_1.method8541(local101);
				local135.method5173(local141);
				return;
			}
			@Pc(196) Class405 local196;
			if (arg0 == 5003) {
				local192 = anIntArray553[--anInt7746];
				local196 = Static617.method8385(local192);
				local198 = "";
				if (local196 != null && local196.aString132 != null) {
					local198 = local196.aString132;
				}
				aStringArray33[anInt7744++] = local198;
				return;
			}
			if (arg0 == 5004) {
				local192 = anIntArray553[--anInt7746];
				local196 = Static617.method8385(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt10904;
				}
				anIntArray553[anInt7746++] = local109;
				return;
			}
			if (arg0 == 5005) {
				if (Static536.aClass139_3 == null) {
					anIntArray553[anInt7746++] = -1;
					return;
				}
				anIntArray553[anInt7746++] = Static536.aClass139_3.anInt3378;
				return;
			}
			@Pc(295) Class2_Sub33 local295;
			@Pc(289) Class221 local289;
			if (arg0 == 5006) {
				local192 = anIntArray553[--anInt7746];
				local289 = Static87.method1292();
				local295 = Static592.method8154(Static604.aClass349_138, local289.aClass48_1);
				local295.aClass2_Sub20_Sub2_1.method8584(local192);
				local289.method5173(local295);
				return;
			}
			if (arg0 == 5008) {
				local95 = aStringArray33[--anInt7744];
				method6927(local95, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt7744 -= 2;
				local95 = aStringArray33[anInt7744];
				local101 = aStringArray33[anInt7744 + 1];
				if (Static565.anInt8888 != 0 || (!Static70.aBoolean137 || Static337.aBoolean443) && !Static329.aBoolean429) {
					@Pc(360) Class221 local360 = Static87.method1292();
					@Pc(366) Class2_Sub33 local366 = Static592.method8154(Static177.aClass349_51, local360.aClass48_1);
					local366.aClass2_Sub20_Sub2_1.method8584(0);
					local375 = local366.aClass2_Sub20_Sub2_1.anInt9723;
					local366.aClass2_Sub20_Sub2_1.method8541(local95);
					Static52.method744(local101, local366.aClass2_Sub20_Sub2_1);
					local366.aClass2_Sub20_Sub2_1.method8547(local366.aClass2_Sub20_Sub2_1.anInt9723 - local375);
					local360.method5173(local366);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local192 = anIntArray553[--anInt7746];
				local196 = Static617.method8385(local192);
				local198 = "";
				if (local196 != null && local196.aString128 != null) {
					local198 = local196.aString128;
				}
				aStringArray33[anInt7744++] = local198;
				return;
			}
			if (arg0 == 5011) {
				local192 = anIntArray553[--anInt7746];
				local196 = Static617.method8385(local192);
				local198 = "";
				if (local196 != null && local196.aString129 != null) {
					local198 = local196.aString129;
				}
				aStringArray33[anInt7744++] = local198;
				return;
			}
			if (arg0 == 5012) {
				local192 = anIntArray553[--anInt7746];
				local196 = Static617.method8385(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt10902;
				}
				anIntArray553[anInt7746++] = local109;
				return;
			}
			if (arg0 == 5015) {
				if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2 == null || Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aString3 == null) {
					local95 = "";
				} else {
					local95 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.method738();
				}
				aStringArray33[anInt7744++] = local95;
				return;
			}
			if (arg0 == 5016) {
				anIntArray553[anInt7746++] = Static690.anInt10624;
				return;
			}
			if (arg0 == 5017) {
				anIntArray553[anInt7746++] = Static727.method9878();
				return;
			}
			if (arg0 == 5018) {
				local192 = anIntArray553[--anInt7746];
				local196 = Static617.method8385(local192);
				local109 = 0;
				if (local196 != null) {
					local109 = local196.anInt10901;
				}
				anIntArray553[anInt7746++] = local109;
				return;
			}
			if (arg0 == 5019) {
				local192 = anIntArray553[--anInt7746];
				local196 = Static617.method8385(local192);
				local198 = "";
				if (local196 != null && local196.aString131 != null) {
					local198 = local196.aString131;
				}
				aStringArray33[anInt7744++] = local198;
				return;
			}
			if (arg0 == 5020) {
				if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2 == null || Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aString3 == null) {
					local95 = "";
				} else {
					local95 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.method729();
				}
				aStringArray33[anInt7744++] = local95;
				return;
			}
			if (arg0 == 5023) {
				local192 = anIntArray553[--anInt7746];
				local196 = Static617.method8385(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt10905;
				}
				anIntArray553[anInt7746++] = local109;
				return;
			}
			if (arg0 == 5024) {
				local192 = anIntArray553[--anInt7746];
				local196 = Static617.method8385(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt10908;
				}
				anIntArray553[anInt7746++] = local109;
				return;
			}
			if (arg0 == 5025) {
				local192 = anIntArray553[--anInt7746];
				local196 = Static617.method8385(local192);
				local198 = "";
				if (local196 != null && local196.aString130 != null) {
					local198 = local196.aString130;
				}
				aStringArray33[anInt7744++] = local198;
				return;
			}
			if (arg0 == 5050) {
				local192 = anIntArray553[--anInt7746];
				aStringArray33[anInt7744++] = Static468.aClass69_1.method1459(local192).aString19;
				return;
			}
			@Pc(793) Class2_Sub6_Sub3 local793;
			if (arg0 == 5051) {
				local192 = anIntArray553[--anInt7746];
				local793 = Static468.aClass69_1.method1459(local192);
				if (local793.anIntArray160 == null) {
					anIntArray553[anInt7746++] = 0;
					return;
				}
				anIntArray553[anInt7746++] = local793.anIntArray160.length;
				return;
			}
			if (arg0 == 5052) {
				anInt7746 -= 2;
				local192 = anIntArray553[anInt7746];
				local834 = anIntArray553[anInt7746 + 1];
				@Pc(839) Class2_Sub6_Sub3 local839 = Static468.aClass69_1.method1459(local192);
				local115 = local839.anIntArray160[local834];
				anIntArray553[anInt7746++] = local115;
				return;
			}
			if (arg0 == 5053) {
				local192 = anIntArray553[--anInt7746];
				local793 = Static468.aClass69_1.method1459(local192);
				if (local793.anIntArray161 == null) {
					anIntArray553[anInt7746++] = 0;
					return;
				}
				anIntArray553[anInt7746++] = local793.anIntArray161.length;
				return;
			}
			if (arg0 == 5054) {
				anInt7746 -= 2;
				local192 = anIntArray553[anInt7746];
				local834 = anIntArray553[anInt7746 + 1];
				anIntArray553[anInt7746++] = Static468.aClass69_1.method1459(local192).anIntArray161[local834];
				return;
			}
			if (arg0 == 5055) {
				local192 = anIntArray553[--anInt7746];
				aStringArray33[anInt7744++] = Static645.aClass180_2.method3843(local192).method4313();
				return;
			}
			if (arg0 == 5056) {
				local192 = anIntArray553[--anInt7746];
				@Pc(966) Class2_Sub6_Sub8 local966 = Static645.aClass180_2.method3843(local192);
				if (local966.anIntArray342 == null) {
					anIntArray553[anInt7746++] = 0;
					return;
				}
				anIntArray553[anInt7746++] = local966.anIntArray342.length;
				return;
			}
			if (arg0 == 5057) {
				anInt7746 -= 2;
				local192 = anIntArray553[anInt7746];
				local834 = anIntArray553[anInt7746 + 1];
				anIntArray553[anInt7746++] = Static645.aClass180_2.method3843(local192).anIntArray342[local834];
				return;
			}
			if (arg0 == 5058) {
				aClass255_1 = new Class255();
				aClass255_1.anInt6827 = anIntArray553[--anInt7746];
				aClass255_1.aClass2_Sub6_Sub8_1 = Static645.aClass180_2.method3843(aClass255_1.anInt6827);
				aClass255_1.anIntArray478 = new int[aClass255_1.aClass2_Sub6_Sub8_1.method4309()];
				return;
			}
			if (arg0 == 5059) {
				local57 = Static87.method1292();
				local63 = Static592.method8154(Static109.aClass349_32, local57.aClass48_1);
				local63.aClass2_Sub20_Sub2_1.method8584(0);
				local109 = local63.aClass2_Sub20_Sub2_1.anInt9723;
				local63.aClass2_Sub20_Sub2_1.method8584(0);
				local63.aClass2_Sub20_Sub2_1.method8551(aClass255_1.anInt6827);
				aClass255_1.aClass2_Sub6_Sub8_1.method4321(aClass255_1.anIntArray478, local63.aClass2_Sub20_Sub2_1);
				local63.aClass2_Sub20_Sub2_1.method8547(local63.aClass2_Sub20_Sub2_1.anInt9723 - local109);
				local57.method5173(local63);
				return;
			}
			if (arg0 == 5060) {
				local95 = aStringArray33[--anInt7744];
				local289 = Static87.method1292();
				local295 = Static592.method8154(Static39.aClass349_13, local289.aClass48_1);
				local295.aClass2_Sub20_Sub2_1.method8584(0);
				local115 = local295.aClass2_Sub20_Sub2_1.anInt9723;
				local295.aClass2_Sub20_Sub2_1.method8541(local95);
				local295.aClass2_Sub20_Sub2_1.method8551(aClass255_1.anInt6827);
				aClass255_1.aClass2_Sub6_Sub8_1.method4321(aClass255_1.anIntArray478, local295.aClass2_Sub20_Sub2_1);
				local295.aClass2_Sub20_Sub2_1.method8547(local295.aClass2_Sub20_Sub2_1.anInt9723 - local115);
				local289.method5173(local295);
				return;
			}
			if (arg0 == 5061) {
				local57 = Static87.method1292();
				local63 = Static592.method8154(Static109.aClass349_32, local57.aClass48_1);
				local63.aClass2_Sub20_Sub2_1.method8584(0);
				local109 = local63.aClass2_Sub20_Sub2_1.anInt9723;
				local63.aClass2_Sub20_Sub2_1.method8584(1);
				local63.aClass2_Sub20_Sub2_1.method8551(aClass255_1.anInt6827);
				aClass255_1.aClass2_Sub6_Sub8_1.method4321(aClass255_1.anIntArray478, local63.aClass2_Sub20_Sub2_1);
				local63.aClass2_Sub20_Sub2_1.method8547(local63.aClass2_Sub20_Sub2_1.anInt9723 - local109);
				local57.method5173(local63);
				return;
			}
			if (arg0 == 5062) {
				anInt7746 -= 2;
				local192 = anIntArray553[anInt7746];
				local834 = anIntArray553[anInt7746 + 1];
				anIntArray553[anInt7746++] = Static468.aClass69_1.method1459(local192).aCharArray3[local834];
				return;
			}
			if (arg0 == 5063) {
				anInt7746 -= 2;
				local192 = anIntArray553[anInt7746];
				local834 = anIntArray553[anInt7746 + 1];
				anIntArray553[anInt7746++] = Static468.aClass69_1.method1459(local192).aCharArray2[local834];
				return;
			}
			if (arg0 == 5064) {
				anInt7746 -= 2;
				local192 = anIntArray553[anInt7746];
				local834 = anIntArray553[anInt7746 + 1];
				if (local834 == -1) {
					anIntArray553[anInt7746++] = -1;
					return;
				}
				anIntArray553[anInt7746++] = Static468.aClass69_1.method1459(local192).method1876((char) local834);
				return;
			}
			if (arg0 == 5065) {
				anInt7746 -= 2;
				local192 = anIntArray553[anInt7746];
				local834 = anIntArray553[anInt7746 + 1];
				if (local834 == -1) {
					anIntArray553[anInt7746++] = -1;
					return;
				}
				anIntArray553[anInt7746++] = Static468.aClass69_1.method1459(local192).method1882((char) local834);
				return;
			}
			if (arg0 == 5066) {
				local192 = anIntArray553[--anInt7746];
				anIntArray553[anInt7746++] = Static645.aClass180_2.method3843(local192).method4309();
				return;
			}
			if (arg0 == 5067) {
				anInt7746 -= 2;
				local192 = anIntArray553[anInt7746];
				local834 = anIntArray553[anInt7746 + 1];
				local109 = Static645.aClass180_2.method3843(local192).method4317(local834).anInt4601;
				anIntArray553[anInt7746++] = local109;
				return;
			}
			if (arg0 == 5068) {
				anInt7746 -= 2;
				local192 = anIntArray553[anInt7746];
				local834 = anIntArray553[anInt7746 + 1];
				aClass255_1.anIntArray478[local192] = local834;
				return;
			}
			if (arg0 == 5069) {
				anInt7746 -= 2;
				local192 = anIntArray553[anInt7746];
				local834 = anIntArray553[anInt7746 + 1];
				aClass255_1.anIntArray478[local192] = local834;
				return;
			}
			if (arg0 == 5070) {
				anInt7746 -= 3;
				local192 = anIntArray553[anInt7746];
				local834 = anIntArray553[anInt7746 + 1];
				local109 = anIntArray553[anInt7746 + 2];
				@Pc(1526) Class2_Sub6_Sub8 local1526 = Static645.aClass180_2.method3843(local192);
				if (local1526.method4317(local834).anInt4601 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray553[anInt7746++] = local1526.method4319(local834, local109);
				return;
			}
			if (arg0 == 5071) {
				local95 = aStringArray33[--anInt7744];
				local1578 = anIntArray553[--anInt7746] == 1;
				Static720.method9582(local1578, local95);
				anIntArray553[anInt7746++] = Static354.anInt5659;
				return;
			}
			if (arg0 == 5072) {
				if (Static727.aShortArray149 != null && Static465.anInt7549 < Static354.anInt5659) {
					anIntArray553[anInt7746++] = Static727.aShortArray149[Static465.anInt7549++] & 0xFFFF;
					return;
				}
				anIntArray553[anInt7746++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static465.anInt7549 = 0;
				return;
			}
			if (arg0 == 5074) {
				local57 = Static87.method1292();
				local63 = Static592.method8154(Static109.aClass349_32, local57.aClass48_1);
				local63.aClass2_Sub20_Sub2_1.method8584(0);
				local109 = local63.aClass2_Sub20_Sub2_1.anInt9723;
				local63.aClass2_Sub20_Sub2_1.method8584(2);
				local63.aClass2_Sub20_Sub2_1.method8551(aClass255_1.anInt6827);
				aClass255_1.aClass2_Sub6_Sub8_1.method4321(aClass255_1.anIntArray478, local63.aClass2_Sub20_Sub2_1);
				local63.aClass2_Sub20_Sub2_1.method8547(local63.aClass2_Sub20_Sub2_1.anInt9723 - local109);
				local57.method5173(local63);
				return;
			}
			if (arg0 == 5075) {
				local57 = Static87.method1292();
				local63 = Static592.method8154(Static109.aClass349_32, local57.aClass48_1);
				local63.aClass2_Sub20_Sub2_1.method8584(0);
				local109 = local63.aClass2_Sub20_Sub2_1.anInt9723;
				local63.aClass2_Sub20_Sub2_1.method8584(3);
				local63.aClass2_Sub20_Sub2_1.method8551(aClass255_1.anInt6827);
				aClass255_1.aClass2_Sub6_Sub8_1.method4321(aClass255_1.anIntArray478, local63.aClass2_Sub20_Sub2_1);
				local63.aClass2_Sub20_Sub2_1.method8547(local63.aClass2_Sub20_Sub2_1.anInt9723 - local109);
				local57.method5173(local63);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static102.aClass184_1.method6058(86)) {
					anIntArray553[anInt7746++] = 1;
					return;
				}
				anIntArray553[anInt7746++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static102.aClass184_1.method6058(82)) {
					anIntArray553[anInt7746++] = 1;
					return;
				}
				anIntArray553[anInt7746++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static102.aClass184_1.method6058(81)) {
					anIntArray553[anInt7746++] = 1;
					return;
				}
				anIntArray553[anInt7746++] = 0;
				return;
			}
		} else {
			@Pc(2331) boolean local2331;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static715.method9513(anIntArray553[--anInt7746]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray553[anInt7746++] = Static517.method7327();
					return;
				}
				if (arg0 == 5205) {
					Static675.method9177(-1, false, -1, anIntArray553[--anInt7746]);
					return;
				}
				@Pc(1908) Class2_Sub6_Sub21 local1908;
				if (arg0 == 5206) {
					local192 = anIntArray553[--anInt7746];
					local1908 = Static90.method2905(local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					if (local1908 == null) {
						anIntArray553[anInt7746++] = -1;
						return;
					}
					anIntArray553[anInt7746++] = local1908.anInt9651;
					return;
				}
				@Pc(1942) Class2_Sub6_Sub21 local1942;
				if (arg0 == 5207) {
					local1942 = Static90.method2918(anIntArray553[--anInt7746]);
					if (local1942 != null && local1942.aString109 != null) {
						aStringArray33[anInt7744++] = local1942.aString109;
						return;
					}
					aStringArray33[anInt7744++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray553[anInt7746++] = Static247.anInt3838;
					anIntArray553[anInt7746++] = Static687.anInt10575;
					return;
				}
				if (arg0 == 5209) {
					anIntArray553[anInt7746++] = Static681.anInt10509 + Static90.anInt3353;
					anIntArray553[anInt7746++] = Static704.anInt10775 + Static90.anInt3348;
					return;
				}
				if (arg0 == 5210) {
					local192 = anIntArray553[--anInt7746];
					local1908 = Static90.method2918(local192);
					if (local1908 == null) {
						anIntArray553[anInt7746++] = 0;
						anIntArray553[anInt7746++] = 0;
						return;
					}
					anIntArray553[anInt7746++] = local1908.anInt9639 >> 14 & 0x3FFF;
					anIntArray553[anInt7746++] = local1908.anInt9639 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local192 = anIntArray553[--anInt7746];
					local1908 = Static90.method2918(local192);
					if (local1908 == null) {
						anIntArray553[anInt7746++] = 0;
						anIntArray553[anInt7746++] = 0;
						return;
					}
					anIntArray553[anInt7746++] = local1908.anInt9643 - local1908.anInt9640;
					anIntArray553[anInt7746++] = local1908.anInt9653 - local1908.anInt9647;
					return;
				}
				@Pc(2139) Class2_Sub51 local2139;
				if (arg0 == 5212) {
					local2139 = Static440.method6370();
					if (local2139 == null) {
						anIntArray553[anInt7746++] = -1;
						anIntArray553[anInt7746++] = -1;
						return;
					}
					anIntArray553[anInt7746++] = local2139.anInt9158;
					local834 = local2139.anInt9166 << 28 | local2139.anInt9165 + Static90.anInt3353 << 14 | local2139.anInt9167 + Static90.anInt3348;
					anIntArray553[anInt7746++] = local834;
					return;
				}
				if (arg0 == 5213) {
					local2139 = Static221.method3095();
					if (local2139 == null) {
						anIntArray553[anInt7746++] = -1;
						anIntArray553[anInt7746++] = -1;
						return;
					}
					anIntArray553[anInt7746++] = local2139.anInt9158;
					local834 = local2139.anInt9166 << 28 | local2139.anInt9165 + Static90.anInt3353 << 14 | local2139.anInt9167 + Static90.anInt3348;
					anIntArray553[anInt7746++] = local834;
					return;
				}
				@Pc(2289) boolean local2289;
				if (arg0 == 5214) {
					local192 = anIntArray553[--anInt7746];
					local1908 = Static199.method2816();
					if (local1908 != null) {
						local2289 = local1908.method8515(local192 >> 28 & 0x3, local192 >> 14 & 0x3FFF, anIntArray554, local192 & 0x3FFF);
						if (local2289) {
							Static214.method2994(anIntArray554[1], anIntArray554[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt7746 -= 2;
					local192 = anIntArray553[anInt7746];
					local834 = anIntArray553[anInt7746 + 1];
					@Pc(2329) Class388 local2329 = Static90.method2913(local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					local2331 = false;
					for (@Pc(2336) Class2_Sub6_Sub21 local2336 = (Class2_Sub6_Sub21) local2329.method9213(); local2336 != null; local2336 = (Class2_Sub6_Sub21) local2329.method9212()) {
						if (local2336.anInt9651 == local834) {
							local2331 = true;
							break;
						}
					}
					if (local2331) {
						anIntArray553[anInt7746++] = 1;
						return;
					}
					anIntArray553[anInt7746++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local192 = anIntArray553[--anInt7746];
					local1908 = Static90.method2918(local192);
					if (local1908 == null) {
						anIntArray553[anInt7746++] = -1;
						return;
					}
					anIntArray553[anInt7746++] = local1908.anInt9646;
					return;
				}
				if (arg0 == 5220) {
					anIntArray553[anInt7746++] = Static424.anInt6882 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local192 = anIntArray553[--anInt7746];
					Static214.method2994(local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1942 = Static199.method2816();
					if (local1942 != null) {
						local1578 = local1942.method8514(Static704.anInt10775 + Static90.anInt3348, anIntArray554, Static681.anInt10509 + Static90.anInt3353);
						if (local1578) {
							anIntArray553[anInt7746++] = anIntArray554[1];
							anIntArray553[anInt7746++] = anIntArray554[2];
							return;
						}
						anIntArray553[anInt7746++] = -1;
						anIntArray553[anInt7746++] = -1;
						return;
					}
					anIntArray553[anInt7746++] = -1;
					anIntArray553[anInt7746++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt7746 -= 2;
					local192 = anIntArray553[anInt7746];
					local834 = anIntArray553[anInt7746 + 1];
					Static675.method9177(local834 >> 14 & 0x3FFF, false, local834 & 0x3FFF, local192);
					return;
				}
				if (arg0 == 5224) {
					local192 = anIntArray553[--anInt7746];
					local1908 = Static199.method2816();
					if (local1908 != null) {
						local2289 = local1908.method8515(local192 >> 28 & 0x3, local192 >> 14 & 0x3FFF, anIntArray554, local192 & 0x3FFF);
						if (local2289) {
							anIntArray553[anInt7746++] = anIntArray554[1];
							anIntArray553[anInt7746++] = anIntArray554[2];
							return;
						}
						anIntArray553[anInt7746++] = -1;
						anIntArray553[anInt7746++] = -1;
						return;
					}
					anIntArray553[anInt7746++] = -1;
					anIntArray553[anInt7746++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local192 = anIntArray553[--anInt7746];
					local1908 = Static199.method2816();
					if (local1908 != null) {
						local2289 = local1908.method8514(local192 & 0x3FFF, anIntArray554, local192 >> 14 & 0x3FFF);
						if (local2289) {
							anIntArray553[anInt7746++] = anIntArray554[1];
							anIntArray553[anInt7746++] = anIntArray554[2];
							return;
						}
						anIntArray553[anInt7746++] = -1;
						anIntArray553[anInt7746++] = -1;
						return;
					}
					anIntArray553[anInt7746++] = -1;
					anIntArray553[anInt7746++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static59.method922(anIntArray553[--anInt7746]);
					return;
				}
				if (arg0 == 5227) {
					anInt7746 -= 2;
					local192 = anIntArray553[anInt7746];
					local834 = anIntArray553[anInt7746 + 1];
					Static675.method9177(local834 >> 14 & 0x3FFF, true, local834 & 0x3FFF, local192);
					return;
				}
				if (arg0 == 5228) {
					Static649.aBoolean879 = anIntArray553[--anInt7746] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray553[anInt7746++] = Static649.aBoolean879 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local192 = anIntArray553[--anInt7746];
					Static163.method2435(local192);
					return;
				}
				@Pc(2867) Class2 local2867;
				if (arg0 == 5231) {
					anInt7746 -= 2;
					local192 = anIntArray553[anInt7746];
					local1578 = anIntArray553[anInt7746 + 1] == 1;
					if (Static440.aClass218_32 != null) {
						local2867 = Static440.aClass218_32.method5095((long) local192, 0);
						if (local2867 != null && !local1578) {
							local2867.method9872();
							return;
						}
						if (local2867 == null && local1578) {
							local2867 = new Class2();
							Static440.aClass218_32.method5099(local2867, (long) local192);
						}
					}
					return;
				}
				@Pc(2914) Class2 local2914;
				if (arg0 == 5232) {
					local192 = anIntArray553[--anInt7746];
					if (Static440.aClass218_32 != null) {
						local2914 = Static440.aClass218_32.method5095((long) local192, 0);
						anIntArray553[anInt7746++] = local2914 == null ? 0 : 1;
						return;
					}
					anIntArray553[anInt7746++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt7746 -= 2;
					local192 = anIntArray553[anInt7746];
					local1578 = anIntArray553[anInt7746 + 1] == 1;
					if (Static413.aClass218_27 != null) {
						local2867 = Static413.aClass218_27.method5095((long) local192, 0);
						if (local2867 != null && !local1578) {
							local2867.method9872();
							return;
						}
						if (local2867 == null && local1578) {
							local2867 = new Class2();
							Static413.aClass218_27.method5099(local2867, (long) local192);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local192 = anIntArray553[--anInt7746];
					if (Static413.aClass218_27 != null) {
						local2914 = Static413.aClass218_27.method5095((long) local192, 0);
						anIntArray553[anInt7746++] = local2914 == null ? 0 : 1;
						return;
					}
					anIntArray553[anInt7746++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray553[anInt7746++] = Static90.aClass2_Sub6_Sub21_2 == null ? -1 : Static90.aClass2_Sub6_Sub21_2.anInt9651;
					return;
				}
				if (arg0 == 5236) {
					anInt7746 -= 2;
					local192 = anIntArray553[anInt7746];
					local834 = anIntArray553[anInt7746 + 1];
					local109 = local834 >> 14 & 0x3FFF;
					local115 = local834 & 0x3FFF;
					local375 = Static420.method6143(local192, local115, local109);
					if (local375 < 0) {
						anIntArray553[anInt7746++] = -1;
						return;
					}
					anIntArray553[anInt7746++] = local375;
					return;
				}
				if (arg0 == 5237) {
					Static257.method3647();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt7746 -= 2;
					local192 = anIntArray553[anInt7746];
					local834 = anIntArray553[anInt7746 + 1];
					Static309.method4316(false, local192, local834, 3);
					anIntArray553[anInt7746++] = Static249.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static249.aFrame1 != null) {
						Static309.method4316(false, -1, -1, Static650.aClass2_Sub30_29.aClass11_Sub30_1.method9623());
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(3186) Class242[] local3186 = Static578.method8062();
					anIntArray553[anInt7746++] = local3186.length;
					return;
				}
				if (arg0 == 5303) {
					local192 = anIntArray553[--anInt7746];
					@Pc(3210) Class242[] local3210 = Static578.method8062();
					anIntArray553[anInt7746++] = local3210[local192].anInt6519;
					anIntArray553[anInt7746++] = local3210[local192].anInt6517;
					return;
				}
				if (arg0 == 5305) {
					local192 = Static310.anInt4754;
					local834 = Static595.anInt7809;
					local109 = -1;
					@Pc(3245) Class242[] local3245 = Static578.method8062();
					for (local375 = 0; local375 < local3245.length; local375++) {
						@Pc(3252) Class242 local3252 = local3245[local375];
						if (local3252.anInt6519 == local192 && local3252.anInt6517 == local834) {
							local109 = local375;
							break;
						}
					}
					anIntArray553[anInt7746++] = local109;
					return;
				}
				if (arg0 == 5306) {
					anIntArray553[anInt7746++] = Static193.method2756();
					return;
				}
				if (arg0 == 5307) {
					local192 = anIntArray553[--anInt7746];
					if (local192 >= 1 && local192 <= 2) {
						Static309.method4316(false, -1, -1, local192);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub30_1.method9623();
					return;
				}
				if (arg0 == 5309) {
					local192 = anIntArray553[--anInt7746];
					if (local192 >= 1 && local192 <= 2) {
						Static650.aClass2_Sub30_29.method2988(local192, Static650.aClass2_Sub30_29.aClass11_Sub30_1);
						Static650.aClass2_Sub30_29.method2988(local192, Static650.aClass2_Sub30_29.aClass11_Sub30_2);
						Static610.method9380();
						return;
					}
					return;
				}
			} else {
				@Pc(3561) int local3561;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt7744 -= 2;
						local95 = aStringArray33[anInt7744];
						local101 = aStringArray33[anInt7744 + 1];
						local109 = anIntArray553[--anInt7746];
						@Pc(3411) Class221 local3411 = Static87.method1292();
						@Pc(3417) Class2_Sub33 local3417 = Static592.method8154(Static438.aClass349_100, local3411.aClass48_1);
						local3417.aClass2_Sub20_Sub2_1.method8584(Static125.method1890(local95) + Static125.method1890(local101) + 1);
						local3417.aClass2_Sub20_Sub2_1.method8541(local95);
						local3417.aClass2_Sub20_Sub2_1.method8541(local101);
						local3417.aClass2_Sub20_Sub2_1.method8584(local109);
						local3411.method5173(local3417);
						return;
					}
					if (arg0 == 5401) {
						anInt7746 -= 2;
						Static718.aShortArray148[anIntArray553[anInt7746]] = (short) Static370.method3238(anIntArray553[anInt7746 + 1]);
						Static543.aClass37_2.method597();
						Static543.aClass37_2.method607();
						Static192.aClass41_1.method751();
						Static668.method9110(-100);
						return;
					}
					if (arg0 == 5405) {
						anInt7746 -= 2;
						local192 = anIntArray553[anInt7746];
						local834 = anIntArray553[anInt7746 + 1];
						if (local192 >= 0 && local192 < 2) {
							Static182.anIntArrayArrayArray27[local192] = new int[local834 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt7746 -= 7;
						local192 = anIntArray553[anInt7746];
						local834 = anIntArray553[anInt7746 + 1] << 1;
						local109 = anIntArray553[anInt7746 + 2];
						local115 = anIntArray553[anInt7746 + 3];
						local375 = anIntArray553[anInt7746 + 4];
						local3561 = anIntArray553[anInt7746 + 5];
						@Pc(3567) int local3567 = anIntArray553[anInt7746 + 6];
						if (local192 >= 0 && local192 < 2 && Static182.anIntArrayArrayArray27[local192] != null && local834 >= 0 && local834 < Static182.anIntArrayArrayArray27[local192].length) {
							Static182.anIntArrayArrayArray27[local192][local834] = new int[] { (local109 >> 14 & 0x3FFF) << 9, local115 << 2, (local109 & 0x3FFF) << 9, local3567 };
							Static182.anIntArrayArrayArray27[local192][local834 + 1] = new int[] { (local375 >> 14 & 0x3FFF) << 9, local3561 << 2, (local375 & 0x3FFF) << 9 };
						}
						return;
					}
					if (arg0 == 5407) {
						local192 = Static182.anIntArrayArrayArray27[anIntArray553[--anInt7746]].length >> 1;
						anIntArray553[anInt7746++] = local192;
						return;
					}
					if (arg0 == 5411) {
						if (Static249.aFrame1 != null) {
							Static309.method4316(false, -1, -1, Static650.aClass2_Sub30_29.aClass11_Sub30_1.method9623());
						}
						if (Static516.aFrame2 != null) {
							Static404.method5979();
							System.exit(0);
							return;
						}
						local95 = Static569.aString102 == null ? Static252.method3569() : Static569.aString102;
						Static118.method1729(local95, Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863() == 1, false, Static135.aClass389_2);
						return;
					}
					if (arg0 == 5419) {
						local95 = "";
						if (Static525.aClass163_5 != null) {
							if (Static525.aClass163_5.anObject5 == null) {
								local95 = Static62.method940(Static525.aClass163_5.anInt3844);
							} else {
								local95 = (String) Static525.aClass163_5.anObject5;
							}
						}
						aStringArray33[anInt7744++] = local95;
						return;
					}
					if (arg0 == 5420) {
						anIntArray553[anInt7746++] = Static135.aClass389_2.aBoolean913 ? 0 : 1;
						return;
					}
					if (arg0 == 5421) {
						if (Static249.aFrame1 != null) {
							Static309.method4316(false, -1, -1, Static650.aClass2_Sub30_29.aClass11_Sub30_1.method9623());
						}
						local95 = aStringArray33[--anInt7744];
						local1578 = anIntArray553[--anInt7746] == 1;
						local198 = Static252.method3569() + local95;
						Static118.method1729(local198, Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863() == 1, local1578, Static135.aClass389_2);
						return;
					}
					if (arg0 == 5422) {
						anInt7744 -= 2;
						local95 = aStringArray33[anInt7744];
						local101 = aStringArray33[anInt7744 + 1];
						local109 = anIntArray553[--anInt7746];
						if (local95.length() > 0) {
							if (Static580.aStringArray40 == null) {
								Static580.aStringArray40 = new String[Static604.anIntArray684[Static249.aClass150_6.anInt3649]];
							}
							Static580.aStringArray40[local109] = local95;
						}
						if (local101.length() > 0) {
							if (Static44.aStringArray3 == null) {
								Static44.aStringArray3 = new String[Static604.anIntArray684[Static249.aClass150_6.anInt3649]];
							}
							Static44.aStringArray3[local109] = local101;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray33[--anInt7744]);
						return;
					}
					if (arg0 == 5424) {
						anInt7746 -= 11;
						Static409.anInt6712 = anIntArray553[anInt7746];
						Static122.anInt2070 = anIntArray553[anInt7746 + 1];
						Static641.anInt9851 = anIntArray553[anInt7746 + 2];
						Static555.anInt8748 = anIntArray553[anInt7746 + 3];
						Static195.anInt3170 = anIntArray553[anInt7746 + 4];
						Static476.anInt7648 = anIntArray553[anInt7746 + 5];
						Static164.anInt2783 = anIntArray553[anInt7746 + 6];
						Static168.anInt2904 = anIntArray553[anInt7746 + 7];
						Static446.anInt7237 = anIntArray553[anInt7746 + 8];
						Static615.anInt3801 = anIntArray553[anInt7746 + 9];
						Static15.anInt228 = anIntArray553[anInt7746 + 10];
						Static117.aClass254_47.method6072(Static195.anInt3170);
						Static117.aClass254_47.method6072(Static476.anInt7648);
						Static117.aClass254_47.method6072(Static164.anInt2783);
						Static117.aClass254_47.method6072(Static168.anInt2904);
						Static117.aClass254_47.method6072(Static446.anInt7237);
						Static107.aClass43_3 = null;
						Static672.aClass43_30 = null;
						Static539.aClass43_25 = null;
						Static625.aClass43_28 = null;
						Static160.aClass43_16 = null;
						Static236.aClass43_18 = null;
						Static705.aClass43_31 = null;
						Static164.aClass43_17 = null;
						Static437.aBoolean603 = true;
						return;
					}
					if (arg0 == 5425) {
						Static385.method5735();
						Static437.aBoolean603 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt7746 -= 2;
						Static288.anInt4456 = anIntArray553[anInt7746];
						Static576.anInt9090 = anIntArray553[anInt7746 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt7746 -= 2;
						return;
					}
					if (arg0 == 5428) {
						anInt7746 -= 2;
						local192 = anIntArray553[anInt7746];
						local834 = anIntArray553[anInt7746 + 1];
						anIntArray553[anInt7746++] = Static600.method8232(local192, local834) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static118.method1733(aStringArray33[--anInt7744], false, false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static736.method7134(Static214.anApplet1, "accountcreated");
							return;
						} catch (@Pc(4148) Throwable local4148) {
							return;
						}
					}
					if (arg0 == 5431) {
						try {
							Static736.method7134(Static214.anApplet1, "accountcreatestarted");
							return;
						} catch (@Pc(4161) Throwable local4161) {
							return;
						}
					}
					if (arg0 == 5432) {
						local95 = "";
						if (Static446.aClipboard1 != null) {
							@Pc(4173) Transferable local4173 = Static446.aClipboard1.getContents((Object) null);
							if (local4173 != null) {
								try {
									local95 = (String) local4173.getTransferData(DataFlavor.stringFlavor);
									if (local95 == null) {
										local95 = "";
									}
								} catch (@Pc(4186) Exception local4186) {
								}
							}
						}
						aStringArray33[anInt7744++] = local95;
						return;
					}
					if (arg0 == 5433) {
						Static455.anInt7442 = anIntArray553[--anInt7746];
						return;
					}
					if (arg0 == 5435) {
						anIntArray553[anInt7746++] = Static396.aBoolean553 ? 1 : 0;
						return;
					}
					if (arg0 == 5436) {
						if (Static604.aClass2_Sub45_1.anInt7329 < 6) {
							anIntArray553[anInt7746++] = 0;
							return;
						}
						if (Static604.aClass2_Sub45_1.anInt7329 == 6 && Static604.aClass2_Sub45_1.anInt7309 < 10) {
							anIntArray553[anInt7746++] = 0;
							return;
						}
						anIntArray553[anInt7746++] = 1;
						return;
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt7746 -= 4;
						local192 = anIntArray553[anInt7746];
						local834 = anIntArray553[anInt7746 + 1];
						local109 = anIntArray553[anInt7746 + 2];
						local115 = anIntArray553[anInt7746 + 3];
						Static416.method6073((local192 & 0x3FFF) - Static224.anInt11062, local109, local115, false, (local192 >> 14 & 0x3FFF) - Static243.anInt3820, local834 << 2);
						return;
					}
					if (arg0 == 5501) {
						anInt7746 -= 4;
						local192 = anIntArray553[anInt7746];
						local834 = anIntArray553[anInt7746 + 1];
						local109 = anIntArray553[anInt7746 + 2];
						local115 = anIntArray553[anInt7746 + 3];
						Static137.method1988(local115, local109, local834 << 2, (local192 & 0x3FFF) - Static224.anInt11062, (local192 >> 14 & 0x3FFF) - Static243.anInt3820);
						return;
					}
					if (arg0 == 5502) {
						anInt7746 -= 6;
						local192 = anIntArray553[anInt7746];
						if (local192 >= 2) {
							throw new RuntimeException();
						}
						Static654.anInt10226 = local192;
						local834 = anIntArray553[anInt7746 + 1];
						if (local834 + 1 >= Static182.anIntArrayArrayArray27[Static654.anInt10226].length >> 1) {
							throw new RuntimeException();
						}
						Static599.anInt9313 = local834;
						Static165.anInt2831 = 0;
						Static577.anInt9120 = anIntArray553[anInt7746 + 2];
						Static220.anInt3520 = anIntArray553[anInt7746 + 3];
						local109 = anIntArray553[anInt7746 + 4];
						if (local109 >= 2) {
							throw new RuntimeException();
						}
						Static144.anInt2464 = local109;
						local115 = anIntArray553[anInt7746 + 5];
						if (local115 + 1 >= Static182.anIntArrayArrayArray27[Static144.anInt2464].length >> 1) {
							throw new RuntimeException();
						}
						Static119.anInt2000 = local115;
						Static60.anInt1040 = 3;
						Static253.anInt3964 = -1;
						Static45.anInt602 = -1;
						return;
					}
					if (arg0 == 5503) {
						Static500.method7131();
						return;
					}
					if (arg0 == 5504) {
						anInt7746 -= 2;
						Static151.method7128(anIntArray553[anInt7746 + 1], anIntArray553[anInt7746]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray553[anInt7746++] = (int) Static356.aFloat90 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray553[anInt7746++] = (int) Static213.aFloat46 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static710.method9460();
						return;
					}
					if (arg0 == 5508) {
						Static247.method3456();
						return;
					}
					if (arg0 == 5509) {
						Static494.method7077(32768);
						return;
					}
					if (arg0 == 5510) {
						Static375.method5327();
						return;
					}
					if (arg0 == 5511) {
						local192 = anIntArray553[--anInt7746];
						local834 = local192 >> 14 & 0x3FFF;
						local109 = local192 & 0x3FFF;
						local834 -= Static243.anInt3820;
						if (local834 < 0) {
							local834 = 0;
						} else if (local834 >= Static426.anInt6942) {
							local834 = Static426.anInt6942;
						}
						local109 -= Static224.anInt11062;
						if (local109 < 0) {
							local109 = 0;
						} else if (local109 >= Static280.anInt6752) {
							local109 = Static280.anInt6752;
						}
						Static670.anInt10429 = (local834 << 9) + 256;
						Static712.anInt10863 = (local109 << 9) + 256;
						Static60.anInt1040 = 4;
						Static253.anInt3964 = -1;
						Static45.anInt602 = -1;
						return;
					}
					if (arg0 == 5512) {
						Static128.method1880();
						return;
					}
					if (arg0 == 5514) {
						Static96.anInt1730 = anIntArray553[--anInt7746];
						return;
					}
					if (arg0 == 5516) {
						anIntArray553[anInt7746++] = Static96.anInt1730;
						return;
					}
					if (arg0 == 5517) {
						local192 = anIntArray553[--anInt7746];
						if (local192 == -1) {
							local834 = local192 >> 14 & 0x3FFF;
							local109 = local192 & 0x3FFF;
							local834 -= Static243.anInt3820;
							if (local834 < 0) {
								local834 = 0;
							} else if (local834 >= Static426.anInt6942) {
								local834 = Static426.anInt6942;
							}
							local109 -= Static224.anInt11062;
							if (local109 < 0) {
								local109 = 0;
							} else if (local109 >= Static280.anInt6752) {
								local109 = Static280.anInt6752;
							}
							Static45.anInt602 = (local834 << 9) + 256;
							Static253.anInt3964 = (local109 << 9) + 256;
							return;
						}
						Static45.anInt602 = -1;
						Static253.anInt3964 = -1;
						return;
					}
					if (arg0 == 5547) {
						anIntArray553[anInt7746++] = Static60.anInt1040;
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt7744 -= 2;
						local95 = aStringArray33[anInt7744];
						local101 = aStringArray33[anInt7744 + 1];
						local109 = anIntArray553[--anInt7746];
						Static9.method190(local95, local109, local101);
						return;
					}
					if (arg0 == 5601) {
						Static537.method4756();
						return;
					}
					if (arg0 == 5602) {
						if (!Static353.method9774()) {
							Static154.method2202();
						}
						return;
					}
					if (arg0 == 5604) {
						anInt7744--;
						if (Static357.anInt5722 != 3) {
							return;
						}
						if (!Static353.method9774() && Static306.anInt4661 == 0) {
							Static209.method2951(aStringArray33[anInt7744]);
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt7744 -= 2;
						anInt7746 -= 2;
						if (Static357.anInt5722 != 3) {
							return;
						}
						if (!Static353.method9774() && Static306.anInt4661 == 0) {
							Static479.method6881(anIntArray553[anInt7746], anIntArray553[anInt7746 + 1] == 1, aStringArray33[anInt7744 + 1], aStringArray33[anInt7744]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static306.anInt4661 == 0) {
							Static563.anInt8850 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray553[anInt7746++] = Static214.anInt3419;
						return;
					}
					if (arg0 == 5608) {
						anIntArray553[anInt7746++] = Static368.anInt5884;
						return;
					}
					if (arg0 == 5609) {
						anIntArray553[anInt7746++] = Static563.anInt8850;
						return;
					}
					if (arg0 == 5611) {
						anIntArray553[anInt7746++] = Static78.anInt1361;
						return;
					}
					if (arg0 == 5612) {
						local192 = anIntArray553[--anInt7746];
						Static497.method7104(local192);
						return;
					}
					if (arg0 == 5613) {
						anIntArray553[anInt7746++] = Static214.anInt3419;
						return;
					}
					if (arg0 == 5615) {
						anInt7744 -= 2;
						local95 = aStringArray33[anInt7744];
						local101 = aStringArray33[anInt7744 + 1];
						Static27.method373(local95, local101);
						return;
					}
					if (arg0 == 5616) {
						Static264.method3744(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray553[anInt7746++] = Static421.anInt6854;
						return;
					}
					if (arg0 == 5618) {
						anInt7746--;
						return;
					}
					if (arg0 == 5619) {
						anInt7746--;
						return;
					}
					if (arg0 == 5620) {
						anIntArray553[anInt7746++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt7744 -= 2;
						anInt7746 -= 2;
						return;
					}
					if (arg0 == 5622) {
						return;
					}
					if (arg0 == 5623) {
						if (Static14.aByteArray1 != null) {
							anIntArray553[anInt7746++] = 1;
							return;
						}
						anIntArray553[anInt7746++] = 0;
						return;
					}
					if (arg0 == 5624) {
						anIntArray553[anInt7746++] = (int) (Static170.aLong103 >> 32);
						anIntArray553[anInt7746++] = (int) (Static170.aLong103 & 0xFFFFFFFFFFFFFFFFL);
						return;
					}
					if (arg0 == 5625) {
						anIntArray553[anInt7746++] = Static80.aBoolean149 ? 1 : 0;
						return;
					}
					if (arg0 == 5626) {
						Static80.aBoolean149 = true;
						Static605.method8287();
						return;
					}
					if (arg0 == 5627) {
						anIntArray553[anInt7746++] = Static100.anInt1781;
						anIntArray553[anInt7746++] = Static316.anInt4889;
						anIntArray553[anInt7746++] = Static208.anInt5310;
						Static100.anInt1781 = -2;
						Static316.anInt4889 = -1;
						Static208.anInt5310 = -1;
						return;
					}
					if (arg0 == 5628) {
						anIntArray553[anInt7746++] = Static353.method9774() ? 1 : 0;
						return;
					}
					if (arg0 == 5629) {
						anIntArray553[anInt7746++] = Static615.anInt3802;
						return;
					}
					if (arg0 == 5630) {
						Static13.method215();
						return;
					}
					if (arg0 == 5631) {
						anInt7746 -= 2;
						local192 = anIntArray553[anInt7746];
						local834 = anIntArray553[anInt7746 + 1];
						Static658.method7510(local192, local834);
						return;
					}
					if (arg0 == 5632) {
						local192 = anIntArray553[--anInt7746];
						Static690.method9312(local192);
						return;
					}
					if (arg0 == 5633) {
						anIntArray553[anInt7746++] = Static580.anInt9159;
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local192 = anIntArray553[--anInt7746];
						Static650.aClass2_Sub30_29.method2988(local192, Static650.aClass2_Sub30_29.aClass11_Sub22_1);
						Static289.method4073();
						Static610.method9380();
						Static492.aBoolean688 = false;
						return;
					}
					@Pc(5330) boolean local5330;
					if (arg0 == 6002) {
						local5330 = anIntArray553[--anInt7746] == 1;
						Static650.aClass2_Sub30_29.method2988(local5330 ? 1 : 0, Static650.aClass2_Sub30_29.aClass11_Sub12_2);
						Static650.aClass2_Sub30_29.method2988(local5330 ? 1 : 0, Static650.aClass2_Sub30_29.aClass11_Sub12_1);
						Static289.method4073();
						Static21.method280();
						Static610.method9380();
						Static492.aBoolean688 = false;
						return;
					}
					if (arg0 == 6003) {
						local5330 = anIntArray553[--anInt7746] == 1;
						Static650.aClass2_Sub30_29.method2988(local5330 ? 2 : 1, Static650.aClass2_Sub30_29.aClass11_Sub27_2);
						Static650.aClass2_Sub30_29.method2988(local5330 ? 2 : 1, Static650.aClass2_Sub30_29.aClass11_Sub27_1);
						Static21.method280();
						Static610.method9380();
						Static492.aBoolean688 = false;
						return;
					}
					if (arg0 == 6005) {
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746] == 1 ? 1 : 0, Static650.aClass2_Sub30_29.aClass11_Sub25_1);
						Static289.method4073();
						Static610.method9380();
						Static492.aBoolean688 = false;
						return;
					}
					if (arg0 == 6007) {
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746], Static650.aClass2_Sub30_29.aClass11_Sub24_1);
						Static610.method9380();
						Static492.aBoolean688 = false;
						return;
					}
					if (arg0 == 6008) {
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746] == 1 ? 1 : 0, Static650.aClass2_Sub30_29.aClass11_Sub1_1);
						Static610.method9380();
						Static492.aBoolean688 = false;
						return;
					}
					if (arg0 == 6010) {
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746] == 1 ? 1 : 0, Static650.aClass2_Sub30_29.aClass11_Sub21_1);
						Static610.method9380();
						Static492.aBoolean688 = false;
						return;
					}
					if (arg0 == 6011) {
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746], Static650.aClass2_Sub30_29.aClass11_Sub16_1);
						Static289.method4073();
						Static610.method9380();
						Static492.aBoolean688 = false;
						return;
					}
					if (arg0 == 6012) {
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746] == 1 ? 1 : 0, Static650.aClass2_Sub30_29.aClass11_Sub29_1);
						Static593.method8176();
						Static408.method6014();
						Static610.method9380();
						Static492.aBoolean688 = false;
						return;
					}
					if (arg0 == 6014) {
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746] == 1 ? 2 : 0, Static650.aClass2_Sub30_29.aClass11_Sub26_1);
						Static289.method4073();
						Static610.method9380();
						Static492.aBoolean688 = false;
						return;
					}
					if (arg0 == 6015) {
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746] == 1 ? 1 : 0, Static650.aClass2_Sub30_29.aClass11_Sub7_1);
						Static289.method4073();
						Static610.method9380();
						Static492.aBoolean688 = false;
						return;
					}
					if (arg0 == 6016) {
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746], Static650.aClass2_Sub30_29.aClass11_Sub18_1);
						Static213.method2982(false, Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863());
						Static610.method9380();
						return;
					}
					if (arg0 == 6017) {
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746] == 1 ? 1 : 0, Static650.aClass2_Sub30_29.aClass11_Sub11_1);
						Static189.method2695();
						Static610.method9380();
						Static492.aBoolean688 = false;
						return;
					}
					if (arg0 == 6018) {
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746], Static650.aClass2_Sub30_29.aClass11_Sub5_5);
						Static610.method9380();
						Static492.aBoolean688 = false;
						return;
					}
					if (arg0 == 6019) {
						local192 = anIntArray553[--anInt7746];
						local834 = Static650.aClass2_Sub30_29.aClass11_Sub5_4.method1696(1);
						if (local192 != local834) {
							if (Static424.method6174(Static357.anInt5722)) {
								if (local834 == 0 && Static717.anInt10936 != -1) {
									Static704.method9423(local192, Static177.aClass254_66, Static717.anInt10936);
									Static321.method4455(3712);
									Static366.aBoolean494 = false;
								} else if (local192 == 0) {
									Static209.method2954();
									Static366.aBoolean494 = false;
								} else {
									Static694.method9348(local192);
								}
							}
							Static650.aClass2_Sub30_29.method2988(local192, Static650.aClass2_Sub30_29.aClass11_Sub5_4);
							Static610.method9380();
							Static492.aBoolean688 = false;
						}
						return;
					}
					if (arg0 == 6020) {
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746], Static650.aClass2_Sub30_29.aClass11_Sub5_1);
						Static610.method9380();
						Static492.aBoolean688 = false;
						return;
					}
					if (arg0 == 6021) {
						local192 = Static650.aClass2_Sub30_29.aClass11_Sub27_2.method8752();
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746] == 1 ? 0 : local192, Static650.aClass2_Sub30_29.aClass11_Sub27_1);
						Static21.method280();
						return;
					}
					if (arg0 == 6023) {
						local192 = anIntArray553[--anInt7746];
						Static650.aClass2_Sub30_29.method2988(local192, Static650.aClass2_Sub30_29.aClass11_Sub19_1);
						Static610.method9380();
						Static492.aBoolean688 = false;
						return;
					}
					if (arg0 == 6024) {
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746], Static650.aClass2_Sub30_29.aClass11_Sub18_2);
						Static610.method9380();
						return;
					}
					if (arg0 == 6025) {
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746], Static650.aClass2_Sub30_29.aClass11_Sub13_1);
						Static610.method9380();
						Static492.aBoolean688 = false;
						return;
					}
					if (arg0 == 6027) {
						local192 = anIntArray553[--anInt7746];
						if (local192 < 0 || local192 > 1) {
							local192 = 0;
						}
						Static717.method9543(local192 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746] == 0 ? 0 : 1, Static650.aClass2_Sub30_29.aClass11_Sub6_1);
						Static610.method9380();
						return;
					}
					if (arg0 == 6029) {
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746], Static650.aClass2_Sub30_29.aClass11_Sub24_1);
						Static610.method9380();
						return;
					}
					if (arg0 == 6030) {
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746] == 0 ? 0 : 1, Static650.aClass2_Sub30_29.aClass11_Sub10_1);
						Static610.method9380();
						Static289.method4073();
						return;
					}
					if (arg0 == 6031) {
						local192 = anIntArray553[--anInt7746];
						if (local192 < 0 || local192 > 5) {
							local192 = 2;
						}
						Static213.method2982(false, local192);
						return;
					}
					if (arg0 == 6032) {
						anInt7746 -= 2;
						local192 = anIntArray553[anInt7746];
						local1578 = anIntArray553[anInt7746 + 1] == 1;
						Static650.aClass2_Sub30_29.method2988(local192, Static650.aClass2_Sub30_29.aClass11_Sub20_1);
						if (!local1578) {
							Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub9_1);
						}
						Static610.method9380();
						Static492.aBoolean688 = false;
						return;
					}
					if (arg0 == 6033) {
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746], Static650.aClass2_Sub30_29.aClass11_Sub8_1);
						Static610.method9380();
						return;
					}
					if (arg0 == 6034) {
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746] == 1 ? 1 : 0, Static650.aClass2_Sub30_29.aClass11_Sub4_1);
						Static610.method9380();
						Static593.method8176();
						Static492.aBoolean688 = false;
						return;
					}
					if (arg0 == 6035) {
						local192 = Static650.aClass2_Sub30_29.aClass11_Sub12_2.method2753();
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746] == 1 ? 1 : local192, Static650.aClass2_Sub30_29.aClass11_Sub12_1);
						Static289.method4073();
						Static21.method280();
						return;
					}
					if (arg0 == 6036) {
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746], Static650.aClass2_Sub30_29.aClass11_Sub14_1);
						Static610.method9380();
						Static30.aBoolean64 = true;
						return;
					}
					if (arg0 == 6037) {
						Static650.aClass2_Sub30_29.method2988(anIntArray553[--anInt7746], Static650.aClass2_Sub30_29.aClass11_Sub5_2);
						Static610.method9380();
						Static492.aBoolean688 = false;
						return;
					}
					if (arg0 == 6038) {
						local192 = anIntArray553[--anInt7746];
						local834 = Static650.aClass2_Sub30_29.aClass11_Sub5_3.method1696(1);
						if (local192 != local834 && Static717.anInt10936 == Static37.anInt9263) {
							if (!Static424.method6174(Static357.anInt5722)) {
								if (local834 == 0) {
									Static704.method9423(local192, Static177.aClass254_66, Static717.anInt10936);
									Static321.method4455(3712);
									Static366.aBoolean494 = false;
								} else if (local192 == 0) {
									Static209.method2954();
									Static366.aBoolean494 = false;
								} else {
									Static694.method9348(local192);
								}
							}
							Static650.aClass2_Sub30_29.method2988(local192, Static650.aClass2_Sub30_29.aClass11_Sub5_3);
							Static610.method9380();
							Static492.aBoolean688 = false;
						}
						return;
					}
					if (arg0 == 6039) {
						local192 = anIntArray553[--anInt7746];
						if (local192 > 255 || local192 < 0) {
							local192 = 0;
						}
						if (local192 != Static650.aClass2_Sub30_29.aClass11_Sub2_1.method919()) {
							Static650.aClass2_Sub30_29.method2988(local192, Static650.aClass2_Sub30_29.aClass11_Sub2_1);
							Static610.method9380();
							Static492.aBoolean688 = false;
						}
						return;
					}
					if (arg0 == 6040) {
						local192 = anIntArray553[--anInt7746];
						if (local192 != Static650.aClass2_Sub30_29.aClass11_Sub15_1.method3264()) {
							Static650.aClass2_Sub30_29.method2988(local192, Static650.aClass2_Sub30_29.aClass11_Sub15_1);
							Static610.method9380();
							Static492.aBoolean688 = false;
							Static70.method1065();
						}
						return;
					}
					if (arg0 == 6041) {
						local192 = anIntArray553[--anInt7746];
						if (local192 != Static650.aClass2_Sub30_29.aClass11_Sub17_1.method4360()) {
							Static650.aClass2_Sub30_29.method2988(local192, Static650.aClass2_Sub30_29.aClass11_Sub17_1);
							Static610.method9380();
							Static492.aBoolean688 = false;
						}
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub22_1.method5859();
						return;
					}
					if (arg0 == 6102) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub12_2.method2753() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub27_2.method8752() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub25_1.method7993() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub24_1.method7746();
						return;
					}
					if (arg0 == 6108) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub1_1.method238() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub21_1.method5163() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub16_1.method4292();
						return;
					}
					if (arg0 == 6112) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub29_1.method9323() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub26_1.method8618() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub7_1.method2014() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub18_1.method4563();
						return;
					}
					if (arg0 == 6117) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub11_1.method2678() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub5_5.method1696(1);
						return;
					}
					if (arg0 == 6119) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub5_4.method1696(1);
						return;
					}
					if (arg0 == 6120) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub5_1.method1696(1);
						return;
					}
					if (arg0 == 6123) {
						anIntArray553[anInt7746++] = Static616.method8381();
						return;
					}
					if (arg0 == 6124) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub18_2.method4563();
						return;
					}
					if (arg0 == 6125) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub13_1.method2809();
						return;
					}
					if (arg0 == 6127) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub23_1.method7278() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub6_1.method2007() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub24_1.method7746();
						return;
					}
					if (arg0 == 6130) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub10_1.method2652() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863();
						return;
					}
					if (arg0 == 6132) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub20_1.method4863();
						return;
					}
					if (arg0 == 6133) {
						anIntArray553[anInt7746++] = Static135.aClass389_2.aBoolean913 && !Static135.aClass389_2.aBoolean912 ? 1 : 0;
						return;
					}
					if (arg0 == 6135) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub8_1.method2130();
						return;
					}
					if (arg0 == 6136) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub4_1.method1189() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6138) {
						anIntArray553[anInt7746++] = Static28.method382(Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863(), 200);
						return;
					}
					if (arg0 == 6139) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub14_1.method2893();
						return;
					}
					if (arg0 == 6142) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub5_2.method1696(1);
						return;
					}
					if (arg0 == 6143) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub5_3.method1696(1);
						return;
					}
					if (arg0 == 6144) {
						anIntArray553[anInt7746++] = Static346.aBoolean453 ? 1 : 0;
						return;
					}
					if (arg0 == 6145) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub2_1.method919();
						return;
					}
					if (arg0 == 6146) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub15_1.method3264();
						return;
					}
					if (arg0 == 6147) {
						anIntArray553[anInt7746++] = Static604.aClass2_Sub45_1.anInt7311 < 512 || Static346.aBoolean453 || Static344.aBoolean449 ? 1 : 0;
						return;
					}
					if (arg0 == 6148) {
						anIntArray553[anInt7746++] = Static96.aBoolean201 ? 1 : 0;
						return;
					}
					if (arg0 == 6149) {
						anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub17_1.method4360();
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt7746 -= 2;
						Static640.aShort126 = (short) anIntArray553[anInt7746];
						if (Static640.aShort126 <= 0) {
							Static640.aShort126 = 256;
						}
						Static135.aShort41 = (short) anIntArray553[anInt7746 + 1];
						if (Static135.aShort41 <= 0) {
							Static135.aShort41 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt7746 -= 2;
						Static369.aShort71 = (short) anIntArray553[anInt7746];
						if (Static369.aShort71 <= 0) {
							Static369.aShort71 = 256;
						}
						Static480.aShort104 = (short) anIntArray553[anInt7746 + 1];
						if (Static480.aShort104 <= 0) {
							Static480.aShort104 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt7746 -= 4;
						Static8.aShort1 = (short) anIntArray553[anInt7746];
						if (Static8.aShort1 <= 0) {
							Static8.aShort1 = 1;
						}
						Static353.aShort131 = (short) anIntArray553[anInt7746 + 1];
						if (Static353.aShort131 <= 0) {
							Static353.aShort131 = 32767;
						} else if (Static353.aShort131 < Static8.aShort1) {
							Static353.aShort131 = Static8.aShort1;
						}
						Static538.aShort115 = (short) anIntArray553[anInt7746 + 2];
						if (Static538.aShort115 <= 0) {
							Static538.aShort115 = 1;
						}
						Static323.aShort61 = (short) anIntArray553[anInt7746 + 3];
						if (Static323.aShort61 <= 0) {
							Static323.aShort61 = 32767;
							return;
						}
						if (Static323.aShort61 < Static538.aShort115) {
							Static323.aShort61 = Static538.aShort115;
						}
						return;
					}
					if (arg0 == 6203) {
						Static501.method5233(0, 0, Static291.aClass273_5.anInt7402, false, Static291.aClass273_5.anInt7385);
						anIntArray553[anInt7746++] = Static395.anInt6514;
						anIntArray553[anInt7746++] = Static537.anInt5294;
						return;
					}
					if (arg0 == 6204) {
						anIntArray553[anInt7746++] = Static369.aShort71;
						anIntArray553[anInt7746++] = Static480.aShort104;
						return;
					}
					if (arg0 == 6205) {
						anIntArray553[anInt7746++] = Static640.aShort126;
						anIntArray553[anInt7746++] = Static135.aShort41;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray553[anInt7746++] = (int) (Static567.method7863() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray553[anInt7746++] = (int) (Static567.method7863() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt7746 -= 3;
						local192 = anIntArray553[anInt7746];
						local834 = anIntArray553[anInt7746 + 1];
						local109 = anIntArray553[anInt7746 + 2];
						@Pc(7377) long local7377 = Static404.method5981(local834, local109, local192);
						local3561 = Static649.method8928(local7377);
						if (local109 < 1970) {
							local3561--;
						}
						anIntArray553[anInt7746++] = local3561;
						return;
					}
					if (arg0 == 6303) {
						anIntArray553[anInt7746++] = Static592.method8156(Static567.method7863());
						return;
					}
					if (arg0 == 6304) {
						local192 = anIntArray553[--anInt7746];
						local1578 = true;
						if (local192 < 0) {
							local1578 = (local192 + 1) % 4 == 0;
						} else if (local192 < 1582) {
							local1578 = local192 % 4 == 0;
						} else if (local192 % 4 != 0) {
							local1578 = false;
						} else if (local192 % 100 != 0) {
							local1578 = true;
						} else if (local192 % 400 != 0) {
							local1578 = false;
						}
						anIntArray553[anInt7746++] = local1578 ? 1 : 0;
						return;
					}
					if (arg0 == 6305) {
						local192 = anIntArray553[--anInt7746];
						@Pc(7505) int[] local7505 = Static41.method2948(local192);
						Static728.method273(local7505, 0, anIntArray553, anInt7746, 3);
						anInt7746 += 3;
						return;
					}
					if (arg0 == 6306) {
						local192 = anIntArray553[--anInt7746];
						anIntArray553[anInt7746++] = (int) (Static73.method1140(local192) / 60000L);
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray553[anInt7746++] = Static500.method7132() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray553[anInt7746++] = Static383.method110() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static357.anInt5722 == 7 && !Static353.method9774() && Static306.anInt4661 == 0) {
							if (Static10.aBoolean25) {
								anIntArray553[anInt7746++] = 0;
								return;
							}
							if (Static483.aLong242 > Static567.method7863() - 1000L) {
								anIntArray553[anInt7746++] = 1;
								return;
							}
							Static10.aBoolean25 = true;
							@Pc(7655) Class2_Sub33 local7655 = Static592.method8154(Static615.aClass349_62, Static487.aClass221_1.aClass48_1);
							local7655.aClass2_Sub20_Sub2_1.method8577(Static203.anInt3313);
							Static487.aClass221_1.method5173(local7655);
							anIntArray553[anInt7746++] = 0;
							return;
						}
						anIntArray553[anInt7746++] = 1;
						return;
					}
					@Pc(7712) Class206 local7712;
					@Pc(7679) Class88_Sub1 local7679;
					if (arg0 == 6501) {
						local7679 = Static66.method1001();
						if (local7679 != null) {
							anIntArray553[anInt7746++] = local7679.anInt2151;
							anIntArray553[anInt7746++] = local7679.anInt2140;
							aStringArray33[anInt7744++] = local7679.aString20;
							local7712 = local7679.method1895();
							anIntArray553[anInt7746++] = local7712.anInt4934;
							aStringArray33[anInt7744++] = local7712.aString56;
							anIntArray553[anInt7746++] = local7679.anInt2143;
							anIntArray553[anInt7746++] = local7679.anInt2150;
							aStringArray33[anInt7744++] = local7679.aString21;
							return;
						}
						anIntArray553[anInt7746++] = -1;
						anIntArray553[anInt7746++] = 0;
						aStringArray33[anInt7744++] = "";
						anIntArray553[anInt7746++] = 0;
						aStringArray33[anInt7744++] = "";
						anIntArray553[anInt7746++] = 0;
						anIntArray553[anInt7746++] = 0;
						aStringArray33[anInt7744++] = "";
						return;
					}
					if (arg0 == 6502) {
						local7679 = Static149.method2163();
						if (local7679 != null) {
							anIntArray553[anInt7746++] = local7679.anInt2151;
							anIntArray553[anInt7746++] = local7679.anInt2140;
							aStringArray33[anInt7744++] = local7679.aString20;
							local7712 = local7679.method1895();
							anIntArray553[anInt7746++] = local7712.anInt4934;
							aStringArray33[anInt7744++] = local7712.aString56;
							anIntArray553[anInt7746++] = local7679.anInt2143;
							anIntArray553[anInt7746++] = local7679.anInt2150;
							aStringArray33[anInt7744++] = local7679.aString21;
							return;
						}
						anIntArray553[anInt7746++] = -1;
						anIntArray553[anInt7746++] = 0;
						aStringArray33[anInt7744++] = "";
						anIntArray553[anInt7746++] = 0;
						aStringArray33[anInt7744++] = "";
						anIntArray553[anInt7746++] = 0;
						anIntArray553[anInt7746++] = 0;
						aStringArray33[anInt7744++] = "";
						return;
					}
					if (arg0 == 6503) {
						local192 = anIntArray553[--anInt7746];
						local101 = aStringArray33[--anInt7744];
						if (Static357.anInt5722 == 7 && !Static353.method9774() && Static306.anInt4661 == 0) {
							anIntArray553[anInt7746++] = Static296.method4170(local192, local101) ? 1 : 0;
							return;
						}
						anIntArray553[anInt7746++] = 0;
						return;
					}
					if (arg0 == 6506) {
						local192 = anIntArray553[--anInt7746];
						@Pc(8046) Class88_Sub1 local8046 = Static621.method8394(local192);
						if (local8046 != null) {
							anIntArray553[anInt7746++] = local8046.anInt2140;
							aStringArray33[anInt7744++] = local8046.aString20;
							@Pc(8070) Class206 local8070 = local8046.method1895();
							anIntArray553[anInt7746++] = local8070.anInt4934;
							aStringArray33[anInt7744++] = local8070.aString56;
							anIntArray553[anInt7746++] = local8046.anInt2143;
							anIntArray553[anInt7746++] = local8046.anInt2150;
							aStringArray33[anInt7744++] = local8046.aString21;
							return;
						}
						anIntArray553[anInt7746++] = -1;
						aStringArray33[anInt7744++] = "";
						anIntArray553[anInt7746++] = 0;
						aStringArray33[anInt7744++] = "";
						anIntArray553[anInt7746++] = 0;
						anIntArray553[anInt7746++] = 0;
						aStringArray33[anInt7744++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt7746 -= 4;
						local192 = anIntArray553[anInt7746];
						local1578 = anIntArray553[anInt7746 + 1] == 1;
						local109 = anIntArray553[anInt7746 + 2];
						local2331 = anIntArray553[anInt7746 + 3] == 1;
						Static514.method7276(local1578, local2331, local109, local192);
						return;
					}
					if (arg0 == 6508) {
						Static699.method9384();
						return;
					}
					if (arg0 == 6509) {
						if (Static357.anInt5722 != 7) {
							return;
						}
						Static609.aBoolean811 = anIntArray553[--anInt7746] == 1;
						return;
					}
					if (arg0 == 6510) {
						anIntArray553[anInt7746++] = Static29.anInt417;
						return;
					}
				} else if (arg0 >= 6700) {
					if (arg0 < 6800 && Static28.aClass179_1 == Static207.aClass179_2) {
						if (arg0 == 6700) {
							local192 = Static463.aClass218_36.method5094();
							if (Static542.anInt8552 != -1) {
								local192++;
							}
							anIntArray553[anInt7746++] = local192;
							return;
						}
						if (arg0 == 6701) {
							local192 = anIntArray553[--anInt7746];
							if (Static542.anInt8552 != -1) {
								if (local192 == 0) {
									anIntArray553[anInt7746++] = Static542.anInt8552;
									return;
								}
								local192--;
							}
							@Pc(8337) Class2_Sub26 local8337 = (Class2_Sub26) Static463.aClass218_36.method5092();
							while (local192-- > 0) {
								local8337 = (Class2_Sub26) Static463.aClass218_36.method5096();
							}
							anIntArray553[anInt7746++] = local8337.anInt3020;
							return;
						}
						if (arg0 == 6702) {
							local192 = anIntArray553[--anInt7746];
							if (Static581.aClass273ArrayArray2[local192] == null) {
								aStringArray33[anInt7744++] = "";
								return;
							}
							local101 = Static581.aClass273ArrayArray2[local192][0].aString83;
							if (local101 == null) {
								aStringArray33[anInt7744++] = "";
								return;
							}
							aStringArray33[anInt7744++] = local101.substring(0, local101.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local192 = anIntArray553[--anInt7746];
							if (Static581.aClass273ArrayArray2[local192] == null) {
								anIntArray553[anInt7746++] = 0;
								return;
							}
							anIntArray553[anInt7746++] = Static581.aClass273ArrayArray2[local192].length;
							return;
						}
						if (arg0 == 6704) {
							anInt7746 -= 2;
							local192 = anIntArray553[anInt7746];
							local834 = anIntArray553[anInt7746 + 1];
							if (Static581.aClass273ArrayArray2[local192] == null) {
								aStringArray33[anInt7744++] = "";
								return;
							}
							local198 = Static581.aClass273ArrayArray2[local192][local834].aString83;
							if (local198 == null) {
								aStringArray33[anInt7744++] = "";
								return;
							}
							aStringArray33[anInt7744++] = local198;
							return;
						}
						if (arg0 == 6705) {
							anInt7746 -= 2;
							local192 = anIntArray553[anInt7746];
							local834 = anIntArray553[anInt7746 + 1];
							if (Static581.aClass273ArrayArray2[local192] == null) {
								anIntArray553[anInt7746++] = 0;
								return;
							}
							anIntArray553[anInt7746++] = Static581.aClass273ArrayArray2[local192][local834].anInt7343;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							anInt7746 -= 3;
							local192 = anIntArray553[anInt7746];
							local834 = anIntArray553[anInt7746 + 1];
							local109 = anIntArray553[anInt7746 + 2];
							Static411.method6030(1, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6708) {
							anInt7746 -= 3;
							local192 = anIntArray553[anInt7746];
							local834 = anIntArray553[anInt7746 + 1];
							local109 = anIntArray553[anInt7746 + 2];
							Static411.method6030(2, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6709) {
							anInt7746 -= 3;
							local192 = anIntArray553[anInt7746];
							local834 = anIntArray553[anInt7746 + 1];
							local109 = anIntArray553[anInt7746 + 2];
							Static411.method6030(3, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6710) {
							anInt7746 -= 3;
							local192 = anIntArray553[anInt7746];
							local834 = anIntArray553[anInt7746 + 1];
							local109 = anIntArray553[anInt7746 + 2];
							Static411.method6030(4, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6711) {
							anInt7746 -= 3;
							local192 = anIntArray553[anInt7746];
							local834 = anIntArray553[anInt7746 + 1];
							local109 = anIntArray553[anInt7746 + 2];
							Static411.method6030(5, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6712) {
							anInt7746 -= 3;
							local192 = anIntArray553[anInt7746];
							local834 = anIntArray553[anInt7746 + 1];
							local109 = anIntArray553[anInt7746 + 2];
							Static411.method6030(6, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6713) {
							anInt7746 -= 3;
							local192 = anIntArray553[anInt7746];
							local834 = anIntArray553[anInt7746 + 1];
							local109 = anIntArray553[anInt7746 + 2];
							Static411.method6030(7, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6714) {
							anInt7746 -= 3;
							local192 = anIntArray553[anInt7746];
							local834 = anIntArray553[anInt7746 + 1];
							local109 = anIntArray553[anInt7746 + 2];
							Static411.method6030(8, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6715) {
							anInt7746 -= 3;
							local192 = anIntArray553[anInt7746];
							local834 = anIntArray553[anInt7746 + 1];
							local109 = anIntArray553[anInt7746 + 2];
							Static411.method6030(9, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6716) {
							anInt7746 -= 3;
							local192 = anIntArray553[anInt7746];
							local834 = anIntArray553[anInt7746 + 1];
							local109 = anIntArray553[anInt7746 + 2];
							Static411.method6030(10, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6717) {
							anInt7746 -= 3;
							local192 = anIntArray553[anInt7746];
							local834 = anIntArray553[anInt7746 + 1];
							local109 = anIntArray553[anInt7746 + 2];
							@Pc(8933) Class273 local8933 = Static147.method2144(local192 << 16 | local834, local109);
							Static643.method8704();
							@Pc(8938) Class2_Sub31 local8938 = Static91.method1412(local8933);
							Static498.method7107(local8938.method3010(), local8933, local8938.anInt3442);
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(8968) Class259 local8968;
						if (arg0 == 6800) {
							local192 = anIntArray553[--anInt7746];
							local8968 = Static117.aClass196_2.method4194(local192);
							if (local8968.aString75 == null) {
								aStringArray33[anInt7744++] = "";
								return;
							}
							aStringArray33[anInt7744++] = local8968.aString75;
							return;
						}
						if (arg0 == 6801) {
							local192 = anIntArray553[--anInt7746];
							local8968 = Static117.aClass196_2.method4194(local192);
							anIntArray553[anInt7746++] = local8968.anInt6954;
							return;
						}
						if (arg0 == 6802) {
							local192 = anIntArray553[--anInt7746];
							local8968 = Static117.aClass196_2.method4194(local192);
							anIntArray553[anInt7746++] = local8968.anInt6983;
							return;
						}
						if (arg0 == 6803) {
							local192 = anIntArray553[--anInt7746];
							local8968 = Static117.aClass196_2.method4194(local192);
							anIntArray553[anInt7746++] = local8968.anInt6981;
							return;
						}
						if (arg0 == 6804) {
							anInt7746 -= 2;
							local192 = anIntArray553[anInt7746];
							local834 = anIntArray553[anInt7746 + 1];
							@Pc(9091) Class22 local9091 = Static97.aClass328_2.method7810(local834);
							if (local9091.method372()) {
								aStringArray33[anInt7744++] = Static117.aClass196_2.method4194(local192).method6253(local834, local9091.aString1);
								return;
							}
							anIntArray553[anInt7746++] = Static117.aClass196_2.method4194(local192).method6250(local834, local9091.anInt376);
							return;
						}
					} else if (arg0 < 7000) {
						if (arg0 == 6900) {
							anIntArray553[anInt7746++] = Static70.aBoolean137 && !Static337.aBoolean443 ? 1 : 0;
							return;
						}
						if (arg0 == 6901) {
							anIntArray553[anInt7746++] = (int) (Static77.aLong51 / 60000L);
							anIntArray553[anInt7746++] = (int) ((Static77.aLong51 - Static567.method7863() - Static650.aLong317) / 60000L);
							anIntArray553[anInt7746++] = Static622.aBoolean820 ? 1 : 0;
							return;
						}
						if (arg0 == 6902) {
							anIntArray553[anInt7746++] = Static166.anInt2880;
							return;
						}
						if (arg0 == 6903) {
							anIntArray553[anInt7746++] = Static382.anInt6085;
							return;
						}
						if (arg0 == 6904) {
							anIntArray553[anInt7746++] = Static119.anInt1991;
							return;
						}
						if (arg0 == 6905) {
							local95 = "";
							if (Static525.aClass163_5 != null) {
								if (Static525.aClass163_5.anObject5 == null) {
									local95 = Static62.method940(Static525.aClass163_5.anInt3844);
								} else {
									local95 = (String) Static525.aClass163_5.anObject5;
								}
							}
							aStringArray33[anInt7744++] = local95;
							return;
						}
						if (arg0 == 6906) {
							anIntArray553[anInt7746++] = Static249.anInt3854;
							return;
						}
						if (arg0 == 6907) {
							anIntArray553[anInt7746++] = Static390.anInt6475;
							return;
						}
						if (arg0 == 6908) {
							anIntArray553[anInt7746++] = Static305.anInt2216;
							return;
						}
						if (arg0 == 6909) {
							anIntArray553[anInt7746++] = Static352.aBoolean459 ? 1 : 0;
							return;
						}
						if (arg0 == 6910) {
							anIntArray553[anInt7746++] = Static126.anInt2110;
							return;
						}
						if (arg0 == 6911) {
							anIntArray553[anInt7746++] = Static547.anInt8631;
							return;
						}
						if (arg0 == 6912) {
							anIntArray553[anInt7746++] = Static565.anInt8887;
							return;
						}
						if (arg0 == 6913) {
							anIntArray553[anInt7746++] = Static65.anInt1136;
							return;
						}
						if (arg0 == 6914) {
							anIntArray553[anInt7746++] = Static68.aBoolean134 ? 1 : 0;
							return;
						}
						if (arg0 == 6915) {
							anIntArray553[anInt7746++] = Static171.anInt2930;
							return;
						}
					} else if (arg0 < 7100) {
						if (arg0 == 7000) {
							local192 = Static517.method7326();
							anIntArray553[anInt7746++] = Static338.anInt5226 = Static650.aClass2_Sub30_29.aClass11_Sub20_2.method4863();
							anIntArray553[anInt7746++] = local192;
							Static289.method4073();
							Static610.method9380();
							Static492.aBoolean688 = false;
							return;
						}
						if (arg0 == 7001) {
							Static302.method4224();
							Static289.method4073();
							Static610.method9380();
							Static492.aBoolean688 = false;
							return;
						}
						if (arg0 == 7002) {
							Static46.method598();
							Static289.method4073();
							Static610.method9380();
							Static492.aBoolean688 = false;
							return;
						}
						if (arg0 == 7003) {
							Static441.method6385();
							Static289.method4073();
							Static610.method9380();
							Static492.aBoolean688 = false;
							return;
						}
						if (arg0 == 7004) {
							Static299.method4190();
							Static289.method4073();
							Static610.method9380();
							Static492.aBoolean688 = false;
							return;
						}
						if (arg0 == 7005) {
							Static650.aClass2_Sub30_29.method2988(0, Static650.aClass2_Sub30_29.aClass11_Sub9_1);
							Static610.method9380();
							Static492.aBoolean688 = false;
							return;
						}
						if (arg0 == 7006) {
							if (Static338.anInt5226 == 2) {
								Static541.aBoolean732 = true;
								return;
							}
							if (Static338.anInt5226 == 1) {
								Static585.aBoolean791 = true;
								return;
							}
							if (Static338.anInt5226 == 3) {
								Static401.aBoolean560 = true;
							}
							return;
						}
						if (arg0 == 7007) {
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub9_1.method2198();
							return;
						}
					} else if (arg0 < 7200) {
						if (arg0 == 7100) {
							anInt7746 -= 2;
							local192 = anIntArray553[anInt7746];
							local834 = anIntArray553[anInt7746 + 1];
							if (local192 != -1) {
								if (local834 > 255) {
									local834 = 255;
								} else if (local834 < 0) {
									local834 = 0;
								}
								Static536.method7523(false, local192, local834);
							}
							return;
						}
						if (arg0 == 7101) {
							local192 = anIntArray553[--anInt7746];
							if (local192 != -1) {
								Static581.method8086(local192);
							}
							return;
						}
						if (arg0 == 7102) {
							local192 = anIntArray553[--anInt7746];
							if (local192 != -1) {
								Static695.method9351(local192);
							}
							return;
						}
						if (arg0 == 7103) {
							anIntArray553[anInt7746++] = Static140.method2067("jagtheora") ? 1 : 0;
							return;
						}
					} else if (arg0 < 7300) {
						if (arg0 == 7201) {
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub25_1.method7990() ? 1 : 0;
							return;
						}
						if (arg0 == 7202) {
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub21_1.method5166() ? 1 : 0;
							return;
						}
						if (arg0 == 7203) {
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub16_1.method4293() ? 1 : 0;
							return;
						}
						if (arg0 == 7204) {
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub26_1.method8617() ? 1 : 0;
							return;
						}
						if (arg0 == 7205) {
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub18_2.method4564() && Static396.aClass145_6.method9675() ? 1 : 0;
							return;
						}
						if (arg0 == 7206) {
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub19_1.method4821() ? 1 : 0;
							return;
						}
						if (arg0 == 7207) {
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub13_1.method2810() ? 1 : 0;
							return;
						}
						if (arg0 == 7208) {
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub23_1.method7277() && Static396.aClass145_6.method9665() ? 1 : 0;
							return;
						}
						if (arg0 == 7209) {
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub10_1.method2650() ? 1 : 0;
							return;
						}
						if (arg0 == 7210) {
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub4_1.method1188() ? 1 : 0;
							return;
						}
						if (arg0 == 7211) {
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub14_1.method2895() ? 1 : 0;
							return;
						}
						if (arg0 == 7212) {
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub7_1.method2017() ? 1 : 0;
							return;
						}
						if (arg0 == 7213) {
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub15_1.method3260() ? 1 : 0;
							return;
						}
						if (arg0 == 7214) {
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub20_1.method4857() ? 1 : 0;
							return;
						}
						if (arg0 == 7215) {
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub17_1.method4364() ? 1 : 0;
							return;
						}
					} else if (arg0 < 7400) {
						if (arg0 == 7301) {
							local192 = anIntArray553[--anInt7746];
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub25_1.method9614(local192);
							return;
						}
						if (arg0 == 7302) {
							local192 = anIntArray553[--anInt7746];
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub21_1.method9614(local192);
							return;
						}
						if (arg0 == 7303) {
							local192 = anIntArray553[--anInt7746];
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub16_1.method9614(local192);
							return;
						}
						if (arg0 == 7304) {
							local192 = anIntArray553[--anInt7746];
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub26_1.method9614(local192);
							return;
						}
						if (arg0 == 7305) {
							local192 = anIntArray553[--anInt7746];
							if (!Static396.aClass145_6.method9675()) {
								anIntArray553[anInt7746++] = 3;
								return;
							}
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub18_2.method9614(local192);
							return;
						}
						if (arg0 == 7306) {
							local192 = anIntArray553[--anInt7746];
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub19_1.method9614(local192);
							return;
						}
						if (arg0 == 7307) {
							local192 = anIntArray553[--anInt7746];
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub13_1.method9614(local192);
							return;
						}
						if (arg0 == 7308) {
							local192 = anIntArray553[--anInt7746];
							if (!Static396.aClass145_6.method9665()) {
								anIntArray553[anInt7746++] = 3;
								return;
							}
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub23_1.method9614(local192);
							return;
						}
						if (arg0 == 7309) {
							local192 = anIntArray553[--anInt7746];
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub10_1.method9614(local192);
							return;
						}
						if (arg0 == 7310) {
							local192 = anIntArray553[--anInt7746];
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub4_1.method9614(local192);
							return;
						}
						if (arg0 == 7311) {
							local192 = anIntArray553[--anInt7746];
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub14_1.method9614(local192);
							return;
						}
						if (arg0 == 7312) {
							local192 = anIntArray553[--anInt7746];
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub7_1.method9614(local192);
							return;
						}
						if (arg0 == 7313) {
							local192 = anIntArray553[--anInt7746];
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub15_1.method9614(local192);
							return;
						}
						if (arg0 == 7314) {
							local192 = anIntArray553[--anInt7746];
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub20_1.method9614(local192);
							return;
						}
						if (arg0 == 7315) {
							local192 = anIntArray553[--anInt7746];
							anIntArray553[anInt7746++] = Static650.aClass2_Sub30_29.aClass11_Sub17_1.method9614(local192);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)V")
	private static void method6923(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(220) Class273 local220;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(15) int local15;
		@Pc(303) Class273 local303;
		@Pc(38) Class273 local38;
		@Pc(72) int local72;
		@Pc(248) Class273 local248;
		if (arg0 < 300) {
			if (arg0 == 150) {
				anInt7746 -= 3;
				local15 = anIntArray553[anInt7746];
				local21 = anIntArray553[anInt7746 + 1];
				local27 = anIntArray553[anInt7746 + 2];
				if (local21 == 0) {
					throw new RuntimeException();
				}
				local38 = Static417.method6111(local15);
				if (local38.aClass273Array4 == null) {
					local38.aClass273Array4 = new Class273[local27 + 1];
					local38.aClass273Array3 = local38.aClass273Array4;
				}
				if (local38.aClass273Array4.length <= local27) {
					@Pc(70) Class273[] local70;
					if (local38.aClass273Array4 == local38.aClass273Array3) {
						local70 = new Class273[local27 + 1];
						for (local72 = 0; local72 < local38.aClass273Array4.length; local72++) {
							local70[local72] = local38.aClass273Array4[local72];
						}
						local38.aClass273Array4 = local38.aClass273Array3 = local70;
					} else {
						local70 = new Class273[local27 + 1];
						@Pc(104) Class273[] local104 = new Class273[local27 + 1];
						for (@Pc(106) int local106 = 0; local106 < local38.aClass273Array4.length; local106++) {
							local70[local106] = local38.aClass273Array4[local106];
							local104[local106] = local38.aClass273Array3[local106];
						}
						local38.aClass273Array4 = local70;
						local38.aClass273Array3 = local104;
					}
				}
				if (local27 > 0 && local38.aClass273Array4[local27 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local27 - 1));
				}
				@Pc(166) Class273 local166 = new Class273();
				local166.anInt7371 = local21;
				local166.anInt7392 = local166.anInt7350 = local38.anInt7350;
				local166.anInt7410 = local27;
				local38.aClass273Array4[local27] = local166;
				if (local38.aClass273Array3 != local38.aClass273Array4) {
					local38.aClass273Array3[local27] = local166;
				}
				if (arg1) {
					aClass273_14 = local166;
				} else {
					aClass273_15 = local166;
				}
				Static371.method5299(local38);
				return;
			}
			if (arg0 == 151) {
				local220 = arg1 ? aClass273_14 : aClass273_15;
				if (local220.anInt7410 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local248 = Static417.method6111(local220.anInt7350);
				local248.aClass273Array4[local220.anInt7410] = null;
				Static371.method5299(local248);
				return;
			}
			if (arg0 == 152) {
				local220 = Static417.method6111(anIntArray553[--anInt7746]);
				local220.aClass273Array4 = null;
				local220.aClass273Array3 = null;
				Static371.method5299(local220);
				return;
			}
			if (arg0 == 200) {
				anInt7746 -= 2;
				local15 = anIntArray553[anInt7746];
				local21 = anIntArray553[anInt7746 + 1];
				local303 = Static147.method2144(local15, local21);
				if (local303 != null && local21 != -1) {
					anIntArray553[anInt7746++] = 1;
					if (arg1) {
						aClass273_14 = local303;
						return;
					}
					aClass273_15 = local303;
					return;
				}
				anIntArray553[anInt7746++] = 0;
				return;
			}
			if (arg0 == 201) {
				local15 = anIntArray553[--anInt7746];
				local248 = Static417.method6111(local15);
				if (local248 != null) {
					anIntArray553[anInt7746++] = 1;
					if (arg1) {
						aClass273_14 = local248;
						return;
					}
					aClass273_15 = local248;
					return;
				}
				anIntArray553[anInt7746++] = 0;
				return;
			}
			if (arg0 == 202 || arg0 == 204) {
				if (arg0 == 202) {
					local21 = anIntArray553[--anInt7746];
					local220 = Static417.method6111(local21);
				} else {
					local220 = arg1 ? aClass273_14 : aClass273_15;
				}
				method6914(local220);
				return;
			}
			if (arg0 == 203 || arg0 == 205) {
				if (arg0 == 203) {
					local21 = anIntArray553[--anInt7746];
					local220 = Static417.method6111(local21);
				} else {
					local220 = arg1 ? aClass273_14 : aClass273_15;
				}
				method6926(local220);
				return;
			}
		} else {
			@Pc(506) int local506;
			@Pc(575) boolean local575;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt7746 -= 2;
					local15 = anIntArray553[anInt7746];
					local21 = anIntArray553[anInt7746 + 1];
					if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass116_1 == null) {
						return;
					}
					for (local27 = 0; local27 < Static196.anIntArray255.length; local27++) {
						if (Static196.anIntArray255[local27] == local15) {
							Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass116_1.method2537(local21, Static91.aClass7_1, local27);
							return;
						}
					}
					for (local506 = 0; local506 < Static687.anIntArray737.length; local506++) {
						if (Static687.anIntArray737[local506] == local15) {
							Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass116_1.method2537(local21, Static91.aClass7_1, local506);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt7746 -= 2;
					local15 = anIntArray553[anInt7746];
					local21 = anIntArray553[anInt7746 + 1];
					if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass116_1 == null) {
						return;
					}
					Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass116_1.method2536(local21, local15);
					return;
				}
				if (arg0 == 410) {
					local575 = anIntArray553[--anInt7746] != 0;
					if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass116_1 == null) {
						return;
					}
					Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass116_1.method2541(local575);
					return;
				}
				if (arg0 == 411) {
					anInt7746 -= 2;
					local15 = anIntArray553[anInt7746];
					local21 = anIntArray553[anInt7746 + 1];
					if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass116_1 == null) {
						return;
					}
					Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass116_1.method2533(Static543.aClass37_2, local21, local15);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local220 = Static417.method6111(anIntArray553[--anInt7746]);
				} else {
					local220 = arg1 ? aClass273_14 : aClass273_15;
				}
				if (arg0 == 1000) {
					anInt7746 -= 4;
					local220.anInt7357 = anIntArray553[anInt7746];
					local220.anInt7364 = anIntArray553[anInt7746 + 1];
					local21 = anIntArray553[anInt7746 + 2];
					if (local21 < 0) {
						local21 = 0;
					} else if (local21 > 5) {
						local21 = 5;
					}
					local27 = anIntArray553[anInt7746 + 3];
					if (local27 < 0) {
						local27 = 0;
					} else if (local27 > 5) {
						local27 = 5;
					}
					local220.aByte105 = (byte) local21;
					local220.aByte103 = (byte) local27;
					Static371.method5299(local220);
					Static260.method3688(local220);
					if (local220.anInt7410 == -1) {
						Static422.method6171(local220.anInt7350);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt7746 -= 4;
					local220.anInt7404 = anIntArray553[anInt7746];
					local220.anInt7388 = anIntArray553[anInt7746 + 1];
					local220.anInt7422 = 0;
					local220.anInt7383 = 0;
					local21 = anIntArray553[anInt7746 + 2];
					if (local21 < 0) {
						local21 = 0;
					} else if (local21 > 4) {
						local21 = 4;
					}
					local27 = anIntArray553[anInt7746 + 3];
					if (local27 < 0) {
						local27 = 0;
					} else if (local27 > 4) {
						local27 = 4;
					}
					local220.aByte106 = (byte) local21;
					local220.aByte104 = (byte) local27;
					Static371.method5299(local220);
					Static260.method3688(local220);
					if (local220.anInt7371 == 0) {
						Static243.method3436(local220, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(834) boolean local834 = anIntArray553[--anInt7746] == 1;
					if (local220.aBoolean631 != local834) {
						local220.aBoolean631 = local834;
						Static371.method5299(local220);
					}
					if (local220.anInt7410 == -1) {
						Static509.method7194(local220.anInt7350);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt7746 -= 2;
					local220.anInt7421 = anIntArray553[anInt7746];
					local220.anInt7381 = anIntArray553[anInt7746 + 1];
					Static371.method5299(local220);
					Static260.method3688(local220);
					if (local220.anInt7371 == 0) {
						Static243.method3436(local220, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local220.aBoolean635 = anIntArray553[--anInt7746] == 1;
					return;
				}
			} else {
				@Pc(1791) String local1791;
				@Pc(1394) String local1394;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local220 = Static417.method6111(anIntArray553[--anInt7746]);
					} else {
						local220 = arg1 ? aClass273_14 : aClass273_15;
					}
					if (arg0 == 1100) {
						anInt7746 -= 2;
						local220.anInt7347 = anIntArray553[anInt7746];
						if (local220.anInt7347 > local220.anInt7379 - local220.anInt7402) {
							local220.anInt7347 = local220.anInt7379 - local220.anInt7402;
						}
						if (local220.anInt7347 < 0) {
							local220.anInt7347 = 0;
						}
						local220.anInt7342 = anIntArray553[anInt7746 + 1];
						if (local220.anInt7342 > local220.anInt7400 - local220.anInt7385) {
							local220.anInt7342 = local220.anInt7400 - local220.anInt7385;
						}
						if (local220.anInt7342 < 0) {
							local220.anInt7342 = 0;
						}
						Static371.method5299(local220);
						if (local220.anInt7410 == -1) {
							Static412.method6060(local220.anInt7350);
						}
						return;
					}
					if (arg0 == 1101) {
						local220.anInt7396 = anIntArray553[--anInt7746];
						Static371.method5299(local220);
						if (local220.anInt7410 == -1) {
							Static613.method6181(local220.anInt7350);
						}
						return;
					}
					if (arg0 == 1102) {
						local220.aBoolean640 = anIntArray553[--anInt7746] == 1;
						Static371.method5299(local220);
						return;
					}
					if (arg0 == 1103) {
						local220.anInt7355 = anIntArray553[--anInt7746];
						Static371.method5299(local220);
						return;
					}
					if (arg0 == 1104) {
						local220.anInt7378 = anIntArray553[--anInt7746];
						Static371.method5299(local220);
						return;
					}
					if (arg0 == 1105) {
						local21 = anIntArray553[--anInt7746];
						if (local220.anInt7394 != local21) {
							local220.anInt7394 = local21;
							Static371.method5299(local220);
						}
						if (local220.anInt7410 == -1) {
							Static163.method2436(local220.anInt7350);
						}
						return;
					}
					if (arg0 == 1106) {
						local220.anInt7340 = anIntArray553[--anInt7746];
						Static371.method5299(local220);
						return;
					}
					if (arg0 == 1107) {
						local220.aBoolean627 = anIntArray553[--anInt7746] == 1;
						Static371.method5299(local220);
						return;
					}
					if (arg0 == 1108) {
						local220.anInt7354 = 1;
						local220.anInt7420 = anIntArray553[--anInt7746];
						Static371.method5299(local220);
						if (local220.anInt7410 == -1) {
							Static490.method7035(local220.anInt7350);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt7746 -= 6;
						local220.anInt7414 = anIntArray553[anInt7746];
						local220.anInt7374 = anIntArray553[anInt7746 + 1];
						local220.anInt7335 = anIntArray553[anInt7746 + 2];
						local220.anInt7390 = anIntArray553[anInt7746 + 3];
						local220.anInt7407 = anIntArray553[anInt7746 + 4];
						local220.anInt7360 = anIntArray553[anInt7746 + 5];
						Static371.method5299(local220);
						if (local220.anInt7410 == -1) {
							Static539.method7547(local220.anInt7350);
							Static498.method7108(local220.anInt7350);
						}
						return;
					}
					if (arg0 == 1110) {
						local21 = anIntArray553[--anInt7746];
						if (local21 != local220.anInt7337) {
							if (local21 == -1) {
								local220.aClass53_8 = null;
							} else {
								if (local220.aClass53_8 == null) {
									local220.aClass53_8 = new Class53_Sub2();
								}
								local220.aClass53_8.method4089(local21);
							}
							local220.anInt7337 = local21;
							Static371.method5299(local220);
						}
						if (local220.anInt7410 == -1) {
							Static563.method7829(local220.anInt7350);
						}
						return;
					}
					if (arg0 == 1111) {
						local220.aBoolean643 = anIntArray553[--anInt7746] == 1;
						Static371.method5299(local220);
						return;
					}
					if (arg0 == 1112) {
						local1394 = aStringArray33[--anInt7744];
						if (!local1394.equals(local220.aString86)) {
							local220.aString86 = local1394;
							Static371.method5299(local220);
						}
						if (local220.anInt7410 == -1) {
							Static515.method7314((byte) 124, local220.anInt7350);
						}
						return;
					}
					if (arg0 == 1113) {
						local220.anInt7359 = anIntArray553[--anInt7746];
						Static371.method5299(local220);
						if (local220.anInt7410 == -1) {
							Static36.method512(local220.anInt7350);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt7746 -= 3;
						local220.anInt7353 = anIntArray553[anInt7746];
						local220.anInt7369 = anIntArray553[anInt7746 + 1];
						local220.anInt7417 = anIntArray553[anInt7746 + 2];
						Static371.method5299(local220);
						return;
					}
					if (arg0 == 1115) {
						local220.aBoolean642 = anIntArray553[--anInt7746] == 1;
						Static371.method5299(local220);
						return;
					}
					if (arg0 == 1116) {
						local220.anInt7334 = anIntArray553[--anInt7746];
						Static371.method5299(local220);
						return;
					}
					if (arg0 == 1117) {
						local220.anInt7397 = anIntArray553[--anInt7746];
						Static371.method5299(local220);
						return;
					}
					if (arg0 == 1118) {
						local220.aBoolean633 = anIntArray553[--anInt7746] == 1;
						Static371.method5299(local220);
						return;
					}
					if (arg0 == 1119) {
						local220.aBoolean632 = anIntArray553[--anInt7746] == 1;
						Static371.method5299(local220);
						return;
					}
					if (arg0 == 1120) {
						anInt7746 -= 2;
						local220.anInt7379 = anIntArray553[anInt7746];
						local220.anInt7400 = anIntArray553[anInt7746 + 1];
						Static371.method5299(local220);
						if (local220.anInt7371 == 0) {
							Static243.method3436(local220, false);
						}
						return;
					}
					if (arg0 == 1122) {
						local220.aBoolean636 = anIntArray553[--anInt7746] == 1;
						Static371.method5299(local220);
						return;
					}
					if (arg0 == 1123) {
						local220.anInt7360 = anIntArray553[--anInt7746];
						Static371.method5299(local220);
						if (local220.anInt7410 == -1) {
							Static539.method7547(local220.anInt7350);
						}
						return;
					}
					if (arg0 == 1124) {
						local21 = anIntArray553[--anInt7746];
						local220.aBoolean625 = local21 == 1;
						Static371.method5299(local220);
						return;
					}
					if (arg0 == 1125) {
						anInt7746 -= 2;
						local220.anInt7363 = anIntArray553[anInt7746];
						local220.anInt7349 = anIntArray553[anInt7746 + 1];
						Static371.method5299(local220);
						return;
					}
					if (arg0 == 1126) {
						local220.anInt7413 = anIntArray553[--anInt7746];
						Static371.method5299(local220);
						return;
					}
					@Pc(1756) Class22 local1756;
					if (arg0 == 1127) {
						anInt7746 -= 2;
						local21 = anIntArray553[anInt7746];
						local27 = anIntArray553[anInt7746 + 1];
						local1756 = Static97.aClass328_2.method7810(local21);
						if (local27 != local1756.anInt376) {
							local220.method6612(local27, local21);
							return;
						}
						local220.method6614(local21);
						return;
					}
					if (arg0 == 1128) {
						local21 = anIntArray553[--anInt7746];
						local1791 = aStringArray33[--anInt7744];
						local1756 = Static97.aClass328_2.method7810(local21);
						if (!local1756.aString1.equals(local1791)) {
							local220.method6602(local1791, local21);
							return;
						}
						local220.method6614(local21);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local21 = anIntArray553[--anInt7746];
						if ((local220.anInt7371 == 5 || arg0 != 1129) && (local220.anInt7371 == 4 || arg0 != 1130)) {
							if (local220.anInt7367 != local21) {
								local220.anInt7367 = local21;
								Static371.method5299(local220);
							}
							if (local220.anInt7410 == -1) {
								Static474.method6820(local220.anInt7350);
							}
							return;
						}
						return;
					}
					@Pc(1892) short local1892;
					@Pc(1899) short local1899;
					if (arg0 == 1131) {
						anInt7746 -= 3;
						local21 = anIntArray553[anInt7746];
						local1892 = (short) anIntArray553[anInt7746 + 1];
						local1899 = (short) anIntArray553[anInt7746 + 2];
						if (local21 >= 0 && local21 < 5) {
							local220.method6606(local1892, local1899, local21);
							Static371.method5299(local220);
							if (local220.anInt7410 == -1) {
								Static5.method74(local220.anInt7350, local21);
							}
							return;
						}
						return;
					}
					if (arg0 == 1132) {
						anInt7746 -= 3;
						local21 = anIntArray553[anInt7746];
						local1892 = (short) anIntArray553[anInt7746 + 1];
						local1899 = (short) anIntArray553[anInt7746 + 2];
						if (local21 >= 0 && local21 < 5) {
							local220.method6618(local1892, local1899, local21);
							Static371.method5299(local220);
							if (local220.anInt7410 == -1) {
								Static567.method7864(local21, local220.anInt7350);
							}
							return;
						}
						return;
					}
					if (arg0 == 1133) {
						local220.aBoolean641 = anIntArray553[--anInt7746] == 1;
						Static371.method5299(local220);
						if (local220.anInt7410 == -1) {
							Static172.method2600(local220.anInt7350);
						}
						return;
					}
					if (arg0 == 1134) {
						anInt7746 -= 2;
						local21 = anIntArray553[anInt7746];
						local27 = anIntArray553[anInt7746 + 1];
						local1756 = Static97.aClass328_2.method7810(local21);
						if (local27 != local1756.anInt376) {
							local220.method6612(local27, local21);
							return;
						}
						local220.method6614(local21);
						return;
					}
					if (arg0 == 1135) {
						local220.aBoolean637 = anIntArray553[--anInt7746] == 1;
						Static371.method5299(local220);
						if (local220.anInt7410 == -1) {
							Static533.method7495(local220.anInt7350);
						}
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2978) int local2978;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local220 = Static417.method6111(anIntArray553[--anInt7746]);
						} else {
							local220 = arg1 ? aClass273_14 : aClass273_15;
						}
						if (arg0 == 1300) {
							local21 = anIntArray553[--anInt7746] - 1;
							if (local21 >= 0 && local21 <= 9) {
								local220.method6600(local21, aStringArray33[--anInt7744]);
								return;
							}
							anInt7744--;
							return;
						}
						if (arg0 == 1301) {
							anInt7746 -= 2;
							local21 = anIntArray553[anInt7746];
							local27 = anIntArray553[anInt7746 + 1];
							if (local21 == -1 && local27 == -1) {
								local220.aClass273_13 = null;
								return;
							}
							local220.aClass273_13 = Static147.method2144(local21, local27);
							return;
						}
						if (arg0 == 1302) {
							local21 = anIntArray553[--anInt7746];
							if (local21 != Static334.anInt5099 && local21 != Static614.anInt9459 && local21 != Static707.anInt10829) {
								return;
							}
							local220.anInt7362 = local21;
							return;
						}
						if (arg0 == 1303) {
							local220.anInt7372 = anIntArray553[--anInt7746];
							return;
						}
						if (arg0 == 1304) {
							local220.anInt7341 = anIntArray553[--anInt7746];
							return;
						}
						if (arg0 == 1305) {
							local220.aString82 = aStringArray33[--anInt7744];
							return;
						}
						if (arg0 == 1306) {
							local220.aString84 = aStringArray33[--anInt7744];
							return;
						}
						if (arg0 == 1307) {
							local220.aStringArray32 = null;
							return;
						}
						if (arg0 == 1308) {
							local220.anInt7384 = anIntArray553[--anInt7746];
							local220.anInt7352 = anIntArray553[--anInt7746];
							return;
						}
						if (arg0 == 1309) {
							local21 = anIntArray553[--anInt7746];
							local27 = anIntArray553[--anInt7746];
							if (local27 >= 1 && local27 <= 10) {
								local220.method6609(local27 - 1, local21);
							}
							return;
						}
						if (arg0 == 1310) {
							local220.aString85 = aStringArray33[--anInt7744];
							return;
						}
						if (arg0 == 1311) {
							local220.anInt7375 = anIntArray553[--anInt7746];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt7746 -= 3;
								local21 = anIntArray553[anInt7746] - 1;
								local27 = anIntArray553[anInt7746 + 1];
								local506 = anIntArray553[anInt7746 + 2];
								if (local21 < 0 || local21 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt7746 -= 2;
								local21 = 10;
								local27 = anIntArray553[anInt7746];
								local506 = anIntArray553[anInt7746 + 1];
							}
							if (local220.aByteArray96 == null) {
								if (local27 == 0) {
									return;
								}
								local220.aByteArray96 = new byte[11];
								local220.aByteArray95 = new byte[11];
								local220.anIntArray525 = new int[11];
							}
							local220.aByteArray96[local21] = (byte) local27;
							if (local27 == 0) {
								local220.aBoolean626 = false;
								for (local2978 = 0; local2978 < local220.aByteArray96.length; local2978++) {
									if (local220.aByteArray96[local2978] != 0) {
										local220.aBoolean626 = true;
										break;
									}
								}
							} else {
								local220.aBoolean626 = true;
							}
							local220.aByteArray95[local21] = (byte) local506;
							return;
						}
						if (arg0 == 1314) {
							local220.anInt7333 = anIntArray553[--anInt7746];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local220 = Static417.method6111(anIntArray553[--anInt7746]);
						} else {
							local220 = arg1 ? aClass273_14 : aClass273_15;
						}
						if (arg0 == 1499) {
							local220.method6607();
							return;
						}
						local1394 = aStringArray33[--anInt7744];
						@Pc(3077) int[] local3077 = null;
						if (local1394.length() > 0 && local1394.charAt(local1394.length() - 1) == 'Y') {
							local506 = anIntArray553[--anInt7746];
							if (local506 > 0) {
								local3077 = new int[local506];
								while (local506-- > 0) {
									local3077[local506] = anIntArray553[--anInt7746];
								}
							}
							local1394 = local1394.substring(0, local1394.length() - 1);
						}
						@Pc(3131) Object[] local3131 = new Object[local1394.length() + 1];
						for (local2978 = local3131.length - 1; local2978 >= 1; local2978--) {
							if (local1394.charAt(local2978 - 1) == 's') {
								local3131[local2978] = aStringArray33[--anInt7744];
							} else if (local1394.charAt(local2978 - 1) == '§') {
								local3131[local2978] = Long.valueOf(aLongArray16[--anInt7751]);
							} else {
								local3131[local2978] = Integer.valueOf(anIntArray553[--anInt7746]);
							}
						}
						local72 = anIntArray553[--anInt7746];
						if (local72 == -1) {
							local3131 = null;
						} else {
							local3131[0] = Integer.valueOf(local72);
						}
						if (arg0 == 1400) {
							local220.anObjectArray20 = local3131;
						} else if (arg0 == 1401) {
							local220.anObjectArray19 = local3131;
						} else if (arg0 == 1402) {
							local220.anObjectArray33 = local3131;
						} else if (arg0 == 1403) {
							local220.anObjectArray17 = local3131;
						} else if (arg0 == 1404) {
							local220.anObjectArray37 = local3131;
						} else if (arg0 == 1405) {
							local220.anObjectArray8 = local3131;
						} else if (arg0 == 1406) {
							local220.anObjectArray6 = local3131;
						} else if (arg0 == 1407) {
							local220.anObjectArray14 = local3131;
							local220.anIntArray528 = local3077;
						} else if (arg0 == 1408) {
							local220.anObjectArray31 = local3131;
						} else if (arg0 == 1409) {
							local220.anObjectArray15 = local3131;
						} else if (arg0 == 1410) {
							local220.anObjectArray23 = local3131;
						} else if (arg0 == 1411) {
							local220.anObjectArray28 = local3131;
						} else if (arg0 == 1412) {
							local220.anObjectArray25 = local3131;
						} else if (arg0 == 1414) {
							local220.anObjectArray9 = local3131;
							local220.anIntArray527 = local3077;
						} else if (arg0 == 1415) {
							local220.anObjectArray29 = local3131;
							local220.anIntArray533 = local3077;
						} else if (arg0 == 1416) {
							local220.anObjectArray12 = local3131;
						} else if (arg0 == 1417) {
							local220.anObjectArray4 = local3131;
						} else if (arg0 == 1418) {
							local220.anObjectArray24 = local3131;
						} else if (arg0 == 1419) {
							local220.anObjectArray22 = local3131;
						} else if (arg0 == 1420) {
							local220.anObjectArray27 = local3131;
						} else if (arg0 == 1421) {
							local220.anObjectArray30 = local3131;
						} else if (arg0 == 1422) {
							local220.anObjectArray18 = local3131;
						} else if (arg0 == 1423) {
							local220.anObjectArray32 = local3131;
						} else if (arg0 == 1424) {
							local220.anObjectArray36 = local3131;
						} else if (arg0 == 1425) {
							local220.anObjectArray7 = local3131;
						} else if (arg0 == 1426) {
							local220.anObjectArray21 = local3131;
						} else if (arg0 == 1427) {
							local220.anObjectArray13 = local3131;
						} else if (arg0 == 1428) {
							local220.anObjectArray26 = local3131;
							local220.anIntArray532 = local3077;
						} else if (arg0 == 1429) {
							local220.anObjectArray5 = local3131;
							local220.anIntArray526 = local3077;
						} else if (arg0 == 1430) {
							local220.anObjectArray34 = local3131;
						} else if (arg0 == 1431) {
							local220.anObjectArray11 = local3131;
						} else if (arg0 == 1432) {
							local220.anObjectArray16 = local3131;
						} else if (arg0 == 1433) {
							local220.anObjectArray35 = local3131;
						}
						local220.aBoolean628 = true;
						return;
					} else if (arg0 < 1600) {
						local220 = arg1 ? aClass273_14 : aClass273_15;
						if (arg0 == 1500) {
							anIntArray553[anInt7746++] = local220.anInt7373;
							return;
						}
						if (arg0 == 1501) {
							anIntArray553[anInt7746++] = local220.anInt7346;
							return;
						}
						if (arg0 == 1502) {
							anIntArray553[anInt7746++] = local220.anInt7402;
							return;
						}
						if (arg0 == 1503) {
							anIntArray553[anInt7746++] = local220.anInt7385;
							return;
						}
						if (arg0 == 1504) {
							anIntArray553[anInt7746++] = local220.aBoolean631 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray553[anInt7746++] = local220.anInt7392;
							return;
						}
						if (arg0 == 1506) {
							local248 = Static407.method6010(local220);
							anIntArray553[anInt7746++] = local248 == null ? -1 : local248.anInt7350;
							return;
						}
						if (arg0 == 1507) {
							anIntArray553[anInt7746++] = local220.anInt7396;
							return;
						}
					} else {
						@Pc(3848) Class22 local3848;
						if (arg0 < 1700) {
							local220 = arg1 ? aClass273_14 : aClass273_15;
							if (arg0 == 1600) {
								anIntArray553[anInt7746++] = local220.anInt7347;
								return;
							}
							if (arg0 == 1601) {
								anIntArray553[anInt7746++] = local220.anInt7342;
								return;
							}
							if (arg0 == 1602) {
								aStringArray33[anInt7744++] = local220.aString86;
								return;
							}
							if (arg0 == 1603) {
								anIntArray553[anInt7746++] = local220.anInt7379;
								return;
							}
							if (arg0 == 1604) {
								anIntArray553[anInt7746++] = local220.anInt7400;
								return;
							}
							if (arg0 == 1605) {
								anIntArray553[anInt7746++] = local220.anInt7360;
								return;
							}
							if (arg0 == 1606) {
								anIntArray553[anInt7746++] = local220.anInt7335;
								return;
							}
							if (arg0 == 1607) {
								anIntArray553[anInt7746++] = local220.anInt7407;
								return;
							}
							if (arg0 == 1608) {
								anIntArray553[anInt7746++] = local220.anInt7390;
								return;
							}
							if (arg0 == 1609) {
								anIntArray553[anInt7746++] = local220.anInt7355;
								return;
							}
							if (arg0 == 1610) {
								anIntArray553[anInt7746++] = local220.anInt7414;
								return;
							}
							if (arg0 == 1611) {
								anIntArray553[anInt7746++] = local220.anInt7374;
								return;
							}
							if (arg0 == 1612) {
								anIntArray553[anInt7746++] = local220.anInt7394;
								return;
							}
							if (arg0 == 1613) {
								local21 = anIntArray553[--anInt7746];
								local3848 = Static97.aClass328_2.method7810(local21);
								if (local3848.method372()) {
									aStringArray33[anInt7744++] = local220.method6615(local21, local3848.aString1);
									return;
								}
								anIntArray553[anInt7746++] = local220.method6604(local3848.anInt376, local21);
								return;
							}
							if (arg0 == 1614) {
								anIntArray553[anInt7746++] = local220.anInt7340;
								return;
							}
							if (arg0 == 2614) {
								anIntArray553[anInt7746++] = local220.anInt7354 == 1 ? local220.anInt7420 : -1;
								return;
							}
						} else if (arg0 < 1800) {
							local220 = arg1 ? aClass273_14 : aClass273_15;
							if (arg0 == 1700) {
								anIntArray553[anInt7746++] = local220.anInt7415;
								return;
							}
							if (arg0 == 1701) {
								if (local220.anInt7415 != -1) {
									anIntArray553[anInt7746++] = local220.anInt7416;
									return;
								}
								anIntArray553[anInt7746++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray553[anInt7746++] = local220.anInt7410;
								return;
							}
						} else if (arg0 < 1900) {
							local220 = arg1 ? aClass273_14 : aClass273_15;
							if (arg0 == 1800) {
								anIntArray553[anInt7746++] = Static91.method1412(local220).method3010();
								return;
							}
							if (arg0 == 1801) {
								local21 = anIntArray553[--anInt7746];
								local21--;
								if (local220.aStringArray32 != null && local21 < local220.aStringArray32.length && local220.aStringArray32[local21] != null) {
									aStringArray33[anInt7744++] = local220.aStringArray32[local21];
									return;
								}
								aStringArray33[anInt7744++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local220.aString82 == null) {
									aStringArray33[anInt7744++] = "";
									return;
								}
								aStringArray33[anInt7744++] = local220.aString82;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local220 = Static417.method6111(anIntArray553[--anInt7746]);
								arg0 -= 1000;
							} else {
								local220 = arg1 ? aClass273_14 : aClass273_15;
							}
							if (anInt7754 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local220.anObjectArray13 == null) {
									return;
								}
								@Pc(4155) Class2_Sub36 local4155 = new Class2_Sub36();
								local4155.aClass273_6 = local220;
								local4155.anObjectArray2 = local220.anObjectArray13;
								local4155.anInt5072 = anInt7754 + 1;
								Static592.aClass60_189.method1233(local4155);
								return;
							}
						} else if (arg0 < 2600) {
							local220 = Static417.method6111(anIntArray553[--anInt7746]);
							if (arg0 == 2500) {
								anIntArray553[anInt7746++] = local220.anInt7373;
								return;
							}
							if (arg0 == 2501) {
								anIntArray553[anInt7746++] = local220.anInt7346;
								return;
							}
							if (arg0 == 2502) {
								anIntArray553[anInt7746++] = local220.anInt7402;
								return;
							}
							if (arg0 == 2503) {
								anIntArray553[anInt7746++] = local220.anInt7385;
								return;
							}
							if (arg0 == 2504) {
								anIntArray553[anInt7746++] = local220.aBoolean631 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray553[anInt7746++] = local220.anInt7392;
								return;
							}
							if (arg0 == 2506) {
								local248 = Static407.method6010(local220);
								anIntArray553[anInt7746++] = local248 == null ? -1 : local248.anInt7350;
								return;
							}
							if (arg0 == 2507) {
								anIntArray553[anInt7746++] = local220.anInt7396;
								return;
							}
						} else if (arg0 < 2700) {
							local220 = Static417.method6111(anIntArray553[--anInt7746]);
							if (arg0 == 2600) {
								anIntArray553[anInt7746++] = local220.anInt7347;
								return;
							}
							if (arg0 == 2601) {
								anIntArray553[anInt7746++] = local220.anInt7342;
								return;
							}
							if (arg0 == 2602) {
								aStringArray33[anInt7744++] = local220.aString86;
								return;
							}
							if (arg0 == 2603) {
								anIntArray553[anInt7746++] = local220.anInt7379;
								return;
							}
							if (arg0 == 2604) {
								anIntArray553[anInt7746++] = local220.anInt7400;
								return;
							}
							if (arg0 == 2605) {
								anIntArray553[anInt7746++] = local220.anInt7360;
								return;
							}
							if (arg0 == 2606) {
								anIntArray553[anInt7746++] = local220.anInt7335;
								return;
							}
							if (arg0 == 2607) {
								anIntArray553[anInt7746++] = local220.anInt7407;
								return;
							}
							if (arg0 == 2608) {
								anIntArray553[anInt7746++] = local220.anInt7390;
								return;
							}
							if (arg0 == 2609) {
								anIntArray553[anInt7746++] = local220.anInt7355;
								return;
							}
							if (arg0 == 2610) {
								anIntArray553[anInt7746++] = local220.anInt7414;
								return;
							}
							if (arg0 == 2611) {
								anIntArray553[anInt7746++] = local220.anInt7374;
								return;
							}
							if (arg0 == 2612) {
								anIntArray553[anInt7746++] = local220.anInt7394;
								return;
							}
							if (arg0 == 2613) {
								anIntArray553[anInt7746++] = local220.anInt7340;
								return;
							}
							if (arg0 == 2614) {
								anIntArray553[anInt7746++] = local220.anInt7354 == 1 ? local220.anInt7420 : -1;
								return;
							}
						} else {
							@Pc(4732) Class2_Sub26 local4732;
							@Pc(4625) Class2_Sub26 local4625;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local220 = Static417.method6111(anIntArray553[--anInt7746]);
									anIntArray553[anInt7746++] = local220.anInt7415;
									return;
								}
								if (arg0 == 2701) {
									local220 = Static417.method6111(anIntArray553[--anInt7746]);
									if (local220.anInt7415 != -1) {
										anIntArray553[anInt7746++] = local220.anInt7416;
										return;
									}
									anIntArray553[anInt7746++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local15 = anIntArray553[--anInt7746];
									local4625 = (Class2_Sub26) Static463.aClass218_36.method5095((long) local15, 0);
									if (local4625 != null) {
										anIntArray553[anInt7746++] = 1;
										return;
									}
									anIntArray553[anInt7746++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local220 = Static417.method6111(anIntArray553[--anInt7746]);
									if (local220.aClass273Array4 == null) {
										anIntArray553[anInt7746++] = 0;
										return;
									}
									local21 = local220.aClass273Array4.length;
									for (local27 = 0; local27 < local220.aClass273Array4.length; local27++) {
										if (local220.aClass273Array4[local27] == null) {
											local21 = local27;
											break;
										}
									}
									anIntArray553[anInt7746++] = local21;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt7746 -= 2;
									local15 = anIntArray553[anInt7746];
									local21 = anIntArray553[anInt7746 + 1];
									local4732 = (Class2_Sub26) Static463.aClass218_36.method5095((long) local15, 0);
									if (local4732 != null && local4732.anInt3020 == local21) {
										anIntArray553[anInt7746++] = 1;
										return;
									}
									anIntArray553[anInt7746++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local220 = Static417.method6111(anIntArray553[--anInt7746]);
								if (arg0 == 2800) {
									anIntArray553[anInt7746++] = Static91.method1412(local220).method3010();
									return;
								}
								if (arg0 == 2801) {
									local21 = anIntArray553[--anInt7746];
									local21--;
									if (local220.aStringArray32 != null && local21 < local220.aStringArray32.length && local220.aStringArray32[local21] != null) {
										aStringArray33[anInt7744++] = local220.aStringArray32[local21];
										return;
									}
									aStringArray33[anInt7744++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local220.aString82 == null) {
										aStringArray33[anInt7744++] = "";
										return;
									}
									aStringArray33[anInt7744++] = local220.aString82;
									return;
								}
							} else {
								@Pc(4883) String local4883;
								@Pc(4977) Class2_Sub33 local4977;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local4883 = aStringArray33[--anInt7744];
										Static155.method2226(local4883);
										return;
									}
									if (arg0 == 3101) {
										anInt7746 -= 2;
										Static418.method6117(anIntArray553[anInt7746 + 1], Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2, anIntArray553[anInt7746]);
										return;
									}
									if (arg0 == 3103) {
										Static627.method8473();
										return;
									}
									if (arg0 == 3104) {
										local4883 = aStringArray33[--anInt7744];
										local21 = 0;
										if (Static716.method9519(local4883)) {
											local21 = Static171.method2545(local4883);
										}
										@Pc(4946) Class2_Sub33 local4946 = Static592.method8154(Static399.aClass349_91, Static487.aClass221_2.aClass48_1);
										local4946.aClass2_Sub20_Sub2_1.method8577(local21);
										Static487.aClass221_2.method5173(local4946);
										return;
									}
									if (arg0 == 3105) {
										local4883 = aStringArray33[--anInt7744];
										local4977 = Static592.method8154(Static283.aClass349_130, Static487.aClass221_2.aClass48_1);
										local4977.aClass2_Sub20_Sub2_1.method8584(local4883.length() + 1);
										local4977.aClass2_Sub20_Sub2_1.method8541(local4883);
										Static487.aClass221_2.method5173(local4977);
										return;
									}
									if (arg0 == 3106) {
										local4883 = aStringArray33[--anInt7744];
										local4977 = Static592.method8154(Static233.aClass349_60, Static487.aClass221_2.aClass48_1);
										local4977.aClass2_Sub20_Sub2_1.method8584(local4883.length() + 1);
										local4977.aClass2_Sub20_Sub2_1.method8541(local4883);
										Static487.aClass221_2.method5173(local4977);
										return;
									}
									if (arg0 == 3107) {
										local15 = anIntArray553[--anInt7746];
										local1394 = aStringArray33[--anInt7744];
										Static591.method8380(local1394, local15);
										return;
									}
									if (arg0 == 3108) {
										anInt7746 -= 3;
										local15 = anIntArray553[anInt7746];
										local21 = anIntArray553[anInt7746 + 1];
										local27 = anIntArray553[anInt7746 + 2];
										local38 = Static417.method6111(local27);
										Static289.method4070(local15, local38, local21);
										return;
									}
									if (arg0 == 3109) {
										anInt7746 -= 2;
										local15 = anIntArray553[anInt7746];
										local21 = anIntArray553[anInt7746 + 1];
										local303 = arg1 ? aClass273_14 : aClass273_15;
										Static289.method4070(local15, local303, local21);
										return;
									}
									if (arg0 == 3110) {
										local15 = anIntArray553[--anInt7746];
										local4977 = Static592.method8154(Static541.aClass349_128, Static487.aClass221_2.aClass48_1);
										local4977.aClass2_Sub20_Sub2_1.method8551(local15);
										Static487.aClass221_2.method5173(local4977);
										return;
									}
									if (arg0 == 3111) {
										anInt7746 -= 2;
										local15 = anIntArray553[anInt7746];
										local21 = anIntArray553[anInt7746 + 1];
										local4732 = (Class2_Sub26) Static463.aClass218_36.method5095((long) local15, 0);
										if (local4732 != null) {
											Static331.method4599(local4732, true, local4732.anInt3020 != local21);
										}
										Static453.method6603(local21, local15, true, 3);
										return;
									}
									if (arg0 == 3112) {
										anInt7746--;
										local15 = anIntArray553[anInt7746];
										local4625 = (Class2_Sub26) Static463.aClass218_36.method5095((long) local15, 0);
										if (local4625 != null && local4625.anInt3019 == 3) {
											Static331.method4599(local4625, true, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static260.method3686(aStringArray33[--anInt7744]);
										return;
									}
									if (arg0 == 3114) {
										anInt7746 -= 2;
										local15 = anIntArray553[anInt7746];
										local21 = anIntArray553[anInt7746 + 1];
										local1791 = aStringArray33[--anInt7744];
										Static296.method4163(local21, "", local1791, local15, "", "");
										return;
									}
									if (arg0 == 3115) {
										anInt7746 -= 11;
										@Pc(5292) Class18[] local5292 = Static562.method7826();
										@Pc(5295) Class239[] local5295 = Static505.method7161();
										Static104.method1550(anIntArray553[anInt7746 + 4], anIntArray553[anInt7746 + 9], anIntArray553[anInt7746 + 7], local5295[anIntArray553[anInt7746 + 1]], anIntArray553[anInt7746 + 2], anIntArray553[anInt7746 + 6], local5292[anIntArray553[anInt7746]], anIntArray553[anInt7746 + 10], anIntArray553[anInt7746 + 3], anIntArray553[anInt7746 + 5], anIntArray553[anInt7746 + 8]);
										return;
									}
									if (arg0 == 3116) {
										local15 = anIntArray553[--anInt7746];
										local4977 = Static592.method8154(Static565.aClass349_132, Static487.aClass221_2.aClass48_1);
										local4977.aClass2_Sub20_Sub2_1.method8551(local15);
										Static487.aClass221_2.method5173(local4977);
										return;
									}
									if (arg0 == 3117) {
										local4883 = aStringArray33[--anInt7744];
										local4977 = Static592.method8154(Static383.aClass349_3, Static487.aClass221_2.aClass48_1);
										local4977.aClass2_Sub20_Sub2_1.method8584(local4883.length() + 1);
										local4977.aClass2_Sub20_Sub2_1.method8541(local4883);
										Static487.aClass221_2.method5173(local4977);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt7746 -= 3;
										Static485.method6932(256, anIntArray553[anInt7746 + 1], 255, anIntArray553[anInt7746 + 2], anIntArray553[anInt7746]);
										return;
									}
									if (arg0 == 3201) {
										Static4.method60(50, 255, anIntArray553[--anInt7746]);
										return;
									}
									if (arg0 == 3202) {
										anInt7746 -= 2;
										Static91.method1408(anIntArray553[anInt7746 + 1], anIntArray553[anInt7746], 255);
										return;
									}
									if (arg0 == 3203) {
										anInt7746 -= 4;
										Static485.method6932(256, anIntArray553[anInt7746 + 1], anIntArray553[anInt7746 + 3], anIntArray553[anInt7746 + 2], anIntArray553[anInt7746]);
										return;
									}
									if (arg0 == 3204) {
										anInt7746 -= 3;
										Static4.method60(anIntArray553[anInt7746 + 2], anIntArray553[anInt7746 + 1], anIntArray553[anInt7746]);
										return;
									}
									if (arg0 == 3205) {
										anInt7746 -= 3;
										Static91.method1408(anIntArray553[anInt7746 + 1], anIntArray553[anInt7746], anIntArray553[anInt7746 + 2]);
										return;
									}
									if (arg0 == 3206) {
										anInt7746 -= 4;
										Static43.method587(anIntArray553[anInt7746], anIntArray553[anInt7746 + 3], false, anIntArray553[anInt7746 + 1], 256, anIntArray553[anInt7746 + 2]);
										return;
									}
									if (arg0 == 3207) {
										anInt7746 -= 4;
										Static43.method587(anIntArray553[anInt7746], anIntArray553[anInt7746 + 3], true, anIntArray553[anInt7746 + 1], 256, anIntArray553[anInt7746 + 2]);
										return;
									}
									if (arg0 == 3208) {
										anInt7746 -= 5;
										Static485.method6932(anIntArray553[anInt7746 + 4], anIntArray553[anInt7746 + 1], anIntArray553[anInt7746 + 3], anIntArray553[anInt7746 + 2], anIntArray553[anInt7746]);
										return;
									}
									if (arg0 == 3209) {
										anInt7746 -= 5;
										Static43.method587(anIntArray553[anInt7746], anIntArray553[anInt7746 + 3], false, anIntArray553[anInt7746 + 1], anIntArray553[anInt7746 + 4], anIntArray553[anInt7746 + 2]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray553[anInt7746++] = Static528.anInt8386;
										return;
									}
									if (arg0 == 3301) {
										anInt7746 -= 2;
										local15 = anIntArray553[anInt7746];
										local21 = anIntArray553[anInt7746 + 1];
										anIntArray553[anInt7746++] = Static703.method9412(local21, false, local15);
										return;
									}
									if (arg0 == 3302) {
										anInt7746 -= 2;
										local15 = anIntArray553[anInt7746];
										local21 = anIntArray553[anInt7746 + 1];
										anIntArray553[anInt7746++] = Static363.method5222(false, local15, local21);
										return;
									}
									if (arg0 == 3303) {
										anInt7746 -= 2;
										local15 = anIntArray553[anInt7746];
										local21 = anIntArray553[anInt7746 + 1];
										anIntArray553[anInt7746++] = Static321.method4457(local15, false, local21, -18163);
										return;
									}
									if (arg0 == 3304) {
										local15 = anIntArray553[--anInt7746];
										anIntArray553[anInt7746++] = Static130.aClass141_1.method2993(local15).anInt7206;
										return;
									}
									if (arg0 == 3305) {
										local15 = anIntArray553[--anInt7746];
										anIntArray553[anInt7746++] = Static639.anIntArray706[local15];
										return;
									}
									if (arg0 == 3306) {
										local15 = anIntArray553[--anInt7746];
										anIntArray553[anInt7746++] = Static237.anIntArray766[local15];
										return;
									}
									if (arg0 == 3307) {
										local15 = anIntArray553[--anInt7746];
										anIntArray553[anInt7746++] = Static1.anIntArray668[local15];
										return;
									}
									if (arg0 == 3308) {
										@Pc(5901) byte local5901 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133;
										local21 = (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229 >> 9) + Static243.anInt3820;
										local27 = (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228 >> 9) + Static224.anInt11062;
										anIntArray553[anInt7746++] = (local5901 << 28) + (local21 << 14) + local27;
										return;
									}
									if (arg0 == 3309) {
										local15 = anIntArray553[--anInt7746];
										anIntArray553[anInt7746++] = local15 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local15 = anIntArray553[--anInt7746];
										anIntArray553[anInt7746++] = local15 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local15 = anIntArray553[--anInt7746];
										anIntArray553[anInt7746++] = local15 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray553[anInt7746++] = Static102.aBoolean202 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt7746 -= 2;
										local15 = anIntArray553[anInt7746];
										local21 = anIntArray553[anInt7746 + 1];
										anIntArray553[anInt7746++] = Static703.method9412(local21, true, local15);
										return;
									}
									if (arg0 == 3314) {
										anInt7746 -= 2;
										local15 = anIntArray553[anInt7746];
										local21 = anIntArray553[anInt7746 + 1];
										anIntArray553[anInt7746++] = Static363.method5222(true, local15, local21);
										return;
									}
									if (arg0 == 3315) {
										anInt7746 -= 2;
										local15 = anIntArray553[anInt7746];
										local21 = anIntArray553[anInt7746 + 1];
										anIntArray553[anInt7746++] = Static321.method4457(local15, true, local21, -18163);
										return;
									}
									if (arg0 == 3316) {
										if (Static565.anInt8888 >= 2) {
											anIntArray553[anInt7746++] = Static565.anInt8888;
											return;
										}
										anIntArray553[anInt7746++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray553[anInt7746++] = Static283.anInt8842;
										return;
									}
									if (arg0 == 3318) {
										anIntArray553[anInt7746++] = Static548.aClass176_3.anInt4157;
										return;
									}
									if (arg0 == 3321) {
										anIntArray553[anInt7746++] = Static190.anInt3107;
										return;
									}
									if (arg0 == 3322) {
										anIntArray553[anInt7746++] = Static175.anInt10801;
										return;
									}
									if (arg0 == 3323) {
										if (Static65.anInt1141 >= 5 && Static65.anInt1141 <= 9) {
											anIntArray553[anInt7746++] = 1;
											return;
										}
										anIntArray553[anInt7746++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static65.anInt1141 >= 5 && Static65.anInt1141 <= 9) {
											anIntArray553[anInt7746++] = Static65.anInt1141;
											return;
										}
										anIntArray553[anInt7746++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray553[anInt7746++] = Static566.aBoolean755 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray553[anInt7746++] = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt851;
										return;
									}
									if (arg0 == 3327) {
										anIntArray553[anInt7746++] = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass116_1 != null && Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass116_1.aBoolean287 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray553[anInt7746++] = Static329.aBoolean429 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local15 = anIntArray553[--anInt7746];
										anIntArray553[anInt7746++] = Static275.method3844(local15);
										return;
									}
									if (arg0 == 3331) {
										anInt7746 -= 2;
										local15 = anIntArray553[anInt7746];
										local21 = anIntArray553[anInt7746 + 1];
										anIntArray553[anInt7746++] = Static301.method8954(false, local21, local15);
										return;
									}
									if (arg0 == 3332) {
										anInt7746 -= 2;
										local15 = anIntArray553[anInt7746];
										local21 = anIntArray553[anInt7746 + 1];
										anIntArray553[anInt7746++] = Static301.method8954(true, local21, local15);
										return;
									}
									if (arg0 == 3333) {
										anIntArray553[anInt7746++] = Static543.method7584();
										return;
									}
									if (arg0 == 3335) {
										anIntArray553[anInt7746++] = Static414.anInt9485;
										return;
									}
									if (arg0 == 3336) {
										anInt7746 -= 4;
										local15 = anIntArray553[anInt7746];
										local21 = anIntArray553[anInt7746 + 1];
										local27 = anIntArray553[anInt7746 + 2];
										local506 = anIntArray553[anInt7746 + 3];
										local15 += local21 << 14;
										local15 += local27 << 28;
										local15 += local506;
										anIntArray553[anInt7746++] = local15;
										return;
									}
									if (arg0 == 3337) {
										anIntArray553[anInt7746++] = Static175.anInt10800;
										return;
									}
									if (arg0 == 3338) {
										anIntArray553[anInt7746++] = Static246.method3455();
										return;
									}
									if (arg0 == 3339) {
										anIntArray553[anInt7746++] = 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray553[anInt7746++] = Static344.aBoolean451 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray553[anInt7746++] = Static174.aBoolean296 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray553[anInt7746++] = Static402.aClass138_1.method4767();
										return;
									}
									if (arg0 == 3343) {
										anIntArray553[anInt7746++] = Static402.aClass138_1.method4771();
										return;
									}
									if (arg0 == 3344) {
										aStringArray33[anInt7744++] = Static668.method9111();
										return;
									}
									if (arg0 == 3345) {
										aStringArray33[anInt7744++] = Static526.method7417();
										return;
									}
									if (arg0 == 3346) {
										anIntArray553[anInt7746++] = Static112.method1626();
										return;
									}
									if (arg0 == 3347) {
										anIntArray553[anInt7746++] = Static632.anInt9753;
										return;
									}
									if (arg0 == 3349) {
										anIntArray553[anInt7746++] = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass178_7.method3799() >> 3;
										return;
									}
									if (arg0 == 3350) {
										local4883 = aStringArray33[--anInt7744];
										if (Static382.aString66 != null && Static382.aString66.equalsIgnoreCase(local4883)) {
											anIntArray553[anInt7746++] = 1;
											return;
										}
										anIntArray553[anInt7746++] = 0;
										return;
									}
								} else {
									@Pc(7266) String local7266;
									if (arg0 < 3500) {
										@Pc(6743) Class54 local6743;
										if (arg0 == 3400) {
											anInt7746 -= 2;
											local15 = anIntArray553[anInt7746];
											local21 = anIntArray553[anInt7746 + 1];
											local6743 = Static10.aClass57_1.method1192(local15);
											aStringArray33[anInt7744++] = local6743.method1097(local21);
											return;
										}
										@Pc(6789) Class54 local6789;
										if (arg0 == 3408) {
											anInt7746 -= 4;
											local15 = anIntArray553[anInt7746];
											local21 = anIntArray553[anInt7746 + 1];
											local27 = anIntArray553[anInt7746 + 2];
											local506 = anIntArray553[anInt7746 + 3];
											local6789 = Static10.aClass57_1.method1192(local27);
											if (local6789.aChar3 == local15 && local6789.aChar2 == local21) {
												if (local21 == 115) {
													aStringArray33[anInt7744++] = local6789.method1097(local506);
													return;
												}
												anIntArray553[anInt7746++] = local6789.method1100(local506);
												return;
											}
											throw new RuntimeException("C3408-1 " + local27 + "-" + local506);
										}
										@Pc(6884) Class54 local6884;
										if (arg0 == 3409) {
											anInt7746 -= 3;
											local15 = anIntArray553[anInt7746];
											local21 = anIntArray553[anInt7746 + 1];
											local27 = anIntArray553[anInt7746 + 2];
											if (local21 == -1) {
												throw new RuntimeException("C3409-2");
											}
											local6884 = Static10.aClass57_1.method1192(local21);
											if (local6884.aChar2 != local15) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray553[anInt7746++] = local6884.method1107(local27) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local15 = anIntArray553[--anInt7746];
											local1394 = aStringArray33[--anInt7744];
											if (local15 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local6743 = Static10.aClass57_1.method1192(local15);
											if (local6743.aChar2 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray553[anInt7746++] = local6743.method1102(local1394) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local15 = anIntArray553[--anInt7746];
											@Pc(6993) Class54 local6993 = Static10.aClass57_1.method1192(local15);
											anIntArray553[anInt7746++] = local6993.method1105();
											return;
										}
										if (arg0 == 3412) {
											anInt7746 -= 3;
											local15 = anIntArray553[anInt7746];
											local21 = anIntArray553[anInt7746 + 1];
											local27 = anIntArray553[anInt7746 + 2];
											if (local21 == -1) {
												throw new RuntimeException();
											}
											local6884 = Static10.aClass57_1.method1192(local21);
											if (local6884.aChar2 != local15) {
												throw new RuntimeException();
											}
											@Pc(7054) Class2_Sub55 local7054 = local6884.method1104(local27);
											local72 = 0;
											if (local7054 != null) {
												local72 = local7054.anIntArray749.length;
											}
											anIntArray553[anInt7746++] = local72;
											return;
										}
										if (arg0 == 3413) {
											local15 = anIntArray553[--anInt7746];
											local1394 = aStringArray33[--anInt7744];
											if (local15 == -1) {
												throw new RuntimeException();
											}
											local6743 = Static10.aClass57_1.method1192(local15);
											if (local6743.aChar2 != 's') {
												throw new RuntimeException();
											}
											@Pc(7117) Class2_Sub14 local7117 = local6743.method1099(local1394, 21479);
											local2978 = 0;
											if (local7117 != null) {
												local2978 = local7117.anIntArray114.length;
											}
											anIntArray553[anInt7746++] = local2978;
											return;
										}
										if (arg0 == 3414) {
											anInt7746 -= 5;
											local15 = anIntArray553[anInt7746];
											local21 = anIntArray553[anInt7746 + 1];
											local27 = anIntArray553[anInt7746 + 2];
											local506 = anIntArray553[anInt7746 + 3];
											local2978 = anIntArray553[anInt7746 + 4];
											if (local27 == -1) {
												throw new RuntimeException();
											}
											@Pc(7182) Class54 local7182 = Static10.aClass57_1.method1192(local27);
											if (local7182.aChar3 != local21) {
												throw new RuntimeException();
											}
											if (local7182.aChar2 != local15) {
												throw new RuntimeException();
											}
											@Pc(7205) Class2_Sub55 local7205 = local7182.method1104(local506);
											if (local2978 >= 0 && local7205 != null && local7205.anIntArray749.length > local2978) {
												anIntArray553[anInt7746++] = local7205.anIntArray749[local2978];
												return;
											}
											throw new RuntimeException();
										}
										if (arg0 == 3415) {
											anInt7746 -= 3;
											local15 = anIntArray553[anInt7746];
											local21 = anIntArray553[anInt7746 + 1];
											local27 = anIntArray553[anInt7746 + 2];
											local7266 = aStringArray33[--anInt7744];
											if (local21 == -1) {
												throw new RuntimeException();
											}
											local6789 = Static10.aClass57_1.method1192(local21);
											if (local6789.aChar3 != local15) {
												throw new RuntimeException();
											}
											if (local6789.aChar2 != 's') {
												throw new RuntimeException();
											}
											@Pc(7302) Class2_Sub14 local7302 = local6789.method1099(local7266, 21479);
											if (local27 >= 0 && local7302 != null && local7302.anIntArray114.length > local27) {
												anIntArray553[anInt7746++] = local7302.anIntArray114[local27];
												return;
											}
											throw new RuntimeException();
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static508.anInt8050 == 0) {
												anIntArray553[anInt7746++] = -2;
												return;
											}
											if (Static508.anInt8050 == 1) {
												anIntArray553[anInt7746++] = -1;
												return;
											}
											anIntArray553[anInt7746++] = Static143.anInt2455;
											return;
										}
										if (arg0 == 3601) {
											local15 = anIntArray553[--anInt7746];
											if (Static508.anInt8050 == 2 && local15 < Static143.anInt2455) {
												aStringArray33[anInt7744++] = Static80.aStringArray8[local15];
												if (Static180.aStringArray23[local15] != null) {
													aStringArray33[anInt7744++] = Static180.aStringArray23[local15];
													return;
												}
												aStringArray33[anInt7744++] = "";
												return;
											}
											aStringArray33[anInt7744++] = "";
											aStringArray33[anInt7744++] = "";
											return;
										}
										if (arg0 == 3602) {
											local15 = anIntArray553[--anInt7746];
											if (Static508.anInt8050 == 2 && local15 < Static143.anInt2455) {
												anIntArray553[anInt7746++] = Static59.anIntArray91[local15];
												return;
											}
											anIntArray553[anInt7746++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local15 = anIntArray553[--anInt7746];
											if (Static508.anInt8050 == 2 && local15 < Static143.anInt2455) {
												anIntArray553[anInt7746++] = Static132.anIntArray162[local15];
												return;
											}
											anIntArray553[anInt7746++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local4883 = aStringArray33[--anInt7744];
											local21 = anIntArray553[--anInt7746];
											Static581.method8087(local4883, local21);
											return;
										}
										if (arg0 == 3605) {
											local4883 = aStringArray33[--anInt7744];
											Static277.method3933(local4883);
											return;
										}
										if (arg0 == 3606) {
											local4883 = aStringArray33[--anInt7744];
											Static534.method7498(local4883);
											return;
										}
										if (arg0 == 3607) {
											local4883 = aStringArray33[--anInt7744];
											Static429.method1390(false, local4883);
											return;
										}
										if (arg0 == 3608) {
											local4883 = aStringArray33[--anInt7744];
											Static693.method9343(local4883);
											return;
										}
										if (arg0 == 3609) {
											local4883 = aStringArray33[--anInt7744];
											if (local4883.startsWith("<img=0>") || local4883.startsWith("<img=1>")) {
												local4883 = local4883.substring(7);
											}
											anIntArray553[anInt7746++] = Static574.method7978(local4883) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local15 = anIntArray553[--anInt7746];
											if (Static508.anInt8050 == 2 && local15 < Static143.anInt2455) {
												aStringArray33[anInt7744++] = Static422.aStringArray27[local15];
												return;
											}
											aStringArray33[anInt7744++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static409.aString69 != null) {
												aStringArray33[anInt7744++] = Static452.method6596(Static409.aString69);
												return;
											}
											aStringArray33[anInt7744++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static409.aString69 != null) {
												anIntArray553[anInt7746++] = Static664.anInt10333;
												return;
											}
											anIntArray553[anInt7746++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local15 = anIntArray553[--anInt7746];
											if (Static409.aString69 != null && local15 < Static664.anInt10333) {
												aStringArray33[anInt7744++] = Static56.aClass143Array1[local15].aString40;
												return;
											}
											aStringArray33[anInt7744++] = "";
											return;
										}
										if (arg0 == 3614) {
											local15 = anIntArray553[--anInt7746];
											if (Static409.aString69 != null && local15 < Static664.anInt10333) {
												anIntArray553[anInt7746++] = Static56.aClass143Array1[local15].anInt3446;
												return;
											}
											anIntArray553[anInt7746++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local15 = anIntArray553[--anInt7746];
											if (Static409.aString69 != null && local15 < Static664.anInt10333) {
												anIntArray553[anInt7746++] = Static56.aClass143Array1[local15].aByte69;
												return;
											}
											anIntArray553[anInt7746++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray553[anInt7746++] = Static699.aByte146;
											return;
										}
										if (arg0 == 3617) {
											local4883 = aStringArray33[--anInt7744];
											Static123.method1822(local4883);
											return;
										}
										if (arg0 == 3618) {
											anIntArray553[anInt7746++] = Static549.aByte119;
											return;
										}
										if (arg0 == 3619) {
											local4883 = aStringArray33[--anInt7744];
											Static493.method7051(local4883);
											return;
										}
										if (arg0 == 3620) {
											Static458.method6649();
											return;
										}
										if (arg0 == 3621) {
											if (Static508.anInt8050 == 0) {
												anIntArray553[anInt7746++] = -1;
												return;
											}
											anIntArray553[anInt7746++] = Static194.anInt3157;
											return;
										}
										if (arg0 == 3622) {
											local15 = anIntArray553[--anInt7746];
											if (Static508.anInt8050 != 0 && local15 < Static194.anInt3157) {
												aStringArray33[anInt7744++] = Static12.aStringArray2[local15];
												if (Static514.aStringArray37[local15] != null) {
													aStringArray33[anInt7744++] = Static514.aStringArray37[local15];
													return;
												}
												aStringArray33[anInt7744++] = "";
												return;
											}
											aStringArray33[anInt7744++] = "";
											aStringArray33[anInt7744++] = "";
											return;
										}
										if (arg0 == 3623) {
											local4883 = aStringArray33[--anInt7744];
											if (local4883.startsWith("<img=0>") || local4883.startsWith("<img=1>")) {
												local4883 = local4883.substring(7);
											}
											anIntArray553[anInt7746++] = Static255.method3623(local4883) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local15 = anIntArray553[--anInt7746];
											if (Static56.aClass143Array1 != null && local15 < Static664.anInt10333 && Static56.aClass143Array1[local15].aString41.equalsIgnoreCase(Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aString4)) {
												anIntArray553[anInt7746++] = 1;
												return;
											}
											anIntArray553[anInt7746++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static305.aString23 != null) {
												aStringArray33[anInt7744++] = Static305.aString23;
												return;
											}
											aStringArray33[anInt7744++] = "";
											return;
										}
										if (arg0 == 3626) {
											local15 = anIntArray553[--anInt7746];
											if (Static409.aString69 != null && local15 < Static664.anInt10333) {
												aStringArray33[anInt7744++] = Static56.aClass143Array1[local15].aString42;
												return;
											}
											aStringArray33[anInt7744++] = "";
											return;
										}
										if (arg0 == 3627) {
											local15 = anIntArray553[--anInt7746];
											if (Static508.anInt8050 == 2 && local15 >= 0 && local15 < Static143.anInt2455) {
												anIntArray553[anInt7746++] = Static147.aBooleanArray13[local15] ? 1 : 0;
												return;
											}
											anIntArray553[anInt7746++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local4883 = aStringArray33[--anInt7744];
											if (local4883.startsWith("<img=0>") || local4883.startsWith("<img=1>")) {
												local4883 = local4883.substring(7);
											}
											anIntArray553[anInt7746++] = Static428.method6262(local4883);
											return;
										}
										if (arg0 == 3629) {
											anIntArray553[anInt7746++] = Static64.anInt1107;
											return;
										}
										if (arg0 == 3630) {
											local4883 = aStringArray33[--anInt7744];
											Static429.method1390(true, local4883);
											return;
										}
										if (arg0 == 3631) {
											local15 = anIntArray553[--anInt7746];
											anIntArray553[anInt7746++] = Static616.aBooleanArray37[local15] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local15 = anIntArray553[--anInt7746];
											if (Static409.aString69 != null && local15 < Static664.anInt10333) {
												aStringArray33[anInt7744++] = Static56.aClass143Array1[local15].aString41;
												return;
											}
											aStringArray33[anInt7744++] = "";
											return;
										}
										if (arg0 == 3633) {
											local15 = anIntArray553[--anInt7746];
											if (Static508.anInt8050 != 0 && local15 < Static194.anInt3157) {
												aStringArray33[anInt7744++] = Static451.aStringArray31[local15];
												return;
											}
											aStringArray33[anInt7744++] = "";
											return;
										}
										if (arg0 == 3634) {
											local15 = anIntArray553[--anInt7746];
											if (Static508.anInt8050 == 2 && local15 < Static143.anInt2455) {
												anIntArray553[anInt7746++] = Static388.aBooleanArray28[local15] ? 1 : 0;
												return;
											}
											anIntArray553[anInt7746++] = 0;
											return;
										}
									} else if (arg0 < 3800) {
										if (arg0 == 3700) {
											if (Static91.aClass394_3 != null) {
												anIntArray553[anInt7746++] = 1;
												aClass394_6 = Static91.aClass394_3;
												return;
											}
											anIntArray553[anInt7746++] = 0;
											return;
										}
										if (arg0 == 3701) {
											if (Static276.aClass394_7 != null) {
												anIntArray553[anInt7746++] = 1;
												aClass394_6 = Static276.aClass394_7;
												return;
											}
											anIntArray553[anInt7746++] = 0;
											return;
										}
										if (arg0 == 3702) {
											aStringArray33[anInt7744++] = aClass394_6.aString126;
											return;
										}
										if (arg0 == 3703) {
											anIntArray553[anInt7746++] = aClass394_6.aBoolean923 ? 1 : 0;
											return;
										}
										if (arg0 == 3704) {
											anIntArray553[anInt7746++] = aClass394_6.aByte149;
											return;
										}
										if (arg0 == 3705) {
											anIntArray553[anInt7746++] = aClass394_6.aByte150;
											return;
										}
										if (arg0 == 3706) {
											anIntArray553[anInt7746++] = aClass394_6.aByte148;
											return;
										}
										if (arg0 == 3707) {
											anIntArray553[anInt7746++] = aClass394_6.aByte147;
											return;
										}
										if (arg0 == 3709) {
											anIntArray553[anInt7746++] = aClass394_6.anInt10742;
											return;
										}
										if (arg0 == 3710) {
											local15 = anIntArray553[--anInt7746];
											aStringArray33[anInt7744++] = aClass394_6.aStringArray44[local15];
											return;
										}
										if (arg0 == 3711) {
											local15 = anIntArray553[--anInt7746];
											anIntArray553[anInt7746++] = aClass394_6.aByteArray120[local15];
											return;
										}
										if (arg0 == 3712) {
											anIntArray553[anInt7746++] = aClass394_6.anInt10757;
											return;
										}
										if (arg0 == 3713) {
											local15 = anIntArray553[--anInt7746];
											aStringArray33[anInt7744++] = aClass394_6.aStringArray43[local15];
											return;
										}
										if (arg0 == 3714) {
											anInt7746 -= 3;
											local15 = anIntArray553[anInt7746];
											local21 = anIntArray553[anInt7746 + 1];
											local27 = anIntArray553[anInt7746 + 2];
											anIntArray553[anInt7746++] = aClass394_6.method9388(local15, local27, local21);
											return;
										}
										if (arg0 == 3715) {
											anIntArray553[anInt7746++] = aClass394_6.anInt10756;
											return;
										}
										if (arg0 == 3716) {
											anIntArray553[anInt7746++] = aClass394_6.anInt10750;
											return;
										}
										if (arg0 == 3717) {
											anIntArray553[anInt7746++] = aClass394_6.method9401(aStringArray33[--anInt7744]);
											return;
										}
										if (arg0 == 3718) {
											anIntArray553[anInt7746 - 1] = aClass394_6.method9396()[anIntArray553[anInt7746 - 1]];
											return;
										}
										if (arg0 == 3719) {
											Static9.method186(anIntArray553[--anInt7746]);
											return;
										}
										if (arg0 == 3720) {
											local15 = anIntArray553[--anInt7746];
											anIntArray553[anInt7746++] = aClass394_6.anIntArray744[local15];
											return;
										}
										if (arg0 == 3750) {
											if (Static205.aClass2_Sub43_2 != null) {
												anIntArray553[anInt7746++] = 1;
												aClass2_Sub43_3 = Static205.aClass2_Sub43_2;
												return;
											}
											anIntArray553[anInt7746++] = 0;
											return;
										}
										if (arg0 == 3751) {
											if (Static176.aClass2_Sub43_1 != null) {
												anIntArray553[anInt7746++] = 1;
												aClass2_Sub43_3 = Static176.aClass2_Sub43_1;
												return;
											}
											anIntArray553[anInt7746++] = 0;
											return;
										}
										if (arg0 == 3752) {
											aStringArray33[anInt7744++] = aClass2_Sub43_3.aString77;
											return;
										}
										if (arg0 == 3753) {
											anIntArray553[anInt7746++] = aClass2_Sub43_3.aByte100;
											return;
										}
										if (arg0 == 3754) {
											anIntArray553[anInt7746++] = aClass2_Sub43_3.aByte101;
											return;
										}
										if (arg0 == 3755) {
											anIntArray553[anInt7746++] = aClass2_Sub43_3.anInt7160;
											return;
										}
										if (arg0 == 3756) {
											local15 = anIntArray553[--anInt7746];
											aStringArray33[anInt7744++] = aClass2_Sub43_3.aClass233Array1[local15].aString65;
											return;
										}
										if (arg0 == 3757) {
											local15 = anIntArray553[--anInt7746];
											anIntArray553[anInt7746++] = aClass2_Sub43_3.aClass233Array1[local15].aByte80;
											return;
										}
										if (arg0 == 3758) {
											local15 = anIntArray553[--anInt7746];
											anIntArray553[anInt7746++] = aClass2_Sub43_3.aClass233Array1[local15].anInt6059;
											return;
										}
										if (arg0 == 3759) {
											local15 = anIntArray553[--anInt7746];
											Static462.method6679(local15, aClass2_Sub43_3 == Static176.aClass2_Sub43_1);
											return;
										}
										if (arg0 == 3760) {
											anIntArray553[anInt7746++] = aClass2_Sub43_3.method6390(aStringArray33[--anInt7744]);
											return;
										}
										if (arg0 == 3761) {
											anIntArray553[anInt7746 - 1] = aClass2_Sub43_3.method6387()[anIntArray553[anInt7746 - 1]];
											return;
										}
										if (arg0 == 3790) {
											anIntArray553[anInt7746++] = Static234.anObjectArray1 == null ? 0 : 1;
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local15 = anIntArray553[--anInt7746];
											anIntArray553[anInt7746++] = Static667.aClass374Array1[local15].method9033();
											return;
										}
										if (arg0 == 3904) {
											local15 = anIntArray553[--anInt7746];
											anIntArray553[anInt7746++] = Static667.aClass374Array1[local15].anInt10301;
											return;
										}
										if (arg0 == 3905) {
											local15 = anIntArray553[--anInt7746];
											anIntArray553[anInt7746++] = Static667.aClass374Array1[local15].anInt10307;
											return;
										}
										if (arg0 == 3906) {
											local15 = anIntArray553[--anInt7746];
											anIntArray553[anInt7746++] = Static667.aClass374Array1[local15].anInt10300;
											return;
										}
										if (arg0 == 3907) {
											local15 = anIntArray553[--anInt7746];
											anIntArray553[anInt7746++] = Static667.aClass374Array1[local15].anInt10305;
											return;
										}
										if (arg0 == 3908) {
											local15 = anIntArray553[--anInt7746];
											anIntArray553[anInt7746++] = Static667.aClass374Array1[local15].anInt10302;
											return;
										}
										if (arg0 == 3910) {
											local15 = anIntArray553[--anInt7746];
											local21 = Static667.aClass374Array1[local15].method9031();
											anIntArray553[anInt7746++] = local21 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local15 = anIntArray553[--anInt7746];
											local21 = Static667.aClass374Array1[local15].method9031();
											anIntArray553[anInt7746++] = local21 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local15 = anIntArray553[--anInt7746];
											local21 = Static667.aClass374Array1[local15].method9031();
											anIntArray553[anInt7746++] = local21 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local15 = anIntArray553[--anInt7746];
											local21 = Static667.aClass374Array1[local15].method9031();
											anIntArray553[anInt7746++] = local21 == 1 ? 1 : 0;
											return;
										}
									} else {
										@Pc(9626) long local9626;
										if (arg0 < 4100) {
											if (arg0 == 4000) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												anIntArray553[anInt7746++] = local15 + local21;
												return;
											}
											if (arg0 == 4001) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												anIntArray553[anInt7746++] = local15 - local21;
												return;
											}
											if (arg0 == 4002) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												anIntArray553[anInt7746++] = local15 * local21;
												return;
											}
											if (arg0 == 4003) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												anIntArray553[anInt7746++] = local15 / local21;
												return;
											}
											if (arg0 == 4004) {
												local15 = anIntArray553[--anInt7746];
												anIntArray553[anInt7746++] = (int) (Math.random() * (double) local15);
												return;
											}
											if (arg0 == 4005) {
												local15 = anIntArray553[--anInt7746];
												anIntArray553[anInt7746++] = (int) (Math.random() * (double) (local15 + 1));
												return;
											}
											if (arg0 == 4006) {
												anInt7746 -= 5;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												local27 = anIntArray553[anInt7746 + 2];
												local506 = anIntArray553[anInt7746 + 3];
												local2978 = anIntArray553[anInt7746 + 4];
												anIntArray553[anInt7746++] = local15 + (local21 - local15) * (local2978 - local27) / (local506 - local27);
												return;
											}
											@Pc(9633) long local9633;
											if (arg0 == 4007) {
												anInt7746 -= 2;
												local9626 = (long) anIntArray553[anInt7746];
												local9633 = (long) anIntArray553[anInt7746 + 1];
												anIntArray553[anInt7746++] = (int) (local9626 + local9626 * local9633 / 100L);
												return;
											}
											if (arg0 == 4008) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												anIntArray553[anInt7746++] = local15 | 0x1 << local21;
												return;
											}
											if (arg0 == 4009) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												anIntArray553[anInt7746++] = local15 & -(0x1 << local21) - 1;
												return;
											}
											if (arg0 == 4010) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												anIntArray553[anInt7746++] = (local15 & 0x1 << local21) == 0 ? 0 : 1;
												return;
											}
											if (arg0 == 4011) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												anIntArray553[anInt7746++] = local15 % local21;
												return;
											}
											if (arg0 == 4012) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												if (local15 == 0) {
													anIntArray553[anInt7746++] = 0;
													return;
												}
												anIntArray553[anInt7746++] = (int) Math.pow((double) local15, (double) local21);
												return;
											}
											if (arg0 == 4013) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												if (local15 == 0) {
													anIntArray553[anInt7746++] = 0;
													return;
												}
												if (local21 == 0) {
													anIntArray553[anInt7746++] = Integer.MAX_VALUE;
													return;
												}
												anIntArray553[anInt7746++] = (int) Math.pow((double) local15, 1.0D / (double) local21);
												return;
											}
											if (arg0 == 4014) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												anIntArray553[anInt7746++] = local15 & local21;
												return;
											}
											if (arg0 == 4015) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												anIntArray553[anInt7746++] = local15 | local21;
												return;
											}
											if (arg0 == 4016) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												anIntArray553[anInt7746++] = local15 < local21 ? local15 : local21;
												return;
											}
											if (arg0 == 4017) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												anIntArray553[anInt7746++] = local15 > local21 ? local15 : local21;
												return;
											}
											if (arg0 == 4018) {
												anInt7746 -= 3;
												local9626 = (long) anIntArray553[anInt7746];
												local9633 = (long) anIntArray553[anInt7746 + 1];
												@Pc(10020) long local10020 = (long) anIntArray553[anInt7746 + 2];
												anIntArray553[anInt7746++] = (int) (local9626 * local10020 / local9633);
												return;
											}
											if (arg0 == 4019) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												if (local15 > 700 || local21 > 700) {
													anIntArray553[anInt7746++] = 256;
												}
												@Pc(10083) double local10083 = (Math.random() * (double) (local21 + local15) + 800.0D - (double) local15) / 100.0D;
												anIntArray553[anInt7746++] = (int) (Math.pow(2.0D, local10083) + 0.5D);
												return;
											}
											if (arg0 == 4020) {
												local15 = anIntArray553[--anInt7746];
												anIntArray553[anInt7746++] = Static488.anIntArray557[Static271.method3801(local15) & 0xFFFF];
												return;
											}
										} else if (arg0 < 4200) {
											if (arg0 == 4100) {
												local4883 = aStringArray33[--anInt7744];
												local21 = anIntArray553[--anInt7746];
												aStringArray33[anInt7744++] = local4883 + local21;
												return;
											}
											if (arg0 == 4101) {
												anInt7744 -= 2;
												local4883 = aStringArray33[anInt7744];
												local1394 = aStringArray33[anInt7744 + 1];
												aStringArray33[anInt7744++] = local4883 + local1394;
												return;
											}
											if (arg0 == 4102) {
												local4883 = aStringArray33[--anInt7744];
												local21 = anIntArray553[--anInt7746];
												aStringArray33[anInt7744++] = local4883 + Static251.method3564(true, local21);
												return;
											}
											if (arg0 == 4103) {
												local4883 = aStringArray33[--anInt7744];
												aStringArray33[anInt7744++] = local4883.toLowerCase();
												return;
											}
											if (arg0 == 4104) {
												aStringArray33[anInt7744++] = Static496.method7085(Static73.method1140(anIntArray553[--anInt7746]), Static414.anInt9485);
												return;
											}
											if (arg0 == 4105) {
												anInt7744 -= 2;
												local4883 = aStringArray33[anInt7744];
												local1394 = aStringArray33[anInt7744 + 1];
												if (Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass116_1 != null && Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aClass116_1.aBoolean287) {
													aStringArray33[anInt7744++] = local1394;
													return;
												}
												aStringArray33[anInt7744++] = local4883;
												return;
											}
											if (arg0 == 4106) {
												local15 = anIntArray553[--anInt7746];
												aStringArray33[anInt7744++] = Integer.toString(local15);
												return;
											}
											if (arg0 == 4107) {
												anInt7744 -= 2;
												anIntArray553[anInt7746++] = Static104.method1552(aStringArray33[anInt7744], Static414.anInt9485, aStringArray33[anInt7744 + 1]);
												return;
											}
											@Pc(10403) Class289 local10403;
											if (arg0 == 4108) {
												local4883 = aStringArray33[--anInt7744];
												anInt7746 -= 2;
												local21 = anIntArray553[anInt7746];
												local27 = anIntArray553[anInt7746 + 1];
												local10403 = Static154.method2200(Static335.aClass254_99, local27);
												anIntArray553[anInt7746++] = local10403.method6942(local4883, local21, Static245.aClass43Array9);
												return;
											}
											if (arg0 == 4109) {
												local4883 = aStringArray33[--anInt7744];
												anInt7746 -= 2;
												local21 = anIntArray553[anInt7746];
												local27 = anIntArray553[anInt7746 + 1];
												local10403 = Static154.method2200(Static335.aClass254_99, local27);
												anIntArray553[anInt7746++] = local10403.method6939(local21, local4883, Static245.aClass43Array9);
												return;
											}
											if (arg0 == 4110) {
												anInt7744 -= 2;
												local4883 = aStringArray33[anInt7744];
												local1394 = aStringArray33[anInt7744 + 1];
												if (anIntArray553[--anInt7746] == 1) {
													aStringArray33[anInt7744++] = local4883;
													return;
												}
												aStringArray33[anInt7744++] = local1394;
												return;
											}
											if (arg0 == 4111) {
												local4883 = aStringArray33[--anInt7744];
												aStringArray33[anInt7744++] = Static618.method8398(local4883);
												return;
											}
											if (arg0 == 4112) {
												local4883 = aStringArray33[--anInt7744];
												local21 = anIntArray553[--anInt7746];
												if (local21 == -1) {
													throw new RuntimeException("null char");
												}
												aStringArray33[anInt7744++] = local4883 + (char) local21;
												return;
											}
											if (arg0 == 4113) {
												local15 = anIntArray553[--anInt7746];
												anIntArray553[anInt7746++] = method6920((char) local15);
												return;
											}
											if (arg0 == 4114) {
												local15 = anIntArray553[--anInt7746];
												anIntArray553[anInt7746++] = Static543.method7587((char) local15) ? 1 : 0;
												return;
											}
											if (arg0 == 4115) {
												local15 = anIntArray553[--anInt7746];
												anIntArray553[anInt7746++] = Static506.method7170((char) local15) ? 1 : 0;
												return;
											}
											if (arg0 == 4116) {
												local15 = anIntArray553[--anInt7746];
												anIntArray553[anInt7746++] = Static656.method9007((char) local15) ? 1 : 0;
												return;
											}
											if (arg0 == 4117) {
												local4883 = aStringArray33[--anInt7744];
												if (local4883 != null) {
													anIntArray553[anInt7746++] = local4883.length();
													return;
												}
												anIntArray553[anInt7746++] = 0;
												return;
											}
											if (arg0 == 4118) {
												local4883 = aStringArray33[--anInt7744];
												anInt7746 -= 2;
												local21 = anIntArray553[anInt7746];
												local27 = anIntArray553[anInt7746 + 1];
												aStringArray33[anInt7744++] = local4883.substring(local21, local27);
												return;
											}
											if (arg0 == 4119) {
												local4883 = aStringArray33[--anInt7744];
												@Pc(10769) StringBuffer local10769 = new StringBuffer(local4883.length());
												@Pc(10771) boolean local10771 = false;
												for (local506 = 0; local506 < local4883.length(); local506++) {
													@Pc(10778) char local10778 = local4883.charAt(local506);
													if (local10778 == '<') {
														local10771 = true;
													} else if (local10778 == '>') {
														local10771 = false;
													} else if (!local10771) {
														local10769.append(local10778);
													}
												}
												aStringArray33[anInt7744++] = local10769.toString();
												return;
											}
											if (arg0 == 4120) {
												local4883 = aStringArray33[--anInt7744];
												anInt7746 -= 2;
												local21 = anIntArray553[anInt7746];
												local27 = anIntArray553[anInt7746 + 1];
												anIntArray553[anInt7746++] = local4883.indexOf(local21, local27);
												return;
											}
											if (arg0 == 4121) {
												anInt7744 -= 2;
												local4883 = aStringArray33[anInt7744];
												local1394 = aStringArray33[anInt7744 + 1];
												local27 = anIntArray553[--anInt7746];
												anIntArray553[anInt7746++] = local4883.indexOf(local1394, local27);
												return;
											}
											if (arg0 == 4122) {
												local15 = anIntArray553[--anInt7746];
												anIntArray553[anInt7746++] = Character.toLowerCase((char) local15);
												return;
											}
											if (arg0 == 4123) {
												local15 = anIntArray553[--anInt7746];
												anIntArray553[anInt7746++] = Character.toUpperCase((char) local15);
												return;
											}
											if (arg0 == 4124) {
												local575 = anIntArray553[--anInt7746] != 0;
												local21 = anIntArray553[--anInt7746];
												aStringArray33[anInt7744++] = Static482.method6903(0, local575, (long) local21, Static414.anInt9485);
												return;
											}
											if (arg0 == 4125) {
												local4883 = aStringArray33[--anInt7744];
												local21 = anIntArray553[--anInt7746];
												@Pc(10998) Class289 local10998 = Static154.method2200(Static335.aClass254_99, local21);
												anIntArray553[anInt7746++] = local10998.method6930(local4883, Static245.aClass43Array9);
												return;
											}
											if (arg0 == 4126) {
												aStringArray33[anInt7744++] = Static689.method9305(true, (long) anIntArray553[--anInt7746] * 60000L, Static414.anInt9485, 8110) + " UTC";
												return;
											}
											if (arg0 == 4127) {
												local9626 = aLongArray16[--anInt7751];
												aStringArray33[anInt7744++] = local9626 == -1L ? "" : Long.toString(local9626, 36).toUpperCase();
												return;
											}
										} else if (arg0 < 4300) {
											if (arg0 == 4200) {
												local15 = anIntArray553[--anInt7746];
												aStringArray33[anInt7744++] = Static543.aClass37_2.method605(local15).aString52;
												return;
											}
											@Pc(11127) Class203 local11127;
											if (arg0 == 4201) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												local11127 = Static543.aClass37_2.method605(local15);
												if (local21 >= 1 && local21 <= 5 && local11127.aStringArray21[local21 - 1] != null) {
													aStringArray33[anInt7744++] = local11127.aStringArray21[local21 - 1];
													return;
												}
												aStringArray33[anInt7744++] = "";
												return;
											}
											if (arg0 == 4202) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												local11127 = Static543.aClass37_2.method605(local15);
												if (local21 >= 1 && local21 <= 5 && local11127.aStringArray20[local21 - 1] != null) {
													aStringArray33[anInt7744++] = local11127.aStringArray20[local21 - 1];
													return;
												}
												aStringArray33[anInt7744++] = "";
												return;
											}
											if (arg0 == 4203) {
												local15 = anIntArray553[--anInt7746];
												anIntArray553[anInt7746++] = Static543.aClass37_2.method605(local15).anInt4890;
												return;
											}
											if (arg0 == 4204) {
												local15 = anIntArray553[--anInt7746];
												anIntArray553[anInt7746++] = Static543.aClass37_2.method605(local15).anInt4835 == 1 ? 1 : 0;
												return;
											}
											@Pc(11301) Class203 local11301;
											if (arg0 == 4205) {
												local15 = anIntArray553[--anInt7746];
												local11301 = Static543.aClass37_2.method605(local15);
												if (local11301.anInt4849 == -1 && local11301.anInt4851 >= 0) {
													anIntArray553[anInt7746++] = local11301.anInt4851;
													return;
												}
												anIntArray553[anInt7746++] = local15;
												return;
											}
											if (arg0 == 4206) {
												local15 = anIntArray553[--anInt7746];
												local11301 = Static543.aClass37_2.method605(local15);
												if (local11301.anInt4849 >= 0 && local11301.anInt4851 >= 0) {
													anIntArray553[anInt7746++] = local11301.anInt4851;
													return;
												}
												anIntArray553[anInt7746++] = local15;
												return;
											}
											if (arg0 == 4207) {
												local15 = anIntArray553[--anInt7746];
												anIntArray553[anInt7746++] = Static543.aClass37_2.method605(local15).aBoolean418 ? 1 : 0;
												return;
											}
											if (arg0 == 4208) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												local3848 = Static97.aClass328_2.method7810(local21);
												if (local3848.method372()) {
													aStringArray33[anInt7744++] = Static543.aClass37_2.method605(local15).method4421(local3848.aString1, local21);
													return;
												}
												anIntArray553[anInt7746++] = Static543.aClass37_2.method605(local15).method4411(local21, local3848.anInt376);
												return;
											}
											if (arg0 == 4209) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1] - 1;
												local11127 = Static543.aClass37_2.method605(local15);
												if (local11127.anInt4873 == local21) {
													anIntArray553[anInt7746++] = local11127.anInt4881;
													return;
												}
												if (local11127.anInt4878 == local21) {
													anIntArray553[anInt7746++] = local11127.anInt4897;
													return;
												}
												anIntArray553[anInt7746++] = -1;
												return;
											}
											if (arg0 == 4210) {
												local4883 = aStringArray33[--anInt7744];
												local21 = anIntArray553[--anInt7746];
												Static564.method7846(local4883, local21 == 1);
												anIntArray553[anInt7746++] = Static354.anInt5659;
												return;
											}
											if (arg0 == 4211) {
												if (Static727.aShortArray149 != null && Static465.anInt7549 < Static354.anInt5659) {
													anIntArray553[anInt7746++] = Static727.aShortArray149[Static465.anInt7549++] & 0xFFFF;
													return;
												}
												anIntArray553[anInt7746++] = -1;
												return;
											}
											if (arg0 == 4212) {
												Static465.anInt7549 = 0;
												return;
											}
											if (arg0 == 4213) {
												local15 = anIntArray553[--anInt7746];
												anIntArray553[anInt7746++] = Static543.aClass37_2.method605(local15).anInt4896;
												return;
											}
											if (arg0 == 4214) {
												local4883 = aStringArray33[--anInt7744];
												anInt7746 -= 3;
												local21 = anIntArray553[anInt7746];
												local27 = anIntArray553[anInt7746 + 1];
												local506 = anIntArray553[anInt7746 + 2];
												Static11.method206(local27, local4883, local506, local21 == 1);
												anIntArray553[anInt7746++] = Static354.anInt5659;
												return;
											}
											if (arg0 == 4215) {
												anInt7744 -= 2;
												anInt7746 -= 2;
												local4883 = aStringArray33[anInt7744];
												local21 = anIntArray553[anInt7746];
												local27 = anIntArray553[anInt7746 + 1];
												local7266 = aStringArray33[anInt7744 + 1];
												Static420.method6142(local7266, local4883, local27, local21 == 1);
												anIntArray553[anInt7746++] = Static354.anInt5659;
												return;
											}
										} else if (arg0 < 4400) {
											if (arg0 == 4300) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												local3848 = Static97.aClass328_2.method7810(local21);
												if (local3848.method372()) {
													aStringArray33[anInt7744++] = Static192.aClass41_1.method754(local15, 2).method6274(local3848.aString1, local21);
													return;
												}
												anIntArray553[anInt7746++] = Static192.aClass41_1.method754(local15, 2).method6271(local3848.anInt376, local21, 0);
												return;
											}
										} else if (arg0 < 4500) {
											if (arg0 == 4400) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												local3848 = Static97.aClass328_2.method7810(local21);
												if (local3848.method372()) {
													aStringArray33[anInt7744++] = Static148.aClass153_3.method3342(local15).method1635(local3848.aString1, -8102, local21);
													return;
												}
												anIntArray553[anInt7746++] = Static148.aClass153_3.method3342(local15).method1639(local3848.anInt376, local21);
												return;
											}
										} else if (arg0 < 4600) {
											if (arg0 == 4500) {
												anInt7746 -= 2;
												local15 = anIntArray553[anInt7746];
												local21 = anIntArray553[anInt7746 + 1];
												local3848 = Static97.aClass328_2.method7810(local21);
												if (local3848.method372()) {
													aStringArray33[anInt7744++] = Static481.aClass280_1.method6725(local15).method7549(local3848.aString1, local21);
													return;
												}
												anIntArray553[anInt7746++] = Static481.aClass280_1.method6725(local15).method7548(local3848.anInt376, local21);
												return;
											}
										} else if (arg0 < 4700) {
											if (arg0 == 4600) {
												local15 = anIntArray553[--anInt7746];
												@Pc(11958) Class49 local11958 = Static378.aClass314_2.method7452(local15);
												if (local11958.anIntArray98 != null && local11958.anIntArray98.length > 0) {
													local27 = 0;
													local506 = local11958.anIntArray96[0];
													for (local2978 = 1; local2978 < local11958.anIntArray98.length; local2978++) {
														if (local11958.anIntArray96[local2978] > local506) {
															local27 = local2978;
															local506 = local11958.anIntArray96[local2978];
														}
													}
													anIntArray553[anInt7746++] = local11958.anIntArray98[local27];
													return;
												}
												anIntArray553[anInt7746++] = local11958.anInt1088;
												return;
											}
										} else if (arg0 < 4800) {
											if (arg0 == 4700) {
												anIntArray553[anInt7746++] = Static284.aBoolean385 ? 1 : 0;
												return;
											}
											if (arg0 == 4701) {
												local4883 = aStringArray33[--anInt7744];
												if (Static357.anInt5722 == 7 && !Static353.method9774()) {
													if (local4883.length() > 20) {
														Static465.aByte107 = -4;
														return;
													}
													Static465.aByte107 = -1;
													local4977 = Static592.method8154(Static505.aClass349_117, Static487.aClass221_1.aClass48_1);
													local4977.aClass2_Sub20_Sub2_1.method8584(0);
													local27 = local4977.aClass2_Sub20_Sub2_1.anInt9723;
													local4977.aClass2_Sub20_Sub2_1.method8541(local4883);
													local4977.aClass2_Sub20_Sub2_1.method8547(local4977.aClass2_Sub20_Sub2_1.anInt9723 - local27);
													Static487.aClass221_1.method5173(local4977);
													return;
												}
												Static465.aByte107 = -5;
												return;
											}
											if (arg0 == 4702) {
												anIntArray553[anInt7746++] = Static465.aByte107;
												if (Static465.aByte107 != -1) {
													Static465.aByte107 = -6;
												}
												return;
											}
										}
									}
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local220 = Static417.method6111(anIntArray553[--anInt7746]);
					} else {
						local220 = arg1 ? aClass273_14 : aClass273_15;
					}
					Static371.method5299(local220);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt7746 -= 2;
						local21 = anIntArray553[anInt7746];
						local27 = anIntArray553[anInt7746 + 1];
						if (local220.anInt7410 == -1) {
							Static385.method5740(local220.anInt7350);
							Static539.method7547(local220.anInt7350);
							Static498.method7108(local220.anInt7350);
						}
						if (local21 == -1) {
							local220.anInt7354 = 1;
							local220.anInt7420 = -1;
							local220.anInt7415 = -1;
							return;
						}
						local220.anInt7415 = local21;
						local220.anInt7416 = local27;
						if (arg0 == 1208 || arg0 == 1209) {
							local220.aBoolean634 = true;
						} else {
							local220.aBoolean634 = false;
						}
						@Pc(2236) Class203 local2236 = Static543.aClass37_2.method605(local21);
						local220.anInt7335 = local2236.anInt4894;
						local220.anInt7390 = local2236.anInt4858;
						local220.anInt7407 = local2236.anInt4841;
						local220.anInt7414 = local2236.anInt4846;
						local220.anInt7374 = local2236.anInt4857;
						local220.anInt7360 = local2236.anInt4880;
						if (arg0 == 1205 || arg0 == 1209) {
							local220.anInt7405 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local220.anInt7405 = 1;
						} else {
							local220.anInt7405 = 2;
						}
						if (local220.anInt7422 > 0) {
							local220.anInt7360 = local220.anInt7360 * 32 / local220.anInt7422;
							return;
						}
						if (local220.anInt7404 > 0) {
							local220.anInt7360 = local220.anInt7360 * 32 / local220.anInt7404;
						}
						return;
					}
					if (arg0 == 1201) {
						local220.anInt7354 = 2;
						local220.anInt7420 = anIntArray553[--anInt7746];
						if (local220.anInt7410 == -1) {
							Static490.method7035(local220.anInt7350);
						}
						return;
					}
					if (arg0 == 1202) {
						local220.anInt7354 = 3;
						local220.anInt7420 = -1;
						if (local220.anInt7410 == -1) {
							Static490.method7035(local220.anInt7350);
						}
						return;
					}
					if (arg0 == 1203) {
						local220.anInt7354 = 6;
						local220.anInt7420 = anIntArray553[--anInt7746];
						if (local220.anInt7410 == -1) {
							Static490.method7035(local220.anInt7350);
						}
						return;
					}
					if (arg0 == 1204) {
						local220.anInt7354 = 5;
						local220.anInt7420 = anIntArray553[--anInt7746];
						if (local220.anInt7410 == -1) {
							Static490.method7035(local220.anInt7350);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt7746 -= 4;
						local220.anInt7424 = anIntArray553[anInt7746];
						local220.anInt7338 = anIntArray553[anInt7746 + 1];
						local220.anInt7351 = anIntArray553[anInt7746 + 2];
						local220.anInt7412 = anIntArray553[anInt7746 + 3];
						Static371.method5299(local220);
						return;
					}
					if (arg0 == 1207) {
						anInt7746 -= 2;
						local220.anInt7406 = anIntArray553[anInt7746];
						local220.anInt7409 = anIntArray553[anInt7746 + 1];
						Static371.method5299(local220);
						return;
					}
					if (arg0 == 1210) {
						anInt7746 -= 4;
						local220.anInt7420 = anIntArray553[anInt7746];
						local220.anInt7391 = anIntArray553[anInt7746 + 1];
						if (anIntArray553[anInt7746 + 2] == 1) {
							local220.anInt7354 = 9;
						} else {
							local220.anInt7354 = 8;
						}
						if (anIntArray553[anInt7746 + 3] == 1) {
							local220.aBoolean634 = true;
						} else {
							local220.aBoolean634 = false;
						}
						if (local220.anInt7410 == -1) {
							Static490.method7035(local220.anInt7350);
						}
						return;
					}
					if (arg0 == 1211) {
						local220.anInt7354 = 5;
						local220.anInt7420 = Class4_Sub2_Sub1_Sub2.lb;
						local220.anInt7391 = 0;
						if (local220.anInt7410 == -1) {
							Static490.method7035(local220.anInt7350);
						}
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)I")
	private static int method6925(@OriginalArg(0) int arg0) {
		@Pc(4) Class95 local4 = Static202.aClass31_1.method556(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c113");
		}
		@Pc(29) Integer local29 = aClass394_6.method9386(local4.anInt2250, local4.anInt2248, Static249.aClass150_6.anInt3649 << 16 | local4.anInt2252);
		return local29 == null ? 0 : local29;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(Lclient!oh;)V")
	private static void method6926(@OriginalArg(0) Class273 arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(69) Class273[] local69;
		if (arg0.anInt7410 == -1) {
			@Pc(106) int local106 = arg0.anInt7350 >>> 16;
			@Pc(110) Class273[] local110 = Static39.aClass273ArrayArray1[local106];
			if (local110 == null) {
				local69 = Static581.aClass273ArrayArray2[local106];
				@Pc(119) int local119 = local69.length;
				local110 = Static39.aClass273ArrayArray1[local106] = new Class273[local119];
				Static728.method269(local69, 0, local110, 0, local69.length);
			}
			@Pc(135) int local135;
			for (local135 = 0; local135 < local110.length && local110[local135] != arg0; local135++) {
			}
			if (local135 >= local110.length) {
				return;
			}
			Static728.method269(local110, 0, local110, 1, local135);
			local110[0] = arg0;
			return;
		}
		@Pc(12) Class273 local12 = Static417.method6111(arg0.anInt7392);
		if (local12 == null) {
			return;
		}
		if (local12.aClass273Array3 == local12.aClass273Array4) {
			local12.aClass273Array3 = new Class273[local12.aClass273Array4.length];
			local12.aClass273Array3[0] = arg0;
			Static728.method269(local12.aClass273Array4, 0, local12.aClass273Array3, 1, arg0.anInt7410);
			Static728.method269(local12.aClass273Array4, arg0.anInt7410 + 1, local12.aClass273Array3, arg0.anInt7410 + 1, local12.aClass273Array4.length - arg0.anInt7410 - 1);
			return;
		}
		@Pc(66) int local66 = 0;
		local69 = local12.aClass273Array3;
		while (local66 < local69.length && local69[local66] != arg0) {
			local66++;
		}
		if (local66 >= local69.length) {
			return;
		}
		Static728.method269(local69, 0, local69, 1, local66);
		local69[0] = arg0;
		return;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method6927(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static565.anInt8888 == 0 && (Static70.aBoolean137 && !Static337.aBoolean443 || Static329.aBoolean429)) {
			return;
		}
		@Pc(18) String local18 = arg0.toLowerCase();
		@Pc(20) byte local20 = 0;
		if (local18.startsWith(Static289.aClass191_46.method4067(0))) {
			local20 = 0;
			arg0 = arg0.substring(Static289.aClass191_46.method4067(0).length());
		} else if (local18.startsWith(Static289.aClass191_47.method4067(0))) {
			local20 = 1;
			arg0 = arg0.substring(Static289.aClass191_47.method4067(0).length());
		} else if (local18.startsWith(Static289.aClass191_48.method4067(0))) {
			local20 = 2;
			arg0 = arg0.substring(Static289.aClass191_48.method4067(0).length());
		} else if (local18.startsWith(Static289.aClass191_49.method4067(0))) {
			local20 = 3;
			arg0 = arg0.substring(Static289.aClass191_49.method4067(0).length());
		} else if (local18.startsWith(Static289.aClass191_50.method4067(0))) {
			local20 = 4;
			arg0 = arg0.substring(Static289.aClass191_50.method4067(0).length());
		} else if (local18.startsWith(Static289.aClass191_51.method4067(0))) {
			local20 = 5;
			arg0 = arg0.substring(Static289.aClass191_51.method4067(0).length());
		} else if (local18.startsWith(Static289.aClass191_52.method4067(0))) {
			local20 = 6;
			arg0 = arg0.substring(Static289.aClass191_52.method4067(0).length());
		} else if (local18.startsWith(Static289.aClass191_53.method4067(0))) {
			local20 = 7;
			arg0 = arg0.substring(Static289.aClass191_53.method4067(0).length());
		} else if (local18.startsWith(Static289.aClass191_54.method4067(0))) {
			local20 = 8;
			arg0 = arg0.substring(Static289.aClass191_54.method4067(0).length());
		} else if (local18.startsWith(Static289.aClass191_55.method4067(0))) {
			local20 = 9;
			arg0 = arg0.substring(Static289.aClass191_55.method4067(0).length());
		} else if (local18.startsWith(Static289.aClass191_56.method4067(0))) {
			local20 = 10;
			arg0 = arg0.substring(Static289.aClass191_56.method4067(0).length());
		} else if (local18.startsWith(Static289.aClass191_57.method4067(0))) {
			local20 = 11;
			arg0 = arg0.substring(Static289.aClass191_57.method4067(0).length());
		} else if (Static414.anInt9485 != 0) {
			if (local18.startsWith(Static289.aClass191_46.method4067(Static414.anInt9485))) {
				local20 = 0;
				arg0 = arg0.substring(Static289.aClass191_46.method4067(Static414.anInt9485).length());
			} else if (local18.startsWith(Static289.aClass191_47.method4067(Static414.anInt9485))) {
				local20 = 1;
				arg0 = arg0.substring(Static289.aClass191_47.method4067(Static414.anInt9485).length());
			} else if (local18.startsWith(Static289.aClass191_48.method4067(Static414.anInt9485))) {
				local20 = 2;
				arg0 = arg0.substring(Static289.aClass191_48.method4067(Static414.anInt9485).length());
			} else if (local18.startsWith(Static289.aClass191_49.method4067(Static414.anInt9485))) {
				local20 = 3;
				arg0 = arg0.substring(Static289.aClass191_49.method4067(Static414.anInt9485).length());
			} else if (local18.startsWith(Static289.aClass191_50.method4067(Static414.anInt9485))) {
				local20 = 4;
				arg0 = arg0.substring(Static289.aClass191_50.method4067(Static414.anInt9485).length());
			} else if (local18.startsWith(Static289.aClass191_51.method4067(Static414.anInt9485))) {
				local20 = 5;
				arg0 = arg0.substring(Static289.aClass191_51.method4067(Static414.anInt9485).length());
			} else if (local18.startsWith(Static289.aClass191_52.method4067(Static414.anInt9485))) {
				local20 = 6;
				arg0 = arg0.substring(Static289.aClass191_52.method4067(Static414.anInt9485).length());
			} else if (local18.startsWith(Static289.aClass191_53.method4067(Static414.anInt9485))) {
				local20 = 7;
				arg0 = arg0.substring(Static289.aClass191_53.method4067(Static414.anInt9485).length());
			} else if (local18.startsWith(Static289.aClass191_54.method4067(Static414.anInt9485))) {
				local20 = 8;
				arg0 = arg0.substring(Static289.aClass191_54.method4067(Static414.anInt9485).length());
			} else if (local18.startsWith(Static289.aClass191_55.method4067(Static414.anInt9485))) {
				local20 = 9;
				arg0 = arg0.substring(Static289.aClass191_55.method4067(Static414.anInt9485).length());
			} else if (local18.startsWith(Static289.aClass191_56.method4067(Static414.anInt9485))) {
				local20 = 10;
				arg0 = arg0.substring(Static289.aClass191_56.method4067(Static414.anInt9485).length());
			} else if (local18.startsWith(Static289.aClass191_57.method4067(Static414.anInt9485))) {
				local20 = 11;
				arg0 = arg0.substring(Static289.aClass191_57.method4067(Static414.anInt9485).length());
			}
		}
		local18 = arg0.toLowerCase();
		@Pc(460) byte local460 = 0;
		if (local18.startsWith(Static289.aClass191_58.method4067(0))) {
			local460 = 1;
			arg0 = arg0.substring(Static289.aClass191_58.method4067(0).length());
		} else if (local18.startsWith(Static289.aClass191_59.method4067(0))) {
			local460 = 2;
			arg0 = arg0.substring(Static289.aClass191_59.method4067(0).length());
		} else if (local18.startsWith(Static289.aClass191_60.method4067(0))) {
			local460 = 3;
			arg0 = arg0.substring(Static289.aClass191_60.method4067(0).length());
		} else if (local18.startsWith(Static289.aClass191_61.method4067(0))) {
			local460 = 4;
			arg0 = arg0.substring(Static289.aClass191_61.method4067(0).length());
		} else if (local18.startsWith(Static289.aClass191_62.method4067(0))) {
			local460 = 5;
			arg0 = arg0.substring(Static289.aClass191_62.method4067(0).length());
		} else if (Static414.anInt9485 != 0) {
			if (local18.startsWith(Static289.aClass191_58.method4067(Static414.anInt9485))) {
				local460 = 1;
				arg0 = arg0.substring(Static289.aClass191_58.method4067(Static414.anInt9485).length());
			} else if (local18.startsWith(Static289.aClass191_59.method4067(Static414.anInt9485))) {
				local460 = 2;
				arg0 = arg0.substring(Static289.aClass191_59.method4067(Static414.anInt9485).length());
			} else if (local18.startsWith(Static289.aClass191_60.method4067(Static414.anInt9485))) {
				local460 = 3;
				arg0 = arg0.substring(Static289.aClass191_60.method4067(Static414.anInt9485).length());
			} else if (local18.startsWith(Static289.aClass191_61.method4067(Static414.anInt9485))) {
				local460 = 4;
				arg0 = arg0.substring(Static289.aClass191_61.method4067(Static414.anInt9485).length());
			} else if (local18.startsWith(Static289.aClass191_62.method4067(Static414.anInt9485))) {
				local460 = 5;
				arg0 = arg0.substring(Static289.aClass191_62.method4067(Static414.anInt9485).length());
			}
		}
		@Pc(650) Class221 local650 = Static87.method1292();
		@Pc(656) Class2_Sub33 local656 = Static592.method8154(Static277.aClass349_68, local650.aClass48_1);
		local656.aClass2_Sub20_Sub2_1.method8584(0);
		@Pc(665) int local665 = local656.aClass2_Sub20_Sub2_1.anInt9723;
		local656.aClass2_Sub20_Sub2_1.method8584(local20);
		local656.aClass2_Sub20_Sub2_1.method8584(local460);
		Static52.method744(arg0, local656.aClass2_Sub20_Sub2_1);
		local656.aClass2_Sub20_Sub2_1.method8547(local656.aClass2_Sub20_Sub2_1.anInt9723 - local665);
		local650.method5173(local656);
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)I")
	private static int method6928(@OriginalArg(0) int arg0) {
		@Pc(4) Class95 local4 = Static202.aClass31_1.method556(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c112");
		}
		@Pc(24) Integer local24 = aClass394_6.method9387(Static249.aClass150_6.anInt3649 << 16 | arg0);
		if (local24 == null) {
			return local4.aChar5 == 'i' || local4.aChar5 == '1' ? 0 : -1;
		} else {
			return local24;
		}
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(IZ)V")
	public static void method6929() {
	}
}
