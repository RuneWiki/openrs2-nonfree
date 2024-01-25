import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!af", name = "d", descriptor = "I")
	public static int anInt4503;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "[Lclient!gl;")
	public static Class2[] aClass2Array13;

	@OriginalMember(owner = "client!af", name = "b", descriptor = "Lclient!al;")
	public static Class11 aClass11_95 = new Class11(64);

	@OriginalMember(owner = "client!af", name = "i", descriptor = "I")
	public static int anInt4507 = 0;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([BI)Z")
	public static boolean method4039(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class14_Sub4 local8 = new Class14_Sub4(arg0);
		@Pc(20) int local20 = local8.method2548();
		if (local20 != 1) {
			return false;
		}
		@Pc(34) boolean local34 = local8.method2548() == 1;
		if (local34) {
			Static296.method5068(local8);
		}
		Static13.method2365(local8);
		return true;
	}
}
