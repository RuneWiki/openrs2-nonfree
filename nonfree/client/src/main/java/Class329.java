import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class Class329 {

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[B)V")
	public abstract void method7728(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIB)[B")
	public abstract byte[] method7729(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)[B")
	public abstract byte[] method7730();
}
