import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WNEQSCWL")
public class Class6_Sub1_Sub1 extends Class6_Sub1 {

	@OriginalMember(owner = "client!WNEQSCWL", name = "j", descriptor = "I")
	private static int anInt818;

	@OriginalMember(owner = "client!WNEQSCWL", name = "k", descriptor = "Z")
	private static boolean aBoolean219;

	@OriginalMember(owner = "client!WNEQSCWL", name = "n", descriptor = "[I")
	public static int[] anIntArray208;

	@OriginalMember(owner = "client!WNEQSCWL", name = "o", descriptor = "I")
	public static int anInt821;

	@OriginalMember(owner = "client!WNEQSCWL", name = "p", descriptor = "I")
	public static int anInt822;

	@OriginalMember(owner = "client!WNEQSCWL", name = "q", descriptor = "I")
	public static int anInt823;

	@OriginalMember(owner = "client!WNEQSCWL", name = "r", descriptor = "I")
	public static int anInt824;

	@OriginalMember(owner = "client!WNEQSCWL", name = "s", descriptor = "I")
	public static int anInt825;

	@OriginalMember(owner = "client!WNEQSCWL", name = "t", descriptor = "I")
	public static int anInt826;

	@OriginalMember(owner = "client!WNEQSCWL", name = "u", descriptor = "I")
	public static int anInt827;

	@OriginalMember(owner = "client!WNEQSCWL", name = "v", descriptor = "I")
	public static int anInt828;

	@OriginalMember(owner = "client!WNEQSCWL", name = "w", descriptor = "I")
	public static int anInt829;

	@OriginalMember(owner = "client!WNEQSCWL", name = "l", descriptor = "I")
	private static int anInt819 = 3;

	@OriginalMember(owner = "client!WNEQSCWL", name = "m", descriptor = "I")
	private static int anInt820 = -1109;

	@OriginalMember(owner = "client!WNEQSCWL", name = "a", descriptor = "(Z[III)V")
	public static void method550(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			anIntArray208 = arg0;
			anInt821 = arg1;
			anInt822 = arg2;
			method552(0, arg2, arg1, 0);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("31003, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNEQSCWL", name = "a", descriptor = "(B)V")
	public static void method551() {
		try {
			anInt825 = 0;
			anInt823 = 0;
			anInt826 = anInt821;
			anInt824 = anInt822;
			anInt827 = anInt826 - 1;
			anInt828 = anInt826 / 2;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("65772, " + 0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNEQSCWL", name = "a", descriptor = "(IBIII)V")
	public static void method552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg2 > anInt821) {
				arg2 = anInt821;
			}
			if (arg1 > anInt822) {
				arg1 = anInt822;
			}
			anInt825 = arg0;
			anInt823 = arg3;
			anInt826 = arg2;
			anInt824 = arg1;
			anInt827 = anInt826 - 1;
			anInt828 = anInt826 / 2;
			anInt829 = anInt824 / 2;
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("49290, " + arg0 + ", " + -98 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNEQSCWL", name = "a", descriptor = "(Z)V")
	public static void method553() {
		try {
			@Pc(5) int local5 = anInt821 * anInt822;
			for (@Pc(16) int local16 = 0; local16 < local5; local16++) {
				anIntArray208[local16] = 0;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("33667, " + false + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNEQSCWL", name = "a", descriptor = "(IIIIIBI)V")
	public static void method554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg4 < anInt825) {
				arg3 -= anInt825 - arg4;
				arg4 = anInt825;
			}
			if (arg2 < anInt823) {
				arg0 -= anInt823 - arg2;
				arg2 = anInt823;
			}
			if (arg4 + arg3 > anInt826) {
				arg3 = anInt826 - arg4;
			}
			if (arg2 + arg0 > anInt824) {
				arg0 = anInt824 - arg2;
			}
			@Pc(45) int local45 = 256 - arg1;
			@Pc(50) boolean local50 = false;
			@Pc(67) int local67 = (arg6 >> 16 & 0xFF) * arg1;
			@Pc(75) int local75 = (arg6 >> 8 & 0xFF) * arg1;
			@Pc(81) int local81 = (arg6 & 0xFF) * arg1;
			@Pc(85) int local85 = anInt821 - arg3;
			@Pc(91) int local91 = arg4 + arg2 * anInt821;
			for (@Pc(93) int local93 = 0; local93 < arg0; local93++) {
				for (@Pc(98) int local98 = -arg3; local98 < 0; local98++) {
					@Pc(110) int local110 = (anIntArray208[local91] >> 16 & 0xFF) * local45;
					@Pc(120) int local120 = (anIntArray208[local91] >> 8 & 0xFF) * local45;
					@Pc(128) int local128 = (anIntArray208[local91] & 0xFF) * local45;
					@Pc(150) int local150 = (local67 + local110 >> 8 << 16) + (local75 + local120 >> 8 << 8) + (local81 + local128 >> 8);
					anIntArray208[local91++] = local150;
				}
				local91 += local85;
			}
		} catch (@Pc(168) RuntimeException local168) {
			signlink.reporterror("73185, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local168.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNEQSCWL", name = "a", descriptor = "(BIIIII)V")
	public static void method555(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg2 < anInt825) {
				arg5 -= anInt825 - arg2;
				arg2 = anInt825;
			}
			if (arg1 < anInt823) {
				arg4 -= anInt823 - arg1;
				arg1 = anInt823;
			}
			if (arg2 + arg5 > anInt826) {
				arg5 = anInt826 - arg2;
			}
			if (arg1 + arg4 > anInt824) {
				arg4 = anInt824 - arg1;
			}
			@Pc(45) int local45 = anInt821 - arg5;
			@Pc(51) int local51 = arg2 + arg1 * anInt821;
			for (@Pc(54) int local54 = -arg4; local54 < 0; local54++) {
				for (@Pc(59) int local59 = -arg5; local59 < 0; local59++) {
					anIntArray208[local51++] = arg3;
				}
				local51 += local45;
			}
			@Pc(81) boolean local81 = false;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("47103, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNEQSCWL", name = "a", descriptor = "(IIIIII)V")
	public static void method556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			method558(arg3, arg5, 893, arg1, arg4);
			@Pc(9) boolean local9 = false;
			method558(arg3, arg5, 893, arg1 + arg0 - 1, arg4);
			method560(anInt818, arg4, arg0, arg1, arg3);
			method560(anInt818, arg4, arg0, arg1, arg3 + arg5 - 1);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("41596, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNEQSCWL", name = "a", descriptor = "(IIIIIII)V")
	public static void method557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method559(arg0, arg3, arg4, arg2, arg5);
			method559(arg0, arg3, arg4 + arg1 - 1, arg2, arg5);
			if (arg1 >= 3) {
				method561(arg5, arg1 - 2, arg2, arg4 + 1, arg3);
				method561(arg5, arg1 - 2, arg2 + arg0 - 1, arg4 + 1, arg3);
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("39988, " + arg0 + ", " + arg1 + ", " + 217 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNEQSCWL", name = "a", descriptor = "(IIIII)V")
	public static void method558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg3 >= anInt823 && arg3 < anInt824) {
				if (arg0 < anInt825) {
					arg1 -= anInt825 - arg0;
					arg0 = anInt825;
				}
				if (arg0 + arg1 > anInt826) {
					arg1 = anInt826 - arg0;
				}
				@Pc(36) int local36 = arg0 + arg3 * anInt821;
				for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
					anIntArray208[local36 + local38] = arg4;
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("67366, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNEQSCWL", name = "b", descriptor = "(IIIIII)V")
	private static void method559(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 >= anInt823 && arg2 < anInt824) {
				if (arg3 < anInt825) {
					arg0 -= anInt825 - arg3;
					arg3 = anInt825;
				}
				if (arg3 + arg0 > anInt826) {
					arg0 = anInt826 - arg3;
				}
				@Pc(30) int local30 = 256 - arg1;
				@Pc(38) int local38 = (arg4 >> 16 & 0xFF) * arg1;
				@Pc(46) int local46 = (arg4 >> 8 & 0xFF) * arg1;
				@Pc(52) int local52 = (arg4 & 0xFF) * arg1;
				@Pc(58) int local58 = arg3 + arg2 * anInt821;
				for (@Pc(60) int local60 = 0; local60 < arg0; local60++) {
					@Pc(72) int local72 = (anIntArray208[local58] >> 16 & 0xFF) * local30;
					@Pc(82) int local82 = (anIntArray208[local58] >> 8 & 0xFF) * local30;
					@Pc(90) int local90 = (anIntArray208[local58] & 0xFF) * local30;
					@Pc(112) int local112 = (local38 + local72 >> 8 << 16) + (local46 + local82 >> 8 << 8) + (local52 + local90 >> 8);
					anIntArray208[local58++] = local112;
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("17228, " + arg0 + ", " + -32613 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNEQSCWL", name = "b", descriptor = "(IIIII)V")
	public static void method560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg4 >= anInt825 && arg4 < anInt826) {
				if (arg3 < anInt823) {
					arg2 -= anInt823 - arg3;
					arg3 = anInt823;
				}
				if (arg3 + arg2 > anInt824) {
					arg2 = anInt824 - arg3;
				}
				@Pc(32) int local32 = arg4 + arg3 * anInt821;
				if (arg0 == 0) {
					for (@Pc(37) int local37 = 0; local37 < arg2; local37++) {
						anIntArray208[local32 + local37 * anInt821] = arg1;
					}
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("64052, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNEQSCWL", name = "c", descriptor = "(IIIIII)V")
	private static void method561(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 >= anInt825 && arg2 < anInt826) {
				if (arg3 < anInt823) {
					arg1 -= anInt823 - arg3;
					arg3 = anInt823;
				}
				if (arg3 + arg1 > anInt824) {
					arg1 = anInt824 - arg3;
				}
				@Pc(32) int local32 = 256 - arg4;
				@Pc(40) int local40 = (arg0 >> 16 & 0xFF) * arg4;
				@Pc(48) int local48 = (arg0 >> 8 & 0xFF) * arg4;
				@Pc(54) int local54 = (arg0 & 0xFF) * arg4;
				@Pc(60) int local60 = arg2 + arg3 * anInt821;
				for (@Pc(62) int local62 = 0; local62 < arg1; local62++) {
					@Pc(74) int local74 = (anIntArray208[local60] >> 16 & 0xFF) * local32;
					@Pc(84) int local84 = (anIntArray208[local60] >> 8 & 0xFF) * local32;
					@Pc(92) int local92 = (anIntArray208[local60] & 0xFF) * local32;
					@Pc(114) int local114 = (local40 + local74 >> 8 << 16) + (local48 + local84 >> 8 << 8) + (local54 + local92 >> 8);
					anIntArray208[local60] = local114;
					local60 += anInt821;
				}
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("45095, " + arg0 + ", " + 29392 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNEQSCWL", name = "<init>", descriptor = "()V")
	protected Class6_Sub1_Sub1() {
	}
}
