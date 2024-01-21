import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZLDPKUPX")
public class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ZLDPKUPX", name = "h", descriptor = "I")
	private static int anInt755;

	@OriginalMember(owner = "client!ZLDPKUPX", name = "n", descriptor = "I")
	private static int anInt757;

	@OriginalMember(owner = "client!ZLDPKUPX", name = "o", descriptor = "[I")
	public static int[] anIntArray181;

	@OriginalMember(owner = "client!ZLDPKUPX", name = "p", descriptor = "I")
	public static int anInt758;

	@OriginalMember(owner = "client!ZLDPKUPX", name = "q", descriptor = "I")
	public static int anInt759;

	@OriginalMember(owner = "client!ZLDPKUPX", name = "r", descriptor = "I")
	public static int anInt760;

	@OriginalMember(owner = "client!ZLDPKUPX", name = "s", descriptor = "I")
	public static int anInt761;

	@OriginalMember(owner = "client!ZLDPKUPX", name = "t", descriptor = "I")
	public static int anInt762;

	@OriginalMember(owner = "client!ZLDPKUPX", name = "u", descriptor = "I")
	public static int anInt763;

	@OriginalMember(owner = "client!ZLDPKUPX", name = "v", descriptor = "I")
	public static int anInt764;

	@OriginalMember(owner = "client!ZLDPKUPX", name = "w", descriptor = "I")
	public static int anInt765;

	@OriginalMember(owner = "client!ZLDPKUPX", name = "x", descriptor = "I")
	public static int anInt766;

	@OriginalMember(owner = "client!ZLDPKUPX", name = "i", descriptor = "B")
	private static byte aByte34 = 8;

	@OriginalMember(owner = "client!ZLDPKUPX", name = "j", descriptor = "Z")
	private static boolean aBoolean172 = true;

	@OriginalMember(owner = "client!ZLDPKUPX", name = "k", descriptor = "B")
	private static byte aByte35 = -126;

	@OriginalMember(owner = "client!ZLDPKUPX", name = "l", descriptor = "I")
	private static int anInt756 = 283;

	@OriginalMember(owner = "client!ZLDPKUPX", name = "m", descriptor = "Z")
	private static boolean aBoolean173 = true;

	@OriginalMember(owner = "client!ZLDPKUPX", name = "a", descriptor = "([IZII)V")
	public static void method516(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			anIntArray181 = arg0;
			anInt758 = arg1;
			anInt759 = arg2;
			method518(arg2, 0, arg1, 0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("71991, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLDPKUPX", name = "a", descriptor = "(I)V")
	public static void method517() {
		try {
			anInt762 = 0;
			anInt760 = 0;
			anInt763 = anInt758;
			anInt761 = anInt759;
			anInt764 = anInt763 - 1;
			anInt765 = anInt763 / 2;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("5703, " + -38001 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLDPKUPX", name = "a", descriptor = "(IIIII)V")
	public static void method518(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg2 > anInt758) {
				arg2 = anInt758;
			}
			if (arg0 > anInt759) {
				arg0 = anInt759;
			}
			anInt762 = arg1;
			anInt760 = arg3;
			anInt763 = arg2;
			anInt761 = arg0;
			anInt764 = anInt763 - 1;
			anInt765 = anInt763 / 2;
			anInt766 = anInt761 / 2;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("58163, " + 7 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLDPKUPX", name = "b", descriptor = "(I)V")
	public static void method519() {
		try {
			@Pc(7) int local7 = anInt758 * anInt759;
			for (@Pc(9) int local9 = 0; local9 < local7; local9++) {
				anIntArray181[local9] = 0;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("71643, " + -102 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLDPKUPX", name = "a", descriptor = "(IIIIIII)V")
	public static void method520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg5 < anInt762) {
				arg3 -= anInt762 - arg5;
				arg5 = anInt762;
			}
			if (arg0 < anInt760) {
				arg2 -= anInt760 - arg0;
				arg0 = anInt760;
			}
			if (arg5 + arg3 > anInt763) {
				arg3 = anInt763 - arg5;
			}
			if (arg0 + arg2 > anInt761) {
				arg2 = anInt761 - arg0;
			}
			@Pc(45) int local45 = 256 - arg1;
			@Pc(53) int local53 = (arg6 >> 16 & 0xFF) * arg1;
			@Pc(61) int local61 = (arg6 >> 8 & 0xFF) * arg1;
			@Pc(67) int local67 = (arg6 & 0xFF) * arg1;
			@Pc(71) int local71 = anInt758 - arg3;
			@Pc(77) int local77 = arg5 + arg0 * anInt758;
			if (arg4 == 0) {
				for (@Pc(82) int local82 = 0; local82 < arg2; local82++) {
					for (@Pc(87) int local87 = -arg3; local87 < 0; local87++) {
						@Pc(99) int local99 = (anIntArray181[local77] >> 16 & 0xFF) * local45;
						@Pc(109) int local109 = (anIntArray181[local77] >> 8 & 0xFF) * local45;
						@Pc(117) int local117 = (anIntArray181[local77] & 0xFF) * local45;
						@Pc(139) int local139 = (local53 + local99 >> 8 << 16) + (local61 + local109 >> 8 << 8) + (local67 + local117 >> 8);
						anIntArray181[local77++] = local139;
					}
					local77 += local71;
				}
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("35017, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLDPKUPX", name = "a", descriptor = "(IIIIBI)V")
	public static void method521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg3 < anInt762) {
				arg0 -= anInt762 - arg3;
				arg3 = anInt762;
			}
			if (arg5 < anInt760) {
				arg2 -= anInt760 - arg5;
				arg5 = anInt760;
			}
			if (arg3 + arg0 > anInt763) {
				arg0 = anInt763 - arg3;
			}
			if (arg5 + arg2 > anInt761) {
				arg2 = anInt761 - arg5;
			}
			@Pc(45) int local45 = anInt758 - arg0;
			if (arg4 == aByte34) {
				@Pc(50) boolean local50 = false;
			} else {
				anInt757 = -354;
			}
			@Pc(60) int local60 = arg3 + arg5 * anInt758;
			for (@Pc(63) int local63 = -arg2; local63 < 0; local63++) {
				for (@Pc(68) int local68 = -arg0; local68 < 0; local68++) {
					anIntArray181[local60++] = arg1;
				}
				local60 += local45;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("58762, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLDPKUPX", name = "a", descriptor = "(IIZIII)V")
	public static void method522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method524(arg3, arg2, arg1, arg4);
			method524(arg3 + arg0 - 1, arg2, arg1, arg4);
			method526(arg0, (byte) 1, arg2, arg3, arg4);
			method526(arg0, (byte) 1, arg2, arg3, arg4 + arg1 - 1);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("23973, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLDPKUPX", name = "b", descriptor = "(IIIIIII)V")
	public static void method523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			method525(arg4, arg3, arg1, arg5, arg0);
			if (arg2 != -34942) {
				anInt755 = 322;
			}
			method525(arg4, arg3, arg1, arg5, arg0 + arg6 - 1);
			if (arg6 >= 3) {
				method527(arg5, arg3, arg0 + 1, arg6 - 2, arg1);
				method527(arg5, arg3 + arg4 - 1, arg0 + 1, arg6 - 2, arg1);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("50844, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLDPKUPX", name = "b", descriptor = "(IIIII)V")
	public static void method524(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 >= anInt760 && arg0 < anInt761) {
				if (arg3 < anInt762) {
					arg2 -= anInt762 - arg3;
					arg3 = anInt762;
				}
				if (arg3 + arg2 > anInt763) {
					arg2 = anInt763 - arg3;
				}
				@Pc(34) int local34 = arg3 + arg0 * anInt758;
				for (@Pc(46) int local46 = 0; local46 < arg2; local46++) {
					anIntArray181[local34 + local46] = arg1;
				}
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("4506, " + 9916 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLDPKUPX", name = "a", descriptor = "(IIIIZI)V")
	private static void method525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg4 >= anInt760 && arg4 < anInt761) {
				if (arg1 < anInt762) {
					arg0 -= anInt762 - arg1;
					arg1 = anInt762;
				}
				if (arg1 + arg0 > anInt763) {
					arg0 = anInt763 - arg1;
				}
				@Pc(30) int local30 = 256 - arg3;
				@Pc(38) int local38 = (arg2 >> 16 & 0xFF) * arg3;
				@Pc(46) int local46 = (arg2 >> 8 & 0xFF) * arg3;
				@Pc(52) int local52 = (arg2 & 0xFF) * arg3;
				@Pc(58) int local58 = arg1 + arg4 * anInt758;
				for (@Pc(63) int local63 = 0; local63 < arg0; local63++) {
					@Pc(75) int local75 = (anIntArray181[local58] >> 16 & 0xFF) * local30;
					@Pc(85) int local85 = (anIntArray181[local58] >> 8 & 0xFF) * local30;
					@Pc(93) int local93 = (anIntArray181[local58] & 0xFF) * local30;
					@Pc(115) int local115 = (local38 + local75 >> 8 << 16) + (local46 + local85 >> 8 << 8) + (local52 + local93 >> 8);
					anIntArray181[local58++] = local115;
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("14643, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLDPKUPX", name = "a", descriptor = "(IBIII)V")
	public static void method526(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(6) boolean local6 = false;
			if (arg4 >= anInt762 && arg4 < anInt763) {
				if (arg3 < anInt760) {
					arg0 -= anInt760 - arg3;
					arg3 = anInt760;
				}
				if (arg3 + arg0 > anInt761) {
					arg0 = anInt761 - arg3;
				}
				@Pc(42) int local42 = arg4 + arg3 * anInt758;
				for (@Pc(44) int local44 = 0; local44 < arg0; local44++) {
					anIntArray181[local42 + local44 * anInt758] = arg2;
				}
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("54544, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLDPKUPX", name = "a", descriptor = "(IIIIII)V")
	private static void method527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 >= anInt762 && arg1 < anInt763) {
				if (arg2 < anInt760) {
					arg3 -= anInt760 - arg2;
					arg2 = anInt760;
				}
				if (arg2 + arg3 > anInt761) {
					arg3 = anInt761 - arg2;
				}
				@Pc(34) int local34 = 256 - arg0;
				@Pc(42) int local42 = (arg4 >> 16 & 0xFF) * arg0;
				@Pc(50) int local50 = (arg4 >> 8 & 0xFF) * arg0;
				@Pc(56) int local56 = (arg4 & 0xFF) * arg0;
				@Pc(62) int local62 = arg1 + arg2 * anInt758;
				for (@Pc(64) int local64 = 0; local64 < arg3; local64++) {
					@Pc(76) int local76 = (anIntArray181[local62] >> 16 & 0xFF) * local34;
					@Pc(86) int local86 = (anIntArray181[local62] >> 8 & 0xFF) * local34;
					@Pc(94) int local94 = (anIntArray181[local62] & 0xFF) * local34;
					@Pc(116) int local116 = (local42 + local76 >> 8 << 16) + (local50 + local86 >> 8 << 8) + (local56 + local94 >> 8);
					anIntArray181[local62] = local116;
					local62 += anInt758;
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("77925, " + arg0 + ", " + arg1 + ", " + 5 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZLDPKUPX", name = "<init>", descriptor = "()V")
	protected Class3_Sub1_Sub2() {
	}
}
