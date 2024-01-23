import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public abstract class Class3_Sub4_Sub1 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ao", name = "D", descriptor = "Z")
	public boolean aBoolean298;

	@OriginalMember(owner = "client!ao", name = "K", descriptor = "Z")
	public boolean aBoolean299;

	@OriginalMember(owner = "client!ao", name = "B", descriptor = "Z")
	public volatile boolean aBoolean297 = true;

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(B)[B")
	public abstract byte[] method3528();

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(Z)I")
	public abstract int method3534();
}
