import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class130_Sub2 extends Class130 {

	@OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
	private final int anInt9301;

	@OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
	private final int anInt9302;

	@OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
	private final int anInt9299;

	@OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
	private final int anInt9298;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(IIIIIII)V")
	public Class130_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt9301 = arg3;
		this.anInt9302 = arg0;
		this.anInt9299 = arg2;
		this.anInt9298 = arg1;
	}

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(III)V")
	@Override
	public void method9438(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) int local20 = this.anInt9302 * arg1 >> 12;
		@Pc(27) int local27 = arg1 * this.anInt9299 >> 12;
		@Pc(34) int local34 = this.anInt9298 * arg0 >> 12;
		@Pc(41) int local41 = arg0 * this.anInt9301 >> 12;
		Static228.method7714(local20, local34, local41, super.anInt11290, local27);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)V")
	@Override
	public void method9435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) int local20 = arg0 * this.anInt9302 >> 12;
		@Pc(27) int local27 = this.anInt9299 * arg0 >> 12;
		@Pc(34) int local34 = arg1 * this.anInt9298 >> 12;
		@Pc(41) int local41 = arg1 * this.anInt9301 >> 12;
		Static553.method7781(local20, super.anInt11292, local27, local34, local41, super.anInt11294);
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIB)V")
	@Override
	public void method9436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt9302 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt9299 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt9298 >> 12;
		@Pc(39) int local39 = this.anInt9301 * arg0 >> 12;
		Static423.method6244(local10, super.anInt11294, local39, local32, super.anInt11290, local17, super.anInt11292);
	}
}
