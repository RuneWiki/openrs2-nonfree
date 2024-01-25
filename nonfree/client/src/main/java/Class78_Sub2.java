import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public final class Class78_Sub2 extends Class78 {

	@OriginalMember(owner = "client!fu", name = "q", descriptor = "I")
	private final int anInt2242;

	@OriginalMember(owner = "client!fu", name = "r", descriptor = "I")
	private final int anInt2243;

	@OriginalMember(owner = "client!fu", name = "n", descriptor = "I")
	private final int anInt2239;

	@OriginalMember(owner = "client!fu", name = "o", descriptor = "I")
	private final int anInt2240;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(IIIIIII)V")
	public Class78_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2242 = arg2;
		this.anInt2243 = arg0;
		this.anInt2239 = arg3;
		this.anInt2240 = arg1;
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt2243 >> 12;
		@Pc(21) int local21 = this.anInt2242 * arg1 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt2240 >> 12;
		@Pc(35) int local35 = this.anInt2239 * arg0 >> 12;
		Static268.method3789(local28, super.anInt6428, local10, local21, local35);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(III)V")
	@Override
	public void method5065(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(III)V")
	@Override
	public void method5067(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2243 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt2242 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt2240 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt2239 >> 12;
		Static428.method5665(local10, super.anInt6427, local31, local24, super.anInt6429, super.anInt6428, local17);
	}
}
