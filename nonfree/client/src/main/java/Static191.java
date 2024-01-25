import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "Lclient!at;")
	private static Class16 aClass16_10;

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "Lclient!at;")
	private static Class16 aClass16_11;

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "Lclient!st;")
	private static Class231 aClass231_1;

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray14;

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "[I")
	private static int[] anIntArray262;

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "[I")
	private static final int[] anIntArray260 = new int[1000];

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "[I")
	private static final int[] anIntArray261 = new int[5];

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
	private static int anInt3160 = 0;

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "[[I")
	private static final int[][] anIntArrayArray15 = new int[5][5000];

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "[Lclient!og;")
	private static final Class177[] aClass177Array1 = new Class177[50];

	@OriginalMember(owner = "client!jj", name = "t", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray15 = new String[1000];

	@OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
	private static int anInt3165 = 0;

	@OriginalMember(owner = "client!jj", name = "w", descriptor = "I")
	private static int anInt3166 = 0;

	@OriginalMember(owner = "client!jj", name = "y", descriptor = "Lclient!ka;")
	public static final Class132 aClass132_23 = new Class132(4);

	@OriginalMember(owner = "client!jj", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray16 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!jj", name = "A", descriptor = "[I")
	private static final int[] anIntArray263 = new int[3];

	@OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
	private static int anInt3169 = 0;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)Ljava/lang/String;")
	private static String method2557(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray16[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!wi;I)V")
	private static void method2558(@OriginalArg(0) Class2_Sub44 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray36;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub5_Sub5 local12 = Static388.method3888(local8);
		if (local12 == null) {
			return;
		}
		anIntArray262 = new int[local12.anInt2695];
		@Pc(21) int local21 = 0;
		aStringArray14 = new String[local12.anInt2694];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt7160;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt7161;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass16_20 == null ? -1 : arg0.aClass16_20.anInt293;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt7165;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass16_20 == null ? -1 : arg0.aClass16_20.anInt320;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass16_21 == null ? -1 : arg0.aClass16_21.anInt293;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass16_21 == null ? -1 : arg0.aClass16_21.anInt320;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt7158;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt7166;
				}
				anIntArray262[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString202;
				}
				aStringArray14[local27++] = local135;
			}
		}
		anInt3169 = arg0.anInt7162;
		method2565(local12, arg1);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!ub;II)V")
	public static void method2559(@OriginalArg(0) Class240 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub5_Sub5 local5 = Static115.method1747(arg0, arg2, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray262 = new int[local5.anInt2695];
		aStringArray14 = new String[local5.anInt2694];
		if (local5.aClass240_3 == Static251.aClass240_6 || local5.aClass240_3 == Static183.aClass240_4 || local5.aClass240_3 == Static352.aClass240_8) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static294.aClass16_5 != null) {
				local30 = Static294.aClass16_5.anInt316;
				local32 = Static294.aClass16_5.anInt269;
			}
			anIntArray262[0] = Static376.aClass203_1.method4918() - local30;
			anIntArray262[1] = Static376.aClass203_1.method4925() - local32;
		}
		method2565(local5, 200000);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method2561(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static440.anInt7085 == 0 && (Static409.aBoolean471 && !Static399.aBoolean464 || Static298.aBoolean16)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static409.aClass134_94.method2720(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static409.aClass134_94.method2720(0).length());
		} else if (local11.startsWith(Static37.aClass134_88.method2720(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static37.aClass134_88.method2720(0).length());
		} else if (local11.startsWith(Static318.aClass134_76.method2720(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static318.aClass134_76.method2720(0).length());
		} else if (local11.startsWith(Static422.aClass134_101.method2720(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static422.aClass134_101.method2720(0).length());
		} else if (local11.startsWith(Static335.aClass134_78.method2720(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static335.aClass134_78.method2720(0).length());
		} else if (local11.startsWith(Static90.aClass134_30.method2720(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static90.aClass134_30.method2720(0).length());
		} else if (local11.startsWith(Static78.aClass134_26.method2720(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static78.aClass134_26.method2720(0).length());
		} else if (local11.startsWith(Static90.aClass134_31.method2720(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static90.aClass134_31.method2720(0).length());
		} else if (local11.startsWith(Static2.aClass134_1.method2720(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static2.aClass134_1.method2720(0).length());
		} else if (local11.startsWith(Static403.aClass134_91.method2720(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static403.aClass134_91.method2720(0).length());
		} else if (local11.startsWith(Static300.aClass134_72.method2720(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static300.aClass134_72.method2720(0).length());
		} else if (local11.startsWith(Static24.aClass134_12.method2720(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static24.aClass134_12.method2720(0).length());
		} else if (Static331.anInt5597 != 0) {
			if (local11.startsWith(Static409.aClass134_94.method2720(Static331.anInt5597))) {
				local13 = 0;
				arg0 = arg0.substring(Static409.aClass134_94.method2720(Static331.anInt5597).length());
			} else if (local11.startsWith(Static37.aClass134_88.method2720(Static331.anInt5597))) {
				local13 = 1;
				arg0 = arg0.substring(Static37.aClass134_88.method2720(Static331.anInt5597).length());
			} else if (local11.startsWith(Static318.aClass134_76.method2720(Static331.anInt5597))) {
				local13 = 2;
				arg0 = arg0.substring(Static318.aClass134_76.method2720(Static331.anInt5597).length());
			} else if (local11.startsWith(Static422.aClass134_101.method2720(Static331.anInt5597))) {
				local13 = 3;
				arg0 = arg0.substring(Static422.aClass134_101.method2720(Static331.anInt5597).length());
			} else if (local11.startsWith(Static335.aClass134_78.method2720(Static331.anInt5597))) {
				local13 = 4;
				arg0 = arg0.substring(Static335.aClass134_78.method2720(Static331.anInt5597).length());
			} else if (local11.startsWith(Static90.aClass134_30.method2720(Static331.anInt5597))) {
				local13 = 5;
				arg0 = arg0.substring(Static90.aClass134_30.method2720(Static331.anInt5597).length());
			} else if (local11.startsWith(Static78.aClass134_26.method2720(Static331.anInt5597))) {
				local13 = 6;
				arg0 = arg0.substring(Static78.aClass134_26.method2720(Static331.anInt5597).length());
			} else if (local11.startsWith(Static90.aClass134_31.method2720(Static331.anInt5597))) {
				local13 = 7;
				arg0 = arg0.substring(Static90.aClass134_31.method2720(Static331.anInt5597).length());
			} else if (local11.startsWith(Static2.aClass134_1.method2720(Static331.anInt5597))) {
				local13 = 8;
				arg0 = arg0.substring(Static2.aClass134_1.method2720(Static331.anInt5597).length());
			} else if (local11.startsWith(Static403.aClass134_91.method2720(Static331.anInt5597))) {
				local13 = 9;
				arg0 = arg0.substring(Static403.aClass134_91.method2720(Static331.anInt5597).length());
			} else if (local11.startsWith(Static300.aClass134_72.method2720(Static331.anInt5597))) {
				local13 = 10;
				arg0 = arg0.substring(Static300.aClass134_72.method2720(Static331.anInt5597).length());
			} else if (local11.startsWith(Static24.aClass134_12.method2720(Static331.anInt5597))) {
				local13 = 11;
				arg0 = arg0.substring(Static24.aClass134_12.method2720(Static331.anInt5597).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static16.aClass134_10.method2720(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static16.aClass134_10.method2720(0).length());
		} else if (local11.startsWith(Static68.aClass134_73.method2720(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static68.aClass134_73.method2720(0).length());
		} else if (local11.startsWith(Static78.aClass134_27.method2720(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static78.aClass134_27.method2720(0).length());
		} else if (local11.startsWith(Static151.aClass134_51.method2720(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static151.aClass134_51.method2720(0).length());
		} else if (local11.startsWith(Static453.aClass134_105.method2720(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static453.aClass134_105.method2720(0).length());
		} else if (Static331.anInt5597 != 0) {
			if (local11.startsWith(Static16.aClass134_10.method2720(Static331.anInt5597))) {
				local451 = 1;
				arg0 = arg0.substring(Static16.aClass134_10.method2720(Static331.anInt5597).length());
			} else if (local11.startsWith(Static68.aClass134_73.method2720(Static331.anInt5597))) {
				local451 = 2;
				arg0 = arg0.substring(Static68.aClass134_73.method2720(Static331.anInt5597).length());
			} else if (local11.startsWith(Static78.aClass134_27.method2720(Static331.anInt5597))) {
				local451 = 3;
				arg0 = arg0.substring(Static78.aClass134_27.method2720(Static331.anInt5597).length());
			} else if (local11.startsWith(Static151.aClass134_51.method2720(Static331.anInt5597))) {
				local451 = 4;
				arg0 = arg0.substring(Static151.aClass134_51.method2720(Static331.anInt5597).length());
			} else if (local11.startsWith(Static453.aClass134_105.method2720(Static331.anInt5597))) {
				local451 = 5;
				arg0 = arg0.substring(Static453.aClass134_105.method2720(Static331.anInt5597).length());
			}
		}
		Static29.method451(Static426.aClass102_211);
		Static456.aClass2_Sub13_Sub2_2.method3602(0);
		@Pc(646) int local646 = Static456.aClass2_Sub13_Sub2_2.anInt4347;
		if (arg1 == 5021) {
			Static456.aClass2_Sub13_Sub2_2.method3602(1);
		} else if (arg1 == 5022) {
			Static456.aClass2_Sub13_Sub2_2.method3602(2);
		} else {
			Static456.aClass2_Sub13_Sub2_2.method3602(0);
		}
		Static456.aClass2_Sub13_Sub2_2.method3602(local13);
		Static456.aClass2_Sub13_Sub2_2.method3602(local451);
		Static457.method5713(arg0, Static456.aClass2_Sub13_Sub2_2);
		Static456.aClass2_Sub13_Sub2_2.method3562(Static456.aClass2_Sub13_Sub2_2.anInt4347 - local646);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!wi;)V")
	public static void method2562(@OriginalArg(0) Class2_Sub44 arg0) {
		method2558(arg0, 200000);
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "()V")
	public static void method2563() {
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)V")
	private static void method2564(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class16 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class16 local35;
		@Pc(158) Class16 local158;
		@Pc(210) Class16 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt3165 -= 3;
				local13 = anIntArray260[anInt3165];
				local19 = anIntArray260[anInt3165 + 1];
				local25 = anIntArray260[anInt3165 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static338.method4534(local13);
				if (local35.aClass16Array1 == null) {
					local35.aClass16Array1 = new Class16[local25 + 1];
				}
				if (local35.aClass16Array1.length <= local25) {
					@Pc(54) Class16[] local54 = new Class16[local25 + 1];
					for (local56 = 0; local56 < local35.aClass16Array1.length; local56++) {
						local54[local56] = local35.aClass16Array1[local56];
					}
					local35.aClass16Array1 = local54;
				}
				if (local25 > 0 && local35.aClass16Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class16 local99 = new Class16();
				local99.anInt298 = local19;
				local99.anInt324 = local99.anInt293 = local35.anInt293;
				local99.anInt320 = local25;
				local35.aClass16Array1[local25] = local99;
				if (arg1) {
					aClass16_11 = local99;
				} else {
					aClass16_10 = local99;
				}
				Static176.method70(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass16_11 : aClass16_10;
				if (local137.anInt320 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static338.method4534(local137.anInt293);
				local158.aClass16Array1[local137.anInt320] = null;
				Static176.method70(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static338.method4534(anIntArray260[--anInt3165]);
				local137.aClass16Array1 = null;
				Static176.method70(local137);
				return;
			}
			if (arg0 == 200) {
				anInt3165 -= 2;
				local13 = anIntArray260[anInt3165];
				local19 = anIntArray260[anInt3165 + 1];
				local210 = Static4.method73(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray260[anInt3165++] = 1;
					if (arg1) {
						aClass16_11 = local210;
						return;
					}
					aClass16_10 = local210;
					return;
				}
				anIntArray260[anInt3165++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray260[--anInt3165];
				local158 = Static338.method4534(local13);
				if (local158 != null) {
					anIntArray260[anInt3165++] = 1;
					if (arg1) {
						aClass16_11 = local158;
						return;
					}
					aClass16_10 = local158;
					return;
				}
				anIntArray260[anInt3165++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray260[--anInt3165];
				method2567(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray260[--anInt3165];
				method2568(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt3165 -= 2;
					local13 = anIntArray260[anInt3165];
					local19 = anIntArray260[anInt3165 + 1];
					for (local25 = 0; local25 < Static197.anIntArray285.length; local25++) {
						if (Static197.anIntArray285[local25] == local13) {
							Static60.aClass3_Sub4_Sub1_Sub2_1.aClass249_1.method5241(Static394.aClass47_2, local19, local25);
							return;
						}
					}
					for (local353 = 0; local353 < Static176.anIntArray6.length; local353++) {
						if (Static176.anIntArray6[local353] == local13) {
							Static60.aClass3_Sub4_Sub1_Sub2_1.aClass249_1.method5241(Static394.aClass47_2, local19, local353);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt3165 -= 2;
					local13 = anIntArray260[anInt3165];
					local19 = anIntArray260[anInt3165 + 1];
					Static60.aClass3_Sub4_Sub1_Sub2_1.aClass249_1.method5249(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray260[--anInt3165] != 0;
					Static60.aClass3_Sub4_Sub1_Sub2_1.aClass249_1.method5243(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static338.method4534(anIntArray260[--anInt3165]);
					} else {
						local137 = arg1 ? aClass16_11 : aClass16_10;
					}
					if (arg0 == 1100) {
						anInt3165 -= 2;
						local137.anInt279 = anIntArray260[anInt3165];
						if (local137.anInt279 > local137.anInt321 - local137.anInt294) {
							local137.anInt279 = local137.anInt321 - local137.anInt294;
						}
						if (local137.anInt279 < 0) {
							local137.anInt279 = 0;
						}
						local137.anInt284 = anIntArray260[anInt3165 + 1];
						if (local137.anInt284 > local137.anInt319 - local137.anInt285) {
							local137.anInt284 = local137.anInt319 - local137.anInt285;
						}
						if (local137.anInt284 < 0) {
							local137.anInt284 = 0;
						}
						Static176.method70(local137);
						if (local137.anInt320 == -1) {
							Static112.method3111(local137.anInt293);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt300 = anIntArray260[--anInt3165];
						Static176.method70(local137);
						if (local137.anInt320 == -1) {
							Static2.method5(local137.anInt293);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean28 = anIntArray260[--anInt3165] == 1;
						Static176.method70(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt257 = anIntArray260[--anInt3165];
						Static176.method70(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt286 = anIntArray260[--anInt3165];
						Static176.method70(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray260[--anInt3165];
						if (local137.anInt290 != local19) {
							local137.anInt290 = local19;
							Static176.method70(local137);
						}
						if (local137.anInt320 == -1) {
							Static245.method3117(local137.anInt293);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt281 = anIntArray260[--anInt3165];
						Static176.method70(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean34 = anIntArray260[--anInt3165] == 1;
						Static176.method70(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt310 = 1;
						local137.anInt305 = anIntArray260[--anInt3165];
						Static176.method70(local137);
						if (local137.anInt320 == -1) {
							Static92.method1460(local137.anInt293);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt3165 -= 6;
						local137.lb = anIntArray260[anInt3165];
						local137.anInt271 = anIntArray260[anInt3165 + 1];
						local137.anInt335 = anIntArray260[anInt3165 + 2];
						local137.anInt308 = anIntArray260[anInt3165 + 3];
						local137.anInt295 = anIntArray260[anInt3165 + 4];
						local137.anInt330 = anIntArray260[anInt3165 + 5];
						Static176.method70(local137);
						if (local137.anInt320 == -1) {
							Static108.method1680(local137.anInt293);
							Static447.method5638(local137.anInt293);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray260[--anInt3165];
						if (local137.anInt278 != local19) {
							local137.anInt278 = local19;
							local137.anInt304 = 0;
							local137.anInt299 = 1;
							local137.anInt309 = 0;
							Static176.method70(local137);
						}
						if (local137.anInt320 == -1) {
							Static428.method5372(local137.anInt293);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean37 = anIntArray260[--anInt3165] == 1;
						Static176.method70(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray15[--anInt3160];
						if (!local1101.equals(local137.aString16)) {
							local137.aString16 = local1101;
							Static176.method70(local137);
						}
						if (local137.anInt320 == -1) {
							Static388.method3889(local137.anInt293);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt266 = anIntArray260[--anInt3165];
						Static176.method70(local137);
						if (local137.anInt320 == -1) {
							Static321.method4361(local137.anInt293);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt3165 -= 3;
						local137.anInt270 = anIntArray260[anInt3165];
						local137.anInt275 = anIntArray260[anInt3165 + 1];
						local137.anInt263 = anIntArray260[anInt3165 + 2];
						Static176.method70(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean36 = anIntArray260[--anInt3165] == 1;
						Static176.method70(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt292 = anIntArray260[--anInt3165];
						Static176.method70(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt260 = anIntArray260[--anInt3165];
						Static176.method70(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean31 = anIntArray260[--anInt3165] == 1;
						Static176.method70(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean30 = anIntArray260[--anInt3165] == 1;
						Static176.method70(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt3165 -= 2;
						local137.anInt321 = anIntArray260[anInt3165];
						local137.anInt319 = anIntArray260[anInt3165 + 1];
						Static176.method70(local137);
						if (local137.anInt298 == 0) {
							Static399.method5068(false, local137);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt3165 -= 2;
						local137.anInt337 = (short) anIntArray260[anInt3165];
						local137.anInt334 = (short) anIntArray260[anInt3165 + 1];
						Static176.method70(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean35 = anIntArray260[--anInt3165] == 1;
						Static176.method70(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt330 = anIntArray260[--anInt3165];
						Static176.method70(local137);
						if (local137.anInt320 == -1) {
							Static108.method1680(local137.anInt293);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray260[--anInt3165];
						local137.aBoolean25 = local19 == 1;
						Static176.method70(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt3165 -= 2;
						local137.anInt314 = anIntArray260[anInt3165];
						local137.anInt315 = anIntArray260[anInt3165 + 1];
						Static176.method70(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt312 = anIntArray260[--anInt3165];
						Static176.method70(local137);
						return;
					}
					@Pc(1454) Class200 local1454;
					if (arg0 == 1127) {
						anInt3165 -= 2;
						local19 = anIntArray260[anInt3165];
						local25 = anIntArray260[anInt3165 + 1];
						local1454 = Static234.aClass135_1.method2749(local19);
						if (local25 != local1454.anInt5511) {
							local137.method247(local19, local25);
							return;
						}
						local137.method243(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray260[--anInt3165];
						local1488 = aStringArray15[--anInt3160];
						local1454 = Static234.aClass135_1.method2749(local19);
						if (!local1454.aString154.equals(local1488)) {
							local137.method246(local19, local1488);
							return;
						}
						local137.method243(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static338.method4534(anIntArray260[--anInt3165]);
							} else {
								local137 = arg1 ? aClass16_11 : aClass16_10;
							}
							local1101 = aStringArray15[--anInt3160];
							@Pc(2369) int[] local2369 = null;
							if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
								local353 = anIntArray260[--anInt3165];
								if (local353 > 0) {
									local2369 = new int[local353];
									while (local353-- > 0) {
										local2369[local353] = anIntArray260[--anInt3165];
									}
								}
								local1101 = local1101.substring(0, local1101.length() - 1);
							}
							@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
							for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
								if (local1101.charAt(local2290 - 1) == 's') {
									local2421[local2290] = aStringArray15[--anInt3160];
								} else {
									local2421[local2290] = Integer.valueOf(anIntArray260[--anInt3165]);
								}
							}
							local56 = anIntArray260[--anInt3165];
							if (local56 == -1) {
								local2421 = null;
							} else {
								local2421[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray27 = local2421;
							} else if (arg0 == 1401) {
								local137.anObjectArray30 = local2421;
							} else if (arg0 == 1402) {
								local137.anObjectArray15 = local2421;
							} else if (arg0 == 1403) {
								local137.anObjectArray28 = local2421;
							} else if (arg0 == 1404) {
								local137.anObjectArray16 = local2421;
							} else if (arg0 == 1405) {
								local137.anObjectArray1 = local2421;
							} else if (arg0 == 1406) {
								local137.anObjectArray5 = local2421;
							} else if (arg0 == 1407) {
								local137.anObjectArray24 = local2421;
								local137.anIntArray28 = local2369;
							} else if (arg0 == 1408) {
								local137.anObjectArray3 = local2421;
							} else if (arg0 == 1409) {
								local137.anObjectArray29 = local2421;
							} else if (arg0 == 1410) {
								local137.anObjectArray31 = local2421;
							} else if (arg0 == 1411) {
								local137.anObjectArray19 = local2421;
							} else if (arg0 == 1412) {
								local137.anObjectArray25 = local2421;
							} else if (arg0 == 1414) {
								local137.anObjectArray4 = local2421;
								local137.anIntArray29 = local2369;
							} else if (arg0 == 1415) {
								local137.anObjectArray8 = local2421;
								local137.anIntArray26 = local2369;
							} else if (arg0 == 1416) {
								local137.anObjectArray7 = local2421;
							} else if (arg0 == 1417) {
								local137.anObjectArray9 = local2421;
							} else if (arg0 == 1418) {
								local137.anObjectArray6 = local2421;
							} else if (arg0 == 1419) {
								local137.anObjectArray10 = local2421;
							} else if (arg0 == 1420) {
								local137.anObjectArray18 = local2421;
							} else if (arg0 == 1421) {
								local137.anObjectArray11 = local2421;
							} else if (arg0 == 1422) {
								local137.anObjectArray2 = local2421;
							} else if (arg0 == 1423) {
								local137.anObjectArray26 = local2421;
							} else if (arg0 == 1424) {
								local137.anObjectArray12 = local2421;
							} else if (arg0 == 1425) {
								local137.anObjectArray13 = local2421;
							} else if (arg0 == 1426) {
								local137.anObjectArray14 = local2421;
							} else if (arg0 == 1427) {
								local137.anObjectArray22 = local2421;
							} else if (arg0 == 1428) {
								local137.anObjectArray21 = local2421;
								local137.anIntArray27 = local2369;
							} else if (arg0 == 1429) {
								local137.anObjectArray17 = local2421;
								local137.anIntArray25 = local2369;
							} else if (arg0 == 1430) {
								local137.anObjectArray23 = local2421;
							}
							local137.aBoolean22 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass16_11 : aClass16_10;
							if (arg0 == 1500) {
								anIntArray260[anInt3165++] = local137.anInt316;
								return;
							}
							if (arg0 == 1501) {
								anIntArray260[anInt3165++] = local137.anInt269;
								return;
							}
							if (arg0 == 1502) {
								anIntArray260[anInt3165++] = local137.anInt294;
								return;
							}
							if (arg0 == 1503) {
								anIntArray260[anInt3165++] = local137.anInt285;
								return;
							}
							if (arg0 == 1504) {
								anIntArray260[anInt3165++] = local137.aBoolean27 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray260[anInt3165++] = local137.anInt324;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static399.method5069(local137);
								anIntArray260[anInt3165++] = local158 == null ? -1 : local158.anInt293;
								return;
							}
						} else {
							@Pc(3017) Class200 local3017;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass16_11 : aClass16_10;
								if (arg0 == 1600) {
									anIntArray260[anInt3165++] = local137.anInt279;
									return;
								}
								if (arg0 == 1601) {
									anIntArray260[anInt3165++] = local137.anInt284;
									return;
								}
								if (arg0 == 1602) {
									aStringArray15[anInt3160++] = local137.aString16;
									return;
								}
								if (arg0 == 1603) {
									anIntArray260[anInt3165++] = local137.anInt321;
									return;
								}
								if (arg0 == 1604) {
									anIntArray260[anInt3165++] = local137.anInt319;
									return;
								}
								if (arg0 == 1605) {
									anIntArray260[anInt3165++] = local137.anInt330;
									return;
								}
								if (arg0 == 1606) {
									anIntArray260[anInt3165++] = local137.anInt335;
									return;
								}
								if (arg0 == 1607) {
									anIntArray260[anInt3165++] = local137.anInt295;
									return;
								}
								if (arg0 == 1608) {
									anIntArray260[anInt3165++] = local137.anInt308;
									return;
								}
								if (arg0 == 1609) {
									anIntArray260[anInt3165++] = local137.anInt257;
									return;
								}
								if (arg0 == 1610) {
									anIntArray260[anInt3165++] = local137.lb;
									return;
								}
								if (arg0 == 1611) {
									anIntArray260[anInt3165++] = local137.anInt271;
									return;
								}
								if (arg0 == 1612) {
									anIntArray260[anInt3165++] = local137.anInt290;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray260[--anInt3165];
									local3017 = Static234.aClass135_1.method2749(local19);
									if (local3017.method4356()) {
										aStringArray15[anInt3160++] = local137.method238(local3017.aString154, local19);
										return;
									}
									anIntArray260[anInt3165++] = local137.method236(local3017.anInt5511, local19);
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass16_11 : aClass16_10;
								if (arg0 == 1700) {
									anIntArray260[anInt3165++] = local137.anInt301;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt301 != -1) {
										anIntArray260[anInt3165++] = local137.anInt297;
										return;
									}
									anIntArray260[anInt3165++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray260[anInt3165++] = local137.anInt320;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass16_11 : aClass16_10;
								if (arg0 == 1800) {
									anIntArray260[anInt3165++] = Static55.method815(local137).method1538();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray260[--anInt3165];
									local19--;
									if (local137.aStringArray3 != null && local19 < local137.aStringArray3.length && local137.aStringArray3[local19] != null) {
										aStringArray15[anInt3160++] = local137.aStringArray3[local19];
										return;
									}
									aStringArray15[anInt3160++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString13 == null) {
										aStringArray15[anInt3160++] = "";
										return;
									}
									aStringArray15[anInt3160++] = local137.aString13;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static338.method4534(anIntArray260[--anInt3165]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass16_11 : aClass16_10;
								}
								if (anInt3169 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray22 == null) {
										return;
									}
									@Pc(3254) Class2_Sub44 local3254 = new Class2_Sub44();
									local3254.aClass16_20 = local137;
									local3254.anObjectArray36 = local137.anObjectArray22;
									local3254.anInt7162 = anInt3169 + 1;
									Static37.aClass156_54.method3157(local3254);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static338.method4534(anIntArray260[--anInt3165]);
								if (arg0 == 2500) {
									anIntArray260[anInt3165++] = local137.anInt316;
									return;
								}
								if (arg0 == 2501) {
									anIntArray260[anInt3165++] = local137.anInt269;
									return;
								}
								if (arg0 == 2502) {
									anIntArray260[anInt3165++] = local137.anInt294;
									return;
								}
								if (arg0 == 2503) {
									anIntArray260[anInt3165++] = local137.anInt285;
									return;
								}
								if (arg0 == 2504) {
									anIntArray260[anInt3165++] = local137.aBoolean27 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray260[anInt3165++] = local137.anInt324;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static399.method5069(local137);
									anIntArray260[anInt3165++] = local158 == null ? -1 : local158.anInt293;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static338.method4534(anIntArray260[--anInt3165]);
								if (arg0 == 2600) {
									anIntArray260[anInt3165++] = local137.anInt279;
									return;
								}
								if (arg0 == 2601) {
									anIntArray260[anInt3165++] = local137.anInt284;
									return;
								}
								if (arg0 == 2602) {
									aStringArray15[anInt3160++] = local137.aString16;
									return;
								}
								if (arg0 == 2603) {
									anIntArray260[anInt3165++] = local137.anInt321;
									return;
								}
								if (arg0 == 2604) {
									anIntArray260[anInt3165++] = local137.anInt319;
									return;
								}
								if (arg0 == 2605) {
									anIntArray260[anInt3165++] = local137.anInt330;
									return;
								}
								if (arg0 == 2606) {
									anIntArray260[anInt3165++] = local137.anInt335;
									return;
								}
								if (arg0 == 2607) {
									anIntArray260[anInt3165++] = local137.anInt295;
									return;
								}
								if (arg0 == 2608) {
									anIntArray260[anInt3165++] = local137.anInt308;
									return;
								}
								if (arg0 == 2609) {
									anIntArray260[anInt3165++] = local137.anInt257;
									return;
								}
								if (arg0 == 2610) {
									anIntArray260[anInt3165++] = local137.lb;
									return;
								}
								if (arg0 == 2611) {
									anIntArray260[anInt3165++] = local137.anInt271;
									return;
								}
								if (arg0 == 2612) {
									anIntArray260[anInt3165++] = local137.anInt290;
									return;
								}
							} else {
								@Pc(3751) Class2_Sub21 local3751;
								@Pc(3649) Class2_Sub21 local3649;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static338.method4534(anIntArray260[--anInt3165]);
										anIntArray260[anInt3165++] = local137.anInt301;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static338.method4534(anIntArray260[--anInt3165]);
										if (local137.anInt301 != -1) {
											anIntArray260[anInt3165++] = local137.anInt297;
											return;
										}
										anIntArray260[anInt3165++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray260[--anInt3165];
										local3649 = (Class2_Sub21) Static418.aClass72_44.method1659((long) local13);
										if (local3649 != null) {
											anIntArray260[anInt3165++] = 1;
											return;
										}
										anIntArray260[anInt3165++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static338.method4534(anIntArray260[--anInt3165]);
										if (local137.aClass16Array1 == null) {
											anIntArray260[anInt3165++] = 0;
											return;
										}
										local19 = local137.aClass16Array1.length;
										for (local25 = 0; local25 < local137.aClass16Array1.length; local25++) {
											if (local137.aClass16Array1[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray260[anInt3165++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt3165 -= 2;
										local13 = anIntArray260[anInt3165];
										local19 = anIntArray260[anInt3165 + 1];
										local3751 = (Class2_Sub21) Static418.aClass72_44.method1659((long) local13);
										if (local3751 != null && local3751.anInt2585 == local19) {
											anIntArray260[anInt3165++] = 1;
											return;
										}
										anIntArray260[anInt3165++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static338.method4534(anIntArray260[--anInt3165]);
									if (arg0 == 2800) {
										anIntArray260[anInt3165++] = Static55.method815(local137).method1538();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray260[--anInt3165];
										local19--;
										if (local137.aStringArray3 != null && local19 < local137.aStringArray3.length && local137.aStringArray3[local19] != null) {
											aStringArray15[anInt3160++] = local137.aStringArray3[local19];
											return;
										}
										aStringArray15[anInt3160++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString13 == null) {
											aStringArray15[anInt3160++] = "";
											return;
										}
										aStringArray15[anInt3160++] = local137.aString13;
										return;
									}
								} else {
									@Pc(3888) String local3888;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local3888 = aStringArray15[--anInt3160];
											Static12.method159(local3888);
											return;
										}
										if (arg0 == 3101) {
											anInt3165 -= 2;
											Static376.method4879(anIntArray260[anInt3165 + 1], Static60.aClass3_Sub4_Sub1_Sub2_1, anIntArray260[anInt3165]);
											return;
										}
										if (arg0 == 3103) {
											Static257.method3280();
											return;
										}
										if (arg0 == 3104) {
											local3888 = aStringArray15[--anInt3160];
											local19 = 0;
											if (Static189.method2546(local3888)) {
												local19 = Static205.method2736(local3888);
											}
											Static29.method451(Static175.aClass102_105);
											Static456.aClass2_Sub13_Sub2_2.method3569(local19);
											return;
										}
										if (arg0 == 3105) {
											local3888 = aStringArray15[--anInt3160];
											Static29.method451(Static426.aClass102_212);
											Static456.aClass2_Sub13_Sub2_2.method3602(local3888.length() + 1);
											Static456.aClass2_Sub13_Sub2_2.method3590(local3888);
											return;
										}
										if (arg0 == 3106) {
											local3888 = aStringArray15[--anInt3160];
											Static29.method451(Static270.aClass102_129);
											Static456.aClass2_Sub13_Sub2_2.method3602(local3888.length() + 1);
											Static456.aClass2_Sub13_Sub2_2.method3590(local3888);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray260[--anInt3165];
											local1101 = aStringArray15[--anInt3160];
											Static381.method4901(local13, local1101);
											return;
										}
										if (arg0 == 3108) {
											anInt3165 -= 3;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											local25 = anIntArray260[anInt3165 + 2];
											local35 = Static338.method4534(local25);
											Static80.method3758(local19, local35, local13);
											return;
										}
										if (arg0 == 3109) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											local210 = arg1 ? aClass16_11 : aClass16_10;
											Static80.method3758(local19, local210, local13);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray260[--anInt3165];
											Static29.method451(Static324.aClass102_160);
											Static456.aClass2_Sub13_Sub2_2.method3568(local13);
											return;
										}
										if (arg0 == 3111) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											local3751 = (Class2_Sub21) Static418.aClass72_44.method1659((long) local13);
											if (local3751 != null) {
												Static74.method1091(local3751, true, local3751.anInt2585 != local19);
											}
											Static458.method5733(local19, 3, local13, true);
											return;
										}
										if (arg0 == 3112) {
											anInt3165--;
											local13 = anIntArray260[anInt3165];
											local3649 = (Class2_Sub21) Static418.aClass72_44.method1659((long) local13);
											if (local3649 != null && local3649.anInt2586 == 3) {
												Static74.method1091(local3649, true, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static457.method5716(aStringArray15[--anInt3160]);
											return;
										}
										if (arg0 == 3114) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											local1488 = aStringArray15[--anInt3160];
											Static166.method2340("", local19, local13, local1488, "");
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt3165 -= 3;
											Static97.method1503(255, anIntArray260[anInt3165 + 2], anIntArray260[anInt3165], anIntArray260[anInt3165 + 1]);
											return;
										}
										if (arg0 == 3201) {
											Static89.method1411(50, 255, anIntArray260[--anInt3165]);
											return;
										}
										if (arg0 == 3202) {
											anInt3165 -= 2;
											Static442.method5595(anIntArray260[anInt3165], anIntArray260[anInt3165 + 1], 255);
											return;
										}
										if (arg0 == 3203) {
											anInt3165 -= 4;
											Static97.method1503(anIntArray260[anInt3165 + 3], anIntArray260[anInt3165 + 2], anIntArray260[anInt3165], anIntArray260[anInt3165 + 1]);
											return;
										}
										if (arg0 == 3204) {
											anInt3165 -= 3;
											Static89.method1411(anIntArray260[anInt3165 + 2], anIntArray260[anInt3165 + 1], anIntArray260[anInt3165]);
											return;
										}
										if (arg0 == 3205) {
											anInt3165 -= 3;
											Static442.method5595(anIntArray260[anInt3165], anIntArray260[anInt3165 + 1], anIntArray260[anInt3165 + 2]);
											return;
										}
										if (arg0 == 3206) {
											anInt3165 -= 4;
											Static380.method360(anIntArray260[anInt3165 + 2], anIntArray260[anInt3165], anIntArray260[anInt3165 + 3], anIntArray260[anInt3165 + 1]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray260[anInt3165++] = Static266.anInt4392;
											return;
										}
										if (arg0 == 3301) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = Static8.method116(local19, local13, false);
											return;
										}
										if (arg0 == 3302) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = Static331.method4433(local19, false, local13);
											return;
										}
										if (arg0 == 3303) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = Static100.method1529(local13, false, local19);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = Static331.aClass271_1.method5708(local13).anInt6072;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = Static261.anIntArray178[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = Static99.anIntArray146[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = Static11.anIntArray13[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(4605) byte local4605 = Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91;
											local19 = (Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833 >> 7) + Static275.anInt4506;
											local25 = (Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835 >> 7) + Static209.anInt3497;
											anIntArray260[anInt3165++] = (local4605 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray260[anInt3165++] = Static47.aBoolean73 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = Static8.method116(local19, local13, true);
											return;
										}
										if (arg0 == 3314) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = Static331.method4433(local19, true, local13);
											return;
										}
										if (arg0 == 3315) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = Static100.method1529(local13, true, local19);
											return;
										}
										if (arg0 == 3316) {
											if (Static440.anInt7085 >= 2) {
												anIntArray260[anInt3165++] = Static440.anInt7085;
												return;
											}
											anIntArray260[anInt3165++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray260[anInt3165++] = Static375.anInt6248;
											return;
										}
										if (arg0 == 3318) {
											anIntArray260[anInt3165++] = Static14.aClass265_1.anInt7137;
											return;
										}
										if (arg0 == 3321) {
											anIntArray260[anInt3165++] = Static82.anInt1525;
											return;
										}
										if (arg0 == 3322) {
											anIntArray260[anInt3165++] = Static347.anInt5912;
											return;
										}
										if (arg0 == 3323) {
											if (Static18.anInt3417 >= 5 && Static18.anInt3417 <= 9) {
												anIntArray260[anInt3165++] = 1;
												return;
											}
											anIntArray260[anInt3165++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static18.anInt3417 >= 5 && Static18.anInt3417 <= 9) {
												anIntArray260[anInt3165++] = Static18.anInt3417;
												return;
											}
											anIntArray260[anInt3165++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray260[anInt3165++] = Static291.aBoolean337 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray260[anInt3165++] = Static60.aClass3_Sub4_Sub1_Sub2_1.anInt5001;
											return;
										}
										if (arg0 == 3327) {
											anIntArray260[anInt3165++] = Static60.aClass3_Sub4_Sub1_Sub2_1.aClass249_1.aBoolean484 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray260[anInt3165++] = Static298.aBoolean16 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = Static260.method3500(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = Static30.method458(false, local13, local19);
											return;
										}
										if (arg0 == 3332) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = Static30.method458(true, local13, local19);
											return;
										}
										if (arg0 == 3333) {
											anIntArray260[anInt3165++] = Static220.anInt3626;
											return;
										}
										if (arg0 == 3335) {
											anIntArray260[anInt3165++] = Static331.anInt5597;
											return;
										}
										if (arg0 == 3336) {
											anInt3165 -= 4;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											local25 = anIntArray260[anInt3165 + 2];
											local353 = anIntArray260[anInt3165 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local353;
											anIntArray260[anInt3165++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray260[anInt3165++] = Static294.anInt979;
											return;
										}
										if (arg0 == 3338) {
											anIntArray260[anInt3165++] = Static30.method460();
											return;
										}
										if (arg0 == 3339) {
											anIntArray260[anInt3165++] = Static238.aBoolean265 ? 1 : 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray260[anInt3165++] = Static26.aBoolean45 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray260[anInt3165++] = Static59.aBoolean185 ? 1 : 0;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5261) Class244 local5261;
										if (arg0 == 3400) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											local5261 = Static128.aClass11_1.method172(local13);
											aStringArray15[anInt3160++] = local5261.method5158(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt3165 -= 4;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											local25 = anIntArray260[anInt3165 + 2];
											local353 = anIntArray260[anInt3165 + 3];
											@Pc(5307) Class244 local5307 = Static128.aClass11_1.method172(local25);
											if (local5307.aChar5 == local13 && local5307.aChar4 == local19) {
												if (local19 == 115) {
													aStringArray15[anInt3160++] = local5307.method5158(local353);
													return;
												}
												anIntArray260[anInt3165++] = local5307.method5164(local353);
												return;
											}
											throw new RuntimeException("C3408-1");
										}
										if (arg0 == 3409) {
											anInt3165 -= 3;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											local25 = anIntArray260[anInt3165 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(5383) Class244 local5383 = Static128.aClass11_1.method172(local19);
											if (local5383.aChar4 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray260[anInt3165++] = local5383.method5167(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray260[--anInt3165];
											local1101 = aStringArray15[--anInt3160];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5261 = Static128.aClass11_1.method172(local13);
											if (local5261.aChar4 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray260[anInt3165++] = local5261.method5163(local1101) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray260[--anInt3165];
											@Pc(5481) Class244 local5481 = Static128.aClass11_1.method172(local13);
											anIntArray260[anInt3165++] = local5481.aClass72_42.method1652();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static252.anInt4055 == 0) {
												anIntArray260[anInt3165++] = -2;
												return;
											}
											if (Static252.anInt4055 == 1) {
												anIntArray260[anInt3165++] = -1;
												return;
											}
											anIntArray260[anInt3165++] = Static209.anInt3494;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray260[--anInt3165];
											if (Static252.anInt4055 == 2 && local13 < Static209.anInt3494) {
												aStringArray15[anInt3160++] = Static290.aStringArray29[local13];
												if (Static312.aStringArray31[local13] != null) {
													aStringArray15[anInt3160++] = Static312.aStringArray31[local13];
													return;
												}
												aStringArray15[anInt3160++] = "";
												return;
											}
											aStringArray15[anInt3160++] = "";
											aStringArray15[anInt3160++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray260[--anInt3165];
											if (Static252.anInt4055 == 2 && local13 < Static209.anInt3494) {
												anIntArray260[anInt3165++] = Static158.anIntArray186[local13];
												return;
											}
											anIntArray260[anInt3165++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray260[--anInt3165];
											if (Static252.anInt4055 == 2 && local13 < Static209.anInt3494) {
												anIntArray260[anInt3165++] = Static259.anIntArray361[local13];
												return;
											}
											anIntArray260[anInt3165++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local3888 = aStringArray15[--anInt3160];
											local19 = anIntArray260[--anInt3165];
											Static434.method5459(local19, local3888);
											return;
										}
										if (arg0 == 3605) {
											local3888 = aStringArray15[--anInt3160];
											Static150.method2177(local3888);
											return;
										}
										if (arg0 == 3606) {
											local3888 = aStringArray15[--anInt3160];
											Static92.method1463(local3888);
											return;
										}
										if (arg0 == 3607) {
											local3888 = aStringArray15[--anInt3160];
											Static196.method2640(local3888, false);
											return;
										}
										if (arg0 == 3608) {
											local3888 = aStringArray15[--anInt3160];
											Static273.method3663(local3888);
											return;
										}
										if (arg0 == 3609) {
											local3888 = aStringArray15[--anInt3160];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray260[anInt3165++] = Static407.method5162(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray260[--anInt3165];
											if (Static252.anInt4055 == 2 && local13 < Static209.anInt3494) {
												aStringArray15[anInt3160++] = Static14.aStringArray1[local13];
												return;
											}
											aStringArray15[anInt3160++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static441.aString195 != null) {
												aStringArray15[anInt3160++] = Static13.method165(Static441.aString195);
												return;
											}
											aStringArray15[anInt3160++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static441.aString195 != null) {
												anIntArray260[anInt3165++] = Static173.anInt6618;
												return;
											}
											anIntArray260[anInt3165++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray260[--anInt3165];
											if (Static441.aString195 != null && local13 < Static173.anInt6618) {
												aStringArray15[anInt3160++] = Static46.aClass237Array1[local13].aString180;
												return;
											}
											aStringArray15[anInt3160++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray260[--anInt3165];
											if (Static441.aString195 != null && local13 < Static173.anInt6618) {
												anIntArray260[anInt3165++] = Static46.aClass237Array1[local13].anInt6481;
												return;
											}
											anIntArray260[anInt3165++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray260[--anInt3165];
											if (Static441.aString195 != null && local13 < Static173.anInt6618) {
												anIntArray260[anInt3165++] = Static46.aClass237Array1[local13].aByte79;
												return;
											}
											anIntArray260[anInt3165++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray260[anInt3165++] = Static61.aByte7;
											return;
										}
										if (arg0 == 3617) {
											local3888 = aStringArray15[--anInt3160];
											Static311.method5192(local3888);
											return;
										}
										if (arg0 == 3618) {
											anIntArray260[anInt3165++] = Static101.aByte22;
											return;
										}
										if (arg0 == 3619) {
											local3888 = aStringArray15[--anInt3160];
											Static131.method1961(local3888);
											return;
										}
										if (arg0 == 3620) {
											Static203.method2714();
											return;
										}
										if (arg0 == 3621) {
											if (Static252.anInt4055 == 0) {
												anIntArray260[anInt3165++] = -1;
												return;
											}
											anIntArray260[anInt3165++] = Static291.anInt4793;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray260[--anInt3165];
											if (Static252.anInt4055 != 0 && local13 < Static291.anInt4793) {
												aStringArray15[anInt3160++] = Static200.aStringArray18[local13];
												if (Static417.aStringArray39[local13] != null) {
													aStringArray15[anInt3160++] = Static417.aStringArray39[local13];
													return;
												}
												aStringArray15[anInt3160++] = "";
												return;
											}
											aStringArray15[anInt3160++] = "";
											aStringArray15[anInt3160++] = "";
											return;
										}
										if (arg0 == 3623) {
											local3888 = aStringArray15[--anInt3160];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray260[anInt3165++] = Static214.method2831(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray260[--anInt3165];
											if (Static46.aClass237Array1 != null && local13 < Static173.anInt6618 && Static46.aClass237Array1[local13].aString181.equalsIgnoreCase(Static60.aClass3_Sub4_Sub1_Sub2_1.aString148)) {
												anIntArray260[anInt3165++] = 1;
												return;
											}
											anIntArray260[anInt3165++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static365.aString172 != null) {
												aStringArray15[anInt3160++] = Static365.aString172;
												return;
											}
											aStringArray15[anInt3160++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray260[--anInt3165];
											if (Static441.aString195 != null && local13 < Static173.anInt6618) {
												aStringArray15[anInt3160++] = Static46.aClass237Array1[local13].aString182;
												return;
											}
											aStringArray15[anInt3160++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray260[--anInt3165];
											if (Static252.anInt4055 == 2 && local13 >= 0 && local13 < Static209.anInt3494) {
												anIntArray260[anInt3165++] = Static240.aBooleanArray16[local13] ? 1 : 0;
												return;
											}
											anIntArray260[anInt3165++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local3888 = aStringArray15[--anInt3160];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray260[anInt3165++] = Static379.method5319(local3888);
											return;
										}
										if (arg0 == 3629) {
											anIntArray260[anInt3165++] = Static235.anInt3810;
											return;
										}
										if (arg0 == 3630) {
											local3888 = aStringArray15[--anInt3160];
											Static196.method2640(local3888, true);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = Static2.aBooleanArray1[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray260[--anInt3165];
											if (Static441.aString195 != null && local13 < Static173.anInt6618) {
												aStringArray15[anInt3160++] = Static46.aClass237Array1[local13].aString181;
												return;
											}
											aStringArray15[anInt3160++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray260[--anInt3165];
											if (Static252.anInt4055 != 0 && local13 < Static291.anInt4793) {
												aStringArray15[anInt3160++] = Static26.aStringArray4[local13];
												return;
											}
											aStringArray15[anInt3160++] = "";
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = Static315.aClass204Array1[local13].method4436();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = Static315.aClass204Array1[local13].anInt5590;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = Static315.aClass204Array1[local13].anInt5586;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = Static315.aClass204Array1[local13].anInt5593;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = Static315.aClass204Array1[local13].anInt5595;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = Static315.aClass204Array1[local13].anInt5594;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray260[--anInt3165];
											local19 = Static315.aClass204Array1[local13].method4437();
											anIntArray260[anInt3165++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray260[--anInt3165];
											local19 = Static315.aClass204Array1[local13].method4437();
											anIntArray260[anInt3165++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray260[--anInt3165];
											local19 = Static315.aClass204Array1[local13].method4437();
											anIntArray260[anInt3165++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray260[--anInt3165];
											local19 = Static315.aClass204Array1[local13].method4437();
											anIntArray260[anInt3165++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else if (arg0 < 4100) {
										if (arg0 == 4000) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = local13 + local19;
											return;
										}
										if (arg0 == 4001) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = local13 - local19;
											return;
										}
										if (arg0 == 4002) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = local13 * local19;
											return;
										}
										if (arg0 == 4003) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = local13 / local19;
											return;
										}
										if (arg0 == 4004) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = (int) (Math.random() * (double) local13);
											return;
										}
										if (arg0 == 4005) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = (int) (Math.random() * (double) (local13 + 1));
											return;
										}
										if (arg0 == 4006) {
											anInt3165 -= 5;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											local25 = anIntArray260[anInt3165 + 2];
											local353 = anIntArray260[anInt3165 + 3];
											local2290 = anIntArray260[anInt3165 + 4];
											anIntArray260[anInt3165++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
											return;
										}
										@Pc(6991) long local6991;
										@Pc(6984) long local6984;
										if (arg0 == 4007) {
											anInt3165 -= 2;
											local6984 = anIntArray260[anInt3165];
											local6991 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = (int) (local6984 + local6984 * local6991 / 100L);
											return;
										}
										if (arg0 == 4008) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = local13 | 0x1 << local19;
											return;
										}
										if (arg0 == 4009) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = local13 & -(0x1 << local19) - 1;
											return;
										}
										if (arg0 == 4010) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
											return;
										}
										if (arg0 == 4011) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = local13 % local19;
											return;
										}
										if (arg0 == 4012) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											if (local13 == 0) {
												anIntArray260[anInt3165++] = 0;
												return;
											}
											anIntArray260[anInt3165++] = (int) Math.pow((double) local13, (double) local19);
											return;
										}
										if (arg0 == 4013) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											if (local13 == 0) {
												anIntArray260[anInt3165++] = 0;
												return;
											}
											if (local19 == 0) {
												anIntArray260[anInt3165++] = Integer.MAX_VALUE;
												return;
											}
											anIntArray260[anInt3165++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
											return;
										}
										if (arg0 == 4014) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = local13 & local19;
											return;
										}
										if (arg0 == 4015) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = local13 | local19;
											return;
										}
										if (arg0 == 4016) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = local13 < local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4017) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = local13 > local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4018) {
											anInt3165 -= 3;
											local6984 = anIntArray260[anInt3165];
											local6991 = anIntArray260[anInt3165 + 1];
											@Pc(7372) long local7372 = (long) anIntArray260[anInt3165 + 2];
											anIntArray260[anInt3165++] = (int) (local6984 * local7372 / local6991);
											return;
										}
									} else if (arg0 < 4200) {
										if (arg0 == 4100) {
											local3888 = aStringArray15[--anInt3160];
											local19 = anIntArray260[--anInt3165];
											aStringArray15[anInt3160++] = local3888 + local19;
											return;
										}
										if (arg0 == 4101) {
											anInt3160 -= 2;
											local3888 = aStringArray15[anInt3160];
											local1101 = aStringArray15[anInt3160 + 1];
											aStringArray15[anInt3160++] = local3888 + local1101;
											return;
										}
										if (arg0 == 4102) {
											local3888 = aStringArray15[--anInt3160];
											local19 = anIntArray260[--anInt3165];
											aStringArray15[anInt3160++] = local3888 + Static63.method953(local19);
											return;
										}
										if (arg0 == 4103) {
											local3888 = aStringArray15[--anInt3160];
											aStringArray15[anInt3160++] = local3888.toLowerCase();
											return;
										}
										if (arg0 == 4104) {
											aStringArray15[anInt3160++] = method2557(anIntArray260[--anInt3165]);
											return;
										}
										if (arg0 == 4105) {
											anInt3160 -= 2;
											local3888 = aStringArray15[anInt3160];
											local1101 = aStringArray15[anInt3160 + 1];
											if (Static60.aClass3_Sub4_Sub1_Sub2_1.aClass249_1 != null && Static60.aClass3_Sub4_Sub1_Sub2_1.aClass249_1.aBoolean484) {
												aStringArray15[anInt3160++] = local1101;
												return;
											}
											aStringArray15[anInt3160++] = local3888;
											return;
										}
										if (arg0 == 4106) {
											local13 = anIntArray260[--anInt3165];
											aStringArray15[anInt3160++] = Integer.toString(local13);
											return;
										}
										if (arg0 == 4107) {
											anInt3160 -= 2;
											anIntArray260[anInt3165++] = Static326.method4916(Static331.anInt5597, aStringArray15[anInt3160], aStringArray15[anInt3160 + 1]);
											return;
										}
										@Pc(7655) Class141 local7655;
										if (arg0 == 4108) {
											local3888 = aStringArray15[--anInt3160];
											anInt3165 -= 2;
											local19 = anIntArray260[anInt3165];
											local25 = anIntArray260[anInt3165 + 1];
											local7655 = Static69.method1057(local25, Static77.aClass54_26);
											anIntArray260[anInt3165++] = local7655.method2905(Static108.aClass13Array5, local19, local3888);
											return;
										}
										if (arg0 == 4109) {
											local3888 = aStringArray15[--anInt3160];
											anInt3165 -= 2;
											local19 = anIntArray260[anInt3165];
											local25 = anIntArray260[anInt3165 + 1];
											local7655 = Static69.method1057(local25, Static77.aClass54_26);
											anIntArray260[anInt3165++] = local7655.method2906(Static108.aClass13Array5, local19, local3888);
											return;
										}
										if (arg0 == 4110) {
											anInt3160 -= 2;
											local3888 = aStringArray15[anInt3160];
											local1101 = aStringArray15[anInt3160 + 1];
											if (anIntArray260[--anInt3165] == 1) {
												aStringArray15[anInt3160++] = local3888;
												return;
											}
											aStringArray15[anInt3160++] = local1101;
											return;
										}
										if (arg0 == 4111) {
											local3888 = aStringArray15[--anInt3160];
											aStringArray15[anInt3160++] = Static249.method3171(local3888);
											return;
										}
										if (arg0 == 4112) {
											local3888 = aStringArray15[--anInt3160];
											local19 = anIntArray260[--anInt3165];
											if (local19 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray15[anInt3160++] = local3888 + (char) local19;
											return;
										}
										if (arg0 == 4113) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = Static266.method3608((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4114) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = Static328.method4416((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4115) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = Static443.method5603((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4116) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = Static314.method4291((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4117) {
											local3888 = aStringArray15[--anInt3160];
											if (local3888 != null) {
												anIntArray260[anInt3165++] = local3888.length();
												return;
											}
											anIntArray260[anInt3165++] = 0;
											return;
										}
										if (arg0 == 4118) {
											local3888 = aStringArray15[--anInt3160];
											anInt3165 -= 2;
											local19 = anIntArray260[anInt3165];
											local25 = anIntArray260[anInt3165 + 1];
											aStringArray15[anInt3160++] = local3888.substring(local19, local25);
											return;
										}
										if (arg0 == 4119) {
											local3888 = aStringArray15[--anInt3160];
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
											aStringArray15[anInt3160++] = local8018.toString();
											return;
										}
										if (arg0 == 4120) {
											local3888 = aStringArray15[--anInt3160];
											anInt3165 -= 2;
											local19 = anIntArray260[anInt3165];
											local25 = anIntArray260[anInt3165 + 1];
											anIntArray260[anInt3165++] = local3888.indexOf(local19, local25);
											return;
										}
										if (arg0 == 4121) {
											anInt3160 -= 2;
											local3888 = aStringArray15[anInt3160];
											local1101 = aStringArray15[anInt3160 + 1];
											local25 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = local3888.indexOf(local1101, local25);
											return;
										}
										if (arg0 == 4122) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = Character.toLowerCase((char) local13);
											return;
										}
										if (arg0 == 4123) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = Character.toUpperCase((char) local13);
											return;
										}
										if (arg0 == 4124) {
											local412 = anIntArray260[--anInt3165] != 0;
											local19 = anIntArray260[--anInt3165];
											aStringArray15[anInt3160++] = Static84.method1211(Static331.anInt5597, local412, 0, (long) local19);
											return;
										}
										if (arg0 == 4125) {
											local3888 = aStringArray15[--anInt3160];
											local19 = anIntArray260[--anInt3165];
											@Pc(8241) Class141 local8241 = Static69.method1057(local19, Static77.aClass54_26);
											anIntArray260[anInt3165++] = local8241.method2909(local3888, Static108.aClass13Array5);
											return;
										}
									} else if (arg0 < 4300) {
										if (arg0 == 4200) {
											local13 = anIntArray260[--anInt3165];
											aStringArray15[anInt3160++] = Static384.aClass164_2.method3458(local13).lb;
											return;
										}
										@Pc(8303) Class208 local8303;
										if (arg0 == 4201) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											local8303 = Static384.aClass164_2.method3458(local13);
											if (local19 >= 1 && local19 <= 5 && local8303.aStringArray33[local19 - 1] != null) {
												aStringArray15[anInt3160++] = local8303.aStringArray33[local19 - 1];
												return;
											}
											aStringArray15[anInt3160++] = "";
											return;
										}
										if (arg0 == 4202) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											local8303 = Static384.aClass164_2.method3458(local13);
											if (local19 >= 1 && local19 <= 5 && local8303.aStringArray34[local19 - 1] != null) {
												aStringArray15[anInt3160++] = local8303.aStringArray34[local19 - 1];
												return;
											}
											aStringArray15[anInt3160++] = "";
											return;
										}
										if (arg0 == 4203) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = Static384.aClass164_2.method3458(local13).anInt5653;
											return;
										}
										if (arg0 == 4204) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = Static384.aClass164_2.method3458(local13).anInt5678 == 1 ? 1 : 0;
											return;
										}
										@Pc(8466) Class208 local8466;
										if (arg0 == 4205) {
											local13 = anIntArray260[--anInt3165];
											local8466 = Static384.aClass164_2.method3458(local13);
											if (local8466.anInt5683 == -1 && local8466.anInt5701 >= 0) {
												anIntArray260[anInt3165++] = local8466.anInt5701;
												return;
											}
											anIntArray260[anInt3165++] = local13;
											return;
										}
										if (arg0 == 4206) {
											local13 = anIntArray260[--anInt3165];
											local8466 = Static384.aClass164_2.method3458(local13);
											if (local8466.anInt5683 >= 0 && local8466.anInt5701 >= 0) {
												anIntArray260[anInt3165++] = local8466.anInt5701;
												return;
											}
											anIntArray260[anInt3165++] = local13;
											return;
										}
										if (arg0 == 4207) {
											local13 = anIntArray260[--anInt3165];
											anIntArray260[anInt3165++] = Static384.aClass164_2.method3458(local13).aBoolean420 ? 1 : 0;
											return;
										}
										if (arg0 == 4208) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											local3017 = Static234.aClass135_1.method2749(local19);
											if (local3017.method4356()) {
												aStringArray15[anInt3160++] = Static384.aClass164_2.method3458(local13).method4478(local3017.aString154, local19);
												return;
											}
											anIntArray260[anInt3165++] = Static384.aClass164_2.method3458(local13).method4477(local3017.anInt5511, local19);
											return;
										}
										if (arg0 == 4209) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1] - 1;
											local8303 = Static384.aClass164_2.method3458(local13);
											if (local8303.anInt5688 == local19) {
												anIntArray260[anInt3165++] = local8303.anInt5654;
												return;
											}
											if (local8303.anInt5651 == local19) {
												anIntArray260[anInt3165++] = local8303.anInt5649;
												return;
											}
											anIntArray260[anInt3165++] = -1;
											return;
										}
										if (arg0 == 4210) {
											local3888 = aStringArray15[--anInt3160];
											local19 = anIntArray260[--anInt3165];
											Static19.method233(local3888, local19 == 1);
											anIntArray260[anInt3165++] = Static167.anInt2873;
											return;
										}
										if (arg0 == 4211) {
											if (Static321.aShortArray59 != null && Static385.anInt6343 < Static167.anInt2873) {
												anIntArray260[anInt3165++] = Static321.aShortArray59[Static385.anInt6343++] & 0xFFFF;
												return;
											}
											anIntArray260[anInt3165++] = -1;
											return;
										}
										if (arg0 == 4212) {
											Static385.anInt6343 = 0;
											return;
										}
									} else if (arg0 < 4400) {
										if (arg0 == 4300) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											local3017 = Static234.aClass135_1.method2749(local19);
											if (local3017.method4356()) {
												aStringArray15[anInt3160++] = Static155.aClass263_1.method5581(local13).method5207(local19, local3017.aString154);
												return;
											}
											anIntArray260[anInt3165++] = Static155.aClass263_1.method5581(local13).method5200(local3017.anInt5511, local19);
											return;
										}
									} else if (arg0 < 4500) {
										if (arg0 == 4400) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											local3017 = Static234.aClass135_1.method2749(local19);
											if (local3017.method4356()) {
												aStringArray15[anInt3160++] = Static50.aClass190_1.method4218(local13).method4241(local19, local3017.aString154);
												return;
											}
											anIntArray260[anInt3165++] = Static50.aClass190_1.method4218(local13).method4237(local19, local3017.anInt5511);
											return;
										}
									} else if (arg0 < 4600) {
										if (arg0 == 4500) {
											anInt3165 -= 2;
											local13 = anIntArray260[anInt3165];
											local19 = anIntArray260[anInt3165 + 1];
											local3017 = Static234.aClass135_1.method2749(local19);
											if (local3017.method4356()) {
												aStringArray15[anInt3160++] = Static343.aClass27_1.method537(local13).method1811(local19, local3017.aString154);
												return;
											}
											anIntArray260[anInt3165++] = Static343.aClass27_1.method537(local13).method1816(local19, local3017.anInt5511);
											return;
										}
									} else if (arg0 < 4700 && arg0 == 4600) {
										local13 = anIntArray260[--anInt3165];
										@Pc(8967) Class173 local8967 = Static56.aClass150_1.method3066(local13);
										if (local8967.anIntArray381 != null && local8967.anIntArray381.length > 0) {
											local25 = 0;
											local353 = local8967.anIntArray380[0];
											for (local2290 = 1; local2290 < local8967.anIntArray381.length; local2290++) {
												if (local8967.anIntArray380[local2290] > local353) {
													local25 = local2290;
													local353 = local8967.anIntArray380[local2290];
												}
											}
											anIntArray260[anInt3165++] = local8967.anIntArray381[local25];
											return;
										}
										anIntArray260[anInt3165++] = local8967.anInt4490;
										return;
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static338.method4534(anIntArray260[--anInt3165]);
						} else {
							local137 = arg1 ? aClass16_11 : aClass16_10;
						}
						if (arg0 == 1300) {
							local19 = anIntArray260[--anInt3165] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method242(aStringArray15[--anInt3160], local19);
								return;
							}
							anInt3160--;
							return;
						}
						if (arg0 == 1301) {
							anInt3165 -= 2;
							local19 = anIntArray260[anInt3165];
							local25 = anIntArray260[anInt3165 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass16_3 = null;
								return;
							}
							local137.aClass16_3 = Static4.method73(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray260[--anInt3165];
							if (local19 != Static207.anInt3363 && local19 != Static165.anInt2825 && local19 != Static352.anInt5988) {
								return;
							}
							local137.anInt311 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt287 = anIntArray260[--anInt3165];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt313 = anIntArray260[--anInt3165];
							return;
						}
						if (arg0 == 1305) {
							local137.aString13 = aStringArray15[--anInt3160];
							return;
						}
						if (arg0 == 1306) {
							local137.aString15 = aStringArray15[--anInt3160];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray3 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt303 = anIntArray260[--anInt3165];
							local137.anInt256 = anIntArray260[--anInt3165];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray260[--anInt3165];
							local25 = anIntArray260[--anInt3165];
							if (local25 >= 1 && local25 <= 10) {
								local137.method241(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString12 = aStringArray15[--anInt3160];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt338 = anIntArray260[--anInt3165];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt3165 -= 3;
								local19 = anIntArray260[anInt3165] - 1;
								local25 = anIntArray260[anInt3165 + 1];
								local353 = anIntArray260[anInt3165 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt3165 -= 2;
								local19 = 10;
								local25 = anIntArray260[anInt3165];
								local353 = anIntArray260[anInt3165 + 1];
							}
							if (local137.aByteArray2 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray2 = new byte[11];
								local137.aByteArray1 = new byte[11];
								local137.anIntArray31 = new int[11];
							}
							local137.aByteArray2[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean32 = false;
								for (local2290 = 0; local2290 < local137.aByteArray2.length; local2290++) {
									if (local137.aByteArray2[local2290] != 0) {
										local137.aBoolean32 = true;
										break;
									}
								}
							} else {
								local137.aBoolean32 = true;
							}
							local137.aByteArray1[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt277 = anIntArray260[--anInt3165];
							return;
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static338.method4534(anIntArray260[--anInt3165]);
					} else {
						local137 = arg1 ? aClass16_11 : aClass16_10;
					}
					Static176.method70(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt3165 -= 2;
						local19 = anIntArray260[anInt3165];
						local25 = anIntArray260[anInt3165 + 1];
						if (local137.anInt320 == -1) {
							Static18.method2728(local137.anInt293);
							Static108.method1680(local137.anInt293);
							Static447.method5638(local137.anInt293);
						}
						if (local19 == -1) {
							local137.anInt310 = 1;
							local137.anInt305 = -1;
							local137.anInt301 = -1;
							return;
						}
						local137.anInt301 = local19;
						local137.anInt297 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean33 = true;
						} else {
							local137.aBoolean33 = false;
						}
						@Pc(1630) Class208 local1630 = Static384.aClass164_2.method3458(local19);
						local137.anInt335 = local1630.anInt5669;
						local137.anInt308 = local1630.anInt5684;
						local137.anInt295 = local1630.anInt5670;
						local137.lb = local1630.anInt5682;
						local137.anInt271 = local1630.anInt5690;
						local137.anInt330 = local1630.anInt5706;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt291 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt291 = 1;
						} else {
							local137.anInt291 = 2;
						}
						if (local137.anInt264 > 0) {
							local137.anInt330 = local137.anInt330 * 32 / local137.anInt264;
							return;
						}
						if (local137.anInt274 > 0) {
							local137.anInt330 = local137.anInt330 * 32 / local137.anInt274;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt310 = 2;
						local137.anInt305 = anIntArray260[--anInt3165];
						if (local137.anInt320 == -1) {
							Static92.method1460(local137.anInt293);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt310 = 3;
						local137.anInt305 = -1;
						if (local137.anInt320 == -1) {
							Static92.method1460(local137.anInt293);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt310 = 6;
						local137.anInt305 = anIntArray260[--anInt3165];
						if (local137.anInt320 == -1) {
							Static92.method1460(local137.anInt293);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt310 = 5;
						local137.anInt305 = anIntArray260[--anInt3165];
						if (local137.anInt320 == -1) {
							Static92.method1460(local137.anInt293);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt3165 -= 4;
						local137.anInt336 = anIntArray260[anInt3165];
						local137.anInt280 = anIntArray260[anInt3165 + 1];
						local137.anInt325 = anIntArray260[anInt3165 + 2];
						local137.anInt282 = anIntArray260[anInt3165 + 3];
						Static176.method70(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt3165 -= 2;
						local137.anInt283 = anIntArray260[anInt3165];
						local137.anInt322 = anIntArray260[anInt3165 + 1];
						Static176.method70(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt3165 -= 4;
						local137.anInt305 = anIntArray260[anInt3165];
						local137.anInt267 = anIntArray260[anInt3165 + 1];
						if (anIntArray260[anInt3165 + 2] == 1) {
							local137.anInt310 = 9;
						} else {
							local137.anInt310 = 8;
						}
						if (anIntArray260[anInt3165 + 3] == 1) {
							local137.aBoolean33 = true;
						} else {
							local137.aBoolean33 = false;
						}
						if (local137.anInt320 == -1) {
							Static92.method1460(local137.anInt293);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt310 = 5;
						local137.anInt305 = Static201.anInt3383;
						local137.anInt267 = 0;
						if (local137.anInt320 == -1) {
							Static92.method1460(local137.anInt293);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static338.method4534(anIntArray260[--anInt3165]);
				} else {
					local137 = arg1 ? aClass16_11 : aClass16_10;
				}
				if (arg0 == 1000) {
					anInt3165 -= 4;
					local137.anInt340 = anIntArray260[anInt3165];
					local137.anInt255 = anIntArray260[anInt3165 + 1];
					local19 = anIntArray260[anInt3165 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray260[anInt3165 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte4 = (byte) local19;
					local137.aByte3 = (byte) local25;
					Static176.method70(local137);
					Static12.method160(local137);
					if (local137.anInt320 == -1) {
						Static452.method5680(local137.anInt293);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt3165 -= 4;
					local137.anInt274 = anIntArray260[anInt3165];
					local137.anInt259 = anIntArray260[anInt3165 + 1];
					local137.anInt264 = 0;
					local137.anInt273 = 0;
					local19 = anIntArray260[anInt3165 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray260[anInt3165 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte1 = (byte) local19;
					local137.aByte2 = (byte) local25;
					Static176.method70(local137);
					Static12.method160(local137);
					if (local137.anInt298 == 0) {
						Static399.method5068(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray260[--anInt3165] == 1;
					if (local137.aBoolean27 != local620) {
						local137.aBoolean27 = local620;
						Static176.method70(local137);
					}
					if (local137.anInt320 == -1) {
						Static254.method3215(local137.anInt293);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt3165 -= 2;
					local137.anInt254 = anIntArray260[anInt3165];
					local137.anInt333 = anIntArray260[anInt3165 + 1];
					Static176.method70(local137);
					Static12.method160(local137);
					if (local137.anInt298 == 0) {
						Static399.method5068(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean26 = anIntArray260[--anInt3165] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!ho;I)V")
	private static void method2565(@OriginalArg(0) Class2_Sub5_Sub5 arg0, @OriginalArg(1) int arg1) {
		anInt3165 = 0;
		anInt3160 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray214;
		@Pc(11) int[] local11 = arg0.anIntArray213;
		@Pc(13) byte local13 = -1;
		anInt3166 = 0;
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
						method2564(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method2569(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray260[anInt3165++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray260[anInt3165++] = Static138.aClass268_1.anIntArray638[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static138.aClass268_1.method5657(anIntArray260[--anInt3165], local54);
					} else if (local31 == 3) {
						aStringArray15[anInt3160++] = arg0.aStringArray12[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt3165 -= 2;
						if (anIntArray260[anInt3165] != anIntArray260[anInt3165 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt3165 -= 2;
						if (anIntArray260[anInt3165] == anIntArray260[anInt3165 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt3165 -= 2;
						if (anIntArray260[anInt3165] < anIntArray260[anInt3165 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt3165 -= 2;
						if (anIntArray260[anInt3165] > anIntArray260[anInt3165 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt3166 == 0) {
							return;
						}
						@Pc(216) Class177 local216 = aClass177Array1[--anInt3166];
						arg0 = local216.aClass2_Sub5_Sub5_1;
						local8 = arg0.anIntArray214;
						local11 = arg0.anIntArray213;
						local5 = local216.anInt4628;
						anIntArray262 = local216.anIntArray398;
						aStringArray14 = local216.aStringArray28;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray260[anInt3165++] = Static138.aClass268_1.method5650(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static138.aClass268_1.method5652(anIntArray260[--anInt3165], local54);
					} else if (local31 == 31) {
						anInt3165 -= 2;
						if (anIntArray260[anInt3165] <= anIntArray260[anInt3165 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt3165 -= 2;
						if (anIntArray260[anInt3165] >= anIntArray260[anInt3165 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray260[anInt3165++] = anIntArray262[local11[local5]];
					} else if (local31 == 34) {
						anIntArray262[local11[local5]] = anIntArray260[--anInt3165];
					} else if (local31 == 35) {
						aStringArray15[anInt3160++] = aStringArray14[local11[local5]];
					} else if (local31 == 36) {
						aStringArray14[local11[local5]] = aStringArray15[--anInt3160];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt3160 -= local54;
						@Pc(400) String local400 = Static403.method5085(anInt3160, aStringArray15, local54);
						aStringArray15[anInt3160++] = local400;
					} else if (local31 == 38) {
						anInt3165--;
					} else if (local31 == 39) {
						anInt3160--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class2_Sub5_Sub5 local436 = Static388.method3888(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt2695];
							@Pc(450) String[] local450 = new String[local436.anInt2694];
							for (local452 = 0; local452 < local436.anInt2691; local452++) {
								local446[local452] = anIntArray260[anInt3165 + local452 - local436.anInt2691];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt2690; local471++) {
								local450[local471] = aStringArray15[anInt3160 + local471 - local436.anInt2690];
							}
							anInt3165 -= local436.anInt2691;
							anInt3160 -= local436.anInt2690;
							@Pc(502) Class177 local502 = new Class177();
							local502.aClass2_Sub5_Sub5_1 = arg0;
							local502.anInt4628 = local5;
							local502.anIntArray398 = anIntArray262;
							local502.aStringArray28 = aStringArray14;
							if (anInt3166 >= aClass177Array1.length) {
								throw new RuntimeException();
							}
							aClass177Array1[anInt3166++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray214;
							local11 = local436.anIntArray213;
							local5 = -1;
							anIntArray262 = local446;
							aStringArray14 = local450;
						} else if (local31 == 42) {
							anIntArray260[anInt3165++] = Static400.anIntArray551[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static400.anIntArray551[local54] = anIntArray260[--anInt3165];
							Static29.method454(local54);
							Static255.aBoolean290 |= Static270.aBooleanArray18[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray260[--anInt3165];
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
									anIntArrayArray15[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray260[--anInt3165];
							if (local603 < 0 || local603 >= anIntArray261[local54]) {
								throw new RuntimeException();
							}
							anIntArray260[anInt3165++] = anIntArrayArray15[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt3165 -= 2;
							local603 = anIntArray260[anInt3165];
							if (local603 < 0 || local603 >= anIntArray261[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray15[local54][local603] = anIntArray260[anInt3165 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static178.aStringArray32[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray15[anInt3160++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static178.aStringArray32[local54] = aStringArray15[--anInt3160];
							Static32.method480(local54);
						} else if (local31 == 51) {
							@Pc(774) Class72 local774 = arg0.aClass72Array1[local11[local5]];
							@Pc(787) Class2_Sub20 local787 = (Class2_Sub20) local774.method1659((long) anIntArray260[--anInt3165]);
							if (local787 != null) {
								local5 += local787.anInt2212;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString85 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong225).append(" ");
				for (local603 = anInt3166 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass177Array1[local603].aClass2_Sub5_Sub5_1.aLong225).append(" ");
				}
				local855.append("op: ").append(local13);
				Static434.method5460(local837, local855.toString());
			} else {
				Static12.method159("Clientscript error in: " + arg0.aString85);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString85).append("\n");
				for (local603 = anInt3166 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass177Array1[local603].aClass2_Sub5_Sub5_1.aString85).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static434.method5460(local837, local855.toString());
				Static433.method5450(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
	public static void method2566(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static260.method3501(arg0)) {
			return;
		}
		@Pc(12) Class16[] local12 = Static151.aClass16ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class16 local19 = local12[local14];
			if (local19.anObjectArray20 != null) {
				@Pc(26) Class2_Sub44 local26 = new Class2_Sub44();
				local26.aClass16_20 = local19;
				local26.anObjectArray36 = local19.anObjectArray20;
				method2558(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
	private static void method2567(@OriginalArg(0) int arg0) {
		@Pc(3) Class16 local3 = Static338.method4534(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class16[] local13 = Static388.aClass16ArrayArray4[local9];
		if (local13 == null) {
			@Pc(19) Class16[] local19 = Static151.aClass16ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static388.aClass16ArrayArray4[local9] = new Class16[local22];
			Static464.method1963(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static464.method1963(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!jj", name = "d", descriptor = "(I)V")
	private static void method2568(@OriginalArg(0) int arg0) {
		@Pc(3) Class16 local3 = Static338.method4534(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class16[] local13 = Static388.aClass16ArrayArray4[local9];
		if (local13 == null) {
			@Pc(19) Class16[] local19 = Static151.aClass16ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static388.aClass16ArrayArray4[local9] = new Class16[local22];
			Static464.method1963(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static464.method1963(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(IZ)V")
	private static void method2569(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray260[anInt3165++] = Static11.anInt160;
				return;
			}
			if (arg0 == 5001) {
				anInt3165 -= 3;
				Static11.anInt160 = anIntArray260[anInt3165];
				Static327.aClass133_3 = Static289.method3850(anIntArray260[anInt3165 + 1]);
				if (Static327.aClass133_3 == null) {
					Static327.aClass133_3 = Static285.aClass133_2;
				}
				Static150.anInt2650 = anIntArray260[anInt3165 + 2];
				Static29.method451(Static179.aClass102_106);
				Static456.aClass2_Sub13_Sub2_2.method3602(Static11.anInt160);
				Static456.aClass2_Sub13_Sub2_2.method3602(Static327.aClass133_3.anInt3403);
				Static456.aClass2_Sub13_Sub2_2.method3602(Static150.anInt2650);
				return;
			}
			if (arg0 == 5002) {
				anInt3160 -= 2;
				local75 = aStringArray15[anInt3160];
				local81 = aStringArray15[anInt3160 + 1];
				anInt3165 -= 2;
				local89 = anIntArray260[anInt3165];
				local95 = anIntArray260[anInt3165 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static29.method451(Static211.aClass102_115);
				Static456.aClass2_Sub13_Sub2_2.method3602(Static385.method4939(local75) + Static385.method4939(local81) + 2);
				Static456.aClass2_Sub13_Sub2_2.method3590(local75);
				Static456.aClass2_Sub13_Sub2_2.method3602(local89 - 1);
				Static456.aClass2_Sub13_Sub2_2.method3602(local95);
				Static456.aClass2_Sub13_Sub2_2.method3590(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray260[--anInt3165];
				local81 = null;
				if (local157 < 100) {
					local81 = Static240.aStringArray22[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray15[anInt3160++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray260[--anInt3165];
				local192 = -1;
				if (local157 < 100 && Static240.aStringArray22[local157] != null) {
					local192 = Static161.anIntArray528[local157];
				}
				anIntArray260[anInt3165++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static327.aClass133_3 == null) {
					anIntArray260[anInt3165++] = -1;
					return;
				}
				anIntArray260[anInt3165++] = Static327.aClass133_3.anInt3403;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray15[--anInt3160];
				method2561(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt3160 -= 2;
				local75 = aStringArray15[anInt3160];
				local81 = aStringArray15[anInt3160 + 1];
				if (Static440.anInt7085 != 0 || (!Static409.aBoolean471 || Static399.aBoolean464) && !Static298.aBoolean16) {
					Static29.method451(Static283.aClass102_138);
					Static456.aClass2_Sub13_Sub2_2.method3602(0);
					local89 = Static456.aClass2_Sub13_Sub2_2.anInt4347;
					Static456.aClass2_Sub13_Sub2_2.method3590(local75);
					Static457.method5713(local81, Static456.aClass2_Sub13_Sub2_2);
					Static456.aClass2_Sub13_Sub2_2.method3562(Static456.aClass2_Sub13_Sub2_2.anInt4347 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray260[--anInt3165];
				local81 = null;
				if (local157 < 100) {
					local81 = Static70.aStringArray6[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray15[anInt3160++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray260[--anInt3165];
				local81 = null;
				if (local157 < 100) {
					local81 = Static147.aStringArray11[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray15[anInt3160++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray260[--anInt3165];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static92.anIntArray138[local157];
				}
				anIntArray260[anInt3165++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static60.aClass3_Sub4_Sub1_Sub2_1 == null || Static60.aClass3_Sub4_Sub1_Sub2_1.aString147 == null) {
					local75 = Static427.aString196;
				} else {
					local75 = Static60.aClass3_Sub4_Sub1_Sub2_1.method4017();
				}
				aStringArray15[anInt3160++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray260[anInt3165++] = Static150.anInt2650;
				return;
			}
			if (arg0 == 5017) {
				anIntArray260[anInt3165++] = Static115.anInt2129;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray260[--anInt3165];
				local192 = 0;
				if (local157 < 100 && Static240.aStringArray22[local157] != null) {
					local192 = Static412.anIntArray563[local157];
				}
				anIntArray260[anInt3165++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray260[--anInt3165];
				local81 = null;
				if (local157 < 100) {
					local81 = Static109.aStringArray7[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray15[anInt3160++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static60.aClass3_Sub4_Sub1_Sub2_1 == null || Static60.aClass3_Sub4_Sub1_Sub2_1.aString147 == null) {
					local75 = Static427.aString196;
				} else {
					local75 = Static60.aClass3_Sub4_Sub1_Sub2_1.method4015();
				}
				aStringArray15[anInt3160++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray260[--anInt3165];
				aStringArray15[anInt3160++] = Static456.aClass198_1.method4343(local157).aString43;
				return;
			}
			@Pc(589) Class2_Sub5_Sub3 local589;
			if (arg0 == 5051) {
				local157 = anIntArray260[--anInt3165];
				local589 = Static456.aClass198_1.method4343(local157);
				if (local589.anIntArray116 == null) {
					anIntArray260[anInt3165++] = 0;
					return;
				}
				anIntArray260[anInt3165++] = local589.anIntArray116.length;
				return;
			}
			if (arg0 == 5052) {
				anInt3165 -= 2;
				local157 = anIntArray260[anInt3165];
				local192 = anIntArray260[anInt3165 + 1];
				@Pc(634) Class2_Sub5_Sub3 local634 = Static456.aClass198_1.method4343(local157);
				local95 = local634.anIntArray116[local192];
				anIntArray260[anInt3165++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray260[--anInt3165];
				local589 = Static456.aClass198_1.method4343(local157);
				if (local589.anIntArray117 == null) {
					anIntArray260[anInt3165++] = 0;
					return;
				}
				anIntArray260[anInt3165++] = local589.anIntArray117.length;
				return;
			}
			if (arg0 == 5054) {
				anInt3165 -= 2;
				local157 = anIntArray260[anInt3165];
				local192 = anIntArray260[anInt3165 + 1];
				anIntArray260[anInt3165++] = Static456.aClass198_1.method4343(local157).anIntArray117[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray260[--anInt3165];
				aStringArray15[anInt3160++] = Static216.aClass219_1.method4730(local157).method5267();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray260[--anInt3165];
				@Pc(760) Class2_Sub5_Sub17 local760 = Static216.aClass219_1.method4730(local157);
				if (local760.anIntArray569 == null) {
					anIntArray260[anInt3165++] = 0;
					return;
				}
				anIntArray260[anInt3165++] = local760.anIntArray569.length;
				return;
			}
			if (arg0 == 5057) {
				anInt3165 -= 2;
				local157 = anIntArray260[anInt3165];
				local192 = anIntArray260[anInt3165 + 1];
				anIntArray260[anInt3165++] = Static216.aClass219_1.method4730(local157).anIntArray569[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass231_1 = new Class231();
				aClass231_1.anInt6249 = anIntArray260[--anInt3165];
				aClass231_1.aClass2_Sub5_Sub17_1 = Static216.aClass219_1.method4730(aClass231_1.anInt6249);
				aClass231_1.anIntArray540 = new int[aClass231_1.aClass2_Sub5_Sub17_1.method5276()];
				return;
			}
			if (arg0 == 5059) {
				Static29.method451(Static426.aClass102_213);
				Static456.aClass2_Sub13_Sub2_2.method3602(0);
				local157 = Static456.aClass2_Sub13_Sub2_2.anInt4347;
				Static456.aClass2_Sub13_Sub2_2.method3602(0);
				Static456.aClass2_Sub13_Sub2_2.method3568(aClass231_1.anInt6249);
				aClass231_1.aClass2_Sub5_Sub17_1.method5266(aClass231_1.anIntArray540, Static456.aClass2_Sub13_Sub2_2);
				Static456.aClass2_Sub13_Sub2_2.method3562(Static456.aClass2_Sub13_Sub2_2.anInt4347 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray15[--anInt3160];
				Static29.method451(Static415.aClass102_200);
				Static456.aClass2_Sub13_Sub2_2.method3602(0);
				local192 = Static456.aClass2_Sub13_Sub2_2.anInt4347;
				Static456.aClass2_Sub13_Sub2_2.method3590(local75);
				Static456.aClass2_Sub13_Sub2_2.method3568(aClass231_1.anInt6249);
				aClass231_1.aClass2_Sub5_Sub17_1.method5266(aClass231_1.anIntArray540, Static456.aClass2_Sub13_Sub2_2);
				Static456.aClass2_Sub13_Sub2_2.method3562(Static456.aClass2_Sub13_Sub2_2.anInt4347 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static29.method451(Static426.aClass102_213);
				Static456.aClass2_Sub13_Sub2_2.method3602(0);
				local157 = Static456.aClass2_Sub13_Sub2_2.anInt4347;
				Static456.aClass2_Sub13_Sub2_2.method3602(1);
				Static456.aClass2_Sub13_Sub2_2.method3568(aClass231_1.anInt6249);
				aClass231_1.aClass2_Sub5_Sub17_1.method5266(aClass231_1.anIntArray540, Static456.aClass2_Sub13_Sub2_2);
				Static456.aClass2_Sub13_Sub2_2.method3562(Static456.aClass2_Sub13_Sub2_2.anInt4347 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt3165 -= 2;
				local157 = anIntArray260[anInt3165];
				local192 = anIntArray260[anInt3165 + 1];
				anIntArray260[anInt3165++] = Static456.aClass198_1.method4343(local157).aCharArray3[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt3165 -= 2;
				local157 = anIntArray260[anInt3165];
				local192 = anIntArray260[anInt3165 + 1];
				anIntArray260[anInt3165++] = Static456.aClass198_1.method4343(local157).aCharArray4[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt3165 -= 2;
				local157 = anIntArray260[anInt3165];
				local192 = anIntArray260[anInt3165 + 1];
				if (local192 == -1) {
					anIntArray260[anInt3165++] = -1;
					return;
				}
				anIntArray260[anInt3165++] = Static456.aClass198_1.method4343(local157).method1052((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt3165 -= 2;
				local157 = anIntArray260[anInt3165];
				local192 = anIntArray260[anInt3165 + 1];
				if (local192 == -1) {
					anIntArray260[anInt3165++] = -1;
					return;
				}
				anIntArray260[anInt3165++] = Static456.aClass198_1.method4343(local157).method1054((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray260[--anInt3165];
				anIntArray260[anInt3165++] = Static216.aClass219_1.method4730(local157).method5276();
				return;
			}
			if (arg0 == 5067) {
				anInt3165 -= 2;
				local157 = anIntArray260[anInt3165];
				local192 = anIntArray260[anInt3165 + 1];
				local89 = Static216.aClass219_1.method4730(local157).method5268(local192).anInt1350;
				anIntArray260[anInt3165++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt3165 -= 2;
				local157 = anIntArray260[anInt3165];
				local192 = anIntArray260[anInt3165 + 1];
				aClass231_1.anIntArray540[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt3165 -= 2;
				local157 = anIntArray260[anInt3165];
				local192 = anIntArray260[anInt3165 + 1];
				aClass231_1.anIntArray540[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt3165 -= 3;
				local157 = anIntArray260[anInt3165];
				local192 = anIntArray260[anInt3165 + 1];
				local89 = anIntArray260[anInt3165 + 2];
				@Pc(1265) Class2_Sub5_Sub17 local1265 = Static216.aClass219_1.method4730(local157);
				if (local1265.method5268(local192).anInt1350 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray260[anInt3165++] = local1265.method5269(local192, local89);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray15[--anInt3160];
				local1313 = anIntArray260[--anInt3165] == 1;
				Static391.method5006(local75, local1313);
				anIntArray260[anInt3165++] = Static167.anInt2873;
				return;
			}
			if (arg0 == 5072) {
				if (Static321.aShortArray59 != null && Static385.anInt6343 < Static167.anInt2873) {
					anIntArray260[anInt3165++] = Static321.aShortArray59[Static385.anInt6343++] & 0xFFFF;
					return;
				}
				anIntArray260[anInt3165++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static385.anInt6343 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static29.method451(Static426.aClass102_213);
				Static456.aClass2_Sub13_Sub2_2.method3602(0);
				local157 = Static456.aClass2_Sub13_Sub2_2.anInt4347;
				Static456.aClass2_Sub13_Sub2_2.method3602(2);
				Static456.aClass2_Sub13_Sub2_2.method3568(aClass231_1.anInt6249);
				aClass231_1.aClass2_Sub5_Sub17_1.method5266(aClass231_1.anIntArray540, Static456.aClass2_Sub13_Sub2_2);
				Static456.aClass2_Sub13_Sub2_2.method3562(Static456.aClass2_Sub13_Sub2_2.anInt4347 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static218.aClass181_1.method3865(86)) {
					anIntArray260[anInt3165++] = 1;
					return;
				}
				anIntArray260[anInt3165++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static218.aClass181_1.method3865(82)) {
					anIntArray260[anInt3165++] = 1;
					return;
				}
				anIntArray260[anInt3165++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static218.aClass181_1.method3865(81)) {
					anIntArray260[anInt3165++] = 1;
					return;
				}
				anIntArray260[anInt3165++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static116.method1754(anIntArray260[--anInt3165]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray260[anInt3165++] = Static109.method1701();
					return;
				}
				if (arg0 == 5205) {
					Static219.method4784(false, -1, -1, anIntArray260[--anInt3165]);
					return;
				}
				@Pc(1554) Class2_Sub5_Sub15 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray260[--anInt3165];
					local1554 = Static282.method2795(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray260[anInt3165++] = -1;
						return;
					}
					anIntArray260[anInt3165++] = local1554.anInt5823;
					return;
				}
				@Pc(1587) Class2_Sub5_Sub15 local1587;
				if (arg0 == 5207) {
					local1587 = Static282.method2775(anIntArray260[--anInt3165]);
					if (local1587 != null && local1587.aString162 != null) {
						aStringArray15[anInt3160++] = local1587.aString162;
						return;
					}
					aStringArray15[anInt3160++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray260[anInt3165++] = Static124.anInt1091;
					anIntArray260[anInt3165++] = Static253.anInt4075;
					return;
				}
				if (arg0 == 5209) {
					anIntArray260[anInt3165++] = Static379.anInt6865 + Static282.anInt3479;
					anIntArray260[anInt3165++] = Static301.anInt3360 + Static282.anInt3477;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray260[--anInt3165];
					local1554 = Static282.method2775(local157);
					if (local1554 == null) {
						anIntArray260[anInt3165++] = 0;
						anIntArray260[anInt3165++] = 0;
						return;
					}
					anIntArray260[anInt3165++] = local1554.anInt5827 >> 14 & 0x3FFF;
					anIntArray260[anInt3165++] = local1554.anInt5827 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray260[--anInt3165];
					local1554 = Static282.method2775(local157);
					if (local1554 == null) {
						anIntArray260[anInt3165++] = 0;
						anIntArray260[anInt3165++] = 0;
						return;
					}
					anIntArray260[anInt3165++] = local1554.anInt5829 - local1554.anInt5815;
					anIntArray260[anInt3165++] = local1554.anInt5821 - local1554.anInt5826;
					return;
				}
				@Pc(1777) Class2_Sub40 local1777;
				if (arg0 == 5212) {
					local1777 = Static39.method582();
					if (local1777 == null) {
						anIntArray260[anInt3165++] = -1;
						anIntArray260[anInt3165++] = -1;
						return;
					}
					anIntArray260[anInt3165++] = local1777.anInt6352;
					local192 = local1777.anInt6350 << 28 | local1777.anInt6349 + Static282.anInt3479 << 14 | local1777.anInt6347 + Static282.anInt3477;
					anIntArray260[anInt3165++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static286.method3820();
					if (local1777 == null) {
						anIntArray260[anInt3165++] = -1;
						anIntArray260[anInt3165++] = -1;
						return;
					}
					anIntArray260[anInt3165++] = local1777.anInt6352;
					local192 = local1777.anInt6350 << 28 | local1777.anInt6349 + Static282.anInt3479 << 14 | local1777.anInt6347 + Static282.anInt3477;
					anIntArray260[anInt3165++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray260[--anInt3165];
					local1554 = Static266.method3609();
					if (local1554 != null) {
						local1925 = local1554.method4575(local157 >> 28 & 0x3, local157 >> 14 & 0x3FFF, local157 & 0x3FFF, anIntArray263);
						if (local1925) {
							Static12.method162(anIntArray263[1], anIntArray263[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt3165 -= 2;
					local157 = anIntArray260[anInt3165];
					local192 = anIntArray260[anInt3165 + 1];
					@Pc(1963) Class261 local1963 = Static282.method2785(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class2_Sub5_Sub15 local1970 = (Class2_Sub5_Sub15) local1963.method5489(); local1970 != null; local1970 = (Class2_Sub5_Sub15) local1963.method5490()) {
						if (local1970.anInt5823 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray260[anInt3165++] = 1;
						return;
					}
					anIntArray260[anInt3165++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray260[--anInt3165];
					local1554 = Static282.method2775(local157);
					if (local1554 == null) {
						anIntArray260[anInt3165++] = -1;
						return;
					}
					anIntArray260[anInt3165++] = local1554.anInt5825;
					return;
				}
				if (arg0 == 5220) {
					anIntArray260[anInt3165++] = Static178.anInt5442 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray260[--anInt3165];
					Static12.method162(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static266.method3609();
					if (local1587 != null) {
						local1313 = local1587.method4571(Static301.anInt3360 + Static282.anInt3477, anIntArray263, Static379.anInt6865 + Static282.anInt3479);
						if (local1313) {
							anIntArray260[anInt3165++] = anIntArray263[1];
							anIntArray260[anInt3165++] = anIntArray263[2];
							return;
						}
						anIntArray260[anInt3165++] = -1;
						anIntArray260[anInt3165++] = -1;
						return;
					}
					anIntArray260[anInt3165++] = -1;
					anIntArray260[anInt3165++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt3165 -= 2;
					local157 = anIntArray260[anInt3165];
					local192 = anIntArray260[anInt3165 + 1];
					Static219.method4784(false, local192 & 0x3FFF, local192 >> 14 & 0x3FFF, local157);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray260[--anInt3165];
					local1554 = Static266.method3609();
					if (local1554 != null) {
						local1925 = local1554.method4575(local157 >> 28 & 0x3, local157 >> 14 & 0x3FFF, local157 & 0x3FFF, anIntArray263);
						if (local1925) {
							anIntArray260[anInt3165++] = anIntArray263[1];
							anIntArray260[anInt3165++] = anIntArray263[2];
							return;
						}
						anIntArray260[anInt3165++] = -1;
						anIntArray260[anInt3165++] = -1;
						return;
					}
					anIntArray260[anInt3165++] = -1;
					anIntArray260[anInt3165++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray260[--anInt3165];
					local1554 = Static266.method3609();
					if (local1554 != null) {
						local1925 = local1554.method4571(local157 & 0x3FFF, anIntArray263, local157 >> 14 & 0x3FFF);
						if (local1925) {
							anIntArray260[anInt3165++] = anIntArray263[1];
							anIntArray260[anInt3165++] = anIntArray263[2];
							return;
						}
						anIntArray260[anInt3165++] = -1;
						anIntArray260[anInt3165++] = -1;
						return;
					}
					anIntArray260[anInt3165++] = -1;
					anIntArray260[anInt3165++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static330.method4427(anIntArray260[--anInt3165]);
					return;
				}
				if (arg0 == 5227) {
					anInt3165 -= 2;
					local157 = anIntArray260[anInt3165];
					local192 = anIntArray260[anInt3165 + 1];
					Static219.method4784(true, local192 & 0x3FFF, local192 >> 14 & 0x3FFF, local157);
					return;
				}
				if (arg0 == 5228) {
					Static199.aBoolean204 = anIntArray260[--anInt3165] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray260[anInt3165++] = Static199.aBoolean204 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray260[--anInt3165];
					Static76.method1139(local157);
					return;
				}
				@Pc(2483) Class2 local2483;
				if (arg0 == 5231) {
					anInt3165 -= 2;
					local157 = anIntArray260[anInt3165];
					local1313 = anIntArray260[anInt3165 + 1] == 1;
					if (Static399.aClass72_40 != null) {
						local2483 = Static399.aClass72_40.method1659((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5703();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class2();
							Static399.aClass72_40.method1653(local2483, (long) local157);
						}
					}
					return;
				}
				@Pc(2525) Class2 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray260[--anInt3165];
					if (Static399.aClass72_40 != null) {
						local2525 = Static399.aClass72_40.method1659((long) local157);
						anIntArray260[anInt3165++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray260[anInt3165++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt3165 -= 2;
					local157 = anIntArray260[anInt3165];
					local1313 = anIntArray260[anInt3165 + 1] == 1;
					if (Static431.aClass72_45 != null) {
						local2483 = Static431.aClass72_45.method1659((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5703();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class2();
							Static431.aClass72_45.method1653(local2483, (long) local157);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray260[--anInt3165];
					if (Static431.aClass72_45 != null) {
						local2525 = Static431.aClass72_45.method1659((long) local157);
						anIntArray260[anInt3165++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray260[anInt3165++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray260[anInt3165++] = Static282.aClass2_Sub5_Sub15_6 == null ? -1 : Static282.aClass2_Sub5_Sub15_6.anInt5823;
					return;
				}
				if (arg0 == 5236) {
					anInt3165 -= 2;
					local157 = anIntArray260[anInt3165];
					local192 = anIntArray260[anInt3165 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static212.method2823(local89, local157, local95);
					if (local2691 < 0) {
						anIntArray260[anInt3165++] = -1;
						return;
					}
					anIntArray260[anInt3165++] = local2691;
					return;
				}
				if (arg0 == 5237) {
					Static352.method4675();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt3165 -= 2;
					local157 = anIntArray260[anInt3165];
					local192 = anIntArray260[anInt3165 + 1];
					Static354.method4724(3, false, local192, local157);
					anIntArray260[anInt3165++] = Static300.aFrame4 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static300.aFrame4 != null) {
						Static354.method4724(Static2.aClass148_Sub1_1.anInt3787, false, -1, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2775) Class238[] local2775 = Static120.method1802();
					anIntArray260[anInt3165++] = local2775.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray260[--anInt3165];
					@Pc(2799) Class238[] local2799 = Static120.method1802();
					anIntArray260[anInt3165++] = local2799[local157].anInt6531;
					anIntArray260[anInt3165++] = local2799[local157].anInt6530;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static2.aClass148_Sub1_1.anInt3779;
					local192 = Static2.aClass148_Sub1_1.anInt3777;
					local89 = -1;
					@Pc(2836) Class238[] local2836 = Static120.method1802();
					for (local2691 = 0; local2691 < local2836.length; local2691++) {
						@Pc(2843) Class238 local2843 = local2836[local2691];
						if (local2843.anInt6531 == local157 && local2843.anInt6530 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray260[anInt3165++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray260[anInt3165++] = Static284.method3772();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray260[--anInt3165];
					if (local157 >= 1 && local157 <= 2) {
						Static354.method4724(local157, false, -1, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.anInt3787;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray260[--anInt3165];
					if (local157 >= 1 && local157 <= 2) {
						Static2.aClass148_Sub1_1.anInt3787 = local157;
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						return;
					}
					return;
				}
			} else {
				@Pc(3351) String local3351;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt3160 -= 2;
						local75 = aStringArray15[anInt3160];
						local81 = aStringArray15[anInt3160 + 1];
						local89 = anIntArray260[--anInt3165];
						Static29.method451(Static286.aClass102_142);
						Static456.aClass2_Sub13_Sub2_2.method3602(Static385.method4939(local75) + Static385.method4939(local81) + 1);
						Static456.aClass2_Sub13_Sub2_2.method3590(local75);
						Static456.aClass2_Sub13_Sub2_2.method3590(local81);
						Static456.aClass2_Sub13_Sub2_2.method3602(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt3165 -= 2;
						Static185.aShortArray25[anIntArray260[anInt3165]] = (short) Static433.method5451(anIntArray260[anInt3165 + 1]);
						Static384.aClass164_2.method3461();
						Static384.aClass164_2.method3462();
						Static155.aClass263_1.method5584();
						Static204.method2721();
						return;
					}
					if (arg0 == 5405) {
						anInt3165 -= 2;
						local157 = anIntArray260[anInt3165];
						local192 = anIntArray260[anInt3165 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static343.anIntArrayArrayArray14[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt3165 -= 7;
						local157 = anIntArray260[anInt3165];
						local192 = anIntArray260[anInt3165 + 1] << 1;
						local89 = anIntArray260[anInt3165 + 2];
						local95 = anIntArray260[anInt3165 + 3];
						local2691 = anIntArray260[anInt3165 + 4];
						@Pc(3111) int local3111 = anIntArray260[anInt3165 + 5];
						@Pc(3117) int local3117 = anIntArray260[anInt3165 + 6];
						if (local157 >= 0 && local157 < 2 && Static343.anIntArrayArrayArray14[local157] != null && local192 >= 0 && local192 < Static343.anIntArrayArrayArray14[local157].length) {
							Static343.anIntArrayArrayArray14[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3117 };
							Static343.anIntArrayArrayArray14[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3111, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static343.anIntArrayArrayArray14[anIntArray260[--anInt3165]].length >> 1;
						anIntArray260[anInt3165++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static300.aFrame4 != null) {
							Static354.method4724(Static2.aClass148_Sub1_1.anInt3787, false, -1, -1);
						}
						if (Static261.aFrame3 != null) {
							Static336.method4489();
							System.exit(0);
							return;
						}
						local75 = Static32.aString25 == null ? Static36.method541() : Static32.aString25;
						Static25.method363(local75, false, Static288.anInt4743 == 1, Static79.aClass183_2);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static129.aClass91_1 != null) {
							if (Static129.aClass91_1.anObject3 == null) {
								local75 = Static398.method5067(Static129.aClass91_1.anInt2445);
							} else {
								local75 = (String) Static129.aClass91_1.anObject3;
							}
						}
						aStringArray15[anInt3160++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray260[anInt3165++] = Static293.anInt4810 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static300.aFrame4 != null) {
							Static354.method4724(Static2.aClass148_Sub1_1.anInt3787, false, -1, -1);
						}
						local75 = aStringArray15[--anInt3160];
						local1313 = anIntArray260[--anInt3165] == 1;
						local3351 = Static36.method541() + local75;
						Static25.method363(local3351, local1313, Static288.anInt4743 == 1, Static79.aClass183_2);
						return;
					}
					if (arg0 == 5422) {
						anInt3160 -= 2;
						local75 = aStringArray15[anInt3160];
						local81 = aStringArray15[anInt3160 + 1];
						local89 = anIntArray260[--anInt3165];
						if (local75.length() > 0) {
							if (Static252.aStringArray24 == null) {
								Static252.aStringArray24 = new String[Static169.anIntArray230[Static118.aClass4_1.anInt73]];
							}
							Static252.aStringArray24[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static447.aStringArray42 == null) {
								Static447.aStringArray42 = new String[Static169.anIntArray230[Static118.aClass4_1.anInt73]];
							}
							Static447.aStringArray42[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray15[--anInt3160]);
						return;
					}
					if (arg0 == 5424) {
						anInt3165 -= 11;
						Static323.anInt2072 = anIntArray260[anInt3165];
						Static243.anInt609 = anIntArray260[anInt3165 + 1];
						Static116.anInt2168 = anIntArray260[anInt3165 + 2];
						Static136.anInt2425 = anIntArray260[anInt3165 + 3];
						Static120.anInt2211 = anIntArray260[anInt3165 + 4];
						Static205.anInt3429 = anIntArray260[anInt3165 + 5];
						Static75.anInt1422 = anIntArray260[anInt3165 + 6];
						Static401.anInt6550 = anIntArray260[anInt3165 + 7];
						Static96.anInt1853 = anIntArray260[anInt3165 + 8];
						Static8.anInt128 = anIntArray260[anInt3165 + 9];
						Static124.anInt1090 = anIntArray260[anInt3165 + 10];
						Static103.aClass54_28.method1131(Static120.anInt2211);
						Static103.aClass54_28.method1131(Static205.anInt3429);
						Static103.aClass54_28.method1131(Static75.anInt1422);
						Static103.aClass54_28.method1131(Static401.anInt6550);
						Static103.aClass54_28.method1131(Static96.anInt1853);
						Static291.aClass13_18 = null;
						Static303.aClass13_20 = null;
						Static237.aClass13_14 = null;
						Static410.aClass13_23 = null;
						Static114.aClass13_9 = null;
						Static325.aClass13_21 = null;
						Static86.aClass13_24 = null;
						Static171.aClass13_12 = null;
						Static285.aBoolean329 = true;
						return;
					}
					if (arg0 == 5425) {
						Static310.method4243();
						Static285.aBoolean329 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt3165 -= 2;
						Static82.anInt1523 = anIntArray260[anInt3165];
						Static235.anInt3807 = anIntArray260[anInt3165 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt3165 -= 2;
						Static63.anInt1184 = anIntArray260[anInt3165 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt3165 -= 2;
						local157 = anIntArray260[anInt3165];
						local192 = anIntArray260[anInt3165 + 1];
						anIntArray260[anInt3165++] = Static354.method4728(local157, local192) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static27.method2039(false, aStringArray15[--anInt3160], false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static469.method4194("accountcreated", Static79.aClass183_2.anApplet1);
							return;
						} catch (@Pc(3646) Throwable local3646) {
							return;
						}
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt3165 -= 4;
						local157 = anIntArray260[anInt3165];
						local192 = anIntArray260[anInt3165 + 1];
						local89 = anIntArray260[anInt3165 + 2];
						local95 = anIntArray260[anInt3165 + 3];
						Static16.method199((local157 & 0x3FFF) - Static209.anInt3497, local95, (local157 >> 14 & 0x3FFF) - Static275.anInt4506, local192, false, local89);
						return;
					}
					if (arg0 == 5501) {
						anInt3165 -= 4;
						local157 = anIntArray260[anInt3165];
						local192 = anIntArray260[anInt3165 + 1];
						local89 = anIntArray260[anInt3165 + 2];
						local95 = anIntArray260[anInt3165 + 3];
						Static158.method2009(local95, (local157 >> 14 & 0x3FFF) - Static275.anInt4506, local89, local192, (local157 & 0x3FFF) - Static209.anInt3497);
						return;
					}
					if (arg0 == 5502) {
						anInt3165 -= 6;
						local157 = anIntArray260[anInt3165];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static27.anInt2471 = local157;
						local192 = anIntArray260[anInt3165 + 1];
						if (local192 + 1 >= Static343.anIntArrayArrayArray14[Static27.anInt2471].length >> 1) {
							throw new RuntimeException();
						}
						Static18.anInt3418 = local192;
						Static241.anInt3890 = 0;
						Static320.anInt5507 = anIntArray260[anInt3165 + 2];
						Static195.anInt3319 = anIntArray260[anInt3165 + 3];
						local89 = anIntArray260[anInt3165 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static96.anInt1857 = local89;
						local95 = anIntArray260[anInt3165 + 5];
						if (local95 + 1 >= Static343.anIntArrayArrayArray14[Static96.anInt1857].length >> 1) {
							throw new RuntimeException();
						}
						Static428.anInt6928 = local95;
						Static414.anInt6776 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static279.method4996();
						return;
					}
					if (arg0 == 5504) {
						anInt3165 -= 2;
						Static196.method2641(anIntArray260[anInt3165], anIntArray260[anInt3165 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray260[anInt3165++] = (int) Static332.aFloat80 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray260[anInt3165++] = (int) Static113.aFloat19 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static420.method5323();
						return;
					}
					if (arg0 == 5508) {
						Static311.method5189();
						return;
					}
					if (arg0 == 5509) {
						Static53.method740();
						return;
					}
					if (arg0 == 5510) {
						Static113.method1719();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray260[--anInt3165];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static275.anInt4506;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static166.anInt2852) {
							local192 = Static166.anInt2852;
						}
						local89 -= Static209.anInt3497;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static426.anInt6923) {
							local89 = Static426.anInt6923;
						}
						Static294.anInt1008 = (local192 << 7) + 64;
						Static136.anInt2424 = (local89 << 7) + 64;
						Static414.anInt6776 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static253.method3209();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt3160 -= 2;
						local75 = aStringArray15[anInt3160];
						local81 = aStringArray15[anInt3160 + 1];
						local89 = anIntArray260[--anInt3165];
						if (Static290.anInt4777 != 2) {
							return;
						}
						if (Static450.anInt7195 == 0 && Static128.anInt2309 == 0) {
							Static427.aString196 = local75;
							Static258.aString121 = local81;
							Static220.anInt3626 = local89;
							Static37.method5022(5);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static290.method3868();
						return;
					}
					if (arg0 == 5602) {
						if (Static450.anInt7195 == 0) {
							Static422.anInt6874 = -2;
							Static252.anInt4057 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt3165 -= 4;
						if (Static290.anInt4777 != 2) {
							return;
						}
						if (Static450.anInt7195 == 0 && Static128.anInt2309 == 0) {
							Static120.method1800(anIntArray260[anInt3165 + 1], anIntArray260[anInt3165], anIntArray260[anInt3165 + 2], anIntArray260[anInt3165 + 3]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt3160--;
						if (Static290.anInt4777 != 2) {
							return;
						}
						if (Static450.anInt7195 == 0 && Static128.anInt2309 == 0) {
							Static360.method4751(Static380.method358(aStringArray15[anInt3160]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt3160 -= 2;
						if (Static290.anInt4777 != 2) {
							return;
						}
						if (Static450.anInt7195 == 0 && Static128.anInt2309 == 0) {
							Static104.method1555(false, Static380.method358(aStringArray15[anInt3160]), aStringArray15[anInt3160 + 1]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static128.anInt2309 == 0) {
							Static310.anInt5372 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray260[anInt3165++] = Static252.anInt4057;
						return;
					}
					if (arg0 == 5608) {
						anIntArray260[anInt3165++] = Static43.anInt801;
						return;
					}
					if (arg0 == 5609) {
						anIntArray260[anInt3165++] = Static310.anInt5372;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray15[anInt3160++] = Static444.aStringArray41.length > local157 ? Static13.method165(Static444.aStringArray41[local157]) : "";
						}
						Static444.aStringArray41 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray260[anInt3165++] = Static62.anInt1154;
						return;
					}
					if (arg0 == 5612) {
						local157 = anIntArray260[--anInt3165];
						if (Static290.anInt4777 != 6) {
							return;
						}
						if (Static450.anInt7195 == 0 && Static128.anInt2309 == 0) {
							if (Static375.aClass160_3 != null) {
								Static375.aClass160_3.method3202();
								Static375.aClass160_3 = null;
							}
							Static220.anInt3626 = local157;
							Static37.method5022(8);
							return;
						}
						return;
					}
					if (arg0 == 5613) {
						anIntArray260[anInt3165++] = Static252.anInt4057;
						return;
					}
					if (arg0 == 5615) {
						anInt3160 -= 2;
						local75 = aStringArray15[anInt3160];
						local81 = aStringArray15[anInt3160 + 1];
						if (Static290.anInt4777 != 2) {
							return;
						}
						if (Static450.anInt7195 == 0 && Static128.anInt2309 == 0) {
							if (Static375.aClass160_3 != null) {
								Static375.aClass160_3.method3202();
								Static375.aClass160_3 = null;
							}
							Static427.aString196 = local75;
							Static258.aString121 = local81;
							Static37.method5022(4);
							return;
						}
						return;
					}
					if (arg0 == 5616) {
						Static312.method4252(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray260[anInt3165++] = Static422.anInt6874;
						return;
					}
					if (arg0 == 5618) {
						local157 = anIntArray260[--anInt3165];
						Static456.method5711(false, local157);
						return;
					}
					if (arg0 == 5619) {
						local157 = anIntArray260[--anInt3165];
						Static456.method5711(true, local157);
						return;
					}
					if (arg0 == 5620) {
						Static339.method4553();
						if (Static250.aString118 != "" && Static250.aString118 != "") {
							anIntArray260[anInt3165++] = 1;
							return;
						}
						anIntArray260[anInt3165++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt3160 -= 2;
						if (Static290.anInt4777 != 2) {
							return;
						}
						if (Static450.anInt7195 == 0 && Static128.anInt2309 == 0) {
							Static104.method1555(true, Static380.method358(aStringArray15[anInt3160]), aStringArray15[anInt3160 + 1]);
							return;
						}
						return;
					}
					if (arg0 == 5622) {
						@Pc(4436) Class91 local4436 = Static79.aClass183_2.method3921("3", false);
						while (local4436.anInt2446 == 0) {
							Static429.method5376(1L);
						}
						if (local4436.anInt2446 == 2) {
							throw new RuntimeException("Error opening file");
						}
						@Pc(4456) Class178 local4456 = (Class178) local4436.anObject3;
						if (local4456.method3781().exists()) {
							@Pc(4466) Class2_Sub13 local4466 = new Class2_Sub13(50);
							try {
								local4456.method3782(50, local4466.aByteArray52, 0);
							} catch (@Pc(4475) IOException local4475) {
							}
						}
						try {
							local4456.method3779();
							return;
						} catch (@Pc(4481) Exception local4481) {
							return;
						}
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray260[--anInt3165];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static2.aClass148_Sub1_1.anInt3784 = local157;
						Static284.method3776();
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static418.aBoolean496 = false;
						return;
					}
					if (arg0 == 6002) {
						Static2.aClass148_Sub1_1.method3050(anIntArray260[--anInt3165] == 1);
						Static284.method3776();
						Static389.method4967();
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static418.aBoolean496 = false;
						return;
					}
					if (arg0 == 6003) {
						Static2.aClass148_Sub1_1.aBoolean256 = anIntArray260[--anInt3165] == 1;
						Static389.method4967();
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static418.aBoolean496 = false;
						return;
					}
					if (arg0 == 6005) {
						Static2.aClass148_Sub1_1.aBoolean254 = anIntArray260[--anInt3165] == 1;
						Static284.method3776();
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static418.aBoolean496 = false;
						return;
					}
					if (arg0 == 6006) {
						Static2.aClass148_Sub1_1.aBoolean258 = anIntArray260[--anInt3165] == 1;
						Static82.aClass163_1.method5531(!Static2.aClass148_Sub1_1.aBoolean258);
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static418.aBoolean496 = false;
						return;
					}
					if (arg0 == 6007) {
						Static2.aClass148_Sub1_1.anInt3783 = anIntArray260[--anInt3165];
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static418.aBoolean496 = false;
						return;
					}
					if (arg0 == 6008) {
						Static2.aClass148_Sub1_1.aBoolean250 = anIntArray260[--anInt3165] == 1;
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static418.aBoolean496 = false;
						return;
					}
					if (arg0 == 6009) {
						Static2.aClass148_Sub1_1.aBoolean253 = anIntArray260[--anInt3165] == 1;
						Static284.method3776();
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static418.aBoolean496 = false;
						return;
					}
					if (arg0 == 6010) {
						Static2.aClass148_Sub1_1.aBoolean255 = anIntArray260[--anInt3165] == 1;
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static418.aBoolean496 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray260[--anInt3165];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static2.aClass148_Sub1_1.method3039(local157, Static288.anInt4743);
						Static284.method3776();
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static418.aBoolean496 = false;
						return;
					}
					if (arg0 == 6012) {
						Static2.aClass148_Sub1_1.method3037(Static288.anInt4743, anIntArray260[--anInt3165] == 1);
						Static361.method4755();
						Static449.method5641();
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static418.aBoolean496 = false;
						return;
					}
					if (arg0 == 6014) {
						Static2.aClass148_Sub1_1.aBoolean247 = anIntArray260[--anInt3165] == 1;
						Static284.method3776();
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static418.aBoolean496 = false;
						return;
					}
					if (arg0 == 6015) {
						Static2.aClass148_Sub1_1.aBoolean248 = anIntArray260[--anInt3165] == 1;
						Static284.method3776();
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static418.aBoolean496 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray260[--anInt3165];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static2.aClass148_Sub1_1.anInt3796 = local157;
						Static424.method5112(Static288.anInt4743);
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						return;
					}
					if (arg0 == 6017) {
						Static2.aClass148_Sub1_1.aBoolean249 = anIntArray260[--anInt3165] == 1;
						Static134.method1993();
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static418.aBoolean496 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray260[--anInt3165];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static2.aClass148_Sub1_1.anInt3778 = local157;
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static418.aBoolean496 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray260[--anInt3165];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static2.aClass148_Sub1_1.anInt3792) {
							if (Static2.aClass148_Sub1_1.anInt3792 == 0 && Static246.anInt3968 != -1) {
								Static216.method2861(Static120.aClass54_36, Static246.anInt3968, local157);
								Static372.aBoolean448 = false;
							} else if (local157 == 0) {
								Static334.method4466();
								Static372.aBoolean448 = false;
							} else {
								Static60.method881(local157);
							}
							Static2.aClass148_Sub1_1.anInt3792 = local157;
						}
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static418.aBoolean496 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray260[--anInt3165];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static2.aClass148_Sub1_1.anInt3790 = local157;
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static418.aBoolean496 = false;
						return;
					}
					if (arg0 == 6021) {
						Static2.aClass148_Sub1_1.aBoolean263 = anIntArray260[--anInt3165] == 1;
						Static389.method4967();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray260[--anInt3165];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static177.anInt3052 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static199.method2678(local157);
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static418.aBoolean496 = false;
						anIntArray260[anInt3165++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray260[--anInt3165];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static2.aClass148_Sub1_1.anInt3781 = local157;
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray260[--anInt3165];
						if (local157 < 0 || local157 > Static82.method1188(Static177.anInt3052)) {
							local157 = 0;
						}
						Static2.aClass148_Sub1_1.anInt3776 = local157;
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static418.aBoolean496 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray260[--anInt3165];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static417.method5271(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static2.aClass148_Sub1_1.aBoolean257 = anIntArray260[--anInt3165] != 0;
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						return;
					}
					if (arg0 == 6029) {
						Static2.aClass148_Sub1_1.anInt3783 = anIntArray260[--anInt3165];
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						return;
					}
					if (arg0 == 6030) {
						Static2.aClass148_Sub1_1.aBoolean246 = anIntArray260[--anInt3165] != 0;
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static284.method3776();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray260[--anInt3165];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static424.method5112(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray260[--anInt3165];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static2.aClass148_Sub1_1.anInt3795 = local157;
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static418.aBoolean496 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray260[--anInt3165];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static2.aClass148_Sub1_1.anInt3793 = local157;
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						return;
					}
					if (arg0 == 6034) {
						Static2.aClass148_Sub1_1.aBoolean260 = anIntArray260[--anInt3165] == 1;
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						Static361.method4755();
						Static418.aBoolean496 = false;
						return;
					}
					if (arg0 == 6035) {
						Static2.aClass148_Sub1_1.aBoolean264 = anIntArray260[--anInt3165] == 1;
						Static284.method3776();
						Static389.method4967();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.anInt3784;
						return;
					}
					if (arg0 == 6102) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.method3042(Static288.anInt4743) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.aBoolean256 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.aBoolean254 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.aBoolean258 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.anInt3783;
						return;
					}
					if (arg0 == 6108) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.aBoolean250 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.aBoolean253 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.aBoolean255 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.method3036(Static288.anInt4743);
						return;
					}
					if (arg0 == 6112) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.method3040(Static288.anInt4743) ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.aBoolean247 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.aBoolean248 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.anInt3796;
						return;
					}
					if (arg0 == 6117) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.aBoolean249 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.anInt3778;
						return;
					}
					if (arg0 == 6119) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.anInt3792;
						return;
					}
					if (arg0 == 6120) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.anInt3790;
						return;
					}
					if (arg0 == 6121) {
						anIntArray260[anInt3165++] = Static82.aClass163_1.method5521() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray260[anInt3165++] = Static194.method2631();
						return;
					}
					if (arg0 == 6124) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.anInt3781;
						return;
					}
					if (arg0 == 6125) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.anInt3776;
						return;
					}
					if (arg0 == 6126) {
						anIntArray260[anInt3165++] = Static82.aClass163_1.method5507() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.aBoolean261 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.aBoolean257 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.anInt3783;
						return;
					}
					if (arg0 == 6130) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.aBoolean246 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray260[anInt3165++] = Static288.anInt4743;
						return;
					}
					if (arg0 == 6132) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.anInt3795;
						return;
					}
					if (arg0 == 6133) {
						anIntArray260[anInt3165++] = Static293.anInt4810 == 1 || Static293.anInt4810 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray260[anInt3165++] = Static82.method1188(Static177.anInt3052);
						return;
					}
					if (arg0 == 6135) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.anInt3793;
						return;
					}
					if (arg0 == 6136) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.aBoolean260 ? 1 : 0;
						return;
					}
					if (arg0 == 6137) {
						@Pc(5871) boolean local5871 = true;
						try {
							local5871 = jagmisc.getTotalPhysicalMemory() > 268435456L;
						} catch (@Pc(5881) Throwable local5881) {
						}
						anIntArray260[anInt3165++] = local5871 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt3165 -= 2;
						Static230.aShort31 = (short) anIntArray260[anInt3165];
						if (Static230.aShort31 <= 0) {
							Static230.aShort31 = 256;
						}
						Static349.aShort73 = (short) anIntArray260[anInt3165 + 1];
						if (Static349.aShort73 <= 0) {
							Static349.aShort73 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt3165 -= 2;
						Static331.aShort63 = (short) anIntArray260[anInt3165];
						if (Static331.aShort63 <= 0) {
							Static331.aShort63 = 256;
						}
						Static86.aShort94 = (short) anIntArray260[anInt3165 + 1];
						if (Static86.aShort94 <= 0) {
							Static86.aShort94 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt3165 -= 4;
						Static29.aShort7 = (short) anIntArray260[anInt3165];
						if (Static29.aShort7 <= 0) {
							Static29.aShort7 = 1;
						}
						Static258.aShort38 = (short) anIntArray260[anInt3165 + 1];
						if (Static258.aShort38 <= 0) {
							Static258.aShort38 = 32767;
						} else if (Static258.aShort38 < Static29.aShort7) {
							Static258.aShort38 = Static29.aShort7;
						}
						Static247.aShort36 = (short) anIntArray260[anInt3165 + 2];
						if (Static247.aShort36 <= 0) {
							Static247.aShort36 = 1;
						}
						Static458.aShort108 = (short) anIntArray260[anInt3165 + 3];
						if (Static458.aShort108 <= 0) {
							Static458.aShort108 = 32767;
							return;
						}
						if (Static458.aShort108 < Static247.aShort36) {
							Static458.aShort108 = Static247.aShort36;
						}
						return;
					}
					if (arg0 == 6203) {
						Static139.method2047(0, Static388.aClass16_15.anInt285, 0, Static388.aClass16_15.anInt294, false);
						anIntArray260[anInt3165++] = Static197.anInt3346;
						anIntArray260[anInt3165++] = Static22.anInt349;
						return;
					}
					if (arg0 == 6204) {
						anIntArray260[anInt3165++] = Static331.aShort63;
						anIntArray260[anInt3165++] = Static86.aShort94;
						return;
					}
					if (arg0 == 6205) {
						anIntArray260[anInt3165++] = Static230.aShort31;
						anIntArray260[anInt3165++] = Static349.aShort73;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray260[anInt3165++] = (int) (Static110.method1702() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray260[anInt3165++] = (int) (Static110.method1702() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt3165 -= 3;
						local157 = anIntArray260[anInt3165];
						local192 = anIntArray260[anInt3165 + 1];
						local89 = anIntArray260[anInt3165 + 2];
						aCalendar2.clear();
						aCalendar2.set(11, 12);
						aCalendar2.set(local89, local192, local157);
						local95 = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
						if (local89 < 1970) {
							local95--;
						}
						anIntArray260[anInt3165++] = local95;
						return;
					}
					if (arg0 == 6303) {
						aCalendar2.clear();
						aCalendar2.setTime(new Date(Static110.method1702()));
						anIntArray260[anInt3165++] = aCalendar2.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray260[--anInt3165];
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
						anIntArray260[anInt3165++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray260[anInt3165++] = Static419.method5307() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray260[anInt3165++] = Static450.method5658() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static290.anInt4777 == 6 && Static450.anInt7195 == 0 && Static128.anInt2309 == 0) {
							if (Static418.aBoolean495) {
								anIntArray260[anInt3165++] = 0;
								return;
							}
							if (Static244.aLong136 > Static110.method1702() - 1000L) {
								anIntArray260[anInt3165++] = 1;
								return;
							}
							Static418.aBoolean495 = true;
							Static29.method451(Static68.aClass102_149);
							Static456.aClass2_Sub13_Sub2_2.method3569(Static317.anInt6669);
							anIntArray260[anInt3165++] = 0;
							return;
						}
						anIntArray260[anInt3165++] = 1;
						return;
					}
					@Pc(6414) Class186 local6414;
					@Pc(6381) Class65_Sub1 local6381;
					if (arg0 == 6501) {
						local6381 = Static429.method5375();
						if (local6381 != null) {
							anIntArray260[anInt3165++] = local6381.anInt2404;
							anIntArray260[anInt3165++] = local6381.anInt2397;
							aStringArray15[anInt3160++] = local6381.aString74;
							local6414 = local6381.method1992();
							anIntArray260[anInt3165++] = local6414.anInt4825;
							aStringArray15[anInt3160++] = local6414.aString144;
							anIntArray260[anInt3165++] = local6381.anInt2401;
							anIntArray260[anInt3165++] = local6381.anInt2408;
							aStringArray15[anInt3160++] = local6381.aString73;
							return;
						}
						anIntArray260[anInt3165++] = -1;
						anIntArray260[anInt3165++] = 0;
						aStringArray15[anInt3160++] = "";
						anIntArray260[anInt3165++] = 0;
						aStringArray15[anInt3160++] = "";
						anIntArray260[anInt3165++] = 0;
						anIntArray260[anInt3165++] = 0;
						aStringArray15[anInt3160++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6381 = Static263.method2959();
						if (local6381 != null) {
							anIntArray260[anInt3165++] = local6381.anInt2404;
							anIntArray260[anInt3165++] = local6381.anInt2397;
							aStringArray15[anInt3160++] = local6381.aString74;
							local6414 = local6381.method1992();
							anIntArray260[anInt3165++] = local6414.anInt4825;
							aStringArray15[anInt3160++] = local6414.aString144;
							anIntArray260[anInt3165++] = local6381.anInt2401;
							anIntArray260[anInt3165++] = local6381.anInt2408;
							aStringArray15[anInt3160++] = local6381.aString73;
							return;
						}
						anIntArray260[anInt3165++] = -1;
						anIntArray260[anInt3165++] = 0;
						aStringArray15[anInt3160++] = "";
						anIntArray260[anInt3165++] = 0;
						aStringArray15[anInt3160++] = "";
						anIntArray260[anInt3165++] = 0;
						anIntArray260[anInt3165++] = 0;
						aStringArray15[anInt3160++] = "";
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray260[--anInt3165];
						local81 = aStringArray15[--anInt3160];
						if (Static290.anInt4777 == 6 && Static450.anInt7195 == 0 && Static128.anInt2309 == 0) {
							anIntArray260[anInt3165++] = Static153.method2189(local81, local157) ? 1 : 0;
							return;
						}
						anIntArray260[anInt3165++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static2.aClass148_Sub1_1.anInt3791 = anIntArray260[--anInt3165];
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						return;
					}
					if (arg0 == 6505) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.anInt3791;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray260[--anInt3165];
						@Pc(6771) Class65_Sub1 local6771 = Static14.method171(local157);
						if (local6771 != null) {
							anIntArray260[anInt3165++] = local6771.anInt2397;
							aStringArray15[anInt3160++] = local6771.aString74;
							@Pc(6795) Class186 local6795 = local6771.method1992();
							anIntArray260[anInt3165++] = local6795.anInt4825;
							aStringArray15[anInt3160++] = local6795.aString144;
							anIntArray260[anInt3165++] = local6771.anInt2401;
							anIntArray260[anInt3165++] = local6771.anInt2408;
							aStringArray15[anInt3160++] = local6771.aString73;
							return;
						}
						anIntArray260[anInt3165++] = -1;
						aStringArray15[anInt3160++] = "";
						anIntArray260[anInt3165++] = 0;
						aStringArray15[anInt3160++] = "";
						anIntArray260[anInt3165++] = 0;
						anIntArray260[anInt3165++] = 0;
						aStringArray15[anInt3160++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt3165 -= 4;
						local157 = anIntArray260[anInt3165];
						local1313 = anIntArray260[anInt3165 + 1] == 1;
						local89 = anIntArray260[anInt3165 + 2];
						local1965 = anIntArray260[anInt3165 + 3] == 1;
						Static16.method202(local157, local89, local1313, local1965);
						return;
					}
					if (arg0 == 6508) {
						Static383.method4928();
						return;
					}
					if (arg0 == 6509) {
						if (Static290.anInt4777 != 6) {
							return;
						}
						Static365.aBoolean444 = anIntArray260[--anInt3165] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static2.aClass148_Sub1_1.aBoolean245 = anIntArray260[--anInt3165] == 1;
						Static2.aClass148_Sub1_1.method3041(Static79.aClass183_2);
						return;
					}
					if (arg0 == 6601) {
						anIntArray260[anInt3165++] = Static2.aClass148_Sub1_1.aBoolean245 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static163.aClass60_1 == Static381.aClass60_4) {
					if (arg0 == 6700) {
						local157 = Static418.aClass72_44.method1652();
						if (Static142.anInt2523 != -1) {
							local157++;
						}
						anIntArray260[anInt3165++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray260[--anInt3165];
						if (Static142.anInt2523 != -1) {
							if (local157 == 0) {
								anIntArray260[anInt3165++] = Static142.anInt2523;
								return;
							}
							local157--;
						}
						@Pc(7070) Class2_Sub21 local7070 = (Class2_Sub21) Static418.aClass72_44.method1655();
						while (local157-- > 0) {
							local7070 = (Class2_Sub21) Static418.aClass72_44.method1649();
						}
						anIntArray260[anInt3165++] = local7070.anInt2585;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray260[--anInt3165];
						if (Static151.aClass16ArrayArray1[local157] == null) {
							aStringArray15[anInt3160++] = "";
							return;
						}
						local81 = Static151.aClass16ArrayArray1[local157][0].aString14;
						if (local81 == null) {
							aStringArray15[anInt3160++] = "";
							return;
						}
						aStringArray15[anInt3160++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray260[--anInt3165];
						if (Static151.aClass16ArrayArray1[local157] == null) {
							anIntArray260[anInt3165++] = 0;
							return;
						}
						anIntArray260[anInt3165++] = Static151.aClass16ArrayArray1[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt3165 -= 2;
						local157 = anIntArray260[anInt3165];
						local192 = anIntArray260[anInt3165 + 1];
						if (Static151.aClass16ArrayArray1[local157] == null) {
							aStringArray15[anInt3160++] = "";
							return;
						}
						local3351 = Static151.aClass16ArrayArray1[local157][local192].aString14;
						if (local3351 == null) {
							aStringArray15[anInt3160++] = "";
							return;
						}
						aStringArray15[anInt3160++] = local3351;
						return;
					}
					if (arg0 == 6705) {
						anInt3165 -= 2;
						local157 = anIntArray260[anInt3165];
						local192 = anIntArray260[anInt3165 + 1];
						if (Static151.aClass16ArrayArray1[local157] == null) {
							anIntArray260[anInt3165++] = 0;
							return;
						}
						anIntArray260[anInt3165++] = Static151.aClass16ArrayArray1[local157][local192].anInt253;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt3165 -= 3;
						local157 = anIntArray260[anInt3165];
						local192 = anIntArray260[anInt3165 + 1];
						local89 = anIntArray260[anInt3165 + 2];
						Static386.method4944(local89, "", local157 << 16 | local192, 1);
						return;
					}
					if (arg0 == 6708) {
						anInt3165 -= 3;
						local157 = anIntArray260[anInt3165];
						local192 = anIntArray260[anInt3165 + 1];
						local89 = anIntArray260[anInt3165 + 2];
						Static386.method4944(local89, "", local157 << 16 | local192, 2);
						return;
					}
					if (arg0 == 6709) {
						anInt3165 -= 3;
						local157 = anIntArray260[anInt3165];
						local192 = anIntArray260[anInt3165 + 1];
						local89 = anIntArray260[anInt3165 + 2];
						Static386.method4944(local89, "", local157 << 16 | local192, 3);
						return;
					}
					if (arg0 == 6710) {
						anInt3165 -= 3;
						local157 = anIntArray260[anInt3165];
						local192 = anIntArray260[anInt3165 + 1];
						local89 = anIntArray260[anInt3165 + 2];
						Static386.method4944(local89, "", local157 << 16 | local192, 4);
						return;
					}
					if (arg0 == 6711) {
						anInt3165 -= 3;
						local157 = anIntArray260[anInt3165];
						local192 = anIntArray260[anInt3165 + 1];
						local89 = anIntArray260[anInt3165 + 2];
						Static386.method4944(local89, "", local157 << 16 | local192, 5);
						return;
					}
					if (arg0 == 6712) {
						anInt3165 -= 3;
						local157 = anIntArray260[anInt3165];
						local192 = anIntArray260[anInt3165 + 1];
						local89 = anIntArray260[anInt3165 + 2];
						Static386.method4944(local89, "", local157 << 16 | local192, 6);
						return;
					}
					if (arg0 == 6713) {
						anInt3165 -= 3;
						local157 = anIntArray260[anInt3165];
						local192 = anIntArray260[anInt3165 + 1];
						local89 = anIntArray260[anInt3165 + 2];
						Static386.method4944(local89, "", local157 << 16 | local192, 7);
						return;
					}
					if (arg0 == 6714) {
						anInt3165 -= 3;
						local157 = anIntArray260[anInt3165];
						local192 = anIntArray260[anInt3165 + 1];
						local89 = anIntArray260[anInt3165 + 2];
						Static386.method4944(local89, "", local157 << 16 | local192, 8);
						return;
					}
					if (arg0 == 6715) {
						anInt3165 -= 3;
						local157 = anIntArray260[anInt3165];
						local192 = anIntArray260[anInt3165 + 1];
						local89 = anIntArray260[anInt3165 + 2];
						Static386.method4944(local89, "", local157 << 16 | local192, 9);
						return;
					}
					if (arg0 == 6716) {
						anInt3165 -= 3;
						local157 = anIntArray260[anInt3165];
						local192 = anIntArray260[anInt3165 + 1];
						local89 = anIntArray260[anInt3165 + 2];
						Static386.method4944(local89, "", local157 << 16 | local192, 10);
						return;
					}
					if (arg0 == 6717) {
						anInt3165 -= 3;
						local157 = anIntArray260[anInt3165];
						local192 = anIntArray260[anInt3165 + 1];
						local89 = anIntArray260[anInt3165 + 2];
						@Pc(7658) Class16 local7658 = Static4.method73(local157 << 16 | local192, local89);
						Static377.method3604();
						@Pc(7663) Class2_Sub15 local7663 = Static55.method815(local7658);
						Static352.method4679(local7663.method1538(), local7658, local7663.anInt1899);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7691) Class78 local7691;
					if (arg0 == 6800) {
						local157 = anIntArray260[--anInt3165];
						local7691 = Static193.aClass120_2.method2512(local157);
						if (local7691.aString66 == null) {
							aStringArray15[anInt3160++] = "";
							return;
						}
						aStringArray15[anInt3160++] = local7691.aString66;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray260[--anInt3165];
						local7691 = Static193.aClass120_2.method2512(local157);
						anIntArray260[anInt3165++] = local7691.anInt2137;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray260[--anInt3165];
						local7691 = Static193.aClass120_2.method2512(local157);
						anIntArray260[anInt3165++] = local7691.anInt2164;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray260[--anInt3165];
						local7691 = Static193.aClass120_2.method2512(local157);
						anIntArray260[anInt3165++] = local7691.anInt2163;
						return;
					}
					if (arg0 == 6804) {
						anInt3165 -= 2;
						local157 = anIntArray260[anInt3165];
						local192 = anIntArray260[anInt3165 + 1];
						@Pc(7813) Class200 local7813 = Static234.aClass135_1.method2749(local192);
						if (local7813.method4356()) {
							aStringArray15[anInt3160++] = Static193.aClass120_2.method2512(local157).method1755(local192, local7813.aString154);
							return;
						}
						anIntArray260[anInt3165++] = Static193.aClass120_2.method2512(local157).method1758(local192, local7813.anInt5511);
						return;
					}
				} else if (arg0 < 7000) {
					if (arg0 == 6900) {
						anIntArray260[anInt3165++] = Static409.aBoolean471 && !Static399.aBoolean464 ? 1 : 0;
						return;
					}
					if (arg0 == 6901) {
						anIntArray260[anInt3165++] = Static13.anInt181;
						return;
					}
					if (arg0 == 6902) {
						anIntArray260[anInt3165++] = Static413.anInt6774;
						return;
					}
					if (arg0 == 6903) {
						anIntArray260[anInt3165++] = Static72.anInt1389;
						return;
					}
					if (arg0 == 6904) {
						anIntArray260[anInt3165++] = Static255.anInt4111;
						return;
					}
					if (arg0 == 6905) {
						local75 = "";
						if (Static129.aClass91_1 != null) {
							if (Static129.aClass91_1.anObject3 == null) {
								local75 = Static398.method5067(Static129.aClass91_1.anInt2445);
							} else {
								local75 = (String) Static129.aClass91_1.anObject3;
							}
						}
						aStringArray15[anInt3160++] = local75;
						return;
					}
					if (arg0 == 6906) {
						anIntArray260[anInt3165++] = Static271.anInt3782;
						return;
					}
					if (arg0 == 6907) {
						anIntArray260[anInt3165++] = Static246.anInt3973;
						return;
					}
					if (arg0 == 6908) {
						anIntArray260[anInt3165++] = Static32.anInt616;
						return;
					}
					if (arg0 == 6909) {
						anIntArray260[anInt3165++] = Static190.aBoolean186 ? 1 : 0;
						return;
					}
					if (arg0 == 6910) {
						anIntArray260[anInt3165++] = Static2.anInt4;
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(IZ)V")
	public static void method2570() {
	}
}
