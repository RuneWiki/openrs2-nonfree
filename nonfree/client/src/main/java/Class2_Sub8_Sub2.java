import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public abstract class Class2_Sub8_Sub2 extends Class2_Sub8 {

	@OriginalMember(owner = "client!il", name = "v", descriptor = "Z")
	public boolean aBoolean271;

	@OriginalMember(owner = "client!il", name = "A", descriptor = "Z")
	public boolean aBoolean273;

	@OriginalMember(owner = "client!il", name = "w", descriptor = "Z")
	public volatile boolean aBoolean272 = true;

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(I)[B")
	public abstract byte[] method3254();

	@OriginalMember(owner = "client!il", name = "e", descriptor = "(I)I")
	public abstract int method3255();
}
