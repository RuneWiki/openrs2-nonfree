import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JOVUNXBE")
public class Class4_Sub1_Sub2 extends Class4_Sub1 {

	@OriginalMember(owner = "client!JOVUNXBE", name = "l", descriptor = "Z")
	private static boolean aBoolean183;

	@OriginalMember(owner = "client!JOVUNXBE", name = "m", descriptor = "Z")
	private static boolean aBoolean184;

	@OriginalMember(owner = "client!JOVUNXBE", name = "n", descriptor = "I")
	private static int anInt697;

	@OriginalMember(owner = "client!JOVUNXBE", name = "o", descriptor = "[I")
	public static int[] anIntArray165;

	@OriginalMember(owner = "client!JOVUNXBE", name = "p", descriptor = "I")
	public static int anInt698;

	@OriginalMember(owner = "client!JOVUNXBE", name = "q", descriptor = "I")
	public static int anInt699;

	@OriginalMember(owner = "client!JOVUNXBE", name = "r", descriptor = "I")
	public static int anInt700;

	@OriginalMember(owner = "client!JOVUNXBE", name = "s", descriptor = "I")
	public static int anInt701;

	@OriginalMember(owner = "client!JOVUNXBE", name = "t", descriptor = "I")
	public static int anInt702;

	@OriginalMember(owner = "client!JOVUNXBE", name = "u", descriptor = "I")
	public static int anInt703;

	@OriginalMember(owner = "client!JOVUNXBE", name = "v", descriptor = "I")
	public static int anInt704;

	@OriginalMember(owner = "client!JOVUNXBE", name = "w", descriptor = "I")
	public static int anInt705;

	@OriginalMember(owner = "client!JOVUNXBE", name = "x", descriptor = "I")
	public static int anInt706;

	@OriginalMember(owner = "client!JOVUNXBE", name = "k", descriptor = "I")
	private static int anInt696;

	static {
		aBoolean182 = true;
		anInt696 = 4;
	}

	@OriginalMember(owner = "client!JOVUNXBE", name = "a", descriptor = "([IIII)V")
	public static void method482(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			anIntArray165 = arg0;
			anInt698 = arg1;
			anInt699 = arg2;
			method484(arg1, 0, 0, arg2);
			if (anInt697 > 0 || anInt697 < 0) {
				for (@Pc(19) int local19 = 1; local19 > 0; local19++) {
				}
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("55831, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JOVUNXBE", name = "a", descriptor = "(B)V")
	public static void method483(@OriginalArg(0) byte arg0) {
		try {
			anInt702 = 0;
			anInt700 = 0;
			anInt703 = anInt698;
			@Pc(10) boolean local10 = false;
			anInt701 = anInt699;
			anInt704 = anInt703 - 1;
			anInt705 = anInt703 / 2;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("94429, " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JOVUNXBE", name = "a", descriptor = "(IIIII)V")
	public static void method484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg0 > anInt698) {
				arg0 = anInt698;
			}
			if (arg3 > anInt699) {
				arg3 = anInt699;
			}
			anInt702 = arg1;
			anInt700 = arg2;
			anInt703 = arg0;
			anInt701 = arg3;
			anInt704 = anInt703 - 1;
			anInt705 = anInt703 / 2;
			anInt706 = anInt701 / 2;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("42544, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -701 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JOVUNXBE", name = "b", descriptor = "(B)V")
	public static void method485(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(18) int local18 = anInt698 * anInt699;
			for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
				anIntArray165[local20] = 0;
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("53871, " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JOVUNXBE", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg4 < anInt702) {
				arg1 -= anInt702 - arg4;
				arg4 = anInt702;
			}
			if (arg2 < anInt700) {
				arg3 -= anInt700 - arg2;
				arg2 = anInt700;
			}
			if (arg4 + arg1 > anInt703) {
				arg1 = anInt703 - arg4;
			}
			if (arg2 + arg3 > anInt701) {
				arg3 = anInt701 - arg2;
			}
			@Pc(45) int local45 = 256 - arg0;
			@Pc(53) int local53 = (arg5 >> 16 & 0xFF) * arg0;
			@Pc(61) int local61 = (arg5 >> 8 & 0xFF) * arg0;
			@Pc(67) int local67 = (arg5 & 0xFF) * arg0;
			@Pc(74) int local74 = anInt698 - arg1;
			@Pc(80) int local80 = arg4 + arg2 * anInt698;
			for (@Pc(82) int local82 = 0; local82 < arg3; local82++) {
				for (@Pc(87) int local87 = -arg1; local87 < 0; local87++) {
					@Pc(99) int local99 = (anIntArray165[local80] >> 16 & 0xFF) * local45;
					@Pc(109) int local109 = (anIntArray165[local80] >> 8 & 0xFF) * local45;
					@Pc(117) int local117 = (anIntArray165[local80] & 0xFF) * local45;
					@Pc(139) int local139 = (local53 + local99 >> 8 << 16) + (local61 + local109 >> 8 << 8) + (local67 + local117 >> 8);
					anIntArray165[local80++] = local139;
				}
				local80 += local74;
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("48896, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + true + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JOVUNXBE", name = "a", descriptor = "(IIIIBI)V")
	public static void method487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 < anInt702) {
				arg1 -= anInt702 - arg3;
				arg3 = anInt702;
			}
			if (arg0 < anInt700) {
				arg2 -= anInt700 - arg0;
				arg0 = anInt700;
			}
			if (arg3 + arg1 > anInt703) {
				arg1 = anInt703 - arg3;
			}
			if (arg0 + arg2 > anInt701) {
				arg2 = anInt701 - arg0;
			}
			@Pc(45) int local45 = anInt698 - arg1;
			@Pc(60) int local60 = arg3 + arg0 * anInt698;
			for (@Pc(63) int local63 = -arg2; local63 < 0; local63++) {
				for (@Pc(68) int local68 = -arg1; local68 < 0; local68++) {
					anIntArray165[local60++] = arg4;
				}
				local60 += local45;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("5383, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 5 + ", " + arg4 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JOVUNXBE", name = "a", descriptor = "(IIIIII)V")
	public static void method488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			method490(arg5, arg4, arg0, arg3);
			method490(arg5 + arg1 - 1, arg4, arg0, arg3);
			if (arg2 != 0) {
				aBoolean184 = !aBoolean184;
			}
			method492(arg5, arg4, arg3, arg1);
			method492(arg5, arg4 + arg0 - 1, arg3, arg1);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("51175, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JOVUNXBE", name = "a", descriptor = "(BIIIIII)V")
	public static void method489(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method491(arg2, arg3, arg5, arg1, arg4);
			method491(arg2, arg3, arg5, arg1 + arg0 - 1, arg4);
			if (arg0 >= 3) {
				method493(arg4, arg0 - 2, arg1 + 1, arg5, arg2);
				method493(arg4, arg0 - 2, arg1 + 1, arg5 + arg3 - 1, arg2);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("24416, " + 61 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JOVUNXBE", name = "b", descriptor = "(IIIII)V")
	public static void method490(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 >= anInt700 && arg0 < anInt701) {
				if (arg1 < anInt702) {
					arg2 -= anInt702 - arg1;
					arg1 = anInt702;
				}
				if (arg1 + arg2 > anInt703) {
					arg2 = anInt703 - arg1;
				}
				@Pc(45) int local45 = arg1 + arg0 * anInt698;
				for (@Pc(47) int local47 = 0; local47 < arg2; local47++) {
					anIntArray165[local45 + local47] = arg3;
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("43708, " + -532 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JOVUNXBE", name = "b", descriptor = "(IIIIII)V")
	private static void method491(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 >= anInt700 && arg3 < anInt701) {
				if (arg2 < anInt702) {
					arg1 -= anInt702 - arg2;
					arg2 = anInt702;
				}
				if (arg2 + arg1 > anInt703) {
					arg1 = anInt703 - arg2;
				}
				@Pc(30) int local30 = 256 - arg4;
				@Pc(45) int local45 = (arg0 >> 16 & 0xFF) * arg4;
				@Pc(53) int local53 = (arg0 >> 8 & 0xFF) * arg4;
				@Pc(59) int local59 = (arg0 & 0xFF) * arg4;
				@Pc(65) int local65 = arg2 + arg3 * anInt698;
				for (@Pc(67) int local67 = 0; local67 < arg1; local67++) {
					@Pc(79) int local79 = (anIntArray165[local65] >> 16 & 0xFF) * local30;
					@Pc(89) int local89 = (anIntArray165[local65] >> 8 & 0xFF) * local30;
					@Pc(97) int local97 = (anIntArray165[local65] & 0xFF) * local30;
					@Pc(119) int local119 = (local45 + local79 >> 8 << 16) + (local53 + local89 >> 8 << 8) + (local59 + local97 >> 8);
					anIntArray165[local65++] = local119;
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("13361, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 5 + ", " + arg3 + ", " + arg4 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JOVUNXBE", name = "a", descriptor = "(IIIZI)V")
	public static void method492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 >= anInt702 && arg1 < anInt703) {
				if (arg0 < anInt700) {
					arg3 -= anInt700 - arg0;
					arg0 = anInt700;
				}
				if (arg0 + arg3 > anInt701) {
					arg3 = anInt701 - arg0;
				}
				@Pc(34) int local34 = arg1 + arg0 * anInt698;
				for (@Pc(45) int local45 = 0; local45 < arg3; local45++) {
					anIntArray165[local34 + local45 * anInt698] = arg2;
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("11700, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JOVUNXBE", name = "c", descriptor = "(IIIIII)V")
	private static void method493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 >= anInt702 && arg3 < anInt703) {
				if (arg2 < anInt700) {
					arg1 -= anInt700 - arg2;
					arg2 = anInt700;
				}
				if (arg2 + arg1 > anInt701) {
					arg1 = anInt701 - arg2;
				}
				@Pc(30) int local30 = 256 - arg0;
				@Pc(46) int local46 = (arg4 >> 16 & 0xFF) * arg0;
				@Pc(54) int local54 = (arg4 >> 8 & 0xFF) * arg0;
				@Pc(60) int local60 = (arg4 & 0xFF) * arg0;
				@Pc(66) int local66 = arg3 + arg2 * anInt698;
				for (@Pc(68) int local68 = 0; local68 < arg1; local68++) {
					@Pc(80) int local80 = (anIntArray165[local66] >> 16 & 0xFF) * local30;
					@Pc(90) int local90 = (anIntArray165[local66] >> 8 & 0xFF) * local30;
					@Pc(98) int local98 = (anIntArray165[local66] & 0xFF) * local30;
					@Pc(120) int local120 = (local46 + local80 >> 8 << 16) + (local54 + local90 >> 8 << 8) + (local60 + local98 >> 8);
					anIntArray165[local66] = local120;
					local66 += anInt698;
				}
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("23654, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JOVUNXBE", name = "<init>", descriptor = "()V")
	protected Class4_Sub1_Sub2() {
	}
}
