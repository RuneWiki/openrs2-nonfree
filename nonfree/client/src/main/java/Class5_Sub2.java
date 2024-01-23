import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
	public int anInt375;

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
	public int anInt376;

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
	private int anInt374 = -32768;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(10) Class5_Sub3 local10 = Static128.method2147(this.anInt375).method2105(this.anInt376, 0, null);
		if (local10 != null) {
			local10.method2300(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt374 = local10.method2297();
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "()I")
	@Override
	public int method2297() {
		return this.anInt374;
	}
}
