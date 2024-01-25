import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static452 {

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "Lclient!la;")
	public static Class207 aClass207_92;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "[I")
	public static final int[] anIntArray413 = new int[14];

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "Lclient!fa;")
	public static final Class99 aClass99_9 = new Class99();

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
	public static int anInt7708 = 0;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZII)V")
	public static void method6797(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static111.anInt2087 = arg0;
		Static517.anInt8880 = arg1;
		if (Static483.anInt8236 == 0) {
			Static404.anInt6761 = Static443.anInt7572 * 2 + Static111.anInt2087;
			Static447.anInt7618 = Static517.anInt8880 + Static583.anInt9806 * 2;
		} else if (Static483.anInt8236 == 1) {
			Static28.anInt358 = Static283.anInt5005 + Static517.anInt8880 / Static252.anInt4593 + 2;
			Static6.anInt95 = Static614.anInt10281 + Static111.anInt2087 / Static408.anInt7120 + 2;
			Static447.anInt7618 = Static252.anInt4593 * Static28.anInt358;
			Static404.anInt6761 = Static408.anInt7120 * Static6.anInt95;
			Static443.anInt7572 = Static404.anInt6761 - Static111.anInt2087 >> 1;
			Static583.anInt9806 = Static447.anInt7618 - Static517.anInt8880 >> 1;
		} else if (Static483.anInt8236 == 2) {
			Static447.anInt7618 = Static517.anInt8880;
			Static404.anInt6761 = Static111.anInt2087;
		}
	}
}
