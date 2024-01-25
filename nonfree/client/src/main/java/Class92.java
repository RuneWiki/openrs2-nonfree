import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class92 {

	@OriginalMember(owner = "client!el", name = "b", descriptor = "I")
	private int anInt2783;

	@OriginalMember(owner = "client!el", name = "f", descriptor = "I")
	private int anInt2786;

	@OriginalMember(owner = "client!el", name = "g", descriptor = "I")
	private int anInt2787;

	@OriginalMember(owner = "client!el", name = "m", descriptor = "I")
	private int anInt2792;

	@OriginalMember(owner = "client!el", name = "p", descriptor = "I")
	public int anInt2795;

	@OriginalMember(owner = "client!el", name = "i", descriptor = "I")
	public int anInt2789;

	@OriginalMember(owner = "client!el", name = "q", descriptor = "I")
	public int anInt2796;

	@OriginalMember(owner = "client!el", name = "n", descriptor = "I")
	public int anInt2793;

	@OriginalMember(owner = "client!el", name = "k", descriptor = "I")
	public int anInt2791;

	@OriginalMember(owner = "client!el", name = "a", descriptor = "I")
	public int anInt2782;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class92(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt2783 = arg0;
		this.anInt2786 = arg2;
		this.anInt2787 = arg1;
		this.anInt2792 = arg3 * arg3;
		this.anInt2795 = this.anInt2786 + arg8;
		this.anInt2789 = arg9 + this.anInt2786;
		this.anInt2796 = this.anInt2787 + arg6;
		this.anInt2793 = arg5 + this.anInt2783;
		this.anInt2791 = this.anInt2787 + arg7;
		this.anInt2782 = this.anInt2783 + arg4;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method2543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt2792 = arg5 * arg5;
		this.anInt2783 = arg7;
		this.anInt2786 = arg8;
		this.anInt2787 = arg1;
		this.anInt2782 = this.anInt2783 + arg6;
		this.anInt2795 = this.anInt2786 + arg4;
		this.anInt2789 = this.anInt2786 + arg9;
		this.anInt2793 = arg2 + this.anInt2783;
		this.anInt2796 = this.anInt2787 + arg0;
		this.anInt2791 = this.anInt2787 + arg3;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIBI)Z")
	public boolean method2544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt2782 > arg2 || this.anInt2793 < arg2) {
			return false;
		} else if (arg1 < this.anInt2796 || this.anInt2791 < arg1) {
			return false;
		} else if (arg0 >= this.anInt2795 && this.anInt2789 >= arg0) {
			@Pc(59) int local59 = arg2 - this.anInt2783;
			@Pc(65) int local65 = arg0 - this.anInt2786;
			return this.anInt2792 > local65 * local65 + local59 * local59;
		} else {
			return false;
		}
	}
}
