import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class28_Sub1 extends Class28 {

	@OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
	private final int anInt1723;

	@OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
	private final int anInt1724;

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
	private final int anInt1721;

	@OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
	private final int anInt1725;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(IIIIIII)V")
	public Class28_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1723 = arg3;
		this.anInt1724 = arg2;
		this.anInt1721 = arg0;
		this.anInt1725 = arg1;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIB)V")
	@Override
	public void method2857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = this.anInt1721 * arg0 >> 12;
		@Pc(13) int local13 = this.anInt1724 * arg0 >> 12;
		@Pc(28) int local28 = arg1 * this.anInt1725 >> 12;
		@Pc(39) int local39 = arg1 * this.anInt1723 >> 12;
		Static117.method1980(super.anInt4144, local28, local13, local39, super.anInt4140, local6);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method2853(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) int local6 = this.anInt1724 * arg1 >> 12;
		@Pc(21) int local21 = arg1 * this.anInt1721 >> 12;
		@Pc(28) int local28 = this.anInt1725 * arg0 >> 12;
		@Pc(35) int local35 = arg0 * this.anInt1723 >> 12;
		Static5.method217(local35, local28, super.anInt4139, local21, local6);
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)V")
	@Override
	public void method2851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt1721 >> 12;
		@Pc(17) int local17 = arg0 * this.anInt1724 >> 12;
		@Pc(28) int local28 = this.anInt1725 * arg1 >> 12;
		@Pc(35) int local35 = arg1 * this.anInt1723 >> 12;
		Static45.method930(local17, super.anInt4140, local28, super.anInt4144, super.anInt4139, local10, local35);
	}
}
