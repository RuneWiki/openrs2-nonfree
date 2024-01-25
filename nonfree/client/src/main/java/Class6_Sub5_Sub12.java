import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public abstract class Class6_Sub5_Sub12 extends Class6_Sub5 {

	@OriginalMember(owner = "client!hia", name = "v", descriptor = "Z")
	public boolean aBoolean680;

	@OriginalMember(owner = "client!hia", name = "w", descriptor = "Z")
	public boolean aBoolean681;

	@OriginalMember(owner = "client!hia", name = "y", descriptor = "Z")
	public volatile boolean aBoolean682 = true;

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "(I)I")
	public abstract int method7124();

	@OriginalMember(owner = "client!hia", name = "c", descriptor = "(I)[B")
	public abstract byte[] method7125();
}
