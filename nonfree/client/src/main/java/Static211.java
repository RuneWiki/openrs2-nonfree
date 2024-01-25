import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
	public static int anInt4169 = -1;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
	public static int anInt4170 = 1;

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[100];

	@OriginalMember(owner = "client!nf", name = "m", descriptor = "[I")
	public static final int[] anIntArray398 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
	public static int anInt4178 = 0;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
	public static void method3887() {
		@Pc(1) Class109 local1 = Static342.aClass109_61;
		synchronized (Static342.aClass109_61) {
			Static342.aClass109_61.method2850();
		}
		local1 = Static77.aClass109_20;
		synchronized (Static77.aClass109_20) {
			Static77.aClass109_20.method2850();
		}
		@Pc(31) Class120 local31 = Static311.aClass120_2;
		synchronized (Static311.aClass120_2) {
			Static311.aClass120_2.method3171();
		}
	}
}
