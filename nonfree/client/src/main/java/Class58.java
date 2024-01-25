import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public abstract class Class58 {

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)[B")
	public abstract byte[] method1251();

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I[B)V")
	public abstract void method1253(@OriginalArg(1) byte[] arg0);
}
