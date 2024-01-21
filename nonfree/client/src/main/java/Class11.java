import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public abstract class Class11 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B[B)V")
	public abstract void method1826(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)[B")
	public abstract byte[] method1827();
}
