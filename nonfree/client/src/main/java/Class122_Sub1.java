import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class122_Sub1 extends Class122 {

	@OriginalMember(owner = "client!od", name = "s", descriptor = "I")
	private final int anInt4628;

	@OriginalMember(owner = "client!od", name = "x", descriptor = "I")
	private final int anInt4632;

	@OriginalMember(owner = "client!od", name = "t", descriptor = "I")
	private final int anInt4629;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "I")
	private final int anInt4624;

	@OriginalMember(owner = "client!od", name = "r", descriptor = "I")
	private final int anInt4627;

	@OriginalMember(owner = "client!od", name = "o", descriptor = "I")
	private final int anInt4625;

	@OriginalMember(owner = "client!od", name = "i", descriptor = "I")
	private final int anInt4619;

	@OriginalMember(owner = "client!od", name = "l", descriptor = "I")
	private final int anInt4622;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class122_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt4628 = arg3;
		this.anInt4632 = arg5;
		this.anInt4629 = arg7;
		this.anInt4624 = arg4;
		this.anInt4627 = arg2;
		this.anInt4625 = arg0;
		this.anInt4619 = arg6;
		this.anInt4622 = arg1;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(III)V")
	@Override
	public void method4968(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(III)V")
	@Override
	public void method4969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4965(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt4625 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt4622 >> 12;
		@Pc(24) int local24 = this.anInt4627 * arg1 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt4628 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt4624 >> 12;
		@Pc(49) int local49 = arg0 * this.anInt4632 >> 12;
		@Pc(56) int local56 = this.anInt4619 * arg1 >> 12;
		@Pc(63) int local63 = this.anInt4629 * arg0 >> 12;
		Static54.method998(local56, local49, local17, local31, local10, super.anInt5900, local63, local24, local38);
	}
}
