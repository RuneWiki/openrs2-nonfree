import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class330 {

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
	private int anInt9151;

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
	private int anInt9150;

	@OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
	private int anInt9157;

	@OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
	private int anInt9154;

	@OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
	private int anInt9160;

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
	private int anInt9158;

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
	private int anInt9155;

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
	private int anInt9156;

	@OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
	private int anInt9159;

	@OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
	private int anInt9153;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt9151 = arg2;
		this.anInt9150 = arg3 * arg3;
		this.anInt9157 = arg1;
		this.anInt9154 = arg0;
		this.anInt9160 = this.anInt9154 + arg4;
		this.anInt9158 = this.anInt9157 + arg6;
		this.anInt9155 = this.anInt9157 + arg7;
		this.anInt9156 = this.anInt9151 + arg8;
		this.anInt9159 = this.anInt9151 + arg9;
		this.anInt9153 = this.anInt9154 + arg5;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method7489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt9151 = arg4;
		this.anInt9154 = arg7;
		this.anInt9157 = arg3;
		this.anInt9150 = arg6 * arg6;
		this.anInt9160 = arg8 + this.anInt9154;
		this.anInt9155 = arg5 + this.anInt9157;
		this.anInt9153 = this.anInt9154 + arg0;
		this.anInt9158 = arg9 + this.anInt9157;
		this.anInt9156 = arg2 + this.anInt9151;
		this.anInt9159 = this.anInt9151 + arg1;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIII)Z")
	public boolean method7490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.anInt9160 > arg2 || this.anInt9153 < arg2) {
			return false;
		} else if (arg1 < this.anInt9158 || this.anInt9155 < arg1) {
			return false;
		} else if (arg0 >= this.anInt9156 && arg0 <= this.anInt9159) {
			@Pc(71) int local71 = arg2 - this.anInt9154;
			@Pc(77) int local77 = arg0 - this.anInt9151;
			return this.anInt9150 > local77 * local77 + local71 * local71;
		} else {
			return false;
		}
	}
}
