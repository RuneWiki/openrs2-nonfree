import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class Class103 {

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(I)J")
	public abstract long method4084();

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)I")
	public abstract int method4086(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
	public abstract void method4087();
}
