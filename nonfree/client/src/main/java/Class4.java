import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public abstract class Class4 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
	public abstract void method1691();

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)I")
	public abstract int method1692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V")
	public abstract void method1695();
}
