import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
	public static int anInt1086 = 7759444;

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
	public static int anInt1087 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method905() {
		Static128.aClass175_21.method4287();
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZLclient!nm;Lclient!nm;)V")
	public static void method906(@OriginalArg(2) Class119 arg0, @OriginalArg(3) Class119 arg1) {
		Static90.aBoolean182 = true;
		Static133.aClass119_52 = arg0;
		Static129.aClass119_48 = arg1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Lclient!ub;")
	public static Class170 method907(@OriginalArg(0) int arg0) {
		@Pc(10) Class170 local10 = (Class170) Static242.aClass175_36.method4295((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static299.aClass119_92.method3235(arg0, 34);
		local10 = new Class170();
		if (local20 != null) {
			local10.method4237(new Class1_Sub13(local20), arg0);
		}
		Static242.aClass175_36.method4285(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)V")
	public static void method908(@OriginalArg(1) boolean arg0) {
		if (Static256.aBoolean457 != arg0) {
			Static256.aBoolean457 = arg0;
			Static145.method2519();
		}
	}
}
