import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!c", name = "u", descriptor = "I")
	public static int anInt1304;

	@OriginalMember(owner = "client!c", name = "J", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!c", name = "K", descriptor = "I")
	public static int anInt1316;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)V")
	public static void method1145() {
		Static368.aClass295_38.method6462(50);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
	public static void method1147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static471.anInt7481 != 1) {
			return;
		}
		@Pc(13) int local13 = arg2 / Static141.anInt2656;
		@Pc(17) int local17 = arg1 / Static141.anInt2656;
		@Pc(21) int local21 = arg0 / Static456.anInt7325;
		@Pc(25) int local25 = arg3 / Static456.anInt7325;
		if (Static620.anInt10280 <= local13 || local17 < 0 || local21 >= Static358.anInt6116 || local25 < 0) {
			return;
		}
		if (local21 < 0) {
			local21 = 0;
		}
		if (Static620.anInt10280 <= local17) {
			local17 = Static620.anInt10280 - 1;
		}
		if (local25 >= Static358.anInt6116) {
			local25 = Static358.anInt6116 - 1;
		}
		if (local13 < 0) {
			local13 = 0;
		}
		for (@Pc(85) int local85 = local21; local85 <= local25; local85++) {
			@Pc(97) int local97 = Static13.method352(local85 + Static521.anInt8234, Static358.anInt6116) * Static620.anInt10280;
			for (@Pc(99) int local99 = local13; local99 <= local17; local99++) {
				@Pc(110) int local110 = local97 + Static13.method352(local99 + Static342.anInt5876, Static620.anInt10280);
				Static42.anIntArray52[local110] = Static170.anInt3112;
			}
		}
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(IZII)V")
	public static void method1149(@OriginalArg(1) boolean arg0) {
		Static399.anInt6572 = 2;
		Static16.anInt10139 = 22050;
		Static608.aBoolean713 = arg0;
	}
}
