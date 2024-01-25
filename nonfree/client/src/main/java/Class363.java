import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public final class Class363 {

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "[[F")
	public final float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "[I")
	public final int[] anIntArray870;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "[I")
	public final int[] anIntArray873;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "[I")
	public final int[] anIntArray872;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class363(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.aFloatArrayArray13 = arg3;
		this.anIntArray870 = arg2;
		this.anIntArray873 = arg1;
		this.anIntArray872 = arg0;
	}
}
