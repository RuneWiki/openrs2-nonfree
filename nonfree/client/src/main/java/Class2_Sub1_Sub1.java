import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VDGJUQAS")
public class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!VDGJUQAS", name = "i", descriptor = "I")
	private static int anInt685;

	@OriginalMember(owner = "client!VDGJUQAS", name = "j", descriptor = "I")
	private static int anInt686;

	@OriginalMember(owner = "client!VDGJUQAS", name = "m", descriptor = "[I")
	public static int[] anIntArray189;

	@OriginalMember(owner = "client!VDGJUQAS", name = "n", descriptor = "I")
	public static int anInt688;

	@OriginalMember(owner = "client!VDGJUQAS", name = "o", descriptor = "I")
	public static int anInt689;

	@OriginalMember(owner = "client!VDGJUQAS", name = "p", descriptor = "I")
	public static int anInt690;

	@OriginalMember(owner = "client!VDGJUQAS", name = "q", descriptor = "I")
	public static int anInt691;

	@OriginalMember(owner = "client!VDGJUQAS", name = "r", descriptor = "I")
	public static int anInt692;

	@OriginalMember(owner = "client!VDGJUQAS", name = "s", descriptor = "I")
	public static int anInt693;

	@OriginalMember(owner = "client!VDGJUQAS", name = "t", descriptor = "I")
	public static int anInt694;

	@OriginalMember(owner = "client!VDGJUQAS", name = "u", descriptor = "I")
	public static int anInt695;

	@OriginalMember(owner = "client!VDGJUQAS", name = "v", descriptor = "I")
	public static int anInt696;

	@OriginalMember(owner = "client!VDGJUQAS", name = "l", descriptor = "I")
	private static int anInt687;

	static {
		aBoolean199 = true;
		anInt687 = -69;
	}

	@OriginalMember(owner = "client!VDGJUQAS", name = "a", descriptor = "([IIII)V")
	public static void method480(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			anIntArray189 = arg0;
			anInt688 = arg2;
			anInt689 = arg1;
			method482(0, 0, arg1, arg2);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("97695, " + arg0 + ", " + arg1 + ", " + -203 + ", " + arg2 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDGJUQAS", name = "a", descriptor = "(I)V")
	public static void method481() {
		try {
			anInt692 = 0;
			anInt690 = 0;
			anInt693 = anInt688;
			anInt691 = anInt689;
			anInt694 = anInt693 - 1;
			anInt695 = anInt693 / 2;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("18528, " + -30460 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDGJUQAS", name = "a", descriptor = "(IIIII)V")
	public static void method482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg3 > anInt688) {
				arg3 = anInt688;
			}
			if (arg2 > anInt689) {
				arg2 = anInt689;
			}
			anInt692 = arg0;
			anInt690 = arg1;
			anInt693 = arg3;
			anInt691 = arg2;
			anInt694 = anInt693 - 1;
			anInt695 = anInt693 / 2;
			anInt696 = anInt691 / 2;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("59863, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDGJUQAS", name = "a", descriptor = "(B)V")
	public static void method483() {
		try {
			@Pc(5) int local5 = anInt688 * anInt689;
			for (@Pc(17) int local17 = 0; local17 < local5; local17++) {
				anIntArray189[local17] = 0;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("65874, " + 75 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDGJUQAS", name = "a", descriptor = "(IIIIIII)V")
	public static void method484(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 < anInt692) {
				arg0 -= anInt692 - arg3;
				arg3 = anInt692;
			}
			if (arg5 < anInt690) {
				arg2 -= anInt690 - arg5;
				arg5 = anInt690;
			}
			if (arg3 + arg0 > anInt693) {
				arg0 = anInt693 - arg3;
			}
			if (arg5 + arg2 > anInt691) {
				arg2 = anInt691 - arg5;
			}
			@Pc(45) int local45 = 256 - arg1;
			@Pc(53) int local53 = (arg4 >> 16 & 0xFF) * arg1;
			@Pc(61) int local61 = (arg4 >> 8 & 0xFF) * arg1;
			@Pc(67) int local67 = (arg4 & 0xFF) * arg1;
			@Pc(75) int local75 = anInt688 - arg0;
			@Pc(81) int local81 = arg3 + arg5 * anInt688;
			for (@Pc(83) int local83 = 0; local83 < arg2; local83++) {
				for (@Pc(88) int local88 = -arg0; local88 < 0; local88++) {
					@Pc(100) int local100 = (anIntArray189[local81] >> 16 & 0xFF) * local45;
					@Pc(110) int local110 = (anIntArray189[local81] >> 8 & 0xFF) * local45;
					@Pc(118) int local118 = (anIntArray189[local81] & 0xFF) * local45;
					@Pc(140) int local140 = (local53 + local100 >> 8 << 16) + (local61 + local110 >> 8 << 8) + (local67 + local118 >> 8);
					anIntArray189[local81++] = local140;
				}
				local81 += local75;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("41366, " + 27370 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDGJUQAS", name = "a", descriptor = "(IIIIZI)V")
	public static void method485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg2 < anInt692) {
				arg3 -= anInt692 - arg2;
				arg2 = anInt692;
			}
			if (arg5 < anInt690) {
				arg0 -= anInt690 - arg5;
				arg5 = anInt690;
			}
			if (arg2 + arg3 > anInt693) {
				arg3 = anInt693 - arg2;
			}
			if (arg5 + arg0 > anInt691) {
				arg0 = anInt691 - arg5;
			}
			@Pc(45) int local45 = anInt688 - arg3;
			if (!arg4) {
				@Pc(54) int local54 = arg2 + arg5 * anInt688;
				for (@Pc(57) int local57 = -arg0; local57 < 0; local57++) {
					for (@Pc(62) int local62 = -arg3; local62 < 0; local62++) {
						anIntArray189[local54++] = arg1;
					}
					local54 += local45;
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("67884, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDGJUQAS", name = "a", descriptor = "(IIIIII)V")
	public static void method486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			method488(arg5, arg4, arg2, arg3, anInt685);
			method488(arg5 + arg0 - 1, arg4, arg2, arg3, anInt685);
			method490(arg3, arg2, arg0, arg5);
			if (arg1 < 0) {
				method490(arg3, arg2 + arg4 - 1, arg0, arg5);
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("1816, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDGJUQAS", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			method489(anInt686, arg0, arg4, arg1, arg2, arg3);
			method489(anInt686, arg0, arg4, arg1, arg2 + arg5 - 1, arg3);
			if (arg5 >= 3) {
				method491(arg2 + 1, arg5 - 2, arg1, arg3, arg4);
				method491(arg2 + 1, arg5 - 2, arg1 + arg0 - 1, arg3, arg4);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("62697, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDGJUQAS", name = "b", descriptor = "(IIIII)V")
	public static void method488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg4 != 0) {
				aBoolean199 = true;
			}
			if (arg0 >= anInt690 && arg0 < anInt691) {
				if (arg2 < anInt692) {
					arg1 -= anInt692 - arg2;
					arg2 = anInt692;
				}
				if (arg2 + arg1 > anInt693) {
					arg1 = anInt693 - arg2;
				}
				@Pc(40) int local40 = arg2 + arg0 * anInt688;
				for (@Pc(42) int local42 = 0; local42 < arg1; local42++) {
					anIntArray189[local40 + local42] = arg3;
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("98157, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDGJUQAS", name = "b", descriptor = "(IIIIII)V")
	private static void method489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg4 >= anInt690 && arg4 < anInt691) {
				if (arg3 < anInt692) {
					arg1 -= anInt692 - arg3;
					arg3 = anInt692;
				}
				if (arg3 + arg1 > anInt693) {
					arg1 = anInt693 - arg3;
				}
				@Pc(30) int local30 = 256 - arg5;
				@Pc(38) int local38 = (arg2 >> 16 & 0xFF) * arg5;
				@Pc(46) int local46 = (arg2 >> 8 & 0xFF) * arg5;
				@Pc(52) int local52 = (arg2 & 0xFF) * arg5;
				@Pc(58) int local58 = arg3 + arg4 * anInt688;
				if (arg0 != 0) {
					aBoolean199 = true;
				}
				for (@Pc(68) int local68 = 0; local68 < arg1; local68++) {
					@Pc(80) int local80 = (anIntArray189[local58] >> 16 & 0xFF) * local30;
					@Pc(90) int local90 = (anIntArray189[local58] >> 8 & 0xFF) * local30;
					@Pc(98) int local98 = (anIntArray189[local58] & 0xFF) * local30;
					@Pc(120) int local120 = (local38 + local80 >> 8 << 16) + (local46 + local90 >> 8 << 8) + (local52 + local98 >> 8);
					anIntArray189[local58++] = local120;
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("46814, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDGJUQAS", name = "a", descriptor = "(IIIIZ)V")
	public static void method490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 >= anInt692 && arg1 < anInt693) {
				if (arg3 < anInt690) {
					arg2 -= anInt690 - arg3;
					arg3 = anInt690;
				}
				if (arg3 + arg2 > anInt691) {
					arg2 = anInt691 - arg3;
				}
				@Pc(35) int local35 = arg1 + arg3 * anInt688;
				for (@Pc(37) int local37 = 0; local37 < arg2; local37++) {
					anIntArray189[local35 + local37 * anInt688] = arg0;
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("29565, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDGJUQAS", name = "a", descriptor = "(IIIIIZ)V")
	private static void method491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 >= anInt692 && arg2 < anInt693) {
				if (arg0 < anInt690) {
					arg1 -= anInt690 - arg0;
					arg0 = anInt690;
				}
				if (arg0 + arg1 > anInt691) {
					arg1 = anInt691 - arg0;
				}
				@Pc(32) int local32 = 256 - arg3;
				@Pc(49) int local49 = (arg4 >> 16 & 0xFF) * arg3;
				@Pc(57) int local57 = (arg4 >> 8 & 0xFF) * arg3;
				@Pc(63) int local63 = (arg4 & 0xFF) * arg3;
				@Pc(69) int local69 = arg2 + arg0 * anInt688;
				for (@Pc(71) int local71 = 0; local71 < arg1; local71++) {
					@Pc(83) int local83 = (anIntArray189[local69] >> 16 & 0xFF) * local32;
					@Pc(93) int local93 = (anIntArray189[local69] >> 8 & 0xFF) * local32;
					@Pc(101) int local101 = (anIntArray189[local69] & 0xFF) * local32;
					@Pc(123) int local123 = (local49 + local83 >> 8 << 16) + (local57 + local93 >> 8 << 8) + (local63 + local101 >> 8);
					anIntArray189[local69] = local123;
					local69 += anInt688;
				}
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("37754, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VDGJUQAS", name = "<init>", descriptor = "()V")
	protected Class2_Sub1_Sub1() {
	}
}
