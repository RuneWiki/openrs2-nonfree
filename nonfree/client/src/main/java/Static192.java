import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!mj", name = "K", descriptor = "Z")
	public static boolean aBoolean344;

	@OriginalMember(owner = "client!mj", name = "Q", descriptor = "[I")
	public static int[] anIntArray354;

	@OriginalMember(owner = "client!mj", name = "M", descriptor = "I")
	public static int anInt4154 = 2;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
	public static void method3496() {
		@Pc(1) Class154 local1 = Static202.aClass154_69;
		synchronized (Static202.aClass154_69) {
			Static202.aClass154_69.method4219();
		}
		local1 = Static108.aClass154_36;
		synchronized (Static108.aClass154_36) {
			Static108.aClass154_36.method4219();
		}
	}
}
