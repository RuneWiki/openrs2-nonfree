import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public abstract class Class6_Sub2_Sub4 extends Class6_Sub2 {

	@OriginalMember(owner = "client!ci", name = "u", descriptor = "Z")
	public boolean aBoolean398;

	@OriginalMember(owner = "client!ci", name = "w", descriptor = "Z")
	public boolean aBoolean399;

	@OriginalMember(owner = "client!ci", name = "x", descriptor = "Z")
	public volatile boolean aBoolean400 = true;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)[B")
	public abstract byte[] method4908();

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)I")
	public abstract int method4909();
}
