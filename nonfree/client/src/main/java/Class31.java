import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class Class31 {

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[B)V")
	public abstract void method1032(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)[B")
	public abstract byte[] method1033();
}
