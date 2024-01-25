import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public final class Class8_Sub21 extends Class8 {

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
	public final int anInt3597;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	public final int anInt3598;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
	public final int anInt3595;

	@OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
	public final int anInt3594;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "Z")
	public final boolean aBoolean262;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
	public final int anInt3596;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class8_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt3597 = arg4;
		this.anInt3598 = arg2;
		this.anInt3595 = arg3;
		this.anInt3594 = arg1;
		this.aBoolean262 = arg5;
		this.anInt3596 = arg0;
	}
}
