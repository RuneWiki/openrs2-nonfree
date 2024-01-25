import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class Class1_Sub1_Sub11 extends Class1_Sub1 {

	@OriginalMember(owner = "client!t", name = "y", descriptor = "Z")
	public boolean aBoolean648;

	@OriginalMember(owner = "client!t", name = "E", descriptor = "Z")
	public boolean aBoolean650;

	@OriginalMember(owner = "client!t", name = "D", descriptor = "Z")
	public volatile boolean aBoolean649 = true;

	@OriginalMember(owner = "client!t", name = "f", descriptor = "(I)[B")
	public abstract byte[] method5898();

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)I")
	public abstract int method5901();
}
