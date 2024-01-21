import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fb")
public class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "[I")
	public static int[] anIntArray178;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
	public static int anInt516;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	public static int anInt517;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	public static int anInt518;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public static int anInt519;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	public static int anInt520;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public static int anInt521;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
	public static int anInt522;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	public static int anInt523;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
	public static int anInt524;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Z")
	private static boolean aBoolean132 = true;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
	private static int anInt514 = 742;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
	private static int anInt515 = 5;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "([IIIB)V")
	public static void method350(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			anIntArray178 = arg0;
			anInt516 = arg1;
			anInt517 = arg2;
			@Pc(10) boolean local10 = false;
			method352(0, 0, arg1, arg2);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("24329, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public static void method351() {
		try {
			anInt520 = 0;
			anInt518 = 0;
			anInt521 = anInt516;
			anInt519 = anInt517;
			anInt522 = anInt521 - 1;
			anInt523 = anInt521 / 2;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("45325, " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V")
	public static void method352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg2 > anInt516) {
				arg2 = anInt516;
			}
			if (arg3 > anInt517) {
				arg3 = anInt517;
			}
			anInt520 = arg0;
			anInt518 = arg1;
			anInt521 = arg2;
			anInt519 = arg3;
			anInt522 = anInt521 - 1;
			anInt523 = anInt521 / 2;
			anInt524 = anInt519 / 2;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("29499, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
	public static void method353() {
		try {
			@Pc(5) int local5 = anInt516 * anInt517;
			for (@Pc(16) int local16 = 0; local16 < local5; local16++) {
				anIntArray178[local16] = 0;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("75357, " + true + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIII)V")
	public static void method354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 < anInt520) {
				arg1 -= anInt520 - arg0;
				arg0 = anInt520;
			}
			if (arg3 < anInt518) {
				arg4 -= anInt518 - arg3;
				arg3 = anInt518;
			}
			if (arg0 + arg1 > anInt521) {
				arg1 = anInt521 - arg0;
			}
			if (arg3 + arg4 > anInt519) {
				arg4 = anInt519 - arg3;
			}
			@Pc(52) int local52 = anInt516 - arg1;
			@Pc(58) int local58 = arg0 + arg3 * anInt516;
			for (@Pc(61) int local61 = -arg4; local61 < 0; local61++) {
				for (@Pc(66) int local66 = -arg1; local66 < 0; local66++) {
					anIntArray178[local58++] = arg2;
				}
				local58 += local52;
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("82621, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 5 + ", " + arg3 + ", " + arg4 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIZI)V")
	public static void method355(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			method356(arg0, arg3, anInt514, arg2, arg1);
			method356(arg0, arg3 + arg4 - 1, anInt514, arg2, arg1);
			method357(arg1, arg3, arg4, arg2);
			method357(arg1, arg3, arg4, arg2 + arg0 - 1);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("70734, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(IIIII)V")
	public static void method356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 <= 0) {
				aBoolean132 = !aBoolean132;
			}
			if (arg1 >= anInt518 && arg1 < anInt519) {
				if (arg3 < anInt520) {
					arg0 -= anInt520 - arg3;
					arg3 = anInt520;
				}
				if (arg3 + arg0 > anInt521) {
					arg0 = anInt521 - arg3;
				}
				@Pc(40) int local40 = arg3 + arg1 * anInt516;
				for (@Pc(42) int local42 = 0; local42 < arg0; local42++) {
					anIntArray178[local40 + local42] = arg4;
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("56980, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(IIIII)V")
	public static void method357(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 >= anInt520 && arg3 < anInt521) {
				if (arg1 < anInt518) {
					arg2 -= anInt518 - arg1;
					arg1 = anInt518;
				}
				if (arg1 + arg2 > anInt519) {
					arg2 = anInt519 - arg1;
				}
				@Pc(40) int local40 = arg3 + arg1 * anInt516;
				for (@Pc(42) int local42 = 0; local42 < arg2; local42++) {
					anIntArray178[local40 + local42 * anInt516] = arg0;
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("19988, " + -458 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	protected Class1_Sub3_Sub2() {
	}
}
