import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public final class Class92 {

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "[I")
	public final int[] anIntArray164;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "[[F")
	public final float[][] aFloatArrayArray1;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "[I")
	public final int[] anIntArray165;

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "[I")
	public final int[] anIntArray167;

	@OriginalMember(owner = "client!eh", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class92(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray164 = arg1;
		this.aFloatArrayArray1 = arg3;
		this.anIntArray165 = arg0;
		this.anIntArray167 = arg2;
	}
}
