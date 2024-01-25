import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public final class Class369 {

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "[[F")
	public final float[][] aFloatArrayArray20;

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "[I")
	public final int[] anIntArray713;

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "[I")
	public final int[] anIntArray712;

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "[I")
	public final int[] anIntArray711;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class369(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.aFloatArrayArray20 = arg3;
		this.anIntArray713 = arg1;
		this.anIntArray712 = arg2;
		this.anIntArray711 = arg0;
	}
}
