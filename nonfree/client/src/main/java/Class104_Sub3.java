import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public final class Class104_Sub3 extends Class104 {

	@OriginalMember(owner = "client!qr", name = "p", descriptor = "I")
	public final int anInt8377;

	@OriginalMember(owner = "client!qr", name = "q", descriptor = "I")
	public final int anInt8376;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Lclient!lea;Lclient!taa;IIIIIIIIII)V")
	public Class104_Sub3(@OriginalArg(0) Class223 arg0, @OriginalArg(1) Class352 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt8377 = arg11;
		this.anInt8376 = arg10;
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)Lclient!vf;")
	@Override
	public Class390 method7510() {
		return Static709.aClass390_13;
	}
}
