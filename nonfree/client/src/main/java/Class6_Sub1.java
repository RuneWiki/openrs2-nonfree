import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
	public final int anInt1274;

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
	public final int anInt1277;

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!eda;Lclient!cga;IIIIIIIIII)V")
	public Class6_Sub1(@OriginalArg(0) Class83 arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt1274 = arg10;
		this.anInt1277 = arg11;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Lclient!hr;")
	@Override
	public Class146 method8713() {
		return Static506.aClass146_8;
	}
}
