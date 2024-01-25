import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public abstract class Class5_Sub9_Sub3 extends Class5_Sub9 {

	@OriginalMember(owner = "client!vp", name = "C", descriptor = "Z")
	public boolean aBoolean409;

	@OriginalMember(owner = "client!vp", name = "D", descriptor = "Z")
	public boolean aBoolean410;

	@OriginalMember(owner = "client!vp", name = "z", descriptor = "Z")
	public volatile boolean aBoolean408 = true;

	@OriginalMember(owner = "client!vp", name = "e", descriptor = "(B)I")
	public abstract int method4722();

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)[B")
	public abstract byte[] method4725();
}
