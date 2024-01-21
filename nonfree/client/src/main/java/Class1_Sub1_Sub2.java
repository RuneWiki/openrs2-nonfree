import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gb")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "Z")
	private static boolean aBoolean184;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "[I")
	public static int[] anIntArray212;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public static int anInt688;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public static int anInt689;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	public static int anInt690;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public static int anInt691;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public static int anInt692;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	public static int anInt693;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
	public static int anInt694;

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
	public static int anInt695;

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
	public static int anInt696;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	private static int anInt686 = 1623;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "Z")
	private static boolean aBoolean185 = true;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "B")
	private static byte aByte41 = 8;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
	private static int anInt687 = 1;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "B")
	private static byte aByte42 = 35;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[III)V")
	public static void method431(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			anIntArray212 = arg0;
			anInt688 = arg1;
			anInt689 = arg2;
			method433(aByte41, arg2, arg1, 0, 0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("83567, " + -78 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	public static void method432() {
		try {
			anInt692 = 0;
			anInt690 = 0;
			anInt693 = anInt688;
			anInt691 = anInt689;
			anInt694 = anInt693 - 1;
			anInt695 = anInt693 / 2;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("75622, " + -92 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BIIII)V")
	public static void method433(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg4 < 0) {
				arg4 = 0;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg2 > anInt688) {
				arg2 = anInt688;
			}
			if (arg1 > anInt689) {
				arg1 = anInt689;
			}
			anInt692 = arg4;
			anInt690 = arg3;
			if (arg0 == 8) {
				@Pc(26) boolean local26 = false;
				anInt693 = arg2;
				anInt691 = arg1;
				anInt694 = anInt693 - 1;
				anInt695 = anInt693 / 2;
				anInt696 = anInt691 / 2;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("52567, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
	public static void method434() {
		try {
			@Pc(7) int local7 = anInt688 * anInt689;
			for (@Pc(9) int local9 = 0; local9 < local7; local9++) {
				anIntArray212[local9] = 0;
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("10068, " + 127 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg5 < anInt692) {
				arg4 -= anInt692 - arg5;
				arg5 = anInt692;
			}
			if (arg0 < anInt690) {
				arg1 -= anInt690 - arg0;
				arg0 = anInt690;
			}
			if (arg5 + arg4 > anInt693) {
				arg4 = anInt693 - arg5;
			}
			if (arg0 + arg1 > anInt691) {
				arg1 = anInt691 - arg0;
			}
			@Pc(45) int local45 = 256 - arg2;
			@Pc(53) int local53 = (arg3 >> 16 & 0xFF) * arg2;
			@Pc(61) int local61 = (arg3 >> 8 & 0xFF) * arg2;
			@Pc(67) int local67 = (arg3 & 0xFF) * arg2;
			@Pc(75) int local75 = anInt688 - arg4;
			@Pc(81) int local81 = arg5 + arg0 * anInt688;
			for (@Pc(83) int local83 = 0; local83 < arg1; local83++) {
				for (@Pc(88) int local88 = -arg4; local88 < 0; local88++) {
					@Pc(100) int local100 = (anIntArray212[local81] >> 16 & 0xFF) * local45;
					@Pc(110) int local110 = (anIntArray212[local81] >> 8 & 0xFF) * local45;
					@Pc(118) int local118 = (anIntArray212[local81] & 0xFF) * local45;
					@Pc(140) int local140 = (local53 + local100 >> 8 << 16) + (local61 + local110 >> 8 << 8) + (local67 + local118 >> 8);
					anIntArray212[local81++] = local140;
				}
				local81 += local75;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("68601, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII)V")
	public static void method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg4 < anInt692) {
				arg5 -= anInt692 - arg4;
				arg4 = anInt692;
			}
			if (arg2 < anInt690) {
				arg3 -= anInt690 - arg2;
				arg2 = anInt690;
			}
			if (arg4 + arg5 > anInt693) {
				arg5 = anInt693 - arg4;
			}
			if (arg2 + arg3 > anInt691) {
				arg3 = anInt691 - arg2;
			}
			@Pc(45) int local45 = anInt688 - arg5;
			@Pc(49) boolean local49 = false;
			@Pc(55) int local55 = arg4 + arg2 * anInt688;
			for (@Pc(58) int local58 = -arg3; local58 < 0; local58++) {
				for (@Pc(63) int local63 = -arg5; local63 < 0; local63++) {
					anIntArray212[local55++] = arg0;
				}
				local55 += local45;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("43392, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIIII)V")
	public static void method437(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method439(arg1, arg0, arg2, arg3);
			method439(arg1, arg0, arg2, arg3 + arg4 - 1);
			method441(arg3, arg0, arg2, arg4);
			if (anInt687 > 1 || anInt687 < 1) {
				aBoolean184 = !aBoolean184;
			}
			method441(arg3, arg0 + arg1 - 1, arg2, arg4);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("9711, " + 1 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIII)V")
	public static void method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			method440(arg2, arg1, arg4, arg5, arg3);
			method440(arg2, arg1, arg4, arg5 + arg0 - 1, arg3);
			if (arg0 >= 3) {
				method442(arg0 - 2, arg1, arg5 + 1, arg4, 454, arg2);
				method442(arg0 - 2, arg1, arg5 + 1, arg4, 454, arg2 + arg3 - 1);
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("90957, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIZI)V")
	public static void method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 >= anInt690 && arg3 < anInt691) {
				if (arg1 < anInt692) {
					arg0 -= anInt692 - arg1;
					arg1 = anInt692;
				}
				if (arg1 + arg0 > anInt693) {
					arg0 = anInt693 - arg1;
				}
				@Pc(35) int local35 = arg1 + arg3 * anInt688;
				for (@Pc(37) int local37 = 0; local37 < arg0; local37++) {
					anIntArray212[local35 + local37] = arg2;
				}
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("26422, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(IIIIII)V")
	private static void method440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 >= anInt690 && arg3 < anInt691) {
				if (arg0 < anInt692) {
					arg4 -= anInt692 - arg0;
					arg0 = anInt692;
				}
				if (arg0 + arg4 > anInt693) {
					arg4 = anInt693 - arg0;
				}
				@Pc(32) int local32 = 256 - arg2;
				@Pc(51) int local51 = (arg1 >> 16 & 0xFF) * arg2;
				@Pc(59) int local59 = (arg1 >> 8 & 0xFF) * arg2;
				@Pc(65) int local65 = (arg1 & 0xFF) * arg2;
				@Pc(71) int local71 = arg0 + arg3 * anInt688;
				for (@Pc(73) int local73 = 0; local73 < arg4; local73++) {
					@Pc(85) int local85 = (anIntArray212[local71] >> 16 & 0xFF) * local32;
					@Pc(95) int local95 = (anIntArray212[local71] >> 8 & 0xFF) * local32;
					@Pc(103) int local103 = (anIntArray212[local71] & 0xFF) * local32;
					@Pc(125) int local125 = (local51 + local85 >> 8 << 16) + (local59 + local95 >> 8 << 8) + (local65 + local103 >> 8);
					anIntArray212[local71++] = local125;
				}
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("78053, " + -985 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
	public static void method441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 >= anInt692 && arg1 < anInt693) {
				if (arg0 < anInt690) {
					arg3 -= anInt690 - arg0;
					arg0 = anInt690;
				}
				if (arg0 + arg3 > anInt691) {
					arg3 = anInt691 - arg0;
				}
				@Pc(40) int local40 = arg1 + arg0 * anInt688;
				for (@Pc(42) int local42 = 0; local42 < arg3; local42++) {
					anIntArray212[local40 + local42 * anInt688] = arg2;
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("94910, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(IIIIII)V")
	private static void method442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg5 >= anInt692 && arg5 < anInt693) {
				if (arg2 < anInt690) {
					arg0 -= anInt690 - arg2;
					arg2 = anInt690;
				}
				if (arg2 + arg0 > anInt691) {
					arg0 = anInt691 - arg2;
				}
				@Pc(30) int local30 = 256 - arg3;
				@Pc(34) boolean local34 = false;
				@Pc(42) int local42 = (arg1 >> 16 & 0xFF) * arg3;
				@Pc(50) int local50 = (arg1 >> 8 & 0xFF) * arg3;
				@Pc(56) int local56 = (arg1 & 0xFF) * arg3;
				@Pc(62) int local62 = arg5 + arg2 * anInt688;
				for (@Pc(64) int local64 = 0; local64 < arg0; local64++) {
					@Pc(76) int local76 = (anIntArray212[local62] >> 16 & 0xFF) * local30;
					@Pc(86) int local86 = (anIntArray212[local62] >> 8 & 0xFF) * local30;
					@Pc(94) int local94 = (anIntArray212[local62] & 0xFF) * local30;
					@Pc(116) int local116 = (local42 + local76 >> 8 << 16) + (local50 + local86 >> 8 << 8) + (local56 + local94 >> 8);
					anIntArray212[local62] = local116;
					local62 += anInt688;
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("35599, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
