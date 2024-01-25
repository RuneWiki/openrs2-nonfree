import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public final class Class178 {

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "[[F")
	public final float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "[I")
	public final int[] anIntArray244;

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "[I")
	public final int[] anIntArray246;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "[I")
	public final int[] anIntArray245;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class178(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.aFloatArrayArray5 = arg3;
		this.anIntArray244 = arg2;
		this.anIntArray246 = arg1;
		this.anIntArray245 = arg0;
	}
}
