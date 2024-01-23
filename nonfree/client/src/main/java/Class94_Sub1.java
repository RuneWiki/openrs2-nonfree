import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class94_Sub1 extends Class94 {

	@OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
	private int anInt2615;

	@OriginalMember(owner = "client!jl", name = "D", descriptor = "I")
	private int anInt2618;

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
	private int anInt2604;

	@OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
	private int anInt2610;

	@OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
	private int anInt2617;

	@OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
	private int anInt2606;

	@OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
	private int anInt2616;

	@OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
	private int anInt2605;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class94_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2615 = arg3;
		this.anInt2618 = arg6;
		this.anInt2604 = arg7;
		this.anInt2610 = arg1;
		this.anInt2617 = arg0;
		this.anInt2606 = arg2;
		this.anInt2616 = arg4;
		this.anInt2605 = arg5;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIB)V")
	@Override
	public void method2966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IBI)V")
	@Override
	public void method2964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZI)V")
	@Override
	public void method2965(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt2617 * arg0 >> 12;
		@Pc(13) int local13 = this.anInt2610 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt2615 * arg1 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt2616 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt2605 >> 12;
		@Pc(51) int local51 = arg1 * this.anInt2604 >> 12;
		@Pc(58) int local58 = this.anInt2618 * arg0 >> 12;
		@Pc(65) int local65 = this.anInt2606 * arg0 >> 12;
		Static260.method4032(this.anInt3373, local24, local58, local51, local31, local6, local65, local13, local38);
	}
}
