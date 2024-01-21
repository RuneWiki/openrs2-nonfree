import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GBJWVQAY")
public class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!GBJWVQAY", name = "j", descriptor = "Z")
	private static boolean aBoolean169;

	@OriginalMember(owner = "client!GBJWVQAY", name = "m", descriptor = "[I")
	public static int[] anIntArray204;

	@OriginalMember(owner = "client!GBJWVQAY", name = "n", descriptor = "I")
	public static int anInt783;

	@OriginalMember(owner = "client!GBJWVQAY", name = "o", descriptor = "I")
	public static int anInt784;

	@OriginalMember(owner = "client!GBJWVQAY", name = "p", descriptor = "I")
	public static int anInt785;

	@OriginalMember(owner = "client!GBJWVQAY", name = "q", descriptor = "I")
	public static int anInt786;

	@OriginalMember(owner = "client!GBJWVQAY", name = "r", descriptor = "I")
	public static int anInt787;

	@OriginalMember(owner = "client!GBJWVQAY", name = "s", descriptor = "I")
	public static int anInt788;

	@OriginalMember(owner = "client!GBJWVQAY", name = "t", descriptor = "I")
	public static int anInt789;

	@OriginalMember(owner = "client!GBJWVQAY", name = "u", descriptor = "I")
	public static int anInt790;

	@OriginalMember(owner = "client!GBJWVQAY", name = "v", descriptor = "I")
	public static int anInt791;

	@OriginalMember(owner = "client!GBJWVQAY", name = "h", descriptor = "B")
	private static byte aByte27 = 21;

	@OriginalMember(owner = "client!GBJWVQAY", name = "i", descriptor = "I")
	private static int anInt781 = -135;

	@OriginalMember(owner = "client!GBJWVQAY", name = "l", descriptor = "I")
	private static int anInt782 = 3148;

	@OriginalMember(owner = "client!GBJWVQAY", name = "a", descriptor = "(III[I)V")
	public static void method545(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			anIntArray204 = arg2;
			anInt783 = arg1;
			anInt784 = arg0;
			method547(0, 0, arg1, arg0);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("38798, " + arg0 + ", " + arg1 + ", " + -357 + ", " + arg2 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GBJWVQAY", name = "a", descriptor = "(I)V")
	public static void method546() {
		try {
			anInt787 = 0;
			anInt785 = 0;
			anInt788 = anInt783;
			anInt786 = anInt784;
			anInt789 = anInt788 - 1;
			anInt790 = anInt788 / 2;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("95982, " + 632 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GBJWVQAY", name = "a", descriptor = "(IIBII)V")
	public static void method547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg2 > anInt783) {
				arg2 = anInt783;
			}
			if (arg3 > anInt784) {
				arg3 = anInt784;
			}
			anInt787 = arg1;
			anInt785 = arg0;
			anInt788 = arg2;
			anInt786 = arg3;
			anInt789 = anInt788 - 1;
			anInt790 = anInt788 / 2;
			if (aByte27 != 21) {
				for (@Pc(38) int local38 = 1; local38 > 0; local38++) {
				}
			}
			anInt791 = anInt786 / 2;
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("81908, " + arg0 + ", " + arg1 + ", " + 21 + ", " + arg2 + ", " + arg3 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GBJWVQAY", name = "a", descriptor = "(Z)V")
	public static void method548() {
		try {
			@Pc(3) int local3 = anInt783 * anInt784;
			for (@Pc(8) int local8 = 0; local8 < local3; local8++) {
				anIntArray204[local8] = 0;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("47616, " + true + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GBJWVQAY", name = "a", descriptor = "(IIIIIII)V")
	public static void method549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 < anInt787) {
				arg2 -= anInt787 - arg1;
				arg1 = anInt787;
			}
			if (arg4 < anInt785) {
				arg3 -= anInt785 - arg4;
				arg4 = anInt785;
			}
			if (arg1 + arg2 > anInt788) {
				arg2 = anInt788 - arg1;
			}
			if (arg4 + arg3 > anInt786) {
				arg3 = anInt786 - arg4;
			}
			@Pc(45) int local45 = 256 - arg0;
			@Pc(53) int local53 = (arg5 >> 16 & 0xFF) * arg0;
			@Pc(61) int local61 = (arg5 >> 8 & 0xFF) * arg0;
			@Pc(67) int local67 = (arg5 & 0xFF) * arg0;
			@Pc(71) int local71 = anInt783 - arg2;
			@Pc(77) int local77 = arg1 + arg4 * anInt783;
			for (@Pc(89) int local89 = 0; local89 < arg3; local89++) {
				for (@Pc(94) int local94 = -arg2; local94 < 0; local94++) {
					@Pc(106) int local106 = (anIntArray204[local77] >> 16 & 0xFF) * local45;
					@Pc(116) int local116 = (anIntArray204[local77] >> 8 & 0xFF) * local45;
					@Pc(124) int local124 = (anIntArray204[local77] & 0xFF) * local45;
					@Pc(146) int local146 = (local53 + local106 >> 8 << 16) + (local61 + local116 >> 8 << 8) + (local67 + local124 >> 8);
					anIntArray204[local77++] = local146;
				}
				local77 += local71;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("69767, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -852 + ", " + arg4 + ", " + arg5 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GBJWVQAY", name = "a", descriptor = "(IIIIII)V")
	public static void method550(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 < anInt787) {
				arg0 -= anInt787 - arg1;
				arg1 = anInt787;
			}
			if (arg3 < anInt785) {
				arg4 -= anInt785 - arg3;
				arg3 = anInt785;
			}
			if (arg1 + arg0 > anInt788) {
				arg0 = anInt788 - arg1;
			}
			if (arg3 + arg4 > anInt786) {
				arg4 = anInt786 - arg3;
			}
			@Pc(45) int local45 = anInt783 - arg0;
			@Pc(51) int local51 = arg1 + arg3 * anInt783;
			for (@Pc(59) int local59 = -arg4; local59 < 0; local59++) {
				for (@Pc(64) int local64 = -arg0; local64 < 0; local64++) {
					anIntArray204[local51++] = arg2;
				}
				local51 += local45;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("3260, " + arg0 + ", " + 2 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GBJWVQAY", name = "b", descriptor = "(IIIIII)V")
	public static void method551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method553(arg3, arg2, arg4, arg1);
			method553(arg3, arg2, arg4 + arg0 - 1, arg1);
			method555(arg0, arg4, arg2, arg1);
			method555(arg0, arg4, arg2 + arg3 - 1, arg1);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("90415, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GBJWVQAY", name = "b", descriptor = "(IIIIIII)V")
	public static void method552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			method554(arg6, arg2, arg0, arg1, arg3);
			@Pc(10) boolean local10 = false;
			method554(arg6, arg2, arg0, arg1 + arg4 - 1, arg3);
			if (arg4 >= 3) {
				method556(arg4 - 2, arg0, arg2, arg1 + 1, arg6);
				method556(arg4 - 2, arg0, arg2 + arg3 - 1, arg1 + 1, arg6);
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("38349, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GBJWVQAY", name = "a", descriptor = "(IIIII)V")
	public static void method553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt785 && arg2 < anInt786) {
				if (arg1 < anInt787) {
					arg0 -= anInt787 - arg1;
					arg1 = anInt787;
				}
				if (arg1 + arg0 > anInt788) {
					arg0 = anInt788 - arg1;
				}
				@Pc(32) int local32 = arg1 + arg2 * anInt783;
				for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
					anIntArray204[local32 + local37] = arg3;
				}
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("62159, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GBJWVQAY", name = "a", descriptor = "(IIIIIZ)V")
	private static void method554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3 >= anInt785 && arg3 < anInt786) {
				if (arg1 < anInt787) {
					arg4 -= anInt787 - arg1;
					arg1 = anInt787;
				}
				if (arg1 + arg4 > anInt788) {
					arg4 = anInt788 - arg1;
				}
				@Pc(30) int local30 = 256 - arg0;
				@Pc(38) int local38 = (arg2 >> 16 & 0xFF) * arg0;
				@Pc(46) int local46 = (arg2 >> 8 & 0xFF) * arg0;
				@Pc(52) int local52 = (arg2 & 0xFF) * arg0;
				@Pc(62) int local62 = arg1 + arg3 * anInt783;
				for (@Pc(64) int local64 = 0; local64 < arg4; local64++) {
					@Pc(76) int local76 = (anIntArray204[local62] >> 16 & 0xFF) * local30;
					@Pc(86) int local86 = (anIntArray204[local62] >> 8 & 0xFF) * local30;
					@Pc(94) int local94 = (anIntArray204[local62] & 0xFF) * local30;
					@Pc(116) int local116 = (local38 + local76 >> 8 << 16) + (local46 + local86 >> 8 << 8) + (local52 + local94 >> 8);
					anIntArray204[local62++] = local116;
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("38546, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GBJWVQAY", name = "a", descriptor = "(IIIIB)V")
	public static void method555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 >= anInt787 && arg2 < anInt788) {
				if (arg1 < anInt785) {
					arg0 -= anInt785 - arg1;
					arg1 = anInt785;
				}
				if (arg1 + arg0 > anInt786) {
					arg0 = anInt786 - arg1;
				}
				@Pc(32) int local32 = arg2 + arg1 * anInt783;
				for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
					anIntArray204[local32 + local38 * anInt783] = arg3;
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("38986, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 105 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GBJWVQAY", name = "c", descriptor = "(IIIIII)V")
	private static void method556(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 >= anInt787 && arg2 < anInt788) {
				if (arg3 < anInt785) {
					arg0 -= anInt785 - arg3;
					arg3 = anInt785;
				}
				if (arg3 + arg0 > anInt786) {
					arg0 = anInt786 - arg3;
				}
				@Pc(30) int local30 = 256 - arg4;
				@Pc(46) int local46 = (arg1 >> 16 & 0xFF) * arg4;
				@Pc(54) int local54 = (arg1 >> 8 & 0xFF) * arg4;
				@Pc(60) int local60 = (arg1 & 0xFF) * arg4;
				@Pc(66) int local66 = arg2 + arg3 * anInt783;
				for (@Pc(68) int local68 = 0; local68 < arg0; local68++) {
					@Pc(80) int local80 = (anIntArray204[local66] >> 16 & 0xFF) * local30;
					@Pc(90) int local90 = (anIntArray204[local66] >> 8 & 0xFF) * local30;
					@Pc(98) int local98 = (anIntArray204[local66] & 0xFF) * local30;
					@Pc(120) int local120 = (local46 + local80 >> 8 << 16) + (local54 + local90 >> 8 << 8) + (local60 + local98 >> 8);
					anIntArray204[local66] = local120;
					local66 += anInt783;
				}
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("56117, " + arg0 + ", " + 278 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GBJWVQAY", name = "<init>", descriptor = "()V")
	protected Class2_Sub1_Sub2() {
	}
}
