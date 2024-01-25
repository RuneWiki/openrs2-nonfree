import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!di", name = "H", descriptor = "Z")
	public boolean aBoolean432;

	@OriginalMember(owner = "client!di", name = "I", descriptor = "Z")
	public boolean aBoolean433;

	@OriginalMember(owner = "client!di", name = "K", descriptor = "Z")
	public volatile boolean aBoolean434 = true;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(B)I")
	public abstract int method4854();

	@OriginalMember(owner = "client!di", name = "g", descriptor = "(I)[B")
	public abstract byte[] method4856();
}
