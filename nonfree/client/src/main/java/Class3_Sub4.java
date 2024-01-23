import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
	private final int anInt4889;

	@OriginalMember(owner = "client!vi", name = "A", descriptor = "I")
	private final int anInt4891;

	@OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
	private final int anInt4880;

	@OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
	private final int anInt4882;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(IIIIII)V")
	public Class3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt4889 = arg0;
		this.anInt4891 = arg2;
		this.anInt4880 = arg3;
		this.anInt4882 = arg1;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IBI)V")
	@Override
	public void method3661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)V")
	@Override
	public void method3660(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(III)V")
	@Override
	public void method3663(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt4889 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt4882 >> 12;
		@Pc(29) int local29 = this.anInt4891 * arg0 >> 12;
		@Pc(36) int local36 = this.anInt4880 * arg1 >> 12;
		Static128.method2150(local17, local29, super.anInt4875, local36, local10);
	}
}
