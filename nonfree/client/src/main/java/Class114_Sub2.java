import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class114_Sub2 extends Class114 {

	@OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
	private final int anInt4087;

	@OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
	private final int anInt4081;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
	private final int anInt4080;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
	private final int anInt4082;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(IIIIIII)V")
	public Class114_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4087 = arg2;
		this.anInt4081 = arg0;
		this.anInt4080 = arg3;
		this.anInt4082 = arg1;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
	@Override
	public void method4461(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 * this.anInt4081 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt4087 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt4082 >> 12;
		@Pc(36) int local36 = this.anInt4080 * arg1 >> 12;
		Static194.method4774(super.anInt5078, local15, local36, local29, local22, super.anInt5079);
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(III)V")
	@Override
	public void method4466(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4081 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt4087 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt4082 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt4080 >> 12;
		Static170.method1623(local10, super.anInt5076, super.anInt5078, local17, super.anInt5079, local28, local35);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIB)V")
	@Override
	public void method4462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt4081 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt4087 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt4082 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt4080 >> 12;
		Static204.method4706(super.anInt5076, local24, local17, local31, local10);
	}
}
