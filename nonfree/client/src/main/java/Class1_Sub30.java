import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public final class Class1_Sub30 extends Class1 {

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
	public final int anInt4476;

	@OriginalMember(owner = "client!mj", name = "t", descriptor = "Z")
	public final boolean aBoolean306;

	@OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
	public final int anInt4475;

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
	public final int anInt4474;

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
	public final int anInt4471;

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "I")
	public final int anInt4472;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class1_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt4476 = arg3;
		this.aBoolean306 = arg5;
		this.anInt4475 = arg1;
		this.anInt4474 = arg4;
		this.anInt4471 = arg0;
		this.anInt4472 = arg2;
	}
}
