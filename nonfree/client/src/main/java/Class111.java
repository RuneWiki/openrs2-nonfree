import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class Class111 {

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
	protected Class111() {
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IFZFIFFII[FI)V")
	public abstract void method2431(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(5) float arg3, @OriginalArg(6) float arg4, @OriginalArg(8) int arg5, @OriginalArg(9) float[] arg6);
}
