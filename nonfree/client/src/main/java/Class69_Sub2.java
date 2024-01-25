import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public final class Class69_Sub2 extends Class69 {

	@OriginalMember(owner = "client!uv", name = "v", descriptor = "I")
	public final int anInt9567;

	@OriginalMember(owner = "client!uv", name = "t", descriptor = "I")
	public final int anInt9565;

	@OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lclient!vfa;Lclient!rq;IIIIIIIIII)V")
	public Class69_Sub2(@OriginalArg(0) Class361 arg0, @OriginalArg(1) Class306 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		this.anInt9567 = arg11;
		this.anInt9565 = arg10;
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)Lclient!ag;")
	@Override
	public Class8 method8040() {
		return Static37.aClass8_2;
	}
}
