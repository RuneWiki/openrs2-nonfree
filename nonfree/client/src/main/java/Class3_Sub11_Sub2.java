import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public abstract class Class3_Sub11_Sub2 extends Class3_Sub11 {

	@OriginalMember(owner = "client!ev", name = "B", descriptor = "Z")
	public boolean aBoolean238;

	@OriginalMember(owner = "client!ev", name = "C", descriptor = "Z")
	public boolean aBoolean239;

	@OriginalMember(owner = "client!ev", name = "x", descriptor = "Z")
	public volatile boolean aBoolean237 = true;

	@OriginalMember(owner = "client!ev", name = "d", descriptor = "(B)[B")
	public abstract byte[] method2889();

	@OriginalMember(owner = "client!ev", name = "e", descriptor = "(I)I")
	public abstract int method2891();
}
