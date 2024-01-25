import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public abstract class Class121 {

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)[B")
	public abstract byte[] method3013();

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I[B)V")
	public abstract void method3014(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(IBI)[B")
	public abstract byte[] method3015(@OriginalArg(2) int arg0);
}
