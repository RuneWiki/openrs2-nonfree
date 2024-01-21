import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gb")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "Z")
	private static boolean aBoolean183;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "[I")
	public static int[] anIntArray210;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
	public static int anInt691;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
	public static int anInt692;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	public static int anInt693;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public static int anInt694;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public static int anInt695;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	public static int anInt696;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public static int anInt697;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public static int anInt698;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	public static int anInt699;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	private static int anInt690 = 7;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[IZ)V")
	public static void method431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		try {
			anIntArray210 = arg2;
			anInt691 = arg0;
			anInt692 = arg1;
			method433(0, 0, arg0, arg1, 297);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("21172, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
	public static void method432() {
		try {
			anInt695 = 0;
			anInt693 = 0;
			anInt696 = anInt691;
			anInt694 = anInt692;
			anInt697 = anInt696 - 1;
			anInt698 = anInt696 / 2;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("5515, " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
	public static void method433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg2 > anInt691) {
				arg2 = anInt691;
			}
			if (arg3 > anInt692) {
				arg3 = anInt692;
			}
			anInt695 = arg1;
			@Pc(23) boolean local23 = false;
			anInt693 = arg0;
			anInt696 = arg2;
			anInt694 = arg3;
			anInt697 = anInt696 - 1;
			anInt698 = anInt696 / 2;
			anInt699 = anInt694 / 2;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("48426, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V")
	public static void method434() {
		try {
			@Pc(3) int local3 = anInt691 * anInt692;
			for (@Pc(8) int local8 = 0; local8 < local3; local8++) {
				anIntArray210[local8] = 0;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("46543, " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZIIIIII)V")
	public static void method435(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg3 < anInt695) {
				arg1 -= anInt695 - arg3;
				arg3 = anInt695;
			}
			if (arg5 < anInt693) {
				arg4 -= anInt693 - arg5;
				arg5 = anInt693;
			}
			if (arg3 + arg1 > anInt696) {
				arg1 = anInt696 - arg3;
			}
			if (arg5 + arg4 > anInt694) {
				arg4 = anInt694 - arg5;
			}
			@Pc(45) int local45 = 256 - arg0;
			@Pc(56) int local56 = (arg2 >> 16 & 0xFF) * arg0;
			@Pc(64) int local64 = (arg2 >> 8 & 0xFF) * arg0;
			@Pc(70) int local70 = (arg2 & 0xFF) * arg0;
			@Pc(74) int local74 = anInt691 - arg1;
			@Pc(80) int local80 = arg3 + arg5 * anInt691;
			for (@Pc(82) int local82 = 0; local82 < arg4; local82++) {
				for (@Pc(87) int local87 = -arg1; local87 < 0; local87++) {
					@Pc(99) int local99 = (anIntArray210[local80] >> 16 & 0xFF) * local45;
					@Pc(109) int local109 = (anIntArray210[local80] >> 8 & 0xFF) * local45;
					@Pc(117) int local117 = (anIntArray210[local80] & 0xFF) * local45;
					@Pc(139) int local139 = (local56 + local99 >> 8 << 16) + (local64 + local109 >> 8 << 8) + (local70 + local117 >> 8);
					anIntArray210[local80++] = local139;
				}
				local80 += local74;
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("94289, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII)V")
	public static void method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 < anInt695) {
				arg3 -= anInt695 - arg0;
				arg0 = anInt695;
			}
			if (arg4 < anInt693) {
				arg2 -= anInt693 - arg4;
				arg4 = anInt693;
			}
			if (arg0 + arg3 > anInt696) {
				arg3 = anInt696 - arg0;
			}
			if (arg4 + arg2 > anInt694) {
				arg2 = anInt694 - arg4;
			}
			@Pc(54) int local54 = anInt691 - arg3;
			@Pc(60) int local60 = arg0 + arg4 * anInt691;
			for (@Pc(63) int local63 = -arg2; local63 < 0; local63++) {
				for (@Pc(68) int local68 = -arg3; local68 < 0; local68++) {
					anIntArray210[local60++] = arg1;
				}
				local60 += local54;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("57575, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -37952 + ", " + arg4 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIIII)V")
	public static void method437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method439(arg3, arg1, arg0, arg4);
			method439(arg3 + arg2 - 1, arg1, arg0, arg4);
			method441(arg2, arg4, arg3, arg1);
			method441(arg2, arg4 + arg0 - 1, arg3, arg1);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("68706, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIBIIII)V")
	public static void method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method440(arg0, arg1, arg4, arg2, arg3);
			method440(arg0, arg1, arg4, arg2 + arg5 - 1, arg3);
			if (arg5 >= 3) {
				method442(arg2 + 1, arg3, arg0, arg5 - 2, arg1, 669);
				method442(arg2 + 1, arg3 + arg4 - 1, arg0, arg5 - 2, arg1, 669);
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("65577, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIII)V")
	public static void method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 >= anInt693 && arg0 < anInt694) {
				if (arg3 < anInt695) {
					arg2 -= anInt695 - arg3;
					arg3 = anInt695;
				}
				if (arg3 + arg2 > anInt696) {
					arg2 = anInt696 - arg3;
				}
				@Pc(37) int local37 = arg3 + arg0 * anInt691;
				for (@Pc(39) int local39 = 0; local39 < arg2; local39++) {
					anIntArray210[local37 + local39] = arg1;
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("23698, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIZI)V")
	private static void method440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 >= anInt693 && arg3 < anInt694) {
				if (arg4 < anInt695) {
					arg2 -= anInt695 - arg4;
					arg4 = anInt695;
				}
				if (arg4 + arg2 > anInt696) {
					arg2 = anInt696 - arg4;
				}
				@Pc(30) int local30 = 256 - arg0;
				@Pc(38) int local38 = (arg1 >> 16 & 0xFF) * arg0;
				@Pc(46) int local46 = (arg1 >> 8 & 0xFF) * arg0;
				@Pc(52) int local52 = (arg1 & 0xFF) * arg0;
				@Pc(66) int local66 = arg4 + arg3 * anInt691;
				for (@Pc(68) int local68 = 0; local68 < arg2; local68++) {
					@Pc(80) int local80 = (anIntArray210[local66] >> 16 & 0xFF) * local30;
					@Pc(90) int local90 = (anIntArray210[local66] >> 8 & 0xFF) * local30;
					@Pc(98) int local98 = (anIntArray210[local66] & 0xFF) * local30;
					@Pc(120) int local120 = (local38 + local80 >> 8 << 16) + (local46 + local90 >> 8 << 8) + (local52 + local98 >> 8);
					anIntArray210[local66++] = local120;
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("2374, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZIIII)V")
	public static void method441(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 >= anInt695 && arg1 < anInt696) {
				if (arg2 < anInt693) {
					arg0 -= anInt693 - arg2;
					arg2 = anInt693;
				}
				if (arg2 + arg0 > anInt694) {
					arg0 = anInt694 - arg2;
				}
				@Pc(40) int local40 = arg1 + arg2 * anInt691;
				for (@Pc(42) int local42 = 0; local42 < arg0; local42++) {
					anIntArray210[local40 + local42 * anInt691] = arg3;
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("25097, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(IIIIII)V")
	private static void method442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg1 >= anInt695 && arg1 < anInt696) {
				if (arg0 < anInt693) {
					arg3 -= anInt693 - arg0;
					arg0 = anInt693;
				}
				if (arg0 + arg3 > anInt694) {
					arg3 = anInt694 - arg0;
				}
				@Pc(30) int local30 = 256 - arg2;
				@Pc(38) int local38 = (arg4 >> 16 & 0xFF) * arg2;
				@Pc(46) int local46 = (arg4 >> 8 & 0xFF) * arg2;
				@Pc(52) int local52 = (arg4 & 0xFF) * arg2;
				@Pc(56) boolean local56 = false;
				@Pc(62) int local62 = arg1 + arg0 * anInt691;
				for (@Pc(64) int local64 = 0; local64 < arg3; local64++) {
					@Pc(76) int local76 = (anIntArray210[local62] >> 16 & 0xFF) * local30;
					@Pc(86) int local86 = (anIntArray210[local62] >> 8 & 0xFF) * local30;
					@Pc(94) int local94 = (anIntArray210[local62] & 0xFF) * local30;
					@Pc(116) int local116 = (local38 + local76 >> 8 << 16) + (local46 + local86 >> 8 << 8) + (local52 + local94 >> 8);
					anIntArray210[local62] = local116;
					local62 += anInt691;
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("63651, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
