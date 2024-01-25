import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public final class Class114 {

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "[I")
	public final int[] anIntArray224;

	@OriginalMember(owner = "client!gea", name = "e", descriptor = "[I")
	public final int[] anIntArray226;

	@OriginalMember(owner = "client!gea", name = "f", descriptor = "[I")
	public final int[] anIntArray227;

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "[[F")
	public final float[][] aFloatArrayArray10;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class114(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray224 = arg0;
		this.anIntArray226 = arg2;
		this.anIntArray227 = arg1;
		this.aFloatArrayArray10 = arg3;
	}
}
