import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class Class29 {

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V")
	public abstract void method1929();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
	public abstract void method1930(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public abstract void method1933();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)V")
	public abstract void method1934(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z[BII)V")
	public abstract void method1935(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
	public abstract void method1936();
}
