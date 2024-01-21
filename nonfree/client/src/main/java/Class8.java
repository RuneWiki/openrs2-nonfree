import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class Class8 {

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
	public abstract void method2240();

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IBI)I")
	public abstract int method2242(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
	public abstract void method2245();
}
