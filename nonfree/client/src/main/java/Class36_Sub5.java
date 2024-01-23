import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class36_Sub5 extends Class36 {

	@OriginalMember(owner = "client!qd", name = "H", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!qd", name = "I", descriptor = "D")
	public double aDouble3;

	@OriginalMember(owner = "client!qd", name = "K", descriptor = "D")
	public double aDouble4;

	@OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
	public int anInt4444;

	@OriginalMember(owner = "client!qd", name = "P", descriptor = "Lclient!nl;")
	private Class119_Sub1 aClass119_Sub1_5;

	@OriginalMember(owner = "client!qd", name = "Q", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!qd", name = "R", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!qd", name = "V", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!qd", name = "Z", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!qd", name = "ab", descriptor = "I")
	private int anInt4450;

	@OriginalMember(owner = "client!qd", name = "kb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
	private int anInt4431 = -32768;

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
	private int anInt4440 = 0;

	@OriginalMember(owner = "client!qd", name = "F", descriptor = "Z")
	private boolean aBoolean366 = false;

	@OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
	private int anInt4438 = -1;

	@OriginalMember(owner = "client!qd", name = "W", descriptor = "I")
	private int anInt4447 = 0;

	@OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
	public int anInt4435;

	@OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
	private int anInt4436;

	@OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
	private int anInt4427;

	@OriginalMember(owner = "client!qd", name = "X", descriptor = "I")
	public int anInt4448;

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
	public int anInt4428;

	@OriginalMember(owner = "client!qd", name = "bb", descriptor = "I")
	private int anInt4451;

	@OriginalMember(owner = "client!qd", name = "gb", descriptor = "I")
	private int anInt4454;

	@OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
	private int anInt4445;

	@OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
	public int anInt4442;

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
	private int anInt4439;

	@OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
	public int anInt4432;

	@OriginalMember(owner = "client!qd", name = "x", descriptor = "Lclient!bd;")
	private Class15 aClass15_3;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class36_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt4435 = arg1;
		this.anInt4436 = arg0;
		this.anInt4427 = arg2;
		this.anInt4448 = arg10;
		this.anInt4428 = arg5;
		this.aBoolean366 = false;
		this.anInt4451 = arg3;
		this.anInt4454 = arg8;
		this.anInt4445 = arg7;
		this.anInt4442 = arg9;
		this.anInt4439 = arg4;
		this.anInt4432 = arg6;
		@Pc(58) int local58 = Static208.method3532(this.anInt4436).anInt5405;
		if (local58 == -1) {
			this.aClass15_3 = null;
		} else {
			this.aClass15_3 = Static35.method706(local58);
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IBIII)V")
	public void method3611(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean366) {
			local9 = arg1 - this.anInt4427;
			@Pc(16) double local16 = (double) (arg2 - this.anInt4451);
			@Pc(25) double local25 = Math.sqrt(local16 * local16 + local9 * local9);
			this.aDouble3 = this.anInt4439;
			this.aDouble4 = (double) this.anInt4451 + (double) this.anInt4454 * local16 / local25;
			this.aDouble2 = (double) this.anInt4454 * local9 / local25 + (double) this.anInt4427;
		}
		local9 = this.anInt4432 + 1 - arg3;
		this.aDouble6 = ((double) arg2 - this.aDouble4) / local9;
		this.aDouble5 = ((double) arg1 - this.aDouble2) / local9;
		this.aDouble9 = Math.sqrt(this.aDouble5 * this.aDouble5 + this.aDouble6 * this.aDouble6);
		if (this.anInt4445 == -1) {
			this.aDouble7 = ((double) arg0 - this.aDouble3) / local9;
		} else {
			if (!this.aBoolean366) {
				this.aDouble7 = -this.aDouble9 * Math.tan((double) this.anInt4445 * 0.02454369D);
			}
			this.aDouble8 = ((double) arg0 - this.aDouble3 - this.aDouble7 * local9) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(II)V")
	public void method3615(@OriginalArg(1) int arg0) {
		this.aDouble4 += this.aDouble6 * (double) arg0;
		this.aDouble2 += (double) arg0 * this.aDouble5;
		if (this.anInt4445 == -1) {
			this.aDouble3 += this.aDouble7 * (double) arg0;
		} else {
			this.aDouble3 += this.aDouble7 * (double) arg0 + (double) arg0 * this.aDouble8 * 0.5D * (double) arg0;
			this.aDouble7 += (double) arg0 * this.aDouble8;
		}
		this.aBoolean366 = true;
		this.anInt4444 = (int) (Math.atan2(this.aDouble5, this.aDouble6) * 325.949D) + 1024 & 0x7FF;
		this.anInt4450 = (int) (Math.atan2(this.aDouble7, this.aDouble9) * 325.949D) & 0x7FF;
		if (this.aClass15_3 == null) {
			return;
		}
		this.anInt4440 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt4440 <= this.aClass15_3.anIntArray28[this.anInt4447]) {
						return;
					}
					this.anInt4440 -= this.aClass15_3.anIntArray28[this.anInt4447];
					this.anInt4447++;
					if (this.aClass15_3.anIntArray26.length <= this.anInt4447) {
						this.anInt4447 -= this.aClass15_3.anInt430;
						if (this.anInt4447 < 0 || this.anInt4447 >= this.aClass15_3.anIntArray26.length) {
							this.anInt4447 = 0;
						}
					}
					this.anInt4438 = this.anInt4447 + 1;
				} while (this.aClass15_3.anIntArray26.length > this.anInt4438);
				this.anInt4438 -= this.aClass15_3.anInt430;
			} while (this.anInt4438 >= 0 && this.anInt4438 < this.aClass15_3.anIntArray26.length);
			this.anInt4438 = -1;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIIIJILclient!nl;)V")
	@Override
	public void method4878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class119_Sub1 arg10) {
		@Pc(3) Class36_Sub2 local3 = this.method3617();
		if (local3 != null) {
			local3.method4878(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass119_Sub1_5);
			this.anInt4431 = local3.method4881();
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)Lclient!r;")
	private Class36_Sub2 method3617() {
		@Pc(8) Class167 local8 = Static208.method3532(this.anInt4436);
		@Pc(24) Class36_Sub2 local24 = local8.method4337(this.anInt4440, this.anInt4438, this.anInt4447);
		if (local24 == null) {
			return null;
		} else {
			local24.method3827(this.anInt4450);
			return local24;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "()I")
	@Override
	public int method4881() {
		return this.anInt4431;
	}
}
