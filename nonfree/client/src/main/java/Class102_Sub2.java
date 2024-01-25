import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class102_Sub2 extends Class102 {

	@OriginalMember(owner = "client!qj", name = "h", descriptor = "[I")
	public final int[] anIntArray499;

	@OriginalMember(owner = "client!qj", name = "g", descriptor = "[I")
	public final int[] anIntArray498;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(II[I[I)V")
	public Class102_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray499 = arg2;
		this.anIntArray498 = arg3;
	}
}
