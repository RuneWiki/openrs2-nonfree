import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public abstract class Class2_Sub7_Sub17 extends Class2_Sub7 {

	@OriginalMember(owner = "client!si", name = "y", descriptor = "Z")
	public boolean aBoolean500;

	@OriginalMember(owner = "client!si", name = "A", descriptor = "Z")
	public boolean aBoolean501;

	@OriginalMember(owner = "client!si", name = "E", descriptor = "Z")
	public volatile boolean aBoolean502 = true;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(I)I")
	public abstract int method6087();

	@OriginalMember(owner = "client!si", name = "e", descriptor = "(B)[B")
	public abstract byte[] method6090();
}
