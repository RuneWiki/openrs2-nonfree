import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class271 {

	@OriginalMember(owner = "client!qa", name = "s", descriptor = "[Lclient!hv;")
	private static final Class141[] aClass141Array1 = new Class141[32];

	static {
		@Pc(95) Class141[] local95 = Static65.method9244();
		for (@Pc(97) int local97 = 0; local97 < local95.length; local97++) {
			aClass141Array1[local95[local97].anInt4991] = local95[local97];
		}
	}
}
