import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public abstract class Class1_Sub4_Sub2 extends Class1_Sub4 {

	@OriginalMember(owner = "client!vl", name = "C", descriptor = "Z")
	public boolean aBoolean366;

	@OriginalMember(owner = "client!vl", name = "H", descriptor = "Z")
	public boolean aBoolean368;

	@OriginalMember(owner = "client!vl", name = "D", descriptor = "Z")
	public volatile boolean aBoolean367 = true;

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)[B")
	public abstract byte[] method4468();

	@OriginalMember(owner = "client!vl", name = "h", descriptor = "(I)I")
	public abstract int method4472();
}
