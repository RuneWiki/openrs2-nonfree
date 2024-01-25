import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public abstract class Class2_Sub7_Sub9 extends Class2_Sub7 {

	@OriginalMember(owner = "client!uaa", name = "r", descriptor = "Z")
	public boolean aBoolean670;

	@OriginalMember(owner = "client!uaa", name = "w", descriptor = "Z")
	public boolean aBoolean671;

	@OriginalMember(owner = "client!uaa", name = "x", descriptor = "Z")
	public volatile boolean aBoolean672 = true;

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)[B")
	public abstract byte[] method7965();

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)I")
	public abstract int method7966();
}
