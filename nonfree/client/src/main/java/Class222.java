import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class222 {

	@OriginalMember(owner = "client!sd", name = "o", descriptor = "[Lclient!si;")
	private static final Class223[] aClass223Array1 = new Class223[32];

	static {
		@Pc(65) Class223[] local65 = Static268.method4091();
		for (@Pc(67) int local67 = 0; local67 < local65.length; local67++) {
			aClass223Array1[local65[local67].anInt6416] = local65[local67];
		}
	}
}
