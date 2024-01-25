import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public abstract class Class92 {

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V")
	protected Class92() {
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IFIIIFB[FFIF)V")
	public abstract void method1755(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(5) float arg2, @OriginalArg(7) float[] arg3, @OriginalArg(8) float arg4, @OriginalArg(9) int arg5, @OriginalArg(10) float arg6);
}
