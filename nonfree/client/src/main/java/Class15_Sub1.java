import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
	private final int anInt546;

	@OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
	private final int anInt545;

	@OriginalMember(owner = "client!bj", name = "H", descriptor = "I")
	private final int anInt556;

	@OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
	private final int anInt550;

	@OriginalMember(owner = "client!bj", name = "E", descriptor = "I")
	private final int anInt554;

	@OriginalMember(owner = "client!bj", name = "u", descriptor = "I")
	private final int anInt547;

	@OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
	private final int anInt549;

	@OriginalMember(owner = "client!bj", name = "D", descriptor = "I")
	private final int anInt553;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt546 = arg0;
		this.anInt545 = arg6;
		this.anInt556 = arg1;
		this.anInt550 = arg3;
		this.anInt554 = arg7;
		this.anInt547 = arg4;
		this.anInt549 = arg5;
		this.anInt553 = arg2;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IBI)V")
	@Override
	public void method1760(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BII)V")
	@Override
	public void method1765(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt556 >> 12;
		@Pc(17) int local17 = this.anInt553 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt550 * arg0 >> 12;
		@Pc(31) int local31 = this.anInt546 * arg1 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt547 >> 12;
		@Pc(45) int local45 = arg1 * this.anInt545 >> 12;
		@Pc(52) int local52 = arg0 * this.anInt549 >> 12;
		@Pc(67) int local67 = this.anInt554 * arg0 >> 12;
		Static113.method1897(local31, local38, super.anInt2283, local52, local17, local10, local24, local67, local45);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)V")
	@Override
	public void method1757(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
