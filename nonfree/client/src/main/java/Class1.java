import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class Class1 {

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	public abstract void method2037();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(III)I")
	public abstract int method2040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
