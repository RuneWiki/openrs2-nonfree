import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BAXODNVH")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!BAXODNVH", name = "l", descriptor = "Z")
	private static boolean aBoolean143;

	@OriginalMember(owner = "client!BAXODNVH", name = "n", descriptor = "[I")
	public static int[] anIntArray170;

	@OriginalMember(owner = "client!BAXODNVH", name = "o", descriptor = "I")
	public static int anInt653;

	@OriginalMember(owner = "client!BAXODNVH", name = "p", descriptor = "I")
	public static int anInt654;

	@OriginalMember(owner = "client!BAXODNVH", name = "q", descriptor = "I")
	public static int anInt655;

	@OriginalMember(owner = "client!BAXODNVH", name = "r", descriptor = "I")
	public static int anInt656;

	@OriginalMember(owner = "client!BAXODNVH", name = "s", descriptor = "I")
	public static int anInt657;

	@OriginalMember(owner = "client!BAXODNVH", name = "t", descriptor = "I")
	public static int anInt658;

	@OriginalMember(owner = "client!BAXODNVH", name = "u", descriptor = "I")
	public static int anInt659;

	@OriginalMember(owner = "client!BAXODNVH", name = "v", descriptor = "I")
	public static int anInt660;

	@OriginalMember(owner = "client!BAXODNVH", name = "w", descriptor = "I")
	public static int anInt661;

	@OriginalMember(owner = "client!BAXODNVH", name = "i", descriptor = "I")
	private static int anInt649 = 859;

	@OriginalMember(owner = "client!BAXODNVH", name = "j", descriptor = "I")
	private static int anInt650 = -34531;

	@OriginalMember(owner = "client!BAXODNVH", name = "k", descriptor = "I")
	private static int anInt651 = -34531;

	@OriginalMember(owner = "client!BAXODNVH", name = "m", descriptor = "I")
	private static int anInt652 = -794;

	@OriginalMember(owner = "client!BAXODNVH", name = "a", descriptor = "(I[IIB)V")
	public static void method456(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		try {
			anIntArray170 = arg1;
			anInt653 = arg0;
			anInt654 = arg2;
			method458(0, arg2, arg0, 0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("615, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 67 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BAXODNVH", name = "a", descriptor = "(I)V")
	public static void method457() {
		try {
			anInt657 = 0;
			anInt655 = 0;
			anInt658 = anInt653;
			anInt656 = anInt654;
			anInt659 = anInt658 - 1;
			anInt660 = anInt658 / 2;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("66367, " + -798 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BAXODNVH", name = "a", descriptor = "(IIIII)V")
	public static void method458(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg2 > anInt653) {
				arg2 = anInt653;
			}
			if (arg1 > anInt654) {
				arg1 = anInt654;
			}
			anInt657 = arg3;
			anInt655 = arg0;
			anInt658 = arg2;
			anInt656 = arg1;
			anInt659 = anInt658 - 1;
			anInt660 = anInt658 / 2;
			anInt661 = anInt656 / 2;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("47853, " + -180 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BAXODNVH", name = "b", descriptor = "(I)V")
	public static void method459() {
		try {
			@Pc(7) int local7 = anInt653 * anInt654;
			for (@Pc(9) int local9 = 0; local9 < local7; local9++) {
				anIntArray170[local9] = 0;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("6354, " + 12847 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BAXODNVH", name = "a", descriptor = "(IZIIIII)V")
	public static void method460(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 < anInt657) {
				arg1 -= anInt657 - arg4;
				arg4 = anInt657;
			}
			if (arg2 < anInt655) {
				arg3 -= anInt655 - arg2;
				arg2 = anInt655;
			}
			if (arg4 + arg1 > anInt658) {
				arg1 = anInt658 - arg4;
			}
			if (arg2 + arg3 > anInt656) {
				arg3 = anInt656 - arg2;
			}
			@Pc(45) int local45 = 256 - arg0;
			@Pc(53) int local53 = (arg5 >> 16 & 0xFF) * arg0;
			@Pc(61) int local61 = (arg5 >> 8 & 0xFF) * arg0;
			@Pc(67) int local67 = (arg5 & 0xFF) * arg0;
			@Pc(71) int local71 = anInt653 - arg1;
			@Pc(77) int local77 = arg4 + arg2 * anInt653;
			for (@Pc(83) int local83 = 0; local83 < arg3; local83++) {
				for (@Pc(88) int local88 = -arg1; local88 < 0; local88++) {
					@Pc(100) int local100 = (anIntArray170[local77] >> 16 & 0xFF) * local45;
					@Pc(110) int local110 = (anIntArray170[local77] >> 8 & 0xFF) * local45;
					@Pc(118) int local118 = (anIntArray170[local77] & 0xFF) * local45;
					@Pc(140) int local140 = (local53 + local100 >> 8 << 16) + (local61 + local110 >> 8 << 8) + (local67 + local118 >> 8);
					anIntArray170[local77++] = local140;
				}
				local77 += local71;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("53262, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BAXODNVH", name = "a", descriptor = "(IIIIII)V")
	public static void method461(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 < anInt657) {
				arg0 -= anInt657 - arg1;
				arg1 = anInt657;
			}
			if (arg4 < anInt655) {
				arg2 -= anInt655 - arg4;
				arg4 = anInt655;
			}
			if (arg1 + arg0 > anInt658) {
				arg0 = anInt658 - arg1;
			}
			if (arg4 + arg2 > anInt656) {
				arg2 = anInt656 - arg4;
			}
			@Pc(55) int local55 = anInt653 - arg0;
			@Pc(61) int local61 = arg1 + arg4 * anInt653;
			for (@Pc(64) int local64 = -arg2; local64 < 0; local64++) {
				for (@Pc(69) int local69 = -arg0; local69 < 0; local69++) {
					anIntArray170[local61++] = arg3;
				}
				local61 += local55;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("97158, " + arg0 + ", " + -16614 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BAXODNVH", name = "b", descriptor = "(IIIIII)V")
	public static void method462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			method464(arg1, arg3, arg2, arg5);
			method464(arg1, arg3, arg2, arg5 + arg0 - 1);
			method466(arg0, anInt650, arg3, arg5, arg2);
			method466(arg0, anInt650, arg3 + arg1 - 1, arg5, arg2);
			@Pc(35) int local35 = 20 / arg4;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("44159, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BAXODNVH", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			method465(arg1, arg3, arg5, arg4, arg0);
			method465(arg1 + arg2 - 1, arg3, arg5, arg4, arg0);
			if (arg2 >= 3) {
				method467(arg3, arg5, arg2 - 2, arg4, arg1 + 1);
				method467(arg3, arg5, arg2 - 2, arg4 + arg0 - 1, arg1 + 1);
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("34387, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BAXODNVH", name = "b", descriptor = "(IIIII)V")
	public static void method464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 >= anInt655 && arg3 < anInt656) {
				if (arg1 < anInt657) {
					arg0 -= anInt657 - arg1;
					arg1 = anInt657;
				}
				if (arg1 + arg0 > anInt658) {
					arg0 = anInt658 - arg1;
				}
				@Pc(32) int local32 = arg1 + arg3 * anInt653;
				for (@Pc(43) int local43 = 0; local43 < arg0; local43++) {
					anIntArray170[local32 + local43] = arg2;
				}
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("24467, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 31754 + ", " + arg3 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BAXODNVH", name = "c", descriptor = "(IIIIII)V")
	private static void method465(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt655 && arg0 < anInt656) {
				if (arg3 < anInt657) {
					arg4 -= anInt657 - arg3;
					arg3 = anInt657;
				}
				if (arg3 + arg4 > anInt658) {
					arg4 = anInt658 - arg3;
				}
				@Pc(30) int local30 = 256 - arg2;
				@Pc(38) int local38 = (arg1 >> 16 & 0xFF) * arg2;
				@Pc(46) int local46 = (arg1 >> 8 & 0xFF) * arg2;
				@Pc(52) int local52 = (arg1 & 0xFF) * arg2;
				@Pc(58) int local58 = arg3 + arg0 * anInt653;
				for (@Pc(64) int local64 = 0; local64 < arg4; local64++) {
					@Pc(76) int local76 = (anIntArray170[local58] >> 16 & 0xFF) * local30;
					@Pc(86) int local86 = (anIntArray170[local58] >> 8 & 0xFF) * local30;
					@Pc(94) int local94 = (anIntArray170[local58] & 0xFF) * local30;
					@Pc(116) int local116 = (local38 + local76 >> 8 << 16) + (local46 + local86 >> 8 << 8) + (local52 + local94 >> 8);
					anIntArray170[local58++] = local116;
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("21477, " + arg0 + ", " + 27015 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BAXODNVH", name = "c", descriptor = "(IIIII)V")
	public static void method466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 >= anInt657 && arg2 < anInt658) {
				if (arg3 < anInt655) {
					arg0 -= anInt655 - arg3;
					arg3 = anInt655;
				}
				if (arg3 + arg0 > anInt656) {
					arg0 = anInt656 - arg3;
				}
				@Pc(32) int local32 = arg2 + arg3 * anInt653;
				if (arg1 == anInt651) {
					for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
						anIntArray170[local32 + local38 * anInt653] = arg4;
					}
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("45888, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BAXODNVH", name = "a", descriptor = "(IIBIII)V")
	private static void method467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 >= anInt657 && arg3 < anInt658) {
				if (arg4 < anInt655) {
					arg2 -= anInt655 - arg4;
					arg4 = anInt655;
				}
				if (arg4 + arg2 > anInt656) {
					arg2 = anInt656 - arg4;
				}
				@Pc(30) int local30 = 256 - arg1;
				@Pc(38) int local38 = (arg0 >> 16 & 0xFF) * arg1;
				@Pc(46) int local46 = (arg0 >> 8 & 0xFF) * arg1;
				@Pc(52) int local52 = (arg0 & 0xFF) * arg1;
				@Pc(67) int local67 = arg3 + arg4 * anInt653;
				for (@Pc(69) int local69 = 0; local69 < arg2; local69++) {
					@Pc(81) int local81 = (anIntArray170[local67] >> 16 & 0xFF) * local30;
					@Pc(91) int local91 = (anIntArray170[local67] >> 8 & 0xFF) * local30;
					@Pc(99) int local99 = (anIntArray170[local67] & 0xFF) * local30;
					@Pc(121) int local121 = (local38 + local81 >> 8 << 16) + (local46 + local91 >> 8 << 8) + (local52 + local99 >> 8);
					anIntArray170[local67] = local121;
					local67 += anInt653;
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("72757, " + arg0 + ", " + arg1 + ", " + -119 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BAXODNVH", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
