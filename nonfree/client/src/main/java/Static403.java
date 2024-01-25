import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static403 {

	@OriginalMember(owner = "client!tr", name = "t", descriptor = "[Lclient!aa;")
	public static Class2[] aClass2Array28;

	@OriginalMember(owner = "client!tr", name = "v", descriptor = "I")
	public static int anInt3405 = -1;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Z")
	public static boolean method3041(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static266.method4280(arg1, arg0) || Static106.method6189(arg0, arg1);
	}
}
