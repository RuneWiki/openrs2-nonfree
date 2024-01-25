import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!wk", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString245 = "Select";

	@OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
	public static int anInt6599 = -1;

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
	public static int anInt6601 = 0;

	@OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
	public static int anInt6604 = 0;

	@OriginalMember(owner = "client!wk", name = "v", descriptor = "Lclient!fd;")
	public static Class72 aClass72_20 = null;

	@OriginalMember(owner = "client!wk", name = "w", descriptor = "Lclient!bf;")
	public static Interface2 anInterface2_3 = null;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!c;I)V")
	public static void method5474(@OriginalArg(0) Class2_Sub2_Sub1_Sub1 arg0) {
		if (Static282.anInt5713 >= 400 || Static110.aClass2_Sub2_Sub1_Sub1_1 == arg0) {
			return;
		}
		@Pc(38) String local38;
		@Pc(87) int local87;
		if (arg0.anInt716 == 0) {
			@Pc(42) boolean local42 = true;
			if (Static110.aClass2_Sub2_Sub1_Sub1_1.anInt723 != -1 && arg0.anInt723 != -1) {
				@Pc(62) int local62 = Static110.aClass2_Sub2_Sub1_Sub1_1.anInt727 <= arg0.anInt727 ? arg0.anInt727 : Static110.aClass2_Sub2_Sub1_Sub1_1.anInt727;
				@Pc(77) int local77 = Static110.aClass2_Sub2_Sub1_Sub1_1.anInt723 < arg0.anInt723 ? Static110.aClass2_Sub2_Sub1_Sub1_1.anInt723 : arg0.anInt723;
				local87 = local62 * 10 / 100 + local77 + 5;
				@Pc(94) int local94 = Static110.aClass2_Sub2_Sub1_Sub1_1.anInt727 - arg0.anInt727;
				if (local94 < 0) {
					local94 = -local94;
				}
				if (local94 > local87) {
					local42 = false;
				}
			}
			@Pc(120) String local120 = Static269.anInt5508 == 1 ? Static66.aString45 : Static112.aString84;
			if (arg0.anInt724 > arg0.anInt727) {
				local38 = arg0.method652() + (local42 ? Static28.method4994(Static110.aClass2_Sub2_Sub1_Sub1_1.anInt727, arg0.anInt727) : "<col=ffffff>") + " (" + local120 + arg0.anInt727 + "+" + (arg0.anInt724 - arg0.anInt727) + ")";
			} else {
				local38 = arg0.method652() + (local42 ? Static28.method4994(Static110.aClass2_Sub2_Sub1_Sub1_1.anInt727, arg0.anInt727) : "<col=ffffff>") + " (" + local120 + arg0.anInt727 + ")";
			}
		} else {
			local38 = arg0.method652() + " (" + Static16.aString10 + arg0.anInt716 + ")";
		}
		if (Static315.anInt1642 == 1) {
			Static285.method4888(0, Static243.aString186 + " -> <col=ffffff>" + local38, (long) arg0.anInt6535, Static107.anInt6873, Static277.aString206, 0, 49);
		} else if (!Static247.aBoolean436) {
			for (@Pc(233) int local233 = 7; local233 >= 0; local233--) {
				if (Static230.aStringArray40[local233] != null) {
					@Pc(241) short local241 = 0;
					if (Static269.anInt5508 == 0 && Static230.aStringArray40[local233].equalsIgnoreCase(Static325.aString239)) {
						if (arg0.anInt727 > Static110.aClass2_Sub2_Sub1_Sub1_1.anInt727) {
							local241 = 2000;
						}
						if (Static110.aClass2_Sub2_Sub1_Sub1_1.anInt717 != 0 && arg0.anInt717 != 0) {
							if (Static110.aClass2_Sub2_Sub1_Sub1_1.anInt717 == arg0.anInt717) {
								local241 = 2000;
							} else {
								local241 = 0;
							}
						}
					} else if (Static162.aBooleanArray20[local233]) {
						local241 = 2000;
					}
					@Pc(295) short local295 = (short) (local241 + Static41.aShortArray17[local233]);
					local87 = Static130.anIntArray272[local233] == -1 ? Static98.anInt6645 : Static130.anIntArray272[local233];
					Static285.method4888(0, "<col=ffffff>" + local38, (long) arg0.anInt6535, local87, Static230.aStringArray40[local233], 0, local295);
				}
			}
		} else if ((Static184.anInt4052 & 0x8) != 0) {
			Static285.method4888(0, Static195.aString145 + " -> <col=ffffff>" + local38, (long) arg0.anInt6535, Static232.anInt4817, Static316.aString197, 0, 22);
		}
		for (@Pc(371) Class4_Sub18 local371 = (Class4_Sub18) Static248.aClass130_112.method3499(); local371 != null; local371 = (Class4_Sub18) Static248.aClass130_112.method3512()) {
			if (local371.anInt2905 == 33) {
				local371.aString94 = "<col=ffffff>" + local38;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BI[BI)I")
	public static int method5475(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg2; local9 < arg0; local9++) {
			local7 = Class4_Sub4_Sub14.anIntArray296[(arg1[local9] ^ local7) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
	public static void method5476() {
		@Pc(1) Class154 local1 = Static148.aClass154_75;
		synchronized (Static148.aClass154_75) {
			Static148.aClass154_75.method4219();
		}
		local1 = Static251.aClass154_79;
		synchronized (Static251.aClass154_79) {
			Static251.aClass154_79.method4219();
		}
	}
}
