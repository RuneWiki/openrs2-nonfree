import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!lc", name = "M", descriptor = "Z")
	public static boolean aBoolean263;

	@OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
	public static int anInt3407 = 0;

	@OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
	public static int anInt3409 = 100;

	@OriginalMember(owner = "client!lc", name = "T", descriptor = "I")
	public static int anInt3414 = -1;

	@OriginalMember(owner = "client!lc", name = "Y", descriptor = "Lclient!cr;")
	public static Class37 aClass37_54 = new Class37(64);

	@OriginalMember(owner = "client!lc", name = "Z", descriptor = "[I")
	public static final int[] anIntArray330 = new int[32];

	@OriginalMember(owner = "client!lc", name = "ab", descriptor = "I")
	public static int anInt3419 = 0;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2895(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "(II)V")
	public static void method2898(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = Static282.anInt3516 - Static283.anInt5716;
		if (local8 >= 100) {
			Static246.anInt5156 = 1;
			return;
		}
		@Pc(19) int local19 = (int) Static318.aFloat77;
		if (local19 < Static109.anInt2092 >> 8) {
			local19 = Static109.anInt2092 >> 8;
		}
		if (Static68.aBooleanArray5[4] && local19 < Static147.anIntArray296[4] + 128) {
			local19 = Static147.anIntArray296[4] + 128;
		}
		@Pc(52) int local52 = Static175.anInt3715 + (int) Static143.aFloat21 & 0x3FFF;
		Static140.method2315(local19, (local19 >> 3) * 3 + 600, arg0, local52, Static352.method5834(Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726, Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728, Static127.anInt2487) - 50, Static163.anInt3374, Static29.anInt545);
		@Pc(101) float local101 = 1.0F - (float) ((100 - local8) * (-local8 + 100) * (100 - local8)) / 1000000.0F;
		Static117.anInt2244 = (int) (local101 * (float) (Static117.anInt2244 - Static13.anInt211) + (float) Static13.anInt211);
		Static4.anInt41 = (int) ((float) Static47.anInt1207 + local101 * (float) (Static4.anInt41 - Static47.anInt1207));
		Static177.anInt3734 = (int) (local101 * (float) (Static177.anInt3734 - Static206.anInt4317) + (float) Static206.anInt4317);
		Static338.anInt6530 = (int) ((float) Static151.anInt3085 + (float) (Static338.anInt6530 - Static151.anInt3085) * local101);
		@Pc(153) int local153 = Static296.anInt5982 - Static87.anInt1665;
		if (local153 > 8192) {
			local153 -= 16384;
		} else if (local153 < -8192) {
			local153 += 16384;
		}
		Static296.anInt5982 = (int) ((float) Static87.anInt1665 + local101 * (float) local153);
		Static296.anInt5982 &= 0x3FFF;
	}

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
	public static void method2899() {
		@Pc(1) Class37 local1 = Static54.aClass37_26;
		synchronized (Static54.aClass37_26) {
			Static54.aClass37_26.method914();
		}
		local1 = Static239.aClass37_46;
		synchronized (Static239.aClass37_46) {
			Static239.aClass37_46.method914();
		}
		@Pc(31) Class75 local31 = Static61.aClass75_1;
		synchronized (Static61.aClass75_1) {
			Static61.aClass75_1.method1467();
		}
	}
}
