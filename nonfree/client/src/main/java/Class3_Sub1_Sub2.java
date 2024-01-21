import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NQLGXPRA")
public class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!NQLGXPRA", name = "l", descriptor = "[I")
	public static int[] anIntArray208;

	@OriginalMember(owner = "client!NQLGXPRA", name = "m", descriptor = "I")
	public static int anInt783;

	@OriginalMember(owner = "client!NQLGXPRA", name = "n", descriptor = "I")
	public static int anInt784;

	@OriginalMember(owner = "client!NQLGXPRA", name = "o", descriptor = "I")
	public static int anInt785;

	@OriginalMember(owner = "client!NQLGXPRA", name = "p", descriptor = "I")
	public static int anInt786;

	@OriginalMember(owner = "client!NQLGXPRA", name = "q", descriptor = "I")
	public static int anInt787;

	@OriginalMember(owner = "client!NQLGXPRA", name = "r", descriptor = "I")
	public static int anInt788;

	@OriginalMember(owner = "client!NQLGXPRA", name = "s", descriptor = "I")
	public static int anInt789;

	@OriginalMember(owner = "client!NQLGXPRA", name = "t", descriptor = "I")
	public static int anInt790;

	@OriginalMember(owner = "client!NQLGXPRA", name = "u", descriptor = "I")
	public static int anInt791;

	@OriginalMember(owner = "client!NQLGXPRA", name = "h", descriptor = "I")
	private static int anInt781 = 12933;

	@OriginalMember(owner = "client!NQLGXPRA", name = "i", descriptor = "I")
	private static int anInt782 = 834;

	@OriginalMember(owner = "client!NQLGXPRA", name = "j", descriptor = "B")
	private static byte aByte25 = -113;

	@OriginalMember(owner = "client!NQLGXPRA", name = "k", descriptor = "Z")
	private static boolean aBoolean191 = true;

	@OriginalMember(owner = "client!NQLGXPRA", name = "a", descriptor = "(I[III)V")
	public static void method549(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		try {
			anIntArray208 = arg1;
			anInt783 = arg0;
			anInt784 = arg2;
			if (12933 != anInt781) {
				for (@Pc(10) int local10 = 1; local10 > 0; local10++) {
				}
			}
			method551(0, arg2, 0, arg0);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("25429, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 12933 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQLGXPRA", name = "a", descriptor = "(I)V")
	public static void method550() {
		try {
			anInt787 = 0;
			anInt785 = 0;
			anInt788 = anInt783;
			anInt786 = anInt784;
			anInt789 = anInt788 - 1;
			anInt790 = anInt788 / 2;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("12315, " + 15 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQLGXPRA", name = "a", descriptor = "(IIBII)V")
	public static void method551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg3 > anInt783) {
				arg3 = anInt783;
			}
			if (arg1 > anInt784) {
				arg1 = anInt784;
			}
			anInt787 = arg0;
			anInt785 = arg2;
			anInt788 = arg3;
			anInt786 = arg1;
			anInt789 = anInt788 - 1;
			anInt790 = anInt788 / 2;
			anInt791 = anInt786 / 2;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("19206, " + arg0 + ", " + arg1 + ", " + 98 + ", " + arg2 + ", " + arg3 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQLGXPRA", name = "b", descriptor = "(I)V")
	public static void method552() {
		try {
			@Pc(5) int local5 = anInt783 * anInt784;
			for (@Pc(17) int local17 = 0; local17 < local5; local17++) {
				anIntArray208[local17] = 0;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("68463, " + 7 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQLGXPRA", name = "a", descriptor = "(IIIIIII)V")
	public static void method553(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg5 < anInt787) {
				arg0 -= anInt787 - arg5;
				arg5 = anInt787;
			}
			if (arg1 < anInt785) {
				arg4 -= anInt785 - arg1;
				arg1 = anInt785;
			}
			if (arg5 + arg0 > anInt788) {
				arg0 = anInt788 - arg5;
			}
			if (arg1 + arg4 > anInt786) {
				arg4 = anInt786 - arg1;
			}
			@Pc(54) int local54 = 256 - arg3;
			@Pc(62) int local62 = (arg2 >> 16 & 0xFF) * arg3;
			@Pc(70) int local70 = (arg2 >> 8 & 0xFF) * arg3;
			@Pc(76) int local76 = (arg2 & 0xFF) * arg3;
			@Pc(80) int local80 = anInt783 - arg0;
			@Pc(86) int local86 = arg5 + arg1 * anInt783;
			for (@Pc(88) int local88 = 0; local88 < arg4; local88++) {
				for (@Pc(93) int local93 = -arg0; local93 < 0; local93++) {
					@Pc(105) int local105 = (anIntArray208[local86] >> 16 & 0xFF) * local54;
					@Pc(115) int local115 = (anIntArray208[local86] >> 8 & 0xFF) * local54;
					@Pc(123) int local123 = (anIntArray208[local86] & 0xFF) * local54;
					@Pc(145) int local145 = (local62 + local105 >> 8 << 16) + (local70 + local115 >> 8 << 8) + (local76 + local123 >> 8);
					anIntArray208[local86++] = local145;
				}
				local86 += local80;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("264, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQLGXPRA", name = "a", descriptor = "(IIIIII)V")
	public static void method554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 < anInt787) {
				arg4 -= anInt787 - arg0;
				arg0 = anInt787;
			}
			if (arg3 < anInt785) {
				arg2 -= anInt785 - arg3;
				arg3 = anInt785;
			}
			if (arg0 + arg4 > anInt788) {
				arg4 = anInt788 - arg0;
			}
			if (arg3 + arg2 > anInt786) {
				arg2 = anInt786 - arg3;
			}
			@Pc(45) int local45 = anInt783 - arg4;
			@Pc(51) int local51 = arg0 + arg3 * anInt783;
			for (@Pc(57) int local57 = -arg2; local57 < 0; local57++) {
				for (@Pc(62) int local62 = -arg4; local62 < 0; local62++) {
					anIntArray208[local51++] = arg1;
				}
				local51 += local45;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("95563, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQLGXPRA", name = "a", descriptor = "(IBIIII)V")
	public static void method555(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method557(arg1, arg0, arg4, arg2);
			method557(arg1 + arg3 - 1, arg0, arg4, arg2);
			method559(arg0, arg1, arg4, 834, arg3);
			method559(arg0, arg1, arg4 + arg2 - 1, 834, arg3);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("11817, " + arg0 + ", " + 52 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQLGXPRA", name = "b", descriptor = "(IIIIIII)V")
	public static void method556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method558(arg0, arg2, arg5, arg1, arg4);
			method558(arg0 + arg3 - 1, arg2, arg5, arg1, arg4);
			if (arg3 >= 3) {
				method560(arg0 + 1, arg1, arg3 - 2, arg4, arg2, (byte) 7);
				method560(arg0 + 1, arg1 + arg5 - 1, arg3 - 2, arg4, arg2, (byte) 7);
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("83374, " + arg0 + ", " + arg1 + ", " + 1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQLGXPRA", name = "a", descriptor = "(IIIII)V")
	public static void method557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 >= anInt785 && arg0 < anInt786) {
				if (arg2 < anInt787) {
					arg3 -= anInt787 - arg2;
					arg2 = anInt787;
				}
				if (arg2 + arg3 > anInt788) {
					arg3 = anInt788 - arg2;
				}
				@Pc(43) int local43 = arg2 + arg0 * anInt783;
				for (@Pc(45) int local45 = 0; local45 < arg3; local45++) {
					anIntArray208[local43 + local45] = arg1;
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("87833, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQLGXPRA", name = "a", descriptor = "(IIBIII)V")
	private static void method558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt785 && arg0 < anInt786) {
				if (arg3 < anInt787) {
					arg2 -= anInt787 - arg3;
					arg3 = anInt787;
				}
				if (arg3 + arg2 > anInt788) {
					arg2 = anInt788 - arg3;
				}
				@Pc(30) int local30 = 256 - arg1;
				@Pc(41) int local41 = (arg4 >> 16 & 0xFF) * arg1;
				@Pc(49) int local49 = (arg4 >> 8 & 0xFF) * arg1;
				@Pc(55) int local55 = (arg4 & 0xFF) * arg1;
				@Pc(61) int local61 = arg3 + arg0 * anInt783;
				for (@Pc(63) int local63 = 0; local63 < arg2; local63++) {
					@Pc(75) int local75 = (anIntArray208[local61] >> 16 & 0xFF) * local30;
					@Pc(85) int local85 = (anIntArray208[local61] >> 8 & 0xFF) * local30;
					@Pc(93) int local93 = (anIntArray208[local61] & 0xFF) * local30;
					@Pc(115) int local115 = (local41 + local75 >> 8 << 16) + (local49 + local85 >> 8 << 8) + (local55 + local93 >> 8);
					anIntArray208[local61++] = local115;
				}
			}
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("46104, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQLGXPRA", name = "b", descriptor = "(IIIII)V")
	public static void method559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			@Pc(3) boolean local3 = false;
			if (arg2 >= anInt787 && arg2 < anInt788) {
				if (arg1 < anInt785) {
					arg4 -= anInt785 - arg1;
					arg1 = anInt785;
				}
				if (arg1 + arg4 > anInt786) {
					arg4 = anInt786 - arg1;
				}
				@Pc(36) int local36 = arg2 + arg1 * anInt783;
				for (@Pc(38) int local38 = 0; local38 < arg4; local38++) {
					anIntArray208[local36 + local38 * anInt783] = arg0;
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("48862, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQLGXPRA", name = "a", descriptor = "(IIIIIB)V")
	private static void method560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		try {
			if (arg1 >= anInt787 && arg1 < anInt788) {
				if (arg0 < anInt785) {
					arg2 -= anInt785 - arg0;
					arg0 = anInt785;
				}
				if (arg0 + arg2 > anInt786) {
					arg2 = anInt786 - arg0;
				}
				@Pc(30) int local30 = 256 - arg4;
				@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
				@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
				@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
				@Pc(58) int local58 = arg1 + arg0 * anInt783;
				for (@Pc(60) int local60 = 0; local60 < arg2; local60++) {
					@Pc(72) int local72 = (anIntArray208[local58] >> 16 & 0xFF) * local30;
					@Pc(82) int local82 = (anIntArray208[local58] >> 8 & 0xFF) * local30;
					@Pc(90) int local90 = (anIntArray208[local58] & 0xFF) * local30;
					@Pc(112) int local112 = (local38 + local72 >> 8 << 16) + (local46 + local82 >> 8 << 8) + (local52 + local90 >> 8);
					anIntArray208[local58] = local112;
					local58 += anInt783;
				}
				@Pc(129) boolean local129 = false;
			}
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("75811, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NQLGXPRA", name = "<init>", descriptor = "()V")
	protected Class3_Sub1_Sub2() {
	}
}
