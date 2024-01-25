import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public abstract class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dn", name = "u", descriptor = "Z")
	public boolean aBoolean152;

	@OriginalMember(owner = "client!dn", name = "D", descriptor = "Z")
	public boolean aBoolean155;

	@OriginalMember(owner = "client!dn", name = "y", descriptor = "Z")
	public volatile boolean aBoolean154 = true;

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "(B)I")
	public abstract int method1688();

	@OriginalMember(owner = "client!dn", name = "e", descriptor = "(I)[B")
	public abstract byte[] method1692();
}
