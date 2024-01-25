import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class Class47_Sub5 extends Class47 {

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "Z")
	public boolean aBoolean320 = false;

	@OriginalMember(owner = "client!qd", name = "o", descriptor = "Z")
	public boolean aBoolean321 = false;

	@OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
	protected final int anInt4033;

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
	protected int anInt4036;

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
	protected int anInt4037;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class47_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean321 = arg4;
		this.aBoolean320 = arg3;
		this.anInt4033 = arg1;
		this.anInt4036 = arg0;
		this.anInt4037 = arg2;
	}
}
