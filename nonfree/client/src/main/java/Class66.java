import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public abstract class Class66 {

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
	protected Class66() {
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IFIIIIF[FFIF)V")
	public abstract void method1830(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float[] arg4, @OriginalArg(8) float arg5, @OriginalArg(10) float arg6);
}
