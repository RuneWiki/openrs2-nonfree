import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class56_Sub1 extends Class56 {

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
	private final int anInt1500;

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
	private final int anInt1499;

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
	private final int anInt1503;

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
	private final int anInt1496;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(IIIIIII)V")
	public Class56_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1500 = arg0;
		this.anInt1499 = arg2;
		this.anInt1503 = arg3;
		this.anInt1496 = arg1;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method4857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) int local16 = this.anInt1500 * arg1 >> 12;
		@Pc(23) int local23 = arg1 * this.anInt1499 >> 12;
		@Pc(30) int local30 = this.anInt1496 * arg0 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt1503 >> 12;
		Static520.method7714(super.anInt5404, local16, local30, local37, local23, super.anInt5408);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V")
	@Override
	public void method4856(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt1500 * arg1 >> 12;
		@Pc(25) int local25 = this.anInt1499 * arg1 >> 12;
		@Pc(32) int local32 = this.anInt1496 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt1503 * arg0 >> 12;
		Static152.method2229(super.anInt5404, local32, local39, local10, local25, super.anInt5408, super.anInt5406);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4858(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt1500 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt1499 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt1496 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt1503 >> 12;
		Static50.method843(super.anInt5406, local17, local24, local31, local10);
	}
}
