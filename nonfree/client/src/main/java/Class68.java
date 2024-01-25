import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public abstract class Class68 {

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(BII)[B")
	public abstract byte[] method2196(@OriginalArg(2) int arg0);

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)[B")
	public abstract byte[] method2197();

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(I[B)V")
	public abstract void method2199(@OriginalArg(1) byte[] arg0);
}
