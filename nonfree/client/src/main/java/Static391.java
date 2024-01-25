import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!tn", name = "K", descriptor = "I")
	public static int anInt6814;

	@OriginalMember(owner = "client!tn", name = "E", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_113 = new Class237(23, 4);

	@OriginalMember(owner = "client!tn", name = "I", descriptor = "Lclient!tk;")
	public static final Class225 aClass225_24 = new Class225(12, 0, 1, 0);

	@OriginalMember(owner = "client!tn", name = "L", descriptor = "[I")
	public static final int[] anIntArray563 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!tn", name = "M", descriptor = "[I")
	public static final int[] anIntArray564 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method5338(@OriginalArg(1) String arg0) {
		if (Static35.aStringArray21 == null) {
			Static78.method1354();
		}
		@Pc(22) String[] local22 = Static326.method4592(arg0, '\n');
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			for (@Pc(28) int local28 = Static241.anInt4308; local28 > 0; local28--) {
				Static35.aStringArray21[local28] = Static35.aStringArray21[local28 - 1];
			}
			Static35.aStringArray21[0] = local22[local24];
			if (Static35.aStringArray21.length - 1 > Static241.anInt4308) {
				if (Static381.anInt5293 > 0) {
					Static381.anInt5293++;
				}
				Static241.anInt4308++;
			}
		}
	}
}
