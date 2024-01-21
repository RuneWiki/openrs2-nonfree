import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gb")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
	private static int anInt674;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "[I")
	public static int[] anIntArray213;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public static int anInt675;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	public static int anInt676;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public static int anInt677;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public static int anInt678;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	public static int anInt679;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
	public static int anInt680;

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
	public static int anInt681;

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
	public static int anInt682;

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
	public static int anInt683;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	private static int anInt671 = 227;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "Z")
	private static boolean aBoolean187 = true;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "B")
	private static byte aByte29 = 5;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
	private static int anInt672 = -631;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
	private static int anInt673 = 9113;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIB[I)V")
	public static void method434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int[] arg3) {
		try {
			anIntArray213 = arg3;
			anInt675 = arg0;
			anInt676 = arg1;
			@Pc(10) boolean local10 = false;
			method436(0, 0, arg0, arg1);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("75236, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
	public static void method435() {
		try {
			anInt679 = 0;
			anInt677 = 0;
			anInt680 = anInt675;
			anInt678 = anInt676;
			anInt681 = anInt680 - 1;
			anInt682 = anInt680 / 2;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("91477, " + true + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIZI)V")
	public static void method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg2 > anInt675) {
				arg2 = anInt675;
			}
			if (arg3 > anInt676) {
				arg3 = anInt676;
			}
			anInt679 = arg0;
			anInt677 = arg1;
			anInt680 = arg2;
			anInt678 = arg3;
			anInt681 = anInt680 - 1;
			anInt682 = anInt680 / 2;
			anInt683 = anInt678 / 2;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("55287, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	public static void method437() {
		try {
			@Pc(6) int local6 = anInt675 * anInt676;
			for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
				anIntArray213[local8] = 0;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("14346, " + -843 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIII)V")
	public static void method438(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 < anInt679) {
				arg1 -= anInt679 - arg4;
				arg4 = anInt679;
			}
			if (arg5 < anInt677) {
				arg0 -= anInt677 - arg5;
				arg5 = anInt677;
			}
			if (arg4 + arg1 > anInt680) {
				arg1 = anInt680 - arg4;
			}
			if (arg5 + arg0 > anInt678) {
				arg0 = anInt678 - arg5;
			}
			@Pc(45) int local45 = 256 - arg2;
			@Pc(53) int local53 = (arg3 >> 16 & 0xFF) * arg2;
			@Pc(61) int local61 = (arg3 >> 8 & 0xFF) * arg2;
			@Pc(67) int local67 = (arg3 & 0xFF) * arg2;
			@Pc(71) int local71 = anInt675 - arg1;
			@Pc(77) int local77 = arg4 + arg5 * anInt675;
			for (@Pc(83) int local83 = 0; local83 < arg0; local83++) {
				for (@Pc(88) int local88 = -arg1; local88 < 0; local88++) {
					@Pc(100) int local100 = (anIntArray213[local77] >> 16 & 0xFF) * local45;
					@Pc(110) int local110 = (anIntArray213[local77] >> 8 & 0xFF) * local45;
					@Pc(118) int local118 = (anIntArray213[local77] & 0xFF) * local45;
					@Pc(140) int local140 = (local53 + local100 >> 8 << 16) + (local61 + local110 >> 8 << 8) + (local67 + local118 >> 8);
					anIntArray213[local77++] = local140;
				}
				local77 += local71;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("73773, " + 14017 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIBI)V")
	public static void method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg5 < anInt679) {
				arg3 -= anInt679 - arg5;
				arg5 = anInt679;
			}
			if (arg2 < anInt677) {
				arg1 -= anInt677 - arg2;
				arg2 = anInt677;
			}
			if (arg5 + arg3 > anInt680) {
				arg3 = anInt680 - arg5;
			}
			if (arg2 + arg1 > anInt678) {
				arg1 = anInt678 - arg2;
			}
			@Pc(45) int local45 = anInt675 - arg3;
			@Pc(54) int local54;
			if (aByte29 == 5) {
				@Pc(50) boolean local50 = false;
			} else {
				for (local54 = 1; local54 > 0; local54++) {
				}
			}
			local54 = arg5 + arg2 * anInt675;
			for (@Pc(68) int local68 = -arg1; local68 < 0; local68++) {
				for (@Pc(73) int local73 = -arg3; local73 < 0; local73++) {
					anIntArray213[local54++] = arg0;
				}
				local54 += local45;
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("61717, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIB)V")
	public static void method440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			method442(arg3, arg1, arg4, arg0);
			method442(arg3, arg1 + arg2 - 1, arg4, arg0);
			method444(arg1, arg3, arg0, arg2);
			method444(arg1, arg3, arg0 + arg4 - 1, arg2);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("16032, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -69 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIBII)V")
	public static void method441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method443(arg5, arg4, arg1, arg3, anInt672, arg0);
			method443(arg5, arg4, arg1, arg3, anInt672, arg0 + arg2 - 1);
			if (arg2 >= 3) {
				method445(arg1, arg5, arg0 + 1, arg2 - 2, arg4);
				method445(arg1, arg5 + arg3 - 1, arg0 + 1, arg2 - 2, arg4);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("52351, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 72 + ", " + arg4 + ", " + arg5 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
	public static void method442(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 >= anInt677 && arg1 < anInt678) {
				if (arg3 < anInt679) {
					arg2 -= anInt679 - arg3;
					arg3 = anInt679;
				}
				if (arg3 + arg2 > anInt680) {
					arg2 = anInt680 - arg3;
				}
				@Pc(35) int local35 = arg3 + arg1 * anInt675;
				for (@Pc(37) int local37 = 0; local37 < arg2; local37++) {
					anIntArray213[local35 + local37] = arg0;
				}
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("72871, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII)V")
	private static void method443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg5 >= anInt677 && arg5 < anInt678) {
				if (arg0 < anInt679) {
					arg3 -= anInt679 - arg0;
					arg0 = anInt679;
				}
				if (arg0 + arg3 > anInt680) {
					arg3 = anInt680 - arg0;
				}
				@Pc(32) int local32 = 256 - arg2;
				@Pc(40) int local40 = (arg1 >> 16 & 0xFF) * arg2;
				@Pc(48) int local48 = (arg1 >> 8 & 0xFF) * arg2;
				@Pc(54) int local54 = (arg1 & 0xFF) * arg2;
				while (arg4 >= 0) {
				}
				@Pc(70) int local70 = arg0 + arg5 * anInt675;
				for (@Pc(72) int local72 = 0; local72 < arg3; local72++) {
					@Pc(84) int local84 = (anIntArray213[local70] >> 16 & 0xFF) * local32;
					@Pc(94) int local94 = (anIntArray213[local70] >> 8 & 0xFF) * local32;
					@Pc(102) int local102 = (anIntArray213[local70] & 0xFF) * local32;
					@Pc(124) int local124 = (local40 + local84 >> 8 << 16) + (local48 + local94 >> 8 << 8) + (local54 + local102 >> 8);
					anIntArray213[local70++] = local124;
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("44867, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIBI)V")
	public static void method444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt679 && arg2 < anInt680) {
				if (arg0 < anInt677) {
					arg3 -= anInt677 - arg0;
					arg0 = anInt677;
				}
				if (arg0 + arg3 > anInt678) {
					arg3 = anInt678 - arg0;
				}
				@Pc(34) int local34 = arg2 + arg0 * anInt675;
				for (@Pc(46) int local46 = 0; local46 < arg3; local46++) {
					anIntArray213[local34 + local46 * anInt675] = arg1;
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("29510, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 4 + ", " + arg3 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIIII)V")
	private static void method445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 >= anInt679 && arg1 < anInt680) {
				if (arg2 < anInt677) {
					arg3 -= anInt677 - arg2;
					arg2 = anInt677;
				}
				if (arg2 + arg3 > anInt678) {
					arg3 = anInt678 - arg2;
				}
				@Pc(30) int local30 = 256 - arg0;
				@Pc(38) int local38 = (arg4 >> 16 & 0xFF) * arg0;
				@Pc(46) int local46 = (arg4 >> 8 & 0xFF) * arg0;
				@Pc(52) int local52 = (arg4 & 0xFF) * arg0;
				if (anInt673 != 9113) {
					anInt673 = -445;
				}
				@Pc(63) int local63 = arg1 + arg2 * anInt675;
				for (@Pc(65) int local65 = 0; local65 < arg3; local65++) {
					@Pc(77) int local77 = (anIntArray213[local63] >> 16 & 0xFF) * local30;
					@Pc(87) int local87 = (anIntArray213[local63] >> 8 & 0xFF) * local30;
					@Pc(95) int local95 = (anIntArray213[local63] & 0xFF) * local30;
					@Pc(117) int local117 = (local38 + local77 >> 8 << 16) + (local46 + local87 >> 8 << 8) + (local52 + local95 >> 8);
					anIntArray213[local63] = local117;
					local63 += anInt675;
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("81283, " + arg0 + ", " + arg1 + ", " + 9113 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
