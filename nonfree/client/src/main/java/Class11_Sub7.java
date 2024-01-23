import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uk")
public final class Class11_Sub7 extends Class11 {

	@OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
	public int anInt5176;

	@OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
	public int anInt5178;

	@OriginalMember(owner = "client!uk", name = "q", descriptor = "I")
	private int anInt5179 = -32768;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "()I")
	@Override
	public int method4297() {
		return this.anInt5179;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIIIJILclient!dh;)V")
	@Override
	public void method4299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class22_Sub3 arg10) {
		@Pc(13) Class11_Sub1 local13 = Static69.method1330(this.anInt5178).method82(this.anInt5176, -1, null, 0, 0, null);
		if (local13 != null) {
			local13.method4299(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
			this.anInt5179 = local13.method4297();
		}
	}
}
