import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NBXZFIDS")
public class Class6_Sub1_Sub3 extends Class6_Sub1 {

	@OriginalMember(owner = "client!NBXZFIDS", name = "h", descriptor = "Z")
	private static boolean aBoolean190;

	@OriginalMember(owner = "client!NBXZFIDS", name = "o", descriptor = "[I")
	public static int[] anIntArray204;

	@OriginalMember(owner = "client!NBXZFIDS", name = "p", descriptor = "I")
	public static int anInt785;

	@OriginalMember(owner = "client!NBXZFIDS", name = "q", descriptor = "I")
	public static int anInt786;

	@OriginalMember(owner = "client!NBXZFIDS", name = "r", descriptor = "I")
	public static int anInt787;

	@OriginalMember(owner = "client!NBXZFIDS", name = "s", descriptor = "I")
	public static int anInt788;

	@OriginalMember(owner = "client!NBXZFIDS", name = "t", descriptor = "I")
	public static int anInt789;

	@OriginalMember(owner = "client!NBXZFIDS", name = "u", descriptor = "I")
	public static int anInt790;

	@OriginalMember(owner = "client!NBXZFIDS", name = "v", descriptor = "I")
	public static int anInt791;

	@OriginalMember(owner = "client!NBXZFIDS", name = "w", descriptor = "I")
	public static int anInt792;

	@OriginalMember(owner = "client!NBXZFIDS", name = "x", descriptor = "I")
	public static int anInt793;

	@OriginalMember(owner = "client!NBXZFIDS", name = "i", descriptor = "Z")
	private static boolean aBoolean191 = true;

	@OriginalMember(owner = "client!NBXZFIDS", name = "j", descriptor = "B")
	private static byte aByte56 = 79;

	@OriginalMember(owner = "client!NBXZFIDS", name = "k", descriptor = "I")
	private static int anInt782 = 16067;

	@OriginalMember(owner = "client!NBXZFIDS", name = "l", descriptor = "Z")
	private static boolean aBoolean192 = true;

	@OriginalMember(owner = "client!NBXZFIDS", name = "m", descriptor = "I")
	private static int anInt783 = 5;

	@OriginalMember(owner = "client!NBXZFIDS", name = "n", descriptor = "I")
	private static int anInt784 = -578;

	@OriginalMember(owner = "client!NBXZFIDS", name = "a", descriptor = "(II[IZ)V")
	public static void method544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		try {
			anIntArray204 = arg2;
			anInt785 = arg1;
			anInt786 = arg0;
			method546(0, arg0, 0, arg1);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("56355, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBXZFIDS", name = "a", descriptor = "(Z)V")
	public static void method545() {
		try {
			anInt789 = 0;
			anInt787 = 0;
			anInt790 = anInt785;
			anInt788 = anInt786;
			anInt791 = anInt790 - 1;
			anInt792 = anInt790 / 2;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("81877, " + true + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBXZFIDS", name = "a", descriptor = "(IIIII)V")
	public static void method546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg3 > anInt785) {
				arg3 = anInt785;
			}
			if (arg1 > anInt786) {
				arg1 = anInt786;
			}
			anInt789 = arg0;
			anInt787 = arg2;
			anInt790 = arg3;
			anInt788 = arg1;
			anInt791 = anInt790 - 1;
			anInt792 = anInt790 / 2;
			anInt793 = anInt788 / 2;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("3446, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -586 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBXZFIDS", name = "a", descriptor = "(I)V")
	public static void method547() {
		try {
			@Pc(12) int local12 = anInt785 * anInt786;
			for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
				anIntArray204[local14] = 0;
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("47740, " + 5 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBXZFIDS", name = "a", descriptor = "(IIZIIII)V")
	public static void method548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 < anInt789) {
				arg5 -= anInt789 - arg1;
				arg1 = anInt789;
			}
			if (arg4 < anInt787) {
				arg2 -= anInt787 - arg4;
				arg4 = anInt787;
			}
			if (arg1 + arg5 > anInt790) {
				arg5 = anInt790 - arg1;
			}
			if (arg4 + arg2 > anInt788) {
				arg2 = anInt788 - arg4;
			}
			@Pc(45) int local45 = 256 - arg0;
			@Pc(53) int local53 = (arg3 >> 16 & 0xFF) * arg0;
			@Pc(61) int local61 = (arg3 >> 8 & 0xFF) * arg0;
			@Pc(67) int local67 = (arg3 & 0xFF) * arg0;
			@Pc(74) int local74 = anInt785 - arg5;
			@Pc(80) int local80 = arg1 + arg4 * anInt785;
			for (@Pc(82) int local82 = 0; local82 < arg2; local82++) {
				for (@Pc(87) int local87 = -arg5; local87 < 0; local87++) {
					@Pc(99) int local99 = (anIntArray204[local80] >> 16 & 0xFF) * local45;
					@Pc(109) int local109 = (anIntArray204[local80] >> 8 & 0xFF) * local45;
					@Pc(117) int local117 = (anIntArray204[local80] & 0xFF) * local45;
					@Pc(139) int local139 = (local53 + local99 >> 8 << 16) + (local61 + local109 >> 8 << 8) + (local67 + local117 >> 8);
					anIntArray204[local80++] = local139;
				}
				local80 += local74;
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("25918, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBXZFIDS", name = "a", descriptor = "(IIIIII)V")
	public static void method549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 < anInt789) {
				arg1 -= anInt789 - arg0;
				arg0 = anInt789;
			}
			if (arg2 < anInt787) {
				arg4 -= anInt787 - arg2;
				arg2 = anInt787;
			}
			if (arg0 + arg1 > anInt790) {
				arg1 = anInt790 - arg0;
			}
			if (arg2 + arg4 > anInt788) {
				arg4 = anInt788 - arg2;
			}
			@Pc(45) int local45 = anInt785 - arg1;
			@Pc(55) int local55 = arg0 + arg2 * anInt785;
			for (@Pc(58) int local58 = -arg4; local58 < 0; local58++) {
				for (@Pc(63) int local63 = -arg1; local63 < 0; local63++) {
					anIntArray204[local55++] = arg3;
				}
				local55 += local45;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("56795, " + arg0 + ", " + arg1 + ", " + 42613 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBXZFIDS", name = "a", descriptor = "(IIIIIB)V")
	public static void method550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		try {
			method552(arg2, arg3, arg1, arg4);
			@Pc(10) boolean local10 = false;
			method552(arg2, arg3 + arg0 - 1, arg1, arg4);
			method554(arg4, arg0, arg3, arg2);
			method554(arg4, arg0, arg3, arg2 + arg1 - 1);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("52182, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBXZFIDS", name = "a", descriptor = "(IIIIIII)V")
	public static void method551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method553(arg4, arg1, arg5, arg3, arg0);
			method553(arg4, arg1, arg5 + arg2 - 1, arg3, arg0);
			if (arg2 >= 3) {
				method555(arg5 + 1, arg1, arg3, arg2 - 2, arg0);
				method555(arg5 + 1, arg1, arg3 + arg4 - 1, arg2 - 2, arg0);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("90141, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBXZFIDS", name = "b", descriptor = "(IIIII)V")
	public static void method552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 >= anInt787 && arg1 < anInt788) {
				if (arg0 < anInt789) {
					arg2 -= anInt789 - arg0;
					arg0 = anInt789;
				}
				if (arg0 + arg2 > anInt790) {
					arg2 = anInt790 - arg0;
				}
				@Pc(32) int local32 = arg0 + arg1 * anInt785;
				for (@Pc(42) int local42 = 0; local42 < arg2; local42++) {
					anIntArray204[local32 + local42] = arg3;
				}
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("31576, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBXZFIDS", name = "b", descriptor = "(IIIIII)V")
	private static void method553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 >= anInt787 && arg2 < anInt788) {
				if (arg3 < anInt789) {
					arg0 -= anInt789 - arg3;
					arg3 = anInt789;
				}
				if (arg3 + arg0 > anInt790) {
					arg0 = anInt790 - arg3;
				}
				@Pc(30) int local30 = 256 - arg1;
				@Pc(47) int local47 = (arg4 >> 16 & 0xFF) * arg1;
				@Pc(55) int local55 = (arg4 >> 8 & 0xFF) * arg1;
				@Pc(61) int local61 = (arg4 & 0xFF) * arg1;
				@Pc(67) int local67 = arg3 + arg2 * anInt785;
				for (@Pc(69) int local69 = 0; local69 < arg0; local69++) {
					@Pc(81) int local81 = (anIntArray204[local67] >> 16 & 0xFF) * local30;
					@Pc(91) int local91 = (anIntArray204[local67] >> 8 & 0xFF) * local30;
					@Pc(99) int local99 = (anIntArray204[local67] & 0xFF) * local30;
					@Pc(121) int local121 = (local47 + local81 >> 8 << 16) + (local55 + local91 >> 8 << 8) + (local61 + local99 >> 8);
					anIntArray204[local67++] = local121;
				}
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("8839, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 3466 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBXZFIDS", name = "a", descriptor = "(IIBII)V")
	public static void method554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 >= anInt789 && arg3 < anInt790) {
				if (arg2 < anInt787) {
					arg1 -= anInt787 - arg2;
					arg2 = anInt787;
				}
				if (arg2 + arg1 > anInt788) {
					arg1 = anInt788 - arg2;
				}
				@Pc(32) int local32 = arg3 + arg2 * anInt785;
				if (79 == aByte56) {
					for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
						anIntArray204[local32 + local38 * anInt785] = arg0;
					}
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("33977, " + arg0 + ", " + arg1 + ", " + 79 + ", " + arg2 + ", " + arg3 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBXZFIDS", name = "a", descriptor = "(IBIIII)V")
	private static void method555(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 >= anInt789 && arg2 < anInt790) {
				if (arg0 < anInt787) {
					arg3 -= anInt787 - arg0;
					arg0 = anInt787;
				}
				if (arg0 + arg3 > anInt788) {
					arg3 = anInt788 - arg0;
				}
				@Pc(39) int local39 = 256 - arg1;
				@Pc(47) int local47 = (arg4 >> 16 & 0xFF) * arg1;
				@Pc(55) int local55 = (arg4 >> 8 & 0xFF) * arg1;
				@Pc(61) int local61 = (arg4 & 0xFF) * arg1;
				@Pc(67) int local67 = arg2 + arg0 * anInt785;
				for (@Pc(69) int local69 = 0; local69 < arg3; local69++) {
					@Pc(81) int local81 = (anIntArray204[local67] >> 16 & 0xFF) * local39;
					@Pc(91) int local91 = (anIntArray204[local67] >> 8 & 0xFF) * local39;
					@Pc(99) int local99 = (anIntArray204[local67] & 0xFF) * local39;
					@Pc(121) int local121 = (local47 + local81 >> 8 << 16) + (local55 + local91 >> 8 << 8) + (local61 + local99 >> 8);
					anIntArray204[local67] = local121;
					local67 += anInt785;
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("35405, " + arg0 + ", " + -85 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NBXZFIDS", name = "<init>", descriptor = "()V")
	protected Class6_Sub1_Sub3() {
	}
}
