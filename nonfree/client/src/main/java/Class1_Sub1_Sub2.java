import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gb")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Z")
	private static boolean aBoolean193;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "[I")
	public static int[] anIntArray210;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	public static int anInt670;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public static int anInt671;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public static int anInt672;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	public static int anInt673;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public static int anInt674;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public static int anInt675;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	public static int anInt676;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
	public static int anInt677;

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
	public static int anInt678;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Z")
	private static boolean aBoolean192 = true;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "B")
	private static byte aByte28 = 2;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	private static int anInt668 = 658;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
	private static int anInt669 = 7;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([IIII)V")
	public static void method430(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			anIntArray210 = arg0;
			anInt670 = arg2;
			anInt671 = arg1;
			method432(0, arg2, 0, arg1);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("3165, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -578 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	public static void method431() {
		try {
			anInt674 = 0;
			anInt672 = 0;
			anInt675 = anInt670;
			anInt673 = anInt671;
			anInt676 = anInt675 - 1;
			anInt677 = anInt675 / 2;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("57480, " + -29844 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
	public static void method432(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg1 > anInt670) {
				arg1 = anInt670;
			}
			if (arg3 > anInt671) {
				arg3 = anInt671;
			}
			anInt674 = arg0;
			anInt672 = arg2;
			anInt675 = arg1;
			anInt673 = arg3;
			anInt676 = anInt675 - 1;
			anInt677 = anInt675 / 2;
			anInt678 = anInt673 / 2;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("80561, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
	public static void method433() {
		try {
			@Pc(6) int local6 = anInt670 * anInt671;
			for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
				anIntArray210[local8] = 0;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("61388, " + true + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIBII)V")
	public static void method434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 < anInt674) {
				arg0 -= anInt674 - arg3;
				arg3 = anInt674;
			}
			if (arg4 < anInt672) {
				arg5 -= anInt672 - arg4;
				arg4 = anInt672;
			}
			if (arg3 + arg0 > anInt675) {
				arg0 = anInt675 - arg3;
			}
			if (arg4 + arg5 > anInt673) {
				arg5 = anInt673 - arg4;
			}
			@Pc(45) int local45 = 256 - arg2;
			@Pc(53) int local53 = (arg1 >> 16 & 0xFF) * arg2;
			@Pc(61) int local61 = (arg1 >> 8 & 0xFF) * arg2;
			@Pc(67) int local67 = (arg1 & 0xFF) * arg2;
			@Pc(75) int local75 = anInt670 - arg0;
			@Pc(81) int local81 = arg3 + arg4 * anInt670;
			for (@Pc(83) int local83 = 0; local83 < arg5; local83++) {
				for (@Pc(88) int local88 = -arg0; local88 < 0; local88++) {
					@Pc(100) int local100 = (anIntArray210[local81] >> 16 & 0xFF) * local45;
					@Pc(110) int local110 = (anIntArray210[local81] >> 8 & 0xFF) * local45;
					@Pc(118) int local118 = (anIntArray210[local81] & 0xFF) * local45;
					@Pc(140) int local140 = (local53 + local100 >> 8 << 16) + (local61 + local110 >> 8 << 8) + (local67 + local118 >> 8);
					anIntArray210[local81++] = local140;
				}
				local81 += local75;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("31993, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 42 + ", " + arg4 + ", " + arg5 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII)V")
	public static void method435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg4 < anInt674) {
				arg1 -= anInt674 - arg4;
				arg4 = anInt674;
			}
			if (arg2 < anInt672) {
				arg3 -= anInt672 - arg2;
				arg2 = anInt672;
			}
			if (arg4 + arg1 > anInt675) {
				arg1 = anInt675 - arg4;
			}
			if (arg2 + arg3 > anInt673) {
				arg3 = anInt673 - arg2;
			}
			@Pc(45) int local45 = anInt670 - arg1;
			@Pc(51) int local51 = arg4 + arg2 * anInt670;
			for (@Pc(54) int local54 = -arg3; local54 < 0; local54++) {
				for (@Pc(59) int local59 = -arg1; local59 < 0; local59++) {
					anIntArray210[local51++] = arg0;
				}
				local51 += local45;
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("13245, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIIII)V")
	public static void method436(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method438(arg2, arg4, arg3, arg0);
			method438(arg2, arg4, arg3 + arg1 - 1, arg0);
			method440(arg1, arg3, aByte28, arg2, arg4);
			method440(arg1, arg3, aByte28, arg2 + arg0 - 1, arg4);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("96697, " + arg0 + ", " + -17527 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIII)V")
	public static void method437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method439(arg4, arg0, arg5, arg3, arg1);
			method439(arg4 + arg2 - 1, arg0, arg5, arg3, arg1);
			if (arg2 >= 3) {
				method441(arg0, arg3, arg1, arg4 + 1, arg2 - 2);
				method441(arg0, arg3, arg1 + arg5 - 1, arg4 + 1, arg2 - 2);
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("2077, " + arg0 + ", " + arg1 + ", " + 1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIII)V")
	public static void method438(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt672 && arg2 < anInt673) {
				if (arg0 < anInt674) {
					arg3 -= anInt674 - arg0;
					arg0 = anInt674;
				}
				if (arg0 + arg3 > anInt675) {
					arg3 = anInt675 - arg0;
				}
				@Pc(37) int local37 = arg0 + arg2 * anInt670;
				for (@Pc(39) int local39 = 0; local39 < arg3; local39++) {
					anIntArray210[local37 + local39] = arg1;
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("7442, " + 3 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIZI)V")
	private static void method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt672 && arg0 < anInt673) {
				if (arg4 < anInt674) {
					arg2 -= anInt674 - arg4;
					arg4 = anInt674;
				}
				if (arg4 + arg2 > anInt675) {
					arg2 = anInt675 - arg4;
				}
				@Pc(30) int local30 = 256 - arg1;
				@Pc(41) int local41 = (arg3 >> 16 & 0xFF) * arg1;
				@Pc(49) int local49 = (arg3 >> 8 & 0xFF) * arg1;
				@Pc(55) int local55 = (arg3 & 0xFF) * arg1;
				@Pc(61) int local61 = arg4 + arg0 * anInt670;
				for (@Pc(63) int local63 = 0; local63 < arg2; local63++) {
					@Pc(75) int local75 = (anIntArray210[local61] >> 16 & 0xFF) * local30;
					@Pc(85) int local85 = (anIntArray210[local61] >> 8 & 0xFF) * local30;
					@Pc(93) int local93 = (anIntArray210[local61] & 0xFF) * local30;
					@Pc(115) int local115 = (local41 + local75 >> 8 << 16) + (local49 + local85 >> 8 << 8) + (local55 + local93 >> 8);
					anIntArray210[local61++] = local115;
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("13568, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIBII)V")
	public static void method440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 == 2 && (arg3 >= anInt674 && arg3 < anInt675)) {
				if (arg1 < anInt672) {
					arg0 -= anInt672 - arg1;
					arg1 = anInt672;
				}
				if (arg1 + arg0 > anInt673) {
					arg0 = anInt673 - arg1;
				}
				@Pc(36) int local36 = arg3 + arg1 * anInt670;
				for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
					anIntArray210[local36 + local38 * anInt670] = arg4;
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("51171, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(IIIIII)V")
	private static void method441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 >= anInt674 && arg2 < anInt675) {
				if (arg3 < anInt672) {
					arg4 -= anInt672 - arg3;
					arg3 = anInt672;
				}
				if (arg3 + arg4 > anInt673) {
					arg4 = anInt673 - arg3;
				}
				@Pc(30) int local30 = 256 - arg0;
				@Pc(38) int local38 = (arg1 >> 16 & 0xFF) * arg0;
				@Pc(46) int local46 = (arg1 >> 8 & 0xFF) * arg0;
				@Pc(52) int local52 = (arg1 & 0xFF) * arg0;
				@Pc(61) int local61 = arg2 + arg3 * anInt670;
				for (@Pc(63) int local63 = 0; local63 < arg4; local63++) {
					@Pc(75) int local75 = (anIntArray210[local61] >> 16 & 0xFF) * local30;
					@Pc(85) int local85 = (anIntArray210[local61] >> 8 & 0xFF) * local30;
					@Pc(93) int local93 = (anIntArray210[local61] & 0xFF) * local30;
					@Pc(115) int local115 = (local38 + local75 >> 8 << 16) + (local46 + local85 >> 8 << 8) + (local52 + local93 >> 8);
					anIntArray210[local61] = local115;
					local61 += anInt670;
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("74916, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -770 + ", " + arg4 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
