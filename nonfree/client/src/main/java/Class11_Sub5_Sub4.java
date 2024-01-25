import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class11_Sub5_Sub4 extends Class11_Sub5 {

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "Lclient!bn;")
	private Class28_Sub1 aClass28_Sub1_5;

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!pd", name = "D", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!pd", name = "G", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!pd", name = "K", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
	private int anInt5564;

	@OriginalMember(owner = "client!pd", name = "O", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!pd", name = "S", descriptor = "D")
	private double aDouble10;

	@OriginalMember(owner = "client!pd", name = "T", descriptor = "D")
	private double aDouble11;

	@OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
	private int anInt5578;

	@OriginalMember(owner = "client!pd", name = "Q", descriptor = "Z")
	private boolean aBoolean392 = false;

	@OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
	private int anInt5570 = -32768;

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "I")
	private int anInt5553 = 0;

	@OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
	private int anInt5572 = 0;

	@OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
	private int anInt5560 = -1;

	@OriginalMember(owner = "client!pd", name = "fb", descriptor = "Z")
	private final boolean aBoolean393;

	@OriginalMember(owner = "client!pd", name = "B", descriptor = "I")
	public final int anInt5558;

	@OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
	public final int anInt5569;

	@OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
	private final int anInt5562;

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "I")
	public final int anInt5554;

	@OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
	private final int anInt5573;

	@OriginalMember(owner = "client!pd", name = "jb", descriptor = "I")
	public final int anInt5582;

	@OriginalMember(owner = "client!pd", name = "gb", descriptor = "I")
	private final int anInt5579;

	@OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
	private final int anInt5559;

	@OriginalMember(owner = "client!pd", name = "J", descriptor = "Lclient!hg;")
	private final Class109 aClass109_3;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class11_Sub5_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static365.method3535(arg1, arg2, arg3) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.aBoolean393 = arg11;
		this.anInt5558 = arg10;
		this.anInt5569 = arg6;
		this.anInt5562 = arg8;
		this.anInt5554 = arg5;
		this.aBoolean392 = false;
		this.anInt5573 = arg4;
		this.anInt5582 = arg9;
		this.anInt5579 = arg0;
		this.anInt5559 = arg7;
		@Pc(77) int local77 = Static399.aClass100_2.method2197(this.anInt5579).anInt3448;
		if (local77 == -1) {
			this.aClass109_3 = null;
		} else {
			this.aClass109_3 = Static37.aClass80_1.method1879(local77);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!za;IZBILclient!bm;)V")
	@Override
	public void method6207(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class11 arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIII)V")
	public void method4434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) double local9;
		if (!this.aBoolean392) {
			local9 = arg2 - super.anInt7626;
			@Pc(16) double local16 = (double) (arg3 - super.anInt7622);
			@Pc(25) double local25 = Math.sqrt(local16 * local16 + local9 * local9);
			this.aDouble7 = local16 * (double) this.anInt5562 / local25 + (double) super.anInt7622;
			this.aDouble5 = (double) super.anInt7626 + (double) this.anInt5562 * local9 / local25;
			if (this.aBoolean393) {
				this.aDouble10 = Static365.method3535(super.aByte101, (int) this.aDouble5, (int) this.aDouble7) - this.anInt5573;
			} else {
				this.aDouble10 = super.anInt7624;
			}
		}
		local9 = this.anInt5569 + 1 - arg0;
		this.aDouble9 = ((double) arg2 - this.aDouble5) / local9;
		this.aDouble4 = ((double) arg3 - this.aDouble7) / local9;
		this.aDouble8 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble9 * this.aDouble9);
		if (this.anInt5559 == -1) {
			this.aDouble11 = ((double) arg1 - this.aDouble10) / local9;
		} else {
			if (!this.aBoolean392) {
				this.aDouble11 = -this.aDouble8 * Math.tan((double) this.anInt5559 * 0.02454369D);
			}
			this.aDouble6 = ((double) arg1 - this.aDouble11 * local9 - this.aDouble10) * 2.0D / (local9 * local9);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!e;Lclient!za;)V")
	private void method4435(@OriginalArg(1) Class63 arg0, @OriginalArg(2) Class75 arg1) {
		@Pc(6) Class191[] local6 = arg0.method6288();
		@Pc(9) Class254[] local9 = arg0.method6291();
		if ((this.aClass28_Sub1_5 == null || this.aClass28_Sub1_5.aBoolean24) && (local6 != null || local9 != null)) {
			this.aClass28_Sub1_5 = new Class28_Sub1(Static277.anInt5022);
		}
		if (this.aClass28_Sub1_5 != null) {
			this.aClass28_Sub1_5.method534(arg1, (long) Static277.anInt5022, local6, local9);
			this.aClass28_Sub1_5.method531(super.aByte101, super.aShort108, super.aShort107, super.aShort109, super.aShort106);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIILclient!za;)Z")
	@Override
	public boolean method6209(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class75 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	public void method4436() {
		if (this.aClass28_Sub1_5 != null) {
			this.aClass28_Sub1_5.method538();
		}
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(Z)I")
	@Override
	public int method6213() {
		return this.anInt5570;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6211() {
		return false;
	}

	@OriginalMember(owner = "client!pd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass28_Sub1_5 != null) {
			this.aClass28_Sub1_5.method538();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILclient!za;)Lclient!e;")
	private Class63 method4437(@OriginalArg(0) int arg0, @OriginalArg(2) Class75 arg1) {
		@Pc(9) Class139 local9 = Static399.aClass100_2.method2197(this.anInt5579);
		return local9.method2836(arg1, this.anInt5572, arg0, this.anInt5560, Static37.aClass80_1, this.anInt5553);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)V")
	public void method4438(@OriginalArg(0) int arg0) {
		this.aDouble5 += (double) arg0 * this.aDouble9;
		this.aBoolean392 = true;
		this.aDouble7 += (double) arg0 * this.aDouble4;
		if (this.aBoolean393) {
			this.aDouble10 = Static365.method3535(super.aByte101, (int) this.aDouble5, (int) this.aDouble7) - this.anInt5573;
		} else if (this.anInt5559 == -1) {
			this.aDouble10 += this.aDouble11 * (double) arg0;
		} else {
			this.aDouble10 += (double) arg0 * this.aDouble6 * 0.5D * (double) arg0 + (double) arg0 * this.aDouble11;
			this.aDouble11 += this.aDouble6 * (double) arg0;
		}
		this.anInt5564 = (int) (Math.atan2(this.aDouble9, this.aDouble4) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt5578 = (int) (Math.atan2(this.aDouble11, this.aDouble8) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass109_3 == null) {
			return;
		}
		this.anInt5572 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass109_3.anIntArray238[this.anInt5553] >= this.anInt5572) {
						return;
					}
					this.anInt5572 -= this.aClass109_3.anIntArray238[this.anInt5553];
					this.anInt5553++;
					if (this.anInt5553 >= this.aClass109_3.anIntArray240.length) {
						this.anInt5553 -= this.aClass109_3.anInt2785;
						if (this.anInt5553 < 0 || this.anInt5553 >= this.aClass109_3.anIntArray240.length) {
							this.anInt5553 = 0;
						}
					}
					this.anInt5560 = this.anInt5553 + 1;
				} while (this.anInt5560 < this.aClass109_3.anIntArray240.length);
				this.anInt5560 -= this.aClass109_3.anInt2785;
			} while (this.anInt5560 >= 0 && this.aClass109_3.anIntArray240.length > this.anInt5560);
			this.anInt5560 = -1;
		}
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V")
	@Override
	public void method6214() {
		super.aShort109 = super.aShort106 = (short) (this.aDouble7 / 128.0D);
		super.aShort108 = super.aShort107 = (short) (this.aDouble5 / 128.0D);
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(ILclient!za;)V")
	@Override
	public void method6210(@OriginalArg(1) Class75 arg0) {
		@Pc(13) Class63 local13 = this.method4437(0, arg0);
		if (local13 == null) {
			return;
		}
		@Pc(19) Class6 local19 = arg0.method5990();
		local19.g(this.anInt5578);
		local19.EA(this.anInt5564);
		local19.W((int) this.aDouble5, (int) this.aDouble10, (int) this.aDouble7);
		this.anInt5570 = local13.B();
		this.method4435(local13, arg0);
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(ILclient!za;)Lclient!on;")
	@Override
	public Class28_Sub5 method6205(@OriginalArg(1) Class75 arg0) {
		@Pc(17) Class63 local17 = this.method4437(2048, arg0);
		if (local17 == null) {
			return null;
		}
		@Pc(24) Class6 local24 = arg0.method5990();
		local24.g(this.anInt5578);
		local24.EA(this.anInt5564);
		local24.W((int) this.aDouble5, (int) this.aDouble10, (int) this.aDouble7);
		if (this.aClass28_Sub1_5 == null) {
			local17.method6293(local24, null, 0);
		} else {
			@Pc(50) Class56 local50 = this.aClass28_Sub1_5.method536();
			arg0.method5960(local17, local50, local24, null);
		}
		this.anInt5570 = local17.B();
		this.method4435(local17, arg0);
		return null;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
	@Override
	public void method6208() {
		throw new IllegalStateException();
	}
}
