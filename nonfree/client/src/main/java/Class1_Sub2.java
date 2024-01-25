import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!gd", name = "m", descriptor = "[I")
	public final int[] anIntArray218;

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "[I")
	public final int[] anIntArray219;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray218 = arg2;
		this.anIntArray219 = arg3;
	}
}
