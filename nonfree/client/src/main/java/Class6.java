import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public abstract class Class6 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
	public abstract void method1719();

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(III)I")
	public abstract int method1721(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
