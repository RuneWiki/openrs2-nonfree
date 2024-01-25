import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class86_Sub3 extends Class86 {

	@OriginalMember(owner = "client!k", name = "f", descriptor = "I")
	private final int anInt5179;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "I")
	private final int anInt5178;

	@OriginalMember(owner = "client!k", name = "j", descriptor = "I")
	private final int anInt5182;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "I")
	private final int anInt5183;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(IIIIIII)V")
	public Class86_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5179 = arg2;
		this.anInt5178 = arg3;
		this.anInt5182 = arg0;
		this.anInt5183 = arg1;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III)V")
	@Override
	public void method9263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(III)V")
	@Override
	public void method9265(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt5182 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt5179 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt5183 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt5178 >> 12;
		Static485.method6451(local10, super.anInt11134, local29, local22, local36);
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(III)V")
	@Override
	public void method9264(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5182 * arg0 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt5179 >> 12;
		@Pc(28) int local28 = this.anInt5183 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt5178 >> 12;
		Static669.method9259(super.anInt11131, local35, local10, super.anInt11132, local28, super.anInt11134, local21);
	}
}
