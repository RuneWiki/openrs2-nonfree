import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public abstract class Class2_Sub5_Sub12 extends Class2_Sub5 {

	@OriginalMember(owner = "client!tk", name = "u", descriptor = "Z")
	public boolean aBoolean334;

	@OriginalMember(owner = "client!tk", name = "z", descriptor = "Z")
	public boolean aBoolean336;

	@OriginalMember(owner = "client!tk", name = "x", descriptor = "Z")
	public volatile boolean aBoolean335 = true;

	@OriginalMember(owner = "client!tk", name = "c", descriptor = "(B)I")
	public abstract int method3885();

	@OriginalMember(owner = "client!tk", name = "h", descriptor = "(I)[B")
	public abstract byte[] method3887();
}
