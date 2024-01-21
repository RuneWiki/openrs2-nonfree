import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class Class58 {

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)[B")
	public abstract byte[] method1648();

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B[B)V")
	public abstract void method1649(@OriginalArg(1) byte[] arg0);
}
