import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class95_Sub3 extends Class95 {

	@OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
	private int anInt4546;

	@OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
	private int anInt4544;

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
	private int anInt4539;

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
	private int anInt4536;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IIIIII)V")
	public Class95_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt4546 = arg1;
		this.anInt4544 = arg2;
		this.anInt4539 = arg3;
		this.anInt4536 = arg0;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V")
	@Override
	public void method3990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt4544 * arg1 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt4546 >> 12;
		@Pc(29) int local29 = this.anInt4536 * arg1 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt4539 >> 12;
		Static197.method3080(local29, this.anInt4995, local36, local17, local10);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method3991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BII)V")
	@Override
	public void method3993(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
