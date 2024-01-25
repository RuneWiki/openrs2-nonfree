import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class122_Sub2 extends Class122 {

	@OriginalMember(owner = "client!oq", name = "p", descriptor = "I")
	private final int anInt4840;

	@OriginalMember(owner = "client!oq", name = "i", descriptor = "I")
	private final int anInt4835;

	@OriginalMember(owner = "client!oq", name = "q", descriptor = "I")
	private final int anInt4841;

	@OriginalMember(owner = "client!oq", name = "r", descriptor = "I")
	private final int anInt4842;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(IIIIIII)V")
	public Class122_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt4840 = arg1;
		this.anInt4835 = arg2;
		this.anInt4841 = arg3;
		this.anInt4842 = arg0;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZII)V")
	@Override
	public void method4965(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt4842 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt4835 >> 12;
		@Pc(30) int local30 = arg0 * this.anInt4840 >> 12;
		@Pc(37) int local37 = arg0 * this.anInt4841 >> 12;
		Static109.method2028(super.anInt5901, local30, local37, super.anInt5900, local10, local17);
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(III)V")
	@Override
	public void method4969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = this.anInt4842 * arg1 >> 12;
		@Pc(24) int local24 = this.anInt4835 * arg1 >> 12;
		@Pc(31) int local31 = this.anInt4840 * arg0 >> 12;
		@Pc(38) int local38 = this.anInt4841 * arg0 >> 12;
		Static88.method1568(local17, local38, local24, super.anInt5903, local31);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(III)V")
	@Override
	public void method4968(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anInt4842 * arg1 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt4835 >> 12;
		@Pc(28) int local28 = this.anInt4840 * arg0 >> 12;
		@Pc(35) int local35 = this.anInt4841 * arg0 >> 12;
		Static209.method3660(local35, super.anInt5901, local10, super.anInt5903, local28, local21, super.anInt5900);
	}
}
