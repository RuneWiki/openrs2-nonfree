import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "D")
	public static double aDouble5;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Z")
	public static boolean aBoolean201 = false;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
	public static int anInt2453 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)I")
	public static int method2073() {
		return Static292.aClass360_1.method8667();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method2074() {
		for (@Pc(11) int local11 = 0; local11 < Static174.anInt10833; local11++) {
			@Pc(22) int local22 = Static677.method9301(local11 + Static374.anInt6857, Static174.anInt10833) * Static347.anInt6424;
			for (@Pc(24) int local24 = 0; local24 < Static347.anInt6424; local24++) {
				@Pc(36) int local36 = local22 + Static677.method9301(Static537.anInt9245 + local24, Static347.anInt6424);
				if (Static610.anInt10303 == Static362.anIntArray486[local36]) {
					Static595.anInterface23Array1[local36].method9042(0, 0, Static465.anInt8179, Static309.anInt1943, local24 * Static465.anInt8179, local11 * Static309.anInt1943);
				}
			}
		}
	}
}
