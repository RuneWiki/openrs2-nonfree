import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public abstract class Class11 {

	@OriginalMember(owner = "client!afa", name = "<init>", descriptor = "()V")
	protected Class11() {
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(FFIFIFIIII[F)V")
	public abstract void method437(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(5) float arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(10) float[] arg6);
}
