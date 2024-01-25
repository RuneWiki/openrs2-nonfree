import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public final class Class2_Sub25 extends Class2 {

	@OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
	public final int anInt3823;

	@OriginalMember(owner = "client!lc", name = "m", descriptor = "Z")
	public final boolean aBoolean256;

	@OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
	public final int anInt3825;

	@OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
	public final int anInt3826;

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "I")
	public final int anInt3822;

	@OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
	public final int anInt3820;

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class2_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt3823 = arg2;
		this.aBoolean256 = arg5;
		this.anInt3825 = arg4;
		this.anInt3826 = arg3;
		this.anInt3822 = arg0;
		this.anInt3820 = arg1;
	}
}
