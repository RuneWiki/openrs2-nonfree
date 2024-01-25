import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public abstract class Class4_Sub1_Sub6 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "Z")
	public boolean aBoolean382;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "Z")
	public boolean aBoolean384;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "Z")
	public volatile boolean aBoolean381 = true;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)I")
	public abstract int method3342();

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)[B")
	public abstract byte[] method3343();
}
