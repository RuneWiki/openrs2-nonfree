import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public abstract class Class4_Sub2_Sub1 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ki", name = "z", descriptor = "Z")
	public boolean aBoolean387;

	@OriginalMember(owner = "client!ki", name = "E", descriptor = "Z")
	public boolean aBoolean389;

	@OriginalMember(owner = "client!ki", name = "A", descriptor = "Z")
	public volatile boolean aBoolean388 = true;

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)[B")
	public abstract byte[] method4495();

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)I")
	public abstract int method4498();
}
