import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public abstract class Class58 {

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V")
	protected Class58() {
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IFFIIFI[FFII)V")
	public abstract void method1943(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(5) float arg3, @OriginalArg(6) int arg4, @OriginalArg(7) float[] arg5, @OriginalArg(8) float arg6);
}
