import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!IGZZCJOU")
public class Class5_Sub1_Sub2 extends Class5_Sub1 {

	@OriginalMember(owner = "client!IGZZCJOU", name = "m", descriptor = "[I")
	public static int[] anIntArray117;

	@OriginalMember(owner = "client!IGZZCJOU", name = "n", descriptor = "I")
	public static int anInt622;

	@OriginalMember(owner = "client!IGZZCJOU", name = "o", descriptor = "I")
	public static int anInt623;

	@OriginalMember(owner = "client!IGZZCJOU", name = "p", descriptor = "I")
	public static int anInt624;

	@OriginalMember(owner = "client!IGZZCJOU", name = "q", descriptor = "I")
	public static int anInt625;

	@OriginalMember(owner = "client!IGZZCJOU", name = "r", descriptor = "I")
	public static int anInt626;

	@OriginalMember(owner = "client!IGZZCJOU", name = "s", descriptor = "I")
	public static int anInt627;

	@OriginalMember(owner = "client!IGZZCJOU", name = "t", descriptor = "I")
	public static int anInt628;

	@OriginalMember(owner = "client!IGZZCJOU", name = "u", descriptor = "I")
	public static int anInt629;

	@OriginalMember(owner = "client!IGZZCJOU", name = "v", descriptor = "I")
	public static int anInt630;

	@OriginalMember(owner = "client!IGZZCJOU", name = "i", descriptor = "I")
	private static int anInt620 = -774;

	@OriginalMember(owner = "client!IGZZCJOU", name = "j", descriptor = "Z")
	private static boolean aBoolean174 = true;

	@OriginalMember(owner = "client!IGZZCJOU", name = "k", descriptor = "I")
	private static int anInt621 = 6;

	@OriginalMember(owner = "client!IGZZCJOU", name = "l", descriptor = "Z")
	private static boolean aBoolean175 = true;

	@OriginalMember(owner = "client!IGZZCJOU", name = "a", descriptor = "([IBII)V")
	public static void method330(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			anIntArray117 = arg0;
			anInt622 = arg1;
			anInt623 = arg2;
			method332(0, arg2, 0, arg1);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("77506, " + arg0 + ", " + 4 + ", " + arg1 + ", " + arg2 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGZZCJOU", name = "a", descriptor = "(I)V")
	public static void method331() {
		try {
			anInt626 = 0;
			anInt624 = 0;
			anInt627 = anInt622;
			anInt625 = anInt623;
			anInt628 = anInt627 - 1;
			anInt629 = anInt627 / 2;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("26936, " + -652 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGZZCJOU", name = "a", descriptor = "(BIIII)V")
	public static void method332(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg3 > anInt622) {
				arg3 = anInt622;
			}
			if (arg1 > anInt623) {
				arg1 = anInt623;
			}
			anInt626 = arg0;
			anInt624 = arg2;
			anInt627 = arg3;
			anInt625 = arg1;
			anInt628 = anInt627 - 1;
			anInt629 = anInt627 / 2;
			anInt630 = anInt625 / 2;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("57392, " + -90 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGZZCJOU", name = "a", descriptor = "(B)V")
	public static void method333() {
		try {
			@Pc(12) int local12 = anInt622 * anInt623;
			for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
				anIntArray117[local14] = 0;
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("9331, " + -107 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGZZCJOU", name = "a", descriptor = "(IIIIIII)V")
	public static void method334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 < anInt626) {
				arg3 -= anInt626 - arg1;
				arg1 = anInt626;
			}
			if (arg5 < anInt624) {
				arg4 -= anInt624 - arg5;
				arg5 = anInt624;
			}
			if (arg1 + arg3 > anInt627) {
				arg3 = anInt627 - arg1;
			}
			if (arg5 + arg4 > anInt625) {
				arg4 = anInt625 - arg5;
			}
			@Pc(45) int local45 = 256 - arg2;
			@Pc(53) int local53 = (arg0 >> 16 & 0xFF) * arg2;
			@Pc(61) int local61 = (arg0 >> 8 & 0xFF) * arg2;
			@Pc(67) int local67 = (arg0 & 0xFF) * arg2;
			@Pc(71) int local71 = anInt622 - arg3;
			@Pc(81) int local81 = arg1 + arg5 * anInt622;
			for (@Pc(83) int local83 = 0; local83 < arg4; local83++) {
				for (@Pc(88) int local88 = -arg3; local88 < 0; local88++) {
					@Pc(100) int local100 = (anIntArray117[local81] >> 16 & 0xFF) * local45;
					@Pc(110) int local110 = (anIntArray117[local81] >> 8 & 0xFF) * local45;
					@Pc(118) int local118 = (anIntArray117[local81] & 0xFF) * local45;
					@Pc(140) int local140 = (local53 + local100 >> 8 << 16) + (local61 + local110 >> 8 << 8) + (local67 + local118 >> 8);
					anIntArray117[local81++] = local140;
				}
				local81 += local71;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("43076, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -774 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGZZCJOU", name = "a", descriptor = "(IIIZII)V")
	public static void method335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 < anInt626) {
				arg3 -= anInt626 - arg2;
				arg2 = anInt626;
			}
			if (arg0 < anInt624) {
				arg4 -= anInt624 - arg0;
				arg0 = anInt624;
			}
			if (arg2 + arg3 > anInt627) {
				arg3 = anInt627 - arg2;
			}
			if (arg0 + arg4 > anInt625) {
				arg4 = anInt625 - arg0;
			}
			@Pc(45) int local45 = anInt622 - arg3;
			@Pc(51) int local51 = arg2 + arg0 * anInt622;
			for (@Pc(54) int local54 = -arg4; local54 < 0; local54++) {
				for (@Pc(59) int local59 = -arg3; local59 < 0; local59++) {
					anIntArray117[local51++] = arg1;
				}
				local51 += local45;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("65803, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGZZCJOU", name = "a", descriptor = "(ZIIIII)V")
	public static void method336(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method338(arg0, arg1, arg2, arg3);
			method338(arg0, arg1 + arg4 - 1, arg2, arg3);
			method340(arg4, arg1, arg0, arg3);
			method340(arg4, arg1, arg0, arg3 + arg2 - 1);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("25455, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGZZCJOU", name = "a", descriptor = "(IIZIIII)V")
	public static void method337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method339(arg4, arg2, arg0, arg3, arg1);
			method339(arg4, arg2, arg0, arg3, arg1 + arg5 - 1);
			if (arg5 >= 3) {
				method341(arg5 - 2, arg2, arg1 + 1, arg3, arg0);
				method341(arg5 - 2, arg2, arg1 + 1, arg3 + arg4 - 1, arg0);
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("83727, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGZZCJOU", name = "a", descriptor = "(IIIIZ)V")
	public static void method338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 >= anInt624 && arg1 < anInt625) {
				if (arg3 < anInt626) {
					arg2 -= anInt626 - arg3;
					arg3 = anInt626;
				}
				if (arg3 + arg2 > anInt627) {
					arg2 = anInt627 - arg3;
				}
				@Pc(34) int local34 = arg3 + arg1 * anInt622;
				for (@Pc(45) int local45 = 0; local45 < arg2; local45++) {
					anIntArray117[local34 + local45] = arg0;
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("95783, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGZZCJOU", name = "a", descriptor = "(IIIIIZ)V")
	private static void method339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg4 >= anInt624 && arg4 < anInt625) {
				if (arg3 < anInt626) {
					arg0 -= anInt626 - arg3;
					arg3 = anInt626;
				}
				if (arg3 + arg0 > anInt627) {
					arg0 = anInt627 - arg3;
				}
				@Pc(30) int local30 = 256 - arg2;
				@Pc(46) int local46 = (arg1 >> 16 & 0xFF) * arg2;
				@Pc(54) int local54 = (arg1 >> 8 & 0xFF) * arg2;
				@Pc(60) int local60 = (arg1 & 0xFF) * arg2;
				@Pc(66) int local66 = arg3 + arg4 * anInt622;
				for (@Pc(68) int local68 = 0; local68 < arg0; local68++) {
					@Pc(80) int local80 = (anIntArray117[local66] >> 16 & 0xFF) * local30;
					@Pc(90) int local90 = (anIntArray117[local66] >> 8 & 0xFF) * local30;
					@Pc(98) int local98 = (anIntArray117[local66] & 0xFF) * local30;
					@Pc(120) int local120 = (local46 + local80 >> 8 << 16) + (local54 + local90 >> 8 << 8) + (local60 + local98 >> 8);
					anIntArray117[local66++] = local120;
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("99838, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGZZCJOU", name = "a", descriptor = "(IIIII)V")
	public static void method340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 >= anInt626 && arg3 < anInt627) {
				if (arg1 < anInt624) {
					arg0 -= anInt624 - arg1;
					arg1 = anInt624;
				}
				if (arg1 + arg0 > anInt625) {
					arg0 = anInt625 - arg1;
				}
				@Pc(39) int local39 = arg3 + arg1 * anInt622;
				for (@Pc(41) int local41 = 0; local41 < arg0; local41++) {
					anIntArray117[local39 + local41 * anInt622] = arg2;
				}
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("53916, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -72 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGZZCJOU", name = "a", descriptor = "(IIIIIB)V")
	private static void method341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3 >= anInt626 && arg3 < anInt627) {
				if (arg2 < anInt624) {
					arg0 -= anInt624 - arg2;
					arg2 = anInt624;
				}
				if (arg2 + arg0 > anInt625) {
					arg0 = anInt625 - arg2;
				}
				@Pc(30) int local30 = 256 - arg4;
				@Pc(38) int local38 = (arg1 >> 16 & 0xFF) * arg4;
				@Pc(46) int local46 = (arg1 >> 8 & 0xFF) * arg4;
				@Pc(52) int local52 = (arg1 & 0xFF) * arg4;
				@Pc(58) int local58 = arg3 + arg2 * anInt622;
				for (@Pc(69) int local69 = 0; local69 < arg0; local69++) {
					@Pc(81) int local81 = (anIntArray117[local58] >> 16 & 0xFF) * local30;
					@Pc(91) int local91 = (anIntArray117[local58] >> 8 & 0xFF) * local30;
					@Pc(99) int local99 = (anIntArray117[local58] & 0xFF) * local30;
					@Pc(121) int local121 = (local38 + local81 >> 8 << 16) + (local46 + local91 >> 8 << 8) + (local52 + local99 >> 8);
					anIntArray117[local58] = local121;
					local58 += anInt622;
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("31951, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 5 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IGZZCJOU", name = "<init>", descriptor = "()V")
	protected Class5_Sub1_Sub2() {
	}
}
