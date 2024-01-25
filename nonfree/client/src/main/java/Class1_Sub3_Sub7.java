import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class Class1_Sub3_Sub7 extends Class1_Sub3 {

	@OriginalMember(owner = "client!se", name = "C", descriptor = "Z")
	public boolean aBoolean644;

	@OriginalMember(owner = "client!se", name = "D", descriptor = "Z")
	public boolean aBoolean645;

	@OriginalMember(owner = "client!se", name = "F", descriptor = "Z")
	public volatile boolean aBoolean646 = true;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)[B")
	public abstract byte[] method5942();

	@OriginalMember(owner = "client!se", name = "g", descriptor = "(I)I")
	public abstract int method5947();
}
