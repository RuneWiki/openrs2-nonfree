import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public final class Class152 {

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "[I")
	public final int[] anIntArray265;

	@OriginalMember(owner = "client!iha", name = "h", descriptor = "[I")
	public final int[] anIntArray268;

	@OriginalMember(owner = "client!iha", name = "e", descriptor = "[I")
	public final int[] anIntArray266;

	@OriginalMember(owner = "client!iha", name = "i", descriptor = "[[F")
	public final float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class152(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray265 = arg2;
		this.anIntArray268 = arg0;
		this.anIntArray266 = arg1;
		this.aFloatArrayArray12 = arg3;
	}
}
