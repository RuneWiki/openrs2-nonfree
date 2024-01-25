import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public final class Class38_Sub2 extends Class38 {

	@OriginalMember(owner = "client!lf", name = "v", descriptor = "I")
	public final int anInt5683;

	@OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
	public final int anInt5680;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lclient!ja;Lclient!mea;IIIIIIIII)V")
	public Class38_Sub2(@OriginalArg(0) Class154 arg0, @OriginalArg(1) Class201 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt5683 = arg9;
		this.anInt5680 = arg10;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)Lclient!eu;")
	@Override
	public Class95 method6314() {
		return Static431.aClass95_7;
	}
}
