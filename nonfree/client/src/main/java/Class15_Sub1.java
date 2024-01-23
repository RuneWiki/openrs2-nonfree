import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
	public int anInt462;

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
	public int anInt463;

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
	private int anInt461 = -32768;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "()I")
	@Override
	public int method4274() {
		return this.anInt461;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIIIJILclient!gl;)V")
	@Override
	public void method4272(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub2 arg10) {
		@Pc(13) Class15_Sub5 local13 = Static87.method1546(this.anInt462).method1639(0, 0, null, this.anInt463, null, -1);
		if (local13 != null) {
			local13.method4272(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
			this.anInt461 = local13.method4274();
		}
	}
}
