import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public abstract class Class1_Sub27 extends Class1 {

	@OriginalMember(owner = "client!lq", name = "n", descriptor = "[I")
	public static final int[] anIntArray450 = new int[32];

	static {
		@Pc(35) int local35 = 2;
		for (@Pc(37) int local37 = 0; local37 < 32; local37++) {
			anIntArray450[local37] = local35 - 1;
			local35 += local35;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)I")
	public abstract int method4578();

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)J")
	public abstract long method4580();

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)I")
	public abstract int method4581();

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)I")
	public abstract int method4582();
}
