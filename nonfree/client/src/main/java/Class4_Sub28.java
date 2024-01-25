import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public final class Class4_Sub28 extends Class4 {

	@OriginalMember(owner = "client!nl", name = "m", descriptor = "I")
	public final int anInt6870;

	@OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
	public final int anInt6873;

	@OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
	public final int anInt6868;

	@OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
	public final int anInt6871;

	@OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
	public final int anInt6869;

	@OriginalMember(owner = "client!nl", name = "o", descriptor = "Z")
	public final boolean aBoolean495;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class4_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt6870 = arg1;
		this.anInt6873 = arg0;
		this.anInt6868 = arg2;
		this.anInt6871 = arg3;
		this.anInt6869 = arg4;
		this.aBoolean495 = arg5;
	}
}
