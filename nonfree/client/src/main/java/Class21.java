import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class Class21 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
	public abstract void method2629();

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)I")
	public abstract int method2630(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
