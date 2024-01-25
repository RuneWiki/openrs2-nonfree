import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray12;

	@OriginalMember(owner = "client!dk", name = "r", descriptor = "Lclient!bu;")
	public static Class32 aClass32_31;

	@OriginalMember(owner = "client!dk", name = "q", descriptor = "[[B")
	public static final byte[][] aByteArrayArray3 = new byte[1000][];

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z[I[Ljava/lang/Object;)V")
	public static void method1403(@OriginalArg(1) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static371.method4862(arg0.length - 1, arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lclient!br;ZIIIIIIIII)Z")
	public static boolean method1405(@OriginalArg(0) Class29 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg3;
		@Pc(7) int local7 = arg2;
		@Pc(21) int local21 = arg3 - 64;
		Static244.anIntArrayArray30[64][64] = 99;
		@Pc(31) int local31 = arg2 - 64;
		Static117.anIntArrayArray17[64][64] = 0;
		@Pc(39) byte local39 = 0;
		Static195.anIntArray244[0] = arg3;
		@Pc(45) int local45 = 0;
		@Pc(48) int local48 = local39 + 1;
		Static368.anIntArray399[0] = arg2;
		@Pc(53) int[][] local53 = arg0.anIntArrayArray8;
		while (local48 != local45) {
			local5 = Static195.anIntArray244[local45];
			local7 = Static368.anIntArray399[local45];
			@Pc(68) int local68 = local5 - arg0.anInt1055;
			@Pc(72) int local72 = local5 - local21;
			@Pc(77) int local77 = local7 - local31;
			local45 = local45 + 1 & 0xFFF;
			@Pc(89) int local89 = local7 - arg0.anInt1062;
			if (arg6 == -4) {
				if (local5 == arg7 && local7 == arg1) {
					Static107.anInt2387 = local5;
					Static430.anInt3291 = local7;
					return true;
				}
			} else if (arg6 == -3) {
				if (Static225.method3377(1, 1, local5, arg8, arg9, arg1, arg7, local7)) {
					Static430.anInt3291 = local7;
					Static107.anInt2387 = local5;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg0.method744(arg7, arg5, arg8, 1, local5, 1, local7, arg1, arg9)) {
					Static107.anInt2387 = local5;
					Static430.anInt3291 = local7;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg0.method757(local5, 1, arg5, arg1, local7, arg9, arg8, arg7)) {
					Static430.anInt3291 = local7;
					Static107.anInt2387 = local5;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg0.method748(arg6, arg7, local7, 1, local5, arg4, arg1)) {
					Static430.anInt3291 = local7;
					Static107.anInt2387 = local5;
					return true;
				}
			} else if (arg0.method747(arg4, 1, arg1, local7, arg6, local5, arg7)) {
				Static107.anInt2387 = local5;
				Static430.anInt3291 = local7;
				return true;
			}
			@Pc(242) int local242 = Static117.anIntArrayArray17[local72][local77] + 1;
			if (local72 > 0 && Static244.anIntArrayArray30[local72 - 1][local77] == 0 && (local53[local68 - 1][local89] & 0x42240000) == 0) {
				Static195.anIntArray244[local48] = local5 - 1;
				Static368.anIntArray399[local48] = local7;
				Static244.anIntArrayArray30[local72 - 1][local77] = 2;
				local48 = local48 + 1 & 0xFFF;
				Static117.anIntArrayArray17[local72 - 1][local77] = local242;
			}
			if (local72 < 127 && Static244.anIntArrayArray30[local72 + 1][local77] == 0 && (local53[local68 + 1][local89] & 0x60240000) == 0) {
				Static195.anIntArray244[local48] = local5 + 1;
				Static368.anIntArray399[local48] = local7;
				local48 = local48 + 1 & 0xFFF;
				Static244.anIntArrayArray30[local72 + 1][local77] = 8;
				Static117.anIntArrayArray17[local72 + 1][local77] = local242;
			}
			if (local77 > 0 && Static244.anIntArrayArray30[local72][local77 - 1] == 0 && (local53[local68][local89 - 1] & 0x40A40000) == 0) {
				Static195.anIntArray244[local48] = local5;
				Static368.anIntArray399[local48] = local7 - 1;
				Static244.anIntArrayArray30[local72][local77 - 1] = 1;
				local48 = local48 + 1 & 0xFFF;
				Static117.anIntArrayArray17[local72][local77 - 1] = local242;
			}
			if (local77 < 127 && Static244.anIntArrayArray30[local72][local77 + 1] == 0 && (local53[local68][local89 + 1] & 0x48240000) == 0) {
				Static195.anIntArray244[local48] = local5;
				Static368.anIntArray399[local48] = local7 + 1;
				local48 = local48 + 1 & 0xFFF;
				Static244.anIntArrayArray30[local72][local77 + 1] = 4;
				Static117.anIntArrayArray17[local72][local77 + 1] = local242;
			}
			if (local72 > 0 && local77 > 0 && Static244.anIntArrayArray30[local72 - 1][local77 - 1] == 0 && (local53[local68 - 1][local89 - 1] & 0x43A40000) == 0 && (local53[local68 - 1][local89] & 0x42240000) == 0 && (local53[local68][local89 - 1] & 0x40A40000) == 0) {
				Static195.anIntArray244[local48] = local5 - 1;
				Static368.anIntArray399[local48] = local7 - 1;
				local48 = local48 + 1 & 0xFFF;
				Static244.anIntArrayArray30[local72 - 1][local77 - 1] = 3;
				Static117.anIntArrayArray17[local72 - 1][local77 - 1] = local242;
			}
			if (local72 < 127 && local77 > 0 && Static244.anIntArrayArray30[local72 + 1][local77 - 1] == 0 && (local53[local68 + 1][local89 - 1] & 0x60E40000) == 0 && (local53[local68 + 1][local89] & 0x60240000) == 0 && (local53[local68][local89 - 1] & 0x40A40000) == 0) {
				Static195.anIntArray244[local48] = local5 + 1;
				Static368.anIntArray399[local48] = local7 - 1;
				local48 = local48 + 1 & 0xFFF;
				Static244.anIntArrayArray30[local72 + 1][local77 - 1] = 9;
				Static117.anIntArrayArray17[local72 + 1][local77 - 1] = local242;
			}
			if (local72 > 0 && local77 < 127 && Static244.anIntArrayArray30[local72 - 1][local77 + 1] == 0 && (local53[local68 - 1][local89 + 1] & 0x4E240000) == 0 && (local53[local68 - 1][local89] & 0x42240000) == 0 && (local53[local68][local89 + 1] & 0x48240000) == 0) {
				Static195.anIntArray244[local48] = local5 - 1;
				Static368.anIntArray399[local48] = local7 + 1;
				Static244.anIntArrayArray30[local72 - 1][local77 + 1] = 6;
				local48 = local48 + 1 & 0xFFF;
				Static117.anIntArrayArray17[local72 - 1][local77 + 1] = local242;
			}
			if (local72 < 127 && local77 < 127 && Static244.anIntArrayArray30[local72 + 1][local77 + 1] == 0 && (local53[local68 + 1][local89 + 1] & 0x78240000) == 0 && (local53[local68 + 1][local89] & 0x60240000) == 0 && (local53[local68][local89 + 1] & 0x48240000) == 0) {
				Static195.anIntArray244[local48] = local5 + 1;
				Static368.anIntArray399[local48] = local7 + 1;
				local48 = local48 + 1 & 0xFFF;
				Static244.anIntArrayArray30[local72 + 1][local77 + 1] = 12;
				Static117.anIntArrayArray17[local72 + 1][local77 + 1] = local242;
			}
		}
		Static430.anInt3291 = local7;
		Static107.anInt2387 = local5;
		return false;
	}
}
