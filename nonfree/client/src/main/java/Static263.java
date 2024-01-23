import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!u", name = "g", descriptor = "I")
	public static int anInt906 = 0;

	@OriginalMember(owner = "client!u", name = "i", descriptor = "I")
	public static int anInt908 = 0;

	@OriginalMember(owner = "client!u", name = "j", descriptor = "Lclient!dh;")
	public static Class33 aClass33_7 = new Class33(4);

	@OriginalMember(owner = "client!u", name = "l", descriptor = "Z")
	public static boolean aBoolean68 = false;

	@OriginalMember(owner = "client!u", name = "m", descriptor = "I")
	public static int anInt910 = -1;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lclient!qn;")
	public static Class142 method722(@OriginalArg(1) int arg0) {
		@Pc(10) Class142 local10 = (Class142) Static145.aClass33_24.method841((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static200.aClass98_119.method2396(arg0, 1);
		local10 = new Class142();
		if (local21 != null) {
			local10.method3532(new Class4_Sub17(local21), arg0);
		}
		Static145.aClass33_24.method845(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V")
	public static void method723() {
		aClass33_7 = null;
	}
}
