import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class10_Sub3_Sub3_Sub2 extends Class10_Sub3_Sub3 {

	@OriginalMember(owner = "client!tm", name = "Ac", descriptor = "Ljava/lang/String;")
	public String aString224;

	@OriginalMember(owner = "client!tm", name = "Lc", descriptor = "Lclient!he;")
	public Class83 aClass83_4;

	@OriginalMember(owner = "client!tm", name = "Nc", descriptor = "Ljava/lang/String;")
	public String aString225;

	@OriginalMember(owner = "client!tm", name = "ed", descriptor = "I")
	private int anInt6018;

	@OriginalMember(owner = "client!tm", name = "Kc", descriptor = "I")
	public int anInt6003 = -1;

	@OriginalMember(owner = "client!tm", name = "Qc", descriptor = "I")
	public int anInt6006 = -1;

	@OriginalMember(owner = "client!tm", name = "Xc", descriptor = "I")
	public int anInt6012 = -1;

	@OriginalMember(owner = "client!tm", name = "Fc", descriptor = "I")
	public int anInt5998 = 0;

	@OriginalMember(owner = "client!tm", name = "Wc", descriptor = "I")
	public int anInt6011 = 255;

	@OriginalMember(owner = "client!tm", name = "Rc", descriptor = "I")
	public int anInt6007 = 0;

	@OriginalMember(owner = "client!tm", name = "Tc", descriptor = "B")
	private byte aByte66 = 0;

	@OriginalMember(owner = "client!tm", name = "cd", descriptor = "I")
	public int anInt6016 = -1;

	@OriginalMember(owner = "client!tm", name = "C", descriptor = "I")
	public int anInt5992 = 0;

	@OriginalMember(owner = "client!tm", name = "dd", descriptor = "I")
	public int anInt6017 = -1;

	@OriginalMember(owner = "client!tm", name = "bd", descriptor = "Z")
	public boolean aBoolean418 = false;

	@OriginalMember(owner = "client!tm", name = "Pc", descriptor = "I")
	public int anInt6005 = 0;

	@OriginalMember(owner = "client!tm", name = "id", descriptor = "I")
	public int anInt6022 = -1;

	@OriginalMember(owner = "client!tm", name = "Oc", descriptor = "B")
	private byte aByte65 = 0;

	@OriginalMember(owner = "client!tm", name = "gd", descriptor = "I")
	public int anInt6020 = 0;

	@OriginalMember(owner = "client!tm", name = "jd", descriptor = "I")
	public int anInt6023 = -1;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZLclient!e;)Z")
	private boolean method5372(@OriginalArg(0) int arg0, @OriginalArg(2) Class46 arg1) {
		@Pc(7) int local7 = arg0;
		@Pc(11) Class128 local11 = this.method5364();
		@Pc(28) Class79 local28 = super.anInt5961 != -1 && super.anInt5963 == 0 ? Static233.method4080(super.anInt5961) : null;
		@Pc(47) Class79 local47 = super.anInt5939 == -1 || this.aBoolean418 || super.aBoolean414 && local28 != null ? null : Static233.method4080(super.anInt5939);
		@Pc(50) int local50 = local11.anInt3746;
		@Pc(53) int local53 = local11.anInt3734;
		if (local50 != 0 || local53 != 0 || local11.anInt3756 != 0 || local11.anInt3759 != 0) {
			arg0 |= 0x7;
		}
		super.aClass45Array3[0] = this.aClass83_4.method2453(super.aClass3Array3, super.anInt5975, super.anInt5968, super.anInt5959, super.anInt5966, local47, super.anInt5960, arg0, arg1, super.anInt5933, local28);
		@Pc(106) int local106 = Static234.method4105();
		if (Static127.anInt2786 < 96 && local106 > 50) {
			Static263.method4515();
		}
		@Pc(128) int local128;
		if (Static131.anInt1769 != 0 && local106 < 50) {
			local128 = 50 - local106;
			while (Static196.anInt3993 < local128) {
				Static192.aByteArrayArray12[Static196.anInt3993] = new byte[102400];
				Static196.anInt3993++;
			}
			while (local128 < Static196.anInt3993) {
				Static196.anInt3993--;
				Static192.aByteArrayArray12[Static196.anInt3993] = null;
			}
		} else if (Static131.anInt1769 != 0) {
			Static192.aByteArrayArray12 = new byte[50][];
			Static196.anInt3993 = 0;
		}
		if (super.aClass45Array3[0] == null) {
			return false;
		}
		super.anInt5978 = super.aClass45Array3[0].method1781();
		this.method5359(super.aClass45Array3[0]);
		local128 = super.aClass133_7.method3620();
		super.anInt5938 = 0;
		super.anInt5924 = 0;
		super.anInt5926 = 0;
		if (local50 == 0 && local53 == 0) {
			this.method5369(this.method5353() << 7, local128, this.method5353() << 7);
		} else {
			this.method5369(local53, local128, local50);
			if (super.anInt5924 != 0) {
				super.aClass45Array3[0].method1818(super.anInt5924);
			}
			if (super.anInt5926 != 0) {
				super.aClass45Array3[0].method1784(super.anInt5926);
			}
			if (super.anInt5938 != 0) {
				super.aClass45Array3[0].method1788(0, super.anInt5938, 0);
			}
		}
		super.aClass45Array3[1] = null;
		if (!this.aBoolean418 && super.anInt5957 != -1 && super.anInt5962 != -1) {
			@Pc(311) Class78 local311 = Static76.method1908(super.anInt5957);
			@Pc(330) Class45 local330 = local311.method2266(super.anInt5953, super.anInt5962, (local311.aBoolean160 ? 7 : 2) | local7, arg1, super.anInt5952);
			if (local330 != null) {
				local330.method1788(0, -super.anInt5917, 0);
				if (local311.aBoolean160 && (local50 != 0 || local53 != 0)) {
					if (super.anInt5924 != 0) {
						local330.method1818(super.anInt5924);
					}
					if (super.anInt5926 != 0) {
						local330.method1784(super.anInt5926);
					}
					if (super.anInt5938 != 0) {
						local330.method1788(0, super.anInt5938, 0);
					}
				}
				super.aClass45Array3[1] = local330;
			}
		}
		super.aClass45Array3[2] = null;
		if (!this.aBoolean418 && super.anInterface7_3 != null) {
			if (Static153.anInt3257 >= super.anInt5980) {
				super.anInterface7_3 = null;
			}
			if (Static153.anInt3257 >= super.anInt5985 && super.anInt5980 > Static153.anInt3257) {
				@Pc(415) Class45 local415 = super.anInterface7_3.method4071(arg1, local7 | 0x7);
				if (local415 != null) {
					local415.method1788(-super.anInt5910 + super.anInt5982, -super.anInt5907 + super.anInt5981, -super.anInt5908 + super.anInt5987);
					if (local128 != 0) {
						local415.method1797(-local128 & 0x3FFF);
					}
					super.aClass45Array3[2] = local415;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!jg;I)V")
	public void method5373(@OriginalArg(0) Class14_Sub4 arg0) {
		arg0.anInt2637 = 0;
		@Pc(12) int local12 = arg0.method2548();
		@Pc(16) int local16 = local12 & 0x1;
		@Pc(31) boolean local31 = (local12 & 0x2) != 0;
		@Pc(42) boolean local42 = (local12 & 0x4) != 0;
		@Pc(46) int local46 = super.method5353();
		this.method5362((local12 >> 3 & 0x7) + 1);
		this.aByte65 = (byte) (local12 >> 6 & 0x3);
		super.anInt5910 += (this.method5353() - local46) * 64;
		super.anInt5908 += (this.method5353() - local46) * 64;
		this.aByte66 = arg0.method2553();
		this.anInt6016 = arg0.method2553();
		this.anInt6012 = arg0.method2553();
		@Pc(107) int local107 = -1;
		this.anInt5992 = 0;
		@Pc(113) int[] local113 = new int[12];
		@Pc(133) int local133;
		@Pc(140) int local140;
		@Pc(180) int local180;
		for (@Pc(115) int local115 = 0; local115 < 12; local115++) {
			@Pc(121) int local121 = arg0.method2548();
			if (local121 == 0) {
				local113[local115] = 0;
			} else {
				local133 = arg0.method2548();
				local140 = (local121 << 8) + local133;
				if (local115 == 0 && local140 == 65535) {
					local107 = arg0.method2498();
					this.anInt5992 = arg0.method2548();
					break;
				}
				if (local140 >= 32768) {
					local140 = Static294.anIntArray515[local140 - 32768];
					local113[local115] = local140 | 0x40000000;
					local180 = Static296.method5066(local140).anInt6685;
					if (local180 != 0) {
						this.anInt5992 = local180;
					}
				} else {
					local113[local115] = Integer.MIN_VALUE | local140 - 256;
				}
			}
		}
		@Pc(207) int[] local207 = new int[5];
		for (local133 = 0; local133 < 5; local133++) {
			local140 = arg0.method2548();
			if (local140 < 0 || Static325.aShortArrayArray11[local133].length <= local140) {
				local140 = 0;
			}
			local207[local133] = local140;
		}
		this.anInt6018 = arg0.method2498();
		this.aString225 = arg0.method2496();
		if (local31) {
			this.aString224 = arg0.method2496();
		} else {
			this.aString224 = this.aString225;
		}
		this.anInt6005 = arg0.method2548();
		if (local42) {
			this.anInt6007 = arg0.method2498();
			this.anInt5998 = this.anInt6005;
			this.anInt6006 = -1;
		} else {
			this.anInt6007 = 0;
			this.anInt5998 = arg0.method2548();
			this.anInt6006 = arg0.method2548();
			if (this.anInt6006 == 255) {
				this.anInt6006 = -1;
			}
		}
		local140 = this.anInt6020;
		this.anInt6020 = arg0.method2548();
		@Pc(322) int local322;
		if (this.anInt6020 == 0) {
			Static136.method2750(this);
		} else {
			local180 = this.anInt6022;
			@Pc(319) int local319 = this.anInt6003;
			local322 = this.anInt6017;
			@Pc(325) int local325 = this.anInt6023;
			@Pc(328) int local328 = this.anInt6011;
			this.anInt6022 = arg0.method2498();
			this.anInt6003 = arg0.method2498();
			this.anInt6017 = arg0.method2498();
			this.anInt6023 = arg0.method2498();
			this.anInt6011 = arg0.method2548();
			if (local140 != this.anInt6020 || local180 != this.anInt6022 || this.anInt6003 != local319 || this.anInt6017 != local322 || local325 != this.anInt6023 || this.anInt6011 != local328) {
				Static277.method4695(this);
			}
		}
		if (this.aClass83_4 == null) {
			this.aClass83_4 = new Class83();
		}
		local180 = this.aClass83_4.anInt2555;
		@Pc(413) int[] local413 = this.aClass83_4.anIntArray226;
		this.aClass83_4.method2444(local107, local207, this.method5370(), local113, local16 == 1);
		if (local180 != local107) {
			super.anInt5910 = super.anIntArray535[0] * 128 + this.method5353() * 64;
			super.anInt5908 = super.anIntArray536[0] * 128 + this.method5353() * 64;
		}
		if (super.anInt5954 == 2047 && local413 != null) {
			for (local322 = 0; local322 < local207.length; local322++) {
				if (local413[local322] != local207[local322]) {
					Static293.method5008();
					break;
				}
			}
		}
		if (super.aClass1_Sub7_7 != null) {
			super.aClass1_Sub7_7.method4322();
		}
		if (super.anInt5939 == -1 || !super.aBoolean414) {
			return;
		}
		@Pc(510) Class128 local510 = this.method5364();
		if (!local510.method3504(super.anInt5939)) {
			super.aBoolean414 = false;
			super.anInt5939 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!pg;IIIILclient!e;Lclient!id;I)V")
	private void method5374(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class46 arg4, @OriginalArg(6) Class45 arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = arg1 * arg1 + arg6 * arg6;
		if (local11 < 16 || local11 > arg2) {
			return;
		}
		@Pc(33) int local33 = (int) (Math.atan2((double) arg1, (double) arg6) * 2607.5945876176133D) & 0x3FFF;
		@Pc(58) Class45 local58 = Static102.method2260(super.anInt5908, super.anInt5926, super.anInt5907, super.anInt5938, arg4, arg3, arg5, super.anInt5910, local33, super.anInt5924);
		if (local58 != null) {
			arg4.method5156(false);
			local58.method1794(arg0, null, 0);
			arg4.method5156(true);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public String method5375() {
		@Pc(7) String local7 = "";
		if (Static144.aStringArray41 != null) {
			local7 = local7 + Static144.aStringArray41[this.aByte65];
		}
		if (Static135.anIntArray261 != null && Static135.anIntArray261[this.aByte65] != -1) {
			@Pc(43) Class14_Sub2_Sub10 local43 = Static282.method4779(Static135.anIntArray261[this.aByte65]);
			if (local43.aChar4 == 's') {
				local7 = local7 + local43.method2989(this.aByte66 & 0xFF);
			} else {
				Static47.method1149(new Throwable(), "gdn1");
				Static135.anIntArray261[this.aByte65] = -1;
			}
		}
		local7 = local7 + this.aString225;
		if (Static151.aStringArray44 != null) {
			local7 = local7 + Static151.aStringArray44[this.aByte65];
		}
		return local7;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(Z)Z")
	public boolean method5376() {
		return this.aClass83_4 != null;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(B)I")
	@Override
	protected int method5370() {
		return this.anInt6018;
	}

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "(I)I")
	@Override
	public int method5345() {
		return super.anInt5978;
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method5339() {
		return false;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IZIII)V")
	public void method5378(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		super.method5352(arg3, arg0, arg1, this.method5353(), arg2);
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method5379() {
		return this.aString224;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(Lclient!e;B)V")
	@Override
	public void method5343(@OriginalArg(0) Class46 arg0) {
		if (this.aClass83_4 != null && (super.aBoolean417 || this.method5372(0, arg0))) {
			this.method5355(super.aClass45Array3, super.aBoolean417, arg0);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!e;Z)Lclient!um;")
	@Override
	public Class1_Sub8 method5337(@OriginalArg(0) Class46 arg0) {
		if (this.aClass83_4 == null || !this.method5372(1024, arg0)) {
			return null;
		}
		@Pc(25) Class51 local25 = arg0.method5145();
		@Pc(30) int local30 = super.aClass133_7.method3620();
		local25.method3559(local30);
		local25.method3561(super.anInt5910, super.anInt5907, super.anInt5908);
		@Pc(44) float local44 = arg0.method5098();
		@Pc(47) float local47 = arg0.method5097();
		if (Static153.aBoolean212) {
			@Pc(53) Class128 local53 = this.method5364();
			if (local53.aBoolean238 && (this.aClass83_4.anInt2555 == -1 || Static267.method4561(this.aClass83_4.anInt2555).aBoolean401)) {
				@Pc(90) Class79 local90 = super.anInt5961 != -1 && super.anInt5963 == 0 ? Static233.method4080(super.anInt5961) : null;
				@Pc(110) Class79 local110 = super.anInt5939 == -1 || this.aBoolean418 || super.aBoolean414 && local90 != null ? null : Static233.method4080(super.anInt5939);
				@Pc(144) Class45 local144 = Static41.method988(super.aClass45Array3[0], 1, arg0, super.anInt5926, super.anInt5938, super.anInt5924, 240, local110 == null ? local90 : local110, 160, super.aBoolean415, 0, 0, local110 == null ? super.anInt5933 : super.anInt5959, local30);
				if (local144 != null) {
					arg0.method5161(local44, local47 - 128.0F);
					arg0.method5156(false);
					local144.method1794(local25, null, 0);
					arg0.method5156(true);
				}
			}
		}
		if (Static173.aClass10_Sub3_Sub3_Sub2_1 == this) {
			arg0.method5161(local44, local47 - 144.0F);
			local25.method3548(super.anInt5910, super.anInt5907, super.anInt5908);
			for (@Pc(185) int local185 = Static27.aClass113Array1.length - 1; local185 >= 0; local185--) {
				@Pc(191) Class113 local191 = Static27.aClass113Array1[local185];
				if (local191 != null && local191.anInt3411 != -1) {
					@Pc(246) int local246;
					@Pc(235) int local235;
					if (local191.anInt3406 == 1 && local191.anInt3403 >= 0 && Static266.aClass10_Sub3_Sub3_Sub1Array1.length > local191.anInt3403) {
						@Pc(222) Class10_Sub3_Sub3_Sub1 local222 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local191.anInt3403];
						if (local222 != null) {
							local235 = local222.anInt5910 / 32 - Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910 / 32;
							local246 = local222.anInt5908 / 32 - Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908 / 32;
							this.method5374(local25, local235, 360000, local191.anInt3411, arg0, super.aClass45Array3[0], local246);
						}
					}
					if (local191.anInt3406 == 2) {
						@Pc(280) int local280 = (local191.anInt3408 - Static151.anInt3234) * 4 + 2 - Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910 / 32;
						local235 = (-Static251.anInt3170 + local191.anInt3413) * 4 + 2 - Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908 / 32;
						local246 = local191.anInt3407 * 4;
						local246 *= local246;
						this.method5374(local25, local280, local246, local191.anInt3411, arg0, super.aClass45Array3[0], local235);
					}
					if (local191.anInt3406 == 10 && local191.anInt3403 >= 0 && local191.anInt3403 < Static29.aClass10_Sub3_Sub3_Sub2Array3.length) {
						@Pc(345) Class10_Sub3_Sub3_Sub2 local345 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local191.anInt3403];
						if (local345 != null) {
							local235 = local345.anInt5910 / 32 - Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910 / 32;
							local246 = local345.anInt5908 / 32 - Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908 / 32;
							this.method5374(local25, local235, 360000, local191.anInt3411, arg0, super.aClass45Array3[0], local246);
						}
					}
				}
			}
			local25.method3559(local30);
			local25.method3561(super.anInt5910, super.anInt5907, super.anInt5908);
		}
		arg0.method5161(local44, local47);
		@Pc(407) Class1_Sub8 local407 = Static182.method3510(super.aClass45Array3.length);
		if (super.aClass1_Sub7_7 == null) {
			arg0.method5123(super.aClass45Array3, local25, local407.aClass1_Sub3Array1, Static173.aClass10_Sub3_Sub3_Sub2_1 == this ? 1 : 0);
		} else {
			@Pc(429) Class109 local429 = super.aClass1_Sub7_7.method4320();
			arg0.method5130(super.aClass45Array3, local429, local25, local407.aClass1_Sub3Array1, Static173.aClass10_Sub3_Sub3_Sub2_1 == this ? 1 : 0);
		}
		this.method5355(super.aClass45Array3, false, arg0);
		if (super.aClass45Array3[2] != null) {
			if (local30 != 0) {
				super.aClass45Array3[2].method1797(local30);
			}
			super.aClass45Array3[2].method1788(-super.anInt5982 + super.anInt5910, -super.anInt5981 + super.anInt5907, -super.anInt5987 + super.anInt5908);
		}
		return local407;
	}

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "(I)I")
	@Override
	public int method5358() {
		return -1;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!e;IIZLclient!hm;I)V")
	@Override
	public void method5335(@OriginalArg(0) int arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) int arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIILclient!e;)Z")
	@Override
	public boolean method5336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class46 arg2) {
		if (this.aClass83_4 == null || !this.method5372(65536, arg2)) {
			return true;
		}
		@Pc(29) Class51 local29 = arg2.method5145();
		@Pc(36) int local36 = super.aClass133_7.method3620();
		local29.method3559(local36);
		local29.method3561(super.anInt5910, super.anInt5907, super.anInt5908);
		for (@Pc(49) int local49 = 0; super.aClass45Array3.length > local49; local49++) {
			if (super.aClass45Array3[local49] != null && super.aClass45Array3[local49].method1823(arg0, arg1, local29, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)I")
	@Override
	public int method5353() {
		return this.aClass83_4 == null || this.aClass83_4.anInt2555 == -1 ? super.method5353() : Static267.method4561(this.aClass83_4.anInt2555).anInt5798;
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)V")
	@Override
	public void method5340() {
		throw new IllegalStateException();
	}
}
