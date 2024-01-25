import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
	public static int anInt6582;

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "Lclient!ij;")
	public static Class93 aClass93_124;

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "Z")
	public static boolean aBoolean571 = false;

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
	public static int anInt6583 = 99;

	@OriginalMember(owner = "client!vk", name = "j", descriptor = "[I")
	public static final int[] anIntArray614 = new int[4096];

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IB)V")
	public static void method5856() {
		@Pc(1) Class109 local1 = Static331.aClass109_60;
		synchronized (Static331.aClass109_60) {
			Static331.aClass109_60.method2859(5);
		}
		local1 = Static128.aClass109_42;
		synchronized (Static128.aClass109_42) {
			Static128.aClass109_42.method2859(5);
		}
	}
}
