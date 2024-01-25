import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public abstract class Class3_Sub7_Sub17 extends Class3_Sub7 {

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "Z")
	public boolean aBoolean298;

	@OriginalMember(owner = "client!pd", name = "C", descriptor = "Z")
	public boolean aBoolean299;

	@OriginalMember(owner = "client!pd", name = "D", descriptor = "Z")
	public volatile boolean aBoolean300 = true;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)[B")
	public abstract byte[] method4374();

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)I")
	public abstract int method4375();
}
