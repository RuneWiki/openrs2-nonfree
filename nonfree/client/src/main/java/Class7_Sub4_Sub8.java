import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class Class7_Sub4_Sub8 extends Class7_Sub4 {

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "Z")
	public boolean aBoolean378;

	@OriginalMember(owner = "client!hh", name = "r", descriptor = "Z")
	public boolean aBoolean379;

	@OriginalMember(owner = "client!hh", name = "t", descriptor = "Z")
	public volatile boolean aBoolean380 = true;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)[B")
	public abstract byte[] method4536();

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)I")
	public abstract int method4537();
}
