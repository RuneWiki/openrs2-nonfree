import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public abstract class Class30 {

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)V")
	public abstract void method1873(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([BIBZ)V")
	public abstract void method1875(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBI)V")
	public abstract void method1878(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
	public abstract void method1881();

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public abstract void method1882();

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public abstract void method1883();
}
