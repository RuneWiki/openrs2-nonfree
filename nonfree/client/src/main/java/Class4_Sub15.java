import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public final class Class4_Sub15 extends Class4 {

	@OriginalMember(owner = "client!he", name = "n", descriptor = "Z")
	public final boolean aBoolean210;

	@OriginalMember(owner = "client!he", name = "x", descriptor = "I")
	public final int anInt2473;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "I")
	public final int anInt2465;

	@OriginalMember(owner = "client!he", name = "s", descriptor = "I")
	public final int anInt2469;

	@OriginalMember(owner = "client!he", name = "v", descriptor = "I")
	public final int anInt2471;

	@OriginalMember(owner = "client!he", name = "o", descriptor = "I")
	public final int anInt2466;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class4_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean210 = arg5;
		this.anInt2473 = arg4;
		this.anInt2465 = arg2;
		this.anInt2469 = arg3;
		this.anInt2471 = arg0;
		this.anInt2466 = arg1;
	}
}
