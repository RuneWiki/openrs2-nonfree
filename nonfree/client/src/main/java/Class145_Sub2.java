import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public final class Class145_Sub2 extends Class145 {

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "[I")
	public final int[] anIntArray553;

	@OriginalMember(owner = "client!wm", name = "h", descriptor = "[I")
	public final int[] anIntArray554;

	@OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(II[I[I)V")
	public Class145_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray553 = arg3;
		this.anIntArray554 = arg2;
	}
}
