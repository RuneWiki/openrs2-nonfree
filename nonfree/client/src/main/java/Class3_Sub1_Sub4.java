import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UKUXLUWP")
public class Class3_Sub1_Sub4 extends Class3_Sub1 {

	@OriginalMember(owner = "client!UKUXLUWP", name = "i", descriptor = "Z")
	private static boolean aBoolean168;

	@OriginalMember(owner = "client!UKUXLUWP", name = "n", descriptor = "[I")
	public static int[] anIntArray174;

	@OriginalMember(owner = "client!UKUXLUWP", name = "o", descriptor = "I")
	public static int anInt631;

	@OriginalMember(owner = "client!UKUXLUWP", name = "p", descriptor = "I")
	public static int anInt632;

	@OriginalMember(owner = "client!UKUXLUWP", name = "q", descriptor = "I")
	public static int anInt633;

	@OriginalMember(owner = "client!UKUXLUWP", name = "r", descriptor = "I")
	public static int anInt634;

	@OriginalMember(owner = "client!UKUXLUWP", name = "s", descriptor = "I")
	public static int anInt635;

	@OriginalMember(owner = "client!UKUXLUWP", name = "t", descriptor = "I")
	public static int anInt636;

	@OriginalMember(owner = "client!UKUXLUWP", name = "u", descriptor = "I")
	public static int anInt637;

	@OriginalMember(owner = "client!UKUXLUWP", name = "v", descriptor = "I")
	public static int anInt638;

	@OriginalMember(owner = "client!UKUXLUWP", name = "w", descriptor = "I")
	public static int anInt639;

	@OriginalMember(owner = "client!UKUXLUWP", name = "k", descriptor = "I")
	private static int anInt629;

	@OriginalMember(owner = "client!UKUXLUWP", name = "l", descriptor = "B")
	private static byte aByte32;

	@OriginalMember(owner = "client!UKUXLUWP", name = "m", descriptor = "I")
	private static int anInt630;

	static {
		aBoolean169 = true;
		anInt629 = 658;
		aByte32 = 2;
		anInt630 = 490;
	}

	@OriginalMember(owner = "client!UKUXLUWP", name = "a", descriptor = "(I[IBI)V")
	public static void method432(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		try {
			anIntArray174 = arg1;
			anInt631 = arg0;
			anInt632 = arg2;
			method434(0, 0, arg0, 134, arg2);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("19996, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UKUXLUWP", name = "a", descriptor = "(I)V")
	public static void method433() {
		try {
			anInt635 = 0;
			anInt633 = 0;
			anInt636 = anInt631;
			anInt634 = anInt632;
			anInt637 = anInt636 - 1;
			anInt638 = anInt636 / 2;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("59474, " + 260 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UKUXLUWP", name = "a", descriptor = "(IIIII)V")
	public static void method434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg2 > anInt631) {
				arg2 = anInt631;
			}
			if (arg4 > anInt632) {
				arg4 = anInt632;
			}
			anInt635 = arg0;
			anInt633 = arg1;
			anInt636 = arg2;
			anInt634 = arg4;
			@Pc(29) boolean local29 = false;
			anInt637 = anInt636 - 1;
			anInt638 = anInt636 / 2;
			anInt639 = anInt634 / 2;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("21219, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UKUXLUWP", name = "a", descriptor = "(B)V")
	public static void method435() {
		try {
			@Pc(5) int local5 = anInt631 * anInt632;
			for (@Pc(17) int local17 = 0; local17 < local5; local17++) {
				anIntArray174[local17] = 0;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("9765, " + -2 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UKUXLUWP", name = "a", descriptor = "(IIIIIII)V")
	public static void method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 < anInt635) {
				arg5 -= anInt635 - arg0;
				arg0 = anInt635;
			}
			if (arg1 < anInt633) {
				arg4 -= anInt633 - arg1;
				arg1 = anInt633;
			}
			if (arg0 + arg5 > anInt636) {
				arg5 = anInt636 - arg0;
			}
			if (arg1 + arg4 > anInt634) {
				arg4 = anInt634 - arg1;
			}
			@Pc(45) int local45 = 256 - arg3;
			@Pc(53) int local53 = (arg2 >> 16 & 0xFF) * arg3;
			@Pc(61) int local61 = (arg2 >> 8 & 0xFF) * arg3;
			@Pc(67) int local67 = (arg2 & 0xFF) * arg3;
			@Pc(79) int local79 = anInt631 - arg5;
			@Pc(85) int local85 = arg0 + arg1 * anInt631;
			for (@Pc(87) int local87 = 0; local87 < arg4; local87++) {
				for (@Pc(92) int local92 = -arg5; local92 < 0; local92++) {
					@Pc(104) int local104 = (anIntArray174[local85] >> 16 & 0xFF) * local45;
					@Pc(114) int local114 = (anIntArray174[local85] >> 8 & 0xFF) * local45;
					@Pc(122) int local122 = (anIntArray174[local85] & 0xFF) * local45;
					@Pc(144) int local144 = (local53 + local104 >> 8 << 16) + (local61 + local114 >> 8 << 8) + (local67 + local122 >> 8);
					anIntArray174[local85++] = local144;
				}
				local85 += local79;
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("51210, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UKUXLUWP", name = "a", descriptor = "(IIZIII)V")
	public static void method437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 < anInt635) {
				arg3 -= anInt635 - arg1;
				arg1 = anInt635;
			}
			if (arg2 < anInt633) {
				arg4 -= anInt633 - arg2;
				arg2 = anInt633;
			}
			if (arg1 + arg3 > anInt636) {
				arg3 = anInt636 - arg1;
			}
			if (arg2 + arg4 > anInt634) {
				arg4 = anInt634 - arg2;
			}
			@Pc(48) int local48 = anInt631 - arg3;
			@Pc(54) int local54 = arg1 + arg2 * anInt631;
			for (@Pc(57) int local57 = -arg4; local57 < 0; local57++) {
				for (@Pc(62) int local62 = -arg3; local62 < 0; local62++) {
					anIntArray174[local54++] = arg0;
				}
				local54 += local48;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("13403, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UKUXLUWP", name = "a", descriptor = "(IIIIII)V")
	public static void method438(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method440(arg3, arg0, arg4, arg2);
			method440(arg3, arg0 + arg1 - 1, arg4, arg2);
			method442(arg3, arg1, arg2, arg0);
			method442(arg3, arg1, arg2 + arg4 - 1, arg0);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("40989, " + 658 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UKUXLUWP", name = "a", descriptor = "(IIIIBII)V")
	public static void method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method441(arg0, arg1, arg5, arg3, arg2);
			method441(arg0 + arg4 - 1, arg1, arg5, arg3, arg2);
			if (arg4 >= 3) {
				method443(arg0 + 1, arg2, arg3, arg4 - 2, arg5);
				method443(arg0 + 1, arg2 + arg1 - 1, arg3, arg4 - 2, arg5);
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("85901, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 43 + ", " + arg4 + ", " + arg5 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UKUXLUWP", name = "b", descriptor = "(IIIII)V")
	public static void method440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 >= anInt633 && arg1 < anInt634) {
				if (arg3 < anInt635) {
					arg2 -= anInt635 - arg3;
					arg3 = anInt635;
				}
				if (arg3 + arg2 > anInt636) {
					arg2 = anInt636 - arg3;
				}
				@Pc(32) int local32 = arg3 + arg1 * anInt631;
				for (@Pc(37) int local37 = 0; local37 < arg2; local37++) {
					anIntArray174[local32 + local37] = arg0;
				}
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("1371, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UKUXLUWP", name = "b", descriptor = "(IIIIII)V")
	private static void method441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg0 >= anInt633 && arg0 < anInt634) {
				if (arg4 < anInt635) {
					arg1 -= anInt635 - arg4;
					arg4 = anInt635;
				}
				if (arg4 + arg1 > anInt636) {
					arg1 = anInt636 - arg4;
				}
				@Pc(33) int local33 = 256 - arg3;
				@Pc(41) int local41 = (arg2 >> 16 & 0xFF) * arg3;
				@Pc(49) int local49 = (arg2 >> 8 & 0xFF) * arg3;
				@Pc(55) int local55 = (arg2 & 0xFF) * arg3;
				@Pc(61) int local61 = arg4 + arg0 * anInt631;
				for (@Pc(63) int local63 = 0; local63 < arg1; local63++) {
					@Pc(75) int local75 = (anIntArray174[local61] >> 16 & 0xFF) * local33;
					@Pc(85) int local85 = (anIntArray174[local61] >> 8 & 0xFF) * local33;
					@Pc(93) int local93 = (anIntArray174[local61] & 0xFF) * local33;
					@Pc(115) int local115 = (local41 + local75 >> 8 << 16) + (local49 + local85 >> 8 << 8) + (local55 + local93 >> 8);
					anIntArray174[local61++] = local115;
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("59340, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UKUXLUWP", name = "c", descriptor = "(IIIII)V")
	public static void method442(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt635 && arg2 < anInt636) {
				if (arg3 < anInt633) {
					arg1 -= anInt633 - arg3;
					arg3 = anInt633;
				}
				if (arg3 + arg1 > anInt634) {
					arg1 = anInt634 - arg3;
				}
				@Pc(44) int local44 = arg2 + arg3 * anInt631;
				for (@Pc(46) int local46 = 0; local46 < arg1; local46++) {
					anIntArray174[local44 + local46 * anInt631] = arg0;
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("8579, " + arg0 + ", " + -663 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UKUXLUWP", name = "a", descriptor = "(IIIIZI)V")
	private static void method443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 >= anInt635 && arg1 < anInt636) {
				if (arg0 < anInt633) {
					arg3 -= anInt633 - arg0;
					arg0 = anInt633;
				}
				if (arg0 + arg3 > anInt634) {
					arg3 = anInt634 - arg0;
				}
				@Pc(30) int local30 = 256 - arg2;
				@Pc(38) int local38 = (arg4 >> 16 & 0xFF) * arg2;
				@Pc(46) int local46 = (arg4 >> 8 & 0xFF) * arg2;
				@Pc(52) int local52 = (arg4 & 0xFF) * arg2;
				@Pc(61) int local61 = arg1 + arg0 * anInt631;
				for (@Pc(63) int local63 = 0; local63 < arg3; local63++) {
					@Pc(75) int local75 = (anIntArray174[local61] >> 16 & 0xFF) * local30;
					@Pc(85) int local85 = (anIntArray174[local61] >> 8 & 0xFF) * local30;
					@Pc(93) int local93 = (anIntArray174[local61] & 0xFF) * local30;
					@Pc(115) int local115 = (local38 + local75 >> 8 << 16) + (local46 + local85 >> 8 << 8) + (local52 + local93 >> 8);
					anIntArray174[local61] = local115;
					local61 += anInt631;
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("89477, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UKUXLUWP", name = "<init>", descriptor = "()V")
	protected Class3_Sub1_Sub4() {
	}
}
