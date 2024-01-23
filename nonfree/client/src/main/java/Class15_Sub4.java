import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class15_Sub4 extends Class15 {

	@OriginalMember(owner = "client!ka", name = "w", descriptor = "I")
	private final int anInt2297;

	@OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
	private final int anInt2293;

	@OriginalMember(owner = "client!ka", name = "C", descriptor = "I")
	private final int anInt2302;

	@OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
	private final int anInt2292;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIIIII)V")
	public Class15_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2297 = arg0;
		this.anInt2293 = arg2;
		this.anInt2302 = arg1;
		this.anInt2292 = arg3;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
	@Override
	public void method1757(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 * this.anInt2297 >> 12;
		@Pc(13) int local13 = arg1 * this.anInt2293 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt2302 >> 12;
		@Pc(39) int local39 = this.anInt2292 * arg0 >> 12;
		Static27.method512(super.anInt2287, local39, local13, local6, local32);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBI)V")
	@Override
	public void method1760(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt2297 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt2293 >> 12;
		@Pc(24) int local24 = this.anInt2302 * arg0 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt2292 >> 12;
		Static30.method1680(local10, super.anInt2287, local17, super.anInt2289, local31, local24, super.anInt2283);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(BII)V")
	@Override
	public void method1765(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2293 * arg1 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt2297 >> 12;
		@Pc(28) int local28 = this.anInt2302 * arg0 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt2292 >> 12;
		Static92.method1530(local10, local35, local21, super.anInt2289, local28, super.anInt2283);
	}
}
