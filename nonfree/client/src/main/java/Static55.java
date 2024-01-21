import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!l", name = "V", descriptor = "I")
	public static int anInt1621;

	@OriginalMember(owner = "client!l", name = "W", descriptor = "I")
	public static int anInt1622;

	@OriginalMember(owner = "client!l", name = "X", descriptor = "[I")
	public static int[] anIntArray237;

	@OriginalMember(owner = "client!l", name = "R", descriptor = "I")
	public static int anInt1617 = 0;

	@OriginalMember(owner = "client!l", name = "S", descriptor = "I")
	public static int anInt1618 = 0;

	@OriginalMember(owner = "client!l", name = "T", descriptor = "I")
	public static int anInt1619 = 0;

	@OriginalMember(owner = "client!l", name = "U", descriptor = "I")
	public static int anInt1620 = 0;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIII)V")
	public static void method1129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt1617) {
			arg2 -= anInt1617 - arg0;
			arg0 = anInt1617;
		}
		if (arg1 < anInt1618) {
			arg3 -= anInt1618 - arg1;
			arg1 = anInt1618;
		}
		if (arg0 + arg2 > anInt1620) {
			arg2 = anInt1620 - arg0;
		}
		if (arg1 + arg3 > anInt1619) {
			arg3 = anInt1619 - arg1;
		}
		@Pc(43) int local43 = anInt1622 - arg2;
		@Pc(49) int local49 = arg0 + arg1 * anInt1622;
		for (@Pc(52) int local52 = -arg3; local52 < 0; local52++) {
			for (@Pc(56) int local56 = -arg2; local56 < 0; local56++) {
				anIntArray237[local49++] = arg4;
			}
			local49 += local43;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V")
	public static void method1130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > anInt1622) {
			arg2 = anInt1622;
		}
		if (arg3 > anInt1621) {
			arg3 = anInt1621;
		}
		anInt1617 = arg0;
		anInt1618 = arg1;
		anInt1620 = arg2;
		anInt1619 = arg3;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIII)V")
	public static void method1131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < anInt1617) {
			arg2 -= anInt1617 - arg0;
			arg0 = anInt1617;
		}
		if (arg1 < anInt1618) {
			arg3 -= anInt1618 - arg1;
			arg1 = anInt1618;
		}
		if (arg0 + arg2 > anInt1620) {
			arg2 = anInt1620 - arg0;
		}
		if (arg1 + arg3 > anInt1619) {
			arg3 = anInt1619 - arg1;
		}
		@Pc(43) int local43 = 256 - arg5;
		@Pc(51) int local51 = (arg4 >> 16 & 0xFF) * arg5;
		@Pc(59) int local59 = (arg4 >> 8 & 0xFF) * arg5;
		@Pc(65) int local65 = (arg4 & 0xFF) * arg5;
		@Pc(69) int local69 = anInt1622 - arg2;
		@Pc(75) int local75 = arg0 + arg1 * anInt1622;
		for (@Pc(77) int local77 = 0; local77 < arg3; local77++) {
			for (@Pc(81) int local81 = -arg2; local81 < 0; local81++) {
				@Pc(92) int local92 = (anIntArray237[local75] >> 16 & 0xFF) * local43;
				@Pc(102) int local102 = (anIntArray237[local75] >> 8 & 0xFF) * local43;
				@Pc(110) int local110 = (anIntArray237[local75] & 0xFF) * local43;
				@Pc(132) int local132 = (local51 + local92 >> 8 << 16) + (local59 + local102 >> 8 << 8) + (local65 + local110 >> 8);
				anIntArray237[local75++] = local132;
			}
			local75 += local69;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "()V")
	public static void method1132() {
		anInt1617 = 0;
		anInt1618 = 0;
		anInt1620 = anInt1622;
		anInt1619 = anInt1621;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "()V")
	public static void method1133() {
		anIntArray237 = null;
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIII)V")
	private static void method1134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < anInt1618 || arg1 >= anInt1619) {
			return;
		}
		if (arg0 < anInt1617) {
			arg2 -= anInt1617 - arg0;
			arg0 = anInt1617;
		}
		if (arg0 + arg2 > anInt1620) {
			arg2 = anInt1620 - arg0;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt1622;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray237[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray237[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray237[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray237[local58++] = local111;
		}
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "()V")
	public static void method1135() {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = anInt1622 * anInt1621 - 7;
		while (local1 < local7) {
			anIntArray237[local1++] = 0;
			anIntArray237[local1++] = 0;
			anIntArray237[local1++] = 0;
			anIntArray237[local1++] = 0;
			anIntArray237[local1++] = 0;
			anIntArray237[local1++] = 0;
			anIntArray237[local1++] = 0;
			anIntArray237[local1++] = 0;
		}
		local7 += 7;
		while (local1 < local7) {
			anIntArray237[local1++] = 0;
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIII)V")
	public static void method1136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < anInt1617 || arg0 >= anInt1620) {
			return;
		}
		if (arg1 < anInt1618) {
			arg2 -= anInt1618 - arg1;
			arg1 = anInt1618;
		}
		if (arg1 + arg2 > anInt1619) {
			arg2 = anInt1619 - arg1;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt1622;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray237[local32 + local34 * anInt1622] = arg3;
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIIIII)V")
	public static void method1137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		method1134(arg0, arg1, arg2, arg4, arg5);
		method1134(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		if (arg3 >= 3) {
			method1139(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
			method1139(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(IIIII)V")
	public static void method1138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		method1140(arg0, arg1, arg2, arg4);
		method1140(arg0, arg1 + arg3 - 1, arg2, arg4);
		method1136(arg0, arg1, arg3, arg4);
		method1136(arg0 + arg2 - 1, arg1, arg3, arg4);
	}

	@OriginalMember(owner = "client!l", name = "d", descriptor = "(IIIII)V")
	private static void method1139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < anInt1617 || arg0 >= anInt1620) {
			return;
		}
		if (arg1 < anInt1618) {
			arg2 -= anInt1618 - arg1;
			arg1 = anInt1618;
		}
		if (arg1 + arg2 > anInt1619) {
			arg2 = anInt1619 - arg1;
		}
		@Pc(30) int local30 = 256 - arg4;
		@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
		@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
		@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
		@Pc(58) int local58 = arg0 + arg1 * anInt1622;
		for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
			@Pc(71) int local71 = (anIntArray237[local58] >> 16 & 0xFF) * local30;
			@Pc(81) int local81 = (anIntArray237[local58] >> 8 & 0xFF) * local30;
			@Pc(89) int local89 = (anIntArray237[local58] & 0xFF) * local30;
			@Pc(111) int local111 = (local38 + local71 >> 8 << 16) + (local46 + local81 >> 8 << 8) + (local52 + local89 >> 8);
			anIntArray237[local58] = local111;
			local58 += anInt1622;
		}
	}

	@OriginalMember(owner = "client!l", name = "c", descriptor = "(IIII)V")
	public static void method1140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 < anInt1618 || arg1 >= anInt1619) {
			return;
		}
		if (arg0 < anInt1617) {
			arg2 -= anInt1617 - arg0;
			arg0 = anInt1617;
		}
		if (arg0 + arg2 > anInt1620) {
			arg2 = anInt1620 - arg0;
		}
		@Pc(32) int local32 = arg0 + arg1 * anInt1622;
		for (@Pc(34) int local34 = 0; local34 < arg2; local34++) {
			anIntArray237[local32 + local34] = arg3;
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([III)V")
	public static void method1141(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		anIntArray237 = arg0;
		anInt1622 = arg1;
		anInt1621 = arg2;
		method1130(0, 0, arg1, arg2);
	}
}
