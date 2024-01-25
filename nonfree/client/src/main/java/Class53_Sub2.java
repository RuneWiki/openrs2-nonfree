import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class53_Sub2 extends Class53 {

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
	private final int anInt4198;

	@OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
	private final int anInt4199;

	@OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
	private final int anInt4201;

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
	private final int anInt4202;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(IIIIIII)V")
	public Class53_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4198 = arg3;
		this.anInt4199 = arg1;
		this.anInt4201 = arg0;
		this.anInt4202 = arg2;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	@Override
	public void method8328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt4201 >> 12;
		@Pc(22) int local22 = this.anInt4202 * arg1 >> 12;
		@Pc(29) int local29 = this.anInt4199 * arg0 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt4198 >> 12;
		Static537.method7465(super.anInt9772, local10, super.anInt9767, super.anInt9768, local29, local36, local22);
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)V")
	@Override
	public void method8329(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt4201 >> 12;
		@Pc(25) int local25 = arg0 * this.anInt4202 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt4199 >> 12;
		@Pc(39) int local39 = this.anInt4198 * arg1 >> 12;
		Static7.method99(local25, super.anInt9772, local32, super.anInt9768, local18, local39);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8322(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt4201 >> 12;
		@Pc(21) int local21 = this.anInt4202 * arg1 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt4199 >> 12;
		@Pc(35) int local35 = this.anInt4198 * arg0 >> 12;
		Static325.method4948(super.anInt9767, local35, local10, local21, local28);
	}
}
