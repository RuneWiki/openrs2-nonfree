import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public final class Class254 {

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "[[F")
	public final float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!nha", name = "m", descriptor = "[I")
	public final int[] anIntArray402;

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "[I")
	public final int[] anIntArray401;

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "[I")
	public final int[] anIntArray400;

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class254(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.aFloatArrayArray12 = arg3;
		this.anIntArray402 = arg2;
		this.anIntArray401 = arg0;
		this.anIntArray400 = arg1;
	}
}
