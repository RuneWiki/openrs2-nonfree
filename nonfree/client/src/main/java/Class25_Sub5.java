import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class25_Sub5 extends Class25 {

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
	public int anInt5781;

	@OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
	public int anInt5784;

	@OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
	private int anInt5793 = -32768;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4767(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "()I")
	@Override
	public int method4773() {
		return this.anInt5793;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIIIIJILclient!ll;)V")
	@Override
	public void method4768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class95_Sub1 arg10) {
		@Pc(13) Class25_Sub2 local13 = Static238.method4099(this.anInt5784).method4018(0, null, this.anInt5781, null, 0, -1);
		if (local13 != null) {
			local13.method4768(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
			this.anInt5793 = local13.method4773();
		}
	}
}
