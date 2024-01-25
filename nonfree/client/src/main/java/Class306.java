import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class306 {

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "[I")
	public static final int[] anIntArray446 = new int[4096];

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "[I")
	public final int[] anIntArray444;

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "[I")
	public final int[] anIntArray445;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "[[F")
	public final float[][] aFloatArrayArray14;

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "[I")
	public final int[] anIntArray447;

	static {
		for (@Pc(8) int local8 = 0; local8 < 4096; local8++) {
			anIntArray446[local8] = Static137.method2401(local8);
		}
	}

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "([I[I[I[[F)V")
	public Class306(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) float[][] arg3) {
		this.anIntArray444 = arg0;
		this.anIntArray445 = arg1;
		this.aFloatArrayArray14 = arg3;
		this.anIntArray447 = arg2;
	}
}
