import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public final class Class101 {

	@OriginalMember(owner = "client!ew", name = "d", descriptor = "[I")
	public final int[] anIntArray168;

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "[[F")
	public final float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!ew", name = "e", descriptor = "[I")
	public final int[] anIntArray169;

	@OriginalMember(owner = "client!ew", name = "f", descriptor = "[I")
	public final int[] anIntArray170;

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class101(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray168 = arg2;
		this.aFloatArrayArray6 = arg3;
		this.anIntArray169 = arg1;
		this.anIntArray170 = arg0;
	}
}
