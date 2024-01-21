import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class Class59 {

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I[B)V")
	public abstract void method1860(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)[B")
	public abstract byte[] method1863();
}
