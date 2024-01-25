import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static443 {

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "F")
	public static float aFloat189;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "I")
	public static int anInt8428 = 2;

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "[I")
	public static final int[] anIntArray492 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)Z")
	public static boolean method6528() {
		if (Static314.aBoolean433) {
			try {
				Static597.method1279(Static589.anApplet2, "showVideoAd");
				return true;
			} catch (@Pc(18) Throwable local18) {
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(Lclient!ek;I)V")
	public static void method6529(@OriginalArg(0) Class4_Sub13 arg0) {
		if (arg0.aByteArray88.length - arg0.anInt9170 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method7004();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray88.length - arg0.anInt9170 < 2) {
			return;
		}
		@Pc(43) int local43 = arg0.method7054();
		if (local43 * 6 > arg0.aByteArray88.length - arg0.anInt9170) {
			return;
		}
		for (@Pc(62) int local62 = 0; local62 < local43; local62++) {
			@Pc(68) int local68 = arg0.method7054();
			@Pc(72) int local72 = arg0.method6990();
			if (Static65.anIntArray67.length > local68 && Static188.aBooleanArray11[local68] && (Static339.aClass257_1.method5966(local68).aChar1 != '1' || local72 >= -1 && local72 <= 1)) {
				Static65.anIntArray67[local68] = local72;
			}
		}
	}
}
