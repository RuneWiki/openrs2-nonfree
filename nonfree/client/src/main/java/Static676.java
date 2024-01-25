import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static676 {

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "F")
	public static float aFloat219;

	@OriginalMember(owner = "client!wp", name = "s", descriptor = "Lclient!mj;")
	public static Class238 aClass238_16 = null;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "()V")
	public static void method9165() {
		for (@Pc(1) int local1 = 0; local1 < Static312.aClass291Array1.length; local1++) {
			Static312.aClass291Array1[local1].method6560();
		}
		Static312.aClass291Array1 = null;
	}
}
