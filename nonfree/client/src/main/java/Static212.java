import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!qd", name = "n", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray16;

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "[I")
	public static int[] anIntArray382 = new int[256];

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString133 = "Use";

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
	public static void method3390() {
		anIntArray382 = null;
		aByteArrayArrayArray16 = null;
		aString133 = null;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIIILclient!fc;)V")
	public static void method3392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class47 arg7) {
		@Pc(9) int local9 = arg1 & 0x3;
		@Pc(23) int local23;
		@Pc(20) int local20;
		if (local9 == 1 || local9 == 3) {
			local20 = arg7.anInt1327;
			local23 = arg7.anInt1354;
		} else {
			local20 = arg7.anInt1354;
			local23 = arg7.anInt1327;
		}
		@Pc(44) int local44;
		@Pc(42) int local42;
		if (arg0 + local20 > 104) {
			local42 = arg0 + 1;
			local44 = arg0;
		} else {
			local42 = arg0 + (local20 + 1 >> 1);
			local44 = arg0 + (local20 >> 1);
		}
		@Pc(82) int local82;
		@Pc(76) int local76;
		if (local23 + arg3 <= 104) {
			local76 = (local23 + 1 >> 1) + arg3;
			local82 = arg3 + (local23 >> 1);
		} else {
			local82 = arg3;
			local76 = arg3 + 1;
		}
		@Pc(98) int local98 = (arg3 << 7) + (local23 << 6);
		@Pc(106) int local106 = (local20 << 6) + (arg0 << 7);
		@Pc(110) int[][] local110 = Static250.anIntArrayArrayArray13[arg6];
		@Pc(143) int local143 = local110[local82][local44] + local110[local76][local44] + local110[local82][local42] + local110[local76][local42] >> 2;
		@Pc(145) int local145 = 0;
		@Pc(152) int[][] local152;
		if (arg6 != 0) {
			local152 = Static250.anIntArrayArrayArray13[0];
			local145 = local143 - (local152[local76][local42] + local152[local76][local44] + local152[local82][local44] + local152[local82][local42] >> 2);
		}
		local152 = null;
		if (arg6 < 3) {
			local152 = Static250.anIntArrayArrayArray13[arg6 + 1];
		}
		@Pc(209) Class154 local209 = arg7.method1091(local152, arg2, local110, arg1, false, true, null, local143, local106, local98);
		Static64.method981(local209.aClass59_Sub2_4, local98 - arg4, local145, local106 - arg5);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 >= Static211.anInt4200 && Static154.anInt3126 >= arg0 && Static171.anInt3392 <= arg5 && Static141.anInt2889 >= arg3) {
			Static119.method2038(arg1, arg3, arg5, arg2, arg4, arg6, arg0);
		} else {
			Static62.method961(arg3, arg2, arg0, arg6, arg5, arg1, arg4);
		}
	}
}
