import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!dc", name = "D", descriptor = "Lclient!pa;")
	public static Class5_Sub14 aClass5_Sub14_1;

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "[I")
	public static int[] anIntArray124 = new int[500];

	@OriginalMember(owner = "client!dc", name = "G", descriptor = "Lclient!r;")
	private static Class61 aClass61_212 = Static129.method2060("Enter your username (V password)3");

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "Lclient!r;")
	public static Class61 aClass61_210 = aClass61_212;

	@OriginalMember(owner = "client!dc", name = "H", descriptor = "Lclient!r;")
	private static Class61 aClass61_213 = Static129.method2060("Location");

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "Lclient!r;")
	public static Class61 aClass61_211 = aClass61_213;

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "Lclient!ef;")
	public static Class20 aClass20_2 = new Class20(4096);

	@OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
	public static int anInt715 = -1;

	@OriginalMember(owner = "client!dc", name = "F", descriptor = "[I")
	public static int[] anIntArray125 = new int[25];

	@OriginalMember(owner = "client!dc", name = "N", descriptor = "Lclient!r;")
	private static Class61 aClass61_214 = Static129.method2060(" is already on your ignore list)3");

	@OriginalMember(owner = "client!dc", name = "O", descriptor = "Lclient!r;")
	public static Class61 aClass61_215 = Static129.method2060("Benutzername: ");

	@OriginalMember(owner = "client!dc", name = "P", descriptor = "Lclient!r;")
	public static Class61 aClass61_216 = aClass61_214;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIII)V")
	public static void method493(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 1 || arg6 < 1 || arg0 > 102 || arg6 > 102) {
			return;
		}
		if (Static61.aBoolean57 && arg3 != Static93.anInt2428) {
			return;
		}
		@Pc(35) int local35 = 0;
		if (arg5 == 0) {
			local35 = Static61.aClass81_1.method2093(arg3, arg0, arg6);
		}
		if (arg5 == 1) {
			local35 = Static61.aClass81_1.method2110(arg3, arg0, arg6);
		}
		if (arg5 == 2) {
			local35 = Static61.aClass81_1.method2118(arg3, arg0, arg6);
		}
		if (arg5 == 3) {
			local35 = Static61.aClass81_1.method2080(arg3, arg0, arg6);
		}
		@Pc(92) int local92;
		if (local35 != 0) {
			local92 = Static61.aClass81_1.method2071(arg3, arg0, arg6, local35);
			@Pc(96) int local96 = local92 & 0x1F;
			@Pc(102) int local102 = local92 >> 6 & 0x3;
			@Pc(108) int local108 = local35 >> 14 & 0x7FFF;
			@Pc(122) Class5_Sub2_Sub16 local122;
			if (arg5 == 0) {
				Static61.aClass81_1.method2113(arg3, arg0, arg6);
				local122 = Static43.method767(local108);
				if (local122.anInt3133 != 0) {
					Static103.aClass66Array1[arg3].method1806(arg0, local122.aBoolean111, local102, local96, arg6);
				}
			}
			if (arg5 == 1) {
				Static61.aClass81_1.method2104(arg3, arg0, arg6);
			}
			if (arg5 == 2) {
				Static61.aClass81_1.method2076(arg3, arg0, arg6);
				local122 = Static43.method767(local108);
				if (local122.anInt3120 + arg0 > 103 || arg6 + local122.anInt3120 > 103 || local122.anInt3126 + arg0 > 103 || local122.anInt3126 + arg6 > 103) {
					return;
				}
				if (local122.anInt3133 != 0) {
					Static103.aClass66Array1[arg3].method1802(local122.aBoolean111, arg0, local102, arg6, local122.anInt3120, local122.anInt3126);
				}
			}
			if (arg5 == 3) {
				Static61.aClass81_1.method2112(arg3, arg0, arg6);
				local122 = Static43.method767(local108);
				if (local122.anInt3133 == 1) {
					Static103.aClass66Array1[arg3].method1807(arg6, arg0);
				}
			}
		}
		if (arg2 < 0) {
			return;
		}
		local92 = arg3;
		if (arg3 < 3 && (Static30.aByteArrayArrayArray2[1][arg0][arg6] & 0x2) == 2) {
			local92 = arg3 + 1;
		}
		Static1.method6(Static61.aClass81_1, arg1, Static103.aClass66Array1[arg3], arg2, arg3, local92, arg0, arg4, arg6);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIII)V")
	public static void method494(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static126.aClass5_Sub2_Sub1_Sub3Array38[0].method1354(arg2, arg0);
		Static126.aClass5_Sub2_Sub1_Sub3Array38[1].method1354(arg2, arg0 + arg4 - 16);
		@Pc(35) int local35 = arg4 * (arg4 - 32) / arg3;
		if (local35 < 8) {
			local35 = 8;
		}
		@Pc(53) int local53 = arg1 * (arg4 - local35 - 32) / (arg3 - arg4);
		Static46.method2001(arg2, arg0 + 16, 16, arg4 - 32, Static102.anInt2697);
		Static46.method2001(arg2, local53 + arg0 + 16, 16, local35, Static20.anInt637);
		Static46.method1996(arg2, local53 + arg0 + 16, local35, Static127.anInt3200);
		Static46.method1996(arg2 + 1, arg0 + 16 + local53, local35, Static127.anInt3200);
		Static46.method2005(arg2, arg0 + local53 + 16, 16, Static127.anInt3200);
		Static46.method2005(arg2, arg0 + local53 + 17, 16, Static127.anInt3200);
		Static46.method1996(arg2 + 15, arg0 - (-16 - local53), local35, Static13.anInt368);
		Static46.method1996(arg2 + 14, local53 + 17 + arg0, local35 - 1, Static13.anInt368);
		Static46.method2005(arg2, local35 + local53 + arg0 + 15, 16, Static13.anInt368);
		Static46.method2005(arg2 + 1, local35 + local53 + 14 + arg0, 15, Static13.anInt368);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZZ)V")
	public static void method495(@OriginalArg(1) boolean arg0) {
		for (@Pc(8) int local8 = 0; local8 < Static100.anInt2607; local8++) {
			@Pc(19) int local19 = (Static61.anIntArray225[local8] << 14) + 536870912;
			@Pc(25) Class5_Sub2_Sub2_Sub3_Sub1 local25 = Static67.aClass5_Sub2_Sub2_Sub3_Sub1Array1[Static61.anIntArray225[local8]];
			if (local25 != null && local25.method1855() && local25.aClass5_Sub2_Sub12_1.aBoolean88 == arg0 && local25.aClass5_Sub2_Sub12_1.method1633()) {
				@Pc(50) int local50 = local25.anInt2912 >> 7;
				@Pc(55) int local55 = local25.anInt2875 >> 7;
				if (local50 >= 0 && local50 < 104 && local55 >= 0 && local55 < 104) {
					if (local25.anInt2892 == 1 && (local25.anInt2912 & 0x7F) == 64 && (local25.anInt2875 & 0x7F) == 64) {
						if (Static134.anInt3404 == Static45.anIntArrayArray11[local50][local55]) {
							continue;
						}
						Static45.anIntArrayArray11[local50][local55] = Static134.anInt3404;
					}
					if (!local25.aClass5_Sub2_Sub12_1.aBoolean91) {
						local19 += Integer.MIN_VALUE;
					}
					Static61.aClass81_1.method2115(Static93.anInt2428, local25.anInt2912, local25.anInt2875, Static42.method757(Static93.anInt2428, (local25.anInt2892 - 1) * 64 + local25.anInt2912, local25.anInt2875 - 64 - -(local25.anInt2892 * 64)), (local25.anInt2892 - 1) * 64 + 60, local25, local25.anInt2919, local19, local25.aBoolean101);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)V")
	public static void method496() {
		Static20.aByteArrayArrayArray1 = null;
		Static125.anIntArray379 = null;
		Static32.anIntArray155 = null;
		Static126.anIntArray382 = null;
		Static61.anIntArrayArrayArray2 = null;
		Static109.aByteArrayArrayArray7 = null;
		Static50.anIntArrayArray12 = null;
		Static48.aByteArrayArrayArray3 = null;
		Static70.anIntArray253 = null;
		Static79.aByteArrayArrayArray5 = null;
		Static75.aByteArrayArrayArray4 = null;
		Static129.anIntArray394 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
	public static void method497() {
		if (Static115.aClass5_Sub11_13 != null || Static86.aClass5_Sub11_8 != null) {
			return;
		}
		@Pc(19) int local19 = Static75.anInt1772;
		@Pc(35) int local35;
		@Pc(89) int local89;
		@Pc(95) int local95;
		if (Static117.aBoolean105) {
			if (local19 != 1) {
				local35 = Static30.anInt917;
				local89 = Static40.anInt1073;
				if (local35 < Static117.anInt3014 - 10 || Static127.anInt3201 + Static117.anInt3014 + 10 < local35 || Static81.anInt3355 - 10 > local89 || local89 > Static81.anInt3355 + Static64.anInt2727 + 10) {
					Static117.aBoolean105 = false;
					Static103.method1744(Static117.anInt3014, Static127.anInt3201, Static64.anInt2727, Static81.anInt3355);
				}
			}
			if (local19 != 1) {
				return;
			}
			local95 = Static127.anInt3201;
			local89 = Static81.anInt3355;
			local35 = Static117.anInt3014;
			@Pc(241) int local241 = Static26.anInt613;
			@Pc(243) int local243 = Static12.anInt308;
			@Pc(245) int local245 = -1;
			for (@Pc(247) int local247 = 0; local247 < Static36.anInt1015; local247++) {
				@Pc(261) int local261 = local89 + (Static36.anInt1015 - local247 + -1) * 15 + 31;
				if (local35 < local241 && local95 + local35 > local241 && local261 - 13 < local243 && local243 < local261 + 3) {
					local245 = local247;
				}
			}
			if (local245 != -1) {
				Static20.method458(local245);
			}
			Static117.aBoolean105 = false;
			Static103.method1744(Static117.anInt3014, Static127.anInt3201, Static64.anInt2727, Static81.anInt3355);
			return;
		}
		if (local19 == 1 && Static36.anInt1015 > 0) {
			local35 = Static38.anIntArray223[Static36.anInt1015 - 1];
			if (local35 == 4 || local35 == 44 || local35 == 42 || local35 == 58 || local35 == 28 || local35 == 45 || local35 == 23 || local35 == 16 || local35 == 40 || local35 == 7 || local35 == 18 || local35 == 1002) {
				local89 = Static76.anIntArray266[Static36.anInt1015 - 1];
				local95 = anIntArray124[Static36.anInt1015 - 1];
				@Pc(99) Class5_Sub11 local99 = Static88.method2191(local95);
				if (Static40.method741(Static42.method755(local99)) || Static119.method1896(Static42.method755(local99))) {
					Static83.aBoolean79 = false;
					Static28.anInt894 = 0;
					if (Static115.aClass5_Sub11_13 != null) {
						Static24.method505(Static115.aClass5_Sub11_13);
					}
					Static115.aClass5_Sub11_13 = Static88.method2191(local95);
					Static73.anInt1745 = Static26.anInt613;
					Static80.anInt2052 = local89;
					Static12.anInt323 = Static12.anInt308;
					Static24.method505(Static115.aClass5_Sub11_13);
					return;
				}
			}
		}
		if (local19 == 1 && (Static125.anInt3132 == 1 && Static36.anInt1015 > 2 || Static83.method1501(Static36.anInt1015 - 1))) {
			local19 = 2;
		}
		if (local19 == 1 && Static36.anInt1015 > 0) {
			Static20.method458(Static36.anInt1015 - 1);
		}
		if (local19 == 2 && Static36.anInt1015 > 0) {
			Static10.method191();
			return;
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public static void method498() {
		anIntArray125 = null;
		aClass61_212 = null;
		aClass5_Sub14_1 = null;
		aClass61_216 = null;
		anIntArray124 = null;
		aClass61_210 = null;
		aClass61_214 = null;
		aClass61_213 = null;
		aClass61_211 = null;
		aClass61_215 = null;
		aClass20_2 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!r;Lclient!ff;Lclient!r;B)[Lclient!n;")
	public static Class5_Sub2_Sub1_Sub3[] method499(@OriginalArg(0) Class61 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class61 arg2) {
		@Pc(13) int local13 = arg1.method1044(arg2);
		@Pc(19) int local19 = arg1.method1039(arg0, local13);
		return Static78.method1281(local13, local19, arg1);
	}
}
