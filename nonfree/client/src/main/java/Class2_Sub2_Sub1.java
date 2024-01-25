import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public abstract class Class2_Sub2_Sub1 extends Class2_Sub2 {

	@OriginalMember(owner = "client!in", name = "y", descriptor = "Z")
	public boolean aBoolean281;

	@OriginalMember(owner = "client!in", name = "z", descriptor = "Z")
	public boolean aBoolean282;

	@OriginalMember(owner = "client!in", name = "B", descriptor = "Z")
	public volatile boolean aBoolean283 = true;

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(B)I")
	public abstract int method3399();

	@OriginalMember(owner = "client!in", name = "g", descriptor = "(I)[B")
	public abstract byte[] method3401();
}
