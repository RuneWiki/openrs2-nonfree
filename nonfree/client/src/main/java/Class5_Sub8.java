import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public final class Class5_Sub8 extends Class5 {

	@OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
	public final int anInt513;

	@OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
	public final int anInt515;

	@OriginalMember(owner = "client!bl", name = "C", descriptor = "I")
	public final int anInt522;

	@OriginalMember(owner = "client!bl", name = "v", descriptor = "Z")
	public final boolean aBoolean36;

	@OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
	public final int anInt518;

	@OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
	public final int anInt516;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class5_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt513 = arg1;
		this.anInt515 = arg0;
		this.anInt522 = arg2;
		this.aBoolean36 = arg5;
		this.anInt518 = arg4;
		this.anInt516 = arg3;
	}
}
