import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public abstract class Class3_Sub5_Sub2 extends Class3_Sub5 {

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "Z")
	public boolean aBoolean542;

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "Z")
	public boolean aBoolean543;

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "Z")
	public volatile boolean aBoolean541 = true;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)I")
	public abstract int method6439();

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(B)[B")
	public abstract byte[] method6440();
}
