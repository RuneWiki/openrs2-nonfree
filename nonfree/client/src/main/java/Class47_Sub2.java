import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class47_Sub2 extends Class47 {

	@OriginalMember(owner = "client!nl", name = "y", descriptor = "[Lclient!fj;")
	private static final Class69[] aClass69Array1 = new Class69[32];

	static {
		@Pc(65) Class69[] local65 = Static229.method4239();
		for (@Pc(67) int local67 = 0; local67 < local65.length; local67++) {
			aClass69Array1[local65[local67].anInt1946] = local65[local67];
		}
	}
}
