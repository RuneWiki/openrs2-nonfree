import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "Z")
	public boolean aBoolean490 = false;

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "Z")
	public boolean aBoolean491 = false;

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
	protected int anInt5558;

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
	protected int anInt5559;

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
	protected final int anInt5562;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(IIIZZ)V")
	protected Class2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5558 = arg0;
		this.anInt5559 = arg2;
		this.aBoolean490 = arg4;
		this.anInt5562 = arg1;
		this.aBoolean491 = arg3;
	}
}
