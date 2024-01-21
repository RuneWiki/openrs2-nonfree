import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_77 = Static120.method1824("Mar");

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "[Z")
	public static final boolean[] aBooleanArray2 = new boolean[112];

	@OriginalMember(owner = "client!bb", name = "D", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_78 = Static120.method1824("Unable to find ");

	@OriginalMember(owner = "client!bb", name = "F", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_79 = Static120.method1824("Nov");

	@OriginalMember(owner = "client!bb", name = "kb", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_83 = Static120.method1824("Jan");

	@OriginalMember(owner = "client!bb", name = "ab", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_81 = Static120.method1824("Feb");

	@OriginalMember(owner = "client!bb", name = "Tb", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_91 = Static120.method1824("Apr");

	@OriginalMember(owner = "client!bb", name = "Qb", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_89 = Static120.method1824("May");

	@OriginalMember(owner = "client!bb", name = "rb", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_86 = Static120.method1824("Jun");

	@OriginalMember(owner = "client!bb", name = "X", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_80 = Static120.method1824("Jul");

	@OriginalMember(owner = "client!bb", name = "qb", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_85 = Static120.method1824("Aug");

	@OriginalMember(owner = "client!bb", name = "Jb", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_88 = Static120.method1824("Sep");

	@OriginalMember(owner = "client!bb", name = "Xb", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_92 = Static120.method1824("Oct");

	@OriginalMember(owner = "client!bb", name = "ob", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_84 = Static120.method1824("Dec");

	@OriginalMember(owner = "client!bb", name = "G", descriptor = "[Lclient!rd;")
	public static final Class80[] aClass80Array2 = new Class80[] { aClass80_83, aClass80_81, aClass80_77, aClass80_91, aClass80_89, aClass80_86, aClass80_80, aClass80_85, aClass80_88, aClass80_92, aClass80_79, aClass80_84 };

	@OriginalMember(owner = "client!bb", name = "bb", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_82 = Static120.method1824("Click to switch");

	@OriginalMember(owner = "client!bb", name = "tb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_87 = aClass80_82;

	@OriginalMember(owner = "client!bb", name = "Rb", descriptor = "Lclient!rd;")
	public static Class80 aClass80_90 = aClass80_78;

	@OriginalMember(owner = "client!bb", name = "Wb", descriptor = "I")
	public static int anInt307 = 2;

	@OriginalMember(owner = "client!bb", name = "ac", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_93 = Static120.method1824("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
	public static void method197() {
		Static186.method3014(Static64.aClass77_2);
		Static21.anInt513++;
		if (Static79.aBoolean67 && Static155.aBoolean142) {
			@Pc(34) int local34 = Static190.anInt4379;
			@Pc(36) int local36 = Static3.anInt153;
			local34 -= Static132.anInt2830;
			local36 -= Static100.anInt2097;
			if (Static148.anInt3315 > local34) {
				local34 = Static148.anInt3315;
			}
			@Pc(56) int local56 = Static64.aClass77_2.anInt3218;
			if (local34 + Static64.aClass77_2.anInt3251 > Static23.aClass77_1.anInt3251 + Static148.anInt3315) {
				local34 = Static23.aClass77_1.anInt3251 + Static148.anInt3315 - Static64.aClass77_2.anInt3251;
			}
			if (Static46.anInt1057 > local36) {
				local36 = Static46.anInt1057;
			}
			if (Static23.aClass77_1.anInt3221 + Static46.anInt1057 < Static64.aClass77_2.anInt3221 + local36) {
				local36 = Static46.anInt1057 + Static23.aClass77_1.anInt3221 - Static64.aClass77_2.anInt3221;
			}
			@Pc(113) int local113 = local34 - Static109.anInt2438;
			@Pc(117) int local117 = local36 - Static124.anInt2674;
			if (Static21.anInt513 > Static64.aClass77_2.anInt3265 && (local113 > local56 || local113 < -local56 || local117 > local56 || -local56 > local117)) {
				Static95.aBoolean148 = true;
			}
			@Pc(157) int local157 = Static23.aClass77_1.anInt3222 + local34 - Static148.anInt3315;
			@Pc(165) int local165 = Static23.aClass77_1.anInt3213 + local36 - Static46.anInt1057;
			@Pc(174) Class3_Sub16 local174;
			if (Static64.aClass77_2.anObjectArray22 != null && Static95.aBoolean148) {
				local174 = new Class3_Sub16();
				local174.anObjectArray3 = Static64.aClass77_2.anObjectArray22;
				local174.anInt2193 = local157;
				local174.aClass77_10 = Static64.aClass77_2;
				local174.anInt2197 = local165;
				Static168.method2710(local174);
			}
			if (Static129.anInt2784 == 0) {
				if (Static95.aBoolean148) {
					if (Static64.aClass77_2.anObjectArray6 != null) {
						local174 = new Class3_Sub16();
						local174.anObjectArray3 = Static64.aClass77_2.anObjectArray6;
						local174.anInt2193 = local157;
						local174.anInt2197 = local165;
						local174.aClass77_11 = Static94.aClass77_8;
						local174.aClass77_10 = Static64.aClass77_2;
						Static168.method2710(local174);
					}
					if (Static94.aClass77_8 != null && Static23.method368(Static64.aClass77_2) != null) {
						Static146.aClass3_Sub17_Sub1_3.method2146(197);
						Static146.aClass3_Sub17_Sub1_3.method2092(Static94.aClass77_8.anInt3258);
						Static146.aClass3_Sub17_Sub1_3.method2118(Static64.aClass77_2.anInt3258);
						Static146.aClass3_Sub17_Sub1_3.method2110(Static94.aClass77_8.anInt3237);
						Static146.aClass3_Sub17_Sub1_3.method2131(Static64.aClass77_2.anInt3237);
					}
				} else if ((Static44.anInt1007 == 1 || Static77.method1276(Static173.anInt3892 - 1)) && Static173.anInt3892 > 2) {
					Static144.method2295();
				} else if (Static173.anInt3892 > 0) {
					Static144.method2296(Static173.anInt3892 - 1);
				}
				Static64.aClass77_2 = null;
			}
		} else if (Static21.anInt513 > 1) {
			Static64.aClass77_2 = null;
		}
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(II)Lclient!e;")
	public static Class3_Sub1_Sub6 method202(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub1_Sub6 local10 = (Class3_Sub1_Sub6) Static170.aClass5_54.method139((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static192.method3099(Static46.aClass1_11, arg0, Static93.aClass1_13);
		if (local10 != null) {
			Static170.aClass5_54.method145(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(JI)Lclient!rd;")
	public static Class80 method217(@OriginalArg(0) long arg0) {
		Static187.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static187.aCalendar2.get(7);
		@Pc(17) int local17 = Static187.aCalendar2.get(5);
		@Pc(21) int local21 = Static187.aCalendar2.get(2);
		@Pc(25) int local25 = Static187.aCalendar2.get(1);
		@Pc(29) int local29 = Static187.aCalendar2.get(11);
		@Pc(33) int local33 = Static187.aCalendar2.get(12);
		@Pc(37) int local37 = Static187.aCalendar2.get(13);
		return Static154.method2467(new Class80[] { Static160.aClass80Array26[local13 - 1], Static155.aClass80_1347, Static83.method1219(local17 / 10), Static83.method1219(local17 % 10), Static111.aClass80_987, Static148.aClass80Array24[local21], Static111.aClass80_987, Static83.method1219(local25), Static14.aClass80_98, Static83.method1219(local29 / 10), Static83.method1219(local29 % 10), Static130.aClass80_1114, Static83.method1219(local33 / 10), Static83.method1219(local33 % 10), Static130.aClass80_1114, Static83.method1219(local37 / 10), Static83.method1219(local37 % 10), Static139.aClass80_1168 });
	}

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(III)J")
	public static long method218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class3_Sub15 local7 = Static185.aClass3_Sub15ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass51_1 == null ? 0L : local7.aClass51_1.aLong69;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IB)V")
	public static void method219(@OriginalArg(0) int arg0) {
		if (Static188.method3068(arg0)) {
			Static35.method1228(Static57.aClass77ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIII)V")
	public static void method226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static168.method2708(arg0);
		@Pc(12) int local12 = 0;
		@Pc(17) int local17 = arg0 - arg4;
		@Pc(25) int local25 = arg0;
		if (local17 < 0) {
			local17 = 0;
		}
		@Pc(34) int local34 = local17;
		@Pc(37) int local37 = -local17;
		@Pc(40) int local40 = -arg0;
		@Pc(42) int local42 = -1;
		@Pc(46) int[] local46 = Static96.anIntArrayArray27[arg1];
		@Pc(48) int local48 = -1;
		@Pc(53) int local53 = arg3 - local17;
		@Pc(57) int local57 = local17 + arg3;
		Static46.method726(arg3 - arg0, arg2, local46, local53);
		Static46.method726(local53, arg5, local46, local57);
		Static46.method726(local57, arg2, local46, arg0 + arg3);
		while (local12 < local25) {
			local42 += 2;
			local40 += local42;
			local48 += 2;
			local37 += local48;
			if (local37 >= 0 && local34 >= 1) {
				Static188.anIntArray514[local34] = local12;
				local34--;
				local37 -= local34 << 1;
			}
			local12++;
			@Pc(130) int[] local130;
			@Pc(137) int[] local137;
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(183) int local183;
			@Pc(187) int local187;
			@Pc(195) int local195;
			if (local40 >= 0) {
				local25--;
				local40 -= local25 << 1;
				if (local25 >= local17) {
					local130 = Static96.anIntArrayArray27[local25 + arg1];
					local137 = Static96.anIntArrayArray27[arg1 - local25];
					local141 = arg3 + local12;
					local146 = arg3 - local12;
					Static46.method726(local146, arg2, local130, local141);
					Static46.method726(local146, arg2, local137, local141);
				} else {
					local130 = Static96.anIntArrayArray27[arg1 + local25];
					local137 = Static96.anIntArrayArray27[arg1 - local25];
					local141 = Static188.anIntArray514[local25];
					local183 = arg3 - local12;
					local187 = local141 + arg3;
					local146 = local12 + arg3;
					local195 = arg3 - local141;
					Static46.method726(local183, arg2, local130, local195);
					Static46.method726(local195, arg5, local130, local187);
					Static46.method726(local187, arg2, local130, local146);
					Static46.method726(local183, arg2, local137, local195);
					Static46.method726(local195, arg5, local137, local187);
					Static46.method726(local187, arg2, local137, local146);
				}
			}
			local130 = Static96.anIntArrayArray27[local12 + arg1];
			local137 = Static96.anIntArrayArray27[arg1 - local12];
			local146 = arg3 - local25;
			local141 = arg3 + local25;
			if (local17 <= local12) {
				Static46.method726(local146, arg2, local130, local141);
				Static46.method726(local146, arg2, local137, local141);
			} else {
				local183 = local12 <= local34 ? local34 : Static188.anIntArray514[local12];
				local187 = local183 + arg3;
				local195 = arg3 - local183;
				Static46.method726(local146, arg2, local130, local195);
				Static46.method726(local195, arg5, local130, local187);
				Static46.method726(local187, arg2, local130, local141);
				Static46.method726(local146, arg2, local137, local195);
				Static46.method726(local195, arg5, local137, local187);
				Static46.method726(local187, arg2, local137, local141);
			}
		}
	}
}
