import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public final class Class330 {

	@OriginalMember(owner = "client!taa", name = "b", descriptor = "[I")
	public final int[] anIntArray530;

	@OriginalMember(owner = "client!taa", name = "g", descriptor = "[I")
	public final int[] anIntArray532;

	@OriginalMember(owner = "client!taa", name = "h", descriptor = "[[F")
	public final float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!taa", name = "e", descriptor = "[I")
	public final int[] anIntArray531;

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class330(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray530 = arg0;
		this.anIntArray532 = arg1;
		this.aFloatArrayArray15 = arg3;
		this.anIntArray531 = arg2;
	}
}
