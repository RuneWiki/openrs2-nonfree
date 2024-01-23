import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!fc", name = "sc", descriptor = "I")
	public static int anInt1646;

	@OriginalMember(owner = "client!fc", name = "zc", descriptor = "I")
	public static int anInt1652;

	@OriginalMember(owner = "client!fc", name = "Ac", descriptor = "Lclient!th;")
	public static Class168 aClass168_55;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)Lclient!rn;")
	public static Class154 method1241(@OriginalArg(0) int arg0) {
		@Pc(6) Class154 local6 = (Class154) Static293.aClass89_50.method2268((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(21) byte[] local21 = Static281.aClass168_97.method4058(arg0, 29);
		local6 = new Class154();
		if (local21 != null) {
			local6.method3806(new Class1_Sub14(local21), arg0);
		}
		Static293.aClass89_50.method2272((long) arg0, local6);
		return local6;
	}
}
