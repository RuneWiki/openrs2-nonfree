import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "Lclient!dv;")
	private static Class70 aClass70_1;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "[I")
	private static int[] anIntArray471;

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "Lclient!in;")
	private static Class160 aClass160_32;

	@OriginalMember(owner = "client!ri", name = "r", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray30;

	@OriginalMember(owner = "client!ri", name = "x", descriptor = "Lclient!in;")
	private static Class160 aClass160_33;

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "[Lclient!ji;")
	private static final Class173[] aClass173Array1 = new Class173[50];

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "[I")
	private static final int[] anIntArray472 = new int[5];

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray29 = new String[1000];

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "[[I")
	private static final int[][] anIntArrayArray45 = new int[5][5000];

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
	private static int anInt7916 = 0;

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "[I")
	private static final int[] anIntArray473 = new int[1000];

	@OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
	private static int anInt7920 = 0;

	@OriginalMember(owner = "client!ri", name = "u", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
	private static int anInt7921 = 0;

	@OriginalMember(owner = "client!ri", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray31 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ri", name = "A", descriptor = "Lclient!lga;")
	public static final Class207 aClass207_47 = new Class207(4);

	@OriginalMember(owner = "client!ri", name = "B", descriptor = "[I")
	private static final int[] anIntArray474 = new int[3];

	@OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
	private static int anInt7924 = 0;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!en;II)V")
	public static void method6304(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class1_Sub8_Sub6 local5 = Static288.method4333(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray471 = new int[local5.anInt4276];
		aStringArray30 = new String[local5.anInt4279];
		if (local5.aClass84_3 == Static500.aClass84_8 || local5.aClass84_3 == Static563.aClass84_9 || local5.aClass84_3 == Static427.aClass84_7) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static345.aClass160_44 != null) {
				local30 = Static345.aClass160_44.anInt4169;
				local32 = Static345.aClass160_44.anInt4171;
			}
			anIntArray471[0] = Static216.aClass238_1.method5661() - local30;
			anIntArray471[1] = Static216.aClass238_1.method5653() - local32;
		}
		method6310(local5, 200000);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "()V")
	public static void method6305() {
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
	private static void method6306(@OriginalArg(0) int arg0) {
		@Pc(3) Class160 local3 = Static512.method7155(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class160[] local13 = Static549.aClass160ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class160[] local19 = Static115.aClass160ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static549.aClass160ArrayArray2[local9] = new Class160[local22];
			Static598.method773(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static598.method773(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)V")
	public static void method6307() {
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
	public static void method6308(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static67.method1102(arg0)) {
			return;
		}
		@Pc(12) Class160[] local12 = Static115.aClass160ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class160 local19 = local12[local14];
			if (local19.anObjectArray23 != null) {
				@Pc(26) Class1_Sub22 local26 = new Class1_Sub22();
				local26.aClass160_10 = local19;
				local26.anObjectArray1 = local19.anObjectArray23;
				method6309(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!ga;I)V")
	private static void method6309(@OriginalArg(0) Class1_Sub22 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class1_Sub8_Sub6 local12 = Static447.method6286(local8);
		if (local12 == null) {
			return;
		}
		anIntArray471 = new int[local12.anInt4276];
		@Pc(21) int local21 = 0;
		aStringArray30 = new String[local12.anInt4279];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt2862;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt2858;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass160_10 == null ? -1 : arg0.aClass160_10.anInt4199;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt2861;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass160_10 == null ? -1 : arg0.aClass160_10.anInt4146;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass160_9 == null ? -1 : arg0.aClass160_9.anInt4199;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass160_9 == null ? -1 : arg0.aClass160_9.anInt4146;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt2857;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt2860;
				}
				anIntArray471[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString27;
				}
				aStringArray30[local27++] = local135;
			}
		}
		anInt7924 = arg0.anInt2859;
		method6310(local12, arg1);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!ir;I)V")
	private static void method6310(@OriginalArg(0) Class1_Sub8_Sub6 arg0, @OriginalArg(1) int arg1) {
		anInt7920 = 0;
		anInt7916 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray215;
		@Pc(11) int[] local11 = arg0.anIntArray214;
		@Pc(13) byte local13 = -1;
		anInt7921 = 0;
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
						method6314(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method6315(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray473[anInt7920++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray473[anInt7920++] = Static390.aClass353_29.anIntArray589[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static390.aClass353_29.method7620(anIntArray473[--anInt7920], local54);
					} else if (local31 == 3) {
						aStringArray29[anInt7916++] = arg0.aStringArray10[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt7920 -= 2;
						if (anIntArray473[anInt7920] != anIntArray473[anInt7920 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt7920 -= 2;
						if (anIntArray473[anInt7920] == anIntArray473[anInt7920 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt7920 -= 2;
						if (anIntArray473[anInt7920] < anIntArray473[anInt7920 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt7920 -= 2;
						if (anIntArray473[anInt7920] > anIntArray473[anInt7920 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt7921 == 0) {
							return;
						}
						@Pc(216) Class173 local216 = aClass173Array1[--anInt7921];
						arg0 = local216.aClass1_Sub8_Sub6_1;
						local8 = arg0.anIntArray215;
						local11 = arg0.anIntArray214;
						local5 = local216.anInt4526;
						anIntArray471 = local216.anIntArray248;
						aStringArray30 = local216.aStringArray12;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray473[anInt7920++] = Static390.aClass353_29.method7619(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static390.aClass353_29.method7623(anIntArray473[--anInt7920], local54);
					} else if (local31 == 31) {
						anInt7920 -= 2;
						if (anIntArray473[anInt7920] <= anIntArray473[anInt7920 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt7920 -= 2;
						if (anIntArray473[anInt7920] >= anIntArray473[anInt7920 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray473[anInt7920++] = anIntArray471[local11[local5]];
					} else if (local31 == 34) {
						anIntArray471[local11[local5]] = anIntArray473[--anInt7920];
					} else if (local31 == 35) {
						aStringArray29[anInt7916++] = aStringArray30[local11[local5]];
					} else if (local31 == 36) {
						aStringArray30[local11[local5]] = aStringArray29[--anInt7916];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt7916 -= local54;
						@Pc(400) String local400 = Static394.method5647(anInt7916, aStringArray29, local54);
						aStringArray29[anInt7916++] = local400;
					} else if (local31 == 38) {
						anInt7920--;
					} else if (local31 == 39) {
						anInt7916--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class1_Sub8_Sub6 local436 = Static447.method6286(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt4276];
							@Pc(450) String[] local450 = new String[local436.anInt4279];
							for (local452 = 0; local452 < local436.anInt4275; local452++) {
								local446[local452] = anIntArray473[anInt7920 + local452 - local436.anInt4275];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt4277; local471++) {
								local450[local471] = aStringArray29[anInt7916 + local471 - local436.anInt4277];
							}
							anInt7920 -= local436.anInt4275;
							anInt7916 -= local436.anInt4277;
							@Pc(502) Class173 local502 = new Class173();
							local502.aClass1_Sub8_Sub6_1 = arg0;
							local502.anInt4526 = local5;
							local502.anIntArray248 = anIntArray471;
							local502.aStringArray12 = aStringArray30;
							if (anInt7921 >= aClass173Array1.length) {
								throw new RuntimeException();
							}
							aClass173Array1[anInt7921++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray215;
							local11 = local436.anIntArray214;
							local5 = -1;
							anIntArray471 = local446;
							aStringArray30 = local450;
						} else if (local31 == 42) {
							anIntArray473[anInt7920++] = Static250.anIntArray251[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static250.anIntArray251[local54] = anIntArray473[--anInt7920];
							Static274.method4005(local54);
							Static136.aBoolean203 |= Static166.aBooleanArray34[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray473[--anInt7920];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray472[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray45[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray473[--anInt7920];
							if (local603 < 0 || local603 >= anIntArray472[local54]) {
								throw new RuntimeException();
							}
							anIntArray473[anInt7920++] = anIntArrayArray45[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt7920 -= 2;
							local603 = anIntArray473[anInt7920];
							if (local603 < 0 || local603 >= anIntArray472[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray45[local54][local603] = anIntArray473[anInt7920 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static69.aStringArray1[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray29[anInt7916++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static69.aStringArray1[local54] = aStringArray29[--anInt7916];
							Static269.method3931(local54);
						} else if (local31 == 51) {
							@Pc(774) Class91 local774 = arg0.aClass91Array1[local11[local5]];
							@Pc(787) Class1_Sub27 local787 = (Class1_Sub27) local774.method2271((long) anIntArray473[--anInt7920]);
							if (local787 != null) {
								local5 += local787.anInt3348;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString49 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong268).append(" ");
				for (local603 = anInt7921 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass173Array1[local603].aClass1_Sub8_Sub6_1.aLong268).append(" ");
				}
				local856.append("op: ").append(local13);
				Static419.method5957(local856.toString(), local837);
			} else {
				Static193.method3073("Clientscript error in: " + arg0.aString49);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString49).append("\n");
				for (local603 = anInt7921 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass173Array1[local603].aClass1_Sub8_Sub6_1.aString49).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static419.method5957(local856.toString(), local837);
				Static415.method5896(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!ga;)V")
	public static void method6311(@OriginalArg(0) Class1_Sub22 arg0) {
		method6309(arg0, 200000);
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V")
	private static void method6312(@OriginalArg(0) int arg0) {
		@Pc(3) Class160 local3 = Static512.method7155(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class160[] local13 = Static549.aClass160ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class160[] local19 = Static115.aClass160ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static549.aClass160ArrayArray2[local9] = new Class160[local22];
			Static598.method773(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static598.method773(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(IZ)V")
	private static void method6314(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class160 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class160 local35;
		@Pc(13) int local13;
		@Pc(210) Class160 local210;
		@Pc(158) Class160 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt7920 -= 3;
				local13 = anIntArray473[anInt7920];
				local19 = anIntArray473[anInt7920 + 1];
				local25 = anIntArray473[anInt7920 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static512.method7155(local13);
				if (local35.aClass160Array1 == null) {
					local35.aClass160Array1 = new Class160[local25 + 1];
				}
				if (local35.aClass160Array1.length <= local25) {
					@Pc(54) Class160[] local54 = new Class160[local25 + 1];
					for (local56 = 0; local56 < local35.aClass160Array1.length; local56++) {
						local54[local56] = local35.aClass160Array1[local56];
					}
					local35.aClass160Array1 = local54;
				}
				if (local25 > 0 && local35.aClass160Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class160 local99 = new Class160();
				local99.anInt4166 = local19;
				local99.anInt4224 = local99.anInt4199 = local35.anInt4199;
				local99.anInt4146 = local25;
				local35.aClass160Array1[local25] = local99;
				if (arg1) {
					aClass160_32 = local99;
				} else {
					aClass160_33 = local99;
				}
				Static415.method5900(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass160_32 : aClass160_33;
				if (local137.anInt4146 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static512.method7155(local137.anInt4199);
				local158.aClass160Array1[local137.anInt4146] = null;
				Static415.method5900(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static512.method7155(anIntArray473[--anInt7920]);
				local137.aClass160Array1 = null;
				Static415.method5900(local137);
				return;
			}
			if (arg0 == 200) {
				anInt7920 -= 2;
				local13 = anIntArray473[anInt7920];
				local19 = anIntArray473[anInt7920 + 1];
				local210 = Static420.method5959(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray473[anInt7920++] = 1;
					if (arg1) {
						aClass160_32 = local210;
						return;
					}
					aClass160_33 = local210;
					return;
				}
				anIntArray473[anInt7920++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray473[--anInt7920];
				local158 = Static512.method7155(local13);
				if (local158 != null) {
					anIntArray473[anInt7920++] = 1;
					if (arg1) {
						aClass160_32 = local158;
						return;
					}
					aClass160_33 = local158;
					return;
				}
				anIntArray473[anInt7920++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray473[--anInt7920];
				method6312(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray473[--anInt7920];
				method6306(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt7920 -= 2;
					local13 = anIntArray473[anInt7920];
					local19 = anIntArray473[anInt7920 + 1];
					for (local25 = 0; local25 < Static531.anIntArray558.length; local25++) {
						if (Static531.anIntArray558[local25] == local13) {
							Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aClass283_1.method6093(Static423.aClass323_1, local19, local25);
							return;
						}
					}
					for (local353 = 0; local353 < Static529.anIntArray438.length; local353++) {
						if (Static529.anIntArray438[local353] == local13) {
							Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aClass283_1.method6093(Static423.aClass323_1, local19, local353);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt7920 -= 2;
					local13 = anIntArray473[anInt7920];
					local19 = anIntArray473[anInt7920 + 1];
					Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aClass283_1.method6100(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray473[--anInt7920] != 0;
					Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aClass283_1.method6097(local412);
					return;
				}
				if (arg0 == 411) {
					anInt7920 -= 2;
					local13 = anIntArray473[anInt7920];
					local19 = anIntArray473[anInt7920 + 1];
					Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aClass283_1.method6103(local19, local13, Static230.aClass225_1);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1507) String local1507;
				@Pc(1145) String local1145;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static512.method7155(anIntArray473[--anInt7920]);
					} else {
						local137 = arg1 ? aClass160_32 : aClass160_33;
					}
					if (arg0 == 1100) {
						anInt7920 -= 2;
						local137.anInt4211 = anIntArray473[anInt7920];
						if (local137.anInt4211 > local137.anInt4184 - local137.anInt4182) {
							local137.anInt4211 = local137.anInt4184 - local137.anInt4182;
						}
						if (local137.anInt4211 < 0) {
							local137.anInt4211 = 0;
						}
						local137.anInt4218 = anIntArray473[anInt7920 + 1];
						if (local137.anInt4218 > local137.anInt4198 - local137.anInt4156) {
							local137.anInt4218 = local137.anInt4198 - local137.anInt4156;
						}
						if (local137.anInt4218 < 0) {
							local137.anInt4218 = 0;
						}
						Static415.method5900(local137);
						if (local137.anInt4146 == -1) {
							Static106.method1494(local137.anInt4199);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt4225 = anIntArray473[--anInt7920];
						Static415.method5900(local137);
						if (local137.anInt4146 == -1) {
							Static408.method5842(local137.anInt4199);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean298 = anIntArray473[--anInt7920] == 1;
						Static415.method5900(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt4181 = anIntArray473[--anInt7920];
						Static415.method5900(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt4160 = anIntArray473[--anInt7920];
						Static415.method5900(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray473[--anInt7920];
						if (local137.anInt4203 != local19) {
							local137.anInt4203 = local19;
							Static415.method5900(local137);
						}
						if (local137.anInt4146 == -1) {
							Static349.method5201(local137.anInt4199);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt4207 = anIntArray473[--anInt7920];
						Static415.method5900(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean307 = anIntArray473[--anInt7920] == 1;
						Static415.method5900(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt4172 = 1;
						local137.anInt4189 = anIntArray473[--anInt7920];
						Static415.method5900(local137);
						if (local137.anInt4146 == -1) {
							Static169.method2729(local137.anInt4199);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt7920 -= 6;
						local137.anInt4212 = anIntArray473[anInt7920];
						local137.anInt4135 = anIntArray473[anInt7920 + 1];
						local137.anInt4179 = anIntArray473[anInt7920 + 2];
						local137.anInt4214 = anIntArray473[anInt7920 + 3];
						local137.anInt4175 = anIntArray473[anInt7920 + 4];
						local137.anInt4209 = anIntArray473[anInt7920 + 5];
						Static415.method5900(local137);
						if (local137.anInt4146 == -1) {
							Static591.method7885(local137.anInt4199);
							Static23.method490(local137.anInt4199);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray473[--anInt7920];
						if (local137.anInt4143 != local19) {
							local137.anInt4143 = local19;
							local137.anInt4148 = 0;
							local137.anInt4154 = 1;
							local137.anInt4222 = 0;
							@Pc(1094) Class197 local1094 = local137.anInt4143 == -1 ? null : Static223.aClass245_1.method5312(local137.anInt4143);
							if (local1094 != null) {
								Static392.method5630(local1094, local137.anInt4148);
							}
							Static415.method5900(local137);
						}
						if (local137.anInt4146 == -1) {
							Static557.method7541(local137.anInt4199);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean293 = anIntArray473[--anInt7920] == 1;
						Static415.method5900(local137);
						return;
					}
					if (arg0 == 1112) {
						local1145 = aStringArray29[--anInt7916];
						if (!local1145.equals(local137.aString44)) {
							local137.aString44 = local1145;
							Static415.method5900(local137);
						}
						if (local137.anInt4146 == -1) {
							Static499.method7033(local137.anInt4199);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt4145 = anIntArray473[--anInt7920];
						Static415.method5900(local137);
						if (local137.anInt4146 == -1) {
							Static441.method6230(local137.anInt4199);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt7920 -= 3;
						local137.anInt4149 = anIntArray473[anInt7920];
						local137.anInt4204 = anIntArray473[anInt7920 + 1];
						local137.anInt4217 = anIntArray473[anInt7920 + 2];
						Static415.method5900(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean294 = anIntArray473[--anInt7920] == 1;
						Static415.method5900(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt4167 = anIntArray473[--anInt7920];
						Static415.method5900(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt4208 = anIntArray473[--anInt7920];
						Static415.method5900(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean292 = anIntArray473[--anInt7920] == 1;
						Static415.method5900(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean306 = anIntArray473[--anInt7920] == 1;
						Static415.method5900(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt7920 -= 2;
						local137.anInt4184 = anIntArray473[anInt7920];
						local137.anInt4198 = anIntArray473[anInt7920 + 1];
						Static415.method5900(local137);
						if (local137.anInt4166 == 0) {
							Static361.method5313(local137, false);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean303 = anIntArray473[--anInt7920] == 1;
						Static415.method5900(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt4209 = anIntArray473[--anInt7920];
						Static415.method5900(local137);
						if (local137.anInt4146 == -1) {
							Static591.method7885(local137.anInt4199);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray473[--anInt7920];
						local137.aBoolean302 = local19 == 1;
						Static415.method5900(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt7920 -= 2;
						local137.anInt4139 = anIntArray473[anInt7920];
						local137.anInt4138 = anIntArray473[anInt7920 + 1];
						Static415.method5900(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt4192 = anIntArray473[--anInt7920];
						Static415.method5900(local137);
						return;
					}
					@Pc(1473) Class94 local1473;
					if (arg0 == 1127) {
						anInt7920 -= 2;
						local19 = anIntArray473[anInt7920];
						local25 = anIntArray473[anInt7920 + 1];
						local1473 = Static256.aClass263_1.method5592(local19);
						if (local25 != local1473.anInt2658) {
							local137.method3362(local25, local19);
							return;
						}
						local137.method3351(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray473[--anInt7920];
						local1507 = aStringArray29[--anInt7916];
						local1473 = Static256.aClass263_1.method5592(local19);
						if (!local1473.aString24.equals(local1507)) {
							local137.method3356(local19, local1507);
							return;
						}
						local137.method3351(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2309) int local2309;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static512.method7155(anIntArray473[--anInt7920]);
						} else {
							local137 = arg1 ? aClass160_32 : aClass160_33;
						}
						if (arg0 == 1300) {
							local19 = anIntArray473[--anInt7920] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method3358(local19, aStringArray29[--anInt7916]);
								return;
							} else {
								anInt7916--;
								return;
							}
						}
						if (arg0 == 1301) {
							anInt7920 -= 2;
							local19 = anIntArray473[anInt7920];
							local25 = anIntArray473[anInt7920 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass160_15 = null;
								return;
							}
							local137.aClass160_15 = Static420.method5959(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray473[--anInt7920];
							if (local19 != Static47.anInt889 && local19 != Static209.anInt8898 && local19 != Static296.anInt5342) {
								return;
							}
							local137.anInt4190 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt4220 = anIntArray473[--anInt7920];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt4162 = anIntArray473[--anInt7920];
							return;
						}
						if (arg0 == 1305) {
							local137.aString45 = aStringArray29[--anInt7916];
							return;
						}
						if (arg0 == 1306) {
							local137.aString43 = aStringArray29[--anInt7916];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray9 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt4163 = anIntArray473[--anInt7920];
							local137.anInt4210 = anIntArray473[--anInt7920];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray473[--anInt7920];
							local25 = anIntArray473[--anInt7920];
							if (local25 >= 1 && local25 <= 10) {
								local137.method3352(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString47 = aStringArray29[--anInt7916];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt4151 = anIntArray473[--anInt7920];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt7920 -= 3;
								local19 = anIntArray473[anInt7920] - 1;
								local25 = anIntArray473[anInt7920 + 1];
								local353 = anIntArray473[anInt7920 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt7920 -= 2;
								local19 = 10;
								local25 = anIntArray473[anInt7920];
								local353 = anIntArray473[anInt7920 + 1];
							}
							if (local137.aByteArray33 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray33 = new byte[11];
								local137.aByteArray32 = new byte[11];
								local137.anIntArray207 = new int[11];
							}
							local137.aByteArray33[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean301 = false;
								for (local2309 = 0; local2309 < local137.aByteArray33.length; local2309++) {
									if (local137.aByteArray33[local2309] != 0) {
										local137.aBoolean301 = true;
										break;
									}
								}
							} else {
								local137.aBoolean301 = true;
							}
							local137.aByteArray32[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt4170 = anIntArray473[--anInt7920];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static512.method7155(anIntArray473[--anInt7920]);
						} else {
							local137 = arg1 ? aClass160_32 : aClass160_33;
						}
						if (arg0 == 1499) {
							local137.method3364();
							return;
						}
						local1145 = aStringArray29[--anInt7916];
						@Pc(2395) int[] local2395 = null;
						if (local1145.length() > 0 && local1145.charAt(local1145.length() - 1) == 'Y') {
							local353 = anIntArray473[--anInt7920];
							if (local353 > 0) {
								local2395 = new int[local353];
								while (local353-- > 0) {
									local2395[local353] = anIntArray473[--anInt7920];
								}
							}
							local1145 = local1145.substring(0, local1145.length() - 1);
						}
						@Pc(2447) Object[] local2447 = new Object[local1145.length() + 1];
						for (local2309 = local2447.length - 1; local2309 >= 1; local2309--) {
							if (local1145.charAt(local2309 - 1) == 's') {
								local2447[local2309] = aStringArray29[--anInt7916];
							} else {
								local2447[local2309] = Integer.valueOf(anIntArray473[--anInt7920]);
							}
						}
						local56 = anIntArray473[--anInt7920];
						if (local56 == -1) {
							local2447 = null;
						} else {
							local2447[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray8 = local2447;
						} else if (arg0 == 1401) {
							local137.anObjectArray27 = local2447;
						} else if (arg0 == 1402) {
							local137.anObjectArray31 = local2447;
						} else if (arg0 == 1403) {
							local137.anObjectArray21 = local2447;
						} else if (arg0 == 1404) {
							local137.anObjectArray24 = local2447;
						} else if (arg0 == 1405) {
							local137.anObjectArray26 = local2447;
						} else if (arg0 == 1406) {
							local137.anObjectArray10 = local2447;
						} else if (arg0 == 1407) {
							local137.anObjectArray20 = local2447;
							local137.anIntArray208 = local2395;
						} else if (arg0 == 1408) {
							local137.anObjectArray22 = local2447;
						} else if (arg0 == 1409) {
							local137.lb = local2447;
						} else if (arg0 == 1410) {
							local137.anObjectArray7 = local2447;
						} else if (arg0 == 1411) {
							local137.anObjectArray18 = local2447;
						} else if (arg0 == 1412) {
							local137.anObjectArray29 = local2447;
						} else if (arg0 == 1414) {
							local137.anObjectArray5 = local2447;
							local137.anIntArray206 = local2395;
						} else if (arg0 == 1415) {
							local137.anObjectArray12 = local2447;
							local137.anIntArray209 = local2395;
						} else if (arg0 == 1416) {
							local137.anObjectArray9 = local2447;
						} else if (arg0 == 1417) {
							local137.anObjectArray6 = local2447;
						} else if (arg0 == 1418) {
							local137.anObjectArray3 = local2447;
						} else if (arg0 == 1419) {
							local137.anObjectArray2 = local2447;
						} else if (arg0 == 1420) {
							local137.anObjectArray30 = local2447;
						} else if (arg0 == 1421) {
							local137.anObjectArray25 = local2447;
						} else if (arg0 == 1422) {
							local137.anObjectArray17 = local2447;
						} else if (arg0 == 1423) {
							local137.anObjectArray14 = local2447;
						} else if (arg0 == 1424) {
							local137.anObjectArray4 = local2447;
						} else if (arg0 == 1425) {
							local137.anObjectArray15 = local2447;
						} else if (arg0 == 1426) {
							local137.anObjectArray19 = local2447;
						} else if (arg0 == 1427) {
							local137.anObjectArray13 = local2447;
						} else if (arg0 == 1428) {
							local137.anObjectArray28 = local2447;
							local137.anIntArray202 = local2395;
						} else if (arg0 == 1429) {
							local137.anObjectArray16 = local2447;
							local137.anIntArray205 = local2395;
						} else if (arg0 == 1430) {
							local137.anObjectArray11 = local2447;
						}
						local137.aBoolean297 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass160_32 : aClass160_33;
						if (arg0 == 1500) {
							anIntArray473[anInt7920++] = local137.anInt4169;
							return;
						}
						if (arg0 == 1501) {
							anIntArray473[anInt7920++] = local137.anInt4171;
							return;
						}
						if (arg0 == 1502) {
							anIntArray473[anInt7920++] = local137.anInt4182;
							return;
						}
						if (arg0 == 1503) {
							anIntArray473[anInt7920++] = local137.anInt4156;
							return;
						}
						if (arg0 == 1504) {
							anIntArray473[anInt7920++] = local137.aBoolean295 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray473[anInt7920++] = local137.anInt4224;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static524.method1213(local137);
							anIntArray473[anInt7920++] = local158 == null ? -1 : local158.anInt4199;
							return;
						}
					} else {
						@Pc(3043) Class94 local3043;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass160_32 : aClass160_33;
							if (arg0 == 1600) {
								anIntArray473[anInt7920++] = local137.anInt4211;
								return;
							}
							if (arg0 == 1601) {
								anIntArray473[anInt7920++] = local137.anInt4218;
								return;
							}
							if (arg0 == 1602) {
								aStringArray29[anInt7916++] = local137.aString44;
								return;
							}
							if (arg0 == 1603) {
								anIntArray473[anInt7920++] = local137.anInt4184;
								return;
							}
							if (arg0 == 1604) {
								anIntArray473[anInt7920++] = local137.anInt4198;
								return;
							}
							if (arg0 == 1605) {
								anIntArray473[anInt7920++] = local137.anInt4209;
								return;
							}
							if (arg0 == 1606) {
								anIntArray473[anInt7920++] = local137.anInt4179;
								return;
							}
							if (arg0 == 1607) {
								anIntArray473[anInt7920++] = local137.anInt4175;
								return;
							}
							if (arg0 == 1608) {
								anIntArray473[anInt7920++] = local137.anInt4214;
								return;
							}
							if (arg0 == 1609) {
								anIntArray473[anInt7920++] = local137.anInt4181;
								return;
							}
							if (arg0 == 1610) {
								anIntArray473[anInt7920++] = local137.anInt4212;
								return;
							}
							if (arg0 == 1611) {
								anIntArray473[anInt7920++] = local137.anInt4135;
								return;
							}
							if (arg0 == 1612) {
								anIntArray473[anInt7920++] = local137.anInt4203;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray473[--anInt7920];
								local3043 = Static256.aClass263_1.method5592(local19);
								if (local3043.method2329()) {
									aStringArray29[anInt7916++] = local137.method3353(local19, local3043.aString24);
									return;
								}
								anIntArray473[anInt7920++] = local137.method3363(local19, local3043.anInt2658);
								return;
							}
							if (arg0 == 1614) {
								anIntArray473[anInt7920++] = local137.anInt4207;
								return;
							}
							if (arg0 == 2614) {
								anIntArray473[anInt7920++] = local137.anInt4172 == 1 ? local137.anInt4189 : -1;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass160_32 : aClass160_33;
							if (arg0 == 1700) {
								anIntArray473[anInt7920++] = local137.anInt4205;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt4205 != -1) {
									anIntArray473[anInt7920++] = local137.anInt4178;
									return;
								}
								anIntArray473[anInt7920++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray473[anInt7920++] = local137.anInt4146;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass160_32 : aClass160_33;
							if (arg0 == 1800) {
								anIntArray473[anInt7920++] = Static67.method1098(local137).method574();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray473[--anInt7920];
								local19--;
								if (local137.aStringArray9 != null && local19 < local137.aStringArray9.length && local137.aStringArray9[local19] != null) {
									aStringArray29[anInt7916++] = local137.aStringArray9[local19];
									return;
								}
								aStringArray29[anInt7916++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString45 == null) {
									aStringArray29[anInt7916++] = "";
									return;
								}
								aStringArray29[anInt7916++] = local137.aString45;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static512.method7155(anIntArray473[--anInt7920]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass160_32 : aClass160_33;
							}
							if (anInt7924 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray13 == null) {
									return;
								}
								@Pc(3312) Class1_Sub22 local3312 = new Class1_Sub22();
								local3312.aClass160_10 = local137;
								local3312.anObjectArray1 = local137.anObjectArray13;
								local3312.anInt2859 = anInt7924 + 1;
								Static438.aClass111_48.method2552(local3312);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static512.method7155(anIntArray473[--anInt7920]);
							if (arg0 == 2500) {
								anIntArray473[anInt7920++] = local137.anInt4169;
								return;
							}
							if (arg0 == 2501) {
								anIntArray473[anInt7920++] = local137.anInt4171;
								return;
							}
							if (arg0 == 2502) {
								anIntArray473[anInt7920++] = local137.anInt4182;
								return;
							}
							if (arg0 == 2503) {
								anIntArray473[anInt7920++] = local137.anInt4156;
								return;
							}
							if (arg0 == 2504) {
								anIntArray473[anInt7920++] = local137.aBoolean295 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray473[anInt7920++] = local137.anInt4224;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static524.method1213(local137);
								anIntArray473[anInt7920++] = local158 == null ? -1 : local158.anInt4199;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static512.method7155(anIntArray473[--anInt7920]);
							if (arg0 == 2600) {
								anIntArray473[anInt7920++] = local137.anInt4211;
								return;
							}
							if (arg0 == 2601) {
								anIntArray473[anInt7920++] = local137.anInt4218;
								return;
							}
							if (arg0 == 2602) {
								aStringArray29[anInt7916++] = local137.aString44;
								return;
							}
							if (arg0 == 2603) {
								anIntArray473[anInt7920++] = local137.anInt4184;
								return;
							}
							if (arg0 == 2604) {
								anIntArray473[anInt7920++] = local137.anInt4198;
								return;
							}
							if (arg0 == 2605) {
								anIntArray473[anInt7920++] = local137.anInt4209;
								return;
							}
							if (arg0 == 2606) {
								anIntArray473[anInt7920++] = local137.anInt4179;
								return;
							}
							if (arg0 == 2607) {
								anIntArray473[anInt7920++] = local137.anInt4175;
								return;
							}
							if (arg0 == 2608) {
								anIntArray473[anInt7920++] = local137.anInt4214;
								return;
							}
							if (arg0 == 2609) {
								anIntArray473[anInt7920++] = local137.anInt4181;
								return;
							}
							if (arg0 == 2610) {
								anIntArray473[anInt7920++] = local137.anInt4212;
								return;
							}
							if (arg0 == 2611) {
								anIntArray473[anInt7920++] = local137.anInt4135;
								return;
							}
							if (arg0 == 2612) {
								anIntArray473[anInt7920++] = local137.anInt4203;
								return;
							}
							if (arg0 == 2613) {
								anIntArray473[anInt7920++] = local137.anInt4207;
								return;
							}
							if (arg0 == 2614) {
								anIntArray473[anInt7920++] = local137.anInt4172 == 1 ? local137.anInt4189 : -1;
								return;
							}
						} else {
							@Pc(3841) Class1_Sub38 local3841;
							@Pc(3739) Class1_Sub38 local3739;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static512.method7155(anIntArray473[--anInt7920]);
									anIntArray473[anInt7920++] = local137.anInt4205;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static512.method7155(anIntArray473[--anInt7920]);
									if (local137.anInt4205 != -1) {
										anIntArray473[anInt7920++] = local137.anInt4178;
										return;
									}
									anIntArray473[anInt7920++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray473[--anInt7920];
									local3739 = (Class1_Sub38) Static148.aClass91_6.method2271((long) local13);
									if (local3739 != null) {
										anIntArray473[anInt7920++] = 1;
										return;
									}
									anIntArray473[anInt7920++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static512.method7155(anIntArray473[--anInt7920]);
									if (local137.aClass160Array1 == null) {
										anIntArray473[anInt7920++] = 0;
										return;
									}
									local19 = local137.aClass160Array1.length;
									for (local25 = 0; local25 < local137.aClass160Array1.length; local25++) {
										if (local137.aClass160Array1[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray473[anInt7920++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt7920 -= 2;
									local13 = anIntArray473[anInt7920];
									local19 = anIntArray473[anInt7920 + 1];
									local3841 = (Class1_Sub38) Static148.aClass91_6.method2271((long) local13);
									if (local3841 != null && local3841.anInt7676 == local19) {
										anIntArray473[anInt7920++] = 1;
										return;
									}
									anIntArray473[anInt7920++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static512.method7155(anIntArray473[--anInt7920]);
								if (arg0 == 2800) {
									anIntArray473[anInt7920++] = Static67.method1098(local137).method574();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray473[--anInt7920];
									local19--;
									if (local137.aStringArray9 != null && local19 < local137.aStringArray9.length && local137.aStringArray9[local19] != null) {
										aStringArray29[anInt7916++] = local137.aStringArray9[local19];
										return;
									}
									aStringArray29[anInt7916++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString45 == null) {
										aStringArray29[anInt7916++] = "";
										return;
									}
									aStringArray29[anInt7916++] = local137.aString45;
									return;
								}
							} else {
								@Pc(3978) String local3978;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3978 = aStringArray29[--anInt7916];
										Static477.method6643(local3978);
										return;
									}
									if (arg0 == 3101) {
										anInt7920 -= 2;
										Static529.method5913(anIntArray473[anInt7920 + 1], Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2, anIntArray473[anInt7920]);
										return;
									}
									if (arg0 == 3103) {
										Static46.method764();
										return;
									}
									if (arg0 == 3104) {
										local3978 = aStringArray29[--anInt7916];
										local19 = 0;
										if (Static570.method7674(local3978)) {
											local19 = Static216.method3234(local3978);
										}
										@Pc(4038) Class1_Sub9 local4038 = Static123.method2194(Static469.aClass235_2, Static159.aClass208_35);
										local4038.aClass1_Sub3_Sub1_1.method7936(local19);
										Static42.method746(local4038);
										return;
									}
									@Pc(4067) Class1_Sub9 local4067;
									if (arg0 == 3105) {
										local3978 = aStringArray29[--anInt7916];
										local4067 = Static123.method2194(Static469.aClass235_2, Static452.aClass208_97);
										local4067.aClass1_Sub3_Sub1_1.method7917(local3978.length() + 1);
										local4067.aClass1_Sub3_Sub1_1.method7920(local3978);
										Static42.method746(local4067);
										return;
									}
									if (arg0 == 3106) {
										local3978 = aStringArray29[--anInt7916];
										local4067 = Static123.method2194(Static469.aClass235_2, Static347.aClass208_80);
										local4067.aClass1_Sub3_Sub1_1.method7917(local3978.length() + 1);
										local4067.aClass1_Sub3_Sub1_1.method7920(local3978);
										Static42.method746(local4067);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray473[--anInt7920];
										local1145 = aStringArray29[--anInt7916];
										Static393.method5635(local13, local1145);
										return;
									}
									if (arg0 == 3108) {
										anInt7920 -= 3;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										local25 = anIntArray473[anInt7920 + 2];
										local35 = Static512.method7155(local25);
										Static316.method4700(local35, local13, local19);
										return;
									}
									if (arg0 == 3109) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										local210 = arg1 ? aClass160_32 : aClass160_33;
										Static316.method4700(local210, local13, local19);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray473[--anInt7920];
										local4067 = Static123.method2194(Static469.aClass235_2, Static50.aClass208_24);
										local4067.aClass1_Sub3_Sub1_1.method7937(local13);
										Static42.method746(local4067);
										return;
									}
									if (arg0 == 3111) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										local3841 = (Class1_Sub38) Static148.aClass91_6.method2271((long) local13);
										if (local3841 != null) {
											Static336.method5001(local3841.anInt7676 != local19, local3841, true);
										}
										Static543.method7388(local13, local19, 3, true);
										return;
									}
									if (arg0 == 3112) {
										anInt7920--;
										local13 = anIntArray473[anInt7920];
										local3739 = (Class1_Sub38) Static148.aClass91_6.method2271((long) local13);
										if (local3739 != null && local3739.anInt7675 == 3) {
											Static336.method5001(true, local3739, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static474.method6550(aStringArray29[--anInt7916]);
										return;
									}
									if (arg0 == 3114) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										local1507 = aStringArray29[--anInt7916];
										Static308.method4624("", local19, local13, "", local1507, "");
										return;
									}
									if (arg0 == 3115) {
										anInt7920 -= 11;
										@Pc(4368) Class259[] local4368 = Static179.method2831();
										@Pc(4371) Class216[] local4371 = Static570.method7672();
										Static343.method5116(local4368[anIntArray473[anInt7920]], anIntArray473[anInt7920 + 7], anIntArray473[anInt7920 + 5], anIntArray473[anInt7920 + 10], anIntArray473[anInt7920 + 6], anIntArray473[anInt7920 + 4], anIntArray473[anInt7920 + 8], anIntArray473[anInt7920 + 2], anIntArray473[anInt7920 + 3], anIntArray473[anInt7920 + 9], local4371[anIntArray473[anInt7920 + 1]]);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt7920 -= 3;
										Static485.method6697(anIntArray473[anInt7920 + 2], 255, anIntArray473[anInt7920 + 1], 256, anIntArray473[anInt7920]);
										return;
									}
									if (arg0 == 3201) {
										Static353.method5269(anIntArray473[--anInt7920], 50, 255);
										return;
									}
									if (arg0 == 3202) {
										anInt7920 -= 2;
										Static196.method3085(255, anIntArray473[anInt7920 + 1], anIntArray473[anInt7920]);
										return;
									}
									if (arg0 == 3203) {
										anInt7920 -= 4;
										Static485.method6697(anIntArray473[anInt7920 + 2], anIntArray473[anInt7920 + 3], anIntArray473[anInt7920 + 1], 256, anIntArray473[anInt7920]);
										return;
									}
									if (arg0 == 3204) {
										anInt7920 -= 3;
										Static353.method5269(anIntArray473[anInt7920], anIntArray473[anInt7920 + 2], anIntArray473[anInt7920 + 1]);
										return;
									}
									if (arg0 == 3205) {
										anInt7920 -= 3;
										Static196.method3085(anIntArray473[anInt7920 + 2], anIntArray473[anInt7920 + 1], anIntArray473[anInt7920]);
										return;
									}
									if (arg0 == 3206) {
										anInt7920 -= 4;
										Static17.method396(256, anIntArray473[anInt7920 + 1], false, anIntArray473[anInt7920], anIntArray473[anInt7920 + 3], anIntArray473[anInt7920 + 2]);
										return;
									}
									if (arg0 == 3207) {
										anInt7920 -= 4;
										Static17.method396(256, anIntArray473[anInt7920 + 1], true, anIntArray473[anInt7920], anIntArray473[anInt7920 + 3], anIntArray473[anInt7920 + 2]);
										return;
									}
									if (arg0 == 3208) {
										anInt7920 -= 5;
										Static485.method6697(anIntArray473[anInt7920 + 2], anIntArray473[anInt7920 + 3], anIntArray473[anInt7920 + 1], anIntArray473[anInt7920 + 4], anIntArray473[anInt7920]);
										return;
									}
									if (arg0 == 3209) {
										anInt7920 -= 5;
										Static17.method396(anIntArray473[anInt7920 + 4], anIntArray473[anInt7920 + 1], false, anIntArray473[anInt7920], anIntArray473[anInt7920 + 3], anIntArray473[anInt7920 + 2]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray473[anInt7920++] = Static518.anInt9331;
										return;
									}
									if (arg0 == 3301) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = Static303.method4597(false, local13, local19);
										return;
									}
									if (arg0 == 3302) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = Static121.method2186(false, local19, local13);
										return;
									}
									if (arg0 == 3303) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = Static510.method7147(local13, false, local19);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Static168.aClass366_1.method7985(local13).anInt7757;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Static586.anIntArray616[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Static163.anIntArray143[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Static504.anIntArray527[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4896) byte local4896 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aByte113;
										local19 = (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8902 >> 9) + Static539.anInt9045;
										local25 = (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt8906 >> 9) + Static311.anInt5708;
										anIntArray473[anInt7920++] = (local4896 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray473[anInt7920++] = Static431.aBoolean583 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = Static303.method4597(true, local13, local19);
										return;
									}
									if (arg0 == 3314) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = Static121.method2186(true, local19, local13);
										return;
									}
									if (arg0 == 3315) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = Static510.method7147(local13, true, local19);
										return;
									}
									if (arg0 == 3316) {
										if (Static203.anInt3822 >= 2) {
											anIntArray473[anInt7920++] = Static203.anInt3822;
											return;
										}
										anIntArray473[anInt7920++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray473[anInt7920++] = Static208.anInt8063;
										return;
									}
									if (arg0 == 3318) {
										anIntArray473[anInt7920++] = Static221.aClass261_3.anInt6921;
										return;
									}
									if (arg0 == 3321) {
										anIntArray473[anInt7920++] = Static229.anInt4281;
										return;
									}
									if (arg0 == 3322) {
										anIntArray473[anInt7920++] = Static457.anInt7992;
										return;
									}
									if (arg0 == 3323) {
										if (Static335.anInt6141 >= 5 && Static335.anInt6141 <= 9) {
											anIntArray473[anInt7920++] = 1;
											return;
										}
										anIntArray473[anInt7920++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static335.anInt6141 >= 5 && Static335.anInt6141 <= 9) {
											anIntArray473[anInt7920++] = Static335.anInt6141;
											return;
										}
										anIntArray473[anInt7920++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray473[anInt7920++] = Static111.aBoolean123 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray473[anInt7920++] = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.anInt3580;
										return;
									}
									if (arg0 == 3327) {
										anIntArray473[anInt7920++] = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aClass283_1.aBoolean580 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray473[anInt7920++] = Static52.aBoolean594 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Static70.method1168(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = Static43.method752(local13, false, local19);
										return;
									}
									if (arg0 == 3332) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = Static43.method752(local13, true, local19);
										return;
									}
									if (arg0 == 3333) {
										anIntArray473[anInt7920++] = Static307.anInt7603;
										return;
									}
									if (arg0 == 3335) {
										anIntArray473[anInt7920++] = Static161.anInt3095;
										return;
									}
									if (arg0 == 3336) {
										anInt7920 -= 4;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										local25 = anIntArray473[anInt7920 + 2];
										local353 = anIntArray473[anInt7920 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray473[anInt7920++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray473[anInt7920++] = Static547.anInt9149;
										return;
									}
									if (arg0 == 3338) {
										anIntArray473[anInt7920++] = Static228.method3400();
										return;
									}
									if (arg0 == 3339) {
										anIntArray473[anInt7920++] = Static437.aBoolean586 ? 1 : 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray473[anInt7920++] = Static13.aBoolean9 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray473[anInt7920++] = Static170.aBoolean235 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray473[anInt7920++] = Static216.aClass238_1.method5661();
										return;
									}
									if (arg0 == 3343) {
										anIntArray473[anInt7920++] = Static216.aClass238_1.method5653();
										return;
									}
									if (arg0 == 3344) {
										aStringArray29[anInt7916++] = Static590.method7876();
										return;
									}
									if (arg0 == 3345) {
										aStringArray29[anInt7916++] = Static252.method3698();
										return;
									}
									if (arg0 == 3346) {
										anIntArray473[anInt7920++] = Static183.method2973();
										return;
									}
									if (arg0 == 3347) {
										anIntArray473[anInt7920++] = Static389.anInt6933;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5631) Class162 local5631;
									if (arg0 == 3400) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										local5631 = Static108.aClass98_1.method2399(local13);
										aStringArray29[anInt7916++] = local5631.method3402(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt7920 -= 4;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										local25 = anIntArray473[anInt7920 + 2];
										local353 = anIntArray473[anInt7920 + 3];
										@Pc(5677) Class162 local5677 = Static108.aClass98_1.method2399(local25);
										if (local5677.aChar3 == local13 && local5677.aChar4 == local19) {
											if (local19 == 115) {
												aStringArray29[anInt7916++] = local5677.method3402(local353);
												return;
											}
											anIntArray473[anInt7920++] = local5677.method3394(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt7920 -= 3;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										local25 = anIntArray473[anInt7920 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5753) Class162 local5753 = Static108.aClass98_1.method2399(local19);
										if (local5753.aChar4 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray473[anInt7920++] = local5753.method3401(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray473[--anInt7920];
										local1145 = aStringArray29[--anInt7916];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5631 = Static108.aClass98_1.method2399(local13);
										if (local5631.aChar4 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray473[anInt7920++] = local5631.method3403(local1145) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray473[--anInt7920];
										@Pc(5851) Class162 local5851 = Static108.aClass98_1.method2399(local13);
										anIntArray473[anInt7920++] = local5851.aClass91_16.method2273();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static71.anInt1353 == 0) {
											anIntArray473[anInt7920++] = -2;
											return;
										}
										if (Static71.anInt1353 == 1) {
											anIntArray473[anInt7920++] = -1;
											return;
										}
										anIntArray473[anInt7920++] = Static99.anInt1760;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray473[--anInt7920];
										if (Static71.anInt1353 == 2 && local13 < Static99.anInt1760) {
											aStringArray29[anInt7916++] = Static187.aStringArray6[local13];
											if (Static527.aStringArray36[local13] != null) {
												aStringArray29[anInt7916++] = Static527.aStringArray36[local13];
												return;
											}
											aStringArray29[anInt7916++] = "";
											return;
										}
										aStringArray29[anInt7916++] = "";
										aStringArray29[anInt7916++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray473[--anInt7920];
										if (Static71.anInt1353 == 2 && local13 < Static99.anInt1760) {
											anIntArray473[anInt7920++] = Static225.anIntArray201[local13];
											return;
										}
										anIntArray473[anInt7920++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray473[--anInt7920];
										if (Static71.anInt1353 == 2 && local13 < Static99.anInt1760) {
											anIntArray473[anInt7920++] = Static7.anIntArray8[local13];
											return;
										}
										anIntArray473[anInt7920++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3978 = aStringArray29[--anInt7916];
										local19 = anIntArray473[--anInt7920];
										Static384.method5555(local3978, local19);
										return;
									}
									if (arg0 == 3605) {
										local3978 = aStringArray29[--anInt7916];
										Static176.method2784(local3978);
										return;
									}
									if (arg0 == 3606) {
										local3978 = aStringArray29[--anInt7916];
										Static115.method1626(local3978);
										return;
									}
									if (arg0 == 3607) {
										local3978 = aStringArray29[--anInt7916];
										Static158.method2592(false, local3978);
										return;
									}
									if (arg0 == 3608) {
										local3978 = aStringArray29[--anInt7916];
										Static146.method2465(local3978);
										return;
									}
									if (arg0 == 3609) {
										local3978 = aStringArray29[--anInt7916];
										if (local3978.startsWith("<img=0>") || local3978.startsWith("<img=1>")) {
											local3978 = local3978.substring(7);
										}
										anIntArray473[anInt7920++] = Static359.method5308(local3978) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray473[--anInt7920];
										if (Static71.anInt1353 == 2 && local13 < Static99.anInt1760) {
											aStringArray29[anInt7916++] = Static481.aStringArray32[local13];
											return;
										}
										aStringArray29[anInt7916++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static84.aString15 != null) {
											aStringArray29[anInt7916++] = Static351.method5248(Static84.aString15);
											return;
										}
										aStringArray29[anInt7916++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static84.aString15 != null) {
											anIntArray473[anInt7920++] = Static33.anInt723;
											return;
										}
										anIntArray473[anInt7920++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray473[--anInt7920];
										if (Static84.aString15 != null && local13 < Static33.anInt723) {
											aStringArray29[anInt7916++] = Static272.aClass254Array1[local13].aString76;
											return;
										}
										aStringArray29[anInt7916++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray473[--anInt7920];
										if (Static84.aString15 != null && local13 < Static33.anInt723) {
											anIntArray473[anInt7920++] = Static272.aClass254Array1[local13].anInt6737;
											return;
										}
										anIntArray473[anInt7920++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray473[--anInt7920];
										if (Static84.aString15 != null && local13 < Static33.anInt723) {
											anIntArray473[anInt7920++] = Static272.aClass254Array1[local13].aByte89;
											return;
										}
										anIntArray473[anInt7920++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray473[anInt7920++] = Static177.aByte111;
										return;
									}
									if (arg0 == 3617) {
										local3978 = aStringArray29[--anInt7916];
										Static84.method1361(local3978);
										return;
									}
									if (arg0 == 3618) {
										anIntArray473[anInt7920++] = Static591.aByte130;
										return;
									}
									if (arg0 == 3619) {
										local3978 = aStringArray29[--anInt7916];
										Static110.method1524(local3978);
										return;
									}
									if (arg0 == 3620) {
										Static88.method1394();
										return;
									}
									if (arg0 == 3621) {
										if (Static71.anInt1353 == 0) {
											anIntArray473[anInt7920++] = -1;
											return;
										}
										anIntArray473[anInt7920++] = Static549.anInt9183;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray473[--anInt7920];
										if (Static71.anInt1353 != 0 && local13 < Static549.anInt9183) {
											aStringArray29[anInt7916++] = Static149.aStringArray3[local13];
											if (Static314.aStringArray18[local13] != null) {
												aStringArray29[anInt7916++] = Static314.aStringArray18[local13];
												return;
											}
											aStringArray29[anInt7916++] = "";
											return;
										}
										aStringArray29[anInt7916++] = "";
										aStringArray29[anInt7916++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3978 = aStringArray29[--anInt7916];
										if (local3978.startsWith("<img=0>") || local3978.startsWith("<img=1>")) {
											local3978 = local3978.substring(7);
										}
										anIntArray473[anInt7920++] = Static234.method3456(local3978) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray473[--anInt7920];
										if (Static272.aClass254Array1 != null && local13 < Static33.anInt723 && Static272.aClass254Array1[local13].aString77.equalsIgnoreCase(Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aString35)) {
											anIntArray473[anInt7920++] = 1;
											return;
										}
										anIntArray473[anInt7920++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static7.aString1 != null) {
											aStringArray29[anInt7916++] = Static7.aString1;
											return;
										}
										aStringArray29[anInt7916++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray473[--anInt7920];
										if (Static84.aString15 != null && local13 < Static33.anInt723) {
											aStringArray29[anInt7916++] = Static272.aClass254Array1[local13].aString78;
											return;
										}
										aStringArray29[anInt7916++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray473[--anInt7920];
										if (Static71.anInt1353 == 2 && local13 >= 0 && local13 < Static99.anInt1760) {
											anIntArray473[anInt7920++] = Static317.aBooleanArray37[local13] ? 1 : 0;
											return;
										}
										anIntArray473[anInt7920++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3978 = aStringArray29[--anInt7916];
										if (local3978.startsWith("<img=0>") || local3978.startsWith("<img=1>")) {
											local3978 = local3978.substring(7);
										}
										anIntArray473[anInt7920++] = Static168.method2728(local3978);
										return;
									}
									if (arg0 == 3629) {
										anIntArray473[anInt7920++] = Static7.anInt227;
										return;
									}
									if (arg0 == 3630) {
										local3978 = aStringArray29[--anInt7916];
										Static158.method2592(true, local3978);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Static508.aBooleanArray35[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray473[--anInt7920];
										if (Static84.aString15 != null && local13 < Static33.anInt723) {
											aStringArray29[anInt7916++] = Static272.aClass254Array1[local13].aString77;
											return;
										}
										aStringArray29[anInt7916++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray473[--anInt7920];
										if (Static71.anInt1353 != 0 && local13 < Static549.anInt9183) {
											aStringArray29[anInt7916++] = Static433.aStringArray15[local13];
											return;
										}
										aStringArray29[anInt7916++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Static288.aClass7Array1[local13].method238();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Static288.aClass7Array1[local13].anInt278;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Static288.aClass7Array1[local13].anInt272;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Static288.aClass7Array1[local13].anInt280;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Static288.aClass7Array1[local13].anInt275;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Static288.aClass7Array1[local13].anInt276;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray473[--anInt7920];
										local19 = Static288.aClass7Array1[local13].method236();
										anIntArray473[anInt7920++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray473[--anInt7920];
										local19 = Static288.aClass7Array1[local13].method236();
										anIntArray473[anInt7920++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray473[--anInt7920];
										local19 = Static288.aClass7Array1[local13].method236();
										anIntArray473[anInt7920++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray473[--anInt7920];
										local19 = Static288.aClass7Array1[local13].method236();
										anIntArray473[anInt7920++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt7920 -= 5;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										local25 = anIntArray473[anInt7920 + 2];
										local353 = anIntArray473[anInt7920 + 3];
										local2309 = anIntArray473[anInt7920 + 4];
										anIntArray473[anInt7920++] = local13 + (local19 - local13) * (local2309 - local25) / (local353 - local25);
										return;
									}
									@Pc(7361) long local7361;
									@Pc(7354) long local7354;
									if (arg0 == 4007) {
										anInt7920 -= 2;
										local7354 = anIntArray473[anInt7920];
										local7361 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = (int) (local7354 + local7354 * local7361 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										if (local13 == 0) {
											anIntArray473[anInt7920++] = 0;
											return;
										}
										anIntArray473[anInt7920++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										if (local13 == 0) {
											anIntArray473[anInt7920++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray473[anInt7920++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray473[anInt7920++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt7920 -= 3;
										local7354 = anIntArray473[anInt7920];
										local7361 = anIntArray473[anInt7920 + 1];
										@Pc(7742) long local7742 = (long) anIntArray473[anInt7920 + 2];
										anIntArray473[anInt7920++] = (int) (local7354 * local7742 / local7361);
										return;
									}
									if (arg0 == 4019) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										if (local13 > 700 || local19 > 700) {
											anIntArray473[anInt7920++] = 256;
										}
										@Pc(7801) double local7801 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
										anIntArray473[anInt7920++] = (int) (Math.pow(2.0D, local7801) + 0.5D);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3978 = aStringArray29[--anInt7916];
										local19 = anIntArray473[--anInt7920];
										aStringArray29[anInt7916++] = local3978 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt7916 -= 2;
										local3978 = aStringArray29[anInt7916];
										local1145 = aStringArray29[anInt7916 + 1];
										aStringArray29[anInt7916++] = local3978 + local1145;
										return;
									}
									if (arg0 == 4102) {
										local3978 = aStringArray29[--anInt7916];
										local19 = anIntArray473[--anInt7920];
										aStringArray29[anInt7916++] = local3978 + Static266.method3884(local19);
										return;
									}
									if (arg0 == 4103) {
										local3978 = aStringArray29[--anInt7916];
										aStringArray29[anInt7916++] = local3978.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray29[anInt7916++] = method6316(anIntArray473[--anInt7920]);
										return;
									}
									if (arg0 == 4105) {
										anInt7916 -= 2;
										local3978 = aStringArray29[anInt7916];
										local1145 = aStringArray29[anInt7916 + 1];
										if (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aClass283_1 != null && Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aClass283_1.aBoolean580) {
											aStringArray29[anInt7916++] = local1145;
											return;
										}
										aStringArray29[anInt7916++] = local3978;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray473[--anInt7920];
										aStringArray29[anInt7916++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt7916 -= 2;
										anIntArray473[anInt7920++] = Static495.method6775(aStringArray29[anInt7916], Static161.anInt3095, aStringArray29[anInt7916 + 1]);
										return;
									}
									@Pc(8084) Class352 local8084;
									if (arg0 == 4108) {
										local3978 = aStringArray29[--anInt7916];
										anInt7920 -= 2;
										local19 = anIntArray473[anInt7920];
										local25 = anIntArray473[anInt7920 + 1];
										local8084 = Static337.method5009(local25, Static77.aClass308_183);
										anIntArray473[anInt7920++] = local8084.method7581(Static360.aClass5Array17, local3978, local19);
										return;
									}
									if (arg0 == 4109) {
										local3978 = aStringArray29[--anInt7916];
										anInt7920 -= 2;
										local19 = anIntArray473[anInt7920];
										local25 = anIntArray473[anInt7920 + 1];
										local8084 = Static337.method5009(local25, Static77.aClass308_183);
										anIntArray473[anInt7920++] = local8084.method7574(local19, local3978, Static360.aClass5Array17);
										return;
									}
									if (arg0 == 4110) {
										anInt7916 -= 2;
										local3978 = aStringArray29[anInt7916];
										local1145 = aStringArray29[anInt7916 + 1];
										if (anIntArray473[--anInt7920] == 1) {
											aStringArray29[anInt7916++] = local3978;
											return;
										}
										aStringArray29[anInt7916++] = local1145;
										return;
									}
									if (arg0 == 4111) {
										local3978 = aStringArray29[--anInt7916];
										aStringArray29[anInt7916++] = Static294.method4380(local3978);
										return;
									}
									if (arg0 == 4112) {
										local3978 = aStringArray29[--anInt7916];
										local19 = anIntArray473[--anInt7920];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray29[anInt7916++] = local3978 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Static295.method4394((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Static178.method2822((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Static62.method1013((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Static175.method2779((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3978 = aStringArray29[--anInt7916];
										if (local3978 != null) {
											anIntArray473[anInt7920++] = local3978.length();
											return;
										}
										anIntArray473[anInt7920++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3978 = aStringArray29[--anInt7916];
										anInt7920 -= 2;
										local19 = anIntArray473[anInt7920];
										local25 = anIntArray473[anInt7920 + 1];
										aStringArray29[anInt7916++] = local3978.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3978 = aStringArray29[--anInt7916];
										@Pc(8447) StringBuffer local8447 = new StringBuffer(local3978.length());
										@Pc(8449) boolean local8449 = false;
										for (local353 = 0; local353 < local3978.length(); local353++) {
											@Pc(8456) char local8456 = local3978.charAt(local353);
											if (local8456 == '<') {
												local8449 = true;
											} else if (local8456 == '>') {
												local8449 = false;
											} else if (!local8449) {
												local8447.append(local8456);
											}
										}
										aStringArray29[anInt7916++] = local8447.toString();
										return;
									}
									if (arg0 == 4120) {
										local3978 = aStringArray29[--anInt7916];
										anInt7920 -= 2;
										local19 = anIntArray473[anInt7920];
										local25 = anIntArray473[anInt7920 + 1];
										anIntArray473[anInt7920++] = local3978.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt7916 -= 2;
										local3978 = aStringArray29[anInt7916];
										local1145 = aStringArray29[anInt7916 + 1];
										local25 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = local3978.indexOf(local1145, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray473[--anInt7920] != 0;
										local19 = anIntArray473[--anInt7920];
										aStringArray29[anInt7916++] = Static370.method5419(0, Static161.anInt3095, (long) local19, local412);
										return;
									}
									if (arg0 == 4125) {
										local3978 = aStringArray29[--anInt7916];
										local19 = anIntArray473[--anInt7920];
										@Pc(8670) Class352 local8670 = Static337.method5009(local19, Static77.aClass308_183);
										anIntArray473[anInt7920++] = local8670.method7577(local3978, Static360.aClass5Array17);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray473[--anInt7920];
										aStringArray29[anInt7916++] = Static230.aClass225_1.method4857(local13).aString70;
										return;
									}
									@Pc(8732) Class222 local8732;
									if (arg0 == 4201) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										local8732 = Static230.aClass225_1.method4857(local13);
										if (local19 >= 1 && local19 <= 5 && local8732.aStringArray20[local19 - 1] != null) {
											aStringArray29[anInt7916++] = local8732.aStringArray20[local19 - 1];
											return;
										}
										aStringArray29[anInt7916++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										local8732 = Static230.aClass225_1.method4857(local13);
										if (local19 >= 1 && local19 <= 5 && local8732.aStringArray19[local19 - 1] != null) {
											aStringArray29[anInt7916++] = local8732.aStringArray19[local19 - 1];
											return;
										}
										aStringArray29[anInt7916++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Static230.aClass225_1.method4857(local13).anInt5915;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Static230.aClass225_1.method4857(local13).anInt5916 == 1 ? 1 : 0;
										return;
									}
									@Pc(8895) Class222 local8895;
									if (arg0 == 4205) {
										local13 = anIntArray473[--anInt7920];
										local8895 = Static230.aClass225_1.method4857(local13);
										if (local8895.anInt5866 == -1 && local8895.anInt5871 >= 0) {
											anIntArray473[anInt7920++] = local8895.anInt5871;
											return;
										}
										anIntArray473[anInt7920++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray473[--anInt7920];
										local8895 = Static230.aClass225_1.method4857(local13);
										if (local8895.anInt5866 >= 0 && local8895.anInt5871 >= 0) {
											anIntArray473[anInt7920++] = local8895.anInt5871;
											return;
										}
										anIntArray473[anInt7920++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Static230.aClass225_1.method4857(local13).aBoolean464 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										local3043 = Static256.aClass263_1.method5592(local19);
										if (local3043.method2329()) {
											aStringArray29[anInt7916++] = Static230.aClass225_1.method4857(local13).method4791(local19, local3043.aString24);
											return;
										}
										anIntArray473[anInt7920++] = Static230.aClass225_1.method4857(local13).method4794(local3043.anInt2658, local19);
										return;
									}
									if (arg0 == 4209) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1] - 1;
										local8732 = Static230.aClass225_1.method4857(local13);
										if (local8732.anInt5905 == local19) {
											anIntArray473[anInt7920++] = local8732.anInt5878;
											return;
										}
										if (local8732.anInt5886 == local19) {
											anIntArray473[anInt7920++] = local8732.anInt5913;
											return;
										}
										anIntArray473[anInt7920++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3978 = aStringArray29[--anInt7916];
										local19 = anIntArray473[--anInt7920];
										Static584.method7819(local19 == 1, local3978);
										anIntArray473[anInt7920++] = Static401.anInt7187;
										return;
									}
									if (arg0 == 4211) {
										if (Static413.aShortArray100 != null && Static577.anInt9528 < Static401.anInt7187) {
											anIntArray473[anInt7920++] = Static413.aShortArray100[Static577.anInt9528++] & 0xFFFF;
											return;
										}
										anIntArray473[anInt7920++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static577.anInt9528 = 0;
										return;
									}
									if (arg0 == 4213) {
										local13 = anIntArray473[--anInt7920];
										anIntArray473[anInt7920++] = Static230.aClass225_1.method4857(local13).anInt5888;
										return;
									}
									if (arg0 == 4214) {
										local3978 = aStringArray29[--anInt7916];
										anInt7920 -= 3;
										local19 = anIntArray473[anInt7920];
										local25 = anIntArray473[anInt7920 + 1];
										local353 = anIntArray473[anInt7920 + 2];
										Static392.method5632(local19 == 1, local3978, local25, local353);
										anIntArray473[anInt7920++] = Static401.anInt7187;
										return;
									}
									if (arg0 == 4215) {
										anInt7916 -= 2;
										anInt7920 -= 2;
										local3978 = aStringArray29[anInt7916];
										local19 = anIntArray473[anInt7920];
										local25 = anIntArray473[anInt7920 + 1];
										@Pc(9294) String local9294 = aStringArray29[anInt7916 + 1];
										Static331.method4897(local19 == 1, local9294, local3978, local25);
										anIntArray473[anInt7920++] = Static401.anInt7187;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										local3043 = Static256.aClass263_1.method5592(local19);
										if (local3043.method2329()) {
											aStringArray29[anInt7916++] = Static84.aClass242_1.method5281(local13).method7682(local19, local3043.aString24);
											return;
										}
										anIntArray473[anInt7920++] = Static84.aClass242_1.method5281(local13).method7685(local19, local3043.anInt2658);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										local3043 = Static256.aClass263_1.method5592(local19);
										if (local3043.method2329()) {
											aStringArray29[anInt7916++] = Static347.aClass122_4.method2770(local13).method3700(local3043.aString24, local19);
											return;
										}
										anIntArray473[anInt7920++] = Static347.aClass122_4.method2770(local13).method3710(local19, local3043.anInt2658);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt7920 -= 2;
										local13 = anIntArray473[anInt7920];
										local19 = anIntArray473[anInt7920 + 1];
										local3043 = Static256.aClass263_1.method5592(local19);
										if (local3043.method2329()) {
											aStringArray29[anInt7916++] = Static381.aClass359_1.method7783(local13).method5898(local3043.aString24, local19);
											return;
										}
										anIntArray473[anInt7920++] = Static381.aClass359_1.method7783(local13).method5899(local19, local3043.anInt2658);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray473[--anInt7920];
									@Pc(9522) Class114 local9522 = Static241.aClass340_1.method7431(local13);
									if (local9522.anIntArray136 != null && local9522.anIntArray136.length > 0) {
										local25 = 0;
										local353 = local9522.anIntArray137[0];
										for (local2309 = 1; local2309 < local9522.anIntArray136.length; local2309++) {
											if (local9522.anIntArray137[local2309] > local353) {
												local25 = local2309;
												local353 = local9522.anIntArray137[local2309];
											}
										}
										anIntArray473[anInt7920++] = local9522.anIntArray136[local25];
										return;
									}
									anIntArray473[anInt7920++] = local9522.anInt2991;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static512.method7155(anIntArray473[--anInt7920]);
					} else {
						local137 = arg1 ? aClass160_32 : aClass160_33;
					}
					Static415.method5900(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt7920 -= 2;
						local19 = anIntArray473[anInt7920];
						local25 = anIntArray473[anInt7920 + 1];
						if (local137.anInt4146 == -1) {
							Static280.method4170(local137.anInt4199);
							Static591.method7885(local137.anInt4199);
							Static23.method490(local137.anInt4199);
						}
						if (local19 == -1) {
							local137.anInt4172 = 1;
							local137.anInt4189 = -1;
							local137.anInt4205 = -1;
							return;
						}
						local137.anInt4205 = local19;
						local137.anInt4178 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean299 = true;
						} else {
							local137.aBoolean299 = false;
						}
						@Pc(1649) Class222 local1649 = Static230.aClass225_1.method4857(local19);
						local137.anInt4179 = local1649.anInt5901;
						local137.anInt4214 = local1649.anInt5921;
						local137.anInt4175 = local1649.lb;
						local137.anInt4212 = local1649.anInt5924;
						local137.anInt4135 = local1649.anInt5893;
						local137.anInt4209 = local1649.anInt5868;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt4157 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt4157 = 1;
						} else {
							local137.anInt4157 = 2;
						}
						if (local137.anInt4150 > 0) {
							local137.anInt4209 = local137.anInt4209 * 32 / local137.anInt4150;
							return;
						}
						if (local137.anInt4173 > 0) {
							local137.anInt4209 = local137.anInt4209 * 32 / local137.anInt4173;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt4172 = 2;
						local137.anInt4189 = anIntArray473[--anInt7920];
						if (local137.anInt4146 == -1) {
							Static169.method2729(local137.anInt4199);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt4172 = 3;
						local137.anInt4189 = -1;
						if (local137.anInt4146 == -1) {
							Static169.method2729(local137.anInt4199);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt4172 = 6;
						local137.anInt4189 = anIntArray473[--anInt7920];
						if (local137.anInt4146 == -1) {
							Static169.method2729(local137.anInt4199);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt4172 = 5;
						local137.anInt4189 = anIntArray473[--anInt7920];
						if (local137.anInt4146 == -1) {
							Static169.method2729(local137.anInt4199);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt7920 -= 4;
						local137.anInt4180 = anIntArray473[anInt7920];
						local137.anInt4168 = anIntArray473[anInt7920 + 1];
						local137.anInt4193 = anIntArray473[anInt7920 + 2];
						local137.anInt4164 = anIntArray473[anInt7920 + 3];
						Static415.method5900(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt7920 -= 2;
						local137.anInt4158 = anIntArray473[anInt7920];
						local137.anInt4196 = anIntArray473[anInt7920 + 1];
						Static415.method5900(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt7920 -= 4;
						local137.anInt4189 = anIntArray473[anInt7920];
						local137.anInt4197 = anIntArray473[anInt7920 + 1];
						if (anIntArray473[anInt7920 + 2] == 1) {
							local137.anInt4172 = 9;
						} else {
							local137.anInt4172 = 8;
						}
						if (anIntArray473[anInt7920 + 3] == 1) {
							local137.aBoolean299 = true;
						} else {
							local137.aBoolean299 = false;
						}
						if (local137.anInt4146 == -1) {
							Static169.method2729(local137.anInt4199);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt4172 = 5;
						local137.anInt4189 = Static310.anInt5693;
						local137.anInt4197 = 0;
						if (local137.anInt4146 == -1) {
							Static169.method2729(local137.anInt4199);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static512.method7155(anIntArray473[--anInt7920]);
				} else {
					local137 = arg1 ? aClass160_32 : aClass160_33;
				}
				if (arg0 == 1000) {
					anInt7920 -= 4;
					local137.anInt4137 = anIntArray473[anInt7920];
					local137.anInt4202 = anIntArray473[anInt7920 + 1];
					local19 = anIntArray473[anInt7920 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray473[anInt7920 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte56 = (byte) local19;
					local137.aByte58 = (byte) local25;
					Static415.method5900(local137);
					Static274.method4006(local137);
					if (local137.anInt4146 == -1) {
						Static436.method6201(local137.anInt4199);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt7920 -= 4;
					local137.anInt4173 = anIntArray473[anInt7920];
					local137.anInt4176 = anIntArray473[anInt7920 + 1];
					local137.anInt4150 = 0;
					local137.anInt4227 = 0;
					local19 = anIntArray473[anInt7920 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray473[anInt7920 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte57 = (byte) local19;
					local137.aByte55 = (byte) local25;
					Static415.method5900(local137);
					Static274.method4006(local137);
					if (local137.anInt4166 == 0) {
						Static361.method5313(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(645) boolean local645 = anIntArray473[--anInt7920] == 1;
					if (local137.aBoolean295 != local645) {
						local137.aBoolean295 = local645;
						Static415.method5900(local137);
					}
					if (local137.anInt4146 == -1) {
						Static230.method3420(local137.anInt4199);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt7920 -= 2;
					local137.anInt4141 = anIntArray473[anInt7920];
					local137.anInt4221 = anIntArray473[anInt7920 + 1];
					Static415.method5900(local137);
					Static274.method4006(local137);
					if (local137.anInt4166 == 0) {
						Static361.method5313(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean305 = anIntArray473[--anInt7920] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "(IZ)V")
	private static void method6315(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class1_Sub9 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray473[anInt7920++] = Static59.anInt1128;
				return;
			}
			if (arg0 == 5001) {
				anInt7920 -= 3;
				Static59.anInt1128 = anIntArray473[anInt7920];
				Static17.aClass41_1 = Static1.method37(anIntArray473[anInt7920 + 1]);
				if (Static17.aClass41_1 == null) {
					Static17.aClass41_1 = Static490.aClass41_3;
				}
				Static542.anInt9093 = anIntArray473[anInt7920 + 2];
				local52 = Static123.method2194(Static469.aClass235_2, Static311.aClass208_68);
				local52.aClass1_Sub3_Sub1_1.method7917(Static59.anInt1128);
				local52.aClass1_Sub3_Sub1_1.method7917(Static17.aClass41_1.anInt1145);
				local52.aClass1_Sub3_Sub1_1.method7917(Static542.anInt9093);
				Static42.method746(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt7916 -= 2;
				local83 = aStringArray29[anInt7916];
				local89 = aStringArray29[anInt7916 + 1];
				anInt7920 -= 2;
				local97 = anIntArray473[anInt7920];
				local103 = anIntArray473[anInt7920 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class1_Sub9 local125 = Static123.method2194(Static469.aClass235_2, Static203.aClass208_46);
				local125.aClass1_Sub3_Sub1_1.method7917(Static331.method4899(local83) + Static331.method4899(local89) + 2);
				local125.aClass1_Sub3_Sub1_1.method7920(local83);
				local125.aClass1_Sub3_Sub1_1.method7917(local97 - 1);
				local125.aClass1_Sub3_Sub1_1.method7917(local103);
				local125.aClass1_Sub3_Sub1_1.method7920(local89);
				Static42.method746(local125);
				return;
			}
			@Pc(179) Class57 local179;
			if (arg0 == 5003) {
				local175 = anIntArray473[--anInt7920];
				local179 = Static227.method3389(local175);
				local181 = "";
				if (local179 != null && local179.aString16 != null) {
					local181 = local179.aString16;
				}
				aStringArray29[anInt7916++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray473[--anInt7920];
				local179 = Static227.method3389(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt1578;
				}
				anIntArray473[anInt7920++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static17.aClass41_1 == null) {
					anIntArray473[anInt7920++] = -1;
					return;
				}
				anIntArray473[anInt7920++] = Static17.aClass41_1.anInt1145;
				return;
			}
			@Pc(269) Class1_Sub9 local269;
			if (arg0 == 5006) {
				local175 = anIntArray473[--anInt7920];
				local269 = Static123.method2194(Static469.aClass235_2, Static246.aClass208_56);
				local269.aClass1_Sub3_Sub1_1.method7917(local175);
				Static42.method746(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray29[--anInt7916];
				method6317(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt7916 -= 2;
				local83 = aStringArray29[anInt7916];
				local89 = aStringArray29[anInt7916 + 1];
				if (Static203.anInt3822 != 0 || (!Static381.aBoolean523 || Static81.aBoolean101) && !Static52.aBoolean594) {
					@Pc(328) Class1_Sub9 local328 = Static123.method2194(Static469.aClass235_2, Static207.aClass208_48);
					local328.aClass1_Sub3_Sub1_1.method7917(0);
					local103 = local328.aClass1_Sub3_Sub1_1.anInt9802;
					local328.aClass1_Sub3_Sub1_1.method7920(local83);
					Static228.method3396(local89, local328.aClass1_Sub3_Sub1_1);
					local328.aClass1_Sub3_Sub1_1.method7947(local328.aClass1_Sub3_Sub1_1.anInt9802 - local103);
					Static42.method746(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray473[--anInt7920];
				local179 = Static227.method3389(local175);
				local181 = "";
				if (local179 != null && local179.aString19 != null) {
					local181 = local179.aString19;
				}
				aStringArray29[anInt7916++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray473[--anInt7920];
				local179 = Static227.method3389(local175);
				local181 = "";
				if (local179 != null && local179.aString20 != null) {
					local181 = local179.aString20;
				}
				aStringArray29[anInt7916++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray473[--anInt7920];
				local179 = Static227.method3389(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt1577;
				}
				anIntArray473[anInt7920++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2 == null || Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aString34 == null) {
					local83 = Static251.aString51;
				} else {
					local83 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.method2947();
				}
				aStringArray29[anInt7916++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray473[anInt7920++] = Static542.anInt9093;
				return;
			}
			if (arg0 == 5017) {
				anIntArray473[anInt7920++] = Static293.method4365();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray473[--anInt7920];
				local179 = Static227.method3389(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt1580;
				}
				anIntArray473[anInt7920++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray473[--anInt7920];
				local179 = Static227.method3389(local175);
				local181 = "";
				if (local179 != null && local179.aString17 != null) {
					local181 = local179.aString17;
				}
				aStringArray29[anInt7916++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2 == null || Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.aString34 == null) {
					local83 = Static251.aString51;
				} else {
					local83 = Static201.aClass11_Sub1_Sub1_Sub3_Sub1_2.method2950();
				}
				aStringArray29[anInt7916++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray473[--anInt7920];
				local179 = Static227.method3389(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt1581;
				}
				anIntArray473[anInt7920++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray473[--anInt7920];
				local179 = Static227.method3389(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt1574;
				}
				anIntArray473[anInt7920++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray473[--anInt7920];
				local179 = Static227.method3389(local175);
				local181 = "";
				if (local179 != null && local179.aString18 != null) {
					local181 = local179.aString18;
				}
				aStringArray29[anInt7916++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray473[--anInt7920];
				aStringArray29[anInt7916++] = Static90.aClass128_7.method2975(local175).aString14;
				return;
			}
			@Pc(736) Class1_Sub8_Sub3 local736;
			if (arg0 == 5051) {
				local175 = anIntArray473[--anInt7920];
				local736 = Static90.aClass128_7.method2975(local175);
				if (local736.anIntArray68 == null) {
					anIntArray473[anInt7920++] = 0;
					return;
				}
				anIntArray473[anInt7920++] = local736.anIntArray68.length;
				return;
			}
			if (arg0 == 5052) {
				anInt7920 -= 2;
				local175 = anIntArray473[anInt7920];
				local776 = anIntArray473[anInt7920 + 1];
				@Pc(781) Class1_Sub8_Sub3 local781 = Static90.aClass128_7.method2975(local175);
				local103 = local781.anIntArray68[local776];
				anIntArray473[anInt7920++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray473[--anInt7920];
				local736 = Static90.aClass128_7.method2975(local175);
				if (local736.anIntArray67 == null) {
					anIntArray473[anInt7920++] = 0;
					return;
				}
				anIntArray473[anInt7920++] = local736.anIntArray67.length;
				return;
			}
			if (arg0 == 5054) {
				anInt7920 -= 2;
				local175 = anIntArray473[anInt7920];
				local776 = anIntArray473[anInt7920 + 1];
				anIntArray473[anInt7920++] = Static90.aClass128_7.method2975(local175).anIntArray67[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray473[--anInt7920];
				aStringArray29[anInt7916++] = Static109.aClass211_1.method4599(local175).method7109();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray473[--anInt7920];
				@Pc(907) Class1_Sub8_Sub17 local907 = Static109.aClass211_1.method4599(local175);
				if (local907.anIntArray531 == null) {
					anIntArray473[anInt7920++] = 0;
					return;
				}
				anIntArray473[anInt7920++] = local907.anIntArray531.length;
				return;
			}
			if (arg0 == 5057) {
				anInt7920 -= 2;
				local175 = anIntArray473[anInt7920];
				local776 = anIntArray473[anInt7920 + 1];
				anIntArray473[anInt7920++] = Static109.aClass211_1.method4599(local175).anIntArray531[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass70_1 = new Class70();
				aClass70_1.anInt1778 = anIntArray473[--anInt7920];
				aClass70_1.aClass1_Sub8_Sub17_1 = Static109.aClass211_1.method4599(aClass70_1.anInt1778);
				aClass70_1.anIntArray80 = new int[aClass70_1.aClass1_Sub8_Sub17_1.method7105()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static123.method2194(Static469.aClass235_2, Static474.aClass208_98);
				local52.aClass1_Sub3_Sub1_1.method7917(0);
				local776 = local52.aClass1_Sub3_Sub1_1.anInt9802;
				local52.aClass1_Sub3_Sub1_1.method7917(0);
				local52.aClass1_Sub3_Sub1_1.method7937(aClass70_1.anInt1778);
				aClass70_1.aClass1_Sub8_Sub17_1.method7101(aClass70_1.anIntArray80, local52.aClass1_Sub3_Sub1_1);
				local52.aClass1_Sub3_Sub1_1.method7947(local52.aClass1_Sub3_Sub1_1.anInt9802 - local776);
				Static42.method746(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray29[--anInt7916];
				local269 = Static123.method2194(Static469.aClass235_2, Static25.aClass208_11);
				local269.aClass1_Sub3_Sub1_1.method7917(0);
				local97 = local269.aClass1_Sub3_Sub1_1.anInt9802;
				local269.aClass1_Sub3_Sub1_1.method7920(local83);
				local269.aClass1_Sub3_Sub1_1.method7937(aClass70_1.anInt1778);
				aClass70_1.aClass1_Sub8_Sub17_1.method7101(aClass70_1.anIntArray80, local269.aClass1_Sub3_Sub1_1);
				local269.aClass1_Sub3_Sub1_1.method7947(local269.aClass1_Sub3_Sub1_1.anInt9802 - local97);
				Static42.method746(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static123.method2194(Static469.aClass235_2, Static474.aClass208_98);
				local52.aClass1_Sub3_Sub1_1.method7917(0);
				local776 = local52.aClass1_Sub3_Sub1_1.anInt9802;
				local52.aClass1_Sub3_Sub1_1.method7917(1);
				local52.aClass1_Sub3_Sub1_1.method7937(aClass70_1.anInt1778);
				aClass70_1.aClass1_Sub8_Sub17_1.method7101(aClass70_1.anIntArray80, local52.aClass1_Sub3_Sub1_1);
				local52.aClass1_Sub3_Sub1_1.method7947(local52.aClass1_Sub3_Sub1_1.anInt9802 - local776);
				Static42.method746(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt7920 -= 2;
				local175 = anIntArray473[anInt7920];
				local776 = anIntArray473[anInt7920 + 1];
				anIntArray473[anInt7920++] = Static90.aClass128_7.method2975(local175).aCharArray3[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt7920 -= 2;
				local175 = anIntArray473[anInt7920];
				local776 = anIntArray473[anInt7920 + 1];
				anIntArray473[anInt7920++] = Static90.aClass128_7.method2975(local175).aCharArray2[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt7920 -= 2;
				local175 = anIntArray473[anInt7920];
				local776 = anIntArray473[anInt7920 + 1];
				if (local776 == -1) {
					anIntArray473[anInt7920++] = -1;
					return;
				}
				anIntArray473[anInt7920++] = Static90.aClass128_7.method2975(local175).method1322((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt7920 -= 2;
				local175 = anIntArray473[anInt7920];
				local776 = anIntArray473[anInt7920 + 1];
				if (local776 == -1) {
					anIntArray473[anInt7920++] = -1;
					return;
				}
				anIntArray473[anInt7920++] = Static90.aClass128_7.method2975(local175).method1325((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray473[--anInt7920];
				anIntArray473[anInt7920++] = Static109.aClass211_1.method4599(local175).method7105();
				return;
			}
			if (arg0 == 5067) {
				anInt7920 -= 2;
				local175 = anIntArray473[anInt7920];
				local776 = anIntArray473[anInt7920 + 1];
				local97 = Static109.aClass211_1.method4599(local175).method7108(local776).anInt3214;
				anIntArray473[anInt7920++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt7920 -= 2;
				local175 = anIntArray473[anInt7920];
				local776 = anIntArray473[anInt7920 + 1];
				aClass70_1.anIntArray80[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt7920 -= 2;
				local175 = anIntArray473[anInt7920];
				local776 = anIntArray473[anInt7920 + 1];
				aClass70_1.anIntArray80[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt7920 -= 3;
				local175 = anIntArray473[anInt7920];
				local776 = anIntArray473[anInt7920 + 1];
				local97 = anIntArray473[anInt7920 + 2];
				@Pc(1448) Class1_Sub8_Sub17 local1448 = Static109.aClass211_1.method4599(local175);
				if (local1448.method7108(local776).anInt3214 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray473[anInt7920++] = local1448.method7106(local776, local97);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray29[--anInt7916];
				local1496 = anIntArray473[--anInt7920] == 1;
				Static257.method3748(local83, local1496);
				anIntArray473[anInt7920++] = Static401.anInt7187;
				return;
			}
			if (arg0 == 5072) {
				if (Static413.aShortArray100 != null && Static577.anInt9528 < Static401.anInt7187) {
					anIntArray473[anInt7920++] = Static413.aShortArray100[Static577.anInt9528++] & 0xFFFF;
					return;
				}
				anIntArray473[anInt7920++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static577.anInt9528 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static326.aClass97_3.method2365(86)) {
					anIntArray473[anInt7920++] = 1;
					return;
				}
				anIntArray473[anInt7920++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static326.aClass97_3.method2365(82)) {
					anIntArray473[anInt7920++] = 1;
					return;
				}
				anIntArray473[anInt7920++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static326.aClass97_3.method2365(81)) {
					anIntArray473[anInt7920++] = 1;
					return;
				}
				anIntArray473[anInt7920++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static106.method1498(anIntArray473[--anInt7920]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray473[anInt7920++] = Static568.method7211();
					return;
				}
				if (arg0 == 5205) {
					Static589.method7857(anIntArray473[--anInt7920], -1, -1, false);
					return;
				}
				@Pc(1696) Class1_Sub8_Sub11 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray473[--anInt7920];
					local1696 = Static287.method3143(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray473[anInt7920++] = -1;
						return;
					}
					anIntArray473[anInt7920++] = local1696.anInt7421;
					return;
				}
				@Pc(1729) Class1_Sub8_Sub11 local1729;
				if (arg0 == 5207) {
					local1729 = Static287.method3162(anIntArray473[--anInt7920]);
					if (local1729 != null && local1729.aString85 != null) {
						aStringArray29[anInt7916++] = local1729.aString85;
						return;
					}
					aStringArray29[anInt7916++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray473[anInt7920++] = Static141.anInt2742;
					anIntArray473[anInt7920++] = Static401.anInt7185;
					return;
				}
				if (arg0 == 5209) {
					anIntArray473[anInt7920++] = Static500.anInt8734 + Static287.anInt3859;
					anIntArray473[anInt7920++] = Static249.anInt4547 + Static287.anInt3862;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray473[--anInt7920];
					local1696 = Static287.method3162(local175);
					if (local1696 == null) {
						anIntArray473[anInt7920++] = 0;
						anIntArray473[anInt7920++] = 0;
						return;
					}
					anIntArray473[anInt7920++] = local1696.anInt7427 >> 14 & 0x3FFF;
					anIntArray473[anInt7920++] = local1696.anInt7427 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray473[--anInt7920];
					local1696 = Static287.method3162(local175);
					if (local1696 == null) {
						anIntArray473[anInt7920++] = 0;
						anIntArray473[anInt7920++] = 0;
						return;
					}
					anIntArray473[anInt7920++] = local1696.anInt7416 - local1696.anInt7429;
					anIntArray473[anInt7920++] = local1696.anInt7424 - local1696.anInt7418;
					return;
				}
				@Pc(1919) Class1_Sub51 local1919;
				if (arg0 == 5212) {
					local1919 = Static206.method3168();
					if (local1919 == null) {
						anIntArray473[anInt7920++] = -1;
						anIntArray473[anInt7920++] = -1;
						return;
					}
					anIntArray473[anInt7920++] = local1919.anInt9675;
					local776 = local1919.anInt9678 << 28 | local1919.anInt9680 + Static287.anInt3859 << 14 | local1919.anInt9679 + Static287.anInt3862;
					anIntArray473[anInt7920++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static535.method5755();
					if (local1919 == null) {
						anIntArray473[anInt7920++] = -1;
						anIntArray473[anInt7920++] = -1;
						return;
					}
					anIntArray473[anInt7920++] = local1919.anInt9675;
					local776 = local1919.anInt9678 << 28 | local1919.anInt9680 + Static287.anInt3859 << 14 | local1919.anInt9679 + Static287.anInt3862;
					anIntArray473[anInt7920++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray473[--anInt7920];
					local1696 = Static178.method2824();
					if (local1696 != null) {
						local2067 = local1696.method5981(local175 & 0x3FFF, local175 >> 28 & 0x3, anIntArray474, local175 >> 14 & 0x3FFF);
						if (local2067) {
							Static506.method7087(anIntArray474[2], anIntArray474[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt7920 -= 2;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					@Pc(2105) Class170 local2105 = Static287.method3159(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class1_Sub8_Sub11 local2112 = (Class1_Sub8_Sub11) local2105.method3553(); local2112 != null; local2112 = (Class1_Sub8_Sub11) local2105.method3544()) {
						if (local2112.anInt7421 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray473[anInt7920++] = 1;
						return;
					}
					anIntArray473[anInt7920++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray473[--anInt7920];
					local1696 = Static287.method3162(local175);
					if (local1696 == null) {
						anIntArray473[anInt7920++] = -1;
						return;
					}
					anIntArray473[anInt7920++] = local1696.anInt7423;
					return;
				}
				if (arg0 == 5220) {
					anIntArray473[anInt7920++] = Static142.anInt2752 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray473[--anInt7920];
					Static506.method7087(local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static178.method2824();
					if (local1729 != null) {
						local1496 = local1729.method5977(anIntArray474, Static500.anInt8734 + Static287.anInt3859, Static249.anInt4547 + Static287.anInt3862);
						if (local1496) {
							anIntArray473[anInt7920++] = anIntArray474[1];
							anIntArray473[anInt7920++] = anIntArray474[2];
							return;
						}
						anIntArray473[anInt7920++] = -1;
						anIntArray473[anInt7920++] = -1;
						return;
					}
					anIntArray473[anInt7920++] = -1;
					anIntArray473[anInt7920++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt7920 -= 2;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					Static589.method7857(local175, local776 & 0x3FFF, local776 >> 14 & 0x3FFF, false);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray473[--anInt7920];
					local1696 = Static178.method2824();
					if (local1696 != null) {
						local2067 = local1696.method5981(local175 & 0x3FFF, local175 >> 28 & 0x3, anIntArray474, local175 >> 14 & 0x3FFF);
						if (local2067) {
							anIntArray473[anInt7920++] = anIntArray474[1];
							anIntArray473[anInt7920++] = anIntArray474[2];
							return;
						}
						anIntArray473[anInt7920++] = -1;
						anIntArray473[anInt7920++] = -1;
						return;
					}
					anIntArray473[anInt7920++] = -1;
					anIntArray473[anInt7920++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray473[--anInt7920];
					local1696 = Static178.method2824();
					if (local1696 != null) {
						local2067 = local1696.method5977(anIntArray474, local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
						if (local2067) {
							anIntArray473[anInt7920++] = anIntArray474[1];
							anIntArray473[anInt7920++] = anIntArray474[2];
							return;
						}
						anIntArray473[anInt7920++] = -1;
						anIntArray473[anInt7920++] = -1;
						return;
					}
					anIntArray473[anInt7920++] = -1;
					anIntArray473[anInt7920++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static582.method7791(anIntArray473[--anInt7920]);
					return;
				}
				if (arg0 == 5227) {
					anInt7920 -= 2;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					Static589.method7857(local175, local776 & 0x3FFF, local776 >> 14 & 0x3FFF, true);
					return;
				}
				if (arg0 == 5228) {
					Static39.aBoolean48 = anIntArray473[--anInt7920] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray473[anInt7920++] = Static39.aBoolean48 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray473[--anInt7920];
					Static364.method6709(local175);
					return;
				}
				@Pc(2625) Class1 local2625;
				if (arg0 == 5231) {
					anInt7920 -= 2;
					local175 = anIntArray473[anInt7920];
					local1496 = anIntArray473[anInt7920 + 1] == 1;
					if (Static239.aClass91_18 != null) {
						local2625 = Static239.aClass91_18.method2271((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method7908();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class1();
							Static239.aClass91_18.method2269((long) local175, local2625);
						}
					}
					return;
				}
				@Pc(2667) Class1 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray473[--anInt7920];
					if (Static239.aClass91_18 != null) {
						local2667 = Static239.aClass91_18.method2271((long) local175);
						anIntArray473[anInt7920++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray473[anInt7920++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt7920 -= 2;
					local175 = anIntArray473[anInt7920];
					local1496 = anIntArray473[anInt7920 + 1] == 1;
					if (Static541.aClass91_36 != null) {
						local2625 = Static541.aClass91_36.method2271((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method7908();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class1();
							Static541.aClass91_36.method2269((long) local175, local2625);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray473[--anInt7920];
					if (Static541.aClass91_36 != null) {
						local2667 = Static541.aClass91_36.method2271((long) local175);
						anIntArray473[anInt7920++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray473[anInt7920++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray473[anInt7920++] = Static287.aClass1_Sub8_Sub11_2 == null ? -1 : Static287.aClass1_Sub8_Sub11_2.anInt7421;
					return;
				}
				if (arg0 == 5236) {
					anInt7920 -= 2;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static93.method1416(local97, local103, local175);
					if (local2833 < 0) {
						anIntArray473[anInt7920++] = -1;
						return;
					}
					anIntArray473[anInt7920++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static382.method7880();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt7920 -= 2;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					Static447.method6284(local776, false, 3, local175);
					anIntArray473[anInt7920++] = Static180.aFrame5 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static180.aFrame5 != null) {
						Static447.method6284(-1, false, Static86.aClass1_Sub30_Sub1_1.anInt6199, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2917) Class19[] local2917 = Static146.method2468();
					anIntArray473[anInt7920++] = local2917.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray473[--anInt7920];
					@Pc(2941) Class19[] local2941 = Static146.method2468();
					anIntArray473[anInt7920++] = local2941[local175].anInt637;
					anIntArray473[anInt7920++] = local2941[local175].anInt642;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static86.aClass1_Sub30_Sub1_1.anInt6190;
					local776 = Static86.aClass1_Sub30_Sub1_1.anInt6201;
					local97 = -1;
					@Pc(2978) Class19[] local2978 = Static146.method2468();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class19 local2985 = local2978[local2833];
						if (local2985.anInt637 == local175 && local2985.anInt642 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray473[anInt7920++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray473[anInt7920++] = Static470.method2475();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray473[--anInt7920];
					if (local175 >= 1 && local175 <= 2) {
						Static447.method6284(-1, false, local175, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.anInt6199;
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray473[--anInt7920];
					if (local175 >= 1 && local175 <= 2) {
						Static86.aClass1_Sub30_Sub1_1.anInt6199 = local175;
						Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt7916 -= 2;
					local83 = aStringArray29[anInt7916];
					local89 = aStringArray29[anInt7916 + 1];
					local97 = anIntArray473[--anInt7920];
					@Pc(3124) Class1_Sub9 local3124 = Static123.method2194(Static469.aClass235_2, Static314.aClass208_69);
					local3124.aClass1_Sub3_Sub1_1.method7917(Static331.method4899(local83) + Static331.method4899(local89) + 1);
					local3124.aClass1_Sub3_Sub1_1.method7920(local83);
					local3124.aClass1_Sub3_Sub1_1.method7920(local89);
					local3124.aClass1_Sub3_Sub1_1.method7917(local97);
					Static42.method746(local3124);
					return;
				}
				if (arg0 == 5401) {
					anInt7920 -= 2;
					Static337.aShortArray50[anIntArray473[anInt7920]] = (short) Static4.method7629(anIntArray473[anInt7920 + 1]);
					Static230.aClass225_1.method4858();
					Static230.aClass225_1.method4861();
					Static84.aClass242_1.method5274();
					Static506.method7088();
					return;
				}
				if (arg0 == 5405) {
					anInt7920 -= 2;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static260.anIntArrayArrayArray13[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt7920 -= 7;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1] << 1;
					local97 = anIntArray473[anInt7920 + 2];
					local103 = anIntArray473[anInt7920 + 3];
					local2833 = anIntArray473[anInt7920 + 4];
					@Pc(3262) int local3262 = anIntArray473[anInt7920 + 5];
					@Pc(3268) int local3268 = anIntArray473[anInt7920 + 6];
					if (local175 >= 0 && local175 < 2 && Static260.anIntArrayArrayArray13[local175] != null && local776 >= 0 && local776 < Static260.anIntArrayArrayArray13[local175].length) {
						Static260.anIntArrayArrayArray13[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3268 };
						Static260.anIntArrayArrayArray13[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3262 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static260.anIntArrayArrayArray13[anIntArray473[--anInt7920]].length >> 1;
					anIntArray473[anInt7920++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static180.aFrame5 != null) {
						Static447.method6284(-1, false, Static86.aClass1_Sub30_Sub1_1.anInt6199, -1);
					}
					if (Static73.aFrame1 != null) {
						Static132.method2304();
						System.exit(0);
						return;
					}
					local83 = Static392.aString83 == null ? Static286.method4306() : Static392.aString83;
					Static13.method258(false, local83, Static286.anInt5239 == 1, Static361.aClass198_3);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static439.aClass191_14 != null) {
						if (Static439.aClass191_14.anObject11 == null) {
							local83 = Static468.method6492(Static439.aClass191_14.anInt5011);
						} else {
							local83 = (String) Static439.aClass191_14.anObject11;
						}
					}
					aStringArray29[anInt7916++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray473[anInt7920++] = Static361.aClass198_3.aBoolean401 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static180.aFrame5 != null) {
						Static447.method6284(-1, false, Static86.aClass1_Sub30_Sub1_1.anInt6199, -1);
					}
					local83 = aStringArray29[--anInt7916];
					local1496 = anIntArray473[--anInt7920] == 1;
					local181 = Static286.method4306() + local83;
					Static13.method258(local1496, local181, Static286.anInt5239 == 1, Static361.aClass198_3);
					return;
				}
				if (arg0 == 5422) {
					anInt7916 -= 2;
					local83 = aStringArray29[anInt7916];
					local89 = aStringArray29[anInt7916 + 1];
					local97 = anIntArray473[--anInt7920];
					if (local83.length() > 0) {
						if (Static79.aStringArray2 == null) {
							Static79.aStringArray2 = new String[Static92.anIntArray76[Static101.aClass42_1.anInt1150]];
						}
						Static79.aStringArray2[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static353.aStringArray23 == null) {
							Static353.aStringArray23 = new String[Static92.anIntArray76[Static101.aClass42_1.anInt1150]];
						}
						Static353.aStringArray23[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray29[--anInt7916]);
					return;
				}
				if (arg0 == 5424) {
					anInt7920 -= 11;
					Static593.anInt9729 = anIntArray473[anInt7920];
					Static138.anInt2724 = anIntArray473[anInt7920 + 1];
					Static413.anInt7320 = anIntArray473[anInt7920 + 2];
					Static197.anInt3802 = anIntArray473[anInt7920 + 3];
					Static500.anInt8737 = anIntArray473[anInt7920 + 4];
					Static221.anInt4092 = anIntArray473[anInt7920 + 5];
					Static162.anInt3144 = anIntArray473[anInt7920 + 6];
					Static76.anInt6355 = anIntArray473[anInt7920 + 7];
					Static445.anInt7838 = anIntArray473[anInt7920 + 8];
					Static306.anInt4906 = anIntArray473[anInt7920 + 9];
					Static55.anInt1066 = anIntArray473[anInt7920 + 10];
					Static121.aClass308_48.method6538(Static500.anInt8737);
					Static121.aClass308_48.method6538(Static221.anInt4092);
					Static121.aClass308_48.method6538(Static162.anInt3144);
					Static121.aClass308_48.method6538(Static76.anInt6355);
					Static121.aClass308_48.method6538(Static445.anInt7838);
					Static468.aClass5_35 = null;
					Static524.aClass5_3 = null;
					Static83.aClass5_6 = null;
					Static483.aClass5_36 = null;
					Static440.aClass5_34 = null;
					Static567.aClass5_25 = null;
					Static524.aClass5_4 = null;
					Static582.aClass5_38 = null;
					Static527.aBoolean672 = true;
					return;
				}
				if (arg0 == 5425) {
					Static366.method5382();
					Static527.aBoolean672 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt7920 -= 2;
					Static533.anInt8981 = anIntArray473[anInt7920];
					Static133.anInt2655 = anIntArray473[anInt7920 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt7920 -= 2;
					Static505.anInt8777 = anIntArray473[anInt7920 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt7920 -= 2;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					anIntArray473[anInt7920++] = Static25.method535(local776, local175) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static185.method3004(aStringArray29[--anInt7916], false, false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static597.method645(Static433.anApplet2, "accountcreated");
						return;
					} catch (@Pc(3800) Throwable local3800) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static597.method645(Static433.anApplet2, "accountcreatestarted");
						return;
					} catch (@Pc(3811) Throwable local3811) {
						return;
					}
				}
				if (arg0 == 5432) {
					local83 = "";
					if (Static375.aClipboard1 != null) {
						@Pc(3823) Transferable local3823 = Static375.aClipboard1.getContents(null);
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
					aStringArray29[anInt7916++] = local83;
					return;
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt7920 -= 4;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					local97 = anIntArray473[anInt7920 + 2];
					local103 = anIntArray473[anInt7920 + 3];
					Static195.method5286((local175 >> 14 & 0x3FFF) - Static539.anInt9045, false, local103, local97, local776 << 2, (local175 & 0x3FFF) - Static311.anInt5708);
					return;
				}
				if (arg0 == 5501) {
					anInt7920 -= 4;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					local97 = anIntArray473[anInt7920 + 2];
					local103 = anIntArray473[anInt7920 + 3];
					Static189.method3048((local175 & 0x3FFF) - Static311.anInt5708, local97, local103, (local175 >> 14 & 0x3FFF) - Static539.anInt9045, local776 << 2);
					return;
				}
				if (arg0 == 5502) {
					anInt7920 -= 6;
					local175 = anIntArray473[anInt7920];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static452.anInt7956 = local175;
					local776 = anIntArray473[anInt7920 + 1];
					if (local776 + 1 >= Static260.anIntArrayArrayArray13[Static452.anInt7956].length >> 1) {
						throw new RuntimeException();
					}
					Static148.anInt2831 = local776;
					Static567.anInt6884 = 0;
					Static563.anInt9342 = anIntArray473[anInt7920 + 2];
					Static294.anInt5308 = anIntArray473[anInt7920 + 3];
					local97 = anIntArray473[anInt7920 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static528.anInt8968 = local97;
					local103 = anIntArray473[anInt7920 + 5];
					if (local103 + 1 >= Static260.anIntArrayArrayArray13[Static528.anInt8968].length >> 1) {
						throw new RuntimeException();
					}
					Static422.anInt7420 = local103;
					Static358.anInt9363 = 3;
					Static434.anInt7761 = -1;
					Static469.anInt8080 = -1;
					return;
				}
				if (arg0 == 5503) {
					Static88.method1393();
					return;
				}
				if (arg0 == 5504) {
					anInt7920 -= 2;
					Static445.method6247(anIntArray473[anInt7920 + 1], anIntArray473[anInt7920]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray473[anInt7920++] = (int) Static487.aFloat206 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray473[anInt7920++] = (int) Static331.aFloat172 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static146.method2467();
					return;
				}
				if (arg0 == 5508) {
					Static576.method3312();
					return;
				}
				if (arg0 == 5509) {
					Static514.method7163();
					return;
				}
				if (arg0 == 5510) {
					Static299.method4575();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray473[--anInt7920];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static539.anInt9045;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static458.anInt9736) {
						local776 = Static458.anInt9736;
					}
					local97 -= Static311.anInt5708;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static378.anInt6747) {
						local97 = Static378.anInt6747;
					}
					Static576.anInt4080 = (local776 << 9) + 256;
					Static273.anInt1191 = (local97 << 9) + 256;
					Static358.anInt9363 = 4;
					Static434.anInt7761 = -1;
					Static469.anInt8080 = -1;
					return;
				}
				if (arg0 == 5512) {
					Static238.method2517();
					return;
				}
				if (arg0 == 5517) {
					local175 = anIntArray473[--anInt7920];
					if (local175 == -1) {
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static539.anInt9045;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static458.anInt9736) {
							local776 = Static458.anInt9736;
						}
						local97 -= Static311.anInt5708;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static378.anInt6747) {
							local97 = Static378.anInt6747;
						}
						Static469.anInt8080 = (local776 << 9) + 256;
						Static434.anInt7761 = (local97 << 9) + 256;
						return;
					}
					Static469.anInt8080 = -1;
					Static434.anInt7761 = -1;
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt7916 -= 2;
					local83 = aStringArray29[anInt7916];
					local89 = aStringArray29[anInt7916 + 1];
					local97 = anIntArray473[--anInt7920];
					if (Static55.anInt1068 != 3) {
						return;
					}
					if (Static517.anInt8881 == 0 && Static468.anInt8074 == 0) {
						Static251.aString51 = local83;
						Static130.aString22 = local89;
						Static307.anInt7603 = local97;
						Static318.method4726(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static474.method6560();
					return;
				}
				if (arg0 == 5602) {
					if (Static517.anInt8881 == 0) {
						Static548.anInt9157 = -2;
						Static591.anInt9713 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt7920 -= 4;
					if (Static55.anInt1068 != 3) {
						return;
					}
					if (Static517.anInt8881 == 0 && Static468.anInt8074 == 0) {
						Static136.method2380(anIntArray473[anInt7920 + 1], anIntArray473[anInt7920 + 3], anIntArray473[anInt7920 + 2], anIntArray473[anInt7920]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt7916--;
					if (Static55.anInt1068 != 3) {
						return;
					}
					if (Static517.anInt8881 == 0 && Static468.anInt8074 == 0) {
						Static141.method2413(Static309.method4632(aStringArray29[anInt7916]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt7916 -= 2;
					if (Static55.anInt1068 != 3) {
						return;
					}
					if (Static517.anInt8881 == 0 && Static468.anInt8074 == 0) {
						Static464.method7011(false, Static309.method4632(aStringArray29[anInt7916]), aStringArray29[anInt7916 + 1]);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static468.anInt8074 == 0) {
						Static432.anInt7738 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray473[anInt7920++] = Static591.anInt9713;
					return;
				}
				if (arg0 == 5608) {
					anIntArray473[anInt7920++] = Static83.anInt1568;
					return;
				}
				if (arg0 == 5609) {
					anIntArray473[anInt7920++] = Static432.anInt7738;
					return;
				}
				if (arg0 == 5610) {
					for (local175 = 0; local175 < 5; local175++) {
						aStringArray29[anInt7916++] = Static425.aStringArray27 == null || Static425.aStringArray27.length <= local175 ? "" : Static351.method5248(Static425.aStringArray27[local175]);
					}
					Static425.aStringArray27 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray473[anInt7920++] = Static397.anInt7112;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray473[--anInt7920];
					if (Static55.anInt1068 != 7) {
						return;
					}
					if (Static517.anInt8881 == 0 && Static468.anInt8074 == 0) {
						if (Static485.aClass43_1 != null) {
							Static485.aClass43_1.method1044();
							Static485.aClass43_1 = null;
						}
						Static307.anInt7603 = local175;
						Static318.method4726(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray473[anInt7920++] = Static591.anInt9713;
					return;
				}
				if (arg0 == 5615) {
					anInt7916 -= 2;
					local83 = aStringArray29[anInt7916];
					local89 = aStringArray29[anInt7916 + 1];
					if (Static55.anInt1068 != 3) {
						return;
					}
					if (Static517.anInt8881 == 0 && Static468.anInt8074 == 0) {
						if (Static485.aClass43_1 != null) {
							Static485.aClass43_1.method1044();
							Static485.aClass43_1 = null;
						}
						Static251.aString51 = local83;
						Static130.aString22 = local89;
						Static318.method4726(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static136.method2372(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray473[anInt7920++] = Static548.anInt9157;
					return;
				}
				if (arg0 == 5618) {
					local175 = anIntArray473[--anInt7920];
					Static188.method3045(false, local175);
					return;
				}
				if (arg0 == 5619) {
					local175 = anIntArray473[--anInt7920];
					Static188.method3045(true, local175);
					return;
				}
				if (arg0 == 5620) {
					Static34.method640();
					if (Static271.aString56 != "" && Static271.aString56 != "") {
						anIntArray473[anInt7920++] = 1;
						return;
					}
					anIntArray473[anInt7920++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt7916 -= 2;
					if (Static55.anInt1068 != 3) {
						return;
					}
					if (Static517.anInt8881 == 0 && Static468.anInt8074 == 0) {
						Static464.method7011(true, Static309.method4632(aStringArray29[anInt7916]), aStringArray29[anInt7916 + 1]);
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4719) Class191 local4719 = Static361.aClass198_3.method4291(false, "3");
					while (local4719.anInt5014 == 0) {
						Static408.method5841(1L);
					}
					if (local4719.anInt5014 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4739) Class268 local4739 = (Class268) local4719.anObject11;
					if (local4739.method5817().exists()) {
						@Pc(4749) Class1_Sub3 local4749 = new Class1_Sub3(50);
						try {
							local4739.method5810(local4749.aByteArray104, 50, 0);
						} catch (@Pc(4758) IOException local4758) {
						}
					}
					try {
						local4739.method5816();
						return;
					} catch (@Pc(4764) Exception local4764) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static213.aString42 != null) {
						anIntArray473[anInt7920++] = 1;
						return;
					}
					anIntArray473[anInt7920++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray473[anInt7920++] = (int) (Static495.aLong230 >> 32);
					anIntArray473[anInt7920++] = (int) (Static495.aLong230 & 0xFFFFL);
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray473[--anInt7920];
					if (local175 < 1) {
						local175 = 1;
					}
					if (local175 > 4) {
						local175 = 4;
					}
					Static86.aClass1_Sub30_Sub1_1.anInt6184 = local175;
					Static207.method3172();
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6002) {
					Static86.aClass1_Sub30_Sub1_1.method5036(anIntArray473[--anInt7920] == 1);
					Static207.method3172();
					Static405.method5819();
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6003) {
					Static86.aClass1_Sub30_Sub1_1.aBoolean483 = anIntArray473[--anInt7920] == 1;
					Static405.method5819();
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6005) {
					Static86.aClass1_Sub30_Sub1_1.aBoolean487 = anIntArray473[--anInt7920] == 1;
					Static207.method3172();
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6006) {
					Static86.aClass1_Sub30_Sub1_1.aBoolean486 = anIntArray473[--anInt7920] == 1;
					Static31.aClass78_18.method6824(!Static86.aClass1_Sub30_Sub1_1.aBoolean486);
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6007) {
					Static86.aClass1_Sub30_Sub1_1.anInt6193 = anIntArray473[--anInt7920];
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6008) {
					Static86.aClass1_Sub30_Sub1_1.aBoolean488 = anIntArray473[--anInt7920] == 1;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6009) {
					Static86.aClass1_Sub30_Sub1_1.aBoolean484 = anIntArray473[--anInt7920] == 1;
					Static207.method3172();
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6010) {
					Static86.aClass1_Sub30_Sub1_1.aBoolean477 = anIntArray473[--anInt7920] == 1;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6011) {
					local175 = anIntArray473[--anInt7920];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static86.aClass1_Sub30_Sub1_1.method5022(local175, Static286.anInt5239);
					Static207.method3172();
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6012) {
					Static86.aClass1_Sub30_Sub1_1.method5024(anIntArray473[--anInt7920] == 1, Static286.anInt5239);
					Static308.method4625();
					Static585.method7837();
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6014) {
					Static86.aClass1_Sub30_Sub1_1.aBoolean478 = anIntArray473[--anInt7920] == 1;
					Static207.method3172();
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6015) {
					Static86.aClass1_Sub30_Sub1_1.aBoolean476 = anIntArray473[--anInt7920] == 1;
					Static207.method3172();
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6016) {
					local175 = anIntArray473[--anInt7920];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static86.aClass1_Sub30_Sub1_1.anInt6186 = local175;
					Static358.method7632(Static286.anInt5239);
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					return;
				}
				if (arg0 == 6017) {
					Static86.aClass1_Sub30_Sub1_1.aBoolean479 = anIntArray473[--anInt7920] == 1;
					Static381.method5503();
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6018) {
					local175 = anIntArray473[--anInt7920];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static86.aClass1_Sub30_Sub1_1.anInt6185 = local175;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray473[--anInt7920];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static86.aClass1_Sub30_Sub1_1.anInt6189) {
						if (Static86.aClass1_Sub30_Sub1_1.anInt6189 == 0 && Static106.anInt1789 != -1) {
							Static33.method637(Static106.anInt1789, local175, Static51.aClass308_24);
							Static115.method1625();
							Static11.aBoolean8 = false;
						} else if (local175 == 0) {
							Static340.method5066();
							Static11.aBoolean8 = false;
						} else {
							Static302.method6279(local175);
						}
						Static86.aClass1_Sub30_Sub1_1.anInt6189 = local175;
					}
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6020) {
					local175 = anIntArray473[--anInt7920];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static86.aClass1_Sub30_Sub1_1.anInt6196 = local175;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6021) {
					Static86.aClass1_Sub30_Sub1_1.aBoolean492 = anIntArray473[--anInt7920] == 1;
					Static405.method5819();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray473[--anInt7920];
					local1496 = false;
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 2) {
						local175 = 2;
					}
					if (Static221.anInt4095 < 96) {
						local175 = 0;
						local1496 = true;
					}
					Static386.method5577(local175);
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					anIntArray473[anInt7920++] = local1496 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local175 = anIntArray473[--anInt7920];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static86.aClass1_Sub30_Sub1_1.anInt6202 = local175;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					return;
				}
				if (arg0 == 6025) {
					local175 = anIntArray473[--anInt7920];
					if (local175 < 0 || local175 > Static523.method6293(Static221.anInt4095)) {
						local175 = 0;
					}
					Static86.aClass1_Sub30_Sub1_1.anInt6197 = local175;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray473[--anInt7920];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static165.method2704(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static86.aClass1_Sub30_Sub1_1.aBoolean481 = anIntArray473[--anInt7920] != 0;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					return;
				}
				if (arg0 == 6029) {
					Static86.aClass1_Sub30_Sub1_1.anInt6193 = anIntArray473[--anInt7920];
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					return;
				}
				if (arg0 == 6030) {
					Static86.aClass1_Sub30_Sub1_1.aBoolean480 = anIntArray473[--anInt7920] != 0;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static207.method3172();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray473[--anInt7920];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static358.method7632(local175);
					return;
				}
				if (arg0 == 6032) {
					local175 = anIntArray473[--anInt7920];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static86.aClass1_Sub30_Sub1_1.anInt6200 = local175;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6033) {
					local175 = anIntArray473[--anInt7920];
					if (local175 < 0 || local175 > 4) {
						local175 = 2;
					}
					Static86.aClass1_Sub30_Sub1_1.anInt6204 = local175;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					return;
				}
				if (arg0 == 6034) {
					Static86.aClass1_Sub30_Sub1_1.aBoolean475 = anIntArray473[--anInt7920] == 1;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static308.method4625();
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6035) {
					Static86.aClass1_Sub30_Sub1_1.aBoolean490 = anIntArray473[--anInt7920] == 1;
					Static207.method3172();
					Static405.method5819();
					return;
				}
				if (arg0 == 6036) {
					local175 = anIntArray473[--anInt7920];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static86.aClass1_Sub30_Sub1_1.method5042(local175);
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					return;
				}
				if (arg0 == 6037) {
					local175 = anIntArray473[--anInt7920];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static86.aClass1_Sub30_Sub1_1.anInt6205 = local175;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray473[--anInt7920];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static86.aClass1_Sub30_Sub1_1.anInt6192 && Static106.anInt1789 == Static463.anInt8042) {
						if (Static86.aClass1_Sub30_Sub1_1.anInt6192 == 0) {
							Static33.method637(Static106.anInt1789, local175, Static51.aClass308_24);
							Static115.method1625();
							Static11.aBoolean8 = false;
						} else if (local175 == 0) {
							Static340.method5066();
							Static11.aBoolean8 = false;
						} else {
							Static302.method6279(local175);
						}
					}
					Static86.aClass1_Sub30_Sub1_1.anInt6192 = local175;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray473[--anInt7920];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static86.aClass1_Sub30_Sub1_1.anInt6180) {
						Static86.aClass1_Sub30_Sub1_1.anInt6180 = local175;
						Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
						Static518.aBoolean696 = false;
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.anInt6184;
					return;
				}
				if (arg0 == 6102) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.method5032(Static286.anInt5239) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.aBoolean483 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.aBoolean487 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.aBoolean486 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.anInt6193;
					return;
				}
				if (arg0 == 6108) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.aBoolean488 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.aBoolean484 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.aBoolean477 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.method5023(Static286.anInt5239);
					return;
				}
				if (arg0 == 6112) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.method5019(Static286.anInt5239) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.aBoolean478 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.aBoolean476 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.anInt6186;
					return;
				}
				if (arg0 == 6117) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.aBoolean479 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.anInt6185;
					return;
				}
				if (arg0 == 6119) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.anInt6189;
					return;
				}
				if (arg0 == 6120) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.anInt6196;
					return;
				}
				if (arg0 == 6121) {
					anIntArray473[anInt7920++] = Static31.aClass78_18.method6808() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray473[anInt7920++] = Static209.method7199();
					return;
				}
				if (arg0 == 6124) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.anInt6202;
					return;
				}
				if (arg0 == 6125) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.anInt6197;
					return;
				}
				if (arg0 == 6126) {
					anIntArray473[anInt7920++] = Static31.aClass78_18.method6840() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.aBoolean474 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.aBoolean481 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.anInt6193;
					return;
				}
				if (arg0 == 6130) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.aBoolean480 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray473[anInt7920++] = Static286.anInt5239;
					return;
				}
				if (arg0 == 6132) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.anInt6200;
					return;
				}
				if (arg0 == 6133) {
					anIntArray473[anInt7920++] = Static361.aClass198_3.aBoolean401 && !Static361.aClass198_3.aBoolean402 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray473[anInt7920++] = Static523.method6293(Static221.anInt4095);
					return;
				}
				if (arg0 == 6135) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.anInt6204;
					return;
				}
				if (arg0 == 6136) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.aBoolean475 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(6356) boolean local6356 = true;
					try {
						local6356 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(6366) Throwable local6366) {
					}
					anIntArray473[anInt7920++] = local6356 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray473[anInt7920++] = Static271.method3981(200, Static286.anInt5239);
					return;
				}
				if (arg0 == 6139) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.method5026(Static286.anInt5239);
					return;
				}
				if (arg0 == 6140) {
					@Pc(6414) byte local6414 = 0;
					if (Static204.method3114(Static286.anInt5239) && Static221.anInt4095 < 96) {
						local6414 = 1;
					}
					anIntArray473[anInt7920++] = local6414;
					return;
				}
				if (arg0 == 6141) {
					if (Static221.anInt4095 < 96) {
						anIntArray473[anInt7920++] = 0;
						return;
					}
					anIntArray473[anInt7920++] = 2;
					return;
				}
				if (arg0 == 6142) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.anInt6205;
					return;
				}
				if (arg0 == 6143) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.anInt6192;
					return;
				}
				if (arg0 == 6144) {
					anIntArray473[anInt7920++] = Static216.aBoolean283 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.anInt6180;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt7920 -= 2;
					Static408.aShort85 = (short) anIntArray473[anInt7920];
					if (Static408.aShort85 <= 0) {
						Static408.aShort85 = 256;
					}
					Static501.aShort108 = (short) anIntArray473[anInt7920 + 1];
					if (Static501.aShort108 <= 0) {
						Static501.aShort108 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt7920 -= 2;
					Static339.aShort66 = (short) anIntArray473[anInt7920];
					if (Static339.aShort66 <= 0) {
						Static339.aShort66 = 256;
					}
					Static57.aShort20 = (short) anIntArray473[anInt7920 + 1];
					if (Static57.aShort20 <= 0) {
						Static57.aShort20 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt7920 -= 4;
					Static377.aShort68 = (short) anIntArray473[anInt7920];
					if (Static377.aShort68 <= 0) {
						Static377.aShort68 = 1;
					}
					Static333.aShort65 = (short) anIntArray473[anInt7920 + 1];
					if (Static333.aShort65 <= 0) {
						Static333.aShort65 = 32767;
					} else if (Static333.aShort65 < Static377.aShort68) {
						Static333.aShort65 = Static377.aShort68;
					}
					Static316.aShort63 = (short) anIntArray473[anInt7920 + 2];
					if (Static316.aShort63 <= 0) {
						Static316.aShort63 = 1;
					}
					Static344.aShort67 = (short) anIntArray473[anInt7920 + 3];
					if (Static344.aShort67 <= 0) {
						Static344.aShort67 = 32767;
						return;
					}
					if (Static344.aShort67 < Static316.aShort63) {
						Static344.aShort67 = Static316.aShort63;
					}
					return;
				}
				if (arg0 == 6203) {
					Static311.method4639(0, Static428.aClass160_30.anInt4156, false, Static428.aClass160_30.anInt4182, 0);
					anIntArray473[anInt7920++] = Static357.anInt6522;
					anIntArray473[anInt7920++] = Static186.anInt3690;
					return;
				}
				if (arg0 == 6204) {
					anIntArray473[anInt7920++] = Static339.aShort66;
					anIntArray473[anInt7920++] = Static57.aShort20;
					return;
				}
				if (arg0 == 6205) {
					anIntArray473[anInt7920++] = Static408.aShort85;
					anIntArray473[anInt7920++] = Static501.aShort108;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray473[anInt7920++] = (int) (Static480.method6650() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray473[anInt7920++] = (int) (Static480.method6650() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt7920 -= 3;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					local97 = anIntArray473[anInt7920 + 2];
					aCalendar2.clear();
					aCalendar2.set(11, 12);
					aCalendar2.set(local97, local776, local175);
					local103 = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray473[anInt7920++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar2.clear();
					aCalendar2.setTime(new Date(Static480.method6650()));
					anIntArray473[anInt7920++] = aCalendar2.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray473[--anInt7920];
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
					anIntArray473[anInt7920++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray473[anInt7920++] = Static518.method7607() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray473[anInt7920++] = Static407.method5833() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static55.anInt1068 == 7 && Static517.anInt8881 == 0 && Static468.anInt8074 == 0) {
						if (Static118.aBoolean183) {
							anIntArray473[anInt7920++] = 0;
							return;
						}
						if (Static72.aLong41 > Static480.method6650() - 1000L) {
							anIntArray473[anInt7920++] = 1;
							return;
						}
						Static118.aBoolean183 = true;
						local52 = Static123.method2194(Static469.aClass235_2, Static97.aClass208_30);
						local52.aClass1_Sub3_Sub1_1.method7936(Static430.anInt7688);
						Static42.method746(local52);
						anIntArray473[anInt7920++] = 0;
						return;
					}
					anIntArray473[anInt7920++] = 1;
					return;
				}
				@Pc(7037) Class186 local7037;
				@Pc(7004) Class248_Sub1 local7004;
				if (arg0 == 6501) {
					local7004 = Static494.method6770();
					if (local7004 != null) {
						anIntArray473[anInt7920++] = local7004.anInt8307;
						anIntArray473[anInt7920++] = local7004.anInt8296;
						aStringArray29[anInt7916++] = local7004.aString93;
						local7037 = local7004.method6712();
						anIntArray473[anInt7920++] = local7037.anInt4873;
						aStringArray29[anInt7916++] = local7037.aString53;
						anIntArray473[anInt7920++] = local7004.anInt8293;
						anIntArray473[anInt7920++] = local7004.anInt8306;
						aStringArray29[anInt7916++] = local7004.aString92;
						return;
					}
					anIntArray473[anInt7920++] = -1;
					anIntArray473[anInt7920++] = 0;
					aStringArray29[anInt7916++] = "";
					anIntArray473[anInt7920++] = 0;
					aStringArray29[anInt7916++] = "";
					anIntArray473[anInt7920++] = 0;
					anIntArray473[anInt7920++] = 0;
					aStringArray29[anInt7916++] = "";
					return;
				}
				if (arg0 == 6502) {
					local7004 = Static237.method3499();
					if (local7004 != null) {
						anIntArray473[anInt7920++] = local7004.anInt8307;
						anIntArray473[anInt7920++] = local7004.anInt8296;
						aStringArray29[anInt7916++] = local7004.aString93;
						local7037 = local7004.method6712();
						anIntArray473[anInt7920++] = local7037.anInt4873;
						aStringArray29[anInt7916++] = local7037.aString53;
						anIntArray473[anInt7920++] = local7004.anInt8293;
						anIntArray473[anInt7920++] = local7004.anInt8306;
						aStringArray29[anInt7916++] = local7004.aString92;
						return;
					}
					anIntArray473[anInt7920++] = -1;
					anIntArray473[anInt7920++] = 0;
					aStringArray29[anInt7916++] = "";
					anIntArray473[anInt7920++] = 0;
					aStringArray29[anInt7916++] = "";
					anIntArray473[anInt7920++] = 0;
					anIntArray473[anInt7920++] = 0;
					aStringArray29[anInt7916++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray473[--anInt7920];
					local89 = aStringArray29[--anInt7916];
					if (Static55.anInt1068 == 7 && Static517.anInt8881 == 0 && Static468.anInt8074 == 0) {
						anIntArray473[anInt7920++] = Static247.method3623(local89, local175) ? 1 : 0;
						return;
					}
					anIntArray473[anInt7920++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static86.aClass1_Sub30_Sub1_1.anInt6194 = anIntArray473[--anInt7920];
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					return;
				}
				if (arg0 == 6505) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.anInt6194;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray473[--anInt7920];
					@Pc(7394) Class248_Sub1 local7394 = Static160.method2621(local175);
					if (local7394 != null) {
						anIntArray473[anInt7920++] = local7394.anInt8296;
						aStringArray29[anInt7916++] = local7394.aString93;
						@Pc(7418) Class186 local7418 = local7394.method6712();
						anIntArray473[anInt7920++] = local7418.anInt4873;
						aStringArray29[anInt7916++] = local7418.aString53;
						anIntArray473[anInt7920++] = local7394.anInt8293;
						anIntArray473[anInt7920++] = local7394.anInt8306;
						aStringArray29[anInt7916++] = local7394.aString92;
						return;
					}
					anIntArray473[anInt7920++] = -1;
					aStringArray29[anInt7916++] = "";
					anIntArray473[anInt7920++] = 0;
					aStringArray29[anInt7916++] = "";
					anIntArray473[anInt7920++] = 0;
					anIntArray473[anInt7920++] = 0;
					aStringArray29[anInt7916++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt7920 -= 4;
					local175 = anIntArray473[anInt7920];
					local1496 = anIntArray473[anInt7920 + 1] == 1;
					local97 = anIntArray473[anInt7920 + 2];
					local2107 = anIntArray473[anInt7920 + 3] == 1;
					Static74.method2814(local97, local175, local2107, local1496);
					return;
				}
				if (arg0 == 6508) {
					Static338.method5037();
					return;
				}
				if (arg0 == 6509) {
					if (Static55.anInt1068 != 7) {
						return;
					}
					Static80.aBoolean98 = anIntArray473[--anInt7920] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray473[anInt7920++] = Static405.anInt7235;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static86.aClass1_Sub30_Sub1_1.aBoolean485 = anIntArray473[--anInt7920] == 1;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					return;
				}
				if (arg0 == 6601) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.aBoolean485 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static33.aClass139_1 == Static85.aClass139_2) {
				if (arg0 == 6700) {
					local175 = Static148.aClass91_6.method2273();
					if (Static165.anInt3165 != -1) {
						local175++;
					}
					anIntArray473[anInt7920++] = local175;
					return;
				}
				if (arg0 == 6701) {
					local175 = anIntArray473[--anInt7920];
					if (Static165.anInt3165 != -1) {
						if (local175 == 0) {
							anIntArray473[anInt7920++] = Static165.anInt3165;
							return;
						}
						local175--;
					}
					@Pc(7705) Class1_Sub38 local7705 = (Class1_Sub38) Static148.aClass91_6.method2278();
					while (local175-- > 0) {
						local7705 = (Class1_Sub38) Static148.aClass91_6.method2276();
					}
					anIntArray473[anInt7920++] = local7705.anInt7676;
					return;
				}
				if (arg0 == 6702) {
					local175 = anIntArray473[--anInt7920];
					if (Static115.aClass160ArrayArray1[local175] == null) {
						aStringArray29[anInt7916++] = "";
						return;
					}
					local89 = Static115.aClass160ArrayArray1[local175][0].aString46;
					if (local89 == null) {
						aStringArray29[anInt7916++] = "";
						return;
					}
					aStringArray29[anInt7916++] = local89.substring(0, local89.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local175 = anIntArray473[--anInt7920];
					if (Static115.aClass160ArrayArray1[local175] == null) {
						anIntArray473[anInt7920++] = 0;
						return;
					}
					anIntArray473[anInt7920++] = Static115.aClass160ArrayArray1[local175].length;
					return;
				}
				if (arg0 == 6704) {
					anInt7920 -= 2;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					if (Static115.aClass160ArrayArray1[local175] == null) {
						aStringArray29[anInt7916++] = "";
						return;
					}
					local181 = Static115.aClass160ArrayArray1[local175][local776].aString46;
					if (local181 == null) {
						aStringArray29[anInt7916++] = "";
						return;
					}
					aStringArray29[anInt7916++] = local181;
					return;
				}
				if (arg0 == 6705) {
					anInt7920 -= 2;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					if (Static115.aClass160ArrayArray1[local175] == null) {
						anIntArray473[anInt7920++] = 0;
						return;
					}
					anIntArray473[anInt7920++] = Static115.aClass160ArrayArray1[local175][local776].anInt4177;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt7920 -= 3;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					local97 = anIntArray473[anInt7920 + 2];
					Static30.method577(1, local175 << 16 | local776, local97, "");
					return;
				}
				if (arg0 == 6708) {
					anInt7920 -= 3;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					local97 = anIntArray473[anInt7920 + 2];
					Static30.method577(2, local175 << 16 | local776, local97, "");
					return;
				}
				if (arg0 == 6709) {
					anInt7920 -= 3;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					local97 = anIntArray473[anInt7920 + 2];
					Static30.method577(3, local175 << 16 | local776, local97, "");
					return;
				}
				if (arg0 == 6710) {
					anInt7920 -= 3;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					local97 = anIntArray473[anInt7920 + 2];
					Static30.method577(4, local175 << 16 | local776, local97, "");
					return;
				}
				if (arg0 == 6711) {
					anInt7920 -= 3;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					local97 = anIntArray473[anInt7920 + 2];
					Static30.method577(5, local175 << 16 | local776, local97, "");
					return;
				}
				if (arg0 == 6712) {
					anInt7920 -= 3;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					local97 = anIntArray473[anInt7920 + 2];
					Static30.method577(6, local175 << 16 | local776, local97, "");
					return;
				}
				if (arg0 == 6713) {
					anInt7920 -= 3;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					local97 = anIntArray473[anInt7920 + 2];
					Static30.method577(7, local175 << 16 | local776, local97, "");
					return;
				}
				if (arg0 == 6714) {
					anInt7920 -= 3;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					local97 = anIntArray473[anInt7920 + 2];
					Static30.method577(8, local175 << 16 | local776, local97, "");
					return;
				}
				if (arg0 == 6715) {
					anInt7920 -= 3;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					local97 = anIntArray473[anInt7920 + 2];
					Static30.method577(9, local175 << 16 | local776, local97, "");
					return;
				}
				if (arg0 == 6716) {
					anInt7920 -= 3;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					local97 = anIntArray473[anInt7920 + 2];
					Static30.method577(10, local175 << 16 | local776, local97, "");
					return;
				}
				if (arg0 == 6717) {
					anInt7920 -= 3;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					local97 = anIntArray473[anInt7920 + 2];
					@Pc(8293) Class160 local8293 = Static420.method5959(local175 << 16 | local776, local97);
					Static193.method3074();
					@Pc(8298) Class1_Sub10 local8298 = Static67.method1098(local8293);
					Static330.method4880(local8298.anInt649, local8293, local8298.method574());
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(8326) Class345 local8326;
				if (arg0 == 6800) {
					local175 = anIntArray473[--anInt7920];
					local8326 = Static144.aClass113_1.method2595(local175);
					if (local8326.aString101 == null) {
						aStringArray29[anInt7916++] = "";
						return;
					}
					aStringArray29[anInt7916++] = local8326.aString101;
					return;
				}
				if (arg0 == 6801) {
					local175 = anIntArray473[--anInt7920];
					local8326 = Static144.aClass113_1.method2595(local175);
					anIntArray473[anInt7920++] = local8326.anInt9195;
					return;
				}
				if (arg0 == 6802) {
					local175 = anIntArray473[--anInt7920];
					local8326 = Static144.aClass113_1.method2595(local175);
					anIntArray473[anInt7920++] = local8326.anInt9173;
					return;
				}
				if (arg0 == 6803) {
					local175 = anIntArray473[--anInt7920];
					local8326 = Static144.aClass113_1.method2595(local175);
					anIntArray473[anInt7920++] = local8326.anInt9198;
					return;
				}
				if (arg0 == 6804) {
					anInt7920 -= 2;
					local175 = anIntArray473[anInt7920];
					local776 = anIntArray473[anInt7920 + 1];
					@Pc(8448) Class94 local8448 = Static256.aClass263_1.method5592(local776);
					if (local8448.method2329()) {
						aStringArray29[anInt7916++] = Static144.aClass113_1.method2595(local175).method7485(local776, local8448.aString24);
						return;
					}
					anIntArray473[anInt7920++] = Static144.aClass113_1.method2595(local175).method7491(local776, local8448.anInt2658);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray473[anInt7920++] = Static381.aBoolean523 && !Static81.aBoolean101 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray473[anInt7920++] = Static195.anInt6509;
					return;
				}
				if (arg0 == 6902) {
					anIntArray473[anInt7920++] = Static69.anInt1340;
					return;
				}
				if (arg0 == 6903) {
					anIntArray473[anInt7920++] = Static262.anInt4770;
					return;
				}
				if (arg0 == 6904) {
					anIntArray473[anInt7920++] = Static429.anInt7680;
					return;
				}
				if (arg0 == 6905) {
					local83 = "";
					if (Static439.aClass191_14 != null) {
						if (Static439.aClass191_14.anObject11 == null) {
							local83 = Static468.method6492(Static439.aClass191_14.anInt5011);
						} else {
							local83 = (String) Static439.aClass191_14.anObject11;
						}
					}
					aStringArray29[anInt7916++] = local83;
					return;
				}
				if (arg0 == 6906) {
					anIntArray473[anInt7920++] = Static165.anInt3164;
					return;
				}
				if (arg0 == 6907) {
					anIntArray473[anInt7920++] = Static241.anInt4479;
					return;
				}
				if (arg0 == 6908) {
					anIntArray473[anInt7920++] = Static341.anInt6292;
					return;
				}
				if (arg0 == 6909) {
					anIntArray473[anInt7920++] = Static145.aBoolean208 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray473[anInt7920++] = Static76.anInt6368;
					return;
				}
				if (arg0 == 6911) {
					anIntArray473[anInt7920++] = Static495.anInt8375;
					return;
				}
				if (arg0 == 6912) {
					anIntArray473[anInt7920++] = Static435.anInt7762;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local175 = Static86.aClass1_Sub30_Sub1_1.method5025();
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.anInt6206 = Static286.anInt5239;
					anIntArray473[anInt7920++] = local175;
					Static207.method3172();
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 7001) {
					Static86.aClass1_Sub30_Sub1_1.method5044();
					Static207.method3172();
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 7002) {
					Static86.aClass1_Sub30_Sub1_1.method5028();
					Static207.method3172();
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 7003) {
					Static86.aClass1_Sub30_Sub1_1.method5030();
					Static207.method3172();
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 7004) {
					Static86.aClass1_Sub30_Sub1_1.method5043(true);
					Static207.method3172();
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 7005) {
					Static86.aClass1_Sub30_Sub1_1.anInt6195 = 0;
					Static86.aClass1_Sub30_Sub1_1.method5035(Static361.aClass198_3);
					Static518.aBoolean696 = false;
					return;
				}
				if (arg0 == 7006) {
					if (Static86.aClass1_Sub30_Sub1_1.anInt6206 == 2) {
						Static86.aClass1_Sub30_Sub1_1.aBoolean491 = true;
						return;
					}
					if (Static86.aClass1_Sub30_Sub1_1.anInt6206 == 1) {
						Static86.aClass1_Sub30_Sub1_1.aBoolean493 = true;
						return;
					}
					if (Static86.aClass1_Sub30_Sub1_1.anInt6206 == 3) {
						Static86.aClass1_Sub30_Sub1_1.aBoolean494 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray473[anInt7920++] = Static86.aClass1_Sub30_Sub1_1.anInt6195;
					return;
				}
				if (arg0 == 7008) {
					if (Static286.anInt5239 == 0 && Static221.anInt4095 < 96) {
						anIntArray473[anInt7920++] = 1;
						return;
					}
					anIntArray473[anInt7920++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)Ljava/lang/String;")
	private static String method6316(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray31[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method6317(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static203.anInt3822 == 0 && (Static381.aBoolean523 && !Static81.aBoolean101 || Static52.aBoolean594)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static375.aClass253_51.method5453(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static375.aClass253_51.method5453(0).length());
		} else if (local11.startsWith(Static375.aClass253_52.method5453(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static375.aClass253_52.method5453(0).length());
		} else if (local11.startsWith(Static375.aClass253_53.method5453(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static375.aClass253_53.method5453(0).length());
		} else if (local11.startsWith(Static375.aClass253_54.method5453(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static375.aClass253_54.method5453(0).length());
		} else if (local11.startsWith(Static375.aClass253_55.method5453(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static375.aClass253_55.method5453(0).length());
		} else if (local11.startsWith(Static375.aClass253_56.method5453(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static375.aClass253_56.method5453(0).length());
		} else if (local11.startsWith(Static375.aClass253_57.method5453(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static375.aClass253_57.method5453(0).length());
		} else if (local11.startsWith(Static375.aClass253_58.method5453(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static375.aClass253_58.method5453(0).length());
		} else if (local11.startsWith(Class253.lb.method5453(0))) {
			local13 = 8;
			arg0 = arg0.substring(Class253.lb.method5453(0).length());
		} else if (local11.startsWith(Static375.aClass253_59.method5453(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static375.aClass253_59.method5453(0).length());
		} else if (local11.startsWith(Static375.aClass253_60.method5453(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static375.aClass253_60.method5453(0).length());
		} else if (local11.startsWith(Static375.aClass253_61.method5453(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static375.aClass253_61.method5453(0).length());
		} else if (Static161.anInt3095 != 0) {
			if (local11.startsWith(Static375.aClass253_51.method5453(Static161.anInt3095))) {
				local13 = 0;
				arg0 = arg0.substring(Static375.aClass253_51.method5453(Static161.anInt3095).length());
			} else if (local11.startsWith(Static375.aClass253_52.method5453(Static161.anInt3095))) {
				local13 = 1;
				arg0 = arg0.substring(Static375.aClass253_52.method5453(Static161.anInt3095).length());
			} else if (local11.startsWith(Static375.aClass253_53.method5453(Static161.anInt3095))) {
				local13 = 2;
				arg0 = arg0.substring(Static375.aClass253_53.method5453(Static161.anInt3095).length());
			} else if (local11.startsWith(Static375.aClass253_54.method5453(Static161.anInt3095))) {
				local13 = 3;
				arg0 = arg0.substring(Static375.aClass253_54.method5453(Static161.anInt3095).length());
			} else if (local11.startsWith(Static375.aClass253_55.method5453(Static161.anInt3095))) {
				local13 = 4;
				arg0 = arg0.substring(Static375.aClass253_55.method5453(Static161.anInt3095).length());
			} else if (local11.startsWith(Static375.aClass253_56.method5453(Static161.anInt3095))) {
				local13 = 5;
				arg0 = arg0.substring(Static375.aClass253_56.method5453(Static161.anInt3095).length());
			} else if (local11.startsWith(Static375.aClass253_57.method5453(Static161.anInt3095))) {
				local13 = 6;
				arg0 = arg0.substring(Static375.aClass253_57.method5453(Static161.anInt3095).length());
			} else if (local11.startsWith(Static375.aClass253_58.method5453(Static161.anInt3095))) {
				local13 = 7;
				arg0 = arg0.substring(Static375.aClass253_58.method5453(Static161.anInt3095).length());
			} else if (local11.startsWith(Class253.lb.method5453(Static161.anInt3095))) {
				local13 = 8;
				arg0 = arg0.substring(Class253.lb.method5453(Static161.anInt3095).length());
			} else if (local11.startsWith(Static375.aClass253_59.method5453(Static161.anInt3095))) {
				local13 = 9;
				arg0 = arg0.substring(Static375.aClass253_59.method5453(Static161.anInt3095).length());
			} else if (local11.startsWith(Static375.aClass253_60.method5453(Static161.anInt3095))) {
				local13 = 10;
				arg0 = arg0.substring(Static375.aClass253_60.method5453(Static161.anInt3095).length());
			} else if (local11.startsWith(Static375.aClass253_61.method5453(Static161.anInt3095))) {
				local13 = 11;
				arg0 = arg0.substring(Static375.aClass253_61.method5453(Static161.anInt3095).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static375.aClass253_62.method5453(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static375.aClass253_62.method5453(0).length());
		} else if (local11.startsWith(Static375.aClass253_63.method5453(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static375.aClass253_63.method5453(0).length());
		} else if (local11.startsWith(Static375.aClass253_64.method5453(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static375.aClass253_64.method5453(0).length());
		} else if (local11.startsWith(Static375.aClass253_65.method5453(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static375.aClass253_65.method5453(0).length());
		} else if (local11.startsWith(Static375.aClass253_66.method5453(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static375.aClass253_66.method5453(0).length());
		} else if (Static161.anInt3095 != 0) {
			if (local11.startsWith(Static375.aClass253_62.method5453(Static161.anInt3095))) {
				local451 = 1;
				arg0 = arg0.substring(Static375.aClass253_62.method5453(Static161.anInt3095).length());
			} else if (local11.startsWith(Static375.aClass253_63.method5453(Static161.anInt3095))) {
				local451 = 2;
				arg0 = arg0.substring(Static375.aClass253_63.method5453(Static161.anInt3095).length());
			} else if (local11.startsWith(Static375.aClass253_64.method5453(Static161.anInt3095))) {
				local451 = 3;
				arg0 = arg0.substring(Static375.aClass253_64.method5453(Static161.anInt3095).length());
			} else if (local11.startsWith(Static375.aClass253_65.method5453(Static161.anInt3095))) {
				local451 = 4;
				arg0 = arg0.substring(Static375.aClass253_65.method5453(Static161.anInt3095).length());
			} else if (local11.startsWith(Static375.aClass253_66.method5453(Static161.anInt3095))) {
				local451 = 5;
				arg0 = arg0.substring(Static375.aClass253_66.method5453(Static161.anInt3095).length());
			}
		}
		@Pc(641) Class1_Sub9 local641 = Static123.method2194(Static469.aClass235_2, Static518.aClass208_107);
		local641.aClass1_Sub3_Sub1_1.method7917(0);
		@Pc(650) int local650 = local641.aClass1_Sub3_Sub1_1.anInt9802;
		local641.aClass1_Sub3_Sub1_1.method7917(local13);
		local641.aClass1_Sub3_Sub1_1.method7917(local451);
		Static228.method3396(arg0, local641.aClass1_Sub3_Sub1_1);
		local641.aClass1_Sub3_Sub1_1.method7947(local641.aClass1_Sub3_Sub1_1.anInt9802 - local650);
		Static42.method746(local641);
	}
}
