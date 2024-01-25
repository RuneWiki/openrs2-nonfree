import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
	private final int anInt749;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	private final int anInt748;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
	private final int anInt746;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
	private final int anInt744;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIII)V")
	public Class22_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt749 = arg3;
		this.anInt748 = arg1;
		this.anInt746 = arg2;
		this.anInt744 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BII)V")
	@Override
	public void method7939(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = this.anInt744 * arg1 >> 12;
		@Pc(25) int local25 = arg1 * this.anInt746 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt748 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt749 >> 12;
		Static322.method5566(local25, super.anInt9186, super.anInt9185, super.anInt9188, local18, local32, local39);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7938(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt744 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt746 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt748 >> 12;
		@Pc(31) int local31 = this.anInt749 * arg0 >> 12;
		Static281.method4927(local17, local31, local10, local24, super.anInt9186);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V")
	@Override
	public void method7937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt744 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt746 >> 12;
		@Pc(24) int local24 = this.anInt748 * arg0 >> 12;
		@Pc(35) int local35 = this.anInt749 * arg0 >> 12;
		Static407.method6493(super.anInt9185, local35, local17, local10, local24, super.anInt9188);
	}
}
