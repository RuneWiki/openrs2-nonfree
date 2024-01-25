import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bga", name = "x", descriptor = "Lclient!vd;")
	public static final Class378 aClass378_1 = new Class378(16);

	@OriginalMember(owner = "client!bga", name = "a", descriptor = "()V")
	public static void method622() {
		for (@Pc(1) int local1 = 0; local1 < Static403.aClass23Array1.length; local1++) {
			Static403.aClass23Array1[local1].method379();
		}
		Static403.aClass23Array1 = null;
	}
}
