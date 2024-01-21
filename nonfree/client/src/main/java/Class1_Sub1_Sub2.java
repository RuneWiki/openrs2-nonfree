import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DEVPLWNC")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!DEVPLWNC", name = "l", descriptor = "[I")
	public static int[] anIntArray208;

	@OriginalMember(owner = "client!DEVPLWNC", name = "m", descriptor = "I")
	public static int anInt787;

	@OriginalMember(owner = "client!DEVPLWNC", name = "n", descriptor = "I")
	public static int anInt788;

	@OriginalMember(owner = "client!DEVPLWNC", name = "o", descriptor = "I")
	public static int anInt789;

	@OriginalMember(owner = "client!DEVPLWNC", name = "p", descriptor = "I")
	public static int anInt790;

	@OriginalMember(owner = "client!DEVPLWNC", name = "q", descriptor = "I")
	public static int anInt791;

	@OriginalMember(owner = "client!DEVPLWNC", name = "r", descriptor = "I")
	public static int anInt792;

	@OriginalMember(owner = "client!DEVPLWNC", name = "s", descriptor = "I")
	public static int anInt793;

	@OriginalMember(owner = "client!DEVPLWNC", name = "t", descriptor = "I")
	public static int anInt794;

	@OriginalMember(owner = "client!DEVPLWNC", name = "u", descriptor = "I")
	public static int anInt795;

	@OriginalMember(owner = "client!DEVPLWNC", name = "h", descriptor = "I")
	private static int anInt784 = 404;

	@OriginalMember(owner = "client!DEVPLWNC", name = "i", descriptor = "I")
	private static int anInt785 = 404;

	@OriginalMember(owner = "client!DEVPLWNC", name = "j", descriptor = "I")
	private static int anInt786 = 562;

	@OriginalMember(owner = "client!DEVPLWNC", name = "k", descriptor = "Z")
	private static boolean aBoolean185 = true;

	@OriginalMember(owner = "client!DEVPLWNC", name = "a", descriptor = "([IIIZ)V")
	public static void method553(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			anIntArray208 = arg0;
			anInt787 = arg1;
			anInt788 = arg2;
			method555(arg1, 0, arg2, anInt784, 0);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("68936, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEVPLWNC", name = "a", descriptor = "(I)V")
	public static void method554(@OriginalArg(0) int arg0) {
		try {
			anInt791 = 0;
			anInt789 = 0;
			anInt792 = anInt787;
			anInt790 = anInt788;
			anInt793 = anInt792 - 1;
			anInt794 = anInt792 / 2;
			@Pc(19) boolean local19 = false;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("44085, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEVPLWNC", name = "a", descriptor = "(IIIII)V")
	public static void method555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg4 < 0) {
				arg4 = 0;
			}
			if (arg0 > anInt787) {
				arg0 = anInt787;
			}
			if (arg2 > anInt788) {
				arg2 = anInt788;
			}
			anInt791 = arg1;
			anInt789 = arg4;
			if (arg3 > 0) {
				anInt792 = arg0;
				anInt790 = arg2;
				anInt793 = anInt792 - 1;
				anInt794 = anInt792 / 2;
				anInt795 = anInt790 / 2;
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("56374, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEVPLWNC", name = "b", descriptor = "(I)V")
	public static void method556(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) int local5 = anInt787 * anInt788;
			@Pc(11) int local11;
			if (arg0 < 0 || arg0 > 0) {
				for (local11 = 1; local11 > 0; local11++) {
				}
			}
			for (local11 = 0; local11 < local5; local11++) {
				anIntArray208[local11] = 0;
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("24715, " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEVPLWNC", name = "a", descriptor = "(ZIIIIII)V")
	public static void method557(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg5 < anInt791) {
				arg4 -= anInt791 - arg5;
				arg5 = anInt791;
			}
			if (arg2 < anInt789) {
				arg3 -= anInt789 - arg2;
				arg2 = anInt789;
			}
			if (arg5 + arg4 > anInt792) {
				arg4 = anInt792 - arg5;
			}
			if (arg2 + arg3 > anInt790) {
				arg3 = anInt790 - arg2;
			}
			@Pc(45) int local45 = 256 - arg1;
			@Pc(53) int local53 = (arg6 >> 16 & 0xFF) * arg1;
			@Pc(61) int local61 = (arg6 >> 8 & 0xFF) * arg1;
			@Pc(67) int local67 = (arg6 & 0xFF) * arg1;
			if (arg0) {
				@Pc(74) int local74 = anInt787 - arg4;
				@Pc(80) int local80 = arg5 + arg2 * anInt787;
				for (@Pc(82) int local82 = 0; local82 < arg3; local82++) {
					for (@Pc(87) int local87 = -arg4; local87 < 0; local87++) {
						@Pc(99) int local99 = (anIntArray208[local80] >> 16 & 0xFF) * local45;
						@Pc(109) int local109 = (anIntArray208[local80] >> 8 & 0xFF) * local45;
						@Pc(117) int local117 = (anIntArray208[local80] & 0xFF) * local45;
						@Pc(139) int local139 = (local53 + local99 >> 8 << 16) + (local61 + local109 >> 8 << 8) + (local67 + local117 >> 8);
						anIntArray208[local80++] = local139;
					}
					local80 += local74;
				}
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("48095, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEVPLWNC", name = "a", descriptor = "(IIIIII)V")
	public static void method558(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 < anInt791) {
				arg3 -= anInt791 - arg2;
				arg2 = anInt791;
			}
			if (arg4 < anInt789) {
				arg1 -= anInt789 - arg4;
				arg4 = anInt789;
			}
			if (arg2 + arg3 > anInt792) {
				arg3 = anInt792 - arg2;
			}
			if (arg4 + arg1 > anInt790) {
				arg1 = anInt790 - arg4;
			}
			@Pc(49) int local49 = anInt787 - arg3;
			@Pc(55) int local55 = arg2 + arg4 * anInt787;
			for (@Pc(58) int local58 = -arg1; local58 < 0; local58++) {
				for (@Pc(63) int local63 = -arg3; local63 < 0; local63++) {
					anIntArray208[local55++] = arg0;
				}
				local55 += local49;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("16124, " + arg0 + ", " + 21899 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEVPLWNC", name = "b", descriptor = "(IIIIII)V")
	public static void method559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method561(arg1, arg4, arg0, arg2);
			method561(arg1, arg4, arg0, arg2 + arg3 - 1);
			method563(arg2, arg1, arg0, arg3);
			method563(arg2, arg1 + arg4 - 1, arg0, arg3);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("79975, " + arg0 + ", " + arg1 + ", " + -13126 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEVPLWNC", name = "a", descriptor = "(IIZIIII)V")
	public static void method560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method562(arg1, (byte) 8, arg2, arg3, arg0, arg4);
			method562(arg1, (byte) 8, arg2, arg3 + arg5 - 1, arg0, arg4);
			if (arg5 >= 3) {
				method564(arg1, arg0, arg5 - 2, arg2, arg3 + 1);
				method564(arg1, arg0, arg5 - 2, arg2 + arg4 - 1, arg3 + 1);
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("62199, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEVPLWNC", name = "b", descriptor = "(IIIII)V")
	public static void method561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 >= anInt789 && arg3 < anInt790) {
				if (arg0 < anInt791) {
					arg1 -= anInt791 - arg0;
					arg0 = anInt791;
				}
				if (arg0 + arg1 > anInt792) {
					arg1 = anInt792 - arg0;
				}
				@Pc(32) int local32 = arg0 + arg3 * anInt787;
				for (@Pc(37) int local37 = 0; local37 < arg1; local37++) {
					anIntArray208[local32 + local37] = arg2;
				}
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("46047, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEVPLWNC", name = "a", descriptor = "(IBIIII)V")
	private static void method562(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg3 >= anInt789 && arg3 < anInt790) {
				if (arg2 < anInt791) {
					arg5 -= anInt791 - arg2;
					arg2 = anInt791;
				}
				if (arg2 + arg5 > anInt792) {
					arg5 = anInt792 - arg2;
				}
				@Pc(32) int local32 = 256 - arg4;
				@Pc(37) boolean local37 = false;
				@Pc(49) int local49 = (arg0 >> 16 & 0xFF) * arg4;
				@Pc(57) int local57 = (arg0 >> 8 & 0xFF) * arg4;
				@Pc(63) int local63 = (arg0 & 0xFF) * arg4;
				@Pc(69) int local69 = arg2 + arg3 * anInt787;
				for (@Pc(71) int local71 = 0; local71 < arg5; local71++) {
					@Pc(83) int local83 = (anIntArray208[local69] >> 16 & 0xFF) * local32;
					@Pc(93) int local93 = (anIntArray208[local69] >> 8 & 0xFF) * local32;
					@Pc(101) int local101 = (anIntArray208[local69] & 0xFF) * local32;
					@Pc(123) int local123 = (local49 + local83 >> 8 << 16) + (local57 + local93 >> 8 << 8) + (local63 + local101 >> 8);
					anIntArray208[local69++] = local123;
				}
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("81479, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEVPLWNC", name = "c", descriptor = "(IIIII)V")
	public static void method563(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 >= anInt791 && arg1 < anInt792) {
				if (arg0 < anInt789) {
					arg3 -= anInt789 - arg0;
					arg0 = anInt789;
				}
				if (arg0 + arg3 > anInt790) {
					arg3 = anInt790 - arg0;
				}
				@Pc(39) int local39 = arg1 + arg0 * anInt787;
				for (@Pc(41) int local41 = 0; local41 < arg3; local41++) {
					anIntArray208[local39 + local41 * anInt787] = arg2;
				}
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("47186, " + 7 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEVPLWNC", name = "c", descriptor = "(IIIIII)V")
	private static void method564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 >= anInt791 && arg3 < anInt792) {
				if (arg4 < anInt789) {
					arg2 -= anInt789 - arg4;
					arg4 = anInt789;
				}
				if (arg4 + arg2 > anInt790) {
					arg2 = anInt790 - arg4;
				}
				@Pc(39) int local39 = 256 - arg1;
				@Pc(47) int local47 = (arg0 >> 16 & 0xFF) * arg1;
				@Pc(55) int local55 = (arg0 >> 8 & 0xFF) * arg1;
				@Pc(61) int local61 = (arg0 & 0xFF) * arg1;
				@Pc(67) int local67 = arg3 + arg4 * anInt787;
				for (@Pc(69) int local69 = 0; local69 < arg2; local69++) {
					@Pc(81) int local81 = (anIntArray208[local67] >> 16 & 0xFF) * local39;
					@Pc(91) int local91 = (anIntArray208[local67] >> 8 & 0xFF) * local39;
					@Pc(99) int local99 = (anIntArray208[local67] & 0xFF) * local39;
					@Pc(121) int local121 = (local47 + local81 >> 8 << 16) + (local55 + local91 >> 8 << 8) + (local61 + local99 >> 8);
					anIntArray208[local67] = local121;
					local67 += anInt787;
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("84128, " + arg0 + ", " + arg1 + ", " + 16230 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DEVPLWNC", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
