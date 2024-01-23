import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public abstract class Class4_Sub2_Sub4 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "Z")
	public boolean aBoolean155;

	@OriginalMember(owner = "client!ba", name = "y", descriptor = "Z")
	public boolean aBoolean156;

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "Z")
	public volatile boolean aBoolean157 = true;

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)I")
	public abstract int method1601();

	@OriginalMember(owner = "client!ba", name = "f", descriptor = "(I)[B")
	public abstract byte[] method1606();
}
