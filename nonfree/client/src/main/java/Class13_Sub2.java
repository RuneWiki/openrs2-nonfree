import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
	private int anInt2624;

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
	private int anInt2620;

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
	private int anInt2619;

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
	private int anInt2617;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(IIIIIII)V")
	public Class13_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2624 = arg3;
		this.anInt2620 = arg2;
		this.anInt2619 = arg1;
		this.anInt2617 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
	@Override
	public void method4389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg0 * this.anInt2617 >> 12;
		@Pc(25) int local25 = this.anInt2620 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt2619 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt2624 >> 12;
		Static146.method2597(local6, local25, this.anInt5544, local39, local32, this.anInt5542, this.anInt5540);
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)V")
	@Override
	public void method4390(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2617 * arg1 >> 12;
		@Pc(25) int local25 = this.anInt2620 * arg1 >> 12;
		@Pc(32) int local32 = arg0 * this.anInt2619 >> 12;
		@Pc(39) int local39 = this.anInt2624 * arg0 >> 12;
		Static220.method3667(this.anInt5540, local25, local10, local32, local39, this.anInt5544);
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(III)V")
	@Override
	public void method4392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt2620 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt2617 * arg0 >> 12;
		@Pc(28) int local28 = this.anInt2624 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt2619 >> 12;
		Static29.method566(local35, local10, this.anInt5542, local28, local17);
	}
}
