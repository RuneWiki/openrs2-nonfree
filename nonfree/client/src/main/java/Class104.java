import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public abstract class Class104 {

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "()V")
	protected Class104() {
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "([FIFIIIIZFFF)V")
	public abstract void method3136(@OriginalArg(0) float[] arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6);
}
