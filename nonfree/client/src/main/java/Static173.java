import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "[[I")
	public static int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
	public static int anInt3608;

	@OriginalMember(owner = "client!ml", name = "i", descriptor = "Lclient!qf;")
	public static Class146 aClass146_13;

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "F")
	public static float aFloat39;

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "Lclient!qf;")
	public static Class146 aClass146_12 = null;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I[B)Z")
	public static boolean method2889(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub14 local8 = new Class1_Sub14(arg0);
		@Pc(12) int local12 = local8.method2595();
		if (local12 != 1) {
			return false;
		}
		@Pc(29) boolean local29 = local8.method2595() == 1;
		if (local29) {
			Static87.method1297(local8);
		}
		Static145.method2305(local8);
		return true;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BC)Z")
	public static boolean method2890(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
