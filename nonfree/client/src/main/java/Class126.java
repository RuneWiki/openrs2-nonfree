import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public abstract class Class126 {

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "()V")
	protected Class126() {
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(FIFIIFIIF[FI)V")
	public abstract void method7898(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) float arg4, @OriginalArg(8) float arg5, @OriginalArg(9) float[] arg6);
}
