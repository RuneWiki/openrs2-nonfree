import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class100 {

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "[I")
	public static final int[] anIntArray266 = new int[4096];

	static {
		for (@Pc(14) int local14 = 0; local14 < 4096; local14++) {
			anIntArray266[local14] = Static257.method4671(local14);
		}
	}
}
