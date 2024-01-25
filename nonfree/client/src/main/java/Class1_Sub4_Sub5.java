import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public abstract class Class1_Sub4_Sub5 extends Class1_Sub4 {

	@OriginalMember(owner = "client!fm", name = "y", descriptor = "Z")
	public boolean aBoolean517;

	@OriginalMember(owner = "client!fm", name = "B", descriptor = "Z")
	public boolean aBoolean518;

	@OriginalMember(owner = "client!fm", name = "C", descriptor = "Z")
	public volatile boolean aBoolean519 = true;

	@OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)I")
	public abstract int method4677();

	@OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)[B")
	public abstract byte[] method4679();
}
