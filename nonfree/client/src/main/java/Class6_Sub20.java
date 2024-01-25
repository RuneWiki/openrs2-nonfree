import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public final class Class6_Sub20 extends Class6 {

	@OriginalMember(owner = "client!jr", name = "v", descriptor = "I")
	public final int anInt3762;

	@OriginalMember(owner = "client!jr", name = "q", descriptor = "I")
	public final int anInt3759;

	@OriginalMember(owner = "client!jr", name = "t", descriptor = "I")
	public final int anInt3760;

	@OriginalMember(owner = "client!jr", name = "s", descriptor = "Z")
	public final boolean aBoolean247;

	@OriginalMember(owner = "client!jr", name = "u", descriptor = "I")
	public final int anInt3761;

	@OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
	public final int anInt3758;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class6_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt3762 = arg3;
		this.anInt3759 = arg2;
		this.anInt3760 = arg4;
		this.aBoolean247 = arg5;
		this.anInt3761 = arg0;
		this.anInt3758 = arg1;
	}
}
