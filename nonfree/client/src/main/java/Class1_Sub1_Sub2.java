import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!gb")
public class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "[I")
	public static int[] anIntArray213;

	@OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
	public static int anInt696;

	@OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
	public static int anInt697;

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
	public static int anInt698;

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
	public static int anInt699;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	public static int anInt700;

	@OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
	public static int anInt701;

	@OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
	public static int anInt702;

	@OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
	public static int anInt703;

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public static int anInt704;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Z")
	private static boolean aBoolean176 = true;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
	private static int anInt695 = -452;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III[I)V")
	public static void method434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		try {
			anIntArray213 = arg3;
			anInt696 = arg0;
			anInt697 = arg2;
			method436(0, 0, arg2, arg0);
			@Pc(15) boolean local15 = false;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("7531, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
	public static void method435() {
		try {
			anInt700 = 0;
			anInt698 = 0;
			anInt701 = anInt696;
			anInt699 = anInt697;
			anInt702 = anInt701 - 1;
			anInt703 = anInt701 / 2;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("88541, " + true + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZIIII)V")
	public static void method436(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg0 < 0) {
				arg0 = 0;
			}
			if (arg3 > anInt696) {
				arg3 = anInt696;
			}
			if (arg2 > anInt697) {
				arg2 = anInt697;
			}
			anInt700 = arg1;
			anInt698 = arg0;
			anInt701 = arg3;
			anInt699 = arg2;
			anInt702 = anInt701 - 1;
			anInt703 = anInt701 / 2;
			anInt704 = anInt699 / 2;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("82951, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)V")
	public static void method437(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(5) int local5;
			if (arg0) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			local5 = anInt696 * anInt697;
			for (@Pc(16) int local16 = 0; local16 < local5; local16++) {
				anIntArray213[local16] = 0;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("2626, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIIII)V")
	public static void method438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			if (arg1 < anInt700) {
				arg4 -= anInt700 - arg1;
				arg1 = anInt700;
			}
			if (arg0 < anInt698) {
				arg5 -= anInt698 - arg0;
				arg0 = anInt698;
			}
			if (arg1 + arg4 > anInt701) {
				arg4 = anInt701 - arg1;
			}
			if (arg0 + arg5 > anInt699) {
				arg5 = anInt699 - arg0;
			}
			@Pc(45) int local45 = 256 - arg2;
			@Pc(53) int local53 = (arg3 >> 16 & 0xFF) * arg2;
			@Pc(61) int local61 = (arg3 >> 8 & 0xFF) * arg2;
			@Pc(67) int local67 = (arg3 & 0xFF) * arg2;
			@Pc(71) int local71 = anInt696 - arg4;
			@Pc(77) int local77 = arg1 + arg0 * anInt696;
			for (@Pc(79) int local79 = 0; local79 < arg5; local79++) {
				for (@Pc(84) int local84 = -arg4; local84 < 0; local84++) {
					@Pc(96) int local96 = (anIntArray213[local77] >> 16 & 0xFF) * local45;
					@Pc(106) int local106 = (anIntArray213[local77] >> 8 & 0xFF) * local45;
					@Pc(114) int local114 = (anIntArray213[local77] & 0xFF) * local45;
					@Pc(136) int local136 = (local53 + local96 >> 8 << 16) + (local61 + local106 >> 8 << 8) + (local67 + local114 >> 8);
					anIntArray213[local77++] = local136;
				}
				local77 += local71;
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("57815, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIZII)V")
	public static void method439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 < anInt700) {
				arg1 -= anInt700 - arg0;
				arg0 = anInt700;
			}
			if (arg3 < anInt698) {
				arg4 -= anInt698 - arg3;
				arg3 = anInt698;
			}
			if (arg0 + arg1 > anInt701) {
				arg1 = anInt701 - arg0;
			}
			if (arg3 + arg4 > anInt699) {
				arg4 = anInt699 - arg3;
			}
			@Pc(45) int local45 = anInt696 - arg1;
			@Pc(51) int local51 = arg0 + arg3 * anInt696;
			for (@Pc(57) int local57 = -arg4; local57 < 0; local57++) {
				for (@Pc(62) int local62 = -arg1; local62 < 0; local62++) {
					anIntArray213[local51++] = arg2;
				}
				local51 += local45;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("30063, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIIII)V")
	public static void method440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		try {
			method442(arg4, arg0, arg2, arg1);
			method442(arg4, arg0, arg2, arg1 + arg3 - 1);
			method444(arg2, arg4, arg3, arg1);
			method444(arg2 + arg0 - 1, arg4, arg3, arg1);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("31359, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -585 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BIIIIII)V")
	public static void method441(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		try {
			method443((byte) 2, arg1, arg3, arg0, arg5, arg4);
			method443((byte) 2, arg1, arg3 + arg2 - 1, arg0, arg5, arg4);
			if (arg2 >= 3) {
				method445(arg4, arg2 - 2, arg5, arg3 + 1, arg0);
				method445(arg4 + arg1 - 1, arg2 - 2, arg5, arg3 + 1, arg0);
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("72493, " + 34 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZII)V")
	public static void method442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			if (arg3 >= anInt698 && arg3 < anInt699) {
				if (arg2 < anInt700) {
					arg1 -= anInt700 - arg2;
					arg2 = anInt700;
				}
				if (arg2 + arg1 > anInt701) {
					arg1 = anInt701 - arg2;
				}
				@Pc(35) int local35 = arg2 + arg3 * anInt696;
				for (@Pc(37) int local37 = 0; local37 < arg1; local37++) {
					anIntArray213[local35 + local37] = arg0;
				}
			}
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("46754, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BIIIII)V")
	private static void method443(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		try {
			if (arg2 >= anInt698 && arg2 < anInt699) {
				if (arg5 < anInt700) {
					arg1 -= anInt700 - arg5;
					arg5 = anInt700;
				}
				if (arg5 + arg1 > anInt701) {
					arg1 = anInt701 - arg5;
				}
				@Pc(32) int local32 = 256 - arg4;
				@Pc(40) int local40 = (arg3 >> 16 & 0xFF) * arg4;
				@Pc(48) int local48 = (arg3 >> 8 & 0xFF) * arg4;
				@Pc(54) int local54 = (arg3 & 0xFF) * arg4;
				@Pc(60) int local60 = arg5 + arg2 * anInt696;
				@Pc(65) boolean local65 = false;
				for (@Pc(70) int local70 = 0; local70 < arg1; local70++) {
					@Pc(82) int local82 = (anIntArray213[local60] >> 16 & 0xFF) * local32;
					@Pc(92) int local92 = (anIntArray213[local60] >> 8 & 0xFF) * local32;
					@Pc(100) int local100 = (anIntArray213[local60] & 0xFF) * local32;
					@Pc(122) int local122 = (local40 + local82 >> 8 << 16) + (local48 + local92 >> 8 << 8) + (local54 + local100 >> 8);
					anIntArray213[local60++] = local122;
				}
			}
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("29633, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
	public static void method444(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg0 >= anInt700 && arg0 < anInt701) {
				if (arg3 < anInt698) {
					arg2 -= anInt698 - arg3;
					arg3 = anInt698;
				}
				if (arg3 + arg2 > anInt699) {
					arg2 = anInt699 - arg3;
				}
				@Pc(43) int local43 = arg0 + arg3 * anInt696;
				for (@Pc(45) int local45 = 0; local45 < arg2; local45++) {
					anIntArray213[local43 + local45 * anInt696] = arg1;
				}
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("67809, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 476 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(IIIIII)V")
	private static void method445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		try {
			if (arg0 >= anInt700 && arg0 < anInt701) {
				if (arg3 < anInt698) {
					arg1 -= anInt698 - arg3;
					arg3 = anInt698;
				}
				if (arg3 + arg1 > anInt699) {
					arg1 = anInt699 - arg3;
				}
				@Pc(30) int local30 = 256 - arg2;
				@Pc(50) int local50 = (arg4 >> 16 & 0xFF) * arg2;
				@Pc(58) int local58 = (arg4 >> 8 & 0xFF) * arg2;
				@Pc(64) int local64 = (arg4 & 0xFF) * arg2;
				@Pc(70) int local70 = arg0 + arg3 * anInt696;
				for (@Pc(72) int local72 = 0; local72 < arg1; local72++) {
					@Pc(84) int local84 = (anIntArray213[local70] >> 16 & 0xFF) * local30;
					@Pc(94) int local94 = (anIntArray213[local70] >> 8 & 0xFF) * local30;
					@Pc(102) int local102 = (anIntArray213[local70] & 0xFF) * local30;
					@Pc(124) int local124 = (local50 + local84 >> 8 << 16) + (local58 + local94 >> 8 << 8) + (local64 + local102 >> 8);
					anIntArray213[local70] = local124;
					local70 += anInt696;
				}
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("65541, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 4 + ", " + arg4 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	protected Class1_Sub1_Sub2() {
	}
}
