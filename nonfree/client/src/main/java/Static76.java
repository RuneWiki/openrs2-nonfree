import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
	public static int anInt1761 = 3353893;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V")
	public static void method1319() {
		for (@Pc(3) int local3 = -1; local3 < Static16.anInt461; local3++) {
			@Pc(13) int local13;
			if (local3 == -1) {
				local13 = 2047;
			} else {
				local13 = Static304.anIntArray533[local3];
			}
			@Pc(23) Class2_Sub4_Sub2 local23 = Static155.aClass2_Sub4_Sub2Array1[local13];
			if (local23 != null) {
				Static149.method2419(local23.method2088(), local23);
			}
		}
	}
}
