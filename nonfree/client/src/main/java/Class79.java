import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public abstract class Class79 {

	@OriginalMember(owner = "client!wba", name = "<init>", descriptor = "()V")
	protected Class79() {
	}

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IFIBIFIFFI[F)V")
	public abstract void method2175(@OriginalArg(1) float arg0, @OriginalArg(4) int arg1, @OriginalArg(5) float arg2, @OriginalArg(7) float arg3, @OriginalArg(8) float arg4, @OriginalArg(9) int arg5, @OriginalArg(10) float[] arg6);
}
