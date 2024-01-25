import jagex3.jagmisc.jagmisc;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fj", name = "f", descriptor = "Lclient!wv;")
	private static Class365 aClass365_5;

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray15;

	@OriginalMember(owner = "client!fj", name = "n", descriptor = "Lclient!wv;")
	private static Class365 aClass365_6;

	@OriginalMember(owner = "client!fj", name = "o", descriptor = "[I")
	private static int[] anIntArray173;

	@OriginalMember(owner = "client!fj", name = "q", descriptor = "Lclient!caa;")
	private static Class40 aClass40_1;

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray14 = new String[1000];

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "[Lclient!sd;")
	private static final Class292[] aClass292Array1 = new Class292[50];

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "[I")
	private static final int[] anIntArray172 = new int[1000];

	@OriginalMember(owner = "client!fj", name = "g", descriptor = "I")
	private static int anInt2783 = 0;

	@OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
	private static int anInt2786 = 0;

	@OriginalMember(owner = "client!fj", name = "s", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
	private static int anInt2792 = 0;

	@OriginalMember(owner = "client!fj", name = "w", descriptor = "[[I")
	private static final int[][] anIntArrayArray24 = new int[5][5000];

	@OriginalMember(owner = "client!fj", name = "y", descriptor = "[I")
	private static final int[] anIntArray174 = new int[5];

	@OriginalMember(owner = "client!fj", name = "z", descriptor = "[I")
	private static final int[] anIntArray175 = new int[3];

	@OriginalMember(owner = "client!fj", name = "A", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray16 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!fj", name = "B", descriptor = "Lclient!uf;")
	public static final Class326 aClass326_12 = new Class326(4);

	@OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
	private static int anInt2795 = 0;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)Ljava/lang/String;")
	private static String method2348(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray16[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method2349(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static276.anInt5092 == 0 && (Static242.aBoolean359 && !Static35.aBoolean80 || Static329.aBoolean427)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static103.aClass77_49.method1864(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static103.aClass77_49.method1864(0).length());
		} else if (local11.startsWith(Static103.aClass77_50.method1864(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static103.aClass77_50.method1864(0).length());
		} else if (local11.startsWith(Static103.aClass77_51.method1864(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static103.aClass77_51.method1864(0).length());
		} else if (local11.startsWith(Static103.aClass77_52.method1864(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static103.aClass77_52.method1864(0).length());
		} else if (local11.startsWith(Static103.aClass77_53.method1864(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static103.aClass77_53.method1864(0).length());
		} else if (local11.startsWith(Static103.aClass77_54.method1864(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static103.aClass77_54.method1864(0).length());
		} else if (local11.startsWith(Static103.aClass77_55.method1864(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static103.aClass77_55.method1864(0).length());
		} else if (local11.startsWith(Static103.aClass77_56.method1864(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static103.aClass77_56.method1864(0).length());
		} else if (local11.startsWith(Static103.aClass77_57.method1864(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static103.aClass77_57.method1864(0).length());
		} else if (local11.startsWith(Static103.aClass77_58.method1864(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static103.aClass77_58.method1864(0).length());
		} else if (local11.startsWith(Static103.aClass77_59.method1864(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static103.aClass77_59.method1864(0).length());
		} else if (local11.startsWith(Static103.aClass77_60.method1864(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static103.aClass77_60.method1864(0).length());
		} else if (Static562.anInt9127 != 0) {
			if (local11.startsWith(Static103.aClass77_49.method1864(Static562.anInt9127))) {
				local13 = 0;
				arg0 = arg0.substring(Static103.aClass77_49.method1864(Static562.anInt9127).length());
			} else if (local11.startsWith(Static103.aClass77_50.method1864(Static562.anInt9127))) {
				local13 = 1;
				arg0 = arg0.substring(Static103.aClass77_50.method1864(Static562.anInt9127).length());
			} else if (local11.startsWith(Static103.aClass77_51.method1864(Static562.anInt9127))) {
				local13 = 2;
				arg0 = arg0.substring(Static103.aClass77_51.method1864(Static562.anInt9127).length());
			} else if (local11.startsWith(Static103.aClass77_52.method1864(Static562.anInt9127))) {
				local13 = 3;
				arg0 = arg0.substring(Static103.aClass77_52.method1864(Static562.anInt9127).length());
			} else if (local11.startsWith(Static103.aClass77_53.method1864(Static562.anInt9127))) {
				local13 = 4;
				arg0 = arg0.substring(Static103.aClass77_53.method1864(Static562.anInt9127).length());
			} else if (local11.startsWith(Static103.aClass77_54.method1864(Static562.anInt9127))) {
				local13 = 5;
				arg0 = arg0.substring(Static103.aClass77_54.method1864(Static562.anInt9127).length());
			} else if (local11.startsWith(Static103.aClass77_55.method1864(Static562.anInt9127))) {
				local13 = 6;
				arg0 = arg0.substring(Static103.aClass77_55.method1864(Static562.anInt9127).length());
			} else if (local11.startsWith(Static103.aClass77_56.method1864(Static562.anInt9127))) {
				local13 = 7;
				arg0 = arg0.substring(Static103.aClass77_56.method1864(Static562.anInt9127).length());
			} else if (local11.startsWith(Static103.aClass77_57.method1864(Static562.anInt9127))) {
				local13 = 8;
				arg0 = arg0.substring(Static103.aClass77_57.method1864(Static562.anInt9127).length());
			} else if (local11.startsWith(Static103.aClass77_58.method1864(Static562.anInt9127))) {
				local13 = 9;
				arg0 = arg0.substring(Static103.aClass77_58.method1864(Static562.anInt9127).length());
			} else if (local11.startsWith(Static103.aClass77_59.method1864(Static562.anInt9127))) {
				local13 = 10;
				arg0 = arg0.substring(Static103.aClass77_59.method1864(Static562.anInt9127).length());
			} else if (local11.startsWith(Static103.aClass77_60.method1864(Static562.anInt9127))) {
				local13 = 11;
				arg0 = arg0.substring(Static103.aClass77_60.method1864(Static562.anInt9127).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Class77.lb.method1864(0))) {
			local451 = 1;
			arg0 = arg0.substring(Class77.lb.method1864(0).length());
		} else if (local11.startsWith(Static103.aClass77_61.method1864(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static103.aClass77_61.method1864(0).length());
		} else if (local11.startsWith(Static103.aClass77_62.method1864(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static103.aClass77_62.method1864(0).length());
		} else if (local11.startsWith(Static103.aClass77_63.method1864(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static103.aClass77_63.method1864(0).length());
		} else if (local11.startsWith(Static103.aClass77_64.method1864(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static103.aClass77_64.method1864(0).length());
		} else if (Static562.anInt9127 != 0) {
			if (local11.startsWith(Class77.lb.method1864(Static562.anInt9127))) {
				local451 = 1;
				arg0 = arg0.substring(Class77.lb.method1864(Static562.anInt9127).length());
			} else if (local11.startsWith(Static103.aClass77_61.method1864(Static562.anInt9127))) {
				local451 = 2;
				arg0 = arg0.substring(Static103.aClass77_61.method1864(Static562.anInt9127).length());
			} else if (local11.startsWith(Static103.aClass77_62.method1864(Static562.anInt9127))) {
				local451 = 3;
				arg0 = arg0.substring(Static103.aClass77_62.method1864(Static562.anInt9127).length());
			} else if (local11.startsWith(Static103.aClass77_63.method1864(Static562.anInt9127))) {
				local451 = 4;
				arg0 = arg0.substring(Static103.aClass77_63.method1864(Static562.anInt9127).length());
			} else if (local11.startsWith(Static103.aClass77_64.method1864(Static562.anInt9127))) {
				local451 = 5;
				arg0 = arg0.substring(Static103.aClass77_64.method1864(Static562.anInt9127).length());
			}
		}
		@Pc(641) Class1_Sub48 local641 = Static320.method4867(Static442.aClass170_2, Static259.aClass319_85);
		local641.aClass1_Sub20_Sub1_2.method4378(0);
		@Pc(650) int local650 = local641.aClass1_Sub20_Sub1_2.anInt5238;
		local641.aClass1_Sub20_Sub1_2.method4378(local13);
		local641.aClass1_Sub20_Sub1_2.method4378(local451);
		Static506.method7004(arg0, local641.aClass1_Sub20_Sub1_2);
		local641.aClass1_Sub20_Sub1_2.method4411(local641.aClass1_Sub20_Sub1_2.anInt5238 - local650);
		Static34.method813(local641);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "()V")
	public static void method2350() {
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(I)V")
	public static void method2351(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static300.method4703(arg0)) {
			return;
		}
		@Pc(12) Class365[] local12 = Static249.aClass365ArrayArray3[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class365 local19 = local12[local14];
			if (local19.anObjectArray17 != null) {
				@Pc(26) Class1_Sub2 local26 = new Class1_Sub2();
				local26.aClass365_1 = local19;
				local26.anObjectArray1 = local19.anObjectArray17;
				method2358(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V")
	private static void method2352(@OriginalArg(0) int arg0) {
		@Pc(3) Class365 local3 = Static374.method5437(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class365[] local13 = Static440.aClass365ArrayArray4[local9];
		if (local13 == null) {
			@Pc(19) Class365[] local19 = Static249.aClass365ArrayArray3[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static440.aClass365ArrayArray4[local9] = new Class365[local22];
			Static600.method3766(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static600.method3766(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!ada;)V")
	public static void method2353(@OriginalArg(0) Class1_Sub2 arg0) {
		method2358(arg0, 200000);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ)V")
	public static void method2354() {
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!bm;I)V")
	private static void method2355(@OriginalArg(0) Class1_Sub3_Sub5 arg0, @OriginalArg(1) int arg1) {
		anInt2783 = 0;
		anInt2792 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray50;
		@Pc(11) int[] local11 = arg0.anIntArray49;
		@Pc(13) byte local13 = -1;
		anInt2786 = 0;
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
						method2357(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method2356(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray172[anInt2783++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray172[anInt2783++] = Static121.aClass148_1.anIntArray240[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static121.aClass148_1.method3533(local54, anIntArray172[--anInt2783]);
					} else if (local31 == 3) {
						aStringArray14[anInt2792++] = arg0.aStringArray5[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt2783 -= 2;
						if (anIntArray172[anInt2783] != anIntArray172[anInt2783 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt2783 -= 2;
						if (anIntArray172[anInt2783] == anIntArray172[anInt2783 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt2783 -= 2;
						if (anIntArray172[anInt2783] < anIntArray172[anInt2783 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt2783 -= 2;
						if (anIntArray172[anInt2783] > anIntArray172[anInt2783 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt2786 == 0) {
							return;
						}
						@Pc(216) Class292 local216 = aClass292Array1[--anInt2786];
						arg0 = local216.aClass1_Sub3_Sub5_1;
						local8 = arg0.anIntArray50;
						local11 = arg0.anIntArray49;
						local5 = local216.anInt8055;
						anIntArray173 = local216.anIntArray531;
						aStringArray15 = local216.aStringArray32;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray172[anInt2783++] = Static121.aClass148_1.method3531(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static121.aClass148_1.method3537(anIntArray172[--anInt2783], local54);
					} else if (local31 == 31) {
						anInt2783 -= 2;
						if (anIntArray172[anInt2783] <= anIntArray172[anInt2783 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt2783 -= 2;
						if (anIntArray172[anInt2783] >= anIntArray172[anInt2783 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray172[anInt2783++] = anIntArray173[local11[local5]];
					} else if (local31 == 34) {
						anIntArray173[local11[local5]] = anIntArray172[--anInt2783];
					} else if (local31 == 35) {
						aStringArray14[anInt2792++] = aStringArray15[local11[local5]];
					} else if (local31 == 36) {
						aStringArray15[local11[local5]] = aStringArray14[--anInt2792];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt2792 -= local54;
						@Pc(400) String local400 = Static90.method1756(local54, aStringArray14, anInt2792);
						aStringArray14[anInt2792++] = local400;
					} else if (local31 == 38) {
						anInt2783--;
					} else if (local31 == 39) {
						anInt2792--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class1_Sub3_Sub5 local436 = Static501.method6969(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt1135];
							@Pc(450) String[] local450 = new String[local436.anInt1134];
							for (local452 = 0; local452 < local436.anInt1136; local452++) {
								local446[local452] = anIntArray172[anInt2783 + local452 - local436.anInt1136];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt1138; local471++) {
								local450[local471] = aStringArray14[anInt2792 + local471 - local436.anInt1138];
							}
							anInt2783 -= local436.anInt1136;
							anInt2792 -= local436.anInt1138;
							@Pc(502) Class292 local502 = new Class292();
							local502.aClass1_Sub3_Sub5_1 = arg0;
							local502.anInt8055 = local5;
							local502.anIntArray531 = anIntArray173;
							local502.aStringArray32 = aStringArray15;
							if (anInt2786 >= aClass292Array1.length) {
								throw new RuntimeException();
							}
							aClass292Array1[anInt2786++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray50;
							local11 = local436.anIntArray49;
							local5 = -1;
							anIntArray173 = local446;
							aStringArray15 = local450;
						} else if (local31 == 42) {
							anIntArray172[anInt2783++] = Static475.anIntArray530[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static475.anIntArray530[local54] = anIntArray172[--anInt2783];
							Static328.method4967(local54);
							Static43.aBoolean89 |= Static412.aBooleanArray23[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray172[--anInt2783];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray174[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray24[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray172[--anInt2783];
							if (local603 < 0 || local603 >= anIntArray174[local54]) {
								throw new RuntimeException();
							}
							anIntArray172[anInt2783++] = anIntArrayArray24[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt2783 -= 2;
							local603 = anIntArray172[anInt2783];
							if (local603 < 0 || local603 >= anIntArray174[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray24[local54][local603] = anIntArray172[anInt2783 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static111.aStringArray11[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray14[anInt2792++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static111.aStringArray11[local54] = aStringArray14[--anInt2792];
							Static323.method4891(local54);
						} else if (local31 == 51) {
							@Pc(774) Class356 local774 = arg0.aClass356Array1[local11[local5]];
							@Pc(787) Class1_Sub32 local787 = (Class1_Sub32) local774.method7796((long) anIntArray172[--anInt2783]);
							if (local787 != null) {
								local5 += local787.anInt6144;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString15 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong425).append(" ");
				for (local603 = anInt2786 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass292Array1[local603].aClass1_Sub3_Sub5_1.aLong425).append(" ");
				}
				local856.append("op: ").append(local13);
				Static259.method4059(local856.toString(), local837);
			} else {
				Static172.method2626("Clientscript error in: " + arg0.aString15);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString15).append("\n");
				for (local603 = anInt2786 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass292Array1[local603].aClass1_Sub3_Sub5_1.aString15).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static259.method4059(local856.toString(), local837);
				Static374.method5444(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(IZ)V")
	private static void method2356(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class1_Sub48 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray172[anInt2783++] = Static502.anInt8424;
				return;
			}
			if (arg0 == 5001) {
				anInt2783 -= 3;
				Static502.anInt8424 = anIntArray172[anInt2783];
				Static371.aClass290_5 = Static112.method1974(anIntArray172[anInt2783 + 1]);
				if (Static371.aClass290_5 == null) {
					Static371.aClass290_5 = Static248.aClass290_2;
				}
				Static518.anInt8570 = anIntArray172[anInt2783 + 2];
				local52 = Static320.method4867(Static442.aClass170_2, Static57.aClass319_35);
				local52.aClass1_Sub20_Sub1_2.method4378(Static502.anInt8424);
				local52.aClass1_Sub20_Sub1_2.method4378(Static371.aClass290_5.anInt7898);
				local52.aClass1_Sub20_Sub1_2.method4378(Static518.anInt8570);
				Static34.method813(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt2792 -= 2;
				local83 = aStringArray14[anInt2792];
				local89 = aStringArray14[anInt2792 + 1];
				anInt2783 -= 2;
				local97 = anIntArray172[anInt2783];
				local103 = anIntArray172[anInt2783 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class1_Sub48 local125 = Static320.method4867(Static442.aClass170_2, Static245.aClass319_80);
				local125.aClass1_Sub20_Sub1_2.method4378(Static419.method5867(local83) + Static419.method5867(local89) + 2);
				local125.aClass1_Sub20_Sub1_2.method4399(local83);
				local125.aClass1_Sub20_Sub1_2.method4378(local97 - 1);
				local125.aClass1_Sub20_Sub1_2.method4378(local103);
				local125.aClass1_Sub20_Sub1_2.method4399(local89);
				Static34.method813(local125);
				return;
			}
			@Pc(179) Class254 local179;
			if (arg0 == 5003) {
				local175 = anIntArray172[--anInt2783];
				local179 = Static130.method6496(local175);
				local181 = "";
				if (local179 != null && local179.aString70 != null) {
					local181 = local179.aString70;
				}
				aStringArray14[anInt2792++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray172[--anInt2783];
				local179 = Static130.method6496(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt6916;
				}
				anIntArray172[anInt2783++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static371.aClass290_5 == null) {
					anIntArray172[anInt2783++] = -1;
					return;
				}
				anIntArray172[anInt2783++] = Static371.aClass290_5.anInt7898;
				return;
			}
			@Pc(269) Class1_Sub48 local269;
			if (arg0 == 5006) {
				local175 = anIntArray172[--anInt2783];
				local269 = Static320.method4867(Static442.aClass170_2, Static555.aClass319_162);
				local269.aClass1_Sub20_Sub1_2.method4378(local175);
				Static34.method813(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray14[--anInt2792];
				method2349(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt2792 -= 2;
				local83 = aStringArray14[anInt2792];
				local89 = aStringArray14[anInt2792 + 1];
				if (Static276.anInt5092 != 0 || (!Static242.aBoolean359 || Static35.aBoolean80) && !Static329.aBoolean427) {
					@Pc(328) Class1_Sub48 local328 = Static320.method4867(Static442.aClass170_2, Static538.aClass319_159);
					local328.aClass1_Sub20_Sub1_2.method4378(0);
					local103 = local328.aClass1_Sub20_Sub1_2.anInt5238;
					local328.aClass1_Sub20_Sub1_2.method4399(local83);
					Static506.method7004(local89, local328.aClass1_Sub20_Sub1_2);
					local328.aClass1_Sub20_Sub1_2.method4411(local328.aClass1_Sub20_Sub1_2.anInt5238 - local103);
					Static34.method813(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray172[--anInt2783];
				local179 = Static130.method6496(local175);
				local181 = "";
				if (local179 != null && local179.aString74 != null) {
					local181 = local179.aString74;
				}
				aStringArray14[anInt2792++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray172[--anInt2783];
				local179 = Static130.method6496(local175);
				local181 = "";
				if (local179 != null && local179.aString71 != null) {
					local181 = local179.aString71;
				}
				aStringArray14[anInt2792++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray172[--anInt2783];
				local179 = Static130.method6496(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt6921;
				}
				anIntArray172[anInt2783++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 == null || Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aString50 == null) {
					local83 = Static315.aString63;
				} else {
					local83 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.method4153();
				}
				aStringArray14[anInt2792++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray172[anInt2783++] = Static518.anInt8570;
				return;
			}
			if (arg0 == 5017) {
				anIntArray172[anInt2783++] = Static453.method6378();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray172[--anInt2783];
				local179 = Static130.method6496(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt6915;
				}
				anIntArray172[anInt2783++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray172[--anInt2783];
				local179 = Static130.method6496(local175);
				local181 = "";
				if (local179 != null && local179.aString73 != null) {
					local181 = local179.aString73;
				}
				aStringArray14[anInt2792++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 == null || Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aString50 == null) {
					local83 = Static315.aString63;
				} else {
					local83 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.method4151();
				}
				aStringArray14[anInt2792++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray172[--anInt2783];
				local179 = Static130.method6496(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt6923;
				}
				anIntArray172[anInt2783++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray172[--anInt2783];
				local179 = Static130.method6496(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt6919;
				}
				anIntArray172[anInt2783++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray172[--anInt2783];
				local179 = Static130.method6496(local175);
				local181 = "";
				if (local179 != null && local179.aString72 != null) {
					local181 = local179.aString72;
				}
				aStringArray14[anInt2792++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray172[--anInt2783];
				aStringArray14[anInt2792++] = Static273.aClass49_1.method1439(local175).aString16;
				return;
			}
			@Pc(736) Class1_Sub3_Sub7 local736;
			if (arg0 == 5051) {
				local175 = anIntArray172[--anInt2783];
				local736 = Static273.aClass49_1.method1439(local175);
				if (local736.anIntArray102 == null) {
					anIntArray172[anInt2783++] = 0;
					return;
				}
				anIntArray172[anInt2783++] = local736.anIntArray102.length;
				return;
			}
			if (arg0 == 5052) {
				anInt2783 -= 2;
				local175 = anIntArray172[anInt2783];
				local776 = anIntArray172[anInt2783 + 1];
				@Pc(781) Class1_Sub3_Sub7 local781 = Static273.aClass49_1.method1439(local175);
				local103 = local781.anIntArray102[local776];
				anIntArray172[anInt2783++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray172[--anInt2783];
				local736 = Static273.aClass49_1.method1439(local175);
				if (local736.anIntArray103 == null) {
					anIntArray172[anInt2783++] = 0;
					return;
				}
				anIntArray172[anInt2783++] = local736.anIntArray103.length;
				return;
			}
			if (arg0 == 5054) {
				anInt2783 -= 2;
				local175 = anIntArray172[anInt2783];
				local776 = anIntArray172[anInt2783 + 1];
				anIntArray172[anInt2783++] = Static273.aClass49_1.method1439(local175).anIntArray103[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray172[--anInt2783];
				aStringArray14[anInt2792++] = Static296.aClass362_2.method7873(local175).method816();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray172[--anInt2783];
				@Pc(907) Class1_Sub3_Sub3 local907 = Static296.aClass362_2.method7873(local175);
				if (local907.anIntArray29 == null) {
					anIntArray172[anInt2783++] = 0;
					return;
				}
				anIntArray172[anInt2783++] = local907.anIntArray29.length;
				return;
			}
			if (arg0 == 5057) {
				anInt2783 -= 2;
				local175 = anIntArray172[anInt2783];
				local776 = anIntArray172[anInt2783 + 1];
				anIntArray172[anInt2783++] = Static296.aClass362_2.method7873(local175).anIntArray29[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass40_1 = new Class40();
				aClass40_1.anInt1400 = anIntArray172[--anInt2783];
				aClass40_1.aClass1_Sub3_Sub3_1 = Static296.aClass362_2.method7873(aClass40_1.anInt1400);
				aClass40_1.anIntArray67 = new int[aClass40_1.aClass1_Sub3_Sub3_1.method805()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static320.method4867(Static442.aClass170_2, Static256.aClass319_83);
				local52.aClass1_Sub20_Sub1_2.method4378(0);
				local776 = local52.aClass1_Sub20_Sub1_2.anInt5238;
				local52.aClass1_Sub20_Sub1_2.method4378(0);
				local52.aClass1_Sub20_Sub1_2.method4381(aClass40_1.anInt1400);
				aClass40_1.aClass1_Sub3_Sub3_1.method809(aClass40_1.anIntArray67, local52.aClass1_Sub20_Sub1_2);
				local52.aClass1_Sub20_Sub1_2.method4411(local52.aClass1_Sub20_Sub1_2.anInt5238 - local776);
				Static34.method813(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray14[--anInt2792];
				local269 = Static320.method4867(Static442.aClass170_2, Static565.aClass319_163);
				local269.aClass1_Sub20_Sub1_2.method4378(0);
				local97 = local269.aClass1_Sub20_Sub1_2.anInt5238;
				local269.aClass1_Sub20_Sub1_2.method4399(local83);
				local269.aClass1_Sub20_Sub1_2.method4381(aClass40_1.anInt1400);
				aClass40_1.aClass1_Sub3_Sub3_1.method809(aClass40_1.anIntArray67, local269.aClass1_Sub20_Sub1_2);
				local269.aClass1_Sub20_Sub1_2.method4411(local269.aClass1_Sub20_Sub1_2.anInt5238 - local97);
				Static34.method813(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static320.method4867(Static442.aClass170_2, Static256.aClass319_83);
				local52.aClass1_Sub20_Sub1_2.method4378(0);
				local776 = local52.aClass1_Sub20_Sub1_2.anInt5238;
				local52.aClass1_Sub20_Sub1_2.method4378(1);
				local52.aClass1_Sub20_Sub1_2.method4381(aClass40_1.anInt1400);
				aClass40_1.aClass1_Sub3_Sub3_1.method809(aClass40_1.anIntArray67, local52.aClass1_Sub20_Sub1_2);
				local52.aClass1_Sub20_Sub1_2.method4411(local52.aClass1_Sub20_Sub1_2.anInt5238 - local776);
				Static34.method813(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt2783 -= 2;
				local175 = anIntArray172[anInt2783];
				local776 = anIntArray172[anInt2783 + 1];
				anIntArray172[anInt2783++] = Static273.aClass49_1.method1439(local175).aCharArray2[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt2783 -= 2;
				local175 = anIntArray172[anInt2783];
				local776 = anIntArray172[anInt2783 + 1];
				anIntArray172[anInt2783++] = Static273.aClass49_1.method1439(local175).aCharArray3[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt2783 -= 2;
				local175 = anIntArray172[anInt2783];
				local776 = anIntArray172[anInt2783 + 1];
				if (local776 == -1) {
					anIntArray172[anInt2783++] = -1;
					return;
				}
				anIntArray172[anInt2783++] = Static273.aClass49_1.method1439(local175).method1611((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt2783 -= 2;
				local175 = anIntArray172[anInt2783];
				local776 = anIntArray172[anInt2783 + 1];
				if (local776 == -1) {
					anIntArray172[anInt2783++] = -1;
					return;
				}
				anIntArray172[anInt2783++] = Static273.aClass49_1.method1439(local175).method1606((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray172[--anInt2783];
				anIntArray172[anInt2783++] = Static296.aClass362_2.method7873(local175).method805();
				return;
			}
			if (arg0 == 5067) {
				anInt2783 -= 2;
				local175 = anIntArray172[anInt2783];
				local776 = anIntArray172[anInt2783 + 1];
				local97 = Static296.aClass362_2.method7873(local175).method806(local776).anInt5472;
				anIntArray172[anInt2783++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt2783 -= 2;
				local175 = anIntArray172[anInt2783];
				local776 = anIntArray172[anInt2783 + 1];
				aClass40_1.anIntArray67[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt2783 -= 2;
				local175 = anIntArray172[anInt2783];
				local776 = anIntArray172[anInt2783 + 1];
				aClass40_1.anIntArray67[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt2783 -= 3;
				local175 = anIntArray172[anInt2783];
				local776 = anIntArray172[anInt2783 + 1];
				local97 = anIntArray172[anInt2783 + 2];
				@Pc(1448) Class1_Sub3_Sub3 local1448 = Static296.aClass362_2.method7873(local175);
				if (local1448.method806(local776).anInt5472 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray172[anInt2783++] = local1448.method807(local776, local97);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray14[--anInt2792];
				local1496 = anIntArray172[--anInt2783] == 1;
				Static326.method4912(local1496, local83);
				anIntArray172[anInt2783++] = Static238.anInt9537;
				return;
			}
			if (arg0 == 5072) {
				if (Static410.aShortArray79 != null && Static370.anInt6548 < Static238.anInt9537) {
					anIntArray172[anInt2783++] = Static410.aShortArray79[Static370.anInt6548++] & 0xFFFF;
					return;
				}
				anIntArray172[anInt2783++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static370.anInt6548 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static595.aClass31_1.method985(86)) {
					anIntArray172[anInt2783++] = 1;
					return;
				}
				anIntArray172[anInt2783++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static595.aClass31_1.method985(82)) {
					anIntArray172[anInt2783++] = 1;
					return;
				}
				anIntArray172[anInt2783++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static595.aClass31_1.method985(81)) {
					anIntArray172[anInt2783++] = 1;
					return;
				}
				anIntArray172[anInt2783++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static276.method4283(anIntArray172[--anInt2783]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray172[anInt2783++] = Static398.method5647();
					return;
				}
				if (arg0 == 5205) {
					Static42.method1000(false, anIntArray172[--anInt2783], -1, -1);
					return;
				}
				@Pc(1696) Class1_Sub3_Sub17 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray172[--anInt2783];
					local1696 = Static313.method3494(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray172[anInt2783++] = -1;
						return;
					}
					anIntArray172[anInt2783++] = local1696.anInt8092;
					return;
				}
				@Pc(1729) Class1_Sub3_Sub17 local1729;
				if (arg0 == 5207) {
					local1729 = Static313.method3477(anIntArray172[--anInt2783]);
					if (local1729 != null && local1729.aString85 != null) {
						aStringArray14[anInt2792++] = local1729.aString85;
						return;
					}
					aStringArray14[anInt2792++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray172[anInt2783++] = Static307.anInt5544;
					anIntArray172[anInt2783++] = Static78.anInt1869;
					return;
				}
				if (arg0 == 5209) {
					anIntArray172[anInt2783++] = Static222.anInt1235 + Static313.anInt4085;
					anIntArray172[anInt2783++] = Static536.anInt8850 + Static313.anInt4096;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray172[--anInt2783];
					local1696 = Static313.method3477(local175);
					if (local1696 == null) {
						anIntArray172[anInt2783++] = 0;
						anIntArray172[anInt2783++] = 0;
						return;
					}
					anIntArray172[anInt2783++] = local1696.anInt8091 >> 14 & 0x3FFF;
					anIntArray172[anInt2783++] = local1696.anInt8091 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray172[--anInt2783];
					local1696 = Static313.method3477(local175);
					if (local1696 == null) {
						anIntArray172[anInt2783++] = 0;
						anIntArray172[anInt2783++] = 0;
						return;
					}
					anIntArray172[anInt2783++] = local1696.anInt8100 - local1696.anInt8096;
					anIntArray172[anInt2783++] = local1696.anInt8095 - local1696.anInt8089;
					return;
				}
				@Pc(1919) Class1_Sub27 local1919;
				if (arg0 == 5212) {
					local1919 = Static292.method4584();
					if (local1919 == null) {
						anIntArray172[anInt2783++] = -1;
						anIntArray172[anInt2783++] = -1;
						return;
					}
					anIntArray172[anInt2783++] = local1919.anInt5625;
					local776 = local1919.anInt5630 << 28 | local1919.anInt5627 + Static313.anInt4085 << 14 | local1919.anInt5623 + Static313.anInt4096;
					anIntArray172[anInt2783++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static160.method7320();
					if (local1919 == null) {
						anIntArray172[anInt2783++] = -1;
						anIntArray172[anInt2783++] = -1;
						return;
					}
					anIntArray172[anInt2783++] = local1919.anInt5625;
					local776 = local1919.anInt5630 << 28 | local1919.anInt5627 + Static313.anInt4085 << 14 | local1919.anInt5623 + Static313.anInt4096;
					anIntArray172[anInt2783++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray172[--anInt2783];
					local1696 = Static361.method5266();
					if (local1696 != null) {
						local2067 = local1696.method6737(local175 & 0x3FFF, anIntArray175, local175 >> 14 & 0x3FFF, local175 >> 28 & 0x3);
						if (local2067) {
							Static311.method4773(anIntArray175[2], anIntArray175[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt2783 -= 2;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					@Pc(2105) Class117 local2105 = Static313.method3483(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class1_Sub3_Sub17 local2112 = (Class1_Sub3_Sub17) local2105.method2549(); local2112 != null; local2112 = (Class1_Sub3_Sub17) local2105.method2551()) {
						if (local2112.anInt8092 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray172[anInt2783++] = 1;
						return;
					}
					anIntArray172[anInt2783++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray172[--anInt2783];
					local1696 = Static313.method3477(local175);
					if (local1696 == null) {
						anIntArray172[anInt2783++] = -1;
						return;
					}
					anIntArray172[anInt2783++] = local1696.anInt8093;
					return;
				}
				if (arg0 == 5220) {
					anIntArray172[anInt2783++] = Static587.anInt9497 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray172[--anInt2783];
					Static311.method4773(local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static361.method5266();
					if (local1729 != null) {
						local1496 = local1729.method6735(Static222.anInt1235 + Static313.anInt4085, anIntArray175, Static536.anInt8850 + Static313.anInt4096);
						if (local1496) {
							anIntArray172[anInt2783++] = anIntArray175[1];
							anIntArray172[anInt2783++] = anIntArray175[2];
							return;
						}
						anIntArray172[anInt2783++] = -1;
						anIntArray172[anInt2783++] = -1;
						return;
					}
					anIntArray172[anInt2783++] = -1;
					anIntArray172[anInt2783++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt2783 -= 2;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					Static42.method1000(false, local175, local776 >> 14 & 0x3FFF, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray172[--anInt2783];
					local1696 = Static361.method5266();
					if (local1696 != null) {
						local2067 = local1696.method6737(local175 & 0x3FFF, anIntArray175, local175 >> 14 & 0x3FFF, local175 >> 28 & 0x3);
						if (local2067) {
							anIntArray172[anInt2783++] = anIntArray175[1];
							anIntArray172[anInt2783++] = anIntArray175[2];
							return;
						}
						anIntArray172[anInt2783++] = -1;
						anIntArray172[anInt2783++] = -1;
						return;
					}
					anIntArray172[anInt2783++] = -1;
					anIntArray172[anInt2783++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray172[--anInt2783];
					local1696 = Static361.method5266();
					if (local1696 != null) {
						local2067 = local1696.method6735(local175 >> 14 & 0x3FFF, anIntArray175, local175 & 0x3FFF);
						if (local2067) {
							anIntArray172[anInt2783++] = anIntArray175[1];
							anIntArray172[anInt2783++] = anIntArray175[2];
							return;
						}
						anIntArray172[anInt2783++] = -1;
						anIntArray172[anInt2783++] = -1;
						return;
					}
					anIntArray172[anInt2783++] = -1;
					anIntArray172[anInt2783++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static495.method6916(anIntArray172[--anInt2783]);
					return;
				}
				if (arg0 == 5227) {
					anInt2783 -= 2;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					Static42.method1000(true, local175, local776 >> 14 & 0x3FFF, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static521.aBoolean629 = anIntArray172[--anInt2783] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray172[anInt2783++] = Static521.aBoolean629 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray172[--anInt2783];
					Static451.method7201(local175);
					return;
				}
				@Pc(2625) Class1 local2625;
				if (arg0 == 5231) {
					anInt2783 -= 2;
					local175 = anIntArray172[anInt2783];
					local1496 = anIntArray172[anInt2783 + 1] == 1;
					if (Static268.aClass356_22 != null) {
						local2625 = Static268.aClass356_22.method7796((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method7878();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class1();
							Static268.aClass356_22.method7800((long) local175, local2625);
						}
					}
					return;
				}
				@Pc(2667) Class1 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray172[--anInt2783];
					if (Static268.aClass356_22 != null) {
						local2667 = Static268.aClass356_22.method7796((long) local175);
						anIntArray172[anInt2783++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray172[anInt2783++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt2783 -= 2;
					local175 = anIntArray172[anInt2783];
					local1496 = anIntArray172[anInt2783 + 1] == 1;
					if (Static106.aClass356_8 != null) {
						local2625 = Static106.aClass356_8.method7796((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method7878();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class1();
							Static106.aClass356_8.method7800((long) local175, local2625);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray172[--anInt2783];
					if (Static106.aClass356_8 != null) {
						local2667 = Static106.aClass356_8.method7796((long) local175);
						anIntArray172[anInt2783++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray172[anInt2783++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray172[anInt2783++] = Static313.aClass1_Sub3_Sub17_2 == null ? -1 : Static313.aClass1_Sub3_Sub17_2.anInt8092;
					return;
				}
				if (arg0 == 5236) {
					anInt2783 -= 2;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static389.method5573(local97, local175, local103);
					if (local2833 < 0) {
						anIntArray172[anInt2783++] = -1;
						return;
					}
					anIntArray172[anInt2783++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static200.method3429();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt2783 -= 2;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					Static68.method1443(3, false, local776, local175);
					anIntArray172[anInt2783++] = Static255.aFrame3 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static255.aFrame3 != null) {
						Static68.method1443(Static479.aClass1_Sub7_Sub1_1.anInt3097, false, -1, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2917) Class360[] local2917 = Static551.method7498();
					anIntArray172[anInt2783++] = local2917.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray172[--anInt2783];
					@Pc(2941) Class360[] local2941 = Static551.method7498();
					anIntArray172[anInt2783++] = local2941[local175].anInt9503;
					anIntArray172[anInt2783++] = local2941[local175].anInt9501;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static479.aClass1_Sub7_Sub1_1.anInt3117;
					local776 = Static479.aClass1_Sub7_Sub1_1.anInt3089;
					local97 = -1;
					@Pc(2978) Class360[] local2978 = Static551.method7498();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class360 local2985 = local2978[local2833];
						if (local2985.anInt9503 == local175 && local2985.anInt9501 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray172[anInt2783++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray172[anInt2783++] = Static19.method541();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray172[--anInt2783];
					if (local175 >= 1 && local175 <= 2) {
						Static68.method1443(local175, false, -1, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.anInt3097;
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray172[--anInt2783];
					if (local175 >= 1 && local175 <= 2) {
						Static479.aClass1_Sub7_Sub1_1.anInt3097 = local175;
						Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt2792 -= 2;
					local83 = aStringArray14[anInt2792];
					local89 = aStringArray14[anInt2792 + 1];
					local97 = anIntArray172[--anInt2783];
					@Pc(3124) Class1_Sub48 local3124 = Static320.method4867(Static442.aClass170_2, Static448.aClass319_142);
					local3124.aClass1_Sub20_Sub1_2.method4378(Static419.method5867(local83) + Static419.method5867(local89) + 1);
					local3124.aClass1_Sub20_Sub1_2.method4399(local83);
					local3124.aClass1_Sub20_Sub1_2.method4399(local89);
					local3124.aClass1_Sub20_Sub1_2.method4378(local97);
					Static34.method813(local3124);
					return;
				}
				if (arg0 == 5401) {
					anInt2783 -= 2;
					Static528.aShortArray112[anIntArray172[anInt2783]] = (short) Static1.method40(anIntArray172[anInt2783 + 1]);
					Static46.aClass234_1.method5393();
					Static46.aClass234_1.method5399();
					Static183.aClass182_1.method4061();
					Static388.method5569();
					return;
				}
				if (arg0 == 5405) {
					anInt2783 -= 2;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static505.anIntArrayArrayArray18[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt2783 -= 7;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1] << 1;
					local97 = anIntArray172[anInt2783 + 2];
					local103 = anIntArray172[anInt2783 + 3];
					local2833 = anIntArray172[anInt2783 + 4];
					@Pc(3262) int local3262 = anIntArray172[anInt2783 + 5];
					@Pc(3268) int local3268 = anIntArray172[anInt2783 + 6];
					if (local175 >= 0 && local175 < 2 && Static505.anIntArrayArrayArray18[local175] != null && local776 >= 0 && local776 < Static505.anIntArrayArrayArray18[local175].length) {
						Static505.anIntArrayArrayArray18[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3268 };
						Static505.anIntArrayArrayArray18[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3262 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static505.anIntArrayArrayArray18[anIntArray172[--anInt2783]].length >> 1;
					anIntArray172[anInt2783++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static255.aFrame3 != null) {
						Static68.method1443(Static479.aClass1_Sub7_Sub1_1.anInt3097, false, -1, -1);
					}
					if (Static208.aFrame4 != null) {
						Static561.method5044();
						System.exit(0);
						return;
					}
					local83 = Static412.aString75 == null ? Static423.method5921() : Static412.aString75;
					Static314.method4795(false, Static246.aClass114_10, local83, Static375.anInt6609 == 1);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static105.aClass23_5 != null) {
						if (Static105.aClass23_5.anObject1 == null) {
							local83 = Static279.method4316(Static105.aClass23_5.anInt876);
						} else {
							local83 = (String) Static105.aClass23_5.anObject1;
						}
					}
					aStringArray14[anInt2792++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray172[anInt2783++] = Static246.aClass114_10.aBoolean212 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static255.aFrame3 != null) {
						Static68.method1443(Static479.aClass1_Sub7_Sub1_1.anInt3097, false, -1, -1);
					}
					local83 = aStringArray14[--anInt2792];
					local1496 = anIntArray172[--anInt2783] == 1;
					local181 = Static423.method5921() + local83;
					Static314.method4795(local1496, Static246.aClass114_10, local181, Static375.anInt6609 == 1);
					return;
				}
				if (arg0 == 5422) {
					anInt2792 -= 2;
					local83 = aStringArray14[anInt2792];
					local89 = aStringArray14[anInt2792 + 1];
					local97 = anIntArray172[--anInt2783];
					if (local83.length() > 0) {
						if (Static103.aStringArray10 == null) {
							Static103.aStringArray10 = new String[Static116.anIntArray139[Static275.aClass230_2.anInt6313]];
						}
						Static103.aStringArray10[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static306.aStringArray24 == null) {
							Static306.aStringArray24 = new String[Static116.anIntArray139[Static275.aClass230_2.anInt6313]];
						}
						Static306.aStringArray24[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray14[--anInt2792]);
					return;
				}
				if (arg0 == 5424) {
					anInt2783 -= 11;
					Static417.anInt7085 = anIntArray172[anInt2783];
					Static276.anInt5094 = anIntArray172[anInt2783 + 1];
					Static432.anInt7313 = anIntArray172[anInt2783 + 2];
					Static84.anInt1947 = anIntArray172[anInt2783 + 3];
					Static84.anInt1945 = anIntArray172[anInt2783 + 4];
					Static30.anInt871 = anIntArray172[anInt2783 + 5];
					Static189.anInt3884 = anIntArray172[anInt2783 + 6];
					Static21.anInt619 = anIntArray172[anInt2783 + 7];
					Static507.anInt8451 = anIntArray172[anInt2783 + 8];
					Static61.anInt1524 = anIntArray172[anInt2783 + 9];
					Static249.anInt4652 = anIntArray172[anInt2783 + 10];
					Static141.aClass111_32.method2434(Static84.anInt1945);
					Static141.aClass111_32.method2434(Static30.anInt871);
					Static141.aClass111_32.method2434(Static189.anInt3884);
					Static141.aClass111_32.method2434(Static21.anInt619);
					Static141.aClass111_32.method2434(Static507.anInt8451);
					Static371.aClass10_28 = null;
					Static404.aClass10_32 = null;
					Static244.aClass10_16 = null;
					Static356.aClass10_33 = null;
					Static425.aClass10_35 = null;
					Static428.aClass10_17 = null;
					Static382.aClass10_29 = null;
					Static402.aClass10_31 = null;
					Static268.aBoolean383 = true;
					return;
				}
				if (arg0 == 5425) {
					Static192.method3389();
					Static268.aBoolean383 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt2783 -= 2;
					Static316.anInt5680 = anIntArray172[anInt2783];
					Static183.anInt3713 = anIntArray172[anInt2783 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt2783 -= 2;
					Static326.anInt5841 = anIntArray172[anInt2783 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt2783 -= 2;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					anIntArray172[anInt2783++] = Static95.method1799(local175, local776) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static543.method7368(aStringArray14[--anInt2792], false, false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static602.method5582(Static412.anApplet1, "accountcreated");
						return;
					} catch (@Pc(3800) Throwable local3800) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static602.method5582(Static412.anApplet1, "accountcreatestarted");
						return;
					} catch (@Pc(3811) Throwable local3811) {
						return;
					}
				}
				if (arg0 == 5432) {
					local83 = "";
					if (Static226.aClipboard3 != null) {
						@Pc(3823) Transferable local3823 = Static226.aClipboard3.getContents(null);
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
					aStringArray14[anInt2792++] = local83;
					return;
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt2783 -= 4;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					local97 = anIntArray172[anInt2783 + 2];
					local103 = anIntArray172[anInt2783 + 3];
					Static111.method1971(local97, local776 << 2, (local175 >> 14 & 0x3FFF) - Static376.anInt6631, local103, false, (local175 & 0x3FFF) - Static24.anInt674);
					return;
				}
				if (arg0 == 5501) {
					anInt2783 -= 4;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					local97 = anIntArray172[anInt2783 + 2];
					local103 = anIntArray172[anInt2783 + 3];
					Static595.method7937(local97, (local175 >> 14 & 0x3FFF) - Static376.anInt6631, local776 << 2, local103, (local175 & 0x3FFF) - Static24.anInt674);
					return;
				}
				if (arg0 == 5502) {
					anInt2783 -= 6;
					local175 = anIntArray172[anInt2783];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static340.anInt6045 = local175;
					local776 = anIntArray172[anInt2783 + 1];
					if (local776 + 1 >= Static505.anIntArrayArrayArray18[Static340.anInt6045].length >> 1) {
						throw new RuntimeException();
					}
					Static151.anInt2849 = local776;
					Static141.anInt2724 = 0;
					Static251.anInt4677 = anIntArray172[anInt2783 + 2];
					Static60.anInt1501 = anIntArray172[anInt2783 + 3];
					local97 = anIntArray172[anInt2783 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static248.anInt4644 = local97;
					local103 = anIntArray172[anInt2783 + 5];
					if (local103 + 1 >= Static505.anIntArrayArrayArray18[Static248.anInt4644].length >> 1) {
						throw new RuntimeException();
					}
					Static205.anInt4107 = local103;
					Static585.anInt9461 = 3;
					Static282.anInt5182 = -1;
					Static394.anInt6810 = -1;
					return;
				}
				if (arg0 == 5503) {
					Static87.method1723();
					return;
				}
				if (arg0 == 5504) {
					anInt2783 -= 2;
					Static373.method5434(anIntArray172[anInt2783], anIntArray172[anInt2783 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray172[anInt2783++] = (int) Static79.aFloat37 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray172[anInt2783++] = (int) Static143.aFloat61 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static110.method1968();
					return;
				}
				if (arg0 == 5508) {
					Static454.method6381();
					return;
				}
				if (arg0 == 5509) {
					Static320.method4868();
					return;
				}
				if (arg0 == 5510) {
					Static386.method5561();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray172[--anInt2783];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static376.anInt6631;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static500.anInt6888) {
						local776 = Static500.anInt6888;
					}
					local97 -= Static24.anInt674;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static573.anInt9325) {
						local97 = Static573.anInt9325;
					}
					Static116.anInt2337 = (local776 << 9) + 256;
					Static260.anInt4768 = (local97 << 9) + 256;
					Static585.anInt9461 = 4;
					Static282.anInt5182 = -1;
					Static394.anInt6810 = -1;
					return;
				}
				if (arg0 == 5512) {
					Static258.method4053();
					return;
				}
				if (arg0 == 5517) {
					local175 = anIntArray172[--anInt2783];
					if (local175 == -1) {
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static376.anInt6631;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static500.anInt6888) {
							local776 = Static500.anInt6888;
						}
						local97 -= Static24.anInt674;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static573.anInt9325) {
							local97 = Static573.anInt9325;
						}
						Static394.anInt6810 = (local776 << 9) + 256;
						Static282.anInt5182 = (local97 << 9) + 256;
						return;
					}
					Static394.anInt6810 = -1;
					Static282.anInt5182 = -1;
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt2792 -= 2;
					local83 = aStringArray14[anInt2792];
					local89 = aStringArray14[anInt2792 + 1];
					local97 = anIntArray172[--anInt2783];
					if (Static177.anInt2101 != 3) {
						return;
					}
					if (Static316.anInt5682 == 0 && Static31.anInt879 == 0) {
						Static315.aString63 = local83;
						Static77.aString86 = local89;
						Static326.anInt5840 = local97;
						Static243.method3970(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static243.method3968();
					return;
				}
				if (arg0 == 5602) {
					if (Static316.anInt5682 == 0) {
						Static285.anInt9365 = -2;
						Static543.anInt8924 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt2783 -= 4;
					if (Static177.anInt2101 != 3) {
						return;
					}
					if (Static316.anInt5682 == 0 && Static31.anInt879 == 0) {
						Static498.method6956(anIntArray172[anInt2783 + 3], anIntArray172[anInt2783], anIntArray172[anInt2783 + 1], anIntArray172[anInt2783 + 2]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt2792--;
					if (Static177.anInt2101 != 3) {
						return;
					}
					if (Static316.anInt5682 == 0 && Static31.anInt879 == 0) {
						Static243.method3971(Static455.method6387(aStringArray14[anInt2792]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt2792 -= 2;
					if (Static177.anInt2101 != 3) {
						return;
					}
					if (Static316.anInt5682 == 0 && Static31.anInt879 == 0) {
						Static226.method4406(false, aStringArray14[anInt2792 + 1], Static455.method6387(aStringArray14[anInt2792]));
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static31.anInt879 == 0) {
						Static403.anInt6918 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray172[anInt2783++] = Static543.anInt8924;
					return;
				}
				if (arg0 == 5608) {
					anIntArray172[anInt2783++] = Static321.anInt5786;
					return;
				}
				if (arg0 == 5609) {
					anIntArray172[anInt2783++] = Static403.anInt6918;
					return;
				}
				if (arg0 == 5610) {
					for (local175 = 0; local175 < 5; local175++) {
						aStringArray14[anInt2792++] = Static542.aStringArray39 == null || Static542.aStringArray39.length <= local175 ? "" : Static276.method4282(Static542.aStringArray39[local175]);
					}
					Static542.aStringArray39 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray172[anInt2783++] = Static413.anInt7039;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray172[--anInt2783];
					if (Static177.anInt2101 != 7) {
						return;
					}
					if (Static316.anInt5682 == 0 && Static31.anInt879 == 0) {
						if (Static400.aClass75_3 != null) {
							Static400.aClass75_3.method1850();
							Static400.aClass75_3 = null;
						}
						Static326.anInt5840 = local175;
						Static243.method3970(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray172[anInt2783++] = Static543.anInt8924;
					return;
				}
				if (arg0 == 5615) {
					anInt2792 -= 2;
					local83 = aStringArray14[anInt2792];
					local89 = aStringArray14[anInt2792 + 1];
					if (Static177.anInt2101 != 3) {
						return;
					}
					if (Static316.anInt5682 == 0 && Static31.anInt879 == 0) {
						if (Static400.aClass75_3 != null) {
							Static400.aClass75_3.method1850();
							Static400.aClass75_3 = null;
						}
						Static315.aString63 = local83;
						Static77.aString86 = local89;
						Static243.method3970(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static340.method5070(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray172[anInt2783++] = Static285.anInt9365;
					return;
				}
				if (arg0 == 5618) {
					local175 = anIntArray172[--anInt2783];
					Static209.method3526(local175, false);
					return;
				}
				if (arg0 == 5619) {
					local175 = anIntArray172[--anInt2783];
					Static209.method3526(local175, true);
					return;
				}
				if (arg0 == 5620) {
					Static230.method5037();
					if (Static375.aString68 != "" && Static375.aString68 != "") {
						anIntArray172[anInt2783++] = 1;
						return;
					}
					anIntArray172[anInt2783++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt2792 -= 2;
					if (Static177.anInt2101 != 3) {
						return;
					}
					if (Static316.anInt5682 == 0 && Static31.anInt879 == 0) {
						Static226.method4406(true, aStringArray14[anInt2792 + 1], Static455.method6387(aStringArray14[anInt2792]));
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4719) Class23 local4719 = Static246.aClass114_10.method2514("3", false);
					while (local4719.anInt875 == 0) {
						Static423.method5918(1L);
					}
					if (local4719.anInt875 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4739) Class283 local4739 = (Class283) local4719.anObject1;
					if (local4739.method6492().exists()) {
						@Pc(4749) Class1_Sub20 local4749 = new Class1_Sub20(50);
						try {
							local4739.method6493(0, local4749.aByteArray52, 50);
						} catch (@Pc(4758) IOException local4758) {
						}
					}
					try {
						local4739.method6494();
						return;
					} catch (@Pc(4764) Exception local4764) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static210.aString41 != null) {
						anIntArray172[anInt2783++] = 1;
						return;
					}
					anIntArray172[anInt2783++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray172[anInt2783++] = (int) (Static368.aLong283 >> 32);
					anIntArray172[anInt2783++] = (int) (Static368.aLong283 & 0xFFFFL);
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray172[--anInt2783];
					if (local175 < 1) {
						local175 = 1;
					}
					if (local175 > 4) {
						local175 = 4;
					}
					Static479.aClass1_Sub7_Sub1_1.anInt3091 = local175;
					Static499.method6958();
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6002) {
					Static479.aClass1_Sub7_Sub1_1.method2630(anIntArray172[--anInt2783] == 1);
					Static499.method6958();
					Static566.method7638();
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6003) {
					Static479.aClass1_Sub7_Sub1_1.aBoolean227 = anIntArray172[--anInt2783] == 1;
					Static566.method7638();
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6005) {
					Static479.aClass1_Sub7_Sub1_1.aBoolean220 = anIntArray172[--anInt2783] == 1;
					Static499.method6958();
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6006) {
					Static479.aClass1_Sub7_Sub1_1.aBoolean219 = anIntArray172[--anInt2783] == 1;
					Static136.aClass12_8.method6398(!Static479.aClass1_Sub7_Sub1_1.aBoolean219);
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6007) {
					Static479.aClass1_Sub7_Sub1_1.anInt3110 = anIntArray172[--anInt2783];
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6008) {
					Static479.aClass1_Sub7_Sub1_1.aBoolean224 = anIntArray172[--anInt2783] == 1;
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6009) {
					Static479.aClass1_Sub7_Sub1_1.aBoolean234 = anIntArray172[--anInt2783] == 1;
					Static499.method6958();
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6010) {
					Static479.aClass1_Sub7_Sub1_1.aBoolean225 = anIntArray172[--anInt2783] == 1;
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6011) {
					local175 = anIntArray172[--anInt2783];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static479.aClass1_Sub7_Sub1_1.method2614(local175, Static375.anInt6609);
					Static499.method6958();
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6012) {
					Static479.aClass1_Sub7_Sub1_1.method2616(anIntArray172[--anInt2783] == 1, Static375.anInt6609);
					Static89.method1753();
					Static224.method3681();
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6014) {
					Static479.aClass1_Sub7_Sub1_1.aBoolean228 = anIntArray172[--anInt2783] == 1;
					Static499.method6958();
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6015) {
					Static479.aClass1_Sub7_Sub1_1.aBoolean230 = anIntArray172[--anInt2783] == 1;
					Static499.method6958();
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6016) {
					local175 = anIntArray172[--anInt2783];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static479.aClass1_Sub7_Sub1_1.anInt3105 = local175;
					Static69.method1449(Static375.anInt6609);
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					return;
				}
				if (arg0 == 6017) {
					Static479.aClass1_Sub7_Sub1_1.aBoolean233 = anIntArray172[--anInt2783] == 1;
					Static381.method5518();
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6018) {
					local175 = anIntArray172[--anInt2783];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static479.aClass1_Sub7_Sub1_1.anInt3096 = local175;
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray172[--anInt2783];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static479.aClass1_Sub7_Sub1_1.anInt3103) {
						if (Static479.aClass1_Sub7_Sub1_1.anInt3103 == 0 && Static525.anInt8671 != -1) {
							Static151.method2397(Static153.aClass111_34, local175, Static525.anInt8671);
							Static571.aBoolean680 = false;
						} else if (local175 == 0) {
							Static261.method4078();
							Static571.aBoolean680 = false;
						} else {
							Static205.method3504(local175);
						}
						Static479.aClass1_Sub7_Sub1_1.anInt3103 = local175;
					}
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6020) {
					local175 = anIntArray172[--anInt2783];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static479.aClass1_Sub7_Sub1_1.anInt3107 = local175;
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6021) {
					Static479.aClass1_Sub7_Sub1_1.aBoolean241 = anIntArray172[--anInt2783] == 1;
					Static566.method7638();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray172[--anInt2783];
					local1496 = false;
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 2) {
						local175 = 2;
					}
					if (Static72.anInt1778 < 96) {
						local175 = 0;
						local1496 = true;
					}
					Static101.method1859(local175);
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					anIntArray172[anInt2783++] = local1496 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local175 = anIntArray172[--anInt2783];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static479.aClass1_Sub7_Sub1_1.anInt3093 = local175;
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					return;
				}
				if (arg0 == 6025) {
					local175 = anIntArray172[--anInt2783];
					if (local175 < 0 || local175 > Static77.method6749(Static72.anInt1778)) {
						local175 = 0;
					}
					Static479.aClass1_Sub7_Sub1_1.anInt3100 = local175;
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray172[--anInt2783];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static412.method5783(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static479.aClass1_Sub7_Sub1_1.aBoolean236 = anIntArray172[--anInt2783] != 0;
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					return;
				}
				if (arg0 == 6029) {
					Static479.aClass1_Sub7_Sub1_1.anInt3110 = anIntArray172[--anInt2783];
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					return;
				}
				if (arg0 == 6030) {
					Static479.aClass1_Sub7_Sub1_1.aBoolean226 = anIntArray172[--anInt2783] != 0;
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static499.method6958();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray172[--anInt2783];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static69.method1449(local175);
					return;
				}
				if (arg0 == 6032) {
					local175 = anIntArray172[--anInt2783];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static479.aClass1_Sub7_Sub1_1.anInt3115 = local175;
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6033) {
					local175 = anIntArray172[--anInt2783];
					if (local175 < 0 || local175 > 4) {
						local175 = 2;
					}
					Static479.aClass1_Sub7_Sub1_1.anInt3113 = local175;
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					return;
				}
				if (arg0 == 6034) {
					Static479.aClass1_Sub7_Sub1_1.aBoolean223 = anIntArray172[--anInt2783] == 1;
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static89.method1753();
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6035) {
					Static479.aClass1_Sub7_Sub1_1.aBoolean239 = anIntArray172[--anInt2783] == 1;
					Static499.method6958();
					Static566.method7638();
					return;
				}
				if (arg0 == 6036) {
					local175 = anIntArray172[--anInt2783];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static479.aClass1_Sub7_Sub1_1.method2629(local175);
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					return;
				}
				if (arg0 == 6037) {
					local175 = anIntArray172[--anInt2783];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static479.aClass1_Sub7_Sub1_1.anInt3102 = local175;
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray172[--anInt2783];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static479.aClass1_Sub7_Sub1_1.anInt3111 && Static525.anInt8671 == Static492.anInt8283) {
						if (Static479.aClass1_Sub7_Sub1_1.anInt3111 == 0) {
							Static151.method2397(Static153.aClass111_34, local175, Static525.anInt8671);
							Static571.aBoolean680 = false;
						} else if (local175 == 0) {
							Static261.method4078();
							Static571.aBoolean680 = false;
						} else {
							Static205.method3504(local175);
						}
					}
					Static479.aClass1_Sub7_Sub1_1.anInt3111 = local175;
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray172[--anInt2783];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static479.aClass1_Sub7_Sub1_1.anInt3114) {
						Static479.aClass1_Sub7_Sub1_1.anInt3114 = local175;
						Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
						Static392.aBoolean493 = false;
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.anInt3091;
					return;
				}
				if (arg0 == 6102) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.method2637(Static375.anInt6609) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.aBoolean227 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.aBoolean220 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.aBoolean219 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.anInt3110;
					return;
				}
				if (arg0 == 6108) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.aBoolean224 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.aBoolean234 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.aBoolean225 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.method2620(Static375.anInt6609);
					return;
				}
				if (arg0 == 6112) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.method2618(Static375.anInt6609) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.aBoolean228 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.aBoolean230 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.anInt3105;
					return;
				}
				if (arg0 == 6117) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.aBoolean233 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.anInt3096;
					return;
				}
				if (arg0 == 6119) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.anInt3103;
					return;
				}
				if (arg0 == 6120) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.anInt3107;
					return;
				}
				if (arg0 == 6121) {
					anIntArray172[anInt2783++] = Static136.aClass12_8.method6411() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray172[anInt2783++] = Static484.method6768();
					return;
				}
				if (arg0 == 6124) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.anInt3093;
					return;
				}
				if (arg0 == 6125) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.anInt3100;
					return;
				}
				if (arg0 == 6126) {
					anIntArray172[anInt2783++] = Static136.aClass12_8.method6439() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.aBoolean232 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.aBoolean236 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.anInt3110;
					return;
				}
				if (arg0 == 6130) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.aBoolean226 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray172[anInt2783++] = Static375.anInt6609;
					return;
				}
				if (arg0 == 6132) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.anInt3115;
					return;
				}
				if (arg0 == 6133) {
					anIntArray172[anInt2783++] = Static246.aClass114_10.aBoolean212 && !Static246.aClass114_10.aBoolean213 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray172[anInt2783++] = Static77.method6749(Static72.anInt1778);
					return;
				}
				if (arg0 == 6135) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.anInt3113;
					return;
				}
				if (arg0 == 6136) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.aBoolean223 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(6352) boolean local6352 = true;
					try {
						local6352 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(6362) Throwable local6362) {
					}
					anIntArray172[anInt2783++] = local6352 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray172[anInt2783++] = Static46.method1120(Static375.anInt6609, 200);
					return;
				}
				if (arg0 == 6139) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.method2632(Static375.anInt6609);
					return;
				}
				if (arg0 == 6140) {
					@Pc(6410) byte local6410 = 0;
					if (Static319.method4852(Static375.anInt6609) && Static72.anInt1778 < 96) {
						local6410 = 1;
					}
					anIntArray172[anInt2783++] = local6410;
					return;
				}
				if (arg0 == 6141) {
					if (Static72.anInt1778 < 96) {
						anIntArray172[anInt2783++] = 0;
						return;
					}
					anIntArray172[anInt2783++] = 2;
					return;
				}
				if (arg0 == 6142) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.anInt3102;
					return;
				}
				if (arg0 == 6143) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.anInt3111;
					return;
				}
				if (arg0 == 6144) {
					anIntArray172[anInt2783++] = Static307.aBoolean415 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.anInt3114;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt2783 -= 2;
					Static486.aShort87 = (short) anIntArray172[anInt2783];
					if (Static486.aShort87 <= 0) {
						Static486.aShort87 = 256;
					}
					Static381.aShort68 = (short) anIntArray172[anInt2783 + 1];
					if (Static381.aShort68 <= 0) {
						Static381.aShort68 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt2783 -= 2;
					Static12.aShort1 = (short) anIntArray172[anInt2783];
					if (Static12.aShort1 <= 0) {
						Static12.aShort1 = 256;
					}
					Static319.aShort52 = (short) anIntArray172[anInt2783 + 1];
					if (Static319.aShort52 <= 0) {
						Static319.aShort52 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt2783 -= 4;
					Static375.aShort67 = (short) anIntArray172[anInt2783];
					if (Static375.aShort67 <= 0) {
						Static375.aShort67 = 1;
					}
					Static412.aShort69 = (short) anIntArray172[anInt2783 + 1];
					if (Static412.aShort69 <= 0) {
						Static412.aShort69 = 32767;
					} else if (Static412.aShort69 < Static375.aShort67) {
						Static412.aShort69 = Static375.aShort67;
					}
					Static495.aShort96 = (short) anIntArray172[anInt2783 + 2];
					if (Static495.aShort96 <= 0) {
						Static495.aShort96 = 1;
					}
					Static200.aShort43 = (short) anIntArray172[anInt2783 + 3];
					if (Static200.aShort43 <= 0) {
						Static200.aShort43 = 32767;
						return;
					}
					if (Static200.aShort43 < Static495.aShort96) {
						Static200.aShort43 = Static495.aShort96;
					}
					return;
				}
				if (arg0 == 6203) {
					Static340.method5071(0, 0, Static399.aClass365_12.anInt9638, Static399.aClass365_12.anInt9578, false);
					anIntArray172[anInt2783++] = Static304.anInt5528;
					anIntArray172[anInt2783++] = Static271.anInt5044;
					return;
				}
				if (arg0 == 6204) {
					anIntArray172[anInt2783++] = Static12.aShort1;
					anIntArray172[anInt2783++] = Static319.aShort52;
					return;
				}
				if (arg0 == 6205) {
					anIntArray172[anInt2783++] = Static486.aShort87;
					anIntArray172[anInt2783++] = Static381.aShort68;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray172[anInt2783++] = (int) (Static255.method4035() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray172[anInt2783++] = (int) (Static255.method4035() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt2783 -= 3;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					local97 = anIntArray172[anInt2783 + 2];
					aCalendar1.clear();
					aCalendar1.set(11, 12);
					aCalendar1.set(local97, local776, local175);
					local103 = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray172[anInt2783++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar1.clear();
					aCalendar1.setTime(new Date(Static255.method4035()));
					anIntArray172[anInt2783++] = aCalendar1.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray172[--anInt2783];
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
					anIntArray172[anInt2783++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray172[anInt2783++] = Static177.method1851() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray172[anInt2783++] = Static57.method1362() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static177.anInt2101 == 7 && Static316.anInt5682 == 0 && Static31.anInt879 == 0) {
						if (Static281.aBoolean391) {
							anIntArray172[anInt2783++] = 0;
							return;
						}
						if (Static24.aLong27 > Static255.method4035() - 1000L) {
							anIntArray172[anInt2783++] = 1;
							return;
						}
						Static281.aBoolean391 = true;
						local52 = Static320.method4867(Static442.aClass170_2, Static135.aClass319_55);
						local52.aClass1_Sub20_Sub1_2.method4421(Static475.anInt8048);
						Static34.method813(local52);
						anIntArray172[anInt2783++] = 0;
						return;
					}
					anIntArray172[anInt2783++] = 1;
					return;
				}
				@Pc(7033) Class272 local7033;
				@Pc(7000) Class208_Sub1 local7000;
				if (arg0 == 6501) {
					local7000 = Static6.method5138();
					if (local7000 != null) {
						anIntArray172[anInt2783++] = local7000.anInt5565;
						anIntArray172[anInt2783++] = local7000.anInt5554;
						aStringArray14[anInt2792++] = local7000.aString61;
						local7033 = local7000.method4739();
						anIntArray172[anInt2783++] = local7033.anInt7699;
						aStringArray14[anInt2792++] = local7033.aString80;
						anIntArray172[anInt2783++] = local7000.anInt5559;
						anIntArray172[anInt2783++] = local7000.anInt5561;
						aStringArray14[anInt2792++] = local7000.aString62;
						return;
					}
					anIntArray172[anInt2783++] = -1;
					anIntArray172[anInt2783++] = 0;
					aStringArray14[anInt2792++] = "";
					anIntArray172[anInt2783++] = 0;
					aStringArray14[anInt2792++] = "";
					anIntArray172[anInt2783++] = 0;
					anIntArray172[anInt2783++] = 0;
					aStringArray14[anInt2792++] = "";
					return;
				}
				if (arg0 == 6502) {
					local7000 = Static402.method5681();
					if (local7000 != null) {
						anIntArray172[anInt2783++] = local7000.anInt5565;
						anIntArray172[anInt2783++] = local7000.anInt5554;
						aStringArray14[anInt2792++] = local7000.aString61;
						local7033 = local7000.method4739();
						anIntArray172[anInt2783++] = local7033.anInt7699;
						aStringArray14[anInt2792++] = local7033.aString80;
						anIntArray172[anInt2783++] = local7000.anInt5559;
						anIntArray172[anInt2783++] = local7000.anInt5561;
						aStringArray14[anInt2792++] = local7000.aString62;
						return;
					}
					anIntArray172[anInt2783++] = -1;
					anIntArray172[anInt2783++] = 0;
					aStringArray14[anInt2792++] = "";
					anIntArray172[anInt2783++] = 0;
					aStringArray14[anInt2792++] = "";
					anIntArray172[anInt2783++] = 0;
					anIntArray172[anInt2783++] = 0;
					aStringArray14[anInt2792++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray172[--anInt2783];
					local89 = aStringArray14[--anInt2792];
					if (Static177.anInt2101 == 7 && Static316.anInt5682 == 0 && Static31.anInt879 == 0) {
						anIntArray172[anInt2783++] = Static473.method6674(local89, local175) ? 1 : 0;
						return;
					}
					anIntArray172[anInt2783++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static479.aClass1_Sub7_Sub1_1.anInt3090 = anIntArray172[--anInt2783];
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					return;
				}
				if (arg0 == 6505) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.anInt3090;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray172[--anInt2783];
					@Pc(7390) Class208_Sub1 local7390 = Static520.method7105(local175);
					if (local7390 != null) {
						anIntArray172[anInt2783++] = local7390.anInt5554;
						aStringArray14[anInt2792++] = local7390.aString61;
						@Pc(7414) Class272 local7414 = local7390.method4739();
						anIntArray172[anInt2783++] = local7414.anInt7699;
						aStringArray14[anInt2792++] = local7414.aString80;
						anIntArray172[anInt2783++] = local7390.anInt5559;
						anIntArray172[anInt2783++] = local7390.anInt5561;
						aStringArray14[anInt2792++] = local7390.aString62;
						return;
					}
					anIntArray172[anInt2783++] = -1;
					aStringArray14[anInt2792++] = "";
					anIntArray172[anInt2783++] = 0;
					aStringArray14[anInt2792++] = "";
					anIntArray172[anInt2783++] = 0;
					anIntArray172[anInt2783++] = 0;
					aStringArray14[anInt2792++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt2783 -= 4;
					local175 = anIntArray172[anInt2783];
					local1496 = anIntArray172[anInt2783 + 1] == 1;
					local97 = anIntArray172[anInt2783 + 2];
					local2107 = anIntArray172[anInt2783 + 3] == 1;
					Static440.method6221(local2107, local97, local1496, local175);
					return;
				}
				if (arg0 == 6508) {
					Static331.method4980();
					return;
				}
				if (arg0 == 6509) {
					if (Static177.anInt2101 != 7) {
						return;
					}
					Static7.aBoolean4 = anIntArray172[--anInt2783] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray172[anInt2783++] = Static526.anInt8706;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static479.aClass1_Sub7_Sub1_1.aBoolean231 = anIntArray172[--anInt2783] == 1;
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					return;
				}
				if (arg0 == 6601) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.aBoolean231 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static417.aClass276_2 == Static550.aClass276_3) {
				if (arg0 == 6700) {
					local175 = Static68.aClass356_4.method7799();
					if (Static219.anInt4263 != -1) {
						local175++;
					}
					anIntArray172[anInt2783++] = local175;
					return;
				}
				if (arg0 == 6701) {
					local175 = anIntArray172[--anInt2783];
					if (Static219.anInt4263 != -1) {
						if (local175 == 0) {
							anIntArray172[anInt2783++] = Static219.anInt4263;
							return;
						}
						local175--;
					}
					@Pc(7701) Class1_Sub16 local7701 = (Class1_Sub16) Static68.aClass356_4.method7792();
					while (local175-- > 0) {
						local7701 = (Class1_Sub16) Static68.aClass356_4.method7795();
					}
					anIntArray172[anInt2783++] = local7701.anInt2681;
					return;
				}
				if (arg0 == 6702) {
					local175 = anIntArray172[--anInt2783];
					if (Static249.aClass365ArrayArray3[local175] == null) {
						aStringArray14[anInt2792++] = "";
						return;
					}
					local89 = Static249.aClass365ArrayArray3[local175][0].aString96;
					if (local89 == null) {
						aStringArray14[anInt2792++] = "";
						return;
					}
					aStringArray14[anInt2792++] = local89.substring(0, local89.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local175 = anIntArray172[--anInt2783];
					if (Static249.aClass365ArrayArray3[local175] == null) {
						anIntArray172[anInt2783++] = 0;
						return;
					}
					anIntArray172[anInt2783++] = Static249.aClass365ArrayArray3[local175].length;
					return;
				}
				if (arg0 == 6704) {
					anInt2783 -= 2;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					if (Static249.aClass365ArrayArray3[local175] == null) {
						aStringArray14[anInt2792++] = "";
						return;
					}
					local181 = Static249.aClass365ArrayArray3[local175][local776].aString96;
					if (local181 == null) {
						aStringArray14[anInt2792++] = "";
						return;
					}
					aStringArray14[anInt2792++] = local181;
					return;
				}
				if (arg0 == 6705) {
					anInt2783 -= 2;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					if (Static249.aClass365ArrayArray3[local175] == null) {
						anIntArray172[anInt2783++] = 0;
						return;
					}
					anIntArray172[anInt2783++] = Static249.aClass365ArrayArray3[local175][local776].anInt9639;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt2783 -= 3;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					local97 = anIntArray172[anInt2783 + 2];
					Static211.method3546(local175 << 16 | local776, local97, "", 1);
					return;
				}
				if (arg0 == 6708) {
					anInt2783 -= 3;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					local97 = anIntArray172[anInt2783 + 2];
					Static211.method3546(local175 << 16 | local776, local97, "", 2);
					return;
				}
				if (arg0 == 6709) {
					anInt2783 -= 3;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					local97 = anIntArray172[anInt2783 + 2];
					Static211.method3546(local175 << 16 | local776, local97, "", 3);
					return;
				}
				if (arg0 == 6710) {
					anInt2783 -= 3;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					local97 = anIntArray172[anInt2783 + 2];
					Static211.method3546(local175 << 16 | local776, local97, "", 4);
					return;
				}
				if (arg0 == 6711) {
					anInt2783 -= 3;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					local97 = anIntArray172[anInt2783 + 2];
					Static211.method3546(local175 << 16 | local776, local97, "", 5);
					return;
				}
				if (arg0 == 6712) {
					anInt2783 -= 3;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					local97 = anIntArray172[anInt2783 + 2];
					Static211.method3546(local175 << 16 | local776, local97, "", 6);
					return;
				}
				if (arg0 == 6713) {
					anInt2783 -= 3;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					local97 = anIntArray172[anInt2783 + 2];
					Static211.method3546(local175 << 16 | local776, local97, "", 7);
					return;
				}
				if (arg0 == 6714) {
					anInt2783 -= 3;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					local97 = anIntArray172[anInt2783 + 2];
					Static211.method3546(local175 << 16 | local776, local97, "", 8);
					return;
				}
				if (arg0 == 6715) {
					anInt2783 -= 3;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					local97 = anIntArray172[anInt2783 + 2];
					Static211.method3546(local175 << 16 | local776, local97, "", 9);
					return;
				}
				if (arg0 == 6716) {
					anInt2783 -= 3;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					local97 = anIntArray172[anInt2783 + 2];
					Static211.method3546(local175 << 16 | local776, local97, "", 10);
					return;
				}
				if (arg0 == 6717) {
					anInt2783 -= 3;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					local97 = anIntArray172[anInt2783 + 2];
					@Pc(8289) Class365 local8289 = Static583.method7803(local175 << 16 | local776, local97);
					Static130.method6495();
					@Pc(8294) Class1_Sub28 local8294 = Static72.method1565(local8289);
					Static478.method6711(local8294.method4818(), local8289, local8294.anInt5702);
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(8322) Class196 local8322;
				if (arg0 == 6800) {
					local175 = anIntArray172[--anInt2783];
					local8322 = Static299.aClass46_4.method1408(local175);
					if (local8322.aString57 == null) {
						aStringArray14[anInt2792++] = "";
						return;
					}
					aStringArray14[anInt2792++] = local8322.aString57;
					return;
				}
				if (arg0 == 6801) {
					local175 = anIntArray172[--anInt2783];
					local8322 = Static299.aClass46_4.method1408(local175);
					anIntArray172[anInt2783++] = local8322.anInt5179;
					return;
				}
				if (arg0 == 6802) {
					local175 = anIntArray172[--anInt2783];
					local8322 = Static299.aClass46_4.method1408(local175);
					anIntArray172[anInt2783++] = local8322.anInt5171;
					return;
				}
				if (arg0 == 6803) {
					local175 = anIntArray172[--anInt2783];
					local8322 = Static299.aClass46_4.method1408(local175);
					anIntArray172[anInt2783++] = local8322.anInt5173;
					return;
				}
				if (arg0 == 6804) {
					anInt2783 -= 2;
					local175 = anIntArray172[anInt2783];
					local776 = anIntArray172[anInt2783 + 1];
					@Pc(8444) Class105 local8444 = Static88.aClass183_1.method4071(local776);
					if (local8444.method2400()) {
						aStringArray14[anInt2792++] = Static299.aClass46_4.method1408(local175).method4329(local776, local8444.aString29);
						return;
					}
					anIntArray172[anInt2783++] = Static299.aClass46_4.method1408(local175).method4335(local8444.anInt2858, local776);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray172[anInt2783++] = Static242.aBoolean359 && !Static35.aBoolean80 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray172[anInt2783++] = Static28.anInt3095;
					return;
				}
				if (arg0 == 6902) {
					anIntArray172[anInt2783++] = Static590.anInt9532;
					return;
				}
				if (arg0 == 6903) {
					anIntArray172[anInt2783++] = Static65.anInt1570;
					return;
				}
				if (arg0 == 6904) {
					anIntArray172[anInt2783++] = Static150.anInt2843;
					return;
				}
				if (arg0 == 6905) {
					local83 = "";
					if (Static105.aClass23_5 != null) {
						if (Static105.aClass23_5.anObject1 == null) {
							local83 = Static279.method4316(Static105.aClass23_5.anInt876);
						} else {
							local83 = (String) Static105.aClass23_5.anObject1;
						}
					}
					aStringArray14[anInt2792++] = local83;
					return;
				}
				if (arg0 == 6906) {
					anIntArray172[anInt2783++] = Static282.anInt5184;
					return;
				}
				if (arg0 == 6907) {
					anIntArray172[anInt2783++] = Static499.anInt8356;
					return;
				}
				if (arg0 == 6908) {
					anIntArray172[anInt2783++] = Static205.anInt4104;
					return;
				}
				if (arg0 == 6909) {
					anIntArray172[anInt2783++] = Static247.aBoolean361 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray172[anInt2783++] = Static506.anInt8447;
					return;
				}
				if (arg0 == 6911) {
					anIntArray172[anInt2783++] = Static23.anInt6321;
					return;
				}
				if (arg0 == 6912) {
					anIntArray172[anInt2783++] = Static427.anInt7256;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local175 = Static479.aClass1_Sub7_Sub1_1.method2635();
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.anInt3130 = Static375.anInt6609;
					anIntArray172[anInt2783++] = local175;
					Static499.method6958();
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 7001) {
					Static479.aClass1_Sub7_Sub1_1.method2641();
					Static499.method6958();
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 7002) {
					Static479.aClass1_Sub7_Sub1_1.method2631();
					Static499.method6958();
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 7003) {
					Static479.aClass1_Sub7_Sub1_1.method2633();
					Static499.method6958();
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 7004) {
					Static479.aClass1_Sub7_Sub1_1.method2642(true);
					Static499.method6958();
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 7005) {
					Static479.aClass1_Sub7_Sub1_1.anInt3101 = 0;
					Static479.aClass1_Sub7_Sub1_1.method2628(Static246.aClass114_10);
					Static392.aBoolean493 = false;
					return;
				}
				if (arg0 == 7006) {
					if (Static479.aClass1_Sub7_Sub1_1.anInt3130 == 2) {
						Static479.aClass1_Sub7_Sub1_1.aBoolean238 = true;
						return;
					}
					if (Static479.aClass1_Sub7_Sub1_1.anInt3130 == 1) {
						Static479.aClass1_Sub7_Sub1_1.aBoolean237 = true;
						return;
					}
					if (Static479.aClass1_Sub7_Sub1_1.anInt3130 == 3) {
						Static479.aClass1_Sub7_Sub1_1.aBoolean240 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray172[anInt2783++] = Static479.aClass1_Sub7_Sub1_1.anInt3101;
					return;
				}
				if (arg0 == 7008) {
					if (Static375.anInt6609 == 0 && Static72.anInt1778 < 96) {
						anIntArray172[anInt2783++] = 1;
						return;
					}
					anIntArray172[anInt2783++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(IZ)V")
	private static void method2357(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class365 local137;
		@Pc(158) Class365 local158;
		@Pc(35) Class365 local35;
		@Pc(56) int local56;
		@Pc(13) int local13;
		@Pc(19) int local19;
		@Pc(25) int local25;
		@Pc(210) Class365 local210;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt2783 -= 3;
				local13 = anIntArray172[anInt2783];
				local19 = anIntArray172[anInt2783 + 1];
				local25 = anIntArray172[anInt2783 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static374.method5437(local13);
				if (local35.aClass365Array2 == null) {
					local35.aClass365Array2 = new Class365[local25 + 1];
				}
				if (local35.aClass365Array2.length <= local25) {
					@Pc(54) Class365[] local54 = new Class365[local25 + 1];
					for (local56 = 0; local56 < local35.aClass365Array2.length; local56++) {
						local54[local56] = local35.aClass365Array2[local56];
					}
					local35.aClass365Array2 = local54;
				}
				if (local25 > 0 && local35.aClass365Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class365 local99 = new Class365();
				local99.anInt9595 = local19;
				local99.anInt9590 = local99.anInt9646 = local35.anInt9646;
				local99.anInt9603 = local25;
				local35.aClass365Array2[local25] = local99;
				if (arg1) {
					aClass365_5 = local99;
				} else {
					aClass365_6 = local99;
				}
				Static201.method5537(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass365_5 : aClass365_6;
				if (local137.anInt9603 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static374.method5437(local137.anInt9646);
				local158.aClass365Array2[local137.anInt9603] = null;
				Static201.method5537(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static374.method5437(anIntArray172[--anInt2783]);
				local137.aClass365Array2 = null;
				Static201.method5537(local137);
				return;
			}
			if (arg0 == 200) {
				anInt2783 -= 2;
				local13 = anIntArray172[anInt2783];
				local19 = anIntArray172[anInt2783 + 1];
				local210 = Static583.method7803(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray172[anInt2783++] = 1;
					if (arg1) {
						aClass365_5 = local210;
						return;
					}
					aClass365_6 = local210;
					return;
				}
				anIntArray172[anInt2783++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray172[--anInt2783];
				local158 = Static374.method5437(local13);
				if (local158 != null) {
					anIntArray172[anInt2783++] = 1;
					if (arg1) {
						aClass365_5 = local158;
						return;
					}
					aClass365_6 = local158;
					return;
				}
				anIntArray172[anInt2783++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray172[--anInt2783];
				method2359(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray172[--anInt2783];
				method2352(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt2783 -= 2;
					local13 = anIntArray172[anInt2783];
					local19 = anIntArray172[anInt2783 + 1];
					for (local25 = 0; local25 < Static573.anIntArray622.length; local25++) {
						if (Static573.anIntArray622[local25] == local13) {
							Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aClass34_1.method1017(Static412.aClass93_1, local25, local19);
							return;
						}
					}
					for (local353 = 0; local353 < Static444.anIntArray357.length; local353++) {
						if (Static444.anIntArray357[local353] == local13) {
							Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aClass34_1.method1017(Static412.aClass93_1, local353, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt2783 -= 2;
					local13 = anIntArray172[anInt2783];
					local19 = anIntArray172[anInt2783 + 1];
					Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aClass34_1.method1016(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray172[--anInt2783] != 0;
					Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aClass34_1.method1013(local412);
					return;
				}
				if (arg0 == 411) {
					anInt2783 -= 2;
					local13 = anIntArray172[anInt2783];
					local19 = anIntArray172[anInt2783 + 1];
					Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aClass34_1.method1015(local13, local19, Static46.aClass234_1);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static374.method5437(anIntArray172[--anInt2783]);
				} else {
					local137 = arg1 ? aClass365_5 : aClass365_6;
				}
				if (arg0 == 1000) {
					anInt2783 -= 4;
					local137.anInt9644 = anIntArray172[anInt2783];
					local137.anInt9604 = anIntArray172[anInt2783 + 1];
					local19 = anIntArray172[anInt2783 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray172[anInt2783 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte125 = (byte) local19;
					local137.aByte127 = (byte) local25;
					Static201.method5537(local137);
					Static166.method2552(local137);
					if (local137.anInt9603 == -1) {
						Static82.method7601(local137.anInt9646);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt2783 -= 4;
					local137.anInt9627 = anIntArray172[anInt2783];
					local137.anInt9582 = anIntArray172[anInt2783 + 1];
					local137.anInt9615 = 0;
					local137.anInt9658 = 0;
					local19 = anIntArray172[anInt2783 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray172[anInt2783 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte126 = (byte) local19;
					local137.aByte124 = (byte) local25;
					Static201.method5537(local137);
					Static166.method2552(local137);
					if (local137.anInt9595 == 0) {
						Static26.method716(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(645) boolean local645 = anIntArray172[--anInt2783] == 1;
					if (local137.aBoolean711 != local645) {
						local137.aBoolean711 = local645;
						Static201.method5537(local137);
					}
					if (local137.anInt9603 == -1) {
						Static245.method3979(local137.anInt9646);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt2783 -= 2;
					local137.anInt9589 = anIntArray172[anInt2783];
					local137.anInt9588 = anIntArray172[anInt2783 + 1];
					Static201.method5537(local137);
					Static166.method2552(local137);
					if (local137.anInt9595 == 0) {
						Static26.method716(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean700 = anIntArray172[--anInt2783] == 1;
					return;
				}
			} else {
				@Pc(1507) String local1507;
				@Pc(1145) String local1145;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static374.method5437(anIntArray172[--anInt2783]);
					} else {
						local137 = arg1 ? aClass365_5 : aClass365_6;
					}
					if (arg0 == 1100) {
						anInt2783 -= 2;
						local137.anInt9571 = anIntArray172[anInt2783];
						if (local137.anInt9571 > local137.anInt9594 - local137.anInt9578) {
							local137.anInt9571 = local137.anInt9594 - local137.anInt9578;
						}
						if (local137.anInt9571 < 0) {
							local137.anInt9571 = 0;
						}
						local137.anInt9617 = anIntArray172[anInt2783 + 1];
						if (local137.anInt9617 > local137.anInt9599 - local137.anInt9638) {
							local137.anInt9617 = local137.anInt9599 - local137.anInt9638;
						}
						if (local137.anInt9617 < 0) {
							local137.anInt9617 = 0;
						}
						Static201.method5537(local137);
						if (local137.anInt9603 == -1) {
							Static450.method6373(local137.anInt9646);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt9633 = anIntArray172[--anInt2783];
						Static201.method5537(local137);
						if (local137.anInt9603 == -1) {
							Static528.method7220(local137.anInt9646);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean697 = anIntArray172[--anInt2783] == 1;
						Static201.method5537(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt9601 = anIntArray172[--anInt2783];
						Static201.method5537(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt9641 = anIntArray172[--anInt2783];
						Static201.method5537(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray172[--anInt2783];
						if (local137.anInt9602 != local19) {
							local137.anInt9602 = local19;
							Static201.method5537(local137);
						}
						if (local137.anInt9603 == -1) {
							Static551.method7499(local137.anInt9646);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt9606 = anIntArray172[--anInt2783];
						Static201.method5537(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean708 = anIntArray172[--anInt2783] == 1;
						Static201.method5537(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt9576 = 1;
						local137.anInt9620 = anIntArray172[--anInt2783];
						Static201.method5537(local137);
						if (local137.anInt9603 == -1) {
							Static71.method1509(local137.anInt9646);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt2783 -= 6;
						local137.anInt9623 = anIntArray172[anInt2783];
						local137.anInt9651 = anIntArray172[anInt2783 + 1];
						local137.anInt9660 = anIntArray172[anInt2783 + 2];
						local137.anInt9612 = anIntArray172[anInt2783 + 3];
						local137.anInt9622 = anIntArray172[anInt2783 + 4];
						local137.anInt9608 = anIntArray172[anInt2783 + 5];
						Static201.method5537(local137);
						if (local137.anInt9603 == -1) {
							Static119.method2028(local137.anInt9646);
							Static560.method7544(local137.anInt9646);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray172[--anInt2783];
						if (local137.anInt9611 != local19) {
							local137.anInt9611 = local19;
							local137.anInt9583 = 0;
							local137.anInt9574 = 1;
							local137.anInt9643 = 0;
							@Pc(1094) Class131 local1094 = local137.anInt9611 == -1 ? null : Static594.aClass311_2.method7009(local137.anInt9611);
							if (local1094 != null) {
								Static416.method5833(local137.anInt9583, local1094);
							}
							Static201.method5537(local137);
						}
						if (local137.anInt9603 == -1) {
							Static250.method3999(local137.anInt9646);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean713 = anIntArray172[--anInt2783] == 1;
						Static201.method5537(local137);
						return;
					}
					if (arg0 == 1112) {
						local1145 = aStringArray14[--anInt2792];
						if (!local1145.equals(local137.aString99)) {
							local137.aString99 = local1145;
							Static201.method5537(local137);
						}
						if (local137.anInt9603 == -1) {
							Static448.method6364(local137.anInt9646);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt9568 = anIntArray172[--anInt2783];
						Static201.method5537(local137);
						if (local137.anInt9603 == -1) {
							Static80.method7706(local137.anInt9646);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt2783 -= 3;
						local137.anInt9636 = anIntArray172[anInt2783];
						local137.anInt9585 = anIntArray172[anInt2783 + 1];
						local137.anInt9635 = anIntArray172[anInt2783 + 2];
						Static201.method5537(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean698 = anIntArray172[--anInt2783] == 1;
						Static201.method5537(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt9619 = anIntArray172[--anInt2783];
						Static201.method5537(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt9637 = anIntArray172[--anInt2783];
						Static201.method5537(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean703 = anIntArray172[--anInt2783] == 1;
						Static201.method5537(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean705 = anIntArray172[--anInt2783] == 1;
						Static201.method5537(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt2783 -= 2;
						local137.anInt9594 = anIntArray172[anInt2783];
						local137.anInt9599 = anIntArray172[anInt2783 + 1];
						Static201.method5537(local137);
						if (local137.anInt9595 == 0) {
							Static26.method716(local137, false);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean699 = anIntArray172[--anInt2783] == 1;
						Static201.method5537(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt9608 = anIntArray172[--anInt2783];
						Static201.method5537(local137);
						if (local137.anInt9603 == -1) {
							Static119.method2028(local137.anInt9646);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray172[--anInt2783];
						local137.aBoolean709 = local19 == 1;
						Static201.method5537(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt2783 -= 2;
						local137.anInt9569 = anIntArray172[anInt2783];
						local137.anInt9613 = anIntArray172[anInt2783 + 1];
						Static201.method5537(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt9652 = anIntArray172[--anInt2783];
						Static201.method5537(local137);
						return;
					}
					@Pc(1473) Class105 local1473;
					if (arg0 == 1127) {
						anInt2783 -= 2;
						local19 = anIntArray172[anInt2783];
						local25 = anIntArray172[anInt2783 + 1];
						local1473 = Static88.aClass183_1.method4071(local19);
						if (local25 != local1473.anInt2858) {
							local137.method7914(local19, local25);
							return;
						}
						local137.method7913(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray172[--anInt2783];
						local1507 = aStringArray14[--anInt2792];
						local1473 = Static88.aClass183_1.method4071(local19);
						if (!local1473.aString29.equals(local1507)) {
							local137.method7903(local1507, local19);
							return;
						}
						local137.method7913(local19);
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static374.method5437(anIntArray172[--anInt2783]);
					} else {
						local137 = arg1 ? aClass365_5 : aClass365_6;
					}
					Static201.method5537(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt2783 -= 2;
						local19 = anIntArray172[anInt2783];
						local25 = anIntArray172[anInt2783 + 1];
						if (local137.anInt9603 == -1) {
							Static134.method7868(local137.anInt9646);
							Static119.method2028(local137.anInt9646);
							Static560.method7544(local137.anInt9646);
						}
						if (local19 == -1) {
							local137.anInt9576 = 1;
							local137.anInt9620 = -1;
							local137.anInt9573 = -1;
							return;
						}
						local137.anInt9573 = local19;
						local137.anInt9575 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean707 = true;
						} else {
							local137.aBoolean707 = false;
						}
						@Pc(1649) Class322 local1649 = Static46.aClass234_1.method5390(local19);
						local137.anInt9660 = local1649.anInt8582;
						local137.anInt9612 = local1649.anInt8619;
						local137.anInt9622 = local1649.anInt8594;
						local137.anInt9623 = local1649.anInt8644;
						local137.anInt9651 = local1649.anInt8628;
						local137.anInt9608 = local1649.anInt8587;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt9632 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt9632 = 1;
						} else {
							local137.anInt9632 = 2;
						}
						if (local137.anInt9615 > 0) {
							local137.anInt9608 = local137.anInt9608 * 32 / local137.anInt9615;
							return;
						}
						if (local137.anInt9627 > 0) {
							local137.anInt9608 = local137.anInt9608 * 32 / local137.anInt9627;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt9576 = 2;
						local137.anInt9620 = anIntArray172[--anInt2783];
						if (local137.anInt9603 == -1) {
							Static71.method1509(local137.anInt9646);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt9576 = 3;
						local137.anInt9620 = -1;
						if (local137.anInt9603 == -1) {
							Static71.method1509(local137.anInt9646);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt9576 = 6;
						local137.anInt9620 = anIntArray172[--anInt2783];
						if (local137.anInt9603 == -1) {
							Static71.method1509(local137.anInt9646);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt9576 = 5;
						local137.anInt9620 = anIntArray172[--anInt2783];
						if (local137.anInt9603 == -1) {
							Static71.method1509(local137.anInt9646);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt2783 -= 4;
						local137.anInt9647 = anIntArray172[anInt2783];
						local137.anInt9654 = anIntArray172[anInt2783 + 1];
						local137.anInt9616 = anIntArray172[anInt2783 + 2];
						local137.anInt9584 = anIntArray172[anInt2783 + 3];
						Static201.method5537(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt2783 -= 2;
						local137.anInt9642 = anIntArray172[anInt2783];
						local137.anInt9618 = anIntArray172[anInt2783 + 1];
						Static201.method5537(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt2783 -= 4;
						local137.anInt9620 = anIntArray172[anInt2783];
						local137.anInt9572 = anIntArray172[anInt2783 + 1];
						if (anIntArray172[anInt2783 + 2] == 1) {
							local137.anInt9576 = 9;
						} else {
							local137.anInt9576 = 8;
						}
						if (anIntArray172[anInt2783 + 3] == 1) {
							local137.aBoolean707 = true;
						} else {
							local137.aBoolean707 = false;
						}
						if (local137.anInt9603 == -1) {
							Static71.method1509(local137.anInt9646);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt9576 = 5;
						local137.anInt9620 = Static594.anInt9653;
						local137.anInt9572 = 0;
						if (local137.anInt9603 == -1) {
							Static71.method1509(local137.anInt9646);
						}
						return;
					}
				} else {
					@Pc(2309) int local2309;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static374.method5437(anIntArray172[--anInt2783]);
						} else {
							local137 = arg1 ? aClass365_5 : aClass365_6;
						}
						if (arg0 == 1300) {
							local19 = anIntArray172[--anInt2783] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method7916(aStringArray14[--anInt2792], local19);
								return;
							}
							anInt2792--;
							return;
						}
						if (arg0 == 1301) {
							anInt2783 -= 2;
							local19 = anIntArray172[anInt2783];
							local25 = anIntArray172[anInt2783 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass365_17 = null;
								return;
							}
							local137.aClass365_17 = Static583.method7803(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray172[--anInt2783];
							if (local19 != Static120.anInt2410 && local19 != Static271.anInt5043 && local19 != Static338.anInt6015) {
								return;
							}
							local137.anInt9648 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt9610 = anIntArray172[--anInt2783];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt9631 = anIntArray172[--anInt2783];
							return;
						}
						if (arg0 == 1305) {
							local137.aString98 = aStringArray14[--anInt2792];
							return;
						}
						if (arg0 == 1306) {
							local137.aString97 = aStringArray14[--anInt2792];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray42 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt9624 = anIntArray172[--anInt2783];
							local137.anInt9605 = anIntArray172[--anInt2783];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray172[--anInt2783];
							local25 = anIntArray172[--anInt2783];
							if (local25 >= 1 && local25 <= 10) {
								local137.method7920(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString95 = aStringArray14[--anInt2792];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt9591 = anIntArray172[--anInt2783];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt2783 -= 3;
								local19 = anIntArray172[anInt2783] - 1;
								local25 = anIntArray172[anInt2783 + 1];
								local353 = anIntArray172[anInt2783 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt2783 -= 2;
								local19 = 10;
								local25 = anIntArray172[anInt2783];
								local353 = anIntArray172[anInt2783 + 1];
							}
							if (local137.aByteArray104 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray104 = new byte[11];
								local137.aByteArray105 = new byte[11];
								local137.lb = new int[11];
							}
							local137.aByteArray104[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean704 = false;
								for (local2309 = 0; local2309 < local137.aByteArray104.length; local2309++) {
									if (local137.aByteArray104[local2309] != 0) {
										local137.aBoolean704 = true;
										break;
									}
								}
							} else {
								local137.aBoolean704 = true;
							}
							local137.aByteArray105[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt9579 = anIntArray172[--anInt2783];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static374.method5437(anIntArray172[--anInt2783]);
						} else {
							local137 = arg1 ? aClass365_5 : aClass365_6;
						}
						if (arg0 == 1499) {
							local137.method7917();
							return;
						}
						local1145 = aStringArray14[--anInt2792];
						@Pc(2395) int[] local2395 = null;
						if (local1145.length() > 0 && local1145.charAt(local1145.length() - 1) == 'Y') {
							local353 = anIntArray172[--anInt2783];
							if (local353 > 0) {
								local2395 = new int[local353];
								while (local353-- > 0) {
									local2395[local353] = anIntArray172[--anInt2783];
								}
							}
							local1145 = local1145.substring(0, local1145.length() - 1);
						}
						@Pc(2447) Object[] local2447 = new Object[local1145.length() + 1];
						for (local2309 = local2447.length - 1; local2309 >= 1; local2309--) {
							if (local1145.charAt(local2309 - 1) == 's') {
								local2447[local2309] = aStringArray14[--anInt2792];
							} else {
								local2447[local2309] = Integer.valueOf(anIntArray172[--anInt2783]);
							}
						}
						local56 = anIntArray172[--anInt2783];
						if (local56 == -1) {
							local2447 = null;
						} else {
							local2447[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray25 = local2447;
						} else if (arg0 == 1401) {
							local137.anObjectArray21 = local2447;
						} else if (arg0 == 1402) {
							local137.anObjectArray5 = local2447;
						} else if (arg0 == 1403) {
							local137.anObjectArray7 = local2447;
						} else if (arg0 == 1404) {
							local137.anObjectArray20 = local2447;
						} else if (arg0 == 1405) {
							local137.anObjectArray27 = local2447;
						} else if (arg0 == 1406) {
							local137.anObjectArray19 = local2447;
						} else if (arg0 == 1407) {
							local137.anObjectArray12 = local2447;
							local137.anIntArray634 = local2395;
						} else if (arg0 == 1408) {
							local137.anObjectArray9 = local2447;
						} else if (arg0 == 1409) {
							local137.anObjectArray15 = local2447;
						} else if (arg0 == 1410) {
							local137.anObjectArray4 = local2447;
						} else if (arg0 == 1411) {
							local137.anObjectArray28 = local2447;
						} else if (arg0 == 1412) {
							local137.anObjectArray31 = local2447;
						} else if (arg0 == 1414) {
							local137.anObjectArray32 = local2447;
							local137.anIntArray638 = local2395;
						} else if (arg0 == 1415) {
							local137.anObjectArray22 = local2447;
							local137.anIntArray642 = local2395;
						} else if (arg0 == 1416) {
							local137.anObjectArray3 = local2447;
						} else if (arg0 == 1417) {
							local137.anObjectArray13 = local2447;
						} else if (arg0 == 1418) {
							local137.anObjectArray29 = local2447;
						} else if (arg0 == 1419) {
							local137.anObjectArray16 = local2447;
						} else if (arg0 == 1420) {
							local137.anObjectArray24 = local2447;
						} else if (arg0 == 1421) {
							local137.anObjectArray14 = local2447;
						} else if (arg0 == 1422) {
							local137.anObjectArray26 = local2447;
						} else if (arg0 == 1423) {
							local137.anObjectArray33 = local2447;
						} else if (arg0 == 1424) {
							local137.anObjectArray11 = local2447;
						} else if (arg0 == 1425) {
							local137.anObjectArray30 = local2447;
						} else if (arg0 == 1426) {
							local137.anObjectArray6 = local2447;
						} else if (arg0 == 1427) {
							local137.anObjectArray8 = local2447;
						} else if (arg0 == 1428) {
							local137.anObjectArray10 = local2447;
							local137.anIntArray636 = local2395;
						} else if (arg0 == 1429) {
							local137.anObjectArray23 = local2447;
							local137.anIntArray641 = local2395;
						} else if (arg0 == 1430) {
							local137.anObjectArray18 = local2447;
						}
						local137.aBoolean706 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass365_5 : aClass365_6;
						if (arg0 == 1500) {
							anIntArray172[anInt2783++] = local137.anInt9581;
							return;
						}
						if (arg0 == 1501) {
							anIntArray172[anInt2783++] = local137.anInt9625;
							return;
						}
						if (arg0 == 1502) {
							anIntArray172[anInt2783++] = local137.anInt9578;
							return;
						}
						if (arg0 == 1503) {
							anIntArray172[anInt2783++] = local137.anInt9638;
							return;
						}
						if (arg0 == 1504) {
							anIntArray172[anInt2783++] = local137.aBoolean711 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray172[anInt2783++] = local137.anInt9590;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static498.method6955(local137);
							anIntArray172[anInt2783++] = local158 == null ? -1 : local158.anInt9646;
							return;
						}
					} else {
						@Pc(3043) Class105 local3043;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass365_5 : aClass365_6;
							if (arg0 == 1600) {
								anIntArray172[anInt2783++] = local137.anInt9571;
								return;
							}
							if (arg0 == 1601) {
								anIntArray172[anInt2783++] = local137.anInt9617;
								return;
							}
							if (arg0 == 1602) {
								aStringArray14[anInt2792++] = local137.aString99;
								return;
							}
							if (arg0 == 1603) {
								anIntArray172[anInt2783++] = local137.anInt9594;
								return;
							}
							if (arg0 == 1604) {
								anIntArray172[anInt2783++] = local137.anInt9599;
								return;
							}
							if (arg0 == 1605) {
								anIntArray172[anInt2783++] = local137.anInt9608;
								return;
							}
							if (arg0 == 1606) {
								anIntArray172[anInt2783++] = local137.anInt9660;
								return;
							}
							if (arg0 == 1607) {
								anIntArray172[anInt2783++] = local137.anInt9622;
								return;
							}
							if (arg0 == 1608) {
								anIntArray172[anInt2783++] = local137.anInt9612;
								return;
							}
							if (arg0 == 1609) {
								anIntArray172[anInt2783++] = local137.anInt9601;
								return;
							}
							if (arg0 == 1610) {
								anIntArray172[anInt2783++] = local137.anInt9623;
								return;
							}
							if (arg0 == 1611) {
								anIntArray172[anInt2783++] = local137.anInt9651;
								return;
							}
							if (arg0 == 1612) {
								anIntArray172[anInt2783++] = local137.anInt9602;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray172[--anInt2783];
								local3043 = Static88.aClass183_1.method4071(local19);
								if (local3043.method2400()) {
									aStringArray14[anInt2792++] = local137.method7907(local19, local3043.aString29);
									return;
								}
								anIntArray172[anInt2783++] = local137.method7905(local19, local3043.anInt2858);
								return;
							}
							if (arg0 == 1614) {
								anIntArray172[anInt2783++] = local137.anInt9606;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass365_5 : aClass365_6;
							if (arg0 == 1700) {
								anIntArray172[anInt2783++] = local137.anInt9573;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt9573 != -1) {
									anIntArray172[anInt2783++] = local137.anInt9575;
									return;
								}
								anIntArray172[anInt2783++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray172[anInt2783++] = local137.anInt9603;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass365_5 : aClass365_6;
							if (arg0 == 1800) {
								anIntArray172[anInt2783++] = Static72.method1565(local137).method4818();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray172[--anInt2783];
								local19--;
								if (local137.aStringArray42 != null && local19 < local137.aStringArray42.length && local137.aStringArray42[local19] != null) {
									aStringArray14[anInt2792++] = local137.aStringArray42[local19];
									return;
								}
								aStringArray14[anInt2792++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString98 == null) {
									aStringArray14[anInt2792++] = "";
									return;
								}
								aStringArray14[anInt2792++] = local137.aString98;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static374.method5437(anIntArray172[--anInt2783]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass365_5 : aClass365_6;
							}
							if (anInt2795 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray8 == null) {
									return;
								}
								@Pc(3293) Class1_Sub2 local3293 = new Class1_Sub2();
								local3293.aClass365_1 = local137;
								local3293.anObjectArray1 = local137.anObjectArray8;
								local3293.anInt152 = anInt2795 + 1;
								Static215.aClass361_44.method7855(local3293);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static374.method5437(anIntArray172[--anInt2783]);
							if (arg0 == 2500) {
								anIntArray172[anInt2783++] = local137.anInt9581;
								return;
							}
							if (arg0 == 2501) {
								anIntArray172[anInt2783++] = local137.anInt9625;
								return;
							}
							if (arg0 == 2502) {
								anIntArray172[anInt2783++] = local137.anInt9578;
								return;
							}
							if (arg0 == 2503) {
								anIntArray172[anInt2783++] = local137.anInt9638;
								return;
							}
							if (arg0 == 2504) {
								anIntArray172[anInt2783++] = local137.aBoolean711 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray172[anInt2783++] = local137.anInt9590;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static498.method6955(local137);
								anIntArray172[anInt2783++] = local158 == null ? -1 : local158.anInt9646;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static374.method5437(anIntArray172[--anInt2783]);
							if (arg0 == 2600) {
								anIntArray172[anInt2783++] = local137.anInt9571;
								return;
							}
							if (arg0 == 2601) {
								anIntArray172[anInt2783++] = local137.anInt9617;
								return;
							}
							if (arg0 == 2602) {
								aStringArray14[anInt2792++] = local137.aString99;
								return;
							}
							if (arg0 == 2603) {
								anIntArray172[anInt2783++] = local137.anInt9594;
								return;
							}
							if (arg0 == 2604) {
								anIntArray172[anInt2783++] = local137.anInt9599;
								return;
							}
							if (arg0 == 2605) {
								anIntArray172[anInt2783++] = local137.anInt9608;
								return;
							}
							if (arg0 == 2606) {
								anIntArray172[anInt2783++] = local137.anInt9660;
								return;
							}
							if (arg0 == 2607) {
								anIntArray172[anInt2783++] = local137.anInt9622;
								return;
							}
							if (arg0 == 2608) {
								anIntArray172[anInt2783++] = local137.anInt9612;
								return;
							}
							if (arg0 == 2609) {
								anIntArray172[anInt2783++] = local137.anInt9601;
								return;
							}
							if (arg0 == 2610) {
								anIntArray172[anInt2783++] = local137.anInt9623;
								return;
							}
							if (arg0 == 2611) {
								anIntArray172[anInt2783++] = local137.anInt9651;
								return;
							}
							if (arg0 == 2612) {
								anIntArray172[anInt2783++] = local137.anInt9602;
								return;
							}
							if (arg0 == 2613) {
								anIntArray172[anInt2783++] = local137.anInt9606;
								return;
							}
						} else {
							@Pc(3803) Class1_Sub16 local3803;
							@Pc(3701) Class1_Sub16 local3701;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static374.method5437(anIntArray172[--anInt2783]);
									anIntArray172[anInt2783++] = local137.anInt9573;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static374.method5437(anIntArray172[--anInt2783]);
									if (local137.anInt9573 != -1) {
										anIntArray172[anInt2783++] = local137.anInt9575;
										return;
									}
									anIntArray172[anInt2783++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray172[--anInt2783];
									local3701 = (Class1_Sub16) Static68.aClass356_4.method7796((long) local13);
									if (local3701 != null) {
										anIntArray172[anInt2783++] = 1;
										return;
									}
									anIntArray172[anInt2783++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static374.method5437(anIntArray172[--anInt2783]);
									if (local137.aClass365Array2 == null) {
										anIntArray172[anInt2783++] = 0;
										return;
									}
									local19 = local137.aClass365Array2.length;
									for (local25 = 0; local25 < local137.aClass365Array2.length; local25++) {
										if (local137.aClass365Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray172[anInt2783++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt2783 -= 2;
									local13 = anIntArray172[anInt2783];
									local19 = anIntArray172[anInt2783 + 1];
									local3803 = (Class1_Sub16) Static68.aClass356_4.method7796((long) local13);
									if (local3803 != null && local3803.anInt2681 == local19) {
										anIntArray172[anInt2783++] = 1;
										return;
									}
									anIntArray172[anInt2783++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static374.method5437(anIntArray172[--anInt2783]);
								if (arg0 == 2800) {
									anIntArray172[anInt2783++] = Static72.method1565(local137).method4818();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray172[--anInt2783];
									local19--;
									if (local137.aStringArray42 != null && local19 < local137.aStringArray42.length && local137.aStringArray42[local19] != null) {
										aStringArray14[anInt2792++] = local137.aStringArray42[local19];
										return;
									}
									aStringArray14[anInt2792++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString98 == null) {
										aStringArray14[anInt2792++] = "";
										return;
									}
									aStringArray14[anInt2792++] = local137.aString98;
									return;
								}
							} else {
								@Pc(3940) String local3940;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3940 = aStringArray14[--anInt2792];
										Static105.method1877(local3940);
										return;
									}
									if (arg0 == 3101) {
										anInt2783 -= 2;
										Static308.method4742(anIntArray172[anInt2783 + 1], anIntArray172[anInt2783], Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2);
										return;
									}
									if (arg0 == 3103) {
										Static430.method6013();
										return;
									}
									if (arg0 == 3104) {
										local3940 = aStringArray14[--anInt2792];
										local19 = 0;
										if (Static88.method1743(local3940)) {
											local19 = Static480.method6741(local3940);
										}
										@Pc(4000) Class1_Sub48 local4000 = Static320.method4867(Static442.aClass170_2, Static80.aClass319_167);
										local4000.aClass1_Sub20_Sub1_2.method4421(local19);
										Static34.method813(local4000);
										return;
									}
									@Pc(4029) Class1_Sub48 local4029;
									if (arg0 == 3105) {
										local3940 = aStringArray14[--anInt2792];
										local4029 = Static320.method4867(Static442.aClass170_2, Static522.aClass319_153);
										local4029.aClass1_Sub20_Sub1_2.method4378(local3940.length() + 1);
										local4029.aClass1_Sub20_Sub1_2.method4399(local3940);
										Static34.method813(local4029);
										return;
									}
									if (arg0 == 3106) {
										local3940 = aStringArray14[--anInt2792];
										local4029 = Static320.method4867(Static442.aClass170_2, Static216.aClass319_75);
										local4029.aClass1_Sub20_Sub1_2.method4378(local3940.length() + 1);
										local4029.aClass1_Sub20_Sub1_2.method4399(local3940);
										Static34.method813(local4029);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray172[--anInt2783];
										local1145 = aStringArray14[--anInt2792];
										Static482.method6705(local13, local1145);
										return;
									}
									if (arg0 == 3108) {
										anInt2783 -= 3;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										local25 = anIntArray172[anInt2783 + 2];
										local35 = Static374.method5437(local25);
										Static58.method1365(local19, local35, local13);
										return;
									}
									if (arg0 == 3109) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										local210 = arg1 ? aClass365_5 : aClass365_6;
										Static58.method1365(local19, local210, local13);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray172[--anInt2783];
										local4029 = Static320.method4867(Static442.aClass170_2, Static23.aClass319_117);
										local4029.aClass1_Sub20_Sub1_2.method4381(local13);
										Static34.method813(local4029);
										return;
									}
									if (arg0 == 3111) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										local3803 = (Class1_Sub16) Static68.aClass356_4.method7796((long) local13);
										if (local3803 != null) {
											Static546.method7412(local3803, local3803.anInt2681 != local19, true);
										}
										Static578.method7768(true, 3, local13, local19);
										return;
									}
									if (arg0 == 3112) {
										anInt2783--;
										local13 = anIntArray172[anInt2783];
										local3701 = (Class1_Sub16) Static68.aClass356_4.method7796((long) local13);
										if (local3701 != null && local3701.anInt2683 == 3) {
											Static546.method7412(local3701, true, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static324.method4898(aStringArray14[--anInt2792]);
										return;
									}
									if (arg0 == 3114) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										local1507 = aStringArray14[--anInt2792];
										Static114.method1983("", "", "", local19, local1507, local13);
										return;
									}
									if (arg0 == 3115) {
										anInt2783 -= 11;
										@Pc(4330) Class314[] local4330 = Static303.method7887();
										@Pc(4333) Class103[] local4333 = Static208.method7270();
										Static264.method4171(anIntArray172[anInt2783 + 2], anIntArray172[anInt2783 + 9], anIntArray172[anInt2783 + 8], local4330[anIntArray172[anInt2783]], anIntArray172[anInt2783 + 7], anIntArray172[anInt2783 + 10], anIntArray172[anInt2783 + 3], anIntArray172[anInt2783 + 4], anIntArray172[anInt2783 + 5], anIntArray172[anInt2783 + 6], local4333[anIntArray172[anInt2783 + 1]]);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt2783 -= 3;
										Static364.method5314(anIntArray172[anInt2783 + 1], anIntArray172[anInt2783], 255, anIntArray172[anInt2783 + 2]);
										return;
									}
									if (arg0 == 3201) {
										Static363.method6685(50, anIntArray172[--anInt2783], 255);
										return;
									}
									if (arg0 == 3202) {
										anInt2783 -= 2;
										Static464.method6584(anIntArray172[anInt2783], anIntArray172[anInt2783 + 1], 255);
										return;
									}
									if (arg0 == 3203) {
										anInt2783 -= 4;
										Static364.method5314(anIntArray172[anInt2783 + 1], anIntArray172[anInt2783], anIntArray172[anInt2783 + 3], anIntArray172[anInt2783 + 2]);
										return;
									}
									if (arg0 == 3204) {
										anInt2783 -= 3;
										Static363.method6685(anIntArray172[anInt2783 + 2], anIntArray172[anInt2783], anIntArray172[anInt2783 + 1]);
										return;
									}
									if (arg0 == 3205) {
										anInt2783 -= 3;
										Static464.method6584(anIntArray172[anInt2783], anIntArray172[anInt2783 + 1], anIntArray172[anInt2783 + 2]);
										return;
									}
									if (arg0 == 3206) {
										anInt2783 -= 4;
										Static291.method4575(anIntArray172[anInt2783], anIntArray172[anInt2783 + 2], anIntArray172[anInt2783 + 1], anIntArray172[anInt2783 + 3], false);
										return;
									}
									if (arg0 == 3207) {
										anInt2783 -= 4;
										Static291.method4575(anIntArray172[anInt2783], anIntArray172[anInt2783 + 2], anIntArray172[anInt2783 + 1], anIntArray172[anInt2783 + 3], true);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray172[anInt2783++] = Static81.anInt1910;
										return;
									}
									if (arg0 == 3301) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = Static332.method4986(local19, local13, false);
										return;
									}
									if (arg0 == 3302) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = Static14.method464(false, local19, local13);
										return;
									}
									if (arg0 == 3303) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = Static521.method7119(local13, false, local19);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Static413.aClass76_1.method1861(local13).anInt7066;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Static128.anIntArray158[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Static374.anIntArray442[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Static118.anIntArray145[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4787) byte local4787 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aByte116;
										local19 = (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8796 >> 9) + Static376.anInt6631;
										local25 = (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8795 >> 9) + Static24.anInt674;
										anIntArray172[anInt2783++] = (local4787 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray172[anInt2783++] = Static33.aBoolean76 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = Static332.method4986(local19, local13, true);
										return;
									}
									if (arg0 == 3314) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = Static14.method464(true, local19, local13);
										return;
									}
									if (arg0 == 3315) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = Static521.method7119(local13, true, local19);
										return;
									}
									if (arg0 == 3316) {
										if (Static276.anInt5092 >= 2) {
											anIntArray172[anInt2783++] = Static276.anInt5092;
											return;
										}
										anIntArray172[anInt2783++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray172[anInt2783++] = Static562.anInt9131;
										return;
									}
									if (arg0 == 3318) {
										anIntArray172[anInt2783++] = Static137.aClass174_1.anInt4666;
										return;
									}
									if (arg0 == 3321) {
										anIntArray172[anInt2783++] = Static227.anInt4362;
										return;
									}
									if (arg0 == 3322) {
										anIntArray172[anInt2783++] = Static296.anInt5477;
										return;
									}
									if (arg0 == 3323) {
										if (Static323.anInt5789 >= 5 && Static323.anInt5789 <= 9) {
											anIntArray172[anInt2783++] = 1;
											return;
										}
										anIntArray172[anInt2783++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static323.anInt5789 >= 5 && Static323.anInt5789 <= 9) {
											anIntArray172[anInt2783++] = Static323.anInt5789;
											return;
										}
										anIntArray172[anInt2783++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray172[anInt2783++] = Static40.aBoolean452 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray172[anInt2783++] = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt4922;
										return;
									}
									if (arg0 == 3327) {
										anIntArray172[anInt2783++] = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aClass34_1.aBoolean90 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray172[anInt2783++] = Static329.aBoolean427 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Static511.method7030(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = Static273.method4260(false, local19, local13);
										return;
									}
									if (arg0 == 3332) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = Static273.method4260(true, local19, local13);
										return;
									}
									if (arg0 == 3333) {
										anIntArray172[anInt2783++] = Static326.anInt5840;
										return;
									}
									if (arg0 == 3335) {
										anIntArray172[anInt2783++] = Static562.anInt9127;
										return;
									}
									if (arg0 == 3336) {
										anInt2783 -= 4;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										local25 = anIntArray172[anInt2783 + 2];
										local353 = anIntArray172[anInt2783 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray172[anInt2783++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray172[anInt2783++] = Static208.anInt8805;
										return;
									}
									if (arg0 == 3338) {
										anIntArray172[anInt2783++] = Static76.method1621();
										return;
									}
									if (arg0 == 3339) {
										anIntArray172[anInt2783++] = Static579.aBoolean690 ? 1 : 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray172[anInt2783++] = Static81.aBoolean154 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray172[anInt2783++] = Static360.aBoolean447 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray172[anInt2783++] = Static287.aClass256_8.method7558();
										return;
									}
									if (arg0 == 3343) {
										anIntArray172[anInt2783++] = Static287.aClass256_8.method7561();
										return;
									}
									if (arg0 == 3344) {
										aStringArray14[anInt2792++] = Static317.method4819();
										return;
									}
									if (arg0 == 3345) {
										aStringArray14[anInt2792++] = Static589.method7858();
										return;
									}
									if (arg0 == 3346) {
										anIntArray172[anInt2783++] = Static53.method1246();
										return;
									}
									if (arg0 == 3347) {
										anIntArray172[anInt2783++] = Static573.anInt9326;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5522) Class129 local5522;
									if (arg0 == 3400) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										local5522 = Static327.aClass266_1.method6014(local13);
										aStringArray14[anInt2792++] = local5522.method3227(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt2783 -= 4;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										local25 = anIntArray172[anInt2783 + 2];
										local353 = anIntArray172[anInt2783 + 3];
										@Pc(5568) Class129 local5568 = Static327.aClass266_1.method6014(local25);
										if (local5568.aChar3 == local13 && local5568.aChar2 == local19) {
											if (local19 == 115) {
												aStringArray14[anInt2792++] = local5568.method3227(local353);
												return;
											}
											anIntArray172[anInt2783++] = local5568.method3219(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt2783 -= 3;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										local25 = anIntArray172[anInt2783 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5644) Class129 local5644 = Static327.aClass266_1.method6014(local19);
										if (local5644.aChar2 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray172[anInt2783++] = local5644.method3221(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray172[--anInt2783];
										local1145 = aStringArray14[--anInt2792];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5522 = Static327.aClass266_1.method6014(local13);
										if (local5522.aChar2 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray172[anInt2783++] = local5522.method3220(local1145) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray172[--anInt2783];
										@Pc(5742) Class129 local5742 = Static327.aClass266_1.method6014(local13);
										anIntArray172[anInt2783++] = local5742.aClass356_12.method7799();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static454.anInt7768 == 0) {
											anIntArray172[anInt2783++] = -2;
											return;
										}
										if (Static454.anInt7768 == 1) {
											anIntArray172[anInt2783++] = -1;
											return;
										}
										anIntArray172[anInt2783++] = Static184.anInt5417;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray172[--anInt2783];
										if (Static454.anInt7768 == 2 && local13 < Static184.anInt5417) {
											aStringArray14[anInt2792++] = Static333.aStringArray26[local13];
											if (Static498.aStringArray34[local13] != null) {
												aStringArray14[anInt2792++] = Static498.aStringArray34[local13];
												return;
											}
											aStringArray14[anInt2792++] = "";
											return;
										}
										aStringArray14[anInt2792++] = "";
										aStringArray14[anInt2792++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray172[--anInt2783];
										if (Static454.anInt7768 == 2 && local13 < Static184.anInt5417) {
											anIntArray172[anInt2783++] = Static476.anIntArray532[local13];
											return;
										}
										anIntArray172[anInt2783++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray172[--anInt2783];
										if (Static454.anInt7768 == 2 && local13 < Static184.anInt5417) {
											anIntArray172[anInt2783++] = Static298.anIntArray349[local13];
											return;
										}
										anIntArray172[anInt2783++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3940 = aStringArray14[--anInt2792];
										local19 = anIntArray172[--anInt2783];
										Static296.method4675(local19, local3940);
										return;
									}
									if (arg0 == 3605) {
										local3940 = aStringArray14[--anInt2792];
										Static282.method4330(local3940);
										return;
									}
									if (arg0 == 3606) {
										local3940 = aStringArray14[--anInt2792];
										Static583.method7790(local3940);
										return;
									}
									if (arg0 == 3607) {
										local3940 = aStringArray14[--anInt2792];
										Static325.method7830(local3940, false);
										return;
									}
									if (arg0 == 3608) {
										local3940 = aStringArray14[--anInt2792];
										Static61.method1401(local3940);
										return;
									}
									if (arg0 == 3609) {
										local3940 = aStringArray14[--anInt2792];
										if (local3940.startsWith("<img=0>") || local3940.startsWith("<img=1>")) {
											local3940 = local3940.substring(7);
										}
										anIntArray172[anInt2783++] = Static535.method7306(local3940) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray172[--anInt2783];
										if (Static454.anInt7768 == 2 && local13 < Static184.anInt5417) {
											aStringArray14[anInt2792++] = Static38.aStringArray4[local13];
											return;
										}
										aStringArray14[anInt2792++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static382.aString69 != null) {
											aStringArray14[anInt2792++] = Static276.method4282(Static382.aString69);
											return;
										}
										aStringArray14[anInt2792++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static382.aString69 != null) {
											anIntArray172[anInt2783++] = Static280.anInt5146;
											return;
										}
										anIntArray172[anInt2783++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray172[--anInt2783];
										if (Static382.aString69 != null && local13 < Static280.anInt5146) {
											aStringArray14[anInt2792++] = Static254.aClass69Array1[local13].aString20;
											return;
										}
										aStringArray14[anInt2792++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray172[--anInt2783];
										if (Static382.aString69 != null && local13 < Static280.anInt5146) {
											anIntArray172[anInt2783++] = Static254.aClass69Array1[local13].anInt2011;
											return;
										}
										anIntArray172[anInt2783++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray172[--anInt2783];
										if (Static382.aString69 != null && local13 < Static280.anInt5146) {
											anIntArray172[anInt2783++] = Static254.aClass69Array1[local13].aByte32;
											return;
										}
										anIntArray172[anInt2783++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray172[anInt2783++] = Static143.aByte40;
										return;
									}
									if (arg0 == 3617) {
										local3940 = aStringArray14[--anInt2792];
										Static483.method6765(local3940);
										return;
									}
									if (arg0 == 3618) {
										anIntArray172[anInt2783++] = Static151.aByte41;
										return;
									}
									if (arg0 == 3619) {
										local3940 = aStringArray14[--anInt2792];
										Static468.method6608(local3940);
										return;
									}
									if (arg0 == 3620) {
										Static88.method1742();
										return;
									}
									if (arg0 == 3621) {
										if (Static454.anInt7768 == 0) {
											anIntArray172[anInt2783++] = -1;
											return;
										}
										anIntArray172[anInt2783++] = Static54.anInt1399;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray172[--anInt2783];
										if (Static454.anInt7768 != 0 && local13 < Static54.anInt1399) {
											aStringArray14[anInt2792++] = Static568.aStringArray40[local13];
											if (Static279.aStringArray22[local13] != null) {
												aStringArray14[anInt2792++] = Static279.aStringArray22[local13];
												return;
											}
											aStringArray14[anInt2792++] = "";
											return;
										}
										aStringArray14[anInt2792++] = "";
										aStringArray14[anInt2792++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3940 = aStringArray14[--anInt2792];
										if (local3940.startsWith("<img=0>") || local3940.startsWith("<img=1>")) {
											local3940 = local3940.substring(7);
										}
										anIntArray172[anInt2783++] = Static560.method7545(local3940) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray172[--anInt2783];
										if (Static254.aClass69Array1 != null && local13 < Static280.anInt5146 && Static254.aClass69Array1[local13].aString21.equalsIgnoreCase(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aString49)) {
											anIntArray172[anInt2783++] = 1;
											return;
										}
										anIntArray172[anInt2783++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static112.aString25 != null) {
											aStringArray14[anInt2792++] = Static112.aString25;
											return;
										}
										aStringArray14[anInt2792++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray172[--anInt2783];
										if (Static382.aString69 != null && local13 < Static280.anInt5146) {
											aStringArray14[anInt2792++] = Static254.aClass69Array1[local13].aString23;
											return;
										}
										aStringArray14[anInt2792++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray172[--anInt2783];
										if (Static454.anInt7768 == 2 && local13 >= 0 && local13 < Static184.anInt5417) {
											anIntArray172[anInt2783++] = Static138.aBooleanArray3[local13] ? 1 : 0;
											return;
										}
										anIntArray172[anInt2783++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3940 = aStringArray14[--anInt2792];
										if (local3940.startsWith("<img=0>") || local3940.startsWith("<img=1>")) {
											local3940 = local3940.substring(7);
										}
										anIntArray172[anInt2783++] = Static348.method5143(local3940);
										return;
									}
									if (arg0 == 3629) {
										anIntArray172[anInt2783++] = Static481.anInt8127;
										return;
									}
									if (arg0 == 3630) {
										local3940 = aStringArray14[--anInt2792];
										Static325.method7830(local3940, true);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Static363.aBooleanArray24[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray172[--anInt2783];
										if (Static382.aString69 != null && local13 < Static280.anInt5146) {
											aStringArray14[anInt2792++] = Static254.aClass69Array1[local13].aString21;
											return;
										}
										aStringArray14[anInt2792++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray172[--anInt2783];
										if (Static454.anInt7768 != 0 && local13 < Static54.anInt1399) {
											aStringArray14[anInt2792++] = Static316.aStringArray25[local13];
											return;
										}
										aStringArray14[anInt2792++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Static101.aClass51Array1[local13].method1450();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Static101.aClass51Array1[local13].anInt1588;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Static101.aClass51Array1[local13].anInt1593;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Static101.aClass51Array1[local13].anInt1587;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Static101.aClass51Array1[local13].anInt1592;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Static101.aClass51Array1[local13].anInt1598;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray172[--anInt2783];
										local19 = Static101.aClass51Array1[local13].method1448();
										anIntArray172[anInt2783++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray172[--anInt2783];
										local19 = Static101.aClass51Array1[local13].method1448();
										anIntArray172[anInt2783++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray172[--anInt2783];
										local19 = Static101.aClass51Array1[local13].method1448();
										anIntArray172[anInt2783++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray172[--anInt2783];
										local19 = Static101.aClass51Array1[local13].method1448();
										anIntArray172[anInt2783++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt2783 -= 5;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										local25 = anIntArray172[anInt2783 + 2];
										local353 = anIntArray172[anInt2783 + 3];
										local2309 = anIntArray172[anInt2783 + 4];
										anIntArray172[anInt2783++] = local13 + (local19 - local13) * (local2309 - local25) / (local353 - local25);
										return;
									}
									@Pc(7252) long local7252;
									@Pc(7245) long local7245;
									if (arg0 == 4007) {
										anInt2783 -= 2;
										local7245 = anIntArray172[anInt2783];
										local7252 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = (int) (local7245 + local7245 * local7252 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										if (local13 == 0) {
											anIntArray172[anInt2783++] = 0;
											return;
										}
										anIntArray172[anInt2783++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										if (local13 == 0) {
											anIntArray172[anInt2783++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray172[anInt2783++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray172[anInt2783++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt2783 -= 3;
										local7245 = anIntArray172[anInt2783];
										local7252 = anIntArray172[anInt2783 + 1];
										@Pc(7633) long local7633 = (long) anIntArray172[anInt2783 + 2];
										anIntArray172[anInt2783++] = (int) (local7245 * local7633 / local7252);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3940 = aStringArray14[--anInt2792];
										local19 = anIntArray172[--anInt2783];
										aStringArray14[anInt2792++] = local3940 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt2792 -= 2;
										local3940 = aStringArray14[anInt2792];
										local1145 = aStringArray14[anInt2792 + 1];
										aStringArray14[anInt2792++] = local3940 + local1145;
										return;
									}
									if (arg0 == 4102) {
										local3940 = aStringArray14[--anInt2792];
										local19 = anIntArray172[--anInt2783];
										aStringArray14[anInt2792++] = local3940 + Static324.method4895(local19);
										return;
									}
									if (arg0 == 4103) {
										local3940 = aStringArray14[--anInt2792];
										aStringArray14[anInt2792++] = local3940.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray14[anInt2792++] = method2348(anIntArray172[--anInt2783]);
										return;
									}
									if (arg0 == 4105) {
										anInt2792 -= 2;
										local3940 = aStringArray14[anInt2792];
										local1145 = aStringArray14[anInt2792 + 1];
										if (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aClass34_1 != null && Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aClass34_1.aBoolean90) {
											aStringArray14[anInt2792++] = local1145;
											return;
										}
										aStringArray14[anInt2792++] = local3940;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray172[--anInt2783];
										aStringArray14[anInt2792++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt2792 -= 2;
										anIntArray172[anInt2783++] = Static276.method4277(Static562.anInt9127, aStringArray14[anInt2792 + 1], aStringArray14[anInt2792]);
										return;
									}
									@Pc(7916) Class13 local7916;
									if (arg0 == 4108) {
										local3940 = aStringArray14[--anInt2792];
										anInt2783 -= 2;
										local19 = anIntArray172[anInt2783];
										local25 = anIntArray172[anInt2783 + 1];
										local7916 = Static584.method7820(local25, Static530.aClass111_114);
										anIntArray172[anInt2783++] = local7916.method456(Static39.aClass10Array5, local3940, local19);
										return;
									}
									if (arg0 == 4109) {
										local3940 = aStringArray14[--anInt2792];
										anInt2783 -= 2;
										local19 = anIntArray172[anInt2783];
										local25 = anIntArray172[anInt2783 + 1];
										local7916 = Static584.method7820(local25, Static530.aClass111_114);
										anIntArray172[anInt2783++] = local7916.method466(Static39.aClass10Array5, local19, local3940);
										return;
									}
									if (arg0 == 4110) {
										anInt2792 -= 2;
										local3940 = aStringArray14[anInt2792];
										local1145 = aStringArray14[anInt2792 + 1];
										if (anIntArray172[--anInt2783] == 1) {
											aStringArray14[anInt2792++] = local3940;
											return;
										}
										aStringArray14[anInt2792++] = local1145;
										return;
									}
									if (arg0 == 4111) {
										local3940 = aStringArray14[--anInt2792];
										aStringArray14[anInt2792++] = Static193.method3394(local3940);
										return;
									}
									if (arg0 == 4112) {
										local3940 = aStringArray14[--anInt2792];
										local19 = anIntArray172[--anInt2783];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray14[anInt2792++] = local3940 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Static449.method6370((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Static215.method3560((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Static117.method2019((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Static569.method7665((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3940 = aStringArray14[--anInt2792];
										if (local3940 != null) {
											anIntArray172[anInt2783++] = local3940.length();
											return;
										}
										anIntArray172[anInt2783++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3940 = aStringArray14[--anInt2792];
										anInt2783 -= 2;
										local19 = anIntArray172[anInt2783];
										local25 = anIntArray172[anInt2783 + 1];
										aStringArray14[anInt2792++] = local3940.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3940 = aStringArray14[--anInt2792];
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
										aStringArray14[anInt2792++] = local8279.toString();
										return;
									}
									if (arg0 == 4120) {
										local3940 = aStringArray14[--anInt2792];
										anInt2783 -= 2;
										local19 = anIntArray172[anInt2783];
										local25 = anIntArray172[anInt2783 + 1];
										anIntArray172[anInt2783++] = local3940.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt2792 -= 2;
										local3940 = aStringArray14[anInt2792];
										local1145 = aStringArray14[anInt2792 + 1];
										local25 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = local3940.indexOf(local1145, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray172[--anInt2783] != 0;
										local19 = anIntArray172[--anInt2783];
										aStringArray14[anInt2792++] = Static429.method6006((long) local19, Static562.anInt9127, local412, 0);
										return;
									}
									if (arg0 == 4125) {
										local3940 = aStringArray14[--anInt2792];
										local19 = anIntArray172[--anInt2783];
										@Pc(8502) Class13 local8502 = Static584.method7820(local19, Static530.aClass111_114);
										anIntArray172[anInt2783++] = local8502.method465(Static39.aClass10Array5, local3940);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray172[--anInt2783];
										aStringArray14[anInt2792++] = Static46.aClass234_1.method5390(local13).aString89;
										return;
									}
									@Pc(8564) Class322 local8564;
									if (arg0 == 4201) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										local8564 = Static46.aClass234_1.method5390(local13);
										if (local19 >= 1 && local19 <= 5 && local8564.aStringArray37[local19 - 1] != null) {
											aStringArray14[anInt2792++] = local8564.aStringArray37[local19 - 1];
											return;
										}
										aStringArray14[anInt2792++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										local8564 = Static46.aClass234_1.method5390(local13);
										if (local19 >= 1 && local19 <= 5 && local8564.aStringArray38[local19 - 1] != null) {
											aStringArray14[anInt2792++] = local8564.aStringArray38[local19 - 1];
											return;
										}
										aStringArray14[anInt2792++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Static46.aClass234_1.method5390(local13).anInt8618;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Static46.aClass234_1.method5390(local13).anInt8612 == 1 ? 1 : 0;
										return;
									}
									@Pc(8727) Class322 local8727;
									if (arg0 == 4205) {
										local13 = anIntArray172[--anInt2783];
										local8727 = Static46.aClass234_1.method5390(local13);
										if (local8727.anInt8591 == -1 && local8727.anInt8637 >= 0) {
											anIntArray172[anInt2783++] = local8727.anInt8637;
											return;
										}
										anIntArray172[anInt2783++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray172[--anInt2783];
										local8727 = Static46.aClass234_1.method5390(local13);
										if (local8727.anInt8591 >= 0 && local8727.anInt8637 >= 0) {
											anIntArray172[anInt2783++] = local8727.anInt8637;
											return;
										}
										anIntArray172[anInt2783++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Static46.aClass234_1.method5390(local13).aBoolean630 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										local3043 = Static88.aClass183_1.method4071(local19);
										if (local3043.method2400()) {
											aStringArray14[anInt2792++] = Static46.aClass234_1.method5390(local13).method7122(local19, local3043.aString29);
											return;
										}
										anIntArray172[anInt2783++] = Static46.aClass234_1.method5390(local13).method7109(local19, local3043.anInt2858);
										return;
									}
									if (arg0 == 4209) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1] - 1;
										local8564 = Static46.aClass234_1.method5390(local13);
										if (local8564.anInt8588 == local19) {
											anIntArray172[anInt2783++] = local8564.anInt8596;
											return;
										}
										if (local8564.anInt8610 == local19) {
											anIntArray172[anInt2783++] = local8564.anInt8593;
											return;
										}
										anIntArray172[anInt2783++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3940 = aStringArray14[--anInt2792];
										local19 = anIntArray172[--anInt2783];
										Static506.method7003(local3940, local19 == 1);
										anIntArray172[anInt2783++] = Static238.anInt9537;
										return;
									}
									if (arg0 == 4211) {
										if (Static410.aShortArray79 != null && Static370.anInt6548 < Static238.anInt9537) {
											anIntArray172[anInt2783++] = Static410.aShortArray79[Static370.anInt6548++] & 0xFFFF;
											return;
										}
										anIntArray172[anInt2783++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static370.anInt6548 = 0;
										return;
									}
									if (arg0 == 4213) {
										local13 = anIntArray172[--anInt2783];
										anIntArray172[anInt2783++] = Static46.aClass234_1.method5390(local13).anInt8621;
										return;
									}
									if (arg0 == 4214) {
										local3940 = aStringArray14[--anInt2792];
										anInt2783 -= 3;
										local19 = anIntArray172[anInt2783];
										local25 = anIntArray172[anInt2783 + 1];
										local353 = anIntArray172[anInt2783 + 2];
										Static308.method4741(local25, local3940, local19 == 1, local353);
										anIntArray172[anInt2783++] = Static238.anInt9537;
										return;
									}
									if (arg0 == 4215) {
										anInt2792 -= 2;
										anInt2783 -= 2;
										local3940 = aStringArray14[anInt2792];
										local19 = anIntArray172[anInt2783];
										local25 = anIntArray172[anInt2783 + 1];
										@Pc(9126) String local9126 = aStringArray14[anInt2792 + 1];
										Static573.method7718(local9126, local19 == 1, local3940, local25);
										anIntArray172[anInt2783++] = Static238.anInt9537;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										local3043 = Static88.aClass183_1.method4071(local19);
										if (local3043.method2400()) {
											aStringArray14[anInt2792++] = Static183.aClass182_1.method4062(local13).method3801(local19, local3043.aString29);
											return;
										}
										anIntArray172[anInt2783++] = Static183.aClass182_1.method4062(local13).method3799(local19, local3043.anInt2858);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										local3043 = Static88.aClass183_1.method4071(local19);
										if (local3043.method2400()) {
											aStringArray14[anInt2792++] = Static146.aClass214_1.method4897(local13).method6967(local3043.aString29, local19);
											return;
										}
										anIntArray172[anInt2783++] = Static146.aClass214_1.method4897(local13).method6977(local3043.anInt2858, local19);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt2783 -= 2;
										local13 = anIntArray172[anInt2783];
										local19 = anIntArray172[anInt2783 + 1];
										local3043 = Static88.aClass183_1.method4071(local19);
										if (local3043.method2400()) {
											aStringArray14[anInt2792++] = Static545.aClass194_1.method4318(local13).method770(local19, local3043.aString29);
											return;
										}
										anIntArray172[anInt2783++] = Static545.aClass194_1.method4318(local13).method769(local3043.anInt2858, local19);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray172[--anInt2783];
									@Pc(9354) Class138 local9354 = Static161.aClass291_1.method6675(local13);
									if (local9354.anIntArray222 != null && local9354.anIntArray222.length > 0) {
										local25 = 0;
										local353 = local9354.anIntArray223[0];
										for (local2309 = 1; local2309 < local9354.anIntArray222.length; local2309++) {
											if (local9354.anIntArray223[local2309] > local353) {
												local25 = local2309;
												local353 = local9354.anIntArray223[local2309];
											}
										}
										anIntArray172[anInt2783++] = local9354.anIntArray222[local25];
										return;
									}
									anIntArray172[anInt2783++] = local9354.anInt3993;
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

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!ada;I)V")
	private static void method2358(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class1_Sub3_Sub5 local12 = Static501.method6969(local8);
		if (local12 == null) {
			return;
		}
		anIntArray173 = new int[local12.anInt1135];
		@Pc(21) int local21 = 0;
		aStringArray15 = new String[local12.anInt1134];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt157;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt156;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass365_1 == null ? -1 : arg0.aClass365_1.anInt9646;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt154;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass365_1 == null ? -1 : arg0.aClass365_1.anInt9603;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass365_2 == null ? -1 : arg0.aClass365_2.anInt9646;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass365_2 == null ? -1 : arg0.aClass365_2.anInt9603;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt158;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt149;
				}
				anIntArray173[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString6;
				}
				aStringArray15[local27++] = local135;
			}
		}
		anInt2795 = arg0.anInt152;
		method2355(local12, arg1);
	}

	@OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)V")
	private static void method2359(@OriginalArg(0) int arg0) {
		@Pc(3) Class365 local3 = Static374.method5437(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class365[] local13 = Static440.aClass365ArrayArray4[local9];
		if (local13 == null) {
			@Pc(19) Class365[] local19 = Static249.aClass365ArrayArray3[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static440.aClass365ArrayArray4[local9] = new Class365[local22];
			Static600.method3766(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static600.method3766(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!br;II)V")
	public static void method2360(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class1_Sub3_Sub5 local5 = Static357.method5220(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray173 = new int[local5.anInt1135];
		aStringArray15 = new String[local5.anInt1134];
		if (local5.aClass37_1 == Static509.aClass37_7 || local5.aClass37_1 == Static314.aClass37_3 || local5.aClass37_1 == Static382.aClass37_5) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static559.aClass365_16 != null) {
				local30 = Static559.aClass365_16.anInt9581;
				local32 = Static559.aClass365_16.anInt9625;
			}
			anIntArray173[0] = Static287.aClass256_8.method7558() - local30;
			anIntArray173[1] = Static287.aClass256_8.method7561() - local32;
		}
		method2355(local5, 200000);
	}
}
