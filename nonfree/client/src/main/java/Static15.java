import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "[I")
	public static int[] anIntArray36 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "[Z")
	public static boolean[] aBooleanArray7 = new boolean[200];

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString25 = null;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILclient!in;)I")
	public static int method301(@OriginalArg(1) int arg0, @OriginalArg(2) Class71 arg1) {
		if (arg1.anIntArrayArray8 == null || arg1.anIntArrayArray8.length <= arg0) {
			return -2;
		}
		try {
			@Pc(31) int[] local31 = arg1.anIntArrayArray8[arg0];
			@Pc(33) int local33 = 0;
			@Pc(35) int local35 = 0;
			@Pc(37) byte local37 = 0;
			while (true) {
				@Pc(42) int local42 = local31[local35++];
				@Pc(44) byte local44 = 0;
				@Pc(46) int local46 = 0;
				if (local42 == 0) {
					return local33;
				}
				if (local42 == 1) {
					local46 = Static216.anIntArray384[local31[local35++]];
				}
				if (local42 == 2) {
					local46 = Static181.anIntArray340[local31[local35++]];
				}
				if (local42 == 15) {
					local44 = 1;
				}
				if (local42 == 3) {
					local46 = Static179.anIntArray336[local31[local35++]];
				}
				if (local42 == 16) {
					local44 = 2;
				}
				@Pc(117) int local117;
				@Pc(128) Class71 local128;
				@Pc(133) int local133;
				@Pc(147) int local147;
				if (local42 == 4) {
					local117 = local31[local35++] << 16;
					@Pc(124) int local124 = local117 + local31[local35++];
					local128 = Static56.method1058(local124);
					local133 = local31[local35++];
					if (local133 != -1 && (!Static112.method2060(local133).aBoolean107 || Static189.aBoolean296)) {
						for (local147 = 0; local147 < local128.anIntArray243.length; local147++) {
							if (local133 + 1 == local128.anIntArray243[local147]) {
								local46 += local128.anIntArray239[local147];
							}
						}
					}
				}
				if (local42 == 5) {
					local46 = Static128.anIntArray259[local31[local35++]];
				}
				if (local42 == 6) {
					local46 = Class126.anIntArray360[Static181.anIntArray340[local31[local35++]] - 1];
				}
				if (local42 == 17) {
					local44 = 3;
				}
				if (local42 == 7) {
					local46 = Static128.anIntArray259[local31[local35++]] * 100 / 46875;
				}
				if (local42 == 8) {
					local46 = Static197.aClass14_Sub2_Sub1_2.anInt1719;
				}
				if (local42 == 9) {
					for (local117 = 0; local117 < 25; local117++) {
						if (Static105.aBooleanArray24[local117]) {
							local46 += Static181.anIntArray340[local117];
						}
					}
				}
				if (local42 == 10) {
					local117 = local31[local35++] << 16;
					local117 += local31[local35++];
					local128 = Static56.method1058(local117);
					local133 = local31[local35++];
					if (local133 != -1 && (!Static112.method2060(local133).aBoolean107 || Static189.aBoolean296)) {
						for (local147 = 0; local147 < local128.anIntArray243.length; local147++) {
							if (local128.anIntArray243[local147] == local133 + 1) {
								local46 = 999999999;
								break;
							}
						}
					}
				}
				if (local42 == 11) {
					local46 = Static107.anInt2500;
				}
				if (local42 == 12) {
					local46 = Static225.anInt4482;
				}
				if (local42 == 13) {
					local117 = Static128.anIntArray259[local31[local35++]];
					@Pc(353) int local353 = local31[local35++];
					local46 = (0x1 << local353 & local117) == 0 ? 0 : 1;
				}
				if (local42 == 14) {
					local117 = local31[local35++];
					local46 = Static112.method2061(local117);
				}
				if (local42 == 18) {
					local46 = Static53.anInt5288 + (Static197.aClass14_Sub2_Sub1_2.anInt4680 >> 7);
				}
				if (local42 == 19) {
					local46 = (Static197.aClass14_Sub2_Sub1_2.anInt4630 >> 7) + Static83.anInt1875;
				}
				if (local42 == 20) {
					local46 = local31[local35++];
				}
				if (local44 == 0) {
					if (local37 == 0) {
						local33 += local46;
					}
					if (local37 == 1) {
						local33 -= local46;
					}
					if (local37 == 2 && local46 != 0) {
						local33 /= local46;
					}
					if (local37 == 3) {
						local33 *= local46;
					}
					local37 = 0;
				} else {
					local37 = local44;
				}
			}
		} catch (@Pc(458) Exception local458) {
			return -1;
		}
	}
}
