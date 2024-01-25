import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!io", name = "i", descriptor = "Lclient!ec;")
	private static Class68 aClass68_6;

	@OriginalMember(owner = "client!io", name = "j", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray25;

	@OriginalMember(owner = "client!io", name = "m", descriptor = "Lclient!pm;")
	private static Class199 aClass199_1;

	@OriginalMember(owner = "client!io", name = "q", descriptor = "Lclient!ec;")
	private static Class68 aClass68_7;

	@OriginalMember(owner = "client!io", name = "s", descriptor = "[I")
	private static int[] anIntArray372;

	@OriginalMember(owner = "client!io", name = "c", descriptor = "[Lclient!eu;")
	private static final Class80[] aClass80Array1 = new Class80[50];

	@OriginalMember(owner = "client!io", name = "e", descriptor = "[[I")
	private static final int[][] anIntArrayArray34 = new int[5][5000];

	@OriginalMember(owner = "client!io", name = "g", descriptor = "[I")
	private static final int[] anIntArray370 = new int[1000];

	@OriginalMember(owner = "client!io", name = "h", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!io", name = "l", descriptor = "I")
	private static int anInt3870 = 0;

	@OriginalMember(owner = "client!io", name = "p", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray26 = new String[1000];

	@OriginalMember(owner = "client!io", name = "r", descriptor = "[I")
	private static final int[] anIntArray371 = new int[5];

	@OriginalMember(owner = "client!io", name = "v", descriptor = "I")
	private static int anInt3875 = 0;

	@OriginalMember(owner = "client!io", name = "w", descriptor = "I")
	private static int anInt3876 = 0;

	@OriginalMember(owner = "client!io", name = "y", descriptor = "Lclient!fr;")
	public static final Class91 aClass91_52 = new Class91(4);

	@OriginalMember(owner = "client!io", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray27 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!io", name = "B", descriptor = "[I")
	private static final int[] anIntArray373 = new int[3];

	@OriginalMember(owner = "client!io", name = "C", descriptor = "I")
	private static int anInt3879 = 0;

	@OriginalMember(owner = "client!io", name = "a", descriptor = "()V")
	public static void method2997() {
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	public static void method2998(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static414.method5610(arg0)) {
			return;
		}
		@Pc(12) Class68[] local12 = Static293.aClass68ArrayArray4[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class68 local19 = local12[local14];
			if (local19.anObjectArray19 != null) {
				@Pc(26) Class1_Sub10 local26 = new Class1_Sub10();
				local26.aClass68_3 = local19;
				local26.anObjectArray2 = local19.anObjectArray19;
				method3010(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!gn;I)V")
	private static void method2999(@OriginalArg(0) Class1_Sub1_Sub9 arg0, @OriginalArg(1) int arg1) {
		anInt3876 = 0;
		anInt3875 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray313;
		@Pc(11) int[] local11 = arg0.anIntArray314;
		@Pc(13) byte local13 = -1;
		anInt3870 = 0;
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
						method3007(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method3005(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray370[anInt3876++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray370[anInt3876++] = Static366.aClass190_1.anIntArray520[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static366.aClass190_1.method4309(anIntArray370[--anInt3876], local54);
					} else if (local31 == 3) {
						aStringArray26[anInt3875++] = arg0.aStringArray22[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt3876 -= 2;
						if (anIntArray370[anInt3876] != anIntArray370[anInt3876 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt3876 -= 2;
						if (anIntArray370[anInt3876] == anIntArray370[anInt3876 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt3876 -= 2;
						if (anIntArray370[anInt3876] < anIntArray370[anInt3876 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt3876 -= 2;
						if (anIntArray370[anInt3876] > anIntArray370[anInt3876 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt3870 == 0) {
							return;
						}
						@Pc(216) Class80 local216 = aClass80Array1[--anInt3870];
						arg0 = local216.aClass1_Sub1_Sub9_1;
						local8 = arg0.anIntArray313;
						local11 = arg0.anIntArray314;
						local5 = local216.anInt2427;
						anIntArray372 = local216.anIntArray268;
						aStringArray25 = local216.aStringArray16;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray370[anInt3876++] = Static366.aClass190_1.method4299(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static366.aClass190_1.method4302(anIntArray370[--anInt3876], local54);
					} else if (local31 == 31) {
						anInt3876 -= 2;
						if (anIntArray370[anInt3876] <= anIntArray370[anInt3876 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt3876 -= 2;
						if (anIntArray370[anInt3876] >= anIntArray370[anInt3876 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray370[anInt3876++] = anIntArray372[local11[local5]];
					} else if (local31 == 34) {
						anIntArray372[local11[local5]] = anIntArray370[--anInt3876];
					} else if (local31 == 35) {
						aStringArray26[anInt3875++] = aStringArray25[local11[local5]];
					} else if (local31 == 36) {
						aStringArray25[local11[local5]] = aStringArray26[--anInt3875];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt3875 -= local54;
						@Pc(400) String local400 = Static278.method4107(anInt3875, aStringArray26, local54);
						aStringArray26[anInt3875++] = local400;
					} else if (local31 == 38) {
						anInt3876--;
					} else if (local31 == 39) {
						anInt3875--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class1_Sub1_Sub9 local436 = Static34.method719(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt3041];
							@Pc(450) String[] local450 = new String[local436.anInt3040];
							for (local452 = 0; local452 < local436.anInt3042; local452++) {
								local446[local452] = anIntArray370[anInt3876 + local452 - local436.anInt3042];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt3043; local471++) {
								local450[local471] = aStringArray26[anInt3875 + local471 - local436.anInt3043];
							}
							anInt3876 -= local436.anInt3042;
							anInt3875 -= local436.anInt3043;
							@Pc(502) Class80 local502 = new Class80();
							local502.aClass1_Sub1_Sub9_1 = arg0;
							local502.anInt2427 = local5;
							local502.anIntArray268 = anIntArray372;
							local502.aStringArray16 = aStringArray25;
							if (anInt3870 >= aClass80Array1.length) {
								throw new RuntimeException();
							}
							aClass80Array1[anInt3870++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray313;
							local11 = local436.anIntArray314;
							local5 = -1;
							anIntArray372 = local446;
							aStringArray25 = local450;
						} else if (local31 == 42) {
							anIntArray370[anInt3876++] = Static31.anIntArray221[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static31.anIntArray221[local54] = anIntArray370[--anInt3876];
							Static360.method5074(local54);
							Static334.aBoolean390 |= Static398.aBooleanArray23[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray370[--anInt3876];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray371[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray34[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray370[--anInt3876];
							if (local603 < 0 || local603 >= anIntArray371[local54]) {
								throw new RuntimeException();
							}
							anIntArray370[anInt3876++] = anIntArrayArray34[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt3876 -= 2;
							local603 = anIntArray370[anInt3876];
							if (local603 < 0 || local603 >= anIntArray371[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray34[local54][local603] = anIntArray370[anInt3876 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static255.aStringArray34[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray26[anInt3875++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static255.aStringArray34[local54] = aStringArray26[--anInt3875];
							Static77.method1421(local54);
						} else if (local31 == 51) {
							@Pc(774) Class38 local774 = arg0.aClass38Array1[local11[local5]];
							@Pc(787) Class1_Sub33 local787 = (Class1_Sub33) local774.method765((long) anIntArray370[--anInt3876]);
							if (local787 != null) {
								local5 += local787.anInt5633;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString26 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong228).append(" ");
				for (local603 = anInt3870 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass80Array1[local603].aClass1_Sub1_Sub9_1.aLong228).append(" ");
				}
				local855.append("op: ").append(local13);
				Static247.method3669(local855.toString(), local837);
			} else {
				Static192.method3105("Clientscript error in: " + arg0.aString26);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString26).append("\n");
				for (local603 = anInt3870 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass80Array1[local603].aClass1_Sub1_Sub9_1.aString26).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static247.method3669(local855.toString(), local837);
				Static336.method4727(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!ci;)V")
	public static void method3000(@OriginalArg(0) Class1_Sub10 arg0) {
		method3010(arg0, 200000);
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(I)Ljava/lang/String;")
	private static String method3001(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray27[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(I)V")
	private static void method3002(@OriginalArg(0) int arg0) {
		@Pc(3) Class68 local3 = Static300.method4351(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class68[] local13 = Static181.aClass68ArrayArray3[local9];
		if (local13 == null) {
			@Pc(19) Class68[] local19 = Static293.aClass68ArrayArray4[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static181.aClass68ArrayArray3[local9] = new Class68[local22];
			Static469.method6019(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static469.method6019(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IZ)V")
	public static void method3003() {
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!dw;II)V")
	public static void method3004(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class1_Sub1_Sub9 local5 = Static101.method1723(arg1, arg0, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray372 = new int[local5.anInt3041];
		aStringArray25 = new String[local5.anInt3040];
		if (local5.aClass65_4 == Static400.aClass65_11 || local5.aClass65_4 == Static386.aClass65_9 || local5.aClass65_4 == Static271.aClass65_7) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static98.aClass68_5 != null) {
				local30 = Static98.aClass68_5.anInt2170;
				local32 = Static98.aClass68_5.anInt2175;
			}
			anIntArray372[0] = Static336.aClass87_1.method1919() - local30;
			anIntArray372[1] = Static336.aClass87_1.method1909() - local32;
		}
		method2999(local5, 200000);
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(IZ)V")
	private static void method3005(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray370[anInt3876++] = Static425.anInt3428;
				return;
			}
			if (arg0 == 5001) {
				anInt3876 -= 3;
				Static425.anInt3428 = anIntArray370[anInt3876];
				Static392.aClass37_4 = Static200.method3203(anIntArray370[anInt3876 + 1]);
				if (Static392.aClass37_4 == null) {
					Static392.aClass37_4 = Static358.aClass37_3;
				}
				Static420.anInt4325 = anIntArray370[anInt3876 + 2];
				Static32.method677(Static7.aClass177_1);
				Static433.aClass1_Sub3_Sub1_11.method1208(Static425.anInt3428);
				Static433.aClass1_Sub3_Sub1_11.method1208(Static392.aClass37_4.anInt1012);
				Static433.aClass1_Sub3_Sub1_11.method1208(Static420.anInt4325);
				return;
			}
			if (arg0 == 5002) {
				anInt3875 -= 2;
				local75 = aStringArray26[anInt3875];
				local81 = aStringArray26[anInt3875 + 1];
				anInt3876 -= 2;
				local89 = anIntArray370[anInt3876];
				local95 = anIntArray370[anInt3876 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static32.method677(Static37.aClass177_16);
				Static433.aClass1_Sub3_Sub1_11.method1208(Static146.method2347(local75) + Static146.method2347(local81) + 2);
				Static433.aClass1_Sub3_Sub1_11.method1190(local75);
				Static433.aClass1_Sub3_Sub1_11.method1208(local89 - 1);
				Static433.aClass1_Sub3_Sub1_11.method1208(local95);
				Static433.aClass1_Sub3_Sub1_11.method1190(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray370[--anInt3876];
				local81 = null;
				if (local157 < 100) {
					local81 = Static119.aStringArray21[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray26[anInt3875++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray370[--anInt3876];
				local192 = -1;
				if (local157 < 100 && Static119.aStringArray21[local157] != null) {
					local192 = Static180.anIntArray377[local157];
				}
				anIntArray370[anInt3876++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static392.aClass37_4 == null) {
					anIntArray370[anInt3876++] = -1;
					return;
				}
				anIntArray370[anInt3876++] = Static392.aClass37_4.anInt1012;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray26[--anInt3875];
				method3008(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt3875 -= 2;
				local75 = aStringArray26[anInt3875];
				local81 = aStringArray26[anInt3875 + 1];
				if (Static41.anInt1052 != 0 || (!Static400.aBoolean463 || Static223.aBoolean279) && !Static11.aBoolean7) {
					Static32.method677(Static101.aClass177_33);
					Static433.aClass1_Sub3_Sub1_11.method1208(0);
					local89 = Static433.aClass1_Sub3_Sub1_11.anInt1710;
					Static433.aClass1_Sub3_Sub1_11.method1190(local75);
					Static143.method2293(local81, Static433.aClass1_Sub3_Sub1_11);
					Static433.aClass1_Sub3_Sub1_11.method1185(Static433.aClass1_Sub3_Sub1_11.anInt1710 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray370[--anInt3876];
				local81 = null;
				if (local157 < 100) {
					local81 = Static27.aStringArray5[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray26[anInt3875++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray370[--anInt3876];
				local81 = null;
				if (local157 < 100) {
					local81 = Static410.aStringArray43[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray26[anInt3875++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray370[--anInt3876];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static210.anIntArray408[local157];
				}
				anIntArray370[anInt3876++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static429.aClass30_Sub1_Sub1_Sub2_2 == null || Static429.aClass30_Sub1_Sub1_Sub2_2.aString8 == null) {
					local75 = Static92.aString19;
				} else {
					local75 = Static429.aClass30_Sub1_Sub1_Sub2_2.method962();
				}
				aStringArray26[anInt3875++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray370[anInt3876++] = Static420.anInt4325;
				return;
			}
			if (arg0 == 5017) {
				anIntArray370[anInt3876++] = Static414.anInt7372;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray370[--anInt3876];
				local192 = 0;
				if (local157 < 100 && Static119.aStringArray21[local157] != null) {
					local192 = Static295.anIntArray516[local157];
				}
				anIntArray370[anInt3876++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray370[--anInt3876];
				local81 = null;
				if (local157 < 100) {
					local81 = Static432.aStringArray45[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray26[anInt3875++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static429.aClass30_Sub1_Sub1_Sub2_2 == null || Static429.aClass30_Sub1_Sub1_Sub2_2.aString8 == null) {
					local75 = Static92.aString19;
				} else {
					local75 = Static429.aClass30_Sub1_Sub1_Sub2_2.method965();
				}
				aStringArray26[anInt3875++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray370[--anInt3876];
				aStringArray26[anInt3875++] = Static157.aClass79_1.method1757(local157).aString13;
				return;
			}
			@Pc(589) Class1_Sub1_Sub5 local589;
			if (arg0 == 5051) {
				local157 = anIntArray370[--anInt3876];
				local589 = Static157.aClass79_1.method1757(local157);
				if (local589.anIntArray144 == null) {
					anIntArray370[anInt3876++] = 0;
					return;
				}
				anIntArray370[anInt3876++] = local589.anIntArray144.length;
				return;
			}
			if (arg0 == 5052) {
				anInt3876 -= 2;
				local157 = anIntArray370[anInt3876];
				local192 = anIntArray370[anInt3876 + 1];
				@Pc(634) Class1_Sub1_Sub5 local634 = Static157.aClass79_1.method1757(local157);
				local95 = local634.anIntArray144[local192];
				anIntArray370[anInt3876++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray370[--anInt3876];
				local589 = Static157.aClass79_1.method1757(local157);
				if (local589.anIntArray143 == null) {
					anIntArray370[anInt3876++] = 0;
					return;
				}
				anIntArray370[anInt3876++] = local589.anIntArray143.length;
				return;
			}
			if (arg0 == 5054) {
				anInt3876 -= 2;
				local157 = anIntArray370[anInt3876];
				local192 = anIntArray370[anInt3876 + 1];
				anIntArray370[anInt3876++] = Static157.aClass79_1.method1757(local157).anIntArray143[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray370[--anInt3876];
				aStringArray26[anInt3875++] = Static439.aClass127_2.method3086(local157).method4837();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray370[--anInt3876];
				@Pc(760) Class1_Sub1_Sub13 local760 = Static439.aClass127_2.method3086(local157);
				if (local760.anIntArray590 == null) {
					anIntArray370[anInt3876++] = 0;
					return;
				}
				anIntArray370[anInt3876++] = local760.anIntArray590.length;
				return;
			}
			if (arg0 == 5057) {
				anInt3876 -= 2;
				local157 = anIntArray370[anInt3876];
				local192 = anIntArray370[anInt3876 + 1];
				anIntArray370[anInt3876++] = Static439.aClass127_2.method3086(local157).anIntArray590[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass199_1 = new Class199();
				aClass199_1.anInt5845 = anIntArray370[--anInt3876];
				aClass199_1.aClass1_Sub1_Sub13_1 = Static439.aClass127_2.method3086(aClass199_1.anInt5845);
				aClass199_1.anIntArray546 = new int[aClass199_1.aClass1_Sub1_Sub13_1.method4829()];
				return;
			}
			if (arg0 == 5059) {
				Static32.method677(Static225.aClass177_61);
				Static433.aClass1_Sub3_Sub1_11.method1208(0);
				local157 = Static433.aClass1_Sub3_Sub1_11.anInt1710;
				Static433.aClass1_Sub3_Sub1_11.method1208(0);
				Static433.aClass1_Sub3_Sub1_11.method1227(aClass199_1.anInt5845);
				aClass199_1.aClass1_Sub1_Sub13_1.method4840(Static433.aClass1_Sub3_Sub1_11, aClass199_1.anIntArray546);
				Static433.aClass1_Sub3_Sub1_11.method1185(Static433.aClass1_Sub3_Sub1_11.anInt1710 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray26[--anInt3875];
				Static32.method677(Static25.aClass177_8);
				Static433.aClass1_Sub3_Sub1_11.method1208(0);
				local192 = Static433.aClass1_Sub3_Sub1_11.anInt1710;
				Static433.aClass1_Sub3_Sub1_11.method1190(local75);
				Static433.aClass1_Sub3_Sub1_11.method1227(aClass199_1.anInt5845);
				aClass199_1.aClass1_Sub1_Sub13_1.method4840(Static433.aClass1_Sub3_Sub1_11, aClass199_1.anIntArray546);
				Static433.aClass1_Sub3_Sub1_11.method1185(Static433.aClass1_Sub3_Sub1_11.anInt1710 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static32.method677(Static225.aClass177_61);
				Static433.aClass1_Sub3_Sub1_11.method1208(0);
				local157 = Static433.aClass1_Sub3_Sub1_11.anInt1710;
				Static433.aClass1_Sub3_Sub1_11.method1208(1);
				Static433.aClass1_Sub3_Sub1_11.method1227(aClass199_1.anInt5845);
				aClass199_1.aClass1_Sub1_Sub13_1.method4840(Static433.aClass1_Sub3_Sub1_11, aClass199_1.anIntArray546);
				Static433.aClass1_Sub3_Sub1_11.method1185(Static433.aClass1_Sub3_Sub1_11.anInt1710 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt3876 -= 2;
				local157 = anIntArray370[anInt3876];
				local192 = anIntArray370[anInt3876 + 1];
				anIntArray370[anInt3876++] = Static157.aClass79_1.method1757(local157).aCharArray3[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt3876 -= 2;
				local157 = anIntArray370[anInt3876];
				local192 = anIntArray370[anInt3876 + 1];
				anIntArray370[anInt3876++] = Static157.aClass79_1.method1757(local157).aCharArray2[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt3876 -= 2;
				local157 = anIntArray370[anInt3876];
				local192 = anIntArray370[anInt3876 + 1];
				if (local192 == -1) {
					anIntArray370[anInt3876++] = -1;
					return;
				}
				anIntArray370[anInt3876++] = Static157.aClass79_1.method1757(local157).method1150((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt3876 -= 2;
				local157 = anIntArray370[anInt3876];
				local192 = anIntArray370[anInt3876 + 1];
				if (local192 == -1) {
					anIntArray370[anInt3876++] = -1;
					return;
				}
				anIntArray370[anInt3876++] = Static157.aClass79_1.method1757(local157).method1149((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray370[--anInt3876];
				anIntArray370[anInt3876++] = Static439.aClass127_2.method3086(local157).method4829();
				return;
			}
			if (arg0 == 5067) {
				anInt3876 -= 2;
				local157 = anIntArray370[anInt3876];
				local192 = anIntArray370[anInt3876 + 1];
				local89 = Static439.aClass127_2.method3086(local157).method4830(local192).anInt6586;
				anIntArray370[anInt3876++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt3876 -= 2;
				local157 = anIntArray370[anInt3876];
				local192 = anIntArray370[anInt3876 + 1];
				aClass199_1.anIntArray546[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt3876 -= 2;
				local157 = anIntArray370[anInt3876];
				local192 = anIntArray370[anInt3876 + 1];
				aClass199_1.anIntArray546[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt3876 -= 3;
				local157 = anIntArray370[anInt3876];
				local192 = anIntArray370[anInt3876 + 1];
				local89 = anIntArray370[anInt3876 + 2];
				@Pc(1265) Class1_Sub1_Sub13 local1265 = Static439.aClass127_2.method3086(local157);
				if (local1265.method4830(local192).anInt6586 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray370[anInt3876++] = local1265.method4831(local89, local192);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray26[--anInt3875];
				local1313 = anIntArray370[--anInt3876] == 1;
				Static325.method4625(local1313, local75);
				anIntArray370[anInt3876++] = Static343.anInt6320;
				return;
			}
			if (arg0 == 5072) {
				if (Static314.aShortArray100 != null && Static230.anInt4555 < Static343.anInt6320) {
					anIntArray370[anInt3876++] = Static314.aShortArray100[Static230.anInt4555++] & 0xFFFF;
					return;
				}
				anIntArray370[anInt3876++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static230.anInt4555 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static32.method677(Static225.aClass177_61);
				Static433.aClass1_Sub3_Sub1_11.method1208(0);
				local157 = Static433.aClass1_Sub3_Sub1_11.anInt1710;
				Static433.aClass1_Sub3_Sub1_11.method1208(2);
				Static433.aClass1_Sub3_Sub1_11.method1227(aClass199_1.anInt5845);
				aClass199_1.aClass1_Sub1_Sub13_1.method4840(Static433.aClass1_Sub3_Sub1_11, aClass199_1.anIntArray546);
				Static433.aClass1_Sub3_Sub1_11.method1185(Static433.aClass1_Sub3_Sub1_11.anInt1710 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static414.aClass48_1.method1119(86)) {
					anIntArray370[anInt3876++] = 1;
					return;
				}
				anIntArray370[anInt3876++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static414.aClass48_1.method1119(82)) {
					anIntArray370[anInt3876++] = 1;
					return;
				}
				anIntArray370[anInt3876++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static414.aClass48_1.method1119(81)) {
					anIntArray370[anInt3876++] = 1;
					return;
				}
				anIntArray370[anInt3876++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static247.method3667(anIntArray370[--anInt3876]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray370[anInt3876++] = Static232.method3534();
					return;
				}
				if (arg0 == 5205) {
					Static229.method3507(anIntArray370[--anInt3876], -1, -1, false);
					return;
				}
				@Pc(1554) Class1_Sub1_Sub17 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray370[--anInt3876];
					local1554 = Static377.method3854(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray370[anInt3876++] = -1;
						return;
					}
					anIntArray370[anInt3876++] = local1554.anInt7427;
					return;
				}
				@Pc(1587) Class1_Sub1_Sub17 local1587;
				if (arg0 == 5207) {
					local1587 = Static377.method3852(anIntArray370[--anInt3876]);
					if (local1587 != null && local1587.aString64 != null) {
						aStringArray26[anInt3875++] = local1587.aString64;
						return;
					}
					aStringArray26[anInt3875++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray370[anInt3876++] = Static54.anInt1417;
					anIntArray370[anInt3876++] = Static223.anInt4456;
					return;
				}
				if (arg0 == 5209) {
					anIntArray370[anInt3876++] = Static226.anInt4474 + Static377.anInt5040;
					anIntArray370[anInt3876++] = Static125.anInt2774 + Static377.anInt5030;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray370[--anInt3876];
					local1554 = Static377.method3852(local157);
					if (local1554 == null) {
						anIntArray370[anInt3876++] = 0;
						anIntArray370[anInt3876++] = 0;
						return;
					}
					anIntArray370[anInt3876++] = local1554.anInt7426 >> 14 & 0x3FFF;
					anIntArray370[anInt3876++] = local1554.anInt7426 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray370[--anInt3876];
					local1554 = Static377.method3852(local157);
					if (local1554 == null) {
						anIntArray370[anInt3876++] = 0;
						anIntArray370[anInt3876++] = 0;
						return;
					}
					anIntArray370[anInt3876++] = local1554.anInt7418 - local1554.anInt7417;
					anIntArray370[anInt3876++] = local1554.anInt7424 - local1554.anInt7420;
					return;
				}
				@Pc(1777) Class1_Sub28 local1777;
				if (arg0 == 5212) {
					local1777 = Static355.method5037();
					if (local1777 == null) {
						anIntArray370[anInt3876++] = -1;
						anIntArray370[anInt3876++] = -1;
						return;
					}
					anIntArray370[anInt3876++] = local1777.anInt4940;
					local192 = local1777.anInt4937 << 28 | local1777.anInt4938 + Static377.anInt5040 << 14 | local1777.anInt4936 + Static377.anInt5030;
					anIntArray370[anInt3876++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static138.method1912();
					if (local1777 == null) {
						anIntArray370[anInt3876++] = -1;
						anIntArray370[anInt3876++] = -1;
						return;
					}
					anIntArray370[anInt3876++] = local1777.anInt4940;
					local192 = local1777.anInt4937 << 28 | local1777.anInt4938 + Static377.anInt5040 << 14 | local1777.anInt4936 + Static377.anInt5030;
					anIntArray370[anInt3876++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray370[--anInt3876];
					local1554 = Static278.method4104();
					if (local1554 != null) {
						local1925 = local1554.method5649(local157 >> 28 & 0x3, anIntArray373, local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
						if (local1925) {
							Static364.method5098(anIntArray373[2], anIntArray373[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt3876 -= 2;
					local157 = anIntArray370[anInt3876];
					local192 = anIntArray370[anInt3876 + 1];
					@Pc(1963) Class262 local1963 = Static377.method3863(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class1_Sub1_Sub17 local1970 = (Class1_Sub1_Sub17) local1963.method5882(); local1970 != null; local1970 = (Class1_Sub1_Sub17) local1963.method5879()) {
						if (local1970.anInt7427 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray370[anInt3876++] = 1;
						return;
					}
					anIntArray370[anInt3876++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray370[--anInt3876];
					local1554 = Static377.method3852(local157);
					if (local1554 == null) {
						anIntArray370[anInt3876++] = -1;
						return;
					}
					anIntArray370[anInt3876++] = local1554.anInt7422;
					return;
				}
				if (arg0 == 5220) {
					anIntArray370[anInt3876++] = Static2.anInt48 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray370[--anInt3876];
					Static364.method5098(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static278.method4104();
					if (local1587 != null) {
						local1313 = local1587.method5647(Static125.anInt2774 + Static377.anInt5030, Static226.anInt4474 + Static377.anInt5040, anIntArray373);
						if (local1313) {
							anIntArray370[anInt3876++] = anIntArray373[1];
							anIntArray370[anInt3876++] = anIntArray373[2];
							return;
						}
						anIntArray370[anInt3876++] = -1;
						anIntArray370[anInt3876++] = -1;
						return;
					}
					anIntArray370[anInt3876++] = -1;
					anIntArray370[anInt3876++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt3876 -= 2;
					local157 = anIntArray370[anInt3876];
					local192 = anIntArray370[anInt3876 + 1];
					Static229.method3507(local157, local192 >> 14 & 0x3FFF, local192 & 0x3FFF, false);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray370[--anInt3876];
					local1554 = Static278.method4104();
					if (local1554 != null) {
						local1925 = local1554.method5649(local157 >> 28 & 0x3, anIntArray373, local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
						if (local1925) {
							anIntArray370[anInt3876++] = anIntArray373[1];
							anIntArray370[anInt3876++] = anIntArray373[2];
							return;
						}
						anIntArray370[anInt3876++] = -1;
						anIntArray370[anInt3876++] = -1;
						return;
					}
					anIntArray370[anInt3876++] = -1;
					anIntArray370[anInt3876++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray370[--anInt3876];
					local1554 = Static278.method4104();
					if (local1554 != null) {
						local1925 = local1554.method5647(local157 & 0x3FFF, local157 >> 14 & 0x3FFF, anIntArray373);
						if (local1925) {
							anIntArray370[anInt3876++] = anIntArray373[1];
							anIntArray370[anInt3876++] = anIntArray373[2];
							return;
						}
						anIntArray370[anInt3876++] = -1;
						anIntArray370[anInt3876++] = -1;
						return;
					}
					anIntArray370[anInt3876++] = -1;
					anIntArray370[anInt3876++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static334.method4722(anIntArray370[--anInt3876]);
					return;
				}
				if (arg0 == 5227) {
					anInt3876 -= 2;
					local157 = anIntArray370[anInt3876];
					local192 = anIntArray370[anInt3876 + 1];
					Static229.method3507(local157, local192 >> 14 & 0x3FFF, local192 & 0x3FFF, true);
					return;
				}
				if (arg0 == 5228) {
					Static19.aBoolean18 = anIntArray370[--anInt3876] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray370[anInt3876++] = Static19.aBoolean18 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray370[--anInt3876];
					Static214.method5445(local157);
					return;
				}
				@Pc(2483) Class1 local2483;
				if (arg0 == 5231) {
					anInt3876 -= 2;
					local157 = anIntArray370[anInt3876];
					local1313 = anIntArray370[anInt3876 + 1] == 1;
					if (Static55.aClass38_4 != null) {
						local2483 = Static55.aClass38_4.method765((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method6178();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class1();
							Static55.aClass38_4.method766(local2483, (long) local157);
						}
					}
					return;
				}
				@Pc(2525) Class1 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray370[--anInt3876];
					if (Static55.aClass38_4 != null) {
						local2525 = Static55.aClass38_4.method765((long) local157);
						anIntArray370[anInt3876++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray370[anInt3876++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt3876 -= 2;
					local157 = anIntArray370[anInt3876];
					local1313 = anIntArray370[anInt3876 + 1] == 1;
					if (Static128.aClass38_12 != null) {
						local2483 = Static128.aClass38_12.method765((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method6178();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class1();
							Static128.aClass38_12.method766(local2483, (long) local157);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray370[--anInt3876];
					if (Static128.aClass38_12 != null) {
						local2525 = Static128.aClass38_12.method765((long) local157);
						anIntArray370[anInt3876++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray370[anInt3876++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray370[anInt3876++] = Static377.aClass1_Sub1_Sub17_2 == null ? -1 : Static377.aClass1_Sub1_Sub17_2.anInt7427;
					return;
				}
				if (arg0 == 5236) {
					anInt3876 -= 2;
					local157 = anIntArray370[anInt3876];
					local192 = anIntArray370[anInt3876 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static160.method2638(local157, local89, local95);
					if (local2691 < 0) {
						anIntArray370[anInt3876++] = -1;
						return;
					}
					anIntArray370[anInt3876++] = local2691;
					return;
				}
				if (arg0 == 5237) {
					Static378.method5232();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt3876 -= 2;
					local157 = anIntArray370[anInt3876];
					local192 = anIntArray370[anInt3876 + 1];
					Static230.method3513(local192, 3, false, local157);
					anIntArray370[anInt3876++] = Static93.aFrame2 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static93.aFrame2 != null) {
						Static230.method3513(-1, Static12.aClass34_Sub1_1.anInt7174, false, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2775) Class167[] local2775 = Static7.method84();
					anIntArray370[anInt3876++] = local2775.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray370[--anInt3876];
					@Pc(2799) Class167[] local2799 = Static7.method84();
					anIntArray370[anInt3876++] = local2799[local157].anInt4759;
					anIntArray370[anInt3876++] = local2799[local157].anInt4757;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static12.aClass34_Sub1_1.anInt7158;
					local192 = Static12.aClass34_Sub1_1.anInt7164;
					local89 = -1;
					@Pc(2836) Class167[] local2836 = Static7.method84();
					for (local2691 = 0; local2691 < local2836.length; local2691++) {
						@Pc(2843) Class167 local2843 = local2836[local2691];
						if (local2843.anInt4759 == local157 && local2843.anInt4757 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray370[anInt3876++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray370[anInt3876++] = Static86.method1531();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray370[--anInt3876];
					if (local157 >= 1 && local157 <= 2) {
						Static230.method3513(-1, local157, false, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.anInt7174;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray370[--anInt3876];
					if (local157 >= 1 && local157 <= 2) {
						Static12.aClass34_Sub1_1.anInt7174 = local157;
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						return;
					}
					return;
				}
			} else {
				@Pc(3351) String local3351;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt3875 -= 2;
						local75 = aStringArray26[anInt3875];
						local81 = aStringArray26[anInt3875 + 1];
						local89 = anIntArray370[--anInt3876];
						Static32.method677(Static360.aClass177_93);
						Static433.aClass1_Sub3_Sub1_11.method1208(Static146.method2347(local75) + Static146.method2347(local81) + 1);
						Static433.aClass1_Sub3_Sub1_11.method1190(local75);
						Static433.aClass1_Sub3_Sub1_11.method1190(local81);
						Static433.aClass1_Sub3_Sub1_11.method1208(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt3876 -= 2;
						Static430.aShortArray133[anIntArray370[anInt3876]] = (short) Static153.method3989(anIntArray370[anInt3876 + 1]);
						Static43.aClass57_1.method1410();
						Static43.aClass57_1.method1405();
						Static300.aClass44_2.method1002();
						Static179.method3014();
						return;
					}
					if (arg0 == 5405) {
						anInt3876 -= 2;
						local157 = anIntArray370[anInt3876];
						local192 = anIntArray370[anInt3876 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static84.anIntArrayArrayArray2[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt3876 -= 7;
						local157 = anIntArray370[anInt3876];
						local192 = anIntArray370[anInt3876 + 1] << 1;
						local89 = anIntArray370[anInt3876 + 2];
						local95 = anIntArray370[anInt3876 + 3];
						local2691 = anIntArray370[anInt3876 + 4];
						@Pc(3111) int local3111 = anIntArray370[anInt3876 + 5];
						@Pc(3117) int local3117 = anIntArray370[anInt3876 + 6];
						if (local157 >= 0 && local157 < 2 && Static84.anIntArrayArrayArray2[local157] != null && local192 >= 0 && local192 < Static84.anIntArrayArrayArray2[local157].length) {
							Static84.anIntArrayArrayArray2[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3117 };
							Static84.anIntArrayArrayArray2[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3111, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static84.anIntArrayArrayArray2[anIntArray370[--anInt3876]].length >> 1;
						anIntArray370[anInt3876++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static93.aFrame2 != null) {
							Static230.method3513(-1, Static12.aClass34_Sub1_1.anInt7174, false, -1);
						}
						if (Static416.aFrame3 != null) {
							Static208.method3578();
							System.exit(0);
							return;
						}
						local75 = Static160.aString30 == null ? Static102.method1726() : Static160.aString30;
						Static284.method2365(Static262.anInt2805 == 1, local75, Static150.aClass183_3, false);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static228.aClass157_3 != null) {
							if (Static228.aClass157_3.anObject13 == null) {
								local75 = Static63.method1234(Static228.aClass157_3.anInt4669);
							} else {
								local75 = (String) Static228.aClass157_3.anObject13;
							}
						}
						aStringArray26[anInt3875++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray370[anInt3876++] = Static282.anInt5394 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static93.aFrame2 != null) {
							Static230.method3513(-1, Static12.aClass34_Sub1_1.anInt7174, false, -1);
						}
						local75 = aStringArray26[--anInt3875];
						local1313 = anIntArray370[--anInt3876] == 1;
						local3351 = Static102.method1726() + local75;
						Static284.method2365(Static262.anInt2805 == 1, local3351, Static150.aClass183_3, local1313);
						return;
					}
					if (arg0 == 5422) {
						anInt3875 -= 2;
						local75 = aStringArray26[anInt3875];
						local81 = aStringArray26[anInt3875 + 1];
						local89 = anIntArray370[--anInt3876];
						if (local75.length() > 0) {
							if (Static382.aStringArray41 == null) {
								Static382.aStringArray41 = new String[Static333.anIntArray574[Static268.aClass272_4.anInt7964]];
							}
							Static382.aStringArray41[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static27.aStringArray4 == null) {
								Static27.aStringArray4 = new String[Static333.anIntArray574[Static268.aClass272_4.anInt7964]];
							}
							Static27.aStringArray4[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray26[--anInt3875]);
						return;
					}
					if (arg0 == 5424) {
						anInt3876 -= 11;
						Static364.anInt6678 = anIntArray370[anInt3876];
						Static18.anInt441 = anIntArray370[anInt3876 + 1];
						Static74.anInt1920 = anIntArray370[anInt3876 + 2];
						Static194.anInt4067 = anIntArray370[anInt3876 + 3];
						Static381.anInt7477 = anIntArray370[anInt3876 + 4];
						Static25.anInt618 = anIntArray370[anInt3876 + 5];
						Static194.anInt4068 = anIntArray370[anInt3876 + 6];
						Static25.anInt615 = anIntArray370[anInt3876 + 7];
						Static155.anInt3350 = anIntArray370[anInt3876 + 8];
						Static163.anInt3445 = anIntArray370[anInt3876 + 9];
						Static237.anInt4687 = anIntArray370[anInt3876 + 10];
						Static140.aClass211_38.method4761(Static381.anInt7477);
						Static140.aClass211_38.method4761(Static25.anInt618);
						Static140.aClass211_38.method4761(Static194.anInt4068);
						Static140.aClass211_38.method4761(Static25.anInt615);
						Static140.aClass211_38.method4761(Static155.anInt3350);
						Static280.aClass137_15 = null;
						Static90.aClass137_2 = null;
						Static302.aClass137_17 = null;
						Static307.aClass137_18 = null;
						Static116.aClass137_8 = null;
						Static455.aClass137_24 = null;
						Static284.aClass137_10 = null;
						Static450.aClass137_23 = null;
						Static333.aBoolean386 = true;
						return;
					}
					if (arg0 == 5425) {
						Static27.method561();
						Static333.aBoolean386 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt3876 -= 2;
						Static19.anInt523 = anIntArray370[anInt3876];
						Static306.anInt5748 = anIntArray370[anInt3876 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt3876 -= 2;
						Static321.anInt5962 = anIntArray370[anInt3876 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt3876 -= 2;
						local157 = anIntArray370[anInt3876];
						local192 = anIntArray370[anInt3876 + 1];
						anIntArray370[anInt3876++] = Static179.method3011(local157, local192) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static221.method3429(aStringArray26[--anInt3875], false, false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static466.method4995("accountcreated", Static150.aClass183_3.anApplet1);
							return;
						} catch (@Pc(3646) Throwable local3646) {
							return;
						}
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt3876 -= 4;
						local157 = anIntArray370[anInt3876];
						local192 = anIntArray370[anInt3876 + 1];
						local89 = anIntArray370[anInt3876 + 2];
						local95 = anIntArray370[anInt3876 + 3];
						Static6.method68(local89, (local157 & 0x3FFF) - Static380.anInt6896, local192, false, (local157 >> 14 & 0x3FFF) - Static278.anInt5374, local95);
						return;
					}
					if (arg0 == 5501) {
						anInt3876 -= 4;
						local157 = anIntArray370[anInt3876];
						local192 = anIntArray370[anInt3876 + 1];
						local89 = anIntArray370[anInt3876 + 2];
						local95 = anIntArray370[anInt3876 + 3];
						Static368.method5128(local95, local89, local192, (local157 >> 14 & 0x3FFF) - Static278.anInt5374, (local157 & 0x3FFF) - Static380.anInt6896);
						return;
					}
					if (arg0 == 5502) {
						anInt3876 -= 6;
						local157 = anIntArray370[anInt3876];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static398.anInt7203 = local157;
						local192 = anIntArray370[anInt3876 + 1];
						if (local192 + 1 >= Static84.anIntArrayArrayArray2[Static398.anInt7203].length >> 1) {
							throw new RuntimeException();
						}
						Static69.anInt1836 = local192;
						Static3.anInt50 = 0;
						Static71.anInt1879 = anIntArray370[anInt3876 + 2];
						Static89.anInt7967 = anIntArray370[anInt3876 + 3];
						local89 = anIntArray370[anInt3876 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static458.anInt7957 = local89;
						local95 = anIntArray370[anInt3876 + 5];
						if (local95 + 1 >= Static84.anIntArrayArrayArray2[Static458.anInt7957].length >> 1) {
							throw new RuntimeException();
						}
						Static420.anInt4323 = local95;
						Static21.anInt6762 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static214.method5444();
						return;
					}
					if (arg0 == 5504) {
						anInt3876 -= 2;
						Static156.method2624(anIntArray370[anInt3876], anIntArray370[anInt3876 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray370[anInt3876++] = (int) Static26.aFloat5 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray370[anInt3876++] = (int) Static267.aFloat83 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static204.method3266();
						return;
					}
					if (arg0 == 5508) {
						Static109.method1769();
						return;
					}
					if (arg0 == 5509) {
						Static384.method5372();
						return;
					}
					if (arg0 == 5510) {
						Static452.method6145();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray370[--anInt3876];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static278.anInt5374;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static209.anInt4283) {
							local192 = Static209.anInt4283;
						}
						local89 -= Static380.anInt6896;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static211.anInt4295) {
							local89 = Static211.anInt4295;
						}
						Static224.anInt7016 = (local192 << 7) + 64;
						Static459.anInt7963 = (local89 << 7) + 64;
						Static21.anInt6762 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static55.method1062();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt3875 -= 2;
						local75 = aStringArray26[anInt3875];
						local81 = aStringArray26[anInt3875 + 1];
						local89 = anIntArray370[--anInt3876];
						if (Static170.anInt3494 != 2) {
							return;
						}
						if (Static97.anInt2331 == 0 && Static174.anInt3826 == 0) {
							Static92.aString19 = local75;
							Static194.aString35 = local81;
							Static39.anInt1015 = local89;
							Static118.method2017(5);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static237.method3601();
						return;
					}
					if (arg0 == 5602) {
						if (Static97.anInt2331 == 0) {
							Static224.anInt7015 = -2;
							Static168.anInt1709 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt3876 -= 4;
						if (Static170.anInt3494 != 2) {
							return;
						}
						if (Static97.anInt2331 == 0 && Static174.anInt3826 == 0) {
							Static162.method2665(anIntArray370[anInt3876], anIntArray370[anInt3876 + 2], anIntArray370[anInt3876 + 3], anIntArray370[anInt3876 + 1]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt3875--;
						if (Static170.anInt3494 != 2) {
							return;
						}
						if (Static97.anInt2331 == 0 && Static174.anInt3826 == 0) {
							Static419.method5698(Static26.method555(aStringArray26[anInt3875]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt3875 -= 2;
						if (Static170.anInt3494 != 2) {
							return;
						}
						if (Static97.anInt2331 == 0 && Static174.anInt3826 == 0) {
							Static42.method785(Static26.method555(aStringArray26[anInt3875]), aStringArray26[anInt3875 + 1], false);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static174.anInt3826 == 0) {
							Static168.anInt1719 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray370[anInt3876++] = Static168.anInt1709;
						return;
					}
					if (arg0 == 5608) {
						anIntArray370[anInt3876++] = Static305.anInt5745;
						return;
					}
					if (arg0 == 5609) {
						anIntArray370[anInt3876++] = Static168.anInt1719;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray26[anInt3875++] = Static399.aStringArray3.length > local157 ? Static437.method5883(Static399.aStringArray3[local157]) : "";
						}
						Static399.aStringArray3 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray370[anInt3876++] = Static432.anInt7626;
						return;
					}
					if (arg0 == 5612) {
						local157 = anIntArray370[--anInt3876];
						if (Static170.anInt3494 != 6) {
							return;
						}
						if (Static97.anInt2331 == 0 && Static174.anInt3826 == 0) {
							if (Static388.aClass236_13 != null) {
								Static388.aClass236_13.method5236();
								Static388.aClass236_13 = null;
							}
							Static39.anInt1015 = local157;
							Static118.method2017(8);
							return;
						}
						return;
					}
					if (arg0 == 5613) {
						anIntArray370[anInt3876++] = Static168.anInt1709;
						return;
					}
					if (arg0 == 5615) {
						anInt3875 -= 2;
						local75 = aStringArray26[anInt3875];
						local81 = aStringArray26[anInt3875 + 1];
						if (Static170.anInt3494 != 2) {
							return;
						}
						if (Static97.anInt2331 == 0 && Static174.anInt3826 == 0) {
							if (Static388.aClass236_13 != null) {
								Static388.aClass236_13.method5236();
								Static388.aClass236_13 = null;
							}
							Static92.aString19 = local75;
							Static194.aString35 = local81;
							Static118.method2017(4);
							return;
						}
						return;
					}
					if (arg0 == 5616) {
						Static162.method2668(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray370[anInt3876++] = Static224.anInt7015;
						return;
					}
					if (arg0 == 5618) {
						local157 = anIntArray370[--anInt3876];
						Static349.method4942(false, local157);
						return;
					}
					if (arg0 == 5619) {
						local157 = anIntArray370[--anInt3876];
						Static349.method4942(true, local157);
						return;
					}
					if (arg0 == 5620) {
						Static342.method4808();
						if (Static323.aString56 != "" && Static323.aString56 != "") {
							anIntArray370[anInt3876++] = 1;
							return;
						}
						anIntArray370[anInt3876++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt3875 -= 2;
						if (Static170.anInt3494 != 2) {
							return;
						}
						if (Static97.anInt2331 == 0 && Static174.anInt3826 == 0) {
							Static42.method785(Static26.method555(aStringArray26[anInt3875]), aStringArray26[anInt3875 + 1], true);
							return;
						}
						return;
					}
					if (arg0 == 5622) {
						@Pc(4436) Class157 local4436 = Static150.aClass183_3.method4157("3", false);
						while (local4436.anInt4667 == 0) {
							Static289.method4249(1L);
						}
						if (local4436.anInt4667 == 2) {
							throw new RuntimeException("Error opening file");
						}
						@Pc(4456) Class128 local4456 = (Class128) local4436.anObject13;
						if (local4456.method3094().exists()) {
							@Pc(4466) Class1_Sub3 local4466 = new Class1_Sub3(50);
							try {
								local4456.method3089(50, 0, local4466.aByteArray14);
							} catch (@Pc(4475) IOException local4475) {
							}
						}
						try {
							local4456.method3091();
							return;
						} catch (@Pc(4481) Exception local4481) {
							return;
						}
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray370[--anInt3876];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static12.aClass34_Sub1_1.anInt7168 = local157;
						Static69.method1330();
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static399.aBoolean22 = false;
						return;
					}
					if (arg0 == 6002) {
						Static12.aClass34_Sub1_1.method5477(anIntArray370[--anInt3876] == 1);
						Static69.method1330();
						Static257.method3816();
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static399.aBoolean22 = false;
						return;
					}
					if (arg0 == 6003) {
						Static12.aClass34_Sub1_1.aBoolean457 = anIntArray370[--anInt3876] == 1;
						Static257.method3816();
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static399.aBoolean22 = false;
						return;
					}
					if (arg0 == 6005) {
						Static12.aClass34_Sub1_1.aBoolean455 = anIntArray370[--anInt3876] == 1;
						Static69.method1330();
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static399.aBoolean22 = false;
						return;
					}
					if (arg0 == 6006) {
						Static12.aClass34_Sub1_1.aBoolean448 = anIntArray370[--anInt3876] == 1;
						Static30.aClass106_3.method5982(!Static12.aClass34_Sub1_1.aBoolean448);
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static399.aBoolean22 = false;
						return;
					}
					if (arg0 == 6007) {
						Static12.aClass34_Sub1_1.anInt7166 = anIntArray370[--anInt3876];
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static399.aBoolean22 = false;
						return;
					}
					if (arg0 == 6008) {
						Static12.aClass34_Sub1_1.aBoolean456 = anIntArray370[--anInt3876] == 1;
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static399.aBoolean22 = false;
						return;
					}
					if (arg0 == 6009) {
						Static12.aClass34_Sub1_1.aBoolean444 = anIntArray370[--anInt3876] == 1;
						Static69.method1330();
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static399.aBoolean22 = false;
						return;
					}
					if (arg0 == 6010) {
						Static12.aClass34_Sub1_1.aBoolean452 = anIntArray370[--anInt3876] == 1;
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static399.aBoolean22 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray370[--anInt3876];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static12.aClass34_Sub1_1.method5461(local157, Static262.anInt2805);
						Static69.method1330();
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static399.aBoolean22 = false;
						return;
					}
					if (arg0 == 6012) {
						Static12.aClass34_Sub1_1.method5464(anIntArray370[--anInt3876] == 1, Static262.anInt2805);
						Static226.method3464();
						Static448.method6102();
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static399.aBoolean22 = false;
						return;
					}
					if (arg0 == 6014) {
						Static12.aClass34_Sub1_1.aBoolean451 = anIntArray370[--anInt3876] == 1;
						Static69.method1330();
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static399.aBoolean22 = false;
						return;
					}
					if (arg0 == 6015) {
						Static12.aClass34_Sub1_1.aBoolean447 = anIntArray370[--anInt3876] == 1;
						Static69.method1330();
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static399.aBoolean22 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray370[--anInt3876];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static12.aClass34_Sub1_1.anInt7161 = local157;
						Static197.method3166(Static262.anInt2805);
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						return;
					}
					if (arg0 == 6017) {
						Static12.aClass34_Sub1_1.aBoolean443 = anIntArray370[--anInt3876] == 1;
						Static25.method517();
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static399.aBoolean22 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray370[--anInt3876];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static12.aClass34_Sub1_1.anInt7173 = local157;
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static399.aBoolean22 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray370[--anInt3876];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static12.aClass34_Sub1_1.anInt7157) {
							if (Static12.aClass34_Sub1_1.anInt7157 == 0 && Static71.anInt1878 != -1) {
								Static199.method3194(Static362.aClass211_75, local157, Static71.anInt1878);
								Static180.aBoolean240 = false;
							} else if (local157 == 0) {
								Static47.method5365();
								Static180.aBoolean240 = false;
							} else {
								Static144.method2315(local157);
							}
							Static12.aClass34_Sub1_1.anInt7157 = local157;
						}
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static399.aBoolean22 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray370[--anInt3876];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static12.aClass34_Sub1_1.anInt7175 = local157;
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static399.aBoolean22 = false;
						return;
					}
					if (arg0 == 6021) {
						Static12.aClass34_Sub1_1.aBoolean460 = anIntArray370[--anInt3876] == 1;
						Static257.method3816();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray370[--anInt3876];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static155.anInt3339 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static176.method2984(local157);
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static399.aBoolean22 = false;
						anIntArray370[anInt3876++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray370[--anInt3876];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static12.aClass34_Sub1_1.anInt7176 = local157;
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray370[--anInt3876];
						if (local157 < 0 || local157 > Static380.method5247(Static155.anInt3339)) {
							local157 = 0;
						}
						Static12.aClass34_Sub1_1.anInt7165 = local157;
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static399.aBoolean22 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray370[--anInt3876];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static211.method3322(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static12.aClass34_Sub1_1.aBoolean450 = anIntArray370[--anInt3876] != 0;
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						return;
					}
					if (arg0 == 6029) {
						Static12.aClass34_Sub1_1.anInt7166 = anIntArray370[--anInt3876];
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						return;
					}
					if (arg0 == 6030) {
						Static12.aClass34_Sub1_1.aBoolean446 = anIntArray370[--anInt3876] != 0;
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static69.method1330();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray370[--anInt3876];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static197.method3166(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray370[--anInt3876];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static12.aClass34_Sub1_1.anInt7162 = local157;
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static399.aBoolean22 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray370[--anInt3876];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static12.aClass34_Sub1_1.anInt7171 = local157;
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						return;
					}
					if (arg0 == 6034) {
						Static12.aClass34_Sub1_1.aBoolean458 = anIntArray370[--anInt3876] == 1;
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						Static226.method3464();
						Static399.aBoolean22 = false;
						return;
					}
					if (arg0 == 6035) {
						Static12.aClass34_Sub1_1.aBoolean461 = anIntArray370[--anInt3876] == 1;
						Static69.method1330();
						Static257.method3816();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.anInt7168;
						return;
					}
					if (arg0 == 6102) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.method5469(Static262.anInt2805) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.aBoolean457 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.aBoolean455 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.aBoolean448 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.anInt7166;
						return;
					}
					if (arg0 == 6108) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.aBoolean456 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.aBoolean444 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.aBoolean452 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.method5462(Static262.anInt2805);
						return;
					}
					if (arg0 == 6112) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.method5466(Static262.anInt2805) ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.aBoolean451 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.aBoolean447 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.anInt7161;
						return;
					}
					if (arg0 == 6117) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.aBoolean443 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.anInt7173;
						return;
					}
					if (arg0 == 6119) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.anInt7157;
						return;
					}
					if (arg0 == 6120) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.anInt7175;
						return;
					}
					if (arg0 == 6121) {
						anIntArray370[anInt3876++] = Static30.aClass106_3.method5927() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray370[anInt3876++] = Static301.method4354();
						return;
					}
					if (arg0 == 6124) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.anInt7176;
						return;
					}
					if (arg0 == 6125) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.anInt7165;
						return;
					}
					if (arg0 == 6126) {
						anIntArray370[anInt3876++] = Static30.aClass106_3.method5960() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.aBoolean453 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.aBoolean450 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.anInt7166;
						return;
					}
					if (arg0 == 6130) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.aBoolean446 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray370[anInt3876++] = Static262.anInt2805;
						return;
					}
					if (arg0 == 6132) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.anInt7162;
						return;
					}
					if (arg0 == 6133) {
						anIntArray370[anInt3876++] = Static282.anInt5394 == 1 || Static282.anInt5394 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray370[anInt3876++] = Static380.method5247(Static155.anInt3339);
						return;
					}
					if (arg0 == 6135) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.anInt7171;
						return;
					}
					if (arg0 == 6136) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.aBoolean458 ? 1 : 0;
						return;
					}
					if (arg0 == 6137) {
						@Pc(5871) boolean local5871 = true;
						try {
							local5871 = jagmisc.getTotalPhysicalMemory() > 268435456L;
						} catch (@Pc(5881) Throwable local5881) {
						}
						anIntArray370[anInt3876++] = local5871 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt3876 -= 2;
						Static187.aShort54 = (short) anIntArray370[anInt3876];
						if (Static187.aShort54 <= 0) {
							Static187.aShort54 = 256;
						}
						Static296.aShort79 = (short) anIntArray370[anInt3876 + 1];
						if (Static296.aShort79 <= 0) {
							Static296.aShort79 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt3876 -= 2;
						Static168.aShort40 = (short) anIntArray370[anInt3876];
						if (Static168.aShort40 <= 0) {
							Static168.aShort40 = 256;
						}
						Static120.aShort50 = (short) anIntArray370[anInt3876 + 1];
						if (Static120.aShort50 <= 0) {
							Static120.aShort50 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt3876 -= 4;
						Static134.aShort52 = (short) anIntArray370[anInt3876];
						if (Static134.aShort52 <= 0) {
							Static134.aShort52 = 1;
						}
						Static8.aShort1 = (short) anIntArray370[anInt3876 + 1];
						if (Static8.aShort1 <= 0) {
							Static8.aShort1 = 32767;
						} else if (Static8.aShort1 < Static134.aShort52) {
							Static8.aShort1 = Static134.aShort52;
						}
						Static307.aShort86 = (short) anIntArray370[anInt3876 + 2];
						if (Static307.aShort86 <= 0) {
							Static307.aShort86 = 1;
						}
						Static324.aShort97 = (short) anIntArray370[anInt3876 + 3];
						if (Static324.aShort97 <= 0) {
							Static324.aShort97 = 32767;
							return;
						}
						if (Static324.aShort97 < Static307.aShort86) {
							Static324.aShort97 = Static307.aShort86;
						}
						return;
					}
					if (arg0 == 6203) {
						Static296.method4298(0, 0, Static201.aClass68_8.anInt2149, false, Static201.aClass68_8.anInt2107);
						anIntArray370[anInt3876++] = Static380.anInt6895;
						anIntArray370[anInt3876++] = Static133.anInt2957;
						return;
					}
					if (arg0 == 6204) {
						anIntArray370[anInt3876++] = Static168.aShort40;
						anIntArray370[anInt3876++] = Static120.aShort50;
						return;
					}
					if (arg0 == 6205) {
						anIntArray370[anInt3876++] = Static187.aShort54;
						anIntArray370[anInt3876++] = Static296.aShort79;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray370[anInt3876++] = (int) (Static250.method3737() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray370[anInt3876++] = (int) (Static250.method3737() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt3876 -= 3;
						local157 = anIntArray370[anInt3876];
						local192 = anIntArray370[anInt3876 + 1];
						local89 = anIntArray370[anInt3876 + 2];
						aCalendar1.clear();
						aCalendar1.set(11, 12);
						aCalendar1.set(local89, local192, local157);
						local95 = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
						if (local89 < 1970) {
							local95--;
						}
						anIntArray370[anInt3876++] = local95;
						return;
					}
					if (arg0 == 6303) {
						aCalendar1.clear();
						aCalendar1.setTime(new Date(Static250.method3737()));
						anIntArray370[anInt3876++] = aCalendar1.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray370[--anInt3876];
						local1313 = true;
						if (local157 < 0) {
							local1313 = (local157 + 1) % 4 == 0;
						} else if (local157 < 1582) {
							local1313 = local157 % 4 == 0;
						} else if (local157 % 4 != 0) {
							local1313 = false;
						} else if (local157 % 100 != 0) {
							local1313 = true;
						} else if (local157 % 400 != 0) {
							local1313 = false;
						}
						anIntArray370[anInt3876++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray370[anInt3876++] = Static423.method5735() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray370[anInt3876++] = Static363.method5091() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static170.anInt3494 == 6 && Static97.anInt2331 == 0 && Static174.anInt3826 == 0) {
							if (Static44.aBoolean378) {
								anIntArray370[anInt3876++] = 0;
								return;
							}
							if (Static98.aLong65 > Static250.method3737() - 1000L) {
								anIntArray370[anInt3876++] = 1;
								return;
							}
							Static44.aBoolean378 = true;
							Static32.method677(Static219.aClass177_57);
							Static433.aClass1_Sub3_Sub1_11.method1197(Static352.anInt6562);
							anIntArray370[anInt3876++] = 0;
							return;
						}
						anIntArray370[anInt3876++] = 1;
						return;
					}
					@Pc(6414) Class193 local6414;
					@Pc(6381) Class103_Sub1 local6381;
					if (arg0 == 6501) {
						local6381 = Static375.method5212();
						if (local6381 != null) {
							anIntArray370[anInt3876++] = local6381.anInt3201;
							anIntArray370[anInt3876++] = local6381.anInt3184;
							aStringArray26[anInt3875++] = local6381.aString29;
							local6414 = local6381.method2371();
							anIntArray370[anInt3876++] = local6414.anInt5710;
							aStringArray26[anInt3875++] = local6414.aString51;
							anIntArray370[anInt3876++] = local6381.anInt3185;
							anIntArray370[anInt3876++] = local6381.anInt3197;
							aStringArray26[anInt3875++] = local6381.aString28;
							return;
						}
						anIntArray370[anInt3876++] = -1;
						anIntArray370[anInt3876++] = 0;
						aStringArray26[anInt3875++] = "";
						anIntArray370[anInt3876++] = 0;
						aStringArray26[anInt3875++] = "";
						anIntArray370[anInt3876++] = 0;
						anIntArray370[anInt3876++] = 0;
						aStringArray26[anInt3875++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6381 = Static88.method1558();
						if (local6381 != null) {
							anIntArray370[anInt3876++] = local6381.anInt3201;
							anIntArray370[anInt3876++] = local6381.anInt3184;
							aStringArray26[anInt3875++] = local6381.aString29;
							local6414 = local6381.method2371();
							anIntArray370[anInt3876++] = local6414.anInt5710;
							aStringArray26[anInt3875++] = local6414.aString51;
							anIntArray370[anInt3876++] = local6381.anInt3185;
							anIntArray370[anInt3876++] = local6381.anInt3197;
							aStringArray26[anInt3875++] = local6381.aString28;
							return;
						}
						anIntArray370[anInt3876++] = -1;
						anIntArray370[anInt3876++] = 0;
						aStringArray26[anInt3875++] = "";
						anIntArray370[anInt3876++] = 0;
						aStringArray26[anInt3875++] = "";
						anIntArray370[anInt3876++] = 0;
						anIntArray370[anInt3876++] = 0;
						aStringArray26[anInt3875++] = "";
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray370[--anInt3876];
						local81 = aStringArray26[--anInt3875];
						if (Static170.anInt3494 == 6 && Static97.anInt2331 == 0 && Static174.anInt3826 == 0) {
							anIntArray370[anInt3876++] = Static388.method5417(local157, local81) ? 1 : 0;
							return;
						}
						anIntArray370[anInt3876++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static12.aClass34_Sub1_1.anInt7170 = anIntArray370[--anInt3876];
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						return;
					}
					if (arg0 == 6505) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.anInt7170;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray370[--anInt3876];
						@Pc(6771) Class103_Sub1 local6771 = Static439.method5905(local157);
						if (local6771 != null) {
							anIntArray370[anInt3876++] = local6771.anInt3184;
							aStringArray26[anInt3875++] = local6771.aString29;
							@Pc(6795) Class193 local6795 = local6771.method2371();
							anIntArray370[anInt3876++] = local6795.anInt5710;
							aStringArray26[anInt3875++] = local6795.aString51;
							anIntArray370[anInt3876++] = local6771.anInt3185;
							anIntArray370[anInt3876++] = local6771.anInt3197;
							aStringArray26[anInt3875++] = local6771.aString28;
							return;
						}
						anIntArray370[anInt3876++] = -1;
						aStringArray26[anInt3875++] = "";
						anIntArray370[anInt3876++] = 0;
						aStringArray26[anInt3875++] = "";
						anIntArray370[anInt3876++] = 0;
						anIntArray370[anInt3876++] = 0;
						aStringArray26[anInt3875++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt3876 -= 4;
						local157 = anIntArray370[anInt3876];
						local1313 = anIntArray370[anInt3876 + 1] == 1;
						local89 = anIntArray370[anInt3876 + 2];
						local1965 = anIntArray370[anInt3876 + 3] == 1;
						Static203.method3258(local89, local157, local1313, local1965);
						return;
					}
					if (arg0 == 6508) {
						Static220.method3422();
						return;
					}
					if (arg0 == 6509) {
						if (Static170.anInt3494 != 6) {
							return;
						}
						Static368.aBoolean423 = anIntArray370[--anInt3876] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static12.aClass34_Sub1_1.aBoolean454 = anIntArray370[--anInt3876] == 1;
						Static12.aClass34_Sub1_1.method5473(Static150.aClass183_3);
						return;
					}
					if (arg0 == 6601) {
						anIntArray370[anInt3876++] = Static12.aClass34_Sub1_1.aBoolean454 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static262.aClass256_6 == Static66.aClass256_3) {
					if (arg0 == 6700) {
						local157 = Static177.aClass38_18.method770();
						if (Static456.anInt1594 != -1) {
							local157++;
						}
						anIntArray370[anInt3876++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray370[--anInt3876];
						if (Static456.anInt1594 != -1) {
							if (local157 == 0) {
								anIntArray370[anInt3876++] = Static456.anInt1594;
								return;
							}
							local157--;
						}
						@Pc(7070) Class1_Sub39 local7070 = (Class1_Sub39) Static177.aClass38_18.method767();
						while (local157-- > 0) {
							local7070 = (Class1_Sub39) Static177.aClass38_18.method773();
						}
						anIntArray370[anInt3876++] = local7070.anInt6172;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray370[--anInt3876];
						if (Static293.aClass68ArrayArray4[local157] == null) {
							aStringArray26[anInt3875++] = "";
							return;
						}
						local81 = Static293.aClass68ArrayArray4[local157][0].aString22;
						if (local81 == null) {
							aStringArray26[anInt3875++] = "";
							return;
						}
						aStringArray26[anInt3875++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray370[--anInt3876];
						if (Static293.aClass68ArrayArray4[local157] == null) {
							anIntArray370[anInt3876++] = 0;
							return;
						}
						anIntArray370[anInt3876++] = Static293.aClass68ArrayArray4[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt3876 -= 2;
						local157 = anIntArray370[anInt3876];
						local192 = anIntArray370[anInt3876 + 1];
						if (Static293.aClass68ArrayArray4[local157] == null) {
							aStringArray26[anInt3875++] = "";
							return;
						}
						local3351 = Static293.aClass68ArrayArray4[local157][local192].aString22;
						if (local3351 == null) {
							aStringArray26[anInt3875++] = "";
							return;
						}
						aStringArray26[anInt3875++] = local3351;
						return;
					}
					if (arg0 == 6705) {
						anInt3876 -= 2;
						local157 = anIntArray370[anInt3876];
						local192 = anIntArray370[anInt3876 + 1];
						if (Static293.aClass68ArrayArray4[local157] == null) {
							anIntArray370[anInt3876++] = 0;
							return;
						}
						anIntArray370[anInt3876++] = Static293.aClass68ArrayArray4[local157][local192].anInt2103;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt3876 -= 3;
						local157 = anIntArray370[anInt3876];
						local192 = anIntArray370[anInt3876 + 1];
						local89 = anIntArray370[anInt3876 + 2];
						Static358.method5056(local89, "", local157 << 16 | local192, 1);
						return;
					}
					if (arg0 == 6708) {
						anInt3876 -= 3;
						local157 = anIntArray370[anInt3876];
						local192 = anIntArray370[anInt3876 + 1];
						local89 = anIntArray370[anInt3876 + 2];
						Static358.method5056(local89, "", local157 << 16 | local192, 2);
						return;
					}
					if (arg0 == 6709) {
						anInt3876 -= 3;
						local157 = anIntArray370[anInt3876];
						local192 = anIntArray370[anInt3876 + 1];
						local89 = anIntArray370[anInt3876 + 2];
						Static358.method5056(local89, "", local157 << 16 | local192, 3);
						return;
					}
					if (arg0 == 6710) {
						anInt3876 -= 3;
						local157 = anIntArray370[anInt3876];
						local192 = anIntArray370[anInt3876 + 1];
						local89 = anIntArray370[anInt3876 + 2];
						Static358.method5056(local89, "", local157 << 16 | local192, 4);
						return;
					}
					if (arg0 == 6711) {
						anInt3876 -= 3;
						local157 = anIntArray370[anInt3876];
						local192 = anIntArray370[anInt3876 + 1];
						local89 = anIntArray370[anInt3876 + 2];
						Static358.method5056(local89, "", local157 << 16 | local192, 5);
						return;
					}
					if (arg0 == 6712) {
						anInt3876 -= 3;
						local157 = anIntArray370[anInt3876];
						local192 = anIntArray370[anInt3876 + 1];
						local89 = anIntArray370[anInt3876 + 2];
						Static358.method5056(local89, "", local157 << 16 | local192, 6);
						return;
					}
					if (arg0 == 6713) {
						anInt3876 -= 3;
						local157 = anIntArray370[anInt3876];
						local192 = anIntArray370[anInt3876 + 1];
						local89 = anIntArray370[anInt3876 + 2];
						Static358.method5056(local89, "", local157 << 16 | local192, 7);
						return;
					}
					if (arg0 == 6714) {
						anInt3876 -= 3;
						local157 = anIntArray370[anInt3876];
						local192 = anIntArray370[anInt3876 + 1];
						local89 = anIntArray370[anInt3876 + 2];
						Static358.method5056(local89, "", local157 << 16 | local192, 8);
						return;
					}
					if (arg0 == 6715) {
						anInt3876 -= 3;
						local157 = anIntArray370[anInt3876];
						local192 = anIntArray370[anInt3876 + 1];
						local89 = anIntArray370[anInt3876 + 2];
						Static358.method5056(local89, "", local157 << 16 | local192, 9);
						return;
					}
					if (arg0 == 6716) {
						anInt3876 -= 3;
						local157 = anIntArray370[anInt3876];
						local192 = anIntArray370[anInt3876 + 1];
						local89 = anIntArray370[anInt3876 + 2];
						Static358.method5056(local89, "", local157 << 16 | local192, 10);
						return;
					}
					if (arg0 == 6717) {
						anInt3876 -= 3;
						local157 = anIntArray370[anInt3876];
						local192 = anIntArray370[anInt3876 + 1];
						local89 = anIntArray370[anInt3876 + 2];
						@Pc(7658) Class68 local7658 = Static115.method1866(local157 << 16 | local192, local89);
						Static192.method3103();
						@Pc(7663) Class1_Sub29 local7663 = Static55.method1059(local7658);
						Static61.method1144(local7663.method4026(), local7663.anInt5254, local7658);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7691) Class47 local7691;
					if (arg0 == 6800) {
						local157 = anIntArray370[--anInt3876];
						local7691 = Static163.aClass170_2.method3739(local157);
						if (local7691.aString11 == null) {
							aStringArray26[anInt3875++] = "";
							return;
						}
						aStringArray26[anInt3875++] = local7691.aString11;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray370[--anInt3876];
						local7691 = Static163.aClass170_2.method3739(local157);
						anIntArray370[anInt3876++] = local7691.anInt1560;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray370[--anInt3876];
						local7691 = Static163.aClass170_2.method3739(local157);
						anIntArray370[anInt3876++] = local7691.anInt1529;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray370[--anInt3876];
						local7691 = Static163.aClass170_2.method3739(local157);
						anIntArray370[anInt3876++] = local7691.anInt1531;
						return;
					}
					if (arg0 == 6804) {
						anInt3876 -= 2;
						local157 = anIntArray370[anInt3876];
						local192 = anIntArray370[anInt3876 + 1];
						@Pc(7813) Class13 local7813 = Static53.aClass32_1.method724(local192);
						if (local7813.method148()) {
							aStringArray26[anInt3875++] = Static163.aClass170_2.method3739(local157).method1082(local192, local7813.aString3);
							return;
						}
						anIntArray370[anInt3876++] = Static163.aClass170_2.method3739(local157).method1087(local192, local7813.anInt200);
						return;
					}
				} else if (arg0 < 7000) {
					if (arg0 == 6900) {
						anIntArray370[anInt3876++] = Static400.aBoolean463 && !Static223.aBoolean279 ? 1 : 0;
						return;
					}
					if (arg0 == 6901) {
						anIntArray370[anInt3876++] = Static139.anInt3046;
						return;
					}
					if (arg0 == 6902) {
						anIntArray370[anInt3876++] = Static201.anInt4190;
						return;
					}
					if (arg0 == 6903) {
						anIntArray370[anInt3876++] = Static435.anInt7683;
						return;
					}
					if (arg0 == 6904) {
						anIntArray370[anInt3876++] = Static278.anInt5378;
						return;
					}
					if (arg0 == 6905) {
						local75 = "";
						if (Static228.aClass157_3 != null) {
							if (Static228.aClass157_3.anObject13 == null) {
								local75 = Static63.method1234(Static228.aClass157_3.anInt4669);
							} else {
								local75 = (String) Static228.aClass157_3.anObject13;
							}
						}
						aStringArray26[anInt3875++] = local75;
						return;
					}
					if (arg0 == 6906) {
						anIntArray370[anInt3876++] = Static222.anInt4445;
						return;
					}
					if (arg0 == 6907) {
						anIntArray370[anInt3876++] = Static292.anInt5519;
						return;
					}
					if (arg0 == 6908) {
						anIntArray370[anInt3876++] = Static50.anInt1226;
						return;
					}
					if (arg0 == 6909) {
						anIntArray370[anInt3876++] = Static199.aBoolean250 ? 1 : 0;
						return;
					}
					if (arg0 == 6910) {
						anIntArray370[anInt3876++] = Static125.anInt2786;
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!io", name = "d", descriptor = "(I)V")
	private static void method3006(@OriginalArg(0) int arg0) {
		@Pc(3) Class68 local3 = Static300.method4351(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class68[] local13 = Static181.aClass68ArrayArray3[local9];
		if (local13 == null) {
			@Pc(19) Class68[] local19 = Static293.aClass68ArrayArray4[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static181.aClass68ArrayArray3[local9] = new Class68[local22];
			Static469.method6019(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static469.method6019(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(IZ)V")
	private static void method3007(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class68 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class68 local35;
		@Pc(158) Class68 local158;
		@Pc(210) Class68 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt3876 -= 3;
				local13 = anIntArray370[anInt3876];
				local19 = anIntArray370[anInt3876 + 1];
				local25 = anIntArray370[anInt3876 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static300.method4351(local13);
				if (local35.aClass68Array2 == null) {
					local35.aClass68Array2 = new Class68[local25 + 1];
				}
				if (local35.aClass68Array2.length <= local25) {
					@Pc(54) Class68[] local54 = new Class68[local25 + 1];
					for (local56 = 0; local56 < local35.aClass68Array2.length; local56++) {
						local54[local56] = local35.aClass68Array2[local56];
					}
					local35.aClass68Array2 = local54;
				}
				if (local25 > 0 && local35.aClass68Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class68 local99 = new Class68();
				local99.anInt2153 = local19;
				local99.anInt2129 = local99.anInt2135 = local35.anInt2135;
				local99.anInt2188 = local25;
				local35.aClass68Array2[local25] = local99;
				if (arg1) {
					aClass68_7 = local99;
				} else {
					aClass68_6 = local99;
				}
				Static446.method6042(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass68_7 : aClass68_6;
				if (local137.anInt2188 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static300.method4351(local137.anInt2135);
				local158.aClass68Array2[local137.anInt2188] = null;
				Static446.method6042(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static300.method4351(anIntArray370[--anInt3876]);
				local137.aClass68Array2 = null;
				Static446.method6042(local137);
				return;
			}
			if (arg0 == 200) {
				anInt3876 -= 2;
				local13 = anIntArray370[anInt3876];
				local19 = anIntArray370[anInt3876 + 1];
				local210 = Static115.method1866(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray370[anInt3876++] = 1;
					if (arg1) {
						aClass68_7 = local210;
						return;
					}
					aClass68_6 = local210;
					return;
				}
				anIntArray370[anInt3876++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray370[--anInt3876];
				local158 = Static300.method4351(local13);
				if (local158 != null) {
					anIntArray370[anInt3876++] = 1;
					if (arg1) {
						aClass68_7 = local158;
						return;
					}
					aClass68_6 = local158;
					return;
				}
				anIntArray370[anInt3876++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray370[--anInt3876];
				method3006(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray370[--anInt3876];
				method3002(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt3876 -= 2;
					local13 = anIntArray370[anInt3876];
					local19 = anIntArray370[anInt3876 + 1];
					for (local25 = 0; local25 < Static39.anIntArray101.length; local25++) {
						if (Static39.anIntArray101[local25] == local13) {
							Static429.aClass30_Sub1_Sub1_Sub2_2.aClass210_1.method4731(local19, Static19.aClass143_1, local25);
							return;
						}
					}
					for (local353 = 0; local353 < Static455.anIntArray748.length; local353++) {
						if (Static455.anIntArray748[local353] == local13) {
							Static429.aClass30_Sub1_Sub1_Sub2_2.aClass210_1.method4731(local19, Static19.aClass143_1, local353);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt3876 -= 2;
					local13 = anIntArray370[anInt3876];
					local19 = anIntArray370[anInt3876 + 1];
					Static429.aClass30_Sub1_Sub1_Sub2_2.aClass210_1.method4733(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray370[--anInt3876] != 0;
					Static429.aClass30_Sub1_Sub1_Sub2_2.aClass210_1.method4732(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static300.method4351(anIntArray370[--anInt3876]);
					} else {
						local137 = arg1 ? aClass68_7 : aClass68_6;
					}
					if (arg0 == 1100) {
						anInt3876 -= 2;
						local137.anInt2124 = anIntArray370[anInt3876];
						if (local137.anInt2124 > local137.anInt2130 - local137.anInt2107) {
							local137.anInt2124 = local137.anInt2130 - local137.anInt2107;
						}
						if (local137.anInt2124 < 0) {
							local137.anInt2124 = 0;
						}
						local137.anInt2125 = anIntArray370[anInt3876 + 1];
						if (local137.anInt2125 > local137.anInt2122 - local137.anInt2149) {
							local137.anInt2125 = local137.anInt2122 - local137.anInt2149;
						}
						if (local137.anInt2125 < 0) {
							local137.anInt2125 = 0;
						}
						Static446.method6042(local137);
						if (local137.anInt2188 == -1) {
							Static64.method1236(local137.anInt2135);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt2189 = anIntArray370[--anInt3876];
						Static446.method6042(local137);
						if (local137.anInt2188 == -1) {
							Static90.method1561(local137.anInt2135);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean132 = anIntArray370[--anInt3876] == 1;
						Static446.method6042(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt2131 = anIntArray370[--anInt3876];
						Static446.method6042(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt2178 = anIntArray370[--anInt3876];
						Static446.method6042(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray370[--anInt3876];
						if (local137.anInt2118 != local19) {
							local137.anInt2118 = local19;
							Static446.method6042(local137);
						}
						if (local137.anInt2188 == -1) {
							Static232.method3530(local137.anInt2135);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt2113 = anIntArray370[--anInt3876];
						Static446.method6042(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean141 = anIntArray370[--anInt3876] == 1;
						Static446.method6042(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt2162 = 1;
						local137.anInt2176 = anIntArray370[--anInt3876];
						Static446.method6042(local137);
						if (local137.anInt2188 == -1) {
							Static234.method3566(local137.anInt2135);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt3876 -= 6;
						local137.anInt2108 = anIntArray370[anInt3876];
						local137.anInt2142 = anIntArray370[anInt3876 + 1];
						local137.anInt2167 = anIntArray370[anInt3876 + 2];
						local137.anInt2120 = anIntArray370[anInt3876 + 3];
						local137.anInt2182 = anIntArray370[anInt3876 + 4];
						local137.anInt2112 = anIntArray370[anInt3876 + 5];
						Static446.method6042(local137);
						if (local137.anInt2188 == -1) {
							Static318.method4542(local137.anInt2135);
							Static154.method2421(local137.anInt2135);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray370[--anInt3876];
						if (local137.anInt2111 != local19) {
							local137.anInt2111 = local19;
							local137.anInt2151 = 0;
							local137.anInt2116 = 1;
							local137.anInt2128 = 0;
							Static446.method6042(local137);
						}
						if (local137.anInt2188 == -1) {
							Static392.method5432(local137.anInt2135);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean143 = anIntArray370[--anInt3876] == 1;
						Static446.method6042(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray26[--anInt3875];
						if (!local1101.equals(local137.aString23)) {
							local137.aString23 = local1101;
							Static446.method6042(local137);
						}
						if (local137.anInt2188 == -1) {
							Static268.method3977(local137.anInt2135);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt2183 = anIntArray370[--anInt3876];
						Static446.method6042(local137);
						if (local137.anInt2188 == -1) {
							Static14.method150(local137.anInt2135);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt3876 -= 3;
						local137.anInt2115 = anIntArray370[anInt3876];
						local137.anInt2173 = anIntArray370[anInt3876 + 1];
						local137.anInt2180 = anIntArray370[anInt3876 + 2];
						Static446.method6042(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean138 = anIntArray370[--anInt3876] == 1;
						Static446.method6042(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt2141 = anIntArray370[--anInt3876];
						Static446.method6042(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt2192 = anIntArray370[--anInt3876];
						Static446.method6042(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean145 = anIntArray370[--anInt3876] == 1;
						Static446.method6042(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean140 = anIntArray370[--anInt3876] == 1;
						Static446.method6042(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt3876 -= 2;
						local137.anInt2130 = anIntArray370[anInt3876];
						local137.anInt2122 = anIntArray370[anInt3876 + 1];
						Static446.method6042(local137);
						if (local137.anInt2153 == 0) {
							Static238.method3609(local137, false);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt3876 -= 2;
						local137.anInt2134 = (short) anIntArray370[anInt3876];
						local137.anInt2172 = (short) anIntArray370[anInt3876 + 1];
						Static446.method6042(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean144 = anIntArray370[--anInt3876] == 1;
						Static446.method6042(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt2112 = anIntArray370[--anInt3876];
						Static446.method6042(local137);
						if (local137.anInt2188 == -1) {
							Static318.method4542(local137.anInt2135);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray370[--anInt3876];
						local137.lb = local19 == 1;
						Static446.method6042(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt3876 -= 2;
						local137.anInt2186 = anIntArray370[anInt3876];
						local137.anInt2191 = anIntArray370[anInt3876 + 1];
						Static446.method6042(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt2102 = anIntArray370[--anInt3876];
						Static446.method6042(local137);
						return;
					}
					@Pc(1454) Class13 local1454;
					if (arg0 == 1127) {
						anInt3876 -= 2;
						local19 = anIntArray370[anInt3876];
						local25 = anIntArray370[anInt3876 + 1];
						local1454 = Static53.aClass32_1.method724(local19);
						if (local25 != local1454.anInt200) {
							local137.method1577(local25, local19);
							return;
						}
						local137.method1571(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray370[--anInt3876];
						local1488 = aStringArray26[--anInt3875];
						local1454 = Static53.aClass32_1.method724(local19);
						if (!local1454.aString3.equals(local1488)) {
							local137.method1585(local19, local1488);
							return;
						}
						local137.method1571(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static300.method4351(anIntArray370[--anInt3876]);
							} else {
								local137 = arg1 ? aClass68_7 : aClass68_6;
							}
							local1101 = aStringArray26[--anInt3875];
							@Pc(2369) int[] local2369 = null;
							if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
								local353 = anIntArray370[--anInt3876];
								if (local353 > 0) {
									local2369 = new int[local353];
									while (local353-- > 0) {
										local2369[local353] = anIntArray370[--anInt3876];
									}
								}
								local1101 = local1101.substring(0, local1101.length() - 1);
							}
							@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
							for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
								if (local1101.charAt(local2290 - 1) == 's') {
									local2421[local2290] = aStringArray26[--anInt3875];
								} else {
									local2421[local2290] = Integer.valueOf(anIntArray370[--anInt3876]);
								}
							}
							local56 = anIntArray370[--anInt3876];
							if (local56 == -1) {
								local2421 = null;
							} else {
								local2421[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray31 = local2421;
							} else if (arg0 == 1401) {
								local137.anObjectArray17 = local2421;
							} else if (arg0 == 1402) {
								local137.anObjectArray13 = local2421;
							} else if (arg0 == 1403) {
								local137.anObjectArray26 = local2421;
							} else if (arg0 == 1404) {
								local137.anObjectArray29 = local2421;
							} else if (arg0 == 1405) {
								local137.anObjectArray14 = local2421;
							} else if (arg0 == 1406) {
								local137.anObjectArray25 = local2421;
							} else if (arg0 == 1407) {
								local137.anObjectArray24 = local2421;
								local137.anIntArray232 = local2369;
							} else if (arg0 == 1408) {
								local137.anObjectArray15 = local2421;
							} else if (arg0 == 1409) {
								local137.anObjectArray7 = local2421;
							} else if (arg0 == 1410) {
								local137.anObjectArray8 = local2421;
							} else if (arg0 == 1411) {
								local137.anObjectArray3 = local2421;
							} else if (arg0 == 1412) {
								local137.anObjectArray4 = local2421;
							} else if (arg0 == 1414) {
								local137.anObjectArray30 = local2421;
								local137.anIntArray228 = local2369;
							} else if (arg0 == 1415) {
								local137.anObjectArray10 = local2421;
								local137.anIntArray229 = local2369;
							} else if (arg0 == 1416) {
								local137.anObjectArray33 = local2421;
							} else if (arg0 == 1417) {
								local137.anObjectArray28 = local2421;
							} else if (arg0 == 1418) {
								local137.anObjectArray12 = local2421;
							} else if (arg0 == 1419) {
								local137.anObjectArray22 = local2421;
							} else if (arg0 == 1420) {
								local137.anObjectArray21 = local2421;
							} else if (arg0 == 1421) {
								local137.anObjectArray27 = local2421;
							} else if (arg0 == 1422) {
								local137.anObjectArray16 = local2421;
							} else if (arg0 == 1423) {
								local137.anObjectArray6 = local2421;
							} else if (arg0 == 1424) {
								local137.anObjectArray18 = local2421;
							} else if (arg0 == 1425) {
								local137.anObjectArray32 = local2421;
							} else if (arg0 == 1426) {
								local137.anObjectArray23 = local2421;
							} else if (arg0 == 1427) {
								local137.anObjectArray5 = local2421;
							} else if (arg0 == 1428) {
								local137.anObjectArray11 = local2421;
								local137.anIntArray230 = local2369;
							} else if (arg0 == 1429) {
								local137.anObjectArray20 = local2421;
								local137.anIntArray226 = local2369;
							} else if (arg0 == 1430) {
								local137.anObjectArray9 = local2421;
							}
							local137.aBoolean142 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass68_7 : aClass68_6;
							if (arg0 == 1500) {
								anIntArray370[anInt3876++] = local137.anInt2170;
								return;
							}
							if (arg0 == 1501) {
								anIntArray370[anInt3876++] = local137.anInt2175;
								return;
							}
							if (arg0 == 1502) {
								anIntArray370[anInt3876++] = local137.anInt2107;
								return;
							}
							if (arg0 == 1503) {
								anIntArray370[anInt3876++] = local137.anInt2149;
								return;
							}
							if (arg0 == 1504) {
								anIntArray370[anInt3876++] = local137.aBoolean136 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray370[anInt3876++] = local137.anInt2129;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static420.method3351(local137);
								anIntArray370[anInt3876++] = local158 == null ? -1 : local158.anInt2135;
								return;
							}
						} else {
							@Pc(3017) Class13 local3017;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass68_7 : aClass68_6;
								if (arg0 == 1600) {
									anIntArray370[anInt3876++] = local137.anInt2124;
									return;
								}
								if (arg0 == 1601) {
									anIntArray370[anInt3876++] = local137.anInt2125;
									return;
								}
								if (arg0 == 1602) {
									aStringArray26[anInt3875++] = local137.aString23;
									return;
								}
								if (arg0 == 1603) {
									anIntArray370[anInt3876++] = local137.anInt2130;
									return;
								}
								if (arg0 == 1604) {
									anIntArray370[anInt3876++] = local137.anInt2122;
									return;
								}
								if (arg0 == 1605) {
									anIntArray370[anInt3876++] = local137.anInt2112;
									return;
								}
								if (arg0 == 1606) {
									anIntArray370[anInt3876++] = local137.anInt2167;
									return;
								}
								if (arg0 == 1607) {
									anIntArray370[anInt3876++] = local137.anInt2182;
									return;
								}
								if (arg0 == 1608) {
									anIntArray370[anInt3876++] = local137.anInt2120;
									return;
								}
								if (arg0 == 1609) {
									anIntArray370[anInt3876++] = local137.anInt2131;
									return;
								}
								if (arg0 == 1610) {
									anIntArray370[anInt3876++] = local137.anInt2108;
									return;
								}
								if (arg0 == 1611) {
									anIntArray370[anInt3876++] = local137.anInt2142;
									return;
								}
								if (arg0 == 1612) {
									anIntArray370[anInt3876++] = local137.anInt2118;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray370[--anInt3876];
									local3017 = Static53.aClass32_1.method724(local19);
									if (local3017.method148()) {
										aStringArray26[anInt3875++] = local137.method1583(local3017.aString3, local19);
										return;
									}
									anIntArray370[anInt3876++] = local137.method1582(local3017.anInt200, local19);
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass68_7 : aClass68_6;
								if (arg0 == 1700) {
									anIntArray370[anInt3876++] = local137.anInt2136;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt2136 != -1) {
										anIntArray370[anInt3876++] = local137.anInt2106;
										return;
									}
									anIntArray370[anInt3876++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray370[anInt3876++] = local137.anInt2188;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass68_7 : aClass68_6;
								if (arg0 == 1800) {
									anIntArray370[anInt3876++] = Static55.method1059(local137).method4026();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray370[--anInt3876];
									local19--;
									if (local137.aStringArray13 != null && local19 < local137.aStringArray13.length && local137.aStringArray13[local19] != null) {
										aStringArray26[anInt3875++] = local137.aStringArray13[local19];
										return;
									}
									aStringArray26[anInt3875++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString18 == null) {
										aStringArray26[anInt3875++] = "";
										return;
									}
									aStringArray26[anInt3875++] = local137.aString18;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static300.method4351(anIntArray370[--anInt3876]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass68_7 : aClass68_6;
								}
								if (anInt3879 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray5 == null) {
										return;
									}
									@Pc(3254) Class1_Sub10 local3254 = new Class1_Sub10();
									local3254.aClass68_3 = local137;
									local3254.anObjectArray2 = local137.anObjectArray5;
									local3254.anInt1365 = anInt3879 + 1;
									Static106.aClass203_11.method4551(local3254);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static300.method4351(anIntArray370[--anInt3876]);
								if (arg0 == 2500) {
									anIntArray370[anInt3876++] = local137.anInt2170;
									return;
								}
								if (arg0 == 2501) {
									anIntArray370[anInt3876++] = local137.anInt2175;
									return;
								}
								if (arg0 == 2502) {
									anIntArray370[anInt3876++] = local137.anInt2107;
									return;
								}
								if (arg0 == 2503) {
									anIntArray370[anInt3876++] = local137.anInt2149;
									return;
								}
								if (arg0 == 2504) {
									anIntArray370[anInt3876++] = local137.aBoolean136 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray370[anInt3876++] = local137.anInt2129;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static420.method3351(local137);
									anIntArray370[anInt3876++] = local158 == null ? -1 : local158.anInt2135;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static300.method4351(anIntArray370[--anInt3876]);
								if (arg0 == 2600) {
									anIntArray370[anInt3876++] = local137.anInt2124;
									return;
								}
								if (arg0 == 2601) {
									anIntArray370[anInt3876++] = local137.anInt2125;
									return;
								}
								if (arg0 == 2602) {
									aStringArray26[anInt3875++] = local137.aString23;
									return;
								}
								if (arg0 == 2603) {
									anIntArray370[anInt3876++] = local137.anInt2130;
									return;
								}
								if (arg0 == 2604) {
									anIntArray370[anInt3876++] = local137.anInt2122;
									return;
								}
								if (arg0 == 2605) {
									anIntArray370[anInt3876++] = local137.anInt2112;
									return;
								}
								if (arg0 == 2606) {
									anIntArray370[anInt3876++] = local137.anInt2167;
									return;
								}
								if (arg0 == 2607) {
									anIntArray370[anInt3876++] = local137.anInt2182;
									return;
								}
								if (arg0 == 2608) {
									anIntArray370[anInt3876++] = local137.anInt2120;
									return;
								}
								if (arg0 == 2609) {
									anIntArray370[anInt3876++] = local137.anInt2131;
									return;
								}
								if (arg0 == 2610) {
									anIntArray370[anInt3876++] = local137.anInt2108;
									return;
								}
								if (arg0 == 2611) {
									anIntArray370[anInt3876++] = local137.anInt2142;
									return;
								}
								if (arg0 == 2612) {
									anIntArray370[anInt3876++] = local137.anInt2118;
									return;
								}
							} else {
								@Pc(3751) Class1_Sub39 local3751;
								@Pc(3649) Class1_Sub39 local3649;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static300.method4351(anIntArray370[--anInt3876]);
										anIntArray370[anInt3876++] = local137.anInt2136;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static300.method4351(anIntArray370[--anInt3876]);
										if (local137.anInt2136 != -1) {
											anIntArray370[anInt3876++] = local137.anInt2106;
											return;
										}
										anIntArray370[anInt3876++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray370[--anInt3876];
										local3649 = (Class1_Sub39) Static177.aClass38_18.method765((long) local13);
										if (local3649 != null) {
											anIntArray370[anInt3876++] = 1;
											return;
										}
										anIntArray370[anInt3876++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static300.method4351(anIntArray370[--anInt3876]);
										if (local137.aClass68Array2 == null) {
											anIntArray370[anInt3876++] = 0;
											return;
										}
										local19 = local137.aClass68Array2.length;
										for (local25 = 0; local25 < local137.aClass68Array2.length; local25++) {
											if (local137.aClass68Array2[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray370[anInt3876++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt3876 -= 2;
										local13 = anIntArray370[anInt3876];
										local19 = anIntArray370[anInt3876 + 1];
										local3751 = (Class1_Sub39) Static177.aClass38_18.method765((long) local13);
										if (local3751 != null && local3751.anInt6172 == local19) {
											anIntArray370[anInt3876++] = 1;
											return;
										}
										anIntArray370[anInt3876++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static300.method4351(anIntArray370[--anInt3876]);
									if (arg0 == 2800) {
										anIntArray370[anInt3876++] = Static55.method1059(local137).method4026();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray370[--anInt3876];
										local19--;
										if (local137.aStringArray13 != null && local19 < local137.aStringArray13.length && local137.aStringArray13[local19] != null) {
											aStringArray26[anInt3875++] = local137.aStringArray13[local19];
											return;
										}
										aStringArray26[anInt3875++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString18 == null) {
											aStringArray26[anInt3875++] = "";
											return;
										}
										aStringArray26[anInt3875++] = local137.aString18;
										return;
									}
								} else {
									@Pc(3888) String local3888;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local3888 = aStringArray26[--anInt3875];
											Static192.method3105(local3888);
											return;
										}
										if (arg0 == 3101) {
											anInt3876 -= 2;
											Static294.method4272(anIntArray370[anInt3876], anIntArray370[anInt3876 + 1], Static429.aClass30_Sub1_Sub1_Sub2_2);
											return;
										}
										if (arg0 == 3103) {
											Static155.method2612();
											return;
										}
										if (arg0 == 3104) {
											local3888 = aStringArray26[--anInt3875];
											local19 = 0;
											if (Static437.method5877(local3888)) {
												local19 = Static293.method3599(local3888);
											}
											Static32.method677(Static85.aClass177_30);
											Static433.aClass1_Sub3_Sub1_11.method1197(local19);
											return;
										}
										if (arg0 == 3105) {
											local3888 = aStringArray26[--anInt3875];
											Static32.method677(Static127.aClass177_41);
											Static433.aClass1_Sub3_Sub1_11.method1208(local3888.length() + 1);
											Static433.aClass1_Sub3_Sub1_11.method1190(local3888);
											return;
										}
										if (arg0 == 3106) {
											local3888 = aStringArray26[--anInt3875];
											Static32.method677(Static211.aClass177_53);
											Static433.aClass1_Sub3_Sub1_11.method1208(local3888.length() + 1);
											Static433.aClass1_Sub3_Sub1_11.method1190(local3888);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray370[--anInt3876];
											local1101 = aStringArray26[--anInt3875];
											Static96.method1656(local13, local1101);
											return;
										}
										if (arg0 == 3108) {
											anInt3876 -= 3;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											local25 = anIntArray370[anInt3876 + 2];
											local35 = Static300.method4351(local25);
											Static199.method3193(local35, local13, local19);
											return;
										}
										if (arg0 == 3109) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											local210 = arg1 ? aClass68_7 : aClass68_6;
											Static199.method3193(local210, local13, local19);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray370[--anInt3876];
											Static32.method677(Static279.aClass177_79);
											Static433.aClass1_Sub3_Sub1_11.method1227(local13);
											return;
										}
										if (arg0 == 3111) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											local3751 = (Class1_Sub39) Static177.aClass38_18.method765((long) local13);
											if (local3751 != null) {
												Static285.method4176(local3751, true, local3751.anInt6172 != local19);
											}
											Static195.method3156(3, local13, true, local19);
											return;
										}
										if (arg0 == 3112) {
											anInt3876--;
											local13 = anIntArray370[anInt3876];
											local3649 = (Class1_Sub39) Static177.aClass38_18.method765((long) local13);
											if (local3649 != null && local3649.anInt6174 == 3) {
												Static285.method4176(local3649, true, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static297.method4310(aStringArray26[--anInt3875]);
											return;
										}
										if (arg0 == 3114) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											local1488 = aStringArray26[--anInt3875];
											Static227.method3471("", local19, local1488, local13, "");
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt3876 -= 3;
											Static298.method4341(anIntArray370[anInt3876], 255, anIntArray370[anInt3876 + 1], anIntArray370[anInt3876 + 2]);
											return;
										}
										if (arg0 == 3201) {
											Static356.method5670(255, anIntArray370[--anInt3876], 50);
											return;
										}
										if (arg0 == 3202) {
											anInt3876 -= 2;
											Static231.method3515(255, anIntArray370[anInt3876 + 1], anIntArray370[anInt3876]);
											return;
										}
										if (arg0 == 3203) {
											anInt3876 -= 4;
											Static298.method4341(anIntArray370[anInt3876], anIntArray370[anInt3876 + 3], anIntArray370[anInt3876 + 1], anIntArray370[anInt3876 + 2]);
											return;
										}
										if (arg0 == 3204) {
											anInt3876 -= 3;
											Static356.method5670(anIntArray370[anInt3876 + 1], anIntArray370[anInt3876], anIntArray370[anInt3876 + 2]);
											return;
										}
										if (arg0 == 3205) {
											anInt3876 -= 3;
											Static231.method3515(anIntArray370[anInt3876 + 2], anIntArray370[anInt3876 + 1], anIntArray370[anInt3876]);
											return;
										}
										if (arg0 == 3206) {
											anInt3876 -= 4;
											Static131.method2159(anIntArray370[anInt3876 + 1], anIntArray370[anInt3876 + 3], anIntArray370[anInt3876 + 2], anIntArray370[anInt3876]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray370[anInt3876++] = Static187.anInt3975;
											return;
										}
										if (arg0 == 3301) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = Static241.method3634(local19, local13, false);
											return;
										}
										if (arg0 == 3302) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = Static199.method3192(local13, local19, false);
											return;
										}
										if (arg0 == 3303) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = Static164.method5053(local19, local13, false);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = Static430.aClass174_24.method3818(local13).anInt6388;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = Static365.anIntArray617[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = Static240.anIntArray442[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = Static2.anIntArray5[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(4605) byte local4605 = Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102;
											local19 = (Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490 >> 7) + Static278.anInt5374;
											local25 = (Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488 >> 7) + Static380.anInt6896;
											anIntArray370[anInt3876++] = (local4605 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray370[anInt3876++] = Static94.aBoolean149 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = Static241.method3634(local19, local13, true);
											return;
										}
										if (arg0 == 3314) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = Static199.method3192(local13, local19, true);
											return;
										}
										if (arg0 == 3315) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = Static164.method5053(local19, local13, true);
											return;
										}
										if (arg0 == 3316) {
											if (Static41.anInt1052 >= 2) {
												anIntArray370[anInt3876++] = Static41.anInt1052;
												return;
											}
											anIntArray370[anInt3876++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray370[anInt3876++] = Static162.anInt3420;
											return;
										}
										if (arg0 == 3318) {
											anIntArray370[anInt3876++] = Static156.aClass35_9.anInt1006;
											return;
										}
										if (arg0 == 3321) {
											anIntArray370[anInt3876++] = Static54.anInt1412;
											return;
										}
										if (arg0 == 3322) {
											anIntArray370[anInt3876++] = Static365.anInt6681;
											return;
										}
										if (arg0 == 3323) {
											if (Static387.anInt7074 >= 5 && Static387.anInt7074 <= 9) {
												anIntArray370[anInt3876++] = 1;
												return;
											}
											anIntArray370[anInt3876++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static387.anInt7074 >= 5 && Static387.anInt7074 <= 9) {
												anIntArray370[anInt3876++] = Static387.anInt7074;
												return;
											}
											anIntArray370[anInt3876++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray370[anInt3876++] = Static346.aBoolean406 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray370[anInt3876++] = Static429.aClass30_Sub1_Sub1_Sub2_2.anInt1348;
											return;
										}
										if (arg0 == 3327) {
											anIntArray370[anInt3876++] = Static429.aClass30_Sub1_Sub1_Sub2_2.aClass210_1.aBoolean394 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray370[anInt3876++] = Static11.aBoolean7 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = Static75.method1399(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = Static424.method5760(local19, false, local13);
											return;
										}
										if (arg0 == 3332) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = Static424.method5760(local19, true, local13);
											return;
										}
										if (arg0 == 3333) {
											anIntArray370[anInt3876++] = Static39.anInt1015;
											return;
										}
										if (arg0 == 3335) {
											anIntArray370[anInt3876++] = Static365.anInt6682;
											return;
										}
										if (arg0 == 3336) {
											anInt3876 -= 4;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											local25 = anIntArray370[anInt3876 + 2];
											local353 = anIntArray370[anInt3876 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local353;
											anIntArray370[anInt3876++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray370[anInt3876++] = Static2.anInt47;
											return;
										}
										if (arg0 == 3338) {
											anIntArray370[anInt3876++] = Static236.method3593();
											return;
										}
										if (arg0 == 3339) {
											anIntArray370[anInt3876++] = Static341.aBoolean397 ? 1 : 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray370[anInt3876++] = Static266.aBoolean321 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray370[anInt3876++] = Static404.aBoolean347 ? 1 : 0;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5261) Class216 local5261;
										if (arg0 == 3400) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											local5261 = Static118.aClass145_3.method3324(local13);
											aStringArray26[anInt3875++] = local5261.method4949(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt3876 -= 4;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											local25 = anIntArray370[anInt3876 + 2];
											local353 = anIntArray370[anInt3876 + 3];
											@Pc(5307) Class216 local5307 = Static118.aClass145_3.method3324(local25);
											if (local5307.aChar4 == local13 && local5307.aChar3 == local19) {
												if (local19 == 115) {
													aStringArray26[anInt3875++] = local5307.method4949(local353);
													return;
												}
												anIntArray370[anInt3876++] = local5307.method4943(local353);
												return;
											}
											throw new RuntimeException("C3408-1");
										}
										if (arg0 == 3409) {
											anInt3876 -= 3;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											local25 = anIntArray370[anInt3876 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(5383) Class216 local5383 = Static118.aClass145_3.method3324(local19);
											if (local5383.aChar3 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray370[anInt3876++] = local5383.method4941(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray370[--anInt3876];
											local1101 = aStringArray26[--anInt3875];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5261 = Static118.aClass145_3.method3324(local13);
											if (local5261.aChar3 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray370[anInt3876++] = local5261.method4947(local1101) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray370[--anInt3876];
											@Pc(5481) Class216 local5481 = Static118.aClass145_3.method3324(local13);
											anIntArray370[anInt3876++] = local5481.aClass38_31.method770();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static169.anInt3490 == 0) {
												anIntArray370[anInt3876++] = -2;
												return;
											}
											if (Static169.anInt3490 == 1) {
												anIntArray370[anInt3876++] = -1;
												return;
											}
											anIntArray370[anInt3876++] = Static323.anInt5975;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray370[--anInt3876];
											if (Static169.anInt3490 == 2 && local13 < Static323.anInt5975) {
												aStringArray26[anInt3875++] = Static169.aStringArray24[local13];
												if (Static318.aStringArray37[local13] != null) {
													aStringArray26[anInt3875++] = Static318.aStringArray37[local13];
													return;
												}
												aStringArray26[anInt3875++] = "";
												return;
											}
											aStringArray26[anInt3875++] = "";
											aStringArray26[anInt3875++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray370[--anInt3876];
											if (Static169.anInt3490 == 2 && local13 < Static323.anInt5975) {
												anIntArray370[anInt3876++] = Static30.anIntArray50[local13];
												return;
											}
											anIntArray370[anInt3876++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray370[--anInt3876];
											if (Static169.anInt3490 == 2 && local13 < Static323.anInt5975) {
												anIntArray370[anInt3876++] = Static152.anIntArray332[local13];
												return;
											}
											anIntArray370[anInt3876++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local3888 = aStringArray26[--anInt3875];
											local19 = anIntArray370[--anInt3876];
											Static194.method3152(local19, local3888);
											return;
										}
										if (arg0 == 3605) {
											local3888 = aStringArray26[--anInt3875];
											Static342.method4815(local3888);
											return;
										}
										if (arg0 == 3606) {
											local3888 = aStringArray26[--anInt3875];
											Static302.method4388(local3888);
											return;
										}
										if (arg0 == 3607) {
											local3888 = aStringArray26[--anInt3875];
											Static11.method131(false, local3888);
											return;
										}
										if (arg0 == 3608) {
											local3888 = aStringArray26[--anInt3875];
											Static125.method2047(local3888);
											return;
										}
										if (arg0 == 3609) {
											local3888 = aStringArray26[--anInt3875];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray370[anInt3876++] = Static117.method1927(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray370[--anInt3876];
											if (Static169.anInt3490 == 2 && local13 < Static323.anInt5975) {
												aStringArray26[anInt3875++] = Static416.aStringArray44[local13];
												return;
											}
											aStringArray26[anInt3875++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static364.aString59 != null) {
												aStringArray26[anInt3875++] = Static437.method5883(Static364.aString59);
												return;
											}
											aStringArray26[anInt3875++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static364.aString59 != null) {
												anIntArray370[anInt3876++] = Static84.anInt2030;
												return;
											}
											anIntArray370[anInt3876++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray370[--anInt3876];
											if (Static364.aString59 != null && local13 < Static84.anInt2030) {
												aStringArray26[anInt3875++] = Static216.aClass186Array1[local13].aString47;
												return;
											}
											aStringArray26[anInt3875++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray370[--anInt3876];
											if (Static364.aString59 != null && local13 < Static84.anInt2030) {
												anIntArray370[anInt3876++] = Static216.aClass186Array1[local13].anInt5502;
												return;
											}
											anIntArray370[anInt3876++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray370[--anInt3876];
											if (Static364.aString59 != null && local13 < Static84.anInt2030) {
												anIntArray370[anInt3876++] = Static216.aClass186Array1[local13].aByte71;
												return;
											}
											anIntArray370[anInt3876++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray370[anInt3876++] = Static122.aByte46;
											return;
										}
										if (arg0 == 3617) {
											local3888 = aStringArray26[--anInt3875];
											Static24.method499(local3888);
											return;
										}
										if (arg0 == 3618) {
											anIntArray370[anInt3876++] = Static60.aByte36;
											return;
										}
										if (arg0 == 3619) {
											local3888 = aStringArray26[--anInt3875];
											Static393.method5441(local3888);
											return;
										}
										if (arg0 == 3620) {
											Static415.method5632();
											return;
										}
										if (arg0 == 3621) {
											if (Static169.anInt3490 == 0) {
												anIntArray370[anInt3876++] = -1;
												return;
											}
											anIntArray370[anInt3876++] = Static223.anInt4457;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray370[--anInt3876];
											if (Static169.anInt3490 != 0 && local13 < Static223.anInt4457) {
												aStringArray26[anInt3875++] = Static406.aStringArray30[local13];
												if (Static244.aStringArray31[local13] != null) {
													aStringArray26[anInt3875++] = Static244.aStringArray31[local13];
													return;
												}
												aStringArray26[anInt3875++] = "";
												return;
											}
											aStringArray26[anInt3875++] = "";
											aStringArray26[anInt3875++] = "";
											return;
										}
										if (arg0 == 3623) {
											local3888 = aStringArray26[--anInt3875];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray370[anInt3876++] = Static64.method1237(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray370[--anInt3876];
											if (Static216.aClass186Array1 != null && local13 < Static84.anInt2030 && Static216.aClass186Array1[local13].aString46.equalsIgnoreCase(Static429.aClass30_Sub1_Sub1_Sub2_2.aString9)) {
												anIntArray370[anInt3876++] = 1;
												return;
											}
											anIntArray370[anInt3876++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static306.aString52 != null) {
												aStringArray26[anInt3875++] = Static306.aString52;
												return;
											}
											aStringArray26[anInt3875++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray370[--anInt3876];
											if (Static364.aString59 != null && local13 < Static84.anInt2030) {
												aStringArray26[anInt3875++] = Static216.aClass186Array1[local13].aString49;
												return;
											}
											aStringArray26[anInt3875++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray370[--anInt3876];
											if (Static169.anInt3490 == 2 && local13 >= 0 && local13 < Static323.anInt5975) {
												anIntArray370[anInt3876++] = Static258.aBooleanArray18[local13] ? 1 : 0;
												return;
											}
											anIntArray370[anInt3876++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local3888 = aStringArray26[--anInt3875];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray370[anInt3876++] = Static447.method6071(local3888);
											return;
										}
										if (arg0 == 3629) {
											anIntArray370[anInt3876++] = Static284.anInt3192;
											return;
										}
										if (arg0 == 3630) {
											local3888 = aStringArray26[--anInt3875];
											Static11.method131(true, local3888);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = Static340.aBooleanArray21[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray370[--anInt3876];
											if (Static364.aString59 != null && local13 < Static84.anInt2030) {
												aStringArray26[anInt3875++] = Static216.aClass186Array1[local13].aString46;
												return;
											}
											aStringArray26[anInt3875++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray370[--anInt3876];
											if (Static169.anInt3490 != 0 && local13 < Static223.anInt4457) {
												aStringArray26[anInt3875++] = Static325.aStringArray38[local13];
												return;
											}
											aStringArray26[anInt3875++] = "";
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = Static450.aClass67Array1[local13].method1565();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = Static450.aClass67Array1[local13].anInt2092;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = Static450.aClass67Array1[local13].anInt2093;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = Static450.aClass67Array1[local13].anInt2094;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = Static450.aClass67Array1[local13].anInt2096;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = Static450.aClass67Array1[local13].anInt2089;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray370[--anInt3876];
											local19 = Static450.aClass67Array1[local13].method1563();
											anIntArray370[anInt3876++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray370[--anInt3876];
											local19 = Static450.aClass67Array1[local13].method1563();
											anIntArray370[anInt3876++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray370[--anInt3876];
											local19 = Static450.aClass67Array1[local13].method1563();
											anIntArray370[anInt3876++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray370[--anInt3876];
											local19 = Static450.aClass67Array1[local13].method1563();
											anIntArray370[anInt3876++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else if (arg0 < 4100) {
										if (arg0 == 4000) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = local13 + local19;
											return;
										}
										if (arg0 == 4001) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = local13 - local19;
											return;
										}
										if (arg0 == 4002) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = local13 * local19;
											return;
										}
										if (arg0 == 4003) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = local13 / local19;
											return;
										}
										if (arg0 == 4004) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = (int) (Math.random() * (double) local13);
											return;
										}
										if (arg0 == 4005) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = (int) (Math.random() * (double) (local13 + 1));
											return;
										}
										if (arg0 == 4006) {
											anInt3876 -= 5;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											local25 = anIntArray370[anInt3876 + 2];
											local353 = anIntArray370[anInt3876 + 3];
											local2290 = anIntArray370[anInt3876 + 4];
											anIntArray370[anInt3876++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
											return;
										}
										@Pc(6991) long local6991;
										@Pc(6984) long local6984;
										if (arg0 == 4007) {
											anInt3876 -= 2;
											local6984 = anIntArray370[anInt3876];
											local6991 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = (int) (local6984 + local6984 * local6991 / 100L);
											return;
										}
										if (arg0 == 4008) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = local13 | 0x1 << local19;
											return;
										}
										if (arg0 == 4009) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = local13 & -(0x1 << local19) - 1;
											return;
										}
										if (arg0 == 4010) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
											return;
										}
										if (arg0 == 4011) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = local13 % local19;
											return;
										}
										if (arg0 == 4012) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											if (local13 == 0) {
												anIntArray370[anInt3876++] = 0;
												return;
											}
											anIntArray370[anInt3876++] = (int) Math.pow((double) local13, (double) local19);
											return;
										}
										if (arg0 == 4013) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											if (local13 == 0) {
												anIntArray370[anInt3876++] = 0;
												return;
											}
											if (local19 == 0) {
												anIntArray370[anInt3876++] = Integer.MAX_VALUE;
												return;
											}
											anIntArray370[anInt3876++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
											return;
										}
										if (arg0 == 4014) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = local13 & local19;
											return;
										}
										if (arg0 == 4015) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = local13 | local19;
											return;
										}
										if (arg0 == 4016) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = local13 < local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4017) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = local13 > local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4018) {
											anInt3876 -= 3;
											local6984 = anIntArray370[anInt3876];
											local6991 = anIntArray370[anInt3876 + 1];
											@Pc(7372) long local7372 = (long) anIntArray370[anInt3876 + 2];
											anIntArray370[anInt3876++] = (int) (local6984 * local7372 / local6991);
											return;
										}
									} else if (arg0 < 4200) {
										if (arg0 == 4100) {
											local3888 = aStringArray26[--anInt3875];
											local19 = anIntArray370[--anInt3876];
											aStringArray26[anInt3875++] = local3888 + local19;
											return;
										}
										if (arg0 == 4101) {
											anInt3875 -= 2;
											local3888 = aStringArray26[anInt3875];
											local1101 = aStringArray26[anInt3875 + 1];
											aStringArray26[anInt3875++] = local3888 + local1101;
											return;
										}
										if (arg0 == 4102) {
											local3888 = aStringArray26[--anInt3875];
											local19 = anIntArray370[--anInt3876];
											aStringArray26[anInt3875++] = local3888 + Static96.method1657(local19);
											return;
										}
										if (arg0 == 4103) {
											local3888 = aStringArray26[--anInt3875];
											aStringArray26[anInt3875++] = local3888.toLowerCase();
											return;
										}
										if (arg0 == 4104) {
											aStringArray26[anInt3875++] = method3001(anIntArray370[--anInt3876]);
											return;
										}
										if (arg0 == 4105) {
											anInt3875 -= 2;
											local3888 = aStringArray26[anInt3875];
											local1101 = aStringArray26[anInt3875 + 1];
											if (Static429.aClass30_Sub1_Sub1_Sub2_2.aClass210_1 != null && Static429.aClass30_Sub1_Sub1_Sub2_2.aClass210_1.aBoolean394) {
												aStringArray26[anInt3875++] = local1101;
												return;
											}
											aStringArray26[anInt3875++] = local3888;
											return;
										}
										if (arg0 == 4106) {
											local13 = anIntArray370[--anInt3876];
											aStringArray26[anInt3875++] = Integer.toString(local13);
											return;
										}
										if (arg0 == 4107) {
											anInt3875 -= 2;
											anIntArray370[anInt3876++] = Static39.method743(aStringArray26[anInt3875 + 1], Static365.anInt6682, aStringArray26[anInt3875]);
											return;
										}
										@Pc(7655) Class209 local7655;
										if (arg0 == 4108) {
											local3888 = aStringArray26[--anInt3875];
											anInt3876 -= 2;
											local19 = anIntArray370[anInt3876];
											local25 = anIntArray370[anInt3876 + 1];
											local7655 = Static341.method4804(Static24.aClass211_8, local25);
											anIntArray370[anInt3876++] = local7655.method4688(Static184.aClass137Array8, local19, local3888);
											return;
										}
										if (arg0 == 4109) {
											local3888 = aStringArray26[--anInt3875];
											anInt3876 -= 2;
											local19 = anIntArray370[anInt3876];
											local25 = anIntArray370[anInt3876 + 1];
											local7655 = Static341.method4804(Static24.aClass211_8, local25);
											anIntArray370[anInt3876++] = local7655.method4686(local3888, local19, Static184.aClass137Array8);
											return;
										}
										if (arg0 == 4110) {
											anInt3875 -= 2;
											local3888 = aStringArray26[anInt3875];
											local1101 = aStringArray26[anInt3875 + 1];
											if (anIntArray370[--anInt3876] == 1) {
												aStringArray26[anInt3875++] = local3888;
												return;
											}
											aStringArray26[anInt3875++] = local1101;
											return;
										}
										if (arg0 == 4111) {
											local3888 = aStringArray26[--anInt3875];
											aStringArray26[anInt3875++] = Static116.method1885(local3888);
											return;
										}
										if (arg0 == 4112) {
											local3888 = aStringArray26[--anInt3875];
											local19 = anIntArray370[--anInt3876];
											if (local19 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray26[anInt3875++] = local3888 + (char) local19;
											return;
										}
										if (arg0 == 4113) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = Static81.method1502((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4114) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = Static267.method3958((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4115) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = Static92.method1576((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4116) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = Static127.method2085((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4117) {
											local3888 = aStringArray26[--anInt3875];
											if (local3888 != null) {
												anIntArray370[anInt3876++] = local3888.length();
												return;
											}
											anIntArray370[anInt3876++] = 0;
											return;
										}
										if (arg0 == 4118) {
											local3888 = aStringArray26[--anInt3875];
											anInt3876 -= 2;
											local19 = anIntArray370[anInt3876];
											local25 = anIntArray370[anInt3876 + 1];
											aStringArray26[anInt3875++] = local3888.substring(local19, local25);
											return;
										}
										if (arg0 == 4119) {
											local3888 = aStringArray26[--anInt3875];
											@Pc(8018) StringBuffer local8018 = new StringBuffer(local3888.length());
											@Pc(8020) boolean local8020 = false;
											for (local353 = 0; local353 < local3888.length(); local353++) {
												@Pc(8027) char local8027 = local3888.charAt(local353);
												if (local8027 == '<') {
													local8020 = true;
												} else if (local8027 == '>') {
													local8020 = false;
												} else if (!local8020) {
													local8018.append(local8027);
												}
											}
											aStringArray26[anInt3875++] = local8018.toString();
											return;
										}
										if (arg0 == 4120) {
											local3888 = aStringArray26[--anInt3875];
											anInt3876 -= 2;
											local19 = anIntArray370[anInt3876];
											local25 = anIntArray370[anInt3876 + 1];
											anIntArray370[anInt3876++] = local3888.indexOf(local19, local25);
											return;
										}
										if (arg0 == 4121) {
											anInt3875 -= 2;
											local3888 = aStringArray26[anInt3875];
											local1101 = aStringArray26[anInt3875 + 1];
											local25 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = local3888.indexOf(local1101, local25);
											return;
										}
										if (arg0 == 4122) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = Character.toLowerCase((char) local13);
											return;
										}
										if (arg0 == 4123) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = Character.toUpperCase((char) local13);
											return;
										}
										if (arg0 == 4124) {
											local412 = anIntArray370[--anInt3876] != 0;
											local19 = anIntArray370[--anInt3876];
											aStringArray26[anInt3875++] = Static319.method1370(0, local412, Static365.anInt6682, (long) local19);
											return;
										}
										if (arg0 == 4125) {
											local3888 = aStringArray26[--anInt3875];
											local19 = anIntArray370[--anInt3876];
											@Pc(8241) Class209 local8241 = Static341.method4804(Static24.aClass211_8, local19);
											anIntArray370[anInt3876++] = local8241.method4687(local3888, Static184.aClass137Array8);
											return;
										}
									} else if (arg0 < 4300) {
										if (arg0 == 4200) {
											local13 = anIntArray370[--anInt3876];
											aStringArray26[anInt3875++] = Static43.aClass57_1.method1414(local13).aString37;
											return;
										}
										@Pc(8303) Class168 local8303;
										if (arg0 == 4201) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											local8303 = Static43.aClass57_1.method1414(local13);
											if (local19 >= 1 && local19 <= 5 && local8303.aStringArray33[local19 - 1] != null) {
												aStringArray26[anInt3875++] = local8303.aStringArray33[local19 - 1];
												return;
											}
											aStringArray26[anInt3875++] = "";
											return;
										}
										if (arg0 == 4202) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											local8303 = Static43.aClass57_1.method1414(local13);
											if (local19 >= 1 && local19 <= 5 && local8303.aStringArray32[local19 - 1] != null) {
												aStringArray26[anInt3875++] = local8303.aStringArray32[local19 - 1];
												return;
											}
											aStringArray26[anInt3875++] = "";
											return;
										}
										if (arg0 == 4203) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = Static43.aClass57_1.method1414(local13).anInt4845;
											return;
										}
										if (arg0 == 4204) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = Static43.aClass57_1.method1414(local13).anInt4854 == 1 ? 1 : 0;
											return;
										}
										@Pc(8466) Class168 local8466;
										if (arg0 == 4205) {
											local13 = anIntArray370[--anInt3876];
											local8466 = Static43.aClass57_1.method1414(local13);
											if (local8466.anInt4878 == -1 && local8466.anInt4874 >= 0) {
												anIntArray370[anInt3876++] = local8466.anInt4874;
												return;
											}
											anIntArray370[anInt3876++] = local13;
											return;
										}
										if (arg0 == 4206) {
											local13 = anIntArray370[--anInt3876];
											local8466 = Static43.aClass57_1.method1414(local13);
											if (local8466.anInt4878 >= 0 && local8466.anInt4874 >= 0) {
												anIntArray370[anInt3876++] = local8466.anInt4874;
												return;
											}
											anIntArray370[anInt3876++] = local13;
											return;
										}
										if (arg0 == 4207) {
											local13 = anIntArray370[--anInt3876];
											anIntArray370[anInt3876++] = Static43.aClass57_1.method1414(local13).aBoolean309 ? 1 : 0;
											return;
										}
										if (arg0 == 4208) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											local3017 = Static53.aClass32_1.method724(local19);
											if (local3017.method148()) {
												aStringArray26[anInt3875++] = Static43.aClass57_1.method1414(local13).method3726(local3017.aString3, local19);
												return;
											}
											anIntArray370[anInt3876++] = Static43.aClass57_1.method1414(local13).method3725(local3017.anInt200, local19);
											return;
										}
										if (arg0 == 4209) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1] - 1;
											local8303 = Static43.aClass57_1.method1414(local13);
											if (local8303.anInt4882 == local19) {
												anIntArray370[anInt3876++] = local8303.anInt4819;
												return;
											}
											if (local8303.anInt4825 == local19) {
												anIntArray370[anInt3876++] = local8303.anInt4867;
												return;
											}
											anIntArray370[anInt3876++] = -1;
											return;
										}
										if (arg0 == 4210) {
											local3888 = aStringArray26[--anInt3875];
											local19 = anIntArray370[--anInt3876];
											Static93.method5018(local19 == 1, local3888);
											anIntArray370[anInt3876++] = Static343.anInt6320;
											return;
										}
										if (arg0 == 4211) {
											if (Static314.aShortArray100 != null && Static230.anInt4555 < Static343.anInt6320) {
												anIntArray370[anInt3876++] = Static314.aShortArray100[Static230.anInt4555++] & 0xFFFF;
												return;
											}
											anIntArray370[anInt3876++] = -1;
											return;
										}
										if (arg0 == 4212) {
											Static230.anInt4555 = 0;
											return;
										}
									} else if (arg0 < 4400) {
										if (arg0 == 4300) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											local3017 = Static53.aClass32_1.method724(local19);
											if (local3017.method148()) {
												aStringArray26[anInt3875++] = Static300.aClass44_2.method999(local13).method142(local3017.aString3, local19);
												return;
											}
											anIntArray370[anInt3876++] = Static300.aClass44_2.method999(local13).method140(local19, local3017.anInt200);
											return;
										}
									} else if (arg0 < 4500) {
										if (arg0 == 4400) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											local3017 = Static53.aClass32_1.method724(local19);
											if (local3017.method148()) {
												aStringArray26[anInt3875++] = Static455.aClass161_4.method3628(local13).method4367(local19, local3017.aString3);
												return;
											}
											anIntArray370[anInt3876++] = Static455.aClass161_4.method3628(local13).method4366(local3017.anInt200, local19);
											return;
										}
									} else if (arg0 < 4600) {
										if (arg0 == 4500) {
											anInt3876 -= 2;
											local13 = anIntArray370[anInt3876];
											local19 = anIntArray370[anInt3876 + 1];
											local3017 = Static53.aClass32_1.method724(local19);
											if (local3017.method148()) {
												aStringArray26[anInt3875++] = Static257.aClass115_1.method2703(local13).method6135(local3017.aString3, local19);
												return;
											}
											anIntArray370[anInt3876++] = Static257.aClass115_1.method2703(local13).method6133(local3017.anInt200, local19);
											return;
										}
									} else if (arg0 < 4700 && arg0 == 4600) {
										local13 = anIntArray370[--anInt3876];
										@Pc(8967) Class212 local8967 = Static241.aClass258_1.method5771(local13);
										if (local8967.anIntArray588 != null && local8967.anIntArray588.length > 0) {
											local25 = 0;
											local353 = local8967.anIntArray587[0];
											for (local2290 = 1; local2290 < local8967.anIntArray588.length; local2290++) {
												if (local8967.anIntArray587[local2290] > local353) {
													local25 = local2290;
													local353 = local8967.anIntArray587[local2290];
												}
											}
											anIntArray370[anInt3876++] = local8967.anIntArray588[local25];
											return;
										}
										anIntArray370[anInt3876++] = local8967.anInt6263;
										return;
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static300.method4351(anIntArray370[--anInt3876]);
						} else {
							local137 = arg1 ? aClass68_7 : aClass68_6;
						}
						if (arg0 == 1300) {
							local19 = anIntArray370[--anInt3876] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method1575(local19, aStringArray26[--anInt3875]);
								return;
							}
							anInt3875--;
							return;
						}
						if (arg0 == 1301) {
							anInt3876 -= 2;
							local19 = anIntArray370[anInt3876];
							local25 = anIntArray370[anInt3876 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass68_4 = null;
								return;
							}
							local137.aClass68_4 = Static115.method1866(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray370[--anInt3876];
							if (local19 != Static221.anInt4419 && local19 != Static336.anInt6150 && local19 != Static434.anInt7638) {
								return;
							}
							local137.anInt2152 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt2121 = anIntArray370[--anInt3876];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt2164 = anIntArray370[--anInt3876];
							return;
						}
						if (arg0 == 1305) {
							local137.aString18 = aStringArray26[--anInt3875];
							return;
						}
						if (arg0 == 1306) {
							local137.aString21 = aStringArray26[--anInt3875];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray13 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt2154 = anIntArray370[--anInt3876];
							local137.anInt2139 = anIntArray370[--anInt3876];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray370[--anInt3876];
							local25 = anIntArray370[--anInt3876];
							if (local25 >= 1 && local25 <= 10) {
								local137.method1574(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString20 = aStringArray26[--anInt3875];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt2147 = anIntArray370[--anInt3876];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt3876 -= 3;
								local19 = anIntArray370[anInt3876] - 1;
								local25 = anIntArray370[anInt3876 + 1];
								local353 = anIntArray370[anInt3876 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt3876 -= 2;
								local19 = 10;
								local25 = anIntArray370[anInt3876];
								local353 = anIntArray370[anInt3876 + 1];
							}
							if (local137.aByteArray24 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray24 = new byte[11];
								local137.aByteArray25 = new byte[11];
								local137.anIntArray231 = new int[11];
							}
							local137.aByteArray24[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean139 = false;
								for (local2290 = 0; local2290 < local137.aByteArray24.length; local2290++) {
									if (local137.aByteArray24[local2290] != 0) {
										local137.aBoolean139 = true;
										break;
									}
								}
							} else {
								local137.aBoolean139 = true;
							}
							local137.aByteArray25[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt2114 = anIntArray370[--anInt3876];
							return;
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static300.method4351(anIntArray370[--anInt3876]);
					} else {
						local137 = arg1 ? aClass68_7 : aClass68_6;
					}
					Static446.method6042(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt3876 -= 2;
						local19 = anIntArray370[anInt3876];
						local25 = anIntArray370[anInt3876 + 1];
						if (local137.anInt2188 == -1) {
							Static387.method5397(local137.anInt2135);
							Static318.method4542(local137.anInt2135);
							Static154.method2421(local137.anInt2135);
						}
						if (local19 == -1) {
							local137.anInt2162 = 1;
							local137.anInt2176 = -1;
							local137.anInt2136 = -1;
							return;
						}
						local137.anInt2136 = local19;
						local137.anInt2106 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean133 = true;
						} else {
							local137.aBoolean133 = false;
						}
						@Pc(1630) Class168 local1630 = Static43.aClass57_1.method1414(local19);
						local137.anInt2167 = local1630.anInt4855;
						local137.anInt2120 = local1630.anInt4877;
						local137.anInt2182 = local1630.anInt4830;
						local137.anInt2108 = local1630.anInt4849;
						local137.anInt2142 = local1630.anInt4860;
						local137.anInt2112 = local1630.anInt4870;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt2165 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt2165 = 1;
						} else {
							local137.anInt2165 = 2;
						}
						if (local137.anInt2126 > 0) {
							local137.anInt2112 = local137.anInt2112 * 32 / local137.anInt2126;
							return;
						}
						if (local137.anInt2190 > 0) {
							local137.anInt2112 = local137.anInt2112 * 32 / local137.anInt2190;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt2162 = 2;
						local137.anInt2176 = anIntArray370[--anInt3876];
						if (local137.anInt2188 == -1) {
							Static234.method3566(local137.anInt2135);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt2162 = 3;
						local137.anInt2176 = -1;
						if (local137.anInt2188 == -1) {
							Static234.method3566(local137.anInt2135);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt2162 = 6;
						local137.anInt2176 = anIntArray370[--anInt3876];
						if (local137.anInt2188 == -1) {
							Static234.method3566(local137.anInt2135);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt2162 = 5;
						local137.anInt2176 = anIntArray370[--anInt3876];
						if (local137.anInt2188 == -1) {
							Static234.method3566(local137.anInt2135);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt3876 -= 4;
						local137.anInt2185 = anIntArray370[anInt3876];
						local137.anInt2146 = anIntArray370[anInt3876 + 1];
						local137.anInt2148 = anIntArray370[anInt3876 + 2];
						local137.anInt2158 = anIntArray370[anInt3876 + 3];
						Static446.method6042(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt3876 -= 2;
						local137.anInt2133 = anIntArray370[anInt3876];
						local137.anInt2168 = anIntArray370[anInt3876 + 1];
						Static446.method6042(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt3876 -= 4;
						local137.anInt2176 = anIntArray370[anInt3876];
						local137.anInt2127 = anIntArray370[anInt3876 + 1];
						if (anIntArray370[anInt3876 + 2] == 1) {
							local137.anInt2162 = 9;
						} else {
							local137.anInt2162 = 8;
						}
						if (anIntArray370[anInt3876 + 3] == 1) {
							local137.aBoolean133 = true;
						} else {
							local137.aBoolean133 = false;
						}
						if (local137.anInt2188 == -1) {
							Static234.method3566(local137.anInt2135);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt2162 = 5;
						local137.anInt2176 = Static32.anInt894;
						local137.anInt2127 = 0;
						if (local137.anInt2188 == -1) {
							Static234.method3566(local137.anInt2135);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static300.method4351(anIntArray370[--anInt3876]);
				} else {
					local137 = arg1 ? aClass68_7 : aClass68_6;
				}
				if (arg0 == 1000) {
					anInt3876 -= 4;
					local137.anInt2110 = anIntArray370[anInt3876];
					local137.anInt2132 = anIntArray370[anInt3876 + 1];
					local19 = anIntArray370[anInt3876 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray370[anInt3876 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte44 = (byte) local19;
					local137.aByte43 = (byte) local25;
					Static446.method6042(local137);
					Static366.method5104(local137);
					if (local137.anInt2188 == -1) {
						Static263.method3899(local137.anInt2135);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt3876 -= 4;
					local137.anInt2190 = anIntArray370[anInt3876];
					local137.anInt2179 = anIntArray370[anInt3876 + 1];
					local137.anInt2126 = 0;
					local137.anInt2145 = 0;
					local19 = anIntArray370[anInt3876 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray370[anInt3876 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte41 = (byte) local19;
					local137.aByte42 = (byte) local25;
					Static446.method6042(local137);
					Static366.method5104(local137);
					if (local137.anInt2153 == 0) {
						Static238.method3609(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray370[--anInt3876] == 1;
					if (local137.aBoolean136 != local620) {
						local137.aBoolean136 = local620;
						Static446.method6042(local137);
					}
					if (local137.anInt2188 == -1) {
						Static459.method6188(local137.anInt2135);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt3876 -= 2;
					local137.anInt2140 = anIntArray370[anInt3876];
					local137.anInt2099 = anIntArray370[anInt3876 + 1];
					Static446.method6042(local137);
					Static366.method5104(local137);
					if (local137.anInt2153 == 0) {
						Static238.method3609(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean137 = anIntArray370[--anInt3876] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method3008(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static41.anInt1052 == 0 && (Static400.aBoolean463 && !Static223.aBoolean279 || Static11.aBoolean7)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static74.aClass158_45.method3594(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static74.aClass158_45.method3594(0).length());
		} else if (local11.startsWith(Static337.aClass158_164.method3594(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static337.aClass158_164.method3594(0).length());
		} else if (local11.startsWith(Static72.aClass158_43.method3594(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static72.aClass158_43.method3594(0).length());
		} else if (local11.startsWith(Static1.aClass158_3.method3594(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static1.aClass158_3.method3594(0).length());
		} else if (local11.startsWith(Static13.aClass158_93.method3594(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static13.aClass158_93.method3594(0).length());
		} else if (local11.startsWith(Static401.aClass158_191.method3594(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static401.aClass158_191.method3594(0).length());
		} else if (local11.startsWith(Static310.aClass158_151.method3594(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static310.aClass158_151.method3594(0).length());
		} else if (local11.startsWith(Static229.aClass158_118.method3594(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static229.aClass158_118.method3594(0).length());
		} else if (local11.startsWith(Static82.aClass158_49.method3594(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static82.aClass158_49.method3594(0).length());
		} else if (local11.startsWith(Static109.aClass158_60.method3594(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static109.aClass158_60.method3594(0).length());
		} else if (local11.startsWith(Static294.aClass158_143.method3594(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static294.aClass158_143.method3594(0).length());
		} else if (local11.startsWith(Static320.aClass158_154.method3594(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static320.aClass158_154.method3594(0).length());
		} else if (Static365.anInt6682 != 0) {
			if (local11.startsWith(Static74.aClass158_45.method3594(Static365.anInt6682))) {
				local13 = 0;
				arg0 = arg0.substring(Static74.aClass158_45.method3594(Static365.anInt6682).length());
			} else if (local11.startsWith(Static337.aClass158_164.method3594(Static365.anInt6682))) {
				local13 = 1;
				arg0 = arg0.substring(Static337.aClass158_164.method3594(Static365.anInt6682).length());
			} else if (local11.startsWith(Static72.aClass158_43.method3594(Static365.anInt6682))) {
				local13 = 2;
				arg0 = arg0.substring(Static72.aClass158_43.method3594(Static365.anInt6682).length());
			} else if (local11.startsWith(Static1.aClass158_3.method3594(Static365.anInt6682))) {
				local13 = 3;
				arg0 = arg0.substring(Static1.aClass158_3.method3594(Static365.anInt6682).length());
			} else if (local11.startsWith(Static13.aClass158_93.method3594(Static365.anInt6682))) {
				local13 = 4;
				arg0 = arg0.substring(Static13.aClass158_93.method3594(Static365.anInt6682).length());
			} else if (local11.startsWith(Static401.aClass158_191.method3594(Static365.anInt6682))) {
				local13 = 5;
				arg0 = arg0.substring(Static401.aClass158_191.method3594(Static365.anInt6682).length());
			} else if (local11.startsWith(Static310.aClass158_151.method3594(Static365.anInt6682))) {
				local13 = 6;
				arg0 = arg0.substring(Static310.aClass158_151.method3594(Static365.anInt6682).length());
			} else if (local11.startsWith(Static229.aClass158_118.method3594(Static365.anInt6682))) {
				local13 = 7;
				arg0 = arg0.substring(Static229.aClass158_118.method3594(Static365.anInt6682).length());
			} else if (local11.startsWith(Static82.aClass158_49.method3594(Static365.anInt6682))) {
				local13 = 8;
				arg0 = arg0.substring(Static82.aClass158_49.method3594(Static365.anInt6682).length());
			} else if (local11.startsWith(Static109.aClass158_60.method3594(Static365.anInt6682))) {
				local13 = 9;
				arg0 = arg0.substring(Static109.aClass158_60.method3594(Static365.anInt6682).length());
			} else if (local11.startsWith(Static294.aClass158_143.method3594(Static365.anInt6682))) {
				local13 = 10;
				arg0 = arg0.substring(Static294.aClass158_143.method3594(Static365.anInt6682).length());
			} else if (local11.startsWith(Static320.aClass158_154.method3594(Static365.anInt6682))) {
				local13 = 11;
				arg0 = arg0.substring(Static320.aClass158_154.method3594(Static365.anInt6682).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static343.aClass158_167.method3594(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static343.aClass158_167.method3594(0).length());
		} else if (local11.startsWith(Static380.aClass158_181.method3594(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static380.aClass158_181.method3594(0).length());
		} else if (local11.startsWith(Static295.aClass158_144.method3594(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static295.aClass158_144.method3594(0).length());
		} else if (local11.startsWith(Static276.aClass158_137.method3594(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static276.aClass158_137.method3594(0).length());
		} else if (local11.startsWith(Static58.aClass158_30.method3594(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static58.aClass158_30.method3594(0).length());
		} else if (Static365.anInt6682 != 0) {
			if (local11.startsWith(Static343.aClass158_167.method3594(Static365.anInt6682))) {
				local451 = 1;
				arg0 = arg0.substring(Static343.aClass158_167.method3594(Static365.anInt6682).length());
			} else if (local11.startsWith(Static380.aClass158_181.method3594(Static365.anInt6682))) {
				local451 = 2;
				arg0 = arg0.substring(Static380.aClass158_181.method3594(Static365.anInt6682).length());
			} else if (local11.startsWith(Static295.aClass158_144.method3594(Static365.anInt6682))) {
				local451 = 3;
				arg0 = arg0.substring(Static295.aClass158_144.method3594(Static365.anInt6682).length());
			} else if (local11.startsWith(Static276.aClass158_137.method3594(Static365.anInt6682))) {
				local451 = 4;
				arg0 = arg0.substring(Static276.aClass158_137.method3594(Static365.anInt6682).length());
			} else if (local11.startsWith(Static58.aClass158_30.method3594(Static365.anInt6682))) {
				local451 = 5;
				arg0 = arg0.substring(Static58.aClass158_30.method3594(Static365.anInt6682).length());
			}
		}
		Static32.method677(Static433.aClass177_112);
		Static433.aClass1_Sub3_Sub1_11.method1208(0);
		@Pc(646) int local646 = Static433.aClass1_Sub3_Sub1_11.anInt1710;
		if (arg1 == 5021) {
			Static433.aClass1_Sub3_Sub1_11.method1208(1);
		} else if (arg1 == 5022) {
			Static433.aClass1_Sub3_Sub1_11.method1208(2);
		} else {
			Static433.aClass1_Sub3_Sub1_11.method1208(0);
		}
		Static433.aClass1_Sub3_Sub1_11.method1208(local13);
		Static433.aClass1_Sub3_Sub1_11.method1208(local451);
		Static143.method2293(arg0, Static433.aClass1_Sub3_Sub1_11);
		Static433.aClass1_Sub3_Sub1_11.method1185(Static433.aClass1_Sub3_Sub1_11.anInt1710 - local646);
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!ci;I)V")
	private static void method3010(@OriginalArg(0) Class1_Sub10 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray2;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class1_Sub1_Sub9 local12 = Static34.method719(local8);
		if (local12 == null) {
			return;
		}
		anIntArray372 = new int[local12.anInt3041];
		@Pc(21) int local21 = 0;
		aStringArray25 = new String[local12.anInt3040];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt1366;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt1364;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass68_3 == null ? -1 : arg0.aClass68_3.anInt2135;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt1370;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass68_3 == null ? -1 : arg0.aClass68_3.anInt2188;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass68_2 == null ? -1 : arg0.aClass68_2.anInt2135;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass68_2 == null ? -1 : arg0.aClass68_2.anInt2188;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt1367;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt1368;
				}
				anIntArray372[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString10;
				}
				aStringArray25[local27++] = local135;
			}
		}
		anInt3879 = arg0.anInt1365;
		method2999(local12, arg1);
	}
}
