import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public abstract class Class3_Sub6_Sub2 extends Class3_Sub6 {

	@OriginalMember(owner = "client!fn", name = "v", descriptor = "Z")
	public boolean aBoolean676;

	@OriginalMember(owner = "client!fn", name = "y", descriptor = "Z")
	public boolean aBoolean678;

	@OriginalMember(owner = "client!fn", name = "x", descriptor = "Z")
	public volatile boolean aBoolean677 = true;

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)I")
	public abstract int method7721();

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)[B")
	public abstract byte[] method7723();
}
