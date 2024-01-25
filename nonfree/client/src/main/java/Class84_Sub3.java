import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public final class Class84_Sub3 extends Class84 {

	@OriginalMember(owner = "client!wv", name = "z", descriptor = "I")
	public final int anInt10356;

	@OriginalMember(owner = "client!wv", name = "x", descriptor = "I")
	public final int anInt10355;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!eaa;Lclient!cq;IIIIIIIIII)V")
	public Class84_Sub3(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class65 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt10356 = arg11;
		this.anInt10355 = arg10;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)Lclient!aca;")
	@Override
	public Class6 method8749() {
		return Static140.aClass6_10;
	}
}
