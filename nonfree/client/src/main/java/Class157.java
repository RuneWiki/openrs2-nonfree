import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ifa")
public final class Class157 {

	@OriginalMember(owner = "client!ifa", name = "i", descriptor = "I")
	private int anInt3310;

	@OriginalMember(owner = "client!ifa", name = "o", descriptor = "I")
	private int anInt3316;

	@OriginalMember(owner = "client!ifa", name = "p", descriptor = "I")
	private int anInt3317;

	@OriginalMember(owner = "client!ifa", name = "m", descriptor = "I")
	private int anInt3314;

	@OriginalMember(owner = "client!ifa", name = "r", descriptor = "I")
	private int anInt3319;

	@OriginalMember(owner = "client!ifa", name = "g", descriptor = "I")
	private int anInt3308;

	@OriginalMember(owner = "client!ifa", name = "f", descriptor = "I")
	private int anInt3307;

	@OriginalMember(owner = "client!ifa", name = "d", descriptor = "I")
	private int anInt3305;

	@OriginalMember(owner = "client!ifa", name = "h", descriptor = "I")
	private int anInt3309;

	@OriginalMember(owner = "client!ifa", name = "n", descriptor = "I")
	private int anInt3315;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(IIIIIIIIII)V")
	public Class157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		this.anInt3310 = arg3 * arg3;
		this.anInt3316 = arg0;
		this.anInt3317 = arg1;
		this.anInt3314 = arg2;
		this.anInt3319 = this.anInt3316 + arg4;
		this.anInt3308 = this.anInt3316 + arg5;
		this.anInt3307 = this.anInt3314 + arg9;
		this.anInt3305 = arg7 + this.anInt3317;
		this.anInt3309 = arg8 + this.anInt3314;
		this.anInt3315 = this.anInt3317 + arg6;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(BIII)Z")
	public boolean method2753(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < this.anInt3319 || arg2 > this.anInt3308) {
			return false;
		} else if (this.anInt3315 > arg0 || arg0 > this.anInt3305) {
			return false;
		} else if (arg1 >= this.anInt3309 && this.anInt3307 >= arg1) {
			@Pc(49) int local49 = arg2 - this.anInt3316;
			@Pc(54) int local54 = arg1 - this.anInt3314;
			return local49 * local49 + local54 * local54 < this.anInt3310;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIIIIIIII)V")
	public void method2757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		this.anInt3317 = arg3;
		this.anInt3314 = arg9;
		this.anInt3316 = arg2;
		this.anInt3310 = arg4 * arg4;
		this.anInt3305 = this.anInt3317 + arg5;
		this.anInt3307 = arg8 + this.anInt3314;
		this.anInt3308 = this.anInt3316 + arg0;
		this.anInt3315 = this.anInt3317 + arg6;
		this.anInt3309 = arg1 + this.anInt3314;
		this.anInt3319 = this.anInt3316 + arg7;
	}
}
