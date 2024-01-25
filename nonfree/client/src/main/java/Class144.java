import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public final class Class144 {

	@OriginalMember(owner = "client!hh", name = "i", descriptor = "[I")
	public final int[] anIntArray229;

	@OriginalMember(owner = "client!hh", name = "h", descriptor = "[[F")
	public final float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "[I")
	public final int[] anIntArray227;

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "[I")
	public final int[] anIntArray228;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class144(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray229 = arg0;
		this.aFloatArrayArray7 = arg3;
		this.anIntArray227 = arg1;
		this.anIntArray228 = arg2;
	}
}
