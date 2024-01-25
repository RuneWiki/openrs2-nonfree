import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public abstract class Class238 {

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "[I")
	public static final int[] anIntArray598 = new int[99];

	static {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < 99; local13++) {
			@Pc(18) int local18 = local13 + 1;
			@Pc(31) int local31 = (int) (Math.pow(2.0D, (double) local18 / 7.0D) * 300.0D + (double) local18);
			local11 += local31;
			anIntArray598[local13] = local11 / 4;
		}
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
	protected Class238() {
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(FFIIIFFII[FI)V")
	public abstract void method5286(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(5) float arg2, @OriginalArg(6) float arg3, @OriginalArg(8) int arg4, @OriginalArg(9) float[] arg5, @OriginalArg(10) int arg6);
}
