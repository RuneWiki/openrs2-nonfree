import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class114_Sub3 extends Class114 {

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
	private final int anInt4647;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
	private final int anInt4650;

	@OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
	private final int anInt4654;

	@OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
	private final int anInt4653;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
	private final int anInt4651;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
	private final int anInt4642;

	@OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
	private final int anInt4649;

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	private final int anInt4643;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class114_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt4647 = arg6;
		this.anInt4650 = arg0;
		this.anInt4654 = arg1;
		this.anInt4653 = arg7;
		this.anInt4651 = arg3;
		this.anInt4642 = arg4;
		this.anInt4649 = arg2;
		this.anInt4643 = arg5;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(III)V")
	@Override
	public void method6310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt4650 * arg1 >> 12;
		@Pc(17) int local17 = this.anInt4654 * arg0 >> 12;
		@Pc(24) int local24 = this.anInt4649 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt4651 * arg0 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt4642 >> 12;
		@Pc(45) int local45 = this.anInt4643 * arg0 >> 12;
		@Pc(52) int local52 = arg1 * this.anInt4647 >> 12;
		@Pc(64) int local64 = this.anInt4653 * arg0 >> 12;
		Static537.method8071(local17, local31, super.anInt7442, local64, local24, local10, local38, local45, local52);
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)V")
	@Override
	public void method6309(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
	@Override
	public void method6308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
