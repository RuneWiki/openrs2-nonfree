import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!mh", name = "g", descriptor = "B")
	public static byte aByte63;

	@OriginalMember(owner = "client!mh", name = "h", descriptor = "Lclient!tn;")
	public static Class229 aClass229_7 = null;

	@OriginalMember(owner = "client!mh", name = "r", descriptor = "[I")
	public static final int[] anIntArray334 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)I")
	public static int method3549(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V")
	public static void method3551() {
		if (Static434.anInt7559 < 0) {
			return;
		}
		@Pc(4) long local4 = Static107.method1707();
		Static434.anInt7559 = (int) ((long) Static434.anInt7559 + Static329.aLong172 - local4);
		if (Static434.anInt7559 > 0) {
			@Pc(24) int local24 = (Static434.anInt7559 << 8) / Static214.anInt6455;
			@Pc(28) int local28 = 255 - local24;
			@Pc(33) float local33 = (float) local24 / 255.0F;
			Static114.anInt2191 = (local24 * (Static358.anInt6541 & 0xFF00FF) + local28 * (Static239.aClass241_2.anInt7147 & 0xFF00FF) & 0xFF00FF00) + ((Static239.aClass241_2.anInt7147 & 0xFF00) * local28 + local24 * (Static358.anInt6541 & 0xFF00) & 0xFF0000) >>> 8;
			@Pc(71) float local71 = 1.0F - local33;
			Static138.aFloat122 = Static193.aFloat71 + (Static239.aClass241_2.aFloat120 - Static193.aFloat71) * local71;
			Static383.aFloat64 = local71 * (Static239.aClass241_2.aFloat119 - Static133.aFloat30) + Static133.aFloat30;
			Static241.aFloat74 = (Static239.aClass241_2.aFloat116 - Static145.aFloat38) * local71 + Static145.aFloat38;
			Static71.aFloat20 = Static1.aFloat1 + (Static239.aClass241_2.aFloat118 - Static1.aFloat1) * local71;
			Static444.aFloat125 = local71 * (Static239.aClass241_2.aFloat121 - Static33.aFloat8) + Static33.aFloat8;
			Static250.aFloat75 = Static45.aFloat10 + (Static239.aClass241_2.aFloat117 - Static45.aFloat10) * local71;
			Static15.anInt285 = ((Static239.aClass241_2.anInt7153 & 0xFF00) * local28 + local24 * (Static243.anInt4258 & 0xFF00) & 0xFF0000) + ((Static243.anInt4258 & 0xFF00FF) * local24 + ((Static239.aClass241_2.anInt7153 & 0xFF00FF) * local28) & 0xFF00FF00) >>> 8;
			Static65.anInt1188 = Static239.aClass241_2.anInt7144 * local28 + Static411.anInt7231 * local24 >> 8;
			if (Static239.aClass241_2.aClass89_4 != Static433.aClass89_6) {
				Static402.aClass89_5 = Static328.aClass121_9.method4637(Static433.aClass89_6, Static239.aClass241_2.aClass89_4, local71, Static402.aClass89_5);
			}
		} else {
			Static65.anInt1188 = Static239.aClass241_2.anInt7144;
			Static434.anInt7559 = -1;
			Static71.aFloat20 = Static239.aClass241_2.aFloat118;
			Static138.aFloat122 = Static239.aClass241_2.aFloat120;
			Static250.aFloat75 = Static239.aClass241_2.aFloat117;
			Static402.aClass89_5 = Static239.aClass241_2.aClass89_4;
			Static15.anInt285 = Static239.aClass241_2.anInt7153;
			Static241.aFloat74 = Static239.aClass241_2.aFloat116;
			Static444.aFloat125 = Static239.aClass241_2.aFloat121;
			Static383.aFloat64 = Static239.aClass241_2.aFloat119;
			Static114.anInt2191 = Static239.aClass241_2.anInt7147;
		}
		Static329.aLong172 = local4;
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IB)S")
	public static short method3555(@OriginalArg(0) int arg0) {
		@Pc(16) int local16 = arg0 >> 10 & 0x3F;
		@Pc(22) int local22 = arg0 >> 3 & 0x70;
		@Pc(26) int local26 = arg0 & 0x7F;
		@Pc(46) int local46 = local26 > 64 ? local22 * (127 - local26) >> 7 : local26 * local22 >> 7;
		@Pc(50) int local50 = local46 + local26;
		@Pc(56) int local56;
		if (local50 == 0) {
			local56 = local46 << 1;
		} else {
			local56 = (local46 << 8) / local50;
		}
		return (short) (local16 << 10 | local56 >> 4 << 7 | local50);
	}
}
