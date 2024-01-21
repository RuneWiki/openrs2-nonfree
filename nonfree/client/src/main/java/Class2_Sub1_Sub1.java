import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ANTOHTCU")
public class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ANTOHTCU", name = "m", descriptor = "Z")
	private static boolean aBoolean206;

	@OriginalMember(owner = "client!ANTOHTCU", name = "n", descriptor = "[I")
	public static int[] anIntArray172;

	@OriginalMember(owner = "client!ANTOHTCU", name = "o", descriptor = "I")
	public static int anInt637;

	@OriginalMember(owner = "client!ANTOHTCU", name = "p", descriptor = "I")
	public static int anInt638;

	@OriginalMember(owner = "client!ANTOHTCU", name = "q", descriptor = "I")
	public static int anInt639;

	@OriginalMember(owner = "client!ANTOHTCU", name = "r", descriptor = "I")
	public static int anInt640;

	@OriginalMember(owner = "client!ANTOHTCU", name = "s", descriptor = "I")
	public static int anInt641;

	@OriginalMember(owner = "client!ANTOHTCU", name = "t", descriptor = "I")
	public static int anInt642;

	@OriginalMember(owner = "client!ANTOHTCU", name = "u", descriptor = "I")
	public static int anInt643;

	@OriginalMember(owner = "client!ANTOHTCU", name = "v", descriptor = "I")
	public static int anInt644;

	@OriginalMember(owner = "client!ANTOHTCU", name = "w", descriptor = "I")
	public static int anInt645;

	@OriginalMember(owner = "client!ANTOHTCU", name = "j", descriptor = "Z")
	private static boolean aBoolean205 = true;

	@OriginalMember(owner = "client!ANTOHTCU", name = "k", descriptor = "I")
	private static int anInt635 = -899;

	@OriginalMember(owner = "client!ANTOHTCU", name = "l", descriptor = "I")
	private static int anInt636 = -15334;

	@OriginalMember(owner = "client!ANTOHTCU", name = "a", descriptor = "(II[IZ)V")
	public static void method431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		try {
			anIntArray172 = arg2;
			anInt637 = arg0;
			anInt638 = arg1;
			method433(arg0, 0, arg1, 0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("24970, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ANTOHTCU", name = "a", descriptor = "(I)V")
	public static void method432() {
		try {
			anInt641 = 0;
			anInt639 = 0;
			anInt642 = anInt637;
			if (anInt636 != -15334) {
				aBoolean205 = !aBoolean205;
			}
			anInt640 = anInt638;
			anInt643 = anInt642 - 1;
			anInt644 = anInt642 / 2;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("94362, " + -15334 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ANTOHTCU", name = "a", descriptor = "(IIIII)V")
	public static void method433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg0 > anInt637) {
				arg0 = anInt637;
			}
			if (arg2 > anInt638) {
				arg2 = anInt638;
			}
			anInt641 = arg3;
			anInt639 = arg1;
			anInt642 = arg0;
			anInt640 = arg2;
			anInt643 = anInt642 - 1;
			anInt644 = anInt642 / 2;
			anInt645 = anInt640 / 2;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("12016, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 357 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ANTOHTCU", name = "a", descriptor = "(Z)V")
	public static void method434() {
		try {
			@Pc(6) int local6 = anInt637 * anInt638;
			for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
				anIntArray172[local8] = 0;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("5046, " + true + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ANTOHTCU", name = "a", descriptor = "(IIIIZII)V")
	public static void method435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 < anInt641) {
				arg2 -= anInt641 - arg0;
				arg0 = anInt641;
			}
			if (arg5 < anInt639) {
				arg3 -= anInt639 - arg5;
				arg5 = anInt639;
			}
			if (arg0 + arg2 > anInt642) {
				arg2 = anInt642 - arg0;
			}
			if (arg5 + arg3 > anInt640) {
				arg3 = anInt640 - arg5;
			}
			@Pc(45) int local45 = 256 - arg1;
			@Pc(53) int local53 = (arg4 >> 16 & 0xFF) * arg1;
			@Pc(61) int local61 = (arg4 >> 8 & 0xFF) * arg1;
			@Pc(67) int local67 = (arg4 & 0xFF) * arg1;
			@Pc(75) int local75 = anInt637 - arg2;
			@Pc(81) int local81 = arg0 + arg5 * anInt637;
			for (@Pc(83) int local83 = 0; local83 < arg3; local83++) {
				for (@Pc(88) int local88 = -arg2; local88 < 0; local88++) {
					@Pc(100) int local100 = (anIntArray172[local81] >> 16 & 0xFF) * local45;
					@Pc(110) int local110 = (anIntArray172[local81] >> 8 & 0xFF) * local45;
					@Pc(118) int local118 = (anIntArray172[local81] & 0xFF) * local45;
					@Pc(140) int local140 = (local53 + local100 >> 8 << 16) + (local61 + local110 >> 8 << 8) + (local67 + local118 >> 8);
					anIntArray172[local81++] = local140;
				}
				local81 += local75;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("22995, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ANTOHTCU", name = "a", descriptor = "(IIIIII)V")
	public static void method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg0 < anInt641) {
				arg4 -= anInt641 - arg0;
				arg0 = anInt641;
			}
			if (arg1 < anInt639) {
				arg5 -= anInt639 - arg1;
				arg1 = anInt639;
			}
			if (arg0 + arg4 > anInt642) {
				arg4 = anInt642 - arg0;
			}
			if (arg1 + arg5 > anInt640) {
				arg5 = anInt640 - arg1;
			}
			@Pc(45) int local45 = anInt637 - arg4;
			if (arg2 != -6771) {
				anInt636 = 351;
			}
			@Pc(56) int local56 = arg0 + arg1 * anInt637;
			for (@Pc(59) int local59 = -arg5; local59 < 0; local59++) {
				for (@Pc(64) int local64 = -arg4; local64 < 0; local64++) {
					anIntArray172[local56++] = arg3;
				}
				local56 += local45;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("38891, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ANTOHTCU", name = "b", descriptor = "(IIIIII)V")
	public static void method437(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method439(arg0, 129, arg4, arg1, arg2);
			method439(arg0, 129, arg4 + arg3 - 1, arg1, arg2);
			method441(485, arg2, arg3, arg0, arg4);
			method441(485, arg2, arg3, arg0 + arg1 - 1, arg4);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("4204, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ANTOHTCU", name = "a", descriptor = "(ZIIIIII)V")
	public static void method438(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method440(arg2, arg4, arg5, arg3, arg0);
			method440(arg2, arg4, arg5 + arg1 - 1, arg3, arg0);
			if (arg1 >= 3) {
				method442(arg5 + 1, arg0, arg4, arg1 - 2, arg2);
				method442(arg5 + 1, arg0 + arg3 - 1, arg4, arg1 - 2, arg2);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("62249, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ANTOHTCU", name = "b", descriptor = "(IIIII)V")
	public static void method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg2 >= anInt639 && arg2 < anInt640) {
				if (arg0 < anInt641) {
					arg3 -= anInt641 - arg0;
					arg0 = anInt641;
				}
				if (arg0 + arg3 > anInt642) {
					arg3 = anInt642 - arg0;
				}
				@Pc(36) int local36 = arg0 + arg2 * anInt637;
				for (@Pc(38) int local38 = 0; local38 < arg3; local38++) {
					anIntArray172[local36 + local38] = arg4;
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("18121, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ANTOHTCU", name = "a", descriptor = "(IIZIII)V")
	private static void method440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 >= anInt639 && arg2 < anInt640) {
				if (arg4 < anInt641) {
					arg3 -= anInt641 - arg4;
					arg4 = anInt641;
				}
				if (arg4 + arg3 > anInt642) {
					arg3 = anInt642 - arg4;
				}
				@Pc(30) int local30 = 256 - arg0;
				@Pc(38) int local38 = (arg1 >> 16 & 0xFF) * arg0;
				@Pc(46) int local46 = (arg1 >> 8 & 0xFF) * arg0;
				@Pc(52) int local52 = (arg1 & 0xFF) * arg0;
				@Pc(62) int local62 = arg4 + arg2 * anInt637;
				for (@Pc(64) int local64 = 0; local64 < arg3; local64++) {
					@Pc(76) int local76 = (anIntArray172[local62] >> 16 & 0xFF) * local30;
					@Pc(86) int local86 = (anIntArray172[local62] >> 8 & 0xFF) * local30;
					@Pc(94) int local94 = (anIntArray172[local62] & 0xFF) * local30;
					@Pc(116) int local116 = (local38 + local76 >> 8 << 16) + (local46 + local86 >> 8 << 8) + (local52 + local94 >> 8);
					anIntArray172[local62++] = local116;
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("94379, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ANTOHTCU", name = "c", descriptor = "(IIIII)V")
	public static void method441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3 >= anInt641 && arg3 < anInt642) {
				if (arg4 < anInt639) {
					arg2 -= anInt639 - arg4;
					arg4 = anInt639;
				}
				if (arg4 + arg2 > anInt640) {
					arg2 = anInt640 - arg4;
				}
				@Pc(32) int local32 = arg3 + arg4 * anInt637;
				@Pc(36) boolean local36 = false;
				for (@Pc(38) int local38 = 0; local38 < arg2; local38++) {
					anIntArray172[local32 + local38 * anInt637] = arg1;
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("97337, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ANTOHTCU", name = "c", descriptor = "(IIIIII)V")
	private static void method442(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 >= anInt641 && arg1 < anInt642) {
				if (arg0 < anInt639) {
					arg3 -= anInt639 - arg0;
					arg0 = anInt639;
				}
				if (arg0 + arg3 > anInt640) {
					arg3 = anInt640 - arg0;
				}
				@Pc(30) int local30 = 256 - arg4;
				@Pc(38) int local38 = (arg2 >> 16 & 0xFF) * arg4;
				@Pc(46) int local46 = (arg2 >> 8 & 0xFF) * arg4;
				@Pc(52) int local52 = (arg2 & 0xFF) * arg4;
				@Pc(63) int local63 = arg1 + arg0 * anInt637;
				for (@Pc(65) int local65 = 0; local65 < arg3; local65++) {
					@Pc(77) int local77 = (anIntArray172[local63] >> 16 & 0xFF) * local30;
					@Pc(87) int local87 = (anIntArray172[local63] >> 8 & 0xFF) * local30;
					@Pc(95) int local95 = (anIntArray172[local63] & 0xFF) * local30;
					@Pc(117) int local117 = (local38 + local77 >> 8 << 16) + (local46 + local87 >> 8 << 8) + (local52 + local95 >> 8);
					anIntArray172[local63] = local117;
					local63 += anInt637;
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("59238, " + 30853 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ANTOHTCU", name = "<init>", descriptor = "()V")
	protected Class2_Sub1_Sub1() {
	}
}
