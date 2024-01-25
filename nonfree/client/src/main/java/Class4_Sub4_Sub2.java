import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class Class4_Sub4_Sub2 extends Class4_Sub4 {

	@OriginalMember(owner = "client!qc", name = "H", descriptor = "Z")
	public boolean aBoolean196;

	@OriginalMember(owner = "client!qc", name = "J", descriptor = "Z")
	public boolean aBoolean198;

	@OriginalMember(owner = "client!qc", name = "I", descriptor = "Z")
	public volatile boolean aBoolean197 = true;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(Z)I")
	public abstract int method2405();

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)[B")
	public abstract byte[] method2408();
}
