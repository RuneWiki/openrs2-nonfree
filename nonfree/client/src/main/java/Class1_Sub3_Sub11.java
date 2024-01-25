import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public abstract class Class1_Sub3_Sub11 extends Class1_Sub3 {

	@OriginalMember(owner = "client!kw", name = "y", descriptor = "Z")
	public boolean aBoolean685;

	@OriginalMember(owner = "client!kw", name = "z", descriptor = "Z")
	public boolean aBoolean686;

	@OriginalMember(owner = "client!kw", name = "x", descriptor = "Z")
	public volatile boolean aBoolean684 = true;

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "(B)I")
	public abstract int method7746();

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)[B")
	public abstract byte[] method7748();
}
