import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public final class Class165_Sub1 extends Class165 {

	@OriginalMember(owner = "client!na", name = "k", descriptor = "[I")
	public final int[] anIntArray774;

	@OriginalMember(owner = "client!na", name = "m", descriptor = "[I")
	public final int[] anIntArray775;

	@OriginalMember(owner = "client!na", name = "<init>", descriptor = "(II[I[I)V")
	public Class165_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray774 = arg2;
		this.anIntArray775 = arg3;
	}
}
