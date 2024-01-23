import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class14_Sub5 extends Class14 {

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
	public int anInt2754;

	@OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
	public int anInt2755;

	@OriginalMember(owner = "client!ja", name = "v", descriptor = "I")
	private int anInt2758 = -32768;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIIIIJILclient!sa;)V")
	@Override
	public void method4097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class86_Sub1 arg10) {
		@Pc(17) Class14_Sub6 local17 = Static112.method2060(this.anInt2755).method1260(0, this.anInt2754, null, null, 0, -1);
		if (local17 != null) {
			local17.method4097(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
			this.anInt2758 = local17.method4091();
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "()I")
	@Override
	public int method4091() {
		return this.anInt2758;
	}
}
