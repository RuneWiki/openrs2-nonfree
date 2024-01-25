import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
	public static int anInt2669;

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
	public static int anInt2680;

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
	public static int anInt2683;

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "Z")
	public static boolean aBoolean214 = false;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "[I")
	public static final int[] anIntArray248 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)Lclient!ih;")
	public static Class160 method2376(@OriginalArg(1) int arg0) {
		@Pc(10) Class160 local10 = (Class160) Static101.aClass223_13.method4943((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static287.aClass31_63.method667(0, arg0);
		local10 = new Class160();
		if (local20 != null) {
			local10.method3810(new Class4_Sub9(local20));
		}
		local10.method3807();
		Static101.aClass223_13.method4938((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([SZ)[S")
	public static short[] method2380(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) short[] local18 = new short[arg0.length];
			Static602.method1588(arg0, 0, local18, 0, arg0.length);
			return local18;
		}
	}
}
