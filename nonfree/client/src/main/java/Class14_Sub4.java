import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class14_Sub4 extends Class14 {

	@OriginalMember(owner = "client!re", name = "v", descriptor = "I")
	private final int anInt4062;

	@OriginalMember(owner = "client!re", name = "H", descriptor = "I")
	private final int anInt4070;

	@OriginalMember(owner = "client!re", name = "J", descriptor = "I")
	private final int anInt4072;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "I")
	private final int anInt4058;

	@OriginalMember(owner = "client!re", name = "s", descriptor = "I")
	private final int anInt4060;

	@OriginalMember(owner = "client!re", name = "G", descriptor = "I")
	private final int anInt4069;

	@OriginalMember(owner = "client!re", name = "A", descriptor = "I")
	private final int anInt4065;

	@OriginalMember(owner = "client!re", name = "y", descriptor = "I")
	private final int anInt4063;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class14_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt4062 = arg6;
		this.anInt4070 = arg3;
		this.anInt4072 = arg5;
		this.anInt4058 = arg0;
		this.anInt4060 = arg4;
		this.anInt4069 = arg1;
		this.anInt4065 = arg7;
		this.anInt4063 = arg2;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(III)V")
	@Override
	public void method3207(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IBI)V")
	@Override
	public void method3208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4058 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt4069 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt4063 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt4072 >> 12;
		@Pc(43) int local43 = arg0 * this.anInt4060 >> 12;
		@Pc(50) int local50 = this.anInt4065 * arg1 >> 12;
		@Pc(57) int local57 = this.anInt4070 * arg1 >> 12;
		@Pc(64) int local64 = this.anInt4062 * arg0 >> 12;
		Static195.method3541(local50, local10, local24, local36, local57, local64, super.anInt4048, local43, local17);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(IBI)V")
	@Override
	public void method3211(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
