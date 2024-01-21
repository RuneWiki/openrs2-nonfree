import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YYTDUXDR")
public class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!YYTDUXDR", name = "i", descriptor = "Z")
	private static boolean aBoolean177;

	@OriginalMember(owner = "client!YYTDUXDR", name = "j", descriptor = "Z")
	private static boolean aBoolean178;

	@OriginalMember(owner = "client!YYTDUXDR", name = "m", descriptor = "Z")
	private static boolean aBoolean180;

	@OriginalMember(owner = "client!YYTDUXDR", name = "n", descriptor = "[I")
	public static int[] anIntArray164;

	@OriginalMember(owner = "client!YYTDUXDR", name = "o", descriptor = "I")
	public static int anInt688;

	@OriginalMember(owner = "client!YYTDUXDR", name = "p", descriptor = "I")
	public static int anInt689;

	@OriginalMember(owner = "client!YYTDUXDR", name = "q", descriptor = "I")
	public static int anInt690;

	@OriginalMember(owner = "client!YYTDUXDR", name = "r", descriptor = "I")
	public static int anInt691;

	@OriginalMember(owner = "client!YYTDUXDR", name = "s", descriptor = "I")
	public static int anInt692;

	@OriginalMember(owner = "client!YYTDUXDR", name = "t", descriptor = "I")
	public static int anInt693;

	@OriginalMember(owner = "client!YYTDUXDR", name = "u", descriptor = "I")
	public static int anInt694;

	@OriginalMember(owner = "client!YYTDUXDR", name = "v", descriptor = "I")
	public static int anInt695;

	@OriginalMember(owner = "client!YYTDUXDR", name = "w", descriptor = "I")
	public static int anInt696;

	@OriginalMember(owner = "client!YYTDUXDR", name = "l", descriptor = "I")
	private static int anInt687;

	static {
		aBoolean179 = true;
		anInt687 = -408;
	}

	@OriginalMember(owner = "client!YYTDUXDR", name = "a", descriptor = "([IIZI)V")
	public static void method491(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			anIntArray164 = arg0;
			anInt688 = arg2;
			anInt689 = arg1;
			method493(arg2, 0, 0, arg1);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("63015, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYTDUXDR", name = "a", descriptor = "(I)V")
	public static void method492() {
		try {
			anInt692 = 0;
			anInt690 = 0;
			anInt693 = anInt688;
			anInt691 = anInt689;
			anInt694 = anInt693 - 1;
			anInt695 = anInt693 / 2;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("9067, " + -423 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYTDUXDR", name = "a", descriptor = "(IIIII)V")
	public static void method493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg0 > anInt688) {
				arg0 = anInt688;
			}
			if (arg3 > anInt689) {
				arg3 = anInt689;
			}
			anInt692 = arg2;
			anInt690 = arg1;
			anInt693 = arg0;
			anInt691 = arg3;
			anInt694 = anInt693 - 1;
			anInt695 = anInt693 / 2;
			anInt696 = anInt691 / 2;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("83367, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 5 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYTDUXDR", name = "a", descriptor = "(Z)V")
	public static void method494() {
		try {
			@Pc(11) int local11 = anInt688 * anInt689;
			for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
				anIntArray164[local13] = 0;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("19117, " + false + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYTDUXDR", name = "a", descriptor = "(IIIIIII)V")
	public static void method495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 < anInt692) {
				arg5 -= anInt692 - arg2;
				arg2 = anInt692;
			}
			if (arg3 < anInt690) {
				arg4 -= anInt690 - arg3;
				arg3 = anInt690;
			}
			if (arg2 + arg5 > anInt693) {
				arg5 = anInt693 - arg2;
			}
			if (arg3 + arg4 > anInt691) {
				arg4 = anInt691 - arg3;
			}
			@Pc(45) int local45 = 256 - arg1;
			@Pc(53) int local53 = (arg0 >> 16 & 0xFF) * arg1;
			@Pc(61) int local61 = (arg0 >> 8 & 0xFF) * arg1;
			@Pc(67) int local67 = (arg0 & 0xFF) * arg1;
			@Pc(74) int local74 = anInt688 - arg5;
			@Pc(80) int local80 = arg2 + arg3 * anInt688;
			for (@Pc(82) int local82 = 0; local82 < arg4; local82++) {
				for (@Pc(87) int local87 = -arg5; local87 < 0; local87++) {
					@Pc(99) int local99 = (anIntArray164[local80] >> 16 & 0xFF) * local45;
					@Pc(109) int local109 = (anIntArray164[local80] >> 8 & 0xFF) * local45;
					@Pc(117) int local117 = (anIntArray164[local80] & 0xFF) * local45;
					@Pc(139) int local139 = (local53 + local99 >> 8 << 16) + (local61 + local109 >> 8 << 8) + (local67 + local117 >> 8);
					anIntArray164[local80++] = local139;
				}
				local80 += local74;
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("77931, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -683 + ", " + arg4 + ", " + arg5 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYTDUXDR", name = "a", descriptor = "(IBIIII)V")
	public static void method496(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 < anInt692) {
				arg2 -= anInt692 - arg0;
				arg0 = anInt692;
			}
			if (arg4 < anInt690) {
				arg3 -= anInt690 - arg4;
				arg4 = anInt690;
			}
			if (arg0 + arg2 > anInt693) {
				arg2 = anInt693 - arg0;
			}
			if (arg4 + arg3 > anInt691) {
				arg3 = anInt691 - arg4;
			}
			@Pc(45) int local45 = anInt688 - arg2;
			@Pc(51) int local51 = arg0 + arg4 * anInt688;
			for (@Pc(63) int local63 = -arg3; local63 < 0; local63++) {
				for (@Pc(68) int local68 = -arg2; local68 < 0; local68++) {
					anIntArray164[local51++] = arg1;
				}
				local51 += local45;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("61514, " + arg0 + ", " + 109 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYTDUXDR", name = "a", descriptor = "(IIIIBI)V")
	public static void method497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			method499(arg1, arg0, arg4, arg2);
			method499(arg1, arg0, arg4 + arg3 - 1, arg2);
			method501(arg4, arg3, arg2, arg1);
			method501(arg4, arg3, arg2 + arg0 - 1, arg1);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("54959, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 12 + ", " + arg4 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYTDUXDR", name = "a", descriptor = "(BIIIIII)V")
	public static void method498(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method500(arg0, arg5, arg4, arg3, arg2);
			method500(arg0, arg5, arg4, arg3, arg2 + arg1 - 1);
			if (arg1 >= 3) {
				method502(arg4, arg5, arg3, arg2 + 1, arg1 - 2);
				method502(arg4 + arg0 - 1, arg5, arg3, arg2 + 1, arg1 - 2);
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("65151, " + 8 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYTDUXDR", name = "b", descriptor = "(IIIII)V")
	public static void method499(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt690 && arg2 < anInt691) {
				if (arg3 < anInt692) {
					arg1 -= anInt692 - arg3;
					arg3 = anInt692;
				}
				if (arg3 + arg1 > anInt693) {
					arg1 = anInt693 - arg3;
				}
				@Pc(35) int local35 = arg3 + arg2 * anInt688;
				for (@Pc(37) int local37 = 0; local37 < arg1; local37++) {
					anIntArray164[local35 + local37] = arg0;
				}
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("93226, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYTDUXDR", name = "a", descriptor = "(IIIIII)V")
	private static void method500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg4 >= anInt690 && arg4 < anInt691) {
				if (arg2 < anInt692) {
					arg0 -= anInt692 - arg2;
					arg2 = anInt692;
				}
				if (arg2 + arg0 > anInt693) {
					arg0 = anInt693 - arg2;
				}
				@Pc(32) int local32 = 256 - arg1;
				@Pc(40) int local40 = (arg3 >> 16 & 0xFF) * arg1;
				@Pc(48) int local48 = (arg3 >> 8 & 0xFF) * arg1;
				@Pc(54) int local54 = (arg3 & 0xFF) * arg1;
				@Pc(60) int local60 = arg2 + arg4 * anInt688;
				for (@Pc(67) int local67 = 0; local67 < arg0; local67++) {
					@Pc(79) int local79 = (anIntArray164[local60] >> 16 & 0xFF) * local32;
					@Pc(89) int local89 = (anIntArray164[local60] >> 8 & 0xFF) * local32;
					@Pc(97) int local97 = (anIntArray164[local60] & 0xFF) * local32;
					@Pc(119) int local119 = (local40 + local79 >> 8 << 16) + (local48 + local89 >> 8 << 8) + (local54 + local97 >> 8);
					anIntArray164[local60++] = local119;
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("58779, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -957 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYTDUXDR", name = "c", descriptor = "(IIIII)V")
	public static void method501(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt692 && arg2 < anInt693) {
				if (arg0 < anInt690) {
					arg1 -= anInt690 - arg0;
					arg0 = anInt690;
				}
				if (arg0 + arg1 > anInt691) {
					arg1 = anInt691 - arg0;
				}
				@Pc(34) int local34 = arg2 + arg0 * anInt688;
				for (@Pc(47) int local47 = 0; local47 < arg1; local47++) {
					anIntArray164[local34 + local47 * anInt688] = arg3;
				}
			}
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("81322, " + -709 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYTDUXDR", name = "b", descriptor = "(IIIIBI)V")
	private static void method502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt692 && arg0 < anInt693) {
				if (arg3 < anInt690) {
					arg4 -= anInt690 - arg3;
					arg3 = anInt690;
				}
				if (arg3 + arg4 > anInt691) {
					arg4 = anInt691 - arg3;
				}
				@Pc(39) int local39 = 256 - arg1;
				@Pc(47) int local47 = (arg2 >> 16 & 0xFF) * arg1;
				@Pc(55) int local55 = (arg2 >> 8 & 0xFF) * arg1;
				@Pc(61) int local61 = (arg2 & 0xFF) * arg1;
				@Pc(67) int local67 = arg0 + arg3 * anInt688;
				for (@Pc(69) int local69 = 0; local69 < arg4; local69++) {
					@Pc(81) int local81 = (anIntArray164[local67] >> 16 & 0xFF) * local39;
					@Pc(91) int local91 = (anIntArray164[local67] >> 8 & 0xFF) * local39;
					@Pc(99) int local99 = (anIntArray164[local67] & 0xFF) * local39;
					@Pc(121) int local121 = (local47 + local81 >> 8 << 16) + (local55 + local91 >> 8 << 8) + (local61 + local99 >> 8);
					anIntArray164[local67] = local121;
					local67 += anInt688;
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("63426, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 9 + ", " + arg4 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YYTDUXDR", name = "<init>", descriptor = "()V")
	protected Class4_Sub1_Sub2() {
	}
}
