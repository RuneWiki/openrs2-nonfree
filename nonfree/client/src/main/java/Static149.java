import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "Lclient!lk;")
	private static Class203 aClass203_53;

	@OriginalMember(owner = "client!fm", name = "h", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray16;

	@OriginalMember(owner = "client!fm", name = "i", descriptor = "Lclient!lk;")
	private static Class203 aClass203_54;

	@OriginalMember(owner = "client!fm", name = "w", descriptor = "[I")
	private static int[] anIntArray260;

	@OriginalMember(owner = "client!fm", name = "x", descriptor = "Lclient!wo;")
	private static Class364 aClass364_1;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
	private static int anInt3101 = 0;

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray15 = new String[1000];

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "[I")
	private static final int[] anIntArray259 = new int[1000];

	@OriginalMember(owner = "client!fm", name = "k", descriptor = "[Lclient!ch;")
	private static final Class47[] aClass47Array1 = new Class47[50];

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
	private static int anInt3106 = 0;

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!fm", name = "n", descriptor = "[[I")
	private static final int[][] anIntArrayArray23 = new int[5][5000];

	@OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
	private static int anInt3110 = 0;

	@OriginalMember(owner = "client!fm", name = "y", descriptor = "[I")
	private static final int[] anIntArray261 = new int[5];

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "[I")
	private static final int[] anIntArray262 = new int[3];

	@OriginalMember(owner = "client!fm", name = "A", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray17 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!fm", name = "B", descriptor = "Lclient!aj;")
	public static final Class10 aClass10_14 = new Class10(4);

	@OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
	private static int anInt3115 = 0;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!ba;I)V")
	private static void method2769(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) int arg1) {
		anInt3106 = 0;
		anInt3110 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray66;
		@Pc(11) int[] local11 = arg0.anIntArray67;
		@Pc(13) byte local13 = -1;
		anInt3101 = 0;
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
						method2770(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method2774(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray259[anInt3106++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray259[anInt3106++] = Static427.aClass56_1.anIntArray125[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static427.aClass56_1.method1732(anIntArray259[--anInt3106], local54);
					} else if (local31 == 3) {
						aStringArray15[anInt3110++] = arg0.aStringArray1[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt3106 -= 2;
						if (anIntArray259[anInt3106] != anIntArray259[anInt3106 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt3106 -= 2;
						if (anIntArray259[anInt3106] == anIntArray259[anInt3106 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt3106 -= 2;
						if (anIntArray259[anInt3106] < anIntArray259[anInt3106 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt3106 -= 2;
						if (anIntArray259[anInt3106] > anIntArray259[anInt3106 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt3101 == 0) {
							return;
						}
						@Pc(216) Class47 local216 = aClass47Array1[--anInt3101];
						arg0 = local216.aClass3_Sub3_Sub4_1;
						local8 = arg0.anIntArray66;
						local11 = arg0.anIntArray67;
						local5 = local216.anInt1779;
						anIntArray260 = local216.anIntArray114;
						aStringArray16 = local216.aStringArray9;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray259[anInt3106++] = Static427.aClass56_1.method1725(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static427.aClass56_1.method1729(local54, anIntArray259[--anInt3106]);
					} else if (local31 == 31) {
						anInt3106 -= 2;
						if (anIntArray259[anInt3106] <= anIntArray259[anInt3106 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt3106 -= 2;
						if (anIntArray259[anInt3106] >= anIntArray259[anInt3106 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray259[anInt3106++] = anIntArray260[local11[local5]];
					} else if (local31 == 34) {
						anIntArray260[local11[local5]] = anIntArray259[--anInt3106];
					} else if (local31 == 35) {
						aStringArray15[anInt3110++] = aStringArray16[local11[local5]];
					} else if (local31 == 36) {
						aStringArray16[local11[local5]] = aStringArray15[--anInt3110];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt3110 -= local54;
						@Pc(400) String local400 = Static241.method4003(local54, aStringArray15, anInt3110);
						aStringArray15[anInt3110++] = local400;
					} else if (local31 == 38) {
						anInt3106--;
					} else if (local31 == 39) {
						anInt3110--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class3_Sub3_Sub4 local436 = Static207.method3704(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt681];
							@Pc(450) String[] local450 = new String[local436.anInt679];
							for (local452 = 0; local452 < local436.anInt678; local452++) {
								local446[local452] = anIntArray259[anInt3106 + local452 - local436.anInt678];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt680; local471++) {
								local450[local471] = aStringArray15[anInt3110 + local471 - local436.anInt680];
							}
							anInt3106 -= local436.anInt678;
							anInt3110 -= local436.anInt680;
							@Pc(502) Class47 local502 = new Class47();
							local502.aClass3_Sub3_Sub4_1 = arg0;
							local502.anInt1779 = local5;
							local502.anIntArray114 = anIntArray260;
							local502.aStringArray9 = aStringArray16;
							if (anInt3101 >= aClass47Array1.length) {
								throw new RuntimeException();
							}
							aClass47Array1[anInt3101++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray66;
							local11 = local436.anIntArray67;
							local5 = -1;
							anIntArray260 = local446;
							aStringArray16 = local450;
						} else if (local31 == 42) {
							anIntArray259[anInt3106++] = Static99.anIntArray166[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static99.anIntArray166[local54] = anIntArray259[--anInt3106];
							Static572.method6785(local54);
							Static590.aBoolean729 |= Static376.aBooleanArray27[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray259[--anInt3106];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray261[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray23[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray259[--anInt3106];
							if (local603 < 0 || local603 >= anIntArray261[local54]) {
								throw new RuntimeException();
							}
							anIntArray259[anInt3106++] = anIntArrayArray23[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt3106 -= 2;
							local603 = anIntArray259[anInt3106];
							if (local603 < 0 || local603 >= anIntArray261[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray23[local54][local603] = anIntArray259[anInt3106 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static230.aStringArray30[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray15[anInt3110++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static230.aStringArray30[local54] = aStringArray15[--anInt3110];
							Static358.method7745(local54);
						} else if (local31 == 51) {
							@Pc(774) Class310 local774 = arg0.aClass310Array1[local11[local5]];
							@Pc(787) Class3_Sub4 local787 = (Class3_Sub4) local774.method6601((long) anIntArray259[--anInt3106]);
							if (local787 != null) {
								local5 += local787.anInt109;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString15 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong273).append(" ");
				for (local603 = anInt3101 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass47Array1[local603].aClass3_Sub3_Sub4_1.aLong273).append(" ");
				}
				local856.append("op: ").append(local13);
				Static379.method5607(local856.toString(), local837);
			} else {
				Static118.method2471("Clientscript error in: " + arg0.aString15);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString15).append("\n");
				for (local603 = anInt3101 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass47Array1[local603].aClass3_Sub3_Sub4_1.aString15).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static379.method5607(local856.toString(), local837);
				Static369.method5492(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZ)V")
	private static void method2770(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class203 local137;
		@Pc(158) Class203 local158;
		@Pc(35) Class203 local35;
		@Pc(56) int local56;
		@Pc(13) int local13;
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(210) Class203 local210;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt3106 -= 3;
				local13 = anIntArray259[anInt3106];
				local19 = anIntArray259[anInt3106 + 1];
				local25 = anIntArray259[anInt3106 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static414.method5954(local13);
				if (local35.aClass203Array2 == null) {
					local35.aClass203Array2 = new Class203[local25 + 1];
				}
				if (local35.aClass203Array2.length <= local25) {
					@Pc(54) Class203[] local54 = new Class203[local25 + 1];
					for (local56 = 0; local56 < local35.aClass203Array2.length; local56++) {
						local54[local56] = local35.aClass203Array2[local56];
					}
					local35.aClass203Array2 = local54;
				}
				if (local25 > 0 && local35.aClass203Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class203 local99 = new Class203();
				local99.anInt5473 = local19;
				local99.anInt5518 = local99.anInt5531 = local35.anInt5531;
				local99.anInt5504 = local25;
				local35.aClass203Array2[local25] = local99;
				if (arg1) {
					aClass203_53 = local99;
				} else {
					aClass203_54 = local99;
				}
				Static138.method2656(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass203_53 : aClass203_54;
				if (local137.anInt5504 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static414.method5954(local137.anInt5531);
				local158.aClass203Array2[local137.anInt5504] = null;
				Static138.method2656(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static414.method5954(anIntArray259[--anInt3106]);
				local137.aClass203Array2 = null;
				Static138.method2656(local137);
				return;
			}
			if (arg0 == 200) {
				anInt3106 -= 2;
				local13 = anIntArray259[anInt3106];
				local19 = anIntArray259[anInt3106 + 1];
				local210 = Static582.method7699(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray259[anInt3106++] = 1;
					if (arg1) {
						aClass203_53 = local210;
						return;
					}
					aClass203_54 = local210;
					return;
				}
				anIntArray259[anInt3106++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray259[--anInt3106];
				local158 = Static414.method5954(local13);
				if (local158 != null) {
					anIntArray259[anInt3106++] = 1;
					if (arg1) {
						aClass203_53 = local158;
						return;
					}
					aClass203_54 = local158;
					return;
				}
				anIntArray259[anInt3106++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray259[--anInt3106];
				method2771(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray259[--anInt3106];
				method2779(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt3106 -= 2;
					local13 = anIntArray259[anInt3106];
					local19 = anIntArray259[anInt3106 + 1];
					for (local25 = 0; local25 < Static368.anIntArray499.length; local25++) {
						if (Static368.anIntArray499[local25] == local13) {
							Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aClass75_1.method2382(local19, Static107.aClass352_2, local25);
							return;
						}
					}
					for (local353 = 0; local353 < Static294.anIntArray405.length; local353++) {
						if (Static294.anIntArray405[local353] == local13) {
							Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aClass75_1.method2382(local19, Static107.aClass352_2, local353);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt3106 -= 2;
					local13 = anIntArray259[anInt3106];
					local19 = anIntArray259[anInt3106 + 1];
					Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aClass75_1.method2387(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray259[--anInt3106] != 0;
					Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aClass75_1.method2379(local412);
					return;
				}
				if (arg0 == 411) {
					anInt3106 -= 2;
					local13 = anIntArray259[anInt3106];
					local19 = anIntArray259[anInt3106 + 1];
					Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aClass75_1.method2384(Static517.aClass145_1, local13, local19);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static414.method5954(anIntArray259[--anInt3106]);
				} else {
					local137 = arg1 ? aClass203_53 : aClass203_54;
				}
				if (arg0 == 1000) {
					anInt3106 -= 4;
					local137.anInt5509 = anIntArray259[anInt3106];
					local137.anInt5517 = anIntArray259[anInt3106 + 1];
					local19 = anIntArray259[anInt3106 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray259[anInt3106 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte66 = (byte) local19;
					local137.aByte63 = (byte) local25;
					Static138.method2656(local137);
					Static398.method5825(local137);
					if (local137.anInt5504 == -1) {
						Static352.method4080(local137.anInt5531);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt3106 -= 4;
					local137.anInt5480 = anIntArray259[anInt3106];
					local137.anInt5442 = anIntArray259[anInt3106 + 1];
					local137.anInt5524 = 0;
					local137.anInt5459 = 0;
					local19 = anIntArray259[anInt3106 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray259[anInt3106 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte65 = (byte) local19;
					local137.aByte64 = (byte) local25;
					Static138.method2656(local137);
					Static398.method5825(local137);
					if (local137.anInt5473 == 0) {
						Static480.method6572(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(645) boolean local645 = anIntArray259[--anInt3106] == 1;
					if (local137.aBoolean447 != local645) {
						local137.aBoolean447 = local645;
						Static138.method2656(local137);
					}
					if (local137.anInt5504 == -1) {
						Static276.method4413(local137.anInt5531);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt3106 -= 2;
					local137.anInt5528 = anIntArray259[anInt3106];
					local137.anInt5462 = anIntArray259[anInt3106 + 1];
					Static138.method2656(local137);
					Static398.method5825(local137);
					if (local137.anInt5473 == 0) {
						Static480.method6572(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean438 = anIntArray259[--anInt3106] == 1;
					return;
				}
			} else {
				@Pc(1507) String local1507;
				@Pc(1145) String local1145;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static414.method5954(anIntArray259[--anInt3106]);
					} else {
						local137 = arg1 ? aClass203_53 : aClass203_54;
					}
					if (arg0 == 1100) {
						anInt3106 -= 2;
						local137.anInt5466 = anIntArray259[anInt3106];
						if (local137.anInt5466 > local137.anInt5490 - local137.anInt5513) {
							local137.anInt5466 = local137.anInt5490 - local137.anInt5513;
						}
						if (local137.anInt5466 < 0) {
							local137.anInt5466 = 0;
						}
						local137.anInt5512 = anIntArray259[anInt3106 + 1];
						if (local137.anInt5512 > local137.anInt5506 - local137.anInt5476) {
							local137.anInt5512 = local137.anInt5506 - local137.anInt5476;
						}
						if (local137.anInt5512 < 0) {
							local137.anInt5512 = 0;
						}
						Static138.method2656(local137);
						if (local137.anInt5504 == -1) {
							Static189.method3259(local137.anInt5531);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt5450 = anIntArray259[--anInt3106];
						Static138.method2656(local137);
						if (local137.anInt5504 == -1) {
							Static37.method659(local137.anInt5531);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean441 = anIntArray259[--anInt3106] == 1;
						Static138.method2656(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt5495 = anIntArray259[--anInt3106];
						Static138.method2656(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt5471 = anIntArray259[--anInt3106];
						Static138.method2656(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray259[--anInt3106];
						if (local137.anInt5496 != local19) {
							local137.anInt5496 = local19;
							Static138.method2656(local137);
						}
						if (local137.anInt5504 == -1) {
							Static544.method7136(local137.anInt5531);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt5519 = anIntArray259[--anInt3106];
						Static138.method2656(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean437 = anIntArray259[--anInt3106] == 1;
						Static138.method2656(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt5448 = 1;
						local137.anInt5523 = anIntArray259[--anInt3106];
						Static138.method2656(local137);
						if (local137.anInt5504 == -1) {
							Static513.method6864(local137.anInt5531);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt3106 -= 6;
						local137.anInt5443 = anIntArray259[anInt3106];
						local137.anInt5530 = anIntArray259[anInt3106 + 1];
						local137.anInt5521 = anIntArray259[anInt3106 + 2];
						local137.anInt5465 = anIntArray259[anInt3106 + 3];
						local137.anInt5532 = anIntArray259[anInt3106 + 4];
						local137.anInt5498 = anIntArray259[anInt3106 + 5];
						Static138.method2656(local137);
						if (local137.anInt5504 == -1) {
							Static102.method753(local137.anInt5531);
							Static185.method3184(local137.anInt5531);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray259[--anInt3106];
						if (local137.anInt5505 != local19) {
							local137.anInt5505 = local19;
							local137.anInt5458 = 0;
							local137.anInt5481 = 1;
							local137.anInt5511 = 0;
							@Pc(1094) Class17 local1094 = local137.anInt5505 == -1 ? null : Static330.aClass279_2.method6216(local137.anInt5505);
							if (local1094 != null) {
								Static435.method6109(local137.anInt5458, local1094);
							}
							Static138.method2656(local137);
						}
						if (local137.anInt5504 == -1) {
							Static203.method3655(local137.anInt5531);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean443 = anIntArray259[--anInt3106] == 1;
						Static138.method2656(local137);
						return;
					}
					if (arg0 == 1112) {
						local1145 = aStringArray15[--anInt3110];
						if (!local1145.equals(local137.aString75)) {
							local137.aString75 = local1145;
							Static138.method2656(local137);
						}
						if (local137.anInt5504 == -1) {
							Static135.method2614(local137.anInt5531);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt5486 = anIntArray259[--anInt3106];
						Static138.method2656(local137);
						if (local137.anInt5504 == -1) {
							Static21.method443(local137.anInt5531);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt3106 -= 3;
						local137.anInt5454 = anIntArray259[anInt3106];
						local137.anInt5485 = anIntArray259[anInt3106 + 1];
						local137.anInt5447 = anIntArray259[anInt3106 + 2];
						Static138.method2656(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean444 = anIntArray259[--anInt3106] == 1;
						Static138.method2656(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt5503 = anIntArray259[--anInt3106];
						Static138.method2656(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt5456 = anIntArray259[--anInt3106];
						Static138.method2656(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean446 = anIntArray259[--anInt3106] == 1;
						Static138.method2656(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean450 = anIntArray259[--anInt3106] == 1;
						Static138.method2656(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt3106 -= 2;
						local137.anInt5490 = anIntArray259[anInt3106];
						local137.anInt5506 = anIntArray259[anInt3106 + 1];
						Static138.method2656(local137);
						if (local137.anInt5473 == 0) {
							Static480.method6572(false, local137);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean452 = anIntArray259[--anInt3106] == 1;
						Static138.method2656(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt5498 = anIntArray259[--anInt3106];
						Static138.method2656(local137);
						if (local137.anInt5504 == -1) {
							Static102.method753(local137.anInt5531);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray259[--anInt3106];
						local137.aBoolean453 = local19 == 1;
						Static138.method2656(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt3106 -= 2;
						local137.anInt5455 = anIntArray259[anInt3106];
						local137.anInt5470 = anIntArray259[anInt3106 + 1];
						Static138.method2656(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt5483 = anIntArray259[--anInt3106];
						Static138.method2656(local137);
						return;
					}
					@Pc(1473) Class14 local1473;
					if (arg0 == 1127) {
						anInt3106 -= 2;
						local19 = anIntArray259[anInt3106];
						local25 = anIntArray259[anInt3106 + 1];
						local1473 = Static69.aClass118_1.method3019(local19);
						if (local25 != local1473.anInt534) {
							local137.method4775(local25, local19);
							return;
						}
						local137.method4776(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray259[--anInt3106];
						local1507 = aStringArray15[--anInt3110];
						local1473 = Static69.aClass118_1.method3019(local19);
						if (!local1473.aString14.equals(local1507)) {
							local137.method4786(local19, local1507);
							return;
						}
						local137.method4776(local19);
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static414.method5954(anIntArray259[--anInt3106]);
					} else {
						local137 = arg1 ? aClass203_53 : aClass203_54;
					}
					Static138.method2656(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt3106 -= 2;
						local19 = anIntArray259[anInt3106];
						local25 = anIntArray259[anInt3106 + 1];
						if (local137.anInt5504 == -1) {
							Static460.method6383(local137.anInt5531);
							Static102.method753(local137.anInt5531);
							Static185.method3184(local137.anInt5531);
						}
						if (local19 == -1) {
							local137.anInt5448 = 1;
							local137.anInt5523 = -1;
							local137.anInt5507 = -1;
							return;
						}
						local137.anInt5507 = local19;
						local137.anInt5497 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean442 = true;
						} else {
							local137.aBoolean442 = false;
						}
						@Pc(1649) Class339 local1649 = Static517.aClass145_1.method3798(local19);
						local137.anInt5521 = local1649.anInt8837;
						local137.anInt5465 = local1649.anInt8834;
						local137.anInt5532 = local1649.anInt8842;
						local137.anInt5443 = local1649.anInt8801;
						local137.anInt5530 = local1649.anInt8826;
						local137.anInt5498 = local1649.anInt8794;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt5467 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt5467 = 1;
						} else {
							local137.anInt5467 = 2;
						}
						if (local137.anInt5524 > 0) {
							local137.anInt5498 = local137.anInt5498 * 32 / local137.anInt5524;
							return;
						}
						if (local137.anInt5480 > 0) {
							local137.anInt5498 = local137.anInt5498 * 32 / local137.anInt5480;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt5448 = 2;
						local137.anInt5523 = anIntArray259[--anInt3106];
						if (local137.anInt5504 == -1) {
							Static513.method6864(local137.anInt5531);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt5448 = 3;
						local137.anInt5523 = -1;
						if (local137.anInt5504 == -1) {
							Static513.method6864(local137.anInt5531);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt5448 = 6;
						local137.anInt5523 = anIntArray259[--anInt3106];
						if (local137.anInt5504 == -1) {
							Static513.method6864(local137.anInt5531);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt5448 = 5;
						local137.anInt5523 = anIntArray259[--anInt3106];
						if (local137.anInt5504 == -1) {
							Static513.method6864(local137.anInt5531);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt3106 -= 4;
						local137.anInt5533 = anIntArray259[anInt3106];
						local137.anInt5525 = anIntArray259[anInt3106 + 1];
						local137.anInt5499 = anIntArray259[anInt3106 + 2];
						local137.anInt5501 = anIntArray259[anInt3106 + 3];
						Static138.method2656(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt3106 -= 2;
						local137.anInt5472 = anIntArray259[anInt3106];
						local137.anInt5487 = anIntArray259[anInt3106 + 1];
						Static138.method2656(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt3106 -= 4;
						local137.anInt5523 = anIntArray259[anInt3106];
						local137.anInt5491 = anIntArray259[anInt3106 + 1];
						if (anIntArray259[anInt3106 + 2] == 1) {
							local137.anInt5448 = 9;
						} else {
							local137.anInt5448 = 8;
						}
						if (anIntArray259[anInt3106 + 3] == 1) {
							local137.aBoolean442 = true;
						} else {
							local137.aBoolean442 = false;
						}
						if (local137.anInt5504 == -1) {
							Static513.method6864(local137.anInt5531);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt5448 = 5;
						local137.anInt5523 = Static502.anInt8011;
						local137.anInt5491 = 0;
						if (local137.anInt5504 == -1) {
							Static513.method6864(local137.anInt5531);
						}
						return;
					}
				} else {
					@Pc(2309) int local2309;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static414.method5954(anIntArray259[--anInt3106]);
						} else {
							local137 = arg1 ? aClass203_53 : aClass203_54;
						}
						if (arg0 == 1300) {
							local19 = anIntArray259[--anInt3106] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method4784(aStringArray15[--anInt3110], local19);
								return;
							}
							anInt3110--;
							return;
						}
						if (arg0 == 1301) {
							anInt3106 -= 2;
							local19 = anIntArray259[anInt3106];
							local25 = anIntArray259[anInt3106 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass203_94 = null;
								return;
							}
							local137.aClass203_94 = Static582.method7699(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray259[--anInt3106];
							if (local19 != Static422.anInt7063 && local19 != Static157.anInt3173 && local19 != Static28.anInt682) {
								return;
							}
							local137.anInt5508 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt5452 = anIntArray259[--anInt3106];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt5445 = anIntArray259[--anInt3106];
							return;
						}
						if (arg0 == 1305) {
							local137.aString71 = aStringArray15[--anInt3110];
							return;
						}
						if (arg0 == 1306) {
							local137.aString73 = aStringArray15[--anInt3110];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray33 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt5479 = anIntArray259[--anInt3106];
							local137.anInt5522 = anIntArray259[--anInt3106];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray259[--anInt3106];
							local25 = anIntArray259[--anInt3106];
							if (local25 >= 1 && local25 <= 10) {
								local137.method4779(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString72 = aStringArray15[--anInt3110];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt5441 = anIntArray259[--anInt3106];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt3106 -= 3;
								local19 = anIntArray259[anInt3106] - 1;
								local25 = anIntArray259[anInt3106 + 1];
								local353 = anIntArray259[anInt3106 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt3106 -= 2;
								local19 = 10;
								local25 = anIntArray259[anInt3106];
								local353 = anIntArray259[anInt3106 + 1];
							}
							if (local137.aByteArray62 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray62 = new byte[11];
								local137.aByteArray61 = new byte[11];
								local137.anIntArray423 = new int[11];
							}
							local137.aByteArray62[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean449 = false;
								for (local2309 = 0; local2309 < local137.aByteArray62.length; local2309++) {
									if (local137.aByteArray62[local2309] != 0) {
										local137.aBoolean449 = true;
										break;
									}
								}
							} else {
								local137.aBoolean449 = true;
							}
							local137.aByteArray61[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt5502 = anIntArray259[--anInt3106];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static414.method5954(anIntArray259[--anInt3106]);
						} else {
							local137 = arg1 ? aClass203_53 : aClass203_54;
						}
						if (arg0 == 1499) {
							local137.method4777();
							return;
						}
						local1145 = aStringArray15[--anInt3110];
						@Pc(2395) int[] local2395 = null;
						if (local1145.length() > 0 && local1145.charAt(local1145.length() - 1) == 'Y') {
							local353 = anIntArray259[--anInt3106];
							if (local353 > 0) {
								local2395 = new int[local353];
								while (local353-- > 0) {
									local2395[local353] = anIntArray259[--anInt3106];
								}
							}
							local1145 = local1145.substring(0, local1145.length() - 1);
						}
						@Pc(2447) Object[] local2447 = new Object[local1145.length() + 1];
						for (local2309 = local2447.length - 1; local2309 >= 1; local2309--) {
							if (local1145.charAt(local2309 - 1) == 's') {
								local2447[local2309] = aStringArray15[--anInt3110];
							} else {
								local2447[local2309] = Integer.valueOf(anIntArray259[--anInt3106]);
							}
						}
						local56 = anIntArray259[--anInt3106];
						if (local56 == -1) {
							local2447 = null;
						} else {
							local2447[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray23 = local2447;
						} else if (arg0 == 1401) {
							local137.anObjectArray7 = local2447;
						} else if (arg0 == 1402) {
							local137.anObjectArray9 = local2447;
						} else if (arg0 == 1403) {
							local137.anObjectArray6 = local2447;
						} else if (arg0 == 1404) {
							local137.anObjectArray19 = local2447;
						} else if (arg0 == 1405) {
							local137.anObjectArray20 = local2447;
						} else if (arg0 == 1406) {
							local137.anObjectArray4 = local2447;
						} else if (arg0 == 1407) {
							local137.anObjectArray13 = local2447;
							local137.anIntArray422 = local2395;
						} else if (arg0 == 1408) {
							local137.anObjectArray22 = local2447;
						} else if (arg0 == 1409) {
							local137.anObjectArray29 = local2447;
						} else if (arg0 == 1410) {
							local137.anObjectArray8 = local2447;
						} else if (arg0 == 1411) {
							local137.anObjectArray24 = local2447;
						} else if (arg0 == 1412) {
							local137.anObjectArray25 = local2447;
						} else if (arg0 == 1414) {
							local137.anObjectArray5 = local2447;
							local137.anIntArray416 = local2395;
						} else if (arg0 == 1415) {
							local137.anObjectArray16 = local2447;
							local137.lb = local2395;
						} else if (arg0 == 1416) {
							local137.anObjectArray12 = local2447;
						} else if (arg0 == 1417) {
							local137.anObjectArray27 = local2447;
						} else if (arg0 == 1418) {
							local137.anObjectArray18 = local2447;
						} else if (arg0 == 1419) {
							local137.anObjectArray1 = local2447;
						} else if (arg0 == 1420) {
							local137.anObjectArray30 = local2447;
						} else if (arg0 == 1421) {
							local137.anObjectArray28 = local2447;
						} else if (arg0 == 1422) {
							local137.anObjectArray2 = local2447;
						} else if (arg0 == 1423) {
							local137.anObjectArray11 = local2447;
						} else if (arg0 == 1424) {
							local137.anObjectArray15 = local2447;
						} else if (arg0 == 1425) {
							local137.anObjectArray21 = local2447;
						} else if (arg0 == 1426) {
							local137.anObjectArray14 = local2447;
						} else if (arg0 == 1427) {
							local137.anObjectArray26 = local2447;
						} else if (arg0 == 1428) {
							local137.anObjectArray31 = local2447;
							local137.anIntArray418 = local2395;
						} else if (arg0 == 1429) {
							local137.anObjectArray3 = local2447;
							local137.anIntArray421 = local2395;
						} else if (arg0 == 1430) {
							local137.anObjectArray17 = local2447;
						}
						local137.aBoolean439 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass203_53 : aClass203_54;
						if (arg0 == 1500) {
							anIntArray259[anInt3106++] = local137.anInt5527;
							return;
						}
						if (arg0 == 1501) {
							anIntArray259[anInt3106++] = local137.anInt5440;
							return;
						}
						if (arg0 == 1502) {
							anIntArray259[anInt3106++] = local137.anInt5513;
							return;
						}
						if (arg0 == 1503) {
							anIntArray259[anInt3106++] = local137.anInt5476;
							return;
						}
						if (arg0 == 1504) {
							anIntArray259[anInt3106++] = local137.aBoolean447 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray259[anInt3106++] = local137.anInt5518;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static415.method7487(local137);
							anIntArray259[anInt3106++] = local158 == null ? -1 : local158.anInt5531;
							return;
						}
					} else {
						@Pc(3043) Class14 local3043;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass203_53 : aClass203_54;
							if (arg0 == 1600) {
								anIntArray259[anInt3106++] = local137.anInt5466;
								return;
							}
							if (arg0 == 1601) {
								anIntArray259[anInt3106++] = local137.anInt5512;
								return;
							}
							if (arg0 == 1602) {
								aStringArray15[anInt3110++] = local137.aString75;
								return;
							}
							if (arg0 == 1603) {
								anIntArray259[anInt3106++] = local137.anInt5490;
								return;
							}
							if (arg0 == 1604) {
								anIntArray259[anInt3106++] = local137.anInt5506;
								return;
							}
							if (arg0 == 1605) {
								anIntArray259[anInt3106++] = local137.anInt5498;
								return;
							}
							if (arg0 == 1606) {
								anIntArray259[anInt3106++] = local137.anInt5521;
								return;
							}
							if (arg0 == 1607) {
								anIntArray259[anInt3106++] = local137.anInt5532;
								return;
							}
							if (arg0 == 1608) {
								anIntArray259[anInt3106++] = local137.anInt5465;
								return;
							}
							if (arg0 == 1609) {
								anIntArray259[anInt3106++] = local137.anInt5495;
								return;
							}
							if (arg0 == 1610) {
								anIntArray259[anInt3106++] = local137.anInt5443;
								return;
							}
							if (arg0 == 1611) {
								anIntArray259[anInt3106++] = local137.anInt5530;
								return;
							}
							if (arg0 == 1612) {
								anIntArray259[anInt3106++] = local137.anInt5496;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray259[--anInt3106];
								local3043 = Static69.aClass118_1.method3019(local19);
								if (local3043.method434()) {
									aStringArray15[anInt3110++] = local137.method4787(local19, local3043.aString14);
									return;
								}
								anIntArray259[anInt3106++] = local137.method4773(local3043.anInt534, local19);
								return;
							}
							if (arg0 == 1614) {
								anIntArray259[anInt3106++] = local137.anInt5519;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass203_53 : aClass203_54;
							if (arg0 == 1700) {
								anIntArray259[anInt3106++] = local137.anInt5507;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt5507 != -1) {
									anIntArray259[anInt3106++] = local137.anInt5497;
									return;
								}
								anIntArray259[anInt3106++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray259[anInt3106++] = local137.anInt5504;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass203_53 : aClass203_54;
							if (arg0 == 1800) {
								anIntArray259[anInt3106++] = Static69.method1651(local137).method571();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray259[--anInt3106];
								local19--;
								if (local137.aStringArray33 != null && local19 < local137.aStringArray33.length && local137.aStringArray33[local19] != null) {
									aStringArray15[anInt3110++] = local137.aStringArray33[local19];
									return;
								}
								aStringArray15[anInt3110++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString71 == null) {
									aStringArray15[anInt3110++] = "";
									return;
								}
								aStringArray15[anInt3110++] = local137.aString71;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static414.method5954(anIntArray259[--anInt3106]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass203_53 : aClass203_54;
							}
							if (anInt3115 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray26 == null) {
									return;
								}
								@Pc(3293) Class3_Sub45 local3293 = new Class3_Sub45();
								local3293.aClass203_136 = local137;
								local3293.anObjectArray33 = local137.anObjectArray26;
								local3293.anInt8337 = anInt3115 + 1;
								Static146.aClass130_12.method3548(local3293);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static414.method5954(anIntArray259[--anInt3106]);
							if (arg0 == 2500) {
								anIntArray259[anInt3106++] = local137.anInt5527;
								return;
							}
							if (arg0 == 2501) {
								anIntArray259[anInt3106++] = local137.anInt5440;
								return;
							}
							if (arg0 == 2502) {
								anIntArray259[anInt3106++] = local137.anInt5513;
								return;
							}
							if (arg0 == 2503) {
								anIntArray259[anInt3106++] = local137.anInt5476;
								return;
							}
							if (arg0 == 2504) {
								anIntArray259[anInt3106++] = local137.aBoolean447 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray259[anInt3106++] = local137.anInt5518;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static415.method7487(local137);
								anIntArray259[anInt3106++] = local158 == null ? -1 : local158.anInt5531;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static414.method5954(anIntArray259[--anInt3106]);
							if (arg0 == 2600) {
								anIntArray259[anInt3106++] = local137.anInt5466;
								return;
							}
							if (arg0 == 2601) {
								anIntArray259[anInt3106++] = local137.anInt5512;
								return;
							}
							if (arg0 == 2602) {
								aStringArray15[anInt3110++] = local137.aString75;
								return;
							}
							if (arg0 == 2603) {
								anIntArray259[anInt3106++] = local137.anInt5490;
								return;
							}
							if (arg0 == 2604) {
								anIntArray259[anInt3106++] = local137.anInt5506;
								return;
							}
							if (arg0 == 2605) {
								anIntArray259[anInt3106++] = local137.anInt5498;
								return;
							}
							if (arg0 == 2606) {
								anIntArray259[anInt3106++] = local137.anInt5521;
								return;
							}
							if (arg0 == 2607) {
								anIntArray259[anInt3106++] = local137.anInt5532;
								return;
							}
							if (arg0 == 2608) {
								anIntArray259[anInt3106++] = local137.anInt5465;
								return;
							}
							if (arg0 == 2609) {
								anIntArray259[anInt3106++] = local137.anInt5495;
								return;
							}
							if (arg0 == 2610) {
								anIntArray259[anInt3106++] = local137.anInt5443;
								return;
							}
							if (arg0 == 2611) {
								anIntArray259[anInt3106++] = local137.anInt5530;
								return;
							}
							if (arg0 == 2612) {
								anIntArray259[anInt3106++] = local137.anInt5496;
								return;
							}
							if (arg0 == 2613) {
								anIntArray259[anInt3106++] = local137.anInt5519;
								return;
							}
						} else {
							@Pc(3803) Class3_Sub28 local3803;
							@Pc(3701) Class3_Sub28 local3701;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static414.method5954(anIntArray259[--anInt3106]);
									anIntArray259[anInt3106++] = local137.anInt5507;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static414.method5954(anIntArray259[--anInt3106]);
									if (local137.anInt5507 != -1) {
										anIntArray259[anInt3106++] = local137.anInt5497;
										return;
									}
									anIntArray259[anInt3106++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray259[--anInt3106];
									local3701 = (Class3_Sub28) Static227.aClass310_15.method6601((long) local13);
									if (local3701 != null) {
										anIntArray259[anInt3106++] = 1;
										return;
									}
									anIntArray259[anInt3106++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static414.method5954(anIntArray259[--anInt3106]);
									if (local137.aClass203Array2 == null) {
										anIntArray259[anInt3106++] = 0;
										return;
									}
									local19 = local137.aClass203Array2.length;
									for (local25 = 0; local25 < local137.aClass203Array2.length; local25++) {
										if (local137.aClass203Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray259[anInt3106++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt3106 -= 2;
									local13 = anIntArray259[anInt3106];
									local19 = anIntArray259[anInt3106 + 1];
									local3803 = (Class3_Sub28) Static227.aClass310_15.method6601((long) local13);
									if (local3803 != null && local3803.anInt5333 == local19) {
										anIntArray259[anInt3106++] = 1;
										return;
									}
									anIntArray259[anInt3106++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static414.method5954(anIntArray259[--anInt3106]);
								if (arg0 == 2800) {
									anIntArray259[anInt3106++] = Static69.method1651(local137).method571();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray259[--anInt3106];
									local19--;
									if (local137.aStringArray33 != null && local19 < local137.aStringArray33.length && local137.aStringArray33[local19] != null) {
										aStringArray15[anInt3110++] = local137.aStringArray33[local19];
										return;
									}
									aStringArray15[anInt3110++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString71 == null) {
										aStringArray15[anInt3110++] = "";
										return;
									}
									aStringArray15[anInt3110++] = local137.aString71;
									return;
								}
							} else {
								@Pc(3940) String local3940;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3940 = aStringArray15[--anInt3110];
										Static354.method5307(local3940);
										return;
									}
									if (arg0 == 3101) {
										anInt3106 -= 2;
										Static395.method6354(anIntArray259[anInt3106], Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2, anIntArray259[anInt3106 + 1]);
										return;
									}
									if (arg0 == 3103) {
										Static216.method3776();
										return;
									}
									if (arg0 == 3104) {
										local3940 = aStringArray15[--anInt3110];
										local19 = 0;
										if (Static463.method6417(local3940)) {
											local19 = Static118.method2472(local3940);
										}
										@Pc(4000) Class3_Sub34 local4000 = Static374.method5522(Static272.aClass298_102, Static220.aClass287_2);
										local4000.aClass3_Sub11_Sub1_2.method3101(local19);
										Static131.method2572(local4000);
										return;
									}
									@Pc(4029) Class3_Sub34 local4029;
									if (arg0 == 3105) {
										local3940 = aStringArray15[--anInt3110];
										local4029 = Static374.method5522(Static207.aClass298_79, Static220.aClass287_2);
										local4029.aClass3_Sub11_Sub1_2.method3079(local3940.length() + 1);
										local4029.aClass3_Sub11_Sub1_2.method3136(local3940);
										Static131.method2572(local4029);
										return;
									}
									if (arg0 == 3106) {
										local3940 = aStringArray15[--anInt3110];
										local4029 = Static374.method5522(Static311.aClass298_115, Static220.aClass287_2);
										local4029.aClass3_Sub11_Sub1_2.method3079(local3940.length() + 1);
										local4029.aClass3_Sub11_Sub1_2.method3136(local3940);
										Static131.method2572(local4029);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray259[--anInt3106];
										local1145 = aStringArray15[--anInt3110];
										Static559.method7441(local13, local1145);
										return;
									}
									if (arg0 == 3108) {
										anInt3106 -= 3;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										local25 = anIntArray259[anInt3106 + 2];
										local35 = Static414.method5954(local25);
										Static47.method789(local19, local35, local13);
										return;
									}
									if (arg0 == 3109) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										local210 = arg1 ? aClass203_53 : aClass203_54;
										Static47.method789(local19, local210, local13);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray259[--anInt3106];
										local4029 = Static374.method5522(Static282.aClass298_107, Static220.aClass287_2);
										local4029.aClass3_Sub11_Sub1_2.method3131(local13);
										Static131.method2572(local4029);
										return;
									}
									if (arg0 == 3111) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										local3803 = (Class3_Sub28) Static227.aClass310_15.method6601((long) local13);
										if (local3803 != null) {
											Static423.method6029(true, local3803.anInt5333 != local19, local3803);
										}
										Static144.method2740(3, local13, true, local19);
										return;
									}
									if (arg0 == 3112) {
										anInt3106--;
										local13 = anIntArray259[anInt3106];
										local3701 = (Class3_Sub28) Static227.aClass310_15.method6601((long) local13);
										if (local3701 != null && local3701.anInt5330 == 3) {
											Static423.method6029(true, true, local3701);
										}
										return;
									}
									if (arg0 == 3113) {
										Static255.method4085(aStringArray15[--anInt3110]);
										return;
									}
									if (arg0 == 3114) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										local1507 = aStringArray15[--anInt3110];
										Static483.method6585("", "", "", local13, local19, local1507);
										return;
									}
									if (arg0 == 3115) {
										anInt3106 -= 11;
										@Pc(4330) Class300[] local4330 = Static175.method3039();
										@Pc(4333) Class140[] local4333 = Static53.method999();
										Static183.method3162(anIntArray259[anInt3106 + 9], anIntArray259[anInt3106 + 5], anIntArray259[anInt3106 + 2], anIntArray259[anInt3106 + 6], anIntArray259[anInt3106 + 3], anIntArray259[anInt3106 + 10], anIntArray259[anInt3106 + 7], local4330[anIntArray259[anInt3106]], anIntArray259[anInt3106 + 8], anIntArray259[anInt3106 + 4], local4333[anIntArray259[anInt3106 + 1]]);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt3106 -= 3;
										Static34.method576(255, anIntArray259[anInt3106 + 2], anIntArray259[anInt3106 + 1], anIntArray259[anInt3106]);
										return;
									}
									if (arg0 == 3201) {
										Static118.method2470(255, 50, anIntArray259[--anInt3106]);
										return;
									}
									if (arg0 == 3202) {
										anInt3106 -= 2;
										Static92.method2052(255, anIntArray259[anInt3106], anIntArray259[anInt3106 + 1]);
										return;
									}
									if (arg0 == 3203) {
										anInt3106 -= 4;
										Static34.method576(anIntArray259[anInt3106 + 3], anIntArray259[anInt3106 + 2], anIntArray259[anInt3106 + 1], anIntArray259[anInt3106]);
										return;
									}
									if (arg0 == 3204) {
										anInt3106 -= 3;
										Static118.method2470(anIntArray259[anInt3106 + 1], anIntArray259[anInt3106 + 2], anIntArray259[anInt3106]);
										return;
									}
									if (arg0 == 3205) {
										anInt3106 -= 3;
										Static92.method2052(anIntArray259[anInt3106 + 2], anIntArray259[anInt3106], anIntArray259[anInt3106 + 1]);
										return;
									}
									if (arg0 == 3206) {
										anInt3106 -= 4;
										Static544.method7134(anIntArray259[anInt3106 + 3], anIntArray259[anInt3106 + 2], false, anIntArray259[anInt3106 + 1], anIntArray259[anInt3106]);
										return;
									}
									if (arg0 == 3207) {
										anInt3106 -= 4;
										Static544.method7134(anIntArray259[anInt3106 + 3], anIntArray259[anInt3106 + 2], true, anIntArray259[anInt3106 + 1], anIntArray259[anInt3106]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray259[anInt3106++] = Static305.anInt5560;
										return;
									}
									if (arg0 == 3301) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = Static131.method2573(local19, false, local13);
										return;
									}
									if (arg0 == 3302) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = Static167.method2945(false, local13, local19);
										return;
									}
									if (arg0 == 3303) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = Static267.method4355(local13, local19, false);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Static258.aClass302_1.method6511(local13).anInt852;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Static95.anIntArray64[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Static501.anIntArray615[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Static349.anIntArray481[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4787) byte local4787 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126;
										local19 = (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975 >> 9) + Static529.anInt8344;
										local25 = (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980 >> 9) + Static463.anInt7588;
										anIntArray259[anInt3106++] = (local4787 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray259[anInt3106++] = Static137.aBoolean250 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = Static131.method2573(local19, true, local13);
										return;
									}
									if (arg0 == 3314) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = Static167.method2945(true, local13, local19);
										return;
									}
									if (arg0 == 3315) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = Static267.method4355(local13, local19, true);
										return;
									}
									if (arg0 == 3316) {
										if (Static274.anInt5067 >= 2) {
											anIntArray259[anInt3106++] = Static274.anInt5067;
											return;
										}
										anIntArray259[anInt3106++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray259[anInt3106++] = Static208.anInt4195;
										return;
									}
									if (arg0 == 3318) {
										anIntArray259[anInt3106++] = Static583.aClass65_5.anInt2279;
										return;
									}
									if (arg0 == 3321) {
										anIntArray259[anInt3106++] = Static66.anInt1794;
										return;
									}
									if (arg0 == 3322) {
										anIntArray259[anInt3106++] = Static556.anInt8901;
										return;
									}
									if (arg0 == 3323) {
										if (Static130.anInt2834 >= 5 && Static130.anInt2834 <= 9) {
											anIntArray259[anInt3106++] = 1;
											return;
										}
										anIntArray259[anInt3106++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static130.anInt2834 >= 5 && Static130.anInt2834 <= 9) {
											anIntArray259[anInt3106++] = Static130.anInt2834;
											return;
										}
										anIntArray259[anInt3106++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray259[anInt3106++] = Static35.aBoolean75 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray259[anInt3106++] = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt6503;
										return;
									}
									if (arg0 == 3327) {
										anIntArray259[anInt3106++] = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aClass75_1.aBoolean214 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray259[anInt3106++] = Static426.aBoolean561 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Static470.method6493(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = Static430.method6078(false, local13, local19);
										return;
									}
									if (arg0 == 3332) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = Static430.method6078(true, local13, local19);
										return;
									}
									if (arg0 == 3333) {
										anIntArray259[anInt3106++] = Static490.anInt7979;
										return;
									}
									if (arg0 == 3335) {
										anIntArray259[anInt3106++] = Static131.anInt2839;
										return;
									}
									if (arg0 == 3336) {
										anInt3106 -= 4;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										local25 = anIntArray259[anInt3106 + 2];
										local353 = anIntArray259[anInt3106 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray259[anInt3106++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray259[anInt3106++] = Static350.anInt8128;
										return;
									}
									if (arg0 == 3338) {
										anIntArray259[anInt3106++] = Static493.method5819();
										return;
									}
									if (arg0 == 3339) {
										anIntArray259[anInt3106++] = Static377.aBoolean531 ? 1 : 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray259[anInt3106++] = Static538.aBoolean658 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray259[anInt3106++] = Static53.aBoolean91 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray259[anInt3106++] = Static563.aClass156_1.method5689();
										return;
									}
									if (arg0 == 3343) {
										anIntArray259[anInt3106++] = Static563.aClass156_1.method5690();
										return;
									}
									if (arg0 == 3344) {
										aStringArray15[anInt3110++] = Static434.method4794();
										return;
									}
									if (arg0 == 3345) {
										aStringArray15[anInt3110++] = Static283.method2224();
										return;
									}
									if (arg0 == 3346) {
										anIntArray259[anInt3106++] = Static353.method5305();
										return;
									}
									if (arg0 == 3347) {
										anIntArray259[anInt3106++] = Static47.anInt1017;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5522) Class129 local5522;
									if (arg0 == 3400) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										local5522 = Static11.aClass155_1.method3928(local13);
										aStringArray15[anInt3110++] = local5522.method3303(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt3106 -= 4;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										local25 = anIntArray259[anInt3106 + 2];
										local353 = anIntArray259[anInt3106 + 3];
										@Pc(5568) Class129 local5568 = Static11.aClass155_1.method3928(local25);
										if (local5568.aChar2 == local13 && local5568.aChar3 == local19) {
											if (local19 == 115) {
												aStringArray15[anInt3110++] = local5568.method3303(local353);
												return;
											}
											anIntArray259[anInt3106++] = local5568.method3308(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt3106 -= 3;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										local25 = anIntArray259[anInt3106 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5644) Class129 local5644 = Static11.aClass155_1.method3928(local19);
										if (local5644.aChar3 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray259[anInt3106++] = local5644.method3306(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray259[--anInt3106];
										local1145 = aStringArray15[--anInt3110];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5522 = Static11.aClass155_1.method3928(local13);
										if (local5522.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray259[anInt3106++] = local5522.method3304(local1145) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray259[--anInt3106];
										@Pc(5742) Class129 local5742 = Static11.aClass155_1.method3928(local13);
										anIntArray259[anInt3106++] = local5742.aClass310_12.method6608();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static355.anInt6147 == 0) {
											anIntArray259[anInt3106++] = -2;
											return;
										}
										if (Static355.anInt6147 == 1) {
											anIntArray259[anInt3106++] = -1;
											return;
										}
										anIntArray259[anInt3106++] = Static590.anInt9377;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray259[--anInt3106];
										if (Static355.anInt6147 == 2 && local13 < Static590.anInt9377) {
											aStringArray15[anInt3110++] = Static595.aStringArray49[local13];
											if (Static588.aStringArray13[local13] != null) {
												aStringArray15[anInt3110++] = Static588.aStringArray13[local13];
												return;
											}
											aStringArray15[anInt3110++] = "";
											return;
										}
										aStringArray15[anInt3110++] = "";
										aStringArray15[anInt3110++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray259[--anInt3106];
										if (Static355.anInt6147 == 2 && local13 < Static590.anInt9377) {
											anIntArray259[anInt3106++] = Static334.anIntArray461[local13];
											return;
										}
										anIntArray259[anInt3106++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray259[--anInt3106];
										if (Static355.anInt6147 == 2 && local13 < Static590.anInt9377) {
											anIntArray259[anInt3106++] = Static394.anIntArray540[local13];
											return;
										}
										anIntArray259[anInt3106++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3940 = aStringArray15[--anInt3110];
										local19 = anIntArray259[--anInt3106];
										Static586.method7739(local3940, local19);
										return;
									}
									if (arg0 == 3605) {
										local3940 = aStringArray15[--anInt3110];
										Static458.method6367(local3940);
										return;
									}
									if (arg0 == 3606) {
										local3940 = aStringArray15[--anInt3110];
										Static161.method2877(local3940);
										return;
									}
									if (arg0 == 3607) {
										local3940 = aStringArray15[--anInt3110];
										Static410.method5908(false, local3940);
										return;
									}
									if (arg0 == 3608) {
										local3940 = aStringArray15[--anInt3110];
										Static273.method6461(local3940);
										return;
									}
									if (arg0 == 3609) {
										local3940 = aStringArray15[--anInt3110];
										if (local3940.startsWith("<img=0>") || local3940.startsWith("<img=1>")) {
											local3940 = local3940.substring(7);
										}
										anIntArray259[anInt3106++] = Static277.method4435(local3940) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray259[--anInt3106];
										if (Static355.anInt6147 == 2 && local13 < Static590.anInt9377) {
											aStringArray15[anInt3110++] = Static339.aStringArray36[local13];
											return;
										}
										aStringArray15[anInt3110++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static548.aString121 != null) {
											aStringArray15[anInt3110++] = Static501.method6760(Static548.aString121);
											return;
										}
										aStringArray15[anInt3110++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static548.aString121 != null) {
											anIntArray259[anInt3106++] = Static583.anInt9304;
											return;
										}
										anIntArray259[anInt3106++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray259[--anInt3106];
										if (Static548.aString121 != null && local13 < Static583.anInt9304) {
											aStringArray15[anInt3110++] = Static419.aClass325Array5[local13].aString113;
											return;
										}
										aStringArray15[anInt3110++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray259[--anInt3106];
										if (Static548.aString121 != null && local13 < Static583.anInt9304) {
											anIntArray259[anInt3106++] = Static419.aClass325Array5[local13].anInt8212;
											return;
										}
										anIntArray259[anInt3106++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray259[--anInt3106];
										if (Static548.aString121 != null && local13 < Static583.anInt9304) {
											anIntArray259[anInt3106++] = Static419.aClass325Array5[local13].aByte118;
											return;
										}
										anIntArray259[anInt3106++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray259[anInt3106++] = Static436.aByte100;
										return;
									}
									if (arg0 == 3617) {
										local3940 = aStringArray15[--anInt3110];
										Static428.method1617(local3940);
										return;
									}
									if (arg0 == 3618) {
										anIntArray259[anInt3106++] = Static253.aByte59;
										return;
									}
									if (arg0 == 3619) {
										local3940 = aStringArray15[--anInt3110];
										Static311.method4857(local3940);
										return;
									}
									if (arg0 == 3620) {
										Static581.method7695();
										return;
									}
									if (arg0 == 3621) {
										if (Static355.anInt6147 == 0) {
											anIntArray259[anInt3106++] = -1;
											return;
										}
										anIntArray259[anInt3106++] = Static82.anInt2184;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray259[--anInt3106];
										if (Static355.anInt6147 != 0 && local13 < Static82.anInt2184) {
											aStringArray15[anInt3110++] = Static145.aStringArray14[local13];
											if (Static553.aStringArray47[local13] != null) {
												aStringArray15[anInt3110++] = Static553.aStringArray47[local13];
												return;
											}
											aStringArray15[anInt3110++] = "";
											return;
										}
										aStringArray15[anInt3110++] = "";
										aStringArray15[anInt3110++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3940 = aStringArray15[--anInt3110];
										if (local3940.startsWith("<img=0>") || local3940.startsWith("<img=1>")) {
											local3940 = local3940.substring(7);
										}
										anIntArray259[anInt3106++] = Static381.method5639(local3940) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray259[--anInt3106];
										if (Static419.aClass325Array5 != null && local13 < Static583.anInt9304 && Static419.aClass325Array5[local13].aString111.equalsIgnoreCase(Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aString94)) {
											anIntArray259[anInt3106++] = 1;
											return;
										}
										anIntArray259[anInt3106++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static89.aString30 != null) {
											aStringArray15[anInt3110++] = Static89.aString30;
											return;
										}
										aStringArray15[anInt3110++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray259[--anInt3106];
										if (Static548.aString121 != null && local13 < Static583.anInt9304) {
											aStringArray15[anInt3110++] = Static419.aClass325Array5[local13].aString114;
											return;
										}
										aStringArray15[anInt3110++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray259[--anInt3106];
										if (Static355.anInt6147 == 2 && local13 >= 0 && local13 < Static590.anInt9377) {
											anIntArray259[anInt3106++] = Static265.aBooleanArray18[local13] ? 1 : 0;
											return;
										}
										anIntArray259[anInt3106++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3940 = aStringArray15[--anInt3110];
										if (local3940.startsWith("<img=0>") || local3940.startsWith("<img=1>")) {
											local3940 = local3940.substring(7);
										}
										anIntArray259[anInt3106++] = Static541.method7126(local3940);
										return;
									}
									if (arg0 == 3629) {
										anIntArray259[anInt3106++] = Static352.anInt4606;
										return;
									}
									if (arg0 == 3630) {
										local3940 = aStringArray15[--anInt3110];
										Static410.method5908(true, local3940);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Static143.aBooleanArray32[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray259[--anInt3106];
										if (Static548.aString121 != null && local13 < Static583.anInt9304) {
											aStringArray15[anInt3110++] = Static419.aClass325Array5[local13].aString111;
											return;
										}
										aStringArray15[anInt3110++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray259[--anInt3106];
										if (Static355.anInt6147 != 0 && local13 < Static82.anInt2184) {
											aStringArray15[anInt3110++] = Static552.aStringArray46[local13];
											return;
										}
										aStringArray15[anInt3110++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Static72.aClass259Array1[local13].method5870();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Static72.aClass259Array1[local13].anInt6875;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Static72.aClass259Array1[local13].anInt6871;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Static72.aClass259Array1[local13].anInt6870;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Static72.aClass259Array1[local13].anInt6876;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Static72.aClass259Array1[local13].anInt6868;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray259[--anInt3106];
										local19 = Static72.aClass259Array1[local13].method5871();
										anIntArray259[anInt3106++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray259[--anInt3106];
										local19 = Static72.aClass259Array1[local13].method5871();
										anIntArray259[anInt3106++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray259[--anInt3106];
										local19 = Static72.aClass259Array1[local13].method5871();
										anIntArray259[anInt3106++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray259[--anInt3106];
										local19 = Static72.aClass259Array1[local13].method5871();
										anIntArray259[anInt3106++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt3106 -= 5;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										local25 = anIntArray259[anInt3106 + 2];
										local353 = anIntArray259[anInt3106 + 3];
										local2309 = anIntArray259[anInt3106 + 4];
										anIntArray259[anInt3106++] = local13 + (local19 - local13) * (local2309 - local25) / (local353 - local25);
										return;
									}
									@Pc(7252) long local7252;
									@Pc(7245) long local7245;
									if (arg0 == 4007) {
										anInt3106 -= 2;
										local7245 = anIntArray259[anInt3106];
										local7252 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = (int) (local7245 + local7245 * local7252 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										if (local13 == 0) {
											anIntArray259[anInt3106++] = 0;
											return;
										}
										anIntArray259[anInt3106++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										if (local13 == 0) {
											anIntArray259[anInt3106++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray259[anInt3106++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray259[anInt3106++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt3106 -= 3;
										local7245 = anIntArray259[anInt3106];
										local7252 = anIntArray259[anInt3106 + 1];
										@Pc(7633) long local7633 = (long) anIntArray259[anInt3106 + 2];
										anIntArray259[anInt3106++] = (int) (local7245 * local7633 / local7252);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3940 = aStringArray15[--anInt3110];
										local19 = anIntArray259[--anInt3106];
										aStringArray15[anInt3110++] = local3940 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt3110 -= 2;
										local3940 = aStringArray15[anInt3110];
										local1145 = aStringArray15[anInt3110 + 1];
										aStringArray15[anInt3110++] = local3940 + local1145;
										return;
									}
									if (arg0 == 4102) {
										local3940 = aStringArray15[--anInt3110];
										local19 = anIntArray259[--anInt3106];
										aStringArray15[anInt3110++] = local3940 + Static481.method6574(local19);
										return;
									}
									if (arg0 == 4103) {
										local3940 = aStringArray15[--anInt3110];
										aStringArray15[anInt3110++] = local3940.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray15[anInt3110++] = method2780(anIntArray259[--anInt3106]);
										return;
									}
									if (arg0 == 4105) {
										anInt3110 -= 2;
										local3940 = aStringArray15[anInt3110];
										local1145 = aStringArray15[anInt3110 + 1];
										if (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aClass75_1 != null && Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aClass75_1.aBoolean214) {
											aStringArray15[anInt3110++] = local1145;
											return;
										}
										aStringArray15[anInt3110++] = local3940;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray259[--anInt3106];
										aStringArray15[anInt3110++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt3110 -= 2;
										anIntArray259[anInt3106++] = Static468.method6475(aStringArray15[anInt3110 + 1], Static131.anInt2839, aStringArray15[anInt3110]);
										return;
									}
									@Pc(7916) Class58 local7916;
									if (arg0 == 4108) {
										local3940 = aStringArray15[--anInt3110];
										anInt3106 -= 2;
										local19 = anIntArray259[anInt3106];
										local25 = anIntArray259[anInt3106 + 1];
										local7916 = Static14.method232(local25, Static467.aClass246_221);
										anIntArray259[anInt3106++] = local7916.method1775(local19, local3940, Static90.aClass46Array4);
										return;
									}
									if (arg0 == 4109) {
										local3940 = aStringArray15[--anInt3110];
										anInt3106 -= 2;
										local19 = anIntArray259[anInt3106];
										local25 = anIntArray259[anInt3106 + 1];
										local7916 = Static14.method232(local25, Static467.aClass246_221);
										anIntArray259[anInt3106++] = local7916.method1766(local3940, Static90.aClass46Array4, local19);
										return;
									}
									if (arg0 == 4110) {
										anInt3110 -= 2;
										local3940 = aStringArray15[anInt3110];
										local1145 = aStringArray15[anInt3110 + 1];
										if (anIntArray259[--anInt3106] == 1) {
											aStringArray15[anInt3110++] = local3940;
											return;
										}
										aStringArray15[anInt3110++] = local1145;
										return;
									}
									if (arg0 == 4111) {
										local3940 = aStringArray15[--anInt3110];
										aStringArray15[anInt3110++] = Static81.method1770(local3940);
										return;
									}
									if (arg0 == 4112) {
										local3940 = aStringArray15[--anInt3110];
										local19 = anIntArray259[--anInt3106];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray15[anInt3110++] = local3940 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Static201.method3628((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Static260.method4319((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Static181.method3148((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Static288.method4547((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3940 = aStringArray15[--anInt3110];
										if (local3940 != null) {
											anIntArray259[anInt3106++] = local3940.length();
											return;
										}
										anIntArray259[anInt3106++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3940 = aStringArray15[--anInt3110];
										anInt3106 -= 2;
										local19 = anIntArray259[anInt3106];
										local25 = anIntArray259[anInt3106 + 1];
										aStringArray15[anInt3110++] = local3940.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3940 = aStringArray15[--anInt3110];
										@Pc(8279) StringBuffer local8279 = new StringBuffer(local3940.length());
										@Pc(8281) boolean local8281 = false;
										for (local353 = 0; local353 < local3940.length(); local353++) {
											@Pc(8288) char local8288 = local3940.charAt(local353);
											if (local8288 == '<') {
												local8281 = true;
											} else if (local8288 == '>') {
												local8281 = false;
											} else if (!local8281) {
												local8279.append(local8288);
											}
										}
										aStringArray15[anInt3110++] = local8279.toString();
										return;
									}
									if (arg0 == 4120) {
										local3940 = aStringArray15[--anInt3110];
										anInt3106 -= 2;
										local19 = anIntArray259[anInt3106];
										local25 = anIntArray259[anInt3106 + 1];
										anIntArray259[anInt3106++] = local3940.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt3110 -= 2;
										local3940 = aStringArray15[anInt3110];
										local1145 = aStringArray15[anInt3110 + 1];
										local25 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = local3940.indexOf(local1145, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray259[--anInt3106] != 0;
										local19 = anIntArray259[--anInt3106];
										aStringArray15[anInt3110++] = Static585.method7725(local412, 0, (long) local19, Static131.anInt2839);
										return;
									}
									if (arg0 == 4125) {
										local3940 = aStringArray15[--anInt3110];
										local19 = anIntArray259[--anInt3106];
										@Pc(8502) Class58 local8502 = Static14.method232(local19, Static467.aClass246_221);
										anIntArray259[anInt3106++] = local8502.method1776(local3940, Static90.aClass46Array4);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray259[--anInt3106];
										aStringArray15[anInt3110++] = Static517.aClass145_1.method3798(local13).aString120;
										return;
									}
									@Pc(8564) Class339 local8564;
									if (arg0 == 4201) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										local8564 = Static517.aClass145_1.method3798(local13);
										if (local19 >= 1 && local19 <= 5 && local8564.aStringArray45[local19 - 1] != null) {
											aStringArray15[anInt3110++] = local8564.aStringArray45[local19 - 1];
											return;
										}
										aStringArray15[anInt3110++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										local8564 = Static517.aClass145_1.method3798(local13);
										if (local19 >= 1 && local19 <= 5 && local8564.aStringArray44[local19 - 1] != null) {
											aStringArray15[anInt3110++] = local8564.aStringArray44[local19 - 1];
											return;
										}
										aStringArray15[anInt3110++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Static517.aClass145_1.method3798(local13).anInt8828;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Static517.aClass145_1.method3798(local13).anInt8789 == 1 ? 1 : 0;
										return;
									}
									@Pc(8727) Class339 local8727;
									if (arg0 == 4205) {
										local13 = anIntArray259[--anInt3106];
										local8727 = Static517.aClass145_1.method3798(local13);
										if (local8727.anInt8830 == -1 && local8727.anInt8802 >= 0) {
											anIntArray259[anInt3106++] = local8727.anInt8802;
											return;
										}
										anIntArray259[anInt3106++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray259[--anInt3106];
										local8727 = Static517.aClass145_1.method3798(local13);
										if (local8727.anInt8830 >= 0 && local8727.anInt8802 >= 0) {
											anIntArray259[anInt3106++] = local8727.anInt8802;
											return;
										}
										anIntArray259[anInt3106++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Static517.aClass145_1.method3798(local13).aBoolean692 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										local3043 = Static69.aClass118_1.method3019(local19);
										if (local3043.method434()) {
											aStringArray15[anInt3110++] = Static517.aClass145_1.method3798(local13).method7310(local3043.aString14, local19);
											return;
										}
										anIntArray259[anInt3106++] = Static517.aClass145_1.method3798(local13).method7305(local3043.anInt534, local19);
										return;
									}
									if (arg0 == 4209) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1] - 1;
										local8564 = Static517.aClass145_1.method3798(local13);
										if (local8564.anInt8787 == local19) {
											anIntArray259[anInt3106++] = local8564.anInt8816;
											return;
										}
										if (local8564.anInt8812 == local19) {
											anIntArray259[anInt3106++] = local8564.anInt8841;
											return;
										}
										anIntArray259[anInt3106++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3940 = aStringArray15[--anInt3110];
										local19 = anIntArray259[--anInt3106];
										Static409.method5562(local19 == 1, local3940);
										anIntArray259[anInt3106++] = Static586.anInt9337;
										return;
									}
									if (arg0 == 4211) {
										if (Static251.aShortArray108 != null && Static71.anInt1939 < Static586.anInt9337) {
											anIntArray259[anInt3106++] = Static251.aShortArray108[Static71.anInt1939++] & 0xFFFF;
											return;
										}
										anIntArray259[anInt3106++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static71.anInt1939 = 0;
										return;
									}
									if (arg0 == 4213) {
										local13 = anIntArray259[--anInt3106];
										anIntArray259[anInt3106++] = Static517.aClass145_1.method3798(local13).anInt8790;
										return;
									}
									if (arg0 == 4214) {
										local3940 = aStringArray15[--anInt3110];
										anInt3106 -= 3;
										local19 = anIntArray259[anInt3106];
										local25 = anIntArray259[anInt3106 + 1];
										local353 = anIntArray259[anInt3106 + 2];
										Static501.method6756(local3940, local353, local19 == 1, local25);
										anIntArray259[anInt3106++] = Static586.anInt9337;
										return;
									}
									if (arg0 == 4215) {
										anInt3110 -= 2;
										anInt3106 -= 2;
										local3940 = aStringArray15[anInt3110];
										local19 = anIntArray259[anInt3106];
										local25 = anIntArray259[anInt3106 + 1];
										@Pc(9126) String local9126 = aStringArray15[anInt3110 + 1];
										Static583.method7707(local9126, local19 == 1, local3940, local25);
										anIntArray259[anInt3106++] = Static586.anInt9337;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										local3043 = Static69.aClass118_1.method3019(local19);
										if (local3043.method434()) {
											aStringArray15[anInt3110++] = Static510.aClass284_2.method6281(local13).method6427(local19, local3043.aString14);
											return;
										}
										anIntArray259[anInt3106++] = Static510.aClass284_2.method6281(local13).method6434(local19, local3043.anInt534);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										local3043 = Static69.aClass118_1.method3019(local19);
										if (local3043.method434()) {
											aStringArray15[anInt3110++] = Static476.aClass69_5.method2181(local13).method583(local3043.aString14, local19);
											return;
										}
										anIntArray259[anInt3106++] = Static476.aClass69_5.method2181(local13).method588(local19, local3043.anInt534);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt3106 -= 2;
										local13 = anIntArray259[anInt3106];
										local19 = anIntArray259[anInt3106 + 1];
										local3043 = Static69.aClass118_1.method3019(local19);
										if (local3043.method434()) {
											aStringArray15[anInt3110++] = Static405.aClass71_1.method2252(local13).method5620(local19, local3043.aString14);
											return;
										}
										anIntArray259[anInt3106++] = Static405.aClass71_1.method2252(local13).method5618(local19, local3043.anInt534);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray259[--anInt3106];
									@Pc(9354) Class267 local9354 = Static363.aClass135_1.method3664(local13);
									if (local9354.anIntArray556 != null && local9354.anIntArray556.length > 0) {
										local25 = 0;
										local353 = local9354.anIntArray553[0];
										for (local2309 = 1; local2309 < local9354.anIntArray556.length; local2309++) {
											if (local9354.anIntArray553[local2309] > local353) {
												local25 = local2309;
												local353 = local9354.anIntArray553[local2309];
											}
										}
										anIntArray259[anInt3106++] = local9354.anIntArray556[local25];
										return;
									}
									anIntArray259[anInt3106++] = local9354.anInt7035;
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

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
	private static void method2771(@OriginalArg(0) int arg0) {
		@Pc(3) Class203 local3 = Static414.method5954(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class203[] local13 = Static267.aClass203ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class203[] local19 = Static59.aClass203ArrayArray3[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static267.aClass203ArrayArray2[local9] = new Class203[local22];
			Static604.method5912(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static604.method5912(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method2772(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static274.anInt5067 == 0 && (Static203.aBoolean318 && !Static491.aBoolean618 || Static426.aBoolean561)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static48.aClass33_49.method797(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static48.aClass33_49.method797(0).length());
		} else if (local11.startsWith(Static48.aClass33_50.method797(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static48.aClass33_50.method797(0).length());
		} else if (local11.startsWith(Static48.aClass33_51.method797(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static48.aClass33_51.method797(0).length());
		} else if (local11.startsWith(Static48.aClass33_52.method797(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static48.aClass33_52.method797(0).length());
		} else if (local11.startsWith(Static48.aClass33_53.method797(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static48.aClass33_53.method797(0).length());
		} else if (local11.startsWith(Static48.aClass33_54.method797(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static48.aClass33_54.method797(0).length());
		} else if (local11.startsWith(Static48.aClass33_55.method797(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static48.aClass33_55.method797(0).length());
		} else if (local11.startsWith(Static48.aClass33_56.method797(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static48.aClass33_56.method797(0).length());
		} else if (local11.startsWith(Static48.aClass33_57.method797(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static48.aClass33_57.method797(0).length());
		} else if (local11.startsWith(Class33.lb.method797(0))) {
			local13 = 9;
			arg0 = arg0.substring(Class33.lb.method797(0).length());
		} else if (local11.startsWith(Static48.aClass33_58.method797(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static48.aClass33_58.method797(0).length());
		} else if (local11.startsWith(Static48.aClass33_59.method797(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static48.aClass33_59.method797(0).length());
		} else if (Static131.anInt2839 != 0) {
			if (local11.startsWith(Static48.aClass33_49.method797(Static131.anInt2839))) {
				local13 = 0;
				arg0 = arg0.substring(Static48.aClass33_49.method797(Static131.anInt2839).length());
			} else if (local11.startsWith(Static48.aClass33_50.method797(Static131.anInt2839))) {
				local13 = 1;
				arg0 = arg0.substring(Static48.aClass33_50.method797(Static131.anInt2839).length());
			} else if (local11.startsWith(Static48.aClass33_51.method797(Static131.anInt2839))) {
				local13 = 2;
				arg0 = arg0.substring(Static48.aClass33_51.method797(Static131.anInt2839).length());
			} else if (local11.startsWith(Static48.aClass33_52.method797(Static131.anInt2839))) {
				local13 = 3;
				arg0 = arg0.substring(Static48.aClass33_52.method797(Static131.anInt2839).length());
			} else if (local11.startsWith(Static48.aClass33_53.method797(Static131.anInt2839))) {
				local13 = 4;
				arg0 = arg0.substring(Static48.aClass33_53.method797(Static131.anInt2839).length());
			} else if (local11.startsWith(Static48.aClass33_54.method797(Static131.anInt2839))) {
				local13 = 5;
				arg0 = arg0.substring(Static48.aClass33_54.method797(Static131.anInt2839).length());
			} else if (local11.startsWith(Static48.aClass33_55.method797(Static131.anInt2839))) {
				local13 = 6;
				arg0 = arg0.substring(Static48.aClass33_55.method797(Static131.anInt2839).length());
			} else if (local11.startsWith(Static48.aClass33_56.method797(Static131.anInt2839))) {
				local13 = 7;
				arg0 = arg0.substring(Static48.aClass33_56.method797(Static131.anInt2839).length());
			} else if (local11.startsWith(Static48.aClass33_57.method797(Static131.anInt2839))) {
				local13 = 8;
				arg0 = arg0.substring(Static48.aClass33_57.method797(Static131.anInt2839).length());
			} else if (local11.startsWith(Class33.lb.method797(Static131.anInt2839))) {
				local13 = 9;
				arg0 = arg0.substring(Class33.lb.method797(Static131.anInt2839).length());
			} else if (local11.startsWith(Static48.aClass33_58.method797(Static131.anInt2839))) {
				local13 = 10;
				arg0 = arg0.substring(Static48.aClass33_58.method797(Static131.anInt2839).length());
			} else if (local11.startsWith(Static48.aClass33_59.method797(Static131.anInt2839))) {
				local13 = 11;
				arg0 = arg0.substring(Static48.aClass33_59.method797(Static131.anInt2839).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static48.aClass33_60.method797(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static48.aClass33_60.method797(0).length());
		} else if (local11.startsWith(Static48.aClass33_61.method797(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static48.aClass33_61.method797(0).length());
		} else if (local11.startsWith(Static48.aClass33_62.method797(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static48.aClass33_62.method797(0).length());
		} else if (local11.startsWith(Static48.aClass33_63.method797(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static48.aClass33_63.method797(0).length());
		} else if (local11.startsWith(Static48.aClass33_64.method797(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static48.aClass33_64.method797(0).length());
		} else if (Static131.anInt2839 != 0) {
			if (local11.startsWith(Static48.aClass33_60.method797(Static131.anInt2839))) {
				local451 = 1;
				arg0 = arg0.substring(Static48.aClass33_60.method797(Static131.anInt2839).length());
			} else if (local11.startsWith(Static48.aClass33_61.method797(Static131.anInt2839))) {
				local451 = 2;
				arg0 = arg0.substring(Static48.aClass33_61.method797(Static131.anInt2839).length());
			} else if (local11.startsWith(Static48.aClass33_62.method797(Static131.anInt2839))) {
				local451 = 3;
				arg0 = arg0.substring(Static48.aClass33_62.method797(Static131.anInt2839).length());
			} else if (local11.startsWith(Static48.aClass33_63.method797(Static131.anInt2839))) {
				local451 = 4;
				arg0 = arg0.substring(Static48.aClass33_63.method797(Static131.anInt2839).length());
			} else if (local11.startsWith(Static48.aClass33_64.method797(Static131.anInt2839))) {
				local451 = 5;
				arg0 = arg0.substring(Static48.aClass33_64.method797(Static131.anInt2839).length());
			}
		}
		@Pc(641) Class3_Sub34 local641 = Static374.method5522(Static421.aClass298_146, Static220.aClass287_2);
		local641.aClass3_Sub11_Sub1_2.method3079(0);
		@Pc(650) int local650 = local641.aClass3_Sub11_Sub1_2.anInt3520;
		local641.aClass3_Sub11_Sub1_2.method3079(local13);
		local641.aClass3_Sub11_Sub1_2.method3079(local451);
		Static111.method2346(local641.aClass3_Sub11_Sub1_2, arg0);
		local641.aClass3_Sub11_Sub1_2.method3127(local641.aClass3_Sub11_Sub1_2.anInt3520 - local650);
		Static131.method2572(local641);
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(IZ)V")
	public static void method2773() {
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(IZ)V")
	private static void method2774(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class3_Sub34 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray259[anInt3106++] = Static67.anInt1795;
				return;
			}
			if (arg0 == 5001) {
				anInt3106 -= 3;
				Static67.anInt1795 = anIntArray259[anInt3106];
				Static480.aClass265_5 = Static490.method6751(anIntArray259[anInt3106 + 1]);
				if (Static480.aClass265_5 == null) {
					Static480.aClass265_5 = Static73.aClass265_4;
				}
				Static347.anInt6098 = anIntArray259[anInt3106 + 2];
				local52 = Static374.method5522(Static85.aClass298_39, Static220.aClass287_2);
				local52.aClass3_Sub11_Sub1_2.method3079(Static67.anInt1795);
				local52.aClass3_Sub11_Sub1_2.method3079(Static480.aClass265_5.anInt6963);
				local52.aClass3_Sub11_Sub1_2.method3079(Static347.anInt6098);
				Static131.method2572(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt3110 -= 2;
				local83 = aStringArray15[anInt3110];
				local89 = aStringArray15[anInt3110 + 1];
				anInt3106 -= 2;
				local97 = anIntArray259[anInt3106];
				local103 = anIntArray259[anInt3106 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class3_Sub34 local125 = Static374.method5522(Static157.aClass298_62, Static220.aClass287_2);
				local125.aClass3_Sub11_Sub1_2.method3079(Static170.method2970(local83) + Static170.method2970(local89) + 2);
				local125.aClass3_Sub11_Sub1_2.method3136(local83);
				local125.aClass3_Sub11_Sub1_2.method3079(local97 - 1);
				local125.aClass3_Sub11_Sub1_2.method3079(local103);
				local125.aClass3_Sub11_Sub1_2.method3136(local89);
				Static131.method2572(local125);
				return;
			}
			@Pc(179) Class177 local179;
			if (arg0 == 5003) {
				local175 = anIntArray259[--anInt3106];
				local179 = Static248.method7731(local175);
				local181 = "";
				if (local179 != null && local179.aString66 != null) {
					local181 = local179.aString66;
				}
				aStringArray15[anInt3110++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray259[--anInt3106];
				local179 = Static248.method7731(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt4990;
				}
				anIntArray259[anInt3106++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static480.aClass265_5 == null) {
					anIntArray259[anInt3106++] = -1;
					return;
				}
				anIntArray259[anInt3106++] = Static480.aClass265_5.anInt6963;
				return;
			}
			@Pc(269) Class3_Sub34 local269;
			if (arg0 == 5006) {
				local175 = anIntArray259[--anInt3106];
				local269 = Static374.method5522(Static9.aClass298_4, Static220.aClass287_2);
				local269.aClass3_Sub11_Sub1_2.method3079(local175);
				Static131.method2572(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray15[--anInt3110];
				method2772(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt3110 -= 2;
				local83 = aStringArray15[anInt3110];
				local89 = aStringArray15[anInt3110 + 1];
				if (Static274.anInt5067 != 0 || (!Static203.aBoolean318 || Static491.aBoolean618) && !Static426.aBoolean561) {
					@Pc(328) Class3_Sub34 local328 = Static374.method5522(Static148.aClass298_61, Static220.aClass287_2);
					local328.aClass3_Sub11_Sub1_2.method3079(0);
					local103 = local328.aClass3_Sub11_Sub1_2.anInt3520;
					local328.aClass3_Sub11_Sub1_2.method3136(local83);
					Static111.method2346(local328.aClass3_Sub11_Sub1_2, local89);
					local328.aClass3_Sub11_Sub1_2.method3127(local328.aClass3_Sub11_Sub1_2.anInt3520 - local103);
					Static131.method2572(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray259[--anInt3106];
				local179 = Static248.method7731(local175);
				local181 = "";
				if (local179 != null && local179.aString67 != null) {
					local181 = local179.aString67;
				}
				aStringArray15[anInt3110++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray259[--anInt3106];
				local179 = Static248.method7731(local175);
				local181 = "";
				if (local179 != null && local179.aString69 != null) {
					local181 = local179.aString69;
				}
				aStringArray15[anInt3110++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray259[--anInt3106];
				local179 = Static248.method7731(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt4984;
				}
				anIntArray259[anInt3106++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 == null || Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aString95 == null) {
					local83 = Static412.aString100;
				} else {
					local83 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.method5577();
				}
				aStringArray15[anInt3110++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray259[anInt3106++] = Static347.anInt6098;
				return;
			}
			if (arg0 == 5017) {
				anIntArray259[anInt3106++] = Static432.method6082();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray259[--anInt3106];
				local179 = Static248.method7731(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt4989;
				}
				anIntArray259[anInt3106++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray259[--anInt3106];
				local179 = Static248.method7731(local175);
				local181 = "";
				if (local179 != null && local179.aString68 != null) {
					local181 = local179.aString68;
				}
				aStringArray15[anInt3110++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 == null || Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aString95 == null) {
					local83 = Static412.aString100;
				} else {
					local83 = Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.method5581();
				}
				aStringArray15[anInt3110++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray259[--anInt3106];
				local179 = Static248.method7731(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt4988;
				}
				anIntArray259[anInt3106++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray259[--anInt3106];
				local179 = Static248.method7731(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt4985;
				}
				anIntArray259[anInt3106++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray259[--anInt3106];
				local179 = Static248.method7731(local175);
				local181 = "";
				if (local179 != null && local179.aString65 != null) {
					local181 = local179.aString65;
				}
				aStringArray15[anInt3110++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray259[--anInt3106];
				aStringArray15[anInt3110++] = Static90.aClass22_1.method565(local175).aString21;
				return;
			}
			@Pc(736) Class3_Sub3_Sub6 local736;
			if (arg0 == 5051) {
				local175 = anIntArray259[--anInt3106];
				local736 = Static90.aClass22_1.method565(local175);
				if (local736.anIntArray88 == null) {
					anIntArray259[anInt3106++] = 0;
					return;
				}
				anIntArray259[anInt3106++] = local736.anIntArray88.length;
				return;
			}
			if (arg0 == 5052) {
				anInt3106 -= 2;
				local175 = anIntArray259[anInt3106];
				local776 = anIntArray259[anInt3106 + 1];
				@Pc(781) Class3_Sub3_Sub6 local781 = Static90.aClass22_1.method565(local175);
				local103 = local781.anIntArray88[local776];
				anIntArray259[anInt3106++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray259[--anInt3106];
				local736 = Static90.aClass22_1.method565(local175);
				if (local736.anIntArray89 == null) {
					anIntArray259[anInt3106++] = 0;
					return;
				}
				anIntArray259[anInt3106++] = local736.anIntArray89.length;
				return;
			}
			if (arg0 == 5054) {
				anInt3106 -= 2;
				local175 = anIntArray259[anInt3106];
				local776 = anIntArray259[anInt3106 + 1];
				anIntArray259[anInt3106++] = Static90.aClass22_1.method565(local175).anIntArray89[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray259[--anInt3106];
				aStringArray15[anInt3110++] = Static459.aClass290_1.method6377(local175).method7463();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray259[--anInt3106];
				@Pc(907) Class3_Sub3_Sub17 local907 = Static459.aClass290_1.method6377(local175);
				if (local907.anIntArray659 == null) {
					anIntArray259[anInt3106++] = 0;
					return;
				}
				anIntArray259[anInt3106++] = local907.anIntArray659.length;
				return;
			}
			if (arg0 == 5057) {
				anInt3106 -= 2;
				local175 = anIntArray259[anInt3106];
				local776 = anIntArray259[anInt3106 + 1];
				anIntArray259[anInt3106++] = Static459.aClass290_1.method6377(local175).anIntArray659[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass364_1 = new Class364();
				aClass364_1.anInt9356 = anIntArray259[--anInt3106];
				aClass364_1.aClass3_Sub3_Sub17_1 = Static459.aClass290_1.method6377(aClass364_1.anInt9356);
				aClass364_1.anIntArray697 = new int[aClass364_1.aClass3_Sub3_Sub17_1.method7455()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static374.method5522(Static443.aClass298_151, Static220.aClass287_2);
				local52.aClass3_Sub11_Sub1_2.method3079(0);
				local776 = local52.aClass3_Sub11_Sub1_2.anInt3520;
				local52.aClass3_Sub11_Sub1_2.method3079(0);
				local52.aClass3_Sub11_Sub1_2.method3131(aClass364_1.anInt9356);
				aClass364_1.aClass3_Sub3_Sub17_1.method7459(aClass364_1.anIntArray697, local52.aClass3_Sub11_Sub1_2);
				local52.aClass3_Sub11_Sub1_2.method3127(local52.aClass3_Sub11_Sub1_2.anInt3520 - local776);
				Static131.method2572(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray15[--anInt3110];
				local269 = Static374.method5522(Static103.aClass298_44, Static220.aClass287_2);
				local269.aClass3_Sub11_Sub1_2.method3079(0);
				local97 = local269.aClass3_Sub11_Sub1_2.anInt3520;
				local269.aClass3_Sub11_Sub1_2.method3136(local83);
				local269.aClass3_Sub11_Sub1_2.method3131(aClass364_1.anInt9356);
				aClass364_1.aClass3_Sub3_Sub17_1.method7459(aClass364_1.anIntArray697, local269.aClass3_Sub11_Sub1_2);
				local269.aClass3_Sub11_Sub1_2.method3127(local269.aClass3_Sub11_Sub1_2.anInt3520 - local97);
				Static131.method2572(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static374.method5522(Static443.aClass298_151, Static220.aClass287_2);
				local52.aClass3_Sub11_Sub1_2.method3079(0);
				local776 = local52.aClass3_Sub11_Sub1_2.anInt3520;
				local52.aClass3_Sub11_Sub1_2.method3079(1);
				local52.aClass3_Sub11_Sub1_2.method3131(aClass364_1.anInt9356);
				aClass364_1.aClass3_Sub3_Sub17_1.method7459(aClass364_1.anIntArray697, local52.aClass3_Sub11_Sub1_2);
				local52.aClass3_Sub11_Sub1_2.method3127(local52.aClass3_Sub11_Sub1_2.anInt3520 - local776);
				Static131.method2572(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt3106 -= 2;
				local175 = anIntArray259[anInt3106];
				local776 = anIntArray259[anInt3106 + 1];
				anIntArray259[anInt3106++] = Static90.aClass22_1.method565(local175).aCharArray4[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt3106 -= 2;
				local175 = anIntArray259[anInt3106];
				local776 = anIntArray259[anInt3106 + 1];
				anIntArray259[anInt3106++] = Static90.aClass22_1.method565(local175).aCharArray3[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt3106 -= 2;
				local175 = anIntArray259[anInt3106];
				local776 = anIntArray259[anInt3106 + 1];
				if (local776 == -1) {
					anIntArray259[anInt3106++] = -1;
					return;
				}
				anIntArray259[anInt3106++] = Static90.aClass22_1.method565(local175).method745((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt3106 -= 2;
				local175 = anIntArray259[anInt3106];
				local776 = anIntArray259[anInt3106 + 1];
				if (local776 == -1) {
					anIntArray259[anInt3106++] = -1;
					return;
				}
				anIntArray259[anInt3106++] = Static90.aClass22_1.method565(local175).method742((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray259[--anInt3106];
				anIntArray259[anInt3106++] = Static459.aClass290_1.method6377(local175).method7455();
				return;
			}
			if (arg0 == 5067) {
				anInt3106 -= 2;
				local175 = anIntArray259[anInt3106];
				local776 = anIntArray259[anInt3106 + 1];
				local97 = Static459.aClass290_1.method6377(local175).method7460(local776).anInt4461;
				anIntArray259[anInt3106++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt3106 -= 2;
				local175 = anIntArray259[anInt3106];
				local776 = anIntArray259[anInt3106 + 1];
				aClass364_1.anIntArray697[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt3106 -= 2;
				local175 = anIntArray259[anInt3106];
				local776 = anIntArray259[anInt3106 + 1];
				aClass364_1.anIntArray697[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt3106 -= 3;
				local175 = anIntArray259[anInt3106];
				local776 = anIntArray259[anInt3106 + 1];
				local97 = anIntArray259[anInt3106 + 2];
				@Pc(1448) Class3_Sub3_Sub17 local1448 = Static459.aClass290_1.method6377(local175);
				if (local1448.method7460(local776).anInt4461 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray259[anInt3106++] = local1448.method7458(local97, local776);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray15[--anInt3110];
				local1496 = anIntArray259[--anInt3106] == 1;
				Static107.method5736(local83, local1496);
				anIntArray259[anInt3106++] = Static586.anInt9337;
				return;
			}
			if (arg0 == 5072) {
				if (Static251.aShortArray108 != null && Static71.anInt1939 < Static586.anInt9337) {
					anIntArray259[anInt3106++] = Static251.aShortArray108[Static71.anInt1939++] & 0xFFFF;
					return;
				}
				anIntArray259[anInt3106++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static71.anInt1939 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static478.aClass127_1.method3276(86)) {
					anIntArray259[anInt3106++] = 1;
					return;
				}
				anIntArray259[anInt3106++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static478.aClass127_1.method3276(82)) {
					anIntArray259[anInt3106++] = 1;
					return;
				}
				anIntArray259[anInt3106++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static478.aClass127_1.method3276(81)) {
					anIntArray259[anInt3106++] = 1;
					return;
				}
				anIntArray259[anInt3106++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static467.method6465(anIntArray259[--anInt3106]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray259[anInt3106++] = Static417.method5999();
					return;
				}
				if (arg0 == 5205) {
					Static172.method2977(-1, anIntArray259[--anInt3106], -1, false);
					return;
				}
				@Pc(1696) Class3_Sub3_Sub3 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray259[--anInt3106];
					local1696 = Static284.method6625(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray259[anInt3106++] = -1;
						return;
					}
					anIntArray259[anInt3106++] = local1696.anInt241;
					return;
				}
				@Pc(1729) Class3_Sub3_Sub3 local1729;
				if (arg0 == 5207) {
					local1729 = Static284.method6646(anIntArray259[--anInt3106]);
					if (local1729 != null && local1729.aString9 != null) {
						aStringArray15[anInt3110++] = local1729.aString9;
						return;
					}
					aStringArray15[anInt3110++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray259[anInt3106++] = Static592.anInt9396;
					anIntArray259[anInt3106++] = Static474.anInt7706;
					return;
				}
				if (arg0 == 5209) {
					anIntArray259[anInt3106++] = Static319.anInt5778 + Static284.anInt7863;
					anIntArray259[anInt3106++] = Static236.anInt4460 + Static284.anInt7865;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray259[--anInt3106];
					local1696 = Static284.method6646(local175);
					if (local1696 == null) {
						anIntArray259[anInt3106++] = 0;
						anIntArray259[anInt3106++] = 0;
						return;
					}
					anIntArray259[anInt3106++] = local1696.anInt231 >> 14 & 0x3FFF;
					anIntArray259[anInt3106++] = local1696.anInt231 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray259[--anInt3106];
					local1696 = Static284.method6646(local175);
					if (local1696 == null) {
						anIntArray259[anInt3106++] = 0;
						anIntArray259[anInt3106++] = 0;
						return;
					}
					anIntArray259[anInt3106++] = local1696.anInt237 - local1696.anInt230;
					anIntArray259[anInt3106++] = local1696.anInt235 - local1696.anInt238;
					return;
				}
				@Pc(1919) Class3_Sub41 local1919;
				if (arg0 == 5212) {
					local1919 = Static360.method5382();
					if (local1919 == null) {
						anIntArray259[anInt3106++] = -1;
						anIntArray259[anInt3106++] = -1;
						return;
					}
					anIntArray259[anInt3106++] = local1919.anInt7163;
					local776 = local1919.anInt7160 << 28 | local1919.anInt7165 + Static284.anInt7863 << 14 | local1919.anInt7161 + Static284.anInt7865;
					anIntArray259[anInt3106++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static70.method7723();
					if (local1919 == null) {
						anIntArray259[anInt3106++] = -1;
						anIntArray259[anInt3106++] = -1;
						return;
					}
					anIntArray259[anInt3106++] = local1919.anInt7163;
					local776 = local1919.anInt7160 << 28 | local1919.anInt7165 + Static284.anInt7863 << 14 | local1919.anInt7161 + Static284.anInt7865;
					anIntArray259[anInt3106++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray259[--anInt3106];
					local1696 = Static332.method5132();
					if (local1696 != null) {
						local2067 = local1696.method249(local175 >> 14 & 0x3FFF, local175 & 0x3FFF, anIntArray262, local175 >> 28 & 0x3);
						if (local2067) {
							Static547.method7329(anIntArray262[2], anIntArray262[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt3106 -= 2;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					@Pc(2105) Class38 local2105 = Static284.method6629(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class3_Sub3_Sub3 local2112 = (Class3_Sub3_Sub3) local2105.method1070(); local2112 != null; local2112 = (Class3_Sub3_Sub3) local2105.method1072()) {
						if (local2112.anInt241 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray259[anInt3106++] = 1;
						return;
					}
					anIntArray259[anInt3106++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray259[--anInt3106];
					local1696 = Static284.method6646(local175);
					if (local1696 == null) {
						anIntArray259[anInt3106++] = -1;
						return;
					}
					anIntArray259[anInt3106++] = local1696.anInt233;
					return;
				}
				if (arg0 == 5220) {
					anIntArray259[anInt3106++] = Static277.anInt5091 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray259[--anInt3106];
					Static547.method7329(local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static332.method5132();
					if (local1729 != null) {
						local1496 = local1729.method246(anIntArray262, Static319.anInt5778 + Static284.anInt7863, Static236.anInt4460 + Static284.anInt7865);
						if (local1496) {
							anIntArray259[anInt3106++] = anIntArray262[1];
							anIntArray259[anInt3106++] = anIntArray262[2];
							return;
						}
						anIntArray259[anInt3106++] = -1;
						anIntArray259[anInt3106++] = -1;
						return;
					}
					anIntArray259[anInt3106++] = -1;
					anIntArray259[anInt3106++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt3106 -= 2;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					Static172.method2977(local776 & 0x3FFF, local175, local776 >> 14 & 0x3FFF, false);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray259[--anInt3106];
					local1696 = Static332.method5132();
					if (local1696 != null) {
						local2067 = local1696.method249(local175 >> 14 & 0x3FFF, local175 & 0x3FFF, anIntArray262, local175 >> 28 & 0x3);
						if (local2067) {
							anIntArray259[anInt3106++] = anIntArray262[1];
							anIntArray259[anInt3106++] = anIntArray262[2];
							return;
						}
						anIntArray259[anInt3106++] = -1;
						anIntArray259[anInt3106++] = -1;
						return;
					}
					anIntArray259[anInt3106++] = -1;
					anIntArray259[anInt3106++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray259[--anInt3106];
					local1696 = Static332.method5132();
					if (local1696 != null) {
						local2067 = local1696.method246(anIntArray262, local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
						if (local2067) {
							anIntArray259[anInt3106++] = anIntArray262[1];
							anIntArray259[anInt3106++] = anIntArray262[2];
							return;
						}
						anIntArray259[anInt3106++] = -1;
						anIntArray259[anInt3106++] = -1;
						return;
					}
					anIntArray259[anInt3106++] = -1;
					anIntArray259[anInt3106++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static264.method4331(anIntArray259[--anInt3106]);
					return;
				}
				if (arg0 == 5227) {
					anInt3106 -= 2;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					Static172.method2977(local776 & 0x3FFF, local175, local776 >> 14 & 0x3FFF, true);
					return;
				}
				if (arg0 == 5228) {
					Static239.aBoolean347 = anIntArray259[--anInt3106] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray259[anInt3106++] = Static239.aBoolean347 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray259[--anInt3106];
					Static452.method6296(local175);
					return;
				}
				@Pc(2625) Class3 local2625;
				if (arg0 == 5231) {
					anInt3106 -= 2;
					local175 = anIntArray259[anInt3106];
					local1496 = anIntArray259[anInt3106 + 1] == 1;
					if (Static97.aClass310_8 != null) {
						local2625 = Static97.aClass310_8.method6601((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method7812();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class3();
							Static97.aClass310_8.method6603(local2625, (long) local175);
						}
					}
					return;
				}
				@Pc(2667) Class3 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray259[--anInt3106];
					if (Static97.aClass310_8 != null) {
						local2667 = Static97.aClass310_8.method6601((long) local175);
						anIntArray259[anInt3106++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray259[anInt3106++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt3106 -= 2;
					local175 = anIntArray259[anInt3106];
					local1496 = anIntArray259[anInt3106 + 1] == 1;
					if (Static586.aClass310_40 != null) {
						local2625 = Static586.aClass310_40.method6601((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method7812();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class3();
							Static586.aClass310_40.method6603(local2625, (long) local175);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray259[--anInt3106];
					if (Static586.aClass310_40 != null) {
						local2667 = Static586.aClass310_40.method6601((long) local175);
						anIntArray259[anInt3106++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray259[anInt3106++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray259[anInt3106++] = Static284.aClass3_Sub3_Sub3_3 == null ? -1 : Static284.aClass3_Sub3_Sub3_3.anInt241;
					return;
				}
				if (arg0 == 5236) {
					anInt3106 -= 2;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static452.method6298(local175, local103, local97);
					if (local2833 < 0) {
						anIntArray259[anInt3106++] = -1;
						return;
					}
					anIntArray259[anInt3106++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static190.method3263();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt3106 -= 2;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					Static29.method547(local175, 3, local776, false);
					anIntArray259[anInt3106++] = Static311.aFrame2 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static311.aFrame2 != null) {
						Static29.method547(-1, Static278.aClass3_Sub13_Sub1_1.anInt5151, -1, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2917) Class54[] local2917 = Static392.method5756();
					anIntArray259[anInt3106++] = local2917.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray259[--anInt3106];
					@Pc(2941) Class54[] local2941 = Static392.method5756();
					anIntArray259[anInt3106++] = local2941[local175].anInt1990;
					anIntArray259[anInt3106++] = local2941[local175].anInt1988;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static278.aClass3_Sub13_Sub1_1.anInt5155;
					local776 = Static278.aClass3_Sub13_Sub1_1.anInt5158;
					local97 = -1;
					@Pc(2978) Class54[] local2978 = Static392.method5756();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class54 local2985 = local2978[local2833];
						if (local2985.anInt1990 == local175 && local2985.anInt1988 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray259[anInt3106++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray259[anInt3106++] = Static294.method4660();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray259[--anInt3106];
					if (local175 >= 1 && local175 <= 2) {
						Static29.method547(-1, local175, -1, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.anInt5151;
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray259[--anInt3106];
					if (local175 >= 1 && local175 <= 2) {
						Static278.aClass3_Sub13_Sub1_1.anInt5151 = local175;
						Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt3110 -= 2;
					local83 = aStringArray15[anInt3110];
					local89 = aStringArray15[anInt3110 + 1];
					local97 = anIntArray259[--anInt3106];
					@Pc(3124) Class3_Sub34 local3124 = Static374.method5522(Static240.aClass298_93, Static220.aClass287_2);
					local3124.aClass3_Sub11_Sub1_2.method3079(Static170.method2970(local83) + Static170.method2970(local89) + 1);
					local3124.aClass3_Sub11_Sub1_2.method3136(local83);
					local3124.aClass3_Sub11_Sub1_2.method3136(local89);
					local3124.aClass3_Sub11_Sub1_2.method3079(local97);
					Static131.method2572(local3124);
					return;
				}
				if (arg0 == 5401) {
					anInt3106 -= 2;
					Static438.aShortArray102[anIntArray259[anInt3106]] = (short) Static573.method7588(anIntArray259[anInt3106 + 1]);
					Static517.aClass145_1.method3795();
					Static517.aClass145_1.method3797();
					Static510.aClass284_2.method6285();
					Static121.method2508();
					return;
				}
				if (arg0 == 5405) {
					anInt3106 -= 2;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static110.anIntArrayArrayArray6[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt3106 -= 7;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1] << 1;
					local97 = anIntArray259[anInt3106 + 2];
					local103 = anIntArray259[anInt3106 + 3];
					local2833 = anIntArray259[anInt3106 + 4];
					@Pc(3262) int local3262 = anIntArray259[anInt3106 + 5];
					@Pc(3268) int local3268 = anIntArray259[anInt3106 + 6];
					if (local175 >= 0 && local175 < 2 && Static110.anIntArrayArrayArray6[local175] != null && local776 >= 0 && local776 < Static110.anIntArrayArrayArray6[local175].length) {
						Static110.anIntArrayArrayArray6[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3268 };
						Static110.anIntArrayArrayArray6[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3262 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static110.anIntArrayArrayArray6[anIntArray259[--anInt3106]].length >> 1;
					anIntArray259[anInt3106++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static311.aFrame2 != null) {
						Static29.method547(-1, Static278.aClass3_Sub13_Sub1_1.anInt5151, -1, false);
					}
					if (Static92.aFrame1 != null) {
						Static537.method3881();
						System.exit(0);
						return;
					}
					local83 = Static132.aString38 == null ? Static249.method4040() : Static132.aString38;
					Static303.method4768(local83, Static260.anInt4932 == 1, Static409.aClass221_6, false);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static65.aClass192_1 != null) {
						if (Static65.aClass192_1.anObject30 == null) {
							local83 = Static221.method5005(Static65.aClass192_1.anInt5187);
						} else {
							local83 = (String) Static65.aClass192_1.anObject30;
						}
					}
					aStringArray15[anInt3110++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray259[anInt3106++] = Static409.aClass221_6.aBoolean485 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static311.aFrame2 != null) {
						Static29.method547(-1, Static278.aClass3_Sub13_Sub1_1.anInt5151, -1, false);
					}
					local83 = aStringArray15[--anInt3110];
					local1496 = anIntArray259[--anInt3106] == 1;
					local181 = Static249.method4040() + local83;
					Static303.method4768(local181, Static260.anInt4932 == 1, Static409.aClass221_6, local1496);
					return;
				}
				if (arg0 == 5422) {
					anInt3110 -= 2;
					local83 = aStringArray15[anInt3110];
					local89 = aStringArray15[anInt3110 + 1];
					local97 = anIntArray259[--anInt3106];
					if (local83.length() > 0) {
						if (Static155.aStringArray20 == null) {
							Static155.aStringArray20 = new String[Static574.anIntArray678[Static227.aClass211_1.anInt5793]];
						}
						Static155.aStringArray20[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static387.aStringArray39 == null) {
							Static387.aStringArray39 = new String[Static574.anIntArray678[Static227.aClass211_1.anInt5793]];
						}
						Static387.aStringArray39[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray15[--anInt3110]);
					return;
				}
				if (arg0 == 5424) {
					anInt3106 -= 11;
					Static169.anInt3327 = anIntArray259[anInt3106];
					Static553.anInt8886 = anIntArray259[anInt3106 + 1];
					Static432.anInt7154 = anIntArray259[anInt3106 + 2];
					Static330.anInt5903 = anIntArray259[anInt3106 + 3];
					Static39.anInt934 = anIntArray259[anInt3106 + 4];
					Static42.anInt978 = anIntArray259[anInt3106 + 5];
					Static287.anInt5262 = anIntArray259[anInt3106 + 6];
					Static69.anInt1916 = anIntArray259[anInt3106 + 7];
					Static397.anInt6799 = anIntArray259[anInt3106 + 8];
					Static124.anInt3634 = anIntArray259[anInt3106 + 9];
					Static25.anInt591 = anIntArray259[anInt3106 + 10];
					Static171.aClass246_84.method5667(Static39.anInt934);
					Static171.aClass246_84.method5667(Static42.anInt978);
					Static171.aClass246_84.method5667(Static287.anInt5262);
					Static171.aClass246_84.method5667(Static69.anInt1916);
					Static171.aClass246_84.method5667(Static397.anInt6799);
					Static475.aClass46_30 = null;
					Static212.aClass46_9 = null;
					Static351.aClass46_14 = null;
					Static307.aClass46_12 = null;
					Static221.aClass46_13 = null;
					Static570.aClass46_34 = null;
					Static468.aClass46_29 = null;
					Static147.aClass46_7 = null;
					Static490.aBoolean625 = true;
					return;
				}
				if (arg0 == 5425) {
					Static582.method7701();
					Static490.aBoolean625 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt3106 -= 2;
					Static215.anInt4261 = anIntArray259[anInt3106];
					Static245.anInt4537 = anIntArray259[anInt3106 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt3106 -= 2;
					Static347.anInt6096 = anIntArray259[anInt3106 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt3106 -= 2;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					anIntArray259[anInt3106++] = Static192.method3298(local776, local175) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static456.method6797(false, aStringArray15[--anInt3110], false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static605.method6792("accountcreated", Static533.anApplet4);
						return;
					} catch (@Pc(3800) Throwable local3800) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static605.method6792("accountcreatestarted", Static533.anApplet4);
						return;
					} catch (@Pc(3811) Throwable local3811) {
						return;
					}
				}
				if (arg0 == 5432) {
					local83 = "";
					if (Static414.aClipboard1 != null) {
						@Pc(3823) Transferable local3823 = Static414.aClipboard1.getContents(null);
						if (local3823 != null) {
							try {
								local83 = (String) local3823.getTransferData(DataFlavor.stringFlavor);
								if (local83 == null) {
									local83 = "";
								}
							} catch (@Pc(3836) Exception local3836) {
							}
						}
					}
					aStringArray15[anInt3110++] = local83;
					return;
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt3106 -= 4;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					local97 = anIntArray259[anInt3106 + 2];
					local103 = anIntArray259[anInt3106 + 3];
					Static21.method441(local776 << 2, local97, local103, (local175 >> 14 & 0x3FFF) - Static529.anInt8344, false, (local175 & 0x3FFF) - Static463.anInt7588);
					return;
				}
				if (arg0 == 5501) {
					anInt3106 -= 4;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					local97 = anIntArray259[anInt3106 + 2];
					local103 = anIntArray259[anInt3106 + 3];
					Static81.method1774(local97, (local175 >> 14 & 0x3FFF) - Static529.anInt8344, local776 << 2, (local175 & 0x3FFF) - Static463.anInt7588, local103);
					return;
				}
				if (arg0 == 5502) {
					anInt3106 -= 6;
					local175 = anIntArray259[anInt3106];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static459.anInt7522 = local175;
					local776 = anIntArray259[anInt3106 + 1];
					if (local776 + 1 >= Static110.anIntArrayArrayArray6[Static459.anInt7522].length >> 1) {
						throw new RuntimeException();
					}
					Static266.anInt4987 = local776;
					Static140.anInt7942 = 0;
					Static454.anInt7435 = anIntArray259[anInt3106 + 2];
					Static536.anInt8401 = anIntArray259[anInt3106 + 3];
					local97 = anIntArray259[anInt3106 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static86.anInt2159 = local97;
					local103 = anIntArray259[anInt3106 + 5];
					if (local103 + 1 >= Static110.anIntArrayArrayArray6[Static86.anInt2159].length >> 1) {
						throw new RuntimeException();
					}
					Static327.anInt5878 = local103;
					Static446.anInt7363 = 3;
					Static205.anInt4130 = -1;
					Static471.anInt7695 = -1;
					return;
				}
				if (arg0 == 5503) {
					Static548.method7334();
					return;
				}
				if (arg0 == 5504) {
					anInt3106 -= 2;
					Static25.method462(anIntArray259[anInt3106 + 1], anIntArray259[anInt3106]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray259[anInt3106++] = (int) Static527.aFloat183 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray259[anInt3106++] = (int) Static439.aFloat151 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static68.method3622();
					return;
				}
				if (arg0 == 5508) {
					Static185.method3183();
					return;
				}
				if (arg0 == 5509) {
					Static292.method4649();
					return;
				}
				if (arg0 == 5510) {
					Static112.method2352();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray259[--anInt3106];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static529.anInt8344;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static400.anInt6818) {
						local776 = Static400.anInt6818;
					}
					local97 -= Static463.anInt7588;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static271.anInt5050) {
						local97 = Static271.anInt5050;
					}
					Static92.anInt2289 = (local776 << 9) + 256;
					Static383.anInt6591 = (local97 << 9) + 256;
					Static446.anInt7363 = 4;
					Static205.anInt4130 = -1;
					Static471.anInt7695 = -1;
					return;
				}
				if (arg0 == 5512) {
					Static501.method6761();
					return;
				}
				if (arg0 == 5517) {
					local175 = anIntArray259[--anInt3106];
					if (local175 == -1) {
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static529.anInt8344;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static400.anInt6818) {
							local776 = Static400.anInt6818;
						}
						local97 -= Static463.anInt7588;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static271.anInt5050) {
							local97 = Static271.anInt5050;
						}
						Static471.anInt7695 = (local776 << 9) + 256;
						Static205.anInt4130 = (local97 << 9) + 256;
						return;
					}
					Static471.anInt7695 = -1;
					Static205.anInt4130 = -1;
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt3110 -= 2;
					local83 = aStringArray15[anInt3110];
					local89 = aStringArray15[anInt3110 + 1];
					local97 = anIntArray259[--anInt3106];
					if (Static246.anInt4542 != 3) {
						return;
					}
					if (Static582.anInt9301 == 0 && Static144.anInt3061 == 0) {
						Static412.aString100 = local83;
						Static594.aString129 = local89;
						Static490.anInt7979 = local97;
						Static113.method2374(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static551.method7381();
					return;
				}
				if (arg0 == 5602) {
					if (Static582.anInt9301 == 0) {
						Static13.anInt6202 = -2;
						Static254.anInt4588 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt3106 -= 4;
					if (Static246.anInt4542 != 3) {
						return;
					}
					if (Static582.anInt9301 == 0 && Static144.anInt3061 == 0) {
						Static80.method7518(anIntArray259[anInt3106 + 1], anIntArray259[anInt3106 + 3], anIntArray259[anInt3106], anIntArray259[anInt3106 + 2]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt3110--;
					if (Static246.anInt4542 != 3) {
						return;
					}
					if (Static582.anInt9301 == 0 && Static144.anInt3061 == 0) {
						Static338.method5165(Static248.method7734(aStringArray15[anInt3110]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt3110 -= 2;
					if (Static246.anInt4542 != 3) {
						return;
					}
					if (Static582.anInt9301 == 0 && Static144.anInt3061 == 0) {
						Static569.method7557(aStringArray15[anInt3110 + 1], false, Static248.method7734(aStringArray15[anInt3110]));
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static144.anInt3061 == 0) {
						Static5.anInt98 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray259[anInt3106++] = Static254.anInt4588;
					return;
				}
				if (arg0 == 5608) {
					anIntArray259[anInt3106++] = Static138.anInt2947;
					return;
				}
				if (arg0 == 5609) {
					anIntArray259[anInt3106++] = Static5.anInt98;
					return;
				}
				if (arg0 == 5610) {
					for (local175 = 0; local175 < 5; local175++) {
						aStringArray15[anInt3110++] = Static492.aStringArray35 == null || Static492.aStringArray35.length <= local175 ? "" : Static501.method6760(Static492.aStringArray35[local175]);
					}
					Static492.aStringArray35 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray259[anInt3106++] = Static462.anInt7552;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray259[--anInt3106];
					if (Static246.anInt4542 != 7) {
						return;
					}
					if (Static582.anInt9301 == 0 && Static144.anInt3061 == 0) {
						if (Static78.aClass152_2 != null) {
							Static78.aClass152_2.method3908();
							Static78.aClass152_2 = null;
						}
						Static490.anInt7979 = local175;
						Static113.method2374(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray259[anInt3106++] = Static254.anInt4588;
					return;
				}
				if (arg0 == 5615) {
					anInt3110 -= 2;
					local83 = aStringArray15[anInt3110];
					local89 = aStringArray15[anInt3110 + 1];
					if (Static246.anInt4542 != 3) {
						return;
					}
					if (Static582.anInt9301 == 0 && Static144.anInt3061 == 0) {
						if (Static78.aClass152_2 != null) {
							Static78.aClass152_2.method3908();
							Static78.aClass152_2 = null;
						}
						Static412.aString100 = local83;
						Static594.aString129 = local89;
						Static113.method2374(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static429.method6073(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray259[anInt3106++] = Static13.anInt6202;
					return;
				}
				if (arg0 == 5618) {
					local175 = anIntArray259[--anInt3106];
					Static175.method3038(false, local175);
					return;
				}
				if (arg0 == 5619) {
					local175 = anIntArray259[--anInt3106];
					Static175.method3038(true, local175);
					return;
				}
				if (arg0 == 5620) {
					Static405.method5875();
					if (Static113.aString36 != "" && Static113.aString36 != "") {
						anIntArray259[anInt3106++] = 1;
						return;
					}
					anIntArray259[anInt3106++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt3110 -= 2;
					if (Static246.anInt4542 != 3) {
						return;
					}
					if (Static582.anInt9301 == 0 && Static144.anInt3061 == 0) {
						Static569.method7557(aStringArray15[anInt3110 + 1], true, Static248.method7734(aStringArray15[anInt3110]));
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4719) Class192 local4719 = Static409.aClass221_6.method5200("3", false);
					while (local4719.anInt5186 == 0) {
						Static374.method5521(1L);
					}
					if (local4719.anInt5186 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4739) Class235 local4739 = (Class235) local4719.anObject30;
					if (local4739.method5485().exists()) {
						@Pc(4749) Class3_Sub11 local4749 = new Class3_Sub11(50);
						try {
							local4739.method5486(local4749.aByteArray36, 50, 0);
						} catch (@Pc(4758) IOException local4758) {
						}
					}
					try {
						local4739.method5488();
						return;
					} catch (@Pc(4764) Exception local4764) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static148.aString42 != null) {
						anIntArray259[anInt3106++] = 1;
						return;
					}
					anIntArray259[anInt3106++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray259[anInt3106++] = (int) (Static513.aLong237 >> 32);
					anIntArray259[anInt3106++] = (int) (Static513.aLong237 & 0xFFFFL);
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray259[--anInt3106];
					if (local175 < 1) {
						local175 = 1;
					}
					if (local175 > 4) {
						local175 = 4;
					}
					Static278.aClass3_Sub13_Sub1_1.anInt5148 = local175;
					Static447.method6262();
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6002) {
					Static278.aClass3_Sub13_Sub1_1.method4479(anIntArray259[--anInt3106] == 1);
					Static447.method6262();
					Static48.method799();
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6003) {
					Static278.aClass3_Sub13_Sub1_1.aBoolean403 = anIntArray259[--anInt3106] == 1;
					Static48.method799();
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6005) {
					Static278.aClass3_Sub13_Sub1_1.aBoolean413 = anIntArray259[--anInt3106] == 1;
					Static447.method6262();
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6006) {
					Static278.aClass3_Sub13_Sub1_1.aBoolean409 = anIntArray259[--anInt3106] == 1;
					Static4.aClass43_1.method7195(!Static278.aClass3_Sub13_Sub1_1.aBoolean409);
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6007) {
					Static278.aClass3_Sub13_Sub1_1.anInt5133 = anIntArray259[--anInt3106];
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6008) {
					Static278.aClass3_Sub13_Sub1_1.aBoolean402 = anIntArray259[--anInt3106] == 1;
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6009) {
					Static278.aClass3_Sub13_Sub1_1.aBoolean398 = anIntArray259[--anInt3106] == 1;
					Static447.method6262();
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6010) {
					Static278.aClass3_Sub13_Sub1_1.aBoolean400 = anIntArray259[--anInt3106] == 1;
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6011) {
					local175 = anIntArray259[--anInt3106];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static278.aClass3_Sub13_Sub1_1.method4456(local175, Static260.anInt4932);
					Static447.method6262();
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6012) {
					Static278.aClass3_Sub13_Sub1_1.method4463(Static260.anInt4932, anIntArray259[--anInt3106] == 1);
					Static385.method5693();
					Static578.method7669();
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6014) {
					Static278.aClass3_Sub13_Sub1_1.aBoolean404 = anIntArray259[--anInt3106] == 1;
					Static447.method6262();
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6015) {
					Static278.aClass3_Sub13_Sub1_1.aBoolean399 = anIntArray259[--anInt3106] == 1;
					Static447.method6262();
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6016) {
					local175 = anIntArray259[--anInt3106];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static278.aClass3_Sub13_Sub1_1.anInt5159 = local175;
					Static137.method2648(Static260.anInt4932);
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					return;
				}
				if (arg0 == 6017) {
					Static278.aClass3_Sub13_Sub1_1.aBoolean411 = anIntArray259[--anInt3106] == 1;
					Static410.method5907();
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6018) {
					local175 = anIntArray259[--anInt3106];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static278.aClass3_Sub13_Sub1_1.anInt5153 = local175;
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray259[--anInt3106];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static278.aClass3_Sub13_Sub1_1.anInt5154) {
						if (Static278.aClass3_Sub13_Sub1_1.anInt5154 == 0 && Static380.anInt6546 != -1) {
							Static437.method6178(Static576.aClass246_267, local175, Static380.anInt6546);
							Static127.aBoolean238 = false;
						} else if (local175 == 0) {
							Static245.method4020();
							Static127.aBoolean238 = false;
						} else {
							Static555.method7396(local175);
						}
						Static278.aClass3_Sub13_Sub1_1.anInt5154 = local175;
					}
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6020) {
					local175 = anIntArray259[--anInt3106];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static278.aClass3_Sub13_Sub1_1.anInt5139 = local175;
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6021) {
					Static278.aClass3_Sub13_Sub1_1.aBoolean416 = anIntArray259[--anInt3106] == 1;
					Static48.method799();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray259[--anInt3106];
					local1496 = false;
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 2) {
						local175 = 2;
					}
					if (Static597.anInt9433 < 96) {
						local175 = 0;
						local1496 = true;
					}
					Static75.method1683(local175);
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					anIntArray259[anInt3106++] = local1496 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local175 = anIntArray259[--anInt3106];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static278.aClass3_Sub13_Sub1_1.anInt5145 = local175;
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					return;
				}
				if (arg0 == 6025) {
					local175 = anIntArray259[--anInt3106];
					if (local175 < 0 || local175 > Static462.method6403(Static597.anInt9433)) {
						local175 = 0;
					}
					Static278.aClass3_Sub13_Sub1_1.anInt5161 = local175;
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray259[--anInt3106];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static531.method7010(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static278.aClass3_Sub13_Sub1_1.aBoolean405 = anIntArray259[--anInt3106] != 0;
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					return;
				}
				if (arg0 == 6029) {
					Static278.aClass3_Sub13_Sub1_1.anInt5133 = anIntArray259[--anInt3106];
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					return;
				}
				if (arg0 == 6030) {
					Static278.aClass3_Sub13_Sub1_1.aBoolean412 = anIntArray259[--anInt3106] != 0;
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static447.method6262();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray259[--anInt3106];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static137.method2648(local175);
					return;
				}
				if (arg0 == 6032) {
					local175 = anIntArray259[--anInt3106];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static278.aClass3_Sub13_Sub1_1.anInt5130 = local175;
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6033) {
					local175 = anIntArray259[--anInt3106];
					if (local175 < 0 || local175 > 4) {
						local175 = 2;
					}
					Static278.aClass3_Sub13_Sub1_1.anInt5162 = local175;
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					return;
				}
				if (arg0 == 6034) {
					Static278.aClass3_Sub13_Sub1_1.aBoolean410 = anIntArray259[--anInt3106] == 1;
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static385.method5693();
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6035) {
					Static278.aClass3_Sub13_Sub1_1.aBoolean417 = anIntArray259[--anInt3106] == 1;
					Static447.method6262();
					Static48.method799();
					return;
				}
				if (arg0 == 6036) {
					local175 = anIntArray259[--anInt3106];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static278.aClass3_Sub13_Sub1_1.method4477(local175);
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					return;
				}
				if (arg0 == 6037) {
					local175 = anIntArray259[--anInt3106];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static278.aClass3_Sub13_Sub1_1.anInt5135 = local175;
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray259[--anInt3106];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static278.aClass3_Sub13_Sub1_1.anInt5131 && Static380.anInt6546 == Static132.anInt2841) {
						if (Static278.aClass3_Sub13_Sub1_1.anInt5131 == 0) {
							Static437.method6178(Static576.aClass246_267, local175, Static380.anInt6546);
							Static127.aBoolean238 = false;
						} else if (local175 == 0) {
							Static245.method4020();
							Static127.aBoolean238 = false;
						} else {
							Static555.method7396(local175);
						}
					}
					Static278.aClass3_Sub13_Sub1_1.anInt5131 = local175;
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray259[--anInt3106];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static278.aClass3_Sub13_Sub1_1.anInt5134) {
						Static278.aClass3_Sub13_Sub1_1.anInt5134 = local175;
						Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
						Static529.aBoolean647 = false;
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.anInt5148;
					return;
				}
				if (arg0 == 6102) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.method4471(Static260.anInt4932) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.aBoolean403 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.aBoolean413 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.aBoolean409 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.anInt5133;
					return;
				}
				if (arg0 == 6108) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.aBoolean402 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.aBoolean398 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.aBoolean400 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.method4464(Static260.anInt4932);
					return;
				}
				if (arg0 == 6112) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.method4457(Static260.anInt4932) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.aBoolean404 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.aBoolean399 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.anInt5159;
					return;
				}
				if (arg0 == 6117) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.aBoolean411 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.anInt5153;
					return;
				}
				if (arg0 == 6119) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.anInt5154;
					return;
				}
				if (arg0 == 6120) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.anInt5139;
					return;
				}
				if (arg0 == 6121) {
					anIntArray259[anInt3106++] = Static4.aClass43_1.method7172() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray259[anInt3106++] = Static564.method7499();
					return;
				}
				if (arg0 == 6124) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.anInt5145;
					return;
				}
				if (arg0 == 6125) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.anInt5161;
					return;
				}
				if (arg0 == 6126) {
					anIntArray259[anInt3106++] = Static4.aClass43_1.method7146() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.aBoolean408 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.aBoolean405 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.anInt5133;
					return;
				}
				if (arg0 == 6130) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.aBoolean412 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray259[anInt3106++] = Static260.anInt4932;
					return;
				}
				if (arg0 == 6132) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.anInt5130;
					return;
				}
				if (arg0 == 6133) {
					anIntArray259[anInt3106++] = Static409.aClass221_6.aBoolean485 && !Static409.aClass221_6.aBoolean483 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray259[anInt3106++] = Static462.method6403(Static597.anInt9433);
					return;
				}
				if (arg0 == 6135) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.anInt5162;
					return;
				}
				if (arg0 == 6136) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.aBoolean410 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(6352) boolean local6352 = true;
					try {
						local6352 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(6362) Throwable local6362) {
					}
					anIntArray259[anInt3106++] = local6352 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray259[anInt3106++] = Static109.method2274(Static260.anInt4932, 200);
					return;
				}
				if (arg0 == 6139) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.method4483(Static260.anInt4932);
					return;
				}
				if (arg0 == 6140) {
					@Pc(6410) byte local6410 = 0;
					if (Static345.method5249(Static260.anInt4932) && Static597.anInt9433 < 96) {
						local6410 = 1;
					}
					anIntArray259[anInt3106++] = local6410;
					return;
				}
				if (arg0 == 6141) {
					if (Static597.anInt9433 < 96) {
						anIntArray259[anInt3106++] = 0;
						return;
					}
					anIntArray259[anInt3106++] = 2;
					return;
				}
				if (arg0 == 6142) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.anInt5135;
					return;
				}
				if (arg0 == 6143) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.anInt5131;
					return;
				}
				if (arg0 == 6144) {
					anIntArray259[anInt3106++] = Static211.aBoolean324 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.anInt5134;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt3106 -= 2;
					Static92.aShort30 = (short) anIntArray259[anInt3106];
					if (Static92.aShort30 <= 0) {
						Static92.aShort30 = 256;
					}
					Static282.aShort63 = (short) anIntArray259[anInt3106 + 1];
					if (Static282.aShort63 <= 0) {
						Static282.aShort63 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt3106 -= 2;
					Static477.aShort107 = (short) anIntArray259[anInt3106];
					if (Static477.aShort107 <= 0) {
						Static477.aShort107 = 256;
					}
					Static128.aShort41 = (short) anIntArray259[anInt3106 + 1];
					if (Static128.aShort41 <= 0) {
						Static128.aShort41 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt3106 -= 4;
					Static427.aShort96 = (short) anIntArray259[anInt3106];
					if (Static427.aShort96 <= 0) {
						Static427.aShort96 = 1;
					}
					Static515.aShort45 = (short) anIntArray259[anInt3106 + 1];
					if (Static515.aShort45 <= 0) {
						Static515.aShort45 = 32767;
					} else if (Static515.aShort45 < Static427.aShort96) {
						Static515.aShort45 = Static427.aShort96;
					}
					Static530.aShort111 = (short) anIntArray259[anInt3106 + 2];
					if (Static530.aShort111 <= 0) {
						Static530.aShort111 = 1;
					}
					Static422.aShort95 = (short) anIntArray259[anInt3106 + 3];
					if (Static422.aShort95 <= 0) {
						Static422.aShort95 = 32767;
						return;
					}
					if (Static422.aShort95 < Static530.aShort111) {
						Static422.aShort95 = Static530.aShort111;
					}
					return;
				}
				if (arg0 == 6203) {
					Static557.method7421(Static222.aClass203_153.anInt5513, 0, 0, Static222.aClass203_153.anInt5476, false);
					anIntArray259[anInt3106++] = Static588.anInt2856;
					anIntArray259[anInt3106++] = Static446.anInt7361;
					return;
				}
				if (arg0 == 6204) {
					anIntArray259[anInt3106++] = Static477.aShort107;
					anIntArray259[anInt3106++] = Static128.aShort41;
					return;
				}
				if (arg0 == 6205) {
					anIntArray259[anInt3106++] = Static92.aShort30;
					anIntArray259[anInt3106++] = Static282.aShort63;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray259[anInt3106++] = (int) (Static587.method7753() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray259[anInt3106++] = (int) (Static587.method7753() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt3106 -= 3;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					local97 = anIntArray259[anInt3106 + 2];
					aCalendar1.clear();
					aCalendar1.set(11, 12);
					aCalendar1.set(local97, local776, local175);
					local103 = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray259[anInt3106++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar1.clear();
					aCalendar1.setTime(new Date(Static587.method7753()));
					anIntArray259[anInt3106++] = aCalendar1.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray259[--anInt3106];
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
					anIntArray259[anInt3106++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray259[anInt3106++] = Static59.method4461() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray259[anInt3106++] = Static150.method2783() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static246.anInt4542 == 7 && Static582.anInt9301 == 0 && Static144.anInt3061 == 0) {
						if (Static176.aBoolean273) {
							anIntArray259[anInt3106++] = 0;
							return;
						}
						if (Static255.aLong136 > Static587.method7753() - 1000L) {
							anIntArray259[anInt3106++] = 1;
							return;
						}
						Static176.aBoolean273 = true;
						local52 = Static374.method5522(Static87.aClass298_42, Static220.aClass287_2);
						local52.aClass3_Sub11_Sub1_2.method3101(Static449.anInt7388);
						Static131.method2572(local52);
						anIntArray259[anInt3106++] = 0;
						return;
					}
					anIntArray259[anInt3106++] = 1;
					return;
				}
				@Pc(7033) Class171 local7033;
				@Pc(7000) Class133_Sub1 local7000;
				if (arg0 == 6501) {
					local7000 = Static544.method7135();
					if (local7000 != null) {
						anIntArray259[anInt3106++] = local7000.anInt4101;
						anIntArray259[anInt3106++] = local7000.anInt4097;
						aStringArray15[anInt3110++] = local7000.aString49;
						local7033 = local7000.method3649();
						anIntArray259[anInt3106++] = local7033.anInt4927;
						aStringArray15[anInt3110++] = local7033.aString64;
						anIntArray259[anInt3106++] = local7000.anInt4090;
						anIntArray259[anInt3106++] = local7000.anInt4104;
						aStringArray15[anInt3110++] = local7000.aString50;
						return;
					}
					anIntArray259[anInt3106++] = -1;
					anIntArray259[anInt3106++] = 0;
					aStringArray15[anInt3110++] = "";
					anIntArray259[anInt3106++] = 0;
					aStringArray15[anInt3110++] = "";
					anIntArray259[anInt3106++] = 0;
					anIntArray259[anInt3106++] = 0;
					aStringArray15[anInt3110++] = "";
					return;
				}
				if (arg0 == 6502) {
					local7000 = Static230.method3914();
					if (local7000 != null) {
						anIntArray259[anInt3106++] = local7000.anInt4101;
						anIntArray259[anInt3106++] = local7000.anInt4097;
						aStringArray15[anInt3110++] = local7000.aString49;
						local7033 = local7000.method3649();
						anIntArray259[anInt3106++] = local7033.anInt4927;
						aStringArray15[anInt3110++] = local7033.aString64;
						anIntArray259[anInt3106++] = local7000.anInt4090;
						anIntArray259[anInt3106++] = local7000.anInt4104;
						aStringArray15[anInt3110++] = local7000.aString50;
						return;
					}
					anIntArray259[anInt3106++] = -1;
					anIntArray259[anInt3106++] = 0;
					aStringArray15[anInt3110++] = "";
					anIntArray259[anInt3106++] = 0;
					aStringArray15[anInt3110++] = "";
					anIntArray259[anInt3106++] = 0;
					anIntArray259[anInt3106++] = 0;
					aStringArray15[anInt3110++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray259[--anInt3106];
					local89 = aStringArray15[--anInt3110];
					if (Static246.anInt4542 == 7 && Static582.anInt9301 == 0 && Static144.anInt3061 == 0) {
						anIntArray259[anInt3106++] = Static19.method419(local175, local89) ? 1 : 0;
						return;
					}
					anIntArray259[anInt3106++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static278.aClass3_Sub13_Sub1_1.anInt5150 = anIntArray259[--anInt3106];
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					return;
				}
				if (arg0 == 6505) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.anInt5150;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray259[--anInt3106];
					@Pc(7390) Class133_Sub1 local7390 = Static48.method798(local175);
					if (local7390 != null) {
						anIntArray259[anInt3106++] = local7390.anInt4097;
						aStringArray15[anInt3110++] = local7390.aString49;
						@Pc(7414) Class171 local7414 = local7390.method3649();
						anIntArray259[anInt3106++] = local7414.anInt4927;
						aStringArray15[anInt3110++] = local7414.aString64;
						anIntArray259[anInt3106++] = local7390.anInt4090;
						anIntArray259[anInt3106++] = local7390.anInt4104;
						aStringArray15[anInt3110++] = local7390.aString50;
						return;
					}
					anIntArray259[anInt3106++] = -1;
					aStringArray15[anInt3110++] = "";
					anIntArray259[anInt3106++] = 0;
					aStringArray15[anInt3110++] = "";
					anIntArray259[anInt3106++] = 0;
					anIntArray259[anInt3106++] = 0;
					aStringArray15[anInt3110++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt3106 -= 4;
					local175 = anIntArray259[anInt3106];
					local1496 = anIntArray259[anInt3106 + 1] == 1;
					local97 = anIntArray259[anInt3106 + 2];
					local2107 = anIntArray259[anInt3106 + 3] == 1;
					Static246.method4027(local2107, local97, local175, local1496);
					return;
				}
				if (arg0 == 6508) {
					Static427.method6071();
					return;
				}
				if (arg0 == 6509) {
					if (Static246.anInt4542 != 7) {
						return;
					}
					Static492.aBoolean481 = anIntArray259[--anInt3106] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray259[anInt3106++] = Static541.anInt8510;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static278.aClass3_Sub13_Sub1_1.lb = anIntArray259[--anInt3106] == 1;
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					return;
				}
				if (arg0 == 6601) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.lb ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static181.aClass215_3 == Static180.aClass215_2) {
				if (arg0 == 6700) {
					local175 = Static227.aClass310_15.method6608();
					if (Static307.anInt5578 != -1) {
						local175++;
					}
					anIntArray259[anInt3106++] = local175;
					return;
				}
				if (arg0 == 6701) {
					local175 = anIntArray259[--anInt3106];
					if (Static307.anInt5578 != -1) {
						if (local175 == 0) {
							anIntArray259[anInt3106++] = Static307.anInt5578;
							return;
						}
						local175--;
					}
					@Pc(7701) Class3_Sub28 local7701 = (Class3_Sub28) Static227.aClass310_15.method6602();
					while (local175-- > 0) {
						local7701 = (Class3_Sub28) Static227.aClass310_15.method6599();
					}
					anIntArray259[anInt3106++] = local7701.anInt5333;
					return;
				}
				if (arg0 == 6702) {
					local175 = anIntArray259[--anInt3106];
					if (Static59.aClass203ArrayArray3[local175] == null) {
						aStringArray15[anInt3110++] = "";
						return;
					}
					local89 = Static59.aClass203ArrayArray3[local175][0].aString74;
					if (local89 == null) {
						aStringArray15[anInt3110++] = "";
						return;
					}
					aStringArray15[anInt3110++] = local89.substring(0, local89.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local175 = anIntArray259[--anInt3106];
					if (Static59.aClass203ArrayArray3[local175] == null) {
						anIntArray259[anInt3106++] = 0;
						return;
					}
					anIntArray259[anInt3106++] = Static59.aClass203ArrayArray3[local175].length;
					return;
				}
				if (arg0 == 6704) {
					anInt3106 -= 2;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					if (Static59.aClass203ArrayArray3[local175] == null) {
						aStringArray15[anInt3110++] = "";
						return;
					}
					local181 = Static59.aClass203ArrayArray3[local175][local776].aString74;
					if (local181 == null) {
						aStringArray15[anInt3110++] = "";
						return;
					}
					aStringArray15[anInt3110++] = local181;
					return;
				}
				if (arg0 == 6705) {
					anInt3106 -= 2;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					if (Static59.aClass203ArrayArray3[local175] == null) {
						anIntArray259[anInt3106++] = 0;
						return;
					}
					anIntArray259[anInt3106++] = Static59.aClass203ArrayArray3[local175][local776].anInt5492;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt3106 -= 3;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					local97 = anIntArray259[anInt3106 + 2];
					Static207.method3701("", local97, 1, local175 << 16 | local776);
					return;
				}
				if (arg0 == 6708) {
					anInt3106 -= 3;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					local97 = anIntArray259[anInt3106 + 2];
					Static207.method3701("", local97, 2, local175 << 16 | local776);
					return;
				}
				if (arg0 == 6709) {
					anInt3106 -= 3;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					local97 = anIntArray259[anInt3106 + 2];
					Static207.method3701("", local97, 3, local175 << 16 | local776);
					return;
				}
				if (arg0 == 6710) {
					anInt3106 -= 3;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					local97 = anIntArray259[anInt3106 + 2];
					Static207.method3701("", local97, 4, local175 << 16 | local776);
					return;
				}
				if (arg0 == 6711) {
					anInt3106 -= 3;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					local97 = anIntArray259[anInt3106 + 2];
					Static207.method3701("", local97, 5, local175 << 16 | local776);
					return;
				}
				if (arg0 == 6712) {
					anInt3106 -= 3;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					local97 = anIntArray259[anInt3106 + 2];
					Static207.method3701("", local97, 6, local175 << 16 | local776);
					return;
				}
				if (arg0 == 6713) {
					anInt3106 -= 3;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					local97 = anIntArray259[anInt3106 + 2];
					Static207.method3701("", local97, 7, local175 << 16 | local776);
					return;
				}
				if (arg0 == 6714) {
					anInt3106 -= 3;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					local97 = anIntArray259[anInt3106 + 2];
					Static207.method3701("", local97, 8, local175 << 16 | local776);
					return;
				}
				if (arg0 == 6715) {
					anInt3106 -= 3;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					local97 = anIntArray259[anInt3106 + 2];
					Static207.method3701("", local97, 9, local175 << 16 | local776);
					return;
				}
				if (arg0 == 6716) {
					anInt3106 -= 3;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					local97 = anIntArray259[anInt3106 + 2];
					Static207.method3701("", local97, 10, local175 << 16 | local776);
					return;
				}
				if (arg0 == 6717) {
					anInt3106 -= 3;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					local97 = anIntArray259[anInt3106 + 2];
					@Pc(8289) Class203 local8289 = Static582.method7699(local175 << 16 | local776, local97);
					Static103.method2177();
					@Pc(8294) Class3_Sub10 local8294 = Static69.method1651(local8289);
					Static80.method7505(local8294.method571(), local8294.anInt723, local8289);
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(8322) Class40 local8322;
				if (arg0 == 6800) {
					local175 = anIntArray259[--anInt3106];
					local8322 = Static191.aClass168_2.method4062(local175);
					if (local8322.aString25 == null) {
						aStringArray15[anInt3110++] = "";
						return;
					}
					aStringArray15[anInt3110++] = local8322.aString25;
					return;
				}
				if (arg0 == 6801) {
					local175 = anIntArray259[--anInt3106];
					local8322 = Static191.aClass168_2.method4062(local175);
					anIntArray259[anInt3106++] = local8322.anInt1385;
					return;
				}
				if (arg0 == 6802) {
					local175 = anIntArray259[--anInt3106];
					local8322 = Static191.aClass168_2.method4062(local175);
					anIntArray259[anInt3106++] = local8322.anInt1380;
					return;
				}
				if (arg0 == 6803) {
					local175 = anIntArray259[--anInt3106];
					local8322 = Static191.aClass168_2.method4062(local175);
					anIntArray259[anInt3106++] = local8322.anInt1395;
					return;
				}
				if (arg0 == 6804) {
					anInt3106 -= 2;
					local175 = anIntArray259[anInt3106];
					local776 = anIntArray259[anInt3106 + 1];
					@Pc(8444) Class14 local8444 = Static69.aClass118_1.method3019(local776);
					if (local8444.method434()) {
						aStringArray15[anInt3110++] = Static191.aClass168_2.method4062(local175).method1116(local8444.aString14, local776);
						return;
					}
					anIntArray259[anInt3106++] = Static191.aClass168_2.method4062(local175).method1119(local8444.anInt534, local776);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray259[anInt3106++] = Static203.aBoolean318 && !Static491.aBoolean618 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray259[anInt3106++] = Static460.anInt7528;
					return;
				}
				if (arg0 == 6902) {
					anIntArray259[anInt3106++] = Static443.anInt7319;
					return;
				}
				if (arg0 == 6903) {
					anIntArray259[anInt3106++] = Static7.anInt105;
					return;
				}
				if (arg0 == 6904) {
					anIntArray259[anInt3106++] = Static484.anInt7815;
					return;
				}
				if (arg0 == 6905) {
					local83 = "";
					if (Static65.aClass192_1 != null) {
						if (Static65.aClass192_1.anObject30 == null) {
							local83 = Static221.method5005(Static65.aClass192_1.anInt5187);
						} else {
							local83 = (String) Static65.aClass192_1.anObject30;
						}
					}
					aStringArray15[anInt3110++] = local83;
					return;
				}
				if (arg0 == 6906) {
					anIntArray259[anInt3106++] = Static543.anInt8521;
					return;
				}
				if (arg0 == 6907) {
					anIntArray259[anInt3106++] = Static437.anInt7270;
					return;
				}
				if (arg0 == 6908) {
					anIntArray259[anInt3106++] = Static365.anInt9432;
					return;
				}
				if (arg0 == 6909) {
					anIntArray259[anInt3106++] = Static123.aBoolean234 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray259[anInt3106++] = Static59.anInt5160;
					return;
				}
				if (arg0 == 6911) {
					anIntArray259[anInt3106++] = Static88.anInt2200;
					return;
				}
				if (arg0 == 6912) {
					anIntArray259[anInt3106++] = Static232.anInt4425;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local175 = Static278.aClass3_Sub13_Sub1_1.method4478();
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.anInt5181 = Static260.anInt4932;
					anIntArray259[anInt3106++] = local175;
					Static447.method6262();
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 7001) {
					Static278.aClass3_Sub13_Sub1_1.method4475();
					Static447.method6262();
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 7002) {
					Static278.aClass3_Sub13_Sub1_1.method4468();
					Static447.method6262();
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 7003) {
					Static278.aClass3_Sub13_Sub1_1.method4466();
					Static447.method6262();
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 7004) {
					Static278.aClass3_Sub13_Sub1_1.method4469(true);
					Static447.method6262();
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 7005) {
					Static278.aClass3_Sub13_Sub1_1.anInt5149 = 0;
					Static278.aClass3_Sub13_Sub1_1.method4470(Static409.aClass221_6);
					Static529.aBoolean647 = false;
					return;
				}
				if (arg0 == 7006) {
					if (Static278.aClass3_Sub13_Sub1_1.anInt5181 == 2) {
						Static278.aClass3_Sub13_Sub1_1.aBoolean419 = true;
						return;
					}
					if (Static278.aClass3_Sub13_Sub1_1.anInt5181 == 1) {
						Static278.aClass3_Sub13_Sub1_1.aBoolean415 = true;
						return;
					}
					if (Static278.aClass3_Sub13_Sub1_1.anInt5181 == 3) {
						Static278.aClass3_Sub13_Sub1_1.aBoolean418 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray259[anInt3106++] = Static278.aClass3_Sub13_Sub1_1.anInt5149;
					return;
				}
				if (arg0 == 7008) {
					if (Static260.anInt4932 == 0 && Static597.anInt9433 < 96) {
						anIntArray259[anInt3106++] = 1;
						return;
					}
					anIntArray259[anInt3106++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!te;II)V")
	public static void method2775(@OriginalArg(0) Class318 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub3_Sub4 local5 = Static189.method3258(arg0, arg1, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray260 = new int[local5.anInt681];
		aStringArray16 = new String[local5.anInt679];
		if (local5.aClass318_1 == Static293.aClass318_3 || local5.aClass318_1 == Static343.aClass318_4 || local5.aClass318_1 == Static348.aClass318_5) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static555.aClass203_139 != null) {
				local30 = Static555.aClass203_139.anInt5527;
				local32 = Static555.aClass203_139.anInt5440;
			}
			anIntArray260[0] = Static563.aClass156_1.method5689() - local30;
			anIntArray260[1] = Static563.aClass156_1.method5690() - local32;
		}
		method2769(local5, 200000);
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V")
	public static void method2776(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static87.method1968(arg0)) {
			return;
		}
		@Pc(12) Class203[] local12 = Static59.aClass203ArrayArray3[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class203 local19 = local12[local14];
			if (local19.anObjectArray10 != null) {
				@Pc(26) Class3_Sub45 local26 = new Class3_Sub45();
				local26.aClass203_136 = local19;
				local26.anObjectArray33 = local19.anObjectArray10;
				method2782(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!uca;)V")
	public static void method2778(@OriginalArg(0) Class3_Sub45 arg0) {
		method2782(arg0, 200000);
	}

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)V")
	private static void method2779(@OriginalArg(0) int arg0) {
		@Pc(3) Class203 local3 = Static414.method5954(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class203[] local13 = Static267.aClass203ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class203[] local19 = Static59.aClass203ArrayArray3[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static267.aClass203ArrayArray2[local9] = new Class203[local22];
			Static604.method5912(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static604.method5912(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)Ljava/lang/String;")
	private static String method2780(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray17[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "()V")
	public static void method2781() {
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!uca;I)V")
	private static void method2782(@OriginalArg(0) Class3_Sub45 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray33;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class3_Sub3_Sub4 local12 = Static207.method3704(local8);
		if (local12 == null) {
			return;
		}
		anIntArray260 = new int[local12.anInt681];
		@Pc(21) int local21 = 0;
		aStringArray16 = new String[local12.anInt679];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt8341;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt8336;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass203_136 == null ? -1 : arg0.aClass203_136.anInt5531;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt8340;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass203_136 == null ? -1 : arg0.aClass203_136.anInt5504;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass203_137 == null ? -1 : arg0.aClass203_137.anInt5531;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass203_137 == null ? -1 : arg0.aClass203_137.anInt5504;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt8338;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt8339;
				}
				anIntArray260[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString115;
				}
				aStringArray16[local27++] = local135;
			}
		}
		anInt3115 = arg0.anInt8337;
		method2769(local12, arg1);
	}
}
