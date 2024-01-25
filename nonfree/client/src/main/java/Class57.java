import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public abstract class Class57 {

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I[B)V")
	public abstract void method1855(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(BII)[B")
	public abstract byte[] method1857(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)[B")
	public abstract byte[] method1860();
}
