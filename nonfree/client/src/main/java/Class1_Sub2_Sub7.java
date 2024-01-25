import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public abstract class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fr", name = "C", descriptor = "Z")
	public boolean aBoolean482;

	@OriginalMember(owner = "client!fr", name = "E", descriptor = "Z")
	public boolean aBoolean483;

	@OriginalMember(owner = "client!fr", name = "A", descriptor = "Z")
	public volatile boolean aBoolean481 = true;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)[B")
	public abstract byte[] method5887();

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "(I)I")
	public abstract int method5889();
}
