import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!th", name = "a", descriptor = "I")
	public static int anInt3753;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "Lclient!wa;")
	public static Class23 aClass23_69;

	@OriginalMember(owner = "client!th", name = "h", descriptor = "Lclient!wa;")
	public static Class23 aClass23_70;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "I")
	public static int anInt3754 = 0;

	@OriginalMember(owner = "client!th", name = "c", descriptor = "B")
	public static byte aByte12 = 0;

	@OriginalMember(owner = "client!th", name = "g", descriptor = "I")
	public static int anInt3757 = 0;

	@OriginalMember(owner = "client!th", name = "j", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1380 = Static161.method2452("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!th", name = "k", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1381 = Static161.method2452("<col=ffff00>*V");

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(14) int local14 = arg3 - arg6;
		@Pc(24) int local24 = arg1 - arg6;
		@Pc(28) int local28 = arg3 * arg3;
		@Pc(30) int local30 = 0;
		@Pc(34) int local34 = local14 * local14;
		@Pc(38) int local38 = arg1 * arg1;
		@Pc(42) int local42 = local24 * local24;
		@Pc(46) int local46 = local38 << 1;
		@Pc(50) int local50 = local28 << 1;
		@Pc(54) int local54 = local42 << 1;
		@Pc(58) int local58 = arg1 << 1;
		@Pc(62) int local62 = local34 << 1;
		@Pc(70) int local70 = local38 - (local58 - 1) * local50;
		@Pc(74) int local74 = local24 << 1;
		@Pc(83) int local83 = local28 * (1 - local58) + local46;
		@Pc(92) int local92 = local54 + local34 * (1 - local74);
		@Pc(101) int local101 = local42 - (local74 - 1) * local62;
		@Pc(105) int local105 = local28 << 2;
		@Pc(109) int local109 = local38 << 2;
		@Pc(113) int local113 = local34 << 2;
		@Pc(117) int local117 = local46 * 3;
		@Pc(121) int local121 = local42 << 2;
		@Pc(127) int local127 = (local58 - 3) * local50;
		@Pc(131) int local131 = local54 * 3;
		@Pc(133) int local133 = local109;
		@Pc(139) int local139 = local62 * (local74 - 3);
		@Pc(145) int local145 = local105 * (arg1 - 1);
		@Pc(151) int local151 = (local24 - 1) * local113;
		@Pc(153) int local153 = local121;
		@Pc(176) int local176;
		@Pc(186) int local186;
		@Pc(195) int local195;
		@Pc(203) int local203;
		if (arg0 >= Static173.anInt3464 && Static174.anInt3493 >= arg0) {
			@Pc(167) int[] local167 = Static9.anIntArrayArray1[arg0];
			local176 = Static171.method2627(Static27.anInt493, arg5 - arg3, Static72.anInt1572);
			local186 = Static171.method2627(Static27.anInt493, arg3 + arg5, Static72.anInt1572);
			local195 = Static171.method2627(Static27.anInt493, arg5 - local14, Static72.anInt1572);
			local203 = Static171.method2627(Static27.anInt493, arg5 + local14, Static72.anInt1572);
			Static27.method409(local195, arg4, local167, local176);
			Static27.method409(local203, arg2, local167, local195);
			Static27.method409(local186, arg4, local167, local203);
		}
		while (local9 > 0) {
			if (local83 < 0) {
				while (local83 < 0) {
					local83 += local117;
					local70 += local133;
					local133 += local109;
					local3++;
					local117 += local109;
				}
			}
			if (local70 < 0) {
				local70 += local133;
				local133 += local109;
				local83 += local117;
				local3++;
				local117 += local109;
			}
			local70 += -local127;
			local83 += -local145;
			@Pc(292) boolean local292 = local24 >= local9;
			local9--;
			local145 -= local105;
			local176 = arg0 - local9;
			local127 -= local105;
			if (local292) {
				if (local92 < 0) {
					while (local92 < 0) {
						local30++;
						local92 += local131;
						local101 += local153;
						local131 += local121;
						local153 += local121;
					}
				}
				if (local101 < 0) {
					local30++;
					local101 += local153;
					local153 += local121;
					local92 += local131;
					local131 += local121;
				}
				local92 += -local151;
				local101 += -local139;
				local151 -= local113;
				local139 -= local113;
			}
			local186 = local9 + arg0;
			if (Static173.anInt3464 <= local186 && Static174.anInt3493 >= local176) {
				local195 = Static171.method2627(Static27.anInt493, local3 + arg5, Static72.anInt1572);
				local203 = Static171.method2627(Static27.anInt493, arg5 - local3, Static72.anInt1572);
				if (local292) {
					@Pc(452) int local452 = Static171.method2627(Static27.anInt493, local30 + arg5, Static72.anInt1572);
					@Pc(461) int local461 = Static171.method2627(Static27.anInt493, arg5 - local30, Static72.anInt1572);
					@Pc(472) int[] local472;
					if (Static173.anInt3464 <= local176) {
						local472 = Static9.anIntArrayArray1[local176];
						Static27.method409(local461, arg4, local472, local203);
						Static27.method409(local452, arg2, local472, local461);
						Static27.method409(local195, arg4, local472, local452);
					}
					if (local186 <= Static174.anInt3493) {
						local472 = Static9.anIntArrayArray1[local186];
						Static27.method409(local461, arg4, local472, local203);
						Static27.method409(local452, arg2, local472, local461);
						Static27.method409(local195, arg4, local472, local452);
					}
				} else {
					if (Static173.anInt3464 <= local176) {
						Static27.method409(local195, arg4, Static9.anIntArrayArray1[local176], local203);
					}
					if (Static174.anInt3493 >= local186) {
						Static27.method409(local195, arg4, Static9.anIntArrayArray1[local186], local203);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IILclient!dc;Lclient!dc;)V")
	public static void method2824(@OriginalArg(0) int arg0, @OriginalArg(2) Class20 arg1, @OriginalArg(3) Class20 arg2) {
		Static177.method2680(arg0, -1, arg1, null, arg2);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BI)I")
	public static int method2826(@OriginalArg(1) int arg0) {
		return arg0 >> 17 & 0x7;
	}
}
