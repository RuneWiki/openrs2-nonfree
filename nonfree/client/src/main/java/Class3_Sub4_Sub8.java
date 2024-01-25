import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public abstract class Class3_Sub4_Sub8 extends Class3_Sub4 {

	@OriginalMember(owner = "client!el", name = "w", descriptor = "Z")
	public boolean aBoolean779;

	@OriginalMember(owner = "client!el", name = "x", descriptor = "Z")
	public boolean aBoolean780;

	@OriginalMember(owner = "client!el", name = "y", descriptor = "Z")
	public volatile boolean aBoolean781 = true;

	static {
		new Class278("", 73);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B)[B")
	public abstract byte[] method7551();

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(I)I")
	public abstract int method7554();
}
