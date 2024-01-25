import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "[S")
	public static short[] aShortArray66;

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_48 = new Class83("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "[I")
	public static final int[] anIntArray180 = new int[4];

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "[I")
	public static final int[] anIntArray181 = new int[64];

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray25 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V")
	public static void method2233(@OriginalArg(1) int arg0) {
		Static6.anInt62 = arg0;
		@Pc(12) Class68 local12 = Static190.aClass68_20;
		synchronized (Static190.aClass68_20) {
			Static190.aClass68_20.method1777();
		}
		local12 = Static442.aClass68_58;
		synchronized (Static442.aClass68_58) {
			Static442.aClass68_58.method1777();
		}
	}
}
