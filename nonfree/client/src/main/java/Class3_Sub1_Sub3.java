import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public abstract class Class3_Sub1_Sub3 extends Class3_Sub1 {

	@OriginalMember(owner = "client!dq", name = "s", descriptor = "Z")
	public boolean aBoolean828;

	@OriginalMember(owner = "client!dq", name = "w", descriptor = "Z")
	public boolean aBoolean829;

	@OriginalMember(owner = "client!dq", name = "x", descriptor = "Z")
	public volatile boolean aBoolean830 = true;

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)[B")
	public abstract byte[] method8168();

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "(B)I")
	public abstract int method8170();
}
