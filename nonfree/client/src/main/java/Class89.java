import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public abstract class Class89 {

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
	protected Class89() {
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(FIFF[FIIIFII)V")
	public abstract void method3434(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float[] arg4, @OriginalArg(6) int arg5, @OriginalArg(8) float arg6);
}
