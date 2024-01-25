import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public final class Class264 {

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "[I")
	public final int[] anIntArray417;

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "[I")
	public final int[] anIntArray415;

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "[I")
	public final int[] anIntArray416;

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "[[F")
	public final float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class264(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray417 = arg1;
		this.anIntArray415 = arg0;
		this.anIntArray416 = arg2;
		this.aFloatArrayArray11 = arg3;
	}
}
