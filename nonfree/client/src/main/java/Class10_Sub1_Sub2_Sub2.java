import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class10_Sub1_Sub2_Sub2 extends Class10_Sub1_Sub2 {

	@OriginalMember(owner = "client!n", name = "Tc", descriptor = "I")
	private int anInt4104;

	@OriginalMember(owner = "client!n", name = "Vc", descriptor = "Ljava/lang/String;")
	public String aString152;

	@OriginalMember(owner = "client!n", name = "Wc", descriptor = "Lclient!ls;")
	public Class136 aClass136_1;

	@OriginalMember(owner = "client!n", name = "qd", descriptor = "Ljava/lang/String;")
	public String aString153;

	@OriginalMember(owner = "client!n", name = "Ec", descriptor = "I")
	public int anInt4091 = -1;

	@OriginalMember(owner = "client!n", name = "Lc", descriptor = "Z")
	public boolean aBoolean311 = false;

	@OriginalMember(owner = "client!n", name = "Kc", descriptor = "I")
	public int anInt4096 = 0;

	@OriginalMember(owner = "client!n", name = "Gc", descriptor = "I")
	public int anInt4092 = -1;

	@OriginalMember(owner = "client!n", name = "Ic", descriptor = "I")
	public int anInt4094 = -1;

	@OriginalMember(owner = "client!n", name = "Mc", descriptor = "I")
	public int anInt4097 = -1;

	@OriginalMember(owner = "client!n", name = "bd", descriptor = "I")
	public int anInt4109 = 255;

	@OriginalMember(owner = "client!n", name = "Zc", descriptor = "B")
	private byte aByte54 = 0;

	@OriginalMember(owner = "client!n", name = "Yc", descriptor = "I")
	public int anInt4107 = 0;

	@OriginalMember(owner = "client!n", name = "dd", descriptor = "B")
	private byte aByte55 = 0;

	@OriginalMember(owner = "client!n", name = "gd", descriptor = "I")
	public int anInt4113 = 0;

	@OriginalMember(owner = "client!n", name = "ad", descriptor = "I")
	public int anInt4108 = 0;

	@OriginalMember(owner = "client!n", name = "cd", descriptor = "I")
	public int anInt4110 = 0;

	@OriginalMember(owner = "client!n", name = "ld", descriptor = "I")
	public int anInt4118 = -1;

	@OriginalMember(owner = "client!n", name = "fd", descriptor = "I")
	public int anInt4112 = -1;

	@OriginalMember(owner = "client!n", name = "pd", descriptor = "I")
	public int anInt4122 = -1;

	@OriginalMember(owner = "client!n", name = "h", descriptor = "(I)Z")
	public boolean method3418() {
		return this.aClass136_1 != null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method3419() {
		return this.aString152;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIZLclient!ii;)Z")
	@Override
	public boolean method5826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class105 arg2) {
		if (this.aClass136_1 == null || !this.method3427(arg2, 65536)) {
			return true;
		}
		@Pc(19) Class31 local19 = arg2.method4304();
		@Pc(24) int local24 = super.aClass212_7.method5609();
		local19.method3179(local24);
		local19.method3187(super.anInt6728, super.anInt6722, super.anInt6726);
		for (@Pc(37) int local37 = 0; super.aClass40Array3.length > local37; local37++) {
			if (super.aClass40Array3[local37] != null) {
				return super.aClass40Array3[local37].method4614(arg0, arg1, local19, true);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIZIZ)V")
	public void method3420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		super.method3401(arg2, arg0, arg3, this.method3402(), arg1);
	}

	@OriginalMember(owner = "client!n", name = "e", descriptor = "(I)Z")
	@Override
	public boolean method5824() {
		return false;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BLclient!nj;)V")
	public void method3421(@OriginalArg(1) Class1_Sub21 arg0) {
		arg0.anInt6611 = 0;
		@Pc(12) int local12 = arg0.method5720();
		@Pc(16) int local16 = local12 & 0x1;
		@Pc(24) boolean local24 = (local12 & 0x2) != 0;
		@Pc(32) boolean local32 = (local12 & 0x4) != 0;
		@Pc(36) int local36 = super.method3402();
		this.method3404((local12 >> 3 & 0x7) + 1);
		this.aByte55 = (byte) (local12 >> 6 & 0x3);
		super.anInt6728 += (this.method3402() - local36) * 64;
		super.anInt6726 += (this.method3402() - local36) * 64;
		this.aByte54 = arg0.method5721();
		this.anInt4094 = arg0.method5721();
		this.anInt4091 = arg0.method5721();
		@Pc(97) int local97 = -1;
		this.anInt4096 = 0;
		@Pc(103) int[] local103 = new int[12];
		@Pc(126) int local126;
		@Pc(132) int local132;
		@Pc(173) int local173;
		for (@Pc(105) int local105 = 0; local105 < 12; local105++) {
			@Pc(111) int local111 = arg0.method5720();
			if (local111 == 0) {
				local103[local105] = 0;
			} else {
				local126 = arg0.method5720();
				local132 = local126 + (local111 << 8);
				if (local105 == 0 && local132 == 65535) {
					local97 = arg0.method5715();
					this.anInt4096 = arg0.method5720();
					break;
				}
				if (local132 >= 32768) {
					local132 = Static15.anIntArray12[local132 - 32768];
					local103[local105] = local132 | 0x40000000;
					local173 = Static348.method5333(local132).anInt2391;
					if (local173 != 0) {
						this.anInt4096 = local173;
					}
				} else {
					local103[local105] = local132 - 256 | Integer.MIN_VALUE;
				}
			}
		}
		@Pc(197) int[] local197 = new int[5];
		for (local126 = 0; local126 < 5; local126++) {
			local132 = arg0.method5720();
			if (local132 < 0 || local132 >= Static259.aShortArrayArray11[local126].length) {
				local132 = 0;
			}
			local197[local126] = local132;
		}
		this.anInt4104 = arg0.method5715();
		this.aString153 = arg0.method5701();
		if (local24) {
			this.aString152 = arg0.method5701();
		} else {
			this.aString152 = this.aString153;
		}
		this.anInt4107 = arg0.method5720();
		if (local32) {
			this.anInt4110 = arg0.method5715();
			this.anInt4108 = this.anInt4107;
			this.anInt4122 = -1;
		} else {
			this.anInt4110 = 0;
			this.anInt4108 = arg0.method5720();
			this.anInt4122 = arg0.method5720();
			if (this.anInt4122 == 255) {
				this.anInt4122 = -1;
			}
		}
		local132 = this.anInt4113;
		this.anInt4113 = arg0.method5720();
		@Pc(321) int local321;
		if (this.anInt4113 == 0) {
			Static103.method1627(this);
		} else {
			local173 = this.anInt4118;
			@Pc(318) int local318 = this.anInt4092;
			local321 = this.anInt4097;
			@Pc(324) int local324 = this.anInt4112;
			@Pc(327) int local327 = this.anInt4109;
			this.anInt4118 = arg0.method5715();
			this.anInt4092 = arg0.method5715();
			this.anInt4097 = arg0.method5715();
			this.anInt4112 = arg0.method5715();
			this.anInt4109 = arg0.method5720();
			if (this.anInt4113 != local132 || local173 != this.anInt4118 || local318 != this.anInt4092 || local321 != this.anInt4097 || local324 != this.anInt4112 || this.anInt4109 != local327) {
				Static126.method2007(this);
			}
		}
		if (this.aClass136_1 == null) {
			this.aClass136_1 = new Class136();
		}
		local173 = this.aClass136_1.anInt3717;
		@Pc(411) int[] local411 = this.aClass136_1.anIntArray351;
		this.aClass136_1.method3151(local16 == 1, local197, local103, this.method3398(), local97);
		if (local97 != local173) {
			super.anInt6728 = super.anIntArray387[0] * 128 + this.method3402() * 64;
			super.anInt6726 = super.anIntArray388[0] * 128 + this.method3402() * 64;
		}
		if (super.anInt4036 == 2047 && local411 != null) {
			for (local321 = 0; local321 < local197.length; local321++) {
				if (local411[local321] != local197[local321]) {
					Static79.method5808();
					break;
				}
			}
		}
		if (super.aClass7_Sub7_6 != null) {
			super.aClass7_Sub7_6.method2819();
		}
		if (super.anInt4034 == -1 || !super.aBoolean307) {
			return;
		}
		@Pc(511) Class118 local511 = this.method3408();
		if (!local511.method2553(super.anInt4034)) {
			super.aBoolean307 = false;
			super.anInt4034 = -1;
			return;
		}
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)I")
	@Override
	public int method3402() {
		return this.aClass136_1 == null || this.aClass136_1.anInt3717 == -1 ? super.method3402() : Static68.method1219(this.aClass136_1.anInt3717).anInt1504;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!ii;IIIILclient!nc;Z)V")
	@Override
	public void method5825(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class10 arg4, @OriginalArg(6) boolean arg5) {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I")
	@Override
	protected int method3398() {
		return this.anInt4104;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(Lclient!ii;I)Lclient!eb;")
	@Override
	public Class7_Sub3 method5821(@OriginalArg(0) Class105 arg0) {
		if (this.aClass136_1 == null || !this.method3427(arg0, 1024)) {
			return null;
		}
		@Pc(19) Class31 local19 = arg0.method4304();
		@Pc(24) int local24 = super.aClass212_7.method5609();
		local19.method3179(local24);
		local19.method3184(super.anInt6728, super.anInt6722, super.anInt6726);
		@Pc(44) float local44 = arg0.method4294();
		@Pc(47) float local47 = arg0.method4222();
		if (Static221.aBoolean375) {
			@Pc(53) Class118 local53 = this.method3408();
			if (local53.aBoolean229 && (this.aClass136_1.anInt3717 == -1 || Static68.method1219(this.aClass136_1.anInt3717).aBoolean107)) {
				@Pc(82) Class177 local82 = super.anInt4026 != -1 && super.anInt4062 == 0 ? Static354.method5863(super.anInt4026) : null;
				@Pc(101) Class177 local101 = super.anInt4034 == -1 || this.aBoolean311 || super.aBoolean307 && local82 != null ? null : Static354.method5863(super.anInt4034);
				@Pc(135) Class40 local135 = Static188.method3337(local24, super.aClass40Array3[0], super.anInt4033, 0, super.aBoolean306, super.anInt4064, local101 == null ? local82 : local101, 240, local101 == null ? super.lb : super.anInt4074, 1, 160, super.anInt4072, arg0, 0);
				if (local135 != null) {
					arg0.method4207(local44, local47 - 128.0F);
					arg0.method4269(false);
					local135.method4587(local19, null, 0);
					arg0.method4269(true);
				}
			}
		}
		if (Static127.aClass10_Sub1_Sub2_Sub2_1 == this) {
			arg0.method4207(local44, local47 - 144.0F);
			local19.method3187(super.anInt6728, super.anInt6722, super.anInt6726);
			for (@Pc(176) int local176 = Static11.aClass65Array4.length - 1; local176 >= 0; local176--) {
				@Pc(182) Class65 local182 = Static11.aClass65Array4[local176];
				if (local182 != null && local182.anInt1586 != -1) {
					@Pc(231) int local231;
					@Pc(220) int local220;
					if (local182.anInt1591 == 1 && local182.anInt1595 >= 0 && Static178.aClass10_Sub1_Sub2_Sub1Array1.length > local182.anInt1595) {
						@Pc(208) Class10_Sub1_Sub2_Sub1 local208 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local182.anInt1595];
						if (local208 != null) {
							local220 = local208.anInt6728 / 32 - Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728 / 32;
							local231 = local208.anInt6726 / 32 - Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726 / 32;
							this.method3423(360000, local182.anInt1586, super.aClass40Array3[0], local19, arg0, local231, local220);
						}
					}
					if (local182.anInt1591 == 2) {
						@Pc(266) int local266 = (local182.anInt1592 - Static92.anInt1755) * 4 + 2 - Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728 / 32;
						local220 = (local182.anInt1596 - Static98.anInt1911) * 4 + 2 - Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726 / 32;
						local231 = local182.anInt1594 * 4;
						local231 *= local231;
						this.method3423(local231, local182.anInt1586, super.aClass40Array3[0], local19, arg0, local220, local266);
					}
					if (local182.anInt1591 == 10 && local182.anInt1595 >= 0 && local182.anInt1595 < Static202.aClass10_Sub1_Sub2_Sub2Array1.length) {
						@Pc(331) Class10_Sub1_Sub2_Sub2 local331 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local182.anInt1595];
						if (local331 != null) {
							local220 = local331.anInt6728 / 32 - Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728 / 32;
							local231 = local331.anInt6726 / 32 - Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726 / 32;
							this.method3423(360000, local182.anInt1586, super.aClass40Array3[0], local19, arg0, local231, local220);
						}
					}
				}
			}
			local19.method3179(local24);
			local19.method3184(super.anInt6728, super.anInt6722, super.anInt6726);
		}
		arg0.method4207(local44, local47);
		@Pc(398) Class7_Sub3 local398 = Static44.method908(super.aClass40Array3.length);
		if (super.aClass7_Sub7_6 == null) {
			arg0.method4289(super.aClass40Array3, local19, local398.aClass7_Sub6Array1, Static127.aClass10_Sub1_Sub2_Sub2_1 == this ? 1 : 0);
		} else {
			@Pc(405) Class153 local405 = super.aClass7_Sub7_6.method2817();
			arg0.method4220(super.aClass40Array3, local405, local19, local398.aClass7_Sub6Array1, Static127.aClass10_Sub1_Sub2_Sub2_1 == this ? 1 : 0);
		}
		this.method3416(super.aClass40Array3, arg0, false);
		if (super.aClass40Array3[2] != null) {
			if (local24 != 0) {
				super.aClass40Array3[2].method4620(local24);
			}
			super.aClass40Array3[2].method4612(super.anInt6728 - super.anInt4080, super.anInt6722 - super.anInt4086, -super.anInt4083 + super.anInt6726);
		}
		return local398;
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)I")
	@Override
	public int method3406() {
		return -1;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IILclient!dc;Lclient!vj;ILclient!ii;II)V")
	private void method3423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class31 arg3, @OriginalArg(5) Class105 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) int local12 = arg6 * arg6 + arg5 * arg5;
		if (local12 < 16 || local12 > arg0) {
			return;
		}
		@Pc(42) int local42 = (int) (Math.atan2((double) arg6, (double) arg5) * 2607.5945876176133D) & 0x3FFF;
		@Pc(61) Class40 local61 = Static124.method1980(super.anInt6728, local42, super.anInt6726, super.anInt4064, super.anInt4033, arg4, arg2, arg1, super.anInt6722, super.anInt4072);
		if (local61 != null) {
			arg4.method4269(false);
			local61.method4587(arg3, null, 0);
			arg4.method4269(true);
		}
	}

	@OriginalMember(owner = "client!n", name = "f", descriptor = "(I)I")
	@Override
	public int method5829() {
		return super.anInt4059;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(IZ)Ljava/lang/String;")
	public String method3424() {
		@Pc(14) String local14 = "";
		if (Static4.aStringArray1 != null) {
			local14 = local14 + Static4.aStringArray1[this.aByte55];
		}
		if (Static53.anIntArray94 != null && Static53.anIntArray94[this.aByte55] != -1) {
			@Pc(43) Class1_Sub2_Sub4 local43 = Static106.method1653(Static53.anIntArray94[this.aByte55]);
			if (local43.aChar2 == 's') {
				local14 = local14 + local43.method1535(this.aByte54 & 0xFF);
			} else {
				Static268.method4816("gdn1", new Throwable());
				Static53.anIntArray94[this.aByte55] = -1;
			}
		}
		local14 = local14 + this.aString153;
		if (Static22.aStringArray4 != null) {
			local14 = local14 + Static22.aStringArray4[this.aByte55];
		}
		return local14;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!ii;)V")
	@Override
	public void method5822(@OriginalArg(1) Class105 arg0) {
		if (this.aClass136_1 != null && (super.aBoolean310 || this.method3427(arg0, 0))) {
			this.method3416(super.aClass40Array3, arg0, super.aBoolean310);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
	@Override
	public void method5819() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!ii;I)Z")
	private boolean method3427(@OriginalArg(1) Class105 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1;
		@Pc(11) Class118 local11 = this.method3408();
		@Pc(26) Class177 local26 = super.anInt4026 != -1 && super.anInt4062 == 0 ? Static354.method5863(super.anInt4026) : null;
		@Pc(46) Class177 local46 = super.anInt4034 == -1 || this.aBoolean311 || super.aBoolean307 && local26 != null ? null : Static354.method5863(super.anInt4034);
		@Pc(49) int local49 = local11.anInt2986;
		@Pc(52) int local52 = local11.anInt2958;
		if (local49 != 0 || local52 != 0 || local11.anInt2959 != 0 || local11.anInt2975 != 0) {
			arg1 |= 0x7;
		}
		super.aClass40Array3[0] = this.aClass136_1.method3145(arg0, super.anInt4030, local46, super.lb, arg1, super.aClass138Array3, super.anInt4027, local26, super.anInt4020, super.anInt4074, super.anInt4039);
		@Pc(102) int local102 = Static94.method1477();
		if (Static267.anInt5492 < 96 && local102 > 50) {
			Static344.method5768();
		}
		@Pc(121) int local121;
		if (Static254.anInt5234 != 0 && local102 < 50) {
			local121 = 50 - local102;
			while (local121 > Static303.anInt6079) {
				Static172.aByteArrayArray11[Static303.anInt6079] = new byte[102400];
				Static303.anInt6079++;
			}
			while (Static303.anInt6079 > local121) {
				Static303.anInt6079--;
				Static172.aByteArrayArray11[Static303.anInt6079] = null;
			}
		} else if (Static254.anInt5234 != 0) {
			Static172.aByteArrayArray11 = new byte[50][];
			Static303.anInt6079 = 0;
		}
		if (super.aClass40Array3[0] == null) {
			return false;
		}
		super.anInt4059 = super.aClass40Array3[0].method4572();
		this.method3397(super.aClass40Array3[0]);
		local121 = super.aClass212_7.method5609();
		super.anInt4072 = 0;
		super.anInt4064 = 0;
		super.anInt4033 = 0;
		if (local49 == 0 && local52 == 0) {
			this.method3403(local121, this.method3402() << 7, this.method3402() << 7);
		} else {
			this.method3403(local121, local52, local49);
			if (super.anInt4064 != 0) {
				super.aClass40Array3[0].method4591(super.anInt4064);
			}
			if (super.anInt4033 != 0) {
				super.aClass40Array3[0].method4583(super.anInt4033);
			}
			if (super.anInt4072 != 0) {
				super.aClass40Array3[0].method4612(0, super.anInt4072, 0);
			}
		}
		super.aClass40Array3[1] = null;
		if (!this.aBoolean311 && super.anInt4058 != -1 && super.anInt4038 != -1) {
			@Pc(293) Class162 local293 = Static264.method4763(super.anInt4058);
			@Pc(312) Class40 local312 = local293.method4328(local7 | (local293.aBoolean395 ? 7 : 2), arg0, super.anInt4018, super.anInt4013, super.anInt4038);
			if (local312 != null) {
				local312.method4612(0, -super.anInt4070, 0);
				if (local293.aBoolean395 && (local49 != 0 || local52 != 0)) {
					if (super.anInt4064 != 0) {
						local312.method4591(super.anInt4064);
					}
					if (super.anInt4033 != 0) {
						local312.method4583(super.anInt4033);
					}
					if (super.anInt4072 != 0) {
						local312.method4612(0, super.anInt4072, 0);
					}
				}
				super.aClass40Array3[1] = local312;
			}
		}
		super.aClass40Array3[2] = null;
		if (!this.aBoolean311 && super.anInterface4_3 != null) {
			if (Static282.anInt3516 >= super.anInt4079) {
				super.anInterface4_3 = null;
			}
			if (super.anInt4077 <= Static282.anInt3516 && Static282.anInt3516 < super.anInt4079) {
				@Pc(405) Class40 local405 = super.anInterface4_3.method5448(local7 | 0x7, arg0);
				if (local405 != null) {
					local405.method4612(-super.anInt6728 + super.anInt4080, -super.anInt6722 + super.anInt4086, super.anInt4083 - super.anInt6726);
					if (local121 != 0) {
						local405.method4620(-local121 & 0x3FFF);
					}
					super.aClass40Array3[2] = local405;
				}
			}
		}
		return true;
	}
}
