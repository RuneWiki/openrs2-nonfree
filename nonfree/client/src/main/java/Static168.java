import jagex3.jagmisc.jagmisc;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "Lclient!em;")
	private static Class68 aClass68_5;

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "[I")
	private static int[] anIntArray297;

	@OriginalMember(owner = "client!iq", name = "t", descriptor = "Lclient!ql;")
	private static Class206 aClass206_1;

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray22;

	@OriginalMember(owner = "client!iq", name = "w", descriptor = "Lclient!em;")
	private static Class68 aClass68_6;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "[Lclient!qk;")
	private static final Class205[] aClass205Array1 = new Class205[50];

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
	private static int anInt3346 = 0;

	@OriginalMember(owner = "client!iq", name = "i", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar16 = Calendar.getInstance();

	@OriginalMember(owner = "client!iq", name = "j", descriptor = "[I")
	private static final int[] anIntArray298 = new int[1000];

	@OriginalMember(owner = "client!iq", name = "k", descriptor = "[I")
	private static final int[] anIntArray299 = new int[5];

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray21 = new String[1000];

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "[[I")
	private static final int[][] anIntArrayArray30 = new int[5][5000];

	@OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
	private static int anInt3354 = 0;

	@OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
	private static int anInt3355 = 0;

	@OriginalMember(owner = "client!iq", name = "y", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray23 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!iq", name = "A", descriptor = "Lclient!nj;")
	public static final Class171 aClass171_26 = new Class171(4);

	@OriginalMember(owner = "client!iq", name = "B", descriptor = "[I")
	private static final int[] anIntArray300 = new int[3];

	@OriginalMember(owner = "client!iq", name = "C", descriptor = "I")
	private static int anInt3359 = 0;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)Ljava/lang/String;")
	private static String method2729(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar16.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar16.get(5);
		@Pc(20) int local20 = aCalendar16.get(2);
		@Pc(24) int local24 = aCalendar16.get(1);
		return local16 + "-" + aStringArray23[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "()V")
	public static void method2730() {
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!of;)V")
	public static void method2731(@OriginalArg(0) Class2_Sub30 arg0) {
		method2737(arg0, 200000);
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V")
	private static void method2732(@OriginalArg(0) int arg0) {
		@Pc(3) Class68 local3 = Static165.method2704(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class68[] local13 = Static344.aClass68ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class68[] local19 = Static60.aClass68ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static344.aClass68ArrayArray2[local9] = new Class68[local22];
			Static457.method684(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static457.method684(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)V")
	private static void method2733(@OriginalArg(0) int arg0) {
		@Pc(3) Class68 local3 = Static165.method2704(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class68[] local13 = Static344.aClass68ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class68[] local19 = Static60.aClass68ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static344.aClass68ArrayArray2[local9] = new Class68[local22];
			Static457.method684(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static457.method684(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!ol;II)V")
	public static void method2734(@OriginalArg(0) Class182 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub5_Sub5 local5 = Static215.method3380(arg0, arg1, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray297 = new int[local5.anInt2105];
		aStringArray22 = new String[local5.anInt2108];
		if (local5.aClass182_30 == Static97.aClass182_34 || local5.aClass182_30 == Static359.aClass182_111 || local5.aClass182_30 == Static103.aClass182_37) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static193.aClass68_8 != null) {
				local30 = Static193.aClass68_8.anInt2244;
				local32 = Static193.aClass68_8.anInt2214;
			}
			anIntArray297[0] = Static109.aClass1_2.method702() - local30;
			anIntArray297[1] = Static109.aClass1_2.method698() - local32;
		}
		method2738(local5, 200000);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IZ)V")
	private static void method2735(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class68 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class68 local35;
		@Pc(13) int local13;
		@Pc(210) Class68 local210;
		@Pc(158) Class68 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt3355 -= 3;
				local13 = anIntArray298[anInt3355];
				local19 = anIntArray298[anInt3355 + 1];
				local25 = anIntArray298[anInt3355 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static165.method2704(local13);
				if (local35.aClass68Array1 == null) {
					local35.aClass68Array1 = new Class68[local25 + 1];
				}
				if (local35.aClass68Array1.length <= local25) {
					@Pc(54) Class68[] local54 = new Class68[local25 + 1];
					for (local56 = 0; local56 < local35.aClass68Array1.length; local56++) {
						local54[local56] = local35.aClass68Array1[local56];
					}
					local35.aClass68Array1 = local54;
				}
				if (local25 > 0 && local35.aClass68Array1[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class68 local99 = new Class68();
				local99.anInt2249 = local19;
				local99.anInt2221 = local99.anInt2229 = local35.anInt2229;
				local99.anInt2215 = local25;
				local35.aClass68Array1[local25] = local99;
				if (arg1) {
					aClass68_6 = local99;
				} else {
					aClass68_5 = local99;
				}
				Static78.method1460(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass68_6 : aClass68_5;
				if (local137.anInt2215 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static165.method2704(local137.anInt2229);
				local158.aClass68Array1[local137.anInt2215] = null;
				Static78.method1460(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static165.method2704(anIntArray298[--anInt3355]);
				local137.aClass68Array1 = null;
				Static78.method1460(local137);
				return;
			}
			if (arg0 == 200) {
				anInt3355 -= 2;
				local13 = anIntArray298[anInt3355];
				local19 = anIntArray298[anInt3355 + 1];
				local210 = Static259.method3899(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray298[anInt3355++] = 1;
					if (arg1) {
						aClass68_6 = local210;
						return;
					}
					aClass68_5 = local210;
					return;
				}
				anIntArray298[anInt3355++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray298[--anInt3355];
				local158 = Static165.method2704(local13);
				if (local158 != null) {
					anIntArray298[anInt3355++] = 1;
					if (arg1) {
						aClass68_6 = local158;
						return;
					}
					aClass68_5 = local158;
					return;
				}
				anIntArray298[anInt3355++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray298[--anInt3355];
				method2733(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray298[--anInt3355];
				method2732(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt3355 -= 2;
					local13 = anIntArray298[anInt3355];
					local19 = anIntArray298[anInt3355 + 1];
					for (local25 = 0; local25 < Static299.anIntArray433.length; local25++) {
						if (Static299.anIntArray433[local25] == local13) {
							Static375.aClass3_Sub2_Sub1_Sub2_7.aClass97_1.method2229(local25, local19, Static356.aClass259_2);
							return;
						}
					}
					for (local353 = 0; local353 < Static435.anIntArray605.length; local353++) {
						if (Static435.anIntArray605[local353] == local13) {
							Static375.aClass3_Sub2_Sub1_Sub2_7.aClass97_1.method2229(local353, local19, Static356.aClass259_2);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt3355 -= 2;
					local13 = anIntArray298[anInt3355];
					local19 = anIntArray298[anInt3355 + 1];
					Static375.aClass3_Sub2_Sub1_Sub2_7.aClass97_1.method2242(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray298[--anInt3355] != 0;
					Static375.aClass3_Sub2_Sub1_Sub2_7.aClass97_1.method2241(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static165.method2704(anIntArray298[--anInt3355]);
					} else {
						local137 = arg1 ? aClass68_6 : aClass68_5;
					}
					if (arg0 == 1100) {
						anInt3355 -= 2;
						local137.anInt2176 = anIntArray298[anInt3355];
						if (local137.anInt2176 > local137.anInt2179 - local137.anInt2188) {
							local137.anInt2176 = local137.anInt2179 - local137.anInt2188;
						}
						if (local137.anInt2176 < 0) {
							local137.anInt2176 = 0;
						}
						local137.anInt2172 = anIntArray298[anInt3355 + 1];
						if (local137.anInt2172 > local137.anInt2243 - local137.anInt2252) {
							local137.anInt2172 = local137.anInt2243 - local137.anInt2252;
						}
						if (local137.anInt2172 < 0) {
							local137.anInt2172 = 0;
						}
						Static78.method1460(local137);
						if (local137.anInt2215 == -1) {
							Static263.method3945(local137.anInt2229);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt2235 = anIntArray298[--anInt3355];
						Static78.method1460(local137);
						if (local137.anInt2215 == -1) {
							Static48.method798(local137.anInt2229);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean153 = anIntArray298[--anInt3355] == 1;
						Static78.method1460(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt2166 = anIntArray298[--anInt3355];
						Static78.method1460(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt2193 = anIntArray298[--anInt3355];
						Static78.method1460(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray298[--anInt3355];
						if (local137.anInt2187 != local19) {
							local137.anInt2187 = local19;
							Static78.method1460(local137);
						}
						if (local137.anInt2215 == -1) {
							Static129.method2208(local137.anInt2229);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt2183 = anIntArray298[--anInt3355];
						Static78.method1460(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean159 = anIntArray298[--anInt3355] == 1;
						Static78.method1460(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt2238 = 1;
						local137.anInt2203 = anIntArray298[--anInt3355];
						Static78.method1460(local137);
						if (local137.anInt2215 == -1) {
							Static132.method2246(local137.anInt2229);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt3355 -= 6;
						local137.anInt2192 = anIntArray298[anInt3355];
						local137.lb = anIntArray298[anInt3355 + 1];
						local137.anInt2228 = anIntArray298[anInt3355 + 2];
						local137.anInt2205 = anIntArray298[anInt3355 + 3];
						local137.anInt2254 = anIntArray298[anInt3355 + 4];
						local137.anInt2242 = anIntArray298[anInt3355 + 5];
						Static78.method1460(local137);
						if (local137.anInt2215 == -1) {
							Static94.method1794(local137.anInt2229);
							Static264.method3955(local137.anInt2229);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray298[--anInt3355];
						if (local137.anInt2222 != local19) {
							local137.anInt2222 = local19;
							local137.anInt2224 = 0;
							local137.anInt2231 = 1;
							local137.anInt2210 = 0;
							Static78.method1460(local137);
						}
						if (local137.anInt2215 == -1) {
							Static188.method2972(local137.anInt2229);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean154 = anIntArray298[--anInt3355] == 1;
						Static78.method1460(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray21[--anInt3354];
						if (!local1101.equals(local137.aString22)) {
							local137.aString22 = local1101;
							Static78.method1460(local137);
						}
						if (local137.anInt2215 == -1) {
							Static141.method2388(local137.anInt2229);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt2232 = anIntArray298[--anInt3355];
						Static78.method1460(local137);
						if (local137.anInt2215 == -1) {
							Static130.method2224(local137.anInt2229);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt3355 -= 3;
						local137.anInt2170 = anIntArray298[anInt3355];
						local137.anInt2223 = anIntArray298[anInt3355 + 1];
						local137.anInt2182 = anIntArray298[anInt3355 + 2];
						Static78.method1460(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean155 = anIntArray298[--anInt3355] == 1;
						Static78.method1460(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt2202 = anIntArray298[--anInt3355];
						Static78.method1460(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt2200 = anIntArray298[--anInt3355];
						Static78.method1460(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean145 = anIntArray298[--anInt3355] == 1;
						Static78.method1460(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean152 = anIntArray298[--anInt3355] == 1;
						Static78.method1460(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt3355 -= 2;
						local137.anInt2179 = anIntArray298[anInt3355];
						local137.anInt2243 = anIntArray298[anInt3355 + 1];
						Static78.method1460(local137);
						if (local137.anInt2249 == 0) {
							Static49.method804(local137, false);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt3355 -= 2;
						local137.anInt2248 = (short) anIntArray298[anInt3355];
						local137.anInt2251 = (short) anIntArray298[anInt3355 + 1];
						Static78.method1460(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean156 = anIntArray298[--anInt3355] == 1;
						Static78.method1460(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt2242 = anIntArray298[--anInt3355];
						Static78.method1460(local137);
						if (local137.anInt2215 == -1) {
							Static94.method1794(local137.anInt2229);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray298[--anInt3355];
						local137.aBoolean149 = local19 == 1;
						Static78.method1460(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt3355 -= 2;
						local137.anInt2216 = anIntArray298[anInt3355];
						local137.anInt2174 = anIntArray298[anInt3355 + 1];
						Static78.method1460(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt2246 = anIntArray298[--anInt3355];
						Static78.method1460(local137);
						return;
					}
					@Pc(1454) Class132 local1454;
					if (arg0 == 1127) {
						anInt3355 -= 2;
						local19 = anIntArray298[anInt3355];
						local25 = anIntArray298[anInt3355 + 1];
						local1454 = Static186.aClass161_1.method3729(local19);
						if (local25 != local1454.anInt3608) {
							local137.method1747(local25, local19);
							return;
						}
						local137.method1736(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray298[--anInt3355];
						local1488 = aStringArray21[--anInt3354];
						local1454 = Static186.aClass161_1.method3729(local19);
						if (!local1454.aString40.equals(local1488)) {
							local137.method1739(local19, local1488);
							return;
						}
						local137.method1736(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static165.method2704(anIntArray298[--anInt3355]);
						} else {
							local137 = arg1 ? aClass68_6 : aClass68_5;
						}
						if (arg0 == 1300) {
							local19 = anIntArray298[--anInt3355] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method1746(aStringArray21[--anInt3354], local19);
								return;
							}
							anInt3354--;
							return;
						}
						if (arg0 == 1301) {
							anInt3355 -= 2;
							local19 = anIntArray298[anInt3355];
							local25 = anIntArray298[anInt3355 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass68_3 = null;
								return;
							}
							local137.aClass68_3 = Static259.method3899(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray298[--anInt3355];
							if (local19 != Static46.anInt863 && local19 != Static307.anInt5427 && local19 != Static25.anInt591) {
								return;
							}
							local137.anInt2206 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt2191 = anIntArray298[--anInt3355];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt2218 = anIntArray298[--anInt3355];
							return;
						}
						if (arg0 == 1305) {
							local137.aString23 = aStringArray21[--anInt3354];
							return;
						}
						if (arg0 == 1306) {
							local137.aString26 = aStringArray21[--anInt3354];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray11 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt2196 = anIntArray298[--anInt3355];
							local137.anInt2201 = anIntArray298[--anInt3355];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray298[--anInt3355];
							local25 = anIntArray298[--anInt3355];
							if (local25 >= 1 && local25 <= 10) {
								local137.method1741(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString25 = aStringArray21[--anInt3354];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt2247 = anIntArray298[--anInt3355];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt3355 -= 3;
								local19 = anIntArray298[anInt3355] - 1;
								local25 = anIntArray298[anInt3355 + 1];
								local353 = anIntArray298[anInt3355 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt3355 -= 2;
								local19 = 10;
								local25 = anIntArray298[anInt3355];
								local353 = anIntArray298[anInt3355 + 1];
							}
							if (local137.aByteArray45 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray45 = new byte[11];
								local137.aByteArray46 = new byte[11];
								local137.anIntArray165 = new int[11];
							}
							local137.aByteArray45[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean158 = false;
								for (local2290 = 0; local2290 < local137.aByteArray45.length; local2290++) {
									if (local137.aByteArray45[local2290] != 0) {
										local137.aBoolean158 = true;
										break;
									}
								}
							} else {
								local137.aBoolean158 = true;
							}
							local137.aByteArray46[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt2219 = anIntArray298[--anInt3355];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static165.method2704(anIntArray298[--anInt3355]);
						} else {
							local137 = arg1 ? aClass68_6 : aClass68_5;
						}
						local1101 = aStringArray21[--anInt3354];
						@Pc(2369) int[] local2369 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray298[--anInt3355];
							if (local353 > 0) {
								local2369 = new int[local353];
								while (local353-- > 0) {
									local2369[local353] = anIntArray298[--anInt3355];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
						for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
							if (local1101.charAt(local2290 - 1) == 's') {
								local2421[local2290] = aStringArray21[--anInt3354];
							} else {
								local2421[local2290] = Integer.valueOf(anIntArray298[--anInt3355]);
							}
						}
						local56 = anIntArray298[--anInt3355];
						if (local56 == -1) {
							local2421 = null;
						} else {
							local2421[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray23 = local2421;
						} else if (arg0 == 1401) {
							local137.anObjectArray6 = local2421;
						} else if (arg0 == 1402) {
							local137.anObjectArray31 = local2421;
						} else if (arg0 == 1403) {
							local137.anObjectArray25 = local2421;
						} else if (arg0 == 1404) {
							local137.anObjectArray5 = local2421;
						} else if (arg0 == 1405) {
							local137.anObjectArray8 = local2421;
						} else if (arg0 == 1406) {
							local137.anObjectArray14 = local2421;
						} else if (arg0 == 1407) {
							local137.anObjectArray21 = local2421;
							local137.anIntArray166 = local2369;
						} else if (arg0 == 1408) {
							local137.anObjectArray3 = local2421;
						} else if (arg0 == 1409) {
							local137.anObjectArray15 = local2421;
						} else if (arg0 == 1410) {
							local137.anObjectArray9 = local2421;
						} else if (arg0 == 1411) {
							local137.anObjectArray27 = local2421;
						} else if (arg0 == 1412) {
							local137.anObjectArray18 = local2421;
						} else if (arg0 == 1414) {
							local137.anObjectArray29 = local2421;
							local137.anIntArray170 = local2369;
						} else if (arg0 == 1415) {
							local137.anObjectArray22 = local2421;
							local137.anIntArray167 = local2369;
						} else if (arg0 == 1416) {
							local137.anObjectArray4 = local2421;
						} else if (arg0 == 1417) {
							local137.anObjectArray17 = local2421;
						} else if (arg0 == 1418) {
							local137.anObjectArray12 = local2421;
						} else if (arg0 == 1419) {
							local137.anObjectArray7 = local2421;
						} else if (arg0 == 1420) {
							local137.anObjectArray30 = local2421;
						} else if (arg0 == 1421) {
							local137.anObjectArray24 = local2421;
						} else if (arg0 == 1422) {
							local137.anObjectArray28 = local2421;
						} else if (arg0 == 1423) {
							local137.anObjectArray33 = local2421;
						} else if (arg0 == 1424) {
							local137.anObjectArray26 = local2421;
						} else if (arg0 == 1425) {
							local137.anObjectArray32 = local2421;
						} else if (arg0 == 1426) {
							local137.anObjectArray13 = local2421;
						} else if (arg0 == 1427) {
							local137.anObjectArray16 = local2421;
						} else if (arg0 == 1428) {
							local137.anObjectArray20 = local2421;
							local137.anIntArray169 = local2369;
						} else if (arg0 == 1429) {
							local137.anObjectArray11 = local2421;
							local137.anIntArray168 = local2369;
						} else if (arg0 == 1430) {
							local137.anObjectArray19 = local2421;
						}
						local137.aBoolean144 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass68_6 : aClass68_5;
						if (arg0 == 1500) {
							anIntArray298[anInt3355++] = local137.anInt2244;
							return;
						}
						if (arg0 == 1501) {
							anIntArray298[anInt3355++] = local137.anInt2214;
							return;
						}
						if (arg0 == 1502) {
							anIntArray298[anInt3355++] = local137.anInt2188;
							return;
						}
						if (arg0 == 1503) {
							anIntArray298[anInt3355++] = local137.anInt2252;
							return;
						}
						if (arg0 == 1504) {
							anIntArray298[anInt3355++] = local137.aBoolean151 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray298[anInt3355++] = local137.anInt2221;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static71.method1332(local137);
							anIntArray298[anInt3355++] = local158 == null ? -1 : local158.anInt2229;
							return;
						}
					} else {
						@Pc(3017) Class132 local3017;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass68_6 : aClass68_5;
							if (arg0 == 1600) {
								anIntArray298[anInt3355++] = local137.anInt2176;
								return;
							}
							if (arg0 == 1601) {
								anIntArray298[anInt3355++] = local137.anInt2172;
								return;
							}
							if (arg0 == 1602) {
								aStringArray21[anInt3354++] = local137.aString22;
								return;
							}
							if (arg0 == 1603) {
								anIntArray298[anInt3355++] = local137.anInt2179;
								return;
							}
							if (arg0 == 1604) {
								anIntArray298[anInt3355++] = local137.anInt2243;
								return;
							}
							if (arg0 == 1605) {
								anIntArray298[anInt3355++] = local137.anInt2242;
								return;
							}
							if (arg0 == 1606) {
								anIntArray298[anInt3355++] = local137.anInt2228;
								return;
							}
							if (arg0 == 1607) {
								anIntArray298[anInt3355++] = local137.anInt2254;
								return;
							}
							if (arg0 == 1608) {
								anIntArray298[anInt3355++] = local137.anInt2205;
								return;
							}
							if (arg0 == 1609) {
								anIntArray298[anInt3355++] = local137.anInt2166;
								return;
							}
							if (arg0 == 1610) {
								anIntArray298[anInt3355++] = local137.anInt2192;
								return;
							}
							if (arg0 == 1611) {
								anIntArray298[anInt3355++] = local137.lb;
								return;
							}
							if (arg0 == 1612) {
								anIntArray298[anInt3355++] = local137.anInt2187;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray298[--anInt3355];
								local3017 = Static186.aClass161_1.method3729(local19);
								if (local3017.method2959()) {
									aStringArray21[anInt3354++] = local137.method1749(local3017.aString40, local19);
								} else {
									anIntArray298[anInt3355++] = local137.method1735(local19, local3017.anInt3608);
								}
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass68_6 : aClass68_5;
							if (arg0 == 1700) {
								anIntArray298[anInt3355++] = local137.anInt2208;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt2208 != -1) {
									anIntArray298[anInt3355++] = local137.anInt2220;
									return;
								}
								anIntArray298[anInt3355++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray298[anInt3355++] = local137.anInt2215;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass68_6 : aClass68_5;
							if (arg0 == 1800) {
								anIntArray298[anInt3355++] = Static47.method787(local137).method5400();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray298[--anInt3355];
								local19--;
								if (local137.aStringArray11 != null && local19 < local137.aStringArray11.length && local137.aStringArray11[local19] != null) {
									aStringArray21[anInt3354++] = local137.aStringArray11[local19];
									return;
								}
								aStringArray21[anInt3354++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString23 == null) {
									aStringArray21[anInt3354++] = "";
									return;
								}
								aStringArray21[anInt3354++] = local137.aString23;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static165.method2704(anIntArray298[--anInt3355]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass68_6 : aClass68_5;
							}
							if (anInt3359 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray16 == null) {
									return;
								}
								@Pc(3254) Class2_Sub30 local3254 = new Class2_Sub30();
								local3254.aClass68_12 = local137;
								local3254.anObjectArray35 = local137.anObjectArray16;
								local3254.anInt5101 = anInt3359 + 1;
								Static293.aClass14_39.method300(local3254);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static165.method2704(anIntArray298[--anInt3355]);
							if (arg0 == 2500) {
								anIntArray298[anInt3355++] = local137.anInt2244;
								return;
							}
							if (arg0 == 2501) {
								anIntArray298[anInt3355++] = local137.anInt2214;
								return;
							}
							if (arg0 == 2502) {
								anIntArray298[anInt3355++] = local137.anInt2188;
								return;
							}
							if (arg0 == 2503) {
								anIntArray298[anInt3355++] = local137.anInt2252;
								return;
							}
							if (arg0 == 2504) {
								anIntArray298[anInt3355++] = local137.aBoolean151 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray298[anInt3355++] = local137.anInt2221;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static71.method1332(local137);
								anIntArray298[anInt3355++] = local158 == null ? -1 : local158.anInt2229;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static165.method2704(anIntArray298[--anInt3355]);
							if (arg0 == 2600) {
								anIntArray298[anInt3355++] = local137.anInt2176;
								return;
							}
							if (arg0 == 2601) {
								anIntArray298[anInt3355++] = local137.anInt2172;
								return;
							}
							if (arg0 == 2602) {
								aStringArray21[anInt3354++] = local137.aString22;
								return;
							}
							if (arg0 == 2603) {
								anIntArray298[anInt3355++] = local137.anInt2179;
								return;
							}
							if (arg0 == 2604) {
								anIntArray298[anInt3355++] = local137.anInt2243;
								return;
							}
							if (arg0 == 2605) {
								anIntArray298[anInt3355++] = local137.anInt2242;
								return;
							}
							if (arg0 == 2606) {
								anIntArray298[anInt3355++] = local137.anInt2228;
								return;
							}
							if (arg0 == 2607) {
								anIntArray298[anInt3355++] = local137.anInt2254;
								return;
							}
							if (arg0 == 2608) {
								anIntArray298[anInt3355++] = local137.anInt2205;
								return;
							}
							if (arg0 == 2609) {
								anIntArray298[anInt3355++] = local137.anInt2166;
								return;
							}
							if (arg0 == 2610) {
								anIntArray298[anInt3355++] = local137.anInt2192;
								return;
							}
							if (arg0 == 2611) {
								anIntArray298[anInt3355++] = local137.lb;
								return;
							}
							if (arg0 == 2612) {
								anIntArray298[anInt3355++] = local137.anInt2187;
								return;
							}
						} else {
							@Pc(3751) Class2_Sub35 local3751;
							@Pc(3649) Class2_Sub35 local3649;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static165.method2704(anIntArray298[--anInt3355]);
									anIntArray298[anInt3355++] = local137.anInt2208;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static165.method2704(anIntArray298[--anInt3355]);
									if (local137.anInt2208 != -1) {
										anIntArray298[anInt3355++] = local137.anInt2220;
										return;
									}
									anIntArray298[anInt3355++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray298[--anInt3355];
									local3649 = (Class2_Sub35) Static113.aClass163_11.method3769((long) local13);
									if (local3649 != null) {
										anIntArray298[anInt3355++] = 1;
										return;
									}
									anIntArray298[anInt3355++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static165.method2704(anIntArray298[--anInt3355]);
									if (local137.aClass68Array1 == null) {
										anIntArray298[anInt3355++] = 0;
										return;
									}
									local19 = local137.aClass68Array1.length;
									for (local25 = 0; local25 < local137.aClass68Array1.length; local25++) {
										if (local137.aClass68Array1[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray298[anInt3355++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt3355 -= 2;
									local13 = anIntArray298[anInt3355];
									local19 = anIntArray298[anInt3355 + 1];
									local3751 = (Class2_Sub35) Static113.aClass163_11.method3769((long) local13);
									if (local3751 != null && local3751.anInt5537 == local19) {
										anIntArray298[anInt3355++] = 1;
										return;
									}
									anIntArray298[anInt3355++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static165.method2704(anIntArray298[--anInt3355]);
								if (arg0 == 2800) {
									anIntArray298[anInt3355++] = Static47.method787(local137).method5400();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray298[--anInt3355];
									local19--;
									if (local137.aStringArray11 != null && local19 < local137.aStringArray11.length && local137.aStringArray11[local19] != null) {
										aStringArray21[anInt3354++] = local137.aStringArray11[local19];
										return;
									}
									aStringArray21[anInt3354++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString23 == null) {
										aStringArray21[anInt3354++] = "";
										return;
									}
									aStringArray21[anInt3354++] = local137.aString23;
									return;
								}
							} else {
								@Pc(3888) String local3888;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3888 = aStringArray21[--anInt3354];
										Static321.method4516(local3888);
										return;
									}
									if (arg0 == 3101) {
										anInt3355 -= 2;
										Static47.method795(Static375.aClass3_Sub2_Sub1_Sub2_7, anIntArray298[anInt3355 + 1], anIntArray298[anInt3355]);
										return;
									}
									if (arg0 == 3103) {
										Static380.method5086();
										return;
									}
									if (arg0 == 3104) {
										local3888 = aStringArray21[--anInt3354];
										local19 = 0;
										if (Static24.method4076(local3888)) {
											local19 = Static418.method5543(local3888);
										}
										Static159.method2586(Static3.aClass54_4);
										Static424.aClass2_Sub23_Sub2_1.method5506(local19);
										return;
									}
									if (arg0 == 3105) {
										local3888 = aStringArray21[--anInt3354];
										Static159.method2586(Static438.aClass54_106);
										Static424.aClass2_Sub23_Sub2_1.method5449(local3888.length() + 1);
										Static424.aClass2_Sub23_Sub2_1.method5496(local3888);
										return;
									}
									if (arg0 == 3106) {
										local3888 = aStringArray21[--anInt3354];
										Static159.method2586(Static132.aClass54_43);
										Static424.aClass2_Sub23_Sub2_1.method5449(local3888.length() + 1);
										Static424.aClass2_Sub23_Sub2_1.method5496(local3888);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray298[--anInt3355];
										local1101 = aStringArray21[--anInt3354];
										Static37.method611(local13, local1101);
										return;
									}
									if (arg0 == 3108) {
										anInt3355 -= 3;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										local25 = anIntArray298[anInt3355 + 2];
										local35 = Static165.method2704(local25);
										Static5.method155(local13, local35, local19);
										return;
									}
									if (arg0 == 3109) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										local210 = arg1 ? aClass68_6 : aClass68_5;
										Static5.method155(local13, local210, local19);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray298[--anInt3355];
										Static159.method2586(Static322.aClass54_79);
										Static424.aClass2_Sub23_Sub2_1.method5502(local13);
										return;
									}
									if (arg0 == 3111) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										local3751 = (Class2_Sub35) Static113.aClass163_11.method3769((long) local13);
										if (local3751 != null) {
											Static313.method4400(local3751, local3751.anInt5537 != local19, true);
										}
										Static144.method2415(3, true, local19, local13);
										return;
									}
									if (arg0 == 3112) {
										anInt3355--;
										local13 = anIntArray298[anInt3355];
										local3649 = (Class2_Sub35) Static113.aClass163_11.method3769((long) local13);
										if (local3649 != null && local3649.anInt5541 == 3) {
											Static313.method4400(local3649, true, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static286.method4127(aStringArray21[--anInt3354]);
										return;
									}
									if (arg0 == 3114) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										local1488 = aStringArray21[--anInt3354];
										Static334.method4660(local13, local19, "", "", local1488);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt3355 -= 3;
										Static346.method4765(anIntArray298[anInt3355], anIntArray298[anInt3355 + 1], anIntArray298[anInt3355 + 2], 255);
										return;
									}
									if (arg0 == 3201) {
										Static419.method5563(50, 255, anIntArray298[--anInt3355]);
										return;
									}
									if (arg0 == 3202) {
										anInt3355 -= 2;
										Static284.method4120(anIntArray298[anInt3355 + 1], 255, anIntArray298[anInt3355]);
										return;
									}
									if (arg0 == 3203) {
										anInt3355 -= 4;
										Static346.method4765(anIntArray298[anInt3355], anIntArray298[anInt3355 + 1], anIntArray298[anInt3355 + 2], anIntArray298[anInt3355 + 3]);
										return;
									}
									if (arg0 == 3204) {
										anInt3355 -= 3;
										Static419.method5563(anIntArray298[anInt3355 + 2], anIntArray298[anInt3355 + 1], anIntArray298[anInt3355]);
										return;
									}
									if (arg0 == 3205) {
										anInt3355 -= 3;
										Static284.method4120(anIntArray298[anInt3355 + 1], anIntArray298[anInt3355 + 2], anIntArray298[anInt3355]);
										return;
									}
									if (arg0 == 3206) {
										anInt3355 -= 4;
										Static30.method535(anIntArray298[anInt3355 + 2], anIntArray298[anInt3355], anIntArray298[anInt3355 + 3], anIntArray298[anInt3355 + 1]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray298[anInt3355++] = Static131.anInt2821;
										return;
									}
									if (arg0 == 3301) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = Static139.method2378(local19, false, local13);
										return;
									}
									if (arg0 == 3302) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = Static131.method2236(local19, false, local13);
										return;
									}
									if (arg0 == 3303) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = Static10.method227(local19, local13, false);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = Static378.aClass172_1.method3944(local13).anInt5811;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = Static196.anIntArray335[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = Static272.anIntArray411[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = Static48.anIntArray73[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4605) byte local4605 = Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89;
										local19 = (Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119 >> 7) + Static48.anInt962;
										local25 = (Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121 >> 7) + Static324.anInt5624;
										anIntArray298[anInt3355++] = (local4605 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray298[anInt3355++] = Static333.aBoolean406 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = Static139.method2378(local19, true, local13);
										return;
									}
									if (arg0 == 3314) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = Static131.method2236(local19, true, local13);
										return;
									}
									if (arg0 == 3315) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = Static10.method227(local19, local13, true);
										return;
									}
									if (arg0 == 3316) {
										if (Static193.anInt3710 >= 2) {
											anIntArray298[anInt3355++] = Static193.anInt3710;
											return;
										}
										anIntArray298[anInt3355++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray298[anInt3355++] = Static38.anInt6363;
										return;
									}
									if (arg0 == 3318) {
										anIntArray298[anInt3355++] = Static375.anInt5832;
										return;
									}
									if (arg0 == 3321) {
										anIntArray298[anInt3355++] = Static255.anInt4791;
										return;
									}
									if (arg0 == 3322) {
										anIntArray298[anInt3355++] = Static69.anInt1561;
										return;
									}
									if (arg0 == 3323) {
										if (Static411.anInt6852 >= 5 && Static411.anInt6852 <= 9) {
											anIntArray298[anInt3355++] = 1;
											return;
										}
										anIntArray298[anInt3355++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static411.anInt6852 >= 5 && Static411.anInt6852 <= 9) {
											anIntArray298[anInt3355++] = Static411.anInt6852;
											return;
										}
										anIntArray298[anInt3355++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray298[anInt3355++] = Static192.aBoolean280 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray298[anInt3355++] = Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6217;
										return;
									}
									if (arg0 == 3327) {
										anIntArray298[anInt3355++] = Static375.aClass3_Sub2_Sub1_Sub2_7.aClass97_1.aBoolean219 ? 1 : 0;
										return;
									}
									if (arg0 == 3328) {
										anIntArray298[anInt3355++] = Static340.aBoolean411 && !Static62.aBoolean83 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray298[anInt3355++] = Static223.aBoolean314 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = Static445.method5719(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = Static231.method3605(false, local19, local13);
										return;
									}
									if (arg0 == 3332) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = Static231.method3605(true, local19, local13);
										return;
									}
									if (arg0 == 3333) {
										anIntArray298[anInt3355++] = Static40.anInt755;
										return;
									}
									if (arg0 == 3335) {
										anIntArray298[anInt3355++] = Static388.anInt6533;
										return;
									}
									if (arg0 == 3336) {
										anInt3355 -= 4;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										local25 = anIntArray298[anInt3355 + 2];
										local353 = anIntArray298[anInt3355 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray298[anInt3355++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray298[anInt3355++] = Static352.anInt5971;
										return;
									}
									if (arg0 == 3338) {
										anIntArray298[anInt3355++] = Static81.method1475();
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5230) Class255 local5230;
									if (arg0 == 3400) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										local5230 = Static390.aClass125_1.method2841(local13);
										aStringArray21[anInt3354++] = local5230.method5653(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt3355 -= 4;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										local25 = anIntArray298[anInt3355 + 2];
										local353 = anIntArray298[anInt3355 + 3];
										@Pc(5276) Class255 local5276 = Static390.aClass125_1.method2841(local25);
										if (local5276.aChar4 == local13 && local5276.aChar5 == local19) {
											if (local19 == 115) {
												aStringArray21[anInt3354++] = local5276.method5653(local353);
												return;
											}
											anIntArray298[anInt3355++] = local5276.method5648(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt3355 -= 3;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										local25 = anIntArray298[anInt3355 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5352) Class255 local5352 = Static390.aClass125_1.method2841(local19);
										if (local5352.aChar5 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray298[anInt3355++] = local5352.method5650(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray298[--anInt3355];
										local1101 = aStringArray21[--anInt3354];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5230 = Static390.aClass125_1.method2841(local13);
										if (local5230.aChar5 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray298[anInt3355++] = local5230.method5652(local1101) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray298[--anInt3355];
										@Pc(5450) Class255 local5450 = Static390.aClass125_1.method2841(local13);
										anIntArray298[anInt3355++] = local5450.aClass163_40.method3763();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static162.anInt3249 == 0) {
											anIntArray298[anInt3355++] = -2;
											return;
										}
										if (Static162.anInt3249 == 1) {
											anIntArray298[anInt3355++] = -1;
											return;
										}
										anIntArray298[anInt3355++] = Static46.anInt861;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray298[--anInt3355];
										if (Static162.anInt3249 == 2 && local13 < Static46.anInt861) {
											aStringArray21[anInt3354++] = Static284.aStringArray35[local13];
											if (Static297.aStringArray36[local13] != null) {
												aStringArray21[anInt3354++] = Static297.aStringArray36[local13];
												return;
											}
											aStringArray21[anInt3354++] = "";
											return;
										}
										aStringArray21[anInt3354++] = "";
										aStringArray21[anInt3354++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray298[--anInt3355];
										if (Static162.anInt3249 == 2 && local13 < Static46.anInt861) {
											anIntArray298[anInt3355++] = Static376.anIntArray544[local13];
											return;
										}
										anIntArray298[anInt3355++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray298[--anInt3355];
										if (Static162.anInt3249 == 2 && local13 < Static46.anInt861) {
											anIntArray298[anInt3355++] = Static362.anIntArray526[local13];
											return;
										}
										anIntArray298[anInt3355++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3888 = aStringArray21[--anInt3354];
										local19 = anIntArray298[--anInt3355];
										Static13.method293(local19, local3888);
										return;
									}
									if (arg0 == 3605) {
										local3888 = aStringArray21[--anInt3354];
										Static184.method2947(local3888);
										return;
									}
									if (arg0 == 3606) {
										local3888 = aStringArray21[--anInt3354];
										Static269.method4016(local3888);
										return;
									}
									if (arg0 == 3607) {
										local3888 = aStringArray21[--anInt3354];
										Static64.method1244(local3888, false);
										return;
									}
									if (arg0 == 3608) {
										local3888 = aStringArray21[--anInt3354];
										Static287.method4142(local3888);
										return;
									}
									if (arg0 == 3609) {
										local3888 = aStringArray21[--anInt3354];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray298[anInt3355++] = Static43.method1875(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray298[--anInt3355];
										if (Static162.anInt3249 == 2 && local13 < Static46.anInt861) {
											aStringArray21[anInt3354++] = Static200.aStringArray37[local13];
											return;
										}
										aStringArray21[anInt3354++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static170.aString39 != null) {
											aStringArray21[anInt3354++] = Static329.method4563(Static170.aString39);
											return;
										}
										aStringArray21[anInt3354++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static170.aString39 != null) {
											anIntArray298[anInt3355++] = Static107.anInt2532;
											return;
										}
										anIntArray298[anInt3355++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray298[--anInt3355];
										if (Static170.aString39 != null && local13 < Static107.anInt2532) {
											aStringArray21[anInt3354++] = Static93.aClass81Array1[local13].aString32;
											return;
										}
										aStringArray21[anInt3354++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray298[--anInt3355];
										if (Static170.aString39 != null && local13 < Static107.anInt2532) {
											anIntArray298[anInt3355++] = Static93.aClass81Array1[local13].anInt2582;
											return;
										}
										anIntArray298[anInt3355++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray298[--anInt3355];
										if (Static170.aString39 != null && local13 < Static107.anInt2532) {
											anIntArray298[anInt3355++] = Static93.aClass81Array1[local13].aByte37;
											return;
										}
										anIntArray298[anInt3355++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray298[anInt3355++] = Static16.aByte6;
										return;
									}
									if (arg0 == 3617) {
										local3888 = aStringArray21[--anInt3354];
										Static26.method508(local3888);
										return;
									}
									if (arg0 == 3618) {
										anIntArray298[anInt3355++] = Static282.aByte78;
										return;
									}
									if (arg0 == 3619) {
										local3888 = aStringArray21[--anInt3354];
										Static290.method4178(local3888);
										return;
									}
									if (arg0 == 3620) {
										Static396.method5222();
										return;
									}
									if (arg0 == 3621) {
										if (Static162.anInt3249 == 0) {
											anIntArray298[anInt3355++] = -1;
											return;
										}
										anIntArray298[anInt3355++] = Static393.anInt6567;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray298[--anInt3355];
										if (Static162.anInt3249 != 0 && local13 < Static393.anInt6567) {
											aStringArray21[anInt3354++] = Static367.aStringArray45[local13];
											if (Static160.aStringArray31[local13] != null) {
												aStringArray21[anInt3354++] = Static160.aStringArray31[local13];
												return;
											}
											aStringArray21[anInt3354++] = "";
											return;
										}
										aStringArray21[anInt3354++] = "";
										aStringArray21[anInt3354++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3888 = aStringArray21[--anInt3354];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray298[anInt3355++] = Static309.method4371(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray298[--anInt3355];
										if (Static93.aClass81Array1 != null && local13 < Static107.anInt2532 && Static93.aClass81Array1[local13].aString31.equalsIgnoreCase(Static375.aClass3_Sub2_Sub1_Sub2_7.aString56)) {
											anIntArray298[anInt3355++] = 1;
											return;
										}
										anIntArray298[anInt3355++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static139.aString36 != null) {
											aStringArray21[anInt3354++] = Static139.aString36;
											return;
										}
										aStringArray21[anInt3354++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray298[--anInt3355];
										if (Static170.aString39 != null && local13 < Static107.anInt2532) {
											aStringArray21[anInt3354++] = Static93.aClass81Array1[local13].aString30;
											return;
										}
										aStringArray21[anInt3354++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray298[--anInt3355];
										if (Static162.anInt3249 == 2 && local13 >= 0 && local13 < Static46.anInt861) {
											anIntArray298[anInt3355++] = Static275.aBooleanArray20[local13] ? 1 : 0;
											return;
										}
										anIntArray298[anInt3355++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3888 = aStringArray21[--anInt3354];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray298[anInt3355++] = Static427.method5621(local3888);
										return;
									}
									if (arg0 == 3629) {
										anIntArray298[anInt3355++] = Static359.anInt6109;
										return;
									}
									if (arg0 == 3630) {
										local3888 = aStringArray21[--anInt3354];
										Static64.method1244(local3888, true);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = Static102.aBooleanArray11[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray298[--anInt3355];
										if (Static170.aString39 != null && local13 < Static107.anInt2532) {
											aStringArray21[anInt3354++] = Static93.aClass81Array1[local13].aString31;
											return;
										}
										aStringArray21[anInt3354++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray298[--anInt3355];
										if (Static162.anInt3249 != 0 && local13 < Static393.anInt6567) {
											aStringArray21[anInt3354++] = Static227.aStringArray32[local13];
											return;
										}
										aStringArray21[anInt3354++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = Static173.aClass92Array1[local13].method2165();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = Static173.aClass92Array1[local13].anInt2727;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = Static173.aClass92Array1[local13].anInt2732;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = Static173.aClass92Array1[local13].anInt2733;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = Static173.aClass92Array1[local13].anInt2729;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = Static173.aClass92Array1[local13].anInt2731;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray298[--anInt3355];
										local19 = Static173.aClass92Array1[local13].method2167();
										anIntArray298[anInt3355++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray298[--anInt3355];
										local19 = Static173.aClass92Array1[local13].method2167();
										anIntArray298[anInt3355++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray298[--anInt3355];
										local19 = Static173.aClass92Array1[local13].method2167();
										anIntArray298[anInt3355++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray298[--anInt3355];
										local19 = Static173.aClass92Array1[local13].method2167();
										anIntArray298[anInt3355++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt3355 -= 5;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										local25 = anIntArray298[anInt3355 + 2];
										local353 = anIntArray298[anInt3355 + 3];
										local2290 = anIntArray298[anInt3355 + 4];
										anIntArray298[anInt3355++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
										return;
									}
									@Pc(6960) long local6960;
									@Pc(6953) long local6953;
									if (arg0 == 4007) {
										anInt3355 -= 2;
										local6953 = anIntArray298[anInt3355];
										local6960 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = (int) (local6953 + local6953 * local6960 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										if (local13 == 0) {
											anIntArray298[anInt3355++] = 0;
											return;
										}
										anIntArray298[anInt3355++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										if (local13 == 0) {
											anIntArray298[anInt3355++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray298[anInt3355++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray298[anInt3355++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt3355 -= 3;
										local6953 = anIntArray298[anInt3355];
										local6960 = anIntArray298[anInt3355 + 1];
										@Pc(7341) long local7341 = (long) anIntArray298[anInt3355 + 2];
										anIntArray298[anInt3355++] = (int) (local6953 * local7341 / local6960);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3888 = aStringArray21[--anInt3354];
										local19 = anIntArray298[--anInt3355];
										aStringArray21[anInt3354++] = local3888 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt3354 -= 2;
										local3888 = aStringArray21[anInt3354];
										local1101 = aStringArray21[anInt3354 + 1];
										aStringArray21[anInt3354++] = local3888 + local1101;
										return;
									}
									if (arg0 == 4102) {
										local3888 = aStringArray21[--anInt3354];
										local19 = anIntArray298[--anInt3355];
										aStringArray21[anInt3354++] = local3888 + Static18.method5791(local19);
										return;
									}
									if (arg0 == 4103) {
										local3888 = aStringArray21[--anInt3354];
										aStringArray21[anInt3354++] = local3888.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray21[anInt3354++] = method2729(anIntArray298[--anInt3355]);
										return;
									}
									if (arg0 == 4105) {
										anInt3354 -= 2;
										local3888 = aStringArray21[anInt3354];
										local1101 = aStringArray21[anInt3354 + 1];
										if (Static375.aClass3_Sub2_Sub1_Sub2_7.aClass97_1 != null && Static375.aClass3_Sub2_Sub1_Sub2_7.aClass97_1.aBoolean219) {
											aStringArray21[anInt3354++] = local1101;
											return;
										}
										aStringArray21[anInt3354++] = local3888;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray298[--anInt3355];
										aStringArray21[anInt3354++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt3354 -= 2;
										anIntArray298[anInt3355++] = Static204.method2768(aStringArray21[anInt3354], Static388.anInt6533, aStringArray21[anInt3354 + 1]);
										return;
									}
									@Pc(7624) Class58 local7624;
									if (arg0 == 4108) {
										local3888 = aStringArray21[--anInt3354];
										anInt3355 -= 2;
										local19 = anIntArray298[anInt3355];
										local25 = anIntArray298[anInt3355 + 1];
										local7624 = Static334.method4661(Static410.aClass160_77, local25);
										anIntArray298[anInt3355++] = local7624.method1343(local19, Static279.aClass17Array12, local3888);
										return;
									}
									if (arg0 == 4109) {
										local3888 = aStringArray21[--anInt3354];
										anInt3355 -= 2;
										local19 = anIntArray298[anInt3355];
										local25 = anIntArray298[anInt3355 + 1];
										local7624 = Static334.method4661(Static410.aClass160_77, local25);
										anIntArray298[anInt3355++] = local7624.method1338(local19, Static279.aClass17Array12, local3888);
										return;
									}
									if (arg0 == 4110) {
										anInt3354 -= 2;
										local3888 = aStringArray21[anInt3354];
										local1101 = aStringArray21[anInt3354 + 1];
										if (anIntArray298[--anInt3355] == 1) {
											aStringArray21[anInt3354++] = local3888;
											return;
										}
										aStringArray21[anInt3354++] = local1101;
										return;
									}
									if (arg0 == 4111) {
										local3888 = aStringArray21[--anInt3354];
										aStringArray21[anInt3354++] = Static331.method4592(local3888);
										return;
									}
									if (arg0 == 4112) {
										local3888 = aStringArray21[--anInt3354];
										local19 = anIntArray298[--anInt3355];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray21[anInt3354++] = local3888 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = Static155.method2548((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = Static22.method465((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = Static148.method2445((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = Static421.method5582((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3888 = aStringArray21[--anInt3354];
										if (local3888 != null) {
											anIntArray298[anInt3355++] = local3888.length();
											return;
										}
										anIntArray298[anInt3355++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3888 = aStringArray21[--anInt3354];
										anInt3355 -= 2;
										local19 = anIntArray298[anInt3355];
										local25 = anIntArray298[anInt3355 + 1];
										aStringArray21[anInt3354++] = local3888.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3888 = aStringArray21[--anInt3354];
										@Pc(7987) StringBuffer local7987 = new StringBuffer(local3888.length());
										@Pc(7989) boolean local7989 = false;
										for (local353 = 0; local353 < local3888.length(); local353++) {
											@Pc(7996) char local7996 = local3888.charAt(local353);
											if (local7996 == '<') {
												local7989 = true;
											} else if (local7996 == '>') {
												local7989 = false;
											} else if (!local7989) {
												local7987.append(local7996);
											}
										}
										aStringArray21[anInt3354++] = local7987.toString();
										return;
									}
									if (arg0 == 4120) {
										local3888 = aStringArray21[--anInt3354];
										anInt3355 -= 2;
										local19 = anIntArray298[anInt3355];
										local25 = anIntArray298[anInt3355 + 1];
										anIntArray298[anInt3355++] = local3888.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt3354 -= 2;
										local3888 = aStringArray21[anInt3354];
										local1101 = aStringArray21[anInt3354 + 1];
										local25 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = local3888.indexOf(local1101, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray298[--anInt3355] != 0;
										local19 = anIntArray298[--anInt3355];
										aStringArray21[anInt3354++] = Static287.method4145(Static388.anInt6533, local412, (long) local19, 0);
										return;
									}
									if (arg0 == 4125) {
										local3888 = aStringArray21[--anInt3354];
										local19 = anIntArray298[--anInt3355];
										@Pc(8210) Class58 local8210 = Static334.method4661(Static410.aClass160_77, local19);
										anIntArray298[anInt3355++] = local8210.method1349(local3888, Static279.aClass17Array12);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray298[--anInt3355];
										aStringArray21[anInt3354++] = Static318.aClass144_6.method3265(local13).aString6;
										return;
									}
									@Pc(8272) Class45 local8272;
									if (arg0 == 4201) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										local8272 = Static318.aClass144_6.method3265(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray4[local19 - 1] != null) {
											aStringArray21[anInt3354++] = local8272.aStringArray4[local19 - 1];
											return;
										}
										aStringArray21[anInt3354++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										local8272 = Static318.aClass144_6.method3265(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray3[local19 - 1] != null) {
											aStringArray21[anInt3354++] = local8272.aStringArray3[local19 - 1];
											return;
										}
										aStringArray21[anInt3354++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = Static318.aClass144_6.method3265(local13).anInt1099;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = Static318.aClass144_6.method3265(local13).anInt1107 == 1 ? 1 : 0;
										return;
									}
									@Pc(8435) Class45 local8435;
									if (arg0 == 4205) {
										local13 = anIntArray298[--anInt3355];
										local8435 = Static318.aClass144_6.method3265(local13);
										if (local8435.anInt1124 == -1 && local8435.anInt1087 >= 0) {
											anIntArray298[anInt3355++] = local8435.anInt1087;
											return;
										}
										anIntArray298[anInt3355++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray298[--anInt3355];
										local8435 = Static318.aClass144_6.method3265(local13);
										if (local8435.anInt1124 >= 0 && local8435.anInt1087 >= 0) {
											anIntArray298[anInt3355++] = local8435.anInt1087;
											return;
										}
										anIntArray298[anInt3355++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray298[--anInt3355];
										anIntArray298[anInt3355++] = Static318.aClass144_6.method3265(local13).aBoolean61 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										local3017 = Static186.aClass161_1.method3729(local19);
										if (local3017.method2959()) {
											aStringArray21[anInt3354++] = Static318.aClass144_6.method3265(local13).method870(local19, local3017.aString40);
											return;
										}
										anIntArray298[anInt3355++] = Static318.aClass144_6.method3265(local13).method873(local19, local3017.anInt3608);
										return;
									}
									if (arg0 == 4209) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1] - 1;
										local8272 = Static318.aClass144_6.method3265(local13);
										if (local8272.anInt1126 == local19) {
											anIntArray298[anInt3355++] = local8272.anInt1082;
											return;
										}
										if (local8272.anInt1121 == local19) {
											anIntArray298[anInt3355++] = local8272.anInt1103;
											return;
										}
										anIntArray298[anInt3355++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3888 = aStringArray21[--anInt3354];
										local19 = anIntArray298[--anInt3355];
										Static139.method2375(local3888, local19 == 1);
										anIntArray298[anInt3355++] = Static259.anInt4836;
										return;
									}
									if (arg0 == 4211) {
										if (Static101.aShortArray24 != null && Static414.anInt6897 < Static259.anInt4836) {
											anIntArray298[anInt3355++] = Static101.aShortArray24[Static414.anInt6897++] & 0xFFFF;
											return;
										}
										anIntArray298[anInt3355++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static414.anInt6897 = 0;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										local3017 = Static186.aClass161_1.method3729(local19);
										if (local3017.method2959()) {
											aStringArray21[anInt3354++] = Static219.aClass76_2.method1888(local13).method1709(local19, local3017.aString40);
											return;
										}
										anIntArray298[anInt3355++] = Static219.aClass76_2.method1888(local13).method1702(local19, local3017.anInt3608);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										local3017 = Static186.aClass161_1.method3729(local19);
										if (local3017.method2959()) {
											aStringArray21[anInt3354++] = Static118.aClass165_2.method3799(local13).method2971(local19, local3017.aString40);
											return;
										}
										anIntArray298[anInt3355++] = Static118.aClass165_2.method3799(local13).method2980(local3017.anInt3608, local19);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt3355 -= 2;
										local13 = anIntArray298[anInt3355];
										local19 = anIntArray298[anInt3355 + 1];
										local3017 = Static186.aClass161_1.method3729(local19);
										if (local3017.method2959()) {
											aStringArray21[anInt3354++] = Static40.aClass84_1.method2057(local13).method5014(local19, local3017.aString40);
											return;
										}
										anIntArray298[anInt3355++] = Static40.aClass84_1.method2057(local13).method5013(local19, local3017.anInt3608);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray298[--anInt3355];
									@Pc(8936) Class156 local8936 = Static262.aClass51_3.method1144(local13);
									if (local8936.anIntArray375 != null && local8936.anIntArray375.length > 0) {
										local25 = 0;
										local353 = local8936.anIntArray373[0];
										for (local2290 = 1; local2290 < local8936.anIntArray375.length; local2290++) {
											if (local8936.anIntArray373[local2290] > local353) {
												local25 = local2290;
												local353 = local8936.anIntArray373[local2290];
											}
										}
										anIntArray298[anInt3355++] = local8936.anIntArray375[local25];
										return;
									}
									anIntArray298[anInt3355++] = local8936.anInt4450;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static165.method2704(anIntArray298[--anInt3355]);
					} else {
						local137 = arg1 ? aClass68_6 : aClass68_5;
					}
					Static78.method1460(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt3355 -= 2;
						local19 = anIntArray298[anInt3355];
						local25 = anIntArray298[anInt3355 + 1];
						if (local137.anInt2215 == -1) {
							Static165.method2700(local137.anInt2229);
							Static94.method1794(local137.anInt2229);
							Static264.method3955(local137.anInt2229);
						}
						if (local19 == -1) {
							local137.anInt2238 = 1;
							local137.anInt2203 = -1;
							local137.anInt2208 = -1;
							return;
						}
						local137.anInt2208 = local19;
						local137.anInt2220 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean150 = true;
						} else {
							local137.aBoolean150 = false;
						}
						@Pc(1630) Class45 local1630 = Static318.aClass144_6.method3265(local19);
						local137.anInt2228 = local1630.anInt1113;
						local137.anInt2205 = local1630.anInt1135;
						local137.anInt2254 = local1630.anInt1104;
						local137.anInt2192 = local1630.anInt1097;
						local137.lb = local1630.anInt1137;
						local137.anInt2242 = local1630.anInt1098;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt2253 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt2253 = 1;
						} else {
							local137.anInt2253 = 2;
						}
						if (local137.anInt2207 > 0) {
							local137.anInt2242 = local137.anInt2242 * 32 / local137.anInt2207;
							return;
						}
						if (local137.anInt2171 > 0) {
							local137.anInt2242 = local137.anInt2242 * 32 / local137.anInt2171;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt2238 = 2;
						local137.anInt2203 = anIntArray298[--anInt3355];
						if (local137.anInt2215 == -1) {
							Static132.method2246(local137.anInt2229);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt2238 = 3;
						local137.anInt2203 = -1;
						if (local137.anInt2215 == -1) {
							Static132.method2246(local137.anInt2229);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt2238 = 6;
						local137.anInt2203 = anIntArray298[--anInt3355];
						if (local137.anInt2215 == -1) {
							Static132.method2246(local137.anInt2229);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt2238 = 5;
						local137.anInt2203 = anIntArray298[--anInt3355];
						if (local137.anInt2215 == -1) {
							Static132.method2246(local137.anInt2229);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt3355 -= 4;
						local137.anInt2230 = anIntArray298[anInt3355];
						local137.anInt2198 = anIntArray298[anInt3355 + 1];
						local137.anInt2245 = anIntArray298[anInt3355 + 2];
						local137.anInt2213 = anIntArray298[anInt3355 + 3];
						Static78.method1460(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt3355 -= 2;
						local137.anInt2237 = anIntArray298[anInt3355];
						local137.anInt2178 = anIntArray298[anInt3355 + 1];
						Static78.method1460(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt3355 -= 4;
						local137.anInt2203 = anIntArray298[anInt3355];
						local137.anInt2185 = anIntArray298[anInt3355 + 1];
						if (anIntArray298[anInt3355 + 2] == 1) {
							local137.anInt2238 = 9;
						} else {
							local137.anInt2238 = 8;
						}
						if (anIntArray298[anInt3355 + 3] == 1) {
							local137.aBoolean150 = true;
						} else {
							local137.aBoolean150 = false;
						}
						if (local137.anInt2215 == -1) {
							Static132.method2246(local137.anInt2229);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt2238 = 5;
						local137.anInt2203 = Static399.anInt6656;
						local137.anInt2185 = 0;
						if (local137.anInt2215 == -1) {
							Static132.method2246(local137.anInt2229);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static165.method2704(anIntArray298[--anInt3355]);
				} else {
					local137 = arg1 ? aClass68_6 : aClass68_5;
				}
				if (arg0 == 1000) {
					anInt3355 -= 4;
					local137.anInt2168 = anIntArray298[anInt3355];
					local137.anInt2186 = anIntArray298[anInt3355 + 1];
					local19 = anIntArray298[anInt3355 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray298[anInt3355 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte34 = (byte) local19;
					local137.aByte33 = (byte) local25;
					Static78.method1460(local137);
					Static72.method1342(local137);
					if (local137.anInt2215 == -1) {
						Static199.method3101(local137.anInt2229);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt3355 -= 4;
					local137.anInt2171 = anIntArray298[anInt3355];
					local137.anInt2173 = anIntArray298[anInt3355 + 1];
					local137.anInt2207 = 0;
					local137.anInt2240 = 0;
					local19 = anIntArray298[anInt3355 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray298[anInt3355 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte35 = (byte) local19;
					local137.aByte32 = (byte) local25;
					Static78.method1460(local137);
					Static72.method1342(local137);
					if (local137.anInt2249 == 0) {
						Static49.method804(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray298[--anInt3355] == 1;
					if (local137.aBoolean151 != local620) {
						local137.aBoolean151 = local620;
						Static78.method1460(local137);
					}
					if (local137.anInt2215 == -1) {
						Static113.method2031(local137.anInt2229);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt3355 -= 2;
					local137.anInt2217 = anIntArray298[anInt3355];
					local137.anInt2195 = anIntArray298[anInt3355 + 1];
					Static78.method1460(local137);
					Static72.method1342(local137);
					if (local137.anInt2249 == 0) {
						Static49.method804(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean147 = anIntArray298[--anInt3355] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method2736(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static193.anInt3710 == 0 && (Static340.aBoolean411 && !Static62.aBoolean83 || Static223.aBoolean314)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static292.aClass209_117.method4562(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static292.aClass209_117.method4562(0).length());
		} else if (local11.startsWith(Static193.aClass209_85.method4562(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static193.aClass209_85.method4562(0).length());
		} else if (local11.startsWith(Static208.aClass209_92.method4562(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static208.aClass209_92.method4562(0).length());
		} else if (local11.startsWith(Static337.aClass209_133.method4562(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static337.aClass209_133.method4562(0).length());
		} else if (local11.startsWith(Static250.aClass209_107.method4562(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static250.aClass209_107.method4562(0).length());
		} else if (local11.startsWith(Static262.aClass209_149.method4562(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static262.aClass209_149.method4562(0).length());
		} else if (local11.startsWith(Static299.aClass209_122.method4562(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static299.aClass209_122.method4562(0).length());
		} else if (local11.startsWith(Static376.aClass209_147.method4562(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static376.aClass209_147.method4562(0).length());
		} else if (local11.startsWith(Static121.aClass209_60.method4562(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static121.aClass209_60.method4562(0).length());
		} else if (local11.startsWith(Static340.aClass209_135.method4562(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static340.aClass209_135.method4562(0).length());
		} else if (local11.startsWith(Static276.aClass209_113.method4562(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static276.aClass209_113.method4562(0).length());
		} else if (local11.startsWith(Static448.aClass209_162.method4562(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static448.aClass209_162.method4562(0).length());
		} else if (Static388.anInt6533 != 0) {
			if (local11.startsWith(Static292.aClass209_117.method4562(Static388.anInt6533))) {
				local13 = 0;
				arg0 = arg0.substring(Static292.aClass209_117.method4562(Static388.anInt6533).length());
			} else if (local11.startsWith(Static193.aClass209_85.method4562(Static388.anInt6533))) {
				local13 = 1;
				arg0 = arg0.substring(Static193.aClass209_85.method4562(Static388.anInt6533).length());
			} else if (local11.startsWith(Static208.aClass209_92.method4562(Static388.anInt6533))) {
				local13 = 2;
				arg0 = arg0.substring(Static208.aClass209_92.method4562(Static388.anInt6533).length());
			} else if (local11.startsWith(Static337.aClass209_133.method4562(Static388.anInt6533))) {
				local13 = 3;
				arg0 = arg0.substring(Static337.aClass209_133.method4562(Static388.anInt6533).length());
			} else if (local11.startsWith(Static250.aClass209_107.method4562(Static388.anInt6533))) {
				local13 = 4;
				arg0 = arg0.substring(Static250.aClass209_107.method4562(Static388.anInt6533).length());
			} else if (local11.startsWith(Static262.aClass209_149.method4562(Static388.anInt6533))) {
				local13 = 5;
				arg0 = arg0.substring(Static262.aClass209_149.method4562(Static388.anInt6533).length());
			} else if (local11.startsWith(Static299.aClass209_122.method4562(Static388.anInt6533))) {
				local13 = 6;
				arg0 = arg0.substring(Static299.aClass209_122.method4562(Static388.anInt6533).length());
			} else if (local11.startsWith(Static376.aClass209_147.method4562(Static388.anInt6533))) {
				local13 = 7;
				arg0 = arg0.substring(Static376.aClass209_147.method4562(Static388.anInt6533).length());
			} else if (local11.startsWith(Static121.aClass209_60.method4562(Static388.anInt6533))) {
				local13 = 8;
				arg0 = arg0.substring(Static121.aClass209_60.method4562(Static388.anInt6533).length());
			} else if (local11.startsWith(Static340.aClass209_135.method4562(Static388.anInt6533))) {
				local13 = 9;
				arg0 = arg0.substring(Static340.aClass209_135.method4562(Static388.anInt6533).length());
			} else if (local11.startsWith(Static276.aClass209_113.method4562(Static388.anInt6533))) {
				local13 = 10;
				arg0 = arg0.substring(Static276.aClass209_113.method4562(Static388.anInt6533).length());
			} else if (local11.startsWith(Static448.aClass209_162.method4562(Static388.anInt6533))) {
				local13 = 11;
				arg0 = arg0.substring(Static448.aClass209_162.method4562(Static388.anInt6533).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static435.aClass209_160.method4562(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static435.aClass209_160.method4562(0).length());
		} else if (local11.startsWith(Static440.aClass209_161.method4562(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static440.aClass209_161.method4562(0).length());
		} else if (local11.startsWith(Static326.aClass209_128.method4562(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static326.aClass209_128.method4562(0).length());
		} else if (local11.startsWith(Static62.aClass209_35.method4562(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static62.aClass209_35.method4562(0).length());
		} else if (local11.startsWith(Static219.aClass209_96.method4562(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static219.aClass209_96.method4562(0).length());
		} else if (Static388.anInt6533 != 0) {
			if (local11.startsWith(Static435.aClass209_160.method4562(Static388.anInt6533))) {
				local451 = 1;
				arg0 = arg0.substring(Static435.aClass209_160.method4562(Static388.anInt6533).length());
			} else if (local11.startsWith(Static440.aClass209_161.method4562(Static388.anInt6533))) {
				local451 = 2;
				arg0 = arg0.substring(Static440.aClass209_161.method4562(Static388.anInt6533).length());
			} else if (local11.startsWith(Static326.aClass209_128.method4562(Static388.anInt6533))) {
				local451 = 3;
				arg0 = arg0.substring(Static326.aClass209_128.method4562(Static388.anInt6533).length());
			} else if (local11.startsWith(Static62.aClass209_35.method4562(Static388.anInt6533))) {
				local451 = 4;
				arg0 = arg0.substring(Static62.aClass209_35.method4562(Static388.anInt6533).length());
			} else if (local11.startsWith(Static219.aClass209_96.method4562(Static388.anInt6533))) {
				local451 = 5;
				arg0 = arg0.substring(Static219.aClass209_96.method4562(Static388.anInt6533).length());
			}
		}
		Static159.method2586(Static81.aClass54_26);
		Static424.aClass2_Sub23_Sub2_1.method5449(0);
		@Pc(646) int local646 = Static424.aClass2_Sub23_Sub2_1.anInt6952;
		if (arg1 == 5021) {
			Static424.aClass2_Sub23_Sub2_1.method5449(1);
		} else if (arg1 == 5022) {
			Static424.aClass2_Sub23_Sub2_1.method5449(2);
		} else {
			Static424.aClass2_Sub23_Sub2_1.method5449(0);
		}
		Static424.aClass2_Sub23_Sub2_1.method5449(local13);
		Static424.aClass2_Sub23_Sub2_1.method5449(local451);
		Static198.method3097(arg0, Static424.aClass2_Sub23_Sub2_1);
		Static424.aClass2_Sub23_Sub2_1.method5448(Static424.aClass2_Sub23_Sub2_1.anInt6952 - local646);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!of;I)V")
	private static void method2737(@OriginalArg(0) Class2_Sub30 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray35;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub5_Sub5 local12 = Static26.method510(local8);
		if (local12 == null) {
			return;
		}
		anIntArray297 = new int[local12.anInt2105];
		@Pc(21) int local21 = 0;
		aStringArray22 = new String[local12.anInt2108];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt5102;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt5103;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass68_12 == null ? -1 : arg0.aClass68_12.anInt2229;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt5108;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass68_12 == null ? -1 : arg0.aClass68_12.anInt2215;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass68_13 == null ? -1 : arg0.aClass68_13.anInt2229;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass68_13 == null ? -1 : arg0.aClass68_13.anInt2215;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt5109;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt5100;
				}
				anIntArray297[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString49;
				}
				aStringArray22[local27++] = local135;
			}
		}
		anInt3359 = arg0.anInt5101;
		method2738(local12, arg1);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!eh;I)V")
	private static void method2738(@OriginalArg(0) Class2_Sub5_Sub5 arg0, @OriginalArg(1) int arg1) {
		anInt3355 = 0;
		anInt3354 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray152;
		@Pc(11) int[] local11 = arg0.anIntArray153;
		@Pc(13) byte local13 = -1;
		anInt3346 = 0;
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
						method2735(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method2741(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray298[anInt3355++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray298[anInt3355++] = Static344.aClass108_1.anIntArray273[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static344.aClass108_1.method2429(anIntArray298[--anInt3355], local54);
					} else if (local31 == 3) {
						aStringArray21[anInt3354++] = arg0.aStringArray9[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt3355 -= 2;
						if (anIntArray298[anInt3355] != anIntArray298[anInt3355 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt3355 -= 2;
						if (anIntArray298[anInt3355] == anIntArray298[anInt3355 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt3355 -= 2;
						if (anIntArray298[anInt3355] < anIntArray298[anInt3355 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt3355 -= 2;
						if (anIntArray298[anInt3355] > anIntArray298[anInt3355 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt3346 == 0) {
							return;
						}
						@Pc(216) Class205 local216 = aClass205Array1[--anInt3346];
						arg0 = local216.aClass2_Sub5_Sub5_1;
						local8 = arg0.anIntArray152;
						local11 = arg0.anIntArray153;
						local5 = local216.anInt5623;
						anIntArray297 = local216.anIntArray462;
						aStringArray22 = local216.aStringArray40;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray298[anInt3355++] = Static344.aClass108_1.method2423(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static344.aClass108_1.method2433(local54, anIntArray298[--anInt3355]);
					} else if (local31 == 31) {
						anInt3355 -= 2;
						if (anIntArray298[anInt3355] <= anIntArray298[anInt3355 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt3355 -= 2;
						if (anIntArray298[anInt3355] >= anIntArray298[anInt3355 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray298[anInt3355++] = anIntArray297[local11[local5]];
					} else if (local31 == 34) {
						anIntArray297[local11[local5]] = anIntArray298[--anInt3355];
					} else if (local31 == 35) {
						aStringArray21[anInt3354++] = aStringArray22[local11[local5]];
					} else if (local31 == 36) {
						aStringArray22[local11[local5]] = aStringArray21[--anInt3354];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt3354 -= local54;
						@Pc(400) String local400 = Static43.method1872(anInt3354, aStringArray21, local54);
						aStringArray21[anInt3354++] = local400;
					} else if (local31 == 38) {
						anInt3355--;
					} else if (local31 == 39) {
						anInt3354--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class2_Sub5_Sub5 local436 = Static26.method510(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt2105];
							@Pc(450) String[] local450 = new String[local436.anInt2108];
							for (local452 = 0; local452 < local436.anInt2106; local452++) {
								local446[local452] = anIntArray298[anInt3355 + local452 - local436.anInt2106];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt2104; local471++) {
								local450[local471] = aStringArray21[anInt3354 + local471 - local436.anInt2104];
							}
							anInt3355 -= local436.anInt2106;
							anInt3354 -= local436.anInt2104;
							@Pc(502) Class205 local502 = new Class205();
							local502.aClass2_Sub5_Sub5_1 = arg0;
							local502.anInt5623 = local5;
							local502.anIntArray462 = anIntArray297;
							local502.aStringArray40 = aStringArray22;
							if (anInt3346 >= aClass205Array1.length) {
								throw new RuntimeException();
							}
							aClass205Array1[anInt3346++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray152;
							local11 = local436.anIntArray153;
							local5 = -1;
							anIntArray297 = local446;
							aStringArray22 = local450;
						} else if (local31 == 42) {
							anIntArray298[anInt3355++] = Static19.anIntArray426[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static19.anIntArray426[local54] = anIntArray298[--anInt3355];
							Static368.method5010(local54);
							Static275.aBoolean376 |= Static70.aBooleanArray9[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray298[--anInt3355];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray299[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray30[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray298[--anInt3355];
							if (local603 < 0 || local603 >= anIntArray299[local54]) {
								throw new RuntimeException();
							}
							anIntArray298[anInt3355++] = anIntArrayArray30[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt3355 -= 2;
							local603 = anIntArray298[anInt3355];
							if (local603 < 0 || local603 >= anIntArray299[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray30[local54][local603] = anIntArray298[anInt3355 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static109.aStringArray34[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray21[anInt3354++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static109.aStringArray34[local54] = aStringArray21[--anInt3354];
							Static355.method4853(local54);
						} else if (local31 == 51) {
							@Pc(774) Class163 local774 = arg0.aClass163Array1[local11[local5]];
							@Pc(787) Class2_Sub26 local787 = (Class2_Sub26) local774.method3769((long) anIntArray298[--anInt3355]);
							if (local787 != null) {
								local5 += local787.anInt4485;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString20 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong227).append(" ");
				for (local603 = anInt3346 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass205Array1[local603].aClass2_Sub5_Sub5_1.aLong227).append(" ");
				}
				local855.append("op: ").append(local13);
				Static361.method4904(local837, local855.toString());
			} else {
				Static321.method4516("Clientscript error in: " + arg0.aString20);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString20).append("\n");
				for (local603 = anInt3346 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass205Array1[local603].aClass2_Sub5_Sub5_1.aString20).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static361.method4904(local837, local855.toString());
				Static99.method1879(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(IZ)V")
	public static void method2739() {
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(IZ)V")
	private static void method2741(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray298[anInt3355++] = Static176.anInt206;
				return;
			}
			if (arg0 == 5001) {
				anInt3355 -= 3;
				Static176.anInt206 = anIntArray298[anInt3355];
				Static91.aClass216_6 = Static245.method5123(anIntArray298[anInt3355 + 1]);
				if (Static91.aClass216_6 == null) {
					Static91.aClass216_6 = Static80.aClass216_15;
				}
				Static51.anInt1139 = anIntArray298[anInt3355 + 2];
				Static159.method2586(Static166.aClass54_49);
				Static424.aClass2_Sub23_Sub2_1.method5449(Static176.anInt206);
				Static424.aClass2_Sub23_Sub2_1.method5449(Static91.aClass216_6.anInt5923);
				Static424.aClass2_Sub23_Sub2_1.method5449(Static51.anInt1139);
				return;
			}
			if (arg0 == 5002) {
				anInt3354 -= 2;
				local75 = aStringArray21[anInt3354];
				local81 = aStringArray21[anInt3354 + 1];
				anInt3355 -= 2;
				local89 = anIntArray298[anInt3355];
				local95 = anIntArray298[anInt3355 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static159.method2586(Static17.aClass54_9);
				Static424.aClass2_Sub23_Sub2_1.method5449(Static287.method4138(local75) + Static287.method4138(local81) + 2);
				Static424.aClass2_Sub23_Sub2_1.method5496(local75);
				Static424.aClass2_Sub23_Sub2_1.method5449(local89 - 1);
				Static424.aClass2_Sub23_Sub2_1.method5449(local95);
				Static424.aClass2_Sub23_Sub2_1.method5496(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray298[--anInt3355];
				local81 = null;
				if (local157 < 100) {
					local81 = Static341.aStringArray15[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray21[anInt3354++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray298[--anInt3355];
				local192 = -1;
				if (local157 < 100 && Static341.aStringArray15[local157] != null) {
					local192 = Static267.anIntArray630[local157];
				}
				anIntArray298[anInt3355++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static91.aClass216_6 == null) {
					anIntArray298[anInt3355++] = -1;
					return;
				}
				anIntArray298[anInt3355++] = Static91.aClass216_6.anInt5923;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray21[--anInt3354];
				method2736(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt3354 -= 2;
				local75 = aStringArray21[anInt3354];
				local81 = aStringArray21[anInt3354 + 1];
				if (Static193.anInt3710 != 0 || (!Static340.aBoolean411 || Static62.aBoolean83) && !Static223.aBoolean314) {
					Static159.method2586(Static329.aClass54_80);
					Static424.aClass2_Sub23_Sub2_1.method5449(0);
					local89 = Static424.aClass2_Sub23_Sub2_1.anInt6952;
					Static424.aClass2_Sub23_Sub2_1.method5496(local75);
					Static198.method3097(local81, Static424.aClass2_Sub23_Sub2_1);
					Static424.aClass2_Sub23_Sub2_1.method5448(Static424.aClass2_Sub23_Sub2_1.anInt6952 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray298[--anInt3355];
				local81 = null;
				if (local157 < 100) {
					local81 = Static12.aStringArray1[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray21[anInt3354++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray298[--anInt3355];
				local81 = null;
				if (local157 < 100) {
					local81 = Static353.aStringArray44[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray21[anInt3354++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray298[--anInt3355];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static370.anIntArray540[local157];
				}
				anIntArray298[anInt3355++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static375.aClass3_Sub2_Sub1_Sub2_7 == null || Static375.aClass3_Sub2_Sub1_Sub2_7.aString55 == null) {
					local75 = Static159.aString38;
				} else {
					local75 = Static375.aClass3_Sub2_Sub1_Sub2_7.method4950();
				}
				aStringArray21[anInt3354++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray298[anInt3355++] = Static51.anInt1139;
				return;
			}
			if (arg0 == 5017) {
				anIntArray298[anInt3355++] = Static39.anInt730;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray298[--anInt3355];
				local192 = 0;
				if (local157 < 100 && Static341.aStringArray15[local157] != null) {
					local192 = Static267.anIntArray630[local157];
				}
				anIntArray298[anInt3355++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray298[--anInt3355];
				local81 = null;
				if (local157 < 100) {
					local81 = Static150.aStringArray30[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray21[anInt3354++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static375.aClass3_Sub2_Sub1_Sub2_7 == null || Static375.aClass3_Sub2_Sub1_Sub2_7.aString55 == null) {
					local75 = Static159.aString38;
				} else {
					local75 = Static375.aClass3_Sub2_Sub1_Sub2_7.method4943();
				}
				aStringArray21[anInt3354++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray298[--anInt3355];
				aStringArray21[anInt3354++] = Static322.aClass257_1.method5672(local157).aString33;
				return;
			}
			@Pc(589) Class2_Sub5_Sub7 local589;
			if (arg0 == 5051) {
				local157 = anIntArray298[--anInt3355];
				local589 = Static322.aClass257_1.method5672(local157);
				if (local589.anIntArray204 == null) {
					anIntArray298[anInt3355++] = 0;
					return;
				}
				anIntArray298[anInt3355++] = local589.anIntArray204.length;
				return;
			}
			if (arg0 == 5052) {
				anInt3355 -= 2;
				local157 = anIntArray298[anInt3355];
				local192 = anIntArray298[anInt3355 + 1];
				@Pc(634) Class2_Sub5_Sub7 local634 = Static322.aClass257_1.method5672(local157);
				local95 = local634.anIntArray204[local192];
				anIntArray298[anInt3355++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray298[--anInt3355];
				local589 = Static322.aClass257_1.method5672(local157);
				if (local589.anIntArray203 == null) {
					anIntArray298[anInt3355++] = 0;
					return;
				}
				anIntArray298[anInt3355++] = local589.anIntArray203.length;
				return;
			}
			if (arg0 == 5054) {
				anInt3355 -= 2;
				local157 = anIntArray298[anInt3355];
				local192 = anIntArray298[anInt3355 + 1];
				anIntArray298[anInt3355++] = Static322.aClass257_1.method5672(local157).anIntArray203[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray298[--anInt3355];
				aStringArray21[anInt3354++] = Static181.aClass71_1.method1830(local157).method3915();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray298[--anInt3355];
				@Pc(760) Class2_Sub5_Sub10 local760 = Static181.aClass71_1.method1830(local157);
				if (local760.anIntArray403 == null) {
					anIntArray298[anInt3355++] = 0;
					return;
				}
				anIntArray298[anInt3355++] = local760.anIntArray403.length;
				return;
			}
			if (arg0 == 5057) {
				anInt3355 -= 2;
				local157 = anIntArray298[anInt3355];
				local192 = anIntArray298[anInt3355 + 1];
				anIntArray298[anInt3355++] = Static181.aClass71_1.method1830(local157).anIntArray403[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass206_1 = new Class206();
				aClass206_1.anInt5626 = anIntArray298[--anInt3355];
				aClass206_1.aClass2_Sub5_Sub10_1 = Static181.aClass71_1.method1830(aClass206_1.anInt5626);
				aClass206_1.anIntArray464 = new int[aClass206_1.aClass2_Sub5_Sub10_1.method3914()];
				return;
			}
			if (arg0 == 5059) {
				Static159.method2586(Static104.aClass54_33);
				Static424.aClass2_Sub23_Sub2_1.method5449(0);
				local157 = Static424.aClass2_Sub23_Sub2_1.anInt6952;
				Static424.aClass2_Sub23_Sub2_1.method5449(0);
				Static424.aClass2_Sub23_Sub2_1.method5502(aClass206_1.anInt5626);
				aClass206_1.aClass2_Sub5_Sub10_1.method3923(Static424.aClass2_Sub23_Sub2_1, aClass206_1.anIntArray464);
				Static424.aClass2_Sub23_Sub2_1.method5448(Static424.aClass2_Sub23_Sub2_1.anInt6952 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray21[--anInt3354];
				Static159.method2586(Static222.aClass54_62);
				Static424.aClass2_Sub23_Sub2_1.method5449(0);
				local192 = Static424.aClass2_Sub23_Sub2_1.anInt6952;
				Static424.aClass2_Sub23_Sub2_1.method5496(local75);
				Static424.aClass2_Sub23_Sub2_1.method5502(aClass206_1.anInt5626);
				aClass206_1.aClass2_Sub5_Sub10_1.method3923(Static424.aClass2_Sub23_Sub2_1, aClass206_1.anIntArray464);
				Static424.aClass2_Sub23_Sub2_1.method5448(Static424.aClass2_Sub23_Sub2_1.anInt6952 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static159.method2586(Static104.aClass54_33);
				Static424.aClass2_Sub23_Sub2_1.method5449(0);
				local157 = Static424.aClass2_Sub23_Sub2_1.anInt6952;
				Static424.aClass2_Sub23_Sub2_1.method5449(1);
				Static424.aClass2_Sub23_Sub2_1.method5502(aClass206_1.anInt5626);
				aClass206_1.aClass2_Sub5_Sub10_1.method3923(Static424.aClass2_Sub23_Sub2_1, aClass206_1.anIntArray464);
				Static424.aClass2_Sub23_Sub2_1.method5448(Static424.aClass2_Sub23_Sub2_1.anInt6952 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt3355 -= 2;
				local157 = anIntArray298[anInt3355];
				local192 = anIntArray298[anInt3355 + 1];
				anIntArray298[anInt3355++] = Static322.aClass257_1.method5672(local157).aCharArray3[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt3355 -= 2;
				local157 = anIntArray298[anInt3355];
				local192 = anIntArray298[anInt3355 + 1];
				anIntArray298[anInt3355++] = Static322.aClass257_1.method5672(local157).aCharArray2[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt3355 -= 2;
				local157 = anIntArray298[anInt3355];
				local192 = anIntArray298[anInt3355 + 1];
				if (local192 == -1) {
					anIntArray298[anInt3355++] = -1;
					return;
				}
				anIntArray298[anInt3355++] = Static322.aClass257_1.method5672(local157).method2030((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt3355 -= 2;
				local157 = anIntArray298[anInt3355];
				local192 = anIntArray298[anInt3355 + 1];
				if (local192 == -1) {
					anIntArray298[anInt3355++] = -1;
					return;
				}
				anIntArray298[anInt3355++] = Static322.aClass257_1.method5672(local157).method2029((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray298[--anInt3355];
				anIntArray298[anInt3355++] = Static181.aClass71_1.method1830(local157).method3914();
				return;
			}
			if (arg0 == 5067) {
				anInt3355 -= 2;
				local157 = anIntArray298[anInt3355];
				local192 = anIntArray298[anInt3355 + 1];
				local89 = Static181.aClass71_1.method1830(local157).method3921(local192).anInt3974;
				anIntArray298[anInt3355++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt3355 -= 2;
				local157 = anIntArray298[anInt3355];
				local192 = anIntArray298[anInt3355 + 1];
				aClass206_1.anIntArray464[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt3355 -= 2;
				local157 = anIntArray298[anInt3355];
				local192 = anIntArray298[anInt3355 + 1];
				aClass206_1.anIntArray464[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt3355 -= 3;
				local157 = anIntArray298[anInt3355];
				local192 = anIntArray298[anInt3355 + 1];
				local89 = anIntArray298[anInt3355 + 2];
				@Pc(1265) Class2_Sub5_Sub10 local1265 = Static181.aClass71_1.method1830(local157);
				if (local1265.method3921(local192).anInt3974 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray298[anInt3355++] = local1265.method3926(local89, local192);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray21[--anInt3354];
				local1313 = anIntArray298[--anInt3355] == 1;
				Static2.method69(local1313, local75);
				anIntArray298[anInt3355++] = Static259.anInt4836;
				return;
			}
			if (arg0 == 5072) {
				if (Static101.aShortArray24 != null && Static414.anInt6897 < Static259.anInt4836) {
					anIntArray298[anInt3355++] = Static101.aShortArray24[Static414.anInt6897++] & 0xFFFF;
					return;
				}
				anIntArray298[anInt3355++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static414.anInt6897 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static159.method2586(Static104.aClass54_33);
				Static424.aClass2_Sub23_Sub2_1.method5449(0);
				local157 = Static424.aClass2_Sub23_Sub2_1.anInt6952;
				Static424.aClass2_Sub23_Sub2_1.method5449(2);
				Static424.aClass2_Sub23_Sub2_1.method5502(aClass206_1.anInt5626);
				aClass206_1.aClass2_Sub5_Sub10_1.method3923(Static424.aClass2_Sub23_Sub2_1, aClass206_1.anIntArray464);
				Static424.aClass2_Sub23_Sub2_1.method5448(Static424.aClass2_Sub23_Sub2_1.anInt6952 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static334.aClass226_1.method4977(86)) {
					anIntArray298[anInt3355++] = 1;
					return;
				}
				anIntArray298[anInt3355++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static334.aClass226_1.method4977(82)) {
					anIntArray298[anInt3355++] = 1;
					return;
				}
				anIntArray298[anInt3355++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static334.aClass226_1.method4977(81)) {
					anIntArray298[anInt3355++] = 1;
					return;
				}
				anIntArray298[anInt3355++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static138.method2340(anIntArray298[--anInt3355]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray298[anInt3355++] = Static65.method1250();
					return;
				}
				if (arg0 == 5205) {
					Static239.method3693(anIntArray298[--anInt3355], -1, -1, false);
					return;
				}
				@Pc(1554) Class2_Sub5_Sub12 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray298[--anInt3355];
					local1554 = Static88.method3645(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray298[anInt3355++] = -1;
						return;
					}
					anIntArray298[anInt3355++] = local1554.anInt5160;
					return;
				}
				@Pc(1587) Class2_Sub5_Sub12 local1587;
				if (arg0 == 5207) {
					local1587 = Static88.method3654(anIntArray298[--anInt3355]);
					if (local1587 != null && local1587.aString50 != null) {
						aStringArray21[anInt3354++] = local1587.aString50;
						return;
					}
					aStringArray21[anInt3354++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray298[anInt3355++] = Static63.anInt1423;
					anIntArray298[anInt3355++] = Static446.anInt7246;
					return;
				}
				if (arg0 == 5209) {
					anIntArray298[anInt3355++] = Static133.anInt2851 + Static88.anInt4520;
					anIntArray298[anInt3355++] = Static129.anInt2786 + Static88.anInt4515;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray298[--anInt3355];
					local1554 = Static88.method3654(local157);
					if (local1554 == null) {
						anIntArray298[anInt3355++] = 0;
						anIntArray298[anInt3355++] = 0;
						return;
					}
					anIntArray298[anInt3355++] = local1554.anInt5153 >> 14 & 0x3FFF;
					anIntArray298[anInt3355++] = local1554.anInt5153 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray298[--anInt3355];
					local1554 = Static88.method3654(local157);
					if (local1554 == null) {
						anIntArray298[anInt3355++] = 0;
						anIntArray298[anInt3355++] = 0;
						return;
					}
					anIntArray298[anInt3355++] = local1554.anInt5164 - local1554.anInt5154;
					anIntArray298[anInt3355++] = local1554.anInt5163 - local1554.anInt5165;
					return;
				}
				@Pc(1777) Class2_Sub18 local1777;
				if (arg0 == 5212) {
					local1777 = Static25.method503();
					if (local1777 == null) {
						anIntArray298[anInt3355++] = -1;
						anIntArray298[anInt3355++] = -1;
						return;
					}
					anIntArray298[anInt3355++] = local1777.anInt3142;
					local192 = local1777.anInt3150 << 28 | local1777.anInt3147 + Static88.anInt4520 << 14 | local1777.anInt3146 + Static88.anInt4515;
					anIntArray298[anInt3355++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static6.method193();
					if (local1777 == null) {
						anIntArray298[anInt3355++] = -1;
						anIntArray298[anInt3355++] = -1;
						return;
					}
					anIntArray298[anInt3355++] = local1777.anInt3142;
					local192 = local1777.anInt3150 << 28 | local1777.anInt3147 + Static88.anInt4520 << 14 | local1777.anInt3146 + Static88.anInt4515;
					anIntArray298[anInt3355++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray298[--anInt3355];
					local1554 = Static275.method4058();
					if (local1554 != null) {
						local1925 = local1554.method4139(local157 & 0x3FFF, anIntArray300, local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3);
						if (local1925) {
							Static118.method2095(anIntArray300[2], anIntArray300[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt3355 -= 2;
					local157 = anIntArray298[anInt3355];
					local192 = anIntArray298[anInt3355 + 1];
					@Pc(1963) Class44 local1963 = Static88.method3652(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class2_Sub5_Sub12 local1970 = (Class2_Sub5_Sub12) local1963.method802(); local1970 != null; local1970 = (Class2_Sub5_Sub12) local1963.method803()) {
						if (local1970.anInt5160 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray298[anInt3355++] = 1;
						return;
					}
					anIntArray298[anInt3355++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray298[--anInt3355];
					local1554 = Static88.method3654(local157);
					if (local1554 == null) {
						anIntArray298[anInt3355++] = -1;
						return;
					}
					anIntArray298[anInt3355++] = local1554.anInt5157;
					return;
				}
				if (arg0 == 5220) {
					anIntArray298[anInt3355++] = Static23.anInt564 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray298[--anInt3355];
					Static118.method2095(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static275.method4058();
					if (local1587 != null) {
						local1313 = local1587.method4147(anIntArray300, Static133.anInt2851 + Static88.anInt4520, Static129.anInt2786 + Static88.anInt4515);
						if (local1313) {
							anIntArray298[anInt3355++] = anIntArray300[1];
							anIntArray298[anInt3355++] = anIntArray300[2];
							return;
						}
						anIntArray298[anInt3355++] = -1;
						anIntArray298[anInt3355++] = -1;
						return;
					}
					anIntArray298[anInt3355++] = -1;
					anIntArray298[anInt3355++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt3355 -= 2;
					local157 = anIntArray298[anInt3355];
					local192 = anIntArray298[anInt3355 + 1];
					Static239.method3693(local157, local192 & 0x3FFF, local192 >> 14 & 0x3FFF, false);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray298[--anInt3355];
					local1554 = Static275.method4058();
					if (local1554 != null) {
						local1925 = local1554.method4139(local157 & 0x3FFF, anIntArray300, local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3);
						if (local1925) {
							anIntArray298[anInt3355++] = anIntArray300[1];
							anIntArray298[anInt3355++] = anIntArray300[2];
							return;
						}
						anIntArray298[anInt3355++] = -1;
						anIntArray298[anInt3355++] = -1;
						return;
					}
					anIntArray298[anInt3355++] = -1;
					anIntArray298[anInt3355++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray298[--anInt3355];
					local1554 = Static275.method4058();
					if (local1554 != null) {
						local1925 = local1554.method4147(anIntArray300, local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
						if (local1925) {
							anIntArray298[anInt3355++] = anIntArray300[1];
							anIntArray298[anInt3355++] = anIntArray300[2];
							return;
						}
						anIntArray298[anInt3355++] = -1;
						anIntArray298[anInt3355++] = -1;
						return;
					}
					anIntArray298[anInt3355++] = -1;
					anIntArray298[anInt3355++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static318.method5330(anIntArray298[--anInt3355]);
					return;
				}
				if (arg0 == 5227) {
					anInt3355 -= 2;
					local157 = anIntArray298[anInt3355];
					local192 = anIntArray298[anInt3355 + 1];
					Static239.method3693(local157, local192 & 0x3FFF, local192 >> 14 & 0x3FFF, true);
					return;
				}
				if (arg0 == 5228) {
					Static371.aBoolean298 = anIntArray298[--anInt3355] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray298[anInt3355++] = Static371.aBoolean298 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray298[--anInt3355];
					Static80.method5642(local157);
					return;
				}
				@Pc(2483) Class2 local2483;
				if (arg0 == 5231) {
					anInt3355 -= 2;
					local157 = anIntArray298[anInt3355];
					local1313 = anIntArray298[anInt3355 + 1] == 1;
					if (Static142.aClass163_14 != null) {
						local2483 = Static142.aClass163_14.method3769((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5866();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class2();
							Static142.aClass163_14.method3764((long) local157, local2483);
						}
					}
					return;
				}
				@Pc(2525) Class2 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray298[--anInt3355];
					if (Static142.aClass163_14 != null) {
						local2525 = Static142.aClass163_14.method3769((long) local157);
						anIntArray298[anInt3355++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray298[anInt3355++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt3355 -= 2;
					local157 = anIntArray298[anInt3355];
					local1313 = anIntArray298[anInt3355 + 1] == 1;
					if (Static308.aClass163_35 != null) {
						local2483 = Static308.aClass163_35.method3769((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5866();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class2();
							Static308.aClass163_35.method3764((long) local157, local2483);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray298[--anInt3355];
					if (Static308.aClass163_35 != null) {
						local2525 = Static308.aClass163_35.method3769((long) local157);
						anIntArray298[anInt3355++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray298[anInt3355++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray298[anInt3355++] = Static88.aClass2_Sub5_Sub12_2 == null ? -1 : Static88.aClass2_Sub5_Sub12_2.anInt5160;
					return;
				}
				if (arg0 == 5236) {
					anInt3355 -= 2;
					local157 = anIntArray298[anInt3355];
					local192 = anIntArray298[anInt3355 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static257.method3887(local157, local95, local89);
					if (local2691 < 0) {
						anIntArray298[anInt3355++] = -1;
						return;
					}
					anIntArray298[anInt3355++] = local2691;
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt3355 -= 2;
					local157 = anIntArray298[anInt3355];
					local192 = anIntArray298[anInt3355 + 1];
					Static243.method3738(local157, local192, false, 3);
					anIntArray298[anInt3355++] = Static150.aFrame5 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static150.aFrame5 != null) {
						Static243.method3738(-1, -1, false, Static12.aClass79_Sub1_1.anInt4917);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2769) Class137[] local2769 = Static335.method759();
					anIntArray298[anInt3355++] = local2769.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray298[--anInt3355];
					@Pc(2793) Class137[] local2793 = Static335.method759();
					anIntArray298[anInt3355++] = local2793[local157].anInt3706;
					anIntArray298[anInt3355++] = local2793[local157].anInt3709;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static12.aClass79_Sub1_1.anInt4916;
					local192 = Static12.aClass79_Sub1_1.anInt4914;
					local89 = -1;
					@Pc(2830) Class137[] local2830 = Static335.method759();
					for (local2691 = 0; local2691 < local2830.length; local2691++) {
						@Pc(2837) Class137 local2837 = local2830[local2691];
						if (local2837.anInt3706 == local157 && local2837.anInt3709 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray298[anInt3355++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray298[anInt3355++] = Static359.method4899();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray298[--anInt3355];
					if (local157 >= 1 && local157 <= 2) {
						Static243.method3738(-1, -1, false, local157);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.anInt4917;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray298[--anInt3355];
					if (local157 >= 1 && local157 <= 2) {
						Static12.aClass79_Sub1_1.anInt4917 = local157;
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						return;
					}
					return;
				}
			} else {
				@Pc(3345) String local3345;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt3354 -= 2;
						local75 = aStringArray21[anInt3354];
						local81 = aStringArray21[anInt3354 + 1];
						local89 = anIntArray298[--anInt3355];
						Static159.method2586(Static329.aClass54_81);
						Static424.aClass2_Sub23_Sub2_1.method5449(Static287.method4138(local75) + Static287.method4138(local81) + 1);
						Static424.aClass2_Sub23_Sub2_1.method5496(local75);
						Static424.aClass2_Sub23_Sub2_1.method5496(local81);
						Static424.aClass2_Sub23_Sub2_1.method5449(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt3355 -= 2;
						Static1.aShortArray10[anIntArray298[anInt3355]] = (short) Static263.method3943(anIntArray298[anInt3355 + 1]);
						Static318.aClass144_6.method3264();
						Static318.aClass144_6.method3271();
						Static219.aClass76_2.method1887();
						Static260.method3927();
						return;
					}
					if (arg0 == 5405) {
						anInt3355 -= 2;
						local157 = anIntArray298[anInt3355];
						local192 = anIntArray298[anInt3355 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static444.anIntArrayArrayArray14[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt3355 -= 7;
						local157 = anIntArray298[anInt3355];
						local192 = anIntArray298[anInt3355 + 1] << 1;
						local89 = anIntArray298[anInt3355 + 2];
						local95 = anIntArray298[anInt3355 + 3];
						local2691 = anIntArray298[anInt3355 + 4];
						@Pc(3105) int local3105 = anIntArray298[anInt3355 + 5];
						@Pc(3111) int local3111 = anIntArray298[anInt3355 + 6];
						if (local157 >= 0 && local157 < 2 && Static444.anIntArrayArrayArray14[local157] != null && local192 >= 0 && local192 < Static444.anIntArrayArrayArray14[local157].length) {
							Static444.anIntArrayArrayArray14[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3111 };
							Static444.anIntArrayArrayArray14[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3105, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static444.anIntArrayArrayArray14[anIntArray298[--anInt3355]].length >> 1;
						anIntArray298[anInt3355++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static150.aFrame5 != null) {
							Static243.method3738(-1, -1, false, Static12.aClass79_Sub1_1.anInt4917);
						}
						if (Static149.aFrame4 != null) {
							Static415.method5522();
							System.exit(0);
							return;
						}
						local75 = Static408.aString61 == null ? Static92.method2438() : Static408.aString61;
						Static363.method4953(false, Static43.aClass59_5, Static399.anInt6653 == 1, local75);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static285.aClass138_9 != null) {
							if (Static285.aClass138_9.anObject7 == null) {
								local75 = Static222.method3483(Static285.aClass138_9.anInt3722);
							} else {
								local75 = (String) Static285.aClass138_9.anObject7;
							}
						}
						aStringArray21[anInt3354++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray298[anInt3355++] = Static73.anInt1597 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static150.aFrame5 != null) {
							Static243.method3738(-1, -1, false, Static12.aClass79_Sub1_1.anInt4917);
						}
						local75 = aStringArray21[--anInt3354];
						local1313 = anIntArray298[--anInt3355] == 1;
						local3345 = Static92.method2438() + local75;
						Static363.method4953(local1313, Static43.aClass59_5, Static399.anInt6653 == 1, local3345);
						return;
					}
					if (arg0 == 5422) {
						anInt3354 -= 2;
						local75 = aStringArray21[anInt3354];
						local81 = aStringArray21[anInt3354 + 1];
						local89 = anIntArray298[--anInt3355];
						if (local75.length() > 0) {
							if (Static154.aStringArray19 == null) {
								Static154.aStringArray19 = new String[Static174.anIntArray309[Static320.aClass10_28.anInt259]];
							}
							Static154.aStringArray19[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static16.aStringArray2 == null) {
								Static16.aStringArray2 = new String[Static174.anIntArray309[Static320.aClass10_28.anInt259]];
							}
							Static16.aStringArray2[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray21[--anInt3354]);
						return;
					}
					if (arg0 == 5424) {
						anInt3355 -= 11;
						Static79.anInt1765 = anIntArray298[anInt3355];
						Static78.anInt1748 = anIntArray298[anInt3355 + 1];
						Static141.anInt3017 = anIntArray298[anInt3355 + 2];
						Static239.anInt4590 = anIntArray298[anInt3355 + 3];
						Static290.anInt5205 = anIntArray298[anInt3355 + 4];
						Static26.anInt604 = anIntArray298[anInt3355 + 5];
						Static5.anInt143 = anIntArray298[anInt3355 + 6];
						Static234.anInt4530 = anIntArray298[anInt3355 + 7];
						Static230.anInt4439 = anIntArray298[anInt3355 + 8];
						Static62.anInt1369 = anIntArray298[anInt3355 + 9];
						Static164.anInt3277 = anIntArray298[anInt3355 + 10];
						Static153.aClass160_25.method3716(Static290.anInt5205);
						Static153.aClass160_25.method3716(Static26.anInt604);
						Static153.aClass160_25.method3716(Static5.anInt143);
						Static153.aClass160_25.method3716(Static234.anInt4530);
						Static153.aClass160_25.method3716(Static230.anInt4439);
						Static35.aClass17_5 = null;
						Static249.aClass17_36 = null;
						Static37.aClass17_6 = null;
						Static281.aClass17_58 = null;
						Static440.aClass17_57 = null;
						Static55.aClass17_9 = null;
						Static284.aClass17_39 = null;
						Static375.aClass17_44 = null;
						Static82.aBoolean109 = true;
						return;
					}
					if (arg0 == 5425) {
						Static210.method3331();
						Static82.aBoolean109 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt3355 -= 2;
						Static368.anInt6315 = anIntArray298[anInt3355];
						Static238.anInt4575 = anIntArray298[anInt3355 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt3355 -= 2;
						Static161.anInt6992 = anIntArray298[anInt3355 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt3355 -= 2;
						local157 = anIntArray298[anInt3355];
						local192 = anIntArray298[anInt3355 + 1];
						anIntArray298[anInt3355++] = Static186.method2957(local157, local192) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static443.method5711(false, aStringArray21[--anInt3354]);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static463.method4344("accountcreated", Static43.aClass59_5.anApplet1);
							return;
						} catch (@Pc(3639) Throwable local3639) {
							return;
						}
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt3355 -= 4;
						local157 = anIntArray298[anInt3355];
						local192 = anIntArray298[anInt3355 + 1];
						local89 = anIntArray298[anInt3355 + 2];
						local95 = anIntArray298[anInt3355 + 3];
						Static100.method1881(local89, (local157 >> 14 & 0x3FFF) - Static48.anInt962, false, local95, (local157 & 0x3FFF) - Static324.anInt5624, local192);
						return;
					}
					if (arg0 == 5501) {
						anInt3355 -= 4;
						local157 = anIntArray298[anInt3355];
						local192 = anIntArray298[anInt3355 + 1];
						local89 = anIntArray298[anInt3355 + 2];
						local95 = anIntArray298[anInt3355 + 3];
						Static308.method4348((local157 >> 14 & 0x3FFF) - Static48.anInt962, local95, local192, local89, (local157 & 0x3FFF) - Static324.anInt5624);
						return;
					}
					if (arg0 == 5502) {
						anInt3355 -= 6;
						local157 = anIntArray298[anInt3355];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static103.anInt2414 = local157;
						local192 = anIntArray298[anInt3355 + 1];
						if (local192 + 1 >= Static444.anIntArrayArrayArray14[Static103.anInt2414].length >> 1) {
							throw new RuntimeException();
						}
						Static436.anInt7187 = local192;
						Static150.anInt4217 = 0;
						Static316.anInt5473 = anIntArray298[anInt3355 + 2];
						Static288.anInt5173 = anIntArray298[anInt3355 + 3];
						local89 = anIntArray298[anInt3355 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static385.anInt6454 = local89;
						local95 = anIntArray298[anInt3355 + 5];
						if (local95 + 1 >= Static444.anIntArrayArrayArray14[Static385.anInt6454].length >> 1) {
							throw new RuntimeException();
						}
						Static397.anInt6603 = local95;
						Static159.anInt3195 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static56.method924();
						return;
					}
					if (arg0 == 5504) {
						anInt3355 -= 2;
						Static276.method4062(anIntArray298[anInt3355], anIntArray298[anInt3355 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray298[anInt3355++] = (int) Static287.aFloat74 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray298[anInt3355++] = (int) Static202.aFloat62 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static218.method3411();
						return;
					}
					if (arg0 == 5508) {
						Static225.method3531();
						return;
					}
					if (arg0 == 5509) {
						Static173.method2820();
						return;
					}
					if (arg0 == 5510) {
						Static246.method3760();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray298[--anInt3355];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static48.anInt962;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static229.anInt4427) {
							local192 = Static229.anInt4427;
						}
						local89 -= Static324.anInt5624;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static379.anInt6422) {
							local89 = Static379.anInt6422;
						}
						Static405.anInt6749 = (local192 << 7) + 64;
						Static186.anInt3613 = (local89 << 7) + 64;
						Static159.anInt3195 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static408.method5377();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt3354 -= 2;
						local75 = aStringArray21[anInt3354];
						local81 = aStringArray21[anInt3354 + 1];
						local89 = anIntArray298[--anInt3355];
						if (Static162.anInt3250 != 10) {
							return;
						}
						if (Static275.anInt5055 == 0 && Static305.anInt5413 == 0 && Static10.anInt258 == 0 && Static156.anInt3174 == 0) {
							Static195.method3068(local89, local75, local81);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static422.method5588();
						return;
					}
					if (arg0 == 5602) {
						if (Static305.anInt5413 == 0) {
							Static378.anInt6415 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt3355 -= 4;
						if (Static162.anInt3250 != 10) {
							return;
						}
						if (Static275.anInt5055 == 0 && Static305.anInt5413 == 0 && Static10.anInt258 == 0 && Static156.anInt3174 == 0) {
							Static145.method2416(anIntArray298[anInt3355], anIntArray298[anInt3355 + 2], anIntArray298[anInt3355 + 1], anIntArray298[anInt3355 + 3]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt3354--;
						if (Static162.anInt3250 != 10) {
							return;
						}
						if (Static275.anInt5055 == 0 && Static305.anInt5413 == 0 && Static10.anInt258 == 0 && Static156.anInt3174 == 0) {
							Static300.method4295(Static346.method4767(aStringArray21[anInt3354]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt3354 -= 3;
						anInt3355 -= 7;
						if (Static162.anInt3250 != 10) {
							return;
						}
						if (Static275.anInt5055 == 0 && Static305.anInt5413 == 0 && Static10.anInt258 == 0 && Static156.anInt3174 == 0) {
							Static1.method701(Static346.method4767(aStringArray21[anInt3354]), anIntArray298[anInt3355], aStringArray21[anInt3354 + 2], anIntArray298[anInt3355 + 4] == 1, anIntArray298[anInt3355 + 2], anIntArray298[anInt3355 + 3], aStringArray21[anInt3354 + 1], anIntArray298[anInt3355 + 1], anIntArray298[anInt3355 + 5] == 1, anIntArray298[anInt3355 + 6] == 1);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static10.anInt258 == 0) {
							Static3.anInt113 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray298[anInt3355++] = Static378.anInt6415;
						return;
					}
					if (arg0 == 5608) {
						anIntArray298[anInt3355++] = Static316.anInt5474;
						return;
					}
					if (arg0 == 5609) {
						anIntArray298[anInt3355++] = Static3.anInt113;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray21[anInt3354++] = Static92.aStringArray18.length > local157 ? Static329.method4563(Static92.aStringArray18[local157]) : "";
						}
						Static92.aStringArray18 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray298[anInt3355++] = Static362.anInt6210;
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray298[--anInt3355];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static12.aClass79_Sub1_1.anInt4928 = local157;
						Static129.method2211();
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static120.aBoolean204 = false;
						return;
					}
					if (arg0 == 6002) {
						Static12.aClass79_Sub1_1.method3964(anIntArray298[--anInt3355] == 1);
						Static129.method2211();
						Static391.method3870();
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static120.aBoolean204 = false;
						return;
					}
					if (arg0 == 6003) {
						Static12.aClass79_Sub1_1.aBoolean367 = anIntArray298[--anInt3355] == 1;
						Static391.method3870();
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static120.aBoolean204 = false;
						return;
					}
					if (arg0 == 6005) {
						Static12.aClass79_Sub1_1.aBoolean360 = anIntArray298[--anInt3355] == 1;
						Static129.method2211();
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static120.aBoolean204 = false;
						return;
					}
					if (arg0 == 6006) {
						Static12.aClass79_Sub1_1.aBoolean361 = anIntArray298[--anInt3355] == 1;
						Static33.aClass49_1.method4476(!Static12.aClass79_Sub1_1.aBoolean361);
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static120.aBoolean204 = false;
						return;
					}
					if (arg0 == 6007) {
						Static12.aClass79_Sub1_1.anInt4925 = anIntArray298[--anInt3355];
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static120.aBoolean204 = false;
						return;
					}
					if (arg0 == 6008) {
						Static12.aClass79_Sub1_1.aBoolean368 = anIntArray298[--anInt3355] == 1;
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static120.aBoolean204 = false;
						return;
					}
					if (arg0 == 6009) {
						Static12.aClass79_Sub1_1.aBoolean365 = anIntArray298[--anInt3355] == 1;
						Static129.method2211();
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static120.aBoolean204 = false;
						return;
					}
					if (arg0 == 6010) {
						Static12.aClass79_Sub1_1.aBoolean366 = anIntArray298[--anInt3355] == 1;
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static120.aBoolean204 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray298[--anInt3355];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static12.aClass79_Sub1_1.method3958(local157, Static399.anInt6653);
						Static129.method2211();
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static120.aBoolean204 = false;
						return;
					}
					if (arg0 == 6012) {
						Static12.aClass79_Sub1_1.method3956(Static399.anInt6653, anIntArray298[--anInt3355] == 1);
						Static185.method2952();
						Static277.method4067();
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static120.aBoolean204 = false;
						return;
					}
					if (arg0 == 6014) {
						Static12.aClass79_Sub1_1.aBoolean354 = anIntArray298[--anInt3355] == 1;
						Static129.method2211();
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static120.aBoolean204 = false;
						return;
					}
					if (arg0 == 6015) {
						Static12.aClass79_Sub1_1.aBoolean362 = anIntArray298[--anInt3355] == 1;
						Static129.method2211();
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static120.aBoolean204 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray298[--anInt3355];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static12.aClass79_Sub1_1.anInt4930 = local157;
						Static171.method2780(Static399.anInt6653);
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						return;
					}
					if (arg0 == 6017) {
						Static12.aClass79_Sub1_1.aBoolean358 = anIntArray298[--anInt3355] == 1;
						Static2.method71();
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static120.aBoolean204 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray298[--anInt3355];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static12.aClass79_Sub1_1.anInt4920 = local157;
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static120.aBoolean204 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray298[--anInt3355];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static12.aClass79_Sub1_1.anInt4931) {
							if (Static12.aClass79_Sub1_1.anInt4931 == 0 && Static342.anInt5851 != -1) {
								Static59.method1150(Static186.aClass160_34, Static342.anInt5851, local157);
								Static144.aBoolean238 = false;
							} else if (local157 == 0) {
								Static209.method3314();
								Static144.aBoolean238 = false;
							} else {
								Static411.method5406(local157);
							}
							Static12.aClass79_Sub1_1.anInt4931 = local157;
						}
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static120.aBoolean204 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray298[--anInt3355];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static12.aClass79_Sub1_1.anInt4915 = local157;
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static120.aBoolean204 = false;
						return;
					}
					if (arg0 == 6021) {
						Static12.aClass79_Sub1_1.aBoolean369 = anIntArray298[--anInt3355] == 1;
						Static391.method3870();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray298[--anInt3355];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static7.anInt219 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static404.method5328(local157);
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static120.aBoolean204 = false;
						anIntArray298[anInt3355++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray298[--anInt3355];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static12.aClass79_Sub1_1.anInt4927 = local157;
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray298[--anInt3355];
						if (local157 < 0 || local157 > Static184.method2948(Static7.anInt219)) {
							local157 = 0;
						}
						Static12.aClass79_Sub1_1.anInt4929 = local157;
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static120.aBoolean204 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray298[--anInt3355];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static320.method4495(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static12.aClass79_Sub1_1.aBoolean355 = anIntArray298[--anInt3355] != 0;
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						return;
					}
					if (arg0 == 6029) {
						Static12.aClass79_Sub1_1.anInt4925 = anIntArray298[--anInt3355];
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						return;
					}
					if (arg0 == 6030) {
						Static12.aClass79_Sub1_1.aBoolean351 = anIntArray298[--anInt3355] != 0;
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static129.method2211();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray298[--anInt3355];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static171.method2780(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray298[--anInt3355];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static12.aClass79_Sub1_1.anInt4926 = local157;
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static120.aBoolean204 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray298[--anInt3355];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static12.aClass79_Sub1_1.anInt4913 = local157;
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						return;
					}
					if (arg0 == 6034) {
						Static12.aClass79_Sub1_1.aBoolean352 = anIntArray298[--anInt3355] == 1;
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						Static185.method2952();
						Static120.aBoolean204 = false;
						return;
					}
					if (arg0 == 6035) {
						Static12.aClass79_Sub1_1.aBoolean370 = anIntArray298[--anInt3355] == 1;
						Static129.method2211();
						Static391.method3870();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.anInt4928;
						return;
					}
					if (arg0 == 6102) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.method3967(Static399.anInt6653) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.aBoolean367 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.aBoolean360 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.aBoolean361 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.anInt4925;
						return;
					}
					if (arg0 == 6108) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.aBoolean368 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.aBoolean365 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.aBoolean366 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.method3960(Static399.anInt6653);
						return;
					}
					if (arg0 == 6112) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.method3959(Static399.anInt6653) ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.aBoolean354 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.aBoolean362 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.anInt4930;
						return;
					}
					if (arg0 == 6117) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.aBoolean358 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.anInt4920;
						return;
					}
					if (arg0 == 6119) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.anInt4931;
						return;
					}
					if (arg0 == 6120) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.anInt4915;
						return;
					}
					if (arg0 == 6121) {
						anIntArray298[anInt3355++] = Static33.aClass49_1.method4466() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray298[anInt3355++] = Static38.method5045();
						return;
					}
					if (arg0 == 6124) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.anInt4927;
						return;
					}
					if (arg0 == 6125) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.anInt4929;
						return;
					}
					if (arg0 == 6126) {
						anIntArray298[anInt3355++] = Static33.aClass49_1.method4450() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.aBoolean364 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.aBoolean355 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.anInt4925;
						return;
					}
					if (arg0 == 6130) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.aBoolean351 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray298[anInt3355++] = Static399.anInt6653;
						return;
					}
					if (arg0 == 6132) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.anInt4926;
						return;
					}
					if (arg0 == 6133) {
						anIntArray298[anInt3355++] = Static73.anInt1597 == 1 || Static73.anInt1597 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray298[anInt3355++] = Static184.method2948(Static7.anInt219);
						return;
					}
					if (arg0 == 6135) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.anInt4913;
						return;
					}
					if (arg0 == 6136) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.aBoolean352 ? 1 : 0;
						return;
					}
					if (arg0 == 6137) {
						@Pc(5679) boolean local5679 = true;
						try {
							local5679 = jagmisc.getTotalPhysicalMemory() > 268435456L;
						} catch (@Pc(5689) Throwable local5689) {
						}
						anIntArray298[anInt3355++] = local5679 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt3355 -= 2;
						Static248.aShort63 = (short) anIntArray298[anInt3355];
						if (Static248.aShort63 <= 0) {
							Static248.aShort63 = 256;
						}
						Static46.aShort3 = (short) anIntArray298[anInt3355 + 1];
						if (Static46.aShort3 <= 0) {
							Static46.aShort3 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt3355 -= 2;
						Static40.aShort2 = (short) anIntArray298[anInt3355];
						if (Static40.aShort2 <= 0) {
							Static40.aShort2 = 256;
						}
						Static414.aShort94 = (short) anIntArray298[anInt3355 + 1];
						if (Static414.aShort94 <= 0) {
							Static414.aShort94 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt3355 -= 4;
						Static252.aShort64 = (short) anIntArray298[anInt3355];
						if (Static252.aShort64 <= 0) {
							Static252.aShort64 = 1;
						}
						Static435.aShort95 = (short) anIntArray298[anInt3355 + 1];
						if (Static435.aShort95 <= 0) {
							Static435.aShort95 = 32767;
						} else if (Static435.aShort95 < Static252.aShort64) {
							Static435.aShort95 = Static252.aShort64;
						}
						Static67.aShort16 = (short) anIntArray298[anInt3355 + 2];
						if (Static67.aShort16 <= 0) {
							Static67.aShort16 = 1;
						}
						Static172.aShort43 = (short) anIntArray298[anInt3355 + 3];
						if (Static172.aShort43 <= 0) {
							Static172.aShort43 = 32767;
							return;
						}
						if (Static172.aShort43 < Static67.aShort16) {
							Static172.aShort43 = Static67.aShort16;
						}
						return;
					}
					if (arg0 == 6203) {
						Static105.method1940(Static48.aClass68_1.anInt2188, 0, 0, Static48.aClass68_1.anInt2252, false);
						anIntArray298[anInt3355++] = Static26.anInt615;
						anIntArray298[anInt3355++] = Static201.anInt3540;
						return;
					}
					if (arg0 == 6204) {
						anIntArray298[anInt3355++] = Static40.aShort2;
						anIntArray298[anInt3355++] = Static414.aShort94;
						return;
					}
					if (arg0 == 6205) {
						anIntArray298[anInt3355++] = Static248.aShort63;
						anIntArray298[anInt3355++] = Static46.aShort3;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray298[anInt3355++] = (int) (Static21.method458() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray298[anInt3355++] = (int) (Static21.method458() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt3355 -= 3;
						local157 = anIntArray298[anInt3355];
						local192 = anIntArray298[anInt3355 + 1];
						local89 = anIntArray298[anInt3355 + 2];
						aCalendar16.clear();
						aCalendar16.set(11, 12);
						aCalendar16.set(local89, local192, local157);
						anIntArray298[anInt3355++] = (int) (aCalendar16.getTime().getTime() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6303) {
						aCalendar16.clear();
						aCalendar16.setTime(new Date(Static21.method458()));
						anIntArray298[anInt3355++] = aCalendar16.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray298[--anInt3355];
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
						anIntArray298[anInt3355++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray298[anInt3355++] = Static116.method2060() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray298[anInt3355++] = Static257.method3889() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static162.anInt3250 == 10 && Static275.anInt5055 == 0 && Static305.anInt5413 == 0 && Static10.anInt258 == 0) {
							anIntArray298[anInt3355++] = Static117.method2083() == -1 ? 0 : 1;
							return;
						}
						anIntArray298[anInt3355++] = 1;
						return;
					}
					@Pc(6188) Class233 local6188;
					@Pc(6155) Class219_Sub1 local6155;
					if (arg0 == 6501) {
						local6155 = Static131.method2237();
						if (local6155 != null) {
							anIntArray298[anInt3355++] = local6155.anInt6547;
							anIntArray298[anInt3355++] = local6155.anInt6541;
							aStringArray21[anInt3354++] = local6155.aString58;
							local6188 = local6155.method5168();
							anIntArray298[anInt3355++] = local6188.anInt6434;
							aStringArray21[anInt3354++] = local6188.aString57;
							anIntArray298[anInt3355++] = local6155.anInt6535;
							anIntArray298[anInt3355++] = local6155.anInt6543;
							return;
						}
						anIntArray298[anInt3355++] = -1;
						anIntArray298[anInt3355++] = 0;
						aStringArray21[anInt3354++] = "";
						anIntArray298[anInt3355++] = 0;
						aStringArray21[anInt3354++] = "";
						anIntArray298[anInt3355++] = 0;
						anIntArray298[anInt3355++] = 0;
						return;
					}
					if (arg0 == 6502) {
						local6155 = Static96.method1837();
						if (local6155 != null) {
							anIntArray298[anInt3355++] = local6155.anInt6547;
							anIntArray298[anInt3355++] = local6155.anInt6541;
							aStringArray21[anInt3354++] = local6155.aString58;
							local6188 = local6155.method5168();
							anIntArray298[anInt3355++] = local6188.anInt6434;
							aStringArray21[anInt3354++] = local6188.aString57;
							anIntArray298[anInt3355++] = local6155.anInt6535;
							anIntArray298[anInt3355++] = local6155.anInt6543;
							return;
						}
						anIntArray298[anInt3355++] = -1;
						anIntArray298[anInt3355++] = 0;
						aStringArray21[anInt3354++] = "";
						anIntArray298[anInt3355++] = 0;
						aStringArray21[anInt3354++] = "";
						anIntArray298[anInt3355++] = 0;
						anIntArray298[anInt3355++] = 0;
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray298[--anInt3355];
						if (Static162.anInt3250 == 10 && Static275.anInt5055 == 0 && Static305.anInt5413 == 0 && Static10.anInt258 == 0) {
							anIntArray298[anInt3355++] = Static224.method3519(local157) ? 1 : 0;
							return;
						}
						anIntArray298[anInt3355++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static12.aClass79_Sub1_1.anInt4919 = anIntArray298[--anInt3355];
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						return;
					}
					if (arg0 == 6505) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.anInt4919;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray298[--anInt3355];
						@Pc(6504) Class219_Sub1 local6504 = Static334.method4662(local157);
						if (local6504 != null) {
							anIntArray298[anInt3355++] = local6504.anInt6541;
							aStringArray21[anInt3354++] = local6504.aString58;
							@Pc(6528) Class233 local6528 = local6504.method5168();
							anIntArray298[anInt3355++] = local6528.anInt6434;
							aStringArray21[anInt3354++] = local6528.aString57;
							anIntArray298[anInt3355++] = local6504.anInt6535;
							anIntArray298[anInt3355++] = local6504.anInt6543;
							return;
						}
						anIntArray298[anInt3355++] = -1;
						aStringArray21[anInt3354++] = "";
						anIntArray298[anInt3355++] = 0;
						aStringArray21[anInt3354++] = "";
						anIntArray298[anInt3355++] = 0;
						anIntArray298[anInt3355++] = 0;
						return;
					}
					if (arg0 == 6507) {
						anInt3355 -= 4;
						local157 = anIntArray298[anInt3355];
						local1313 = anIntArray298[anInt3355 + 1] == 1;
						local89 = anIntArray298[anInt3355 + 2];
						local1965 = anIntArray298[anInt3355 + 3] == 1;
						Static454.method5862(local89, local157, local1965, local1313);
						return;
					}
					if (arg0 == 6508) {
						Static2.method72();
						return;
					}
					if (arg0 == 6509) {
						if (Static162.anInt3250 != 10) {
							return;
						}
						Static165.aBoolean256 = anIntArray298[--anInt3355] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static12.aClass79_Sub1_1.aBoolean363 = anIntArray298[--anInt3355] == 1;
						Static12.aClass79_Sub1_1.method3969(Static43.aClass59_5);
						return;
					}
					if (arg0 == 6601) {
						anIntArray298[anInt3355++] = Static12.aClass79_Sub1_1.aBoolean363 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static198.aClass258_5 == Static146.aClass258_4) {
					if (arg0 == 6700) {
						local157 = Static113.aClass163_11.method3763();
						if (Static410.anInt6841 != -1) {
							local157++;
						}
						anIntArray298[anInt3355++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray298[--anInt3355];
						if (Static410.anInt6841 != -1) {
							if (local157 == 0) {
								anIntArray298[anInt3355++] = Static410.anInt6841;
								return;
							}
							local157--;
						}
						@Pc(6786) Class2_Sub35 local6786 = (Class2_Sub35) Static113.aClass163_11.method3771();
						while (local157-- > 0) {
							local6786 = (Class2_Sub35) Static113.aClass163_11.method3770();
						}
						anIntArray298[anInt3355++] = local6786.anInt5537;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray298[--anInt3355];
						if (Static60.aClass68ArrayArray1[local157] == null) {
							aStringArray21[anInt3354++] = "";
							return;
						}
						local81 = Static60.aClass68ArrayArray1[local157][0].aString24;
						if (local81 == null) {
							aStringArray21[anInt3354++] = "";
							return;
						}
						aStringArray21[anInt3354++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray298[--anInt3355];
						if (Static60.aClass68ArrayArray1[local157] == null) {
							anIntArray298[anInt3355++] = 0;
							return;
						}
						anIntArray298[anInt3355++] = Static60.aClass68ArrayArray1[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt3355 -= 2;
						local157 = anIntArray298[anInt3355];
						local192 = anIntArray298[anInt3355 + 1];
						if (Static60.aClass68ArrayArray1[local157] == null) {
							aStringArray21[anInt3354++] = "";
							return;
						}
						local3345 = Static60.aClass68ArrayArray1[local157][local192].aString24;
						if (local3345 == null) {
							aStringArray21[anInt3354++] = "";
							return;
						}
						aStringArray21[anInt3354++] = local3345;
						return;
					}
					if (arg0 == 6705) {
						anInt3355 -= 2;
						local157 = anIntArray298[anInt3355];
						local192 = anIntArray298[anInt3355 + 1];
						if (Static60.aClass68ArrayArray1[local157] == null) {
							anIntArray298[anInt3355++] = 0;
							return;
						}
						anIntArray298[anInt3355++] = Static60.aClass68ArrayArray1[local157][local192].anInt2225;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt3355 -= 3;
						local157 = anIntArray298[anInt3355];
						local192 = anIntArray298[anInt3355 + 1];
						local89 = anIntArray298[anInt3355 + 2];
						Static108.method2000(local157 << 16 | local192, "", local89, 1);
						return;
					}
					if (arg0 == 6708) {
						anInt3355 -= 3;
						local157 = anIntArray298[anInt3355];
						local192 = anIntArray298[anInt3355 + 1];
						local89 = anIntArray298[anInt3355 + 2];
						Static108.method2000(local157 << 16 | local192, "", local89, 2);
						return;
					}
					if (arg0 == 6709) {
						anInt3355 -= 3;
						local157 = anIntArray298[anInt3355];
						local192 = anIntArray298[anInt3355 + 1];
						local89 = anIntArray298[anInt3355 + 2];
						Static108.method2000(local157 << 16 | local192, "", local89, 3);
						return;
					}
					if (arg0 == 6710) {
						anInt3355 -= 3;
						local157 = anIntArray298[anInt3355];
						local192 = anIntArray298[anInt3355 + 1];
						local89 = anIntArray298[anInt3355 + 2];
						Static108.method2000(local157 << 16 | local192, "", local89, 4);
						return;
					}
					if (arg0 == 6711) {
						anInt3355 -= 3;
						local157 = anIntArray298[anInt3355];
						local192 = anIntArray298[anInt3355 + 1];
						local89 = anIntArray298[anInt3355 + 2];
						Static108.method2000(local157 << 16 | local192, "", local89, 5);
						return;
					}
					if (arg0 == 6712) {
						anInt3355 -= 3;
						local157 = anIntArray298[anInt3355];
						local192 = anIntArray298[anInt3355 + 1];
						local89 = anIntArray298[anInt3355 + 2];
						Static108.method2000(local157 << 16 | local192, "", local89, 6);
						return;
					}
					if (arg0 == 6713) {
						anInt3355 -= 3;
						local157 = anIntArray298[anInt3355];
						local192 = anIntArray298[anInt3355 + 1];
						local89 = anIntArray298[anInt3355 + 2];
						Static108.method2000(local157 << 16 | local192, "", local89, 7);
						return;
					}
					if (arg0 == 6714) {
						anInt3355 -= 3;
						local157 = anIntArray298[anInt3355];
						local192 = anIntArray298[anInt3355 + 1];
						local89 = anIntArray298[anInt3355 + 2];
						Static108.method2000(local157 << 16 | local192, "", local89, 8);
						return;
					}
					if (arg0 == 6715) {
						anInt3355 -= 3;
						local157 = anIntArray298[anInt3355];
						local192 = anIntArray298[anInt3355 + 1];
						local89 = anIntArray298[anInt3355 + 2];
						Static108.method2000(local157 << 16 | local192, "", local89, 9);
						return;
					}
					if (arg0 == 6716) {
						anInt3355 -= 3;
						local157 = anIntArray298[anInt3355];
						local192 = anIntArray298[anInt3355 + 1];
						local89 = anIntArray298[anInt3355 + 2];
						Static108.method2000(local157 << 16 | local192, "", local89, 10);
						return;
					}
					if (arg0 == 6717) {
						anInt3355 -= 3;
						local157 = anIntArray298[anInt3355];
						local192 = anIntArray298[anInt3355 + 1];
						local89 = anIntArray298[anInt3355 + 2];
						@Pc(7374) Class68 local7374 = Static259.method3899(local89, local157 << 16 | local192);
						Static237.method3667();
						@Pc(7379) Class2_Sub42 local7379 = Static47.method787(local7374);
						Static454.method5861(local7374, local7379.method5400(), local7379.anInt6838);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7407) Class48 local7407;
					if (arg0 == 6800) {
						local157 = anIntArray298[--anInt3355];
						local7407 = Static357.aClass215_4.method4741(local157);
						if (local7407.aString7 == null) {
							aStringArray21[anInt3354++] = "";
							return;
						}
						aStringArray21[anInt3354++] = local7407.aString7;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray298[--anInt3355];
						local7407 = Static357.aClass215_4.method4741(local157);
						anIntArray298[anInt3355++] = local7407.anInt1227;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray298[--anInt3355];
						local7407 = Static357.aClass215_4.method4741(local157);
						anIntArray298[anInt3355++] = local7407.anInt1209;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray298[--anInt3355];
						local7407 = Static357.aClass215_4.method4741(local157);
						anIntArray298[anInt3355++] = local7407.anInt1195;
						return;
					}
					if (arg0 == 6804) {
						anInt3355 -= 2;
						local157 = anIntArray298[anInt3355];
						local192 = anIntArray298[anInt3355 + 1];
						@Pc(7529) Class132 local7529 = Static186.aClass161_1.method3729(local192);
						if (local7529.method2959()) {
							aStringArray21[anInt3354++] = Static357.aClass215_4.method4741(local157).method930(local192, local7529.aString40);
							return;
						}
						anIntArray298[anInt3355++] = Static357.aClass215_4.method4741(local157).method926(local7529.anInt3608, local192);
						return;
					}
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)V")
	public static void method2742(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static16.method318(arg0)) {
			return;
		}
		@Pc(12) Class68[] local12 = Static60.aClass68ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class68 local19 = local12[local14];
			if (local19.anObjectArray10 != null) {
				@Pc(26) Class2_Sub30 local26 = new Class2_Sub30();
				local26.aClass68_12 = local19;
				local26.anObjectArray35 = local19.anObjectArray10;
				method2737(local26, 2000000);
			}
		}
	}
}
