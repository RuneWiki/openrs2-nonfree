import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "Lclient!s;")
	public static final Class217 aClass217_97 = new Class217(17, 8);

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "Z")
	public static boolean aBoolean288 = true;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
	public static void method3458() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static2.anInt7; local13++) {
			for (@Pc(17) int local17 = 0; local17 < Static17.anInt315; local17++) {
				if (Static436.method5772(local17, Static309.aClass11ArrayArrayArray2, true, local7, local13)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)Z")
	public static boolean method3459() {
		return Static14.aBoolean18;
	}
}
