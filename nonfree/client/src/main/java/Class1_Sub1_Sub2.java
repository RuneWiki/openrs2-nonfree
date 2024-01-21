import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!hb")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "B")
	private static byte aByte19;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "[I")
	public static int[] anIntArray205;

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
	public static int anInt734;

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
	public static int anInt735;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
	public static int anInt736;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
	public static int anInt737;

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
	public static int anInt738;

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
	public static int anInt739;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
	public static int anInt740;

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
	public static int anInt741;

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
	public static int anInt742;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
	private static int anInt731 = 8;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
	private static int anInt732 = -15373;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
	private static int anInt733 = 705;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "Z")
	private static boolean aBoolean148 = true;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBI[I)V")
	public static void method432(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			anIntArray205 = arg2;
			anInt734 = arg1;
			anInt735 = arg0;
			method434(0, 0, arg0, arg1);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("52214, " + arg0 + ", " + 102 + ", " + arg1 + ", " + arg2 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public static void method433(@OriginalArg(0) int arg0) {
		try {
			anInt738 = 0;
			anInt736 = 0;
			anInt739 = anInt734;
			anInt737 = anInt735;
			anInt740 = anInt739 - 1;
			@Pc(15) boolean local15 = false;
			anInt741 = anInt739 / 2;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("23604, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZIIII)V")
	public static void method434(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg3 > anInt734) {
				arg3 = anInt734;
			}
			if (arg2 > anInt735) {
				arg2 = anInt735;
			}
			anInt738 = arg0;
			anInt736 = arg1;
			anInt739 = arg3;
			anInt737 = arg2;
			anInt740 = anInt739 - 1;
			anInt741 = anInt739 / 2;
			anInt742 = anInt737 / 2;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("82692, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	public static void method435(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int local5 = anInt734 * anInt735;
			if (arg0 < 0) {
				for (@Pc(12) int local12 = 0; local12 < local5; local12++) {
					anIntArray205[local12] = 0;
				}
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("33811, " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIBI)V")
	public static void method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 < anInt738) {
				arg1 -= anInt738 - arg0;
				arg0 = anInt738;
			}
			if (arg4 < anInt736) {
				arg3 -= anInt736 - arg4;
				arg4 = anInt736;
			}
			if (arg0 + arg1 > anInt739) {
				arg1 = anInt739 - arg0;
			}
			if (arg4 + arg3 > anInt737) {
				arg3 = anInt737 - arg4;
			}
			@Pc(50) int local50 = anInt734 - arg1;
			@Pc(56) int local56 = arg0 + arg4 * anInt734;
			for (@Pc(59) int local59 = -arg3; local59 < 0; local59++) {
				for (@Pc(64) int local64 = -arg1; local64 < 0; local64++) {
					anIntArray205[local56++] = arg2;
				}
				local56 += local50;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("79345, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 5 + ", " + arg4 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIB)V")
	public static void method437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			method438(arg2, arg4, arg3, arg0);
			method438(arg2, arg4, arg3, arg0 + arg1 - 1);
			method439(arg0, arg4, arg2, arg1);
			if (aByte19 == 0) {
				method439(arg0, arg4, arg2 + arg3 - 1, arg1);
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("46401, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBIII)V")
	public static void method438(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 >= anInt736 && arg3 < anInt737) {
				if (arg0 < anInt738) {
					arg2 -= anInt738 - arg0;
					arg0 = anInt738;
				}
				if (arg0 + arg2 > anInt739) {
					arg2 = anInt739 - arg0;
				}
				@Pc(32) int local32 = arg0 + arg3 * anInt734;
				for (@Pc(39) int local39 = 0; local39 < arg2; local39++) {
					anIntArray205[local32 + local39] = arg1;
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("601, " + arg0 + ", " + 9 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIZ)V")
	public static void method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 >= anInt738 && arg2 < anInt739) {
				if (arg0 < anInt736) {
					arg3 -= anInt736 - arg0;
					arg0 = anInt736;
				}
				if (arg0 + arg3 > anInt737) {
					arg3 = anInt737 - arg0;
				}
				@Pc(36) int local36 = arg2 + arg0 * anInt734;
				for (@Pc(38) int local38 = 0; local38 < arg3; local38++) {
					anIntArray205[local36 + local38 * anInt734] = arg1;
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("56886, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
