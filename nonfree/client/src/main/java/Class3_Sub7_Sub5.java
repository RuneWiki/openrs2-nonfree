import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public abstract class Class3_Sub7_Sub5 extends Class3_Sub7 {

	@OriginalMember(owner = "client!dm", name = "J", descriptor = "Z")
	public boolean aBoolean635;

	@OriginalMember(owner = "client!dm", name = "P", descriptor = "Z")
	public boolean aBoolean638;

	@OriginalMember(owner = "client!dm", name = "K", descriptor = "Z")
	public volatile boolean aBoolean636 = true;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Z)[B")
	public abstract byte[] method7579();

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)I")
	public abstract int method7580();
}
