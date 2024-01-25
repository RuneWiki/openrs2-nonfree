import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public final class Class67_Sub2 extends Class67 {

	@OriginalMember(owner = "client!ega", name = "j", descriptor = "[I")
	public final int[] anIntArray127;

	@OriginalMember(owner = "client!ega", name = "h", descriptor = "[I")
	public final int[] anIntArray126;

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(II[I[I)V")
	public Class67_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray127 = arg3;
		this.anIntArray126 = arg2;
	}
}
