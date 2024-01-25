import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public abstract class Class61 {

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V")
	protected Class61() {
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "([FIFBIFIIFFI)V")
	public abstract void method6910(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(5) float arg3, @OriginalArg(7) int arg4, @OriginalArg(8) float arg5, @OriginalArg(9) float arg6);
}
