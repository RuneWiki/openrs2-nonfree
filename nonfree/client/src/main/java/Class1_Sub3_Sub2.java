import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fb")
public class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
	private static int anInt526;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
	private static int anInt527;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "[I")
	public static int[] anIntArray178;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
	public static int anInt528;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
	public static int anInt529;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	public static int anInt530;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	public static int anInt531;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public static int anInt532;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	public static int anInt533;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public static int anInt534;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
	public static int anInt535;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	public static int anInt536;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "Z")
	private static boolean aBoolean123 = true;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I[III)V")
	public static void method354(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		try {
			anIntArray178 = arg1;
			anInt528 = arg0;
			anInt529 = arg2;
			method356(arg2, 0, arg0, 0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("39631, " + arg0 + ", " + arg1 + ", " + -657 + ", " + arg2 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method355() {
		try {
			anInt532 = 0;
			anInt530 = 0;
			anInt533 = anInt528;
			anInt531 = anInt529;
			anInt534 = anInt533 - 1;
			anInt535 = anInt533 / 2;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("74265, " + 0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V")
	public static void method356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg2 > anInt528) {
				arg2 = anInt528;
			}
			if (arg0 > anInt529) {
				arg0 = anInt529;
			}
			anInt532 = arg3;
			anInt530 = arg1;
			anInt533 = arg2;
			anInt531 = arg0;
			anInt534 = anInt533 - 1;
			anInt535 = anInt533 / 2;
			anInt536 = anInt531 / 2;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("56986, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 789 + ", " + arg3 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public static void method357(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 87 / arg0;
			@Pc(7) int local7 = anInt528 * anInt529;
			for (@Pc(9) int local9 = 0; local9 < local7; local9++) {
				anIntArray178[local9] = 0;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("45949, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIBII)V")
	public static void method358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 < anInt532) {
				arg3 -= anInt532 - arg1;
				arg1 = anInt532;
			}
			if (arg0 < anInt530) {
				arg4 -= anInt530 - arg0;
				arg0 = anInt530;
			}
			if (arg1 + arg3 > anInt533) {
				arg3 = anInt533 - arg1;
			}
			if (arg0 + arg4 > anInt531) {
				arg4 = anInt531 - arg0;
			}
			@Pc(50) int local50 = anInt528 - arg3;
			@Pc(56) int local56 = arg1 + arg0 * anInt528;
			for (@Pc(59) int local59 = -arg4; local59 < 0; local59++) {
				for (@Pc(64) int local64 = -arg3; local64 < 0; local64++) {
					anIntArray178[local56++] = arg2;
				}
				local56 += local50;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("10678, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 93 + ", " + arg3 + ", " + arg4 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIII)V")
	public static void method359(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method360(arg1, arg3, arg4, arg0);
			method360(arg1, arg3 + arg2 - 1, arg4, arg0);
			method361(arg1, anInt527, arg3, arg2, arg0);
			method361(arg1, anInt527, arg3, arg2, arg0 + arg4 - 1);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("74170, " + 3 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(IIIII)V")
	public static void method360(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 >= anInt530 && arg1 < anInt531) {
				if (arg3 < anInt532) {
					arg2 -= anInt532 - arg3;
					arg3 = anInt532;
				}
				if (arg3 + arg2 > anInt533) {
					arg2 = anInt533 - arg3;
				}
				@Pc(32) int local32 = arg3 + arg1 * anInt528;
				for (@Pc(37) int local37 = 0; local37 < arg2; local37++) {
					anIntArray178[local32 + local37] = arg0;
				}
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("17925, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(IIIII)V")
	public static void method361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg4 >= anInt532 && arg4 < anInt533) {
				if (arg2 < anInt530) {
					arg3 -= anInt530 - arg2;
					arg2 = anInt530;
				}
				if (arg2 + arg3 > anInt531) {
					arg3 = anInt531 - arg2;
				}
				@Pc(32) int local32 = arg4 + arg2 * anInt528;
				if (arg1 != 0) {
					anInt527 = 71;
				}
				for (@Pc(38) int local38 = 0; local38 < arg3; local38++) {
					anIntArray178[local32 + local38 * anInt528] = arg0;
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("40773, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	protected Class1_Sub3_Sub2() {
	}
}
