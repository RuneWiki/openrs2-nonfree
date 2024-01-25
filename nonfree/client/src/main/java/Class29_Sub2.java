import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!op")
public final class Class29_Sub2 extends Class29 {

	@OriginalMember(owner = "client!op", name = "C", descriptor = "I")
	private final int anInt4517;

	@OriginalMember(owner = "client!op", name = "p", descriptor = "I")
	private final int anInt4508;

	@OriginalMember(owner = "client!op", name = "l", descriptor = "I")
	private final int anInt4505;

	@OriginalMember(owner = "client!op", name = "s", descriptor = "I")
	private final int anInt4509;

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(IIIIIII)V")
	public Class29_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4517 = arg2;
		this.anInt4508 = arg1;
		this.anInt4505 = arg0;
		this.anInt4509 = arg3;
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(III)V")
	@Override
	public void method5055(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4505 * arg0 >> 12;
		@Pc(22) int local22 = this.anInt4517 * arg0 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt4508 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt4509 >> 12;
		Static267.method4543(local36, local22, local29, super.anInt5715, local10);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(IIB)V")
	@Override
	public void method5053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt4505 * arg1 >> 12;
		@Pc(21) int local21 = this.anInt4517 * arg1 >> 12;
		@Pc(28) int local28 = this.anInt4508 * arg0 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt4509 >> 12;
		Static324.method5460(super.anInt5715, super.anInt5710, local35, super.anInt5716, local10, local21, local28);
	}
}
