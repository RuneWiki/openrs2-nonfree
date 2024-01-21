import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gb")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
	private static int anInt694;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "[I")
	public static int[] anIntArray210;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
	public static int anInt696;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
	public static int anInt697;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	public static int anInt698;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public static int anInt699;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public static int anInt700;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	public static int anInt701;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public static int anInt702;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public static int anInt703;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
	public static int anInt704;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Z")
	private static boolean aBoolean172 = true;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	private static int anInt695 = 436;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II[II)V")
	public static void method431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		try {
			anIntArray210 = arg2;
			anInt696 = arg0;
			anInt697 = arg1;
			method433(arg1, arg0, 0, 0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("56820, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 9 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
	public static void method432() {
		try {
			anInt700 = 0;
			anInt698 = 0;
			anInt701 = anInt696;
			anInt699 = anInt697;
			anInt702 = anInt701 - 1;
			anInt703 = anInt701 / 2;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("44120, " + true + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
	public static void method433(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg2 < 0) {
				arg2 = 0;
			}
			if (arg3 < 0) {
				arg3 = 0;
			}
			if (arg1 > anInt696) {
				arg1 = anInt696;
			}
			if (arg0 > anInt697) {
				arg0 = anInt697;
			}
			anInt700 = arg2;
			anInt698 = arg3;
			anInt701 = arg1;
			anInt699 = arg0;
			anInt702 = anInt701 - 1;
			anInt703 = anInt701 / 2;
			anInt704 = anInt699 / 2;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("30642, " + 5 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	public static void method434() {
		try {
			@Pc(3) int local3 = anInt696 * anInt697;
			for (@Pc(12) int local12 = 0; local12 < local3; local12++) {
				anIntArray210[local12] = 0;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("16285, " + 8 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIII)V")
	public static void method435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg4 < anInt700) {
				arg0 -= anInt700 - arg4;
				arg4 = anInt700;
			}
			if (arg2 < anInt698) {
				arg1 -= anInt698 - arg2;
				arg2 = anInt698;
			}
			if (arg4 + arg0 > anInt701) {
				arg0 = anInt701 - arg4;
			}
			if (arg2 + arg1 > anInt699) {
				arg1 = anInt699 - arg2;
			}
			@Pc(48) int local48 = 256 - arg5;
			@Pc(56) int local56 = (arg3 >> 16 & 0xFF) * arg5;
			@Pc(64) int local64 = (arg3 >> 8 & 0xFF) * arg5;
			@Pc(70) int local70 = (arg3 & 0xFF) * arg5;
			@Pc(74) int local74 = anInt696 - arg0;
			@Pc(80) int local80 = arg4 + arg2 * anInt696;
			for (@Pc(82) int local82 = 0; local82 < arg1; local82++) {
				for (@Pc(87) int local87 = -arg0; local87 < 0; local87++) {
					@Pc(99) int local99 = (anIntArray210[local80] >> 16 & 0xFF) * local48;
					@Pc(109) int local109 = (anIntArray210[local80] >> 8 & 0xFF) * local48;
					@Pc(117) int local117 = (anIntArray210[local80] & 0xFF) * local48;
					@Pc(139) int local139 = (local56 + local99 >> 8 << 16) + (local64 + local109 >> 8 << 8) + (local70 + local117 >> 8);
					anIntArray210[local80++] = local139;
				}
				local80 += local74;
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("89970, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 0 + ", " + arg5 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII)V")
	public static void method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg3 < anInt700) {
				arg2 -= anInt700 - arg3;
				arg3 = anInt700;
			}
			if (arg4 < anInt698) {
				arg0 -= anInt698 - arg4;
				arg4 = anInt698;
			}
			if (arg3 + arg2 > anInt701) {
				arg2 = anInt701 - arg3;
			}
			if (arg4 + arg0 > anInt699) {
				arg0 = anInt699 - arg4;
			}
			@Pc(54) int local54 = anInt696 - arg2;
			@Pc(60) int local60 = arg3 + arg4 * anInt696;
			for (@Pc(63) int local63 = -arg0; local63 < 0; local63++) {
				for (@Pc(68) int local68 = -arg2; local68 < 0; local68++) {
					anIntArray210[local60++] = arg1;
				}
				local60 += local54;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("47691, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIIII)V")
	public static void method437(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			method439(arg0, arg1, arg3, arg4);
			method439(arg0, arg1, arg3, arg4 + arg2 - 1);
			method441(arg1, arg2, arg3, 384, arg4);
			method441(arg1, arg2, arg3 + arg0 - 1, 384, arg4);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("2792, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 394 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZIIIII)V")
	public static void method438(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method440(arg0, arg1, arg5, arg2, anInt694, arg3);
			method440(arg0, arg1 + arg4 - 1, arg5, arg2, anInt694, arg3);
			if (arg4 >= 3) {
				method442(arg2, arg4 - 2, arg1 + 1, arg3, arg5);
				method442(arg2 + arg0 - 1, arg4 - 2, arg1 + 1, arg3, arg5);
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("46959, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIBI)V")
	public static void method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 >= anInt698 && arg3 < anInt699) {
				if (arg2 < anInt700) {
					arg0 -= anInt700 - arg2;
					arg2 = anInt700;
				}
				if (arg2 + arg0 > anInt701) {
					arg0 = anInt701 - arg2;
				}
				@Pc(32) int local32 = arg2 + arg3 * anInt696;
				for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
					anIntArray210[local32 + local38] = arg1;
				}
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("68448, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 125 + ", " + arg3 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(IIIIII)V")
	private static void method440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg1 >= anInt698 && arg1 < anInt699) {
				if (arg3 < anInt700) {
					arg0 -= anInt700 - arg3;
					arg3 = anInt700;
				}
				if (arg3 + arg0 > anInt701) {
					arg0 = anInt701 - arg3;
				}
				@Pc(30) int local30 = 256 - arg2;
				@Pc(38) int local38 = (arg5 >> 16 & 0xFF) * arg2;
				@Pc(46) int local46 = (arg5 >> 8 & 0xFF) * arg2;
				@Pc(52) int local52 = (arg5 & 0xFF) * arg2;
				@Pc(58) int local58 = arg3 + arg1 * anInt696;
				for (@Pc(60) int local60 = 0; local60 < arg0; local60++) {
					@Pc(72) int local72 = (anIntArray210[local58] >> 16 & 0xFF) * local30;
					@Pc(82) int local82 = (anIntArray210[local58] >> 8 & 0xFF) * local30;
					@Pc(90) int local90 = (anIntArray210[local58] & 0xFF) * local30;
					@Pc(112) int local112 = (local38 + local72 >> 8 << 16) + (local46 + local82 >> 8 << 8) + (local52 + local90 >> 8);
					anIntArray210[local58++] = local112;
				}
				if (arg4 < 0 || arg4 > 0) {
					;
				}
			}
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("2358, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIII)V")
	public static void method441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			if (arg2 >= anInt700 && arg2 < anInt701) {
				if (arg4 < anInt698) {
					arg1 -= anInt698 - arg4;
					arg4 = anInt698;
				}
				if (arg4 + arg1 > anInt699) {
					arg1 = anInt699 - arg4;
				}
				@Pc(32) int local32 = arg2 + arg4 * anInt696;
				@Pc(36) boolean local36 = false;
				for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
					anIntArray210[local32 + local38 * anInt696] = arg0;
				}
			}
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("83053, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIZII)V")
	private static void method442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt700 && arg0 < anInt701) {
				if (arg2 < anInt698) {
					arg1 -= anInt698 - arg2;
					arg2 = anInt698;
				}
				if (arg2 + arg1 > anInt699) {
					arg1 = anInt699 - arg2;
				}
				@Pc(30) int local30 = 256 - arg4;
				@Pc(38) int local38 = (arg3 >> 16 & 0xFF) * arg4;
				@Pc(46) int local46 = (arg3 >> 8 & 0xFF) * arg4;
				@Pc(52) int local52 = (arg3 & 0xFF) * arg4;
				@Pc(61) int local61 = arg0 + arg2 * anInt696;
				for (@Pc(63) int local63 = 0; local63 < arg1; local63++) {
					@Pc(75) int local75 = (anIntArray210[local61] >> 16 & 0xFF) * local30;
					@Pc(85) int local85 = (anIntArray210[local61] >> 8 & 0xFF) * local30;
					@Pc(93) int local93 = (anIntArray210[local61] & 0xFF) * local30;
					@Pc(115) int local115 = (local38 + local75 >> 8 << 16) + (local46 + local85 >> 8 << 8) + (local52 + local93 >> 8);
					anIntArray210[local61] = local115;
					local61 += anInt696;
				}
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("19229, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
