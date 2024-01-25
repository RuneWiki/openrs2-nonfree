import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public final class Class198 {

	@OriginalMember(owner = "client!nda", name = "u", descriptor = "[Lclient!hh;")
	private static final Class117[] aClass117Array1 = new Class117[32];

	static {
		@Pc(89) Class117[] local89 = Static61.method1137();
		for (@Pc(91) int local91 = 0; local91 < local89.length; local91++) {
			aClass117Array1[local89[local91].anInt3345] = local89[local91];
		}
	}
}
