import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	public static int anInt907;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
	public static int anInt910;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!ke;")
	public static Class1_Sub2_Sub4 aClass1_Sub2_Sub4_1;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "Lclient!hc;")
	public static Class51 aClass51_11;

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "[[I")
	public static int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Lclient!ab;")
	public static Class3 aClass3_4 = new Class3();

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
	public static void method581() {
		if (Static57.aFloat12 < Static17.aFloat3) {
			Static57.aFloat12 = (float) ((double) Static57.aFloat12 + (double) Static57.aFloat12 / 30.0D);
			if (Static17.aFloat3 < Static57.aFloat12) {
				Static57.aFloat12 = Static17.aFloat3;
			}
			Static99.method2088();
		} else if (Static17.aFloat3 < Static57.aFloat12) {
			Static57.aFloat12 = (float) ((double) Static57.aFloat12 - (double) Static57.aFloat12 / 30.0D);
			if (Static17.aFloat3 > Static57.aFloat12) {
				Static57.aFloat12 = Static17.aFloat3;
			}
			Static99.method2088();
		}
		if (Static249.anInt5332 == -1 || Static206.anInt4549 == -1) {
			return;
		}
		@Pc(63) int local63 = Static206.anInt4549 - Static239.anInt5151;
		@Pc(67) int local67 = Static249.anInt5332 - Static39.anInt1086;
		if (local63 < 2 || local63 > 2) {
			local63 >>= 0x4;
		}
		Static239.anInt5151 += local63;
		if (local67 < 2 || local67 > 2) {
			local67 >>= 0x4;
		}
		Static39.anInt1086 -= -local67;
		if (local67 == 0 && local63 == 0) {
			Static206.anInt4549 = -1;
			Static249.anInt5332 = -1;
		}
		Static99.method2088();
	}
}
