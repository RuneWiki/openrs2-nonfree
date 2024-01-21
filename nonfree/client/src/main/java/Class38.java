import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class Class38 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public abstract void method1577();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI[BI)V")
	public abstract void method1578(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2);

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
	public abstract void method1579();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
	public abstract void method1581();

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)V")
	public abstract void method1584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
	public abstract void method1586(@OriginalArg(0) int arg0);
}
