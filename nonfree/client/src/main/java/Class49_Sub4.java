import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class49_Sub4 extends Class49 {

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
	private final int anInt5604;

	@OriginalMember(owner = "client!sa", name = "z", descriptor = "I")
	private final int anInt5609;

	@OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
	private final int anInt5610;

	@OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
	private final int anInt5598;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIIIII)V")
	public Class49_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5604 = arg2;
		this.anInt5609 = arg1;
		this.anInt5610 = arg0;
		this.anInt5598 = arg3;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)V")
	@Override
	public void method4887(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "(III)V")
	@Override
	public void method4890(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt5610 >> 12;
		@Pc(17) int local17 = this.anInt5604 * arg0 >> 12;
		@Pc(28) int local28 = this.anInt5609 * arg1 >> 12;
		@Pc(35) int local35 = this.anInt5598 * arg1 >> 12;
		Static89.method1433(local28, super.anInt5596, local10, super.anInt5595, local35, local17, super.anInt5597);
	}

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(III)V")
	@Override
	public void method4891(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5610 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt5604 >> 12;
		@Pc(24) int local24 = this.anInt5609 * arg1 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt5598 >> 12;
		Static66.method1210(local10, local31, super.anInt5597, local17, local24);
	}
}
