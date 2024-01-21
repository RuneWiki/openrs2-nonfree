import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OKWPDMPE")
public class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!OKWPDMPE", name = "m", descriptor = "Z")
	private static boolean aBoolean199;

	@OriginalMember(owner = "client!OKWPDMPE", name = "o", descriptor = "[I")
	public static int[] anIntArray176;

	@OriginalMember(owner = "client!OKWPDMPE", name = "p", descriptor = "I")
	public static int anInt735;

	@OriginalMember(owner = "client!OKWPDMPE", name = "q", descriptor = "I")
	public static int anInt736;

	@OriginalMember(owner = "client!OKWPDMPE", name = "r", descriptor = "I")
	public static int anInt737;

	@OriginalMember(owner = "client!OKWPDMPE", name = "s", descriptor = "I")
	public static int anInt738;

	@OriginalMember(owner = "client!OKWPDMPE", name = "t", descriptor = "I")
	public static int anInt739;

	@OriginalMember(owner = "client!OKWPDMPE", name = "u", descriptor = "I")
	public static int anInt740;

	@OriginalMember(owner = "client!OKWPDMPE", name = "v", descriptor = "I")
	public static int anInt741;

	@OriginalMember(owner = "client!OKWPDMPE", name = "w", descriptor = "I")
	public static int anInt742;

	@OriginalMember(owner = "client!OKWPDMPE", name = "x", descriptor = "I")
	public static int anInt743;

	@OriginalMember(owner = "client!OKWPDMPE", name = "k", descriptor = "I")
	private static int anInt732 = -42775;

	@OriginalMember(owner = "client!OKWPDMPE", name = "l", descriptor = "I")
	private static int anInt733 = 509;

	@OriginalMember(owner = "client!OKWPDMPE", name = "n", descriptor = "I")
	private static int anInt734 = 47773;

	@OriginalMember(owner = "client!OKWPDMPE", name = "a", descriptor = "(ZII[I)V")
	public static void method509(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			anIntArray176 = arg2;
			anInt735 = arg0;
			anInt736 = arg1;
			method511(arg0, arg1, 0, 0);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("91151, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OKWPDMPE", name = "a", descriptor = "(B)V")
	public static void method510() {
		try {
			anInt739 = 0;
			anInt737 = 0;
			anInt740 = anInt735;
			anInt738 = anInt736;
			anInt741 = anInt740 - 1;
			anInt742 = anInt740 / 2;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("72760, " + 75 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OKWPDMPE", name = "a", descriptor = "(IIIII)V")
	public static void method511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg0 > anInt735) {
				arg0 = anInt735;
			}
			if (arg1 > anInt736) {
				arg1 = anInt736;
			}
			anInt739 = arg2;
			if (anInt732 == -42775) {
				anInt737 = arg3;
				anInt740 = arg0;
				anInt738 = arg1;
				anInt741 = anInt740 - 1;
				anInt742 = anInt740 / 2;
				anInt743 = anInt738 / 2;
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("25278, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -42775 + ", " + arg3 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OKWPDMPE", name = "a", descriptor = "(I)V")
	public static void method512() {
		try {
			@Pc(6) int local6 = anInt735 * anInt736;
			for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
				anIntArray176[local8] = 0;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("55323, " + -327 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OKWPDMPE", name = "a", descriptor = "(IBIIIII)V")
	public static void method513(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg3 < anInt739) {
				arg4 -= anInt739 - arg3;
				arg3 = anInt739;
			}
			if (arg5 < anInt737) {
				arg0 -= anInt737 - arg5;
				arg5 = anInt737;
			}
			if (arg3 + arg4 > anInt740) {
				arg4 = anInt740 - arg3;
			}
			if (arg5 + arg0 > anInt738) {
				arg0 = anInt738 - arg5;
			}
			@Pc(45) int local45 = 256 - arg6;
			@Pc(53) int local53 = (arg2 >> 16 & 0xFF) * arg6;
			@Pc(61) int local61 = (arg2 >> 8 & 0xFF) * arg6;
			@Pc(67) int local67 = (arg2 & 0xFF) * arg6;
			if (arg1 == 1) {
				@Pc(75) int local75 = anInt735 - arg4;
				@Pc(81) int local81 = arg3 + arg5 * anInt735;
				for (@Pc(83) int local83 = 0; local83 < arg0; local83++) {
					for (@Pc(88) int local88 = -arg4; local88 < 0; local88++) {
						@Pc(100) int local100 = (anIntArray176[local81] >> 16 & 0xFF) * local45;
						@Pc(110) int local110 = (anIntArray176[local81] >> 8 & 0xFF) * local45;
						@Pc(118) int local118 = (anIntArray176[local81] & 0xFF) * local45;
						@Pc(140) int local140 = (local53 + local100 >> 8 << 16) + (local61 + local110 >> 8 << 8) + (local67 + local118 >> 8);
						anIntArray176[local81++] = local140;
					}
					local81 += local75;
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("9281, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OKWPDMPE", name = "a", descriptor = "(IIIIII)V")
	public static void method514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 < anInt739) {
				arg3 -= anInt739 - arg0;
				arg0 = anInt739;
			}
			if (arg1 < anInt737) {
				arg4 -= anInt737 - arg1;
				arg1 = anInt737;
			}
			if (arg0 + arg3 > anInt740) {
				arg3 = anInt740 - arg0;
			}
			if (arg1 + arg4 > anInt738) {
				arg4 = anInt738 - arg1;
			}
			@Pc(45) int local45 = anInt735 - arg3;
			@Pc(55) int local55 = arg0 + arg1 * anInt735;
			for (@Pc(58) int local58 = -arg4; local58 < 0; local58++) {
				for (@Pc(63) int local63 = -arg3; local63 < 0; local63++) {
					anIntArray176[local55++] = arg2;
				}
				local55 += local45;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("52847, " + arg0 + ", " + arg1 + ", " + 2 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OKWPDMPE", name = "b", descriptor = "(IIIIII)V")
	public static void method515(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method517(arg4, arg1, arg3, arg2);
			method517(arg4, arg1 + arg0 - 1, arg3, arg2);
			method519(arg2, 185, arg1, arg3, arg0);
			method519(arg2 + arg4 - 1, 185, arg1, arg3, arg0);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("48589, " + 7 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OKWPDMPE", name = "a", descriptor = "(IIIIIII)V")
	public static void method516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			method518(arg3, arg2, arg4, arg0, arg1);
			method518(arg3, arg2, arg4, arg0 + arg5 - 1, arg1);
			if (arg5 >= 3) {
				method520(arg1, arg5 - 2, arg0 + 1, arg3, arg2);
				method520(arg1 + arg4 - 1, arg5 - 2, arg0 + 1, arg3, arg2);
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("39226, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 509 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OKWPDMPE", name = "a", descriptor = "(IIZII)V")
	public static void method517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 >= anInt737 && arg1 < anInt738) {
				if (arg3 < anInt739) {
					arg0 -= anInt739 - arg3;
					arg3 = anInt739;
				}
				if (arg3 + arg0 > anInt740) {
					arg0 = anInt740 - arg3;
				}
				@Pc(36) int local36 = arg3 + arg1 * anInt735;
				for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
					anIntArray176[local36 + local38] = arg2;
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("67947, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OKWPDMPE", name = "a", descriptor = "(IIIZII)V")
	private static void method518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 >= anInt737 && arg3 < anInt738) {
				if (arg4 < anInt739) {
					arg2 -= anInt739 - arg4;
					arg4 = anInt739;
				}
				if (arg4 + arg2 > anInt740) {
					arg2 = anInt740 - arg4;
				}
				@Pc(30) int local30 = 256 - arg0;
				@Pc(38) int local38 = (arg1 >> 16 & 0xFF) * arg0;
				@Pc(46) int local46 = (arg1 >> 8 & 0xFF) * arg0;
				@Pc(52) int local52 = (arg1 & 0xFF) * arg0;
				@Pc(58) int local58 = arg4 + arg3 * anInt735;
				for (@Pc(64) int local64 = 0; local64 < arg2; local64++) {
					@Pc(76) int local76 = (anIntArray176[local58] >> 16 & 0xFF) * local30;
					@Pc(86) int local86 = (anIntArray176[local58] >> 8 & 0xFF) * local30;
					@Pc(94) int local94 = (anIntArray176[local58] & 0xFF) * local30;
					@Pc(116) int local116 = (local38 + local76 >> 8 << 16) + (local46 + local86 >> 8 << 8) + (local52 + local94 >> 8);
					anIntArray176[local58++] = local116;
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("68261, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OKWPDMPE", name = "b", descriptor = "(IIIII)V")
	public static void method519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg0 >= anInt739 && arg0 < anInt740) {
				if (arg2 < anInt737) {
					arg4 -= anInt737 - arg2;
					arg2 = anInt737;
				}
				if (arg2 + arg4 > anInt738) {
					arg4 = anInt738 - arg2;
				}
				@Pc(32) int local32 = arg0 + arg2 * anInt735;
				@Pc(36) boolean local36 = false;
				for (@Pc(38) int local38 = 0; local38 < arg4; local38++) {
					anIntArray176[local32 + local38 * anInt735] = arg3;
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("74294, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OKWPDMPE", name = "c", descriptor = "(IIIIII)V")
	private static void method520(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt739 && arg0 < anInt740) {
				if (arg2 < anInt737) {
					arg1 -= anInt737 - arg2;
					arg2 = anInt737;
				}
				if (arg2 + arg1 > anInt738) {
					arg1 = anInt738 - arg2;
				}
				@Pc(30) int local30 = 256 - arg3;
				@Pc(45) int local45 = (arg4 >> 16 & 0xFF) * arg3;
				@Pc(53) int local53 = (arg4 >> 8 & 0xFF) * arg3;
				@Pc(59) int local59 = (arg4 & 0xFF) * arg3;
				@Pc(65) int local65 = arg0 + arg2 * anInt735;
				for (@Pc(67) int local67 = 0; local67 < arg1; local67++) {
					@Pc(79) int local79 = (anIntArray176[local65] >> 16 & 0xFF) * local30;
					@Pc(89) int local89 = (anIntArray176[local65] >> 8 & 0xFF) * local30;
					@Pc(97) int local97 = (anIntArray176[local65] & 0xFF) * local30;
					@Pc(119) int local119 = (local45 + local79 >> 8 << 16) + (local53 + local89 >> 8 << 8) + (local59 + local97 >> 8);
					anIntArray176[local65] = local119;
					local65 += anInt735;
				}
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("48502, " + 5 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OKWPDMPE", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub3() {
	}
}
