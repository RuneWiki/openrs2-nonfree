import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static408 {

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
	public static int anInt7338;

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
	public static int anInt7339;

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
	public static int anInt7342;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "[I")
	public static final int[] anIntArray503 = new int[13];

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "F")
	public static float aFloat98 = 0.0F;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!he;I)I")
	public static int method6018(@OriginalArg(0) Class100 arg0) {
		@Pc(12) int local12 = 0;
		if (arg0.method2492(Static436.anInt7724)) {
			local12++;
		}
		if (arg0.method2492(Static311.anInt5427)) {
			local12++;
		}
		return local12;
	}
}
