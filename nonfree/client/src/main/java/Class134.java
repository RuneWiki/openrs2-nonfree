import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class134 {

	@OriginalMember(owner = "client!hf", name = "r", descriptor = "[Lclient!nv;")
	private static final Class232[] aClass232Array1 = new Class232[32];

	static {
		@Pc(91) Class232[] local91 = Static440.method6211();
		for (@Pc(93) int local93 = 0; local93 < local91.length; local93++) {
			aClass232Array1[local91[local93].anInt6494] = local91[local93];
		}
	}
}
