import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class Class11 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
	public abstract void method1859(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public abstract void method1861();

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BZI[B)V")
	public abstract void method1862(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2);

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V")
	public abstract void method1866();

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)V")
	public abstract void method1867(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(B)V")
	public abstract void method1868();
}
