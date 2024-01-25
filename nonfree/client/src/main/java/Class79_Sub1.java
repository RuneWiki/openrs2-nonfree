import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class79_Sub1 extends Class79 {

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
	private final int anInt2581;

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
	private final int anInt2573;

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
	private final int anInt2584;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
	private final int anInt2579;

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
	private final int anInt2587;

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
	private final int anInt2582;

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
	private final int anInt2586;

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
	private final int anInt2572;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class79_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt2581 = arg5;
		this.anInt2573 = arg2;
		this.anInt2584 = arg7;
		this.anInt2579 = arg4;
		this.anInt2587 = arg1;
		this.anInt2582 = arg3;
		this.anInt2586 = arg0;
		this.anInt2572 = arg6;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(III)V")
	@Override
	public void method5119(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V")
	@Override
	public void method5114(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBI)V")
	@Override
	public void method5116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt2586 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt2587 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt2573 >> 12;
		@Pc(31) int local31 = arg1 * this.anInt2582 >> 12;
		@Pc(38) int local38 = this.anInt2579 * arg0 >> 12;
		@Pc(49) int local49 = arg1 * this.anInt2581 >> 12;
		@Pc(56) int local56 = arg0 * this.anInt2572 >> 12;
		@Pc(63) int local63 = arg1 * this.anInt2584 >> 12;
		Static209.method4335(local17, local56, local63, local38, local24, local49, local10, super.anInt5793, local31);
	}
}
