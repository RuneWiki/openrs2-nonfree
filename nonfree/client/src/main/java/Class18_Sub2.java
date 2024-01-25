import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public final class Class18_Sub2 extends Class18 {

	@OriginalMember(owner = "client!io", name = "o", descriptor = "I")
	public final int anInt4272;

	@OriginalMember(owner = "client!io", name = "l", descriptor = "I")
	public final int anInt4269;

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lclient!tl;Lclient!pd;IIIIIIIII)V")
	public Class18_Sub2(@OriginalArg(0) Class319 arg0, @OriginalArg(1) Class247 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt4272 = arg9;
		this.anInt4269 = arg10;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(B)Lclient!jd;")
	@Override
	public Class153 method6332() {
		return Static558.aClass153_12;
	}
}
