import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class Class130 {

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	protected Class130() {
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "([FFIIFIIIFIF)V")
	public abstract void method4620(@OriginalArg(0) float[] arg0, @OriginalArg(1) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(8) float arg4, @OriginalArg(9) int arg5, @OriginalArg(10) float arg6);
}
