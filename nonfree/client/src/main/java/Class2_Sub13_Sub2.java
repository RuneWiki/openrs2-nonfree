import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public abstract class Class2_Sub13_Sub2 extends Class2_Sub13 {

	@OriginalMember(owner = "client!naa", name = "y", descriptor = "Z")
	public boolean aBoolean515;

	@OriginalMember(owner = "client!naa", name = "z", descriptor = "Z")
	public boolean aBoolean516;

	@OriginalMember(owner = "client!naa", name = "v", descriptor = "Z")
	public volatile boolean aBoolean514 = true;

	@OriginalMember(owner = "client!naa", name = "g", descriptor = "(I)[B")
	public abstract byte[] method5809();

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)I")
	public abstract int method5810();
}
