import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public final class Class38_Sub3 extends Class38 {

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
	public final int anInt8028;

	@OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
	public final int anInt8031;

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lclient!ja;Lclient!mea;IIIIIIIIII)V")
	public Class38_Sub3(@OriginalArg(0) Class154 arg0, @OriginalArg(1) Class201 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt8028 = arg10;
		this.anInt8031 = arg11;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)Lclient!eu;")
	@Override
	public Class95 method6314() {
		return Static337.aClass95_5;
	}
}
