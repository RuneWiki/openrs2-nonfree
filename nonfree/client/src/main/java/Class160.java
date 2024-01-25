import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class Class160 {

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	protected Class160() {
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(FIF[FIFIIIIF)V")
	public abstract void method3658(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float[] arg2, @OriginalArg(5) float arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(10) float arg6);
}
