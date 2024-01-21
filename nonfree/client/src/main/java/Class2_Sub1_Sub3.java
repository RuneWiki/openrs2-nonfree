import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IBBQNXJX")
public class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!IBBQNXJX", name = "i", descriptor = "Z")
	private static boolean aBoolean119;

	@OriginalMember(owner = "client!IBBQNXJX", name = "o", descriptor = "[I")
	public static int[] anIntArray104;

	@OriginalMember(owner = "client!IBBQNXJX", name = "p", descriptor = "I")
	public static int anInt463;

	@OriginalMember(owner = "client!IBBQNXJX", name = "q", descriptor = "I")
	public static int anInt464;

	@OriginalMember(owner = "client!IBBQNXJX", name = "r", descriptor = "I")
	public static int anInt465;

	@OriginalMember(owner = "client!IBBQNXJX", name = "s", descriptor = "I")
	public static int anInt466;

	@OriginalMember(owner = "client!IBBQNXJX", name = "t", descriptor = "I")
	public static int anInt467;

	@OriginalMember(owner = "client!IBBQNXJX", name = "u", descriptor = "I")
	public static int anInt468;

	@OriginalMember(owner = "client!IBBQNXJX", name = "v", descriptor = "I")
	public static int anInt469;

	@OriginalMember(owner = "client!IBBQNXJX", name = "w", descriptor = "I")
	public static int anInt470;

	@OriginalMember(owner = "client!IBBQNXJX", name = "x", descriptor = "I")
	public static int anInt471;

	@OriginalMember(owner = "client!IBBQNXJX", name = "j", descriptor = "I")
	private static int anInt458 = 37470;

	@OriginalMember(owner = "client!IBBQNXJX", name = "k", descriptor = "I")
	private static int anInt459 = -76;

	@OriginalMember(owner = "client!IBBQNXJX", name = "l", descriptor = "I")
	private static int anInt460 = 252;

	@OriginalMember(owner = "client!IBBQNXJX", name = "m", descriptor = "I")
	private static int anInt461 = 506;

	@OriginalMember(owner = "client!IBBQNXJX", name = "n", descriptor = "I")
	private static int anInt462 = -340;

	@OriginalMember(owner = "client!IBBQNXJX", name = "a", descriptor = "([IIII)V")
	public static void method352(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			anIntArray104 = arg0;
			anInt463 = arg1;
			anInt464 = arg2;
			method354(0, 0, arg1, arg2);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("90344, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -262 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBBQNXJX", name = "a", descriptor = "(I)V")
	public static void method353() {
		try {
			anInt467 = 0;
			anInt465 = 0;
			anInt468 = anInt463;
			anInt466 = anInt464;
			anInt469 = anInt468 - 1;
			anInt470 = anInt468 / 2;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("86416, " + 132 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBBQNXJX", name = "a", descriptor = "(IIIII)V")
	public static void method354(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg2 > anInt463) {
				arg2 = anInt463;
			}
			if (arg3 > anInt464) {
				arg3 = anInt464;
			}
			anInt467 = arg1;
			anInt465 = arg0;
			anInt468 = arg2;
			anInt466 = arg3;
			anInt469 = anInt468 - 1;
			anInt470 = anInt468 / 2;
			anInt471 = anInt466 / 2;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("58502, " + -76 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBBQNXJX", name = "b", descriptor = "(I)V")
	public static void method355() {
		try {
			@Pc(5) int local5 = anInt463 * anInt464;
			for (@Pc(16) int local16 = 0; local16 < local5; local16++) {
				anIntArray104[local16] = 0;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("3245, " + 662 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBBQNXJX", name = "a", descriptor = "(IIIIIII)V")
	public static void method356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg6 < anInt467) {
				arg1 -= anInt467 - arg6;
				arg6 = anInt467;
			}
			if (arg4 < anInt465) {
				arg3 -= anInt465 - arg4;
				arg4 = anInt465;
			}
			if (arg6 + arg1 > anInt468) {
				arg1 = anInt468 - arg6;
			}
			if (arg4 + arg3 > anInt466) {
				arg3 = anInt466 - arg4;
			}
			@Pc(45) int local45 = 256 - arg2;
			@Pc(53) int local53 = (arg0 >> 16 & 0xFF) * arg2;
			@Pc(61) int local61 = (arg0 >> 8 & 0xFF) * arg2;
			@Pc(67) int local67 = (arg0 & 0xFF) * arg2;
			@Pc(71) boolean local71 = false;
			@Pc(75) int local75 = anInt463 - arg1;
			@Pc(81) int local81 = arg6 + arg4 * anInt463;
			for (@Pc(83) int local83 = 0; local83 < arg3; local83++) {
				for (@Pc(88) int local88 = -arg1; local88 < 0; local88++) {
					@Pc(100) int local100 = (anIntArray104[local81] >> 16 & 0xFF) * local45;
					@Pc(110) int local110 = (anIntArray104[local81] >> 8 & 0xFF) * local45;
					@Pc(118) int local118 = (anIntArray104[local81] & 0xFF) * local45;
					@Pc(140) int local140 = (local53 + local100 >> 8 << 16) + (local61 + local110 >> 8 << 8) + (local67 + local118 >> 8);
					anIntArray104[local81++] = local140;
				}
				local81 += local75;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("55261, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBBQNXJX", name = "a", descriptor = "(IIIIIB)V")
	public static void method357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg0 < anInt467) {
				arg1 -= anInt467 - arg0;
				arg0 = anInt467;
			}
			if (arg2 < anInt465) {
				arg4 -= anInt465 - arg2;
				arg2 = anInt465;
			}
			if (arg0 + arg1 > anInt468) {
				arg1 = anInt468 - arg0;
			}
			if (arg2 + arg4 > anInt466) {
				arg4 = anInt466 - arg2;
			}
			@Pc(45) int local45 = anInt463 - arg1;
			@Pc(61) int local61 = arg0 + arg2 * anInt463;
			for (@Pc(64) int local64 = -arg4; local64 < 0; local64++) {
				for (@Pc(69) int local69 = -arg1; local69 < 0; local69++) {
					anIntArray104[local61++] = arg3;
				}
				local61 += local45;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("68114, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 127 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBBQNXJX", name = "a", descriptor = "(IIIIII)V")
	public static void method358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			method360(arg3, arg0, arg1, arg4, (byte) 3);
			method360(arg3, arg0, arg1 + arg2 - 1, arg4, (byte) 3);
			@Pc(19) boolean local19 = false;
			method362(arg2, arg1, arg0, arg4);
			method362(arg2, arg1, arg0 + arg3 - 1, arg4);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("53779, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBBQNXJX", name = "b", descriptor = "(IIIIIII)V")
	public static void method359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method361(arg0, arg5, arg3, arg2, arg1);
			method361(arg0, arg5, arg3, arg2, arg1 + arg4 - 1);
			if (arg4 >= 3) {
				method363(arg3, arg1 + 1, arg4 - 2, (byte) 5, arg5, arg0);
				method363(arg3, arg1 + 1, arg4 - 2, (byte) 5, arg5 + arg2 - 1, arg0);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("88746, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBBQNXJX", name = "a", descriptor = "(IIIIB)V")
	public static void method360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		try {
			if (arg2 >= anInt465 && arg2 < anInt466) {
				if (arg1 < anInt467) {
					arg0 -= anInt467 - arg1;
					arg1 = anInt467;
				}
				if (arg1 + arg0 > anInt468) {
					arg0 = anInt468 - arg1;
				}
				@Pc(34) int local34 = arg1 + arg2 * anInt463;
				@Pc(39) boolean local39 = false;
				for (@Pc(44) int local44 = 0; local44 < arg0; local44++) {
					anIntArray104[local34 + local44] = arg3;
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("4406, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBBQNXJX", name = "b", descriptor = "(IIIIII)V")
	private static void method361(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg4 >= anInt465 && arg4 < anInt466) {
				if (arg1 < anInt467) {
					arg3 -= anInt467 - arg1;
					arg1 = anInt467;
				}
				if (arg1 + arg3 > anInt468) {
					arg3 = anInt468 - arg1;
				}
				@Pc(30) int local30 = 256 - arg0;
				@Pc(38) int local38 = (arg2 >> 16 & 0xFF) * arg0;
				@Pc(46) int local46 = (arg2 >> 8 & 0xFF) * arg0;
				@Pc(52) int local52 = (arg2 & 0xFF) * arg0;
				@Pc(66) int local66 = arg1 + arg4 * anInt463;
				for (@Pc(68) int local68 = 0; local68 < arg3; local68++) {
					@Pc(80) int local80 = (anIntArray104[local66] >> 16 & 0xFF) * local30;
					@Pc(90) int local90 = (anIntArray104[local66] >> 8 & 0xFF) * local30;
					@Pc(98) int local98 = (anIntArray104[local66] & 0xFF) * local30;
					@Pc(120) int local120 = (local38 + local80 >> 8 << 16) + (local46 + local90 >> 8 << 8) + (local52 + local98 >> 8);
					anIntArray104[local66++] = local120;
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("18217, " + arg0 + ", " + 506 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBBQNXJX", name = "b", descriptor = "(IIIII)V")
	public static void method362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt467 && arg2 < anInt468) {
				if (arg1 < anInt465) {
					arg0 -= anInt465 - arg1;
					arg1 = anInt465;
				}
				if (arg1 + arg0 > anInt466) {
					arg0 = anInt466 - arg1;
				}
				@Pc(39) int local39 = arg2 + arg1 * anInt463;
				for (@Pc(41) int local41 = 0; local41 < arg0; local41++) {
					anIntArray104[local39 + local41 * anInt463] = arg3;
				}
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("43238, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 1 + ", " + arg3 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBBQNXJX", name = "a", descriptor = "(IIIBII)V")
	private static void method363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg4 >= anInt467 && arg4 < anInt468) {
				if (arg1 < anInt465) {
					arg2 -= anInt465 - arg1;
					arg1 = anInt465;
				}
				if (arg1 + arg2 > anInt466) {
					arg2 = anInt466 - arg1;
				}
				@Pc(32) int local32 = 256 - arg5;
				@Pc(37) boolean local37 = false;
				@Pc(48) int local48 = (arg0 >> 16 & 0xFF) * arg5;
				@Pc(56) int local56 = (arg0 >> 8 & 0xFF) * arg5;
				@Pc(62) int local62 = (arg0 & 0xFF) * arg5;
				@Pc(68) int local68 = arg4 + arg1 * anInt463;
				for (@Pc(70) int local70 = 0; local70 < arg2; local70++) {
					@Pc(82) int local82 = (anIntArray104[local68] >> 16 & 0xFF) * local32;
					@Pc(92) int local92 = (anIntArray104[local68] >> 8 & 0xFF) * local32;
					@Pc(100) int local100 = (anIntArray104[local68] & 0xFF) * local32;
					@Pc(122) int local122 = (local48 + local82 >> 8 << 16) + (local56 + local92 >> 8 << 8) + (local62 + local100 >> 8);
					anIntArray104[local68] = local122;
					local68 += anInt463;
				}
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("69898, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBBQNXJX", name = "<init>", descriptor = "()V")
	protected Class2_Sub1_Sub3() {
	}
}
