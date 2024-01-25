import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public abstract class Class2_Sub6_Sub8 extends Class2_Sub6 {

	@OriginalMember(owner = "client!ffa", name = "y", descriptor = "Z")
	public boolean aBoolean600;

	@OriginalMember(owner = "client!ffa", name = "E", descriptor = "Z")
	public boolean aBoolean602;

	@OriginalMember(owner = "client!ffa", name = "z", descriptor = "Z")
	public volatile boolean aBoolean601 = true;

	@OriginalMember(owner = "client!ffa", name = "e", descriptor = "(I)I")
	public abstract int method7142();

	@OriginalMember(owner = "client!ffa", name = "f", descriptor = "(I)[B")
	public abstract byte[] method7144();
}
