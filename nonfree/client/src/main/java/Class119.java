import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public abstract class Class119 {

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)[B")
	public abstract byte[] method3351();

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B[B)V")
	public abstract void method3353(@OriginalArg(1) byte[] arg0);
}
