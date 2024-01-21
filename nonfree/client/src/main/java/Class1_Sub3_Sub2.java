import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fb")
public class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Z")
	private static boolean aBoolean123;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "[I")
	public static int[] anIntArray178;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	public static int anInt532;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	public static int anInt533;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public static int anInt534;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	public static int anInt535;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public static int anInt536;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
	public static int anInt537;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	public static int anInt538;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
	public static int anInt539;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
	public static int anInt540;

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
	private static int anInt529 = -280;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
	private static int anInt530 = 824;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "Z")
	private static boolean aBoolean124 = true;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
	private static int anInt531 = -373;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI[II)V")
	public static void method350(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		try {
			anIntArray178 = arg2;
			anInt532 = arg3;
			@Pc(10) boolean local10 = false;
			anInt533 = arg1;
			method352(arg1, anInt529, 0, 0, arg3);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("7069, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method351() {
		try {
			anInt536 = 0;
			anInt534 = 0;
			anInt537 = anInt532;
			anInt535 = anInt533;
			anInt538 = anInt537 - 1;
			anInt539 = anInt537 / 2;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("4933, " + 0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V")
	public static void method352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg4 > anInt532) {
				arg4 = anInt532;
			}
			if (arg0 > anInt533) {
				arg0 = anInt533;
			}
			anInt536 = arg2;
			if (arg1 >= 0) {
				anInt531 = -181;
			}
			anInt534 = arg3;
			anInt537 = arg4;
			anInt535 = arg0;
			anInt538 = anInt537 - 1;
			anInt539 = anInt537 / 2;
			anInt540 = anInt535 / 2;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("25883, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public static void method353() {
		try {
			@Pc(7) int local7 = anInt532 * anInt533;
			for (@Pc(9) int local9 = 0; local9 < local7; local9++) {
				anIntArray178[local9] = 0;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("27726, " + 14799 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIII)V")
	public static void method354(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 < anInt536) {
				arg3 -= anInt536 - arg1;
				arg1 = anInt536;
			}
			if (arg2 < anInt534) {
				arg4 -= anInt534 - arg2;
				arg2 = anInt534;
			}
			if (arg1 + arg3 > anInt537) {
				arg3 = anInt537 - arg1;
			}
			if (arg2 + arg4 > anInt535) {
				arg4 = anInt535 - arg2;
			}
			@Pc(48) int local48 = anInt532 - arg3;
			@Pc(54) int local54 = arg1 + arg2 * anInt532;
			for (@Pc(57) int local57 = -arg4; local57 < 0; local57++) {
				for (@Pc(62) int local62 = -arg3; local62 < 0; local62++) {
					anIntArray178[local54++] = arg0;
				}
				local54 += local48;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("98558, " + arg0 + ", " + -288 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZIIII)V")
	public static void method355(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			method356(arg0, arg3, arg2, arg5);
			method356(arg0, arg3 + arg4 - 1, arg2, arg5);
			method357(arg3, arg0, arg4, arg2);
			if (arg1) {
				aBoolean123 = !aBoolean123;
			}
			method357(arg3, arg0, arg4, arg2 + arg5 - 1);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("48867, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIZ)V")
	public static void method356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 >= anInt534 && arg1 < anInt535) {
				if (arg2 < anInt536) {
					arg3 -= anInt536 - arg2;
					arg2 = anInt536;
				}
				if (arg2 + arg3 > anInt537) {
					arg3 = anInt537 - arg2;
				}
				@Pc(36) int local36 = arg2 + arg1 * anInt532;
				for (@Pc(38) int local38 = 0; local38 < arg3; local38++) {
					anIntArray178[local36 + local38] = arg0;
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("46267, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(IIIII)V")
	public static void method357(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 >= anInt536 && arg3 < anInt537) {
				if (arg0 < anInt534) {
					arg2 -= anInt534 - arg0;
					arg0 = anInt534;
				}
				if (arg0 + arg2 > anInt535) {
					arg2 = anInt535 - arg0;
				}
				@Pc(32) int local32 = arg3 + arg0 * anInt532;
				for (@Pc(42) int local42 = 0; local42 < arg2; local42++) {
					anIntArray178[local32 + local42 * anInt532] = arg1;
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("66480, " + arg0 + ", " + 537 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	protected Class1_Sub3_Sub2() {
	}
}
