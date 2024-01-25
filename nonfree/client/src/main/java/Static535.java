import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static535 {

	@OriginalMember(owner = "client!uj", name = "h", descriptor = "B")
	public static byte aByte104;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "Lclient!db;")
	public static final Class64 aClass64_446 = new Class64(45, 2);

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
	public static int anInt9060 = 0;

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "Lclient!db;")
	public static final Class64 aClass64_447 = new Class64(110, -1);

	@OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
	public static int anInt9061 = 0;

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)V")
	public static void method7436() {
		Static277.aClass223_40.method4932();
	}

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "(B)V")
	public static void method7437() {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static38.anInt740; local17++) {
			for (@Pc(21) int local21 = 0; local21 < Static38.anInt741; local21++) {
				if (Static389.method5711(Static309.aClass100ArrayArrayArray2, local15, local21, true, local17)) {
					local15++;
				}
				if (local15 >= 512) {
					return;
				}
			}
		}
	}
}
