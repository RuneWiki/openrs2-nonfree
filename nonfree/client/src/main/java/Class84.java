import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public abstract class Class84 {

	@OriginalMember(owner = "client!kda", name = "<init>", descriptor = "()V")
	protected Class84() {
	}

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIIIFFIFIF[F)V")
	public abstract void method2516(@OriginalArg(0) int arg0, @OriginalArg(4) float arg1, @OriginalArg(5) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) int arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float[] arg6);
}
