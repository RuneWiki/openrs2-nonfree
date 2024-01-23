import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class35_Sub4 extends Class35 {

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
	private int anInt5405;

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
	private int anInt5409;

	@OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
	private int anInt5414;

	@OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
	private int anInt5416;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(IIIIIII)V")
	public Class35_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5405 = arg3;
		this.anInt5409 = arg2;
		this.anInt5414 = arg1;
		this.anInt5416 = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(III)V")
	@Override
	public void method4143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5405 >> 12;
		@Pc(17) int local17 = this.anInt5416 * arg0 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt5409 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt5414 >> 12;
		Static41.method753(local17, this.anInt5404, local10, local31, local24);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
	@Override
	public void method4139(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method4140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1 * this.anInt5416 >> 12;
		@Pc(22) int local22 = this.anInt5414 * arg0 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt5409 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt5405 >> 12;
		Static101.method1643(local36, this.anInt5404, this.anInt5402, local29, local15, local22, this.anInt5399);
	}
}
