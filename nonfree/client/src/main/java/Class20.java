import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public abstract class Class20 {

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	public abstract void method1108();

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I")
	public abstract int method1111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
