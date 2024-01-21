import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CXMSQZVC")
public class Class5_Sub1_Sub1 extends Class5_Sub1 {

	@OriginalMember(owner = "client!CXMSQZVC", name = "k", descriptor = "Z")
	private static boolean aBoolean202;

	@OriginalMember(owner = "client!CXMSQZVC", name = "m", descriptor = "[I")
	public static int[] anIntArray201;

	@OriginalMember(owner = "client!CXMSQZVC", name = "n", descriptor = "I")
	public static int anInt773;

	@OriginalMember(owner = "client!CXMSQZVC", name = "o", descriptor = "I")
	public static int anInt774;

	@OriginalMember(owner = "client!CXMSQZVC", name = "p", descriptor = "I")
	public static int anInt775;

	@OriginalMember(owner = "client!CXMSQZVC", name = "q", descriptor = "I")
	public static int anInt776;

	@OriginalMember(owner = "client!CXMSQZVC", name = "r", descriptor = "I")
	public static int anInt777;

	@OriginalMember(owner = "client!CXMSQZVC", name = "s", descriptor = "I")
	public static int anInt778;

	@OriginalMember(owner = "client!CXMSQZVC", name = "t", descriptor = "I")
	public static int anInt779;

	@OriginalMember(owner = "client!CXMSQZVC", name = "u", descriptor = "I")
	public static int anInt780;

	@OriginalMember(owner = "client!CXMSQZVC", name = "v", descriptor = "I")
	public static int anInt781;

	@OriginalMember(owner = "client!CXMSQZVC", name = "i", descriptor = "Z")
	private static boolean aBoolean200 = true;

	@OriginalMember(owner = "client!CXMSQZVC", name = "j", descriptor = "Z")
	private static boolean aBoolean201 = true;

	@OriginalMember(owner = "client!CXMSQZVC", name = "l", descriptor = "I")
	private static int anInt772 = 770;

	@OriginalMember(owner = "client!CXMSQZVC", name = "a", descriptor = "(III[I)V")
	public static void method544(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			anIntArray201 = arg2;
			anInt773 = arg1;
			anInt774 = arg0;
			method546(arg0, 0, 0, (byte) 6, arg1);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("37985, " + arg0 + ", " + 4 + ", " + arg1 + ", " + arg2 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXMSQZVC", name = "a", descriptor = "(I)V")
	public static void method545(@OriginalArg(0) int arg0) {
		try {
			anInt777 = 0;
			anInt775 = 0;
			anInt778 = anInt773;
			anInt776 = anInt774;
			anInt779 = anInt778 - 1;
			anInt780 = anInt778 / 2;
			@Pc(19) boolean local19 = false;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("54130, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXMSQZVC", name = "a", descriptor = "(IIIBI)V")
	public static void method546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg4 > anInt773) {
				arg4 = anInt773;
			}
			if (arg0 > anInt774) {
				arg0 = anInt774;
			}
			anInt777 = arg2;
			anInt775 = arg1;
			anInt778 = arg4;
			@Pc(28) boolean local28 = false;
			anInt776 = arg0;
			anInt779 = anInt778 - 1;
			anInt780 = anInt778 / 2;
			anInt781 = anInt776 / 2;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("54702, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXMSQZVC", name = "b", descriptor = "(I)V")
	public static void method547() {
		try {
			@Pc(15) int local15 = anInt773 * anInt774;
			for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
				anIntArray201[local17] = 0;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("48488, " + 3 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXMSQZVC", name = "a", descriptor = "(ZIIIIII)V")
	public static void method548(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 < anInt777) {
				arg5 -= anInt777 - arg4;
				arg4 = anInt777;
			}
			if (arg1 < anInt775) {
				arg2 -= anInt775 - arg1;
				arg1 = anInt775;
			}
			if (arg4 + arg5 > anInt778) {
				arg5 = anInt778 - arg4;
			}
			if (arg1 + arg2 > anInt776) {
				arg2 = anInt776 - arg1;
			}
			@Pc(54) int local54 = 256 - arg3;
			@Pc(62) int local62 = (arg0 >> 16 & 0xFF) * arg3;
			@Pc(70) int local70 = (arg0 >> 8 & 0xFF) * arg3;
			@Pc(76) int local76 = (arg0 & 0xFF) * arg3;
			@Pc(80) int local80 = anInt773 - arg5;
			@Pc(86) int local86 = arg4 + arg1 * anInt773;
			for (@Pc(88) int local88 = 0; local88 < arg2; local88++) {
				for (@Pc(93) int local93 = -arg5; local93 < 0; local93++) {
					@Pc(105) int local105 = (anIntArray201[local86] >> 16 & 0xFF) * local54;
					@Pc(115) int local115 = (anIntArray201[local86] >> 8 & 0xFF) * local54;
					@Pc(123) int local123 = (anIntArray201[local86] & 0xFF) * local54;
					@Pc(145) int local145 = (local62 + local105 >> 8 << 16) + (local70 + local115 >> 8 << 8) + (local76 + local123 >> 8);
					anIntArray201[local86++] = local145;
				}
				local86 += local80;
			}
		} catch (@Pc(163) RuntimeException local163) {
			signlink.reporterror("87597, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local163.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXMSQZVC", name = "a", descriptor = "(IIIIII)V")
	public static void method549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg1 < anInt777) {
				arg2 -= anInt777 - arg1;
				arg1 = anInt777;
			}
			if (arg3 < anInt775) {
				arg4 -= anInt775 - arg3;
				arg3 = anInt775;
			}
			if (arg1 + arg2 > anInt778) {
				arg2 = anInt778 - arg1;
			}
			if (arg3 + arg4 > anInt776) {
				arg4 = anInt776 - arg3;
			}
			@Pc(45) int local45 = anInt773 - arg2;
			@Pc(51) int local51 = arg1 + arg3 * anInt773;
			for (@Pc(58) int local58 = -arg4; local58 < 0; local58++) {
				for (@Pc(63) int local63 = -arg2; local63 < 0; local63++) {
					anIntArray201[local51++] = arg0;
				}
				local51 += local45;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("67871, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 8 + ", " + arg3 + ", " + arg4 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXMSQZVC", name = "a", descriptor = "(IIIIZI)V")
	public static void method550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			method552(arg4, arg2, arg3, arg0);
			method552(arg4, arg2, arg3, arg0 + arg1 - 1);
			method554(arg2, arg1, arg0, arg3);
			method554(arg2, arg1, arg0, arg3 + arg4 - 1);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("35861, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXMSQZVC", name = "a", descriptor = "(IIIIIII)V")
	public static void method551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method553(arg2, arg1, arg4, arg0, arg5);
			method553(arg2, arg1, arg4 + arg3 - 1, arg0, arg5);
			if (arg3 >= 3) {
				method555(arg2, arg1, arg5, arg4 + 1, arg3 - 2);
				method555(arg2 + arg0 - 1, arg1, arg5, arg4 + 1, arg3 - 2);
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("73467, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXMSQZVC", name = "a", descriptor = "(IIBII)V")
	public static void method552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 >= anInt775 && arg3 < anInt776) {
				if (arg2 < anInt777) {
					arg0 -= anInt777 - arg2;
					arg2 = anInt777;
				}
				if (arg2 + arg0 > anInt778) {
					arg0 = anInt778 - arg2;
				}
				@Pc(36) int local36 = arg2 + arg3 * anInt773;
				for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
					anIntArray201[local36 + local38] = arg1;
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("92004, " + arg0 + ", " + arg1 + ", " + -92 + ", " + arg2 + ", " + arg3 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXMSQZVC", name = "b", descriptor = "(IIIIII)V")
	private static void method553(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 >= anInt775 && arg2 < anInt776) {
				if (arg0 < anInt777) {
					arg3 -= anInt777 - arg0;
					arg0 = anInt777;
				}
				if (arg0 + arg3 > anInt778) {
					arg3 = anInt778 - arg0;
				}
				@Pc(30) int local30 = 256 - arg1;
				@Pc(38) int local38 = (arg4 >> 16 & 0xFF) * arg1;
				@Pc(46) int local46 = (arg4 >> 8 & 0xFF) * arg1;
				@Pc(52) int local52 = (arg4 & 0xFF) * arg1;
				@Pc(62) int local62 = arg0 + arg2 * anInt773;
				for (@Pc(64) int local64 = 0; local64 < arg3; local64++) {
					@Pc(76) int local76 = (anIntArray201[local62] >> 16 & 0xFF) * local30;
					@Pc(86) int local86 = (anIntArray201[local62] >> 8 & 0xFF) * local30;
					@Pc(94) int local94 = (anIntArray201[local62] & 0xFF) * local30;
					@Pc(116) int local116 = (local38 + local76 >> 8 << 16) + (local46 + local86 >> 8 << 8) + (local52 + local94 >> 8);
					anIntArray201[local62++] = local116;
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("77062, " + -14852 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXMSQZVC", name = "a", descriptor = "(IIIIB)V")
	public static void method554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 >= anInt777 && arg3 < anInt778) {
				if (arg2 < anInt775) {
					arg1 -= anInt775 - arg2;
					arg2 = anInt775;
				}
				if (arg2 + arg1 > anInt776) {
					arg1 = anInt776 - arg2;
				}
				@Pc(32) int local32 = arg3 + arg2 * anInt773;
				for (@Pc(43) int local43 = 0; local43 < arg1; local43++) {
					anIntArray201[local32 + local43 * anInt773] = arg0;
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("45647, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -85 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXMSQZVC", name = "a", descriptor = "(IIIIBI)V")
	private static void method555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt777 && arg0 < anInt778) {
				if (arg3 < anInt775) {
					arg4 -= anInt775 - arg3;
					arg3 = anInt775;
				}
				if (arg3 + arg4 > anInt776) {
					arg4 = anInt776 - arg3;
				}
				@Pc(34) int local34 = 256 - arg1;
				@Pc(42) int local42 = (arg2 >> 16 & 0xFF) * arg1;
				@Pc(50) int local50 = (arg2 >> 8 & 0xFF) * arg1;
				@Pc(56) int local56 = (arg2 & 0xFF) * arg1;
				@Pc(62) int local62 = arg0 + arg3 * anInt773;
				for (@Pc(64) int local64 = 0; local64 < arg4; local64++) {
					@Pc(76) int local76 = (anIntArray201[local62] >> 16 & 0xFF) * local34;
					@Pc(86) int local86 = (anIntArray201[local62] >> 8 & 0xFF) * local34;
					@Pc(94) int local94 = (anIntArray201[local62] & 0xFF) * local34;
					@Pc(116) int local116 = (local42 + local76 >> 8 << 16) + (local50 + local86 >> 8 << 8) + (local56 + local94 >> 8);
					anIntArray201[local62] = local116;
					local62 += anInt773;
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("79660, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -25 + ", " + arg4 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CXMSQZVC", name = "<init>", descriptor = "()V")
	protected Class5_Sub1_Sub1() {
	}
}
