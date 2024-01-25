import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pg")
public final class Class7_Sub2 extends Class7 {

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
	private final int anInt4903;

	@OriginalMember(owner = "client!pg", name = "x", descriptor = "I")
	private final int anInt4910;

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
	private final int anInt4909;

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
	private final int anInt4906;

	@OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(IIIIIII)V")
	public Class7_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4903 = arg1;
		this.anInt4910 = arg0;
		this.anInt4909 = arg3;
		this.anInt4906 = arg2;
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(III)V")
	@Override
	public void method6054(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt4910 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt4906 >> 12;
		@Pc(32) int local32 = this.anInt4903 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt4909 * arg0 >> 12;
		Static213.method3823(local32, local25, local39, local10, super.anInt6834);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
	@Override
	public void method6053(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6051(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = this.anInt4910 * arg0 >> 12;
		@Pc(23) int local23 = this.anInt4906 * arg0 >> 12;
		@Pc(30) int local30 = this.anInt4903 * arg1 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt4909 >> 12;
		Static271.method4754(super.anInt6831, super.anInt6830, local23, local16, super.anInt6834, local37, local30);
	}
}
