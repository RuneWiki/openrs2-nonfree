import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!dt", name = "k", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
	public static int anInt1568 = 1;

	@OriginalMember(owner = "client!dt", name = "u", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_25 = new Class15("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!dt", name = "w", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_61 = new Class56(80, -1);

	@OriginalMember(owner = "client!dt", name = "y", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_26 = new Class15("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ILclient!wg;[I[I[I)V")
	public static void method1274(@OriginalArg(1) Class8_Sub3_Sub1_Sub2 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(9) int local9 = arg2[local3];
			@Pc(13) int local13 = arg1[local3];
			@Pc(17) int local17 = arg3[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && arg0.aClass39Array3.length > local19) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg0.aClass39Array3[local19] = null;
					} else {
						@Pc(36) Class119 local36 = Static170.aClass125_3.method2389(local9);
						@Pc(39) int local39 = local36.anInt3012;
						@Pc(44) Class39 local44 = arg0.aClass39Array3[local19];
						if (local44 != null) {
							if (local9 == local44.anInt732) {
								if (local39 == 0) {
									local44 = arg0.aClass39Array3[local19] = null;
								} else if (local39 == 1) {
									local44.anInt731 = local17;
									local44.anInt734 = 0;
									local44.anInt729 = 0;
									local44.anInt736 = 0;
									local44.anInt738 = 1;
									Static334.method4419(arg0.anInt7339, local36, arg0.aByte99, false, 0, arg0.anInt7343);
								} else if (local39 == 2) {
									local44.anInt729 = 0;
								}
							} else if (local36.anInt2999 >= Static170.aClass125_3.method2389(local44.anInt732).anInt2999) {
								local44 = arg0.aClass39Array3[local19] = null;
							}
						}
						if (local44 == null) {
							local44 = arg0.aClass39Array3[local19] = new Class39();
							local44.anInt734 = 0;
							local44.anInt731 = local17;
							local44.anInt732 = local9;
							local44.anInt729 = 0;
							local44.anInt736 = 0;
							local44.anInt738 = 1;
							Static334.method4419(arg0.anInt7339, local36, arg0.aByte99, false, 0, arg0.anInt7343);
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V")
	public static void method1276() {
		if (Static276.aFrame5 != null) {
			return;
		}
		@Pc(8) int local8 = Static111.anInt2080;
		@Pc(14) int local14 = Static456.anInt7657;
		@Pc(21) int local21 = Static298.anInt4896 - Static345.anInt5723 - local8;
		@Pc(27) int local27 = Static75.anInt1525 - Static120.anInt2134 - local14;
		if (local8 <= 0 && local21 <= 0 && local14 <= 0 && local27 <= 0) {
			return;
		}
		try {
			@Pc(43) Container local43;
			if (Static43.aFrame4 == null) {
				local43 = Static24.aClass196_1.anApplet1;
			} else {
				local43 = Static43.aFrame4;
			}
			@Pc(49) int local49 = 0;
			@Pc(51) int local51 = 0;
			if (Static43.aFrame4 == local43) {
				@Pc(57) Insets local57 = Static43.aFrame4.getInsets();
				local51 = local57.top;
				local49 = local57.left;
			}
			@Pc(66) Graphics local66 = local43.getGraphics();
			local66.setColor(Color.black);
			if (local8 > 0) {
				local66.fillRect(local49, local51, local8, Static75.anInt1525);
			}
			if (local14 > 0) {
				local66.fillRect(local49, local51, Static298.anInt4896, local14);
			}
			if (local21 > 0) {
				local66.fillRect(Static298.anInt4896 + local49 - local21, local51, local21, Static75.anInt1525);
			}
			if (local27 > 0) {
				local66.fillRect(local49, Static75.anInt1525 + local51 - local27, Static298.anInt4896, local27);
				return;
			}
		} catch (@Pc(117) Exception local117) {
			return;
		}
	}

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(B)Lclient!bh;")
	public static Class14 method1277() {
		try {
			return (Class14) Class.forName("Class14_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "([IIIIIIBLclient!is;IZIII[II)I")
	public static int method1278(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class128 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static47.anIntArrayArray10[local7][local11] = 0;
				Static51.anIntArrayArray12[local7][local11] = 99999999;
			}
		}
		@Pc(49) boolean local49;
		if (arg5 == 1) {
			local49 = Static263.method3485(arg6, arg9, arg4, arg11, arg7, arg1, arg2, arg10, arg13, arg3);
		} else if (arg5 == 2) {
			local49 = Static128.method5876(arg11, arg6, arg9, arg10, arg7, arg1, arg2, arg13, arg3, arg4);
		} else {
			local49 = Static126.method1761(arg4, arg13, arg7, arg11, arg6, arg5, arg10, arg9, arg2, arg1, arg3);
		}
		@Pc(87) int local87 = arg10 - 64;
		@Pc(91) int local91 = arg1 - 64;
		@Pc(93) int local93 = Static228.anInt3904;
		@Pc(95) int local95 = Static110.anInt2053;
		@Pc(103) int local103;
		@Pc(105) int local105;
		@Pc(111) int local111;
		if (!local49) {
			if (!arg8) {
				return -1;
			}
			local103 = Integer.MAX_VALUE;
			local105 = Integer.MAX_VALUE;
			for (local111 = arg11 - 10; local111 <= arg11 + 10; local111++) {
				for (@Pc(118) int local118 = arg9 - 10; local118 <= arg9 + 10; local118++) {
					@Pc(125) int local125 = local111 - local87;
					@Pc(130) int local130 = local118 - local91;
					if (local125 >= 0 && local130 >= 0 && local125 < 128 && local130 < 128 && Static51.anIntArrayArray12[local125][local130] < 100) {
						@Pc(155) int local155 = 0;
						if (arg11 > local111) {
							local155 = arg11 - local111;
						} else if (arg11 + arg4 - 1 < local111) {
							local155 = local111 + 1 - arg4 - arg11;
						}
						@Pc(192) int local192 = 0;
						if (local118 < arg9) {
							local192 = arg9 - local118;
						} else if (arg9 + arg7 - 1 < local118) {
							local192 = local118 + 1 - arg9 - arg7;
						}
						@Pc(231) int local231 = local155 * local155 + local192 * local192;
						if (local231 < local103 || local103 == local231 && local105 > Static51.anIntArrayArray12[local125][local130]) {
							local105 = Static51.anIntArrayArray12[local125][local130];
							local103 = local231;
							local93 = local111;
							local95 = local118;
						}
					}
				}
			}
			if (local103 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local93 == arg10 && local95 == arg1) {
			return 0;
		}
		@Pc(308) byte local308 = 0;
		Static13.anIntArray10[0] = local93;
		local103 = local308 + 1;
		Static149.anIntArray226[0] = local95;
		@Pc(330) int local330;
		local105 = local330 = Static47.anIntArrayArray10[local93 - local87][local95 - local91];
		while (local93 != arg10 || local95 != arg1) {
			if (local330 != local105) {
				Static13.anIntArray10[local103] = local93;
				local330 = local105;
				Static149.anIntArray226[local103++] = local95;
			}
			if ((local105 & 0x2) != 0) {
				local93++;
			} else if ((local105 & 0x8) != 0) {
				local93--;
			}
			if ((local105 & 0x1) != 0) {
				local95++;
			} else if ((local105 & 0x4) != 0) {
				local95--;
			}
			local105 = Static47.anIntArrayArray10[local93 - local87][local95 - local91];
		}
		local111 = 0;
		while (local103-- > 0) {
			arg12[local111] = Static13.anIntArray10[local103];
			arg0[local111++] = Static149.anIntArray226[local103];
			if (local111 >= arg12.length) {
				break;
			}
		}
		return local111;
	}
}
