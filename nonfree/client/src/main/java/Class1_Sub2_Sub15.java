import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class1_Sub2_Sub15 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ld", name = "O", descriptor = "[I")
	public static final int[] anIntArray299 = new int[4096];

	@OriginalMember(owner = "client!ld", name = "L", descriptor = "Lclient!wg;")
	public final Class6 aClass6_4;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray299[local4] = Static200.method3240(local4);
		}
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(Lclient!wg;)V")
	public Class1_Sub2_Sub15(@OriginalArg(0) Class6 arg0) {
		this.aClass6_4 = arg0;
	}
}
