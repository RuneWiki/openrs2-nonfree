import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!hb")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "[I")
	public static int[] anIntArray213;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
	public static int anInt756;

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
	public static int anInt757;

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
	public static int anInt758;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
	public static int anInt759;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
	public static int anInt760;

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
	public static int anInt761;

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
	public static int anInt762;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
	public static int anInt763;

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
	public static int anInt764;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
	private static int anInt755 = 741;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "B")
	private static byte aByte53 = 2;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "B")
	private static byte aByte54 = -119;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([IIII)V")
	public static void method453(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			anIntArray213 = arg0;
			anInt756 = arg2;
			anInt757 = arg3;
			@Pc(9) boolean local9 = false;
			method455(arg2, 0, 0, arg3);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("62318, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public static void method454() {
		try {
			anInt760 = 0;
			anInt758 = 0;
			anInt761 = anInt756;
			anInt759 = anInt757;
			anInt762 = anInt761 - 1;
			anInt763 = anInt761 / 2;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("47862, " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZIIII)V")
	public static void method455(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg0 > anInt756) {
				arg0 = anInt756;
			}
			if (arg3 > anInt757) {
				arg3 = anInt757;
			}
			anInt760 = arg1;
			anInt758 = arg2;
			anInt761 = arg0;
			anInt759 = arg3;
			anInt762 = anInt761 - 1;
			anInt763 = anInt761 / 2;
			anInt764 = anInt759 / 2;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("17488, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	public static void method456() {
		try {
			@Pc(6) int local6 = anInt756 * anInt757;
			for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
				anIntArray213[local8] = 0;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("92073, " + -692 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIII)V")
	public static void method457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 < anInt760) {
				arg2 -= anInt760 - arg4;
				arg4 = anInt760;
			}
			if (arg3 < anInt758) {
				arg1 -= anInt758 - arg3;
				arg3 = anInt758;
			}
			if (arg4 + arg2 > anInt761) {
				arg2 = anInt761 - arg4;
			}
			if (arg3 + arg1 > anInt759) {
				arg1 = anInt759 - arg3;
			}
			@Pc(45) int local45 = 256 - arg0;
			@Pc(53) int local53 = (arg5 >> 16 & 0xFF) * arg0;
			@Pc(61) int local61 = (arg5 >> 8 & 0xFF) * arg0;
			@Pc(67) int local67 = (arg5 & 0xFF) * arg0;
			@Pc(71) int local71 = anInt756 - arg2;
			@Pc(81) int local81 = arg4 + arg3 * anInt756;
			for (@Pc(83) int local83 = 0; local83 < arg1; local83++) {
				for (@Pc(88) int local88 = -arg2; local88 < 0; local88++) {
					@Pc(100) int local100 = (anIntArray213[local81] >> 16 & 0xFF) * local45;
					@Pc(110) int local110 = (anIntArray213[local81] >> 8 & 0xFF) * local45;
					@Pc(118) int local118 = (anIntArray213[local81] & 0xFF) * local45;
					@Pc(140) int local140 = (local53 + local100 >> 8 << 16) + (local61 + local110 >> 8 << 8) + (local67 + local118 >> 8);
					anIntArray213[local81++] = local140;
				}
				local81 += local71;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("74325, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 391 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIBI)V")
	public static void method458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 < anInt760) {
				arg3 -= anInt760 - arg1;
				arg1 = anInt760;
			}
			if (arg0 < anInt758) {
				arg4 -= anInt758 - arg0;
				arg0 = anInt758;
			}
			if (arg1 + arg3 > anInt761) {
				arg3 = anInt761 - arg1;
			}
			if (arg0 + arg4 > anInt759) {
				arg4 = anInt759 - arg0;
			}
			@Pc(45) int local45 = anInt756 - arg3;
			@Pc(51) int local51 = arg1 + arg0 * anInt756;
			for (@Pc(58) int local58 = -arg4; local58 < 0; local58++) {
				for (@Pc(63) int local63 = -arg3; local63 < 0; local63++) {
					anIntArray213[local51++] = arg2;
				}
				local51 += local45;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("17452, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 51 + ", " + arg4 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BIIIII)V")
	public static void method459(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method461(aByte53, arg0, arg4, arg2, arg1);
			method461(aByte53, arg0, arg4, arg2, arg1 + arg3 - 1);
			method463(arg3, arg0, arg1, arg4);
			method463(arg3, arg0, arg1, arg4 + arg2 - 1);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("53650, " + -97 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIZIIII)V")
	public static void method460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method462(arg1, arg3, arg4, arg5, arg2);
			method462(arg1 + arg0 - 1, arg3, arg4, arg5, arg2);
			if (arg0 >= 3) {
				method464(arg3, arg1 + 1, arg4, arg5, arg0 - 2);
				method464(arg3, arg1 + 1, arg4, arg5 + arg2 - 1, arg0 - 2);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("9732, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BIIII)V")
	public static void method461(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg4 >= anInt758 && arg4 < anInt759) {
				if (arg2 < anInt760) {
					arg3 -= anInt760 - arg2;
					arg2 = anInt760;
				}
				if (arg2 + arg3 > anInt761) {
					arg3 = anInt761 - arg2;
				}
				@Pc(32) int local32 = arg2 + arg4 * anInt756;
				if (arg0 != 2) {
					anInt755 = 149;
				}
				for (@Pc(39) int local39 = 0; local39 < arg3; local39++) {
					anIntArray213[local32 + local39] = arg1;
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("55863, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIII)V")
	public static void method462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt758 && arg0 < anInt759) {
				if (arg3 < anInt760) {
					arg4 -= anInt760 - arg3;
					arg3 = anInt760;
				}
				if (arg3 + arg4 > anInt761) {
					arg4 = anInt761 - arg3;
				}
				@Pc(30) int local30 = 256 - arg2;
				@Pc(38) int local38 = (arg1 >> 16 & 0xFF) * arg2;
				@Pc(46) int local46 = (arg1 >> 8 & 0xFF) * arg2;
				@Pc(52) int local52 = (arg1 & 0xFF) * arg2;
				@Pc(58) int local58 = arg3 + arg0 * anInt756;
				for (@Pc(64) int local64 = 0; local64 < arg4; local64++) {
					@Pc(76) int local76 = (anIntArray213[local58] >> 16 & 0xFF) * local30;
					@Pc(86) int local86 = (anIntArray213[local58] >> 8 & 0xFF) * local30;
					@Pc(94) int local94 = (anIntArray213[local58] & 0xFF) * local30;
					@Pc(116) int local116 = (local38 + local76 >> 8 << 16) + (local46 + local86 >> 8 << 8) + (local52 + local94 >> 8);
					anIntArray213[local58++] = local116;
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("96280, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 44931 + ", " + arg4 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIBII)V")
	public static void method463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			@Pc(6) int local6;
			if (aByte54 != -119) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			if (arg3 >= anInt760 && arg3 < anInt761) {
				if (arg2 < anInt758) {
					arg0 -= anInt758 - arg2;
					arg2 = anInt758;
				}
				if (arg2 + arg0 > anInt759) {
					arg0 = anInt759 - arg2;
				}
				local6 = arg3 + arg2 * anInt756;
				for (@Pc(46) int local46 = 0; local46 < arg0; local46++) {
					anIntArray213[local6 + local46 * anInt756] = arg1;
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("45983, " + arg0 + ", " + arg1 + ", " + -119 + ", " + arg2 + ", " + arg3 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(BIIIII)V")
	private static void method464(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 >= anInt760 && arg3 < anInt761) {
				if (arg1 < anInt758) {
					arg4 -= anInt758 - arg1;
					arg1 = anInt758;
				}
				if (arg1 + arg4 > anInt759) {
					arg4 = anInt759 - arg1;
				}
				@Pc(30) int local30 = 256 - arg2;
				@Pc(38) int local38 = (arg0 >> 16 & 0xFF) * arg2;
				@Pc(46) int local46 = (arg0 >> 8 & 0xFF) * arg2;
				@Pc(52) int local52 = (arg0 & 0xFF) * arg2;
				@Pc(58) int local58 = arg3 + arg1 * anInt756;
				for (@Pc(64) int local64 = 0; local64 < arg4; local64++) {
					@Pc(76) int local76 = (anIntArray213[local58] >> 16 & 0xFF) * local30;
					@Pc(86) int local86 = (anIntArray213[local58] >> 8 & 0xFF) * local30;
					@Pc(94) int local94 = (anIntArray213[local58] & 0xFF) * local30;
					@Pc(116) int local116 = (local38 + local76 >> 8 << 16) + (local46 + local86 >> 8 << 8) + (local52 + local94 >> 8);
					anIntArray213[local58] = local116;
					local58 += anInt756;
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("32006, " + -46 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
