import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!ms", name = "k", descriptor = "F")
	public static float aFloat150;

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "I")
	public static int anInt6938 = 1;

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "[I")
	public static final int[] anIntArray445 = new int[13];

	@OriginalMember(owner = "client!ms", name = "s", descriptor = "[I")
	public static final int[] anIntArray446 = new int[1];

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray25 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V")
	public static void method5783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15;
		if (arg1 != Static131.anInt2935) {
			Static361.anIntArray460 = new int[arg1];
			for (local15 = 0; local15 < arg1; local15++) {
				Static361.anIntArray460[local15] = (local15 << 12) / arg1;
			}
			Static131.anInt2935 = arg1;
			Static425.anInt8248 = arg1 * 32;
			Static251.anInt5425 = arg1 - 1;
		}
		if (Static331.anInt6903 == arg0) {
			return;
		}
		if (arg0 == Static131.anInt2935) {
			Static324.anIntArray440 = Static361.anIntArray460;
		} else {
			Static324.anIntArray440 = new int[arg0];
			for (local15 = 0; local15 < arg0; local15++) {
				Static324.anIntArray440[local15] = (local15 << 12) / arg0;
			}
		}
		Static483.anInt9026 = arg0 - 1;
		Static331.anInt6903 = arg0;
	}
}
