import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!aca", name = "q", descriptor = "I")
	public final int anInt70;

	@OriginalMember(owner = "client!aca", name = "s", descriptor = "I")
	public final int anInt72;

	@OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Lclient!kda;Lclient!cu;IIIIIIIII)V")
	public Class6_Sub1(@OriginalArg(0) Class173 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt70 = arg9;
		this.anInt72 = arg10;
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)Lclient!hs;")
	@Override
	public Class138 method8348() {
		return Static520.aClass138_6;
	}
}
