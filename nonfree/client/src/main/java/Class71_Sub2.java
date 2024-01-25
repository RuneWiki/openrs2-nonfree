import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class71_Sub2 extends Class71 {

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "[I")
	public final int[] anIntArray445;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "[I")
	public final int[] anIntArray444;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(II[I[I)V")
	public Class71_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray445 = arg2;
		this.anIntArray444 = arg3;
	}
}
