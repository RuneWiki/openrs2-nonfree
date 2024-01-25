import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class35_Sub2 extends Class35 {

	@OriginalMember(owner = "client!rq", name = "v", descriptor = "I")
	private final int anInt5515;

	@OriginalMember(owner = "client!rq", name = "x", descriptor = "I")
	private final int anInt5516;

	@OriginalMember(owner = "client!rq", name = "p", descriptor = "I")
	private final int anInt5509;

	@OriginalMember(owner = "client!rq", name = "D", descriptor = "I")
	private final int anInt5520;

	@OriginalMember(owner = "client!rq", name = "B", descriptor = "I")
	private final int anInt5518;

	@OriginalMember(owner = "client!rq", name = "r", descriptor = "I")
	private final int anInt5511;

	@OriginalMember(owner = "client!rq", name = "s", descriptor = "I")
	private final int anInt5512;

	@OriginalMember(owner = "client!rq", name = "n", descriptor = "I")
	private final int anInt5507;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class35_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5515 = arg0;
		this.anInt5516 = arg2;
		this.anInt5509 = arg5;
		this.anInt5520 = arg7;
		this.anInt5518 = arg1;
		this.anInt5511 = arg3;
		this.anInt5512 = arg4;
		this.anInt5507 = arg6;
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(III)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "(III)V")
	@Override
	public void method5622(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt5515 >> 12;
		@Pc(17) int local17 = this.anInt5518 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt5516 >> 12;
		@Pc(31) int local31 = this.anInt5511 * arg0 >> 12;
		@Pc(38) int local38 = this.anInt5512 * arg1 >> 12;
		@Pc(45) int local45 = this.anInt5509 * arg0 >> 12;
		@Pc(52) int local52 = this.anInt5507 * arg1 >> 12;
		@Pc(59) int local59 = arg0 * this.anInt5520 >> 12;
		Static261.method4402(local31, local38, super.anInt6704, local59, local17, local24, local52, local10, local45);
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(III)V")
	@Override
	public void method5617(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
