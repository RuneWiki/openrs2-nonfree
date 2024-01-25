import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public final class Class24_Sub1 extends Class24 {

	@OriginalMember(owner = "client!cr", name = "s", descriptor = "[I")
	public final int[] anIntArray106;

	@OriginalMember(owner = "client!cr", name = "o", descriptor = "[I")
	public final int[] anIntArray105;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(II[I[I)V")
	public Class24_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray106 = arg2;
		this.anIntArray105 = arg3;
	}
}
