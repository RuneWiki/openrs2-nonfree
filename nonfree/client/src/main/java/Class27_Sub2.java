import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class27_Sub2 extends Class27 {

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
	private final int anInt2799;

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
	private final int anInt2798;

	@OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
	private final int anInt2803;

	@OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
	private final int anInt2800;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(IIIIII)V")
	public Class27_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt2799 = arg1;
		this.anInt2798 = arg2;
		this.anInt2803 = arg3;
		this.anInt2800 = arg0;
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(III)V")
	@Override
	public void method3939(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(III)V")
	@Override
	public void method3936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(III)V")
	@Override
	public void method3935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt2800 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt2798 * arg1 >> 12;
		@Pc(29) int local29 = arg0 * this.anInt2799 >> 12;
		@Pc(36) int local36 = this.anInt2803 * arg0 >> 12;
		Static200.method3167(super.anInt5152, local36, local29, local17, local10);
	}
}
