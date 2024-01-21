import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class2_Sub7 extends Class2 {

	@OriginalMember(owner = "client!fa", name = "z", descriptor = "[I")
	public static int[] anIntArray114 = new int[32];

	@OriginalMember(owner = "client!fa", name = "y", descriptor = "Lclient!wb;")
	public Class65 aClass65_386;

	static {
		@Pc(6) int local6 = 2;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			anIntArray114[local8] = local6 - 1;
			local6 += local6;
		}
	}
}
