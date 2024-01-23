import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class3_Sub3 extends Class3 {

	@OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
	private int anInt2579;

	@OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
	private int anInt2581;

	@OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
	private int anInt2572;

	@OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
	private int anInt2580;

	@OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
	private int anInt2571;

	@OriginalMember(owner = "client!jl", name = "w", descriptor = "I")
	private int anInt2577;

	@OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
	private int anInt2574;

	@OriginalMember(owner = "client!jl", name = "D", descriptor = "I")
	private int anInt2584;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2579 = arg1;
		this.anInt2581 = arg7;
		this.anInt2572 = arg2;
		this.anInt2580 = arg3;
		this.anInt2571 = arg0;
		this.anInt2577 = arg6;
		this.anInt2574 = arg5;
		this.anInt2584 = arg4;
	}

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "(III)V")
	@Override
	public void method3668(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(III)V")
	@Override
	public void method3667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)V")
	@Override
	public void method3663(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2571 >> 12;
		@Pc(17) int local17 = this.anInt2579 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt2572 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt2584 * arg0 >> 12;
		@Pc(38) int local38 = this.anInt2580 * arg1 >> 12;
		@Pc(45) int local45 = arg0 * this.anInt2577 >> 12;
		@Pc(52) int local52 = arg1 * this.anInt2574 >> 12;
		@Pc(67) int local67 = this.anInt2581 * arg1 >> 12;
		Static108.method1770(local10, local31, this.anInt4886, local38, local67, local52, local45, local17, local24);
	}
}
