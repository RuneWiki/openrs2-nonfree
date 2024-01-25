import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!bv", name = "j", descriptor = "I")
	private final int anInt834;

	@OriginalMember(owner = "client!bv", name = "k", descriptor = "I")
	private final int anInt835;

	@OriginalMember(owner = "client!bv", name = "o", descriptor = "I")
	private final int anInt839;

	@OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
	private final int anInt838;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(IIIIIII)V")
	public Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt834 = arg1;
		this.anInt835 = arg0;
		this.anInt839 = arg3;
		this.anInt838 = arg2;
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(III)V")
	@Override
	public void method8485(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt835 >> 12;
		@Pc(25) int local25 = this.anInt838 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt834 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt839 >> 12;
		Static426.method6403(local10, local39, super.anInt9991, local25, local32, super.anInt9988);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8489(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg0 * this.anInt835 >> 12;
		@Pc(23) int local23 = arg0 * this.anInt838 >> 12;
		@Pc(30) int local30 = this.anInt834 * arg1 >> 12;
		@Pc(37) int local37 = this.anInt839 * arg1 >> 12;
		Static156.method2379(local37, local16, local23, local30, super.anInt9989);
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(III)V")
	@Override
	public void method8487(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt835 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt838 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt834 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt839 >> 12;
		Static162.method2434(local17, super.anInt9991, local10, local35, super.anInt9988, local24, super.anInt9989);
	}
}
