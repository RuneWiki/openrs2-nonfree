import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class53 {

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "[I")
	public static final int[] anIntArray164 = new int[4096];

	static {
		for (@Pc(14) int local14 = 0; local14 < 4096; local14++) {
			anIntArray164[local14] = Static150.method2272(local14);
		}
	}
}
