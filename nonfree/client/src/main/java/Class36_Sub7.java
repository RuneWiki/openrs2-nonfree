import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wj")
public final class Class36_Sub7 extends Class36 {

	@OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
	public int anInt6145;

	@OriginalMember(owner = "client!wj", name = "K", descriptor = "I")
	public int anInt6153;

	@OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
	private int anInt6147 = -32768;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "()I")
	@Override
	public int method4881() {
		return this.anInt6147;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIIIIJILclient!nl;)V")
	@Override
	public void method4878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class119_Sub1 arg10) {
		@Pc(17) Class36_Sub2 local17 = Static152.method2616(this.anInt6145).method3934(null, 0, this.anInt6153, 0, -1, null);
		if (local17 != null) {
			local17.method4878(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
			this.anInt6147 = local17.method4881();
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}
}
