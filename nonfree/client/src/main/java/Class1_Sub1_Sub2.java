import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gb")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	private static int anInt685;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "[I")
	public static int[] anIntArray213;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
	public static int anInt687;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	public static int anInt688;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public static int anInt689;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public static int anInt690;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	public static int anInt691;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public static int anInt692;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public static int anInt693;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	public static int anInt694;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
	public static int anInt695;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "Z")
	private static boolean aBoolean190 = true;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "Z")
	private static boolean aBoolean191 = true;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
	private static int anInt686 = 755;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[II)V")
	public static void method434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(3) boolean local3 = false;
			anIntArray213 = arg2;
			anInt687 = arg1;
			anInt688 = arg0;
			method436(arg0, arg1, 0, 0);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("16765, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	public static void method435(@OriginalArg(0) byte arg0) {
		try {
			anInt691 = 0;
			anInt689 = 0;
			anInt692 = anInt687;
			anInt690 = anInt688;
			@Pc(12) boolean local12 = false;
			anInt693 = anInt692 - 1;
			anInt694 = anInt692 / 2;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("44464, " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
	public static void method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg1 > anInt687) {
				arg1 = anInt687;
			}
			if (arg0 > anInt688) {
				arg0 = anInt688;
			}
			anInt691 = arg2;
			anInt689 = arg3;
			anInt692 = arg1;
			anInt690 = arg0;
			anInt693 = anInt692 - 1;
			anInt694 = anInt692 / 2;
			anInt695 = anInt690 / 2;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("52053, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -226 + ", " + arg3 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	public static void method437() {
		try {
			@Pc(3) int local3 = anInt687 * anInt688;
			for (@Pc(12) int local12 = 0; local12 < local3; local12++) {
				anIntArray213[local12] = 0;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("22236, " + 4 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIII)V")
	public static void method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg4 < anInt691) {
				arg2 -= anInt691 - arg4;
				arg4 = anInt691;
			}
			if (arg5 < anInt689) {
				arg1 -= anInt689 - arg5;
				arg5 = anInt689;
			}
			if (arg4 + arg2 > anInt692) {
				arg2 = anInt692 - arg4;
			}
			if (arg5 + arg1 > anInt690) {
				arg1 = anInt690 - arg5;
			}
			@Pc(45) int local45 = 256 - arg6;
			@Pc(53) int local53 = (arg0 >> 16 & 0xFF) * arg6;
			@Pc(61) int local61 = (arg0 >> 8 & 0xFF) * arg6;
			@Pc(67) int local67 = (arg0 & 0xFF) * arg6;
			@Pc(71) boolean local71 = false;
			@Pc(75) int local75 = anInt687 - arg2;
			@Pc(81) int local81 = arg4 + arg5 * anInt687;
			for (@Pc(83) int local83 = 0; local83 < arg1; local83++) {
				for (@Pc(88) int local88 = -arg2; local88 < 0; local88++) {
					@Pc(100) int local100 = (anIntArray213[local81] >> 16 & 0xFF) * local45;
					@Pc(110) int local110 = (anIntArray213[local81] >> 8 & 0xFF) * local45;
					@Pc(118) int local118 = (anIntArray213[local81] & 0xFF) * local45;
					@Pc(140) int local140 = (local53 + local100 >> 8 << 16) + (local61 + local110 >> 8 << 8) + (local67 + local118 >> 8);
					anIntArray213[local81++] = local140;
				}
				local81 += local75;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("96055, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIB)V")
	public static void method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		try {
			if (arg3 < anInt691) {
				arg2 -= anInt691 - arg3;
				arg3 = anInt691;
			}
			if (arg4 < anInt689) {
				arg1 -= anInt689 - arg4;
				arg4 = anInt689;
			}
			if (arg3 + arg2 > anInt692) {
				arg2 = anInt692 - arg3;
			}
			if (arg4 + arg1 > anInt690) {
				arg1 = anInt690 - arg4;
			}
			@Pc(45) int local45 = anInt687 - arg2;
			@Pc(51) int local51 = arg3 + arg4 * anInt687;
			for (@Pc(54) int local54 = -arg1; local54 < 0; local54++) {
				for (@Pc(59) int local59 = -arg2; local59 < 0; local59++) {
					anIntArray213[local51++] = arg0;
				}
				local51 += local45;
			}
			if (arg5 != 66) {
				aBoolean190 = !aBoolean190;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("20796, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII)V")
	public static void method440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			method442(arg4, arg2, arg1, arg3);
			method442(arg4, arg2, arg1 + arg0 - 1, arg3);
			method444(arg4, arg1, arg2, arg0);
			method444(arg4 + arg3 - 1, arg1, arg2, arg0);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("49807, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 3 + ", " + arg4 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIIIII)V")
	public static void method441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method443(arg2, arg4, arg5, arg0, arg3);
			method443(arg2, arg4, arg5, arg0, arg3 + arg1 - 1);
			if (arg1 >= 3) {
				method445(arg5, arg4, arg3 + 1, arg1 - 2, arg2);
				method445(arg5 + arg0 - 1, arg4, arg3 + 1, arg1 - 2, arg2);
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("58319, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIII)V")
	public static void method442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 >= anInt689 && arg2 < anInt690) {
				if (arg0 < anInt691) {
					arg3 -= anInt691 - arg0;
					arg0 = anInt691;
				}
				if (arg0 + arg3 > anInt692) {
					arg3 = anInt692 - arg0;
				}
				@Pc(32) int local32 = arg0 + arg2 * anInt687;
				for (@Pc(43) int local43 = 0; local43 < arg3; local43++) {
					anIntArray213[local32 + local43] = arg1;
				}
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("4892, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 1 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIIIB)V")
	private static void method443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg4 >= anInt689 && arg4 < anInt690) {
				if (arg2 < anInt691) {
					arg3 -= anInt691 - arg2;
					arg2 = anInt691;
				}
				if (arg2 + arg3 > anInt692) {
					arg3 = anInt692 - arg2;
				}
				@Pc(30) int local30 = 256 - arg1;
				@Pc(47) int local47 = (arg0 >> 16 & 0xFF) * arg1;
				@Pc(55) int local55 = (arg0 >> 8 & 0xFF) * arg1;
				@Pc(61) int local61 = (arg0 & 0xFF) * arg1;
				@Pc(67) int local67 = arg2 + arg4 * anInt687;
				for (@Pc(69) int local69 = 0; local69 < arg3; local69++) {
					@Pc(81) int local81 = (anIntArray213[local67] >> 16 & 0xFF) * local30;
					@Pc(91) int local91 = (anIntArray213[local67] >> 8 & 0xFF) * local30;
					@Pc(99) int local99 = (anIntArray213[local67] & 0xFF) * local30;
					@Pc(121) int local121 = (local47 + local81 >> 8 << 16) + (local55 + local91 >> 8 << 8) + (local61 + local99 >> 8);
					anIntArray213[local67++] = local121;
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("22000, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 57 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(IIIII)V")
	public static void method444(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 >= anInt691 && arg0 < anInt692) {
				if (arg1 < anInt689) {
					arg3 -= anInt689 - arg1;
					arg1 = anInt689;
				}
				if (arg1 + arg3 > anInt690) {
					arg3 = anInt690 - arg1;
				}
				@Pc(40) int local40 = arg0 + arg1 * anInt687;
				for (@Pc(42) int local42 = 0; local42 < arg3; local42++) {
					anIntArray213[local40 + local42 * anInt687] = arg2;
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("73583, " + arg0 + ", " + 830 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIIII)V")
	private static void method445(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt691 && arg0 < anInt692) {
				if (arg2 < anInt689) {
					arg3 -= anInt689 - arg2;
					arg2 = anInt689;
				}
				if (arg2 + arg3 > anInt690) {
					arg3 = anInt690 - arg2;
				}
				@Pc(30) int local30 = 256 - arg1;
				@Pc(38) int local38 = (arg4 >> 16 & 0xFF) * arg1;
				@Pc(46) int local46 = (arg4 >> 8 & 0xFF) * arg1;
				@Pc(52) int local52 = (arg4 & 0xFF) * arg1;
				@Pc(61) int local61 = arg0 + arg2 * anInt687;
				for (@Pc(63) int local63 = 0; local63 < arg3; local63++) {
					@Pc(75) int local75 = (anIntArray213[local61] >> 16 & 0xFF) * local30;
					@Pc(85) int local85 = (anIntArray213[local61] >> 8 & 0xFF) * local30;
					@Pc(93) int local93 = (anIntArray213[local61] & 0xFF) * local30;
					@Pc(115) int local115 = (local38 + local75 >> 8 << 16) + (local46 + local85 >> 8 << 8) + (local52 + local93 >> 8);
					anIntArray213[local61] = local115;
					local61 += anInt687;
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("98915, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
