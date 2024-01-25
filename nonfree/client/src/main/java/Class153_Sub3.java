import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public final class Class153_Sub3 extends Class153 {

	@OriginalMember(owner = "client!sv", name = "t", descriptor = "I")
	public final int anInt7932;

	@OriginalMember(owner = "client!sv", name = "o", descriptor = "I")
	public final int anInt7929;

	@OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lclient!tca;Lclient!vea;IIIIIIIIII)V")
	public Class153_Sub3(@OriginalArg(0) Class322 arg0, @OriginalArg(1) Class347 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt7932 = arg10;
		this.anInt7929 = arg11;
	}

	@OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)Lclient!mh;")
	@Override
	public Class225 method7443() {
		return Static143.aClass225_25;
	}
}
