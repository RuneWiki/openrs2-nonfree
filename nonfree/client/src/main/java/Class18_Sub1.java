import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public final class Class18_Sub1 extends Class18 {

	@OriginalMember(owner = "client!eo", name = "l", descriptor = "I")
	public final int anInt2820;

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
	public final int anInt2821;

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lclient!tl;Lclient!pd;IIIIIIIIII)V")
	public Class18_Sub1(@OriginalArg(0) Class319 arg0, @OriginalArg(1) Class247 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt2820 = arg10;
		this.anInt2821 = arg11;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)Lclient!jd;")
	@Override
	public Class153 method6332() {
		return Static422.aClass153_9;
	}
}
