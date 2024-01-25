import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class55 {

	@OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
	private int anInt1141;

	@OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
	private int anInt1139;

	@OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
	private int anInt1140;

	@OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
	private int anInt1142;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
	public int anInt1128;

	@OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
	public int anInt1133;

	@OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
	public int anInt1137;

	@OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
	public int anInt1129;

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
	public int anInt1130;

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
	public int anInt1132;

	@OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class55(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt1141 = arg0;
		this.anInt1139 = arg3 * arg3;
		this.anInt1140 = arg2;
		this.anInt1142 = arg1;
		this.anInt1128 = this.anInt1140 + arg9;
		this.anInt1133 = arg7 + this.anInt1142;
		this.anInt1137 = this.anInt1142 + arg6;
		this.anInt1129 = this.anInt1141 + arg4;
		this.anInt1130 = arg8 + this.anInt1140;
		this.anInt1132 = arg5 + this.anInt1141;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBII)Z")
	public boolean method1166(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt1129 > arg2 || this.anInt1132 < arg2) {
			return false;
		} else if (arg0 < this.anInt1137 || arg0 > this.anInt1133) {
			return false;
		} else if (this.anInt1130 <= arg1 && this.anInt1128 >= arg1) {
			@Pc(67) int local67 = arg2 - this.anInt1141;
			@Pc(73) int local73 = arg1 - this.anInt1140;
			return local67 * local67 + local73 * local73 < this.anInt1139;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBIIIIIIIII)V")
	public void method1167(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt1141 = arg7;
		this.anInt1142 = arg0;
		this.anInt1140 = arg8;
		this.anInt1139 = arg5 * arg5;
		this.anInt1137 = arg6 + this.anInt1142;
		this.anInt1130 = this.anInt1140 + arg9;
		this.anInt1129 = arg1 + this.anInt1141;
		this.anInt1128 = arg2 + this.anInt1140;
		this.anInt1132 = this.anInt1141 + arg4;
		this.anInt1133 = this.anInt1142 + arg3;
	}
}
