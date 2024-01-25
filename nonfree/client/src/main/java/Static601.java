import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static601 {

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "Lclient!jm;")
	public static Class2_Sub2_Sub11 aClass2_Sub2_Sub11_4;

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "Z")
	public static boolean aBoolean709 = false;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBI)I")
	public static int method8115(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(47) int local47 = Static363.method4916(arg0 + 45365, arg1 + 91923, 4) + (Static363.method4916(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (Static363.method4916(arg0, arg1, 1) - 128 >> 2) - 128;
		local47 = (int) ((double) local47 * 0.3D) + 35;
		if (local47 < 10) {
			local47 = 10;
		} else if (local47 > 60) {
			local47 = 60;
		}
		return local47;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "([BII)I")
	public static int method8116(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static13.method184(arg0, arg1, 0);
	}
}
