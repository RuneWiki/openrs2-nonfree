import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public final class Class384 {

	@OriginalMember(owner = "client!va", name = "d", descriptor = "[I")
	public final int[] anIntArray755;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "[[F")
	public final float[][] aFloatArrayArray15;

	@OriginalMember(owner = "client!va", name = "e", descriptor = "[I")
	public final int[] anIntArray756;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "[I")
	public final int[] anIntArray757;

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class384(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray755 = arg0;
		this.aFloatArrayArray15 = arg3;
		this.anIntArray756 = arg1;
		this.anIntArray757 = arg2;
	}
}
