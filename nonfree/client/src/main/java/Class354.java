import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class354 {

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
	private int anInt9237;

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
	private int anInt9236;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
	private int anInt9244;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
	private int anInt9243;

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
	public int anInt9239;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
	public int anInt9240;

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
	public int anInt9245;

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
	public int anInt9238;

	@OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
	public int anInt9235;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
	public int anInt9241;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt9237 = arg3 * arg3;
		this.anInt9236 = arg0;
		this.anInt9244 = arg2;
		this.anInt9243 = arg1;
		this.anInt9239 = arg7 + this.anInt9243;
		this.anInt9240 = arg6 + this.anInt9243;
		this.anInt9245 = this.anInt9244 + arg9;
		this.anInt9238 = this.anInt9236 + arg5;
		this.anInt9235 = arg4 + this.anInt9236;
		this.anInt9241 = this.anInt9244 + arg8;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method7817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt9244 = arg4;
		this.anInt9237 = arg7 * arg7;
		this.anInt9243 = arg3;
		this.anInt9236 = arg9;
		this.anInt9235 = this.anInt9236 + arg2;
		this.anInt9239 = this.anInt9243 + arg1;
		this.anInt9245 = arg0 + this.anInt9244;
		this.anInt9238 = arg8 + this.anInt9236;
		this.anInt9241 = arg5 + this.anInt9244;
		this.anInt9240 = this.anInt9243 + arg6;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII)Z")
	public boolean method7818(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < this.anInt9235 || arg1 > this.anInt9238) {
			return false;
		} else if (arg0 < this.anInt9240 || arg0 > this.anInt9239) {
			return false;
		} else if (arg2 >= this.anInt9241 && this.anInt9245 >= arg2) {
			@Pc(56) int local56 = arg1 - this.anInt9236;
			@Pc(62) int local62 = arg2 - this.anInt9244;
			return this.anInt9237 > local62 * local62 + local56 * local56;
		} else {
			return false;
		}
	}
}
