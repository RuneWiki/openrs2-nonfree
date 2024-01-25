import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public abstract class Class2_Sub2_Sub2 extends Class2_Sub2 {

	@OriginalMember(owner = "client!cm", name = "x", descriptor = "Z")
	public boolean aBoolean391;

	@OriginalMember(owner = "client!cm", name = "z", descriptor = "Z")
	public boolean aBoolean392;

	@OriginalMember(owner = "client!cm", name = "w", descriptor = "Z")
	public volatile boolean aBoolean390 = true;

	@OriginalMember(owner = "client!cm", name = "e", descriptor = "(I)I")
	public abstract int method4254();

	@OriginalMember(owner = "client!cm", name = "f", descriptor = "(I)[B")
	public abstract byte[] method4255();
}
