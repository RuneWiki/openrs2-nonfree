import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public final class Class358 {

	@OriginalMember(owner = "client!uu", name = "g", descriptor = "[I")
	public final int[] anIntArray758;

	@OriginalMember(owner = "client!uu", name = "j", descriptor = "[[F")
	public final float[][] aFloatArrayArray18;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "[I")
	public final int[] anIntArray756;

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "[I")
	public final int[] anIntArray757;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class358(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray758 = arg2;
		this.aFloatArrayArray18 = arg3;
		this.anIntArray756 = arg0;
		this.anIntArray757 = arg1;
	}
}
