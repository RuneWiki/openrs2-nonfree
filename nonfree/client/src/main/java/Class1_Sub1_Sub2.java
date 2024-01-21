import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gb")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "[I")
	public static int[] anIntArray213;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	public static int anInt712;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public static int anInt713;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public static int anInt714;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	public static int anInt715;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public static int anInt716;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public static int anInt717;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	public static int anInt718;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
	public static int anInt719;

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
	public static int anInt720;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	private static int anInt709 = -37;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "B")
	private static byte aByte46 = 5;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	private static int anInt710 = -646;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
	private static int anInt711 = 9527;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[IIB)V")
	public static void method434(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		try {
			anIntArray213 = arg1;
			if (aByte46 != 5) {
				anInt711 = -101;
			}
			anInt712 = arg0;
			anInt713 = arg2;
			method436(0, arg2, arg0, 0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("15250, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 5 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	public static void method435() {
		try {
			anInt716 = 0;
			anInt714 = 0;
			anInt717 = anInt712;
			anInt715 = anInt713;
			anInt718 = anInt717 - 1;
			anInt719 = anInt717 / 2;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("59983, " + -881 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
	public static void method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg2 > anInt712) {
				arg2 = anInt712;
			}
			if (arg1 > anInt713) {
				arg1 = anInt713;
			}
			anInt716 = arg0;
			anInt714 = arg3;
			anInt717 = arg2;
			anInt715 = arg1;
			anInt718 = anInt717 - 1;
			anInt719 = anInt717 / 2;
			anInt720 = anInt715 / 2;
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("91486, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -227 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	public static void method437() {
		try {
			@Pc(5) int local5 = anInt712 * anInt713;
			for (@Pc(17) int local17 = 0; local17 < local5; local17++) {
				anIntArray213[local17] = 0;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("40376, " + 17698 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIZII)V")
	public static void method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg3 < anInt716) {
				arg2 -= anInt716 - arg3;
				arg3 = anInt716;
			}
			if (arg1 < anInt714) {
				arg0 -= anInt714 - arg1;
				arg1 = anInt714;
			}
			if (arg3 + arg2 > anInt717) {
				arg2 = anInt717 - arg3;
			}
			if (arg1 + arg0 > anInt715) {
				arg0 = anInt715 - arg1;
			}
			@Pc(45) int local45 = 256 - arg5;
			@Pc(53) int local53 = (arg6 >> 16 & 0xFF) * arg5;
			@Pc(61) int local61 = (arg6 >> 8 & 0xFF) * arg5;
			@Pc(67) int local67 = (arg6 & 0xFF) * arg5;
			@Pc(71) int local71;
			if (!arg4) {
				for (local71 = 1; local71 > 0; local71++) {
				}
			}
			local71 = anInt712 - arg2;
			@Pc(86) int local86 = arg3 + arg1 * anInt712;
			for (@Pc(88) int local88 = 0; local88 < arg0; local88++) {
				for (@Pc(93) int local93 = -arg2; local93 < 0; local93++) {
					@Pc(105) int local105 = (anIntArray213[local86] >> 16 & 0xFF) * local45;
					@Pc(115) int local115 = (anIntArray213[local86] >> 8 & 0xFF) * local45;
					@Pc(123) int local123 = (anIntArray213[local86] & 0xFF) * local45;
					@Pc(145) int local145 = (local53 + local105 >> 8 << 16) + (local61 + local115 >> 8 << 8) + (local67 + local123 >> 8);
					anIntArray213[local86++] = local145;
				}
				local86 += local71;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("82739, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZIIIII)V")
	public static void method439(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 < anInt716) {
				arg1 -= anInt716 - arg0;
				arg0 = anInt716;
			}
			if (arg3 < anInt714) {
				arg4 -= anInt714 - arg3;
				arg3 = anInt714;
			}
			if (arg0 + arg1 > anInt717) {
				arg1 = anInt717 - arg0;
			}
			if (arg3 + arg4 > anInt715) {
				arg4 = anInt715 - arg3;
			}
			@Pc(48) int local48 = anInt712 - arg1;
			@Pc(54) int local54 = arg0 + arg3 * anInt712;
			for (@Pc(57) int local57 = -arg4; local57 < 0; local57++) {
				for (@Pc(62) int local62 = -arg1; local62 < 0; local62++) {
					anIntArray213[local54++] = arg2;
				}
				local54 += local48;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("69665, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII)V")
	public static void method440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method442(arg2, arg3, arg1, arg0);
			method442(arg2 + arg4 - 1, arg3, arg1, arg0);
			method444(arg4, arg0, arg2, arg1);
			method444(arg4, arg0, arg2, arg1 + arg3 - 1);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("4452, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIII)V")
	public static void method441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method443(arg4, arg1, arg3, arg2, arg0);
			method443(arg4, arg1, arg3, arg2 + arg5 - 1, arg0);
			if (arg5 >= 3) {
				method445(arg0, arg5 - 2, arg2 + 1, arg3, arg4);
				method445(arg0, arg5 - 2, arg2 + 1, arg3 + arg1 - 1, arg4);
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("5774, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZII)V")
	public static void method442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 >= anInt714 && arg0 < anInt715) {
				if (arg2 < anInt716) {
					arg1 -= anInt716 - arg2;
					arg2 = anInt716;
				}
				if (arg2 + arg1 > anInt717) {
					arg1 = anInt717 - arg2;
				}
				@Pc(35) int local35 = arg2 + arg0 * anInt712;
				for (@Pc(37) int local37 = 0; local37 < arg1; local37++) {
					anIntArray213[local35 + local37] = arg3;
				}
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("97131, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIIII)V")
	private static void method443(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3 >= anInt714 && arg3 < anInt715) {
				if (arg2 < anInt716) {
					arg1 -= anInt716 - arg2;
					arg2 = anInt716;
				}
				if (arg2 + arg1 > anInt717) {
					arg1 = anInt717 - arg2;
				}
				@Pc(32) int local32 = 256 - arg4;
				@Pc(40) int local40 = (arg0 >> 16 & 0xFF) * arg4;
				@Pc(48) int local48 = (arg0 >> 8 & 0xFF) * arg4;
				@Pc(54) int local54 = (arg0 & 0xFF) * arg4;
				@Pc(60) int local60 = arg2 + arg3 * anInt712;
				for (@Pc(73) int local73 = 0; local73 < arg1; local73++) {
					@Pc(85) int local85 = (anIntArray213[local60] >> 16 & 0xFF) * local32;
					@Pc(95) int local95 = (anIntArray213[local60] >> 8 & 0xFF) * local32;
					@Pc(103) int local103 = (anIntArray213[local60] & 0xFF) * local32;
					@Pc(125) int local125 = (local40 + local85 >> 8 << 16) + (local48 + local95 >> 8 << 8) + (local54 + local103 >> 8);
					anIntArray213[local60++] = local125;
				}
			}
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("81332, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -646 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIII)V")
	public static void method444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 >= anInt716 && arg3 < anInt717) {
				if (arg2 < anInt714) {
					arg0 -= anInt714 - arg2;
					arg2 = anInt714;
				}
				if (arg2 + arg0 > anInt715) {
					arg0 = anInt715 - arg2;
				}
				@Pc(34) int local34 = arg3 + arg2 * anInt712;
				for (@Pc(46) int local46 = 0; local46 < arg0; local46++) {
					anIntArray213[local34 + local46 * anInt712] = arg1;
				}
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("72669, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -825 + ", " + arg3 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIZII)V")
	private static void method445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 >= anInt716 && arg3 < anInt717) {
				if (arg2 < anInt714) {
					arg1 -= anInt714 - arg2;
					arg2 = anInt714;
				}
				if (arg2 + arg1 > anInt715) {
					arg1 = anInt715 - arg2;
				}
				@Pc(34) int local34 = 256 - arg0;
				@Pc(42) int local42 = (arg4 >> 16 & 0xFF) * arg0;
				@Pc(50) int local50 = (arg4 >> 8 & 0xFF) * arg0;
				@Pc(56) int local56 = (arg4 & 0xFF) * arg0;
				@Pc(62) int local62 = arg3 + arg2 * anInt712;
				for (@Pc(64) int local64 = 0; local64 < arg1; local64++) {
					@Pc(76) int local76 = (anIntArray213[local62] >> 16 & 0xFF) * local34;
					@Pc(86) int local86 = (anIntArray213[local62] >> 8 & 0xFF) * local34;
					@Pc(94) int local94 = (anIntArray213[local62] & 0xFF) * local34;
					@Pc(116) int local116 = (local42 + local76 >> 8 << 16) + (local50 + local86 >> 8 << 8) + (local56 + local94 >> 8);
					anIntArray213[local62] = local116;
					local62 += anInt712;
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("13539, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
