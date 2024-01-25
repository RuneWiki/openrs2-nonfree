import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class37_Sub4 extends Class37 {

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "I")
	private final int anInt5264;

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
	private final int anInt5267;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
	private final int anInt5261;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
	private final int anInt5262;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IIIIIII)V")
	public Class37_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5264 = arg2;
		this.anInt5267 = arg1;
		this.anInt5261 = arg3;
		this.anInt5262 = arg0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method4690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt5262 * arg0 >> 12;
		@Pc(23) int local23 = arg0 * this.anInt5264 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt5267 >> 12;
		@Pc(37) int local37 = arg1 * this.anInt5261 >> 12;
		Static242.method4276(local10, super.anInt5257, local23, local30, local37);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V")
	@Override
	public void method4688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg0 * this.anInt5262 >> 12;
		@Pc(21) int local21 = arg0 * this.anInt5264 >> 12;
		@Pc(28) int local28 = this.anInt5267 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt5261 >> 12;
		Static207.method3793(local28, super.anInt5259, local35, super.anInt5257, local21, local14, super.anInt5256);
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(III)V")
	@Override
	public void method4692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
