import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gb")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
	private static int anInt720;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "[I")
	public static int[] anIntArray218;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
	public static int anInt721;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
	public static int anInt722;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	public static int anInt723;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public static int anInt724;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public static int anInt725;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	public static int anInt726;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public static int anInt727;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public static int anInt728;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	public static int anInt729;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	private static int anInt719 = -3052;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "Z")
	private static boolean aBoolean172 = true;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[III)V")
	public static void method457(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			anIntArray218 = arg1;
			anInt721 = arg2;
			anInt722 = arg3;
			if (arg0 < 0) {
				method459(arg3, 0, 0, arg2);
			}
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("19998, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	public static void method458() {
		try {
			anInt725 = 0;
			anInt723 = 0;
			anInt726 = anInt721;
			anInt724 = anInt722;
			anInt727 = anInt726 - 1;
			anInt728 = anInt726 / 2;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("57575, " + 0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
	public static void method459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg3 > anInt721) {
				arg3 = anInt721;
			}
			if (arg0 > anInt722) {
				arg0 = anInt722;
			}
			anInt725 = arg2;
			anInt723 = arg1;
			anInt726 = arg3;
			anInt724 = arg0;
			anInt727 = anInt726 - 1;
			anInt728 = anInt726 / 2;
			anInt729 = anInt724 / 2;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("55652, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	public static void method460(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 54 / arg0;
			@Pc(7) int local7 = anInt721 * anInt722;
			for (@Pc(9) int local9 = 0; local9 < local7; local9++) {
				anIntArray218[local9] = 0;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("15184, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIII)V")
	public static void method461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 < anInt725) {
				arg4 -= anInt725 - arg2;
				arg2 = anInt725;
			}
			if (arg5 < anInt723) {
				arg3 -= anInt723 - arg5;
				arg5 = anInt723;
			}
			if (arg2 + arg4 > anInt726) {
				arg4 = anInt726 - arg2;
			}
			if (arg5 + arg3 > anInt724) {
				arg3 = anInt724 - arg5;
			}
			@Pc(45) int local45 = 256 - arg0;
			@Pc(53) int local53 = (arg1 >> 16 & 0xFF) * arg0;
			@Pc(61) int local61 = (arg1 >> 8 & 0xFF) * arg0;
			@Pc(67) int local67 = (arg1 & 0xFF) * arg0;
			@Pc(74) int local74 = anInt721 - arg4;
			@Pc(80) int local80 = arg2 + arg5 * anInt721;
			for (@Pc(82) int local82 = 0; local82 < arg3; local82++) {
				for (@Pc(87) int local87 = -arg4; local87 < 0; local87++) {
					@Pc(99) int local99 = (anIntArray218[local80] >> 16 & 0xFF) * local45;
					@Pc(109) int local109 = (anIntArray218[local80] >> 8 & 0xFF) * local45;
					@Pc(117) int local117 = (anIntArray218[local80] & 0xFF) * local45;
					@Pc(139) int local139 = (local53 + local99 >> 8 << 16) + (local61 + local109 >> 8 << 8) + (local67 + local117 >> 8);
					anIntArray218[local80++] = local139;
				}
				local80 += local74;
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("63112, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII)V")
	public static void method462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg4 < anInt725) {
				arg0 -= anInt725 - arg4;
				arg4 = anInt725;
			}
			if (arg2 < anInt723) {
				arg3 -= anInt723 - arg2;
				arg2 = anInt723;
			}
			if (arg4 + arg0 > anInt726) {
				arg0 = anInt726 - arg4;
			}
			if (arg2 + arg3 > anInt724) {
				arg3 = anInt724 - arg2;
			}
			@Pc(45) int local45 = anInt721 - arg0;
			@Pc(56) int local56 = arg4 + arg2 * anInt721;
			for (@Pc(59) int local59 = -arg3; local59 < 0; local59++) {
				for (@Pc(64) int local64 = -arg0; local64 < 0; local64++) {
					anIntArray218[local56++] = arg1;
				}
				local56 += local45;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("19828, " + arg0 + ", " + arg1 + ", " + 47458 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIIII)V")
	public static void method463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method465(arg4, arg1, arg0, arg3, (byte) 2);
			method465(arg4, arg1, arg0, arg3 + arg2 - 1, (byte) 2);
			method467(arg3, arg0, arg4, arg2);
			method467(arg3, arg0 + arg1 - 1, arg4, arg2);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("55477, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZIIIII)V")
	public static void method464(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method466(arg1, arg2, arg4, arg0, arg5);
			method466(arg1 + arg3 - 1, arg2, arg4, arg0, arg5);
			if (arg3 >= 3) {
				method468(arg4, arg3 - 2, arg1 + 1, arg5, arg0);
				method468(arg4, arg3 - 2, arg1 + 1, arg5 + arg2 - 1, arg0);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("60604, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIB)V")
	public static void method465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		try {
			if (arg3 >= anInt723 && arg3 < anInt724) {
				if (arg2 < anInt725) {
					arg1 -= anInt725 - arg2;
					arg2 = anInt725;
				}
				if (arg2 + arg1 > anInt726) {
					arg1 = anInt726 - arg2;
				}
				@Pc(34) int local34 = arg2 + arg3 * anInt721;
				@Pc(39) boolean local39 = false;
				for (@Pc(50) int local50 = 0; local50 < arg1; local50++) {
					anIntArray218[local34 + local50] = arg0;
				}
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("83529, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(IIIIII)V")
	private static void method466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt723 && arg0 < anInt724) {
				if (arg4 < anInt725) {
					arg1 -= anInt725 - arg4;
					arg4 = anInt725;
				}
				if (arg4 + arg1 > anInt726) {
					arg1 = anInt726 - arg4;
				}
				@Pc(30) int local30 = 256 - arg2;
				@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg2;
				@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg2;
				@Pc(52) int local52 = (arg3 & 0xFF) * arg2;
				@Pc(58) int local58 = arg4 + arg0 * anInt721;
				for (@Pc(60) int local60 = 0; local60 < arg1; local60++) {
					@Pc(72) int local72 = (anIntArray218[local58] >> 16 & 0xFF) * local30;
					@Pc(82) int local82 = (anIntArray218[local58] >> 8 & 0xFF) * local30;
					@Pc(90) int local90 = (anIntArray218[local58] & 0xFF) * local30;
					@Pc(112) int local112 = (local38 + local72 >> 8 << 16) + (local46 + local82 >> 8 << 8) + (local52 + local90 >> 8);
					anIntArray218[local58++] = local112;
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("88852, " + arg0 + ", " + arg1 + ", " + -46513 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIZ)V")
	public static void method467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 >= anInt725 && arg1 < anInt726) {
				if (arg0 < anInt723) {
					arg3 -= anInt723 - arg0;
					arg0 = anInt723;
				}
				if (arg0 + arg3 > anInt724) {
					arg3 = anInt724 - arg0;
				}
				@Pc(43) int local43 = arg1 + arg0 * anInt721;
				for (@Pc(45) int local45 = 0; local45 < arg3; local45++) {
					anIntArray218[local43 + local45 * anInt721] = arg2;
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("34433, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(IIIIII)V")
	private static void method468(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 >= anInt725 && arg3 < anInt726) {
				if (arg2 < anInt723) {
					arg1 -= anInt723 - arg2;
					arg2 = anInt723;
				}
				if (arg2 + arg1 > anInt724) {
					arg1 = anInt724 - arg2;
				}
				@Pc(30) int local30 = 256 - arg0;
				@Pc(38) int local38 = (arg4 >> 16 & 0xFF) * arg0;
				@Pc(46) int local46 = (arg4 >> 8 & 0xFF) * arg0;
				@Pc(52) int local52 = (arg4 & 0xFF) * arg0;
				@Pc(61) int local61 = arg3 + arg2 * anInt721;
				for (@Pc(63) int local63 = 0; local63 < arg1; local63++) {
					@Pc(75) int local75 = (anIntArray218[local61] >> 16 & 0xFF) * local30;
					@Pc(85) int local85 = (anIntArray218[local61] >> 8 & 0xFF) * local30;
					@Pc(93) int local93 = (anIntArray218[local61] & 0xFF) * local30;
					@Pc(115) int local115 = (local38 + local75 >> 8 << 16) + (local46 + local85 >> 8 << 8) + (local52 + local93 >> 8);
					anIntArray218[local61] = local115;
					local61 += anInt721;
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("56991, " + -465 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}
}
