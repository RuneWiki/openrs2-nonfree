import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!hb")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "Z")
	private static boolean aBoolean199;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
	private static int anInt738;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "[I")
	public static int[] anIntArray213;

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
	public static int anInt740;

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
	public static int anInt741;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
	public static int anInt742;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
	public static int anInt743;

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
	public static int anInt744;

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
	public static int anInt745;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
	public static int anInt746;

	@OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
	public static int anInt747;

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "I")
	public static int anInt748;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "I")
	private static int anInt739 = 7;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "Z")
	private static boolean aBoolean200 = true;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[IIZ)V")
	public static void method453(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		try {
			anIntArray213 = arg1;
			anInt740 = arg2;
			if (arg3) {
				anInt741 = arg0;
				method455(0, 0, arg0, arg2);
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("11597, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
	public static void method454() {
		try {
			anInt744 = 0;
			anInt742 = 0;
			anInt745 = anInt740;
			anInt743 = anInt741;
			anInt746 = anInt745 - 1;
			anInt747 = anInt745 / 2;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("85328, " + false + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII)V")
	public static void method455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg3 > anInt740) {
				arg3 = anInt740;
			}
			if (arg2 > anInt741) {
				arg2 = anInt741;
			}
			anInt744 = arg1;
			anInt742 = arg0;
			anInt745 = arg3;
			anInt743 = arg2;
			anInt746 = anInt745 - 1;
			anInt747 = anInt745 / 2;
			anInt748 = anInt743 / 2;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("79316, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V")
	public static void method456(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				aBoolean200 = !aBoolean200;
			}
			@Pc(11) int local11 = anInt740 * anInt741;
			for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
				anIntArray213[local13] = 0;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("72701, " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIII)V")
	public static void method457(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 < anInt744) {
				arg5 -= anInt744 - arg1;
				arg1 = anInt744;
			}
			if (arg3 < anInt742) {
				arg2 -= anInt742 - arg3;
				arg3 = anInt742;
			}
			if (arg1 + arg5 > anInt745) {
				arg5 = anInt745 - arg1;
			}
			if (arg3 + arg2 > anInt743) {
				arg2 = anInt743 - arg3;
			}
			@Pc(45) int local45 = 256 - arg0;
			@Pc(53) int local53 = (arg4 >> 16 & 0xFF) * arg0;
			@Pc(61) int local61 = (arg4 >> 8 & 0xFF) * arg0;
			@Pc(67) int local67 = (arg4 & 0xFF) * arg0;
			@Pc(71) int local71 = anInt740 - arg5;
			@Pc(77) int local77 = arg1 + arg3 * anInt740;
			if (anInt738 == 0) {
				for (@Pc(83) int local83 = 0; local83 < arg2; local83++) {
					for (@Pc(88) int local88 = -arg5; local88 < 0; local88++) {
						@Pc(100) int local100 = (anIntArray213[local77] >> 16 & 0xFF) * local45;
						@Pc(110) int local110 = (anIntArray213[local77] >> 8 & 0xFF) * local45;
						@Pc(118) int local118 = (anIntArray213[local77] & 0xFF) * local45;
						@Pc(140) int local140 = (local53 + local100 >> 8 << 16) + (local61 + local110 >> 8 << 8) + (local67 + local118 >> 8);
						anIntArray213[local77++] = local140;
					}
					local77 += local71;
				}
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("70984, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIII)V")
	public static void method458(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg4 < anInt744) {
				arg1 -= anInt744 - arg4;
				arg4 = anInt744;
			}
			if (arg2 < anInt742) {
				arg3 -= anInt742 - arg2;
				arg2 = anInt742;
			}
			if (arg4 + arg1 > anInt745) {
				arg1 = anInt745 - arg4;
			}
			if (arg2 + arg3 > anInt743) {
				arg3 = anInt743 - arg2;
			}
			@Pc(45) int local45 = anInt740 - arg1;
			@Pc(51) int local51 = arg4 + arg2 * anInt740;
			for (@Pc(54) int local54 = -arg3; local54 < 0; local54++) {
				for (@Pc(59) int local59 = -arg1; local59 < 0; local59++) {
					anIntArray213[local51++] = arg0;
				}
				local51 += local45;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("19804, " + 33027 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IIIIII)V")
	public static void method459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			method461(arg5, arg1, arg3, arg2);
			if (arg4 == 2) {
				method461(arg5, arg1 + arg0 - 1, arg3, arg2);
				method463(anInt739, arg0, arg2, arg1, arg5);
				method463(anInt739, arg0, arg2 + arg3 - 1, arg1, arg5);
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("12000, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IIIIIII)V")
	public static void method460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method462(arg0, arg4, arg2, arg3, arg5);
			method462(arg0, arg4, arg2, arg3 + arg1 - 1, arg5);
			if (arg1 >= 3) {
				method464(arg2, arg0, arg4, (byte) 9, arg3 + 1, arg1 - 2);
				method464(arg2, arg0 + arg5 - 1, arg4, (byte) 9, arg3 + 1, arg1 - 2);
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("90217, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(IIIII)V")
	public static void method461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 >= anInt742 && arg1 < anInt743) {
				if (arg3 < anInt744) {
					arg2 -= anInt744 - arg3;
					arg3 = anInt744;
				}
				if (arg3 + arg2 > anInt745) {
					arg2 = anInt745 - arg3;
				}
				@Pc(32) int local32 = arg3 + arg1 * anInt740;
				for (@Pc(43) int local43 = 0; local43 < arg2; local43++) {
					anIntArray213[local32 + local43] = arg0;
				}
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("54084, " + arg0 + ", " + arg1 + ", " + -25370 + ", " + arg2 + ", " + arg3 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(IIIIII)V")
	private static void method462(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 >= anInt742 && arg3 < anInt743) {
				if (arg0 < anInt744) {
					arg4 -= anInt744 - arg0;
					arg0 = anInt744;
				}
				if (arg0 + arg4 > anInt745) {
					arg4 = anInt745 - arg0;
				}
				@Pc(30) int local30 = 256 - arg1;
				@Pc(38) int local38 = (arg2 >> 16 & 0xFF) * arg1;
				@Pc(46) int local46 = (arg2 >> 8 & 0xFF) * arg1;
				@Pc(52) int local52 = (arg2 & 0xFF) * arg1;
				@Pc(65) int local65 = arg0 + arg3 * anInt740;
				for (@Pc(67) int local67 = 0; local67 < arg4; local67++) {
					@Pc(79) int local79 = (anIntArray213[local65] >> 16 & 0xFF) * local30;
					@Pc(89) int local89 = (anIntArray213[local65] >> 8 & 0xFF) * local30;
					@Pc(97) int local97 = (anIntArray213[local65] & 0xFF) * local30;
					@Pc(119) int local119 = (local38 + local79 >> 8 << 16) + (local46 + local89 >> 8 << 8) + (local52 + local97 >> 8);
					anIntArray213[local65++] = local119;
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("85030, " + arg0 + ", " + 3 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(IIIII)V")
	public static void method463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg0 >= 7 && arg0 <= 7 && (arg2 >= anInt744 && arg2 < anInt745)) {
				if (arg3 < anInt742) {
					arg1 -= anInt742 - arg3;
					arg3 = anInt742;
				}
				if (arg3 + arg1 > anInt743) {
					arg1 = anInt743 - arg3;
				}
				@Pc(39) int local39 = arg2 + arg3 * anInt740;
				for (@Pc(41) int local41 = 0; local41 < arg1; local41++) {
					anIntArray213[local39 + local41 * anInt740] = arg4;
				}
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("26706, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIBII)V")
	private static void method464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg1 >= anInt744 && arg1 < anInt745) {
				if (arg4 < anInt742) {
					arg5 -= anInt742 - arg4;
					arg4 = anInt742;
				}
				if (arg4 + arg5 > anInt743) {
					arg5 = anInt743 - arg4;
				}
				@Pc(32) int local32 = 256 - arg2;
				@Pc(40) int local40 = (arg0 >> 16 & 0xFF) * arg2;
				@Pc(48) int local48 = (arg0 >> 8 & 0xFF) * arg2;
				@Pc(54) int local54 = (arg0 & 0xFF) * arg2;
				@Pc(60) int local60 = arg1 + arg4 * anInt740;
				for (@Pc(62) int local62 = 0; local62 < arg5; local62++) {
					@Pc(74) int local74 = (anIntArray213[local60] >> 16 & 0xFF) * local32;
					@Pc(84) int local84 = (anIntArray213[local60] >> 8 & 0xFF) * local32;
					@Pc(92) int local92 = (anIntArray213[local60] & 0xFF) * local32;
					@Pc(114) int local114 = (local40 + local74 >> 8 << 16) + (local48 + local84 >> 8 << 8) + (local54 + local92 >> 8);
					anIntArray213[local60] = local114;
					local60 += anInt740;
				}
				@Pc(131) boolean local131 = false;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("97132, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
