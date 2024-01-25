import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public final class Class92_Sub2 extends Class92 {

	@OriginalMember(owner = "client!sm", name = "v", descriptor = "[I")
	public final int[] anIntArray440;

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "[I")
	public final int[] anIntArray439;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(II[I[I)V")
	public Class92_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray440 = arg2;
		this.anIntArray439 = arg3;
	}
}
