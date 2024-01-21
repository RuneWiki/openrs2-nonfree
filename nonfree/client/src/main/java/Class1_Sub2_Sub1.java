import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UJSJLLWF")
public class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!UJSJLLWF", name = "m", descriptor = "[I")
	public static int[] anIntArray198;

	@OriginalMember(owner = "client!UJSJLLWF", name = "n", descriptor = "I")
	public static int anInt710;

	@OriginalMember(owner = "client!UJSJLLWF", name = "o", descriptor = "I")
	public static int anInt711;

	@OriginalMember(owner = "client!UJSJLLWF", name = "p", descriptor = "I")
	public static int anInt712;

	@OriginalMember(owner = "client!UJSJLLWF", name = "q", descriptor = "I")
	public static int anInt713;

	@OriginalMember(owner = "client!UJSJLLWF", name = "r", descriptor = "I")
	public static int anInt714;

	@OriginalMember(owner = "client!UJSJLLWF", name = "s", descriptor = "I")
	public static int anInt715;

	@OriginalMember(owner = "client!UJSJLLWF", name = "t", descriptor = "I")
	public static int anInt716;

	@OriginalMember(owner = "client!UJSJLLWF", name = "u", descriptor = "I")
	public static int anInt717;

	@OriginalMember(owner = "client!UJSJLLWF", name = "v", descriptor = "I")
	public static int anInt718;

	@OriginalMember(owner = "client!UJSJLLWF", name = "h", descriptor = "Z")
	private static boolean aBoolean167 = true;

	@OriginalMember(owner = "client!UJSJLLWF", name = "i", descriptor = "Z")
	private static boolean aBoolean168 = true;

	@OriginalMember(owner = "client!UJSJLLWF", name = "j", descriptor = "B")
	private static byte aByte36 = -47;

	@OriginalMember(owner = "client!UJSJLLWF", name = "k", descriptor = "I")
	private static int anInt708 = 2;

	@OriginalMember(owner = "client!UJSJLLWF", name = "l", descriptor = "I")
	private static int anInt709 = -549;

	@OriginalMember(owner = "client!UJSJLLWF", name = "a", descriptor = "([IIII)V")
	public static void method530(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			anIntArray198 = arg0;
			anInt710 = arg1;
			anInt711 = arg2;
			method532(0, 0, arg1, arg2);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("97560, " + arg0 + ", " + 5 + ", " + arg1 + ", " + arg2 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UJSJLLWF", name = "a", descriptor = "(B)V")
	public static void method531() {
		try {
			anInt714 = 0;
			anInt712 = 0;
			anInt715 = anInt710;
			anInt713 = anInt711;
			anInt716 = anInt715 - 1;
			anInt717 = anInt715 / 2;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("26626, " + 3 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UJSJLLWF", name = "a", descriptor = "(IIIII)V")
	public static void method532(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg2 > anInt710) {
				arg2 = anInt710;
			}
			if (arg3 > anInt711) {
				arg3 = anInt711;
			}
			anInt714 = arg0;
			anInt712 = arg1;
			anInt715 = arg2;
			anInt713 = arg3;
			anInt716 = anInt715 - 1;
			anInt717 = anInt715 / 2;
			anInt718 = anInt713 / 2;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("56582, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UJSJLLWF", name = "a", descriptor = "(I)V")
	public static void method533() {
		try {
			@Pc(5) int local5 = anInt710 * anInt711;
			for (@Pc(12) int local12 = 0; local12 < local5; local12++) {
				anIntArray198[local12] = 0;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("54220, " + -837 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UJSJLLWF", name = "a", descriptor = "(BIIIIII)V")
	public static void method534(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg2 < anInt714) {
				arg5 -= anInt714 - arg2;
				arg2 = anInt714;
			}
			if (arg1 < anInt712) {
				arg0 -= anInt712 - arg1;
				arg1 = anInt712;
			}
			if (arg2 + arg5 > anInt715) {
				arg5 = anInt715 - arg2;
			}
			if (arg1 + arg0 > anInt713) {
				arg0 = anInt713 - arg1;
			}
			@Pc(45) int local45 = 256 - arg3;
			@Pc(53) int local53 = (arg4 >> 16 & 0xFF) * arg3;
			@Pc(61) int local61 = (arg4 >> 8 & 0xFF) * arg3;
			@Pc(67) int local67 = (arg4 & 0xFF) * arg3;
			@Pc(75) int local75 = anInt710 - arg5;
			@Pc(81) int local81 = arg2 + arg1 * anInt710;
			for (@Pc(83) int local83 = 0; local83 < arg0; local83++) {
				for (@Pc(88) int local88 = -arg5; local88 < 0; local88++) {
					@Pc(100) int local100 = (anIntArray198[local81] >> 16 & 0xFF) * local45;
					@Pc(110) int local110 = (anIntArray198[local81] >> 8 & 0xFF) * local45;
					@Pc(118) int local118 = (anIntArray198[local81] & 0xFF) * local45;
					@Pc(140) int local140 = (local53 + local100 >> 8 << 16) + (local61 + local110 >> 8 << 8) + (local67 + local118 >> 8);
					anIntArray198[local81++] = local140;
				}
				local81 += local75;
			}
		} catch (@Pc(158) RuntimeException local158) {
			signlink.reporterror("52716, " + -86 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local158.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UJSJLLWF", name = "a", descriptor = "(IIIIII)V")
	public static void method535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 < anInt714) {
				arg4 -= anInt714 - arg1;
				arg1 = anInt714;
			}
			if (arg2 < anInt712) {
				arg3 -= anInt712 - arg2;
				arg2 = anInt712;
			}
			if (arg1 + arg4 > anInt715) {
				arg4 = anInt715 - arg1;
			}
			if (arg2 + arg3 > anInt713) {
				arg3 = anInt713 - arg2;
			}
			@Pc(45) int local45 = anInt710 - arg4;
			@Pc(51) int local51 = arg1 + arg2 * anInt710;
			for (@Pc(54) int local54 = -arg3; local54 < 0; local54++) {
				for (@Pc(59) int local59 = -arg4; local59 < 0; local59++) {
					anIntArray198[local51++] = arg0;
				}
				local51 += local45;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("41263, " + arg0 + ", " + arg1 + ", " + 4 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UJSJLLWF", name = "a", descriptor = "(ZIIIII)V")
	public static void method536(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method538(arg2, arg3, arg1, arg0);
			method538(arg2, arg3, arg1, arg0 + arg4 - 1);
			method540(arg3, aByte36, arg2, arg4, arg0);
			method540(arg3, aByte36, arg2 + arg1 - 1, arg4, arg0);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("73945, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UJSJLLWF", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			method539(arg1, arg0, arg5, arg3, arg2);
			method539(arg1, arg0, arg5, arg3 + arg4 - 1, arg2);
			if (arg4 >= 3) {
				method541(arg3 + 1, arg1, arg4 - 2, arg2, arg0);
				method541(arg3 + 1, arg1 + arg5 - 1, arg4 - 2, arg2, arg0);
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("37609, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UJSJLLWF", name = "b", descriptor = "(IIIII)V")
	public static void method538(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 >= anInt712 && arg3 < anInt713) {
				if (arg0 < anInt714) {
					arg2 -= anInt714 - arg0;
					arg0 = anInt714;
				}
				if (arg0 + arg2 > anInt715) {
					arg2 = anInt715 - arg0;
				}
				@Pc(45) int local45 = arg0 + arg3 * anInt710;
				for (@Pc(47) int local47 = 0; local47 < arg2; local47++) {
					anIntArray198[local45 + local47] = arg1;
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("23730, " + arg0 + ", " + -115 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UJSJLLWF", name = "a", descriptor = "(IIIIIB)V")
	private static void method539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg3 >= anInt712 && arg3 < anInt713) {
				if (arg0 < anInt714) {
					arg2 -= anInt714 - arg0;
					arg0 = anInt714;
				}
				if (arg0 + arg2 > anInt715) {
					arg2 = anInt715 - arg0;
				}
				@Pc(35) int local35 = 256 - arg4;
				@Pc(43) int local43 = (arg1 >> 16 & 0xFF) * arg4;
				@Pc(51) int local51 = (arg1 >> 8 & 0xFF) * arg4;
				@Pc(57) int local57 = (arg1 & 0xFF) * arg4;
				@Pc(63) int local63 = arg0 + arg3 * anInt710;
				for (@Pc(65) int local65 = 0; local65 < arg2; local65++) {
					@Pc(77) int local77 = (anIntArray198[local63] >> 16 & 0xFF) * local35;
					@Pc(87) int local87 = (anIntArray198[local63] >> 8 & 0xFF) * local35;
					@Pc(95) int local95 = (anIntArray198[local63] & 0xFF) * local35;
					@Pc(117) int local117 = (local43 + local77 >> 8 << 16) + (local51 + local87 >> 8 << 8) + (local57 + local95 >> 8);
					anIntArray198[local63++] = local117;
				}
			}
		} catch (@Pc(128) RuntimeException local128) {
			signlink.reporterror("42275, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 6 + ", " + local128.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UJSJLLWF", name = "a", descriptor = "(IBIII)V")
	public static void method540(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 >= anInt714 && arg2 < anInt715) {
				if (arg4 < anInt712) {
					arg3 -= anInt712 - arg4;
					arg4 = anInt712;
				}
				if (arg4 + arg3 > anInt713) {
					arg3 = anInt713 - arg4;
				}
				@Pc(32) int local32 = arg2 + arg4 * anInt710;
				if (arg1 != -47) {
					aBoolean167 = !aBoolean167;
				}
				for (@Pc(43) int local43 = 0; local43 < arg3; local43++) {
					anIntArray198[local32 + local43 * anInt710] = arg0;
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("40638, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UJSJLLWF", name = "b", descriptor = "(IIIIII)V")
	private static void method541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 >= anInt714 && arg1 < anInt715) {
				if (arg0 < anInt712) {
					arg2 -= anInt712 - arg0;
					arg0 = anInt712;
				}
				if (arg0 + arg2 > anInt713) {
					arg2 = anInt713 - arg0;
				}
				@Pc(30) int local30 = 256 - arg3;
				@Pc(38) int local38 = (arg4 >> 16 & 0xFF) * arg3;
				@Pc(46) int local46 = (arg4 >> 8 & 0xFF) * arg3;
				@Pc(52) int local52 = (arg4 & 0xFF) * arg3;
				@Pc(67) int local67 = arg1 + arg0 * anInt710;
				for (@Pc(69) int local69 = 0; local69 < arg2; local69++) {
					@Pc(81) int local81 = (anIntArray198[local67] >> 16 & 0xFF) * local30;
					@Pc(91) int local91 = (anIntArray198[local67] >> 8 & 0xFF) * local30;
					@Pc(99) int local99 = (anIntArray198[local67] & 0xFF) * local30;
					@Pc(121) int local121 = (local38 + local81 >> 8 << 16) + (local46 + local91 >> 8 << 8) + (local52 + local99 >> 8);
					anIntArray198[local67] = local121;
					local67 += anInt710;
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("1460, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 21453 + ", " + arg4 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UJSJLLWF", name = "<init>", descriptor = "()V")
	protected Class1_Sub2_Sub1() {
	}
}
