import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "Lclient!or;")
	private static Class260 aClass260_18;

	@OriginalMember(owner = "client!tba", name = "e", descriptor = "[J")
	private static long[] aLongArray23;

	@OriginalMember(owner = "client!tba", name = "f", descriptor = "Lclient!or;")
	private static Class260 aClass260_19;

	@OriginalMember(owner = "client!tba", name = "q", descriptor = "Lclient!wf;")
	private static Class382 aClass382_1;

	@OriginalMember(owner = "client!tba", name = "v", descriptor = "Lclient!hka;")
	private static Class3_Sub30 aClass3_Sub30_9;

	@OriginalMember(owner = "client!tba", name = "x", descriptor = "Lclient!ke;")
	private static Class185 aClass185_6;

	@OriginalMember(owner = "client!tba", name = "C", descriptor = "[I")
	private static int[] anIntArray787;

	@OriginalMember(owner = "client!tba", name = "D", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray26;

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "I")
	private static int anInt9156 = 0;

	@OriginalMember(owner = "client!tba", name = "i", descriptor = "I")
	private static int anInt9160 = 0;

	@OriginalMember(owner = "client!tba", name = "l", descriptor = "[Lclient!eha;")
	private static final Class87[] aClass87Array1 = new Class87[50];

	@OriginalMember(owner = "client!tba", name = "n", descriptor = "[[I")
	private static final int[][] anIntArrayArray52 = new int[5][5000];

	@OriginalMember(owner = "client!tba", name = "p", descriptor = "I")
	private static int anInt9165 = 0;

	@OriginalMember(owner = "client!tba", name = "s", descriptor = "I")
	private static int anInt9167 = 0;

	@OriginalMember(owner = "client!tba", name = "t", descriptor = "Lclient!jda;")
	public static final Class165 aClass165_64 = new Class165(4);

	@OriginalMember(owner = "client!tba", name = "u", descriptor = "[I")
	private static final int[] anIntArray784 = new int[5];

	@OriginalMember(owner = "client!tba", name = "w", descriptor = "[I")
	private static final int[] anIntArray785 = new int[1000];

	@OriginalMember(owner = "client!tba", name = "y", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray25 = new String[1000];

	@OriginalMember(owner = "client!tba", name = "z", descriptor = "[J")
	private static final long[] aLongArray24 = new long[1000];

	@OriginalMember(owner = "client!tba", name = "A", descriptor = "[I")
	private static final int[] anIntArray786 = new int[3];

	@OriginalMember(owner = "client!tba", name = "F", descriptor = "I")
	private static int anInt9170 = 0;

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(C)I")
	private static int method8002(@OriginalArg(0) char arg0) {
		return Static439.method6262(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(IZ)V")
	private static void method8003(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class260 local137;
		@Pc(19) int local19;
		@Pc(56) int local56;
		@Pc(25) int local25;
		@Pc(35) Class260 local35;
		@Pc(158) Class260 local158;
		@Pc(210) Class260 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 150) {
				anInt9165 -= 3;
				local13 = anIntArray785[anInt9165];
				local19 = anIntArray785[anInt9165 + 1];
				local25 = anIntArray785[anInt9165 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static383.method5492(local13);
				if (local35.aClass260Array2 == null) {
					local35.aClass260Array2 = new Class260[local25 + 1];
				}
				if (local35.aClass260Array2.length <= local25) {
					@Pc(54) Class260[] local54 = new Class260[local25 + 1];
					for (local56 = 0; local56 < local35.aClass260Array2.length; local56++) {
						local54[local56] = local35.aClass260Array2[local56];
					}
					local35.aClass260Array2 = local54;
				}
				if (local25 > 0 && local35.aClass260Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class260 local99 = new Class260();
				local99.anInt7003 = local19;
				local99.anInt6993 = local99.anInt6930 = local35.anInt6930;
				local99.anInt6985 = local25;
				local35.aClass260Array2[local25] = local99;
				if (arg1) {
					aClass260_19 = local99;
				} else {
					aClass260_18 = local99;
				}
				Static456.method8151(local35);
				return;
			}
			if (arg0 == 151) {
				local137 = arg1 ? aClass260_19 : aClass260_18;
				if (local137.anInt6985 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static383.method5492(local137.anInt6930);
				local158.aClass260Array2[local137.anInt6985] = null;
				Static456.method8151(local158);
				return;
			}
			if (arg0 == 152) {
				local137 = Static383.method5492(anIntArray785[--anInt9165]);
				local137.aClass260Array2 = null;
				Static456.method8151(local137);
				return;
			}
			if (arg0 == 200) {
				anInt9165 -= 2;
				local13 = anIntArray785[anInt9165];
				local19 = anIntArray785[anInt9165 + 1];
				local210 = Static245.method4101(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray785[anInt9165++] = 1;
					if (arg1) {
						aClass260_19 = local210;
						return;
					}
					aClass260_18 = local210;
					return;
				}
				anIntArray785[anInt9165++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray785[--anInt9165];
				local158 = Static383.method5492(local13);
				if (local158 != null) {
					anIntArray785[anInt9165++] = 1;
					if (arg1) {
						aClass260_19 = local158;
						return;
					}
					aClass260_18 = local158;
					return;
				}
				anIntArray785[anInt9165++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray785[--anInt9165];
				method8005(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray785[--anInt9165];
				method8017(local13);
				return;
			}
		} else {
			@Pc(357) int local357;
			@Pc(420) boolean local420;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt9165 -= 2;
					local13 = anIntArray785[anInt9165];
					local19 = anIntArray785[anInt9165 + 1];
					if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass30_1 == null) {
						return;
					}
					for (local25 = 0; local25 < Static466.anIntArray652.length; local25++) {
						if (Static466.anIntArray652[local25] == local13) {
							Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass30_1.method909(local19, Static635.aClass386_2, local25);
							return;
						}
					}
					for (local357 = 0; local357 < Static494.anIntArray685.length; local357++) {
						if (Static494.anIntArray685[local357] == local13) {
							Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass30_1.method909(local19, Static635.aClass386_2, local357);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt9165 -= 2;
					local13 = anIntArray785[anInt9165];
					local19 = anIntArray785[anInt9165 + 1];
					if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass30_1 == null) {
						return;
					}
					Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass30_1.method910(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local420 = anIntArray785[--anInt9165] != 0;
					if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass30_1 == null) {
						return;
					}
					Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass30_1.method912(local420);
					return;
				}
				if (arg0 == 411) {
					anInt9165 -= 2;
					local13 = anIntArray785[anInt9165];
					local19 = anIntArray785[anInt9165 + 1];
					if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass30_1 == null) {
						return;
					}
					Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass30_1.method904(Static170.aClass370_1, local13, local19);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static383.method5492(anIntArray785[--anInt9165]);
				} else {
					local137 = arg1 ? aClass260_19 : aClass260_18;
				}
				if (arg0 == 1000) {
					anInt9165 -= 4;
					local137.anInt6932 = anIntArray785[anInt9165];
					local137.anInt6991 = anIntArray785[anInt9165 + 1];
					local19 = anIntArray785[anInt9165 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray785[anInt9165 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte97 = (byte) local19;
					local137.aByte96 = (byte) local25;
					Static456.method8151(local137);
					Static553.method7889(local137);
					if (local137.anInt6985 == -1) {
						Static190.method3491(local137.anInt6930);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt9165 -= 4;
					local137.anInt6931 = anIntArray785[anInt9165];
					local137.anInt6957 = anIntArray785[anInt9165 + 1];
					local137.anInt6975 = 0;
					local137.anInt7006 = 0;
					local19 = anIntArray785[anInt9165 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray785[anInt9165 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte94 = (byte) local19;
					local137.aByte95 = (byte) local25;
					Static456.method8151(local137);
					Static553.method7889(local137);
					if (local137.anInt7003 == 0) {
						Static249.method4132(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(661) boolean local661 = anIntArray785[--anInt9165] == 1;
					if (local137.aBoolean497 != local661) {
						local137.aBoolean497 = local661;
						Static456.method8151(local137);
					}
					if (local137.anInt6985 == -1) {
						Static307.method4710(local137.anInt6930);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt9165 -= 2;
					local137.anInt7009 = anIntArray785[anInt9165];
					local137.anInt6928 = anIntArray785[anInt9165 + 1];
					Static456.method8151(local137);
					Static553.method7889(local137);
					if (local137.anInt7003 == 0) {
						Static249.method4132(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean508 = anIntArray785[--anInt9165] == 1;
					return;
				}
			} else {
				@Pc(1523) String local1523;
				@Pc(1161) String local1161;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static383.method5492(anIntArray785[--anInt9165]);
					} else {
						local137 = arg1 ? aClass260_19 : aClass260_18;
					}
					if (arg0 == 1100) {
						anInt9165 -= 2;
						local137.anInt7013 = anIntArray785[anInt9165];
						if (local137.anInt7013 > local137.anInt6939 - local137.anInt6963) {
							local137.anInt7013 = local137.anInt6939 - local137.anInt6963;
						}
						if (local137.anInt7013 < 0) {
							local137.anInt7013 = 0;
						}
						local137.anInt6946 = anIntArray785[anInt9165 + 1];
						if (local137.anInt6946 > local137.anInt6970 - local137.anInt6971) {
							local137.anInt6946 = local137.anInt6970 - local137.anInt6971;
						}
						if (local137.anInt6946 < 0) {
							local137.anInt6946 = 0;
						}
						Static456.method8151(local137);
						if (local137.anInt6985 == -1) {
							Static215.method3739(local137.anInt6930);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt6967 = anIntArray785[--anInt9165];
						Static456.method8151(local137);
						if (local137.anInt6985 == -1) {
							Static257.method4211(local137.anInt6930);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean503 = anIntArray785[--anInt9165] == 1;
						Static456.method8151(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt7022 = anIntArray785[--anInt9165];
						Static456.method8151(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt6999 = anIntArray785[--anInt9165];
						Static456.method8151(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray785[--anInt9165];
						if (local137.anInt6961 != local19) {
							local137.anInt6961 = local19;
							Static456.method8151(local137);
						}
						if (local137.anInt6985 == -1) {
							Static163.method2960(local137.anInt6930);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt6952 = anIntArray785[--anInt9165];
						Static456.method8151(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean499 = anIntArray785[--anInt9165] == 1;
						Static456.method8151(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt6935 = 1;
						local137.anInt7000 = anIntArray785[--anInt9165];
						Static456.method8151(local137);
						if (local137.anInt6985 == -1) {
							Static166.method3025(local137.anInt6930);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt9165 -= 6;
						local137.anInt7004 = anIntArray785[anInt9165];
						local137.anInt6926 = anIntArray785[anInt9165 + 1];
						local137.anInt6974 = anIntArray785[anInt9165 + 2];
						local137.anInt6973 = anIntArray785[anInt9165 + 3];
						local137.anInt6945 = anIntArray785[anInt9165 + 4];
						local137.anInt6989 = anIntArray785[anInt9165 + 5];
						Static456.method8151(local137);
						if (local137.anInt6985 == -1) {
							Static476.method6894(local137.anInt6930);
							Static119.method2273(local137.anInt6930);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray785[--anInt9165];
						if (local137.anInt6927 != local19) {
							local137.anInt6927 = local19;
							local137.anInt6954 = 0;
							local137.anInt6982 = 1;
							local137.anInt6988 = 0;
							@Pc(1110) Class372 local1110 = local137.anInt6927 == -1 ? null : Static243.aClass343_3.method8356(local137.anInt6927);
							if (local1110 != null) {
								Static639.method8891(local137.anInt6954, local1110);
							}
							Static456.method8151(local137);
						}
						if (local137.anInt6985 == -1) {
							Static594.method8354(local137.anInt6930);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean495 = anIntArray785[--anInt9165] == 1;
						Static456.method8151(local137);
						return;
					}
					if (arg0 == 1112) {
						local1161 = aStringArray25[--anInt9156];
						if (!local1161.equals(local137.aString74)) {
							local137.aString74 = local1161;
							Static456.method8151(local137);
						}
						if (local137.anInt6985 == -1) {
							Static540.method7764(local137.anInt6930);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt6976 = anIntArray785[--anInt9165];
						Static456.method8151(local137);
						if (local137.anInt6985 == -1) {
							Static622.method8755(local137.anInt6930);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt9165 -= 3;
						local137.anInt6953 = anIntArray785[anInt9165];
						local137.anInt7002 = anIntArray785[anInt9165 + 1];
						local137.anInt6987 = anIntArray785[anInt9165 + 2];
						Static456.method8151(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean496 = anIntArray785[--anInt9165] == 1;
						Static456.method8151(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt6938 = anIntArray785[--anInt9165];
						Static456.method8151(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt6936 = anIntArray785[--anInt9165];
						Static456.method8151(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean507 = anIntArray785[--anInt9165] == 1;
						Static456.method8151(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean506 = anIntArray785[--anInt9165] == 1;
						Static456.method8151(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt9165 -= 2;
						local137.anInt6939 = anIntArray785[anInt9165];
						local137.anInt6970 = anIntArray785[anInt9165 + 1];
						Static456.method8151(local137);
						if (local137.anInt7003 == 0) {
							Static249.method4132(false, local137);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean512 = anIntArray785[--anInt9165] == 1;
						Static456.method8151(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt6989 = anIntArray785[--anInt9165];
						Static456.method8151(local137);
						if (local137.anInt6985 == -1) {
							Static476.method6894(local137.anInt6930);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray785[--anInt9165];
						local137.aBoolean500 = local19 == 1;
						Static456.method8151(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt9165 -= 2;
						local137.anInt6951 = anIntArray785[anInt9165];
						local137.anInt6977 = anIntArray785[anInt9165 + 1];
						Static456.method8151(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt6966 = anIntArray785[--anInt9165];
						Static456.method8151(local137);
						return;
					}
					@Pc(1489) Class322 local1489;
					if (arg0 == 1127) {
						anInt9165 -= 2;
						local19 = anIntArray785[anInt9165];
						local25 = anIntArray785[anInt9165 + 1];
						local1489 = Static467.aClass367_1.method8812(local19);
						if (local25 != local1489.anInt9033) {
							local137.method6252(local25, local19);
							return;
						}
						local137.method6244(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray785[--anInt9165];
						local1523 = aStringArray25[--anInt9156];
						local1489 = Static467.aClass367_1.method8812(local19);
						if (!local1489.aString106.equals(local1523)) {
							local137.method6260(local1523, local19);
							return;
						}
						local137.method6244(local19);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local19 = anIntArray785[--anInt9165];
						if ((local137.anInt7003 == 5 || arg0 != 1129) && (local137.anInt7003 == 4 || arg0 != 1130)) {
							if (local137.anInt6941 != local19) {
								local137.anInt6941 = local19;
								Static456.method8151(local137);
							}
							if (local137.anInt6985 == -1) {
								Static671.method9327(local137.anInt6930);
							}
							return;
						}
						return;
					}
					@Pc(1610) short local1610;
					@Pc(1617) short local1617;
					if (arg0 == 1131) {
						anInt9165 -= 3;
						local19 = anIntArray785[anInt9165];
						local1610 = (short) anIntArray785[anInt9165 + 1];
						local1617 = (short) anIntArray785[anInt9165 + 2];
						if (local19 >= 0 && local19 < 5) {
							local137.method6246(local19, local1617, local1610);
							Static456.method8151(local137);
							if (local137.anInt6985 == -1) {
								Static419.method1505(local137.anInt6930, local19);
							}
							return;
						}
						return;
					}
					if (arg0 == 1132) {
						anInt9165 -= 3;
						local19 = anIntArray785[anInt9165];
						local1610 = (short) anIntArray785[anInt9165 + 1];
						local1617 = (short) anIntArray785[anInt9165 + 2];
						if (local19 >= 0 && local19 < 5) {
							local137.method6259(local19, local1617, local1610);
							Static456.method8151(local137);
							if (local137.anInt6985 == -1) {
								Static559.method7937(local137.anInt6930, local19);
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
								local137 = Static383.method5492(anIntArray785[--anInt9165]);
							} else {
								local137 = arg1 ? aClass260_19 : aClass260_18;
							}
							if (arg0 == 1499) {
								local137.method6255();
								return;
							}
							local1161 = aStringArray25[--anInt9156];
							@Pc(2559) int[] local2559 = null;
							if (local1161.length() > 0 && local1161.charAt(local1161.length() - 1) == 'Y') {
								local357 = anIntArray785[--anInt9165];
								if (local357 > 0) {
									local2559 = new int[local357];
									while (local357-- > 0) {
										local2559[local357] = anIntArray785[--anInt9165];
									}
								}
								local1161 = local1161.substring(0, local1161.length() - 1);
							}
							@Pc(2611) Object[] local2611 = new Object[local1161.length() + 1];
							for (local2473 = local2611.length - 1; local2473 >= 1; local2473--) {
								if (local1161.charAt(local2473 - 1) == 's') {
									local2611[local2473] = aStringArray25[--anInt9156];
								} else if (local1161.charAt(local2473 - 1) == '§') {
									local2611[local2473] = Long.valueOf(aLongArray24[--anInt9160]);
								} else {
									local2611[local2473] = Integer.valueOf(anIntArray785[--anInt9165]);
								}
							}
							local56 = anIntArray785[--anInt9165];
							if (local56 == -1) {
								local2611 = null;
							} else {
								local2611[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray24 = local2611;
							} else if (arg0 == 1401) {
								local137.anObjectArray15 = local2611;
							} else if (arg0 == 1402) {
								local137.anObjectArray18 = local2611;
							} else if (arg0 == 1403) {
								local137.anObjectArray7 = local2611;
							} else if (arg0 == 1404) {
								local137.anObjectArray12 = local2611;
							} else if (arg0 == 1405) {
								local137.anObjectArray14 = local2611;
							} else if (arg0 == 1406) {
								local137.anObjectArray5 = local2611;
							} else if (arg0 == 1407) {
								local137.anObjectArray19 = local2611;
								local137.anIntArray621 = local2559;
							} else if (arg0 == 1408) {
								local137.anObjectArray27 = local2611;
							} else if (arg0 == 1409) {
								local137.anObjectArray9 = local2611;
							} else if (arg0 == 1410) {
								local137.anObjectArray8 = local2611;
							} else if (arg0 == 1411) {
								local137.anObjectArray28 = local2611;
							} else if (arg0 == 1412) {
								local137.anObjectArray13 = local2611;
							} else if (arg0 == 1414) {
								local137.anObjectArray26 = local2611;
								local137.anIntArray619 = local2559;
							} else if (arg0 == 1415) {
								local137.anObjectArray21 = local2611;
								local137.anIntArray625 = local2559;
							} else if (arg0 == 1416) {
								local137.anObjectArray3 = local2611;
							} else if (arg0 == 1417) {
								local137.anObjectArray32 = local2611;
							} else if (arg0 == 1418) {
								local137.anObjectArray16 = local2611;
							} else if (arg0 == 1419) {
								local137.anObjectArray35 = local2611;
							} else if (arg0 == 1420) {
								local137.anObjectArray34 = local2611;
							} else if (arg0 == 1421) {
								local137.anObjectArray23 = local2611;
							} else if (arg0 == 1422) {
								local137.anObjectArray31 = local2611;
							} else if (arg0 == 1423) {
								local137.anObjectArray33 = local2611;
							} else if (arg0 == 1424) {
								local137.anObjectArray4 = local2611;
							} else if (arg0 == 1425) {
								local137.anObjectArray10 = local2611;
							} else if (arg0 == 1426) {
								local137.anObjectArray22 = local2611;
							} else if (arg0 == 1427) {
								local137.anObjectArray25 = local2611;
							} else if (arg0 == 1428) {
								local137.anObjectArray11 = local2611;
								local137.anIntArray622 = local2559;
							} else if (arg0 == 1429) {
								local137.anObjectArray30 = local2611;
								local137.anIntArray623 = local2559;
							} else if (arg0 == 1430) {
								local137.anObjectArray6 = local2611;
							} else if (arg0 == 1431) {
								local137.anObjectArray20 = local2611;
							} else if (arg0 == 1432) {
								local137.anObjectArray17 = local2611;
							}
							local137.aBoolean501 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass260_19 : aClass260_18;
							if (arg0 == 1500) {
								anIntArray785[anInt9165++] = local137.anInt6942;
								return;
							}
							if (arg0 == 1501) {
								anIntArray785[anInt9165++] = local137.anInt6950;
								return;
							}
							if (arg0 == 1502) {
								anIntArray785[anInt9165++] = local137.anInt6963;
								return;
							}
							if (arg0 == 1503) {
								anIntArray785[anInt9165++] = local137.anInt6971;
								return;
							}
							if (arg0 == 1504) {
								anIntArray785[anInt9165++] = local137.aBoolean497 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray785[anInt9165++] = local137.anInt6993;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static119.method2271(local137);
								anIntArray785[anInt9165++] = local158 == null ? -1 : local158.anInt6930;
								return;
							}
						} else {
							@Pc(3242) Class322 local3242;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass260_19 : aClass260_18;
								if (arg0 == 1600) {
									anIntArray785[anInt9165++] = local137.anInt7013;
									return;
								}
								if (arg0 == 1601) {
									anIntArray785[anInt9165++] = local137.anInt6946;
									return;
								}
								if (arg0 == 1602) {
									aStringArray25[anInt9156++] = local137.aString74;
									return;
								}
								if (arg0 == 1603) {
									anIntArray785[anInt9165++] = local137.anInt6939;
									return;
								}
								if (arg0 == 1604) {
									anIntArray785[anInt9165++] = local137.anInt6970;
									return;
								}
								if (arg0 == 1605) {
									anIntArray785[anInt9165++] = local137.anInt6989;
									return;
								}
								if (arg0 == 1606) {
									anIntArray785[anInt9165++] = local137.anInt6974;
									return;
								}
								if (arg0 == 1607) {
									anIntArray785[anInt9165++] = local137.anInt6945;
									return;
								}
								if (arg0 == 1608) {
									anIntArray785[anInt9165++] = local137.anInt6973;
									return;
								}
								if (arg0 == 1609) {
									anIntArray785[anInt9165++] = local137.anInt7022;
									return;
								}
								if (arg0 == 1610) {
									anIntArray785[anInt9165++] = local137.anInt7004;
									return;
								}
								if (arg0 == 1611) {
									anIntArray785[anInt9165++] = local137.anInt6926;
									return;
								}
								if (arg0 == 1612) {
									anIntArray785[anInt9165++] = local137.anInt6961;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray785[--anInt9165];
									local3242 = Static467.aClass367_1.method8812(local19);
									if (local3242.method7885()) {
										aStringArray25[anInt9156++] = local137.method6248(local19, local3242.aString106);
										return;
									}
									anIntArray785[anInt9165++] = local137.method6243(local3242.anInt9033, local19);
									return;
								}
								if (arg0 == 1614) {
									anIntArray785[anInt9165++] = local137.anInt6952;
									return;
								}
								if (arg0 == 2614) {
									anIntArray785[anInt9165++] = local137.anInt6935 == 1 ? local137.anInt7000 : -1;
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass260_19 : aClass260_18;
								if (arg0 == 1700) {
									anIntArray785[anInt9165++] = local137.anInt6964;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt6964 != -1) {
										anIntArray785[anInt9165++] = local137.anInt6996;
										return;
									}
									anIntArray785[anInt9165++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray785[anInt9165++] = local137.anInt6985;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass260_19 : aClass260_18;
								if (arg0 == 1800) {
									anIntArray785[anInt9165++] = Static79.method1526(local137).method7067();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray785[--anInt9165];
									local19--;
									if (local137.aStringArray19 != null && local19 < local137.aStringArray19.length && local137.aStringArray19[local19] != null) {
										aStringArray25[anInt9156++] = local137.aStringArray19[local19];
										return;
									}
									aStringArray25[anInt9156++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString75 == null) {
										aStringArray25[anInt9156++] = "";
										return;
									}
									aStringArray25[anInt9156++] = local137.aString75;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static383.method5492(anIntArray785[--anInt9165]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass260_19 : aClass260_18;
								}
								if (anInt9170 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray25 == null) {
										return;
									}
									@Pc(3511) Class3_Sub17 local3511 = new Class3_Sub17();
									local3511.aClass260_6 = local137;
									local3511.anObjectArray2 = local137.anObjectArray25;
									local3511.anInt1771 = anInt9170 + 1;
									Static510.aClass338_126.method8171(local3511);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static383.method5492(anIntArray785[--anInt9165]);
								if (arg0 == 2500) {
									anIntArray785[anInt9165++] = local137.anInt6942;
									return;
								}
								if (arg0 == 2501) {
									anIntArray785[anInt9165++] = local137.anInt6950;
									return;
								}
								if (arg0 == 2502) {
									anIntArray785[anInt9165++] = local137.anInt6963;
									return;
								}
								if (arg0 == 2503) {
									anIntArray785[anInt9165++] = local137.anInt6971;
									return;
								}
								if (arg0 == 2504) {
									anIntArray785[anInt9165++] = local137.aBoolean497 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray785[anInt9165++] = local137.anInt6993;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static119.method2271(local137);
									anIntArray785[anInt9165++] = local158 == null ? -1 : local158.anInt6930;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static383.method5492(anIntArray785[--anInt9165]);
								if (arg0 == 2600) {
									anIntArray785[anInt9165++] = local137.anInt7013;
									return;
								}
								if (arg0 == 2601) {
									anIntArray785[anInt9165++] = local137.anInt6946;
									return;
								}
								if (arg0 == 2602) {
									aStringArray25[anInt9156++] = local137.aString74;
									return;
								}
								if (arg0 == 2603) {
									anIntArray785[anInt9165++] = local137.anInt6939;
									return;
								}
								if (arg0 == 2604) {
									anIntArray785[anInt9165++] = local137.anInt6970;
									return;
								}
								if (arg0 == 2605) {
									anIntArray785[anInt9165++] = local137.anInt6989;
									return;
								}
								if (arg0 == 2606) {
									anIntArray785[anInt9165++] = local137.anInt6974;
									return;
								}
								if (arg0 == 2607) {
									anIntArray785[anInt9165++] = local137.anInt6945;
									return;
								}
								if (arg0 == 2608) {
									anIntArray785[anInt9165++] = local137.anInt6973;
									return;
								}
								if (arg0 == 2609) {
									anIntArray785[anInt9165++] = local137.anInt7022;
									return;
								}
								if (arg0 == 2610) {
									anIntArray785[anInt9165++] = local137.anInt7004;
									return;
								}
								if (arg0 == 2611) {
									anIntArray785[anInt9165++] = local137.anInt6926;
									return;
								}
								if (arg0 == 2612) {
									anIntArray785[anInt9165++] = local137.anInt6961;
									return;
								}
								if (arg0 == 2613) {
									anIntArray785[anInt9165++] = local137.anInt6952;
									return;
								}
								if (arg0 == 2614) {
									anIntArray785[anInt9165++] = local137.anInt6935 == 1 ? local137.anInt7000 : -1;
									return;
								}
							} else {
								@Pc(4040) Class3_Sub46 local4040;
								@Pc(3938) Class3_Sub46 local3938;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static383.method5492(anIntArray785[--anInt9165]);
										anIntArray785[anInt9165++] = local137.anInt6964;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static383.method5492(anIntArray785[--anInt9165]);
										if (local137.anInt6964 != -1) {
											anIntArray785[anInt9165++] = local137.anInt6996;
											return;
										}
										anIntArray785[anInt9165++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray785[--anInt9165];
										local3938 = (Class3_Sub46) Static455.aClass83_31.method2368((long) local13);
										if (local3938 != null) {
											anIntArray785[anInt9165++] = 1;
											return;
										}
										anIntArray785[anInt9165++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static383.method5492(anIntArray785[--anInt9165]);
										if (local137.aClass260Array2 == null) {
											anIntArray785[anInt9165++] = 0;
											return;
										}
										local19 = local137.aClass260Array2.length;
										for (local25 = 0; local25 < local137.aClass260Array2.length; local25++) {
											if (local137.aClass260Array2[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray785[anInt9165++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt9165 -= 2;
										local13 = anIntArray785[anInt9165];
										local19 = anIntArray785[anInt9165 + 1];
										local4040 = (Class3_Sub46) Static455.aClass83_31.method2368((long) local13);
										if (local4040 != null && local4040.anInt7855 == local19) {
											anIntArray785[anInt9165++] = 1;
											return;
										}
										anIntArray785[anInt9165++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static383.method5492(anIntArray785[--anInt9165]);
									if (arg0 == 2800) {
										anIntArray785[anInt9165++] = Static79.method1526(local137).method7067();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray785[--anInt9165];
										local19--;
										if (local137.aStringArray19 != null && local19 < local137.aStringArray19.length && local137.aStringArray19[local19] != null) {
											aStringArray25[anInt9156++] = local137.aStringArray19[local19];
											return;
										}
										aStringArray25[anInt9156++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString75 == null) {
											aStringArray25[anInt9156++] = "";
											return;
										}
										aStringArray25[anInt9156++] = local137.aString75;
										return;
									}
								} else {
									@Pc(4266) Class3_Sub34 local4266;
									@Pc(4177) String local4177;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local4177 = aStringArray25[--anInt9156];
											Static664.method9175(local4177);
											return;
										}
										if (arg0 == 3101) {
											anInt9165 -= 2;
											Static476.method6886(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2, anIntArray785[anInt9165], anIntArray785[anInt9165 + 1]);
											return;
										}
										if (arg0 == 3103) {
											Static339.method5098();
											return;
										}
										if (arg0 == 3104) {
											local4177 = aStringArray25[--anInt9156];
											local19 = 0;
											if (Static409.method5813(local4177)) {
												local19 = Static63.method1308(local4177);
											}
											@Pc(4237) Class3_Sub34 local4237 = Static172.method3123(Static163.aClass375_1, Static638.aClass218_145);
											local4237.aClass3_Sub25_Sub1_2.method8588(local19);
											Static441.method6275(local4237);
											return;
										}
										if (arg0 == 3105) {
											local4177 = aStringArray25[--anInt9156];
											local4266 = Static172.method3123(Static163.aClass375_1, Static296.aClass218_72);
											local4266.aClass3_Sub25_Sub1_2.method8614(local4177.length() + 1);
											local4266.aClass3_Sub25_Sub1_2.method8583(local4177);
											Static441.method6275(local4266);
											return;
										}
										if (arg0 == 3106) {
											local4177 = aStringArray25[--anInt9156];
											local4266 = Static172.method3123(Static163.aClass375_1, Static157.aClass218_38);
											local4266.aClass3_Sub25_Sub1_2.method8614(local4177.length() + 1);
											local4266.aClass3_Sub25_Sub1_2.method8583(local4177);
											Static441.method6275(local4266);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray785[--anInt9165];
											local1161 = aStringArray25[--anInt9156];
											Static185.method3443(local13, local1161);
											return;
										}
										if (arg0 == 3108) {
											anInt9165 -= 3;
											local13 = anIntArray785[anInt9165];
											local19 = anIntArray785[anInt9165 + 1];
											local25 = anIntArray785[anInt9165 + 2];
											local35 = Static383.method5492(local25);
											Static62.method1303(local19, local13, local35);
											return;
										}
										if (arg0 == 3109) {
											anInt9165 -= 2;
											local13 = anIntArray785[anInt9165];
											local19 = anIntArray785[anInt9165 + 1];
											local210 = arg1 ? aClass260_19 : aClass260_18;
											Static62.method1303(local19, local13, local210);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray785[--anInt9165];
											local4266 = Static172.method3123(Static163.aClass375_1, Static462.aClass218_111);
											local4266.aClass3_Sub25_Sub1_2.method8649(local13);
											Static441.method6275(local4266);
											return;
										}
										if (arg0 == 3111) {
											anInt9165 -= 2;
											local13 = anIntArray785[anInt9165];
											local19 = anIntArray785[anInt9165 + 1];
											local4040 = (Class3_Sub46) Static455.aClass83_31.method2368((long) local13);
											if (local4040 != null) {
												Static647.method8986(true, local4040.anInt7855 != local19, local4040);
											}
											Static18.method568(local19, local13, true, 3);
											return;
										}
										if (arg0 == 3112) {
											anInt9165--;
											local13 = anIntArray785[anInt9165];
											local3938 = (Class3_Sub46) Static455.aClass83_31.method2368((long) local13);
											if (local3938 != null && local3938.anInt7850 == 3) {
												Static647.method8986(true, true, local3938);
											}
											return;
										}
										if (arg0 == 3113) {
											Static234.method3927(aStringArray25[--anInt9156]);
											return;
										}
										if (arg0 == 3114) {
											anInt9165 -= 2;
											local13 = anIntArray785[anInt9165];
											local19 = anIntArray785[anInt9165 + 1];
											local1523 = aStringArray25[--anInt9156];
											Static450.method6577(local13, "", "", local1523, local19, "");
											return;
										}
										if (arg0 == 3115) {
											anInt9165 -= 11;
											@Pc(4567) Class356[] local4567 = Static126.method2369();
											@Pc(4570) Class56[] local4570 = Static398.method5612();
											Static22.method2356(anIntArray785[anInt9165 + 10], anIntArray785[anInt9165 + 5], anIntArray785[anInt9165 + 3], anIntArray785[anInt9165 + 6], anIntArray785[anInt9165 + 8], anIntArray785[anInt9165 + 2], anIntArray785[anInt9165 + 9], anIntArray785[anInt9165 + 4], anIntArray785[anInt9165 + 7], local4570[anIntArray785[anInt9165 + 1]], local4567[anIntArray785[anInt9165]]);
											return;
										}
										if (arg0 == 3116) {
											local13 = anIntArray785[--anInt9165];
											local4266 = Static172.method3123(Static163.aClass375_1, Static564.aClass218_131);
											local4266.aClass3_Sub25_Sub1_2.method8649(local13);
											Static441.method6275(local4266);
											return;
										}
										if (arg0 == 3117) {
											local4177 = aStringArray25[--anInt9156];
											local4266 = Static172.method3123(Static163.aClass375_1, Static587.aClass218_141);
											local4266.aClass3_Sub25_Sub1_2.method8614(local4177.length() + 1);
											local4266.aClass3_Sub25_Sub1_2.method8583(local4177);
											Static441.method6275(local4266);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt9165 -= 3;
											Static291.method4560(255, anIntArray785[anInt9165], anIntArray785[anInt9165 + 2], anIntArray785[anInt9165 + 1], 256);
											return;
										}
										if (arg0 == 3201) {
											Static120.method2297(255, 50, anIntArray785[--anInt9165]);
											return;
										}
										if (arg0 == 3202) {
											anInt9165 -= 2;
											Static101.method1777(anIntArray785[anInt9165], 255, anIntArray785[anInt9165 + 1]);
											return;
										}
										if (arg0 == 3203) {
											anInt9165 -= 4;
											Static291.method4560(anIntArray785[anInt9165 + 3], anIntArray785[anInt9165], anIntArray785[anInt9165 + 2], anIntArray785[anInt9165 + 1], 256);
											return;
										}
										if (arg0 == 3204) {
											anInt9165 -= 3;
											Static120.method2297(anIntArray785[anInt9165 + 1], anIntArray785[anInt9165 + 2], anIntArray785[anInt9165]);
											return;
										}
										if (arg0 == 3205) {
											anInt9165 -= 3;
											Static101.method1777(anIntArray785[anInt9165], anIntArray785[anInt9165 + 2], anIntArray785[anInt9165 + 1]);
											return;
										}
										if (arg0 == 3206) {
											anInt9165 -= 4;
											Static264.method4359(false, anIntArray785[anInt9165 + 2], anIntArray785[anInt9165 + 1], anIntArray785[anInt9165], anIntArray785[anInt9165 + 3], 256);
											return;
										}
										if (arg0 == 3207) {
											anInt9165 -= 4;
											Static264.method4359(true, anIntArray785[anInt9165 + 2], anIntArray785[anInt9165 + 1], anIntArray785[anInt9165], anIntArray785[anInt9165 + 3], 256);
											return;
										}
										if (arg0 == 3208) {
											anInt9165 -= 5;
											Static291.method4560(anIntArray785[anInt9165 + 3], anIntArray785[anInt9165], anIntArray785[anInt9165 + 2], anIntArray785[anInt9165 + 1], anIntArray785[anInt9165 + 4]);
											return;
										}
										if (arg0 == 3209) {
											anInt9165 -= 5;
											Static264.method4359(false, anIntArray785[anInt9165 + 2], anIntArray785[anInt9165 + 1], anIntArray785[anInt9165], anIntArray785[anInt9165 + 3], anIntArray785[anInt9165 + 4]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray785[anInt9165++] = Static588.anInt9467;
											return;
										}
										if (arg0 == 3301) {
											anInt9165 -= 2;
											local13 = anIntArray785[anInt9165];
											local19 = anIntArray785[anInt9165 + 1];
											anIntArray785[anInt9165++] = Static375.method5441(false, local19, local13);
											return;
										}
										if (arg0 == 3302) {
											anInt9165 -= 2;
											local13 = anIntArray785[anInt9165];
											local19 = anIntArray785[anInt9165 + 1];
											anIntArray785[anInt9165++] = Static552.method7884(local19, false, local13);
											return;
										}
										if (arg0 == 3303) {
											anInt9165 -= 2;
											local13 = anIntArray785[anInt9165];
											local19 = anIntArray785[anInt9165 + 1];
											anIntArray785[anInt9165++] = Static645.method8966(local19, local13, false);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray785[--anInt9165];
											anIntArray785[anInt9165++] = Static396.aClass157_1.method4136(local13).anInt2885;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray785[--anInt9165];
											anIntArray785[anInt9165++] = Static306.anIntArray457[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray785[--anInt9165];
											anIntArray785[anInt9165++] = Static281.anIntArray440[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray785[--anInt9165];
											anIntArray785[anInt9165++] = Static109.anIntArray169[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(5157) byte local5157 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174;
											local19 = (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729 >> 9) + Static287.anInt4910;
											local25 = (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731 >> 9) + Static72.anInt1361;
											anIntArray785[anInt9165++] = (local5157 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray785[--anInt9165];
											anIntArray785[anInt9165++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray785[--anInt9165];
											anIntArray785[anInt9165++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray785[--anInt9165];
											anIntArray785[anInt9165++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray785[anInt9165++] = Static128.aBoolean206 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt9165 -= 2;
											local13 = anIntArray785[anInt9165];
											local19 = anIntArray785[anInt9165 + 1];
											anIntArray785[anInt9165++] = Static375.method5441(true, local19, local13);
											return;
										}
										if (arg0 == 3314) {
											anInt9165 -= 2;
											local13 = anIntArray785[anInt9165];
											local19 = anIntArray785[anInt9165 + 1];
											anIntArray785[anInt9165++] = Static552.method7884(local19, true, local13);
											return;
										}
										if (arg0 == 3315) {
											anInt9165 -= 2;
											local13 = anIntArray785[anInt9165];
											local19 = anIntArray785[anInt9165 + 1];
											anIntArray785[anInt9165++] = Static645.method8966(local19, local13, true);
											return;
										}
										if (arg0 == 3316) {
											if (Static24.anInt545 >= 2) {
												anIntArray785[anInt9165++] = Static24.anInt545;
												return;
											}
											anIntArray785[anInt9165++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray785[anInt9165++] = Static620.anInt9925;
											return;
										}
										if (arg0 == 3318) {
											anIntArray785[anInt9165++] = Static541.aClass342_3.anInt9498;
											return;
										}
										if (arg0 == 3321) {
											anIntArray785[anInt9165++] = Static92.anInt1774;
											return;
										}
										if (arg0 == 3322) {
											anIntArray785[anInt9165++] = Static132.anInt2721;
											return;
										}
										if (arg0 == 3323) {
											if (Static236.anInt4344 >= 5 && Static236.anInt4344 <= 9) {
												anIntArray785[anInt9165++] = 1;
												return;
											}
											anIntArray785[anInt9165++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static236.anInt4344 >= 5 && Static236.anInt4344 <= 9) {
												anIntArray785[anInt9165++] = Static236.anInt4344;
												return;
											}
											anIntArray785[anInt9165++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray785[anInt9165++] = Static140.aBoolean219 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray785[anInt9165++] = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10514;
											return;
										}
										if (arg0 == 3327) {
											anIntArray785[anInt9165++] = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass30_1 != null && Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass30_1.aBoolean61 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray785[anInt9165++] = Static236.aBoolean326 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray785[--anInt9165];
											anIntArray785[anInt9165++] = Static595.method8363(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt9165 -= 2;
											local13 = anIntArray785[anInt9165];
											local19 = anIntArray785[anInt9165 + 1];
											anIntArray785[anInt9165++] = Static610.method8668(local19, local13, false);
											return;
										}
										if (arg0 == 3332) {
											anInt9165 -= 2;
											local13 = anIntArray785[anInt9165];
											local19 = anIntArray785[anInt9165 + 1];
											anIntArray785[anInt9165++] = Static610.method8668(local19, local13, true);
											return;
										}
										if (arg0 == 3333) {
											anIntArray785[anInt9165++] = Static59.method1279();
											return;
										}
										if (arg0 == 3335) {
											anIntArray785[anInt9165++] = Static609.anInt9834;
											return;
										}
										if (arg0 == 3336) {
											anInt9165 -= 4;
											local13 = anIntArray785[anInt9165];
											local19 = anIntArray785[anInt9165 + 1];
											local25 = anIntArray785[anInt9165 + 2];
											local357 = anIntArray785[anInt9165 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local357;
											anIntArray785[anInt9165++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray785[anInt9165++] = Static362.anInt5843;
											return;
										}
										if (arg0 == 3338) {
											anIntArray785[anInt9165++] = Static42.method1066();
											return;
										}
										if (arg0 == 3339) {
											anIntArray785[anInt9165++] = 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray785[anInt9165++] = Static633.aBoolean766 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray785[anInt9165++] = Static196.aBoolean295 ? 1 : 0;
											return;
										}
										if (arg0 == 3342) {
											anIntArray785[anInt9165++] = Static22.aClass16_2.method5885();
											return;
										}
										if (arg0 == 3343) {
											anIntArray785[anInt9165++] = Static22.aClass16_2.method5887();
											return;
										}
										if (arg0 == 3344) {
											aStringArray25[anInt9156++] = Static228.method3902();
											return;
										}
										if (arg0 == 3345) {
											aStringArray25[anInt9156++] = Static300.method4623();
											return;
										}
										if (arg0 == 3346) {
											anIntArray785[anInt9165++] = Static571.method8064();
											return;
										}
										if (arg0 == 3347) {
											anIntArray785[anInt9165++] = Static203.anInt3983;
											return;
										}
										if (arg0 == 3349) {
											anIntArray785[anInt9165++] = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass282_7.method7022() >> 3;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5909) Class330 local5909;
										if (arg0 == 3400) {
											anInt9165 -= 2;
											local13 = anIntArray785[anInt9165];
											local19 = anIntArray785[anInt9165 + 1];
											local5909 = Static249.aClass231_1.method5518(local13);
											aStringArray25[anInt9156++] = local5909.method8024(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt9165 -= 4;
											local13 = anIntArray785[anInt9165];
											local19 = anIntArray785[anInt9165 + 1];
											local25 = anIntArray785[anInt9165 + 2];
											local357 = anIntArray785[anInt9165 + 3];
											@Pc(5955) Class330 local5955 = Static249.aClass231_1.method5518(local25);
											if (local5955.aChar6 == local13 && local5955.aChar5 == local19) {
												if (local19 == 115) {
													aStringArray25[anInt9156++] = local5955.method8024(local357);
													return;
												}
												anIntArray785[anInt9165++] = local5955.method8019(local357);
												return;
											}
											throw new RuntimeException("C3408-1 " + local25 + "-" + local357);
										}
										if (arg0 == 3409) {
											anInt9165 -= 3;
											local13 = anIntArray785[anInt9165];
											local19 = anIntArray785[anInt9165 + 1];
											local25 = anIntArray785[anInt9165 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(6041) Class330 local6041 = Static249.aClass231_1.method5518(local19);
											if (local6041.aChar5 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray785[anInt9165++] = local6041.method8025(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray785[--anInt9165];
											local1161 = aStringArray25[--anInt9156];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5909 = Static249.aClass231_1.method5518(local13);
											if (local5909.aChar5 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray785[anInt9165++] = local5909.method8027(local1161) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray785[--anInt9165];
											@Pc(6139) Class330 local6139 = Static249.aClass231_1.method5518(local13);
											anIntArray785[anInt9165++] = local6139.aClass83_38.method2378();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static11.anInt128 == 0) {
												anIntArray785[anInt9165++] = -2;
												return;
											}
											if (Static11.anInt128 == 1) {
												anIntArray785[anInt9165++] = -1;
												return;
											}
											anIntArray785[anInt9165++] = Static458.anInt7581;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray785[--anInt9165];
											if (Static11.anInt128 == 2 && local13 < Static458.anInt7581) {
												aStringArray25[anInt9156++] = Static461.aStringArray20[local13];
												if (Static105.aStringArray5[local13] != null) {
													aStringArray25[anInt9156++] = Static105.aStringArray5[local13];
													return;
												}
												aStringArray25[anInt9156++] = "";
												return;
											}
											aStringArray25[anInt9156++] = "";
											aStringArray25[anInt9156++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray785[--anInt9165];
											if (Static11.anInt128 == 2 && local13 < Static458.anInt7581) {
												anIntArray785[anInt9165++] = Static212.anIntArray839[local13];
												return;
											}
											anIntArray785[anInt9165++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray785[--anInt9165];
											if (Static11.anInt128 == 2 && local13 < Static458.anInt7581) {
												anIntArray785[anInt9165++] = Static561.anIntArray780[local13];
												return;
											}
											anIntArray785[anInt9165++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local4177 = aStringArray25[--anInt9156];
											local19 = anIntArray785[--anInt9165];
											Static271.method8429(local19, local4177);
											return;
										}
										if (arg0 == 3605) {
											local4177 = aStringArray25[--anInt9156];
											Static322.method4920(local4177);
											return;
										}
										if (arg0 == 3606) {
											local4177 = aStringArray25[--anInt9156];
											Static30.method694(local4177);
											return;
										}
										if (arg0 == 3607) {
											local4177 = aStringArray25[--anInt9156];
											Static310.method4735(local4177, false);
											return;
										}
										if (arg0 == 3608) {
											local4177 = aStringArray25[--anInt9156];
											Static113.method2114(local4177);
											return;
										}
										if (arg0 == 3609) {
											local4177 = aStringArray25[--anInt9156];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray785[anInt9165++] = Static44.method1111(local4177) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray785[--anInt9165];
											if (Static11.anInt128 == 2 && local13 < Static458.anInt7581) {
												aStringArray25[anInt9156++] = Static101.aStringArray4[local13];
												return;
											}
											aStringArray25[anInt9156++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static506.aString85 != null) {
												aStringArray25[anInt9156++] = Static93.method9379(Static506.aString85);
												return;
											}
											aStringArray25[anInt9156++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static506.aString85 != null) {
												anIntArray785[anInt9165++] = Static590.anInt9480;
												return;
											}
											anIntArray785[anInt9165++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray785[--anInt9165];
											if (Static506.aString85 != null && local13 < Static590.anInt9480) {
												aStringArray25[anInt9156++] = Static41.aClass189Array1[local13].aString51;
												return;
											}
											aStringArray25[anInt9156++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray785[--anInt9165];
											if (Static506.aString85 != null && local13 < Static590.anInt9480) {
												anIntArray785[anInt9165++] = Static41.aClass189Array1[local13].anInt5136;
												return;
											}
											anIntArray785[anInt9165++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray785[--anInt9165];
											if (Static506.aString85 != null && local13 < Static590.anInt9480) {
												anIntArray785[anInt9165++] = Static41.aClass189Array1[local13].aByte76;
												return;
											}
											anIntArray785[anInt9165++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray785[anInt9165++] = Static198.aByte172;
											return;
										}
										if (arg0 == 3617) {
											local4177 = aStringArray25[--anInt9156];
											Static173.method3149(local4177);
											return;
										}
										if (arg0 == 3618) {
											anIntArray785[anInt9165++] = Static127.aByte33;
											return;
										}
										if (arg0 == 3619) {
											local4177 = aStringArray25[--anInt9156];
											Static54.method1200(local4177);
											return;
										}
										if (arg0 == 3620) {
											Static619.method9236();
											return;
										}
										if (arg0 == 3621) {
											if (Static11.anInt128 == 0) {
												anIntArray785[anInt9165++] = -1;
												return;
											}
											anIntArray785[anInt9165++] = Static94.anInt1782;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray785[--anInt9165];
											if (Static11.anInt128 != 0 && local13 < Static94.anInt1782) {
												aStringArray25[anInt9156++] = Static134.aStringArray7[local13];
												if (Static271.aStringArray31[local13] != null) {
													aStringArray25[anInt9156++] = Static271.aStringArray31[local13];
													return;
												}
												aStringArray25[anInt9156++] = "";
												return;
											}
											aStringArray25[anInt9156++] = "";
											aStringArray25[anInt9156++] = "";
											return;
										}
										if (arg0 == 3623) {
											local4177 = aStringArray25[--anInt9156];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray785[anInt9165++] = Static627.method8777(local4177) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray785[--anInt9165];
											if (Static41.aClass189Array1 != null && local13 < Static590.anInt9480 && Static41.aClass189Array1[local13].aString50.equalsIgnoreCase(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aString123)) {
												anIntArray785[anInt9165++] = 1;
												return;
											}
											anIntArray785[anInt9165++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static459.aString83 != null) {
												aStringArray25[anInt9156++] = Static459.aString83;
												return;
											}
											aStringArray25[anInt9156++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray785[--anInt9165];
											if (Static506.aString85 != null && local13 < Static590.anInt9480) {
												aStringArray25[anInt9156++] = Static41.aClass189Array1[local13].aString53;
												return;
											}
											aStringArray25[anInt9156++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray785[--anInt9165];
											if (Static11.anInt128 == 2 && local13 >= 0 && local13 < Static458.anInt7581) {
												anIntArray785[anInt9165++] = Static577.aBooleanArray57[local13] ? 1 : 0;
												return;
											}
											anIntArray785[anInt9165++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local4177 = aStringArray25[--anInt9156];
											if (local4177.startsWith("<img=0>") || local4177.startsWith("<img=1>")) {
												local4177 = local4177.substring(7);
											}
											anIntArray785[anInt9165++] = Static625.method8768(local4177);
											return;
										}
										if (arg0 == 3629) {
											anIntArray785[anInt9165++] = Static294.anInt6319;
											return;
										}
										if (arg0 == 3630) {
											local4177 = aStringArray25[--anInt9156];
											Static310.method4735(local4177, true);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray785[--anInt9165];
											anIntArray785[anInt9165++] = Static119.aBooleanArray10[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray785[--anInt9165];
											if (Static506.aString85 != null && local13 < Static590.anInt9480) {
												aStringArray25[anInt9156++] = Static41.aClass189Array1[local13].aString50;
												return;
											}
											aStringArray25[anInt9156++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray785[--anInt9165];
											if (Static11.anInt128 != 0 && local13 < Static94.anInt1782) {
												aStringArray25[anInt9156++] = Static166.aStringArray8[local13];
												return;
											}
											aStringArray25[anInt9156++] = "";
											return;
										}
									} else if (arg0 < 3800) {
										if (arg0 == 3700) {
											if (Static84.aClass185_1 != null) {
												anIntArray785[anInt9165++] = 1;
												aClass185_6 = Static84.aClass185_1;
												return;
											}
											anIntArray785[anInt9165++] = 0;
											return;
										}
										if (arg0 == 3701) {
											if (Static333.aClass185_7 != null) {
												anIntArray785[anInt9165++] = 1;
												aClass185_6 = Static333.aClass185_7;
												return;
											}
											anIntArray785[anInt9165++] = 0;
											return;
										}
										if (arg0 == 3702) {
											aStringArray25[anInt9156++] = aClass185_6.aString48;
											return;
										}
										if (arg0 == 3703) {
											anIntArray785[anInt9165++] = aClass185_6.aBoolean369 ? 1 : 0;
											return;
										}
										if (arg0 == 3704) {
											anIntArray785[anInt9165++] = aClass185_6.aByte73;
											return;
										}
										if (arg0 == 3705) {
											anIntArray785[anInt9165++] = aClass185_6.aByte72;
											return;
										}
										if (arg0 == 3706) {
											anIntArray785[anInt9165++] = aClass185_6.aByte74;
											return;
										}
										if (arg0 == 3707) {
											anIntArray785[anInt9165++] = aClass185_6.aByte71;
											return;
										}
										if (arg0 == 3709) {
											anIntArray785[anInt9165++] = aClass185_6.anInt5057;
											return;
										}
										if (arg0 == 3710) {
											local13 = anIntArray785[--anInt9165];
											aStringArray25[anInt9156++] = aClass185_6.aStringArray16[local13];
											return;
										}
										if (arg0 == 3711) {
											local13 = anIntArray785[--anInt9165];
											anIntArray785[anInt9165++] = aClass185_6.aByteArray46[local13];
											return;
										}
										if (arg0 == 3712) {
											anIntArray785[anInt9165++] = aClass185_6.anInt5076;
											return;
										}
										if (arg0 == 3713) {
											local13 = anIntArray785[--anInt9165];
											aStringArray25[anInt9156++] = aClass185_6.aStringArray15[local13];
											return;
										}
										if (arg0 == 3714) {
											anInt9165 -= 3;
											local13 = anIntArray785[anInt9165];
											local19 = anIntArray785[anInt9165 + 1];
											local25 = anIntArray785[anInt9165 + 2];
											anIntArray785[anInt9165++] = aClass185_6.method4646(local25, local13, local19);
											return;
										}
										if (arg0 == 3715) {
											anIntArray785[anInt9165++] = aClass185_6.anInt5049;
											return;
										}
										if (arg0 == 3716) {
											anIntArray785[anInt9165++] = aClass185_6.anInt5074;
											return;
										}
										if (arg0 == 3717) {
											anIntArray785[anInt9165++] = aClass185_6.method4650(aStringArray25[--anInt9156]);
											return;
										}
										if (arg0 == 3718) {
											anIntArray785[anInt9165 - 1] = aClass185_6.method4637()[anIntArray785[anInt9165 - 1]];
											return;
										}
										if (arg0 == 3750) {
											if (Static195.aClass3_Sub30_4 != null) {
												anIntArray785[anInt9165++] = 1;
												aClass3_Sub30_9 = Static195.aClass3_Sub30_4;
												return;
											}
											anIntArray785[anInt9165++] = 0;
											return;
										}
										if (arg0 == 3751) {
											if (Static90.aClass3_Sub30_10 != null) {
												anIntArray785[anInt9165++] = 1;
												aClass3_Sub30_9 = Static90.aClass3_Sub30_10;
												return;
											}
											anIntArray785[anInt9165++] = 0;
											return;
										}
										if (arg0 == 3752) {
											aStringArray25[anInt9156++] = aClass3_Sub30_9.aString39;
											return;
										}
										if (arg0 == 3753) {
											anIntArray785[anInt9165++] = aClass3_Sub30_9.aByte61;
											return;
										}
										if (arg0 == 3754) {
											anIntArray785[anInt9165++] = aClass3_Sub30_9.aByte60;
											return;
										}
										if (arg0 == 3755) {
											anIntArray785[anInt9165++] = aClass3_Sub30_9.anInt4268;
											return;
										}
										if (arg0 == 3756) {
											local13 = anIntArray785[--anInt9165];
											aStringArray25[anInt9156++] = aClass3_Sub30_9.aClass391Array1[local13].aString127;
											return;
										}
										if (arg0 == 3757) {
											local13 = anIntArray785[--anInt9165];
											anIntArray785[anInt9165++] = aClass3_Sub30_9.aClass391Array1[local13].aByte181;
											return;
										}
										if (arg0 == 3758) {
											local13 = anIntArray785[--anInt9165];
											anIntArray785[anInt9165++] = aClass3_Sub30_9.aClass391Array1[local13].anInt10842;
											return;
										}
										if (arg0 == 3759) {
											local13 = anIntArray785[--anInt9165];
											Static60.method1289(local13, aClass3_Sub30_9 == Static90.aClass3_Sub30_10);
											return;
										}
										if (arg0 == 3760) {
											anIntArray785[anInt9165++] = aClass3_Sub30_9.method3896(aStringArray25[--anInt9156]);
											return;
										}
										if (arg0 == 3761) {
											anIntArray785[anInt9165 - 1] = aClass3_Sub30_9.method3895()[anIntArray785[anInt9165 - 1]];
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray785[--anInt9165];
											anIntArray785[anInt9165++] = Static236.aClass283Array1[local13].method7024();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray785[--anInt9165];
											anIntArray785[anInt9165++] = Static236.aClass283Array1[local13].anInt8029;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray785[--anInt9165];
											anIntArray785[anInt9165++] = Static236.aClass283Array1[local13].anInt8030;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray785[--anInt9165];
											anIntArray785[anInt9165++] = Static236.aClass283Array1[local13].anInt8024;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray785[--anInt9165];
											anIntArray785[anInt9165++] = Static236.aClass283Array1[local13].anInt8027;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray785[--anInt9165];
											anIntArray785[anInt9165++] = Static236.aClass283Array1[local13].anInt8025;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray785[--anInt9165];
											local19 = Static236.aClass283Array1[local13].method7023();
											anIntArray785[anInt9165++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray785[--anInt9165];
											local19 = Static236.aClass283Array1[local13].method7023();
											anIntArray785[anInt9165++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray785[--anInt9165];
											local19 = Static236.aClass283Array1[local13].method7023();
											anIntArray785[anInt9165++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray785[--anInt9165];
											local19 = Static236.aClass283Array1[local13].method7023();
											anIntArray785[anInt9165++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else {
										@Pc(8208) long local8208;
										if (arg0 < 4100) {
											if (arg0 == 4000) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												anIntArray785[anInt9165++] = local13 + local19;
												return;
											}
											if (arg0 == 4001) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												anIntArray785[anInt9165++] = local13 - local19;
												return;
											}
											if (arg0 == 4002) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												anIntArray785[anInt9165++] = local13 * local19;
												return;
											}
											if (arg0 == 4003) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												anIntArray785[anInt9165++] = local13 / local19;
												return;
											}
											if (arg0 == 4004) {
												local13 = anIntArray785[--anInt9165];
												anIntArray785[anInt9165++] = (int) (Math.random() * (double) local13);
												return;
											}
											if (arg0 == 4005) {
												local13 = anIntArray785[--anInt9165];
												anIntArray785[anInt9165++] = (int) (Math.random() * (double) (local13 + 1));
												return;
											}
											if (arg0 == 4006) {
												anInt9165 -= 5;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												local25 = anIntArray785[anInt9165 + 2];
												local357 = anIntArray785[anInt9165 + 3];
												local2473 = anIntArray785[anInt9165 + 4];
												anIntArray785[anInt9165++] = local13 + (local19 - local13) * (local2473 - local25) / (local357 - local25);
												return;
											}
											@Pc(8215) long local8215;
											if (arg0 == 4007) {
												anInt9165 -= 2;
												local8208 = (long) anIntArray785[anInt9165];
												local8215 = (long) anIntArray785[anInt9165 + 1];
												anIntArray785[anInt9165++] = (int) (local8208 + local8208 * local8215 / 100L);
												return;
											}
											if (arg0 == 4008) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												anIntArray785[anInt9165++] = local13 | 0x1 << local19;
												return;
											}
											if (arg0 == 4009) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												anIntArray785[anInt9165++] = local13 & -(0x1 << local19) - 1;
												return;
											}
											if (arg0 == 4010) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												anIntArray785[anInt9165++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
												return;
											}
											if (arg0 == 4011) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												anIntArray785[anInt9165++] = local13 % local19;
												return;
											}
											if (arg0 == 4012) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												if (local13 == 0) {
													anIntArray785[anInt9165++] = 0;
													return;
												}
												anIntArray785[anInt9165++] = (int) Math.pow((double) local13, (double) local19);
												return;
											}
											if (arg0 == 4013) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												if (local13 == 0) {
													anIntArray785[anInt9165++] = 0;
													return;
												}
												if (local19 == 0) {
													anIntArray785[anInt9165++] = Integer.MAX_VALUE;
													return;
												}
												anIntArray785[anInt9165++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
												return;
											}
											if (arg0 == 4014) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												anIntArray785[anInt9165++] = local13 & local19;
												return;
											}
											if (arg0 == 4015) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												anIntArray785[anInt9165++] = local13 | local19;
												return;
											}
											if (arg0 == 4016) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												anIntArray785[anInt9165++] = local13 < local19 ? local13 : local19;
												return;
											}
											if (arg0 == 4017) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												anIntArray785[anInt9165++] = local13 > local19 ? local13 : local19;
												return;
											}
											if (arg0 == 4018) {
												anInt9165 -= 3;
												local8208 = (long) anIntArray785[anInt9165];
												local8215 = (long) anIntArray785[anInt9165 + 1];
												@Pc(8596) long local8596 = (long) anIntArray785[anInt9165 + 2];
												anIntArray785[anInt9165++] = (int) (local8208 * local8596 / local8215);
												return;
											}
											if (arg0 == 4019) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												if (local13 > 700 || local19 > 700) {
													anIntArray785[anInt9165++] = 256;
												}
												@Pc(8655) double local8655 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
												anIntArray785[anInt9165++] = (int) (Math.pow(2.0D, local8655) + 0.5D);
												return;
											}
											if (arg0 == 4020) {
												local13 = anIntArray785[--anInt9165];
												anIntArray785[anInt9165++] = Static211.anIntArray738[Static502.method3753(local13) & 0xFFFF];
												return;
											}
										} else if (arg0 < 4200) {
											if (arg0 == 4100) {
												local4177 = aStringArray25[--anInt9156];
												local19 = anIntArray785[--anInt9165];
												aStringArray25[anInt9156++] = local4177 + local19;
												return;
											}
											if (arg0 == 4101) {
												anInt9156 -= 2;
												local4177 = aStringArray25[anInt9156];
												local1161 = aStringArray25[anInt9156 + 1];
												aStringArray25[anInt9156++] = local4177 + local1161;
												return;
											}
											if (arg0 == 4102) {
												local4177 = aStringArray25[--anInt9156];
												local19 = anIntArray785[--anInt9165];
												aStringArray25[anInt9156++] = local4177 + Static112.method5091(local19, true);
												return;
											}
											if (arg0 == 4103) {
												local4177 = aStringArray25[--anInt9156];
												aStringArray25[anInt9156++] = local4177.toLowerCase();
												return;
											}
											if (arg0 == 4104) {
												aStringArray25[anInt9156++] = Static263.method4293(Static609.anInt9834, Static162.method2939(anIntArray785[--anInt9165]));
												return;
											}
											if (arg0 == 4105) {
												anInt9156 -= 2;
												local4177 = aStringArray25[anInt9156];
												local1161 = aStringArray25[anInt9156 + 1];
												if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass30_1 != null && Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aClass30_1.aBoolean61) {
													aStringArray25[anInt9156++] = local1161;
													return;
												}
												aStringArray25[anInt9156++] = local4177;
												return;
											}
											if (arg0 == 4106) {
												local13 = anIntArray785[--anInt9165];
												aStringArray25[anInt9156++] = Integer.toString(local13);
												return;
											}
											if (arg0 == 4107) {
												anInt9156 -= 2;
												anIntArray785[anInt9165++] = Static379.method5470(aStringArray25[anInt9156], aStringArray25[anInt9156 + 1], Static609.anInt9834);
												return;
											}
											@Pc(8968) Class88 local8968;
											if (arg0 == 4108) {
												local4177 = aStringArray25[--anInt9156];
												anInt9165 -= 2;
												local19 = anIntArray785[anInt9165];
												local25 = anIntArray785[anInt9165 + 1];
												local8968 = Static617.method8708(Static218.aClass15_62, local25);
												anIntArray785[anInt9165++] = local8968.method2503(Static52.aClass33Array6, local4177, local19);
												return;
											}
											if (arg0 == 4109) {
												local4177 = aStringArray25[--anInt9156];
												anInt9165 -= 2;
												local19 = anIntArray785[anInt9165];
												local25 = anIntArray785[anInt9165 + 1];
												local8968 = Static617.method8708(Static218.aClass15_62, local25);
												anIntArray785[anInt9165++] = local8968.method2507(local4177, local19, Static52.aClass33Array6);
												return;
											}
											if (arg0 == 4110) {
												anInt9156 -= 2;
												local4177 = aStringArray25[anInt9156];
												local1161 = aStringArray25[anInt9156 + 1];
												if (anIntArray785[--anInt9165] == 1) {
													aStringArray25[anInt9156++] = local4177;
													return;
												}
												aStringArray25[anInt9156++] = local1161;
												return;
											}
											if (arg0 == 4111) {
												local4177 = aStringArray25[--anInt9156];
												aStringArray25[anInt9156++] = Static342.method5133(local4177);
												return;
											}
											if (arg0 == 4112) {
												local4177 = aStringArray25[--anInt9156];
												local19 = anIntArray785[--anInt9165];
												if (local19 == -1) {
													throw new RuntimeException("null char");
												}
												aStringArray25[anInt9156++] = local4177 + (char) local19;
												return;
											}
											if (arg0 == 4113) {
												local13 = anIntArray785[--anInt9165];
												anIntArray785[anInt9165++] = method8002((char) local13);
												return;
											}
											if (arg0 == 4114) {
												local13 = anIntArray785[--anInt9165];
												anIntArray785[anInt9165++] = Static460.method6705((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4115) {
												local13 = anIntArray785[--anInt9165];
												anIntArray785[anInt9165++] = Static411.method5866((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4116) {
												local13 = anIntArray785[--anInt9165];
												anIntArray785[anInt9165++] = Static395.method5577((char) local13) ? 1 : 0;
												return;
											}
											if (arg0 == 4117) {
												local4177 = aStringArray25[--anInt9156];
												if (local4177 != null) {
													anIntArray785[anInt9165++] = local4177.length();
													return;
												}
												anIntArray785[anInt9165++] = 0;
												return;
											}
											if (arg0 == 4118) {
												local4177 = aStringArray25[--anInt9156];
												anInt9165 -= 2;
												local19 = anIntArray785[anInt9165];
												local25 = anIntArray785[anInt9165 + 1];
												aStringArray25[anInt9156++] = local4177.substring(local19, local25);
												return;
											}
											if (arg0 == 4119) {
												local4177 = aStringArray25[--anInt9156];
												@Pc(9326) StringBuffer local9326 = new StringBuffer(local4177.length());
												@Pc(9328) boolean local9328 = false;
												for (local357 = 0; local357 < local4177.length(); local357++) {
													@Pc(9335) char local9335 = local4177.charAt(local357);
													if (local9335 == '<') {
														local9328 = true;
													} else if (local9335 == '>') {
														local9328 = false;
													} else if (!local9328) {
														local9326.append(local9335);
													}
												}
												aStringArray25[anInt9156++] = local9326.toString();
												return;
											}
											if (arg0 == 4120) {
												local4177 = aStringArray25[--anInt9156];
												anInt9165 -= 2;
												local19 = anIntArray785[anInt9165];
												local25 = anIntArray785[anInt9165 + 1];
												anIntArray785[anInt9165++] = local4177.indexOf(local19, local25);
												return;
											}
											if (arg0 == 4121) {
												anInt9156 -= 2;
												local4177 = aStringArray25[anInt9156];
												local1161 = aStringArray25[anInt9156 + 1];
												local25 = anIntArray785[--anInt9165];
												anIntArray785[anInt9165++] = local4177.indexOf(local1161, local25);
												return;
											}
											if (arg0 == 4122) {
												local13 = anIntArray785[--anInt9165];
												anIntArray785[anInt9165++] = Character.toLowerCase((char) local13);
												return;
											}
											if (arg0 == 4123) {
												local13 = anIntArray785[--anInt9165];
												anIntArray785[anInt9165++] = Character.toUpperCase((char) local13);
												return;
											}
											if (arg0 == 4124) {
												local420 = anIntArray785[--anInt9165] != 0;
												local19 = anIntArray785[--anInt9165];
												aStringArray25[anInt9156++] = Static530.method7668(local420, (long) local19, Static609.anInt9834, 0);
												return;
											}
											if (arg0 == 4125) {
												local4177 = aStringArray25[--anInt9156];
												local19 = anIntArray785[--anInt9165];
												@Pc(9549) Class88 local9549 = Static617.method8708(Static218.aClass15_62, local19);
												anIntArray785[anInt9165++] = local9549.method2508(Static52.aClass33Array6, local4177);
												return;
											}
											if (arg0 == 4126) {
												aStringArray25[anInt9156++] = Static83.method1603(Static609.anInt9834, (long) anIntArray785[--anInt9165] * 60000L) + " UTC";
												return;
											}
											if (arg0 == 4127) {
												local8208 = aLongArray24[--anInt9160];
												aStringArray25[anInt9156++] = local8208 == -1L ? "" : Long.toString(local8208, 36).toUpperCase();
												return;
											}
										} else if (arg0 < 4300) {
											if (arg0 == 4200) {
												local13 = anIntArray785[--anInt9165];
												aStringArray25[anInt9156++] = Static170.aClass370_1.method8900(local13).aString121;
												return;
											}
											@Pc(9672) Class374 local9672;
											if (arg0 == 4201) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												local9672 = Static170.aClass370_1.method8900(local13);
												if (local19 >= 1 && local19 <= 5 && local9672.aStringArray40[local19 - 1] != null) {
													aStringArray25[anInt9156++] = local9672.aStringArray40[local19 - 1];
													return;
												}
												aStringArray25[anInt9156++] = "";
												return;
											}
											if (arg0 == 4202) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												local9672 = Static170.aClass370_1.method8900(local13);
												if (local19 >= 1 && local19 <= 5 && local9672.aStringArray41[local19 - 1] != null) {
													aStringArray25[anInt9156++] = local9672.aStringArray41[local19 - 1];
													return;
												}
												aStringArray25[anInt9156++] = "";
												return;
											}
											if (arg0 == 4203) {
												local13 = anIntArray785[--anInt9165];
												anIntArray785[anInt9165++] = Static170.aClass370_1.method8900(local13).anInt10279;
												return;
											}
											if (arg0 == 4204) {
												local13 = anIntArray785[--anInt9165];
												anIntArray785[anInt9165++] = Static170.aClass370_1.method8900(local13).anInt10300 == 1 ? 1 : 0;
												return;
											}
											@Pc(9835) Class374 local9835;
											if (arg0 == 4205) {
												local13 = anIntArray785[--anInt9165];
												local9835 = Static170.aClass370_1.method8900(local13);
												if (local9835.anInt10284 == -1 && local9835.anInt10339 >= 0) {
													anIntArray785[anInt9165++] = local9835.anInt10339;
													return;
												}
												anIntArray785[anInt9165++] = local13;
												return;
											}
											if (arg0 == 4206) {
												local13 = anIntArray785[--anInt9165];
												local9835 = Static170.aClass370_1.method8900(local13);
												if (local9835.anInt10284 >= 0 && local9835.anInt10339 >= 0) {
													anIntArray785[anInt9165++] = local9835.anInt10339;
													return;
												}
												anIntArray785[anInt9165++] = local13;
												return;
											}
											if (arg0 == 4207) {
												local13 = anIntArray785[--anInt9165];
												anIntArray785[anInt9165++] = Static170.aClass370_1.method8900(local13).aBoolean776 ? 1 : 0;
												return;
											}
											if (arg0 == 4208) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												local3242 = Static467.aClass367_1.method8812(local19);
												if (local3242.method7885()) {
													aStringArray25[anInt9156++] = Static170.aClass370_1.method8900(local13).method8996(local19, local3242.aString106);
													return;
												}
												anIntArray785[anInt9165++] = Static170.aClass370_1.method8900(local13).method8997(local3242.anInt9033, local19);
												return;
											}
											if (arg0 == 4209) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1] - 1;
												local9672 = Static170.aClass370_1.method8900(local13);
												if (local9672.anInt10290 == local19) {
													anIntArray785[anInt9165++] = local9672.anInt10296;
													return;
												}
												if (local9672.anInt10285 == local19) {
													anIntArray785[anInt9165++] = local9672.anInt10320;
													return;
												}
												anIntArray785[anInt9165++] = -1;
												return;
											}
											if (arg0 == 4210) {
												local4177 = aStringArray25[--anInt9156];
												local19 = anIntArray785[--anInt9165];
												Static472.method6843(local19 == 1, local4177);
												anIntArray785[anInt9165++] = Static478.anInt7943;
												return;
											}
											if (arg0 == 4211) {
												if (Static436.aShortArray104 != null && Static492.anInt8115 < Static478.anInt7943) {
													anIntArray785[anInt9165++] = Static436.aShortArray104[Static492.anInt8115++] & 0xFFFF;
													return;
												}
												anIntArray785[anInt9165++] = -1;
												return;
											}
											if (arg0 == 4212) {
												Static492.anInt8115 = 0;
												return;
											}
											if (arg0 == 4213) {
												local13 = anIntArray785[--anInt9165];
												anIntArray785[anInt9165++] = Static170.aClass370_1.method8900(local13).anInt10311;
												return;
											}
											if (arg0 == 4214) {
												local4177 = aStringArray25[--anInt9156];
												anInt9165 -= 3;
												local19 = anIntArray785[anInt9165];
												local25 = anIntArray785[anInt9165 + 1];
												local357 = anIntArray785[anInt9165 + 2];
												Static279.method4460(local25, local4177, local357, local19 == 1);
												anIntArray785[anInt9165++] = Static478.anInt7943;
												return;
											}
											if (arg0 == 4215) {
												anInt9156 -= 2;
												anInt9165 -= 2;
												local4177 = aStringArray25[anInt9156];
												local19 = anIntArray785[anInt9165];
												local25 = anIntArray785[anInt9165 + 1];
												@Pc(10234) String local10234 = aStringArray25[anInt9156 + 1];
												Static657.method9125(local4177, local10234, local25, local19 == 1);
												anIntArray785[anInt9165++] = Static478.anInt7943;
												return;
											}
										} else if (arg0 < 4400) {
											if (arg0 == 4300) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												local3242 = Static467.aClass367_1.method8812(local19);
												if (local3242.method7885()) {
													aStringArray25[anInt9156++] = Static580.aClass36_2.method1057(local13).method7262(local19, local3242.aString106);
													return;
												}
												anIntArray785[anInt9165++] = Static580.aClass36_2.method1057(local13).method7261(local19, local3242.anInt9033);
												return;
											}
										} else if (arg0 < 4500) {
											if (arg0 == 4400) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												local3242 = Static467.aClass367_1.method8812(local19);
												if (local3242.method7885()) {
													aStringArray25[anInt9156++] = Static652.aClass267_4.method6682(local13).method6807(local19, local3242.aString106);
													return;
												}
												anIntArray785[anInt9165++] = Static652.aClass267_4.method6682(local13).method6805(local19, local3242.anInt9033);
												return;
											}
										} else if (arg0 < 4600) {
											if (arg0 == 4500) {
												anInt9165 -= 2;
												local13 = anIntArray785[anInt9165];
												local19 = anIntArray785[anInt9165 + 1];
												local3242 = Static467.aClass367_1.method8812(local19);
												if (local3242.method7885()) {
													aStringArray25[anInt9156++] = Static155.aClass275_1.method6772(local13).method4814(local3242.aString106, local19);
													return;
												}
												anIntArray785[anInt9165++] = Static155.aClass275_1.method6772(local13).method4808(local3242.anInt9033, local19);
												return;
											}
										} else if (arg0 < 4700) {
											if (arg0 == 4600) {
												local13 = anIntArray785[--anInt9165];
												@Pc(10462) Class359 local10462 = Static282.aClass52_1.method1313(local13);
												if (local10462.anIntArray864 != null && local10462.anIntArray864.length > 0) {
													local25 = 0;
													local357 = local10462.anIntArray866[0];
													for (local2473 = 1; local2473 < local10462.anIntArray864.length; local2473++) {
														if (local10462.anIntArray866[local2473] > local357) {
															local25 = local2473;
															local357 = local10462.anIntArray866[local2473];
														}
													}
													anIntArray785[anInt9165++] = local10462.anIntArray864[local25];
													return;
												}
												anIntArray785[anInt9165++] = local10462.anInt9987;
												return;
											}
										} else if (arg0 < 4800) {
											if (arg0 == 4700) {
												anIntArray785[anInt9165++] = Static474.aBoolean594 ? 1 : 0;
												return;
											}
											if (arg0 == 4701) {
												local4177 = aStringArray25[--anInt9156];
												if (Static406.anInt6454 == 7 && !Static537.method1805()) {
													if (local4177.length() > 20) {
														Static501.aByte115 = -4;
														return;
													}
													Static501.aByte115 = -1;
													local4266 = Static172.method3123(Static163.aClass375_1, Static508.aClass218_126);
													local4266.aClass3_Sub25_Sub1_2.method8614(0);
													local25 = local4266.aClass3_Sub25_Sub1_2.anInt9765;
													local4266.aClass3_Sub25_Sub1_2.method8583(local4177);
													local4266.aClass3_Sub25_Sub1_2.method8628(local4266.aClass3_Sub25_Sub1_2.anInt9765 - local25);
													Static441.method6275(local4266);
													return;
												}
												Static501.aByte115 = -5;
												return;
											}
											if (arg0 == 4702) {
												anIntArray785[anInt9165++] = Static501.aByte115;
												if (Static501.aByte115 != -1) {
													Static501.aByte115 = -6;
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
							local137 = Static383.method5492(anIntArray785[--anInt9165]);
						} else {
							local137 = arg1 ? aClass260_19 : aClass260_18;
						}
						if (arg0 == 1300) {
							local19 = anIntArray785[--anInt9165] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method6251(aStringArray25[--anInt9156], local19);
								return;
							}
							anInt9156--;
							return;
						}
						if (arg0 == 1301) {
							anInt9165 -= 2;
							local19 = anIntArray785[anInt9165];
							local25 = anIntArray785[anInt9165 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass260_15 = null;
								return;
							}
							local137.aClass260_15 = Static245.method4101(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray785[--anInt9165];
							if (local19 != Static473.anInt7805 && local19 != Static107.anInt2220 && local19 != Static177.anInt3510) {
								return;
							}
							local137.anInt6937 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt6986 = anIntArray785[--anInt9165];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt7017 = anIntArray785[--anInt9165];
							return;
						}
						if (arg0 == 1305) {
							local137.aString75 = aStringArray25[--anInt9156];
							return;
						}
						if (arg0 == 1306) {
							local137.aString72 = aStringArray25[--anInt9156];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray19 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt6981 = anIntArray785[--anInt9165];
							local137.anInt6978 = anIntArray785[--anInt9165];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray785[--anInt9165];
							local25 = anIntArray785[--anInt9165];
							if (local25 >= 1 && local25 <= 10) {
								local137.method6256(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString71 = aStringArray25[--anInt9156];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt7010 = anIntArray785[--anInt9165];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt9165 -= 3;
								local19 = anIntArray785[anInt9165] - 1;
								local25 = anIntArray785[anInt9165 + 1];
								local357 = anIntArray785[anInt9165 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt9165 -= 2;
								local19 = 10;
								local25 = anIntArray785[anInt9165];
								local357 = anIntArray785[anInt9165 + 1];
							}
							if (local137.aByteArray77 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray77 = new byte[11];
								local137.aByteArray78 = new byte[11];
								local137.anIntArray628 = new int[11];
							}
							local137.aByteArray77[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean505 = false;
								for (local2473 = 0; local2473 < local137.aByteArray77.length; local2473++) {
									if (local137.aByteArray77[local2473] != 0) {
										local137.aBoolean505 = true;
										break;
									}
								}
							} else {
								local137.aBoolean505 = true;
							}
							local137.aByteArray78[local19] = (byte) local357;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt6998 = anIntArray785[--anInt9165];
							return;
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static383.method5492(anIntArray785[--anInt9165]);
					} else {
						local137 = arg1 ? aClass260_19 : aClass260_18;
					}
					Static456.method8151(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt9165 -= 2;
						local19 = anIntArray785[anInt9165];
						local25 = anIntArray785[anInt9165 + 1];
						if (local137.anInt6985 == -1) {
							Static149.method2769(local137.anInt6930);
							Static476.method6894(local137.anInt6930);
							Static119.method2273(local137.anInt6930);
						}
						if (local19 == -1) {
							local137.anInt6935 = 1;
							local137.anInt7000 = -1;
							local137.anInt6964 = -1;
							return;
						}
						local137.anInt6964 = local19;
						local137.anInt6996 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean498 = true;
						} else {
							local137.aBoolean498 = false;
						}
						@Pc(1813) Class374 local1813 = Static170.aClass370_1.method8900(local19);
						local137.anInt6974 = local1813.anInt10302;
						local137.anInt6973 = local1813.anInt10272;
						local137.anInt6945 = local1813.anInt10280;
						local137.anInt7004 = local1813.anInt10294;
						local137.anInt6926 = local1813.anInt10321;
						local137.anInt6989 = local1813.anInt10314;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt6955 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt6955 = 1;
						} else {
							local137.anInt6955 = 2;
						}
						if (local137.anInt6975 > 0) {
							local137.anInt6989 = local137.anInt6989 * 32 / local137.anInt6975;
							return;
						}
						if (local137.anInt6931 > 0) {
							local137.anInt6989 = local137.anInt6989 * 32 / local137.anInt6931;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt6935 = 2;
						local137.anInt7000 = anIntArray785[--anInt9165];
						if (local137.anInt6985 == -1) {
							Static166.method3025(local137.anInt6930);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt6935 = 3;
						local137.anInt7000 = -1;
						if (local137.anInt6985 == -1) {
							Static166.method3025(local137.anInt6930);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt6935 = 6;
						local137.anInt7000 = anIntArray785[--anInt9165];
						if (local137.anInt6985 == -1) {
							Static166.method3025(local137.anInt6930);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt6935 = 5;
						local137.anInt7000 = anIntArray785[--anInt9165];
						if (local137.anInt6985 == -1) {
							Static166.method3025(local137.anInt6930);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt9165 -= 4;
						local137.anInt6990 = anIntArray785[anInt9165];
						local137.anInt6994 = anIntArray785[anInt9165 + 1];
						local137.lb = anIntArray785[anInt9165 + 2];
						local137.anInt6943 = anIntArray785[anInt9165 + 3];
						Static456.method8151(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt9165 -= 2;
						local137.anInt6962 = anIntArray785[anInt9165];
						local137.anInt6948 = anIntArray785[anInt9165 + 1];
						Static456.method8151(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt9165 -= 4;
						local137.anInt7000 = anIntArray785[anInt9165];
						local137.anInt6959 = anIntArray785[anInt9165 + 1];
						if (anIntArray785[anInt9165 + 2] == 1) {
							local137.anInt6935 = 9;
						} else {
							local137.anInt6935 = 8;
						}
						if (anIntArray785[anInt9165 + 3] == 1) {
							local137.aBoolean498 = true;
						} else {
							local137.aBoolean498 = false;
						}
						if (local137.anInt6985 == -1) {
							Static166.method3025(local137.anInt6930);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt6935 = 5;
						local137.anInt7000 = Static106.anInt2205;
						local137.anInt6959 = 0;
						if (local137.anInt6985 == -1) {
							Static166.method3025(local137.anInt6930);
						}
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!tg;I)V")
	private static void method8004(@OriginalArg(0) Class3_Sub11_Sub16 arg0, @OriginalArg(1) int arg1) {
		anInt9165 = 0;
		anInt9156 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray801;
		@Pc(11) int[] local11 = arg0.anIntArray802;
		@Pc(13) byte local13 = -1;
		anInt9167 = 0;
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
						method8003(local31, local1134);
					} else if (local31 >= 5000 && local31 < 10000) {
						method8013(local31, local1134);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray785[anInt9165++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray785[anInt9165++] = Static131.aClass66_1.anIntArray143[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static131.aClass66_1.method1633(local54, anIntArray785[--anInt9165]);
					} else if (local31 == 3) {
						aStringArray25[anInt9156++] = arg0.aStringArray27[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt9165 -= 2;
						if (anIntArray785[anInt9165] != anIntArray785[anInt9165 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt9165 -= 2;
						if (anIntArray785[anInt9165] == anIntArray785[anInt9165 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt9165 -= 2;
						if (anIntArray785[anInt9165] < anIntArray785[anInt9165 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt9165 -= 2;
						if (anIntArray785[anInt9165] > anIntArray785[anInt9165 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt9167 == 0) {
							return;
						}
						@Pc(216) Class87 local216 = aClass87Array1[--anInt9167];
						arg0 = local216.aClass3_Sub11_Sub16_1;
						local8 = arg0.anIntArray801;
						local11 = arg0.anIntArray802;
						local5 = local216.anInt2720;
						anIntArray787 = local216.anIntArray227;
						aStringArray26 = local216.aStringArray6;
						aLongArray23 = local216.aLongArray2;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray785[anInt9165++] = Static131.aClass66_1.method1629(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static131.aClass66_1.method1637(local54, anIntArray785[--anInt9165]);
					} else if (local31 == 31) {
						anInt9165 -= 2;
						if (anIntArray785[anInt9165] <= anIntArray785[anInt9165 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt9165 -= 2;
						if (anIntArray785[anInt9165] >= anIntArray785[anInt9165 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray785[anInt9165++] = anIntArray787[local11[local5]];
					} else if (local31 == 34) {
						anIntArray787[local11[local5]] = anIntArray785[--anInt9165];
					} else if (local31 == 35) {
						aStringArray25[anInt9156++] = aStringArray26[local11[local5]];
					} else if (local31 == 36) {
						aStringArray26[local11[local5]] = aStringArray25[--anInt9156];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt9156 -= local54;
						@Pc(403) String local403 = Static615.method8694(local54, aStringArray25, anInt9156);
						aStringArray25[anInt9156++] = local403;
					} else if (local31 == 38) {
						anInt9165--;
					} else if (local31 == 39) {
						anInt9156--;
					} else if (local31 == 40) {
						local54 = local11[local5];
						@Pc(439) Class3_Sub11_Sub16 local439 = Static644.method8952(local54);
						if (local439 == null) {
							throw new RuntimeException();
						}
						@Pc(449) int[] local449 = new int[local439.anInt9265];
						@Pc(453) String[] local453 = new String[local439.anInt9266];
						@Pc(457) long[] local457 = new long[local439.anInt9262];
						for (@Pc(459) int local459 = 0; local459 < local439.anInt9260; local459++) {
							local449[local459] = anIntArray785[anInt9165 + local459 - local439.anInt9260];
						}
						for (@Pc(478) int local478 = 0; local478 < local439.anInt9263; local478++) {
							local453[local478] = aStringArray25[anInt9156 + local478 - local439.anInt9263];
						}
						for (@Pc(497) int local497 = 0; local497 < local439.anInt9264; local497++) {
							local457[local497] = aLongArray24[anInt9160 + local497 - local439.anInt9264];
						}
						anInt9165 -= local439.anInt9260;
						anInt9156 -= local439.anInt9263;
						anInt9160 -= local439.anInt9264;
						@Pc(533) Class87 local533 = new Class87();
						local533.aClass3_Sub11_Sub16_1 = arg0;
						local533.anInt2720 = local5;
						local533.anIntArray227 = anIntArray787;
						local533.aStringArray6 = aStringArray26;
						local533.aLongArray2 = aLongArray23;
						if (anInt9167 >= aClass87Array1.length) {
							throw new RuntimeException();
						}
						aClass87Array1[anInt9167++] = local533;
						arg0 = local439;
						local8 = local439.anIntArray801;
						local11 = local439.anIntArray802;
						local5 = -1;
						anIntArray787 = local449;
						aStringArray26 = local453;
						aLongArray23 = local457;
					} else if (local31 == 42) {
						anIntArray785[anInt9165++] = Static449.anIntArray636[local11[local5]];
					} else if (local31 == 43) {
						local54 = local11[local5];
						Static449.anIntArray636[local54] = anIntArray785[--anInt9165];
						Static134.method2509(local54);
						Static430.aBoolean489 |= Static487.aBooleanArray38[local54];
					} else if (local31 == 44) {
						local54 = local11[local5] >> 16;
						local639 = local11[local5] & 0xFFFF;
						@Pc(647) int local647 = anIntArray785[--anInt9165];
						if (local647 >= 0 && local647 <= 5000) {
							anIntArray784[local54] = local647;
							@Pc(662) byte local662 = -1;
							if (local639 == 105) {
								local662 = 0;
							}
							@Pc(669) int local669 = 0;
							while (true) {
								if (local669 >= local647) {
									continue label333;
								}
								anIntArrayArray52[local54][local669] = local662;
								local669++;
							}
						}
						throw new RuntimeException();
					} else if (local31 == 45) {
						local54 = local11[local5];
						local639 = anIntArray785[--anInt9165];
						if (local639 < 0 || local639 >= anIntArray784[local54]) {
							throw new RuntimeException();
						}
						anIntArray785[anInt9165++] = anIntArrayArray52[local54][local639];
					} else if (local31 == 46) {
						local54 = local11[local5];
						anInt9165 -= 2;
						local639 = anIntArray785[anInt9165];
						if (local639 < 0 || local639 >= anIntArray784[local54]) {
							throw new RuntimeException();
						}
						anIntArrayArray52[local54][local639] = anIntArray785[anInt9165 + 1];
					} else if (local31 == 47) {
						@Pc(766) String local766 = Static628.aStringArray37[local11[local5]];
						if (local766 == null) {
							local766 = "null";
						}
						aStringArray25[anInt9156++] = local766;
					} else if (local31 == 48) {
						local54 = local11[local5];
						Static628.aStringArray37[local54] = aStringArray25[--anInt9156];
						Static211.method7570(local54);
					} else if (local31 == 51) {
						@Pc(810) Class83 local810 = arg0.aClass83Array1[local11[local5]];
						@Pc(823) Class3_Sub33 local823 = (Class3_Sub33) local810.method2368((long) anIntArray785[--anInt9165]);
						if (local823 != null) {
							local5 += local823.anInt4831;
						}
					} else if (local31 == 54) {
						aLongArray24[anInt9160++] = arg0.aLongArray25[local5];
					} else if (local31 == 55) {
						anInt9160--;
					} else if (local31 == 66) {
						aLongArray24[anInt9160++] = aLongArray23[local11[local5]];
					} else if (local31 == 67) {
						aLongArray23[local11[local5]] = aLongArray24[--anInt9160];
					} else if (local31 == 68) {
						anInt9160 -= 2;
						if (aLongArray24[anInt9160] != aLongArray24[anInt9160 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 69) {
						anInt9160 -= 2;
						if (aLongArray24[anInt9160] == aLongArray24[anInt9160 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 70) {
						anInt9160 -= 2;
						if (aLongArray24[anInt9160] < aLongArray24[anInt9160 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 71) {
						anInt9160 -= 2;
						if (aLongArray24[anInt9160] > aLongArray24[anInt9160 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 72) {
						anInt9160 -= 2;
						if (aLongArray24[anInt9160] <= aLongArray24[anInt9160 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 73) {
						anInt9160 -= 2;
						if (aLongArray24[anInt9160] >= aLongArray24[anInt9160 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 86) {
						if (anIntArray785[--anInt9165] == 1) {
							local5 += local11[local5];
						}
					} else if (local31 == 87) {
						if (anIntArray785[--anInt9165] == 0) {
							local5 += local11[local5];
						}
					} else if (local31 == 112) {
						anIntArray785[anInt9165++] = method8011(local11[local5]);
					} else if (local31 == 113) {
						anIntArray785[anInt9165++] = method8009(local11[local5]);
					} else if (local31 == 114) {
						aLongArray24[anInt9160++] = method8010(local11[local5]);
					} else if (local31 == 115) {
						aStringArray25[anInt9156++] = method8016(local11[local5]);
					}
				}
			}
		} catch (@Pc(1169) Exception local1169) {
			@Pc(1188) StringBuffer local1188;
			if (arg0.aString110 == null) {
				local1188 = new StringBuffer(30);
				local1188.append("CS2: ").append(arg0.aLong311).append(" ");
				for (local639 = anInt9167 - 1; local639 >= 0; local639--) {
					local1188.append("v: ").append(aClass87Array1[local639].aClass3_Sub11_Sub16_1.aLong311).append(" ");
				}
				local1188.append("op: ").append(local13);
				Static503.method7153(local1188.toString(), local1169);
			} else {
				Static381.method5445("Clientscript error in: " + arg0.aString110);
				local1188 = new StringBuffer(30);
				local1188.append("Clientscript error in: ").append(arg0.aString110).append("\n");
				for (local639 = anInt9167 - 1; local639 >= 0; local639--) {
					local1188.append("via: ").append(aClass87Array1[local639].aClass3_Sub11_Sub16_1.aString110).append("\n");
				}
				local1188.append("Op: ").append(local13).append("\n");
				@Pc(1228) String local1228 = local1169.getMessage();
				if (local1228 != null && local1228.length() > 0) {
					local1188.append("Message: ").append(local1228).append("\n");
				}
				Static503.method7153(local1188.toString(), local1169);
				Static238.method4024(local1188.toString());
			}
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
	private static void method8005(@OriginalArg(0) int arg0) {
		@Pc(3) Class260 local3 = Static383.method5492(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class260[] local13 = Static285.aClass260ArrayArray4[local9];
		if (local13 == null) {
			@Pc(19) Class260[] local19 = Static489.aClass260ArrayArray3[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static285.aClass260ArrayArray4[local9] = new Class260[local22];
			Static684.method5327(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static684.method5327(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)V")
	public static void method8006(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static27.method666(arg0)) {
			return;
		}
		@Pc(12) Class260[] local12 = Static489.aClass260ArrayArray3[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class260 local19 = local12[local14];
			if (local19.anObjectArray29 != null) {
				@Pc(26) Class3_Sub17 local26 = new Class3_Sub17();
				local26.aClass260_6 = local19;
				local26.anObjectArray2 = local19.anObjectArray29;
				method8008(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method8007(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static24.anInt545 == 0 && (Static371.aBoolean430 && !Static345.aBoolean411 || Static236.aBoolean326)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static601.aClass346_49.method8440(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static601.aClass346_49.method8440(0).length());
		} else if (local11.startsWith(Static601.aClass346_50.method8440(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static601.aClass346_50.method8440(0).length());
		} else if (local11.startsWith(Static601.aClass346_51.method8440(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static601.aClass346_51.method8440(0).length());
		} else if (local11.startsWith(Static601.aClass346_52.method8440(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static601.aClass346_52.method8440(0).length());
		} else if (local11.startsWith(Static601.aClass346_53.method8440(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static601.aClass346_53.method8440(0).length());
		} else if (local11.startsWith(Static601.aClass346_54.method8440(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static601.aClass346_54.method8440(0).length());
		} else if (local11.startsWith(Static601.aClass346_55.method8440(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static601.aClass346_55.method8440(0).length());
		} else if (local11.startsWith(Static601.aClass346_56.method8440(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static601.aClass346_56.method8440(0).length());
		} else if (local11.startsWith(Static601.aClass346_57.method8440(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static601.aClass346_57.method8440(0).length());
		} else if (local11.startsWith(Static601.aClass346_58.method8440(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static601.aClass346_58.method8440(0).length());
		} else if (local11.startsWith(Static601.aClass346_59.method8440(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static601.aClass346_59.method8440(0).length());
		} else if (local11.startsWith(Static601.aClass346_60.method8440(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static601.aClass346_60.method8440(0).length());
		} else if (Static609.anInt9834 != 0) {
			if (local11.startsWith(Static601.aClass346_49.method8440(Static609.anInt9834))) {
				local13 = 0;
				arg0 = arg0.substring(Static601.aClass346_49.method8440(Static609.anInt9834).length());
			} else if (local11.startsWith(Static601.aClass346_50.method8440(Static609.anInt9834))) {
				local13 = 1;
				arg0 = arg0.substring(Static601.aClass346_50.method8440(Static609.anInt9834).length());
			} else if (local11.startsWith(Static601.aClass346_51.method8440(Static609.anInt9834))) {
				local13 = 2;
				arg0 = arg0.substring(Static601.aClass346_51.method8440(Static609.anInt9834).length());
			} else if (local11.startsWith(Static601.aClass346_52.method8440(Static609.anInt9834))) {
				local13 = 3;
				arg0 = arg0.substring(Static601.aClass346_52.method8440(Static609.anInt9834).length());
			} else if (local11.startsWith(Static601.aClass346_53.method8440(Static609.anInt9834))) {
				local13 = 4;
				arg0 = arg0.substring(Static601.aClass346_53.method8440(Static609.anInt9834).length());
			} else if (local11.startsWith(Static601.aClass346_54.method8440(Static609.anInt9834))) {
				local13 = 5;
				arg0 = arg0.substring(Static601.aClass346_54.method8440(Static609.anInt9834).length());
			} else if (local11.startsWith(Static601.aClass346_55.method8440(Static609.anInt9834))) {
				local13 = 6;
				arg0 = arg0.substring(Static601.aClass346_55.method8440(Static609.anInt9834).length());
			} else if (local11.startsWith(Static601.aClass346_56.method8440(Static609.anInt9834))) {
				local13 = 7;
				arg0 = arg0.substring(Static601.aClass346_56.method8440(Static609.anInt9834).length());
			} else if (local11.startsWith(Static601.aClass346_57.method8440(Static609.anInt9834))) {
				local13 = 8;
				arg0 = arg0.substring(Static601.aClass346_57.method8440(Static609.anInt9834).length());
			} else if (local11.startsWith(Static601.aClass346_58.method8440(Static609.anInt9834))) {
				local13 = 9;
				arg0 = arg0.substring(Static601.aClass346_58.method8440(Static609.anInt9834).length());
			} else if (local11.startsWith(Static601.aClass346_59.method8440(Static609.anInt9834))) {
				local13 = 10;
				arg0 = arg0.substring(Static601.aClass346_59.method8440(Static609.anInt9834).length());
			} else if (local11.startsWith(Static601.aClass346_60.method8440(Static609.anInt9834))) {
				local13 = 11;
				arg0 = arg0.substring(Static601.aClass346_60.method8440(Static609.anInt9834).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Class346.lb.method8440(0))) {
			local451 = 1;
			arg0 = arg0.substring(Class346.lb.method8440(0).length());
		} else if (local11.startsWith(Static601.aClass346_61.method8440(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static601.aClass346_61.method8440(0).length());
		} else if (local11.startsWith(Static601.aClass346_62.method8440(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static601.aClass346_62.method8440(0).length());
		} else if (local11.startsWith(Static601.aClass346_63.method8440(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static601.aClass346_63.method8440(0).length());
		} else if (local11.startsWith(Static601.aClass346_64.method8440(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static601.aClass346_64.method8440(0).length());
		} else if (Static609.anInt9834 != 0) {
			if (local11.startsWith(Class346.lb.method8440(Static609.anInt9834))) {
				local451 = 1;
				arg0 = arg0.substring(Class346.lb.method8440(Static609.anInt9834).length());
			} else if (local11.startsWith(Static601.aClass346_61.method8440(Static609.anInt9834))) {
				local451 = 2;
				arg0 = arg0.substring(Static601.aClass346_61.method8440(Static609.anInt9834).length());
			} else if (local11.startsWith(Static601.aClass346_62.method8440(Static609.anInt9834))) {
				local451 = 3;
				arg0 = arg0.substring(Static601.aClass346_62.method8440(Static609.anInt9834).length());
			} else if (local11.startsWith(Static601.aClass346_63.method8440(Static609.anInt9834))) {
				local451 = 4;
				arg0 = arg0.substring(Static601.aClass346_63.method8440(Static609.anInt9834).length());
			} else if (local11.startsWith(Static601.aClass346_64.method8440(Static609.anInt9834))) {
				local451 = 5;
				arg0 = arg0.substring(Static601.aClass346_64.method8440(Static609.anInt9834).length());
			}
		}
		@Pc(641) Class3_Sub34 local641 = Static172.method3123(Static163.aClass375_1, Static339.aClass218_84);
		local641.aClass3_Sub25_Sub1_2.method8614(0);
		@Pc(650) int local650 = local641.aClass3_Sub25_Sub1_2.anInt9765;
		local641.aClass3_Sub25_Sub1_2.method8614(local13);
		local641.aClass3_Sub25_Sub1_2.method8614(local451);
		Static286.method4530(local641.aClass3_Sub25_Sub1_2, arg0);
		local641.aClass3_Sub25_Sub1_2.method8628(local641.aClass3_Sub25_Sub1_2.anInt9765 - local650);
		Static441.method6275(local641);
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!daa;I)V")
	private static void method8008(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray2;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class3_Sub11_Sub16 local12 = Static644.method8952(local8);
		if (local12 == null) {
			return;
		}
		anIntArray787 = new int[local12.anInt9265];
		@Pc(21) int local21 = 0;
		aStringArray26 = new String[local12.anInt9266];
		@Pc(27) int local27 = 0;
		aLongArray23 = new long[local12.anInt9262];
		@Pc(33) int local33 = 0;
		for (@Pc(35) int local35 = 1; local35 < local2.length; local35++) {
			if (local2[local35] instanceof Integer) {
				@Pc(47) int local47 = (Integer) local2[local35];
				if (local47 == -2147483647) {
					local47 = arg0.anInt1764;
				}
				if (local47 == -2147483646) {
					local47 = arg0.anInt1766;
				}
				if (local47 == -2147483645) {
					local47 = arg0.aClass260_6 == null ? -1 : arg0.aClass260_6.anInt6930;
				}
				if (local47 == -2147483644) {
					local47 = arg0.anInt1769;
				}
				if (local47 == -2147483643) {
					local47 = arg0.aClass260_6 == null ? -1 : arg0.aClass260_6.anInt6985;
				}
				if (local47 == -2147483642) {
					local47 = arg0.aClass260_5 == null ? -1 : arg0.aClass260_5.anInt6930;
				}
				if (local47 == -2147483641) {
					local47 = arg0.aClass260_5 == null ? -1 : arg0.aClass260_5.anInt6985;
				}
				if (local47 == -2147483640) {
					local47 = arg0.anInt1772;
				}
				if (local47 == -2147483639) {
					local47 = arg0.anInt1770;
				}
				anIntArray787[local21++] = local47;
			} else if (local2[local35] instanceof String) {
				@Pc(141) String local141 = (String) local2[local35];
				if (local141.equals("event_opbase")) {
					local141 = arg0.aString15;
				}
				aStringArray26[local27++] = local141;
			} else if (local2[local35] instanceof Long) {
				@Pc(165) long local165 = (Long) local2[local35];
				aLongArray23[local33++] = local165;
			}
		}
		anInt9170 = arg0.anInt1771;
		method8004(local12, arg1);
	}

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "(I)I")
	private static int method8009(@OriginalArg(0) int arg0) {
		@Pc(4) Class47 local4 = Static210.aClass199_2.method5028(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c113");
		}
		@Pc(26) Integer local26 = aClass185_6.method4638(local4.anInt1222, local4.anInt1224, Static55.aClass118_2.anInt3893 << 16 | local4.anInt1220);
		return local26 == null ? 0 : local26;
	}

	@OriginalMember(owner = "client!tba", name = "d", descriptor = "(I)J")
	private static long method8010(@OriginalArg(0) int arg0) {
		@Pc(9) Long local9 = aClass185_6.method4641(Static55.aClass118_2.anInt3893 << 16 | arg0);
		return local9 == null ? -1L : local9;
	}

	@OriginalMember(owner = "client!tba", name = "e", descriptor = "(I)I")
	private static int method8011(@OriginalArg(0) int arg0) {
		@Pc(4) Class47 local4 = Static210.aClass199_2.method5028(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c112");
		}
		@Pc(21) Integer local21 = aClass185_6.method4633(Static55.aClass118_2.anInt3893 << 16 | arg0);
		if (local21 == null) {
			return local4.aChar1 == 'i' || local4.aChar1 == '1' ? 0 : -1;
		} else {
			return local21;
		}
	}

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "(IZ)V")
	public static void method8012() {
	}

	@OriginalMember(owner = "client!tba", name = "c", descriptor = "(IZ)V")
	private static void method8013(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(52) Class3_Sub34 local52;
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
				anIntArray785[anInt9165++] = Static127.anInt2596;
				return;
			}
			if (arg0 == 5001) {
				anInt9165 -= 3;
				Static127.anInt2596 = anIntArray785[anInt9165];
				Static459.aClass314_3 = Static576.method8134(anIntArray785[anInt9165 + 1]);
				if (Static459.aClass314_3 == null) {
					Static459.aClass314_3 = Static63.aClass314_1;
				}
				Static101.anInt1853 = anIntArray785[anInt9165 + 2];
				local52 = Static172.method3123(Static163.aClass375_1, Static150.aClass218_82);
				local52.aClass3_Sub25_Sub1_2.method8614(Static127.anInt2596);
				local52.aClass3_Sub25_Sub1_2.method8614(Static459.aClass314_3.anInt8926);
				local52.aClass3_Sub25_Sub1_2.method8614(Static101.anInt1853);
				Static441.method6275(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt9156 -= 2;
				local83 = aStringArray25[anInt9156];
				local89 = aStringArray25[anInt9156 + 1];
				anInt9165 -= 2;
				local97 = anIntArray785[anInt9165];
				local103 = anIntArray785[anInt9165 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class3_Sub34 local125 = Static172.method3123(Static163.aClass375_1, Static118.aClass218_29);
				local125.aClass3_Sub25_Sub1_2.method8614(Static440.method6269(local83) + Static440.method6269(local89) + 2);
				local125.aClass3_Sub25_Sub1_2.method8583(local83);
				local125.aClass3_Sub25_Sub1_2.method8614(local97 - 1);
				local125.aClass3_Sub25_Sub1_2.method8614(local103);
				local125.aClass3_Sub25_Sub1_2.method8583(local89);
				Static441.method6275(local125);
				return;
			}
			@Pc(179) Class89 local179;
			if (arg0 == 5003) {
				local175 = anIntArray785[--anInt9165];
				local179 = Static10.method180(local175);
				local181 = "";
				if (local179 != null && local179.aString26 != null) {
					local181 = local179.aString26;
				}
				aStringArray25[anInt9156++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray785[--anInt9165];
				local179 = Static10.method180(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt2749;
				}
				anIntArray785[anInt9165++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static459.aClass314_3 == null) {
					anIntArray785[anInt9165++] = -1;
					return;
				}
				anIntArray785[anInt9165++] = Static459.aClass314_3.anInt8926;
				return;
			}
			@Pc(269) Class3_Sub34 local269;
			if (arg0 == 5006) {
				local175 = anIntArray785[--anInt9165];
				local269 = Static172.method3123(Static163.aClass375_1, Static237.aClass218_63);
				local269.aClass3_Sub25_Sub1_2.method8614(local175);
				Static441.method6275(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray25[--anInt9156];
				method8007(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt9156 -= 2;
				local83 = aStringArray25[anInt9156];
				local89 = aStringArray25[anInt9156 + 1];
				if (Static24.anInt545 != 0 || (!Static371.aBoolean430 || Static345.aBoolean411) && !Static236.aBoolean326) {
					@Pc(328) Class3_Sub34 local328 = Static172.method3123(Static163.aClass375_1, Static302.aClass218_74);
					local328.aClass3_Sub25_Sub1_2.method8614(0);
					local103 = local328.aClass3_Sub25_Sub1_2.anInt9765;
					local328.aClass3_Sub25_Sub1_2.method8583(local83);
					Static286.method4530(local328.aClass3_Sub25_Sub1_2, local89);
					local328.aClass3_Sub25_Sub1_2.method8628(local328.aClass3_Sub25_Sub1_2.anInt9765 - local103);
					Static441.method6275(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray785[--anInt9165];
				local179 = Static10.method180(local175);
				local181 = "";
				if (local179 != null && local179.aString23 != null) {
					local181 = local179.aString23;
				}
				aStringArray25[anInt9156++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray785[--anInt9165];
				local179 = Static10.method180(local175);
				local181 = "";
				if (local179 != null && local179.aString25 != null) {
					local181 = local179.aString25;
				}
				aStringArray25[anInt9156++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray785[--anInt9165];
				local179 = Static10.method180(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt2748;
				}
				anIntArray785[anInt9165++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2 == null || Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aString124 == null) {
					local83 = "";
				} else {
					local83 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.method9103();
				}
				aStringArray25[anInt9156++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray785[anInt9165++] = Static101.anInt1853;
				return;
			}
			if (arg0 == 5017) {
				anIntArray785[anInt9165++] = Static425.method6146();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray785[--anInt9165];
				local179 = Static10.method180(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt2746;
				}
				anIntArray785[anInt9165++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray785[--anInt9165];
				local179 = Static10.method180(local175);
				local181 = "";
				if (local179 != null && local179.aString27 != null) {
					local181 = local179.aString27;
				}
				aStringArray25[anInt9156++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2 == null || Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aString124 == null) {
					local83 = "";
				} else {
					local83 = Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.method9110();
				}
				aStringArray25[anInt9156++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray785[--anInt9165];
				local179 = Static10.method180(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt2745;
				}
				anIntArray785[anInt9165++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray785[--anInt9165];
				local179 = Static10.method180(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt2747;
				}
				anIntArray785[anInt9165++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray785[--anInt9165];
				local179 = Static10.method180(local175);
				local181 = "";
				if (local179 != null && local179.aString24 != null) {
					local181 = local179.aString24;
				}
				aStringArray25[anInt9156++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray785[--anInt9165];
				aStringArray25[anInt9156++] = Static557.aClass323_1.method7888(local175).aString29;
				return;
			}
			@Pc(736) Class3_Sub11_Sub6 local736;
			if (arg0 == 5051) {
				local175 = anIntArray785[--anInt9165];
				local736 = Static557.aClass323_1.method7888(local175);
				if (local736.anIntArray264 == null) {
					anIntArray785[anInt9165++] = 0;
					return;
				}
				anIntArray785[anInt9165++] = local736.anIntArray264.length;
				return;
			}
			if (arg0 == 5052) {
				anInt9165 -= 2;
				local175 = anIntArray785[anInt9165];
				local776 = anIntArray785[anInt9165 + 1];
				@Pc(781) Class3_Sub11_Sub6 local781 = Static557.aClass323_1.method7888(local175);
				local103 = local781.anIntArray264[local776];
				anIntArray785[anInt9165++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray785[--anInt9165];
				local736 = Static557.aClass323_1.method7888(local175);
				if (local736.anIntArray265 == null) {
					anIntArray785[anInt9165++] = 0;
					return;
				}
				anIntArray785[anInt9165++] = local736.anIntArray265.length;
				return;
			}
			if (arg0 == 5054) {
				anInt9165 -= 2;
				local175 = anIntArray785[anInt9165];
				local776 = anIntArray785[anInt9165 + 1];
				anIntArray785[anInt9165++] = Static557.aClass323_1.method7888(local175).anIntArray265[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray785[--anInt9165];
				aStringArray25[anInt9156++] = Static143.aClass77_1.method2082(local175).method8273();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray785[--anInt9165];
				@Pc(907) Class3_Sub11_Sub18 local907 = Static143.aClass77_1.method2082(local175);
				if (local907.anIntArray819 == null) {
					anIntArray785[anInt9165++] = 0;
					return;
				}
				anIntArray785[anInt9165++] = local907.anIntArray819.length;
				return;
			}
			if (arg0 == 5057) {
				anInt9165 -= 2;
				local175 = anIntArray785[anInt9165];
				local776 = anIntArray785[anInt9165 + 1];
				anIntArray785[anInt9165++] = Static143.aClass77_1.method2082(local175).anIntArray819[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass382_1 = new Class382();
				aClass382_1.anInt10544 = anIntArray785[--anInt9165];
				aClass382_1.aClass3_Sub11_Sub18_1 = Static143.aClass77_1.method2082(aClass382_1.anInt10544);
				aClass382_1.anIntArray930 = new int[aClass382_1.aClass3_Sub11_Sub18_1.method8271()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static172.method3123(Static163.aClass375_1, Static509.aClass218_127);
				local52.aClass3_Sub25_Sub1_2.method8614(0);
				local776 = local52.aClass3_Sub25_Sub1_2.anInt9765;
				local52.aClass3_Sub25_Sub1_2.method8614(0);
				local52.aClass3_Sub25_Sub1_2.method8649(aClass382_1.anInt10544);
				aClass382_1.aClass3_Sub11_Sub18_1.method8276(local52.aClass3_Sub25_Sub1_2, aClass382_1.anIntArray930);
				local52.aClass3_Sub25_Sub1_2.method8628(local52.aClass3_Sub25_Sub1_2.anInt9765 - local776);
				Static441.method6275(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray25[--anInt9156];
				local269 = Static172.method3123(Static163.aClass375_1, Static78.aClass218_48);
				local269.aClass3_Sub25_Sub1_2.method8614(0);
				local97 = local269.aClass3_Sub25_Sub1_2.anInt9765;
				local269.aClass3_Sub25_Sub1_2.method8583(local83);
				local269.aClass3_Sub25_Sub1_2.method8649(aClass382_1.anInt10544);
				aClass382_1.aClass3_Sub11_Sub18_1.method8276(local269.aClass3_Sub25_Sub1_2, aClass382_1.anIntArray930);
				local269.aClass3_Sub25_Sub1_2.method8628(local269.aClass3_Sub25_Sub1_2.anInt9765 - local97);
				Static441.method6275(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static172.method3123(Static163.aClass375_1, Static509.aClass218_127);
				local52.aClass3_Sub25_Sub1_2.method8614(0);
				local776 = local52.aClass3_Sub25_Sub1_2.anInt9765;
				local52.aClass3_Sub25_Sub1_2.method8614(1);
				local52.aClass3_Sub25_Sub1_2.method8649(aClass382_1.anInt10544);
				aClass382_1.aClass3_Sub11_Sub18_1.method8276(local52.aClass3_Sub25_Sub1_2, aClass382_1.anIntArray930);
				local52.aClass3_Sub25_Sub1_2.method8628(local52.aClass3_Sub25_Sub1_2.anInt9765 - local776);
				Static441.method6275(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt9165 -= 2;
				local175 = anIntArray785[anInt9165];
				local776 = anIntArray785[anInt9165 + 1];
				anIntArray785[anInt9165++] = Static557.aClass323_1.method7888(local175).aCharArray3[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt9165 -= 2;
				local175 = anIntArray785[anInt9165];
				local776 = anIntArray785[anInt9165 + 1];
				anIntArray785[anInt9165++] = Static557.aClass323_1.method7888(local175).aCharArray4[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt9165 -= 2;
				local175 = anIntArray785[anInt9165];
				local776 = anIntArray785[anInt9165 + 1];
				if (local776 == -1) {
					anIntArray785[anInt9165++] = -1;
					return;
				}
				anIntArray785[anInt9165++] = Static557.aClass323_1.method7888(local175).method2820((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt9165 -= 2;
				local175 = anIntArray785[anInt9165];
				local776 = anIntArray785[anInt9165 + 1];
				if (local776 == -1) {
					anIntArray785[anInt9165++] = -1;
					return;
				}
				anIntArray785[anInt9165++] = Static557.aClass323_1.method7888(local175).method2814((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray785[--anInt9165];
				anIntArray785[anInt9165++] = Static143.aClass77_1.method2082(local175).method8271();
				return;
			}
			if (arg0 == 5067) {
				anInt9165 -= 2;
				local175 = anIntArray785[anInt9165];
				local776 = anIntArray785[anInt9165 + 1];
				local97 = Static143.aClass77_1.method2082(local175).method8278(local776).anInt6086;
				anIntArray785[anInt9165++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt9165 -= 2;
				local175 = anIntArray785[anInt9165];
				local776 = anIntArray785[anInt9165 + 1];
				aClass382_1.anIntArray930[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt9165 -= 2;
				local175 = anIntArray785[anInt9165];
				local776 = anIntArray785[anInt9165 + 1];
				aClass382_1.anIntArray930[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt9165 -= 3;
				local175 = anIntArray785[anInt9165];
				local776 = anIntArray785[anInt9165 + 1];
				local97 = anIntArray785[anInt9165 + 2];
				@Pc(1448) Class3_Sub11_Sub18 local1448 = Static143.aClass77_1.method2082(local175);
				if (local1448.method8278(local776).anInt6086 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray785[anInt9165++] = local1448.method8275(local97, local776);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray25[--anInt9156];
				local1496 = anIntArray785[--anInt9165] == 1;
				Static616.method8706(local83, local1496);
				anIntArray785[anInt9165++] = Static478.anInt7943;
				return;
			}
			if (arg0 == 5072) {
				if (Static436.aShortArray104 != null && Static492.anInt8115 < Static478.anInt7943) {
					anIntArray785[anInt9165++] = Static436.aShortArray104[Static492.anInt8115++] & 0xFFFF;
					return;
				}
				anIntArray785[anInt9165++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static492.anInt8115 = 0;
				return;
			}
			if (arg0 == 5074) {
				local52 = Static172.method3123(Static163.aClass375_1, Static509.aClass218_127);
				local52.aClass3_Sub25_Sub1_2.method8614(0);
				local776 = local52.aClass3_Sub25_Sub1_2.anInt9765;
				local52.aClass3_Sub25_Sub1_2.method8614(2);
				local52.aClass3_Sub25_Sub1_2.method8649(aClass382_1.anInt10544);
				aClass382_1.aClass3_Sub11_Sub18_1.method8276(local52.aClass3_Sub25_Sub1_2, aClass382_1.anIntArray930);
				local52.aClass3_Sub25_Sub1_2.method8628(local52.aClass3_Sub25_Sub1_2.anInt9765 - local776);
				Static441.method6275(local52);
				return;
			}
			if (arg0 == 5075) {
				local52 = Static172.method3123(Static163.aClass375_1, Static509.aClass218_127);
				local52.aClass3_Sub25_Sub1_2.method8614(0);
				local776 = local52.aClass3_Sub25_Sub1_2.anInt9765;
				local52.aClass3_Sub25_Sub1_2.method8614(3);
				local52.aClass3_Sub25_Sub1_2.method8649(aClass382_1.anInt10544);
				aClass382_1.aClass3_Sub11_Sub18_1.method8276(local52.aClass3_Sub25_Sub1_2, aClass382_1.anIntArray930);
				local52.aClass3_Sub25_Sub1_2.method8628(local52.aClass3_Sub25_Sub1_2.anInt9765 - local776);
				Static441.method6275(local52);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static440.aClass19_1.method2352(86)) {
					anIntArray785[anInt9165++] = 1;
					return;
				}
				anIntArray785[anInt9165++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static440.aClass19_1.method2352(82)) {
					anIntArray785[anInt9165++] = 1;
					return;
				}
				anIntArray785[anInt9165++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static440.aClass19_1.method2352(81)) {
					anIntArray785[anInt9165++] = 1;
					return;
				}
				anIntArray785[anInt9165++] = 0;
				return;
			}
		} else {
			@Pc(2931) int local2931;
			@Pc(2205) boolean local2205;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static337.method5082(anIntArray785[--anInt9165]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray785[anInt9165++] = Static186.method3454();
					return;
				}
				if (arg0 == 5205) {
					Static499.method7144(anIntArray785[--anInt9165], -1, -1, false);
					return;
				}
				@Pc(1794) Class3_Sub11_Sub21 local1794;
				if (arg0 == 5206) {
					local175 = anIntArray785[--anInt9165];
					local1794 = Static317.method4939(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1794 == null) {
						anIntArray785[anInt9165++] = -1;
						return;
					}
					anIntArray785[anInt9165++] = local1794.anInt10862;
					return;
				}
				@Pc(1827) Class3_Sub11_Sub21 local1827;
				if (arg0 == 5207) {
					local1827 = Static317.method4948(anIntArray785[--anInt9165]);
					if (local1827 != null && local1827.aString129 != null) {
						aStringArray25[anInt9156++] = local1827.aString129;
						return;
					}
					aStringArray25[anInt9156++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray785[anInt9165++] = Static64.anInt1275;
					anIntArray785[anInt9165++] = Static412.anInt6583;
					return;
				}
				if (arg0 == 5209) {
					anIntArray785[anInt9165++] = Static361.anInt5827 + Static317.anInt5409;
					anIntArray785[anInt9165++] = Static90.anInt10121 + Static317.anInt5403;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray785[--anInt9165];
					local1794 = Static317.method4948(local175);
					if (local1794 == null) {
						anIntArray785[anInt9165++] = 0;
						anIntArray785[anInt9165++] = 0;
						return;
					}
					anIntArray785[anInt9165++] = local1794.anInt10861 >> 14 & 0x3FFF;
					anIntArray785[anInt9165++] = local1794.anInt10861 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray785[--anInt9165];
					local1794 = Static317.method4948(local175);
					if (local1794 == null) {
						anIntArray785[anInt9165++] = 0;
						anIntArray785[anInt9165++] = 0;
						return;
					}
					anIntArray785[anInt9165++] = local1794.anInt10864 - local1794.anInt10852;
					anIntArray785[anInt9165++] = local1794.anInt10867 - local1794.anInt10869;
					return;
				}
				@Pc(2017) Class3_Sub18 local2017;
				if (arg0 == 5212) {
					local2017 = Static310.method4732();
					if (local2017 == null) {
						anIntArray785[anInt9165++] = -1;
						anIntArray785[anInt9165++] = -1;
						return;
					}
					anIntArray785[anInt9165++] = local2017.anInt2277;
					local776 = local2017.anInt2279 << 28 | local2017.anInt2283 + Static317.anInt5409 << 14 | local2017.anInt2278 + Static317.anInt5403;
					anIntArray785[anInt9165++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local2017 = Static132.method2501();
					if (local2017 == null) {
						anIntArray785[anInt9165++] = -1;
						anIntArray785[anInt9165++] = -1;
						return;
					}
					anIntArray785[anInt9165++] = local2017.anInt2277;
					local776 = local2017.anInt2279 << 28 | local2017.anInt2283 + Static317.anInt5409 << 14 | local2017.anInt2278 + Static317.anInt5403;
					anIntArray785[anInt9165++] = local776;
					return;
				}
				@Pc(2165) boolean local2165;
				if (arg0 == 5214) {
					local175 = anIntArray785[--anInt9165];
					local1794 = Static182.method3241();
					if (local1794 != null) {
						local2165 = local1794.method9351(local175 & 0x3FFF, local175 >> 14 & 0x3FFF, anIntArray786, local175 >> 28 & 0x3);
						if (local2165) {
							Static226.method3856(anIntArray786[2], anIntArray786[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt9165 -= 2;
					local175 = anIntArray785[anInt9165];
					local776 = anIntArray785[anInt9165 + 1];
					@Pc(2203) Class74 local2203 = Static317.method4960(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2205 = false;
					for (@Pc(2210) Class3_Sub11_Sub21 local2210 = (Class3_Sub11_Sub21) local2203.method1842(); local2210 != null; local2210 = (Class3_Sub11_Sub21) local2203.method1844()) {
						if (local2210.anInt10862 == local776) {
							local2205 = true;
							break;
						}
					}
					if (local2205) {
						anIntArray785[anInt9165++] = 1;
						return;
					}
					anIntArray785[anInt9165++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray785[--anInt9165];
					local1794 = Static317.method4948(local175);
					if (local1794 == null) {
						anIntArray785[anInt9165++] = -1;
						return;
					}
					anIntArray785[anInt9165++] = local1794.anInt10870;
					return;
				}
				if (arg0 == 5220) {
					anIntArray785[anInt9165++] = Static677.anInt10890 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray785[--anInt9165];
					Static226.method3856(local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1827 = Static182.method3241();
					if (local1827 != null) {
						local1496 = local1827.method9359(Static90.anInt10121 + Static317.anInt5403, anIntArray786, Static361.anInt5827 + Static317.anInt5409);
						if (local1496) {
							anIntArray785[anInt9165++] = anIntArray786[1];
							anIntArray785[anInt9165++] = anIntArray786[2];
							return;
						}
						anIntArray785[anInt9165++] = -1;
						anIntArray785[anInt9165++] = -1;
						return;
					}
					anIntArray785[anInt9165++] = -1;
					anIntArray785[anInt9165++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt9165 -= 2;
					local175 = anIntArray785[anInt9165];
					local776 = anIntArray785[anInt9165 + 1];
					Static499.method7144(local175, local776 >> 14 & 0x3FFF, local776 & 0x3FFF, false);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray785[--anInt9165];
					local1794 = Static182.method3241();
					if (local1794 != null) {
						local2165 = local1794.method9351(local175 & 0x3FFF, local175 >> 14 & 0x3FFF, anIntArray786, local175 >> 28 & 0x3);
						if (local2165) {
							anIntArray785[anInt9165++] = anIntArray786[1];
							anIntArray785[anInt9165++] = anIntArray786[2];
							return;
						}
						anIntArray785[anInt9165++] = -1;
						anIntArray785[anInt9165++] = -1;
						return;
					}
					anIntArray785[anInt9165++] = -1;
					anIntArray785[anInt9165++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray785[--anInt9165];
					local1794 = Static182.method3241();
					if (local1794 != null) {
						local2165 = local1794.method9359(local175 & 0x3FFF, anIntArray786, local175 >> 14 & 0x3FFF);
						if (local2165) {
							anIntArray785[anInt9165++] = anIntArray786[1];
							anIntArray785[anInt9165++] = anIntArray786[2];
							return;
						}
						anIntArray785[anInt9165++] = -1;
						anIntArray785[anInt9165++] = -1;
						return;
					}
					anIntArray785[anInt9165++] = -1;
					anIntArray785[anInt9165++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static247.method4115(anIntArray785[--anInt9165]);
					return;
				}
				if (arg0 == 5227) {
					anInt9165 -= 2;
					local175 = anIntArray785[anInt9165];
					local776 = anIntArray785[anInt9165 + 1];
					Static499.method7144(local175, local776 >> 14 & 0x3FFF, local776 & 0x3FFF, true);
					return;
				}
				if (arg0 == 5228) {
					Static442.aBoolean513 = anIntArray785[--anInt9165] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray785[anInt9165++] = Static442.aBoolean513 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray785[--anInt9165];
					Static638.method8433(local175);
					return;
				}
				@Pc(2723) Class3 local2723;
				if (arg0 == 5231) {
					anInt9165 -= 2;
					local175 = anIntArray785[anInt9165];
					local1496 = anIntArray785[anInt9165 + 1] == 1;
					if (Static320.aClass83_42 != null) {
						local2723 = Static320.aClass83_42.method2368((long) local175);
						if (local2723 != null && !local1496) {
							local2723.method9380();
							return;
						}
						if (local2723 == null && local1496) {
							local2723 = new Class3();
							Static320.aClass83_42.method2377((long) local175, local2723);
						}
					}
					return;
				}
				@Pc(2765) Class3 local2765;
				if (arg0 == 5232) {
					local175 = anIntArray785[--anInt9165];
					if (Static320.aClass83_42 != null) {
						local2765 = Static320.aClass83_42.method2368((long) local175);
						anIntArray785[anInt9165++] = local2765 == null ? 0 : 1;
						return;
					}
					anIntArray785[anInt9165++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt9165 -= 2;
					local175 = anIntArray785[anInt9165];
					local1496 = anIntArray785[anInt9165 + 1] == 1;
					if (Static500.aClass83_37 != null) {
						local2723 = Static500.aClass83_37.method2368((long) local175);
						if (local2723 != null && !local1496) {
							local2723.method9380();
							return;
						}
						if (local2723 == null && local1496) {
							local2723 = new Class3();
							Static500.aClass83_37.method2377((long) local175, local2723);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray785[--anInt9165];
					if (Static500.aClass83_37 != null) {
						local2765 = Static500.aClass83_37.method2368((long) local175);
						anIntArray785[anInt9165++] = local2765 == null ? 0 : 1;
						return;
					}
					anIntArray785[anInt9165++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray785[anInt9165++] = Static317.aClass3_Sub11_Sub21_2 == null ? -1 : Static317.aClass3_Sub11_Sub21_2.anInt10862;
					return;
				}
				if (arg0 == 5236) {
					anInt9165 -= 2;
					local175 = anIntArray785[anInt9165];
					local776 = anIntArray785[anInt9165 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2931 = Static513.method7236(local97, local175, local103);
					if (local2931 < 0) {
						anIntArray785[anInt9165++] = -1;
						return;
					}
					anIntArray785[anInt9165++] = local2931;
					return;
				}
				if (arg0 == 5237) {
					Static355.method5242();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt9165 -= 2;
					local175 = anIntArray785[anInt9165];
					local776 = anIntArray785[anInt9165 + 1];
					Static235.method3936(local175, 3, local776, false);
					anIntArray785[anInt9165++] = Static442.aFrame3 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static442.aFrame3 != null) {
						Static235.method3936(-1, Static24.aClass3_Sub22_4.aClass6_Sub7_1.method3506(), -1, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(3017) Class270[] local3017 = Static49.method1150();
					anIntArray785[anInt9165++] = local3017.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray785[--anInt9165];
					@Pc(3041) Class270[] local3041 = Static49.method1150();
					anIntArray785[anInt9165++] = local3041[local175].anInt7595;
					anIntArray785[anInt9165++] = local3041[local175].anInt7594;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static115.anInt2379;
					local776 = Static69.anInt1324;
					local97 = -1;
					@Pc(3076) Class270[] local3076 = Static49.method1150();
					for (local2931 = 0; local2931 < local3076.length; local2931++) {
						@Pc(3083) Class270 local3083 = local3076[local2931];
						if (local3083.anInt7595 == local175 && local3083.anInt7594 == local776) {
							local97 = local2931;
							break;
						}
					}
					anIntArray785[anInt9165++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray785[anInt9165++] = Static673.method9353();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray785[--anInt9165];
					if (local175 >= 1 && local175 <= 2) {
						Static235.method3936(-1, local175, -1, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub7_1.method3506();
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray785[--anInt9165];
					if (local175 >= 1 && local175 <= 2) {
						Static24.aClass3_Sub22_4.method2840(local175, Static24.aClass3_Sub22_4.aClass6_Sub7_1);
						Static24.aClass3_Sub22_4.method2840(local175, Static24.aClass3_Sub22_4.aClass6_Sub7_2);
						Static441.method6272();
						return;
					}
					return;
				}
			} else {
				@Pc(3369) int local3369;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt9156 -= 2;
						local83 = aStringArray25[anInt9156];
						local89 = aStringArray25[anInt9156 + 1];
						local97 = anIntArray785[--anInt9165];
						@Pc(3231) Class3_Sub34 local3231 = Static172.method3123(Static163.aClass375_1, Static567.aClass218_90);
						local3231.aClass3_Sub25_Sub1_2.method8614(Static440.method6269(local83) + Static440.method6269(local89) + 1);
						local3231.aClass3_Sub25_Sub1_2.method8583(local83);
						local3231.aClass3_Sub25_Sub1_2.method8583(local89);
						local3231.aClass3_Sub25_Sub1_2.method8614(local97);
						Static441.method6275(local3231);
						return;
					}
					if (arg0 == 5401) {
						anInt9165 -= 2;
						Static372.aShortArray87[anIntArray785[anInt9165]] = (short) Static236.method3940(anIntArray785[anInt9165 + 1]);
						Static170.aClass370_1.method8905();
						Static170.aClass370_1.method8902();
						Static580.aClass36_2.method1059();
						Static540.method7765();
						return;
					}
					if (arg0 == 5405) {
						anInt9165 -= 2;
						local175 = anIntArray785[anInt9165];
						local776 = anIntArray785[anInt9165 + 1];
						if (local175 >= 0 && local175 < 2) {
							Static290.anIntArrayArrayArray16[local175] = new int[local776 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt9165 -= 7;
						local175 = anIntArray785[anInt9165];
						local776 = anIntArray785[anInt9165 + 1] << 1;
						local97 = anIntArray785[anInt9165 + 2];
						local103 = anIntArray785[anInt9165 + 3];
						local2931 = anIntArray785[anInt9165 + 4];
						local3369 = anIntArray785[anInt9165 + 5];
						@Pc(3375) int local3375 = anIntArray785[anInt9165 + 6];
						if (local175 >= 0 && local175 < 2 && Static290.anIntArrayArrayArray16[local175] != null && local776 >= 0 && local776 < Static290.anIntArrayArrayArray16[local175].length) {
							Static290.anIntArrayArrayArray16[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3375 };
							Static290.anIntArrayArrayArray16[local175][local776 + 1] = new int[] { (local2931 >> 14 & 0x3FFF) << 9, local3369 << 2, (local2931 & 0x3FFF) << 9 };
						}
						return;
					}
					if (arg0 == 5407) {
						local175 = Static290.anIntArrayArrayArray16[anIntArray785[--anInt9165]].length >> 1;
						anIntArray785[anInt9165++] = local175;
						return;
					}
					if (arg0 == 5411) {
						if (Static442.aFrame3 != null) {
							Static235.method3936(-1, Static24.aClass3_Sub22_4.aClass6_Sub7_1.method3506(), -1, false);
						}
						if (Static380.aFrame2 != null) {
							Static343.method5153();
							System.exit(0);
							return;
						}
						local83 = Static95.aString16 == null ? Static322.method4921() : Static95.aString16;
						Static235.method3934(Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() == 1, false, local83, Static247.aClass291_1);
						return;
					}
					if (arg0 == 5419) {
						local83 = "";
						if (Static179.aClass81_3 != null) {
							if (Static179.aClass81_3.anObject4 == null) {
								local83 = Static22.method2353(Static179.aClass81_3.anInt2533);
							} else {
								local83 = (String) Static179.aClass81_3.anObject4;
							}
						}
						aStringArray25[anInt9156++] = local83;
						return;
					}
					if (arg0 == 5420) {
						anIntArray785[anInt9165++] = Static247.aClass291_1.aBoolean619 ? 0 : 1;
						return;
					}
					if (arg0 == 5421) {
						if (Static442.aFrame3 != null) {
							Static235.method3936(-1, Static24.aClass3_Sub22_4.aClass6_Sub7_1.method3506(), -1, false);
						}
						local83 = aStringArray25[--anInt9156];
						local1496 = anIntArray785[--anInt9165] == 1;
						local181 = Static322.method4921() + local83;
						Static235.method3934(Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970() == 1, local1496, local181, Static247.aClass291_1);
						return;
					}
					if (arg0 == 5422) {
						anInt9156 -= 2;
						local83 = aStringArray25[anInt9156];
						local89 = aStringArray25[anInt9156 + 1];
						local97 = anIntArray785[--anInt9165];
						if (local83.length() > 0) {
							if (Static239.aStringArray13 == null) {
								Static239.aStringArray13 = new String[Static326.anIntArray486[Static55.aClass118_2.anInt3893]];
							}
							Static239.aStringArray13[local97] = local83;
						}
						if (local89.length() > 0) {
							if (Static191.aStringArray10 == null) {
								Static191.aStringArray10 = new String[Static326.anIntArray486[Static55.aClass118_2.anInt3893]];
							}
							Static191.aStringArray10[local97] = local89;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray25[--anInt9156]);
						return;
					}
					if (arg0 == 5424) {
						anInt9165 -= 11;
						Static20.anInt7796 = anIntArray785[anInt9165];
						Static670.anInt9432 = anIntArray785[anInt9165 + 1];
						Static534.anInt8816 = anIntArray785[anInt9165 + 2];
						Static14.anInt142 = anIntArray785[anInt9165 + 3];
						Static619.anInt10673 = anIntArray785[anInt9165 + 4];
						Static412.anInt6584 = anIntArray785[anInt9165 + 5];
						Static130.anInt2662 = anIntArray785[anInt9165 + 6];
						Static563.anInt9140 = anIntArray785[anInt9165 + 7];
						Static249.anInt4509 = anIntArray785[anInt9165 + 8];
						Static175.anInt3464 = anIntArray785[anInt9165 + 9];
						Static158.anInt926 = anIntArray785[anInt9165 + 10];
						Static369.aClass15_97.method526(Static619.anInt10673);
						Static369.aClass15_97.method526(Static412.anInt6584);
						Static369.aClass15_97.method526(Static130.anInt2662);
						Static369.aClass15_97.method526(Static563.anInt9140);
						Static369.aClass15_97.method526(Static249.anInt4509);
						Static288.aClass33_10 = null;
						Static57.aClass33_2 = null;
						Static356.aClass33_27 = null;
						Static631.aClass33_34 = null;
						Static311.aClass33_12 = null;
						Static445.aClass33_28 = null;
						Static311.aClass33_13 = null;
						Static262.aClass33_9 = null;
						Static609.aBoolean752 = true;
						return;
					}
					if (arg0 == 5425) {
						Static75.method1423();
						Static609.aBoolean752 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt9165 -= 2;
						Static508.anInt8219 = anIntArray785[anInt9165];
						Static209.anInt4029 = anIntArray785[anInt9165 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt9165 -= 2;
						Static116.anInt2402 = anIntArray785[anInt9165 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt9165 -= 2;
						local175 = anIntArray785[anInt9165];
						local776 = anIntArray785[anInt9165 + 1];
						anIntArray785[anInt9165++] = Static471.method6828(local776, local175) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static371.method5395(aStringArray25[--anInt9156], false, false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static686.method8109(Static124.anApplet1, "accountcreated");
							return;
						} catch (@Pc(3917) Throwable local3917) {
							return;
						}
					}
					if (arg0 == 5431) {
						try {
							Static686.method8109(Static124.anApplet1, "accountcreatestarted");
							return;
						} catch (@Pc(3928) Throwable local3928) {
							return;
						}
					}
					if (arg0 == 5432) {
						local83 = "";
						if (Static611.aClipboard1 != null) {
							@Pc(3940) Transferable local3940 = Static611.aClipboard1.getContents((Object) null);
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
						aStringArray25[anInt9156++] = local83;
						return;
					}
					if (arg0 == 5433) {
						Static105.anInt2127 = anIntArray785[--anInt9165];
						return;
					}
					if (arg0 == 5435) {
						anIntArray785[anInt9165++] = Static663.aBoolean803 ? 1 : 0;
						return;
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt9165 -= 4;
						local175 = anIntArray785[anInt9165];
						local776 = anIntArray785[anInt9165 + 1];
						local97 = anIntArray785[anInt9165 + 2];
						local103 = anIntArray785[anInt9165 + 3];
						Static431.method6194((local175 >> 14 & 0x3FFF) - Static287.anInt4910, false, (local175 & 0x3FFF) - Static72.anInt1361, local97, local776 << 2, local103);
						return;
					}
					if (arg0 == 5501) {
						anInt9165 -= 4;
						local175 = anIntArray785[anInt9165];
						local776 = anIntArray785[anInt9165 + 1];
						local97 = anIntArray785[anInt9165 + 2];
						local103 = anIntArray785[anInt9165 + 3];
						Static385.method5502(local103, (local175 >> 14 & 0x3FFF) - Static287.anInt4910, (local175 & 0x3FFF) - Static72.anInt1361, local97, local776 << 2);
						return;
					}
					if (arg0 == 5502) {
						anInt9165 -= 6;
						local175 = anIntArray785[anInt9165];
						if (local175 >= 2) {
							throw new RuntimeException();
						}
						Static266.anInt4722 = local175;
						local776 = anIntArray785[anInt9165 + 1];
						if (local776 + 1 >= Static290.anIntArrayArrayArray16[Static266.anInt4722].length >> 1) {
							throw new RuntimeException();
						}
						Static510.anInt4841 = local776;
						Static246.anInt4482 = 0;
						Static638.anInt9655 = anIntArray785[anInt9165 + 2];
						Static639.anInt10150 = anIntArray785[anInt9165 + 3];
						local97 = anIntArray785[anInt9165 + 4];
						if (local97 >= 2) {
							throw new RuntimeException();
						}
						Static134.anInt2727 = local97;
						local103 = anIntArray785[anInt9165 + 5];
						if (local103 + 1 >= Static290.anIntArrayArrayArray16[Static134.anInt2727].length >> 1) {
							throw new RuntimeException();
						}
						Static247.anInt4487 = local103;
						Static428.anInt6834 = 3;
						Static153.anInt3036 = -1;
						Static410.anInt6542 = -1;
						return;
					}
					if (arg0 == 5503) {
						Static139.method2541();
						return;
					}
					if (arg0 == 5504) {
						anInt9165 -= 2;
						Static119.method2268(anIntArray785[anInt9165], anIntArray785[anInt9165 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray785[anInt9165++] = (int) Static667.aFloat212 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray785[anInt9165++] = (int) Static618.aFloat207 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static647.method8985();
						return;
					}
					if (arg0 == 5508) {
						Static353.method5231();
						return;
					}
					if (arg0 == 5509) {
						Static390.method9301();
						return;
					}
					if (arg0 == 5510) {
						Static39.method1028();
						return;
					}
					if (arg0 == 5511) {
						local175 = anIntArray785[--anInt9165];
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static287.anInt4910;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static158.anInt927) {
							local776 = Static158.anInt927;
						}
						local97 -= Static72.anInt1361;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static515.anInt8292) {
							local97 = Static515.anInt8292;
						}
						Static294.anInt6316 = (local776 << 9) + 256;
						Static96.anInt1798 = (local97 << 9) + 256;
						Static428.anInt6834 = 4;
						Static153.anInt3036 = -1;
						Static410.anInt6542 = -1;
						return;
					}
					if (arg0 == 5512) {
						Static98.method1750();
						return;
					}
					if (arg0 == 5514) {
						Static675.anInt10879 = anIntArray785[--anInt9165];
						return;
					}
					if (arg0 == 5516) {
						anIntArray785[anInt9165++] = Static675.anInt10879;
						return;
					}
					if (arg0 == 5517) {
						local175 = anIntArray785[--anInt9165];
						if (local175 == -1) {
							local776 = local175 >> 14 & 0x3FFF;
							local97 = local175 & 0x3FFF;
							local776 -= Static287.anInt4910;
							if (local776 < 0) {
								local776 = 0;
							} else if (local776 >= Static158.anInt927) {
								local776 = Static158.anInt927;
							}
							local97 -= Static72.anInt1361;
							if (local97 < 0) {
								local97 = 0;
							} else if (local97 >= Static515.anInt8292) {
								local97 = Static515.anInt8292;
							}
							Static410.anInt6542 = (local776 << 9) + 256;
							Static153.anInt3036 = (local97 << 9) + 256;
							return;
						}
						Static410.anInt6542 = -1;
						Static153.anInt3036 = -1;
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt9156 -= 2;
						local83 = aStringArray25[anInt9156];
						local89 = aStringArray25[anInt9156 + 1];
						local97 = anIntArray785[--anInt9165];
						Static641.method8916(local89, local97, local83);
						return;
					}
					if (arg0 == 5601) {
						Static249.method4130();
						return;
					}
					if (arg0 == 5602) {
						if (!Static537.method1805()) {
							Static234.method3925();
						}
						return;
					}
					if (arg0 == 5604) {
						anInt9156--;
						if (Static406.anInt6454 != 3) {
							return;
						}
						if (!Static537.method1805() && Static433.anInt8266 == 0) {
							Static670.method8252(aStringArray25[anInt9156]);
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt9156 -= 2;
						anInt9165 -= 2;
						if (Static406.anInt6454 != 3) {
							return;
						}
						if (!Static537.method1805() && Static433.anInt8266 == 0) {
							Static415.method5921(anIntArray785[anInt9165], anIntArray785[anInt9165 + 1] == 1, aStringArray25[anInt9156 + 1], aStringArray25[anInt9156]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static433.anInt8266 == 0) {
							Static421.anInt6742 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray785[anInt9165++] = Static498.anInt10141;
						return;
					}
					if (arg0 == 5608) {
						anIntArray785[anInt9165++] = Static215.anInt4111;
						return;
					}
					if (arg0 == 5609) {
						anIntArray785[anInt9165++] = Static421.anInt6742;
						return;
					}
					if (arg0 == 5611) {
						anIntArray785[anInt9165++] = Static425.anInt6802;
						return;
					}
					if (arg0 == 5612) {
						local175 = anIntArray785[--anInt9165];
						Static624.method7816(local175);
						return;
					}
					if (arg0 == 5613) {
						anIntArray785[anInt9165++] = Static498.anInt10141;
						return;
					}
					if (arg0 == 5615) {
						anInt9156 -= 2;
						local83 = aStringArray25[anInt9156];
						local89 = aStringArray25[anInt9156 + 1];
						Static495.method7115(local89, local83);
						return;
					}
					if (arg0 == 5616) {
						Static67.method1352(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray785[anInt9165++] = Static466.anInt7667;
						return;
					}
					if (arg0 == 5618) {
						anInt9165--;
						return;
					}
					if (arg0 == 5619) {
						anInt9165--;
						return;
					}
					if (arg0 == 5620) {
						anIntArray785[anInt9165++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt9156 -= 2;
						anInt9165 -= 2;
						return;
					}
					if (arg0 == 5622) {
						return;
					}
					if (arg0 == 5623) {
						if (Static365.aByteArray63 != null) {
							anIntArray785[anInt9165++] = 1;
							return;
						}
						anIntArray785[anInt9165++] = 0;
						return;
					}
					if (arg0 == 5624) {
						anIntArray785[anInt9165++] = (int) (Static306.aLong161 >> 32);
						anIntArray785[anInt9165++] = (int) (Static306.aLong161 & 0xFFFFFFFFFFFFFFFFL);
						return;
					}
					if (arg0 == 5625) {
						anIntArray785[anInt9165++] = Static624.aBoolean697 ? 1 : 0;
						return;
					}
					if (arg0 == 5626) {
						Static624.aBoolean697 = true;
						Static453.method6644();
						return;
					}
					if (arg0 == 5628) {
						anIntArray785[anInt9165++] = Static537.method1805() ? 1 : 0;
						return;
					}
					if (arg0 == 5630) {
						Static530.method7675();
						return;
					}
					if (arg0 == 5631) {
						anInt9165 -= 2;
						local175 = anIntArray785[anInt9165];
						local776 = anIntArray785[anInt9165 + 1];
						Static6.method145(local776, local175);
						return;
					}
					if (arg0 == 5632) {
						local175 = anIntArray785[--anInt9165];
						Static425.method6147(local175);
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local175 = anIntArray785[--anInt9165];
						Static24.aClass3_Sub22_4.method2840(local175, Static24.aClass3_Sub22_4.aClass6_Sub1_1);
						Static200.method3621();
						Static441.method6272();
						Static275.aBoolean358 = false;
						return;
					}
					@Pc(4901) boolean local4901;
					if (arg0 == 6002) {
						local4901 = anIntArray785[--anInt9165] == 1;
						Static24.aClass3_Sub22_4.method2840(local4901 ? 1 : 0, Static24.aClass3_Sub22_4.aClass6_Sub22_1);
						Static24.aClass3_Sub22_4.method2840(local4901 ? 1 : 0, Static24.aClass3_Sub22_4.lb);
						Static200.method3621();
						Static342.method5130();
						Static441.method6272();
						Static275.aBoolean358 = false;
						return;
					}
					if (arg0 == 6003) {
						local4901 = anIntArray785[--anInt9165] == 1;
						Static24.aClass3_Sub22_4.method2840(local4901 ? 2 : 1, Static24.aClass3_Sub22_4.aClass6_Sub25_1);
						Static24.aClass3_Sub22_4.method2840(local4901 ? 2 : 1, Static24.aClass3_Sub22_4.aClass6_Sub25_2);
						Static342.method5130();
						Static441.method6272();
						Static275.aBoolean358 = false;
						return;
					}
					if (arg0 == 6005) {
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165] == 1 ? 1 : 0, Static24.aClass3_Sub22_4.aClass6_Sub4_1);
						Static200.method3621();
						Static441.method6272();
						Static275.aBoolean358 = false;
						return;
					}
					if (arg0 == 6007) {
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165], Static24.aClass3_Sub22_4.aClass6_Sub23_1);
						Static441.method6272();
						Static275.aBoolean358 = false;
						return;
					}
					if (arg0 == 6008) {
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165] == 1 ? 1 : 0, Static24.aClass3_Sub22_4.aClass6_Sub13_1);
						Static441.method6272();
						Static275.aBoolean358 = false;
						return;
					}
					if (arg0 == 6010) {
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165] == 1 ? 1 : 0, Static24.aClass3_Sub22_4.aClass6_Sub19_1);
						Static441.method6272();
						Static275.aBoolean358 = false;
						return;
					}
					if (arg0 == 6011) {
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165], Static24.aClass3_Sub22_4.aClass6_Sub3_1);
						Static200.method3621();
						Static441.method6272();
						Static275.aBoolean358 = false;
						return;
					}
					if (arg0 == 6012) {
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165] == 1 ? 1 : 0, Static24.aClass3_Sub22_4.aClass6_Sub12_1);
						Static313.method4793();
						Static225.method3837();
						Static441.method6272();
						Static275.aBoolean358 = false;
						return;
					}
					if (arg0 == 6014) {
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165] == 1 ? 2 : 0, Static24.aClass3_Sub22_4.aClass6_Sub29_1);
						Static200.method3621();
						Static441.method6272();
						Static275.aBoolean358 = false;
						return;
					}
					if (arg0 == 6015) {
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165] == 1 ? 1 : 0, Static24.aClass3_Sub22_4.aClass6_Sub5_1);
						Static200.method3621();
						Static441.method6272();
						Static275.aBoolean358 = false;
						return;
					}
					if (arg0 == 6016) {
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165], Static24.aClass3_Sub22_4.aClass6_Sub17_1);
						Static382.method5480(false, Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970());
						Static441.method6272();
						return;
					}
					if (arg0 == 6017) {
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165] == 1 ? 1 : 0, Static24.aClass3_Sub22_4.aClass6_Sub18_1);
						Static198.method9277();
						Static441.method6272();
						Static275.aBoolean358 = false;
						return;
					}
					if (arg0 == 6018) {
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165], Static24.aClass3_Sub22_4.aClass6_Sub28_1);
						Static441.method6272();
						Static275.aBoolean358 = false;
						return;
					}
					if (arg0 == 6019) {
						local175 = anIntArray785[--anInt9165];
						local776 = Static24.aClass3_Sub22_4.aClass6_Sub28_3.method8690();
						if (local175 != local776) {
							if (Static409.method5810(Static406.anInt6454)) {
								if (local776 == 0 && Static214.anInt4080 != -1) {
									Static81.method1579(Static214.anInt4080, local175, Static604.aClass15_150);
									Static476.method6888();
									Static278.aBoolean253 = false;
								} else if (local175 == 0) {
									Static165.method8794();
									Static278.aBoolean253 = false;
								} else {
									Static156.method2849(local175);
								}
							}
							Static24.aClass3_Sub22_4.method2840(local175, Static24.aClass3_Sub22_4.aClass6_Sub28_3);
							Static441.method6272();
							Static275.aBoolean358 = false;
						}
						return;
					}
					if (arg0 == 6020) {
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165], Static24.aClass3_Sub22_4.aClass6_Sub28_2);
						Static441.method6272();
						Static275.aBoolean358 = false;
						return;
					}
					if (arg0 == 6021) {
						local175 = Static24.aClass3_Sub22_4.aClass6_Sub25_1.method8119();
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165] == 1 ? 0 : local175, Static24.aClass3_Sub22_4.aClass6_Sub25_2);
						Static342.method5130();
						return;
					}
					if (arg0 == 6023) {
						local175 = anIntArray785[--anInt9165];
						Static24.aClass3_Sub22_4.method2840(local175, Static24.aClass3_Sub22_4.aClass6_Sub26_1);
						Static441.method6272();
						Static275.aBoolean358 = false;
						return;
					}
					if (arg0 == 6024) {
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165], Static24.aClass3_Sub22_4.aClass6_Sub17_2);
						Static441.method6272();
						return;
					}
					if (arg0 == 6025) {
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165], Static24.aClass3_Sub22_4.aClass6_Sub8_1);
						Static441.method6272();
						Static275.aBoolean358 = false;
						return;
					}
					if (arg0 == 6027) {
						local175 = anIntArray785[--anInt9165];
						if (local175 < 0 || local175 > 1) {
							local175 = 0;
						}
						Static561.method7968(local175 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165] == 0 ? 0 : 1, Static24.aClass3_Sub22_4.aClass6_Sub20_1);
						Static441.method6272();
						return;
					}
					if (arg0 == 6029) {
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165], Static24.aClass3_Sub22_4.aClass6_Sub23_1);
						Static441.method6272();
						return;
					}
					if (arg0 == 6030) {
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165] == 0 ? 0 : 1, Static24.aClass3_Sub22_4.aClass6_Sub9_1);
						Static441.method6272();
						Static200.method3621();
						return;
					}
					if (arg0 == 6031) {
						local175 = anIntArray785[--anInt9165];
						if (local175 < 0 || local175 > 5) {
							local175 = 2;
						}
						Static382.method5480(false, local175);
						return;
					}
					if (arg0 == 6032) {
						anInt9165 -= 2;
						local175 = anIntArray785[anInt9165];
						local1496 = anIntArray785[anInt9165 + 1] == 1;
						Static24.aClass3_Sub22_4.method2840(local175, Static24.aClass3_Sub22_4.aClass6_Sub21_2);
						if (!local1496) {
							Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub27_1);
						}
						Static441.method6272();
						Static275.aBoolean358 = false;
						return;
					}
					if (arg0 == 6033) {
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165], Static24.aClass3_Sub22_4.aClass6_Sub14_1);
						Static441.method6272();
						return;
					}
					if (arg0 == 6034) {
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165] == 1 ? 1 : 0, Static24.aClass3_Sub22_4.aClass6_Sub15_1);
						Static441.method6272();
						Static313.method4793();
						Static275.aBoolean358 = false;
						return;
					}
					if (arg0 == 6035) {
						local175 = Static24.aClass3_Sub22_4.aClass6_Sub22_1.method7116();
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165] == 1 ? 1 : local175, Static24.aClass3_Sub22_4.lb);
						Static200.method3621();
						Static342.method5130();
						return;
					}
					if (arg0 == 6036) {
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165], Static24.aClass3_Sub22_4.aClass6_Sub24_1);
						Static441.method6272();
						Static156.aBoolean235 = true;
						return;
					}
					if (arg0 == 6037) {
						Static24.aClass3_Sub22_4.method2840(anIntArray785[--anInt9165], Static24.aClass3_Sub22_4.aClass6_Sub28_5);
						Static441.method6272();
						Static275.aBoolean358 = false;
						return;
					}
					if (arg0 == 6038) {
						local175 = anIntArray785[--anInt9165];
						local776 = Static24.aClass3_Sub22_4.aClass6_Sub28_4.method8690();
						if (local175 != local776 && Static214.anInt4080 == Static112.anInt5572) {
							if (!Static409.method5810(Static406.anInt6454)) {
								if (local776 == 0) {
									Static81.method1579(Static214.anInt4080, local175, Static604.aClass15_150);
									Static476.method6888();
									Static278.aBoolean253 = false;
								} else if (local175 == 0) {
									Static165.method8794();
									Static278.aBoolean253 = false;
								} else {
									Static156.method2849(local175);
								}
							}
							Static24.aClass3_Sub22_4.method2840(local175, Static24.aClass3_Sub22_4.aClass6_Sub28_4);
							Static441.method6272();
							Static275.aBoolean358 = false;
						}
						return;
					}
					if (arg0 == 6039) {
						local175 = anIntArray785[--anInt9165];
						if (local175 > 255 || local175 < 0) {
							local175 = 0;
						}
						if (local175 != Static24.aClass3_Sub22_4.aClass6_Sub16_1.method4632()) {
							Static24.aClass3_Sub22_4.method2840(local175, Static24.aClass3_Sub22_4.aClass6_Sub16_1);
							Static441.method6272();
							Static275.aBoolean358 = false;
						}
						return;
					}
					if (arg0 == 6040) {
						local175 = anIntArray785[--anInt9165];
						if (local175 != Static24.aClass3_Sub22_4.aClass6_Sub2_1.method601()) {
							Static24.aClass3_Sub22_4.method2840(local175, Static24.aClass3_Sub22_4.aClass6_Sub2_1);
							Static441.method6272();
							Static275.aBoolean358 = false;
							Static643.method8930();
						}
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub1_1.method146();
						return;
					}
					if (arg0 == 6102) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub22_1.method7116() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub25_1.method8119() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub4_1.method2638() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub23_1.method7637();
						return;
					}
					if (arg0 == 6108) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub13_1.method4368() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub19_1.method6779() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub3_1.method1374();
						return;
					}
					if (arg0 == 6112) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub12_1.method4157() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub29_1.method8967() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub5_1.method2797() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub17_1.method5285();
						return;
					}
					if (arg0 == 6117) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub18_1.method6575() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub28_1.method8690();
						return;
					}
					if (arg0 == 6119) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub28_3.method8690();
						return;
					}
					if (arg0 == 6120) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub28_2.method8690();
						return;
					}
					if (arg0 == 6123) {
						anIntArray785[anInt9165++] = Static505.method7173();
						return;
					}
					if (arg0 == 6124) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub17_2.method5285();
						return;
					}
					if (arg0 == 6125) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub8_1.method3663();
						return;
					}
					if (arg0 == 6127) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub10_1.method4135() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub20_1.method6799() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub23_1.method7637();
						return;
					}
					if (arg0 == 6130) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub9_1.method3802() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970();
						return;
					}
					if (arg0 == 6132) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub21_2.method6970();
						return;
					}
					if (arg0 == 6133) {
						anIntArray785[anInt9165++] = Static247.aClass291_1.aBoolean619 && !Static247.aClass291_1.aBoolean618 ? 1 : 0;
						return;
					}
					if (arg0 == 6135) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub14_1.method4383();
						return;
					}
					if (arg0 == 6136) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub15_1.method4448() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6138) {
						anIntArray785[anInt9165++] = Static77.method1435(200, Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970());
						return;
					}
					if (arg0 == 6139) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub24_1.method7991();
						return;
					}
					if (arg0 == 6142) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub28_5.method8690();
						return;
					}
					if (arg0 == 6143) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub28_4.method8690();
						return;
					}
					if (arg0 == 6144) {
						anIntArray785[anInt9165++] = Static103.aBoolean150 ? 1 : 0;
						return;
					}
					if (arg0 == 6145) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub16_1.method4632();
						return;
					}
					if (arg0 == 6146) {
						anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub2_1.method601();
						return;
					}
					if (arg0 == 6147) {
						anIntArray785[anInt9165++] = Static241.aClass3_Sub10_1.anInt1059 < 512 || Static103.aBoolean150 || Static311.aBoolean377 ? 1 : 0;
						return;
					}
					if (arg0 == 6148) {
						anIntArray785[anInt9165++] = Static657.aBoolean798 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt9165 -= 2;
						Static403.aShort71 = (short) anIntArray785[anInt9165];
						if (Static403.aShort71 <= 0) {
							Static403.aShort71 = 256;
						}
						Static387.aShort56 = (short) anIntArray785[anInt9165 + 1];
						if (Static387.aShort56 <= 0) {
							Static387.aShort56 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt9165 -= 2;
						Static39.aShort9 = (short) anIntArray785[anInt9165];
						if (Static39.aShort9 <= 0) {
							Static39.aShort9 = 256;
						}
						Static215.aShort43 = (short) anIntArray785[anInt9165 + 1];
						if (Static215.aShort43 <= 0) {
							Static215.aShort43 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt9165 -= 4;
						Static569.aShort97 = (short) anIntArray785[anInt9165];
						if (Static569.aShort97 <= 0) {
							Static569.aShort97 = 1;
						}
						Static492.aShort86 = (short) anIntArray785[anInt9165 + 1];
						if (Static492.aShort86 <= 0) {
							Static492.aShort86 = 32767;
						} else if (Static492.aShort86 < Static569.aShort97) {
							Static492.aShort86 = Static569.aShort97;
						}
						Static546.aShort96 = (short) anIntArray785[anInt9165 + 2];
						if (Static546.aShort96 <= 0) {
							Static546.aShort96 = 1;
						}
						Static265.aShort45 = (short) anIntArray785[anInt9165 + 3];
						if (Static265.aShort45 <= 0) {
							Static265.aShort45 = 32767;
							return;
						}
						if (Static265.aShort45 < Static546.aShort96) {
							Static265.aShort45 = Static546.aShort96;
						}
						return;
					}
					if (arg0 == 6203) {
						Static210.method7896(Static242.aClass260_16.anInt6963, Static242.aClass260_16.anInt6971, 0, 0, false);
						anIntArray785[anInt9165++] = Static235.anInt4338;
						anIntArray785[anInt9165++] = Static509.anInt8221;
						return;
					}
					if (arg0 == 6204) {
						anIntArray785[anInt9165++] = Static39.aShort9;
						anIntArray785[anInt9165++] = Static215.aShort43;
						return;
					}
					if (arg0 == 6205) {
						anIntArray785[anInt9165++] = Static403.aShort71;
						anIntArray785[anInt9165++] = Static387.aShort56;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray785[anInt9165++] = (int) (Static524.method7320() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray785[anInt9165++] = (int) (Static524.method7320() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt9165 -= 3;
						local175 = anIntArray785[anInt9165];
						local776 = anIntArray785[anInt9165 + 1];
						local97 = anIntArray785[anInt9165 + 2];
						@Pc(6710) long local6710 = Static87.method1653(local776, local175, local97);
						local3369 = Static172.method3126(local6710);
						if (local97 < 1970) {
							local3369--;
						}
						anIntArray785[anInt9165++] = local3369;
						return;
					}
					if (arg0 == 6303) {
						anIntArray785[anInt9165++] = Static172.method3127(Static524.method7320());
						return;
					}
					if (arg0 == 6304) {
						local175 = anIntArray785[--anInt9165];
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
						anIntArray785[anInt9165++] = local1496 ? 1 : 0;
						return;
					}
					if (arg0 == 6305) {
						local175 = anIntArray785[--anInt9165];
						@Pc(6828) int[] local6828 = Static559.method7936(local175);
						Static684.method5326(local6828, 0, anIntArray785, anInt9165, 3);
						anInt9165 += 3;
						return;
					}
					if (arg0 == 6306) {
						local175 = anIntArray785[--anInt9165];
						anIntArray785[anInt9165++] = (int) (Static162.method2939(local175) / 60000L);
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray785[anInt9165++] = Static101.method1779() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray785[anInt9165++] = Static64.method1326() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static406.anInt6454 == 7 && !Static537.method1805() && Static433.anInt8266 == 0) {
							if (Static283.aBoolean360) {
								anIntArray785[anInt9165++] = 0;
								return;
							}
							if (Static113.aLong65 > Static524.method7320() - 1000L) {
								anIntArray785[anInt9165++] = 1;
								return;
							}
							Static283.aBoolean360 = true;
							local52 = Static172.method3123(Static163.aClass375_1, Static359.aClass218_87);
							local52.aClass3_Sub25_Sub1_2.method8588(Static135.anInt6416);
							Static441.method6275(local52);
							anIntArray785[anInt9165++] = 0;
							return;
						}
						anIntArray785[anInt9165++] = 1;
						return;
					}
					@Pc(7014) Class181 local7014;
					@Pc(6981) Class98_Sub1 local6981;
					if (arg0 == 6501) {
						local6981 = Static40.method1044();
						if (local6981 != null) {
							anIntArray785[anInt9165++] = local6981.anInt5514;
							anIntArray785[anInt9165++] = local6981.anInt5501;
							aStringArray25[anInt9156++] = local6981.aString55;
							local7014 = local6981.method5044();
							anIntArray785[anInt9165++] = local7014.anInt4973;
							aStringArray25[anInt9156++] = local7014.aString47;
							anIntArray785[anInt9165++] = local6981.anInt5505;
							anIntArray785[anInt9165++] = local6981.anInt5513;
							aStringArray25[anInt9156++] = local6981.aString56;
							return;
						}
						anIntArray785[anInt9165++] = -1;
						anIntArray785[anInt9165++] = 0;
						aStringArray25[anInt9156++] = "";
						anIntArray785[anInt9165++] = 0;
						aStringArray25[anInt9156++] = "";
						anIntArray785[anInt9165++] = 0;
						anIntArray785[anInt9165++] = 0;
						aStringArray25[anInt9156++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6981 = Static60.method1286();
						if (local6981 != null) {
							anIntArray785[anInt9165++] = local6981.anInt5514;
							anIntArray785[anInt9165++] = local6981.anInt5501;
							aStringArray25[anInt9156++] = local6981.aString55;
							local7014 = local6981.method5044();
							anIntArray785[anInt9165++] = local7014.anInt4973;
							aStringArray25[anInt9156++] = local7014.aString47;
							anIntArray785[anInt9165++] = local6981.anInt5505;
							anIntArray785[anInt9165++] = local6981.anInt5513;
							aStringArray25[anInt9156++] = local6981.aString56;
							return;
						}
						anIntArray785[anInt9165++] = -1;
						anIntArray785[anInt9165++] = 0;
						aStringArray25[anInt9156++] = "";
						anIntArray785[anInt9165++] = 0;
						aStringArray25[anInt9156++] = "";
						anIntArray785[anInt9165++] = 0;
						anIntArray785[anInt9165++] = 0;
						aStringArray25[anInt9156++] = "";
						return;
					}
					if (arg0 == 6503) {
						local175 = anIntArray785[--anInt9165];
						local89 = aStringArray25[--anInt9156];
						if (Static406.anInt6454 == 7 && !Static537.method1805() && Static433.anInt8266 == 0) {
							anIntArray785[anInt9165++] = Static111.method2091(local89, local175) ? 1 : 0;
							return;
						}
						anIntArray785[anInt9165++] = 0;
						return;
					}
					if (arg0 == 6506) {
						local175 = anIntArray785[--anInt9165];
						@Pc(7342) Class98_Sub1 local7342 = Static217.method3760(local175);
						if (local7342 != null) {
							anIntArray785[anInt9165++] = local7342.anInt5501;
							aStringArray25[anInt9156++] = local7342.aString55;
							@Pc(7366) Class181 local7366 = local7342.method5044();
							anIntArray785[anInt9165++] = local7366.anInt4973;
							aStringArray25[anInt9156++] = local7366.aString47;
							anIntArray785[anInt9165++] = local7342.anInt5505;
							anIntArray785[anInt9165++] = local7342.anInt5513;
							aStringArray25[anInt9156++] = local7342.aString56;
							return;
						}
						anIntArray785[anInt9165++] = -1;
						aStringArray25[anInt9156++] = "";
						anIntArray785[anInt9165++] = 0;
						aStringArray25[anInt9156++] = "";
						anIntArray785[anInt9165++] = 0;
						anIntArray785[anInt9165++] = 0;
						aStringArray25[anInt9156++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt9165 -= 4;
						local175 = anIntArray785[anInt9165];
						local1496 = anIntArray785[anInt9165 + 1] == 1;
						local97 = anIntArray785[anInt9165 + 2];
						local2205 = anIntArray785[anInt9165 + 3] == 1;
						Static414.method5907(local97, local1496, local2205, local175);
						return;
					}
					if (arg0 == 6508) {
						Static200.method3619();
						return;
					}
					if (arg0 == 6509) {
						if (Static406.anInt6454 != 7) {
							return;
						}
						Static461.aBoolean564 = anIntArray785[--anInt9165] == 1;
						return;
					}
					if (arg0 == 6510) {
						anIntArray785[anInt9165++] = Static593.anInt9532;
						return;
					}
				} else if (arg0 >= 6700) {
					if (arg0 < 6800 && Static14.aClass299_1 == Static668.aClass299_4) {
						if (arg0 == 6700) {
							local175 = Static455.aClass83_31.method2378();
							if (Static110.anInt2265 != -1) {
								local175++;
							}
							anIntArray785[anInt9165++] = local175;
							return;
						}
						if (arg0 == 6701) {
							local175 = anIntArray785[--anInt9165];
							if (Static110.anInt2265 != -1) {
								if (local175 == 0) {
									anIntArray785[anInt9165++] = Static110.anInt2265;
									return;
								}
								local175--;
							}
							@Pc(7614) Class3_Sub46 local7614 = (Class3_Sub46) Static455.aClass83_31.method2375();
							while (local175-- > 0) {
								local7614 = (Class3_Sub46) Static455.aClass83_31.method2370();
							}
							anIntArray785[anInt9165++] = local7614.anInt7855;
							return;
						}
						if (arg0 == 6702) {
							local175 = anIntArray785[--anInt9165];
							if (Static489.aClass260ArrayArray3[local175] == null) {
								aStringArray25[anInt9156++] = "";
								return;
							}
							local89 = Static489.aClass260ArrayArray3[local175][0].aString73;
							if (local89 == null) {
								aStringArray25[anInt9156++] = "";
								return;
							}
							aStringArray25[anInt9156++] = local89.substring(0, local89.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local175 = anIntArray785[--anInt9165];
							if (Static489.aClass260ArrayArray3[local175] == null) {
								anIntArray785[anInt9165++] = 0;
								return;
							}
							anIntArray785[anInt9165++] = Static489.aClass260ArrayArray3[local175].length;
							return;
						}
						if (arg0 == 6704) {
							anInt9165 -= 2;
							local175 = anIntArray785[anInt9165];
							local776 = anIntArray785[anInt9165 + 1];
							if (Static489.aClass260ArrayArray3[local175] == null) {
								aStringArray25[anInt9156++] = "";
								return;
							}
							local181 = Static489.aClass260ArrayArray3[local175][local776].aString73;
							if (local181 == null) {
								aStringArray25[anInt9156++] = "";
								return;
							}
							aStringArray25[anInt9156++] = local181;
							return;
						}
						if (arg0 == 6705) {
							anInt9165 -= 2;
							local175 = anIntArray785[anInt9165];
							local776 = anIntArray785[anInt9165 + 1];
							if (Static489.aClass260ArrayArray3[local175] == null) {
								anIntArray785[anInt9165++] = 0;
								return;
							}
							anIntArray785[anInt9165++] = Static489.aClass260ArrayArray3[local175][local776].anInt6992;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							anInt9165 -= 3;
							local175 = anIntArray785[anInt9165];
							local776 = anIntArray785[anInt9165 + 1];
							local97 = anIntArray785[anInt9165 + 2];
							Static498.method8887(local97, local175 << 16 | local776, "", 1);
							return;
						}
						if (arg0 == 6708) {
							anInt9165 -= 3;
							local175 = anIntArray785[anInt9165];
							local776 = anIntArray785[anInt9165 + 1];
							local97 = anIntArray785[anInt9165 + 2];
							Static498.method8887(local97, local175 << 16 | local776, "", 2);
							return;
						}
						if (arg0 == 6709) {
							anInt9165 -= 3;
							local175 = anIntArray785[anInt9165];
							local776 = anIntArray785[anInt9165 + 1];
							local97 = anIntArray785[anInt9165 + 2];
							Static498.method8887(local97, local175 << 16 | local776, "", 3);
							return;
						}
						if (arg0 == 6710) {
							anInt9165 -= 3;
							local175 = anIntArray785[anInt9165];
							local776 = anIntArray785[anInt9165 + 1];
							local97 = anIntArray785[anInt9165 + 2];
							Static498.method8887(local97, local175 << 16 | local776, "", 4);
							return;
						}
						if (arg0 == 6711) {
							anInt9165 -= 3;
							local175 = anIntArray785[anInt9165];
							local776 = anIntArray785[anInt9165 + 1];
							local97 = anIntArray785[anInt9165 + 2];
							Static498.method8887(local97, local175 << 16 | local776, "", 5);
							return;
						}
						if (arg0 == 6712) {
							anInt9165 -= 3;
							local175 = anIntArray785[anInt9165];
							local776 = anIntArray785[anInt9165 + 1];
							local97 = anIntArray785[anInt9165 + 2];
							Static498.method8887(local97, local175 << 16 | local776, "", 6);
							return;
						}
						if (arg0 == 6713) {
							anInt9165 -= 3;
							local175 = anIntArray785[anInt9165];
							local776 = anIntArray785[anInt9165 + 1];
							local97 = anIntArray785[anInt9165 + 2];
							Static498.method8887(local97, local175 << 16 | local776, "", 7);
							return;
						}
						if (arg0 == 6714) {
							anInt9165 -= 3;
							local175 = anIntArray785[anInt9165];
							local776 = anIntArray785[anInt9165 + 1];
							local97 = anIntArray785[anInt9165 + 2];
							Static498.method8887(local97, local175 << 16 | local776, "", 8);
							return;
						}
						if (arg0 == 6715) {
							anInt9165 -= 3;
							local175 = anIntArray785[anInt9165];
							local776 = anIntArray785[anInt9165 + 1];
							local97 = anIntArray785[anInt9165 + 2];
							Static498.method8887(local97, local175 << 16 | local776, "", 9);
							return;
						}
						if (arg0 == 6716) {
							anInt9165 -= 3;
							local175 = anIntArray785[anInt9165];
							local776 = anIntArray785[anInt9165 + 1];
							local97 = anIntArray785[anInt9165 + 2];
							Static498.method8887(local97, local175 << 16 | local776, "", 10);
							return;
						}
						if (arg0 == 6717) {
							anInt9165 -= 3;
							local175 = anIntArray785[anInt9165];
							local776 = anIntArray785[anInt9165 + 1];
							local97 = anIntArray785[anInt9165 + 2];
							@Pc(8202) Class260 local8202 = Static245.method4101(local175 << 16 | local776, local97);
							Static632.method8816();
							@Pc(8207) Class3_Sub48 local8207 = Static79.method1526(local8202);
							Static231.method3910(local8207.anInt8085, local8202, local8207.method7067());
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(8235) Class308 local8235;
						if (arg0 == 6800) {
							local175 = anIntArray785[--anInt9165];
							local8235 = Static84.aClass27_1.method693(local175);
							if (local8235.aString103 == null) {
								aStringArray25[anInt9156++] = "";
								return;
							}
							aStringArray25[anInt9156++] = local8235.aString103;
							return;
						}
						if (arg0 == 6801) {
							local175 = anIntArray785[--anInt9165];
							local8235 = Static84.aClass27_1.method693(local175);
							anIntArray785[anInt9165++] = local8235.anInt8801;
							return;
						}
						if (arg0 == 6802) {
							local175 = anIntArray785[--anInt9165];
							local8235 = Static84.aClass27_1.method693(local175);
							anIntArray785[anInt9165++] = local8235.anInt8805;
							return;
						}
						if (arg0 == 6803) {
							local175 = anIntArray785[--anInt9165];
							local8235 = Static84.aClass27_1.method693(local175);
							anIntArray785[anInt9165++] = local8235.anInt8782;
							return;
						}
						if (arg0 == 6804) {
							anInt9165 -= 2;
							local175 = anIntArray785[anInt9165];
							local776 = anIntArray785[anInt9165 + 1];
							@Pc(8357) Class322 local8357 = Static467.aClass367_1.method8812(local776);
							if (local8357.method7885()) {
								aStringArray25[anInt9156++] = Static84.aClass27_1.method693(local175).method7685(local776, local8357.aString106);
								return;
							}
							anIntArray785[anInt9165++] = Static84.aClass27_1.method693(local175).method7688(local8357.anInt9033, local776);
							return;
						}
					} else if (arg0 < 7000) {
						if (arg0 == 6900) {
							anIntArray785[anInt9165++] = Static371.aBoolean430 && !Static345.aBoolean411 ? 1 : 0;
							return;
						}
						if (arg0 == 6901) {
							anIntArray785[anInt9165++] = (int) (Static256.aLong122 / 60000L);
							anIntArray785[anInt9165++] = (int) ((Static256.aLong122 - Static524.method7320() - Static267.aLong145) / 60000L);
							anIntArray785[anInt9165++] = Static662.aBoolean802 ? 1 : 0;
							return;
						}
						if (arg0 == 6902) {
							anIntArray785[anInt9165++] = Static668.anInt10670;
							return;
						}
						if (arg0 == 6903) {
							anIntArray785[anInt9165++] = Static327.anInt5438;
							return;
						}
						if (arg0 == 6904) {
							anIntArray785[anInt9165++] = Static162.anInt3191;
							return;
						}
						if (arg0 == 6905) {
							local83 = "";
							if (Static179.aClass81_3 != null) {
								if (Static179.aClass81_3.anObject4 == null) {
									local83 = Static22.method2353(Static179.aClass81_3.anInt2533);
								} else {
									local83 = (String) Static179.aClass81_3.anObject4;
								}
							}
							aStringArray25[anInt9156++] = local83;
							return;
						}
						if (arg0 == 6906) {
							anIntArray785[anInt9165++] = Static654.anInt10519;
							return;
						}
						if (arg0 == 6907) {
							anIntArray785[anInt9165++] = Static479.anInt7955;
							return;
						}
						if (arg0 == 6908) {
							anIntArray785[anInt9165++] = Static589.anInt9469;
							return;
						}
						if (arg0 == 6909) {
							anIntArray785[anInt9165++] = Static7.aBoolean7 ? 1 : 0;
							return;
						}
						if (arg0 == 6910) {
							anIntArray785[anInt9165++] = Static513.anInt8245;
							return;
						}
						if (arg0 == 6911) {
							anIntArray785[anInt9165++] = Static389.anInt6128;
							return;
						}
						if (arg0 == 6912) {
							anIntArray785[anInt9165++] = Static445.anInt7302;
							return;
						}
						if (arg0 == 6913) {
							anIntArray785[anInt9165++] = Static369.anInt5957;
							return;
						}
					} else if (arg0 < 7100) {
						if (arg0 == 7000) {
							local175 = Static602.method8444();
							anIntArray785[anInt9165++] = Static402.anInt6358 = Static24.aClass3_Sub22_4.aClass6_Sub21_1.method6970();
							anIntArray785[anInt9165++] = local175;
							Static200.method3621();
							Static441.method6272();
							Static275.aBoolean358 = false;
							return;
						}
						if (arg0 == 7001) {
							Static129.method2438();
							Static200.method3621();
							Static441.method6272();
							Static275.aBoolean358 = false;
							return;
						}
						if (arg0 == 7002) {
							Static111.method2092();
							Static200.method3621();
							Static441.method6272();
							Static275.aBoolean358 = false;
							return;
						}
						if (arg0 == 7003) {
							Static575.method8118();
							Static200.method3621();
							Static441.method6272();
							Static275.aBoolean358 = false;
							return;
						}
						if (arg0 == 7004) {
							Static62.method1305();
							Static200.method3621();
							Static441.method6272();
							Static275.aBoolean358 = false;
							return;
						}
						if (arg0 == 7005) {
							Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub27_1);
							Static441.method6272();
							Static275.aBoolean358 = false;
							return;
						}
						if (arg0 == 7006) {
							if (Static402.anInt6358 == 2) {
								Static284.aBoolean361 = true;
								return;
							}
							if (Static402.anInt6358 == 1) {
								Static498.aBoolean768 = true;
								return;
							}
							if (Static402.anInt6358 == 3) {
								Static654.aBoolean797 = true;
							}
							return;
						}
						if (arg0 == 7007) {
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub27_1.method8665();
							return;
						}
					} else if (arg0 < 7200) {
						if (arg0 == 7100) {
							anInt9165 -= 2;
							local175 = anIntArray785[anInt9165];
							local776 = anIntArray785[anInt9165 + 1];
							if (local175 != -1) {
								if (local776 > 255) {
									local776 = 255;
								} else if (local776 < 0) {
									local776 = 0;
								}
								Static476.method6890(false, local175, local776);
							}
							return;
						}
						if (arg0 == 7101) {
							local175 = anIntArray785[--anInt9165];
							if (local175 != -1) {
								Static674.method9364(local175);
							}
							return;
						}
						if (arg0 == 7102) {
							local175 = anIntArray785[--anInt9165];
							if (local175 != -1) {
								Static54.method1198(local175);
							}
							return;
						}
						if (arg0 == 7103) {
							anIntArray785[anInt9165++] = Static530.method7674("jagtheora") ? 1 : 0;
							return;
						}
					} else if (arg0 < 7300) {
						if (arg0 == 7201) {
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub4_1.method2635() ? 1 : 0;
							return;
						}
						if (arg0 == 7202) {
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub19_1.method6780() ? 1 : 0;
							return;
						}
						if (arg0 == 7203) {
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub3_1.method1372() ? 1 : 0;
							return;
						}
						if (arg0 == 7204) {
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub29_1.method8969() ? 1 : 0;
							return;
						}
						if (arg0 == 7205) {
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub17_2.method5287() && Static674.aClass13_22.method8471() ? 1 : 0;
							return;
						}
						if (arg0 == 7206) {
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub26_1.method8572() ? 1 : 0;
							return;
						}
						if (arg0 == 7207) {
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub8_1.method3666() ? 1 : 0;
							return;
						}
						if (arg0 == 7208) {
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub10_1.method4129() && Static674.aClass13_22.method8466() ? 1 : 0;
							return;
						}
						if (arg0 == 7209) {
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub9_1.method3794() ? 1 : 0;
							return;
						}
						if (arg0 == 7210) {
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub15_1.method4449() ? 1 : 0;
							return;
						}
						if (arg0 == 7211) {
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub24_1.method7992() ? 1 : 0;
							return;
						}
						if (arg0 == 7212) {
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub5_1.method2798() ? 1 : 0;
							return;
						}
						if (arg0 == 7213) {
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub2_1.method604() ? 1 : 0;
							return;
						}
						if (arg0 == 7214) {
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub21_2.method6967() ? 1 : 0;
							return;
						}
					} else if (arg0 < 7400) {
						if (arg0 == 7301) {
							local175 = anIntArray785[--anInt9165];
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub4_1.method8960(local175);
							return;
						}
						if (arg0 == 7302) {
							local175 = anIntArray785[--anInt9165];
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub19_1.method8960(local175);
							return;
						}
						if (arg0 == 7303) {
							local175 = anIntArray785[--anInt9165];
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub3_1.method8960(local175);
							return;
						}
						if (arg0 == 7304) {
							local175 = anIntArray785[--anInt9165];
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub29_1.method8960(local175);
							return;
						}
						if (arg0 == 7305) {
							local175 = anIntArray785[--anInt9165];
							if (!Static674.aClass13_22.method8471()) {
								anIntArray785[anInt9165++] = 3;
								return;
							}
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub17_2.method8960(local175);
							return;
						}
						if (arg0 == 7306) {
							local175 = anIntArray785[--anInt9165];
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub26_1.method8960(local175);
							return;
						}
						if (arg0 == 7307) {
							local175 = anIntArray785[--anInt9165];
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub8_1.method8960(local175);
							return;
						}
						if (arg0 == 7308) {
							local175 = anIntArray785[--anInt9165];
							if (!Static674.aClass13_22.method8466()) {
								anIntArray785[anInt9165++] = 3;
								return;
							}
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub10_1.method8960(local175);
							return;
						}
						if (arg0 == 7309) {
							local175 = anIntArray785[--anInt9165];
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub9_1.method8960(local175);
							return;
						}
						if (arg0 == 7310) {
							local175 = anIntArray785[--anInt9165];
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub15_1.method8960(local175);
							return;
						}
						if (arg0 == 7311) {
							local175 = anIntArray785[--anInt9165];
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub24_1.method8960(local175);
							return;
						}
						if (arg0 == 7312) {
							local175 = anIntArray785[--anInt9165];
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub5_1.method8960(local175);
							return;
						}
						if (arg0 == 7313) {
							local175 = anIntArray785[--anInt9165];
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub2_1.method8960(local175);
							return;
						}
						if (arg0 == 7314) {
							local175 = anIntArray785[--anInt9165];
							anIntArray785[anInt9165++] = Static24.aClass3_Sub22_4.aClass6_Sub21_2.method8960(local175);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!tba", name = "b", descriptor = "()V")
	public static void method8014() {
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!daa;)V")
	public static void method8015(@OriginalArg(0) Class3_Sub17 arg0) {
		method8008(arg0, 200000);
	}

	@OriginalMember(owner = "client!tba", name = "f", descriptor = "(I)Ljava/lang/String;")
	private static String method8016(@OriginalArg(0) int arg0) {
		@Pc(9) String local9 = aClass185_6.method4648(Static55.aClass118_2.anInt3893 << 16 | arg0);
		return local9 == null ? "" : local9;
	}

	@OriginalMember(owner = "client!tba", name = "g", descriptor = "(I)V")
	private static void method8017(@OriginalArg(0) int arg0) {
		@Pc(3) Class260 local3 = Static383.method5492(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class260[] local13 = Static285.aClass260ArrayArray4[local9];
		if (local13 == null) {
			@Pc(19) Class260[] local19 = Static489.aClass260ArrayArray3[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static285.aClass260ArrayArray4[local9] = new Class260[local22];
			Static684.method5327(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static684.method5327(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!tba", name = "a", descriptor = "(Lclient!ml;II)V")
	public static void method8018(@OriginalArg(0) Class223 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub11_Sub16 local5 = Static319.method4873(arg2, arg1, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray787 = new int[local5.anInt9265];
		aStringArray26 = new String[local5.anInt9266];
		if (local5.aClass223_14 == Static600.aClass223_15 || local5.aClass223_14 == Static282.aClass223_9 || local5.aClass223_14 == Static446.aClass223_11) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static601.aClass260_20 != null) {
				local30 = Static601.aClass260_20.anInt6942;
				local32 = Static601.aClass260_20.anInt6950;
			}
			anIntArray787[0] = Static22.aClass16_2.method5885() - local30;
			anIntArray787[1] = Static22.aClass16_2.method5887() - local32;
		}
		method8004(local5, 200000);
	}
}
