import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public final class Class5_Sub32 extends Class5 {

	@OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
	public final int anInt5472;

	@OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
	public final int anInt5474;

	@OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
	public final int anInt5470;

	@OriginalMember(owner = "client!qk", name = "k", descriptor = "Z")
	public final boolean aBoolean378;

	@OriginalMember(owner = "client!qk", name = "v", descriptor = "I")
	public final int anInt5478;

	@OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
	public final int anInt5471;

	static {
		new Class60("", 76);
	}

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class5_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt5472 = arg4;
		this.anInt5474 = arg1;
		this.anInt5470 = arg2;
		this.aBoolean378 = arg5;
		this.anInt5478 = arg0;
		this.anInt5471 = arg3;
	}
}
