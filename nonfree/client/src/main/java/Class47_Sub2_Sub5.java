import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class47_Sub2_Sub5 extends Class47_Sub2 {

	@OriginalMember(owner = "client!ln", name = "C", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!ln", name = "I", descriptor = "Lclient!dea;")
	private Class2_Sub3 aClass2_Sub3_7;

	@OriginalMember(owner = "client!ln", name = "J", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!ln", name = "P", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!ln", name = "Q", descriptor = "I")
	private int anInt5537;

	@OriginalMember(owner = "client!ln", name = "Y", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!ln", name = "eb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!ln", name = "hb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!ln", name = "kb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!ln", name = "ob", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!ln", name = "sb", descriptor = "I")
	private int anInt5556;

	@OriginalMember(owner = "client!ln", name = "D", descriptor = "I")
	private int anInt5528 = -32768;

	@OriginalMember(owner = "client!ln", name = "T", descriptor = "I")
	private int anInt5539 = 0;

	@OriginalMember(owner = "client!ln", name = "G", descriptor = "Z")
	private boolean aBoolean383 = false;

	@OriginalMember(owner = "client!ln", name = "lb", descriptor = "I")
	private int lb = -1;

	@OriginalMember(owner = "client!ln", name = "rb", descriptor = "I")
	private int anInt5555 = 0;

	@OriginalMember(owner = "client!ln", name = "nb", descriptor = "I")
	private final int anInt5552;

	@OriginalMember(owner = "client!ln", name = "db", descriptor = "I")
	private final int anInt5548;

	@OriginalMember(owner = "client!ln", name = "gb", descriptor = "I")
	public final int anInt5549;

	@OriginalMember(owner = "client!ln", name = "O", descriptor = "I")
	public final int anInt5536;

	@OriginalMember(owner = "client!ln", name = "pb", descriptor = "I")
	public final int anInt5553;

	@OriginalMember(owner = "client!ln", name = "ib", descriptor = "Z")
	private final boolean aBoolean384;

	@OriginalMember(owner = "client!ln", name = "U", descriptor = "I")
	private final int anInt5540;

	@OriginalMember(owner = "client!ln", name = "K", descriptor = "I")
	private final int anInt5532;

	@OriginalMember(owner = "client!ln", name = "ab", descriptor = "I")
	public final int anInt5545;

	@OriginalMember(owner = "client!ln", name = "S", descriptor = "Lclient!tt;")
	private final Class280 aClass280_3;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class47_Sub2_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static74.method1954(arg1, arg3, arg2) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt5552 = arg8;
		this.anInt5548 = arg0;
		this.anInt5549 = arg6;
		this.anInt5536 = arg9;
		this.anInt5553 = arg10;
		this.aBoolean384 = arg11;
		this.anInt5540 = arg4;
		this.aBoolean383 = false;
		this.anInt5532 = arg7;
		this.anInt5545 = arg5;
		@Pc(77) int local77 = Static529.aClass90_2.method2963(this.anInt5548).anInt3703;
		if (local77 == -1) {
			this.aClass280_3 = null;
		} else {
			this.aClass280_3 = Static6.aClass126_1.method3574(local77);
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(ILclient!qa;)Lclient!in;")
	@Override
	public Class2_Sub6 method7165(@OriginalArg(1) Class9 arg0) {
		@Pc(9) Class19 local9 = this.method4773(2048, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class22 local16 = arg0.method7642();
		local16.KA(this.anInt5556);
		local16.XA(this.anInt5537);
		local16.TA((int) this.aDouble8, (int) this.aDouble6, (int) this.aDouble2);
		if (this.aClass2_Sub3_7 == null) {
			local9.method7258(local16, null, 0);
		} else {
			@Pc(42) Class249 local42 = this.aClass2_Sub3_7.method2067();
			arg0.method7573(local9, local42, local16, null);
		}
		this.anInt5528 = local9.TA();
		this.method4771(arg0, local9);
		return null;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!qa;ILclient!r;)V")
	private void method4771(@OriginalArg(0) Class9 arg0, @OriginalArg(2) Class19 arg1) {
		@Pc(6) Class178[] local6 = arg1.method7251();
		@Pc(9) Class129[] local9 = arg1.method7246();
		if ((this.aClass2_Sub3_7 == null || this.aClass2_Sub3_7.aBoolean161) && (local6 != null || local9 != null)) {
			this.aClass2_Sub3_7 = Static84.method2069(Static416.anInt7252);
		}
		if (this.aClass2_Sub3_7 != null) {
			this.aClass2_Sub3_7.method2077(arg0, (long) Static416.anInt7252, local6, local9);
			this.aClass2_Sub3_7.method2071(super.aByte94, super.aShort115, super.aShort116, super.aShort117, super.aShort114);
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!qa;IB)Z")
	@Override
	public boolean method7157(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IB)V")
	public void method4772(@OriginalArg(0) int arg0) {
		this.aDouble2 += this.aDouble4 * (double) arg0;
		this.aBoolean383 = true;
		this.aDouble8 += this.aDouble1 * (double) arg0;
		if (this.aBoolean384) {
			this.aDouble6 = Static74.method1954(super.aByte94, (int) this.aDouble2, (int) this.aDouble8) - this.anInt5540;
		} else if (this.anInt5532 == -1) {
			this.aDouble6 += (double) arg0 * this.aDouble7;
		} else {
			this.aDouble6 += (double) arg0 * this.aDouble3 * 0.5D * (double) arg0 + this.aDouble7 * (double) arg0;
			this.aDouble7 += this.aDouble3 * (double) arg0;
		}
		this.anInt5537 = (int) (Math.atan2(this.aDouble1, this.aDouble4) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt5556 = (int) (Math.atan2(this.aDouble7, this.aDouble5) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass280_3 == null) {
			return;
		}
		this.anInt5539 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt5539 <= this.aClass280_3.anIntArray630[this.anInt5555]) {
						return;
					}
					this.anInt5539 -= this.aClass280_3.anIntArray630[this.anInt5555];
					this.anInt5555++;
					if (this.aClass280_3.anIntArray629.length <= this.anInt5555) {
						this.anInt5555 -= this.aClass280_3.anInt8105;
						if (this.anInt5555 < 0 || this.anInt5555 >= this.aClass280_3.anIntArray629.length) {
							this.anInt5555 = 0;
						}
					}
					this.lb = this.anInt5555 + 1;
				} while (this.lb < this.aClass280_3.anIntArray629.length);
				this.lb -= this.aClass280_3.anInt8105;
			} while (this.lb >= 0 && this.aClass280_3.anIntArray629.length > this.lb);
			this.lb = -1;
		}
	}

	@OriginalMember(owner = "client!ln", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass2_Sub3_7 != null) {
			this.aClass2_Sub3_7.method2079();
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!qa;)V")
	@Override
	public void method7161(@OriginalArg(1) Class9 arg0) {
		@Pc(9) Class19 local9 = this.method4773(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class22 local15 = arg0.method7642();
		local15.KA(this.anInt5556);
		local15.XA(this.anInt5537);
		local15.TA((int) this.aDouble8, (int) this.aDouble6, (int) this.aDouble2);
		this.anInt5528 = local9.TA();
		this.method4771(arg0, local9);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILclient!qa;)Lclient!r;")
	private Class19 method4773(@OriginalArg(1) int arg0, @OriginalArg(2) Class9 arg1) {
		@Pc(17) Class112 local17 = Static529.aClass90_2.method2963(this.anInt5548);
		return local17.method3309(this.anInt5539, Static6.aClass126_1, this.anInt5555, this.lb, arg0, arg1);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!qa;I)Lclient!pl;")
	@Override
	public Class231 method7163(@OriginalArg(0) Class9 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7156() {
		return false;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIII)V")
	public void method4775(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean383) {
			local9 = arg0 - super.anInt8189;
			@Pc(15) double local15 = (double) (arg3 - super.anInt8191);
			@Pc(24) double local24 = Math.sqrt(local9 * local9 + local15 * local15);
			this.aDouble8 = local9 * (double) this.anInt5552 / local24 + (double) super.anInt8189;
			this.aDouble2 = (double) this.anInt5552 * local15 / local24 + (double) super.anInt8191;
			if (this.aBoolean384) {
				this.aDouble6 = Static74.method1954(super.aByte94, (int) this.aDouble2, (int) this.aDouble8) - this.anInt5540;
			} else {
				this.aDouble6 = super.anInt8192;
			}
		}
		local9 = this.anInt5549 + 1 - arg2;
		this.aDouble4 = ((double) arg3 - this.aDouble2) / local9;
		this.aDouble1 = ((double) arg0 - this.aDouble8) / local9;
		this.aDouble5 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble1 * this.aDouble1);
		if (this.anInt5532 == -1) {
			this.aDouble7 = ((double) arg1 - this.aDouble6) / local9;
		} else {
			if (!this.aBoolean383) {
				this.aDouble7 = -this.aDouble5 * Math.tan((double) this.anInt5532 * 0.02454369D);
			}
			this.aDouble3 = ((double) arg1 - this.aDouble7 * local9 - this.aDouble6) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!ln", name = "f", descriptor = "(I)V")
	@Override
	public void method6952() {
		super.aShort117 = super.aShort114 = (short) (this.aDouble2 / 128.0D);
		super.aShort115 = super.aShort116 = (short) (this.aDouble8 / 128.0D);
	}

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "(B)I")
	@Override
	public int method6953() {
		return this.anInt5528;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
	public void method4777() {
		if (this.aClass2_Sub3_7 != null) {
			this.aClass2_Sub3_7.method2079();
		}
	}

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "(I)V")
	@Override
	public void method7162() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lclient!qa;IZIILclient!co;I)V")
	@Override
	public void method7166(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class47 arg5) {
		throw new IllegalStateException();
	}
}
