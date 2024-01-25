import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bl")
public final class Class1_Sub2_Sub1 extends Class1_Sub2 {

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "I")
	private int anInt537;

	@OriginalMember(owner = "client!bl", name = "B", descriptor = "D")
	private double aDouble1;

	@OriginalMember(owner = "client!bl", name = "E", descriptor = "D")
	private double aDouble2;

	@OriginalMember(owner = "client!bl", name = "F", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!bl", name = "P", descriptor = "Lclient!jg;")
	private Class23_Sub3 aClass23_Sub3_1;

	@OriginalMember(owner = "client!bl", name = "Q", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!bl", name = "U", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!bl", name = "db", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!bl", name = "kb", descriptor = "I")
	private int anInt566;

	@OriginalMember(owner = "client!bl", name = "nb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!bl", name = "ob", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!bl", name = "J", descriptor = "Z")
	private boolean aBoolean27 = false;

	@OriginalMember(owner = "client!bl", name = "N", descriptor = "I")
	private int anInt550 = -32768;

	@OriginalMember(owner = "client!bl", name = "cb", descriptor = "I")
	private int anInt560 = -1;

	@OriginalMember(owner = "client!bl", name = "Z", descriptor = "I")
	private int anInt558 = 0;

	@OriginalMember(owner = "client!bl", name = "mb", descriptor = "I")
	private int anInt567 = 0;

	@OriginalMember(owner = "client!bl", name = "L", descriptor = "I")
	public final int anInt548;

	@OriginalMember(owner = "client!bl", name = "ib", descriptor = "I")
	private final int anInt564;

	@OriginalMember(owner = "client!bl", name = "hb", descriptor = "I")
	public final int anInt563;

	@OriginalMember(owner = "client!bl", name = "bb", descriptor = "I")
	public final int anInt559;

	@OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
	public final int anInt538;

	@OriginalMember(owner = "client!bl", name = "ab", descriptor = "Z")
	private final boolean aBoolean28;

	@OriginalMember(owner = "client!bl", name = "V", descriptor = "I")
	private final int anInt555;

	@OriginalMember(owner = "client!bl", name = "A", descriptor = "I")
	private final int anInt541;

	@OriginalMember(owner = "client!bl", name = "H", descriptor = "I")
	private final int anInt545;

	@OriginalMember(owner = "client!bl", name = "lb", descriptor = "Lclient!vr;")
	private final Class261 lb;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
	public Class1_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) boolean arg11) {
		super(arg1, arg2, Static181.method4212(arg1, arg3, arg2) - arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
		this.anInt548 = arg9;
		this.anInt564 = arg4;
		this.anInt563 = arg5;
		this.aBoolean27 = false;
		this.anInt559 = arg10;
		this.anInt538 = arg6;
		this.aBoolean28 = arg11;
		this.anInt555 = arg8;
		this.anInt541 = arg7;
		this.anInt545 = arg0;
		@Pc(78) int local78 = Static387.aClass201_2.method4775(this.anInt545).anInt1397;
		if (local78 == -1) {
			this.lb = null;
		} else {
			this.lb = Static444.aClass59_3.method1552(local78);
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZI)V")
	public void method545(@OriginalArg(1) int arg0) {
		this.aDouble5 += this.aDouble7 * (double) arg0;
		this.aBoolean27 = true;
		this.aDouble2 += (double) arg0 * this.aDouble4;
		if (this.aBoolean28) {
			this.aDouble6 = Static181.method4212(super.aByte101, (int) this.aDouble2, (int) this.aDouble5) - this.anInt564;
		} else if (this.anInt541 == -1) {
			this.aDouble6 += (double) arg0 * this.aDouble8;
		} else {
			this.aDouble6 += (double) arg0 * 0.5D * this.aDouble3 * (double) arg0 + (double) arg0 * this.aDouble8;
			this.aDouble8 += this.aDouble3 * (double) arg0;
		}
		this.anInt537 = (int) (Math.atan2(this.aDouble7, this.aDouble4) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt566 = (int) (Math.atan2(this.aDouble8, this.aDouble1) * 2607.5945876176133D) & 0x3FFF;
		if (this.lb == null) {
			return;
		}
		this.anInt558 += arg0;
		while (true) {
			do {
				do {
					if (this.lb.anIntArray493[this.anInt567] >= this.anInt558) {
						return;
					}
					this.anInt558 -= this.lb.anIntArray493[this.anInt567];
					this.anInt567++;
					if (this.anInt567 >= this.lb.anIntArray494.length) {
						this.anInt567 -= this.lb.anInt7413;
						if (this.anInt567 < 0 || this.lb.anIntArray494.length <= this.anInt567) {
							this.anInt567 = 0;
						}
					}
					this.anInt560 = this.anInt567 + 1;
				} while (this.lb.anIntArray494.length > this.anInt560);
				this.anInt560 -= this.lb.anInt7413;
			} while (this.anInt560 >= 0 && this.lb.anIntArray494.length > this.anInt560);
			this.anInt560 = -1;
		}
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(B)V")
	public void method546() {
		if (this.aClass23_Sub3_1 != null) {
			this.aClass23_Sub3_1.method2967();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)I")
	@Override
	public int method6184() {
		return this.anInt550;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(BIILclient!qa;)Z")
	@Override
	public boolean method6245(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class167 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(Z)Z")
	@Override
	public boolean method6247() {
		return false;
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(ZLclient!qa;)V")
	@Override
	public void method6241(@OriginalArg(1) Class167 arg0) {
		@Pc(9) Class108 local9 = this.method548(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(19) Class11 local19 = arg0.method5989();
		local19.SA(this.anInt566);
		local19.CA(this.anInt537);
		local19.J((int) this.aDouble5, (int) this.aDouble6, (int) this.aDouble2);
		this.anInt550 = local9.ja();
		this.method549(arg0, local9);
	}

	@OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)V")
	@Override
	public void method6244() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!qa;B)Lclient!ka;")
	private Class108 method548(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		@Pc(14) Class52 local14 = Static387.aClass201_2.method4775(this.anInt545);
		return local14.method1411(arg1, this.anInt567, this.anInt558, arg0, this.anInt560, Static444.aClass59_3);
	}

	@OriginalMember(owner = "client!bl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass23_Sub3_1 != null) {
			this.aClass23_Sub3_1.method2967();
		}
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!qa;)Lclient!ou;")
	@Override
	public Class23_Sub5 method6242(@OriginalArg(1) Class167 arg0) {
		@Pc(9) Class108 local9 = this.method548(2048, arg0);
		if (local9 == null) {
			return null;
		}
		@Pc(16) Class11 local16 = arg0.method5989();
		local16.SA(this.anInt566);
		local16.CA(this.anInt537);
		local16.J((int) this.aDouble5, (int) this.aDouble6, (int) this.aDouble2);
		if (this.aClass23_Sub3_1 == null) {
			local9.method4931(local16, null, 0);
		} else {
			@Pc(46) Class77 local46 = this.aClass23_Sub3_1.method2974();
			arg0.method5999(local9, local46, local16, null);
		}
		this.anInt550 = local9.ja();
		this.method549(arg0, local9);
		return null;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILclient!a;IIILclient!qa;Z)V")
	@Override
	public void method6248(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class167 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lclient!qa;BLclient!ka;)V")
	private void method549(@OriginalArg(0) Class167 arg0, @OriginalArg(2) Class108 arg1) {
		@Pc(6) Class141[] local6 = arg1.method4944();
		@Pc(9) Class95[] local9 = arg1.method4940();
		if ((this.aClass23_Sub3_1 == null || this.aClass23_Sub3_1.aBoolean265) && (local6 != null || local9 != null)) {
			this.aClass23_Sub3_1 = new Class23_Sub3(Static172.anInt3107);
		}
		if (this.aClass23_Sub3_1 != null) {
			this.aClass23_Sub3_1.method2972(arg0, (long) Static172.anInt3107, local6, local9);
			this.aClass23_Sub3_1.method2971(super.aByte101, super.aShort108, super.aShort109, super.aShort107, super.aShort110);
		}
	}

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "(B)V")
	@Override
	public void method6187() {
		super.aShort108 = super.aShort109 = (short) (this.aDouble5 / 128.0D);
		super.aShort107 = super.aShort110 = (short) (this.aDouble2 / 128.0D);
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIII)V")
	public void method551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) double local12;
		if (!this.aBoolean27) {
			local12 = arg3 - super.anInt7560;
			@Pc(19) double local19 = (double) (arg0 - super.anInt7557);
			@Pc(28) double local28 = Math.sqrt(local12 * local12 + local19 * local19);
			this.aDouble5 = (double) this.anInt555 * local12 / local28 + (double) super.anInt7560;
			this.aDouble2 = (double) super.anInt7557 + (double) this.anInt555 * local19 / local28;
			if (this.aBoolean28) {
				this.aDouble6 = Static181.method4212(super.aByte101, (int) this.aDouble2, (int) this.aDouble5) - this.anInt564;
			} else {
				this.aDouble6 = super.anInt7563;
			}
		}
		local12 = this.anInt538 + 1 - arg2;
		this.aDouble7 = ((double) arg3 - this.aDouble5) / local12;
		this.aDouble4 = ((double) arg0 - this.aDouble2) / local12;
		this.aDouble1 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble7 * this.aDouble7);
		if (this.anInt541 == -1) {
			this.aDouble8 = ((double) arg1 - this.aDouble6) / local12;
		} else {
			if (!this.aBoolean27) {
				this.aDouble8 = -this.aDouble1 * Math.tan((double) this.anInt541 * 0.02454369D);
			}
			this.aDouble3 = ((double) arg1 - this.aDouble6 - local12 * this.aDouble8) * 2.0D / (local12 * local12);
		}
	}
}
