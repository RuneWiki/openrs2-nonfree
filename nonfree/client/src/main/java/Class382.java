import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public final class Class382 {

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "[I")
	public final int[] anIntArray629;

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "[[F")
	public final float[][] aFloatArrayArray18;

	@OriginalMember(owner = "client!wv", name = "f", descriptor = "[I")
	public final int[] anIntArray630;

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "[I")
	public final int[] anIntArray631;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class382(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray629 = arg2;
		this.aFloatArrayArray18 = arg3;
		this.anIntArray630 = arg1;
		this.anIntArray631 = arg0;
	}
}
