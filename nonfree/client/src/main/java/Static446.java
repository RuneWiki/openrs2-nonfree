import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!rda", name = "f", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray33;

	@OriginalMember(owner = "client!rda", name = "i", descriptor = "Lclient!rr;")
	private static Class292 aClass292_7;

	@OriginalMember(owner = "client!rda", name = "l", descriptor = "Lclient!rr;")
	private static Class292 aClass292_8;

	@OriginalMember(owner = "client!rda", name = "m", descriptor = "Lclient!qi;")
	private static Class271 aClass271_1;

	@OriginalMember(owner = "client!rda", name = "u", descriptor = "[I")
	private static int[] anIntArray559;

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray32 = new String[1000];

	@OriginalMember(owner = "client!rda", name = "g", descriptor = "[[I")
	private static final int[][] anIntArrayArray69 = new int[5][5000];

	@OriginalMember(owner = "client!rda", name = "h", descriptor = "I")
	private static int anInt7724 = 0;

	@OriginalMember(owner = "client!rda", name = "o", descriptor = "[I")
	private static final int[] anIntArray557 = new int[1000];

	@OriginalMember(owner = "client!rda", name = "p", descriptor = "[I")
	private static final int[] anIntArray558 = new int[5];

	@OriginalMember(owner = "client!rda", name = "s", descriptor = "I")
	private static int anInt7730 = 0;

	@OriginalMember(owner = "client!rda", name = "t", descriptor = "I")
	private static int anInt7731 = 0;

	@OriginalMember(owner = "client!rda", name = "v", descriptor = "[Lclient!wfa;")
	private static final Class353[] aClass353Array1 = new Class353[50];

	@OriginalMember(owner = "client!rda", name = "y", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!rda", name = "z", descriptor = "[I")
	private static final int[] anIntArray560 = new int[3];

	@OriginalMember(owner = "client!rda", name = "A", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray34 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!rda", name = "B", descriptor = "Lclient!hm;")
	public static final Class136 aClass136_84 = new Class136(4);

	@OriginalMember(owner = "client!rda", name = "C", descriptor = "I")
	private static int anInt7734 = 0;

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V")
	public static void method6318(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static508.method7071(arg0)) {
			return;
		}
		@Pc(12) Class292[] local12 = Static14.aClass292ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class292 local19 = local12[local14];
			if (local19.anObjectArray25 != null) {
				@Pc(26) Class6_Sub43 local26 = new Class6_Sub43();
				local26.aClass292_12 = local19;
				local26.anObjectArray34 = local19.anObjectArray25;
				method6325(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!st;)V")
	public static void method6319(@OriginalArg(0) Class6_Sub43 arg0) {
		method6325(arg0, 200000);
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)V")
	private static void method6321(@OriginalArg(0) int arg0) {
		@Pc(3) Class292 local3 = Static367.method5505(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class292[] local13 = Static131.aClass292ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class292[] local19 = Static14.aClass292ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static131.aClass292ArrayArray2[local9] = new Class292[local22];
			Static601.method2934(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static601.method2934(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IZ)V")
	public static void method6322() {
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)V")
	private static void method6323(@OriginalArg(0) int arg0) {
		@Pc(3) Class292 local3 = Static367.method5505(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class292[] local13 = Static131.aClass292ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class292[] local19 = Static14.aClass292ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static131.aClass292ArrayArray2[local9] = new Class292[local22];
			Static601.method2934(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static601.method2934(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(I)Ljava/lang/String;")
	private static String method6324(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray34[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!st;I)V")
	private static void method6325(@OriginalArg(0) Class6_Sub43 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray34;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class6_Sub2_Sub10 local12 = Static219.method3787(local8);
		if (local12 == null) {
			return;
		}
		anIntArray559 = new int[local12.anInt4704];
		@Pc(21) int local21 = 0;
		aStringArray33 = new String[local12.anInt4703];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt8283;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt8284;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass292_12 == null ? -1 : arg0.aClass292_12.anInt7890;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt8286;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass292_12 == null ? -1 : arg0.aClass292_12.anInt7964;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass292_11 == null ? -1 : arg0.aClass292_11.anInt7890;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass292_11 == null ? -1 : arg0.aClass292_11.anInt7964;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt8280;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt8282;
				}
				anIntArray559[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString88;
				}
				aStringArray33[local27++] = local135;
			}
		}
		anInt7734 = arg0.anInt8279;
		method6326(local12, arg1);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!jg;I)V")
	private static void method6326(@OriginalArg(0) Class6_Sub2_Sub10 arg0, @OriginalArg(1) int arg1) {
		anInt7724 = 0;
		anInt7731 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray283;
		@Pc(11) int[] local11 = arg0.anIntArray284;
		@Pc(13) byte local13 = -1;
		anInt7730 = 0;
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
						method6331(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method6327(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray557[anInt7724++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray557[anInt7724++] = Static498.aClass101_1.anIntArray195[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static498.aClass101_1.method2871(local54, anIntArray557[--anInt7724]);
					} else if (local31 == 3) {
						aStringArray32[anInt7731++] = arg0.aStringArray12[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt7724 -= 2;
						if (anIntArray557[anInt7724] != anIntArray557[anInt7724 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt7724 -= 2;
						if (anIntArray557[anInt7724] == anIntArray557[anInt7724 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt7724 -= 2;
						if (anIntArray557[anInt7724] < anIntArray557[anInt7724 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt7724 -= 2;
						if (anIntArray557[anInt7724] > anIntArray557[anInt7724 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt7730 == 0) {
							return;
						}
						@Pc(216) Class353 local216 = aClass353Array1[--anInt7730];
						arg0 = local216.aClass6_Sub2_Sub10_1;
						local8 = arg0.anIntArray283;
						local11 = arg0.anIntArray284;
						local5 = local216.anInt9481;
						anIntArray559 = local216.anIntArray710;
						aStringArray33 = local216.aStringArray40;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray557[anInt7724++] = Static498.aClass101_1.method2865(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static498.aClass101_1.method2869(local54, anIntArray557[--anInt7724]);
					} else if (local31 == 31) {
						anInt7724 -= 2;
						if (anIntArray557[anInt7724] <= anIntArray557[anInt7724 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt7724 -= 2;
						if (anIntArray557[anInt7724] >= anIntArray557[anInt7724 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray557[anInt7724++] = anIntArray559[local11[local5]];
					} else if (local31 == 34) {
						anIntArray559[local11[local5]] = anIntArray557[--anInt7724];
					} else if (local31 == 35) {
						aStringArray32[anInt7731++] = aStringArray33[local11[local5]];
					} else if (local31 == 36) {
						aStringArray33[local11[local5]] = aStringArray32[--anInt7731];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt7731 -= local54;
						@Pc(400) String local400 = Static511.method7087(local54, anInt7731, aStringArray32);
						aStringArray32[anInt7731++] = local400;
					} else if (local31 == 38) {
						anInt7724--;
					} else if (local31 == 39) {
						anInt7731--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class6_Sub2_Sub10 local436 = Static219.method3787(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt4704];
							@Pc(450) String[] local450 = new String[local436.anInt4703];
							for (local452 = 0; local452 < local436.anInt4701; local452++) {
								local446[local452] = anIntArray557[anInt7724 + local452 - local436.anInt4701];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt4702; local471++) {
								local450[local471] = aStringArray32[anInt7731 + local471 - local436.anInt4702];
							}
							anInt7724 -= local436.anInt4701;
							anInt7731 -= local436.anInt4702;
							@Pc(502) Class353 local502 = new Class353();
							local502.aClass6_Sub2_Sub10_1 = arg0;
							local502.anInt9481 = local5;
							local502.anIntArray710 = anIntArray559;
							local502.aStringArray40 = aStringArray33;
							if (anInt7730 >= aClass353Array1.length) {
								throw new RuntimeException();
							}
							aClass353Array1[anInt7730++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray283;
							local11 = local436.anIntArray284;
							local5 = -1;
							anIntArray559 = local446;
							aStringArray33 = local450;
						} else if (local31 == 42) {
							anIntArray557[anInt7724++] = Static395.anIntArray511[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static395.anIntArray511[local54] = anIntArray557[--anInt7724];
							Static413.method5965(local54);
							Static185.aBoolean264 |= Static165.aBooleanArray29[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray557[--anInt7724];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray558[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray69[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray557[--anInt7724];
							if (local603 < 0 || local603 >= anIntArray558[local54]) {
								throw new RuntimeException();
							}
							anIntArray557[anInt7724++] = anIntArrayArray69[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt7724 -= 2;
							local603 = anIntArray557[anInt7724];
							if (local603 < 0 || local603 >= anIntArray558[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray69[local54][local603] = anIntArray557[anInt7724 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static334.aStringArray24[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray32[anInt7731++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static334.aStringArray24[local54] = aStringArray32[--anInt7731];
							Static248.method4704(local54);
						} else if (local31 == 51) {
							@Pc(774) Class128 local774 = arg0.aClass128Array1[local11[local5]];
							@Pc(787) Class6_Sub35 local787 = (Class6_Sub35) local774.method3263((long) anIntArray557[--anInt7724]);
							if (local787 != null) {
								local5 += local787.anInt6119;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString34 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong263).append(" ");
				for (local603 = anInt7730 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass353Array1[local603].aClass6_Sub2_Sub10_1.aLong263).append(" ");
				}
				local856.append("op: ").append(local13);
				Static256.method4328(local856.toString(), local837);
			} else {
				Static273.method4517("Clientscript error in: " + arg0.aString34);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString34).append("\n");
				for (local603 = anInt7730 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass353Array1[local603].aClass6_Sub2_Sub10_1.aString34).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static256.method4328(local856.toString(), local837);
				Static513.method7109(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(IZ)V")
	private static void method6327(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class6_Sub31 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray557[anInt7724++] = Static248.anInt5463;
				return;
			}
			if (arg0 == 5001) {
				anInt7724 -= 3;
				Static248.anInt5463 = anIntArray557[anInt7724];
				Static486.aClass132_4 = Static520.method6533(anIntArray557[anInt7724 + 1]);
				if (Static486.aClass132_4 == null) {
					Static486.aClass132_4 = Static188.aClass132_1;
				}
				Static30.anInt865 = anIntArray557[anInt7724 + 2];
				local52 = Static114.method2007(Static192.aClass47_58, Static337.aClass324_1);
				local52.aClass6_Sub21_Sub2_2.method6062(Static248.anInt5463);
				local52.aClass6_Sub21_Sub2_2.method6062(Static486.aClass132_4.anInt3866);
				local52.aClass6_Sub21_Sub2_2.method6062(Static30.anInt865);
				Static534.method7251(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt7731 -= 2;
				local83 = aStringArray32[anInt7731];
				local89 = aStringArray32[anInt7731 + 1];
				anInt7724 -= 2;
				local97 = anIntArray557[anInt7724];
				local103 = anIntArray557[anInt7724 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class6_Sub31 local125 = Static114.method2007(Static243.aClass47_77, Static337.aClass324_1);
				local125.aClass6_Sub21_Sub2_2.method6062(Static391.method5746(local83) + Static391.method5746(local89) + 2);
				local125.aClass6_Sub21_Sub2_2.method6022(local83);
				local125.aClass6_Sub21_Sub2_2.method6062(local97 - 1);
				local125.aClass6_Sub21_Sub2_2.method6062(local103);
				local125.aClass6_Sub21_Sub2_2.method6022(local89);
				Static534.method7251(local125);
				return;
			}
			@Pc(179) Class232 local179;
			if (arg0 == 5003) {
				local175 = anIntArray557[--anInt7724];
				local179 = Static35.method1830(local175);
				local181 = "";
				if (local179 != null && local179.aString52 != null) {
					local181 = local179.aString52;
				}
				aStringArray32[anInt7731++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray557[--anInt7724];
				local179 = Static35.method1830(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt6342;
				}
				anIntArray557[anInt7724++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static486.aClass132_4 == null) {
					anIntArray557[anInt7724++] = -1;
					return;
				}
				anIntArray557[anInt7724++] = Static486.aClass132_4.anInt3866;
				return;
			}
			@Pc(269) Class6_Sub31 local269;
			if (arg0 == 5006) {
				local175 = anIntArray557[--anInt7724];
				local269 = Static114.method2007(Static257.aClass47_80, Static337.aClass324_1);
				local269.aClass6_Sub21_Sub2_2.method6062(local175);
				Static534.method7251(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray32[--anInt7731];
				method6329(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt7731 -= 2;
				local83 = aStringArray32[anInt7731];
				local89 = aStringArray32[anInt7731 + 1];
				if (Static582.anInt9457 != 0 || (!Static181.aBoolean255 || Static132.aBoolean214) && !Static82.aBoolean121) {
					@Pc(328) Class6_Sub31 local328 = Static114.method2007(Static228.aClass47_72, Static337.aClass324_1);
					local328.aClass6_Sub21_Sub2_2.method6062(0);
					local103 = local328.aClass6_Sub21_Sub2_2.anInt7338;
					local328.aClass6_Sub21_Sub2_2.method6022(local83);
					Static12.method248(local89, local328.aClass6_Sub21_Sub2_2);
					local328.aClass6_Sub21_Sub2_2.method6008(local328.aClass6_Sub21_Sub2_2.anInt7338 - local103);
					Static534.method7251(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray557[--anInt7724];
				local179 = Static35.method1830(local175);
				local181 = "";
				if (local179 != null && local179.aString51 != null) {
					local181 = local179.aString51;
				}
				aStringArray32[anInt7731++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray557[--anInt7724];
				local179 = Static35.method1830(local175);
				local181 = "";
				if (local179 != null && local179.aString49 != null) {
					local181 = local179.aString49;
				}
				aStringArray32[anInt7731++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray557[--anInt7724];
				local179 = Static35.method1830(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt6343;
				}
				anIntArray557[anInt7724++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static328.aClass4_Sub1_Sub1_Sub2_2 == null || Static328.aClass4_Sub1_Sub1_Sub2_2.aString64 == null) {
					local83 = Static216.aString30;
				} else {
					local83 = Static328.aClass4_Sub1_Sub1_Sub2_2.method5922();
				}
				aStringArray32[anInt7731++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray557[anInt7724++] = Static30.anInt865;
				return;
			}
			if (arg0 == 5017) {
				anIntArray557[anInt7724++] = Static474.method7121();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray557[--anInt7724];
				local179 = Static35.method1830(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt6337;
				}
				anIntArray557[anInt7724++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray557[--anInt7724];
				local179 = Static35.method1830(local175);
				local181 = "";
				if (local179 != null && local179.aString48 != null) {
					local181 = local179.aString48;
				}
				aStringArray32[anInt7731++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static328.aClass4_Sub1_Sub1_Sub2_2 == null || Static328.aClass4_Sub1_Sub1_Sub2_2.aString64 == null) {
					local83 = Static216.aString30;
				} else {
					local83 = Static328.aClass4_Sub1_Sub1_Sub2_2.method5916();
				}
				aStringArray32[anInt7731++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray557[--anInt7724];
				local179 = Static35.method1830(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt6339;
				}
				anIntArray557[anInt7724++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray557[--anInt7724];
				local179 = Static35.method1830(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt6340;
				}
				anIntArray557[anInt7724++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray557[--anInt7724];
				local179 = Static35.method1830(local175);
				local181 = "";
				if (local179 != null && local179.aString50 != null) {
					local181 = local179.aString50;
				}
				aStringArray32[anInt7731++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray557[--anInt7724];
				aStringArray32[anInt7731++] = Static383.aClass218_2.method5246(local175).aString40;
				return;
			}
			@Pc(736) Class6_Sub2_Sub12 local736;
			if (arg0 == 5051) {
				local175 = anIntArray557[--anInt7724];
				local736 = Static383.aClass218_2.method5246(local175);
				if (local736.anIntArray393 == null) {
					anIntArray557[anInt7724++] = 0;
					return;
				}
				anIntArray557[anInt7724++] = local736.anIntArray393.length;
				return;
			}
			if (arg0 == 5052) {
				anInt7724 -= 2;
				local175 = anIntArray557[anInt7724];
				local776 = anIntArray557[anInt7724 + 1];
				@Pc(781) Class6_Sub2_Sub12 local781 = Static383.aClass218_2.method5246(local175);
				local103 = local781.anIntArray393[local776];
				anIntArray557[anInt7724++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray557[--anInt7724];
				local736 = Static383.aClass218_2.method5246(local175);
				if (local736.anIntArray394 == null) {
					anIntArray557[anInt7724++] = 0;
					return;
				}
				anIntArray557[anInt7724++] = local736.anIntArray394.length;
				return;
			}
			if (arg0 == 5054) {
				anInt7724 -= 2;
				local175 = anIntArray557[anInt7724];
				local776 = anIntArray557[anInt7724 + 1];
				anIntArray557[anInt7724++] = Static383.aClass218_2.method5246(local175).anIntArray394[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray557[--anInt7724];
				aStringArray32[anInt7731++] = Static266.aClass248_2.method5726(local175).method1827();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray557[--anInt7724];
				@Pc(907) Class6_Sub2_Sub5 local907 = Static266.aClass248_2.method5726(local175);
				if (local907.anIntArray157 == null) {
					anIntArray557[anInt7724++] = 0;
					return;
				}
				anIntArray557[anInt7724++] = local907.anIntArray157.length;
				return;
			}
			if (arg0 == 5057) {
				anInt7724 -= 2;
				local175 = anIntArray557[anInt7724];
				local776 = anIntArray557[anInt7724 + 1];
				anIntArray557[anInt7724++] = Static266.aClass248_2.method5726(local175).anIntArray157[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass271_1 = new Class271();
				aClass271_1.anInt7400 = anIntArray557[--anInt7724];
				aClass271_1.aClass6_Sub2_Sub5_1 = Static266.aClass248_2.method5726(aClass271_1.anInt7400);
				aClass271_1.anIntArray534 = new int[aClass271_1.aClass6_Sub2_Sub5_1.method1820()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static114.method2007(Static512.aClass47_134, Static337.aClass324_1);
				local52.aClass6_Sub21_Sub2_2.method6062(0);
				local776 = local52.aClass6_Sub21_Sub2_2.anInt7338;
				local52.aClass6_Sub21_Sub2_2.method6062(0);
				local52.aClass6_Sub21_Sub2_2.method6052(aClass271_1.anInt7400);
				aClass271_1.aClass6_Sub2_Sub5_1.method1825(local52.aClass6_Sub21_Sub2_2, aClass271_1.anIntArray534);
				local52.aClass6_Sub21_Sub2_2.method6008(local52.aClass6_Sub21_Sub2_2.anInt7338 - local776);
				Static534.method7251(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray32[--anInt7731];
				local269 = Static114.method2007(Static522.aClass47_138, Static337.aClass324_1);
				local269.aClass6_Sub21_Sub2_2.method6062(0);
				local97 = local269.aClass6_Sub21_Sub2_2.anInt7338;
				local269.aClass6_Sub21_Sub2_2.method6022(local83);
				local269.aClass6_Sub21_Sub2_2.method6052(aClass271_1.anInt7400);
				aClass271_1.aClass6_Sub2_Sub5_1.method1825(local269.aClass6_Sub21_Sub2_2, aClass271_1.anIntArray534);
				local269.aClass6_Sub21_Sub2_2.method6008(local269.aClass6_Sub21_Sub2_2.anInt7338 - local97);
				Static534.method7251(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static114.method2007(Static512.aClass47_134, Static337.aClass324_1);
				local52.aClass6_Sub21_Sub2_2.method6062(0);
				local776 = local52.aClass6_Sub21_Sub2_2.anInt7338;
				local52.aClass6_Sub21_Sub2_2.method6062(1);
				local52.aClass6_Sub21_Sub2_2.method6052(aClass271_1.anInt7400);
				aClass271_1.aClass6_Sub2_Sub5_1.method1825(local52.aClass6_Sub21_Sub2_2, aClass271_1.anIntArray534);
				local52.aClass6_Sub21_Sub2_2.method6008(local52.aClass6_Sub21_Sub2_2.anInt7338 - local776);
				Static534.method7251(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt7724 -= 2;
				local175 = anIntArray557[anInt7724];
				local776 = anIntArray557[anInt7724 + 1];
				anIntArray557[anInt7724++] = Static383.aClass218_2.method5246(local175).aCharArray5[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt7724 -= 2;
				local175 = anIntArray557[anInt7724];
				local776 = anIntArray557[anInt7724 + 1];
				anIntArray557[anInt7724++] = Static383.aClass218_2.method5246(local175).aCharArray6[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt7724 -= 2;
				local175 = anIntArray557[anInt7724];
				local776 = anIntArray557[anInt7724 + 1];
				if (local776 == -1) {
					anIntArray557[anInt7724++] = -1;
					return;
				}
				anIntArray557[anInt7724++] = Static383.aClass218_2.method5246(local175).method4510((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt7724 -= 2;
				local175 = anIntArray557[anInt7724];
				local776 = anIntArray557[anInt7724 + 1];
				if (local776 == -1) {
					anIntArray557[anInt7724++] = -1;
					return;
				}
				anIntArray557[anInt7724++] = Static383.aClass218_2.method5246(local175).method4516((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray557[--anInt7724];
				anIntArray557[anInt7724++] = Static266.aClass248_2.method5726(local175).method1820();
				return;
			}
			if (arg0 == 5067) {
				anInt7724 -= 2;
				local175 = anIntArray557[anInt7724];
				local776 = anIntArray557[anInt7724 + 1];
				local97 = Static266.aClass248_2.method5726(local175).method1828(local776).anInt9214;
				anIntArray557[anInt7724++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt7724 -= 2;
				local175 = anIntArray557[anInt7724];
				local776 = anIntArray557[anInt7724 + 1];
				aClass271_1.anIntArray534[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt7724 -= 2;
				local175 = anIntArray557[anInt7724];
				local776 = anIntArray557[anInt7724 + 1];
				aClass271_1.anIntArray534[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt7724 -= 3;
				local175 = anIntArray557[anInt7724];
				local776 = anIntArray557[anInt7724 + 1];
				local97 = anIntArray557[anInt7724 + 2];
				@Pc(1448) Class6_Sub2_Sub5 local1448 = Static266.aClass248_2.method5726(local175);
				if (local1448.method1828(local776).anInt9214 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray557[anInt7724++] = local1448.method1822(local97, local776);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray32[--anInt7731];
				local1496 = anIntArray557[--anInt7724] == 1;
				Static305.method1151(local1496, local83);
				anIntArray557[anInt7724++] = Static148.anInt3249;
				return;
			}
			if (arg0 == 5072) {
				if (Static113.aShortArray14 != null && Static234.anInt4753 < Static148.anInt3249) {
					anIntArray557[anInt7724++] = Static113.aShortArray14[Static234.anInt4753++] & 0xFFFF;
					return;
				}
				anIntArray557[anInt7724++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static234.anInt4753 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static365.aClass155_1.method4042(86)) {
					anIntArray557[anInt7724++] = 1;
					return;
				}
				anIntArray557[anInt7724++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static365.aClass155_1.method4042(82)) {
					anIntArray557[anInt7724++] = 1;
					return;
				}
				anIntArray557[anInt7724++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static365.aClass155_1.method4042(81)) {
					anIntArray557[anInt7724++] = 1;
					return;
				}
				anIntArray557[anInt7724++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static172.method3192(anIntArray557[--anInt7724]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray557[anInt7724++] = Static515.method7128();
					return;
				}
				if (arg0 == 5205) {
					Static133.method2600(false, anIntArray557[--anInt7724], -1, -1);
					return;
				}
				@Pc(1696) Class6_Sub2_Sub6 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray557[--anInt7724];
					local1696 = Static217.method3357(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray557[anInt7724++] = -1;
						return;
					}
					anIntArray557[anInt7724++] = local1696.anInt2238;
					return;
				}
				@Pc(1729) Class6_Sub2_Sub6 local1729;
				if (arg0 == 5207) {
					local1729 = Static217.method3367(anIntArray557[--anInt7724]);
					if (local1729 != null && local1729.aString19 != null) {
						aStringArray32[anInt7731++] = local1729.aString19;
						return;
					}
					aStringArray32[anInt7731++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray557[anInt7724++] = Static91.anInt1775;
					anIntArray557[anInt7724++] = Static66.anInt1326;
					return;
				}
				if (arg0 == 5209) {
					anIntArray557[anInt7724++] = Static39.anInt4953 + Static217.anInt3835;
					anIntArray557[anInt7724++] = Static538.anInt8915 + Static217.anInt3841;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray557[--anInt7724];
					local1696 = Static217.method3367(local175);
					if (local1696 == null) {
						anIntArray557[anInt7724++] = 0;
						anIntArray557[anInt7724++] = 0;
						return;
					}
					anIntArray557[anInt7724++] = local1696.anInt2237 >> 14 & 0x3FFF;
					anIntArray557[anInt7724++] = local1696.anInt2237 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray557[--anInt7724];
					local1696 = Static217.method3367(local175);
					if (local1696 == null) {
						anIntArray557[anInt7724++] = 0;
						anIntArray557[anInt7724++] = 0;
						return;
					}
					anIntArray557[anInt7724++] = local1696.anInt2229 - local1696.anInt2234;
					anIntArray557[anInt7724++] = local1696.anInt2239 - local1696.anInt2231;
					return;
				}
				@Pc(1919) Class6_Sub17 local1919;
				if (arg0 == 5212) {
					local1919 = Static566.method7608();
					if (local1919 == null) {
						anIntArray557[anInt7724++] = -1;
						anIntArray557[anInt7724++] = -1;
						return;
					}
					anIntArray557[anInt7724++] = local1919.anInt2970;
					local776 = local1919.anInt2961 << 28 | local1919.anInt2963 + Static217.anInt3835 << 14 | local1919.anInt2968 + Static217.anInt3841;
					anIntArray557[anInt7724++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static364.method5450();
					if (local1919 == null) {
						anIntArray557[anInt7724++] = -1;
						anIntArray557[anInt7724++] = -1;
						return;
					}
					anIntArray557[anInt7724++] = local1919.anInt2970;
					local776 = local1919.anInt2961 << 28 | local1919.anInt2963 + Static217.anInt3835 << 14 | local1919.anInt2968 + Static217.anInt3841;
					anIntArray557[anInt7724++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray557[--anInt7724];
					local1696 = Static573.method7682();
					if (local1696 != null) {
						local2067 = local1696.method2029(local175 >> 28 & 0x3, local175 & 0x3FFF, local175 >> 14 & 0x3FFF, anIntArray560);
						if (local2067) {
							Static464.method6508(anIntArray560[2], anIntArray560[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt7724 -= 2;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					@Pc(2105) Class180 local2105 = Static217.method3353(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class6_Sub2_Sub6 local2112 = (Class6_Sub2_Sub6) local2105.method4466(); local2112 != null; local2112 = (Class6_Sub2_Sub6) local2105.method4473()) {
						if (local2112.anInt2238 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray557[anInt7724++] = 1;
						return;
					}
					anIntArray557[anInt7724++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray557[--anInt7724];
					local1696 = Static217.method3367(local175);
					if (local1696 == null) {
						anIntArray557[anInt7724++] = -1;
						return;
					}
					anIntArray557[anInt7724++] = local1696.anInt2233;
					return;
				}
				if (arg0 == 5220) {
					anIntArray557[anInt7724++] = Static585.anInt9508 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray557[--anInt7724];
					Static464.method6508(local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static573.method7682();
					if (local1729 != null) {
						local1496 = local1729.method2026(Static39.anInt4953 + Static217.anInt3835, Static538.anInt8915 + Static217.anInt3841, anIntArray560);
						if (local1496) {
							anIntArray557[anInt7724++] = anIntArray560[1];
							anIntArray557[anInt7724++] = anIntArray560[2];
							return;
						}
						anIntArray557[anInt7724++] = -1;
						anIntArray557[anInt7724++] = -1;
						return;
					}
					anIntArray557[anInt7724++] = -1;
					anIntArray557[anInt7724++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt7724 -= 2;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					Static133.method2600(false, local175, local776 & 0x3FFF, local776 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray557[--anInt7724];
					local1696 = Static573.method7682();
					if (local1696 != null) {
						local2067 = local1696.method2029(local175 >> 28 & 0x3, local175 & 0x3FFF, local175 >> 14 & 0x3FFF, anIntArray560);
						if (local2067) {
							anIntArray557[anInt7724++] = anIntArray560[1];
							anIntArray557[anInt7724++] = anIntArray560[2];
							return;
						}
						anIntArray557[anInt7724++] = -1;
						anIntArray557[anInt7724++] = -1;
						return;
					}
					anIntArray557[anInt7724++] = -1;
					anIntArray557[anInt7724++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray557[--anInt7724];
					local1696 = Static573.method7682();
					if (local1696 != null) {
						local2067 = local1696.method2026(local175 >> 14 & 0x3FFF, local175 & 0x3FFF, anIntArray560);
						if (local2067) {
							anIntArray557[anInt7724++] = anIntArray560[1];
							anIntArray557[anInt7724++] = anIntArray560[2];
							return;
						}
						anIntArray557[anInt7724++] = -1;
						anIntArray557[anInt7724++] = -1;
						return;
					}
					anIntArray557[anInt7724++] = -1;
					anIntArray557[anInt7724++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static598.method5906(anIntArray557[--anInt7724]);
					return;
				}
				if (arg0 == 5227) {
					anInt7724 -= 2;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					Static133.method2600(true, local175, local776 & 0x3FFF, local776 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static315.aBoolean383 = anIntArray557[--anInt7724] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray557[anInt7724++] = Static315.aBoolean383 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray557[--anInt7724];
					Static49.method1742(local175);
					return;
				}
				@Pc(2625) Class6 local2625;
				if (arg0 == 5231) {
					anInt7724 -= 2;
					local175 = anIntArray557[anInt7724];
					local1496 = anIntArray557[anInt7724 + 1] == 1;
					if (Static103.aClass128_6 != null) {
						local2625 = Static103.aClass128_6.method3263((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method7804();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class6();
							Static103.aClass128_6.method3267(local2625, (long) local175);
						}
					}
					return;
				}
				@Pc(2667) Class6 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray557[--anInt7724];
					if (Static103.aClass128_6 != null) {
						local2667 = Static103.aClass128_6.method3263((long) local175);
						anIntArray557[anInt7724++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray557[anInt7724++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt7724 -= 2;
					local175 = anIntArray557[anInt7724];
					local1496 = anIntArray557[anInt7724 + 1] == 1;
					if (Static378.aClass128_30 != null) {
						local2625 = Static378.aClass128_30.method3263((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method7804();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class6();
							Static378.aClass128_30.method3267(local2625, (long) local175);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray557[--anInt7724];
					if (Static378.aClass128_30 != null) {
						local2667 = Static378.aClass128_30.method3263((long) local175);
						anIntArray557[anInt7724++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray557[anInt7724++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray557[anInt7724++] = Static217.aClass6_Sub2_Sub6_2 == null ? -1 : Static217.aClass6_Sub2_Sub6_2.anInt2238;
					return;
				}
				if (arg0 == 5236) {
					anInt7724 -= 2;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static212.method3739(local175, local97, local103);
					if (local2833 < 0) {
						anIntArray557[anInt7724++] = -1;
						return;
					}
					anIntArray557[anInt7724++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static300.method4760();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt7724 -= 2;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					Static235.method4083(false, 3, local175, local776);
					anIntArray557[anInt7724++] = Static15.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static15.aFrame1 != null) {
						Static235.method4083(false, Static140.aClass6_Sub48_Sub1_1.anInt9003, -1, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2917) Class71[] local2917 = Static93.method1698();
					anIntArray557[anInt7724++] = local2917.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray557[--anInt7724];
					@Pc(2941) Class71[] local2941 = Static93.method1698();
					anIntArray557[anInt7724++] = local2941[local175].anInt1785;
					anIntArray557[anInt7724++] = local2941[local175].anInt1784;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static140.aClass6_Sub48_Sub1_1.anInt9006;
					local776 = Static140.aClass6_Sub48_Sub1_1.anInt8998;
					local97 = -1;
					@Pc(2978) Class71[] local2978 = Static93.method1698();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class71 local2985 = local2978[local2833];
						if (local2985.anInt1785 == local175 && local2985.anInt1784 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray557[anInt7724++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray557[anInt7724++] = Static74.method1450();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray557[--anInt7724];
					if (local175 >= 1 && local175 <= 2) {
						Static235.method4083(false, local175, -1, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.anInt9003;
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray557[--anInt7724];
					if (local175 >= 1 && local175 <= 2) {
						Static140.aClass6_Sub48_Sub1_1.anInt9003 = local175;
						Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt7731 -= 2;
					local83 = aStringArray32[anInt7731];
					local89 = aStringArray32[anInt7731 + 1];
					local97 = anIntArray557[--anInt7724];
					@Pc(3124) Class6_Sub31 local3124 = Static114.method2007(Static536.aClass47_139, Static337.aClass324_1);
					local3124.aClass6_Sub21_Sub2_2.method6062(Static391.method5746(local83) + Static391.method5746(local89) + 1);
					local3124.aClass6_Sub21_Sub2_2.method6022(local83);
					local3124.aClass6_Sub21_Sub2_2.method6022(local89);
					local3124.aClass6_Sub21_Sub2_2.method6062(local97);
					Static534.method7251(local3124);
					return;
				}
				if (arg0 == 5401) {
					anInt7724 -= 2;
					Static180.aShortArray24[anIntArray557[anInt7724]] = (short) Static414.method5968(anIntArray557[anInt7724 + 1]);
					Static444.aClass322_2.method7140();
					Static444.aClass322_2.method7135();
					Static577.aClass125_2.method3231();
					Static415.method7746();
					return;
				}
				if (arg0 == 5405) {
					anInt7724 -= 2;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static584.anIntArrayArrayArray21[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt7724 -= 7;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1] << 1;
					local97 = anIntArray557[anInt7724 + 2];
					local103 = anIntArray557[anInt7724 + 3];
					local2833 = anIntArray557[anInt7724 + 4];
					@Pc(3262) int local3262 = anIntArray557[anInt7724 + 5];
					@Pc(3268) int local3268 = anIntArray557[anInt7724 + 6];
					if (local175 >= 0 && local175 < 2 && Static584.anIntArrayArrayArray21[local175] != null && local776 >= 0 && local776 < Static584.anIntArrayArrayArray21[local175].length) {
						Static584.anIntArrayArrayArray21[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3268 };
						Static584.anIntArrayArrayArray21[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3262 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static584.anIntArrayArrayArray21[anIntArray557[--anInt7724]].length >> 1;
					anIntArray557[anInt7724++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static15.aFrame1 != null) {
						Static235.method4083(false, Static140.aClass6_Sub48_Sub1_1.anInt9003, -1, -1);
					}
					if (Static547.aFrame2 != null) {
						Static512.method7099();
						System.exit(0);
						return;
					}
					local83 = Static464.aString81 == null ? Static178.method3253() : Static464.aString81;
					Static282.method4636(local83, Static560.anInt9242 == 1, false, Static352.aClass272_2);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static84.aClass331_4 != null) {
						if (Static84.aClass331_4.anObject18 == null) {
							local83 = Static110.method1958(Static84.aClass331_4.anInt8817);
						} else {
							local83 = (String) Static84.aClass331_4.anObject18;
						}
					}
					aStringArray32[anInt7731++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray557[anInt7724++] = Static352.aClass272_2.aBoolean511 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static15.aFrame1 != null) {
						Static235.method4083(false, Static140.aClass6_Sub48_Sub1_1.anInt9003, -1, -1);
					}
					local83 = aStringArray32[--anInt7731];
					local1496 = anIntArray557[--anInt7724] == 1;
					local181 = Static178.method3253() + local83;
					Static282.method4636(local181, Static560.anInt9242 == 1, local1496, Static352.aClass272_2);
					return;
				}
				if (arg0 == 5422) {
					anInt7731 -= 2;
					local83 = aStringArray32[anInt7731];
					local89 = aStringArray32[anInt7731 + 1];
					local97 = anIntArray557[--anInt7724];
					if (local83.length() > 0) {
						if (Static281.aStringArray18 == null) {
							Static281.aStringArray18 = new String[Static236.anIntArray287[Static317.aClass37_3.anInt1063]];
						}
						Static281.aStringArray18[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static145.aStringArray7 == null) {
							Static145.aStringArray7 = new String[Static236.anIntArray287[Static317.aClass37_3.anInt1063]];
						}
						Static145.aStringArray7[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray32[--anInt7731]);
					return;
				}
				if (arg0 == 5424) {
					anInt7724 -= 11;
					Static299.anInt5536 = anIntArray557[anInt7724];
					Static104.anInt1998 = anIntArray557[anInt7724 + 1];
					Static398.anInt6974 = anIntArray557[anInt7724 + 2];
					Static345.anInt6211 = anIntArray557[anInt7724 + 3];
					Static579.anInt9513 = anIntArray557[anInt7724 + 4];
					Static325.anInt5950 = anIntArray557[anInt7724 + 5];
					Static56.anInt1227 = anIntArray557[anInt7724 + 6];
					Static493.anInt8292 = anIntArray557[anInt7724 + 7];
					Static8.anInt276 = anIntArray557[anInt7724 + 8];
					Static187.anInt3883 = anIntArray557[anInt7724 + 9];
					Static599.anInt9632 = anIntArray557[anInt7724 + 10];
					Static398.aClass251_94.method5782(Static579.anInt9513);
					Static398.aClass251_94.method5782(Static325.anInt5950);
					Static398.aClass251_94.method5782(Static56.anInt1227);
					Static398.aClass251_94.method5782(Static493.anInt8292);
					Static398.aClass251_94.method5782(Static8.anInt276);
					Static352.aClass58_33 = null;
					Static301.aClass58_27 = null;
					Static183.aClass58_23 = null;
					Static205.aClass58_24 = null;
					Static182.aClass58_22 = null;
					Static456.aClass58_41 = null;
					Static39.aClass58_26 = null;
					Static519.aClass58_43 = null;
					Static370.aBoolean454 = true;
					return;
				}
				if (arg0 == 5425) {
					Static531.method7227();
					Static370.aBoolean454 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt7724 -= 2;
					Static375.anInt6611 = anIntArray557[anInt7724];
					Static482.anInt8150 = anIntArray557[anInt7724 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt7724 -= 2;
					Static355.anInt7386 = anIntArray557[anInt7724 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt7724 -= 2;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					anIntArray557[anInt7724++] = Static414.method5971(local776, local175) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static57.method1221(false, aStringArray32[--anInt7731], false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static608.method4639(Static249.anApplet1, "accountcreated");
						return;
					} catch (@Pc(3800) Throwable local3800) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static608.method4639(Static249.anApplet1, "accountcreatestarted");
						return;
					} catch (@Pc(3811) Throwable local3811) {
						return;
					}
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt7724 -= 4;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					local97 = anIntArray557[anInt7724 + 2];
					local103 = anIntArray557[anInt7724 + 3];
					Static303.method4806(local776 << 2, local103, (local175 >> 14 & 0x3FFF) - Static39.anInt4952, (local175 & 0x3FFF) - Static138.anInt3088, false, local97);
					return;
				}
				if (arg0 == 5501) {
					anInt7724 -= 4;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					local97 = anIntArray557[anInt7724 + 2];
					local103 = anIntArray557[anInt7724 + 3];
					Static439.method6246(local97, (local175 >> 14 & 0x3FFF) - Static39.anInt4952, (local175 & 0x3FFF) - Static138.anInt3088, local776 << 2, local103);
					return;
				}
				if (arg0 == 5502) {
					anInt7724 -= 6;
					local175 = anIntArray557[anInt7724];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static91.anInt1774 = local175;
					local776 = anIntArray557[anInt7724 + 1];
					if (local776 + 1 >= Static584.anIntArrayArrayArray21[Static91.anInt1774].length >> 1) {
						throw new RuntimeException();
					}
					Static497.anInt8315 = local776;
					Static272.anInt5215 = 0;
					Static536.anInt8902 = anIntArray557[anInt7724 + 2];
					Static213.anInt8690 = anIntArray557[anInt7724 + 3];
					local97 = anIntArray557[anInt7724 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static157.anInt3353 = local97;
					local103 = anIntArray557[anInt7724 + 5];
					if (local103 + 1 >= Static584.anIntArrayArrayArray21[Static157.anInt3353].length >> 1) {
						throw new RuntimeException();
					}
					Static331.anInt6014 = local103;
					Static346.anInt6215 = 3;
					return;
				}
				if (arg0 == 5503) {
					Static368.method5526();
					return;
				}
				if (arg0 == 5504) {
					anInt7724 -= 2;
					Static423.method6097(anIntArray557[anInt7724], anIntArray557[anInt7724 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray557[anInt7724++] = (int) Static331.aFloat140 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray557[anInt7724++] = (int) Static428.aFloat160 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static359.method5426();
					return;
				}
				if (arg0 == 5508) {
					Static163.method2977();
					return;
				}
				if (arg0 == 5509) {
					Static17.method408();
					return;
				}
				if (arg0 == 5510) {
					Static100.method1798();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray557[--anInt7724];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static39.anInt4952;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static473.anInt8075) {
						local776 = Static473.anInt8075;
					}
					local97 -= Static138.anInt3088;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static165.anInt6749) {
						local97 = Static165.anInt6749;
					}
					Static157.anInt3359 = (local776 << 9) + 256;
					Static220.anInt4550 = (local97 << 9) + 256;
					Static346.anInt6215 = 4;
					return;
				}
				if (arg0 == 5512) {
					Static179.method6310();
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt7731 -= 2;
					local83 = aStringArray32[anInt7731];
					local89 = aStringArray32[anInt7731 + 1];
					local97 = anIntArray557[--anInt7724];
					if (Static557.anInt9206 != 3) {
						return;
					}
					if (Static384.anInt6751 == 0 && Static573.anInt9416 == 0) {
						Static216.aString30 = local83;
						Static528.aString99 = local89;
						Static193.anInt9352 = local97;
						Static449.method6350(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static197.method3549();
					return;
				}
				if (arg0 == 5602) {
					if (Static384.anInt6751 == 0) {
						Static170.anInt3627 = -2;
						Static349.anInt6232 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt7724 -= 4;
					if (Static557.anInt9206 != 3) {
						return;
					}
					if (Static384.anInt6751 == 0 && Static573.anInt9416 == 0) {
						Static64.method4911(anIntArray557[anInt7724], anIntArray557[anInt7724 + 3], anIntArray557[anInt7724 + 2], anIntArray557[anInt7724 + 1]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt7731--;
					if (Static557.anInt9206 != 3) {
						return;
					}
					if (Static384.anInt6751 == 0 && Static573.anInt9416 == 0) {
						Static153.method2904(Static568.method7610(aStringArray32[anInt7731]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt7731 -= 2;
					if (Static557.anInt9206 != 3) {
						return;
					}
					if (Static384.anInt6751 == 0 && Static573.anInt9416 == 0) {
						Static108.method1925(aStringArray32[anInt7731 + 1], false, Static568.method7610(aStringArray32[anInt7731]));
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static573.anInt9416 == 0) {
						Static119.anInt2844 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray557[anInt7724++] = Static349.anInt6232;
					return;
				}
				if (arg0 == 5608) {
					anIntArray557[anInt7724++] = Static365.anInt6397;
					return;
				}
				if (arg0 == 5609) {
					anIntArray557[anInt7724++] = Static119.anInt2844;
					return;
				}
				if (arg0 == 5610) {
					for (local175 = 0; local175 < 5; local175++) {
						aStringArray32[anInt7731++] = Static531.aStringArray38.length > local175 ? Static64.method4912(Static531.aStringArray38[local175]) : "";
					}
					Static531.aStringArray38 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray557[anInt7724++] = Static2.anInt25;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray557[--anInt7724];
					if (Static557.anInt9206 != 7) {
						return;
					}
					if (Static384.anInt6751 == 0 && Static573.anInt9416 == 0) {
						if (Static563.aClass127_2 != null) {
							Static563.aClass127_2.method6305();
							Static563.aClass127_2 = null;
						}
						Static193.anInt9352 = local175;
						Static449.method6350(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray557[anInt7724++] = Static349.anInt6232;
					return;
				}
				if (arg0 == 5615) {
					anInt7731 -= 2;
					local83 = aStringArray32[anInt7731];
					local89 = aStringArray32[anInt7731 + 1];
					if (Static557.anInt9206 != 3) {
						return;
					}
					if (Static384.anInt6751 == 0 && Static573.anInt9416 == 0) {
						if (Static563.aClass127_2 != null) {
							Static563.aClass127_2.method6305();
							Static563.aClass127_2 = null;
						}
						Static216.aString30 = local83;
						Static528.aString99 = local89;
						Static449.method6350(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static40.method1024(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray557[anInt7724++] = Static170.anInt3627;
					return;
				}
				if (arg0 == 5618) {
					local175 = anIntArray557[--anInt7724];
					Static598.method5901(local175, false);
					return;
				}
				if (arg0 == 5619) {
					local175 = anIntArray557[--anInt7724];
					Static598.method5901(local175, true);
					return;
				}
				if (arg0 == 5620) {
					Static1.method7670();
					if (Static4.aString3 != "" && Static4.aString3 != "") {
						anIntArray557[anInt7724++] = 1;
						return;
					}
					anIntArray557[anInt7724++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt7731 -= 2;
					if (Static557.anInt9206 != 3) {
						return;
					}
					if (Static384.anInt6751 == 0 && Static573.anInt9416 == 0) {
						Static108.method1925(aStringArray32[anInt7731 + 1], true, Static568.method7610(aStringArray32[anInt7731]));
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4605) Class331 local4605 = Static352.aClass272_2.method6125(false, "3");
					while (local4605.anInt8818 == 0) {
						Static318.method4952(1L);
					}
					if (local4605.anInt8818 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4625) Class31 local4625 = (Class31) local4605.anObject18;
					if (local4625.method1008().exists()) {
						@Pc(4635) Class6_Sub21 local4635 = new Class6_Sub21(50);
						try {
							local4625.method1005(local4635.aByteArray93, 50, 0);
						} catch (@Pc(4644) IOException local4644) {
						}
					}
					try {
						local4625.method1007();
						return;
					} catch (@Pc(4650) Exception local4650) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static70.aString27 != null) {
						anIntArray557[anInt7724++] = 1;
						return;
					}
					anIntArray557[anInt7724++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray557[anInt7724++] = (int) (Static358.aLong177 >> 32);
					anIntArray557[anInt7724++] = (int) (Static358.aLong177 & 0xFFFFL);
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray557[--anInt7724];
					if (local175 < 1) {
						local175 = 1;
					}
					if (local175 > 4) {
						local175 = 4;
					}
					Static140.aClass6_Sub48_Sub1_1.anInt9009 = local175;
					Static573.method7683();
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6002) {
					Static140.aClass6_Sub48_Sub1_1.method7380(anIntArray557[--anInt7724] == 1);
					Static573.method7683();
					Static422.method6091();
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6003) {
					Static140.aClass6_Sub48_Sub1_1.aBoolean689 = anIntArray557[--anInt7724] == 1;
					Static422.method6091();
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6005) {
					Static140.aClass6_Sub48_Sub1_1.aBoolean674 = anIntArray557[--anInt7724] == 1;
					Static573.method7683();
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6006) {
					Static140.aClass6_Sub48_Sub1_1.aBoolean691 = anIntArray557[--anInt7724] == 1;
					Static240.aClass14_7.method6861(!Static140.aClass6_Sub48_Sub1_1.aBoolean691);
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6007) {
					Static140.aClass6_Sub48_Sub1_1.anInt9010 = anIntArray557[--anInt7724];
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6008) {
					Static140.aClass6_Sub48_Sub1_1.aBoolean680 = anIntArray557[--anInt7724] == 1;
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6009) {
					Static140.aClass6_Sub48_Sub1_1.aBoolean684 = anIntArray557[--anInt7724] == 1;
					Static573.method7683();
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6010) {
					Static140.aClass6_Sub48_Sub1_1.aBoolean685 = anIntArray557[--anInt7724] == 1;
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6011) {
					local175 = anIntArray557[--anInt7724];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static140.aClass6_Sub48_Sub1_1.method7370(local175, Static560.anInt9242);
					Static573.method7683();
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6012) {
					Static140.aClass6_Sub48_Sub1_1.method7373(Static560.anInt9242, anIntArray557[--anInt7724] == 1);
					Static468.method6538();
					Static425.method6109();
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6014) {
					Static140.aClass6_Sub48_Sub1_1.aBoolean679 = anIntArray557[--anInt7724] == 1;
					Static573.method7683();
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6015) {
					Static140.aClass6_Sub48_Sub1_1.aBoolean681 = anIntArray557[--anInt7724] == 1;
					Static573.method7683();
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6016) {
					local175 = anIntArray557[--anInt7724];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static140.aClass6_Sub48_Sub1_1.anInt9013 = local175;
					Static293.method4707(Static560.anInt9242);
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					return;
				}
				if (arg0 == 6017) {
					Static140.aClass6_Sub48_Sub1_1.aBoolean687 = anIntArray557[--anInt7724] == 1;
					Static100.method1797();
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6018) {
					local175 = anIntArray557[--anInt7724];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static140.aClass6_Sub48_Sub1_1.anInt8997 = local175;
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray557[--anInt7724];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static140.aClass6_Sub48_Sub1_1.anInt8993) {
						if (Static140.aClass6_Sub48_Sub1_1.anInt8993 == 0 && Static9.anInt281 != -1) {
							Static390.method5735(Static9.anInt281, local175, Static370.aClass251_89);
							Static422.aBoolean507 = false;
						} else if (local175 == 0) {
							Static225.method4017();
							Static422.aBoolean507 = false;
						} else {
							Static227.method4026(local175);
						}
						Static140.aClass6_Sub48_Sub1_1.anInt8993 = local175;
					}
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6020) {
					local175 = anIntArray557[--anInt7724];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static140.aClass6_Sub48_Sub1_1.anInt9004 = local175;
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6021) {
					Static140.aClass6_Sub48_Sub1_1.aBoolean694 = anIntArray557[--anInt7724] == 1;
					Static422.method6091();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray557[--anInt7724];
					local1496 = false;
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 2) {
						local175 = 2;
					}
					if (Static11.anInt321 < 96) {
						local175 = 0;
						local1496 = true;
					}
					Static474.method7123(local175);
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					anIntArray557[anInt7724++] = local1496 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local175 = anIntArray557[--anInt7724];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static140.aClass6_Sub48_Sub1_1.anInt8989 = local175;
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					return;
				}
				if (arg0 == 6025) {
					local175 = anIntArray557[--anInt7724];
					if (local175 < 0 || local175 > Static245.method4243(Static11.anInt321)) {
						local175 = 0;
					}
					Static140.aClass6_Sub48_Sub1_1.anInt9002 = local175;
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray557[--anInt7724];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static526.method7213(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static140.aClass6_Sub48_Sub1_1.aBoolean677 = anIntArray557[--anInt7724] != 0;
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					return;
				}
				if (arg0 == 6029) {
					Static140.aClass6_Sub48_Sub1_1.anInt9010 = anIntArray557[--anInt7724];
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					return;
				}
				if (arg0 == 6030) {
					Static140.aClass6_Sub48_Sub1_1.aBoolean690 = anIntArray557[--anInt7724] != 0;
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static573.method7683();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray557[--anInt7724];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static293.method4707(local175);
					return;
				}
				if (arg0 == 6032) {
					local175 = anIntArray557[--anInt7724];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static140.aClass6_Sub48_Sub1_1.anInt8996 = local175;
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6033) {
					local175 = anIntArray557[--anInt7724];
					if (local175 < 0 || local175 > 4) {
						local175 = 2;
					}
					Static140.aClass6_Sub48_Sub1_1.anInt8988 = local175;
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					return;
				}
				if (arg0 == 6034) {
					Static140.aClass6_Sub48_Sub1_1.aBoolean676 = anIntArray557[--anInt7724] == 1;
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static468.method6538();
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6035) {
					Static140.aClass6_Sub48_Sub1_1.aBoolean695 = anIntArray557[--anInt7724] == 1;
					Static573.method7683();
					Static422.method6091();
					return;
				}
				if (arg0 == 6036) {
					local175 = anIntArray557[--anInt7724];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static140.aClass6_Sub48_Sub1_1.method7390(local175);
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					return;
				}
				if (arg0 == 6037) {
					local175 = anIntArray557[--anInt7724];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static140.aClass6_Sub48_Sub1_1.anInt8991 = local175;
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray557[--anInt7724];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static140.aClass6_Sub48_Sub1_1.anInt9005 && Static9.anInt281 == Static384.anInt6755) {
						if (Static140.aClass6_Sub48_Sub1_1.anInt9005 == 0) {
							Static390.method5735(Static9.anInt281, local175, Static370.aClass251_89);
							Static422.aBoolean507 = false;
						} else if (local175 == 0) {
							Static225.method4017();
							Static422.aBoolean507 = false;
						} else {
							Static227.method4026(local175);
						}
					}
					Static140.aClass6_Sub48_Sub1_1.anInt9005 = local175;
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray557[--anInt7724];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static140.aClass6_Sub48_Sub1_1.anInt9001) {
						Static140.aClass6_Sub48_Sub1_1.anInt9001 = local175;
						Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
						Static408.aBoolean501 = false;
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.anInt9009;
					return;
				}
				if (arg0 == 6102) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.method7377(Static560.anInt9242) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.aBoolean689 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.aBoolean674 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.aBoolean691 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.anInt9010;
					return;
				}
				if (arg0 == 6108) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.aBoolean680 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.aBoolean684 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.aBoolean685 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.method7374(Static560.anInt9242);
					return;
				}
				if (arg0 == 6112) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.method7369(Static560.anInt9242) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.aBoolean679 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.aBoolean681 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.anInt9013;
					return;
				}
				if (arg0 == 6117) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.aBoolean687 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.anInt8997;
					return;
				}
				if (arg0 == 6119) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.anInt8993;
					return;
				}
				if (arg0 == 6120) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.anInt9004;
					return;
				}
				if (arg0 == 6121) {
					anIntArray557[anInt7724++] = Static240.aClass14_7.method6830() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray557[anInt7724++] = Static435.method6206();
					return;
				}
				if (arg0 == 6124) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.anInt8989;
					return;
				}
				if (arg0 == 6125) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.anInt9002;
					return;
				}
				if (arg0 == 6126) {
					anIntArray557[anInt7724++] = Static240.aClass14_7.method6826() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.aBoolean682 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.aBoolean677 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.anInt9010;
					return;
				}
				if (arg0 == 6130) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.aBoolean690 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray557[anInt7724++] = Static560.anInt9242;
					return;
				}
				if (arg0 == 6132) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.anInt8996;
					return;
				}
				if (arg0 == 6133) {
					anIntArray557[anInt7724++] = Static352.aClass272_2.aBoolean511 && !Static352.aClass272_2.aBoolean512 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray557[anInt7724++] = Static245.method4243(Static11.anInt321);
					return;
				}
				if (arg0 == 6135) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.anInt8988;
					return;
				}
				if (arg0 == 6136) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.aBoolean676 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(6238) boolean local6238 = true;
					try {
						local6238 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(6248) Throwable local6248) {
					}
					anIntArray557[anInt7724++] = local6238 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray557[anInt7724++] = Static262.method4396(200, Static560.anInt9242);
					return;
				}
				if (arg0 == 6139) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.method7381(Static560.anInt9242);
					return;
				}
				if (arg0 == 6140) {
					@Pc(6296) byte local6296 = 0;
					if (Static225.method4015(Static560.anInt9242) && Static11.anInt321 < 96) {
						local6296 = 1;
					}
					anIntArray557[anInt7724++] = local6296;
					return;
				}
				if (arg0 == 6141) {
					if (Static11.anInt321 < 96) {
						anIntArray557[anInt7724++] = 0;
						return;
					}
					anIntArray557[anInt7724++] = 2;
					return;
				}
				if (arg0 == 6142) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.anInt8991;
					return;
				}
				if (arg0 == 6143) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.anInt9005;
					return;
				}
				if (arg0 == 6144) {
					anIntArray557[anInt7724++] = Static151.aBoolean241 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.anInt9001;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt7724 -= 2;
					Static290.aShort65 = (short) anIntArray557[anInt7724];
					if (Static290.aShort65 <= 0) {
						Static290.aShort65 = 256;
					}
					Static364.aShort84 = (short) anIntArray557[anInt7724 + 1];
					if (Static364.aShort84 <= 0) {
						Static364.aShort84 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt7724 -= 2;
					Static394.aShort88 = (short) anIntArray557[anInt7724];
					if (Static394.aShort88 <= 0) {
						Static394.aShort88 = 256;
					}
					Static507.aShort107 = (short) anIntArray557[anInt7724 + 1];
					if (Static507.aShort107 <= 0) {
						Static507.aShort107 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt7724 -= 4;
					Static422.aShort94 = (short) anIntArray557[anInt7724];
					if (Static422.aShort94 <= 0) {
						Static422.aShort94 = 1;
					}
					Static499.aShort106 = (short) anIntArray557[anInt7724 + 1];
					if (Static499.aShort106 <= 0) {
						Static499.aShort106 = 32767;
					} else if (Static499.aShort106 < Static422.aShort94) {
						Static499.aShort106 = Static422.aShort94;
					}
					Static369.aShort87 = (short) anIntArray557[anInt7724 + 2];
					if (Static369.aShort87 <= 0) {
						Static369.aShort87 = 1;
					}
					Static347.aShort83 = (short) anIntArray557[anInt7724 + 3];
					if (Static347.aShort83 <= 0) {
						Static347.aShort83 = 32767;
						return;
					}
					if (Static347.aShort83 < Static369.aShort87) {
						Static347.aShort83 = Static369.aShort87;
					}
					return;
				}
				if (arg0 == 6203) {
					Static134.method2630(Static206.aClass292_4.anInt7963, 0, Static206.aClass292_4.anInt7912, false, 0);
					anIntArray557[anInt7724++] = Static216.anInt4316;
					anIntArray557[anInt7724++] = Static536.anInt8904;
					return;
				}
				if (arg0 == 6204) {
					anIntArray557[anInt7724++] = Static394.aShort88;
					anIntArray557[anInt7724++] = Static507.aShort107;
					return;
				}
				if (arg0 == 6205) {
					anIntArray557[anInt7724++] = Static290.aShort65;
					anIntArray557[anInt7724++] = Static364.aShort84;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray557[anInt7724++] = (int) (Static8.method201() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray557[anInt7724++] = (int) (Static8.method201() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt7724 -= 3;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					local97 = anIntArray557[anInt7724 + 2];
					aCalendar1.clear();
					aCalendar1.set(11, 12);
					aCalendar1.set(local97, local776, local175);
					local103 = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray557[anInt7724++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar1.clear();
					aCalendar1.setTime(new Date(Static8.method201()));
					anIntArray557[anInt7724++] = aCalendar1.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray557[--anInt7724];
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
					anIntArray557[anInt7724++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray557[anInt7724++] = Static62.method1265() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray557[anInt7724++] = Static526.method7214() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static557.anInt9206 == 7 && Static384.anInt6751 == 0 && Static573.anInt9416 == 0) {
						if (Static554.aBoolean711) {
							anIntArray557[anInt7724++] = 0;
							return;
						}
						if (Static246.aLong134 > Static8.method201() - 1000L) {
							anIntArray557[anInt7724++] = 1;
							return;
						}
						Static554.aBoolean711 = true;
						local52 = Static114.method2007(Static29.aClass47_12, Static337.aClass324_1);
						local52.aClass6_Sub21_Sub2_2.method6033(Static245.anInt4908);
						Static534.method7251(local52);
						anIntArray557[anInt7724++] = 0;
						return;
					}
					anIntArray557[anInt7724++] = 1;
					return;
				}
				@Pc(6919) Class341 local6919;
				@Pc(6886) Class299_Sub1 local6886;
				if (arg0 == 6501) {
					local6886 = Static179.method6306();
					if (local6886 != null) {
						anIntArray557[anInt7724++] = local6886.anInt8035;
						anIntArray557[anInt7724++] = local6886.anInt8025;
						aStringArray32[anInt7731++] = local6886.aString82;
						local6919 = local6886.method6540();
						anIntArray557[anInt7724++] = local6919.anInt9212;
						aStringArray32[anInt7731++] = local6919.aString101;
						anIntArray557[anInt7724++] = local6886.anInt8028;
						anIntArray557[anInt7724++] = local6886.anInt8034;
						aStringArray32[anInt7731++] = local6886.aString83;
						return;
					}
					anIntArray557[anInt7724++] = -1;
					anIntArray557[anInt7724++] = 0;
					aStringArray32[anInt7731++] = "";
					anIntArray557[anInt7724++] = 0;
					aStringArray32[anInt7731++] = "";
					anIntArray557[anInt7724++] = 0;
					anIntArray557[anInt7724++] = 0;
					aStringArray32[anInt7731++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6886 = Static34.method942();
					if (local6886 != null) {
						anIntArray557[anInt7724++] = local6886.anInt8035;
						anIntArray557[anInt7724++] = local6886.anInt8025;
						aStringArray32[anInt7731++] = local6886.aString82;
						local6919 = local6886.method6540();
						anIntArray557[anInt7724++] = local6919.anInt9212;
						aStringArray32[anInt7731++] = local6919.aString101;
						anIntArray557[anInt7724++] = local6886.anInt8028;
						anIntArray557[anInt7724++] = local6886.anInt8034;
						aStringArray32[anInt7731++] = local6886.aString83;
						return;
					}
					anIntArray557[anInt7724++] = -1;
					anIntArray557[anInt7724++] = 0;
					aStringArray32[anInt7731++] = "";
					anIntArray557[anInt7724++] = 0;
					aStringArray32[anInt7731++] = "";
					anIntArray557[anInt7724++] = 0;
					anIntArray557[anInt7724++] = 0;
					aStringArray32[anInt7731++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray557[--anInt7724];
					local89 = aStringArray32[--anInt7731];
					if (Static557.anInt9206 == 7 && Static384.anInt6751 == 0 && Static573.anInt9416 == 0) {
						anIntArray557[anInt7724++] = Static235.method4085(local175, local89) ? 1 : 0;
						return;
					}
					anIntArray557[anInt7724++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static140.aClass6_Sub48_Sub1_1.anInt9008 = anIntArray557[--anInt7724];
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					return;
				}
				if (arg0 == 6505) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.anInt9008;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray557[--anInt7724];
					@Pc(7276) Class299_Sub1 local7276 = Static118.method2498(local175);
					if (local7276 != null) {
						anIntArray557[anInt7724++] = local7276.anInt8025;
						aStringArray32[anInt7731++] = local7276.aString82;
						@Pc(7300) Class341 local7300 = local7276.method6540();
						anIntArray557[anInt7724++] = local7300.anInt9212;
						aStringArray32[anInt7731++] = local7300.aString101;
						anIntArray557[anInt7724++] = local7276.anInt8028;
						anIntArray557[anInt7724++] = local7276.anInt8034;
						aStringArray32[anInt7731++] = local7276.aString83;
						return;
					}
					anIntArray557[anInt7724++] = -1;
					aStringArray32[anInt7731++] = "";
					anIntArray557[anInt7724++] = 0;
					aStringArray32[anInt7731++] = "";
					anIntArray557[anInt7724++] = 0;
					anIntArray557[anInt7724++] = 0;
					aStringArray32[anInt7731++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt7724 -= 4;
					local175 = anIntArray557[anInt7724];
					local1496 = anIntArray557[anInt7724 + 1] == 1;
					local97 = anIntArray557[anInt7724 + 2];
					local2107 = anIntArray557[anInt7724 + 3] == 1;
					Static276.method4555(local175, local1496, local97, local2107);
					return;
				}
				if (arg0 == 6508) {
					Static154.method2913();
					return;
				}
				if (arg0 == 6509) {
					if (Static557.anInt9206 != 7) {
						return;
					}
					Static522.aBoolean636 = anIntArray557[--anInt7724] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray557[anInt7724++] = Static243.anInt4888;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static140.aClass6_Sub48_Sub1_1.aBoolean678 = anIntArray557[--anInt7724] == 1;
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					return;
				}
				if (arg0 == 6601) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.aBoolean678 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static428.aClass199_4 == Static260.aClass199_3) {
				if (arg0 == 6700) {
					local175 = Static224.aClass128_23.method3268();
					if (Static468.anInt8036 != -1) {
						local175++;
					}
					anIntArray557[anInt7724++] = local175;
					return;
				}
				if (arg0 == 6701) {
					local175 = anIntArray557[--anInt7724];
					if (Static468.anInt8036 != -1) {
						if (local175 == 0) {
							anIntArray557[anInt7724++] = Static468.anInt8036;
							return;
						}
						local175--;
					}
					@Pc(7587) Class6_Sub11 local7587 = (Class6_Sub11) Static224.aClass128_23.method3265();
					while (local175-- > 0) {
						local7587 = (Class6_Sub11) Static224.aClass128_23.method3273();
					}
					anIntArray557[anInt7724++] = local7587.anInt1216;
					return;
				}
				if (arg0 == 6702) {
					local175 = anIntArray557[--anInt7724];
					if (Static14.aClass292ArrayArray1[local175] == null) {
						aStringArray32[anInt7731++] = "";
						return;
					}
					local89 = Static14.aClass292ArrayArray1[local175][0].aString76;
					if (local89 == null) {
						aStringArray32[anInt7731++] = "";
						return;
					}
					aStringArray32[anInt7731++] = local89.substring(0, local89.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local175 = anIntArray557[--anInt7724];
					if (Static14.aClass292ArrayArray1[local175] == null) {
						anIntArray557[anInt7724++] = 0;
						return;
					}
					anIntArray557[anInt7724++] = Static14.aClass292ArrayArray1[local175].length;
					return;
				}
				if (arg0 == 6704) {
					anInt7724 -= 2;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					if (Static14.aClass292ArrayArray1[local175] == null) {
						aStringArray32[anInt7731++] = "";
						return;
					}
					local181 = Static14.aClass292ArrayArray1[local175][local776].aString76;
					if (local181 == null) {
						aStringArray32[anInt7731++] = "";
						return;
					}
					aStringArray32[anInt7731++] = local181;
					return;
				}
				if (arg0 == 6705) {
					anInt7724 -= 2;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					if (Static14.aClass292ArrayArray1[local175] == null) {
						anIntArray557[anInt7724++] = 0;
						return;
					}
					anIntArray557[anInt7724++] = Static14.aClass292ArrayArray1[local175][local776].anInt7968;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt7724 -= 3;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					local97 = anIntArray557[anInt7724 + 2];
					Static182.method3323(local97, "", 1, local175 << 16 | local776);
					return;
				}
				if (arg0 == 6708) {
					anInt7724 -= 3;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					local97 = anIntArray557[anInt7724 + 2];
					Static182.method3323(local97, "", 2, local175 << 16 | local776);
					return;
				}
				if (arg0 == 6709) {
					anInt7724 -= 3;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					local97 = anIntArray557[anInt7724 + 2];
					Static182.method3323(local97, "", 3, local175 << 16 | local776);
					return;
				}
				if (arg0 == 6710) {
					anInt7724 -= 3;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					local97 = anIntArray557[anInt7724 + 2];
					Static182.method3323(local97, "", 4, local175 << 16 | local776);
					return;
				}
				if (arg0 == 6711) {
					anInt7724 -= 3;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					local97 = anIntArray557[anInt7724 + 2];
					Static182.method3323(local97, "", 5, local175 << 16 | local776);
					return;
				}
				if (arg0 == 6712) {
					anInt7724 -= 3;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					local97 = anIntArray557[anInt7724 + 2];
					Static182.method3323(local97, "", 6, local175 << 16 | local776);
					return;
				}
				if (arg0 == 6713) {
					anInt7724 -= 3;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					local97 = anIntArray557[anInt7724 + 2];
					Static182.method3323(local97, "", 7, local175 << 16 | local776);
					return;
				}
				if (arg0 == 6714) {
					anInt7724 -= 3;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					local97 = anIntArray557[anInt7724 + 2];
					Static182.method3323(local97, "", 8, local175 << 16 | local776);
					return;
				}
				if (arg0 == 6715) {
					anInt7724 -= 3;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					local97 = anIntArray557[anInt7724 + 2];
					Static182.method3323(local97, "", 9, local175 << 16 | local776);
					return;
				}
				if (arg0 == 6716) {
					anInt7724 -= 3;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					local97 = anIntArray557[anInt7724 + 2];
					Static182.method3323(local97, "", 10, local175 << 16 | local776);
					return;
				}
				if (arg0 == 6717) {
					anInt7724 -= 3;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					local97 = anIntArray557[anInt7724 + 2];
					@Pc(8175) Class292 local8175 = Static391.method5747(local175 << 16 | local776, local97);
					Static489.method6689();
					@Pc(8180) Class6_Sub3 local8180 = Static67.method1354(local8175);
					Static398.method5831(local8175, local8180.method245(), local8180.anInt316);
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(8208) Class176 local8208;
				if (arg0 == 6800) {
					local175 = anIntArray557[--anInt7724];
					local8208 = Static245.aClass213_3.method5127(local175);
					if (local8208.aString38 == null) {
						aStringArray32[anInt7731++] = "";
						return;
					}
					aStringArray32[anInt7731++] = local8208.aString38;
					return;
				}
				if (arg0 == 6801) {
					local175 = anIntArray557[--anInt7724];
					local8208 = Static245.aClass213_3.method5127(local175);
					anIntArray557[anInt7724++] = local8208.anInt5058;
					return;
				}
				if (arg0 == 6802) {
					local175 = anIntArray557[--anInt7724];
					local8208 = Static245.aClass213_3.method5127(local175);
					anIntArray557[anInt7724++] = local8208.anInt5060;
					return;
				}
				if (arg0 == 6803) {
					local175 = anIntArray557[--anInt7724];
					local8208 = Static245.aClass213_3.method5127(local175);
					anIntArray557[anInt7724++] = local8208.anInt5064;
					return;
				}
				if (arg0 == 6804) {
					anInt7724 -= 2;
					local175 = anIntArray557[anInt7724];
					local776 = anIntArray557[anInt7724 + 1];
					@Pc(8330) Class320 local8330 = Static577.aClass185_2.method4519(local776);
					if (local8330.method7085()) {
						aStringArray32[anInt7731++] = Static245.aClass213_3.method5127(local175).method4385(local8330.aString96, local776);
						return;
					}
					anIntArray557[anInt7724++] = Static245.aClass213_3.method5127(local175).method4382(local776, local8330.anInt8653);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray557[anInt7724++] = Static181.aBoolean255 && !Static132.aBoolean214 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray557[anInt7724++] = Static266.anInt5192;
					return;
				}
				if (arg0 == 6902) {
					anIntArray557[anInt7724++] = Static45.anInt1056;
					return;
				}
				if (arg0 == 6903) {
					anIntArray557[anInt7724++] = Static49.anInt1850;
					return;
				}
				if (arg0 == 6904) {
					anIntArray557[anInt7724++] = Static276.anInt5250;
					return;
				}
				if (arg0 == 6905) {
					local83 = "";
					if (Static84.aClass331_4 != null) {
						if (Static84.aClass331_4.anObject18 == null) {
							local83 = Static110.method1958(Static84.aClass331_4.anInt8817);
						} else {
							local83 = (String) Static84.aClass331_4.anObject18;
						}
					}
					aStringArray32[anInt7731++] = local83;
					return;
				}
				if (arg0 == 6906) {
					anIntArray557[anInt7724++] = Static580.anInt9454;
					return;
				}
				if (arg0 == 6907) {
					anIntArray557[anInt7724++] = Static255.anInt4963;
					return;
				}
				if (arg0 == 6908) {
					anIntArray557[anInt7724++] = Static230.anInt4711;
					return;
				}
				if (arg0 == 6909) {
					anIntArray557[anInt7724++] = Static27.aBoolean48 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray557[anInt7724++] = Static424.anInt7399;
					return;
				}
				if (arg0 == 6911) {
					anIntArray557[anInt7724++] = Static52.anInt1135;
					return;
				}
				if (arg0 == 6912) {
					anIntArray557[anInt7724++] = Static505.anInt8389;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local175 = Static140.aClass6_Sub48_Sub1_1.method7378();
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.anInt9029 = Static560.anInt9242;
					anIntArray557[anInt7724++] = local175;
					Static573.method7683();
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 7001) {
					Static140.aClass6_Sub48_Sub1_1.method7383();
					Static573.method7683();
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 7002) {
					Static140.aClass6_Sub48_Sub1_1.method7392();
					Static573.method7683();
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 7003) {
					Static140.aClass6_Sub48_Sub1_1.method7386();
					Static573.method7683();
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 7004) {
					Static140.aClass6_Sub48_Sub1_1.method7382();
					Static573.method7683();
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 7005) {
					Static140.aClass6_Sub48_Sub1_1.anInt8995 = 0;
					Static140.aClass6_Sub48_Sub1_1.method7394(Static352.aClass272_2);
					Static408.aBoolean501 = false;
					return;
				}
				if (arg0 == 7006) {
					if (Static140.aClass6_Sub48_Sub1_1.anInt9029 == 2) {
						Static140.aClass6_Sub48_Sub1_1.aBoolean696 = true;
						return;
					}
					if (Static140.aClass6_Sub48_Sub1_1.anInt9029 == 1) {
						Static140.aClass6_Sub48_Sub1_1.aBoolean697 = true;
						return;
					}
					if (Static140.aClass6_Sub48_Sub1_1.anInt9029 == 3) {
						Static140.aClass6_Sub48_Sub1_1.aBoolean693 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray557[anInt7724++] = Static140.aClass6_Sub48_Sub1_1.anInt8995;
					return;
				}
				if (arg0 == 7008) {
					if (Static560.anInt9242 == 0 && Static11.anInt321 < 96) {
						anIntArray557[anInt7724++] = 1;
						return;
					}
					anIntArray557[anInt7724++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "()V")
	public static void method6328() {
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method6329(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static582.anInt9457 == 0 && (Static181.aBoolean255 && !Static132.aBoolean214 || Static82.aBoolean121)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static230.aClass156_46.method4065(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static230.aClass156_46.method4065(0).length());
		} else if (local11.startsWith(Static230.aClass156_47.method4065(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static230.aClass156_47.method4065(0).length());
		} else if (local11.startsWith(Static230.aClass156_48.method4065(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static230.aClass156_48.method4065(0).length());
		} else if (local11.startsWith(Static230.aClass156_49.method4065(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static230.aClass156_49.method4065(0).length());
		} else if (local11.startsWith(Static230.aClass156_50.method4065(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static230.aClass156_50.method4065(0).length());
		} else if (local11.startsWith(Static230.aClass156_51.method4065(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static230.aClass156_51.method4065(0).length());
		} else if (local11.startsWith(Static230.aClass156_52.method4065(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static230.aClass156_52.method4065(0).length());
		} else if (local11.startsWith(Static230.aClass156_53.method4065(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static230.aClass156_53.method4065(0).length());
		} else if (local11.startsWith(Static230.aClass156_54.method4065(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static230.aClass156_54.method4065(0).length());
		} else if (local11.startsWith(Static230.aClass156_55.method4065(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static230.aClass156_55.method4065(0).length());
		} else if (local11.startsWith(Static230.aClass156_56.method4065(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static230.aClass156_56.method4065(0).length());
		} else if (local11.startsWith(Class156.lb.method4065(0))) {
			local13 = 11;
			arg0 = arg0.substring(Class156.lb.method4065(0).length());
		} else if (Static25.anInt769 != 0) {
			if (local11.startsWith(Static230.aClass156_46.method4065(Static25.anInt769))) {
				local13 = 0;
				arg0 = arg0.substring(Static230.aClass156_46.method4065(Static25.anInt769).length());
			} else if (local11.startsWith(Static230.aClass156_47.method4065(Static25.anInt769))) {
				local13 = 1;
				arg0 = arg0.substring(Static230.aClass156_47.method4065(Static25.anInt769).length());
			} else if (local11.startsWith(Static230.aClass156_48.method4065(Static25.anInt769))) {
				local13 = 2;
				arg0 = arg0.substring(Static230.aClass156_48.method4065(Static25.anInt769).length());
			} else if (local11.startsWith(Static230.aClass156_49.method4065(Static25.anInt769))) {
				local13 = 3;
				arg0 = arg0.substring(Static230.aClass156_49.method4065(Static25.anInt769).length());
			} else if (local11.startsWith(Static230.aClass156_50.method4065(Static25.anInt769))) {
				local13 = 4;
				arg0 = arg0.substring(Static230.aClass156_50.method4065(Static25.anInt769).length());
			} else if (local11.startsWith(Static230.aClass156_51.method4065(Static25.anInt769))) {
				local13 = 5;
				arg0 = arg0.substring(Static230.aClass156_51.method4065(Static25.anInt769).length());
			} else if (local11.startsWith(Static230.aClass156_52.method4065(Static25.anInt769))) {
				local13 = 6;
				arg0 = arg0.substring(Static230.aClass156_52.method4065(Static25.anInt769).length());
			} else if (local11.startsWith(Static230.aClass156_53.method4065(Static25.anInt769))) {
				local13 = 7;
				arg0 = arg0.substring(Static230.aClass156_53.method4065(Static25.anInt769).length());
			} else if (local11.startsWith(Static230.aClass156_54.method4065(Static25.anInt769))) {
				local13 = 8;
				arg0 = arg0.substring(Static230.aClass156_54.method4065(Static25.anInt769).length());
			} else if (local11.startsWith(Static230.aClass156_55.method4065(Static25.anInt769))) {
				local13 = 9;
				arg0 = arg0.substring(Static230.aClass156_55.method4065(Static25.anInt769).length());
			} else if (local11.startsWith(Static230.aClass156_56.method4065(Static25.anInt769))) {
				local13 = 10;
				arg0 = arg0.substring(Static230.aClass156_56.method4065(Static25.anInt769).length());
			} else if (local11.startsWith(Class156.lb.method4065(Static25.anInt769))) {
				local13 = 11;
				arg0 = arg0.substring(Class156.lb.method4065(Static25.anInt769).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static230.aClass156_57.method4065(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static230.aClass156_57.method4065(0).length());
		} else if (local11.startsWith(Static230.aClass156_58.method4065(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static230.aClass156_58.method4065(0).length());
		} else if (local11.startsWith(Static230.aClass156_59.method4065(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static230.aClass156_59.method4065(0).length());
		} else if (local11.startsWith(Static230.aClass156_60.method4065(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static230.aClass156_60.method4065(0).length());
		} else if (local11.startsWith(Static230.aClass156_61.method4065(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static230.aClass156_61.method4065(0).length());
		} else if (Static25.anInt769 != 0) {
			if (local11.startsWith(Static230.aClass156_57.method4065(Static25.anInt769))) {
				local451 = 1;
				arg0 = arg0.substring(Static230.aClass156_57.method4065(Static25.anInt769).length());
			} else if (local11.startsWith(Static230.aClass156_58.method4065(Static25.anInt769))) {
				local451 = 2;
				arg0 = arg0.substring(Static230.aClass156_58.method4065(Static25.anInt769).length());
			} else if (local11.startsWith(Static230.aClass156_59.method4065(Static25.anInt769))) {
				local451 = 3;
				arg0 = arg0.substring(Static230.aClass156_59.method4065(Static25.anInt769).length());
			} else if (local11.startsWith(Static230.aClass156_60.method4065(Static25.anInt769))) {
				local451 = 4;
				arg0 = arg0.substring(Static230.aClass156_60.method4065(Static25.anInt769).length());
			} else if (local11.startsWith(Static230.aClass156_61.method4065(Static25.anInt769))) {
				local451 = 5;
				arg0 = arg0.substring(Static230.aClass156_61.method4065(Static25.anInt769).length());
			}
		}
		@Pc(641) Class6_Sub31 local641 = Static114.method2007(Static203.aClass47_64, Static337.aClass324_1);
		local641.aClass6_Sub21_Sub2_2.method6062(0);
		@Pc(650) int local650 = local641.aClass6_Sub21_Sub2_2.anInt7338;
		local641.aClass6_Sub21_Sub2_2.method6062(local13);
		local641.aClass6_Sub21_Sub2_2.method6062(local451);
		Static12.method248(arg0, local641.aClass6_Sub21_Sub2_2);
		local641.aClass6_Sub21_Sub2_2.method6008(local641.aClass6_Sub21_Sub2_2.anInt7338 - local650);
		Static534.method7251(local641);
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!pw;II)V")
	public static void method6330(@OriginalArg(0) Class261 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class6_Sub2_Sub10 local5 = Static438.method6234(arg0, arg2, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray559 = new int[local5.anInt4704];
		aStringArray33 = new String[local5.anInt4703];
		if (local5.aClass261_6 == Static83.aClass261_2 || local5.aClass261_6 == Static146.aClass261_3 || local5.aClass261_6 == Static526.aClass261_10) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static1.aClass292_16 != null) {
				local30 = Static1.aClass292_16.anInt7883;
				local32 = Static1.aClass292_16.anInt7923;
			}
			anIntArray559[0] = Static164.aClass173_1.method6487() - local30;
			anIntArray559[1] = Static164.aClass173_1.method6489() - local32;
		}
		method6326(local5, 200000);
	}

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(IZ)V")
	private static void method6331(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class292 local137;
		@Pc(19) int local19;
		@Pc(56) int local56;
		@Pc(25) int local25;
		@Pc(158) Class292 local158;
		@Pc(35) Class292 local35;
		@Pc(210) Class292 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt7724 -= 3;
				local13 = anIntArray557[anInt7724];
				local19 = anIntArray557[anInt7724 + 1];
				local25 = anIntArray557[anInt7724 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static367.method5505(local13);
				if (local35.aClass292Array2 == null) {
					local35.aClass292Array2 = new Class292[local25 + 1];
				}
				if (local35.aClass292Array2.length <= local25) {
					@Pc(54) Class292[] local54 = new Class292[local25 + 1];
					for (local56 = 0; local56 < local35.aClass292Array2.length; local56++) {
						local54[local56] = local35.aClass292Array2[local56];
					}
					local35.aClass292Array2 = local54;
				}
				if (local25 > 0 && local35.aClass292Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class292 local99 = new Class292();
				local99.lb = local19;
				local99.anInt7901 = local99.anInt7890 = local35.anInt7890;
				local99.anInt7964 = local25;
				local35.aClass292Array2[local25] = local99;
				if (arg1) {
					aClass292_7 = local99;
				} else {
					aClass292_8 = local99;
				}
				Static464.method6502(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass292_7 : aClass292_8;
				if (local137.anInt7964 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static367.method5505(local137.anInt7890);
				local158.aClass292Array2[local137.anInt7964] = null;
				Static464.method6502(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static367.method5505(anIntArray557[--anInt7724]);
				local137.aClass292Array2 = null;
				Static464.method6502(local137);
				return;
			}
			if (arg0 == 200) {
				anInt7724 -= 2;
				local13 = anIntArray557[anInt7724];
				local19 = anIntArray557[anInt7724 + 1];
				local210 = Static391.method5747(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray557[anInt7724++] = 1;
					if (arg1) {
						aClass292_7 = local210;
						return;
					}
					aClass292_8 = local210;
					return;
				}
				anIntArray557[anInt7724++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray557[--anInt7724];
				local158 = Static367.method5505(local13);
				if (local158 != null) {
					anIntArray557[anInt7724++] = 1;
					if (arg1) {
						aClass292_7 = local158;
						return;
					}
					aClass292_8 = local158;
					return;
				}
				anIntArray557[anInt7724++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray557[--anInt7724];
				method6321(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray557[--anInt7724];
				method6323(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt7724 -= 2;
					local13 = anIntArray557[anInt7724];
					local19 = anIntArray557[anInt7724 + 1];
					for (local25 = 0; local25 < Static40.anIntArray45.length; local25++) {
						if (Static40.anIntArray45[local25] == local13) {
							Static328.aClass4_Sub1_Sub1_Sub2_2.aClass123_1.method3196(local19, local25, Static304.aClass333_1);
							return;
						}
					}
					for (local353 = 0; local353 < Static579.anIntArray711.length; local353++) {
						if (Static579.anIntArray711[local353] == local13) {
							Static328.aClass4_Sub1_Sub1_Sub2_2.aClass123_1.method3196(local19, local353, Static304.aClass333_1);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt7724 -= 2;
					local13 = anIntArray557[anInt7724];
					local19 = anIntArray557[anInt7724 + 1];
					Static328.aClass4_Sub1_Sub1_Sub2_2.aClass123_1.method3197(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray557[--anInt7724] != 0;
					Static328.aClass4_Sub1_Sub1_Sub2_2.aClass123_1.method3201(local412);
					return;
				}
				if (arg0 == 411) {
					anInt7724 -= 2;
					local13 = anIntArray557[anInt7724];
					local19 = anIntArray557[anInt7724 + 1];
					Static328.aClass4_Sub1_Sub1_Sub2_2.aClass123_1.method3203(local19, Static444.aClass322_2, local13);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static367.method5505(anIntArray557[--anInt7724]);
				} else {
					local137 = arg1 ? aClass292_7 : aClass292_8;
				}
				if (arg0 == 1000) {
					anInt7724 -= 4;
					local137.anInt7920 = anIntArray557[anInt7724];
					local137.anInt7960 = anIntArray557[anInt7724 + 1];
					local19 = anIntArray557[anInt7724 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray557[anInt7724 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte94 = (byte) local19;
					local137.aByte96 = (byte) local25;
					Static464.method6502(local137);
					Static10.method236(local137);
					if (local137.anInt7964 == -1) {
						Static324.method6176(local137.anInt7890);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt7724 -= 4;
					local137.anInt7962 = anIntArray557[anInt7724];
					local137.anInt7927 = anIntArray557[anInt7724 + 1];
					local137.anInt7914 = 0;
					local137.anInt7947 = 0;
					local19 = anIntArray557[anInt7724 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray557[anInt7724 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte93 = (byte) local19;
					local137.aByte95 = (byte) local25;
					Static464.method6502(local137);
					Static10.method236(local137);
					if (local137.lb == 0) {
						Static339.method5265(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(645) boolean local645 = anIntArray557[--anInt7724] == 1;
					if (local137.aBoolean560 != local645) {
						local137.aBoolean560 = local645;
						Static464.method6502(local137);
					}
					if (local137.anInt7964 == -1) {
						Static447.method6333(local137.anInt7890);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt7724 -= 2;
					local137.anInt7915 = anIntArray557[anInt7724];
					local137.anInt7887 = anIntArray557[anInt7724 + 1];
					Static464.method6502(local137);
					Static10.method236(local137);
					if (local137.lb == 0) {
						Static339.method5265(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean556 = anIntArray557[--anInt7724] == 1;
					return;
				}
			} else {
				@Pc(1532) String local1532;
				@Pc(1145) String local1145;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static367.method5505(anIntArray557[--anInt7724]);
					} else {
						local137 = arg1 ? aClass292_7 : aClass292_8;
					}
					if (arg0 == 1100) {
						anInt7724 -= 2;
						local137.anInt7957 = anIntArray557[anInt7724];
						if (local137.anInt7957 > local137.anInt7896 - local137.anInt7963) {
							local137.anInt7957 = local137.anInt7896 - local137.anInt7963;
						}
						if (local137.anInt7957 < 0) {
							local137.anInt7957 = 0;
						}
						local137.anInt7911 = anIntArray557[anInt7724 + 1];
						if (local137.anInt7911 > local137.anInt7949 - local137.anInt7912) {
							local137.anInt7911 = local137.anInt7949 - local137.anInt7912;
						}
						if (local137.anInt7911 < 0) {
							local137.anInt7911 = 0;
						}
						Static464.method6502(local137);
						if (local137.anInt7964 == -1) {
							Static97.method1747(local137.anInt7890);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt7898 = anIntArray557[--anInt7724];
						Static464.method6502(local137);
						if (local137.anInt7964 == -1) {
							Static7.method199(local137.anInt7890);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean564 = anIntArray557[--anInt7724] == 1;
						Static464.method6502(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt7903 = anIntArray557[--anInt7724];
						Static464.method6502(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt7906 = anIntArray557[--anInt7724];
						Static464.method6502(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray557[--anInt7724];
						if (local137.anInt7946 != local19) {
							local137.anInt7946 = local19;
							Static464.method6502(local137);
						}
						if (local137.anInt7964 == -1) {
							Static588.method1988(local137.anInt7890);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt7931 = anIntArray557[--anInt7724];
						Static464.method6502(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean562 = anIntArray557[--anInt7724] == 1;
						Static464.method6502(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt7885 = 1;
						local137.anInt7942 = anIntArray557[--anInt7724];
						Static464.method6502(local137);
						if (local137.anInt7964 == -1) {
							Static546.method7415(local137.anInt7890);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt7724 -= 6;
						local137.anInt7939 = anIntArray557[anInt7724];
						local137.anInt7893 = anIntArray557[anInt7724 + 1];
						local137.anInt7951 = anIntArray557[anInt7724 + 2];
						local137.anInt7897 = anIntArray557[anInt7724 + 3];
						local137.anInt7926 = anIntArray557[anInt7724 + 4];
						local137.anInt7904 = anIntArray557[anInt7724 + 5];
						Static464.method6502(local137);
						if (local137.anInt7964 == -1) {
							Static476.method6590(local137.anInt7890);
							Static185.method3400(local137.anInt7890);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray557[--anInt7724];
						if (local137.anInt7936 != local19) {
							local137.anInt7936 = local19;
							local137.anInt7969 = 0;
							local137.anInt7886 = 1;
							local137.anInt7941 = 0;
							@Pc(1094) Class57 local1094 = local137.anInt7936 == -1 ? null : Static78.aClass298_2.method6521(local137.anInt7936);
							if (local1094 != null) {
								Static240.method4205(local137.anInt7969, local1094);
							}
							Static464.method6502(local137);
						}
						if (local137.anInt7964 == -1) {
							Static377.method5604(local137.anInt7890);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean559 = anIntArray557[--anInt7724] == 1;
						Static464.method6502(local137);
						return;
					}
					if (arg0 == 1112) {
						local1145 = aStringArray32[--anInt7731];
						if (!local1145.equals(local137.aString77)) {
							local137.aString77 = local1145;
							Static464.method6502(local137);
						}
						if (local137.anInt7964 == -1) {
							Static552.method7486(local137.anInt7890);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt7954 = anIntArray557[--anInt7724];
						Static464.method6502(local137);
						if (local137.anInt7964 == -1) {
							Static328.method5144(local137.anInt7890);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt7724 -= 3;
						local137.anInt7970 = anIntArray557[anInt7724];
						local137.anInt7916 = anIntArray557[anInt7724 + 1];
						local137.anInt7971 = anIntArray557[anInt7724 + 2];
						Static464.method6502(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean557 = anIntArray557[--anInt7724] == 1;
						Static464.method6502(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt7881 = anIntArray557[--anInt7724];
						Static464.method6502(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt7938 = anIntArray557[--anInt7724];
						Static464.method6502(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean558 = anIntArray557[--anInt7724] == 1;
						Static464.method6502(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean555 = anIntArray557[--anInt7724] == 1;
						Static464.method6502(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt7724 -= 2;
						local137.anInt7896 = anIntArray557[anInt7724];
						local137.anInt7949 = anIntArray557[anInt7724 + 1];
						Static464.method6502(local137);
						if (local137.lb == 0) {
							Static339.method5265(false, local137);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt7724 -= 2;
						local137.anInt7892 = (short) anIntArray557[anInt7724];
						local137.anInt7921 = (short) anIntArray557[anInt7724 + 1];
						Static464.method6502(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean561 = anIntArray557[--anInt7724] == 1;
						Static464.method6502(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt7904 = anIntArray557[--anInt7724];
						Static464.method6502(local137);
						if (local137.anInt7964 == -1) {
							Static476.method6590(local137.anInt7890);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray557[--anInt7724];
						local137.aBoolean563 = local19 == 1;
						Static464.method6502(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt7724 -= 2;
						local137.anInt7944 = anIntArray557[anInt7724];
						local137.anInt7934 = anIntArray557[anInt7724 + 1];
						Static464.method6502(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt7930 = anIntArray557[--anInt7724];
						Static464.method6502(local137);
						return;
					}
					@Pc(1498) Class320 local1498;
					if (arg0 == 1127) {
						anInt7724 -= 2;
						local19 = anIntArray557[anInt7724];
						local25 = anIntArray557[anInt7724 + 1];
						local1498 = Static577.aClass185_2.method4519(local19);
						if (local25 != local1498.anInt8653) {
							local137.method6467(local19, local25);
							return;
						}
						local137.method6470(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray557[--anInt7724];
						local1532 = aStringArray32[--anInt7731];
						local1498 = Static577.aClass185_2.method4519(local19);
						if (!local1498.aString96.equals(local1532)) {
							local137.method6469(local19, local1532);
							return;
						}
						local137.method6470(local19);
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static367.method5505(anIntArray557[--anInt7724]);
					} else {
						local137 = arg1 ? aClass292_7 : aClass292_8;
					}
					Static464.method6502(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt7724 -= 2;
						local19 = anIntArray557[anInt7724];
						local25 = anIntArray557[anInt7724 + 1];
						if (local137.anInt7964 == -1) {
							Static267.method4474(local137.anInt7890);
							Static476.method6590(local137.anInt7890);
							Static185.method3400(local137.anInt7890);
						}
						if (local19 == -1) {
							local137.anInt7885 = 1;
							local137.anInt7942 = -1;
							local137.anInt7933 = -1;
							return;
						}
						local137.anInt7933 = local19;
						local137.anInt7924 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean570 = true;
						} else {
							local137.aBoolean570 = false;
						}
						@Pc(1674) Class237 local1674 = Static444.aClass322_2.method7141(local19);
						local137.anInt7951 = local1674.anInt6540;
						local137.anInt7897 = local1674.anInt6556;
						local137.anInt7926 = local1674.anInt6564;
						local137.anInt7939 = local1674.anInt6552;
						local137.anInt7893 = local1674.anInt6507;
						local137.anInt7904 = local1674.anInt6518;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt7917 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt7917 = 1;
						} else {
							local137.anInt7917 = 2;
						}
						if (local137.anInt7914 > 0) {
							local137.anInt7904 = local137.anInt7904 * 32 / local137.anInt7914;
							return;
						}
						if (local137.anInt7962 > 0) {
							local137.anInt7904 = local137.anInt7904 * 32 / local137.anInt7962;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt7885 = 2;
						local137.anInt7942 = anIntArray557[--anInt7724];
						if (local137.anInt7964 == -1) {
							Static546.method7415(local137.anInt7890);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt7885 = 3;
						local137.anInt7942 = -1;
						if (local137.anInt7964 == -1) {
							Static546.method7415(local137.anInt7890);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt7885 = 6;
						local137.anInt7942 = anIntArray557[--anInt7724];
						if (local137.anInt7964 == -1) {
							Static546.method7415(local137.anInt7890);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt7885 = 5;
						local137.anInt7942 = anIntArray557[--anInt7724];
						if (local137.anInt7964 == -1) {
							Static546.method7415(local137.anInt7890);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt7724 -= 4;
						local137.anInt7943 = anIntArray557[anInt7724];
						local137.anInt7953 = anIntArray557[anInt7724 + 1];
						local137.anInt7956 = anIntArray557[anInt7724 + 2];
						local137.anInt7950 = anIntArray557[anInt7724 + 3];
						Static464.method6502(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt7724 -= 2;
						local137.anInt7894 = anIntArray557[anInt7724];
						local137.anInt7925 = anIntArray557[anInt7724 + 1];
						Static464.method6502(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt7724 -= 4;
						local137.anInt7942 = anIntArray557[anInt7724];
						local137.anInt7967 = anIntArray557[anInt7724 + 1];
						if (anIntArray557[anInt7724 + 2] == 1) {
							local137.anInt7885 = 9;
						} else {
							local137.anInt7885 = 8;
						}
						if (anIntArray557[anInt7724 + 3] == 1) {
							local137.aBoolean570 = true;
						} else {
							local137.aBoolean570 = false;
						}
						if (local137.anInt7964 == -1) {
							Static546.method7415(local137.anInt7890);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt7885 = 5;
						local137.anInt7942 = Static272.anInt5214;
						local137.anInt7967 = 0;
						if (local137.anInt7964 == -1) {
							Static546.method7415(local137.anInt7890);
						}
						return;
					}
				} else {
					@Pc(2334) int local2334;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static367.method5505(anIntArray557[--anInt7724]);
						} else {
							local137 = arg1 ? aClass292_7 : aClass292_8;
						}
						if (arg0 == 1300) {
							local19 = anIntArray557[--anInt7724] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method6471(aStringArray32[--anInt7731], local19);
								return;
							}
							anInt7731--;
							return;
						}
						if (arg0 == 1301) {
							anInt7724 -= 2;
							local19 = anIntArray557[anInt7724];
							local25 = anIntArray557[anInt7724 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass292_9 = null;
								return;
							}
							local137.aClass292_9 = Static391.method5747(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray557[--anInt7724];
							if (local19 != Static456.anInt7863 && local19 != Static103.anInt1965 && local19 != Static166.anInt3564) {
								return;
							}
							local137.anInt7961 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt7884 = anIntArray557[--anInt7724];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt7895 = anIntArray557[--anInt7724];
							return;
						}
						if (arg0 == 1305) {
							local137.aString79 = aStringArray32[--anInt7731];
							return;
						}
						if (arg0 == 1306) {
							local137.aString78 = aStringArray32[--anInt7731];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray35 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt7952 = anIntArray557[--anInt7724];
							local137.anInt7913 = anIntArray557[--anInt7724];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray557[--anInt7724];
							local25 = anIntArray557[--anInt7724];
							if (local25 >= 1 && local25 <= 10) {
								local137.method6472(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString75 = aStringArray32[--anInt7731];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt7940 = anIntArray557[--anInt7724];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt7724 -= 3;
								local19 = anIntArray557[anInt7724] - 1;
								local25 = anIntArray557[anInt7724 + 1];
								local353 = anIntArray557[anInt7724 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt7724 -= 2;
								local19 = 10;
								local25 = anIntArray557[anInt7724];
								local353 = anIntArray557[anInt7724 + 1];
							}
							if (local137.aByteArray98 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray98 = new byte[11];
								local137.aByteArray99 = new byte[11];
								local137.anIntArray571 = new int[11];
							}
							local137.aByteArray98[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean566 = false;
								for (local2334 = 0; local2334 < local137.aByteArray98.length; local2334++) {
									if (local137.aByteArray98[local2334] != 0) {
										local137.aBoolean566 = true;
										break;
									}
								}
							} else {
								local137.aBoolean566 = true;
							}
							local137.aByteArray99[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt7909 = anIntArray557[--anInt7724];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static367.method5505(anIntArray557[--anInt7724]);
						} else {
							local137 = arg1 ? aClass292_7 : aClass292_8;
						}
						if (arg0 == 1499) {
							local137.method6462();
							return;
						}
						local1145 = aStringArray32[--anInt7731];
						@Pc(2420) int[] local2420 = null;
						if (local1145.length() > 0 && local1145.charAt(local1145.length() - 1) == 'Y') {
							local353 = anIntArray557[--anInt7724];
							if (local353 > 0) {
								local2420 = new int[local353];
								while (local353-- > 0) {
									local2420[local353] = anIntArray557[--anInt7724];
								}
							}
							local1145 = local1145.substring(0, local1145.length() - 1);
						}
						@Pc(2472) Object[] local2472 = new Object[local1145.length() + 1];
						for (local2334 = local2472.length - 1; local2334 >= 1; local2334--) {
							if (local1145.charAt(local2334 - 1) == 's') {
								local2472[local2334] = aStringArray32[--anInt7731];
							} else {
								local2472[local2334] = Integer.valueOf(anIntArray557[--anInt7724]);
							}
						}
						local56 = anIntArray557[--anInt7724];
						if (local56 == -1) {
							local2472 = null;
						} else {
							local2472[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray29 = local2472;
						} else if (arg0 == 1401) {
							local137.anObjectArray21 = local2472;
						} else if (arg0 == 1402) {
							local137.anObjectArray3 = local2472;
						} else if (arg0 == 1403) {
							local137.anObjectArray12 = local2472;
						} else if (arg0 == 1404) {
							local137.anObjectArray24 = local2472;
						} else if (arg0 == 1405) {
							local137.anObjectArray30 = local2472;
						} else if (arg0 == 1406) {
							local137.anObjectArray13 = local2472;
						} else if (arg0 == 1407) {
							local137.anObjectArray15 = local2472;
							local137.anIntArray579 = local2420;
						} else if (arg0 == 1408) {
							local137.anObjectArray26 = local2472;
						} else if (arg0 == 1409) {
							local137.anObjectArray6 = local2472;
						} else if (arg0 == 1410) {
							local137.anObjectArray5 = local2472;
						} else if (arg0 == 1411) {
							local137.anObjectArray31 = local2472;
						} else if (arg0 == 1412) {
							local137.anObjectArray14 = local2472;
						} else if (arg0 == 1414) {
							local137.anObjectArray16 = local2472;
							local137.anIntArray573 = local2420;
						} else if (arg0 == 1415) {
							local137.anObjectArray8 = local2472;
							local137.anIntArray576 = local2420;
						} else if (arg0 == 1416) {
							local137.anObjectArray4 = local2472;
						} else if (arg0 == 1417) {
							local137.anObjectArray11 = local2472;
						} else if (arg0 == 1418) {
							local137.anObjectArray17 = local2472;
						} else if (arg0 == 1419) {
							local137.anObjectArray9 = local2472;
						} else if (arg0 == 1420) {
							local137.anObjectArray32 = local2472;
						} else if (arg0 == 1421) {
							local137.anObjectArray10 = local2472;
						} else if (arg0 == 1422) {
							local137.anObjectArray28 = local2472;
						} else if (arg0 == 1423) {
							local137.anObjectArray18 = local2472;
						} else if (arg0 == 1424) {
							local137.anObjectArray27 = local2472;
						} else if (arg0 == 1425) {
							local137.anObjectArray33 = local2472;
						} else if (arg0 == 1426) {
							local137.anObjectArray19 = local2472;
						} else if (arg0 == 1427) {
							local137.anObjectArray23 = local2472;
						} else if (arg0 == 1428) {
							local137.anObjectArray22 = local2472;
							local137.anIntArray578 = local2420;
						} else if (arg0 == 1429) {
							local137.anObjectArray7 = local2472;
							local137.anIntArray575 = local2420;
						} else if (arg0 == 1430) {
							local137.anObjectArray20 = local2472;
						}
						local137.aBoolean567 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass292_7 : aClass292_8;
						if (arg0 == 1500) {
							anIntArray557[anInt7724++] = local137.anInt7883;
							return;
						}
						if (arg0 == 1501) {
							anIntArray557[anInt7724++] = local137.anInt7923;
							return;
						}
						if (arg0 == 1502) {
							anIntArray557[anInt7724++] = local137.anInt7963;
							return;
						}
						if (arg0 == 1503) {
							anIntArray557[anInt7724++] = local137.anInt7912;
							return;
						}
						if (arg0 == 1504) {
							anIntArray557[anInt7724++] = local137.aBoolean560 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray557[anInt7724++] = local137.anInt7901;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static264.method4416(local137);
							anIntArray557[anInt7724++] = local158 == null ? -1 : local158.anInt7890;
							return;
						}
					} else {
						@Pc(3068) Class320 local3068;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass292_7 : aClass292_8;
							if (arg0 == 1600) {
								anIntArray557[anInt7724++] = local137.anInt7957;
								return;
							}
							if (arg0 == 1601) {
								anIntArray557[anInt7724++] = local137.anInt7911;
								return;
							}
							if (arg0 == 1602) {
								aStringArray32[anInt7731++] = local137.aString77;
								return;
							}
							if (arg0 == 1603) {
								anIntArray557[anInt7724++] = local137.anInt7896;
								return;
							}
							if (arg0 == 1604) {
								anIntArray557[anInt7724++] = local137.anInt7949;
								return;
							}
							if (arg0 == 1605) {
								anIntArray557[anInt7724++] = local137.anInt7904;
								return;
							}
							if (arg0 == 1606) {
								anIntArray557[anInt7724++] = local137.anInt7951;
								return;
							}
							if (arg0 == 1607) {
								anIntArray557[anInt7724++] = local137.anInt7926;
								return;
							}
							if (arg0 == 1608) {
								anIntArray557[anInt7724++] = local137.anInt7897;
								return;
							}
							if (arg0 == 1609) {
								anIntArray557[anInt7724++] = local137.anInt7903;
								return;
							}
							if (arg0 == 1610) {
								anIntArray557[anInt7724++] = local137.anInt7939;
								return;
							}
							if (arg0 == 1611) {
								anIntArray557[anInt7724++] = local137.anInt7893;
								return;
							}
							if (arg0 == 1612) {
								anIntArray557[anInt7724++] = local137.anInt7946;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray557[--anInt7724];
								local3068 = Static577.aClass185_2.method4519(local19);
								if (local3068.method7085()) {
									aStringArray32[anInt7731++] = local137.method6475(local19, local3068.aString96);
									return;
								}
								anIntArray557[anInt7724++] = local137.method6464(local19, local3068.anInt8653);
								return;
							}
							if (arg0 == 1614) {
								anIntArray557[anInt7724++] = local137.anInt7931;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass292_7 : aClass292_8;
							if (arg0 == 1700) {
								anIntArray557[anInt7724++] = local137.anInt7933;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt7933 != -1) {
									anIntArray557[anInt7724++] = local137.anInt7924;
									return;
								}
								anIntArray557[anInt7724++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray557[anInt7724++] = local137.anInt7964;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass292_7 : aClass292_8;
							if (arg0 == 1800) {
								anIntArray557[anInt7724++] = Static67.method1354(local137).method245();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray557[--anInt7724];
								local19--;
								if (local137.aStringArray35 != null && local19 < local137.aStringArray35.length && local137.aStringArray35[local19] != null) {
									aStringArray32[anInt7731++] = local137.aStringArray35[local19];
									return;
								}
								aStringArray32[anInt7731++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString79 == null) {
									aStringArray32[anInt7731++] = "";
									return;
								}
								aStringArray32[anInt7731++] = local137.aString79;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static367.method5505(anIntArray557[--anInt7724]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass292_7 : aClass292_8;
							}
							if (anInt7734 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray23 == null) {
									return;
								}
								@Pc(3318) Class6_Sub43 local3318 = new Class6_Sub43();
								local3318.aClass292_12 = local137;
								local3318.anObjectArray34 = local137.anObjectArray23;
								local3318.anInt8279 = anInt7734 + 1;
								Static127.aClass361_21.method7833(local3318);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static367.method5505(anIntArray557[--anInt7724]);
							if (arg0 == 2500) {
								anIntArray557[anInt7724++] = local137.anInt7883;
								return;
							}
							if (arg0 == 2501) {
								anIntArray557[anInt7724++] = local137.anInt7923;
								return;
							}
							if (arg0 == 2502) {
								anIntArray557[anInt7724++] = local137.anInt7963;
								return;
							}
							if (arg0 == 2503) {
								anIntArray557[anInt7724++] = local137.anInt7912;
								return;
							}
							if (arg0 == 2504) {
								anIntArray557[anInt7724++] = local137.aBoolean560 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray557[anInt7724++] = local137.anInt7901;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static264.method4416(local137);
								anIntArray557[anInt7724++] = local158 == null ? -1 : local158.anInt7890;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static367.method5505(anIntArray557[--anInt7724]);
							if (arg0 == 2600) {
								anIntArray557[anInt7724++] = local137.anInt7957;
								return;
							}
							if (arg0 == 2601) {
								anIntArray557[anInt7724++] = local137.anInt7911;
								return;
							}
							if (arg0 == 2602) {
								aStringArray32[anInt7731++] = local137.aString77;
								return;
							}
							if (arg0 == 2603) {
								anIntArray557[anInt7724++] = local137.anInt7896;
								return;
							}
							if (arg0 == 2604) {
								anIntArray557[anInt7724++] = local137.anInt7949;
								return;
							}
							if (arg0 == 2605) {
								anIntArray557[anInt7724++] = local137.anInt7904;
								return;
							}
							if (arg0 == 2606) {
								anIntArray557[anInt7724++] = local137.anInt7951;
								return;
							}
							if (arg0 == 2607) {
								anIntArray557[anInt7724++] = local137.anInt7926;
								return;
							}
							if (arg0 == 2608) {
								anIntArray557[anInt7724++] = local137.anInt7897;
								return;
							}
							if (arg0 == 2609) {
								anIntArray557[anInt7724++] = local137.anInt7903;
								return;
							}
							if (arg0 == 2610) {
								anIntArray557[anInt7724++] = local137.anInt7939;
								return;
							}
							if (arg0 == 2611) {
								anIntArray557[anInt7724++] = local137.anInt7893;
								return;
							}
							if (arg0 == 2612) {
								anIntArray557[anInt7724++] = local137.anInt7946;
								return;
							}
							if (arg0 == 2613) {
								anIntArray557[anInt7724++] = local137.anInt7931;
								return;
							}
						} else {
							@Pc(3828) Class6_Sub11 local3828;
							@Pc(3726) Class6_Sub11 local3726;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static367.method5505(anIntArray557[--anInt7724]);
									anIntArray557[anInt7724++] = local137.anInt7933;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static367.method5505(anIntArray557[--anInt7724]);
									if (local137.anInt7933 != -1) {
										anIntArray557[anInt7724++] = local137.anInt7924;
										return;
									}
									anIntArray557[anInt7724++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray557[--anInt7724];
									local3726 = (Class6_Sub11) Static224.aClass128_23.method3263((long) local13);
									if (local3726 != null) {
										anIntArray557[anInt7724++] = 1;
										return;
									}
									anIntArray557[anInt7724++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static367.method5505(anIntArray557[--anInt7724]);
									if (local137.aClass292Array2 == null) {
										anIntArray557[anInt7724++] = 0;
										return;
									}
									local19 = local137.aClass292Array2.length;
									for (local25 = 0; local25 < local137.aClass292Array2.length; local25++) {
										if (local137.aClass292Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray557[anInt7724++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt7724 -= 2;
									local13 = anIntArray557[anInt7724];
									local19 = anIntArray557[anInt7724 + 1];
									local3828 = (Class6_Sub11) Static224.aClass128_23.method3263((long) local13);
									if (local3828 != null && local3828.anInt1216 == local19) {
										anIntArray557[anInt7724++] = 1;
										return;
									}
									anIntArray557[anInt7724++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static367.method5505(anIntArray557[--anInt7724]);
								if (arg0 == 2800) {
									anIntArray557[anInt7724++] = Static67.method1354(local137).method245();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray557[--anInt7724];
									local19--;
									if (local137.aStringArray35 != null && local19 < local137.aStringArray35.length && local137.aStringArray35[local19] != null) {
										aStringArray32[anInt7731++] = local137.aStringArray35[local19];
										return;
									}
									aStringArray32[anInt7731++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString79 == null) {
										aStringArray32[anInt7731++] = "";
										return;
									}
									aStringArray32[anInt7731++] = local137.aString79;
									return;
								}
							} else {
								@Pc(3965) String local3965;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3965 = aStringArray32[--anInt7731];
										Static292.method4690(local3965);
										return;
									}
									if (arg0 == 3101) {
										anInt7724 -= 2;
										Static35.method1833(anIntArray557[anInt7724], Static328.aClass4_Sub1_Sub1_Sub2_2, anIntArray557[anInt7724 + 1]);
										return;
									}
									if (arg0 == 3103) {
										Static305.method1148();
										return;
									}
									if (arg0 == 3104) {
										local3965 = aStringArray32[--anInt7731];
										local19 = 0;
										if (Static198.method3584(local3965)) {
											local19 = Static444.method6313(local3965);
										}
										@Pc(4025) Class6_Sub31 local4025 = Static114.method2007(Static401.aClass47_110, Static337.aClass324_1);
										local4025.aClass6_Sub21_Sub2_2.method6033(local19);
										Static534.method7251(local4025);
										return;
									}
									@Pc(4054) Class6_Sub31 local4054;
									if (arg0 == 3105) {
										local3965 = aStringArray32[--anInt7731];
										local4054 = Static114.method2007(Static142.aClass47_151, Static337.aClass324_1);
										local4054.aClass6_Sub21_Sub2_2.method6062(local3965.length() + 1);
										local4054.aClass6_Sub21_Sub2_2.method6022(local3965);
										Static534.method7251(local4054);
										return;
									}
									if (arg0 == 3106) {
										local3965 = aStringArray32[--anInt7731];
										local4054 = Static114.method2007(Static385.aClass47_105, Static337.aClass324_1);
										local4054.aClass6_Sub21_Sub2_2.method6062(local3965.length() + 1);
										local4054.aClass6_Sub21_Sub2_2.method6022(local3965);
										Static534.method7251(local4054);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray557[--anInt7724];
										local1145 = aStringArray32[--anInt7731];
										Static328.method5145(local13, local1145);
										return;
									}
									if (arg0 == 3108) {
										anInt7724 -= 3;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										local25 = anIntArray557[anInt7724 + 2];
										local35 = Static367.method5505(local25);
										Static138.method2737(local35, local19, local13);
										return;
									}
									if (arg0 == 3109) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										local210 = arg1 ? aClass292_7 : aClass292_8;
										Static138.method2737(local210, local19, local13);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray557[--anInt7724];
										local4054 = Static114.method2007(Static355.aClass47_116, Static337.aClass324_1);
										local4054.aClass6_Sub21_Sub2_2.method6052(local13);
										Static534.method7251(local4054);
										return;
									}
									if (arg0 == 3111) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										local3828 = (Class6_Sub11) Static224.aClass128_23.method3263((long) local13);
										if (local3828 != null) {
											Static145.method2815(true, local3828.anInt1216 != local19, local3828);
										}
										Static464.method6504(3, local13, local19, true);
										return;
									}
									if (arg0 == 3112) {
										anInt7724--;
										local13 = anIntArray557[anInt7724];
										local3726 = (Class6_Sub11) Static224.aClass128_23.method3263((long) local13);
										if (local3726 != null && local3726.anInt1217 == 3) {
											Static145.method2815(true, true, local3726);
										}
										return;
									}
									if (arg0 == 3113) {
										Static596.method7848(aStringArray32[--anInt7731]);
										return;
									}
									if (arg0 == 3114) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										local1532 = aStringArray32[--anInt7731];
										Static417.method5982("", "", "", local1532, local19, local13);
										return;
									}
									if (arg0 == 3115) {
										anInt7724 -= 11;
										@Pc(4355) Class319[] local4355 = Static4.method161();
										@Pc(4358) Class247[] local4358 = Static179.method6311();
										Static78.method1613(anIntArray557[anInt7724 + 9], anIntArray557[anInt7724 + 5], anIntArray557[anInt7724 + 2], local4358[anIntArray557[anInt7724 + 1]], anIntArray557[anInt7724 + 10], anIntArray557[anInt7724 + 8], anIntArray557[anInt7724 + 6], anIntArray557[anInt7724 + 7], anIntArray557[anInt7724 + 4], anIntArray557[anInt7724 + 3], local4355[anIntArray557[anInt7724]]);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt7724 -= 3;
										Static588.method1983(255, anIntArray557[anInt7724], anIntArray557[anInt7724 + 2], anIntArray557[anInt7724 + 1]);
										return;
									}
									if (arg0 == 3201) {
										Static390.method5740(anIntArray557[--anInt7724], 50, 255);
										return;
									}
									if (arg0 == 3202) {
										anInt7724 -= 2;
										Static228.method4044(255, anIntArray557[anInt7724 + 1], anIntArray557[anInt7724]);
										return;
									}
									if (arg0 == 3203) {
										anInt7724 -= 4;
										Static588.method1983(anIntArray557[anInt7724 + 3], anIntArray557[anInt7724], anIntArray557[anInt7724 + 2], anIntArray557[anInt7724 + 1]);
										return;
									}
									if (arg0 == 3204) {
										anInt7724 -= 3;
										Static390.method5740(anIntArray557[anInt7724], anIntArray557[anInt7724 + 2], anIntArray557[anInt7724 + 1]);
										return;
									}
									if (arg0 == 3205) {
										anInt7724 -= 3;
										Static228.method4044(anIntArray557[anInt7724 + 2], anIntArray557[anInt7724 + 1], anIntArray557[anInt7724]);
										return;
									}
									if (arg0 == 3206) {
										anInt7724 -= 4;
										Static366.method5502(anIntArray557[anInt7724], anIntArray557[anInt7724 + 2], anIntArray557[anInt7724 + 3], false, anIntArray557[anInt7724 + 1]);
										return;
									}
									if (arg0 == 3207) {
										anInt7724 -= 4;
										Static366.method5502(anIntArray557[anInt7724], anIntArray557[anInt7724 + 2], anIntArray557[anInt7724 + 3], true, anIntArray557[anInt7724 + 1]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray557[anInt7724++] = Static312.anInt5688;
										return;
									}
									if (arg0 == 3301) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = Static454.method6420(local13, local19, false);
										return;
									}
									if (arg0 == 3302) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = Static7.method197(local13, local19, false);
										return;
									}
									if (arg0 == 3303) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = Static87.method1654(local19, false, local13);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Static134.aClass169_1.method4257(local13).anInt8305;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Static41.anIntArray285[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Static400.anIntArray515[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Static536.anIntArray688[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4812) byte local4812 = Static328.aClass4_Sub1_Sub1_Sub2_2.aByte108;
										local19 = (Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542 >> 9) + Static39.anInt4952;
										local25 = (Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540 >> 9) + Static138.anInt3088;
										anIntArray557[anInt7724++] = (local4812 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray557[anInt7724++] = Static448.aBoolean544 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = Static454.method6420(local13, local19, true);
										return;
									}
									if (arg0 == 3314) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = Static7.method197(local13, local19, true);
										return;
									}
									if (arg0 == 3315) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = Static87.method1654(local19, true, local13);
										return;
									}
									if (arg0 == 3316) {
										if (Static582.anInt9457 >= 2) {
											anIntArray557[anInt7724++] = Static582.anInt9457;
											return;
										}
										anIntArray557[anInt7724++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray557[anInt7724++] = Static97.anInt1865;
										return;
									}
									if (arg0 == 3318) {
										anIntArray557[anInt7724++] = Static316.aClass105_5.anInt3307;
										return;
									}
									if (arg0 == 3321) {
										anIntArray557[anInt7724++] = Static349.anInt6230;
										return;
									}
									if (arg0 == 3322) {
										anIntArray557[anInt7724++] = Static210.anInt4255;
										return;
									}
									if (arg0 == 3323) {
										if (Static509.anInt9475 >= 5 && Static509.anInt9475 <= 9) {
											anIntArray557[anInt7724++] = 1;
											return;
										}
										anIntArray557[anInt7724++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static509.anInt9475 >= 5 && Static509.anInt9475 <= 9) {
											anIntArray557[anInt7724++] = Static509.anInt9475;
											return;
										}
										anIntArray557[anInt7724++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray557[anInt7724++] = Static318.aBoolean406 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray557[anInt7724++] = Static328.aClass4_Sub1_Sub1_Sub2_2.anInt7139;
										return;
									}
									if (arg0 == 3327) {
										anIntArray557[anInt7724++] = Static328.aClass4_Sub1_Sub1_Sub2_2.aClass123_1.aBoolean251 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray557[anInt7724++] = Static82.aBoolean121 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Static106.method1907(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = Static518.method7152(local19, false, local13);
										return;
									}
									if (arg0 == 3332) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = Static518.method7152(local19, true, local13);
										return;
									}
									if (arg0 == 3333) {
										anIntArray557[anInt7724++] = Static193.anInt9352;
										return;
									}
									if (arg0 == 3335) {
										anIntArray557[anInt7724++] = Static25.anInt769;
										return;
									}
									if (arg0 == 3336) {
										anInt7724 -= 4;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										local25 = anIntArray557[anInt7724 + 2];
										local353 = anIntArray557[anInt7724 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray557[anInt7724++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray557[anInt7724++] = Static488.anInt5164;
										return;
									}
									if (arg0 == 3338) {
										anIntArray557[anInt7724++] = Static559.method7550();
										return;
									}
									if (arg0 == 3339) {
										anIntArray557[anInt7724++] = Static139.aBoolean227 ? 1 : 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray557[anInt7724++] = Static470.aBoolean53 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray557[anInt7724++] = Static413.aBoolean503 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray557[anInt7724++] = Static164.aClass173_1.method6487();
										return;
									}
									if (arg0 == 3343) {
										anIntArray557[anInt7724++] = Static164.aClass173_1.method6489();
										return;
									}
									if (arg0 == 3344) {
										aStringArray32[anInt7731++] = Static411.method7692();
										return;
									}
									if (arg0 == 3345) {
										aStringArray32[anInt7731++] = Static250.method4279();
										return;
									}
									if (arg0 == 3346) {
										anIntArray557[anInt7724++] = Static479.method6620();
										return;
									}
									if (arg0 == 3347) {
										anIntArray557[anInt7724++] = Static414.anInt7243;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5547) Class49 local5547;
									if (arg0 == 3400) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										local5547 = Static594.aClass9_1.method207(local13);
										aStringArray32[anInt7731++] = local5547.method1308(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt7724 -= 4;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										local25 = anIntArray557[anInt7724 + 2];
										local353 = anIntArray557[anInt7724 + 3];
										@Pc(5593) Class49 local5593 = Static594.aClass9_1.method207(local25);
										if (local5593.aChar2 == local13 && local5593.aChar3 == local19) {
											if (local19 == 115) {
												aStringArray32[anInt7731++] = local5593.method1308(local353);
												return;
											}
											anIntArray557[anInt7724++] = local5593.method1305(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt7724 -= 3;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										local25 = anIntArray557[anInt7724 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5669) Class49 local5669 = Static594.aClass9_1.method207(local19);
										if (local5669.aChar3 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray557[anInt7724++] = local5669.method1311(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray557[--anInt7724];
										local1145 = aStringArray32[--anInt7731];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5547 = Static594.aClass9_1.method207(local13);
										if (local5547.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray557[anInt7724++] = local5547.method1307(local1145) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray557[--anInt7724];
										@Pc(5767) Class49 local5767 = Static594.aClass9_1.method207(local13);
										anIntArray557[anInt7724++] = local5767.aClass128_3.method3268();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static257.anInt5017 == 0) {
											anIntArray557[anInt7724++] = -2;
											return;
										}
										if (Static257.anInt5017 == 1) {
											anIntArray557[anInt7724++] = -1;
											return;
										}
										anIntArray557[anInt7724++] = Static574.anInt9426;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray557[--anInt7724];
										if (Static257.anInt5017 == 2 && local13 < Static574.anInt9426) {
											aStringArray32[anInt7731++] = Static398.aStringArray29[local13];
											if (Static183.aStringArray8[local13] != null) {
												aStringArray32[anInt7731++] = Static183.aStringArray8[local13];
												return;
											}
											aStringArray32[anInt7731++] = "";
											return;
										}
										aStringArray32[anInt7731++] = "";
										aStringArray32[anInt7731++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray557[--anInt7724];
										if (Static257.anInt5017 == 2 && local13 < Static574.anInt9426) {
											anIntArray557[anInt7724++] = Static300.anIntArray409[local13];
											return;
										}
										anIntArray557[anInt7724++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray557[--anInt7724];
										if (Static257.anInt5017 == 2 && local13 < Static574.anInt9426) {
											anIntArray557[anInt7724++] = Static480.anIntArray599[local13];
											return;
										}
										anIntArray557[anInt7724++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3965 = aStringArray32[--anInt7731];
										local19 = anIntArray557[--anInt7724];
										Static310.method1721(local3965, local19);
										return;
									}
									if (arg0 == 3605) {
										local3965 = aStringArray32[--anInt7731];
										Static403.method5921(local3965);
										return;
									}
									if (arg0 == 3606) {
										local3965 = aStringArray32[--anInt7731];
										Static131.method2595(local3965);
										return;
									}
									if (arg0 == 3607) {
										local3965 = aStringArray32[--anInt7731];
										Static407.method5942(local3965, false);
										return;
									}
									if (arg0 == 3608) {
										local3965 = aStringArray32[--anInt7731];
										Static572.method7655(local3965);
										return;
									}
									if (arg0 == 3609) {
										local3965 = aStringArray32[--anInt7731];
										if (local3965.startsWith("<img=0>") || local3965.startsWith("<img=1>")) {
											local3965 = local3965.substring(7);
										}
										anIntArray557[anInt7724++] = Static373.method5571(local3965) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray557[--anInt7724];
										if (Static257.anInt5017 == 2 && local13 < Static574.anInt9426) {
											aStringArray32[anInt7731++] = Static299.aStringArray21[local13];
											return;
										}
										aStringArray32[anInt7731++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static398.aString61 != null) {
											aStringArray32[anInt7731++] = Static64.method4912(Static398.aString61);
											return;
										}
										aStringArray32[anInt7731++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static398.aString61 != null) {
											anIntArray557[anInt7724++] = Static324.anInt7486;
											return;
										}
										anIntArray557[anInt7724++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray557[--anInt7724];
										if (Static398.aString61 != null && local13 < Static324.anInt7486) {
											aStringArray32[anInt7731++] = Static198.aClass234Array1[local13].aString55;
											return;
										}
										aStringArray32[anInt7731++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray557[--anInt7724];
										if (Static398.aString61 != null && local13 < Static324.anInt7486) {
											anIntArray557[anInt7724++] = Static198.aClass234Array1[local13].anInt6351;
											return;
										}
										anIntArray557[anInt7724++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray557[--anInt7724];
										if (Static398.aString61 != null && local13 < Static324.anInt7486) {
											anIntArray557[anInt7724++] = Static198.aClass234Array1[local13].aByte55;
											return;
										}
										anIntArray557[anInt7724++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray557[anInt7724++] = Static189.aByte35;
										return;
									}
									if (arg0 == 3617) {
										local3965 = aStringArray32[--anInt7731];
										Static438.method6242(local3965);
										return;
									}
									if (arg0 == 3618) {
										anIntArray557[anInt7724++] = Static190.aByte36;
										return;
									}
									if (arg0 == 3619) {
										local3965 = aStringArray32[--anInt7731];
										Static519.method7157(local3965);
										return;
									}
									if (arg0 == 3620) {
										Static518.method7150();
										return;
									}
									if (arg0 == 3621) {
										if (Static257.anInt5017 == 0) {
											anIntArray557[anInt7724++] = -1;
											return;
										}
										anIntArray557[anInt7724++] = Static362.anInt6352;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray557[--anInt7724];
										if (Static257.anInt5017 != 0 && local13 < Static362.anInt6352) {
											aStringArray32[anInt7731++] = Static488.aStringArray16[local13];
											if (Static378.aStringArray27[local13] != null) {
												aStringArray32[anInt7731++] = Static378.aStringArray27[local13];
												return;
											}
											aStringArray32[anInt7731++] = "";
											return;
										}
										aStringArray32[anInt7731++] = "";
										aStringArray32[anInt7731++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3965 = aStringArray32[--anInt7731];
										if (local3965.startsWith("<img=0>") || local3965.startsWith("<img=1>")) {
											local3965 = local3965.substring(7);
										}
										anIntArray557[anInt7724++] = Static45.method1075(local3965) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray557[--anInt7724];
										if (Static198.aClass234Array1 != null && local13 < Static324.anInt7486 && Static198.aClass234Array1[local13].aString56.equalsIgnoreCase(Static328.aClass4_Sub1_Sub1_Sub2_2.aString63)) {
											anIntArray557[anInt7724++] = 1;
											return;
										}
										anIntArray557[anInt7724++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static413.aString65 != null) {
											aStringArray32[anInt7731++] = Static413.aString65;
											return;
										}
										aStringArray32[anInt7731++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray557[--anInt7724];
										if (Static398.aString61 != null && local13 < Static324.anInt7486) {
											aStringArray32[anInt7731++] = Static198.aClass234Array1[local13].aString54;
											return;
										}
										aStringArray32[anInt7731++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray557[--anInt7724];
										if (Static257.anInt5017 == 2 && local13 >= 0 && local13 < Static574.anInt9426) {
											anIntArray557[anInt7724++] = Static18.aBooleanArray1[local13] ? 1 : 0;
											return;
										}
										anIntArray557[anInt7724++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3965 = aStringArray32[--anInt7731];
										if (local3965.startsWith("<img=0>") || local3965.startsWith("<img=1>")) {
											local3965 = local3965.substring(7);
										}
										anIntArray557[anInt7724++] = Static277.method4559(local3965);
										return;
									}
									if (arg0 == 3629) {
										anIntArray557[anInt7724++] = Static384.anInt6750;
										return;
									}
									if (arg0 == 3630) {
										local3965 = aStringArray32[--anInt7731];
										Static407.method5942(local3965, true);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Static82.aBooleanArray14[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray557[--anInt7724];
										if (Static398.aString61 != null && local13 < Static324.anInt7486) {
											aStringArray32[anInt7731++] = Static198.aClass234Array1[local13].aString56;
											return;
										}
										aStringArray32[anInt7731++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray557[--anInt7724];
										if (Static257.anInt5017 != 0 && local13 < Static362.anInt6352) {
											aStringArray32[anInt7731++] = Static227.aStringArray11[local13];
											return;
										}
										aStringArray32[anInt7731++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Static229.aClass314Array1[local13].method6756();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Static229.aClass314Array1[local13].anInt8321;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Static229.aClass314Array1[local13].anInt8320;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Static229.aClass314Array1[local13].anInt8324;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Static229.aClass314Array1[local13].anInt8319;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Static229.aClass314Array1[local13].anInt8316;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray557[--anInt7724];
										local19 = Static229.aClass314Array1[local13].method6754();
										anIntArray557[anInt7724++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray557[--anInt7724];
										local19 = Static229.aClass314Array1[local13].method6754();
										anIntArray557[anInt7724++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray557[--anInt7724];
										local19 = Static229.aClass314Array1[local13].method6754();
										anIntArray557[anInt7724++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray557[--anInt7724];
										local19 = Static229.aClass314Array1[local13].method6754();
										anIntArray557[anInt7724++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt7724 -= 5;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										local25 = anIntArray557[anInt7724 + 2];
										local353 = anIntArray557[anInt7724 + 3];
										local2334 = anIntArray557[anInt7724 + 4];
										anIntArray557[anInt7724++] = local13 + (local19 - local13) * (local2334 - local25) / (local353 - local25);
										return;
									}
									@Pc(7277) long local7277;
									@Pc(7270) long local7270;
									if (arg0 == 4007) {
										anInt7724 -= 2;
										local7270 = anIntArray557[anInt7724];
										local7277 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = (int) (local7270 + local7270 * local7277 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										if (local13 == 0) {
											anIntArray557[anInt7724++] = 0;
											return;
										}
										anIntArray557[anInt7724++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										if (local13 == 0) {
											anIntArray557[anInt7724++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray557[anInt7724++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray557[anInt7724++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt7724 -= 3;
										local7270 = anIntArray557[anInt7724];
										local7277 = anIntArray557[anInt7724 + 1];
										@Pc(7658) long local7658 = (long) anIntArray557[anInt7724 + 2];
										anIntArray557[anInt7724++] = (int) (local7270 * local7658 / local7277);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3965 = aStringArray32[--anInt7731];
										local19 = anIntArray557[--anInt7724];
										aStringArray32[anInt7731++] = local3965 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt7731 -= 2;
										local3965 = aStringArray32[anInt7731];
										local1145 = aStringArray32[anInt7731 + 1];
										aStringArray32[anInt7731++] = local3965 + local1145;
										return;
									}
									if (arg0 == 4102) {
										local3965 = aStringArray32[--anInt7731];
										local19 = anIntArray557[--anInt7724];
										aStringArray32[anInt7731++] = local3965 + Static318.method4947(local19);
										return;
									}
									if (arg0 == 4103) {
										local3965 = aStringArray32[--anInt7731];
										aStringArray32[anInt7731++] = local3965.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray32[anInt7731++] = method6324(anIntArray557[--anInt7724]);
										return;
									}
									if (arg0 == 4105) {
										anInt7731 -= 2;
										local3965 = aStringArray32[anInt7731];
										local1145 = aStringArray32[anInt7731 + 1];
										if (Static328.aClass4_Sub1_Sub1_Sub2_2.aClass123_1 != null && Static328.aClass4_Sub1_Sub1_Sub2_2.aClass123_1.aBoolean251) {
											aStringArray32[anInt7731++] = local1145;
											return;
										}
										aStringArray32[anInt7731++] = local3965;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray557[--anInt7724];
										aStringArray32[anInt7731++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt7731 -= 2;
										anIntArray557[anInt7724++] = Static209.method3708(aStringArray32[anInt7731], aStringArray32[anInt7731 + 1], Static25.anInt769);
										return;
									}
									@Pc(7941) Class327 local7941;
									if (arg0 == 4108) {
										local3965 = aStringArray32[--anInt7731];
										anInt7724 -= 2;
										local19 = anIntArray557[anInt7724];
										local25 = anIntArray557[anInt7724 + 1];
										local7941 = Static141.method2763(local25, Static264.aClass251_66);
										anIntArray557[anInt7724++] = local7941.method7192(local19, local3965, Static241.aClass58Array12);
										return;
									}
									if (arg0 == 4109) {
										local3965 = aStringArray32[--anInt7731];
										anInt7724 -= 2;
										local19 = anIntArray557[anInt7724];
										local25 = anIntArray557[anInt7724 + 1];
										local7941 = Static141.method2763(local25, Static264.aClass251_66);
										anIntArray557[anInt7724++] = local7941.method7189(local19, local3965, Static241.aClass58Array12);
										return;
									}
									if (arg0 == 4110) {
										anInt7731 -= 2;
										local3965 = aStringArray32[anInt7731];
										local1145 = aStringArray32[anInt7731 + 1];
										if (anIntArray557[--anInt7724] == 1) {
											aStringArray32[anInt7731++] = local3965;
											return;
										}
										aStringArray32[anInt7731++] = local1145;
										return;
									}
									if (arg0 == 4111) {
										local3965 = aStringArray32[--anInt7731];
										aStringArray32[anInt7731++] = Static170.method3177(local3965);
										return;
									}
									if (arg0 == 4112) {
										local3965 = aStringArray32[--anInt7731];
										local19 = anIntArray557[--anInt7724];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray32[anInt7731++] = local3965 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Static139.method2741((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Static503.method6799((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Static407.method5946((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Static105.method1886((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3965 = aStringArray32[--anInt7731];
										if (local3965 != null) {
											anIntArray557[anInt7724++] = local3965.length();
											return;
										}
										anIntArray557[anInt7724++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3965 = aStringArray32[--anInt7731];
										anInt7724 -= 2;
										local19 = anIntArray557[anInt7724];
										local25 = anIntArray557[anInt7724 + 1];
										aStringArray32[anInt7731++] = local3965.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3965 = aStringArray32[--anInt7731];
										@Pc(8304) StringBuffer local8304 = new StringBuffer(local3965.length());
										@Pc(8306) boolean local8306 = false;
										for (local353 = 0; local353 < local3965.length(); local353++) {
											@Pc(8313) char local8313 = local3965.charAt(local353);
											if (local8313 == '<') {
												local8306 = true;
											} else if (local8313 == '>') {
												local8306 = false;
											} else if (!local8306) {
												local8304.append(local8313);
											}
										}
										aStringArray32[anInt7731++] = local8304.toString();
										return;
									}
									if (arg0 == 4120) {
										local3965 = aStringArray32[--anInt7731];
										anInt7724 -= 2;
										local19 = anIntArray557[anInt7724];
										local25 = anIntArray557[anInt7724 + 1];
										anIntArray557[anInt7724++] = local3965.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt7731 -= 2;
										local3965 = aStringArray32[anInt7731];
										local1145 = aStringArray32[anInt7731 + 1];
										local25 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = local3965.indexOf(local1145, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray557[--anInt7724] != 0;
										local19 = anIntArray557[--anInt7724];
										aStringArray32[anInt7731++] = Static58.method1226(0, (long) local19, local412, Static25.anInt769);
										return;
									}
									if (arg0 == 4125) {
										local3965 = aStringArray32[--anInt7731];
										local19 = anIntArray557[--anInt7724];
										@Pc(8527) Class327 local8527 = Static141.method2763(local19, Static264.aClass251_66);
										anIntArray557[anInt7724++] = local8527.method7198(local3965, Static241.aClass58Array12);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray557[--anInt7724];
										aStringArray32[anInt7731++] = Static444.aClass322_2.method7141(local13).aString58;
										return;
									}
									@Pc(8589) Class237 local8589;
									if (arg0 == 4201) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										local8589 = Static444.aClass322_2.method7141(local13);
										if (local19 >= 1 && local19 <= 5 && local8589.aStringArray26[local19 - 1] != null) {
											aStringArray32[anInt7731++] = local8589.aStringArray26[local19 - 1];
											return;
										}
										aStringArray32[anInt7731++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										local8589 = Static444.aClass322_2.method7141(local13);
										if (local19 >= 1 && local19 <= 5 && local8589.aStringArray25[local19 - 1] != null) {
											aStringArray32[anInt7731++] = local8589.aStringArray25[local19 - 1];
											return;
										}
										aStringArray32[anInt7731++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Static444.aClass322_2.method7141(local13).anInt6541;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Static444.aClass322_2.method7141(local13).anInt6524 == 1 ? 1 : 0;
										return;
									}
									@Pc(8752) Class237 local8752;
									if (arg0 == 4205) {
										local13 = anIntArray557[--anInt7724];
										local8752 = Static444.aClass322_2.method7141(local13);
										if (local8752.anInt6539 == -1 && local8752.anInt6520 >= 0) {
											anIntArray557[anInt7724++] = local8752.anInt6520;
											return;
										}
										anIntArray557[anInt7724++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray557[--anInt7724];
										local8752 = Static444.aClass322_2.method7141(local13);
										if (local8752.anInt6539 >= 0 && local8752.anInt6520 >= 0) {
											anIntArray557[anInt7724++] = local8752.anInt6520;
											return;
										}
										anIntArray557[anInt7724++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Static444.aClass322_2.method7141(local13).aBoolean452 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										local3068 = Static577.aClass185_2.method4519(local19);
										if (local3068.method7085()) {
											aStringArray32[anInt7731++] = Static444.aClass322_2.method7141(local13).method5543(local3068.aString96, local19);
											return;
										}
										anIntArray557[anInt7724++] = Static444.aClass322_2.method7141(local13).method5531(local3068.anInt8653, local19);
										return;
									}
									if (arg0 == 4209) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1] - 1;
										local8589 = Static444.aClass322_2.method7141(local13);
										if (local8589.anInt6534 == local19) {
											anIntArray557[anInt7724++] = local8589.anInt6543;
											return;
										}
										if (local8589.anInt6508 == local19) {
											anIntArray557[anInt7724++] = local8589.anInt6536;
											return;
										}
										anIntArray557[anInt7724++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3965 = aStringArray32[--anInt7731];
										local19 = anIntArray557[--anInt7724];
										Static243.method4229(local19 == 1, local3965);
										anIntArray557[anInt7724++] = Static148.anInt3249;
										return;
									}
									if (arg0 == 4211) {
										if (Static113.aShortArray14 != null && Static234.anInt4753 < Static148.anInt3249) {
											anIntArray557[anInt7724++] = Static113.aShortArray14[Static234.anInt4753++] & 0xFFFF;
											return;
										}
										anIntArray557[anInt7724++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static234.anInt4753 = 0;
										return;
									}
									if (arg0 == 4213) {
										local13 = anIntArray557[--anInt7724];
										anIntArray557[anInt7724++] = Static444.aClass322_2.method7141(local13).anInt6555;
										return;
									}
									if (arg0 == 4214) {
										local3965 = aStringArray32[--anInt7731];
										anInt7724 -= 3;
										local19 = anIntArray557[anInt7724];
										local25 = anIntArray557[anInt7724 + 1];
										local353 = anIntArray557[anInt7724 + 2];
										Static35.method1831(local3965, local353, local25, local19 == 1);
										anIntArray557[anInt7724++] = Static148.anInt3249;
										return;
									}
									if (arg0 == 4215) {
										anInt7731 -= 2;
										anInt7724 -= 2;
										local3965 = aStringArray32[anInt7731];
										local19 = anIntArray557[anInt7724];
										local25 = anIntArray557[anInt7724 + 1];
										@Pc(9151) String local9151 = aStringArray32[anInt7731 + 1];
										Static264.method4415(local3965, local9151, local25, local19 == 1);
										anIntArray557[anInt7724++] = Static148.anInt3249;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										local3068 = Static577.aClass185_2.method4519(local19);
										if (local3068.method7085()) {
											aStringArray32[anInt7731++] = Static577.aClass125_2.method3229(local13).method6164(local19, local3068.aString96);
											return;
										}
										anIntArray557[anInt7724++] = Static577.aClass125_2.method3229(local13).method6154(local19, local3068.anInt8653);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										local3068 = Static577.aClass185_2.method4519(local19);
										if (local3068.method7085()) {
											aStringArray32[anInt7731++] = Static412.aClass307_4.method6636(local13).method5787(local19, local3068.aString96);
											return;
										}
										anIntArray557[anInt7724++] = Static412.aClass307_4.method6636(local13).method5798(local3068.anInt8653, local19);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt7724 -= 2;
										local13 = anIntArray557[anInt7724];
										local19 = anIntArray557[anInt7724 + 1];
										local3068 = Static577.aClass185_2.method4519(local19);
										if (local3068.method7085()) {
											aStringArray32[anInt7731++] = Static121.aClass99_1.method2779(local13).method7068(local19, local3068.aString96);
											return;
										}
										anIntArray557[anInt7724++] = Static121.aClass99_1.method2779(local13).method7067(local19, local3068.anInt8653);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray557[--anInt7724];
									@Pc(9379) Class118 local9379 = Static333.aClass149_1.method3770(local13);
									if (local9379.anIntArray206 != null && local9379.anIntArray206.length > 0) {
										local25 = 0;
										local353 = local9379.anIntArray208[0];
										for (local2334 = 1; local2334 < local9379.anIntArray206.length; local2334++) {
											if (local9379.anIntArray208[local2334] > local353) {
												local25 = local2334;
												local353 = local9379.anIntArray208[local2334];
											}
										}
										anIntArray557[anInt7724++] = local9379.anIntArray206[local25];
										return;
									}
									anIntArray557[anInt7724++] = local9379.anInt3613;
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
}
