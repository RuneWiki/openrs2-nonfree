import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public final class Class43 {

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "[I")
	public final int[] anIntArray96;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "[I")
	public final int[] anIntArray95;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "[I")
	public final int[] anIntArray94;

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "[[F")
	public final float[][] aFloatArrayArray8;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class43(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray96 = arg2;
		this.anIntArray95 = arg0;
		this.anIntArray94 = arg1;
		this.aFloatArrayArray8 = arg3;
	}
}
