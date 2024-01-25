import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public abstract class Class14_Sub2_Sub16 extends Class14_Sub2 {

	@OriginalMember(owner = "client!os", name = "v", descriptor = "Z")
	public boolean aBoolean427;

	@OriginalMember(owner = "client!os", name = "A", descriptor = "Z")
	public boolean aBoolean429;

	@OriginalMember(owner = "client!os", name = "x", descriptor = "Z")
	public volatile boolean aBoolean428 = true;

	@OriginalMember(owner = "client!os", name = "f", descriptor = "(I)I")
	public abstract int method5610();

	@OriginalMember(owner = "client!os", name = "g", descriptor = "(I)[B")
	public abstract byte[] method5613();
}
