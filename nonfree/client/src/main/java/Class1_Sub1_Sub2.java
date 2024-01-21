import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gb")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "Z")
	private static boolean aBoolean186;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "[I")
	public static int[] anIntArray213;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public static int anInt707;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public static int anInt708;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	public static int anInt709;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public static int anInt710;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public static int anInt711;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	public static int anInt712;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
	public static int anInt713;

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
	public static int anInt714;

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
	public static int anInt715;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "B")
	private static byte aByte25 = 6;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "Z")
	private static boolean aBoolean185 = true;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
	private static int anInt706 = 617;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "Z")
	private static boolean aBoolean187 = true;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III[I)V")
	public static void method434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		try {
			anIntArray213 = arg3;
			anInt707 = arg2;
			anInt708 = arg0;
			@Pc(9) boolean local9 = false;
			method436(0, 0, arg2, arg0);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("86782, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	public static void method435() {
		try {
			anInt711 = 0;
			anInt709 = 0;
			anInt712 = anInt707;
			anInt710 = anInt708;
			anInt713 = anInt712 - 1;
			anInt714 = anInt712 / 2;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("88246, " + 4207 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
	public static void method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg2 > anInt707) {
				arg2 = anInt707;
			}
			if (arg3 > anInt708) {
				arg3 = anInt708;
			}
			anInt711 = arg1;
			anInt709 = arg0;
			anInt712 = arg2;
			anInt710 = arg3;
			anInt713 = anInt712 - 1;
			anInt714 = anInt712 / 2;
			anInt715 = anInt710 / 2;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("53625, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	public static void method437() {
		try {
			@Pc(3) int local3 = anInt707 * anInt708;
			for (@Pc(8) int local8 = 0; local8 < local3; local8++) {
				anIntArray213[local8] = 0;
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("46892, " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIZII)V")
	public static void method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 < anInt711) {
				arg3 -= anInt711 - arg4;
				arg4 = anInt711;
			}
			if (arg2 < anInt709) {
				arg5 -= anInt709 - arg2;
				arg2 = anInt709;
			}
			if (arg4 + arg3 > anInt712) {
				arg3 = anInt712 - arg4;
			}
			if (arg2 + arg5 > anInt710) {
				arg5 = anInt710 - arg2;
			}
			@Pc(48) int local48 = 256 - arg0;
			@Pc(56) int local56 = (arg1 >> 16 & 0xFF) * arg0;
			@Pc(64) int local64 = (arg1 >> 8 & 0xFF) * arg0;
			@Pc(70) int local70 = (arg1 & 0xFF) * arg0;
			@Pc(74) int local74 = anInt707 - arg3;
			@Pc(80) int local80 = arg4 + arg2 * anInt707;
			for (@Pc(82) int local82 = 0; local82 < arg5; local82++) {
				for (@Pc(87) int local87 = -arg3; local87 < 0; local87++) {
					@Pc(99) int local99 = (anIntArray213[local80] >> 16 & 0xFF) * local48;
					@Pc(109) int local109 = (anIntArray213[local80] >> 8 & 0xFF) * local48;
					@Pc(117) int local117 = (anIntArray213[local80] & 0xFF) * local48;
					@Pc(139) int local139 = (local56 + local99 >> 8 << 16) + (local64 + local109 >> 8 << 8) + (local70 + local117 >> 8);
					anIntArray213[local80++] = local139;
				}
				local80 += local74;
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("24524, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII)V")
	public static void method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 < anInt711) {
				arg1 -= anInt711 - arg0;
				arg0 = anInt711;
			}
			if (arg4 < anInt709) {
				arg3 -= anInt709 - arg4;
				arg4 = anInt709;
			}
			if (arg0 + arg1 > anInt712) {
				arg1 = anInt712 - arg0;
			}
			if (arg4 + arg3 > anInt710) {
				arg3 = anInt710 - arg4;
			}
			@Pc(45) int local45 = anInt707 - arg1;
			@Pc(51) int local51 = arg0 + arg4 * anInt707;
			for (@Pc(54) int local54 = -arg3; local54 < 0; local54++) {
				for (@Pc(59) int local59 = -arg1; local59 < 0; local59++) {
					anIntArray213[local51++] = arg2;
				}
				local51 += local45;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("75792, " + arg0 + ", " + arg1 + ", " + 4 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIIII)V")
	public static void method440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			method442(arg3, arg2, arg0, (byte) 6, arg4);
			method442(arg3 + arg1 - 1, arg2, arg0, (byte) 6, arg4);
			method444(arg4, arg3, 617, arg1, arg2);
			method444(arg4, arg3, 617, arg1, arg2 + arg0 - 1);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("59548, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 22320 + ", " + arg4 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIII)V")
	public static void method441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method443(arg5, aBoolean185, arg2, arg3, arg0, arg4);
			method443(arg5, aBoolean185, arg2, arg3 + arg1 - 1, arg0, arg4);
			if (arg1 >= 3) {
				method445(arg5, arg2, arg4, arg3 + 1, arg1 - 2);
				method445(arg5 + arg0 - 1, arg2, arg4, arg3 + 1, arg1 - 2);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("40784, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 2799 + ", " + arg4 + ", " + arg5 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIBI)V")
	public static void method442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg0 >= anInt709 && arg0 < anInt710) {
				if (arg1 < anInt711) {
					arg2 -= anInt711 - arg1;
					arg1 = anInt711;
				}
				if (arg1 + arg2 > anInt712) {
					arg2 = anInt712 - arg1;
				}
				@Pc(34) int local34 = arg1 + arg0 * anInt707;
				if (aByte25 == 6) {
					@Pc(39) boolean local39 = false;
					for (@Pc(43) int local43 = 0; local43 < arg2; local43++) {
						anIntArray213[local34 + local43] = arg4;
					}
				}
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("67409, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZIIII)V")
	private static void method443(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg3 >= anInt709 && arg3 < anInt710) {
				if (arg0 < anInt711) {
					arg4 -= anInt711 - arg0;
					arg0 = anInt711;
				}
				if (arg0 + arg4 > anInt712) {
					arg4 = anInt712 - arg0;
				}
				@Pc(30) int local30 = 256 - arg5;
				@Pc(38) int local38 = (arg2 >> 16 & 0xFF) * arg5;
				@Pc(46) int local46 = (arg2 >> 8 & 0xFF) * arg5;
				@Pc(52) int local52 = (arg2 & 0xFF) * arg5;
				@Pc(58) int local58 = arg0 + arg3 * anInt707;
				if (!arg1) {
					aBoolean186 = !aBoolean186;
				}
				for (@Pc(68) int local68 = 0; local68 < arg4; local68++) {
					@Pc(80) int local80 = (anIntArray213[local58] >> 16 & 0xFF) * local30;
					@Pc(90) int local90 = (anIntArray213[local58] >> 8 & 0xFF) * local30;
					@Pc(98) int local98 = (anIntArray213[local58] & 0xFF) * local30;
					@Pc(120) int local120 = (local38 + local80 >> 8 << 16) + (local46 + local90 >> 8 << 8) + (local52 + local98 >> 8);
					anIntArray213[local58++] = local120;
				}
			}
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("32948, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIII)V")
	public static void method444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg4 >= anInt711 && arg4 < anInt712) {
				if (arg1 < anInt709) {
					arg3 -= anInt709 - arg1;
					arg1 = anInt709;
				}
				if (arg1 + arg3 > anInt710) {
					arg3 = anInt710 - arg1;
				}
				@Pc(32) int local32 = arg4 + arg1 * anInt707;
				@Pc(36) boolean local36 = false;
				for (@Pc(38) int local38 = 0; local38 < arg3; local38++) {
					anIntArray213[local32 + local38 * anInt707] = arg0;
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("89174, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIBI)V")
	private static void method445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt711 && arg0 < anInt712) {
				if (arg3 < anInt709) {
					arg4 -= anInt709 - arg3;
					arg3 = anInt709;
				}
				if (arg3 + arg4 > anInt710) {
					arg4 = anInt710 - arg3;
				}
				@Pc(32) int local32 = 256 - arg2;
				@Pc(40) int local40 = (arg1 >> 16 & 0xFF) * arg2;
				@Pc(48) int local48 = (arg1 >> 8 & 0xFF) * arg2;
				@Pc(54) int local54 = (arg1 & 0xFF) * arg2;
				@Pc(60) int local60 = arg0 + arg3 * anInt707;
				for (@Pc(62) int local62 = 0; local62 < arg4; local62++) {
					@Pc(74) int local74 = (anIntArray213[local60] >> 16 & 0xFF) * local32;
					@Pc(84) int local84 = (anIntArray213[local60] >> 8 & 0xFF) * local32;
					@Pc(92) int local92 = (anIntArray213[local60] & 0xFF) * local32;
					@Pc(114) int local114 = (local40 + local74 >> 8 << 16) + (local48 + local84 >> 8 << 8) + (local54 + local92 >> 8);
					anIntArray213[local60] = local114;
					local60 += anInt707;
				}
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("45224, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 8 + ", " + arg4 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
