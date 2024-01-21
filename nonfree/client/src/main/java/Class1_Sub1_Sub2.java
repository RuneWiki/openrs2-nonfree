import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!hb")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "[I")
	public static int[] anIntArray205;

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
	public static int anInt742;

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
	public static int anInt743;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
	public static int anInt744;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
	public static int anInt745;

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
	public static int anInt746;

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
	public static int anInt747;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
	public static int anInt748;

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
	public static int anInt749;

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
	public static int anInt750;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
	private static int anInt739 = 3;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
	private static int anInt740 = -797;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "B")
	private static byte aByte41 = 8;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
	private static int anInt741 = 1;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "Z")
	private static boolean aBoolean152 = true;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([IIII)V")
	public static void method433(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			anIntArray205 = arg0;
			anInt742 = arg2;
			anInt743 = arg1;
			method435(arg1, 0, 0, arg2);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("59956, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 7 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public static void method434() {
		try {
			anInt746 = 0;
			anInt744 = 0;
			anInt747 = anInt742;
			anInt745 = anInt743;
			anInt748 = anInt747 - 1;
			anInt749 = anInt747 / 2;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("76805, " + 958 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII)V")
	public static void method435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg3 > anInt742) {
				arg3 = anInt742;
			}
			if (arg0 > anInt743) {
				arg0 = anInt743;
			}
			anInt746 = arg2;
			anInt744 = arg1;
			anInt747 = arg3;
			anInt745 = arg0;
			anInt748 = anInt747 - 1;
			anInt749 = anInt747 / 2;
			anInt750 = anInt745 / 2;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("20626, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 5 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	public static void method436(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = anInt742 * anInt743;
			@Pc(7) boolean local7 = false;
			for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
				anIntArray205[local9] = 0;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("81869, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIII)V")
	public static void method437(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 < anInt746) {
				arg2 -= anInt746 - arg3;
				arg3 = anInt746;
			}
			if (arg1 < anInt744) {
				arg0 -= anInt744 - arg1;
				arg1 = anInt744;
			}
			if (arg3 + arg2 > anInt747) {
				arg2 = anInt747 - arg3;
			}
			if (arg1 + arg0 > anInt745) {
				arg0 = anInt745 - arg1;
			}
			@Pc(48) int local48 = anInt742 - arg2;
			@Pc(54) int local54 = arg3 + arg1 * anInt742;
			for (@Pc(57) int local57 = -arg0; local57 < 0; local57++) {
				for (@Pc(62) int local62 = -arg2; local62 < 0; local62++) {
					anIntArray205[local54++] = arg4;
				}
				local54 += local48;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("50142, " + arg0 + ", " + 660 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIBIII)V")
	public static void method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method439(arg1, arg0, arg2, anInt741, arg3);
			method439(arg1, arg0 + arg4 - 1, arg2, anInt741, arg3);
			method440(arg3, arg0, arg4, arg1);
			method440(arg3, arg0, arg4, arg1 + arg2 - 1);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("89856, " + arg0 + ", " + arg1 + ", " + -109 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IIIII)V")
	public static void method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1 >= anInt744 && arg1 < anInt745) {
				if (arg0 < anInt746) {
					arg2 -= anInt746 - arg0;
					arg0 = anInt746;
				}
				if (arg0 + arg2 > anInt747) {
					arg2 = anInt747 - arg0;
				}
				@Pc(32) int local32 = arg0 + arg1 * anInt742;
				if (arg3 >= 1 && arg3 <= 1) {
					for (@Pc(41) int local41 = 0; local41 < arg2; local41++) {
						anIntArray205[local32 + local41] = arg4;
					}
				}
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("26821, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(IIIII)V")
	public static void method440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 >= anInt746 && arg3 < anInt747) {
				if (arg1 < anInt744) {
					arg2 -= anInt744 - arg1;
					arg1 = anInt744;
				}
				if (arg1 + arg2 > anInt745) {
					arg2 = anInt745 - arg1;
				}
				@Pc(32) int local32 = arg3 + arg1 * anInt742;
				for (@Pc(38) int local38 = 0; local38 < arg2; local38++) {
					anIntArray205[local32 + local38 * anInt742] = arg0;
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("20929, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
