import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public abstract class Class1_Sub2_Sub5 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tf", name = "C", descriptor = "Z")
	public boolean aBoolean221;

	@OriginalMember(owner = "client!tf", name = "F", descriptor = "Z")
	public boolean aBoolean223;

	@OriginalMember(owner = "client!tf", name = "E", descriptor = "Z")
	public volatile boolean aBoolean222 = true;

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "(I)I")
	public abstract int method3390();

	@OriginalMember(owner = "client!tf", name = "i", descriptor = "(I)[B")
	public abstract byte[] method3391();
}
