import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!cn", name = "C", descriptor = "Z")
	public static boolean aBoolean200;

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(II[B)I")
	public static int method2328(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static159.method4855(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)Lclient!g;")
	public static Class4_Sub3_Sub9 method2329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class4_Sub3_Sub9 local16 = (Class4_Sub3_Sub9) Static122.aClass85_8.method1845((long) arg0 << 32 | (long) arg1);
		if (local16 == null) {
			local16 = new Class4_Sub3_Sub9(arg0, arg1);
			Static122.aClass85_8.method1841(local16, local16.aLong217);
		}
		return local16;
	}
}
