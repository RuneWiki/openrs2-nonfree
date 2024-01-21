import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class22_Sub3 extends Class22 {

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
	private final int anInt1785;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
	private final int anInt1780;

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
	private final int anInt1787;

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
	private final int anInt1778;

	@OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
	private final int anInt1788;

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
	private final int anInt1781;

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
	private final int anInt1779;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
	private final int anInt1782;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class22_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		super(-1, arg8, arg9);
		this.anInt1785 = arg7;
		this.anInt1780 = arg1;
		this.anInt1787 = arg4;
		this.anInt1778 = arg0;
		this.anInt1788 = arg2;
		this.anInt1781 = arg5;
		this.anInt1779 = arg6;
		this.anInt1782 = arg3;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(III)V")
	@Override
	public void method3215(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg0 * this.anInt1778 >> 12;
		@Pc(25) int local25 = this.anInt1788 * arg0 >> 12;
		@Pc(32) int local32 = this.anInt1782 * arg1 >> 12;
		@Pc(39) int local39 = this.anInt1780 * arg1 >> 12;
		@Pc(46) int local46 = this.anInt1787 * arg0 >> 12;
		@Pc(53) int local53 = arg1 * this.anInt1781 >> 12;
		@Pc(60) int local60 = this.anInt1779 * arg0 >> 12;
		@Pc(67) int local67 = arg1 * this.anInt1785 >> 12;
		Static179.method3051(local10, local39, super.anInt4155, local67, local53, local25, local32, local46, local60);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method3217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BII)V")
	@Override
	public void method3216(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
