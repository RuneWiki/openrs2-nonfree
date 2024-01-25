import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!gu", name = "D", descriptor = "Lclient!td;")
	private Class88_Sub6 aClass88_Sub6_2;

	@OriginalMember(owner = "client!gu", name = "E", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!gu", name = "I", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!gu", name = "J", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!gu", name = "L", descriptor = "I")
	private int anInt2616;

	@OriginalMember(owner = "client!gu", name = "N", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!gu", name = "X", descriptor = "I")
	private int anInt2624;

	@OriginalMember(owner = "client!gu", name = "Z", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!gu", name = "bb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!gu", name = "lb", descriptor = "D")
	private double lb;

	@OriginalMember(owner = "client!gu", name = "ob", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!gu", name = "C", descriptor = "Z")
	private boolean aBoolean170 = false;

	@OriginalMember(owner = "client!gu", name = "O", descriptor = "I")
	private int anInt2617 = -32768;

	@OriginalMember(owner = "client!gu", name = "kb", descriptor = "I")
	private int anInt2633 = 0;

	@OriginalMember(owner = "client!gu", name = "mb", descriptor = "I")
	private int anInt2634 = -1;

	@OriginalMember(owner = "client!gu", name = "qb", descriptor = "I")
	private int anInt2636 = 0;

	@OriginalMember(owner = "client!gu", name = "U", descriptor = "Z")
	private final boolean aBoolean171;

	@OriginalMember(owner = "client!gu", name = "K", descriptor = "I")
	private final int anInt2615;

	@OriginalMember(owner = "client!gu", name = "H", descriptor = "I")
	public final int anInt2614;

	@OriginalMember(owner = "client!gu", name = "Q", descriptor = "I")
	public final int anInt2619;

	@OriginalMember(owner = "client!gu", name = "y", descriptor = "I")
	private final int anInt2609;

	@OriginalMember(owner = "client!gu", name = "P", descriptor = "I")
	public final int anInt2618;

	@OriginalMember(owner = "client!gu", name = "T", descriptor = "I")
	public final int anInt2621;

	@OriginalMember(owner = "client!gu", name = "R", descriptor = "I")
	private final int anInt2620;

	@OriginalMember(owner = "client!gu", name = "W", descriptor = "I")
	private final int anInt2623;

	@OriginalMember(owner = "client!gu", name = "hb", descriptor = "Lclient!kt;")
	private final Class143 aClass143_2;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class2_Sub1_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static192.method2572(arg3, arg2, arg1) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.aBoolean170 = false;
		this.aBoolean171 = arg11;
		this.anInt2615 = arg7;
		this.anInt2614 = arg6;
		this.anInt2619 = arg10;
		this.anInt2609 = arg8;
		this.anInt2618 = arg5;
		this.anInt2621 = arg9;
		this.anInt2620 = arg4;
		this.anInt2623 = arg0;
		@Pc(78) int local78 = Static3.aClass203_1.method4360(this.anInt2623).anInt1705;
		if (local78 == -1) {
			this.aClass143_2 = null;
		} else {
			this.aClass143_2 = Static271.aClass219_4.method4752(local78);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!e;BLclient!za;)V")
	private void method2116(@OriginalArg(0) Class57 arg0, @OriginalArg(2) Class200 arg1) {
		@Pc(12) Class179[] local12 = arg0.method6073();
		@Pc(15) Class236[] local15 = arg0.method6064();
		if ((this.aClass88_Sub6_2 == null || this.aClass88_Sub6_2.aBoolean420) && (local12 != null || local15 != null)) {
			this.aClass88_Sub6_2 = new Class88_Sub6(Static85.anInt1536);
		}
		if (this.aClass88_Sub6_2 != null) {
			this.aClass88_Sub6_2.method5042(arg1, (long) Static85.anInt1536, local12, local15);
			this.aClass88_Sub6_2.method5052(super.aByte105, super.aShort107, super.aShort104, super.aShort106, super.aShort105);
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(ILclient!za;)Lclient!hp;")
	@Override
	public Class88_Sub2 method6025(@OriginalArg(1) Class200 arg0) {
		@Pc(13) Class57 local13 = this.method2120(arg0, 2048);
		if (local13 == null) {
			return null;
		}
		@Pc(20) Class29 local20 = arg0.method5866();
		local20.g(this.anInt2616);
		local20.EA(this.anInt2624);
		local20.W((int) this.aDouble2, (int) this.aDouble7, (int) this.aDouble4);
		if (this.aClass88_Sub6_2 == null) {
			local13.method6060(local20, null, 0);
		} else {
			@Pc(46) Class255 local46 = this.aClass88_Sub6_2.method5045();
			arg0.method5869(local13, local46, local20, null);
		}
		this.anInt2617 = local13.B();
		this.method2116(local13, arg0);
		return null;
	}

	@OriginalMember(owner = "client!gu", name = "f", descriptor = "(I)V")
	@Override
	public void method6032() {
		super.aShort106 = super.aShort105 = (short) (this.aDouble4 / 128.0D);
		super.aShort107 = super.aShort104 = (short) (this.aDouble2 / 128.0D);
	}

	@OriginalMember(owner = "client!gu", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass88_Sub6_2 != null) {
			this.aClass88_Sub6_2.method5051();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IZ)V")
	public void method2117(@OriginalArg(0) int arg0) {
		this.aDouble2 += (double) arg0 * this.aDouble6;
		this.aDouble4 += this.aDouble1 * (double) arg0;
		this.aBoolean170 = true;
		if (this.aBoolean171) {
			this.aDouble7 = Static192.method2572((int) this.aDouble4, (int) this.aDouble2, super.aByte105) - this.anInt2620;
		} else if (this.anInt2615 == -1) {
			this.aDouble7 += (double) arg0 * this.aDouble3;
		} else {
			this.aDouble7 += (double) arg0 * 0.5D * this.lb * (double) arg0 + this.aDouble3 * (double) arg0;
			this.aDouble3 += this.lb * (double) arg0;
		}
		this.anInt2624 = (int) (Math.atan2(this.aDouble6, this.aDouble1) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt2616 = (int) (Math.atan2(this.aDouble3, this.aDouble5) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass143_2 == null) {
			return;
		}
		this.anInt2633 += arg0;
		while (true) {
			do {
				do {
					if (this.aClass143_2.anIntArray239[this.anInt2636] >= this.anInt2633) {
						return;
					}
					this.anInt2633 -= this.aClass143_2.anIntArray239[this.anInt2636];
					this.anInt2636++;
					if (this.aClass143_2.anIntArray241.length <= this.anInt2636) {
						this.anInt2636 -= this.aClass143_2.anInt3784;
						if (this.anInt2636 < 0 || this.aClass143_2.anIntArray241.length <= this.anInt2636) {
							this.anInt2636 = 0;
						}
					}
					this.anInt2634 = this.anInt2636 + 1;
				} while (this.aClass143_2.anIntArray241.length > this.anInt2634);
				this.anInt2634 -= this.aClass143_2.anInt3784;
			} while (this.anInt2634 >= 0 && this.anInt2634 < this.aClass143_2.anIntArray241.length);
			this.anInt2634 = -1;
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
	public void method2118() {
		if (this.aClass88_Sub6_2 != null) {
			this.aClass88_Sub6_2.method5051();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIII)V")
	public void method2119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean170) {
			local13 = arg3 - super.anInt7500;
			@Pc(20) double local20 = (double) (arg2 - super.anInt7502);
			@Pc(29) double local29 = Math.sqrt(local20 * local20 + local13 * local13);
			this.aDouble4 = local20 * (double) this.anInt2609 / local29 + (double) super.anInt7502;
			this.aDouble2 = (double) this.anInt2609 * local13 / local29 + (double) super.anInt7500;
			if (this.aBoolean171) {
				this.aDouble7 = Static192.method2572((int) this.aDouble4, (int) this.aDouble2, super.aByte105) - this.anInt2620;
			} else {
				this.aDouble7 = super.anInt7501;
			}
		}
		local13 = this.anInt2614 + 1 - arg1;
		this.aDouble1 = ((double) arg2 - this.aDouble4) / local13;
		this.aDouble6 = ((double) arg3 - this.aDouble2) / local13;
		this.aDouble5 = Math.sqrt(this.aDouble6 * this.aDouble6 + this.aDouble1 * this.aDouble1);
		if (this.anInt2615 == -1) {
			this.aDouble3 = ((double) arg0 - this.aDouble7) / local13;
		} else {
			if (!this.aBoolean170) {
				this.aDouble3 = -this.aDouble5 * Math.tan((double) this.anInt2615 * 0.02454369D);
			}
			this.lb = ((double) arg0 - this.aDouble7 - local13 * this.aDouble3) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!za;III)Z")
	@Override
	public boolean method6019(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)I")
	@Override
	public int method6031() {
		return this.anInt2617;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(Lclient!za;IIILclient!ps;IZ)V")
	@Override
	public void method6023(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class2 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!za;)V")
	@Override
	public void method6021(@OriginalArg(1) Class200 arg0) {
		@Pc(9) Class57 local9 = this.method2120(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class29 local15 = arg0.method5866();
		local15.g(this.anInt2616);
		local15.EA(this.anInt2624);
		local15.W((int) this.aDouble2, (int) this.aDouble7, (int) this.aDouble4);
		this.anInt2617 = local9.B();
		this.method2116(local9, arg0);
	}

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)V")
	@Override
	public void method6022() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	private Class57 method2120(@OriginalArg(1) Class200 arg0, @OriginalArg(2) int arg1) {
		@Pc(19) Class63 local19 = Static3.aClass203_1.method4360(this.anInt2623);
		return local19.method1392(arg1, Static271.aClass219_4, this.anInt2634, this.anInt2633, this.anInt2636, arg0);
	}

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6024() {
		return false;
	}
}
