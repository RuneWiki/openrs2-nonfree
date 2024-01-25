import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class114_Sub3 extends Class114 {

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
	private final int anInt4465;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
	private final int anInt4470;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
	private final int anInt4471;

	@OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
	private final int anInt4467;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIII)V")
	public Class114_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt4465 = arg1;
		this.anInt4470 = arg3;
		this.anInt4471 = arg0;
		this.anInt4467 = arg2;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
	@Override
	public void method4461(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * this.anInt4471 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt4467 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt4465 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt4470 >> 12;
		Static433.method3964(local14, local35, local21, super.anInt5078, local28);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIB)V")
	@Override
	public void method4462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)V")
	@Override
	public void method4466(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
