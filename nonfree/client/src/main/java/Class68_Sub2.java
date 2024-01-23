import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class68_Sub2 extends Class68 {

	@OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
	private int anInt2397;

	@OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
	private int anInt2395;

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
	private int anInt2393;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
	private int anInt2389;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(IIIIIII)V")
	public Class68_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2397 = arg3;
		this.anInt2395 = arg0;
		this.anInt2393 = arg1;
		this.anInt2389 = arg2;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIB)V")
	@Override
	public void method4687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2395 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt2389 >> 12;
		@Pc(32) int local32 = this.anInt2393 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt2397 * arg1 >> 12;
		Static263.method4472(local32, this.anInt6057, this.anInt6056, local10, local39, this.anInt6058, local17);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
	@Override
	public void method4690(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2395 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt2389 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt2393 * arg1 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt2397 >> 12;
		Static233.method4057(local10, local24, this.anInt6057, local36, local17, this.anInt6058);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBI)V")
	@Override
	public void method4686(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2395 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt2393 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt2397 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt2389 * arg1 >> 12;
		Static274.method2238(local17, local24, local31, local10, this.anInt6056);
	}
}
