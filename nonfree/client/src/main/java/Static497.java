import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!mia;")
	private static Class233 aClass233_1;

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "Lclient!wq;")
	private static Class394 aClass394_7;

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "[I")
	private static int[] anIntArray461;

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "Lclient!wq;")
	private static Class394 aClass394_8;

	@OriginalMember(owner = "client!rd", name = "C", descriptor = "[J")
	private static long[] aLongArray21;

	@OriginalMember(owner = "client!rd", name = "D", descriptor = "Lclient!rg;")
	private static Class305 aClass305_1;

	@OriginalMember(owner = "client!rd", name = "E", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray32;

	@OriginalMember(owner = "client!rd", name = "F", descriptor = "Lclient!ua;")
	private static Class5_Sub49 aClass5_Sub49_3;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
	private static int anInt8477 = 0;

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "[I")
	private static final int[] anIntArray458 = new int[5];

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
	private static int anInt8480 = 0;

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
	private static int anInt8481 = 0;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
	private static int anInt8483 = 0;

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "[I")
	private static final int[] anIntArray459 = new int[3];

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "[[I")
	private static final int[][] anIntArrayArray66 = new int[5][5000];

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "[J")
	private static final long[] aLongArray20 = new long[1000];

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "[I")
	private static final int[] anIntArray460 = new int[1000];

	@OriginalMember(owner = "client!rd", name = "v", descriptor = "Lclient!pa;")
	public static final Class265 aClass265_56 = new Class265(4);

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "[Lclient!vda;")
	private static final Class369[] aClass369Array1 = new Class369[50];

	@OriginalMember(owner = "client!rd", name = "A", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray31 = new String[1000];

	@OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
	private static int anInt8490 = 0;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)Ljava/lang/String;")
	private static String method7201(@OriginalArg(0) int arg0) {
		@Pc(9) String local9 = aClass233_1.method5433(Static591.aClass174_7.anInt4124 << 16 | arg0);
		return local9 == null ? "" : local9;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(C)I")
	private static int method7202(@OriginalArg(0) char arg0) {
		return Static324.method5065(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
	private static void method7203(@OriginalArg(0) int arg0) {
		@Pc(3) Class394 local3 = Static238.method3422(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class394[] local13 = Static69.aClass394ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class394[] local19 = Static227.aClass394ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static69.aClass394ArrayArray1[local9] = new Class394[local22];
			Static685.method8331(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static685.method8331(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!mha;I)V")
	private static void method7204(@OriginalArg(0) Class5_Sub2_Sub12 arg0, @OriginalArg(1) int arg1) {
		anInt8481 = 0;
		anInt8483 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray361;
		@Pc(11) int[] local11 = arg0.anIntArray360;
		@Pc(13) byte local13 = -1;
		anInt8477 = 0;
		@Pc(639) int local639;
		try {
			@Pc(17) int local17 = 0;
			label333: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 150) {
					@Pc(1134) boolean local1134;
					if (local11[local5] == 1) {
						local1134 = true;
					} else {
						local1134 = false;
					}
					if (local31 >= 150 && local31 < 5000) {
						method7207(local31, local1134);
					} else if (local31 >= 5000 && local31 < 10000) {
						method7214(local31, local1134);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray460[anInt8481++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray460[anInt8481++] = Static413.aClass63_1.anIntArray70[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static413.aClass63_1.method1219(local54, anIntArray460[--anInt8481]);
					} else if (local31 == 3) {
						aStringArray31[anInt8483++] = arg0.aStringArray21[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt8481 -= 2;
						if (anIntArray460[anInt8481] != anIntArray460[anInt8481 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt8481 -= 2;
						if (anIntArray460[anInt8481] == anIntArray460[anInt8481 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt8481 -= 2;
						if (anIntArray460[anInt8481] < anIntArray460[anInt8481 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt8481 -= 2;
						if (anIntArray460[anInt8481] > anIntArray460[anInt8481 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt8477 == 0) {
							return;
						}
						@Pc(216) Class369 local216 = aClass369Array1[--anInt8477];
						arg0 = local216.aClass5_Sub2_Sub12_1;
						local8 = arg0.anIntArray361;
						local11 = arg0.anIntArray360;
						local5 = local216.anInt10012;
						anIntArray461 = local216.anIntArray571;
						aStringArray32 = local216.aStringArray40;
						aLongArray21 = local216.aLongArray23;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray460[anInt8481++] = Static413.aClass63_1.method1213(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static413.aClass63_1.method1222(local54, anIntArray460[--anInt8481]);
					} else if (local31 == 31) {
						anInt8481 -= 2;
						if (anIntArray460[anInt8481] <= anIntArray460[anInt8481 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt8481 -= 2;
						if (anIntArray460[anInt8481] >= anIntArray460[anInt8481 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray460[anInt8481++] = anIntArray461[local11[local5]];
					} else if (local31 == 34) {
						anIntArray461[local11[local5]] = anIntArray460[--anInt8481];
					} else if (local31 == 35) {
						aStringArray31[anInt8483++] = aStringArray32[local11[local5]];
					} else if (local31 == 36) {
						aStringArray32[local11[local5]] = aStringArray31[--anInt8483];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt8483 -= local54;
						@Pc(403) String local403 = Static252.method3531(local54, aStringArray31, anInt8483);
						aStringArray31[anInt8483++] = local403;
					} else if (local31 == 38) {
						anInt8481--;
					} else if (local31 == 39) {
						anInt8483--;
					} else if (local31 == 40) {
						local54 = local11[local5];
						@Pc(439) Class5_Sub2_Sub12 local439 = Static584.method7986(local54);
						if (local439 == null) {
							throw new RuntimeException();
						}
						@Pc(449) int[] local449 = new int[local439.anInt6419];
						@Pc(453) String[] local453 = new String[local439.anInt6422];
						@Pc(457) long[] local457 = new long[local439.anInt6420];
						for (@Pc(459) int local459 = 0; local459 < local439.anInt6414; local459++) {
							local449[local459] = anIntArray460[anInt8481 + local459 - local439.anInt6414];
						}
						for (@Pc(478) int local478 = 0; local478 < local439.anInt6418; local478++) {
							local453[local478] = aStringArray31[anInt8483 + local478 - local439.anInt6418];
						}
						for (@Pc(497) int local497 = 0; local497 < local439.anInt6415; local497++) {
							local457[local497] = aLongArray20[anInt8480 + local497 - local439.anInt6415];
						}
						anInt8481 -= local439.anInt6414;
						anInt8483 -= local439.anInt6418;
						anInt8480 -= local439.anInt6415;
						@Pc(533) Class369 local533 = new Class369();
						local533.aClass5_Sub2_Sub12_1 = arg0;
						local533.anInt10012 = local5;
						local533.anIntArray571 = anIntArray461;
						local533.aStringArray40 = aStringArray32;
						local533.aLongArray23 = aLongArray21;
						if (anInt8477 >= aClass369Array1.length) {
							throw new RuntimeException();
						}
						aClass369Array1[anInt8477++] = local533;
						arg0 = local439;
						local8 = local439.anIntArray361;
						local11 = local439.anIntArray360;
						local5 = -1;
						anIntArray461 = local449;
						aStringArray32 = local453;
						aLongArray21 = local457;
					} else if (local31 == 42) {
						anIntArray460[anInt8481++] = Static205.anIntArray184[local11[local5]];
					} else if (local31 == 43) {
						local54 = local11[local5];
						Static205.anIntArray184[local54] = anIntArray460[--anInt8481];
						Static252.method3528(local54);
						Static439.aBoolean565 |= Static155.aBooleanArray3[local54];
					} else if (local31 == 44) {
						local54 = local11[local5] >> 16;
						local639 = local11[local5] & 0xFFFF;
						@Pc(647) int local647 = anIntArray460[--anInt8481];
						if (local647 >= 0 && local647 <= 5000) {
							anIntArray458[local54] = local647;
							@Pc(662) byte local662 = -1;
							if (local639 == 105) {
								local662 = 0;
							}
							@Pc(669) int local669 = 0;
							while (true) {
								if (local669 >= local647) {
									continue label333;
								}
								anIntArrayArray66[local54][local669] = local662;
								local669++;
							}
						}
						throw new RuntimeException();
					} else if (local31 == 45) {
						local54 = local11[local5];
						local639 = anIntArray460[--anInt8481];
						if (local639 < 0 || local639 >= anIntArray458[local54]) {
							throw new RuntimeException();
						}
						anIntArray460[anInt8481++] = anIntArrayArray66[local54][local639];
					} else if (local31 == 46) {
						local54 = local11[local5];
						anInt8481 -= 2;
						local639 = anIntArray460[anInt8481];
						if (local639 < 0 || local639 >= anIntArray458[local54]) {
							throw new RuntimeException();
						}
						anIntArrayArray66[local54][local639] = anIntArray460[anInt8481 + 1];
					} else if (local31 == 47) {
						@Pc(766) String local766 = Static401.aStringArray26[local11[local5]];
						if (local766 == null) {
							local766 = "null";
						}
						aStringArray31[anInt8483++] = local766;
					} else if (local31 == 48) {
						local54 = local11[local5];
						Static401.aStringArray26[local54] = aStringArray31[--anInt8483];
						Static332.method5129(local54);
					} else if (local31 == 51) {
						@Pc(810) Class335 local810 = arg0.aClass335Array1[local11[local5]];
						@Pc(823) Class5_Sub43 local823 = (Class5_Sub43) local810.method7766((long) anIntArray460[--anInt8481]);
						if (local823 != null) {
							local5 += local823.anInt7821;
						}
					} else if (local31 == 54) {
						aLongArray20[anInt8480++] = arg0.aLongArray14[local5];
					} else if (local31 == 55) {
						anInt8480--;
					} else if (local31 == 66) {
						aLongArray20[anInt8480++] = aLongArray21[local11[local5]];
					} else if (local31 == 67) {
						aLongArray21[local11[local5]] = aLongArray20[--anInt8480];
					} else if (local31 == 68) {
						anInt8480 -= 2;
						if (aLongArray20[anInt8480] != aLongArray20[anInt8480 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 69) {
						anInt8480 -= 2;
						if (aLongArray20[anInt8480] == aLongArray20[anInt8480 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 70) {
						anInt8480 -= 2;
						if (aLongArray20[anInt8480] < aLongArray20[anInt8480 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 71) {
						anInt8480 -= 2;
						if (aLongArray20[anInt8480] > aLongArray20[anInt8480 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 72) {
						anInt8480 -= 2;
						if (aLongArray20[anInt8480] <= aLongArray20[anInt8480 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 73) {
						anInt8480 -= 2;
						if (aLongArray20[anInt8480] >= aLongArray20[anInt8480 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 86) {
						if (anIntArray460[--anInt8481] == 1) {
							local5 += local11[local5];
						}
					} else if (local31 == 87) {
						if (anIntArray460[--anInt8481] == 0) {
							local5 += local11[local5];
						}
					} else if (local31 == 112) {
						anIntArray460[anInt8481++] = method7217(local11[local5]);
					} else if (local31 == 113) {
						anIntArray460[anInt8481++] = method7211(local11[local5]);
					} else if (local31 == 114) {
						aLongArray20[anInt8480++] = method7213(local11[local5]);
					} else if (local31 == 115) {
						aStringArray31[anInt8483++] = method7201(local11[local5]);
					}
				}
			}
		} catch (@Pc(1169) Exception local1169) {
			@Pc(1188) StringBuffer local1188;
			if (arg0.aString63 == null) {
				local1188 = new StringBuffer(30);
				local1188.append("CS2: ").append(arg0.aLong329).append(" ");
				for (local639 = anInt8477 - 1; local639 >= 0; local639--) {
					local1188.append("v: ").append(aClass369Array1[local639].aClass5_Sub2_Sub12_1.aLong329).append(" ");
				}
				local1188.append("op: ").append(local13);
				Static17.method268(local1188.toString(), local1169);
			} else {
				Static566.method7772("Clientscript error in: " + arg0.aString63);
				local1188 = new StringBuffer(30);
				local1188.append("Clientscript error in: ").append(arg0.aString63).append("\n");
				for (local639 = anInt8477 - 1; local639 >= 0; local639--) {
					local1188.append("via: ").append(aClass369Array1[local639].aClass5_Sub2_Sub12_1.aString63).append("\n");
				}
				local1188.append("Op: ").append(local13).append("\n");
				@Pc(1228) String local1228 = local1169.getMessage();
				if (local1228 != null && local1228.length() > 0) {
					local1188.append("Message: ").append(local1228).append("\n");
				}
				Static17.method268(local1188.toString(), local1169);
				Static611.method8213(local1188.toString());
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!hw;)V")
	public static void method7205(@OriginalArg(0) Class5_Sub28 arg0) {
		method7210(arg0, 200000);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)V")
	private static void method7207(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class394 local137;
		@Pc(19) int local19;
		@Pc(56) int local56;
		@Pc(25) int local25;
		@Pc(35) Class394 local35;
		@Pc(158) Class394 local158;
		@Pc(210) Class394 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 150) {
				anInt8481 -= 3;
				local13 = anIntArray460[anInt8481];
				local19 = anIntArray460[anInt8481 + 1];
				local25 = anIntArray460[anInt8481 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static238.method3422(local13);
				if (local35.aClass394Array2 == null) {
					local35.aClass394Array2 = new Class394[local25 + 1];
				}
				if (local35.aClass394Array2.length <= local25) {
					@Pc(54) Class394[] local54 = new Class394[local25 + 1];
					for (local56 = 0; local56 < local35.aClass394Array2.length; local56++) {
						local54[local56] = local35.aClass394Array2[local56];
					}
					local35.aClass394Array2 = local54;
				}
				if (local25 > 0 && local35.aClass394Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class394 local99 = new Class394();
				local99.anInt10479 = local19;
				local99.anInt10530 = local99.anInt10490 = local35.anInt10490;
				local99.anInt10502 = local25;
				local35.aClass394Array2[local25] = local99;
				if (arg1) {
					aClass394_7 = local99;
				} else {
					aClass394_8 = local99;
				}
				Static609.method8190(local35);
				return;
			}
			if (arg0 == 151) {
				local137 = arg1 ? aClass394_7 : aClass394_8;
				if (local137.anInt10502 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static238.method3422(local137.anInt10490);
				local158.aClass394Array2[local137.anInt10502] = null;
				Static609.method8190(local158);
				return;
			}
			if (arg0 == 152) {
				local137 = Static238.method3422(anIntArray460[--anInt8481]);
				local137.aClass394Array2 = null;
				Static609.method8190(local137);
				return;
			}
			if (arg0 == 200) {
				anInt8481 -= 2;
				local13 = anIntArray460[anInt8481];
				local19 = anIntArray460[anInt8481 + 1];
				local210 = Static622.method7590(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray460[anInt8481++] = 1;
					if (arg1) {
						aClass394_7 = local210;
						return;
					}
					aClass394_8 = local210;
					return;
				}
				anIntArray460[anInt8481++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray460[--anInt8481];
				local158 = Static238.method3422(local13);
				if (local158 != null) {
					anIntArray460[anInt8481++] = 1;
					if (arg1) {
						aClass394_7 = local158;
						return;
					}
					aClass394_8 = local158;
					return;
				}
				anIntArray460[anInt8481++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray460[--anInt8481];
				method7203(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray460[--anInt8481];
				method7216(local13);
				return;
			}
		} else {
			@Pc(357) int local357;
			@Pc(420) boolean local420;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt8481 -= 2;
					local13 = anIntArray460[anInt8481];
					local19 = anIntArray460[anInt8481 + 1];
					if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass239_1 == null) {
						return;
					}
					for (local25 = 0; local25 < Static196.anIntArray176.length; local25++) {
						if (Static196.anIntArray176[local25] == local13) {
							Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass239_1.method5584(Static670.aClass83_2, local19, local25);
							return;
						}
					}
					for (local357 = 0; local357 < Static47.anIntArray52.length; local357++) {
						if (Static47.anIntArray52[local357] == local13) {
							Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass239_1.method5584(Static670.aClass83_2, local19, local357);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt8481 -= 2;
					local13 = anIntArray460[anInt8481];
					local19 = anIntArray460[anInt8481 + 1];
					if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass239_1 == null) {
						return;
					}
					Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass239_1.method5588(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local420 = anIntArray460[--anInt8481] != 0;
					if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass239_1 == null) {
						return;
					}
					Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass239_1.method5585(local420);
					return;
				}
				if (arg0 == 411) {
					anInt8481 -= 2;
					local13 = anIntArray460[anInt8481];
					local19 = anIntArray460[anInt8481 + 1];
					if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass239_1 == null) {
						return;
					}
					Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass239_1.method5587(local19, local13, Static259.aClass135_1);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static238.method3422(anIntArray460[--anInt8481]);
				} else {
					local137 = arg1 ? aClass394_7 : aClass394_8;
				}
				if (arg0 == 1000) {
					anInt8481 -= 4;
					local137.anInt10495 = anIntArray460[anInt8481];
					local137.anInt10491 = anIntArray460[anInt8481 + 1];
					local19 = anIntArray460[anInt8481 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray460[anInt8481 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte151 = (byte) local19;
					local137.aByte153 = (byte) local25;
					Static609.method8190(local137);
					Static353.method5242(local137);
					if (local137.anInt10502 == -1) {
						Static482.method7054(local137.anInt10490);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt8481 -= 4;
					local137.anInt10463 = anIntArray460[anInt8481];
					local137.anInt10443 = anIntArray460[anInt8481 + 1];
					local137.anInt10451 = 0;
					local137.anInt10508 = 0;
					local19 = anIntArray460[anInt8481 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray460[anInt8481 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte154 = (byte) local19;
					local137.aByte152 = (byte) local25;
					Static609.method8190(local137);
					Static353.method5242(local137);
					if (local137.anInt10479 == 0) {
						Static547.method7542(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(661) boolean local661 = anIntArray460[--anInt8481] == 1;
					if (local137.aBoolean780 != local661) {
						local137.aBoolean780 = local661;
						Static609.method8190(local137);
					}
					if (local137.anInt10502 == -1) {
						Static206.method2872(local137.anInt10490);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt8481 -= 2;
					local137.anInt10454 = anIntArray460[anInt8481];
					local137.anInt10472 = anIntArray460[anInt8481 + 1];
					Static609.method8190(local137);
					Static353.method5242(local137);
					if (local137.anInt10479 == 0) {
						Static547.method7542(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean786 = anIntArray460[--anInt8481] == 1;
					return;
				}
			} else {
				@Pc(1523) String local1523;
				@Pc(1161) String local1161;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static238.method3422(anIntArray460[--anInt8481]);
					} else {
						local137 = arg1 ? aClass394_7 : aClass394_8;
					}
					if (arg0 == 1100) {
						anInt8481 -= 2;
						local137.anInt10506 = anIntArray460[anInt8481];
						if (local137.anInt10506 > local137.anInt10512 - local137.anInt10536) {
							local137.anInt10506 = local137.anInt10512 - local137.anInt10536;
						}
						if (local137.anInt10506 < 0) {
							local137.anInt10506 = 0;
						}
						local137.anInt10448 = anIntArray460[anInt8481 + 1];
						if (local137.anInt10448 > local137.anInt10470 - local137.anInt10532) {
							local137.anInt10448 = local137.anInt10470 - local137.anInt10532;
						}
						if (local137.anInt10448 < 0) {
							local137.anInt10448 = 0;
						}
						Static609.method8190(local137);
						if (local137.anInt10502 == -1) {
							Static499.method7237(local137.anInt10490);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt10483 = anIntArray460[--anInt8481];
						Static609.method8190(local137);
						if (local137.anInt10502 == -1) {
							Static130.method2015(local137.anInt10490);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean771 = anIntArray460[--anInt8481] == 1;
						Static609.method8190(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt10467 = anIntArray460[--anInt8481];
						Static609.method8190(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt10533 = anIntArray460[--anInt8481];
						Static609.method8190(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray460[--anInt8481];
						if (local137.anInt10517 != local19) {
							local137.anInt10517 = local19;
							Static609.method8190(local137);
						}
						if (local137.anInt10502 == -1) {
							Static451.method6694(local137.anInt10490);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt10525 = anIntArray460[--anInt8481];
						Static609.method8190(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean772 = anIntArray460[--anInt8481] == 1;
						Static609.method8190(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt10482 = 1;
						local137.anInt10528 = anIntArray460[--anInt8481];
						Static609.method8190(local137);
						if (local137.anInt10502 == -1) {
							Static130.method2014(local137.anInt10490);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt8481 -= 6;
						local137.anInt10474 = anIntArray460[anInt8481];
						local137.anInt10473 = anIntArray460[anInt8481 + 1];
						local137.anInt10493 = anIntArray460[anInt8481 + 2];
						local137.anInt10455 = anIntArray460[anInt8481 + 3];
						local137.anInt10513 = anIntArray460[anInt8481 + 4];
						local137.anInt10515 = anIntArray460[anInt8481 + 5];
						Static609.method8190(local137);
						if (local137.anInt10502 == -1) {
							Static129.method8396(local137.anInt10490);
							Static445.method6622(local137.anInt10490);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray460[--anInt8481];
						if (local137.anInt10499 != local19) {
							local137.anInt10499 = local19;
							local137.anInt10447 = 0;
							local137.anInt10535 = 1;
							local137.anInt10534 = 0;
							@Pc(1110) Class65 local1110 = local137.anInt10499 == -1 ? null : Static459.aClass128_2.method2686(local137.anInt10499);
							if (local1110 != null) {
								Static375.method5527(local1110, local137.anInt10447);
							}
							Static609.method8190(local137);
						}
						if (local137.anInt10502 == -1) {
							Static102.method1692(local137.anInt10490);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean774 = anIntArray460[--anInt8481] == 1;
						Static609.method8190(local137);
						return;
					}
					if (arg0 == 1112) {
						local1161 = aStringArray31[--anInt8483];
						if (!local1161.equals(local137.aString118)) {
							local137.aString118 = local1161;
							Static609.method8190(local137);
						}
						if (local137.anInt10502 == -1) {
							Static13.method199(local137.anInt10490);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt10527 = anIntArray460[--anInt8481];
						Static609.method8190(local137);
						if (local137.anInt10502 == -1) {
							Static543.method7516(local137.anInt10490);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt8481 -= 3;
						local137.anInt10496 = anIntArray460[anInt8481];
						local137.anInt10518 = anIntArray460[anInt8481 + 1];
						local137.anInt10505 = anIntArray460[anInt8481 + 2];
						Static609.method8190(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean779 = anIntArray460[--anInt8481] == 1;
						Static609.method8190(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt10445 = anIntArray460[--anInt8481];
						Static609.method8190(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt10452 = anIntArray460[--anInt8481];
						Static609.method8190(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean770 = anIntArray460[--anInt8481] == 1;
						Static609.method8190(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean781 = anIntArray460[--anInt8481] == 1;
						Static609.method8190(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt8481 -= 2;
						local137.anInt10512 = anIntArray460[anInt8481];
						local137.anInt10470 = anIntArray460[anInt8481 + 1];
						Static609.method8190(local137);
						if (local137.anInt10479 == 0) {
							Static547.method7542(false, local137);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean775 = anIntArray460[--anInt8481] == 1;
						Static609.method8190(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt10515 = anIntArray460[--anInt8481];
						Static609.method8190(local137);
						if (local137.anInt10502 == -1) {
							Static129.method8396(local137.anInt10490);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray460[--anInt8481];
						local137.aBoolean776 = local19 == 1;
						Static609.method8190(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt8481 -= 2;
						local137.anInt10457 = anIntArray460[anInt8481];
						local137.anInt10468 = anIntArray460[anInt8481 + 1];
						Static609.method8190(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt10481 = anIntArray460[--anInt8481];
						Static609.method8190(local137);
						return;
					}
					@Pc(1489) Class53 local1489;
					if (arg0 == 1127) {
						anInt8481 -= 2;
						local19 = anIntArray460[anInt8481];
						local25 = anIntArray460[anInt8481 + 1];
						local1489 = Static522.aClass282_2.method6901(local19);
						if (local25 != local1489.anInt1028) {
							local137.method8737(local19, local25);
							return;
						}
						local137.method8725(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray460[--anInt8481];
						local1523 = aStringArray31[--anInt8483];
						local1489 = Static522.aClass282_2.method6901(local19);
						if (!local1489.aString9.equals(local1523)) {
							local137.method8726(local19, local1523);
							return;
						}
						local137.method8725(local19);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local19 = anIntArray460[--anInt8481];
						if ((local137.anInt10479 == 5 || arg0 != 1129) && (local137.anInt10479 == 4 || arg0 != 1130)) {
							if (local137.anInt10492 != local19) {
								local137.anInt10492 = local19;
								Static609.method8190(local137);
							}
							if (local137.anInt10502 == -1) {
								Static172.method2554(local137.anInt10490);
							}
							return;
						}
						return;
					}
					@Pc(1610) short local1610;
					@Pc(1617) short local1617;
					if (arg0 == 1131) {
						anInt8481 -= 3;
						local19 = anIntArray460[anInt8481];
						local1610 = (short) anIntArray460[anInt8481 + 1];
						local1617 = (short) anIntArray460[anInt8481 + 2];
						if (local19 >= 0 && local19 < 5) {
							local137.method8730(local1610, local1617, local19);
							Static609.method8190(local137);
							if (local137.anInt10502 == -1) {
								Static337.method5162(local19, local137.anInt10490);
							}
							return;
						}
						return;
					}
					if (arg0 == 1132) {
						anInt8481 -= 3;
						local19 = anIntArray460[anInt8481];
						local1610 = (short) anIntArray460[anInt8481 + 1];
						local1617 = (short) anIntArray460[anInt8481 + 2];
						if (local19 >= 0 && local19 < 5) {
							local137.method8723(local1610, local1617, local19);
							Static609.method8190(local137);
							if (local137.anInt10502 == -1) {
								Static242.method8207(local19, local137.anInt10490);
							}
							return;
						}
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2473) int local2473;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static238.method3422(anIntArray460[--anInt8481]);
							} else {
								local137 = arg1 ? aClass394_7 : aClass394_8;
							}
							if (arg0 == 1499) {
								local137.method8722();
								return;
							}
							local1161 = aStringArray31[--anInt8483];
							@Pc(2559) int[] local2559 = null;
							if (local1161.length() > 0 && local1161.charAt(local1161.length() - 1) == 'Y') {
								local357 = anIntArray460[--anInt8481];
								if (local357 > 0) {
									local2559 = new int[local357];
									while (local357-- > 0) {
										local2559[local357] = anIntArray460[--anInt8481];
									}
								}
								local1161 = local1161.substring(0, local1161.length() - 1);
							}
							@Pc(2611) Object[] local2611 = new Object[local1161.length() + 1];
							for (local2473 = local2611.length - 1; local2473 >= 1; local2473--) {
								if (local1161.charAt(local2473 - 1) == 's') {
									local2611[local2473] = aStringArray31[--anInt8483];
								} else if (local1161.charAt(local2473 - 1) == '§') {
									local2611[local2473] = Long.valueOf(aLongArray20[--anInt8480]);
								} else {
									local2611[local2473] = Integer.valueOf(anIntArray460[--anInt8481]);
								}
							}
							local56 = anIntArray460[--anInt8481];
							if (local56 == -1) {
								local2611 = null;
							} else {
								local2611[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray6 = local2611;
							} else if (arg0 == 1401) {
								local137.anObjectArray4 = local2611;
							} else if (arg0 == 1402) {
								local137.lb = local2611;
							} else if (arg0 == 1403) {
								local137.anObjectArray21 = local2611;
							} else if (arg0 == 1404) {
								local137.anObjectArray9 = local2611;
							} else if (arg0 == 1405) {
								local137.anObjectArray24 = local2611;
							} else if (arg0 == 1406) {
								local137.anObjectArray29 = local2611;
							} else if (arg0 == 1407) {
								local137.anObjectArray19 = local2611;
								local137.anIntArray606 = local2559;
							} else if (arg0 == 1408) {
								local137.anObjectArray22 = local2611;
							} else if (arg0 == 1409) {
								local137.anObjectArray5 = local2611;
							} else if (arg0 == 1410) {
								local137.anObjectArray17 = local2611;
							} else if (arg0 == 1411) {
								local137.anObjectArray8 = local2611;
							} else if (arg0 == 1412) {
								local137.anObjectArray16 = local2611;
							} else if (arg0 == 1414) {
								local137.anObjectArray27 = local2611;
								local137.anIntArray607 = local2559;
							} else if (arg0 == 1415) {
								local137.anObjectArray25 = local2611;
								local137.anIntArray611 = local2559;
							} else if (arg0 == 1416) {
								local137.anObjectArray30 = local2611;
							} else if (arg0 == 1417) {
								local137.anObjectArray7 = local2611;
							} else if (arg0 == 1418) {
								local137.anObjectArray3 = local2611;
							} else if (arg0 == 1419) {
								local137.anObjectArray26 = local2611;
							} else if (arg0 == 1420) {
								local137.anObjectArray23 = local2611;
							} else if (arg0 == 1421) {
								local137.anObjectArray15 = local2611;
							} else if (arg0 == 1422) {
								local137.anObjectArray11 = local2611;
							} else if (arg0 == 1423) {
								local137.anObjectArray10 = local2611;
							} else if (arg0 == 1424) {
								local137.anObjectArray33 = local2611;
							} else if (arg0 == 1425) {
								local137.anObjectArray28 = local2611;
							} else if (arg0 == 1426) {
								local137.anObjectArray34 = local2611;
							} else if (arg0 == 1427) {
								local137.anObjectArray20 = local2611;
							} else if (arg0 == 1428) {
								local137.anObjectArray32 = local2611;
								local137.anIntArray609 = local2559;
							} else if (arg0 == 1429) {
								local137.anObjectArray31 = local2611;
								local137.anIntArray605 = local2559;
							} else if (arg0 == 1430) {
								local137.anObjectArray14 = local2611;
							} else if (arg0 == 1431) {
								local137.anObjectArray13 = local2611;
							} else if (arg0 == 1432) {
								local137.anObjectArray18 = local2611;
							}
							local137.aBoolean777 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass394_7 : aClass394_8;
							if (arg0 == 1500) {
								anIntArray460[anInt8481++] = local137.anInt10494;
								return;
							}
							if (arg0 == 1501) {
								anIntArray460[anInt8481++] = local137.anInt10486;
								return;
							}
							if (arg0 == 1502) {
								anIntArray460[anInt8481++] = local137.anInt10536;
								return;
							}
							if (arg0 == 1503) {
								anIntArray460[anInt8481++] = local137.anInt10532;
								return;
							}
							if (arg0 == 1504) {
								anIntArray460[anInt8481++] = local137.aBoolean780 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray460[anInt8481++] = local137.anInt10530;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static351.method5230(local137);
								anIntArray460[anInt8481++] = local158 == null ? -1 : local158.anInt10490;
								return;
							}
						} else {
							@Pc(3242) Class53 local3242;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass394_7 : aClass394_8;
								if (arg0 == 1600) {
									anIntArray460[anInt8481++] = local137.anInt10506;
									return;
								}
								if (arg0 == 1601) {
									anIntArray460[anInt8481++] = local137.anInt10448;
									return;
								}
								if (arg0 == 1602) {
									aStringArray31[anInt8483++] = local137.aString118;
									return;
								}
								if (arg0 == 1603) {
									anIntArray460[anInt8481++] = local137.anInt10512;
									return;
								}
								if (arg0 == 1604) {
									anIntArray460[anInt8481++] = local137.anInt10470;
									return;
								}
								if (arg0 == 1605) {
									anIntArray460[anInt8481++] = local137.anInt10515;
									return;
								}
								if (arg0 == 1606) {
									anIntArray460[anInt8481++] = local137.anInt10493;
									return;
								}
								if (arg0 == 1607) {
									anIntArray460[anInt8481++] = local137.anInt10513;
									return;
								}
								if (arg0 == 1608) {
									anIntArray460[anInt8481++] = local137.anInt10455;
									return;
								}
								if (arg0 == 1609) {
									anIntArray460[anInt8481++] = local137.anInt10467;
									return;
								}
								if (arg0 == 1610) {
									anIntArray460[anInt8481++] = local137.anInt10474;
									return;
								}
								if (arg0 == 1611) {
									anIntArray460[anInt8481++] = local137.anInt10473;
									return;
								}
								if (arg0 == 1612) {
									anIntArray460[anInt8481++] = local137.anInt10517;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray460[--anInt8481];
									local3242 = Static522.aClass282_2.method6901(local19);
									if (local3242.method956()) {
										aStringArray31[anInt8483++] = local137.method8740(local3242.aString9, local19);
										return;
									}
									anIntArray460[anInt8481++] = local137.method8724(local3242.anInt1028, local19);
									return;
								}
								if (arg0 == 1614) {
									anIntArray460[anInt8481++] = local137.anInt10525;
									return;
								}
								if (arg0 == 2614) {
									anIntArray460[anInt8481++] = local137.anInt10482 == 1 ? local137.anInt10528 : -1;
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass394_7 : aClass394_8;
								if (arg0 == 1700) {
									anIntArray460[anInt8481++] = local137.anInt10469;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt10469 != -1) {
										anIntArray460[anInt8481++] = local137.anInt10522;
										return;
									}
									anIntArray460[anInt8481++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray460[anInt8481++] = local137.anInt10502;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass394_7 : aClass394_8;
								if (arg0 == 1800) {
									anIntArray460[anInt8481++] = Static81.method1268(local137).method6629();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray460[--anInt8481];
									local19--;
									if (local137.aStringArray43 != null && local19 < local137.aStringArray43.length && local137.aStringArray43[local19] != null) {
										aStringArray31[anInt8483++] = local137.aStringArray43[local19];
										return;
									}
									aStringArray31[anInt8483++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString116 == null) {
										aStringArray31[anInt8483++] = "";
										return;
									}
									aStringArray31[anInt8483++] = local137.aString116;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static238.method3422(anIntArray460[--anInt8481]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass394_7 : aClass394_8;
								}
								if (anInt8490 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray20 == null) {
										return;
									}
									@Pc(3511) Class5_Sub28 local3511 = new Class5_Sub28();
									local3511.aClass394_2 = local137;
									local3511.anObjectArray2 = local137.anObjectArray20;
									local3511.anInt3838 = anInt8490 + 1;
									Static259.aClass124_40.method2574(local3511);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static238.method3422(anIntArray460[--anInt8481]);
								if (arg0 == 2500) {
									anIntArray460[anInt8481++] = local137.anInt10494;
									return;
								}
								if (arg0 == 2501) {
									anIntArray460[anInt8481++] = local137.anInt10486;
									return;
								}
								if (arg0 == 2502) {
									anIntArray460[anInt8481++] = local137.anInt10536;
									return;
								}
								if (arg0 == 2503) {
									anIntArray460[anInt8481++] = local137.anInt10532;
									return;
								}
								if (arg0 == 2504) {
									anIntArray460[anInt8481++] = local137.aBoolean780 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray460[anInt8481++] = local137.anInt10530;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static351.method5230(local137);
									anIntArray460[anInt8481++] = local158 == null ? -1 : local158.anInt10490;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static238.method3422(anIntArray460[--anInt8481]);
								if (arg0 == 2600) {
									anIntArray460[anInt8481++] = local137.anInt10506;
									return;
								}
								if (arg0 == 2601) {
									anIntArray460[anInt8481++] = local137.anInt10448;
									return;
								}
								if (arg0 == 2602) {
									aStringArray31[anInt8483++] = local137.aString118;
									return;
								}
								if (arg0 == 2603) {
									anIntArray460[anInt8481++] = local137.anInt10512;
									return;
								}
								if (arg0 == 2604) {
									anIntArray460[anInt8481++] = local137.anInt10470;
									return;
								}
								if (arg0 == 2605) {
									anIntArray460[anInt8481++] = local137.anInt10515;
									return;
								}
								if (arg0 == 2606) {
									anIntArray460[anInt8481++] = local137.anInt10493;
									return;
								}
								if (arg0 == 2607) {
									anIntArray460[anInt8481++] = local137.anInt10513;
									return;
								}
								if (arg0 == 2608) {
									anIntArray460[anInt8481++] = local137.anInt10455;
									return;
								}
								if (arg0 == 2609) {
									anIntArray460[anInt8481++] = local137.anInt10467;
									return;
								}
								if (arg0 == 2610) {
									anIntArray460[anInt8481++] = local137.anInt10474;
									return;
								}
								if (arg0 == 2611) {
									anIntArray460[anInt8481++] = local137.anInt10473;
									return;
								}
								if (arg0 == 2612) {
									anIntArray460[anInt8481++] = local137.anInt10517;
									return;
								}
								if (arg0 == 2613) {
									anIntArray460[anInt8481++] = local137.anInt10525;
									return;
								}
								if (arg0 == 2614) {
									anIntArray460[anInt8481++] = local137.anInt10482 == 1 ? local137.anInt10528 : -1;
									return;
								}
							} else {
								@Pc(4040) Class5_Sub4 local4040;
								@Pc(3938) Class5_Sub4 local3938;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static238.method3422(anIntArray460[--anInt8481]);
										anIntArray460[anInt8481++] = local137.anInt10469;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static238.method3422(anIntArray460[--anInt8481]);
										if (local137.anInt10469 != -1) {
											anIntArray460[anInt8481++] = local137.anInt10522;
											return;
										}
										anIntArray460[anInt8481++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray460[--anInt8481];
										local3938 = (Class5_Sub4) Static131.aClass335_15.method7766((long) local13);
										if (local3938 != null) {
											anIntArray460[anInt8481++] = 1;
											return;
										}
										anIntArray460[anInt8481++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static238.method3422(anIntArray460[--anInt8481]);
										if (local137.aClass394Array2 == null) {
											anIntArray460[anInt8481++] = 0;
											return;
										}
										local19 = local137.aClass394Array2.length;
										for (local25 = 0; local25 < local137.aClass394Array2.length; local25++) {
											if (local137.aClass394Array2[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray460[anInt8481++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt8481 -= 2;
										local13 = anIntArray460[anInt8481];
										local19 = anIntArray460[anInt8481 + 1];
										local4040 = (Class5_Sub4) Static131.aClass335_15.method7766((long) local13);
										if (local4040 != null && local4040.anInt257 == local19) {
											anIntArray460[anInt8481++] = 1;
											return;
										}
										anIntArray460[anInt8481++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static238.method3422(anIntArray460[--anInt8481]);
									if (arg0 == 2800) {
										anIntArray460[anInt8481++] = Static81.method1268(local137).method6629();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray460[--anInt8481];
										local19--;
										if (local137.aStringArray43 != null && local19 < local137.aStringArray43.length && local137.aStringArray43[local19] != null) {
											aStringArray31[anInt8483++] = local137.aStringArray43[local19];
											return;
										}
										aStringArray31[anInt8483++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString116 == null) {
											aStringArray31[anInt8483++] = "";
											return;
										}
										aStringArray31[anInt8483++] = local137.aString116;
										return;
									}
								} else {
									@Pc(4266) Class5_Sub16 local4266;
									@Pc(4177) String local4177;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local4177 = aStringArray31[--anInt8483];
											Static57.method858(local4177);
											return;
										}
										if (arg0 == 3101) {
											anInt8481 -= 2;
											Static249.method3524(Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1, anIntArray460[anInt8481 + 1], anIntArray460[anInt8481]);
											return;
										}
										if (arg0 == 3103) {
											Static188.method2730();
											return;
										}
										if (arg0 == 3104) {
											local4177 = aStringArray31[--anInt8483];
											local19 = 0;
											if (Static648.method8534(local4177)) {
												local19 = Static171.method2534(local4177);
											}
											@Pc(4237) Class5_Sub16 local4237 = Static455.method6717(Static545.aClass187_84, Static16.aClass332_8);
											local4237.aClass5_Sub15_Sub2_1.method3679(local19);
											Static479.method7038(local4237);
											return;
										}
										if (arg0 == 3105) {
											local4177 = aStringArray31[--anInt8483];
											local4266 = Static455.method6717(Static290.aClass187_98, Static16.aClass332_8);
											local4266.aClass5_Sub15_Sub2_1.method3651(local4177.length() + 1);
											local4266.aClass5_Sub15_Sub2_1.method3680(local4177);
											Static479.method7038(local4266);
											return;
										}
										if (arg0 == 3106) {
											local4177 = aStringArray31[--anInt8483];
											local4266 = Static455.method6717(Static214.aClass187_45, Static16.aClass332_8);
											local4266.aClass5_Sub15_Sub2_1.method3651(local4177.length() + 1);
											local4266.aClass5_Sub15_Sub2_1.method3680(local4177);
											Static479.method7038(local4266);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray460[--anInt8481];
											local1161 = aStringArray31[--anInt8483];
											Static562.method7686(local13, local1161);
											return;
										}
										if (arg0 == 3108) {
											anInt8481 -= 3;
											local13 = anIntArray460[anInt8481];
											local19 = anIntArray460[anInt8481 + 1];
											local25 = anIntArray460[anInt8481 + 2];
											local35 = Static238.method3422(local25);
											Static468.method6908(local13, local35, local19);
											return;
										}
										if (arg0 == 3109) {
											anInt8481 -= 2;
											local13 = anIntArray460[anInt8481];
											local19 = anIntArray460[anInt8481 + 1];
											local210 = arg1 ? aClass394_7 : aClass394_8;
											Static468.method6908(local13, local210, local19);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray460[--anInt8481];
											local4266 = Static455.method6717(Static546.aClass187_85, Static16.aClass332_8);
											local4266.aClass5_Sub15_Sub2_1.method3660(local13);
											Static479.method7038(local4266);
											return;
										}
										if (arg0 == 3111) {
											anInt8481 -= 2;
											local13 = anIntArray460[anInt8481];
											local19 = anIntArray460[anInt8481 + 1];
											local4040 = (Class5_Sub4) Static131.aClass335_15.method7766((long) local13);
											if (local4040 != null) {
												Static272.method3801(local4040, true, local4040.anInt257 != local19);
											}
											Static30.method397(local19, local13, 3, true);
											return;
										}
										if (arg0 == 3112) {
											anInt8481--;
											local13 = anIntArray460[anInt8481];
											local3938 = (Class5_Sub4) Static131.aClass335_15.method7766((long) local13);
											if (local3938 != null && local3938.anInt259 == 3) {
												Static272.method3801(local3938, true, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static162.method6704(aStringArray31[--anInt8483]);
											return;
										}
										if (arg0 == 3114) {
											anInt8481 -= 2;
											local13 = anIntArray460[anInt8481];
											local19 = anIntArray460[anInt8481 + 1];
											local1523 = aStringArray31[--anInt8483];
											Static423.method6423(local13, local19, local1523, "", "", "");
											return;
										}
										if (arg0 == 3115) {
											anInt8481 -= 11;
											@Pc(4567) Class112[] local4567 = Static17.method265();
											@Pc(4570) Class4[] local4570 = Static49.method727();
											Static516.method3868(anIntArray460[anInt8481 + 3], local4570[anIntArray460[anInt8481 + 1]], anIntArray460[anInt8481 + 7], local4567[anIntArray460[anInt8481]], anIntArray460[anInt8481 + 4], anIntArray460[anInt8481 + 8], anIntArray460[anInt8481 + 6], anIntArray460[anInt8481 + 2], anIntArray460[anInt8481 + 9], anIntArray460[anInt8481 + 10], anIntArray460[anInt8481 + 5]);
											return;
										}
										if (arg0 == 3116) {
											local13 = anIntArray460[--anInt8481];
											local4266 = Static455.method6717(Static507.aClass187_79, Static16.aClass332_8);
											local4266.aClass5_Sub15_Sub2_1.method3660(local13);
											Static479.method7038(local4266);
											return;
										}
										if (arg0 == 3117) {
											local4177 = aStringArray31[--anInt8483];
											local4266 = Static455.method6717(Static394.aClass187_64, Static16.aClass332_8);
											local4266.aClass5_Sub15_Sub2_1.method3651(local4177.length() + 1);
											local4266.aClass5_Sub15_Sub2_1.method3680(local4177);
											Static479.method7038(local4266);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt8481 -= 3;
											Static85.method1307(anIntArray460[anInt8481], anIntArray460[anInt8481 + 2], anIntArray460[anInt8481 + 1], 256, 255);
											return;
										}
										if (arg0 == 3201) {
											Static107.method1769(255, 50, anIntArray460[--anInt8481]);
											return;
										}
										if (arg0 == 3202) {
											anInt8481 -= 2;
											Static192.method2760(anIntArray460[anInt8481 + 1], anIntArray460[anInt8481], 255);
											return;
										}
										if (arg0 == 3203) {
											anInt8481 -= 4;
											Static85.method1307(anIntArray460[anInt8481], anIntArray460[anInt8481 + 2], anIntArray460[anInt8481 + 1], 256, anIntArray460[anInt8481 + 3]);
											return;
										}
										if (arg0 == 3204) {
											anInt8481 -= 3;
											Static107.method1769(anIntArray460[anInt8481 + 1], anIntArray460[anInt8481 + 2], anIntArray460[anInt8481]);
											return;
										}
										if (arg0 == 3205) {
											anInt8481 -= 3;
											Static192.method2760(anIntArray460[anInt8481 + 1], anIntArray460[anInt8481], anIntArray460[anInt8481 + 2]);
											return;
										}
										if (arg0 == 3206) {
											anInt8481 -= 4;
											Static99.method1646(256, anIntArray460[anInt8481 + 2], anIntArray460[anInt8481], false, anIntArray460[anInt8481 + 1], anIntArray460[anInt8481 + 3]);
											return;
										}
										if (arg0 == 3207) {
											anInt8481 -= 4;
											Static99.method1646(256, anIntArray460[anInt8481 + 2], anIntArray460[anInt8481], true, anIntArray460[anInt8481 + 1], anIntArray460[anInt8481 + 3]);
											return;
										}
										if (arg0 == 3208) {
											anInt8481 -= 5;
											Static85.method1307(anIntArray460[anInt8481], anIntArray460[anInt8481 + 2], anIntArray460[anInt8481 + 1], anIntArray460[anInt8481 + 4], anIntArray460[anInt8481 + 3]);
											return;
										}
										if (arg0 == 3209) {
											anInt8481 -= 5;
											Static99.method1646(anIntArray460[anInt8481 + 4], anIntArray460[anInt8481 + 2], anIntArray460[anInt8481], false, anIntArray460[anInt8481 + 1], anIntArray460[anInt8481 + 3]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray460[anInt8481++] = Static421.anInt7434;
											return;
										}
										if (arg0 == 3301) {
											anInt8481 -= 2;
											local13 = anIntArray460[anInt8481];
											local19 = anIntArray460[anInt8481 + 1];
											anIntArray460[anInt8481++] = Static219.method3106(false, local19, local13);
											return;
										}
										if (arg0 == 3302) {
											anInt8481 -= 2;
											local13 = anIntArray460[anInt8481];
											local19 = anIntArray460[anInt8481 + 1];
											anIntArray460[anInt8481++] = Static562.method7687(local19, false, local13);
											return;
										}
										if (arg0 == 3303) {
											anInt8481 -= 2;
											local13 = anIntArray460[anInt8481];
											local19 = anIntArray460[anInt8481 + 1];
											anIntArray460[anInt8481++] = Static129.method8399(local19, local13, false);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray460[--anInt8481];
											anIntArray460[anInt8481++] = Static347.aClass268_1.method6614(local13).anInt6224;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray460[--anInt8481];
											anIntArray460[anInt8481++] = Static399.anIntArray387[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray460[--anInt8481];
											anIntArray460[anInt8481++] = Static609.anIntArray563[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray460[--anInt8481];
											anIntArray460[anInt8481++] = Static204.anIntArray183[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(5157) byte local5157 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149;
											local19 = (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366 >> 9) + Static454.anInt7910;
											local25 = (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367 >> 9) + Static48.anInt750;
											anIntArray460[anInt8481++] = (local5157 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray460[--anInt8481];
											anIntArray460[anInt8481++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray460[--anInt8481];
											anIntArray460[anInt8481++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray460[--anInt8481];
											anIntArray460[anInt8481++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray460[anInt8481++] = Static581.aBoolean701 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt8481 -= 2;
											local13 = anIntArray460[anInt8481];
											local19 = anIntArray460[anInt8481 + 1];
											anIntArray460[anInt8481++] = Static219.method3106(true, local19, local13);
											return;
										}
										if (arg0 == 3314) {
											anInt8481 -= 2;
											local13 = anIntArray460[anInt8481];
											local19 = anIntArray460[anInt8481 + 1];
											anIntArray460[anInt8481++] = Static562.method7687(local19, true, local13);
											return;
										}
										if (arg0 == 3315) {
											anInt8481 -= 2;
											local13 = anIntArray460[anInt8481];
											local19 = anIntArray460[anInt8481 + 1];
											anIntArray460[anInt8481++] = Static129.method8399(local19, local13, true);
											return;
										}
										if (arg0 == 3316) {
											if (Static281.anInt4403 >= 2) {
												anIntArray460[anInt8481++] = Static281.anInt4403;
												return;
											}
											anIntArray460[anInt8481++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray460[anInt8481++] = Static563.anInt9175;
											return;
										}
										if (arg0 == 3318) {
											anIntArray460[anInt8481++] = Static6.aClass365_1.anInt9973;
											return;
										}
										if (arg0 == 3321) {
											anIntArray460[anInt8481++] = Static205.anInt3271;
											return;
										}
										if (arg0 == 3322) {
											anIntArray460[anInt8481++] = Static560.anInt9141;
											return;
										}
										if (arg0 == 3323) {
											if (Static122.anInt2142 >= 5 && Static122.anInt2142 <= 9) {
												anIntArray460[anInt8481++] = 1;
												return;
											}
											anIntArray460[anInt8481++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static122.anInt2142 >= 5 && Static122.anInt2142 <= 9) {
												anIntArray460[anInt8481++] = Static122.anInt2142;
												return;
											}
											anIntArray460[anInt8481++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray460[anInt8481++] = Static513.aBoolean630 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray460[anInt8481++] = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt9558;
											return;
										}
										if (arg0 == 3327) {
											anIntArray460[anInt8481++] = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass239_1 != null && Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass239_1.aBoolean474 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray460[anInt8481++] = Static528.aBoolean633 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray460[--anInt8481];
											anIntArray460[anInt8481++] = Static83.method1293(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt8481 -= 2;
											local13 = anIntArray460[anInt8481];
											local19 = anIntArray460[anInt8481 + 1];
											anIntArray460[anInt8481++] = Static414.method6094(false, local19, local13);
											return;
										}
										if (arg0 == 3332) {
											anInt8481 -= 2;
											local13 = anIntArray460[anInt8481];
											local19 = anIntArray460[anInt8481 + 1];
											anIntArray460[anInt8481++] = Static414.method6094(true, local19, local13);
											return;
										}
										if (arg0 == 3333) {
											anIntArray460[anInt8481++] = Static69.anInt1053;
											return;
										}
										if (arg0 == 3335) {
											anIntArray460[anInt8481++] = Static259.anInt4113;
											return;
										}
										if (arg0 == 3336) {
											anInt8481 -= 4;
											local13 = anIntArray460[anInt8481];
											local19 = anIntArray460[anInt8481 + 1];
											local25 = anIntArray460[anInt8481 + 2];
											local357 = anIntArray460[anInt8481 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local357;
											anIntArray460[anInt8481++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray460[anInt8481++] = Static312.anInt5547;
											return;
										}
										if (arg0 == 3338) {
											anIntArray460[anInt8481++] = Static79.method1209();
											return;
										}
										if (arg0 == 3339) {
											anIntArray460[anInt8481++] = 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray460[anInt8481++] = Static324.aBoolean434 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray460[anInt8481++] = Static183.aBoolean251 ? 1 : 0;
											return;
										}
										if (arg0 == 3342) {
											anIntArray460[anInt8481++] = Static178.aClass111_1.method8703();
											return;
										}
										if (arg0 == 3343) {
											anIntArray460[anInt8481++] = Static178.aClass111_1.method8696();
											return;
										}
										if (arg0 == 3344) {
											aStringArray31[anInt8483++] = Static623.method8324();
											return;
										}
										if (arg0 == 3345) {
											aStringArray31[anInt8483++] = Static71.method1042();
											return;
										}
										if (arg0 == 3346) {
											anIntArray460[anInt8481++] = Static644.method8505();
											return;
										}
										if (arg0 == 3347) {
											anIntArray460[anInt8481++] = Static318.anInt2325;
											return;
										}
										if (arg0 == 3349) {
											anIntArray460[anInt8481++] = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass165_7.method3503() >> 3;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5908) Class82 local5908;
										if (arg0 == 3400) {
											anInt8481 -= 2;
											local13 = anIntArray460[anInt8481];
											local19 = anIntArray460[anInt8481 + 1];
											local5908 = Static429.aClass309_1.method7317(local13);
											aStringArray31[anInt8483++] = local5908.method1801(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt8481 -= 4;
											local13 = anIntArray460[anInt8481];
											local19 = anIntArray460[anInt8481 + 1];
											local25 = anIntArray460[anInt8481 + 2];
											local357 = anIntArray460[anInt8481 + 3];
											@Pc(5954) Class82 local5954 = Static429.aClass309_1.method7317(local25);
											if (local5954.aChar2 == local13 && local5954.aChar3 == local19) {
												if (local19 == 115) {
													aStringArray31[anInt8483++] = local5954.method1801(local357);
													return;
												}
												anIntArray460[anInt8481++] = local5954.method1805(local357);
												return;
											}
											throw new RuntimeException("C3408-1 " + local25 + "-" + local357);
										}
										if (arg0 == 3409) {
											anInt8481 -= 3;
											local13 = anIntArray460[anInt8481];
											local19 = anIntArray460[anInt8481 + 1];
											local25 = anIntArray460[anInt8481 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(6040) Class82 local6040 = Static429.aClass309_1.method7317(local19);
											if (local6040.aChar3 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray460[anInt8481++] = local6040.method1811(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray460[--anInt8481];
											local1161 = aStringArray31[--anInt8483];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5908 = Static429.aClass309_1.method7317(local13);
											if (local5908.aChar3 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray460[anInt8481++] = local5908.method1806(local1161) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray460[--anInt8481];
											@Pc(6138) Class82 local6138 = Static429.aClass309_1.method7317(local13);
											anIntArray460[anInt8481++] = local6138.aClass335_14.method7767();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static182.anInt6963 == 0) {
												anIntArray460[anInt8481++] = -2;
												return;
											}
											if (Static182.anInt6963 == 1) {
												anIntArray460[anInt8481++] = -1;
												return;
											}
											anIntArray460[anInt8481++] = Static529.anInt8750;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray460[--anInt8481];
											if (Static182.anInt6963 == 2 && local13 < Static529.anInt8750) {
												aStringArray31[anInt8483++] = Static562.aStringArray36[local13];
												if (Static128.aStringArray6[local13] != null) {
													aStringArray31[anInt8483++] = Static128.aStringArray6[local13];
													return;
												}
												aStringArray31[anInt8483++] = "";
												return;
											}
											aStringArray31[anInt8483++] = "";
											aStringArray31[anInt8483++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray460[--anInt8481];
											if (Static182.anInt6963 == 2 && local13 < Static529.anInt8750) {
												anIntArray460[anInt8481++] = Static640.anIntArray587[local13];
												return;
											}
											anIntArray460[anInt8481++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray460[--anInt8481];
											if (Static182.anInt6963 == 2 && local13 < Static529.anInt8750) {
												anIntArray460[anInt8481++] = Static374.anIntArray425[local13];
												return;
											}
											anIntArray460[anInt8481++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local4177 = aStringArray31[--anInt8483];
											local19 = anIntArray460[--anInt8481];
											Static479.method7039(local4177, local19);
											return;
										}
										if (arg0 == 3605) {
											local4177 = aStringArray31[--anInt8483];
											Static455.method6719(local4177);
											return;
										}
										if (arg0 == 3606) {
											local4177 = aStringArray31[--anInt8483];
											Static122.method1944(local4177);
											return;
										}
										if (arg0 == 3607) {
											local4177 = aStringArray31[--anInt8483];
											Static300.method4078(false, local4177);
											return;
										}
										if (arg0 == 3608) {
											local4177 = aStringArray31[--anInt8483];
											Static455.method6723(local4177);
											return;
										}
										if (arg0 == 3609) {
											local4177 = aStringArray31[--anInt8483];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray460[anInt8481++] = Static466.method6894(local4177) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray460[--anInt8481];
											if (Static182.anInt6963 == 2 && local13 < Static529.anInt8750) {
												aStringArray31[anInt8483++] = Static377.aStringArray24[local13];
												return;
											}
											aStringArray31[anInt8483++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static371.aString65 != null) {
												aStringArray31[anInt8483++] = Static248.method3515(Static371.aString65);
												return;
											}
											aStringArray31[anInt8483++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static371.aString65 != null) {
												anIntArray460[anInt8481++] = Static476.anInt8265;
												return;
											}
											anIntArray460[anInt8481++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray460[--anInt8481];
											if (Static371.aString65 != null && local13 < Static476.anInt8265) {
												aStringArray31[anInt8483++] = Static151.aClass273Array5[local13].aString81;
												return;
											}
											aStringArray31[anInt8483++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray460[--anInt8481];
											if (Static371.aString65 != null && local13 < Static476.anInt8265) {
												anIntArray460[anInt8481++] = Static151.aClass273Array5[local13].anInt7908;
												return;
											}
											anIntArray460[anInt8481++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray460[--anInt8481];
											if (Static371.aString65 != null && local13 < Static476.anInt8265) {
												anIntArray460[anInt8481++] = Static151.aClass273Array5[local13].aByte93;
												return;
											}
											anIntArray460[anInt8481++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray460[anInt8481++] = Static504.aByte100;
											return;
										}
										if (arg0 == 3617) {
											local4177 = aStringArray31[--anInt8483];
											Static421.method6406(local4177);
											return;
										}
										if (arg0 == 3618) {
											anIntArray460[anInt8481++] = Static51.aByte42;
											return;
										}
										if (arg0 == 3619) {
											local4177 = aStringArray31[--anInt8483];
											Static322.method5014(local4177);
											return;
										}
										if (arg0 == 3620) {
											Static93.method1445();
											return;
										}
										if (arg0 == 3621) {
											if (Static182.anInt6963 == 0) {
												anIntArray460[anInt8481++] = -1;
												return;
											}
											anIntArray460[anInt8481++] = Static455.anInt7921;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray460[--anInt8481];
											if (Static182.anInt6963 != 0 && local13 < Static455.anInt7921) {
												aStringArray31[anInt8483++] = Static587.aStringArray38[local13];
												if (Static594.aStringArray39[local13] != null) {
													aStringArray31[anInt8483++] = Static594.aStringArray39[local13];
													return;
												}
												aStringArray31[anInt8483++] = "";
												return;
											}
											aStringArray31[anInt8483++] = "";
											aStringArray31[anInt8483++] = "";
											return;
										}
										if (arg0 == 3623) {
											local4177 = aStringArray31[--anInt8483];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray460[anInt8481++] = Static115.method1838(local4177) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray460[--anInt8481];
											if (Static151.aClass273Array5 != null && local13 < Static476.anInt8265 && Static151.aClass273Array5[local13].aString80.equalsIgnoreCase(Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aString100)) {
												anIntArray460[anInt8481++] = 1;
												return;
											}
											anIntArray460[anInt8481++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static337.aString60 != null) {
												aStringArray31[anInt8483++] = Static337.aString60;
												return;
											}
											aStringArray31[anInt8483++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray460[--anInt8481];
											if (Static371.aString65 != null && local13 < Static476.anInt8265) {
												aStringArray31[anInt8483++] = Static151.aClass273Array5[local13].aString78;
												return;
											}
											aStringArray31[anInt8483++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray460[--anInt8481];
											if (Static182.anInt6963 == 2 && local13 >= 0 && local13 < Static529.anInt8750) {
												anIntArray460[anInt8481++] = Static211.aBooleanArray5[local13] ? 1 : 0;
												return;
											}
											anIntArray460[anInt8481++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local4177 = aStringArray31[--anInt8483];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray460[anInt8481++] = Static285.method3924(local4177);
											return;
										}
										if (arg0 == 3629) {
											anIntArray460[anInt8481++] = Static222.anInt3544;
											return;
										}
										if (arg0 == 3630) {
											local4177 = aStringArray31[--anInt8483];
											Static300.method4078(true, local4177);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray460[--anInt8481];
											anIntArray460[anInt8481++] = Static468.aBooleanArray19[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray460[--anInt8481];
											if (Static371.aString65 != null && local13 < Static476.anInt8265) {
												aStringArray31[anInt8483++] = Static151.aClass273Array5[local13].aString80;
												return;
											}
											aStringArray31[anInt8483++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray460[--anInt8481];
											if (Static182.anInt6963 != 0 && local13 < Static455.anInt7921) {
												aStringArray31[anInt8483++] = Static275.aStringArray17[local13];
												return;
											}
											aStringArray31[anInt8483++] = "";
											return;
										}
									} else if (arg0 < 3800) {
										if (arg0 == 3700) {
											if (Static619.aClass233_3 != null) {
												anIntArray460[anInt8481++] = 1;
												aClass233_1 = Static619.aClass233_3;
												return;
											}
											anIntArray460[anInt8481++] = 0;
											return;
										}
										if (arg0 == 3701) {
											if (Static583.aClass233_2 != null) {
												anIntArray460[anInt8481++] = 1;
												aClass233_1 = Static583.aClass233_2;
												return;
											}
											anIntArray460[anInt8481++] = 0;
											return;
										}
										if (arg0 == 3702) {
											aStringArray31[anInt8483++] = aClass233_1.aString64;
											return;
										}
										if (arg0 == 3703) {
											anIntArray460[anInt8481++] = aClass233_1.aBoolean463 ? 1 : 0;
											return;
										}
										if (arg0 == 3704) {
											anIntArray460[anInt8481++] = aClass233_1.aByte85;
											return;
										}
										if (arg0 == 3705) {
											anIntArray460[anInt8481++] = aClass233_1.aByte84;
											return;
										}
										if (arg0 == 3706) {
											anIntArray460[anInt8481++] = aClass233_1.aByte83;
											return;
										}
										if (arg0 == 3707) {
											anIntArray460[anInt8481++] = aClass233_1.aByte86;
											return;
										}
										if (arg0 == 3709) {
											anIntArray460[anInt8481++] = aClass233_1.anInt6476;
											return;
										}
										if (arg0 == 3710) {
											local13 = anIntArray460[--anInt8481];
											aStringArray31[anInt8483++] = aClass233_1.aStringArray23[local13];
											return;
										}
										if (arg0 == 3711) {
											local13 = anIntArray460[--anInt8481];
											anIntArray460[anInt8481++] = aClass233_1.aByteArray62[local13];
											return;
										}
										if (arg0 == 3712) {
											anIntArray460[anInt8481++] = aClass233_1.anInt6453;
											return;
										}
										if (arg0 == 3713) {
											local13 = anIntArray460[--anInt8481];
											aStringArray31[anInt8483++] = aClass233_1.aStringArray22[local13];
											return;
										}
										if (arg0 == 3714) {
											anInt8481 -= 3;
											local13 = anIntArray460[anInt8481];
											local19 = anIntArray460[anInt8481 + 1];
											local25 = anIntArray460[anInt8481 + 2];
											anIntArray460[anInt8481++] = aClass233_1.method5420(local25, local13, local19);
											return;
										}
										if (arg0 == 3715) {
											anIntArray460[anInt8481++] = aClass233_1.anInt6467;
											return;
										}
										if (arg0 == 3716) {
											anIntArray460[anInt8481++] = aClass233_1.anInt6457;
											return;
										}
										if (arg0 == 3717) {
											anIntArray460[anInt8481++] = aClass233_1.method5411(aStringArray31[--anInt8483]);
											return;
										}
										if (arg0 == 3718) {
											anIntArray460[anInt8481 - 1] = aClass233_1.method5429()[anIntArray460[anInt8481 - 1]];
											return;
										}
										if (arg0 == 3750) {
											if (Static57.aClass5_Sub49_1 != null) {
												anIntArray460[anInt8481++] = 1;
												aClass5_Sub49_3 = Static57.aClass5_Sub49_1;
												return;
											}
											anIntArray460[anInt8481++] = 0;
											return;
										}
										if (arg0 == 3751) {
											if (Static394.aClass5_Sub49_2 != null) {
												anIntArray460[anInt8481++] = 1;
												aClass5_Sub49_3 = Static394.aClass5_Sub49_2;
												return;
											}
											anIntArray460[anInt8481++] = 0;
											return;
										}
										if (arg0 == 3752) {
											aStringArray31[anInt8483++] = aClass5_Sub49_3.aString103;
											return;
										}
										if (arg0 == 3753) {
											anIntArray460[anInt8481++] = aClass5_Sub49_3.aByte136;
											return;
										}
										if (arg0 == 3754) {
											anIntArray460[anInt8481++] = aClass5_Sub49_3.aByte137;
											return;
										}
										if (arg0 == 3755) {
											anIntArray460[anInt8481++] = aClass5_Sub49_3.anInt9624;
											return;
										}
										if (arg0 == 3756) {
											local13 = anIntArray460[--anInt8481];
											aStringArray31[anInt8483++] = aClass5_Sub49_3.aClass192Array1[local13].aString42;
											return;
										}
										if (arg0 == 3757) {
											local13 = anIntArray460[--anInt8481];
											anIntArray460[anInt8481++] = aClass5_Sub49_3.aClass192Array1[local13].aByte52;
											return;
										}
										if (arg0 == 3758) {
											local13 = anIntArray460[--anInt8481];
											anIntArray460[anInt8481++] = aClass5_Sub49_3.aClass192Array1[local13].anInt4514;
											return;
										}
										if (arg0 == 3759) {
											local13 = anIntArray460[--anInt8481];
											Static295.method4025(local13, aClass5_Sub49_3 == Static394.aClass5_Sub49_2);
											return;
										}
										if (arg0 == 3760) {
											anIntArray460[anInt8481++] = aClass5_Sub49_3.method7996(aStringArray31[--anInt8483]);
											return;
										}
										if (arg0 == 3761) {
											anIntArray460[anInt8481 - 1] = aClass5_Sub49_3.method7998()[anIntArray460[anInt8481 - 1]];
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray460[--anInt8481];
											anIntArray460[anInt8481++] = Static644.aClass278Array1[local13].method6849();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray460[--anInt8481];
											anIntArray460[anInt8481++] = Static644.aClass278Array1[local13].anInt8057;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray460[--anInt8481];
											anIntArray460[anInt8481++] = Static644.aClass278Array1[local13].anInt8059;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray460[--anInt8481];
											anIntArray460[anInt8481++] = Static644.aClass278Array1[local13].anInt8050;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray460[--anInt8481];
											anIntArray460[anInt8481++] = Static644.aClass278Array1[local13].anInt8058;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray460[--anInt8481];
											anIntArray460[anInt8481++] = Static644.aClass278Array1[local13].anInt8054;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray460[--anInt8481];
											local19 = Static644.aClass278Array1[local13].method6851();
											anIntArray460[anInt8481++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray460[--anInt8481];
											local19 = Static644.aClass278Array1[local13].method6851();
											anIntArray460[anInt8481++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray460[--anInt8481];
											local19 = Static644.aClass278Array1[local13].method6851();
											anIntArray460[anInt8481++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray460[--anInt8481];
											local19 = Static644.aClass278Array1[local13].method6851();
											anIntArray460[anInt8481++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else {
										@Pc(8207) long local8207;
										if (arg0 < 4100) {
											if (arg0 == 4000) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												anIntArray460[anInt8481++] = local13 + local19;
												return;
											}
											if (arg0 == 4001) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												anIntArray460[anInt8481++] = local13 - local19;
												return;
											}
											if (arg0 == 4002) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												anIntArray460[anInt8481++] = local13 * local19;
												return;
											}
											if (arg0 == 4003) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												anIntArray460[anInt8481++] = local13 / local19;
												return;
											}
											if (arg0 == 4004) {
												local13 = anIntArray460[--anInt8481];
												anIntArray460[anInt8481++] = (int) (Math.random() * (double) local13);
												return;
											}
											if (arg0 == 4005) {
												local13 = anIntArray460[--anInt8481];
												anIntArray460[anInt8481++] = (int) (Math.random() * (double) (local13 + 1));
												return;
											}
											if (arg0 == 4006) {
												anInt8481 -= 5;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												local25 = anIntArray460[anInt8481 + 2];
												local357 = anIntArray460[anInt8481 + 3];
												local2473 = anIntArray460[anInt8481 + 4];
												anIntArray460[anInt8481++] = local13 + (local19 - local13) * (local2473 - local25) / (local357 - local25);
												return;
											}
											@Pc(8214) long local8214;
											if (arg0 == 4007) {
												anInt8481 -= 2;
												local8207 = (long) anIntArray460[anInt8481];
												local8214 = (long) anIntArray460[anInt8481 + 1];
												anIntArray460[anInt8481++] = (int) (local8207 + local8207 * local8214 / 100L);
												return;
											}
											if (arg0 == 4008) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												anIntArray460[anInt8481++] = local13 | 0x1 << local19;
												return;
											}
											if (arg0 == 4009) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												anIntArray460[anInt8481++] = local13 & -(0x1 << local19) - 1;
												return;
											}
											if (arg0 == 4010) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												anIntArray460[anInt8481++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
												return;
											}
											if (arg0 == 4011) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												anIntArray460[anInt8481++] = local13 % local19;
												return;
											}
											if (arg0 == 4012) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												if (local13 == 0) {
													anIntArray460[anInt8481++] = 0;
													return;
												}
												anIntArray460[anInt8481++] = (int) Math.pow((double) local13, (double) local19);
												return;
											}
											if (arg0 == 4013) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												if (local13 == 0) {
													anIntArray460[anInt8481++] = 0;
													return;
												}
												if (local19 == 0) {
													anIntArray460[anInt8481++] = Integer.MAX_VALUE;
													return;
												}
												anIntArray460[anInt8481++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
												return;
											}
											if (arg0 == 4014) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												anIntArray460[anInt8481++] = local13 & local19;
												return;
											}
											if (arg0 == 4015) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												anIntArray460[anInt8481++] = local13 | local19;
												return;
											}
											if (arg0 == 4016) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												anIntArray460[anInt8481++] = local13 < local19 ? local13 : local19;
												return;
											}
											if (arg0 == 4017) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												anIntArray460[anInt8481++] = local13 > local19 ? local13 : local19;
												return;
											}
											if (arg0 == 4018) {
												anInt8481 -= 3;
												local8207 = (long) anIntArray460[anInt8481];
												local8214 = (long) anIntArray460[anInt8481 + 1];
												@Pc(8595) long local8595 = (long) anIntArray460[anInt8481 + 2];
												anIntArray460[anInt8481++] = (int) (local8207 * local8595 / local8214);
												return;
											}
											if (arg0 == 4019) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												if (local13 > 700 || local19 > 700) {
													anIntArray460[anInt8481++] = 256;
												}
												@Pc(8654) double local8654 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
												anIntArray460[anInt8481++] = (int) (Math.pow(2.0D, local8654) + 0.5D);
												return;
											}
											if (arg0 == 4020) {
												local13 = anIntArray460[--anInt8481];
												anIntArray460[anInt8481++] = Static254.anIntArray246[Static239.method3445(local13) & 0xFFFF];
												return;
											}
										} else if (arg0 < 4200) {
											if (arg0 == 4100) {
												local4177 = aStringArray31[--anInt8483];
												local19 = anIntArray460[--anInt8481];
												aStringArray31[anInt8483++] = local4177 + local19;
												return;
											}
											if (arg0 == 4101) {
												anInt8483 -= 2;
												local4177 = aStringArray31[anInt8483];
												local1161 = aStringArray31[anInt8483 + 1];
												aStringArray31[anInt8483++] = local4177 + local1161;
												return;
											}
											if (arg0 == 4102) {
												local4177 = aStringArray31[--anInt8483];
												local19 = anIntArray460[--anInt8481];
												aStringArray31[anInt8483++] = local4177 + Static436.method6548(true, local19);
												return;
											}
											if (arg0 == 4103) {
												local4177 = aStringArray31[--anInt8483];
												aStringArray31[anInt8483++] = local4177.toLowerCase();
												return;
											}
											if (arg0 == 4104) {
												aStringArray31[anInt8483++] = Static395.method5738(Static18.method271(anIntArray460[--anInt8481]), Static259.anInt4113);
												return;
											}
											if (arg0 == 4105) {
												anInt8483 -= 2;
												local4177 = aStringArray31[anInt8483];
												local1161 = aStringArray31[anInt8483 + 1];
												if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass239_1 != null && Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aClass239_1.aBoolean474) {
													aStringArray31[anInt8483++] = local1161;
													return;
												}
												aStringArray31[anInt8483++] = local4177;
												return;
											}
											if (arg0 == 4106) {
												local13 = anIntArray460[--anInt8481];
												aStringArray31[anInt8483++] = Integer.toString(local13);
												return;
											}
											if (arg0 == 4107) {
												anInt8483 -= 2;
												anIntArray460[anInt8481++] = Static350.method5216(aStringArray31[anInt8483], Static259.anInt4113, aStringArray31[anInt8483 + 1]);
												return;
											}
											@Pc(8967) Class198 local8967;
											if (arg0 == 4108) {
												local4177 = aStringArray31[--anInt8483];
												anInt8481 -= 2;
												local19 = anIntArray460[anInt8481];
												local25 = anIntArray460[anInt8481 + 1];
												local8967 = Static253.method3556(Static253.aClass50_66, local25);
												anIntArray460[anInt8481++] = local8967.method4081(local4177, Static166.aClass59Array5, local19);
												return;
											}
											if (arg0 == 4109) {
												local4177 = aStringArray31[--anInt8483];
												anInt8481 -= 2;
												local19 = anIntArray460[anInt8481];
												local25 = anIntArray460[anInt8481 + 1];
												local8967 = Static253.method3556(Static253.aClass50_66, local25);
												anIntArray460[anInt8481++] = local8967.method4084(local19, Static166.aClass59Array5, local4177);
												return;
											}
											if (arg0 == 4110) {
												anInt8483 -= 2;
												local4177 = aStringArray31[anInt8483];
												local1161 = aStringArray31[anInt8483 + 1];
												if (anIntArray460[--anInt8481] == 1) {
													aStringArray31[anInt8483++] = local4177;
													return;
												}
												aStringArray31[anInt8483++] = local1161;
												return;
											}
											if (arg0 == 4111) {
												local4177 = aStringArray31[--anInt8483];
												aStringArray31[anInt8483++] = Static372.method5468(local4177);
												return;
											}
											if (arg0 == 4112) {
												local4177 = aStringArray31[--anInt8483];
												local19 = anIntArray460[--anInt8481];
												if (local19 == -1) {
													throw new RuntimeException("null char");
												}
												aStringArray31[anInt8483++] = local4177 + (char) local19;
												return;
											}
											if (arg0 == 4113) {
												local13 = anIntArray460[--anInt8481];
												anIntArray460[anInt8481++] = method7202((char) local13);
												return;
											}
											if (arg0 == 4114) {
												local13 = anIntArray460[--anInt8481];
												anIntArray460[anInt8481++] = Static635.method8429((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4115) {
												local13 = anIntArray460[--anInt8481];
												anIntArray460[anInt8481++] = Static469.method6938((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4116) {
												local13 = anIntArray460[--anInt8481];
												anIntArray460[anInt8481++] = Static642.method8489((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4117) {
												local4177 = aStringArray31[--anInt8483];
												if (local4177 != null) {
													anIntArray460[anInt8481++] = local4177.length();
													return;
												}
												anIntArray460[anInt8481++] = 0;
												return;
											}
											if (arg0 == 4118) {
												local4177 = aStringArray31[--anInt8483];
												anInt8481 -= 2;
												local19 = anIntArray460[anInt8481];
												local25 = anIntArray460[anInt8481 + 1];
												aStringArray31[anInt8483++] = local4177.substring(local19, local25);
												return;
											}
											if (arg0 == 4119) {
												local4177 = aStringArray31[--anInt8483];
												@Pc(9325) StringBuffer local9325 = new StringBuffer(local4177.length());
												@Pc(9327) boolean local9327 = false;
												for (local357 = 0; local357 < local4177.length(); local357++) {
													@Pc(9334) char local9334 = local4177.charAt(local357);
													if (local9334 == '<') {
														local9327 = true;
													} else if (local9334 == '>') {
														local9327 = false;
													} else if (!local9327) {
														local9325.append(local9334);
													}
												}
												aStringArray31[anInt8483++] = local9325.toString();
												return;
											}
											if (arg0 == 4120) {
												local4177 = aStringArray31[--anInt8483];
												anInt8481 -= 2;
												local19 = anIntArray460[anInt8481];
												local25 = anIntArray460[anInt8481 + 1];
												anIntArray460[anInt8481++] = local4177.indexOf(local19, local25);
												return;
											}
											if (arg0 == 4121) {
												anInt8483 -= 2;
												local4177 = aStringArray31[anInt8483];
												local1161 = aStringArray31[anInt8483 + 1];
												local25 = anIntArray460[--anInt8481];
												anIntArray460[anInt8481++] = local4177.indexOf(local1161, local25);
												return;
											}
											if (arg0 == 4122) {
												local13 = anIntArray460[--anInt8481];
												anIntArray460[anInt8481++] = Character.toLowerCase((char) local13);
												return;
											}
											if (arg0 == 4123) {
												local13 = anIntArray460[--anInt8481];
												anIntArray460[anInt8481++] = Character.toUpperCase((char) local13);
												return;
											}
											if (arg0 == 4124) {
												local420 = anIntArray460[--anInt8481] != 0;
												local19 = anIntArray460[--anInt8481];
												aStringArray31[anInt8483++] = Static594.method8048(0, local420, (long) local19, Static259.anInt4113);
												return;
											}
											if (arg0 == 4125) {
												local4177 = aStringArray31[--anInt8483];
												local19 = anIntArray460[--anInt8481];
												@Pc(9548) Class198 local9548 = Static253.method3556(Static253.aClass50_66, local19);
												anIntArray460[anInt8481++] = local9548.method4083(Static166.aClass59Array5, local4177);
												return;
											}
											if (arg0 == 4126) {
												aStringArray31[anInt8483++] = Static321.method4990(Static259.anInt4113, (long) anIntArray460[--anInt8481] * 60000L) + " UTC";
												return;
											}
											if (arg0 == 4127) {
												local8207 = aLongArray20[--anInt8480];
												aStringArray31[anInt8483++] = local8207 == -1L ? "" : Long.toString(local8207, 36).toUpperCase();
												return;
											}
										} else if (arg0 < 4300) {
											if (arg0 == 4200) {
												local13 = anIntArray460[--anInt8481];
												aStringArray31[anInt8483++] = Static259.aClass135_1.method2776(local13).aString61;
												return;
											}
											@Pc(9671) Class219 local9671;
											if (arg0 == 4201) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												local9671 = Static259.aClass135_1.method2776(local13);
												if (local19 >= 1 && local19 <= 5 && local9671.aStringArray20[local19 - 1] != null) {
													aStringArray31[anInt8483++] = local9671.aStringArray20[local19 - 1];
													return;
												}
												aStringArray31[anInt8483++] = "";
												return;
											}
											if (arg0 == 4202) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												local9671 = Static259.aClass135_1.method2776(local13);
												if (local19 >= 1 && local19 <= 5 && local9671.aStringArray19[local19 - 1] != null) {
													aStringArray31[anInt8483++] = local9671.aStringArray19[local19 - 1];
													return;
												}
												aStringArray31[anInt8483++] = "";
												return;
											}
											if (arg0 == 4203) {
												local13 = anIntArray460[--anInt8481];
												anIntArray460[anInt8481++] = Static259.aClass135_1.method2776(local13).anInt6161;
												return;
											}
											if (arg0 == 4204) {
												local13 = anIntArray460[--anInt8481];
												anIntArray460[anInt8481++] = Static259.aClass135_1.method2776(local13).anInt6168 == 1 ? 1 : 0;
												return;
											}
											@Pc(9834) Class219 local9834;
											if (arg0 == 4205) {
												local13 = anIntArray460[--anInt8481];
												local9834 = Static259.aClass135_1.method2776(local13);
												if (local9834.anInt6104 == -1 && local9834.anInt6142 >= 0) {
													anIntArray460[anInt8481++] = local9834.anInt6142;
													return;
												}
												anIntArray460[anInt8481++] = local13;
												return;
											}
											if (arg0 == 4206) {
												local13 = anIntArray460[--anInt8481];
												local9834 = Static259.aClass135_1.method2776(local13);
												if (local9834.anInt6104 >= 0 && local9834.anInt6142 >= 0) {
													anIntArray460[anInt8481++] = local9834.anInt6142;
													return;
												}
												anIntArray460[anInt8481++] = local13;
												return;
											}
											if (arg0 == 4207) {
												local13 = anIntArray460[--anInt8481];
												anIntArray460[anInt8481++] = Static259.aClass135_1.method2776(local13).aBoolean451 ? 1 : 0;
												return;
											}
											if (arg0 == 4208) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												local3242 = Static522.aClass282_2.method6901(local19);
												if (local3242.method956()) {
													aStringArray31[anInt8483++] = Static259.aClass135_1.method2776(local13).method5181(local19, local3242.aString9);
													return;
												}
												anIntArray460[anInt8481++] = Static259.aClass135_1.method2776(local13).method5168(local3242.anInt1028, local19);
												return;
											}
											if (arg0 == 4209) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1] - 1;
												local9671 = Static259.aClass135_1.method2776(local13);
												if (local9671.anInt6105 == local19) {
													anIntArray460[anInt8481++] = local9671.anInt6148;
													return;
												}
												if (local9671.anInt6151 == local19) {
													anIntArray460[anInt8481++] = local9671.anInt6156;
													return;
												}
												anIntArray460[anInt8481++] = -1;
												return;
											}
											if (arg0 == 4210) {
												local4177 = aStringArray31[--anInt8483];
												local19 = anIntArray460[--anInt8481];
												Static622.method7593(local19 == 1, local4177);
												anIntArray460[anInt8481++] = Static500.anInt8516;
												return;
											}
											if (arg0 == 4211) {
												if (Static219.aShortArray46 != null && Static547.anInt8953 < Static500.anInt8516) {
													anIntArray460[anInt8481++] = Static219.aShortArray46[Static547.anInt8953++] & 0xFFFF;
													return;
												}
												anIntArray460[anInt8481++] = -1;
												return;
											}
											if (arg0 == 4212) {
												Static547.anInt8953 = 0;
												return;
											}
											if (arg0 == 4213) {
												local13 = anIntArray460[--anInt8481];
												anIntArray460[anInt8481++] = Static259.aClass135_1.method2776(local13).anInt6118;
												return;
											}
											if (arg0 == 4214) {
												local4177 = aStringArray31[--anInt8483];
												anInt8481 -= 3;
												local19 = anIntArray460[anInt8481];
												local25 = anIntArray460[anInt8481 + 1];
												local357 = anIntArray460[anInt8481 + 2];
												Static119.method1903(local4177, local19 == 1, local357, local25);
												anIntArray460[anInt8481++] = Static500.anInt8516;
												return;
											}
											if (arg0 == 4215) {
												anInt8483 -= 2;
												anInt8481 -= 2;
												local4177 = aStringArray31[anInt8483];
												local19 = anIntArray460[anInt8481];
												local25 = anIntArray460[anInt8481 + 1];
												@Pc(10233) String local10233 = aStringArray31[anInt8483 + 1];
												Static313.method4792(local4177, local10233, local19 == 1, local25);
												anIntArray460[anInt8481++] = Static500.anInt8516;
												return;
											}
										} else if (arg0 < 4400) {
											if (arg0 == 4300) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												local3242 = Static522.aClass282_2.method6901(local19);
												if (local3242.method956()) {
													aStringArray31[anInt8483++] = Static58.aClass230_1.method5297(local13).method7326(local3242.aString9, local19);
													return;
												}
												anIntArray460[anInt8481++] = Static58.aClass230_1.method5297(local13).method7324(local3242.anInt1028, local19);
												return;
											}
										} else if (arg0 < 4500) {
											if (arg0 == 4400) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												local3242 = Static522.aClass282_2.method6901(local19);
												if (local3242.method956()) {
													aStringArray31[anInt8483++] = Static400.aClass140_4.method2839(local13).method1755(local19, local3242.aString9);
													return;
												}
												anIntArray460[anInt8481++] = Static400.aClass140_4.method2839(local13).method1756(local3242.anInt1028, local19);
												return;
											}
										} else if (arg0 < 4600) {
											if (arg0 == 4500) {
												anInt8481 -= 2;
												local13 = anIntArray460[anInt8481];
												local19 = anIntArray460[anInt8481 + 1];
												local3242 = Static522.aClass282_2.method6901(local19);
												if (local3242.method956()) {
													aStringArray31[anInt8483++] = Static402.aClass290_1.method7064(local13).method8547(local19, local3242.aString9);
													return;
												}
												anIntArray460[anInt8481++] = Static402.aClass290_1.method7064(local13).method8544(local19, local3242.anInt1028);
												return;
											}
										} else if (arg0 < 4700) {
											if (arg0 == 4600) {
												local13 = anIntArray460[--anInt8481];
												@Pc(10461) Class201 local10461 = Static233.aClass172_1.method3615(local13);
												if (local10461.anIntArray280 != null && local10461.anIntArray280.length > 0) {
													local25 = 0;
													local357 = local10461.anIntArray282[0];
													for (local2473 = 1; local2473 < local10461.anIntArray280.length; local2473++) {
														if (local10461.anIntArray282[local2473] > local357) {
															local25 = local2473;
															local357 = local10461.anIntArray282[local2473];
														}
													}
													anIntArray460[anInt8481++] = local10461.anIntArray280[local25];
													return;
												}
												anIntArray460[anInt8481++] = local10461.anInt4764;
												return;
											}
										} else if (arg0 < 4800) {
											if (arg0 == 4700) {
												anIntArray460[anInt8481++] = Static118.aBoolean145 ? 1 : 0;
												return;
											}
											if (arg0 == 4701) {
												local4177 = aStringArray31[--anInt8483];
												if (Static539.anInt8853 == 7 && Static16.anInt9847 == 0) {
													if (local4177.length() > 20) {
														Static602.aByte143 = -4;
														return;
													}
													Static602.aByte143 = -1;
													local4266 = Static455.method6717(Static41.aClass187_11, Static16.aClass332_8);
													local4266.aClass5_Sub15_Sub2_1.method3651(0);
													local25 = local4266.aClass5_Sub15_Sub2_1.anInt4144;
													local4266.aClass5_Sub15_Sub2_1.method3680(local4177);
													local4266.aClass5_Sub15_Sub2_1.method3649(local4266.aClass5_Sub15_Sub2_1.anInt4144 - local25);
													Static479.method7038(local4266);
													return;
												}
												Static602.aByte143 = -5;
												return;
											}
											if (arg0 == 4702) {
												anIntArray460[anInt8481++] = Static602.aByte143;
												if (Static602.aByte143 != -1) {
													Static602.aByte143 = -6;
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
							local137 = Static238.method3422(anIntArray460[--anInt8481]);
						} else {
							local137 = arg1 ? aClass394_7 : aClass394_8;
						}
						if (arg0 == 1300) {
							local19 = anIntArray460[--anInt8481] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method8735(local19, aStringArray31[--anInt8483]);
								return;
							}
							anInt8483--;
							return;
						}
						if (arg0 == 1301) {
							anInt8481 -= 2;
							local19 = anIntArray460[anInt8481];
							local25 = anIntArray460[anInt8481 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass394_13 = null;
								return;
							}
							local137.aClass394_13 = Static622.method7590(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray460[--anInt8481];
							if (local19 != Static409.anInt7021 && local19 != Static53.anInt4071 && local19 != Static364.anInt6368) {
								return;
							}
							local137.anInt10509 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt10519 = anIntArray460[--anInt8481];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt10537 = anIntArray460[--anInt8481];
							return;
						}
						if (arg0 == 1305) {
							local137.aString116 = aStringArray31[--anInt8483];
							return;
						}
						if (arg0 == 1306) {
							local137.aString115 = aStringArray31[--anInt8483];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray43 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt10484 = anIntArray460[--anInt8481];
							local137.anInt10478 = anIntArray460[--anInt8481];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray460[--anInt8481];
							local25 = anIntArray460[--anInt8481];
							if (local25 >= 1 && local25 <= 10) {
								local137.method8734(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString114 = aStringArray31[--anInt8483];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt10524 = anIntArray460[--anInt8481];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt8481 -= 3;
								local19 = anIntArray460[anInt8481] - 1;
								local25 = anIntArray460[anInt8481 + 1];
								local357 = anIntArray460[anInt8481 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt8481 -= 2;
								local19 = 10;
								local25 = anIntArray460[anInt8481];
								local357 = anIntArray460[anInt8481 + 1];
							}
							if (local137.aByteArray108 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray108 = new byte[11];
								local137.aByteArray109 = new byte[11];
								local137.anIntArray608 = new int[11];
							}
							local137.aByteArray108[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean783 = false;
								for (local2473 = 0; local2473 < local137.aByteArray108.length; local2473++) {
									if (local137.aByteArray108[local2473] != 0) {
										local137.aBoolean783 = true;
										break;
									}
								}
							} else {
								local137.aBoolean783 = true;
							}
							local137.aByteArray109[local19] = (byte) local357;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt10489 = anIntArray460[--anInt8481];
							return;
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static238.method3422(anIntArray460[--anInt8481]);
					} else {
						local137 = arg1 ? aClass394_7 : aClass394_8;
					}
					Static609.method8190(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt8481 -= 2;
						local19 = anIntArray460[anInt8481];
						local25 = anIntArray460[anInt8481 + 1];
						if (local137.anInt10502 == -1) {
							Static396.method5855(local137.anInt10490);
							Static129.method8396(local137.anInt10490);
							Static445.method6622(local137.anInt10490);
						}
						if (local19 == -1) {
							local137.anInt10482 = 1;
							local137.anInt10528 = -1;
							local137.anInt10469 = -1;
							return;
						}
						local137.anInt10469 = local19;
						local137.anInt10522 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean784 = true;
						} else {
							local137.aBoolean784 = false;
						}
						@Pc(1813) Class219 local1813 = Static259.aClass135_1.method2776(local19);
						local137.anInt10493 = local1813.anInt6132;
						local137.anInt10455 = local1813.anInt6129;
						local137.anInt10513 = local1813.anInt6123;
						local137.anInt10474 = local1813.anInt6141;
						local137.anInt10473 = local1813.anInt6146;
						local137.anInt10515 = local1813.anInt6145;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt10504 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt10504 = 1;
						} else {
							local137.anInt10504 = 2;
						}
						if (local137.anInt10451 > 0) {
							local137.anInt10515 = local137.anInt10515 * 32 / local137.anInt10451;
							return;
						}
						if (local137.anInt10463 > 0) {
							local137.anInt10515 = local137.anInt10515 * 32 / local137.anInt10463;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt10482 = 2;
						local137.anInt10528 = anIntArray460[--anInt8481];
						if (local137.anInt10502 == -1) {
							Static130.method2014(local137.anInt10490);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt10482 = 3;
						local137.anInt10528 = -1;
						if (local137.anInt10502 == -1) {
							Static130.method2014(local137.anInt10490);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt10482 = 6;
						local137.anInt10528 = anIntArray460[--anInt8481];
						if (local137.anInt10502 == -1) {
							Static130.method2014(local137.anInt10490);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt10482 = 5;
						local137.anInt10528 = anIntArray460[--anInt8481];
						if (local137.anInt10502 == -1) {
							Static130.method2014(local137.anInt10490);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt8481 -= 4;
						local137.anInt10488 = anIntArray460[anInt8481];
						local137.anInt10485 = anIntArray460[anInt8481 + 1];
						local137.anInt10464 = anIntArray460[anInt8481 + 2];
						local137.anInt10511 = anIntArray460[anInt8481 + 3];
						Static609.method8190(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt8481 -= 2;
						local137.anInt10476 = anIntArray460[anInt8481];
						local137.anInt10475 = anIntArray460[anInt8481 + 1];
						Static609.method8190(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt8481 -= 4;
						local137.anInt10528 = anIntArray460[anInt8481];
						local137.anInt10459 = anIntArray460[anInt8481 + 1];
						if (anIntArray460[anInt8481 + 2] == 1) {
							local137.anInt10482 = 9;
						} else {
							local137.anInt10482 = 8;
						}
						if (anIntArray460[anInt8481 + 3] == 1) {
							local137.aBoolean784 = true;
						} else {
							local137.aBoolean784 = false;
						}
						if (local137.anInt10502 == -1) {
							Static130.method2014(local137.anInt10490);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt10482 = 5;
						local137.anInt10528 = Static177.anInt2910;
						local137.anInt10459 = 0;
						if (local137.anInt10502 == -1) {
							Static130.method2014(local137.anInt10490);
						}
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "()V")
	public static void method7208() {
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
	public static void method7209(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static175.method2576(arg0)) {
			return;
		}
		@Pc(12) Class394[] local12 = Static227.aClass394ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class394 local19 = local12[local14];
			if (local19.anObjectArray12 != null) {
				@Pc(26) Class5_Sub28 local26 = new Class5_Sub28();
				local26.aClass394_2 = local19;
				local26.anObjectArray2 = local19.anObjectArray12;
				method7210(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!hw;I)V")
	private static void method7210(@OriginalArg(0) Class5_Sub28 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray2;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class5_Sub2_Sub12 local12 = Static584.method7986(local8);
		if (local12 == null) {
			return;
		}
		anIntArray461 = new int[local12.anInt6419];
		@Pc(21) int local21 = 0;
		aStringArray32 = new String[local12.anInt6422];
		@Pc(27) int local27 = 0;
		aLongArray21 = new long[local12.anInt6420];
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = 1; local35 < local2.length; local35++) {
			if (local2[local35] instanceof Integer) {
				@Pc(47) int local47 = (Integer) local2[local35];
				if (local47 == -2147483647) {
					local47 = arg0.anInt3839;
				}
				if (local47 == -2147483646) {
					local47 = arg0.anInt3840;
				}
				if (local47 == -2147483645) {
					local47 = arg0.aClass394_2 == null ? -1 : arg0.aClass394_2.anInt10490;
				}
				if (local47 == -2147483644) {
					local47 = arg0.anInt3835;
				}
				if (local47 == -2147483643) {
					local47 = arg0.aClass394_2 == null ? -1 : arg0.aClass394_2.anInt10502;
				}
				if (local47 == -2147483642) {
					local47 = arg0.aClass394_3 == null ? -1 : arg0.aClass394_3.anInt10490;
				}
				if (local47 == -2147483641) {
					local47 = arg0.aClass394_3 == null ? -1 : arg0.aClass394_3.anInt10502;
				}
				if (local47 == -2147483640) {
					local47 = arg0.anInt3836;
				}
				if (local47 == -2147483639) {
					local47 = arg0.anInt3833;
				}
				anIntArray461[local21++] = local47;
			} else if (local2[local35] instanceof String) {
				@Pc(141) String local141 = (String) local2[local35];
				if (local141.equals("event_opbase")) {
					local141 = arg0.aString32;
				}
				aStringArray32[local27++] = local141;
			} else if (local2[local35] instanceof Long) {
				@Pc(165) long local165 = (Long) local2[local35];
				aLongArray21[local33++] = local165;
			}
		}
		anInt8490 = arg0.anInt3838;
		method7204(local12, arg1);
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)I")
	private static int method7211(@OriginalArg(0) int arg0) {
		@Pc(4) Class220 local4 = Static126.aClass388_1.method8583(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c113");
		}
		@Pc(26) Integer local26 = aClass233_1.method5417(local4.anInt6171, local4.anInt6173, Static591.aClass174_7.anInt4124 << 16 | local4.anInt6174);
		return local26 == null ? 0 : local26;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ks;II)V")
	public static void method7212(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class5_Sub2_Sub12 local5 = Static624.method8336(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray461 = new int[local5.anInt6419];
		aStringArray32 = new String[local5.anInt6422];
		if (local5.aClass209_9 == Static317.aClass209_5 || local5.aClass209_9 == Static464.aClass209_10 || local5.aClass209_9 == Static472.aClass209_11) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static413.aClass394_4 != null) {
				local30 = Static413.aClass394_4.anInt10494;
				local32 = Static413.aClass394_4.anInt10486;
			}
			anIntArray461[0] = Static178.aClass111_1.method8703() - local30;
			anIntArray461[1] = Static178.aClass111_1.method8696() - local32;
		}
		method7204(local5, 200000);
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)J")
	private static long method7213(@OriginalArg(0) int arg0) {
		@Pc(9) Long local9 = aClass233_1.method5424(Static591.aClass174_7.anInt4124 << 16 | arg0);
		return local9 == null ? -1L : local9;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(IZ)V")
	private static void method7214(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(52) Class5_Sub16 local52;
		@Pc(776) int local776;
		@Pc(97) int local97;
		@Pc(83) String local83;
		@Pc(175) int local175;
		@Pc(1496) boolean local1496;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray460[anInt8481++] = Static557.anInt9100;
				return;
			}
			if (arg0 == 5001) {
				anInt8481 -= 3;
				Static557.anInt9100 = anIntArray460[anInt8481];
				Static566.aClass139_4 = Static43.method608(anIntArray460[anInt8481 + 1]);
				if (Static566.aClass139_4 == null) {
					Static566.aClass139_4 = Static216.aClass139_2;
				}
				Static415.anInt7088 = anIntArray460[anInt8481 + 2];
				local52 = Static455.method6717(Static29.aClass187_7, Static16.aClass332_8);
				local52.aClass5_Sub15_Sub2_1.method3651(Static557.anInt9100);
				local52.aClass5_Sub15_Sub2_1.method3651(Static566.aClass139_4.anInt3234);
				local52.aClass5_Sub15_Sub2_1.method3651(Static415.anInt7088);
				Static479.method7038(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt8483 -= 2;
				local83 = aStringArray31[anInt8483];
				local89 = aStringArray31[anInt8483 + 1];
				anInt8481 -= 2;
				local97 = anIntArray460[anInt8481];
				local103 = anIntArray460[anInt8481 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class5_Sub16 local125 = Static455.method6717(Static634.aClass187_104, Static16.aClass332_8);
				local125.aClass5_Sub15_Sub2_1.method3651(Static467.method6904(local83) + Static467.method6904(local89) + 2);
				local125.aClass5_Sub15_Sub2_1.method3680(local83);
				local125.aClass5_Sub15_Sub2_1.method3651(local97 - 1);
				local125.aClass5_Sub15_Sub2_1.method3651(local103);
				local125.aClass5_Sub15_Sub2_1.method3680(local89);
				Static479.method7038(local125);
				return;
			}
			@Pc(179) Class295 local179;
			if (arg0 == 5003) {
				local175 = anIntArray460[--anInt8481];
				local179 = Static480.method3952(local175);
				local181 = "";
				if (local179 != null && local179.aString84 != null) {
					local181 = local179.aString84;
				}
				aStringArray31[anInt8483++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray460[--anInt8481];
				local179 = Static480.method3952(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8437;
				}
				anIntArray460[anInt8481++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static566.aClass139_4 == null) {
					anIntArray460[anInt8481++] = -1;
					return;
				}
				anIntArray460[anInt8481++] = Static566.aClass139_4.anInt3234;
				return;
			}
			@Pc(269) Class5_Sub16 local269;
			if (arg0 == 5006) {
				local175 = anIntArray460[--anInt8481];
				local269 = Static455.method6717(Static634.aClass187_103, Static16.aClass332_8);
				local269.aClass5_Sub15_Sub2_1.method3651(local175);
				Static479.method7038(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray31[--anInt8483];
				method7218(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt8483 -= 2;
				local83 = aStringArray31[anInt8483];
				local89 = aStringArray31[anInt8483 + 1];
				if (Static281.anInt4403 != 0 || (!Static533.aBoolean637 || Static236.aBoolean266) && !Static528.aBoolean633) {
					@Pc(328) Class5_Sub16 local328 = Static455.method6717(Static650.aClass187_110, Static16.aClass332_8);
					local328.aClass5_Sub15_Sub2_1.method3651(0);
					local103 = local328.aClass5_Sub15_Sub2_1.anInt4144;
					local328.aClass5_Sub15_Sub2_1.method3680(local83);
					Static60.method886(local89, local328.aClass5_Sub15_Sub2_1);
					local328.aClass5_Sub15_Sub2_1.method3649(local328.aClass5_Sub15_Sub2_1.anInt4144 - local103);
					Static479.method7038(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray460[--anInt8481];
				local179 = Static480.method3952(local175);
				local181 = "";
				if (local179 != null && local179.aString88 != null) {
					local181 = local179.aString88;
				}
				aStringArray31[anInt8483++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray460[--anInt8481];
				local179 = Static480.method3952(local175);
				local181 = "";
				if (local179 != null && local179.aString87 != null) {
					local181 = local179.aString87;
				}
				aStringArray31[anInt8483++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray460[--anInt8481];
				local179 = Static480.method3952(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8440;
				}
				anIntArray460[anInt8481++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1 == null || Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aString101 == null) {
					local83 = "";
				} else {
					local83 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.method7935();
				}
				aStringArray31[anInt8483++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray460[anInt8481++] = Static415.anInt7088;
				return;
			}
			if (arg0 == 5017) {
				anIntArray460[anInt8481++] = Static616.method8262();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray460[--anInt8481];
				local179 = Static480.method3952(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt8433;
				}
				anIntArray460[anInt8481++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray460[--anInt8481];
				local179 = Static480.method3952(local175);
				local181 = "";
				if (local179 != null && local179.aString86 != null) {
					local181 = local179.aString86;
				}
				aStringArray31[anInt8483++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1 == null || Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aString101 == null) {
					local83 = "";
				} else {
					local83 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.method7936();
				}
				aStringArray31[anInt8483++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray460[--anInt8481];
				local179 = Static480.method3952(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8435;
				}
				anIntArray460[anInt8481++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray460[--anInt8481];
				local179 = Static480.method3952(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt8439;
				}
				anIntArray460[anInt8481++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray460[--anInt8481];
				local179 = Static480.method3952(local175);
				local181 = "";
				if (local179 != null && local179.aString85 != null) {
					local181 = local179.aString85;
				}
				aStringArray31[anInt8483++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray460[--anInt8481];
				aStringArray31[anInt8483++] = Static94.aClass236_1.method5531(local175).aString59;
				return;
			}
			@Pc(736) Class5_Sub2_Sub9 local736;
			if (arg0 == 5051) {
				local175 = anIntArray460[--anInt8481];
				local736 = Static94.aClass236_1.method5531(local175);
				if (local736.anIntArray343 == null) {
					anIntArray460[anInt8481++] = 0;
					return;
				}
				anIntArray460[anInt8481++] = local736.anIntArray343.length;
				return;
			}
			if (arg0 == 5052) {
				anInt8481 -= 2;
				local175 = anIntArray460[anInt8481];
				local776 = anIntArray460[anInt8481 + 1];
				@Pc(781) Class5_Sub2_Sub9 local781 = Static94.aClass236_1.method5531(local175);
				local103 = local781.anIntArray343[local776];
				anIntArray460[anInt8481++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray460[--anInt8481];
				local736 = Static94.aClass236_1.method5531(local175);
				if (local736.anIntArray344 == null) {
					anIntArray460[anInt8481++] = 0;
					return;
				}
				anIntArray460[anInt8481++] = local736.anIntArray344.length;
				return;
			}
			if (arg0 == 5054) {
				anInt8481 -= 2;
				local175 = anIntArray460[anInt8481];
				local776 = anIntArray460[anInt8481 + 1];
				anIntArray460[anInt8481++] = Static94.aClass236_1.method5531(local175).anIntArray344[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray460[--anInt8481];
				aStringArray31[anInt8483++] = Static62.aClass100_2.method2047(local175).method194();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray460[--anInt8481];
				@Pc(907) Class5_Sub2_Sub2 local907 = Static62.aClass100_2.method2047(local175);
				if (local907.anIntArray25 == null) {
					anIntArray460[anInt8481++] = 0;
					return;
				}
				anIntArray460[anInt8481++] = local907.anIntArray25.length;
				return;
			}
			if (arg0 == 5057) {
				anInt8481 -= 2;
				local175 = anIntArray460[anInt8481];
				local776 = anIntArray460[anInt8481 + 1];
				anIntArray460[anInt8481++] = Static62.aClass100_2.method2047(local175).anIntArray25[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass305_1 = new Class305();
				aClass305_1.anInt8528 = anIntArray460[--anInt8481];
				aClass305_1.aClass5_Sub2_Sub2_1 = Static62.aClass100_2.method2047(aClass305_1.anInt8528);
				aClass305_1.anIntArray464 = new int[aClass305_1.aClass5_Sub2_Sub2_1.method196()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static455.method6717(Static67.aClass187_22, Static16.aClass332_8);
				local52.aClass5_Sub15_Sub2_1.method3651(0);
				local776 = local52.aClass5_Sub15_Sub2_1.anInt4144;
				local52.aClass5_Sub15_Sub2_1.method3651(0);
				local52.aClass5_Sub15_Sub2_1.method3660(aClass305_1.anInt8528);
				aClass305_1.aClass5_Sub2_Sub2_1.method191(local52.aClass5_Sub15_Sub2_1, aClass305_1.anIntArray464);
				local52.aClass5_Sub15_Sub2_1.method3649(local52.aClass5_Sub15_Sub2_1.anInt4144 - local776);
				Static479.method7038(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray31[--anInt8483];
				local269 = Static455.method6717(Static34.aClass187_10, Static16.aClass332_8);
				local269.aClass5_Sub15_Sub2_1.method3651(0);
				local97 = local269.aClass5_Sub15_Sub2_1.anInt4144;
				local269.aClass5_Sub15_Sub2_1.method3680(local83);
				local269.aClass5_Sub15_Sub2_1.method3660(aClass305_1.anInt8528);
				aClass305_1.aClass5_Sub2_Sub2_1.method191(local269.aClass5_Sub15_Sub2_1, aClass305_1.anIntArray464);
				local269.aClass5_Sub15_Sub2_1.method3649(local269.aClass5_Sub15_Sub2_1.anInt4144 - local97);
				Static479.method7038(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static455.method6717(Static67.aClass187_22, Static16.aClass332_8);
				local52.aClass5_Sub15_Sub2_1.method3651(0);
				local776 = local52.aClass5_Sub15_Sub2_1.anInt4144;
				local52.aClass5_Sub15_Sub2_1.method3651(1);
				local52.aClass5_Sub15_Sub2_1.method3660(aClass305_1.anInt8528);
				aClass305_1.aClass5_Sub2_Sub2_1.method191(local52.aClass5_Sub15_Sub2_1, aClass305_1.anIntArray464);
				local52.aClass5_Sub15_Sub2_1.method3649(local52.aClass5_Sub15_Sub2_1.anInt4144 - local776);
				Static479.method7038(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt8481 -= 2;
				local175 = anIntArray460[anInt8481];
				local776 = anIntArray460[anInt8481 + 1];
				anIntArray460[anInt8481++] = Static94.aClass236_1.method5531(local175).aCharArray6[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt8481 -= 2;
				local175 = anIntArray460[anInt8481];
				local776 = anIntArray460[anInt8481 + 1];
				anIntArray460[anInt8481++] = Static94.aClass236_1.method5531(local175).aCharArray7[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt8481 -= 2;
				local175 = anIntArray460[anInt8481];
				local776 = anIntArray460[anInt8481 + 1];
				if (local776 == -1) {
					anIntArray460[anInt8481++] = -1;
					return;
				}
				anIntArray460[anInt8481++] = Static94.aClass236_1.method5531(local175).method5122((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt8481 -= 2;
				local175 = anIntArray460[anInt8481];
				local776 = anIntArray460[anInt8481 + 1];
				if (local776 == -1) {
					anIntArray460[anInt8481++] = -1;
					return;
				}
				anIntArray460[anInt8481++] = Static94.aClass236_1.method5531(local175).method5124((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray460[--anInt8481];
				anIntArray460[anInt8481++] = Static62.aClass100_2.method2047(local175).method196();
				return;
			}
			if (arg0 == 5067) {
				anInt8481 -= 2;
				local175 = anIntArray460[anInt8481];
				local776 = anIntArray460[anInt8481 + 1];
				local97 = Static62.aClass100_2.method2047(local175).method192(local776).anInt8535;
				anIntArray460[anInt8481++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt8481 -= 2;
				local175 = anIntArray460[anInt8481];
				local776 = anIntArray460[anInt8481 + 1];
				aClass305_1.anIntArray464[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt8481 -= 2;
				local175 = anIntArray460[anInt8481];
				local776 = anIntArray460[anInt8481 + 1];
				aClass305_1.anIntArray464[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt8481 -= 3;
				local175 = anIntArray460[anInt8481];
				local776 = anIntArray460[anInt8481 + 1];
				local97 = anIntArray460[anInt8481 + 2];
				@Pc(1448) Class5_Sub2_Sub2 local1448 = Static62.aClass100_2.method2047(local175);
				if (local1448.method192(local776).anInt8535 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray460[anInt8481++] = local1448.method198(local97, local776);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray31[--anInt8483];
				local1496 = anIntArray460[--anInt8481] == 1;
				Static187.method2727(local83, local1496);
				anIntArray460[anInt8481++] = Static500.anInt8516;
				return;
			}
			if (arg0 == 5072) {
				if (Static219.aShortArray46 != null && Static547.anInt8953 < Static500.anInt8516) {
					anIntArray460[anInt8481++] = Static219.aShortArray46[Static547.anInt8953++] & 0xFFFF;
					return;
				}
				anIntArray460[anInt8481++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static547.anInt8953 = 0;
				return;
			}
			if (arg0 == 5074) {
				local52 = Static455.method6717(Static67.aClass187_22, Static16.aClass332_8);
				local52.aClass5_Sub15_Sub2_1.method3651(0);
				local776 = local52.aClass5_Sub15_Sub2_1.anInt4144;
				local52.aClass5_Sub15_Sub2_1.method3651(2);
				local52.aClass5_Sub15_Sub2_1.method3660(aClass305_1.anInt8528);
				aClass305_1.aClass5_Sub2_Sub2_1.method191(local52.aClass5_Sub15_Sub2_1, aClass305_1.anIntArray464);
				local52.aClass5_Sub15_Sub2_1.method3649(local52.aClass5_Sub15_Sub2_1.anInt4144 - local776);
				Static479.method7038(local52);
				return;
			}
			if (arg0 == 5075) {
				local52 = Static455.method6717(Static67.aClass187_22, Static16.aClass332_8);
				local52.aClass5_Sub15_Sub2_1.method3651(0);
				local776 = local52.aClass5_Sub15_Sub2_1.anInt4144;
				local52.aClass5_Sub15_Sub2_1.method3651(3);
				local52.aClass5_Sub15_Sub2_1.method3660(aClass305_1.anInt8528);
				aClass305_1.aClass5_Sub2_Sub2_1.method191(local52.aClass5_Sub15_Sub2_1, aClass305_1.anIntArray464);
				local52.aClass5_Sub15_Sub2_1.method3649(local52.aClass5_Sub15_Sub2_1.anInt4144 - local776);
				Static479.method7038(local52);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static176.aClass157_1.method3300(86)) {
					anIntArray460[anInt8481++] = 1;
					return;
				}
				anIntArray460[anInt8481++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static176.aClass157_1.method3300(82)) {
					anIntArray460[anInt8481++] = 1;
					return;
				}
				anIntArray460[anInt8481++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static176.aClass157_1.method3300(81)) {
					anIntArray460[anInt8481++] = 1;
					return;
				}
				anIntArray460[anInt8481++] = 0;
				return;
			}
		} else {
			@Pc(2931) int local2931;
			@Pc(2205) boolean local2205;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static116.method1853(anIntArray460[--anInt8481]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray460[anInt8481++] = Static31.method399();
					return;
				}
				if (arg0 == 5205) {
					Static123.method1945(false, anIntArray460[--anInt8481], -1, -1);
					return;
				}
				@Pc(1794) Class5_Sub2_Sub18 local1794;
				if (arg0 == 5206) {
					local175 = anIntArray460[--anInt8481];
					local1794 = Static407.method5512(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1794 == null) {
						anIntArray460[anInt8481++] = -1;
						return;
					}
					anIntArray460[anInt8481++] = local1794.anInt7674;
					return;
				}
				@Pc(1827) Class5_Sub2_Sub18 local1827;
				if (arg0 == 5207) {
					local1827 = Static407.method5514(anIntArray460[--anInt8481]);
					if (local1827 != null && local1827.aString76 != null) {
						aStringArray31[anInt8483++] = local1827.aString76;
						return;
					}
					aStringArray31[anInt8483++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray460[anInt8481++] = Static376.anInt6560;
					anIntArray460[anInt8481++] = Static573.anInt9368;
					return;
				}
				if (arg0 == 5209) {
					anIntArray460[anInt8481++] = Static255.anInt4085 + Static407.anInt6543;
					anIntArray460[anInt8481++] = Static361.anInt6318 + Static407.anInt6539;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray460[--anInt8481];
					local1794 = Static407.method5514(local175);
					if (local1794 == null) {
						anIntArray460[anInt8481++] = 0;
						anIntArray460[anInt8481++] = 0;
						return;
					}
					anIntArray460[anInt8481++] = local1794.anInt7675 >> 14 & 0x3FFF;
					anIntArray460[anInt8481++] = local1794.anInt7675 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray460[--anInt8481];
					local1794 = Static407.method5514(local175);
					if (local1794 == null) {
						anIntArray460[anInt8481++] = 0;
						anIntArray460[anInt8481++] = 0;
						return;
					}
					anIntArray460[anInt8481++] = local1794.anInt7669 - local1794.anInt7670;
					anIntArray460[anInt8481++] = local1794.anInt7678 - local1794.anInt7671;
					return;
				}
				@Pc(2017) Class5_Sub40 local2017;
				if (arg0 == 5212) {
					local2017 = Static443.method6609();
					if (local2017 == null) {
						anIntArray460[anInt8481++] = -1;
						anIntArray460[anInt8481++] = -1;
						return;
					}
					anIntArray460[anInt8481++] = local2017.anInt7515;
					local776 = local2017.anInt7520 << 28 | local2017.anInt7521 + Static407.anInt6543 << 14 | local2017.anInt7516 + Static407.anInt6539;
					anIntArray460[anInt8481++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local2017 = Static579.method7884();
					if (local2017 == null) {
						anIntArray460[anInt8481++] = -1;
						anIntArray460[anInt8481++] = -1;
						return;
					}
					anIntArray460[anInt8481++] = local2017.anInt7515;
					local776 = local2017.anInt7520 << 28 | local2017.anInt7521 + Static407.anInt6543 << 14 | local2017.anInt7516 + Static407.anInt6539;
					anIntArray460[anInt8481++] = local776;
					return;
				}
				@Pc(2165) boolean local2165;
				if (arg0 == 5214) {
					local175 = anIntArray460[--anInt8481];
					local1794 = Static199.method2810();
					if (local1794 != null) {
						local2165 = local1794.method6514(local175 & 0x3FFF, local175 >> 28 & 0x3, anIntArray459, local175 >> 14 & 0x3FFF);
						if (local2165) {
							Static179.method2638(anIntArray459[2], anIntArray459[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt8481 -= 2;
					local175 = anIntArray460[anInt8481];
					local776 = anIntArray460[anInt8481 + 1];
					@Pc(2203) Class150 local2203 = Static407.method5507(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2205 = false;
					for (@Pc(2210) Class5_Sub2_Sub18 local2210 = (Class5_Sub2_Sub18) local2203.method3100(); local2210 != null; local2210 = (Class5_Sub2_Sub18) local2203.method3096()) {
						if (local2210.anInt7674 == local776) {
							local2205 = true;
							break;
						}
					}
					if (local2205) {
						anIntArray460[anInt8481++] = 1;
						return;
					}
					anIntArray460[anInt8481++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray460[--anInt8481];
					local1794 = Static407.method5514(local175);
					if (local1794 == null) {
						anIntArray460[anInt8481++] = -1;
						return;
					}
					anIntArray460[anInt8481++] = local1794.anInt7672;
					return;
				}
				if (arg0 == 5220) {
					anIntArray460[anInt8481++] = Static8.anInt166 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray460[--anInt8481];
					Static179.method2638(local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1827 = Static199.method2810();
					if (local1827 != null) {
						local1496 = local1827.method6512(anIntArray459, Static255.anInt4085 + Static407.anInt6543, Static361.anInt6318 + Static407.anInt6539);
						if (local1496) {
							anIntArray460[anInt8481++] = anIntArray459[1];
							anIntArray460[anInt8481++] = anIntArray459[2];
							return;
						}
						anIntArray460[anInt8481++] = -1;
						anIntArray460[anInt8481++] = -1;
						return;
					}
					anIntArray460[anInt8481++] = -1;
					anIntArray460[anInt8481++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt8481 -= 2;
					local175 = anIntArray460[anInt8481];
					local776 = anIntArray460[anInt8481 + 1];
					Static123.method1945(false, local175, local776 >> 14 & 0x3FFF, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray460[--anInt8481];
					local1794 = Static199.method2810();
					if (local1794 != null) {
						local2165 = local1794.method6514(local175 & 0x3FFF, local175 >> 28 & 0x3, anIntArray459, local175 >> 14 & 0x3FFF);
						if (local2165) {
							anIntArray460[anInt8481++] = anIntArray459[1];
							anIntArray460[anInt8481++] = anIntArray459[2];
							return;
						}
						anIntArray460[anInt8481++] = -1;
						anIntArray460[anInt8481++] = -1;
						return;
					}
					anIntArray460[anInt8481++] = -1;
					anIntArray460[anInt8481++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray460[--anInt8481];
					local1794 = Static199.method2810();
					if (local1794 != null) {
						local2165 = local1794.method6512(anIntArray459, local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
						if (local2165) {
							anIntArray460[anInt8481++] = anIntArray459[1];
							anIntArray460[anInt8481++] = anIntArray459[2];
							return;
						}
						anIntArray460[anInt8481++] = -1;
						anIntArray460[anInt8481++] = -1;
						return;
					}
					anIntArray460[anInt8481++] = -1;
					anIntArray460[anInt8481++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static506.method7297(anIntArray460[--anInt8481]);
					return;
				}
				if (arg0 == 5227) {
					anInt8481 -= 2;
					local175 = anIntArray460[anInt8481];
					local776 = anIntArray460[anInt8481 + 1];
					Static123.method1945(true, local175, local776 >> 14 & 0x3FFF, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static208.aBoolean514 = anIntArray460[--anInt8481] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray460[anInt8481++] = Static208.aBoolean514 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray460[--anInt8481];
					Static617.method8271(local175);
					return;
				}
				@Pc(2723) Class5 local2723;
				if (arg0 == 5231) {
					anInt8481 -= 2;
					local175 = anIntArray460[anInt8481];
					local1496 = anIntArray460[anInt8481 + 1] == 1;
					if (Static599.aClass335_44 != null) {
						local2723 = Static599.aClass335_44.method7766((long) local175);
						if (local2723 != null && !local1496) {
							local2723.method8829();
							return;
						}
						if (local2723 == null && local1496) {
							local2723 = new Class5();
							Static599.aClass335_44.method7770((long) local175, local2723);
						}
					}
					return;
				}
				@Pc(2765) Class5 local2765;
				if (arg0 == 5232) {
					local175 = anIntArray460[--anInt8481];
					if (Static599.aClass335_44 != null) {
						local2765 = Static599.aClass335_44.method7766((long) local175);
						anIntArray460[anInt8481++] = local2765 == null ? 0 : 1;
						return;
					}
					anIntArray460[anInt8481++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt8481 -= 2;
					local175 = anIntArray460[anInt8481];
					local1496 = anIntArray460[anInt8481 + 1] == 1;
					if (Static194.aClass335_45 != null) {
						local2723 = Static194.aClass335_45.method7766((long) local175);
						if (local2723 != null && !local1496) {
							local2723.method8829();
							return;
						}
						if (local2723 == null && local1496) {
							local2723 = new Class5();
							Static194.aClass335_45.method7770((long) local175, local2723);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray460[--anInt8481];
					if (Static194.aClass335_45 != null) {
						local2765 = Static194.aClass335_45.method7766((long) local175);
						anIntArray460[anInt8481++] = local2765 == null ? 0 : 1;
						return;
					}
					anIntArray460[anInt8481++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray460[anInt8481++] = Static407.aClass5_Sub2_Sub18_2 == null ? -1 : Static407.aClass5_Sub2_Sub18_2.anInt7674;
					return;
				}
				if (arg0 == 5236) {
					anInt8481 -= 2;
					local175 = anIntArray460[anInt8481];
					local776 = anIntArray460[anInt8481 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2931 = Static107.method1773(local103, local97, local175);
					if (local2931 < 0) {
						anIntArray460[anInt8481++] = -1;
						return;
					}
					anIntArray460[anInt8481++] = local2931;
					return;
				}
				if (arg0 == 5237) {
					Static517.method7335();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt8481 -= 2;
					local175 = anIntArray460[anInt8481];
					local776 = anIntArray460[anInt8481 + 1];
					Static113.method1830(local175, 3, local776, false);
					anIntArray460[anInt8481++] = Static518.aFrame4 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static518.aFrame4 != null) {
						Static113.method1830(-1, Static655.aClass5_Sub36_29.aClass2_Sub12_2.method5866(), -1, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(3017) Class96[] local3017 = Static49.method729();
					anIntArray460[anInt8481++] = local3017.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray460[--anInt8481];
					@Pc(3041) Class96[] local3041 = Static49.method729();
					anIntArray460[anInt8481++] = local3041[local175].anInt2225;
					anIntArray460[anInt8481++] = local3041[local175].anInt2224;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static293.anInt4551;
					local776 = Static413.anInt7059;
					local97 = -1;
					@Pc(3076) Class96[] local3076 = Static49.method729();
					for (local2931 = 0; local2931 < local3076.length; local2931++) {
						@Pc(3083) Class96 local3083 = local3076[local2931];
						if (local3083.anInt2225 == local175 && local3083.anInt2224 == local776) {
							local97 = local2931;
							break;
						}
					}
					anIntArray460[anInt8481++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray460[anInt8481++] = Static581.method7952();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray460[--anInt8481];
					if (local175 >= 1 && local175 <= 2) {
						Static113.method1830(-1, local175, -1, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub12_2.method5866();
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray460[--anInt8481];
					if (local175 >= 1 && local175 <= 2) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub12_2, local175);
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub12_1, local175);
						Static185.method2703();
						return;
					}
					return;
				}
			} else {
				@Pc(3369) int local3369;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt8483 -= 2;
						local83 = aStringArray31[anInt8483];
						local89 = aStringArray31[anInt8483 + 1];
						local97 = anIntArray460[--anInt8481];
						@Pc(3231) Class5_Sub16 local3231 = Static455.method6717(Static470.aClass187_74, Static16.aClass332_8);
						local3231.aClass5_Sub15_Sub2_1.method3651(Static467.method6904(local83) + Static467.method6904(local89) + 1);
						local3231.aClass5_Sub15_Sub2_1.method3680(local83);
						local3231.aClass5_Sub15_Sub2_1.method3680(local89);
						local3231.aClass5_Sub15_Sub2_1.method3651(local97);
						Static479.method7038(local3231);
						return;
					}
					if (arg0 == 5401) {
						anInt8481 -= 2;
						Static25.aShortArray5[anIntArray460[anInt8481]] = (short) Static75.method1102(anIntArray460[anInt8481 + 1]);
						Static259.aClass135_1.method2777();
						Static259.aClass135_1.method2781();
						Static58.aClass230_1.method5292();
						Static212.method3058();
						return;
					}
					if (arg0 == 5405) {
						anInt8481 -= 2;
						local175 = anIntArray460[anInt8481];
						local776 = anIntArray460[anInt8481 + 1];
						if (local175 >= 0 && local175 < 2) {
							Static214.anIntArrayArrayArray4[local175] = new int[local776 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt8481 -= 7;
						local175 = anIntArray460[anInt8481];
						local776 = anIntArray460[anInt8481 + 1] << 1;
						local97 = anIntArray460[anInt8481 + 2];
						local103 = anIntArray460[anInt8481 + 3];
						local2931 = anIntArray460[anInt8481 + 4];
						local3369 = anIntArray460[anInt8481 + 5];
						@Pc(3375) int local3375 = anIntArray460[anInt8481 + 6];
						if (local175 >= 0 && local175 < 2 && Static214.anIntArrayArrayArray4[local175] != null && local776 >= 0 && local776 < Static214.anIntArrayArrayArray4[local175].length) {
							Static214.anIntArrayArrayArray4[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3375 };
							Static214.anIntArrayArrayArray4[local175][local776 + 1] = new int[] { (local2931 >> 14 & 0x3FFF) << 9, local3369 << 2, (local2931 & 0x3FFF) << 9 };
						}
						return;
					}
					if (arg0 == 5407) {
						local175 = Static214.anIntArrayArrayArray4[anIntArray460[--anInt8481]].length >> 1;
						anIntArray460[anInt8481++] = local175;
						return;
					}
					if (arg0 == 5411) {
						if (Static518.aFrame4 != null) {
							Static113.method1830(-1, Static655.aClass5_Sub36_29.aClass2_Sub12_2.method5866(), -1, false);
						}
						if (Static634.aFrame5 != null) {
							Static267.method3773();
							System.exit(0);
							return;
						}
						local83 = Static440.aString77 == null ? Static317.method4824() : Static440.aString77;
						Static408.method5967(false, Static150.aClass202_2, Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836() == 1, local83);
						return;
					}
					if (arg0 == 5419) {
						local83 = "";
						if (Static333.aClass297_4 != null) {
							if (Static333.aClass297_4.anObject15 == null) {
								local83 = Static674.method1634(Static333.aClass297_4.anInt8458);
							} else {
								local83 = (String) Static333.aClass297_4.anObject15;
							}
						}
						aStringArray31[anInt8483++] = local83;
						return;
					}
					if (arg0 == 5420) {
						anIntArray460[anInt8481++] = Static150.aClass202_2.aBoolean384 ? 0 : 1;
						return;
					}
					if (arg0 == 5421) {
						if (Static518.aFrame4 != null) {
							Static113.method1830(-1, Static655.aClass5_Sub36_29.aClass2_Sub12_2.method5866(), -1, false);
						}
						local83 = aStringArray31[--anInt8483];
						local1496 = anIntArray460[--anInt8481] == 1;
						local181 = Static317.method4824() + local83;
						Static408.method5967(local1496, Static150.aClass202_2, Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836() == 1, local181);
						return;
					}
					if (arg0 == 5422) {
						anInt8483 -= 2;
						local83 = aStringArray31[anInt8483];
						local89 = aStringArray31[anInt8483 + 1];
						local97 = anIntArray460[--anInt8481];
						if (local83.length() > 0) {
							if (Static464.aStringArray30 == null) {
								Static464.aStringArray30 = new String[Static10.anIntArray19[Static591.aClass174_7.anInt4124]];
							}
							Static464.aStringArray30[local97] = local83;
						}
						if (local89.length() > 0) {
							if (Static568.aStringArray37 == null) {
								Static568.aStringArray37 = new String[Static10.anIntArray19[Static591.aClass174_7.anInt4124]];
							}
							Static568.aStringArray37[local97] = local89;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray31[--anInt8483]);
						return;
					}
					if (arg0 == 5424) {
						anInt8481 -= 11;
						Static27.anInt372 = anIntArray460[anInt8481];
						Static406.anInt6995 = anIntArray460[anInt8481 + 1];
						Static480.anInt4486 = anIntArray460[anInt8481 + 2];
						Static161.anInt1358 = anIntArray460[anInt8481 + 3];
						Static241.anInt3913 = anIntArray460[anInt8481 + 4];
						Static50.anInt773 = anIntArray460[anInt8481 + 5];
						Static459.anInt7994 = anIntArray460[anInt8481 + 6];
						Static19.anInt265 = anIntArray460[anInt8481 + 7];
						Static78.anInt1275 = anIntArray460[anInt8481 + 8];
						Static229.anInt3713 = anIntArray460[anInt8481 + 9];
						Static112.anInt1987 = anIntArray460[anInt8481 + 10];
						Static471.aClass50_136.method897(Static241.anInt3913);
						Static471.aClass50_136.method897(Static50.anInt773);
						Static471.aClass50_136.method897(Static459.anInt7994);
						Static471.aClass50_136.method897(Static19.anInt265);
						Static471.aClass50_136.method897(Static78.anInt1275);
						Static545.aClass59_33 = null;
						Static303.aClass59_13 = null;
						Static27.aClass59_1 = null;
						Static113.aClass59_3 = null;
						Static145.aClass59_4 = null;
						Static430.aClass59_32 = null;
						Static428.aClass59_23 = null;
						Static471.aClass59_31 = null;
						Static530.aBoolean635 = true;
						return;
					}
					if (arg0 == 5425) {
						Static88.method1383();
						Static530.aBoolean635 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt8481 -= 2;
						Static464.anInt8094 = anIntArray460[anInt8481];
						Static478.anInt8275 = anIntArray460[anInt8481 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt8481 -= 2;
						Static522.anInt8721 = anIntArray460[anInt8481 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt8481 -= 2;
						local175 = anIntArray460[anInt8481];
						local776 = anIntArray460[anInt8481 + 1];
						anIntArray460[anInt8481++] = Static254.method3572(local776, local175) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static16.method8199(false, aStringArray31[--anInt8483], false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static680.method2300("accountcreated", Static285.anApplet5);
							return;
						} catch (@Pc(3917) Throwable local3917) {
							return;
						}
					}
					if (arg0 == 5431) {
						try {
							Static680.method2300("accountcreatestarted", Static285.anApplet5);
							return;
						} catch (@Pc(3928) Throwable local3928) {
							return;
						}
					}
					if (arg0 == 5432) {
						local83 = "";
						if (Static200.aClipboard1 != null) {
							@Pc(3940) Transferable local3940 = Static200.aClipboard1.getContents((Object) null);
							if (local3940 != null) {
								try {
									local83 = (String) local3940.getTransferData(DataFlavor.stringFlavor);
									if (local83 == null) {
										local83 = "";
									}
								} catch (@Pc(3953) Exception local3953) {
								}
							}
						}
						aStringArray31[anInt8483++] = local83;
						return;
					}
					if (arg0 == 5433) {
						Static304.anInt4739 = anIntArray460[--anInt8481];
						return;
					}
					if (arg0 == 5435) {
						anIntArray460[anInt8481++] = Static394.aBoolean491 ? 1 : 0;
						return;
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt8481 -= 4;
						local175 = anIntArray460[anInt8481];
						local776 = anIntArray460[anInt8481 + 1];
						local97 = anIntArray460[anInt8481 + 2];
						local103 = anIntArray460[anInt8481 + 3];
						Static217.method3094((local175 & 0x3FFF) - Static48.anInt750, local103, local776 << 2, (local175 >> 14 & 0x3FFF) - Static454.anInt7910, false, local97);
						return;
					}
					if (arg0 == 5501) {
						anInt8481 -= 4;
						local175 = anIntArray460[anInt8481];
						local776 = anIntArray460[anInt8481 + 1];
						local97 = anIntArray460[anInt8481 + 2];
						local103 = anIntArray460[anInt8481 + 3];
						Static667.method8690(local776 << 2, local103, local97, (local175 >> 14 & 0x3FFF) - Static454.anInt7910, (local175 & 0x3FFF) - Static48.anInt750);
						return;
					}
					if (arg0 == 5502) {
						anInt8481 -= 6;
						local175 = anIntArray460[anInt8481];
						if (local175 >= 2) {
							throw new RuntimeException();
						}
						Static307.anInt5474 = local175;
						local776 = anIntArray460[anInt8481 + 1];
						if (local776 + 1 >= Static214.anIntArrayArrayArray4[Static307.anInt5474].length >> 1) {
							throw new RuntimeException();
						}
						Static162.anInt7889 = local776;
						Static102.anInt1792 = 0;
						Static314.anInt5578 = anIntArray460[anInt8481 + 2];
						Static636.anInt10129 = anIntArray460[anInt8481 + 3];
						local97 = anIntArray460[anInt8481 + 4];
						if (local97 >= 2) {
							throw new RuntimeException();
						}
						Static235.anInt3819 = local97;
						local103 = anIntArray460[anInt8481 + 5];
						if (local103 + 1 >= Static214.anIntArrayArrayArray4[Static235.anInt3819].length >> 1) {
							throw new RuntimeException();
						}
						Static287.anInt4500 = local103;
						Static133.anInt2254 = 3;
						Static67.anInt1033 = -1;
						Static297.anInt571 = -1;
						return;
					}
					if (arg0 == 5503) {
						Static353.method5241();
						return;
					}
					if (arg0 == 5504) {
						anInt8481 -= 2;
						Static484.method7065(anIntArray460[anInt8481 + 1], anIntArray460[anInt8481]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray460[anInt8481++] = (int) Static329.aFloat117 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray460[anInt8481++] = (int) Static495.aFloat161 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static327.method5089();
						return;
					}
					if (arg0 == 5508) {
						Static383.method5627();
						return;
					}
					if (arg0 == 5509) {
						Static602.method8223();
						return;
					}
					if (arg0 == 5510) {
						Static612.method8227();
						return;
					}
					if (arg0 == 5511) {
						local175 = anIntArray460[--anInt8481];
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static454.anInt7910;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static124.anInt2150) {
							local776 = Static124.anInt2150;
						}
						local97 -= Static48.anInt750;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static64.anInt1015) {
							local97 = Static64.anInt1015;
						}
						Static476.anInt8263 = (local776 << 9) + 256;
						Static170.anInt2808 = (local97 << 9) + 256;
						Static133.anInt2254 = 4;
						Static67.anInt1033 = -1;
						Static297.anInt571 = -1;
						return;
					}
					if (arg0 == 5512) {
						Static429.method6470();
						return;
					}
					if (arg0 == 5514) {
						Static663.anInt10392 = anIntArray460[--anInt8481];
						return;
					}
					if (arg0 == 5516) {
						anIntArray460[anInt8481++] = Static663.anInt10392;
						return;
					}
					if (arg0 == 5517) {
						local175 = anIntArray460[--anInt8481];
						if (local175 == -1) {
							local776 = local175 >> 14 & 0x3FFF;
							local97 = local175 & 0x3FFF;
							local776 -= Static454.anInt7910;
							if (local776 < 0) {
								local776 = 0;
							} else if (local776 >= Static124.anInt2150) {
								local776 = Static124.anInt2150;
							}
							local97 -= Static48.anInt750;
							if (local97 < 0) {
								local97 = 0;
							} else if (local97 >= Static64.anInt1015) {
								local97 = Static64.anInt1015;
							}
							Static297.anInt571 = (local776 << 9) + 256;
							Static67.anInt1033 = (local97 << 9) + 256;
							return;
						}
						Static297.anInt571 = -1;
						Static67.anInt1033 = -1;
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt8483 -= 2;
						local83 = aStringArray31[anInt8483];
						local89 = aStringArray31[anInt8483 + 1];
						local97 = anIntArray460[--anInt8481];
						if (local83.length() > 320) {
							return;
						}
						if (Static539.anInt8853 != 3) {
							return;
						}
						if (Static16.anInt9847 == 0 && Static572.anInt9353 == 0) {
							Static154.aString24 = local83;
							Static159.aString25 = local89;
							Static69.anInt1053 = local97;
							Static42.method560(6);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static437.method6550();
						return;
					}
					if (arg0 == 5602) {
						if (Static16.anInt9847 == 0) {
							Static106.anInt1880 = -2;
							Static489.anInt8413 = -2;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt8483--;
						if (Static539.anInt8853 != 3) {
							return;
						}
						if (Static16.anInt9847 == 0 && Static572.anInt9353 == 0) {
							Static153.method2274(aStringArray31[anInt8483]);
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt8483 -= 2;
						anInt8481 -= 2;
						if (Static539.anInt8853 != 3) {
							return;
						}
						if (Static16.anInt9847 == 0 && Static572.anInt9353 == 0) {
							Static643.method8495(anIntArray460[anInt8481], anIntArray460[anInt8481 + 1] == 1, aStringArray31[anInt8483 + 1], aStringArray31[anInt8483]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static572.anInt9353 == 0) {
							Static59.anInt6271 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray460[anInt8481++] = Static489.anInt8413;
						return;
					}
					if (arg0 == 5608) {
						anIntArray460[anInt8481++] = Static216.anInt3460;
						return;
					}
					if (arg0 == 5609) {
						anIntArray460[anInt8481++] = Static59.anInt6271;
						return;
					}
					if (arg0 == 5611) {
						anIntArray460[anInt8481++] = Static155.anInt2603;
						return;
					}
					if (arg0 == 5612) {
						local175 = anIntArray460[--anInt8481];
						if (Static539.anInt8853 != 7) {
							return;
						}
						if (Static16.anInt9847 == 0 && Static572.anInt9353 == 0) {
							if (Static537.aClass240_34 != null) {
								Static537.aClass240_34.method5658();
								Static537.aClass240_34 = null;
							}
							Static69.anInt1053 = local175;
							Static42.method560(9);
							return;
						}
						return;
					}
					if (arg0 == 5613) {
						anIntArray460[anInt8481++] = Static489.anInt8413;
						return;
					}
					if (arg0 == 5615) {
						anInt8483 -= 2;
						local83 = aStringArray31[anInt8483];
						local89 = aStringArray31[anInt8483 + 1];
						if (local83.length() > 320) {
							return;
						}
						if (Static539.anInt8853 != 3) {
							return;
						}
						if (Static16.anInt9847 == 0 && Static572.anInt9353 == 0) {
							if (Static537.aClass240_34 != null) {
								Static537.aClass240_34.method5658();
								Static537.aClass240_34 = null;
							}
							Static154.aString24 = local83;
							Static159.aString25 = local89;
							Static42.method560(5);
							return;
						}
						return;
					}
					if (arg0 == 5616) {
						Static162.method6698(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray460[anInt8481++] = Static106.anInt1880;
						return;
					}
					if (arg0 == 5618) {
						anInt8481--;
						return;
					}
					if (arg0 == 5619) {
						anInt8481--;
						return;
					}
					if (arg0 == 5620) {
						anIntArray460[anInt8481++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt8483 -= 2;
						anInt8481 -= 2;
						return;
					}
					if (arg0 == 5622) {
						return;
					}
					if (arg0 == 5623) {
						if (Static328.aString57 != null) {
							anIntArray460[anInt8481++] = 1;
							return;
						}
						anIntArray460[anInt8481++] = 0;
						return;
					}
					if (arg0 == 5624) {
						anIntArray460[anInt8481++] = (int) (Static55.aLong47 >> 32);
						anIntArray460[anInt8481++] = (int) (Static55.aLong47 & 0xFFFFFFFFFFFFFFFFL);
						return;
					}
					if (arg0 == 5625) {
						anIntArray460[anInt8481++] = Static418.aBoolean512 ? 1 : 0;
						return;
					}
					if (arg0 == 5626) {
						Static418.aBoolean512 = true;
						Static493.method7182();
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local175 = anIntArray460[--anInt8481];
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub7_1, local175);
						Static12.method8633();
						Static185.method2703();
						Static97.aBoolean118 = false;
						return;
					}
					@Pc(4900) boolean local4900;
					if (arg0 == 6002) {
						local4900 = anIntArray460[--anInt8481] == 1;
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub19_2, local4900 ? 1 : 0);
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub19_1, local4900 ? 1 : 0);
						Static12.method8633();
						Static494.method7191();
						Static185.method2703();
						Static97.aBoolean118 = false;
						return;
					}
					if (arg0 == 6003) {
						local4900 = anIntArray460[--anInt8481] == 1;
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub21_2, local4900 ? 2 : 1);
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub21_1, local4900 ? 2 : 1);
						Static494.method7191();
						Static185.method2703();
						Static97.aBoolean118 = false;
						return;
					}
					if (arg0 == 6005) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub3_1, anIntArray460[--anInt8481] == 1 ? 1 : 0);
						Static12.method8633();
						Static185.method2703();
						Static97.aBoolean118 = false;
						return;
					}
					if (arg0 == 6007) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub26_1, anIntArray460[--anInt8481]);
						Static185.method2703();
						Static97.aBoolean118 = false;
						return;
					}
					if (arg0 == 6008) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub20_1, anIntArray460[--anInt8481] == 1 ? 1 : 0);
						Static185.method2703();
						Static97.aBoolean118 = false;
						return;
					}
					if (arg0 == 6010) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub15_1, anIntArray460[--anInt8481] == 1 ? 1 : 0);
						Static185.method2703();
						Static97.aBoolean118 = false;
						return;
					}
					if (arg0 == 6011) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub5_1, anIntArray460[--anInt8481]);
						Static12.method8633();
						Static185.method2703();
						Static97.aBoolean118 = false;
						return;
					}
					if (arg0 == 6012) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub16_1, anIntArray460[--anInt8481] == 1 ? 1 : 0);
						Static523.method8754();
						Static3.method39();
						Static185.method2703();
						Static97.aBoolean118 = false;
						return;
					}
					if (arg0 == 6014) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub8_1, anIntArray460[--anInt8481] == 1 ? 2 : 0);
						Static12.method8633();
						Static185.method2703();
						Static97.aBoolean118 = false;
						return;
					}
					if (arg0 == 6015) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub24_1, anIntArray460[--anInt8481] == 1 ? 1 : 0);
						Static12.method8633();
						Static185.method2703();
						Static97.aBoolean118 = false;
						return;
					}
					if (arg0 == 6016) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub28_1, anIntArray460[--anInt8481]);
						Static75.method1101(false, Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836());
						Static185.method2703();
						return;
					}
					if (arg0 == 6017) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub2_1, anIntArray460[--anInt8481] == 1 ? 1 : 0);
						Static221.method3128();
						Static185.method2703();
						Static97.aBoolean118 = false;
						return;
					}
					if (arg0 == 6018) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub6_5, anIntArray460[--anInt8481]);
						Static185.method2703();
						Static97.aBoolean118 = false;
						return;
					}
					if (arg0 == 6019) {
						local175 = anIntArray460[--anInt8481];
						local776 = Static655.aClass5_Sub36_29.aClass2_Sub6_3.method3364();
						if (local175 != local776) {
							if (Static427.method8766(Static539.anInt8853)) {
								if (local776 == 0 && Static367.anInt6416 != -1) {
									Static550.method7596(Static449.aClass50_129, local175, Static367.anInt6416);
									Static516.method3871();
									Static26.aBoolean13 = false;
								} else if (local175 == 0) {
									Static191.method2755();
									Static26.aBoolean13 = false;
								} else {
									Static639.method8465(local175);
								}
							}
							Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub6_3, local175);
							Static185.method2703();
							Static97.aBoolean118 = false;
						}
						return;
					}
					if (arg0 == 6020) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub6_1, anIntArray460[--anInt8481]);
						Static185.method2703();
						Static97.aBoolean118 = false;
						return;
					}
					if (arg0 == 6021) {
						local175 = Static655.aClass5_Sub36_29.aClass2_Sub21_2.method7492();
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub21_1, anIntArray460[--anInt8481] == 1 ? 0 : local175);
						Static494.method7191();
						return;
					}
					if (arg0 == 6023) {
						local175 = anIntArray460[--anInt8481];
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub17_1, local175);
						Static185.method2703();
						Static97.aBoolean118 = false;
						return;
					}
					if (arg0 == 6024) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub28_2, anIntArray460[--anInt8481]);
						Static185.method2703();
						return;
					}
					if (arg0 == 6025) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub11_1, anIntArray460[--anInt8481]);
						Static185.method2703();
						Static97.aBoolean118 = false;
						return;
					}
					if (arg0 == 6027) {
						local175 = anIntArray460[--anInt8481];
						if (local175 < 0 || local175 > 1) {
							local175 = 0;
						}
						Static178.method2617(local175 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub18_1, anIntArray460[--anInt8481] == 0 ? 0 : 1);
						Static185.method2703();
						return;
					}
					if (arg0 == 6029) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub26_1, anIntArray460[--anInt8481]);
						Static185.method2703();
						return;
					}
					if (arg0 == 6030) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub4_1, anIntArray460[--anInt8481] == 0 ? 0 : 1);
						Static185.method2703();
						Static12.method8633();
						return;
					}
					if (arg0 == 6031) {
						local175 = anIntArray460[--anInt8481];
						if (local175 < 0 || local175 > 5) {
							local175 = 2;
						}
						Static75.method1101(false, local175);
						return;
					}
					if (arg0 == 6032) {
						anInt8481 -= 2;
						local175 = anIntArray460[anInt8481];
						local1496 = anIntArray460[anInt8481 + 1] == 1;
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub23_2, local175);
						if (!local1496) {
							Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub27_1, 0);
						}
						Static185.method2703();
						Static97.aBoolean118 = false;
						return;
					}
					if (arg0 == 6033) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub1_1, anIntArray460[--anInt8481]);
						Static185.method2703();
						return;
					}
					if (arg0 == 6034) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub10_1, anIntArray460[--anInt8481] == 1 ? 1 : 0);
						Static185.method2703();
						Static523.method8754();
						Static97.aBoolean118 = false;
						return;
					}
					if (arg0 == 6035) {
						local175 = Static655.aClass5_Sub36_29.aClass2_Sub19_2.method7172();
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub19_1, anIntArray460[--anInt8481] == 1 ? 1 : local175);
						Static12.method8633();
						Static494.method7191();
						return;
					}
					if (arg0 == 6036) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub14_1, anIntArray460[--anInt8481]);
						Static185.method2703();
						Static446.aBoolean570 = true;
						return;
					}
					if (arg0 == 6037) {
						Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub6_2, anIntArray460[--anInt8481]);
						Static185.method2703();
						Static97.aBoolean118 = false;
						return;
					}
					if (arg0 == 6038) {
						local175 = anIntArray460[--anInt8481];
						local776 = Static655.aClass5_Sub36_29.aClass2_Sub6_4.method3364();
						if (local175 != local776 && Static367.anInt6416 == Static377.anInt6578) {
							if (!Static427.method8766(Static539.anInt8853)) {
								if (local776 == 0) {
									Static550.method7596(Static449.aClass50_129, local175, Static367.anInt6416);
									Static516.method3871();
									Static26.aBoolean13 = false;
								} else if (local175 == 0) {
									Static191.method2755();
									Static26.aBoolean13 = false;
								} else {
									Static639.method8465(local175);
								}
							}
							Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub6_4, local175);
							Static185.method2703();
							Static97.aBoolean118 = false;
						}
						return;
					}
					if (arg0 == 6039) {
						local175 = anIntArray460[--anInt8481];
						if (local175 > 255 || local175 < 0) {
							local175 = 0;
						}
						if (local175 != Static655.aClass5_Sub36_29.aClass2_Sub29_1.method8772()) {
							Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub29_1, local175);
							Static185.method2703();
							Static97.aBoolean118 = false;
						}
						return;
					}
					if (arg0 == 6040) {
						local175 = anIntArray460[--anInt8481];
						if (local175 != Static655.aClass5_Sub36_29.aClass2_Sub22_1.method7578()) {
							Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub22_1, local175);
							Static185.method2703();
							Static97.aBoolean118 = false;
							Static90.method1397();
						}
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub7_1.method3489();
						return;
					}
					if (arg0 == 6102) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub19_2.method7172() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub21_2.method7492() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub3_1.method2012() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub26_1.method8525();
						return;
					}
					if (arg0 == 6108) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub20_1.method7359() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub15_1.method6886() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub5_1.method3269();
						return;
					}
					if (arg0 == 6112) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub16_1.method6973() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub8_1.method3768() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub24_1.method7984() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub28_1.method8721();
						return;
					}
					if (arg0 == 6117) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub2_1.method969() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub6_5.method3364();
						return;
					}
					if (arg0 == 6119) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub6_3.method3364();
						return;
					}
					if (arg0 == 6120) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub6_1.method3364();
						return;
					}
					if (arg0 == 6123) {
						anIntArray460[anInt8481++] = Static134.method1728();
						return;
					}
					if (arg0 == 6124) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub28_2.method8721();
						return;
					}
					if (arg0 == 6125) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub11_1.method5016();
						return;
					}
					if (arg0 == 6127) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub13_1.method6692() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub18_1.method7160() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub26_1.method8525();
						return;
					}
					if (arg0 == 6130) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub4_1.method2242() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836();
						return;
					}
					if (arg0 == 6132) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub23_2.method7836();
						return;
					}
					if (arg0 == 6133) {
						anIntArray460[anInt8481++] = Static150.aClass202_2.aBoolean384 && !Static150.aClass202_2.aBoolean386 ? 1 : 0;
						return;
					}
					if (arg0 == 6135) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub1_1.method37();
						return;
					}
					if (arg0 == 6136) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub10_1.method3819() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6138) {
						anIntArray460[anInt8481++] = Static595.method8078(Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836(), 200);
						return;
					}
					if (arg0 == 6139) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub14_1.method6843();
						return;
					}
					if (arg0 == 6142) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub6_2.method3364();
						return;
					}
					if (arg0 == 6143) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub6_4.method3364();
						return;
					}
					if (arg0 == 6144) {
						anIntArray460[anInt8481++] = Static445.aBoolean569 ? 1 : 0;
						return;
					}
					if (arg0 == 6145) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub29_1.method8772();
						return;
					}
					if (arg0 == 6146) {
						anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub22_1.method7578();
						return;
					}
					if (arg0 == 6147) {
						anIntArray460[anInt8481++] = Static87.aClass5_Sub30_1.anInt4369 < 512 || Static445.aBoolean569 || Static239.aBoolean271 ? 1 : 0;
						return;
					}
					if (arg0 == 6148) {
						anIntArray460[anInt8481++] = Static44.aBoolean31 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt8481 -= 2;
						Static672.aShort117 = (short) anIntArray460[anInt8481];
						if (Static672.aShort117 <= 0) {
							Static672.aShort117 = 256;
						}
						Static88.aShort25 = (short) anIntArray460[anInt8481 + 1];
						if (Static88.aShort25 <= 0) {
							Static88.aShort25 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt8481 -= 2;
						Static346.aShort85 = (short) anIntArray460[anInt8481];
						if (Static346.aShort85 <= 0) {
							Static346.aShort85 = 256;
						}
						Static242.aShort113 = (short) anIntArray460[anInt8481 + 1];
						if (Static242.aShort113 <= 0) {
							Static242.aShort113 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt8481 -= 4;
						Static305.aShort67 = (short) anIntArray460[anInt8481];
						if (Static305.aShort67 <= 0) {
							Static305.aShort67 = 1;
						}
						Static247.aShort50 = (short) anIntArray460[anInt8481 + 1];
						if (Static247.aShort50 <= 0) {
							Static247.aShort50 = 32767;
						} else if (Static247.aShort50 < Static305.aShort67) {
							Static247.aShort50 = Static305.aShort67;
						}
						Static284.aShort55 = (short) anIntArray460[anInt8481 + 2];
						if (Static284.aShort55 <= 0) {
							Static284.aShort55 = 1;
						}
						Static317.aShort76 = (short) anIntArray460[anInt8481 + 3];
						if (Static317.aShort76 <= 0) {
							Static317.aShort76 = 32767;
							return;
						}
						if (Static317.aShort76 < Static284.aShort55) {
							Static317.aShort76 = Static284.aShort55;
						}
						return;
					}
					if (arg0 == 6203) {
						Static464.method6869(Static463.aClass394_6.anInt10532, 0, 0, Static463.aClass394_6.anInt10536, false);
						anIntArray460[anInt8481++] = Static452.anInt7902;
						anIntArray460[anInt8481++] = Static398.anInt6905;
						return;
					}
					if (arg0 == 6204) {
						anIntArray460[anInt8481++] = Static346.aShort85;
						anIntArray460[anInt8481++] = Static242.aShort113;
						return;
					}
					if (arg0 == 6205) {
						anIntArray460[anInt8481++] = Static672.aShort117;
						anIntArray460[anInt8481++] = Static88.aShort25;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray460[anInt8481++] = (int) (Static124.method1947() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray460[anInt8481++] = (int) (Static124.method1947() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt8481 -= 3;
						local175 = anIntArray460[anInt8481];
						local776 = anIntArray460[anInt8481 + 1];
						local97 = anIntArray460[anInt8481 + 2];
						@Pc(6709) long local6709 = Static548.method7566(local97, local175, local776);
						local3369 = Static245.method3496(local6709);
						if (local97 < 1970) {
							local3369--;
						}
						anIntArray460[anInt8481++] = local3369;
						return;
					}
					if (arg0 == 6303) {
						anIntArray460[anInt8481++] = Static316.method6936(Static124.method1947());
						return;
					}
					if (arg0 == 6304) {
						local175 = anIntArray460[--anInt8481];
						local1496 = true;
						if (local175 < 0) {
							local1496 = (local175 + 1) % 4 == 0;
						} else if (local175 < 1582) {
							local1496 = local175 % 4 == 0;
						} else if (local175 % 4 != 0) {
							local1496 = false;
						} else if (local175 % 100 != 0) {
							local1496 = true;
						} else if (local175 % 400 != 0) {
							local1496 = false;
						}
						anIntArray460[anInt8481++] = local1496 ? 1 : 0;
						return;
					}
					if (arg0 == 6305) {
						local175 = anIntArray460[--anInt8481];
						@Pc(6827) int[] local6827 = Static143.method2155(local175);
						Static685.method8329(local6827, 0, anIntArray460, anInt8481, 3);
						anInt8481 += 3;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray460[anInt8481++] = Static564.method7728() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray460[anInt8481++] = Static522.method7358() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static539.anInt8853 == 7 && Static16.anInt9847 == 0 && Static572.anInt9353 == 0) {
							if (Static156.aBoolean185) {
								anIntArray460[anInt8481++] = 0;
								return;
							}
							if (Static423.aLong224 > Static124.method1947() - 1000L) {
								anIntArray460[anInt8481++] = 1;
								return;
							}
							Static156.aBoolean185 = true;
							local52 = Static455.method6717(Static496.aClass187_77, Static16.aClass332_8);
							local52.aClass5_Sub15_Sub2_1.method3679(Static479.anInt8280);
							Static479.method7038(local52);
							anIntArray460[anInt8481++] = 0;
							return;
						}
						anIntArray460[anInt8481++] = 1;
						return;
					}
					@Pc(6987) Class17 local6987;
					@Pc(6954) Class160_Sub1 local6954;
					if (arg0 == 6501) {
						local6954 = Static237.method3382();
						if (local6954 != null) {
							anIntArray460[anInt8481++] = local6954.anInt3895;
							anIntArray460[anInt8481++] = local6954.anInt3889;
							aStringArray31[anInt8483++] = local6954.aString33;
							local6987 = local6954.method3444();
							anIntArray460[anInt8481++] = local6987.anInt266;
							aStringArray31[anInt8483++] = local6987.aString2;
							anIntArray460[anInt8481++] = local6954.anInt3879;
							anIntArray460[anInt8481++] = local6954.anInt3897;
							aStringArray31[anInt8483++] = local6954.aString34;
							return;
						}
						anIntArray460[anInt8481++] = -1;
						anIntArray460[anInt8481++] = 0;
						aStringArray31[anInt8483++] = "";
						anIntArray460[anInt8481++] = 0;
						aStringArray31[anInt8483++] = "";
						anIntArray460[anInt8481++] = 0;
						anIntArray460[anInt8481++] = 0;
						aStringArray31[anInt8483++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6954 = Static140.method2103();
						if (local6954 != null) {
							anIntArray460[anInt8481++] = local6954.anInt3895;
							anIntArray460[anInt8481++] = local6954.anInt3889;
							aStringArray31[anInt8483++] = local6954.aString33;
							local6987 = local6954.method3444();
							anIntArray460[anInt8481++] = local6987.anInt266;
							aStringArray31[anInt8483++] = local6987.aString2;
							anIntArray460[anInt8481++] = local6954.anInt3879;
							anIntArray460[anInt8481++] = local6954.anInt3897;
							aStringArray31[anInt8483++] = local6954.aString34;
							return;
						}
						anIntArray460[anInt8481++] = -1;
						anIntArray460[anInt8481++] = 0;
						aStringArray31[anInt8483++] = "";
						anIntArray460[anInt8481++] = 0;
						aStringArray31[anInt8483++] = "";
						anIntArray460[anInt8481++] = 0;
						anIntArray460[anInt8481++] = 0;
						aStringArray31[anInt8483++] = "";
						return;
					}
					if (arg0 == 6503) {
						local175 = anIntArray460[--anInt8481];
						local89 = aStringArray31[--anInt8483];
						if (Static539.anInt8853 == 7 && Static16.anInt9847 == 0 && Static572.anInt9353 == 0) {
							anIntArray460[anInt8481++] = Static66.method953(local175, local89) ? 1 : 0;
							return;
						}
						anIntArray460[anInt8481++] = 0;
						return;
					}
					if (arg0 == 6506) {
						local175 = anIntArray460[--anInt8481];
						@Pc(7314) Class160_Sub1 local7314 = Static401.method5878(local175);
						if (local7314 != null) {
							anIntArray460[anInt8481++] = local7314.anInt3889;
							aStringArray31[anInt8483++] = local7314.aString33;
							@Pc(7338) Class17 local7338 = local7314.method3444();
							anIntArray460[anInt8481++] = local7338.anInt266;
							aStringArray31[anInt8483++] = local7338.aString2;
							anIntArray460[anInt8481++] = local7314.anInt3879;
							anIntArray460[anInt8481++] = local7314.anInt3897;
							aStringArray31[anInt8483++] = local7314.aString34;
							return;
						}
						anIntArray460[anInt8481++] = -1;
						aStringArray31[anInt8483++] = "";
						anIntArray460[anInt8481++] = 0;
						aStringArray31[anInt8483++] = "";
						anIntArray460[anInt8481++] = 0;
						anIntArray460[anInt8481++] = 0;
						aStringArray31[anInt8483++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt8481 -= 4;
						local175 = anIntArray460[anInt8481];
						local1496 = anIntArray460[anInt8481 + 1] == 1;
						local97 = anIntArray460[anInt8481 + 2];
						local2205 = anIntArray460[anInt8481 + 3] == 1;
						Static431.method6482(local97, local1496, local175, local2205);
						return;
					}
					if (arg0 == 6508) {
						Static633.method8422();
						return;
					}
					if (arg0 == 6509) {
						if (Static539.anInt8853 != 7) {
							return;
						}
						Static363.aBoolean460 = anIntArray460[--anInt8481] == 1;
						return;
					}
					if (arg0 == 6510) {
						anIntArray460[anInt8481++] = Static276.anInt4337;
						return;
					}
				} else if (arg0 >= 6700) {
					if (arg0 < 6800 && Static541.aClass103_5 == Static196.aClass103_2) {
						if (arg0 == 6700) {
							local175 = Static131.aClass335_15.method7767();
							if (Static131.anInt2222 != -1) {
								local175++;
							}
							anIntArray460[anInt8481++] = local175;
							return;
						}
						if (arg0 == 6701) {
							local175 = anIntArray460[--anInt8481];
							if (Static131.anInt2222 != -1) {
								if (local175 == 0) {
									anIntArray460[anInt8481++] = Static131.anInt2222;
									return;
								}
								local175--;
							}
							@Pc(7586) Class5_Sub4 local7586 = (Class5_Sub4) Static131.aClass335_15.method7768();
							while (local175-- > 0) {
								local7586 = (Class5_Sub4) Static131.aClass335_15.method7777();
							}
							anIntArray460[anInt8481++] = local7586.anInt257;
							return;
						}
						if (arg0 == 6702) {
							local175 = anIntArray460[--anInt8481];
							if (Static227.aClass394ArrayArray2[local175] == null) {
								aStringArray31[anInt8483++] = "";
								return;
							}
							local89 = Static227.aClass394ArrayArray2[local175][0].aString117;
							if (local89 == null) {
								aStringArray31[anInt8483++] = "";
								return;
							}
							aStringArray31[anInt8483++] = local89.substring(0, local89.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local175 = anIntArray460[--anInt8481];
							if (Static227.aClass394ArrayArray2[local175] == null) {
								anIntArray460[anInt8481++] = 0;
								return;
							}
							anIntArray460[anInt8481++] = Static227.aClass394ArrayArray2[local175].length;
							return;
						}
						if (arg0 == 6704) {
							anInt8481 -= 2;
							local175 = anIntArray460[anInt8481];
							local776 = anIntArray460[anInt8481 + 1];
							if (Static227.aClass394ArrayArray2[local175] == null) {
								aStringArray31[anInt8483++] = "";
								return;
							}
							local181 = Static227.aClass394ArrayArray2[local175][local776].aString117;
							if (local181 == null) {
								aStringArray31[anInt8483++] = "";
								return;
							}
							aStringArray31[anInt8483++] = local181;
							return;
						}
						if (arg0 == 6705) {
							anInt8481 -= 2;
							local175 = anIntArray460[anInt8481];
							local776 = anIntArray460[anInt8481 + 1];
							if (Static227.aClass394ArrayArray2[local175] == null) {
								anIntArray460[anInt8481++] = 0;
								return;
							}
							anIntArray460[anInt8481++] = Static227.aClass394ArrayArray2[local175][local776].anInt10501;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							anInt8481 -= 3;
							local175 = anIntArray460[anInt8481];
							local776 = anIntArray460[anInt8481 + 1];
							local97 = anIntArray460[anInt8481 + 2];
							Static633.method8421(local97, 1, "", local175 << 16 | local776);
							return;
						}
						if (arg0 == 6708) {
							anInt8481 -= 3;
							local175 = anIntArray460[anInt8481];
							local776 = anIntArray460[anInt8481 + 1];
							local97 = anIntArray460[anInt8481 + 2];
							Static633.method8421(local97, 2, "", local175 << 16 | local776);
							return;
						}
						if (arg0 == 6709) {
							anInt8481 -= 3;
							local175 = anIntArray460[anInt8481];
							local776 = anIntArray460[anInt8481 + 1];
							local97 = anIntArray460[anInt8481 + 2];
							Static633.method8421(local97, 3, "", local175 << 16 | local776);
							return;
						}
						if (arg0 == 6710) {
							anInt8481 -= 3;
							local175 = anIntArray460[anInt8481];
							local776 = anIntArray460[anInt8481 + 1];
							local97 = anIntArray460[anInt8481 + 2];
							Static633.method8421(local97, 4, "", local175 << 16 | local776);
							return;
						}
						if (arg0 == 6711) {
							anInt8481 -= 3;
							local175 = anIntArray460[anInt8481];
							local776 = anIntArray460[anInt8481 + 1];
							local97 = anIntArray460[anInt8481 + 2];
							Static633.method8421(local97, 5, "", local175 << 16 | local776);
							return;
						}
						if (arg0 == 6712) {
							anInt8481 -= 3;
							local175 = anIntArray460[anInt8481];
							local776 = anIntArray460[anInt8481 + 1];
							local97 = anIntArray460[anInt8481 + 2];
							Static633.method8421(local97, 6, "", local175 << 16 | local776);
							return;
						}
						if (arg0 == 6713) {
							anInt8481 -= 3;
							local175 = anIntArray460[anInt8481];
							local776 = anIntArray460[anInt8481 + 1];
							local97 = anIntArray460[anInt8481 + 2];
							Static633.method8421(local97, 7, "", local175 << 16 | local776);
							return;
						}
						if (arg0 == 6714) {
							anInt8481 -= 3;
							local175 = anIntArray460[anInt8481];
							local776 = anIntArray460[anInt8481 + 1];
							local97 = anIntArray460[anInt8481 + 2];
							Static633.method8421(local97, 8, "", local175 << 16 | local776);
							return;
						}
						if (arg0 == 6715) {
							anInt8481 -= 3;
							local175 = anIntArray460[anInt8481];
							local776 = anIntArray460[anInt8481 + 1];
							local97 = anIntArray460[anInt8481 + 2];
							Static633.method8421(local97, 9, "", local175 << 16 | local776);
							return;
						}
						if (arg0 == 6716) {
							anInt8481 -= 3;
							local175 = anIntArray460[anInt8481];
							local776 = anIntArray460[anInt8481 + 1];
							local97 = anIntArray460[anInt8481 + 2];
							Static633.method8421(local97, 10, "", local175 << 16 | local776);
							return;
						}
						if (arg0 == 6717) {
							anInt8481 -= 3;
							local175 = anIntArray460[anInt8481];
							local776 = anIntArray460[anInt8481 + 1];
							local97 = anIntArray460[anInt8481 + 2];
							@Pc(8174) Class394 local8174 = Static622.method7590(local97, local175 << 16 | local776);
							Static355.method5247();
							@Pc(8179) Class5_Sub42 local8179 = Static81.method1268(local8174);
							Static63.method936(local8174, local8179.anInt7814, local8179.method6629());
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(8207) Class262 local8207;
						if (arg0 == 6800) {
							local175 = anIntArray460[--anInt8481];
							local8207 = Static299.aClass218_1.method5163(local175);
							if (local8207.aString72 == null) {
								aStringArray31[anInt8483++] = "";
								return;
							}
							aStringArray31[anInt8483++] = local8207.aString72;
							return;
						}
						if (arg0 == 6801) {
							local175 = anIntArray460[--anInt8481];
							local8207 = Static299.aClass218_1.method5163(local175);
							anIntArray460[anInt8481++] = local8207.anInt7628;
							return;
						}
						if (arg0 == 6802) {
							local175 = anIntArray460[--anInt8481];
							local8207 = Static299.aClass218_1.method5163(local175);
							anIntArray460[anInt8481++] = local8207.anInt7623;
							return;
						}
						if (arg0 == 6803) {
							local175 = anIntArray460[--anInt8481];
							local8207 = Static299.aClass218_1.method5163(local175);
							anIntArray460[anInt8481++] = local8207.anInt7615;
							return;
						}
						if (arg0 == 6804) {
							anInt8481 -= 2;
							local175 = anIntArray460[anInt8481];
							local776 = anIntArray460[anInt8481 + 1];
							@Pc(8329) Class53 local8329 = Static522.aClass282_2.method6901(local776);
							if (local8329.method956()) {
								aStringArray31[anInt8483++] = Static299.aClass218_1.method5163(local175).method6486(local8329.aString9, local776);
								return;
							}
							anIntArray460[anInt8481++] = Static299.aClass218_1.method5163(local175).method6491(local8329.anInt1028, local776);
							return;
						}
					} else if (arg0 < 7000) {
						if (arg0 == 6900) {
							anIntArray460[anInt8481++] = Static533.aBoolean637 && !Static236.aBoolean266 ? 1 : 0;
							return;
						}
						if (arg0 == 6901) {
							anIntArray460[anInt8481++] = (int) (Static389.aLong43 / 60000L);
							anIntArray460[anInt8481++] = (int) ((Static389.aLong43 - Static124.method1947() - Static656.aLong322) / 60000L);
							anIntArray460[anInt8481++] = Static668.aBoolean768 ? 1 : 0;
							return;
						}
						if (arg0 == 6902) {
							anIntArray460[anInt8481++] = Static458.anInt7967;
							return;
						}
						if (arg0 == 6903) {
							anIntArray460[anInt8481++] = Static547.anInt8952;
							return;
						}
						if (arg0 == 6904) {
							anIntArray460[anInt8481++] = Static136.anInt2270;
							return;
						}
						if (arg0 == 6905) {
							local83 = "";
							if (Static333.aClass297_4 != null) {
								if (Static333.aClass297_4.anObject15 == null) {
									local83 = Static674.method1634(Static333.aClass297_4.anInt8458);
								} else {
									local83 = (String) Static333.aClass297_4.anObject15;
								}
							}
							aStringArray31[anInt8483++] = local83;
							return;
						}
						if (arg0 == 6906) {
							anIntArray460[anInt8481++] = Static233.anInt3759;
							return;
						}
						if (arg0 == 6907) {
							anIntArray460[anInt8481++] = Static415.anInt7080;
							return;
						}
						if (arg0 == 6908) {
							anIntArray460[anInt8481++] = Static399.anInt6907;
							return;
						}
						if (arg0 == 6909) {
							anIntArray460[anInt8481++] = Static317.aBoolean397 ? 1 : 0;
							return;
						}
						if (arg0 == 6910) {
							anIntArray460[anInt8481++] = Static630.anInt10061;
							return;
						}
						if (arg0 == 6911) {
							anIntArray460[anInt8481++] = Static316.anInt8166;
							return;
						}
						if (arg0 == 6912) {
							anIntArray460[anInt8481++] = Static614.anInt9895;
							return;
						}
						if (arg0 == 6913) {
							anIntArray460[anInt8481++] = Static204.anInt3269;
							return;
						}
					} else if (arg0 < 7100) {
						if (arg0 == 7000) {
							local175 = Static448.method6653();
							anIntArray460[anInt8481++] = Static174.anInt2871 = Static655.aClass5_Sub36_29.aClass2_Sub23_1.method7836();
							anIntArray460[anInt8481++] = local175;
							Static12.method8633();
							Static185.method2703();
							Static97.aBoolean118 = false;
							return;
						}
						if (arg0 == 7001) {
							Static544.method7520();
							Static12.method8633();
							Static185.method2703();
							Static97.aBoolean118 = false;
							return;
						}
						if (arg0 == 7002) {
							Static325.method5073();
							Static12.method8633();
							Static185.method2703();
							Static97.aBoolean118 = false;
							return;
						}
						if (arg0 == 7003) {
							Static204.method2850();
							Static12.method8633();
							Static185.method2703();
							Static97.aBoolean118 = false;
							return;
						}
						if (arg0 == 7004) {
							Static46.method621();
							Static12.method8633();
							Static185.method2703();
							Static97.aBoolean118 = false;
							return;
						}
						if (arg0 == 7005) {
							Static655.aClass5_Sub36_29.method5344(Static655.aClass5_Sub36_29.aClass2_Sub27_1, 0);
							Static185.method2703();
							Static97.aBoolean118 = false;
							return;
						}
						if (arg0 == 7006) {
							if (Static174.anInt2871 == 2) {
								Static661.aBoolean760 = true;
								return;
							}
							if (Static174.anInt2871 == 1) {
								Static8.aBoolean2 = true;
								return;
							}
							if (Static174.anInt2871 == 3) {
								Static288.aBoolean300 = true;
							}
							return;
						}
						if (arg0 == 7007) {
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub27_1.method8560();
							return;
						}
					} else if (arg0 < 7200) {
						if (arg0 == 7100) {
							anInt8481 -= 2;
							local175 = anIntArray460[anInt8481];
							local776 = anIntArray460[anInt8481 + 1];
							if (local175 != -1) {
								if (local776 > 255) {
									local776 = 255;
								} else if (local776 < 0) {
									local776 = 0;
								}
								Static95.method1611(false, local175, local776);
							}
							return;
						}
						if (arg0 == 7101) {
							local175 = anIntArray460[--anInt8481];
							if (local175 != -1) {
								Static314.method4802(local175);
							}
							return;
						}
						if (arg0 == 7102) {
							local175 = anIntArray460[--anInt8481];
							if (local175 != -1) {
								Static595.method8077(local175);
							}
							return;
						}
						if (arg0 == 7103) {
							anIntArray460[anInt8481++] = Static371.method5449("jagtheora") ? 1 : 0;
							return;
						}
					} else if (arg0 < 7300) {
						if (arg0 == 7201) {
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub3_1.method2010() ? 1 : 0;
							return;
						}
						if (arg0 == 7202) {
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub15_1.method6887() ? 1 : 0;
							return;
						}
						if (arg0 == 7203) {
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub5_1.method3270() ? 1 : 0;
							return;
						}
						if (arg0 == 7204) {
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub8_1.method3765() ? 1 : 0;
							return;
						}
						if (arg0 == 7205) {
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub28_2.method8719() && Static563.aClass143_13.method6231() ? 1 : 0;
							return;
						}
						if (arg0 == 7206) {
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub17_1.method7019() ? 1 : 0;
							return;
						}
						if (arg0 == 7207) {
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub11_1.method5017() ? 1 : 0;
							return;
						}
						if (arg0 == 7208) {
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub13_1.method6693() && Static563.aClass143_13.method6260() ? 1 : 0;
							return;
						}
						if (arg0 == 7209) {
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub4_1.method2245() ? 1 : 0;
							return;
						}
						if (arg0 == 7210) {
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub10_1.method3818() ? 1 : 0;
							return;
						}
						if (arg0 == 7211) {
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub14_1.method6841() ? 1 : 0;
							return;
						}
						if (arg0 == 7212) {
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub24_1.method7987() ? 1 : 0;
							return;
						}
						if (arg0 == 7213) {
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub22_1.method7577() ? 1 : 0;
							return;
						}
						if (arg0 == 7214) {
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub23_2.method7835() ? 1 : 0;
							return;
						}
					} else if (arg0 < 7400) {
						if (arg0 == 7301) {
							local175 = anIntArray460[--anInt8481];
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub3_1.method8763(local175);
							return;
						}
						if (arg0 == 7302) {
							local175 = anIntArray460[--anInt8481];
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub15_1.method8763(local175);
							return;
						}
						if (arg0 == 7303) {
							local175 = anIntArray460[--anInt8481];
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub5_1.method8763(local175);
							return;
						}
						if (arg0 == 7304) {
							local175 = anIntArray460[--anInt8481];
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub8_1.method8763(local175);
							return;
						}
						if (arg0 == 7305) {
							local175 = anIntArray460[--anInt8481];
							if (!Static563.aClass143_13.method6231()) {
								anIntArray460[anInt8481++] = 3;
								return;
							}
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub28_2.method8763(local175);
							return;
						}
						if (arg0 == 7306) {
							local175 = anIntArray460[--anInt8481];
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub17_1.method8763(local175);
							return;
						}
						if (arg0 == 7307) {
							local175 = anIntArray460[--anInt8481];
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub11_1.method8763(local175);
							return;
						}
						if (arg0 == 7308) {
							local175 = anIntArray460[--anInt8481];
							if (!Static563.aClass143_13.method6260()) {
								anIntArray460[anInt8481++] = 3;
								return;
							}
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub13_1.method8763(local175);
							return;
						}
						if (arg0 == 7309) {
							local175 = anIntArray460[--anInt8481];
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub4_1.method8763(local175);
							return;
						}
						if (arg0 == 7310) {
							local175 = anIntArray460[--anInt8481];
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub10_1.method8763(local175);
							return;
						}
						if (arg0 == 7311) {
							local175 = anIntArray460[--anInt8481];
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub14_1.method8763(local175);
							return;
						}
						if (arg0 == 7312) {
							local175 = anIntArray460[--anInt8481];
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub24_1.method8763(local175);
							return;
						}
						if (arg0 == 7313) {
							local175 = anIntArray460[--anInt8481];
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub22_1.method8763(local175);
							return;
						}
						if (arg0 == 7314) {
							local175 = anIntArray460[--anInt8481];
							anIntArray460[anInt8481++] = Static655.aClass5_Sub36_29.aClass2_Sub23_2.method8763(local175);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(IZ)V")
	public static void method7215() {
	}

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V")
	private static void method7216(@OriginalArg(0) int arg0) {
		@Pc(3) Class394 local3 = Static238.method3422(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class394[] local13 = Static69.aClass394ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class394[] local19 = Static227.aClass394ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static69.aClass394ArrayArray1[local9] = new Class394[local22];
			Static685.method8331(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static685.method8331(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(I)I")
	private static int method7217(@OriginalArg(0) int arg0) {
		@Pc(4) Class220 local4 = Static126.aClass388_1.method8583(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c112");
		}
		@Pc(21) Integer local21 = aClass233_1.method5432(Static591.aClass174_7.anInt4124 << 16 | arg0);
		if (local21 == null) {
			return local4.aChar4 == 'i' || local4.aChar4 == '1' ? 0 : -1;
		} else {
			return local21;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method7218(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static281.anInt4403 == 0 && (Static533.aBoolean637 && !Static236.aBoolean266 || Static528.aBoolean633)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static49.aClass42_47.method730(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static49.aClass42_47.method730(0).length());
		} else if (local11.startsWith(Static49.aClass42_48.method730(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static49.aClass42_48.method730(0).length());
		} else if (local11.startsWith(Static49.aClass42_49.method730(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static49.aClass42_49.method730(0).length());
		} else if (local11.startsWith(Static49.aClass42_50.method730(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static49.aClass42_50.method730(0).length());
		} else if (local11.startsWith(Static49.aClass42_51.method730(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static49.aClass42_51.method730(0).length());
		} else if (local11.startsWith(Static49.aClass42_52.method730(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static49.aClass42_52.method730(0).length());
		} else if (local11.startsWith(Static49.aClass42_53.method730(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static49.aClass42_53.method730(0).length());
		} else if (local11.startsWith(Static49.aClass42_54.method730(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static49.aClass42_54.method730(0).length());
		} else if (local11.startsWith(Static49.aClass42_55.method730(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static49.aClass42_55.method730(0).length());
		} else if (local11.startsWith(Static49.aClass42_56.method730(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static49.aClass42_56.method730(0).length());
		} else if (local11.startsWith(Static49.aClass42_57.method730(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static49.aClass42_57.method730(0).length());
		} else if (local11.startsWith(Class42.lb.method730(0))) {
			local13 = 11;
			arg0 = arg0.substring(Class42.lb.method730(0).length());
		} else if (Static259.anInt4113 != 0) {
			if (local11.startsWith(Static49.aClass42_47.method730(Static259.anInt4113))) {
				local13 = 0;
				arg0 = arg0.substring(Static49.aClass42_47.method730(Static259.anInt4113).length());
			} else if (local11.startsWith(Static49.aClass42_48.method730(Static259.anInt4113))) {
				local13 = 1;
				arg0 = arg0.substring(Static49.aClass42_48.method730(Static259.anInt4113).length());
			} else if (local11.startsWith(Static49.aClass42_49.method730(Static259.anInt4113))) {
				local13 = 2;
				arg0 = arg0.substring(Static49.aClass42_49.method730(Static259.anInt4113).length());
			} else if (local11.startsWith(Static49.aClass42_50.method730(Static259.anInt4113))) {
				local13 = 3;
				arg0 = arg0.substring(Static49.aClass42_50.method730(Static259.anInt4113).length());
			} else if (local11.startsWith(Static49.aClass42_51.method730(Static259.anInt4113))) {
				local13 = 4;
				arg0 = arg0.substring(Static49.aClass42_51.method730(Static259.anInt4113).length());
			} else if (local11.startsWith(Static49.aClass42_52.method730(Static259.anInt4113))) {
				local13 = 5;
				arg0 = arg0.substring(Static49.aClass42_52.method730(Static259.anInt4113).length());
			} else if (local11.startsWith(Static49.aClass42_53.method730(Static259.anInt4113))) {
				local13 = 6;
				arg0 = arg0.substring(Static49.aClass42_53.method730(Static259.anInt4113).length());
			} else if (local11.startsWith(Static49.aClass42_54.method730(Static259.anInt4113))) {
				local13 = 7;
				arg0 = arg0.substring(Static49.aClass42_54.method730(Static259.anInt4113).length());
			} else if (local11.startsWith(Static49.aClass42_55.method730(Static259.anInt4113))) {
				local13 = 8;
				arg0 = arg0.substring(Static49.aClass42_55.method730(Static259.anInt4113).length());
			} else if (local11.startsWith(Static49.aClass42_56.method730(Static259.anInt4113))) {
				local13 = 9;
				arg0 = arg0.substring(Static49.aClass42_56.method730(Static259.anInt4113).length());
			} else if (local11.startsWith(Static49.aClass42_57.method730(Static259.anInt4113))) {
				local13 = 10;
				arg0 = arg0.substring(Static49.aClass42_57.method730(Static259.anInt4113).length());
			} else if (local11.startsWith(Class42.lb.method730(Static259.anInt4113))) {
				local13 = 11;
				arg0 = arg0.substring(Class42.lb.method730(Static259.anInt4113).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static49.aClass42_58.method730(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static49.aClass42_58.method730(0).length());
		} else if (local11.startsWith(Static49.aClass42_59.method730(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static49.aClass42_59.method730(0).length());
		} else if (local11.startsWith(Static49.aClass42_60.method730(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static49.aClass42_60.method730(0).length());
		} else if (local11.startsWith(Static49.aClass42_61.method730(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static49.aClass42_61.method730(0).length());
		} else if (local11.startsWith(Static49.aClass42_62.method730(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static49.aClass42_62.method730(0).length());
		} else if (Static259.anInt4113 != 0) {
			if (local11.startsWith(Static49.aClass42_58.method730(Static259.anInt4113))) {
				local451 = 1;
				arg0 = arg0.substring(Static49.aClass42_58.method730(Static259.anInt4113).length());
			} else if (local11.startsWith(Static49.aClass42_59.method730(Static259.anInt4113))) {
				local451 = 2;
				arg0 = arg0.substring(Static49.aClass42_59.method730(Static259.anInt4113).length());
			} else if (local11.startsWith(Static49.aClass42_60.method730(Static259.anInt4113))) {
				local451 = 3;
				arg0 = arg0.substring(Static49.aClass42_60.method730(Static259.anInt4113).length());
			} else if (local11.startsWith(Static49.aClass42_61.method730(Static259.anInt4113))) {
				local451 = 4;
				arg0 = arg0.substring(Static49.aClass42_61.method730(Static259.anInt4113).length());
			} else if (local11.startsWith(Static49.aClass42_62.method730(Static259.anInt4113))) {
				local451 = 5;
				arg0 = arg0.substring(Static49.aClass42_62.method730(Static259.anInt4113).length());
			}
		}
		@Pc(641) Class5_Sub16 local641 = Static455.method6717(Static546.aClass187_86, Static16.aClass332_8);
		local641.aClass5_Sub15_Sub2_1.method3651(0);
		@Pc(650) int local650 = local641.aClass5_Sub15_Sub2_1.anInt4144;
		local641.aClass5_Sub15_Sub2_1.method3651(local13);
		local641.aClass5_Sub15_Sub2_1.method3651(local451);
		Static60.method886(arg0, local641.aClass5_Sub15_Sub2_1);
		local641.aClass5_Sub15_Sub2_1.method3649(local641.aClass5_Sub15_Sub2_1.anInt4144 - local650);
		Static479.method7038(local641);
	}
}
