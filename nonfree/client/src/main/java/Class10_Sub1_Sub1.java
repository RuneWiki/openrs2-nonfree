import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LFYNQWSZ")
public class Class10_Sub1_Sub1 extends Class10_Sub1 {

	@OriginalMember(owner = "client!LFYNQWSZ", name = "h", descriptor = "I")
	private static int anInt672;

	@OriginalMember(owner = "client!LFYNQWSZ", name = "i", descriptor = "Z")
	private static boolean aBoolean172;

	@OriginalMember(owner = "client!LFYNQWSZ", name = "l", descriptor = "[I")
	public static int[] anIntArray178;

	@OriginalMember(owner = "client!LFYNQWSZ", name = "m", descriptor = "I")
	public static int anInt674;

	@OriginalMember(owner = "client!LFYNQWSZ", name = "n", descriptor = "I")
	public static int anInt675;

	@OriginalMember(owner = "client!LFYNQWSZ", name = "o", descriptor = "I")
	public static int anInt676;

	@OriginalMember(owner = "client!LFYNQWSZ", name = "p", descriptor = "I")
	public static int anInt677;

	@OriginalMember(owner = "client!LFYNQWSZ", name = "q", descriptor = "I")
	public static int anInt678;

	@OriginalMember(owner = "client!LFYNQWSZ", name = "r", descriptor = "I")
	public static int anInt679;

	@OriginalMember(owner = "client!LFYNQWSZ", name = "s", descriptor = "I")
	public static int anInt680;

	@OriginalMember(owner = "client!LFYNQWSZ", name = "t", descriptor = "I")
	public static int anInt681;

	@OriginalMember(owner = "client!LFYNQWSZ", name = "u", descriptor = "I")
	public static int anInt682;

	@OriginalMember(owner = "client!LFYNQWSZ", name = "j", descriptor = "Z")
	private static boolean aBoolean173 = true;

	@OriginalMember(owner = "client!LFYNQWSZ", name = "k", descriptor = "I")
	private static int anInt673 = -291;

	@OriginalMember(owner = "client!LFYNQWSZ", name = "a", descriptor = "(ZII[I)V")
	public static void method494(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		try {
			if (!arg0) {
				anInt673 = -394;
			}
			anIntArray178 = arg3;
			anInt674 = arg1;
			anInt675 = arg2;
			method496(0, 0, arg2, arg1);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("1633, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LFYNQWSZ", name = "a", descriptor = "(B)V")
	public static void method495() {
		try {
			anInt678 = 0;
			anInt676 = 0;
			anInt679 = anInt674;
			anInt677 = anInt675;
			anInt680 = anInt679 - 1;
			anInt681 = anInt679 / 2;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("70020, " + 82 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LFYNQWSZ", name = "a", descriptor = "(IIIIZ)V")
	public static void method496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg3 > anInt674) {
				arg3 = anInt674;
			}
			if (arg2 > anInt675) {
				arg2 = anInt675;
			}
			anInt678 = arg1;
			anInt676 = arg0;
			anInt679 = arg3;
			anInt677 = arg2;
			anInt680 = anInt679 - 1;
			anInt681 = anInt679 / 2;
			anInt682 = anInt677 / 2;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("95145, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LFYNQWSZ", name = "a", descriptor = "(I)V")
	public static void method497() {
		try {
			@Pc(3) int local3 = anInt674 * anInt675;
			for (@Pc(14) int local14 = 0; local14 < local3; local14++) {
				anIntArray178[local14] = 0;
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("92195, " + 4 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LFYNQWSZ", name = "a", descriptor = "(ZIIIIII)V")
	public static void method498(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg5 < anInt678) {
				arg2 -= anInt678 - arg5;
				arg5 = anInt678;
			}
			if (arg1 < anInt676) {
				arg3 -= anInt676 - arg1;
				arg1 = anInt676;
			}
			if (arg5 + arg2 > anInt679) {
				arg2 = anInt679 - arg5;
			}
			if (arg1 + arg3 > anInt677) {
				arg3 = anInt677 - arg1;
			}
			@Pc(45) int local45 = 256 - arg4;
			@Pc(53) int local53 = (arg0 >> 16 & 0xFF) * arg4;
			@Pc(61) int local61 = (arg0 >> 8 & 0xFF) * arg4;
			@Pc(67) int local67 = (arg0 & 0xFF) * arg4;
			@Pc(79) int local79 = anInt674 - arg2;
			@Pc(85) int local85 = arg5 + arg1 * anInt674;
			for (@Pc(87) int local87 = 0; local87 < arg3; local87++) {
				for (@Pc(92) int local92 = -arg2; local92 < 0; local92++) {
					@Pc(104) int local104 = (anIntArray178[local85] >> 16 & 0xFF) * local45;
					@Pc(114) int local114 = (anIntArray178[local85] >> 8 & 0xFF) * local45;
					@Pc(122) int local122 = (anIntArray178[local85] & 0xFF) * local45;
					@Pc(144) int local144 = (local53 + local104 >> 8 << 16) + (local61 + local114 >> 8 << 8) + (local67 + local122 >> 8);
					anIntArray178[local85++] = local144;
				}
				local85 += local79;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("40167, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LFYNQWSZ", name = "a", descriptor = "(IIIBII)V")
	public static void method499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg4 < anInt678) {
				arg3 -= anInt678 - arg4;
				arg4 = anInt678;
			}
			if (arg1 < anInt676) {
				arg0 -= anInt676 - arg1;
				arg1 = anInt676;
			}
			if (arg4 + arg3 > anInt679) {
				arg3 = anInt679 - arg4;
			}
			if (arg1 + arg0 > anInt677) {
				arg0 = anInt677 - arg1;
			}
			@Pc(45) int local45 = anInt674 - arg3;
			@Pc(51) int local51 = arg4 + arg1 * anInt674;
			for (@Pc(54) int local54 = -arg0; local54 < 0; local54++) {
				for (@Pc(59) int local59 = -arg3; local59 < 0; local59++) {
					anIntArray178[local51++] = arg2;
				}
				local51 += local45;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("72807, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -24 + ", " + arg3 + ", " + arg4 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LFYNQWSZ", name = "a", descriptor = "(IIIIII)V")
	public static void method500(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method502(arg3, arg2, arg0, arg4);
			method502(arg3, arg2, arg0 + arg1 - 1, arg4);
			method504(arg3, arg2, arg1, arg0);
			method504(arg3 + arg4 - 1, arg2, arg1, arg0);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("44773, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LFYNQWSZ", name = "a", descriptor = "(IIIIIIB)V")
	public static void method501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			method503(arg4, arg0, arg1, arg5, arg2);
			method503(arg4 + arg3 - 1, arg0, arg1, arg5, arg2);
			if (arg3 >= 3) {
				method505(arg4 + 1, arg0, arg2, arg3 - 2, arg5);
				method505(arg4 + 1, arg0 + arg1 - 1, arg2, arg3 - 2, arg5);
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("11975, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -113 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LFYNQWSZ", name = "b", descriptor = "(IIIIZ)V")
	public static void method502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 >= anInt676 && arg2 < anInt677) {
				if (arg0 < anInt678) {
					arg3 -= anInt678 - arg0;
					arg0 = anInt678;
				}
				if (arg0 + arg3 > anInt679) {
					arg3 = anInt679 - arg0;
				}
				@Pc(34) int local34 = arg0 + arg2 * anInt674;
				for (@Pc(45) int local45 = 0; local45 < arg3; local45++) {
					anIntArray178[local34 + local45] = arg1;
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("15177, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LFYNQWSZ", name = "b", descriptor = "(IIIIII)V")
	private static void method503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt676 && arg0 < anInt677) {
				if (arg1 < anInt678) {
					arg2 -= anInt678 - arg1;
					arg1 = anInt678;
				}
				if (arg1 + arg2 > anInt679) {
					arg2 = anInt679 - arg1;
				}
				@Pc(30) int local30 = 256 - arg3;
				@Pc(38) int local38 = (arg4 >> 16 & 0xFF) * arg3;
				@Pc(46) int local46 = (arg4 >> 8 & 0xFF) * arg3;
				@Pc(52) int local52 = (arg4 & 0xFF) * arg3;
				@Pc(58) int local58 = arg1 + arg0 * anInt674;
				for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
					@Pc(72) int local72 = (anIntArray178[local58] >> 16 & 0xFF) * local30;
					@Pc(82) int local82 = (anIntArray178[local58] >> 8 & 0xFF) * local30;
					@Pc(90) int local90 = (anIntArray178[local58] & 0xFF) * local30;
					@Pc(112) int local112 = (local38 + local72 >> 8 << 16) + (local46 + local82 >> 8 << 8) + (local52 + local90 >> 8);
					anIntArray178[local58++] = local112;
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("54569, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1388 + ", " + arg3 + ", " + arg4 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LFYNQWSZ", name = "a", descriptor = "(IIIZI)V")
	public static void method504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 >= anInt678 && arg0 < anInt679) {
				if (arg3 < anInt676) {
					arg2 -= anInt676 - arg3;
					arg3 = anInt676;
				}
				if (arg3 + arg2 > anInt677) {
					arg2 = anInt677 - arg3;
				}
				@Pc(35) int local35 = arg0 + arg3 * anInt674;
				for (@Pc(37) int local37 = 0; local37 < arg2; local37++) {
					anIntArray178[local35 + local37 * anInt674] = arg1;
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("2455, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LFYNQWSZ", name = "c", descriptor = "(IIIIII)V")
	private static void method505(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 >= anInt678 && arg1 < anInt679) {
				if (arg0 < anInt676) {
					arg3 -= anInt676 - arg0;
					arg0 = anInt676;
				}
				if (arg0 + arg3 > anInt677) {
					arg3 = anInt677 - arg0;
				}
				@Pc(32) int local32 = 256 - arg4;
				@Pc(40) int local40 = (arg2 >> 16 & 0xFF) * arg4;
				@Pc(48) int local48 = (arg2 >> 8 & 0xFF) * arg4;
				@Pc(54) int local54 = (arg2 & 0xFF) * arg4;
				@Pc(69) int local69 = arg1 + arg0 * anInt674;
				for (@Pc(71) int local71 = 0; local71 < arg3; local71++) {
					@Pc(83) int local83 = (anIntArray178[local69] >> 16 & 0xFF) * local32;
					@Pc(93) int local93 = (anIntArray178[local69] >> 8 & 0xFF) * local32;
					@Pc(101) int local101 = (anIntArray178[local69] & 0xFF) * local32;
					@Pc(123) int local123 = (local40 + local83 >> 8 << 16) + (local48 + local93 >> 8 << 8) + (local54 + local101 >> 8);
					anIntArray178[local69] = local123;
					local69 += anInt674;
				}
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("11425, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LFYNQWSZ", name = "<init>", descriptor = "()V")
	protected Class10_Sub1_Sub1() {
	}
}
