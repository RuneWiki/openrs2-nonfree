import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class351 {

	@OriginalMember(owner = "client!up", name = "q", descriptor = "[Lclient!se;")
	private static final Class314[] aClass314Array1 = new Class314[32];

	static {
		@Pc(89) Class314[] local89 = Static544.method7810();
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			aClass314Array1[local89[local91].anInt8556] = local89[local91];
		}
	}
}
