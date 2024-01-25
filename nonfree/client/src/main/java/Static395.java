import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!tu", name = "d", descriptor = "Lclient!dn;")
	public static Class56 aClass56_81;

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "Z")
	public static boolean aBoolean472 = false;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IB)I")
	public static int method5319(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(IB)V")
	public static void method5330(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub3_Sub7 local15 = Static139.method2522(2, arg0);
		local15.method1563();
	}
}
