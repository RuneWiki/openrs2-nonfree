import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PGTLMTYR")
public class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!PGTLMTYR", name = "l", descriptor = "[I")
	public static int[] anIntArray184;

	@OriginalMember(owner = "client!PGTLMTYR", name = "m", descriptor = "I")
	public static int anInt710;

	@OriginalMember(owner = "client!PGTLMTYR", name = "n", descriptor = "I")
	public static int anInt711;

	@OriginalMember(owner = "client!PGTLMTYR", name = "o", descriptor = "I")
	public static int anInt712;

	@OriginalMember(owner = "client!PGTLMTYR", name = "p", descriptor = "I")
	public static int anInt713;

	@OriginalMember(owner = "client!PGTLMTYR", name = "q", descriptor = "I")
	public static int anInt714;

	@OriginalMember(owner = "client!PGTLMTYR", name = "r", descriptor = "I")
	public static int anInt715;

	@OriginalMember(owner = "client!PGTLMTYR", name = "s", descriptor = "I")
	public static int anInt716;

	@OriginalMember(owner = "client!PGTLMTYR", name = "t", descriptor = "I")
	public static int anInt717;

	@OriginalMember(owner = "client!PGTLMTYR", name = "u", descriptor = "I")
	public static int anInt718;

	@OriginalMember(owner = "client!PGTLMTYR", name = "h", descriptor = "I")
	private static int anInt707 = 4;

	@OriginalMember(owner = "client!PGTLMTYR", name = "i", descriptor = "I")
	private static int anInt708 = -24987;

	@OriginalMember(owner = "client!PGTLMTYR", name = "j", descriptor = "Z")
	private static boolean aBoolean193 = true;

	@OriginalMember(owner = "client!PGTLMTYR", name = "k", descriptor = "I")
	private static int anInt709 = 37900;

	@OriginalMember(owner = "client!PGTLMTYR", name = "a", descriptor = "(III[I)V")
	public static void method473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			anIntArray184 = arg2;
			anInt710 = arg0;
			anInt711 = arg1;
			method475(0, arg0, 0, arg1);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("25334, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGTLMTYR", name = "a", descriptor = "(I)V")
	public static void method474() {
		try {
			anInt714 = 0;
			anInt712 = 0;
			anInt715 = anInt710;
			anInt713 = anInt711;
			anInt716 = anInt715 - 1;
			anInt717 = anInt715 / 2;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("27820, " + 3393 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGTLMTYR", name = "a", descriptor = "(IIIII)V")
	public static void method475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg1 > anInt710) {
				arg1 = anInt710;
			}
			if (arg3 > anInt711) {
				arg3 = anInt711;
			}
			anInt714 = arg2;
			anInt712 = arg0;
			anInt715 = arg1;
			anInt713 = arg3;
			anInt716 = anInt715 - 1;
			anInt717 = anInt715 / 2;
			anInt718 = anInt713 / 2;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("3931, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -44482 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGTLMTYR", name = "a", descriptor = "(B)V")
	public static void method476() {
		try {
			@Pc(5) int local5 = anInt710 * anInt711;
			for (@Pc(17) int local17 = 0; local17 < local5; local17++) {
				anIntArray184[local17] = 0;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("10792, " + 32 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGTLMTYR", name = "a", descriptor = "(IZIIIII)V")
	public static void method477(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg0 < anInt714) {
				arg1 -= anInt714 - arg0;
				arg0 = anInt714;
			}
			if (arg3 < anInt712) {
				arg4 -= anInt712 - arg3;
				arg3 = anInt712;
			}
			if (arg0 + arg1 > anInt715) {
				arg1 = anInt715 - arg0;
			}
			if (arg3 + arg4 > anInt713) {
				arg4 = anInt713 - arg3;
			}
			@Pc(45) int local45 = 256 - arg5;
			@Pc(53) int local53 = (arg2 >> 16 & 0xFF) * arg5;
			@Pc(61) int local61 = (arg2 >> 8 & 0xFF) * arg5;
			@Pc(67) int local67 = (arg2 & 0xFF) * arg5;
			@Pc(80) int local80 = anInt710 - arg1;
			@Pc(86) int local86 = arg0 + arg3 * anInt710;
			for (@Pc(88) int local88 = 0; local88 < arg4; local88++) {
				for (@Pc(93) int local93 = -arg1; local93 < 0; local93++) {
					@Pc(105) int local105 = (anIntArray184[local86] >> 16 & 0xFF) * local45;
					@Pc(115) int local115 = (anIntArray184[local86] >> 8 & 0xFF) * local45;
					@Pc(123) int local123 = (anIntArray184[local86] & 0xFF) * local45;
					@Pc(145) int local145 = (local53 + local105 >> 8 << 16) + (local61 + local115 >> 8 << 8) + (local67 + local123 >> 8);
					anIntArray184[local86++] = local145;
				}
				local86 += local80;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("37959, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGTLMTYR", name = "a", descriptor = "(IIIIZI)V")
	public static void method478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 < anInt714) {
				arg1 -= anInt714 - arg0;
				arg0 = anInt714;
			}
			if (arg3 < anInt712) {
				arg2 -= anInt712 - arg3;
				arg3 = anInt712;
			}
			if (arg0 + arg1 > anInt715) {
				arg1 = anInt715 - arg0;
			}
			if (arg3 + arg2 > anInt713) {
				arg2 = anInt713 - arg3;
			}
			@Pc(45) int local45 = anInt710 - arg1;
			@Pc(51) int local51 = arg0 + arg3 * anInt710;
			for (@Pc(54) int local54 = -arg2; local54 < 0; local54++) {
				for (@Pc(59) int local59 = -arg1; local59 < 0; local59++) {
					anIntArray184[local51++] = arg4;
				}
				local51 += local45;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("16914, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGTLMTYR", name = "a", descriptor = "(IIIIII)V")
	public static void method479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method481(arg4, 160, arg0, arg2, arg1);
			method481(arg4 + arg3 - 1, 160, arg0, arg2, arg1);
			method483(arg0, arg4, arg2, arg3);
			if (anInt708 != -24987) {
				for (@Pc(26) int local26 = 1; local26 > 0; local26++) {
				}
			}
			method483(arg0, arg4, arg2 + arg1 - 1, arg3);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("54559, " + arg0 + ", " + arg1 + ", " + -24987 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGTLMTYR", name = "a", descriptor = "(IIIIIII)V")
	public static void method480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			method482(arg4, arg2, arg1, arg5, arg0);
			method482(arg4, arg2 + arg3 - 1, arg1, arg5, arg0);
			if (arg3 >= 3) {
				method484(arg5, arg2 + 1, arg4, arg3 - 2, arg1);
				method484(arg5, arg2 + 1, arg4 + arg0 - 1, arg3 - 2, arg1);
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("15981, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 496 + ", " + arg5 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGTLMTYR", name = "b", descriptor = "(IIIII)V")
	public static void method481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg0 >= anInt712 && arg0 < anInt713) {
				if (arg3 < anInt714) {
					arg4 -= anInt714 - arg3;
					arg3 = anInt714;
				}
				if (arg3 + arg4 > anInt715) {
					arg4 = anInt715 - arg3;
				}
				@Pc(36) int local36 = arg3 + arg0 * anInt710;
				for (@Pc(38) int local38 = 0; local38 < arg4; local38++) {
					anIntArray184[local36 + local38] = arg2;
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("80936, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGTLMTYR", name = "b", descriptor = "(IIIIII)V")
	private static void method482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 >= anInt712 && arg1 < anInt713) {
				if (arg0 < anInt714) {
					arg4 -= anInt714 - arg0;
					arg0 = anInt714;
				}
				if (arg0 + arg4 > anInt715) {
					arg4 = anInt715 - arg0;
				}
				@Pc(30) int local30 = 256 - arg3;
				@Pc(38) int local38 = (arg2 >> 16 & 0xFF) * arg3;
				@Pc(46) int local46 = (arg2 >> 8 & 0xFF) * arg3;
				@Pc(52) int local52 = (arg2 & 0xFF) * arg3;
				@Pc(58) int local58 = arg0 + arg1 * anInt710;
				for (@Pc(63) int local63 = 0; local63 < arg4; local63++) {
					@Pc(75) int local75 = (anIntArray184[local58] >> 16 & 0xFF) * local30;
					@Pc(85) int local85 = (anIntArray184[local58] >> 8 & 0xFF) * local30;
					@Pc(93) int local93 = (anIntArray184[local58] & 0xFF) * local30;
					@Pc(115) int local115 = (local38 + local75 >> 8 << 16) + (local46 + local85 >> 8 << 8) + (local52 + local93 >> 8);
					anIntArray184[local58++] = local115;
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("89921, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 919 + ", " + arg4 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGTLMTYR", name = "c", descriptor = "(IIIII)V")
	public static void method483(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 >= anInt714 && arg2 < anInt715) {
				if (arg1 < anInt712) {
					arg3 -= anInt712 - arg1;
					arg1 = anInt712;
				}
				if (arg1 + arg3 > anInt713) {
					arg3 = anInt713 - arg1;
				}
				@Pc(37) int local37 = arg2 + arg1 * anInt710;
				for (@Pc(39) int local39 = 0; local39 < arg3; local39++) {
					anIntArray184[local37 + local39 * anInt710] = arg0;
				}
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("48445, " + arg0 + ", " + 14380 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGTLMTYR", name = "c", descriptor = "(IIIIII)V")
	private static void method484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 >= anInt714 && arg2 < anInt715) {
				if (arg1 < anInt712) {
					arg3 -= anInt712 - arg1;
					arg1 = anInt712;
				}
				if (arg1 + arg3 > anInt713) {
					arg3 = anInt713 - arg1;
				}
				@Pc(37) int local37 = 256 - arg0;
				@Pc(45) int local45 = (arg4 >> 16 & 0xFF) * arg0;
				@Pc(53) int local53 = (arg4 >> 8 & 0xFF) * arg0;
				@Pc(59) int local59 = (arg4 & 0xFF) * arg0;
				@Pc(65) int local65 = arg2 + arg1 * anInt710;
				for (@Pc(67) int local67 = 0; local67 < arg3; local67++) {
					@Pc(79) int local79 = (anIntArray184[local65] >> 16 & 0xFF) * local37;
					@Pc(89) int local89 = (anIntArray184[local65] >> 8 & 0xFF) * local37;
					@Pc(97) int local97 = (anIntArray184[local65] & 0xFF) * local37;
					@Pc(119) int local119 = (local45 + local79 >> 8 << 16) + (local53 + local89 >> 8 << 8) + (local59 + local97 >> 8);
					anIntArray184[local65] = local119;
					local65 += anInt710;
				}
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("13115, " + arg0 + ", " + arg1 + ", " + -716 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGTLMTYR", name = "<init>", descriptor = "()V")
	protected Class2_Sub1_Sub2() {
	}
}
