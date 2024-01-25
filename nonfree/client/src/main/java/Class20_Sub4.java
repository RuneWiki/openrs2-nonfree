import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class20_Sub4 extends Class20 {

	@OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
	private final int anInt4743;

	@OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
	private final int anInt4742;

	@OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
	private final int anInt4747;

	@OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
	private final int anInt4745;

	@OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
	private final int anInt4738;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
	private final int anInt4737;

	@OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
	private final int anInt4746;

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
	private final int anInt4736;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class20_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt4743 = arg0;
		this.anInt4742 = arg6;
		this.anInt4747 = arg1;
		this.anInt4745 = arg3;
		this.anInt4738 = arg2;
		this.anInt4737 = arg4;
		this.anInt4746 = arg5;
		this.anInt4736 = arg7;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V")
	@Override
	public void method3819(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BII)V")
	@Override
	public void method3816(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZI)V")
	@Override
	public void method3815(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4743 * arg0 >> 12;
		@Pc(17) int local17 = this.anInt4747 * arg1 >> 12;
		@Pc(24) int local24 = arg0 * this.anInt4738 >> 12;
		@Pc(31) int local31 = this.anInt4745 * arg1 >> 12;
		@Pc(38) int local38 = this.anInt4737 * arg0 >> 12;
		@Pc(49) int local49 = arg1 * this.anInt4746 >> 12;
		@Pc(56) int local56 = this.anInt4742 * arg0 >> 12;
		@Pc(63) int local63 = arg1 * this.anInt4736 >> 12;
		Static158.method2682(local10, local31, local17, local63, local49, super.anInt4733, local24, local56, local38);
	}
}
