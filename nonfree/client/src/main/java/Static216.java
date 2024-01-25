import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
	public static int anInt3609;

	@OriginalMember(owner = "client!kg", name = "K", descriptor = "Lclient!ns;")
	public static Class1_Sub1 aClass1_Sub1_1;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)Lclient!lv;")
	public static Class156 method2865(@OriginalArg(1) int arg0) {
		@Pc(10) Class156 local10 = (Class156) Static218.aClass44_42.method1028((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static15.aClass243_12.method5455(arg0, 0);
		local10 = new Class156();
		if (local20 != null) {
			local10.method3200(new Class5_Sub15(local20));
		}
		local10.method3198();
		Static218.aClass44_42.method1017((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method2866(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static468.method3858(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
