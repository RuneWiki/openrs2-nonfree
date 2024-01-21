import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class5_Sub7 extends Class5 {

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
	public int anInt4083;

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
	public int anInt4089;

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
	private int anInt4086 = -32768;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(14) Class5_Sub1 local14 = Static168.method2886(this.anInt4089).method3247(this.anInt4083, 0, null);
		if (local14 != null) {
			local14.method3164(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt4086 = local14.method3163();
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "()I")
	@Override
	public int method3163() {
		return this.anInt4086;
	}
}
