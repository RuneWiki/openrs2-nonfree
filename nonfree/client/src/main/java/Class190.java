import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ll")
public final class Class190 {

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
	private int anInt5732;

	@OriginalMember(owner = "client!ll", name = "k", descriptor = "I")
	private int anInt5741;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
	private int anInt5731;

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
	private int anInt5736;

	@OriginalMember(owner = "client!ll", name = "j", descriptor = "I")
	private int anInt5740;

	@OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
	private int anInt5737;

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
	private int anInt5735;

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
	private int anInt5733;

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
	private int anInt5734;

	@OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
	private int anInt5739;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt5732 = arg3 * arg3;
		this.anInt5741 = arg1;
		this.anInt5731 = arg0;
		this.anInt5736 = arg2;
		this.anInt5740 = arg6 + this.anInt5741;
		this.anInt5737 = arg5 + this.anInt5731;
		this.anInt5735 = this.anInt5731 + arg4;
		this.anInt5733 = arg7 + this.anInt5741;
		this.anInt5734 = this.anInt5736 + arg9;
		this.anInt5739 = this.anInt5736 + arg8;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method4649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt5741 = arg8;
		this.anInt5731 = arg9;
		this.anInt5736 = arg0;
		this.anInt5732 = arg3 * arg3;
		this.anInt5739 = arg1 + this.anInt5736;
		this.anInt5735 = arg6 + this.anInt5731;
		this.anInt5734 = this.anInt5736 + arg5;
		this.anInt5740 = arg7 + this.anInt5741;
		this.anInt5733 = arg2 + this.anInt5741;
		this.anInt5737 = this.anInt5731 + arg4;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BIII)Z")
	public boolean method4650(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt5735 > arg1 || arg1 > this.anInt5737) {
			return false;
		} else if (arg0 < this.anInt5740 || arg0 > this.anInt5733) {
			return false;
		} else if (this.anInt5739 <= arg2 && arg2 <= this.anInt5734) {
			@Pc(63) int local63 = arg1 - this.anInt5731;
			@Pc(69) int local69 = arg2 - this.anInt5736;
			return local69 * local69 + local63 * local63 < this.anInt5732;
		} else {
			return false;
		}
	}
}
