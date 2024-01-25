import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public final class Class168 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "[I")
	public final int[] anIntArray248;

	@OriginalMember(owner = "client!je", name = "b", descriptor = "[[F")
	public final float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "[I")
	public final int[] anIntArray250;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "[I")
	public final int[] anIntArray249;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class168(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray248 = arg2;
		this.aFloatArrayArray10 = arg3;
		this.anIntArray250 = arg0;
		this.anIntArray249 = arg1;
	}
}
