import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ag", name = "B", descriptor = "Z")
	public boolean aBoolean523;

	@OriginalMember(owner = "client!ag", name = "E", descriptor = "Z")
	public boolean aBoolean525;

	@OriginalMember(owner = "client!ag", name = "C", descriptor = "Z")
	public volatile boolean aBoolean524 = true;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)[B")
	public abstract byte[] method4906();

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)I")
	public abstract int method4908();
}
