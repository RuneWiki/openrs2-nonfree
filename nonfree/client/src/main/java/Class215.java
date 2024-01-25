import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public final class Class215 {

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "[I")
	public final int[] anIntArray376;

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "[[F")
	public final float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "[I")
	public final int[] anIntArray377;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "[I")
	public final int[] anIntArray375;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class215(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray376 = arg2;
		this.aFloatArrayArray7 = arg3;
		this.anIntArray377 = arg1;
		this.anIntArray375 = arg0;
	}
}
