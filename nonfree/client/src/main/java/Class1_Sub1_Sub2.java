import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gb")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	private static int anInt717;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "[I")
	public static int[] anIntArray213;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public static int anInt719;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public static int anInt720;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	public static int anInt721;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public static int anInt722;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public static int anInt723;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	public static int anInt724;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
	public static int anInt725;

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
	public static int anInt726;

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
	public static int anInt727;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
	private static int anInt716 = 2;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
	private static int anInt718;

	static {
		aBoolean186 = true;
		anInt718 = 315;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[II)V")
	public static void method434(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		try {
			anIntArray213 = arg1;
			anInt719 = arg0;
			anInt720 = arg2;
			method436(arg2, 0, arg0, 0);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("7716, " + -682 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
	public static void method435() {
		try {
			anInt723 = 0;
			anInt721 = 0;
			anInt724 = anInt719;
			anInt722 = anInt720;
			anInt725 = anInt724 - 1;
			anInt726 = anInt724 / 2;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("17860, " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
	public static void method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg2 > anInt719) {
				arg2 = anInt719;
			}
			if (arg0 > anInt720) {
				arg0 = anInt720;
			}
			anInt723 = arg3;
			anInt721 = arg1;
			anInt724 = arg2;
			anInt722 = arg0;
			anInt725 = anInt724 - 1;
			anInt726 = anInt724 / 2;
			anInt727 = anInt722 / 2;
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("22513, " + arg0 + ", " + arg1 + ", " + -134 + ", " + arg2 + ", " + arg3 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V")
	public static void method437() {
		try {
			@Pc(3) int local3 = anInt719 * anInt720;
			for (@Pc(8) int local8 = 0; local8 < local3; local8++) {
				anIntArray213[local8] = 0;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("88362, " + true + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIZIII)V")
	public static void method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 < anInt723) {
				arg0 -= anInt723 - arg4;
				arg4 = anInt723;
			}
			if (arg1 < anInt721) {
				arg5 -= anInt721 - arg1;
				arg1 = anInt721;
			}
			if (arg4 + arg0 > anInt724) {
				arg0 = anInt724 - arg4;
			}
			if (arg1 + arg5 > anInt722) {
				arg5 = anInt722 - arg1;
			}
			@Pc(49) int local49 = 256 - arg2;
			@Pc(57) int local57 = (arg3 >> 16 & 0xFF) * arg2;
			@Pc(65) int local65 = (arg3 >> 8 & 0xFF) * arg2;
			@Pc(71) int local71 = (arg3 & 0xFF) * arg2;
			@Pc(75) int local75 = anInt719 - arg0;
			@Pc(81) int local81 = arg4 + arg1 * anInt719;
			for (@Pc(83) int local83 = 0; local83 < arg5; local83++) {
				for (@Pc(88) int local88 = -arg0; local88 < 0; local88++) {
					@Pc(100) int local100 = (anIntArray213[local81] >> 16 & 0xFF) * local49;
					@Pc(110) int local110 = (anIntArray213[local81] >> 8 & 0xFF) * local49;
					@Pc(118) int local118 = (anIntArray213[local81] & 0xFF) * local49;
					@Pc(140) int local140 = (local57 + local100 >> 8 << 16) + (local65 + local110 >> 8 << 8) + (local71 + local118 >> 8);
					anIntArray213[local81++] = local140;
				}
				local81 += local75;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("54407, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII)V")
	public static void method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 < anInt723) {
				arg4 -= anInt723 - arg3;
				arg3 = anInt723;
			}
			if (arg1 < anInt721) {
				arg2 -= anInt721 - arg1;
				arg1 = anInt721;
			}
			if (arg3 + arg4 > anInt724) {
				arg4 = anInt724 - arg3;
			}
			if (arg1 + arg2 > anInt722) {
				arg2 = anInt722 - arg1;
			}
			@Pc(45) int local45 = anInt719 - arg4;
			@Pc(51) int local51 = arg3 + arg1 * anInt719;
			for (@Pc(54) int local54 = -arg2; local54 < 0; local54++) {
				for (@Pc(59) int local59 = -arg4; local59 < 0; local59++) {
					anIntArray213[local51++] = arg0;
				}
				local51 += local45;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("43721, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -917 + ", " + arg3 + ", " + arg4 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIIII)V")
	public static void method440(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method442(arg1, arg0, arg4, arg3);
			method442(arg1, arg0, arg4 + arg2 - 1, arg3);
			method444(arg0, arg3, arg2, arg4);
			method444(arg0, arg3 + arg1 - 1, arg2, arg4);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("93847, " + arg0 + ", " + -393 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIII)V")
	public static void method441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			method443(arg3, (byte) 4, arg0, arg4, arg6, arg5);
			method443(arg3, (byte) 4, arg0, arg4, arg6 + arg2 - 1, arg5);
			if (arg1 < 9 || arg1 > 9) {
				aBoolean186 = true;
			}
			if (arg2 >= 3) {
				method445(arg0, arg6 + 1, arg4, arg2 - 2, arg5);
				method445(arg0, arg6 + 1, arg4, arg2 - 2, arg5 + arg3 - 1);
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("4852, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIII)V")
	public static void method442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt721 && arg2 < anInt722) {
				if (arg3 < anInt723) {
					arg0 -= anInt723 - arg3;
					arg3 = anInt723;
				}
				if (arg3 + arg0 > anInt724) {
					arg0 = anInt724 - arg3;
				}
				@Pc(35) int local35 = arg3 + arg2 * anInt719;
				for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
					anIntArray213[local35 + local37] = arg1;
				}
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("47326, " + arg0 + ", " + arg1 + ", " + -380 + ", " + arg2 + ", " + arg3 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IBIIII)V")
	private static void method443(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg4 >= anInt721 && arg4 < anInt722) {
				if (arg5 < anInt723) {
					arg0 -= anInt723 - arg5;
					arg5 = anInt723;
				}
				if (arg5 + arg0 > anInt724) {
					arg0 = anInt724 - arg5;
				}
				@Pc(32) int local32 = 256 - arg2;
				@Pc(40) int local40 = (arg3 >> 16 & 0xFF) * arg2;
				@Pc(48) int local48 = (arg3 >> 8 & 0xFF) * arg2;
				@Pc(54) int local54 = (arg3 & 0xFF) * arg2;
				@Pc(59) boolean local59 = false;
				@Pc(68) int local68 = arg5 + arg4 * anInt719;
				for (@Pc(70) int local70 = 0; local70 < arg0; local70++) {
					@Pc(82) int local82 = (anIntArray213[local68] >> 16 & 0xFF) * local32;
					@Pc(92) int local92 = (anIntArray213[local68] >> 8 & 0xFF) * local32;
					@Pc(100) int local100 = (anIntArray213[local68] & 0xFF) * local32;
					@Pc(122) int local122 = (local40 + local82 >> 8 << 16) + (local48 + local92 >> 8 << 8) + (local54 + local100 >> 8);
					anIntArray213[local68++] = local122;
				}
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("1441, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(IIIII)V")
	public static void method444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 >= anInt723 && arg1 < anInt724) {
				if (arg3 < anInt721) {
					arg2 -= anInt721 - arg3;
					arg3 = anInt721;
				}
				if (arg3 + arg2 > anInt722) {
					arg2 = anInt722 - arg3;
				}
				@Pc(36) int local36 = arg1 + arg3 * anInt719;
				for (@Pc(38) int local38 = 0; local38 < arg2; local38++) {
					anIntArray213[local36 + local38 * anInt719] = arg0;
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("77519, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -40022 + ", " + arg3 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BIIIII)V")
	private static void method445(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg4 >= anInt723 && arg4 < anInt724) {
				if (arg1 < anInt721) {
					arg3 -= anInt721 - arg1;
					arg1 = anInt721;
				}
				if (arg1 + arg3 > anInt722) {
					arg3 = anInt722 - arg1;
				}
				@Pc(30) int local30 = 256 - arg0;
				@Pc(38) int local38 = (arg2 >> 16 & 0xFF) * arg0;
				@Pc(46) int local46 = (arg2 >> 8 & 0xFF) * arg0;
				@Pc(52) int local52 = (arg2 & 0xFF) * arg0;
				@Pc(58) int local58 = arg4 + arg1 * anInt719;
				for (@Pc(65) int local65 = 0; local65 < arg3; local65++) {
					@Pc(77) int local77 = (anIntArray213[local58] >> 16 & 0xFF) * local30;
					@Pc(87) int local87 = (anIntArray213[local58] >> 8 & 0xFF) * local30;
					@Pc(95) int local95 = (anIntArray213[local58] & 0xFF) * local30;
					@Pc(117) int local117 = (local38 + local77 >> 8 << 16) + (local46 + local87 >> 8 << 8) + (local52 + local95 >> 8);
					anIntArray213[local58] = local117;
					local58 += anInt719;
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("29709, " + 116 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
