import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public abstract class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!hl", name = "G", descriptor = "Z")
	public boolean aBoolean231;

	@OriginalMember(owner = "client!hl", name = "J", descriptor = "Z")
	public boolean aBoolean232;

	@OriginalMember(owner = "client!hl", name = "M", descriptor = "Z")
	public volatile boolean aBoolean233 = true;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "(I)[B")
	public abstract byte[] method2546();

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "(I)I")
	public abstract int method2547();
}
