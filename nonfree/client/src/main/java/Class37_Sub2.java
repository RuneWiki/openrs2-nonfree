import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class37_Sub2 extends Class37 {

	@OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
	private final int anInt2086;

	@OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
	private final int anInt2081;

	@OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
	private final int anInt2087;

	@OriginalMember(owner = "client!fj", name = "s", descriptor = "I")
	private final int anInt2083;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(IIIIII)V")
	public Class37_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt2086 = arg1;
		this.anInt2081 = arg3;
		this.anInt2087 = arg2;
		this.anInt2083 = arg0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method4690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(III)V")
	@Override
	public void method4692(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2083 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt2087 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt2086 >> 12;
		@Pc(39) int local39 = this.anInt2081 * arg1 >> 12;
		Static193.method3662(super.anInt5256, local17, local39, local10, local32);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)V")
	@Override
	public void method4688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
