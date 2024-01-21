import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GEFFBGXP")
public class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!GEFFBGXP", name = "k", descriptor = "[I")
	public static int[] anIntArray208;

	@OriginalMember(owner = "client!GEFFBGXP", name = "l", descriptor = "I")
	public static int anInt772;

	@OriginalMember(owner = "client!GEFFBGXP", name = "m", descriptor = "I")
	public static int anInt773;

	@OriginalMember(owner = "client!GEFFBGXP", name = "n", descriptor = "I")
	public static int anInt774;

	@OriginalMember(owner = "client!GEFFBGXP", name = "o", descriptor = "I")
	public static int anInt775;

	@OriginalMember(owner = "client!GEFFBGXP", name = "p", descriptor = "I")
	public static int anInt776;

	@OriginalMember(owner = "client!GEFFBGXP", name = "q", descriptor = "I")
	public static int anInt777;

	@OriginalMember(owner = "client!GEFFBGXP", name = "r", descriptor = "I")
	public static int anInt778;

	@OriginalMember(owner = "client!GEFFBGXP", name = "s", descriptor = "I")
	public static int anInt779;

	@OriginalMember(owner = "client!GEFFBGXP", name = "t", descriptor = "I")
	public static int anInt780;

	@OriginalMember(owner = "client!GEFFBGXP", name = "h", descriptor = "I")
	private static int anInt770 = 111;

	@OriginalMember(owner = "client!GEFFBGXP", name = "i", descriptor = "B")
	private static byte aByte29 = 118;

	@OriginalMember(owner = "client!GEFFBGXP", name = "j", descriptor = "I")
	private static int anInt771 = -459;

	@OriginalMember(owner = "client!GEFFBGXP", name = "a", descriptor = "(III[I)V")
	public static void method512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		try {
			@Pc(3) boolean local3 = false;
			anIntArray208 = arg3;
			anInt772 = arg2;
			anInt773 = arg1;
			method514(arg1, 0, arg2, 0);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("92284, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GEFFBGXP", name = "a", descriptor = "(Z)V")
	public static void method513() {
		try {
			anInt776 = 0;
			anInt774 = 0;
			anInt777 = anInt772;
			anInt775 = anInt773;
			anInt778 = anInt777 - 1;
			anInt779 = anInt777 / 2;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("91746, " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GEFFBGXP", name = "a", descriptor = "(IIIII)V")
	public static void method514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg2 > anInt772) {
				arg2 = anInt772;
			}
			if (arg0 > anInt773) {
				arg0 = anInt773;
			}
			anInt776 = arg1;
			anInt774 = arg3;
			anInt777 = arg2;
			anInt775 = arg0;
			anInt778 = anInt777 - 1;
			anInt779 = anInt777 / 2;
			anInt780 = anInt775 / 2;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("13030, " + arg0 + ", " + arg1 + ", " + -841 + ", " + arg2 + ", " + arg3 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GEFFBGXP", name = "b", descriptor = "(Z)V")
	public static void method515() {
		try {
			@Pc(6) int local6 = anInt772 * anInt773;
			for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
				anIntArray208[local8] = 0;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("4860, " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GEFFBGXP", name = "a", descriptor = "(IIIIIBI)V")
	public static void method516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 < anInt776) {
				arg5 -= anInt776 - arg3;
				arg3 = anInt776;
			}
			if (arg2 < anInt774) {
				arg0 -= anInt774 - arg2;
				arg2 = anInt774;
			}
			if (arg3 + arg5 > anInt777) {
				arg5 = anInt777 - arg3;
			}
			if (arg2 + arg0 > anInt775) {
				arg0 = anInt775 - arg2;
			}
			@Pc(45) int local45 = 256 - arg4;
			@Pc(53) int local53 = (arg1 >> 16 & 0xFF) * arg4;
			@Pc(61) int local61 = (arg1 >> 8 & 0xFF) * arg4;
			@Pc(67) int local67 = (arg1 & 0xFF) * arg4;
			@Pc(71) int local71 = anInt772 - arg5;
			@Pc(77) int local77 = arg3 + arg2 * anInt772;
			for (@Pc(83) int local83 = 0; local83 < arg0; local83++) {
				for (@Pc(88) int local88 = -arg5; local88 < 0; local88++) {
					@Pc(100) int local100 = (anIntArray208[local77] >> 16 & 0xFF) * local45;
					@Pc(110) int local110 = (anIntArray208[local77] >> 8 & 0xFF) * local45;
					@Pc(118) int local118 = (anIntArray208[local77] & 0xFF) * local45;
					@Pc(140) int local140 = (local53 + local100 >> 8 << 16) + (local61 + local110 >> 8 << 8) + (local67 + local118 >> 8);
					anIntArray208[local77++] = local140;
				}
				local77 += local71;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("58593, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 3 + ", " + arg5 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GEFFBGXP", name = "a", descriptor = "(IIIIIZ)V")
	public static void method517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3 < anInt776) {
				arg2 -= anInt776 - arg3;
				arg3 = anInt776;
			}
			if (arg0 < anInt774) {
				arg1 -= anInt774 - arg0;
				arg0 = anInt774;
			}
			if (arg3 + arg2 > anInt777) {
				arg2 = anInt777 - arg3;
			}
			if (arg0 + arg1 > anInt775) {
				arg1 = anInt775 - arg0;
			}
			@Pc(45) int local45 = anInt772 - arg2;
			@Pc(55) int local55 = arg3 + arg0 * anInt772;
			for (@Pc(58) int local58 = -arg1; local58 < 0; local58++) {
				for (@Pc(63) int local63 = -arg2; local63 < 0; local63++) {
					anIntArray208[local55++] = arg4;
				}
				local55 += local45;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("13902, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GEFFBGXP", name = "a", descriptor = "(IIIIBI)V")
	public static void method518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			method520(arg0, arg2, arg3, arg4);
			if (aByte29 != 118) {
				for (@Pc(10) int local10 = 1; local10 > 0; local10++) {
				}
			}
			method520(arg0, arg2, arg3 + arg1 - 1, arg4);
			method522(arg1, arg0, arg3, arg4);
			method522(arg1, arg0 + arg2 - 1, arg3, arg4);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("94428, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 118 + ", " + arg4 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GEFFBGXP", name = "a", descriptor = "(IIIIIIB)V")
	public static void method519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6) {
		try {
			@Pc(4) boolean local4 = false;
			method521(arg0, arg2, 47, arg5, arg4, arg1);
			method521(arg0, arg2 + arg3 - 1, 47, arg5, arg4, arg1);
			if (arg3 >= 3) {
				method523(arg4, 909, arg3 - 2, arg5, arg1, arg2 + 1);
				method523(arg4, 909, arg3 - 2, arg5, arg1 + arg0 - 1, arg2 + 1);
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("8492, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GEFFBGXP", name = "a", descriptor = "(IIBII)V")
	public static void method520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt774 && arg2 < anInt775) {
				if (arg0 < anInt776) {
					arg1 -= anInt776 - arg0;
					arg0 = anInt776;
				}
				if (arg0 + arg1 > anInt777) {
					arg1 = anInt777 - arg0;
				}
				@Pc(36) int local36 = arg0 + arg2 * anInt772;
				for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
					anIntArray208[local36 + local38] = arg3;
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("20802, " + arg0 + ", " + arg1 + ", " + 31 + ", " + arg2 + ", " + arg3 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GEFFBGXP", name = "a", descriptor = "(IIIIII)V")
	private static void method521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg1 >= anInt774 && arg1 < anInt775) {
				if (arg5 < anInt776) {
					arg0 -= anInt776 - arg5;
					arg5 = anInt776;
				}
				if (arg5 + arg0 > anInt777) {
					arg0 = anInt777 - arg5;
				}
				@Pc(30) int local30 = 256 - arg4;
				@Pc(34) boolean local34 = false;
				@Pc(42) int local42 = (arg3 >> 16 & 0xFF) * arg4;
				@Pc(50) int local50 = (arg3 >> 8 & 0xFF) * arg4;
				@Pc(56) int local56 = (arg3 & 0xFF) * arg4;
				@Pc(62) int local62 = arg5 + arg1 * anInt772;
				for (@Pc(64) int local64 = 0; local64 < arg0; local64++) {
					@Pc(76) int local76 = (anIntArray208[local62] >> 16 & 0xFF) * local30;
					@Pc(86) int local86 = (anIntArray208[local62] >> 8 & 0xFF) * local30;
					@Pc(94) int local94 = (anIntArray208[local62] & 0xFF) * local30;
					@Pc(116) int local116 = (local42 + local76 >> 8 << 16) + (local50 + local86 >> 8 << 8) + (local56 + local94 >> 8);
					anIntArray208[local62++] = local116;
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("94070, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GEFFBGXP", name = "b", descriptor = "(IIIII)V")
	public static void method522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 >= anInt776 && arg1 < anInt777) {
				if (arg2 < anInt774) {
					arg0 -= anInt774 - arg2;
					arg2 = anInt774;
				}
				if (arg2 + arg0 > anInt775) {
					arg0 = anInt775 - arg2;
				}
				@Pc(36) int local36 = arg1 + arg2 * anInt772;
				for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
					anIntArray208[local36 + local38 * anInt772] = arg3;
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("57329, " + arg0 + ", " + arg1 + ", " + -267 + ", " + arg2 + ", " + arg3 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GEFFBGXP", name = "b", descriptor = "(IIIIII)V")
	private static void method523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg4 >= anInt776 && arg4 < anInt777) {
				if (arg5 < anInt774) {
					arg2 -= anInt774 - arg5;
					arg5 = anInt774;
				}
				if (arg5 + arg2 > anInt775) {
					arg2 = anInt775 - arg5;
				}
				@Pc(30) int local30 = 256 - arg0;
				@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg0;
				@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg0;
				@Pc(52) int local52 = (arg3 & 0xFF) * arg0;
				@Pc(56) boolean local56 = false;
				@Pc(62) int local62 = arg4 + arg5 * anInt772;
				for (@Pc(64) int local64 = 0; local64 < arg2; local64++) {
					@Pc(76) int local76 = (anIntArray208[local62] >> 16 & 0xFF) * local30;
					@Pc(86) int local86 = (anIntArray208[local62] >> 8 & 0xFF) * local30;
					@Pc(94) int local94 = (anIntArray208[local62] & 0xFF) * local30;
					@Pc(116) int local116 = (local38 + local76 >> 8 << 16) + (local46 + local86 >> 8 << 8) + (local52 + local94 >> 8);
					anIntArray208[local62] = local116;
					local62 += anInt772;
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("22260, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GEFFBGXP", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub3() {
	}
}
