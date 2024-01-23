import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "I")
	public int anInt1196;

	@OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
	public int anInt1198;

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
	private int anInt1199 = -32768;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method3495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		@Pc(14) Class20_Sub5 local14 = Static16.method227(this.anInt1196).method1957(null, 0, this.anInt1198);
		if (local14 != null) {
			local14.method3495(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
			this.anInt1199 = local14.method3494();
		}
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "()I")
	@Override
	public int method3494() {
		return this.anInt1199;
	}
}
