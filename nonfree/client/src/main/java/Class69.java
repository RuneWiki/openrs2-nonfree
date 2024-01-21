import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public final class Class69 {

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "Z")
	public boolean aBoolean140 = true;

	@OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
	public final int anInt3124;

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
	public final int anInt3127;

	@OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
	public final int anInt3123;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
	public final int anInt3118;

	@OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
	public final int anInt3122;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
	public final int anInt3119;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class69(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt3124 = arg1;
		this.anInt3127 = arg3;
		this.aBoolean140 = arg6;
		this.anInt3123 = arg0;
		this.anInt3118 = arg2;
		this.anInt3122 = arg5;
		this.anInt3119 = arg4;
	}
}
