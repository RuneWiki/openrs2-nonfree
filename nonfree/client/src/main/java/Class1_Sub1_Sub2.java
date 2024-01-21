import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gb")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "[I")
	public static int[] anIntArray213;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
	public static int anInt695;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
	public static int anInt696;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	public static int anInt697;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public static int anInt698;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public static int anInt699;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	public static int anInt700;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public static int anInt701;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public static int anInt702;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	public static int anInt703;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "Z")
	private static boolean aBoolean177 = true;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	private static int anInt693 = 3;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "Z")
	private static boolean aBoolean178 = true;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	private static int anInt694 = -636;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([IIII)V")
	public static void method434(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			anIntArray213 = arg0;
			anInt695 = arg2;
			anInt696 = arg1;
			method436(0, arg2, 0, arg1);
			@Pc(15) boolean local15 = false;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("25479, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
	public static void method435() {
		try {
			anInt699 = 0;
			anInt697 = 0;
			anInt700 = anInt695;
			anInt698 = anInt696;
			anInt701 = anInt700 - 1;
			anInt702 = anInt700 / 2;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("412, " + true + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIBI)V")
	public static void method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg1 > anInt695) {
				arg1 = anInt695;
			}
			if (arg3 > anInt696) {
				arg3 = anInt696;
			}
			anInt699 = arg0;
			anInt697 = arg2;
			anInt700 = arg1;
			anInt698 = arg3;
			anInt701 = anInt700 - 1;
			anInt702 = anInt700 / 2;
			anInt703 = anInt698 / 2;
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("99294, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 2 + ", " + arg3 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	public static void method437() {
		try {
			@Pc(5) int local5 = anInt695 * anInt696;
			for (@Pc(17) int local17 = 0; local17 < local5; local17++) {
				anIntArray213[local17] = 0;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("75218, " + 7 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIZI)V")
	public static void method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 < anInt699) {
				arg0 -= anInt699 - arg3;
				arg3 = anInt699;
			}
			if (arg1 < anInt697) {
				arg2 -= anInt697 - arg1;
				arg1 = anInt697;
			}
			if (arg3 + arg0 > anInt700) {
				arg0 = anInt700 - arg3;
			}
			if (arg1 + arg2 > anInt698) {
				arg2 = anInt698 - arg1;
			}
			@Pc(45) int local45 = 256 - arg4;
			@Pc(56) int local56 = (arg5 >> 16 & 0xFF) * arg4;
			@Pc(64) int local64 = (arg5 >> 8 & 0xFF) * arg4;
			@Pc(70) int local70 = (arg5 & 0xFF) * arg4;
			@Pc(74) int local74 = anInt695 - arg0;
			@Pc(80) int local80 = arg3 + arg1 * anInt695;
			for (@Pc(82) int local82 = 0; local82 < arg2; local82++) {
				for (@Pc(87) int local87 = -arg0; local87 < 0; local87++) {
					@Pc(99) int local99 = (anIntArray213[local80] >> 16 & 0xFF) * local45;
					@Pc(109) int local109 = (anIntArray213[local80] >> 8 & 0xFF) * local45;
					@Pc(117) int local117 = (anIntArray213[local80] & 0xFF) * local45;
					@Pc(139) int local139 = (local56 + local99 >> 8 << 16) + (local64 + local109 >> 8 << 8) + (local70 + local117 >> 8);
					anIntArray213[local80++] = local139;
				}
				local80 += local74;
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("31231, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIZII)V")
	public static void method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg4 < anInt699) {
				arg3 -= anInt699 - arg4;
				arg4 = anInt699;
			}
			if (arg0 < anInt697) {
				arg1 -= anInt697 - arg0;
				arg0 = anInt697;
			}
			if (arg4 + arg3 > anInt700) {
				arg3 = anInt700 - arg4;
			}
			if (arg0 + arg1 > anInt698) {
				arg1 = anInt698 - arg0;
			}
			@Pc(48) int local48 = anInt695 - arg3;
			@Pc(54) int local54 = arg4 + arg0 * anInt695;
			for (@Pc(57) int local57 = -arg1; local57 < 0; local57++) {
				for (@Pc(62) int local62 = -arg3; local62 < 0; local62++) {
					anIntArray213[local54++] = arg2;
				}
				local54 += local48;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("5998, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII)V")
	public static void method440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method442(arg1, arg0, arg3, arg2);
			method442(arg1 + arg4 - 1, arg0, arg3, arg2);
			method444(arg3, arg4, arg0, arg1);
			method444(arg3, arg4, arg0 + arg2 - 1, arg1);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("22477, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 531 + ", " + arg3 + ", " + arg4 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZIIII)V")
	public static void method441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method443(arg1, arg4, arg0, arg5, arg2);
			method443(arg1 + arg3 - 1, arg4, arg0, arg5, arg2);
			if (arg3 >= 3) {
				method445(arg4, arg0, arg1 + 1, arg3 - 2, arg2);
				method445(arg4 + arg5 - 1, arg0, arg1 + 1, arg3 - 2, arg2);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("75515, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
	public static void method442(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 >= anInt697 && arg0 < anInt698) {
				if (arg1 < anInt699) {
					arg3 -= anInt699 - arg1;
					arg1 = anInt699;
				}
				if (arg1 + arg3 > anInt700) {
					arg3 = anInt700 - arg1;
				}
				@Pc(32) int local32 = arg1 + arg0 * anInt695;
				for (@Pc(39) int local39 = 0; local39 < arg3; local39++) {
					anIntArray213[local32 + local39] = arg2;
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("10463, " + arg0 + ", " + 5 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIB)V")
	private static void method443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg0 >= anInt697 && arg0 < anInt698) {
				if (arg1 < anInt699) {
					arg3 -= anInt699 - arg1;
					arg1 = anInt699;
				}
				if (arg1 + arg3 > anInt700) {
					arg3 = anInt700 - arg1;
				}
				@Pc(30) int local30 = 256 - arg4;
				@Pc(38) int local38 = (arg2 >> 16 & 0xFF) * arg4;
				@Pc(46) int local46 = (arg2 >> 8 & 0xFF) * arg4;
				@Pc(52) int local52 = (arg2 & 0xFF) * arg4;
				@Pc(58) int local58 = arg1 + arg0 * anInt695;
				for (@Pc(65) int local65 = 0; local65 < arg3; local65++) {
					@Pc(77) int local77 = (anIntArray213[local58] >> 16 & 0xFF) * local30;
					@Pc(87) int local87 = (anIntArray213[local58] >> 8 & 0xFF) * local30;
					@Pc(95) int local95 = (anIntArray213[local58] & 0xFF) * local30;
					@Pc(117) int local117 = (local38 + local77 >> 8 << 16) + (local46 + local87 >> 8 << 8) + (local52 + local95 >> 8);
					anIntArray213[local58++] = local117;
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("1989, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 53 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIII)V")
	public static void method444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt699 && arg2 < anInt700) {
				if (arg3 < anInt697) {
					arg1 -= anInt697 - arg3;
					arg3 = anInt697;
				}
				if (arg3 + arg1 > anInt698) {
					arg1 = anInt698 - arg3;
				}
				@Pc(32) int local32 = arg2 + arg3 * anInt695;
				for (@Pc(42) int local42 = 0; local42 < arg1; local42++) {
					anIntArray213[local32 + local42 * anInt695] = arg0;
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("31159, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 11 + ", " + arg3 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZIIIII)V")
	private static void method445(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt699 && arg0 < anInt700) {
				if (arg2 < anInt697) {
					arg3 -= anInt697 - arg2;
					arg2 = anInt697;
				}
				if (arg2 + arg3 > anInt698) {
					arg3 = anInt698 - arg2;
				}
				@Pc(30) int local30 = 256 - arg4;
				@Pc(38) int local38 = (arg1 >> 16 & 0xFF) * arg4;
				@Pc(46) int local46 = (arg1 >> 8 & 0xFF) * arg4;
				@Pc(52) int local52 = (arg1 & 0xFF) * arg4;
				@Pc(58) int local58 = arg0 + arg2 * anInt695;
				for (@Pc(60) int local60 = 0; local60 < arg3; local60++) {
					@Pc(72) int local72 = (anIntArray213[local58] >> 16 & 0xFF) * local30;
					@Pc(82) int local82 = (anIntArray213[local58] >> 8 & 0xFF) * local30;
					@Pc(90) int local90 = (anIntArray213[local58] & 0xFF) * local30;
					@Pc(112) int local112 = (local38 + local72 >> 8 << 16) + (local46 + local82 >> 8 << 8) + (local52 + local90 >> 8);
					anIntArray213[local58] = local112;
					local58 += anInt695;
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("30496, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
