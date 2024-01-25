import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
	public static int anInt4685;

	@OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
	public static volatile int anInt4679 = 0;

	@OriginalMember(owner = "client!pk", name = "P", descriptor = "[[I")
	public static final int[][] anIntArrayArray39 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!pk", name = "cb", descriptor = "I")
	public static int anInt4696 = 0;

	@OriginalMember(owner = "client!pk", name = "db", descriptor = "[S")
	public static final short[] aShortArray81 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(II)I")
	public static int method4106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static267.anIntArrayArray40 == null ? 0 : Static267.anIntArrayArray40[arg0][arg1] >>> 21 & 0x7F8;
	}

	@OriginalMember(owner = "client!pk", name = "h", descriptor = "(I)V")
	public static void method4107() {
		if (Static34.aClass60_3 == null) {
			return;
		}
		if (Static34.aClass60_3.anInt1838 == 1) {
			Static34.aClass60_3 = null;
			return;
		}
		if (Static34.aClass60_3.anInt1838 == 2) {
			Static21.method5515(Static32.aClass10_1, 2, Static317.aString353);
			Static34.aClass60_3 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZB)V")
	public static void method4108(@OriginalArg(0) boolean arg0) {
		@Pc(7) int[] local7 = null;
		@Pc(13) byte local13;
		@Pc(11) byte[][] local11;
		if (arg0) {
			local11 = Static49.aByteArrayArray4;
			local13 = 1;
		} else {
			local13 = 4;
			local11 = Static129.aByteArrayArray6;
		}
		for (@Pc(21) int local21 = 0; local21 < local13; local21++) {
			Static153.method2894();
			for (@Pc(26) int local26 = 0; local26 < Static266.anInt5101 >> 3; local26++) {
				for (@Pc(30) int local30 = 0; local30 < Static339.anInt6352 >> 3; local30++) {
					@Pc(34) boolean local34 = false;
					@Pc(42) int local42 = Static118.anIntArrayArrayArray6[local21][local26][local30];
					if (local42 != -1) {
						@Pc(52) int local52 = local42 >> 24 & 0x3;
						if (!arg0 || local52 == 0) {
							@Pc(62) int local62 = local42 >> 1 & 0x3;
							@Pc(68) int local68 = local42 >> 14 & 0x3FF;
							@Pc(74) int local74 = local42 >> 3 & 0x7FF;
							@Pc(84) int local84 = (local68 / 8 << 8) + local74 / 8;
							for (@Pc(86) int local86 = 0; local86 < Static338.anIntArray283.length; local86++) {
								if (local84 == Static338.anIntArray283[local86] && local11[local86] != null) {
									@Pc(121) int[] local121 = Static342.method5672(local74, local11[local86], local68, local52, local30 * 8, Static15.aClass59_1, local62, arg0, local26 * 8, local21, Static117.aClass49Array1);
									if (local7 == null && local121 != null) {
										local7 = local121;
									}
									local34 = true;
									break;
								}
							}
						}
					}
					if (!local34) {
						Static335.method5598(8, local21, local26 * 8, 8, local30 * 8);
					}
				}
			}
		}
		if (local7 == null) {
			Static34.aClass129_1 = null;
		} else {
			Static34.aClass129_1 = Static268.method5800(local7[2], local7[1], local7[3], local7[0]);
			Static135.anInt2760 = local7[4];
		}
	}

	@OriginalMember(owner = "client!pk", name = "j", descriptor = "(I)V")
	public static void method4110() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static293.aBooleanArray25[local7] = true;
		}
	}
}
