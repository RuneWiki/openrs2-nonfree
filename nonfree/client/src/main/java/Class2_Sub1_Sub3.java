import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CCFLBOBS")
public class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!CCFLBOBS", name = "j", descriptor = "Z")
	private static boolean aBoolean137;

	@OriginalMember(owner = "client!CCFLBOBS", name = "k", descriptor = "I")
	private static int anInt554;

	@OriginalMember(owner = "client!CCFLBOBS", name = "l", descriptor = "[I")
	public static int[] anIntArray93;

	@OriginalMember(owner = "client!CCFLBOBS", name = "m", descriptor = "I")
	public static int anInt555;

	@OriginalMember(owner = "client!CCFLBOBS", name = "n", descriptor = "I")
	public static int anInt556;

	@OriginalMember(owner = "client!CCFLBOBS", name = "o", descriptor = "I")
	public static int anInt557;

	@OriginalMember(owner = "client!CCFLBOBS", name = "p", descriptor = "I")
	public static int anInt558;

	@OriginalMember(owner = "client!CCFLBOBS", name = "q", descriptor = "I")
	public static int anInt559;

	@OriginalMember(owner = "client!CCFLBOBS", name = "r", descriptor = "I")
	public static int anInt560;

	@OriginalMember(owner = "client!CCFLBOBS", name = "s", descriptor = "I")
	public static int anInt561;

	@OriginalMember(owner = "client!CCFLBOBS", name = "t", descriptor = "I")
	public static int anInt562;

	@OriginalMember(owner = "client!CCFLBOBS", name = "u", descriptor = "I")
	public static int anInt563;

	@OriginalMember(owner = "client!CCFLBOBS", name = "i", descriptor = "I")
	private static int anInt553 = 107;

	@OriginalMember(owner = "client!CCFLBOBS", name = "a", descriptor = "(I[III)V")
	public static void method383(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		try {
			anIntArray93 = arg1;
			anInt555 = arg2;
			anInt556 = arg0;
			method385(0, 0, arg2, arg0);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("13510, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CCFLBOBS", name = "a", descriptor = "(I)V")
	public static void method384() {
		try {
			anInt559 = 0;
			anInt557 = 0;
			anInt560 = anInt555;
			anInt558 = anInt556;
			anInt561 = anInt560 - 1;
			anInt562 = anInt560 / 2;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("86354, " + 0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CCFLBOBS", name = "a", descriptor = "(IZIII)V")
	public static void method385(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg2 > anInt555) {
				arg2 = anInt555;
			}
			if (arg3 > anInt556) {
				arg3 = anInt556;
			}
			anInt559 = arg0;
			anInt557 = arg1;
			anInt560 = arg2;
			anInt558 = arg3;
			anInt561 = anInt560 - 1;
			anInt562 = anInt560 / 2;
			anInt563 = anInt558 / 2;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("5862, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CCFLBOBS", name = "a", descriptor = "(Z)V")
	public static void method386() {
		try {
			@Pc(3) int local3 = anInt555 * anInt556;
			for (@Pc(8) int local8 = 0; local8 < local3; local8++) {
				anIntArray93[local8] = 0;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("91801, " + true + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CCFLBOBS", name = "a", descriptor = "(IIIIIII)V")
	public static void method387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg2 < anInt559) {
				arg3 -= anInt559 - arg2;
				arg2 = anInt559;
			}
			if (arg4 < anInt557) {
				arg0 -= anInt557 - arg4;
				arg4 = anInt557;
			}
			if (arg2 + arg3 > anInt560) {
				arg3 = anInt560 - arg2;
			}
			if (arg4 + arg0 > anInt558) {
				arg0 = anInt558 - arg4;
			}
			@Pc(45) int local45 = 256 - arg5;
			@Pc(53) int local53 = (arg1 >> 16 & 0xFF) * arg5;
			@Pc(61) int local61 = (arg1 >> 8 & 0xFF) * arg5;
			@Pc(67) int local67 = (arg1 & 0xFF) * arg5;
			@Pc(71) int local71 = anInt555 - arg3;
			@Pc(77) int local77 = arg2 + arg4 * anInt555;
			for (@Pc(79) int local79 = 0; local79 < arg0; local79++) {
				for (@Pc(84) int local84 = -arg3; local84 < 0; local84++) {
					@Pc(96) int local96 = (anIntArray93[local77] >> 16 & 0xFF) * local45;
					@Pc(106) int local106 = (anIntArray93[local77] >> 8 & 0xFF) * local45;
					@Pc(114) int local114 = (anIntArray93[local77] & 0xFF) * local45;
					@Pc(136) int local136 = (local53 + local96 >> 8 << 16) + (local61 + local106 >> 8 << 8) + (local67 + local114 >> 8);
					anIntArray93[local77++] = local136;
				}
				local77 += local71;
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("21608, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CCFLBOBS", name = "a", descriptor = "(IIIIIZ)V")
	public static void method388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1 < anInt559) {
				arg3 -= anInt559 - arg1;
				arg1 = anInt559;
			}
			if (arg2 < anInt557) {
				arg4 -= anInt557 - arg2;
				arg2 = anInt557;
			}
			if (arg1 + arg3 > anInt560) {
				arg3 = anInt560 - arg1;
			}
			if (arg2 + arg4 > anInt558) {
				arg4 = anInt558 - arg2;
			}
			@Pc(48) int local48 = anInt555 - arg3;
			@Pc(54) int local54 = arg1 + arg2 * anInt555;
			for (@Pc(57) int local57 = -arg4; local57 < 0; local57++) {
				for (@Pc(62) int local62 = -arg3; local62 < 0; local62++) {
					anIntArray93[local54++] = arg0;
				}
				local54 += local48;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("32254, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CCFLBOBS", name = "a", descriptor = "(IIIIII)V")
	public static void method389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method391(arg4, arg2, arg1, arg0);
			method391(arg4, arg2, arg1, arg0 + arg3 - 1);
			method393(arg1, arg3, arg2, arg0);
			method393(arg1, arg3, arg2 + arg4 - 1, arg0);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("39742, " + arg0 + ", " + arg1 + ", " + 264 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CCFLBOBS", name = "b", descriptor = "(IIIIIII)V")
	public static void method390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			method392(arg1, arg5, arg0, arg2, arg4);
			method392(arg1, arg5, arg0, arg2 + arg3 - 1, arg4);
			if (arg3 >= 3) {
				method394(arg5, arg2 + 1, arg1, arg4, arg3 - 2);
				method394(arg5, arg2 + 1, arg1 + arg0 - 1, arg4, arg3 - 2);
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("1513, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 936 + ", " + arg5 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CCFLBOBS", name = "a", descriptor = "(IIIII)V")
	public static void method391(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 >= anInt557 && arg3 < anInt558) {
				if (arg1 < anInt559) {
					arg0 -= anInt559 - arg1;
					arg1 = anInt559;
				}
				if (arg1 + arg0 > anInt560) {
					arg0 = anInt560 - arg1;
				}
				@Pc(32) int local32 = arg1 + arg3 * anInt555;
				for (@Pc(39) int local39 = 0; local39 < arg0; local39++) {
					anIntArray93[local32 + local39] = arg2;
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("23839, " + -898 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CCFLBOBS", name = "b", descriptor = "(IIIIII)V")
	private static void method392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 >= anInt557 && arg3 < anInt558) {
				if (arg0 < anInt559) {
					arg2 -= anInt559 - arg0;
					arg0 = anInt559;
				}
				if (arg0 + arg2 > anInt560) {
					arg2 = anInt560 - arg0;
				}
				@Pc(30) int local30 = 256 - arg4;
				@Pc(38) int local38 = (arg1 >> 16 & 0xFF) * arg4;
				@Pc(46) int local46 = (arg1 >> 8 & 0xFF) * arg4;
				@Pc(52) int local52 = (arg1 & 0xFF) * arg4;
				@Pc(66) int local66 = arg0 + arg3 * anInt555;
				for (@Pc(68) int local68 = 0; local68 < arg2; local68++) {
					@Pc(80) int local80 = (anIntArray93[local66] >> 16 & 0xFF) * local30;
					@Pc(90) int local90 = (anIntArray93[local66] >> 8 & 0xFF) * local30;
					@Pc(98) int local98 = (anIntArray93[local66] & 0xFF) * local30;
					@Pc(120) int local120 = (local38 + local80 >> 8 << 16) + (local46 + local90 >> 8 << 8) + (local52 + local98 >> 8);
					anIntArray93[local66++] = local120;
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("5965, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CCFLBOBS", name = "a", descriptor = "(IIIZI)V")
	public static void method393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt559 && arg2 < anInt560) {
				if (arg3 < anInt557) {
					arg1 -= anInt557 - arg3;
					arg3 = anInt557;
				}
				if (arg3 + arg1 > anInt558) {
					arg1 = anInt558 - arg3;
				}
				@Pc(36) int local36 = arg2 + arg3 * anInt555;
				for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
					anIntArray93[local36 + local38 * anInt555] = arg0;
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("7491, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CCFLBOBS", name = "c", descriptor = "(IIIIII)V")
	private static void method394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 >= anInt559 && arg2 < anInt560) {
				if (arg1 < anInt557) {
					arg4 -= anInt557 - arg1;
					arg1 = anInt557;
				}
				if (arg1 + arg4 > anInt558) {
					arg4 = anInt558 - arg1;
				}
				@Pc(30) int local30 = 256 - arg3;
				@Pc(42) int local42 = (arg0 >> 16 & 0xFF) * arg3;
				@Pc(50) int local50 = (arg0 >> 8 & 0xFF) * arg3;
				@Pc(56) int local56 = (arg0 & 0xFF) * arg3;
				@Pc(62) int local62 = arg2 + arg1 * anInt555;
				for (@Pc(64) int local64 = 0; local64 < arg4; local64++) {
					@Pc(76) int local76 = (anIntArray93[local62] >> 16 & 0xFF) * local30;
					@Pc(86) int local86 = (anIntArray93[local62] >> 8 & 0xFF) * local30;
					@Pc(94) int local94 = (anIntArray93[local62] & 0xFF) * local30;
					@Pc(116) int local116 = (local42 + local76 >> 8 << 16) + (local50 + local86 >> 8 << 8) + (local56 + local94 >> 8);
					anIntArray93[local62] = local116;
					local62 += anInt555;
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("45764, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -32286 + ", " + arg3 + ", " + arg4 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CCFLBOBS", name = "<init>", descriptor = "()V")
	protected Class2_Sub1_Sub3() {
	}
}
