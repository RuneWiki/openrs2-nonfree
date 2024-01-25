import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
	private final int anInt703;

	@OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
	private final int anInt707;

	@OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
	private final int anInt705;

	@OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
	private final int anInt702;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(IIIIIII)V")
	public Class10_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt703 = arg1;
		this.anInt707 = arg0;
		this.anInt705 = arg2;
		this.anInt702 = arg3;
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(III)V")
	@Override
	public void method4801(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt707 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt705 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt703 * arg0 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt702 >> 12;
		Static332.method5567(super.anInt5380, local31, super.anInt5381, local17, local24, local10);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BII)V")
	@Override
	public void method4800(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) int local18 = arg0 * this.anInt707 >> 12;
		@Pc(25) int local25 = this.anInt705 * arg0 >> 12;
		@Pc(32) int local32 = arg1 * this.anInt703 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt702 >> 12;
		Static50.method1132(local39, super.anInt5386, local18, super.anInt5381, super.anInt5380, local25, local32);
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)V")
	@Override
	public void method4798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt707 * arg1 >> 12;
		@Pc(22) int local22 = this.anInt705 * arg1 >> 12;
		@Pc(29) int local29 = this.anInt703 * arg0 >> 12;
		@Pc(36) int local36 = arg0 * this.anInt702 >> 12;
		Static56.method1212(local29, local36, local22, super.anInt5386, local10);
	}
}
