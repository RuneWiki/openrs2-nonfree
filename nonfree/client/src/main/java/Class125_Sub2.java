import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class125_Sub2 extends Class125 {

	@OriginalMember(owner = "client!qu", name = "m", descriptor = "I")
	private final int anInt8054;

	@OriginalMember(owner = "client!qu", name = "k", descriptor = "I")
	private final int anInt8055;

	@OriginalMember(owner = "client!qu", name = "q", descriptor = "I")
	private final int anInt8059;

	@OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
	private final int anInt8053;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(IIIIIII)V")
	public Class125_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt8054 = arg0;
		this.anInt8055 = arg3;
		this.anInt8059 = arg1;
		this.anInt8053 = arg2;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg0 * this.anInt8054 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt8053 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt8059 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt8055 >> 12;
		Static266.method4312(local22, super.anInt9674, super.anInt9673, local15, super.anInt9675, local29, local36);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt8054 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt8053 * arg0 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt8059 >> 12;
		@Pc(42) int local42 = this.anInt8055 * arg1 >> 12;
		Static606.method8314(local17, super.anInt9675, local35, local10, super.anInt9673, local42);
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)V")
	@Override
	public void method8246(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt8054 >> 12;
		@Pc(17) int local17 = this.anInt8053 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt8059 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt8055 >> 12;
		Static319.method4903(super.anInt9674, local31, local17, local10, local24);
	}
}
