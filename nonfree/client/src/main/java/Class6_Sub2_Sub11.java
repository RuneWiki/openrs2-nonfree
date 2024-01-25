import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public abstract class Class6_Sub2_Sub11 extends Class6_Sub2 {

	@OriginalMember(owner = "client!mc", name = "C", descriptor = "Z")
	public boolean aBoolean489;

	@OriginalMember(owner = "client!mc", name = "D", descriptor = "Z")
	public boolean aBoolean490;

	@OriginalMember(owner = "client!mc", name = "E", descriptor = "Z")
	public volatile boolean aBoolean491 = true;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)[B")
	public abstract byte[] method6374();

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)I")
	public abstract int method6376();
}
