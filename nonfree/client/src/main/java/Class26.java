import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class Class26 {

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
	protected Class26() {
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(FFIIF[FBIIIF)V")
	public abstract void method3280(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float[] arg5, @OriginalArg(10) float arg6);
}
