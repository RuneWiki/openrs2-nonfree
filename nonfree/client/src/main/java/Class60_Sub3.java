import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class60_Sub3 extends Class60 {

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
	private final int anInt4459;

	@OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
	private final int anInt4462;

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
	private final int anInt4467;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
	private final int anInt4461;

	@OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
	private final int anInt4466;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
	private final int anInt4458;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
	private final int anInt4460;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
	private final int anInt4463;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class60_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt4459 = arg6;
		this.anInt4462 = arg3;
		this.anInt4467 = arg2;
		this.anInt4461 = arg4;
		this.anInt4466 = arg1;
		this.anInt4458 = arg5;
		this.anInt4460 = arg7;
		this.anInt4463 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
	@Override
	public void method3640(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)V")
	@Override
	public void method3642(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(III)V")
	@Override
	public void method3643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt4463 >> 12;
		@Pc(17) int local17 = this.anInt4466 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt4467 >> 12;
		@Pc(31) int local31 = this.anInt4462 * arg1 >> 12;
		@Pc(46) int local46 = this.anInt4461 * arg0 >> 12;
		@Pc(53) int local53 = arg1 * this.anInt4458 >> 12;
		@Pc(60) int local60 = arg0 * this.anInt4459 >> 12;
		@Pc(67) int local67 = this.anInt4460 * arg1 >> 12;
		Static258.method3432(local31, local60, local24, local17, local46, local67, local10, super.anInt4585, local53);
	}
}
