import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!hb")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "[I")
	public static int[] anIntArray213;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
	public static int anInt734;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
	public static int anInt735;

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
	public static int anInt736;

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
	public static int anInt737;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
	public static int anInt738;

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
	public static int anInt739;

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
	public static int anInt740;

	@OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
	public static int anInt741;

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
	public static int anInt742;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "Z")
	private static boolean aBoolean178 = true;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
	private static int anInt731 = -84;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "B")
	private static byte aByte35 = -77;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "B")
	private static byte aByte36 = -77;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
	private static int anInt732 = 39984;

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
	private static int anInt733 = -523;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([IIIB)V")
	public static void method453(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			anIntArray213 = arg0;
			anInt734 = arg1;
			anInt735 = arg2;
			method455(0, arg1, arg2, 0, aBoolean178);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("77737, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -59 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
	public static void method454() {
		try {
			anInt738 = 0;
			anInt736 = 0;
			anInt739 = anInt734;
			anInt737 = anInt735;
			anInt740 = anInt739 - 1;
			anInt741 = anInt739 / 2;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("1471, " + 0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIZ)V")
	public static void method455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		try {
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg1 > anInt734) {
				arg1 = anInt734;
			}
			if (arg2 > anInt735) {
				arg2 = anInt735;
			}
			anInt738 = arg0;
			anInt736 = arg3;
			anInt739 = arg1;
			anInt737 = arg2;
			if (!arg4) {
				for (@Pc(29) int local29 = 1; local29 > 0; local29++) {
				}
			}
			anInt740 = anInt739 - 1;
			anInt741 = anInt739 / 2;
			anInt742 = anInt737 / 2;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("26048, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public static void method456() {
		try {
			@Pc(5) int local5 = anInt734 * anInt735;
			for (@Pc(16) int local16 = 0; local16 < local5; local16++) {
				anIntArray213[local16] = 0;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("88133, " + 274 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIBIII)V")
	public static void method457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg0 < anInt738) {
				arg5 -= anInt738 - arg0;
				arg0 = anInt738;
			}
			if (arg2 < anInt736) {
				arg1 -= anInt736 - arg2;
				arg2 = anInt736;
			}
			if (arg0 + arg5 > anInt739) {
				arg5 = anInt739 - arg0;
			}
			if (arg2 + arg1 > anInt737) {
				arg1 = anInt737 - arg2;
			}
			@Pc(45) int local45 = 256 - arg4;
			@Pc(53) int local53 = (arg6 >> 16 & 0xFF) * arg4;
			@Pc(61) int local61 = (arg6 >> 8 & 0xFF) * arg4;
			@Pc(67) int local67 = (arg6 & 0xFF) * arg4;
			@Pc(72) boolean local72 = false;
			@Pc(84) int local84 = anInt734 - arg5;
			@Pc(90) int local90 = arg0 + arg2 * anInt734;
			for (@Pc(92) int local92 = 0; local92 < arg1; local92++) {
				for (@Pc(97) int local97 = -arg5; local97 < 0; local97++) {
					@Pc(109) int local109 = (anIntArray213[local90] >> 16 & 0xFF) * local45;
					@Pc(119) int local119 = (anIntArray213[local90] >> 8 & 0xFF) * local45;
					@Pc(127) int local127 = (anIntArray213[local90] & 0xFF) * local45;
					@Pc(149) int local149 = (local53 + local109 >> 8 << 16) + (local61 + local119 >> 8 << 8) + (local67 + local127 >> 8);
					anIntArray213[local90++] = local149;
				}
				local90 += local84;
			}
		} catch (@Pc(167) RuntimeException local167) {
			signlink.reporterror("60909, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local167.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIII)V")
	public static void method458(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 < anInt738) {
				arg0 -= anInt738 - arg1;
				arg1 = anInt738;
			}
			if (arg2 < anInt736) {
				arg3 -= anInt736 - arg2;
				arg2 = anInt736;
			}
			if (arg1 + arg0 > anInt739) {
				arg0 = anInt739 - arg1;
			}
			if (arg2 + arg3 > anInt737) {
				arg3 = anInt737 - arg2;
			}
			@Pc(50) int local50 = anInt734 - arg0;
			@Pc(56) int local56 = arg1 + arg2 * anInt734;
			for (@Pc(59) int local59 = -arg3; local59 < 0; local59++) {
				for (@Pc(64) int local64 = -arg0; local64 < 0; local64++) {
					anIntArray213[local56++] = arg4;
				}
				local56 += local50;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("81138, " + arg0 + ", " + 5 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IIIIII)V")
	public static void method459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			method461(arg2, arg5, arg3, arg4);
			method461(arg2 + arg1 - 1, arg5, arg3, arg4);
			method463(arg2, arg1, arg4, arg5);
			if (arg0 < 0) {
				method463(arg2, arg1, arg4, arg5 + arg3 - 1);
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("53649, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIII)V")
	public static void method460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method462(arg3, arg5, arg0, arg1, arg4);
			method462(arg3 + arg2 - 1, arg5, arg0, arg1, arg4);
			if (arg2 >= 3) {
				method464(arg4, arg1, arg2 - 2, arg5, arg3 + 1);
				method464(arg4 + arg0 - 1, arg1, arg2 - 2, arg5, arg3 + 1);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("90939, " + arg0 + ", " + arg1 + ", " + -84 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIB)V")
	public static void method461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 >= anInt736 && arg0 < anInt737) {
				if (arg1 < anInt738) {
					arg2 -= anInt738 - arg1;
					arg1 = anInt738;
				}
				if (arg1 + arg2 > anInt739) {
					arg2 = anInt739 - arg1;
				}
				@Pc(32) int local32 = arg1 + arg0 * anInt734;
				for (@Pc(38) int local38 = 0; local38 < arg2; local38++) {
					anIntArray213[local32 + local38] = arg3;
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("74012, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 59 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIB)V")
	public static void method462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(6) int local6;
			if (aByte35 != -77) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			if (arg0 >= anInt736 && arg0 < anInt737) {
				if (arg4 < anInt738) {
					arg2 -= anInt738 - arg4;
					arg4 = anInt738;
				}
				if (arg4 + arg2 > anInt739) {
					arg2 = anInt739 - arg4;
				}
				local6 = 256 - arg1;
				@Pc(50) int local50 = (arg3 >> 16 & 0xFF) * arg1;
				@Pc(58) int local58 = (arg3 >> 8 & 0xFF) * arg1;
				@Pc(64) int local64 = (arg3 & 0xFF) * arg1;
				@Pc(70) int local70 = arg4 + arg0 * anInt734;
				for (@Pc(72) int local72 = 0; local72 < arg2; local72++) {
					@Pc(84) int local84 = (anIntArray213[local70] >> 16 & 0xFF) * local6;
					@Pc(94) int local94 = (anIntArray213[local70] >> 8 & 0xFF) * local6;
					@Pc(102) int local102 = (anIntArray213[local70] & 0xFF) * local6;
					@Pc(124) int local124 = (local50 + local84 >> 8 << 16) + (local58 + local94 >> 8 << 8) + (local64 + local102 >> 8);
					anIntArray213[local70++] = local124;
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("34065, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -77 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIZII)V")
	public static void method463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 >= anInt738 && arg3 < anInt739) {
				if (arg0 < anInt736) {
					arg1 -= anInt736 - arg0;
					arg0 = anInt736;
				}
				if (arg0 + arg1 > anInt737) {
					arg1 = anInt737 - arg0;
				}
				@Pc(32) int local32 = arg3 + arg0 * anInt734;
				for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
					anIntArray213[local32 + local38 * anInt734] = arg2;
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("7186, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIZII)V")
	private static void method464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt738 && arg0 < anInt739) {
				if (arg4 < anInt736) {
					arg2 -= anInt736 - arg4;
					arg4 = anInt736;
				}
				if (arg4 + arg2 > anInt737) {
					arg2 = anInt737 - arg4;
				}
				@Pc(32) int local32 = 256 - arg3;
				@Pc(40) int local40 = (arg1 >> 16 & 0xFF) * arg3;
				@Pc(48) int local48 = (arg1 >> 8 & 0xFF) * arg3;
				@Pc(54) int local54 = (arg1 & 0xFF) * arg3;
				@Pc(69) int local69 = arg0 + arg4 * anInt734;
				for (@Pc(71) int local71 = 0; local71 < arg2; local71++) {
					@Pc(83) int local83 = (anIntArray213[local69] >> 16 & 0xFF) * local32;
					@Pc(93) int local93 = (anIntArray213[local69] >> 8 & 0xFF) * local32;
					@Pc(101) int local101 = (anIntArray213[local69] & 0xFF) * local32;
					@Pc(123) int local123 = (local40 + local83 >> 8 << 16) + (local48 + local93 >> 8 << 8) + (local54 + local101 >> 8);
					anIntArray213[local69] = local123;
					local69 += anInt734;
				}
			}
		} catch (@Pc(137) RuntimeException local137) {
			signlink.reporterror("27648, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + local137.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
