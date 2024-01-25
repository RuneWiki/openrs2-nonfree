import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public abstract class Class1_Sub8_Sub1 extends Class1_Sub8 {

	@OriginalMember(owner = "client!ufa", name = "z", descriptor = "Z")
	public boolean aBoolean564;

	@OriginalMember(owner = "client!ufa", name = "B", descriptor = "Z")
	public boolean aBoolean565;

	@OriginalMember(owner = "client!ufa", name = "y", descriptor = "Z")
	public volatile boolean aBoolean563 = true;

	static {
		new Class84("", 76);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)I")
	public abstract int method5911();

	@OriginalMember(owner = "client!ufa", name = "g", descriptor = "(I)[B")
	public abstract byte[] method5914();
}
