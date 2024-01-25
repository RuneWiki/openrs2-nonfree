import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public final class Class76 {

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "[I")
	public final int[] anIntArray122;

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "[I")
	public final int[] anIntArray125;

	@OriginalMember(owner = "client!dj", name = "j", descriptor = "[I")
	public final int[] anIntArray124;

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "[[F")
	public final float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class76(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray122 = arg1;
		this.anIntArray125 = arg2;
		this.anIntArray124 = arg0;
		this.aFloatArrayArray5 = arg3;
	}
}
