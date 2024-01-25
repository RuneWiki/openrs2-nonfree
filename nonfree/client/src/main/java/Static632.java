import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static632 {

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "Lclient!sq;")
	public static final Class316 aClass316_18 = new Class316(12, 0, 1, 0);

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
	public static int anInt10539 = 0;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!tp;Z)Lclient!tp;")
	public static Class331 method8494(@OriginalArg(0) Class331 arg0) {
		@Pc(11) Class331 local11 = Static73.method1920(arg0);
		if (local11 == null) {
			local11 = arg0.aClass331_18;
		}
		return local11;
	}
}
