import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public final class Class6_Sub18 extends Class6 {

	@OriginalMember(owner = "client!er", name = "v", descriptor = "Z")
	public final boolean aBoolean256;

	@OriginalMember(owner = "client!er", name = "t", descriptor = "I")
	public final int anInt3321;

	@OriginalMember(owner = "client!er", name = "q", descriptor = "I")
	public final int anInt3318;

	@OriginalMember(owner = "client!er", name = "o", descriptor = "I")
	public final int anInt3316;

	@OriginalMember(owner = "client!er", name = "k", descriptor = "I")
	public final int anInt3312;

	@OriginalMember(owner = "client!er", name = "p", descriptor = "I")
	public final int anInt3317;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class6_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean256 = arg5;
		this.anInt3321 = arg0;
		this.anInt3318 = arg3;
		this.anInt3316 = arg2;
		this.anInt3312 = arg4;
		this.anInt3317 = arg1;
	}
}
