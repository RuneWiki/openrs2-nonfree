import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AFCKELYG")
public class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!AFCKELYG", name = "l", descriptor = "Z")
	private static boolean aBoolean187;

	@OriginalMember(owner = "client!AFCKELYG", name = "m", descriptor = "[I")
	public static int[] anIntArray155;

	@OriginalMember(owner = "client!AFCKELYG", name = "n", descriptor = "I")
	public static int anInt729;

	@OriginalMember(owner = "client!AFCKELYG", name = "o", descriptor = "I")
	public static int anInt730;

	@OriginalMember(owner = "client!AFCKELYG", name = "p", descriptor = "I")
	public static int anInt731;

	@OriginalMember(owner = "client!AFCKELYG", name = "q", descriptor = "I")
	public static int anInt732;

	@OriginalMember(owner = "client!AFCKELYG", name = "r", descriptor = "I")
	public static int anInt733;

	@OriginalMember(owner = "client!AFCKELYG", name = "s", descriptor = "I")
	public static int anInt734;

	@OriginalMember(owner = "client!AFCKELYG", name = "t", descriptor = "I")
	public static int anInt735;

	@OriginalMember(owner = "client!AFCKELYG", name = "u", descriptor = "I")
	public static int anInt736;

	@OriginalMember(owner = "client!AFCKELYG", name = "v", descriptor = "I")
	public static int anInt737;

	@OriginalMember(owner = "client!AFCKELYG", name = "i", descriptor = "I")
	private static int anInt727 = 1;

	@OriginalMember(owner = "client!AFCKELYG", name = "j", descriptor = "Z")
	private static boolean aBoolean186 = true;

	@OriginalMember(owner = "client!AFCKELYG", name = "k", descriptor = "I")
	private static int anInt728 = -12499;

	@OriginalMember(owner = "client!AFCKELYG", name = "a", descriptor = "(III[I)V")
	public static void method487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			anIntArray155 = arg2;
			anInt729 = arg1;
			anInt730 = arg0;
			method489(arg0, 0, arg1, 0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("11606, " + arg0 + ", " + arg1 + ", " + -293 + ", " + arg2 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AFCKELYG", name = "a", descriptor = "(I)V")
	public static void method488() {
		try {
			anInt733 = 0;
			anInt731 = 0;
			anInt734 = anInt729;
			anInt732 = anInt730;
			anInt735 = anInt734 - 1;
			anInt736 = anInt734 / 2;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("33573, " + 4 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AFCKELYG", name = "a", descriptor = "(IIZII)V")
	public static void method489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg2 > anInt729) {
				arg2 = anInt729;
			}
			if (arg0 > anInt730) {
				arg0 = anInt730;
			}
			anInt733 = arg1;
			anInt731 = arg3;
			anInt734 = arg2;
			anInt732 = arg0;
			anInt735 = anInt734 - 1;
			anInt736 = anInt734 / 2;
			anInt737 = anInt732 / 2;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("69929, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AFCKELYG", name = "a", descriptor = "(Z)V")
	public static void method490(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				aBoolean187 = !aBoolean187;
			}
			@Pc(11) int local11 = anInt729 * anInt730;
			for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
				anIntArray155[local13] = 0;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("70033, " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AFCKELYG", name = "a", descriptor = "(IIIIIII)V")
	public static void method491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg5 < anInt733) {
				arg2 -= anInt733 - arg5;
				arg5 = anInt733;
			}
			if (arg1 < anInt731) {
				arg3 -= anInt731 - arg1;
				arg1 = anInt731;
			}
			if (arg5 + arg2 > anInt734) {
				arg2 = anInt734 - arg5;
			}
			if (arg1 + arg3 > anInt732) {
				arg3 = anInt732 - arg1;
			}
			@Pc(45) int local45 = 256 - arg4;
			@Pc(53) int local53 = (arg0 >> 16 & 0xFF) * arg4;
			@Pc(61) int local61 = (arg0 >> 8 & 0xFF) * arg4;
			@Pc(67) int local67 = (arg0 & 0xFF) * arg4;
			@Pc(71) int local71 = anInt729 - arg2;
			@Pc(77) int local77 = arg5 + arg1 * anInt729;
			for (@Pc(79) int local79 = 0; local79 < arg3; local79++) {
				for (@Pc(84) int local84 = -arg2; local84 < 0; local84++) {
					@Pc(96) int local96 = (anIntArray155[local77] >> 16 & 0xFF) * local45;
					@Pc(106) int local106 = (anIntArray155[local77] >> 8 & 0xFF) * local45;
					@Pc(114) int local114 = (anIntArray155[local77] & 0xFF) * local45;
					@Pc(136) int local136 = (local53 + local96 >> 8 << 16) + (local61 + local106 >> 8 << 8) + (local67 + local114 >> 8);
					anIntArray155[local77++] = local136;
				}
				local77 += local71;
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("38767, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AFCKELYG", name = "a", descriptor = "(IIIIII)V")
	public static void method492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 < anInt733) {
				arg4 -= anInt733 - arg2;
				arg2 = anInt733;
			}
			if (arg1 < anInt731) {
				arg0 -= anInt731 - arg1;
				arg1 = anInt731;
			}
			if (arg2 + arg4 > anInt734) {
				arg4 = anInt734 - arg2;
			}
			if (arg1 + arg0 > anInt732) {
				arg0 = anInt732 - arg1;
			}
			@Pc(45) int local45 = anInt729 - arg4;
			@Pc(51) int local51 = arg2 + arg1 * anInt729;
			for (@Pc(58) int local58 = -arg0; local58 < 0; local58++) {
				for (@Pc(63) int local63 = -arg4; local63 < 0; local63++) {
					anIntArray155[local51++] = arg3;
				}
				local51 += local45;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("38357, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AFCKELYG", name = "a", descriptor = "(IIIIIZ)V")
	public static void method493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			method495(arg4, arg3, arg1, arg0);
			method495(arg4 + arg2 - 1, arg3, arg1, arg0);
			method497(arg4, arg3, arg2, arg0, anInt728);
			method497(arg4, arg3, arg2, arg0 + arg1 - 1, anInt728);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("84944, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AFCKELYG", name = "b", descriptor = "(IIIIIII)V")
	public static void method494(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			method496(arg3, arg4, arg0, arg2, arg5);
			method496(arg3, arg4, arg0 + arg1 - 1, arg2, arg5);
			if (arg1 >= 3) {
				method498(arg3, arg5, arg2, arg0 + 1, arg1 - 2);
				method498(arg3, arg5 + arg4 - 1, arg2, arg0 + 1, arg1 - 2);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("34302, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -17319 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AFCKELYG", name = "a", descriptor = "(IIIIB)V")
	public static void method495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 >= anInt731 && arg0 < anInt732) {
				if (arg3 < anInt733) {
					arg2 -= anInt733 - arg3;
					arg3 = anInt733;
				}
				if (arg3 + arg2 > anInt734) {
					arg2 = anInt734 - arg3;
				}
				@Pc(32) int local32 = arg3 + arg0 * anInt729;
				for (@Pc(38) int local38 = 0; local38 < arg2; local38++) {
					anIntArray155[local32 + local38] = arg1;
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("10424, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 4 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AFCKELYG", name = "a", descriptor = "(IIIZII)V")
	private static void method496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 >= anInt731 && arg2 < anInt732) {
				if (arg4 < anInt733) {
					arg1 -= anInt733 - arg4;
					arg4 = anInt733;
				}
				if (arg4 + arg1 > anInt734) {
					arg1 = anInt734 - arg4;
				}
				@Pc(30) int local30 = 256 - arg3;
				@Pc(38) int local38 = (arg0 >> 16 & 0xFF) * arg3;
				@Pc(46) int local46 = (arg0 >> 8 & 0xFF) * arg3;
				@Pc(52) int local52 = (arg0 & 0xFF) * arg3;
				@Pc(58) int local58 = arg4 + arg2 * anInt729;
				for (@Pc(64) int local64 = 0; local64 < arg1; local64++) {
					@Pc(76) int local76 = (anIntArray155[local58] >> 16 & 0xFF) * local30;
					@Pc(86) int local86 = (anIntArray155[local58] >> 8 & 0xFF) * local30;
					@Pc(94) int local94 = (anIntArray155[local58] & 0xFF) * local30;
					@Pc(116) int local116 = (local38 + local76 >> 8 << 16) + (local46 + local86 >> 8 << 8) + (local52 + local94 >> 8);
					anIntArray155[local58++] = local116;
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("81344, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AFCKELYG", name = "a", descriptor = "(IIIII)V")
	public static void method497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3 >= anInt733 && arg3 < anInt734) {
				if (arg0 < anInt731) {
					arg2 -= anInt731 - arg0;
					arg0 = anInt731;
				}
				if (arg0 + arg2 > anInt732) {
					arg2 = anInt732 - arg0;
				}
				@Pc(32) int local32 = arg3 + arg0 * anInt729;
				if (arg4 == anInt728) {
					for (@Pc(38) int local38 = 0; local38 < arg2; local38++) {
						anIntArray155[local32 + local38 * anInt729] = arg1;
					}
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("63803, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AFCKELYG", name = "a", descriptor = "(IIIIBI)V")
	private static void method498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 >= anInt733 && arg1 < anInt734) {
				if (arg3 < anInt731) {
					arg4 -= anInt731 - arg3;
					arg3 = anInt731;
				}
				if (arg3 + arg4 > anInt732) {
					arg4 = anInt732 - arg3;
				}
				@Pc(30) int local30 = 256 - arg2;
				@Pc(38) int local38 = (arg0 >> 16 & 0xFF) * arg2;
				@Pc(46) int local46 = (arg0 >> 8 & 0xFF) * arg2;
				@Pc(52) int local52 = (arg0 & 0xFF) * arg2;
				@Pc(62) int local62 = arg1 + arg3 * anInt729;
				for (@Pc(64) int local64 = 0; local64 < arg4; local64++) {
					@Pc(76) int local76 = (anIntArray155[local62] >> 16 & 0xFF) * local30;
					@Pc(86) int local86 = (anIntArray155[local62] >> 8 & 0xFF) * local30;
					@Pc(94) int local94 = (anIntArray155[local62] & 0xFF) * local30;
					@Pc(116) int local116 = (local38 + local76 >> 8 << 16) + (local46 + local86 >> 8 << 8) + (local52 + local94 >> 8);
					anIntArray155[local62] = local116;
					local62 += anInt729;
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("1088, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 3 + ", " + arg4 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AFCKELYG", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub1() {
	}
}
