import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!fja", name = "y", descriptor = "[J")
	private static long[] aLongArray6;

	@OriginalMember(owner = "client!fja", name = "h", descriptor = "Lclient!wca;")
	private static Class5_Sub53 aClass5_Sub53_4;

	@OriginalMember(owner = "client!fja", name = "l", descriptor = "[I")
	private static int[] anIntArray153;

	@OriginalMember(owner = "client!fja", name = "m", descriptor = "Lclient!kp;")
	private static Class205 aClass205_1;

	@OriginalMember(owner = "client!fja", name = "z", descriptor = "Lclient!cn;")
	private static Class73 aClass73_9;

	@OriginalMember(owner = "client!fja", name = "d", descriptor = "Lclient!cn;")
	private static Class73 aClass73_10;

	@OriginalMember(owner = "client!fja", name = "i", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray25;

	@OriginalMember(owner = "client!fja", name = "c", descriptor = "Lclient!gca;")
	private static Class139 aClass139_1;

	@OriginalMember(owner = "client!fja", name = "o", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray24 = new String[1000];

	@OriginalMember(owner = "client!fja", name = "k", descriptor = "[I")
	private static final int[] anIntArray152 = new int[1000];

	@OriginalMember(owner = "client!fja", name = "B", descriptor = "[Lclient!wb;")
	private static final Class378[] aClass378Array1 = new Class378[50];

	@OriginalMember(owner = "client!fja", name = "C", descriptor = "I")
	private static int anInt2937 = 0;

	@OriginalMember(owner = "client!fja", name = "n", descriptor = "I")
	private static int anInt2938 = 0;

	@OriginalMember(owner = "client!fja", name = "u", descriptor = "I")
	private static int anInt2940 = 0;

	@OriginalMember(owner = "client!fja", name = "F", descriptor = "[I")
	private static final int[] anIntArray154 = new int[3];

	@OriginalMember(owner = "client!fja", name = "p", descriptor = "Lclient!wq;")
	public static final Class391 aClass391_19 = new Class391(4);

	@OriginalMember(owner = "client!fja", name = "s", descriptor = "[[I")
	private static final int[][] anIntArrayArray19 = new int[5][5000];

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "[I")
	private static final int[] anIntArray155 = new int[5];

	@OriginalMember(owner = "client!fja", name = "g", descriptor = "I")
	private static int anInt2945 = 0;

	@OriginalMember(owner = "client!fja", name = "D", descriptor = "[J")
	private static final long[] aLongArray7 = new long[1000];

	@OriginalMember(owner = "client!fja", name = "b", descriptor = "I")
	private static int anInt2949 = 0;

	@OriginalMember(owner = "client!fja", name = "e", descriptor = "(I)V")
	private static void method2506(@OriginalArg(0) int arg0) {
		@Pc(3) Class73 local3 = Static259.method3831(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class73[] local13 = Static175.aClass73ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class73[] local19 = Static489.aClass73ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static175.aClass73ArrayArray1[local9] = new Class73[local22];
			Static682.method797(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static682.method797(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "()V")
	public static void method2507() {
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(I)I")
	private static int method2508(@OriginalArg(0) int arg0) {
		@Pc(4) Class245 local4 = Static123.aClass234_1.method5395(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c113");
		}
		@Pc(29) Integer local29 = aClass205_1.method4888(local4.anInt6577, local4.anInt6576, Static256.aClass333_3.anInt9710 << 16 | local4.anInt6575);
		return local29 == null ? 0 : local29;
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(Lclient!um;II)V")
	public static void method2509(@OriginalArg(0) Class354 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class5_Sub5_Sub17 local5 = Static566.method8153(arg2, arg0, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray153 = new int[local5.anInt6687];
		aStringArray25 = new String[local5.anInt6682];
		if (local5.aClass354_13 == Static260.aClass354_8 || local5.aClass354_13 == Static390.aClass354_12 || local5.aClass354_13 == Static274.aClass354_10) {
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = 0;
			if (Static93.aClass73_21 != null) {
				local35 = Static93.aClass73_21.anInt1378;
				local37 = Static93.aClass73_21.anInt1375;
			}
			anIntArray153[0] = Static205.aClass107_1.method4079() - local35;
			anIntArray153[1] = Static205.aClass107_1.method4072() - local37;
		}
		method2511(local5, 200000);
	}

	@OriginalMember(owner = "client!fja", name = "b", descriptor = "(I)J")
	private static long method2510(@OriginalArg(0) int arg0) {
		@Pc(9) Long local9 = aClass205_1.method4891(Static256.aClass333_3.anInt9710 << 16 | arg0);
		return local9 == null ? -1L : local9;
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(Lclient!nf;I)V")
	private static void method2511(@OriginalArg(0) Class5_Sub5_Sub17 arg0, @OriginalArg(1) int arg1) {
		anInt2945 = 0;
		anInt2937 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray382;
		@Pc(11) int[] local11 = arg0.anIntArray381;
		@Pc(13) byte local13 = -1;
		anInt2940 = 0;
		@Pc(670) int local670;
		try {
			@Pc(17) int local17 = 0;
			label333: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(34) int local34 = local8[local5];
				if (local34 >= 150) {
					@Pc(1200) boolean local1200;
					if (local11[local5] == 1) {
						local1200 = true;
					} else {
						local1200 = false;
					}
					if (local34 >= 150 && local34 < 5000) {
						method2515(local34, local1200);
					} else if (local34 >= 5000 && local34 < 10000) {
						method2522(local34, local1200);
					} else {
						throw new IllegalStateException("Command: " + local34);
					}
				} else if (local34 == 0) {
					anIntArray152[anInt2945++] = local11[local5];
				} else {
					@Pc(60) int local60;
					if (local34 == 1) {
						local60 = local11[local5];
						anIntArray152[anInt2945++] = Static413.aClass118_1.anIntArray137[local60];
					} else if (local34 == 2) {
						local60 = local11[local5];
						Static413.aClass118_1.method2143(local60, anIntArray152[--anInt2945]);
					} else if (local34 == 3) {
						aStringArray24[anInt2937++] = arg0.aStringArray46[local5];
					} else if (local34 == 6) {
						local5 += local11[local5];
					} else if (local34 == 7) {
						anInt2945 -= 2;
						if (anIntArray152[anInt2945] != anIntArray152[anInt2945 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 8) {
						anInt2945 -= 2;
						if (anIntArray152[anInt2945] == anIntArray152[anInt2945 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 9) {
						anInt2945 -= 2;
						if (anIntArray152[anInt2945] < anIntArray152[anInt2945 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 10) {
						anInt2945 -= 2;
						if (anIntArray152[anInt2945] > anIntArray152[anInt2945 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 21) {
						if (anInt2940 == 0) {
							return;
						}
						@Pc(234) Class378 local234 = aClass378Array1[--anInt2940];
						arg0 = local234.aClass5_Sub5_Sub17_1;
						local8 = arg0.anIntArray382;
						local11 = arg0.anIntArray381;
						local5 = local234.anInt10538;
						anIntArray153 = local234.anIntArray585;
						aStringArray25 = local234.aStringArray74;
						aLongArray6 = local234.aLongArray24;
					} else if (local34 == 25) {
						local60 = local11[local5];
						anIntArray152[anInt2945++] = Static413.aClass118_1.method2141(local60);
					} else if (local34 == 27) {
						local60 = local11[local5];
						Static413.aClass118_1.method2145(anIntArray152[--anInt2945], local60);
					} else if (local34 == 31) {
						anInt2945 -= 2;
						if (anIntArray152[anInt2945] <= anIntArray152[anInt2945 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 32) {
						anInt2945 -= 2;
						if (anIntArray152[anInt2945] >= anIntArray152[anInt2945 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 33) {
						anIntArray152[anInt2945++] = anIntArray153[local11[local5]];
					} else if (local34 == 34) {
						anIntArray153[local11[local5]] = anIntArray152[--anInt2945];
					} else if (local34 == 35) {
						aStringArray24[anInt2937++] = aStringArray25[local11[local5]];
					} else if (local34 == 36) {
						aStringArray25[local11[local5]] = aStringArray24[--anInt2937];
					} else if (local34 == 37) {
						local60 = local11[local5];
						anInt2937 -= local60;
						@Pc(429) String local429 = Static171.method2492(anInt2937, aStringArray24, local60);
						aStringArray24[anInt2937++] = local429;
					} else if (local34 == 38) {
						anInt2945--;
					} else if (local34 == 39) {
						anInt2937--;
					} else if (local34 == 40) {
						local60 = local11[local5];
						@Pc(467) Class5_Sub5_Sub17 local467 = Static636.method8886(local60);
						if (local467 == null) {
							throw new RuntimeException();
						}
						@Pc(478) int[] local478 = new int[local467.anInt6687];
						@Pc(482) String[] local482 = new String[local467.anInt6682];
						@Pc(486) long[] local486 = new long[local467.anInt6686];
						for (@Pc(488) int local488 = 0; local488 < local467.anInt6683; local488++) {
							local478[local488] = anIntArray152[anInt2945 + local488 - local467.anInt6683];
						}
						for (@Pc(507) int local507 = 0; local507 < local467.anInt6681; local507++) {
							local482[local507] = aStringArray24[anInt2937 + local507 - local467.anInt6681];
						}
						for (@Pc(526) int local526 = 0; local526 < local467.anInt6685; local526++) {
							local486[local526] = aLongArray7[anInt2938 + local526 - local467.anInt6685];
						}
						anInt2945 -= local467.anInt6683;
						anInt2937 -= local467.anInt6681;
						anInt2938 -= local467.anInt6685;
						@Pc(562) Class378 local562 = new Class378();
						local562.aClass5_Sub5_Sub17_1 = arg0;
						local562.anInt10538 = local5;
						local562.anIntArray585 = anIntArray153;
						local562.aStringArray74 = aStringArray25;
						local562.aLongArray24 = aLongArray6;
						if (anInt2940 >= aClass378Array1.length) {
							throw new RuntimeException();
						}
						aClass378Array1[anInt2940++] = local562;
						arg0 = local467;
						local8 = local467.anIntArray382;
						local11 = local467.anIntArray381;
						local5 = -1;
						anIntArray153 = local478;
						aStringArray25 = local482;
						aLongArray6 = local486;
					} else if (local34 == 42) {
						anIntArray152[anInt2945++] = Static21.anIntArray24[local11[local5]];
					} else if (local34 == 43) {
						local60 = local11[local5];
						Static21.anIntArray24[local60] = anIntArray152[--anInt2945];
						Static577.method8287(local60);
						Static593.aBoolean754 |= Static433.aBooleanArray17[local60];
					} else if (local34 == 44) {
						local60 = local11[local5] >> 16;
						local670 = local11[local5] & 0xFFFF;
						@Pc(678) int local678 = anIntArray152[--anInt2945];
						if (local678 >= 0 && local678 <= 5000) {
							anIntArray155[local60] = local678;
							@Pc(696) byte local696 = -1;
							if (local670 == 105) {
								local696 = 0;
							}
							@Pc(703) int local703 = 0;
							while (true) {
								if (local703 >= local678) {
									continue label333;
								}
								anIntArrayArray19[local60][local703] = local696;
								local703++;
							}
						}
						throw new RuntimeException();
					} else if (local34 == 45) {
						local60 = local11[local5];
						local670 = anIntArray152[--anInt2945];
						if (local670 < 0 || local670 >= anIntArray155[local60]) {
							throw new RuntimeException();
						}
						anIntArray152[anInt2945++] = anIntArrayArray19[local60][local670];
					} else if (local34 == 46) {
						local60 = local11[local5];
						anInt2945 -= 2;
						local670 = anIntArray152[anInt2945];
						if (local670 < 0 || local670 >= anIntArray155[local60]) {
							throw new RuntimeException();
						}
						anIntArrayArray19[local60][local670] = anIntArray152[anInt2945 + 1];
					} else if (local34 == 47) {
						@Pc(807) String local807 = Static580.aStringArray69[local11[local5]];
						if (local807 == null) {
							local807 = "null";
						}
						aStringArray24[anInt2937++] = local807;
					} else if (local34 == 48) {
						local60 = local11[local5];
						Static580.aStringArray69[local60] = aStringArray24[--anInt2937];
						Static560.method8117(local60);
					} else if (local34 == 51) {
						@Pc(853) Class291 local853 = arg0.aClass291Array1[local11[local5]];
						@Pc(866) Class5_Sub29 local866 = (Class5_Sub29) local853.method6993((long) anIntArray152[--anInt2945], 1);
						if (local866 != null) {
							local5 += local866.anInt5492;
						}
					} else if (local34 == 54) {
						aLongArray7[anInt2938++] = arg0.aLongArray21[local5];
					} else if (local34 == 55) {
						anInt2938--;
					} else if (local34 == 66) {
						aLongArray7[anInt2938++] = aLongArray6[local11[local5]];
					} else if (local34 == 67) {
						aLongArray6[local11[local5]] = aLongArray7[--anInt2938];
					} else if (local34 == 68) {
						anInt2938 -= 2;
						if (aLongArray7[anInt2938] != aLongArray7[anInt2938 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 69) {
						anInt2938 -= 2;
						if (aLongArray7[anInt2938] == aLongArray7[anInt2938 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 70) {
						anInt2938 -= 2;
						if (aLongArray7[anInt2938] < aLongArray7[anInt2938 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 71) {
						anInt2938 -= 2;
						if (aLongArray7[anInt2938] > aLongArray7[anInt2938 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 72) {
						anInt2938 -= 2;
						if (aLongArray7[anInt2938] <= aLongArray7[anInt2938 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 73) {
						anInt2938 -= 2;
						if (aLongArray7[anInt2938] >= aLongArray7[anInt2938 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 86) {
						if (anIntArray152[--anInt2945] == 1) {
							local5 += local11[local5];
						}
					} else if (local34 == 87) {
						if (anIntArray152[--anInt2945] == 0) {
							local5 += local11[local5];
						}
					} else if (local34 == 112) {
						anIntArray152[anInt2945++] = method2517(local11[local5]);
					} else if (local34 == 113) {
						anIntArray152[anInt2945++] = method2508(local11[local5]);
					} else if (local34 == 114) {
						aLongArray7[anInt2938++] = method2510(local11[local5]);
					} else if (local34 == 115) {
						aStringArray24[anInt2937++] = method2521(local11[local5]);
					}
				}
			}
		} catch (@Pc(1243) Exception local1243) {
			@Pc(1264) StringBuffer local1264;
			if (arg0.aString91 == null) {
				local1264 = new StringBuffer(30);
				local1264.append("CS2: ").append(arg0.aLong314).append(" ");
				for (local670 = anInt2940 - 1; local670 >= 0; local670--) {
					local1264.append("v: ").append(aClass378Array1[local670].aClass5_Sub5_Sub17_1.aLong314).append(" ");
				}
				local1264.append("op: ").append(local13);
				Static405.method5934(local1264.toString(), local1243);
			} else {
				Static111.method1603("Clientscript error in: " + arg0.aString91);
				local1264 = new StringBuffer(30);
				local1264.append("Clientscript error in: ").append(arg0.aString91).append("\n");
				for (local670 = anInt2940 - 1; local670 >= 0; local670--) {
					local1264.append("via: ").append(aClass378Array1[local670].aClass5_Sub5_Sub17_1.aString91).append("\n");
				}
				local1264.append("Op: ").append(local13).append("\n");
				@Pc(1310) String local1310 = local1243.getMessage();
				if (local1310 != null && local1310.length() > 0) {
					local1264.append("Message: ").append(local1310).append("\n");
				}
				Static405.method5934(local1264.toString(), local1243);
				Static619.method3013(local1264.toString());
			}
		}
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method2512(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static539.anInt9221 == 0 && (Static31.aBoolean46 && !Static361.aBoolean474 || Static558.aBoolean721)) {
			return;
		}
		@Pc(18) String local18 = arg0.toLowerCase();
		@Pc(20) byte local20 = 0;
		if (local18.startsWith(Static582.aClass335_48.method8349(0))) {
			local20 = 0;
			arg0 = arg0.substring(Static582.aClass335_48.method8349(0).length());
		} else if (local18.startsWith(Static582.aClass335_49.method8349(0))) {
			local20 = 1;
			arg0 = arg0.substring(Static582.aClass335_49.method8349(0).length());
		} else if (local18.startsWith(Static582.aClass335_50.method8349(0))) {
			local20 = 2;
			arg0 = arg0.substring(Static582.aClass335_50.method8349(0).length());
		} else if (local18.startsWith(Static582.aClass335_51.method8349(0))) {
			local20 = 3;
			arg0 = arg0.substring(Static582.aClass335_51.method8349(0).length());
		} else if (local18.startsWith(Static582.aClass335_52.method8349(0))) {
			local20 = 4;
			arg0 = arg0.substring(Static582.aClass335_52.method8349(0).length());
		} else if (local18.startsWith(Static582.aClass335_53.method8349(0))) {
			local20 = 5;
			arg0 = arg0.substring(Static582.aClass335_53.method8349(0).length());
		} else if (local18.startsWith(Static582.aClass335_54.method8349(0))) {
			local20 = 6;
			arg0 = arg0.substring(Static582.aClass335_54.method8349(0).length());
		} else if (local18.startsWith(Static582.aClass335_55.method8349(0))) {
			local20 = 7;
			arg0 = arg0.substring(Static582.aClass335_55.method8349(0).length());
		} else if (local18.startsWith(Static582.aClass335_56.method8349(0))) {
			local20 = 8;
			arg0 = arg0.substring(Static582.aClass335_56.method8349(0).length());
		} else if (local18.startsWith(Static582.aClass335_57.method8349(0))) {
			local20 = 9;
			arg0 = arg0.substring(Static582.aClass335_57.method8349(0).length());
		} else if (local18.startsWith(Static582.aClass335_58.method8349(0))) {
			local20 = 10;
			arg0 = arg0.substring(Static582.aClass335_58.method8349(0).length());
		} else if (local18.startsWith(Static582.aClass335_59.method8349(0))) {
			local20 = 11;
			arg0 = arg0.substring(Static582.aClass335_59.method8349(0).length());
		} else if (Static323.anInt5795 != 0) {
			if (local18.startsWith(Static582.aClass335_48.method8349(Static323.anInt5795))) {
				local20 = 0;
				arg0 = arg0.substring(Static582.aClass335_48.method8349(Static323.anInt5795).length());
			} else if (local18.startsWith(Static582.aClass335_49.method8349(Static323.anInt5795))) {
				local20 = 1;
				arg0 = arg0.substring(Static582.aClass335_49.method8349(Static323.anInt5795).length());
			} else if (local18.startsWith(Static582.aClass335_50.method8349(Static323.anInt5795))) {
				local20 = 2;
				arg0 = arg0.substring(Static582.aClass335_50.method8349(Static323.anInt5795).length());
			} else if (local18.startsWith(Static582.aClass335_51.method8349(Static323.anInt5795))) {
				local20 = 3;
				arg0 = arg0.substring(Static582.aClass335_51.method8349(Static323.anInt5795).length());
			} else if (local18.startsWith(Static582.aClass335_52.method8349(Static323.anInt5795))) {
				local20 = 4;
				arg0 = arg0.substring(Static582.aClass335_52.method8349(Static323.anInt5795).length());
			} else if (local18.startsWith(Static582.aClass335_53.method8349(Static323.anInt5795))) {
				local20 = 5;
				arg0 = arg0.substring(Static582.aClass335_53.method8349(Static323.anInt5795).length());
			} else if (local18.startsWith(Static582.aClass335_54.method8349(Static323.anInt5795))) {
				local20 = 6;
				arg0 = arg0.substring(Static582.aClass335_54.method8349(Static323.anInt5795).length());
			} else if (local18.startsWith(Static582.aClass335_55.method8349(Static323.anInt5795))) {
				local20 = 7;
				arg0 = arg0.substring(Static582.aClass335_55.method8349(Static323.anInt5795).length());
			} else if (local18.startsWith(Static582.aClass335_56.method8349(Static323.anInt5795))) {
				local20 = 8;
				arg0 = arg0.substring(Static582.aClass335_56.method8349(Static323.anInt5795).length());
			} else if (local18.startsWith(Static582.aClass335_57.method8349(Static323.anInt5795))) {
				local20 = 9;
				arg0 = arg0.substring(Static582.aClass335_57.method8349(Static323.anInt5795).length());
			} else if (local18.startsWith(Static582.aClass335_58.method8349(Static323.anInt5795))) {
				local20 = 10;
				arg0 = arg0.substring(Static582.aClass335_58.method8349(Static323.anInt5795).length());
			} else if (local18.startsWith(Static582.aClass335_59.method8349(Static323.anInt5795))) {
				local20 = 11;
				arg0 = arg0.substring(Static582.aClass335_59.method8349(Static323.anInt5795).length());
			}
		}
		local18 = arg0.toLowerCase();
		@Pc(460) byte local460 = 0;
		if (local18.startsWith(Static582.aClass335_60.method8349(0))) {
			local460 = 1;
			arg0 = arg0.substring(Static582.aClass335_60.method8349(0).length());
		} else if (local18.startsWith(Static582.aClass335_61.method8349(0))) {
			local460 = 2;
			arg0 = arg0.substring(Static582.aClass335_61.method8349(0).length());
		} else if (local18.startsWith(Static582.aClass335_62.method8349(0))) {
			local460 = 3;
			arg0 = arg0.substring(Static582.aClass335_62.method8349(0).length());
		} else if (local18.startsWith(Static582.aClass335_63.method8349(0))) {
			local460 = 4;
			arg0 = arg0.substring(Static582.aClass335_63.method8349(0).length());
		} else if (local18.startsWith(Static582.aClass335_64.method8349(0))) {
			local460 = 5;
			arg0 = arg0.substring(Static582.aClass335_64.method8349(0).length());
		} else if (Static323.anInt5795 != 0) {
			if (local18.startsWith(Static582.aClass335_60.method8349(Static323.anInt5795))) {
				local460 = 1;
				arg0 = arg0.substring(Static582.aClass335_60.method8349(Static323.anInt5795).length());
			} else if (local18.startsWith(Static582.aClass335_61.method8349(Static323.anInt5795))) {
				local460 = 2;
				arg0 = arg0.substring(Static582.aClass335_61.method8349(Static323.anInt5795).length());
			} else if (local18.startsWith(Static582.aClass335_62.method8349(Static323.anInt5795))) {
				local460 = 3;
				arg0 = arg0.substring(Static582.aClass335_62.method8349(Static323.anInt5795).length());
			} else if (local18.startsWith(Static582.aClass335_63.method8349(Static323.anInt5795))) {
				local460 = 4;
				arg0 = arg0.substring(Static582.aClass335_63.method8349(Static323.anInt5795).length());
			} else if (local18.startsWith(Static582.aClass335_64.method8349(Static323.anInt5795))) {
				local460 = 5;
				arg0 = arg0.substring(Static582.aClass335_64.method8349(Static323.anInt5795).length());
			}
		}
		@Pc(652) Class5_Sub50 local652 = Static457.method6722(Static613.aClass387_117, Static80.aClass313_1);
		local652.aClass5_Sub23_Sub2_2.method8502(0);
		@Pc(661) int local661 = local652.aClass5_Sub23_Sub2_2.anInt9869;
		local652.aClass5_Sub23_Sub2_2.method8502(local20);
		local652.aClass5_Sub23_Sub2_2.method8502(local460);
		Static508.method7446(arg0, local652.aClass5_Sub23_Sub2_2);
		local652.aClass5_Sub23_Sub2_2.method8541(local652.aClass5_Sub23_Sub2_2.anInt9869 - local661);
		Static494.method7120(local652);
	}

	@OriginalMember(owner = "client!fja", name = "d", descriptor = "(I)V")
	private static void method2514(@OriginalArg(0) int arg0) {
		@Pc(3) Class73 local3 = Static259.method3831(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class73[] local13 = Static175.aClass73ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class73[] local19 = Static489.aClass73ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static175.aClass73ArrayArray1[local9] = new Class73[local22];
			Static682.method797(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static682.method797(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!fja", name = "c", descriptor = "(IZ)V")
	private static void method2515(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(153) Class73 local153;
		@Pc(21) int local21;
		@Pc(61) int local61;
		@Pc(27) int local27;
		@Pc(38) Class73 local38;
		@Pc(181) Class73 local181;
		@Pc(233) Class73 local233;
		@Pc(15) int local15;
		if (arg0 < 300) {
			if (arg0 == 150) {
				anInt2945 -= 3;
				local15 = anIntArray152[anInt2945];
				local21 = anIntArray152[anInt2945 + 1];
				local27 = anIntArray152[anInt2945 + 2];
				if (local21 == 0) {
					throw new RuntimeException();
				}
				local38 = Static259.method3831(local15);
				if (local38.aClass73Array1 == null) {
					local38.aClass73Array1 = new Class73[local27 + 1];
				}
				if (local38.aClass73Array1.length <= local27) {
					@Pc(59) Class73[] local59 = new Class73[local27 + 1];
					for (local61 = 0; local61 < local38.aClass73Array1.length; local61++) {
						local59[local61] = local38.aClass73Array1[local61];
					}
					local38.aClass73Array1 = local59;
				}
				if (local27 > 0 && local38.aClass73Array1[local27 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local27 - 1));
				}
				@Pc(111) Class73 local111 = new Class73();
				local111.anInt1391 = local21;
				local111.anInt1410 = local111.anInt1388 = local38.anInt1388;
				local111.anInt1364 = local27;
				local38.aClass73Array1[local27] = local111;
				if (arg1) {
					aClass73_10 = local111;
				} else {
					aClass73_9 = local111;
				}
				Static298.method4399(local38);
				return;
			}
			if (arg0 == 151) {
				local153 = arg1 ? aClass73_10 : aClass73_9;
				if (local153.anInt1364 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local181 = Static259.method3831(local153.anInt1388);
				local181.aClass73Array1[local153.anInt1364] = null;
				Static298.method4399(local181);
				return;
			}
			if (arg0 == 152) {
				local153 = Static259.method3831(anIntArray152[--anInt2945]);
				local153.aClass73Array1 = null;
				Static298.method4399(local153);
				return;
			}
			if (arg0 == 200) {
				anInt2945 -= 2;
				local15 = anIntArray152[anInt2945];
				local21 = anIntArray152[anInt2945 + 1];
				local233 = Static506.method9206(local15, local21);
				if (local233 != null && local21 != -1) {
					anIntArray152[anInt2945++] = 1;
					if (arg1) {
						aClass73_10 = local233;
						return;
					}
					aClass73_9 = local233;
					return;
				}
				anIntArray152[anInt2945++] = 0;
				return;
			}
			if (arg0 == 201) {
				local15 = anIntArray152[--anInt2945];
				local181 = Static259.method3831(local15);
				if (local181 != null) {
					anIntArray152[anInt2945++] = 1;
					if (arg1) {
						aClass73_10 = local181;
						return;
					}
					aClass73_9 = local181;
					return;
				}
				anIntArray152[anInt2945++] = 0;
				return;
			}
			if (arg0 == 202) {
				local15 = anIntArray152[--anInt2945];
				method2506(local15);
				return;
			}
			if (arg0 == 203) {
				local15 = anIntArray152[--anInt2945];
				method2514(local15);
				return;
			}
		} else {
			@Pc(392) int local392;
			@Pc(461) boolean local461;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt2945 -= 2;
					local15 = anIntArray152[anInt2945];
					local21 = anIntArray152[anInt2945 + 1];
					if (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass100_1 == null) {
						return;
					}
					for (local27 = 0; local27 < Static70.anIntArray53.length; local27++) {
						if (Static70.anIntArray53[local27] == local15) {
							Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass100_1.method1908(local21, Static133.aClass324_1, local27);
							return;
						}
					}
					for (local392 = 0; local392 < Static79.anIntArray57.length; local392++) {
						if (Static79.anIntArray57[local392] == local15) {
							Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass100_1.method1908(local21, Static133.aClass324_1, local392);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt2945 -= 2;
					local15 = anIntArray152[anInt2945];
					local21 = anIntArray152[anInt2945 + 1];
					if (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass100_1 == null) {
						return;
					}
					Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass100_1.method1900(local21, local15);
					return;
				}
				if (arg0 == 410) {
					local461 = anIntArray152[--anInt2945] != 0;
					if (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass100_1 == null) {
						return;
					}
					Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass100_1.method1897(local461);
					return;
				}
				if (arg0 == 411) {
					anInt2945 -= 2;
					local15 = anIntArray152[anInt2945];
					local21 = anIntArray152[anInt2945 + 1];
					if (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass100_1 == null) {
						return;
					}
					Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass100_1.method1901(Static201.aClass127_1, local21, local15);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local153 = Static259.method3831(anIntArray152[--anInt2945]);
				} else {
					local153 = arg1 ? aClass73_10 : aClass73_9;
				}
				if (arg0 == 1000) {
					anInt2945 -= 4;
					local153.anInt1377 = anIntArray152[anInt2945];
					local153.anInt1400 = anIntArray152[anInt2945 + 1];
					local21 = anIntArray152[anInt2945 + 2];
					if (local21 < 0) {
						local21 = 0;
					} else if (local21 > 5) {
						local21 = 5;
					}
					local27 = anIntArray152[anInt2945 + 3];
					if (local27 < 0) {
						local27 = 0;
					} else if (local27 > 5) {
						local27 = 5;
					}
					local153.aByte26 = (byte) local21;
					local153.aByte24 = (byte) local27;
					Static298.method4399(local153);
					Static309.method4714(local153);
					if (local153.anInt1364 == -1) {
						Static205.method2931(local153.anInt1388);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt2945 -= 4;
					local153.anInt1417 = anIntArray152[anInt2945];
					local153.anInt1383 = anIntArray152[anInt2945 + 1];
					local153.anInt1389 = 0;
					local153.anInt1380 = 0;
					local21 = anIntArray152[anInt2945 + 2];
					if (local21 < 0) {
						local21 = 0;
					} else if (local21 > 4) {
						local21 = 4;
					}
					local27 = anIntArray152[anInt2945 + 3];
					if (local27 < 0) {
						local27 = 0;
					} else if (local27 > 4) {
						local27 = 4;
					}
					local153.aByte25 = (byte) local21;
					local153.aByte27 = (byte) local27;
					Static298.method4399(local153);
					Static309.method4714(local153);
					if (local153.anInt1391 == 0) {
						Static547.method7962(local153, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(720) boolean local720 = anIntArray152[--anInt2945] == 1;
					if (local153.aBoolean130 != local720) {
						local153.aBoolean130 = local720;
						Static298.method4399(local153);
					}
					if (local153.anInt1364 == -1) {
						Static517.method7505(local153.anInt1388);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt2945 -= 2;
					local153.anInt1385 = anIntArray152[anInt2945];
					local153.anInt1386 = anIntArray152[anInt2945 + 1];
					Static298.method4399(local153);
					Static309.method4714(local153);
					if (local153.anInt1391 == 0) {
						Static547.method7962(local153, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local153.aBoolean134 = anIntArray152[--anInt2945] == 1;
					return;
				}
			} else {
				@Pc(1684) String local1684;
				@Pc(1287) String local1287;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local153 = Static259.method3831(anIntArray152[--anInt2945]);
					} else {
						local153 = arg1 ? aClass73_10 : aClass73_9;
					}
					if (arg0 == 1100) {
						anInt2945 -= 2;
						local153.anInt1376 = anIntArray152[anInt2945];
						if (local153.anInt1376 > local153.anInt1421 - local153.anInt1384) {
							local153.anInt1376 = local153.anInt1421 - local153.anInt1384;
						}
						if (local153.anInt1376 < 0) {
							local153.anInt1376 = 0;
						}
						local153.anInt1340 = anIntArray152[anInt2945 + 1];
						if (local153.anInt1340 > local153.anInt1414 - local153.anInt1394) {
							local153.anInt1340 = local153.anInt1414 - local153.anInt1394;
						}
						if (local153.anInt1340 < 0) {
							local153.anInt1340 = 0;
						}
						Static298.method4399(local153);
						if (local153.anInt1364 == -1) {
							Static493.method7097(local153.anInt1388);
						}
						return;
					}
					if (arg0 == 1101) {
						local153.anInt1382 = anIntArray152[--anInt2945];
						Static298.method4399(local153);
						if (local153.anInt1364 == -1) {
							Static289.method9262(local153.anInt1388);
						}
						return;
					}
					if (arg0 == 1102) {
						local153.aBoolean139 = anIntArray152[--anInt2945] == 1;
						Static298.method4399(local153);
						return;
					}
					if (arg0 == 1103) {
						local153.anInt1356 = anIntArray152[--anInt2945];
						Static298.method4399(local153);
						return;
					}
					if (arg0 == 1104) {
						local153.anInt1343 = anIntArray152[--anInt2945];
						Static298.method4399(local153);
						return;
					}
					if (arg0 == 1105) {
						local21 = anIntArray152[--anInt2945];
						if (local153.anInt1403 != local21) {
							local153.anInt1403 = local21;
							Static298.method4399(local153);
						}
						if (local153.anInt1364 == -1) {
							Static158.method2168(local153.anInt1388);
						}
						return;
					}
					if (arg0 == 1106) {
						local153.anInt1361 = anIntArray152[--anInt2945];
						Static298.method4399(local153);
						return;
					}
					if (arg0 == 1107) {
						local153.aBoolean132 = anIntArray152[--anInt2945] == 1;
						Static298.method4399(local153);
						return;
					}
					if (arg0 == 1108) {
						local153.anInt1374 = 1;
						local153.anInt1352 = anIntArray152[--anInt2945];
						Static298.method4399(local153);
						if (local153.anInt1364 == -1) {
							Static598.method8621(local153.anInt1388);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt2945 -= 6;
						local153.anInt1346 = anIntArray152[anInt2945];
						local153.anInt1328 = anIntArray152[anInt2945 + 1];
						local153.anInt1408 = anIntArray152[anInt2945 + 2];
						local153.anInt1392 = anIntArray152[anInt2945 + 3];
						local153.anInt1344 = anIntArray152[anInt2945 + 4];
						local153.anInt1371 = anIntArray152[anInt2945 + 5];
						Static298.method4399(local153);
						if (local153.anInt1364 == -1) {
							Static364.method5391(local153.anInt1388);
							Static462.method6756(local153.anInt1388);
						}
						return;
					}
					if (arg0 == 1110) {
						local21 = anIntArray152[--anInt2945];
						if (local153.anInt1401 != local21) {
							local153.anInt1401 = local21;
							local153.anInt1335 = 0;
							local153.anInt1373 = 1;
							local153.anInt1338 = 0;
							@Pc(1229) Class165 local1229 = local153.anInt1401 == -1 ? null : Static158.aClass317_1.method7882(local153.anInt1401, 100);
							if (local1229 != null) {
								Static388.method5661(local153.anInt1335, local1229);
							}
							Static298.method4399(local153);
						}
						if (local153.anInt1364 == -1) {
							Static550.method7985(local153.anInt1388);
						}
						return;
					}
					if (arg0 == 1111) {
						local153.aBoolean133 = anIntArray152[--anInt2945] == 1;
						Static298.method4399(local153);
						return;
					}
					if (arg0 == 1112) {
						local1287 = aStringArray24[--anInt2937];
						if (!local1287.equals(local153.aString25)) {
							local153.aString25 = local1287;
							Static298.method4399(local153);
						}
						if (local153.anInt1364 == -1) {
							Static303.method4655(local153.anInt1388);
						}
						return;
					}
					if (arg0 == 1113) {
						local153.anInt1358 = anIntArray152[--anInt2945];
						Static298.method4399(local153);
						if (local153.anInt1364 == -1) {
							Static26.method425(local153.anInt1388);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt2945 -= 3;
						local153.anInt1415 = anIntArray152[anInt2945];
						local153.anInt1402 = anIntArray152[anInt2945 + 1];
						local153.anInt1334 = anIntArray152[anInt2945 + 2];
						Static298.method4399(local153);
						return;
					}
					if (arg0 == 1115) {
						local153.aBoolean137 = anIntArray152[--anInt2945] == 1;
						Static298.method4399(local153);
						return;
					}
					if (arg0 == 1116) {
						local153.anInt1348 = anIntArray152[--anInt2945];
						Static298.method4399(local153);
						return;
					}
					if (arg0 == 1117) {
						local153.anInt1333 = anIntArray152[--anInt2945];
						Static298.method4399(local153);
						return;
					}
					if (arg0 == 1118) {
						local153.aBoolean128 = anIntArray152[--anInt2945] == 1;
						Static298.method4399(local153);
						return;
					}
					if (arg0 == 1119) {
						local153.aBoolean140 = anIntArray152[--anInt2945] == 1;
						Static298.method4399(local153);
						return;
					}
					if (arg0 == 1120) {
						anInt2945 -= 2;
						local153.anInt1421 = anIntArray152[anInt2945];
						local153.anInt1414 = anIntArray152[anInt2945 + 1];
						Static298.method4399(local153);
						if (local153.anInt1391 == 0) {
							Static547.method7962(local153, false);
						}
						return;
					}
					if (arg0 == 1122) {
						local153.aBoolean125 = anIntArray152[--anInt2945] == 1;
						Static298.method4399(local153);
						return;
					}
					if (arg0 == 1123) {
						local153.anInt1371 = anIntArray152[--anInt2945];
						Static298.method4399(local153);
						if (local153.anInt1364 == -1) {
							Static364.method5391(local153.anInt1388);
						}
						return;
					}
					if (arg0 == 1124) {
						local21 = anIntArray152[--anInt2945];
						local153.aBoolean135 = local21 == 1;
						Static298.method4399(local153);
						return;
					}
					if (arg0 == 1125) {
						anInt2945 -= 2;
						local153.anInt1363 = anIntArray152[anInt2945];
						local153.anInt1370 = anIntArray152[anInt2945 + 1];
						Static298.method4399(local153);
						return;
					}
					if (arg0 == 1126) {
						local153.anInt1422 = anIntArray152[--anInt2945];
						Static298.method4399(local153);
						return;
					}
					@Pc(1649) Class152 local1649;
					if (arg0 == 1127) {
						anInt2945 -= 2;
						local21 = anIntArray152[anInt2945];
						local27 = anIntArray152[anInt2945 + 1];
						local1649 = Static4.aClass355_1.method8693(local21);
						if (local27 != local1649.anInt3373) {
							local153.method1288(local27, local21);
							return;
						}
						local153.method1281(local21);
						return;
					}
					if (arg0 == 1128) {
						local21 = anIntArray152[--anInt2945];
						local1684 = aStringArray24[--anInt2937];
						local1649 = Static4.aClass355_1.method8693(local21);
						if (!local1649.aString49.equals(local1684)) {
							local153.method1274(local21, local1684);
							return;
						}
						local153.method1281(local21);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local21 = anIntArray152[--anInt2945];
						if ((local153.anInt1391 == 5 || arg0 != 1129) && (local153.anInt1391 == 4 || arg0 != 1130)) {
							if (local153.anInt1345 != local21) {
								local153.anInt1345 = local21;
								Static298.method4399(local153);
							}
							if (local153.anInt1364 == -1) {
								Static480.method6988(local153.anInt1388);
							}
							return;
						}
						return;
					}
					@Pc(1785) short local1785;
					@Pc(1792) short local1792;
					if (arg0 == 1131) {
						anInt2945 -= 3;
						local21 = anIntArray152[anInt2945];
						local1785 = (short) anIntArray152[anInt2945 + 1];
						local1792 = (short) anIntArray152[anInt2945 + 2];
						if (local21 >= 0 && local21 < 5) {
							local153.method1282(local1792, local21, local1785);
							Static298.method4399(local153);
							if (local153.anInt1364 == -1) {
								Static324.method8983(local153.anInt1388, local21);
							}
							return;
						}
						return;
					}
					if (arg0 == 1132) {
						anInt2945 -= 3;
						local21 = anIntArray152[anInt2945];
						local1785 = (short) anIntArray152[anInt2945 + 1];
						local1792 = (short) anIntArray152[anInt2945 + 2];
						if (local21 >= 0 && local21 < 5) {
							local153.method1292(local1785, local21, local1792);
							Static298.method4399(local153);
							if (local153.anInt1364 == -1) {
								Static492.method7094(local21, local153.anInt1388);
							}
							return;
						}
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2765) int local2765;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local153 = Static259.method3831(anIntArray152[--anInt2945]);
							} else {
								local153 = arg1 ? aClass73_10 : aClass73_9;
							}
							if (arg0 == 1499) {
								local153.method1289();
								return;
							}
							local1287 = aStringArray24[--anInt2937];
							@Pc(2864) int[] local2864 = null;
							if (local1287.length() > 0 && local1287.charAt(local1287.length() - 1) == 'Y') {
								local392 = anIntArray152[--anInt2945];
								if (local392 > 0) {
									local2864 = new int[local392];
									while (local392-- > 0) {
										local2864[local392] = anIntArray152[--anInt2945];
									}
								}
								local1287 = local1287.substring(0, local1287.length() - 1);
							}
							@Pc(2918) Object[] local2918 = new Object[local1287.length() + 1];
							for (local2765 = local2918.length - 1; local2765 >= 1; local2765--) {
								if (local1287.charAt(local2765 - 1) == 's') {
									local2918[local2765] = aStringArray24[--anInt2937];
								} else if (local1287.charAt(local2765 - 1) == '§') {
									local2918[local2765] = Long.valueOf(aLongArray7[--anInt2938]);
								} else {
									local2918[local2765] = Integer.valueOf(anIntArray152[--anInt2945]);
								}
							}
							local61 = anIntArray152[--anInt2945];
							if (local61 == -1) {
								local2918 = null;
							} else {
								local2918[0] = Integer.valueOf(local61);
							}
							if (arg0 == 1400) {
								local153.anObjectArray7 = local2918;
							} else if (arg0 == 1401) {
								local153.anObjectArray27 = local2918;
							} else if (arg0 == 1402) {
								local153.anObjectArray3 = local2918;
							} else if (arg0 == 1403) {
								local153.anObjectArray25 = local2918;
							} else if (arg0 == 1404) {
								local153.anObjectArray6 = local2918;
							} else if (arg0 == 1405) {
								local153.anObjectArray33 = local2918;
							} else if (arg0 == 1406) {
								local153.anObjectArray5 = local2918;
							} else if (arg0 == 1407) {
								local153.anObjectArray14 = local2918;
								local153.anIntArray71 = local2864;
							} else if (arg0 == 1408) {
								local153.anObjectArray23 = local2918;
							} else if (arg0 == 1409) {
								local153.anObjectArray31 = local2918;
							} else if (arg0 == 1410) {
								local153.anObjectArray24 = local2918;
							} else if (arg0 == 1411) {
								local153.anObjectArray12 = local2918;
							} else if (arg0 == 1412) {
								local153.anObjectArray9 = local2918;
							} else if (arg0 == 1414) {
								local153.anObjectArray4 = local2918;
								local153.anIntArray65 = local2864;
							} else if (arg0 == 1415) {
								local153.anObjectArray21 = local2918;
								local153.anIntArray62 = local2864;
							} else if (arg0 == 1416) {
								local153.anObjectArray16 = local2918;
							} else if (arg0 == 1417) {
								local153.lb = local2918;
							} else if (arg0 == 1418) {
								local153.anObjectArray10 = local2918;
							} else if (arg0 == 1419) {
								local153.anObjectArray2 = local2918;
							} else if (arg0 == 1420) {
								local153.anObjectArray28 = local2918;
							} else if (arg0 == 1421) {
								local153.anObjectArray17 = local2918;
							} else if (arg0 == 1422) {
								local153.anObjectArray29 = local2918;
							} else if (arg0 == 1423) {
								local153.anObjectArray18 = local2918;
							} else if (arg0 == 1424) {
								local153.anObjectArray11 = local2918;
							} else if (arg0 == 1425) {
								local153.anObjectArray20 = local2918;
							} else if (arg0 == 1426) {
								local153.anObjectArray13 = local2918;
							} else if (arg0 == 1427) {
								local153.anObjectArray26 = local2918;
							} else if (arg0 == 1428) {
								local153.anObjectArray32 = local2918;
								local153.anIntArray69 = local2864;
							} else if (arg0 == 1429) {
								local153.anObjectArray8 = local2918;
								local153.anIntArray72 = local2864;
							} else if (arg0 == 1430) {
								local153.anObjectArray30 = local2918;
							} else if (arg0 == 1431) {
								local153.anObjectArray15 = local2918;
							} else if (arg0 == 1432) {
								local153.anObjectArray22 = local2918;
							}
							local153.aBoolean127 = true;
							return;
						}
						if (arg0 < 1600) {
							local153 = arg1 ? aClass73_10 : aClass73_9;
							if (arg0 == 1500) {
								anIntArray152[anInt2945++] = local153.anInt1378;
								return;
							}
							if (arg0 == 1501) {
								anIntArray152[anInt2945++] = local153.anInt1375;
								return;
							}
							if (arg0 == 1502) {
								anIntArray152[anInt2945++] = local153.anInt1384;
								return;
							}
							if (arg0 == 1503) {
								anIntArray152[anInt2945++] = local153.anInt1394;
								return;
							}
							if (arg0 == 1504) {
								anIntArray152[anInt2945++] = local153.aBoolean130 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray152[anInt2945++] = local153.anInt1410;
								return;
							}
							if (arg0 == 1506) {
								local181 = Static446.method6636(local153);
								anIntArray152[anInt2945++] = local181 == null ? -1 : local181.anInt1388;
								return;
							}
						} else {
							@Pc(3613) Class152 local3613;
							if (arg0 < 1700) {
								local153 = arg1 ? aClass73_10 : aClass73_9;
								if (arg0 == 1600) {
									anIntArray152[anInt2945++] = local153.anInt1376;
									return;
								}
								if (arg0 == 1601) {
									anIntArray152[anInt2945++] = local153.anInt1340;
									return;
								}
								if (arg0 == 1602) {
									aStringArray24[anInt2937++] = local153.aString25;
									return;
								}
								if (arg0 == 1603) {
									anIntArray152[anInt2945++] = local153.anInt1421;
									return;
								}
								if (arg0 == 1604) {
									anIntArray152[anInt2945++] = local153.anInt1414;
									return;
								}
								if (arg0 == 1605) {
									anIntArray152[anInt2945++] = local153.anInt1371;
									return;
								}
								if (arg0 == 1606) {
									anIntArray152[anInt2945++] = local153.anInt1408;
									return;
								}
								if (arg0 == 1607) {
									anIntArray152[anInt2945++] = local153.anInt1344;
									return;
								}
								if (arg0 == 1608) {
									anIntArray152[anInt2945++] = local153.anInt1392;
									return;
								}
								if (arg0 == 1609) {
									anIntArray152[anInt2945++] = local153.anInt1356;
									return;
								}
								if (arg0 == 1610) {
									anIntArray152[anInt2945++] = local153.anInt1346;
									return;
								}
								if (arg0 == 1611) {
									anIntArray152[anInt2945++] = local153.anInt1328;
									return;
								}
								if (arg0 == 1612) {
									anIntArray152[anInt2945++] = local153.anInt1403;
									return;
								}
								if (arg0 == 1613) {
									local21 = anIntArray152[--anInt2945];
									local3613 = Static4.aClass355_1.method8693(local21);
									if (local3613.method2972()) {
										aStringArray24[anInt2937++] = local153.method1278(local3613.aString49, local21);
										return;
									}
									anIntArray152[anInt2945++] = local153.method1285(local21, local3613.anInt3373);
									return;
								}
								if (arg0 == 1614) {
									anIntArray152[anInt2945++] = local153.anInt1361;
									return;
								}
								if (arg0 == 2614) {
									anIntArray152[anInt2945++] = local153.anInt1374 == 1 ? local153.anInt1352 : -1;
									return;
								}
							} else if (arg0 < 1800) {
								local153 = arg1 ? aClass73_10 : aClass73_9;
								if (arg0 == 1700) {
									anIntArray152[anInt2945++] = local153.anInt1419;
									return;
								}
								if (arg0 == 1701) {
									if (local153.anInt1419 != -1) {
										anIntArray152[anInt2945++] = local153.anInt1369;
										return;
									}
									anIntArray152[anInt2945++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray152[anInt2945++] = local153.anInt1364;
									return;
								}
							} else if (arg0 < 1900) {
								local153 = arg1 ? aClass73_10 : aClass73_9;
								if (arg0 == 1800) {
									anIntArray152[anInt2945++] = Static81.method1252(local153).method7132();
									return;
								}
								if (arg0 == 1801) {
									local21 = anIntArray152[--anInt2945];
									local21--;
									if (local153.aStringArray7 != null && local21 < local153.aStringArray7.length && local153.aStringArray7[local21] != null) {
										aStringArray24[anInt2937++] = local153.aStringArray7[local21];
										return;
									}
									aStringArray24[anInt2937++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local153.aString22 == null) {
										aStringArray24[anInt2937++] = "";
										return;
									}
									aStringArray24[anInt2937++] = local153.aString22;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local153 = Static259.method3831(anIntArray152[--anInt2945]);
									arg0 -= 1000;
								} else {
									local153 = arg1 ? aClass73_10 : aClass73_9;
								}
								if (anInt2949 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local153.anObjectArray26 == null) {
										return;
									}
									@Pc(3920) Class5_Sub3 local3920 = new Class5_Sub3();
									local3920.aClass73_1 = local153;
									local3920.anObjectArray1 = local153.anObjectArray26;
									local3920.anInt326 = anInt2949 + 1;
									Static118.aClass102_3.method1921(local3920);
									return;
								}
							} else if (arg0 < 2600) {
								local153 = Static259.method3831(anIntArray152[--anInt2945]);
								if (arg0 == 2500) {
									anIntArray152[anInt2945++] = local153.anInt1378;
									return;
								}
								if (arg0 == 2501) {
									anIntArray152[anInt2945++] = local153.anInt1375;
									return;
								}
								if (arg0 == 2502) {
									anIntArray152[anInt2945++] = local153.anInt1384;
									return;
								}
								if (arg0 == 2503) {
									anIntArray152[anInt2945++] = local153.anInt1394;
									return;
								}
								if (arg0 == 2504) {
									anIntArray152[anInt2945++] = local153.aBoolean130 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray152[anInt2945++] = local153.anInt1410;
									return;
								}
								if (arg0 == 1506) {
									local181 = Static446.method6636(local153);
									anIntArray152[anInt2945++] = local181 == null ? -1 : local181.anInt1388;
									return;
								}
							} else if (arg0 < 2700) {
								local153 = Static259.method3831(anIntArray152[--anInt2945]);
								if (arg0 == 2600) {
									anIntArray152[anInt2945++] = local153.anInt1376;
									return;
								}
								if (arg0 == 2601) {
									anIntArray152[anInt2945++] = local153.anInt1340;
									return;
								}
								if (arg0 == 2602) {
									aStringArray24[anInt2937++] = local153.aString25;
									return;
								}
								if (arg0 == 2603) {
									anIntArray152[anInt2945++] = local153.anInt1421;
									return;
								}
								if (arg0 == 2604) {
									anIntArray152[anInt2945++] = local153.anInt1414;
									return;
								}
								if (arg0 == 2605) {
									anIntArray152[anInt2945++] = local153.anInt1371;
									return;
								}
								if (arg0 == 2606) {
									anIntArray152[anInt2945++] = local153.anInt1408;
									return;
								}
								if (arg0 == 2607) {
									anIntArray152[anInt2945++] = local153.anInt1344;
									return;
								}
								if (arg0 == 2608) {
									anIntArray152[anInt2945++] = local153.anInt1392;
									return;
								}
								if (arg0 == 2609) {
									anIntArray152[anInt2945++] = local153.anInt1356;
									return;
								}
								if (arg0 == 2610) {
									anIntArray152[anInt2945++] = local153.anInt1346;
									return;
								}
								if (arg0 == 2611) {
									anIntArray152[anInt2945++] = local153.anInt1328;
									return;
								}
								if (arg0 == 2612) {
									anIntArray152[anInt2945++] = local153.anInt1403;
									return;
								}
								if (arg0 == 2613) {
									anIntArray152[anInt2945++] = local153.anInt1361;
									return;
								}
								if (arg0 == 2614) {
									anIntArray152[anInt2945++] = local153.anInt1374 == 1 ? local153.anInt1352 : -1;
									return;
								}
							} else {
								@Pc(4483) Class5_Sub49 local4483;
								@Pc(4376) Class5_Sub49 local4376;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local153 = Static259.method3831(anIntArray152[--anInt2945]);
										anIntArray152[anInt2945++] = local153.anInt1419;
										return;
									}
									if (arg0 == 2701) {
										local153 = Static259.method3831(anIntArray152[--anInt2945]);
										if (local153.anInt1419 != -1) {
											anIntArray152[anInt2945++] = local153.anInt1369;
											return;
										}
										anIntArray152[anInt2945++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local15 = anIntArray152[--anInt2945];
										local4376 = (Class5_Sub49) Static549.aClass291_37.method6993((long) local15, 1);
										if (local4376 != null) {
											anIntArray152[anInt2945++] = 1;
											return;
										}
										anIntArray152[anInt2945++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local153 = Static259.method3831(anIntArray152[--anInt2945]);
										if (local153.aClass73Array1 == null) {
											anIntArray152[anInt2945++] = 0;
											return;
										}
										local21 = local153.aClass73Array1.length;
										for (local27 = 0; local27 < local153.aClass73Array1.length; local27++) {
											if (local153.aClass73Array1[local27] == null) {
												local21 = local27;
												break;
											}
										}
										anIntArray152[anInt2945++] = local21;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt2945 -= 2;
										local15 = anIntArray152[anInt2945];
										local21 = anIntArray152[anInt2945 + 1];
										local4483 = (Class5_Sub49) Static549.aClass291_37.method6993((long) local15, 1);
										if (local4483 != null && local4483.anInt9322 == local21) {
											anIntArray152[anInt2945++] = 1;
											return;
										}
										anIntArray152[anInt2945++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local153 = Static259.method3831(anIntArray152[--anInt2945]);
									if (arg0 == 2800) {
										anIntArray152[anInt2945++] = Static81.method1252(local153).method7132();
										return;
									}
									if (arg0 == 2801) {
										local21 = anIntArray152[--anInt2945];
										local21--;
										if (local153.aStringArray7 != null && local21 < local153.aStringArray7.length && local153.aStringArray7[local21] != null) {
											aStringArray24[anInt2937++] = local153.aStringArray7[local21];
											return;
										}
										aStringArray24[anInt2937++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local153.aString22 == null) {
											aStringArray24[anInt2937++] = "";
											return;
										}
										aStringArray24[anInt2937++] = local153.aString22;
										return;
									}
								} else {
									@Pc(4725) Class5_Sub50 local4725;
									@Pc(4634) String local4634;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local4634 = aStringArray24[--anInt2937];
											Static595.method8610(local4634);
											return;
										}
										if (arg0 == 3101) {
											anInt2945 -= 2;
											Static260.method3839(anIntArray152[anInt2945 + 1], Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1, anIntArray152[anInt2945]);
											return;
										}
										if (arg0 == 3103) {
											Static469.method6849();
											return;
										}
										if (arg0 == 3104) {
											local4634 = aStringArray24[--anInt2937];
											local21 = 0;
											if (Static81.method1263(local4634)) {
												local21 = Static595.method8613(local4634);
											}
											@Pc(4696) Class5_Sub50 local4696 = Static457.method6722(Static61.aClass387_17, Static80.aClass313_1);
											local4696.aClass5_Sub23_Sub2_2.method8486(local21);
											Static494.method7120(local4696);
											return;
										}
										if (arg0 == 3105) {
											local4634 = aStringArray24[--anInt2937];
											local4725 = Static457.method6722(Static41.aClass387_13, Static80.aClass313_1);
											local4725.aClass5_Sub23_Sub2_2.method8502(local4634.length() + 1);
											local4725.aClass5_Sub23_Sub2_2.method8538(local4634);
											Static494.method7120(local4725);
											return;
										}
										if (arg0 == 3106) {
											local4634 = aStringArray24[--anInt2937];
											local4725 = Static457.method6722(Static386.aClass387_68, Static80.aClass313_1);
											local4725.aClass5_Sub23_Sub2_2.method8502(local4634.length() + 1);
											local4725.aClass5_Sub23_Sub2_2.method8538(local4634);
											Static494.method7120(local4725);
											return;
										}
										if (arg0 == 3107) {
											local15 = anIntArray152[--anInt2945];
											local1287 = aStringArray24[--anInt2937];
											Static197.method8876(local1287, local15);
											return;
										}
										if (arg0 == 3108) {
											anInt2945 -= 3;
											local15 = anIntArray152[anInt2945];
											local21 = anIntArray152[anInt2945 + 1];
											local27 = anIntArray152[anInt2945 + 2];
											local38 = Static259.method3831(local27);
											Static192.method3809(local21, local15, local38);
											return;
										}
										if (arg0 == 3109) {
											anInt2945 -= 2;
											local15 = anIntArray152[anInt2945];
											local21 = anIntArray152[anInt2945 + 1];
											local233 = arg1 ? aClass73_10 : aClass73_9;
											Static192.method3809(local21, local15, local233);
											return;
										}
										if (arg0 == 3110) {
											local15 = anIntArray152[--anInt2945];
											local4725 = Static457.method6722(Static577.aClass387_109, Static80.aClass313_1);
											local4725.aClass5_Sub23_Sub2_2.method8480(local15);
											Static494.method7120(local4725);
											return;
										}
										if (arg0 == 3111) {
											anInt2945 -= 2;
											local15 = anIntArray152[anInt2945];
											local21 = anIntArray152[anInt2945 + 1];
											local4483 = (Class5_Sub49) Static549.aClass291_37.method6993((long) local15, 1);
											if (local4483 != null) {
												Static372.method7048(local4483, local4483.anInt9322 != local21, true);
											}
											Static470.method7565(3, local21, local15, true);
											return;
										}
										if (arg0 == 3112) {
											anInt2945--;
											local15 = anIntArray152[anInt2945];
											local4376 = (Class5_Sub49) Static549.aClass291_37.method6993((long) local15, 1);
											if (local4376 != null && local4376.anInt9318 == 3) {
												Static372.method7048(local4376, true, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static644.method8989(aStringArray24[--anInt2937]);
											return;
										}
										if (arg0 == 3114) {
											anInt2945 -= 2;
											local15 = anIntArray152[anInt2945];
											local21 = anIntArray152[anInt2945 + 1];
											local1684 = aStringArray24[--anInt2937];
											Static177.method2584("", local1684, "", local21, local15, "");
											return;
										}
										if (arg0 == 3115) {
											anInt2945 -= 11;
											@Pc(5035) Class219[] local5035 = Static67.method1093();
											@Pc(5038) Class368[] local5038 = Static290.method4382();
											Static197.method8879(anIntArray152[anInt2945 + 10], anIntArray152[anInt2945 + 4], local5035[anIntArray152[anInt2945]], anIntArray152[anInt2945 + 5], anIntArray152[anInt2945 + 7], anIntArray152[anInt2945 + 3], anIntArray152[anInt2945 + 6], local5038[anIntArray152[anInt2945 + 1]], anIntArray152[anInt2945 + 2], anIntArray152[anInt2945 + 8], anIntArray152[anInt2945 + 9]);
											return;
										}
										if (arg0 == 3116) {
											local15 = anIntArray152[--anInt2945];
											local4725 = Static457.method6722(Static224.aClass387_43, Static80.aClass313_1);
											local4725.aClass5_Sub23_Sub2_2.method8480(local15);
											Static494.method7120(local4725);
											return;
										}
										if (arg0 == 3117) {
											local4634 = aStringArray24[--anInt2937];
											local4725 = Static457.method6722(Static523.aClass387_96, Static80.aClass313_1);
											local4725.aClass5_Sub23_Sub2_2.method8502(local4634.length() + 1);
											local4725.aClass5_Sub23_Sub2_2.method8538(local4634);
											Static494.method7120(local4725);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt2945 -= 3;
											Static443.method6563(anIntArray152[anInt2945 + 2], 256, anIntArray152[anInt2945 + 1], 255, anIntArray152[anInt2945]);
											return;
										}
										if (arg0 == 3201) {
											Static474.method6908(anIntArray152[--anInt2945], 255, 50);
											return;
										}
										if (arg0 == 3202) {
											anInt2945 -= 2;
											Static530.method7638(anIntArray152[anInt2945], anIntArray152[anInt2945 + 1], 255);
											return;
										}
										if (arg0 == 3203) {
											anInt2945 -= 4;
											Static443.method6563(anIntArray152[anInt2945 + 2], 256, anIntArray152[anInt2945 + 1], anIntArray152[anInt2945 + 3], anIntArray152[anInt2945]);
											return;
										}
										if (arg0 == 3204) {
											anInt2945 -= 3;
											Static474.method6908(anIntArray152[anInt2945], anIntArray152[anInt2945 + 1], anIntArray152[anInt2945 + 2]);
											return;
										}
										if (arg0 == 3205) {
											anInt2945 -= 3;
											Static530.method7638(anIntArray152[anInt2945], anIntArray152[anInt2945 + 1], anIntArray152[anInt2945 + 2]);
											return;
										}
										if (arg0 == 3206) {
											anInt2945 -= 4;
											Static391.method5714(anIntArray152[anInt2945 + 3], anIntArray152[anInt2945 + 2], anIntArray152[anInt2945], 256, anIntArray152[anInt2945 + 1], false);
											return;
										}
										if (arg0 == 3207) {
											anInt2945 -= 4;
											Static391.method5714(anIntArray152[anInt2945 + 3], anIntArray152[anInt2945 + 2], anIntArray152[anInt2945], 256, anIntArray152[anInt2945 + 1], true);
											return;
										}
										if (arg0 == 3208) {
											anInt2945 -= 5;
											Static443.method6563(anIntArray152[anInt2945 + 2], anIntArray152[anInt2945 + 4], anIntArray152[anInt2945 + 1], anIntArray152[anInt2945 + 3], anIntArray152[anInt2945]);
											return;
										}
										if (arg0 == 3209) {
											anInt2945 -= 5;
											Static391.method5714(anIntArray152[anInt2945 + 3], anIntArray152[anInt2945 + 2], anIntArray152[anInt2945], anIntArray152[anInt2945 + 4], anIntArray152[anInt2945 + 1], false);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray152[anInt2945++] = Static44.anInt740;
											return;
										}
										if (arg0 == 3301) {
											anInt2945 -= 2;
											local15 = anIntArray152[anInt2945];
											local21 = anIntArray152[anInt2945 + 1];
											anIntArray152[anInt2945++] = Static161.method2194(false, local15, local21);
											return;
										}
										if (arg0 == 3302) {
											anInt2945 -= 2;
											local15 = anIntArray152[anInt2945];
											local21 = anIntArray152[anInt2945 + 1];
											anIntArray152[anInt2945++] = Static165.method2349(false, local21, local15);
											return;
										}
										if (arg0 == 3303) {
											anInt2945 -= 2;
											local15 = anIntArray152[anInt2945];
											local21 = anIntArray152[anInt2945 + 1];
											anIntArray152[anInt2945++] = Static500.method7162(local15, local21, false);
											return;
										}
										if (arg0 == 3304) {
											local15 = anIntArray152[--anInt2945];
											anIntArray152[anInt2945++] = Static163.aClass122_1.method2209(local15).anInt1098;
											return;
										}
										if (arg0 == 3305) {
											local15 = anIntArray152[--anInt2945];
											anIntArray152[anInt2945++] = Static370.anIntArray580[local15];
											return;
										}
										if (arg0 == 3306) {
											local15 = anIntArray152[--anInt2945];
											anIntArray152[anInt2945++] = Static62.anIntArray51[local15];
											return;
										}
										if (arg0 == 3307) {
											local15 = anIntArray152[--anInt2945];
											anIntArray152[anInt2945++] = Static108.anIntArray94[local15];
											return;
										}
										if (arg0 == 3308) {
											@Pc(5640) byte local5640 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aByte145;
											local21 = (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355 >> 9) + Static622.anInt10188;
											local27 = (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363 >> 9) + Static668.anInt10683;
											anIntArray152[anInt2945++] = (local5640 << 28) + (local21 << 14) + local27;
											return;
										}
										if (arg0 == 3309) {
											local15 = anIntArray152[--anInt2945];
											anIntArray152[anInt2945++] = local15 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local15 = anIntArray152[--anInt2945];
											anIntArray152[anInt2945++] = local15 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local15 = anIntArray152[--anInt2945];
											anIntArray152[anInt2945++] = local15 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray152[anInt2945++] = Static475.aBoolean605 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt2945 -= 2;
											local15 = anIntArray152[anInt2945];
											local21 = anIntArray152[anInt2945 + 1];
											anIntArray152[anInt2945++] = Static161.method2194(true, local15, local21);
											return;
										}
										if (arg0 == 3314) {
											anInt2945 -= 2;
											local15 = anIntArray152[anInt2945];
											local21 = anIntArray152[anInt2945 + 1];
											anIntArray152[anInt2945++] = Static165.method2349(true, local21, local15);
											return;
										}
										if (arg0 == 3315) {
											anInt2945 -= 2;
											local15 = anIntArray152[anInt2945];
											local21 = anIntArray152[anInt2945 + 1];
											anIntArray152[anInt2945++] = Static500.method7162(local15, local21, true);
											return;
										}
										if (arg0 == 3316) {
											if (Static539.anInt9221 >= 2) {
												anIntArray152[anInt2945++] = Static539.anInt9221;
												return;
											}
											anIntArray152[anInt2945++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray152[anInt2945++] = Static142.anInt2314;
											return;
										}
										if (arg0 == 3318) {
											anIntArray152[anInt2945++] = Static197.aClass54_35.anInt869;
											return;
										}
										if (arg0 == 3321) {
											anIntArray152[anInt2945++] = Static155.anInt2440;
											return;
										}
										if (arg0 == 3322) {
											anIntArray152[anInt2945++] = Static141.anInt4798;
											return;
										}
										if (arg0 == 3323) {
											if (Static328.anInt5869 >= 5 && Static328.anInt5869 <= 9) {
												anIntArray152[anInt2945++] = 1;
												return;
											}
											anIntArray152[anInt2945++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static328.anInt5869 >= 5 && Static328.anInt5869 <= 9) {
												anIntArray152[anInt2945++] = Static328.anInt5869;
												return;
											}
											anIntArray152[anInt2945++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray152[anInt2945++] = Static510.aBoolean660 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray152[anInt2945++] = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt4205;
											return;
										}
										if (arg0 == 3327) {
											anIntArray152[anInt2945++] = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass100_1 != null && Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass100_1.aBoolean189 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray152[anInt2945++] = Static558.aBoolean721 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local15 = anIntArray152[--anInt2945];
											anIntArray152[anInt2945++] = Static656.method9061(local15);
											return;
										}
										if (arg0 == 3331) {
											anInt2945 -= 2;
											local15 = anIntArray152[anInt2945];
											local21 = anIntArray152[anInt2945 + 1];
											anIntArray152[anInt2945++] = Static270.method4026(local15, local21, false);
											return;
										}
										if (arg0 == 3332) {
											anInt2945 -= 2;
											local15 = anIntArray152[anInt2945];
											local21 = anIntArray152[anInt2945 + 1];
											anIntArray152[anInt2945++] = Static270.method4026(local15, local21, true);
											return;
										}
										if (arg0 == 3333) {
											anIntArray152[anInt2945++] = Static560.method8120();
											return;
										}
										if (arg0 == 3335) {
											anIntArray152[anInt2945++] = Static323.anInt5795;
											return;
										}
										if (arg0 == 3336) {
											anInt2945 -= 4;
											local15 = anIntArray152[anInt2945];
											local21 = anIntArray152[anInt2945 + 1];
											local27 = anIntArray152[anInt2945 + 2];
											local392 = anIntArray152[anInt2945 + 3];
											local15 += local21 << 14;
											local15 += local27 << 28;
											local15 += local392;
											anIntArray152[anInt2945++] = local15;
											return;
										}
										if (arg0 == 3337) {
											anIntArray152[anInt2945++] = Static456.anInt7813;
											return;
										}
										if (arg0 == 3338) {
											anIntArray152[anInt2945++] = Static80.method1205();
											return;
										}
										if (arg0 == 3339) {
											anIntArray152[anInt2945++] = 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray152[anInt2945++] = Static429.aBoolean567 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray152[anInt2945++] = Static287.aBoolean389 ? 1 : 0;
											return;
										}
										if (arg0 == 3342) {
											anIntArray152[anInt2945++] = Static205.aClass107_1.method4079();
											return;
										}
										if (arg0 == 3343) {
											anIntArray152[anInt2945++] = Static205.aClass107_1.method4072();
											return;
										}
										if (arg0 == 3344) {
											aStringArray24[anInt2937++] = Static60.method858();
											return;
										}
										if (arg0 == 3345) {
											aStringArray24[anInt2937++] = Static133.method1931();
											return;
										}
										if (arg0 == 3346) {
											anIntArray152[anInt2945++] = Static215.method3081();
											return;
										}
										if (arg0 == 3347) {
											anIntArray152[anInt2945++] = Static581.anInt9736;
											return;
										}
										if (arg0 == 3349) {
											anIntArray152[anInt2945++] = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass270_7.method6422(5) >> 3;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(6444) Class200 local6444;
										if (arg0 == 3400) {
											anInt2945 -= 2;
											local15 = anIntArray152[anInt2945];
											local21 = anIntArray152[anInt2945 + 1];
											local6444 = Static102.aClass156_20.method3083(local15);
											aStringArray24[anInt2937++] = local6444.method4720(local21);
											return;
										}
										if (arg0 == 3408) {
											anInt2945 -= 4;
											local15 = anIntArray152[anInt2945];
											local21 = anIntArray152[anInt2945 + 1];
											local27 = anIntArray152[anInt2945 + 2];
											local392 = anIntArray152[anInt2945 + 3];
											@Pc(6490) Class200 local6490 = Static102.aClass156_20.method3083(local27);
											if (local6490.aChar3 == local15 && local6490.aChar4 == local21) {
												if (local21 == 115) {
													aStringArray24[anInt2937++] = local6490.method4720(local392);
													return;
												}
												anIntArray152[anInt2945++] = local6490.method4724(local392);
												return;
											}
											throw new RuntimeException("C3408-1 " + local27 + "-" + local392);
										}
										if (arg0 == 3409) {
											anInt2945 -= 3;
											local15 = anIntArray152[anInt2945];
											local21 = anIntArray152[anInt2945 + 1];
											local27 = anIntArray152[anInt2945 + 2];
											if (local21 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(6585) Class200 local6585 = Static102.aClass156_20.method3083(local21);
											if (local6585.aChar4 != local15) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray152[anInt2945++] = local6585.method4723(local27) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local15 = anIntArray152[--anInt2945];
											local1287 = aStringArray24[--anInt2937];
											if (local15 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local6444 = Static102.aClass156_20.method3083(local15);
											if (local6444.aChar4 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray152[anInt2945++] = local6444.method4722(local1287) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local15 = anIntArray152[--anInt2945];
											@Pc(6694) Class200 local6694 = Static102.aClass156_20.method3083(local15);
											anIntArray152[anInt2945++] = local6694.aClass291_20.method6995();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static205.anInt3334 == 0) {
												anIntArray152[anInt2945++] = -2;
												return;
											}
											if (Static205.anInt3334 == 1) {
												anIntArray152[anInt2945++] = -1;
												return;
											}
											anIntArray152[anInt2945++] = Static463.anInt7895;
											return;
										}
										if (arg0 == 3601) {
											local15 = anIntArray152[--anInt2945];
											if (Static205.anInt3334 == 2 && local15 < Static463.anInt7895) {
												aStringArray24[anInt2937++] = Static444.aStringArray54[local15];
												if (Static446.aStringArray57[local15] != null) {
													aStringArray24[anInt2937++] = Static446.aStringArray57[local15];
													return;
												}
												aStringArray24[anInt2937++] = "";
												return;
											}
											aStringArray24[anInt2937++] = "";
											aStringArray24[anInt2937++] = "";
											return;
										}
										if (arg0 == 3602) {
											local15 = anIntArray152[--anInt2945];
											if (Static205.anInt3334 == 2 && local15 < Static463.anInt7895) {
												anIntArray152[anInt2945++] = Static279.anIntArray271[local15];
												return;
											}
											anIntArray152[anInt2945++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local15 = anIntArray152[--anInt2945];
											if (Static205.anInt3334 == 2 && local15 < Static463.anInt7895) {
												anIntArray152[anInt2945++] = Static105.anIntArray91[local15];
												return;
											}
											anIntArray152[anInt2945++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local4634 = aStringArray24[--anInt2937];
											local21 = anIntArray152[--anInt2945];
											Static670.method9243(local4634, local21);
											return;
										}
										if (arg0 == 3605) {
											local4634 = aStringArray24[--anInt2937];
											Static468.method6844(local4634);
											return;
										}
										if (arg0 == 3606) {
											local4634 = aStringArray24[--anInt2937];
											Static415.method8265(local4634);
											return;
										}
										if (arg0 == 3607) {
											local4634 = aStringArray24[--anInt2937];
											Static437.method6491(local4634, false);
											return;
										}
										if (arg0 == 3608) {
											local4634 = aStringArray24[--anInt2937];
											Static362.method9330(local4634);
											return;
										}
										if (arg0 == 3609) {
											local4634 = aStringArray24[--anInt2937];
											if (local4634.startsWith("<img=0>") || local4634.startsWith("<img=1>")) {
												local4634 = local4634.substring(7);
											}
											anIntArray152[anInt2945++] = Static88.method6670(local4634) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local15 = anIntArray152[--anInt2945];
											if (Static205.anInt3334 == 2 && local15 < Static463.anInt7895) {
												aStringArray24[anInt2937++] = Static95.aStringArray9[local15];
												return;
											}
											aStringArray24[anInt2937++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static119.aString33 != null) {
												aStringArray24[anInt2937++] = Static326.method4970(Static119.aString33);
												return;
											}
											aStringArray24[anInt2937++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static119.aString33 != null) {
												anIntArray152[anInt2945++] = Static7.anInt86;
												return;
											}
											anIntArray152[anInt2945++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local15 = anIntArray152[--anInt2945];
											if (Static119.aString33 != null && local15 < Static7.anInt86) {
												aStringArray24[anInt2937++] = Static191.aClass349Array1[local15].aString128;
												return;
											}
											aStringArray24[anInt2937++] = "";
											return;
										}
										if (arg0 == 3614) {
											local15 = anIntArray152[--anInt2945];
											if (Static119.aString33 != null && local15 < Static7.anInt86) {
												anIntArray152[anInt2945++] = Static191.aClass349Array1[local15].anInt10075;
												return;
											}
											anIntArray152[anInt2945++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local15 = anIntArray152[--anInt2945];
											if (Static119.aString33 != null && local15 < Static7.anInt86) {
												anIntArray152[anInt2945++] = Static191.aClass349Array1[local15].aByte142;
												return;
											}
											anIntArray152[anInt2945++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray152[anInt2945++] = Static37.aByte15;
											return;
										}
										if (arg0 == 3617) {
											local4634 = aStringArray24[--anInt2937];
											Static194.method2801(local4634);
											return;
										}
										if (arg0 == 3618) {
											anIntArray152[anInt2945++] = Static677.aByte150;
											return;
										}
										if (arg0 == 3619) {
											local4634 = aStringArray24[--anInt2937];
											Static566.method8150(local4634);
											return;
										}
										if (arg0 == 3620) {
											Static572.method5298();
											return;
										}
										if (arg0 == 3621) {
											if (Static205.anInt3334 == 0) {
												anIntArray152[anInt2945++] = -1;
												return;
											}
											anIntArray152[anInt2945++] = Static453.anInt7761;
											return;
										}
										if (arg0 == 3622) {
											local15 = anIntArray152[--anInt2945];
											if (Static205.anInt3334 != 0 && local15 < Static453.anInt7761) {
												aStringArray24[anInt2937++] = Static197.aStringArray73[local15];
												if (Static430.aStringArray43[local15] != null) {
													aStringArray24[anInt2937++] = Static430.aStringArray43[local15];
													return;
												}
												aStringArray24[anInt2937++] = "";
												return;
											}
											aStringArray24[anInt2937++] = "";
											aStringArray24[anInt2937++] = "";
											return;
										}
										if (arg0 == 3623) {
											local4634 = aStringArray24[--anInt2937];
											if (local4634.startsWith("<img=0>") || local4634.startsWith("<img=1>")) {
												local4634 = local4634.substring(7);
											}
											anIntArray152[anInt2945++] = Static393.method6334(local4634) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local15 = anIntArray152[--anInt2945];
											if (Static191.aClass349Array1 != null && local15 < Static7.anInt86 && Static191.aClass349Array1[local15].aString127.equalsIgnoreCase(Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aString62)) {
												anIntArray152[anInt2945++] = 1;
												return;
											}
											anIntArray152[anInt2945++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static81.aString20 != null) {
												aStringArray24[anInt2937++] = Static81.aString20;
												return;
											}
											aStringArray24[anInt2937++] = "";
											return;
										}
										if (arg0 == 3626) {
											local15 = anIntArray152[--anInt2945];
											if (Static119.aString33 != null && local15 < Static7.anInt86) {
												aStringArray24[anInt2937++] = Static191.aClass349Array1[local15].aString129;
												return;
											}
											aStringArray24[anInt2937++] = "";
											return;
										}
										if (arg0 == 3627) {
											local15 = anIntArray152[--anInt2945];
											if (Static205.anInt3334 == 2 && local15 >= 0 && local15 < Static463.anInt7895) {
												anIntArray152[anInt2945++] = Static514.aBooleanArray20[local15] ? 1 : 0;
												return;
											}
											anIntArray152[anInt2945++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local4634 = aStringArray24[--anInt2937];
											if (local4634.startsWith("<img=0>") || local4634.startsWith("<img=1>")) {
												local4634 = local4634.substring(7);
											}
											anIntArray152[anInt2945++] = Static264.method3874(local4634);
											return;
										}
										if (arg0 == 3629) {
											anIntArray152[anInt2945++] = Static650.anInt2312;
											return;
										}
										if (arg0 == 3630) {
											local4634 = aStringArray24[--anInt2937];
											Static437.method6491(local4634, true);
											return;
										}
										if (arg0 == 3631) {
											local15 = anIntArray152[--anInt2945];
											anIntArray152[anInt2945++] = Static24.aBooleanArray1[local15] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local15 = anIntArray152[--anInt2945];
											if (Static119.aString33 != null && local15 < Static7.anInt86) {
												aStringArray24[anInt2937++] = Static191.aClass349Array1[local15].aString127;
												return;
											}
											aStringArray24[anInt2937++] = "";
											return;
										}
										if (arg0 == 3633) {
											local15 = anIntArray152[--anInt2945];
											if (Static205.anInt3334 != 0 && local15 < Static453.anInt7761) {
												aStringArray24[anInt2937++] = Static30.aStringArray4[local15];
												return;
											}
											aStringArray24[anInt2937++] = "";
											return;
										}
									} else if (arg0 < 3800) {
										if (arg0 == 3700) {
											if (Static209.aClass205_2 != null) {
												anIntArray152[anInt2945++] = 1;
												aClass205_1 = Static209.aClass205_2;
												return;
											}
											anIntArray152[anInt2945++] = 0;
											return;
										}
										if (arg0 == 3701) {
											if (Static514.aClass205_3 != null) {
												anIntArray152[anInt2945++] = 1;
												aClass205_1 = Static514.aClass205_3;
												return;
											}
											anIntArray152[anInt2945++] = 0;
											return;
										}
										if (arg0 == 3702) {
											aStringArray24[anInt2937++] = aClass205_1.aString73;
											return;
										}
										if (arg0 == 3703) {
											anIntArray152[anInt2945++] = aClass205_1.aBoolean434 ? 1 : 0;
											return;
										}
										if (arg0 == 3704) {
											anIntArray152[anInt2945++] = aClass205_1.aByte75;
											return;
										}
										if (arg0 == 3705) {
											anIntArray152[anInt2945++] = aClass205_1.aByte78;
											return;
										}
										if (arg0 == 3706) {
											anIntArray152[anInt2945++] = aClass205_1.aByte76;
											return;
										}
										if (arg0 == 3707) {
											anIntArray152[anInt2945++] = aClass205_1.aByte77;
											return;
										}
										if (arg0 == 3709) {
											anIntArray152[anInt2945++] = aClass205_1.anInt5752;
											return;
										}
										if (arg0 == 3710) {
											local15 = anIntArray152[--anInt2945];
											aStringArray24[anInt2937++] = aClass205_1.aStringArray37[local15];
											return;
										}
										if (arg0 == 3711) {
											local15 = anIntArray152[--anInt2945];
											anIntArray152[anInt2945++] = aClass205_1.aByteArray46[local15];
											return;
										}
										if (arg0 == 3712) {
											anIntArray152[anInt2945++] = aClass205_1.anInt5756;
											return;
										}
										if (arg0 == 3713) {
											local15 = anIntArray152[--anInt2945];
											aStringArray24[anInt2937++] = aClass205_1.aStringArray38[local15];
											return;
										}
										if (arg0 == 3714) {
											anInt2945 -= 3;
											local15 = anIntArray152[anInt2945];
											local21 = anIntArray152[anInt2945 + 1];
											local27 = anIntArray152[anInt2945 + 2];
											anIntArray152[anInt2945++] = aClass205_1.method4885(local15, local21, local27);
											return;
										}
										if (arg0 == 3715) {
											anIntArray152[anInt2945++] = aClass205_1.anInt5738;
											return;
										}
										if (arg0 == 3716) {
											anIntArray152[anInt2945++] = aClass205_1.anInt5757;
											return;
										}
										if (arg0 == 3717) {
											anIntArray152[anInt2945++] = aClass205_1.method4883(aStringArray24[--anInt2937]);
											return;
										}
										if (arg0 == 3718) {
											anIntArray152[anInt2945 - 1] = aClass205_1.method4897()[anIntArray152[anInt2945 - 1]];
											return;
										}
										if (arg0 == 3750) {
											if (Static208.aClass5_Sub53_9 != null) {
												anIntArray152[anInt2945++] = 1;
												aClass5_Sub53_4 = Static208.aClass5_Sub53_9;
												return;
											}
											anIntArray152[anInt2945++] = 0;
											return;
										}
										if (arg0 == 3751) {
											if (Static335.aClass5_Sub53_6 != null) {
												anIntArray152[anInt2945++] = 1;
												aClass5_Sub53_4 = Static335.aClass5_Sub53_6;
												return;
											}
											anIntArray152[anInt2945++] = 0;
											return;
										}
										if (arg0 == 3752) {
											aStringArray24[anInt2937++] = aClass5_Sub53_4.aString136;
											return;
										}
										if (arg0 == 3753) {
											anIntArray152[anInt2945++] = aClass5_Sub53_4.aByte147;
											return;
										}
										if (arg0 == 3754) {
											anIntArray152[anInt2945++] = aClass5_Sub53_4.aByte148;
											return;
										}
										if (arg0 == 3755) {
											anIntArray152[anInt2945++] = aClass5_Sub53_4.anInt10557;
											return;
										}
										if (arg0 == 3756) {
											local15 = anIntArray152[--anInt2945];
											aStringArray24[anInt2937++] = aClass5_Sub53_4.aClass297Array1[local15].aString109;
											return;
										}
										if (arg0 == 3757) {
											local15 = anIntArray152[--anInt2945];
											anIntArray152[anInt2945++] = aClass5_Sub53_4.aClass297Array1[local15].aByte124;
											return;
										}
										if (arg0 == 3758) {
											local15 = anIntArray152[--anInt2945];
											anIntArray152[anInt2945++] = aClass5_Sub53_4.aClass297Array1[local15].anInt8235;
											return;
										}
										if (arg0 == 3759) {
											local15 = anIntArray152[--anInt2945];
											Static306.method4686(local15, aClass5_Sub53_4 == Static335.aClass5_Sub53_6);
											return;
										}
										if (arg0 == 3760) {
											anIntArray152[anInt2945++] = aClass5_Sub53_4.method9060(aStringArray24[--anInt2937]);
											return;
										}
										if (arg0 == 3761) {
											anIntArray152[anInt2945 - 1] = aClass5_Sub53_4.method9058()[anIntArray152[anInt2945 - 1]];
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local15 = anIntArray152[--anInt2945];
											anIntArray152[anInt2945++] = Static257.aClass343Array4[local15].method8611();
											return;
										}
										if (arg0 == 3904) {
											local15 = anIntArray152[--anInt2945];
											anIntArray152[anInt2945++] = Static257.aClass343Array4[local15].anInt10016;
											return;
										}
										if (arg0 == 3905) {
											local15 = anIntArray152[--anInt2945];
											anIntArray152[anInt2945++] = Static257.aClass343Array4[local15].anInt10023;
											return;
										}
										if (arg0 == 3906) {
											local15 = anIntArray152[--anInt2945];
											anIntArray152[anInt2945++] = Static257.aClass343Array4[local15].anInt10017;
											return;
										}
										if (arg0 == 3907) {
											local15 = anIntArray152[--anInt2945];
											anIntArray152[anInt2945++] = Static257.aClass343Array4[local15].anInt10019;
											return;
										}
										if (arg0 == 3908) {
											local15 = anIntArray152[--anInt2945];
											anIntArray152[anInt2945++] = Static257.aClass343Array4[local15].anInt10018;
											return;
										}
										if (arg0 == 3910) {
											local15 = anIntArray152[--anInt2945];
											local21 = Static257.aClass343Array4[local15].method8612();
											anIntArray152[anInt2945++] = local21 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local15 = anIntArray152[--anInt2945];
											local21 = Static257.aClass343Array4[local15].method8612();
											anIntArray152[anInt2945++] = local21 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local15 = anIntArray152[--anInt2945];
											local21 = Static257.aClass343Array4[local15].method8612();
											anIntArray152[anInt2945++] = local21 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local15 = anIntArray152[--anInt2945];
											local21 = Static257.aClass343Array4[local15].method8612();
											anIntArray152[anInt2945++] = local21 == 1 ? 1 : 0;
											return;
										}
									} else {
										@Pc(8898) long local8898;
										if (arg0 < 4100) {
											if (arg0 == 4000) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												anIntArray152[anInt2945++] = local15 + local21;
												return;
											}
											if (arg0 == 4001) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												anIntArray152[anInt2945++] = local15 - local21;
												return;
											}
											if (arg0 == 4002) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												anIntArray152[anInt2945++] = local15 * local21;
												return;
											}
											if (arg0 == 4003) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												anIntArray152[anInt2945++] = local15 / local21;
												return;
											}
											if (arg0 == 4004) {
												local15 = anIntArray152[--anInt2945];
												anIntArray152[anInt2945++] = (int) (Math.random() * (double) local15);
												return;
											}
											if (arg0 == 4005) {
												local15 = anIntArray152[--anInt2945];
												anIntArray152[anInt2945++] = (int) (Math.random() * (double) (local15 + 1));
												return;
											}
											if (arg0 == 4006) {
												anInt2945 -= 5;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												local27 = anIntArray152[anInt2945 + 2];
												local392 = anIntArray152[anInt2945 + 3];
												local2765 = anIntArray152[anInt2945 + 4];
												anIntArray152[anInt2945++] = local15 + (local21 - local15) * (local2765 - local27) / (local392 - local27);
												return;
											}
											@Pc(8905) long local8905;
											if (arg0 == 4007) {
												anInt2945 -= 2;
												local8898 = (long) anIntArray152[anInt2945];
												local8905 = (long) anIntArray152[anInt2945 + 1];
												anIntArray152[anInt2945++] = (int) (local8898 + local8898 * local8905 / 100L);
												return;
											}
											if (arg0 == 4008) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												anIntArray152[anInt2945++] = local15 | 0x1 << local21;
												return;
											}
											if (arg0 == 4009) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												anIntArray152[anInt2945++] = local15 & -(0x1 << local21) - 1;
												return;
											}
											if (arg0 == 4010) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												anIntArray152[anInt2945++] = (local15 & 0x1 << local21) == 0 ? 0 : 1;
												return;
											}
											if (arg0 == 4011) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												anIntArray152[anInt2945++] = local15 % local21;
												return;
											}
											if (arg0 == 4012) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												if (local15 == 0) {
													anIntArray152[anInt2945++] = 0;
													return;
												}
												anIntArray152[anInt2945++] = (int) Math.pow((double) local15, (double) local21);
												return;
											}
											if (arg0 == 4013) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												if (local15 == 0) {
													anIntArray152[anInt2945++] = 0;
													return;
												}
												if (local21 == 0) {
													anIntArray152[anInt2945++] = Integer.MAX_VALUE;
													return;
												}
												anIntArray152[anInt2945++] = (int) Math.pow((double) local15, 1.0D / (double) local21);
												return;
											}
											if (arg0 == 4014) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												anIntArray152[anInt2945++] = local15 & local21;
												return;
											}
											if (arg0 == 4015) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												anIntArray152[anInt2945++] = local15 | local21;
												return;
											}
											if (arg0 == 4016) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												anIntArray152[anInt2945++] = local15 < local21 ? local15 : local21;
												return;
											}
											if (arg0 == 4017) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												anIntArray152[anInt2945++] = local15 > local21 ? local15 : local21;
												return;
											}
											if (arg0 == 4018) {
												anInt2945 -= 3;
												local8898 = (long) anIntArray152[anInt2945];
												local8905 = (long) anIntArray152[anInt2945 + 1];
												@Pc(9292) long local9292 = (long) anIntArray152[anInt2945 + 2];
												anIntArray152[anInt2945++] = (int) (local8898 * local9292 / local8905);
												return;
											}
											if (arg0 == 4019) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												if (local15 > 700 || local21 > 700) {
													anIntArray152[anInt2945++] = 256;
												}
												@Pc(9355) double local9355 = (Math.random() * (double) (local21 + local15) + 800.0D - (double) local15) / 100.0D;
												anIntArray152[anInt2945++] = (int) (Math.pow(2.0D, local9355) + 0.5D);
												return;
											}
											if (arg0 == 4020) {
												local15 = anIntArray152[--anInt2945];
												anIntArray152[anInt2945++] = Static351.anIntArray337[Static230.method3289(local15) & 0xFFFF];
												return;
											}
										} else if (arg0 < 4200) {
											if (arg0 == 4100) {
												local4634 = aStringArray24[--anInt2937];
												local21 = anIntArray152[--anInt2945];
												aStringArray24[anInt2937++] = local4634 + local21;
												return;
											}
											if (arg0 == 4101) {
												anInt2937 -= 2;
												local4634 = aStringArray24[anInt2937];
												local1287 = aStringArray24[anInt2937 + 1];
												aStringArray24[anInt2937++] = local4634 + local1287;
												return;
											}
											if (arg0 == 4102) {
												local4634 = aStringArray24[--anInt2937];
												local21 = anIntArray152[--anInt2945];
												aStringArray24[anInt2937++] = local4634 + Static429.method6352(local21, true);
												return;
											}
											if (arg0 == 4103) {
												local4634 = aStringArray24[--anInt2937];
												aStringArray24[anInt2937++] = local4634.toLowerCase();
												return;
											}
											if (arg0 == 4104) {
												aStringArray24[anInt2937++] = Static403.method5922(Static323.anInt5795, Static349.method5257(anIntArray152[--anInt2945]));
												return;
											}
											if (arg0 == 4105) {
												anInt2937 -= 2;
												local4634 = aStringArray24[anInt2937];
												local1287 = aStringArray24[anInt2937 + 1];
												if (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass100_1 != null && Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aClass100_1.aBoolean189) {
													aStringArray24[anInt2937++] = local1287;
													return;
												}
												aStringArray24[anInt2937++] = local4634;
												return;
											}
											if (arg0 == 4106) {
												local15 = anIntArray152[--anInt2945];
												aStringArray24[anInt2937++] = Integer.toString(local15);
												return;
											}
											if (arg0 == 4107) {
												anInt2937 -= 2;
												anIntArray152[anInt2945++] = Static587.method8424(aStringArray24[anInt2937], Static323.anInt5795, aStringArray24[anInt2937 + 1]);
												return;
											}
											@Pc(9675) Class224 local9675;
											if (arg0 == 4108) {
												local4634 = aStringArray24[--anInt2937];
												anInt2945 -= 2;
												local21 = anIntArray152[anInt2945];
												local27 = anIntArray152[anInt2945 + 1];
												local9675 = Static494.method7119(local27, Static85.aClass208_16);
												anIntArray152[anInt2945++] = local9675.method5249(local21, Static575.aClass134Array15, local4634);
												return;
											}
											if (arg0 == 4109) {
												local4634 = aStringArray24[--anInt2937];
												anInt2945 -= 2;
												local21 = anIntArray152[anInt2945];
												local27 = anIntArray152[anInt2945 + 1];
												local9675 = Static494.method7119(local27, Static85.aClass208_16);
												anIntArray152[anInt2945++] = local9675.method5259(local21, Static575.aClass134Array15, local4634);
												return;
											}
											if (arg0 == 4110) {
												anInt2937 -= 2;
												local4634 = aStringArray24[anInt2937];
												local1287 = aStringArray24[anInt2937 + 1];
												if (anIntArray152[--anInt2945] == 1) {
													aStringArray24[anInt2937++] = local4634;
													return;
												}
												aStringArray24[anInt2937++] = local1287;
												return;
											}
											if (arg0 == 4111) {
												local4634 = aStringArray24[--anInt2937];
												aStringArray24[anInt2937++] = Static513.method7487(local4634);
												return;
											}
											if (arg0 == 4112) {
												local4634 = aStringArray24[--anInt2937];
												local21 = anIntArray152[--anInt2945];
												if (local21 == -1) {
													throw new RuntimeException("null char");
												}
												aStringArray24[anInt2937++] = local4634 + (char) local21;
												return;
											}
											if (arg0 == 4113) {
												local15 = anIntArray152[--anInt2945];
												anIntArray152[anInt2945++] = method2516((char) local15);
												return;
											}
											if (arg0 == 4114) {
												local15 = anIntArray152[--anInt2945];
												anIntArray152[anInt2945++] = Static469.method6848((char) local15) ? 1 : 0;
												return;
											}
											if (arg0 == 4115) {
												local15 = anIntArray152[--anInt2945];
												anIntArray152[anInt2945++] = Static495.method7131((char) local15) ? 1 : 0;
												return;
											}
											if (arg0 == 4116) {
												local15 = anIntArray152[--anInt2945];
												anIntArray152[anInt2945++] = Static129.method1870((char) local15) ? 1 : 0;
												return;
											}
											if (arg0 == 4117) {
												local4634 = aStringArray24[--anInt2937];
												if (local4634 != null) {
													anIntArray152[anInt2945++] = local4634.length();
													return;
												}
												anIntArray152[anInt2945++] = 0;
												return;
											}
											if (arg0 == 4118) {
												local4634 = aStringArray24[--anInt2937];
												anInt2945 -= 2;
												local21 = anIntArray152[anInt2945];
												local27 = anIntArray152[anInt2945 + 1];
												aStringArray24[anInt2937++] = local4634.substring(local21, local27);
												return;
											}
											if (arg0 == 4119) {
												local4634 = aStringArray24[--anInt2937];
												@Pc(10041) StringBuffer local10041 = new StringBuffer(local4634.length());
												@Pc(10043) boolean local10043 = false;
												for (local392 = 0; local392 < local4634.length(); local392++) {
													@Pc(10050) char local10050 = local4634.charAt(local392);
													if (local10050 == '<') {
														local10043 = true;
													} else if (local10050 == '>') {
														local10043 = false;
													} else if (!local10043) {
														local10041.append(local10050);
													}
												}
												aStringArray24[anInt2937++] = local10041.toString();
												return;
											}
											if (arg0 == 4120) {
												local4634 = aStringArray24[--anInt2937];
												anInt2945 -= 2;
												local21 = anIntArray152[anInt2945];
												local27 = anIntArray152[anInt2945 + 1];
												anIntArray152[anInt2945++] = local4634.indexOf(local21, local27);
												return;
											}
											if (arg0 == 4121) {
												anInt2937 -= 2;
												local4634 = aStringArray24[anInt2937];
												local1287 = aStringArray24[anInt2937 + 1];
												local27 = anIntArray152[--anInt2945];
												anIntArray152[anInt2945++] = local4634.indexOf(local1287, local27);
												return;
											}
											if (arg0 == 4122) {
												local15 = anIntArray152[--anInt2945];
												anIntArray152[anInt2945++] = Character.toLowerCase((char) local15);
												return;
											}
											if (arg0 == 4123) {
												local15 = anIntArray152[--anInt2945];
												anIntArray152[anInt2945++] = Character.toUpperCase((char) local15);
												return;
											}
											if (arg0 == 4124) {
												local461 = anIntArray152[--anInt2945] != 0;
												local21 = anIntArray152[--anInt2945];
												aStringArray24[anInt2937++] = Static679.method9322(0, (long) local21, Static323.anInt5795, local461);
												return;
											}
											if (arg0 == 4125) {
												local4634 = aStringArray24[--anInt2937];
												local21 = anIntArray152[--anInt2945];
												@Pc(10270) Class224 local10270 = Static494.method7119(local21, Static85.aClass208_16);
												anIntArray152[anInt2945++] = local10270.method5250(local4634, Static575.aClass134Array15);
												return;
											}
											if (arg0 == 4126) {
												aStringArray24[anInt2937++] = Static633.method8850((long) anIntArray152[--anInt2945] * 60000L, Static323.anInt5795) + " UTC";
												return;
											}
											if (arg0 == 4127) {
												local8898 = aLongArray7[--anInt2938];
												aStringArray24[anInt2937++] = local8898 == -1L ? "" : Long.toString(local8898, 36).toUpperCase();
												return;
											}
										} else if (arg0 < 4300) {
											if (arg0 == 4200) {
												local15 = anIntArray152[--anInt2945];
												aStringArray24[anInt2937++] = Static201.aClass127_1.method2501(local15).aString72;
												return;
											}
											@Pc(10399) Class204 local10399;
											if (arg0 == 4201) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												local10399 = Static201.aClass127_1.method2501(local15);
												if (local21 >= 1 && local21 <= 5 && local10399.aStringArray36[local21 - 1] != null) {
													aStringArray24[anInt2937++] = local10399.aStringArray36[local21 - 1];
													return;
												}
												aStringArray24[anInt2937++] = "";
												return;
											}
											if (arg0 == 4202) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												local10399 = Static201.aClass127_1.method2501(local15);
												if (local21 >= 1 && local21 <= 5 && local10399.aStringArray35[local21 - 1] != null) {
													aStringArray24[anInt2937++] = local10399.aStringArray35[local21 - 1];
													return;
												}
												aStringArray24[anInt2937++] = "";
												return;
											}
											if (arg0 == 4203) {
												local15 = anIntArray152[--anInt2945];
												anIntArray152[anInt2945++] = Static201.aClass127_1.method2501(local15).anInt5683;
												return;
											}
											if (arg0 == 4204) {
												local15 = anIntArray152[--anInt2945];
												anIntArray152[anInt2945++] = Static201.aClass127_1.method2501(local15).anInt5690 == 1 ? 1 : 0;
												return;
											}
											@Pc(10573) Class204 local10573;
											if (arg0 == 4205) {
												local15 = anIntArray152[--anInt2945];
												local10573 = Static201.aClass127_1.method2501(local15);
												if (local10573.anInt5701 == -1 && local10573.anInt5724 >= 0) {
													anIntArray152[anInt2945++] = local10573.anInt5724;
													return;
												}
												anIntArray152[anInt2945++] = local15;
												return;
											}
											if (arg0 == 4206) {
												local15 = anIntArray152[--anInt2945];
												local10573 = Static201.aClass127_1.method2501(local15);
												if (local10573.anInt5701 >= 0 && local10573.anInt5724 >= 0) {
													anIntArray152[anInt2945++] = local10573.anInt5724;
													return;
												}
												anIntArray152[anInt2945++] = local15;
												return;
											}
											if (arg0 == 4207) {
												local15 = anIntArray152[--anInt2945];
												anIntArray152[anInt2945++] = Static201.aClass127_1.method2501(local15).aBoolean432 ? 1 : 0;
												return;
											}
											if (arg0 == 4208) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												local3613 = Static4.aClass355_1.method8693(local21);
												if (local3613.method2972()) {
													aStringArray24[anInt2937++] = Static201.aClass127_1.method2501(local15).method4861(local3613.aString49, local21);
													return;
												}
												anIntArray152[anInt2945++] = Static201.aClass127_1.method2501(local15).method4860(local21, local3613.anInt3373);
												return;
											}
											if (arg0 == 4209) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1] - 1;
												local10399 = Static201.aClass127_1.method2501(local15);
												if (local10399.anInt5682 == local21) {
													anIntArray152[anInt2945++] = local10399.anInt5691;
													return;
												}
												if (local10399.anInt5662 == local21) {
													anIntArray152[anInt2945++] = local10399.anInt5675;
													return;
												}
												anIntArray152[anInt2945++] = -1;
												return;
											}
											if (arg0 == 4210) {
												local4634 = aStringArray24[--anInt2937];
												local21 = anIntArray152[--anInt2945];
												Static337.method5136(local21 == 1, local4634);
												anIntArray152[anInt2945++] = Static450.anInt7749;
												return;
											}
											if (arg0 == 4211) {
												if (Static539.aShortArray118 != null && Static418.anInt7221 < Static450.anInt7749) {
													anIntArray152[anInt2945++] = Static539.aShortArray118[Static418.anInt7221++] & 0xFFFF;
													return;
												}
												anIntArray152[anInt2945++] = -1;
												return;
											}
											if (arg0 == 4212) {
												Static418.anInt7221 = 0;
												return;
											}
											if (arg0 == 4213) {
												local15 = anIntArray152[--anInt2945];
												anIntArray152[anInt2945++] = Static201.aClass127_1.method2501(local15).anInt5669;
												return;
											}
											if (arg0 == 4214) {
												local4634 = aStringArray24[--anInt2937];
												anInt2945 -= 3;
												local21 = anIntArray152[anInt2945];
												local27 = anIntArray152[anInt2945 + 1];
												local392 = anIntArray152[anInt2945 + 2];
												Static387.method5648(local27, local392, local4634, local21 == 1);
												anIntArray152[anInt2945++] = Static450.anInt7749;
												return;
											}
											if (arg0 == 4215) {
												anInt2937 -= 2;
												anInt2945 -= 2;
												local4634 = aStringArray24[anInt2937];
												local21 = anIntArray152[anInt2945];
												local27 = anIntArray152[anInt2945 + 1];
												@Pc(10990) String local10990 = aStringArray24[anInt2937 + 1];
												Static331.method5046(local4634, local21 == 1, local10990, local27);
												anIntArray152[anInt2945++] = Static450.anInt7749;
												return;
											}
										} else if (arg0 < 4400) {
											if (arg0 == 4300) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												local3613 = Static4.aClass355_1.method8693(local21);
												if (local3613.method2972()) {
													aStringArray24[anInt2937++] = Static325.aClass231_1.method5363(local15, 2).method5328(local21, local3613.aString49);
													return;
												}
												anIntArray152[anInt2945++] = Static325.aClass231_1.method5363(local15, 2).method5323(local21, local3613.anInt3373);
												return;
											}
										} else if (arg0 < 4500) {
											if (arg0 == 4400) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												local3613 = Static4.aClass355_1.method8693(local21);
												if (local3613.method2972()) {
													aStringArray24[anInt2937++] = Static536.aClass392_2.method9293(0, local15).method849(local3613.aString49, local21);
													return;
												}
												anIntArray152[anInt2945++] = Static536.aClass392_2.method9293(0, local15).method845(local21, local3613.anInt3373);
												return;
											}
										} else if (arg0 < 4600) {
											if (arg0 == 4500) {
												anInt2945 -= 2;
												local15 = anIntArray152[anInt2945];
												local21 = anIntArray152[anInt2945 + 1];
												local3613 = Static4.aClass355_1.method8693(local21);
												if (local3613.method2972()) {
													aStringArray24[anInt2937++] = Static356.aClass157_1.method3087(local15).method5294(local21, local3613.aString49);
													return;
												}
												anIntArray152[anInt2945++] = Static356.aClass157_1.method3087(local15).method5295(local21, local3613.anInt3373);
												return;
											}
										} else if (arg0 < 4700) {
											if (arg0 == 4600) {
												local15 = anIntArray152[--anInt2945];
												@Pc(11230) Class101 local11230 = Static356.aClass325_2.method7979(local15);
												if (local11230.anIntArray125 != null && local11230.anIntArray125.length > 0) {
													local27 = 0;
													local392 = local11230.anIntArray128[0];
													for (local2765 = 1; local2765 < local11230.anIntArray125.length; local2765++) {
														if (local11230.anIntArray128[local2765] > local392) {
															local27 = local2765;
															local392 = local11230.anIntArray128[local2765];
														}
													}
													anIntArray152[anInt2945++] = local11230.anIntArray125[local27];
													return;
												}
												anIntArray152[anInt2945++] = local11230.anInt2175;
												return;
											}
										} else if (arg0 < 4800) {
											if (arg0 == 4700) {
												anIntArray152[anInt2945++] = Static473.aBoolean599 ? 1 : 0;
												return;
											}
											if (arg0 == 4701) {
												local4634 = aStringArray24[--anInt2937];
												if (Static107.anInt1746 == 7 && !Static665.method9171()) {
													if (local4634.length() > 20) {
														Static411.aByte122 = -4;
														return;
													}
													Static411.aByte122 = -1;
													local4725 = Static457.method6722(Static548.aClass387_100, Static80.aClass313_1);
													local4725.aClass5_Sub23_Sub2_2.method8502(0);
													local27 = local4725.aClass5_Sub23_Sub2_2.anInt9869;
													local4725.aClass5_Sub23_Sub2_2.method8538(local4634);
													local4725.aClass5_Sub23_Sub2_2.method8541(local4725.aClass5_Sub23_Sub2_2.anInt9869 - local27);
													Static494.method7120(local4725);
													return;
												}
												Static411.aByte122 = -5;
												return;
											}
											if (arg0 == 4702) {
												anIntArray152[anInt2945++] = Static411.aByte122;
												if (Static411.aByte122 != -1) {
													Static411.aByte122 = -6;
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
							local153 = Static259.method3831(anIntArray152[--anInt2945]);
						} else {
							local153 = arg1 ? aClass73_10 : aClass73_9;
						}
						if (arg0 == 1300) {
							local21 = anIntArray152[--anInt2945] - 1;
							if (local21 >= 0 && local21 <= 9) {
								local153.method1279(local21, aStringArray24[--anInt2937]);
								return;
							}
							anInt2937--;
							return;
						}
						if (arg0 == 1301) {
							anInt2945 -= 2;
							local21 = anIntArray152[anInt2945];
							local27 = anIntArray152[anInt2945 + 1];
							if (local21 == -1 && local27 == -1) {
								local153.aClass73_4 = null;
								return;
							}
							local153.aClass73_4 = Static506.method9206(local21, local27);
							return;
						}
						if (arg0 == 1302) {
							local21 = anIntArray152[--anInt2945];
							if (local21 != Static54.anInt844 && local21 != Static163.anInt2520 && local21 != Static123.anInt1948) {
								return;
							}
							local153.anInt1416 = local21;
							return;
						}
						if (arg0 == 1303) {
							local153.anInt1329 = anIntArray152[--anInt2945];
							return;
						}
						if (arg0 == 1304) {
							local153.anInt1366 = anIntArray152[--anInt2945];
							return;
						}
						if (arg0 == 1305) {
							local153.aString22 = aStringArray24[--anInt2937];
							return;
						}
						if (arg0 == 1306) {
							local153.aString21 = aStringArray24[--anInt2937];
							return;
						}
						if (arg0 == 1307) {
							local153.aStringArray7 = null;
							return;
						}
						if (arg0 == 1308) {
							local153.anInt1390 = anIntArray152[--anInt2945];
							local153.anInt1396 = anIntArray152[--anInt2945];
							return;
						}
						if (arg0 == 1309) {
							local21 = anIntArray152[--anInt2945];
							local27 = anIntArray152[--anInt2945];
							if (local27 >= 1 && local27 <= 10) {
								local153.method1291(local27 - 1, local21);
							}
							return;
						}
						if (arg0 == 1310) {
							local153.aString23 = aStringArray24[--anInt2937];
							return;
						}
						if (arg0 == 1311) {
							local153.anInt1351 = anIntArray152[--anInt2945];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt2945 -= 3;
								local21 = anIntArray152[anInt2945] - 1;
								local27 = anIntArray152[anInt2945 + 1];
								local392 = anIntArray152[anInt2945 + 2];
								if (local21 < 0 || local21 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt2945 -= 2;
								local21 = 10;
								local27 = anIntArray152[anInt2945];
								local392 = anIntArray152[anInt2945 + 1];
							}
							if (local153.aByteArray7 == null) {
								if (local27 == 0) {
									return;
								}
								local153.aByteArray7 = new byte[11];
								local153.aByteArray6 = new byte[11];
								local153.anIntArray67 = new int[11];
							}
							local153.aByteArray7[local21] = (byte) local27;
							if (local27 == 0) {
								local153.aBoolean124 = false;
								for (local2765 = 0; local2765 < local153.aByteArray7.length; local2765++) {
									if (local153.aByteArray7[local2765] != 0) {
										local153.aBoolean124 = true;
										break;
									}
								}
							} else {
								local153.aBoolean124 = true;
							}
							local153.aByteArray6[local21] = (byte) local392;
							return;
						}
						if (arg0 == 1314) {
							local153.anInt1347 = anIntArray152[--anInt2945];
							return;
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local153 = Static259.method3831(anIntArray152[--anInt2945]);
					} else {
						local153 = arg1 ? aClass73_10 : aClass73_9;
					}
					Static298.method4399(local153);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt2945 -= 2;
						local21 = anIntArray152[anInt2945];
						local27 = anIntArray152[anInt2945 + 1];
						if (local153.anInt1364 == -1) {
							Static262.method7568(local153.anInt1388);
							Static364.method5391(local153.anInt1388);
							Static462.method6756(local153.anInt1388);
						}
						if (local21 == -1) {
							local153.anInt1374 = 1;
							local153.anInt1352 = -1;
							local153.anInt1419 = -1;
							return;
						}
						local153.anInt1419 = local21;
						local153.anInt1369 = local27;
						if (arg0 == 1208 || arg0 == 1209) {
							local153.aBoolean131 = true;
						} else {
							local153.aBoolean131 = false;
						}
						@Pc(2023) Class204 local2023 = Static201.aClass127_1.method2501(local21);
						local153.anInt1408 = local2023.anInt5719;
						local153.anInt1392 = local2023.anInt5713;
						local153.anInt1344 = local2023.anInt5694;
						local153.anInt1346 = local2023.anInt5686;
						local153.anInt1328 = local2023.anInt5673;
						local153.anInt1371 = local2023.anInt5687;
						if (arg0 == 1205 || arg0 == 1209) {
							local153.anInt1411 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local153.anInt1411 = 1;
						} else {
							local153.anInt1411 = 2;
						}
						if (local153.anInt1389 > 0) {
							local153.anInt1371 = local153.anInt1371 * 32 / local153.anInt1389;
							return;
						}
						if (local153.anInt1417 > 0) {
							local153.anInt1371 = local153.anInt1371 * 32 / local153.anInt1417;
						}
						return;
					}
					if (arg0 == 1201) {
						local153.anInt1374 = 2;
						local153.anInt1352 = anIntArray152[--anInt2945];
						if (local153.anInt1364 == -1) {
							Static598.method8621(local153.anInt1388);
						}
						return;
					}
					if (arg0 == 1202) {
						local153.anInt1374 = 3;
						local153.anInt1352 = -1;
						if (local153.anInt1364 == -1) {
							Static598.method8621(local153.anInt1388);
						}
						return;
					}
					if (arg0 == 1203) {
						local153.anInt1374 = 6;
						local153.anInt1352 = anIntArray152[--anInt2945];
						if (local153.anInt1364 == -1) {
							Static598.method8621(local153.anInt1388);
						}
						return;
					}
					if (arg0 == 1204) {
						local153.anInt1374 = 5;
						local153.anInt1352 = anIntArray152[--anInt2945];
						if (local153.anInt1364 == -1) {
							Static598.method8621(local153.anInt1388);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt2945 -= 4;
						local153.anInt1413 = anIntArray152[anInt2945];
						local153.anInt1395 = anIntArray152[anInt2945 + 1];
						local153.anInt1420 = anIntArray152[anInt2945 + 2];
						local153.anInt1354 = anIntArray152[anInt2945 + 3];
						Static298.method4399(local153);
						return;
					}
					if (arg0 == 1207) {
						anInt2945 -= 2;
						local153.anInt1327 = anIntArray152[anInt2945];
						local153.anInt1399 = anIntArray152[anInt2945 + 1];
						Static298.method4399(local153);
						return;
					}
					if (arg0 == 1210) {
						anInt2945 -= 4;
						local153.anInt1352 = anIntArray152[anInt2945];
						local153.anInt1353 = anIntArray152[anInt2945 + 1];
						if (anIntArray152[anInt2945 + 2] == 1) {
							local153.anInt1374 = 9;
						} else {
							local153.anInt1374 = 8;
						}
						if (anIntArray152[anInt2945 + 3] == 1) {
							local153.aBoolean131 = true;
						} else {
							local153.aBoolean131 = false;
						}
						if (local153.anInt1364 == -1) {
							Static598.method8621(local153.anInt1388);
						}
						return;
					}
					if (arg0 == 1211) {
						local153.anInt1374 = 5;
						local153.anInt1352 = Static279.anInt4838;
						local153.anInt1353 = 0;
						if (local153.anInt1364 == -1) {
							Static598.method8621(local153.anInt1388);
						}
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(C)I")
	private static int method2516(@OriginalArg(0) char arg0) {
		return Static417.method6234(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!fja", name = "g", descriptor = "(I)I")
	private static int method2517(@OriginalArg(0) int arg0) {
		@Pc(4) Class245 local4 = Static123.aClass234_1.method5395(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c112");
		}
		@Pc(24) Integer local24 = aClass205_1.method4882(Static256.aClass333_3.anInt9710 << 16 | arg0);
		if (local24 == null) {
			return local4.aChar5 == 'i' || local4.aChar5 == '1' ? 0 : -1;
		} else {
			return local24;
		}
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(Lclient!aka;I)V")
	private static void method2518(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class5_Sub5_Sub17 local12 = Static636.method8886(local8);
		if (local12 == null) {
			return;
		}
		anIntArray153 = new int[local12.anInt6687];
		@Pc(22) int local22 = 0;
		aStringArray25 = new String[local12.anInt6682];
		@Pc(28) int local28 = 0;
		aLongArray6 = new long[local12.anInt6686];
		@Pc(34) int local34 = 0;
		for (@Pc(36) int local36 = 1; local36 < local2.length; local36++) {
			if (local2[local36] instanceof Integer) {
				@Pc(48) int local48 = (Integer) local2[local36];
				if (local48 == -2147483647) {
					local48 = arg0.anInt321;
				}
				if (local48 == -2147483646) {
					local48 = arg0.anInt323;
				}
				if (local48 == -2147483645) {
					local48 = arg0.aClass73_1 == null ? -1 : arg0.aClass73_1.anInt1388;
				}
				if (local48 == -2147483644) {
					local48 = arg0.anInt325;
				}
				if (local48 == -2147483643) {
					local48 = arg0.aClass73_1 == null ? -1 : arg0.aClass73_1.anInt1364;
				}
				if (local48 == -2147483642) {
					local48 = arg0.aClass73_2 == null ? -1 : arg0.aClass73_2.anInt1388;
				}
				if (local48 == -2147483641) {
					local48 = arg0.aClass73_2 == null ? -1 : arg0.aClass73_2.anInt1364;
				}
				if (local48 == -2147483640) {
					local48 = arg0.anInt329;
				}
				if (local48 == -2147483639) {
					local48 = arg0.anInt327;
				}
				anIntArray153[local22++] = local48;
			} else if (local2[local36] instanceof String) {
				@Pc(154) String local154 = (String) local2[local36];
				if (local154.equals("event_opbase")) {
					local154 = arg0.aString8;
				}
				aStringArray25[local28++] = local154;
			} else if (local2[local36] instanceof Long) {
				@Pc(180) long local180 = (Long) local2[local36];
				aLongArray6[local34++] = local180;
			}
		}
		anInt2949 = arg0.anInt326;
		method2511(local12, arg1);
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(IZ)V")
	public static void method2519() {
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(Lclient!aka;)V")
	public static void method2520(@OriginalArg(0) Class5_Sub3 arg0) {
		method2518(arg0, 200000);
	}

	@OriginalMember(owner = "client!fja", name = "f", descriptor = "(I)Ljava/lang/String;")
	private static String method2521(@OriginalArg(0) int arg0) {
		@Pc(9) String local9 = aClass205_1.method4879(Static256.aClass333_3.anInt9710 << 16 | arg0);
		return local9 == null ? "" : local9;
	}

	@OriginalMember(owner = "client!fja", name = "b", descriptor = "(IZ)V")
	private static void method2522(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(59) Class5_Sub50 local59;
		@Pc(814) int local814;
		@Pc(104) int local104;
		@Pc(90) String local90;
		@Pc(182) int local182;
		@Pc(1543) boolean local1543;
		@Pc(188) String local188;
		@Pc(110) int local110;
		@Pc(96) String local96;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray152[anInt2945++] = Static539.anInt9219;
				return;
			}
			if (arg0 == 5001) {
				anInt2945 -= 3;
				Static539.anInt9219 = anIntArray152[anInt2945];
				Static211.aClass103_4 = Static469.method6847(anIntArray152[anInt2945 + 1]);
				if (Static211.aClass103_4 == null) {
					Static211.aClass103_4 = Static160.aClass103_3;
				}
				Static583.anInt9776 = anIntArray152[anInt2945 + 2];
				local59 = Static457.method6722(Static102.aClass387_119, Static80.aClass313_1);
				local59.aClass5_Sub23_Sub2_2.method8502(Static539.anInt9219);
				local59.aClass5_Sub23_Sub2_2.method8502(Static211.aClass103_4.anInt2257);
				local59.aClass5_Sub23_Sub2_2.method8502(Static583.anInt9776);
				Static494.method7120(local59);
				return;
			}
			if (arg0 == 5002) {
				anInt2937 -= 2;
				local90 = aStringArray24[anInt2937];
				local96 = aStringArray24[anInt2937 + 1];
				anInt2945 -= 2;
				local104 = anIntArray152[anInt2945];
				local110 = anIntArray152[anInt2945 + 1];
				if (local96 == null) {
					local96 = "";
				}
				if (local96.length() > 80) {
					local96 = local96.substring(0, 80);
				}
				@Pc(132) Class5_Sub50 local132 = Static457.method6722(Static549.aClass387_101, Static80.aClass313_1);
				local132.aClass5_Sub23_Sub2_2.method8502(Static228.method3239(local90) + Static228.method3239(local96) + 2);
				local132.aClass5_Sub23_Sub2_2.method8538(local90);
				local132.aClass5_Sub23_Sub2_2.method8502(local104 - 1);
				local132.aClass5_Sub23_Sub2_2.method8502(local110);
				local132.aClass5_Sub23_Sub2_2.method8538(local96);
				Static494.method7120(local132);
				return;
			}
			@Pc(186) Class12 local186;
			if (arg0 == 5003) {
				local182 = anIntArray152[--anInt2945];
				local186 = Static382.method8432(local182);
				local188 = "";
				if (local186 != null && local186.aString5 != null) {
					local188 = local186.aString5;
				}
				aStringArray24[anInt2937++] = local188;
				return;
			}
			if (arg0 == 5004) {
				local182 = anIntArray152[--anInt2945];
				local186 = Static382.method8432(local182);
				local104 = -1;
				if (local186 != null) {
					local104 = local186.anInt264;
				}
				anIntArray152[anInt2945++] = local104;
				return;
			}
			if (arg0 == 5005) {
				if (Static211.aClass103_4 == null) {
					anIntArray152[anInt2945++] = -1;
					return;
				}
				anIntArray152[anInt2945++] = Static211.aClass103_4.anInt2257;
				return;
			}
			@Pc(281) Class5_Sub50 local281;
			if (arg0 == 5006) {
				local182 = anIntArray152[--anInt2945];
				local281 = Static457.method6722(Static425.aClass387_77, Static80.aClass313_1);
				local281.aClass5_Sub23_Sub2_2.method8502(local182);
				Static494.method7120(local281);
				return;
			}
			if (arg0 == 5008) {
				local90 = aStringArray24[--anInt2937];
				method2512(local90, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt2937 -= 2;
				local90 = aStringArray24[anInt2937];
				local96 = aStringArray24[anInt2937 + 1];
				if (Static539.anInt9221 != 0 || (!Static31.aBoolean46 || Static361.aBoolean474) && !Static558.aBoolean721) {
					@Pc(347) Class5_Sub50 local347 = Static457.method6722(Static651.aClass387_122, Static80.aClass313_1);
					local347.aClass5_Sub23_Sub2_2.method8502(0);
					local110 = local347.aClass5_Sub23_Sub2_2.anInt9869;
					local347.aClass5_Sub23_Sub2_2.method8538(local90);
					Static508.method7446(local96, local347.aClass5_Sub23_Sub2_2);
					local347.aClass5_Sub23_Sub2_2.method8541(local347.aClass5_Sub23_Sub2_2.anInt9869 - local110);
					Static494.method7120(local347);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local182 = anIntArray152[--anInt2945];
				local186 = Static382.method8432(local182);
				local188 = "";
				if (local186 != null && local186.aString4 != null) {
					local188 = local186.aString4;
				}
				aStringArray24[anInt2937++] = local188;
				return;
			}
			if (arg0 == 5011) {
				local182 = anIntArray152[--anInt2945];
				local186 = Static382.method8432(local182);
				local188 = "";
				if (local186 != null && local186.aString1 != null) {
					local188 = local186.aString1;
				}
				aStringArray24[anInt2937++] = local188;
				return;
			}
			if (arg0 == 5012) {
				local182 = anIntArray152[--anInt2945];
				local186 = Static382.method8432(local182);
				local104 = -1;
				if (local186 != null) {
					local104 = local186.anInt262;
				}
				anIntArray152[anInt2945++] = local104;
				return;
			}
			if (arg0 == 5015) {
				if (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1 == null || Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aString61 == null) {
					local90 = "";
				} else {
					local90 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.method3599();
				}
				aStringArray24[anInt2937++] = local90;
				return;
			}
			if (arg0 == 5016) {
				anIntArray152[anInt2945++] = Static583.anInt9776;
				return;
			}
			if (arg0 == 5017) {
				anIntArray152[anInt2945++] = Static285.method4226();
				return;
			}
			if (arg0 == 5018) {
				local182 = anIntArray152[--anInt2945];
				local186 = Static382.method8432(local182);
				local104 = 0;
				if (local186 != null) {
					local104 = local186.anInt263;
				}
				anIntArray152[anInt2945++] = local104;
				return;
			}
			if (arg0 == 5019) {
				local182 = anIntArray152[--anInt2945];
				local186 = Static382.method8432(local182);
				local188 = "";
				if (local186 != null && local186.aString2 != null) {
					local188 = local186.aString2;
				}
				aStringArray24[anInt2937++] = local188;
				return;
			}
			if (arg0 == 5020) {
				if (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1 == null || Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.aString61 == null) {
					local90 = "";
				} else {
					local90 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.method3608();
				}
				aStringArray24[anInt2937++] = local90;
				return;
			}
			if (arg0 == 5023) {
				local182 = anIntArray152[--anInt2945];
				local186 = Static382.method8432(local182);
				local104 = -1;
				if (local186 != null) {
					local104 = local186.anInt266;
				}
				anIntArray152[anInt2945++] = local104;
				return;
			}
			if (arg0 == 5024) {
				local182 = anIntArray152[--anInt2945];
				local186 = Static382.method8432(local182);
				local104 = -1;
				if (local186 != null) {
					local104 = local186.anInt265;
				}
				anIntArray152[anInt2945++] = local104;
				return;
			}
			if (arg0 == 5025) {
				local182 = anIntArray152[--anInt2945];
				local186 = Static382.method8432(local182);
				local188 = "";
				if (local186 != null && local186.aString3 != null) {
					local188 = local186.aString3;
				}
				aStringArray24[anInt2937++] = local188;
				return;
			}
			if (arg0 == 5050) {
				local182 = anIntArray152[--anInt2945];
				aStringArray24[anInt2937++] = Static112.aClass123_1.method2213(local182).aString138;
				return;
			}
			@Pc(773) Class5_Sub5_Sub21 local773;
			if (arg0 == 5051) {
				local182 = anIntArray152[--anInt2945];
				local773 = Static112.aClass123_1.method2213(local182);
				if (local773.anIntArray615 == null) {
					anIntArray152[anInt2945++] = 0;
					return;
				}
				anIntArray152[anInt2945++] = local773.anIntArray615.length;
				return;
			}
			if (arg0 == 5052) {
				anInt2945 -= 2;
				local182 = anIntArray152[anInt2945];
				local814 = anIntArray152[anInt2945 + 1];
				@Pc(819) Class5_Sub5_Sub21 local819 = Static112.aClass123_1.method2213(local182);
				local110 = local819.anIntArray615[local814];
				anIntArray152[anInt2945++] = local110;
				return;
			}
			if (arg0 == 5053) {
				local182 = anIntArray152[--anInt2945];
				local773 = Static112.aClass123_1.method2213(local182);
				if (local773.anIntArray616 == null) {
					anIntArray152[anInt2945++] = 0;
					return;
				}
				anIntArray152[anInt2945++] = local773.anIntArray616.length;
				return;
			}
			if (arg0 == 5054) {
				anInt2945 -= 2;
				local182 = anIntArray152[anInt2945];
				local814 = anIntArray152[anInt2945 + 1];
				anIntArray152[anInt2945++] = Static112.aClass123_1.method2213(local182).anIntArray616[local814];
				return;
			}
			if (arg0 == 5055) {
				local182 = anIntArray152[--anInt2945];
				aStringArray24[anInt2937++] = Static502.aClass259_2.method6241(local182).method674();
				return;
			}
			if (arg0 == 5056) {
				local182 = anIntArray152[--anInt2945];
				@Pc(946) Class5_Sub5_Sub1 local946 = Static502.aClass259_2.method6241(local182);
				if (local946.anIntArray37 == null) {
					anIntArray152[anInt2945++] = 0;
					return;
				}
				anIntArray152[anInt2945++] = local946.anIntArray37.length;
				return;
			}
			if (arg0 == 5057) {
				anInt2945 -= 2;
				local182 = anIntArray152[anInt2945];
				local814 = anIntArray152[anInt2945 + 1];
				anIntArray152[anInt2945++] = Static502.aClass259_2.method6241(local182).anIntArray37[local814];
				return;
			}
			if (arg0 == 5058) {
				aClass139_1 = new Class139();
				aClass139_1.anInt3083 = anIntArray152[--anInt2945];
				aClass139_1.aClass5_Sub5_Sub1_1 = Static502.aClass259_2.method6241(aClass139_1.anInt3083);
				aClass139_1.anIntArray169 = new int[aClass139_1.aClass5_Sub5_Sub1_1.method680()];
				return;
			}
			if (arg0 == 5059) {
				local59 = Static457.method6722(Static417.aClass387_75, Static80.aClass313_1);
				local59.aClass5_Sub23_Sub2_2.method8502(0);
				local814 = local59.aClass5_Sub23_Sub2_2.anInt9869;
				local59.aClass5_Sub23_Sub2_2.method8502(0);
				local59.aClass5_Sub23_Sub2_2.method8480(aClass139_1.anInt3083);
				aClass139_1.aClass5_Sub5_Sub1_1.method677(aClass139_1.anIntArray169, local59.aClass5_Sub23_Sub2_2);
				local59.aClass5_Sub23_Sub2_2.method8541(local59.aClass5_Sub23_Sub2_2.anInt9869 - local814);
				Static494.method7120(local59);
				return;
			}
			if (arg0 == 5060) {
				local90 = aStringArray24[--anInt2937];
				local281 = Static457.method6722(Static588.aClass387_113, Static80.aClass313_1);
				local281.aClass5_Sub23_Sub2_2.method8502(0);
				local104 = local281.aClass5_Sub23_Sub2_2.anInt9869;
				local281.aClass5_Sub23_Sub2_2.method8538(local90);
				local281.aClass5_Sub23_Sub2_2.method8480(aClass139_1.anInt3083);
				aClass139_1.aClass5_Sub5_Sub1_1.method677(aClass139_1.anIntArray169, local281.aClass5_Sub23_Sub2_2);
				local281.aClass5_Sub23_Sub2_2.method8541(local281.aClass5_Sub23_Sub2_2.anInt9869 - local104);
				Static494.method7120(local281);
				return;
			}
			if (arg0 == 5061) {
				local59 = Static457.method6722(Static417.aClass387_75, Static80.aClass313_1);
				local59.aClass5_Sub23_Sub2_2.method8502(0);
				local814 = local59.aClass5_Sub23_Sub2_2.anInt9869;
				local59.aClass5_Sub23_Sub2_2.method8502(1);
				local59.aClass5_Sub23_Sub2_2.method8480(aClass139_1.anInt3083);
				aClass139_1.aClass5_Sub5_Sub1_1.method677(aClass139_1.anIntArray169, local59.aClass5_Sub23_Sub2_2);
				local59.aClass5_Sub23_Sub2_2.method8541(local59.aClass5_Sub23_Sub2_2.anInt9869 - local814);
				Static494.method7120(local59);
				return;
			}
			if (arg0 == 5062) {
				anInt2945 -= 2;
				local182 = anIntArray152[anInt2945];
				local814 = anIntArray152[anInt2945 + 1];
				anIntArray152[anInt2945++] = Static112.aClass123_1.method2213(local182).aCharArray7[local814];
				return;
			}
			if (arg0 == 5063) {
				anInt2945 -= 2;
				local182 = anIntArray152[anInt2945];
				local814 = anIntArray152[anInt2945 + 1];
				anIntArray152[anInt2945++] = Static112.aClass123_1.method2213(local182).aCharArray6[local814];
				return;
			}
			if (arg0 == 5064) {
				anInt2945 -= 2;
				local182 = anIntArray152[anInt2945];
				local814 = anIntArray152[anInt2945 + 1];
				if (local814 == -1) {
					anIntArray152[anInt2945++] = -1;
					return;
				}
				anIntArray152[anInt2945++] = Static112.aClass123_1.method2213(local182).method9195((char) local814);
				return;
			}
			if (arg0 == 5065) {
				anInt2945 -= 2;
				local182 = anIntArray152[anInt2945];
				local814 = anIntArray152[anInt2945 + 1];
				if (local814 == -1) {
					anIntArray152[anInt2945++] = -1;
					return;
				}
				anIntArray152[anInt2945++] = Static112.aClass123_1.method2213(local182).method9189((char) local814);
				return;
			}
			if (arg0 == 5066) {
				local182 = anIntArray152[--anInt2945];
				anIntArray152[anInt2945++] = Static502.aClass259_2.method6241(local182).method680();
				return;
			}
			if (arg0 == 5067) {
				anInt2945 -= 2;
				local182 = anIntArray152[anInt2945];
				local814 = anIntArray152[anInt2945 + 1];
				local104 = Static502.aClass259_2.method6241(local182).method682(local814).anInt1928;
				anIntArray152[anInt2945++] = local104;
				return;
			}
			if (arg0 == 5068) {
				anInt2945 -= 2;
				local182 = anIntArray152[anInt2945];
				local814 = anIntArray152[anInt2945 + 1];
				aClass139_1.anIntArray169[local182] = local814;
				return;
			}
			if (arg0 == 5069) {
				anInt2945 -= 2;
				local182 = anIntArray152[anInt2945];
				local814 = anIntArray152[anInt2945 + 1];
				aClass139_1.anIntArray169[local182] = local814;
				return;
			}
			if (arg0 == 5070) {
				anInt2945 -= 3;
				local182 = anIntArray152[anInt2945];
				local814 = anIntArray152[anInt2945 + 1];
				local104 = anIntArray152[anInt2945 + 2];
				@Pc(1491) Class5_Sub5_Sub1 local1491 = Static502.aClass259_2.method6241(local182);
				if (local1491.method682(local814).anInt1928 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray152[anInt2945++] = local1491.method676(local104, local814);
				return;
			}
			if (arg0 == 5071) {
				local90 = aStringArray24[--anInt2937];
				local1543 = anIntArray152[--anInt2945] == 1;
				Static644.method8987(local1543, local90);
				anIntArray152[anInt2945++] = Static450.anInt7749;
				return;
			}
			if (arg0 == 5072) {
				if (Static539.aShortArray118 != null && Static418.anInt7221 < Static450.anInt7749) {
					anIntArray152[anInt2945++] = Static539.aShortArray118[Static418.anInt7221++] & 0xFFFF;
					return;
				}
				anIntArray152[anInt2945++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static418.anInt7221 = 0;
				return;
			}
			if (arg0 == 5074) {
				local59 = Static457.method6722(Static417.aClass387_75, Static80.aClass313_1);
				local59.aClass5_Sub23_Sub2_2.method8502(0);
				local814 = local59.aClass5_Sub23_Sub2_2.anInt9869;
				local59.aClass5_Sub23_Sub2_2.method8502(2);
				local59.aClass5_Sub23_Sub2_2.method8480(aClass139_1.anInt3083);
				aClass139_1.aClass5_Sub5_Sub1_1.method677(aClass139_1.anIntArray169, local59.aClass5_Sub23_Sub2_2);
				local59.aClass5_Sub23_Sub2_2.method8541(local59.aClass5_Sub23_Sub2_2.anInt9869 - local814);
				Static494.method7120(local59);
				return;
			}
			if (arg0 == 5075) {
				local59 = Static457.method6722(Static417.aClass387_75, Static80.aClass313_1);
				local59.aClass5_Sub23_Sub2_2.method8502(0);
				local814 = local59.aClass5_Sub23_Sub2_2.anInt9869;
				local59.aClass5_Sub23_Sub2_2.method8502(3);
				local59.aClass5_Sub23_Sub2_2.method8480(aClass139_1.anInt3083);
				aClass139_1.aClass5_Sub5_Sub1_1.method677(aClass139_1.anIntArray169, local59.aClass5_Sub23_Sub2_2);
				local59.aClass5_Sub23_Sub2_2.method8541(local59.aClass5_Sub23_Sub2_2.anInt9869 - local814);
				Static494.method7120(local59);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static258.aClass89_1.method1617(86)) {
					anIntArray152[anInt2945++] = 1;
					return;
				}
				anIntArray152[anInt2945++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static258.aClass89_1.method1617(82)) {
					anIntArray152[anInt2945++] = 1;
					return;
				}
				anIntArray152[anInt2945++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static258.aClass89_1.method1617(81)) {
					anIntArray152[anInt2945++] = 1;
					return;
				}
				anIntArray152[anInt2945++] = 0;
				return;
			}
		} else {
			@Pc(3046) int local3046;
			@Pc(2286) boolean local2286;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static519.method7525(anIntArray152[--anInt2945]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray152[anInt2945++] = Static233.method3390();
					return;
				}
				if (arg0 == 5205) {
					Static443.method6565(anIntArray152[--anInt2945], false, -1, -1);
					return;
				}
				@Pc(1863) Class5_Sub5_Sub12 local1863;
				if (arg0 == 5206) {
					local182 = anIntArray152[--anInt2945];
					local1863 = Static629.method8384(local182 >> 14 & 0x3FFF, local182 & 0x3FFF);
					if (local1863 == null) {
						anIntArray152[anInt2945++] = -1;
						return;
					}
					anIntArray152[anInt2945++] = local1863.anInt4368;
					return;
				}
				@Pc(1897) Class5_Sub5_Sub12 local1897;
				if (arg0 == 5207) {
					local1897 = Static629.method8389(anIntArray152[--anInt2945]);
					if (local1897 != null && local1897.aString65 != null) {
						aStringArray24[anInt2937++] = local1897.aString65;
						return;
					}
					aStringArray24[anInt2937++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray152[anInt2945++] = Static267.anInt4662;
					anIntArray152[anInt2945++] = Static645.anInt10500;
					return;
				}
				if (arg0 == 5209) {
					anIntArray152[anInt2945++] = Static622.anInt10186 + Static629.anInt9765;
					anIntArray152[anInt2945++] = Static448.anInt7716 + Static629.anInt9763;
					return;
				}
				if (arg0 == 5210) {
					local182 = anIntArray152[--anInt2945];
					local1863 = Static629.method8389(local182);
					if (local1863 == null) {
						anIntArray152[anInt2945++] = 0;
						anIntArray152[anInt2945++] = 0;
						return;
					}
					anIntArray152[anInt2945++] = local1863.anInt4374 >> 14 & 0x3FFF;
					anIntArray152[anInt2945++] = local1863.anInt4374 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local182 = anIntArray152[--anInt2945];
					local1863 = Static629.method8389(local182);
					if (local1863 == null) {
						anIntArray152[anInt2945++] = 0;
						anIntArray152[anInt2945++] = 0;
						return;
					}
					anIntArray152[anInt2945++] = local1863.anInt4369 - local1863.anInt4375;
					anIntArray152[anInt2945++] = local1863.anInt4372 - local1863.anInt4377;
					return;
				}
				@Pc(2094) Class5_Sub8 local2094;
				if (arg0 == 5212) {
					local2094 = Static89.method1341();
					if (local2094 == null) {
						anIntArray152[anInt2945++] = -1;
						anIntArray152[anInt2945++] = -1;
						return;
					}
					anIntArray152[anInt2945++] = local2094.anInt1429;
					local814 = local2094.anInt1427 << 28 | local2094.anInt1430 + Static629.anInt9765 << 14 | local2094.anInt1432 + Static629.anInt9763;
					anIntArray152[anInt2945++] = local814;
					return;
				}
				if (arg0 == 5213) {
					local2094 = Static11.method236();
					if (local2094 == null) {
						anIntArray152[anInt2945++] = -1;
						anIntArray152[anInt2945++] = -1;
						return;
					}
					anIntArray152[anInt2945++] = local2094.anInt1429;
					local814 = local2094.anInt1427 << 28 | local2094.anInt1430 + Static629.anInt9765 << 14 | local2094.anInt1432 + Static629.anInt9763;
					anIntArray152[anInt2945++] = local814;
					return;
				}
				@Pc(2244) boolean local2244;
				if (arg0 == 5214) {
					local182 = anIntArray152[--anInt2945];
					local1863 = Static397.method5809();
					if (local1863 != null) {
						local2244 = local1863.method3739(local182 >> 28 & 0x3, local182 >> 14 & 0x3FFF, anIntArray154, local182 & 0x3FFF);
						if (local2244) {
							Static80.method1207(anIntArray154[2], anIntArray154[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt2945 -= 2;
					local182 = anIntArray152[anInt2945];
					local814 = anIntArray152[anInt2945 + 1];
					@Pc(2284) Class149 local2284 = Static629.method8397(local182 >> 14 & 0x3FFF, local182 & 0x3FFF);
					local2286 = false;
					for (@Pc(2291) Class5_Sub5_Sub12 local2291 = (Class5_Sub5_Sub12) local2284.method2890(); local2291 != null; local2291 = (Class5_Sub5_Sub12) local2284.method2894()) {
						if (local2291.anInt4368 == local814) {
							local2286 = true;
							break;
						}
					}
					if (local2286) {
						anIntArray152[anInt2945++] = 1;
						return;
					}
					anIntArray152[anInt2945++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local182 = anIntArray152[--anInt2945];
					local1863 = Static629.method8389(local182);
					if (local1863 == null) {
						anIntArray152[anInt2945++] = -1;
						return;
					}
					anIntArray152[anInt2945++] = local1863.anInt4371;
					return;
				}
				if (arg0 == 5220) {
					anIntArray152[anInt2945++] = Static270.anInt4694 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local182 = anIntArray152[--anInt2945];
					Static80.method1207(local182 & 0x3FFF, local182 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1897 = Static397.method5809();
					if (local1897 != null) {
						local1543 = local1897.method3740(Static622.anInt10186 + Static629.anInt9765, Static448.anInt7716 + Static629.anInt9763, anIntArray154);
						if (local1543) {
							anIntArray152[anInt2945++] = anIntArray154[1];
							anIntArray152[anInt2945++] = anIntArray154[2];
							return;
						}
						anIntArray152[anInt2945++] = -1;
						anIntArray152[anInt2945++] = -1;
						return;
					}
					anIntArray152[anInt2945++] = -1;
					anIntArray152[anInt2945++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt2945 -= 2;
					local182 = anIntArray152[anInt2945];
					local814 = anIntArray152[anInt2945 + 1];
					Static443.method6565(local182, false, local814 & 0x3FFF, local814 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local182 = anIntArray152[--anInt2945];
					local1863 = Static397.method5809();
					if (local1863 != null) {
						local2244 = local1863.method3739(local182 >> 28 & 0x3, local182 >> 14 & 0x3FFF, anIntArray154, local182 & 0x3FFF);
						if (local2244) {
							anIntArray152[anInt2945++] = anIntArray154[1];
							anIntArray152[anInt2945++] = anIntArray154[2];
							return;
						}
						anIntArray152[anInt2945++] = -1;
						anIntArray152[anInt2945++] = -1;
						return;
					}
					anIntArray152[anInt2945++] = -1;
					anIntArray152[anInt2945++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local182 = anIntArray152[--anInt2945];
					local1863 = Static397.method5809();
					if (local1863 != null) {
						local2244 = local1863.method3740(local182 >> 14 & 0x3FFF, local182 & 0x3FFF, anIntArray154);
						if (local2244) {
							anIntArray152[anInt2945++] = anIntArray154[1];
							anIntArray152[anInt2945++] = anIntArray154[2];
							return;
						}
						anIntArray152[anInt2945++] = -1;
						anIntArray152[anInt2945++] = -1;
						return;
					}
					anIntArray152[anInt2945++] = -1;
					anIntArray152[anInt2945++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static197.method8883(anIntArray152[--anInt2945]);
					return;
				}
				if (arg0 == 5227) {
					anInt2945 -= 2;
					local182 = anIntArray152[anInt2945];
					local814 = anIntArray152[anInt2945 + 1];
					Static443.method6565(local182, true, local814 & 0x3FFF, local814 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static379.aBoolean502 = anIntArray152[--anInt2945] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray152[anInt2945++] = Static379.aBoolean502 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local182 = anIntArray152[--anInt2945];
					Static355.method5320(local182);
					return;
				}
				@Pc(2822) Class5 local2822;
				if (arg0 == 5231) {
					anInt2945 -= 2;
					local182 = anIntArray152[anInt2945];
					local1543 = anIntArray152[anInt2945 + 1] == 1;
					if (Static103.aClass291_7 != null) {
						local2822 = Static103.aClass291_7.method6993((long) local182, 1);
						if (local2822 != null && !local1543) {
							local2822.method9327(1);
							return;
						}
						if (local2822 == null && local1543) {
							local2822 = new Class5();
							Static103.aClass291_7.method6984((long) local182, local2822);
						}
					}
					return;
				}
				@Pc(2869) Class5 local2869;
				if (arg0 == 5232) {
					local182 = anIntArray152[--anInt2945];
					if (Static103.aClass291_7 != null) {
						local2869 = Static103.aClass291_7.method6993((long) local182, 1);
						anIntArray152[anInt2945++] = local2869 == null ? 0 : 1;
						return;
					}
					anIntArray152[anInt2945++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt2945 -= 2;
					local182 = anIntArray152[anInt2945];
					local1543 = anIntArray152[anInt2945 + 1] == 1;
					if (Static80.aClass291_4 != null) {
						local2822 = Static80.aClass291_4.method6993((long) local182, 1);
						if (local2822 != null && !local1543) {
							local2822.method9327(1);
							return;
						}
						if (local2822 == null && local1543) {
							local2822 = new Class5();
							Static80.aClass291_4.method6984((long) local182, local2822);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local182 = anIntArray152[--anInt2945];
					if (Static80.aClass291_4 != null) {
						local2869 = Static80.aClass291_4.method6993((long) local182, 1);
						anIntArray152[anInt2945++] = local2869 == null ? 0 : 1;
						return;
					}
					anIntArray152[anInt2945++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray152[anInt2945++] = Static629.aClass5_Sub5_Sub12_3 == null ? -1 : Static629.aClass5_Sub5_Sub12_3.anInt4368;
					return;
				}
				if (arg0 == 5236) {
					anInt2945 -= 2;
					local182 = anIntArray152[anInt2945];
					local814 = anIntArray152[anInt2945 + 1];
					local104 = local814 >> 14 & 0x3FFF;
					local110 = local814 & 0x3FFF;
					local3046 = Static602.method8656(local110, local182, local104);
					if (local3046 < 0) {
						anIntArray152[anInt2945++] = -1;
						return;
					}
					anIntArray152[anInt2945++] = local3046;
					return;
				}
				if (arg0 == 5237) {
					Static190.method2758();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt2945 -= 2;
					local182 = anIntArray152[anInt2945];
					local814 = anIntArray152[anInt2945 + 1];
					Static674.method9280(false, local182, local814, 3);
					anIntArray152[anInt2945++] = Static517.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static517.aFrame1 != null) {
						Static674.method9280(false, -1, -1, Static637.aClass5_Sub20_31.aClass24_Sub7_2.method2574());
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(3141) Class277[] local3141 = Static519.method7526();
					anIntArray152[anInt2945++] = local3141.length;
					return;
				}
				if (arg0 == 5303) {
					local182 = anIntArray152[--anInt2945];
					@Pc(3165) Class277[] local3165 = Static519.method7526();
					anIntArray152[anInt2945++] = local3165[local182].anInt7756;
					anIntArray152[anInt2945++] = local3165[local182].anInt7753;
					return;
				}
				if (arg0 == 5305) {
					local182 = Static537.anInt3769;
					local814 = Static274.anInt4835;
					local104 = -1;
					@Pc(3200) Class277[] local3200 = Static519.method7526();
					for (local3046 = 0; local3046 < local3200.length; local3046++) {
						@Pc(3207) Class277 local3207 = local3200[local3046];
						if (local3207.anInt7756 == local182 && local3207.anInt7753 == local814) {
							local104 = local3046;
							break;
						}
					}
					anIntArray152[anInt2945++] = local104;
					return;
				}
				if (arg0 == 5306) {
					anIntArray152[anInt2945++] = Static341.method5176();
					return;
				}
				if (arg0 == 5307) {
					local182 = anIntArray152[--anInt2945];
					if (local182 >= 1 && local182 <= 2) {
						Static674.method9280(false, -1, -1, local182);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub7_2.method2574();
					return;
				}
				if (arg0 == 5309) {
					local182 = anIntArray152[--anInt2945];
					if (local182 >= 1 && local182 <= 2) {
						Static637.aClass5_Sub20_31.method3194(local182, Static637.aClass5_Sub20_31.aClass24_Sub7_2);
						Static637.aClass5_Sub20_31.method3194(local182, Static637.aClass5_Sub20_31.aClass24_Sub7_1);
						Static52.method792();
						return;
					}
					return;
				}
			} else {
				@Pc(3511) int local3511;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt2937 -= 2;
						local90 = aStringArray24[anInt2937];
						local96 = aStringArray24[anInt2937 + 1];
						local104 = anIntArray152[--anInt2945];
						@Pc(3368) Class5_Sub50 local3368 = Static457.method6722(Static374.aClass387_66, Static80.aClass313_1);
						local3368.aClass5_Sub23_Sub2_2.method8502(Static228.method3239(local90) + Static228.method3239(local96) + 1);
						local3368.aClass5_Sub23_Sub2_2.method8538(local90);
						local3368.aClass5_Sub23_Sub2_2.method8538(local96);
						local3368.aClass5_Sub23_Sub2_2.method8502(local104);
						Static494.method7120(local3368);
						return;
					}
					if (arg0 == 5401) {
						anInt2945 -= 2;
						Static309.aShortArray79[anIntArray152[anInt2945]] = (short) Static65.method1086(anIntArray152[anInt2945 + 1]);
						Static201.aClass127_1.method2503();
						Static201.aClass127_1.method2500();
						Static325.aClass231_1.method5366();
						Static437.method6493();
						return;
					}
					if (arg0 == 5405) {
						anInt2945 -= 2;
						local182 = anIntArray152[anInt2945];
						local814 = anIntArray152[anInt2945 + 1];
						if (local182 >= 0 && local182 < 2) {
							Static357.anIntArrayArrayArray16[local182] = new int[local814 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt2945 -= 7;
						local182 = anIntArray152[anInt2945];
						local814 = anIntArray152[anInt2945 + 1] << 1;
						local104 = anIntArray152[anInt2945 + 2];
						local110 = anIntArray152[anInt2945 + 3];
						local3046 = anIntArray152[anInt2945 + 4];
						local3511 = anIntArray152[anInt2945 + 5];
						@Pc(3517) int local3517 = anIntArray152[anInt2945 + 6];
						if (local182 >= 0 && local182 < 2 && Static357.anIntArrayArrayArray16[local182] != null && local814 >= 0 && local814 < Static357.anIntArrayArrayArray16[local182].length) {
							Static357.anIntArrayArrayArray16[local182][local814] = new int[] { (local104 >> 14 & 0x3FFF) << 9, local110 << 2, (local104 & 0x3FFF) << 9, local3517 };
							Static357.anIntArrayArrayArray16[local182][local814 + 1] = new int[] { (local3046 >> 14 & 0x3FFF) << 9, local3511 << 2, (local3046 & 0x3FFF) << 9 };
						}
						return;
					}
					if (arg0 == 5407) {
						local182 = Static357.anIntArrayArrayArray16[anIntArray152[--anInt2945]].length >> 1;
						anIntArray152[anInt2945++] = local182;
						return;
					}
					if (arg0 == 5411) {
						if (Static517.aFrame1 != null) {
							Static674.method9280(false, -1, -1, Static637.aClass5_Sub20_31.aClass24_Sub7_2.method2574());
						}
						if (Static675.aFrame3 != null) {
							Static553.method8002();
							System.exit(0);
							return;
						}
						local90 = Static575.aString122 == null ? Static66.method1090() : Static575.aString122;
						Static421.method6305(local90, Static294.aClass230_3, Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() == 1, false);
						return;
					}
					if (arg0 == 5419) {
						local90 = "";
						if (Static596.aClass366_8 != null) {
							if (Static596.aClass366_8.anObject18 == null) {
								local90 = Static659.method9132(Static596.aClass366_8.anInt10204);
							} else {
								local90 = (String) Static596.aClass366_8.anObject18;
							}
						}
						aStringArray24[anInt2937++] = local90;
						return;
					}
					if (arg0 == 5420) {
						anIntArray152[anInt2945++] = Static294.aClass230_3.aBoolean471 ? 0 : 1;
						return;
					}
					if (arg0 == 5421) {
						if (Static517.aFrame1 != null) {
							Static674.method9280(false, -1, -1, Static637.aClass5_Sub20_31.aClass24_Sub7_2.method2574());
						}
						local90 = aStringArray24[--anInt2937];
						local1543 = anIntArray152[--anInt2945] == 1;
						local188 = Static66.method1090() + local90;
						Static421.method6305(local188, Static294.aClass230_3, Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153() == 1, local1543);
						return;
					}
					if (arg0 == 5422) {
						anInt2937 -= 2;
						local90 = aStringArray24[anInt2937];
						local96 = aStringArray24[anInt2937 + 1];
						local104 = anIntArray152[--anInt2945];
						if (local90.length() > 0) {
							if (Static389.aStringArray45 == null) {
								Static389.aStringArray45 = new String[Static553.anIntArray526[Static256.aClass333_3.anInt9710]];
							}
							Static389.aStringArray45[local104] = local90;
						}
						if (local96.length() > 0) {
							if (Static432.aStringArray50 == null) {
								Static432.aStringArray50 = new String[Static553.anIntArray526[Static256.aClass333_3.anInt9710]];
							}
							Static432.aStringArray50[local104] = local96;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray24[--anInt2937]);
						return;
					}
					if (arg0 == 5424) {
						anInt2945 -= 11;
						Static48.anInt803 = anIntArray152[anInt2945];
						Static443.anInt7617 = anIntArray152[anInt2945 + 1];
						Static234.anInt3917 = anIntArray152[anInt2945 + 2];
						Static97.anInt1570 = anIntArray152[anInt2945 + 3];
						Static17.anInt295 = anIntArray152[anInt2945 + 4];
						Static24.anInt353 = anIntArray152[anInt2945 + 5];
						Static66.anInt1082 = anIntArray152[anInt2945 + 6];
						Static557.anInt9396 = anIntArray152[anInt2945 + 7];
						Static201.anInt3255 = anIntArray152[anInt2945 + 8];
						Static675.anInt10800 = anIntArray152[anInt2945 + 9];
						Static575.anInt9643 = anIntArray152[anInt2945 + 10];
						Static345.aClass208_78.method4977(Static17.anInt295);
						Static345.aClass208_78.method4977(Static24.anInt353);
						Static345.aClass208_78.method4977(Static66.anInt1082);
						Static345.aClass208_78.method4977(Static557.anInt9396);
						Static345.aClass208_78.method4977(Static201.anInt3255);
						Static334.aClass134_29 = null;
						Static533.aClass134_33 = null;
						Static241.aClass134_36 = null;
						Static85.aClass134_7 = null;
						Static26.aClass134_4 = null;
						Static223.aClass134_23 = null;
						Static306.aClass134_27 = null;
						Static476.aClass134_31 = null;
						Static519.aBoolean664 = true;
						return;
					}
					if (arg0 == 5425) {
						Static203.method2914();
						Static519.aBoolean664 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt2945 -= 2;
						Static273.anInt4776 = anIntArray152[anInt2945];
						Static640.anInt10423 = anIntArray152[anInt2945 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt2945 -= 2;
						Static571.anInt9569 = anIntArray152[anInt2945 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt2945 -= 2;
						local182 = anIntArray152[anInt2945];
						local814 = anIntArray152[anInt2945 + 1];
						anIntArray152[anInt2945++] = Static278.method4090(local814, local182) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static676.method8313(false, false, aStringArray24[--anInt2937]);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static681.method743(Static492.anApplet2, "accountcreated");
							return;
						} catch (@Pc(4104) Throwable local4104) {
							return;
						}
					}
					if (arg0 == 5431) {
						try {
							Static681.method743(Static492.anApplet2, "accountcreatestarted");
							return;
						} catch (@Pc(4117) Throwable local4117) {
							return;
						}
					}
					if (arg0 == 5432) {
						local90 = "";
						if (Static210.aClipboard5 != null) {
							@Pc(4129) Transferable local4129 = Static210.aClipboard5.getContents((Object) null);
							if (local4129 != null) {
								try {
									local90 = (String) local4129.getTransferData(DataFlavor.stringFlavor);
									if (local90 == null) {
										local90 = "";
									}
								} catch (@Pc(4142) Exception local4142) {
								}
							}
						}
						aStringArray24[anInt2937++] = local90;
						return;
					}
					if (arg0 == 5433) {
						Static154.anInt2439 = anIntArray152[--anInt2945];
						return;
					}
					if (arg0 == 5435) {
						anIntArray152[anInt2945++] = Static301.aBoolean679 ? 1 : 0;
						return;
					}
					if (arg0 == 5436) {
						if (Static528.aClass5_Sub19_1.anInt3451 < 6) {
							anIntArray152[anInt2945++] = 0;
							return;
						}
						if (Static528.aClass5_Sub19_1.anInt3451 == 6 && Static528.aClass5_Sub19_1.anInt3455 < 10) {
							anIntArray152[anInt2945++] = 0;
							return;
						}
						anIntArray152[anInt2945++] = 1;
						return;
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt2945 -= 4;
						local182 = anIntArray152[anInt2945];
						local814 = anIntArray152[anInt2945 + 1];
						local104 = anIntArray152[anInt2945 + 2];
						local110 = anIntArray152[anInt2945 + 3];
						Static46.method755(false, (local182 & 0x3FFF) - Static668.anInt10683, local104, (local182 >> 14 & 0x3FFF) - Static622.anInt10188, local814 << 2, local110);
						return;
					}
					if (arg0 == 5501) {
						anInt2945 -= 4;
						local182 = anIntArray152[anInt2945];
						local814 = anIntArray152[anInt2945 + 1];
						local104 = anIntArray152[anInt2945 + 2];
						local110 = anIntArray152[anInt2945 + 3];
						Static663.method1227((local182 >> 14 & 0x3FFF) - Static622.anInt10188, local814 << 2, local104, local110, (local182 & 0x3FFF) - Static668.anInt10683);
						return;
					}
					if (arg0 == 5502) {
						anInt2945 -= 6;
						local182 = anIntArray152[anInt2945];
						if (local182 >= 2) {
							throw new RuntimeException();
						}
						Static658.anInt10595 = local182;
						local814 = anIntArray152[anInt2945 + 1];
						if (local814 + 1 >= Static357.anIntArrayArrayArray16[Static658.anInt10595].length >> 1) {
							throw new RuntimeException();
						}
						Static643.anInt10456 = local814;
						Static473.anInt8013 = 0;
						Static522.anInt8831 = anIntArray152[anInt2945 + 2];
						Static417.anInt7210 = anIntArray152[anInt2945 + 3];
						local104 = anIntArray152[anInt2945 + 4];
						if (local104 >= 2) {
							throw new RuntimeException();
						}
						Static342.anInt6068 = local104;
						local110 = anIntArray152[anInt2945 + 5];
						if (local110 + 1 >= Static357.anIntArrayArrayArray16[Static342.anInt6068].length >> 1) {
							throw new RuntimeException();
						}
						Static62.anInt971 = local110;
						Static79.anInt1216 = 3;
						Static272.anInt4763 = -1;
						Static651.anInt10529 = -1;
						return;
					}
					if (arg0 == 5503) {
						Static110.method1585();
						return;
					}
					if (arg0 == 5504) {
						anInt2945 -= 2;
						Static256.method3779(anIntArray152[anInt2945], anIntArray152[anInt2945 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray152[anInt2945++] = (int) Static138.aFloat18 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray152[anInt2945++] = (int) Static429.aFloat132 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static393.method6333();
						return;
					}
					if (arg0 == 5508) {
						Static598.method8620();
						return;
					}
					if (arg0 == 5509) {
						Static459.method6735();
						return;
					}
					if (arg0 == 5510) {
						Static556.method8030();
						return;
					}
					if (arg0 == 5511) {
						local182 = anIntArray152[--anInt2945];
						local814 = local182 >> 14 & 0x3FFF;
						local104 = local182 & 0x3FFF;
						local814 -= Static622.anInt10188;
						if (local814 < 0) {
							local814 = 0;
						} else if (local814 >= Static544.anInt9261) {
							local814 = Static544.anInt9261;
						}
						local104 -= Static668.anInt10683;
						if (local104 < 0) {
							local104 = 0;
						} else if (local104 >= Static282.anInt4887) {
							local104 = Static282.anInt4887;
						}
						Static497.anInt10511 = (local814 << 9) + 256;
						Static291.anInt5066 = (local104 << 9) + 256;
						Static79.anInt1216 = 4;
						Static272.anInt4763 = -1;
						Static651.anInt10529 = -1;
						return;
					}
					if (arg0 == 5512) {
						Static433.method6419();
						return;
					}
					if (arg0 == 5514) {
						Static243.anInt4191 = anIntArray152[--anInt2945];
						return;
					}
					if (arg0 == 5516) {
						anIntArray152[anInt2945++] = Static243.anInt4191;
						return;
					}
					if (arg0 == 5517) {
						local182 = anIntArray152[--anInt2945];
						if (local182 == -1) {
							local814 = local182 >> 14 & 0x3FFF;
							local104 = local182 & 0x3FFF;
							local814 -= Static622.anInt10188;
							if (local814 < 0) {
								local814 = 0;
							} else if (local814 >= Static544.anInt9261) {
								local814 = Static544.anInt9261;
							}
							local104 -= Static668.anInt10683;
							if (local104 < 0) {
								local104 = 0;
							} else if (local104 >= Static282.anInt4887) {
								local104 = Static282.anInt4887;
							}
							Static651.anInt10529 = (local814 << 9) + 256;
							Static272.anInt4763 = (local104 << 9) + 256;
							return;
						}
						Static651.anInt10529 = -1;
						Static272.anInt4763 = -1;
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt2937 -= 2;
						local90 = aStringArray24[anInt2937];
						local96 = aStringArray24[anInt2937 + 1];
						local104 = anIntArray152[--anInt2945];
						Static133.method1930(local96, local104, local90);
						return;
					}
					if (arg0 == 5601) {
						Static174.method2557();
						return;
					}
					if (arg0 == 5602) {
						if (!Static665.method9171()) {
							Static68.method1106();
						}
						return;
					}
					if (arg0 == 5604) {
						anInt2937--;
						if (Static107.anInt1746 != 3) {
							return;
						}
						if (!Static665.method9171() && Static222.anInt3623 == 0) {
							Static558.method8062(aStringArray24[anInt2937]);
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt2937 -= 2;
						anInt2945 -= 2;
						if (Static107.anInt1746 != 3) {
							return;
						}
						if (!Static665.method9171() && Static222.anInt3623 == 0) {
							Static557.method8057(anIntArray152[anInt2945 + 1] == 1, anIntArray152[anInt2945], aStringArray24[anInt2937], aStringArray24[anInt2937 + 1]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static222.anInt3623 == 0) {
							Static67.anInt1085 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray152[anInt2945++] = Static313.anInt5550;
						return;
					}
					if (arg0 == 5608) {
						anIntArray152[anInt2945++] = Static41.anInt727;
						return;
					}
					if (arg0 == 5609) {
						anIntArray152[anInt2945++] = Static67.anInt1085;
						return;
					}
					if (arg0 == 5611) {
						anIntArray152[anInt2945++] = Static462.anInt7858;
						return;
					}
					if (arg0 == 5612) {
						local182 = anIntArray152[--anInt2945];
						Static182.method2667(local182);
						return;
					}
					if (arg0 == 5613) {
						anIntArray152[anInt2945++] = Static313.anInt5550;
						return;
					}
					if (arg0 == 5615) {
						anInt2937 -= 2;
						local90 = aStringArray24[anInt2937];
						local96 = aStringArray24[anInt2937 + 1];
						Static281.method4139(local90, local96);
						return;
					}
					if (arg0 == 5616) {
						Static600.method8644(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray152[anInt2945++] = Static89.anInt1506;
						return;
					}
					if (arg0 == 5618) {
						anInt2945--;
						return;
					}
					if (arg0 == 5619) {
						anInt2945--;
						return;
					}
					if (arg0 == 5620) {
						anIntArray152[anInt2945++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt2937 -= 2;
						anInt2945 -= 2;
						return;
					}
					if (arg0 == 5622) {
						return;
					}
					if (arg0 == 5623) {
						if (Static672.aByteArray113 != null) {
							anIntArray152[anInt2945++] = 1;
							return;
						}
						anIntArray152[anInt2945++] = 0;
						return;
					}
					if (arg0 == 5624) {
						anIntArray152[anInt2945++] = (int) (Static294.aLong158 >> 32);
						anIntArray152[anInt2945++] = (int) (Static294.aLong158 & 0xFFFFFFFFFFFFFFFFL);
						return;
					}
					if (arg0 == 5625) {
						anIntArray152[anInt2945++] = Static581.aBoolean744 ? 1 : 0;
						return;
					}
					if (arg0 == 5626) {
						Static581.aBoolean744 = true;
						Static112.method1624();
						return;
					}
					if (arg0 == 5628) {
						anIntArray152[anInt2945++] = Static665.method9171() ? 1 : 0;
						return;
					}
					if (arg0 == 5630) {
						Static194.method2799();
						return;
					}
					if (arg0 == 5631) {
						anInt2945 -= 2;
						local182 = anIntArray152[anInt2945];
						local814 = anIntArray152[anInt2945 + 1];
						Static248.method3643(local814, (byte) 95, local182);
						return;
					}
					if (arg0 == 5632) {
						local182 = anIntArray152[--anInt2945];
						Static133.method1925(local182);
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local182 = anIntArray152[--anInt2945];
						Static637.aClass5_Sub20_31.method3194(local182, Static637.aClass5_Sub20_31.aClass24_Sub9_1);
						Static163.method2205();
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					@Pc(5212) boolean local5212;
					if (arg0 == 6002) {
						local5212 = anIntArray152[--anInt2945] == 1;
						Static637.aClass5_Sub20_31.method3194(local5212 ? 1 : 0, Static637.aClass5_Sub20_31.aClass24_Sub25_1);
						Static637.aClass5_Sub20_31.method3194(local5212 ? 1 : 0, Static637.aClass5_Sub20_31.aClass24_Sub25_2);
						Static163.method2205();
						Static251.method3706();
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					if (arg0 == 6003) {
						local5212 = anIntArray152[--anInt2945] == 1;
						Static637.aClass5_Sub20_31.method3194(local5212 ? 2 : 1, Static637.aClass5_Sub20_31.aClass24_Sub17_1);
						Static637.aClass5_Sub20_31.method3194(local5212 ? 2 : 1, Static637.aClass5_Sub20_31.aClass24_Sub17_2);
						Static251.method3706();
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					if (arg0 == 6005) {
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945] == 1 ? 1 : 0, Static637.aClass5_Sub20_31.aClass24_Sub18_1);
						Static163.method2205();
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					if (arg0 == 6007) {
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945], Static637.aClass5_Sub20_31.aClass24_Sub13_1);
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					if (arg0 == 6008) {
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945] == 1 ? 1 : 0, Static637.aClass5_Sub20_31.aClass24_Sub16_1);
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					if (arg0 == 6010) {
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945] == 1 ? 1 : 0, Static637.aClass5_Sub20_31.aClass24_Sub19_1);
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					if (arg0 == 6011) {
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945], Static637.aClass5_Sub20_31.aClass24_Sub4_1);
						Static163.method2205();
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					if (arg0 == 6012) {
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945] == 1 ? 1 : 0, Static637.aClass5_Sub20_31.aClass24_Sub5_1);
						Static310.method4717();
						Static277.method4082();
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					if (arg0 == 6014) {
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945] == 1 ? 2 : 0, Static637.aClass5_Sub20_31.aClass24_Sub28_1);
						Static163.method2205();
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					if (arg0 == 6015) {
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945] == 1 ? 1 : 0, Static637.aClass5_Sub20_31.aClass24_Sub22_1);
						Static163.method2205();
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					if (arg0 == 6016) {
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945], Static637.aClass5_Sub20_31.aClass24_Sub11_1);
						Static565.method8890(Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153(), false);
						Static52.method792();
						return;
					}
					if (arg0 == 6017) {
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945] == 1 ? 1 : 0, Static637.aClass5_Sub20_31.aClass24_Sub24_1);
						Static488.method7042();
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					if (arg0 == 6018) {
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945], Static637.aClass5_Sub20_31.aClass24_Sub12_4);
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					if (arg0 == 6019) {
						local182 = anIntArray152[--anInt2945];
						local814 = Static637.aClass5_Sub20_31.aClass24_Sub12_3.method3413();
						if (local182 != local814) {
							if (Static70.method1121(Static107.anInt1746)) {
								if (local814 == 0 && Static252.anInt4340 != -1) {
									Static335.method5111(local182, Static229.aClass208_57, Static252.anInt4340);
									Static664.method9163();
									Static152.aBoolean200 = false;
								} else if (local182 == 0) {
									Static243.method3610();
									Static152.aBoolean200 = false;
								} else {
									Static325.method4953(local182);
								}
							}
							Static637.aClass5_Sub20_31.method3194(local182, Static637.aClass5_Sub20_31.aClass24_Sub12_3);
							Static52.method792();
							Static261.aBoolean355 = false;
						}
						return;
					}
					if (arg0 == 6020) {
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945], Static637.aClass5_Sub20_31.aClass24_Sub12_1);
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					if (arg0 == 6021) {
						local182 = Static637.aClass5_Sub20_31.aClass24_Sub17_1.method6235();
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945] == 1 ? 0 : local182, Static637.aClass5_Sub20_31.aClass24_Sub17_2);
						Static251.method3706();
						return;
					}
					if (arg0 == 6023) {
						local182 = anIntArray152[--anInt2945];
						Static637.aClass5_Sub20_31.method3194(local182, Static637.aClass5_Sub20_31.aClass24_Sub6_1);
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					if (arg0 == 6024) {
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945], Static637.aClass5_Sub20_31.aClass24_Sub11_2);
						Static52.method792();
						return;
					}
					if (arg0 == 6025) {
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945], Static637.aClass5_Sub20_31.aClass24_Sub26_1);
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					if (arg0 == 6027) {
						local182 = anIntArray152[--anInt2945];
						if (local182 < 0 || local182 > 1) {
							local182 = 0;
						}
						Static664.method9167(local182 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945] == 0 ? 0 : 1, Static637.aClass5_Sub20_31.aClass24_Sub15_1);
						Static52.method792();
						return;
					}
					if (arg0 == 6029) {
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945], Static637.aClass5_Sub20_31.aClass24_Sub13_1);
						Static52.method792();
						return;
					}
					if (arg0 == 6030) {
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945] == 0 ? 0 : 1, Static637.aClass5_Sub20_31.aClass24_Sub21_1);
						Static52.method792();
						Static163.method2205();
						return;
					}
					if (arg0 == 6031) {
						local182 = anIntArray152[--anInt2945];
						if (local182 < 0 || local182 > 5) {
							local182 = 2;
						}
						Static565.method8890(local182, false);
						return;
					}
					if (arg0 == 6032) {
						anInt2945 -= 2;
						local182 = anIntArray152[anInt2945];
						local1543 = anIntArray152[anInt2945 + 1] == 1;
						Static637.aClass5_Sub20_31.method3194(local182, Static637.aClass5_Sub20_31.aClass24_Sub10_2);
						if (!local1543) {
							Static637.aClass5_Sub20_31.method3194(0, Static637.aClass5_Sub20_31.aClass24_Sub2_1);
						}
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					if (arg0 == 6033) {
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945], Static637.aClass5_Sub20_31.aClass24_Sub20_1);
						Static52.method792();
						return;
					}
					if (arg0 == 6034) {
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945] == 1 ? 1 : 0, Static637.aClass5_Sub20_31.aClass24_Sub3_1);
						Static52.method792();
						Static310.method4717();
						Static261.aBoolean355 = false;
						return;
					}
					if (arg0 == 6035) {
						local182 = Static637.aClass5_Sub20_31.aClass24_Sub25_1.method7146();
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945] == 1 ? 1 : local182, Static637.aClass5_Sub20_31.aClass24_Sub25_2);
						Static163.method2205();
						Static251.method3706();
						return;
					}
					if (arg0 == 6036) {
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945], Static637.aClass5_Sub20_31.aClass24_Sub27_1);
						Static52.method792();
						Static179.aBoolean250 = true;
						return;
					}
					if (arg0 == 6037) {
						Static637.aClass5_Sub20_31.method3194(anIntArray152[--anInt2945], Static637.aClass5_Sub20_31.aClass24_Sub12_5);
						Static52.method792();
						Static261.aBoolean355 = false;
						return;
					}
					if (arg0 == 6038) {
						local182 = anIntArray152[--anInt2945];
						local814 = Static637.aClass5_Sub20_31.aClass24_Sub12_2.method3413();
						if (local182 != local814 && Static252.anInt4340 == Static430.anInt6325) {
							if (!Static70.method1121(Static107.anInt1746)) {
								if (local814 == 0) {
									Static335.method5111(local182, Static229.aClass208_57, Static252.anInt4340);
									Static664.method9163();
									Static152.aBoolean200 = false;
								} else if (local182 == 0) {
									Static243.method3610();
									Static152.aBoolean200 = false;
								} else {
									Static325.method4953(local182);
								}
							}
							Static637.aClass5_Sub20_31.method3194(local182, Static637.aClass5_Sub20_31.aClass24_Sub12_2);
							Static52.method792();
							Static261.aBoolean355 = false;
						}
						return;
					}
					if (arg0 == 6039) {
						local182 = anIntArray152[--anInt2945];
						if (local182 > 255 || local182 < 0) {
							local182 = 0;
						}
						if (local182 != Static637.aClass5_Sub20_31.aClass24_Sub29_1.method8889()) {
							Static637.aClass5_Sub20_31.method3194(local182, Static637.aClass5_Sub20_31.aClass24_Sub29_1);
							Static52.method792();
							Static261.aBoolean355 = false;
						}
						return;
					}
					if (arg0 == 6040) {
						local182 = anIntArray152[--anInt2945];
						if (local182 != Static637.aClass5_Sub20_31.aClass24_Sub23_1.method7045()) {
							Static637.aClass5_Sub20_31.method3194(local182, Static637.aClass5_Sub20_31.aClass24_Sub23_1);
							Static52.method792();
							Static261.aBoolean355 = false;
							Static601.method8649();
						}
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub9_1.method2798();
						return;
					}
					if (arg0 == 6102) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub25_1.method7146() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub17_1.method6235() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub18_1.method6492() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub13_1.method5073();
						return;
					}
					if (arg0 == 6108) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub16_1.method5771() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub19_1.method6612() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub4_1.method1674();
						return;
					}
					if (arg0 == 6112) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub5_1.method2086() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub28_1.method8607() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub22_1.method6758() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub11_1.method3217();
						return;
					}
					if (arg0 == 6117) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub24_1.method7095() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub12_4.method3413();
						return;
					}
					if (arg0 == 6119) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub12_3.method3413();
						return;
					}
					if (arg0 == 6120) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub12_1.method3413();
						return;
					}
					if (arg0 == 6123) {
						anIntArray152[anInt2945++] = Static120.method1683();
						return;
					}
					if (arg0 == 6124) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub11_2.method3217();
						return;
					}
					if (arg0 == 6125) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub26_1.method8058();
						return;
					}
					if (arg0 == 6127) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub14_1.method5150() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub15_1.method5534() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub13_1.method5073();
						return;
					}
					if (arg0 == 6130) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub21_1.method6654() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153();
						return;
					}
					if (arg0 == 6132) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub10_2.method3153();
						return;
					}
					if (arg0 == 6133) {
						anIntArray152[anInt2945++] = Static294.aClass230_3.aBoolean471 && !Static294.aClass230_3.aBoolean472 ? 1 : 0;
						return;
					}
					if (arg0 == 6135) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub20_1.method6628();
						return;
					}
					if (arg0 == 6136) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub3_1.method1558() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6138) {
						anIntArray152[anInt2945++] = Static288.method4701(Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153(), 200);
						return;
					}
					if (arg0 == 6139) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub27_1.method8302();
						return;
					}
					if (arg0 == 6142) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub12_5.method3413();
						return;
					}
					if (arg0 == 6143) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub12_2.method3413();
						return;
					}
					if (arg0 == 6144) {
						anIntArray152[anInt2945++] = Static52.aBoolean69 ? 1 : 0;
						return;
					}
					if (arg0 == 6145) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub29_1.method8889();
						return;
					}
					if (arg0 == 6146) {
						anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub23_1.method7045();
						return;
					}
					if (arg0 == 6147) {
						anIntArray152[anInt2945++] = Static528.aClass5_Sub19_1.anInt3442 < 512 || Static52.aBoolean69 || Static404.aBoolean532 ? 1 : 0;
						return;
					}
					if (arg0 == 6148) {
						anIntArray152[anInt2945++] = Static415.aBoolean741 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt2945 -= 2;
						Static377.aShort81 = (short) anIntArray152[anInt2945];
						if (Static377.aShort81 <= 0) {
							Static377.aShort81 = 256;
						}
						Static95.aShort14 = (short) anIntArray152[anInt2945 + 1];
						if (Static95.aShort14 <= 0) {
							Static95.aShort14 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt2945 -= 2;
						Static122.aShort23 = (short) anIntArray152[anInt2945];
						if (Static122.aShort23 <= 0) {
							Static122.aShort23 = 256;
						}
						Static494.aShort99 = (short) anIntArray152[anInt2945 + 1];
						if (Static494.aShort99 <= 0) {
							Static494.aShort99 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt2945 -= 4;
						Static186.aShort36 = (short) anIntArray152[anInt2945];
						if (Static186.aShort36 <= 0) {
							Static186.aShort36 = 1;
						}
						Static389.aShort82 = (short) anIntArray152[anInt2945 + 1];
						if (Static389.aShort82 <= 0) {
							Static389.aShort82 = 32767;
						} else if (Static389.aShort82 < Static186.aShort36) {
							Static389.aShort82 = Static186.aShort36;
						}
						Static545.aShort100 = (short) anIntArray152[anInt2945 + 2];
						if (Static545.aShort100 <= 0) {
							Static545.aShort100 = 1;
						}
						Static264.aShort56 = (short) anIntArray152[anInt2945 + 3];
						if (Static264.aShort56 <= 0) {
							Static264.aShort56 = 32767;
							return;
						}
						if (Static264.aShort56 < Static545.aShort100) {
							Static264.aShort56 = Static545.aShort100;
						}
						return;
					}
					if (arg0 == 6203) {
						Static521.method7549(Static417.aClass73_19.anInt1384, 0, false, Static417.aClass73_19.anInt1394, 0);
						anIntArray152[anInt2945++] = Static234.anInt3903;
						anIntArray152[anInt2945++] = Static212.anInt3463;
						return;
					}
					if (arg0 == 6204) {
						anIntArray152[anInt2945++] = Static122.aShort23;
						anIntArray152[anInt2945++] = Static494.aShort99;
						return;
					}
					if (arg0 == 6205) {
						anIntArray152[anInt2945++] = Static377.aShort81;
						anIntArray152[anInt2945++] = Static95.aShort14;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray152[anInt2945++] = (int) (Static515.method7499(68) / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray152[anInt2945++] = (int) (Static515.method7499(127) / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt2945 -= 3;
						local182 = anIntArray152[anInt2945];
						local814 = anIntArray152[anInt2945 + 1];
						local104 = anIntArray152[anInt2945 + 2];
						@Pc(7213) long local7213 = Static257.method5459(local814, local182, local104);
						local3511 = Static654.method9044(local7213);
						if (local104 < 1970) {
							local3511--;
						}
						anIntArray152[anInt2945++] = local3511;
						return;
					}
					if (arg0 == 6303) {
						anIntArray152[anInt2945++] = Static664.method9159(Static515.method7499(121));
						return;
					}
					if (arg0 == 6304) {
						local182 = anIntArray152[--anInt2945];
						local1543 = true;
						if (local182 < 0) {
							local1543 = (local182 + 1) % 4 == 0;
						} else if (local182 < 1582) {
							local1543 = local182 % 4 == 0;
						} else if (local182 % 4 != 0) {
							local1543 = false;
						} else if (local182 % 100 != 0) {
							local1543 = true;
						} else if (local182 % 400 != 0) {
							local1543 = false;
						}
						anIntArray152[anInt2945++] = local1543 ? 1 : 0;
						return;
					}
					if (arg0 == 6305) {
						local182 = anIntArray152[--anInt2945];
						@Pc(7341) int[] local7341 = Static578.method8301(local182);
						Static682.method796(local7341, 0, anIntArray152, anInt2945, 3);
						anInt2945 += 3;
						return;
					}
					if (arg0 == 6306) {
						local182 = anIntArray152[--anInt2945];
						anIntArray152[anInt2945++] = (int) (Static349.method5257(local182) / 60000L);
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray152[anInt2945++] = Static337.method5135() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray152[anInt2945++] = Static251.method3705() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static107.anInt1746 == 7 && !Static665.method9171() && Static222.anInt3623 == 0) {
							if (Static194.aBoolean260) {
								anIntArray152[anInt2945++] = 0;
								return;
							}
							if (Static566.aLong276 > Static515.method7499(112) - 1000L) {
								anIntArray152[anInt2945++] = 1;
								return;
							}
							Static194.aBoolean260 = true;
							local59 = Static457.method6722(Static476.aClass387_86, Static80.aClass313_1);
							local59.aClass5_Sub23_Sub2_2.method8486(Static201.anInt3259);
							Static494.method7120(local59);
							anIntArray152[anInt2945++] = 0;
							return;
						}
						anIntArray152[anInt2945++] = 1;
						return;
					}
					@Pc(7546) Class279 local7546;
					@Pc(7513) Class180_Sub1 local7513;
					if (arg0 == 6501) {
						local7513 = Static6.method89();
						if (local7513 != null) {
							anIntArray152[anInt2945++] = local7513.anInt4558;
							anIntArray152[anInt2945++] = local7513.anInt4551;
							aStringArray24[anInt2937++] = local7513.aString67;
							local7546 = local7513.method3872();
							anIntArray152[anInt2945++] = local7546.anInt7766;
							aStringArray24[anInt2937++] = local7546.aString103;
							anIntArray152[anInt2945++] = local7513.anInt4548;
							anIntArray152[anInt2945++] = local7513.anInt4555;
							aStringArray24[anInt2937++] = local7513.aString66;
							return;
						}
						anIntArray152[anInt2945++] = -1;
						anIntArray152[anInt2945++] = 0;
						aStringArray24[anInt2937++] = "";
						anIntArray152[anInt2945++] = 0;
						aStringArray24[anInt2937++] = "";
						anIntArray152[anInt2945++] = 0;
						anIntArray152[anInt2945++] = 0;
						aStringArray24[anInt2937++] = "";
						return;
					}
					if (arg0 == 6502) {
						local7513 = Static452.method6467();
						if (local7513 != null) {
							anIntArray152[anInt2945++] = local7513.anInt4558;
							anIntArray152[anInt2945++] = local7513.anInt4551;
							aStringArray24[anInt2937++] = local7513.aString67;
							local7546 = local7513.method3872();
							anIntArray152[anInt2945++] = local7546.anInt7766;
							aStringArray24[anInt2937++] = local7546.aString103;
							anIntArray152[anInt2945++] = local7513.anInt4548;
							anIntArray152[anInt2945++] = local7513.anInt4555;
							aStringArray24[anInt2937++] = local7513.aString66;
							return;
						}
						anIntArray152[anInt2945++] = -1;
						anIntArray152[anInt2945++] = 0;
						aStringArray24[anInt2937++] = "";
						anIntArray152[anInt2945++] = 0;
						aStringArray24[anInt2937++] = "";
						anIntArray152[anInt2945++] = 0;
						anIntArray152[anInt2945++] = 0;
						aStringArray24[anInt2937++] = "";
						return;
					}
					if (arg0 == 6503) {
						local182 = anIntArray152[--anInt2945];
						local96 = aStringArray24[--anInt2937];
						if (Static107.anInt1746 == 7 && !Static665.method9171() && Static222.anInt3623 == 0) {
							anIntArray152[anInt2945++] = Static165.method2325(local182, local96) ? 1 : 0;
							return;
						}
						anIntArray152[anInt2945++] = 0;
						return;
					}
					if (arg0 == 6506) {
						local182 = anIntArray152[--anInt2945];
						@Pc(7880) Class180_Sub1 local7880 = Static30.method492(local182);
						if (local7880 != null) {
							anIntArray152[anInt2945++] = local7880.anInt4551;
							aStringArray24[anInt2937++] = local7880.aString67;
							@Pc(7904) Class279 local7904 = local7880.method3872();
							anIntArray152[anInt2945++] = local7904.anInt7766;
							aStringArray24[anInt2937++] = local7904.aString103;
							anIntArray152[anInt2945++] = local7880.anInt4548;
							anIntArray152[anInt2945++] = local7880.anInt4555;
							aStringArray24[anInt2937++] = local7880.aString66;
							return;
						}
						anIntArray152[anInt2945++] = -1;
						aStringArray24[anInt2937++] = "";
						anIntArray152[anInt2945++] = 0;
						aStringArray24[anInt2937++] = "";
						anIntArray152[anInt2945++] = 0;
						anIntArray152[anInt2945++] = 0;
						aStringArray24[anInt2937++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt2945 -= 4;
						local182 = anIntArray152[anInt2945];
						local1543 = anIntArray152[anInt2945 + 1] == 1;
						local104 = anIntArray152[anInt2945 + 2];
						local2286 = anIntArray152[anInt2945 + 3] == 1;
						Static386.method5632(local1543, local104, local182, local2286);
						return;
					}
					if (arg0 == 6508) {
						Static373.method5464();
						return;
					}
					if (arg0 == 6509) {
						if (Static107.anInt1746 != 7) {
							return;
						}
						Static625.aBoolean761 = anIntArray152[--anInt2945] == 1;
						return;
					}
					if (arg0 == 6510) {
						anIntArray152[anInt2945++] = Static74.anInt1194;
						return;
					}
				} else if (arg0 >= 6700) {
					if (arg0 < 6800 && Static154.aClass249_2 == Static63.aClass249_1) {
						if (arg0 == 6700) {
							local182 = Static549.aClass291_37.method6995();
							if (Static390.anInt6669 != -1) {
								local182++;
							}
							anIntArray152[anInt2945++] = local182;
							return;
						}
						if (arg0 == 6701) {
							local182 = anIntArray152[--anInt2945];
							if (Static390.anInt6669 != -1) {
								if (local182 == 0) {
									anIntArray152[anInt2945++] = Static390.anInt6669;
									return;
								}
								local182--;
							}
							@Pc(8171) Class5_Sub49 local8171 = (Class5_Sub49) Static549.aClass291_37.method6987();
							while (local182-- > 0) {
								local8171 = (Class5_Sub49) Static549.aClass291_37.method6989();
							}
							anIntArray152[anInt2945++] = local8171.anInt9322;
							return;
						}
						if (arg0 == 6702) {
							local182 = anIntArray152[--anInt2945];
							if (Static489.aClass73ArrayArray2[local182] == null) {
								aStringArray24[anInt2937++] = "";
								return;
							}
							local96 = Static489.aClass73ArrayArray2[local182][0].aString24;
							if (local96 == null) {
								aStringArray24[anInt2937++] = "";
								return;
							}
							aStringArray24[anInt2937++] = local96.substring(0, local96.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local182 = anIntArray152[--anInt2945];
							if (Static489.aClass73ArrayArray2[local182] == null) {
								anIntArray152[anInt2945++] = 0;
								return;
							}
							anIntArray152[anInt2945++] = Static489.aClass73ArrayArray2[local182].length;
							return;
						}
						if (arg0 == 6704) {
							anInt2945 -= 2;
							local182 = anIntArray152[anInt2945];
							local814 = anIntArray152[anInt2945 + 1];
							if (Static489.aClass73ArrayArray2[local182] == null) {
								aStringArray24[anInt2937++] = "";
								return;
							}
							local188 = Static489.aClass73ArrayArray2[local182][local814].aString24;
							if (local188 == null) {
								aStringArray24[anInt2937++] = "";
								return;
							}
							aStringArray24[anInt2937++] = local188;
							return;
						}
						if (arg0 == 6705) {
							anInt2945 -= 2;
							local182 = anIntArray152[anInt2945];
							local814 = anIntArray152[anInt2945 + 1];
							if (Static489.aClass73ArrayArray2[local182] == null) {
								anIntArray152[anInt2945++] = 0;
								return;
							}
							anIntArray152[anInt2945++] = Static489.aClass73ArrayArray2[local182][local814].anInt1372;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							anInt2945 -= 3;
							local182 = anIntArray152[anInt2945];
							local814 = anIntArray152[anInt2945 + 1];
							local104 = anIntArray152[anInt2945 + 2];
							Static564.method8144("", local182 << 16 | local814, local104, 1);
							return;
						}
						if (arg0 == 6708) {
							anInt2945 -= 3;
							local182 = anIntArray152[anInt2945];
							local814 = anIntArray152[anInt2945 + 1];
							local104 = anIntArray152[anInt2945 + 2];
							Static564.method8144("", local182 << 16 | local814, local104, 2);
							return;
						}
						if (arg0 == 6709) {
							anInt2945 -= 3;
							local182 = anIntArray152[anInt2945];
							local814 = anIntArray152[anInt2945 + 1];
							local104 = anIntArray152[anInt2945 + 2];
							Static564.method8144("", local182 << 16 | local814, local104, 3);
							return;
						}
						if (arg0 == 6710) {
							anInt2945 -= 3;
							local182 = anIntArray152[anInt2945];
							local814 = anIntArray152[anInt2945 + 1];
							local104 = anIntArray152[anInt2945 + 2];
							Static564.method8144("", local182 << 16 | local814, local104, 4);
							return;
						}
						if (arg0 == 6711) {
							anInt2945 -= 3;
							local182 = anIntArray152[anInt2945];
							local814 = anIntArray152[anInt2945 + 1];
							local104 = anIntArray152[anInt2945 + 2];
							Static564.method8144("", local182 << 16 | local814, local104, 5);
							return;
						}
						if (arg0 == 6712) {
							anInt2945 -= 3;
							local182 = anIntArray152[anInt2945];
							local814 = anIntArray152[anInt2945 + 1];
							local104 = anIntArray152[anInt2945 + 2];
							Static564.method8144("", local182 << 16 | local814, local104, 6);
							return;
						}
						if (arg0 == 6713) {
							anInt2945 -= 3;
							local182 = anIntArray152[anInt2945];
							local814 = anIntArray152[anInt2945 + 1];
							local104 = anIntArray152[anInt2945 + 2];
							Static564.method8144("", local182 << 16 | local814, local104, 7);
							return;
						}
						if (arg0 == 6714) {
							anInt2945 -= 3;
							local182 = anIntArray152[anInt2945];
							local814 = anIntArray152[anInt2945 + 1];
							local104 = anIntArray152[anInt2945 + 2];
							Static564.method8144("", local182 << 16 | local814, local104, 8);
							return;
						}
						if (arg0 == 6715) {
							anInt2945 -= 3;
							local182 = anIntArray152[anInt2945];
							local814 = anIntArray152[anInt2945 + 1];
							local104 = anIntArray152[anInt2945 + 2];
							Static564.method8144("", local182 << 16 | local814, local104, 9);
							return;
						}
						if (arg0 == 6716) {
							anInt2945 -= 3;
							local182 = anIntArray152[anInt2945];
							local814 = anIntArray152[anInt2945 + 1];
							local104 = anIntArray152[anInt2945 + 2];
							Static564.method8144("", local182 << 16 | local814, local104, 10);
							return;
						}
						if (arg0 == 6717) {
							anInt2945 -= 3;
							local182 = anIntArray152[anInt2945];
							local814 = anIntArray152[anInt2945 + 1];
							local104 = anIntArray152[anInt2945 + 2];
							@Pc(8767) Class73 local8767 = Static506.method9206(local182 << 16 | local814, local104);
							Static179.method2592();
							@Pc(8772) Class5_Sub45 local8772 = Static81.method1252(local8767);
							Static455.method6703(local8772.anInt8276, local8767, local8772.method7132());
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(8802) Class315 local8802;
						if (arg0 == 6800) {
							local182 = anIntArray152[--anInt2945];
							local8802 = Static2.aClass33_1.method657(local182);
							if (local8802.aString116 == null) {
								aStringArray24[anInt2937++] = "";
								return;
							}
							aStringArray24[anInt2937++] = local8802.aString116;
							return;
						}
						if (arg0 == 6801) {
							local182 = anIntArray152[--anInt2945];
							local8802 = Static2.aClass33_1.method657(local182);
							anIntArray152[anInt2945++] = local8802.anInt8895;
							return;
						}
						if (arg0 == 6802) {
							local182 = anIntArray152[--anInt2945];
							local8802 = Static2.aClass33_1.method657(local182);
							anIntArray152[anInt2945++] = local8802.anInt8903;
							return;
						}
						if (arg0 == 6803) {
							local182 = anIntArray152[--anInt2945];
							local8802 = Static2.aClass33_1.method657(local182);
							anIntArray152[anInt2945++] = local8802.anInt8900;
							return;
						}
						if (arg0 == 6804) {
							anInt2945 -= 2;
							local182 = anIntArray152[anInt2945];
							local814 = anIntArray152[anInt2945 + 1];
							@Pc(8925) Class152 local8925 = Static4.aClass355_1.method8693(local814);
							if (local8925.method2972()) {
								aStringArray24[anInt2937++] = Static2.aClass33_1.method657(local182).method7604(local8925.aString49, local814);
								return;
							}
							anIntArray152[anInt2945++] = Static2.aClass33_1.method657(local182).method7597(local8925.anInt3373, local814);
							return;
						}
					} else if (arg0 < 7000) {
						if (arg0 == 6900) {
							anIntArray152[anInt2945++] = Static31.aBoolean46 && !Static361.aBoolean474 ? 1 : 0;
							return;
						}
						if (arg0 == 6901) {
							anIntArray152[anInt2945++] = (int) (Static379.aLong201 / 60000L);
							anIntArray152[anInt2945++] = (int) ((Static379.aLong201 - Static515.method7499(101) - Static398.aLong211) / 60000L);
							anIntArray152[anInt2945++] = Static578.aBoolean742 ? 1 : 0;
							return;
						}
						if (arg0 == 6902) {
							anIntArray152[anInt2945++] = Static54.anInt843;
							return;
						}
						if (arg0 == 6903) {
							anIntArray152[anInt2945++] = Static78.anInt9555;
							return;
						}
						if (arg0 == 6904) {
							anIntArray152[anInt2945++] = Static504.anInt8676;
							return;
						}
						if (arg0 == 6905) {
							local90 = "";
							if (Static596.aClass366_8 != null) {
								if (Static596.aClass366_8.anObject18 == null) {
									local90 = Static659.method9132(Static596.aClass366_8.anInt10204);
								} else {
									local90 = (String) Static596.aClass366_8.anObject18;
								}
							}
							aStringArray24[anInt2937++] = local90;
							return;
						}
						if (arg0 == 6906) {
							anIntArray152[anInt2945++] = Static160.anInt2501;
							return;
						}
						if (arg0 == 6907) {
							anIntArray152[anInt2945++] = Static106.anInt1729;
							return;
						}
						if (arg0 == 6908) {
							anIntArray152[anInt2945++] = Static584.anInt9791;
							return;
						}
						if (arg0 == 6909) {
							anIntArray152[anInt2945++] = Static581.aBoolean745 ? 1 : 0;
							return;
						}
						if (arg0 == 6910) {
							anIntArray152[anInt2945++] = Static620.anInt10173;
							return;
						}
						if (arg0 == 6911) {
							anIntArray152[anInt2945++] = Static120.anInt1894;
							return;
						}
						if (arg0 == 6912) {
							anIntArray152[anInt2945++] = Static615.anInt10150;
							return;
						}
						if (arg0 == 6913) {
							anIntArray152[anInt2945++] = Static202.anInt3291;
							return;
						}
					} else if (arg0 < 7100) {
						if (arg0 == 7000) {
							local182 = Static59.method842();
							anIntArray152[anInt2945++] = Static599.anInt10035 = Static637.aClass5_Sub20_31.aClass24_Sub10_1.method3153();
							anIntArray152[anInt2945++] = local182;
							Static163.method2205();
							Static52.method792();
							Static261.aBoolean355 = false;
							return;
						}
						if (arg0 == 7001) {
							Static206.method2965();
							Static163.method2205();
							Static52.method792();
							Static261.aBoolean355 = false;
							return;
						}
						if (arg0 == 7002) {
							Static233.method3391();
							Static163.method2205();
							Static52.method792();
							Static261.aBoolean355 = false;
							return;
						}
						if (arg0 == 7003) {
							Static356.method5330();
							Static163.method2205();
							Static52.method792();
							Static261.aBoolean355 = false;
							return;
						}
						if (arg0 == 7004) {
							Static601.method8651();
							Static163.method2205();
							Static52.method792();
							Static261.aBoolean355 = false;
							return;
						}
						if (arg0 == 7005) {
							Static637.aClass5_Sub20_31.method3194(0, Static637.aClass5_Sub20_31.aClass24_Sub2_1);
							Static52.method792();
							Static261.aBoolean355 = false;
							return;
						}
						if (arg0 == 7006) {
							if (Static599.anInt10035 == 2) {
								Static613.aBoolean757 = true;
								return;
							}
							if (Static599.anInt10035 == 1) {
								Static206.aBoolean268 = true;
								return;
							}
							if (Static599.anInt10035 == 3) {
								Static110.aBoolean167 = true;
							}
							return;
						}
						if (arg0 == 7007) {
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub2_1.method489();
							return;
						}
					} else if (arg0 < 7200) {
						if (arg0 == 7100) {
							anInt2945 -= 2;
							local182 = anIntArray152[anInt2945];
							local814 = anIntArray152[anInt2945 + 1];
							if (local182 != -1) {
								if (local814 > 255) {
									local814 = 255;
								} else if (local814 < 0) {
									local814 = 0;
								}
								Static489.method7067(local182, false, local814);
							}
							return;
						}
						if (arg0 == 7101) {
							local182 = anIntArray152[--anInt2945];
							if (local182 != -1) {
								Static441.method6513(local182);
							}
							return;
						}
						if (arg0 == 7102) {
							local182 = anIntArray152[--anInt2945];
							if (local182 != -1) {
								Static388.method5660(local182);
							}
							return;
						}
						if (arg0 == 7103) {
							anIntArray152[anInt2945++] = Static382.method8437("jagtheora") ? 1 : 0;
							return;
						}
					} else if (arg0 < 7300) {
						if (arg0 == 7201) {
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub18_1.method6490() ? 1 : 0;
							return;
						}
						if (arg0 == 7202) {
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub19_1.method6614() ? 1 : 0;
							return;
						}
						if (arg0 == 7203) {
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub4_1.method1673() ? 1 : 0;
							return;
						}
						if (arg0 == 7204) {
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub28_1.method8608() ? 1 : 0;
							return;
						}
						if (arg0 == 7205) {
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub11_2.method3218() && Static457.aClass57_11.method7674() ? 1 : 0;
							return;
						}
						if (arg0 == 7206) {
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub6_1.method2106() ? 1 : 0;
							return;
						}
						if (arg0 == 7207) {
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub26_1.method8060() ? 1 : 0;
							return;
						}
						if (arg0 == 7208) {
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub14_1.method5153() && Static457.aClass57_11.method7706() ? 1 : 0;
							return;
						}
						if (arg0 == 7209) {
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub21_1.method6652() ? 1 : 0;
							return;
						}
						if (arg0 == 7210) {
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub3_1.method1559() ? 1 : 0;
							return;
						}
						if (arg0 == 7211) {
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub27_1.method8303() ? 1 : 0;
							return;
						}
						if (arg0 == 7212) {
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub22_1.method6753() ? 1 : 0;
							return;
						}
						if (arg0 == 7213) {
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub23_1.method7044() ? 1 : 0;
							return;
						}
						if (arg0 == 7214) {
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub10_2.method3150() ? 1 : 0;
							return;
						}
					} else if (arg0 < 7400) {
						if (arg0 == 7301) {
							local182 = anIntArray152[--anInt2945];
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub18_1.method8884(local182);
							return;
						}
						if (arg0 == 7302) {
							local182 = anIntArray152[--anInt2945];
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub19_1.method8884(local182);
							return;
						}
						if (arg0 == 7303) {
							local182 = anIntArray152[--anInt2945];
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub4_1.method8884(local182);
							return;
						}
						if (arg0 == 7304) {
							local182 = anIntArray152[--anInt2945];
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub28_1.method8884(local182);
							return;
						}
						if (arg0 == 7305) {
							local182 = anIntArray152[--anInt2945];
							if (!Static457.aClass57_11.method7674()) {
								anIntArray152[anInt2945++] = 3;
								return;
							}
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub11_2.method8884(local182);
							return;
						}
						if (arg0 == 7306) {
							local182 = anIntArray152[--anInt2945];
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub6_1.method8884(local182);
							return;
						}
						if (arg0 == 7307) {
							local182 = anIntArray152[--anInt2945];
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub26_1.method8884(local182);
							return;
						}
						if (arg0 == 7308) {
							local182 = anIntArray152[--anInt2945];
							if (!Static457.aClass57_11.method7706()) {
								anIntArray152[anInt2945++] = 3;
								return;
							}
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub14_1.method8884(local182);
							return;
						}
						if (arg0 == 7309) {
							local182 = anIntArray152[--anInt2945];
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub21_1.method8884(local182);
							return;
						}
						if (arg0 == 7310) {
							local182 = anIntArray152[--anInt2945];
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub3_1.method8884(local182);
							return;
						}
						if (arg0 == 7311) {
							local182 = anIntArray152[--anInt2945];
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub27_1.method8884(local182);
							return;
						}
						if (arg0 == 7312) {
							local182 = anIntArray152[--anInt2945];
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub22_1.method8884(local182);
							return;
						}
						if (arg0 == 7313) {
							local182 = anIntArray152[--anInt2945];
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub23_1.method8884(local182);
							return;
						}
						if (arg0 == 7314) {
							local182 = anIntArray152[--anInt2945];
							anIntArray152[anInt2945++] = Static637.aClass5_Sub20_31.aClass24_Sub10_2.method8884(local182);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!fja", name = "c", descriptor = "(I)V")
	public static void method2523(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static596.method8616(arg0)) {
			return;
		}
		@Pc(14) Class73[] local14 = Static489.aClass73ArrayArray2[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(21) Class73 local21 = local14[local16];
			if (local21.anObjectArray19 != null) {
				@Pc(28) Class5_Sub3 local28 = new Class5_Sub3();
				local28.aClass73_1 = local21;
				local28.anObjectArray1 = local21.anObjectArray19;
				method2518(local28, 2000000);
			}
		}
	}
}
