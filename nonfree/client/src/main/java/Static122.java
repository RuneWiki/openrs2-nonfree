import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!im", name = "f", descriptor = "I")
	public static int anInt2303;

	@OriginalMember(owner = "client!im", name = "g", descriptor = "[I")
	public static int[] anIntArray279;

	@OriginalMember(owner = "client!im", name = "h", descriptor = "[I")
	public static int[] anIntArray280 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!im", name = "j", descriptor = "I")
	public static int anInt2305 = 0;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIBI)I")
	public static int method2036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static256.anIntArrayArrayArray14 == null) {
			return 0;
		}
		@Pc(13) int local13 = arg0 >> 7;
		@Pc(17) int local17 = arg1 >> 7;
		if (local17 < 0 || local13 < 0 || local17 > 103 || local13 > 103) {
			return 0;
		}
		@Pc(37) int local37 = arg2;
		if (arg2 < 3 && (Static41.aByteArrayArrayArray2[1][local17][local13] & 0x2) == 2) {
			local37 = arg2 + 1;
		}
		@Pc(62) int local62 = arg0 & 0x7F;
		@Pc(66) int local66 = arg1 & 0x7F;
		@Pc(93) int local93 = Static256.anIntArrayArrayArray14[local37][local17 + 1][local13] * local66 + Static256.anIntArrayArrayArray14[local37][local17][local13] * (128 - local66) >> 7;
		@Pc(124) int local124 = Static256.anIntArrayArrayArray14[local37][local17 + 1][local13 + 1] * local66 + Static256.anIntArrayArrayArray14[local37][local17][local13 + 1] * (128 - local66) >> 7;
		return local124 * local62 + local93 * (128 - local62) >> 7;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
	public static void method2038() {
		Static249.aClass98_40.method2572();
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(I)Ljava/lang/String;")
	public static String method2040() {
		@Pc(38) String local38;
		if (Static153.anInt2895 == 1 && Static152.anInt2876 < 2) {
			local38 = Static149.aString103 + Static3.aString1 + Static246.aString173 + " ->";
		} else if (Static39.aBoolean56 && Static152.anInt2876 < 2) {
			local38 = Static26.aString14 + Static3.aString1 + Static286.aString205 + " ->";
		} else if (Static176.aBoolean234 && Static95.aBooleanArray39[81] && Static152.anInt2876 > 2) {
			local38 = Static153.method2577(Static152.anInt2876 - 2);
		} else {
			local38 = Static153.method2577(Static152.anInt2876 - 1);
		}
		if (Static152.anInt2876 > 2) {
			local38 = local38 + "<col=ffffff> / " + (Static152.anInt2876 - 2) + Static220.aString180;
		}
		return local38;
	}
}
