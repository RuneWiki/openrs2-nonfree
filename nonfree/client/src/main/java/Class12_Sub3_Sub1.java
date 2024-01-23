import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class12_Sub3_Sub1 extends Class12_Sub3 {

	@OriginalMember(owner = "client!dj", name = "Hb", descriptor = "I")
	public int anInt1198;

	@OriginalMember(owner = "client!dj", name = "Kb", descriptor = "I")
	public int anInt1200;

	@OriginalMember(owner = "client!dj", name = "Lb", descriptor = "I")
	public int anInt1201;

	@OriginalMember(owner = "client!dj", name = "Xb", descriptor = "I")
	public int anInt1212;

	@OriginalMember(owner = "client!dj", name = "Yb", descriptor = "Lclient!cg;")
	public Class12_Sub2 aClass12_Sub2_1;

	@OriginalMember(owner = "client!dj", name = "Zb", descriptor = "I")
	public int anInt1213;

	@OriginalMember(owner = "client!dj", name = "ec", descriptor = "I")
	public int anInt1217;

	@OriginalMember(owner = "client!dj", name = "gc", descriptor = "Lclient!i;")
	public Class41 aClass41_362;

	@OriginalMember(owner = "client!dj", name = "ic", descriptor = "Lclient!tb;")
	public Class91 aClass91_1;

	@OriginalMember(owner = "client!dj", name = "nc", descriptor = "I")
	public int anInt1222;

	@OriginalMember(owner = "client!dj", name = "Qb", descriptor = "I")
	public int anInt1206 = -1;

	@OriginalMember(owner = "client!dj", name = "Nb", descriptor = "I")
	public int anInt1203 = 0;

	@OriginalMember(owner = "client!dj", name = "Sb", descriptor = "I")
	public int anInt1207 = 0;

	@OriginalMember(owner = "client!dj", name = "Pb", descriptor = "I")
	public int anInt1205 = 0;

	@OriginalMember(owner = "client!dj", name = "Jb", descriptor = "Z")
	public boolean aBoolean59 = false;

	@OriginalMember(owner = "client!dj", name = "cc", descriptor = "I")
	public int anInt1215 = 0;

	@OriginalMember(owner = "client!dj", name = "Vb", descriptor = "I")
	public int anInt1210 = 0;

	@OriginalMember(owner = "client!dj", name = "bc", descriptor = "S")
	private short aShort12 = 0;

	@OriginalMember(owner = "client!dj", name = "Wb", descriptor = "I")
	public int anInt1211 = -1;

	@OriginalMember(owner = "client!dj", name = "jc", descriptor = "S")
	private short aShort13 = 0;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (this.aClass91_1 == null) {
			return;
		}
		@Pc(23) Class2_Sub2_Sub9 local23 = super.anInt3910 != -1 && super.anInt3965 == 0 ? Static14.method299(super.anInt3910) : null;
		@Pc(44) Class2_Sub2_Sub9 local44 = super.anInt3935 == -1 || this.aBoolean59 || super.anInt3935 == super.anInt3934 && local23 != null ? null : Static14.method299(super.anInt3935);
		@Pc(55) Class12_Sub2 local55 = this.aClass91_1.method2930(local44, super.anInt3930, super.anInt3955, local23);
		if (local55 == null) {
			return;
		}
		super.anInt3936 = local55.method2718();
		@Pc(70) int local70;
		@Pc(116) int local116;
		@Pc(127) int local127;
		@Pc(165) int local165;
		if (Static213.aClass12_Sub3_Sub1_1 == this) {
			for (local70 = Static57.aClass55Array1.length - 1; local70 >= 0; local70--) {
				@Pc(76) Class55 local76 = Static57.aClass55Array1[local70];
				if (local76 != null && local76.anInt2523 != -1) {
					if (local76.anInt2526 == 1 && local76.anInt2529 >= 0 && Static199.aClass12_Sub3_Sub2Array1.length > local76.anInt2529) {
						@Pc(103) Class12_Sub3_Sub2 local103 = Static199.aClass12_Sub3_Sub2Array1[local76.anInt2529];
						if (local103 != null) {
							local116 = local103.anInt3961 / 32 - Static213.aClass12_Sub3_Sub1_1.anInt3961 / 32;
							local127 = local103.anInt3949 / 32 - Static213.aClass12_Sub3_Sub1_1.anInt3949 / 32;
							this.method860(arg2, arg3, arg7, arg1, arg5, arg0, local127, arg4, local76.anInt2523, local55, arg6, local116);
						}
					}
					if (local76.anInt2526 == 2) {
						local165 = (local76.anInt2525 - Static198.anInt4451) * 4 + 2 - Static213.aClass12_Sub3_Sub1_1.anInt3961 / 32;
						local116 = (local76.anInt2522 - Static168.anInt3899) * 4 + 2 - Static213.aClass12_Sub3_Sub1_1.anInt3949 / 32;
						this.method860(arg2, arg3, arg7, arg1, arg5, arg0, local116, arg4, local76.anInt2523, local55, arg6, local165);
					}
					if (local76.anInt2526 == 10 && local76.anInt2529 >= 0 && local76.anInt2529 < Static216.aClass12_Sub3_Sub1Array1.length) {
						@Pc(214) Class12_Sub3_Sub1 local214 = Static216.aClass12_Sub3_Sub1Array1[local76.anInt2529];
						if (local214 != null) {
							local116 = local214.anInt3961 / 32 - Static213.aClass12_Sub3_Sub1_1.anInt3961 / 32;
							local127 = local214.anInt3949 / 32 - Static213.aClass12_Sub3_Sub1_1.anInt3949 / 32;
							this.method860(arg2, arg3, arg7, arg1, arg5, arg0, local127, arg4, local76.anInt2523, local55, arg6, local116);
						}
					}
				}
			}
		}
		local70 = 0;
		@Pc(263) int local263 = 0;
		local165 = 0;
		if (this.aShort13 != 0 && this.aShort12 != 0) {
			local116 = Class79.anIntArray377[arg0];
			@Pc(281) short local281 = this.aShort13;
			local127 = Class79.anIntArray375[arg0];
			@Pc(288) short local288 = this.aShort12;
			@Pc(293) int local293 = -local281 / 2;
			@Pc(298) int local298 = -local288 / 2;
			@Pc(302) int local302 = local281 / 2;
			@Pc(312) int local312 = local116 * local298 + local293 * local127 >> 16;
			@Pc(322) int local322 = local298 * local127 - local116 * local293 >> 16;
			@Pc(334) int local334 = Static212.method3261(local312 + super.anInt3961, super.anInt3949 + local322, Static134.anInt3147);
			@Pc(339) int local339 = -local288 / 2;
			@Pc(349) int local349 = local302 * local127 + local116 * local339 >> 16;
			@Pc(360) int local360 = local339 * local127 - local302 * local116 >> 16;
			@Pc(372) int local372 = Static212.method3261(super.anInt3961 + local349, local360 + super.anInt3949, Static134.anInt3147);
			@Pc(376) int local376 = local288 / 2;
			@Pc(381) int local381 = -local281 / 2;
			@Pc(392) int local392 = local127 * local376 - local116 * local381 >> 16;
			@Pc(402) int local402 = local127 * local381 + local116 * local376 >> 16;
			@Pc(415) int local415 = Static212.method3261(super.anInt3961 + local402, super.anInt3949 + local392, Static134.anInt3147);
			@Pc(419) int local419 = local281 / 2;
			@Pc(423) int local423 = local288 / 2;
			@Pc(433) int local433 = local127 * local423 - local116 * local419 >> 16;
			@Pc(443) int local443 = local127 * local419 + local116 * local423 >> 16;
			@Pc(455) int local455 = Static212.method3261(local443 + super.anInt3961, super.anInt3949 + local433, Static134.anInt3147);
			local165 = local334 + local455;
			if (local372 + local415 < local165) {
				local165 = local415 + local372;
			}
			@Pc(484) int local484 = local372 <= local334 ? local372 : local334;
			@Pc(495) int local495 = local455 <= local415 ? local455 : local415;
			local70 = (int) (Math.atan2((double) (local484 - local495), (double) local288) * 325.95D) & 0x7FF;
			if (local70 != 0) {
				local55.method1866(local70);
			}
			@Pc(528) int local528 = local455 <= local372 ? local455 : local372;
			@Pc(539) int local539 = local415 <= local334 ? local415 : local334;
			local263 = (int) (Math.atan2((double) (local539 - local528), (double) local281) * 325.95D) & 0x7FF;
			if (local263 != 0) {
				local55.method1860(local263);
			}
			local165 = (local165 >> 1) - super.anInt3926;
			if (local165 != 0) {
				local55.method1849(0, local165, 0);
			}
		}
		@Pc(575) Class12_Sub2 local575 = null;
		if (!this.aBoolean59 && super.anInt3911 != -1 && super.anInt3908 != -1) {
			@Pc(592) Class2_Sub2_Sub5 local592 = Static56.method1110(super.anInt3911);
			local575 = local592.method565(super.anInt3908);
			if (local575 != null) {
				local575.method1849(0, -super.anInt3953, 0);
				if (local592.aBoolean37) {
					if (local70 != 0) {
						local575.method1866(local70);
					}
					if (local263 != 0) {
						local575.method1860(local263);
					}
					if (local165 != 0) {
						local575.method1849(0, local165, 0);
					}
				}
			}
		}
		@Pc(638) Class12_Sub2 local638 = null;
		if (!this.aBoolean59 && this.aClass12_Sub2_1 != null) {
			if (this.anInt1215 <= Static103.anInt2511) {
				this.aClass12_Sub2_1 = null;
			}
			if (this.anInt1210 <= Static103.anInt2511 && this.anInt1215 > Static103.anInt2511) {
				local638 = this.aClass12_Sub2_1;
				local638.method1849(this.anInt1222 - super.anInt3961, this.anInt1213 + -super.anInt3926, this.anInt1212 - super.anInt3949);
				if (super.anInt3947 == 512) {
					local638.method1850();
				} else if (super.anInt3947 == 1024) {
					local638.method1859();
				} else if (super.anInt3947 == 1536) {
					local638.method1851();
				}
			}
		}
		if (local575 != null) {
			local55 = ((Class12_Sub2_Sub1) local55).method1880(local575);
		}
		if (local638 != null) {
			local55 = ((Class12_Sub2_Sub1) local55).method1880(local638);
		}
		local55.aBoolean139 = true;
		local55.method2715(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
		if (local638 == null) {
			return;
		}
		if (super.anInt3947 == 512) {
			local638.method1851();
		} else if (super.anInt3947 == 1024) {
			local638.method1859();
		} else if (super.anInt3947 == 1536) {
			local638.method1850();
		}
		local638.method1849(super.anInt3961 - this.anInt1222, -this.anInt1213 + super.anInt3926, super.anInt3949 - this.anInt1212);
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "()I")
	@Override
	public int method2718() {
		return super.anInt3936;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lclient!ea;Z)V")
	public void method859(@OriginalArg(0) Class2_Sub3 arg0) {
		arg0.anInt239 = 0;
		@Pc(8) int local8 = arg0.method209();
		if ((local8 & 0x2) == 2) {
			this.aShort13 = (short) (arg0.method209() << 2);
			this.aShort12 = (short) (arg0.method209() << 2);
		} else {
			this.aShort12 = 0;
			this.aShort13 = 0;
		}
		super.anInt3932 = (local8 >> 3) + 1;
		@Pc(56) int local56 = local8 & 0x1;
		@Pc(64) boolean local64 = (local8 & 0x4) != 0;
		@Pc(66) int local66 = -1;
		this.anInt1211 = arg0.method186();
		@Pc(74) int[] local74 = new int[12];
		this.anInt1206 = arg0.method186();
		this.anInt1207 = 0;
		@Pc(102) int local102;
		@Pc(108) int local108;
		for (@Pc(84) int local84 = 0; local84 < 12; local84++) {
			@Pc(90) int local90 = arg0.method209();
			if (local90 == 0) {
				local74[local84] = 0;
			} else {
				local102 = arg0.method209();
				local108 = local102 + (local90 << 8);
				if (local84 == 0 && local108 == 65535) {
					local66 = arg0.method163();
					break;
				}
				if (local108 >= 32768) {
					local108 = Static78.anIntArray197[local108 - 32768];
					local74[local84] = local108 | 0x40000000;
					@Pc(144) int local144 = Static63.method1158(local108).anInt3094;
					if (local144 != 0) {
						this.anInt1207 = local144;
					}
				} else {
					local74[local84] = Integer.MIN_VALUE | local108 - 256;
				}
			}
		}
		@Pc(168) int[] local168 = new int[5];
		for (local102 = 0; local102 < 5; local102++) {
			local108 = arg0.method209();
			if (local108 < 0 || local108 >= Static6.aShortArrayArray1[local102].length) {
				local108 = 0;
			}
			local168[local102] = local108;
		}
		super.anInt3934 = arg0.method163();
		if (super.anInt3934 == 65535) {
			super.anInt3934 = -1;
		}
		super.anInt3921 = arg0.method163();
		if (super.anInt3921 == 65535) {
			super.anInt3921 = -1;
		}
		super.anInt3956 = super.anInt3921;
		super.anInt3922 = arg0.method163();
		if (super.anInt3922 == 65535) {
			super.anInt3922 = -1;
		}
		super.anInt3951 = arg0.method163();
		if (super.anInt3951 == 65535) {
			super.anInt3951 = -1;
		}
		super.anInt3915 = arg0.method163();
		if (super.anInt3915 == 65535) {
			super.anInt3915 = -1;
		}
		super.anInt3950 = arg0.method163();
		if (super.anInt3950 == 65535) {
			super.anInt3950 = -1;
		}
		super.anInt3933 = arg0.method163();
		if (super.anInt3933 == 65535) {
			super.anInt3933 = -1;
		}
		this.aClass41_362 = Static176.method2837(arg0.method183()).method1403();
		this.anInt1203 = arg0.method209();
		if (local64) {
			this.anInt1205 = arg0.method163();
		} else {
			this.anInt1205 = 0;
		}
		if (this.aClass91_1 == null) {
			this.aClass91_1 = new Class91();
		}
		this.aClass91_1.method2931(local66, local74, local168, local56 == 1);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIIIIILclient!cg;II)V")
	private void method860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class12_Sub2 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(11) int local11 = arg11 * arg11 + arg6 * arg6;
		if (local11 < 16 || local11 > 360000) {
			return;
		}
		@Pc(35) int local35 = (int) (Math.atan2((double) arg11, (double) arg6) * 325.949D) & 0x7FF;
		@Pc(47) Class12_Sub2 local47 = Static120.method2028(arg9, super.anInt3949, super.anInt3961, arg8, local35, super.anInt3926);
		if (local47 != null) {
			local47.method2715(0, arg3, arg0, arg1, arg7, arg4, arg10, arg2, -1L);
		}
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method2727() {
		return this.aClass91_1 != null;
	}
}
