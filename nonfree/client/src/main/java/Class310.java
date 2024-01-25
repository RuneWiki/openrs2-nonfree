import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class Class310 {

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
	protected Class310() {
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IFI[FIFIFIIF)V")
	public abstract void method6881(@OriginalArg(1) float arg0, @OriginalArg(3) float[] arg1, @OriginalArg(5) float arg2, @OriginalArg(6) int arg3, @OriginalArg(7) float arg4, @OriginalArg(8) int arg5, @OriginalArg(10) float arg6);
}
