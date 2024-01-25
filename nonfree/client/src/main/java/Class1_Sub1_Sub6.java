import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public abstract class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dn", name = "B", descriptor = "Z")
	public boolean aBoolean511;

	@OriginalMember(owner = "client!dn", name = "D", descriptor = "Z")
	public boolean aBoolean513;

	@OriginalMember(owner = "client!dn", name = "C", descriptor = "Z")
	public volatile boolean aBoolean512 = true;

	@OriginalMember(owner = "client!dn", name = "d", descriptor = "(B)[B")
	public abstract byte[] method6095();

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)I")
	public abstract int method6098();
}
