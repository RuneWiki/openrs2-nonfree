import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public final class Class1_Sub1 extends Class1 {

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "[I")
	public final int[] anIntArray119;

	@OriginalMember(owner = "client!cr", name = "f", descriptor = "[I")
	public final int[] anIntArray118;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray119 = arg3;
		this.anIntArray118 = arg2;
	}
}
