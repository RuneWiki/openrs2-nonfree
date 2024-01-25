import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public abstract class Class134 {

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V")
	protected Class134() {
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(FIIFFII[FIFI)V")
	public abstract void method5899(@OriginalArg(0) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) float arg2, @OriginalArg(7) float[] arg3, @OriginalArg(8) int arg4, @OriginalArg(9) float arg5, @OriginalArg(10) int arg6);
}
