import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iga")
public final class Class16_Sub1_Sub1_Sub5 extends Class16_Sub1_Sub1 {

	@OriginalMember(owner = "client!iga", name = "db", descriptor = "I")
	private int anInt4323;

	@OriginalMember(owner = "client!iga", name = "eb", descriptor = "D")
	private double aDouble3;

	@OriginalMember(owner = "client!iga", name = "sb", descriptor = "D")
	private double aDouble4;

	@OriginalMember(owner = "client!iga", name = "ub", descriptor = "D")
	private double aDouble5;

	@OriginalMember(owner = "client!iga", name = "Ab", descriptor = "D")
	private double aDouble6;

	@OriginalMember(owner = "client!iga", name = "Db", descriptor = "I")
	private int anInt4340;

	@OriginalMember(owner = "client!iga", name = "Jb", descriptor = "D")
	private double aDouble7;

	@OriginalMember(owner = "client!iga", name = "Nb", descriptor = "D")
	private double aDouble8;

	@OriginalMember(owner = "client!iga", name = "Qb", descriptor = "D")
	private double aDouble9;

	@OriginalMember(owner = "client!iga", name = "Tb", descriptor = "Lclient!od;")
	private Class16_Sub7 aClass16_Sub7_5;

	@OriginalMember(owner = "client!iga", name = "Ub", descriptor = "D")
	private double aDouble10;

	@OriginalMember(owner = "client!iga", name = "vb", descriptor = "Z")
	private boolean aBoolean319 = false;

	@OriginalMember(owner = "client!iga", name = "Ib", descriptor = "I")
	private int anInt4344 = 0;

	@OriginalMember(owner = "client!iga", name = "yb", descriptor = "I")
	private int anInt4337 = -1;

	@OriginalMember(owner = "client!iga", name = "Lb", descriptor = "I")
	private int anInt4346 = 0;

	@OriginalMember(owner = "client!iga", name = "Rb", descriptor = "Z")
	private boolean aBoolean322 = false;

	@OriginalMember(owner = "client!iga", name = "xb", descriptor = "I")
	private int anInt4336 = 0;

	@OriginalMember(owner = "client!iga", name = "Sb", descriptor = "I")
	private int anInt4350 = 0;

	@OriginalMember(owner = "client!iga", name = "kb", descriptor = "I")
	private final int anInt4328;

	@OriginalMember(owner = "client!iga", name = "W", descriptor = "I")
	private final int anInt4317;

	@OriginalMember(owner = "client!iga", name = "nb", descriptor = "I")
	private final int anInt4330;

	@OriginalMember(owner = "client!iga", name = "Kb", descriptor = "I")
	public final int anInt4345;

	@OriginalMember(owner = "client!iga", name = "Cb", descriptor = "I")
	public final int anInt4339;

	@OriginalMember(owner = "client!iga", name = "ab", descriptor = "I")
	public final int anInt4321;

	@OriginalMember(owner = "client!iga", name = "Eb", descriptor = "I")
	private final int anInt4341;

	@OriginalMember(owner = "client!iga", name = "S", descriptor = "I")
	public final int anInt4314;

	@OriginalMember(owner = "client!iga", name = "U", descriptor = "I")
	private final int anInt4315;

	@OriginalMember(owner = "client!iga", name = "tb", descriptor = "Z")
	private final boolean aBoolean318;

	@OriginalMember(owner = "client!iga", name = "Hb", descriptor = "I")
	private final int anInt4343;

	@OriginalMember(owner = "client!iga", name = "jb", descriptor = "Lclient!mk;")
	private final Class228 aClass228_2;

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(IIIIIIIIIIIIIZI)V")
	public Class16_Sub1_Sub1_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) boolean arg13, @OriginalArg(14) int arg14) {
		super(arg1, arg2, arg3, Static392.method5799(arg1, arg3, arg4) - arg5, arg4, arg3 >> 9, arg3 >> 9, arg4 >> 9, arg4 >> 9, false, (byte) 0);
		this.anInt4328 = arg14;
		this.anInt4317 = arg0;
		this.anInt4330 = arg10;
		this.anInt4345 = arg7;
		this.aBoolean322 = false;
		this.anInt4339 = arg6;
		this.anInt4321 = arg11;
		this.anInt4341 = arg5;
		this.anInt4314 = arg12;
		this.anInt4315 = arg9;
		this.aBoolean318 = arg13;
		this.anInt4343 = arg8;
		@Pc(90) int local90 = Static546.aClass263_1.method6113(this.anInt4317).anInt9829;
		if (local90 == -1) {
			this.aClass228_2 = null;
		} else {
			this.aClass228_2 = Static479.aClass308_2.method7075(local90);
		}
	}

	@OriginalMember(owner = "client!iga", name = "h", descriptor = "(I)I")
	@Override
	public int method6988(@OriginalArg(0) int arg0) {
		if (arg0 != 1027) {
			Static236.method3799((String) null, -50, (String) null);
		}
		return this.anInt4350;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(Z)V")
	public void method3792() {
		if (this.aClass16_Sub7_5 != null) {
			this.aClass16_Sub7_5.method5990();
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IILclient!rba;Lclient!ha;ZII)V")
	@Override
	public void method6984(@OriginalArg(1) int arg0, @OriginalArg(2) Class16_Sub1 arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!iga", name = "d", descriptor = "(B)I")
	@Override
	public int method6980() {
		return this.anInt4344;
	}

	@OriginalMember(owner = "client!iga", name = "f", descriptor = "(B)V")
	@Override
	public void method6987() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(BILclient!ha;I)Z")
	@Override
	public boolean method6985(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(BI)V")
	public void method3794(@OriginalArg(1) int arg0) {
		this.aDouble9 += (double) arg0 * this.aDouble10;
		this.aDouble8 += (double) arg0 * this.aDouble7;
		this.aBoolean322 = true;
		if (this.aBoolean318) {
			this.aDouble3 = (double) (Static392.method5799(super.aByte109, (int) this.aDouble8, (int) this.aDouble9) - this.anInt4341);
		} else if (this.anInt4343 == -1) {
			this.aDouble3 += this.aDouble6 * (double) arg0;
		} else {
			this.aDouble3 += this.aDouble5 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.aDouble6;
			this.aDouble6 += (double) arg0 * this.aDouble5;
		}
		this.anInt4323 = (int) (Math.atan2(this.aDouble7, this.aDouble10) * 2607.5945876176133D) + 8192 & 0x3FFF;
		this.anInt4340 = (int) (Math.atan2(this.aDouble6, this.aDouble4) * 2607.5945876176133D) & 0x3FFF;
		if (this.aClass228_2 == null) {
			return;
		}
		this.anInt4336 += arg0;
		while (true) {
			do {
				do {
					if (this.anInt4336 <= this.aClass228_2.anIntArray404[this.anInt4346]) {
						return;
					}
					this.anInt4336 -= this.aClass228_2.anIntArray404[this.anInt4346];
					this.anInt4346++;
					if (this.anInt4346 >= this.aClass228_2.anIntArray403.length) {
						this.anInt4346 -= this.aClass228_2.anInt6231;
						if (this.anInt4346 < 0 || this.anInt4346 >= this.aClass228_2.anIntArray403.length) {
							this.anInt4346 = 0;
						}
					}
					this.anInt4337 = this.anInt4346 + 1;
				} while (this.anInt4337 < this.aClass228_2.anIntArray403.length);
				this.anInt4337 -= this.aClass228_2.anInt6231;
			} while (this.anInt4337 >= 0 && this.aClass228_2.anIntArray403.length > this.anInt4337);
			this.anInt4337 = -1;
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(BLclient!ha;I)Lclient!ka;")
	private Class193 method3795(@OriginalArg(1) Class13 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class354 local15 = Static546.aClass263_1.method6113(this.anInt4317);
		return local15.method8348(this.anInt4346, arg1, this.anInt4336, arg0, Static479.aClass308_2, this.anInt4337);
	}

	@OriginalMember(owner = "client!iga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass16_Sub7_5 != null) {
			this.aClass16_Sub7_5.method5990();
		}
	}

	@OriginalMember(owner = "client!iga", name = "j", descriptor = "(I)V")
	@Override
	public void method6992() {
		super.aShort103 = super.aShort104 = (short) (int) (this.aDouble8 / 512.0D);
		super.aShort106 = super.aShort105 = (short) (int) (this.aDouble9 / 512.0D);
	}

	@OriginalMember(owner = "client!iga", name = "d", descriptor = "(ILclient!ha;)Lclient!wg;")
	@Override
	public Class379 method6983(@OriginalArg(1) Class13 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!iga", name = "b", descriptor = "(Lclient!ha;I)Lclient!jk;")
	@Override
	public Class16_Sub5 method6991(@OriginalArg(0) Class13 arg0) {
		@Pc(11) Class193 local11 = this.method3795(arg0, 2048);
		if (local11 == null) {
			return null;
		}
		@Pc(26) Class51 local26 = arg0.method8154();
		local26.method6708(this.anInt4340);
		local26.method6703(this.anInt4323);
		local26.method6711((int) this.aDouble8, (int) this.aDouble3, (int) this.aDouble9);
		this.method3800(arg0, local26, local11);
		@Pc(56) Class16_Sub5 local56 = Static134.method8011(false, 1);
		if (Static582.aBoolean678) {
			local11.method6622(local26, local56.aClass16_Sub10Array1[0], Static529.anInt8509, 0);
		} else {
			local11.method6612(local26, local56.aClass16_Sub10Array1[0], 0);
		}
		if (this.aClass16_Sub7_5 != null) {
			@Pc(84) Class119 local84 = this.aClass16_Sub7_5.method5982();
			if (Static582.aBoolean678) {
				arg0.method8165(local84, Static529.anInt8509);
			} else {
				arg0.method8101(local84);
			}
		}
		this.aBoolean319 = local11.F();
		this.anInt4344 = local11.fa();
		this.anInt4350 = local11.ma();
		return local56;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IIBII)V")
	public void method3796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) double local8;
		if (!this.aBoolean322) {
			local8 = (double) (arg0 - super.anInt8037);
			@Pc(15) double local15 = (double) (arg1 - super.anInt8034);
			@Pc(24) double local24 = Math.sqrt(local8 * local8 + local15 * local15);
			this.aDouble8 = (double) super.anInt8037 + (double) this.anInt4315 * local8 / local24;
			this.aDouble9 = (double) super.anInt8034 + local15 * (double) this.anInt4315 / local24;
			if (this.aBoolean318) {
				this.aDouble3 = (double) (Static392.method5799(super.aByte109, (int) this.aDouble8, (int) this.aDouble9) - this.anInt4341);
			} else {
				this.aDouble3 = (double) super.anInt8036;
			}
		}
		local8 = (double) (this.anInt4345 + 1 - arg2);
		this.aDouble7 = ((double) arg0 - this.aDouble8) / local8;
		this.aDouble10 = ((double) arg1 - this.aDouble9) / local8;
		this.aDouble4 = Math.sqrt(this.aDouble7 * this.aDouble7 + this.aDouble10 * this.aDouble10);
		if (this.anInt4343 == -1) {
			this.aDouble6 = ((double) arg3 - this.aDouble3) / local8;
		} else {
			if (!this.aBoolean322) {
				this.aDouble6 = -this.aDouble4 * Math.tan((double) this.anInt4343 * 0.02454369D);
			}
			this.aDouble5 = ((double) arg3 - this.aDouble6 * local8 - this.aDouble3) * 2.0D / (local8 * local8);
		}
	}

	@OriginalMember(owner = "client!iga", name = "g", descriptor = "(B)Z")
	@Override
	public boolean method6990() {
		return false;
	}

	@OriginalMember(owner = "client!iga", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method6974() {
		return this.aBoolean319;
	}

	@OriginalMember(owner = "client!iga", name = "c", descriptor = "(Z)V")
	public void method3798() {
		if (this.aBoolean322 || this.anInt4330 == 0) {
			return;
		}
		@Pc(12) Class16_Sub1_Sub1_Sub3 local12 = null;
		@Pc(21) int local21;
		if (this.anInt4330 < 0) {
			local21 = -this.anInt4330 - 1;
			if (Static608.anInt10056 == local21) {
				local12 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1;
			} else {
				local12 = Static91.aClass16_Sub1_Sub1_Sub3_Sub2Array1[local21];
			}
		} else {
			local21 = this.anInt4330 - 1;
			@Pc(44) Class2_Sub32 local44 = (Class2_Sub32) Static514.aClass323_32.method7484((long) local21);
			if (local44 != null) {
				local12 = local44.aClass16_Sub1_Sub1_Sub3_Sub1_2;
			}
		}
		if (local12 == null) {
			return;
		}
		super.anInt8034 = local12.anInt8034;
		super.anInt8037 = local12.anInt8037;
		super.anInt8036 = Static392.method5799(super.aByte109, local12.anInt8037, local12.anInt8034) - this.anInt4341;
		if (this.anInt4328 < 0) {
			return;
		}
		@Pc(83) Class291 local83 = local12.method7007();
		@Pc(85) int local85 = 0;
		@Pc(87) int local87 = 0;
		if (local83.anIntArrayArray93 != null && local83.anIntArrayArray93[this.anInt4328] != null) {
			local87 = local83.anIntArrayArray93[this.anInt4328][2];
			local85 = local83.anIntArrayArray93[this.anInt4328][0];
		}
		if (local83.anIntArrayArray92 != null && local83.anIntArrayArray92[this.anInt4328] != null) {
			local87 += local83.anIntArrayArray92[this.anInt4328][2];
			local85 += local83.anIntArrayArray92[this.anInt4328][0];
		}
		if (local85 == 0 && local87 == 0) {
			return;
		}
		@Pc(157) int local157 = local12.aClass111_7.method2696();
		@Pc(159) int local159 = local157;
		if (local12.anIntArray592 != null && local12.anIntArray592[this.anInt4328] != -1) {
			local159 = local12.anIntArray592[this.anInt4328];
		}
		@Pc(181) int local181 = local159 - local157 & 0x3FFF;
		@Pc(185) int local185 = Class290.anIntArray546[local181];
		@Pc(189) int local189 = Class290.anIntArray547[local181];
		@Pc(199) int local199 = local87 * local185 + local189 * local85 >> 14;
		local87 = local87 * local189 - local85 * local185 >> 14;
		super.anInt8037 += local199;
		super.anInt8034 += local87;
	}

	@OriginalMember(owner = "client!iga", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method6976() {
		return false;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(ILclient!ha;Lclient!pda;Lclient!ka;)V")
	private void method3800(@OriginalArg(1) Class13 arg0, @OriginalArg(2) Class51 arg1, @OriginalArg(3) Class193 arg2) {
		arg2.method6608(arg1);
		@Pc(9) Class287[] local9 = arg2.method6621();
		@Pc(12) Class156[] local12 = arg2.method6625();
		if ((this.aClass16_Sub7_5 == null || this.aClass16_Sub7_5.aBoolean488) && (local9 != null || local12 != null)) {
			this.aClass16_Sub7_5 = Static401.method5991(Static389.anInt6694, true);
		}
		if (this.aClass16_Sub7_5 != null) {
			this.aClass16_Sub7_5.method5981(arg0, (long) Static389.anInt6694, local9, local12);
			this.aClass16_Sub7_5.method5985(super.aByte109, super.aShort103, super.aShort104, super.aShort106, super.aShort105);
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(Lclient!ha;I)V")
	@Override
	public void method6978(@OriginalArg(0) Class13 arg0) {
		@Pc(9) Class193 local9 = this.method3795(arg0, 0);
		if (local9 == null) {
			return;
		}
		@Pc(15) Class51 local15 = arg0.method8154();
		local15.method6708(this.anInt4340);
		local15.method6703(this.anInt4323);
		local15.method6711((int) this.aDouble8, (int) this.aDouble3, (int) this.aDouble9);
		this.anInt4344 = local9.fa();
		this.anInt4350 = local9.ma();
		this.method3800(arg0, local15, local9);
	}
}
