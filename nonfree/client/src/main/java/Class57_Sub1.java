import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "[I")
	public final int[] anIntArray507;

	@OriginalMember(owner = "client!ql", name = "n", descriptor = "[I")
	public final int[] anIntArray506;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(II[I[I)V")
	public Class57_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray507 = arg3;
		this.anIntArray506 = arg2;
	}
}
