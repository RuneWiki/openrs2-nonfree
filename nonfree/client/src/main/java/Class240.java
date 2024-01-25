import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public final class Class240 {

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "[I")
	public final int[] anIntArray489;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "[I")
	public final int[] anIntArray490;

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "[I")
	public final int[] anIntArray491;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "[[F")
	public final float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class240(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray489 = arg1;
		this.anIntArray490 = arg0;
		this.anIntArray491 = arg2;
		this.aFloatArrayArray10 = arg3;
	}
}
