import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class Class11 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
	public abstract void method1103();

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I[BZI)V")
	public abstract void method1104(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(BI)V")
	public abstract void method1105(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
	public abstract void method1107(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
	public abstract void method1111();

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
	public abstract void method1114();
}
