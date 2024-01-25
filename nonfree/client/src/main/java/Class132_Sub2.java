import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public final class Class132_Sub2 extends Class132 {

	@OriginalMember(owner = "client!rj", name = "C", descriptor = "I")
	public final int anInt8281;

	@OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
	public final int anInt8280;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lclient!jk;Lclient!tda;IIIIIIIIII)V")
	public Class132_Sub2(@OriginalArg(0) Class189 arg0, @OriginalArg(1) Class346 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt8281 = arg10;
		this.anInt8280 = arg11;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)Lclient!wh;")
	@Override
	public Class392 method8802() {
		return Static439.aClass392_6;
	}
}
