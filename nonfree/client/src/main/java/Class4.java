import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class Class4 {

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public abstract void method1908();

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
	public abstract void method1910();

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IZI)I")
	public abstract int method1913(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
