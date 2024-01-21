import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TTGPXKMD")
public class Class6_Sub2_Sub2 extends Class6_Sub2 {

	@OriginalMember(owner = "client!TTGPXKMD", name = "i", descriptor = "Z")
	private static boolean aBoolean196;

	@OriginalMember(owner = "client!TTGPXKMD", name = "m", descriptor = "I")
	private static int anInt757;

	@OriginalMember(owner = "client!TTGPXKMD", name = "n", descriptor = "Z")
	private static boolean aBoolean198;

	@OriginalMember(owner = "client!TTGPXKMD", name = "o", descriptor = "[I")
	public static int[] anIntArray206;

	@OriginalMember(owner = "client!TTGPXKMD", name = "p", descriptor = "I")
	public static int anInt758;

	@OriginalMember(owner = "client!TTGPXKMD", name = "q", descriptor = "I")
	public static int anInt759;

	@OriginalMember(owner = "client!TTGPXKMD", name = "r", descriptor = "I")
	public static int anInt760;

	@OriginalMember(owner = "client!TTGPXKMD", name = "s", descriptor = "I")
	public static int anInt761;

	@OriginalMember(owner = "client!TTGPXKMD", name = "t", descriptor = "I")
	public static int anInt762;

	@OriginalMember(owner = "client!TTGPXKMD", name = "u", descriptor = "I")
	public static int anInt763;

	@OriginalMember(owner = "client!TTGPXKMD", name = "v", descriptor = "I")
	public static int anInt764;

	@OriginalMember(owner = "client!TTGPXKMD", name = "w", descriptor = "I")
	public static int anInt765;

	@OriginalMember(owner = "client!TTGPXKMD", name = "x", descriptor = "I")
	public static int anInt766;

	@OriginalMember(owner = "client!TTGPXKMD", name = "j", descriptor = "Z")
	private static boolean aBoolean197 = true;

	@OriginalMember(owner = "client!TTGPXKMD", name = "k", descriptor = "I")
	private static int anInt755 = 27889;

	@OriginalMember(owner = "client!TTGPXKMD", name = "l", descriptor = "I")
	private static int anInt756 = 531;

	@OriginalMember(owner = "client!TTGPXKMD", name = "a", descriptor = "(Z[III)V")
	public static void method514(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			anIntArray206 = arg1;
			anInt758 = arg3;
			anInt759 = arg2;
			if (arg0) {
				method516(0, arg3, arg2, 0);
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("23583, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTGPXKMD", name = "a", descriptor = "(I)V")
	public static void method515() {
		try {
			anInt762 = 0;
			anInt760 = 0;
			anInt763 = anInt758;
			anInt761 = anInt759;
			anInt764 = anInt763 - 1;
			anInt765 = anInt763 / 2;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("62356, " + -237 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTGPXKMD", name = "a", descriptor = "(IIIIB)V")
	public static void method516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg1 > anInt758) {
				arg1 = anInt758;
			}
			if (arg2 > anInt759) {
				arg2 = anInt759;
			}
			anInt762 = arg3;
			anInt760 = arg0;
			anInt763 = arg1;
			anInt761 = arg2;
			anInt764 = anInt763 - 1;
			anInt765 = anInt763 / 2;
			anInt766 = anInt761 / 2;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("64654, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -121 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTGPXKMD", name = "b", descriptor = "(I)V")
	public static void method517() {
		try {
			@Pc(3) int local3 = anInt758 * anInt759;
			for (@Pc(9) int local9 = 0; local9 < local3; local9++) {
				anIntArray206[local9] = 0;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("3489, " + 413 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTGPXKMD", name = "a", descriptor = "(IIIIIII)V")
	public static void method518(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 < anInt762) {
				arg1 -= anInt762 - arg0;
				arg0 = anInt762;
			}
			if (arg4 < anInt760) {
				arg5 -= anInt760 - arg4;
				arg4 = anInt760;
			}
			if (arg0 + arg1 > anInt763) {
				arg1 = anInt763 - arg0;
			}
			if (arg4 + arg5 > anInt761) {
				arg5 = anInt761 - arg4;
			}
			@Pc(53) int local53 = 256 - arg3;
			@Pc(61) int local61 = (arg2 >> 16 & 0xFF) * arg3;
			@Pc(69) int local69 = (arg2 >> 8 & 0xFF) * arg3;
			@Pc(75) int local75 = (arg2 & 0xFF) * arg3;
			@Pc(79) int local79 = anInt758 - arg1;
			@Pc(85) int local85 = arg0 + arg4 * anInt758;
			for (@Pc(87) int local87 = 0; local87 < arg5; local87++) {
				for (@Pc(92) int local92 = -arg1; local92 < 0; local92++) {
					@Pc(104) int local104 = (anIntArray206[local85] >> 16 & 0xFF) * local53;
					@Pc(114) int local114 = (anIntArray206[local85] >> 8 & 0xFF) * local53;
					@Pc(122) int local122 = (anIntArray206[local85] & 0xFF) * local53;
					@Pc(144) int local144 = (local61 + local104 >> 8 << 16) + (local69 + local114 >> 8 << 8) + (local75 + local122 >> 8);
					anIntArray206[local85++] = local144;
				}
				local85 += local79;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("76273, " + 2 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTGPXKMD", name = "a", descriptor = "(IIIZII)V")
	public static void method519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 < anInt762) {
				arg4 -= anInt762 - arg3;
				arg3 = anInt762;
			}
			if (arg1 < anInt760) {
				arg2 -= anInt760 - arg1;
				arg1 = anInt760;
			}
			if (arg3 + arg4 > anInt763) {
				arg4 = anInt763 - arg3;
			}
			if (arg1 + arg2 > anInt761) {
				arg2 = anInt761 - arg1;
			}
			@Pc(45) int local45 = anInt758 - arg4;
			@Pc(51) int local51 = arg3 + arg1 * anInt758;
			for (@Pc(54) int local54 = -arg2; local54 < 0; local54++) {
				for (@Pc(59) int local59 = -arg4; local59 < 0; local59++) {
					anIntArray206[local51++] = arg0;
				}
				local51 += local45;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("50678, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTGPXKMD", name = "a", descriptor = "(IIIIII)V")
	public static void method520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			method522(arg1, arg2, arg3, arg0);
			method522(arg1 + arg5 - 1, arg2, arg3, arg0);
			method524(arg3, arg0, arg5, arg1);
			@Pc(25) boolean local25 = false;
			method524(arg3, arg0 + arg2 - 1, arg5, arg1);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("35223, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTGPXKMD", name = "b", descriptor = "(IIIIIII)V")
	public static void method521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			method523(arg0, arg2, arg4, arg5, arg3);
			method523(arg0 + arg6 - 1, arg2, arg4, arg5, arg3);
			if (arg1 != 1) {
				aBoolean197 = !aBoolean197;
			}
			if (arg6 >= 3) {
				method525(arg6 - 2, arg0 + 1, arg3, arg2, arg5);
				method525(arg6 - 2, arg0 + 1, arg3 + arg4 - 1, arg2, arg5);
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("63890, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTGPXKMD", name = "a", descriptor = "(BIIII)V")
	public static void method522(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 >= anInt760 && arg0 < anInt761) {
				if (arg3 < anInt762) {
					arg1 -= anInt762 - arg3;
					arg3 = anInt762;
				}
				if (arg3 + arg1 > anInt763) {
					arg1 = anInt763 - arg3;
				}
				@Pc(36) int local36 = arg3 + arg0 * anInt758;
				for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
					anIntArray206[local36 + local38] = arg2;
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("62495, " + 1 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTGPXKMD", name = "a", descriptor = "(IIIIZI)V")
	private static void method523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt760 && arg0 < anInt761) {
				if (arg4 < anInt762) {
					arg2 -= anInt762 - arg4;
					arg4 = anInt762;
				}
				if (arg4 + arg2 > anInt763) {
					arg2 = anInt763 - arg4;
				}
				@Pc(30) int local30 = 256 - arg1;
				@Pc(42) int local42 = (arg3 >> 16 & 0xFF) * arg1;
				@Pc(50) int local50 = (arg3 >> 8 & 0xFF) * arg1;
				@Pc(56) int local56 = (arg3 & 0xFF) * arg1;
				@Pc(62) int local62 = arg4 + arg0 * anInt758;
				for (@Pc(64) int local64 = 0; local64 < arg2; local64++) {
					@Pc(76) int local76 = (anIntArray206[local62] >> 16 & 0xFF) * local30;
					@Pc(86) int local86 = (anIntArray206[local62] >> 8 & 0xFF) * local30;
					@Pc(94) int local94 = (anIntArray206[local62] & 0xFF) * local30;
					@Pc(116) int local116 = (local42 + local76 >> 8 << 16) + (local50 + local86 >> 8 << 8) + (local56 + local94 >> 8);
					anIntArray206[local62++] = local116;
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("79936, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTGPXKMD", name = "a", descriptor = "(IIIII)V")
	public static void method524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 >= anInt762 && arg1 < anInt763) {
				if (arg3 < anInt760) {
					arg2 -= anInt760 - arg3;
					arg3 = anInt760;
				}
				if (arg3 + arg2 > anInt761) {
					arg2 = anInt761 - arg3;
				}
				@Pc(32) int local32 = arg1 + arg3 * anInt758;
				for (@Pc(42) int local42 = 0; local42 < arg2; local42++) {
					anIntArray206[local32 + local42 * anInt758] = arg0;
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("37743, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 617 + ", " + arg3 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTGPXKMD", name = "b", descriptor = "(IIIIII)V")
	private static void method525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 >= anInt762 && arg2 < anInt763) {
				if (arg1 < anInt760) {
					arg0 -= anInt760 - arg1;
					arg1 = anInt760;
				}
				if (arg1 + arg0 > anInt761) {
					arg0 = anInt761 - arg1;
				}
				@Pc(35) int local35 = 256 - arg3;
				@Pc(43) int local43 = (arg4 >> 16 & 0xFF) * arg3;
				@Pc(51) int local51 = (arg4 >> 8 & 0xFF) * arg3;
				@Pc(57) int local57 = (arg4 & 0xFF) * arg3;
				@Pc(63) int local63 = arg2 + arg1 * anInt758;
				for (@Pc(65) int local65 = 0; local65 < arg0; local65++) {
					@Pc(77) int local77 = (anIntArray206[local63] >> 16 & 0xFF) * local35;
					@Pc(87) int local87 = (anIntArray206[local63] >> 8 & 0xFF) * local35;
					@Pc(95) int local95 = (anIntArray206[local63] & 0xFF) * local35;
					@Pc(117) int local117 = (local43 + local77 >> 8 << 16) + (local51 + local87 >> 8 << 8) + (local57 + local95 >> 8);
					anIntArray206[local63] = local117;
					local63 += anInt758;
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("44882, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -34006 + ", " + arg4 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTGPXKMD", name = "<init>", descriptor = "()V")
	protected Class6_Sub2_Sub2() {
	}
}
