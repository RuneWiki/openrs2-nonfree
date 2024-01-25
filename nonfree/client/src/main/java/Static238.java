import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!ii", name = "J", descriptor = "I")
	public static int anInt8043;

	@OriginalMember(owner = "client!ii", name = "A", descriptor = "[I")
	public static final int[] anIntArray584 = new int[32];

	@OriginalMember(owner = "client!ii", name = "E", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_189 = new Class200(98, 12);

	@OriginalMember(owner = "client!ii", name = "K", descriptor = "I")
	public static int anInt8044 = 0;

	@OriginalMember(owner = "client!ii", name = "P", descriptor = "Z")
	public static boolean aBoolean585 = false;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)Lclient!bm;")
	public static Class40 method6994(@OriginalArg(1) int arg0) {
		@Pc(10) Class40 local10 = (Class40) Static139.aClass69_15.method1919((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static18.aClass238_12.method5567(arg0, 0);
		local10 = new Class40();
		if (local20 != null) {
			local10.method1199(new Class2_Sub17(local20));
		}
		local10.method1197();
		Static139.aClass69_15.method1917((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "(B)V")
	public static void method6995() {
		Static169.aBoolean264 = true;
	}
}
