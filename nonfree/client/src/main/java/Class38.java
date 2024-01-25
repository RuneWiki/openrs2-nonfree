import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public final class Class38 {

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "[[F")
	public final float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "[I")
	public final int[] anIntArray61;

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "[I")
	public final int[] anIntArray62;

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "[I")
	public final int[] anIntArray60;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class38(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.aFloatArrayArray1 = arg3;
		this.anIntArray61 = arg2;
		this.anIntArray62 = arg0;
		this.anIntArray60 = arg1;
	}
}
