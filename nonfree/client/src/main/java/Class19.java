import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public abstract class Class19 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
	public abstract void method1734();

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)I")
	public abstract int method1736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
	public abstract void method1737();
}
