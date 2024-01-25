import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4 {

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	private int anInt59;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
	private int anInt67;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
	private int anInt57;

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	private int anInt55;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	private int anInt61;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
	private int anInt58;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
	private int anInt62;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	private int anInt53;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
	private int anInt66;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
	private int anInt63;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt59 = arg1;
		this.anInt67 = arg3 * arg3;
		this.anInt57 = arg0;
		this.anInt55 = arg2;
		this.anInt61 = arg6 + this.anInt59;
		this.anInt58 = this.anInt57 + arg5;
		this.anInt62 = this.anInt57 + arg4;
		this.anInt53 = this.anInt59 + arg7;
		this.anInt66 = this.anInt55 + arg9;
		this.anInt63 = this.anInt55 + arg8;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIIIIIIBII)V")
	public void method74(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt67 = arg1 * arg1;
		this.anInt55 = arg7;
		this.anInt57 = arg2;
		this.anInt59 = arg3;
		this.anInt58 = arg0 + this.anInt57;
		this.anInt61 = this.anInt59 + arg4;
		this.anInt53 = arg9 + this.anInt59;
		this.anInt66 = arg8 + this.anInt55;
		this.anInt63 = arg6 + this.anInt55;
		this.anInt62 = this.anInt57 + arg5;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)Z")
	public boolean method76(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < this.anInt62 || this.anInt58 < arg2) {
			return false;
		} else if (arg0 < this.anInt61 || this.anInt53 < arg0) {
			return false;
		} else if (this.anInt63 <= arg1 && this.anInt66 >= arg1) {
			@Pc(51) int local51 = arg2 - this.anInt57;
			@Pc(62) int local62 = arg1 - this.anInt55;
			return local62 * local62 + local51 * local51 < this.anInt67;
		} else {
			return false;
		}
	}
}
