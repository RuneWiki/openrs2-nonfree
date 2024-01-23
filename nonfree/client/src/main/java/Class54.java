import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class Class54 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)[B")
	public abstract byte[] method2718();

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(B[B)V")
	public abstract void method2719(@OriginalArg(1) byte[] arg0);
}
