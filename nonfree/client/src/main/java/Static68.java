import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "Lclient!la;")
	public static Class207 aClass207_20;

	@OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
	public static int anInt1380;

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "Lclient!ri;")
	public static final Class303 aClass303_2 = new Class303();

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
	public static void method1114() {
		@Pc(7) Class99[] local7 = Class216.aClass99Array1;
		synchronized (Class216.aClass99Array1) {
			for (@Pc(16) int local16 = 0; local16 < Class216.aClass99Array1.length; local16++) {
				Class216.aClass99Array1[local16] = new Class99();
				Static308.anIntArray378[local16] = 0;
			}
		}
	}
}
