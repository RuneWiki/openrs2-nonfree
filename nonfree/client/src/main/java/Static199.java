import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!gv", name = "Dd", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!gv", name = "gd", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_61 = new Class73(28, -2);

	@OriginalMember(owner = "client!gv", name = "Td", descriptor = "Z")
	public static boolean aBoolean358 = false;

	@OriginalMember(owner = "client!gv", name = "ce", descriptor = "Lclient!mu;")
	public static final Class212 aClass212_6 = new Class212("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIZ)V")
	public static void method3644(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class40 local9 = Static144.aClass40ArrayArray12[arg0][arg1];
		if (local9 != null) {
			Static101.anInt3117 = local9.anInt1878;
			Static485.anInt8563 = local9.anInt1874;
			Static538.anInt9323 = local9.anInt1881;
		}
		Static409.method6425();
	}
}
