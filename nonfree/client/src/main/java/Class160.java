import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iha")
public final class Class160 {

	@OriginalMember(owner = "client!iha", name = "i", descriptor = "I")
	private int anInt4745;

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "I")
	private int anInt4738;

	@OriginalMember(owner = "client!iha", name = "f", descriptor = "I")
	private int anInt4743;

	@OriginalMember(owner = "client!iha", name = "m", descriptor = "I")
	private int anInt4749;

	@OriginalMember(owner = "client!iha", name = "l", descriptor = "I")
	public int anInt4748;

	@OriginalMember(owner = "client!iha", name = "e", descriptor = "I")
	public int anInt4742;

	@OriginalMember(owner = "client!iha", name = "k", descriptor = "I")
	public int anInt4747;

	@OriginalMember(owner = "client!iha", name = "g", descriptor = "I")
	public int anInt4744;

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "I")
	public int anInt4740;

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "I")
	public int anInt4739;

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt4745 = arg3 * arg3;
		this.anInt4738 = arg0;
		this.anInt4743 = arg2;
		this.anInt4749 = arg1;
		this.anInt4748 = arg4 + this.anInt4738;
		this.anInt4742 = this.anInt4749 + arg7;
		this.anInt4747 = arg5 + this.anInt4738;
		this.anInt4744 = arg9 + this.anInt4743;
		this.anInt4740 = arg8 + this.anInt4743;
		this.anInt4739 = this.anInt4749 + arg6;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IIII)Z")
	public boolean method4046(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt4748 > arg2 || arg2 > this.anInt4747) {
			return false;
		} else if (this.anInt4739 > arg1 || this.anInt4742 < arg1) {
			return false;
		} else if (arg0 >= this.anInt4740 && arg0 <= this.anInt4744) {
			@Pc(59) int local59 = arg2 - this.anInt4738;
			@Pc(81) int local81 = arg0 - this.anInt4743;
			return this.anInt4745 > local81 * local81 + local59 * local59;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IIIIIIBIIII)V")
	public void method4047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt4738 = arg2;
		this.anInt4743 = arg5;
		this.anInt4749 = arg8;
		this.anInt4745 = arg7 * arg7;
		this.anInt4744 = arg4 + this.anInt4743;
		this.anInt4747 = this.anInt4738 + arg0;
		this.anInt4742 = arg3 + this.anInt4749;
		this.anInt4748 = this.anInt4738 + arg9;
		this.anInt4739 = arg6 + this.anInt4749;
		this.anInt4740 = arg1 + this.anInt4743;
	}
}
