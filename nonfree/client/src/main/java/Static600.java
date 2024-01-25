import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static600 {

	@OriginalMember(owner = "client!uca", name = "b", descriptor = "I")
	public static int anInt9807;

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "I")
	public static int anInt9809;

	@OriginalMember(owner = "client!uca", name = "e", descriptor = "I")
	public static int anInt9810;

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(BII)V")
	public static void method7967(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static516.anInt8123 = arg0;
		Static8.anInt105 = arg1;
		if (Static471.anInt7481 == 0) {
			Static233.anInt4125 = Static521.anInt8228 * 2 + Static8.anInt105;
			Static320.anInt5358 = Static152.anInt10399 * 2 + Static516.anInt8123;
		} else if (Static471.anInt7481 == 1) {
			Static620.anInt10280 = Static9.anInt133 + Static8.anInt105 / Static141.anInt2656 + 2;
			Static358.anInt6116 = Static240.anInt4257 + Static516.anInt8123 / Static456.anInt7325 + 2;
			Static233.anInt4125 = Static620.anInt10280 * Static141.anInt2656;
			Static320.anInt5358 = Static456.anInt7325 * Static358.anInt6116;
			Static152.anInt10399 = Static320.anInt5358 - Static516.anInt8123 >> 1;
			Static521.anInt8228 = Static233.anInt4125 - Static8.anInt105 >> 1;
		} else if (Static471.anInt7481 == 2) {
			Static233.anInt4125 = Static8.anInt105;
			Static320.anInt5358 = Static516.anInt8123;
			return;
		}
	}
}
