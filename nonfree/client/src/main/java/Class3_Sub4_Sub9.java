import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public abstract class Class3_Sub4_Sub9 extends Class3_Sub4 {

	@OriginalMember(owner = "client!gf", name = "r", descriptor = "Z")
	public boolean aBoolean722;

	@OriginalMember(owner = "client!gf", name = "s", descriptor = "Z")
	public boolean aBoolean723;

	@OriginalMember(owner = "client!gf", name = "x", descriptor = "Z")
	public volatile boolean aBoolean724 = true;

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)I")
	public abstract int method8676();

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)[B")
	public abstract byte[] method8677();
}
