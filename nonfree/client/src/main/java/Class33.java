import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public abstract class Class33 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
	public abstract void method1516();

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	public abstract void method1517();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)I")
	public abstract int method1520(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
