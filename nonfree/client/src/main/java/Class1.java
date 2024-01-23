import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public abstract class Class1 {

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)[B")
	public abstract byte[] method2632();

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I[B)V")
	public abstract void method2635(@OriginalArg(1) byte[] arg0);
}
