import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public abstract class Class43 {

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "()V")
	protected Class43() {
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IFIIFFIIF[FI)V")
	public abstract void method3086(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(8) float arg5, @OriginalArg(9) float[] arg6);
}
