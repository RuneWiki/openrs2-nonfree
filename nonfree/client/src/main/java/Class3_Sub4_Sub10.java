import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class Class3_Sub4_Sub10 extends Class3_Sub4 {

	@OriginalMember(owner = "client!id", name = "z", descriptor = "Z")
	public boolean aBoolean388;

	@OriginalMember(owner = "client!id", name = "B", descriptor = "Z")
	public boolean aBoolean390;

	@OriginalMember(owner = "client!id", name = "w", descriptor = "Z")
	public volatile boolean aBoolean389 = true;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)[B")
	public abstract byte[] method3686();

	@OriginalMember(owner = "client!id", name = "d", descriptor = "(B)I")
	public abstract int method3688();
}
