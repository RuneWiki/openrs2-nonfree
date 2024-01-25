import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public final class Class104_Sub1 extends Class104 {

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "[I")
	public final int[] anIntArray180;

	@OriginalMember(owner = "client!hp", name = "j", descriptor = "[I")
	public final int[] anIntArray179;

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(II[I[I)V")
	public Class104_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray180 = arg2;
		this.anIntArray179 = arg3;
	}
}
