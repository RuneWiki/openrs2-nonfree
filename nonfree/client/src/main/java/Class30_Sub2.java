import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nda")
public final class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!nda", name = "j", descriptor = "I")
	private final int anInt6631;

	@OriginalMember(owner = "client!nda", name = "g", descriptor = "I")
	private final int anInt6629;

	@OriginalMember(owner = "client!nda", name = "p", descriptor = "I")
	private final int anInt6636;

	@OriginalMember(owner = "client!nda", name = "n", descriptor = "I")
	private final int anInt6635;

	@OriginalMember(owner = "client!nda", name = "<init>", descriptor = "(IIIIIII)V")
	public Class30_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt6631 = arg0;
		this.anInt6629 = arg1;
		this.anInt6636 = arg2;
		this.anInt6635 = arg3;
	}

	@OriginalMember(owner = "client!nda", name = "b", descriptor = "(III)V")
	@Override
	public void method7660(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14 = arg0 * this.anInt6631 >> 12;
		@Pc(21) int local21 = this.anInt6636 * arg0 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt6629 >> 12;
		@Pc(35) int local35 = this.anInt6635 * arg1 >> 12;
		Static275.method4451(local21, super.anInt9990, local28, local35, local14);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt6631 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt6636 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt6629 >> 12;
		@Pc(37) int local37 = this.anInt6635 * arg1 >> 12;
		Static590.method8241(local37, super.anInt9989, super.anInt9988, local17, local10, local30);
	}

	@OriginalMember(owner = "client!nda", name = "a", descriptor = "(III)V")
	@Override
	public void method7659(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt6631 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt6636 >> 12;
		@Pc(24) int local24 = this.anInt6629 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt6635 * arg0 >> 12;
		Static505.method7285(super.anInt9988, local31, local10, local17, super.anInt9989, super.anInt9990, local24);
	}
}
