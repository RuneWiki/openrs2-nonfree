import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public abstract class Class4 {

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
	protected Class4() {
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(FIIIF[FIIFIF)V")
	public abstract void method7706(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) float[] arg3, @OriginalArg(6) int arg4, @OriginalArg(8) float arg5, @OriginalArg(10) float arg6);
}
