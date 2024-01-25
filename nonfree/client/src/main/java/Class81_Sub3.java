import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public final class Class81_Sub3 extends Class81 {

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "[I")
	public final int[] anIntArray529;

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "[I")
	public final int[] anIntArray530;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(II[I[I)V")
	public Class81_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray529 = arg2;
		this.anIntArray530 = arg3;
	}
}
