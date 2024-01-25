import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class63_Sub3 extends Class63 {

	@OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
	private final int anInt6546;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
	private final int anInt6542;

	@OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
	private final int anInt6541;

	@OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
	private final int anInt6551;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(IIIIIII)V")
	public Class63_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6546 = arg1;
		this.anInt6542 = arg3;
		this.anInt6541 = arg2;
		this.anInt6551 = arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5133(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt6551 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt6541 * arg0 >> 12;
		@Pc(24) int local24 = arg1 * this.anInt6546 >> 12;
		@Pc(31) int local31 = this.anInt6542 * arg1 >> 12;
		Static43.method4052(super.anInt6687, local24, local31, local17, super.anInt6686, local10);
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(III)V")
	@Override
	public void method5135(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt6551 >> 12;
		@Pc(17) int local17 = this.anInt6541 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt6546 * arg1 >> 12;
		@Pc(35) int local35 = this.anInt6542 * arg1 >> 12;
		Static431.method5424(super.anInt6683, local17, local24, local10, local35);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)V")
	@Override
	public void method5134(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt6551 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt6541 >> 12;
		@Pc(28) int local28 = this.anInt6546 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt6542 >> 12;
		Static56.method861(local10, local21, super.anInt6686, local35, local28, super.anInt6687, super.anInt6683);
	}
}
