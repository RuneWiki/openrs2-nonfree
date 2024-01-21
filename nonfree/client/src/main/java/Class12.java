import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class Class12 {

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)[B")
	public abstract byte[] method947();

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[B)V")
	public abstract void method949(@OriginalArg(1) byte[] arg0);
}
