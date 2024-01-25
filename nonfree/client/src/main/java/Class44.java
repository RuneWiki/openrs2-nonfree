import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public final class Class44 {

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "[I")
	public final int[] anIntArray65;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "[I")
	public final int[] anIntArray64;

	@OriginalMember(owner = "client!bw", name = "h", descriptor = "[I")
	public final int[] anIntArray66;

	@OriginalMember(owner = "client!bw", name = "f", descriptor = "[[F")
	public final float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class44(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray65 = arg2;
		this.anIntArray64 = arg0;
		this.anIntArray66 = arg1;
		this.aFloatArrayArray5 = arg3;
	}
}
