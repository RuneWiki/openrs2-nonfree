import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public final class Class119_Sub1_Sub1 extends Class119_Sub1 {

	@OriginalMember(owner = "client!ge", name = "H", descriptor = "I")
	public final int anInt3106;

	@OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lclient!nha;Lclient!jn;IIIIIIIIIIIIII)V")
	public Class119_Sub1_Sub1(@OriginalArg(0) Class245 arg0, @OriginalArg(1) Class183 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
		this.anInt3106 = arg15;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)Lclient!vj;")
	@Override
	public Class365 method9019() {
		return Static516.aClass365_12;
	}
}
