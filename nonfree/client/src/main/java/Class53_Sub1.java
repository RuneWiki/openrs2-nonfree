import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public final class Class53_Sub1 extends Class53 {

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "[I")
	public final int[] anIntArray57;

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "[I")
	public final int[] anIntArray58;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(II[I[I)V")
	public Class53_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray57 = arg3;
		this.anIntArray58 = arg2;
	}
}
