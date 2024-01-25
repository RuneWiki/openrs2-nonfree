import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V")
	public static void method2512() {
		if (!Static120.aBoolean172) {
			Static395.aBoolean521 = true;
			Static120.aBoolean172 = true;
			Static620.aFloat208 += (24.0F - Static620.aFloat208) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "(I)V")
	public static void method2513() {
		Static408.anInt7470 = 0;
		Static596.anInt9751 = 0;
		for (@Pc(11) int local11 = 0; local11 < Static592.anInt9706; local11++) {
			@Pc(17) int local17 = Static330.anInt6169 * local11;
			for (@Pc(19) int local19 = 0; local19 < Static330.anInt6169; local19++) {
				@Pc(25) int local25 = local19 + local17;
				Static440.anInterface8Array1[local25].method8530(Static153.anInt3029 * local19, local11 * Static159.anInt3138, Static153.anInt3029, Static159.anInt3138, true);
			}
		}
	}
}
