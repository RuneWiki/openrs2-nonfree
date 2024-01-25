import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public final class Class15_Sub2 extends Class15 {

	@OriginalMember(owner = "client!tp", name = "m", descriptor = "[I")
	public final int[] anIntArray580;

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "[I")
	public final int[] anIntArray579;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(II[I[I)V")
	public Class15_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray580 = arg3;
		this.anIntArray579 = arg2;
	}
}
