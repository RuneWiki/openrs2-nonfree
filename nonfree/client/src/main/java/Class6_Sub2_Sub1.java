import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public abstract class Class6_Sub2_Sub1 extends Class6_Sub2 {

	@OriginalMember(owner = "client!qv", name = "z", descriptor = "Z")
	public boolean aBoolean256;

	@OriginalMember(owner = "client!qv", name = "x", descriptor = "Z")
	public boolean aBoolean257;

	@OriginalMember(owner = "client!qv", name = "w", descriptor = "Z")
	public volatile boolean aBoolean259 = true;

	@OriginalMember(owner = "client!qv", name = "i", descriptor = "(I)[B")
	public abstract byte[] method3112();

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "(I)I")
	public abstract int method3115();
}
