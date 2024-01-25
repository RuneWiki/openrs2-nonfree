import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public abstract class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!vd", name = "w", descriptor = "Z")
	public boolean aBoolean469;

	@OriginalMember(owner = "client!vd", name = "F", descriptor = "Z")
	public boolean aBoolean470;

	@OriginalMember(owner = "client!vd", name = "G", descriptor = "Z")
	public volatile boolean aBoolean471 = true;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)[B")
	public abstract byte[] method4947();

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(B)I")
	public abstract int method4949();
}
