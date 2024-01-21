import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BDJXDJBP")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!BDJXDJBP", name = "i", descriptor = "Z")
	private static boolean aBoolean103;

	@OriginalMember(owner = "client!BDJXDJBP", name = "m", descriptor = "[I")
	public static int[] anIntArray86;

	@OriginalMember(owner = "client!BDJXDJBP", name = "n", descriptor = "I")
	public static int anInt550;

	@OriginalMember(owner = "client!BDJXDJBP", name = "o", descriptor = "I")
	public static int anInt551;

	@OriginalMember(owner = "client!BDJXDJBP", name = "p", descriptor = "I")
	public static int anInt552;

	@OriginalMember(owner = "client!BDJXDJBP", name = "q", descriptor = "I")
	public static int anInt553;

	@OriginalMember(owner = "client!BDJXDJBP", name = "r", descriptor = "I")
	public static int anInt554;

	@OriginalMember(owner = "client!BDJXDJBP", name = "s", descriptor = "I")
	public static int anInt555;

	@OriginalMember(owner = "client!BDJXDJBP", name = "t", descriptor = "I")
	public static int anInt556;

	@OriginalMember(owner = "client!BDJXDJBP", name = "u", descriptor = "I")
	public static int anInt557;

	@OriginalMember(owner = "client!BDJXDJBP", name = "v", descriptor = "I")
	public static int anInt558;

	@OriginalMember(owner = "client!BDJXDJBP", name = "j", descriptor = "I")
	private static int anInt547 = -21200;

	@OriginalMember(owner = "client!BDJXDJBP", name = "k", descriptor = "I")
	private static int anInt548 = 26030;

	@OriginalMember(owner = "client!BDJXDJBP", name = "l", descriptor = "I")
	private static int anInt549 = 11419;

	@OriginalMember(owner = "client!BDJXDJBP", name = "a", descriptor = "(II[IZ)V")
	public static void method346(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		try {
			anIntArray86 = arg2;
			anInt550 = arg0;
			anInt551 = arg1;
			method348(0, arg0, arg1, 0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("88837, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJXDJBP", name = "a", descriptor = "(I)V")
	public static void method347(@OriginalArg(0) int arg0) {
		try {
			anInt554 = 0;
			anInt552 = 0;
			@Pc(7) int local7 = 97 / arg0;
			anInt555 = anInt550;
			anInt553 = anInt551;
			anInt556 = anInt555 - 1;
			anInt557 = anInt555 / 2;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("42993, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJXDJBP", name = "a", descriptor = "(IIZII)V")
	public static void method348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg1 > anInt550) {
				arg1 = anInt550;
			}
			if (arg2 > anInt551) {
				arg2 = anInt551;
			}
			anInt554 = arg3;
			anInt552 = arg0;
			anInt555 = arg1;
			anInt553 = arg2;
			anInt556 = anInt555 - 1;
			anInt557 = anInt555 / 2;
			anInt558 = anInt553 / 2;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("95956, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJXDJBP", name = "b", descriptor = "(I)V")
	public static void method349(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = anInt550 * anInt551;
			@Pc(7) boolean local7 = false;
			for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
				anIntArray86[local9] = 0;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("81679, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJXDJBP", name = "a", descriptor = "(IIIIBII)V")
	public static void method350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 < anInt554) {
				arg1 -= anInt554 - arg0;
				arg0 = anInt554;
			}
			if (arg3 < anInt552) {
				arg4 -= anInt552 - arg3;
				arg3 = anInt552;
			}
			if (arg0 + arg1 > anInt555) {
				arg1 = anInt555 - arg0;
			}
			if (arg3 + arg4 > anInt553) {
				arg4 = anInt553 - arg3;
			}
			@Pc(45) int local45 = 256 - arg5;
			@Pc(53) int local53 = (arg2 >> 16 & 0xFF) * arg5;
			@Pc(61) int local61 = (arg2 >> 8 & 0xFF) * arg5;
			@Pc(67) int local67 = (arg2 & 0xFF) * arg5;
			@Pc(71) int local71 = anInt550 - arg1;
			@Pc(77) int local77 = arg0 + arg3 * anInt550;
			for (@Pc(79) int local79 = 0; local79 < arg4; local79++) {
				for (@Pc(84) int local84 = -arg1; local84 < 0; local84++) {
					@Pc(96) int local96 = (anIntArray86[local77] >> 16 & 0xFF) * local45;
					@Pc(106) int local106 = (anIntArray86[local77] >> 8 & 0xFF) * local45;
					@Pc(114) int local114 = (anIntArray86[local77] & 0xFF) * local45;
					@Pc(136) int local136 = (local53 + local96 >> 8 << 16) + (local61 + local106 >> 8 << 8) + (local67 + local114 >> 8);
					anIntArray86[local77++] = local136;
				}
				local77 += local71;
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("14225, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -6 + ", " + arg4 + ", " + arg5 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJXDJBP", name = "a", descriptor = "(IIIIII)V")
	public static void method351(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 < anInt554) {
				arg1 -= anInt554 - arg0;
				arg0 = anInt554;
			}
			if (arg3 < anInt552) {
				arg4 -= anInt552 - arg3;
				arg3 = anInt552;
			}
			if (arg0 + arg1 > anInt555) {
				arg1 = anInt555 - arg0;
			}
			if (arg3 + arg4 > anInt553) {
				arg4 = anInt553 - arg3;
			}
			@Pc(45) int local45 = anInt550 - arg1;
			@Pc(55) int local55 = arg0 + arg3 * anInt550;
			for (@Pc(58) int local58 = -arg4; local58 < 0; local58++) {
				for (@Pc(63) int local63 = -arg1; local63 < 0; local63++) {
					anIntArray86[local55++] = arg2;
				}
				local55 += local45;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("44404, " + arg0 + ", " + 35224 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJXDJBP", name = "b", descriptor = "(IIIIII)V")
	public static void method352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method354(arg4, arg1, arg2, anInt547, arg0);
			method354(arg4 + arg3 - 1, arg1, arg2, anInt547, arg0);
			method356(arg1, arg4, arg2, arg3);
			method356(arg1, arg4, arg2 + arg0 - 1, arg3);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("60262, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -41001 + ", " + arg3 + ", " + arg4 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJXDJBP", name = "a", descriptor = "(IIIIIII)V")
	public static void method353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method355(arg2, arg0, arg1, arg5, arg3);
			method355(arg2 + arg4 - 1, arg0, arg1, arg5, arg3);
			if (arg4 >= 3) {
				method357(arg0, arg4 - 2, arg2 + 1, arg3, arg1);
				method357(arg0, arg4 - 2, arg2 + 1, arg3 + arg5 - 1, arg1);
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("85985, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJXDJBP", name = "a", descriptor = "(IIIII)V")
	public static void method354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3 == -21200 && (arg0 >= anInt552 && arg0 < anInt553)) {
				if (arg2 < anInt554) {
					arg4 -= anInt554 - arg2;
					arg2 = anInt554;
				}
				if (arg2 + arg4 > anInt555) {
					arg4 = anInt555 - arg2;
				}
				@Pc(36) int local36 = arg2 + arg0 * anInt550;
				for (@Pc(38) int local38 = 0; local38 < arg4; local38++) {
					anIntArray86[local36 + local38] = arg1;
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("15018, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJXDJBP", name = "c", descriptor = "(IIIIII)V")
	private static void method355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt552 && arg0 < anInt553) {
				if (arg4 < anInt554) {
					arg3 -= anInt554 - arg4;
					arg4 = anInt554;
				}
				if (arg4 + arg3 > anInt555) {
					arg3 = anInt555 - arg4;
				}
				@Pc(30) int local30 = 256 - arg1;
				@Pc(38) int local38 = (arg2 >> 16 & 0xFF) * arg1;
				@Pc(46) int local46 = (arg2 >> 8 & 0xFF) * arg1;
				@Pc(52) int local52 = (arg2 & 0xFF) * arg1;
				if (anInt548 != 26030) {
					aBoolean103 = !aBoolean103;
				}
				@Pc(67) int local67 = arg4 + arg0 * anInt550;
				for (@Pc(69) int local69 = 0; local69 < arg3; local69++) {
					@Pc(81) int local81 = (anIntArray86[local67] >> 16 & 0xFF) * local30;
					@Pc(91) int local91 = (anIntArray86[local67] >> 8 & 0xFF) * local30;
					@Pc(99) int local99 = (anIntArray86[local67] & 0xFF) * local30;
					@Pc(121) int local121 = (local38 + local81 >> 8 << 16) + (local46 + local91 >> 8 << 8) + (local52 + local99 >> 8);
					anIntArray86[local67++] = local121;
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("30186, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 26030 + ", " + arg3 + ", " + arg4 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJXDJBP", name = "b", descriptor = "(IIIII)V")
	public static void method356(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt554 && arg2 < anInt555) {
				if (arg1 < anInt552) {
					arg3 -= anInt552 - arg1;
					arg1 = anInt552;
				}
				if (arg1 + arg3 > anInt553) {
					arg3 = anInt553 - arg1;
				}
				@Pc(32) int local32 = arg2 + arg1 * anInt550;
				for (@Pc(37) int local37 = 0; local37 < arg3; local37++) {
					anIntArray86[local32 + local37 * anInt550] = arg0;
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("12068, " + 607 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJXDJBP", name = "a", descriptor = "(IIIZII)V")
	private static void method357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 >= anInt554 && arg3 < anInt555) {
				if (arg2 < anInt552) {
					arg1 -= anInt552 - arg2;
					arg2 = anInt552;
				}
				if (arg2 + arg1 > anInt553) {
					arg1 = anInt553 - arg2;
				}
				@Pc(30) int local30 = 256 - arg0;
				@Pc(38) int local38 = (arg4 >> 16 & 0xFF) * arg0;
				@Pc(46) int local46 = (arg4 >> 8 & 0xFF) * arg0;
				@Pc(52) int local52 = (arg4 & 0xFF) * arg0;
				@Pc(58) int local58 = arg3 + arg2 * anInt550;
				for (@Pc(60) int local60 = 0; local60 < arg1; local60++) {
					@Pc(72) int local72 = (anIntArray86[local58] >> 16 & 0xFF) * local30;
					@Pc(82) int local82 = (anIntArray86[local58] >> 8 & 0xFF) * local30;
					@Pc(90) int local90 = (anIntArray86[local58] & 0xFF) * local30;
					@Pc(112) int local112 = (local38 + local72 >> 8 << 16) + (local46 + local82 >> 8 << 8) + (local52 + local90 >> 8);
					anIntArray86[local58] = local112;
					local58 += anInt550;
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("40789, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BDJXDJBP", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
