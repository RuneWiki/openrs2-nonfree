import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class189 {

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
	private int anInt5085;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
	private int anInt5087;

	@OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
	private int anInt5091;

	@OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
	private int anInt5099;

	@OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
	private int anInt5094;

	@OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
	private int anInt5097;

	@OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
	private int anInt5101;

	@OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
	private int anInt5095;

	@OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
	private int anInt5093;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
	private int anInt5090;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt5085 = arg1;
		this.anInt5087 = arg3 * arg3;
		this.anInt5091 = arg2;
		this.anInt5099 = arg0;
		this.anInt5094 = arg4 + this.anInt5099;
		this.anInt5097 = this.anInt5085 + arg7;
		this.anInt5101 = arg9 + this.anInt5091;
		this.anInt5095 = this.anInt5085 + arg6;
		this.anInt5093 = arg8 + this.anInt5091;
		this.anInt5090 = arg5 + this.anInt5099;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIIIZIII)V")
	public void method4430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt5099 = arg7;
		this.anInt5087 = arg2 * arg2;
		this.anInt5091 = arg1;
		this.anInt5085 = arg8;
		this.anInt5090 = arg9 + this.anInt5099;
		this.anInt5095 = this.anInt5085 + arg6;
		this.anInt5097 = arg4 + this.anInt5085;
		this.anInt5101 = arg5 + this.anInt5091;
		this.anInt5094 = arg0 + this.anInt5099;
		this.anInt5093 = this.anInt5091 + arg3;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)Z")
	public boolean method4431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.anInt5094 > arg1 || this.anInt5090 < arg1) {
			return false;
		} else if (this.anInt5095 > arg2 || arg2 > this.anInt5097) {
			return false;
		} else if (arg0 >= this.anInt5093 && arg0 <= this.anInt5101) {
			@Pc(65) int local65 = arg1 - this.anInt5099;
			@Pc(71) int local71 = arg0 - this.anInt5091;
			return local71 * local71 + local65 * local65 < this.anInt5087;
		} else {
			return false;
		}
	}
}
