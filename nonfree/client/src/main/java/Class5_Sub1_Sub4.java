import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public abstract class Class5_Sub1_Sub4 extends Class5_Sub1 {

	@OriginalMember(owner = "client!fm", name = "v", descriptor = "Z")
	public boolean aBoolean586;

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "Z")
	public boolean aBoolean587;

	@OriginalMember(owner = "client!fm", name = "A", descriptor = "Z")
	public volatile boolean aBoolean589 = true;

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(Z)I")
	public abstract int method7594();

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(Z)[B")
	public abstract byte[] method7596();
}
