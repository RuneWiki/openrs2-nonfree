import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public abstract class Class6_Sub4_Sub11 extends Class6_Sub4 {

	@OriginalMember(owner = "client!sr", name = "x", descriptor = "Z")
	public boolean aBoolean587;

	@OriginalMember(owner = "client!sr", name = "A", descriptor = "Z")
	public boolean aBoolean589;

	@OriginalMember(owner = "client!sr", name = "y", descriptor = "Z")
	public volatile boolean aBoolean588 = true;

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "(I)[B")
	public abstract byte[] method7235();

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)I")
	public abstract int method7236();
}
