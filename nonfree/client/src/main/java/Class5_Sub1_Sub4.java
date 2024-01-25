import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public abstract class Class5_Sub1_Sub4 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "Z")
	public boolean aBoolean466;

	@OriginalMember(owner = "client!ec", name = "C", descriptor = "Z")
	public boolean aBoolean468;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "Z")
	public volatile boolean aBoolean467 = true;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)I")
	public abstract int method4997();

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)[B")
	public abstract byte[] method5000();
}
