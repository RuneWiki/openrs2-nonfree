import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class Class5_Sub4_Sub12 extends Class5_Sub4 {

	@OriginalMember(owner = "client!nf", name = "y", descriptor = "Z")
	public boolean aBoolean359;

	@OriginalMember(owner = "client!nf", name = "A", descriptor = "Z")
	public boolean aBoolean360;

	@OriginalMember(owner = "client!nf", name = "x", descriptor = "Z")
	public volatile boolean aBoolean358 = true;

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)I")
	public abstract int method4029();

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)[B")
	public abstract byte[] method4030();
}
