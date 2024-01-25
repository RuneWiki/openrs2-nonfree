import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public abstract class Class2_Sub10_Sub9 extends Class2_Sub10 {

	@OriginalMember(owner = "client!od", name = "H", descriptor = "Z")
	public boolean aBoolean364;

	@OriginalMember(owner = "client!od", name = "M", descriptor = "Z")
	public boolean aBoolean365;

	@OriginalMember(owner = "client!od", name = "F", descriptor = "Z")
	public volatile boolean aBoolean362 = true;

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(I)I")
	public abstract int method4241();

	@OriginalMember(owner = "client!od", name = "i", descriptor = "(I)[B")
	public abstract byte[] method4243();
}
