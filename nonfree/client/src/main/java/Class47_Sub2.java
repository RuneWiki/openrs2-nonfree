import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class47_Sub2 extends Class47 {

	@OriginalMember(owner = "client!fba", name = "s", descriptor = "I")
	private final int anInt2469;

	@OriginalMember(owner = "client!fba", name = "p", descriptor = "I")
	private final int anInt2467;

	@OriginalMember(owner = "client!fba", name = "n", descriptor = "I")
	private final int anInt2465;

	@OriginalMember(owner = "client!fba", name = "o", descriptor = "I")
	private final int anInt2466;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(IIIIIII)V")
	public Class47_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2469 = arg0;
		this.anInt2467 = arg3;
		this.anInt2465 = arg2;
		this.anInt2466 = arg1;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(BII)V")
	@Override
	public void method8416(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2469 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt2465 >> 12;
		@Pc(32) int local32 = this.anInt2466 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt2467 * arg1 >> 12;
		Static28.method376(local32, super.anInt10094, local10, local17, super.anInt10093, super.anInt10096, local39);
	}

	@OriginalMember(owner = "client!fba", name = "b", descriptor = "(III)V")
	@Override
	public void method8414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt2469 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt2465 * arg0 >> 12;
		@Pc(28) int local28 = this.anInt2466 * arg1 >> 12;
		@Pc(35) int local35 = this.anInt2467 * arg1 >> 12;
		Static490.method7173(super.anInt10093, local10, super.anInt10096, local17, local35, local28);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(III)V")
	@Override
	public void method8413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 * this.anInt2469 >> 12;
		@Pc(22) int local22 = arg1 * this.anInt2465 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt2466 >> 12;
		@Pc(36) int local36 = this.anInt2467 * arg0 >> 12;
		Static611.method8214(super.anInt10094, local15, local36, local22, local29);
	}
}
