import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!ap", name = "q", descriptor = "[I")
	public static int[] anIntArray30;

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_11 = new Class45("red:", "rot:", "rouge:", "vermelho:");

	@OriginalMember(owner = "client!ap", name = "l", descriptor = "Z")
	public static boolean aBoolean21 = false;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V")
	public static void method549() {
		Static247.aClass4_7.M(((float) Static286.aClass1_Sub15_Sub1_1.anInt7045 * 0.1F + 0.7F) * Static487.aFloat183);
		Static247.aClass4_7.m(Static342.anInt6309, Static497.aFloat38, Static86.aFloat43, (float) (Static265.anInt3379 << 0), (float) (Static169.anInt3412 << 0), (float) (Static204.anInt4065 << 0));
		Static247.aClass4_7.method7218(Static442.aClass103_4);
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[I)Ljava/lang/String;")
	public static String method550(@OriginalArg(1) int[] arg0) {
		@Pc(9) StringBuffer local9 = new StringBuffer();
		@Pc(11) int local11 = Static175.anInt3485;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(22) Class67 local22 = Static337.aClass48_1.method1527(arg0[local13]);
			if (local22.anInt1926 != -1) {
				@Pc(34) Class104 local34 = (Class104) Static292.aClass277_41.method7014((long) local22.anInt1926);
				if (local34 == null) {
					@Pc(42) Class70 local42 = Static547.method1922(Static46.aClass69_14, local22.anInt1926, 0);
					if (local42 != null) {
						local34 = Static455.aClass4_11.method7149(local42);
						Static292.aClass277_41.method7016(local34, (long) local22.anInt1926);
					}
				}
				if (local34 != null) {
					Static204.aClass104Array38[local11] = local34;
					local9.append(" <img=").append(local11).append(">");
					local11++;
				}
			}
		}
		return local9.toString();
	}
}
