import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class Class2_Sub2_Sub12 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ud", name = "y", descriptor = "Z")
	public boolean aBoolean524;

	@OriginalMember(owner = "client!ud", name = "z", descriptor = "Z")
	public boolean aBoolean525;

	@OriginalMember(owner = "client!ud", name = "A", descriptor = "Z")
	public volatile boolean aBoolean526 = true;

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(B)[B")
	public abstract byte[] method4775();

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "(B)I")
	public abstract int method4777();
}
