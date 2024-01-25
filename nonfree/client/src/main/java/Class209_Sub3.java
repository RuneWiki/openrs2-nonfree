import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public final class Class209_Sub3 extends Class209 {

	@OriginalMember(owner = "client!wj", name = "f", descriptor = "[I")
	public final int[] anIntArray756;

	@OriginalMember(owner = "client!wj", name = "e", descriptor = "[I")
	public final int[] anIntArray755;

	@OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(II[I[I)V")
	public Class209_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray756 = arg3;
		this.anIntArray755 = arg2;
	}
}
