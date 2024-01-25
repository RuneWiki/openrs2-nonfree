import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public abstract class Class5_Sub3_Sub11 extends Class5_Sub3 {

	@OriginalMember(owner = "client!np", name = "s", descriptor = "Z")
	public boolean aBoolean663;

	@OriginalMember(owner = "client!np", name = "w", descriptor = "Z")
	public boolean aBoolean665;

	@OriginalMember(owner = "client!np", name = "v", descriptor = "Z")
	public volatile boolean aBoolean664 = true;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)I")
	public abstract int method6565();

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)[B")
	public abstract byte[] method6567();
}
