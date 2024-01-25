import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public final class Class175_Sub2 extends Class175 {

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "I")
	public final int anInt5684;

	@OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
	public final int anInt5686;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!tl;Lclient!fn;IIIIIIIIII)V")
	public Class175_Sub2(@OriginalArg(0) Class314 arg0, @OriginalArg(1) Class103 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt5684 = arg11;
		this.anInt5686 = arg10;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Lclient!tca;")
	@Override
	public Class307 method7827() {
		return Static128.aClass307_5;
	}
}
