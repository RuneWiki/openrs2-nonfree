import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FBOVVAQK")
public class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!FBOVVAQK", name = "i", descriptor = "Z")
	private static boolean aBoolean186;

	@OriginalMember(owner = "client!FBOVVAQK", name = "m", descriptor = "[I")
	public static int[] anIntArray206;

	@OriginalMember(owner = "client!FBOVVAQK", name = "n", descriptor = "I")
	public static int anInt799;

	@OriginalMember(owner = "client!FBOVVAQK", name = "o", descriptor = "I")
	public static int anInt800;

	@OriginalMember(owner = "client!FBOVVAQK", name = "p", descriptor = "I")
	public static int anInt801;

	@OriginalMember(owner = "client!FBOVVAQK", name = "q", descriptor = "I")
	public static int anInt802;

	@OriginalMember(owner = "client!FBOVVAQK", name = "r", descriptor = "I")
	public static int anInt803;

	@OriginalMember(owner = "client!FBOVVAQK", name = "s", descriptor = "I")
	public static int anInt804;

	@OriginalMember(owner = "client!FBOVVAQK", name = "t", descriptor = "I")
	public static int anInt805;

	@OriginalMember(owner = "client!FBOVVAQK", name = "u", descriptor = "I")
	public static int anInt806;

	@OriginalMember(owner = "client!FBOVVAQK", name = "v", descriptor = "I")
	public static int anInt807;

	@OriginalMember(owner = "client!FBOVVAQK", name = "j", descriptor = "I")
	private static int anInt797 = -13196;

	@OriginalMember(owner = "client!FBOVVAQK", name = "k", descriptor = "I")
	private static int anInt798 = -673;

	@OriginalMember(owner = "client!FBOVVAQK", name = "l", descriptor = "Z")
	private static boolean aBoolean187 = true;

	@OriginalMember(owner = "client!FBOVVAQK", name = "a", descriptor = "([IIII)V")
	public static void method546(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			anIntArray206 = arg0;
			anInt799 = arg1;
			anInt800 = arg2;
			method548(arg1, 0, arg2, 0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("11900, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 334 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FBOVVAQK", name = "a", descriptor = "(Z)V")
	public static void method547() {
		try {
			anInt803 = 0;
			anInt801 = 0;
			anInt804 = anInt799;
			anInt802 = anInt800;
			anInt805 = anInt804 - 1;
			anInt806 = anInt804 / 2;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("13295, " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FBOVVAQK", name = "a", descriptor = "(IIBII)V")
	public static void method548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg0 > anInt799) {
				arg0 = anInt799;
			}
			if (arg2 > anInt800) {
				arg2 = anInt800;
			}
			anInt803 = arg1;
			anInt801 = arg3;
			anInt804 = arg0;
			anInt802 = arg2;
			anInt805 = anInt804 - 1;
			anInt806 = anInt804 / 2;
			anInt807 = anInt802 / 2;
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("6172, " + arg0 + ", " + arg1 + ", " + -87 + ", " + arg2 + ", " + arg3 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FBOVVAQK", name = "b", descriptor = "(Z)V")
	public static void method549(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				@Pc(6) int local6 = anInt799 * anInt800;
				for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
					anIntArray206[local8] = 0;
				}
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("34852, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FBOVVAQK", name = "a", descriptor = "(IIIIZII)V")
	public static void method550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 < anInt803) {
				arg3 -= anInt803 - arg1;
				arg1 = anInt803;
			}
			if (arg0 < anInt801) {
				arg4 -= anInt801 - arg0;
				arg0 = anInt801;
			}
			if (arg1 + arg3 > anInt804) {
				arg3 = anInt804 - arg1;
			}
			if (arg0 + arg4 > anInt802) {
				arg4 = anInt802 - arg0;
			}
			@Pc(45) int local45 = 256 - arg2;
			@Pc(53) int local53 = (arg5 >> 16 & 0xFF) * arg2;
			@Pc(61) int local61 = (arg5 >> 8 & 0xFF) * arg2;
			@Pc(67) int local67 = (arg5 & 0xFF) * arg2;
			@Pc(79) int local79 = anInt799 - arg3;
			@Pc(85) int local85 = arg1 + arg0 * anInt799;
			for (@Pc(87) int local87 = 0; local87 < arg4; local87++) {
				for (@Pc(92) int local92 = -arg3; local92 < 0; local92++) {
					@Pc(104) int local104 = (anIntArray206[local85] >> 16 & 0xFF) * local45;
					@Pc(114) int local114 = (anIntArray206[local85] >> 8 & 0xFF) * local45;
					@Pc(122) int local122 = (anIntArray206[local85] & 0xFF) * local45;
					@Pc(144) int local144 = (local53 + local104 >> 8 << 16) + (local61 + local114 >> 8 << 8) + (local67 + local122 >> 8);
					anIntArray206[local85++] = local144;
				}
				local85 += local79;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("31920, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FBOVVAQK", name = "a", descriptor = "(ZIIIII)V")
	public static void method551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg4 < anInt803) {
				arg1 -= anInt803 - arg4;
				arg4 = anInt803;
			}
			if (arg2 < anInt801) {
				arg0 -= anInt801 - arg2;
				arg2 = anInt801;
			}
			if (arg4 + arg1 > anInt804) {
				arg1 = anInt804 - arg4;
			}
			if (arg2 + arg0 > anInt802) {
				arg0 = anInt802 - arg2;
			}
			@Pc(45) int local45 = anInt799 - arg1;
			@Pc(51) int local51 = arg4 + arg2 * anInt799;
			for (@Pc(54) int local54 = -arg0; local54 < 0; local54++) {
				for (@Pc(59) int local59 = -arg1; local59 < 0; local59++) {
					anIntArray206[local51++] = arg3;
				}
				local51 += local45;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("68998, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FBOVVAQK", name = "a", descriptor = "(IIIIII)V")
	public static void method552(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method554(arg2, arg3, arg1, arg4);
			method554(arg2, arg3, arg1, arg4 + arg0 - 1);
			method556(arg1, arg4, arg3, arg0);
			method556(arg1 + arg2 - 1, arg4, arg3, arg0);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("66085, " + 3 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FBOVVAQK", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			method555(arg0, arg5, arg1, arg3, arg4);
			method555(arg0, arg5, arg1 + arg2 - 1, arg3, arg4);
			if (arg2 >= 3) {
				method557(arg5, arg2 - 2, arg0, arg3, arg1 + 1);
				method557(arg5 + arg4 - 1, arg2 - 2, arg0, arg3, arg1 + 1);
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("57643, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FBOVVAQK", name = "a", descriptor = "(IIIII)V")
	public static void method554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 >= anInt801 && arg3 < anInt802) {
				if (arg2 < anInt803) {
					arg0 -= anInt803 - arg2;
					arg2 = anInt803;
				}
				if (arg2 + arg0 > anInt804) {
					arg0 = anInt804 - arg2;
				}
				@Pc(34) int local34 = arg2 + arg3 * anInt799;
				for (@Pc(42) int local42 = 0; local42 < arg0; local42++) {
					anIntArray206[local34 + local42] = arg1;
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("96603, " + arg0 + ", " + arg1 + ", " + -518 + ", " + arg2 + ", " + arg3 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FBOVVAQK", name = "b", descriptor = "(IIIIII)V")
	private static void method555(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 >= anInt801 && arg2 < anInt802) {
				if (arg1 < anInt803) {
					arg4 -= anInt803 - arg1;
					arg1 = anInt803;
				}
				if (arg1 + arg4 > anInt804) {
					arg4 = anInt804 - arg1;
				}
				@Pc(32) int local32 = 256 - arg0;
				@Pc(40) int local40 = (arg3 >> 16 & 0xFF) * arg0;
				@Pc(48) int local48 = (arg3 >> 8 & 0xFF) * arg0;
				@Pc(54) int local54 = (arg3 & 0xFF) * arg0;
				@Pc(73) int local73 = arg1 + arg2 * anInt799;
				for (@Pc(75) int local75 = 0; local75 < arg4; local75++) {
					@Pc(87) int local87 = (anIntArray206[local73] >> 16 & 0xFF) * local32;
					@Pc(97) int local97 = (anIntArray206[local73] >> 8 & 0xFF) * local32;
					@Pc(105) int local105 = (anIntArray206[local73] & 0xFF) * local32;
					@Pc(127) int local127 = (local40 + local87 >> 8 << 16) + (local48 + local97 >> 8 << 8) + (local54 + local105 >> 8);
					anIntArray206[local73++] = local127;
				}
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("11574, " + arg0 + ", " + 9 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FBOVVAQK", name = "b", descriptor = "(IIIII)V")
	public static void method556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 >= anInt803 && arg0 < anInt804) {
				if (arg1 < anInt801) {
					arg3 -= anInt801 - arg1;
					arg1 = anInt801;
				}
				if (arg1 + arg3 > anInt802) {
					arg3 = anInt802 - arg1;
				}
				@Pc(36) int local36 = arg0 + arg1 * anInt799;
				for (@Pc(38) int local38 = 0; local38 < arg3; local38++) {
					anIntArray206[local36 + local38 * anInt799] = arg2;
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("73859, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FBOVVAQK", name = "a", descriptor = "(IBIIII)V")
	private static void method557(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt803 && arg0 < anInt804) {
				if (arg4 < anInt801) {
					arg1 -= anInt801 - arg4;
					arg4 = anInt801;
				}
				if (arg4 + arg1 > anInt802) {
					arg1 = anInt802 - arg4;
				}
				@Pc(32) int local32 = 256 - arg2;
				@Pc(40) int local40 = (arg3 >> 16 & 0xFF) * arg2;
				@Pc(48) int local48 = (arg3 >> 8 & 0xFF) * arg2;
				@Pc(54) int local54 = (arg3 & 0xFF) * arg2;
				@Pc(60) int local60 = arg0 + arg4 * anInt799;
				for (@Pc(72) int local72 = 0; local72 < arg1; local72++) {
					@Pc(84) int local84 = (anIntArray206[local60] >> 16 & 0xFF) * local32;
					@Pc(94) int local94 = (anIntArray206[local60] >> 8 & 0xFF) * local32;
					@Pc(102) int local102 = (anIntArray206[local60] & 0xFF) * local32;
					@Pc(124) int local124 = (local40 + local84 >> 8 << 16) + (local48 + local94 >> 8 << 8) + (local54 + local102 >> 8);
					anIntArray206[local60] = local124;
					local60 += anInt799;
				}
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("87526, " + arg0 + ", " + -121 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FBOVVAQK", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub1() {
	}
}
