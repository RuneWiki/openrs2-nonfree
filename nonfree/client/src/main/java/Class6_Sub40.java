import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public final class Class6_Sub40 extends Class6 {

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
	public final int anInt6600;

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "Z")
	public final boolean aBoolean447;

	@OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
	public final int anInt6598;

	@OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
	public final int anInt6597;

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
	public final int anInt6595;

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
	public final int anInt6599;

	@OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class6_Sub40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt6600 = arg4;
		this.aBoolean447 = arg5;
		this.anInt6598 = arg3;
		this.anInt6597 = arg2;
		this.anInt6595 = arg0;
		this.anInt6599 = arg1;
	}
}
