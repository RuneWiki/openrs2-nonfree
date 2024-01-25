import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public final class Class5_Sub41 extends Class5 {

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "Z")
	public final boolean aBoolean471;

	@OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
	public final int anInt6346;

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "I")
	public final int anInt6347;

	@OriginalMember(owner = "client!vq", name = "n", descriptor = "I")
	public final int anInt6348;

	@OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
	public final int anInt6350;

	@OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
	public final int anInt6351;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class5_Sub41(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean471 = arg5;
		this.anInt6346 = arg0;
		this.anInt6347 = arg4;
		this.anInt6348 = arg3;
		this.anInt6350 = arg2;
		this.anInt6351 = arg1;
	}
}
