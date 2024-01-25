import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public abstract class Class47 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)[B")
	public abstract byte[] method851();

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)[B")
	public abstract byte[] method852(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([BI)V")
	public abstract void method853(@OriginalArg(0) byte[] arg0);
}
