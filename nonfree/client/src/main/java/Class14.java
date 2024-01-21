import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class Class14 {

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public abstract void method1809();

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
	public abstract void method1810();

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)I")
	public abstract int method1811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
