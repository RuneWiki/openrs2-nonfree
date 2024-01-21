import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public abstract class Class55 {

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
	public abstract void method2208();

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
	public abstract void method2209();

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I")
	public abstract int method2211(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);
}
