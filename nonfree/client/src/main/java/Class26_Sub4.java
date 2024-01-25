import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class26_Sub4 extends Class26 {

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
	private final int anInt4753;

	@OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
	private final int anInt4747;

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
	private final int anInt4760;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
	private final int anInt4750;

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
	private final int anInt4758;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
	private final int anInt4751;

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
	private final int anInt4757;

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
	private final int anInt4756;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class26_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt4753 = arg6;
		this.anInt4747 = arg5;
		this.anInt4760 = arg2;
		this.anInt4750 = arg3;
		this.anInt4758 = arg1;
		this.anInt4751 = arg4;
		this.anInt4757 = arg7;
		this.anInt4756 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
	@Override
	public void method4303(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4756 * arg1 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt4758 >> 12;
		@Pc(30) int local30 = arg1 * this.anInt4760 >> 12;
		@Pc(37) int local37 = this.anInt4750 * arg0 >> 12;
		@Pc(44) int local44 = this.anInt4751 * arg1 >> 12;
		@Pc(51) int local51 = this.anInt4747 * arg0 >> 12;
		@Pc(58) int local58 = this.anInt4753 * arg1 >> 12;
		@Pc(65) int local65 = arg0 * this.anInt4757 >> 12;
		Static559.method8527(local10, super.anInt4745, local17, local65, local30, local51, local44, local37, local58);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4306(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZI)V")
	@Override
	public void method4304(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
