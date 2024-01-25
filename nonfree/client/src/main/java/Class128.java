import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public final class Class128 {

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "I")
	private int anInt3285;

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "I")
	private int anInt3275;

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
	private int anInt3276;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
	private int anInt3273;

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
	private int anInt3277;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
	private int anInt3274;

	@OriginalMember(owner = "client!gp", name = "k", descriptor = "I")
	private int anInt3282;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
	private int anInt3278;

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
	private int anInt3279;

	@OriginalMember(owner = "client!gp", name = "m", descriptor = "I")
	private int anInt3284;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt3285 = arg1;
		this.anInt3275 = arg2;
		this.anInt3276 = arg0;
		this.anInt3273 = arg3 * arg3;
		this.anInt3277 = arg8 + this.anInt3275;
		this.anInt3274 = this.anInt3285 + arg6;
		this.anInt3282 = this.anInt3276 + arg4;
		this.anInt3278 = arg5 + this.anInt3276;
		this.anInt3279 = arg9 + this.anInt3275;
		this.anInt3284 = arg7 + this.anInt3285;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIIIIIIZI)V")
	public void method2768(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		this.anInt3276 = arg2;
		this.anInt3273 = arg8 * arg8;
		this.anInt3275 = arg5;
		this.anInt3285 = arg6;
		this.anInt3282 = arg4 + this.anInt3276;
		this.anInt3277 = this.anInt3275 + arg0;
		this.anInt3274 = this.anInt3285 + arg3;
		this.anInt3279 = arg9 + this.anInt3275;
		this.anInt3278 = arg1 + this.anInt3276;
		this.anInt3284 = arg7 + this.anInt3285;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIII)Z")
	public boolean method2771(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < this.anInt3282 || this.anInt3278 < arg0) {
			return false;
		} else if (arg1 < this.anInt3274 || this.anInt3284 < arg1) {
			return false;
		} else if (arg2 >= this.anInt3277 && arg2 <= this.anInt3279) {
			@Pc(57) int local57 = arg0 - this.anInt3276;
			@Pc(63) int local63 = arg2 - this.anInt3275;
			return local57 * local57 + local63 * local63 < this.anInt3273;
		} else {
			return false;
		}
	}
}
