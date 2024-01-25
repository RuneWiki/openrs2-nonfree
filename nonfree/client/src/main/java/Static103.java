import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_44 = new Class93("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

	@OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
	public static int anInt2334 = 0;

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_45 = new Class93(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "Z")
	public static boolean aBoolean202 = true;

	@OriginalMember(owner = "client!gg", name = "h", descriptor = "[I")
	public static final int[] anIntArray218 = new int[250];

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIZIIIIIZIILclient!dg;)V")
	public static void method2283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class2_Sub10 arg10) {
		if (arg4 == 1) {
			arg5 = 1;
		} else if (arg4 == 2) {
			arg5 = 1;
			arg1 = 1;
		} else if (arg4 == 3) {
			arg1 = 1;
		}
		@Pc(67) int local67;
		if (arg3 < 0 || Static95.anInt6381 <= arg3 || arg9 < 0 || Static237.anInt4532 <= arg9) {
			while (true) {
				local67 = arg10.method4421();
				if (local67 == 0) {
					return;
				}
				if (local67 == 1) {
					arg10.method4421();
					return;
				}
				if (local67 <= 49) {
					arg10.method4421();
				}
			}
			return;
		}
		if (!arg2 && !arg7) {
			Static313.aByteArrayArrayArray12[arg8][arg3][arg9] = 0;
		}
		while (true) {
			local67 = arg10.method4421();
			if (local67 == 0) {
				if (arg2) {
					Static109.anIntArrayArrayArray3[0][arg3 + arg1][arg9 + arg5] = Static265.aClass73Array44[0].method4931(arg3 + arg1, arg9 - -arg5);
					return;
				} else if (arg8 == 0) {
					Static109.anIntArrayArrayArray3[0][arg1 + arg3][arg9 + arg5] = -Static254.method4613(arg0 + 556238, arg6 + 932731) * 8;
					return;
				} else {
					Static109.anIntArrayArrayArray3[arg8][arg1 + arg3][arg5 + arg9] = Static109.anIntArrayArrayArray3[arg8 - 1][arg1 + arg3][arg9 + arg5] - 240;
					return;
				}
			}
			if (local67 == 1) {
				@Pc(157) int local157 = arg10.method4421();
				if (!arg2) {
					if (local157 == 1) {
						local157 = 0;
					}
					if (arg8 != 0) {
						Static109.anIntArrayArrayArray3[arg8][arg1 + arg3][arg9 + arg5] = Static109.anIntArrayArrayArray3[arg8 - 1][arg1 + arg3][arg9 + arg5] - local157 * 8;
						return;
					}
					Static109.anIntArrayArrayArray3[0][arg3 + arg1][arg5 + arg9] = -local157 * 8;
					return;
				}
				Static109.anIntArrayArrayArray3[0][arg3 + arg1][arg5 + arg9] = local157 * 8 + Static265.aClass73Array44[0].method4931(arg3 + arg1, arg9 + arg5);
				return;
			}
			if (local67 <= 49) {
				if (arg7) {
					arg10.method4421();
				} else {
					Static58.aByteArrayArrayArray2[arg8][arg3][arg9] = arg10.method4436();
					Static306.aByteArrayArrayArray11[arg8][arg3][arg9] = (byte) ((local67 - 2) / 4);
					Static53.aByteArrayArrayArray1[arg8][arg3][arg9] = (byte) (arg4 + local67 - 2 & 0x3);
				}
			} else if (local67 <= 81) {
				if (!arg2 && !arg7) {
					Static313.aByteArrayArrayArray12[arg8][arg3][arg9] = (byte) (local67 - 49);
				}
			} else if (!arg7) {
				Static322.aByteArrayArrayArray13[arg8][arg3][arg9] = (byte) (local67 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(BILclient!qm;I)V")
	public static void method2285(@OriginalArg(1) int arg0, @OriginalArg(2) Class62_Sub1_Sub2_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt5322 == arg2 && arg2 != -1) {
			@Pc(89) Class107 local89 = Static212.method3773(arg2);
			@Pc(92) int local92 = local89.anInt3273;
			if (local92 == 1) {
				arg1.anInt5305 = 0;
				arg1.anInt5341 = 0;
				arg1.anInt5349 = 0;
				arg1.anInt5345 = arg0;
				arg1.anInt5337 = 1;
				Static343.method5928(false, local89, arg1.anInt5289, arg1.anInt5305, arg1.anInt5280);
			}
			if (local92 == 2) {
				arg1.anInt5349 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt5322 == -1 || Static212.method3773(arg2).anInt3287 >= Static212.method3773(arg1.anInt5322).anInt3287) {
			arg1.anInt5337 = 1;
			arg1.anInt5367 = arg1.anInt5372;
			arg1.anInt5305 = 0;
			arg1.anInt5345 = arg0;
			arg1.anInt5322 = arg2;
			arg1.anInt5349 = 0;
			arg1.anInt5341 = 0;
			if (arg1.anInt5322 != -1) {
				Static343.method5928(false, Static212.method3773(arg1.anInt5322), arg1.anInt5289, arg1.anInt5305, arg1.anInt5280);
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V")
	public static void method2286(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static265.method5886(arg1)) {
			Static124.method3875(arg0, Static265.aClass146ArrayArray41[arg1]);
		}
	}
}
