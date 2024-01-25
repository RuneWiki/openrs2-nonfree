import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public abstract class Class6_Sub1_Sub1 extends Class6_Sub1 {

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "Z")
	public boolean aBoolean480;

	@OriginalMember(owner = "client!pp", name = "B", descriptor = "Z")
	public boolean aBoolean482;

	@OriginalMember(owner = "client!pp", name = "A", descriptor = "Z")
	public volatile boolean aBoolean481 = true;

	@OriginalMember(owner = "client!pp", name = "g", descriptor = "(I)[B")
	public abstract byte[] method5786();

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "(I)I")
	public abstract int method5787();
}
