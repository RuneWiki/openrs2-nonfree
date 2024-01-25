import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!km")
public final class Class175 {

	@OriginalMember(owner = "client!km", name = "m", descriptor = "I")
	private int anInt5180;

	@OriginalMember(owner = "client!km", name = "l", descriptor = "I")
	private int anInt5179;

	@OriginalMember(owner = "client!km", name = "c", descriptor = "I")
	private int anInt5170;

	@OriginalMember(owner = "client!km", name = "k", descriptor = "I")
	private int anInt5178;

	@OriginalMember(owner = "client!km", name = "a", descriptor = "I")
	private int anInt5168;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "I")
	private int anInt5173;

	@OriginalMember(owner = "client!km", name = "e", descriptor = "I")
	private int anInt5172;

	@OriginalMember(owner = "client!km", name = "h", descriptor = "I")
	private int anInt5175;

	@OriginalMember(owner = "client!km", name = "i", descriptor = "I")
	private int anInt5176;

	@OriginalMember(owner = "client!km", name = "d", descriptor = "I")
	private int anInt5171;

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class175(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt5180 = arg3 * arg3;
		this.anInt5179 = arg1;
		this.anInt5170 = arg0;
		this.anInt5178 = arg2;
		this.anInt5168 = arg9 + this.anInt5178;
		this.anInt5173 = this.anInt5170 + arg4;
		this.anInt5172 = arg6 + this.anInt5179;
		this.anInt5175 = arg7 + this.anInt5179;
		this.anInt5176 = arg8 + this.anInt5178;
		this.anInt5171 = this.anInt5170 + arg5;
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIII)Z")
	public boolean method4378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < this.anInt5173 || this.anInt5171 < arg0) {
			return false;
		} else if (arg1 < this.anInt5172 || this.anInt5175 < arg1) {
			return false;
		} else if (arg2 >= this.anInt5176 && this.anInt5168 >= arg2) {
			@Pc(55) int local55 = arg0 - this.anInt5170;
			@Pc(60) int local60 = arg2 - this.anInt5178;
			return local55 * local55 + local60 * local60 < this.anInt5180;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method4379(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt5179 = arg2;
		this.anInt5178 = arg3;
		this.anInt5170 = arg4;
		this.anInt5180 = arg9 * arg9;
		this.anInt5168 = this.anInt5178 + arg0;
		this.anInt5176 = this.anInt5178 + arg5;
		this.anInt5171 = this.anInt5170 + arg7;
		this.anInt5173 = this.anInt5170 + arg6;
		this.anInt5172 = this.anInt5179 + arg1;
		this.anInt5175 = arg8 + this.anInt5179;
	}
}
