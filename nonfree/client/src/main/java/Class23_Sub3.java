import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public final class Class23_Sub3 extends Class23 {

	@OriginalMember(owner = "client!ss", name = "p", descriptor = "I")
	public final int anInt8318;

	@OriginalMember(owner = "client!ss", name = "u", descriptor = "I")
	public final int anInt8322;

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lclient!or;Lclient!ma;IIIIIIIIII)V")
	public Class23_Sub3(@OriginalArg(0) Class259 arg0, @OriginalArg(1) Class216 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt8318 = arg11;
		this.anInt8322 = arg10;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)Lclient!oh;")
	@Override
	public Class252 method6715() {
		return Static494.aClass252_16;
	}
}
