import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class Class11 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)J")
	public abstract long method4913();

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V")
	public abstract void method4916();

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)I")
	public abstract int method4919(@OriginalArg(1) int arg0);
}
