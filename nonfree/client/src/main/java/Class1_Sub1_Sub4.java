import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "Z")
	public boolean aBoolean636;

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "Z")
	public boolean aBoolean638;

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "Z")
	public volatile boolean aBoolean639 = true;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)[B")
	public abstract byte[] method7512();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)I")
	public abstract int method7513();
}
