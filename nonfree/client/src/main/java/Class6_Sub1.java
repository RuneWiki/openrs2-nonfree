import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!aca", name = "g", descriptor = "[I")
	public final int[] anIntArray7;

	@OriginalMember(owner = "client!aca", name = "j", descriptor = "[I")
	public final int[] anIntArray8;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(II[I[I)V")
	public Class6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray7 = arg2;
		this.anIntArray8 = arg3;
	}
}
