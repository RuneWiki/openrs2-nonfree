import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public abstract class Class4_Sub1_Sub3 extends Class4_Sub1 {

	@OriginalMember(owner = "client!tt", name = "E", descriptor = "Z")
	public boolean aBoolean331;

	@OriginalMember(owner = "client!tt", name = "G", descriptor = "Z")
	public boolean aBoolean332;

	@OriginalMember(owner = "client!tt", name = "z", descriptor = "Z")
	public volatile boolean aBoolean330 = true;

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)[B")
	public abstract byte[] method3403();

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "(I)I")
	public abstract int method3404();
}
