import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class53_Sub2 extends Class53 {

	@OriginalMember(owner = "client!he", name = "u", descriptor = "I")
	public int anInt2166;

	@OriginalMember(owner = "client!he", name = "w", descriptor = "I")
	public int anInt2168;

	@OriginalMember(owner = "client!he", name = "q", descriptor = "I")
	private int anInt2163 = -32768;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "()I")
	@Override
	public int method3850() {
		return this.anInt2163;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIIJILclient!ne;)V")
	@Override
	public void method3842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class20_Sub3 arg10) {
		@Pc(17) Class53_Sub4 local17 = Static287.method4398(this.anInt2168).method4160(0, this.anInt2166, -1, null, null, 0);
		if (local17 != null) {
			local17.method3842(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
			this.anInt2163 = local17.method3850();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3843(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}
}
