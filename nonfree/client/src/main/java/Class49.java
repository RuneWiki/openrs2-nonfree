import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public final class Class49 {

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "[I")
	public final int[] anIntArray67;

	@OriginalMember(owner = "client!cda", name = "c", descriptor = "[[F")
	public final float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!cda", name = "d", descriptor = "[I")
	public final int[] anIntArray68;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "[I")
	public final int[] anIntArray66;

	@OriginalMember(owner = "client!cda", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class49(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray67 = arg0;
		this.aFloatArrayArray7 = arg3;
		this.anIntArray68 = arg2;
		this.anIntArray66 = arg1;
	}
}
