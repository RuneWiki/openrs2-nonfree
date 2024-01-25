import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public abstract class Class1_Sub5_Sub9 extends Class1_Sub5 {

	@OriginalMember(owner = "client!hi", name = "v", descriptor = "Z")
	public boolean aBoolean741;

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "Z")
	public boolean aBoolean742;

	@OriginalMember(owner = "client!hi", name = "t", descriptor = "Z")
	public volatile boolean aBoolean740 = true;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)I")
	public abstract int method5308();

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "(I)[B")
	public abstract byte[] method5312();
}
