import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public abstract class Class6_Sub4_Sub9 extends Class6_Sub4 {

	@OriginalMember(owner = "client!qt", name = "x", descriptor = "Z")
	public boolean aBoolean714;

	@OriginalMember(owner = "client!qt", name = "A", descriptor = "Z")
	public boolean aBoolean716;

	@OriginalMember(owner = "client!qt", name = "z", descriptor = "Z")
	public volatile boolean aBoolean715 = true;

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(I)[B")
	public abstract byte[] method8037();

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "(I)I")
	public abstract int method8038();
}
