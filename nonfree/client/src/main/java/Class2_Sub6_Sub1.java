import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public abstract class Class2_Sub6_Sub1 extends Class2_Sub6 {

	@OriginalMember(owner = "client!gt", name = "x", descriptor = "Z")
	public boolean aBoolean843;

	@OriginalMember(owner = "client!gt", name = "y", descriptor = "Z")
	public boolean aBoolean844;

	@OriginalMember(owner = "client!gt", name = "w", descriptor = "Z")
	public volatile boolean aBoolean842 = true;

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "(I)[B")
	public abstract byte[] method8700();

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)I")
	public abstract int method8702();
}
