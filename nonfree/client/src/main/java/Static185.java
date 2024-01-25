import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray11;

	@OriginalMember(owner = "client!fm", name = "t", descriptor = "Lclient!av;")
	private static Class20 aClass20_7;

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "Lclient!np;")
	private static Class260 aClass260_1;

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "Lclient!wr;")
	private static Class3_Sub56 aClass3_Sub56_1;

	@OriginalMember(owner = "client!fm", name = "B", descriptor = "Lclient!mea;")
	private static Class237 aClass237_3;

	@OriginalMember(owner = "client!fm", name = "f", descriptor = "Lclient!av;")
	private static Class20 aClass20_8;

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "[I")
	private static int[] anIntArray170;

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "[J")
	private static long[] aLongArray6;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
	private static int anInt3262 = 0;

	@OriginalMember(owner = "client!fm", name = "r", descriptor = "[J")
	private static final long[] aLongArray5 = new long[1000];

	@OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
	private static int anInt3264 = 0;

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "Lclient!si;")
	public static final Class338 aClass338_15 = new Class338(4);

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "[I")
	private static final int[] anIntArray167 = new int[1000];

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray12 = new String[1000];

	@OriginalMember(owner = "client!fm", name = "F", descriptor = "I")
	private static int anInt3271 = 0;

	@OriginalMember(owner = "client!fm", name = "v", descriptor = "[[I")
	private static final int[][] anIntArrayArray17 = new int[5][5000];

	@OriginalMember(owner = "client!fm", name = "q", descriptor = "[I")
	private static final int[] anIntArray168 = new int[3];

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "[I")
	private static final int[] anIntArray169 = new int[5];

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
	private static int anInt3275 = 0;

	@OriginalMember(owner = "client!fm", name = "A", descriptor = "[Lclient!l;")
	private static final Class219[] aClass219Array1 = new Class219[50];

	@OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
	private static int anInt3277 = 0;

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "Z")
	public static boolean aBoolean268 = false;

	@OriginalMember(owner = "client!fm", name = "C", descriptor = "Ljava/lang/String;")
	public static String aString61 = null;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!am;)V")
	public static void method2811(@OriginalArg(0) Class3_Sub7 arg0) {
		method2818(arg0, 200000);
	}

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)V")
	public static void method2812(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static255.method3996(arg0)) {
			return;
		}
		@Pc(14) Class20[] local14 = Static403.aClass20ArrayArray2[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(21) Class20 local21 = local14[local16];
			if (local21.anObjectArray18 != null) {
				@Pc(28) Class3_Sub7 local28 = new Class3_Sub7();
				local28.aClass20_2 = local21;
				local28.anObjectArray1 = local21.anObjectArray18;
				method2818(local28, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)I")
	private static int method2813(@OriginalArg(0) int arg0) {
		@Pc(4) Class253 local4 = Static455.aClass227_1.method5139(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c113");
		}
		@Pc(29) Integer local29 = aClass237_3.method5851(local4.anInt7433, local4.anInt7435, Static667.aClass169_8.anInt4889 << 16 | local4.anInt7432);
		return local29 == null ? 0 : local29;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!qm;I)V")
	private static void method2814(@OriginalArg(0) Class3_Sub4_Sub18 arg0, @OriginalArg(1) int arg1) {
		anInt3264 = 0;
		anInt3275 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray485;
		@Pc(11) int[] local11 = arg0.anIntArray484;
		@Pc(13) byte local13 = -1;
		anInt3271 = 0;
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
				if (aBoolean268 && (aString61 == null || arg0.aString116 != null && arg0.aString116.indexOf(aString61) != -1)) {
					System.out.println(arg0.aString116 + ": " + local34);
				}
				if (local34 >= 150) {
					@Pc(1436) boolean local1436;
					if (local11[local5] == 1) {
						local1436 = true;
					} else {
						local1436 = false;
					}
					if (local34 >= 150 && local34 < 5000) {
						method2824(local34, local1436);
					} else if (local34 >= 5000 && local34 < 10000) {
						method2821(local34, local1436);
					} else {
						throw new IllegalStateException("Command: " + local34);
					}
				} else if (local34 == 0) {
					anIntArray167[anInt3264++] = local11[local5];
				} else {
					@Pc(96) int local96;
					if (local34 == 1) {
						local96 = local11[local5];
						anIntArray167[anInt3264++] = Static577.aClass362_1.anIntArray584[local96];
					} else if (local34 == 2) {
						local96 = local11[local5];
						Static577.aClass362_1.method8667(anIntArray167[--anInt3264], local96);
					} else if (local34 == 3) {
						aStringArray12[anInt3275++] = arg0.aStringArray35[local5];
					} else if (local34 == 6) {
						local5 += local11[local5];
					} else if (local34 == 7) {
						anInt3264 -= 2;
						if (anIntArray167[anInt3264] != anIntArray167[anInt3264 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 8) {
						anInt3264 -= 2;
						if (anIntArray167[anInt3264] == anIntArray167[anInt3264 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 9) {
						anInt3264 -= 2;
						if (anIntArray167[anInt3264] < anIntArray167[anInt3264 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 10) {
						anInt3264 -= 2;
						if (anIntArray167[anInt3264] > anIntArray167[anInt3264 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 21) {
						if (anInt3271 == 0) {
							return;
						}
						@Pc(270) Class219 local270 = aClass219Array1[--anInt3271];
						arg0 = local270.aClass3_Sub4_Sub18_1;
						local8 = arg0.anIntArray485;
						local11 = arg0.anIntArray484;
						local5 = local270.anInt5940;
						anIntArray170 = local270.anIntArray344;
						aStringArray11 = local270.aStringArray22;
						aLongArray6 = local270.aLongArray9;
					} else if (local34 == 25) {
						local96 = local11[local5];
						anIntArray167[anInt3264++] = Static577.aClass362_1.method8659(local96);
					} else if (local34 == 27) {
						local96 = local11[local5];
						Static577.aClass362_1.method8669(local96, anIntArray167[--anInt3264]);
					} else if (local34 == 31) {
						anInt3264 -= 2;
						if (anIntArray167[anInt3264] <= anIntArray167[anInt3264 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 32) {
						anInt3264 -= 2;
						if (anIntArray167[anInt3264] >= anIntArray167[anInt3264 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 33) {
						anIntArray167[anInt3264++] = anIntArray170[local11[local5]];
					} else if (local34 == 34) {
						anIntArray170[local11[local5]] = anIntArray167[--anInt3264];
					} else if (local34 == 35) {
						aStringArray12[anInt3275++] = aStringArray11[local11[local5]];
					} else if (local34 == 36) {
						aStringArray11[local11[local5]] = aStringArray12[--anInt3275];
					} else {
						@Pc(465) String local465;
						if (local34 == 37) {
							local96 = local11[local5];
							anInt3275 -= local96;
							local465 = Static581.method8024(local96, anInt3275, aStringArray12);
							aStringArray12[anInt3275++] = local465;
						} else if (local34 == 38) {
							anInt3264--;
						} else if (local34 == 39) {
							anInt3275--;
						} else if (local34 == 40) {
							local96 = local11[local5];
							@Pc(503) Class3_Sub4_Sub18 local503 = Static396.method5957(local96);
							if (local503 == null) {
								throw new RuntimeException();
							}
							@Pc(514) int[] local514 = new int[local503.anInt8945];
							@Pc(518) String[] local518 = new String[local503.anInt8943];
							@Pc(522) long[] local522 = new long[local503.anInt8946];
							for (@Pc(524) int local524 = 0; local524 < local503.anInt8944; local524++) {
								local514[local524] = anIntArray167[anInt3264 + local524 - local503.anInt8944];
							}
							for (@Pc(543) int local543 = 0; local543 < local503.anInt8948; local543++) {
								local518[local543] = aStringArray12[anInt3275 + local543 - local503.anInt8948];
							}
							for (@Pc(562) int local562 = 0; local562 < local503.anInt8950; local562++) {
								local522[local562] = aLongArray5[anInt3262 + local562 - local503.anInt8950];
							}
							anInt3264 -= local503.anInt8944;
							anInt3275 -= local503.anInt8948;
							anInt3262 -= local503.anInt8950;
							@Pc(598) Class219 local598 = new Class219();
							local598.aClass3_Sub4_Sub18_1 = arg0;
							local598.anInt5940 = local5;
							local598.anIntArray344 = anIntArray170;
							local598.aStringArray22 = aStringArray11;
							local598.aLongArray9 = aLongArray6;
							if (anInt3271 >= aClass219Array1.length) {
								throw new RuntimeException();
							}
							aClass219Array1[anInt3271++] = local598;
							arg0 = local503;
							local8 = local503.anIntArray485;
							local11 = local503.anIntArray484;
							local5 = -1;
							anIntArray170 = local514;
							aStringArray11 = local518;
							aLongArray6 = local522;
						} else if (local34 == 42) {
							anIntArray167[anInt3264++] = Static568.anIntArray608[local11[local5]];
						} else if (local34 == 43) {
							local96 = local11[local5];
							Static568.anIntArray608[local96] = anIntArray167[--anInt3264];
							Static426.method6281(local96);
							Static171.aBoolean259 |= Static214.aBooleanArray11[local96];
						} else if (local34 == 44) {
							local96 = local11[local5] >> 16;
							local706 = local11[local5] & 0xFFFF;
							@Pc(714) int local714 = anIntArray167[--anInt3264];
							if (local714 >= 0 && local714 <= 5000) {
								anIntArray169[local96] = local714;
								@Pc(732) byte local732 = -1;
								if (local706 == 105) {
									local732 = 0;
								}
								@Pc(739) int local739 = 0;
								while (true) {
									if (local739 >= local714) {
										continue label381;
									}
									anIntArrayArray17[local96][local739] = local732;
									local739++;
								}
							}
							throw new RuntimeException();
						} else if (local34 == 45) {
							local96 = local11[local5];
							local706 = anIntArray167[--anInt3264];
							if (local706 < 0 || local706 >= anIntArray169[local96]) {
								throw new RuntimeException();
							}
							anIntArray167[anInt3264++] = anIntArrayArray17[local96][local706];
						} else if (local34 == 46) {
							local96 = local11[local5];
							anInt3264 -= 2;
							local706 = anIntArray167[anInt3264];
							if (local706 < 0 || local706 >= anIntArray169[local96]) {
								throw new RuntimeException();
							}
							anIntArrayArray17[local96][local706] = anIntArray167[anInt3264 + 1];
						} else if (local34 == 47) {
							@Pc(843) String local843 = Static283.aStringArray16[local11[local5]];
							if (local843 == null) {
								local843 = "null";
							}
							aStringArray12[anInt3275++] = local843;
						} else if (local34 == 48) {
							local96 = local11[local5];
							Static283.aStringArray16[local96] = aStringArray12[--anInt3275];
							Static376.method5430(local96);
						} else if (local34 == 51) {
							@Pc(889) Class136 local889 = arg0.aClass136Array1[local11[local5]];
							@Pc(902) Class3_Sub42 local902 = (Class3_Sub42) local889.method3503((long) anIntArray167[--anInt3264]);
							if (local902 != null) {
								local5 += local902.anInt8429;
							}
						} else if (local34 == 54) {
							aLongArray5[anInt3262++] = arg0.aLongArray22[local5];
						} else if (local34 == 55) {
							anInt3262--;
						} else if (local34 == 66) {
							aLongArray5[anInt3262++] = aLongArray6[local11[local5]];
						} else if (local34 == 67) {
							aLongArray6[local11[local5]] = aLongArray5[--anInt3262];
						} else if (local34 == 68) {
							anInt3262 -= 2;
							if (aLongArray5[anInt3262] != aLongArray5[anInt3262 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 69) {
							anInt3262 -= 2;
							if (aLongArray5[anInt3262] == aLongArray5[anInt3262 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 70) {
							anInt3262 -= 2;
							if (aLongArray5[anInt3262] < aLongArray5[anInt3262 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 71) {
							anInt3262 -= 2;
							if (aLongArray5[anInt3262] > aLongArray5[anInt3262 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 72) {
							anInt3262 -= 2;
							if (aLongArray5[anInt3262] <= aLongArray5[anInt3262 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 73) {
							anInt3262 -= 2;
							if (aLongArray5[anInt3262] >= aLongArray5[anInt3262 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 86) {
							if (anIntArray167[--anInt3264] == 1) {
								local5 += local11[local5];
							}
						} else if (local34 == 87) {
							if (anIntArray167[--anInt3264] == 0) {
								local5 += local11[local5];
							}
						} else if (local34 == 106) {
							local96 = local11[local5];
							@Pc(1178) Integer local1178 = (Integer) Static398.anObjectArray37[local96];
							if (local1178 == null) {
								@Pc(1185) Class299 local1185 = Static101.aClass125_1.method2982(local96);
								if (local1185.aChar6 == 'i' || local1185.aChar6 == '1') {
									anIntArray167[anInt3264++] = 0;
								} else {
									anIntArray167[anInt3264++] = -1;
								}
							} else {
								anIntArray167[anInt3264++] = local1178;
							}
						} else if (local34 == 107) {
							local96 = local11[local5];
							@Pc(1236) Class299 local1236 = Static101.aClass125_1.method2982(local96);
							if (local1236.aChar6 != '\u0001') {
								anIntArray167[anInt3264++] = 0;
							}
							@Pc(1256) Integer local1256 = (Integer) Static398.anObjectArray37[local1236.anInt8659];
							if (local1256 == null) {
								anIntArray167[anInt3264++] = 0;
							} else {
								@Pc(1284) int local1284 = local1236.anInt8657 == 31 ? -1 : (0x1 << local1236.anInt8657 + 1) - 1;
								anIntArray167[anInt3264++] = (local1256 & local1284) >>> local1236.anInt8662;
							}
						} else if (local34 == 108) {
							local96 = local11[local5];
							@Pc(1311) Long local1311 = (Long) Static398.anObjectArray37[local96];
							if (local1311 == null) {
								aLongArray5[anInt3262++] = -1L;
							} else {
								aLongArray5[anInt3262++] = local1311;
							}
						} else if (local34 == 109) {
							local96 = local11[local5];
							local465 = (String) Static398.anObjectArray37[local96];
							if (local465 == null) {
								aStringArray12[anInt3275++] = "";
							} else {
								aStringArray12[anInt3275++] = local465;
							}
						} else if (local34 == 112) {
							anIntArray167[anInt3264++] = method2823(local11[local5]);
						} else if (local34 == 113) {
							anIntArray167[anInt3264++] = method2813(local11[local5]);
						} else if (local34 == 114) {
							aLongArray5[anInt3262++] = method2816(local11[local5]);
						} else if (local34 == 115) {
							aStringArray12[anInt3275++] = method2820(local11[local5]);
						}
					}
				}
			}
		} catch (@Pc(1479) Exception local1479) {
			@Pc(1484) StringBuffer local1484 = new StringBuffer(30);
			local1484.append("CS2: ").append(arg0.aLong382).append(" ");
			for (local706 = anInt3271 - 1; local706 >= 0; local706--) {
				local1484.append("v: ").append(aClass219Array1[local706].aClass3_Sub4_Sub18_1.aLong382).append(" ");
			}
			local1484.append("op: ").append(local13);
			Static64.method799(local1484.toString(), local1479);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!av;)V")
	private static void method2815(@OriginalArg(0) Class20 arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(69) Class20[] local69;
		if (arg0.anInt583 == -1) {
			@Pc(106) int local106 = arg0.anInt600 >>> 16;
			@Pc(110) Class20[] local110 = Static280.aClass20ArrayArray1[local106];
			if (local110 == null) {
				local69 = Static403.aClass20ArrayArray2[local106];
				@Pc(119) int local119 = local69.length;
				local110 = Static280.aClass20ArrayArray1[local106] = new Class20[local119];
				Static735.method9183(local69, 0, local110, 0, local69.length);
			}
			@Pc(135) int local135;
			for (local135 = 0; local135 < local110.length && local110[local135] != arg0; local135++) {
			}
			if (local135 >= local110.length) {
				return;
			}
			Static735.method9183(local110, 0, local110, 1, local135);
			local110[0] = arg0;
			return;
		}
		@Pc(12) Class20 local12 = Static118.method2045(arg0.anInt556);
		if (local12 == null) {
			return;
		}
		if (local12.aClass20Array2 == local12.aClass20Array1) {
			local12.aClass20Array2 = new Class20[local12.aClass20Array1.length];
			local12.aClass20Array2[0] = arg0;
			Static735.method9183(local12.aClass20Array1, 0, local12.aClass20Array2, 1, arg0.anInt583);
			Static735.method9183(local12.aClass20Array1, arg0.anInt583 + 1, local12.aClass20Array2, arg0.anInt583 + 1, local12.aClass20Array1.length - arg0.anInt583 - 1);
			return;
		}
		@Pc(66) int local66 = 0;
		local69 = local12.aClass20Array2;
		while (local66 < local69.length && local69[local66] != arg0) {
			local66++;
		}
		if (local66 >= local69.length) {
			return;
		}
		Static735.method9183(local69, 0, local69, 1, local66);
		local69[0] = arg0;
		return;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)J")
	private static long method2816(@OriginalArg(0) int arg0) {
		@Pc(9) Long local9 = aClass237_3.method5858(Static667.aClass169_8.anInt4889 << 16 | arg0);
		return local9 == null ? -1L : local9;
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(IZ)V")
	public static void method2817() {
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!am;I)V")
	private static void method2818(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class3_Sub4_Sub18 local12 = Static396.method5957(local8);
		if (local12 == null) {
			return;
		}
		anIntArray170 = new int[local12.anInt8945];
		@Pc(22) int local22 = 0;
		aStringArray11 = new String[local12.anInt8943];
		@Pc(28) int local28 = 0;
		aLongArray6 = new long[local12.anInt8946];
		@Pc(34) int local34 = 0;
		for (@Pc(36) int local36 = 1; local36 < local2.length; local36++) {
			if (local2[local36] instanceof Integer) {
				@Pc(48) int local48 = (Integer) local2[local36];
				if (local48 == -2147483647) {
					local48 = arg0.anInt376;
				}
				if (local48 == -2147483646) {
					local48 = arg0.anInt375;
				}
				if (local48 == -2147483645) {
					local48 = arg0.aClass20_2 == null ? -1 : arg0.aClass20_2.anInt600;
				}
				if (local48 == -2147483644) {
					local48 = arg0.anInt377;
				}
				if (local48 == -2147483643) {
					local48 = arg0.aClass20_2 == null ? -1 : arg0.aClass20_2.anInt583;
				}
				if (local48 == -2147483642) {
					local48 = arg0.aClass20_1 == null ? -1 : arg0.aClass20_1.anInt600;
				}
				if (local48 == -2147483641) {
					local48 = arg0.aClass20_1 == null ? -1 : arg0.aClass20_1.anInt583;
				}
				if (local48 == -2147483640) {
					local48 = arg0.anInt370;
				}
				if (local48 == -2147483639) {
					local48 = arg0.anInt372;
				}
				anIntArray170[local22++] = local48;
			} else if (local2[local36] instanceof String) {
				@Pc(154) String local154 = (String) local2[local36];
				if (local154.equals("event_opbase")) {
					local154 = arg0.aString5;
				}
				aStringArray11[local28++] = local154;
			} else if (local2[local36] instanceof Long) {
				@Pc(180) long local180 = (Long) local2[local36];
				aLongArray6[local34++] = local180;
			}
		}
		anInt3277 = arg0.anInt371;
		method2814(local12, arg1);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method2819(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub4_Sub18 local5 = Static153.method2450(Static229.aClass258_7, arg0, -1);
		if (local5 == null) {
			return;
		}
		anIntArray170 = new int[local5.anInt8945];
		aStringArray11 = new String[local5.anInt8943];
		aStringArray11[0] = arg1;
		anIntArray170[0] = arg2;
		method2814(local5, 200000);
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)Ljava/lang/String;")
	private static String method2820(@OriginalArg(0) int arg0) {
		@Pc(9) String local9 = aClass237_3.method5856(Static667.aClass169_8.anInt4889 << 16 | arg0);
		return local9 == null ? "" : local9;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZ)V")
	private static void method2821(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
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
				anIntArray167[anInt3264++] = Static424.anInt7467;
				return;
			}
			@Pc(57) Class400 local57;
			@Pc(63) Class3_Sub48 local63;
			if (arg0 == 5001) {
				anInt3264 -= 3;
				Static424.anInt7467 = anIntArray167[anInt3264];
				Static663.aClass291_4 = Static145.method2396(anIntArray167[anInt3264 + 1]);
				if (Static663.aClass291_4 == null) {
					Static663.aClass291_4 = Static608.aClass291_3;
				}
				Static130.anInt2440 = anIntArray167[anInt3264 + 2];
				local57 = Static81.method1057();
				local63 = Static89.method1200(Static420.aClass286_72, local57.aClass399_2);
				local63.aClass3_Sub28_Sub2_1.method5329(Static424.anInt7467);
				local63.aClass3_Sub28_Sub2_1.method5329(Static663.aClass291_4.anInt8509);
				local63.aClass3_Sub28_Sub2_1.method5329(Static130.anInt2440);
				local57.method9223(local63);
				return;
			}
			if (arg0 == 5002) {
				anInt3275 -= 2;
				local95 = aStringArray12[anInt3275];
				local101 = aStringArray12[anInt3275 + 1];
				anInt3264 -= 2;
				local109 = anIntArray167[anInt3264];
				local115 = anIntArray167[anInt3264 + 1];
				if (local101 == null) {
					local101 = "";
				}
				if (local101.length() > 80) {
					local101 = local101.substring(0, 80);
				}
				@Pc(135) Class400 local135 = Static81.method1057();
				@Pc(141) Class3_Sub48 local141 = Static89.method1200(Static170.aClass286_30, local135.aClass399_2);
				local141.aClass3_Sub28_Sub2_1.method5329(Static605.method8305(local95) + Static605.method8305(local101) + 2);
				local141.aClass3_Sub28_Sub2_1.method5283(local95);
				local141.aClass3_Sub28_Sub2_1.method5329(local109 - 1);
				local141.aClass3_Sub28_Sub2_1.method5329(local115);
				local141.aClass3_Sub28_Sub2_1.method5283(local101);
				local135.method9223(local141);
				return;
			}
			@Pc(196) Class83 local196;
			if (arg0 == 5003) {
				local192 = anIntArray167[--anInt3264];
				local196 = Static513.method8715(local192);
				local198 = "";
				if (local196 != null && local196.aString42 != null) {
					local198 = local196.aString42;
				}
				aStringArray12[anInt3275++] = local198;
				return;
			}
			if (arg0 == 5004) {
				local192 = anIntArray167[--anInt3264];
				local196 = Static513.method8715(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt2432;
				}
				anIntArray167[anInt3264++] = local109;
				return;
			}
			if (arg0 == 5005) {
				if (Static663.aClass291_4 == null) {
					anIntArray167[anInt3264++] = -1;
					return;
				}
				anIntArray167[anInt3264++] = Static663.aClass291_4.anInt8509;
				return;
			}
			@Pc(295) Class3_Sub48 local295;
			@Pc(289) Class400 local289;
			if (arg0 == 5006) {
				local192 = anIntArray167[--anInt3264];
				local289 = Static81.method1057();
				local295 = Static89.method1200(Static597.aClass286_104, local289.aClass399_2);
				local295.aClass3_Sub28_Sub2_1.method5329(local192);
				local289.method9223(local295);
				return;
			}
			if (arg0 == 5008) {
				local95 = aStringArray12[--anInt3275];
				method2826(local95, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt3275 -= 2;
				local95 = aStringArray12[anInt3275];
				local101 = aStringArray12[anInt3275 + 1];
				if (Static651.anInt10450 != 0 || (!Static125.aBoolean199 || Static697.aBoolean790) && !Static553.aBoolean677) {
					@Pc(360) Class400 local360 = Static81.method1057();
					@Pc(366) Class3_Sub48 local366 = Static89.method1200(Static44.aClass286_11, local360.aClass399_2);
					local366.aClass3_Sub28_Sub2_1.method5329(0);
					local375 = local366.aClass3_Sub28_Sub2_1.anInt6241;
					local366.aClass3_Sub28_Sub2_1.method5283(local95);
					Static32.method471(local366.aClass3_Sub28_Sub2_1, local101);
					local366.aClass3_Sub28_Sub2_1.method5291(local366.aClass3_Sub28_Sub2_1.anInt6241 - local375);
					local360.method9223(local366);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local192 = anIntArray167[--anInt3264];
				local196 = Static513.method8715(local192);
				local198 = "";
				if (local196 != null && local196.aString43 != null) {
					local198 = local196.aString43;
				}
				aStringArray12[anInt3275++] = local198;
				return;
			}
			if (arg0 == 5011) {
				local192 = anIntArray167[--anInt3264];
				local196 = Static513.method8715(local192);
				local198 = "";
				if (local196 != null && local196.aString41 != null) {
					local198 = local196.aString41;
				}
				aStringArray12[anInt3275++] = local198;
				return;
			}
			if (arg0 == 5012) {
				local192 = anIntArray167[--anInt3264];
				local196 = Static513.method8715(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt2435;
				}
				anIntArray167[anInt3264++] = local109;
				return;
			}
			if (arg0 == 5015) {
				if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2 == null || Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aString108 == null) {
					local95 = "";
				} else {
					local95 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.method6622();
				}
				aStringArray12[anInt3275++] = local95;
				return;
			}
			if (arg0 == 5016) {
				anIntArray167[anInt3264++] = Static130.anInt2440;
				return;
			}
			if (arg0 == 5017) {
				anIntArray167[anInt3264++] = Static118.method2049();
				return;
			}
			if (arg0 == 5018) {
				local192 = anIntArray167[--anInt3264];
				local196 = Static513.method8715(local192);
				local109 = 0;
				if (local196 != null) {
					local109 = local196.anInt2439;
				}
				anIntArray167[anInt3264++] = local109;
				return;
			}
			if (arg0 == 5019) {
				local192 = anIntArray167[--anInt3264];
				local196 = Static513.method8715(local192);
				local198 = "";
				if (local196 != null && local196.aString40 != null) {
					local198 = local196.aString40;
				}
				aStringArray12[anInt3275++] = local198;
				return;
			}
			if (arg0 == 5020) {
				if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2 == null || Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aString108 == null) {
					local95 = "";
				} else {
					local95 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.method6618();
				}
				aStringArray12[anInt3275++] = local95;
				return;
			}
			if (arg0 == 5023) {
				local192 = anIntArray167[--anInt3264];
				local196 = Static513.method8715(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt2437;
				}
				anIntArray167[anInt3264++] = local109;
				return;
			}
			if (arg0 == 5024) {
				local192 = anIntArray167[--anInt3264];
				local196 = Static513.method8715(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt2433;
				}
				anIntArray167[anInt3264++] = local109;
				return;
			}
			if (arg0 == 5025) {
				local192 = anIntArray167[--anInt3264];
				local196 = Static513.method8715(local192);
				local198 = "";
				if (local196 != null && local196.aString39 != null) {
					local198 = local196.aString39;
				}
				aStringArray12[anInt3275++] = local198;
				return;
			}
			if (arg0 == 5050) {
				local192 = anIntArray167[--anInt3264];
				aStringArray12[anInt3275++] = Static361.aClass215_1.method5026(local192).aString128;
				return;
			}
			@Pc(793) Class3_Sub4_Sub21 local793;
			if (arg0 == 5051) {
				local192 = anIntArray167[--anInt3264];
				local793 = Static361.aClass215_1.method5026(local192);
				if (local793.anIntArray596 == null) {
					anIntArray167[anInt3264++] = 0;
					return;
				}
				anIntArray167[anInt3264++] = local793.anIntArray596.length;
				return;
			}
			if (arg0 == 5052) {
				anInt3264 -= 2;
				local192 = anIntArray167[anInt3264];
				local834 = anIntArray167[anInt3264 + 1];
				@Pc(839) Class3_Sub4_Sub21 local839 = Static361.aClass215_1.method5026(local192);
				local115 = local839.anIntArray596[local834];
				anIntArray167[anInt3264++] = local115;
				return;
			}
			if (arg0 == 5053) {
				local192 = anIntArray167[--anInt3264];
				local793 = Static361.aClass215_1.method5026(local192);
				if (local793.anIntArray595 == null) {
					anIntArray167[anInt3264++] = 0;
					return;
				}
				anIntArray167[anInt3264++] = local793.anIntArray595.length;
				return;
			}
			if (arg0 == 5054) {
				anInt3264 -= 2;
				local192 = anIntArray167[anInt3264];
				local834 = anIntArray167[anInt3264 + 1];
				anIntArray167[anInt3264++] = Static361.aClass215_1.method5026(local192).anIntArray595[local834];
				return;
			}
			if (arg0 == 5055) {
				local192 = anIntArray167[--anInt3264];
				aStringArray12[anInt3275++] = Static558.aClass233_2.method5417(local192).method2546();
				return;
			}
			if (arg0 == 5056) {
				local192 = anIntArray167[--anInt3264];
				@Pc(966) Class3_Sub4_Sub6 local966 = Static558.aClass233_2.method5417(local192);
				if (local966.anIntArray142 == null) {
					anIntArray167[anInt3264++] = 0;
					return;
				}
				anIntArray167[anInt3264++] = local966.anIntArray142.length;
				return;
			}
			if (arg0 == 5057) {
				anInt3264 -= 2;
				local192 = anIntArray167[anInt3264];
				local834 = anIntArray167[anInt3264 + 1];
				anIntArray167[anInt3264++] = Static558.aClass233_2.method5417(local192).anIntArray142[local834];
				return;
			}
			if (arg0 == 5058) {
				aClass260_1 = new Class260();
				aClass260_1.anInt7607 = anIntArray167[--anInt3264];
				aClass260_1.aClass3_Sub4_Sub6_1 = Static558.aClass233_2.method5417(aClass260_1.anInt7607);
				aClass260_1.anIntArray408 = new int[aClass260_1.aClass3_Sub4_Sub6_1.method2545()];
				return;
			}
			if (arg0 == 5059) {
				local57 = Static81.method1057();
				local63 = Static89.method1200(Static354.aClass286_62, local57.aClass399_2);
				local63.aClass3_Sub28_Sub2_1.method5329(0);
				local109 = local63.aClass3_Sub28_Sub2_1.anInt6241;
				local63.aClass3_Sub28_Sub2_1.method5329(0);
				local63.aClass3_Sub28_Sub2_1.method5282(aClass260_1.anInt7607);
				aClass260_1.aClass3_Sub4_Sub6_1.method2542(local63.aClass3_Sub28_Sub2_1, aClass260_1.anIntArray408);
				local63.aClass3_Sub28_Sub2_1.method5291(local63.aClass3_Sub28_Sub2_1.anInt6241 - local109);
				local57.method9223(local63);
				return;
			}
			if (arg0 == 5060) {
				local95 = aStringArray12[--anInt3275];
				local289 = Static81.method1057();
				local295 = Static89.method1200(Static193.aClass286_34, local289.aClass399_2);
				local295.aClass3_Sub28_Sub2_1.method5329(0);
				local115 = local295.aClass3_Sub28_Sub2_1.anInt6241;
				local295.aClass3_Sub28_Sub2_1.method5283(local95);
				local295.aClass3_Sub28_Sub2_1.method5282(aClass260_1.anInt7607);
				aClass260_1.aClass3_Sub4_Sub6_1.method2542(local295.aClass3_Sub28_Sub2_1, aClass260_1.anIntArray408);
				local295.aClass3_Sub28_Sub2_1.method5291(local295.aClass3_Sub28_Sub2_1.anInt6241 - local115);
				local289.method9223(local295);
				return;
			}
			if (arg0 == 5061) {
				local57 = Static81.method1057();
				local63 = Static89.method1200(Static354.aClass286_62, local57.aClass399_2);
				local63.aClass3_Sub28_Sub2_1.method5329(0);
				local109 = local63.aClass3_Sub28_Sub2_1.anInt6241;
				local63.aClass3_Sub28_Sub2_1.method5329(1);
				local63.aClass3_Sub28_Sub2_1.method5282(aClass260_1.anInt7607);
				aClass260_1.aClass3_Sub4_Sub6_1.method2542(local63.aClass3_Sub28_Sub2_1, aClass260_1.anIntArray408);
				local63.aClass3_Sub28_Sub2_1.method5291(local63.aClass3_Sub28_Sub2_1.anInt6241 - local109);
				local57.method9223(local63);
				return;
			}
			if (arg0 == 5062) {
				anInt3264 -= 2;
				local192 = anIntArray167[anInt3264];
				local834 = anIntArray167[anInt3264 + 1];
				anIntArray167[anInt3264++] = Static361.aClass215_1.method5026(local192).aCharArray5[local834];
				return;
			}
			if (arg0 == 5063) {
				anInt3264 -= 2;
				local192 = anIntArray167[anInt3264];
				local834 = anIntArray167[anInt3264 + 1];
				anIntArray167[anInt3264++] = Static361.aClass215_1.method5026(local192).aCharArray4[local834];
				return;
			}
			if (arg0 == 5064) {
				anInt3264 -= 2;
				local192 = anIntArray167[anInt3264];
				local834 = anIntArray167[anInt3264 + 1];
				if (local834 == -1) {
					anIntArray167[anInt3264++] = -1;
					return;
				}
				anIntArray167[anInt3264++] = Static361.aClass215_1.method5026(local192).method8853((char) local834);
				return;
			}
			if (arg0 == 5065) {
				anInt3264 -= 2;
				local192 = anIntArray167[anInt3264];
				local834 = anIntArray167[anInt3264 + 1];
				if (local834 == -1) {
					anIntArray167[anInt3264++] = -1;
					return;
				}
				anIntArray167[anInt3264++] = Static361.aClass215_1.method5026(local192).method8851((char) local834);
				return;
			}
			if (arg0 == 5066) {
				local192 = anIntArray167[--anInt3264];
				anIntArray167[anInt3264++] = Static558.aClass233_2.method5417(local192).method2545();
				return;
			}
			if (arg0 == 5067) {
				anInt3264 -= 2;
				local192 = anIntArray167[anInt3264];
				local834 = anIntArray167[anInt3264 + 1];
				local109 = Static558.aClass233_2.method5417(local192).method2548(local834).anInt6030;
				anIntArray167[anInt3264++] = local109;
				return;
			}
			if (arg0 == 5068) {
				anInt3264 -= 2;
				local192 = anIntArray167[anInt3264];
				local834 = anIntArray167[anInt3264 + 1];
				aClass260_1.anIntArray408[local192] = local834;
				return;
			}
			if (arg0 == 5069) {
				anInt3264 -= 2;
				local192 = anIntArray167[anInt3264];
				local834 = anIntArray167[anInt3264 + 1];
				aClass260_1.anIntArray408[local192] = local834;
				return;
			}
			if (arg0 == 5070) {
				anInt3264 -= 3;
				local192 = anIntArray167[anInt3264];
				local834 = anIntArray167[anInt3264 + 1];
				local109 = anIntArray167[anInt3264 + 2];
				@Pc(1526) Class3_Sub4_Sub6 local1526 = Static558.aClass233_2.method5417(local192);
				if (local1526.method2548(local834).anInt6030 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray167[anInt3264++] = local1526.method2544(local834, local109);
				return;
			}
			if (arg0 == 5071) {
				local95 = aStringArray12[--anInt3275];
				local1578 = anIntArray167[--anInt3264] == 1;
				Static660.method8822(local95, local1578);
				anIntArray167[anInt3264++] = Static453.anInt8000;
				return;
			}
			if (arg0 == 5072) {
				if (Static121.aShortArray35 != null && Static367.anInt6201 < Static453.anInt8000) {
					anIntArray167[anInt3264++] = Static121.aShortArray35[Static367.anInt6201++] & 0xFFFF;
					return;
				}
				anIntArray167[anInt3264++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static367.anInt6201 = 0;
				return;
			}
			if (arg0 == 5074) {
				local57 = Static81.method1057();
				local63 = Static89.method1200(Static354.aClass286_62, local57.aClass399_2);
				local63.aClass3_Sub28_Sub2_1.method5329(0);
				local109 = local63.aClass3_Sub28_Sub2_1.anInt6241;
				local63.aClass3_Sub28_Sub2_1.method5329(2);
				local63.aClass3_Sub28_Sub2_1.method5282(aClass260_1.anInt7607);
				aClass260_1.aClass3_Sub4_Sub6_1.method2542(local63.aClass3_Sub28_Sub2_1, aClass260_1.anIntArray408);
				local63.aClass3_Sub28_Sub2_1.method5291(local63.aClass3_Sub28_Sub2_1.anInt6241 - local109);
				local57.method9223(local63);
				return;
			}
			if (arg0 == 5075) {
				local57 = Static81.method1057();
				local63 = Static89.method1200(Static354.aClass286_62, local57.aClass399_2);
				local63.aClass3_Sub28_Sub2_1.method5329(0);
				local109 = local63.aClass3_Sub28_Sub2_1.anInt6241;
				local63.aClass3_Sub28_Sub2_1.method5329(3);
				local63.aClass3_Sub28_Sub2_1.method5282(aClass260_1.anInt7607);
				aClass260_1.aClass3_Sub4_Sub6_1.method2542(local63.aClass3_Sub28_Sub2_1, aClass260_1.anIntArray408);
				local63.aClass3_Sub28_Sub2_1.method5291(local63.aClass3_Sub28_Sub2_1.anInt6241 - local109);
				local57.method9223(local63);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static419.aClass133_1.method3450(86)) {
					anIntArray167[anInt3264++] = 1;
					return;
				}
				anIntArray167[anInt3264++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static419.aClass133_1.method3450(82)) {
					anIntArray167[anInt3264++] = 1;
					return;
				}
				anIntArray167[anInt3264++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static419.aClass133_1.method3450(81)) {
					anIntArray167[anInt3264++] = 1;
					return;
				}
				anIntArray167[anInt3264++] = 0;
				return;
			}
		} else {
			@Pc(2331) boolean local2331;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static525.method7462(anIntArray167[--anInt3264]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray167[anInt3264++] = Static569.method7899();
					return;
				}
				if (arg0 == 5205) {
					Static261.method4068(anIntArray167[--anInt3264], -1, false, -1);
					return;
				}
				@Pc(1908) Class3_Sub4_Sub19 local1908;
				if (arg0 == 5206) {
					local192 = anIntArray167[--anInt3264];
					local1908 = Static654.method6893(local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					if (local1908 == null) {
						anIntArray167[anInt3264++] = -1;
						return;
					}
					anIntArray167[anInt3264++] = local1908.anInt9098;
					return;
				}
				@Pc(1942) Class3_Sub4_Sub19 local1942;
				if (arg0 == 5207) {
					local1942 = Static654.method6889(anIntArray167[--anInt3264]);
					if (local1942 != null && local1942.aString119 != null) {
						aStringArray12[anInt3275++] = local1942.aString119;
						return;
					}
					aStringArray12[anInt3275++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray167[anInt3264++] = Static104.anInt1668;
					anIntArray167[anInt3264++] = Static716.anInt11194;
					return;
				}
				if (arg0 == 5209) {
					anIntArray167[anInt3264++] = Static481.anInt8380 + Static654.anInt8153;
					anIntArray167[anInt3264++] = Static442.anInt10084 + Static654.anInt8150;
					return;
				}
				if (arg0 == 5210) {
					local192 = anIntArray167[--anInt3264];
					local1908 = Static654.method6889(local192);
					if (local1908 == null) {
						anIntArray167[anInt3264++] = 0;
						anIntArray167[anInt3264++] = 0;
						return;
					}
					anIntArray167[anInt3264++] = local1908.anInt9099 >> 14 & 0x3FFF;
					anIntArray167[anInt3264++] = local1908.anInt9099 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local192 = anIntArray167[--anInt3264];
					local1908 = Static654.method6889(local192);
					if (local1908 == null) {
						anIntArray167[anInt3264++] = 0;
						anIntArray167[anInt3264++] = 0;
						return;
					}
					anIntArray167[anInt3264++] = local1908.anInt9087 - local1908.anInt9088;
					anIntArray167[anInt3264++] = local1908.anInt9095 - local1908.anInt9086;
					return;
				}
				@Pc(2139) Class3_Sub12 local2139;
				if (arg0 == 5212) {
					local2139 = Static516.method8184();
					if (local2139 == null) {
						anIntArray167[anInt3264++] = -1;
						anIntArray167[anInt3264++] = -1;
						return;
					}
					anIntArray167[anInt3264++] = local2139.anInt950;
					local834 = local2139.anInt951 << 28 | local2139.anInt952 + Static654.anInt8153 << 14 | local2139.anInt947 + Static654.anInt8150;
					anIntArray167[anInt3264++] = local834;
					return;
				}
				if (arg0 == 5213) {
					local2139 = Static109.method1955();
					if (local2139 == null) {
						anIntArray167[anInt3264++] = -1;
						anIntArray167[anInt3264++] = -1;
						return;
					}
					anIntArray167[anInt3264++] = local2139.anInt950;
					local834 = local2139.anInt951 << 28 | local2139.anInt952 + Static654.anInt8153 << 14 | local2139.anInt947 + Static654.anInt8150;
					anIntArray167[anInt3264++] = local834;
					return;
				}
				@Pc(2289) boolean local2289;
				if (arg0 == 5214) {
					local192 = anIntArray167[--anInt3264];
					local1908 = Static90.method1215();
					if (local1908 != null) {
						local2289 = local1908.method7611(local192 >> 28 & 0x3, local192 & 0x3FFF, anIntArray168, local192 >> 14 & 0x3FFF);
						if (local2289) {
							Static617.method8394(anIntArray168[1], anIntArray168[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt3264 -= 2;
					local192 = anIntArray167[anInt3264];
					local834 = anIntArray167[anInt3264 + 1];
					@Pc(2329) Class283 local2329 = Static654.method6885(local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					local2331 = false;
					for (@Pc(2336) Class3_Sub4_Sub19 local2336 = (Class3_Sub4_Sub19) local2329.method7031(); local2336 != null; local2336 = (Class3_Sub4_Sub19) local2329.method7035()) {
						if (local2336.anInt9098 == local834) {
							local2331 = true;
							break;
						}
					}
					if (local2331) {
						anIntArray167[anInt3264++] = 1;
						return;
					}
					anIntArray167[anInt3264++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local192 = anIntArray167[--anInt3264];
					local1908 = Static654.method6889(local192);
					if (local1908 == null) {
						anIntArray167[anInt3264++] = -1;
						return;
					}
					anIntArray167[anInt3264++] = local1908.anInt9091;
					return;
				}
				if (arg0 == 5220) {
					anIntArray167[anInt3264++] = Static193.anInt3390 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local192 = anIntArray167[--anInt3264];
					Static617.method8394(local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1942 = Static90.method1215();
					if (local1942 != null) {
						local1578 = local1942.method7609(Static442.anInt10084 + Static654.anInt8150, anIntArray168, Static481.anInt8380 + Static654.anInt8153);
						if (local1578) {
							anIntArray167[anInt3264++] = anIntArray168[1];
							anIntArray167[anInt3264++] = anIntArray168[2];
							return;
						}
						anIntArray167[anInt3264++] = -1;
						anIntArray167[anInt3264++] = -1;
						return;
					}
					anIntArray167[anInt3264++] = -1;
					anIntArray167[anInt3264++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt3264 -= 2;
					local192 = anIntArray167[anInt3264];
					local834 = anIntArray167[anInt3264 + 1];
					Static261.method4068(local192, local834 >> 14 & 0x3FFF, false, local834 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local192 = anIntArray167[--anInt3264];
					local1908 = Static90.method1215();
					if (local1908 != null) {
						local2289 = local1908.method7611(local192 >> 28 & 0x3, local192 & 0x3FFF, anIntArray168, local192 >> 14 & 0x3FFF);
						if (local2289) {
							anIntArray167[anInt3264++] = anIntArray168[1];
							anIntArray167[anInt3264++] = anIntArray168[2];
							return;
						}
						anIntArray167[anInt3264++] = -1;
						anIntArray167[anInt3264++] = -1;
						return;
					}
					anIntArray167[anInt3264++] = -1;
					anIntArray167[anInt3264++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local192 = anIntArray167[--anInt3264];
					local1908 = Static90.method1215();
					if (local1908 != null) {
						local2289 = local1908.method7609(local192 & 0x3FFF, anIntArray168, local192 >> 14 & 0x3FFF);
						if (local2289) {
							anIntArray167[anInt3264++] = anIntArray168[1];
							anIntArray167[anInt3264++] = anIntArray168[2];
							return;
						}
						anIntArray167[anInt3264++] = -1;
						anIntArray167[anInt3264++] = -1;
						return;
					}
					anIntArray167[anInt3264++] = -1;
					anIntArray167[anInt3264++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static172.method2686(anIntArray167[--anInt3264]);
					return;
				}
				if (arg0 == 5227) {
					anInt3264 -= 2;
					local192 = anIntArray167[anInt3264];
					local834 = anIntArray167[anInt3264 + 1];
					Static261.method4068(local192, local834 >> 14 & 0x3FFF, true, local834 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static32.aBoolean41 = anIntArray167[--anInt3264] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray167[anInt3264++] = Static32.aBoolean41 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local192 = anIntArray167[--anInt3264];
					Static217.method3479(local192);
					return;
				}
				@Pc(2867) Class3 local2867;
				if (arg0 == 5231) {
					anInt3264 -= 2;
					local192 = anIntArray167[anInt3264];
					local1578 = anIntArray167[anInt3264 + 1] == 1;
					if (Static284.aClass136_26 != null) {
						local2867 = Static284.aClass136_26.method3503((long) local192);
						if (local2867 != null && !local1578) {
							local2867.method9446();
							return;
						}
						if (local2867 == null && local1578) {
							local2867 = new Class3();
							Static284.aClass136_26.method3508((long) local192, local2867);
						}
					}
					return;
				}
				@Pc(2914) Class3 local2914;
				if (arg0 == 5232) {
					local192 = anIntArray167[--anInt3264];
					if (Static284.aClass136_26 != null) {
						local2914 = Static284.aClass136_26.method3503((long) local192);
						anIntArray167[anInt3264++] = local2914 == null ? 0 : 1;
						return;
					}
					anIntArray167[anInt3264++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt3264 -= 2;
					local192 = anIntArray167[anInt3264];
					local1578 = anIntArray167[anInt3264 + 1] == 1;
					if (Static548.aClass136_41 != null) {
						local2867 = Static548.aClass136_41.method3503((long) local192);
						if (local2867 != null && !local1578) {
							local2867.method9446();
							return;
						}
						if (local2867 == null && local1578) {
							local2867 = new Class3();
							Static548.aClass136_41.method3508((long) local192, local2867);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local192 = anIntArray167[--anInt3264];
					if (Static548.aClass136_41 != null) {
						local2914 = Static548.aClass136_41.method3503((long) local192);
						anIntArray167[anInt3264++] = local2914 == null ? 0 : 1;
						return;
					}
					anIntArray167[anInt3264++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray167[anInt3264++] = Static654.aClass3_Sub4_Sub19_2 == null ? -1 : Static654.aClass3_Sub4_Sub19_2.anInt9098;
					return;
				}
				if (arg0 == 5236) {
					anInt3264 -= 2;
					local192 = anIntArray167[anInt3264];
					local834 = anIntArray167[anInt3264 + 1];
					local109 = local834 >> 14 & 0x3FFF;
					local115 = local834 & 0x3FFF;
					local375 = Static470.method6952(local109, local192, local115);
					if (local375 < 0) {
						anIntArray167[anInt3264++] = -1;
						return;
					}
					anIntArray167[anInt3264++] = local375;
					return;
				}
				if (arg0 == 5237) {
					Static435.method6372((byte) 70);
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt3264 -= 2;
					local192 = anIntArray167[anInt3264];
					local834 = anIntArray167[anInt3264 + 1];
					Static354.method5127(local834, local192, false, 3);
					anIntArray167[anInt3264++] = Static691.aFrame2 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static691.aFrame2 != null) {
						Static354.method5127(-1, -1, false, Static713.aClass3_Sub55_31.aClass15_Sub23_1.method7900());
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(3186) Class95[] local3186 = Static694.method9100();
					anIntArray167[anInt3264++] = local3186.length;
					return;
				}
				if (arg0 == 5303) {
					local192 = anIntArray167[--anInt3264];
					@Pc(3210) Class95[] local3210 = Static694.method9100();
					anIntArray167[anInt3264++] = local3210[local192].anInt2811;
					anIntArray167[anInt3264++] = local3210[local192].anInt2808;
					return;
				}
				if (arg0 == 5305) {
					local192 = Static87.anInt1455;
					local834 = Static617.anInt9981;
					local109 = -1;
					@Pc(3245) Class95[] local3245 = Static694.method9100();
					for (local375 = 0; local375 < local3245.length; local375++) {
						@Pc(3252) Class95 local3252 = local3245[local375];
						if (local3252.anInt2811 == local192 && local3252.anInt2808 == local834) {
							local109 = local375;
							break;
						}
					}
					anIntArray167[anInt3264++] = local109;
					return;
				}
				if (arg0 == 5306) {
					anIntArray167[anInt3264++] = Static502.method7210();
					return;
				}
				if (arg0 == 5307) {
					local192 = anIntArray167[--anInt3264];
					if (local192 >= 1 && local192 <= 2) {
						Static354.method5127(-1, -1, false, local192);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub23_1.method7900();
					return;
				}
				if (arg0 == 5309) {
					local192 = anIntArray167[--anInt3264];
					if (local192 >= 1 && local192 <= 2) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub23_1, local192);
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub23_2, local192);
						Static328.method4885();
						return;
					}
					return;
				}
			} else {
				@Pc(3561) int local3561;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt3275 -= 2;
						local95 = aStringArray12[anInt3275];
						local101 = aStringArray12[anInt3275 + 1];
						local109 = anIntArray167[--anInt3264];
						@Pc(3411) Class400 local3411 = Static81.method1057();
						@Pc(3417) Class3_Sub48 local3417 = Static89.method1200(Static213.aClass286_35, local3411.aClass399_2);
						local3417.aClass3_Sub28_Sub2_1.method5329(Static605.method8305(local95) + Static605.method8305(local101) + 1);
						local3417.aClass3_Sub28_Sub2_1.method5283(local95);
						local3417.aClass3_Sub28_Sub2_1.method5283(local101);
						local3417.aClass3_Sub28_Sub2_1.method5329(local109);
						local3411.method9223(local3417);
						return;
					}
					if (arg0 == 5401) {
						anInt3264 -= 2;
						Static65.aShortArray23[anIntArray167[anInt3264]] = (short) Static6.method106(anIntArray167[anInt3264 + 1]);
						Static243.aClass406_2.method9396();
						Static243.aClass406_2.method9399();
						Static631.aClass85_2.method2215();
						Static693.method9085();
						return;
					}
					if (arg0 == 5405) {
						anInt3264 -= 2;
						local192 = anIntArray167[anInt3264];
						local834 = anIntArray167[anInt3264 + 1];
						if (local192 >= 0 && local192 < 2) {
							Static367.anIntArrayArrayArray5[local192] = new int[local834 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt3264 -= 7;
						local192 = anIntArray167[anInt3264];
						local834 = anIntArray167[anInt3264 + 1] << 1;
						local109 = anIntArray167[anInt3264 + 2];
						local115 = anIntArray167[anInt3264 + 3];
						local375 = anIntArray167[anInt3264 + 4];
						local3561 = anIntArray167[anInt3264 + 5];
						@Pc(3567) int local3567 = anIntArray167[anInt3264 + 6];
						if (local192 >= 0 && local192 < 2 && Static367.anIntArrayArrayArray5[local192] != null && local834 >= 0 && local834 < Static367.anIntArrayArrayArray5[local192].length) {
							Static367.anIntArrayArrayArray5[local192][local834] = new int[] { (local109 >> 14 & 0x3FFF) << 9, local115 << 2, (local109 & 0x3FFF) << 9, local3567 };
							Static367.anIntArrayArrayArray5[local192][local834 + 1] = new int[] { (local375 >> 14 & 0x3FFF) << 9, local3561 << 2, (local375 & 0x3FFF) << 9 };
						}
						return;
					}
					if (arg0 == 5407) {
						local192 = Static367.anIntArrayArrayArray5[anIntArray167[--anInt3264]].length >> 1;
						anIntArray167[anInt3264++] = local192;
						return;
					}
					if (arg0 == 5411) {
						if (Static691.aFrame2 != null) {
							Static354.method5127(-1, -1, false, Static713.aClass3_Sub55_31.aClass15_Sub23_1.method7900());
						}
						if (Static131.aFrame1 != null) {
							Static423.method6246();
							System.exit(0);
							return;
						}
						local95 = Static117.aString33 == null ? Static475.method6989() : Static117.aString33;
						Static400.method6006(false, local95, Static310.aClass47_4, Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() == 1);
						return;
					}
					if (arg0 == 5419) {
						local95 = "";
						if (Static183.aClass201_5 != null) {
							if (Static183.aClass201_5.anObject16 == null) {
								local95 = Static156.method2474(Static183.aClass201_5.anInt5731);
							} else {
								local95 = (String) Static183.aClass201_5.anObject16;
							}
						}
						aStringArray12[anInt3275++] = local95;
						return;
					}
					if (arg0 == 5420) {
						anIntArray167[anInt3264++] = Static310.aClass47_4.aBoolean97 ? 0 : 1;
						return;
					}
					if (arg0 == 5421) {
						if (Static691.aFrame2 != null) {
							Static354.method5127(-1, -1, false, Static713.aClass3_Sub55_31.aClass15_Sub23_1.method7900());
						}
						local95 = aStringArray12[--anInt3275];
						local1578 = anIntArray167[--anInt3264] == 1;
						local198 = Static475.method6989() + local95;
						Static400.method6006(local1578, local198, Static310.aClass47_4, Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() == 1);
						return;
					}
					if (arg0 == 5422) {
						anInt3275 -= 2;
						local95 = aStringArray12[anInt3275];
						local101 = aStringArray12[anInt3275 + 1];
						local109 = anIntArray167[--anInt3264];
						if (local95.length() > 0) {
							if (Static301.aStringArray18 == null) {
								Static301.aStringArray18 = new String[Static51.anIntArray60[Static667.aClass169_8.anInt4889]];
							}
							Static301.aStringArray18[local109] = local95;
						}
						if (local101.length() > 0) {
							if (Static674.aStringArray39 == null) {
								Static674.aStringArray39 = new String[Static51.anIntArray60[Static667.aClass169_8.anInt4889]];
							}
							Static674.aStringArray39[local109] = local101;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray12[--anInt3275]);
						return;
					}
					if (arg0 == 5424) {
						anInt3264 -= 11;
						Static354.anInt6017 = anIntArray167[anInt3264];
						Static270.anInt4885 = anIntArray167[anInt3264 + 1];
						Static724.anInt11286 = anIntArray167[anInt3264 + 2];
						Static390.anInt7026 = anIntArray167[anInt3264 + 3];
						Static137.anInt2537 = anIntArray167[anInt3264 + 4];
						Static389.anInt7012 = anIntArray167[anInt3264 + 5];
						Static212.anInt3810 = anIntArray167[anInt3264 + 6];
						Static607.anInt9853 = anIntArray167[anInt3264 + 7];
						Static197.anInt3480 = anIntArray167[anInt3264 + 8];
						Static129.anInt2431 = anIntArray167[anInt3264 + 9];
						Static662.anInt9819 = anIntArray167[anInt3264 + 10];
						Static403.aClass221_115.method5068(Static137.anInt2537);
						Static403.aClass221_115.method5068(Static389.anInt7012);
						Static403.aClass221_115.method5068(Static212.anInt3810);
						Static403.aClass221_115.method5068(Static607.anInt9853);
						Static403.aClass221_115.method5068(Static197.anInt3480);
						Static547.aClass9_29 = null;
						Static343.aClass9_18 = null;
						Static640.aClass9_33 = null;
						Static428.aClass9_21 = null;
						Static235.aClass9_9 = null;
						Static152.aClass9_6 = null;
						Static720.aClass9_36 = null;
						Static325.aClass9_17 = null;
						Static470.aBoolean628 = true;
						return;
					}
					if (arg0 == 5425) {
						Static247.method3755();
						Static470.aBoolean628 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt3264 -= 2;
						Static396.anInt7100 = anIntArray167[anInt3264];
						Static103.anInt1659 = anIntArray167[anInt3264 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt3264 -= 2;
						return;
					}
					if (arg0 == 5428) {
						anInt3264 -= 2;
						local192 = anIntArray167[anInt3264];
						local834 = anIntArray167[anInt3264 + 1];
						anIntArray167[anInt3264++] = Static243.method3728(local192, local834) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static659.method8818(false, aStringArray12[--anInt3275], false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static733.method8728(Static395.anApplet1, "accountcreated");
							return;
						} catch (@Pc(4148) Throwable local4148) {
							return;
						}
					}
					if (arg0 == 5431) {
						try {
							Static733.method8728(Static395.anApplet1, "accountcreatestarted");
							return;
						} catch (@Pc(4161) Throwable local4161) {
							return;
						}
					}
					if (arg0 == 5432) {
						local95 = "";
						if (Static118.aClipboard1 != null) {
							@Pc(4173) Transferable local4173 = Static118.aClipboard1.getContents((Object) null);
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
						aStringArray12[anInt3275++] = local95;
						return;
					}
					if (arg0 == 5433) {
						Static52.anInt867 = anIntArray167[--anInt3264];
						return;
					}
					if (arg0 == 5435) {
						anIntArray167[anInt3264++] = Static215.aBoolean348 ? 1 : 0;
						return;
					}
					if (arg0 == 5436) {
						if (Static50.aClass3_Sub25_1.anInt4207 < 6) {
							anIntArray167[anInt3264++] = 0;
							return;
						}
						if (Static50.aClass3_Sub25_1.anInt4207 == 6 && Static50.aClass3_Sub25_1.anInt4205 < 10) {
							anIntArray167[anInt3264++] = 0;
							return;
						}
						anIntArray167[anInt3264++] = 1;
						return;
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt3264 -= 4;
						local192 = anIntArray167[anInt3264];
						local834 = anIntArray167[anInt3264 + 1];
						local109 = anIntArray167[anInt3264 + 2];
						local115 = anIntArray167[anInt3264 + 3];
						Static536.method7528(local834 << 2, (local192 >> 14 & 0x3FFF) - Static714.anInt11156, local109, false, local115, (local192 & 0x3FFF) - Static339.anInt5859);
						return;
					}
					if (arg0 == 5501) {
						anInt3264 -= 4;
						local192 = anIntArray167[anInt3264];
						local834 = anIntArray167[anInt3264 + 1];
						local109 = anIntArray167[anInt3264 + 2];
						local115 = anIntArray167[anInt3264 + 3];
						Static267.method4106(local834 << 2, local115, local109, (local192 & 0x3FFF) - Static339.anInt5859, (local192 >> 14 & 0x3FFF) - Static714.anInt11156);
						return;
					}
					if (arg0 == 5502) {
						anInt3264 -= 6;
						local192 = anIntArray167[anInt3264];
						if (local192 >= 2) {
							throw new RuntimeException();
						}
						Static153.anInt2819 = local192;
						local834 = anIntArray167[anInt3264 + 1];
						if (local834 + 1 >= Static367.anIntArrayArrayArray5[Static153.anInt2819].length >> 1) {
							throw new RuntimeException();
						}
						Static660.anInt10552 = local834;
						Static134.anInt2499 = 0;
						Static287.anInt5195 = anIntArray167[anInt3264 + 2];
						Static70.anInt1097 = anIntArray167[anInt3264 + 3];
						local109 = anIntArray167[anInt3264 + 4];
						if (local109 >= 2) {
							throw new RuntimeException();
						}
						Static197.anInt3483 = local109;
						local115 = anIntArray167[anInt3264 + 5];
						if (local115 + 1 >= Static367.anIntArrayArrayArray5[Static197.anInt3483].length >> 1) {
							throw new RuntimeException();
						}
						Static405.anInt7242 = local115;
						Static175.anInt10579 = 3;
						Static573.anInt9429 = -1;
						Static283.anInt5140 = -1;
						return;
					}
					if (arg0 == 5503) {
						Static165.method2651();
						return;
					}
					if (arg0 == 5504) {
						anInt3264 -= 2;
						Static188.method2869(anIntArray167[anInt3264 + 1], anIntArray167[anInt3264]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray167[anInt3264++] = (int) Static27.aFloat4 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray167[anInt3264++] = (int) Static658.aFloat196 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static695.method9121();
						return;
					}
					if (arg0 == 5508) {
						Static57.method7103();
						return;
					}
					if (arg0 == 5509) {
						Static347.method2336();
						return;
					}
					if (arg0 == 5510) {
						Static157.method8980();
						return;
					}
					if (arg0 == 5511) {
						local192 = anIntArray167[--anInt3264];
						local834 = local192 >> 14 & 0x3FFF;
						local109 = local192 & 0x3FFF;
						local834 -= Static714.anInt11156;
						if (local834 < 0) {
							local834 = 0;
						} else if (local834 >= Static362.anInt8653) {
							local834 = Static362.anInt8653;
						}
						local109 -= Static339.anInt5859;
						if (local109 < 0) {
							local109 = 0;
						} else if (local109 >= Static206.anInt11291) {
							local109 = Static206.anInt11291;
						}
						Static599.anInt9774 = (local834 << 9) + 256;
						Static46.anInt795 = (local109 << 9) + 256;
						Static175.anInt10579 = 4;
						Static573.anInt9429 = -1;
						Static283.anInt5140 = -1;
						return;
					}
					if (arg0 == 5512) {
						Static478.method6997();
						return;
					}
					if (arg0 == 5514) {
						Static705.anInt11025 = anIntArray167[--anInt3264];
						return;
					}
					if (arg0 == 5516) {
						anIntArray167[anInt3264++] = Static705.anInt11025;
						return;
					}
					if (arg0 == 5517) {
						local192 = anIntArray167[--anInt3264];
						if (local192 == -1) {
							local834 = local192 >> 14 & 0x3FFF;
							local109 = local192 & 0x3FFF;
							local834 -= Static714.anInt11156;
							if (local834 < 0) {
								local834 = 0;
							} else if (local834 >= Static362.anInt8653) {
								local834 = Static362.anInt8653;
							}
							local109 -= Static339.anInt5859;
							if (local109 < 0) {
								local109 = 0;
							} else if (local109 >= Static206.anInt11291) {
								local109 = Static206.anInt11291;
							}
							Static283.anInt5140 = (local834 << 9) + 256;
							Static573.anInt9429 = (local109 << 9) + 256;
							return;
						}
						Static283.anInt5140 = -1;
						Static573.anInt9429 = -1;
						return;
					}
					if (arg0 == 5547) {
						anIntArray167[anInt3264++] = Static175.anInt10579;
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt3275 -= 2;
						local95 = aStringArray12[anInt3275];
						local101 = aStringArray12[anInt3275 + 1];
						local109 = anIntArray167[--anInt3264];
						Static600.method8264(local109, local101, local95);
						return;
					}
					if (arg0 == 5601) {
						Static616.method8389();
						return;
					}
					if (arg0 == 5602) {
						if (!Static651.method8741()) {
							Static21.method9147();
						}
						return;
					}
					if (arg0 == 5604) {
						anInt3275--;
						if (Static178.anInt3225 != 3) {
							return;
						}
						if (!Static651.method8741() && Static556.anInt9262 == 0) {
							Static412.method6127(aStringArray12[anInt3275]);
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt3275 -= 2;
						anInt3264 -= 2;
						if (Static178.anInt3225 != 3) {
							return;
						}
						if (!Static651.method8741() && Static556.anInt9262 == 0) {
							Static368.method5262(aStringArray12[anInt3275 + 1], anIntArray167[anInt3264], aStringArray12[anInt3275], anIntArray167[anInt3264 + 1] == 1);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static556.anInt9262 == 0) {
							Static605.anInt9840 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray167[anInt3264++] = Static249.anInt8065;
						return;
					}
					if (arg0 == 5608) {
						anIntArray167[anInt3264++] = Static456.anInt8042;
						return;
					}
					if (arg0 == 5609) {
						anIntArray167[anInt3264++] = Static605.anInt9840;
						return;
					}
					if (arg0 == 5611) {
						anIntArray167[anInt3264++] = Static486.anInt8432;
						return;
					}
					if (arg0 == 5612) {
						local192 = anIntArray167[--anInt3264];
						Static712.method9283(local192);
						return;
					}
					if (arg0 == 5613) {
						anIntArray167[anInt3264++] = Static249.anInt8065;
						return;
					}
					if (arg0 == 5615) {
						anInt3275 -= 2;
						local95 = aStringArray12[anInt3275];
						local101 = aStringArray12[anInt3275 + 1];
						Static663.method8836(local101, local95);
						return;
					}
					if (arg0 == 5616) {
						Static483.method7049(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray167[anInt3264++] = Static194.anInt3395;
						return;
					}
					if (arg0 == 5618) {
						anInt3264--;
						return;
					}
					if (arg0 == 5619) {
						anInt3264--;
						return;
					}
					if (arg0 == 5620) {
						anIntArray167[anInt3264++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt3275 -= 2;
						anInt3264 -= 2;
						return;
					}
					if (arg0 == 5622) {
						return;
					}
					if (arg0 == 5623) {
						if (Static12.aByteArray2 != null) {
							anIntArray167[anInt3264++] = 1;
							return;
						}
						anIntArray167[anInt3264++] = 0;
						return;
					}
					if (arg0 == 5624) {
						anIntArray167[anInt3264++] = (int) (Static184.aLong116 >> 32);
						anIntArray167[anInt3264++] = (int) (Static184.aLong116 & 0xFFFFFFFFFFFFFFFFL);
						return;
					}
					if (arg0 == 5625) {
						anIntArray167[anInt3264++] = Static47.aBoolean63 ? 1 : 0;
						return;
					}
					if (arg0 == 5626) {
						Static47.aBoolean63 = true;
						Static119.method2061();
						return;
					}
					if (arg0 == 5627) {
						anIntArray167[anInt3264++] = Static113.anInt2265;
						anIntArray167[anInt3264++] = Static718.anInt11220;
						anIntArray167[anInt3264++] = Static82.anInt1267;
						Static113.anInt2265 = -2;
						Static718.anInt11220 = -1;
						Static82.anInt1267 = -1;
						return;
					}
					if (arg0 == 5628) {
						anIntArray167[anInt3264++] = Static651.method8741() ? 1 : 0;
						return;
					}
					if (arg0 == 5629) {
						anIntArray167[anInt3264++] = Static486.anInt8431;
						return;
					}
					if (arg0 == 5630) {
						Static493.method7127();
						return;
					}
					if (arg0 == 5631) {
						anInt3264 -= 2;
						local192 = anIntArray167[anInt3264];
						local834 = anIntArray167[anInt3264 + 1];
						Static388.method5838(local834, local192);
						return;
					}
					if (arg0 == 5632) {
						local192 = anIntArray167[--anInt3264];
						Static717.method9351(local192);
						return;
					}
					if (arg0 == 5633) {
						anIntArray167[anInt3264++] = Static628.anInt10152;
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local192 = anIntArray167[--anInt3264];
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub14_1, local192);
						Static268.method4109();
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					@Pc(5330) boolean local5330;
					if (arg0 == 6002) {
						local5330 = anIntArray167[--anInt3264] == 1;
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub25_2, local5330 ? 1 : 0);
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub25_1, local5330 ? 1 : 0);
						Static268.method4109();
						Static7.method109();
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					if (arg0 == 6003) {
						local5330 = anIntArray167[--anInt3264] == 1;
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub7_1, local5330 ? 2 : 1);
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub7_2, local5330 ? 2 : 1);
						Static7.method109();
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					if (arg0 == 6005) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub29_1, anIntArray167[--anInt3264] == 1 ? 1 : 0);
						Static268.method4109();
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					if (arg0 == 6007) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub9_1, anIntArray167[--anInt3264]);
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					if (arg0 == 6008) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub19_1, anIntArray167[--anInt3264] == 1 ? 1 : 0);
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					if (arg0 == 6010) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub3_1, anIntArray167[--anInt3264] == 1 ? 1 : 0);
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					if (arg0 == 6011) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub18_1, anIntArray167[--anInt3264]);
						Static268.method4109();
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					if (arg0 == 6012) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub28_1, anIntArray167[--anInt3264] == 1 ? 1 : 0);
						Static523.method7451();
						Static538.method6234();
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					if (arg0 == 6014) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub30_1, anIntArray167[--anInt3264] == 1 ? 2 : 0);
						Static268.method4109();
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					if (arg0 == 6015) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub11_1, anIntArray167[--anInt3264] == 1 ? 1 : 0);
						Static268.method4109();
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					if (arg0 == 6016) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub20_2, anIntArray167[--anInt3264]);
						Static718.method9389(Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071(), false);
						Static328.method4885();
						return;
					}
					if (arg0 == 6017) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub10_1, anIntArray167[--anInt3264] == 1 ? 1 : 0);
						Static658.method8805();
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					if (arg0 == 6018) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub8_4, anIntArray167[--anInt3264]);
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					if (arg0 == 6019) {
						local192 = anIntArray167[--anInt3264];
						local834 = Static713.aClass3_Sub55_31.aClass15_Sub8_5.method2888();
						if (local192 != local834) {
							if (Static56.method718(Static178.anInt3225)) {
								if (local834 == 0 && Static491.anInt8476 != -1) {
									Static152.method2444(local192, Static191.aClass221_51, Static491.anInt8476);
									Static203.method3017();
									Static578.aBoolean688 = false;
								} else if (local192 == 0) {
									Static525.method7465();
									Static578.aBoolean688 = false;
								} else {
									Static618.method5118(local192);
								}
							}
							Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub8_5, local192);
							Static328.method4885();
							Static675.aBoolean771 = false;
						}
						return;
					}
					if (arg0 == 6020) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub8_2, anIntArray167[--anInt3264]);
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					if (arg0 == 6021) {
						local192 = Static713.aClass3_Sub55_31.aClass15_Sub7_1.method2473();
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub7_2, anIntArray167[--anInt3264] == 1 ? 0 : local192);
						Static7.method109();
						return;
					}
					if (arg0 == 6023) {
						local192 = anIntArray167[--anInt3264];
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub5_1, local192);
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					if (arg0 == 6024) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub20_1, anIntArray167[--anInt3264]);
						Static328.method4885();
						return;
					}
					if (arg0 == 6025) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub21_1, anIntArray167[--anInt3264]);
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					if (arg0 == 6027) {
						local192 = anIntArray167[--anInt3264];
						if (local192 < 0 || local192 > 1) {
							local192 = 0;
						}
						Static375.method5420(local192 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub15_1, anIntArray167[--anInt3264] == 0 ? 0 : 1);
						Static328.method4885();
						return;
					}
					if (arg0 == 6029) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub9_1, anIntArray167[--anInt3264]);
						Static328.method4885();
						return;
					}
					if (arg0 == 6030) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub16_1, anIntArray167[--anInt3264] == 0 ? 0 : 1);
						Static328.method4885();
						Static268.method4109();
						return;
					}
					if (arg0 == 6031) {
						local192 = anIntArray167[--anInt3264];
						if (local192 < 0 || local192 > 5) {
							local192 = 2;
						}
						Static718.method9389(local192, false);
						return;
					}
					if (arg0 == 6032) {
						anInt3264 -= 2;
						local192 = anIntArray167[anInt3264];
						local1578 = anIntArray167[anInt3264 + 1] == 1;
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.lb, local192);
						if (!local1578) {
							Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub1_1, 0);
						}
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					if (arg0 == 6033) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub6_1, anIntArray167[--anInt3264]);
						Static328.method4885();
						return;
					}
					if (arg0 == 6034) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub26_1, anIntArray167[--anInt3264] == 1 ? 1 : 0);
						Static328.method4885();
						Static523.method7451();
						Static675.aBoolean771 = false;
						return;
					}
					if (arg0 == 6035) {
						local192 = Static713.aClass3_Sub55_31.aClass15_Sub25_2.method8268();
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub25_1, anIntArray167[--anInt3264] == 1 ? 1 : local192);
						Static268.method4109();
						Static7.method109();
						return;
					}
					if (arg0 == 6036) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub24_1, anIntArray167[--anInt3264]);
						Static328.method4885();
						Static169.aBoolean257 = true;
						return;
					}
					if (arg0 == 6037) {
						Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub8_1, anIntArray167[--anInt3264]);
						Static328.method4885();
						Static675.aBoolean771 = false;
						return;
					}
					if (arg0 == 6038) {
						local192 = anIntArray167[--anInt3264];
						local834 = Static713.aClass3_Sub55_31.aClass15_Sub8_3.method2888();
						if (local192 != local834 && Static491.anInt8476 == Static183.anInt3251) {
							if (!Static56.method718(Static178.anInt3225)) {
								if (local834 == 0) {
									Static152.method2444(local192, Static191.aClass221_51, Static491.anInt8476);
									Static203.method3017();
									Static578.aBoolean688 = false;
								} else if (local192 == 0) {
									Static525.method7465();
									Static578.aBoolean688 = false;
								} else {
									Static618.method5118(local192);
								}
							}
							Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub8_3, local192);
							Static328.method4885();
							Static675.aBoolean771 = false;
						}
						return;
					}
					if (arg0 == 6039) {
						local192 = anIntArray167[--anInt3264];
						if (local192 > 255 || local192 < 0) {
							local192 = 0;
						}
						if (local192 != Static713.aClass3_Sub55_31.aClass15_Sub22_1.method7522()) {
							Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub22_1, local192);
							Static328.method4885();
							Static675.aBoolean771 = false;
						}
						return;
					}
					if (arg0 == 6040) {
						local192 = anIntArray167[--anInt3264];
						if (local192 != Static713.aClass3_Sub55_31.aClass15_Sub2_1.method857()) {
							Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub2_1, local192);
							Static328.method4885();
							Static675.aBoolean771 = false;
							Static373.method5411();
						}
						return;
					}
					if (arg0 == 6041) {
						local192 = anIntArray167[--anInt3264];
						if (local192 != Static713.aClass3_Sub55_31.aClass15_Sub27_1.method9037()) {
							Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub27_1, local192);
							Static328.method4885();
							Static675.aBoolean771 = false;
						}
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub14_1.method5959();
						return;
					}
					if (arg0 == 6102) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub25_2.method8268() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub7_1.method2473() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub29_1.method9292() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub9_1.method3122();
						return;
					}
					if (arg0 == 6108) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub19_1.method7116() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub3_1.method910() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub18_1.method6987();
						return;
					}
					if (arg0 == 6112) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub28_1.method9169() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub30_1.method9427() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub11_1.method4066() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub20_2.method7387();
						return;
					}
					if (arg0 == 6117) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub10_1.method3763() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub8_4.method2888();
						return;
					}
					if (arg0 == 6119) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub8_5.method2888();
						return;
					}
					if (arg0 == 6120) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub8_2.method2888();
						return;
					}
					if (arg0 == 6123) {
						anIntArray167[anInt3264++] = Static490.method7106();
						return;
					}
					if (arg0 == 6124) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub20_1.method7387();
						return;
					}
					if (arg0 == 6125) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub21_1.method7460();
						return;
					}
					if (arg0 == 6127) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub12_1.method4585() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub15_1.method6340() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub9_1.method3122();
						return;
					}
					if (arg0 == 6130) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub16_1.method6384() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071();
						return;
					}
					if (arg0 == 6132) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.lb.method1071();
						return;
					}
					if (arg0 == 6133) {
						anIntArray167[anInt3264++] = Static310.aClass47_4.aBoolean97 && !Static310.aClass47_4.aBoolean98 ? 1 : 0;
						return;
					}
					if (arg0 == 6135) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub6_1.method2392();
						return;
					}
					if (arg0 == 6136) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub26_1.method8908() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6138) {
						anIntArray167[anInt3264++] = Static111.method1982(Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071(), 200);
						return;
					}
					if (arg0 == 6139) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub24_1.method8063();
						return;
					}
					if (arg0 == 6142) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub8_1.method2888();
						return;
					}
					if (arg0 == 6143) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub8_3.method2888();
						return;
					}
					if (arg0 == 6144) {
						anIntArray167[anInt3264++] = Static595.aBoolean702 ? 1 : 0;
						return;
					}
					if (arg0 == 6145) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub22_1.method7522();
						return;
					}
					if (arg0 == 6146) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub2_1.method857();
						return;
					}
					if (arg0 == 6147) {
						anIntArray167[anInt3264++] = Static50.aClass3_Sub25_1.anInt4197 < 512 || Static595.aBoolean702 || Static72.aBoolean91 ? 1 : 0;
						return;
					}
					if (arg0 == 6148) {
						anIntArray167[anInt3264++] = Static348.aBoolean476 ? 1 : 0;
						return;
					}
					if (arg0 == 6149) {
						anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub27_1.method9037();
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt3264 -= 2;
						Static49.aShort6 = (short) anIntArray167[anInt3264];
						if (Static49.aShort6 <= 0) {
							Static49.aShort6 = 256;
						}
						Static464.aShort114 = (short) anIntArray167[anInt3264 + 1];
						if (Static464.aShort114 <= 0) {
							Static464.aShort114 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt3264 -= 2;
						Static106.aShort15 = (short) anIntArray167[anInt3264];
						if (Static106.aShort15 <= 0) {
							Static106.aShort15 = 256;
						}
						Static674.aShort126 = (short) anIntArray167[anInt3264 + 1];
						if (Static674.aShort126 <= 0) {
							Static674.aShort126 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt3264 -= 4;
						Static134.aShort20 = (short) anIntArray167[anInt3264];
						if (Static134.aShort20 <= 0) {
							Static134.aShort20 = 1;
						}
						Static232.aShort54 = (short) anIntArray167[anInt3264 + 1];
						if (Static232.aShort54 <= 0) {
							Static232.aShort54 = 32767;
						} else if (Static232.aShort54 < Static134.aShort20) {
							Static232.aShort54 = Static134.aShort20;
						}
						Static454.aShort112 = (short) anIntArray167[anInt3264 + 2];
						if (Static454.aShort112 <= 0) {
							Static454.aShort112 = 1;
						}
						Static424.aShort97 = (short) anIntArray167[anInt3264 + 3];
						if (Static424.aShort97 <= 0) {
							Static424.aShort97 = 32767;
							return;
						}
						if (Static424.aShort97 < Static454.aShort112) {
							Static424.aShort97 = Static454.aShort112;
						}
						return;
					}
					if (arg0 == 6203) {
						Static240.method9043(false, 0, 0, Static474.aClass20_14.anInt509, Static474.aClass20_14.anInt569);
						anIntArray167[anInt3264++] = Static9.anInt141;
						anIntArray167[anInt3264++] = Static575.anInt9442;
						return;
					}
					if (arg0 == 6204) {
						anIntArray167[anInt3264++] = Static106.aShort15;
						anIntArray167[anInt3264++] = Static674.aShort126;
						return;
					}
					if (arg0 == 6205) {
						anIntArray167[anInt3264++] = Static49.aShort6;
						anIntArray167[anInt3264++] = Static464.aShort114;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray167[anInt3264++] = (int) (Static626.method8479() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray167[anInt3264++] = (int) (Static626.method8479() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt3264 -= 3;
						local192 = anIntArray167[anInt3264];
						local834 = anIntArray167[anInt3264 + 1];
						local109 = anIntArray167[anInt3264 + 2];
						@Pc(7377) long local7377 = Static173.method2692(local109, local834, local192);
						local3561 = Static349.method5055(local7377);
						if (local109 < 1970) {
							local3561--;
						}
						anIntArray167[anInt3264++] = local3561;
						return;
					}
					if (arg0 == 6303) {
						anIntArray167[anInt3264++] = Static29.method401(Static626.method8479());
						return;
					}
					if (arg0 == 6304) {
						local192 = anIntArray167[--anInt3264];
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
						anIntArray167[anInt3264++] = local1578 ? 1 : 0;
						return;
					}
					if (arg0 == 6305) {
						local192 = anIntArray167[--anInt3264];
						@Pc(7505) int[] local7505 = Static610.method8342(local192);
						Static735.method9182(local7505, 0, anIntArray167, anInt3264, 3);
						anInt3264 += 3;
						return;
					}
					if (arg0 == 6306) {
						local192 = anIntArray167[--anInt3264];
						anIntArray167[anInt3264++] = (int) (Static330.method4919(local192) / 60000L);
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray167[anInt3264++] = Static53.method9372() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray167[anInt3264++] = Static351.method5072() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static178.anInt3225 == 7 && !Static651.method8741() && Static556.anInt9262 == 0) {
							if (Static432.aBoolean578) {
								anIntArray167[anInt3264++] = 0;
								return;
							}
							if (Static412.aLong247 > Static626.method8479() - 1000L) {
								anIntArray167[anInt3264++] = 1;
								return;
							}
							Static432.aBoolean578 = true;
							@Pc(7655) Class3_Sub48 local7655 = Static89.method1200(Static578.aClass286_99, Static532.aClass400_2.aClass399_2);
							local7655.aClass3_Sub28_Sub2_1.method5311(Static642.anInt10382);
							Static532.aClass400_2.method9223(local7655);
							anIntArray167[anInt3264++] = 0;
							return;
						}
						anIntArray167[anInt3264++] = 1;
						return;
					}
					@Pc(7712) Class366 local7712;
					@Pc(7679) Class256_Sub1 local7679;
					if (arg0 == 6501) {
						local7679 = Static681.method8985();
						if (local7679 != null) {
							anIntArray167[anInt3264++] = local7679.anInt7714;
							anIntArray167[anInt3264++] = local7679.anInt7704;
							aStringArray12[anInt3275++] = local7679.aString105;
							local7712 = local7679.method6538();
							anIntArray167[anInt3264++] = local7712.anInt10425;
							aStringArray12[anInt3275++] = local7712.aString125;
							anIntArray167[anInt3264++] = local7679.anInt7707;
							anIntArray167[anInt3264++] = local7679.anInt7713;
							aStringArray12[anInt3275++] = local7679.aString106;
							return;
						}
						anIntArray167[anInt3264++] = -1;
						anIntArray167[anInt3264++] = 0;
						aStringArray12[anInt3275++] = "";
						anIntArray167[anInt3264++] = 0;
						aStringArray12[anInt3275++] = "";
						anIntArray167[anInt3264++] = 0;
						anIntArray167[anInt3264++] = 0;
						aStringArray12[anInt3275++] = "";
						return;
					}
					if (arg0 == 6502) {
						local7679 = Static196.method2962();
						if (local7679 != null) {
							anIntArray167[anInt3264++] = local7679.anInt7714;
							anIntArray167[anInt3264++] = local7679.anInt7704;
							aStringArray12[anInt3275++] = local7679.aString105;
							local7712 = local7679.method6538();
							anIntArray167[anInt3264++] = local7712.anInt10425;
							aStringArray12[anInt3275++] = local7712.aString125;
							anIntArray167[anInt3264++] = local7679.anInt7707;
							anIntArray167[anInt3264++] = local7679.anInt7713;
							aStringArray12[anInt3275++] = local7679.aString106;
							return;
						}
						anIntArray167[anInt3264++] = -1;
						anIntArray167[anInt3264++] = 0;
						aStringArray12[anInt3275++] = "";
						anIntArray167[anInt3264++] = 0;
						aStringArray12[anInt3275++] = "";
						anIntArray167[anInt3264++] = 0;
						anIntArray167[anInt3264++] = 0;
						aStringArray12[anInt3275++] = "";
						return;
					}
					if (arg0 == 6503) {
						local192 = anIntArray167[--anInt3264];
						local101 = aStringArray12[--anInt3275];
						if (Static178.anInt3225 == 7 && !Static651.method8741() && Static556.anInt9262 == 0) {
							anIntArray167[anInt3264++] = Static611.method7556(local101, local192) ? 1 : 0;
							return;
						}
						anIntArray167[anInt3264++] = 0;
						return;
					}
					if (arg0 == 6506) {
						local192 = anIntArray167[--anInt3264];
						@Pc(8046) Class256_Sub1 local8046 = Static325.method4838(local192);
						if (local8046 != null) {
							anIntArray167[anInt3264++] = local8046.anInt7704;
							aStringArray12[anInt3275++] = local8046.aString105;
							@Pc(8070) Class366 local8070 = local8046.method6538();
							anIntArray167[anInt3264++] = local8070.anInt10425;
							aStringArray12[anInt3275++] = local8070.aString125;
							anIntArray167[anInt3264++] = local8046.anInt7707;
							anIntArray167[anInt3264++] = local8046.anInt7713;
							aStringArray12[anInt3275++] = local8046.aString106;
							return;
						}
						anIntArray167[anInt3264++] = -1;
						aStringArray12[anInt3275++] = "";
						anIntArray167[anInt3264++] = 0;
						aStringArray12[anInt3275++] = "";
						anIntArray167[anInt3264++] = 0;
						anIntArray167[anInt3264++] = 0;
						aStringArray12[anInt3275++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt3264 -= 4;
						local192 = anIntArray167[anInt3264];
						local1578 = anIntArray167[anInt3264 + 1] == 1;
						local109 = anIntArray167[anInt3264 + 2];
						local2331 = anIntArray167[anInt3264 + 3] == 1;
						Static114.method2023(local1578, local192, local2331, local109);
						return;
					}
					if (arg0 == 6508) {
						Static407.method6075();
						return;
					}
					if (arg0 == 6509) {
						if (Static178.anInt3225 != 7) {
							return;
						}
						Static618.aBoolean481 = anIntArray167[--anInt3264] == 1;
						return;
					}
					if (arg0 == 6510) {
						anIntArray167[anInt3264++] = Static50.anInt851;
						return;
					}
				} else if (arg0 >= 6700) {
					if (arg0 < 6800 && Static593.aClass146_3 == Static432.aClass146_2) {
						if (arg0 == 6700) {
							local192 = Static170.aClass136_19.method3504();
							if (Static633.anInt3426 != -1) {
								local192++;
							}
							anIntArray167[anInt3264++] = local192;
							return;
						}
						if (arg0 == 6701) {
							local192 = anIntArray167[--anInt3264];
							if (Static633.anInt3426 != -1) {
								if (local192 == 0) {
									anIntArray167[anInt3264++] = Static633.anInt3426;
									return;
								}
								local192--;
							}
							@Pc(8337) Class3_Sub52 local8337 = (Class3_Sub52) Static170.aClass136_19.method3509();
							while (local192-- > 0) {
								local8337 = (Class3_Sub52) Static170.aClass136_19.method3506();
							}
							anIntArray167[anInt3264++] = local8337.anInt10202;
							return;
						}
						if (arg0 == 6702) {
							local192 = anIntArray167[--anInt3264];
							if (Static403.aClass20ArrayArray2[local192] == null) {
								aStringArray12[anInt3275++] = "";
								return;
							}
							local101 = Static403.aClass20ArrayArray2[local192][0].aString10;
							if (local101 == null) {
								aStringArray12[anInt3275++] = "";
								return;
							}
							aStringArray12[anInt3275++] = local101.substring(0, local101.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local192 = anIntArray167[--anInt3264];
							if (Static403.aClass20ArrayArray2[local192] == null) {
								anIntArray167[anInt3264++] = 0;
								return;
							}
							anIntArray167[anInt3264++] = Static403.aClass20ArrayArray2[local192].length;
							return;
						}
						if (arg0 == 6704) {
							anInt3264 -= 2;
							local192 = anIntArray167[anInt3264];
							local834 = anIntArray167[anInt3264 + 1];
							if (Static403.aClass20ArrayArray2[local192] == null) {
								aStringArray12[anInt3275++] = "";
								return;
							}
							local198 = Static403.aClass20ArrayArray2[local192][local834].aString10;
							if (local198 == null) {
								aStringArray12[anInt3275++] = "";
								return;
							}
							aStringArray12[anInt3275++] = local198;
							return;
						}
						if (arg0 == 6705) {
							anInt3264 -= 2;
							local192 = anIntArray167[anInt3264];
							local834 = anIntArray167[anInt3264 + 1];
							if (Static403.aClass20ArrayArray2[local192] == null) {
								anIntArray167[anInt3264++] = 0;
								return;
							}
							anIntArray167[anInt3264++] = Static403.aClass20ArrayArray2[local192][local834].anInt590;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							anInt3264 -= 3;
							local192 = anIntArray167[anInt3264];
							local834 = anIntArray167[anInt3264 + 1];
							local109 = anIntArray167[anInt3264 + 2];
							Static298.method3453(1, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6708) {
							anInt3264 -= 3;
							local192 = anIntArray167[anInt3264];
							local834 = anIntArray167[anInt3264 + 1];
							local109 = anIntArray167[anInt3264 + 2];
							Static298.method3453(2, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6709) {
							anInt3264 -= 3;
							local192 = anIntArray167[anInt3264];
							local834 = anIntArray167[anInt3264 + 1];
							local109 = anIntArray167[anInt3264 + 2];
							Static298.method3453(3, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6710) {
							anInt3264 -= 3;
							local192 = anIntArray167[anInt3264];
							local834 = anIntArray167[anInt3264 + 1];
							local109 = anIntArray167[anInt3264 + 2];
							Static298.method3453(4, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6711) {
							anInt3264 -= 3;
							local192 = anIntArray167[anInt3264];
							local834 = anIntArray167[anInt3264 + 1];
							local109 = anIntArray167[anInt3264 + 2];
							Static298.method3453(5, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6712) {
							anInt3264 -= 3;
							local192 = anIntArray167[anInt3264];
							local834 = anIntArray167[anInt3264 + 1];
							local109 = anIntArray167[anInt3264 + 2];
							Static298.method3453(6, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6713) {
							anInt3264 -= 3;
							local192 = anIntArray167[anInt3264];
							local834 = anIntArray167[anInt3264 + 1];
							local109 = anIntArray167[anInt3264 + 2];
							Static298.method3453(7, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6714) {
							anInt3264 -= 3;
							local192 = anIntArray167[anInt3264];
							local834 = anIntArray167[anInt3264 + 1];
							local109 = anIntArray167[anInt3264 + 2];
							Static298.method3453(8, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6715) {
							anInt3264 -= 3;
							local192 = anIntArray167[anInt3264];
							local834 = anIntArray167[anInt3264 + 1];
							local109 = anIntArray167[anInt3264 + 2];
							Static298.method3453(9, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6716) {
							anInt3264 -= 3;
							local192 = anIntArray167[anInt3264];
							local834 = anIntArray167[anInt3264 + 1];
							local109 = anIntArray167[anInt3264 + 2];
							Static298.method3453(10, "", local192 << 16 | local834, local109);
							return;
						}
						if (arg0 == 6717) {
							anInt3264 -= 3;
							local192 = anIntArray167[anInt3264];
							local834 = anIntArray167[anInt3264 + 1];
							local109 = anIntArray167[anInt3264 + 2];
							@Pc(8933) Class20 local8933 = Static244.method3731(local192 << 16 | local834, local109);
							Static427.method6535();
							@Pc(8938) Class3_Sub29 local8938 = Static87.method1164(local8933);
							Static229.method3585(local8933, local8938.anInt5441, local8938.method4617());
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(8968) Class105 local8968;
						if (arg0 == 6800) {
							local192 = anIntArray167[--anInt3264];
							local8968 = Static462.aClass98_2.method2452(local192);
							if (local8968.aString57 == null) {
								aStringArray12[anInt3275++] = "";
								return;
							}
							aStringArray12[anInt3275++] = local8968.aString57;
							return;
						}
						if (arg0 == 6801) {
							local192 = anIntArray167[--anInt3264];
							local8968 = Static462.aClass98_2.method2452(local192);
							anIntArray167[anInt3264++] = local8968.anInt3103;
							return;
						}
						if (arg0 == 6802) {
							local192 = anIntArray167[--anInt3264];
							local8968 = Static462.aClass98_2.method2452(local192);
							anIntArray167[anInt3264++] = local8968.anInt3109;
							return;
						}
						if (arg0 == 6803) {
							local192 = anIntArray167[--anInt3264];
							local8968 = Static462.aClass98_2.method2452(local192);
							anIntArray167[anInt3264++] = local8968.anInt3089;
							return;
						}
						if (arg0 == 6804) {
							anInt3264 -= 2;
							local192 = anIntArray167[anInt3264];
							local834 = anIntArray167[anInt3264 + 1];
							@Pc(9091) Class319 local9091 = Static646.aClass106_1.method2677(local834);
							if (local9091.method7779()) {
								aStringArray12[anInt3275++] = Static462.aClass98_2.method2452(local192).method2661(local834, local9091.aString121);
								return;
							}
							anIntArray167[anInt3264++] = Static462.aClass98_2.method2452(local192).method2660(local834, local9091.anInt9232);
							return;
						}
					} else if (arg0 < 7000) {
						if (arg0 == 6900) {
							anIntArray167[anInt3264++] = Static125.aBoolean199 && !Static697.aBoolean790 ? 1 : 0;
							return;
						}
						if (arg0 == 6901) {
							anIntArray167[anInt3264++] = (int) (Static590.aLong329 / 60000L);
							anIntArray167[anInt3264++] = (int) ((Static590.aLong329 - Static626.method8479() - Static705.aLong376) / 60000L);
							anIntArray167[anInt3264++] = Static96.aBoolean127 ? 1 : 0;
							return;
						}
						if (arg0 == 6902) {
							anIntArray167[anInt3264++] = Static715.anInt7772;
							return;
						}
						if (arg0 == 6903) {
							anIntArray167[anInt3264++] = Static554.anInt9249;
							return;
						}
						if (arg0 == 6904) {
							anIntArray167[anInt3264++] = Static681.anInt10762;
							return;
						}
						if (arg0 == 6905) {
							local95 = "";
							if (Static183.aClass201_5 != null) {
								if (Static183.aClass201_5.anObject16 == null) {
									local95 = Static156.method2474(Static183.aClass201_5.anInt5731);
								} else {
									local95 = (String) Static183.aClass201_5.anObject16;
								}
							}
							aStringArray12[anInt3275++] = local95;
							return;
						}
						if (arg0 == 6906) {
							anIntArray167[anInt3264++] = Static666.anInt10604;
							return;
						}
						if (arg0 == 6907) {
							anIntArray167[anInt3264++] = Static513.anInt10412;
							return;
						}
						if (arg0 == 6908) {
							anIntArray167[anInt3264++] = Static621.anInt10014;
							return;
						}
						if (arg0 == 6909) {
							anIntArray167[anInt3264++] = Static626.aBoolean733 ? 1 : 0;
							return;
						}
						if (arg0 == 6910) {
							anIntArray167[anInt3264++] = Static189.anInt3335;
							return;
						}
						if (arg0 == 6911) {
							anIntArray167[anInt3264++] = Static496.anInt8520;
							return;
						}
						if (arg0 == 6912) {
							anIntArray167[anInt3264++] = Static277.anInt5059;
							return;
						}
						if (arg0 == 6913) {
							anIntArray167[anInt3264++] = Static543.anInt9107;
							return;
						}
						if (arg0 == 6914) {
							anIntArray167[anInt3264++] = Static542.aBoolean669 ? 1 : 0;
							return;
						}
						if (arg0 == 6915) {
							anIntArray167[anInt3264++] = Static59.anInt926;
							return;
						}
					} else if (arg0 < 7100) {
						if (arg0 == 7000) {
							local192 = Static188.method2870();
							anIntArray167[anInt3264++] = Static226.anInt4288 = Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071();
							anIntArray167[anInt3264++] = local192;
							Static268.method4109();
							Static328.method4885();
							Static675.aBoolean771 = false;
							return;
						}
						if (arg0 == 7001) {
							Static6.method104();
							Static268.method4109();
							Static328.method4885();
							Static675.aBoolean771 = false;
							return;
						}
						if (arg0 == 7002) {
							Static67.method820();
							Static268.method4109();
							Static328.method4885();
							Static675.aBoolean771 = false;
							return;
						}
						if (arg0 == 7003) {
							Static413.method6147();
							Static268.method4109();
							Static328.method4885();
							Static675.aBoolean771 = false;
							return;
						}
						if (arg0 == 7004) {
							Static209.method3106();
							Static268.method4109();
							Static328.method4885();
							Static675.aBoolean771 = false;
							return;
						}
						if (arg0 == 7005) {
							Static713.aClass3_Sub55_31.method8897(Static713.aClass3_Sub55_31.aClass15_Sub1_1, 0);
							Static328.method4885();
							Static675.aBoolean771 = false;
							return;
						}
						if (arg0 == 7006) {
							if (Static226.anInt4288 == 2) {
								Static576.aBoolean686 = true;
								return;
							}
							if (Static226.anInt4288 == 1) {
								Static206.aBoolean816 = true;
								return;
							}
							if (Static226.anInt4288 == 3) {
								Static244.aBoolean399 = true;
							}
							return;
						}
						if (arg0 == 7007) {
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub1_1.method376();
							return;
						}
					} else if (arg0 < 7200) {
						if (arg0 == 7100) {
							anInt3264 -= 2;
							local192 = anIntArray167[anInt3264];
							local834 = anIntArray167[anInt3264 + 1];
							if (local192 != -1) {
								if (local834 > 255) {
									local834 = 255;
								} else if (local834 < 0) {
									local834 = 0;
								}
								Static712.method9280(false, local834, local192);
							}
							return;
						}
						if (arg0 == 7101) {
							local192 = anIntArray167[--anInt3264];
							if (local192 != -1) {
								Static411.method5564(local192);
							}
							return;
						}
						if (arg0 == 7102) {
							local192 = anIntArray167[--anInt3264];
							if (local192 != -1) {
								Static672.method8913(local192);
							}
							return;
						}
						if (arg0 == 7103) {
							anIntArray167[anInt3264++] = Static258.method4012("jagtheora") ? 1 : 0;
							return;
						}
					} else if (arg0 < 7300) {
						if (arg0 == 7201) {
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub29_1.method9294() ? 1 : 0;
							return;
						}
						if (arg0 == 7202) {
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub3_1.method911() ? 1 : 0;
							return;
						}
						if (arg0 == 7203) {
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub18_1.method6990() ? 1 : 0;
							return;
						}
						if (arg0 == 7204) {
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub30_1.method9424() ? 1 : 0;
							return;
						}
						if (arg0 == 7205) {
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub20_1.method7388() && Static488.aClass67_12.method7697() ? 1 : 0;
							return;
						}
						if (arg0 == 7206) {
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub5_1.method2134() ? 1 : 0;
							return;
						}
						if (arg0 == 7207) {
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub21_1.method7461() ? 1 : 0;
							return;
						}
						if (arg0 == 7208) {
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub12_1.method4586() && Static488.aClass67_12.method7654() ? 1 : 0;
							return;
						}
						if (arg0 == 7209) {
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub16_1.method6385() ? 1 : 0;
							return;
						}
						if (arg0 == 7210) {
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub26_1.method8912() ? 1 : 0;
							return;
						}
						if (arg0 == 7211) {
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub24_1.method8062() ? 1 : 0;
							return;
						}
						if (arg0 == 7212) {
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub11_1.method4070() ? 1 : 0;
							return;
						}
						if (arg0 == 7213) {
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub2_1.method853() ? 1 : 0;
							return;
						}
						if (arg0 == 7214) {
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.lb.method1067() ? 1 : 0;
							return;
						}
						if (arg0 == 7215) {
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub27_1.method9038() ? 1 : 0;
							return;
						}
					} else if (arg0 < 7400) {
						if (arg0 == 7301) {
							local192 = anIntArray167[--anInt3264];
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub29_1.method9420(local192);
							return;
						}
						if (arg0 == 7302) {
							local192 = anIntArray167[--anInt3264];
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub3_1.method9420(local192);
							return;
						}
						if (arg0 == 7303) {
							local192 = anIntArray167[--anInt3264];
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub18_1.method9420(local192);
							return;
						}
						if (arg0 == 7304) {
							local192 = anIntArray167[--anInt3264];
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub30_1.method9420(local192);
							return;
						}
						if (arg0 == 7305) {
							local192 = anIntArray167[--anInt3264];
							if (!Static488.aClass67_12.method7697()) {
								anIntArray167[anInt3264++] = 3;
								return;
							}
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub20_1.method9420(local192);
							return;
						}
						if (arg0 == 7306) {
							local192 = anIntArray167[--anInt3264];
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub5_1.method9420(local192);
							return;
						}
						if (arg0 == 7307) {
							local192 = anIntArray167[--anInt3264];
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub21_1.method9420(local192);
							return;
						}
						if (arg0 == 7308) {
							local192 = anIntArray167[--anInt3264];
							if (!Static488.aClass67_12.method7654()) {
								anIntArray167[anInt3264++] = 3;
								return;
							}
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub12_1.method9420(local192);
							return;
						}
						if (arg0 == 7309) {
							local192 = anIntArray167[--anInt3264];
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub16_1.method9420(local192);
							return;
						}
						if (arg0 == 7310) {
							local192 = anIntArray167[--anInt3264];
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub26_1.method9420(local192);
							return;
						}
						if (arg0 == 7311) {
							local192 = anIntArray167[--anInt3264];
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub24_1.method9420(local192);
							return;
						}
						if (arg0 == 7312) {
							local192 = anIntArray167[--anInt3264];
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub11_1.method9420(local192);
							return;
						}
						if (arg0 == 7313) {
							local192 = anIntArray167[--anInt3264];
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub2_1.method9420(local192);
							return;
						}
						if (arg0 == 7314) {
							local192 = anIntArray167[--anInt3264];
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.lb.method9420(local192);
							return;
						}
						if (arg0 == 7315) {
							local192 = anIntArray167[--anInt3264];
							anIntArray167[anInt3264++] = Static713.aClass3_Sub55_31.aClass15_Sub27_1.method9420(local192);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(Lclient!av;)V")
	private static void method2822(@OriginalArg(0) Class20 arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(71) Class20[] local71;
		if (arg0.anInt583 == -1) {
			@Pc(119) int local119 = arg0.anInt600 >>> 16;
			@Pc(123) Class20[] local123 = Static280.aClass20ArrayArray1[local119];
			if (local123 == null) {
				local71 = Static403.aClass20ArrayArray2[local119];
				@Pc(132) int local132 = local71.length;
				local123 = Static280.aClass20ArrayArray1[local119] = new Class20[local132];
				Static735.method9183(local71, 0, local123, 0, local71.length);
			}
			@Pc(148) int local148;
			for (local148 = 0; local148 < local123.length && local123[local148] != arg0; local148++) {
			}
			if (local148 >= local123.length) {
				return;
			}
			Static735.method9183(local123, local148 + 1, local123, local148, local123.length - local148 - 1);
			local123[local123.length - 1] = arg0;
			return;
		}
		@Pc(12) Class20 local12 = Static118.method2045(arg0.anInt556);
		if (local12 == null) {
			return;
		}
		if (local12.aClass20Array2 == local12.aClass20Array1) {
			local12.aClass20Array2 = new Class20[local12.aClass20Array1.length];
			local12.aClass20Array2[local12.aClass20Array2.length - 1] = arg0;
			Static735.method9183(local12.aClass20Array1, 0, local12.aClass20Array2, 0, arg0.anInt583);
			Static735.method9183(local12.aClass20Array1, arg0.anInt583 + 1, local12.aClass20Array2, arg0.anInt583, local12.aClass20Array1.length - arg0.anInt583 - 1);
			return;
		}
		@Pc(68) int local68 = 0;
		local71 = local12.aClass20Array2;
		while (local68 < local71.length && local71[local68] != arg0) {
			local68++;
		}
		if (local68 >= local71.length) {
			return;
		}
		Static735.method9183(local71, local68 + 1, local71, local68, local71.length - local68 - 1);
		local71[local12.aClass20Array2.length - 1] = arg0;
		return;
	}

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "(I)I")
	private static int method2823(@OriginalArg(0) int arg0) {
		@Pc(4) Class253 local4 = Static455.aClass227_1.method5139(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c112");
		}
		@Pc(24) Integer local24 = aClass237_3.method5844(Static667.aClass169_8.anInt4889 << 16 | arg0);
		if (local24 == null) {
			return local4.aChar4 == 'i' || local4.aChar4 == '1' ? 0 : -1;
		} else {
			return local24;
		}
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(IZ)V")
	private static void method2824(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(220) Class20 local220;
		@Pc(27) int local27;
		@Pc(72) int local72;
		@Pc(21) int local21;
		@Pc(38) Class20 local38;
		@Pc(248) Class20 local248;
		@Pc(303) Class20 local303;
		@Pc(15) int local15;
		if (arg0 < 300) {
			if (arg0 == 150) {
				anInt3264 -= 3;
				local15 = anIntArray167[anInt3264];
				local21 = anIntArray167[anInt3264 + 1];
				local27 = anIntArray167[anInt3264 + 2];
				if (local21 == 0) {
					throw new RuntimeException();
				}
				local38 = Static118.method2045(local15);
				if (local38.aClass20Array1 == null) {
					local38.aClass20Array1 = new Class20[local27 + 1];
					local38.aClass20Array2 = local38.aClass20Array1;
				}
				if (local38.aClass20Array1.length <= local27) {
					@Pc(70) Class20[] local70;
					if (local38.aClass20Array1 == local38.aClass20Array2) {
						local70 = new Class20[local27 + 1];
						for (local72 = 0; local72 < local38.aClass20Array1.length; local72++) {
							local70[local72] = local38.aClass20Array1[local72];
						}
						local38.aClass20Array1 = local38.aClass20Array2 = local70;
					} else {
						local70 = new Class20[local27 + 1];
						@Pc(104) Class20[] local104 = new Class20[local27 + 1];
						for (@Pc(106) int local106 = 0; local106 < local38.aClass20Array1.length; local106++) {
							local70[local106] = local38.aClass20Array1[local106];
							local104[local106] = local38.aClass20Array2[local106];
						}
						local38.aClass20Array1 = local70;
						local38.aClass20Array2 = local104;
					}
				}
				if (local27 > 0 && local38.aClass20Array1[local27 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local27 - 1));
				}
				@Pc(166) Class20 local166 = new Class20();
				local166.anInt532 = local21;
				local166.anInt556 = local166.anInt600 = local38.anInt600;
				local166.anInt583 = local27;
				local38.aClass20Array1[local27] = local166;
				if (local38.aClass20Array2 != local38.aClass20Array1) {
					local38.aClass20Array2[local27] = local166;
				}
				if (arg1) {
					aClass20_8 = local166;
				} else {
					aClass20_7 = local166;
				}
				Static391.method5905(local38);
				return;
			}
			if (arg0 == 151) {
				local220 = arg1 ? aClass20_8 : aClass20_7;
				if (local220.anInt583 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local248 = Static118.method2045(local220.anInt600);
				local248.aClass20Array1[local220.anInt583] = null;
				Static391.method5905(local248);
				return;
			}
			if (arg0 == 152) {
				local220 = Static118.method2045(anIntArray167[--anInt3264]);
				local220.aClass20Array1 = null;
				local220.aClass20Array2 = null;
				Static391.method5905(local220);
				return;
			}
			if (arg0 == 200) {
				anInt3264 -= 2;
				local15 = anIntArray167[anInt3264];
				local21 = anIntArray167[anInt3264 + 1];
				local303 = Static244.method3731(local15, local21);
				if (local303 != null && local21 != -1) {
					anIntArray167[anInt3264++] = 1;
					if (arg1) {
						aClass20_8 = local303;
						return;
					}
					aClass20_7 = local303;
					return;
				}
				anIntArray167[anInt3264++] = 0;
				return;
			}
			if (arg0 == 201) {
				local15 = anIntArray167[--anInt3264];
				local248 = Static118.method2045(local15);
				if (local248 != null) {
					anIntArray167[anInt3264++] = 1;
					if (arg1) {
						aClass20_8 = local248;
						return;
					}
					aClass20_7 = local248;
					return;
				}
				anIntArray167[anInt3264++] = 0;
				return;
			}
			if (arg0 == 202 || arg0 == 204) {
				if (arg0 == 202) {
					local21 = anIntArray167[--anInt3264];
					local220 = Static118.method2045(local21);
				} else {
					local220 = arg1 ? aClass20_8 : aClass20_7;
				}
				method2822(local220);
				return;
			}
			if (arg0 == 203 || arg0 == 205) {
				if (arg0 == 203) {
					local21 = anIntArray167[--anInt3264];
					local220 = Static118.method2045(local21);
				} else {
					local220 = arg1 ? aClass20_8 : aClass20_7;
				}
				method2815(local220);
				return;
			}
		} else {
			@Pc(506) int local506;
			@Pc(575) boolean local575;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt3264 -= 2;
					local15 = anIntArray167[anInt3264];
					local21 = anIntArray167[anInt3264 + 1];
					if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass236_1 == null) {
						return;
					}
					for (local27 = 0; local27 < Static223.anIntArray231.length; local27++) {
						if (Static223.anIntArray231[local27] == local15) {
							Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass236_1.method5752(local27, Static208.aClass29_2, local21);
							return;
						}
					}
					for (local506 = 0; local506 < Static210.anIntArray191.length; local506++) {
						if (Static210.anIntArray191[local506] == local15) {
							Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass236_1.method5752(local506, Static208.aClass29_2, local21);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt3264 -= 2;
					local15 = anIntArray167[anInt3264];
					local21 = anIntArray167[anInt3264 + 1];
					if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass236_1 == null) {
						return;
					}
					Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass236_1.method5757(local15, local21);
					return;
				}
				if (arg0 == 410) {
					local575 = anIntArray167[--anInt3264] != 0;
					if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass236_1 == null) {
						return;
					}
					Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass236_1.method5750(local575);
					return;
				}
				if (arg0 == 411) {
					anInt3264 -= 2;
					local15 = anIntArray167[anInt3264];
					local21 = anIntArray167[anInt3264 + 1];
					if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass236_1 == null) {
						return;
					}
					Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass236_1.method5758(local21, local15, Static243.aClass406_2);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1791) String local1791;
				@Pc(1394) String local1394;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local220 = Static118.method2045(anIntArray167[--anInt3264]);
					} else {
						local220 = arg1 ? aClass20_8 : aClass20_7;
					}
					if (arg0 == 1100) {
						anInt3264 -= 2;
						local220.anInt537 = anIntArray167[anInt3264];
						if (local220.anInt537 > local220.anInt580 - local220.anInt509) {
							local220.anInt537 = local220.anInt580 - local220.anInt509;
						}
						if (local220.anInt537 < 0) {
							local220.anInt537 = 0;
						}
						local220.anInt554 = anIntArray167[anInt3264 + 1];
						if (local220.anInt554 > local220.anInt571 - local220.anInt569) {
							local220.anInt554 = local220.anInt571 - local220.anInt569;
						}
						if (local220.anInt554 < 0) {
							local220.anInt554 = 0;
						}
						Static391.method5905(local220);
						if (local220.anInt583 == -1) {
							Static523.method7450(local220.anInt600);
						}
						return;
					}
					if (arg0 == 1101) {
						local220.anInt540 = anIntArray167[--anInt3264];
						Static391.method5905(local220);
						if (local220.anInt583 == -1) {
							Static120.method2068(local220.anInt600);
						}
						return;
					}
					if (arg0 == 1102) {
						local220.aBoolean33 = anIntArray167[--anInt3264] == 1;
						Static391.method5905(local220);
						return;
					}
					if (arg0 == 1103) {
						local220.anInt576 = anIntArray167[--anInt3264];
						Static391.method5905(local220);
						return;
					}
					if (arg0 == 1104) {
						local220.anInt517 = anIntArray167[--anInt3264];
						Static391.method5905(local220);
						return;
					}
					if (arg0 == 1105) {
						local21 = anIntArray167[--anInt3264];
						if (local220.anInt547 != local21) {
							local220.anInt547 = local21;
							Static391.method5905(local220);
						}
						if (local220.anInt583 == -1) {
							Static147.method2423(local220.anInt600);
						}
						return;
					}
					if (arg0 == 1106) {
						local220.anInt577 = anIntArray167[--anInt3264];
						Static391.method5905(local220);
						return;
					}
					if (arg0 == 1107) {
						local220.aBoolean45 = anIntArray167[--anInt3264] == 1;
						Static391.method5905(local220);
						return;
					}
					if (arg0 == 1108) {
						local220.anInt568 = 1;
						local220.anInt520 = anIntArray167[--anInt3264];
						Static391.method5905(local220);
						if (local220.anInt583 == -1) {
							Static613.method8358(local220.anInt600);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt3264 -= 6;
						local220.anInt588 = anIntArray167[anInt3264];
						local220.anInt531 = anIntArray167[anInt3264 + 1];
						local220.anInt511 = anIntArray167[anInt3264 + 2];
						local220.anInt573 = anIntArray167[anInt3264 + 3];
						local220.anInt523 = anIntArray167[anInt3264 + 4];
						local220.anInt508 = anIntArray167[anInt3264 + 5];
						Static391.method5905(local220);
						if (local220.anInt583 == -1) {
							Static210.method3121(local220.anInt600);
							Static1.method7204(local220.anInt600);
						}
						return;
					}
					if (arg0 == 1110) {
						local21 = anIntArray167[--anInt3264];
						if (local21 != local220.anInt538) {
							if (local21 == -1) {
								local220.aClass100_1 = null;
							} else {
								if (local220.aClass100_1 == null) {
									local220.aClass100_1 = new Class100_Sub2();
								}
								local220.aClass100_1.method8962(local21);
							}
							local220.anInt538 = local21;
							Static391.method5905(local220);
						}
						if (local220.anInt583 == -1) {
							Static633.method2951(local220.anInt600);
						}
						return;
					}
					if (arg0 == 1111) {
						local220.aBoolean48 = anIntArray167[--anInt3264] == 1;
						Static391.method5905(local220);
						return;
					}
					if (arg0 == 1112) {
						local1394 = aStringArray12[--anInt3275];
						if (!local1394.equals(local220.aString7)) {
							local220.aString7 = local1394;
							Static391.method5905(local220);
						}
						if (local220.anInt583 == -1) {
							Static657.method8788(local220.anInt600);
						}
						return;
					}
					if (arg0 == 1113) {
						local220.anInt591 = anIntArray167[--anInt3264];
						Static391.method5905(local220);
						if (local220.anInt583 == -1) {
							Static590.method8096(local220.anInt600);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt3264 -= 3;
						local220.anInt545 = anIntArray167[anInt3264];
						local220.anInt598 = anIntArray167[anInt3264 + 1];
						local220.anInt585 = anIntArray167[anInt3264 + 2];
						Static391.method5905(local220);
						return;
					}
					if (arg0 == 1115) {
						local220.aBoolean30 = anIntArray167[--anInt3264] == 1;
						Static391.method5905(local220);
						return;
					}
					if (arg0 == 1116) {
						local220.anInt584 = anIntArray167[--anInt3264];
						Static391.method5905(local220);
						return;
					}
					if (arg0 == 1117) {
						local220.anInt578 = anIntArray167[--anInt3264];
						Static391.method5905(local220);
						return;
					}
					if (arg0 == 1118) {
						local220.aBoolean29 = anIntArray167[--anInt3264] == 1;
						Static391.method5905(local220);
						return;
					}
					if (arg0 == 1119) {
						local220.aBoolean35 = anIntArray167[--anInt3264] == 1;
						Static391.method5905(local220);
						return;
					}
					if (arg0 == 1120) {
						anInt3264 -= 2;
						local220.anInt580 = anIntArray167[anInt3264];
						local220.anInt571 = anIntArray167[anInt3264 + 1];
						Static391.method5905(local220);
						if (local220.anInt532 == 0) {
							Static97.method1292(false, local220);
						}
						return;
					}
					if (arg0 == 1122) {
						local220.aBoolean31 = anIntArray167[--anInt3264] == 1;
						Static391.method5905(local220);
						return;
					}
					if (arg0 == 1123) {
						local220.anInt508 = anIntArray167[--anInt3264];
						Static391.method5905(local220);
						if (local220.anInt583 == -1) {
							Static210.method3121(local220.anInt600);
						}
						return;
					}
					if (arg0 == 1124) {
						local21 = anIntArray167[--anInt3264];
						local220.aBoolean40 = local21 == 1;
						Static391.method5905(local220);
						return;
					}
					if (arg0 == 1125) {
						anInt3264 -= 2;
						local220.anInt519 = anIntArray167[anInt3264];
						local220.anInt561 = anIntArray167[anInt3264 + 1];
						Static391.method5905(local220);
						return;
					}
					if (arg0 == 1126) {
						local220.anInt534 = anIntArray167[--anInt3264];
						Static391.method5905(local220);
						return;
					}
					@Pc(1756) Class319 local1756;
					if (arg0 == 1127) {
						anInt3264 -= 2;
						local21 = anIntArray167[anInt3264];
						local27 = anIntArray167[anInt3264 + 1];
						local1756 = Static646.aClass106_1.method2677(local21);
						if (local27 != local1756.anInt9232) {
							local220.method462(local27, local21);
							return;
						}
						local220.method468(local21);
						return;
					}
					if (arg0 == 1128) {
						local21 = anIntArray167[--anInt3264];
						local1791 = aStringArray12[--anInt3275];
						local1756 = Static646.aClass106_1.method2677(local21);
						if (!local1756.aString121.equals(local1791)) {
							local220.method458(local21, local1791);
							return;
						}
						local220.method468(local21);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local21 = anIntArray167[--anInt3264];
						if ((local220.anInt532 == 5 || arg0 != 1129) && (local220.anInt532 == 4 || arg0 != 1130)) {
							if (local220.anInt557 != local21) {
								local220.anInt557 = local21;
								Static391.method5905(local220);
							}
							if (local220.anInt583 == -1) {
								Static64.method800(local220.anInt600);
							}
							return;
						}
						return;
					}
					@Pc(1899) short local1899;
					@Pc(1892) short local1892;
					if (arg0 == 1131) {
						anInt3264 -= 3;
						local21 = anIntArray167[anInt3264];
						local1892 = (short) anIntArray167[anInt3264 + 1];
						local1899 = (short) anIntArray167[anInt3264 + 2];
						if (local21 >= 0 && local21 < 5) {
							local220.method463(local1899, local1892, local21);
							Static391.method5905(local220);
							if (local220.anInt583 == -1) {
								Static675.method8935(local21, local220.anInt600);
							}
							return;
						}
						return;
					}
					if (arg0 == 1132) {
						anInt3264 -= 3;
						local21 = anIntArray167[anInt3264];
						local1892 = (short) anIntArray167[anInt3264 + 1];
						local1899 = (short) anIntArray167[anInt3264 + 2];
						if (local21 >= 0 && local21 < 5) {
							local220.method455(local1892, local21, local1899);
							Static391.method5905(local220);
							if (local220.anInt583 == -1) {
								Static674.method8919(local21, local220.anInt600);
							}
							return;
						}
						return;
					}
					if (arg0 == 1133) {
						local220.aBoolean43 = anIntArray167[--anInt3264] == 1;
						Static391.method5905(local220);
						if (local220.anInt583 == -1) {
							Static198.method2984(local220.anInt600);
						}
						return;
					}
					if (arg0 == 1134) {
						anInt3264 -= 2;
						local21 = anIntArray167[anInt3264];
						local27 = anIntArray167[anInt3264 + 1];
						local1756 = Static646.aClass106_1.method2677(local21);
						if (local27 != local1756.anInt9232) {
							local220.method462(local27, local21);
							return;
						}
						local220.method468(local21);
						return;
					}
					if (arg0 == 1135) {
						local220.aBoolean46 = anIntArray167[--anInt3264] == 1;
						Static391.method5905(local220);
						if (local220.anInt583 == -1) {
							Static108.method1950(local220.anInt600);
						}
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local220 = Static118.method2045(anIntArray167[--anInt3264]);
					} else {
						local220 = arg1 ? aClass20_8 : aClass20_7;
					}
					Static391.method5905(local220);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt3264 -= 2;
						local21 = anIntArray167[anInt3264];
						local27 = anIntArray167[anInt3264 + 1];
						if (local220.anInt583 == -1) {
							Static521.method7423(local220.anInt600);
							Static210.method3121(local220.anInt600);
							Static1.method7204(local220.anInt600);
						}
						if (local21 == -1) {
							local220.anInt568 = 1;
							local220.anInt520 = -1;
							local220.anInt595 = -1;
							return;
						}
						local220.anInt595 = local21;
						local220.anInt593 = local27;
						if (arg0 == 1208 || arg0 == 1209) {
							local220.aBoolean34 = true;
						} else {
							local220.aBoolean34 = false;
						}
						@Pc(2236) Class91 local2236 = Static243.aClass406_2.method9394(local21);
						local220.anInt511 = local2236.anInt2685;
						local220.anInt573 = local2236.anInt2688;
						local220.anInt523 = local2236.anInt2708;
						local220.anInt588 = local2236.anInt2704;
						local220.anInt531 = local2236.anInt2726;
						local220.anInt508 = local2236.anInt2687;
						if (arg0 == 1205 || arg0 == 1209) {
							local220.anInt596 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local220.anInt596 = 1;
						} else {
							local220.anInt596 = 2;
						}
						if (local220.anInt550 > 0) {
							local220.anInt508 = local220.anInt508 * 32 / local220.anInt550;
							return;
						}
						if (local220.anInt592 > 0) {
							local220.anInt508 = local220.anInt508 * 32 / local220.anInt592;
						}
						return;
					}
					if (arg0 == 1201) {
						local220.anInt568 = 2;
						local220.anInt520 = anIntArray167[--anInt3264];
						if (local220.anInt583 == -1) {
							Static613.method8358(local220.anInt600);
						}
						return;
					}
					if (arg0 == 1202) {
						local220.anInt568 = 3;
						local220.anInt520 = -1;
						if (local220.anInt583 == -1) {
							Static613.method8358(local220.anInt600);
						}
						return;
					}
					if (arg0 == 1203) {
						local220.anInt568 = 6;
						local220.anInt520 = anIntArray167[--anInt3264];
						if (local220.anInt583 == -1) {
							Static613.method8358(local220.anInt600);
						}
						return;
					}
					if (arg0 == 1204) {
						local220.anInt568 = 5;
						local220.anInt520 = anIntArray167[--anInt3264];
						if (local220.anInt583 == -1) {
							Static613.method8358(local220.anInt600);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt3264 -= 4;
						local220.anInt541 = anIntArray167[anInt3264];
						local220.anInt582 = anIntArray167[anInt3264 + 1];
						local220.anInt594 = anIntArray167[anInt3264 + 2];
						local220.anInt549 = anIntArray167[anInt3264 + 3];
						Static391.method5905(local220);
						return;
					}
					if (arg0 == 1207) {
						anInt3264 -= 2;
						local220.anInt553 = anIntArray167[anInt3264];
						local220.lb = anIntArray167[anInt3264 + 1];
						Static391.method5905(local220);
						return;
					}
					if (arg0 == 1210) {
						anInt3264 -= 4;
						local220.anInt520 = anIntArray167[anInt3264];
						local220.anInt570 = anIntArray167[anInt3264 + 1];
						if (anIntArray167[anInt3264 + 2] == 1) {
							local220.anInt568 = 9;
						} else {
							local220.anInt568 = 8;
						}
						if (anIntArray167[anInt3264 + 3] == 1) {
							local220.aBoolean34 = true;
						} else {
							local220.aBoolean34 = false;
						}
						if (local220.anInt583 == -1) {
							Static613.method8358(local220.anInt600);
						}
						return;
					}
					if (arg0 == 1211) {
						local220.anInt568 = 5;
						local220.anInt520 = Static584.anInt9539;
						local220.anInt570 = 0;
						if (local220.anInt583 == -1) {
							Static613.method8358(local220.anInt600);
						}
						return;
					}
				} else {
					@Pc(2978) int local2978;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local220 = Static118.method2045(anIntArray167[--anInt3264]);
							} else {
								local220 = arg1 ? aClass20_8 : aClass20_7;
							}
							if (arg0 == 1499) {
								local220.method460();
								return;
							}
							local1394 = aStringArray12[--anInt3275];
							@Pc(3077) int[] local3077 = null;
							if (local1394.length() > 0 && local1394.charAt(local1394.length() - 1) == 'Y') {
								local506 = anIntArray167[--anInt3264];
								if (local506 > 0) {
									local3077 = new int[local506];
									while (local506-- > 0) {
										local3077[local506] = anIntArray167[--anInt3264];
									}
								}
								local1394 = local1394.substring(0, local1394.length() - 1);
							}
							@Pc(3131) Object[] local3131 = new Object[local1394.length() + 1];
							for (local2978 = local3131.length - 1; local2978 >= 1; local2978--) {
								if (local1394.charAt(local2978 - 1) == 's') {
									local3131[local2978] = aStringArray12[--anInt3275];
								} else if (local1394.charAt(local2978 - 1) == '§') {
									local3131[local2978] = Long.valueOf(aLongArray5[--anInt3262]);
								} else {
									local3131[local2978] = Integer.valueOf(anIntArray167[--anInt3264]);
								}
							}
							local72 = anIntArray167[--anInt3264];
							if (local72 == -1) {
								local3131 = null;
							} else {
								local3131[0] = Integer.valueOf(local72);
							}
							if (arg0 == 1400) {
								local220.anObjectArray10 = local3131;
							} else if (arg0 == 1401) {
								local220.anObjectArray25 = local3131;
							} else if (arg0 == 1402) {
								local220.anObjectArray20 = local3131;
							} else if (arg0 == 1403) {
								local220.anObjectArray27 = local3131;
							} else if (arg0 == 1404) {
								local220.anObjectArray9 = local3131;
							} else if (arg0 == 1405) {
								local220.anObjectArray4 = local3131;
							} else if (arg0 == 1406) {
								local220.anObjectArray28 = local3131;
							} else if (arg0 == 1407) {
								local220.anObjectArray8 = local3131;
								local220.anIntArray26 = local3077;
							} else if (arg0 == 1408) {
								local220.anObjectArray23 = local3131;
							} else if (arg0 == 1409) {
								local220.anObjectArray30 = local3131;
							} else if (arg0 == 1410) {
								local220.anObjectArray34 = local3131;
							} else if (arg0 == 1411) {
								local220.anObjectArray19 = local3131;
							} else if (arg0 == 1412) {
								local220.anObjectArray35 = local3131;
							} else if (arg0 == 1414) {
								local220.anObjectArray14 = local3131;
								local220.anIntArray33 = local3077;
							} else if (arg0 == 1415) {
								local220.anObjectArray7 = local3131;
								local220.anIntArray28 = local3077;
							} else if (arg0 == 1416) {
								local220.anObjectArray24 = local3131;
							} else if (arg0 == 1417) {
								local220.anObjectArray22 = local3131;
							} else if (arg0 == 1418) {
								local220.anObjectArray2 = local3131;
							} else if (arg0 == 1419) {
								local220.anObjectArray33 = local3131;
							} else if (arg0 == 1420) {
								local220.anObjectArray11 = local3131;
							} else if (arg0 == 1421) {
								local220.anObjectArray31 = local3131;
							} else if (arg0 == 1422) {
								local220.anObjectArray3 = local3131;
							} else if (arg0 == 1423) {
								local220.anObjectArray12 = local3131;
							} else if (arg0 == 1424) {
								local220.anObjectArray16 = local3131;
							} else if (arg0 == 1425) {
								local220.anObjectArray26 = local3131;
							} else if (arg0 == 1426) {
								local220.anObjectArray6 = local3131;
							} else if (arg0 == 1427) {
								local220.anObjectArray29 = local3131;
							} else if (arg0 == 1428) {
								local220.anObjectArray21 = local3131;
								local220.anIntArray31 = local3077;
							} else if (arg0 == 1429) {
								local220.anObjectArray32 = local3131;
								local220.anIntArray30 = local3077;
							} else if (arg0 == 1430) {
								local220.anObjectArray17 = local3131;
							} else if (arg0 == 1431) {
								local220.anObjectArray13 = local3131;
							} else if (arg0 == 1432) {
								local220.anObjectArray15 = local3131;
							} else if (arg0 == 1433) {
								local220.anObjectArray5 = local3131;
							}
							local220.aBoolean36 = true;
							return;
						}
						if (arg0 < 1600) {
							local220 = arg1 ? aClass20_8 : aClass20_7;
							if (arg0 == 1500) {
								anIntArray167[anInt3264++] = local220.anInt524;
								return;
							}
							if (arg0 == 1501) {
								anIntArray167[anInt3264++] = local220.anInt574;
								return;
							}
							if (arg0 == 1502) {
								anIntArray167[anInt3264++] = local220.anInt509;
								return;
							}
							if (arg0 == 1503) {
								anIntArray167[anInt3264++] = local220.anInt569;
								return;
							}
							if (arg0 == 1504) {
								anIntArray167[anInt3264++] = local220.aBoolean42 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray167[anInt3264++] = local220.anInt556;
								return;
							}
							if (arg0 == 1506) {
								local248 = Static55.method716(local220);
								anIntArray167[anInt3264++] = local248 == null ? -1 : local248.anInt600;
								return;
							}
							if (arg0 == 1507) {
								anIntArray167[anInt3264++] = local220.anInt540;
								return;
							}
						} else {
							@Pc(3848) Class319 local3848;
							if (arg0 < 1700) {
								local220 = arg1 ? aClass20_8 : aClass20_7;
								if (arg0 == 1600) {
									anIntArray167[anInt3264++] = local220.anInt537;
									return;
								}
								if (arg0 == 1601) {
									anIntArray167[anInt3264++] = local220.anInt554;
									return;
								}
								if (arg0 == 1602) {
									aStringArray12[anInt3275++] = local220.aString7;
									return;
								}
								if (arg0 == 1603) {
									anIntArray167[anInt3264++] = local220.anInt580;
									return;
								}
								if (arg0 == 1604) {
									anIntArray167[anInt3264++] = local220.anInt571;
									return;
								}
								if (arg0 == 1605) {
									anIntArray167[anInt3264++] = local220.anInt508;
									return;
								}
								if (arg0 == 1606) {
									anIntArray167[anInt3264++] = local220.anInt511;
									return;
								}
								if (arg0 == 1607) {
									anIntArray167[anInt3264++] = local220.anInt523;
									return;
								}
								if (arg0 == 1608) {
									anIntArray167[anInt3264++] = local220.anInt573;
									return;
								}
								if (arg0 == 1609) {
									anIntArray167[anInt3264++] = local220.anInt576;
									return;
								}
								if (arg0 == 1610) {
									anIntArray167[anInt3264++] = local220.anInt588;
									return;
								}
								if (arg0 == 1611) {
									anIntArray167[anInt3264++] = local220.anInt531;
									return;
								}
								if (arg0 == 1612) {
									anIntArray167[anInt3264++] = local220.anInt547;
									return;
								}
								if (arg0 == 1613) {
									local21 = anIntArray167[--anInt3264];
									local3848 = Static646.aClass106_1.method2677(local21);
									if (local3848.method7779()) {
										aStringArray12[anInt3275++] = local220.method465(local21, local3848.aString121);
										return;
									}
									anIntArray167[anInt3264++] = local220.method456(local21, local3848.anInt9232);
									return;
								}
								if (arg0 == 1614) {
									anIntArray167[anInt3264++] = local220.anInt577;
									return;
								}
								if (arg0 == 2614) {
									anIntArray167[anInt3264++] = local220.anInt568 == 1 ? local220.anInt520 : -1;
									return;
								}
							} else if (arg0 < 1800) {
								local220 = arg1 ? aClass20_8 : aClass20_7;
								if (arg0 == 1700) {
									anIntArray167[anInt3264++] = local220.anInt595;
									return;
								}
								if (arg0 == 1701) {
									if (local220.anInt595 != -1) {
										anIntArray167[anInt3264++] = local220.anInt593;
										return;
									}
									anIntArray167[anInt3264++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray167[anInt3264++] = local220.anInt583;
									return;
								}
							} else if (arg0 < 1900) {
								local220 = arg1 ? aClass20_8 : aClass20_7;
								if (arg0 == 1800) {
									anIntArray167[anInt3264++] = Static87.method1164(local220).method4617();
									return;
								}
								if (arg0 == 1801) {
									local21 = anIntArray167[--anInt3264];
									local21--;
									if (local220.aStringArray2 != null && local21 < local220.aStringArray2.length && local220.aStringArray2[local21] != null) {
										aStringArray12[anInt3275++] = local220.aStringArray2[local21];
										return;
									}
									aStringArray12[anInt3275++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local220.aString8 == null) {
										aStringArray12[anInt3275++] = "";
										return;
									}
									aStringArray12[anInt3275++] = local220.aString8;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local220 = Static118.method2045(anIntArray167[--anInt3264]);
									arg0 -= 1000;
								} else {
									local220 = arg1 ? aClass20_8 : aClass20_7;
								}
								if (anInt3277 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local220.anObjectArray29 == null) {
										return;
									}
									@Pc(4155) Class3_Sub7 local4155 = new Class3_Sub7();
									local4155.aClass20_2 = local220;
									local4155.anObjectArray1 = local220.anObjectArray29;
									local4155.anInt371 = anInt3277 + 1;
									Static102.aClass357_6.method8401(local4155);
									return;
								}
							} else if (arg0 < 2600) {
								local220 = Static118.method2045(anIntArray167[--anInt3264]);
								if (arg0 == 2500) {
									anIntArray167[anInt3264++] = local220.anInt524;
									return;
								}
								if (arg0 == 2501) {
									anIntArray167[anInt3264++] = local220.anInt574;
									return;
								}
								if (arg0 == 2502) {
									anIntArray167[anInt3264++] = local220.anInt509;
									return;
								}
								if (arg0 == 2503) {
									anIntArray167[anInt3264++] = local220.anInt569;
									return;
								}
								if (arg0 == 2504) {
									anIntArray167[anInt3264++] = local220.aBoolean42 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray167[anInt3264++] = local220.anInt556;
									return;
								}
								if (arg0 == 2506) {
									local248 = Static55.method716(local220);
									anIntArray167[anInt3264++] = local248 == null ? -1 : local248.anInt600;
									return;
								}
								if (arg0 == 2507) {
									anIntArray167[anInt3264++] = local220.anInt540;
									return;
								}
							} else if (arg0 < 2700) {
								local220 = Static118.method2045(anIntArray167[--anInt3264]);
								if (arg0 == 2600) {
									anIntArray167[anInt3264++] = local220.anInt537;
									return;
								}
								if (arg0 == 2601) {
									anIntArray167[anInt3264++] = local220.anInt554;
									return;
								}
								if (arg0 == 2602) {
									aStringArray12[anInt3275++] = local220.aString7;
									return;
								}
								if (arg0 == 2603) {
									anIntArray167[anInt3264++] = local220.anInt580;
									return;
								}
								if (arg0 == 2604) {
									anIntArray167[anInt3264++] = local220.anInt571;
									return;
								}
								if (arg0 == 2605) {
									anIntArray167[anInt3264++] = local220.anInt508;
									return;
								}
								if (arg0 == 2606) {
									anIntArray167[anInt3264++] = local220.anInt511;
									return;
								}
								if (arg0 == 2607) {
									anIntArray167[anInt3264++] = local220.anInt523;
									return;
								}
								if (arg0 == 2608) {
									anIntArray167[anInt3264++] = local220.anInt573;
									return;
								}
								if (arg0 == 2609) {
									anIntArray167[anInt3264++] = local220.anInt576;
									return;
								}
								if (arg0 == 2610) {
									anIntArray167[anInt3264++] = local220.anInt588;
									return;
								}
								if (arg0 == 2611) {
									anIntArray167[anInt3264++] = local220.anInt531;
									return;
								}
								if (arg0 == 2612) {
									anIntArray167[anInt3264++] = local220.anInt547;
									return;
								}
								if (arg0 == 2613) {
									anIntArray167[anInt3264++] = local220.anInt577;
									return;
								}
								if (arg0 == 2614) {
									anIntArray167[anInt3264++] = local220.anInt568 == 1 ? local220.anInt520 : -1;
									return;
								}
							} else {
								@Pc(4732) Class3_Sub52 local4732;
								@Pc(4625) Class3_Sub52 local4625;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local220 = Static118.method2045(anIntArray167[--anInt3264]);
										anIntArray167[anInt3264++] = local220.anInt595;
										return;
									}
									if (arg0 == 2701) {
										local220 = Static118.method2045(anIntArray167[--anInt3264]);
										if (local220.anInt595 == -1) {
											anIntArray167[anInt3264++] = 0;
											return;
										} else {
											anIntArray167[anInt3264++] = local220.anInt593;
											return;
										}
									}
									if (arg0 == 2702) {
										local15 = anIntArray167[--anInt3264];
										local4625 = (Class3_Sub52) Static170.aClass136_19.method3503((long) local15);
										if (local4625 != null) {
											anIntArray167[anInt3264++] = 1;
											return;
										}
										anIntArray167[anInt3264++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local220 = Static118.method2045(anIntArray167[--anInt3264]);
										if (local220.aClass20Array1 == null) {
											anIntArray167[anInt3264++] = 0;
											return;
										}
										local21 = local220.aClass20Array1.length;
										for (local27 = 0; local27 < local220.aClass20Array1.length; local27++) {
											if (local220.aClass20Array1[local27] == null) {
												local21 = local27;
												break;
											}
										}
										anIntArray167[anInt3264++] = local21;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt3264 -= 2;
										local15 = anIntArray167[anInt3264];
										local21 = anIntArray167[anInt3264 + 1];
										local4732 = (Class3_Sub52) Static170.aClass136_19.method3503((long) local15);
										if (local4732 != null && local4732.anInt10202 == local21) {
											anIntArray167[anInt3264++] = 1;
											return;
										}
										anIntArray167[anInt3264++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local220 = Static118.method2045(anIntArray167[--anInt3264]);
									if (arg0 == 2800) {
										anIntArray167[anInt3264++] = Static87.method1164(local220).method4617();
										return;
									}
									if (arg0 == 2801) {
										local21 = anIntArray167[--anInt3264];
										local21--;
										if (local220.aStringArray2 != null && local21 < local220.aStringArray2.length && local220.aStringArray2[local21] != null) {
											aStringArray12[anInt3275++] = local220.aStringArray2[local21];
											return;
										}
										aStringArray12[anInt3275++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local220.aString8 == null) {
											aStringArray12[anInt3275++] = "";
											return;
										}
										aStringArray12[anInt3275++] = local220.aString8;
										return;
									}
								} else {
									@Pc(4977) Class3_Sub48 local4977;
									@Pc(4883) String local4883;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local4883 = aStringArray12[--anInt3275];
											Static295.method4572(local4883);
											return;
										}
										if (arg0 == 3101) {
											anInt3264 -= 2;
											Static329.method4895(anIntArray167[anInt3264], Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2, anIntArray167[anInt3264 + 1]);
											return;
										}
										if (arg0 == 3103) {
											Static533.method7506();
											return;
										}
										if (arg0 == 3104) {
											local4883 = aStringArray12[--anInt3275];
											local21 = 0;
											if (Static399.method5982(local4883)) {
												local21 = Static349.method5057(local4883);
											}
											@Pc(4946) Class3_Sub48 local4946 = Static89.method1200(Static629.aClass286_115, Static532.aClass400_3.aClass399_2);
											local4946.aClass3_Sub28_Sub2_1.method5311(local21);
											Static532.aClass400_3.method9223(local4946);
											return;
										}
										if (arg0 == 3105) {
											local4883 = aStringArray12[--anInt3275];
											local4977 = Static89.method1200(Static159.aClass286_29, Static532.aClass400_3.aClass399_2);
											local4977.aClass3_Sub28_Sub2_1.method5329(local4883.length() + 1);
											local4977.aClass3_Sub28_Sub2_1.method5283(local4883);
											Static532.aClass400_3.method9223(local4977);
											return;
										}
										if (arg0 == 3106) {
											local4883 = aStringArray12[--anInt3275];
											local4977 = Static89.method1200(Static582.aClass286_117, Static532.aClass400_3.aClass399_2);
											local4977.aClass3_Sub28_Sub2_1.method5329(local4883.length() + 1);
											local4977.aClass3_Sub28_Sub2_1.method5283(local4883);
											Static532.aClass400_3.method9223(local4977);
											return;
										}
										if (arg0 == 3107) {
											local15 = anIntArray167[--anInt3264];
											local1394 = aStringArray12[--anInt3275];
											Static505.method7236(local15, local1394);
											return;
										}
										if (arg0 == 3108) {
											anInt3264 -= 3;
											local15 = anIntArray167[anInt3264];
											local21 = anIntArray167[anInt3264 + 1];
											local27 = anIntArray167[anInt3264 + 2];
											local38 = Static118.method2045(local27);
											Static448.method6653(local38, local21, local15);
											return;
										}
										if (arg0 == 3109) {
											anInt3264 -= 2;
											local15 = anIntArray167[anInt3264];
											local21 = anIntArray167[anInt3264 + 1];
											local303 = arg1 ? aClass20_8 : aClass20_7;
											Static448.method6653(local303, local21, local15);
											return;
										}
										if (arg0 == 3110) {
											local15 = anIntArray167[--anInt3264];
											local4977 = Static89.method1200(Static563.aClass286_98, Static532.aClass400_3.aClass399_2);
											local4977.aClass3_Sub28_Sub2_1.method5282(local15);
											Static532.aClass400_3.method9223(local4977);
											return;
										}
										if (arg0 == 3111) {
											anInt3264 -= 2;
											local15 = anIntArray167[anInt3264];
											local21 = anIntArray167[anInt3264 + 1];
											local4732 = (Class3_Sub52) Static170.aClass136_19.method3503((long) local15);
											if (local4732 != null) {
												Static65.method813(local4732.anInt10202 != local21, true, local4732);
											}
											Static596.method8207(true, local15, local21, 3);
											return;
										}
										if (arg0 == 3112) {
											anInt3264--;
											local15 = anIntArray167[anInt3264];
											local4625 = (Class3_Sub52) Static170.aClass136_19.method3503((long) local15);
											if (local4625 != null && local4625.anInt10201 == 3) {
												Static65.method813(true, true, local4625);
											}
											return;
										}
										if (arg0 == 3113) {
											Static292.method4413(aStringArray12[--anInt3275]);
											return;
										}
										if (arg0 == 3114) {
											anInt3264 -= 2;
											local15 = anIntArray167[anInt3264];
											local21 = anIntArray167[anInt3264 + 1];
											local1791 = aStringArray12[--anInt3275];
											Static170.method2681("", local15, local21, local1791, "", "");
											return;
										}
										if (arg0 == 3115) {
											anInt3264 -= 11;
											@Pc(5292) Class304[] local5292 = Static24.method9444();
											@Pc(5295) Class216[] local5295 = Static133.method2912();
											Static490.method7107(local5295[anIntArray167[anInt3264 + 1]], anIntArray167[anInt3264 + 7], anIntArray167[anInt3264 + 3], local5292[anIntArray167[anInt3264]], anIntArray167[anInt3264 + 8], anIntArray167[anInt3264 + 6], anIntArray167[anInt3264 + 9], anIntArray167[anInt3264 + 2], anIntArray167[anInt3264 + 4], anIntArray167[anInt3264 + 5], anIntArray167[anInt3264 + 10]);
											return;
										}
										if (arg0 == 3116) {
											local15 = anIntArray167[--anInt3264];
											local4977 = Static89.method1200(Static694.aClass286_126, Static532.aClass400_3.aClass399_2);
											local4977.aClass3_Sub28_Sub2_1.method5282(local15);
											Static532.aClass400_3.method9223(local4977);
											return;
										}
										if (arg0 == 3117) {
											local4883 = aStringArray12[--anInt3275];
											local4977 = Static89.method1200(Static54.aClass286_105, Static532.aClass400_3.aClass399_2);
											local4977.aClass3_Sub28_Sub2_1.method5329(local4883.length() + 1);
											local4977.aClass3_Sub28_Sub2_1.method5283(local4883);
											Static532.aClass400_3.method9223(local4977);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt3264 -= 3;
											Static700.method9158(anIntArray167[anInt3264 + 1], anIntArray167[anInt3264], anIntArray167[anInt3264 + 2], 256, 255);
											return;
										}
										if (arg0 == 3201) {
											Static478.method7000(50, 255, anIntArray167[--anInt3264]);
											return;
										}
										if (arg0 == 3202) {
											anInt3264 -= 2;
											Static434.method5151(anIntArray167[anInt3264], anIntArray167[anInt3264 + 1], 255);
											return;
										}
										if (arg0 == 3203) {
											anInt3264 -= 4;
											Static700.method9158(anIntArray167[anInt3264 + 1], anIntArray167[anInt3264], anIntArray167[anInt3264 + 2], 256, anIntArray167[anInt3264 + 3]);
											return;
										}
										if (arg0 == 3204) {
											anInt3264 -= 3;
											Static478.method7000(anIntArray167[anInt3264 + 2], anIntArray167[anInt3264 + 1], anIntArray167[anInt3264]);
											return;
										}
										if (arg0 == 3205) {
											anInt3264 -= 3;
											Static434.method5151(anIntArray167[anInt3264], anIntArray167[anInt3264 + 1], anIntArray167[anInt3264 + 2]);
											return;
										}
										if (arg0 == 3206) {
											anInt3264 -= 4;
											Static146.method2412(256, anIntArray167[anInt3264 + 3], anIntArray167[anInt3264 + 2], false, anIntArray167[anInt3264 + 1], anIntArray167[anInt3264]);
											return;
										}
										if (arg0 == 3207) {
											anInt3264 -= 4;
											Static146.method2412(256, anIntArray167[anInt3264 + 3], anIntArray167[anInt3264 + 2], true, anIntArray167[anInt3264 + 1], anIntArray167[anInt3264]);
											return;
										}
										if (arg0 == 3208) {
											anInt3264 -= 5;
											Static700.method9158(anIntArray167[anInt3264 + 1], anIntArray167[anInt3264], anIntArray167[anInt3264 + 2], anIntArray167[anInt3264 + 4], anIntArray167[anInt3264 + 3]);
											return;
										}
										if (arg0 == 3209) {
											anInt3264 -= 5;
											Static146.method2412(anIntArray167[anInt3264 + 4], anIntArray167[anInt3264 + 3], anIntArray167[anInt3264 + 2], false, anIntArray167[anInt3264 + 1], anIntArray167[anInt3264]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray167[anInt3264++] = Static269.anInt4883;
											return;
										}
										if (arg0 == 3301) {
											anInt3264 -= 2;
											local15 = anIntArray167[anInt3264];
											local21 = anIntArray167[anInt3264 + 1];
											anIntArray167[anInt3264++] = Static324.method4820(false, local15, local21);
											return;
										}
										if (arg0 == 3302) {
											anInt3264 -= 2;
											local15 = anIntArray167[anInt3264];
											local21 = anIntArray167[anInt3264 + 1];
											anIntArray167[anInt3264++] = Static293.method4421(false, local21, local15);
											return;
										}
										if (arg0 == 3303) {
											anInt3264 -= 2;
											local15 = anIntArray167[anInt3264];
											local21 = anIntArray167[anInt3264 + 1];
											anIntArray167[anInt3264++] = Static139.method2322(local21, local15, false);
											return;
										}
										if (arg0 == 3304) {
											local15 = anIntArray167[--anInt3264];
											anIntArray167[anInt3264++] = Static156.aClass301_1.method7377(local15).anInt3511;
											return;
										}
										if (arg0 == 3305) {
											local15 = anIntArray167[--anInt3264];
											anIntArray167[anInt3264++] = Static296.anIntArray193[local15];
											return;
										}
										if (arg0 == 3306) {
											local15 = anIntArray167[--anInt3264];
											anIntArray167[anInt3264++] = Static427.anIntArray417[local15];
											return;
										}
										if (arg0 == 3307) {
											local15 = anIntArray167[--anInt3264];
											anIntArray167[anInt3264++] = Static373.anIntArray355[local15];
											return;
										}
										if (arg0 == 3308) {
											@Pc(5901) byte local5901 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146;
											local21 = (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11204 >> 9) + Static714.anInt11156;
											local27 = (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt11211 >> 9) + Static339.anInt5859;
											anIntArray167[anInt3264++] = (local5901 << 28) + (local21 << 14) + local27;
											return;
										}
										if (arg0 == 3309) {
											local15 = anIntArray167[--anInt3264];
											anIntArray167[anInt3264++] = local15 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local15 = anIntArray167[--anInt3264];
											anIntArray167[anInt3264++] = local15 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local15 = anIntArray167[--anInt3264];
											anIntArray167[anInt3264++] = local15 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray167[anInt3264++] = Static312.aBoolean458 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt3264 -= 2;
											local15 = anIntArray167[anInt3264];
											local21 = anIntArray167[anInt3264 + 1];
											anIntArray167[anInt3264++] = Static324.method4820(true, local15, local21);
											return;
										}
										if (arg0 == 3314) {
											anInt3264 -= 2;
											local15 = anIntArray167[anInt3264];
											local21 = anIntArray167[anInt3264 + 1];
											anIntArray167[anInt3264++] = Static293.method4421(true, local21, local15);
											return;
										}
										if (arg0 == 3315) {
											anInt3264 -= 2;
											local15 = anIntArray167[anInt3264];
											local21 = anIntArray167[anInt3264 + 1];
											anIntArray167[anInt3264++] = Static139.method2322(local21, local15, true);
											return;
										}
										if (arg0 == 3316) {
											if (Static651.anInt10450 >= 2) {
												anIntArray167[anInt3264++] = Static651.anInt10450;
												return;
											}
											anIntArray167[anInt3264++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray167[anInt3264++] = Static49.anInt834;
											return;
										}
										if (arg0 == 3318) {
											anIntArray167[anInt3264++] = Static272.aClass314_7.anInt9072;
											return;
										}
										if (arg0 == 3321) {
											anIntArray167[anInt3264++] = Static619.anInt11274;
											return;
										}
										if (arg0 == 3322) {
											anIntArray167[anInt3264++] = Static612.anInt9909;
											return;
										}
										if (arg0 == 3323) {
											if (Static78.anInt1225 >= 5 && Static78.anInt1225 <= 9) {
												anIntArray167[anInt3264++] = 1;
												return;
											}
											anIntArray167[anInt3264++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static78.anInt1225 >= 5 && Static78.anInt1225 <= 9) {
												anIntArray167[anInt3264++] = Static78.anInt1225;
												return;
											}
											anIntArray167[anInt3264++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray167[anInt3264++] = Static608.aBoolean714 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray167[anInt3264++] = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt7841;
											return;
										}
										if (arg0 == 3327) {
											anIntArray167[anInt3264++] = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass236_1 != null && Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass236_1.aBoolean538 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray167[anInt3264++] = Static553.aBoolean677 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local15 = anIntArray167[--anInt3264];
											anIntArray167[anInt3264++] = Static45.method613(local15);
											return;
										}
										if (arg0 == 3331) {
											anInt3264 -= 2;
											local15 = anIntArray167[anInt3264];
											local21 = anIntArray167[anInt3264 + 1];
											anIntArray167[anInt3264++] = Static284.method4285(false, local15, local21);
											return;
										}
										if (arg0 == 3332) {
											anInt3264 -= 2;
											local15 = anIntArray167[anInt3264];
											local21 = anIntArray167[anInt3264 + 1];
											anIntArray167[anInt3264++] = Static284.method4285(true, local15, local21);
											return;
										}
										if (arg0 == 3333) {
											anIntArray167[anInt3264++] = Static315.method8970();
											return;
										}
										if (arg0 == 3335) {
											anIntArray167[anInt3264++] = Static141.anInt2658;
											return;
										}
										if (arg0 == 3336) {
											anInt3264 -= 4;
											local15 = anIntArray167[anInt3264];
											local21 = anIntArray167[anInt3264 + 1];
											local27 = anIntArray167[anInt3264 + 2];
											local506 = anIntArray167[anInt3264 + 3];
											local15 += local21 << 14;
											local15 += local27 << 28;
											local15 += local506;
											anIntArray167[anInt3264++] = local15;
											return;
										}
										if (arg0 == 3337) {
											anIntArray167[anInt3264++] = Static721.anInt3580;
											return;
										}
										if (arg0 == 3338) {
											anIntArray167[anInt3264++] = Static209.method3109(115);
											return;
										}
										if (arg0 == 3339) {
											anIntArray167[anInt3264++] = 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray167[anInt3264++] = Static153.aBoolean230 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray167[anInt3264++] = Static391.aBoolean552 ? 1 : 0;
											return;
										}
										if (arg0 == 3342) {
											anIntArray167[anInt3264++] = Static714.aClass161_1.method8581();
											return;
										}
										if (arg0 == 3343) {
											anIntArray167[anInt3264++] = Static714.aClass161_1.method8573();
											return;
										}
										if (arg0 == 3344) {
											aStringArray12[anInt3275++] = Static635.method8599();
											return;
										}
										if (arg0 == 3345) {
											aStringArray12[anInt3275++] = Static322.method4800();
											return;
										}
										if (arg0 == 3346) {
											anIntArray167[anInt3264++] = Static84.method1075();
											return;
										}
										if (arg0 == 3347) {
											anIntArray167[anInt3264++] = Static383.anInt6847;
											return;
										}
										if (arg0 == 3349) {
											anIntArray167[anInt3264++] = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass340_7.method8085() >> 3;
											return;
										}
										if (arg0 == 3350) {
											local4883 = aStringArray12[--anInt3275];
											if (Static46.aString15 != null && Static46.aString15.equalsIgnoreCase(local4883)) {
												anIntArray167[anInt3264++] = 1;
												return;
											}
											anIntArray167[anInt3264++] = 0;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(6743) Class59 local6743;
										if (arg0 == 3400) {
											anInt3264 -= 2;
											local15 = anIntArray167[anInt3264];
											local21 = anIntArray167[anInt3264 + 1];
											local6743 = Static170.aClass191_1.method4685(local15);
											aStringArray12[anInt3275++] = local6743.method1295(local21);
											return;
										}
										if (arg0 == 3408) {
											anInt3264 -= 4;
											local15 = anIntArray167[anInt3264];
											local21 = anIntArray167[anInt3264 + 1];
											local27 = anIntArray167[anInt3264 + 2];
											local506 = anIntArray167[anInt3264 + 3];
											@Pc(6789) Class59 local6789 = Static170.aClass191_1.method4685(local27);
											if (local6789.aChar2 == local15 && local6789.aChar3 == local21) {
												if (local21 == 115) {
													aStringArray12[anInt3275++] = local6789.method1295(local506);
													return;
												}
												anIntArray167[anInt3264++] = local6789.method1294(local506);
												return;
											}
											throw new RuntimeException("C3408-1 " + local27 + "-" + local506);
										}
										if (arg0 == 3409) {
											anInt3264 -= 3;
											local15 = anIntArray167[anInt3264];
											local21 = anIntArray167[anInt3264 + 1];
											local27 = anIntArray167[anInt3264 + 2];
											if (local21 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(6884) Class59 local6884 = Static170.aClass191_1.method4685(local21);
											if (local6884.aChar3 != local15) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray167[anInt3264++] = local6884.method1287(local27) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local15 = anIntArray167[--anInt3264];
											local1394 = aStringArray12[--anInt3275];
											if (local15 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local6743 = Static170.aClass191_1.method4685(local15);
											if (local6743.aChar3 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray167[anInt3264++] = local6743.method1298(local1394) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local15 = anIntArray167[--anInt3264];
											@Pc(6993) Class59 local6993 = Static170.aClass191_1.method4685(local15);
											anIntArray167[anInt3264++] = local6993.method1301();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static502.anInt8591 == 0) {
												anIntArray167[anInt3264++] = -2;
												return;
											}
											if (Static502.anInt8591 == 1) {
												anIntArray167[anInt3264++] = -1;
												return;
											}
											anIntArray167[anInt3264++] = Static22.anInt373;
											return;
										}
										if (arg0 == 3601) {
											local15 = anIntArray167[--anInt3264];
											if (Static502.anInt8591 == 2 && local15 < Static22.anInt373) {
												aStringArray12[anInt3275++] = Static432.aStringArray29[local15];
												if (Static604.aStringArray38[local15] != null) {
													aStringArray12[anInt3275++] = Static604.aStringArray38[local15];
													return;
												}
												aStringArray12[anInt3275++] = "";
												return;
											}
											aStringArray12[anInt3275++] = "";
											aStringArray12[anInt3275++] = "";
											return;
										}
										if (arg0 == 3602) {
											local15 = anIntArray167[--anInt3264];
											if (Static502.anInt8591 == 2 && local15 < Static22.anInt373) {
												anIntArray167[anInt3264++] = Static161.anIntArray145[local15];
												return;
											}
											anIntArray167[anInt3264++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local15 = anIntArray167[--anInt3264];
											if (Static502.anInt8591 == 2 && local15 < Static22.anInt373) {
												anIntArray167[anInt3264++] = Static381.anIntArray371[local15];
												return;
											}
											anIntArray167[anInt3264++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local4883 = aStringArray12[--anInt3275];
											local21 = anIntArray167[--anInt3264];
											Static688.method332(local21, local4883);
											return;
										}
										if (arg0 == 3605) {
											local4883 = aStringArray12[--anInt3275];
											Static617.method8399(local4883);
											return;
										}
										if (arg0 == 3606) {
											local4883 = aStringArray12[--anInt3275];
											Static56.method717(local4883);
											return;
										}
										if (arg0 == 3607) {
											local4883 = aStringArray12[--anInt3275];
											Static38.method562(false, local4883);
											return;
										}
										if (arg0 == 3608) {
											local4883 = aStringArray12[--anInt3275];
											Static139.method2321(local4883);
											return;
										}
										if (arg0 == 3609) {
											local4883 = aStringArray12[--anInt3275];
											if (local4883.startsWith("<img=0>") || local4883.startsWith("<img=1>")) {
												local4883 = local4883.substring(7);
											}
											anIntArray167[anInt3264++] = Static12.method155(local4883) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local15 = anIntArray167[--anInt3264];
											if (Static502.anInt8591 == 2 && local15 < Static22.anInt373) {
												aStringArray12[anInt3275++] = Static359.aStringArray24[local15];
												return;
											}
											aStringArray12[anInt3275++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static657.aString127 != null) {
												aStringArray12[anInt3275++] = Static194.method2930(Static657.aString127);
												return;
											}
											aStringArray12[anInt3275++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static657.aString127 != null) {
												anIntArray167[anInt3264++] = Static621.anInt10020;
												return;
											}
											anIntArray167[anInt3264++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local15 = anIntArray167[--anInt3264];
											if (Static657.aString127 != null && local15 < Static621.anInt10020) {
												aStringArray12[anInt3275++] = Static303.aClass101Array1[local15].aString53;
												return;
											}
											aStringArray12[anInt3275++] = "";
											return;
										}
										if (arg0 == 3614) {
											local15 = anIntArray167[--anInt3264];
											if (Static657.aString127 != null && local15 < Static621.anInt10020) {
												anIntArray167[anInt3264++] = Static303.aClass101Array1[local15].anInt2926;
												return;
											}
											anIntArray167[anInt3264++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local15 = anIntArray167[--anInt3264];
											if (Static657.aString127 != null && local15 < Static621.anInt10020) {
												anIntArray167[anInt3264++] = Static303.aClass101Array1[local15].aByte45;
												return;
											}
											anIntArray167[anInt3264++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray167[anInt3264++] = Static152.aByte44;
											return;
										}
										if (arg0 == 3617) {
											local4883 = aStringArray12[--anInt3275];
											Static452.method6701(local4883);
											return;
										}
										if (arg0 == 3618) {
											anIntArray167[anInt3264++] = Static438.aByte112;
											return;
										}
										if (arg0 == 3619) {
											local4883 = aStringArray12[--anInt3275];
											Static263.method4077(local4883);
											return;
										}
										if (arg0 == 3620) {
											Static276.method4230();
											return;
										}
										if (arg0 == 3621) {
											if (Static502.anInt8591 == 0) {
												anIntArray167[anInt3264++] = -1;
												return;
											}
											anIntArray167[anInt3264++] = Static299.anInt6884;
											return;
										}
										if (arg0 == 3622) {
											local15 = anIntArray167[--anInt3264];
											if (Static502.anInt8591 != 0 && local15 < Static299.anInt6884) {
												aStringArray12[anInt3275++] = Static383.aStringArray25[local15];
												if (Static301.aStringArray17[local15] != null) {
													aStringArray12[anInt3275++] = Static301.aStringArray17[local15];
													return;
												}
												aStringArray12[anInt3275++] = "";
												return;
											}
											aStringArray12[anInt3275++] = "";
											aStringArray12[anInt3275++] = "";
											return;
										}
										if (arg0 == 3623) {
											local4883 = aStringArray12[--anInt3275];
											if (local4883.startsWith("<img=0>") || local4883.startsWith("<img=1>")) {
												local4883 = local4883.substring(7);
											}
											anIntArray167[anInt3264++] = Static517.method7376(local4883) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local15 = anIntArray167[--anInt3264];
											if (Static303.aClass101Array1 != null && local15 < Static621.anInt10020 && Static303.aClass101Array1[local15].aString55.equalsIgnoreCase(Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aString109)) {
												anIntArray167[anInt3264++] = 1;
												return;
											}
											anIntArray167[anInt3264++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static372.aString96 != null) {
												aStringArray12[anInt3275++] = Static372.aString96;
												return;
											}
											aStringArray12[anInt3275++] = "";
											return;
										}
										if (arg0 == 3626) {
											local15 = anIntArray167[--anInt3264];
											if (Static657.aString127 != null && local15 < Static621.anInt10020) {
												aStringArray12[anInt3275++] = Static303.aClass101Array1[local15].aString52;
												return;
											}
											aStringArray12[anInt3275++] = "";
											return;
										}
										if (arg0 == 3627) {
											local15 = anIntArray167[--anInt3264];
											if (Static502.anInt8591 == 2 && local15 >= 0 && local15 < Static22.anInt373) {
												anIntArray167[anInt3264++] = Static679.aBooleanArray30[local15] ? 1 : 0;
												return;
											}
											anIntArray167[anInt3264++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local4883 = aStringArray12[--anInt3275];
											if (local4883.startsWith("<img=0>") || local4883.startsWith("<img=1>")) {
												local4883 = local4883.substring(7);
											}
											anIntArray167[anInt3264++] = Static695.method9117(local4883);
											return;
										}
										if (arg0 == 3629) {
											anIntArray167[anInt3264++] = Static194.anInt3394;
											return;
										}
										if (arg0 == 3630) {
											local4883 = aStringArray12[--anInt3275];
											Static38.method562(true, local4883);
											return;
										}
										if (arg0 == 3631) {
											local15 = anIntArray167[--anInt3264];
											anIntArray167[anInt3264++] = Static572.aBooleanArray25[local15] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local15 = anIntArray167[--anInt3264];
											if (Static657.aString127 != null && local15 < Static621.anInt10020) {
												aStringArray12[anInt3275++] = Static303.aClass101Array1[local15].aString55;
												return;
											}
											aStringArray12[anInt3275++] = "";
											return;
										}
										if (arg0 == 3633) {
											local15 = anIntArray167[--anInt3264];
											if (Static502.anInt8591 != 0 && local15 < Static299.anInt6884) {
												aStringArray12[anInt3275++] = Static59.aStringArray3[local15];
												return;
											}
											aStringArray12[anInt3275++] = "";
											return;
										}
										if (arg0 == 3634) {
											local15 = anIntArray167[--anInt3264];
											if (Static502.anInt8591 == 2 && local15 < Static22.anInt373) {
												anIntArray167[anInt3264++] = Static600.aBooleanArray28[local15] ? 1 : 0;
												return;
											}
											anIntArray167[anInt3264++] = 0;
											return;
										}
									} else if (arg0 < 3800) {
										if (arg0 == 3700) {
											if (Static474.aClass237_4 != null) {
												anIntArray167[anInt3264++] = 1;
												aClass237_3 = Static474.aClass237_4;
												return;
											}
											anIntArray167[anInt3264++] = 0;
											return;
										}
										if (arg0 == 3701) {
											if (Static319.aClass237_7 != null) {
												anIntArray167[anInt3264++] = 1;
												aClass237_3 = Static319.aClass237_7;
												return;
											}
											anIntArray167[anInt3264++] = 0;
											return;
										}
										if (arg0 == 3702) {
											aStringArray12[anInt3275++] = aClass237_3.aString101;
											return;
										}
										if (arg0 == 3703) {
											anIntArray167[anInt3264++] = aClass237_3.aBoolean549 ? 1 : 0;
											return;
										}
										if (arg0 == 3704) {
											anIntArray167[anInt3264++] = aClass237_3.aByte106;
											return;
										}
										if (arg0 == 3705) {
											anIntArray167[anInt3264++] = aClass237_3.aByte105;
											return;
										}
										if (arg0 == 3706) {
											anIntArray167[anInt3264++] = aClass237_3.aByte107;
											return;
										}
										if (arg0 == 3707) {
											anIntArray167[anInt3264++] = aClass237_3.aByte104;
											return;
										}
										if (arg0 == 3709) {
											anIntArray167[anInt3264++] = aClass237_3.anInt6982;
											return;
										}
										if (arg0 == 3710) {
											local15 = anIntArray167[--anInt3264];
											aStringArray12[anInt3275++] = aClass237_3.aStringArray26[local15];
											return;
										}
										if (arg0 == 3711) {
											local15 = anIntArray167[--anInt3264];
											anIntArray167[anInt3264++] = aClass237_3.aByteArray54[local15];
											return;
										}
										if (arg0 == 3712) {
											anIntArray167[anInt3264++] = aClass237_3.anInt6960;
											return;
										}
										if (arg0 == 3713) {
											local15 = anIntArray167[--anInt3264];
											aStringArray12[anInt3275++] = aClass237_3.aStringArray27[local15];
											return;
										}
										if (arg0 == 3714) {
											anInt3264 -= 3;
											local15 = anIntArray167[anInt3264];
											local21 = anIntArray167[anInt3264 + 1];
											local27 = anIntArray167[anInt3264 + 2];
											anIntArray167[anInt3264++] = aClass237_3.method5849(local21, local15, local27);
											return;
										}
										if (arg0 == 3715) {
											anIntArray167[anInt3264++] = aClass237_3.anInt6968;
											return;
										}
										if (arg0 == 3716) {
											anIntArray167[anInt3264++] = aClass237_3.anInt6977;
											return;
										}
										if (arg0 == 3717) {
											anIntArray167[anInt3264++] = aClass237_3.method5853(aStringArray12[--anInt3275]);
											return;
										}
										if (arg0 == 3718) {
											anIntArray167[anInt3264 - 1] = aClass237_3.method5848()[anIntArray167[anInt3264 - 1]];
											return;
										}
										if (arg0 == 3719) {
											Static665.method8867(anIntArray167[--anInt3264]);
											return;
										}
										if (arg0 == 3720) {
											local15 = anIntArray167[--anInt3264];
											anIntArray167[anInt3264++] = aClass237_3.anIntArray378[local15];
											return;
										}
										if (arg0 == 3750) {
											if (Static267.aClass3_Sub56_2 != null) {
												anIntArray167[anInt3264++] = 1;
												aClass3_Sub56_1 = Static267.aClass3_Sub56_2;
												return;
											}
											anIntArray167[anInt3264++] = 0;
											return;
										}
										if (arg0 == 3751) {
											if (Static410.aClass3_Sub56_3 != null) {
												anIntArray167[anInt3264++] = 1;
												aClass3_Sub56_1 = Static410.aClass3_Sub56_3;
												return;
											}
											anIntArray167[anInt3264++] = 0;
											return;
										}
										if (arg0 == 3752) {
											aStringArray12[anInt3275++] = aClass3_Sub56_1.aString134;
											return;
										}
										if (arg0 == 3753) {
											anIntArray167[anInt3264++] = aClass3_Sub56_1.aByte148;
											return;
										}
										if (arg0 == 3754) {
											anIntArray167[anInt3264++] = aClass3_Sub56_1.aByte149;
											return;
										}
										if (arg0 == 3755) {
											anIntArray167[anInt3264++] = aClass3_Sub56_1.anInt11265;
											return;
										}
										if (arg0 == 3756) {
											local15 = anIntArray167[--anInt3264];
											aStringArray12[anInt3275++] = aClass3_Sub56_1.aClass407Array1[local15].aString133;
											return;
										}
										if (arg0 == 3757) {
											local15 = anIntArray167[--anInt3264];
											anIntArray167[anInt3264++] = aClass3_Sub56_1.aClass407Array1[local15].aByte147;
											return;
										}
										if (arg0 == 3758) {
											local15 = anIntArray167[--anInt3264];
											anIntArray167[anInt3264++] = aClass3_Sub56_1.aClass407Array1[local15].anInt11258;
											return;
										}
										if (arg0 == 3759) {
											local15 = anIntArray167[--anInt3264];
											Static354.method5125(aClass3_Sub56_1 == Static410.aClass3_Sub56_3, local15);
											return;
										}
										if (arg0 == 3760) {
											anIntArray167[anInt3264++] = aClass3_Sub56_1.method9416(aStringArray12[--anInt3275]);
											return;
										}
										if (arg0 == 3761) {
											anIntArray167[anInt3264 - 1] = aClass3_Sub56_1.method9412()[anIntArray167[anInt3264 - 1]];
											return;
										}
										if (arg0 == 3790) {
											anIntArray167[anInt3264++] = Static398.anObjectArray37 == null ? 0 : 1;
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local15 = anIntArray167[--anInt3264];
											anIntArray167[anInt3264++] = Static626.aClass232Array1[local15].method5414();
											return;
										}
										if (arg0 == 3904) {
											local15 = anIntArray167[--anInt3264];
											anIntArray167[anInt3264++] = Static626.aClass232Array1[local15].anInt6384;
											return;
										}
										if (arg0 == 3905) {
											local15 = anIntArray167[--anInt3264];
											anIntArray167[anInt3264++] = Static626.aClass232Array1[local15].anInt6388;
											return;
										}
										if (arg0 == 3906) {
											local15 = anIntArray167[--anInt3264];
											anIntArray167[anInt3264++] = Static626.aClass232Array1[local15].anInt6387;
											return;
										}
										if (arg0 == 3907) {
											local15 = anIntArray167[--anInt3264];
											anIntArray167[anInt3264++] = Static626.aClass232Array1[local15].anInt6390;
											return;
										}
										if (arg0 == 3908) {
											local15 = anIntArray167[--anInt3264];
											anIntArray167[anInt3264++] = Static626.aClass232Array1[local15].anInt6386;
											return;
										}
										if (arg0 == 3910) {
											local15 = anIntArray167[--anInt3264];
											local21 = Static626.aClass232Array1[local15].method5416();
											anIntArray167[anInt3264++] = local21 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local15 = anIntArray167[--anInt3264];
											local21 = Static626.aClass232Array1[local15].method5416();
											anIntArray167[anInt3264++] = local21 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local15 = anIntArray167[--anInt3264];
											local21 = Static626.aClass232Array1[local15].method5416();
											anIntArray167[anInt3264++] = local21 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local15 = anIntArray167[--anInt3264];
											local21 = Static626.aClass232Array1[local15].method5416();
											anIntArray167[anInt3264++] = local21 == 1 ? 1 : 0;
											return;
										}
									} else {
										@Pc(9298) long local9298;
										if (arg0 < 4100) {
											if (arg0 == 4000) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												anIntArray167[anInt3264++] = local15 + local21;
												return;
											}
											if (arg0 == 4001) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												anIntArray167[anInt3264++] = local15 - local21;
												return;
											}
											if (arg0 == 4002) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												anIntArray167[anInt3264++] = local15 * local21;
												return;
											}
											if (arg0 == 4003) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												anIntArray167[anInt3264++] = local15 / local21;
												return;
											}
											if (arg0 == 4004) {
												local15 = anIntArray167[--anInt3264];
												anIntArray167[anInt3264++] = (int) (Math.random() * (double) local15);
												return;
											}
											if (arg0 == 4005) {
												local15 = anIntArray167[--anInt3264];
												anIntArray167[anInt3264++] = (int) (Math.random() * (double) (local15 + 1));
												return;
											}
											if (arg0 == 4006) {
												anInt3264 -= 5;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												local27 = anIntArray167[anInt3264 + 2];
												local506 = anIntArray167[anInt3264 + 3];
												local2978 = anIntArray167[anInt3264 + 4];
												anIntArray167[anInt3264++] = local15 + (local21 - local15) * (local2978 - local27) / (local506 - local27);
												return;
											}
											@Pc(9305) long local9305;
											if (arg0 == 4007) {
												anInt3264 -= 2;
												local9298 = (long) anIntArray167[anInt3264];
												local9305 = (long) anIntArray167[anInt3264 + 1];
												anIntArray167[anInt3264++] = (int) (local9298 + local9298 * local9305 / 100L);
												return;
											}
											if (arg0 == 4008) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												anIntArray167[anInt3264++] = local15 | 0x1 << local21;
												return;
											}
											if (arg0 == 4009) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												anIntArray167[anInt3264++] = local15 & -(0x1 << local21) - 1;
												return;
											}
											if (arg0 == 4010) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												anIntArray167[anInt3264++] = (local15 & 0x1 << local21) == 0 ? 0 : 1;
												return;
											}
											if (arg0 == 4011) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												anIntArray167[anInt3264++] = local15 % local21;
												return;
											}
											if (arg0 == 4012) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												if (local15 == 0) {
													anIntArray167[anInt3264++] = 0;
													return;
												}
												anIntArray167[anInt3264++] = (int) Math.pow((double) local15, (double) local21);
												return;
											}
											if (arg0 == 4013) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												if (local15 == 0) {
													anIntArray167[anInt3264++] = 0;
													return;
												}
												if (local21 == 0) {
													anIntArray167[anInt3264++] = Integer.MAX_VALUE;
													return;
												}
												anIntArray167[anInt3264++] = (int) Math.pow((double) local15, 1.0D / (double) local21);
												return;
											}
											if (arg0 == 4014) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												anIntArray167[anInt3264++] = local15 & local21;
												return;
											}
											if (arg0 == 4015) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												anIntArray167[anInt3264++] = local15 | local21;
												return;
											}
											if (arg0 == 4016) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												anIntArray167[anInt3264++] = local15 < local21 ? local15 : local21;
												return;
											}
											if (arg0 == 4017) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												anIntArray167[anInt3264++] = local15 > local21 ? local15 : local21;
												return;
											}
											if (arg0 == 4018) {
												anInt3264 -= 3;
												local9298 = (long) anIntArray167[anInt3264];
												local9305 = (long) anIntArray167[anInt3264 + 1];
												@Pc(9692) long local9692 = (long) anIntArray167[anInt3264 + 2];
												anIntArray167[anInt3264++] = (int) (local9298 * local9692 / local9305);
												return;
											}
											if (arg0 == 4019) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												if (local15 > 700 || local21 > 700) {
													anIntArray167[anInt3264++] = 256;
												}
												@Pc(9755) double local9755 = (Math.random() * (double) (local21 + local15) + 800.0D - (double) local15) / 100.0D;
												anIntArray167[anInt3264++] = (int) (Math.pow(2.0D, local9755) + 0.5D);
												return;
											}
											if (arg0 == 4020) {
												local15 = anIntArray167[--anInt3264];
												anIntArray167[anInt3264++] = Static179.anIntArray162[Static702.method9174(local15) & 0xFFFF];
												return;
											}
										} else if (arg0 < 4200) {
											if (arg0 == 4100) {
												local4883 = aStringArray12[--anInt3275];
												local21 = anIntArray167[--anInt3264];
												aStringArray12[anInt3275++] = local4883 + local21;
												return;
											}
											if (arg0 == 4101) {
												anInt3275 -= 2;
												local4883 = aStringArray12[anInt3275];
												local1394 = aStringArray12[anInt3275 + 1];
												aStringArray12[anInt3275++] = local4883 + local1394;
												return;
											}
											if (arg0 == 4102) {
												local4883 = aStringArray12[--anInt3275];
												local21 = anIntArray167[--anInt3264];
												aStringArray12[anInt3275++] = local4883 + Static350.method5060(true, local21);
												return;
											}
											if (arg0 == 4103) {
												local4883 = aStringArray12[--anInt3275];
												aStringArray12[anInt3275++] = local4883.toLowerCase();
												return;
											}
											if (arg0 == 4104) {
												aStringArray12[anInt3275++] = Static189.method2880(Static141.anInt2658, Static330.method4919(anIntArray167[--anInt3264]));
												return;
											}
											if (arg0 == 4105) {
												anInt3275 -= 2;
												local4883 = aStringArray12[anInt3275];
												local1394 = aStringArray12[anInt3275 + 1];
												if (Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass236_1 != null && Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aClass236_1.aBoolean538) {
													aStringArray12[anInt3275++] = local1394;
													return;
												}
												aStringArray12[anInt3275++] = local4883;
												return;
											}
											if (arg0 == 4106) {
												local15 = anIntArray167[--anInt3264];
												aStringArray12[anInt3275++] = Integer.toString(local15);
												return;
											}
											if (arg0 == 4107) {
												anInt3275 -= 2;
												anIntArray167[anInt3264++] = Static91.method1248(Static141.anInt2658, aStringArray12[anInt3275 + 1], aStringArray12[anInt3275]);
												return;
											}
											@Pc(10075) Class330 local10075;
											if (arg0 == 4108) {
												local4883 = aStringArray12[--anInt3275];
												anInt3264 -= 2;
												local21 = anIntArray167[anInt3264];
												local27 = anIntArray167[anInt3264 + 1];
												local10075 = Static708.method9245(local27, Static385.aClass221_110);
												anIntArray167[anInt3264++] = local10075.method7910(local4883, local21, Static619.aClass9Array44);
												return;
											}
											if (arg0 == 4109) {
												local4883 = aStringArray12[--anInt3275];
												anInt3264 -= 2;
												local21 = anIntArray167[anInt3264];
												local27 = anIntArray167[anInt3264 + 1];
												local10075 = Static708.method9245(local27, Static385.aClass221_110);
												anIntArray167[anInt3264++] = local10075.method7907(local4883, local21, Static619.aClass9Array44);
												return;
											}
											if (arg0 == 4110) {
												anInt3275 -= 2;
												local4883 = aStringArray12[anInt3275];
												local1394 = aStringArray12[anInt3275 + 1];
												if (anIntArray167[--anInt3264] == 1) {
													aStringArray12[anInt3275++] = local4883;
													return;
												}
												aStringArray12[anInt3275++] = local1394;
												return;
											}
											if (arg0 == 4111) {
												local4883 = aStringArray12[--anInt3275];
												aStringArray12[anInt3275++] = Static71.method907(local4883);
												return;
											}
											if (arg0 == 4112) {
												local4883 = aStringArray12[--anInt3275];
												local21 = anIntArray167[--anInt3264];
												if (local21 == -1) {
													throw new RuntimeException("null char");
												}
												aStringArray12[anInt3275++] = local4883 + (char) local21;
												return;
											}
											if (arg0 == 4113) {
												local15 = anIntArray167[--anInt3264];
												anIntArray167[anInt3264++] = method2827((char) local15);
												return;
											}
											if (arg0 == 4114) {
												local15 = anIntArray167[--anInt3264];
												anIntArray167[anInt3264++] = Static536.method7529((char) local15) ? 1 : 0;
												return;
											}
											if (arg0 == 4115) {
												local15 = anIntArray167[--anInt3264];
												anIntArray167[anInt3264++] = Static274.method4205((char) local15) ? 1 : 0;
												return;
											}
											if (arg0 == 4116) {
												local15 = anIntArray167[--anInt3264];
												anIntArray167[anInt3264++] = Static50.method669((char) local15) ? 1 : 0;
												return;
											}
											if (arg0 == 4117) {
												local4883 = aStringArray12[--anInt3275];
												if (local4883 != null) {
													anIntArray167[anInt3264++] = local4883.length();
													return;
												}
												anIntArray167[anInt3264++] = 0;
												return;
											}
											if (arg0 == 4118) {
												local4883 = aStringArray12[--anInt3275];
												anInt3264 -= 2;
												local21 = anIntArray167[anInt3264];
												local27 = anIntArray167[anInt3264 + 1];
												aStringArray12[anInt3275++] = local4883.substring(local21, local27);
												return;
											}
											if (arg0 == 4119) {
												local4883 = aStringArray12[--anInt3275];
												@Pc(10441) StringBuffer local10441 = new StringBuffer(local4883.length());
												@Pc(10443) boolean local10443 = false;
												for (local506 = 0; local506 < local4883.length(); local506++) {
													@Pc(10450) char local10450 = local4883.charAt(local506);
													if (local10450 == '<') {
														local10443 = true;
													} else if (local10450 == '>') {
														local10443 = false;
													} else if (!local10443) {
														local10441.append(local10450);
													}
												}
												aStringArray12[anInt3275++] = local10441.toString();
												return;
											}
											if (arg0 == 4120) {
												local4883 = aStringArray12[--anInt3275];
												anInt3264 -= 2;
												local21 = anIntArray167[anInt3264];
												local27 = anIntArray167[anInt3264 + 1];
												anIntArray167[anInt3264++] = local4883.indexOf(local21, local27);
												return;
											}
											if (arg0 == 4121) {
												anInt3275 -= 2;
												local4883 = aStringArray12[anInt3275];
												local1394 = aStringArray12[anInt3275 + 1];
												local27 = anIntArray167[--anInt3264];
												anIntArray167[anInt3264++] = local4883.indexOf(local1394, local27);
												return;
											}
											if (arg0 == 4122) {
												local15 = anIntArray167[--anInt3264];
												anIntArray167[anInt3264++] = Character.toLowerCase((char) local15);
												return;
											}
											if (arg0 == 4123) {
												local15 = anIntArray167[--anInt3264];
												anIntArray167[anInt3264++] = Character.toUpperCase((char) local15);
												return;
											}
											if (arg0 == 4124) {
												local575 = anIntArray167[--anInt3264] != 0;
												local21 = anIntArray167[--anInt3264];
												aStringArray12[anInt3275++] = Static389.method5886((long) local21, Static141.anInt2658, 0, local575);
												return;
											}
											if (arg0 == 4125) {
												local4883 = aStringArray12[--anInt3275];
												local21 = anIntArray167[--anInt3264];
												@Pc(10670) Class330 local10670 = Static708.method9245(local21, Static385.aClass221_110);
												anIntArray167[anInt3264++] = local10670.method7905(Static619.aClass9Array44, local4883);
												return;
											}
											if (arg0 == 4126) {
												aStringArray12[anInt3275++] = Static672.method8914(Static141.anInt2658, (long) anIntArray167[--anInt3264] * 60000L) + " UTC";
												return;
											}
											if (arg0 == 4127) {
												local9298 = aLongArray5[--anInt3262];
												aStringArray12[anInt3275++] = local9298 == -1L ? "" : Long.toString(local9298, 36).toUpperCase();
												return;
											}
										} else if (arg0 < 4300) {
											if (arg0 == 4200) {
												local15 = anIntArray167[--anInt3264];
												aStringArray12[anInt3275++] = Static243.aClass406_2.method9394(local15).aString47;
												return;
											}
											@Pc(10799) Class91 local10799;
											if (arg0 == 4201) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												local10799 = Static243.aClass406_2.method9394(local15);
												if (local21 >= 1 && local21 <= 5 && local10799.aStringArray7[local21 - 1] != null) {
													aStringArray12[anInt3275++] = local10799.aStringArray7[local21 - 1];
													return;
												}
												aStringArray12[anInt3275++] = "";
												return;
											}
											if (arg0 == 4202) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												local10799 = Static243.aClass406_2.method9394(local15);
												if (local21 >= 1 && local21 <= 5 && local10799.aStringArray6[local21 - 1] != null) {
													aStringArray12[anInt3275++] = local10799.aStringArray6[local21 - 1];
													return;
												}
												aStringArray12[anInt3275++] = "";
												return;
											}
											if (arg0 == 4203) {
												local15 = anIntArray167[--anInt3264];
												anIntArray167[anInt3264++] = Static243.aClass406_2.method9394(local15).anInt2723;
												return;
											}
											if (arg0 == 4204) {
												local15 = anIntArray167[--anInt3264];
												anIntArray167[anInt3264++] = Static243.aClass406_2.method9394(local15).anInt2705 == 1 ? 1 : 0;
												return;
											}
											@Pc(10973) Class91 local10973;
											if (arg0 == 4205) {
												local15 = anIntArray167[--anInt3264];
												local10973 = Static243.aClass406_2.method9394(local15);
												if (local10973.anInt2681 == -1 && local10973.anInt2697 >= 0) {
													anIntArray167[anInt3264++] = local10973.anInt2697;
													return;
												}
												anIntArray167[anInt3264++] = local15;
												return;
											}
											if (arg0 == 4206) {
												local15 = anIntArray167[--anInt3264];
												local10973 = Static243.aClass406_2.method9394(local15);
												if (local10973.anInt2681 >= 0 && local10973.anInt2697 >= 0) {
													anIntArray167[anInt3264++] = local10973.anInt2697;
													return;
												}
												anIntArray167[anInt3264++] = local15;
												return;
											}
											if (arg0 == 4207) {
												local15 = anIntArray167[--anInt3264];
												anIntArray167[anInt3264++] = Static243.aClass406_2.method9394(local15).aBoolean223 ? 1 : 0;
												return;
											}
											if (arg0 == 4208) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												local3848 = Static646.aClass106_1.method2677(local21);
												if (local3848.method7779()) {
													aStringArray12[anInt3275++] = Static243.aClass406_2.method9394(local15).method2363(local21, local3848.aString121);
													return;
												}
												anIntArray167[anInt3264++] = Static243.aClass406_2.method9394(local15).method2368(local3848.anInt9232, local21);
												return;
											}
											if (arg0 == 4209) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1] - 1;
												local10799 = Static243.aClass406_2.method9394(local15);
												if (local10799.anInt2700 == local21) {
													anIntArray167[anInt3264++] = local10799.anInt2702;
													return;
												}
												if (local10799.anInt2736 == local21) {
													anIntArray167[anInt3264++] = local10799.anInt2721;
													return;
												}
												anIntArray167[anInt3264++] = -1;
												return;
											}
											if (arg0 == 4210) {
												local4883 = aStringArray12[--anInt3275];
												local21 = anIntArray167[--anInt3264];
												Static251.method3930(local4883, local21 == 1);
												anIntArray167[anInt3264++] = Static453.anInt8000;
												return;
											}
											if (arg0 == 4211) {
												if (Static121.aShortArray35 != null && Static367.anInt6201 < Static453.anInt8000) {
													anIntArray167[anInt3264++] = Static121.aShortArray35[Static367.anInt6201++] & 0xFFFF;
													return;
												}
												anIntArray167[anInt3264++] = -1;
												return;
											}
											if (arg0 == 4212) {
												Static367.anInt6201 = 0;
												return;
											}
											if (arg0 == 4213) {
												local15 = anIntArray167[--anInt3264];
												anIntArray167[anInt3264++] = Static243.aClass406_2.method9394(local15).anInt2686;
												return;
											}
											if (arg0 == 4214) {
												local4883 = aStringArray12[--anInt3275];
												anInt3264 -= 3;
												local21 = anIntArray167[anInt3264];
												local27 = anIntArray167[anInt3264 + 1];
												local506 = anIntArray167[anInt3264 + 2];
												Static510.method9008(local506, local27, local21 == 1, local4883);
												anIntArray167[anInt3264++] = Static453.anInt8000;
												return;
											}
											if (arg0 == 4215) {
												anInt3275 -= 2;
												anInt3264 -= 2;
												local4883 = aStringArray12[anInt3275];
												local21 = anIntArray167[anInt3264];
												local27 = anIntArray167[anInt3264 + 1];
												@Pc(11390) String local11390 = aStringArray12[anInt3275 + 1];
												Static308.method4667(local21 == 1, local11390, local27, local4883);
												anIntArray167[anInt3264++] = Static453.anInt8000;
												return;
											}
										} else if (arg0 < 4400) {
											if (arg0 == 4300) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												local3848 = Static646.aClass106_1.method2677(local21);
												if (local3848.method7779()) {
													aStringArray12[anInt3275++] = Static631.aClass85_2.method2214(local15).method403(local21, local3848.aString121);
													return;
												}
												anIntArray167[anInt3264++] = Static631.aClass85_2.method2214(local15).method412(local21, local3848.anInt9232);
												return;
											}
										} else if (arg0 < 4500) {
											if (arg0 == 4400) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												local3848 = Static646.aClass106_1.method2677(local21);
												if (local3848.method7779()) {
													aStringArray12[anInt3275++] = Static70.aClass323_1.method7792(local15).method3633(local3848.aString121, local21);
													return;
												}
												anIntArray167[anInt3264++] = Static70.aClass323_1.method7792(local15).method3640(local3848.anInt9232, local21);
												return;
											}
										} else if (arg0 < 4600) {
											if (arg0 == 4500) {
												anInt3264 -= 2;
												local15 = anIntArray167[anInt3264];
												local21 = anIntArray167[anInt3264 + 1];
												local3848 = Static646.aClass106_1.method2677(local21);
												if (local3848.method7779()) {
													aStringArray12[anInt3275++] = Static308.aClass321_1.method7786(local15).method3933(local3848.aString121, local21);
													return;
												}
												anIntArray167[anInt3264++] = Static308.aClass321_1.method7786(local15).method3928(local3848.anInt9232, local21);
												return;
											}
										} else if (arg0 < 4700) {
											if (arg0 == 4600) {
												local15 = anIntArray167[--anInt3264];
												@Pc(11630) Class274 local11630 = Static255.aClass238_1.method5902(local15);
												if (local11630.anIntArray443 != null && local11630.anIntArray443.length > 0) {
													local27 = 0;
													local506 = local11630.anIntArray442[0];
													for (local2978 = 1; local2978 < local11630.anIntArray443.length; local2978++) {
														if (local11630.anIntArray442[local2978] > local506) {
															local27 = local2978;
															local506 = local11630.anIntArray442[local2978];
														}
													}
													anIntArray167[anInt3264++] = local11630.anIntArray443[local27];
													return;
												}
												anIntArray167[anInt3264++] = local11630.anInt8189;
												return;
											}
										} else if (arg0 < 4800) {
											if (arg0 == 4700) {
												anIntArray167[anInt3264++] = Static645.aBoolean754 ? 1 : 0;
												return;
											}
											if (arg0 == 4701) {
												local4883 = aStringArray12[--anInt3275];
												if (Static178.anInt3225 == 7 && !Static651.method8741()) {
													if (local4883.length() > 20) {
														Static392.aByte109 = -4;
														return;
													}
													Static392.aByte109 = -1;
													local4977 = Static89.method1200(Static693.aClass286_124, Static532.aClass400_2.aClass399_2);
													local4977.aClass3_Sub28_Sub2_1.method5329(0);
													local27 = local4977.aClass3_Sub28_Sub2_1.anInt6241;
													local4977.aClass3_Sub28_Sub2_1.method5283(local4883);
													local4977.aClass3_Sub28_Sub2_1.method5291(local4977.aClass3_Sub28_Sub2_1.anInt6241 - local27);
													Static532.aClass400_2.method9223(local4977);
													return;
												}
												Static392.aByte109 = -5;
												return;
											}
											if (arg0 == 4702) {
												anIntArray167[anInt3264++] = Static392.aByte109;
												if (Static392.aByte109 != -1) {
													Static392.aByte109 = -6;
												}
												return;
											}
										}
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local220 = Static118.method2045(anIntArray167[--anInt3264]);
						} else {
							local220 = arg1 ? aClass20_8 : aClass20_7;
						}
						if (arg0 == 1300) {
							local21 = anIntArray167[--anInt3264] - 1;
							if (local21 >= 0 && local21 <= 9) {
								local220.method454(local21, aStringArray12[--anInt3275]);
								return;
							}
							anInt3275--;
							return;
						}
						if (arg0 == 1301) {
							anInt3264 -= 2;
							local21 = anIntArray167[anInt3264];
							local27 = anIntArray167[anInt3264 + 1];
							if (local21 == -1 && local27 == -1) {
								local220.aClass20_3 = null;
								return;
							}
							local220.aClass20_3 = Static244.method3731(local21, local27);
							return;
						}
						if (arg0 == 1302) {
							local21 = anIntArray167[--anInt3264];
							if (local21 != Static406.anInt7246 && local21 != Static257.anInt4777 && local21 != Static123.anInt2373) {
								return;
							}
							local220.anInt533 = local21;
							return;
						}
						if (arg0 == 1303) {
							local220.anInt563 = anIntArray167[--anInt3264];
							return;
						}
						if (arg0 == 1304) {
							local220.anInt601 = anIntArray167[--anInt3264];
							return;
						}
						if (arg0 == 1305) {
							local220.aString8 = aStringArray12[--anInt3275];
							return;
						}
						if (arg0 == 1306) {
							local220.aString9 = aStringArray12[--anInt3275];
							return;
						}
						if (arg0 == 1307) {
							local220.aStringArray2 = null;
							return;
						}
						if (arg0 == 1308) {
							local220.anInt559 = anIntArray167[--anInt3264];
							local220.anInt544 = anIntArray167[--anInt3264];
							return;
						}
						if (arg0 == 1309) {
							local21 = anIntArray167[--anInt3264];
							local27 = anIntArray167[--anInt3264];
							if (local27 >= 1 && local27 <= 10) {
								local220.method467(local27 - 1, local21);
							}
							return;
						}
						if (arg0 == 1310) {
							local220.aString11 = aStringArray12[--anInt3275];
							return;
						}
						if (arg0 == 1311) {
							local220.anInt521 = anIntArray167[--anInt3264];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt3264 -= 3;
								local21 = anIntArray167[anInt3264] - 1;
								local27 = anIntArray167[anInt3264 + 1];
								local506 = anIntArray167[anInt3264 + 2];
								if (local21 < 0 || local21 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt3264 -= 2;
								local21 = 10;
								local27 = anIntArray167[anInt3264];
								local506 = anIntArray167[anInt3264 + 1];
							}
							if (local220.aByteArray7 == null) {
								if (local27 == 0) {
									return;
								}
								local220.aByteArray7 = new byte[11];
								local220.aByteArray6 = new byte[11];
								local220.anIntArray25 = new int[11];
							}
							local220.aByteArray7[local21] = (byte) local27;
							if (local27 == 0) {
								local220.aBoolean37 = false;
								for (local2978 = 0; local2978 < local220.aByteArray7.length; local2978++) {
									if (local220.aByteArray7[local2978] != 0) {
										local220.aBoolean37 = true;
										break;
									}
								}
							} else {
								local220.aBoolean37 = true;
							}
							local220.aByteArray6[local21] = (byte) local506;
							return;
						}
						if (arg0 == 1314) {
							local220.anInt530 = anIntArray167[--anInt3264];
							return;
						}
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local220 = Static118.method2045(anIntArray167[--anInt3264]);
				} else {
					local220 = arg1 ? aClass20_8 : aClass20_7;
				}
				if (arg0 == 1000) {
					anInt3264 -= 4;
					local220.anInt564 = anIntArray167[anInt3264];
					local220.anInt572 = anIntArray167[anInt3264 + 1];
					local21 = anIntArray167[anInt3264 + 2];
					if (local21 < 0) {
						local21 = 0;
					} else if (local21 > 5) {
						local21 = 5;
					}
					local27 = anIntArray167[anInt3264 + 3];
					if (local27 < 0) {
						local27 = 0;
					} else if (local27 > 5) {
						local27 = 5;
					}
					local220.aByte16 = (byte) local21;
					local220.aByte15 = (byte) local27;
					Static391.method5905(local220);
					Static624.method8451(local220);
					if (local220.anInt583 == -1) {
						Static153.method2451(local220.anInt600);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt3264 -= 4;
					local220.anInt592 = anIntArray167[anInt3264];
					local220.anInt599 = anIntArray167[anInt3264 + 1];
					local220.anInt550 = 0;
					local220.anInt558 = 0;
					local21 = anIntArray167[anInt3264 + 2];
					if (local21 < 0) {
						local21 = 0;
					} else if (local21 > 4) {
						local21 = 4;
					}
					local27 = anIntArray167[anInt3264 + 3];
					if (local27 < 0) {
						local27 = 0;
					} else if (local27 > 4) {
						local27 = 4;
					}
					local220.aByte18 = (byte) local21;
					local220.aByte17 = (byte) local27;
					Static391.method5905(local220);
					Static624.method8451(local220);
					if (local220.anInt532 == 0) {
						Static97.method1292(false, local220);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(834) boolean local834 = anIntArray167[--anInt3264] == 1;
					if (local220.aBoolean42 != local834) {
						local220.aBoolean42 = local834;
						Static391.method5905(local220);
					}
					if (local220.anInt583 == -1) {
						Static47.method636(local220.anInt600);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt3264 -= 2;
					local220.anInt551 = anIntArray167[anInt3264];
					local220.anInt528 = anIntArray167[anInt3264 + 1];
					Static391.method5905(local220);
					Static624.method8451(local220);
					if (local220.anInt532 == 0) {
						Static97.method1292(false, local220);
					}
					return;
				}
				if (arg0 == 1005) {
					local220.aBoolean38 = anIntArray167[--anInt3264] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!nl;II)V")
	public static void method2825(@OriginalArg(0) Class258 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub4_Sub18 local5 = Static153.method2450(arg0, arg1, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray170 = new int[local5.anInt8945];
		aStringArray11 = new String[local5.anInt8943];
		if (local5.aClass258_13 == Static317.aClass258_11 || local5.aClass258_13 == Static233.aClass258_8 || local5.aClass258_13 == Static165.aClass258_4) {
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = 0;
			if (Static440.aClass20_13 != null) {
				local35 = Static440.aClass20_13.anInt524;
				local37 = Static440.aClass20_13.anInt574;
			}
			anIntArray170[0] = Static714.aClass161_1.method8581() - local35;
			anIntArray170[1] = Static714.aClass161_1.method8573() - local37;
		}
		method2814(local5, 200000);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method2826(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static651.anInt10450 == 0 && (Static125.aBoolean199 && !Static697.aBoolean790 || Static553.aBoolean677)) {
			return;
		}
		@Pc(18) String local18 = arg0.toLowerCase();
		@Pc(20) byte local20 = 0;
		if (local18.startsWith(Static476.aClass279_46.method6992(0))) {
			local20 = 0;
			arg0 = arg0.substring(Static476.aClass279_46.method6992(0).length());
		} else if (local18.startsWith(Static476.aClass279_47.method6992(0))) {
			local20 = 1;
			arg0 = arg0.substring(Static476.aClass279_47.method6992(0).length());
		} else if (local18.startsWith(Static476.aClass279_48.method6992(0))) {
			local20 = 2;
			arg0 = arg0.substring(Static476.aClass279_48.method6992(0).length());
		} else if (local18.startsWith(Static476.aClass279_49.method6992(0))) {
			local20 = 3;
			arg0 = arg0.substring(Static476.aClass279_49.method6992(0).length());
		} else if (local18.startsWith(Static476.aClass279_50.method6992(0))) {
			local20 = 4;
			arg0 = arg0.substring(Static476.aClass279_50.method6992(0).length());
		} else if (local18.startsWith(Static476.aClass279_51.method6992(0))) {
			local20 = 5;
			arg0 = arg0.substring(Static476.aClass279_51.method6992(0).length());
		} else if (local18.startsWith(Static476.aClass279_52.method6992(0))) {
			local20 = 6;
			arg0 = arg0.substring(Static476.aClass279_52.method6992(0).length());
		} else if (local18.startsWith(Static476.aClass279_53.method6992(0))) {
			local20 = 7;
			arg0 = arg0.substring(Static476.aClass279_53.method6992(0).length());
		} else if (local18.startsWith(Static476.aClass279_54.method6992(0))) {
			local20 = 8;
			arg0 = arg0.substring(Static476.aClass279_54.method6992(0).length());
		} else if (local18.startsWith(Static476.aClass279_55.method6992(0))) {
			local20 = 9;
			arg0 = arg0.substring(Static476.aClass279_55.method6992(0).length());
		} else if (local18.startsWith(Static476.aClass279_56.method6992(0))) {
			local20 = 10;
			arg0 = arg0.substring(Static476.aClass279_56.method6992(0).length());
		} else if (local18.startsWith(Static476.aClass279_57.method6992(0))) {
			local20 = 11;
			arg0 = arg0.substring(Static476.aClass279_57.method6992(0).length());
		} else if (Static141.anInt2658 != 0) {
			if (local18.startsWith(Static476.aClass279_46.method6992(Static141.anInt2658))) {
				local20 = 0;
				arg0 = arg0.substring(Static476.aClass279_46.method6992(Static141.anInt2658).length());
			} else if (local18.startsWith(Static476.aClass279_47.method6992(Static141.anInt2658))) {
				local20 = 1;
				arg0 = arg0.substring(Static476.aClass279_47.method6992(Static141.anInt2658).length());
			} else if (local18.startsWith(Static476.aClass279_48.method6992(Static141.anInt2658))) {
				local20 = 2;
				arg0 = arg0.substring(Static476.aClass279_48.method6992(Static141.anInt2658).length());
			} else if (local18.startsWith(Static476.aClass279_49.method6992(Static141.anInt2658))) {
				local20 = 3;
				arg0 = arg0.substring(Static476.aClass279_49.method6992(Static141.anInt2658).length());
			} else if (local18.startsWith(Static476.aClass279_50.method6992(Static141.anInt2658))) {
				local20 = 4;
				arg0 = arg0.substring(Static476.aClass279_50.method6992(Static141.anInt2658).length());
			} else if (local18.startsWith(Static476.aClass279_51.method6992(Static141.anInt2658))) {
				local20 = 5;
				arg0 = arg0.substring(Static476.aClass279_51.method6992(Static141.anInt2658).length());
			} else if (local18.startsWith(Static476.aClass279_52.method6992(Static141.anInt2658))) {
				local20 = 6;
				arg0 = arg0.substring(Static476.aClass279_52.method6992(Static141.anInt2658).length());
			} else if (local18.startsWith(Static476.aClass279_53.method6992(Static141.anInt2658))) {
				local20 = 7;
				arg0 = arg0.substring(Static476.aClass279_53.method6992(Static141.anInt2658).length());
			} else if (local18.startsWith(Static476.aClass279_54.method6992(Static141.anInt2658))) {
				local20 = 8;
				arg0 = arg0.substring(Static476.aClass279_54.method6992(Static141.anInt2658).length());
			} else if (local18.startsWith(Static476.aClass279_55.method6992(Static141.anInt2658))) {
				local20 = 9;
				arg0 = arg0.substring(Static476.aClass279_55.method6992(Static141.anInt2658).length());
			} else if (local18.startsWith(Static476.aClass279_56.method6992(Static141.anInt2658))) {
				local20 = 10;
				arg0 = arg0.substring(Static476.aClass279_56.method6992(Static141.anInt2658).length());
			} else if (local18.startsWith(Static476.aClass279_57.method6992(Static141.anInt2658))) {
				local20 = 11;
				arg0 = arg0.substring(Static476.aClass279_57.method6992(Static141.anInt2658).length());
			}
		}
		local18 = arg0.toLowerCase();
		@Pc(460) byte local460 = 0;
		if (local18.startsWith(Static476.aClass279_58.method6992(0))) {
			local460 = 1;
			arg0 = arg0.substring(Static476.aClass279_58.method6992(0).length());
		} else if (local18.startsWith(Static476.aClass279_59.method6992(0))) {
			local460 = 2;
			arg0 = arg0.substring(Static476.aClass279_59.method6992(0).length());
		} else if (local18.startsWith(Static476.aClass279_60.method6992(0))) {
			local460 = 3;
			arg0 = arg0.substring(Static476.aClass279_60.method6992(0).length());
		} else if (local18.startsWith(Static476.aClass279_61.method6992(0))) {
			local460 = 4;
			arg0 = arg0.substring(Static476.aClass279_61.method6992(0).length());
		} else if (local18.startsWith(Static476.aClass279_62.method6992(0))) {
			local460 = 5;
			arg0 = arg0.substring(Static476.aClass279_62.method6992(0).length());
		} else if (Static141.anInt2658 != 0) {
			if (local18.startsWith(Static476.aClass279_58.method6992(Static141.anInt2658))) {
				local460 = 1;
				arg0 = arg0.substring(Static476.aClass279_58.method6992(Static141.anInt2658).length());
			} else if (local18.startsWith(Static476.aClass279_59.method6992(Static141.anInt2658))) {
				local460 = 2;
				arg0 = arg0.substring(Static476.aClass279_59.method6992(Static141.anInt2658).length());
			} else if (local18.startsWith(Static476.aClass279_60.method6992(Static141.anInt2658))) {
				local460 = 3;
				arg0 = arg0.substring(Static476.aClass279_60.method6992(Static141.anInt2658).length());
			} else if (local18.startsWith(Static476.aClass279_61.method6992(Static141.anInt2658))) {
				local460 = 4;
				arg0 = arg0.substring(Static476.aClass279_61.method6992(Static141.anInt2658).length());
			} else if (local18.startsWith(Static476.aClass279_62.method6992(Static141.anInt2658))) {
				local460 = 5;
				arg0 = arg0.substring(Static476.aClass279_62.method6992(Static141.anInt2658).length());
			}
		}
		@Pc(650) Class400 local650 = Static81.method1057();
		@Pc(656) Class3_Sub48 local656 = Static89.method1200(Static432.aClass286_74, local650.aClass399_2);
		local656.aClass3_Sub28_Sub2_1.method5329(0);
		@Pc(665) int local665 = local656.aClass3_Sub28_Sub2_1.anInt6241;
		local656.aClass3_Sub28_Sub2_1.method5329(local20);
		local656.aClass3_Sub28_Sub2_1.method5329(local460);
		Static32.method471(local656.aClass3_Sub28_Sub2_1, arg0);
		local656.aClass3_Sub28_Sub2_1.method5291(local656.aClass3_Sub28_Sub2_1.anInt6241 - local665);
		local650.method9223(local656);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(C)I")
	private static int method2827(@OriginalArg(0) char arg0) {
		return Static341.method5020(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "()V")
	public static void method2829() {
	}
}
