import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class104_Sub3 extends Class104 {

	@OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
	private final int anInt4903;

	@OriginalMember(owner = "client!pj", name = "D", descriptor = "I")
	private final int anInt4904;

	@OriginalMember(owner = "client!pj", name = "k", descriptor = "I")
	private final int anInt4890;

	@OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
	private final int anInt4900;

	@OriginalMember(owner = "client!pj", name = "B", descriptor = "I")
	private final int anInt4902;

	@OriginalMember(owner = "client!pj", name = "s", descriptor = "I")
	private final int anInt4896;

	@OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
	private final int anInt4891;

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
	private final int anInt4892;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class104_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt4903 = arg4;
		this.anInt4904 = arg0;
		this.anInt4890 = arg5;
		this.anInt4900 = arg7;
		this.anInt4902 = arg3;
		this.anInt4896 = arg1;
		this.anInt4891 = arg2;
		this.anInt4892 = arg6;
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)V")
	@Override
	public void method5080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BII)V")
	@Override
	public void method5084(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 * this.anInt4904 >> 12;
		@Pc(23) int local23 = this.anInt4896 * arg0 >> 12;
		@Pc(30) int local30 = this.anInt4891 * arg1 >> 12;
		@Pc(37) int local37 = this.anInt4902 * arg0 >> 12;
		@Pc(44) int local44 = this.anInt4903 * arg1 >> 12;
		@Pc(51) int local51 = arg0 * this.anInt4890 >> 12;
		@Pc(58) int local58 = arg1 * this.anInt4892 >> 12;
		@Pc(65) int local65 = this.anInt4900 * arg0 >> 12;
		Static254.method4010(local44, local51, local23, local37, local30, local16, local65, super.anInt5807, local58);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZII)V")
	@Override
	public void method5079(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
