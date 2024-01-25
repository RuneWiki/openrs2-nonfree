import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
	public static int anInt6021 = -1;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)Lclient!em;")
	public static Class58 method5370(@OriginalArg(0) int arg0) {
		@Pc(10) Class58 local10 = (Class58) Static136.aClass66_46.method1939((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(26) byte[] local26 = Static312.aClass170_108.method4584(33, arg0);
		local10 = new Class58();
		if (local26 != null) {
			local10.method1603(new Class5_Sub1(local26), arg0);
		}
		Static136.aClass66_46.method1936((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)I")
	public static int method5371() {
		if (Static30.aFrame1 == null) {
			return Static145.aBoolean466 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
