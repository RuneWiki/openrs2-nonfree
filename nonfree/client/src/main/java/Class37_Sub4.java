import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wfa")
public final class Class37_Sub4 extends Class37 {

	@OriginalMember(owner = "client!wfa", name = "t", descriptor = "I")
	private final int anInt9386;

	@OriginalMember(owner = "client!wfa", name = "u", descriptor = "I")
	private final int anInt9387;

	@OriginalMember(owner = "client!wfa", name = "h", descriptor = "I")
	private final int anInt9379;

	@OriginalMember(owner = "client!wfa", name = "i", descriptor = "I")
	private final int anInt9380;

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(IIIIIII)V")
	public Class37_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt9386 = arg0;
		this.anInt9387 = arg3;
		this.anInt9379 = arg2;
		this.anInt9380 = arg1;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BII)V")
	@Override
	public void method7780(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * this.anInt9386 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt9379 >> 12;
		@Pc(28) int local28 = this.anInt9380 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt9387 >> 12;
		Static325.method4708(super.anInt9376, local21, super.anInt9375, super.anInt9377, local14, local28, local35);
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(III)V")
	@Override
	public void method7782(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt9386 * arg0 >> 12;
		@Pc(25) int local25 = this.anInt9379 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt9380 * arg1 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt9387 >> 12;
		Static168.method3020(super.anInt9377, local10, local25, local39, local32);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(III)V")
	@Override
	public void method7778(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
