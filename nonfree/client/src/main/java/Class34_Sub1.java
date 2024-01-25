import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!c", name = "o", descriptor = "[I")
	public final int[] anIntArray114;

	@OriginalMember(owner = "client!c", name = "k", descriptor = "[I")
	public final int[] anIntArray113;

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "(II[I[I)V")
	public Class34_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray114 = arg2;
		this.anIntArray113 = arg3;
	}
}
