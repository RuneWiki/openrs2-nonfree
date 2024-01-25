import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class308 {

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "[[F")
	public final float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!rj", name = "j", descriptor = "[I")
	public final int[] anIntArray470;

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "[I")
	public final int[] anIntArray469;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "[I")
	public final int[] anIntArray468;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class308(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.aFloatArrayArray14 = arg3;
		this.anIntArray470 = arg2;
		this.anIntArray469 = arg1;
		this.anIntArray468 = arg0;
	}
}
