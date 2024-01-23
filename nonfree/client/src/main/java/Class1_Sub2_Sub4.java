import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public abstract class Class1_Sub2_Sub4 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ej", name = "F", descriptor = "Z")
	public boolean aBoolean297;

	@OriginalMember(owner = "client!ej", name = "I", descriptor = "Z")
	public boolean aBoolean298;

	@OriginalMember(owner = "client!ej", name = "A", descriptor = "Z")
	public volatile boolean aBoolean296 = true;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)I")
	public abstract int method3665();

	@OriginalMember(owner = "client!ej", name = "d", descriptor = "(B)[B")
	public abstract byte[] method3668();
}
