import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VMBJKBNJ")
public class Class6_Sub2_Sub2 extends Class6_Sub2 {

	@OriginalMember(owner = "client!VMBJKBNJ", name = "k", descriptor = "I")
	private static int anInt799;

	@OriginalMember(owner = "client!VMBJKBNJ", name = "n", descriptor = "Z")
	private static boolean aBoolean227;

	@OriginalMember(owner = "client!VMBJKBNJ", name = "p", descriptor = "Z")
	private static boolean aBoolean228;

	@OriginalMember(owner = "client!VMBJKBNJ", name = "q", descriptor = "[I")
	public static int[] anIntArray201;

	@OriginalMember(owner = "client!VMBJKBNJ", name = "r", descriptor = "I")
	public static int anInt802;

	@OriginalMember(owner = "client!VMBJKBNJ", name = "s", descriptor = "I")
	public static int anInt803;

	@OriginalMember(owner = "client!VMBJKBNJ", name = "t", descriptor = "I")
	public static int anInt804;

	@OriginalMember(owner = "client!VMBJKBNJ", name = "u", descriptor = "I")
	public static int anInt805;

	@OriginalMember(owner = "client!VMBJKBNJ", name = "v", descriptor = "I")
	public static int anInt806;

	@OriginalMember(owner = "client!VMBJKBNJ", name = "w", descriptor = "I")
	public static int anInt807;

	@OriginalMember(owner = "client!VMBJKBNJ", name = "x", descriptor = "I")
	public static int anInt808;

	@OriginalMember(owner = "client!VMBJKBNJ", name = "y", descriptor = "I")
	public static int anInt809;

	@OriginalMember(owner = "client!VMBJKBNJ", name = "z", descriptor = "I")
	public static int anInt810;

	@OriginalMember(owner = "client!VMBJKBNJ", name = "j", descriptor = "Z")
	private static boolean aBoolean226 = true;

	@OriginalMember(owner = "client!VMBJKBNJ", name = "l", descriptor = "I")
	private static int anInt800 = 12021;

	@OriginalMember(owner = "client!VMBJKBNJ", name = "m", descriptor = "B")
	private static byte aByte39 = -68;

	@OriginalMember(owner = "client!VMBJKBNJ", name = "o", descriptor = "I")
	private static int anInt801 = -39100;

	@OriginalMember(owner = "client!VMBJKBNJ", name = "a", descriptor = "(III[I)V")
	public static void method547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			anIntArray201 = arg2;
			anInt802 = arg1;
			anInt803 = arg0;
			method549(0, arg1, 0, arg0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("25539, " + arg0 + ", " + arg1 + ", " + -47390 + ", " + arg2 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VMBJKBNJ", name = "a", descriptor = "(B)V")
	public static void method548() {
		try {
			anInt806 = 0;
			anInt804 = 0;
			anInt807 = anInt802;
			anInt805 = anInt803;
			anInt808 = anInt807 - 1;
			anInt809 = anInt807 / 2;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("8742, " + -87 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VMBJKBNJ", name = "a", descriptor = "(IIIII)V")
	public static void method549(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg1 > anInt802) {
				arg1 = anInt802;
			}
			if (arg3 > anInt803) {
				arg3 = anInt803;
			}
			anInt806 = arg2;
			anInt804 = arg0;
			anInt807 = arg1;
			anInt805 = arg3;
			anInt808 = anInt807 - 1;
			anInt809 = anInt807 / 2;
			anInt810 = anInt805 / 2;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("51004, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VMBJKBNJ", name = "a", descriptor = "(I)V")
	public static void method550() {
		try {
			@Pc(3) int local3 = anInt802 * anInt803;
			for (@Pc(14) int local14 = 0; local14 < local3; local14++) {
				anIntArray201[local14] = 0;
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("79613, " + 2 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VMBJKBNJ", name = "a", descriptor = "(IIIIIZI)V")
	public static void method551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 < anInt806) {
				arg5 -= anInt806 - arg3;
				arg3 = anInt806;
			}
			if (arg0 < anInt804) {
				arg2 -= anInt804 - arg0;
				arg0 = anInt804;
			}
			if (arg3 + arg5 > anInt807) {
				arg5 = anInt807 - arg3;
			}
			if (arg0 + arg2 > anInt805) {
				arg2 = anInt805 - arg0;
			}
			@Pc(45) int local45 = 256 - arg1;
			@Pc(53) int local53 = (arg4 >> 16 & 0xFF) * arg1;
			@Pc(61) int local61 = (arg4 >> 8 & 0xFF) * arg1;
			@Pc(67) int local67 = (arg4 & 0xFF) * arg1;
			@Pc(75) int local75 = anInt802 - arg5;
			@Pc(81) int local81 = arg3 + arg0 * anInt802;
			for (@Pc(83) int local83 = 0; local83 < arg2; local83++) {
				for (@Pc(88) int local88 = -arg5; local88 < 0; local88++) {
					@Pc(100) int local100 = (anIntArray201[local81] >> 16 & 0xFF) * local45;
					@Pc(110) int local110 = (anIntArray201[local81] >> 8 & 0xFF) * local45;
					@Pc(118) int local118 = (anIntArray201[local81] & 0xFF) * local45;
					@Pc(140) int local140 = (local53 + local100 >> 8 << 16) + (local61 + local110 >> 8 << 8) + (local67 + local118 >> 8);
					anIntArray201[local81++] = local140;
				}
				local81 += local75;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("62447, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VMBJKBNJ", name = "a", descriptor = "(IIIIII)V")
	public static void method552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1 < anInt806) {
				arg0 -= anInt806 - arg1;
				arg1 = anInt806;
			}
			if (arg3 < anInt804) {
				arg2 -= anInt804 - arg3;
				arg3 = anInt804;
			}
			if (arg1 + arg0 > anInt807) {
				arg0 = anInt807 - arg1;
			}
			if (arg3 + arg2 > anInt805) {
				arg2 = anInt805 - arg3;
			}
			@Pc(45) int local45 = anInt802 - arg0;
			@Pc(51) int local51 = arg1 + arg3 * anInt802;
			for (@Pc(62) int local62 = -arg2; local62 < 0; local62++) {
				for (@Pc(67) int local67 = -arg0; local67 < 0; local67++) {
					anIntArray201[local51++] = arg4;
				}
				local51 += local45;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("47976, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 3 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VMBJKBNJ", name = "b", descriptor = "(IIIIII)V")
	public static void method553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			method555(arg2, arg4, arg0, arg1);
			method555(arg2, arg4 + arg3 - 1, arg0, arg1);
			method557(arg0, arg4, arg2, arg3);
			method557(arg0 + arg1 - 1, arg4, arg2, arg3);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("80770, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VMBJKBNJ", name = "a", descriptor = "(IIIIIII)V")
	public static void method554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			method556(arg2, arg1, arg4, arg0, arg5);
			method556(arg2 + arg6 - 1, arg1, arg4, arg0, arg5);
			if (arg3 != 4) {
				aBoolean227 = !aBoolean227;
			}
			if (arg6 >= 3) {
				method558(arg2 + 1, arg4, arg6 - 2, arg5, arg0);
				method558(arg2 + 1, arg4 + arg1 - 1, arg6 - 2, arg5, arg0);
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("70568, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VMBJKBNJ", name = "b", descriptor = "(IIIII)V")
	public static void method555(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 >= anInt804 && arg1 < anInt805) {
				if (arg2 < anInt806) {
					arg3 -= anInt806 - arg2;
					arg2 = anInt806;
				}
				if (arg2 + arg3 > anInt807) {
					arg3 = anInt807 - arg2;
				}
				@Pc(32) int local32 = arg2 + arg1 * anInt802;
				for (@Pc(42) int local42 = 0; local42 < arg3; local42++) {
					anIntArray201[local32 + local42] = arg0;
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("27801, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VMBJKBNJ", name = "c", descriptor = "(IIIIII)V")
	private static void method556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt804 && arg0 < anInt805) {
				if (arg2 < anInt806) {
					arg1 -= anInt806 - arg2;
					arg2 = anInt806;
				}
				if (arg2 + arg1 > anInt807) {
					arg1 = anInt807 - arg2;
				}
				@Pc(30) int local30 = 256 - arg3;
				@Pc(38) int local38 = (arg4 >> 16 & 0xFF) * arg3;
				@Pc(46) int local46 = (arg4 >> 8 & 0xFF) * arg3;
				@Pc(52) int local52 = (arg4 & 0xFF) * arg3;
				@Pc(58) int local58 = arg2 + arg0 * anInt802;
				for (@Pc(64) int local64 = 0; local64 < arg1; local64++) {
					@Pc(76) int local76 = (anIntArray201[local58] >> 16 & 0xFF) * local30;
					@Pc(86) int local86 = (anIntArray201[local58] >> 8 & 0xFF) * local30;
					@Pc(94) int local94 = (anIntArray201[local58] & 0xFF) * local30;
					@Pc(116) int local116 = (local38 + local76 >> 8 << 16) + (local46 + local86 >> 8 << 8) + (local52 + local94 >> 8);
					anIntArray201[local58++] = local116;
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("87085, " + arg0 + ", " + arg1 + ", " + 1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VMBJKBNJ", name = "c", descriptor = "(IIIII)V")
	public static void method557(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 >= anInt806 && arg0 < anInt807) {
				if (arg1 < anInt804) {
					arg3 -= anInt804 - arg1;
					arg1 = anInt804;
				}
				if (arg1 + arg3 > anInt805) {
					arg3 = anInt805 - arg1;
				}
				@Pc(32) int local32 = arg0 + arg1 * anInt802;
				if (anInt800 == 12021) {
					for (@Pc(38) int local38 = 0; local38 < arg3; local38++) {
						anIntArray201[local32 + local38 * anInt802] = arg2;
					}
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("77345, " + arg0 + ", " + 12021 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VMBJKBNJ", name = "a", descriptor = "(IIBIII)V")
	private static void method558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 >= anInt806 && arg1 < anInt807) {
				if (arg0 < anInt804) {
					arg2 -= anInt804 - arg0;
					arg0 = anInt804;
				}
				if (arg0 + arg2 > anInt805) {
					arg2 = anInt805 - arg0;
				}
				@Pc(34) int local34 = 256 - arg4;
				@Pc(42) int local42 = (arg3 >> 16 & 0xFF) * arg4;
				@Pc(50) int local50 = (arg3 >> 8 & 0xFF) * arg4;
				@Pc(56) int local56 = (arg3 & 0xFF) * arg4;
				@Pc(62) int local62 = arg1 + arg0 * anInt802;
				for (@Pc(64) int local64 = 0; local64 < arg2; local64++) {
					@Pc(76) int local76 = (anIntArray201[local62] >> 16 & 0xFF) * local34;
					@Pc(86) int local86 = (anIntArray201[local62] >> 8 & 0xFF) * local34;
					@Pc(94) int local94 = (anIntArray201[local62] & 0xFF) * local34;
					@Pc(116) int local116 = (local42 + local76 >> 8 << 16) + (local50 + local86 >> 8 << 8) + (local56 + local94 >> 8);
					anIntArray201[local62] = local116;
					local62 += anInt802;
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("7522, " + arg0 + ", " + arg1 + ", " + -29 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VMBJKBNJ", name = "<init>", descriptor = "()V")
	protected Class6_Sub2_Sub2() {
	}
}
