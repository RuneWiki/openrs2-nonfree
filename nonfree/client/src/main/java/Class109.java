import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public abstract class Class109 {

	@OriginalMember(owner = "client!fq", name = "<init>", descriptor = "()V")
	protected Class109() {
	}

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(FFIB[FIIFFII)V")
	public abstract void method7298(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(4) float[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) float arg5, @OriginalArg(8) float arg6);
}
