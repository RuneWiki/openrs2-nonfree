import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class49_Sub2 extends Class49 {

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "I")
	private final int anInt3926;

	@OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
	private final int anInt3927;

	@OriginalMember(owner = "client!mo", name = "v", descriptor = "I")
	private final int anInt3935;

	@OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
	private final int anInt3929;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(IIIIIII)V")
	public Class49_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt3926 = arg1;
		this.anInt3927 = arg0;
		this.anInt3935 = arg2;
		this.anInt3929 = arg3;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)V")
	@Override
	public void method4887(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3927 * arg1 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt3935 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt3926 >> 12;
		@Pc(35) int local35 = this.anInt3929 * arg0 >> 12;
		Static336.method5590(local10, local21, local28, super.anInt5596, super.anInt5595, local35);
	}

	@OriginalMember(owner = "client!mo", name = "c", descriptor = "(III)V")
	@Override
	public void method4891(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt3927 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt3935 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt3926 >> 12;
		@Pc(38) int local38 = this.anInt3929 * arg1 >> 12;
		Static89.method1432(local24, local17, local38, local10, super.anInt5597);
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(III)V")
	@Override
	public void method4890(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = this.anInt3927 * arg0 >> 12;
		@Pc(21) int local21 = this.anInt3935 * arg0 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt3926 >> 12;
		@Pc(35) int local35 = this.anInt3929 * arg1 >> 12;
		Static252.method4534(super.anInt5596, super.anInt5595, super.anInt5597, local35, local14, local28, local21);
	}
}
