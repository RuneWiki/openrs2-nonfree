import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public abstract class Class6_Sub2_Sub11 extends Class6_Sub2 {

	@OriginalMember(owner = "client!mm", name = "y", descriptor = "Z")
	public boolean aBoolean364;

	@OriginalMember(owner = "client!mm", name = "z", descriptor = "Z")
	public boolean aBoolean365;

	@OriginalMember(owner = "client!mm", name = "A", descriptor = "Z")
	public volatile boolean aBoolean366 = true;

	@OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)[B")
	public abstract byte[] method4802();

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "(I)I")
	public abstract int method4804();
}
