import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!hb")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "[I")
	public static int[] anIntArray212;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
	public static int anInt743;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
	public static int anInt744;

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
	public static int anInt745;

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
	public static int anInt746;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
	public static int anInt747;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
	public static int anInt748;

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
	public static int anInt749;

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
	public static int anInt750;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
	public static int anInt751;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
	private static int anInt741 = -258;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
	private static int anInt742 = -39972;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "Z")
	private static boolean aBoolean166 = true;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([IIII)V")
	public static void method451(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			anIntArray212 = arg0;
			anInt743 = arg1;
			anInt744 = arg2;
			method453(0, arg1, arg2, 0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("47829, " + arg0 + ", " + -258 + ", " + arg1 + ", " + arg2 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
	public static void method452() {
		try {
			anInt747 = 0;
			anInt745 = 0;
			anInt748 = anInt743;
			anInt746 = anInt744;
			anInt749 = anInt748 - 1;
			anInt750 = anInt748 / 2;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("69360, " + true + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII)V")
	public static void method453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg1 > anInt743) {
				arg1 = anInt743;
			}
			if (arg2 > anInt744) {
				arg2 = anInt744;
			}
			anInt747 = arg3;
			anInt745 = arg0;
			anInt748 = arg1;
			anInt746 = arg2;
			anInt749 = anInt748 - 1;
			anInt750 = anInt748 / 2;
			anInt751 = anInt746 / 2;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("1641, " + 5 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V")
	public static void method454() {
		try {
			@Pc(3) int local3 = anInt743 * anInt744;
			for (@Pc(8) int local8 = 0; local8 < local3; local8++) {
				anIntArray212[local8] = 0;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("63315, " + true + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIII)V")
	public static void method455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 < anInt747) {
				arg5 -= anInt747 - arg0;
				arg0 = anInt747;
			}
			if (arg2 < anInt745) {
				arg1 -= anInt745 - arg2;
				arg2 = anInt745;
			}
			if (arg0 + arg5 > anInt748) {
				arg5 = anInt748 - arg0;
			}
			if (arg2 + arg1 > anInt746) {
				arg1 = anInt746 - arg2;
			}
			@Pc(45) int local45 = 256 - arg4;
			@Pc(53) int local53 = (arg3 >> 16 & 0xFF) * arg4;
			@Pc(61) int local61 = (arg3 >> 8 & 0xFF) * arg4;
			@Pc(67) int local67 = (arg3 & 0xFF) * arg4;
			@Pc(71) int local71 = anInt743 - arg5;
			@Pc(81) int local81 = arg0 + arg2 * anInt743;
			for (@Pc(83) int local83 = 0; local83 < arg1; local83++) {
				for (@Pc(88) int local88 = -arg5; local88 < 0; local88++) {
					@Pc(100) int local100 = (anIntArray212[local81] >> 16 & 0xFF) * local45;
					@Pc(110) int local110 = (anIntArray212[local81] >> 8 & 0xFF) * local45;
					@Pc(118) int local118 = (anIntArray212[local81] & 0xFF) * local45;
					@Pc(140) int local140 = (local53 + local100 >> 8 << 16) + (local61 + local110 >> 8 << 8) + (local67 + local118 >> 8);
					anIntArray212[local81++] = local140;
				}
				local81 += local71;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("24566, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 7861 + ", " + arg4 + ", " + arg5 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIII)V")
	public static void method456(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 < anInt747) {
				arg3 -= anInt747 - arg2;
				arg2 = anInt747;
			}
			if (arg0 < anInt745) {
				arg1 -= anInt745 - arg0;
				arg0 = anInt745;
			}
			if (arg2 + arg3 > anInt748) {
				arg3 = anInt748 - arg2;
			}
			if (arg0 + arg1 > anInt746) {
				arg1 = anInt746 - arg0;
			}
			@Pc(45) int local45 = anInt743 - arg3;
			@Pc(60) int local60 = arg2 + arg0 * anInt743;
			for (@Pc(63) int local63 = -arg1; local63 < 0; local63++) {
				for (@Pc(68) int local68 = -arg3; local68 < 0; local68++) {
					anIntArray212[local60++] = arg4;
				}
				local60 += local45;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("3542, " + -556 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIZ)V")
	public static void method457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			method459(arg2, arg3, arg0, arg4);
			method459(arg2 + arg1 - 1, arg3, arg0, arg4);
			method461(arg4, arg0, arg1, arg2);
			method461(arg4, arg0 + arg3 - 1, arg1, arg2);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("42399, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIZI)V")
	public static void method458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			method460(arg4, arg2, arg3, arg0, arg1);
			method460(arg4, arg2 + arg5 - 1, arg3, arg0, arg1);
			if (arg5 >= 3) {
				method462(anInt742, arg1, arg4, arg5 - 2, arg3, arg2 + 1);
				method462(anInt742, arg1 + arg0 - 1, arg4, arg5 - 2, arg3, arg2 + 1);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("59794, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IIIII)V")
	public static void method459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 >= anInt745 && arg0 < anInt746) {
				if (arg2 < anInt747) {
					arg1 -= anInt747 - arg2;
					arg2 = anInt747;
				}
				if (arg2 + arg1 > anInt748) {
					arg1 = anInt748 - arg2;
				}
				@Pc(35) int local35 = arg2 + arg0 * anInt743;
				for (@Pc(37) int local37 = 0; local37 < arg1; local37++) {
					anIntArray212[local35 + local37] = arg3;
				}
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("61306, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IIIIIZ)V")
	public static void method460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1 >= anInt745 && arg1 < anInt746) {
				if (arg4 < anInt747) {
					arg3 -= anInt747 - arg4;
					arg4 = anInt747;
				}
				if (arg4 + arg3 > anInt748) {
					arg3 = anInt748 - arg4;
				}
				@Pc(32) int local32 = 256 - arg2;
				@Pc(49) int local49 = (arg0 >> 16 & 0xFF) * arg2;
				@Pc(57) int local57 = (arg0 >> 8 & 0xFF) * arg2;
				@Pc(63) int local63 = (arg0 & 0xFF) * arg2;
				@Pc(69) int local69 = arg4 + arg1 * anInt743;
				for (@Pc(71) int local71 = 0; local71 < arg3; local71++) {
					@Pc(83) int local83 = (anIntArray212[local69] >> 16 & 0xFF) * local32;
					@Pc(93) int local93 = (anIntArray212[local69] >> 8 & 0xFF) * local32;
					@Pc(101) int local101 = (anIntArray212[local69] & 0xFF) * local32;
					@Pc(123) int local123 = (local49 + local83 >> 8 << 16) + (local57 + local93 >> 8 << 8) + (local63 + local101 >> 8);
					anIntArray212[local69++] = local123;
				}
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("58444, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(IIIII)V")
	public static void method461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 >= anInt747 && arg1 < anInt748) {
				if (arg3 < anInt745) {
					arg2 -= anInt745 - arg3;
					arg3 = anInt745;
				}
				if (arg3 + arg2 > anInt746) {
					arg2 = anInt746 - arg3;
				}
				@Pc(32) int local32 = arg1 + arg3 * anInt743;
				for (@Pc(37) int local37 = 0; local37 < arg2; local37++) {
					anIntArray212[local32 + local37 * anInt743] = arg0;
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("38755, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -463 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IIIIII)V")
	private static void method462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg1 >= anInt747 && arg1 < anInt748) {
				if (arg5 < anInt745) {
					arg3 -= anInt745 - arg5;
					arg5 = anInt745;
				}
				if (arg5 + arg3 > anInt746) {
					arg3 = anInt746 - arg5;
				}
				@Pc(30) int local30 = 256 - arg4;
				if (arg0 != -39972) {
					aBoolean166 = !aBoolean166;
				}
				@Pc(47) int local47 = (arg2 >> 16 & 0xFF) * arg4;
				@Pc(55) int local55 = (arg2 >> 8 & 0xFF) * arg4;
				@Pc(61) int local61 = (arg2 & 0xFF) * arg4;
				@Pc(67) int local67 = arg1 + arg5 * anInt743;
				for (@Pc(69) int local69 = 0; local69 < arg3; local69++) {
					@Pc(81) int local81 = (anIntArray212[local67] >> 16 & 0xFF) * local30;
					@Pc(91) int local91 = (anIntArray212[local67] >> 8 & 0xFF) * local30;
					@Pc(99) int local99 = (anIntArray212[local67] & 0xFF) * local30;
					@Pc(121) int local121 = (local47 + local81 >> 8 << 16) + (local55 + local91 >> 8 << 8) + (local61 + local99 >> 8);
					anIntArray212[local67] = local121;
					local67 += anInt743;
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("49720, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
