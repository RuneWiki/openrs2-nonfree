import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public abstract class Class10 {

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "()V")
	protected Class10() {
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(III[FFIFFZIF)V")
	public abstract void method211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) float arg3, @OriginalArg(6) float arg4, @OriginalArg(7) float arg5, @OriginalArg(10) float arg6);
}
