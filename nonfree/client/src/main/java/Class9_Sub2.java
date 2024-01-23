import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ba")
public final class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
	public int anInt529;

	@OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
	public int anInt532;

	@OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
	private int anInt536 = -32768;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "()I")
	@Override
	public int method3587() {
		return this.anInt536;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIIIJILclient!nl;)V")
	@Override
	public void method3588(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class96_Sub1 arg10) {
		@Pc(13) Class9_Sub5 local13 = Static93.method2006(this.anInt529).method2740(null, -1, 0, this.anInt532, null, 0);
		if (local13 != null) {
			local13.method3588(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
			this.anInt536 = local13.method3587();
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}
}
