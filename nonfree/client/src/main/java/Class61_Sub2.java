import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class61_Sub2 extends Class61 {

	@OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
	private final int anInt2219;

	@OriginalMember(owner = "client!fs", name = "q", descriptor = "I")
	private final int anInt2217;

	@OriginalMember(owner = "client!fs", name = "m", descriptor = "I")
	private final int anInt2213;

	@OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
	private final int anInt2211;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(IIIIIII)V")
	public Class61_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2219 = arg0;
		this.anInt2217 = arg1;
		this.anInt2213 = arg3;
		this.anInt2211 = arg2;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(III)V")
	@Override
	public void method4108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 * this.anInt2219 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt2211 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt2217 >> 12;
		@Pc(35) int local35 = this.anInt2213 * arg0 >> 12;
		Static151.method5967(local35, local14, local21, super.anInt5305, super.anInt5307, local28, super.anInt5306);
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(IBI)V")
	@Override
	public void method4110(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2219 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt2211 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt2217 * arg0 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt2213 >> 12;
		Static150.method2167(local31, local17, local10, super.anInt5307, local24);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IBI)V")
	@Override
	public void method4109(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2219 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt2211 >> 12;
		@Pc(24) int local24 = this.anInt2217 * arg0 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt2213 >> 12;
		Static348.method4522(super.anInt5306, super.anInt5305, local24, local10, local31, local17);
	}
}
