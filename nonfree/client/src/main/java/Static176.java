import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!nc", name = "p", descriptor = "F")
	public static float aFloat161;

	@OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
	public static int anInt5575;

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "Lclient!ul;")
	public static Class172 aClass172_46 = new Class172(64);

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
	public static int anInt5566 = 0;

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
	public static int anInt5578 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public static void method4453() {
		Static159.aClass172_28.method4346();
		Static90.aClass172_42.method4346();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BILclient!cg;)Z")
	public static boolean method4458(@OriginalArg(1) int arg0, @OriginalArg(2) Class22 arg1) {
		@Pc(10) byte[] local10 = arg1.method683(arg0);
		if (local10 == null) {
			return false;
		} else {
			Static304.method4671(local10);
			return true;
		}
	}
}
