import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!rr", name = "Qb", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_92 = new Class142("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!rr", name = "yc", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_101 = new Class242(25, -1);

	@OriginalMember(owner = "client!rr", name = "Ac", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_93 = new Class142(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIZ)V")
	public static void method4760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static430.aFloat55 < Static430.aFloat54) {
			Static430.aFloat55 = (float) ((double) Static430.aFloat55 + (double) Static430.aFloat55 / 30.0D);
			if (Static430.aFloat54 < Static430.aFloat55) {
				Static430.aFloat55 = Static430.aFloat54;
			}
			Static160.method2120();
			Static430.anInt4133 = (int) Static430.aFloat55 >> 1;
			Static430.aByteArrayArrayArray8 = Static459.method5901(Static430.anInt4133);
		} else if (Static430.aFloat54 < Static430.aFloat55) {
			Static430.aFloat55 = (float) ((double) Static430.aFloat55 - (double) Static430.aFloat55 / 30.0D);
			if (Static430.aFloat55 < Static430.aFloat54) {
				Static430.aFloat55 = Static430.aFloat54;
			}
			Static160.method2120();
			Static430.anInt4133 = (int) Static430.aFloat55 >> 1;
			Static430.aByteArrayArrayArray8 = Static459.method5901(Static430.anInt4133);
		}
		if (Static454.anInt7226 != -1 && Static112.anInt1711 != -1) {
			@Pc(88) int local88 = Static454.anInt7226 - Static223.anInt5659;
			if (local88 < 2 || local88 > 2) {
				local88 /= 8;
			}
			@Pc(105) int local105 = Static112.anInt1711 - Static173.anInt2855;
			if (local105 < 2 || local105 > 2) {
				local105 /= 8;
			}
			Static223.anInt5659 += local88;
			Static173.anInt2855 += local105;
			if (local88 == 0 && local105 == 0) {
				Static112.anInt1711 = -1;
				Static454.anInt7226 = -1;
			}
			Static160.method2120();
		}
		if (Static47.anInt678 <= 0) {
			Static32.anInt496 = -1;
			Static232.anInt4196 = -1;
		} else {
			Static80.anInt1104--;
			if (Static80.anInt1104 == 0) {
				Static80.anInt1104 = 100;
				Static47.anInt678--;
			}
		}
		if (!Static426.aBoolean592 || Static350.aClass14_40 == null) {
			return;
		}
		for (@Pc(167) Class1_Sub41 local167 = (Class1_Sub41) Static350.aClass14_40.method203(); local167 != null; local167 = (Class1_Sub41) Static350.aClass14_40.method208()) {
			@Pc(176) Class128 local176 = Static430.aClass36_4.method659(local167.aClass1_Sub15_1.anInt1847);
			if (local167.method4844(arg0, arg1)) {
				if (local176.aStringArray23 != null) {
					if (local176.aStringArray23[4] != null) {
						Static213.method3090((long) local167.aClass1_Sub15_1.anInt1847, local176.aStringArray23[4], local176.aString37, local176.anInt3484, -1, false, 0, 1007, true, -1);
					}
					if (local176.aStringArray23[3] != null) {
						Static213.method3090((long) local167.aClass1_Sub15_1.anInt1847, local176.aStringArray23[3], local176.aString37, local176.anInt3484, -1, false, 0, 1011, true, -1);
					}
					if (local176.aStringArray23[2] != null) {
						Static213.method3090((long) local167.aClass1_Sub15_1.anInt1847, local176.aStringArray23[2], local176.aString37, local176.anInt3484, -1, false, 0, 1012, true, -1);
					}
					if (local176.aStringArray23[1] != null) {
						Static213.method3090((long) local167.aClass1_Sub15_1.anInt1847, local176.aStringArray23[1], local176.aString37, local176.anInt3484, -1, false, 0, 1003, true, -1);
					}
					if (local176.aStringArray23[0] != null) {
						Static213.method3090((long) local167.aClass1_Sub15_1.anInt1847, local176.aStringArray23[0], local176.aString37, local176.anInt3484, -1, false, 0, 1008, true, -1);
					}
				}
				if (!local167.aClass1_Sub15_1.aBoolean195) {
					local167.aClass1_Sub15_1.aBoolean195 = true;
					Static198.method2841(Static346.aClass265_6, local167.aClass1_Sub15_1.anInt1847, local176.anInt3484);
				}
				if (local167.aClass1_Sub15_1.aBoolean195) {
					Static198.method2841(Static396.aClass265_8, local167.aClass1_Sub15_1.anInt1847, local176.anInt3484);
				}
			} else if (local167.aClass1_Sub15_1.aBoolean195) {
				local167.aClass1_Sub15_1.aBoolean195 = false;
				Static198.method2841(Static10.aClass265_5, local167.aClass1_Sub15_1.anInt1847, local176.anInt3484);
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIZIIIII)V")
	public static void method4763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = arg5 + arg0;
		@Pc(19) int local19 = arg3 - arg0;
		for (@Pc(21) int local21 = arg5; local21 < local15; local21++) {
			Static298.method3977(arg1, arg2, arg4, Static194.anIntArrayArray28[local21]);
		}
		for (@Pc(41) int local41 = arg3; local41 > local19; local41--) {
			Static298.method3977(arg1, arg2, arg4, Static194.anIntArrayArray28[local41]);
		}
		@Pc(64) int local64 = arg4 - arg0;
		@Pc(68) int local68 = arg0 + arg1;
		for (@Pc(70) int local70 = local15; local70 <= local19; local70++) {
			@Pc(76) int[] local76 = Static194.anIntArrayArray28[local70];
			Static298.method3977(arg1, arg2, local68, local76);
			Static298.method3977(local68, arg6, local64, local76);
			Static298.method3977(local64, arg2, arg4, local76);
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "([III[IB)V")
	public static void method4764(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(23) int local23 = (arg2 + arg1) / 2;
		@Pc(25) int local25 = arg1;
		@Pc(29) int local29 = arg0[local23];
		arg0[local23] = arg0[arg2];
		arg0[arg2] = local29;
		@Pc(43) int local43 = arg3[local23];
		arg3[local23] = arg3[arg2];
		arg3[arg2] = local43;
		@Pc(60) int local60 = local29 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(62) int local62 = arg1; local62 < arg2; local62++) {
			if ((local62 & local60) + local29 > arg0[local62]) {
				@Pc(77) int local77 = arg0[local62];
				arg0[local62] = arg0[local25];
				arg0[local25] = local77;
				@Pc(91) int local91 = arg3[local62];
				arg3[local62] = arg3[local25];
				arg3[local25++] = local91;
			}
		}
		arg0[arg2] = arg0[local25];
		arg0[local25] = local29;
		arg3[arg2] = arg3[local25];
		arg3[local25] = local43;
		method4764(arg0, arg1, local25 - 1, arg3);
		method4764(arg0, local25 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
	public static void method4769() {
		for (@Pc(7) int local7 = 0; local7 < Static278.aByteArrayArrayArray16.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static278.aByteArrayArrayArray16[0].length; local11++) {
				for (@Pc(15) int local15 = 0; local15 < Static278.aByteArrayArrayArray16[0][0].length; local15++) {
					Static278.aByteArrayArrayArray16[local7][local11][local15] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIIII)V")
	public static void method4774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static126.aClass19_Sub1_1.anInt4226 != 0 && arg0 != 0 && Static249.anInt4440 < 50 && arg2 != -1) {
			Static234.aClass43Array1[Static249.anInt4440++] = new Class43((byte) 1, arg2, arg0, arg4, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(CILjava/lang/String;)I")
	public static int method4775(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(14) int local14 = 0;
		@Pc(17) int local17 = arg1.length();
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			if (arg1.charAt(local19) == arg0) {
				local14++;
			}
		}
		return local14;
	}
}
