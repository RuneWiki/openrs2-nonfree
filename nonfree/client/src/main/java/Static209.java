import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "[I")
	public static int[] anIntArray397;

	@OriginalMember(owner = "client!nd", name = "i", descriptor = "Z")
	public static boolean aBoolean344 = false;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Lclient!ap;")
	public static Class11 method3853(@OriginalArg(1) int arg0) {
		@Pc(12) Class11 local12 = (Class11) Static185.aClass109_41.method2857((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(22) byte[] local22 = Static22.aClass93_9.method2410(arg0, 1);
		local12 = new Class11();
		if (local22 != null) {
			local12.method289(arg0, new Class5_Sub12(local22));
		}
		Static185.aClass109_41.method2855((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method3854(@OriginalArg(1) String[] arg0) {
		@Pc(6) String[] local6 = new String[5];
		for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
			local6[local8] = local8 + ": ";
			if (arg0 != null && arg0[local8] != null) {
				local6[local8] = local6[local8] + arg0[local8];
			}
		}
		return local6;
	}
}
