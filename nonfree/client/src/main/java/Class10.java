import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public abstract class Class10 {

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
	protected Class10() {
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(FIFIF[FIIFII)V")
	public abstract void method407(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float[] arg4, @OriginalArg(8) float arg5, @OriginalArg(9) int arg6);
}
