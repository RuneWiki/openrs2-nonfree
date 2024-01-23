import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public abstract class Class1_Sub5_Sub3 extends Class1_Sub5 {

	@OriginalMember(owner = "client!bj", name = "B", descriptor = "Z")
	public boolean aBoolean461;

	@OriginalMember(owner = "client!bj", name = "E", descriptor = "Z")
	public boolean aBoolean462;

	@OriginalMember(owner = "client!bj", name = "z", descriptor = "Z")
	public volatile boolean aBoolean460 = true;

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)I")
	public abstract int method4019();

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "(I)[B")
	public abstract byte[] method4020();
}
