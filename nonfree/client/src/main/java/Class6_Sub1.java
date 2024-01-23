import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public final class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!aj", name = "l", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!aj", name = "q", descriptor = "I")
	public int anInt300;

	@OriginalMember(owner = "client!aj", name = "s", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!aj", name = "t", descriptor = "D")
	public double aDouble2;

	@OriginalMember(owner = "client!aj", name = "v", descriptor = "Lclient!pe;")
	private Class91_Sub1 aClass91_Sub1_1;

	@OriginalMember(owner = "client!aj", name = "y", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!aj", name = "z", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!aj", name = "B", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!aj", name = "H", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!aj", name = "I", descriptor = "D")
	public double aDouble7;

	@OriginalMember(owner = "client!aj", name = "O", descriptor = "D")
	public double aDouble8;

	@OriginalMember(owner = "client!aj", name = "o", descriptor = "Z")
	private boolean aBoolean24 = false;

	@OriginalMember(owner = "client!aj", name = "F", descriptor = "I")
	private int anInt308 = 0;

	@OriginalMember(owner = "client!aj", name = "C", descriptor = "I")
	private int anInt306 = -32768;

	@OriginalMember(owner = "client!aj", name = "R", descriptor = "I")
	private int anInt316 = 0;

	@OriginalMember(owner = "client!aj", name = "Q", descriptor = "I")
	private int anInt315 = -1;

	@OriginalMember(owner = "client!aj", name = "U", descriptor = "I")
	public int anInt319;

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!aj", name = "V", descriptor = "I")
	public int anInt320;

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "I")
	public int anInt297;

	@OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
	public int anInt312;

	@OriginalMember(owner = "client!aj", name = "S", descriptor = "I")
	public int anInt317;

	@OriginalMember(owner = "client!aj", name = "P", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
	private int anInt310;

	@OriginalMember(owner = "client!aj", name = "A", descriptor = "I")
	private int anInt305;

	@OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!aj", name = "r", descriptor = "Lclient!pi;")
	private Class133 aClass133_1;

	@OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(IIIIIIIIIII)V")
	public Class6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt319 = arg1;
		this.anInt299 = arg8;
		this.anInt313 = arg2;
		this.anInt320 = arg9;
		this.anInt297 = arg5;
		this.anInt312 = arg10;
		this.anInt317 = arg6;
		this.anInt314 = arg0;
		this.anInt310 = arg3;
		this.anInt305 = arg4;
		this.anInt298 = arg7;
		this.aBoolean24 = false;
		@Pc(58) int local58 = Static280.method4295(this.anInt314).anInt838;
		if (local58 == -1) {
			this.aClass133_1 = null;
		} else {
			this.aClass133_1 = Static262.method4031(local58);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method3839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)Lclient!ei;")
	private Class6_Sub2 method230() {
		@Pc(8) Class25 local8 = Static280.method4295(this.anInt314);
		@Pc(18) Class6_Sub2 local18 = local8.method711(this.anInt316, this.anInt315, this.anInt308);
		if (local18 == null) {
			return null;
		} else {
			local18.method2070(this.anInt301);
			return local18;
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(IIIII)V")
	public void method231(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean24) {
			local9 = arg2 - this.anInt313;
			@Pc(16) double local16 = (double) (arg3 - this.anInt310);
			@Pc(25) double local25 = Math.sqrt(local9 * local9 + local16 * local16);
			this.aDouble8 = (double) this.anInt313 + local9 * (double) this.anInt299 / local25;
			this.aDouble2 = local16 * (double) this.anInt299 / local25 + (double) this.anInt310;
			this.aDouble7 = this.anInt305;
		}
		local9 = this.anInt317 + 1 - arg1;
		this.aDouble1 = ((double) arg3 - this.aDouble2) / local9;
		this.aDouble4 = ((double) arg2 - this.aDouble8) / local9;
		this.aDouble5 = Math.sqrt(this.aDouble1 * this.aDouble1 + this.aDouble4 * this.aDouble4);
		if (this.anInt298 == -1) {
			this.aDouble6 = ((double) arg0 - this.aDouble7) / local9;
		} else {
			if (!this.aBoolean24) {
				this.aDouble6 = -this.aDouble5 * Math.tan((double) this.anInt298 * 0.02454369D);
			}
			this.aDouble3 = ((double) arg0 - this.aDouble6 * local9 - this.aDouble7) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)V")
	public void method233(@OriginalArg(0) int arg0) {
		this.aDouble2 += (double) arg0 * this.aDouble1;
		if (this.anInt298 == -1) {
			this.aDouble7 += this.aDouble6 * (double) arg0;
		} else {
			this.aDouble7 += this.aDouble3 * 0.5D * (double) arg0 * (double) arg0 + this.aDouble6 * (double) arg0;
			this.aDouble6 += (double) arg0 * this.aDouble3;
		}
		this.aBoolean24 = true;
		this.aDouble8 += (double) arg0 * this.aDouble4;
		this.anInt300 = (int) (Math.atan2(this.aDouble4, this.aDouble1) * 325.949D) + 1024 & 0x7FF;
		this.anInt301 = (int) (Math.atan2(this.aDouble6, this.aDouble5) * 325.949D) & 0x7FF;
		if (this.aClass133_1 == null) {
			return;
		}
		this.anInt316 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt316 <= this.aClass133_1.anIntArray460[this.anInt308]) {
						return;
					}
					this.anInt316 -= this.aClass133_1.anIntArray460[this.anInt308];
					this.anInt308++;
					if (this.aClass133_1.anIntArray461.length <= this.anInt308) {
						this.anInt308 -= this.aClass133_1.anInt4026;
						if (this.anInt308 < 0 || this.aClass133_1.anIntArray461.length <= this.anInt308) {
							this.anInt308 = 0;
						}
					}
					this.anInt315 = this.anInt308 + 1;
				} while (this.anInt315 < this.aClass133_1.anIntArray461.length);
				this.anInt315 -= this.aClass133_1.anInt4026;
			} while (this.anInt315 >= 0 && this.aClass133_1.anIntArray461.length > this.anInt315);
			this.anInt315 = -1;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIIIIIIIJILclient!pe;)V")
	@Override
	public void method3838(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class91_Sub1 arg10) {
		@Pc(3) Class6_Sub2 local3 = this.method230();
		if (local3 != null) {
			local3.method3838(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.aClass91_Sub1_1);
			this.anInt306 = local3.method3833();
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "()I")
	@Override
	public int method3833() {
		return this.anInt306;
	}
}
