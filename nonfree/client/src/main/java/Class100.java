import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public abstract class Class100 {

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "()V")
	protected Class100() {
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(FFIIFIIIFI[F)V")
	public abstract void method2694(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(7) int arg4, @OriginalArg(8) float arg5, @OriginalArg(10) float[] arg6);
}
