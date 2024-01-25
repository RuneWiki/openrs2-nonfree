import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public abstract class Class53 {

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V")
	protected Class53() {
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIFIFIFF[FII)V")
	public abstract void method5030(@OriginalArg(2) float arg0, @OriginalArg(3) int arg1, @OriginalArg(4) float arg2, @OriginalArg(5) int arg3, @OriginalArg(6) float arg4, @OriginalArg(7) float arg5, @OriginalArg(8) float[] arg6);
}
