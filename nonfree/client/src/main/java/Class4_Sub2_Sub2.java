import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public abstract class Class4_Sub2_Sub2 extends Class4_Sub2 {

	@OriginalMember(owner = "client!au", name = "q", descriptor = "Z")
	public boolean aBoolean112;

	@OriginalMember(owner = "client!au", name = "u", descriptor = "Z")
	public boolean aBoolean114;

	@OriginalMember(owner = "client!au", name = "s", descriptor = "Z")
	public volatile boolean aBoolean113 = true;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)[B")
	public abstract byte[] method1359();

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(B)I")
	public abstract int method1361();
}
