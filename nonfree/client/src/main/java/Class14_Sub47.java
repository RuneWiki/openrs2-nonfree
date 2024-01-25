import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public final class Class14_Sub47 extends Class14 {

	@OriginalMember(owner = "client!qr", name = "m", descriptor = "I")
	public final int anInt8770;

	@OriginalMember(owner = "client!qr", name = "q", descriptor = "I")
	public final int anInt8772;

	@OriginalMember(owner = "client!qr", name = "n", descriptor = "Z")
	public final boolean aBoolean625;

	@OriginalMember(owner = "client!qr", name = "r", descriptor = "I")
	public final int anInt8773;

	@OriginalMember(owner = "client!qr", name = "t", descriptor = "I")
	public final int anInt8775;

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "I")
	public final int anInt8769;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(IIIIIZ)V")
	public Class14_Sub47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt8770 = arg0;
		this.anInt8772 = arg1;
		this.aBoolean625 = arg5;
		this.anInt8773 = arg4;
		this.anInt8775 = arg2;
		this.anInt8769 = arg3;
	}
}
