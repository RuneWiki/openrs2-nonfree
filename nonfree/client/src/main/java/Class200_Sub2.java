import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public final class Class200_Sub2 extends Class200 {

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "[I")
	public final int[] anIntArray464;

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "[I")
	public final int[] anIntArray465;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(II[I[I)V")
	public Class200_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray464 = arg2;
		this.anIntArray465 = arg3;
	}
}
