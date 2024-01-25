import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public final class Class23_Sub2 extends Class23 {

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "[I")
	public final int[] anIntArray430;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "[I")
	public final int[] anIntArray429;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(II[I[I)V")
	public Class23_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray430 = arg3;
		this.anIntArray429 = arg2;
	}
}
