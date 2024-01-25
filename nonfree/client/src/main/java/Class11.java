import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public abstract class Class11 {

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	protected Class11() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([FIIFIIFFFII)V")
	public abstract void method168(@OriginalArg(0) float[] arg0, @OriginalArg(3) float arg1, @OriginalArg(5) int arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(8) float arg5, @OriginalArg(10) int arg6);
}
