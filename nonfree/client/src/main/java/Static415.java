import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!ot", name = "A", descriptor = "I")
	public static int anInt7119;

	@OriginalMember(owner = "client!ot", name = "z", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_143 = new Class136(83, 10);

	@OriginalMember(owner = "client!ot", name = "B", descriptor = "Z")
	public static boolean aBoolean597 = false;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)Lclient!oda;")
	public static Class255 method6340(@OriginalArg(1) int arg0) {
		@Pc(10) Class255 local10 = (Class255) Static356.aClass293_42.method6921((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static211.aClass384_51.method8885(0, arg0);
		local10 = new Class255();
		if (local20 != null) {
			local10.method6149(new Class5_Sub12(local20), arg0);
		}
		Static356.aClass293_42.method6925((long) arg0, local10);
		return local10;
	}
}
