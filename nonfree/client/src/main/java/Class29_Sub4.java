import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class29_Sub4 extends Class29 {

	@OriginalMember(owner = "client!sr", name = "r", descriptor = "I")
	private final int anInt5724;

	@OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
	private final int anInt5720;

	@OriginalMember(owner = "client!sr", name = "l", descriptor = "I")
	private final int anInt5719;

	@OriginalMember(owner = "client!sr", name = "n", descriptor = "I")
	private final int anInt5721;

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(IIIIIII)V")
	public Class29_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5724 = arg2;
		this.anInt5720 = arg0;
		this.anInt5719 = arg3;
		this.anInt5721 = arg1;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)V")
	@Override
	public void method5055(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt5720 * arg0 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt5724 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt5721 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt5719 >> 12;
		Static251.method4402(local25, local32, super.anInt5715, local39, local18);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt5720 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt5724 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt5721 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt5719 >> 12;
		Static37.method868(local28, super.anInt5710, local17, super.anInt5716, local35, local10);
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(IIB)V")
	@Override
	public void method5053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = this.anInt5720 * arg1 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt5724 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt5721 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt5719 >> 12;
		Static147.method2739(super.anInt5716, super.anInt5715, local28, super.anInt5710, local14, local35, local21);
	}
}
