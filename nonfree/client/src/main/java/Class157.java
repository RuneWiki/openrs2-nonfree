import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public abstract class Class157 {

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "()V")
	protected Class157() {
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I[FFIFIFIIFI)V")
	public abstract void method3469(@OriginalArg(1) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(9) float arg6);
}
