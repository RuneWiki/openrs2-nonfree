import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray19;

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
	public static int anInt6021;

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString426 = null;

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
	public static int anInt6017 = 0;

	@OriginalMember(owner = "client!vo", name = "j", descriptor = "Z")
	public static boolean aBoolean389 = false;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
	public static void method4616() {
		Static293.aClass89_51.method2273(5);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIII)V")
	public static void method4618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static207.anInt4464 = -1;
		Static202.anInt4408 = -1;
		@Pc(13) float local13 = (float) Static268.anInt2659 / (float) Static268.anInt2657;
		@Pc(15) int local15 = arg0;
		@Pc(23) int local23 = arg3;
		if (local13 < 1.0F) {
			local23 = (int) ((float) arg0 * local13);
		} else {
			local15 = (int) ((float) arg3 / local13);
		}
		@Pc(50) int local50 = arg2 - (arg3 - local23) / 2;
		Static299.anInt5944 = Static268.anInt2659 * local50 / local23;
		@Pc(65) int local65 = arg1 - (arg0 - local15) / 2;
		Static109.anInt2414 = Static268.anInt2657 * local65 / local15;
		Static278.method4757();
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(II)V")
	public static void method4619() {
		Static240.aClass89_37.method2273(5);
		Static263.aClass89_42.method2273(5);
	}
}
