import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CBERHIHM")
public class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!CBERHIHM", name = "l", descriptor = "Z")
	private static boolean aBoolean202;

	@OriginalMember(owner = "client!CBERHIHM", name = "n", descriptor = "I")
	private static int anInt781;

	@OriginalMember(owner = "client!CBERHIHM", name = "o", descriptor = "[I")
	public static int[] anIntArray201;

	@OriginalMember(owner = "client!CBERHIHM", name = "p", descriptor = "I")
	public static int anInt782;

	@OriginalMember(owner = "client!CBERHIHM", name = "q", descriptor = "I")
	public static int anInt783;

	@OriginalMember(owner = "client!CBERHIHM", name = "r", descriptor = "I")
	public static int anInt784;

	@OriginalMember(owner = "client!CBERHIHM", name = "s", descriptor = "I")
	public static int anInt785;

	@OriginalMember(owner = "client!CBERHIHM", name = "t", descriptor = "I")
	public static int anInt786;

	@OriginalMember(owner = "client!CBERHIHM", name = "u", descriptor = "I")
	public static int anInt787;

	@OriginalMember(owner = "client!CBERHIHM", name = "v", descriptor = "I")
	public static int anInt788;

	@OriginalMember(owner = "client!CBERHIHM", name = "w", descriptor = "I")
	public static int anInt789;

	@OriginalMember(owner = "client!CBERHIHM", name = "x", descriptor = "I")
	public static int anInt790;

	@OriginalMember(owner = "client!CBERHIHM", name = "i", descriptor = "Z")
	private static boolean aBoolean201 = true;

	@OriginalMember(owner = "client!CBERHIHM", name = "j", descriptor = "I")
	private static int anInt780 = -866;

	@OriginalMember(owner = "client!CBERHIHM", name = "k", descriptor = "B")
	private static byte aByte33 = -2;

	@OriginalMember(owner = "client!CBERHIHM", name = "m", descriptor = "Z")
	private static boolean aBoolean203 = true;

	@OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(B[III)V")
	public static void method543(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			anIntArray201 = arg0;
			anInt782 = arg2;
			anInt783 = arg1;
			method545(arg1, 0, 0, arg2);
			if (aByte33 == -2) {
				;
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("274, " + -2 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(Z)V")
	public static void method544(@OriginalArg(0) boolean arg0) {
		try {
			anInt786 = 0;
			anInt784 = 0;
			if (!arg0) {
				anInt787 = anInt782;
				anInt785 = anInt783;
				anInt788 = anInt787 - 1;
				anInt789 = anInt787 / 2;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("72620, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(IIIIZ)V")
	public static void method545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg3 > anInt782) {
				arg3 = anInt782;
			}
			if (arg0 > anInt783) {
				arg0 = anInt783;
			}
			anInt786 = arg2;
			anInt784 = arg1;
			anInt787 = arg3;
			anInt785 = arg0;
			anInt788 = anInt787 - 1;
			anInt789 = anInt787 / 2;
			anInt790 = anInt785 / 2;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("51793, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(B)V")
	public static void method546() {
		try {
			@Pc(8) int local8 = anInt782 * anInt783;
			for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
				anIntArray201[local10] = 0;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("84358, " + 4 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(IIIIIII)V")
	public static void method547(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 < anInt786) {
				arg1 -= anInt786 - arg0;
				arg0 = anInt786;
			}
			if (arg5 < anInt784) {
				arg2 -= anInt784 - arg5;
				arg5 = anInt784;
			}
			if (arg0 + arg1 > anInt787) {
				arg1 = anInt787 - arg0;
			}
			if (arg5 + arg2 > anInt785) {
				arg2 = anInt785 - arg5;
			}
			@Pc(45) int local45 = 256 - arg4;
			@Pc(53) int local53 = (arg3 >> 16 & 0xFF) * arg4;
			@Pc(61) int local61 = (arg3 >> 8 & 0xFF) * arg4;
			@Pc(67) int local67 = (arg3 & 0xFF) * arg4;
			@Pc(71) int local71 = anInt782 - arg1;
			@Pc(77) int local77 = arg0 + arg5 * anInt782;
			for (@Pc(79) int local79 = 0; local79 < arg2; local79++) {
				for (@Pc(84) int local84 = -arg1; local84 < 0; local84++) {
					@Pc(96) int local96 = (anIntArray201[local77] >> 16 & 0xFF) * local45;
					@Pc(106) int local106 = (anIntArray201[local77] >> 8 & 0xFF) * local45;
					@Pc(114) int local114 = (anIntArray201[local77] & 0xFF) * local45;
					@Pc(136) int local136 = (local53 + local96 >> 8 << 16) + (local61 + local106 >> 8 << 8) + (local67 + local114 >> 8);
					anIntArray201[local77++] = local136;
				}
				local77 += local71;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("19361, " + 20 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(IIIIII)V")
	public static void method548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg4 == 5948) {
				if (arg0 < anInt786) {
					arg5 -= anInt786 - arg0;
					arg0 = anInt786;
				}
				if (arg2 < anInt784) {
					arg3 -= anInt784 - arg2;
					arg2 = anInt784;
				}
				if (arg0 + arg5 > anInt787) {
					arg5 = anInt787 - arg0;
				}
				if (arg2 + arg3 > anInt785) {
					arg3 = anInt785 - arg2;
				}
				@Pc(49) int local49 = anInt782 - arg5;
				@Pc(55) int local55 = arg0 + arg2 * anInt782;
				for (@Pc(58) int local58 = -arg3; local58 < 0; local58++) {
					for (@Pc(63) int local63 = -arg5; local63 < 0; local63++) {
						anIntArray201[local55++] = arg1;
					}
					local55 += local49;
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("53204, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(IIIIIZ)V")
	public static void method549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			method551(arg4, arg3, arg2, arg0);
			method551(arg4 + arg1 - 1, arg3, arg2, arg0);
			method553(arg1, aBoolean202, arg2, arg4, arg3);
			method553(arg1, aBoolean202, arg2, arg4, arg3 + arg0 - 1);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("21167, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CBERHIHM", name = "b", descriptor = "(IIIIIII)V")
	public static void method550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg5 != 12912) {
				aBoolean201 = !aBoolean201;
			}
			method552(arg6, arg1, arg4, arg3, arg0);
			method552(arg6, arg1, arg4 + arg2 - 1, arg3, arg0);
			if (arg2 >= 3) {
				method554(arg0, arg6, arg2 - 2, arg4 + 1, arg3);
				method554(arg0 + arg1 - 1, arg6, arg2 - 2, arg4 + 1, arg3);
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("94621, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(IIIII)V")
	public static void method551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 >= anInt784 && arg0 < anInt785) {
				if (arg1 < anInt786) {
					arg3 -= anInt786 - arg1;
					arg1 = anInt786;
				}
				if (arg1 + arg3 > anInt787) {
					arg3 = anInt787 - arg1;
				}
				@Pc(32) int local32 = arg1 + arg0 * anInt782;
				for (@Pc(42) int local42 = 0; local42 < arg3; local42++) {
					anIntArray201[local32 + local42] = arg2;
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("34457, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(IIBIII)V")
	private static void method552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 >= anInt784 && arg2 < anInt785) {
				if (arg4 < anInt786) {
					arg1 -= anInt786 - arg4;
					arg4 = anInt786;
				}
				if (arg4 + arg1 > anInt787) {
					arg1 = anInt787 - arg4;
				}
				@Pc(30) int local30 = 256 - arg3;
				@Pc(38) int local38 = (arg0 >> 16 & 0xFF) * arg3;
				@Pc(46) int local46 = (arg0 >> 8 & 0xFF) * arg3;
				@Pc(52) int local52 = (arg0 & 0xFF) * arg3;
				@Pc(58) int local58 = arg4 + arg2 * anInt782;
				for (@Pc(69) int local69 = 0; local69 < arg1; local69++) {
					@Pc(81) int local81 = (anIntArray201[local58] >> 16 & 0xFF) * local30;
					@Pc(91) int local91 = (anIntArray201[local58] >> 8 & 0xFF) * local30;
					@Pc(99) int local99 = (anIntArray201[local58] & 0xFF) * local30;
					@Pc(121) int local121 = (local38 + local81 >> 8 << 16) + (local46 + local91 >> 8 << 8) + (local52 + local99 >> 8);
					anIntArray201[local58++] = local121;
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("42425, " + arg0 + ", " + arg1 + ", " + -70 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(IZIII)V")
	public static void method553(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(5) int local5;
			if (arg1) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			if (arg4 >= anInt786 && arg4 < anInt787) {
				if (arg3 < anInt784) {
					arg0 -= anInt784 - arg3;
					arg3 = anInt784;
				}
				if (arg3 + arg0 > anInt785) {
					arg0 = anInt785 - arg3;
				}
				local5 = arg4 + arg3 * anInt782;
				for (@Pc(45) int local45 = 0; local45 < arg0; local45++) {
					anIntArray201[local5 + local45 * anInt782] = arg2;
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("98826, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CBERHIHM", name = "a", descriptor = "(BIIIII)V")
	private static void method554(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt786 && arg0 < anInt787) {
				if (arg3 < anInt784) {
					arg2 -= anInt784 - arg3;
					arg3 = anInt784;
				}
				if (arg3 + arg2 > anInt785) {
					arg2 = anInt785 - arg3;
				}
				@Pc(30) int local30 = 256 - arg4;
				@Pc(38) int local38 = (arg1 >> 16 & 0xFF) * arg4;
				@Pc(46) int local46 = (arg1 >> 8 & 0xFF) * arg4;
				@Pc(52) int local52 = (arg1 & 0xFF) * arg4;
				@Pc(67) int local67 = arg0 + arg3 * anInt782;
				for (@Pc(69) int local69 = 0; local69 < arg2; local69++) {
					@Pc(81) int local81 = (anIntArray201[local67] >> 16 & 0xFF) * local30;
					@Pc(91) int local91 = (anIntArray201[local67] >> 8 & 0xFF) * local30;
					@Pc(99) int local99 = (anIntArray201[local67] & 0xFF) * local30;
					@Pc(121) int local121 = (local38 + local81 >> 8 << 16) + (local46 + local91 >> 8 << 8) + (local52 + local99 >> 8);
					anIntArray201[local67] = local121;
					local67 += anInt782;
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("57713, " + 85 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CBERHIHM", name = "<init>", descriptor = "()V")
	protected Class4_Sub1_Sub1() {
	}
}
