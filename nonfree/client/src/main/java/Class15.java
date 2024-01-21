import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public abstract class Class15 {

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I[B)V")
	public abstract void method2164(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)[B")
	public abstract byte[] method2165();
}
