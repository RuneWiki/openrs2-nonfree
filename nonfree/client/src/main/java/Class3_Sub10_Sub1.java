import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public abstract class Class3_Sub10_Sub1 extends Class3_Sub10 {

	@OriginalMember(owner = "client!dr", name = "q", descriptor = "Z")
	public boolean aBoolean380;

	@OriginalMember(owner = "client!dr", name = "r", descriptor = "Z")
	public boolean aBoolean381;

	@OriginalMember(owner = "client!dr", name = "s", descriptor = "Z")
	public volatile boolean aBoolean382 = true;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)I")
	public abstract int method4926();

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(B)[B")
	public abstract byte[] method4927();
}
