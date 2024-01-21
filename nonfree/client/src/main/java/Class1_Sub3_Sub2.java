import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!fb")
public class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
	private static int anInt506;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "[I")
	public static int[] anIntArray178;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	public static int anInt507;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	public static int anInt508;

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public static int anInt509;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	public static int anInt510;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
	public static int anInt511;

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
	public static int anInt512;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
	public static int anInt513;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
	public static int anInt514;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
	public static int anInt515;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
	private static int anInt505 = 4;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "Z")
	private static boolean aBoolean137 = true;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "Z")
	private static boolean aBoolean138 = true;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZI[I)V")
	public static void method339(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			anIntArray178 = arg2;
			anInt507 = arg0;
			anInt508 = arg1;
			method341(aBoolean137, 0, 0, arg0, arg1);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("24030, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
	public static void method340() {
		try {
			anInt511 = 0;
			anInt509 = 0;
			anInt512 = anInt507;
			anInt510 = anInt508;
			anInt513 = anInt512 - 1;
			anInt514 = anInt512 / 2;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("88522, " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZIIII)V")
	public static void method341(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg3 > anInt507) {
				arg3 = anInt507;
			}
			if (arg4 > anInt508) {
				arg4 = anInt508;
			}
			anInt511 = arg1;
			if (arg0) {
				anInt509 = arg2;
				anInt512 = arg3;
				anInt510 = arg4;
				anInt513 = anInt512 - 1;
				anInt514 = anInt512 / 2;
				anInt515 = anInt510 / 2;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("90131, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(Z)V")
	public static void method342() {
		try {
			@Pc(3) int local3 = anInt507 * anInt508;
			for (@Pc(13) int local13 = 0; local13 < local3; local13++) {
				anIntArray178[local13] = 0;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("78265, " + true + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIBII)V")
	public static void method343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 < anInt511) {
				arg3 -= anInt511 - arg2;
				arg2 = anInt511;
			}
			if (arg1 < anInt509) {
				arg4 -= anInt509 - arg1;
				arg1 = anInt509;
			}
			if (arg2 + arg3 > anInt512) {
				arg3 = anInt512 - arg2;
			}
			if (arg1 + arg4 > anInt510) {
				arg4 = anInt510 - arg1;
			}
			@Pc(55) int local55 = anInt507 - arg3;
			@Pc(61) int local61 = arg2 + arg1 * anInt507;
			for (@Pc(64) int local64 = -arg4; local64 < 0; local64++) {
				for (@Pc(69) int local69 = -arg3; local69 < 0; local69++) {
					anIntArray178[local61++] = arg0;
				}
				local61 += local55;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("60480, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 107 + ", " + arg3 + ", " + arg4 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIII)V")
	public static void method344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			method345(arg3, arg2, arg0, arg1);
			method345(arg3, arg2 + arg4 - 1, arg0, arg1);
			method346(arg4, arg1, arg2, arg3);
			method346(arg4, arg1, arg2, arg3 + arg0 - 1);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("96717, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 649 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V")
	public static void method345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 >= anInt509 && arg1 < anInt510) {
				if (arg0 < anInt511) {
					arg2 -= anInt511 - arg0;
					arg0 = anInt511;
				}
				if (arg0 + arg2 > anInt512) {
					arg2 = anInt512 - arg0;
				}
				@Pc(32) int local32 = arg0 + arg1 * anInt507;
				for (@Pc(38) int local38 = 0; local38 < arg2; local38++) {
					anIntArray178[local32 + local38] = arg3;
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("67167, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + ", " + arg3 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZIII)V")
	public static void method346(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 >= anInt511 && arg3 < anInt512) {
				if (arg2 < anInt509) {
					arg0 -= anInt509 - arg2;
					arg2 = anInt509;
				}
				if (arg2 + arg0 > anInt510) {
					arg0 = anInt510 - arg2;
				}
				@Pc(40) int local40 = arg3 + arg2 * anInt507;
				for (@Pc(42) int local42 = 0; local42 < arg0; local42++) {
					anIntArray178[local40 + local42 * anInt507] = arg1;
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("35024, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
	protected Class1_Sub3_Sub2() {
	}
}
