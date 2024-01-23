import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public abstract class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!tc", name = "z", descriptor = "Z")
	public boolean aBoolean101;

	@OriginalMember(owner = "client!tc", name = "D", descriptor = "Z")
	public boolean aBoolean103;

	@OriginalMember(owner = "client!tc", name = "B", descriptor = "Z")
	public volatile boolean aBoolean102 = true;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(B)[B")
	public abstract byte[] method1408();

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)I")
	public abstract int method1411();
}
