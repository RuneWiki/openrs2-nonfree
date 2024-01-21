import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FVBHOYJF")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!FVBHOYJF", name = "j", descriptor = "Z")
	private static boolean aBoolean159;

	@OriginalMember(owner = "client!FVBHOYJF", name = "k", descriptor = "[I")
	public static int[] anIntArray192;

	@OriginalMember(owner = "client!FVBHOYJF", name = "l", descriptor = "I")
	public static int anInt730;

	@OriginalMember(owner = "client!FVBHOYJF", name = "m", descriptor = "I")
	public static int anInt731;

	@OriginalMember(owner = "client!FVBHOYJF", name = "n", descriptor = "I")
	public static int anInt732;

	@OriginalMember(owner = "client!FVBHOYJF", name = "o", descriptor = "I")
	public static int anInt733;

	@OriginalMember(owner = "client!FVBHOYJF", name = "p", descriptor = "I")
	public static int anInt734;

	@OriginalMember(owner = "client!FVBHOYJF", name = "q", descriptor = "I")
	public static int anInt735;

	@OriginalMember(owner = "client!FVBHOYJF", name = "r", descriptor = "I")
	public static int anInt736;

	@OriginalMember(owner = "client!FVBHOYJF", name = "s", descriptor = "I")
	public static int anInt737;

	@OriginalMember(owner = "client!FVBHOYJF", name = "t", descriptor = "I")
	public static int anInt738;

	@OriginalMember(owner = "client!FVBHOYJF", name = "h", descriptor = "I")
	private static int anInt728 = -446;

	@OriginalMember(owner = "client!FVBHOYJF", name = "i", descriptor = "I")
	private static int anInt729 = 625;

	@OriginalMember(owner = "client!FVBHOYJF", name = "a", descriptor = "([IIIB)V")
	public static void method512(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			anIntArray192 = arg0;
			anInt730 = arg2;
			anInt731 = arg1;
			method514(0, 0, arg1, arg2);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("64872, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FVBHOYJF", name = "a", descriptor = "(I)V")
	public static void method513() {
		try {
			anInt734 = 0;
			anInt732 = 0;
			anInt735 = anInt730;
			anInt733 = anInt731;
			anInt736 = anInt735 - 1;
			anInt737 = anInt735 / 2;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("2070, " + 9 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FVBHOYJF", name = "a", descriptor = "(IIIII)V")
	public static void method514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg3 > anInt730) {
				arg3 = anInt730;
			}
			if (arg2 > anInt731) {
				arg2 = anInt731;
			}
			anInt734 = arg1;
			anInt732 = arg0;
			anInt735 = arg3;
			anInt733 = arg2;
			anInt736 = anInt735 - 1;
			anInt737 = anInt735 / 2;
			anInt738 = anInt733 / 2;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("92250, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -39271 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FVBHOYJF", name = "a", descriptor = "(B)V")
	public static void method515() {
		try {
			@Pc(12) int local12 = anInt730 * anInt731;
			for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
				anIntArray192[local14] = 0;
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("86965, " + 0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FVBHOYJF", name = "a", descriptor = "(IIIIIII)V")
	public static void method516(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 < anInt734) {
				arg2 -= anInt734 - arg4;
				arg4 = anInt734;
			}
			if (arg1 < anInt732) {
				arg5 -= anInt732 - arg1;
				arg1 = anInt732;
			}
			if (arg4 + arg2 > anInt735) {
				arg2 = anInt735 - arg4;
			}
			if (arg1 + arg5 > anInt733) {
				arg5 = anInt733 - arg1;
			}
			@Pc(45) int local45 = 256 - arg3;
			@Pc(53) int local53 = (arg0 >> 16 & 0xFF) * arg3;
			@Pc(61) int local61 = (arg0 >> 8 & 0xFF) * arg3;
			@Pc(67) int local67 = (arg0 & 0xFF) * arg3;
			@Pc(71) int local71 = anInt730 - arg2;
			@Pc(77) int local77 = arg4 + arg1 * anInt730;
			for (@Pc(85) int local85 = 0; local85 < arg5; local85++) {
				for (@Pc(90) int local90 = -arg2; local90 < 0; local90++) {
					@Pc(102) int local102 = (anIntArray192[local77] >> 16 & 0xFF) * local45;
					@Pc(112) int local112 = (anIntArray192[local77] >> 8 & 0xFF) * local45;
					@Pc(120) int local120 = (anIntArray192[local77] & 0xFF) * local45;
					@Pc(142) int local142 = (local53 + local102 >> 8 << 16) + (local61 + local112 >> 8 << 8) + (local67 + local120 >> 8);
					anIntArray192[local77++] = local142;
				}
				local77 += local71;
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("34491, " + -956 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FVBHOYJF", name = "a", descriptor = "(IIIIII)V")
	public static void method517(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 < anInt734) {
				arg4 -= anInt734 - arg2;
				arg2 = anInt734;
			}
			if (arg3 < anInt732) {
				arg1 -= anInt732 - arg3;
				arg3 = anInt732;
			}
			if (arg2 + arg4 > anInt735) {
				arg4 = anInt735 - arg2;
			}
			if (arg3 + arg1 > anInt733) {
				arg1 = anInt733 - arg3;
			}
			@Pc(45) int local45 = anInt730 - arg4;
			@Pc(60) int local60 = arg2 + arg3 * anInt730;
			for (@Pc(63) int local63 = -arg1; local63 < 0; local63++) {
				for (@Pc(68) int local68 = -arg4; local68 < 0; local68++) {
					anIntArray192[local60++] = arg0;
				}
				local60 += local45;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("7519, " + arg0 + ", " + 435 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FVBHOYJF", name = "b", descriptor = "(IIIIII)V")
	public static void method518(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method520(arg4, arg3, arg1, arg2);
			method520(arg4, arg3 + arg0 - 1, arg1, arg2);
			method522(arg3, arg0, arg4, arg1);
			method522(arg3, arg0, arg4 + arg2 - 1, arg1);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("65787, " + arg0 + ", " + 479 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FVBHOYJF", name = "a", descriptor = "(IIIIIIB)V")
	public static void method519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			method521(arg1, arg0, arg4, arg2, arg5);
			method521(arg1, arg0, arg4, arg2, arg5 + arg3 - 1);
			if (arg3 >= 3) {
				method523(arg2, arg5 + 1, arg0, arg3 - 2, arg1);
				method523(arg2, arg5 + 1, arg0 + arg4 - 1, arg3 - 2, arg1);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("3445, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -16 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FVBHOYJF", name = "b", descriptor = "(IIIII)V")
	public static void method520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 >= anInt732 && arg1 < anInt733) {
				if (arg0 < anInt734) {
					arg3 -= anInt734 - arg0;
					arg0 = anInt734;
				}
				if (arg0 + arg3 > anInt735) {
					arg3 = anInt735 - arg0;
				}
				@Pc(34) int local34 = arg0 + arg1 * anInt730;
				for (@Pc(47) int local47 = 0; local47 < arg3; local47++) {
					anIntArray192[local34 + local47] = arg2;
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("81541, " + arg0 + ", " + arg1 + ", " + -368 + ", " + arg2 + ", " + arg3 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FVBHOYJF", name = "c", descriptor = "(IIIIII)V")
	private static void method521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg4 >= anInt732 && arg4 < anInt733) {
				if (arg1 < anInt734) {
					arg2 -= anInt734 - arg1;
					arg1 = anInt734;
				}
				if (arg1 + arg2 > anInt735) {
					arg2 = anInt735 - arg1;
				}
				@Pc(30) int local30 = 256 - arg3;
				@Pc(41) int local41 = (arg0 >> 16 & 0xFF) * arg3;
				@Pc(49) int local49 = (arg0 >> 8 & 0xFF) * arg3;
				@Pc(55) int local55 = (arg0 & 0xFF) * arg3;
				@Pc(61) int local61 = arg1 + arg4 * anInt730;
				for (@Pc(63) int local63 = 0; local63 < arg2; local63++) {
					@Pc(75) int local75 = (anIntArray192[local61] >> 16 & 0xFF) * local30;
					@Pc(85) int local85 = (anIntArray192[local61] >> 8 & 0xFF) * local30;
					@Pc(93) int local93 = (anIntArray192[local61] & 0xFF) * local30;
					@Pc(115) int local115 = (local41 + local75 >> 8 << 16) + (local49 + local85 >> 8 << 8) + (local55 + local93 >> 8);
					anIntArray192[local61++] = local115;
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("97796, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FVBHOYJF", name = "a", descriptor = "(IIBII)V")
	public static void method522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt734 && arg2 < anInt735) {
				if (arg0 < anInt732) {
					arg1 -= anInt732 - arg0;
					arg0 = anInt732;
				}
				if (arg0 + arg1 > anInt733) {
					arg1 = anInt733 - arg0;
				}
				@Pc(44) int local44 = arg2 + arg0 * anInt730;
				for (@Pc(46) int local46 = 0; local46 < arg1; local46++) {
					anIntArray192[local44 + local46 * anInt730] = arg3;
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("6217, " + arg0 + ", " + arg1 + ", " + 81 + ", " + arg2 + ", " + arg3 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FVBHOYJF", name = "d", descriptor = "(IIIIII)V")
	private static void method523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 >= anInt734 && arg2 < anInt735) {
				if (arg1 < anInt732) {
					arg3 -= anInt732 - arg1;
					arg1 = anInt732;
				}
				if (arg1 + arg3 > anInt733) {
					arg3 = anInt733 - arg1;
				}
				@Pc(33) int local33 = 256 - arg0;
				@Pc(41) int local41 = (arg4 >> 16 & 0xFF) * arg0;
				@Pc(49) int local49 = (arg4 >> 8 & 0xFF) * arg0;
				@Pc(55) int local55 = (arg4 & 0xFF) * arg0;
				@Pc(61) int local61 = arg2 + arg1 * anInt730;
				for (@Pc(63) int local63 = 0; local63 < arg3; local63++) {
					@Pc(75) int local75 = (anIntArray192[local61] >> 16 & 0xFF) * local33;
					@Pc(85) int local85 = (anIntArray192[local61] >> 8 & 0xFF) * local33;
					@Pc(93) int local93 = (anIntArray192[local61] & 0xFF) * local33;
					@Pc(115) int local115 = (local41 + local75 >> 8 << 16) + (local49 + local85 >> 8 << 8) + (local55 + local93 >> 8);
					anIntArray192[local61] = local115;
					local61 += anInt730;
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("99969, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -142 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FVBHOYJF", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
