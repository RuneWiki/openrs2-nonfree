import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public abstract class Class13 {

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[BIZ)V")
	public abstract void method1500(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2);

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	public abstract void method1501();

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIB)V")
	public abstract void method1503(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)V")
	public abstract void method1504(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
	public abstract void method1505();

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
	public abstract void method1506();
}
