import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "I")
	public static int anInt7;

	@OriginalMember(owner = "client!aaa", name = "e", descriptor = "J")
	public static final long aLong1 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!aaa", name = "f", descriptor = "Z")
	public static boolean aBoolean1 = true;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)V")
	public static void method24() {
		if (!Static202.aBoolean295) {
			return;
		}
		@Pc(11) Class357 local11 = Static318.method4971(Static402.anInt9331, Static343.anInt5922);
		if (local11 != null && local11.anObjectArray17 != null) {
			@Pc(20) Class5_Sub9 local20 = new Class5_Sub9();
			local20.anObjectArray1 = local11.anObjectArray17;
			local20.aClass357_2 = local11;
			Static82.method1317(local20);
		}
		Static522.anInt7724 = -1;
		Static288.anInt4696 = -1;
		Static202.aBoolean295 = false;
		if (local11 != null) {
			Static637.method8778(local11);
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(IB)I")
	public static int method25(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
