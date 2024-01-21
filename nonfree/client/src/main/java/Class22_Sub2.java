import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class22_Sub2 extends Class22 {

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
	private final int anInt1715;

	@OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
	private final int anInt1708;

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
	private final int anInt1716;

	@OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
	private final int anInt1707;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(IIIIII)V")
	public Class22_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt1715 = arg1;
		this.anInt1708 = arg2;
		this.anInt1716 = arg3;
		this.anInt1707 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BII)V")
	@Override
	public void method3216(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method3217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(III)V")
	@Override
	public void method3215(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt1708 * arg0 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt1707 >> 12;
		@Pc(24) int local24 = this.anInt1715 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt1716 * arg1 >> 12;
		Static68.method1337(local24, local10, super.anInt4155, local17, local31);
	}
}
