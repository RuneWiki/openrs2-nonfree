import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public abstract class Class6_Sub1_Sub10 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "Z")
	public boolean aBoolean605;

	@OriginalMember(owner = "client!ml", name = "w", descriptor = "Z")
	public boolean aBoolean606;

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "Z")
	public volatile boolean aBoolean607 = true;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)I")
	public abstract int method7036();

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "(I)[B")
	public abstract byte[] method7037();
}
