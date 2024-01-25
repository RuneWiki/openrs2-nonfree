import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public final class Class1_Sub23 extends Class1 {

	@OriginalMember(owner = "client!gr", name = "p", descriptor = "I")
	public final int anInt3026;

	@OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
	public final int anInt3028;

	@OriginalMember(owner = "client!gr", name = "q", descriptor = "I")
	public final int anInt3027;

	@OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
	public final int anInt3023;

	@OriginalMember(owner = "client!gr", name = "m", descriptor = "Z")
	public final boolean aBoolean206;

	@OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
	public final int anInt3022;

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class1_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt3026 = arg4;
		this.anInt3028 = arg3;
		this.anInt3027 = arg2;
		this.anInt3023 = arg1;
		this.aBoolean206 = arg5;
		this.anInt3022 = arg0;
	}
}
