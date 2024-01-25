import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public abstract class Class2_Sub3_Sub5 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ft", name = "u", descriptor = "Z")
	public boolean aBoolean499;

	@OriginalMember(owner = "client!ft", name = "w", descriptor = "Z")
	public boolean aBoolean500;

	@OriginalMember(owner = "client!ft", name = "x", descriptor = "Z")
	public volatile boolean aBoolean501 = true;

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)I")
	public abstract int method5299();

	@OriginalMember(owner = "client!ft", name = "d", descriptor = "(B)[B")
	public abstract byte[] method5301();
}
