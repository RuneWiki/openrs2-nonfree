import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!bu", name = "d", descriptor = "I")
	public static int anInt1555;

	@OriginalMember(owner = "client!bu", name = "f", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_24 = new Class130(0, 0);

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(III)V")
	public static void method1569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13;
		if (arg0 != Static491.anInt8519) {
			Static546.anIntArray582 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static546.anIntArray582[local13] = (local13 << 12) / arg0;
			}
			Static491.anInt8519 = arg0;
			Static317.anInt5971 = arg0 * 32;
			Static309.anInt5846 = arg0 - 1;
		}
		if (Static336.anInt6310 == arg1) {
			return;
		}
		if (arg1 == Static491.anInt8519) {
			Static372.anIntArray207 = Static546.anIntArray582;
		} else {
			Static372.anIntArray207 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static372.anIntArray207[local13] = (local13 << 12) / arg1;
			}
		}
		Class4_Sub1_Sub3_Sub2.lb = arg1 - 1;
		Static336.anInt6310 = arg1;
	}
}
