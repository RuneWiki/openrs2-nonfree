import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class78_Sub1 extends Class78 {

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "I")
	private final int anInt2063;

	@OriginalMember(owner = "client!fj", name = "s", descriptor = "I")
	private final int anInt2069;

	@OriginalMember(owner = "client!fj", name = "k", descriptor = "I")
	private final int anInt2062;

	@OriginalMember(owner = "client!fj", name = "j", descriptor = "I")
	private final int anInt2061;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(IIIIIII)V")
	public Class78_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt2063 = arg2;
		this.anInt2069 = arg0;
		this.anInt2062 = arg1;
		this.anInt2061 = arg3;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method5064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 * this.anInt2069 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt2063 >> 12;
		@Pc(28) int local28 = arg0 * this.anInt2062 >> 12;
		@Pc(35) int local35 = this.anInt2061 * arg0 >> 12;
		Static341.method4573(local35, local14, local28, super.anInt6428, local21);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)V")
	@Override
	public void method5065(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2069 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt2063 * arg0 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt2062 >> 12;
		@Pc(37) int local37 = this.anInt2061 * arg1 >> 12;
		Static224.method3257(local37, local10, local30, super.anInt6427, local17, super.anInt6429);
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(III)V")
	@Override
	public void method5067(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt2069 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt2063 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt2062 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt2061 >> 12;
		Static109.method3819(super.anInt6427, local36, local10, super.anInt6429, super.anInt6428, local29, local17);
	}
}
