import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public abstract class Class10 {

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
	protected Class10() {
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(FIIFIFIIIF[F)V")
	public abstract void method128(@OriginalArg(0) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) int arg2, @OriginalArg(5) float arg3, @OriginalArg(7) int arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float[] arg6);
}
