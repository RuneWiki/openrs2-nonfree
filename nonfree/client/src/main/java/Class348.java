import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public final class Class348 {

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "[[F")
	public final float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!uaa", name = "f", descriptor = "[I")
	public final int[] anIntArray606;

	@OriginalMember(owner = "client!uaa", name = "e", descriptor = "[I")
	public final int[] anIntArray605;

	@OriginalMember(owner = "client!uaa", name = "h", descriptor = "[I")
	public final int[] anIntArray607;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class348(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.aFloatArrayArray15 = arg3;
		this.anIntArray606 = arg2;
		this.anIntArray605 = arg1;
		this.anIntArray607 = arg0;
	}
}
