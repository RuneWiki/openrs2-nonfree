import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!ln", name = "Fb", descriptor = "[I")
	public static int[] anIntArray304;

	@OriginalMember(owner = "client!ln", name = "r", descriptor = "[Z")
	public static final boolean[] aBooleanArray14 = new boolean[8];

	@OriginalMember(owner = "client!ln", name = "V", descriptor = "I")
	public static int anInt6465 = -1;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!pfa;IIIIIIIIII)Z")
	public static boolean method5440(@OriginalArg(0) Class258 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(12) int local12 = arg6;
		@Pc(14) int local14 = arg9;
		@Pc(23) int local23 = arg6 - 64;
		@Pc(27) int local27 = arg9 - 64;
		Static131.anIntArrayArray7[64][64] = 99;
		Static577.anIntArrayArray30[64][64] = 0;
		@Pc(41) byte local41 = 0;
		@Pc(43) int local43 = 0;
		Static611.anIntArray552[0] = arg6;
		@Pc(50) int local50 = local41 + 1;
		Static140.anIntArray125[0] = arg9;
		@Pc(55) int[][] local55 = arg0.anIntArrayArray38;
		while (local50 != local43) {
			local14 = Static140.anIntArray125[local43];
			local12 = Static611.anIntArray552[local43];
			local43 = local43 + 1 & 0xFFF;
			@Pc(76) int local76 = local14 - local27;
			@Pc(81) int local81 = local12 - local23;
			@Pc(87) int local87 = local12 - arg0.anInt7870;
			@Pc(92) int local92 = local14 - arg0.anInt7874;
			if (arg4 == -4) {
				if (local12 == arg8 && local14 == arg7) {
					Static47.anInt1658 = local14;
					Static365.anInt7041 = local12;
					return true;
				}
			} else if (arg4 == -3) {
				if (Static60.method5318(arg8, arg2, local14, arg1, local12, arg7, 2, 2)) {
					Static47.anInt1658 = local14;
					Static365.anInt7041 = local12;
					return true;
				}
			} else if (arg4 == -2) {
				if (arg0.method6631(arg8, arg1, arg7, local14, arg2, 2, local12, 2, arg3)) {
					Static47.anInt1658 = local14;
					Static365.anInt7041 = local12;
					return true;
				}
			} else if (arg4 == -1) {
				if (arg0.method6634(arg2, arg8, local14, 2, arg7, arg3, local12, arg1)) {
					Static365.anInt7041 = local12;
					Static47.anInt1658 = local14;
					return true;
				}
			} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
				if (arg0.method6647(arg7, local12, 2, local14, arg5, arg8, arg4)) {
					Static365.anInt7041 = local12;
					Static47.anInt1658 = local14;
					return true;
				}
			} else if (arg0.method6633(arg8, arg5, local14, arg7, arg4, 2, local12)) {
				Static365.anInt7041 = local12;
				Static47.anInt1658 = local14;
				return true;
			}
			@Pc(239) int local239 = Static577.anIntArrayArray30[local81][local76] + 1;
			if (local81 > 0 && Static131.anIntArrayArray7[local81 - 1][local76] == 0 && (local55[local87 - 1][local92] & 0x43A40000) == 0 && (local55[local87 - 1][local92 + 1] & 0x4E240000) == 0) {
				Static611.anIntArray552[local50] = local12 - 1;
				Static140.anIntArray125[local50] = local14;
				local50 = local50 + 1 & 0xFFF;
				Static131.anIntArrayArray7[local81 - 1][local76] = 2;
				Static577.anIntArrayArray30[local81 - 1][local76] = local239;
			}
			if (local81 < 126 && Static131.anIntArrayArray7[local81 + 1][local76] == 0 && (local55[local87 + 2][local92] & 0x60E40000) == 0 && (local55[local87 + 2][local92 + 1] & 0x78240000) == 0) {
				Static611.anIntArray552[local50] = local12 + 1;
				Static140.anIntArray125[local50] = local14;
				Static131.anIntArrayArray7[local81 + 1][local76] = 8;
				local50 = local50 + 1 & 0xFFF;
				Static577.anIntArrayArray30[local81 + 1][local76] = local239;
			}
			if (local76 > 0 && Static131.anIntArrayArray7[local81][local76 - 1] == 0 && (local55[local87][local92 - 1] & 0x43A40000) == 0 && (local55[local87 + 1][local92 - 1] & 0x60E40000) == 0) {
				Static611.anIntArray552[local50] = local12;
				Static140.anIntArray125[local50] = local14 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static131.anIntArrayArray7[local81][local76 - 1] = 1;
				Static577.anIntArrayArray30[local81][local76 - 1] = local239;
			}
			if (local76 < 126 && Static131.anIntArrayArray7[local81][local76 + 1] == 0 && (local55[local87][local92 + 2] & 0x4E240000) == 0 && (local55[local87 + 1][local92 + 2] & 0x78240000) == 0) {
				Static611.anIntArray552[local50] = local12;
				Static140.anIntArray125[local50] = local14 + 1;
				Static131.anIntArrayArray7[local81][local76 + 1] = 4;
				local50 = local50 + 1 & 0xFFF;
				Static577.anIntArrayArray30[local81][local76 + 1] = local239;
			}
			if (local81 > 0 && local76 > 0 && Static131.anIntArrayArray7[local81 - 1][local76 - 1] == 0 && (local55[local87 - 1][local92] & 0x4FA40000) == 0 && (local55[local87 - 1][local92 - 1] & 0x43A40000) == 0 && (local55[local87][local92 - 1] & 0x63E40000) == 0) {
				Static611.anIntArray552[local50] = local12 - 1;
				Static140.anIntArray125[local50] = local14 - 1;
				Static131.anIntArrayArray7[local81 - 1][local76 - 1] = 3;
				local50 = local50 + 1 & 0xFFF;
				Static577.anIntArrayArray30[local81 - 1][local76 - 1] = local239;
			}
			if (local81 < 126 && local76 > 0 && Static131.anIntArrayArray7[local81 + 1][local76 - 1] == 0 && (local55[local87 + 1][local92 - 1] & 0x63E40000) == 0 && (local55[local87 + 2][local92 - 1] & 0x60E40000) == 0 && (local55[local87 + 2][local92] & 0x78E40000) == 0) {
				Static611.anIntArray552[local50] = local12 + 1;
				Static140.anIntArray125[local50] = local14 - 1;
				Static131.anIntArrayArray7[local81 + 1][local76 - 1] = 9;
				local50 = local50 + 1 & 0xFFF;
				Static577.anIntArrayArray30[local81 + 1][local76 - 1] = local239;
			}
			if (local81 > 0 && local76 < 126 && Static131.anIntArrayArray7[local81 - 1][local76 + 1] == 0 && (local55[local87 - 1][local92 + 1] & 0x4FA40000) == 0 && (local55[local87 - 1][local92 + 2] & 0x4E240000) == 0 && (local55[local87][local92 + 2] & 0x7E240000) == 0) {
				Static611.anIntArray552[local50] = local12 - 1;
				Static140.anIntArray125[local50] = local14 + 1;
				Static131.anIntArrayArray7[local81 - 1][local76 + 1] = 6;
				local50 = local50 + 1 & 0xFFF;
				Static577.anIntArrayArray30[local81 - 1][local76 + 1] = local239;
			}
			if (local81 < 126 && local76 < 126 && Static131.anIntArrayArray7[local81 + 1][local76 + 1] == 0 && (local55[local87 + 1][local92 + 2] & 0x7E240000) == 0 && (local55[local87 + 2][local92 + 2] & 0x78240000) == 0 && (local55[local87 + 2][local92 + 1] & 0x78E40000) == 0) {
				Static611.anIntArray552[local50] = local12 + 1;
				Static140.anIntArray125[local50] = local14 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static131.anIntArrayArray7[local81 + 1][local76 + 1] = 12;
				Static577.anIntArrayArray30[local81 + 1][local76 + 1] = local239;
			}
		}
		Static47.anInt1658 = local14;
		Static365.anInt7041 = local12;
		return false;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)I")
	public static int method5447() {
		if (Static224.aFrame5 == null) {
			return Static259.aBoolean555 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
