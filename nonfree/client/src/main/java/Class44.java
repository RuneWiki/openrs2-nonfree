import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public abstract class Class44 {

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)[B")
	public abstract byte[] method1094();

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[B)V")
	public abstract void method1098(@OriginalArg(1) byte[] arg0);
}
