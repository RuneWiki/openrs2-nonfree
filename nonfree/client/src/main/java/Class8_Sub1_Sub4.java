import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public abstract class Class8_Sub1_Sub4 extends Class8_Sub1 {

	@OriginalMember(owner = "client!ch", name = "y", descriptor = "Z")
	public boolean aBoolean312;

	@OriginalMember(owner = "client!ch", name = "H", descriptor = "Z")
	public boolean aBoolean315;

	@OriginalMember(owner = "client!ch", name = "B", descriptor = "Z")
	public volatile boolean aBoolean313 = true;

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(B)I")
	public abstract int method3007();

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)[B")
	public abstract byte[] method3013();
}
