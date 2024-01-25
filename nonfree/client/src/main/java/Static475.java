import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static475 {

	@OriginalMember(owner = "client!qaa", name = "S", descriptor = "I")
	public static int anInt8500;

	@OriginalMember(owner = "client!qaa", name = "X", descriptor = "I")
	public static int anInt8504;

	@OriginalMember(owner = "client!qaa", name = "Y", descriptor = "Z")
	public static boolean aBoolean620 = false;

	@OriginalMember(owner = "client!qaa", name = "Z", descriptor = "I")
	public static final int anInt8505 = 1406;

	@OriginalMember(owner = "client!qaa", name = "e", descriptor = "(I)V")
	public static void method7569() {
		@Pc(10) Class2_Sub49 local10;
		for (local10 = (Class2_Sub49) Static338.aClass271_39.method7177(); local10 != null; local10 = (Class2_Sub49) Static338.aClass271_39.method7175()) {
			if (local10.aBoolean768) {
				local10.method9825();
			} else {
				local10.aBoolean767 = true;
				if (local10.anInt10499 >= 0 && local10.anInt10505 >= 0 && Static222.anInt4533 > local10.anInt10499 && Static668.anInt11370 > local10.anInt10505) {
					Static532.method8227(local10);
				}
			}
		}
		for (local10 = (Class2_Sub49) Static545.aClass271_58.method7177(); local10 != null; local10 = (Class2_Sub49) Static545.aClass271_58.method7175()) {
			if (local10.aBoolean768) {
				local10.method9825();
			} else {
				local10.aBoolean767 = true;
			}
		}
	}
}
