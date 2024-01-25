import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!uv", name = "q", descriptor = "Lclient!pu;")
	public static Class270 aClass270_113;

	@OriginalMember(owner = "client!uv", name = "r", descriptor = "I")
	public static int anInt9075 = 0;

	@OriginalMember(owner = "client!uv", name = "u", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!uv", name = "w", descriptor = "Z")
	public static boolean aBoolean700 = false;

	@OriginalMember(owner = "client!uv", name = "x", descriptor = "I")
	public static int anInt9077 = -1;

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)V")
	public static void method7406() {
		Static557.anInt9336 = 0;
		@Pc(13) int local13 = (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365 >> 9) + Static541.anInt9058;
		@Pc(20) int local20 = Static116.anInt2289 + (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370 >> 9);
		if (local13 >= 3053 && local13 <= 3156 && local20 >= 3056 && local20 <= 3136) {
			Static557.anInt9336 = 1;
		}
		if (local13 >= 3072 && local13 <= 3118 && local20 >= 9492 && local20 <= 9535) {
			Static557.anInt9336 = 1;
		}
		if (Static557.anInt9336 == 1 && local13 >= 3139 && local13 <= 3199 && local20 >= 3008 && local20 <= 3062) {
			Static557.anInt9336 = 0;
		}
	}
}
