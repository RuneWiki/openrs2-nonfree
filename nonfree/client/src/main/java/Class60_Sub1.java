import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class60_Sub1 extends Class60 {

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
	private final int anInt2841;

	@OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
	private final int anInt2837;

	@OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
	private final int anInt2838;

	@OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
	private final int anInt2836;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IIIIIII)V")
	public Class60_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2841 = arg0;
		this.anInt2837 = arg2;
		this.anInt2838 = arg1;
		this.anInt2836 = arg3;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V")
	@Override
	public void method3640(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt2841 * arg1 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt2837 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt2838 >> 12;
		@Pc(35) int local35 = this.anInt2836 * arg0 >> 12;
		Static259.method3457(local35, local28, local21, super.anInt4587, local14, super.anInt4585, super.anInt4584);
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(III)V")
	@Override
	public void method3643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2841 >> 12;
		@Pc(17) int local17 = this.anInt2837 * arg0 >> 12;
		@Pc(33) int local33 = this.anInt2838 * arg1 >> 12;
		@Pc(40) int local40 = this.anInt2836 * arg1 >> 12;
		Static419.method5248(super.anInt4584, local33, super.anInt4585, local10, local40, local17);
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(III)V")
	@Override
	public void method3642(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt2841 >> 12;
		@Pc(23) int local23 = this.anInt2837 * arg1 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt2838 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt2836 >> 12;
		Static120.method1995(local37, super.anInt4587, local30, local10, local23);
	}
}
