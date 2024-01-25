import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!eca", name = "j", descriptor = "I")
	public static int anInt2340;

	@OriginalMember(owner = "client!eca", name = "l", descriptor = "I")
	public static int anInt2341 = -1;

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)V")
	public static void method2148() {
		@Pc(7) int local7 = Static103.anInt992;
		@Pc(9) int[] local9 = Static523.anIntArray682;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class15_Sub2_Sub1_Sub1 local19 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local9[local11]];
			if (local19 != null) {
				Static465.method6479(local19, local19.method4035());
			}
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(III)V")
	public static void method2150(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13;
		if (Static147.anInt3075 != arg0) {
			Static315.anIntArray425 = new int[arg0];
			for (local13 = 0; local13 < arg0; local13++) {
				Static315.anIntArray425[local13] = (local13 << 12) / arg0;
			}
			Static497.anInt9138 = arg0 - 1;
			Static147.anInt3075 = arg0;
			Static169.anInt3417 = arg0 * 32;
		}
		if (Static250.anInt5057 == arg1) {
			return;
		}
		if (Static147.anInt3075 == arg1) {
			Static295.anIntArray403 = Static315.anIntArray425;
		} else {
			Static295.anIntArray403 = new int[arg1];
			for (local13 = 0; local13 < arg1; local13++) {
				Static295.anIntArray403[local13] = (local13 << 12) / arg1;
			}
		}
		Static250.anInt5057 = arg1;
		Static160.anInt3274 = arg1 - 1;
	}
}
