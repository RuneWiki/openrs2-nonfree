import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static614 {

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "[Lclient!wf;")
	public static Class362_Sub1[] aClass362_Sub1Array2;

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
	public static int anInt10090 = -1;

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
	public static void method8571() {
		for (@Pc(10) int local10 = 0; local10 < Static259.anInt4870; local10++) {
			@Pc(22) int local22 = Static123.method2207(local10 + Static173.anInt3502, Static259.anInt4870) * Static294.anInt5311;
			for (@Pc(24) int local24 = 0; local24 < Static294.anInt5311; local24++) {
				@Pc(37) int local37 = local22 + Static123.method2207(Static259.anInt4871 + local24, Static294.anInt5311);
				if (Static498.anInt7911 == Static18.anIntArray38[local37]) {
					Static65.anInterface18Array1[local37].method8673(0, 0, Static456.anInt7437, Static5.anInt108, Static456.anInt7437 * local24, Static5.anInt108 * local10);
				}
			}
		}
	}
}
