import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class130 {

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "[I")
	public static final int[] anIntArray293 = new int[4096];

	static {
		for (@Pc(6) int local6 = 0; local6 < 4096; local6++) {
			anIntArray293[local6] = Static430.method5756(local6);
		}
	}
}
