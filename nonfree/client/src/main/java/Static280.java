import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "Lclient!am;")
	public static Class11 aClass11_122;

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "Lclient!hh;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIII)V")
	public static void method4789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static144.anInt3226 == 0 || arg3 == 0 || Static234.anInt4843 >= 50 || arg0 == -1) {
			return;
		}
		Static196.anIntArray362[Static234.anInt4843] = arg0;
		Static115.anIntArray241[Static234.anInt4843] = arg3;
		Static169.anIntArray331[Static234.anInt4843] = arg1;
		Static268.aClass112Array1[Static234.anInt4843] = null;
		Static111.anIntArray236[Static234.anInt4843] = 0;
		Static349.anIntArray540[Static234.anInt4843] = arg2;
		Static234.anInt4843++;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!tq;IZIIIZIIZI)V")
	public static void method4790(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10) {
		if (arg2 == 1) {
			arg0 = 1;
		} else if (arg2 == 2) {
			arg4 = 1;
			arg0 = 1;
		} else if (arg2 == 3) {
			arg4 = 1;
		}
		@Pc(66) int local66;
		if (arg6 < 0 || Static92.anInt2048 <= arg6 || arg10 < 0 || Static290.anInt5893 <= arg10) {
			while (true) {
				local66 = arg1.method2380();
				if (local66 == 0) {
					return;
				}
				if (local66 == 1) {
					arg1.method2380();
					return;
				}
				if (local66 <= 49) {
					arg1.method2380();
				}
			}
			return;
		}
		if (!arg3 && !arg9) {
			Static348.aByteArrayArrayArray11[arg7][arg6][arg10] = 0;
		}
		while (true) {
			local66 = arg1.method2380();
			if (local66 == 0) {
				if (arg3) {
					Static57.anIntArrayArrayArray4[0][arg6 + arg4][arg0 + arg10] = Static310.aClass26Array4[0].method4996(arg4 + arg6, arg0 + arg10);
					return;
				} else if (arg7 == 0) {
					Static57.anIntArrayArrayArray4[0][arg4 + arg6][arg0 + arg10] = -Static306.method5190(arg5 + 932731, arg8 + 556238) * 8;
					return;
				} else {
					Static57.anIntArrayArrayArray4[arg7][arg4 + arg6][arg10 + arg0] = Static57.anIntArrayArrayArray4[arg7 - 1][arg6 + arg4][arg10 + arg0] - 240;
					return;
				}
			}
			if (local66 == 1) {
				@Pc(188) int local188 = arg1.method2380();
				if (arg3) {
					Static57.anIntArrayArrayArray4[0][arg4 + arg6][arg10 + arg0] = Static310.aClass26Array4[0].method4996(arg6 + arg4, arg10 + arg0) + local188 * 8;
					return;
				}
				if (local188 == 1) {
					local188 = 0;
				}
				if (arg7 != 0) {
					Static57.anIntArrayArrayArray4[arg7][arg6 + arg4][arg10 + arg0] = Static57.anIntArrayArrayArray4[arg7 - 1][arg6 + arg4][arg0 + arg10] - local188 * 8;
					return;
				}
				Static57.anIntArrayArrayArray4[0][arg4 + arg6][arg10 + arg0] = -local188 * 8;
				return;
			}
			if (local66 <= 49) {
				if (arg9) {
					arg1.method2380();
				} else {
					Static217.aByteArrayArrayArray7[arg7][arg6][arg10] = arg1.method2393();
					Static226.aByteArrayArrayArray8[arg7][arg6][arg10] = (byte) ((local66 - 2) / 4);
					Static230.aByteArrayArrayArray9[arg7][arg6][arg10] = (byte) (arg2 + local66 - 2 & 0x3);
				}
			} else if (local66 <= 81) {
				if (!arg3 && !arg9) {
					Static348.aByteArrayArrayArray11[arg7][arg6][arg10] = (byte) (local66 - 49);
				}
			} else if (!arg9) {
				Static269.aByteArrayArrayArray10[arg7][arg6][arg10] = (byte) (local66 - 81);
			}
		}
	}
}
