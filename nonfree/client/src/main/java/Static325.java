import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V")
	public static void method5026() {
		for (@Pc(5) int local5 = 0; local5 < Static31.anInt495; local5++) {
			@Pc(16) int local16 = Static17.method232(local5 + Static494.anInt8274, Static31.anInt495) * Static299.anInt5764;
			for (@Pc(18) int local18 = 0; local18 < Static299.anInt5764; local18++) {
				@Pc(29) int local29 = local16 + Static17.method232(Static109.anInt2331 + local18, Static299.anInt5764);
				if (Static516.anIntArray483[local29] == Static10.anInt165) {
					Static420.anInterface15Array5[local29].method8680(0, 0, Static597.anInt9791, Static382.anInt6778, local18 * Static597.anInt9791, Static382.anInt6778 * local5);
				}
			}
		}
	}
}
