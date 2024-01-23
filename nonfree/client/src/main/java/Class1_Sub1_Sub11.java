import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public abstract class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!se", name = "w", descriptor = "Z")
	public boolean aBoolean338;

	@OriginalMember(owner = "client!se", name = "x", descriptor = "Z")
	public boolean aBoolean339;

	@OriginalMember(owner = "client!se", name = "H", descriptor = "Z")
	public volatile boolean aBoolean340 = true;

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(I)[B")
	public abstract byte[] method3719();

	@OriginalMember(owner = "client!se", name = "g", descriptor = "(I)I")
	public abstract int method3721();
}
