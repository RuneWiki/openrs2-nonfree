import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class6_Sub7 extends Class6 {

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
	public int anInt4998;

	@OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
	public int anInt4999;

	@OriginalMember(owner = "client!sf", name = "x", descriptor = "I")
	private int anInt5001 = -32768;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIIIIJILclient!pe;)V")
	@Override
	public void method3838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class91_Sub1 arg10) {
		@Pc(17) Class6_Sub2 local17 = Static183.method4458(this.anInt4998).method2682(null, 0, null, 0, this.anInt4999, -1);
		if (local17 != null) {
			local17.method3838(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
			this.anInt5001 = local17.method3833();
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "()I")
	@Override
	public int method3833() {
		return this.anInt5001;
	}
}
