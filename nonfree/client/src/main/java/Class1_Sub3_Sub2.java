import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fb")
public class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "Z")
	private static boolean aBoolean125;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "[I")
	public static int[] anIntArray178;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	public static int anInt524;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	public static int anInt525;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public static int anInt526;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	public static int anInt527;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public static int anInt528;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
	public static int anInt529;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	public static int anInt530;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
	public static int anInt531;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
	public static int anInt532;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
	private static int anInt521 = 22869;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
	private static int anInt522 = 770;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
	private static int anInt523 = 9;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "B")
	private static byte aByte32 = 61;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II[II)V")
	public static void method354(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		try {
			anIntArray178 = arg1;
			anInt524 = arg2;
			anInt525 = arg0;
			method356(0, arg2, arg0, 0);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("89774, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method355() {
		try {
			anInt528 = 0;
			anInt526 = 0;
			anInt529 = anInt524;
			anInt527 = anInt525;
			anInt530 = anInt529 - 1;
			anInt531 = anInt529 / 2;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("30452, " + 3 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V")
	public static void method356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg1 > anInt524) {
				arg1 = anInt524;
			}
			if (arg2 > anInt525) {
				arg2 = anInt525;
			}
			anInt528 = arg0;
			anInt526 = arg3;
			anInt529 = arg1;
			anInt527 = arg2;
			anInt530 = anInt529 - 1;
			anInt531 = anInt529 / 2;
			anInt532 = anInt527 / 2;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("28523, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 770 + ", " + arg3 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public static void method357(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(7) int local7 = anInt524 * anInt525;
			for (@Pc(9) int local9 = 0; local9 < local7; local9++) {
				anIntArray178[local9] = 0;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("74389, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIII)V")
	public static void method358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 < anInt528) {
				arg1 -= anInt528 - arg2;
				arg2 = anInt528;
			}
			if (arg0 < anInt526) {
				arg3 -= anInt526 - arg0;
				arg0 = anInt526;
			}
			if (arg2 + arg1 > anInt529) {
				arg1 = anInt529 - arg2;
			}
			if (arg0 + arg3 > anInt527) {
				arg3 = anInt527 - arg0;
			}
			@Pc(54) int local54 = anInt524 - arg1;
			@Pc(60) int local60 = arg2 + arg0 * anInt524;
			for (@Pc(63) int local63 = -arg3; local63 < 0; local63++) {
				for (@Pc(68) int local68 = -arg1; local68 < 0; local68++) {
					anIntArray178[local60++] = arg4;
				}
				local60 += local54;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("77650, " + arg0 + ", " + arg1 + ", " + 8 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IBIIII)V")
	public static void method359(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method360(arg2, arg4, arg0, arg3, anInt523);
			method360(arg2 + arg1 - 1, arg4, arg0, arg3, anInt523);
			method361(arg1, arg2, arg3, arg4);
			method361(arg1, arg2, arg3 + arg0 - 1, arg4);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("36015, " + arg0 + ", " + -103 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(IIIII)V")
	public static void method360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(9) int local9;
			if (arg4 < 9 || arg4 > 9) {
				for (local9 = 1; local9 > 0; local9++) {
				}
			}
			if (arg0 >= anInt526 && arg0 < anInt527) {
				if (arg3 < anInt528) {
					arg2 -= anInt528 - arg3;
					arg3 = anInt528;
				}
				if (arg3 + arg2 > anInt529) {
					arg2 = anInt529 - arg3;
				}
				local9 = arg3 + arg0 * anInt524;
				for (@Pc(49) int local49 = 0; local49 < arg2; local49++) {
					anIntArray178[local9 + local49] = arg1;
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("24109, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(IIIII)V")
	public static void method361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt528 && arg2 < anInt529) {
				if (arg1 < anInt526) {
					arg0 -= anInt526 - arg1;
					arg1 = anInt526;
				}
				if (arg1 + arg0 > anInt527) {
					arg0 = anInt527 - arg1;
				}
				@Pc(32) int local32 = arg2 + arg1 * anInt524;
				for (@Pc(42) int local42 = 0; local42 < arg0; local42++) {
					anIntArray178[local32 + local42 * anInt524] = arg3;
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("9090, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	protected Class1_Sub3_Sub2() {
	}
}
