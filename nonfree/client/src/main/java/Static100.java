import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "[I")
	private static int[] anIntArray258;

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "Lclient!fca;")
	private static Class97 aClass97_1;

	@OriginalMember(owner = "client!eaa", name = "e", descriptor = "Lclient!fca;")
	private static Class97 aClass97_2;

	@OriginalMember(owner = "client!eaa", name = "q", descriptor = "Lclient!lw;")
	private static Class192 aClass192_1;

	@OriginalMember(owner = "client!eaa", name = "y", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray8;

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "[Lclient!tda;")
	private static final Class302[] aClass302Array1 = new Class302[50];

	@OriginalMember(owner = "client!eaa", name = "f", descriptor = "[[I")
	private static final int[][] anIntArrayArray28 = new int[5][5000];

	@OriginalMember(owner = "client!eaa", name = "k", descriptor = "[I")
	private static final int[] anIntArray259 = new int[5];

	@OriginalMember(owner = "client!eaa", name = "m", descriptor = "I")
	private static int anInt1847 = 0;

	@OriginalMember(owner = "client!eaa", name = "n", descriptor = "[I")
	private static final int[] anIntArray260 = new int[1000];

	@OriginalMember(owner = "client!eaa", name = "p", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!eaa", name = "t", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray7 = new String[1000];

	@OriginalMember(owner = "client!eaa", name = "u", descriptor = "I")
	private static int anInt1851 = 0;

	@OriginalMember(owner = "client!eaa", name = "w", descriptor = "I")
	private static int anInt1853 = 0;

	@OriginalMember(owner = "client!eaa", name = "z", descriptor = "Lclient!vi;")
	public static final Class332 aClass332_50 = new Class332(4);

	@OriginalMember(owner = "client!eaa", name = "A", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!eaa", name = "B", descriptor = "[I")
	private static final int[] anIntArray261 = new int[3];

	@OriginalMember(owner = "client!eaa", name = "C", descriptor = "I")
	private static int anInt1855 = 0;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
	public static void method1629(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static354.method5292(arg0)) {
			return;
		}
		@Pc(12) Class97[] local12 = Static375.aClass97ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class97 local19 = local12[local14];
			if (local19.anObjectArray5 != null) {
				@Pc(26) Class6_Sub36 local26 = new Class6_Sub36();
				local26.aClass97_7 = local19;
				local26.anObjectArray34 = local19.anObjectArray5;
				method1636(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!ej;II)V")
	public static void method1631(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class6_Sub1_Sub17 local5 = Static49.method669(arg1, arg0, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray258 = new int[local5.anInt9023];
		aStringArray8 = new String[local5.anInt9025];
		if (local5.aClass84_11 == Static121.aClass84_6 || local5.aClass84_11 == Static121.aClass84_5 || local5.aClass84_11 == Static273.aClass84_9) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static157.aClass97_5 != null) {
				local30 = Static157.aClass97_5.anInt2265;
				local32 = Static157.aClass97_5.anInt2331;
			}
			anIntArray258[0] = Static427.aClass134_1.method6093() - local30;
			anIntArray258[1] = Static427.aClass134_1.method6092() - local32;
		}
		method1633(local5, 200000);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IZ)V")
	public static void method1632() {
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!uw;I)V")
	private static void method1633(@OriginalArg(0) Class6_Sub1_Sub17 arg0, @OriginalArg(1) int arg1) {
		anInt1853 = 0;
		anInt1851 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray678;
		@Pc(11) int[] local11 = arg0.anIntArray679;
		@Pc(13) byte local13 = -1;
		anInt1847 = 0;
		@Pc(603) int local603;
		try {
			@Pc(17) int local17 = 0;
			label260: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 100) {
					@Pc(802) boolean local802;
					if (local11[local5] == 1) {
						local802 = true;
					} else {
						local802 = false;
					}
					if (local31 >= 100 && local31 < 5000) {
						method1635(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method1641(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray260[anInt1853++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray260[anInt1853++] = Static505.aClass30_1.anIntArray46[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static505.aClass30_1.method497(anIntArray260[--anInt1853], local54);
					} else if (local31 == 3) {
						aStringArray7[anInt1851++] = arg0.aStringArray33[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt1853 -= 2;
						if (anIntArray260[anInt1853] != anIntArray260[anInt1853 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt1853 -= 2;
						if (anIntArray260[anInt1853] == anIntArray260[anInt1853 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt1853 -= 2;
						if (anIntArray260[anInt1853] < anIntArray260[anInt1853 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt1853 -= 2;
						if (anIntArray260[anInt1853] > anIntArray260[anInt1853 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt1847 == 0) {
							return;
						}
						@Pc(216) Class302 local216 = aClass302Array1[--anInt1847];
						arg0 = local216.aClass6_Sub1_Sub17_1;
						local8 = arg0.anIntArray678;
						local11 = arg0.anIntArray679;
						local5 = local216.anInt8124;
						anIntArray258 = local216.anIntArray631;
						aStringArray8 = local216.aStringArray29;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray260[anInt1853++] = Static505.aClass30_1.method495(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static505.aClass30_1.method498(local54, anIntArray260[--anInt1853]);
					} else if (local31 == 31) {
						anInt1853 -= 2;
						if (anIntArray260[anInt1853] <= anIntArray260[anInt1853 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt1853 -= 2;
						if (anIntArray260[anInt1853] >= anIntArray260[anInt1853 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray260[anInt1853++] = anIntArray258[local11[local5]];
					} else if (local31 == 34) {
						anIntArray258[local11[local5]] = anIntArray260[--anInt1853];
					} else if (local31 == 35) {
						aStringArray7[anInt1851++] = aStringArray8[local11[local5]];
					} else if (local31 == 36) {
						aStringArray8[local11[local5]] = aStringArray7[--anInt1851];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt1851 -= local54;
						@Pc(400) String local400 = Static49.method666(local54, anInt1851, aStringArray7);
						aStringArray7[anInt1851++] = local400;
					} else if (local31 == 38) {
						anInt1853--;
					} else if (local31 == 39) {
						anInt1851--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class6_Sub1_Sub17 local436 = Static486.method6717(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt9023];
							@Pc(450) String[] local450 = new String[local436.anInt9025];
							for (local452 = 0; local452 < local436.anInt9024; local452++) {
								local446[local452] = anIntArray260[anInt1853 + local452 - local436.anInt9024];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt9021; local471++) {
								local450[local471] = aStringArray7[anInt1851 + local471 - local436.anInt9021];
							}
							anInt1853 -= local436.anInt9024;
							anInt1851 -= local436.anInt9021;
							@Pc(502) Class302 local502 = new Class302();
							local502.aClass6_Sub1_Sub17_1 = arg0;
							local502.anInt8124 = local5;
							local502.anIntArray631 = anIntArray258;
							local502.aStringArray29 = aStringArray8;
							if (anInt1847 >= aClass302Array1.length) {
								throw new RuntimeException();
							}
							aClass302Array1[anInt1847++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray678;
							local11 = local436.anIntArray679;
							local5 = -1;
							anIntArray258 = local446;
							aStringArray8 = local450;
						} else if (local31 == 42) {
							anIntArray260[anInt1853++] = Static402.anIntArray568[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static402.anIntArray568[local54] = anIntArray260[--anInt1853];
							Static363.method5366(local54);
							Static362.aBoolean433 |= Static248.aBooleanArray25[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray260[--anInt1853];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray259[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray28[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray260[--anInt1853];
							if (local603 < 0 || local603 >= anIntArray259[local54]) {
								throw new RuntimeException();
							}
							anIntArray260[anInt1853++] = anIntArrayArray28[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt1853 -= 2;
							local603 = anIntArray260[anInt1853];
							if (local603 < 0 || local603 >= anIntArray259[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray28[local54][local603] = anIntArray260[anInt1853 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static579.aStringArray38[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray7[anInt1851++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static579.aStringArray38[local54] = aStringArray7[--anInt1851];
							Static297.method4140(local54);
						} else if (local31 == 51) {
							@Pc(774) Class212 local774 = arg0.aClass212Array1[local11[local5]];
							@Pc(787) Class6_Sub9 local787 = (Class6_Sub9) local774.method5106((long) anIntArray260[--anInt1853]);
							if (local787 != null) {
								local5 += local787.anInt1006;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString115 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong249).append(" ");
				for (local603 = anInt1847 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass302Array1[local603].aClass6_Sub1_Sub17_1.aLong249).append(" ");
				}
				local856.append("op: ").append(local13);
				Static169.method2641(local856.toString(), local837);
			} else {
				Static418.method6132("Clientscript error in: " + arg0.aString115);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString115).append("\n");
				for (local603 = anInt1847 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass302Array1[local603].aClass6_Sub1_Sub17_1.aString115).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static169.method2641(local856.toString(), local837);
				Static555.method7074(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method1634(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static231.anInt3930 == 0 && (Static451.aBoolean532 && !Static558.aBoolean654 || Static475.aBoolean548)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static141.aClass104_92.method2145(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static141.aClass104_92.method2145(0).length());
		} else if (local11.startsWith(Static141.aClass104_93.method2145(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static141.aClass104_93.method2145(0).length());
		} else if (local11.startsWith(Static141.aClass104_94.method2145(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static141.aClass104_94.method2145(0).length());
		} else if (local11.startsWith(Static141.aClass104_95.method2145(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static141.aClass104_95.method2145(0).length());
		} else if (local11.startsWith(Static141.aClass104_96.method2145(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static141.aClass104_96.method2145(0).length());
		} else if (local11.startsWith(Static141.aClass104_97.method2145(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static141.aClass104_97.method2145(0).length());
		} else if (local11.startsWith(Static141.aClass104_98.method2145(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static141.aClass104_98.method2145(0).length());
		} else if (local11.startsWith(Static141.aClass104_99.method2145(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static141.aClass104_99.method2145(0).length());
		} else if (local11.startsWith(Static141.aClass104_100.method2145(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static141.aClass104_100.method2145(0).length());
		} else if (local11.startsWith(Static141.aClass104_101.method2145(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static141.aClass104_101.method2145(0).length());
		} else if (local11.startsWith(Static141.aClass104_102.method2145(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static141.aClass104_102.method2145(0).length());
		} else if (local11.startsWith(Static141.aClass104_103.method2145(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static141.aClass104_103.method2145(0).length());
		} else if (Static470.anInt7957 != 0) {
			if (local11.startsWith(Static141.aClass104_92.method2145(Static470.anInt7957))) {
				local13 = 0;
				arg0 = arg0.substring(Static141.aClass104_92.method2145(Static470.anInt7957).length());
			} else if (local11.startsWith(Static141.aClass104_93.method2145(Static470.anInt7957))) {
				local13 = 1;
				arg0 = arg0.substring(Static141.aClass104_93.method2145(Static470.anInt7957).length());
			} else if (local11.startsWith(Static141.aClass104_94.method2145(Static470.anInt7957))) {
				local13 = 2;
				arg0 = arg0.substring(Static141.aClass104_94.method2145(Static470.anInt7957).length());
			} else if (local11.startsWith(Static141.aClass104_95.method2145(Static470.anInt7957))) {
				local13 = 3;
				arg0 = arg0.substring(Static141.aClass104_95.method2145(Static470.anInt7957).length());
			} else if (local11.startsWith(Static141.aClass104_96.method2145(Static470.anInt7957))) {
				local13 = 4;
				arg0 = arg0.substring(Static141.aClass104_96.method2145(Static470.anInt7957).length());
			} else if (local11.startsWith(Static141.aClass104_97.method2145(Static470.anInt7957))) {
				local13 = 5;
				arg0 = arg0.substring(Static141.aClass104_97.method2145(Static470.anInt7957).length());
			} else if (local11.startsWith(Static141.aClass104_98.method2145(Static470.anInt7957))) {
				local13 = 6;
				arg0 = arg0.substring(Static141.aClass104_98.method2145(Static470.anInt7957).length());
			} else if (local11.startsWith(Static141.aClass104_99.method2145(Static470.anInt7957))) {
				local13 = 7;
				arg0 = arg0.substring(Static141.aClass104_99.method2145(Static470.anInt7957).length());
			} else if (local11.startsWith(Static141.aClass104_100.method2145(Static470.anInt7957))) {
				local13 = 8;
				arg0 = arg0.substring(Static141.aClass104_100.method2145(Static470.anInt7957).length());
			} else if (local11.startsWith(Static141.aClass104_101.method2145(Static470.anInt7957))) {
				local13 = 9;
				arg0 = arg0.substring(Static141.aClass104_101.method2145(Static470.anInt7957).length());
			} else if (local11.startsWith(Static141.aClass104_102.method2145(Static470.anInt7957))) {
				local13 = 10;
				arg0 = arg0.substring(Static141.aClass104_102.method2145(Static470.anInt7957).length());
			} else if (local11.startsWith(Static141.aClass104_103.method2145(Static470.anInt7957))) {
				local13 = 11;
				arg0 = arg0.substring(Static141.aClass104_103.method2145(Static470.anInt7957).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static141.aClass104_104.method2145(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static141.aClass104_104.method2145(0).length());
		} else if (local11.startsWith(Static141.aClass104_105.method2145(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static141.aClass104_105.method2145(0).length());
		} else if (local11.startsWith(Static141.aClass104_106.method2145(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static141.aClass104_106.method2145(0).length());
		} else if (local11.startsWith(Static141.aClass104_107.method2145(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static141.aClass104_107.method2145(0).length());
		} else if (local11.startsWith(Static141.aClass104_108.method2145(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static141.aClass104_108.method2145(0).length());
		} else if (Static470.anInt7957 != 0) {
			if (local11.startsWith(Static141.aClass104_104.method2145(Static470.anInt7957))) {
				local451 = 1;
				arg0 = arg0.substring(Static141.aClass104_104.method2145(Static470.anInt7957).length());
			} else if (local11.startsWith(Static141.aClass104_105.method2145(Static470.anInt7957))) {
				local451 = 2;
				arg0 = arg0.substring(Static141.aClass104_105.method2145(Static470.anInt7957).length());
			} else if (local11.startsWith(Static141.aClass104_106.method2145(Static470.anInt7957))) {
				local451 = 3;
				arg0 = arg0.substring(Static141.aClass104_106.method2145(Static470.anInt7957).length());
			} else if (local11.startsWith(Static141.aClass104_107.method2145(Static470.anInt7957))) {
				local451 = 4;
				arg0 = arg0.substring(Static141.aClass104_107.method2145(Static470.anInt7957).length());
			} else if (local11.startsWith(Static141.aClass104_108.method2145(Static470.anInt7957))) {
				local451 = 5;
				arg0 = arg0.substring(Static141.aClass104_108.method2145(Static470.anInt7957).length());
			}
		}
		Static136.method2051(Static560.aClass160_98);
		Static218.aClass6_Sub14_Sub2_1.method6035(0);
		@Pc(646) int local646 = Static218.aClass6_Sub14_Sub2_1.anInt7244;
		Static218.aClass6_Sub14_Sub2_1.method6035(local13);
		Static218.aClass6_Sub14_Sub2_1.method6035(local451);
		Static526.method7358(Static218.aClass6_Sub14_Sub2_1, arg0);
		Static218.aClass6_Sub14_Sub2_1.method5985(Static218.aClass6_Sub14_Sub2_1.anInt7244 - local646);
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(IZ)V")
	private static void method1635(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class97 local137;
		@Pc(19) int local19;
		@Pc(35) Class97 local35;
		@Pc(56) int local56;
		@Pc(13) int local13;
		@Pc(210) Class97 local210;
		@Pc(25) int local25;
		@Pc(158) Class97 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt1853 -= 3;
				local13 = anIntArray260[anInt1853];
				local19 = anIntArray260[anInt1853 + 1];
				local25 = anIntArray260[anInt1853 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static133.method4068(local13);
				if (local35.aClass97Array1 == null) {
					local35.aClass97Array1 = new Class97[local25 + 1];
				}
				if (local35.aClass97Array1.length <= local25) {
					@Pc(54) Class97[] local54 = new Class97[local25 + 1];
					for (local56 = 0; local56 < local35.aClass97Array1.length; local56++) {
						local54[local56] = local35.aClass97Array1[local56];
					}
					local35.aClass97Array1 = local54;
				}
				if (local25 > 0 && local35.aClass97Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class97 local99 = new Class97();
				local99.anInt2264 = local19;
				local99.anInt2325 = local99.anInt2311 = local35.anInt2311;
				local99.lb = local25;
				local35.aClass97Array1[local25] = local99;
				if (arg1) {
					aClass97_1 = local99;
				} else {
					aClass97_2 = local99;
				}
				Static390.method5794(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass97_1 : aClass97_2;
				if (local137.lb == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static133.method4068(local137.anInt2311);
				local158.aClass97Array1[local137.lb] = null;
				Static390.method5794(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static133.method4068(anIntArray260[--anInt1853]);
				local137.aClass97Array1 = null;
				Static390.method5794(local137);
				return;
			}
			if (arg0 == 200) {
				anInt1853 -= 2;
				local13 = anIntArray260[anInt1853];
				local19 = anIntArray260[anInt1853 + 1];
				local210 = Static50.method681(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray260[anInt1853++] = 1;
					if (arg1) {
						aClass97_1 = local210;
						return;
					}
					aClass97_2 = local210;
					return;
				}
				anIntArray260[anInt1853++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray260[--anInt1853];
				local158 = Static133.method4068(local13);
				if (local158 != null) {
					anIntArray260[anInt1853++] = 1;
					if (arg1) {
						aClass97_1 = local158;
						return;
					}
					aClass97_2 = local158;
					return;
				}
				anIntArray260[anInt1853++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray260[--anInt1853];
				method1642(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray260[--anInt1853];
				method1637(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt1853 -= 2;
					local13 = anIntArray260[anInt1853];
					local19 = anIntArray260[anInt1853 + 1];
					for (local25 = 0; local25 < Static478.anIntArray628.length; local25++) {
						if (Static478.anIntArray628[local25] == local13) {
							Static426.aClass29_Sub2_Sub1_Sub2_2.aClass246_1.method5773(local19, local25, Static78.aClass344_1);
							return;
						}
					}
					for (local353 = 0; local353 < Static527.anIntArray676.length; local353++) {
						if (Static527.anIntArray676[local353] == local13) {
							Static426.aClass29_Sub2_Sub1_Sub2_2.aClass246_1.method5773(local19, local353, Static78.aClass344_1);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt1853 -= 2;
					local13 = anIntArray260[anInt1853];
					local19 = anIntArray260[anInt1853 + 1];
					Static426.aClass29_Sub2_Sub1_Sub2_2.aClass246_1.method5776(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray260[--anInt1853] != 0;
					Static426.aClass29_Sub2_Sub1_Sub2_2.aClass246_1.method5780(local412);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static133.method4068(anIntArray260[--anInt1853]);
				} else {
					local137 = arg1 ? aClass97_1 : aClass97_2;
				}
				if (arg0 == 1000) {
					anInt1853 -= 4;
					local137.anInt2320 = anIntArray260[anInt1853];
					local137.anInt2260 = anIntArray260[anInt1853 + 1];
					local19 = anIntArray260[anInt1853 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray260[anInt1853 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte41 = (byte) local19;
					local137.aByte44 = (byte) local25;
					Static390.method5794(local137);
					Static59.method45(local137);
					if (local137.lb == -1) {
						Static288.method4061(local137.anInt2311);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt1853 -= 4;
					local137.anInt2276 = anIntArray260[anInt1853];
					local137.anInt2347 = anIntArray260[anInt1853 + 1];
					local137.anInt2318 = 0;
					local137.anInt2293 = 0;
					local19 = anIntArray260[anInt1853 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray260[anInt1853 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte42 = (byte) local19;
					local137.aByte43 = (byte) local25;
					Static390.method5794(local137);
					Static59.method45(local137);
					if (local137.anInt2264 == 0) {
						Static443.method6362(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray260[--anInt1853] == 1;
					if (local137.aBoolean150 != local620) {
						local137.aBoolean150 = local620;
						Static390.method5794(local137);
					}
					if (local137.lb == -1) {
						Static524.method7353(local137.anInt2311);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt1853 -= 2;
					local137.anInt2290 = anIntArray260[anInt1853];
					local137.anInt2284 = anIntArray260[anInt1853 + 1];
					Static390.method5794(local137);
					Static59.method45(local137);
					if (local137.anInt2264 == 0) {
						Static443.method6362(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean155 = anIntArray260[--anInt1853] == 1;
					return;
				}
			} else {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static133.method4068(anIntArray260[--anInt1853]);
					} else {
						local137 = arg1 ? aClass97_1 : aClass97_2;
					}
					if (arg0 == 1100) {
						anInt1853 -= 2;
						local137.anInt2271 = anIntArray260[anInt1853];
						if (local137.anInt2271 > local137.anInt2307 - local137.anInt2340) {
							local137.anInt2271 = local137.anInt2307 - local137.anInt2340;
						}
						if (local137.anInt2271 < 0) {
							local137.anInt2271 = 0;
						}
						local137.anInt2334 = anIntArray260[anInt1853 + 1];
						if (local137.anInt2334 > local137.anInt2321 - local137.anInt2305) {
							local137.anInt2334 = local137.anInt2321 - local137.anInt2305;
						}
						if (local137.anInt2334 < 0) {
							local137.anInt2334 = 0;
						}
						Static390.method5794(local137);
						if (local137.lb == -1) {
							Static527.method7364(local137.anInt2311);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt2352 = anIntArray260[--anInt1853];
						Static390.method5794(local137);
						if (local137.lb == -1) {
							Static295.method4116(local137.anInt2311);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean153 = anIntArray260[--anInt1853] == 1;
						Static390.method5794(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt2316 = anIntArray260[--anInt1853];
						Static390.method5794(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt2348 = anIntArray260[--anInt1853];
						Static390.method5794(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray260[--anInt1853];
						if (local137.anInt2344 != local19) {
							local137.anInt2344 = local19;
							Static390.method5794(local137);
						}
						if (local137.lb == -1) {
							Static517.method6763(local137.anInt2311);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt2296 = anIntArray260[--anInt1853];
						Static390.method5794(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean163 = anIntArray260[--anInt1853] == 1;
						Static390.method5794(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt2262 = 1;
						local137.anInt2263 = anIntArray260[--anInt1853];
						Static390.method5794(local137);
						if (local137.lb == -1) {
							Static309.method4789(local137.anInt2311);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt1853 -= 6;
						local137.anInt2266 = anIntArray260[anInt1853];
						local137.anInt2332 = anIntArray260[anInt1853 + 1];
						local137.anInt2322 = anIntArray260[anInt1853 + 2];
						local137.anInt2279 = anIntArray260[anInt1853 + 3];
						local137.anInt2351 = anIntArray260[anInt1853 + 4];
						local137.anInt2312 = anIntArray260[anInt1853 + 5];
						Static390.method5794(local137);
						if (local137.lb == -1) {
							Static545.method7519(local137.anInt2311);
							Static407.method5933(local137.anInt2311);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray260[--anInt1853];
						if (local137.anInt2310 != local19) {
							local137.anInt2310 = local19;
							local137.anInt2304 = 0;
							local137.anInt2287 = 1;
							local137.anInt2272 = 0;
							Static390.method5794(local137);
						}
						if (local137.lb == -1) {
							Static252.method3572(local137.anInt2311);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean152 = anIntArray260[--anInt1853] == 1;
						Static390.method5794(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray7[--anInt1851];
						if (!local1101.equals(local137.aString38)) {
							local137.aString38 = local1101;
							Static390.method5794(local137);
						}
						if (local137.lb == -1) {
							Static33.method467(local137.anInt2311);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt2346 = anIntArray260[--anInt1853];
						Static390.method5794(local137);
						if (local137.lb == -1) {
							Static161.method2372(local137.anInt2311);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt1853 -= 3;
						local137.anInt2294 = anIntArray260[anInt1853];
						local137.anInt2292 = anIntArray260[anInt1853 + 1];
						local137.anInt2285 = anIntArray260[anInt1853 + 2];
						Static390.method5794(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean151 = anIntArray260[--anInt1853] == 1;
						Static390.method5794(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt2308 = anIntArray260[--anInt1853];
						Static390.method5794(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt2300 = anIntArray260[--anInt1853];
						Static390.method5794(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean157 = anIntArray260[--anInt1853] == 1;
						Static390.method5794(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean154 = anIntArray260[--anInt1853] == 1;
						Static390.method5794(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt1853 -= 2;
						local137.anInt2307 = anIntArray260[anInt1853];
						local137.anInt2321 = anIntArray260[anInt1853 + 1];
						Static390.method5794(local137);
						if (local137.anInt2264 == 0) {
							Static443.method6362(false, local137);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt1853 -= 2;
						local137.anInt2326 = (short) anIntArray260[anInt1853];
						local137.anInt2282 = (short) anIntArray260[anInt1853 + 1];
						Static390.method5794(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean149 = anIntArray260[--anInt1853] == 1;
						Static390.method5794(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt2312 = anIntArray260[--anInt1853];
						Static390.method5794(local137);
						if (local137.lb == -1) {
							Static545.method7519(local137.anInt2311);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray260[--anInt1853];
						local137.aBoolean161 = local19 == 1;
						Static390.method5794(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt1853 -= 2;
						local137.anInt2280 = anIntArray260[anInt1853];
						local137.anInt2350 = anIntArray260[anInt1853 + 1];
						Static390.method5794(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt2274 = anIntArray260[--anInt1853];
						Static390.method5794(local137);
						return;
					}
					@Pc(1454) Class343 local1454;
					if (arg0 == 1127) {
						anInt1853 -= 2;
						local19 = anIntArray260[anInt1853];
						local25 = anIntArray260[anInt1853 + 1];
						local1454 = Static112.aClass307_1.method6811(local19);
						if (local25 != local1454.anInt9461) {
							local137.method1980(local25, local19);
							return;
						}
						local137.method1969(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray260[--anInt1853];
						local1488 = aStringArray7[--anInt1851];
						local1454 = Static112.aClass307_1.method6811(local19);
						if (!local1454.aString118.equals(local1488)) {
							local137.method1983(local19, local1488);
							return;
						}
						local137.method1969(local19);
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static133.method4068(anIntArray260[--anInt1853]);
					} else {
						local137 = arg1 ? aClass97_1 : aClass97_2;
					}
					Static390.method5794(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt1853 -= 2;
						local19 = anIntArray260[anInt1853];
						local25 = anIntArray260[anInt1853 + 1];
						if (local137.lb == -1) {
							Static248.method3542(local137.anInt2311);
							Static545.method7519(local137.anInt2311);
							Static407.method5933(local137.anInt2311);
						}
						if (local19 == -1) {
							local137.anInt2262 = 1;
							local137.anInt2263 = -1;
							local137.anInt2277 = -1;
							return;
						}
						local137.anInt2277 = local19;
						local137.anInt2329 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean148 = true;
						} else {
							local137.aBoolean148 = false;
						}
						@Pc(1630) Class110 local1630 = Static295.aClass256_2.method5924(local19);
						local137.anInt2322 = local1630.anInt2628;
						local137.anInt2279 = local1630.anInt2655;
						local137.anInt2351 = local1630.anInt2669;
						local137.anInt2266 = local1630.anInt2611;
						local137.anInt2332 = local1630.anInt2667;
						local137.anInt2312 = local1630.anInt2621;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt2333 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt2333 = 1;
						} else {
							local137.anInt2333 = 2;
						}
						if (local137.anInt2318 > 0) {
							local137.anInt2312 = local137.anInt2312 * 32 / local137.anInt2318;
							return;
						}
						if (local137.anInt2276 > 0) {
							local137.anInt2312 = local137.anInt2312 * 32 / local137.anInt2276;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt2262 = 2;
						local137.anInt2263 = anIntArray260[--anInt1853];
						if (local137.lb == -1) {
							Static309.method4789(local137.anInt2311);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt2262 = 3;
						local137.anInt2263 = -1;
						if (local137.lb == -1) {
							Static309.method4789(local137.anInt2311);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt2262 = 6;
						local137.anInt2263 = anIntArray260[--anInt1853];
						if (local137.lb == -1) {
							Static309.method4789(local137.anInt2311);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt2262 = 5;
						local137.anInt2263 = anIntArray260[--anInt1853];
						if (local137.lb == -1) {
							Static309.method4789(local137.anInt2311);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt1853 -= 4;
						local137.anInt2267 = anIntArray260[anInt1853];
						local137.anInt2314 = anIntArray260[anInt1853 + 1];
						local137.anInt2269 = anIntArray260[anInt1853 + 2];
						local137.anInt2330 = anIntArray260[anInt1853 + 3];
						Static390.method5794(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt1853 -= 2;
						local137.anInt2313 = anIntArray260[anInt1853];
						local137.anInt2298 = anIntArray260[anInt1853 + 1];
						Static390.method5794(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt1853 -= 4;
						local137.anInt2263 = anIntArray260[anInt1853];
						local137.anInt2273 = anIntArray260[anInt1853 + 1];
						if (anIntArray260[anInt1853 + 2] == 1) {
							local137.anInt2262 = 9;
						} else {
							local137.anInt2262 = 8;
						}
						if (anIntArray260[anInt1853 + 3] == 1) {
							local137.aBoolean148 = true;
						} else {
							local137.aBoolean148 = false;
						}
						if (local137.lb == -1) {
							Static309.method4789(local137.anInt2311);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt2262 = 5;
						local137.anInt2263 = Static44.anInt711;
						local137.anInt2273 = 0;
						if (local137.lb == -1) {
							Static309.method4789(local137.anInt2311);
						}
						return;
					}
				} else {
					@Pc(2290) int local2290;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static133.method4068(anIntArray260[--anInt1853]);
						} else {
							local137 = arg1 ? aClass97_1 : aClass97_2;
						}
						if (arg0 == 1300) {
							local19 = anIntArray260[--anInt1853] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method1981(local19, aStringArray7[--anInt1851]);
								return;
							} else {
								anInt1851--;
								return;
							}
						}
						if (arg0 == 1301) {
							anInt1853 -= 2;
							local19 = anIntArray260[anInt1853];
							local25 = anIntArray260[anInt1853 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass97_4 = null;
								return;
							}
							local137.aClass97_4 = Static50.method681(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray260[--anInt1853];
							if (local19 != Static454.anInt7789 && local19 != Static259.anInt4238 && local19 != Static225.anInt3803) {
								return;
							}
							local137.anInt2319 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt2297 = anIntArray260[--anInt1853];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt2268 = anIntArray260[--anInt1853];
							return;
						}
						if (arg0 == 1305) {
							local137.aString36 = aStringArray7[--anInt1851];
							return;
						}
						if (arg0 == 1306) {
							local137.aString39 = aStringArray7[--anInt1851];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray11 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt2315 = anIntArray260[--anInt1853];
							local137.anInt2337 = anIntArray260[--anInt1853];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray260[--anInt1853];
							local25 = anIntArray260[--anInt1853];
							if (local25 >= 1 && local25 <= 10) {
								local137.method1978(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString37 = aStringArray7[--anInt1851];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt2283 = anIntArray260[--anInt1853];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt1853 -= 3;
								local19 = anIntArray260[anInt1853] - 1;
								local25 = anIntArray260[anInt1853 + 1];
								local353 = anIntArray260[anInt1853 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt1853 -= 2;
								local19 = 10;
								local25 = anIntArray260[anInt1853];
								local353 = anIntArray260[anInt1853 + 1];
							}
							if (local137.aByteArray39 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray39 = new byte[11];
								local137.aByteArray38 = new byte[11];
								local137.anIntArray286 = new int[11];
							}
							local137.aByteArray39[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean158 = false;
								for (local2290 = 0; local2290 < local137.aByteArray39.length; local2290++) {
									if (local137.aByteArray39[local2290] != 0) {
										local137.aBoolean158 = true;
										break;
									}
								}
							} else {
								local137.aBoolean158 = true;
							}
							local137.aByteArray38[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt2317 = anIntArray260[--anInt1853];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static133.method4068(anIntArray260[--anInt1853]);
						} else {
							local137 = arg1 ? aClass97_1 : aClass97_2;
						}
						if (arg0 == 1499) {
							local137.method1971();
							return;
						}
						local1101 = aStringArray7[--anInt1851];
						@Pc(2376) int[] local2376 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray260[--anInt1853];
							if (local353 > 0) {
								local2376 = new int[local353];
								while (local353-- > 0) {
									local2376[local353] = anIntArray260[--anInt1853];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2428) Object[] local2428 = new Object[local1101.length() + 1];
						for (local2290 = local2428.length - 1; local2290 >= 1; local2290--) {
							if (local1101.charAt(local2290 - 1) == 's') {
								local2428[local2290] = aStringArray7[--anInt1851];
							} else {
								local2428[local2290] = Integer.valueOf(anIntArray260[--anInt1853]);
							}
						}
						local56 = anIntArray260[--anInt1853];
						if (local56 == -1) {
							local2428 = null;
						} else {
							local2428[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray1 = local2428;
						} else if (arg0 == 1401) {
							local137.anObjectArray15 = local2428;
						} else if (arg0 == 1402) {
							local137.anObjectArray23 = local2428;
						} else if (arg0 == 1403) {
							local137.anObjectArray14 = local2428;
						} else if (arg0 == 1404) {
							local137.anObjectArray17 = local2428;
						} else if (arg0 == 1405) {
							local137.anObjectArray25 = local2428;
						} else if (arg0 == 1406) {
							local137.anObjectArray28 = local2428;
						} else if (arg0 == 1407) {
							local137.anObjectArray11 = local2428;
							local137.anIntArray296 = local2376;
						} else if (arg0 == 1408) {
							local137.anObjectArray16 = local2428;
						} else if (arg0 == 1409) {
							local137.anObjectArray20 = local2428;
						} else if (arg0 == 1410) {
							local137.anObjectArray6 = local2428;
						} else if (arg0 == 1411) {
							local137.anObjectArray13 = local2428;
						} else if (arg0 == 1412) {
							local137.anObjectArray26 = local2428;
						} else if (arg0 == 1414) {
							local137.anObjectArray27 = local2428;
							local137.anIntArray288 = local2376;
						} else if (arg0 == 1415) {
							local137.anObjectArray29 = local2428;
							local137.anIntArray289 = local2376;
						} else if (arg0 == 1416) {
							local137.anObjectArray24 = local2428;
						} else if (arg0 == 1417) {
							local137.anObjectArray19 = local2428;
						} else if (arg0 == 1418) {
							local137.anObjectArray4 = local2428;
						} else if (arg0 == 1419) {
							local137.anObjectArray22 = local2428;
						} else if (arg0 == 1420) {
							local137.anObjectArray30 = local2428;
						} else if (arg0 == 1421) {
							local137.anObjectArray3 = local2428;
						} else if (arg0 == 1422) {
							local137.anObjectArray10 = local2428;
						} else if (arg0 == 1423) {
							local137.anObjectArray7 = local2428;
						} else if (arg0 == 1424) {
							local137.anObjectArray12 = local2428;
						} else if (arg0 == 1425) {
							local137.anObjectArray31 = local2428;
						} else if (arg0 == 1426) {
							local137.anObjectArray21 = local2428;
						} else if (arg0 == 1427) {
							local137.anObjectArray18 = local2428;
						} else if (arg0 == 1428) {
							local137.anObjectArray9 = local2428;
							local137.anIntArray295 = local2376;
						} else if (arg0 == 1429) {
							local137.anObjectArray8 = local2428;
							local137.anIntArray293 = local2376;
						} else if (arg0 == 1430) {
							local137.anObjectArray2 = local2428;
						}
						local137.aBoolean159 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass97_1 : aClass97_2;
						if (arg0 == 1500) {
							anIntArray260[anInt1853++] = local137.anInt2265;
							return;
						}
						if (arg0 == 1501) {
							anIntArray260[anInt1853++] = local137.anInt2331;
							return;
						}
						if (arg0 == 1502) {
							anIntArray260[anInt1853++] = local137.anInt2340;
							return;
						}
						if (arg0 == 1503) {
							anIntArray260[anInt1853++] = local137.anInt2305;
							return;
						}
						if (arg0 == 1504) {
							anIntArray260[anInt1853++] = local137.aBoolean150 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray260[anInt1853++] = local137.anInt2325;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static299.method4155(local137);
							anIntArray260[anInt1853++] = local158 == null ? -1 : local158.anInt2311;
							return;
						}
					} else {
						@Pc(3024) Class343 local3024;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass97_1 : aClass97_2;
							if (arg0 == 1600) {
								anIntArray260[anInt1853++] = local137.anInt2271;
								return;
							}
							if (arg0 == 1601) {
								anIntArray260[anInt1853++] = local137.anInt2334;
								return;
							}
							if (arg0 == 1602) {
								aStringArray7[anInt1851++] = local137.aString38;
								return;
							}
							if (arg0 == 1603) {
								anIntArray260[anInt1853++] = local137.anInt2307;
								return;
							}
							if (arg0 == 1604) {
								anIntArray260[anInt1853++] = local137.anInt2321;
								return;
							}
							if (arg0 == 1605) {
								anIntArray260[anInt1853++] = local137.anInt2312;
								return;
							}
							if (arg0 == 1606) {
								anIntArray260[anInt1853++] = local137.anInt2322;
								return;
							}
							if (arg0 == 1607) {
								anIntArray260[anInt1853++] = local137.anInt2351;
								return;
							}
							if (arg0 == 1608) {
								anIntArray260[anInt1853++] = local137.anInt2279;
								return;
							}
							if (arg0 == 1609) {
								anIntArray260[anInt1853++] = local137.anInt2316;
								return;
							}
							if (arg0 == 1610) {
								anIntArray260[anInt1853++] = local137.anInt2266;
								return;
							}
							if (arg0 == 1611) {
								anIntArray260[anInt1853++] = local137.anInt2332;
								return;
							}
							if (arg0 == 1612) {
								anIntArray260[anInt1853++] = local137.anInt2344;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray260[--anInt1853];
								local3024 = Static112.aClass307_1.method6811(local19);
								if (local3024.method7744()) {
									aStringArray7[anInt1851++] = local137.method1979(local3024.aString118, local19);
									return;
								}
								anIntArray260[anInt1853++] = local137.method1970(local19, local3024.anInt9461);
								return;
							}
							if (arg0 == 1614) {
								anIntArray260[anInt1853++] = local137.anInt2296;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass97_1 : aClass97_2;
							if (arg0 == 1700) {
								anIntArray260[anInt1853++] = local137.anInt2277;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt2277 != -1) {
									anIntArray260[anInt1853++] = local137.anInt2329;
									return;
								}
								anIntArray260[anInt1853++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray260[anInt1853++] = local137.lb;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass97_1 : aClass97_2;
							if (arg0 == 1800) {
								anIntArray260[anInt1853++] = Static65.method862(local137).method6471();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray260[--anInt1853];
								local19--;
								if (local137.aStringArray11 != null && local19 < local137.aStringArray11.length && local137.aStringArray11[local19] != null) {
									aStringArray7[anInt1851++] = local137.aStringArray11[local19];
									return;
								}
								aStringArray7[anInt1851++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString36 == null) {
									aStringArray7[anInt1851++] = "";
									return;
								}
								aStringArray7[anInt1851++] = local137.aString36;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static133.method4068(anIntArray260[--anInt1853]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass97_1 : aClass97_2;
							}
							if (anInt1855 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray18 == null) {
									return;
								}
								@Pc(3274) Class6_Sub36 local3274 = new Class6_Sub36();
								local3274.aClass97_7 = local137;
								local3274.anObjectArray34 = local137.anObjectArray18;
								local3274.anInt5762 = anInt1855 + 1;
								Static446.aClass275_163.method6370(local3274);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static133.method4068(anIntArray260[--anInt1853]);
							if (arg0 == 2500) {
								anIntArray260[anInt1853++] = local137.anInt2265;
								return;
							}
							if (arg0 == 2501) {
								anIntArray260[anInt1853++] = local137.anInt2331;
								return;
							}
							if (arg0 == 2502) {
								anIntArray260[anInt1853++] = local137.anInt2340;
								return;
							}
							if (arg0 == 2503) {
								anIntArray260[anInt1853++] = local137.anInt2305;
								return;
							}
							if (arg0 == 2504) {
								anIntArray260[anInt1853++] = local137.aBoolean150 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray260[anInt1853++] = local137.anInt2325;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static299.method4155(local137);
								anIntArray260[anInt1853++] = local158 == null ? -1 : local158.anInt2311;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static133.method4068(anIntArray260[--anInt1853]);
							if (arg0 == 2600) {
								anIntArray260[anInt1853++] = local137.anInt2271;
								return;
							}
							if (arg0 == 2601) {
								anIntArray260[anInt1853++] = local137.anInt2334;
								return;
							}
							if (arg0 == 2602) {
								aStringArray7[anInt1851++] = local137.aString38;
								return;
							}
							if (arg0 == 2603) {
								anIntArray260[anInt1853++] = local137.anInt2307;
								return;
							}
							if (arg0 == 2604) {
								anIntArray260[anInt1853++] = local137.anInt2321;
								return;
							}
							if (arg0 == 2605) {
								anIntArray260[anInt1853++] = local137.anInt2312;
								return;
							}
							if (arg0 == 2606) {
								anIntArray260[anInt1853++] = local137.anInt2322;
								return;
							}
							if (arg0 == 2607) {
								anIntArray260[anInt1853++] = local137.anInt2351;
								return;
							}
							if (arg0 == 2608) {
								anIntArray260[anInt1853++] = local137.anInt2279;
								return;
							}
							if (arg0 == 2609) {
								anIntArray260[anInt1853++] = local137.anInt2316;
								return;
							}
							if (arg0 == 2610) {
								anIntArray260[anInt1853++] = local137.anInt2266;
								return;
							}
							if (arg0 == 2611) {
								anIntArray260[anInt1853++] = local137.anInt2332;
								return;
							}
							if (arg0 == 2612) {
								anIntArray260[anInt1853++] = local137.anInt2344;
								return;
							}
							if (arg0 == 2613) {
								anIntArray260[anInt1853++] = local137.anInt2296;
								return;
							}
						} else {
							@Pc(3682) Class6_Sub31 local3682;
							@Pc(3784) Class6_Sub31 local3784;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static133.method4068(anIntArray260[--anInt1853]);
									anIntArray260[anInt1853++] = local137.anInt2277;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static133.method4068(anIntArray260[--anInt1853]);
									if (local137.anInt2277 != -1) {
										anIntArray260[anInt1853++] = local137.anInt2329;
										return;
									}
									anIntArray260[anInt1853++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray260[--anInt1853];
									local3682 = (Class6_Sub31) Static564.aClass212_39.method5106((long) local13);
									if (local3682 != null) {
										anIntArray260[anInt1853++] = 1;
										return;
									}
									anIntArray260[anInt1853++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static133.method4068(anIntArray260[--anInt1853]);
									if (local137.aClass97Array1 == null) {
										anIntArray260[anInt1853++] = 0;
										return;
									}
									local19 = local137.aClass97Array1.length;
									for (local25 = 0; local25 < local137.aClass97Array1.length; local25++) {
										if (local137.aClass97Array1[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray260[anInt1853++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt1853 -= 2;
									local13 = anIntArray260[anInt1853];
									local19 = anIntArray260[anInt1853 + 1];
									local3784 = (Class6_Sub31) Static564.aClass212_39.method5106((long) local13);
									if (local3784 != null && local3784.anInt4563 == local19) {
										anIntArray260[anInt1853++] = 1;
										return;
									}
									anIntArray260[anInt1853++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static133.method4068(anIntArray260[--anInt1853]);
								if (arg0 == 2800) {
									anIntArray260[anInt1853++] = Static65.method862(local137).method6471();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray260[--anInt1853];
									@Pc(3848) int local3848 = local19 - 1;
									if (local137.aStringArray11 != null && local3848 < local137.aStringArray11.length && local137.aStringArray11[local3848] != null) {
										aStringArray7[anInt1851++] = local137.aStringArray11[local3848];
										return;
									}
									aStringArray7[anInt1851++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString36 == null) {
										aStringArray7[anInt1851++] = "";
										return;
									}
									aStringArray7[anInt1851++] = local137.aString36;
									return;
								}
							} else {
								@Pc(3921) String local3921;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3921 = aStringArray7[--anInt1851];
										Static303.method4233(local3921);
										return;
									}
									if (arg0 == 3101) {
										anInt1853 -= 2;
										Static330.method5147(Static426.aClass29_Sub2_Sub1_Sub2_2, anIntArray260[anInt1853 + 1], anIntArray260[anInt1853]);
										return;
									}
									if (arg0 == 3103) {
										Static345.method5202();
										return;
									}
									if (arg0 == 3104) {
										local3921 = aStringArray7[--anInt1851];
										local19 = 0;
										if (Static44.method598(local3921)) {
											local19 = Static467.method6543(local3921);
										}
										Static136.method2051(Static331.aClass160_83);
										Static218.aClass6_Sub14_Sub2_1.method5990(local19);
										return;
									}
									if (arg0 == 3105) {
										local3921 = aStringArray7[--anInt1851];
										Static136.method2051(Static8.aClass160_102);
										Static218.aClass6_Sub14_Sub2_1.method6035(local3921.length() + 1);
										Static218.aClass6_Sub14_Sub2_1.method5989(local3921);
										return;
									}
									if (arg0 == 3106) {
										local3921 = aStringArray7[--anInt1851];
										Static136.method2051(Static2.aClass160_2);
										Static218.aClass6_Sub14_Sub2_1.method6035(local3921.length() + 1);
										Static218.aClass6_Sub14_Sub2_1.method5989(local3921);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray260[--anInt1853];
										local1101 = aStringArray7[--anInt1851];
										Static480.method6666(local1101, local13);
										return;
									}
									if (arg0 == 3108) {
										anInt1853 -= 3;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										local25 = anIntArray260[anInt1853 + 2];
										local35 = Static133.method4068(local25);
										Static540.method7486(local35, local13, local19);
										return;
									}
									if (arg0 == 3109) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										local210 = arg1 ? aClass97_1 : aClass97_2;
										Static540.method7486(local210, local13, local19);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray260[--anInt1853];
										Static136.method2051(Static177.aClass160_43);
										Static218.aClass6_Sub14_Sub2_1.method5999(local13);
										return;
									}
									if (arg0 == 3111) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										local3784 = (Class6_Sub31) Static564.aClass212_39.method5106((long) local13);
										if (local3784 != null) {
											Static160.method2336(local3784.anInt4563 != local19, true, local3784);
										}
										Static381.method5558(3, local13, local19, true);
										return;
									}
									if (arg0 == 3112) {
										anInt1853--;
										local13 = anIntArray260[anInt1853];
										local3682 = (Class6_Sub31) Static564.aClass212_39.method5106((long) local13);
										if (local3682 != null && local3682.anInt4562 == 3) {
											Static160.method2336(true, true, local3682);
										}
										return;
									}
									if (arg0 == 3113) {
										Static551.method7582(aStringArray7[--anInt1851]);
										return;
									}
									if (arg0 == 3114) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										local1488 = aStringArray7[--anInt1851];
										Static164.method2396("", local13, "", local1488, local19, "");
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt1853 -= 3;
										Static533.method7409(255, anIntArray260[anInt1853], anIntArray260[anInt1853 + 1], anIntArray260[anInt1853 + 2]);
										return;
									}
									if (arg0 == 3201) {
										Static5.method122(anIntArray260[--anInt1853], 50, 255);
										return;
									}
									if (arg0 == 3202) {
										anInt1853 -= 2;
										Static299.method4154(anIntArray260[anInt1853], 255, anIntArray260[anInt1853 + 1]);
										return;
									}
									if (arg0 == 3203) {
										anInt1853 -= 4;
										Static533.method7409(anIntArray260[anInt1853 + 3], anIntArray260[anInt1853], anIntArray260[anInt1853 + 1], anIntArray260[anInt1853 + 2]);
										return;
									}
									if (arg0 == 3204) {
										anInt1853 -= 3;
										Static5.method122(anIntArray260[anInt1853], anIntArray260[anInt1853 + 2], anIntArray260[anInt1853 + 1]);
										return;
									}
									if (arg0 == 3205) {
										anInt1853 -= 3;
										Static299.method4154(anIntArray260[anInt1853], anIntArray260[anInt1853 + 2], anIntArray260[anInt1853 + 1]);
										return;
									}
									if (arg0 == 3206) {
										anInt1853 -= 4;
										Static370.method5428(anIntArray260[anInt1853], false, anIntArray260[anInt1853 + 2], anIntArray260[anInt1853 + 3], anIntArray260[anInt1853 + 1]);
										return;
									}
									if (arg0 == 3207) {
										anInt1853 -= 4;
										Static370.method5428(anIntArray260[anInt1853], true, anIntArray260[anInt1853 + 2], anIntArray260[anInt1853 + 3], anIntArray260[anInt1853 + 1]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray260[anInt1853++] = Static358.anInt6263;
										return;
									}
									if (arg0 == 3301) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = Static229.method3375(local19, local13, false);
										return;
									}
									if (arg0 == 3302) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = Static288.method4062(local19, local13, false);
										return;
									}
									if (arg0 == 3303) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = Static231.method3388(local13, local19, false);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = Static59.aClass42_2.method688(local13).anInt7619;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = Static138.anIntArray303[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = Static109.anIntArray696[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = Static498.anIntArray641[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4669) byte local4669 = Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103;
										local19 = (Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222 >> 9) + Static218.anInt3718;
										local25 = (Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218 >> 9) + Static167.anInt3048;
										anIntArray260[anInt1853++] = (local4669 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray260[anInt1853++] = Static296.aBoolean667 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = Static229.method3375(local19, local13, true);
										return;
									}
									if (arg0 == 3314) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = Static288.method4062(local19, local13, true);
										return;
									}
									if (arg0 == 3315) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = Static231.method3388(local13, local19, true);
										return;
									}
									if (arg0 == 3316) {
										if (Static231.anInt3930 >= 2) {
											anIntArray260[anInt1853++] = Static231.anInt3930;
											return;
										}
										anIntArray260[anInt1853++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray260[anInt1853++] = Static105.anInt1967;
										return;
									}
									if (arg0 == 3318) {
										anIntArray260[anInt1853++] = Static271.aClass147_2.anInt3691;
										return;
									}
									if (arg0 == 3321) {
										anIntArray260[anInt1853++] = Static226.anInt3836;
										return;
									}
									if (arg0 == 3322) {
										anIntArray260[anInt1853++] = Static93.anInt1565;
										return;
									}
									if (arg0 == 3323) {
										if (Static431.anInt7548 >= 5 && Static431.anInt7548 <= 9) {
											anIntArray260[anInt1853++] = 1;
											return;
										}
										anIntArray260[anInt1853++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static431.anInt7548 >= 5 && Static431.anInt7548 <= 9) {
											anIntArray260[anInt1853++] = Static431.anInt7548;
											return;
										}
										anIntArray260[anInt1853++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray260[anInt1853++] = Static2.aBoolean4 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray260[anInt1853++] = Static426.aClass29_Sub2_Sub1_Sub2_2.anInt8623;
										return;
									}
									if (arg0 == 3327) {
										anIntArray260[anInt1853++] = Static426.aClass29_Sub2_Sub1_Sub2_2.aClass246_1.aBoolean487 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray260[anInt1853++] = Static475.aBoolean548 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = Static102.method1655(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = Static364.method5384(local19, local13, false);
										return;
									}
									if (arg0 == 3332) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = Static364.method5384(local19, local13, true);
										return;
									}
									if (arg0 == 3333) {
										anIntArray260[anInt1853++] = Static177.anInt3167;
										return;
									}
									if (arg0 == 3335) {
										anIntArray260[anInt1853++] = Static470.anInt7957;
										return;
									}
									if (arg0 == 3336) {
										anInt1853 -= 4;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										local25 = anIntArray260[anInt1853 + 2];
										local353 = anIntArray260[anInt1853 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray260[anInt1853++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray260[anInt1853++] = Static323.anInt5822;
										return;
									}
									if (arg0 == 3338) {
										anIntArray260[anInt1853++] = Static222.method3235();
										return;
									}
									if (arg0 == 3339) {
										anIntArray260[anInt1853++] = Static276.aBoolean286 ? 1 : 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray260[anInt1853++] = Static241.aBoolean259 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray260[anInt1853++] = Static418.aBoolean509 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray260[anInt1853++] = Static427.aClass134_1.method6093();
										return;
									}
									if (arg0 == 3343) {
										anIntArray260[anInt1853++] = Static427.aClass134_1.method6092();
										return;
									}
									if (arg0 == 3344) {
										aStringArray7[anInt1851++] = Static47.method7646();
										return;
									}
									if (arg0 == 3345) {
										aStringArray7[anInt1851++] = Static517.method6767();
										return;
									}
									if (arg0 == 3346) {
										anIntArray260[anInt1853++] = Static382.method5560();
										return;
									}
									if (arg0 == 3347) {
										anIntArray260[anInt1853++] = Static571.anInt9575;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5404) Class177 local5404;
									if (arg0 == 3400) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										local5404 = Static447.aClass338_3.method7594(local13);
										aStringArray7[anInt1851++] = local5404.method3824(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt1853 -= 4;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										local25 = anIntArray260[anInt1853 + 2];
										local353 = anIntArray260[anInt1853 + 3];
										@Pc(5450) Class177 local5450 = Static447.aClass338_3.method7594(local25);
										if (local5450.aChar2 == local13 && local5450.aChar3 == local19) {
											if (local19 == 115) {
												aStringArray7[anInt1851++] = local5450.method3824(local353);
												return;
											}
											anIntArray260[anInt1853++] = local5450.method3822(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt1853 -= 3;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										local25 = anIntArray260[anInt1853 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5526) Class177 local5526 = Static447.aClass338_3.method7594(local19);
										if (local5526.aChar3 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray260[anInt1853++] = local5526.method3830(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray260[--anInt1853];
										local1101 = aStringArray7[--anInt1851];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5404 = Static447.aClass338_3.method7594(local13);
										if (local5404.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray260[anInt1853++] = local5404.method3825(local1101) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray260[--anInt1853];
										@Pc(5624) Class177 local5624 = Static447.aClass338_3.method7594(local13);
										anIntArray260[anInt1853++] = local5624.aClass212_15.method5105();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static163.anInt2861 == 0) {
											anIntArray260[anInt1853++] = -2;
											return;
										}
										if (Static163.anInt2861 == 1) {
											anIntArray260[anInt1853++] = -1;
											return;
										}
										anIntArray260[anInt1853++] = Static300.anInt4872;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray260[--anInt1853];
										if (Static163.anInt2861 == 2 && local13 < Static300.anInt4872) {
											aStringArray7[anInt1851++] = Static489.aStringArray30[local13];
											if (Static478.aStringArray28[local13] != null) {
												aStringArray7[anInt1851++] = Static478.aStringArray28[local13];
												return;
											}
											aStringArray7[anInt1851++] = "";
											return;
										}
										aStringArray7[anInt1851++] = "";
										aStringArray7[anInt1851++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray260[--anInt1853];
										if (Static163.anInt2861 == 2 && local13 < Static300.anInt4872) {
											anIntArray260[anInt1853++] = Static58.anIntArray63[local13];
											return;
										}
										anIntArray260[anInt1853++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray260[--anInt1853];
										if (Static163.anInt2861 == 2 && local13 < Static300.anInt4872) {
											anIntArray260[anInt1853++] = Static413.anIntArray578[local13];
											return;
										}
										anIntArray260[anInt1853++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3921 = aStringArray7[--anInt1851];
										local19 = anIntArray260[--anInt1853];
										Static356.method5302(local3921, local19);
										return;
									}
									if (arg0 == 3605) {
										local3921 = aStringArray7[--anInt1851];
										Static287.method7855(local3921);
										return;
									}
									if (arg0 == 3606) {
										local3921 = aStringArray7[--anInt1851];
										Static559.method7669(local3921);
										return;
									}
									if (arg0 == 3607) {
										local3921 = aStringArray7[--anInt1851];
										Static506.method6960(false, local3921);
										return;
									}
									if (arg0 == 3608) {
										local3921 = aStringArray7[--anInt1851];
										Static152.method2238(local3921);
										return;
									}
									if (arg0 == 3609) {
										local3921 = aStringArray7[--anInt1851];
										if (local3921.startsWith("<img=0>") || local3921.startsWith("<img=1>")) {
											local3921 = local3921.substring(7);
										}
										anIntArray260[anInt1853++] = Static325.method5027(local3921) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray260[--anInt1853];
										if (Static163.anInt2861 == 2 && local13 < Static300.anInt4872) {
											aStringArray7[anInt1851++] = Static279.aStringArray19[local13];
											return;
										}
										aStringArray7[anInt1851++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static483.aString100 != null) {
											aStringArray7[anInt1851++] = Static553.method7595(Static483.aString100);
											return;
										}
										aStringArray7[anInt1851++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static483.aString100 != null) {
											anIntArray260[anInt1853++] = Static469.anInt7945;
											return;
										}
										anIntArray260[anInt1853++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray260[--anInt1853];
										if (Static483.aString100 != null && local13 < Static469.anInt7945) {
											aStringArray7[anInt1851++] = Static296.aClass153Array3[local13].aString60;
											return;
										}
										aStringArray7[anInt1851++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray260[--anInt1853];
										if (Static483.aString100 != null && local13 < Static469.anInt7945) {
											anIntArray260[anInt1853++] = Static296.aClass153Array3[local13].anInt3802;
											return;
										}
										anIntArray260[anInt1853++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray260[--anInt1853];
										if (Static483.aString100 != null && local13 < Static469.anInt7945) {
											anIntArray260[anInt1853++] = Static296.aClass153Array3[local13].aByte52;
											return;
										}
										anIntArray260[anInt1853++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray260[anInt1853++] = Static279.aByte58;
										return;
									}
									if (arg0 == 3617) {
										local3921 = aStringArray7[--anInt1851];
										Static210.method3128(local3921);
										return;
									}
									if (arg0 == 3618) {
										anIntArray260[anInt1853++] = Static6.aByte40;
										return;
									}
									if (arg0 == 3619) {
										local3921 = aStringArray7[--anInt1851];
										Static20.method285(local3921);
										return;
									}
									if (arg0 == 3620) {
										Static162.method2375();
										return;
									}
									if (arg0 == 3621) {
										if (Static163.anInt2861 == 0) {
											anIntArray260[anInt1853++] = -1;
											return;
										}
										anIntArray260[anInt1853++] = Static383.anInt6691;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray260[--anInt1853];
										if (Static163.anInt2861 != 0 && local13 < Static383.anInt6691) {
											aStringArray7[anInt1851++] = Static353.aStringArray23[local13];
											if (Static129.aStringArray10[local13] != null) {
												aStringArray7[anInt1851++] = Static129.aStringArray10[local13];
												return;
											}
											aStringArray7[anInt1851++] = "";
											return;
										}
										aStringArray7[anInt1851++] = "";
										aStringArray7[anInt1851++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3921 = aStringArray7[--anInt1851];
										if (local3921.startsWith("<img=0>") || local3921.startsWith("<img=1>")) {
											local3921 = local3921.substring(7);
										}
										anIntArray260[anInt1853++] = Static322.method4981(local3921) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray260[--anInt1853];
										if (Static296.aClass153Array3 != null && local13 < Static469.anInt7945 && Static296.aClass153Array3[local13].aString57.equalsIgnoreCase(Static426.aClass29_Sub2_Sub1_Sub2_2.aString108)) {
											anIntArray260[anInt1853++] = 1;
											return;
										}
										anIntArray260[anInt1853++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static78.aString20 != null) {
											aStringArray7[anInt1851++] = Static78.aString20;
											return;
										}
										aStringArray7[anInt1851++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray260[--anInt1853];
										if (Static483.aString100 != null && local13 < Static469.anInt7945) {
											aStringArray7[anInt1851++] = Static296.aClass153Array3[local13].aString59;
											return;
										}
										aStringArray7[anInt1851++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray260[--anInt1853];
										if (Static163.anInt2861 == 2 && local13 >= 0 && local13 < Static300.anInt4872) {
											anIntArray260[anInt1853++] = Static215.aBooleanArray22[local13] ? 1 : 0;
											return;
										}
										anIntArray260[anInt1853++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3921 = aStringArray7[--anInt1851];
										if (local3921.startsWith("<img=0>") || local3921.startsWith("<img=1>")) {
											local3921 = local3921.substring(7);
										}
										anIntArray260[anInt1853++] = Static321.method4975(local3921);
										return;
									}
									if (arg0 == 3629) {
										anIntArray260[anInt1853++] = Static296.anInt9558;
										return;
									}
									if (arg0 == 3630) {
										local3921 = aStringArray7[--anInt1851];
										Static506.method6960(true, local3921);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = Static354.aBooleanArray34[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray260[--anInt1853];
										if (Static483.aString100 != null && local13 < Static469.anInt7945) {
											aStringArray7[anInt1851++] = Static296.aClass153Array3[local13].aString57;
											return;
										}
										aStringArray7[anInt1851++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray260[--anInt1853];
										if (Static163.anInt2861 != 0 && local13 < Static383.anInt6691) {
											aStringArray7[anInt1851++] = Static521.aStringArray32[local13];
											return;
										}
										aStringArray7[anInt1851++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = Static434.aClass49Array1[local13].method752();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = Static434.aClass49Array1[local13].anInt941;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = Static434.aClass49Array1[local13].anInt948;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = Static434.aClass49Array1[local13].anInt952;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = Static434.aClass49Array1[local13].anInt940;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = Static434.aClass49Array1[local13].anInt946;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray260[--anInt1853];
										local19 = Static434.aClass49Array1[local13].method754();
										anIntArray260[anInt1853++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray260[--anInt1853];
										local19 = Static434.aClass49Array1[local13].method754();
										anIntArray260[anInt1853++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray260[--anInt1853];
										local19 = Static434.aClass49Array1[local13].method754();
										anIntArray260[anInt1853++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray260[--anInt1853];
										local19 = Static434.aClass49Array1[local13].method754();
										anIntArray260[anInt1853++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt1853 -= 5;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										local25 = anIntArray260[anInt1853 + 2];
										local353 = anIntArray260[anInt1853 + 3];
										local2290 = anIntArray260[anInt1853 + 4];
										anIntArray260[anInt1853++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
										return;
									}
									@Pc(7134) long local7134;
									@Pc(7127) long local7127;
									if (arg0 == 4007) {
										anInt1853 -= 2;
										local7127 = anIntArray260[anInt1853];
										local7134 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = (int) (local7127 + local7127 * local7134 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										if (local13 == 0) {
											anIntArray260[anInt1853++] = 0;
											return;
										}
										anIntArray260[anInt1853++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										if (local13 == 0) {
											anIntArray260[anInt1853++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray260[anInt1853++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray260[anInt1853++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt1853 -= 3;
										local7127 = anIntArray260[anInt1853];
										local7134 = anIntArray260[anInt1853 + 1];
										@Pc(7515) long local7515 = (long) anIntArray260[anInt1853 + 2];
										anIntArray260[anInt1853++] = (int) (local7127 * local7515 / local7134);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3921 = aStringArray7[--anInt1851];
										local19 = anIntArray260[--anInt1853];
										aStringArray7[anInt1851++] = local3921 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt1851 -= 2;
										local3921 = aStringArray7[anInt1851];
										local1101 = aStringArray7[anInt1851 + 1];
										aStringArray7[anInt1851++] = local3921 + local1101;
										return;
									}
									if (arg0 == 4102) {
										local3921 = aStringArray7[--anInt1851];
										local19 = anIntArray260[--anInt1853];
										aStringArray7[anInt1851++] = local3921 + Static542.method7491(local19);
										return;
									}
									if (arg0 == 4103) {
										local3921 = aStringArray7[--anInt1851];
										aStringArray7[anInt1851++] = local3921.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray7[anInt1851++] = method1640(anIntArray260[--anInt1853]);
										return;
									}
									if (arg0 == 4105) {
										anInt1851 -= 2;
										local3921 = aStringArray7[anInt1851];
										local1101 = aStringArray7[anInt1851 + 1];
										if (Static426.aClass29_Sub2_Sub1_Sub2_2.aClass246_1 != null && Static426.aClass29_Sub2_Sub1_Sub2_2.aClass246_1.aBoolean487) {
											aStringArray7[anInt1851++] = local1101;
											return;
										}
										aStringArray7[anInt1851++] = local3921;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray260[--anInt1853];
										aStringArray7[anInt1851++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt1851 -= 2;
										anIntArray260[anInt1853++] = Static26.method402(aStringArray7[anInt1851], Static470.anInt7957, aStringArray7[anInt1851 + 1]);
										return;
									}
									@Pc(7798) Class146 local7798;
									if (arg0 == 4108) {
										local3921 = aStringArray7[--anInt1851];
										anInt1853 -= 2;
										local19 = anIntArray260[anInt1853];
										local25 = anIntArray260[anInt1853 + 1];
										local7798 = Static148.method2192(local25, Static492.aClass251_136);
										anIntArray260[anInt1853++] = local7798.method3175(local3921, Static52.aClass4Array1, local19);
										return;
									}
									if (arg0 == 4109) {
										local3921 = aStringArray7[--anInt1851];
										anInt1853 -= 2;
										local19 = anIntArray260[anInt1853];
										local25 = anIntArray260[anInt1853 + 1];
										local7798 = Static148.method2192(local25, Static492.aClass251_136);
										anIntArray260[anInt1853++] = local7798.method3169(local19, local3921, Static52.aClass4Array1);
										return;
									}
									if (arg0 == 4110) {
										anInt1851 -= 2;
										local3921 = aStringArray7[anInt1851];
										local1101 = aStringArray7[anInt1851 + 1];
										if (anIntArray260[--anInt1853] == 1) {
											aStringArray7[anInt1851++] = local3921;
											return;
										}
										aStringArray7[anInt1851++] = local1101;
										return;
									}
									if (arg0 == 4111) {
										local3921 = aStringArray7[--anInt1851];
										aStringArray7[anInt1851++] = Static263.method3732(local3921);
										return;
									}
									if (arg0 == 4112) {
										local3921 = aStringArray7[--anInt1851];
										local19 = anIntArray260[--anInt1853];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray7[anInt1851++] = local3921 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = Static118.method1803((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = Static83.method1316((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = Static546.method7521((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = Static572.method7834((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3921 = aStringArray7[--anInt1851];
										if (local3921 != null) {
											anIntArray260[anInt1853++] = local3921.length();
											return;
										}
										anIntArray260[anInt1853++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3921 = aStringArray7[--anInt1851];
										anInt1853 -= 2;
										local19 = anIntArray260[anInt1853];
										local25 = anIntArray260[anInt1853 + 1];
										aStringArray7[anInt1851++] = local3921.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3921 = aStringArray7[--anInt1851];
										@Pc(8161) StringBuffer local8161 = new StringBuffer(local3921.length());
										@Pc(8163) boolean local8163 = false;
										for (local353 = 0; local353 < local3921.length(); local353++) {
											@Pc(8170) char local8170 = local3921.charAt(local353);
											if (local8170 == '<') {
												local8163 = true;
											} else if (local8170 == '>') {
												local8163 = false;
											} else if (!local8163) {
												local8161.append(local8170);
											}
										}
										aStringArray7[anInt1851++] = local8161.toString();
										return;
									}
									if (arg0 == 4120) {
										local3921 = aStringArray7[--anInt1851];
										anInt1853 -= 2;
										local19 = anIntArray260[anInt1853];
										local25 = anIntArray260[anInt1853 + 1];
										anIntArray260[anInt1853++] = local3921.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt1851 -= 2;
										local3921 = aStringArray7[anInt1851];
										local1101 = aStringArray7[anInt1851 + 1];
										local25 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = local3921.indexOf(local1101, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray260[--anInt1853] != 0;
										local19 = anIntArray260[--anInt1853];
										aStringArray7[anInt1851++] = Static334.method5112((long) local19, Static470.anInt7957, 0, local412);
										return;
									}
									if (arg0 == 4125) {
										local3921 = aStringArray7[--anInt1851];
										local19 = anIntArray260[--anInt1853];
										@Pc(8384) Class146 local8384 = Static148.method2192(local19, Static492.aClass251_136);
										anIntArray260[anInt1853++] = local8384.method3174(Static52.aClass4Array1, local3921);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray260[--anInt1853];
										aStringArray7[anInt1851++] = Static295.aClass256_2.method5924(local13).aString41;
										return;
									}
									@Pc(8446) Class110 local8446;
									if (arg0 == 4201) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										local8446 = Static295.aClass256_2.method5924(local13);
										if (local19 >= 1 && local19 <= 5 && local8446.lb[local19 - 1] != null) {
											aStringArray7[anInt1851++] = local8446.lb[local19 - 1];
											return;
										}
										aStringArray7[anInt1851++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										local8446 = Static295.aClass256_2.method5924(local13);
										if (local19 >= 1 && local19 <= 5 && local8446.aStringArray13[local19 - 1] != null) {
											aStringArray7[anInt1851++] = local8446.aStringArray13[local19 - 1];
											return;
										}
										aStringArray7[anInt1851++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = Static295.aClass256_2.method5924(local13).anInt2652;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = Static295.aClass256_2.method5924(local13).anInt2639 == 1 ? 1 : 0;
										return;
									}
									@Pc(8609) Class110 local8609;
									if (arg0 == 4205) {
										local13 = anIntArray260[--anInt1853];
										local8609 = Static295.aClass256_2.method5924(local13);
										if (local8609.anInt2673 == -1 && local8609.anInt2653 >= 0) {
											anIntArray260[anInt1853++] = local8609.anInt2653;
											return;
										}
										anIntArray260[anInt1853++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray260[--anInt1853];
										local8609 = Static295.aClass256_2.method5924(local13);
										if (local8609.anInt2673 >= 0 && local8609.anInt2653 >= 0) {
											anIntArray260[anInt1853++] = local8609.anInt2653;
											return;
										}
										anIntArray260[anInt1853++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray260[--anInt1853];
										anIntArray260[anInt1853++] = Static295.aClass256_2.method5924(local13).aBoolean180 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										local3024 = Static112.aClass307_1.method6811(local19);
										if (local3024.method7744()) {
											aStringArray7[anInt1851++] = Static295.aClass256_2.method5924(local13).method2198(local19, local3024.aString118);
											return;
										}
										anIntArray260[anInt1853++] = Static295.aClass256_2.method5924(local13).method2201(local19, local3024.anInt9461);
										return;
									}
									if (arg0 == 4209) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1] - 1;
										local8446 = Static295.aClass256_2.method5924(local13);
										if (local8446.anInt2619 == local19) {
											anIntArray260[anInt1853++] = local8446.anInt2648;
											return;
										}
										if (local8446.anInt2625 == local19) {
											anIntArray260[anInt1853++] = local8446.anInt2661;
											return;
										}
										anIntArray260[anInt1853++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3921 = aStringArray7[--anInt1851];
										local19 = anIntArray260[--anInt1853];
										Static526.method7361(local3921, local19 == 1);
										anIntArray260[anInt1853++] = Static7.anInt146;
										return;
									}
									if (arg0 == 4211) {
										if (Static466.aShortArray135 != null && Static527.anInt9003 < Static7.anInt146) {
											anIntArray260[anInt1853++] = Static466.aShortArray135[Static527.anInt9003++] & 0xFFFF;
											return;
										}
										anIntArray260[anInt1853++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static527.anInt9003 = 0;
										return;
									}
									if (arg0 == 4214) {
										local3921 = aStringArray7[--anInt1851];
										anInt1853 -= 3;
										local19 = anIntArray260[anInt1853];
										local25 = anIntArray260[anInt1853 + 1];
										local353 = anIntArray260[anInt1853 + 2];
										Static484.method6713(local353, local25, local19 == 1, local3921);
										anIntArray260[anInt1853++] = Static7.anInt146;
										return;
									}
									if (arg0 == 4215) {
										anInt1851 -= 2;
										anInt1853 -= 2;
										local3921 = aStringArray7[anInt1851];
										local19 = anIntArray260[anInt1853];
										local25 = anIntArray260[anInt1853 + 1];
										@Pc(8984) String local8984 = aStringArray7[anInt1851 + 1];
										Static305.method4678(local3921, local19 == 1, local8984, local25);
										anIntArray260[anInt1853++] = Static7.anInt146;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										local3024 = Static112.aClass307_1.method6811(local19);
										if (local3024.method7744()) {
											aStringArray7[anInt1851++] = Static51.aClass202_1.method4897(local13).method5939(local19, local3024.aString118);
											return;
										}
										anIntArray260[anInt1853++] = Static51.aClass202_1.method4897(local13).method5942(local19, local3024.anInt9461);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										local3024 = Static112.aClass307_1.method6811(local19);
										if (local3024.method7744()) {
											aStringArray7[anInt1851++] = Static260.aClass100_1.method2008(local13).method6980(local19, local3024.aString118);
											return;
										}
										anIntArray260[anInt1853++] = Static260.aClass100_1.method2008(local13).method6966(local3024.anInt9461, local19);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt1853 -= 2;
										local13 = anIntArray260[anInt1853];
										local19 = anIntArray260[anInt1853 + 1];
										local3024 = Static112.aClass307_1.method6811(local19);
										if (local3024.method7744()) {
											aStringArray7[anInt1851++] = Static442.aClass337_1.method7581(local13).method7864(local3024.aString118, local19);
											return;
										}
										anIntArray260[anInt1853++] = Static442.aClass337_1.method7581(local13).method7860(local3024.anInt9461, local19);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray260[--anInt1853];
									@Pc(9212) Class120 local9212 = Static492.aClass189_1.method4109(local13);
									if (local9212.anIntArray331 != null && local9212.anIntArray331.length > 0) {
										local25 = 0;
										local353 = local9212.anIntArray329[0];
										for (local2290 = 1; local2290 < local9212.anIntArray331.length; local2290++) {
											if (local9212.anIntArray329[local2290] > local353) {
												local25 = local2290;
												local353 = local9212.anIntArray329[local2290];
											}
										}
										anIntArray260[anInt1853++] = local9212.anIntArray331[local25];
										return;
									}
									anIntArray260[anInt1853++] = local9212.anInt2886;
									return;
								}
							}
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!mr;I)V")
	private static void method1636(@OriginalArg(0) Class6_Sub36 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray34;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class6_Sub1_Sub17 local12 = Static486.method6717(local8);
		if (local12 == null) {
			return;
		}
		anIntArray258 = new int[local12.anInt9023];
		@Pc(21) int local21 = 0;
		aStringArray8 = new String[local12.anInt9025];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt5755;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt5754;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass97_7 == null ? -1 : arg0.aClass97_7.anInt2311;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt5760;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass97_7 == null ? -1 : arg0.aClass97_7.lb;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass97_8 == null ? -1 : arg0.aClass97_8.anInt2311;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass97_8 == null ? -1 : arg0.aClass97_8.lb;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt5756;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt5759;
				}
				anIntArray258[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString74;
				}
				aStringArray8[local27++] = local135;
			}
		}
		anInt1855 = arg0.anInt5762;
		method1633(local12, arg1);
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V")
	private static void method1637(@OriginalArg(0) int arg0) {
		@Pc(3) Class97 local3 = Static133.method4068(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class97[] local13 = Static538.aClass97ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class97[] local19 = Static375.aClass97ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static538.aClass97ArrayArray2[local9] = new Class97[local22];
			Static585.method3081(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static585.method3081(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "()V")
	public static void method1638() {
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!mr;)V")
	public static void method1639(@OriginalArg(0) Class6_Sub36 arg0) {
		method1636(arg0, 200000);
	}

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "(I)Ljava/lang/String;")
	private static String method1640(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray9[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "(IZ)V")
	private static void method1641(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(75) String local75;
		@Pc(1425) boolean local1425;
		@Pc(89) int local89;
		@Pc(157) int local157;
		@Pc(741) int local741;
		@Pc(163) String local163;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray260[anInt1853++] = Static25.anInt481;
				return;
			}
			if (arg0 == 5001) {
				anInt1853 -= 3;
				Static25.anInt481 = anIntArray260[anInt1853];
				Static493.aClass24_3 = Static305.method4681(anIntArray260[anInt1853 + 1]);
				if (Static493.aClass24_3 == null) {
					Static493.aClass24_3 = Static446.aClass24_2;
				}
				Static92.anInt7190 = anIntArray260[anInt1853 + 2];
				Static136.method2051(Static255.aClass160_57);
				Static218.aClass6_Sub14_Sub2_1.method6035(Static25.anInt481);
				Static218.aClass6_Sub14_Sub2_1.method6035(Static493.aClass24_3.anInt490);
				Static218.aClass6_Sub14_Sub2_1.method6035(Static92.anInt7190);
				return;
			}
			if (arg0 == 5002) {
				anInt1851 -= 2;
				local75 = aStringArray7[anInt1851];
				local81 = aStringArray7[anInt1851 + 1];
				anInt1853 -= 2;
				local89 = anIntArray260[anInt1853];
				local95 = anIntArray260[anInt1853 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static136.method2051(Static448.aClass160_106);
				Static218.aClass6_Sub14_Sub2_1.method6035(Static305.method4688(local75) + Static305.method4688(local81) + 2);
				Static218.aClass6_Sub14_Sub2_1.method5989(local75);
				Static218.aClass6_Sub14_Sub2_1.method6035(local89 - 1);
				Static218.aClass6_Sub14_Sub2_1.method6035(local95);
				Static218.aClass6_Sub14_Sub2_1.method5989(local81);
				return;
			}
			@Pc(161) Class292 local161;
			if (arg0 == 5003) {
				local157 = anIntArray260[--anInt1853];
				local161 = Static416.method6105(local157);
				local163 = "";
				if (local161 != null && local161.aString92 != null) {
					local163 = local161.aString92;
				}
				aStringArray7[anInt1851++] = local163;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray260[--anInt1853];
				local161 = Static416.method6105(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt7896;
				}
				anIntArray260[anInt1853++] = local89;
				return;
			}
			if (arg0 == 5005) {
				if (Static493.aClass24_3 == null) {
					anIntArray260[anInt1853++] = -1;
					return;
				}
				anIntArray260[anInt1853++] = Static493.aClass24_3.anInt490;
				return;
			}
			if (arg0 == 5006) {
				local157 = anIntArray260[--anInt1853];
				Static136.method2051(Static252.aClass160_56);
				Static218.aClass6_Sub14_Sub2_1.method6035(local157);
				return;
			}
			if (arg0 == 5008) {
				local75 = aStringArray7[--anInt1851];
				method1634(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt1851 -= 2;
				local75 = aStringArray7[anInt1851];
				local81 = aStringArray7[anInt1851 + 1];
				if (Static231.anInt3930 != 0 || (!Static451.aBoolean532 || Static558.aBoolean654) && !Static475.aBoolean548) {
					Static136.method2051(Static457.aClass160_55);
					Static218.aClass6_Sub14_Sub2_1.method6035(0);
					local89 = Static218.aClass6_Sub14_Sub2_1.anInt7244;
					Static218.aClass6_Sub14_Sub2_1.method5989(local75);
					Static526.method7358(Static218.aClass6_Sub14_Sub2_1, local81);
					Static218.aClass6_Sub14_Sub2_1.method5985(Static218.aClass6_Sub14_Sub2_1.anInt7244 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray260[--anInt1853];
				local161 = Static416.method6105(local157);
				local163 = "";
				if (local161 != null && local161.aString96 != null) {
					local163 = local161.aString96;
				}
				aStringArray7[anInt1851++] = local163;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray260[--anInt1853];
				local161 = Static416.method6105(local157);
				local163 = "";
				if (local161 != null && local161.aString93 != null) {
					local163 = local161.aString93;
				}
				aStringArray7[anInt1851++] = local163;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray260[--anInt1853];
				local161 = Static416.method6105(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt7895;
				}
				anIntArray260[anInt1853++] = local89;
				return;
			}
			if (arg0 == 5015) {
				if (Static426.aClass29_Sub2_Sub1_Sub2_2 == null || Static426.aClass29_Sub2_Sub1_Sub2_2.aString107 == null) {
					local75 = Static87.aString23;
				} else {
					local75 = Static426.aClass29_Sub2_Sub1_Sub2_2.method7018();
				}
				aStringArray7[anInt1851++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray260[anInt1853++] = Static92.anInt7190;
				return;
			}
			if (arg0 == 5017) {
				anIntArray260[anInt1853++] = Static231.method3389();
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray260[--anInt1853];
				local161 = Static416.method6105(local157);
				local89 = 0;
				if (local161 != null) {
					local89 = local161.anInt7894;
				}
				anIntArray260[anInt1853++] = local89;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray260[--anInt1853];
				local161 = Static416.method6105(local157);
				local163 = "";
				if (local161 != null && local161.aString95 != null) {
					local163 = local161.aString95;
				}
				aStringArray7[anInt1851++] = local163;
				return;
			}
			if (arg0 == 5020) {
				if (Static426.aClass29_Sub2_Sub1_Sub2_2 == null || Static426.aClass29_Sub2_Sub1_Sub2_2.aString107 == null) {
					local75 = Static87.aString23;
				} else {
					local75 = Static426.aClass29_Sub2_Sub1_Sub2_2.method7017();
				}
				aStringArray7[anInt1851++] = local75;
				return;
			}
			if (arg0 == 5023) {
				local157 = anIntArray260[--anInt1853];
				local161 = Static416.method6105(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt7893;
				}
				anIntArray260[anInt1853++] = local89;
				return;
			}
			if (arg0 == 5024) {
				local157 = anIntArray260[--anInt1853];
				local161 = Static416.method6105(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt7889;
				}
				anIntArray260[anInt1853++] = local89;
				return;
			}
			if (arg0 == 5025) {
				local157 = anIntArray260[--anInt1853];
				local161 = Static416.method6105(local157);
				local163 = "";
				if (local161 != null && local161.aString94 != null) {
					local163 = local161.aString94;
				}
				aStringArray7[anInt1851++] = local163;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray260[--anInt1853];
				aStringArray7[anInt1851++] = Static273.aClass288_1.method6461(local157).aString29;
				return;
			}
			@Pc(701) Class6_Sub1_Sub6 local701;
			if (arg0 == 5051) {
				local157 = anIntArray260[--anInt1853];
				local701 = Static273.aClass288_1.method6461(local157);
				if (local701.anIntArray177 == null) {
					anIntArray260[anInt1853++] = 0;
					return;
				}
				anIntArray260[anInt1853++] = local701.anIntArray177.length;
				return;
			}
			if (arg0 == 5052) {
				anInt1853 -= 2;
				local157 = anIntArray260[anInt1853];
				local741 = anIntArray260[anInt1853 + 1];
				@Pc(746) Class6_Sub1_Sub6 local746 = Static273.aClass288_1.method6461(local157);
				local95 = local746.anIntArray177[local741];
				anIntArray260[anInt1853++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray260[--anInt1853];
				local701 = Static273.aClass288_1.method6461(local157);
				if (local701.anIntArray176 == null) {
					anIntArray260[anInt1853++] = 0;
					return;
				}
				anIntArray260[anInt1853++] = local701.anIntArray176.length;
				return;
			}
			if (arg0 == 5054) {
				anInt1853 -= 2;
				local157 = anIntArray260[anInt1853];
				local741 = anIntArray260[anInt1853 + 1];
				anIntArray260[anInt1853++] = Static273.aClass288_1.method6461(local157).anIntArray176[local741];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray260[--anInt1853];
				aStringArray7[anInt1851++] = Static283.aClass44_4.method690(local157).method199();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray260[--anInt1853];
				@Pc(872) Class6_Sub1_Sub2 local872 = Static283.aClass44_4.method690(local157);
				if (local872.anIntArray20 == null) {
					anIntArray260[anInt1853++] = 0;
					return;
				}
				anIntArray260[anInt1853++] = local872.anIntArray20.length;
				return;
			}
			if (arg0 == 5057) {
				anInt1853 -= 2;
				local157 = anIntArray260[anInt1853];
				local741 = anIntArray260[anInt1853 + 1];
				anIntArray260[anInt1853++] = Static283.aClass44_4.method690(local157).anIntArray20[local741];
				return;
			}
			if (arg0 == 5058) {
				aClass192_1 = new Class192();
				aClass192_1.anInt4838 = anIntArray260[--anInt1853];
				aClass192_1.aClass6_Sub1_Sub2_1 = Static283.aClass44_4.method690(aClass192_1.anInt4838);
				aClass192_1.anIntArray460 = new int[aClass192_1.aClass6_Sub1_Sub2_1.method205()];
				return;
			}
			if (arg0 == 5059) {
				Static136.method2051(Static78.aClass160_26);
				Static218.aClass6_Sub14_Sub2_1.method6035(0);
				local157 = Static218.aClass6_Sub14_Sub2_1.anInt7244;
				Static218.aClass6_Sub14_Sub2_1.method6035(0);
				Static218.aClass6_Sub14_Sub2_1.method5999(aClass192_1.anInt4838);
				aClass192_1.aClass6_Sub1_Sub2_1.method206(Static218.aClass6_Sub14_Sub2_1, aClass192_1.anIntArray460);
				Static218.aClass6_Sub14_Sub2_1.method5985(Static218.aClass6_Sub14_Sub2_1.anInt7244 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray7[--anInt1851];
				Static136.method2051(Static420.aClass160_97);
				Static218.aClass6_Sub14_Sub2_1.method6035(0);
				local741 = Static218.aClass6_Sub14_Sub2_1.anInt7244;
				Static218.aClass6_Sub14_Sub2_1.method5989(local75);
				Static218.aClass6_Sub14_Sub2_1.method5999(aClass192_1.anInt4838);
				aClass192_1.aClass6_Sub1_Sub2_1.method206(Static218.aClass6_Sub14_Sub2_1, aClass192_1.anIntArray460);
				Static218.aClass6_Sub14_Sub2_1.method5985(Static218.aClass6_Sub14_Sub2_1.anInt7244 - local741);
				return;
			}
			if (arg0 == 5061) {
				Static136.method2051(Static78.aClass160_26);
				Static218.aClass6_Sub14_Sub2_1.method6035(0);
				local157 = Static218.aClass6_Sub14_Sub2_1.anInt7244;
				Static218.aClass6_Sub14_Sub2_1.method6035(1);
				Static218.aClass6_Sub14_Sub2_1.method5999(aClass192_1.anInt4838);
				aClass192_1.aClass6_Sub1_Sub2_1.method206(Static218.aClass6_Sub14_Sub2_1, aClass192_1.anIntArray460);
				Static218.aClass6_Sub14_Sub2_1.method5985(Static218.aClass6_Sub14_Sub2_1.anInt7244 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt1853 -= 2;
				local157 = anIntArray260[anInt1853];
				local741 = anIntArray260[anInt1853 + 1];
				anIntArray260[anInt1853++] = Static273.aClass288_1.method6461(local157).aCharArray2[local741];
				return;
			}
			if (arg0 == 5063) {
				anInt1853 -= 2;
				local157 = anIntArray260[anInt1853];
				local741 = anIntArray260[anInt1853 + 1];
				anIntArray260[anInt1853++] = Static273.aClass288_1.method6461(local157).aCharArray3[local741];
				return;
			}
			if (arg0 == 5064) {
				anInt1853 -= 2;
				local157 = anIntArray260[anInt1853];
				local741 = anIntArray260[anInt1853 + 1];
				if (local741 == -1) {
					anIntArray260[anInt1853++] = -1;
					return;
				}
				anIntArray260[anInt1853++] = Static273.aClass288_1.method6461(local157).method1472((char) local741);
				return;
			}
			if (arg0 == 5065) {
				anInt1853 -= 2;
				local157 = anIntArray260[anInt1853];
				local741 = anIntArray260[anInt1853 + 1];
				if (local741 == -1) {
					anIntArray260[anInt1853++] = -1;
					return;
				}
				anIntArray260[anInt1853++] = Static273.aClass288_1.method6461(local157).method1475((char) local741);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray260[--anInt1853];
				anIntArray260[anInt1853++] = Static283.aClass44_4.method690(local157).method205();
				return;
			}
			if (arg0 == 5067) {
				anInt1853 -= 2;
				local157 = anIntArray260[anInt1853];
				local741 = anIntArray260[anInt1853 + 1];
				local89 = Static283.aClass44_4.method690(local157).method204(local741).anInt4778;
				anIntArray260[anInt1853++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt1853 -= 2;
				local157 = anIntArray260[anInt1853];
				local741 = anIntArray260[anInt1853 + 1];
				aClass192_1.anIntArray460[local157] = local741;
				return;
			}
			if (arg0 == 5069) {
				anInt1853 -= 2;
				local157 = anIntArray260[anInt1853];
				local741 = anIntArray260[anInt1853 + 1];
				aClass192_1.anIntArray460[local157] = local741;
				return;
			}
			if (arg0 == 5070) {
				anInt1853 -= 3;
				local157 = anIntArray260[anInt1853];
				local741 = anIntArray260[anInt1853 + 1];
				local89 = anIntArray260[anInt1853 + 2];
				@Pc(1377) Class6_Sub1_Sub2 local1377 = Static283.aClass44_4.method690(local157);
				if (local1377.method204(local741).anInt4778 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray260[anInt1853++] = local1377.method201(local89, local741);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray7[--anInt1851];
				local1425 = anIntArray260[--anInt1853] == 1;
				Static500.method6898(local75, local1425);
				anIntArray260[anInt1853++] = Static7.anInt146;
				return;
			}
			if (arg0 == 5072) {
				if (Static466.aShortArray135 != null && Static527.anInt9003 < Static7.anInt146) {
					anIntArray260[anInt1853++] = Static466.aShortArray135[Static527.anInt9003++] & 0xFFFF;
					return;
				}
				anIntArray260[anInt1853++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static527.anInt9003 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static539.aClass88_1.method6348(86)) {
					anIntArray260[anInt1853++] = 1;
					return;
				}
				anIntArray260[anInt1853++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static539.aClass88_1.method6348(82)) {
					anIntArray260[anInt1853++] = 1;
					return;
				}
				anIntArray260[anInt1853++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static539.aClass88_1.method6348(81)) {
					anIntArray260[anInt1853++] = 1;
					return;
				}
				anIntArray260[anInt1853++] = 0;
				return;
			}
		} else {
			@Pc(2762) int local2762;
			@Pc(2036) boolean local2036;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static377.method5520(anIntArray260[--anInt1853]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray260[anInt1853++] = Static391.method2131();
					return;
				}
				if (arg0 == 5205) {
					Static43.method592(anIntArray260[--anInt1853], -1, false, -1);
					return;
				}
				@Pc(1625) Class6_Sub1_Sub9 local1625;
				if (arg0 == 5206) {
					local157 = anIntArray260[--anInt1853];
					local1625 = Static349.method6175(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1625 == null) {
						anIntArray260[anInt1853++] = -1;
						return;
					}
					anIntArray260[anInt1853++] = local1625.anInt3232;
					return;
				}
				@Pc(1658) Class6_Sub1_Sub9 local1658;
				if (arg0 == 5207) {
					local1658 = Static349.method6190(anIntArray260[--anInt1853]);
					if (local1658 != null && local1658.aString46 != null) {
						aStringArray7[anInt1851++] = local1658.aString46;
						return;
					}
					aStringArray7[anInt1851++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray260[anInt1853++] = Static505.anInt8396;
					anIntArray260[anInt1853++] = Static360.anInt6288;
					return;
				}
				if (arg0 == 5209) {
					anIntArray260[anInt1853++] = Static95.anInt1576 + Static349.anInt7457;
					anIntArray260[anInt1853++] = Static387.anInt6906 + Static349.anInt7465;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray260[--anInt1853];
					local1625 = Static349.method6190(local157);
					if (local1625 == null) {
						anIntArray260[anInt1853++] = 0;
						anIntArray260[anInt1853++] = 0;
						return;
					}
					anIntArray260[anInt1853++] = local1625.anInt3226 >> 14 & 0x3FFF;
					anIntArray260[anInt1853++] = local1625.anInt3226 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray260[--anInt1853];
					local1625 = Static349.method6190(local157);
					if (local1625 == null) {
						anIntArray260[anInt1853++] = 0;
						anIntArray260[anInt1853++] = 0;
						return;
					}
					anIntArray260[anInt1853++] = local1625.anInt3231 - local1625.anInt3230;
					anIntArray260[anInt1853++] = local1625.anInt3220 - local1625.anInt3228;
					return;
				}
				@Pc(1848) Class6_Sub34 local1848;
				if (arg0 == 5212) {
					local1848 = Static84.method1338();
					if (local1848 == null) {
						anIntArray260[anInt1853++] = -1;
						anIntArray260[anInt1853++] = -1;
						return;
					}
					anIntArray260[anInt1853++] = local1848.anInt4907;
					local741 = local1848.anInt4909 << 28 | local1848.anInt4906 + Static349.anInt7457 << 14 | local1848.anInt4905 + Static349.anInt7465;
					anIntArray260[anInt1853++] = local741;
					return;
				}
				if (arg0 == 5213) {
					local1848 = Static452.method6444();
					if (local1848 == null) {
						anIntArray260[anInt1853++] = -1;
						anIntArray260[anInt1853++] = -1;
						return;
					}
					anIntArray260[anInt1853++] = local1848.anInt4907;
					local741 = local1848.anInt4909 << 28 | local1848.anInt4906 + Static349.anInt7457 << 14 | local1848.anInt4905 + Static349.anInt7465;
					anIntArray260[anInt1853++] = local741;
					return;
				}
				@Pc(1996) boolean local1996;
				if (arg0 == 5214) {
					local157 = anIntArray260[--anInt1853];
					local1625 = Static277.method3984();
					if (local1625 != null) {
						local1996 = local1625.method2748(local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3, local157 & 0x3FFF, anIntArray261);
						if (local1996) {
							Static21.method289(anIntArray261[1], anIntArray261[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt1853 -= 2;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					@Pc(2034) Class144 local2034 = Static349.method6178(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local2036 = false;
					for (@Pc(2041) Class6_Sub1_Sub9 local2041 = (Class6_Sub1_Sub9) local2034.method3116(); local2041 != null; local2041 = (Class6_Sub1_Sub9) local2034.method3113()) {
						if (local2041.anInt3232 == local741) {
							local2036 = true;
							break;
						}
					}
					if (local2036) {
						anIntArray260[anInt1853++] = 1;
						return;
					}
					anIntArray260[anInt1853++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray260[--anInt1853];
					local1625 = Static349.method6190(local157);
					if (local1625 == null) {
						anIntArray260[anInt1853++] = -1;
						return;
					}
					anIntArray260[anInt1853++] = local1625.anInt3229;
					return;
				}
				if (arg0 == 5220) {
					anIntArray260[anInt1853++] = Static142.anInt2546 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray260[--anInt1853];
					Static21.method289(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1658 = Static277.method3984();
					if (local1658 != null) {
						local1425 = local1658.method2745(Static387.anInt6906 + Static349.anInt7465, anIntArray261, Static95.anInt1576 + Static349.anInt7457);
						if (local1425) {
							anIntArray260[anInt1853++] = anIntArray261[1];
							anIntArray260[anInt1853++] = anIntArray261[2];
							return;
						}
						anIntArray260[anInt1853++] = -1;
						anIntArray260[anInt1853++] = -1;
						return;
					}
					anIntArray260[anInt1853++] = -1;
					anIntArray260[anInt1853++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt1853 -= 2;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					Static43.method592(local157, local741 & 0x3FFF, false, local741 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray260[--anInt1853];
					local1625 = Static277.method3984();
					if (local1625 != null) {
						local1996 = local1625.method2748(local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3, local157 & 0x3FFF, anIntArray261);
						if (local1996) {
							anIntArray260[anInt1853++] = anIntArray261[1];
							anIntArray260[anInt1853++] = anIntArray261[2];
							return;
						}
						anIntArray260[anInt1853++] = -1;
						anIntArray260[anInt1853++] = -1;
						return;
					}
					anIntArray260[anInt1853++] = -1;
					anIntArray260[anInt1853++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray260[--anInt1853];
					local1625 = Static277.method3984();
					if (local1625 != null) {
						local1996 = local1625.method2745(local157 & 0x3FFF, anIntArray261, local157 >> 14 & 0x3FFF);
						if (local1996) {
							anIntArray260[anInt1853++] = anIntArray261[1];
							anIntArray260[anInt1853++] = anIntArray261[2];
							return;
						}
						anIntArray260[anInt1853++] = -1;
						anIntArray260[anInt1853++] = -1;
						return;
					}
					anIntArray260[anInt1853++] = -1;
					anIntArray260[anInt1853++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static210.method3131(anIntArray260[--anInt1853]);
					return;
				}
				if (arg0 == 5227) {
					anInt1853 -= 2;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					Static43.method592(local157, local741 & 0x3FFF, true, local741 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static191.aBoolean218 = anIntArray260[--anInt1853] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray260[anInt1853++] = Static191.aBoolean218 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray260[--anInt1853];
					Static48.method665(local157);
					return;
				}
				@Pc(2554) Class6 local2554;
				if (arg0 == 5231) {
					anInt1853 -= 2;
					local157 = anIntArray260[anInt1853];
					local1425 = anIntArray260[anInt1853 + 1] == 1;
					if (Static91.aClass212_24 != null) {
						local2554 = Static91.aClass212_24.method5106((long) local157);
						if (local2554 != null && !local1425) {
							local2554.method7849();
							return;
						}
						if (local2554 == null && local1425) {
							local2554 = new Class6();
							Static91.aClass212_24.method5104((long) local157, local2554);
						}
					}
					return;
				}
				@Pc(2596) Class6 local2596;
				if (arg0 == 5232) {
					local157 = anIntArray260[--anInt1853];
					if (Static91.aClass212_24 != null) {
						local2596 = Static91.aClass212_24.method5106((long) local157);
						anIntArray260[anInt1853++] = local2596 == null ? 0 : 1;
						return;
					}
					anIntArray260[anInt1853++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt1853 -= 2;
					local157 = anIntArray260[anInt1853];
					local1425 = anIntArray260[anInt1853 + 1] == 1;
					if (Static120.aClass212_5 != null) {
						local2554 = Static120.aClass212_5.method5106((long) local157);
						if (local2554 != null && !local1425) {
							local2554.method7849();
							return;
						}
						if (local2554 == null && local1425) {
							local2554 = new Class6();
							Static120.aClass212_5.method5104((long) local157, local2554);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray260[--anInt1853];
					if (Static120.aClass212_5 != null) {
						local2596 = Static120.aClass212_5.method5106((long) local157);
						anIntArray260[anInt1853++] = local2596 == null ? 0 : 1;
						return;
					}
					anIntArray260[anInt1853++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray260[anInt1853++] = Static349.aClass6_Sub1_Sub9_3 == null ? -1 : Static349.aClass6_Sub1_Sub9_3.anInt3232;
					return;
				}
				if (arg0 == 5236) {
					anInt1853 -= 2;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					local89 = local741 >> 14 & 0x3FFF;
					local95 = local741 & 0x3FFF;
					local2762 = Static61.method777(local157, local95, local89);
					if (local2762 < 0) {
						anIntArray260[anInt1853++] = -1;
						return;
					}
					anIntArray260[anInt1853++] = local2762;
					return;
				}
				if (arg0 == 5237) {
					Static228.method3370();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt1853 -= 2;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					Static111.method1753(local741, local157, 3, false);
					anIntArray260[anInt1853++] = Static147.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static147.aFrame1 != null) {
						Static111.method1753(-1, -1, Static480.aClass6_Sub37_Sub1_1.anInt6045, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2846) Class199[] local2846 = Static39.method564();
					anIntArray260[anInt1853++] = local2846.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray260[--anInt1853];
					@Pc(2870) Class199[] local2870 = Static39.method564();
					anIntArray260[anInt1853++] = local2870[local157].anInt5562;
					anIntArray260[anInt1853++] = local2870[local157].anInt5559;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static480.aClass6_Sub37_Sub1_1.anInt6057;
					local741 = Static480.aClass6_Sub37_Sub1_1.anInt6066;
					local89 = -1;
					@Pc(2907) Class199[] local2907 = Static39.method564();
					for (local2762 = 0; local2762 < local2907.length; local2762++) {
						@Pc(2914) Class199 local2914 = local2907[local2762];
						if (local2914.anInt5562 == local157 && local2914.anInt5559 == local741) {
							local89 = local2762;
							break;
						}
					}
					anIntArray260[anInt1853++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray260[anInt1853++] = Static354.method5293();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray260[--anInt1853];
					if (local157 >= 1 && local157 <= 2) {
						Static111.method1753(-1, -1, local157, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.anInt6045;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray260[--anInt1853];
					if (local157 >= 1 && local157 <= 2) {
						Static480.aClass6_Sub37_Sub1_1.anInt6045 = local157;
						Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt1851 -= 2;
					local75 = aStringArray7[anInt1851];
					local81 = aStringArray7[anInt1851 + 1];
					local89 = anIntArray260[--anInt1853];
					Static136.method2051(Static470.aClass160_108);
					Static218.aClass6_Sub14_Sub2_1.method6035(Static305.method4688(local75) + Static305.method4688(local81) + 1);
					Static218.aClass6_Sub14_Sub2_1.method5989(local75);
					Static218.aClass6_Sub14_Sub2_1.method5989(local81);
					Static218.aClass6_Sub14_Sub2_1.method6035(local89);
					return;
				}
				if (arg0 == 5401) {
					anInt1853 -= 2;
					Static221.aShortArray75[anIntArray260[anInt1853]] = (short) Static547.method7826(anIntArray260[anInt1853 + 1]);
					Static295.aClass256_2.method5930();
					Static295.aClass256_2.method5926();
					Static51.aClass202_1.method4903();
					Static260.method3643();
					return;
				}
				if (arg0 == 5405) {
					anInt1853 -= 2;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					if (local157 >= 0 && local157 < 2) {
						Static215.anIntArrayArrayArray7[local157] = new int[local741 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt1853 -= 7;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1] << 1;
					local89 = anIntArray260[anInt1853 + 2];
					local95 = anIntArray260[anInt1853 + 3];
					local2762 = anIntArray260[anInt1853 + 4];
					@Pc(3182) int local3182 = anIntArray260[anInt1853 + 5];
					@Pc(3188) int local3188 = anIntArray260[anInt1853 + 6];
					if (local157 >= 0 && local157 < 2 && Static215.anIntArrayArrayArray7[local157] != null && local741 >= 0 && local741 < Static215.anIntArrayArrayArray7[local157].length) {
						Static215.anIntArrayArrayArray7[local157][local741] = new int[] { (local89 >> 14 & 0x3FFF) << 9, local95 << 2, (local89 & 0x3FFF) << 9, local3188 };
						Static215.anIntArrayArrayArray7[local157][local741 + 1] = new int[] { (local2762 >> 14 & 0x3FFF) << 9, local3182 << 2, (local2762 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local157 = Static215.anIntArrayArrayArray7[anIntArray260[--anInt1853]].length >> 1;
					anIntArray260[anInt1853++] = local157;
					return;
				}
				if (arg0 == 5411) {
					if (Static147.aFrame1 != null) {
						Static111.method1753(-1, -1, Static480.aClass6_Sub37_Sub1_1.anInt6045, false);
					}
					if (Static183.aFrame2 != null) {
						Static480.method6664();
						System.exit(0);
						return;
					}
					local75 = Static336.aString75 == null ? Static227.method3328() : Static336.aString75;
					Static577.method5079(Static152.aClass57_4, Static567.anInt9503 == 1, local75, false);
					return;
				}
				if (arg0 == 5419) {
					local75 = "";
					if (Static386.aClass278_7 != null) {
						if (Static386.aClass278_7.anObject24 == null) {
							local75 = Static131.method1964(Static386.aClass278_7.anInt7759);
						} else {
							local75 = (String) Static386.aClass278_7.anObject24;
						}
					}
					aStringArray7[anInt1851++] = local75;
					return;
				}
				if (arg0 == 5420) {
					anIntArray260[anInt1853++] = Static152.aClass57_4.aBoolean74 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static147.aFrame1 != null) {
						Static111.method1753(-1, -1, Static480.aClass6_Sub37_Sub1_1.anInt6045, false);
					}
					local75 = aStringArray7[--anInt1851];
					local1425 = anIntArray260[--anInt1853] == 1;
					local163 = Static227.method3328() + local75;
					Static577.method5079(Static152.aClass57_4, Static567.anInt9503 == 1, local163, local1425);
					return;
				}
				if (arg0 == 5422) {
					anInt1851 -= 2;
					local75 = aStringArray7[anInt1851];
					local81 = aStringArray7[anInt1851 + 1];
					local89 = anIntArray260[--anInt1853];
					if (local75.length() > 0) {
						if (Static99.aStringArray6 == null) {
							Static99.aStringArray6 = new String[Static570.anIntArray720[Static57.aClass314_1.anInt8647]];
						}
						Static99.aStringArray6[local89] = local75;
					}
					if (local81.length() > 0) {
						if (Static97.aStringArray5 == null) {
							Static97.aStringArray5 = new String[Static570.anIntArray720[Static57.aClass314_1.anInt8647]];
						}
						Static97.aStringArray5[local89] = local81;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray7[--anInt1851]);
					return;
				}
				if (arg0 == 5424) {
					anInt1853 -= 11;
					Static513.anInt8679 = anIntArray260[anInt1853];
					Static97.anInt1599 = anIntArray260[anInt1853 + 1];
					Static103.anInt9555 = anIntArray260[anInt1853 + 2];
					Static69.anInt1146 = anIntArray260[anInt1853 + 3];
					Static348.anInt8716 = anIntArray260[anInt1853 + 4];
					Static399.anInt7041 = anIntArray260[anInt1853 + 5];
					Static217.anInt3711 = anIntArray260[anInt1853 + 6];
					Static291.anInt4752 = anIntArray260[anInt1853 + 7];
					Static443.anInt7704 = anIntArray260[anInt1853 + 8];
					Static326.anInt5868 = anIntArray260[anInt1853 + 9];
					Static388.anInt6923 = anIntArray260[anInt1853 + 10];
					Static447.aClass251_141.method5859(Static348.anInt8716);
					Static447.aClass251_141.method5859(Static399.anInt7041);
					Static447.aClass251_141.method5859(Static217.anInt3711);
					Static447.aClass251_141.method5859(Static291.anInt4752);
					Static447.aClass251_141.method5859(Static443.anInt7704);
					Static231.aClass4_11 = null;
					Static355.aClass4_20 = null;
					Static404.aClass4_23 = null;
					Static245.aClass4_13 = null;
					Static240.aClass4_12 = null;
					Static476.aClass4_30 = null;
					Static481.aClass4_31 = null;
					Static1.aClass4_1 = null;
					Static206.aBoolean233 = true;
					return;
				}
				if (arg0 == 5425) {
					Static293.method4105();
					Static206.aBoolean233 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt1853 -= 2;
					Static48.anInt822 = anIntArray260[anInt1853];
					Static569.anInt9540 = anIntArray260[anInt1853 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt1853 -= 2;
					Static568.anInt9516 = anIntArray260[anInt1853 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt1853 -= 2;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					anIntArray260[anInt1853++] = Static314.method4887(local741, local157) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static361.method5343(false, aStringArray7[--anInt1851], false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static587.method3349(Static189.anApplet4, "accountcreated");
						return;
					} catch (@Pc(3720) Throwable local3720) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static587.method3349(Static189.anApplet4, "accountcreatestarted");
						return;
					} catch (@Pc(3731) Throwable local3731) {
						return;
					}
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt1853 -= 4;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					local89 = anIntArray260[anInt1853 + 2];
					local95 = anIntArray260[anInt1853 + 3];
					Static495.method6814(local95, local89, local741 << 2, (local157 & 0x3FFF) - Static167.anInt3048, (local157 >> 14 & 0x3FFF) - Static218.anInt3718, false);
					return;
				}
				if (arg0 == 5501) {
					anInt1853 -= 4;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					local89 = anIntArray260[anInt1853 + 2];
					local95 = anIntArray260[anInt1853 + 3];
					Static575.method7841(local95, (local157 >> 14 & 0x3FFF) - Static218.anInt3718, (local157 & 0x3FFF) - Static167.anInt3048, local89, local741 << 2);
					return;
				}
				if (arg0 == 5502) {
					anInt1853 -= 6;
					local157 = anIntArray260[anInt1853];
					if (local157 >= 2) {
						throw new RuntimeException();
					}
					Static141.anInt2540 = local157;
					local741 = anIntArray260[anInt1853 + 1];
					if (local741 + 1 >= Static215.anIntArrayArrayArray7[Static141.anInt2540].length >> 1) {
						throw new RuntimeException();
					}
					Static29.anInt524 = local741;
					Static395.anInt6993 = 0;
					Static263.anInt4339 = anIntArray260[anInt1853 + 2];
					Static232.anInt3958 = anIntArray260[anInt1853 + 3];
					local89 = anIntArray260[anInt1853 + 4];
					if (local89 >= 2) {
						throw new RuntimeException();
					}
					Static544.anInt9197 = local89;
					local95 = anIntArray260[anInt1853 + 5];
					if (local95 + 1 >= Static215.anIntArrayArrayArray7[Static544.anInt9197].length >> 1) {
						throw new RuntimeException();
					}
					Static246.anInt4088 = local95;
					Static354.anInt6233 = 3;
					return;
				}
				if (arg0 == 5503) {
					Static361.method5344();
					return;
				}
				if (arg0 == 5504) {
					anInt1853 -= 2;
					Static145.method2163(anIntArray260[anInt1853], anIntArray260[anInt1853 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray260[anInt1853++] = (int) Static475.aFloat174 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray260[anInt1853++] = (int) Static399.aFloat167 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static389.method5786();
					return;
				}
				if (arg0 == 5508) {
					Static311.method4822();
					return;
				}
				if (arg0 == 5509) {
					Static495.method6819();
					return;
				}
				if (arg0 == 5510) {
					Static339.method5133();
					return;
				}
				if (arg0 == 5511) {
					local157 = anIntArray260[--anInt1853];
					local741 = local157 >> 14 & 0x3FFF;
					local89 = local157 & 0x3FFF;
					local741 -= Static218.anInt3718;
					if (local741 < 0) {
						local741 = 0;
					} else if (local741 >= Static301.anInt4912) {
						local741 = Static301.anInt4912;
					}
					local89 -= Static167.anInt3048;
					if (local89 < 0) {
						local89 = 0;
					} else if (local89 >= Static473.anInt7969) {
						local89 = Static473.anInt7969;
					}
					Static135.anInt2370 = (local741 << 9) + 256;
					Static224.anInt3801 = (local89 << 9) + 256;
					Static354.anInt6233 = 4;
					return;
				}
				if (arg0 == 5512) {
					Static498.method6884();
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt1851 -= 2;
					local75 = aStringArray7[anInt1851];
					local81 = aStringArray7[anInt1851 + 1];
					local89 = anIntArray260[--anInt1853];
					if (Static146.anInt2581 != 3) {
						return;
					}
					if (Static141.anInt2537 == 0 && Static154.anInt2734 == 0) {
						Static87.aString23 = local75;
						Static442.aString89 = local81;
						Static177.anInt3167 = local89;
						Static99.method1593(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static552.method7592();
					return;
				}
				if (arg0 == 5602) {
					if (Static141.anInt2537 == 0) {
						Static350.anInt6170 = -2;
						Static350.anInt6166 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt1853 -= 4;
					if (Static146.anInt2581 != 3) {
						return;
					}
					if (Static141.anInt2537 == 0 && Static154.anInt2734 == 0) {
						Static433.method6257(anIntArray260[anInt1853 + 1], anIntArray260[anInt1853 + 2], anIntArray260[anInt1853 + 3], anIntArray260[anInt1853]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt1851--;
					if (Static146.anInt2581 != 3) {
						return;
					}
					if (Static141.anInt2537 == 0 && Static154.anInt2734 == 0) {
						Static195.method2934(Static230.method3382(aStringArray7[anInt1851]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt1851 -= 2;
					if (Static146.anInt2581 != 3) {
						return;
					}
					if (Static141.anInt2537 == 0 && Static154.anInt2734 == 0) {
						Static483.method6709(Static230.method3382(aStringArray7[anInt1851]), aStringArray7[anInt1851 + 1], false);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static154.anInt2734 == 0) {
						Static102.anInt1886 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray260[anInt1853++] = Static350.anInt6166;
					return;
				}
				if (arg0 == 5608) {
					anIntArray260[anInt1853++] = Static213.anInt472;
					return;
				}
				if (arg0 == 5609) {
					anIntArray260[anInt1853++] = Static102.anInt1886;
					return;
				}
				if (arg0 == 5610) {
					for (local157 = 0; local157 < 5; local157++) {
						aStringArray7[anInt1851++] = Static466.aStringArray27.length > local157 ? Static553.method7595(Static466.aStringArray27[local157]) : "";
					}
					Static466.aStringArray27 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray260[anInt1853++] = Static287.anInt9621;
					return;
				}
				if (arg0 == 5612) {
					local157 = anIntArray260[--anInt1853];
					if (Static146.anInt2581 != 7) {
						return;
					}
					if (Static141.anInt2537 == 0 && Static154.anInt2734 == 0) {
						if (Static225.aClass71_1 != null) {
							Static225.aClass71_1.method5970();
							Static225.aClass71_1 = null;
						}
						Static177.anInt3167 = local157;
						Static99.method1593(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray260[anInt1853++] = Static350.anInt6166;
					return;
				}
				if (arg0 == 5615) {
					anInt1851 -= 2;
					local75 = aStringArray7[anInt1851];
					local81 = aStringArray7[anInt1851 + 1];
					if (Static146.anInt2581 != 3) {
						return;
					}
					if (Static141.anInt2537 == 0 && Static154.anInt2734 == 0) {
						if (Static225.aClass71_1 != null) {
							Static225.aClass71_1.method5970();
							Static225.aClass71_1 = null;
						}
						Static87.aString23 = local75;
						Static442.aString89 = local81;
						Static99.method1593(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static155.method2280(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray260[anInt1853++] = Static350.anInt6170;
					return;
				}
				if (arg0 == 5618) {
					local157 = anIntArray260[--anInt1853];
					Static532.method7402(false, local157);
					return;
				}
				if (arg0 == 5619) {
					local157 = anIntArray260[--anInt1853];
					Static532.method7402(true, local157);
					return;
				}
				if (arg0 == 5620) {
					Static156.method2290();
					if (Static187.aString49 != "" && Static187.aString49 != "") {
						anIntArray260[anInt1853++] = 1;
						return;
					}
					anIntArray260[anInt1853++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt1851 -= 2;
					if (Static146.anInt2581 != 3) {
						return;
					}
					if (Static141.anInt2537 == 0 && Static154.anInt2734 == 0) {
						Static483.method6709(Static230.method3382(aStringArray7[anInt1851]), aStringArray7[anInt1851 + 1], true);
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4525) Class278 local4525 = Static152.aClass57_4.method929(false, "3");
					while (local4525.anInt7757 == 0) {
						Static149.method2211(1L);
					}
					if (local4525.anInt7757 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4545) Class133 local4545 = (Class133) local4525.anObject24;
					if (local4545.method2790().exists()) {
						@Pc(4555) Class6_Sub14 local4555 = new Class6_Sub14(50);
						try {
							local4545.method2786(local4555.aByteArray88, 0, 50);
						} catch (@Pc(4564) IOException local4564) {
						}
					}
					try {
						local4545.method2788();
						return;
					} catch (@Pc(4570) Exception local4570) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static89.aString25 != null) {
						anIntArray260[anInt1853++] = 1;
						return;
					}
					anIntArray260[anInt1853++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray260[anInt1853++] = (int) (Static421.aLong191 >> 32);
					anIntArray260[anInt1853++] = (int) (Static421.aLong191 & 0xFFFFL);
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local157 = anIntArray260[--anInt1853];
					if (local157 < 1) {
						local157 = 1;
					}
					if (local157 > 4) {
						local157 = 4;
					}
					Static480.aClass6_Sub37_Sub1_1.anInt6064 = local157;
					Static32.method456();
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6002) {
					Static480.aClass6_Sub37_Sub1_1.method5169(anIntArray260[--anInt1853] == 1);
					Static32.method456();
					Static358.method5319();
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6003) {
					Static480.aClass6_Sub37_Sub1_1.aBoolean400 = anIntArray260[--anInt1853] == 1;
					Static358.method5319();
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6005) {
					Static480.aClass6_Sub37_Sub1_1.aBoolean402 = anIntArray260[--anInt1853] == 1;
					Static32.method456();
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6006) {
					Static480.aClass6_Sub37_Sub1_1.aBoolean405 = anIntArray260[--anInt1853] == 1;
					Static176.aClass121_5.method7102(!Static480.aClass6_Sub37_Sub1_1.aBoolean405);
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6007) {
					Static480.aClass6_Sub37_Sub1_1.anInt6042 = anIntArray260[--anInt1853];
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6008) {
					Static480.aClass6_Sub37_Sub1_1.aBoolean410 = anIntArray260[--anInt1853] == 1;
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6009) {
					Static480.aClass6_Sub37_Sub1_1.aBoolean408 = anIntArray260[--anInt1853] == 1;
					Static32.method456();
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6010) {
					Static480.aClass6_Sub37_Sub1_1.aBoolean413 = anIntArray260[--anInt1853] == 1;
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6011) {
					local157 = anIntArray260[--anInt1853];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static480.aClass6_Sub37_Sub1_1.method5148(Static567.anInt9503, local157);
					Static32.method456();
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6012) {
					Static480.aClass6_Sub37_Sub1_1.method5145(anIntArray260[--anInt1853] == 1, Static567.anInt9503);
					Static321.method4977();
					Static528.method7588();
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6014) {
					Static480.aClass6_Sub37_Sub1_1.aBoolean396 = anIntArray260[--anInt1853] == 1;
					Static32.method456();
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6015) {
					Static480.aClass6_Sub37_Sub1_1.aBoolean406 = anIntArray260[--anInt1853] == 1;
					Static32.method456();
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6016) {
					local157 = anIntArray260[--anInt1853];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static480.aClass6_Sub37_Sub1_1.anInt6052 = local157;
					Static360.method5340(Static567.anInt9503);
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					return;
				}
				if (arg0 == 6017) {
					Static480.aClass6_Sub37_Sub1_1.aBoolean397 = anIntArray260[--anInt1853] == 1;
					Static343.method5178();
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6018) {
					local157 = anIntArray260[--anInt1853];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static480.aClass6_Sub37_Sub1_1.anInt6047 = local157;
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6019) {
					local157 = anIntArray260[--anInt1853];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 255) {
						local157 = 255;
					}
					if (local157 != Static480.aClass6_Sub37_Sub1_1.anInt6060) {
						if (Static480.aClass6_Sub37_Sub1_1.anInt6060 == 0 && Static524.anInt8993 != -1) {
							Static483.method6704(Static375.aClass251_107, local157, Static524.anInt8993);
							Static150.aBoolean182 = false;
						} else if (local157 == 0) {
							Static161.method2371();
							Static150.aBoolean182 = false;
						} else {
							Static470.method6578(local157);
						}
						Static480.aClass6_Sub37_Sub1_1.anInt6060 = local157;
					}
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6020) {
					local157 = anIntArray260[--anInt1853];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static480.aClass6_Sub37_Sub1_1.anInt6058 = local157;
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6021) {
					Static480.aClass6_Sub37_Sub1_1.aBoolean416 = anIntArray260[--anInt1853] == 1;
					Static358.method5319();
					return;
				}
				if (arg0 == 6023) {
					local157 = anIntArray260[--anInt1853];
					local1425 = false;
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 2) {
						local157 = 2;
					}
					if (Static31.anInt551 < 96) {
						local157 = 0;
						local1425 = true;
					}
					Static186.method2764(local157);
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					anIntArray260[anInt1853++] = local1425 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local157 = anIntArray260[--anInt1853];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static480.aClass6_Sub37_Sub1_1.anInt6048 = local157;
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					return;
				}
				if (arg0 == 6025) {
					local157 = anIntArray260[--anInt1853];
					if (local157 < 0 || local157 > Static224.method3261(Static31.anInt551)) {
						local157 = 0;
					}
					Static480.aClass6_Sub37_Sub1_1.anInt6061 = local157;
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6027) {
					local157 = anIntArray260[--anInt1853];
					if (local157 < 0 || local157 > 1) {
						local157 = 0;
					}
					Static540.method7485(local157 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static480.aClass6_Sub37_Sub1_1.aBoolean398 = anIntArray260[--anInt1853] != 0;
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					return;
				}
				if (arg0 == 6029) {
					Static480.aClass6_Sub37_Sub1_1.anInt6042 = anIntArray260[--anInt1853];
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					return;
				}
				if (arg0 == 6030) {
					Static480.aClass6_Sub37_Sub1_1.aBoolean409 = anIntArray260[--anInt1853] != 0;
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static32.method456();
					return;
				}
				if (arg0 == 6031) {
					local157 = anIntArray260[--anInt1853];
					if (local157 < 0 || local157 > 5) {
						local157 = 2;
					}
					Static360.method5340(local157);
					return;
				}
				if (arg0 == 6032) {
					local157 = anIntArray260[--anInt1853];
					if (local157 < 0 || local157 > 5) {
						local157 = 2;
					}
					Static480.aClass6_Sub37_Sub1_1.anInt6046 = local157;
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6033) {
					local157 = anIntArray260[--anInt1853];
					if (local157 < 0 || local157 > 4) {
						local157 = 2;
					}
					Static480.aClass6_Sub37_Sub1_1.anInt6053 = local157;
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					return;
				}
				if (arg0 == 6034) {
					Static480.aClass6_Sub37_Sub1_1.aBoolean401 = anIntArray260[--anInt1853] == 1;
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static321.method4977();
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6035) {
					Static480.aClass6_Sub37_Sub1_1.aBoolean417 = anIntArray260[--anInt1853] == 1;
					Static32.method456();
					Static358.method5319();
					return;
				}
				if (arg0 == 6036) {
					local157 = anIntArray260[--anInt1853];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static480.aClass6_Sub37_Sub1_1.method5162(local157);
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					return;
				}
				if (arg0 == 6037) {
					local157 = anIntArray260[--anInt1853];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static480.aClass6_Sub37_Sub1_1.anInt6049 = local157;
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6038) {
					local157 = anIntArray260[--anInt1853];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 255) {
						local157 = 255;
					}
					if (local157 != Static480.aClass6_Sub37_Sub1_1.anInt6056 && Static524.anInt8993 == Static318.anInt5763) {
						if (Static480.aClass6_Sub37_Sub1_1.anInt6056 == 0) {
							Static483.method6704(Static375.aClass251_107, local157, Static524.anInt8993);
							Static150.aBoolean182 = false;
						} else if (local157 == 0) {
							Static161.method2371();
							Static150.aBoolean182 = false;
						} else {
							Static470.method6578(local157);
						}
					}
					Static480.aClass6_Sub37_Sub1_1.anInt6056 = local157;
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 6039) {
					local157 = anIntArray260[--anInt1853];
					if (local157 > 255 || local157 < 0) {
						local157 = 0;
					}
					if (local157 != Static480.aClass6_Sub37_Sub1_1.anInt6062) {
						Static480.aClass6_Sub37_Sub1_1.anInt6062 = local157;
						Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
						Static474.aBoolean543 = false;
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.anInt6064;
					return;
				}
				if (arg0 == 6102) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.method5161(Static567.anInt9503) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.aBoolean400 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.aBoolean402 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.aBoolean405 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.anInt6042;
					return;
				}
				if (arg0 == 6108) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.aBoolean410 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.aBoolean408 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.aBoolean413 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.method5149(Static567.anInt9503);
					return;
				}
				if (arg0 == 6112) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.method5151(Static567.anInt9503) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.aBoolean396 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.aBoolean406 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.anInt6052;
					return;
				}
				if (arg0 == 6117) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.aBoolean397 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.anInt6047;
					return;
				}
				if (arg0 == 6119) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.anInt6060;
					return;
				}
				if (arg0 == 6120) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.anInt6058;
					return;
				}
				if (arg0 == 6121) {
					anIntArray260[anInt1853++] = Static176.aClass121_5.method7134() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray260[anInt1853++] = Static249.method3547();
					return;
				}
				if (arg0 == 6124) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.anInt6048;
					return;
				}
				if (arg0 == 6125) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.anInt6061;
					return;
				}
				if (arg0 == 6126) {
					anIntArray260[anInt1853++] = Static176.aClass121_5.method7145() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.aBoolean411 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.aBoolean398 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.anInt6042;
					return;
				}
				if (arg0 == 6130) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.aBoolean409 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray260[anInt1853++] = Static567.anInt9503;
					return;
				}
				if (arg0 == 6132) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.anInt6046;
					return;
				}
				if (arg0 == 6133) {
					anIntArray260[anInt1853++] = Static152.aClass57_4.aBoolean74 && !Static152.aClass57_4.aBoolean75 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray260[anInt1853++] = Static224.method3261(Static31.anInt551);
					return;
				}
				if (arg0 == 6135) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.anInt6053;
					return;
				}
				if (arg0 == 6136) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.aBoolean401 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(6158) boolean local6158 = true;
					try {
						local6158 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(6168) Throwable local6168) {
					}
					anIntArray260[anInt1853++] = local6158 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray260[anInt1853++] = Static137.method2054(Static567.anInt9503, 200);
					return;
				}
				if (arg0 == 6139) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.method5156(Static567.anInt9503);
					return;
				}
				if (arg0 == 6140) {
					@Pc(6216) byte local6216 = 0;
					if (Static256.method3623(Static567.anInt9503) && Static31.anInt551 < 96) {
						local6216 = 1;
					}
					anIntArray260[anInt1853++] = local6216;
					return;
				}
				if (arg0 == 6141) {
					if (Static31.anInt551 < 96) {
						anIntArray260[anInt1853++] = 0;
						return;
					}
					anIntArray260[anInt1853++] = 2;
					return;
				}
				if (arg0 == 6142) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.anInt6049;
					return;
				}
				if (arg0 == 6143) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.anInt6056;
					return;
				}
				if (arg0 == 6144) {
					anIntArray260[anInt1853++] = Static491.aBoolean558 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.anInt6062;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt1853 -= 2;
					Static335.aShort87 = (short) anIntArray260[anInt1853];
					if (Static335.aShort87 <= 0) {
						Static335.aShort87 = 256;
					}
					Static372.aShort75 = (short) anIntArray260[anInt1853 + 1];
					if (Static372.aShort75 <= 0) {
						Static372.aShort75 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt1853 -= 2;
					Static40.aShort7 = (short) anIntArray260[anInt1853];
					if (Static40.aShort7 <= 0) {
						Static40.aShort7 = 256;
					}
					Static270.aShort57 = (short) anIntArray260[anInt1853 + 1];
					if (Static270.aShort57 <= 0) {
						Static270.aShort57 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt1853 -= 4;
					Static383.aShort94 = (short) anIntArray260[anInt1853];
					if (Static383.aShort94 <= 0) {
						Static383.aShort94 = 1;
					}
					Static487.aShort110 = (short) anIntArray260[anInt1853 + 1];
					if (Static487.aShort110 <= 0) {
						Static487.aShort110 = 32767;
					} else if (Static487.aShort110 < Static383.aShort94) {
						Static487.aShort110 = Static383.aShort94;
					}
					Static521.aShort120 = (short) anIntArray260[anInt1853 + 2];
					if (Static521.aShort120 <= 0) {
						Static521.aShort120 = 1;
					}
					Static264.aShort74 = (short) anIntArray260[anInt1853 + 3];
					if (Static264.aShort74 <= 0) {
						Static264.aShort74 = 32767;
						return;
					}
					if (Static264.aShort74 < Static521.aShort120) {
						Static264.aShort74 = Static521.aShort120;
					}
					return;
				}
				if (arg0 == 6203) {
					Static519.method7323(false, 0, 0, Static405.aClass97_11.anInt2340, Static405.aClass97_11.anInt2305);
					anIntArray260[anInt1853++] = Static26.anInt486;
					anIntArray260[anInt1853++] = Static63.anInt1005;
					return;
				}
				if (arg0 == 6204) {
					anIntArray260[anInt1853++] = Static40.aShort7;
					anIntArray260[anInt1853++] = Static270.aShort57;
					return;
				}
				if (arg0 == 6205) {
					anIntArray260[anInt1853++] = Static335.aShort87;
					anIntArray260[anInt1853++] = Static372.aShort75;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray260[anInt1853++] = (int) (Static137.method2058() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray260[anInt1853++] = (int) (Static137.method2058() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt1853 -= 3;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					local89 = anIntArray260[anInt1853 + 2];
					aCalendar2.clear();
					aCalendar2.set(11, 12);
					aCalendar2.set(local89, local741, local157);
					local95 = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
					if (local89 < 1970) {
						local95--;
					}
					anIntArray260[anInt1853++] = local95;
					return;
				}
				if (arg0 == 6303) {
					aCalendar2.clear();
					aCalendar2.setTime(new Date(Static137.method2058()));
					anIntArray260[anInt1853++] = aCalendar2.get(1);
					return;
				}
				if (arg0 == 6304) {
					local157 = anIntArray260[--anInt1853];
					local1425 = true;
					if (local157 < 0) {
						local1425 = (local157 + 1) % 4 == 0;
					} else if (local157 < 1582) {
						local1425 = local157 % 4 == 0;
					} else if (local157 % 4 != 0) {
						local1425 = false;
					} else if (local157 % 100 != 0) {
						local1425 = true;
					} else if (local157 % 400 != 0) {
						local1425 = false;
					}
					anIntArray260[anInt1853++] = local1425 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray260[anInt1853++] = Static29.method432() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray260[anInt1853++] = Static343.method5176() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static146.anInt2581 == 7 && Static141.anInt2537 == 0 && Static154.anInt2734 == 0) {
						if (Static238.aBoolean256) {
							anIntArray260[anInt1853++] = 0;
							return;
						}
						if (Static131.aLong65 > Static137.method2058() - 1000L) {
							anIntArray260[anInt1853++] = 1;
							return;
						}
						Static238.aBoolean256 = true;
						Static136.method2051(Static137.aClass160_38);
						Static218.aClass6_Sub14_Sub2_1.method5990(Static457.anInt4062);
						anIntArray260[anInt1853++] = 0;
						return;
					}
					anIntArray260[anInt1853++] = 1;
					return;
				}
				@Pc(6833) Class323 local6833;
				@Pc(6800) Class8_Sub1 local6800;
				if (arg0 == 6501) {
					local6800 = Static551.method7583();
					if (local6800 != null) {
						anIntArray260[anInt1853++] = local6800.anInt2019;
						anIntArray260[anInt1853++] = local6800.anInt2009;
						aStringArray7[anInt1851++] = local6800.aString32;
						local6833 = local6800.method1748();
						anIntArray260[anInt1853++] = local6833.anInt8996;
						aStringArray7[anInt1851++] = local6833.aString113;
						anIntArray260[anInt1853++] = local6800.anInt2011;
						anIntArray260[anInt1853++] = local6800.anInt2022;
						aStringArray7[anInt1851++] = local6800.aString33;
						return;
					}
					anIntArray260[anInt1853++] = -1;
					anIntArray260[anInt1853++] = 0;
					aStringArray7[anInt1851++] = "";
					anIntArray260[anInt1853++] = 0;
					aStringArray7[anInt1851++] = "";
					anIntArray260[anInt1853++] = 0;
					anIntArray260[anInt1853++] = 0;
					aStringArray7[anInt1851++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6800 = Static44.method596();
					if (local6800 != null) {
						anIntArray260[anInt1853++] = local6800.anInt2019;
						anIntArray260[anInt1853++] = local6800.anInt2009;
						aStringArray7[anInt1851++] = local6800.aString32;
						local6833 = local6800.method1748();
						anIntArray260[anInt1853++] = local6833.anInt8996;
						aStringArray7[anInt1851++] = local6833.aString113;
						anIntArray260[anInt1853++] = local6800.anInt2011;
						anIntArray260[anInt1853++] = local6800.anInt2022;
						aStringArray7[anInt1851++] = local6800.aString33;
						return;
					}
					anIntArray260[anInt1853++] = -1;
					anIntArray260[anInt1853++] = 0;
					aStringArray7[anInt1851++] = "";
					anIntArray260[anInt1853++] = 0;
					aStringArray7[anInt1851++] = "";
					anIntArray260[anInt1853++] = 0;
					anIntArray260[anInt1853++] = 0;
					aStringArray7[anInt1851++] = "";
					return;
				}
				if (arg0 == 6503) {
					local157 = anIntArray260[--anInt1853];
					local81 = aStringArray7[--anInt1851];
					if (Static146.anInt2581 == 7 && Static141.anInt2537 == 0 && Static154.anInt2734 == 0) {
						anIntArray260[anInt1853++] = Static122.method1852(local157, local81) ? 1 : 0;
						return;
					}
					anIntArray260[anInt1853++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static480.aClass6_Sub37_Sub1_1.anInt6054 = anIntArray260[--anInt1853];
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					return;
				}
				if (arg0 == 6505) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.anInt6054;
					return;
				}
				if (arg0 == 6506) {
					local157 = anIntArray260[--anInt1853];
					@Pc(7190) Class8_Sub1 local7190 = Static92.method5966(local157);
					if (local7190 != null) {
						anIntArray260[anInt1853++] = local7190.anInt2009;
						aStringArray7[anInt1851++] = local7190.aString32;
						@Pc(7214) Class323 local7214 = local7190.method1748();
						anIntArray260[anInt1853++] = local7214.anInt8996;
						aStringArray7[anInt1851++] = local7214.aString113;
						anIntArray260[anInt1853++] = local7190.anInt2011;
						anIntArray260[anInt1853++] = local7190.anInt2022;
						aStringArray7[anInt1851++] = local7190.aString33;
						return;
					}
					anIntArray260[anInt1853++] = -1;
					aStringArray7[anInt1851++] = "";
					anIntArray260[anInt1853++] = 0;
					aStringArray7[anInt1851++] = "";
					anIntArray260[anInt1853++] = 0;
					anIntArray260[anInt1853++] = 0;
					aStringArray7[anInt1851++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt1853 -= 4;
					local157 = anIntArray260[anInt1853];
					local1425 = anIntArray260[anInt1853 + 1] == 1;
					local89 = anIntArray260[anInt1853 + 2];
					local2036 = anIntArray260[anInt1853 + 3] == 1;
					Static102.method1658(local89, local157, local2036, local1425);
					return;
				}
				if (arg0 == 6508) {
					Static468.method6558();
					return;
				}
				if (arg0 == 6509) {
					if (Static146.anInt2581 != 7) {
						return;
					}
					Static435.aBoolean524 = anIntArray260[--anInt1853] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray260[anInt1853++] = Static161.anInt2834;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static480.aClass6_Sub37_Sub1_1.aBoolean412 = anIntArray260[--anInt1853] == 1;
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					return;
				}
				if (arg0 == 6601) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.aBoolean412 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static166.aClass210_6 == Static80.aClass210_4) {
				if (arg0 == 6700) {
					local157 = Static564.aClass212_39.method5105();
					if (Static487.anInt8139 != -1) {
						local157++;
					}
					anIntArray260[anInt1853++] = local157;
					return;
				}
				if (arg0 == 6701) {
					local157 = anIntArray260[--anInt1853];
					if (Static487.anInt8139 != -1) {
						if (local157 == 0) {
							anIntArray260[anInt1853++] = Static487.anInt8139;
							return;
						}
						local157--;
					}
					@Pc(7501) Class6_Sub31 local7501 = (Class6_Sub31) Static564.aClass212_39.method5099();
					while (local157-- > 0) {
						local7501 = (Class6_Sub31) Static564.aClass212_39.method5103();
					}
					anIntArray260[anInt1853++] = local7501.anInt4563;
					return;
				}
				if (arg0 == 6702) {
					local157 = anIntArray260[--anInt1853];
					if (Static375.aClass97ArrayArray1[local157] == null) {
						aStringArray7[anInt1851++] = "";
						return;
					}
					local81 = Static375.aClass97ArrayArray1[local157][0].aString35;
					if (local81 == null) {
						aStringArray7[anInt1851++] = "";
						return;
					}
					aStringArray7[anInt1851++] = local81.substring(0, local81.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local157 = anIntArray260[--anInt1853];
					if (Static375.aClass97ArrayArray1[local157] == null) {
						anIntArray260[anInt1853++] = 0;
						return;
					}
					anIntArray260[anInt1853++] = Static375.aClass97ArrayArray1[local157].length;
					return;
				}
				if (arg0 == 6704) {
					anInt1853 -= 2;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					if (Static375.aClass97ArrayArray1[local157] == null) {
						aStringArray7[anInt1851++] = "";
						return;
					}
					local163 = Static375.aClass97ArrayArray1[local157][local741].aString35;
					if (local163 == null) {
						aStringArray7[anInt1851++] = "";
						return;
					}
					aStringArray7[anInt1851++] = local163;
					return;
				}
				if (arg0 == 6705) {
					anInt1853 -= 2;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					if (Static375.aClass97ArrayArray1[local157] == null) {
						anIntArray260[anInt1853++] = 0;
						return;
					}
					anIntArray260[anInt1853++] = Static375.aClass97ArrayArray1[local157][local741].anInt2302;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt1853 -= 3;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					local89 = anIntArray260[anInt1853 + 2];
					Static344.method5185(1, local89, "", local157 << 16 | local741);
					return;
				}
				if (arg0 == 6708) {
					anInt1853 -= 3;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					local89 = anIntArray260[anInt1853 + 2];
					Static344.method5185(2, local89, "", local157 << 16 | local741);
					return;
				}
				if (arg0 == 6709) {
					anInt1853 -= 3;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					local89 = anIntArray260[anInt1853 + 2];
					Static344.method5185(3, local89, "", local157 << 16 | local741);
					return;
				}
				if (arg0 == 6710) {
					anInt1853 -= 3;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					local89 = anIntArray260[anInt1853 + 2];
					Static344.method5185(4, local89, "", local157 << 16 | local741);
					return;
				}
				if (arg0 == 6711) {
					anInt1853 -= 3;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					local89 = anIntArray260[anInt1853 + 2];
					Static344.method5185(5, local89, "", local157 << 16 | local741);
					return;
				}
				if (arg0 == 6712) {
					anInt1853 -= 3;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					local89 = anIntArray260[anInt1853 + 2];
					Static344.method5185(6, local89, "", local157 << 16 | local741);
					return;
				}
				if (arg0 == 6713) {
					anInt1853 -= 3;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					local89 = anIntArray260[anInt1853 + 2];
					Static344.method5185(7, local89, "", local157 << 16 | local741);
					return;
				}
				if (arg0 == 6714) {
					anInt1853 -= 3;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					local89 = anIntArray260[anInt1853 + 2];
					Static344.method5185(8, local89, "", local157 << 16 | local741);
					return;
				}
				if (arg0 == 6715) {
					anInt1853 -= 3;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					local89 = anIntArray260[anInt1853 + 2];
					Static344.method5185(9, local89, "", local157 << 16 | local741);
					return;
				}
				if (arg0 == 6716) {
					anInt1853 -= 3;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					local89 = anIntArray260[anInt1853 + 2];
					Static344.method5185(10, local89, "", local157 << 16 | local741);
					return;
				}
				if (arg0 == 6717) {
					anInt1853 -= 3;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					local89 = anIntArray260[anInt1853 + 2];
					@Pc(8089) Class97 local8089 = Static50.method681(local157 << 16 | local741, local89);
					Static465.method6520();
					@Pc(8094) Class6_Sub44 local8094 = Static65.method862(local8089);
					Static259.method3637(local8089, local8094.anInt7804, local8094.method6471());
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(8122) Class179 local8122;
				if (arg0 == 6800) {
					local157 = anIntArray260[--anInt1853];
					local8122 = Static474.aClass276_4.method6396(local157);
					if (local8122.aString63 == null) {
						aStringArray7[anInt1851++] = "";
						return;
					}
					aStringArray7[anInt1851++] = local8122.aString63;
					return;
				}
				if (arg0 == 6801) {
					local157 = anIntArray260[--anInt1853];
					local8122 = Static474.aClass276_4.method6396(local157);
					anIntArray260[anInt1853++] = local8122.anInt4581;
					return;
				}
				if (arg0 == 6802) {
					local157 = anIntArray260[--anInt1853];
					local8122 = Static474.aClass276_4.method6396(local157);
					anIntArray260[anInt1853++] = local8122.anInt4595;
					return;
				}
				if (arg0 == 6803) {
					local157 = anIntArray260[--anInt1853];
					local8122 = Static474.aClass276_4.method6396(local157);
					anIntArray260[anInt1853++] = local8122.anInt4584;
					return;
				}
				if (arg0 == 6804) {
					anInt1853 -= 2;
					local157 = anIntArray260[anInt1853];
					local741 = anIntArray260[anInt1853 + 1];
					@Pc(8244) Class343 local8244 = Static112.aClass307_1.method6811(local741);
					if (local8244.method7744()) {
						aStringArray7[anInt1851++] = Static474.aClass276_4.method6396(local157).method3968(local8244.aString118, local741);
						return;
					}
					anIntArray260[anInt1853++] = Static474.aClass276_4.method6396(local157).method3970(local8244.anInt9461, local741);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray260[anInt1853++] = Static451.aBoolean532 && !Static558.aBoolean654 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray260[anInt1853++] = Static292.anInt4768;
					return;
				}
				if (arg0 == 6902) {
					anIntArray260[anInt1853++] = Static365.anInt6348;
					return;
				}
				if (arg0 == 6903) {
					anIntArray260[anInt1853++] = Static90.anInt1535;
					return;
				}
				if (arg0 == 6904) {
					anIntArray260[anInt1853++] = Static482.anInt8091;
					return;
				}
				if (arg0 == 6905) {
					local75 = "";
					if (Static386.aClass278_7 != null) {
						if (Static386.aClass278_7.anObject24 == null) {
							local75 = Static131.method1964(Static386.aClass278_7.anInt7759);
						} else {
							local75 = (String) Static386.aClass278_7.anObject24;
						}
					}
					aStringArray7[anInt1851++] = local75;
					return;
				}
				if (arg0 == 6906) {
					anIntArray260[anInt1853++] = Static420.anInt7418;
					return;
				}
				if (arg0 == 6907) {
					anIntArray260[anInt1853++] = Static399.anInt7048;
					return;
				}
				if (arg0 == 6908) {
					anIntArray260[anInt1853++] = Static83.anInt1405;
					return;
				}
				if (arg0 == 6909) {
					anIntArray260[anInt1853++] = Static402.aBoolean495 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray260[anInt1853++] = Static188.anInt3276;
					return;
				}
				if (arg0 == 6911) {
					anIntArray260[anInt1853++] = Static334.anInt5964;
					return;
				}
				if (arg0 == 6912) {
					anIntArray260[anInt1853++] = Static311.anInt5592;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local157 = Static480.aClass6_Sub37_Sub1_1.method5154();
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.anInt6071 = Static567.anInt9503;
					anIntArray260[anInt1853++] = local157;
					Static32.method456();
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 7001) {
					Static480.aClass6_Sub37_Sub1_1.method5155();
					Static32.method456();
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 7002) {
					Static480.aClass6_Sub37_Sub1_1.method5164();
					Static32.method456();
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 7003) {
					Static480.aClass6_Sub37_Sub1_1.method5158();
					Static32.method456();
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 7004) {
					Static480.aClass6_Sub37_Sub1_1.method5170();
					Static32.method456();
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 7005) {
					Static480.aClass6_Sub37_Sub1_1.anInt6063 = 0;
					Static480.aClass6_Sub37_Sub1_1.method5160(Static152.aClass57_4);
					Static474.aBoolean543 = false;
					return;
				}
				if (arg0 == 7006) {
					if (Static480.aClass6_Sub37_Sub1_1.anInt6071 == 2) {
						Static480.aClass6_Sub37_Sub1_1.aBoolean420 = true;
						return;
					}
					if (Static480.aClass6_Sub37_Sub1_1.anInt6071 == 1) {
						Static480.aClass6_Sub37_Sub1_1.aBoolean418 = true;
						return;
					}
					if (Static480.aClass6_Sub37_Sub1_1.anInt6071 == 3) {
						Static480.aClass6_Sub37_Sub1_1.aBoolean419 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray260[anInt1853++] = Static480.aClass6_Sub37_Sub1_1.anInt6063;
					return;
				}
				if (arg0 == 7008) {
					if (Static567.anInt9503 == 0 && Static31.anInt551 < 96) {
						anIntArray260[anInt1853++] = 2;
						return;
					}
					anIntArray260[anInt1853++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "(I)V")
	private static void method1642(@OriginalArg(0) int arg0) {
		@Pc(3) Class97 local3 = Static133.method4068(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class97[] local13 = Static538.aClass97ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class97[] local19 = Static375.aClass97ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static538.aClass97ArrayArray2[local9] = new Class97[local22];
			Static585.method3081(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static585.method3081(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}
}
