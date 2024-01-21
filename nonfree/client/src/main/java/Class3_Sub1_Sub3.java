import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JNJDBENA")
public class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!JNJDBENA", name = "k", descriptor = "Z")
	private static boolean aBoolean159;

	@OriginalMember(owner = "client!JNJDBENA", name = "l", descriptor = "Z")
	private static boolean aBoolean160;

	@OriginalMember(owner = "client!JNJDBENA", name = "m", descriptor = "[I")
	public static int[] anIntArray162;

	@OriginalMember(owner = "client!JNJDBENA", name = "n", descriptor = "I")
	public static int anInt663;

	@OriginalMember(owner = "client!JNJDBENA", name = "o", descriptor = "I")
	public static int anInt664;

	@OriginalMember(owner = "client!JNJDBENA", name = "p", descriptor = "I")
	public static int anInt665;

	@OriginalMember(owner = "client!JNJDBENA", name = "q", descriptor = "I")
	public static int anInt666;

	@OriginalMember(owner = "client!JNJDBENA", name = "r", descriptor = "I")
	public static int anInt667;

	@OriginalMember(owner = "client!JNJDBENA", name = "s", descriptor = "I")
	public static int anInt668;

	@OriginalMember(owner = "client!JNJDBENA", name = "t", descriptor = "I")
	public static int anInt669;

	@OriginalMember(owner = "client!JNJDBENA", name = "u", descriptor = "I")
	public static int anInt670;

	@OriginalMember(owner = "client!JNJDBENA", name = "v", descriptor = "I")
	public static int anInt671;

	@OriginalMember(owner = "client!JNJDBENA", name = "i", descriptor = "I")
	private static int anInt661 = 6;

	@OriginalMember(owner = "client!JNJDBENA", name = "j", descriptor = "I")
	private static int anInt662 = -575;

	@OriginalMember(owner = "client!JNJDBENA", name = "a", descriptor = "(IIB[I)V")
	public static void method427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			anIntArray162 = arg2;
			anInt663 = arg0;
			anInt664 = arg1;
			method429(0, 0, arg1, arg0);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("8506, " + arg0 + ", " + arg1 + ", " + -31 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JNJDBENA", name = "a", descriptor = "(I)V")
	public static void method428() {
		try {
			anInt667 = 0;
			anInt665 = 0;
			anInt668 = anInt663;
			anInt666 = anInt664;
			anInt669 = anInt668 - 1;
			anInt670 = anInt668 / 2;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("92792, " + 3 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JNJDBENA", name = "a", descriptor = "(IIIII)V")
	public static void method429(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg3 > anInt663) {
				arg3 = anInt663;
			}
			if (arg2 > anInt664) {
				arg2 = anInt664;
			}
			anInt667 = arg0;
			anInt665 = arg1;
			anInt668 = arg3;
			anInt666 = arg2;
			anInt669 = anInt668 - 1;
			anInt670 = anInt668 / 2;
			anInt671 = anInt666 / 2;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("26344, " + arg0 + ", " + -749 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JNJDBENA", name = "b", descriptor = "(I)V")
	public static void method430() {
		try {
			@Pc(3) int local3 = anInt663 * anInt664;
			for (@Pc(8) int local8 = 0; local8 < local3; local8++) {
				anIntArray162[local8] = 0;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("98920, " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JNJDBENA", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg3 < anInt667) {
				arg1 -= anInt667 - arg3;
				arg3 = anInt667;
			}
			if (arg4 < anInt665) {
				arg5 -= anInt665 - arg4;
				arg4 = anInt665;
			}
			if (arg3 + arg1 > anInt668) {
				arg1 = anInt668 - arg3;
			}
			if (arg4 + arg5 > anInt666) {
				arg5 = anInt666 - arg4;
			}
			@Pc(45) int local45 = 256 - arg0;
			@Pc(53) int local53 = (arg2 >> 16 & 0xFF) * arg0;
			@Pc(61) int local61 = (arg2 >> 8 & 0xFF) * arg0;
			@Pc(67) int local67 = (arg2 & 0xFF) * arg0;
			@Pc(71) int local71 = anInt663 - arg1;
			@Pc(77) int local77 = arg3 + arg4 * anInt663;
			for (@Pc(79) int local79 = 0; local79 < arg5; local79++) {
				for (@Pc(84) int local84 = -arg1; local84 < 0; local84++) {
					@Pc(96) int local96 = (anIntArray162[local77] >> 16 & 0xFF) * local45;
					@Pc(106) int local106 = (anIntArray162[local77] >> 8 & 0xFF) * local45;
					@Pc(114) int local114 = (anIntArray162[local77] & 0xFF) * local45;
					@Pc(136) int local136 = (local53 + local96 >> 8 << 16) + (local61 + local106 >> 8 << 8) + (local67 + local114 >> 8);
					anIntArray162[local77++] = local136;
				}
				local77 += local71;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("71044, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + true + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JNJDBENA", name = "a", descriptor = "(IIIIII)V")
	public static void method432(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 < anInt667) {
				arg2 -= anInt667 - arg0;
				arg0 = anInt667;
			}
			if (arg1 < anInt665) {
				arg4 -= anInt665 - arg1;
				arg1 = anInt665;
			}
			if (arg0 + arg2 > anInt668) {
				arg2 = anInt668 - arg0;
			}
			if (arg1 + arg4 > anInt666) {
				arg4 = anInt666 - arg1;
			}
			@Pc(45) int local45 = anInt663 - arg2;
			@Pc(51) int local51 = arg0 + arg1 * anInt663;
			for (@Pc(57) int local57 = -arg4; local57 < 0; local57++) {
				for (@Pc(62) int local62 = -arg2; local62 < 0; local62++) {
					anIntArray162[local51++] = arg3;
				}
				local51 += local45;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("36479, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JNJDBENA", name = "b", descriptor = "(IIIIII)V")
	public static void method433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			method435(arg0, arg1, arg3, arg2);
			method435(arg0, arg1, arg3, arg2 + arg4 - 1);
			method437(arg4, arg3, arg0, arg2);
			method437(arg4, arg3, arg0 + arg1 - 1, arg2);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("63957, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JNJDBENA", name = "a", descriptor = "(IIIIIII)V")
	public static void method434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method436(arg0, arg4, arg5, arg2, arg3);
			method436(arg0, arg4, arg5, arg2, arg3 + arg1 - 1);
			if (arg1 >= 3) {
				method438(arg4, arg0, arg5, arg1 - 2, arg3 + 1);
				method438(arg4 + arg2 - 1, arg0, arg5, arg1 - 2, arg3 + 1);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("49586, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 4 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JNJDBENA", name = "b", descriptor = "(IIIII)V")
	public static void method435(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 >= anInt665 && arg3 < anInt666) {
				if (arg0 < anInt667) {
					arg1 -= anInt667 - arg0;
					arg0 = anInt667;
				}
				if (arg0 + arg1 > anInt668) {
					arg1 = anInt668 - arg0;
				}
				@Pc(32) int local32 = arg0 + arg3 * anInt663;
				for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
					anIntArray162[local32 + local38] = arg2;
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("16530, " + arg0 + ", " + -729 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JNJDBENA", name = "c", descriptor = "(IIIIII)V")
	private static void method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg4 >= anInt665 && arg4 < anInt666) {
				if (arg1 < anInt667) {
					arg3 -= anInt667 - arg1;
					arg1 = anInt667;
				}
				if (arg1 + arg3 > anInt668) {
					arg3 = anInt668 - arg1;
				}
				@Pc(30) int local30 = 256 - arg0;
				@Pc(38) int local38 = (arg2 >> 16 & 0xFF) * arg0;
				@Pc(46) int local46 = (arg2 >> 8 & 0xFF) * arg0;
				@Pc(52) int local52 = (arg2 & 0xFF) * arg0;
				@Pc(63) int local63 = arg1 + arg4 * anInt663;
				for (@Pc(65) int local65 = 0; local65 < arg3; local65++) {
					@Pc(77) int local77 = (anIntArray162[local63] >> 16 & 0xFF) * local30;
					@Pc(87) int local87 = (anIntArray162[local63] >> 8 & 0xFF) * local30;
					@Pc(95) int local95 = (anIntArray162[local63] & 0xFF) * local30;
					@Pc(117) int local117 = (local38 + local77 >> 8 << 16) + (local46 + local87 >> 8 << 8) + (local52 + local95 >> 8);
					anIntArray162[local63++] = local117;
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("13704, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -4269 + ", " + arg3 + ", " + arg4 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JNJDBENA", name = "c", descriptor = "(IIIII)V")
	public static void method437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt667 && arg2 < anInt668) {
				if (arg3 < anInt665) {
					arg0 -= anInt665 - arg3;
					arg3 = anInt665;
				}
				if (arg3 + arg0 > anInt666) {
					arg0 = anInt666 - arg3;
				}
				@Pc(43) int local43 = arg2 + arg3 * anInt663;
				for (@Pc(45) int local45 = 0; local45 < arg0; local45++) {
					anIntArray162[local43 + local45 * anInt663] = arg1;
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("85690, " + arg0 + ", " + arg1 + ", " + -771 + ", " + arg2 + ", " + arg3 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JNJDBENA", name = "d", descriptor = "(IIIIII)V")
	private static void method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt667 && arg0 < anInt668) {
				if (arg4 < anInt665) {
					arg3 -= anInt665 - arg4;
					arg4 = anInt665;
				}
				if (arg4 + arg3 > anInt666) {
					arg3 = anInt666 - arg4;
				}
				@Pc(41) int local41 = 256 - arg1;
				@Pc(49) int local49 = (arg2 >> 16 & 0xFF) * arg1;
				@Pc(57) int local57 = (arg2 >> 8 & 0xFF) * arg1;
				@Pc(63) int local63 = (arg2 & 0xFF) * arg1;
				@Pc(69) int local69 = arg0 + arg4 * anInt663;
				for (@Pc(71) int local71 = 0; local71 < arg3; local71++) {
					@Pc(83) int local83 = (anIntArray162[local69] >> 16 & 0xFF) * local41;
					@Pc(93) int local93 = (anIntArray162[local69] >> 8 & 0xFF) * local41;
					@Pc(101) int local101 = (anIntArray162[local69] & 0xFF) * local41;
					@Pc(123) int local123 = (local49 + local83 >> 8 << 16) + (local57 + local93 >> 8 << 8) + (local63 + local101 >> 8);
					anIntArray162[local69] = local123;
					local69 += anInt663;
				}
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("16048, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 45 + ", " + arg3 + ", " + arg4 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JNJDBENA", name = "<init>", descriptor = "()V")
	protected Class3_Sub1_Sub3() {
	}
}
