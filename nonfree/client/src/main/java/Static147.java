import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!jg", name = "C", descriptor = "Lclient!as;")
	public static Class13 aClass13_3;

	@OriginalMember(owner = "client!jg", name = "D", descriptor = "[Lclient!br;")
	public static Class21[] aClass21Array2;

	@OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
	public static int anInt3295;

	@OriginalMember(owner = "client!jg", name = "L", descriptor = "I")
	public static int anInt3292 = -60;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZLclient!mb;)Z")
	public static boolean method2992(@OriginalArg(1) Interface7 arg0) {
		@Pc(9) Class18 local9 = Static113.method2380(arg0.method5594());
		if (local9.anInt525 == -1) {
			return true;
		} else {
			@Pc(20) Class3 local20 = Static266.method4597(local9.anInt525);
			return local20.anInt50 == -1 ? true : local20.method46();
		}
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(Z)V")
	public static void method2993() {
		if (Static7.anIntArray5 != null && Static232.anIntArray392 != null) {
			return;
		}
		Static7.anIntArray5 = new int[256];
		Static232.anIntArray392 = new int[256];
		for (@Pc(31) int local31 = 0; local31 < 256; local31++) {
			@Pc(40) double local40 = (double) local31 / 255.0D * 6.283185307179586D;
			Static7.anIntArray5[local31] = (int) (Math.sin(local40) * 4096.0D);
			Static232.anIntArray392[local31] = (int) (Math.cos(local40) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ZII)I")
	public static int method2996(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(22) int local22 = (arg0 & 0x7F) * 96 >> 7;
		if (local22 < 2) {
			local22 = 2;
		} else if (local22 > 126) {
			local22 = 126;
		}
		return local22 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method2998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg1 && arg3 == arg0 && arg6 == arg2 && arg7 == arg4) {
			Static8.method190(arg0, arg5, arg7, arg1, arg6);
			return;
		}
		@Pc(44) int local44 = arg1;
		@Pc(46) int local46 = arg0;
		@Pc(50) int local50 = arg1 * 3;
		@Pc(54) int local54 = arg0 * 3;
		@Pc(58) int local58 = arg8 * 3;
		@Pc(62) int local62 = arg3 * 3;
		@Pc(66) int local66 = arg2 * 3;
		@Pc(70) int local70 = arg4 * 3;
		@Pc(80) int local80 = local58 + arg6 - local66 - arg1;
		@Pc(90) int local90 = arg7 + local62 - arg0 - local70;
		@Pc(99) int local99 = local66 + local50 - local58 - local58;
		@Pc(109) int local109 = local54 + local70 - local62 - local62;
		@Pc(114) int local114 = local58 - local50;
		@Pc(119) int local119 = local62 - local54;
		for (@Pc(121) int local121 = 128; local121 <= 4096; local121 += 128) {
			@Pc(129) int local129 = local121 * local121 >> 12;
			@Pc(135) int local135 = local121 * local129 >> 12;
			@Pc(139) int local139 = local135 * local80;
			@Pc(143) int local143 = local135 * local90;
			@Pc(147) int local147 = local129 * local99;
			@Pc(151) int local151 = local129 * local109;
			@Pc(155) int local155 = local121 * local114;
			@Pc(159) int local159 = local121 * local119;
			@Pc(169) int local169 = (local155 + local139 + local147 >> 12) + arg1;
			@Pc(179) int local179 = (local159 + local151 + local143 >> 12) + arg0;
			Static8.method190(local46, arg5, local179, local44, local169);
			local46 = local179;
			local44 = local169;
		}
	}
}
