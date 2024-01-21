import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class1_Sub22 extends Class1 {

	@OriginalMember(owner = "client!tc", name = "E", descriptor = "[I")
	public static int[] anIntArray520 = new int[32];

	@OriginalMember(owner = "client!tc", name = "z", descriptor = "Lclient!ed;")
	public Class23 aClass23_1476;

	static {
		@Pc(28) int local28 = 2;
		for (@Pc(30) int local30 = 0; local30 < 32; local30++) {
			anIntArray520[local30] = local28 - 1;
			local28 += local28;
		}
	}
}
