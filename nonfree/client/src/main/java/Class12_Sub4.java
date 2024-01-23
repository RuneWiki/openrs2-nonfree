import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class12_Sub4 extends Class12 {

	@OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
	public int anInt2878;

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
	public int anInt2883;

	@OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
	private int anInt2887 = -32768;

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "()I")
	@Override
	public int method3355() {
		return this.anInt2887;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIIIIIJILclient!id;)V")
	@Override
	public void method3357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class67_Sub1 arg10) {
		@Pc(13) Class12_Sub2 local13 = Static277.method4117(this.anInt2878).method3898(-1, 0, null, null, 0, this.anInt2883);
		if (local13 != null) {
			local13.method3357(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
			this.anInt2887 = local13.method3355();
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3353(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}
}
