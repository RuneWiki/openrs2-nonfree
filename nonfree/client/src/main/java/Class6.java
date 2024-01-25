import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class Class6 {

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
	protected Class6() {
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(FIFIF[FIIFII)V")
	public abstract void method1787(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(4) float arg2, @OriginalArg(5) float[] arg3, @OriginalArg(8) float arg4, @OriginalArg(9) int arg5, @OriginalArg(10) int arg6);
}
