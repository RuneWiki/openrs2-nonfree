import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public abstract class Class12 {

	static {
		new Class158("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
	protected Class12() {
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IFIIIBF[FFFI)V")
	public abstract void method2663(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float[] arg4, @OriginalArg(8) float arg5, @OriginalArg(9) float arg6);
}
