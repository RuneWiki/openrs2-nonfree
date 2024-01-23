import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class Class1_Sub3_Sub4 extends Class1_Sub3 {

	@OriginalMember(owner = "client!cc", name = "I", descriptor = "Z")
	public boolean aBoolean272;

	@OriginalMember(owner = "client!cc", name = "L", descriptor = "Z")
	public boolean aBoolean274;

	@OriginalMember(owner = "client!cc", name = "R", descriptor = "Z")
	public volatile boolean aBoolean275 = true;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)I")
	public abstract int method3228();

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(B)[B")
	public abstract byte[] method3229();
}
