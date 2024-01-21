import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HQRNTLRZ")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!HQRNTLRZ", name = "k", descriptor = "I")
	private static int anInt815;

	@OriginalMember(owner = "client!HQRNTLRZ", name = "m", descriptor = "Z")
	private static boolean aBoolean178;

	@OriginalMember(owner = "client!HQRNTLRZ", name = "n", descriptor = "Z")
	private static boolean aBoolean179;

	@OriginalMember(owner = "client!HQRNTLRZ", name = "o", descriptor = "[I")
	public static int[] anIntArray207;

	@OriginalMember(owner = "client!HQRNTLRZ", name = "p", descriptor = "I")
	public static int anInt817;

	@OriginalMember(owner = "client!HQRNTLRZ", name = "q", descriptor = "I")
	public static int anInt818;

	@OriginalMember(owner = "client!HQRNTLRZ", name = "r", descriptor = "I")
	public static int anInt819;

	@OriginalMember(owner = "client!HQRNTLRZ", name = "s", descriptor = "I")
	public static int anInt820;

	@OriginalMember(owner = "client!HQRNTLRZ", name = "t", descriptor = "I")
	public static int anInt821;

	@OriginalMember(owner = "client!HQRNTLRZ", name = "u", descriptor = "I")
	public static int anInt822;

	@OriginalMember(owner = "client!HQRNTLRZ", name = "v", descriptor = "I")
	public static int anInt823;

	@OriginalMember(owner = "client!HQRNTLRZ", name = "w", descriptor = "I")
	public static int anInt824;

	@OriginalMember(owner = "client!HQRNTLRZ", name = "x", descriptor = "I")
	public static int anInt825;

	@OriginalMember(owner = "client!HQRNTLRZ", name = "i", descriptor = "I")
	private static int anInt813 = -378;

	@OriginalMember(owner = "client!HQRNTLRZ", name = "j", descriptor = "I")
	private static int anInt814 = 5;

	@OriginalMember(owner = "client!HQRNTLRZ", name = "l", descriptor = "I")
	private static int anInt816 = -965;

	@OriginalMember(owner = "client!HQRNTLRZ", name = "a", descriptor = "(BI[II)V")
	public static void method537(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		try {
			anIntArray207 = arg1;
			anInt817 = arg0;
			anInt818 = arg2;
			method539(0, 0, arg0, arg2);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("10382, " + 86 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQRNTLRZ", name = "a", descriptor = "(I)V")
	public static void method538() {
		try {
			anInt821 = 0;
			anInt819 = 0;
			anInt822 = anInt817;
			anInt820 = anInt818;
			anInt823 = anInt822 - 1;
			anInt824 = anInt822 / 2;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("12391, " + -378 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQRNTLRZ", name = "a", descriptor = "(ZIIII)V")
	public static void method539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg2 > anInt817) {
				arg2 = anInt817;
			}
			if (arg3 > anInt818) {
				arg3 = anInt818;
			}
			anInt821 = arg0;
			anInt819 = arg1;
			anInt822 = arg2;
			anInt820 = arg3;
			anInt823 = anInt822 - 1;
			anInt824 = anInt822 / 2;
			anInt825 = anInt820 / 2;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("29258, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQRNTLRZ", name = "b", descriptor = "(I)V")
	public static void method540(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int local5 = anInt817 * anInt818;
			@Pc(10) int local10;
			if (arg0 != 5) {
				for (local10 = 1; local10 > 0; local10++) {
				}
			}
			for (local10 = 0; local10 < local5; local10++) {
				anIntArray207[local10] = 0;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("15565, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQRNTLRZ", name = "a", descriptor = "(IIIIIII)V")
	public static void method541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 < anInt821) {
				arg1 -= anInt821 - arg4;
				arg4 = anInt821;
			}
			if (arg2 < anInt819) {
				arg5 -= anInt819 - arg2;
				arg2 = anInt819;
			}
			if (arg4 + arg1 > anInt822) {
				arg1 = anInt822 - arg4;
			}
			if (arg2 + arg5 > anInt820) {
				arg5 = anInt820 - arg2;
			}
			@Pc(45) int local45 = 256 - arg3;
			@Pc(53) int local53 = (arg0 >> 16 & 0xFF) * arg3;
			@Pc(61) int local61 = (arg0 >> 8 & 0xFF) * arg3;
			@Pc(67) int local67 = (arg0 & 0xFF) * arg3;
			@Pc(71) int local71 = anInt817 - arg1;
			@Pc(85) int local85 = arg4 + arg2 * anInt817;
			for (@Pc(87) int local87 = 0; local87 < arg5; local87++) {
				for (@Pc(92) int local92 = -arg1; local92 < 0; local92++) {
					@Pc(104) int local104 = (anIntArray207[local85] >> 16 & 0xFF) * local45;
					@Pc(114) int local114 = (anIntArray207[local85] >> 8 & 0xFF) * local45;
					@Pc(122) int local122 = (anIntArray207[local85] & 0xFF) * local45;
					@Pc(144) int local144 = (local53 + local104 >> 8 << 16) + (local61 + local114 >> 8 << 8) + (local67 + local122 >> 8);
					anIntArray207[local85++] = local144;
				}
				local85 += local71;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("32620, " + arg0 + ", " + arg1 + ", " + -861 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQRNTLRZ", name = "a", descriptor = "(IIIIII)V")
	public static void method542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 < anInt821) {
				arg3 -= anInt821 - arg0;
				arg0 = anInt821;
			}
			if (arg1 < anInt819) {
				arg4 -= anInt819 - arg1;
				arg1 = anInt819;
			}
			if (arg0 + arg3 > anInt822) {
				arg3 = anInt822 - arg0;
			}
			if (arg1 + arg4 > anInt820) {
				arg4 = anInt820 - arg1;
			}
			@Pc(54) int local54 = anInt817 - arg3;
			@Pc(60) int local60 = arg0 + arg1 * anInt817;
			for (@Pc(63) int local63 = -arg4; local63 < 0; local63++) {
				for (@Pc(68) int local68 = -arg3; local68 < 0; local68++) {
					anIntArray207[local60++] = arg2;
				}
				local60 += local54;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("62258, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 47782 + ", " + arg4 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQRNTLRZ", name = "b", descriptor = "(IIIIII)V")
	public static void method543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			method545(arg1, arg4, arg3, arg2);
			method545(arg1, arg4 + arg0 - 1, arg3, arg2);
			method547(arg2, arg1, arg4, arg0);
			method547(arg2 + arg3 - 1, arg1, arg4, arg0);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("3910, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -1086 + ", " + arg4 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQRNTLRZ", name = "b", descriptor = "(IIIIIII)V")
	public static void method544(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (anInt814 == 5) {
				method546(arg3, arg1, arg2, arg4, arg5);
				method546(arg3, arg1, arg2, arg4 + arg0 - 1, arg5);
				if (arg0 >= 3) {
					method548(arg0 - 2, arg5, (byte) 8, arg4 + 1, arg1, arg2);
					method548(arg0 - 2, arg5 + arg3 - 1, (byte) 8, arg4 + 1, arg1, arg2);
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("93967, " + 5 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQRNTLRZ", name = "a", descriptor = "(IIIII)V")
	public static void method545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 >= anInt819 && arg1 < anInt820) {
				if (arg3 < anInt821) {
					arg2 -= anInt821 - arg3;
					arg3 = anInt821;
				}
				if (arg3 + arg2 > anInt822) {
					arg2 = anInt822 - arg3;
				}
				@Pc(32) int local32 = arg3 + arg1 * anInt817;
				for (@Pc(38) int local38 = 0; local38 < arg2; local38++) {
					anIntArray207[local32 + local38] = arg0;
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("57625, " + arg0 + ", " + arg1 + ", " + -166 + ", " + arg2 + ", " + arg3 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQRNTLRZ", name = "c", descriptor = "(IIIIII)V")
	private static void method546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3 >= anInt819 && arg3 < anInt820) {
				if (arg4 < anInt821) {
					arg0 -= anInt821 - arg4;
					arg4 = anInt821;
				}
				if (arg4 + arg0 > anInt822) {
					arg0 = anInt822 - arg4;
				}
				@Pc(30) int local30 = 256 - arg2;
				@Pc(38) int local38 = (arg1 >> 16 & 0xFF) * arg2;
				@Pc(46) int local46 = (arg1 >> 8 & 0xFF) * arg2;
				@Pc(52) int local52 = (arg1 & 0xFF) * arg2;
				@Pc(62) int local62 = arg4 + arg3 * anInt817;
				for (@Pc(64) int local64 = 0; local64 < arg0; local64++) {
					@Pc(76) int local76 = (anIntArray207[local62] >> 16 & 0xFF) * local30;
					@Pc(86) int local86 = (anIntArray207[local62] >> 8 & 0xFF) * local30;
					@Pc(94) int local94 = (anIntArray207[local62] & 0xFF) * local30;
					@Pc(116) int local116 = (local38 + local76 >> 8 << 16) + (local46 + local86 >> 8 << 8) + (local52 + local94 >> 8);
					anIntArray207[local62++] = local116;
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("68383, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQRNTLRZ", name = "b", descriptor = "(IIIII)V")
	public static void method547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 >= anInt821 && arg0 < anInt822) {
				if (arg2 < anInt819) {
					arg3 -= anInt819 - arg2;
					arg2 = anInt819;
				}
				if (arg2 + arg3 > anInt820) {
					arg3 = anInt820 - arg2;
				}
				@Pc(34) int local34 = arg0 + arg2 * anInt817;
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					anIntArray207[local34 + local46 * anInt817] = arg1;
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("98529, " + 11909 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQRNTLRZ", name = "a", descriptor = "(IIBIII)V")
	private static void method548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg1 >= anInt821 && arg1 < anInt822) {
				if (arg3 < anInt819) {
					arg0 -= anInt819 - arg3;
					arg3 = anInt819;
				}
				if (arg3 + arg0 > anInt820) {
					arg0 = anInt820 - arg3;
				}
				@Pc(32) int local32 = 256 - arg5;
				@Pc(40) int local40 = (arg4 >> 16 & 0xFF) * arg5;
				@Pc(48) int local48 = (arg4 >> 8 & 0xFF) * arg5;
				@Pc(54) int local54 = (arg4 & 0xFF) * arg5;
				@Pc(60) int local60 = arg1 + arg3 * anInt817;
				@Pc(65) boolean local65 = false;
				for (@Pc(76) int local76 = 0; local76 < arg0; local76++) {
					@Pc(88) int local88 = (anIntArray207[local60] >> 16 & 0xFF) * local32;
					@Pc(98) int local98 = (anIntArray207[local60] >> 8 & 0xFF) * local32;
					@Pc(106) int local106 = (anIntArray207[local60] & 0xFF) * local32;
					@Pc(128) int local128 = (local40 + local88 >> 8 << 16) + (local48 + local98 >> 8 << 8) + (local54 + local106 >> 8);
					anIntArray207[local60] = local128;
					local60 += anInt817;
				}
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("84279, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HQRNTLRZ", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
