import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class25_Sub5_Sub3 extends Class25_Sub5 {

	@OriginalMember(owner = "client!lk", name = "O", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!lk", name = "U", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!lk", name = "Z", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!lk", name = "ab", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!lk", name = "cb", descriptor = "I")
	private int anInt4109;

	@OriginalMember(owner = "client!lk", name = "fb", descriptor = "I")
	private int anInt4112;

	@OriginalMember(owner = "client!lk", name = "ib", descriptor = "Lclient!dl;")
	private Class4_Sub2 aClass4_Sub2_3;

	@OriginalMember(owner = "client!lk", name = "kb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!lk", name = "rb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!lk", name = "ub", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!lk", name = "yb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!lk", name = "G", descriptor = "I")
	private int anInt4092 = 0;

	@OriginalMember(owner = "client!lk", name = "lb", descriptor = "Z")
	private boolean lb = false;

	@OriginalMember(owner = "client!lk", name = "P", descriptor = "I")
	private int anInt4099 = -1;

	@OriginalMember(owner = "client!lk", name = "pb", descriptor = "I")
	private int anInt4117 = 0;

	@OriginalMember(owner = "client!lk", name = "Ab", descriptor = "I")
	private int anInt4123 = -32768;

	@OriginalMember(owner = "client!lk", name = "M", descriptor = "I")
	public final int anInt4097;

	@OriginalMember(owner = "client!lk", name = "sb", descriptor = "I")
	public final int anInt4119;

	@OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
	private final int anInt4095;

	@OriginalMember(owner = "client!lk", name = "S", descriptor = "I")
	private final int anInt4102;

	@OriginalMember(owner = "client!lk", name = "wb", descriptor = "I")
	private final int anInt4120;

	@OriginalMember(owner = "client!lk", name = "zb", descriptor = "I")
	private final int anInt4122;

	@OriginalMember(owner = "client!lk", name = "Y", descriptor = "I")
	public final int anInt4107;

	@OriginalMember(owner = "client!lk", name = "hb", descriptor = "Z")
	private final boolean aBoolean467;

	@OriginalMember(owner = "client!lk", name = "W", descriptor = "I")
	public final int anInt4105;

	@OriginalMember(owner = "client!lk", name = "vb", descriptor = "Lclient!oj;")
	private final Class177 aClass177_1;

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class25_Sub5_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static335.method4499(arg1, arg2, arg3) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt4097 = arg5;
		this.anInt4119 = arg9;
		this.anInt4095 = arg0;
		this.anInt4102 = arg4;
		this.anInt4120 = arg7;
		this.anInt4122 = arg8;
		this.lb = false;
		this.anInt4107 = arg6;
		this.aBoolean467 = arg11;
		this.anInt4105 = arg10;
		@Pc(78) int local78 = Static88.aClass69_1.method1553(this.anInt4095).anInt3576;
		if (local78 == -1) {
			this.aClass177_1 = null;
		} else {
			this.aClass177_1 = Static174.aClass254_1.method5670(local78);
		}
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method4602() {
		return false;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB)V")
	public void method3331(@OriginalArg(0) int arg0) {
		this.aDouble3 += (double) arg0 * this.aDouble2;
		this.lb = true;
		this.aDouble5 += (double) arg0 * this.aDouble7;
		if (this.aBoolean467) {
			this.aDouble8 = Static335.method4499(super.aByte94, (int) this.aDouble3, (int) this.aDouble5) - this.anInt4102;
		} else if (this.anInt4120 == -1) {
			this.aDouble8 += (double) arg0 * this.aDouble4;
		} else {
			this.aDouble8 += this.aDouble4 * (double) arg0 + (double) arg0 * this.aDouble1 * 0.5D * (double) arg0;
			this.aDouble4 += this.aDouble1 * (double) arg0;
		}
		this.anInt4109 = (int) (Math.atan2(this.aDouble2, this.aDouble7) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt4112 = (int) (Math.atan2(this.aDouble4, this.aDouble6) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass177_1 == null) {
			return;
		}
		this.anInt4117 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt4117 <= this.aClass177_1.anIntArray327[this.anInt4092]) {
						return;
					}
					this.anInt4117 -= this.aClass177_1.anIntArray327[this.anInt4092];
					this.anInt4092++;
					if (this.aClass177_1.anIntArray326.length <= this.anInt4092) {
						this.anInt4092 -= this.aClass177_1.anInt5041;
						if (this.anInt4092 < 0 || this.anInt4092 >= this.aClass177_1.anIntArray326.length) {
							this.anInt4092 = 0;
						}
					}
					this.anInt4099 = this.anInt4092 + 1;
				} while (this.anInt4099 < this.aClass177_1.anIntArray326.length);
				this.anInt4099 -= this.aClass177_1.anInt5041;
			} while (this.anInt4099 >= 0 && this.aClass177_1.anIntArray326.length > this.anInt4099);
			this.anInt4099 = -1;
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
	public void method3332() {
		if (this.aClass4_Sub2_3 != null) {
			this.aClass4_Sub2_3.method1244();
		}
	}

	@OriginalMember(owner = "client!lk", name = "e", descriptor = "(I)I")
	@Override
	public int method4341() {
		return this.anInt4123;
	}

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "(B)V")
	@Override
	public void method4343() {
		super.aShort97 = super.aShort96 = (short) (this.aDouble3 / 128.0D);
		super.aShort94 = super.aShort95 = (short) (this.aDouble5 / 128.0D);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIB)V")
	public void method3335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) double local13;
		if (!this.lb) {
			local13 = arg1 - super.anInt5518;
			@Pc(20) double local20 = (double) (arg3 - super.anInt5514);
			@Pc(29) double local29 = Math.sqrt(local13 * local13 + local20 * local20);
			this.aDouble5 = (double) super.anInt5514 + (double) this.anInt4122 * local20 / local29;
			this.aDouble3 = local13 * (double) this.anInt4122 / local29 + (double) super.anInt5518;
			if (this.aBoolean467) {
				this.aDouble8 = Static335.method4499(super.aByte94, (int) this.aDouble3, (int) this.aDouble5) - this.anInt4102;
			} else {
				this.aDouble8 = super.anInt5517;
			}
		}
		local13 = this.anInt4107 + 1 - arg0;
		this.aDouble2 = ((double) arg1 - this.aDouble3) / local13;
		this.aDouble7 = ((double) arg3 - this.aDouble5) / local13;
		this.aDouble6 = Math.sqrt(this.aDouble2 * this.aDouble2 + this.aDouble7 * this.aDouble7);
		if (this.anInt4120 == -1) {
			this.aDouble4 = ((double) arg2 - this.aDouble8) / local13;
		} else {
			if (!this.lb) {
				this.aDouble4 = -this.aDouble6 * Math.tan((double) this.anInt4120 * 0.02454369D);
			}
			this.aDouble1 = ((double) arg2 - this.aDouble8 - local13 * this.aDouble4) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(BLclient!za;)Lclient!uc;")
	@Override
	public Class4_Sub7 method4600(@OriginalArg(1) Class34 arg0) {
		@Pc(11) Class57 local11 = this.method3337(2048, arg0);
		if (local11 == null) {
			return null;
		}
		@Pc(18) Class32 local18 = arg0.method5747();
		local18.g(this.anInt4112);
		local18.EA(this.anInt4109);
		local18.W((int) this.aDouble3, (int) this.aDouble8, (int) this.aDouble5);
		if (this.aClass4_Sub2_3 == null) {
			local11.method5953(local18, null, 0);
		} else {
			@Pc(50) Class71 local50 = this.aClass4_Sub2_3.method1240();
			arg0.method5762(local11, local50, local18, null);
		}
		this.anInt4123 = local11.B();
		this.method3336(arg0, local11);
		return null;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!za;ZLclient!e;)V")
	private void method3336(@OriginalArg(0) Class34 arg0, @OriginalArg(2) Class57 arg1) {
		@Pc(10) Class229[] local10 = arg1.method5958();
		@Pc(13) Class181[] local13 = arg1.method5959();
		if ((this.aClass4_Sub2_3 == null || this.aClass4_Sub2_3.aBoolean162) && (local10 != null || local13 != null)) {
			this.aClass4_Sub2_3 = new Class4_Sub2(Static236.anInt4213);
		}
		if (this.aClass4_Sub2_3 != null) {
			this.aClass4_Sub2_3.method1242(arg0, (long) Static236.anInt4213, local10, local13);
			this.aClass4_Sub2_3.method1236(super.aByte94, super.aShort97, super.aShort96, super.aShort94, super.aShort95);
		}
	}

	@OriginalMember(owner = "client!lk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub2_3 != null) {
			this.aClass4_Sub2_3.method1244();
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!za;BI)Z")
	@Override
	public boolean method4601(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(B)V")
	@Override
	public void method4607() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(BLclient!za;)V")
	@Override
	public void method4606(@OriginalArg(1) Class34 arg0) {
		@Pc(9) Class57 local9 = this.method3337(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class32 local15 = arg0.method5747();
		local15.g(this.anInt4112);
		local15.EA(this.anInt4109);
		local15.W((int) this.aDouble3, (int) this.aDouble8, (int) this.aDouble5);
		this.anInt4123 = local9.B();
		this.method3336(arg0, local9);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILclient!za;)Lclient!e;")
	private Class57 method3337(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1) {
		@Pc(15) Class130 local15 = Static88.aClass69_1.method1553(this.anInt4095);
		return local15.method2914(Static174.aClass254_1, arg0, this.anInt4117, this.anInt4099, arg1, this.anInt4092);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIZILclient!ot;Lclient!za;)V")
	@Override
	public void method4609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class25 arg4, @OriginalArg(6) Class34 arg5) {
		throw new IllegalStateException();
	}
}
