import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public final class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!dw", name = "q", descriptor = "I")
	public final int anInt2447;

	@OriginalMember(owner = "client!dw", name = "s", descriptor = "I")
	public final int anInt2449;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Lclient!eda;Lclient!cga;IIIIIIIII)V")
	public Class6_Sub3(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt2447 = arg10;
		this.anInt2449 = arg9;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)Lclient!hr;")
	@Override
	public Class146 method8713() {
		return Static428.aClass146_4;
	}
}
