import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!fn", name = "H", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_71 = new Class56(27, 6);

	@OriginalMember(owner = "client!fn", name = "O", descriptor = "I")
	public static int anInt3206 = 0;

	@OriginalMember(owner = "client!fn", name = "f", descriptor = "(I)V")
	public static void method2880() {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static54.anInt1038; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static140.anInt3026; local18++) {
				if (Static338.method4800(Static309.aClass299ArrayArrayArray3, local12, true, local18, local14)) {
					local12++;
				}
				if (local12 >= 512) {
					return;
				}
			}
		}
	}
}
