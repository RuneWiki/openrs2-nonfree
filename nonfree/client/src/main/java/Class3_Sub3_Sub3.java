import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KPYGFVMA")
public class Class3_Sub3_Sub3 extends Class3_Sub3 {

	@OriginalMember(owner = "client!KPYGFVMA", name = "k", descriptor = "Z")
	private static boolean aBoolean188;

	@OriginalMember(owner = "client!KPYGFVMA", name = "l", descriptor = "[I")
	public static int[] anIntArray204;

	@OriginalMember(owner = "client!KPYGFVMA", name = "m", descriptor = "I")
	public static int anInt815;

	@OriginalMember(owner = "client!KPYGFVMA", name = "n", descriptor = "I")
	public static int anInt816;

	@OriginalMember(owner = "client!KPYGFVMA", name = "o", descriptor = "I")
	public static int anInt817;

	@OriginalMember(owner = "client!KPYGFVMA", name = "p", descriptor = "I")
	public static int anInt818;

	@OriginalMember(owner = "client!KPYGFVMA", name = "q", descriptor = "I")
	public static int anInt819;

	@OriginalMember(owner = "client!KPYGFVMA", name = "r", descriptor = "I")
	public static int anInt820;

	@OriginalMember(owner = "client!KPYGFVMA", name = "s", descriptor = "I")
	public static int anInt821;

	@OriginalMember(owner = "client!KPYGFVMA", name = "t", descriptor = "I")
	public static int anInt822;

	@OriginalMember(owner = "client!KPYGFVMA", name = "u", descriptor = "I")
	public static int anInt823;

	@OriginalMember(owner = "client!KPYGFVMA", name = "i", descriptor = "I")
	private static int anInt813 = -39;

	@OriginalMember(owner = "client!KPYGFVMA", name = "j", descriptor = "I")
	private static int anInt814 = -26550;

	@OriginalMember(owner = "client!KPYGFVMA", name = "a", descriptor = "(IBI[I)V")
	public static void method547(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			anIntArray204 = arg2;
			anInt815 = arg0;
			anInt816 = arg1;
			method549(0, arg1, arg0, 0);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("14397, " + arg0 + ", " + 28 + ", " + arg1 + ", " + arg2 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPYGFVMA", name = "a", descriptor = "(I)V")
	public static void method548() {
		try {
			anInt819 = 0;
			anInt817 = 0;
			anInt820 = anInt815;
			anInt818 = anInt816;
			anInt821 = anInt820 - 1;
			anInt822 = anInt820 / 2;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("14504, " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPYGFVMA", name = "a", descriptor = "(IIIII)V")
	public static void method549(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg2 > anInt815) {
				arg2 = anInt815;
			}
			if (arg1 > anInt816) {
				arg1 = anInt816;
			}
			anInt819 = arg3;
			anInt817 = arg0;
			anInt820 = arg2;
			anInt818 = arg1;
			anInt821 = anInt820 - 1;
			anInt822 = anInt820 / 2;
			anInt823 = anInt818 / 2;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("2102, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPYGFVMA", name = "a", descriptor = "(B)V")
	public static void method550() {
		try {
			@Pc(8) int local8 = anInt815 * anInt816;
			for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
				anIntArray204[local10] = 0;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("65952, " + 73 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPYGFVMA", name = "a", descriptor = "(IIIIIII)V")
	public static void method551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 < anInt819) {
				arg3 -= anInt819 - arg1;
				arg1 = anInt819;
			}
			if (arg5 < anInt817) {
				arg4 -= anInt817 - arg5;
				arg5 = anInt817;
			}
			if (arg1 + arg3 > anInt820) {
				arg3 = anInt820 - arg1;
			}
			if (arg5 + arg4 > anInt818) {
				arg4 = anInt818 - arg5;
			}
			@Pc(45) int local45 = 256 - arg2;
			@Pc(53) int local53 = (arg0 >> 16 & 0xFF) * arg2;
			@Pc(61) int local61 = (arg0 >> 8 & 0xFF) * arg2;
			@Pc(67) int local67 = (arg0 & 0xFF) * arg2;
			@Pc(71) int local71 = anInt815 - arg3;
			@Pc(76) int local76;
			if (anInt814 != -26550) {
				for (local76 = 1; local76 > 0; local76++) {
				}
			}
			local76 = arg1 + arg5 * anInt815;
			for (@Pc(89) int local89 = 0; local89 < arg4; local89++) {
				for (@Pc(94) int local94 = -arg3; local94 < 0; local94++) {
					@Pc(106) int local106 = (anIntArray204[local76] >> 16 & 0xFF) * local45;
					@Pc(116) int local116 = (anIntArray204[local76] >> 8 & 0xFF) * local45;
					@Pc(124) int local124 = (anIntArray204[local76] & 0xFF) * local45;
					@Pc(146) int local146 = (local53 + local106 >> 8 << 16) + (local61 + local116 >> 8 << 8) + (local67 + local124 >> 8);
					anIntArray204[local76++] = local146;
				}
				local76 += local71;
			}
		} catch (@Pc(164) RuntimeException local164) {
			signlink.reporterror("58176, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -26550 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local164.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPYGFVMA", name = "a", descriptor = "(IBIIII)V")
	public static void method552(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg2 < anInt819) {
				arg5 -= anInt819 - arg2;
				arg2 = anInt819;
			}
			if (arg3 < anInt817) {
				arg4 -= anInt817 - arg3;
				arg3 = anInt817;
			}
			if (arg2 + arg5 > anInt820) {
				arg5 = anInt820 - arg2;
			}
			if (arg3 + arg4 > anInt818) {
				arg4 = anInt818 - arg3;
			}
			@Pc(45) int local45 = anInt815 - arg5;
			if (arg1 == 0) {
				@Pc(49) boolean local49 = false;
				@Pc(57) int local57 = arg2 + arg3 * anInt815;
				for (@Pc(60) int local60 = -arg4; local60 < 0; local60++) {
					for (@Pc(66) int local66 = -arg5; local66 < 0; local66++) {
						anIntArray204[local57++] = arg0;
					}
					local57 += local45;
				}
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("15721, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPYGFVMA", name = "a", descriptor = "(IIIIII)V")
	public static void method553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			method555(arg1, arg0, arg3, arg4);
			method555(arg1 + arg2 - 1, arg0, arg3, arg4);
			method557(arg3, arg4, arg1, arg2);
			method557(arg3 + arg0 - 1, arg4, arg1, arg2);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("51923, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPYGFVMA", name = "b", descriptor = "(IIIIIII)V")
	public static void method554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method556(arg3, arg4, arg1, arg2, arg5);
			method556(arg3, arg4, arg1, arg2, arg5 + arg0 - 1);
			if (arg0 >= 3) {
				method558(arg4, arg5 + 1, arg2, arg0 - 2, arg3);
				method558(arg4 + arg1 - 1, arg5 + 1, arg2, arg0 - 2, arg3);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("30676, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPYGFVMA", name = "a", descriptor = "(IIZII)V")
	public static void method555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 >= anInt817 && arg0 < anInt818) {
				if (arg2 < anInt819) {
					arg1 -= anInt819 - arg2;
					arg2 = anInt819;
				}
				if (arg2 + arg1 > anInt820) {
					arg1 = anInt820 - arg2;
				}
				@Pc(34) int local34 = arg2 + arg0 * anInt815;
				for (@Pc(45) int local45 = 0; local45 < arg1; local45++) {
					anIntArray204[local34 + local45] = arg3;
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("59772, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPYGFVMA", name = "b", descriptor = "(IIIIII)V")
	private static void method556(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg4 >= anInt817 && arg4 < anInt818) {
				if (arg1 < anInt819) {
					arg2 -= anInt819 - arg1;
					arg1 = anInt819;
				}
				if (arg1 + arg2 > anInt820) {
					arg2 = anInt820 - arg1;
				}
				@Pc(32) int local32 = 256 - arg0;
				@Pc(45) int local45 = (arg3 >> 16 & 0xFF) * arg0;
				@Pc(53) int local53 = (arg3 >> 8 & 0xFF) * arg0;
				@Pc(59) int local59 = (arg3 & 0xFF) * arg0;
				@Pc(65) int local65 = arg1 + arg4 * anInt815;
				for (@Pc(67) int local67 = 0; local67 < arg2; local67++) {
					@Pc(79) int local79 = (anIntArray204[local65] >> 16 & 0xFF) * local32;
					@Pc(89) int local89 = (anIntArray204[local65] >> 8 & 0xFF) * local32;
					@Pc(97) int local97 = (anIntArray204[local65] & 0xFF) * local32;
					@Pc(119) int local119 = (local45 + local79 >> 8 << 16) + (local53 + local89 >> 8 << 8) + (local59 + local97 >> 8);
					anIntArray204[local65++] = local119;
				}
			}
		} catch (@Pc(130) RuntimeException local130) {
			signlink.reporterror("93880, " + arg0 + ", " + -186 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local130.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPYGFVMA", name = "a", descriptor = "(BIIII)V")
	public static void method557(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg0 >= anInt819 && arg0 < anInt820) {
				if (arg2 < anInt817) {
					arg3 -= anInt817 - arg2;
					arg2 = anInt817;
				}
				if (arg2 + arg3 > anInt818) {
					arg3 = anInt818 - arg2;
				}
				@Pc(32) int local32 = arg0 + arg2 * anInt815;
				for (@Pc(39) int local39 = 0; local39 < arg3; local39++) {
					anIntArray204[local32 + local39 * anInt815] = arg1;
				}
			}
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("30947, " + 109 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPYGFVMA", name = "a", descriptor = "(IIIBII)V")
	private static void method558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt819 && arg0 < anInt820) {
				if (arg1 < anInt817) {
					arg3 -= anInt817 - arg1;
					arg1 = anInt817;
				}
				if (arg1 + arg3 > anInt818) {
					arg3 = anInt818 - arg1;
				}
				@Pc(30) int local30 = 256 - arg4;
				@Pc(38) int local38 = (arg2 >> 16 & 0xFF) * arg4;
				@Pc(46) int local46 = (arg2 >> 8 & 0xFF) * arg4;
				@Pc(52) int local52 = (arg2 & 0xFF) * arg4;
				@Pc(67) int local67 = arg0 + arg1 * anInt815;
				for (@Pc(69) int local69 = 0; local69 < arg3; local69++) {
					@Pc(81) int local81 = (anIntArray204[local67] >> 16 & 0xFF) * local30;
					@Pc(91) int local91 = (anIntArray204[local67] >> 8 & 0xFF) * local30;
					@Pc(99) int local99 = (anIntArray204[local67] & 0xFF) * local30;
					@Pc(121) int local121 = (local38 + local81 >> 8 << 16) + (local46 + local91 >> 8 << 8) + (local52 + local99 >> 8);
					anIntArray204[local67] = local121;
					local67 += anInt815;
				}
			}
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("34410, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -100 + ", " + arg3 + ", " + arg4 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPYGFVMA", name = "<init>", descriptor = "()V")
	protected Class3_Sub3_Sub3() {
	}
}
