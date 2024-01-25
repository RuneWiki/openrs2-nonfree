import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class Class256 {

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "()V")
	protected Class256() {
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(FIII[FIFFBFI)V")
	public abstract void method6433(@OriginalArg(0) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) float[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) float arg4, @OriginalArg(7) float arg5, @OriginalArg(9) float arg6);
}
