import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public final class Class18 {

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "[I")
	public final int[] anIntArray14;

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "[[F")
	public final float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "[I")
	public final int[] anIntArray16;

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "[I")
	public final int[] anIntArray13;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class18(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray14 = arg1;
		this.aFloatArrayArray1 = arg3;
		this.anIntArray16 = arg2;
		this.anIntArray13 = arg0;
	}
}
