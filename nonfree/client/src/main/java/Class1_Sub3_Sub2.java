import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fb")
public class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "[I")
	public static int[] anIntArray159;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
	public static int anInt406;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
	public static int anInt407;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	public static int anInt408;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	public static int anInt409;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public static int anInt410;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	public static int anInt411;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public static int anInt412;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
	public static int anInt413;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	public static int anInt414;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
	private static int anInt404 = -222;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
	private static int anInt405 = 553;

	static {
		aBoolean114 = true;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I[III)V")
	public static void method313(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		try {
			anIntArray159 = arg1;
			anInt406 = arg0;
			anInt407 = arg2;
			method315(arg2, arg0, 0, 0);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("559, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -810 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method314() {
		try {
			anInt410 = 0;
			anInt408 = 0;
			anInt411 = anInt406;
			anInt409 = anInt407;
			anInt412 = anInt411 - 1;
			anInt413 = anInt411 / 2;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("87814, " + -971 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V")
	public static void method315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg1 > anInt406) {
				arg1 = anInt406;
			}
			if (arg0 > anInt407) {
				arg0 = anInt407;
			}
			anInt410 = arg3;
			anInt408 = arg2;
			anInt411 = arg1;
			anInt409 = arg0;
			anInt412 = anInt411 - 1;
			anInt413 = anInt411 / 2;
			anInt414 = anInt409 / 2;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("87648, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 17913 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public static void method316() {
		try {
			@Pc(3) int local3 = anInt406 * anInt407;
			for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
				anIntArray159[local9] = 0;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("20237, " + 2 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIII)V")
	public static void method317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg5 < anInt410) {
				arg4 -= anInt410 - arg5;
				arg5 = anInt410;
			}
			if (arg3 < anInt408) {
				arg2 -= anInt408 - arg3;
				arg3 = anInt408;
			}
			if (arg5 + arg4 > anInt411) {
				arg4 = anInt411 - arg5;
			}
			if (arg3 + arg2 > anInt409) {
				arg2 = anInt409 - arg3;
			}
			@Pc(45) int local45 = anInt406 - arg4;
			@Pc(51) int local51 = arg5 + arg3 * anInt406;
			for (@Pc(54) int local54 = -arg2; local54 < 0; local54++) {
				for (@Pc(59) int local59 = -arg4; local59 < 0; local59++) {
					anIntArray159[local51++] = arg0;
				}
				local51 += local45;
			}
			if (arg1 >= 0) {
				;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("96103, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(IIIIII)V")
	public static void method318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method319(arg2, arg4, arg1, arg0);
			method319(arg2, arg4, arg1 + arg3 - 1, arg0);
			method320(arg0, arg1, arg4, arg3);
			method320(arg0, arg1, arg4 + arg2 - 1, arg3);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("47790, " + arg0 + ", " + arg1 + ", " + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZIII)V")
	public static void method319(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt408 && arg2 < anInt409) {
				if (arg1 < anInt410) {
					arg0 -= anInt410 - arg1;
					arg1 = anInt410;
				}
				if (arg1 + arg0 > anInt411) {
					arg0 = anInt411 - arg1;
				}
				@Pc(32) int local32 = arg1 + arg2 * anInt406;
				for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
					anIntArray159[local32 + local38] = arg3;
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("38683, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(IIIII)V")
	public static void method320(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt410 && arg2 < anInt411) {
				if (arg1 < anInt408) {
					arg3 -= anInt408 - arg1;
					arg1 = anInt408;
				}
				if (arg1 + arg3 > anInt409) {
					arg3 = anInt409 - arg1;
				}
				@Pc(36) int local36 = arg2 + arg1 * anInt406;
				for (@Pc(38) int local38 = 0; local38 < arg3; local38++) {
					anIntArray159[local36 + local38 * anInt406] = arg0;
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("17217, " + 31405 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	protected Class1_Sub3_Sub2() {
	}
}
