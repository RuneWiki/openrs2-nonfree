import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public abstract class Class12_Sub4_Sub9 extends Class12_Sub4 {

	@OriginalMember(owner = "client!gs", name = "y", descriptor = "Z")
	public boolean aBoolean622;

	@OriginalMember(owner = "client!gs", name = "B", descriptor = "Z")
	public boolean aBoolean624;

	@OriginalMember(owner = "client!gs", name = "z", descriptor = "Z")
	public volatile boolean aBoolean623 = true;

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "(I)[B")
	public abstract byte[] method7280();

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "(I)I")
	public abstract int method7281();
}
