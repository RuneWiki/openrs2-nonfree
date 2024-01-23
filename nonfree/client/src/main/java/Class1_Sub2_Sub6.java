import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public abstract class Class1_Sub2_Sub6 extends Class1_Sub2 {

	@OriginalMember(owner = "client!kd", name = "z", descriptor = "Z")
	public boolean aBoolean326;

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "Z")
	public boolean aBoolean327;

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "Z")
	public volatile boolean aBoolean325 = true;

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)I")
	public abstract int method3362();

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "(B)[B")
	public abstract byte[] method3364();
}
