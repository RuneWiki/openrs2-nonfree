import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "Lclient!po;")
	public static Class263 aClass263_34;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "()V")
	public static void method7842() {
		for (@Pc(1) int local1 = 0; local1 < Static597.aClass33Array1.length; local1++) {
			Static597.aClass33Array1[local1].method1374();
		}
		Static597.aClass33Array1 = null;
	}
}
