import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class4_Sub3_Sub3_Sub4 extends Class4_Sub3_Sub3 {

	@OriginalMember(owner = "client!gv", name = "ob", descriptor = "I")
	private int anInt3595;

	@OriginalMember(owner = "client!gv", name = "pb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!gv", name = "K", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!gv", name = "hb", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!gv", name = "qb", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!gv", name = "U", descriptor = "Lclient!ui;")
	private Class4_Sub8 aClass4_Sub8_6;

	@OriginalMember(owner = "client!gv", name = "Eb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!gv", name = "gb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!gv", name = "yb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!gv", name = "wb", descriptor = "D")
	private double aDouble10;

	@OriginalMember(owner = "client!gv", name = "cb", descriptor = "I")
	private int anInt3627;

	@OriginalMember(owner = "client!gv", name = "ub", descriptor = "I")
	private int anInt3604 = 0;

	@OriginalMember(owner = "client!gv", name = "Gb", descriptor = "Z")
	private boolean aBoolean263 = false;

	@OriginalMember(owner = "client!gv", name = "fb", descriptor = "I")
	private int anInt3613 = 0;

	@OriginalMember(owner = "client!gv", name = "db", descriptor = "Z")
	private boolean aBoolean264 = false;

	@OriginalMember(owner = "client!gv", name = "W", descriptor = "I")
	public final int anInt3596;

	@OriginalMember(owner = "client!gv", name = "xb", descriptor = "I")
	public final int anInt3626;

	@OriginalMember(owner = "client!gv", name = "Bb", descriptor = "I")
	private final int anInt3598;

	@OriginalMember(owner = "client!gv", name = "Fb", descriptor = "I")
	private final int anInt3614;

	@OriginalMember(owner = "client!gv", name = "vb", descriptor = "I")
	private final int anInt3625;

	@OriginalMember(owner = "client!gv", name = "bb", descriptor = "I")
	public final int anInt3602;

	@OriginalMember(owner = "client!gv", name = "kb", descriptor = "I")
	private final int anInt3611;

	@OriginalMember(owner = "client!gv", name = "Q", descriptor = "I")
	private final int anInt3606;

	@OriginalMember(owner = "client!gv", name = "mb", descriptor = "I")
	public final int anInt3603;

	@OriginalMember(owner = "client!gv", name = "sb", descriptor = "I")
	private final int anInt3616;

	@OriginalMember(owner = "client!gv", name = "Db", descriptor = "Z")
	private final boolean aBoolean262;

	@OriginalMember(owner = "client!gv", name = "ab", descriptor = "Lclient!jaa;")
	private Class181 aClass181_9;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class4_Sub3_Sub3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static388.method5919(arg4, arg3, arg1) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt3596 = arg6;
		this.anInt3626 = arg7;
		this.anInt3598 = arg10;
		this.aBoolean264 = false;
		this.anInt3614 = arg8;
		this.anInt3625 = arg0;
		this.anInt3602 = arg12;
		this.anInt3611 = arg14;
		this.anInt3606 = arg9;
		this.anInt3603 = arg11;
		this.anInt3616 = arg5;
		this.aBoolean262 = arg13;
		@Pc(82) int local82 = Static453.aClass281_2.method6686(this.anInt3625).anInt5538;
		this.aClass181_9 = new Class181_Sub2(this, false);
		this.aClass181_9.method8964(local82, 0);
	}

	@OriginalMember(owner = "client!gv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass4_Sub8_6 != null) {
			this.aClass4_Sub8_6.method8680();
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!ha;BIIZLclient!haa;I)V")
	@Override
	public void method9480(@OriginalArg(0) Class144 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class4_Sub3 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(BILclient!ha;)Lclient!ka;")
	private Class129 method3079(@OriginalArg(1) int arg0, @OriginalArg(2) Class144 arg1) {
		@Pc(17) Class203 local17 = Static453.aClass281_2.method6686(this.anInt3625);
		return local17.method5003(arg0, (byte) 2, arg1, this.aClass181_9);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lclient!ha;Z)V")
	@Override
	public void method9490(@OriginalArg(0) Class144 arg0) {
		@Pc(9) Class129 local9 = this.method3079(0, arg0);
		if (local9 == null) {
			return;
		}
		@Pc(16) Class263 local16 = arg0.method6907();
		local16.method8436(this.anInt3627);
		local16.method8435(this.anInt3595);
		local16.method8442((int) this.aDouble8, (int) this.aDouble3, (int) this.aDouble6);
		this.anInt3604 = local9.fa();
		this.anInt3613 = local9.ma();
		this.method3085(local16, local9, arg0);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IZILclient!ha;)Z")
	@Override
	public boolean method9478(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class144 arg2) {
		return false;
	}

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "(I)I")
	@Override
	public int method9479() {
		return this.anInt3604;
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)V")
	public void method3081() {
		if (this.aClass4_Sub8_6 != null) {
			this.aClass4_Sub8_6.method8680();
		}
	}

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method9476() {
		return this.aBoolean263;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(BI)V")
	public void method3083(@OriginalArg(1) int arg0) {
		this.aDouble6 += (double) arg0 * this.aDouble10;
		this.aDouble8 += this.aDouble5 * (double) arg0;
		this.aBoolean264 = true;
		if (this.aBoolean262) {
			this.aDouble3 = (double) (Static388.method5919((int) this.aDouble6, (int) this.aDouble8, super.aByte146) - this.anInt3616);
		} else if (this.anInt3614 == -1) {
			this.aDouble3 += (double) arg0 * this.aDouble7;
		} else {
			this.aDouble3 += (double) arg0 * this.aDouble9 * 0.5D * (double) arg0 + (double) arg0 * this.aDouble7;
			this.aDouble7 += this.aDouble9 * (double) arg0;
		}
		this.anInt3595 = (int) (Math.atan2(this.aDouble5, this.aDouble10) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt3627 = (int) (Math.atan2(this.aDouble7, this.aDouble4) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass181_9.method8961(1) && this.aClass181_9.method8962()) {
			this.aClass181_9.method8942();
		}
	}

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "(I)Z")
	@Override
	public boolean method9489() {
		return false;
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(ILclient!ha;)Lclient!w;")
	@Override
	public Class4_Sub9 method9491(@OriginalArg(1) Class144 arg0) {
		@Pc(11) Class129 local11 = this.method3079(2048, arg0);
		if (local11 == null) {
			return null;
		}
		@Pc(27) Class263 local27 = arg0.method6907();
		local27.method8436(this.anInt3627);
		local27.method8435(this.anInt3595);
		local27.method8442((int) this.aDouble8, (int) this.aDouble3, (int) this.aDouble6);
		this.method3085(local27, local11, arg0);
		@Pc(57) Class4_Sub9 local57 = Static272.method7693(1, false);
		if (Static6.aBoolean9) {
			local11.method5289(local27, local57.aClass4_Sub1Array1[0], Static481.anInt10749, 0);
		} else {
			local11.method5307(local27, local57.aClass4_Sub1Array1[0], 0);
		}
		if (this.aClass4_Sub8_6 != null) {
			@Pc(89) Class304 local89 = this.aClass4_Sub8_6.method8671();
			if (Static6.aBoolean9) {
				arg0.method6902(local89, Static481.anInt10749);
			} else {
				arg0.method6903(local89);
			}
		}
		this.aBoolean263 = local11.F();
		this.anInt3604 = local11.fa();
		this.anInt3613 = local11.ma();
		return local57;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIBII)V")
	public void method3084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) double local13;
		if (!this.aBoolean264) {
			local13 = (double) (arg0 - super.anInt11184);
			@Pc(20) double local20 = (double) (arg3 - super.anInt11178);
			@Pc(29) double local29 = Math.sqrt(local13 * local13 + local20 * local20);
			this.aDouble8 = (double) super.anInt11184 + (double) this.anInt3606 * local13 / local29;
			this.aDouble6 = (double) super.anInt11178 + (double) this.anInt3606 * local20 / local29;
			if (this.aBoolean262) {
				this.aDouble3 = (double) (Static388.method5919((int) this.aDouble6, (int) this.aDouble8, super.aByte146) - this.anInt3616);
			} else {
				this.aDouble3 = (double) super.anInt11182;
			}
		}
		local13 = (double) (this.anInt3626 + 1 - arg2);
		this.aDouble10 = ((double) arg3 - this.aDouble6) / local13;
		this.aDouble5 = ((double) arg0 - this.aDouble8) / local13;
		this.aDouble4 = Math.sqrt(this.aDouble10 * this.aDouble10 + this.aDouble5 * this.aDouble5);
		if (this.anInt3614 == -1) {
			this.aDouble7 = ((double) arg1 - this.aDouble3) / local13;
		} else {
			if (!this.aBoolean264) {
				this.aDouble7 = -this.aDouble4 * Math.tan((double) this.anInt3614 * 0.02454369D);
			}
			this.aDouble9 = ((double) arg1 - this.aDouble3 - local13 * this.aDouble7) * 2.0D / (local13 * local13);
		}
	}

	@OriginalMember(owner = "client!gv", name = "b", descriptor = "(Lclient!ha;I)Lclient!th;")
	@Override
	public Class348 method9492(@OriginalArg(0) Class144 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!gv", name = "k", descriptor = "(I)V")
	@Override
	public void method9482() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "(B)V")
	@Override
	public void method8782() {
		super.aShort108 = super.aShort107 = (short) (int) (this.aDouble8 / 512.0D);
		super.aShort109 = super.aShort110 = (short) (int) (this.aDouble6 / 512.0D);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILclient!rd;Lclient!ka;Lclient!ha;)V")
	private void method3085(@OriginalArg(1) Class263 arg0, @OriginalArg(2) Class129 arg1, @OriginalArg(3) Class144 arg2) {
		arg1.method5294(arg0);
		@Pc(9) Class352[] local9 = arg1.method5304();
		@Pc(19) Class172[] local19 = arg1.method5310();
		if ((this.aClass4_Sub8_6 == null || this.aClass4_Sub8_6.aBoolean705) && (local9 != null || local19 != null)) {
			this.aClass4_Sub8_6 = Static616.method8682(Static530.anInt9105, true);
		}
		if (this.aClass4_Sub8_6 != null) {
			this.aClass4_Sub8_6.method8667(arg2, (long) Static530.anInt9105, local9, local19);
			this.aClass4_Sub8_6.method8670(super.aByte146, super.aShort108, super.aShort107, super.aShort109, super.aShort110);
		}
	}

	@OriginalMember(owner = "client!gv", name = "d", descriptor = "(I)I")
	@Override
	public int method9485(@OriginalArg(0) int arg0) {
		if (arg0 != 14603) {
			this.aClass181_9 = null;
		}
		return this.anInt3613;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)V")
	public void method3086() {
		if (this.aBoolean264 || this.anInt3598 == 0) {
			return;
		}
		@Pc(24) Class4_Sub3_Sub3_Sub3 local24 = null;
		@Pc(36) int local36;
		if (this.anInt3598 < 0) {
			local36 = -this.anInt3598 - 1;
			if (Static597.anInt9858 == local36) {
				local24 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1;
			} else {
				local24 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local36];
			}
		} else {
			local36 = this.anInt3598 - 1;
			@Pc(59) Class14_Sub44 local59 = (Class14_Sub44) Static100.aClass125_9.method2630((long) local36);
			if (local59 != null) {
				local24 = local59.aClass4_Sub3_Sub3_Sub3_Sub1_2;
			}
		}
		if (local24 == null) {
			return;
		}
		super.anInt11178 = local24.anInt11178;
		super.anInt11184 = local24.anInt11184;
		super.anInt11182 = Static388.method5919(local24.anInt11178, local24.anInt11184, super.aByte146) - this.anInt3616;
		if (this.anInt3611 < 0) {
			return;
		}
		@Pc(100) Class141 local100 = local24.method2865();
		@Pc(102) int local102 = 0;
		@Pc(104) int local104 = 0;
		if (local100.anIntArrayArray24 != null && local100.anIntArrayArray24[this.anInt3611] != null) {
			local104 = local100.anIntArrayArray24[this.anInt3611][2];
			local102 = local100.anIntArrayArray24[this.anInt3611][0];
		}
		if (local100.anIntArrayArray23 != null && local100.anIntArrayArray23[this.anInt3611] != null) {
			local102 += local100.anIntArrayArray23[this.anInt3611][0];
			local104 += local100.anIntArrayArray23[this.anInt3611][2];
		}
		if (local102 != 0 || local104 != 0) {
			@Pc(177) int local177 = local24.aClass200_7.method4987();
			@Pc(179) int local179 = local177;
			if (local24.anIntArray199 != null && local24.anIntArray199[this.anInt3611] != -1) {
				local179 = local24.anIntArray199[this.anInt3611];
			}
			@Pc(205) int local205 = local179 - local177 & 0x3FFF;
			@Pc(209) int local209 = Class141.anIntArray207[local205];
			@Pc(213) int local213 = Class141.anIntArray208[local205];
			@Pc(223) int local223 = local213 * local102 + local209 * local104 >> 14;
			local104 = local104 * local213 - local209 * local102 >> 14;
			super.anInt11178 += local104;
			super.anInt11184 += local223;
		}
		return;
	}

	@OriginalMember(owner = "client!gv", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method9483() {
		return false;
	}
}
