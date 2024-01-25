import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dn")
public final class Class71_Sub1 extends Class71 {

	@OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
	private final int anInt2121;

	@OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
	private final int anInt2120;

	@OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
	private final int anInt2119;

	@OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
	private final int anInt2123;

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(IIIIII)V")
	public Class71_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(-1, arg4, arg5);
		this.anInt2121 = arg1;
		this.anInt2120 = arg0;
		this.anInt2119 = arg3;
		this.anInt2123 = arg2;
	}

	@OriginalMember(owner = "client!dn", name = "b", descriptor = "(III)V")
	@Override
	public void method5893(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIB)V")
	@Override
	public void method5894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt2120 * arg1 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt2123 >> 12;
		@Pc(32) int local32 = this.anInt2121 * arg0 >> 12;
		@Pc(39) int local39 = arg0 * this.anInt2119 >> 12;
		Static356.method4764(local10, local32, local39, local17, super.anInt6721);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(III)V")
	@Override
	public void method5892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
