import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
	private final int anInt2807;

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
	private final int anInt2806;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
	private final int anInt2811;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
	private final int anInt2809;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIIIII)V")
	public Class10_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2807 = arg3;
		this.anInt2806 = arg0;
		this.anInt2811 = arg1;
		this.anInt2809 = arg2;
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(III)V")
	@Override
	public void method4801(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)V")
	@Override
	public void method4798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt2806 >> 12;
		@Pc(21) int local21 = this.anInt2809 * arg1 >> 12;
		@Pc(28) int local28 = this.anInt2811 * arg0 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt2807 >> 12;
		Static254.method4509(local10, local28, super.anInt5386, local35, local21);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BII)V")
	@Override
	public void method4800(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2806 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt2809 >> 12;
		@Pc(24) int local24 = this.anInt2811 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt2807 * arg1 >> 12;
		Static352.method5706(local17, local24, super.anInt5386, local31, super.anInt5381, super.anInt5380, local10);
	}
}
