import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TYMHEFTS")
public class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!TYMHEFTS", name = "l", descriptor = "B")
	private static byte aByte27;

	@OriginalMember(owner = "client!TYMHEFTS", name = "m", descriptor = "I")
	private static int anInt279;

	@OriginalMember(owner = "client!TYMHEFTS", name = "n", descriptor = "Z")
	private static boolean aBoolean105;

	@OriginalMember(owner = "client!TYMHEFTS", name = "p", descriptor = "[I")
	public static int[] anIntArray68;

	@OriginalMember(owner = "client!TYMHEFTS", name = "q", descriptor = "I")
	public static int anInt281;

	@OriginalMember(owner = "client!TYMHEFTS", name = "r", descriptor = "I")
	public static int anInt282;

	@OriginalMember(owner = "client!TYMHEFTS", name = "s", descriptor = "I")
	public static int anInt283;

	@OriginalMember(owner = "client!TYMHEFTS", name = "t", descriptor = "I")
	public static int anInt284;

	@OriginalMember(owner = "client!TYMHEFTS", name = "u", descriptor = "I")
	public static int anInt285;

	@OriginalMember(owner = "client!TYMHEFTS", name = "v", descriptor = "I")
	public static int anInt286;

	@OriginalMember(owner = "client!TYMHEFTS", name = "w", descriptor = "I")
	public static int anInt287;

	@OriginalMember(owner = "client!TYMHEFTS", name = "x", descriptor = "I")
	public static int anInt288;

	@OriginalMember(owner = "client!TYMHEFTS", name = "y", descriptor = "I")
	public static int anInt289;

	@OriginalMember(owner = "client!TYMHEFTS", name = "i", descriptor = "I")
	private static int anInt278 = 7;

	@OriginalMember(owner = "client!TYMHEFTS", name = "j", descriptor = "Z")
	private static boolean aBoolean104 = true;

	@OriginalMember(owner = "client!TYMHEFTS", name = "k", descriptor = "B")
	private static byte aByte26 = 9;

	@OriginalMember(owner = "client!TYMHEFTS", name = "o", descriptor = "I")
	private static int anInt280 = 46523;

	@OriginalMember(owner = "client!TYMHEFTS", name = "a", descriptor = "([IIII)V")
	public static void method273(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			anIntArray68 = arg0;
			anInt281 = arg2;
			anInt282 = arg1;
			method275(0, 0, arg1, arg2);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("31558, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TYMHEFTS", name = "a", descriptor = "(B)V")
	public static void method274(@OriginalArg(0) byte arg0) {
		try {
			anInt285 = 0;
			anInt283 = 0;
			anInt286 = anInt281;
			anInt284 = anInt282;
			anInt287 = anInt286 - 1;
			anInt288 = anInt286 / 2;
			if (arg0 == aByte26) {
				@Pc(20) boolean local20 = false;
			} else {
				for (@Pc(23) int local23 = 1; local23 > 0; local23++) {
				}
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("56757, " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TYMHEFTS", name = "a", descriptor = "(IIIII)V")
	public static void method275(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg3 > anInt281) {
				arg3 = anInt281;
			}
			if (arg2 > anInt282) {
				arg2 = anInt282;
			}
			anInt285 = arg0;
			anInt283 = arg1;
			anInt286 = arg3;
			anInt284 = arg2;
			anInt287 = anInt286 - 1;
			anInt288 = anInt286 / 2;
			anInt289 = anInt284 / 2;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("15110, " + 32409 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TYMHEFTS", name = "a", descriptor = "(I)V")
	public static void method276() {
		try {
			@Pc(8) int local8 = anInt281 * anInt282;
			for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
				anIntArray68[local10] = 0;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("59538, " + 30983 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TYMHEFTS", name = "a", descriptor = "(IBIIIII)V")
	public static void method277(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 < anInt285) {
				arg1 -= anInt285 - arg2;
				arg2 = anInt285;
			}
			if (arg4 < anInt283) {
				arg0 -= anInt283 - arg4;
				arg4 = anInt283;
			}
			if (arg2 + arg1 > anInt286) {
				arg1 = anInt286 - arg2;
			}
			if (arg4 + arg0 > anInt284) {
				arg0 = anInt284 - arg4;
			}
			@Pc(45) int local45 = 256 - arg3;
			@Pc(53) int local53 = (arg5 >> 16 & 0xFF) * arg3;
			@Pc(61) int local61 = (arg5 >> 8 & 0xFF) * arg3;
			@Pc(67) int local67 = (arg5 & 0xFF) * arg3;
			@Pc(71) int local71 = anInt281 - arg1;
			@Pc(77) int local77 = arg2 + arg4 * anInt281;
			for (@Pc(79) int local79 = 0; local79 < arg0; local79++) {
				for (@Pc(84) int local84 = -arg1; local84 < 0; local84++) {
					@Pc(96) int local96 = (anIntArray68[local77] >> 16 & 0xFF) * local45;
					@Pc(106) int local106 = (anIntArray68[local77] >> 8 & 0xFF) * local45;
					@Pc(114) int local114 = (anIntArray68[local77] & 0xFF) * local45;
					@Pc(136) int local136 = (local53 + local96 >> 8 << 16) + (local61 + local106 >> 8 << 8) + (local67 + local114 >> 8);
					anIntArray68[local77++] = local136;
				}
				local77 += local71;
			}
			if (aByte27 != 0) {
				;
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("77727, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TYMHEFTS", name = "a", descriptor = "(BIIIII)V")
	public static void method278(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg3 < anInt285) {
				arg1 -= anInt285 - arg3;
				arg3 = anInt285;
			}
			if (arg2 < anInt283) {
				arg4 -= anInt283 - arg2;
				arg2 = anInt283;
			}
			if (arg3 + arg1 > anInt286) {
				arg1 = anInt286 - arg3;
			}
			if (arg2 + arg4 > anInt284) {
				arg4 = anInt284 - arg2;
			}
			@Pc(45) int local45 = anInt281 - arg1;
			@Pc(51) int local51 = arg3 + arg2 * anInt281;
			if (arg0 != 1) {
				anInt280 = -299;
			}
			for (@Pc(59) int local59 = -arg4; local59 < 0; local59++) {
				for (@Pc(64) int local64 = -arg1; local64 < 0; local64++) {
					anIntArray68[local51++] = arg5;
				}
				local51 += local45;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("75165, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TYMHEFTS", name = "a", descriptor = "(IIIIII)V")
	public static void method279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method281(arg2, arg0, arg3, arg4);
			method281(arg2 + arg1 - 1, arg0, arg3, arg4);
			method283(arg1, arg3, arg2, arg4);
			method283(arg1, arg3, arg2, arg4 + arg0 - 1);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("75065, " + arg0 + ", " + arg1 + ", " + 42741 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TYMHEFTS", name = "a", descriptor = "(IIIIIII)V")
	public static void method280(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method282(arg3, arg4, arg0, arg2, arg1);
			method282(arg3, arg4, arg0, arg2, arg1 + arg5 - 1);
			if (arg5 >= 3) {
				method284(arg5 - 2, arg3, arg2, arg1 + 1, arg0);
				method284(arg5 - 2, arg3, arg2, arg1 + 1, arg0 + arg4 - 1);
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("20875, " + arg0 + ", " + 17146 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TYMHEFTS", name = "b", descriptor = "(IIIII)V")
	public static void method281(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 >= anInt283 && arg0 < anInt284) {
				if (arg3 < anInt285) {
					arg1 -= anInt285 - arg3;
					arg3 = anInt285;
				}
				if (arg3 + arg1 > anInt286) {
					arg1 = anInt286 - arg3;
				}
				@Pc(36) int local36 = arg3 + arg0 * anInt281;
				for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
					anIntArray68[local36 + local38] = arg2;
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("86647, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TYMHEFTS", name = "a", descriptor = "(IIIIBI)V")
	private static void method282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg4 >= anInt283 && arg4 < anInt284) {
				if (arg2 < anInt285) {
					arg1 -= anInt285 - arg2;
					arg2 = anInt285;
				}
				if (arg2 + arg1 > anInt286) {
					arg1 = anInt286 - arg2;
				}
				@Pc(30) int local30 = 256 - arg3;
				@Pc(38) int local38 = (arg0 >> 16 & 0xFF) * arg3;
				@Pc(46) int local46 = (arg0 >> 8 & 0xFF) * arg3;
				@Pc(52) int local52 = (arg0 & 0xFF) * arg3;
				@Pc(62) int local62 = arg2 + arg4 * anInt281;
				for (@Pc(64) int local64 = 0; local64 < arg1; local64++) {
					@Pc(76) int local76 = (anIntArray68[local62] >> 16 & 0xFF) * local30;
					@Pc(86) int local86 = (anIntArray68[local62] >> 8 & 0xFF) * local30;
					@Pc(94) int local94 = (anIntArray68[local62] & 0xFF) * local30;
					@Pc(116) int local116 = (local38 + local76 >> 8 << 16) + (local46 + local86 >> 8 << 8) + (local52 + local94 >> 8);
					anIntArray68[local62++] = local116;
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("16496, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 77 + ", " + arg4 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TYMHEFTS", name = "c", descriptor = "(IIIII)V")
	public static void method283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 >= anInt285 && arg3 < anInt286) {
				if (arg2 < anInt283) {
					arg0 -= anInt283 - arg2;
					arg2 = anInt283;
				}
				if (arg2 + arg0 > anInt284) {
					arg0 = anInt284 - arg2;
				}
				@Pc(44) int local44 = arg3 + arg2 * anInt281;
				for (@Pc(46) int local46 = 0; local46 < arg0; local46++) {
					anIntArray68[local44 + local46 * anInt281] = arg1;
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("95141, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + arg3 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TYMHEFTS", name = "a", descriptor = "(IIIIZI)V")
	private static void method284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg4 >= anInt285 && arg4 < anInt286) {
				if (arg3 < anInt283) {
					arg0 -= anInt283 - arg3;
					arg3 = anInt283;
				}
				if (arg3 + arg0 > anInt284) {
					arg0 = anInt284 - arg3;
				}
				@Pc(30) int local30 = 256 - arg2;
				@Pc(46) int local46 = (arg1 >> 16 & 0xFF) * arg2;
				@Pc(54) int local54 = (arg1 >> 8 & 0xFF) * arg2;
				@Pc(60) int local60 = (arg1 & 0xFF) * arg2;
				@Pc(66) int local66 = arg4 + arg3 * anInt281;
				for (@Pc(68) int local68 = 0; local68 < arg0; local68++) {
					@Pc(80) int local80 = (anIntArray68[local66] >> 16 & 0xFF) * local30;
					@Pc(90) int local90 = (anIntArray68[local66] >> 8 & 0xFF) * local30;
					@Pc(98) int local98 = (anIntArray68[local66] & 0xFF) * local30;
					@Pc(120) int local120 = (local46 + local80 >> 8 << 16) + (local54 + local90 >> 8 << 8) + (local60 + local98 >> 8);
					anIntArray68[local66] = local120;
					local66 += anInt281;
				}
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("47507, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TYMHEFTS", name = "<init>", descriptor = "()V")
	protected Class2_Sub1_Sub1() {
	}
}
