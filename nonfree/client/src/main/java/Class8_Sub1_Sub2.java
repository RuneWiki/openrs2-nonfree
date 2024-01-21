import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MVOWZCMY")
public class Class8_Sub1_Sub2 extends Class8_Sub1 {

	@OriginalMember(owner = "client!MVOWZCMY", name = "m", descriptor = "[I")
	public static int[] anIntArray204;

	@OriginalMember(owner = "client!MVOWZCMY", name = "n", descriptor = "I")
	public static int anInt786;

	@OriginalMember(owner = "client!MVOWZCMY", name = "o", descriptor = "I")
	public static int anInt787;

	@OriginalMember(owner = "client!MVOWZCMY", name = "p", descriptor = "I")
	public static int anInt788;

	@OriginalMember(owner = "client!MVOWZCMY", name = "q", descriptor = "I")
	public static int anInt789;

	@OriginalMember(owner = "client!MVOWZCMY", name = "r", descriptor = "I")
	public static int anInt790;

	@OriginalMember(owner = "client!MVOWZCMY", name = "s", descriptor = "I")
	public static int anInt791;

	@OriginalMember(owner = "client!MVOWZCMY", name = "t", descriptor = "I")
	public static int anInt792;

	@OriginalMember(owner = "client!MVOWZCMY", name = "u", descriptor = "I")
	public static int anInt793;

	@OriginalMember(owner = "client!MVOWZCMY", name = "v", descriptor = "I")
	public static int anInt794;

	@OriginalMember(owner = "client!MVOWZCMY", name = "h", descriptor = "I")
	private static int anInt783 = -705;

	@OriginalMember(owner = "client!MVOWZCMY", name = "i", descriptor = "I")
	private static int anInt784 = -34;

	@OriginalMember(owner = "client!MVOWZCMY", name = "j", descriptor = "I")
	private static int anInt785 = -487;

	@OriginalMember(owner = "client!MVOWZCMY", name = "k", descriptor = "B")
	private static byte aByte28 = -24;

	@OriginalMember(owner = "client!MVOWZCMY", name = "l", descriptor = "Z")
	private static boolean aBoolean193 = true;

	@OriginalMember(owner = "client!MVOWZCMY", name = "a", descriptor = "(III[I)V")
	public static void method548(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		try {
			anIntArray204 = arg2;
			anInt786 = arg1;
			anInt787 = arg0;
			method550(0, 0, arg1, arg0);
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("86560, " + arg0 + ", " + 26380 + ", " + arg1 + ", " + arg2 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVOWZCMY", name = "a", descriptor = "(I)V")
	public static void method549() {
		try {
			anInt790 = 0;
			anInt788 = 0;
			anInt791 = anInt786;
			anInt789 = anInt787;
			anInt792 = anInt791 - 1;
			anInt793 = anInt791 / 2;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("4393, " + 2 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVOWZCMY", name = "a", descriptor = "(IIIII)V")
	public static void method550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg2 > anInt786) {
				arg2 = anInt786;
			}
			if (arg3 > anInt787) {
				arg3 = anInt787;
			}
			anInt790 = arg1;
			anInt788 = arg0;
			anInt791 = arg2;
			anInt789 = arg3;
			anInt792 = anInt791 - 1;
			anInt793 = anInt791 / 2;
			anInt794 = anInt789 / 2;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("97850, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 14641 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVOWZCMY", name = "b", descriptor = "(I)V")
	public static void method551() {
		try {
			@Pc(5) int local5 = anInt786 * anInt787;
			for (@Pc(12) int local12 = 0; local12 < local5; local12++) {
				anIntArray204[local12] = 0;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("28799, " + -793 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVOWZCMY", name = "a", descriptor = "(IIIIIII)V")
	public static void method552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		try {
			if (arg1 < anInt790) {
				arg0 -= anInt790 - arg1;
				arg1 = anInt790;
			}
			if (arg3 < anInt788) {
				arg5 -= anInt788 - arg3;
				arg3 = anInt788;
			}
			if (arg1 + arg0 > anInt791) {
				arg0 = anInt791 - arg1;
			}
			if (arg3 + arg5 > anInt789) {
				arg5 = anInt789 - arg3;
			}
			@Pc(45) int local45 = 256 - arg4;
			@Pc(53) int local53 = (arg2 >> 16 & 0xFF) * arg4;
			@Pc(61) int local61 = (arg2 >> 8 & 0xFF) * arg4;
			@Pc(67) int local67 = (arg2 & 0xFF) * arg4;
			if (arg6 < 0) {
				@Pc(74) int local74 = anInt786 - arg0;
				@Pc(80) int local80 = arg1 + arg3 * anInt786;
				for (@Pc(82) int local82 = 0; local82 < arg5; local82++) {
					for (@Pc(87) int local87 = -arg0; local87 < 0; local87++) {
						@Pc(99) int local99 = (anIntArray204[local80] >> 16 & 0xFF) * local45;
						@Pc(109) int local109 = (anIntArray204[local80] >> 8 & 0xFF) * local45;
						@Pc(117) int local117 = (anIntArray204[local80] & 0xFF) * local45;
						@Pc(139) int local139 = (local53 + local99 >> 8 << 16) + (local61 + local109 >> 8 << 8) + (local67 + local117 >> 8);
						anIntArray204[local80++] = local139;
					}
					local80 += local74;
				}
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("89895, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVOWZCMY", name = "a", descriptor = "(IIIIII)V")
	public static void method553(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg2 < anInt790) {
				arg0 -= anInt790 - arg2;
				arg2 = anInt790;
			}
			if (arg4 < anInt788) {
				arg3 -= anInt788 - arg4;
				arg4 = anInt788;
			}
			if (arg2 + arg0 > anInt791) {
				arg0 = anInt791 - arg2;
			}
			if (arg4 + arg3 > anInt789) {
				arg3 = anInt789 - arg4;
			}
			@Pc(45) int local45 = anInt786 - arg0;
			@Pc(59) int local59 = arg2 + arg4 * anInt786;
			for (@Pc(62) int local62 = -arg3; local62 < 0; local62++) {
				for (@Pc(67) int local67 = -arg0; local67 < 0; local67++) {
					anIntArray204[local59++] = arg1;
				}
				local59 += local45;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("42655, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVOWZCMY", name = "b", descriptor = "(IIIIII)V")
	public static void method554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			method556(arg1, arg2, arg0, arg3);
			method556(arg1, arg2 + arg4 - 1, arg0, arg3);
			method558(arg2, arg1, arg4, arg0);
			method558(arg2, arg1, arg4, arg0 + arg3 - 1);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("65064, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 903 + ", " + arg3 + ", " + arg4 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVOWZCMY", name = "b", descriptor = "(IIIIIII)V")
	public static void method555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method557(arg5, arg4, 153, arg3, arg0, arg2);
			method557(arg5, arg4, 153, arg3 + arg1 - 1, arg0, arg2);
			if (arg1 >= 3) {
				method559(arg4, arg3 + 1, arg1 - 2, arg5, arg0);
				method559(arg4 + arg2 - 1, arg3 + 1, arg1 - 2, arg5, arg0);
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("92291, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -487 + ", " + arg4 + ", " + arg5 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVOWZCMY", name = "b", descriptor = "(IIIII)V")
	public static void method556(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 >= anInt788 && arg1 < anInt789) {
				if (arg2 < anInt790) {
					arg3 -= anInt790 - arg2;
					arg2 = anInt790;
				}
				if (arg2 + arg3 > anInt791) {
					arg3 = anInt791 - arg2;
				}
				@Pc(43) int local43 = arg2 + arg1 * anInt786;
				for (@Pc(45) int local45 = 0; local45 < arg3; local45++) {
					anIntArray204[local43 + local45] = arg0;
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("41843, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVOWZCMY", name = "c", descriptor = "(IIIIII)V")
	private static void method557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg3 >= anInt788 && arg3 < anInt789) {
				if (arg1 < anInt790) {
					arg5 -= anInt790 - arg1;
					arg1 = anInt790;
				}
				if (arg1 + arg5 > anInt791) {
					arg5 = anInt791 - arg1;
				}
				@Pc(30) int local30 = 256 - arg4;
				@Pc(38) int local38 = (arg0 >> 16 & 0xFF) * arg4;
				@Pc(46) int local46 = (arg0 >> 8 & 0xFF) * arg4;
				@Pc(52) int local52 = (arg0 & 0xFF) * arg4;
				@Pc(58) int local58 = arg1 + arg3 * anInt786;
				for (@Pc(60) int local60 = 0; local60 < arg5; local60++) {
					@Pc(72) int local72 = (anIntArray204[local58] >> 16 & 0xFF) * local30;
					@Pc(82) int local82 = (anIntArray204[local58] >> 8 & 0xFF) * local30;
					@Pc(90) int local90 = (anIntArray204[local58] & 0xFF) * local30;
					@Pc(112) int local112 = (local38 + local72 >> 8 << 16) + (local46 + local82 >> 8 << 8) + (local52 + local90 >> 8);
					anIntArray204[local58++] = local112;
				}
				@Pc(125) boolean local125 = false;
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("14328, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVOWZCMY", name = "a", descriptor = "(IIIIZ)V")
	public static void method558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg3 >= anInt790 && arg3 < anInt791) {
				if (arg0 < anInt788) {
					arg2 -= anInt788 - arg0;
					arg0 = anInt788;
				}
				if (arg0 + arg2 > anInt789) {
					arg2 = anInt789 - arg0;
				}
				@Pc(32) int local32 = arg3 + arg0 * anInt786;
				for (@Pc(37) int local37 = 0; local37 < arg2; local37++) {
					anIntArray204[local32 + local37 * anInt786] = arg1;
				}
			}
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("37539, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVOWZCMY", name = "a", descriptor = "(IIIIZI)V")
	private static void method559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt790 && arg0 < anInt791) {
				if (arg1 < anInt788) {
					arg2 -= anInt788 - arg1;
					arg1 = anInt788;
				}
				if (arg1 + arg2 > anInt789) {
					arg2 = anInt789 - arg1;
				}
				@Pc(30) int local30 = 256 - arg4;
				@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
				@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
				@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
				@Pc(61) int local61 = arg0 + arg1 * anInt786;
				for (@Pc(63) int local63 = 0; local63 < arg2; local63++) {
					@Pc(75) int local75 = (anIntArray204[local61] >> 16 & 0xFF) * local30;
					@Pc(85) int local85 = (anIntArray204[local61] >> 8 & 0xFF) * local30;
					@Pc(93) int local93 = (anIntArray204[local61] & 0xFF) * local30;
					@Pc(115) int local115 = (local38 + local75 >> 8 << 16) + (local46 + local85 >> 8 << 8) + (local52 + local93 >> 8);
					anIntArray204[local61] = local115;
					local61 += anInt786;
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("44024, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MVOWZCMY", name = "<init>", descriptor = "()V")
	protected Class8_Sub1_Sub2() {
	}
}
