import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "Lclient!ct;")
	public static Class30 aClass30_77;

	@OriginalMember(owner = "client!qj", name = "f", descriptor = "[I")
	public static int[] anIntArray399;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_180 = new Class106("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_170 = new Class217(92, -1);

	@OriginalMember(owner = "client!qj", name = "e", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_174 = new Class18(17, 7);

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "Z")
	public static boolean aBoolean384 = false;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
	public static void method4775() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static311.anInt5653; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static189.anInt3820; local13++) {
				if (Static170.method3181(local9, local13, local7, true, Static105.aClass155ArrayArrayArray3)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
