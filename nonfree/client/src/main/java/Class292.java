import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public final class Class292 {

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "[I")
	public final int[] anIntArray453;

	@OriginalMember(owner = "client!qn", name = "h", descriptor = "[[F")
	public final float[][] aFloatArrayArray9;

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "[I")
	public final int[] anIntArray454;

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "[I")
	public final int[] anIntArray452;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class292(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray453 = arg0;
		this.aFloatArrayArray9 = arg3;
		this.anIntArray454 = arg1;
		this.anIntArray452 = arg2;
	}
}
