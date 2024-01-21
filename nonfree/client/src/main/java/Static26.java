import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "Lclient!pb;")
	public static Class71 aClass71_35;

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1356 = Static151.method2243(")1j");

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
	public static int anInt3841 = -1;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1357 = Static151.method2243("Login");

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1358 = aClass62_1357;

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "[S")
	public static final short[] aShortArray134 = new short[500];

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIB[I[BIIIIII)V")
	public static void method2652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(19) int local19 = (arg7 * (arg1 & 0xFF00FF) & 0xFF00FF00) + (arg7 * (arg1 & 0xFF00) & 0xFF0000) >> 8;
		@Pc(27) int local27 = 256 - arg7;
		for (@Pc(35) int local35 = -arg0; local35 < 0; local35++) {
			for (@Pc(40) int local40 = -arg8; local40 < 0; local40++) {
				if (arg3[arg9++] == 0) {
					arg4++;
				} else {
					@Pc(57) int local57 = arg2[arg4];
					arg2[arg4++] = local19 + ((local27 * (local57 & 0xFF00) & 0xFF0000) + (local27 * (local57 & 0xFF00FF) & 0xFF00FF00) >> 8);
				}
			}
			arg9 += arg5;
			arg4 += arg6;
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!ii;I)V")
	public static void method2654(@OriginalArg(0) Class47 arg0) {
		@Pc(6) int local6 = arg0.anInt1893;
		if (local6 == 324) {
			if (Static195.anInt4029 == -1) {
				Static195.anInt4029 = arg0.anInt1890;
				Static46.anInt1033 = arg0.anInt1895;
			}
			if (Static27.aClass28_1.aBoolean46) {
				arg0.anInt1890 = Static195.anInt4029;
			} else {
				arg0.anInt1890 = Static46.anInt1033;
			}
		} else if (local6 == 325) {
			if (Static195.anInt4029 == -1) {
				Static46.anInt1033 = arg0.anInt1895;
				Static195.anInt4029 = arg0.anInt1890;
			}
			if (Static27.aClass28_1.aBoolean46) {
				arg0.anInt1890 = Static46.anInt1033;
			} else {
				arg0.anInt1890 = Static195.anInt4029;
			}
		} else if (local6 == 327) {
			arg0.anInt1863 = 150;
			arg0.anInt1859 = (int) (Math.sin((double) Static25.anInt581 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt1881 = -1;
			arg0.anInt1855 = 5;
		} else if (local6 == 328) {
			if (Static186.aClass7_Sub2_Sub2_1.aClass62_1072 == null) {
				arg0.anInt1881 = 0;
			} else {
				arg0.anInt1863 = 150;
				arg0.anInt1859 = (int) (Math.sin((double) Static25.anInt581 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt1855 = 5;
				arg0.anInt1881 = ((int) Static186.aClass7_Sub2_Sub2_1.aClass62_1072.method1843() << 11) + 2047;
				arg0.anInt1842 = Static186.aClass7_Sub2_Sub2_1.anInt3096;
				arg0.anInt1869 = Static186.aClass7_Sub2_Sub2_1.anInt3060;
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
	public static void method2655() {
		@Pc(13) int local13 = Static142.anInt3025 - (int) ((double) Static194.aClass47_15.anInt1910 / Static136.aDouble113);
		@Pc(23) int local23 = Static142.anInt3025 + (int) ((double) Static194.aClass47_15.anInt1910 / Static136.aDouble113);
		if (local13 < 0) {
			Static176.anInt3717 = -1;
			Static142.anInt3025 = (int) ((double) Static194.aClass47_15.anInt1910 / Static136.aDouble113);
			Static186.anInt3885 = -1;
		}
		@Pc(49) int local49 = Static50.anInt1085 + (int) ((double) Static194.aClass47_15.anInt1858 / Static136.aDouble113);
		@Pc(59) int local59 = Static50.anInt1085 - (int) ((double) Static194.aClass47_15.anInt1858 / Static136.aDouble113);
		if (Static173.anInt3686 < local23) {
			Static186.anInt3885 = -1;
			Static176.anInt3717 = -1;
			Static142.anInt3025 = Static173.anInt3686 - (int) ((double) Static194.aClass47_15.anInt1910 / Static136.aDouble113);
		}
		if (local59 < 0) {
			Static50.anInt1085 = (int) ((double) Static194.aClass47_15.anInt1858 / Static136.aDouble113);
			Static186.anInt3885 = -1;
			Static176.anInt3717 = -1;
		}
		if (local49 > Static104.anInt2340) {
			Static186.anInt3885 = -1;
			Static176.anInt3717 = -1;
			Static50.anInt1085 = Static104.anInt2340 - (int) ((double) Static194.aClass47_15.anInt1858 / Static136.aDouble113);
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
	public static void method2657() {
		Static156.aFont1 = null;
		Static106.aFontMetrics1 = null;
		Static32.anImage1 = null;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIB)V")
	public static void method2659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static74.aClass42Array4[0].method2468(arg1, arg2);
		@Pc(17) int local17 = (arg0 - 32) * arg0 / arg3;
		Static74.aClass42Array4[1].method2468(arg1, arg0 + arg2 - 16);
		if (local17 < 8) {
			local17 = 8;
		}
		@Pc(45) int local45 = (arg0 - local17 - 32) * arg4 / (arg3 - arg0);
		Static212.method3103(arg1, arg2 + 16, 16, arg0 - 32, Static186.anInt3880);
		Static212.method3103(arg1, local45 + arg2 + 16, 16, local17, Static111.anInt2427);
		Static212.method3107(arg1, local45 + arg2 + 16, local17, Static37.anInt892);
		Static212.method3107(arg1 + 1, arg2 + 16 + local45, local17, Static37.anInt892);
		Static212.method3090(arg1, local45 + arg2 + 16, 16, Static37.anInt892);
		Static212.method3090(arg1, arg2 + local45 + 17, 16, Static37.anInt892);
		Static212.method3107(arg1 + 15, local45 + 16 + arg2, local17, Static165.anInt3490);
		Static212.method3107(arg1 + 14, local45 + 17 + arg2, local17 - 1, Static165.anInt3490);
		Static212.method3090(arg1, local17 + arg2 + local45 + 15, 16, Static165.anInt3490);
		Static212.method3090(arg1 + 1, local17 + local45 + 14 + arg2, 15, Static165.anInt3490);
	}
}
