import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "I")
	public static int anInt4817;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "Z")
	public static boolean aBoolean375 = false;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V")
	public static void method4129() {
		Static342.method5385((long) Static508.anInt8998, Static323.aClass9_8);
		if (Static6.anInt302 != -1) {
			Static466.method7186(Static6.anInt302);
		}
		for (@Pc(19) int local19 = 0; local19 < Static190.anInt4121; local19++) {
			if (Static429.aBooleanArray27[local19]) {
				Static3.aBooleanArray22[local19] = true;
			}
			Static14.aBooleanArray2[local19] = Static429.aBooleanArray27[local19];
			Static429.aBooleanArray27[local19] = false;
		}
		Static299.anInt5681 = Static508.anInt8998;
		if (Static323.aClass9_8.method5458()) {
			Static459.aBoolean363 = true;
		}
		if (Static6.anInt302 != -1) {
			Static190.anInt4121 = 0;
			Static184.method3594();
		}
		Static323.aClass9_8.F();
		Static6.method500(Static323.aClass9_8);
		@Pc(65) int local65 = Static205.method3805();
		if (local65 == -1) {
			local65 = Static530.anInt9191;
		}
		if (local65 == -1) {
			local65 = Static440.anInt8040;
		}
		Static8.method605(local65);
		Static388.anInt7269 = 0;
	}
}
