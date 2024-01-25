import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public abstract class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!nn", name = "u", descriptor = "Z")
	public boolean aBoolean526;

	@OriginalMember(owner = "client!nn", name = "B", descriptor = "Z")
	public boolean aBoolean528;

	@OriginalMember(owner = "client!nn", name = "y", descriptor = "Z")
	public volatile boolean aBoolean527 = true;

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)I")
	public abstract int method4713();

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)[B")
	public abstract byte[] method4715();
}
