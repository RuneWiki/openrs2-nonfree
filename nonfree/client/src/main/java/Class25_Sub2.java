import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class25_Sub2 extends Class25 {

	@OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
	private int anInt3048;

	@OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
	private int anInt3042;

	@OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
	private int anInt3036;

	@OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
	private int anInt3038;

	@OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
	private int anInt3046;

	@OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
	private int anInt3044;

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
	private int anInt3034;

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
	private int anInt3033;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class25_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt3048 = arg4;
		this.anInt3042 = arg3;
		this.anInt3036 = arg6;
		this.anInt3038 = arg5;
		this.anInt3046 = arg2;
		this.anInt3044 = arg1;
		this.anInt3034 = arg7;
		this.anInt3033 = arg0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)V")
	@Override
	public void method3008(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZI)V")
	@Override
	public void method3013(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt3033 * arg0 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt3044 >> 12;
		@Pc(24) int local24 = this.anInt3048 * arg0 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt3042 >> 12;
		@Pc(42) int local42 = arg1 * this.anInt3034 >> 12;
		@Pc(49) int local49 = arg0 * this.anInt3036 >> 12;
		@Pc(56) int local56 = arg0 * this.anInt3046 >> 12;
		@Pc(63) int local63 = this.anInt3038 * arg1 >> 12;
		Static174.method2989(local63, local31, local24, local6, local42, local49, local56, local17, super.anInt4038);
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(III)V")
	@Override
	public void method3012(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
