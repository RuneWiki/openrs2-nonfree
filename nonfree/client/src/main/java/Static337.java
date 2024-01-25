import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "F")
	public static float aFloat131;

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "Z")
	public static boolean aBoolean377 = false;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
	public static void method4359() {
		for (@Pc(6) Class5_Sub31 local6 = (Class5_Sub31) Static207.aClass177_20.method3618(); local6 != null; local6 = (Class5_Sub31) Static207.aClass177_20.method3619()) {
			if (local6.aBoolean341) {
				local6.method3901();
			}
		}
		for (@Pc(36) Class5_Sub31 local36 = (Class5_Sub31) Static45.aClass177_2.method3618(); local36 != null; local36 = (Class5_Sub31) Static45.aClass177_2.method3619()) {
			if (local36.aBoolean341) {
				local36.method3901();
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)Z")
	public static boolean method4361() {
		return Static18.anInt395 > 0;
	}
}
