import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TQHEKXXC")
public class Class8_Sub1_Sub1 extends Class8_Sub1 {

	@OriginalMember(owner = "client!TQHEKXXC", name = "i", descriptor = "I")
	private static int anInt727;

	@OriginalMember(owner = "client!TQHEKXXC", name = "m", descriptor = "I")
	private static int anInt730;

	@OriginalMember(owner = "client!TQHEKXXC", name = "n", descriptor = "I")
	private static int anInt731;

	@OriginalMember(owner = "client!TQHEKXXC", name = "r", descriptor = "[I")
	public static int[] anIntArray157;

	@OriginalMember(owner = "client!TQHEKXXC", name = "s", descriptor = "I")
	public static int anInt734;

	@OriginalMember(owner = "client!TQHEKXXC", name = "t", descriptor = "I")
	public static int anInt735;

	@OriginalMember(owner = "client!TQHEKXXC", name = "u", descriptor = "I")
	public static int anInt736;

	@OriginalMember(owner = "client!TQHEKXXC", name = "v", descriptor = "I")
	public static int anInt737;

	@OriginalMember(owner = "client!TQHEKXXC", name = "w", descriptor = "I")
	public static int anInt738;

	@OriginalMember(owner = "client!TQHEKXXC", name = "x", descriptor = "I")
	public static int anInt739;

	@OriginalMember(owner = "client!TQHEKXXC", name = "y", descriptor = "I")
	public static int anInt740;

	@OriginalMember(owner = "client!TQHEKXXC", name = "z", descriptor = "I")
	public static int anInt741;

	@OriginalMember(owner = "client!TQHEKXXC", name = "A", descriptor = "I")
	public static int anInt742;

	@OriginalMember(owner = "client!TQHEKXXC", name = "k", descriptor = "I")
	private static int anInt728 = -371;

	@OriginalMember(owner = "client!TQHEKXXC", name = "l", descriptor = "I")
	private static int anInt729 = 2;

	@OriginalMember(owner = "client!TQHEKXXC", name = "o", descriptor = "I")
	private static int anInt732 = -558;

	@OriginalMember(owner = "client!TQHEKXXC", name = "p", descriptor = "I")
	private static int anInt733 = -76;

	@OriginalMember(owner = "client!TQHEKXXC", name = "q", descriptor = "Z")
	private static boolean aBoolean169 = true;

	@OriginalMember(owner = "client!TQHEKXXC", name = "a", descriptor = "(III[I)V")
	public static void method502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			anIntArray157 = arg2;
			anInt734 = arg1;
			anInt735 = arg0;
			method504(455, 0, arg1, arg0, 0);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("60537, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQHEKXXC", name = "a", descriptor = "(I)V")
	public static void method503() {
		try {
			anInt738 = 0;
			anInt736 = 0;
			anInt739 = anInt734;
			anInt737 = anInt735;
			anInt740 = anInt739 - 1;
			anInt741 = anInt739 / 2;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("57056, " + 1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQHEKXXC", name = "a", descriptor = "(IIIII)V")
	public static void method504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg4 < 0) {
				arg4 = 0;
			}
			if (arg2 > anInt734) {
				arg2 = anInt734;
			}
			if (arg3 > anInt735) {
				arg3 = anInt735;
			}
			anInt738 = arg1;
			anInt736 = arg4;
			@Pc(25) boolean local25 = false;
			anInt739 = arg2;
			anInt737 = arg3;
			anInt740 = anInt739 - 1;
			anInt741 = anInt739 / 2;
			anInt742 = anInt737 / 2;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("65181, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQHEKXXC", name = "b", descriptor = "(I)V")
	public static void method505() {
		try {
			@Pc(15) int local15 = anInt734 * anInt735;
			for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
				anIntArray157[local17] = 0;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("79290, " + -371 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQHEKXXC", name = "a", descriptor = "(IIIIIII)V")
	public static void method506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 < anInt738) {
				arg2 -= anInt738 - arg1;
				arg1 = anInt738;
			}
			if (arg3 < anInt736) {
				arg5 -= anInt736 - arg3;
				arg3 = anInt736;
			}
			if (arg1 + arg2 > anInt739) {
				arg2 = anInt739 - arg1;
			}
			if (arg3 + arg5 > anInt737) {
				arg5 = anInt737 - arg3;
			}
			@Pc(45) int local45 = 256 - arg4;
			@Pc(53) int local53 = (arg0 >> 16 & 0xFF) * arg4;
			@Pc(61) int local61 = (arg0 >> 8 & 0xFF) * arg4;
			@Pc(67) int local67 = (arg0 & 0xFF) * arg4;
			@Pc(75) int local75 = anInt734 - arg2;
			@Pc(81) int local81 = arg1 + arg3 * anInt734;
			for (@Pc(83) int local83 = 0; local83 < arg5; local83++) {
				for (@Pc(88) int local88 = -arg2; local88 < 0; local88++) {
					@Pc(100) int local100 = (anIntArray157[local81] >> 16 & 0xFF) * local45;
					@Pc(110) int local110 = (anIntArray157[local81] >> 8 & 0xFF) * local45;
					@Pc(118) int local118 = (anIntArray157[local81] & 0xFF) * local45;
					@Pc(140) int local140 = (local53 + local100 >> 8 << 16) + (local61 + local110 >> 8 << 8) + (local67 + local118 >> 8);
					anIntArray157[local81++] = local140;
				}
				local81 += local75;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("4460, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -71 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQHEKXXC", name = "a", descriptor = "(IIIIIB)V")
	public static void method507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1 < anInt738) {
				arg0 -= anInt738 - arg1;
				arg1 = anInt738;
			}
			if (arg3 < anInt736) {
				arg4 -= anInt736 - arg3;
				arg3 = anInt736;
			}
			if (arg1 + arg0 > anInt739) {
				arg0 = anInt739 - arg1;
			}
			if (arg3 + arg4 > anInt737) {
				arg4 = anInt737 - arg3;
			}
			@Pc(50) int local50 = anInt734 - arg0;
			@Pc(56) int local56 = arg1 + arg3 * anInt734;
			for (@Pc(59) int local59 = -arg4; local59 < 0; local59++) {
				for (@Pc(64) int local64 = -arg0; local64 < 0; local64++) {
					anIntArray157[local56++] = arg2;
				}
				local56 += local50;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("60290, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 1 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQHEKXXC", name = "a", descriptor = "(IIIIII)V")
	public static void method508(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			method510(arg4, arg0, arg2, arg3);
			method510(arg4, arg0, arg2, arg3 + arg1 - 1);
			method512(arg0, arg3, arg4, arg1);
			method512(arg0, arg3, arg4 + arg2 - 1, arg1);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("48116, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 4 + ", " + arg4 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQHEKXXC", name = "a", descriptor = "(IIIZIII)V")
	public static void method509(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method511(arg4, arg2, arg1, arg0, arg3);
			method511(arg4 + arg5 - 1, arg2, arg1, arg0, arg3);
			if (arg5 >= 3) {
				method513(anInt730, arg5 - 2, arg1, arg4 + 1, arg2, arg3);
				method513(anInt730, arg5 - 2, arg1, arg4 + 1, arg2 + arg0 - 1, arg3);
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("33721, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQHEKXXC", name = "b", descriptor = "(IIIII)V")
	public static void method510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (anInt729 != 2) {
				aBoolean169 = !aBoolean169;
			}
			if (arg3 >= anInt736 && arg3 < anInt737) {
				if (arg0 < anInt738) {
					arg2 -= anInt738 - arg0;
					arg0 = anInt738;
				}
				if (arg0 + arg2 > anInt739) {
					arg2 = anInt739 - arg0;
				}
				@Pc(41) int local41 = arg0 + arg3 * anInt734;
				for (@Pc(43) int local43 = 0; local43 < arg2; local43++) {
					anIntArray157[local41 + local43] = arg1;
				}
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("69204, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 2 + ", " + arg3 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQHEKXXC", name = "b", descriptor = "(IIIIII)V")
	private static void method511(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt736 && arg0 < anInt737) {
				if (arg1 < anInt738) {
					arg3 -= anInt738 - arg1;
					arg1 = anInt738;
				}
				if (arg1 + arg3 > anInt739) {
					arg3 = anInt739 - arg1;
				}
				@Pc(30) int local30 = 256 - arg2;
				@Pc(38) int local38 = (arg4 >> 16 & 0xFF) * arg2;
				@Pc(46) int local46 = (arg4 >> 8 & 0xFF) * arg2;
				@Pc(52) int local52 = (arg4 & 0xFF) * arg2;
				@Pc(58) int local58 = arg1 + arg0 * anInt734;
				for (@Pc(68) int local68 = 0; local68 < arg3; local68++) {
					@Pc(80) int local80 = (anIntArray157[local58] >> 16 & 0xFF) * local30;
					@Pc(90) int local90 = (anIntArray157[local58] >> 8 & 0xFF) * local30;
					@Pc(98) int local98 = (anIntArray157[local58] & 0xFF) * local30;
					@Pc(120) int local120 = (local38 + local80 >> 8 << 16) + (local46 + local90 >> 8 << 8) + (local52 + local98 >> 8);
					anIntArray157[local58++] = local120;
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("50315, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -199 + ", " + arg4 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQHEKXXC", name = "c", descriptor = "(IIIII)V")
	public static void method512(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt738 && arg2 < anInt739) {
				if (arg1 < anInt736) {
					arg3 -= anInt736 - arg1;
					arg1 = anInt736;
				}
				if (arg1 + arg3 > anInt737) {
					arg3 = anInt737 - arg1;
				}
				@Pc(32) int local32 = arg2 + arg1 * anInt734;
				for (@Pc(39) int local39 = 0; local39 < arg3; local39++) {
					anIntArray157[local32 + local39 * anInt734] = arg0;
				}
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("36534, " + 5 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQHEKXXC", name = "c", descriptor = "(IIIIII)V")
	private static void method513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg4 >= anInt738 && arg4 < anInt739) {
				if (arg3 < anInt736) {
					arg1 -= anInt736 - arg3;
					arg3 = anInt736;
				}
				if (arg3 + arg1 > anInt737) {
					arg1 = anInt737 - arg3;
				}
				@Pc(30) int local30 = 256 - arg2;
				@Pc(38) int local38 = (arg5 >> 16 & 0xFF) * arg2;
				@Pc(46) int local46 = (arg5 >> 8 & 0xFF) * arg2;
				@Pc(52) int local52 = (arg5 & 0xFF) * arg2;
				if (arg0 == 0) {
					@Pc(61) int local61 = arg4 + arg3 * anInt734;
					for (@Pc(63) int local63 = 0; local63 < arg1; local63++) {
						@Pc(75) int local75 = (anIntArray157[local61] >> 16 & 0xFF) * local30;
						@Pc(85) int local85 = (anIntArray157[local61] >> 8 & 0xFF) * local30;
						@Pc(93) int local93 = (anIntArray157[local61] & 0xFF) * local30;
						@Pc(115) int local115 = (local38 + local75 >> 8 << 16) + (local46 + local85 >> 8 << 8) + (local52 + local93 >> 8);
						anIntArray157[local61] = local115;
						local61 += anInt734;
					}
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("38313, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQHEKXXC", name = "<init>", descriptor = "()V")
	protected Class8_Sub1_Sub1() {
	}
}
