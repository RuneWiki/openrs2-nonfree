import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class82_Sub2 extends Class82 {

	@OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
	private final int anInt5562;

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
	private final int anInt5570;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
	private final int anInt5560;

	@OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
	private final int anInt5566;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IIIIII)V")
	public Class82_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt5562 = arg2;
		this.anInt5570 = arg0;
		this.anInt5560 = arg3;
		this.anInt5566 = arg1;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5570 >> 12;
		@Pc(17) int local17 = this.anInt5562 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt5566 * arg0 >> 12;
		@Pc(39) int local39 = this.anInt5560 * arg0 >> 12;
		Static22.method610(local39, local17, local10, local24, super.anInt6503);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
	@Override
	public void method5120(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZI)V")
	@Override
	public void method5121(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
