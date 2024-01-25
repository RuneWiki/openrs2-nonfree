import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public abstract class Class3_Sub7_Sub4 extends Class3_Sub7 {

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "Z")
	public boolean aBoolean125;

	@OriginalMember(owner = "client!gf", name = "u", descriptor = "Z")
	public boolean aBoolean127;

	@OriginalMember(owner = "client!gf", name = "t", descriptor = "Z")
	public volatile boolean aBoolean126 = true;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I")
	public abstract int method1502();

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)[B")
	public abstract byte[] method1504();
}
