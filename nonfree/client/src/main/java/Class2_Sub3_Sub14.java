import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public abstract class Class2_Sub3_Sub14 extends Class2_Sub3 {

	@OriginalMember(owner = "client!sl", name = "P", descriptor = "Z")
	public boolean aBoolean321;

	@OriginalMember(owner = "client!sl", name = "Q", descriptor = "Z")
	public boolean aBoolean322;

	@OriginalMember(owner = "client!sl", name = "F", descriptor = "Z")
	public volatile boolean aBoolean320 = true;

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(B)[B")
	public abstract byte[] method3053();

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(Z)I")
	public abstract int method3057();
}
