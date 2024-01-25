import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
	public static void method6410() {
		@Pc(12) Class385[] local12 = Class140.aClass385Array1;
		synchronized (Class140.aClass385Array1) {
			for (@Pc(16) int local16 = 0; local16 < Class140.aClass385Array1.length; local16++) {
				Class140.aClass385Array1[local16] = new Class385();
				Static683.anIntArray697[local16] = 0;
			}
		}
	}
}
