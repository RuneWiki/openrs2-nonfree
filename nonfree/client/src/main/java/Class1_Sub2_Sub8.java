import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public abstract class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ku", name = "w", descriptor = "Z")
	public boolean aBoolean383;

	@OriginalMember(owner = "client!ku", name = "x", descriptor = "Z")
	public boolean aBoolean384;

	@OriginalMember(owner = "client!ku", name = "y", descriptor = "Z")
	public volatile boolean aBoolean385 = true;

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)I")
	public abstract int method4411();

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(Z)[B")
	public abstract byte[] method4412();
}
