import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public final class Class6_Sub19 extends Class6 {

	@OriginalMember(owner = "client!gca", name = "n", descriptor = "I")
	public final int anInt3627;

	@OriginalMember(owner = "client!gca", name = "p", descriptor = "I")
	public final int anInt3629;

	@OriginalMember(owner = "client!gca", name = "m", descriptor = "I")
	public final int anInt3626;

	@OriginalMember(owner = "client!gca", name = "r", descriptor = "Z")
	public final boolean aBoolean262;

	@OriginalMember(owner = "client!gca", name = "t", descriptor = "I")
	public final int anInt3631;

	@OriginalMember(owner = "client!gca", name = "v", descriptor = "I")
	public final int anInt3632;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class6_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt3627 = arg1;
		this.anInt3629 = arg2;
		this.anInt3626 = arg3;
		this.aBoolean262 = arg5;
		this.anInt3631 = arg0;
		this.anInt3632 = arg4;
	}
}
