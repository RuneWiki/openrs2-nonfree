import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class15_Sub4 extends Class15 {

	@OriginalMember(owner = "client!wn", name = "o", descriptor = "I")
	private int anInt5632;

	@OriginalMember(owner = "client!wn", name = "t", descriptor = "I")
	private int anInt5637;

	@OriginalMember(owner = "client!wn", name = "v", descriptor = "I")
	private int anInt5638;

	@OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
	private int anInt5639;

	@OriginalMember(owner = "client!wn", name = "r", descriptor = "I")
	private int anInt5635;

	@OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
	private int anInt5634;

	@OriginalMember(owner = "client!wn", name = "p", descriptor = "I")
	private int anInt5633;

	@OriginalMember(owner = "client!wn", name = "C", descriptor = "I")
	private int anInt5644;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class15_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt5632 = arg4;
		this.anInt5637 = arg3;
		this.anInt5638 = arg2;
		this.anInt5639 = arg5;
		this.anInt5635 = arg6;
		this.anInt5634 = arg0;
		this.anInt5633 = arg1;
		this.anInt5644 = arg7;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V")
	@Override
	public void method4463(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(III)V")
	@Override
	public void method4464(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = this.anInt5634 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt5633 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt5638 >> 12;
		@Pc(31) int local31 = this.anInt5637 * arg1 >> 12;
		@Pc(38) int local38 = arg1 * this.anInt5639 >> 12;
		@Pc(45) int local45 = this.anInt5632 * arg0 >> 12;
		@Pc(56) int local56 = this.anInt5635 * arg0 >> 12;
		@Pc(63) int local63 = arg1 * this.anInt5644 >> 12;
		Static18.method334(local63, local31, local56, local24, this.anInt5625, local6, local45, local17, local38);
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(III)V")
	@Override
	public void method4465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
