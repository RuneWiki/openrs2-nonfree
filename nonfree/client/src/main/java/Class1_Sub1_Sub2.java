import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SXFSGYHA")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!SXFSGYHA", name = "p", descriptor = "[I")
	public static int[] anIntArray122;

	@OriginalMember(owner = "client!SXFSGYHA", name = "q", descriptor = "I")
	public static int anInt453;

	@OriginalMember(owner = "client!SXFSGYHA", name = "r", descriptor = "I")
	public static int anInt454;

	@OriginalMember(owner = "client!SXFSGYHA", name = "s", descriptor = "I")
	public static int anInt455;

	@OriginalMember(owner = "client!SXFSGYHA", name = "t", descriptor = "I")
	public static int anInt456;

	@OriginalMember(owner = "client!SXFSGYHA", name = "u", descriptor = "I")
	public static int anInt457;

	@OriginalMember(owner = "client!SXFSGYHA", name = "v", descriptor = "I")
	public static int anInt458;

	@OriginalMember(owner = "client!SXFSGYHA", name = "w", descriptor = "I")
	public static int anInt459;

	@OriginalMember(owner = "client!SXFSGYHA", name = "x", descriptor = "I")
	public static int anInt460;

	@OriginalMember(owner = "client!SXFSGYHA", name = "y", descriptor = "I")
	public static int anInt461;

	@OriginalMember(owner = "client!SXFSGYHA", name = "i", descriptor = "Z")
	private static boolean aBoolean123 = true;

	@OriginalMember(owner = "client!SXFSGYHA", name = "j", descriptor = "I")
	private static int anInt449 = 6;

	@OriginalMember(owner = "client!SXFSGYHA", name = "k", descriptor = "I")
	private static int anInt450 = 43417;

	@OriginalMember(owner = "client!SXFSGYHA", name = "l", descriptor = "I")
	private static int anInt451 = -426;

	@OriginalMember(owner = "client!SXFSGYHA", name = "m", descriptor = "B")
	private static byte aByte20 = 79;

	@OriginalMember(owner = "client!SXFSGYHA", name = "o", descriptor = "I")
	private static int anInt452 = 851;

	@OriginalMember(owner = "client!SXFSGYHA", name = "a", descriptor = "(I[III)V")
	public static void method400(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		try {
			anIntArray122 = arg1;
			anInt453 = arg0;
			if (anInt449 > 6 || anInt449 < 6) {
				anInt452 = 168;
			}
			anInt454 = arg2;
			method402(0, arg0, arg2, 0);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("25938, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 6 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXFSGYHA", name = "a", descriptor = "(I)V")
	public static void method401() {
		try {
			anInt457 = 0;
			anInt455 = 0;
			anInt458 = anInt453;
			anInt456 = anInt454;
			anInt459 = anInt458 - 1;
			if (anInt450 == 43417) {
				anInt460 = anInt458 / 2;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("24147, " + 43417 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXFSGYHA", name = "a", descriptor = "(IIIII)V")
	public static void method402(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg1 > anInt453) {
				arg1 = anInt453;
			}
			if (arg2 > anInt454) {
				arg2 = anInt454;
			}
			anInt457 = arg3;
			anInt455 = arg0;
			anInt458 = arg1;
			anInt456 = arg2;
			anInt459 = anInt458 - 1;
			anInt460 = anInt458 / 2;
			anInt461 = anInt456 / 2;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("50830, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXFSGYHA", name = "a", descriptor = "(Z)V")
	public static void method403() {
		try {
			@Pc(3) int local3 = anInt453 * anInt454;
			for (@Pc(8) int local8 = 0; local8 < local3; local8++) {
				anIntArray122[local8] = 0;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("94054, " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXFSGYHA", name = "a", descriptor = "(IIIIIII)V")
	public static void method404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg6 < anInt457) {
				arg5 -= anInt457 - arg6;
				arg6 = anInt457;
			}
			if (arg1 < anInt455) {
				arg3 -= anInt455 - arg1;
				arg1 = anInt455;
			}
			if (arg6 + arg5 > anInt458) {
				arg5 = anInt458 - arg6;
			}
			if (arg1 + arg3 > anInt456) {
				arg3 = anInt456 - arg1;
			}
			@Pc(45) int local45 = 256 - arg4;
			@Pc(53) int local53 = (arg0 >> 16 & 0xFF) * arg4;
			@Pc(61) int local61 = (arg0 >> 8 & 0xFF) * arg4;
			@Pc(67) int local67 = (arg0 & 0xFF) * arg4;
			@Pc(71) int local71 = 34 / arg2;
			@Pc(75) int local75 = anInt453 - arg5;
			@Pc(81) int local81 = arg6 + arg1 * anInt453;
			for (@Pc(83) int local83 = 0; local83 < arg3; local83++) {
				for (@Pc(88) int local88 = -arg5; local88 < 0; local88++) {
					@Pc(100) int local100 = (anIntArray122[local81] >> 16 & 0xFF) * local45;
					@Pc(110) int local110 = (anIntArray122[local81] >> 8 & 0xFF) * local45;
					@Pc(118) int local118 = (anIntArray122[local81] & 0xFF) * local45;
					@Pc(140) int local140 = (local53 + local100 >> 8 << 16) + (local61 + local110 >> 8 << 8) + (local67 + local118 >> 8);
					anIntArray122[local81++] = local140;
				}
				local81 += local75;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("7753, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXFSGYHA", name = "a", descriptor = "(IIIIII)V")
	public static void method405(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 < anInt457) {
				arg1 -= anInt457 - arg2;
				arg2 = anInt457;
			}
			if (arg3 < anInt455) {
				arg4 -= anInt455 - arg3;
				arg3 = anInt455;
			}
			if (arg2 + arg1 > anInt458) {
				arg1 = anInt458 - arg2;
			}
			if (arg3 + arg4 > anInt456) {
				arg4 = anInt456 - arg3;
			}
			@Pc(45) int local45 = anInt453 - arg1;
			@Pc(61) int local61 = arg2 + arg3 * anInt453;
			for (@Pc(64) int local64 = -arg4; local64 < 0; local64++) {
				for (@Pc(69) int local69 = -arg1; local69 < 0; local69++) {
					anIntArray122[local61++] = arg0;
				}
				local61 += local45;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("95739, " + arg0 + ", " + -426 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXFSGYHA", name = "b", descriptor = "(IIIIII)V")
	public static void method406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			method408(arg5, arg1, arg0, arg2);
			method408(arg5 + arg4 - 1, arg1, arg0, arg2);
			method410(arg0, arg4, arg1, arg5);
			if (arg3 != 23829) {
				for (@Pc(26) int local26 = 1; local26 > 0; local26++) {
				}
			}
			method410(arg0, arg4, arg1 + arg2 - 1, arg5);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("29072, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXFSGYHA", name = "b", descriptor = "(IIIIIII)V")
	public static void method407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			method409(arg4, arg1, arg3, arg0, arg2);
			method409(arg4 + arg5 - 1, arg1, arg3, arg0, arg2);
			if (arg5 >= 3) {
				method411(arg0, arg4 + 1, arg2, arg1, arg5 - 2);
				method411(arg0 + arg3 - 1, arg4 + 1, arg2, arg1, arg5 - 2);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("19539, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -519 + ", " + arg5 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXFSGYHA", name = "b", descriptor = "(IIIII)V")
	public static void method408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 >= anInt455 && arg0 < anInt456) {
				if (arg1 < anInt457) {
					arg3 -= anInt457 - arg1;
					arg1 = anInt457;
				}
				if (arg1 + arg3 > anInt458) {
					arg3 = anInt458 - arg1;
				}
				@Pc(39) int local39 = arg1 + arg0 * anInt453;
				for (@Pc(41) int local41 = 0; local41 < arg3; local41++) {
					anIntArray122[local39 + local41] = arg2;
				}
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("62638, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -81 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXFSGYHA", name = "c", descriptor = "(IIIIII)V")
	private static void method409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg0 >= anInt455 && arg0 < anInt456) {
				if (arg3 < anInt457) {
					arg2 -= anInt457 - arg3;
					arg3 = anInt457;
				}
				if (arg3 + arg2 > anInt458) {
					arg2 = anInt458 - arg3;
				}
				@Pc(30) int local30 = 256 - arg4;
				@Pc(38) int local38 = (arg1 >> 16 & 0xFF) * arg4;
				@Pc(46) int local46 = (arg1 >> 8 & 0xFF) * arg4;
				@Pc(52) int local52 = (arg1 & 0xFF) * arg4;
				@Pc(58) int local58 = arg3 + arg0 * anInt453;
				for (@Pc(63) int local63 = 0; local63 < arg2; local63++) {
					@Pc(75) int local75 = (anIntArray122[local58] >> 16 & 0xFF) * local30;
					@Pc(85) int local85 = (anIntArray122[local58] >> 8 & 0xFF) * local30;
					@Pc(93) int local93 = (anIntArray122[local58] & 0xFF) * local30;
					@Pc(115) int local115 = (local38 + local75 >> 8 << 16) + (local46 + local85 >> 8 << 8) + (local52 + local93 >> 8);
					anIntArray122[local58++] = local115;
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("41488, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXFSGYHA", name = "a", descriptor = "(IIBII)V")
	public static void method410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt457 && arg2 < anInt458) {
				if (arg3 < anInt455) {
					arg1 -= anInt455 - arg3;
					arg3 = anInt455;
				}
				if (arg3 + arg1 > anInt456) {
					arg1 = anInt456 - arg3;
				}
				@Pc(34) int local34 = arg2 + arg3 * anInt453;
				for (@Pc(46) int local46 = 0; local46 < arg1; local46++) {
					anIntArray122[local34 + local46 * anInt453] = arg0;
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("3044, " + arg0 + ", " + arg1 + ", " + 88 + ", " + arg2 + ", " + arg3 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXFSGYHA", name = "d", descriptor = "(IIIIII)V")
	private static void method411(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt457 && arg0 < anInt458) {
				if (arg1 < anInt455) {
					arg4 -= anInt455 - arg1;
					arg1 = anInt455;
				}
				if (arg1 + arg4 > anInt456) {
					arg4 = anInt456 - arg1;
				}
				@Pc(30) int local30 = 256 - arg2;
				@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg2;
				@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg2;
				@Pc(52) int local52 = (arg3 & 0xFF) * arg2;
				@Pc(58) int local58 = arg0 + arg1 * anInt453;
				for (@Pc(60) int local60 = 0; local60 < arg4; local60++) {
					@Pc(72) int local72 = (anIntArray122[local58] >> 16 & 0xFF) * local30;
					@Pc(82) int local82 = (anIntArray122[local58] >> 8 & 0xFF) * local30;
					@Pc(90) int local90 = (anIntArray122[local58] & 0xFF) * local30;
					@Pc(112) int local112 = (local38 + local72 >> 8 << 16) + (local46 + local82 >> 8 << 8) + (local52 + local90 >> 8);
					anIntArray122[local58] = local112;
					local58 += anInt453;
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("38561, " + 969 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXFSGYHA", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
