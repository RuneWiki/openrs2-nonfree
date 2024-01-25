import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public abstract class Class7_Sub1_Sub8 extends Class7_Sub1 {

	@OriginalMember(owner = "client!qc", name = "B", descriptor = "Z")
	public boolean aBoolean445;

	@OriginalMember(owner = "client!qc", name = "C", descriptor = "Z")
	public boolean aBoolean446;

	@OriginalMember(owner = "client!qc", name = "L", descriptor = "Z")
	public volatile boolean aBoolean447 = true;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)I")
	public abstract int method5169();

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)[B")
	public abstract byte[] method5172();
}
