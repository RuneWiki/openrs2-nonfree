import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public abstract class Class45 {

	static {
		new Class198("", 73);
	}

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	protected Class45() {
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIFBIIFI[FFF)V")
	public abstract void method1836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(6) float arg3, @OriginalArg(8) float[] arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6);
}
