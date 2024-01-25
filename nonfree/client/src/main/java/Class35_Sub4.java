import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public final class Class35_Sub4 extends Class35 {

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
	private final int anInt6707;

	@OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
	private final int anInt6708;

	@OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
	private final int anInt6717;

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
	private final int anInt6712;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(IIIIIII)V")
	public Class35_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6707 = arg1;
		this.anInt6708 = arg3;
		this.anInt6717 = arg2;
		this.anInt6712 = arg0;
	}

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(III)V")
	@Override
	public void method5622(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt6712 >> 12;
		@Pc(17) int local17 = this.anInt6717 * arg1 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt6707 >> 12;
		@Pc(35) int local35 = this.anInt6708 * arg0 >> 12;
		Static314.method5240(local10, local17, local28, local35, super.anInt6699, super.anInt6704);
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(III)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt6712 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt6717 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt6707 >> 12;
		@Pc(37) int local37 = this.anInt6708 * arg1 >> 12;
		Static62.method1010(super.anInt6704, local10, local24, super.anInt6699, local17, local37, super.anInt6706);
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)V")
	@Override
	public void method5617(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt6712 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt6717 * arg1 >> 12;
		@Pc(29) int local29 = this.anInt6707 * arg0 >> 12;
		@Pc(36) int local36 = this.anInt6708 * arg0 >> 12;
		Static277.method4643(local29, local17, local10, super.anInt6706, local36);
	}
}
