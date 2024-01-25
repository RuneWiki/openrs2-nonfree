import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class130_Sub4 extends Class130 {

	@OriginalMember(owner = "client!ww", name = "q", descriptor = "I")
	private final int anInt11297;

	@OriginalMember(owner = "client!ww", name = "k", descriptor = "I")
	private final int anInt11303;

	@OriginalMember(owner = "client!ww", name = "m", descriptor = "I")
	private final int anInt11298;

	@OriginalMember(owner = "client!ww", name = "j", descriptor = "I")
	private final int anInt11300;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(IIIIII)V")
	public Class130_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt11297 = arg3;
		this.anInt11303 = arg2;
		this.anInt11298 = arg1;
		this.anInt11300 = arg0;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(III)V")
	@Override
	public void method9435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt11300 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt11303 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt11298 >> 12;
		@Pc(39) int local39 = this.anInt11297 * arg1 >> 12;
		Static120.method2066(super.anInt11292, local32, local10, local17, local39);
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIB)V")
	@Override
	public void method9436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(III)V")
	@Override
	public void method9438(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
