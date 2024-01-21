import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TIJYBGAE")
public class Class8_Sub1_Sub2 extends Class8_Sub1 {

	@OriginalMember(owner = "client!TIJYBGAE", name = "j", descriptor = "I")
	private static int anInt804;

	@OriginalMember(owner = "client!TIJYBGAE", name = "l", descriptor = "[I")
	public static int[] anIntArray201;

	@OriginalMember(owner = "client!TIJYBGAE", name = "m", descriptor = "I")
	public static int anInt806;

	@OriginalMember(owner = "client!TIJYBGAE", name = "n", descriptor = "I")
	public static int anInt807;

	@OriginalMember(owner = "client!TIJYBGAE", name = "o", descriptor = "I")
	public static int anInt808;

	@OriginalMember(owner = "client!TIJYBGAE", name = "p", descriptor = "I")
	public static int anInt809;

	@OriginalMember(owner = "client!TIJYBGAE", name = "q", descriptor = "I")
	public static int anInt810;

	@OriginalMember(owner = "client!TIJYBGAE", name = "r", descriptor = "I")
	public static int anInt811;

	@OriginalMember(owner = "client!TIJYBGAE", name = "s", descriptor = "I")
	public static int anInt812;

	@OriginalMember(owner = "client!TIJYBGAE", name = "t", descriptor = "I")
	public static int anInt813;

	@OriginalMember(owner = "client!TIJYBGAE", name = "u", descriptor = "I")
	public static int anInt814;

	@OriginalMember(owner = "client!TIJYBGAE", name = "k", descriptor = "I")
	private static int anInt805 = -803;

	@OriginalMember(owner = "client!TIJYBGAE", name = "a", descriptor = "(II[II)V")
	public static void method545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		try {
			anIntArray201 = arg2;
			anInt806 = arg0;
			anInt807 = arg1;
			method547(arg1, 0, 0, arg0);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("61320, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 430 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TIJYBGAE", name = "a", descriptor = "(I)V")
	public static void method546() {
		try {
			anInt810 = 0;
			anInt808 = 0;
			anInt811 = anInt806;
			anInt809 = anInt807;
			anInt812 = anInt811 - 1;
			anInt813 = anInt811 / 2;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("96240, " + -847 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TIJYBGAE", name = "a", descriptor = "(IIIII)V")
	public static void method547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg3 > anInt806) {
				arg3 = anInt806;
			}
			if (arg0 > anInt807) {
				arg0 = anInt807;
			}
			anInt810 = arg1;
			anInt808 = arg2;
			anInt811 = arg3;
			anInt809 = arg0;
			anInt812 = anInt811 - 1;
			anInt813 = anInt811 / 2;
			anInt814 = anInt809 / 2;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("29404, " + arg0 + ", " + arg1 + ", " + -34121 + ", " + arg2 + ", " + arg3 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TIJYBGAE", name = "b", descriptor = "(I)V")
	public static void method548(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int local5 = anInt806 * anInt807;
			@Pc(9) int local9;
			if (arg0 != 0) {
				for (local9 = 1; local9 > 0; local9++) {
				}
			}
			for (local9 = 0; local9 < local5; local9++) {
				anIntArray201[local9] = 0;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("74277, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TIJYBGAE", name = "a", descriptor = "(IIIIIII)V")
	public static void method549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 < anInt810) {
				arg4 -= anInt810 - arg1;
				arg1 = anInt810;
			}
			if (arg2 < anInt808) {
				arg0 -= anInt808 - arg2;
				arg2 = anInt808;
			}
			if (arg1 + arg4 > anInt811) {
				arg4 = anInt811 - arg1;
			}
			if (arg2 + arg0 > anInt809) {
				arg0 = anInt809 - arg2;
			}
			@Pc(49) int local49 = 256 - arg3;
			@Pc(57) int local57 = (arg5 >> 16 & 0xFF) * arg3;
			@Pc(65) int local65 = (arg5 >> 8 & 0xFF) * arg3;
			@Pc(71) int local71 = (arg5 & 0xFF) * arg3;
			@Pc(75) int local75 = anInt806 - arg4;
			@Pc(81) int local81 = arg1 + arg2 * anInt806;
			for (@Pc(83) int local83 = 0; local83 < arg0; local83++) {
				for (@Pc(88) int local88 = -arg4; local88 < 0; local88++) {
					@Pc(100) int local100 = (anIntArray201[local81] >> 16 & 0xFF) * local49;
					@Pc(110) int local110 = (anIntArray201[local81] >> 8 & 0xFF) * local49;
					@Pc(118) int local118 = (anIntArray201[local81] & 0xFF) * local49;
					@Pc(140) int local140 = (local57 + local100 >> 8 << 16) + (local65 + local110 >> 8 << 8) + (local71 + local118 >> 8);
					anIntArray201[local81++] = local140;
				}
				local81 += local75;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("14901, " + arg0 + ", " + arg1 + ", " + -47082 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TIJYBGAE", name = "a", descriptor = "(IIIIII)V")
	public static void method550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg4 < anInt810) {
				arg0 -= anInt810 - arg4;
				arg4 = anInt810;
			}
			if (arg1 < anInt808) {
				arg3 -= anInt808 - arg1;
				arg1 = anInt808;
			}
			if (arg4 + arg0 > anInt811) {
				arg0 = anInt811 - arg4;
			}
			if (arg1 + arg3 > anInt809) {
				arg3 = anInt809 - arg1;
			}
			@Pc(45) int local45 = anInt806 - arg0;
			@Pc(51) int local51 = arg4 + arg1 * anInt806;
			for (@Pc(63) int local63 = -arg3; local63 < 0; local63++) {
				for (@Pc(68) int local68 = -arg0; local68 < 0; local68++) {
					anIntArray201[local51++] = arg2;
				}
				local51 += local45;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("20122, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -60 + ", " + arg3 + ", " + arg4 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TIJYBGAE", name = "a", descriptor = "(IIIIBI)V")
	public static void method551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			method553(arg3, arg0, arg4, arg1);
			method553(arg3 + arg2 - 1, arg0, arg4, arg1);
			method555(arg3, arg2, arg4, arg0);
			method555(arg3, arg2, arg4 + arg1 - 1, arg0);
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("31751, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TIJYBGAE", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			method554(arg0, arg4, arg3, arg1, arg2);
			method554(arg0, arg4, arg3, arg1, arg2 + arg5 - 1);
			if (arg5 >= 3) {
				method556(arg2 + 1, arg3, arg0, arg5 - 2, arg1);
				method556(arg2 + 1, arg3, arg0, arg5 - 2, arg1 + arg4 - 1);
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("1990, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TIJYBGAE", name = "b", descriptor = "(IIIII)V")
	public static void method553(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 >= anInt808 && arg0 < anInt809) {
				if (arg2 < anInt810) {
					arg3 -= anInt810 - arg2;
					arg2 = anInt810;
				}
				if (arg2 + arg3 > anInt811) {
					arg3 = anInt811 - arg2;
				}
				@Pc(40) int local40 = arg2 + arg0 * anInt806;
				for (@Pc(42) int local42 = 0; local42 < arg3; local42++) {
					anIntArray201[local40 + local42] = arg1;
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("57999, " + 9 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TIJYBGAE", name = "a", descriptor = "(IIBIII)V")
	private static void method554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg4 >= anInt808 && arg4 < anInt809) {
				if (arg3 < anInt810) {
					arg1 -= anInt810 - arg3;
					arg3 = anInt810;
				}
				if (arg3 + arg1 > anInt811) {
					arg1 = anInt811 - arg3;
				}
				@Pc(32) int local32 = 256 - arg0;
				@Pc(40) int local40 = (arg2 >> 16 & 0xFF) * arg0;
				@Pc(48) int local48 = (arg2 >> 8 & 0xFF) * arg0;
				@Pc(54) int local54 = (arg2 & 0xFF) * arg0;
				@Pc(70) int local70 = arg3 + arg4 * anInt806;
				for (@Pc(72) int local72 = 0; local72 < arg1; local72++) {
					@Pc(84) int local84 = (anIntArray201[local70] >> 16 & 0xFF) * local32;
					@Pc(94) int local94 = (anIntArray201[local70] >> 8 & 0xFF) * local32;
					@Pc(102) int local102 = (anIntArray201[local70] & 0xFF) * local32;
					@Pc(124) int local124 = (local40 + local84 >> 8 << 16) + (local48 + local94 >> 8 << 8) + (local54 + local102 >> 8);
					anIntArray201[local70++] = local124;
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("70928, " + arg0 + ", " + arg1 + ", " + -39 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TIJYBGAE", name = "c", descriptor = "(IIIII)V")
	public static void method555(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt810 && arg2 < anInt811) {
				if (arg0 < anInt808) {
					arg1 -= anInt808 - arg0;
					arg0 = anInt808;
				}
				if (arg0 + arg1 > anInt809) {
					arg1 = anInt809 - arg0;
				}
				@Pc(35) int local35 = arg2 + arg0 * anInt806;
				for (@Pc(37) int local37 = 0; local37 < arg1; local37++) {
					anIntArray201[local35 + local37 * anInt806] = arg3;
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("90046, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TIJYBGAE", name = "b", descriptor = "(IIIIII)V")
	private static void method556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg4 >= anInt810 && arg4 < anInt811) {
				if (arg0 < anInt808) {
					arg3 -= anInt808 - arg0;
					arg0 = anInt808;
				}
				if (arg0 + arg3 > anInt809) {
					arg3 = anInt809 - arg0;
				}
				@Pc(30) int local30 = 256 - arg2;
				@Pc(38) int local38 = (arg1 >> 16 & 0xFF) * arg2;
				@Pc(46) int local46 = (arg1 >> 8 & 0xFF) * arg2;
				@Pc(52) int local52 = (arg1 & 0xFF) * arg2;
				@Pc(58) int local58 = arg4 + arg0 * anInt806;
				for (@Pc(60) int local60 = 0; local60 < arg3; local60++) {
					@Pc(72) int local72 = (anIntArray201[local58] >> 16 & 0xFF) * local30;
					@Pc(82) int local82 = (anIntArray201[local58] >> 8 & 0xFF) * local30;
					@Pc(90) int local90 = (anIntArray201[local58] & 0xFF) * local30;
					@Pc(112) int local112 = (local38 + local72 >> 8 << 16) + (local46 + local82 >> 8 << 8) + (local52 + local90 >> 8);
					anIntArray201[local58] = local112;
					local58 += anInt806;
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("13854, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 5 + ", " + arg3 + ", " + arg4 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TIJYBGAE", name = "<init>", descriptor = "()V")
	protected Class8_Sub1_Sub2() {
	}
}
