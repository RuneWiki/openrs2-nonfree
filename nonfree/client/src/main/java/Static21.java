import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!c", name = "C", descriptor = "I")
	public static int anInt4633;

	@OriginalMember(owner = "client!c", name = "G", descriptor = "[Lclient!lj;")
	public static Class60[] aClass60Array49;

	@OriginalMember(owner = "client!c", name = "I", descriptor = "I")
	public static int anInt4636;

	@OriginalMember(owner = "client!c", name = "u", descriptor = "Lclient!i;")
	public static Class41 aClass41_1243 = Static184.method2923("Benutzen");

	@OriginalMember(owner = "client!c", name = "B", descriptor = "Lclient!i;")
	public static Class41 aClass41_1244 = Static184.method2923("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!c", name = "E", descriptor = "[Lclient!i;")
	public static Class41[] aClass41Array71 = new Class41[200];

	@OriginalMember(owner = "client!c", name = "a", descriptor = "([BI)[B")
	public static byte[] method3202(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class2_Sub3 local4 = new Class2_Sub3(arg0);
		@Pc(8) int local8 = local4.method209();
		@Pc(12) int local12 = local4.method185();
		if (local12 < 0 || Static144.anInt3299 != 0 && local12 > Static144.anInt3299) {
			throw new RuntimeException();
		} else if (local8 == 0) {
			@Pc(42) byte[] local42 = new byte[local12];
			local4.method169(local12, local42);
			return local42;
		} else {
			@Pc(54) int local54 = local4.method185();
			if (local54 < 0 || Static144.anInt3299 != 0 && Static144.anInt3299 < local54) {
				throw new RuntimeException();
			}
			@Pc(71) byte[] local71 = new byte[local54];
			if (local8 == 1) {
				Static190.method3011(local71, local54, arg0, local12);
			} else {
				Static138.aClass33_1.method1055(local4, local71);
			}
			return local71;
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method3206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!c", name = "b", descriptor = "(IIIIIIII)V")
	public static void method3210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = 0;
		@Pc(13) int local13 = arg6 - arg1;
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = arg6 * arg6;
		@Pc(23) int local23 = arg2 * arg2;
		@Pc(27) int local27 = local13 * local13;
		@Pc(31) int local31 = arg2 - arg1;
		@Pc(35) int local35 = local31 * local31;
		@Pc(39) int local39 = local19 << 1;
		@Pc(43) int local43 = local23 << 1;
		@Pc(47) int local47 = local35 << 1;
		@Pc(51) int local51 = local27 << 1;
		@Pc(55) int local55 = arg2 << 1;
		@Pc(59) int local59 = local31 << 1;
		@Pc(67) int local67 = local23 - local39 * (local55 - 1);
		@Pc(76) int local76 = local43 + local19 * (1 - local55);
		@Pc(88) int local88 = local23 << 2;
		@Pc(92) int local92 = local19 << 2;
		@Pc(101) int local101 = local47 + (1 - local59) * local27;
		@Pc(105) int local105 = local35 << 2;
		@Pc(111) int local111 = (local55 - 3) * local39;
		@Pc(115) int local115 = local27 << 2;
		@Pc(124) int local124 = local35 - (local59 - 1) * local51;
		@Pc(128) int local128 = local43 * 3;
		@Pc(132) int local132 = local47 * 3;
		@Pc(138) int local138 = (arg2 - 1) * local92;
		@Pc(144) int local144 = (local59 - 3) * local51;
		@Pc(150) int local150 = (local31 - 1) * local115;
		@Pc(154) int[] local154 = Static3.anIntArrayArray1[arg5];
		@Pc(156) int local156 = local88;
		@Pc(158) int local158 = local105;
		Static204.method3147(arg0 - arg6, arg4, arg0 - local13, local154);
		Static204.method3147(arg0 - local13, arg3, local13 + arg0, local154);
		Static204.method3147(local13 + arg0, arg4, arg0 + arg6, local154);
		while (local7 > 0) {
			if (local76 < 0) {
				while (local76 < 0) {
					local76 += local128;
					local128 += local88;
					local15++;
					local67 += local156;
					local156 += local88;
				}
			}
			@Pc(225) boolean local225 = local7 <= local31;
			if (local225) {
				if (local101 < 0) {
					while (local101 < 0) {
						local9++;
						local124 += local158;
						local158 += local105;
						local101 += local132;
						local132 += local105;
					}
				}
				if (local124 < 0) {
					local9++;
					local101 += local132;
					local132 += local105;
					local124 += local158;
					local158 += local105;
				}
				local101 += -local150;
				local124 += -local144;
				local144 -= local115;
				local150 -= local115;
			}
			if (local67 < 0) {
				local76 += local128;
				local128 += local88;
				local15++;
				local67 += local156;
				local156 += local88;
			}
			local76 += -local138;
			local138 -= local92;
			local67 += -local111;
			local7--;
			@Pc(334) int local334 = local15 + arg0;
			@Pc(338) int local338 = arg5 - local7;
			local111 -= local92;
			@Pc(346) int local346 = local7 + arg5;
			@Pc(351) int local351 = arg0 - local15;
			if (local225) {
				@Pc(376) int local376 = arg0 + local9;
				@Pc(381) int local381 = arg0 - local9;
				Static204.method3147(local351, arg4, local381, Static3.anIntArrayArray1[local338]);
				Static204.method3147(local381, arg3, local376, Static3.anIntArrayArray1[local338]);
				Static204.method3147(local376, arg4, local334, Static3.anIntArrayArray1[local338]);
				Static204.method3147(local351, arg4, local381, Static3.anIntArrayArray1[local346]);
				Static204.method3147(local381, arg3, local376, Static3.anIntArrayArray1[local346]);
				Static204.method3147(local376, arg4, local334, Static3.anIntArrayArray1[local346]);
			} else {
				Static204.method3147(local351, arg4, local334, Static3.anIntArrayArray1[local338]);
				Static204.method3147(local351, arg4, local334, Static3.anIntArrayArray1[local346]);
			}
		}
	}
}
