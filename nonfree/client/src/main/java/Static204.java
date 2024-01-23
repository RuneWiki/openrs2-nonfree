import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "Lclient!ak;")
	public static Class7 aClass7_168;

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
	public static int anInt4015;

	@OriginalMember(owner = "client!pi", name = "E", descriptor = "Lclient!db;")
	public static Class31 aClass31_30 = new Class31(32);

	@OriginalMember(owner = "client!pi", name = "F", descriptor = "[Lclient!pi;")
	public static Class133[] aClass133Array1 = new Class133[14];

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)Lclient!ao;")
	public static Class10 method3162(@OriginalArg(1) int arg0) {
		@Pc(10) Class10 local10 = (Class10) Static180.aClass31_26.method852((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(28) byte[] local28 = Static79.aClass7_131.method253(arg0, 33);
		local10 = new Class10();
		if (local28 != null) {
			local10.method307(new Class1_Sub18(local28), arg0);
		}
		Static180.aClass31_26.method851(local10, (long) arg0);
		return local10;
	}
}
