import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!wba", name = "n", descriptor = "[I")
	public final int[] anIntArray582;

	@OriginalMember(owner = "client!wba", name = "l", descriptor = "[I")
	public final int[] anIntArray581;

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray582 = arg3;
		this.anIntArray581 = arg2;
	}
}
