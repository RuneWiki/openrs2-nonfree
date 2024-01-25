import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public final class Class256 {

	@OriginalMember(owner = "client!nn", name = "j", descriptor = "[I")
	public final int[] anIntArray388;

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "[I")
	public final int[] anIntArray386;

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "[I")
	public final int[] anIntArray387;

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "[[F")
	public final float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class256(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray388 = arg0;
		this.anIntArray386 = arg2;
		this.anIntArray387 = arg1;
		this.aFloatArrayArray12 = arg3;
	}
}
