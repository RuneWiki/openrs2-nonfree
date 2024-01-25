import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public final class Class108_Sub2 extends Class108 {

	@OriginalMember(owner = "client!pv", name = "s", descriptor = "I")
	public final int anInt7799;

	@OriginalMember(owner = "client!pv", name = "r", descriptor = "I")
	public final int anInt7798;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!pe;Lclient!op;IIIIIIIIII)V")
	public Class108_Sub2(@OriginalArg(0) Class258 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt7799 = arg10;
		this.anInt7798 = arg11;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)Lclient!sq;")
	@Override
	public Class307 method8175() {
		return Static325.aClass307_14;
	}
}
