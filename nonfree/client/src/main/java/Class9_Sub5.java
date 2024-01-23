import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class9_Sub5 extends Class9 {

	@OriginalMember(owner = "client!g", name = "z", descriptor = "I")
	public int anInt1521;

	@OriginalMember(owner = "client!g", name = "J", descriptor = "I")
	public int anInt1525;

	@OriginalMember(owner = "client!g", name = "v", descriptor = "I")
	private int anInt1518 = -32768;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "()I")
	@Override
	public int method2902() {
		return this.anInt1518;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(14) Class9_Sub2 local14 = Static191.method2990(this.anInt1521).method2298(this.anInt1525, 0, null);
		if (local14 != null) {
			local14.method2903(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt1518 = local14.method2902();
		}
	}
}
