import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class27_Sub4 extends Class27 {

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
	private final int anInt5157;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
	private final int anInt5161;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
	private final int anInt5160;

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
	private final int anInt5163;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(IIIIIII)V")
	public Class27_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt5157 = arg0;
		this.anInt5161 = arg2;
		this.anInt5160 = arg3;
		this.anInt5163 = arg1;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(III)V")
	@Override
	public void method3939(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5157 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt5161 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt5163 >> 12;
		@Pc(31) int local31 = this.anInt5160 * arg0 >> 12;
		Static88.method1588(local24, local17, super.anInt5155, local10, local31);
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(III)V")
	@Override
	public void method3936(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt5157 * arg1 >> 12;
		@Pc(22) int local22 = this.anInt5161 * arg1 >> 12;
		@Pc(29) int local29 = this.anInt5163 * arg0 >> 12;
		@Pc(36) int local36 = this.anInt5160 * arg0 >> 12;
		Static237.method5623(super.anInt5152, super.anInt5154, local10, super.anInt5155, local29, local22, local36);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V")
	@Override
	public void method3935(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
