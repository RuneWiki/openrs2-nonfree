import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class Class7_Sub28 extends Class7 {

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "Z")
	public final boolean aBoolean228;

	@OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
	public final int anInt3804;

	@OriginalMember(owner = "client!kj", name = "s", descriptor = "I")
	public final int anInt3807;

	@OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
	public final int anInt3808;

	@OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
	public final int anInt3806;

	@OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
	public final int anInt3803;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class7_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean228 = arg5;
		this.anInt3804 = arg2;
		this.anInt3807 = arg4;
		this.anInt3808 = arg3;
		this.anInt3806 = arg1;
		this.anInt3803 = arg0;
	}
}
