import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class60_Sub4 extends Class60 {

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
	private final int anInt4594;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
	private final int anInt4592;

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "I")
	private final int anInt4591;

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
	private final int anInt4596;

	static {
		new Class55(null, "Dieses System darf nicht missbraucht werden!", null, null);
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(IIIIIII)V")
	public Class60_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4594 = arg3;
		this.anInt4592 = arg1;
		this.anInt4591 = arg2;
		this.anInt4596 = arg0;
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(III)V")
	@Override
	public void method3643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)V")
	@Override
	public void method3640(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt4596 * arg1 >> 12;
		@Pc(25) int local25 = this.anInt4591 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt4592 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt4594 >> 12;
		Static96.method1688(super.anInt4587, local39, super.anInt4584, super.anInt4585, local25, local18, local32);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(III)V")
	@Override
	public void method3642(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4596 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt4591 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt4592 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt4594 >> 12;
		Static112.method1923(local37, super.anInt4587, local17, local10, local24);
	}
}
