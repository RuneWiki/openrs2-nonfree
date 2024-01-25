import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "Lclient!ic;")
	public static Class113 aClass113_107;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "Lclient!go;")
	public static final Class97 aClass97_13 = new Class97(11, 0, 1, 2);

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_208 = new Class214(64, 8);

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Lclient!mo;")
	public static Class1_Sub3_Sub12 method4414(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub3_Sub12 local10 = (Class1_Sub3_Sub12) Static270.aClass240_3.method5015((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static143.aClass113_48.method2274(arg0, 0);
		if (local20 == null || local20.length <= 1) {
			return null;
		} else {
			local10 = Static337.method1433(local20);
			Static270.aClass240_3.method5021(local10, (long) arg0);
			return local10;
		}
	}
}
