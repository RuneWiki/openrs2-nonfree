import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public final class Class2 {

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "I")
	public int anInt4;

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "Z")
	public boolean aBoolean1;

	@OriginalMember(owner = "client!aaa", name = "d", descriptor = "Z")
	public boolean aBoolean2;

	@OriginalMember(owner = "client!aaa", name = "h", descriptor = "I")
	public int anInt8;

	@OriginalMember(owner = "client!aaa", name = "i", descriptor = "I")
	public int anInt9;
}
