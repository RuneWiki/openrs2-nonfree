import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cba", name = "j", descriptor = "[I")
	public static final int[] anIntArray68 = new int[8];

	@OriginalMember(owner = "client!cba", name = "k", descriptor = "Z")
	public static boolean aBoolean106 = false;

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lclient!r;IZI)Lclient!la;")
	public static Class35 method1302(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(17) Class281 local17 = Static491.method1540(arg1, arg2, arg0);
		return local17 == null ? null : local17.aClass35_12;
	}
}
