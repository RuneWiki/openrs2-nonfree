import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!bv", name = "s", descriptor = "I")
	public static int anInt1120;

	@OriginalMember(owner = "client!bv", name = "v", descriptor = "Lclient!tj;")
	public static Class4 aClass4_3;

	@OriginalMember(owner = "client!bv", name = "t", descriptor = "Lclient!us;")
	public static final Class344 aClass344_20 = new Class344(38, -1);

	@OriginalMember(owner = "client!bv", name = "w", descriptor = "[I")
	public static int[] anIntArray55 = new int[1];

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(I)V")
	public static void method1179() {
		for (@Pc(11) int local11 = 0; local11 < Static158.anInt3847; local11++) {
			@Pc(24) int local24 = Static133.method3090(Static158.anInt3847, local11 + Static164.anInt8855) * Static87.anInt2288;
			for (@Pc(26) int local26 = 0; local26 < Static87.anInt2288; local26++) {
				@Pc(38) int local38 = Static133.method3090(Static87.anInt2288, local26 + Static43.anInt770) + local24;
				if (Static451.anInt8203 == Static295.anIntArray349[local38]) {
					Static235.anInterface16Array1[local38].method8388(0, 0, Static246.anInt5504, Static584.anInt9762, Static246.anInt5504 * local26, Static584.anInt9762 * local11);
				}
			}
		}
	}
}
