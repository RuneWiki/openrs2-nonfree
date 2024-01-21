import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DSAVPBJG")
public class Class3_Sub1_Sub1 extends Class3_Sub1 {

	@OriginalMember(owner = "client!DSAVPBJG", name = "o", descriptor = "[I")
	public static int[] anIntArray203;

	@OriginalMember(owner = "client!DSAVPBJG", name = "p", descriptor = "I")
	public static int anInt760;

	@OriginalMember(owner = "client!DSAVPBJG", name = "q", descriptor = "I")
	public static int anInt761;

	@OriginalMember(owner = "client!DSAVPBJG", name = "r", descriptor = "I")
	public static int anInt762;

	@OriginalMember(owner = "client!DSAVPBJG", name = "s", descriptor = "I")
	public static int anInt763;

	@OriginalMember(owner = "client!DSAVPBJG", name = "t", descriptor = "I")
	public static int anInt764;

	@OriginalMember(owner = "client!DSAVPBJG", name = "u", descriptor = "I")
	public static int anInt765;

	@OriginalMember(owner = "client!DSAVPBJG", name = "v", descriptor = "I")
	public static int anInt766;

	@OriginalMember(owner = "client!DSAVPBJG", name = "w", descriptor = "I")
	public static int anInt767;

	@OriginalMember(owner = "client!DSAVPBJG", name = "x", descriptor = "I")
	public static int anInt768;

	@OriginalMember(owner = "client!DSAVPBJG", name = "i", descriptor = "I")
	private static int anInt757 = 24940;

	@OriginalMember(owner = "client!DSAVPBJG", name = "j", descriptor = "I")
	private static int anInt758 = 3;

	@OriginalMember(owner = "client!DSAVPBJG", name = "k", descriptor = "Z")
	private static boolean aBoolean231 = true;

	@OriginalMember(owner = "client!DSAVPBJG", name = "l", descriptor = "I")
	private static int anInt759 = 7;

	@OriginalMember(owner = "client!DSAVPBJG", name = "m", descriptor = "Z")
	private static boolean aBoolean232 = true;

	static {
		aBoolean233 = true;
	}

	@OriginalMember(owner = "client!DSAVPBJG", name = "a", descriptor = "(I[III)V")
	public static void method537(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			if (anInt757 == 24940) {
				anIntArray203 = arg0;
				anInt760 = arg1;
				anInt761 = arg2;
				method539(arg1, arg2, 0, 0);
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("59361, " + 24940 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DSAVPBJG", name = "a", descriptor = "(B)V")
	public static void method538() {
		try {
			anInt764 = 0;
			anInt762 = 0;
			anInt765 = anInt760;
			anInt763 = anInt761;
			anInt766 = anInt765 - 1;
			anInt767 = anInt765 / 2;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("3937, " + 36 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DSAVPBJG", name = "a", descriptor = "(IIIIZ)V")
	public static void method539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg0 > anInt760) {
				arg0 = anInt760;
			}
			if (arg1 > anInt761) {
				arg1 = anInt761;
			}
			anInt764 = arg2;
			anInt762 = arg3;
			anInt765 = arg0;
			anInt763 = arg1;
			anInt766 = anInt765 - 1;
			anInt767 = anInt765 / 2;
			anInt768 = anInt763 / 2;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("20117, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DSAVPBJG", name = "a", descriptor = "(I)V")
	public static void method540() {
		try {
			@Pc(8) int local8 = anInt760 * anInt761;
			for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
				anIntArray203[local10] = 0;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("89989, " + -27727 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DSAVPBJG", name = "a", descriptor = "(IIIIIII)V")
	public static void method541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 < anInt764) {
				arg1 -= anInt764 - arg3;
				arg3 = anInt764;
			}
			if (arg2 < anInt762) {
				arg4 -= anInt762 - arg2;
				arg2 = anInt762;
			}
			if (arg3 + arg1 > anInt765) {
				arg1 = anInt765 - arg3;
			}
			if (arg2 + arg4 > anInt763) {
				arg4 = anInt763 - arg2;
			}
			@Pc(45) int local45 = 256 - arg0;
			@Pc(53) int local53 = (arg5 >> 16 & 0xFF) * arg0;
			@Pc(61) int local61 = (arg5 >> 8 & 0xFF) * arg0;
			@Pc(67) int local67 = (arg5 & 0xFF) * arg0;
			@Pc(71) int local71 = anInt760 - arg1;
			@Pc(77) int local77 = arg3 + arg2 * anInt760;
			for (@Pc(89) int local89 = 0; local89 < arg4; local89++) {
				for (@Pc(94) int local94 = -arg1; local94 < 0; local94++) {
					@Pc(106) int local106 = (anIntArray203[local77] >> 16 & 0xFF) * local45;
					@Pc(116) int local116 = (anIntArray203[local77] >> 8 & 0xFF) * local45;
					@Pc(124) int local124 = (anIntArray203[local77] & 0xFF) * local45;
					@Pc(146) int local146 = (local53 + local106 >> 8 << 16) + (local61 + local116 >> 8 << 8) + (local67 + local124 >> 8);
					anIntArray203[local77++] = local146;
				}
				local77 += local71;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("89823, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -882 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DSAVPBJG", name = "a", descriptor = "(IIIIII)V")
	public static void method542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (anInt758 != 3) {
				aBoolean232 = !aBoolean232;
			}
			if (arg1 < anInt764) {
				arg2 -= anInt764 - arg1;
				arg1 = anInt764;
			}
			if (arg4 < anInt762) {
				arg3 -= anInt762 - arg4;
				arg4 = anInt762;
			}
			if (arg1 + arg2 > anInt765) {
				arg2 = anInt765 - arg1;
			}
			if (arg4 + arg3 > anInt763) {
				arg3 = anInt763 - arg4;
			}
			@Pc(54) int local54 = anInt760 - arg2;
			@Pc(60) int local60 = arg1 + arg4 * anInt760;
			for (@Pc(63) int local63 = -arg3; local63 < 0; local63++) {
				for (@Pc(68) int local68 = -arg2; local68 < 0; local68++) {
					anIntArray203[local60++] = arg0;
				}
				local60 += local54;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("99470, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 3 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DSAVPBJG", name = "a", descriptor = "(IIIIBI)V")
	public static void method543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			method545(arg4, arg2, arg0, arg1);
			method545(arg4, arg2, arg0 + arg3 - 1, arg1);
			method547(arg2, arg3, arg0, arg4);
			method547(arg2 + arg1 - 1, arg3, arg0, arg4);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("80641, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -19 + ", " + arg4 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DSAVPBJG", name = "b", descriptor = "(IIIIIII)V")
	public static void method544(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method546(arg3, arg0, arg5, arg2, arg1);
			method546(arg3, arg0 + arg4 - 1, arg5, arg2, arg1);
			if (arg4 >= 3) {
				method548(arg0 + 1, arg2, arg4 - 2, arg3, arg5);
				method548(arg0 + 1, arg2 + arg1 - 1, arg4 - 2, arg3, arg5);
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("29564, " + -108 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DSAVPBJG", name = "a", descriptor = "(IIIII)V")
	public static void method545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt762 && arg2 < anInt763) {
				if (arg1 < anInt764) {
					arg3 -= anInt764 - arg1;
					arg1 = anInt764;
				}
				if (arg1 + arg3 > anInt765) {
					arg3 = anInt765 - arg1;
				}
				@Pc(32) int local32 = arg1 + arg2 * anInt760;
				for (@Pc(37) int local37 = 0; local37 < arg3; local37++) {
					anIntArray203[local32 + local37] = arg0;
				}
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("72194, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DSAVPBJG", name = "a", descriptor = "(IZIIII)V")
	private static void method546(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 >= anInt762 && arg1 < anInt763) {
				if (arg3 < anInt764) {
					arg4 -= anInt764 - arg3;
					arg3 = anInt764;
				}
				if (arg3 + arg4 > anInt765) {
					arg4 = anInt765 - arg3;
				}
				@Pc(32) int local32 = 256 - arg2;
				@Pc(40) int local40 = (arg0 >> 16 & 0xFF) * arg2;
				@Pc(48) int local48 = (arg0 >> 8 & 0xFF) * arg2;
				@Pc(54) int local54 = (arg0 & 0xFF) * arg2;
				@Pc(69) int local69 = arg3 + arg1 * anInt760;
				for (@Pc(71) int local71 = 0; local71 < arg4; local71++) {
					@Pc(83) int local83 = (anIntArray203[local69] >> 16 & 0xFF) * local32;
					@Pc(93) int local93 = (anIntArray203[local69] >> 8 & 0xFF) * local32;
					@Pc(101) int local101 = (anIntArray203[local69] & 0xFF) * local32;
					@Pc(123) int local123 = (local40 + local83 >> 8 << 16) + (local48 + local93 >> 8 << 8) + (local54 + local101 >> 8);
					anIntArray203[local69++] = local123;
				}
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("32043, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DSAVPBJG", name = "a", descriptor = "(IIIIB)V")
	public static void method547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 >= anInt764 && arg0 < anInt765) {
				if (arg2 < anInt762) {
					arg1 -= anInt762 - arg2;
					arg2 = anInt762;
				}
				if (arg2 + arg1 > anInt763) {
					arg1 = anInt763 - arg2;
				}
				@Pc(41) int local41 = arg0 + arg2 * anInt760;
				for (@Pc(43) int local43 = 0; local43 < arg1; local43++) {
					anIntArray203[local41 + local43 * anInt760] = arg3;
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("91405, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DSAVPBJG", name = "b", descriptor = "(IIIIII)V")
	private static void method548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 >= anInt764 && arg1 < anInt765) {
				if (arg0 < anInt762) {
					arg2 -= anInt762 - arg0;
					arg0 = anInt762;
				}
				if (arg0 + arg2 > anInt763) {
					arg2 = anInt763 - arg0;
				}
				@Pc(30) int local30 = 256 - arg4;
				@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
				@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
				@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
				if (anInt759 == 7) {
					@Pc(62) int local62 = arg1 + arg0 * anInt760;
					for (@Pc(64) int local64 = 0; local64 < arg2; local64++) {
						@Pc(76) int local76 = (anIntArray203[local62] >> 16 & 0xFF) * local30;
						@Pc(86) int local86 = (anIntArray203[local62] >> 8 & 0xFF) * local30;
						@Pc(94) int local94 = (anIntArray203[local62] & 0xFF) * local30;
						@Pc(116) int local116 = (local38 + local76 >> 8 << 16) + (local46 + local86 >> 8 << 8) + (local52 + local94 >> 8);
						anIntArray203[local62] = local116;
						local62 += anInt760;
					}
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("90840, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 7 + ", " + arg3 + ", " + arg4 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DSAVPBJG", name = "<init>", descriptor = "()V")
	protected Class3_Sub1_Sub1() {
	}
}
