import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public abstract class Class206 {

	@OriginalMember(owner = "client!oia", name = "<init>", descriptor = "()V")
	protected Class206() {
	}

	@OriginalMember(owner = "client!oia", name = "a", descriptor = "(FIF[FIFIIFII)V")
	public abstract void method5572(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(5) float arg3, @OriginalArg(7) int arg4, @OriginalArg(8) float arg5, @OriginalArg(10) int arg6);
}
